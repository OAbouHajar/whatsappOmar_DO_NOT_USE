package com.mod.bomfab.bomb;

import android.os.Handler;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;

public abstract class OnContinuousClickListener implements View.OnLongClickListener {
    /* access modifiers changed from: private */
    public static final int WHAT = 12345;
    /* access modifiers changed from: private */
    public final int delay;
    /* access modifiers changed from: private */
    public final Handler handler;

    public OnContinuousClickListener() {
        this.delay = 100;
        this.handler = new Handler();
    }

    public OnContinuousClickListener(int i2) {
        this.delay = i2;
        this.handler = new Handler();
    }

    public abstract void onContinuousClick(View view);

    public boolean onLongClick(View view) {
        view.setOnTouchListener(new View.OnTouchListener(this) {
            private final OnContinuousClickListener this$0;

            {
                this.this$0 = r1;
            }

            static OnContinuousClickListener access$0(AnonymousClass100000000 r1) {
                return r1.this$0;
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() != 1) {
                    return false;
                }
                this.this$0.handler.removeMessages(12345);
                return false;
            }
        });
        this.handler.post(new Runnable(this, view) {
            private final OnContinuousClickListener this$0;
            private final View val$v;

            {
                this.this$0 = r1;
                this.val$v = r2;
            }

            static OnContinuousClickListener access$0(AnonymousClass100000001 r1) {
                return r1.this$0;
            }

            public void run() {
                this.this$0.onContinuousClick(this.val$v);
                Message obtain = Message.obtain(this.this$0.handler, this);
                obtain.what = 12345;
                this.this$0.handler.sendMessageDelayed(obtain, (long) this.this$0.delay);
            }
        });
        return true;
    }
}
