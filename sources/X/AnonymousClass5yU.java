package X;

import android.media.MediaRecorder;

/* renamed from: X.5yU  reason: invalid class name */
public class AnonymousClass5yU implements MediaRecorder.OnErrorListener {
    public final /* synthetic */ AnonymousClass5zP A00;

    public AnonymousClass5yU(AnonymousClass5zP r1) {
        this.A00 = r1;
    }

    public void onError(MediaRecorder mediaRecorder, int i2, int i3) {
        this.A00.A03.ATP(mediaRecorder, i2, i3, true);
    }
}
