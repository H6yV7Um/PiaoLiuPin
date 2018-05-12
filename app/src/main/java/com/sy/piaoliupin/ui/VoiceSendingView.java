package com.sy.piaoliupin.ui;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.sy.piaoliupin.R;


/**
 * 发送语音提示控件
 */
public class VoiceSendingView extends RelativeLayout {


    private AnimationDrawable frameAnimation;

    public VoiceSendingView(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.voice_sending, this);
        ImageView img = findViewById(R.id.microphone);
        img.setBackgroundResource(R.drawable.animation_voice);
        frameAnimation = (AnimationDrawable) img.getBackground();

    }

    public void showRecording() {
        frameAnimation.start();
    }

    public void showCancel() {
        frameAnimation.stop();
    }

    public void release() {
        frameAnimation.stop();
    }
}
