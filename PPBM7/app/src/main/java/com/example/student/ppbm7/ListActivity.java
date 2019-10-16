package com.example.student.ppbm7;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class ListActivity extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
// TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
//mengakses content provider
        ContentResolver cr = getContentResolver();
//query data dari content provider
        Cursor c = cr.query(Settings.System.CONTENT_URI,
                null, null, null, null);
//menunjukkan ke isi data
        startManagingCursor(c);
//tampilan (layout) listview
        ListView daftar = (ListView) findViewById(R.id.listView1);
//format isi data
        String[] from = {Settings.System.NAME, Settings.System.VALUE};
//format menampilkan data
        int[] to = {android.R.id.text1, android.R.id.text2};
//adapter
        SimpleCursorAdapter adapter = new SimpleCursorAdapter(this,
                android.R.layout.simple_list_item_2, c, from, to);
//ditampilkan
        daftar.setAdapter(adapter);
    }
}
