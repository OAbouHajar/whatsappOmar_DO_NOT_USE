package X;

import android.media.AudioTrack;
import android.os.Handler;
import com.facebook.redex.IDxExecutorShape280S0100000_2_I0;

/* renamed from: X.4UB  reason: invalid class name */
public final class AnonymousClass4UB {
    public final AudioTrack.StreamEventCallback A00;
    public final Handler A01 = new Handler();
    public final /* synthetic */ C96334oA A02;

    public AnonymousClass4UB(C96334oA r2) {
        this.A02 = r2;
        this.A00 = new AnonymousClass3LN(this, r2);
    }

    public void A00(AudioTrack audioTrack) {
        audioTrack.registerStreamEventCallback(new IDxExecutorShape280S0100000_2_I0(this.A01, 0), this.A00);
    }

    public void A01(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.A00);
        this.A01.removeCallbacksAndMessages((Object) null);
    }
}
