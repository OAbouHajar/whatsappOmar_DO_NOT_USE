package X;

import android.hardware.camera2.CaptureRequest;
import android.os.SystemClock;
import java.util.concurrent.Callable;

/* renamed from: X.67E  reason: invalid class name */
public class AnonymousClass67E implements Callable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ CaptureRequest.Builder A01;
    public final /* synthetic */ C119325wu A02;
    public final /* synthetic */ AnonymousClass5zJ A03;

    public AnonymousClass67E(CaptureRequest.Builder builder, C119325wu r2, AnonymousClass5zJ r3, long j2) {
        this.A02 = r2;
        this.A01 = builder;
        this.A03 = r3;
        this.A00 = j2;
    }

    public /* bridge */ /* synthetic */ Object call() {
        String str;
        CaptureRequest.Builder builder;
        C119325wu r7 = this.A02;
        if (!r7.A0D) {
            str = "Not recording video.";
        } else if (r7.A0B == null || r7.A05 == null || r7.A04 == null || r7.A02 == null || r7.A01 == null) {
            str = "Cannot stop recording video, camera is closed";
        } else if (r7.A06 != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - r7.A00;
            if (elapsedRealtime < 500) {
                SystemClock.sleep(500 - elapsedRealtime);
            }
            C119235wl r4 = r7.A06;
            Exception A022 = r7.A02();
            C111185fT r0 = r7.A04;
            C115835qO r5 = AnonymousClass5wI.A0A;
            if (!(AnonymousClass5wI.A02(r5, r0) == 0 || (builder = this.A01) == null)) {
                C118845vL r1 = new C118845vL();
                r1.A01(r5, 0);
                r7.A04.A07(r1.A00());
                C119375wz.A02(builder, r7.A04, r7.A05, 0);
                r7.A02.A05();
            }
            if (A022 == null) {
                r4.A02(C119235wl.A0K, Long.valueOf(this.A00));
                return r4;
            }
            throw A022;
        } else {
            str = "Cannot stop recording video, VideoCaptureInfo is null";
        }
        throw AnonymousClass000.A0V(str);
    }
}
