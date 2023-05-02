package X;

import android.os.SystemClock;
import java.net.URL;

/* renamed from: X.1cs  reason: invalid class name and case insensitive filesystem */
public class C30741cs {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public C31701et A08;
    public Boolean A09;
    public Boolean A0A;
    public Float A0B;
    public Integer A0C;
    public Integer A0D;
    public Long A0E;
    public Long A0F;
    public Long A0G;
    public Long A0H;
    public Long A0I;
    public Long A0J;
    public Long A0K;
    public Long A0L;
    public Long A0M;
    public Long A0N;
    public Long A0O;
    public Long A0P;
    public String A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public URL A0U;
    public boolean A0V;
    public boolean A0W;
    public final long A0X = SystemClock.elapsedRealtime();
    public final AnonymousClass1XK A0Y;

    public C30741cs(AnonymousClass1XK r3) {
        this.A0Y = r3;
    }

    public C30741cs(AnonymousClass1XK r3, int i2, int i3) {
        this.A00 = i2;
        this.A0Y = r3;
        this.A01 = i3;
    }

    public long A00() {
        Long l2 = this.A0H;
        if (l2 == null) {
            return 0;
        }
        Long l3 = this.A0E;
        if (l3 != null) {
            return l3.longValue();
        }
        if (this.A0F == null) {
            return SystemClock.elapsedRealtime() - l2.longValue();
        }
        return 0;
    }

    public long A01() {
        Long l2 = this.A0H;
        if (l2 == null) {
            return 0;
        }
        Long l3 = this.A0L;
        if (l3 != null) {
            return l3.longValue();
        }
        if (this.A0F == null) {
            return SystemClock.elapsedRealtime() - l2.longValue();
        }
        return 0;
    }

    public synchronized long A02() {
        return this.A04;
    }

    public synchronized long A03() {
        return this.A07;
    }

    public Long A04() {
        long longValue;
        Long l2 = this.A0H;
        if (l2 == null) {
            longValue = 0;
        } else {
            Long l3 = this.A0F;
            longValue = (l3 != null ? l3.longValue() : SystemClock.elapsedRealtime()) - l2.longValue();
        }
        return Long.valueOf(longValue);
    }

    public void A05() {
        Long l2 = this.A0H;
        boolean z2 = false;
        if (l2 != null) {
            z2 = true;
        }
        AnonymousClass00B.A0G(z2);
        this.A0E = Long.valueOf(SystemClock.elapsedRealtime() - l2.longValue());
        this.A02 = 1;
    }

    public void A06() {
        Long l2 = this.A0I;
        boolean z2 = false;
        if (l2 != null) {
            z2 = true;
        }
        AnonymousClass00B.A0G(z2);
        this.A0J = Long.valueOf(SystemClock.elapsedRealtime() - l2.longValue());
    }

    public void A07() {
        this.A0I = Long.valueOf(SystemClock.elapsedRealtime());
        this.A02 = 3;
    }

    public void A08() {
        Long l2 = this.A0H;
        boolean z2 = true;
        boolean z3 = false;
        if (l2 != null) {
            z3 = true;
        }
        AnonymousClass00B.A0G(z3);
        if (this.A0E == null) {
            z2 = false;
        }
        AnonymousClass00B.A0G(z2);
        this.A0P = Long.valueOf(SystemClock.elapsedRealtime() - l2.longValue());
        this.A02 = 2;
    }

    public void A09() {
        Long l2 = this.A0H;
        boolean z2 = false;
        if (l2 != null) {
            z2 = true;
        }
        AnonymousClass00B.A0G(z2);
        this.A0L = Long.valueOf(SystemClock.elapsedRealtime() - l2.longValue());
    }

    public synchronized void A0A(long j2, long j3) {
        this.A07 = j2;
        this.A04 += j3;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.lang.Exception, code=java.lang.Throwable, for r2v0, types: [java.lang.Throwable, java.lang.Exception] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(java.lang.Throwable r2) {
        /*
            r1 = this;
            boolean r0 = r2 instanceof X.C38051qA
            if (r0 == 0) goto L_0x0017
            java.lang.Throwable r0 = r2.getCause()
            if (r0 != 0) goto L_0x000b
            r0 = r2
        L_0x000b:
            r2 = r0
        L_0x000c:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r1.A0R = r0
        L_0x0016:
            return
        L_0x0017:
            if (r2 == 0) goto L_0x0016
            goto L_0x000c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30741cs.A0B(java.lang.Exception):void");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MMS type: ");
        sb.append(this.A0Y);
        sb.append(" retry count: ");
        sb.append(this.A0N);
        sb.append(" network stack: ");
        sb.append(this.A01);
        sb.append(" connction type: ");
        sb.append(this.A0D);
        sb.append(" connection class: ");
        sb.append(this.A0Q);
        sb.append(" url: ");
        URL url = this.A0U;
        sb.append(url == null ? null : url.toString());
        sb.append(" download time: ");
        sb.append(A04());
        sb.append(" queue time: ");
        Long l2 = this.A0H;
        sb.append(l2 == null ? null : Long.valueOf(l2.longValue() - this.A0X));
        sb.append(" connction time: ");
        sb.append(A00());
        sb.append(" route selection delay: ");
        sb.append(this.A0O);
        sb.append(" network time: ");
        sb.append(A01());
        sb.append(" connection reused: ");
        sb.append(this.A09);
        sb.append(" response code: ");
        sb.append(this.A0M);
        sb.append(" total bytes transferred: ");
        sb.append(A03());
        sb.append(" media ip: ");
        sb.append(this.A0T);
        sb.append(" exception: ");
        sb.append(this.A0R);
        sb.append(" download stage: ");
        sb.append(this.A02);
        sb.append(" download resume point: ");
        Long l3 = this.A0G;
        sb.append(l3 != null ? l3.longValue() : 0);
        return sb.toString();
    }
}
