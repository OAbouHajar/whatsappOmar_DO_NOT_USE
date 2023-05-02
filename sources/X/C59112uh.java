package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.common.bloks.component.BloksEditText;
import com.obwhatsapp.R;

/* renamed from: X.2uh  reason: invalid class name and case insensitive filesystem */
public class C59112uh extends C65253Tx {
    public final boolean A00;
    public final /* synthetic */ C14990q7 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r1 != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C59112uh(X.C14990q7 r3, X.C14990q7 r4, X.C31201dg r5) {
        /*
            r2 = this;
            r2.A01 = r4
            r2.<init>(r3, r5)
            r1 = 2131362244(0x7f0a01c4, float:1.8344263E38)
            android.util.SparseArray r0 = r4.A01
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0019
            boolean r1 = r0.booleanValue()
            r0 = 0
            if (r1 == 0) goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            r2.A00 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59112uh.<init>(X.0q7, X.0q7, X.1dg):void");
    }

    public static final void A00(C14990q7 r1, BloksEditText bloksEditText, C31201dg r3) {
        AnonymousClass38S r12 = (AnonymousClass38S) C62183Bz.A05(r1, r3);
        r12.A0D = bloksEditText.onSaveInstanceState();
        bloksEditText.setEnabled(true);
        bloksEditText.setKeyListener(r12.A0I);
        C13700nu.A0T(bloksEditText);
        C15490rD.A06(bloksEditText, r12, r12.A03);
        bloksEditText.setSingleLine(false);
        r12.A0Q = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0146  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0194  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b9  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01db  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01e6  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0239  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A07(android.view.View r14, X.C14990q7 r15, X.C31201dg r16, java.lang.Object r17) {
        /*
            r13 = this;
            r9 = r14
            com.instagram.common.bloks.component.BloksEditText r9 = (com.instagram.common.bloks.component.BloksEditText) r9
            r8 = r15
            r11 = r16
            java.lang.Object r10 = X.C62183Bz.A05(r15, r11)
            X.38S r10 = (X.AnonymousClass38S) r10
            r1 = r17
            r5 = r1
            X.4Gk r5 = (X.C83374Gk) r5
            java.lang.Object r0 = r10.A0N
            if (r0 == r1) goto L_0x001b
            int r0 = r5.A00
            r10.A04 = r0
            r10.A0N = r1
        L_0x001b:
            r10.A0K = r9
            float r0 = r9.getTextSize()
            r10.A00 = r0
            android.text.TextUtils$TruncateAt r0 = r9.getEllipsize()
            r10.A0F = r0
            android.os.Parcelable r0 = r10.A0D
            r2 = 0
            if (r0 == 0) goto L_0x0033
            r9.onRestoreInstanceState(r0)
            r10.A0D = r2
        L_0x0033:
            int r0 = r10.A03
            if (r0 != 0) goto L_0x003d
            int r0 = r9.getInputType()
            r10.A03 = r0
        L_0x003d:
            android.graphics.Rect r6 = r10.A0A
            int r4 = r9.getPaddingLeft()
            int r3 = r9.getPaddingTop()
            int r1 = r9.getPaddingRight()
            int r0 = r9.getPaddingBottom()
            r6.set(r4, r3, r1, r0)
            android.text.method.KeyListener r0 = r10.A0I
            if (r0 != 0) goto L_0x005c
            android.text.method.KeyListener r0 = r9.getKeyListener()
            r10.A0I = r0
        L_0x005c:
            android.text.method.KeyListener r3 = r9.getKeyListener()
            android.text.Editable r0 = r10.A0E
            java.lang.String r12 = r0.toString()
            android.graphics.Typeface r7 = r5.A01
            X.C15490rD.A00(r7, r8, r9, r10, r11, r12)
            android.text.method.KeyListener r0 = r9.getKeyListener()
            r1 = 1
            r4 = 0
            boolean r7 = X.C13680ns.A1a(r3, r0)
            int r5 = r10.A07
            r3 = -1
            if (r5 != r3) goto L_0x0274
            android.text.Editable r0 = r9.getText()
            if (r0 == 0) goto L_0x008b
            android.text.Editable r0 = r9.getText()
            int r0 = r0.length()
            r9.setSelection(r0)
        L_0x008b:
            r0 = 74
            boolean r6 = r11.A0P(r0, r1)
            r0 = 83
            java.lang.String r0 = r11.A0J(r0)
            if (r6 == 0) goto L_0x026a
            if (r0 == 0) goto L_0x0258
            android.text.method.DigitsKeyListener r5 = android.text.method.DigitsKeyListener.getInstance(r0)
            android.text.method.KeyListener r0 = r9.getKeyListener()
            if (r0 == r5) goto L_0x00a8
            r9.setKeyListener(r5)
        L_0x00a8:
            r10.A0O = r1
        L_0x00aa:
            boolean r0 = r9.isEnabled()
            if (r6 == r0) goto L_0x00b3
            r9.setEnabled(r6)
        L_0x00b3:
            boolean r6 = X.C15490rD.A09(r9)
            if (r6 == 0) goto L_0x00be
            android.text.TextUtils$TruncateAt r0 = r10.A0G
            X.C15490rD.A01(r0, r9, r10)
        L_0x00be:
            r0 = 84
            boolean r0 = r11.A0P(r0, r4)
            if (r0 == 0) goto L_0x00c9
            X.C15490rD.A07(r9, r10, r1)
        L_0x00c9:
            X.3CP r0 = r10.A0M
            if (r0 != 0) goto L_0x00d4
            X.3CP r0 = new X.3CP
            r0.<init>(r15, r11)
            r10.A0M = r0
        L_0x00d4:
            X.5MM r0 = r10.A0L
            if (r0 != 0) goto L_0x00df
            X.4tY r0 = new X.4tY
            r0.<init>(r15, r11)
            r10.A0L = r0
        L_0x00df:
            r9.A00 = r0
            X.3CP r0 = r10.A0M
            r9.removeTextChangedListener(r0)
            X.3CP r0 = r10.A0M
            r9.addTextChangedListener(r0)
            r0 = 41
            java.lang.String r0 = r11.A0J(r0)
            if (r0 == 0) goto L_0x010e
            android.text.TextWatcher r1 = r10.A0H
            if (r1 != 0) goto L_0x00fe
            X.3CU r1 = new X.3CU
            r1.<init>(r9, r0)
            r10.A0H = r1
        L_0x00fe:
            X.3CP r0 = r10.A0M
            java.util.List r0 = r0.A04
            r0.remove(r1)
            X.3CP r0 = r10.A0M
            android.text.TextWatcher r1 = r10.A0H
            java.util.List r0 = r0.A04
            r0.add(r1)
        L_0x010e:
            r0 = 42
            X.0q1 r5 = r11.A0H(r0)
            r0 = 45
            X.0q1 r1 = r11.A0H(r0)
            if (r5 != 0) goto L_0x0251
            if (r1 != 0) goto L_0x0251
            if (r6 == 0) goto L_0x0128
            X.3Cu r0 = new X.3Cu
            r0.<init>(r15, r11, r2, r2)
        L_0x0125:
            r9.setOnFocusChangeListener(r0)
        L_0x0128:
            r0 = 55
            X.1dg r1 = r11.A0G(r0)
            android.content.res.ColorStateList r0 = r9.getTextColors()
            r10.A09 = r0
            if (r1 == 0) goto L_0x0239
            int r0 = X.C87564Xk.A01(r15, r1, r4)
        L_0x013a:
            r0 = 65
            X.1dg r2 = r11.A0G(r0)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x0149
            X.C15490rD.A02(r15, r9, r10, r2)
        L_0x0149:
            android.content.res.ColorStateList r0 = r9.getHintTextColors()
            r10.A08 = r0
            r0 = 38
            X.1dg r0 = r11.A0G(r0)
            if (r0 == 0) goto L_0x015e
            int r0 = X.C87564Xk.A01(r15, r0, r4)
            r9.setHintTextColor(r0)
        L_0x015e:
            android.graphics.drawable.Drawable r0 = r9.getBackground()
            r10.A0B = r0
            r0 = 140(0x8c, float:1.96E-43)
            X.1dg r0 = r11.A0G(r0)
            if (r0 == 0) goto L_0x0178
            int r2 = X.C87564Xk.A01(r15, r0, r4)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            r9.setBackground(r0)
        L_0x0178:
            java.util.ArrayList r5 = X.AnonymousClass000.A0u()
            r0 = 40
            int r2 = r11.A0A(r0, r3)
            if (r2 <= r3) goto L_0x018c
            android.text.InputFilter$LengthFilter r0 = new android.text.InputFilter$LengthFilter
            r0.<init>(r2)
            r5.add(r0)
        L_0x018c:
            r0 = 62
            X.0q1 r2 = r11.A0H(r0)
            if (r2 == 0) goto L_0x019c
            X.4jk r0 = new X.4jk
            r0.<init>(r15, r13, r11, r2)
            r5.add(r0)
        L_0x019c:
            int r0 = r5.size()
            android.text.InputFilter[] r0 = new android.text.InputFilter[r0]
            java.lang.Object[] r0 = r5.toArray(r0)
            android.text.InputFilter[] r0 = (android.text.InputFilter[]) r0
            r9.setFilters(r0)
            int r0 = r9.getImeOptions()
            r10.A02 = r0
            r0 = 70
            java.lang.String r6 = r11.A0J(r0)
            if (r6 == 0) goto L_0x01c3
            int r0 = r6.hashCode()
            r5 = 4
            r3 = 3
            r2 = 2
            switch(r0) {
                case -906336856: goto L_0x0203;
                case 3304: goto L_0x0210;
                case 3089282: goto L_0x0217;
                case 3377907: goto L_0x021f;
                case 3526536: goto L_0x022c;
                default: goto L_0x01c3;
            }
        L_0x01c3:
            r0 = 46
            X.0q1 r2 = r11.A0H(r0)
            X.4lc r0 = new X.4lc
            r0.<init>(r15, r13, r11, r2)
            r9.setOnEditorActionListener(r0)
            r0 = 75
            java.lang.String r2 = r11.A0J(r0)
            r0 = 28
            if (r1 < r0) goto L_0x01de
            X.C15490rD.A03(r15, r9, r2)
        L_0x01de:
            r0 = 63
            boolean r0 = r11.A0P(r0, r4)
            if (r0 == 0) goto L_0x0202
            float r1 = r9.getTextSize()
            float r0 = r10.A01
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0202
            r10.A01 = r1
            X.0pz r4 = X.C62183Bz.A03(r15)
            int r0 = r11.A00
            long r2 = (long) r0
            r1 = 1
            com.instagram.common.bloks.mutations.IDxUOperationShape10S0200000_2_I1 r0 = new com.instagram.common.bloks.mutations.IDxUOperationShape10S0200000_2_I1
            r0.<init>(r13, r1, r10)
            r4.A06(r0, r2)
        L_0x0202:
            return
        L_0x0203:
            java.lang.String r0 = "search"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x01c3
            r9.setImeOptions(r3)
            goto L_0x01c3
        L_0x0210:
            java.lang.String r0 = "go"
            boolean r0 = r6.equals(r0)
            goto L_0x0226
        L_0x0217:
            java.lang.String r0 = "done"
            boolean r0 = r6.equals(r0)
            r2 = 6
            goto L_0x0226
        L_0x021f:
            java.lang.String r0 = "next"
            boolean r0 = r6.equals(r0)
            r2 = 5
        L_0x0226:
            if (r0 == 0) goto L_0x01c3
            r9.setImeOptions(r2)
            goto L_0x01c3
        L_0x022c:
            java.lang.String r0 = "send"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x01c3
            r9.setImeOptions(r5)
            goto L_0x01c3
        L_0x0239:
            r0 = 52
            java.lang.String r0 = r11.A0J(r0)
            if (r0 == 0) goto L_0x013a
            int r0 = X.C62163Bx.A05(r0)     // Catch:{ 40K -> 0x0247 }
            goto L_0x013a
        L_0x0247:
            r2 = move-exception
            java.lang.String r1 = "TextInputBinderUtils"
            java.lang.String r0 = "Error parsing text color for Text input"
            X.C29691b2.A01(r1, r0, r2)
            goto L_0x013a
        L_0x0251:
            X.3Cu r0 = new X.3Cu
            r0.<init>(r15, r11, r5, r1)
            goto L_0x0125
        L_0x0258:
            if (r7 != 0) goto L_0x0270
            boolean r0 = r10.A0O
            if (r0 != 0) goto L_0x0264
            android.text.method.KeyListener r0 = r9.getKeyListener()
            if (r0 != 0) goto L_0x0270
        L_0x0264:
            android.text.method.KeyListener r0 = r10.A0I
            r9.setKeyListener(r0)
            goto L_0x0270
        L_0x026a:
            r9.setKeyListener(r2)
            X.C15490rD.A06(r9, r10, r4)
        L_0x0270:
            r10.A0O = r4
            goto L_0x00aa
        L_0x0274:
            int r0 = r10.A06
            r9.setSelection(r5, r0)
            goto L_0x008b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59112uh.A07(android.view.View, X.0q7, X.1dg, java.lang.Object):void");
    }

    public /* bridge */ /* synthetic */ void A08(View view, C14990q7 r3, C31201dg r4, Object obj) {
        BloksEditText bloksEditText = (BloksEditText) view;
        if (this.A00) {
            A00(r3, bloksEditText, r4);
        }
    }

    public /* bridge */ /* synthetic */ void A09(View view, C14990q7 r8, C31201dg r9, Object obj) {
        BloksEditText bloksEditText = (BloksEditText) view;
        AnonymousClass38S r5 = (AnonymousClass38S) C62183Bz.A05(r8, r9);
        r5.A0E = bloksEditText.getText();
        bloksEditText.removeTextChangedListener(r5.A0M);
        TextWatcher textWatcher = r5.A0H;
        if (textWatcher != null) {
            bloksEditText.removeTextChangedListener(textWatcher);
        }
        bloksEditText.setFocusable(true);
        bloksEditText.A00 = null;
        bloksEditText.setFilters(C15490rD.A00);
        bloksEditText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        bloksEditText.setOnEditorActionListener((TextView.OnEditorActionListener) null);
        bloksEditText.setGravity(8388659);
        Typeface typeface = Typeface.DEFAULT;
        bloksEditText.setHint("");
        bloksEditText.setMaxLines(Integer.MAX_VALUE);
        bloksEditText.setImeOptions(r5.A02);
        ColorStateList colorStateList = r5.A09;
        bloksEditText.setHintTextColor(r5.A08);
        bloksEditText.setBackground(r5.A0B);
        if (Build.VERSION.SDK_INT >= 29) {
            C15490rD.A05(bloksEditText, r5);
        }
        C15490rD.A07(bloksEditText, r5, false);
        bloksEditText.setTextSize(0, r5.A00);
        Rect rect = r5.A0A;
        bloksEditText.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        r5.A0K = null;
        bloksEditText.setEllipsize(r5.A0F);
        bloksEditText.setShadowLayer(0.0f, 0.0f, 0.0f, bloksEditText.A01);
        bloksEditText.setLineSpacing(0.0f, 1.0f);
        if (!this.A00) {
            A00(r8, bloksEditText, r9);
        }
    }

    public /* bridge */ /* synthetic */ Object A7G(Context context) {
        String message;
        Boolean bool = (Boolean) this.A01.A01.get(R.id.bk_context_key_edit_text_catch_all_npes_on_init);
        if (bool == null) {
            bool = Boolean.FALSE;
        }
        boolean booleanValue = bool.booleanValue();
        try {
            BloksEditText bloksEditText = new BloksEditText(context, (AttributeSet) null);
            bloksEditText.setBackgroundResource(17170445);
            return bloksEditText;
        } catch (NullPointerException e2) {
            if (booleanValue || ((message = e2.getMessage()) != null && message.contains("ConstantState.newDrawable"))) {
                return C13680ns.A0H(LayoutInflater.from(context), (ViewGroup) null, R.layout.layout009e);
            }
            throw e2;
        }
    }
}
