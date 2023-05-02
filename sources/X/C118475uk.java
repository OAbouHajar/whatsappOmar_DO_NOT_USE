package X;

import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import android.os.SystemClock;

/* renamed from: X.5uk  reason: invalid class name and case insensitive filesystem */
public class C118475uk {
    public int A00 = 0;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05 = 0;
    public long A06 = -1;
    public long A07 = -1;
    public String A08;

    public C118475uk(String str, int i2, int i3, int i4, int i5) {
        String str2;
        if (i2 == 0) {
            str2 = "Frame width must be greater 0";
        } else if (i3 != 0) {
            this.A08 = str;
            this.A03 = i2;
            this.A02 = i3;
            this.A04 = i4;
            this.A01 = i5;
            return;
        } else {
            str2 = "Frame height must be greater 0";
        }
        throw AnonymousClass000.A0T(str2);
    }

    public static C119235wl A00(CamcorderProfile camcorderProfile, MediaRecorder mediaRecorder, String str, int i2, int i3) {
        mediaRecorder.start();
        C118475uk r3 = new C118475uk(str, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, i2, i3);
        r3.A01(C119235wl.A0F, Integer.valueOf(camcorderProfile.audioCodec));
        r3.A01(C119235wl.A0L, Integer.valueOf(camcorderProfile.videoCodec));
        r3.A01(C119235wl.A0J, Long.valueOf(SystemClock.elapsedRealtime()));
        return new C119235wl(r3);
    }

    public void A01(C115895qU r3, Object obj) {
        switch (r3.A00) {
            case 7:
                this.A00 = AnonymousClass000.A0D(obj);
                return;
            case 8:
                this.A05 = AnonymousClass000.A0D(obj);
                return;
            case 9:
            case 10:
            case 11:
                return;
            case 12:
                this.A06 = C13700nu.A01(obj);
                return;
            default:
                this.A07 = C13700nu.A01(obj);
                return;
        }
    }
}
