package X;

import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.5zS  reason: invalid class name */
public class AnonymousClass5zS implements AnonymousClass69Q {
    public int A00 = 7;
    public final int A01;
    public final C17420v3 A02;
    public final C117585tE A03;
    public final String A04;
    public final ConcurrentSkipListMap A05 = new ConcurrentSkipListMap();
    public final AtomicBoolean A06 = new AtomicBoolean(false);

    public AnonymousClass5zS(C17420v3 r3, C117585tE r4, String str, int i2) {
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = str;
        this.A01 = i2;
    }

    public AnonymousClass69Q A4r(String str, long j2) {
        int i2 = this.A00;
        if (i2 != 3 && i2 != 5 && i2 != 7) {
            return this;
        }
        this.A05.put("duration", new C116915s9(2, Long.valueOf(j2)));
        return this;
    }

    public AnonymousClass69Q A4s(String str, String str2) {
        int i2 = this.A00;
        if (i2 != 3 && i2 != 5 && i2 != 7) {
            return this;
        }
        this.A05.put("message", new C116915s9(5, str2));
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ca A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AcA() {
        /*
            r7 = this;
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.A06
            r0 = 1
            boolean r0 = r1.getAndSet(r0)
            if (r0 == 0) goto L_0x0011
            X.0v3 r1 = r7.A02
            int r0 = r7.A01
            r1.A8m(r0)
            return
        L_0x0011:
            X.5tE r5 = r7.A03
            int r4 = r7.A01
            X.5ve r0 = r5.A06
            X.5sp r0 = r0.A00(r4)
            int r1 = r0.A00
            r0 = 1
            if (r1 != r0) goto L_0x00c3
            X.0yX r0 = r5.A03
        L_0x0022:
            r0.ALE(r4)
        L_0x0025:
            java.lang.String r1 = r7.A04
            if (r1 == 0) goto L_0x002e
            X.0yX r0 = r5.A03
            r0.Aek(r4, r1)
        L_0x002e:
            java.util.concurrent.ConcurrentSkipListMap r1 = r7.A05
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x00ca
            java.util.Map$Entry r6 = r1.pollLastEntry()
            if (r6 == 0) goto L_0x002e
            java.lang.Object r0 = r6.getValue()
            if (r0 == 0) goto L_0x002e
            java.lang.Object r0 = r6.getValue()
            X.5s9 r0 = (X.C116915s9) r0
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L_0x002e
            java.lang.Object r0 = r6.getValue()     // Catch:{ Exception -> 0x00b8 }
            X.5s9 r0 = (X.C116915s9) r0     // Catch:{ Exception -> 0x00b8 }
            int r1 = r0.A00     // Catch:{ Exception -> 0x00b8 }
            r0 = 2
            if (r1 == r0) goto L_0x009f
            r0 = 3
            if (r1 == r0) goto L_0x0087
            r0 = 4
            if (r1 == r0) goto L_0x0071
            java.lang.String r2 = X.C13690nt.A0f(r6)     // Catch:{ Exception -> 0x00b8 }
            java.lang.Object r0 = r6.getValue()     // Catch:{ Exception -> 0x00b8 }
            X.5s9 r0 = (X.C116915s9) r0     // Catch:{ Exception -> 0x00b8 }
            java.lang.Object r1 = r0.A01     // Catch:{ Exception -> 0x00b8 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x00b8 }
            X.0yX r0 = r5.A03     // Catch:{ Exception -> 0x00b8 }
            r0.AKi(r4, r2, r1)     // Catch:{ Exception -> 0x00b8 }
            goto L_0x002e
        L_0x0071:
            java.lang.String r2 = X.C13690nt.A0f(r6)     // Catch:{ Exception -> 0x00b8 }
            java.lang.Object r0 = r6.getValue()     // Catch:{ Exception -> 0x00b8 }
            X.5s9 r0 = (X.C116915s9) r0     // Catch:{ Exception -> 0x00b8 }
            java.lang.Object r0 = r0.A01     // Catch:{ Exception -> 0x00b8 }
            boolean r1 = X.AnonymousClass000.A1X(r0)     // Catch:{ Exception -> 0x00b8 }
            X.0yX r0 = r5.A03     // Catch:{ Exception -> 0x00b8 }
            r0.AKj(r4, r2, r1)     // Catch:{ Exception -> 0x00b8 }
            goto L_0x002e
        L_0x0087:
            java.lang.String r3 = X.C13690nt.A0f(r6)     // Catch:{ Exception -> 0x00b8 }
            java.lang.Object r0 = r6.getValue()     // Catch:{ Exception -> 0x00b8 }
            X.5s9 r0 = (X.C116915s9) r0     // Catch:{ Exception -> 0x00b8 }
            java.lang.Object r0 = r0.A01     // Catch:{ Exception -> 0x00b8 }
            java.lang.Double r0 = (java.lang.Double) r0     // Catch:{ Exception -> 0x00b8 }
            double r1 = r0.doubleValue()     // Catch:{ Exception -> 0x00b8 }
            X.0yX r0 = r5.A03     // Catch:{ Exception -> 0x00b8 }
            r0.AKs(r3, r1, r4)     // Catch:{ Exception -> 0x00b8 }
            goto L_0x002e
        L_0x009f:
            java.lang.String r3 = X.C13690nt.A0f(r6)     // Catch:{ Exception -> 0x00b8 }
            java.lang.Object r0 = r6.getValue()     // Catch:{ Exception -> 0x00b8 }
            X.5s9 r0 = (X.C116915s9) r0     // Catch:{ Exception -> 0x00b8 }
            java.lang.Object r0 = r0.A01     // Catch:{ Exception -> 0x00b8 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x00b8 }
            long r1 = r0.longValue()     // Catch:{ Exception -> 0x00b8 }
            X.0yX r0 = r5.A03     // Catch:{ Exception -> 0x00b8 }
            r0.AKh(r4, r3, r1)     // Catch:{ Exception -> 0x00b8 }
            goto L_0x002e
        L_0x00b8:
            X.0v3 r1 = r7.A02
            java.lang.String r0 = X.C13690nt.A0f(r6)
            r1.A4v(r4, r0)
            goto L_0x002e
        L_0x00c3:
            r0 = 2
            if (r1 != r0) goto L_0x0025
            X.0yX r0 = r5.A02
            goto L_0x0022
        L_0x00ca:
            r1 = 51
            X.0yX r0 = r5.A03
            r0.AKz(r4, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5zS.AcA():void");
    }

    public AnonymousClass69Q Ae5(int i2) {
        this.A00 = i2;
        return this;
    }
}
