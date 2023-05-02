package X;

import android.view.animation.Interpolator;
import com.facebook.redex.IDxEListenerShape97S0200000_I1;
import com.obwhatsapp.R;
import java.lang.ref.WeakReference;

/* renamed from: X.0eo  reason: invalid class name and case insensitive filesystem */
public class C09040eo implements C25261Jc {
    public final C25261Jc A00;

    public C09040eo(C25261Jc r3) {
        this.A00 = new C09020em(new C09030en(r3));
    }

    public static Interpolator A00(C31201dg r5) {
        return r5 == null ? C04240Lt.A00(0.0f, 0.0f, 1.0f, 1.0f) : C04240Lt.A00(r5.A08(35, 0.0f), r5.A08(38, 0.0f), r5.A08(36, 1.0f), r5.A08(40, 1.0f));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r1 = r2.hashCode();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C03570Ja A01(X.C31201dg r2) {
        /*
            r0 = 48
            java.lang.String r2 = r2.A0J(r0)
            if (r2 == 0) goto L_0x0021
            int r1 = r2.hashCode()
            r0 = -1383228885(0xffffffffad8d9a2b, float:-1.6098308E-11)
            if (r1 == r0) goto L_0x0021
            r0 = 115029(0x1c155, float:1.6119E-40)
            if (r1 != r0) goto L_0x0021
            java.lang.String r0 = "top"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0021
            X.0Ja r0 = X.C03570Ja.TOP
            return r0
        L_0x0021:
            X.0Ja r0 = X.C03570Ja.BOTTOM
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09040eo.A01(X.1dg):X.0Ja");
    }

    public static C12730ks A02(C14960q4 r1, C14930q1 r2) {
        return new AnonymousClass0e3(r1, r2);
    }

    public static void A03(C14960q4 r12, C14950q3 r13) {
        String str;
        C31201dg r7 = (C31201dg) r13.A01(0);
        C14990q7 A02 = C62563Eb.A02(r12, r13, 1);
        if (r7 == null) {
            str = "Cannot show toast with null content.";
        } else {
            AnonymousClass2Wa A002 = AnonymousClass2Wa.A00(r12, r7);
            C31201dg r2 = (C31201dg) r13.A01(1);
            if (r2 == null) {
                str = "Cannot show toast with invalid options.";
            } else {
                int A0A = r2.A0A(35, 5000);
                int A0A2 = r2.A0A(42, 100);
                int A0A3 = r2.A0A(36, 100);
                Interpolator A003 = A00(r2.A0G(43));
                Interpolator A004 = A00(r2.A0G(38));
                C14930q1 A0H = r2.A0H(41);
                C14930q1 A0H2 = r2.A0H(40);
                C05310Qd r22 = new C05310Qd(A02);
                r22.A01(A002);
                r22.A00 = A0A;
                r22.A02 = A0A2;
                r22.A01 = A0A3;
                r22.A04 = A003;
                r22.A03 = A004;
                r22.A07 = A02(r12, A0H);
                r22.A06 = new IDxEListenerShape97S0200000_I1(r12, 1, A0H2);
                r22.A09 = r7.A0I();
                r22.A00().A02();
                return;
            }
        }
        C29691b2.A00("bk.action.toast.ShowToast", str);
    }

    public static void A04(C14960q4 r6, C14950q3 r7) {
        AnonymousClass2Wa r5 = (AnonymousClass2Wa) r7.A02(0);
        C31201dg r4 = (C31201dg) r7.A01(1);
        C14990q7 A02 = C62563Eb.A02(r6, r7, 2);
        if (r4 == null) {
            C29691b2.A00("bk.action.toast.ShowToastV2", "Cannot show toast with invalid options.");
            return;
        }
        C05310Qd r3 = new C05310Qd(A02);
        r3.A01(r5);
        r3.A00 = r4.A0A(35, 5000);
        r3.A02 = r4.A0A(42, 100);
        r3.A01 = r4.A0A(36, 100);
        r3.A04 = A00(r4.A0G(43));
        r3.A03 = A00(r4.A0G(38));
        r3.A07 = A02(r6, r4.A0H(41));
        r3.A06 = new IDxEListenerShape97S0200000_I1(r6, 1, r4.A0H(40));
        r3.A09 = r5.A05().A0I();
        r3.A0A = A06(r4);
        r3.A05 = A01(r4);
        r3.A00().A02();
    }

    public static void A05(C14950q3 r2) {
        AnonymousClass0CB r1;
        String str = (String) r2.A01(0);
        if (str != null && (r1 = (AnonymousClass0CB) AnonymousClass0TP.A00.get()) != null && str.equals(r1.getTag(R.id.foa_toast_tag_server_id))) {
            r1.A01(r1.A01);
        }
    }

    public static boolean A06(C31201dg r1) {
        return "mini".equals(r1.A0J(44));
    }

    /* renamed from: A07 */
    public Object A8l(C14960q4 r2, C14950q3 r3, C99354tt r4) {
        try {
            C89644cb.A01(r4.A00);
            return A08(r2, r3, r4);
        } finally {
            C89644cb.A00();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01c2, code lost:
        if (r2 >= r6.size()) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01c4, code lost:
        r1 = new X.C14940q2();
        r1.A03(java.lang.Integer.valueOf(r2), 0);
        r1.A03(r6.get(r2), 1);
        r7.add(X.C14980q6.A00(r15, r1.A01(), r4));
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0207, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003e, code lost:
        if (r11.equals("bk.action.array.Map") == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0293, code lost:
        A03(r15, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0296, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x0297, code lost:
        r4 = X.C31411e8.A00(r0.A02(1));
        X.AnonymousClass000.A0L().postDelayed(new X.C10460hA(r13, X.C62563Eb.A02(r15, r0, 2), r15, r4), ((java.lang.Number) r0.A02(0)).longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02b9, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02ba, code lost:
        A09((X.C14990q7) r0.A02(0), r15, X.C31411e8.A00(r0.A02(3)), (java.lang.String) r0.A02(4), ((java.lang.Number) r0.A02(1)).longValue(), X.AnonymousClass000.A1X(r0.A02(2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02e5, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02e6, code lost:
        r7 = (android.animation.ValueAnimator) r0.A01(0);
        r6 = X.AnonymousClass000.A04(r0.A02(1));
        r4 = X.AnonymousClass000.A04(r0.A02(2));
        r7.setFloatValues(new float[]{X.AnonymousClass000.A03(r7), r6});
        r7.setDuration((long) (r4 * 1000.0f));
        r7 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x030f, code lost:
        r7 = (android.animation.Animator) r0.A01(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0315, code lost:
        r7.start();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0318, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0319, code lost:
        ((android.animation.Animator) r0.A01(0)).cancel();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0322, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0323, code lost:
        A05(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0326, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0327, code lost:
        r4 = (java.util.List) r0.A02(0);
        r2 = X.AnonymousClass000.A0D(r0.A02(1));
        r1 = (java.lang.Number) r0.A01(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x033b, code lost:
        if (r2 < 0) goto L_0x034e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0341, code lost:
        if (r2 >= r4.size()) goto L_0x034e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0343, code lost:
        if (r1 != null) goto L_0x0351;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0345, code lost:
        r0 = r4.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x034d, code lost:
        return r4.subList(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x034e, code lost:
        r0 = "argument offset is out of bounds";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0355, code lost:
        if (r1.intValue() >= 0) goto L_0x035d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0357, code lost:
        r0 = "argument length cannot be negative";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0359, code lost:
        X.C29691b2.A00("bk.action.array.Slice", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x035c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x035d, code lost:
        r0 = java.lang.Math.min(r1.intValue() + r2, r4.size());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x036b, code lost:
        r4 = new android.animation.ValueAnimator();
        r20 = X.C31411e8.A00(r0.A02(0));
        r7 = X.C31411e8.A00(r0.A02(1));
        r9 = X.AnonymousClass000.A04(r0.A02(2));
        r8 = X.AnonymousClass000.A04(r0.A02(3));
        r6 = X.AnonymousClass000.A04(r0.A02(4));
        r0 = new X.C14940q2();
        r0.A03(r4, 0);
        r2 = r0.A01();
        r4.addUpdateListener(new com.facebook.redex.IDxUListenerShape8S0400000_I1(r13, r15, r2, r20, 2));
        r4.addListener(new X.AnonymousClass0XR(r13, r15, r2, r7));
        r4.setInterpolator(new android.view.animation.LinearInterpolator());
        r4.setFloatValues(new float[]{r9, r8});
        r4.setDuration((long) (r6 * 1000.0f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03d4, code lost:
        return r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03d5, code lost:
        r3 = (java.lang.String) r0.A01(0);
        r0 = com.facebook.common.payments.paymentmethods.creditcardvalidations.PaymentCardUtils.determineType(r3);
        r2 = X.AnonymousClass000.A0x();
        r2.put("cardType", r0.getTypeName());
        r2.put("isValid", java.lang.Boolean.valueOf(com.facebook.common.payments.paymentmethods.creditcardvalidations.PaymentCardUtils.isCardNumberValid(r3)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03f9, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0420, code lost:
        return X.AnonymousClass380.A00((java.lang.String) r0.A02(1), (java.lang.String) r0.A02(2), (java.lang.String) r0.A01(3), (java.lang.String) r0.A01(5), ((java.lang.Number) r0.A02(0)).longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0427, code lost:
        return r3.A0J(41);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0023, code lost:
        return r13.A00.A8l(r0, r8, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a9, code lost:
        if (r11.equals("commerce.action.GetCreditCardMetadata") == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00d2, code lost:
        if (r11.equals("bk.action.GetDatetimeText") == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00dc, code lost:
        if (r11.equals("bk.action.text.GetText") == false) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ed, code lost:
        switch(r4) {
            case 1: goto L_0x013b;
            case 2: goto L_0x00f4;
            case 3: goto L_0x01ab;
            case 4: goto L_0x036b;
            case 5: goto L_0x010a;
            case 6: goto L_0x0293;
            case 7: goto L_0x0297;
            case 8: goto L_0x02ba;
            case 9: goto L_0x02e6;
            case 10: goto L_0x030f;
            case 11: goto L_0x0319;
            case 12: goto L_0x011c;
            case 13: goto L_0x03d5;
            case 14: goto L_0x0323;
            case 15: goto L_0x0327;
            case 16: goto L_0x012e;
            case 17: goto L_0x03fa;
            case 18: goto L_0x0182;
            default: goto L_0x00f0;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f0, code lost:
        A04(r15, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00f3, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00f4, code lost:
        r0 = X.C62183Bz.A02((X.C14990q7) r0.A02(0), (java.lang.String) r0.A02(1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0104, code lost:
        if (r0 == null) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0106, code lost:
        r0.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0109, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x010a, code lost:
        r0 = X.C62183Bz.A02(r15.A00, (java.lang.String) r0.A02(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0116, code lost:
        if (r0 == null) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0118, code lost:
        r0.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x011b, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x011c, code lost:
        r0 = X.C62183Bz.A02(r15.A00, (java.lang.String) r0.A02(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0128, code lost:
        if (r0 == null) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x012a, code lost:
        r0.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x012d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x012e, code lost:
        r0 = (java.lang.String) r0.A01(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0134, code lost:
        if (r0 == null) goto L_0x00f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x013a, code lost:
        return r0.trim();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x013b, code lost:
        r4 = (java.util.List) r0.A01(0);
        r6 = X.C31411e8.A00(r0.A02(1));
        r7 = X.AnonymousClass000.A0u();
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0152, code lost:
        if (r3 >= r4.size()) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0154, code lost:
        r2 = r4.get(r3);
        r0 = new X.C14940q2();
        r0.A03(r2, 0);
        r1 = X.C14980q6.A00(r15, r0.A01(), r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x016a, code lost:
        if ((r1 instanceof java.lang.Number) != false) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x016e, code lost:
        if ((r1 instanceof java.lang.Boolean) != false) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0170, code lost:
        X.C29691b2.A00("bk.action.array.Filter", "Got non-boolean result while evaluating filter predicate");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0175, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x017a, code lost:
        if (X.C89554cQ.A02(r1) == false) goto L_0x017f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x017c, code lost:
        r7.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x017f, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0182, code lost:
        r3 = (X.C31201dg) r0.A01(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0188, code lost:
        if (r3 == null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0190, code lost:
        if (r3.A09() != 13335) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0192, code lost:
        r1 = r3.A0G(44);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0198, code lost:
        if (r1 == null) goto L_0x0421;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01aa, code lost:
        return X.C90154da.A00().A05().A00(r1).toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x01ab, code lost:
        r6 = (java.util.List) r0.A01(0);
        r4 = X.C31411e8.A00(r0.A02(1));
        r7 = X.AnonymousClass000.A0w(r6);
        r2 = 0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A08(X.C14960q4 r23, X.C14950q3 r24, X.C99354tt r25) {
        /*
            r22 = this;
            r8 = r25
            java.lang.String r11 = r8.A00
            int r12 = r11.hashCode()
            java.lang.String r4 = "bk.action.array.FindIndex"
            r7 = 5
            java.lang.String r9 = "bk.action.array.Filter"
            java.lang.String r10 = "bk.action.array.Slice"
            r6 = 4
            r2 = 3
            r1 = 2
            r3 = 1
            r5 = 0
            r13 = r22
            r15 = r23
            r0 = r24
            switch(r12) {
                case -2026866692: goto L_0x01e5;
                case -1946563488: goto L_0x0024;
                case -1861584650: goto L_0x002d;
                case -1483567756: goto L_0x0038;
                case -1334580548: goto L_0x0041;
                case -1327258861: goto L_0x004c;
                case -1244999280: goto L_0x0057;
                case -882687321: goto L_0x0062;
                case -876004762: goto L_0x006c;
                case -717377024: goto L_0x0077;
                case -686296522: goto L_0x0082;
                case -275596506: goto L_0x008d;
                case -166805122: goto L_0x0098;
                case -124232119: goto L_0x00a3;
                case -79583337: goto L_0x00ad;
                case 226394026: goto L_0x00b8;
                case 405636519: goto L_0x00c1;
                case 512914731: goto L_0x00cc;
                case 978494805: goto L_0x00d6;
                case 1851570220: goto L_0x00e0;
                case 1866622129: goto L_0x0208;
                case 1995238836: goto L_0x0258;
                case 2098589378: goto L_0x027c;
                default: goto L_0x001d;
            }
        L_0x001d:
            X.1Jc r1 = r13.A00
            java.lang.Object r0 = r1.A8l(r0, r8, r15)
            return r0
        L_0x0024:
            boolean r4 = r11.equals(r9)
            if (r4 == 0) goto L_0x001d
            r4 = 1
            goto L_0x00ea
        L_0x002d:
            java.lang.String r4 = "bk.action.timer.Cancel"
            boolean r4 = r11.equals(r4)
            if (r4 == 0) goto L_0x001d
            r4 = 2
            goto L_0x00ea
        L_0x0038:
            java.lang.String r1 = "bk.action.array.Map"
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto L_0x01ab
            goto L_0x001d
        L_0x0041:
            java.lang.String r4 = "bk.action.animation.linear.CreateAnimation"
            boolean r4 = r11.equals(r4)
            if (r4 == 0) goto L_0x001d
            r4 = 4
            goto L_0x00ea
        L_0x004c:
            java.lang.String r4 = "bk.action.timer.Restart"
            boolean r4 = r11.equals(r4)
            if (r4 == 0) goto L_0x001d
            r4 = 5
            goto L_0x00ea
        L_0x0057:
            java.lang.String r4 = "bk.action.toast.ShowToast"
            boolean r4 = r11.equals(r4)
            if (r4 == 0) goto L_0x001d
            r4 = 6
            goto L_0x00ea
        L_0x0062:
            java.lang.String r4 = "bk.action.core.Delay"
            boolean r4 = r11.equals(r4)
            if (r4 == 0) goto L_0x001d
            r4 = 7
            goto L_0x00ea
        L_0x006c:
            java.lang.String r4 = "bk.action.timer.Start"
            boolean r4 = r11.equals(r4)
            if (r4 == 0) goto L_0x001d
            r4 = 8
            goto L_0x00ea
        L_0x0077:
            java.lang.String r4 = "bk.action.animation.linear.SetNewEndValue"
            boolean r4 = r11.equals(r4)
            if (r4 == 0) goto L_0x001d
            r4 = 9
            goto L_0x00ea
        L_0x0082:
            java.lang.String r4 = "bk.action.animation.linear.Start"
            boolean r4 = r11.equals(r4)
            if (r4 == 0) goto L_0x001d
            r4 = 10
            goto L_0x00ea
        L_0x008d:
            java.lang.String r4 = "bk.action.animation.linear.Cancel"
            boolean r4 = r11.equals(r4)
            if (r4 == 0) goto L_0x001d
            r4 = 11
            goto L_0x00ea
        L_0x0098:
            java.lang.String r4 = "bk.action.timer.Stop"
            boolean r4 = r11.equals(r4)
            if (r4 == 0) goto L_0x001d
            r4 = 12
            goto L_0x00ea
        L_0x00a3:
            java.lang.String r1 = "commerce.action.GetCreditCardMetadata"
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto L_0x03d5
            goto L_0x001d
        L_0x00ad:
            java.lang.String r4 = "bk.action.toast.DismissToast"
            boolean r4 = r11.equals(r4)
            if (r4 == 0) goto L_0x001d
            r4 = 14
            goto L_0x00ea
        L_0x00b8:
            boolean r4 = r11.equals(r10)
            if (r4 == 0) goto L_0x001d
            r4 = 15
            goto L_0x00ea
        L_0x00c1:
            java.lang.String r4 = "bk.action.fb.pmv.TrimString"
            boolean r4 = r11.equals(r4)
            if (r4 == 0) goto L_0x001d
            r4 = 16
            goto L_0x00ea
        L_0x00cc:
            java.lang.String r4 = "bk.action.GetDatetimeText"
            boolean r4 = r11.equals(r4)
            if (r4 != 0) goto L_0x03fa
            goto L_0x001d
        L_0x00d6:
            java.lang.String r1 = "bk.action.text.GetText"
            boolean r1 = r11.equals(r1)
            if (r1 != 0) goto L_0x0182
            goto L_0x001d
        L_0x00e0:
            java.lang.String r4 = "bk.action.toast.ShowToastV2"
            boolean r4 = r11.equals(r4)
            if (r4 == 0) goto L_0x001d
            r4 = 19
        L_0x00ea:
            r12 = 1148846080(0x447a0000, float:1000.0)
            r11 = 0
            switch(r4) {
                case 1: goto L_0x013b;
                case 2: goto L_0x00f4;
                case 3: goto L_0x01ab;
                case 4: goto L_0x036b;
                case 5: goto L_0x010a;
                case 6: goto L_0x0293;
                case 7: goto L_0x0297;
                case 8: goto L_0x02ba;
                case 9: goto L_0x02e6;
                case 10: goto L_0x030f;
                case 11: goto L_0x0319;
                case 12: goto L_0x011c;
                case 13: goto L_0x03d5;
                case 14: goto L_0x0323;
                case 15: goto L_0x0327;
                case 16: goto L_0x012e;
                case 17: goto L_0x03fa;
                case 18: goto L_0x0182;
                default: goto L_0x00f0;
            }
        L_0x00f0:
            A04(r15, r0)
        L_0x00f3:
            return r11
        L_0x00f4:
            java.lang.Object r1 = r0.A02(r5)
            X.0q7 r1 = (X.C14990q7) r1
            java.lang.Object r0 = r0.A02(r3)
            java.lang.String r0 = (java.lang.String) r0
            X.0q0 r0 = X.C62183Bz.A02(r1, r0)
            if (r0 == 0) goto L_0x00f3
            r0.A01()
            return r11
        L_0x010a:
            java.lang.Object r1 = r0.A02(r5)
            java.lang.String r1 = (java.lang.String) r1
            X.0q7 r0 = r15.A00
            X.0q0 r0 = X.C62183Bz.A02(r0, r1)
            if (r0 == 0) goto L_0x00f3
            r0.A02()
            return r11
        L_0x011c:
            java.lang.Object r1 = r0.A02(r5)
            java.lang.String r1 = (java.lang.String) r1
            X.0q7 r0 = r15.A00
            X.0q0 r0 = X.C62183Bz.A02(r0, r1)
            if (r0 == 0) goto L_0x00f3
            r0.A03()
            return r11
        L_0x012e:
            java.lang.Object r0 = r0.A01(r5)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x00f3
            java.lang.String r11 = r0.trim()
            return r11
        L_0x013b:
            java.lang.Object r4 = r0.A01(r5)
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r0 = r0.A02(r3)
            X.1e9 r6 = X.C31411e8.A00(r0)
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()
            r3 = 0
        L_0x014e:
            int r0 = r4.size()
            if (r3 >= r0) goto L_0x0207
            java.lang.Object r2 = r4.get(r3)
            X.0q2 r0 = new X.0q2
            r0.<init>()
            r0.A03(r2, r5)
            X.0q3 r0 = r0.A01()
            java.lang.Object r1 = X.C14980q6.A00(r15, r0, r6)
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 != 0) goto L_0x0176
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 != 0) goto L_0x0176
            java.lang.String r0 = "Got non-boolean result while evaluating filter predicate"
            X.C29691b2.A00(r9, r0)
            return r11
        L_0x0176:
            boolean r0 = X.C89554cQ.A02(r1)
            if (r0 == 0) goto L_0x017f
            r7.add(r2)
        L_0x017f:
            int r3 = r3 + 1
            goto L_0x014e
        L_0x0182:
            java.lang.Object r3 = r0.A01(r5)
            X.1dg r3 = (X.C31201dg) r3
            if (r3 == 0) goto L_0x001d
            int r2 = r3.A09()
            r1 = 13335(0x3417, float:1.8686E-41)
            if (r2 != r1) goto L_0x001d
            r0 = 44
            X.1dg r1 = r3.A0G(r0)
            if (r1 == 0) goto L_0x0421
            X.4da r0 = X.C90154da.A00()
            X.4aX r0 = r0.A05()
            java.lang.CharSequence r0 = r0.A00(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L_0x01ab:
            java.lang.Object r6 = r0.A01(r5)
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r0 = r0.A02(r3)
            X.1e9 r4 = X.C31411e8.A00(r0)
            java.util.ArrayList r7 = X.AnonymousClass000.A0w(r6)
            r2 = 0
        L_0x01be:
            int r0 = r6.size()
            if (r2 >= r0) goto L_0x0207
            X.0q2 r1 = new X.0q2
            r1.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A03(r0, r5)
            java.lang.Object r0 = r6.get(r2)
            r1.A03(r0, r3)
            X.0q3 r0 = r1.A01()
            java.lang.Object r0 = X.C14980q6.A00(r15, r0, r4)
            r7.add(r0)
            int r2 = r2 + 1
            goto L_0x01be
        L_0x01e5:
            java.lang.String r1 = "bk.action.array.Concat"
            boolean r1 = r11.equals(r1)
            if (r1 == 0) goto L_0x001d
            java.lang.Object r1 = r0.A01(r5)
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r0 = r0.A01(r3)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()
            if (r1 == 0) goto L_0x0202
            r7.addAll(r1)
        L_0x0202:
            if (r0 == 0) goto L_0x0207
            r7.addAll(r0)
        L_0x0207:
            return r7
        L_0x0208:
            boolean r1 = r11.equals(r4)
            if (r1 == 0) goto L_0x001d
            java.lang.Object r7 = r0.A02(r5)
            java.util.List r7 = (java.util.List) r7
            java.lang.Object r0 = r0.A02(r3)
            X.1e9 r6 = X.C31411e8.A00(r0)
            int r3 = r7.size()
            r2 = 0
        L_0x0221:
            if (r2 >= r3) goto L_0x0428
            java.lang.Object r1 = r7.get(r2)
            X.0q2 r0 = new X.0q2
            r0.<init>()
            r0.A02(r1, r5)
            X.0q3 r0 = r0.A01()
            java.lang.Object r1 = X.C14980q6.A00(r15, r0, r6)
            boolean r0 = r1 instanceof java.lang.Number
            if (r0 != 0) goto L_0x024a
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 != 0) goto L_0x024a
            java.lang.String r0 = "Got non-boolean result while evaluating FindIndex predicate"
            X.C29691b2.A00(r4, r0)
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        L_0x024a:
            boolean r0 = X.C89554cQ.A02(r1)
            if (r0 == 0) goto L_0x0255
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            return r0
        L_0x0255:
            int r2 = r2 + 1
            goto L_0x0221
        L_0x0258:
            java.lang.String r1 = "bk.action.array.SortedArray"
            boolean r1 = r11.equals(r1)
            if (r1 == 0) goto L_0x001d
            java.lang.Object r4 = r0.A02(r5)
            java.util.Collection r4 = (java.util.Collection) r4
            java.lang.Object r0 = r0.A02(r3)
            X.1e9 r2 = X.C31411e8.A00(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r4)
            X.0hZ r0 = new X.0hZ
            r0.<init>(r13, r15, r2)
            java.util.Collections.sort(r1, r0)
            return r1
        L_0x027c:
            java.lang.String r1 = "bk.action.animation.linear.GetCurrentValue"
            boolean r1 = r11.equals(r1)
            if (r1 == 0) goto L_0x001d
            java.lang.Object r0 = r0.A01(r5)
            android.animation.ValueAnimator r0 = (android.animation.ValueAnimator) r0
            float r0 = X.AnonymousClass000.A03(r0)
            java.lang.Number r0 = X.C89554cQ.A01(r0)
            return r0
        L_0x0293:
            A03(r15, r0)
            return r11
        L_0x0297:
            java.lang.Object r5 = r0.A02(r5)
            java.lang.Number r5 = (java.lang.Number) r5
            java.lang.Object r2 = r0.A02(r3)
            X.1e9 r4 = X.C31411e8.A00(r2)
            X.0q7 r0 = X.C62563Eb.A02(r15, r0, r1)
            android.os.Handler r3 = X.AnonymousClass000.A0L()
            X.0hA r2 = new X.0hA
            r2.<init>(r13, r0, r15, r4)
            long r0 = r5.longValue()
            r3.postDelayed(r2, r0)
            return r11
        L_0x02ba:
            java.lang.Object r14 = r0.A02(r5)
            X.0q7 r14 = (X.C14990q7) r14
            java.lang.Object r3 = r0.A02(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            long r18 = r3.longValue()
            java.lang.Object r1 = r0.A02(r1)
            boolean r20 = X.AnonymousClass000.A1X(r1)
            java.lang.Object r1 = r0.A02(r2)
            X.1e9 r16 = X.C31411e8.A00(r1)
            java.lang.Object r0 = r0.A02(r6)
            java.lang.String r0 = (java.lang.String) r0
            r17 = r0
            r13.A09(r14, r15, r16, r17, r18, r20)
            return r11
        L_0x02e6:
            java.lang.Object r7 = r0.A01(r5)
            android.animation.ValueAnimator r7 = (android.animation.ValueAnimator) r7
            java.lang.Object r2 = r0.A02(r3)
            float r6 = X.AnonymousClass000.A04(r2)
            java.lang.Object r0 = r0.A02(r1)
            float r4 = X.AnonymousClass000.A04(r0)
            float r2 = X.AnonymousClass000.A03(r7)
            float[] r0 = new float[r1]
            r0[r5] = r2
            r0[r3] = r6
            r7.setFloatValues(r0)
            float r4 = r4 * r12
            long r0 = (long) r4
            r7.setDuration(r0)
            goto L_0x0315
        L_0x030f:
            java.lang.Object r7 = r0.A01(r5)
            android.animation.Animator r7 = (android.animation.Animator) r7
        L_0x0315:
            r7.start()
            return r11
        L_0x0319:
            java.lang.Object r0 = r0.A01(r5)
            android.animation.Animator r0 = (android.animation.Animator) r0
            r0.cancel()
            return r11
        L_0x0323:
            A05(r0)
            return r11
        L_0x0327:
            java.lang.Object r4 = r0.A02(r5)
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r2 = r0.A02(r3)
            int r2 = X.AnonymousClass000.A0D(r2)
            java.lang.Object r1 = r0.A01(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            if (r2 < 0) goto L_0x034e
            int r0 = r4.size()
            if (r2 >= r0) goto L_0x034e
            if (r1 != 0) goto L_0x0351
            int r0 = r4.size()
        L_0x0349:
            java.util.List r0 = r4.subList(r2, r0)
            return r0
        L_0x034e:
            java.lang.String r0 = "argument offset is out of bounds"
            goto L_0x0359
        L_0x0351:
            int r0 = r1.intValue()
            if (r0 >= 0) goto L_0x035d
            java.lang.String r0 = "argument length cannot be negative"
        L_0x0359:
            X.C29691b2.A00(r10, r0)
            return r11
        L_0x035d:
            int r1 = r1.intValue()
            int r1 = r1 + r2
            int r0 = r4.size()
            int r0 = java.lang.Math.min(r1, r0)
            goto L_0x0349
        L_0x036b:
            android.animation.ValueAnimator r4 = new android.animation.ValueAnimator
            r4.<init>()
            java.lang.Object r7 = r0.A02(r5)
            X.1e9 r20 = X.C31411e8.A00(r7)
            java.lang.Object r7 = r0.A02(r3)
            X.1e9 r7 = X.C31411e8.A00(r7)
            java.lang.Object r8 = r0.A02(r1)
            float r9 = X.AnonymousClass000.A04(r8)
            java.lang.Object r2 = r0.A02(r2)
            float r8 = X.AnonymousClass000.A04(r2)
            java.lang.Object r0 = r0.A02(r6)
            float r6 = X.AnonymousClass000.A04(r0)
            X.0q2 r0 = new X.0q2
            r0.<init>()
            r0.A03(r4, r5)
            X.0q3 r2 = r0.A01()
            com.facebook.redex.IDxUListenerShape8S0400000_I1 r0 = new com.facebook.redex.IDxUListenerShape8S0400000_I1
            r21 = 2
            r16 = r0
            r17 = r13
            r18 = r15
            r19 = r2
            r16.<init>(r17, r18, r19, r20, r21)
            r4.addUpdateListener(r0)
            X.0XR r0 = new X.0XR
            r0.<init>(r13, r15, r2, r7)
            r4.addListener(r0)
            android.view.animation.LinearInterpolator r0 = new android.view.animation.LinearInterpolator
            r0.<init>()
            r4.setInterpolator(r0)
            float[] r0 = new float[r1]
            r0[r5] = r9
            r0[r3] = r8
            r4.setFloatValues(r0)
            float r6 = r6 * r12
            long r0 = (long) r6
            r4.setDuration(r0)
            return r4
        L_0x03d5:
            java.lang.Object r3 = r0.A01(r5)
            java.lang.String r3 = (java.lang.String) r3
            com.facebook.common.payments.paymentmethods.creditcardvalidations.PaymentCardType r0 = com.facebook.common.payments.paymentmethods.creditcardvalidations.PaymentCardUtils.determineType(r3)
            java.util.HashMap r2 = X.AnonymousClass000.A0x()
            java.lang.String r1 = "cardType"
            java.lang.String r0 = r0.getTypeName()
            r2.put(r1, r0)
            java.lang.String r1 = "isValid"
            boolean r0 = com.facebook.common.payments.paymentmethods.creditcardvalidations.PaymentCardUtils.isCardNumberValid(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.put(r1, r0)
            return r2
        L_0x03fa:
            java.lang.Object r4 = r0.A02(r5)
            java.lang.Number r4 = (java.lang.Number) r4
            long r8 = r4.longValue()
            java.lang.Object r4 = r0.A02(r3)
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r5 = r0.A02(r1)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r0.A01(r2)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r0.A01(r7)
            java.lang.String r7 = (java.lang.String) r7
            java.lang.CharSequence r0 = X.AnonymousClass380.A00(r4, r5, r6, r7, r8)
            return r0
        L_0x0421:
            r0 = 41
            java.lang.String r0 = r3.A0J(r0)
            return r0
        L_0x0428:
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09040eo.A08(X.0q4, X.0q3, X.4tt):java.lang.Object");
    }

    public final void A09(C14990q7 r7, C14960q4 r8, C14930q1 r9, String str, long j2, boolean z2) {
        C62183Bz.A08(r7, C14920q0.A00(new AnonymousClass017(this, r8, r9, str, new WeakReference(r7)), j2, z2), str);
    }
}
