package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStory;
    private Button mTopButton;
    private Button mBottomButton;
    private int mIndex;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStory = findViewById(R.id.storyTextView);
        mTopButton = (Button) findViewById(R.id.buttonTop);
        mBottomButton = (Button) findViewById(R.id.buttonBottom);
        mIndex = 1;
        advanceStory(mIndex);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mIndex == 1) {
                    mIndex = 3;
                    advanceStory(mIndex);
                } else if (mIndex == 2) {
                    mIndex = 3;
                    advanceStory(mIndex);
                } else if (mIndex == 3) {
                    mIndex = 6;
                    advanceStory(mIndex);
                }

            }
        });




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mBottomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mIndex == 1) {
                    mIndex = 2;
                    advanceStory(mIndex);
                } else if (mIndex == 2) {
                    mIndex = 4;
                    advanceStory(mIndex);
                } else if (mIndex == 3) {
                    mIndex = 5;
                    advanceStory(mIndex);
                }

            }
        });


    }

    private void advanceStory(int mIndex) {

        if (mIndex == 1) {
            mStory.setText(R.string.T1_Story);
            mTopButton.setText(R.string.T1_Ans1);
            mBottomButton.setText(R.string.T1_Ans2);
        } else if (mIndex == 2) {
            mStory.setText(R.string.T2_Story);
            mTopButton.setText(R.string.T2_Ans1);
            mBottomButton.setText(R.string.T2_Ans2);
        } else if (mIndex == 3) {
            mStory.setText(R.string.T3_Story);
            mTopButton.setText(R.string.T3_Ans1);
            mBottomButton.setText(R.string.T3_Ans2);
        } else if (mIndex == 4) {
            mStory.setText(R.string.T4_End);
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);
        } else if (mIndex == 5) {
            mStory.setText(R.string.T5_End);
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);
        } else if (mIndex == 6) {
            mStory.setText(R.string.T6_End);
            mTopButton.setVisibility(View.GONE);
            mBottomButton.setVisibility(View.GONE);
        }
    }
}
