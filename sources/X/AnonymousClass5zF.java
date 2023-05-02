package X;

import android.media.MediaRecorder;

/* renamed from: X.5zF  reason: invalid class name */
public class AnonymousClass5zF implements AnonymousClass69J {
    public final /* synthetic */ AnonymousClass5zD A00;

    public AnonymousClass5zF(AnonymousClass5zD r1) {
        this.A00 = r1;
    }

    public void ATP(MediaRecorder mediaRecorder, int i2, int i3, boolean z2) {
    }

    public void AX8(MediaRecorder mediaRecorder) {
        try {
            mediaRecorder.setVideoSource(2);
        } catch (Exception e2) {
            AnonymousClass5xH.A01("Camera2Device.setVideoRecordingSource", e2.getMessage());
        }
    }

    public void AXU(MediaRecorder mediaRecorder) {
        AnonymousClass5zD r3 = this.A00;
        r3.A0d.A06("Method onStartMediaRecorder() must run on the Optic Background Thread.");
        AnonymousClass5xW r2 = r3.A0Y;
        C118885vP r1 = r2.A0H;
        r1.A01("Can only check if the prepared on the Optic thread");
        if (!r1.A00) {
            AnonymousClass5xH.A02("Camera2Device", "Can not start video recording, PreviewController is not prepared");
            return;
        }
        r3.A0Z.A0C = true;
        r2.A0B(mediaRecorder.getSurface());
    }
}
