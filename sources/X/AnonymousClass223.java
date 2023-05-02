package X;

/* renamed from: X.223  reason: invalid class name */
public class AnonymousClass223 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;

    public AnonymousClass223(int i2, int i3, int i4, int i5, int i6) {
        this.A01 = i2;
        this.A04 = i3;
        this.A03 = i4;
        this.A00 = i5;
        this.A02 = i6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r11 == 4) goto L_0x0010;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass223 A00(java.lang.String r12) {
        /*
            java.lang.String r0 = "\\."
            java.lang.String[] r6 = r12.split(r0)     // Catch:{ Exception -> 0x003a }
            int r11 = r6.length     // Catch:{ Exception -> 0x003a }
            r5 = 4
            r4 = 1
            r3 = 3
            r2 = 0
            if (r11 == r3) goto L_0x0010
            r1 = 0
            if (r11 != r5) goto L_0x0011
        L_0x0010:
            r1 = 1
        L_0x0011:
            java.lang.String r0 = "Version name must have 3 or 4 parts"
            X.AnonymousClass00B.A0C(r0, r1)     // Catch:{ Exception -> 0x003a }
            r0 = r6[r2]     // Catch:{ Exception -> 0x003a }
            int r7 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x003a }
            r0 = r6[r4]     // Catch:{ Exception -> 0x003a }
            int r8 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x003a }
            r0 = 2
            r0 = r6[r0]     // Catch:{ Exception -> 0x003a }
            int r9 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x003a }
            if (r11 != r5) goto L_0x0037
            r0 = r6[r3]     // Catch:{ Exception -> 0x003a }
            int r10 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x003a }
        L_0x0031:
            X.223 r6 = new X.223     // Catch:{ Exception -> 0x003a }
            r6.<init>(r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x003a }
            goto L_0x0039
        L_0x0037:
            r10 = 0
            goto L_0x0031
        L_0x0039:
            return r6
        L_0x003a:
            r2 = move-exception
            java.lang.String r0 = "version/parse ["
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r12)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r2)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass223.A00(java.lang.String):X.223");
    }

    public int A01(AnonymousClass223 r5) {
        int i2 = this.A01;
        int i3 = r5.A01;
        if (i2 >= i3) {
            if (i2 <= i3) {
                int i4 = this.A04;
                int i5 = r5.A04;
                if (i4 >= i5) {
                    if (i4 <= i5) {
                        int i6 = this.A03;
                        int i7 = r5.A03;
                        if (i6 >= i7) {
                            if (i6 <= i7) {
                                int i8 = this.A00;
                                int i9 = r5.A00;
                                if (i8 >= i9) {
                                    if (i8 <= i9) {
                                        return 0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return 1;
        }
        return -1;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.A01);
        sb.append(".");
        sb.append(this.A04);
        sb.append(".");
        sb.append(this.A03);
        if (this.A02 == 4) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(".");
            sb2.append(this.A00);
            str = sb2.toString();
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }
}
