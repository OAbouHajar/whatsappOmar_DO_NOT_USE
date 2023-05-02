package X;

import android.media.MediaPlayer;
import android.view.View;

/* renamed from: X.5yS  reason: invalid class name */
public final /* synthetic */ class AnonymousClass5yS implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ View A00;

    public /* synthetic */ AnonymousClass5yS(View view) {
        this.A00 = view;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.A00.setVisibility(0);
    }
}
