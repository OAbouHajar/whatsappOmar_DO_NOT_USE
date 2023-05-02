package X;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.bloks.component.BloksEditText;

/* renamed from: X.0rD  reason: invalid class name and case insensitive filesystem */
public class C15490rD {
    public static final InputFilter[] A00 = new InputFilter[0];

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00f4 A[SYNTHETIC, Splitter:B:67:0x00f4] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0121 A[Catch:{ 40K -> 0x013e }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x0122 A[Catch:{ 40K -> 0x013e }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0136 A[Catch:{ 40K -> 0x013e }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(android.graphics.Typeface r8, X.C14990q7 r9, com.instagram.common.bloks.component.BloksEditText r10, X.AnonymousClass38S r11, X.C31201dg r12, java.lang.String r13) {
        /*
            r0 = 59
            r4 = 0
            boolean r0 = r12.A0P(r0, r4)
            if (r0 == 0) goto L_0x000c
            r10.setPadding(r4, r4, r4, r4)
        L_0x000c:
            r0 = 90
            X.1dg r7 = r12.A0G(r0)
            r3 = 36
            java.lang.String r2 = "TextInputBinderUtils"
            if (r7 == 0) goto L_0x0056
            r0 = 35
            X.1dg r1 = r7.A0G(r0)     // Catch:{ 40K -> 0x0050 }
            int r0 = r10.A01     // Catch:{ 40K -> 0x0050 }
            int r6 = X.C87564Xk.A01(r9, r1, r0)     // Catch:{ 40K -> 0x0050 }
            r0 = 40
            java.lang.String r0 = r7.A0J(r0)     // Catch:{ 40K -> 0x0050 }
            if (r0 != 0) goto L_0x002e
            r5 = 0
            goto L_0x0032
        L_0x002e:
            float r5 = X.C62163Bx.A01(r0)     // Catch:{ 40K -> 0x0050 }
        L_0x0032:
            java.lang.String r0 = r7.A0J(r3)     // Catch:{ 40K -> 0x0050 }
            if (r0 != 0) goto L_0x003a
            r1 = 0
            goto L_0x003e
        L_0x003a:
            float r1 = X.C62163Bx.A01(r0)     // Catch:{ 40K -> 0x0050 }
        L_0x003e:
            r0 = 38
            java.lang.String r0 = r7.A0J(r0)     // Catch:{ 40K -> 0x0050 }
            if (r0 != 0) goto L_0x0048
            r0 = 0
            goto L_0x004c
        L_0x0048:
            float r0 = X.C62163Bx.A01(r0)     // Catch:{ 40K -> 0x0050 }
        L_0x004c:
            r10.setShadowLayer(r5, r1, r0, r6)     // Catch:{ 40K -> 0x0050 }
            goto L_0x0056
        L_0x0050:
            r1 = move-exception
            java.lang.String r0 = "Error parsing text shadow"
            X.C29691b2.A01(r2, r0, r1)
        L_0x0056:
            if (r13 == 0) goto L_0x0069
            android.text.Editable r0 = r10.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = r13.equals(r0)
            if (r0 != 0) goto L_0x0069
            r10.setText(r13)
        L_0x0069:
            java.lang.String r0 = r12.A0J(r3)
            r10.setHint(r0)
            r0 = 51
            java.lang.String r0 = r12.A0J(r0)
            if (r0 == 0) goto L_0x0086
            int r0 = X.C62163Bx.A07(r0)     // Catch:{ 40K -> 0x0080 }
            r10.setGravity(r0)     // Catch:{ 40K -> 0x0080 }
            goto L_0x0086
        L_0x0080:
            r1 = move-exception
            java.lang.String r0 = "Error parsing text align"
            X.C29691b2.A01(r2, r0, r1)
        L_0x0086:
            r0 = 56
            java.lang.String r0 = r12.A0J(r0)
            r3 = 0
            if (r0 == 0) goto L_0x009a
            int r6 = X.C62163Bx.A08(r0)     // Catch:{ 40K -> 0x0094 }
            goto L_0x00a0
        L_0x0094:
            r1 = move-exception
            java.lang.String r0 = "Error parsing text input type"
            X.C29691b2.A01(r2, r0, r1)
        L_0x009a:
            if (r11 == 0) goto L_0x00ef
            int r6 = r11.A05
            if (r6 == 0) goto L_0x00ef
        L_0x00a0:
            r0 = r6 & 15
            r1 = 2
            r5 = 1
            if (r0 != r5) goto L_0x00b2
            r0 = 73
            int r0 = r12.A0A(r0, r4)
            if (r0 != r5) goto L_0x00e8
            r0 = -32769(0xffffffffffff7fff, float:NaN)
            r6 = r6 & r0
        L_0x00b2:
            int r0 = r10.getInputType()
            if (r6 == r0) goto L_0x00bb
            A06(r10, r11, r6)
        L_0x00bb:
            r0 = 49
            boolean r0 = r12.A0P(r0, r4)
            if (r0 == 0) goto L_0x00e6
            int r0 = r10.getInputType()
            boolean r0 = A08(r0)
            if (r0 != 0) goto L_0x00e6
        L_0x00cd:
            if (r11 == 0) goto L_0x00d4
            boolean r0 = r11.A0Q
            if (r0 == 0) goto L_0x00d4
            r4 = 1
        L_0x00d4:
            if (r5 == r4) goto L_0x00dd
            r10.setSingleLine(r5)
            if (r11 == 0) goto L_0x00dd
            r11.A0Q = r5
        L_0x00dd:
            r0 = 53
            java.lang.String r0 = r12.A0J(r0)
            if (r0 == 0) goto L_0x0102
            goto L_0x00f4
        L_0x00e6:
            r5 = 0
            goto L_0x00cd
        L_0x00e8:
            if (r0 != r1) goto L_0x00b2
            r0 = 32768(0x8000, float:4.5918E-41)
            r6 = r6 | r0
            goto L_0x00b2
        L_0x00ef:
            int r6 = r10.getInputType()
            goto L_0x00a0
        L_0x00f4:
            float r0 = X.C62163Bx.A02(r0)     // Catch:{ 40K -> 0x00fc }
            r10.setTextSize(r1, r0)     // Catch:{ 40K -> 0x00fc }
            goto L_0x0102
        L_0x00fc:
            r1 = move-exception
            java.lang.String r0 = "Error parsing scaled text size for text input"
            X.C29691b2.A01(r2, r0, r1)
        L_0x0102:
            if (r8 == 0) goto L_0x0107
        L_0x0104:
            r0 = 91
            goto L_0x011b
        L_0x0107:
            r0 = 54
            java.lang.String r0 = r12.A0J(r0)
            if (r0 == 0) goto L_0x0104
            int r0 = X.C62163Bx.A09(r0)     // Catch:{ 40K -> 0x0114 }
            goto L_0x0104
        L_0x0114:
            r1 = move-exception
            java.lang.String r0 = "Error parsing text style for text input"
            X.C29691b2.A01(r2, r0, r1)
            goto L_0x0104
        L_0x011b:
            java.lang.String r0 = r12.A0J(r0)     // Catch:{ 40K -> 0x013e }
            if (r0 != 0) goto L_0x0122
            goto L_0x0127
        L_0x0122:
            float r0 = X.C62163Bx.A01(r0)     // Catch:{ 40K -> 0x013e }
            goto L_0x0129
        L_0x0127:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0129:
            int r1 = (int) r0     // Catch:{ 40K -> 0x013e }
            if (r1 < 0) goto L_0x0144
            android.text.TextPaint r0 = r10.getPaint()     // Catch:{ 40K -> 0x013e }
            int r0 = r0.getFontMetricsInt(r3)     // Catch:{ 40K -> 0x013e }
            if (r1 == r0) goto L_0x0144
            int r1 = r1 - r0
            float r1 = (float) r1     // Catch:{ 40K -> 0x013e }
            r0 = 1065353216(0x3f800000, float:1.0)
            r10.setLineSpacing(r1, r0)     // Catch:{ 40K -> 0x013e }
            return
        L_0x013e:
            r1 = move-exception
            java.lang.String r0 = "Error parsing lineHeight for text input"
            X.C29691b2.A01(r2, r0, r1)
        L_0x0144:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15490rD.A00(android.graphics.Typeface, X.0q7, com.instagram.common.bloks.component.BloksEditText, X.38S, X.1dg, java.lang.String):void");
    }

    public static void A01(TextUtils.TruncateAt truncateAt, BloksEditText bloksEditText, AnonymousClass38S r4) {
        KeyListener keyListener;
        if (r4 != null && bloksEditText.getEllipsize() != truncateAt) {
            if (truncateAt == null) {
                if (r4.A0J != bloksEditText.getKeyListener()) {
                    keyListener = r4.A0J;
                }
                r4.A0G = truncateAt;
                bloksEditText.setEllipsize(truncateAt);
            }
            r4.A0J = bloksEditText.getKeyListener();
            keyListener = null;
            bloksEditText.setKeyListener(keyListener);
            r4.A0G = truncateAt;
            bloksEditText.setEllipsize(truncateAt);
        }
    }

    public static void A02(C14990q7 r4, BloksEditText bloksEditText, AnonymousClass38S r6, C31201dg r7) {
        Drawable.ConstantState constantState;
        if (r7 != null) {
            Drawable textCursorDrawable = bloksEditText.getTextCursorDrawable();
            r6.A0C = textCursorDrawable;
            if (textCursorDrawable != null && (constantState = textCursorDrawable.getConstantState()) != null) {
                Drawable newDrawable = constantState.newDrawable();
                newDrawable.setColorFilter(new PorterDuffColorFilter(C87564Xk.A01(r4, r7, 0), PorterDuff.Mode.SRC_OVER));
                bloksEditText.setTextCursorDrawable(newDrawable);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        r0 = new java.lang.StringBuilder("Unsupported value for autofill type: ");
        r0.append(r4);
        X.C29691b2.A00("TextInputBinderUtils", r0.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0058, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b6, code lost:
        if (r4.equals(r2) == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00fa, code lost:
        r3.setImportantForAutofill(1);
        r3.setAutofillHints(new java.lang.String[]{r2});
        X.C62003Bg.A00().post(new com.facebook.redex.RunnableRunnableShape1S0100000_I0((java.lang.Object) r3, 24));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0114, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.C14990q7 r2, com.instagram.common.bloks.component.BloksEditText r3, java.lang.String r4) {
        /*
            boolean r0 = r3.isAttachedToWindow()
            if (r0 != 0) goto L_0x0015
            if (r4 != 0) goto L_0x0016
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]
            r1 = 0
            r0 = 0
            r2[r0] = r1
            r3.setAutofillHints(r2)
        L_0x0012:
            r3.setImportantForAutofill(r0)
        L_0x0015:
            return
        L_0x0016:
            android.content.Context r1 = r2.A00
            java.lang.Class<android.view.autofill.AutofillManager> r0 = android.view.autofill.AutofillManager.class
            java.lang.Object r1 = r1.getSystemService(r0)
            android.view.autofill.AutofillManager r1 = (android.view.autofill.AutofillManager) r1
            if (r1 == 0) goto L_0x002f
            android.view.autofill.AutofillId r0 = r1.getNextAutofillId()
            r3.setAutofillId(r0)
            r1.requestAutofill(r3)
            r1.notifyViewClicked(r3)
        L_0x002f:
            java.lang.String r0 = "none"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0039
            r0 = 2
            goto L_0x0012
        L_0x0039:
            int r0 = r4.hashCode()
            java.lang.String r1 = "password"
            java.lang.String r2 = "username"
            switch(r0) {
                case -2053263135: goto L_0x00f0;
                case -1677176261: goto L_0x00e5;
                case -1163041205: goto L_0x00da;
                case -1122949358: goto L_0x00cf;
                case -612351174: goto L_0x00c4;
                case -397476730: goto L_0x00b9;
                case -265713450: goto L_0x00b2;
                case -177500692: goto L_0x00a6;
                case -177500691: goto L_0x009b;
                case 21980740: goto L_0x0090;
                case 96619420: goto L_0x0085;
                case 263786198: goto L_0x007a;
                case 390008550: goto L_0x006e;
                case 1216985755: goto L_0x0065;
                case 1729797393: goto L_0x0059;
                default: goto L_0x0045;
            }
        L_0x0045:
            java.lang.String r1 = "Unsupported value for autofill type: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "TextInputBinderUtils"
            X.C29691b2.A00(r0, r1)
            return
        L_0x0059:
            java.lang.String r0 = "credit_card_expiry_date"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r2 = "creditCardExpirationDate"
            goto L_0x00fa
        L_0x0065:
            boolean r0 = r4.equals(r1)
            if (r0 == 0) goto L_0x0045
            r2 = r1
            goto L_0x00fa
        L_0x006e:
            java.lang.String r0 = "credit_card_card_security_code"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r2 = "creditCardSecurityCode"
            goto L_0x00fa
        L_0x007a:
            java.lang.String r0 = "address_city"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r2 = "addressLocality"
            goto L_0x00fa
        L_0x0085:
            java.lang.String r0 = "email"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r2 = "emailAddress"
            goto L_0x00fa
        L_0x0090:
            java.lang.String r0 = "full_address"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r2 = "postalAddress"
            goto L_0x00fa
        L_0x009b:
            java.lang.String r0 = "address_street_line2"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r2 = "aptNumber"
            goto L_0x00fa
        L_0x00a6:
            java.lang.String r0 = "address_street_line1"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r2 = "streetAddress"
            goto L_0x00fa
        L_0x00b2:
            boolean r0 = r4.equals(r2)
            if (r0 != 0) goto L_0x00fa
            goto L_0x0045
        L_0x00b9:
            java.lang.String r0 = "address_state"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r2 = "addressRegion"
            goto L_0x00fa
        L_0x00c4:
            java.lang.String r0 = "phone_number"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r2 = "phone"
            goto L_0x00fa
        L_0x00cf:
            java.lang.String r0 = "credit_card_number"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r2 = "creditCardNumber"
            goto L_0x00fa
        L_0x00da:
            java.lang.String r0 = "address_country"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r2 = "addressCountry"
            goto L_0x00fa
        L_0x00e5:
            java.lang.String r0 = "full_name"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r2 = "name"
            goto L_0x00fa
        L_0x00f0:
            java.lang.String r0 = "postal_code"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0045
            java.lang.String r2 = "postalCode"
        L_0x00fa:
            r0 = 1
            r3.setImportantForAutofill(r0)
            java.lang.String[] r1 = new java.lang.String[r0]
            r0 = 0
            r1[r0] = r2
            r3.setAutofillHints(r1)
            r0 = 24
            com.facebook.redex.RunnableRunnableShape1S0100000_I0 r1 = new com.facebook.redex.RunnableRunnableShape1S0100000_I0
            r1.<init>((java.lang.Object) r3, (int) r0)
            android.os.Handler r0 = X.C62003Bg.A00()
            r0.post(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15490rD.A03(X.0q7, com.instagram.common.bloks.component.BloksEditText, java.lang.String):void");
    }

    public static void A04(BloksEditText bloksEditText) {
        for (ViewParent parent = bloksEditText.getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof RecyclerView) {
                ((ViewGroup) parent).setImportantForAutofill(1);
            }
        }
    }

    public static void A05(BloksEditText bloksEditText, AnonymousClass38S r2) {
        Drawable drawable = r2.A0C;
        if (drawable != null) {
            bloksEditText.setTextCursorDrawable(drawable);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(com.instagram.common.bloks.component.BloksEditText r2, X.AnonymousClass38S r3, int r4) {
        /*
            boolean r0 = A08(r4)
            if (r0 != 0) goto L_0x0010
            if (r3 == 0) goto L_0x001f
            int r0 = r3.A05
            boolean r0 = A08(r0)
            if (r0 == 0) goto L_0x001f
        L_0x0010:
            r2.setInputType(r4)
            r0 = 0
            A01(r0, r2, r3)
            if (r3 == 0) goto L_0x001e
            r0 = 0
            r3.A0Q = r0
        L_0x001c:
            r3.A05 = r4
        L_0x001e:
            return
        L_0x001f:
            r0 = 131087(0x2000f, float:1.83692E-40)
            r1 = r4 & r0
            r0 = 131073(0x20001, float:1.83672E-40)
            if (r1 == r0) goto L_0x0036
            if (r3 == 0) goto L_0x005d
            int r1 = r3.A05
            r0 = 131087(0x2000f, float:1.83692E-40)
            r1 = r1 & r0
            r0 = 131073(0x20001, float:1.83672E-40)
            if (r1 != r0) goto L_0x005d
        L_0x0036:
            if (r4 != 0) goto L_0x0059
            r0 = 0
            r2.setRawInputType(r0)
            java.lang.CharSequence r0 = r2.getText()
            if (r0 == 0) goto L_0x0045
            com.obwhatsapp.youbasha.others.rEntryText(r2)
        L_0x0045:
            android.content.Context r1 = r2.getContext()
            java.lang.String r0 = "input_method"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            if (r0 == 0) goto L_0x0056
            r0.restartInput(r2)
        L_0x0056:
            if (r3 == 0) goto L_0x001e
            goto L_0x001c
        L_0x0059:
            r2.setInputType(r4)
            goto L_0x0056
        L_0x005d:
            r2.setRawInputType(r4)
            java.lang.CharSequence r0 = r2.getText()
            if (r0 == 0) goto L_0x0069
            com.obwhatsapp.youbasha.others.rEntryText(r2)
        L_0x0069:
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15490rD.A06(com.instagram.common.bloks.component.BloksEditText, X.38S, int):void");
    }

    public static void A07(BloksEditText bloksEditText, AnonymousClass38S r3, boolean z2) {
        if (Build.VERSION.SDK_INT < 21) {
            bloksEditText.setKeyListener(z2 ? null : r3.A0I);
            return;
        }
        bloksEditText.setShowSoftInputOnFocus(!z2);
        bloksEditText.setOnKeyListener(z2 ? new C94124kP() : null);
    }

    public static boolean A08(int i2) {
        int i3 = i2 & 4095;
        return i3 == 129 || i3 == 225 || i3 == 18 || i3 == 145;
    }

    public static boolean A09(BloksEditText bloksEditText) {
        Editable text = bloksEditText.getText();
        return (text == null || text.length() == 0 || bloksEditText.getWidth() == 0 || bloksEditText.getLineCount() > 1 || (bloksEditText.getInputType() & 131087) == 131073 || A08(bloksEditText.getInputType())) ? false : true;
    }
}
