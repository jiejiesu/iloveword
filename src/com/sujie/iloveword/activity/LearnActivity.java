package com.sujie.iloveword.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.sujie.iloveword.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 学习认字窗口.
 * <p/>
 * User: sujie
 * Date: 12-1-2
 * Time: AM12:17
 */
public class LearnActivity extends Activity implements View.OnTouchListener {
    FrameLayout blackboard;
    TextView word;
    TextView sentence;
    ImageButton learnBtn;
    ImageButton listenBtn;
    ImageButton testBtn;
    ImageButton settingBtn;
    Map<String, Integer> wordLocationMap = new HashMap<String, Integer>();
    List<Integer> wordVoiceList = new ArrayList<Integer>();
    List<Integer> sentenceVoiceList = new ArrayList<Integer>();
    List<String> wordList = new ArrayList<String>();
    List<String> sentenceList = new ArrayList<String>();
    GestureDetector mGestureDetector;
    int currentLocation = 0;
    ImageView talker;

    private void initWordVoice() {
        wordList.add(getString(R.string.wo));
        wordList.add(getString(R.string.ni));
        wordList.add(getString(R.string.xiao));
        wordList.add(getString(R.string.zhen));
        wordList.add(getString(R.string.qi));
        wordList.add(getString(R.string.guai));
        wordList.add(getString(R.string.tai));
        wordList.add(getString(R.string.yang));
        wordList.add(getString(R.string.mei));
        wordList.add(getString(R.string.shai));
        wordList.add(getString(R.string.da));
        wordList.add(getString(R.string.yu));
        wordList.add(getString(R.string.mei));
        wordList.add(getString(R.string.xia));
        wordList.add(getString(R.string.lao));
        wordList.add(getString(R.string.cheng));
        wordList.add(getString(R.string.zhe));
        wordList.add(getString(R.string.san));
        wordList.add(getString(R.string.gan));
        wordList.add(getString(R.string.sha));
        wordList.add(getString(R.string.mo));
        wordList.add(getString(R.string.gu));

        sentenceList.add(getString(R.string.sentence_wo));
        sentenceList.add(getString(R.string.sentence_ni));
        sentenceList.add(getString(R.string.sentence_xiao));
        sentenceList.add(getString(R.string.sentence_zhen));
        sentenceList.add(getString(R.string.sentence_qi));
        sentenceList.add(getString(R.string.sentence_guai));
        sentenceList.add(getString(R.string.sentence_tai));
        sentenceList.add(getString(R.string.sentence_yang));
        sentenceList.add(getString(R.string.sentence_mei));
        sentenceList.add(getString(R.string.sentence_shai));
        sentenceList.add(getString(R.string.sentence_da));
        sentenceList.add(getString(R.string.sentence_yu));
        sentenceList.add(getString(R.string.sentence_mei));
        sentenceList.add(getString(R.string.sentence_xia));
        sentenceList.add(getString(R.string.sentence_lao));
        sentenceList.add(getString(R.string.sentence_cheng));
        sentenceList.add(getString(R.string.sentence_zhe));
        sentenceList.add(getString(R.string.sentence_san));
        sentenceList.add(getString(R.string.sentence_gan));
        sentenceList.add(getString(R.string.sentence_sha));
        sentenceList.add(getString(R.string.sentence_mo));
        sentenceList.add(getString(R.string.sentence_gu));

        wordVoiceList.add(R.raw.wo);
        wordVoiceList.add(R.raw.ni);
        wordVoiceList.add(R.raw.xiao);
        wordVoiceList.add(R.raw.zhen);
        wordVoiceList.add(R.raw.qi);
        wordVoiceList.add(R.raw.guai);
        wordVoiceList.add(R.raw.tai);
        wordVoiceList.add(R.raw.yang);
        wordVoiceList.add(R.raw.mei);
        wordVoiceList.add(R.raw.shai);
        wordVoiceList.add(R.raw.da);
        wordVoiceList.add(R.raw.yu);
        wordVoiceList.add(R.raw.mei);
        wordVoiceList.add(R.raw.xia);
        wordVoiceList.add(R.raw.lao);
        wordVoiceList.add(R.raw.cheng);
        wordVoiceList.add(R.raw.zhe);
        wordVoiceList.add(R.raw.san);
        wordVoiceList.add(R.raw.gan);
        wordVoiceList.add(R.raw.sha);
        wordVoiceList.add(R.raw.mo);
        wordVoiceList.add(R.raw.gu);

        sentenceVoiceList.add(R.raw.sentence_wo);
        sentenceVoiceList.add(R.raw.sentence_ni);
        sentenceVoiceList.add(R.raw.sentence_xiao);
        sentenceVoiceList.add(R.raw.sentence_zhen);
        sentenceVoiceList.add(R.raw.sentence_qi);
        sentenceVoiceList.add(R.raw.sentence_guai);
        sentenceVoiceList.add(R.raw.sentence_tai);
        sentenceVoiceList.add(R.raw.sentence_yang);
        sentenceVoiceList.add(R.raw.sentence_mei);
        sentenceVoiceList.add(R.raw.sentence_shai);
        sentenceVoiceList.add(R.raw.sentence_da);
        sentenceVoiceList.add(R.raw.sentence_yu);
        sentenceVoiceList.add(R.raw.sentence_mei);
        sentenceVoiceList.add(R.raw.sentence_xia);
        sentenceVoiceList.add(R.raw.sentence_lao);
        sentenceVoiceList.add(R.raw.sentence_cheng);
        sentenceVoiceList.add(R.raw.sentence_zhe);
        sentenceVoiceList.add(R.raw.sentence_san);
        sentenceVoiceList.add(R.raw.sentence_gan);
        sentenceVoiceList.add(R.raw.sentence_sha);
        sentenceVoiceList.add(R.raw.sentence_mo);
        sentenceVoiceList.add(R.raw.sentence_gu);

        wordLocationMap.put(getString(R.string.wo), 0);
        wordLocationMap.put(getString(R.string.ni), 1);
        wordLocationMap.put(getString(R.string.xiao), 2);
        wordLocationMap.put(getString(R.string.zhen), 3);
        wordLocationMap.put(getString(R.string.qi), 4);
        wordLocationMap.put(getString(R.string.guai), 5);
        wordLocationMap.put(getString(R.string.tai), 6);
        wordLocationMap.put(getString(R.string.yang), 7);
        wordLocationMap.put(getString(R.string.mei), 8);
        wordLocationMap.put(getString(R.string.shai), 9);
        wordLocationMap.put(getString(R.string.da), 10);
        wordLocationMap.put(getString(R.string.yu), 11);
        wordLocationMap.put(getString(R.string.mei), 12);
        wordLocationMap.put(getString(R.string.xia), 13);
        wordLocationMap.put(getString(R.string.lao), 14);
        wordLocationMap.put(getString(R.string.cheng), 15);
        wordLocationMap.put(getString(R.string.zhe), 16);
        wordLocationMap.put(getString(R.string.san), 17);
        wordLocationMap.put(getString(R.string.gan), 18);
        wordLocationMap.put(getString(R.string.sha), 19);
        wordLocationMap.put(getString(R.string.mo), 20);
        wordLocationMap.put(getString(R.string.gu), 21);
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn);

        initWordVoice();

        blackboard = (FrameLayout) findViewById(R.id.blackboard);
        word = (TextView) findViewById(R.id.word);
        sentence = (TextView) findViewById(R.id.sentence);
        talker = (ImageView) findViewById(R.id.talker);

        learnBtn = (ImageButton) findViewById(R.id.learn_btn);
        listenBtn = (ImageButton) findViewById(R.id.listen_btn);
        testBtn = (ImageButton) findViewById(R.id.test_btn);
        settingBtn = (ImageButton) findViewById(R.id.setting_btn);

        word.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int location = wordLocationMap.get(word.getText());

                SystemUtil.playSound(LearnActivity.this, wordVoiceList.get(location));
            }
        });
        sentence.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int location = wordLocationMap.get(word.getText());

                SystemUtil.playSound(LearnActivity.this, sentenceVoiceList.get(location));
            }
        });
        talker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int location = wordLocationMap.get(word.getText());

                SystemUtil.playSound(LearnActivity.this, sentenceVoiceList.get(location));
            }
        });

        mGestureDetector = new GestureDetector(new DefaultGestureDetector());
//        ((FrameLayout) word.getParent().getParent()).setOnTouchListener(this);
        word.setOnTouchListener(this);

        testBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = getIntent();
                i.setClass(LearnActivity.this, TestActivity.class);
                startActivity(i);
            }
        });

        SystemUtil.playSound(LearnActivity.this, R.raw.wo);
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        SystemUtil.releaseMediaPlayer();
    }

    public static void actionLaunch() {
        //To change body of created methods use File | Settings | File Templates.
    }


    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return mGestureDetector.onTouchEvent(motionEvent);
    }

    class DefaultGestureDetector extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {
        final int FLING_MIN_DISTANCE = 30;//X或者y轴上移动的距离(像素)
        final int FLING_MIN_VELOCITY = 50;//x或者y轴上的移动速度(像素/秒)

        @Override
        public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
            // OnGestureListener will analyzes the given motion event
            return mGestureDetector.onTouchEvent(motionEvent);
        }

        // 用户（轻触触摸屏后）松开，由一个1个MotionEvent ACTION_UP触发
        @Override
        public boolean onSingleTapUp(MotionEvent e) {
//            String wordStr = word.getText().toString();
//            int location = wordLocationMap.get(wordStr);
//
//            playSound(wordVoiceList.get(location));
            return false;
        }

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            if ((e1.getX() - e2.getX()) > FLING_MIN_DISTANCE && Math.abs(velocityX) > FLING_MIN_VELOCITY) {//向左
                word.setText(getPreviousWord());
                sentence.setText(sentenceList.get(currentLocation));
//                playSound(wordVoiceList.get(currentLocation));

            } else if ((e2.getX() - e1.getX()) > FLING_MIN_DISTANCE && Math.abs(velocityX) > FLING_MIN_VELOCITY) { //向右滑动
                word.setText(getNextWord());
                sentence.setText(sentenceList.get(currentLocation));
//                playSound(wordVoiceList.get(currentLocation));
            }
            return false;
        }
    }

    private CharSequence getPreviousWord() {
        if (currentLocation > 0) {
            currentLocation--;
        } else {
            currentLocation = wordList.size() - 1;
        }
        return wordList.get(currentLocation);
    }

    private CharSequence getNextWord() {
        if (currentLocation < wordList.size() - 1) {
            currentLocation++;
        } else {
            currentLocation = 0;
        }
        return wordList.get(currentLocation);
    }

}