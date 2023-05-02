package X;

import android.media.MediaPlayer;
import android.view.View;

/* renamed from: X.5yT  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5yT implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ View A00;

    public /* synthetic */ AnonymousClass5yT(View view) {
        this.A00 = view;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        this.A00.setVisibility(8);
    }
}
