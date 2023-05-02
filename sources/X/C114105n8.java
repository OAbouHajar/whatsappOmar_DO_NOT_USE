package X;

import java.util.concurrent.TimeUnit;

/* renamed from: X.5n8  reason: invalid class name and case insensitive filesystem */
public class C114105n8 extends C110695eg {
    public static final long A0D = TimeUnit.MINUTES.toMillis(15);
    public static final long A0E;
    public static final long A0F;
    public static final long A0G;
    public final AnonymousClass027 A00 = C13690nt.A0O();
    public final AnonymousClass027 A01 = C13690nt.A0O();
    public final C221116r A02;
    public final AnonymousClass173 A03;
    public final C14710pd A04;
    public final AnonymousClass60V A05;
    public final AnonymousClass175 A06;
    public final AnonymousClass1MA A07;
    public final AnonymousClass1Vo A08 = AnonymousClass1Vo.A00("IndiaPaymentSettingsViewModel", "payment", "IN");
    public final C116715rp A09;
    public final C227719f A0A;
    public final C14860ps A0B;
    public final C16320sq A0C;

    static {
        TimeUnit timeUnit = TimeUnit.DAYS;
        A0G = timeUnit.toMillis(90);
        A0F = timeUnit.toMillis(30);
        A0E = timeUnit.toMillis(1);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C114105n8(X.C16440t3 r12, X.AnonymousClass013 r13, X.C221116r r14, X.AnonymousClass173 r15, X.C18030w2 r16, X.C14710pd r17, X.AnonymousClass60V r18, X.AnonymousClass175 r19, X.C18300wT r20, X.C18290wS r21, X.AnonymousClass1MA r22, X.C1222969a r23, X.C116715rp r24, X.C227719f r25, X.C14860ps r26, X.C16320sq r27) {
        /*
            r11 = this;
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r16
            r7 = r17
            r8 = r20
            r9 = r21
            r10 = r23
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            X.027 r0 = X.C13690nt.A0O()
            r11.A01 = r0
            X.027 r0 = X.C13690nt.A0O()
            r11.A00 = r0
            java.lang.String r2 = "IndiaPaymentSettingsViewModel"
            java.lang.String r1 = "payment"
            java.lang.String r0 = "IN"
            X.1Vo r0 = X.AnonymousClass1Vo.A00(r2, r1, r0)
            r11.A08 = r0
            r11.A04 = r7
            r0 = r27
            r11.A0C = r0
            r0 = r19
            r11.A06 = r0
            r0 = r26
            r11.A0B = r0
            r11.A03 = r15
            r0 = r24
            r11.A09 = r0
            r11.A02 = r14
            r0 = r22
            r11.A07 = r0
            r0 = r18
            r11.A05 = r0
            r0 = r25
            r11.A0A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114105n8.<init>(X.0t3, X.013, X.16r, X.173, X.0w2, X.0pd, X.60V, X.175, X.0wT, X.0wS, X.1MA, X.69a, X.5rp, X.19f, X.0ps, X.0sq):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (X.C110115dX.A17(r14.A09.A01(), "payments_home_scan_to_pay_banner_dismissed") != false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00de, code lost:
        r1 = r0.A08;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0H() {
        /*
            r14 = this;
            X.0pd r6 = r14.A04
            r0 = 2319(0x90f, float:3.25E-42)
            boolean r0 = r6.A0C(r0)
            if (r0 == 0) goto L_0x0019
            X.0wT r0 = r14.A09
            android.content.SharedPreferences r1 = r0.A01()
            java.lang.String r0 = "payments_home_scan_to_pay_banner_dismissed"
            boolean r1 = X.C110115dX.A17(r1, r0)
            r0 = 1
            if (r1 == 0) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            r13 = 6
            if (r0 != 0) goto L_0x023b
            r0 = 1644(0x66c, float:2.304E-42)
            boolean r0 = r6.A0C(r0)
            if (r0 == 0) goto L_0x0037
            X.60V r2 = r14.A05
            java.lang.String r1 = r2.A08()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x015e
            boolean r0 = r2.A0T(r1)
            if (r0 == 0) goto L_0x015e
        L_0x0037:
            X.175 r2 = r14.A06
            boolean r0 = r2.A0C()
            if (r0 == 0) goto L_0x0069
            X.60V r0 = r14.A05
            java.lang.String r0 = r0.A08()
            boolean r0 = X.AnonymousClass5w2.A00(r6, r0)
            if (r0 == 0) goto L_0x0069
            X.19f r0 = r14.A0A
            java.util.Set r0 = r0.A01
            java.util.Set r0 = X.C003101j.A0F(r0)
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0069
            X.0wT r0 = r14.A09
            android.content.SharedPreferences r1 = r0.A01()
            java.lang.String r0 = "payments_home_add_upi_number_banner_dismissed"
            boolean r0 = X.C110115dX.A17(r1, r0)
            if (r0 != 0) goto L_0x0069
            r3 = 4
        L_0x0068:
            return r3
        L_0x0069:
            java.util.List r0 = r14.A02
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0093
            java.util.List r0 = r14.A04
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0093
            java.util.List r0 = r14.A03
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0093
            X.5rp r0 = r14.A09
            X.0wT r0 = r0.A01
            android.content.SharedPreferences r1 = r0.A01()
            java.lang.String r0 = "settingsQuickTipDismissedState"
            boolean r0 = X.C110115dX.A17(r1, r0)
            if (r0 != 0) goto L_0x0093
            r3 = 2
            return r3
        L_0x0093:
            X.0wT r7 = r14.A09
            android.content.SharedPreferences r1 = r7.A01()
            java.lang.String r0 = "payments_home_onboarding_banner_dismissed"
            r3 = 0
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 != 0) goto L_0x00b6
            android.content.SharedPreferences r1 = r7.A01()
            java.lang.String r0 = "payments_resume_onboarding_banner_started"
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 == 0) goto L_0x00b6
            boolean r0 = r2.A0C()
            if (r0 != 0) goto L_0x00b6
            r3 = 1
            return r3
        L_0x00b6:
            X.027 r3 = r14.A01
            java.lang.Object r0 = r3.A01()
            r1 = 1
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r0 = r3.A01()
            X.5wk r0 = (X.C119225wk) r0
            int r0 = r0.A01
            r3 = 3
            if (r0 == r1) goto L_0x0068
        L_0x00ca:
            r0 = 2704(0xa90, float:3.789E-42)
            boolean r0 = r6.A0C(r0)
            if (r0 == 0) goto L_0x017f
            X.0wS r0 = r14.A0A
            X.160 r0 = X.C110115dX.A0H(r0)
            X.1cl r0 = r0.A06()
            if (r0 == 0) goto L_0x015c
            X.1tF r1 = r0.A08
            if (r1 == 0) goto L_0x015c
            boolean r0 = r1 instanceof X.C111805hR
            if (r0 == 0) goto L_0x015c
            X.5hR r1 = (X.C111805hR) r1
        L_0x00e8:
            X.0ps r0 = r14.A0B
            java.lang.String r0 = r0.A01()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x017f
            boolean r0 = r2.A0C()
            if (r0 == 0) goto L_0x017f
            if (r1 == 0) goto L_0x017f
            X.1lh r0 = r1.A05
            if (r0 == 0) goto L_0x017f
            java.lang.Object r0 = r0.A00
            boolean r0 = X.AnonymousClass000.A1X(r0)
            if (r0 != 0) goto L_0x017f
            X.0t3 r0 = r14.A05
            long r4 = r0.A00()
            android.content.SharedPreferences r0 = r7.A01()
            java.lang.String r8 = "payments_home_recovery_upin_upsell_banner_display"
            long r11 = X.C13680ns.A08(r0, r8)
            android.content.SharedPreferences r2 = r7.A01()
            java.lang.String r9 = "payments_home_recovery_upin_upsell_banner_impression"
            r0 = 10
            long r2 = r2.getLong(r9, r0)
            r0 = 0
            int r10 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x0130
            int r10 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r10 >= 0) goto L_0x0168
        L_0x0130:
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x0168
            android.content.SharedPreferences r8 = r7.A01()
            java.lang.String r6 = "payments_home_recovery_upin_upsell_banner_impression_update_timestamp"
            long r10 = r8.getLong(r6, r0)
            int r8 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x0149
            long r0 = A0E
            long r10 = r10 + r0
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x015a
        L_0x0149:
            r0 = 1
            long r2 = r2 - r0
            android.content.SharedPreferences$Editor r0 = X.C110105dW.A06(r7)
            X.C13680ns.A0x(r0, r9, r2)
            android.content.SharedPreferences$Editor r0 = X.C110105dW.A06(r7)
            X.C13680ns.A0x(r0, r6, r4)
        L_0x015a:
            r3 = 7
            return r3
        L_0x015c:
            r1 = 0
            goto L_0x00e8
        L_0x015e:
            X.0wT r0 = r14.A09
            boolean r0 = r0.A0P()
            if (r0 == 0) goto L_0x0037
            r3 = 5
            return r3
        L_0x0168:
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x017f
            r0 = 10
            android.content.SharedPreferences$Editor r2 = X.C110105dW.A06(r7)
            X.C13680ns.A0x(r2, r9, r0)
            long r0 = A0G
            long r4 = r4 + r0
            android.content.SharedPreferences$Editor r0 = X.C110105dW.A06(r7)
            X.C13680ns.A0x(r0, r8, r4)
        L_0x017f:
            X.0t3 r0 = r14.A05
            long r4 = r0.A00()
            r0 = 2703(0xa8f, float:3.788E-42)
            boolean r0 = r6.A0C(r0)
            if (r0 == 0) goto L_0x0224
            X.0ps r0 = r14.A0B
            java.lang.String r0 = r0.A01()
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0224
            android.content.SharedPreferences r1 = r7.A01()
            java.lang.String r0 = "payments_two_factor_nudge_count"
            int r1 = X.C13690nt.A01(r1, r0)
            r0 = 1124(0x464, float:1.575E-42)
            int r0 = r6.A02(r0)
            if (r1 < r0) goto L_0x0224
            android.content.SharedPreferences r3 = r7.A01()
            java.lang.String r2 = "payments_last_two_factor_nudge_time"
            r0 = 0
            long r8 = r3.getLong(r2, r0)
            long r2 = A0F
            long r8 = r8 + r2
            int r2 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r2 <= 0) goto L_0x0224
            android.content.SharedPreferences r2 = r7.A01()
            java.lang.String r8 = "payments_home_recovery_2fa_upsell_banner_display"
            long r11 = r2.getLong(r8, r0)
            android.content.SharedPreferences r2 = r7.A01()
            java.lang.String r9 = "payments_home_recovery_2fa_upsell_banner_impression"
            r0 = 10
            long r2 = r2.getLong(r9, r0)
            r0 = 0
            int r10 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r10 == 0) goto L_0x01e0
            int r10 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r10 >= 0) goto L_0x020d
        L_0x01e0:
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x020d
            android.content.SharedPreferences r8 = r7.A01()
            java.lang.String r6 = "payments_home_recovery_2fa_upsell_banner_impression_update_timestamp"
            long r10 = r8.getLong(r6, r0)
            int r8 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r8 == 0) goto L_0x01f9
            long r0 = A0E
            long r10 = r10 + r0
            int r0 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x020a
        L_0x01f9:
            r0 = 1
            long r2 = r2 - r0
            android.content.SharedPreferences$Editor r0 = X.C110105dW.A06(r7)
            X.C13680ns.A0x(r0, r9, r2)
            android.content.SharedPreferences$Editor r0 = X.C110105dW.A06(r7)
            X.C13680ns.A0x(r0, r6, r4)
        L_0x020a:
            r3 = 8
            return r3
        L_0x020d:
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 > 0) goto L_0x0224
            r0 = 10
            android.content.SharedPreferences$Editor r2 = X.C110105dW.A06(r7)
            X.C13680ns.A0x(r2, r9, r0)
            long r0 = A0G
            long r4 = r4 + r0
            android.content.SharedPreferences$Editor r0 = X.C110105dW.A06(r7)
            X.C13680ns.A0x(r0, r8, r4)
        L_0x0224:
            r0 = 2318(0x90e, float:3.248E-42)
            boolean r0 = r6.A0C(r0)
            if (r0 == 0) goto L_0x0239
            android.content.SharedPreferences r1 = r7.A01()
            java.lang.String r0 = "payments_home_scan_to_pay_banner_dismissed"
            boolean r0 = X.C110115dX.A17(r1, r0)
            if (r0 != 0) goto L_0x0239
            return r13
        L_0x0239:
            r3 = 0
            return r3
        L_0x023b:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114105n8.A0H():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        if (X.AnonymousClass5xN.A01(r4, r3.A08()) != false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
        if (r1.contains(r2) != false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0035, code lost:
        if (X.C110115dX.A17(r5.A09.A01(), "payment_has_received_upi_mandate_request") != false) goto L_?;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0I() {
        /*
            r5 = this;
            X.0pd r4 = r5.A04
            X.60V r3 = r5.A05
            java.lang.String r2 = r3.A08()
            r0 = 1231(0x4cf, float:1.725E-42)
            boolean r0 = r4.A0C(r0)
            if (r0 == 0) goto L_0x0039
            r0 = 2835(0xb13, float:3.973E-42)
            java.lang.String r1 = r4.A05(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0039
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0039
            boolean r0 = r1.contains(r2)
            if (r0 == 0) goto L_0x0039
        L_0x0028:
            X.0wT r0 = r5.A09
            android.content.SharedPreferences r1 = r0.A01()
            java.lang.String r0 = "payment_has_received_upi_mandate_request"
            boolean r1 = X.C110115dX.A17(r1, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            return r0
        L_0x0039:
            java.lang.String r0 = r3.A08()
            boolean r0 = X.AnonymousClass5xN.A01(r4, r0)
            if (r0 == 0) goto L_0x0037
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C114105n8.A0I():boolean");
    }
}
