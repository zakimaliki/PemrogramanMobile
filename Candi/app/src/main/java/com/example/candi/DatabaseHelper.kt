package com.example.candi

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import androidx.core.content.contentValuesOf

class DatabaseHelper (context: Context?) : SQLiteOpenHelper(context, DATABASE_NAME, null,DB_VERSION){
    override fun onCreate(db: SQLiteDatabase) {
        db.execSQL(CREAT_TABLE_USER)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {
        db.execSQL("DROP TABLE IF EXISTS $TABLE_USER")
        onCreate(db)
    }

    fun insertUser(user: String?, pass:String?):Boolean{
        val db: SQLiteDatabase
        db = this.writableDatabase
        val contentValues = ContentValues()
        contentValues.put(COL_USERNAME, user)
        contentValues.put(COL_PASSWORD, pass)
        val result = db.insert(TABLE_USER,null,contentValues)
        return if (result==-1L) {
            false
        }else{
            true
        }
    }

    fun getUser(user: String?,pass: String?): Cursor {
        val db = this.writableDatabase
        val query = "SELECT*FROM " + TABLE_USER + " WHERE " + COL_USERNAME + "='" + user +"' AND " +
                COL_PASSWORD + "='" + pass +"'"
        return db.rawQuery(query , null)
    }

    companion object{
        private const val TAG = "DataBaseHelper"
        private const val DB_VERSION=2
        private const val DATABASE_NAME="Wisata"
        private const val TABLE_USER ="user"
        private const val COL_USERNAME="username"
        private const val COL_PASSWORD="password"
        private const val CREAT_TABLE_USER = "CREATE TABLE "+ TABLE_USER + "( " +
                COL_USERNAME + " TEXT, " + COL_PASSWORD + " TEXT);"
    }
}