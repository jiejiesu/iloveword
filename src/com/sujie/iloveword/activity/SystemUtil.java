package com.sujie.iloveword.activity;

import android.app.Service;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Vibrator;

import java.io.FileDescriptor;
import java.io.IOException;

/**
 * 系统相关的通用方法工具类.
 * User: sujie
 * Date: 12-1-2
 * Time: AM11:15
 */
public class SystemUtil {
    private static MediaPlayer mediaPlayer;

    //产生震动
    public static void playVibrator(Context context, long timeLength) {
        Vibrator vib = (Vibrator) context.getSystemService(Service.VIBRATOR_SERVICE);
        vib.vibrate(timeLength);
    }


    //播放声音
    public static void playSound(Context context,int voiceId) {
        if (mediaPlayer == null) {
            mediaPlayer = MediaPlayer.create(context, voiceId);
        }
        
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer player) {
                releaseMediaPlayer();
            }
        });
        mediaPlayer.start();
    }

    //获取声音文件
    public static FileDescriptor getAssetsFile(Context context, String filename) {
        AssetFileDescriptor assetFileDescriptor = null;

        try {
            assetFileDescriptor = context.getResources().getAssets().openFd(filename);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }


        if (assetFileDescriptor != null) {
            return assetFileDescriptor.getFileDescriptor();
        } else {
            return null;
        }

    }

    //释放播放器资源
    public static void releaseMediaPlayer() {
        if (mediaPlayer != null) {
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
}
