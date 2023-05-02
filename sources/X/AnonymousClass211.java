package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.211  reason: invalid class name */
public class AnonymousClass211 {
    public static final AnonymousClass00F A04 = new AnonymousClass00F(1, 10);
    public long A00 = -1;
    public final long A01;
    public final C16490t9 A02;
    public final AnonymousClass212 A03;

    public AnonymousClass211(C16490t9 r3) {
        this.A02 = r3;
        this.A03 = new AnonymousClass212();
        this.A01 = SystemClock.uptimeMillis();
    }

    public void A00() {
        long j2 = this.A00;
        boolean z2 = false;
        if (j2 > 0) {
            z2 = true;
        }
        AnonymousClass00B.A0G(z2);
        AnonymousClass212 r4 = this.A03;
        r4.A02 = Boolean.FALSE;
        r4.A09 = Long.valueOf(SystemClock.uptimeMillis() - j2);
        r4.A0M = Long.valueOf(SystemClock.uptimeMillis() - this.A01);
        this.A02.A0A(r4, A04);
    }

    public void A01() {
        long j2 = this.A00;
        boolean z2 = false;
        if (j2 > 0) {
            z2 = true;
        }
        AnonymousClass00B.A0G(z2);
        AnonymousClass212 r4 = this.A03;
        r4.A09 = Long.valueOf(SystemClock.uptimeMillis() - j2);
        StringBuilder sb = new StringBuilder("mediatranscodequeue/srcLength");
        sb.append(r4.A0J);
        sb.append(" destinationSize=");
        sb.append(r4.A07);
        sb.append(" compressionRate=");
        sb.append(((float) r4.A07.longValue()) / ((float) r4.A0J.longValue()));
        sb.append(" duration=");
        sb.append(r4.A09);
        sb.append(" width=");
        sb.append(r4.A08);
        sb.append(" height=");
        sb.append(r4.A06);
        sb.append(" isProgressiveJpeg=");
        sb.append(r4.A03);
        sb.append(" firstScanLength=");
        sb.append(r4.A0A);
        sb.append(" thumbnailLength=");
        sb.append(r4.A0L);
        Log.i(sb.toString());
        r4.A02 = Boolean.TRUE;
        r4.A0M = Long.valueOf(SystemClock.uptimeMillis() - this.A01);
        this.A02.A06(r4);
    }

    public void A02(int i2, int i3) {
        AnonymousClass212 r2 = this.A03;
        r2.A08 = Long.valueOf((long) i2);
        r2.A06 = Long.valueOf((long) i3);
    }

    public void A03(C42061xA r6) {
        AnonymousClass212 r4 = this.A03;
        r4.A0K = Long.valueOf((long) r6.A03);
        r4.A0I = Long.valueOf((long) r6.A01);
        r4.A0G = Long.valueOf((long) (r6.A00() / 1000));
        r4.A0H = Long.valueOf(r6.A04 / 1000);
    }
}
