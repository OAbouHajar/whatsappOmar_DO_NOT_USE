package com.mod.libs;

public class TThread {
    /* access modifiers changed from: private */
    public OnThreadEvent procThread;

    public interface OnThreadEvent {
        void onThread(String str);
    }

    public TThread(OnThreadEvent onThreadEvent) {
        this.procThread = onThreadEvent;
    }

    public void DoThread(final String str) {
        new Thread(new Runnable() {
            public void run() {
                TThread.this.procThread.onThread(str);
            }
        }).start();
    }
}
