package X;

import android.media.MediaPlayer;
import com.whatsapp.util.Log;

/* renamed from: X.4ga  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91844ga implements MediaPlayer.OnErrorListener {
    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        StringBuilder A0r = AnonymousClass000.A0r("mediaview/error: what:");
        A0r.append(i2);
        Log.e(C13680ns.A0i("  extra:", A0r, i3));
        return false;
    }
}
