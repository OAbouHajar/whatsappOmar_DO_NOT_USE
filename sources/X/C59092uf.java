package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;
import com.obwhatsapp.R;

/* renamed from: X.2uf  reason: invalid class name and case insensitive filesystem */
public class C59092uf extends C65253Tx {
    public final /* synthetic */ AnonymousClass1JW A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59092uf(C14990q7 r1, C31201dg r2, AnonymousClass1JW r3) {
        super(r1, r2);
        this.A00 = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0125  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x012b  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(android.view.View r16, X.C14990q7 r17, X.C31201dg r18, java.lang.Object r19) {
        /*
            r15 = this;
            r10 = r17
            r11 = r18
            java.lang.Object r12 = X.C62183Bz.A05(r10, r11)
            X.4tX r12 = (X.C99134tX) r12
            X.1JW r6 = r15.A00
            android.content.Context r0 = r10.A00
            android.app.Activity r1 = X.C19980zJ.A00(r0)
            r5 = 0
            r0 = 41
            boolean r0 = r11.A0P(r0, r5)
            if (r0 == 0) goto L_0x0024
            android.view.Window r1 = r1.getWindow()
            r0 = 8192(0x2000, float:1.14794E-41)
            r1.setFlags(r0, r0)
        L_0x0024:
            java.lang.String r0 = r12.A05
            r1 = r16
            android.util.Pair r0 = X.C61923Ay.A01(r1, r10, r11, r0)
            java.lang.Object r4 = r0.first
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            java.lang.Object r3 = r0.second
            com.google.android.material.textfield.TextInputEditText r3 = (com.google.android.material.textfield.TextInputEditText) r3
            r12.A04 = r3
            r0 = 49
            java.lang.String r1 = r11.A0J(r0)
            java.lang.String r0 = "true"
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ 1
            r3.setEnabled(r0)
            r3.setFocusableInTouchMode(r0)
            r3.setFocusable(r0)
            r2 = 1
            r3.setCursorVisible(r0)
            android.text.TextWatcher r9 = r12.A03
            if (r9 != 0) goto L_0x0065
            r7 = 58
            r0 = 0
            long r13 = r11.A0B(r0, r7)
            X.3CS r9 = new X.3CS
            r9.<init>(r10, r11, r12, r13)
            r12.A03 = r9
        L_0x0065:
            r3.addTextChangedListener(r9)
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()
            android.text.InputFilter r0 = r6.ADx()
            r7.add(r0)
            r0 = 54
            java.lang.String r1 = r11.A0J(r0)
            if (r1 == 0) goto L_0x008b
            java.lang.String r0 = "lowercase"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0160
            X.3MC r0 = new X.3MC
            r0.<init>(r15)
        L_0x0088:
            r7.add(r0)
        L_0x008b:
            r1 = 44
            r0 = -1
            int r1 = r11.A0A(r1, r0)
            if (r1 < 0) goto L_0x009c
            android.text.InputFilter$LengthFilter r0 = new android.text.InputFilter$LengthFilter
            r0.<init>(r1)
            r7.add(r0)
        L_0x009c:
            android.text.InputFilter[] r0 = new android.text.InputFilter[r5]
            java.lang.Object[] r0 = r7.toArray(r0)
            android.text.InputFilter[] r0 = (android.text.InputFilter[]) r0
            r3.setFilters(r0)
            r0 = 55
            java.lang.String r8 = r11.A0J(r0)
            r0 = 45
            java.lang.String r1 = r11.A0J(r0)
            r0 = 53
            java.lang.String r9 = r11.A0J(r0)
            r0 = 59
            java.lang.String r0 = r11.A0J(r0)
            r7 = 0
            if (r0 == 0) goto L_0x014a
            int r0 = X.C61923Ay.A00(r0)
            if (r0 == 0) goto L_0x00d9
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
        L_0x00cc:
            if (r1 != 0) goto L_0x00d0
            if (r8 == 0) goto L_0x00d9
        L_0x00d0:
            android.text.TextWatcher r0 = r6.ADL(r3, r7, r8, r1)
            r12.A02 = r0
            r3.addTextChangedListener(r0)
        L_0x00d9:
            android.text.TextWatcher r1 = r12.A02
            if (r1 == 0) goto L_0x00e4
            android.text.Editable r0 = r3.getEditableText()
            r1.afterTextChanged(r0)
        L_0x00e4:
            int r6 = r12.A01
            if (r6 < 0) goto L_0x013e
            int r1 = r12.A00
            if (r1 < r6) goto L_0x013e
            java.lang.String r0 = r12.A05
            int r0 = r0.length()
            if (r1 > r0) goto L_0x013e
            r3.setSelection(r6, r1)
        L_0x00f7:
            r0 = 46
            X.0q1 r6 = r11.A0H(r0)
            if (r6 == 0) goto L_0x0115
            r0 = 5
            com.facebook.redex.ViewOnClickCListenerShape3S0300000_I1 r1 = new com.facebook.redex.ViewOnClickCListenerShape3S0300000_I1
            r1.<init>((X.C14990q7) r10, (X.C31201dg) r11, (X.C14930q1) r6, (int) r0)
            r4.setOnClickListener(r1)
            r0 = 2131366599(0x7f0a12c7, float:1.8353096E38)
            android.view.View r0 = X.C004601z.A0E(r4, r0)
            r0.setOnClickListener(r1)
            r0.setFocusable(r5)
        L_0x0115:
            java.util.Locale r0 = java.util.Locale.getDefault()
            int r0 = X.C012406c.A00(r0)
            if (r0 != r2) goto L_0x0120
            r5 = 1
        L_0x0120:
            r1 = 5
            r2 = 3
            r0 = 3
            if (r5 == 0) goto L_0x0126
            r0 = 5
        L_0x0126:
            r4.setGravity(r0)
            if (r5 != 0) goto L_0x012c
            r1 = 3
        L_0x012c:
            r3.setGravity(r1)
            if (r7 == 0) goto L_0x013d
            int r1 = r7.intValue()
            r0 = 2
            if (r1 == r0) goto L_0x0170
            if (r1 == r2) goto L_0x0170
            r0 = 4
            if (r1 == r0) goto L_0x0170
        L_0x013d:
            return
        L_0x013e:
            java.lang.String r0 = r12.A05
            if (r0 == 0) goto L_0x00f7
            int r0 = r0.length()
            r3.setSelection(r0)
            goto L_0x00f7
        L_0x014a:
            if (r9 == 0) goto L_0x00d9
            int r0 = X.C62163Bx.A08(r9)     // Catch:{ 40K -> 0x0156 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ 40K -> 0x0156 }
            goto L_0x00cc
        L_0x0156:
            r6 = move-exception
            java.lang.String r1 = "WaRcFormInputComponentBinderUtils"
            java.lang.String r0 = "Error parsing text input type"
            X.C29691b2.A01(r1, r0, r6)
            goto L_0x00d9
        L_0x0160:
            java.lang.String r0 = "uppercase"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x008b
            android.text.InputFilter$AllCaps r0 = new android.text.InputFilter$AllCaps
            r0.<init>()
            goto L_0x0088
        L_0x0170:
            X.C45902Bo.A03(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59092uf.A07(android.view.View, X.0q7, X.1dg, java.lang.Object):void");
    }

    public void A08(View view, C14990q7 r4, C31201dg r5, Object obj) {
        C13700nu.A07(view, R.id.container).removeAllViews();
        C19980zJ.A00(r4.A00).getWindow().clearFlags(8192);
    }

    public void A09(View view, C14990q7 r8, C31201dg r9, Object obj) {
        C99134tX r5 = (C99134tX) C62183Bz.A05(r8, r9);
        r5.A04 = null;
        if (C13700nu.A07(view, R.id.container).getChildCount() != 0) {
            TextInputLayout textInputLayout = (TextInputLayout) C004601z.A0E(view, R.id.default_text_input_layout);
            EditText editText = (EditText) C004601z.A0E(textInputLayout, R.id.text_view);
            r5.A00 = editText.getSelectionEnd();
            r5.A01 = editText.getSelectionStart();
            r5.A05 = C13680ns.A0f(editText);
            editText.removeTextChangedListener(r5.A03);
            editText.setText("");
            TextWatcher textWatcher = r5.A02;
            if (textWatcher != null) {
                editText.removeTextChangedListener(textWatcher);
            }
            editText.setFilters(C61923Ay.A00);
            Typeface typeface = Typeface.DEFAULT;
            editText.setEnabled(true);
            editText.setFocusableInTouchMode(true);
            editText.setFocusable(true);
            editText.setCursorVisible(true);
            textInputLayout.setPasswordVisibilityToggleEnabled(true);
            textInputLayout.setError((CharSequence) null);
            textInputLayout.setErrorEnabled(false);
            textInputLayout.setHint("");
        }
    }

    public /* bridge */ /* synthetic */ Object A7G(Context context) {
        return View.inflate(context, R.layout.layout05ff, (ViewGroup) null);
    }
}
