package X;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.redex.IDxCListenerShape259S0100000_3_I1;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.List;

/* renamed from: X.5eg  reason: invalid class name and case insensitive filesystem */
public abstract class C110695eg extends C003401n {
    public AnonymousClass027 A00 = C13690nt.A0O();
    public AnonymousClass027 A01 = C13690nt.A0O();
    public List A02;
    public List A03;
    public List A04;
    public final C16440t3 A05;
    public final AnonymousClass013 A06;
    public final C18030w2 A07;
    public final C14710pd A08;
    public final C18300wT A09;
    public final C18290wS A0A;
    public final C1222969a A0B;

    public C110695eg(C16440t3 r2, AnonymousClass013 r3, C18030w2 r4, C14710pd r5, C18300wT r6, C18290wS r7, C1222969a r8) {
        this.A05 = r2;
        this.A08 = r5;
        this.A06 = r3;
        this.A07 = r4;
        this.A0A = r7;
        this.A09 = r6;
        this.A0B = r8;
        this.A04 = AnonymousClass000.A0u();
        this.A02 = AnonymousClass000.A0u();
        this.A03 = AnonymousClass000.A0u();
    }

    public static AnonymousClass5xL A01(int i2) {
        Object[] objArr = new Object[0];
        int i3 = 0;
        if (i2 == 0) {
            i3 = 8;
        }
        return new AnonymousClass5xL((String) null, objArr, i2, i3);
    }

    public static void A02(C53842gO r3, C110695eg r4, String str, Object[] objArr) {
        boolean z2 = false;
        r3.A0Z = String.format("%s.%s", objArr);
        AnonymousClass2St r2 = new AnonymousClass2St(new AnonymousClass2St[0]);
        r2.A01("section", str);
        if (r4 instanceof C114095n7) {
            z2 = !TextUtils.isEmpty(((C114095n7) r4).A01);
        }
        r2.A02("isPushProvisioning", z2);
        r3.A0Y = r2.toString();
    }

    public static void A03(C110695eg r11) {
        AnonymousClass027 r0 = r11.A01;
        AnonymousClass5xL r4 = AnonymousClass5xL.A05;
        r0.A09(new C119225wk((AnonymousClass5wZ) null, (AnonymousClass69E) null, r4, r4, r4, 0, 8, -1, -1, 0));
    }

    public AnonymousClass69E A05() {
        if (this instanceof C114095n7) {
            return new IDxCListenerShape259S0100000_3_I1(this, 0);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0136, code lost:
        return new X.C119225wk(r4, new com.facebook.redex.IDxCListenerShape259S0100000_3_I1(r0, r2), r9, r10, r3, r12, r13, 0, 0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0162, code lost:
        return new X.C119225wk(r2, new com.facebook.redex.IDxCListenerShape259S0100000_3_I1(r0, r1), r4, r5, r6, r7, 0, 0, 0, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x018d, code lost:
        if (r6 == 0) goto L_0x018f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C119225wk A06() {
        /*
            r17 = this;
            r0 = r17
            boolean r1 = r0 instanceof X.C114105n8
            if (r1 == 0) goto L_0x0163
            X.5n8 r0 = (X.C114105n8) r0
            int r1 = r0.A0H()
            r8 = -1
            r2 = 1
            r6 = 0
            switch(r1) {
                case 1: goto L_0x0022;
                case 2: goto L_0x0040;
                case 3: goto L_0x0012;
                case 4: goto L_0x00b2;
                case 5: goto L_0x00e4;
                case 6: goto L_0x0101;
                case 7: goto L_0x0094;
                case 8: goto L_0x0137;
                default: goto L_0x0012;
            }
        L_0x0012:
            X.5xL r3 = X.AnonymousClass5xL.A05
            r7 = 8
            r1 = 0
            r5 = r3
            r9 = -1
            r10 = 0
            X.5wk r0 = new X.5wk
            r2 = r1
            r4 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r0
        L_0x0022:
            r7 = 2131365141(0x7f0a0d15, float:1.8350139E38)
            r1 = 2131891303(0x7f121467, float:1.9417322E38)
            X.5xL r4 = A01(r1)
            X.5xL r5 = X.AnonymousClass5xL.A05
            r1 = 2131891304(0x7f121468, float:1.9417324E38)
            X.5xL r6 = A01(r1)
            r1 = 2131231833(0x7f080459, float:1.8079758E38)
            X.5wZ r2 = new X.5wZ
            r2.<init>(r1)
            r1 = 7
            goto L_0x0153
        L_0x0040:
            X.173 r3 = r0.A03
            java.lang.String r1 = "INR"
            X.1Vz r4 = r3.A01(r1)
            r10 = 2131365141(0x7f0a0d15, float:1.8350139E38)
            r1 = 2131891440(0x7f1214f0, float:1.94176E38)
            X.5xL r7 = A01(r1)
            X.5xL r8 = X.AnonymousClass5xL.A05
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()
            r1 = r4
            X.1m1 r1 = (X.C35491m1) r1
            java.lang.String r1 = r1.A05
            r2.append(r1)
            X.1Vy r1 = r4.ADn()
            java.math.BigDecimal r1 = r1.A00
            int r1 = r1.intValue()
            java.lang.String r1 = X.AnonymousClass000.A0l(r2, r1)
            r3[r6] = r1
            r2 = 2131891641(0x7f1215b9, float:1.9418008E38)
            r1 = 0
            X.5xL r9 = new X.5xL
            r9.<init>(r1, r3, r2, r6)
            r1 = 2131231883(0x7f08048b, float:1.807986E38)
            X.5wZ r5 = new X.5wZ
            r5.<init>(r1)
            r1 = 6
            com.facebook.redex.IDxCListenerShape259S0100000_3_I1 r6 = new com.facebook.redex.IDxCListenerShape259S0100000_3_I1
            r6.<init>(r0, r1)
            X.5wk r0 = new X.5wk
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r0
        L_0x0094:
            r12 = 2131365141(0x7f0a0d15, float:1.8350139E38)
            r13 = 0
            r1 = 2131891046(0x7f121366, float:1.94168E38)
            X.5xL r9 = A01(r1)
            X.5xL r10 = X.AnonymousClass5xL.A05
            r1 = 2131891047(0x7f121367, float:1.9416803E38)
            X.5xL r3 = A01(r1)
            r1 = 2131231692(0x7f0803cc, float:1.8079472E38)
            X.5wZ r4 = new X.5wZ
            r4.<init>(r1)
            r2 = 3
            goto L_0x0124
        L_0x00b2:
            r12 = 2131365141(0x7f0a0d15, float:1.8350139E38)
            r13 = 0
            r1 = 2131886280(0x7f1200c8, float:1.9407134E38)
            X.5xL r9 = A01(r1)
            r1 = 2131886282(0x7f1200ca, float:1.9407138E38)
            X.5xL r10 = A01(r1)
            r4 = 2131886281(0x7f1200c9, float:1.9407136E38)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r1 = "learn-more"
            r2[r6] = r1
            java.lang.String r1 = "https://faq.whatsapp.com/general/payments/about-using-your-mobile-number-as-your-UPI-number"
            X.5xL r3 = new X.5xL
            r3.<init>(r1, r2, r4, r6)
            r5 = 2131231447(0x7f0802d7, float:1.8078975E38)
            r2 = 2131165283(0x7f070063, float:1.7944779E38)
            r1 = 2131165284(0x7f070064, float:1.794478E38)
            X.5wZ r4 = new X.5wZ
            r4.<init>(r8, r5, r2, r1)
            r2 = 5
            goto L_0x0124
        L_0x00e4:
            r12 = 2131365141(0x7f0a0d15, float:1.8350139E38)
            r13 = 0
            r1 = 2131886196(0x7f120074, float:1.9406964E38)
            X.5xL r9 = A01(r1)
            X.5xL r10 = X.AnonymousClass5xL.A05
            r1 = 2131886197(0x7f120075, float:1.9406966E38)
            X.5xL r3 = A01(r1)
            r1 = 2131231787(0x7f08042b, float:1.8079665E38)
            X.5wZ r4 = new X.5wZ
            r4.<init>(r1)
            goto L_0x0124
        L_0x0101:
            r12 = 2131365141(0x7f0a0d15, float:1.8350139E38)
            r13 = 0
            r1 = 2131891344(0x7f121490, float:1.9417405E38)
            X.5xL r9 = A01(r1)
            X.5xL r10 = X.AnonymousClass5xL.A05
            r1 = 2131891345(0x7f121491, float:1.9417407E38)
            X.5xL r3 = A01(r1)
            r5 = 2131231842(0x7f080462, float:1.8079776E38)
            r2 = 2131166882(0x7f0706a2, float:1.7948022E38)
            r1 = 2131166883(0x7f0706a3, float:1.7948024E38)
            X.5wZ r4 = new X.5wZ
            r4.<init>(r8, r5, r2, r1)
            r2 = 4
        L_0x0124:
            com.facebook.redex.IDxCListenerShape259S0100000_3_I1 r1 = new com.facebook.redex.IDxCListenerShape259S0100000_3_I1
            r1.<init>(r0, r2)
            X.5wk r0 = new X.5wk
            r14 = 0
            r15 = 0
            r16 = 0
            r6 = r0
            r7 = r4
            r8 = r1
            r11 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
        L_0x0137:
            r7 = 2131365141(0x7f0a0d15, float:1.8350139E38)
            r1 = 2131891044(0x7f121364, float:1.9416797E38)
            X.5xL r4 = A01(r1)
            X.5xL r5 = X.AnonymousClass5xL.A05
            r1 = 2131891045(0x7f121365, float:1.9416799E38)
            X.5xL r6 = A01(r1)
            r1 = 2131231609(0x7f080379, float:1.8079304E38)
            X.5wZ r2 = new X.5wZ
            r2.<init>(r1)
            r1 = 2
        L_0x0153:
            com.facebook.redex.IDxCListenerShape259S0100000_3_I1 r3 = new com.facebook.redex.IDxCListenerShape259S0100000_3_I1
            r3.<init>(r0, r1)
            X.5wk r0 = new X.5wk
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L_0x0163:
            X.5n7 r0 = (X.C114095n7) r0
            r11 = 0
            int r6 = r0.A0H(r11)
            r1 = 1
            r5 = 0
            if (r6 == r1) goto L_0x01d3
            r1 = 2
            if (r6 == r1) goto L_0x01cc
            r1 = 3
            if (r6 == r1) goto L_0x01b9
            java.lang.String r1 = "PAY: BrazilPaymentSettingsViewModel/generateDefaultBannerConfiguration/ default NUX stage = NONE"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r3 = 0
            r4 = 0
        L_0x017b:
            r9 = 2131365141(0x7f0a0d15, float:1.8350139E38)
            X.0wT r1 = r0.A09
            android.content.SharedPreferences r2 = r1.A01()
            java.lang.String r1 = "payment_brazil_nux_dismissed"
            boolean r1 = r2.getBoolean(r1, r11)
            if (r1 != 0) goto L_0x018f
            r10 = 0
            if (r6 != 0) goto L_0x0191
        L_0x018f:
            r10 = 8
        L_0x0191:
            X.5xL r6 = A01(r4)
            X.5xL r7 = X.AnonymousClass5xL.A05
            java.lang.Object[] r1 = new java.lang.Object[r11]
            X.5xL r8 = new X.5xL
            r8.<init>(r5, r1, r3, r11)
            r3 = 2131101082(0x7f06059a, float:1.7814564E38)
            r2 = 2131230896(0x7f0800b0, float:1.8077858E38)
            r1 = 2131166624(0x7f0705a0, float:1.7947499E38)
            X.5wZ r4 = new X.5wZ
            r4.<init>(r3, r2, r1, r1)
            com.facebook.redex.IDxCListenerShape259S0100000_3_I1 r5 = new com.facebook.redex.IDxCListenerShape259S0100000_3_I1
            r5.<init>(r0, r11)
            r12 = 0
            r13 = 0
            X.5wk r3 = new X.5wk
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r3
        L_0x01b9:
            r3 = 2131889780(0x7f120e74, float:1.9414233E38)
            r4 = 2131889777(0x7f120e71, float:1.9414227E38)
            X.1Aj r2 = r0.A02
            java.lang.String r1 = "https://faq.whatsapp.com/1085240205511877"
            android.net.Uri r1 = r2.A00(r1)
            java.lang.String r5 = r1.toString()
            goto L_0x017b
        L_0x01cc:
            r3 = 2131889781(0x7f120e75, float:1.9414235E38)
            r4 = 2131889778(0x7f120e72, float:1.941423E38)
            goto L_0x017b
        L_0x01d3:
            r3 = 2131889779(0x7f120e73, float:1.9414231E38)
            r4 = 2131889776(0x7f120e70, float:1.9414225E38)
            goto L_0x017b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110695eg.A06():X.5wk");
    }

    public C119225wk A07(C53322fW r21, int i2) {
        AnonymousClass5xL r13;
        AnonymousClass5xL r14;
        C53302fU r4 = r21.A01;
        if (r4 == null) {
            Log.e("PAY: PaymentSettingsViewModel/getIncentiveBannerConfig/offerInfo is NULL");
            return null;
        }
        C42711yJ A0L = C110115dX.A0L(this.A0A);
        AnonymousClass5xL r12 = AnonymousClass5xL.A05;
        if (i2 == 2) {
            AnonymousClass00B.A06(r4);
            C35431lv r9 = r4.A07;
            int A002 = r9.A00() / r9.A00;
            if (A0L != null) {
                r13 = A01(A0L.A03());
                int A022 = A0L.A02();
                long j2 = r4.A05;
                r14 = new AnonymousClass5xL((String) null, new Object[]{Long.valueOf(j2), r9.A01.A9I(this.A06, new BigDecimal(((long) A002) * j2), 0)}, A022, 0);
            } else {
                r13 = r12;
                r14 = r12;
            }
            return new C119225wk(new AnonymousClass5wZ(-1, R.drawable.ic_incentive_main, R.dimen.dimen0444, R.dimen.dimen0445), new AnonymousClass62N(this, r4.A08.A01), r12, r13, r14, R.id.payment_incentive_nux_view, 0, 8, 0, 1);
        }
        if (A0L != null) {
            r12 = A01(!A0G() ? A0L.A04() : A0L.A01());
        }
        AnonymousClass00B.A06(r4);
        return new C119225wk(new AnonymousClass5wZ(-1, R.drawable.ic_incentive_main, R.dimen.dimen0444, R.dimen.dimen0445), new AnonymousClass62N(this, r4.A08.A01), r12, new AnonymousClass5xL(r4.A0F), new AnonymousClass5xL(r4.A0C, new Object[]{r4.A0B, "learn-more"}, R.string.str0b5d, 0), R.id.payment_incentive_nux_view, 0, 0, 8, 1);
    }

    public void A08(int i2, int i3) {
        C1222969a r4 = this.A0B;
        C53842gO A7M = r4.A7M();
        C110115dX.A10(A7M, i2);
        if (i3 >= 0) {
            A7M.A07 = Integer.valueOf(i3);
        }
        A7M.A0a = "payment_home";
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = "payment_home";
        A1Z[1] = "notify_verification_banner";
        A02(A7M, this, "notify_verification_banner", A1Z);
        r4.AKR(A7M);
    }

    public void A09(int i2, String str) {
        C1222969a r4 = this.A0B;
        C53842gO A7M = r4.A7M();
        C110115dX.A10(A7M, i2);
        A7M.A0a = "payment_home";
        Object[] A1Z = C13690nt.A1Z();
        C13690nt.A1L("payment_home", str, A1Z);
        A02(A7M, this, str, A1Z);
        r4.AKR(A7M);
    }

    public void A0A(Uri uri, C53322fW r10, String str, String str2) {
        AnonymousClass2St r1;
        if (this instanceof C114105n8) {
            C114105n8 r2 = (C114105n8) this;
            C1222969a r5 = r2.A0B;
            if (!(r5 instanceof AnonymousClass61W)) {
                return;
            }
            if ("notify_verification_banner".equals(str2)) {
                r2.A08(0, -1);
            } else if ("recovery_upin_upsell_banner".equals(str2) || "recovery_2fa_upsell_banner".equals(str2)) {
                r2.A09(0, str2);
            } else {
                AnonymousClass2St A002 = AnonymousClass5xP.A00(r2.A05, (C28401Vy) null, r10, str2, false);
                AnonymousClass61W r52 = (AnonymousClass61W) r5;
                boolean A0I = r2.A0I();
                if (uri != null) {
                    try {
                        String queryParameter = uri.getQueryParameter("campaignID");
                        if (!TextUtils.isEmpty(queryParameter)) {
                            r1 = A002 != null ? A002 : new AnonymousClass2St(new AnonymousClass2St[0]);
                            r1.A01("campaign_id", queryParameter);
                            AnonymousClass61W.A01(r52.A03(0, (Integer) null, "payment_home", str), r1, r52, A0I);
                        }
                    } catch (Exception unused) {
                    }
                }
                r1 = A002;
                AnonymousClass61W.A01(r52.A03(0, (Integer) null, "payment_home", str), r1, r52, A0I);
            }
        } else {
            boolean z2 = false;
            AnonymousClass2St A003 = AnonymousClass5xP.A00(this.A05, (C28401Vy) null, r10, str2, false);
            if (A003 == null) {
                A003 = new AnonymousClass2St(new AnonymousClass2St[0]);
            }
            if (this instanceof C114095n7) {
                z2 = !TextUtils.isEmpty(((C114095n7) this).A01);
            }
            A003.A02("isPushProvisioning", z2);
            AnonymousClass5xP.A02(A003, this.A0B, "payment_home", str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        if (r0.A08.A01 == r7.A09.A01().getLong("payment_incentive_offer_dismissed", -1)) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007a, code lost:
        if (((long) (r2.A01 + r2.A00)) < r8.A01.A05) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(X.C53322fW r8, X.C119225wk r9) {
        /*
            r7 = this;
            if (r9 == 0) goto L_0x001f
            if (r8 == 0) goto L_0x001f
            int r1 = r9.A01
            r0 = 1
            if (r1 != r0) goto L_0x005c
            X.0t3 r0 = r7.A05
            long r0 = X.C110105dW.A03(r0)
            int r0 = r8.A00(r0)
            X.5wk r1 = r7.A07(r8, r0)
            if (r1 == 0) goto L_0x001e
            X.027 r0 = r7.A01
            r0.A09(r1)
        L_0x001e:
            return
        L_0x001f:
            X.0wS r0 = r7.A0A
            X.1yJ r0 = X.C110115dX.A0L(r0)
            if (r8 == 0) goto L_0x005c
            if (r0 == 0) goto L_0x005c
            X.0pd r0 = r0.A07
            boolean r0 = X.C110115dX.A18(r0)
            if (r0 == 0) goto L_0x005c
            X.0t3 r0 = r7.A05
            long r0 = X.C110105dW.A03(r0)
            int r5 = r8.A00(r0)
            r0 = 1
            if (r5 == r0) goto L_0x0066
            r0 = 2
            if (r5 != r0) goto L_0x005c
            X.2fU r0 = r8.A01
            X.AnonymousClass00B.A06(r0)
            X.2fV r0 = r0.A08
            long r3 = r0.A01
            X.0wT r0 = r7.A09
            android.content.SharedPreferences r6 = r0.A01()
            java.lang.String r2 = "payment_incentive_offer_dismissed"
            r0 = -1
            long r1 = r6.getLong(r2, r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x007c
        L_0x005c:
            X.027 r1 = r7.A01
            X.5wk r0 = r7.A06()
        L_0x0062:
            r1.A09(r0)
            return
        L_0x0066:
            X.2fT r2 = r8.A02
            if (r2 == 0) goto L_0x007c
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x007c
            int r1 = r2.A01
            int r0 = r2.A00
            int r1 = r1 + r0
            long r3 = (long) r1
            X.2fU r0 = r8.A01
            long r1 = r0.A05
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x005c
        L_0x007c:
            X.027 r1 = r7.A01
            X.5wk r0 = r7.A07(r8, r5)
            goto L_0x0062
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110695eg.A0B(X.2fW, X.5wk):void");
    }

    public void A0C(C53322fW r7, Integer num, String str) {
        AnonymousClass5xP.A01(AnonymousClass5xP.A00(this.A05, (C28401Vy) null, r7, str, false), this.A0B, num, "payment_home", (String) null, 1);
    }

    public void A0D(C53322fW r7, Integer num, String str) {
        AnonymousClass5xP.A01(AnonymousClass5xP.A00(this.A05, (C28401Vy) null, r7, str, false), this.A0B, num, "payment_home", (String) null, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
        if ("api.whatsapp.com".equals(r1) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L_0x0035
            android.net.Uri r1 = android.net.Uri.parse(r4)
            java.util.List r0 = r1.getPathSegments()
            int r2 = r0.size()
            java.lang.String r0 = r1.getScheme()
            java.lang.String r1 = r1.getHost()
            boolean r0 = X.C18030w2.A07(r0, r1)
            if (r0 != 0) goto L_0x0029
            java.lang.String r0 = "api.whatsapp.com"
            boolean r1 = r0.equals(r1)
            r0 = 0
            if (r1 == 0) goto L_0x002a
        L_0x0029:
            r0 = 1
        L_0x002a:
            if (r2 <= r0) goto L_0x0035
            X.027 r1 = r3.A00
            java.lang.Integer r0 = X.C13680ns.A0Y()
            r1.A09(r0)
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110695eg.A0E(java.lang.String):void");
    }

    public void A0F(List list) {
        this.A04 = list;
    }

    public boolean A0G() {
        if (this instanceof C114105n8) {
            return ((C114105n8) this).A06.A0C();
        }
        if (!(this instanceof C114095n7)) {
            return false;
        }
        C114095n7 r1 = (C114095n7) this;
        return r1.A03.A06.A03() && !C110105dW.A0i(r1.A0A).isEmpty();
    }
}
