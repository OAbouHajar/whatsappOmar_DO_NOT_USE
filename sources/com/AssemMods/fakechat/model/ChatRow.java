package com.AssemMods.fakechat.model;

import android.widget.TextView;
import com.AssemMods.fakechat.utils.CircleImageView;

public class ChatRow {
    private CircleImageView mImage;
    private TextView mLastMessage;
    private TextView mName;
    private TextView mTime;

    public ChatRow(CircleImageView circleImageView, TextView textView, TextView textView2, TextView textView3) {
        this.mImage = circleImageView;
        this.mName = textView;
        this.mLastMessage = textView2;
        this.mTime = textView3;
    }

    public CircleImageView getImage() {
        return this.mImage;
    }

    public TextView getLastMessage() {
        return this.mLastMessage;
    }

    public TextView getName() {
        return this.mName;
    }

    public TextView getTime() {
        return this.mTime;
    }
}
