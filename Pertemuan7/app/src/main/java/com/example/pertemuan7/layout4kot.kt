package com.example.pertemuan7

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.layout4.*

class layout4kot : AppCompatActivity() {
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout4)
        var MediaPlayer: MediaPlayer?=MediaPlayer.create(this, R.raw.fancy)

        //button play
        btn_play.setOnClickListener({
            MediaPlayer?.start()
        })
        //button pause
        btn_pause.setOnClickListener({
            MediaPlayer?.pause()
        })
        //button stop
        btn_stop.setOnClickListener({
            MediaPlayer?.pause()
            MediaPlayer?.seekTo(0)
        })

    }
}