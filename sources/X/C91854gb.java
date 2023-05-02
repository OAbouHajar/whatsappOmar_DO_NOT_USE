package X;

import android.media.MediaPlayer;

/* renamed from: X.4gb  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91854gb implements MediaPlayer.OnErrorListener {
    public final /* synthetic */ AnonymousClass2PI A00;

    public /* synthetic */ C91854gb(AnonymousClass2PI r1) {
        this.A00 = r1;
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        AnonymousClass2PI r2 = this.A00;
        r2.A00 = -1;
        r2.A03 = -1;
        MediaPlayer.OnErrorListener onErrorListener = r2.A07;
        if (onErrorListener == null) {
            return true;
        }
        onErrorListener.onError(r2.A09, i2, i3);
        return true;
    }
}
