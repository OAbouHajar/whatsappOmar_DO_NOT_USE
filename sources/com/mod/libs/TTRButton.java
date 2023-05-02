package com.mod.libs;

import android.content.Context;
import android.view.View;

public class TTRButton {
    private TTR TR;
    public View.OnClickListener onClickListener = new View.OnClickListener() {
        public void onClick(View view) {
            TTRButton.this.procButtonClick.onButtonClick(view);
        }
    };
    /* access modifiers changed from: private */
    public OnButtonClickEvent procButtonClick;

    public interface OnButtonClickEvent {
        void onButtonClick(View view);
    }

    public TTRButton(Context context, OnButtonClickEvent onButtonClickEvent) {
        this.TR = new TTR(context);
        this.procButtonClick = onButtonClickEvent;
    }

    public View InitButton(String str) {
        View InitView = this.TR.InitView(str);
        InitView.setOnClickListener(this.onClickListener);
        return InitView;
    }
}
