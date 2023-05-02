package X;

import java.util.Arrays;

/* renamed from: X.02n  reason: invalid class name and case insensitive filesystem */
public class C005902n {
    public static final AnonymousClass0K9 A02 = AnonymousClass0K9.AUTO;
    public int A00 = 0;
    public float[] A01 = new float[0];

    public static void A00(C005902n r3, int i2) {
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

    public static boolean A01(float f2) {
        return Float.compare(f2, Float.NaN) == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0073, code lost:
        r3.append(r6[r4 + 1]);
        r3.append("%\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b3, code lost:
        r3.append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00b6, code lost:
        r3.append(r6[r4 + 1]);
        r3.append(org.apache.commons.io.IOUtils.LINE_SEPARATOR_UNIX);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0113, code lost:
        r4 = r4 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0127, code lost:
        r3.append(r7);
        r3.append(": ");
        r3.append(r0);
        r3.append(org.apache.commons.io.IOUtils.LINE_SEPARATOR_UNIX);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0144, code lost:
        r3.append(r5);
        r3.append(": ");
        r3.append(r0);
        r3.append("%\n");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0150, code lost:
        r4 = r4 + 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x015c, code lost:
        r3.append(r0);
        r4 = r4 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
            r17 = this;
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 0
        L_0x0006:
            r12 = r17
            int r0 = r12.A00
            if (r4 >= r0) goto L_0x0163
            X.0JK[] r1 = X.AnonymousClass0JK.values()
            float[] r6 = r12.A01
            r0 = r6[r4]
            int r0 = (int) r0
            r0 = r1[r0]
            int r16 = r0.ordinal()
            java.lang.String r8 = "  position"
            java.lang.String r15 = "  maxHeight: "
            java.lang.String r14 = "  minHeight: "
            java.lang.String r13 = "  height: "
            java.lang.String r11 = "  maxWidth: "
            java.lang.String r10 = "  minWidth: "
            java.lang.String r9 = "  width: "
            java.lang.String r0 = "  flexBasis: "
            java.lang.String r2 = "  margin"
            java.lang.String r1 = ": "
            java.lang.String r7 = "%\n"
            java.lang.String r5 = "\n"
            switch(r16) {
                case 0: goto L_0x0037;
                case 1: goto L_0x003a;
                case 2: goto L_0x003d;
                case 3: goto L_0x00b3;
                case 4: goto L_0x0040;
                case 5: goto L_0x0036;
                case 6: goto L_0x0044;
                case 7: goto L_0x0048;
                case 8: goto L_0x0036;
                case 9: goto L_0x004c;
                case 10: goto L_0x0050;
                case 11: goto L_0x0054;
                case 12: goto L_0x0058;
                case 13: goto L_0x005c;
                case 14: goto L_0x0060;
                case 15: goto L_0x0036;
                case 16: goto L_0x0064;
                case 17: goto L_0x0068;
                case 18: goto L_0x006c;
                case 19: goto L_0x0070;
                case 20: goto L_0x007f;
                case 21: goto L_0x0098;
                case 22: goto L_0x00b1;
                case 23: goto L_0x00c1;
                case 24: goto L_0x00da;
                case 25: goto L_0x00eb;
                case 26: goto L_0x00fc;
                case 27: goto L_0x0117;
                case 28: goto L_0x0134;
                case 29: goto L_0x0154;
                case 30: goto L_0x0157;
                case 31: goto L_0x015a;
                default: goto L_0x0036;
            }
        L_0x0036:
            goto L_0x0006
        L_0x0037:
            java.lang.String r0 = "  flex: "
            goto L_0x00b3
        L_0x003a:
            java.lang.String r0 = "  flexGrow: "
            goto L_0x00b3
        L_0x003d:
            java.lang.String r0 = "  flexShrink: "
            goto L_0x00b3
        L_0x0040:
            r3.append(r0)
            goto L_0x0073
        L_0x0044:
            r3.append(r9)
            goto L_0x00b6
        L_0x0048:
            r3.append(r9)
            goto L_0x0073
        L_0x004c:
            r3.append(r10)
            goto L_0x00b6
        L_0x0050:
            r3.append(r10)
            goto L_0x0073
        L_0x0054:
            r3.append(r11)
            goto L_0x00b6
        L_0x0058:
            r3.append(r11)
            goto L_0x0073
        L_0x005c:
            r3.append(r13)
            goto L_0x00b6
        L_0x0060:
            r3.append(r13)
            goto L_0x0073
        L_0x0064:
            r3.append(r14)
            goto L_0x00b6
        L_0x0068:
            r3.append(r14)
            goto L_0x0073
        L_0x006c:
            r3.append(r15)
            goto L_0x00b6
        L_0x0070:
            r3.append(r15)
        L_0x0073:
            int r0 = r4 + 1
            r0 = r6[r0]
            r3.append(r0)
            r3.append(r7)
            goto L_0x0113
        L_0x007f:
            X.0K9[] r2 = X.AnonymousClass0K9.values()
            float[] r1 = r12.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r2[r0]
            java.lang.String r0 = "  alignSelf: "
            r3.append(r0)
            r3.append(r1)
            r3.append(r5)
            goto L_0x0113
        L_0x0098:
            X.0KM[] r2 = X.AnonymousClass0KM.values()
            float[] r1 = r12.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r2[r0]
            java.lang.String r0 = "  positionType: "
            r3.append(r0)
            r3.append(r1)
            r3.append(r5)
            goto L_0x0113
        L_0x00b1:
            java.lang.String r0 = "  aspectRatio: "
        L_0x00b3:
            r3.append(r0)
        L_0x00b6:
            int r0 = r4 + 1
            r0 = r6[r0]
            r3.append(r0)
            r3.append(r5)
            goto L_0x0113
        L_0x00c1:
            X.0KI[] r2 = X.AnonymousClass0KI.values()
            float[] r1 = r12.A01
            int r0 = r4 + 1
            r0 = r1[r0]
            int r0 = (int) r0
            r1 = r2[r0]
            java.lang.String r0 = "  display: "
            r3.append(r0)
            r3.append(r1)
            r3.append(r5)
            goto L_0x0113
        L_0x00da:
            int r0 = r4 + 1
            r0 = r6[r0]
            int r0 = (int) r0
            X.0Kb r7 = X.C03840Kb.A00(r0)
            int r0 = r4 + 2
            r0 = r6[r0]
            r3.append(r2)
            goto L_0x0127
        L_0x00eb:
            int r0 = r4 + 1
            r0 = r6[r0]
            int r0 = (int) r0
            X.0Kb r5 = X.C03840Kb.A00(r0)
            int r0 = r4 + 2
            r0 = r6[r0]
            r3.append(r2)
            goto L_0x0144
        L_0x00fc:
            int r0 = r4 + 1
            r0 = r6[r0]
            int r0 = (int) r0
            X.0Kb r0 = X.C03840Kb.A00(r0)
            r3.append(r2)
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = "auto\n"
            r3.append(r0)
        L_0x0113:
            int r4 = r4 + 2
            goto L_0x0006
        L_0x0117:
            int r0 = r4 + 1
            r0 = r6[r0]
            int r0 = (int) r0
            X.0Kb r7 = X.C03840Kb.A00(r0)
            int r0 = r4 + 2
            r0 = r6[r0]
            r3.append(r8)
        L_0x0127:
            r3.append(r7)
            r3.append(r1)
            r3.append(r0)
            r3.append(r5)
            goto L_0x0150
        L_0x0134:
            int r0 = r4 + 1
            r0 = r6[r0]
            int r0 = (int) r0
            X.0Kb r5 = X.C03840Kb.A00(r0)
            int r0 = r4 + 2
            r0 = r6[r0]
            r3.append(r8)
        L_0x0144:
            r3.append(r5)
            r3.append(r1)
            r3.append(r0)
            r3.append(r7)
        L_0x0150:
            int r4 = r4 + 3
            goto L_0x0006
        L_0x0154:
            java.lang.String r0 = "  hasMeasureFunction: true\n"
            goto L_0x015c
        L_0x0157:
            java.lang.String r0 = "  hasBaselineFunction: true\n"
            goto L_0x015c
        L_0x015a:
            java.lang.String r0 = "  enableTextRounding: true\n"
        L_0x015c:
            r3.append(r0)
            int r4 = r4 + 1
            goto L_0x0006
        L_0x0163:
            int r0 = r3.length()
            if (r0 <= 0) goto L_0x0181
            java.lang.String r0 = "{\n"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r3.toString()
            r1.append(r0)
            java.lang.String r0 = "}"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
        L_0x0181:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C005902n.toString():java.lang.String");
    }
}
