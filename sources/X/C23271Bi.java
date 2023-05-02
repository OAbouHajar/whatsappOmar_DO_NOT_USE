package X;

/* renamed from: X.1Bi  reason: invalid class name and case insensitive filesystem */
public class C23271Bi {
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e4, code lost:
        r0 = new java.lang.StringBuilder("can't parse orientation value: ");
        r0.append(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f7, code lost:
        throw new X.AnonymousClass40K(r0.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.drawable.Drawable A01(X.C14990q7 r15, X.C31201dg r16, X.C31201dg r17) {
        /*
            r14 = this;
            r1 = r16
            int r3 = r1.A01
            r2 = 13318(0x3406, float:1.8662E-41)
            r0 = 35
            r7 = r17
            if (r3 == r2) goto L_0x01a3
            r0 = 13322(0x340a, float:1.8668E-41)
            if (r3 == r0) goto L_0x00bc
            r0 = 13330(0x3412, float:1.868E-41)
            if (r3 == r0) goto L_0x016b
            r0 = 13332(0x3414, float:1.8682E-41)
            if (r3 == r0) goto L_0x0022
            r0 = 13340(0x341c, float:1.8693E-41)
            if (r3 == r0) goto L_0x015b
            android.graphics.drawable.ColorDrawable r3 = new android.graphics.drawable.ColorDrawable
            r3.<init>()
        L_0x0021:
            return r3
        L_0x0022:
            android.graphics.drawable.StateListDrawable r3 = new android.graphics.drawable.StateListDrawable
            r3.<init>()
            r0 = 6
            android.graphics.drawable.Drawable[] r4 = new android.graphics.drawable.Drawable[r0]
            r5 = 35
            java.util.List r2 = r1.A0M(r5)
            r13 = 0
            r1 = 0
        L_0x0032:
            int r0 = r2.size()
            if (r1 >= r0) goto L_0x00a9
            java.lang.Object r8 = r2.get(r1)
            X.1dg r8 = (X.C31201dg) r8
            X.1dg r6 = r8.A0G(r5)
            if (r6 != 0) goto L_0x009e
            java.lang.String r6 = "StateDrawableUtils"
            java.lang.String r0 = "Null Drawable model when creating children of a StateDrawable"
            X.C29691b2.A00(r6, r0)
            android.graphics.drawable.ColorDrawable r12 = new android.graphics.drawable.ColorDrawable
            r12.<init>()
        L_0x0050:
            r6 = 36
            java.lang.String r0 = ""
            java.lang.String r10 = r8.A0K(r6, r0)
            int r0 = r10.hashCode()
            r11 = 4
            r9 = 3
            r8 = 2
            r6 = 1
            switch(r0) {
                case -691041417: goto L_0x0066;
                case -318264286: goto L_0x0071;
                case 270940796: goto L_0x007c;
                case 1191572123: goto L_0x0087;
                case 1544803905: goto L_0x0093;
                default: goto L_0x0063;
            }
        L_0x0063:
            int r1 = r1 + 1
            goto L_0x0032
        L_0x0066:
            java.lang.String r0 = "focused"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0063
            r4[r6] = r12
            goto L_0x0063
        L_0x0071:
            java.lang.String r0 = "pressed"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0063
            r4[r9] = r12
            goto L_0x0063
        L_0x007c:
            java.lang.String r0 = "disabled"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0063
            r4[r11] = r12
            goto L_0x0063
        L_0x0087:
            java.lang.String r0 = "selected"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0063
            r4[r8] = r12
            goto L_0x0063
        L_0x0093:
            java.lang.String r0 = "default"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0063
            r4[r13] = r12
            goto L_0x0063
        L_0x009e:
            X.4da r0 = X.C90154da.A00()
            X.1Bi r0 = r0.A06
            android.graphics.drawable.Drawable r12 = r0.A01(r15, r6, r7)
            goto L_0x0050
        L_0x00a9:
            r2 = 5
        L_0x00aa:
            r0 = r4[r2]
            if (r0 == 0) goto L_0x00b7
            int[][] r0 = X.AnonymousClass497.A00
            r1 = r0[r2]
            r0 = r4[r2]
            r3.addState(r1, r0)
        L_0x00b7:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x0021
            goto L_0x00aa
        L_0x00bc:
            r0 = 35
            X.1dg r4 = r1.A0G(r0)
            r0 = 36
            X.1dg r3 = r1.A0G(r0)
            if (r4 == 0) goto L_0x019b
            if (r3 == 0) goto L_0x019b
            r0 = 38
            X.1dg r8 = r1.A0G(r0)
            r0 = 40
            java.lang.String r2 = r1.A0J(r0)
            if (r2 != 0) goto L_0x00dd
            android.graphics.drawable.GradientDrawable$Orientation r9 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM     // Catch:{ 40K -> 0x0126 }
            goto L_0x0130
        L_0x00dd:
            int r0 = r2.hashCode()     // Catch:{ 40K -> 0x0126 }
            switch(r0) {
                case -1451623918: goto L_0x00f8;
                case -1118360059: goto L_0x0103;
                case 404498110: goto L_0x010f;
                case 1553519760: goto L_0x011b;
                default: goto L_0x00e4;
            }     // Catch:{ 40K -> 0x0126 }
        L_0x00e4:
            java.lang.String r1 = "can't parse orientation value: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ 40K -> 0x0126 }
            r0.<init>(r1)     // Catch:{ 40K -> 0x0126 }
            r0.append(r2)     // Catch:{ 40K -> 0x0126 }
            java.lang.String r1 = r0.toString()     // Catch:{ 40K -> 0x0126 }
            X.40K r0 = new X.40K     // Catch:{ 40K -> 0x0126 }
            r0.<init>(r1)     // Catch:{ 40K -> 0x0126 }
            throw r0     // Catch:{ 40K -> 0x0126 }
        L_0x00f8:
            java.lang.String r0 = "bottom_left_to_top_right"
            boolean r0 = r2.equals(r0)     // Catch:{ 40K -> 0x0126 }
            if (r0 == 0) goto L_0x00e4
            android.graphics.drawable.GradientDrawable$Orientation r9 = android.graphics.drawable.GradientDrawable.Orientation.BL_TR     // Catch:{ 40K -> 0x0126 }
            goto L_0x0130
        L_0x0103:
            java.lang.String r0 = "top_to_bottom"
            boolean r0 = r2.equals(r0)     // Catch:{ 40K -> 0x0126 }
            if (r0 == 0) goto L_0x00e4
            android.graphics.drawable.GradientDrawable$Orientation r9 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM     // Catch:{ 40K -> 0x0126 }
            goto L_0x0130
        L_0x010f:
            java.lang.String r0 = "top_left_to_bottom_right"
            boolean r0 = r2.equals(r0)     // Catch:{ 40K -> 0x0126 }
            if (r0 == 0) goto L_0x00e4
            android.graphics.drawable.GradientDrawable$Orientation r9 = android.graphics.drawable.GradientDrawable.Orientation.TL_BR     // Catch:{ 40K -> 0x0126 }
            goto L_0x0130
        L_0x011b:
            java.lang.String r0 = "left_to_right"
            boolean r0 = r2.equals(r0)     // Catch:{ 40K -> 0x0126 }
            if (r0 == 0) goto L_0x00e4
            android.graphics.drawable.GradientDrawable$Orientation r9 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT     // Catch:{ 40K -> 0x0126 }
            goto L_0x0130
        L_0x0126:
            r2 = move-exception
            java.lang.String r1 = "GradientDrawableUtils"
            java.lang.String r0 = "Error parsing orientation for GradientDrawable"
            X.C29691b2.A01(r1, r0, r2)
            android.graphics.drawable.GradientDrawable$Orientation r9 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
        L_0x0130:
            r6 = 0
            int r5 = X.C87564Xk.A01(r15, r4, r6)
            int r4 = X.C87564Xk.A01(r15, r3, r6)
            r3 = 1
            r2 = 2
            if (r8 == 0) goto L_0x0154
            int r1 = X.C87564Xk.A01(r15, r8, r6)
            r0 = 3
            int[] r0 = new int[r0]
            r0[r6] = r5
            r0[r3] = r1
            r0[r2] = r4
        L_0x014a:
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>(r9, r0)
            if (r17 == 0) goto L_0x0021
            r0 = 46
            goto L_0x0170
        L_0x0154:
            int[] r0 = new int[r2]
            r0[r6] = r5
            r0[r3] = r4
            goto L_0x014a
        L_0x015b:
            r0 = 35
            X.1dg r1 = r1.A0G(r0)     // Catch:{ 40K -> 0x01b6 }
            r0 = 0
            int r0 = X.C87564Xk.A01(r15, r1, r0)     // Catch:{ 40K -> 0x01b6 }
            X.2nR r3 = X.C61833Ao.A01(r15, r7, r0)     // Catch:{ 40K -> 0x01b6 }
            return r3
        L_0x016b:
            android.graphics.drawable.Drawable r3 = X.AnonymousClass496.A00(r15, r1, r7)
            return r3
        L_0x0170:
            java.lang.String r0 = r7.A0J(r0)     // Catch:{ 40K -> 0x0193 }
            if (r0 != 0) goto L_0x0178
            r2 = 0
            goto L_0x017c
        L_0x0178:
            float r2 = X.C62163Bx.A01(r0)     // Catch:{ 40K -> 0x0193 }
        L_0x017c:
            r0 = 56
            java.util.List r1 = r7.A0N(r0)     // Catch:{ 40K -> 0x0193 }
            r0 = 15
            int r1 = X.C89544cP.A00(r1, r0)     // Catch:{ 40K -> 0x0193 }
            r0 = 8
            float[] r0 = new float[r0]     // Catch:{ 40K -> 0x0193 }
            X.C89544cP.A01(r0, r2, r1)     // Catch:{ 40K -> 0x0193 }
            r3.setCornerRadii(r0)     // Catch:{ 40K -> 0x0193 }
            return r3
        L_0x0193:
            java.lang.String r1 = "GradientDrawableUtils"
            java.lang.String r0 = "Error parsing Corner radius for Box decoration"
            X.C29691b2.A00(r1, r0)
            return r3
        L_0x019b:
            java.lang.String r1 = "Gradient drawable received with null begin or end color"
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r1)
            throw r0
        L_0x01a3:
            java.lang.String r0 = r1.A0J(r0)     // Catch:{ 40K -> 0x01b0 }
            int r0 = X.C62163Bx.A05(r0)     // Catch:{ 40K -> 0x01b0 }
            X.2nR r3 = X.C61833Ao.A01(r15, r7, r0)     // Catch:{ 40K -> 0x01b0 }
            return r3
        L_0x01b0:
            r2 = move-exception
            java.lang.String r1 = "ColorDrawableUtils"
            java.lang.String r0 = "Error parsing color for ColorDrawable"
            goto L_0x01bb
        L_0x01b6:
            r2 = move-exception
            java.lang.String r1 = "ThemedColorDrawableUtils"
            java.lang.String r0 = "Parse error for ThemedColorDrawable"
        L_0x01bb:
            X.C29691b2.A01(r1, r0, r2)
            X.2nR r3 = new X.2nR
            r3.<init>()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23271Bi.A01(X.0q7, X.1dg, X.1dg):android.graphics.drawable.Drawable");
    }
}
