package com.example.abc.explosion;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;


public class Main extends Activity {

    private AnimationDrawable animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = (ImageView) findViewById(R.id.frames);
        imageView.setBackgroundResource(R.drawable.view_animation);
        animation = (AnimationDrawable) imageView.getBackground();
    }

    @Override
    protected void onPause(){
        super.onPause();
        if (animation.isRunning()){
            animation.stop();
        }
    }

    @Override
    public void onWindowFocusChanged(boolean focus){
        super.onWindowFocusChanged(focus);
        if (focus){
            animation.start();
        }
    }

}
