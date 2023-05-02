package com.AssemMods.fakechat.model;

import android.widget.TextView;

public class ConversationRow {
    private TextView mMessage;
    private TextView mTime;

    public ConversationRow(TextView textView, TextView textView2) {
        this.mMessage = textView;
        this.mTime = textView2;
    }

    public TextView getMessage() {
        return this.mMessage;
    }

    public TextView getTime() {
        return this.mTime;
    }
}
