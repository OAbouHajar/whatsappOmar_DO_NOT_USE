package X;

import android.media.MediaRecorder;
import android.util.Pair;

/* renamed from: X.5zE  reason: invalid class name */
public class AnonymousClass5zE implements AnonymousClass69J {
    public final /* synthetic */ AnonymousClass5zC A00;

    public AnonymousClass5zE(AnonymousClass5zC r1) {
        this.A00 = r1;
    }

    public void ATP(MediaRecorder mediaRecorder, int i2, int i3, boolean z2) {
        new Pair(Integer.valueOf(i2), Integer.valueOf(i3));
        AnonymousClass5xH.A00();
    }

    public void AX8(MediaRecorder mediaRecorder) {
        try {
            this.A00.A0B(mediaRecorder);
        } catch (Exception e2) {
            AnonymousClass5xH.A01("Camera1Device.setVideoRecordingSource", e2.getMessage());
        }
    }

    public void AXU(MediaRecorder mediaRecorder) {
    }
}
