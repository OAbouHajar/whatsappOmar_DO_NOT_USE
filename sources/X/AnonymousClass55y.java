package X;

import com.obwhatsapp.status.playback.StatusPlaybackActivity;

/* renamed from: X.55y  reason: invalid class name */
public final /* synthetic */ class AnonymousClass55y implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ StatusPlaybackActivity A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ AnonymousClass55y(StatusPlaybackActivity statusPlaybackActivity, String str, int i2, int i3) {
        this.A02 = statusPlaybackActivity;
        this.A03 = str;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final void run() {
        this.A02.A37(this.A00, this.A03, this.A01);
    }
}
