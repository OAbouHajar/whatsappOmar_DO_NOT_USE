package X;

import java.util.Arrays;

/* renamed from: X.0W8  reason: invalid class name */
public class AnonymousClass0W8 {
    public static final AnonymousClass0KC A02 = AnonymousClass0KC.STRETCH;
    public static final AnonymousClass0K8 A03 = AnonymousClass0K8.STRETCH;
    public static final AnonymousClass0KP A04 = AnonymousClass0KP.A03;
    public static final AnonymousClass0KR A05 = AnonymousClass0KR.A03;
    public static final AnonymousClass0KO A06 = AnonymousClass0KO.A01;
    public int A00 = 0;
    public float[] A01 = new float[0];

    public static void A00(AnonymousClass0W8 r3, int i2) {
        int i3 = r3.A00 + i2;
        float[] fArr = r3.A01;
        int length = fArr.length;
        if (i3 > length) {
            int i4 = length << 1;
            if (i4 < i3) {
                i4 += i3 - i4;
            }
            r3.A01 = Arrays.copyOf(fArr, i4);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e8, code lost:
        r4 = r4 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x012e, code lost:
        r2.append(org.apache.commons.io.IOUtils.LINE_SEPARATOR_UNIX);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0131, code lost:
        r4 = r4 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x013f, code lost:
        throw X.AnonymousClass000.A0U(X.AnonymousClass000.A0r("Unknown enum value: "), r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r8 = this;
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()
            r4 = 0
        L_0x0005:
            int r0 = r8.A00
            if (r4 >= r0) goto L_0x0140
            X.0JJ[] r1 = X.AnonymousClass0JJ.values()
            float[] r5 = r8.A01
            r0 = r5[r4]
            int r0 = (int) r0
            r0 = r1[r0]
            int r0 = r0.ordinal()
            java.lang.String r7 = "  padding"
            java.lang.String r6 = ": "
            java.lang.String r3 = "\n"
            switch(r0) {
                case 0: goto L_0x0032;
                case 1: goto L_0x004e;
                case 2: goto L_0x0070;
                case 3: goto L_0x009d;
                case 4: goto L_0x00b0;
                case 5: goto L_0x00c3;
                case 6: goto L_0x00d6;
                case 7: goto L_0x00ec;
                case 8: goto L_0x0100;
                case 9: goto L_0x0119;
                case 10: goto L_0x0022;
                default: goto L_0x0021;
            }
        L_0x0021:
            goto L_0x0005
        L_0x0022:
            int r0 = r4 + 1
            r1 = r5[r0]
            java.lang.String r0 = " pointScalingFactor: "
            r2.append(r0)
            r2.append(r1)
            r2.append(r3)
            goto L_0x0005
        L_0x0032:
            int r0 = r4 + 1
            r0 = r5[r0]
            int r1 = (int) r0
            if (r1 == 0) goto L_0x004b
            r0 = 1
            if (r1 == r0) goto L_0x0048
            r0 = 2
            if (r1 != r0) goto L_0x0135
            X.0KN r1 = X.AnonymousClass0KN.A03
        L_0x0041:
            java.lang.String r0 = "  direction: "
            X.AnonymousClass000.A1F(r1, r0, r3, r2)
            goto L_0x00e8
        L_0x0048:
            X.0KN r1 = X.AnonymousClass0KN.A02
            goto L_0x0041
        L_0x004b:
            X.0KN r1 = X.AnonymousClass0KN.A01
            goto L_0x0041
        L_0x004e:
            int r0 = r4 + 1
            r0 = r5[r0]
            int r1 = (int) r0
            if (r1 == 0) goto L_0x006d
            r0 = 1
            if (r1 == r0) goto L_0x006a
            r0 = 2
            if (r1 == r0) goto L_0x0067
            r0 = 3
            if (r1 != r0) goto L_0x0135
            X.0KP r1 = X.AnonymousClass0KP.A02
        L_0x0060:
            java.lang.String r0 = "  flexDirection: "
            X.AnonymousClass000.A1F(r1, r0, r3, r2)
            goto L_0x00e8
        L_0x0067:
            X.0KP r1 = X.AnonymousClass0KP.A01
            goto L_0x0060
        L_0x006a:
            X.0KP r1 = X.AnonymousClass0KP.A04
            goto L_0x0060
        L_0x006d:
            X.0KP r1 = X.AnonymousClass0KP.A03
            goto L_0x0060
        L_0x0070:
            int r0 = r4 + 1
            r0 = r5[r0]
            int r1 = (int) r0
            if (r1 == 0) goto L_0x009a
            r0 = 1
            if (r1 == r0) goto L_0x0097
            r0 = 2
            if (r1 == r0) goto L_0x0094
            r0 = 3
            if (r1 == r0) goto L_0x0091
            r0 = 4
            if (r1 == r0) goto L_0x008e
            r0 = 5
            if (r1 != r0) goto L_0x0135
            X.0KR r1 = X.AnonymousClass0KR.A06
        L_0x0088:
            java.lang.String r0 = "  justifyContent: "
            X.AnonymousClass000.A1F(r1, r0, r3, r2)
            goto L_0x00e8
        L_0x008e:
            X.0KR r1 = X.AnonymousClass0KR.A04
            goto L_0x0088
        L_0x0091:
            X.0KR r1 = X.AnonymousClass0KR.A05
            goto L_0x0088
        L_0x0094:
            X.0KR r1 = X.AnonymousClass0KR.A02
            goto L_0x0088
        L_0x0097:
            X.0KR r1 = X.AnonymousClass0KR.A01
            goto L_0x0088
        L_0x009a:
            X.0KR r1 = X.AnonymousClass0KR.A03
            goto L_0x0088
        L_0x009d:
            X.0KC[] r5 = X.AnonymousClass0KC.values()
            float[] r1 = r8.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r5[r0]
            java.lang.String r0 = "  alignContent: "
            X.AnonymousClass000.A1F(r1, r0, r3, r2)
            goto L_0x00e8
        L_0x00b0:
            X.0K8[] r5 = X.AnonymousClass0K8.values()
            float[] r1 = r8.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r5[r0]
            java.lang.String r0 = "  alignItems: "
            X.AnonymousClass000.A1F(r1, r0, r3, r2)
            goto L_0x00e8
        L_0x00c3:
            X.0KO[] r5 = X.AnonymousClass0KO.values()
            float[] r1 = r8.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r5[r0]
            java.lang.String r0 = "  flexWrap: "
            X.AnonymousClass000.A1F(r1, r0, r3, r2)
            goto L_0x00e8
        L_0x00d6:
            X.0KJ[] r5 = X.AnonymousClass0KJ.values()
            float[] r1 = r8.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r5[r0]
            java.lang.String r0 = "  overflow: "
            X.AnonymousClass000.A1F(r1, r0, r3, r2)
        L_0x00e8:
            int r4 = r4 + 2
            goto L_0x0005
        L_0x00ec:
            int r0 = r4 + 1
            r0 = r5[r0]
            int r0 = (int) r0
            X.0Kb r1 = X.C03840Kb.A00(r0)
            int r0 = r4 + 2
            r0 = r5[r0]
            X.AnonymousClass000.A1F(r1, r7, r6, r2)
            r2.append(r0)
            goto L_0x012e
        L_0x0100:
            int r0 = r4 + 1
            r0 = r5[r0]
            int r0 = (int) r0
            X.0Kb r1 = X.C03840Kb.A00(r0)
            int r0 = r4 + 2
            r0 = r5[r0]
            X.AnonymousClass000.A1F(r1, r7, r6, r2)
            r2.append(r0)
            java.lang.String r0 = "%\n"
            r2.append(r0)
            goto L_0x0131
        L_0x0119:
            int r0 = r4 + 1
            r0 = r5[r0]
            int r0 = (int) r0
            X.0Kb r7 = X.C03840Kb.A00(r0)
            int r0 = r4 + 2
            r1 = r5[r0]
            java.lang.String r0 = "  border"
            X.AnonymousClass000.A1F(r7, r0, r6, r2)
            r2.append(r1)
        L_0x012e:
            r2.append(r3)
        L_0x0131:
            int r4 = r4 + 3
            goto L_0x0005
        L_0x0135:
            java.lang.String r0 = "Unknown enum value: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0U(r0, r1)
            throw r0
        L_0x0140:
            int r0 = r2.length()
            if (r0 <= 0) goto L_0x0156
            java.lang.String r0 = "{\n"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            X.AnonymousClass000.A1I(r2, r1)
            java.lang.String r0 = "}"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            return r0
        L_0x0156:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0W8.toString():java.lang.String");
    }
}
