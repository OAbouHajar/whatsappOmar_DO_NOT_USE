package X;

import android.media.AudioTrack;

/* renamed from: X.3LN  reason: invalid class name */
public class AnonymousClass3LN extends AudioTrack.StreamEventCallback {
    public final /* synthetic */ AnonymousClass4UB A00;
    public final /* synthetic */ C96334oA A01;

    public AnonymousClass3LN(AnonymousClass4UB r1, C96334oA r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void onDataRequest(AudioTrack audioTrack, int i2) {
        C96334oA r2 = this.A00.A02;
        C90524eJ.A04(AnonymousClass000.A1Y(audioTrack, r2.A0D));
        AnonymousClass5TB r1 = r2.A0G;
        if (r1 != null && r2.A0T) {
            r1.AU7();
        }
    }

    public void onTearDown(AudioTrack audioTrack) {
        C96334oA r2 = this.A00.A02;
        C90524eJ.A04(AnonymousClass000.A1Y(audioTrack, r2.A0D));
        AnonymousClass5TB r1 = r2.A0G;
        if (r1 != null && r2.A0T) {
            r1.AU7();
        }
    }
}
