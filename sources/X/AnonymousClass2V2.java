package X;

import android.os.SystemClock;
import com.facebook.redex.RunnableRunnableShape0S0100002_I0;
import com.facebook.redex.RunnableRunnableShape0S0101000_I0;
import com.facebook.redex.RunnableRunnableShape0S0110000_I0;
import com.facebook.redex.RunnableRunnableShape0S1100000_I0;
import com.facebook.redex.RunnableRunnableShape5S0100000_I0_4;

/* renamed from: X.2V2  reason: invalid class name */
public class AnonymousClass2V2 implements AnonymousClass2V3 {
    public final /* synthetic */ C29251aI A00;

    public AnonymousClass2V2(C29251aI r1) {
        this.A00 = r1;
    }

    public void AN0(float f2, float f3) {
        this.A00.A0d.A0K(new RunnableRunnableShape0S0100002_I0(this, f2, f3, 0));
    }

    public void AN1(boolean z2) {
        this.A00.A0d.A0K(new RunnableRunnableShape0S0110000_I0(this, 9, z2));
    }

    public void AO0(Exception exc, int i2) {
        C29251aI r6 = this.A00;
        r6.A0d.A0K(new RunnableRunnableShape0S0101000_I0((Object) this, i2, 9));
        C23161As r5 = r6.A0j;
        boolean A02 = r6.A0g.A02();
        if (r5.A0B) {
            r5.A09.AKi(554251647, "error_message", A02 ? "in_call" : i2 != 2 ? i2 != 3 ? i2 != 4 ? "unknown" : "video" : "photo" : "evicted");
        }
        r5.A05(4);
        C23151Ar r4 = r6.A0i;
        if (r4.A04()) {
            C52322da r3 = new C52322da();
            r3.A09 = 2;
            r3.A0G = r4.A02.A00;
            r3.A0E = Long.valueOf((long) i2);
            StringBuilder sb = new StringBuilder();
            sb.append(exc);
            sb.append(" at ");
            sb.append(exc.getStackTrace()[0].toString());
            r3.A0H = sb.toString();
            r4.A01.A04(r3);
        }
    }

    public void AVG() {
        C29251aI r4 = this.A00;
        C23161As r3 = r4.A0j;
        AnonymousClass2Qt r2 = r4.A0C;
        int cameraType = r2.getCameraType();
        boolean z2 = !r2.AIs();
        Integer valueOf = Integer.valueOf(r2.getCameraApi());
        String flashMode = r2.getFlashMode();
        boolean z3 = r3.A0B;
        if (z3) {
            r3.A02(554251647, "onPreviewReady");
            r3.A03(valueOf, 554251647, cameraType);
            r3.A00(554251647, z2 ? 1 : 0);
            r3.A09.AKi(554251647, "flash_mode", flashMode);
        }
        if (r4.A0W) {
            AnonymousClass2Qt r1 = r4.A0C;
            Integer valueOf2 = Integer.valueOf(r1.getCameraApi());
            int cameraType2 = r1.getCameraType();
            C74813r9 r12 = new C74813r9();
            r12.A02 = Long.valueOf(SystemClock.elapsedRealtime() - r3.A03);
            r12.A01 = Integer.valueOf(cameraType2);
            r12.A00 = valueOf2;
            if (r3.A0A) {
                r3.A08.A06(r12);
            }
            if (z3) {
                r3.A03(valueOf2, 554250848, cameraType2);
                r3.A09.AKz(554250848, 2);
            }
            r4.A0W = false;
        } else {
            boolean z4 = r4.A0V;
            AnonymousClass2Qt r13 = r4.A0C;
            Integer valueOf3 = Integer.valueOf(r13.getCameraApi());
            int cameraType3 = r13.getCameraType();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = z4 ? r3.A01 : r3.A02;
            r3.A01 = 0;
            r3.A02 = 0;
            if (j2 != 0) {
                C75023rU r14 = new C75023rU();
                r14.A02 = Integer.valueOf(z4 ^ true ? 1 : 0);
                r14.A03 = Long.valueOf(elapsedRealtime - j2);
                r14.A01 = Integer.valueOf(cameraType3);
                r14.A00 = valueOf3;
                if (r3.A0A) {
                    r3.A08.A06(r14);
                }
            }
        }
        r4.A0V = false;
        r4.A0d.A0K(new RunnableRunnableShape5S0100000_I0_4((Object) this, 15));
        r3.A01(554251647, "onPreviewReady");
        r3.A05(2);
    }

    public void AVV(C86844Uj r5) {
        this.A00.A0d.A0K(new RunnableRunnableShape0S1100000_I0(24, r5.A02, this));
    }

    public void AZX() {
        C23161As r4 = this.A00.A0j;
        r4.A04 = SystemClock.elapsedRealtime() - r4.A05;
        if (r4.A0B) {
            r4.A01(554249147, "start_video_capture");
            r4.A02(554249147, "video_record");
        }
    }
}
