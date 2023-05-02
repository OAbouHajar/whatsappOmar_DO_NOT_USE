package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* renamed from: X.4gq  reason: invalid class name and case insensitive filesystem */
public final class C92004gq implements Handler.Callback, Choreographer.FrameCallback {
    public static final C92004gq A05 = new C92004gq();
    public int A00;
    public Choreographer A01;
    public final Handler A02;
    public final HandlerThread A03;
    public volatile long A04 = -9223372036854775807L;

    public C92004gq() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        this.A03 = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper(), this);
        this.A02 = handler;
        handler.sendEmptyMessage(0);
    }

    public void doFrame(long j2) {
        this.A04 = j2;
        this.A01.postFrameCallbackDelayed(this, 500);
    }

    public boolean handleMessage(Message message) {
        int i2 = message.what;
        if (i2 != 0) {
            if (i2 == 1) {
                int i3 = this.A00 + 1;
                this.A00 = i3;
                if (i3 == 1) {
                    this.A01.postFrameCallback(this);
                }
            } else if (i2 != 2) {
                return false;
            } else {
                int i4 = this.A00 - 1;
                this.A00 = i4;
                if (i4 == 0) {
                    this.A01.removeFrameCallback(this);
                    this.A04 = -9223372036854775807L;
                    return true;
                }
            }
            return true;
        }
        this.A01 = Choreographer.getInstance();
        return true;
    }
}
