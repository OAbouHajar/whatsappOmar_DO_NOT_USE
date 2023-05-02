package com.OM7753.res;

import android.view.View;
import com.OM7753.GOLD;
import com.obwhatsapp.Conversation;

/* compiled from: OnCustomPicker */
public class resfirst implements View.OnClickListener {
    Conversation activity;

    public resfirst(Conversation conversation) {
        this.activity = conversation;
    }

    public void onClick(View view) {
        GOLD.AFM(this.activity);
    }
}
