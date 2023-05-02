package X;

import android.graphics.SurfaceTexture;
import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.Build;
import android.util.Log;
import android.view.Surface;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5zQ  reason: invalid class name */
public class AnonymousClass5zQ implements C1221768o {
    public static final boolean A0C;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public MediaRecorder A04;
    public Surface A05;
    public RandomAccessFile A06;
    public CountDownLatch A07;
    public final Object A08;
    public volatile SurfaceTexture A09;
    public volatile SurfaceTexture A0A;
    public volatile AnonymousClass5yF A0B;

    static {
        boolean z2 = false;
        if (Build.VERSION.SDK_INT >= 21) {
            z2 = true;
        }
        A0C = z2;
    }

    public AnonymousClass5zQ() {
        Object A0Y = C13690nt.A0Y();
        this.A08 = A0Y;
        synchronized (A0Y) {
            this.A07 = new CountDownLatch(1);
        }
    }

    public SurfaceTexture A00(int i2, int i3, int i4, int i5) {
        SurfaceTexture surfaceTexture;
        this.A00 = i4;
        this.A03 = i5;
        this.A02 = i2;
        this.A01 = i3;
        try {
            this.A07.await(5, TimeUnit.SECONDS);
        } catch (InterruptedException e2) {
            Log.e("GLSurfacePipeCoordinatorImpl", AnonymousClass000.A0h(e2.getMessage(), AnonymousClass000.A0r("Timeout when creating SurfaceNode: ")));
        }
        synchronized (this.A08) {
            SurfaceTexture surfaceTexture2 = this.A0A;
            if (surfaceTexture2 != null) {
                if (A0C) {
                    AnonymousClass5yF r2 = this.A0B;
                    if (r2 == null) {
                        r2 = new AnonymousClass5yF();
                        this.A0B = r2;
                    }
                    r2.A05(surfaceTexture2, this.A03);
                    surfaceTexture2 = r2.A03(this.A02, this.A01);
                }
                this.A09 = surfaceTexture2;
                surfaceTexture = this.A09;
            } else {
                throw AnonymousClass000.A0V("SurfaceNode was not created");
            }
        }
        return surfaceTexture;
    }

    public void A01() {
        if (A0C) {
            AnonymousClass5yF r1 = this.A0B;
            this.A0B = null;
            if (r1 != null) {
                r1.A04();
            }
            this.A09 = null;
        }
    }

    public void A02(int i2) {
        this.A03 = i2;
        if (A0C) {
            synchronized (this.A08) {
                SurfaceTexture surfaceTexture = this.A0A;
                AnonymousClass5yF r1 = this.A0B;
                if (!(r1 == null || surfaceTexture == null)) {
                    r1.A05(surfaceTexture, this.A03);
                }
            }
        }
    }

    public C119235wl AgG(CamcorderProfile camcorderProfile, C1219567s r10, String str, int i2, int i3, boolean z2, boolean z3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z4 = true;
        if (i3 == 90 || i3 == 270) {
            i4 = camcorderProfile.videoFrameHeight;
            i5 = camcorderProfile.videoFrameWidth;
            i6 = this.A01;
            i7 = this.A02;
        } else {
            i4 = camcorderProfile.videoFrameWidth;
            i5 = camcorderProfile.videoFrameHeight;
            i6 = this.A02;
            i7 = this.A01;
        }
        float f2 = (float) i4;
        float f3 = (float) i5;
        float f4 = ((float) i6) / ((float) i7);
        if (f2 / f3 > f4) {
            i4 = (int) (f3 * f4);
        } else {
            i5 = (int) (f2 / f4);
        }
        int i8 = i4 - (i4 % 16);
        int i9 = i5 - (i5 % 16);
        int i10 = (this.A00 + this.A03) % 360;
        int i11 = i9;
        if (i10 % 180 == 0) {
            z4 = false;
            i11 = i8;
        }
        camcorderProfile.videoFrameWidth = i11;
        if (!z4) {
            i8 = i9;
        }
        camcorderProfile.videoFrameHeight = i8;
        this.A06 = new RandomAccessFile(str, "rws");
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.A04 = mediaRecorder;
        mediaRecorder.setAudioSource(5);
        this.A04.setVideoSource(2);
        this.A04.setOrientationHint(i10);
        this.A04.setProfile(camcorderProfile);
        this.A04.setOutputFile(this.A06.getFD());
        this.A04.prepare();
        this.A05 = this.A04.getSurface();
        AnonymousClass5yF r2 = this.A0B;
        if (r2 != null) {
            r2.A07(this.A05, this.A03);
        }
        return C118475uk.A00(camcorderProfile, this.A04, str, i10, i2);
    }

    public void AgP() {
        try {
            MediaRecorder mediaRecorder = this.A04;
            if (mediaRecorder != null) {
                mediaRecorder.stop();
            }
            MediaRecorder mediaRecorder2 = this.A04;
            if (mediaRecorder2 != null) {
                mediaRecorder2.reset();
                this.A04.release();
                this.A04 = null;
            }
            AnonymousClass5yF r0 = this.A0B;
            if (r0 != null) {
                r0.A07((Surface) null, 0);
            }
            Surface surface = this.A05;
            if (surface != null) {
                surface.release();
                this.A05 = null;
            }
            RandomAccessFile randomAccessFile = this.A06;
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException unused) {
                }
                this.A06 = null;
            }
        } catch (RuntimeException e2) {
            throw C110115dX.A0Z(e2);
        } catch (Throwable th) {
            MediaRecorder mediaRecorder3 = this.A04;
            if (mediaRecorder3 != null) {
                mediaRecorder3.reset();
                this.A04.release();
                this.A04 = null;
            }
            AnonymousClass5yF r02 = this.A0B;
            if (r02 != null) {
                r02.A07((Surface) null, 0);
            }
            Surface surface2 = this.A05;
            if (surface2 != null) {
                surface2.release();
                this.A05 = null;
            }
            RandomAccessFile randomAccessFile2 = this.A06;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException unused2) {
                }
                this.A06 = null;
            }
            throw th;
        }
    }
}
