package com.rahuljanagouda.statusstories.sample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SwitchCompat;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

import com.rahuljanagouda.statusstories.StatusStoriesActivity;

public class MainActivity extends AppCompatActivity {

    boolean isCacheEnabled = false;
    boolean isImmersiveEnabled = false;
    boolean isTextEnabled = false;
    long storyDuration = 3000L;

    private final String[] resources = new String[]{
            "https://firebasestorage.googleapis.com/v0/b/firebase-satya.appspot.com/o/images%2Fi00001.jpg?alt=media&token=460667e4-e084-4dc5-b873-eefa028cec32",
            "https://firebasestorage.googleapis.com/v0/b/firebase-satya.appspot.com/o/images%2Fi00002.jpg?alt=media&token=e8e86192-eb5d-4e99-b1a8-f00debcdc016",
            "https://firebasestorage.googleapis.com/v0/b/firebase-satya.appspot.com/o/images%2Fi00004.jpg?alt=media&token=af71cbf5-4be3-4f8a-8a2b-2994bce38377",
            "https://firebasestorage.googleapis.com/v0/b/firebase-satya.appspot.com/o/images%2Fi00005.jpg?alt=media&token=7d179938-c419-44f4-b965-1993858d6e71",
            "https://firebasestorage.googleapis.com/v0/b/firebase-satya.appspot.com/o/images%2Fi00006.jpg?alt=media&token=cdd14cf5-6ed0-4fb7-95f5-74618528a48b",
            "https://firebasestorage.googleapis.com/v0/b/firebase-satya.appspot.com/o/images%2Fi00007.jpg?alt=media&token=98524820-6d7c-4fb4-89b1-65301e1d6053",
            "https://firebasestorage.googleapis.com/v0/b/firebase-satya.appspot.com/o/images%2Fi00008.jpg?alt=media&token=7ef9ed49-3221-4d49-8fb4-2c79e5dab333",
            "https://firebasestorage.googleapis.com/v0/b/firebase-satya.appspot.com/o/images%2Fi00009.jpg?alt=media&token=00d56a11-7a92-4998-a05a-e1dd77b02fe4",
            "https://firebasestorage.googleapis.com/v0/b/firebase-satya.appspot.com/o/images%2Fi00010.jpg?alt=media&token=24f8f091-acb9-432a-ae0f-7e6227d18803",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ((SwitchCompat) findViewById(R.id.isCacheEnabled)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                isCacheEnabled = b;
            }
        });

        ((SwitchCompat) findViewById(R.id.isImmersiveEnabled)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                isImmersiveEnabled = b;
            }
        });

        ((SwitchCompat) findViewById(R.id.isTextEnabled)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                isTextEnabled = b;
            }
        });

        ((SeekBar) findViewById(R.id.seekbar)).setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                storyDuration = i < 4 ? 3 * 1000L : i * 1000L;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        findViewById(R.id.storyTime).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(view.getContext(), StatusStoriesActivity.class);
                a.putExtra(StatusStoriesActivity.STATUS_RESOURCES_KEY, resources);
                a.putExtra(StatusStoriesActivity.STATUS_DURATION_KEY, storyDuration);
                a.putExtra(StatusStoriesActivity.IS_IMMERSIVE_KEY, isImmersiveEnabled);
                a.putExtra(StatusStoriesActivity.IS_CACHING_ENABLED_KEY, isCacheEnabled);
                a.putExtra(StatusStoriesActivity.IS_TEXT_PROGRESS_ENABLED_KEY, isTextEnabled);
                startActivity(a);
            }
        });

    }
}
