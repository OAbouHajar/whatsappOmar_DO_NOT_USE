package X;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.payments.ui.BrazilDyiReportActivity;
import com.whatsapp.util.Log;

/* renamed from: X.5jP  reason: invalid class name and case insensitive filesystem */
public abstract class C112775jP extends C111385g6 {
    public View A00;
    public FrameLayout A01;
    public FrameLayout A02;
    public C17090uW A03;
    public TextEmojiLabel A04;
    public WaImageView A05;
    public WaTextView A06;
    public WaTextView A07;
    public WaTextView A08;
    public WaTextView A09;
    public WaTextView A0A;
    public C16080sP A0B;
    public AnonymousClass12W A0C;
    public C16980tz A0D;
    public AnonymousClass013 A0E;
    public C16460t6 A0F;
    public C16490t9 A0G;
    public C18340wX A0H;
    public C18300wT A0I;
    public C18310wU A0J;
    public AnonymousClass5xE A0K;
    public C18090w8 A0L;
    public C18320wV A0M;
    public C18290wS A0N;
    public C119285wq A0O;
    public C119255wn A0P;
    public AnonymousClass5xG A0Q;
    public AnonymousClass5wV A0R;
    public C118915vc A0S;
    public AnonymousClass1TR A0T;
    public C114195nH A0U;
    public AnonymousClass5z6 A0V;
    public C18280wR A0W;
    public C17220uj A0X;
    public String A0Y;
    public String A0Z = "";
    public String A0a = "";
    public boolean A0b;

    public int A35() {
        String str = this.A0Y;
        if (str.equals("business")) {
            return R.string.str0ff7;
        }
        if (str.equals("personal")) {
            return this.A0b ? R.string.str1097 : R.string.str1093;
        }
        Log.e(AnonymousClass000.A0h(str, AnonymousClass000.A0r("PAY: DyiReportBaseActivity/getDefaultReportFooterHeaderTextRes - this payment account type is not supported. Payment account type = ")));
        return -1;
    }

    public int A36() {
        String str = this.A0Y;
        if (str.equals("business")) {
            return R.string.str0744;
        }
        if (str.equals("personal")) {
            return R.string.str1440;
        }
        Log.e(AnonymousClass000.A0h(str, AnonymousClass000.A0r("PAY: DyiReportBaseActivity/getDefaultRequestReportTextRes - this payment account type is not supported. Payment account type = ")));
        return -1;
    }

    public int A37() {
        String str = this.A0Y;
        if (str.equals("business")) {
            return R.string.str0740;
        }
        if (str.equals("personal")) {
            return R.string.str0748;
        }
        Log.e(AnonymousClass000.A0h(str, AnonymousClass000.A0r("PAY: DyiReportBaseActivity/getDyiReportButtonTitleRes - this payment account type is not supported. Payment account type = ")));
        return -1;
    }

    public int A38() {
        String str = this.A0Y;
        if (str.equals("business")) {
            return R.string.str0741;
        }
        if (str.equals("personal")) {
            return R.string.str0749;
        }
        Log.e(AnonymousClass000.A0h(str, AnonymousClass000.A0r("PAY: DyiReportBaseActivity/getDyiDownloadingLabelTextRes - this payment account type is not supported. Payment account type = ")));
        return -1;
    }

    public int A39() {
        String str = this.A0Y;
        if (str.equals("business")) {
            return R.string.str089f;
        }
        if (str.equals("personal")) {
            return R.string.str08a8;
        }
        Log.e(AnonymousClass000.A0h(str, AnonymousClass000.A0r("PAY: DyiReportBaseActivity/getDyiExportButtonLabelTextRes - this payment account type is not supported. Payment account type = ")));
        return -1;
    }

    public String A3A() {
        return this.A0X.A05("payments", "how-to-request-your-payments-account-information-br").toString();
    }

    public void A3B(int i2, int i3) {
        BrazilDyiReportActivity brazilDyiReportActivity = (BrazilDyiReportActivity) this;
        (i2 == 477 ? AnonymousClass5xE.A01(brazilDyiReportActivity, (DialogInterface.OnDismissListener) null, brazilDyiReportActivity.getString(R.string.str0753), brazilDyiReportActivity.getString(R.string.str0752)) : brazilDyiReportActivity.A01.A01(brazilDyiReportActivity, brazilDyiReportActivity.A0C, brazilDyiReportActivity.A02, i2, i3)).show();
    }

    public abstract void A3C(String str);

    public boolean A3D() {
        return this.A0C.A0C(1214);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: android.text.SpannableStringBuilder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: android.text.SpannableString} */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0197, code lost:
        if (r0 == null) goto L_0x0199;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r33) {
        /*
            r32 = this;
            r10 = r32
            r13 = r33
            super.onCreate(r13)
            r0 = 2131558980(0x7f0d0244, float:1.8743291E38)
            int r12 = X.C110105dW.A01(r10, r0)
            X.02i r2 = r10.x()
            r3 = 1
            if (r2 == 0) goto L_0x0030
            r0 = 2131887935(0x7f12073f, float:1.9410491E38)
            r2.A0B(r0)
            r2.A0N(r3)
            android.content.res.Resources r1 = r10.getResources()
            r0 = 2131231589(0x7f080365, float:1.8079263E38)
            android.graphics.drawable.Drawable r0 = r1.getDrawable(r0)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass2SR.A06(r0, r12)
            r2.A0E(r0)
        L_0x0030:
            android.content.Intent r4 = r10.getIntent()
            if (r4 == 0) goto L_0x005c
            android.os.Bundle r0 = r4.getExtras()
            java.lang.String r2 = ""
            if (r0 == 0) goto L_0x00f1
            android.os.Bundle r1 = r4.getExtras()
            java.lang.String r0 = "extra_paymentProvider"
            java.lang.String r0 = r1.getString(r0, r2)
        L_0x0048:
            r10.A0Z = r0
            android.os.Bundle r0 = r4.getExtras()
            if (r0 == 0) goto L_0x00ed
            android.os.Bundle r1 = r4.getExtras()
            java.lang.String r0 = "extra_paymentAccountType"
            java.lang.String r0 = r1.getString(r0, r2)
        L_0x005a:
            r10.A0Y = r0
        L_0x005c:
            r0 = 2131363321(0x7f0a05f9, float:1.8346448E38)
            android.view.View r0 = r10.findViewById(r0)
            com.obwhatsapp.TextEmojiLabel r0 = (com.obwhatsapp.TextEmojiLabel) r0
            r10.A04 = r0
            X.C30531cW.A02(r0)
            com.obwhatsapp.TextEmojiLabel r1 = r10.A04
            X.01V r0 = r10.A08
            X.C30531cW.A03(r1, r0)
            X.0uj r2 = r10.A0X
            java.lang.String r1 = "payments"
            java.lang.String r0 = "how-to-request-your-payments-account-information-br"
            r2.A05(r1, r0)
            com.obwhatsapp.TextEmojiLabel r11 = r10.A04
            java.lang.String r1 = r10.A0Y
            java.lang.String r0 = "business"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0113
            java.lang.String r0 = "personal"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00fe
            java.lang.String r2 = r10.A3A()
            r1 = 2131890328(0x7f121098, float:1.9415345E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r9 = 0
            java.lang.String r0 = X.C13680ns.A0d(r10, r2, r0, r9, r1)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            android.text.SpannableStringBuilder r8 = new android.text.SpannableStringBuilder
            r8.<init>(r0)
            int r1 = r8.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            java.lang.Object[] r7 = r8.getSpans(r9, r1, r0)
            android.text.style.URLSpan[] r7 = (android.text.style.URLSpan[]) r7
            if (r7 == 0) goto L_0x011f
            int r6 = r7.length
            r5 = 0
        L_0x00b5:
            if (r5 >= r6) goto L_0x00f4
            r15 = r7[r5]
            int r4 = r8.getSpanStart(r15)
            int r3 = r8.getSpanEnd(r15)
            int r2 = r8.getSpanFlags(r15)
            X.0pt r14 = r10.A05
            X.01V r1 = r10.A08
            X.0uW r0 = r10.A03
            java.lang.String r20 = r15.getURL()
            X.2uk r15 = new X.2uk
            r16 = r10
            r17 = r0
            r18 = r14
            r19 = r1
            r15.<init>(r16, r17, r18, r19, r20)
            r8.setSpan(r15, r4, r3, r2)
            r1 = 2131952216(0x7f130258, float:1.9540868E38)
            android.text.style.TextAppearanceSpan r0 = new android.text.style.TextAppearanceSpan
            r0.<init>(r10, r1)
            r8.setSpan(r0, r4, r3, r2)
            int r5 = r5 + 1
            goto L_0x00b5
        L_0x00ed:
            java.lang.String r0 = "personal"
            goto L_0x005a
        L_0x00f1:
            r0 = r2
            goto L_0x0048
        L_0x00f4:
            if (r9 >= r6) goto L_0x011f
            r0 = r7[r9]
            r8.removeSpan(r0)
            int r9 = r9 + 1
            goto L_0x00f4
        L_0x00fe:
            java.lang.String r0 = "PAY: DyiReportBaseActivity/getDyiHeaderText - this payment account type is not supported. Payment account type = "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r1 = "Invalid payment account type"
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        L_0x0113:
            r0 = 2131890170(0x7f120ffa, float:1.9415024E38)
            java.lang.String r0 = r10.getString(r0)
            android.text.SpannableString r8 = new android.text.SpannableString
            r8.<init>(r0)
        L_0x011f:
            r11.setText(r8)
            r0 = 2131363322(0x7f0a05fa, float:1.834645E38)
            android.view.View r1 = r10.findViewById(r0)
            com.obwhatsapp.WaTextView r1 = (com.obwhatsapp.WaTextView) r1
            r10.A0A = r1
            int r0 = r10.A35()
            r1.setText(r0)
            r0 = 2131363320(0x7f0a05f8, float:1.8346445E38)
            android.view.View r0 = r10.findViewById(r0)
            com.obwhatsapp.WaTextView r0 = (com.obwhatsapp.WaTextView) r0
            r10.A09 = r0
            r0 = 2131363319(0x7f0a05f7, float:1.8346443E38)
            android.view.View r0 = r10.findViewById(r0)
            com.obwhatsapp.WaTextView r0 = (com.obwhatsapp.WaTextView) r0
            r10.A08 = r0
            r0 = 2131363316(0x7f0a05f4, float:1.8346437E38)
            android.view.View r0 = r10.findViewById(r0)
            com.obwhatsapp.WaImageView r0 = (com.obwhatsapp.WaImageView) r0
            r10.A05 = r0
            X.AnonymousClass2SR.A08(r0, r12)
            r0 = 2131363317(0x7f0a05f5, float:1.834644E38)
            android.view.View r0 = r10.findViewById(r0)
            com.obwhatsapp.WaTextView r0 = (com.obwhatsapp.WaTextView) r0
            r10.A07 = r0
            r0 = 2131363815(0x7f0a07e7, float:1.834745E38)
            android.view.View r0 = r10.findViewById(r0)
            com.obwhatsapp.WaTextView r0 = (com.obwhatsapp.WaTextView) r0
            r10.A06 = r0
            r0 = 2131363315(0x7f0a05f3, float:1.8346435E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r10.A02 = r0
            r0 = 2131363318(0x7f0a05f6, float:1.8346441E38)
            android.view.View r0 = r10.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r10.A01 = r0
            r0 = 2131363127(0x7f0a0537, float:1.8346054E38)
            android.view.View r0 = r10.findViewById(r0)
            r10.A00 = r0
            if (r33 == 0) goto L_0x0199
            java.lang.String r0 = "random_password"
            java.lang.String r0 = r13.getString(r0)
            r16 = 0
            if (r0 != 0) goto L_0x01bc
        L_0x0199:
            r16 = 1
            r6 = 20
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0o()
            r4 = 0
        L_0x01a2:
            double r2 = java.lang.Math.random()
            r0 = 62
            double r0 = (double) r0
            double r2 = r2 * r0
            int r1 = (int) r2
            java.lang.String r0 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
            char r0 = r0.charAt(r1)
            r5.append(r0)
            int r4 = r4 + 1
            if (r4 < r6) goto L_0x01a2
            java.lang.String r0 = r5.toString()
        L_0x01bc:
            r10.A0a = r0
            boolean r12 = r10.A3D()
            r10.A0b = r12
            X.0t3 r15 = r10.A05
            X.0pt r11 = r10.A05
            X.0sq r9 = r10.A05
            java.lang.String r8 = r10.A0a
            X.5wn r7 = r10.A0P
            X.5wV r6 = r10.A0R
            X.0wR r14 = r10.A0W
            X.0wS r13 = r10.A0N
            X.0t6 r5 = r10.A0F
            X.0wT r4 = r10.A0I
            X.0wU r3 = r10.A0J
            X.0wV r2 = r10.A0M
            X.0wP r1 = r10.A07
            X.0wX r0 = r10.A0H
            X.5vZ r20 = new X.5vZ
            r21 = r10
            r22 = r11
            r23 = r1
            r24 = r5
            r25 = r0
            r26 = r4
            r27 = r3
            r28 = r2
            r29 = r13
            r30 = r14
            r31 = r9
            r20.<init>(r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.5vc r2 = r10.A0S
            X.5wq r1 = r10.A0O
            java.lang.String r27 = "DYI-REPORT"
            X.5ug r21 = new X.5ug
            r22 = r10
            r23 = r11
            r24 = r0
            r25 = r3
            r26 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27)
            X.5xG r4 = r10.A0Q
            java.lang.String r3 = r10.A0Y
            X.5z6 r0 = new X.5z6
            r25 = r6
            r26 = r2
            r27 = r9
            r28 = r8
            r29 = r3
            r30 = r12
            r19 = r15
            r22 = r1
            r23 = r7
            r24 = r4
            r17 = r0
            r18 = r11
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r10.A0V = r0
            X.02z r1 = new X.02z
            r1.<init>((X.AnonymousClass04o) r0, (X.C001500q) r10)
            java.lang.Class<X.5nH> r0 = X.C114195nH.class
            X.01n r0 = r1.A01(r0)
            X.5nH r0 = (X.C114195nH) r0
            r10.A0U = r0
            X.027 r1 = r0.A03
            r0 = 13
            X.C110105dW.A0x(r10, r1, r0)
            X.5nH r0 = r10.A0U
            X.027 r1 = r0.A03
            r0 = 12
            X.C110105dW.A0x(r10, r1, r0)
            X.5nH r0 = r10.A0U
            X.027 r1 = r0.A00
            r0 = 15
            X.C110105dW.A0x(r10, r1, r0)
            X.5nH r0 = r10.A0U
            X.027 r1 = r0.A02
            r0 = 16
            X.C110105dW.A0x(r10, r1, r0)
            X.5nH r0 = r10.A0U
            X.027 r1 = r0.A01
            r0 = 14
            X.C110105dW.A0x(r10, r1, r0)
            X.5nH r0 = r10.A0U
            X.027 r1 = r0.A00
            r0 = 17
            X.C110105dW.A0x(r10, r1, r0)
            X.5nH r6 = r10.A0U
            java.lang.String r5 = r6.A09
            java.lang.String r0 = "personal"
            boolean r1 = r0.equals(r5)
            if (r1 == 0) goto L_0x028d
            boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x028d
            if (r16 == 0) goto L_0x028d
            X.5wn r0 = r6.A07
            r0.A05(r5)
        L_0x028d:
            X.5wn r4 = r6.A07
            monitor-enter(r4)
            int r7 = r4.A02(r5)     // Catch:{ all -> 0x0365 }
            if (r7 < 0) goto L_0x0332
            r0 = 4
            if (r7 > r0) goto L_0x0332
            r8 = 2
            if (r7 != r0) goto L_0x02bf
            X.0sb r0 = r4.A02     // Catch:{ all -> 0x0365 }
            java.io.File r0 = r0.A0H(r5)     // Catch:{ all -> 0x0365 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0365 }
            if (r0 != 0) goto L_0x02cc
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0365 }
            java.lang.String r0 = "dyiReportManager/validate-state/report-media-file-missing for account type = "
            r1.append(r0)     // Catch:{ all -> 0x0365 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r5, r1)     // Catch:{ all -> 0x0365 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0365 }
            X.0wT r0 = r4.A0A     // Catch:{ all -> 0x0365 }
            r0.A0D(r8, r5)     // Catch:{ all -> 0x0365 }
            goto L_0x034f
        L_0x02bf:
            if (r7 != r8) goto L_0x02c2
            goto L_0x02c6
        L_0x02c2:
            r0 = 3
            if (r7 != r0) goto L_0x02cc
            goto L_0x0316
        L_0x02c6:
            X.5sN r0 = r4.A03(r5)     // Catch:{ all -> 0x0365 }
            if (r0 == 0) goto L_0x031c
        L_0x02cc:
            X.0wT r0 = r4.A0A     // Catch:{ all -> 0x0365 }
            android.content.SharedPreferences r3 = r0.A01()     // Catch:{ all -> 0x0365 }
            if (r1 == 0) goto L_0x0313
            java.lang.String r2 = "payment_dyi_report_expiration_timestamp"
        L_0x02d6:
            r0 = -1
            long r2 = r3.getLong(r2, r0)     // Catch:{ all -> 0x0365 }
            if (r7 != r8) goto L_0x034f
            X.0t3 r1 = r4.A05     // Catch:{ all -> 0x0365 }
            long r7 = r1.A00()     // Catch:{ all -> 0x0365 }
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x034f
            long r0 = r1.A00()     // Catch:{ all -> 0x0365 }
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x034f
            java.lang.StringBuilder r8 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0365 }
            java.lang.String r7 = "dyiReportManager/validate-state/report-too-old for account type = "
            r8.append(r7)     // Catch:{ all -> 0x0365 }
            r8.append(r5)     // Catch:{ all -> 0x0365 }
            java.lang.String r7 = ", current:"
            r8.append(r7)     // Catch:{ all -> 0x0365 }
            r8.append(r0)     // Catch:{ all -> 0x0365 }
            java.lang.String r0 = " expired:"
            r8.append(r0)     // Catch:{ all -> 0x0365 }
            r8.append(r2)     // Catch:{ all -> 0x0365 }
            X.C13680ns.A1V(r8)     // Catch:{ all -> 0x0365 }
            r4.A05(r5)     // Catch:{ all -> 0x0365 }
            goto L_0x034f
        L_0x0313:
            java.lang.String r2 = "business_payment_dyi_report_expiration_timestamp"
            goto L_0x02d6
        L_0x0316:
            X.5sN r0 = r4.A03(r5)     // Catch:{ all -> 0x0365 }
            if (r0 != 0) goto L_0x02cc
        L_0x031c:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0365 }
            java.lang.String r0 = "dyiReportManager/validate-state/report-message-missing for account type = "
            r1.append(r0)     // Catch:{ all -> 0x0365 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r5, r1)     // Catch:{ all -> 0x0365 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0365 }
            X.0wT r0 = r4.A0A     // Catch:{ all -> 0x0365 }
            r0.A0G(r5)     // Catch:{ all -> 0x0365 }
            goto L_0x034f
        L_0x0332:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0365 }
            java.lang.String r0 = "dyiReportManager/validate-state/wrong-state for account type = "
            r1.append(r0)     // Catch:{ all -> 0x0365 }
            r1.append(r5)     // Catch:{ all -> 0x0365 }
            java.lang.String r0 = ", state = "
            r1.append(r0)     // Catch:{ all -> 0x0365 }
            java.lang.String r0 = X.AnonymousClass000.A0l(r1, r7)     // Catch:{ all -> 0x0365 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0365 }
            X.0wT r0 = r4.A0A     // Catch:{ all -> 0x0365 }
            r0.A0G(r5)     // Catch:{ all -> 0x0365 }
        L_0x034f:
            monitor-exit(r4)
            X.027 r0 = r6.A02
            X.C119255wn.A01(r0, r4, r5)
            X.027 r1 = r6.A01
            X.5sN r0 = r4.A03(r5)
            r1.A09(r0)
            android.widget.FrameLayout r1 = r10.A01
            r0 = 0
            X.C110115dX.A0s(r1, r10, r0)
            return
        L_0x0365:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112775jP.onCreate(android.os.Bundle):void");
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        String str = this.A0a;
        if (str != null) {
            bundle.putString("random_password", str);
        }
    }
}
