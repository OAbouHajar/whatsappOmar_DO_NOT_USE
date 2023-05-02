package X;

import android.media.MediaPlayer;

/* renamed from: X.4gY  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91824gY implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ AnonymousClass2PI A00;

    public /* synthetic */ C91824gY(AnonymousClass2PI r1) {
        this.A00 = r1;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        AnonymousClass2PI r2 = this.A00;
        r2.A00 = 5;
        r2.A03 = 5;
        MediaPlayer.OnCompletionListener onCompletionListener = r2.A06;
        if (onCompletionListener != null) {
            onCompletionListener.onCompletion(r2.A09);
        }
    }
}
