package X;

/* renamed from: X.638  reason: invalid class name */
public class AnonymousClass638 implements Comparable {
    public int A00;
    public int A01;
    public C114905on A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public boolean A0C;

    public AnonymousClass638() {
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass638(X.C28371Vv r5) {
        /*
            r4 = this;
            r4.<init>()
            java.lang.String r3 = r5.A00
            java.lang.String r1 = "otp"
            boolean r0 = r3.equals(r1)
            java.lang.String r2 = "value"
            if (r0 == 0) goto L_0x008a
            r4.A0B = r1
            java.lang.String r0 = "type"
            java.lang.String r1 = X.C28371Vv.A05(r5, r0)
            r4.A05 = r1
            int r0 = r1.hashCode()
            switch(r0) {
                case 82233: goto L_0x005e;
                case 2467610: goto L_0x0069;
                case 66081660: goto L_0x0074;
                case 81425707: goto L_0x007f;
                default: goto L_0x0020;
            }
        L_0x0020:
            X.5on r0 = X.C114905on.A07
        L_0x0022:
            r4.A02 = r0
            r3 = 0
            java.lang.String r0 = r5.A0N(r2, r3)
            r4.A04 = r0
            java.lang.String r0 = "length"
            java.lang.String r1 = r5.A0N(r0, r3)
            r0 = 6
            int r0 = X.C29501aj.A00(r1, r0)
            r4.A00 = r0
            java.lang.String r0 = "resend-interval-sec"
            java.lang.String r1 = r5.A0N(r0, r3)
            r0 = 60
            int r0 = X.C29501aj.A00(r1, r0)
            r4.A01 = r0
        L_0x0046:
            java.lang.String r0 = "disabled"
            r2 = 0
            java.lang.String r1 = r5.A0N(r0, r2)
            java.lang.String r0 = "1"
            boolean r0 = r0.equals(r1)
            r4.A0C = r0
            java.lang.String r0 = "identifier"
            java.lang.String r0 = r5.A0N(r0, r2)
            r4.A03 = r0
            return
        L_0x005e:
            java.lang.String r0 = "SMS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            X.5on r0 = X.C114905on.A05
            goto L_0x0022
        L_0x0069:
            java.lang.String r0 = "PUSH"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            X.5on r0 = X.C114905on.A03
            goto L_0x0022
        L_0x0074:
            java.lang.String r0 = "EMAIL"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            X.5on r0 = X.C114905on.A04
            goto L_0x0022
        L_0x007f:
            java.lang.String r0 = "VACAT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0020
            X.5on r0 = X.C114905on.A06
            goto L_0x0022
        L_0x008a:
            java.lang.String r1 = "app-to-app"
            boolean r0 = r3.equals(r1)
            if (r0 == 0) goto L_0x00b8
            r4.A0B = r1
            r1 = 0
            java.lang.String r0 = r5.A0N(r2, r1)
            r4.A06 = r0
            java.lang.String r0 = "request-payload"
            java.lang.String r0 = r5.A0N(r0, r1)
            r4.A09 = r0
            java.lang.String r0 = "source"
            java.lang.String r0 = r5.A0N(r0, r1)
            r4.A07 = r0
            java.lang.String r0 = "intent-action"
            java.lang.String r0 = r5.A0N(r0, r1)
            r4.A08 = r0
            X.5on r0 = X.C114905on.A01
        L_0x00b5:
            r4.A02 = r0
            goto L_0x0046
        L_0x00b8:
            java.lang.String r1 = "customer-service"
            boolean r0 = r3.equals(r1)
            if (r0 == 0) goto L_0x0046
            r4.A0B = r1
            java.lang.String r0 = X.C28371Vv.A05(r5, r2)
            r4.A0A = r0
            X.5on r0 = X.C114905on.A02
            goto L_0x00b5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass638.<init>(X.1Vv):void");
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AnonymousClass03H.A00(this.A02.priority.intValue(), ((AnonymousClass638) obj).A02.priority.intValue());
    }
}
