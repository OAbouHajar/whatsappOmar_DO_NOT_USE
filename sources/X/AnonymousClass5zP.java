package X;

import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.RandomAccessFile;

/* renamed from: X.5zP  reason: invalid class name */
public class AnonymousClass5zP implements C1221768o {
    public MediaRecorder A00;
    public final MediaRecorder.OnErrorListener A01 = new AnonymousClass5yU(this);
    public final MediaRecorder.OnInfoListener A02 = new AnonymousClass5yV(this);
    public final AnonymousClass69J A03;
    public final boolean A04;

    public AnonymousClass5zP(AnonymousClass69J r2, boolean z2) {
        this.A04 = z2;
        this.A03 = r2;
    }

    public C119235wl AgG(CamcorderProfile camcorderProfile, C1219567s r7, String str, int i2, int i3, boolean z2, boolean z3) {
        FileDescriptor fd = new RandomAccessFile(str, "rws").getFD();
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.A00 = mediaRecorder;
        AnonymousClass69J r3 = this.A03;
        r3.AX8(mediaRecorder);
        boolean z4 = this.A04;
        MediaRecorder mediaRecorder2 = this.A00;
        if (z4) {
            mediaRecorder2.setAudioSource(5);
            this.A00.setProfile(camcorderProfile);
        } else {
            mediaRecorder2.setOutputFormat(camcorderProfile.fileFormat);
            this.A00.setVideoFrameRate(camcorderProfile.videoFrameRate);
            this.A00.setVideoSize(camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight);
            this.A00.setVideoEncodingBitRate(camcorderProfile.videoBitRate);
            this.A00.setVideoEncoder(camcorderProfile.videoCodec);
        }
        this.A00.setOrientationHint(i3);
        this.A00.setOutputFile(fd);
        this.A00.setOnInfoListener(this.A02);
        this.A00.setOnErrorListener(this.A01);
        this.A00.prepare();
        r3.AXU(this.A00);
        return C118475uk.A00(camcorderProfile, this.A00, str, i3, i2);
    }

    public void AgP() {
        MediaRecorder mediaRecorder = this.A00;
        if (mediaRecorder != null) {
            try {
                mediaRecorder.stop();
                this.A00.reset();
                this.A00.release();
                this.A00 = null;
            } catch (RuntimeException e2) {
                Log.e("SimpleVideoCapture", "stopVideoRecording", e2);
                throw C110115dX.A0Z(e2);
            } catch (Throwable th) {
                this.A00.reset();
                this.A00.release();
                this.A00 = null;
                throw th;
            }
        }
    }
}
