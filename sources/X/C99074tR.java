package X;

/* renamed from: X.4tR  reason: invalid class name and case insensitive filesystem */
public class C99074tR implements AnonymousClass5OJ {
    public final /* synthetic */ AnonymousClass0W8 A00;
    public final /* synthetic */ C31201dg A01;

    public C99074tR(AnonymousClass0W8 r1, C31201dg r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0135  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Ahk(int r7, java.lang.Object r8) {
        /*
            r6 = this;
            r0 = 35
            if (r7 == r0) goto L_0x0184
            r1 = 36
            if (r7 == r1) goto L_0x0124
            r0 = 41
            if (r7 == r0) goto L_0x00da
            r0 = 42
            if (r7 == r0) goto L_0x0076
            r0 = 44
            if (r7 != r0) goto L_0x003d
            X.0W8 r2 = r6.A00
            java.lang.String r8 = (java.lang.String) r8
            int r0 = r8.hashCode()
            switch(r0) {
                case -1364013995: goto L_0x003f;
                case -932331738: goto L_0x004a;
                case -814425728: goto L_0x0055;
                case 1682480591: goto L_0x0060;
                case 1744442261: goto L_0x006b;
                default: goto L_0x001f;
            }
        L_0x001f:
            X.0KR r3 = X.AnonymousClass0KR.A03
        L_0x0021:
            X.0KR r0 = X.AnonymousClass0W8.A05
            if (r3 == r0) goto L_0x003d
            r0 = 2
            X.AnonymousClass0W8.A00(r2, r0)
            float[] r5 = r2.A01
            int r1 = r2.A00
            int r4 = r1 + 1
            r2.A00 = r4
            float r0 = (float) r0
            r5[r1] = r0
            int r0 = r4 + 1
            r2.A00 = r0
            int r0 = r3.mIntValue
        L_0x003a:
            float r0 = (float) r0
            r5[r4] = r0
        L_0x003d:
            r0 = 0
            return r0
        L_0x003f:
            java.lang.String r0 = "center"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x001f
            X.0KR r3 = X.AnonymousClass0KR.A01
            goto L_0x0021
        L_0x004a:
            java.lang.String r0 = "space_around"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x001f
            X.0KR r3 = X.AnonymousClass0KR.A04
            goto L_0x0021
        L_0x0055:
            java.lang.String r0 = "space_evenly"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x001f
            X.0KR r3 = X.AnonymousClass0KR.A06
            goto L_0x0021
        L_0x0060:
            java.lang.String r0 = "space_between"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x001f
            X.0KR r3 = X.AnonymousClass0KR.A05
            goto L_0x0021
        L_0x006b:
            java.lang.String r0 = "flex_end"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x001f
            X.0KR r3 = X.AnonymousClass0KR.A02
            goto L_0x0021
        L_0x0076:
            X.0W8 r3 = r6.A00
            java.lang.String r8 = (java.lang.String) r8
            X.1dg r0 = r6.A01
            java.lang.String r1 = r0.A0J(r1)
            if (r1 == 0) goto L_0x00d8
            java.lang.String r0 = "auto"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x009a
            java.lang.String r0 = "space_between"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x009a
            java.lang.String r0 = "space_around"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00d8
        L_0x009a:
            r1 = 1
        L_0x009b:
            int r0 = r8.hashCode()
            switch(r0) {
                case 3657802: goto L_0x00c0;
                case 491642861: goto L_0x00cd;
                default: goto L_0x00a2;
            }
        L_0x00a2:
            X.0KO r2 = X.AnonymousClass0KO.A01
        L_0x00a4:
            X.0KO r0 = X.AnonymousClass0W8.A06
            if (r2 == r0) goto L_0x003d
            r0 = 2
            X.AnonymousClass0W8.A00(r3, r0)
            float[] r5 = r3.A01
            int r1 = r3.A00
            int r4 = r1 + 1
            r3.A00 = r4
            r0 = 5
            float r0 = (float) r0
            r5[r1] = r0
            int r0 = r4 + 1
            r3.A00 = r0
            int r0 = r2.mIntValue
            goto L_0x003a
        L_0x00c0:
            java.lang.String r0 = "wrap"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00a2
            if (r1 != 0) goto L_0x00a2
            X.0KO r2 = X.AnonymousClass0KO.A02
            goto L_0x00a4
        L_0x00cd:
            java.lang.String r0 = "wrap_reverse"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00a2
            X.0KO r2 = X.AnonymousClass0KO.A03
            goto L_0x00a4
        L_0x00d8:
            r1 = 0
            goto L_0x009b
        L_0x00da:
            X.0W8 r2 = r6.A00
            java.lang.String r8 = (java.lang.String) r8
            int r0 = r8.hashCode()
            switch(r0) {
                case -1781065991: goto L_0x0103;
                case -1354837162: goto L_0x010e;
                case -207799939: goto L_0x0119;
                default: goto L_0x00e5;
            }
        L_0x00e5:
            X.0KP r3 = X.AnonymousClass0KP.A03
        L_0x00e7:
            X.0KP r0 = X.AnonymousClass0W8.A04
            if (r3 == r0) goto L_0x003d
            r0 = 2
            X.AnonymousClass0W8.A00(r2, r0)
            float[] r5 = r2.A01
            int r1 = r2.A00
            int r4 = r1 + 1
            r2.A00 = r4
            r0 = 1
            float r0 = (float) r0
            r5[r1] = r0
            int r0 = r4 + 1
            r2.A00 = r0
            int r0 = r3.mIntValue
            goto L_0x003a
        L_0x0103:
            java.lang.String r0 = "column_reverse"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00e5
            X.0KP r3 = X.AnonymousClass0KP.A02
            goto L_0x00e7
        L_0x010e:
            java.lang.String r0 = "column"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00e5
            X.0KP r3 = X.AnonymousClass0KP.A01
            goto L_0x00e7
        L_0x0119:
            java.lang.String r0 = "row_reverse"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x00e5
            X.0KP r3 = X.AnonymousClass0KP.A04
            goto L_0x00e7
        L_0x0124:
            X.0W8 r2 = r6.A00
            java.lang.String r8 = (java.lang.String) r8
            int r0 = r8.hashCode()
            switch(r0) {
                case -1720785339: goto L_0x014f;
                case -1364013995: goto L_0x015a;
                case -932331738: goto L_0x0165;
                case 3005871: goto L_0x0168;
                case 1384876188: goto L_0x016b;
                case 1682480591: goto L_0x0176;
                case 1744442261: goto L_0x0179;
                default: goto L_0x012f;
            }
        L_0x012f:
            X.0K8 r3 = X.AnonymousClass0K8.STRETCH
        L_0x0131:
            X.0K8 r0 = X.AnonymousClass0W8.A03
            if (r3 == r0) goto L_0x003d
            r0 = 2
            X.AnonymousClass0W8.A00(r2, r0)
            float[] r5 = r2.A01
            int r1 = r2.A00
            int r4 = r1 + 1
            r2.A00 = r4
            r0 = 4
            float r0 = (float) r0
            r5[r1] = r0
            int r0 = r4 + 1
            r2.A00 = r0
            int r0 = r3.ordinal()
            goto L_0x003a
        L_0x014f:
            java.lang.String r0 = "baseline"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x012f
            X.0K8 r3 = X.AnonymousClass0K8.BASELINE
            goto L_0x0131
        L_0x015a:
            java.lang.String r0 = "center"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x012f
            X.0K8 r3 = X.AnonymousClass0K8.CENTER
            goto L_0x0131
        L_0x0165:
            java.lang.String r0 = "space_around"
            goto L_0x017b
        L_0x0168:
            java.lang.String r0 = "auto"
            goto L_0x017b
        L_0x016b:
            java.lang.String r0 = "flex_start"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x012f
            X.0K8 r3 = X.AnonymousClass0K8.FLEX_START
            goto L_0x0131
        L_0x0176:
            java.lang.String r0 = "space_between"
            goto L_0x017b
        L_0x0179:
            java.lang.String r0 = "flex_end"
        L_0x017b:
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x012f
            X.0K8 r3 = X.AnonymousClass0K8.FLEX_END
            goto L_0x0131
        L_0x0184:
            X.0W8 r2 = r6.A00
            java.lang.String r8 = (java.lang.String) r8
            int r0 = r8.hashCode()
            switch(r0) {
                case -1881872635: goto L_0x01af;
                case -1720785339: goto L_0x01ba;
                case -1364013995: goto L_0x01c5;
                case -932331738: goto L_0x01d0;
                case 1682480591: goto L_0x01db;
                case 1744442261: goto L_0x01e6;
                default: goto L_0x018f;
            }
        L_0x018f:
            X.0KC r3 = X.AnonymousClass0KC.FLEX_START
        L_0x0191:
            X.0KC r0 = X.AnonymousClass0W8.A02
            if (r3 == r0) goto L_0x003d
            r0 = 2
            X.AnonymousClass0W8.A00(r2, r0)
            float[] r5 = r2.A01
            int r1 = r2.A00
            int r4 = r1 + 1
            r2.A00 = r4
            r0 = 3
            float r0 = (float) r0
            r5[r1] = r0
            int r0 = r4 + 1
            r2.A00 = r0
            int r0 = r3.ordinal()
            goto L_0x003a
        L_0x01af:
            java.lang.String r0 = "stretch"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x018f
            X.0KC r3 = X.AnonymousClass0KC.STRETCH
            goto L_0x0191
        L_0x01ba:
            java.lang.String r0 = "baseline"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x018f
            X.0KC r3 = X.AnonymousClass0KC.BASELINE
            goto L_0x0191
        L_0x01c5:
            java.lang.String r0 = "center"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x018f
            X.0KC r3 = X.AnonymousClass0KC.CENTER
            goto L_0x0191
        L_0x01d0:
            java.lang.String r0 = "space_around"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x018f
            X.0KC r3 = X.AnonymousClass0KC.SPACE_AROUND
            goto L_0x0191
        L_0x01db:
            java.lang.String r0 = "space_between"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x018f
            X.0KC r3 = X.AnonymousClass0KC.SPACE_BETWEEN
            goto L_0x0191
        L_0x01e6:
            java.lang.String r0 = "flex_end"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x018f
            X.0KC r3 = X.AnonymousClass0KC.FLEX_END
            goto L_0x0191
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C99074tR.Ahk(int, java.lang.Object):boolean");
    }
}
