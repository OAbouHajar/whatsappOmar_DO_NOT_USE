package X;

import java.util.Iterator;
import javax.net.ssl.SSLException;

/* renamed from: X.4QL  reason: invalid class name */
public class AnonymousClass4QL {
    public final C84534Kx A00;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        r6 = X.AnonymousClass4BY.A0V;
        r5 = r6.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005d, code lost:
        if (r7 >= r5) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005f, code lost:
        r4 = r6[r7];
        r2 = r3.A01;
        r1 = (X.C86414Sp) r2.get(r4.A02);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        if (r1 == null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        if (r2.get(r4.A01) == null) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        r1.A00.add(r4);
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007d, code lost:
        r1 = new X.C803943r(X.AnonymousClass000.A0h(r4.A04, X.AnonymousClass000.A0r("Cannot find input state for transition ")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0092, code lost:
        if (r3.A00 == null) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0094, code lost:
        r6 = r3.A01;
        r1 = X.AnonymousClass3K4.A0e(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009f, code lost:
        if (r1.hasNext() == false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a1, code lost:
        r0 = ((X.AnonymousClass4MX) r1.next()).A02;
        r7 = X.AnonymousClass41Z.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ab, code lost:
        if (r0 != r7) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ad, code lost:
        r5 = X.C13680ns.A0o();
        r8 = X.C13690nt.A0j(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b9, code lost:
        if (r8.hasNext() == false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bb, code lost:
        r2 = X.AnonymousClass000.A0z(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00cb, code lost:
        if (((X.C86414Sp) r2.getValue()).A00.size() != 0) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d5, code lost:
        if (((X.AnonymousClass4MX) r2.getKey()).A02 == r7) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d7, code lost:
        r1 = new X.C803943r(X.AnonymousClass000.A0h(((X.AnonymousClass4MX) r2.getKey()).A03, X.AnonymousClass000.A0r("Non-end state with no outbound transitions: ")));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ef, code lost:
        r2 = X.C13680ns.A0o();
        r1 = ((X.C86414Sp) r2.getValue()).A00.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0103, code lost:
        if (r1.hasNext() == false) goto L_0x0111;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0105, code lost:
        r2.add(((X.AnonymousClass4NO) r1.next()).A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0111, code lost:
        r5.addAll(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0120, code lost:
        if ((r6.size() - r5.size()) > 1) goto L_0x0145;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x012b, code lost:
        if ((r6.size() - r5.size()) != 1) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0133, code lost:
        if (r5.contains(r3.A00) == false) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0135, code lost:
        r1 = new X.C803943r("Non-start state(s) with no incoming transitions exist(s)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013b, code lost:
        r3.A02 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013d, code lost:
        r10.A00 = new X.C84534Kx(r11, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0144, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r1 = new X.C803943r("Non-start state(s) with no incoming transitions exist(s)");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x014b, code lost:
        r1 = new X.C803943r("State machine must have an end state");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0153, code lost:
        r1 = new X.C803943r("State machine must have a start state");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x015b, code lost:
        r1 = new X.C803943r(X.AnonymousClass000.A0h(r4.A04, X.AnonymousClass000.A0r("Cannot find output state for transition ")));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4QL(X.C103044zw r11) {
        /*
            r10 = this;
            r10.<init>()
            X.4Ky r3 = new X.4Ky
            r3.<init>()
            X.4MX[] r9 = X.AnonymousClass4BR.A0C     // Catch:{ 43r -> 0x016d }
            int r8 = r9.length     // Catch:{ 43r -> 0x016d }
            r7 = 0
            r6 = 0
        L_0x000d:
            if (r6 >= r8) goto L_0x005a
            r5 = r9[r6]     // Catch:{ 43r -> 0x016d }
            java.util.HashMap r4 = r3.A01     // Catch:{ 43r -> 0x016d }
            java.lang.Object r0 = r4.get(r5)     // Catch:{ 43r -> 0x016d }
            if (r0 != 0) goto L_0x0047
            X.41Z r2 = r5.A02     // Catch:{ 43r -> 0x016d }
            X.41Z r0 = X.AnonymousClass41Z.START     // Catch:{ 43r -> 0x016d }
            r1 = 0
            if (r2 != r0) goto L_0x0038
            r1 = 1
            X.4MX r0 = r3.A00     // Catch:{ 43r -> 0x016d }
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = "Start state already exists, new state invalid: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ 43r -> 0x016d }
            java.lang.String r0 = r5.A03     // Catch:{ 43r -> 0x016d }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ 43r -> 0x016d }
            X.43r r1 = new X.43r     // Catch:{ 43r -> 0x016d }
            r1.<init>(r0)     // Catch:{ 43r -> 0x016d }
            goto L_0x016c
        L_0x0038:
            X.4Sp r0 = new X.4Sp     // Catch:{ 43r -> 0x016d }
            r0.<init>()     // Catch:{ 43r -> 0x016d }
            r4.put(r5, r0)     // Catch:{ 43r -> 0x016d }
            if (r1 == 0) goto L_0x0044
            r3.A00 = r5     // Catch:{ 43r -> 0x016d }
        L_0x0044:
            int r6 = r6 + 1
            goto L_0x000d
        L_0x0047:
            java.lang.String r0 = "State already added: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ 43r -> 0x016d }
            java.lang.String r0 = r5.A03     // Catch:{ 43r -> 0x016d }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ 43r -> 0x016d }
            X.43r r1 = new X.43r     // Catch:{ 43r -> 0x016d }
            r1.<init>(r0)     // Catch:{ 43r -> 0x016d }
            goto L_0x016c
        L_0x005a:
            X.4NO[] r6 = X.AnonymousClass4BY.A0V     // Catch:{ 43r -> 0x016d }
            int r5 = r6.length     // Catch:{ 43r -> 0x016d }
        L_0x005d:
            if (r7 >= r5) goto L_0x0090
            r4 = r6[r7]     // Catch:{ 43r -> 0x016d }
            java.util.HashMap r2 = r3.A01     // Catch:{ 43r -> 0x016d }
            X.4MX r0 = r4.A02     // Catch:{ 43r -> 0x016d }
            java.lang.Object r1 = r2.get(r0)     // Catch:{ 43r -> 0x016d }
            X.4Sp r1 = (X.C86414Sp) r1     // Catch:{ 43r -> 0x016d }
            if (r1 == 0) goto L_0x007d
            X.4MX r0 = r4.A01     // Catch:{ 43r -> 0x016d }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ 43r -> 0x016d }
            if (r0 == 0) goto L_0x015b
            java.util.Vector r0 = r1.A00     // Catch:{ 43r -> 0x016d }
            r0.add(r4)     // Catch:{ 43r -> 0x016d }
            int r7 = r7 + 1
            goto L_0x005d
        L_0x007d:
            java.lang.String r0 = "Cannot find input state for transition "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ 43r -> 0x016d }
            java.lang.String r0 = r4.A04     // Catch:{ 43r -> 0x016d }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ 43r -> 0x016d }
            X.43r r1 = new X.43r     // Catch:{ 43r -> 0x016d }
            r1.<init>(r0)     // Catch:{ 43r -> 0x016d }
            goto L_0x016c
        L_0x0090:
            X.4MX r0 = r3.A00     // Catch:{ 43r -> 0x016d }
            if (r0 == 0) goto L_0x0153
            java.util.HashMap r6 = r3.A01     // Catch:{ 43r -> 0x016d }
            java.util.Iterator r1 = X.AnonymousClass3K4.A0e(r6)     // Catch:{ 43r -> 0x016d }
        L_0x009a:
            boolean r0 = r1.hasNext()     // Catch:{ 43r -> 0x016d }
            r4 = 1
            if (r0 == 0) goto L_0x014b
            java.lang.Object r0 = r1.next()     // Catch:{ 43r -> 0x016d }
            X.4MX r0 = (X.AnonymousClass4MX) r0     // Catch:{ 43r -> 0x016d }
            X.41Z r0 = r0.A02     // Catch:{ 43r -> 0x016d }
            X.41Z r7 = X.AnonymousClass41Z.END     // Catch:{ 43r -> 0x016d }
            if (r0 != r7) goto L_0x009a
            java.util.HashSet r5 = X.C13680ns.A0o()     // Catch:{ 43r -> 0x016d }
            java.util.Iterator r8 = X.C13690nt.A0j(r6)     // Catch:{ 43r -> 0x016d }
        L_0x00b5:
            boolean r0 = r8.hasNext()     // Catch:{ 43r -> 0x016d }
            if (r0 == 0) goto L_0x0115
            java.util.Map$Entry r2 = X.AnonymousClass000.A0z(r8)     // Catch:{ 43r -> 0x016d }
            java.lang.Object r0 = r2.getValue()     // Catch:{ 43r -> 0x016d }
            X.4Sp r0 = (X.C86414Sp) r0     // Catch:{ 43r -> 0x016d }
            java.util.Vector r0 = r0.A00     // Catch:{ 43r -> 0x016d }
            int r0 = r0.size()     // Catch:{ 43r -> 0x016d }
            if (r0 != 0) goto L_0x00ef
            java.lang.Object r0 = r2.getKey()     // Catch:{ 43r -> 0x016d }
            X.4MX r0 = (X.AnonymousClass4MX) r0     // Catch:{ 43r -> 0x016d }
            X.41Z r0 = r0.A02     // Catch:{ 43r -> 0x016d }
            if (r0 == r7) goto L_0x00ef
            java.lang.String r0 = "Non-end state with no outbound transitions: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ 43r -> 0x016d }
            java.lang.Object r0 = r2.getKey()     // Catch:{ 43r -> 0x016d }
            X.4MX r0 = (X.AnonymousClass4MX) r0     // Catch:{ 43r -> 0x016d }
            java.lang.String r0 = r0.A03     // Catch:{ 43r -> 0x016d }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ 43r -> 0x016d }
            X.43r r1 = new X.43r     // Catch:{ 43r -> 0x016d }
            r1.<init>(r0)     // Catch:{ 43r -> 0x016d }
            goto L_0x016c
        L_0x00ef:
            java.lang.Object r0 = r2.getValue()     // Catch:{ 43r -> 0x016d }
            X.4Sp r0 = (X.C86414Sp) r0     // Catch:{ 43r -> 0x016d }
            java.util.HashSet r2 = X.C13680ns.A0o()     // Catch:{ 43r -> 0x016d }
            java.util.Vector r0 = r0.A00     // Catch:{ 43r -> 0x016d }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ 43r -> 0x016d }
        L_0x00ff:
            boolean r0 = r1.hasNext()     // Catch:{ 43r -> 0x016d }
            if (r0 == 0) goto L_0x0111
            java.lang.Object r0 = r1.next()     // Catch:{ 43r -> 0x016d }
            X.4NO r0 = (X.AnonymousClass4NO) r0     // Catch:{ 43r -> 0x016d }
            X.4MX r0 = r0.A01     // Catch:{ 43r -> 0x016d }
            r2.add(r0)     // Catch:{ 43r -> 0x016d }
            goto L_0x00ff
        L_0x0111:
            r5.addAll(r2)     // Catch:{ 43r -> 0x016d }
            goto L_0x00b5
        L_0x0115:
            int r1 = r6.size()     // Catch:{ 43r -> 0x016d }
            int r0 = r5.size()     // Catch:{ 43r -> 0x016d }
            int r1 = r1 - r0
            java.lang.String r2 = "Non-start state(s) with no incoming transitions exist(s)"
            if (r1 > r4) goto L_0x0145
            int r1 = r6.size()     // Catch:{ 43r -> 0x016d }
            int r0 = r5.size()     // Catch:{ 43r -> 0x016d }
            int r1 = r1 - r0
            if (r1 != r4) goto L_0x013b
            X.4MX r0 = r3.A00     // Catch:{ 43r -> 0x016d }
            boolean r0 = r5.contains(r0)     // Catch:{ 43r -> 0x016d }
            if (r0 == 0) goto L_0x013b
            X.43r r1 = new X.43r     // Catch:{ 43r -> 0x016d }
            r1.<init>(r2)     // Catch:{ 43r -> 0x016d }
            goto L_0x016c
        L_0x013b:
            r3.A02 = r4     // Catch:{ 43r -> 0x016d }
            X.4Kx r0 = new X.4Kx
            r0.<init>(r11, r3)
            r10.A00 = r0
            return
        L_0x0145:
            X.43r r1 = new X.43r     // Catch:{ 43r -> 0x016d }
            r1.<init>(r2)     // Catch:{ 43r -> 0x016d }
            goto L_0x016c
        L_0x014b:
            java.lang.String r0 = "State machine must have an end state"
            X.43r r1 = new X.43r     // Catch:{ 43r -> 0x016d }
            r1.<init>(r0)     // Catch:{ 43r -> 0x016d }
            goto L_0x016c
        L_0x0153:
            java.lang.String r0 = "State machine must have a start state"
            X.43r r1 = new X.43r     // Catch:{ 43r -> 0x016d }
            r1.<init>(r0)     // Catch:{ 43r -> 0x016d }
            goto L_0x016c
        L_0x015b:
            java.lang.String r0 = "Cannot find output state for transition "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ 43r -> 0x016d }
            java.lang.String r0 = r4.A04     // Catch:{ 43r -> 0x016d }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ 43r -> 0x016d }
            X.43r r1 = new X.43r     // Catch:{ 43r -> 0x016d }
            r1.<init>(r0)     // Catch:{ 43r -> 0x016d }
        L_0x016c:
            throw r1     // Catch:{ 43r -> 0x016d }
        L_0x016d:
            r0 = move-exception
            r3 = 80
            java.lang.Throwable r2 = X.AnonymousClass3K3.A0r(r0)
            java.lang.String r0 = "Failed to init finite state machine."
            javax.net.ssl.SSLException r1 = new javax.net.ssl.SSLException
            r1.<init>(r0, r2)
            X.1aU r0 = new X.1aU
            r0.<init>(r1, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4QL.<init>(X.4zw):void");
    }

    public synchronized void A00(C82814Eg r7) {
        C803943r r1;
        AnonymousClass4PX r12;
        AnonymousClass4PX r13;
        try {
            C84534Kx r5 = this.A00;
            C84544Ky r14 = r5.A02;
            AnonymousClass4MX r2 = r5.A00;
            C108125Mt r4 = r5.A01;
            if (r14.A02) {
                Iterator it = ((C86414Sp) r14.A01.get(r2)).A00.iterator();
                while (it.hasNext()) {
                    AnonymousClass4NO r3 = (AnonymousClass4NO) it.next();
                    if (r3.A03.isInstance(r7)) {
                        AnonymousClass4MX r22 = r3.A01;
                        AnonymousClass4MX r0 = r5.A00;
                        if (!(r22 == r0 || (r13 = r0.A01) == null)) {
                            r13.A04(r4, r7, r3, 1);
                        }
                        AnonymousClass4PX r15 = r3.A00;
                        if (r15 != null) {
                            r15.A04(r4, r7, r3, 2);
                        }
                        if (!(r22 == r5.A00 || (r12 = r22.A00) == null)) {
                            r12.A04(r4, r7, r3, 3);
                        }
                        r5.A00 = r22;
                    }
                }
                r1 = new C803943r(AnonymousClass000.A0h(r2.A03, AnonymousClass000.A0r("No valid transition from state: ")));
            } else {
                r1 = new C803943r("State machine map is not initialized - call build()");
            }
            throw r1;
        } catch (C803943r e2) {
            throw (!(e2.getCause() instanceof C29351aU) ? new C29351aU(new SSLException("Internal Error", AnonymousClass3K3.A0r(e2)), (byte) 80) : (C29351aU) e2.getCause());
        }
    }
}
