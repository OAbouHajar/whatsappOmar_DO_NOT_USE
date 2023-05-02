package com.mod2.libs;

import android.os.Handler;

public class TTimer {
    /* access modifiers changed from: private */
    public OnTimerEvent procTimer;
    long timeInMilliseconds = 0;
    private Handler timerHandler = new Handler();
    /* access modifiers changed from: private */
    public String timerID;
    private long timerInterval;
    private Runnable timerThread = new Runnable() {
        public void run() {
            TTimer.this.procTimer.onTimer(TTimer.this.timerID);
            TTimer.this.StartTimer();
        }
    };
    private Runnable timerThreadOnce = new Runnable() {
        public void run() {
            TTimer.this.procTimer.onTimer(TTimer.this.timerID);
        }
    };

    public interface OnTimerEvent {
        void onTimer(String str);
    }

    public TTimer(OnTimerEvent onTimerEvent) {
        this.procTimer = onTimerEvent;
    }

    public void InitTimer(String str, long j2) {
        this.timerID = str;
        this.timerInterval = j2;
    }

    public void StartTimer() {
        this.timerHandler.removeCallbacks(this.timerThread);
        this.timerHandler.postDelayed(this.timerThread, this.timerInterval);
    }

    public void StartTimerOnce() {
        this.timerHandler.removeCallbacks(this.timerThreadOnce);
        this.timerHandler.postDelayed(this.timerThreadOnce, this.timerInterval);
    }

    public void StopTimer() {
        this.timerHandler.removeCallbacks(this.timerThread);
    }
}
