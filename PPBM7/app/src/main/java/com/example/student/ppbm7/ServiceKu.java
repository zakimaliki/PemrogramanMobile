package com.example.student.ppbm7;

import java.io.IOException;
import android.app.Service;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.content.Intent;

public class ServiceKu extends Service {
    MediaPlayer musik;

    public IBinder onBind(Intent intent){
        //TODO Auto-generated method stub
        return null;
    }

    public void onCreate() {
    }

    public void onStart(Intent intent, int startId) {
// TODO Auto-generated method stub
        musik = MediaPlayer.create(this, R.raw.guns);
        try {
            musik.prepare();
        } catch (IllegalStateException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
        musik.start();
    }

    public void onDestroy() {
// TODO Auto-generated method stub
        musik.stop();
    }
}
