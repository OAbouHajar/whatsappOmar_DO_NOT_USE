package X;

/* renamed from: X.5zT  reason: invalid class name */
public final class AnonymousClass5zT implements C25261Jc {
    public final C25261Jc A00;
    public final C115145pD A01;
    public final C116155qu A02;

    public AnonymousClass5zT(C25261Jc r1, C115145pD r2, C116155qu r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0093, code lost:
        return r9.A00.A8l(r10, r11, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x011f, code lost:
        if (r4.equals(r0) == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0121, code lost:
        r10.A01(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01c6, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01cb, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01d0, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A8l(X.C14950q3 r10, X.C99354tt r11, X.C14970q5 r12) {
        /*
            r9 = this;
            r1 = 0
            boolean r3 = X.C110115dX.A19(r11, r10)
            r0 = 2
            X.C18450wi.A0H(r12, r0)
            java.lang.String r4 = r11.A00
            java.lang.String r0 = "wa.action.perf.TrackPerfBlock"
            boolean r0 = X.C18450wi.A0R(r4, r0)
            if (r0 == 0) goto L_0x0076
            java.util.List r0 = r10.A00
            java.lang.Object r5 = r0.get(r1)
            X.C18450wi.A0B(r5)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r0.get(r3)
            X.C18450wi.A0B(r4)
            java.lang.String r4 = (java.lang.String) r4
            X.5qu r3 = r9.A02
            if (r5 == 0) goto L_0x0056
            int r2 = r5.hashCode()
            r0 = -1564272644(0xffffffffa2c317fc, float:-5.288025E-18)
            if (r2 == r0) goto L_0x0073
            r0 = 283926139(0x10ec5e7b, float:9.323116E-29)
            if (r2 == r0) goto L_0x0058
            r0 = 646679040(0x268b8a00, float:9.682468E-16)
            if (r2 != r0) goto L_0x0056
            java.lang.String r0 = "ui_rendered"
        L_0x0040:
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0056
            X.4ap r3 = r3.A00
            X.C18450wi.A0H(r4, r1)
            java.lang.String r2 = X.C88624ap.A00(r4)
            java.lang.String r1 = "point"
        L_0x0051:
            java.lang.String r0 = ""
            r3.A01(r1, r2, r0, r0)
        L_0x0056:
            r0 = 0
            return r0
        L_0x0058:
            java.lang.String r0 = "tracking_success"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0056
            X.4ap r3 = r3.A00
            X.C18450wi.A0H(r4, r1)
            java.lang.String r1 = "annotate"
            java.lang.String r0 = "ending_surface_name"
            r3.A01(r1, r4, r0, r4)
            java.lang.String r2 = X.C88624ap.A00(r4)
            java.lang.String r1 = "end_trace_successful"
            goto L_0x0051
        L_0x0073:
            java.lang.String r0 = "shadow_bind"
            goto L_0x0040
        L_0x0076:
            java.lang.String r0 = "PAY: WaExtensions evaluate: action="
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r2 = X.AnonymousClass000.A0h(r4, r0)
            java.lang.String r0 = "Whatsapp"
            android.util.Log.d(r0, r2)
            int r0 = r4.hashCode()
            r2 = 0
            switch(r0) {
                case -1560255199: goto L_0x0126;
                case -1120004527: goto L_0x0119;
                case -246975243: goto L_0x0116;
                case 51260781: goto L_0x00da;
                case 268909162: goto L_0x009d;
                case 1206046387: goto L_0x0094;
                default: goto L_0x008d;
            }
        L_0x008d:
            X.1Jc r0 = r9.A00
            java.lang.Object r0 = r0.A8l(r10, r11, r12)
            return r0
        L_0x0094:
            java.lang.String r0 = "wa.action.novi.GetDataEnv"
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L_0x0056
            goto L_0x008d
        L_0x009d:
            java.lang.String r0 = "wa.action.CheckCpfCnpj"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x008d
            java.util.List r0 = r10.A00
            java.lang.String r2 = X.AnonymousClass000.A0n(r0, r1)
            java.lang.String r1 = "[^\\d]"
            java.lang.String r0 = ""
            java.lang.String r5 = r2.replaceAll(r1, r0)
            int r4 = r5.length()
            r0 = 11
            if (r4 != r0) goto L_0x00d3
            int[] r8 = X.C115615q2.A01
        L_0x00bd:
            r0 = 0
            r3 = 0
        L_0x00bf:
            int r2 = r4 + -2
            if (r0 >= r2) goto L_0x0154
            int r2 = r0 + 1
            r1 = r8[r2]
            char r0 = r5.charAt(r0)
            int r0 = java.lang.Character.getNumericValue(r0)
            int r1 = r1 * r0
            int r3 = r3 + r1
            r0 = r2
            goto L_0x00bf
        L_0x00d3:
            r0 = 14
            if (r4 != r0) goto L_0x01cb
            int[] r8 = X.C115615q2.A00
            goto L_0x00bd
        L_0x00da:
            java.lang.String r0 = "wa.action.CheckCardNumber"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x008d
            java.util.List r0 = r10.A00
            java.lang.String r2 = X.AnonymousClass000.A0n(r0, r1)
            java.lang.String r1 = "\\s"
            java.lang.String r0 = ""
            java.lang.String r6 = r2.replaceAll(r1, r0)
            int r5 = r6.length()
            r4 = 1
            int r5 = r5 - r3
            r3 = 0
            r2 = 0
        L_0x00f8:
            if (r5 < 0) goto L_0x01a0
            int r0 = r5 + 1
            java.lang.String r0 = r6.substring(r5, r0)
            int r1 = java.lang.Integer.parseInt(r0)
            if (r2 == 0) goto L_0x0110
            int r1 = r1 << 1
            r0 = 9
            if (r1 <= r0) goto L_0x0110
            int r0 = r1 % 10
            int r1 = r0 + 1
        L_0x0110:
            int r3 = r3 + r1
            r2 = r2 ^ 1
            int r5 = r5 + -1
            goto L_0x00f8
        L_0x0116:
            java.lang.String r0 = "wa.action.novi.EncryptLogEvent"
            goto L_0x011b
        L_0x0119:
            java.lang.String r0 = "wa.action.novi.EncryptLogEventV2"
        L_0x011b:
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x008d
            r10.A01(r1)
            goto L_0x0056
        L_0x0126:
            java.lang.String r0 = "wa.action.CheckPin"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x008d
            java.util.List r0 = r10.A00
            java.lang.String r1 = X.AnonymousClass000.A0n(r0, r1)
            int r8 = r1.length()
            int[] r7 = new int[r8]
            r6 = 9
            r5 = 0
        L_0x013d:
            if (r2 >= r8) goto L_0x01aa
            char r0 = r1.charAt(r2)
            int r0 = java.lang.Character.getNumericValue(r0)
            r7[r2] = r0
            int r6 = java.lang.Math.min(r6, r0)
            int r5 = java.lang.Math.max(r5, r0)
            int r2 = r2 + 1
            goto L_0x013d
        L_0x0154:
            int r0 = r3 % 11
            int r1 = 11 - r0
            r7 = 9
            if (r1 <= r7) goto L_0x015d
            r1 = 0
        L_0x015d:
            char r0 = r5.charAt(r2)
            int r0 = java.lang.Character.getNumericValue(r0)
            if (r0 != r1) goto L_0x01cb
            r6 = 0
            r3 = 0
        L_0x0169:
            int r2 = r4 + -1
            if (r6 >= r2) goto L_0x017c
            r1 = r8[r6]
            char r0 = r5.charAt(r6)
            int r0 = java.lang.Character.getNumericValue(r0)
            int r1 = r1 * r0
            int r3 = r3 + r1
            int r6 = r6 + 1
            goto L_0x0169
        L_0x017c:
            int r0 = r3 % 11
            int r1 = 11 - r0
            if (r1 <= r7) goto L_0x0183
            r1 = 0
        L_0x0183:
            char r0 = r5.charAt(r2)
            int r0 = java.lang.Character.getNumericValue(r0)
            if (r0 != r1) goto L_0x01cb
            r2 = 1
        L_0x018e:
            int r0 = r2 + -1
            char r1 = r5.charAt(r0)
            char r0 = r5.charAt(r2)
            if (r1 != r0) goto L_0x01c6
            r0 = 0
            int r2 = r2 + 1
            if (r2 >= r4) goto L_0x01cc
            goto L_0x018e
        L_0x01a0:
            int r0 = r3 % 10
            if (r0 == 0) goto L_0x01a5
            r4 = 0
        L_0x01a5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L_0x01aa:
            if (r6 == r5) goto L_0x01cb
            r4 = 0
            r2 = 1
        L_0x01ae:
            if (r4 >= r8) goto L_0x01cb
            r1 = r7[r4]
            int r0 = r6 + r4
            boolean r0 = X.AnonymousClass000.A1R(r1, r0)
            r3 = r3 & r0
            r1 = r7[r4]
            int r0 = r5 - r4
            boolean r0 = X.AnonymousClass000.A1R(r1, r0)
            r2 = r2 & r0
            if (r2 != 0) goto L_0x01c8
            if (r3 != 0) goto L_0x01c8
        L_0x01c6:
            r0 = 1
            goto L_0x01cc
        L_0x01c8:
            int r4 = r4 + 1
            goto L_0x01ae
        L_0x01cb:
            r0 = 0
        L_0x01cc:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5zT.A8l(X.0q3, X.4tt, X.0q5):java.lang.Object");
    }
}
