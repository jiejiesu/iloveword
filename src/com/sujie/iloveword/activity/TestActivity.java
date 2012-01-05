package com.sujie.iloveword.activity;

import android.app.Activity;
import android.os.Bundle;
import com.sujie.iloveword.R;

import java.util.Random;

/**
 * 测试窗口.
 * <p/>
 * User: sujie
 * Date: 12-1-2
 * Time: PM8:52
 */
public class TestActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

//        SystemUtil.playSound(this, getQuestionByRandom());
    }

    public int getQuestionByRandom() {
        int random = new Random().nextInt(4);
       return 0;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        SystemUtil.releaseMediaPlayer();
    }
}