package X;

import android.text.InputFilter;

/* renamed from: X.3Ay  reason: invalid class name and case insensitive filesystem */
public class C61923Ay {
    public static final InputFilter[] A00 = new InputFilter[0];

    public static int A00(String str) {
        if (str.equals("text_no_suggestion")) {
            return 655361;
        }
        if (!str.equals("numbers_and_punctuation")) {
            try {
                return C62163Bx.A08(str);
            } catch (AnonymousClass40K e2) {
                C29691b2.A01("WaRcFormInputComponentBinderUtils", "Error parsing text input type", e2);
            }
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0163, code lost:
        if ((r8 & 128) == 128) goto L_0x0165;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair A01(android.view.View r11, X.C14990q7 r12, X.C31201dg r13, java.lang.String r14) {
        /*
            r0 = 36
            r4 = 0
            boolean r10 = r13.A0P(r0, r4)
            r0 = 2131362930(0x7f0a0472, float:1.8345654E38)
            android.view.ViewGroup r8 = X.C13700nu.A07(r11, r0)
            int r0 = r8.getChildCount()
            r2 = 0
            java.lang.String r3 = "WaRcFormInputComponentBinderUtils"
            if (r0 != 0) goto L_0x006b
            r0 = 52
            java.lang.String r0 = r13.A0J(r0)
            if (r0 == 0) goto L_0x002e
            float r0 = X.C62163Bx.A02(r0)     // Catch:{ 40K -> 0x0028 }
            java.lang.Float r9 = java.lang.Float.valueOf(r0)     // Catch:{ 40K -> 0x0028 }
            goto L_0x002f
        L_0x0028:
            r1 = move-exception
            java.lang.String r0 = "PAY: WaFormInputBinder/bindView cannot parse text size"
            X.C29691b2.A01(r3, r0, r1)
        L_0x002e:
            r9 = r2
        L_0x002f:
            android.content.Context r5 = r12.A00
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r5)
            r0 = 2131559938(0x7f0d0602, float:1.8745234E38)
            if (r10 == 0) goto L_0x003d
            r0 = 2131559939(0x7f0d0603, float:1.8745236E38)
        L_0x003d:
            android.view.View r7 = r1.inflate(r0, r2, r4)
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r5)
            r0 = 2131559936(0x7f0d0600, float:1.874523E38)
            if (r10 == 0) goto L_0x004f
            r0 = 2131559937(0x7f0d0601, float:1.8745232E38)
        L_0x004f:
            android.view.View r6 = r1.inflate(r0, r2, r4)
            android.widget.TextView r6 = (android.widget.TextView) r6
            if (r9 == 0) goto L_0x005e
            float r0 = r9.floatValue()
            r6.setTextSize(r0)
        L_0x005e:
            r5 = -1
            r1 = -2
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r5, r1)
            r7.addView(r6, r4, r0)
            r8.addView(r7)
        L_0x006b:
            r0 = 2131363114(0x7f0a052a, float:1.8346028E38)
            android.view.View r6 = X.C004601z.A0E(r11, r0)
            com.google.android.material.textfield.TextInputLayout r6 = (com.google.android.material.textfield.TextInputLayout) r6
            r0 = 2131366599(0x7f0a12c7, float:1.8353096E38)
            android.view.View r5 = X.C004601z.A0E(r6, r0)
            android.widget.EditText r5 = (android.widget.EditText) r5
            if (r14 == 0) goto L_0x008c
            java.lang.String r0 = X.C13680ns.A0f(r5)
            boolean r0 = r14.equals(r0)
            if (r0 != 0) goto L_0x008c
            r5.setText(r14)
        L_0x008c:
            r0 = 57
            java.lang.String r1 = r13.A0J(r0)
            r7 = 1
            if (r1 != 0) goto L_0x00c0
            r6.setError(r2)
            r6.setErrorEnabled(r4)
            r0 = 2131951952(0x7f130150, float:1.9540333E38)
            r6.setErrorTextAppearance(r0)
            r0 = 2131952025(0x7f130199, float:1.9540481E38)
            if (r10 == 0) goto L_0x00a9
            r0 = 2131952026(0x7f13019a, float:1.9540483E38)
        L_0x00a9:
            r6.setHintTextAppearance(r0)
            r0 = 43
            java.lang.String r0 = r13.A0J(r0)
            if (r0 == 0) goto L_0x00b7
            r6.setHint(r0)
        L_0x00b7:
            r0 = 51
            java.lang.String r0 = r13.A0J(r0)
            if (r0 == 0) goto L_0x00f8
            goto L_0x00ea
        L_0x00c0:
            r6.setErrorEnabled(r7)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x00e8
            java.lang.String r0 = " "
        L_0x00cb:
            r6.setError(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x00e1
            int r0 = r6.getChildCount()
            if (r0 <= r7) goto L_0x00e1
            android.view.View r0 = r6.getChildAt(r7)
            X.C13680ns.A13(r0)
        L_0x00e1:
            r0 = 2131951952(0x7f130150, float:1.9540333E38)
            r6.setErrorTextAppearance(r0)
            goto L_0x00a9
        L_0x00e8:
            r0 = r1
            goto L_0x00cb
        L_0x00ea:
            int r0 = X.C62163Bx.A07(r0)     // Catch:{ 40K -> 0x00f2 }
            r5.setGravity(r0)     // Catch:{ 40K -> 0x00f2 }
            goto L_0x00f8
        L_0x00f2:
            r1 = move-exception
            java.lang.String r0 = "Error parsing text align"
            X.C29691b2.A01(r3, r0, r1)
        L_0x00f8:
            r0 = 42
            java.lang.String r0 = r13.A0J(r0)
            if (r0 == 0) goto L_0x0104
            android.graphics.Typeface r0 = android.graphics.Typeface.create(r0, r4)
        L_0x0104:
            r0 = 59
            java.lang.String r1 = r13.A0J(r0)
            r0 = 53
            java.lang.String r0 = r13.A0J(r0)
            if (r1 == 0) goto L_0x0146
            int r0 = A00(r1)
            if (r0 == 0) goto L_0x011b
            r5.setInputType(r0)
        L_0x011b:
            r0 = 35
            boolean r0 = r13.A0P(r0, r4)
            r0 = r0 ^ 1
            r5.setSingleLine(r0)
            r0 = 40
            boolean r0 = r13.A0P(r0, r4)
            if (r0 == 0) goto L_0x0131
            r6.setPasswordVisibilityToggleEnabled(r7)
        L_0x0131:
            r0 = 38
            boolean r0 = r13.A0P(r0, r4)
            if (r0 == 0) goto L_0x0141
            android.text.method.PasswordTransformationMethod r0 = new android.text.method.PasswordTransformationMethod
            r0.<init>()
            r5.setTransformationMethod(r0)
        L_0x0141:
            android.util.Pair r0 = X.C13690nt.A0I(r6, r5)
            return r0
        L_0x0146:
            if (r0 == 0) goto L_0x011b
            int r8 = X.C62163Bx.A08(r0)     // Catch:{ 40K -> 0x016e }
            r1 = 32
            r0 = r8 & 32
            if (r0 == r1) goto L_0x0165
            r1 = 8192(0x2000, float:1.14794E-41)
            r0 = r8 & r1
            if (r0 == r1) goto L_0x0165
            r1 = 4096(0x1000, float:5.74E-42)
            r0 = r8 & r1
            if (r0 == r1) goto L_0x0165
            r1 = 128(0x80, float:1.794E-43)
            r0 = r8 & r1
            r2 = 0
            if (r0 != r1) goto L_0x0166
        L_0x0165:
            r2 = 1
        L_0x0166:
            if (r2 != 0) goto L_0x016a
            r8 = r8 | 16384(0x4000, float:2.2959E-41)
        L_0x016a:
            r5.setInputType(r8)     // Catch:{ 40K -> 0x016e }
            goto L_0x011b
        L_0x016e:
            r1 = move-exception
            java.lang.String r0 = "Error parsing text input type"
            X.C29691b2.A01(r3, r0, r1)
            goto L_0x011b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61923Ay.A01(android.view.View, X.0q7, X.1dg, java.lang.String):android.util.Pair");
    }
}
