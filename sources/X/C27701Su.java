package X;

/* renamed from: X.1Su  reason: invalid class name and case insensitive filesystem */
public class C27701Su {
    public Long A00 = null;
    public final C14710pd A01;
    public final C16490t9 A02;
    public final C23141Aq A03;
    public final C17980vx A04;
    public final AnonymousClass2JY A05 = new AnonymousClass2JY();

    public C27701Su(C14710pd r3, C16490t9 r4, C23141Aq r5, C17980vx r6) {
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = r6;
        this.A03 = r5;
    }

    public static final Integer A00(Integer num) {
        int i2;
        switch (num.intValue()) {
            case 1:
            case 2:
            case 6:
            case 7:
            case 8:
            case 9:
            case 12:
                i2 = 1;
                break;
            case 3:
                i2 = 2;
                break;
            case 4:
            case 10:
            case 11:
                i2 = 3;
                break;
            case 5:
                i2 = 4;
                break;
            case 13:
                i2 = 5;
                break;
            default:
                return null;
        }
        return Integer.valueOf(i2);
    }

    public final C47462Jb A01() {
        C47462Jb r3 = new C47462Jb();
        if (this.A00 == null) {
            C23141Aq r2 = this.A03;
            if (r2.A00 == null) {
                r2.A00 = Long.valueOf(r2.A01.nextLong());
            }
        }
        Long l2 = this.A03.A00;
        if (l2 == null) {
            l2 = this.A00;
        }
        r3.A08 = l2;
        this.A00 = l2;
        return r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0073, code lost:
        if (r2 != 2) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C16740tZ r6, java.lang.Long r7, java.lang.String r8, int r9) {
        /*
            r5 = this;
            X.0vx r0 = r5.A04
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x007a
            X.2Jb r3 = r5.A01()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r3.A03 = r0
            X.1Vw r0 = r6.A11
            java.lang.String r0 = r0.A01
            r3.A09 = r0
            int r0 = r6.A08
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r0 = A00(r0)
            r3.A02 = r0
            byte r4 = r6.A10
            java.lang.Byte r0 = java.lang.Byte.valueOf(r4)
            r2 = 0
            if (r0 == 0) goto L_0x0040
            r1 = 2
            if (r4 == 0) goto L_0x003c
            r1 = 1
            if (r4 == r1) goto L_0x003c
            r0 = 3
            r1 = 4
            if (r4 == r0) goto L_0x003c
            r0 = 13
            if (r4 != r0) goto L_0x0040
            r1 = 5
        L_0x003c:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
        L_0x0040:
            r3.A01 = r2
            r3.A0A = r8
            if (r7 == 0) goto L_0x0048
            r3.A05 = r7
        L_0x0048:
            java.util.List r0 = r6.A0Q()
            if (r0 == 0) goto L_0x0059
            int r0 = r0.size()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3.A06 = r0
        L_0x0059:
            X.0pd r2 = r5.A01
            X.0tM r1 = X.C16620tM.A01
            r0 = 815(0x32f, float:1.142E-42)
            boolean r0 = r2.A0E(r1, r0)
            if (r0 == 0) goto L_0x0075
            X.1m6 r0 = r6.A0K
            if (r0 == 0) goto L_0x0075
            int r2 = r0.A00
            r1 = 1
            if (r2 == 0) goto L_0x007b
            r0 = 1
            r1 = 3
            if (r2 == r0) goto L_0x007b
            r1 = 2
            if (r2 == r1) goto L_0x007b
        L_0x0075:
            X.0t9 r0 = r5.A02
            r0.A05(r3)
        L_0x007a:
            return
        L_0x007b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x0075
            r3.A04 = r0
            goto L_0x0075
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27701Su.A02(X.0tZ, java.lang.Long, java.lang.String, int):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0026, code lost:
        if (r2 == false) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        if (r6.equals("request") == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.C16740tZ r5, java.lang.String r6, long r7) {
        /*
            r4 = this;
            r3 = r6
            java.lang.String r0 = "success"
            boolean r2 = r6.equals(r0)
            if (r2 != 0) goto L_0x0012
            java.lang.String r0 = "request"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0013
        L_0x0012:
            r3 = 0
        L_0x0013:
            int r0 = r6.hashCode()
            switch(r0) {
                case -1867169789: goto L_0x0024;
                case 1095692943: goto L_0x0029;
                default: goto L_0x001a;
            }
        L_0x001a:
            r1 = 12
        L_0x001c:
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            r4.A02(r5, r0, r3, r1)
            return
        L_0x0024:
            r1 = 14
            if (r2 != 0) goto L_0x001c
            goto L_0x001a
        L_0x0029:
            java.lang.String r0 = "request"
            boolean r0 = r6.equals(r0)
            r1 = 13
            if (r0 != 0) goto L_0x001c
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27701Su.A03(X.0tZ, java.lang.String, long):void");
    }
}
