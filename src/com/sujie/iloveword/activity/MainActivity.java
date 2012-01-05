package com.sujie.iloveword.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import com.sujie.iloveword.R;

public class MainActivity extends Activity {
    ImageButton word100Btn;
    ImageButton word300Btn;
    ImageButton word600Btn;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        word100Btn = (ImageButton) findViewById(R.id.word100);
        word300Btn = (ImageButton) findViewById(R.id.word300);
        word600Btn = (ImageButton) findViewById(R.id.word600);

        word100Btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent i = getIntent();
                i.setClass(MainActivity.this, LearnActivity.class);
                startActivity(i);
            }
        });
    }
}
