package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass173;
import X.AnonymousClass17O;
import X.AnonymousClass17Y;
import X.AnonymousClass1GO;
import X.AnonymousClass1GP;
import X.AnonymousClass1MF;
import X.AnonymousClass1TR;
import X.AnonymousClass1WD;
import X.AnonymousClass1XP;
import X.AnonymousClass4PY;
import X.AnonymousClass5vX;
import X.AnonymousClass5wX;
import X.AnonymousClass5x7;
import X.AnonymousClass5xF;
import X.AnonymousClass5xG;
import X.AnonymousClass5xI;
import X.AnonymousClass5xP;
import X.AnonymousClass60U;
import X.AnonymousClass61I;
import X.AnonymousClass623;
import X.AnonymousClass626;
import X.AnonymousClass62Q;
import X.AnonymousClass630;
import X.AnonymousClass66M;
import X.AnonymousClass68K;
import X.AnonymousClass69U;
import X.C000900k;
import X.C005702l;
import X.C110105dW;
import X.C110115dX;
import X.C111565ga;
import X.C111675hA;
import X.C111845hV;
import X.C112705iw;
import X.C112735j2;
import X.C112765jH;
import X.C114555nx;
import X.C116125qr;
import X.C116285r8;
import X.C116295r9;
import X.C116825s0;
import X.C116835s1;
import X.C116845s2;
import X.C117125sU;
import X.C117265si;
import X.C117325so;
import X.C117685tO;
import X.C117715tR;
import X.C118205uJ;
import X.C118255uO;
import X.C118335uW;
import X.C118365uZ;
import X.C118585uv;
import X.C118605ux;
import X.C118915vc;
import X.C118955vg;
import X.C119165we;
import X.C119285wq;
import X.C119315wt;
import X.C1200860g;
import X.C1204661t;
import X.C1205261z;
import X.C1205562c;
import X.C1205762e;
import X.C1207662x;
import X.C1207762y;
import X.C1220768e;
import X.C1222969a;
import X.C1223969k;
import X.C13680ns;
import X.C13690nt;
import X.C14710pd;
import X.C14870pt;
import X.C15830rv;
import X.C16010sH;
import X.C16030sJ;
import X.C16040sK;
import X.C16080sP;
import X.C16320sq;
import X.C16440t3;
import X.C16740tZ;
import X.C17020u3;
import X.C17110uY;
import X.C17250um;
import X.C18260wP;
import X.C18270wQ;
import X.C18280wR;
import X.C18290wS;
import X.C18300wT;
import X.C18310wU;
import X.C18320wV;
import X.C18340wX;
import X.C209512f;
import X.C209712h;
import X.C28401Vy;
import X.C28411Vz;
import X.C30581cc;
import X.C30671cl;
import X.C31081dR;
import X.C32241fu;
import X.C34151jm;
import X.C35361lo;
import X.C35421lu;
import X.C35431lv;
import X.C35481m0;
import X.C35511m3;
import X.C39891tE;
import X.C39901tF;
import X.C41411vk;
import X.C42511xv;
import X.C53302fU;
import X.C53312fV;
import X.C53322fW;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MenuItem;
import com.facebook.redex.IDxCListenerShape30S0200000_3_I1;
import com.facebook.redex.IDxDListenerShape160S0100000_3_I1;
import com.facebook.redex.IDxNConsumerShape42S0200000_3_I1;
import com.facebook.redex.IDxTObserverShape253S0100000_3_I1;
import com.facebook.redex.RunnableRunnableShape6S0200000_I0_4;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.obwhatsapp.R;
import com.obwhatsapp.authentication.FingerprintBottomSheet;
import com.obwhatsapp.numberkeyboard.NumberEntryKeyboard;
import com.obwhatsapp.payments.CheckFirstTransaction;
import com.obwhatsapp.payments.IDxAObserverShape92S0100000_3_I1;
import com.obwhatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.obwhatsapp.payments.ui.viewmodel.PaymentIncentiveViewModel;
import com.obwhatsapp.payments.ui.widget.PaymentView;
import com.whatsapp.jid.UserJid;
import java.util.List;

public class BrazilPaymentActivity extends C112735j2 implements AnonymousClass69U, C1223969k, C1220768e, AnonymousClass68K {
    public int A00;
    public Context A01;
    public AnonymousClass1WD A02;
    public C16080sP A03;
    public AnonymousClass013 A04;
    public AnonymousClass173 A05;
    public AnonymousClass60U A06;
    public AnonymousClass5x7 A07;
    public C1200860g A08;
    public C119315wt A09;
    public CheckFirstTransaction A0A;
    public C1204661t A0B;
    public AnonymousClass1GP A0C;
    public AnonymousClass17O A0D;
    public C18300wT A0E;
    public AnonymousClass17Y A0F;
    public C18320wV A0G;
    public C118255uO A0H;
    public C209512f A0I;
    public C209712h A0J;
    public C119285wq A0K;
    public C1222969a A0L;
    public C118585uv A0M;
    public C118335uW A0N;
    public C112705iw A0O;
    public AnonymousClass5xG A0P;
    public C118915vc A0Q;
    public AnonymousClass1TR A0R;
    public AnonymousClass5vX A0S;
    public C118955vg A0T;
    public ConfirmPaymentFragment A0U;
    public C119165we A0V;
    public PaymentView A0W;
    public AnonymousClass5xF A0X;
    public C118205uJ A0Y;
    public C18280wR A0Z;
    public C17020u3 A0a;
    public C17110uY A0b;
    public String A0c;
    public String A0d;
    public boolean A0e;
    public boolean A0f = false;
    public final AnonymousClass4PY A0g = new IDxAObserverShape92S0100000_3_I1(this, 0);
    public final C41411vk A0h = new IDxTObserverShape253S0100000_3_I1(this, 0);

    public static /* synthetic */ void A02(BottomSheetDialogFragment bottomSheetDialogFragment, BrazilPaymentActivity brazilPaymentActivity) {
        C32241fu A002 = C32241fu.A00(brazilPaymentActivity);
        C110115dX.A0m(brazilPaymentActivity.A01, A002, R.string.str0e48);
        A002.A09(new IDxCListenerShape30S0200000_3_I1(bottomSheetDialogFragment, 5, brazilPaymentActivity), brazilPaymentActivity.A01.getString(R.string.str02ac));
        C005702l create = A002.create();
        create.setOnDismissListener(new IDxDListenerShape160S0100000_3_I1(bottomSheetDialogFragment, 3));
        create.show();
    }

    public static /* synthetic */ void A03(C28401Vy r6, C30671cl r7, AnonymousClass1XP r8, BrazilPaymentActivity brazilPaymentActivity, String str, String str2) {
        PinBottomSheetDialogFragment A002 = C118605ux.A00();
        A002.A0E.A00 = brazilPaymentActivity;
        A002.A0C = new C1205261z(r6, r7, r8, A002, brazilPaymentActivity, str2, str);
        brazilPaymentActivity.A0O.AL3("enter_pin", brazilPaymentActivity.A00);
        brazilPaymentActivity.Afc(A002);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        r1 = r3.A0L;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A09(X.C30671cl r4, int r5) {
        /*
            X.1tF r3 = r4.A08
            X.1tE r3 = (X.C39891tE) r3
            r2 = 0
            if (r3 == 0) goto L_0x001e
            boolean r1 = X.C119405xi.A09(r4)
            r0 = 1
            if (r1 == 0) goto L_0x001e
            if (r5 != r0) goto L_0x001f
            java.lang.String r1 = r3.A0N
            if (r1 == 0) goto L_0x002f
            java.lang.String r0 = "DISABLED"
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x002f
        L_0x001e:
            return r2
        L_0x001f:
            if (r5 != 0) goto L_0x001e
            java.lang.String r1 = r3.A0L
            if (r1 == 0) goto L_0x002f
            java.lang.String r0 = "DISABLED"
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x001e
        L_0x002f:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.BrazilPaymentActivity.A09(X.1cl, int):boolean");
    }

    public C35421lu A3F() {
        if (!(this instanceof BrazilOrderDetailsActivity)) {
            return null;
        }
        BrazilOrderDetailsActivity brazilOrderDetailsActivity = (BrazilOrderDetailsActivity) this;
        String str = brazilOrderDetailsActivity.A0G;
        AnonymousClass00B.A06(str);
        return new C35421lu(str, brazilOrderDetailsActivity.A0D.A01, brazilOrderDetailsActivity.A0O.A03.A0C(2178) ? brazilOrderDetailsActivity.A0H : null, brazilOrderDetailsActivity.A00);
    }

    public AnonymousClass5wX A3G(C30671cl r43, C35431lv r44, String str, String str2, String str3) {
        C39901tF r12;
        C16440t3 r19 = this.A05;
        C14710pd r21 = this.A0C;
        C14870pt r41 = this.A05;
        C16040sK r40 = this.A01;
        C16320sq r17 = this.A05;
        C118365uZ r16 = this.A0Q;
        C18290wS r14 = this.A0P;
        C18280wR r10 = this.A0Z;
        C118585uv r9 = this.A0M;
        C118915vc r8 = this.A0Q;
        C18310wU r7 = this.A0M;
        AnonymousClass1GO r6 = this.A0T;
        C18260wP r5 = this.A07;
        C18340wX r4 = this.A0K;
        AnonymousClass5xG r3 = this.A0P;
        C119285wq r2 = this.A0K;
        C30671cl r15 = r43;
        String str4 = r15.A0A;
        UserJid userJid = this.A0G;
        AnonymousClass00B.A06(userJid);
        String str5 = (r15.A04() != 6 || (r12 = r15.A08) == null) ? null : ((C39891tE) r12).A03 == 1 ? "debit" : "credit";
        C35431lv r152 = r44;
        return new AnonymousClass5wX(this, r41, r40, r5, r19, r152, r152, A3F(), r21, userJid, r4, r7, r14, r16, r2, r9, r6, A3H(r152.A02, this.A01), r3, r8, r10, r17, str4, str3, str5, str, str2);
    }

    public C53312fV A3H(C28401Vy r5, int i2) {
        C53302fU r2;
        if (i2 == 0 && (r2 = this.A0T.A00().A01) != null) {
            if (r5.A00.compareTo(r2.A09.A00.A02.A00) >= 0) {
                return r2.A08;
            }
        }
        return null;
    }

    public final AddPaymentMethodBottomSheet A3I(String str) {
        Context context;
        int i2;
        if (this.A0O.A0A() || C112765jH.A23(this)) {
            context = this.A01;
            i2 = R.string.str14f7;
        } else {
            context = this.A01;
            i2 = R.string.str000d;
        }
        String string = context.getString(i2);
        Intent A042 = C110105dW.A04(this, BrazilPayBloksActivity.class);
        A042.putExtra("screen_name", str);
        A042.putExtra("hide_send_payment_cta", true);
        C111675hA.A03(A042, "referral_screen", "get_started");
        this.A0T.A04(A042, "p2m_context");
        C117265si r2 = new C117265si(A042, (String) null, string, (String) null);
        AddPaymentMethodBottomSheet addPaymentMethodBottomSheet = new AddPaymentMethodBottomSheet();
        addPaymentMethodBottomSheet.A0T(C13690nt.A0D());
        addPaymentMethodBottomSheet.A04 = r2;
        return addPaymentMethodBottomSheet;
    }

    public final void A3J(C28401Vy r17, C30671cl r18) {
        AnonymousClass1WD A012;
        PaymentView paymentView = this.A0W;
        C34151jm stickerIfSelected = paymentView != null ? paymentView.getStickerIfSelected() : null;
        C53322fW r12 = null;
        C35361lo paymentBackground = paymentView != null ? paymentView.getPaymentBackground() : null;
        if (stickerIfSelected == null && paymentBackground == null) {
            A012 = null;
        } else {
            C18270wQ r5 = this.A0S;
            C15830rv r7 = this.A0E;
            AnonymousClass00B.A06(r7);
            UserJid userJid = this.A0G;
            long j2 = this.A02;
            C16740tZ A002 = j2 != 0 ? this.A09.A0K.A00(j2) : null;
            PaymentView paymentView2 = this.A0W;
            A012 = r5.A01(paymentBackground, r7, userJid, A002, stickerIfSelected, paymentView2 != null ? paymentView2.getStickerSendOrigin() : null);
        }
        C28411Vz A013 = this.A05.A01("BRL");
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        C35511m3 A052 = this.A0G != null ? C110115dX.A0H(this.A0P).A05(this.A0G) : null;
        PaymentIncentiveViewModel paymentIncentiveViewModel = this.A0X;
        if (!(paymentIncentiveViewModel == null || paymentIncentiveViewModel.A02.A01() == null)) {
            r12 = (C53322fW) ((AnonymousClass5xI) this.A0X.A02.A01()).A01;
        }
        int A053 = ((!this.A0O.A06() || A3F() == null) && (!this.A0O.A04() || !this.A0e)) ? (A052 == null || A052.A05 == null || !A052.A0B()) ? 1 : A052.A05() : 0;
        UserJid userJid2 = this.A0G;
        AnonymousClass00B.A06(userJid2);
        C30671cl r4 = r18;
        ConfirmPaymentFragment A014 = ConfirmPaymentFragment.A01(r4, userJid2, this.A0n, A053);
        paymentBottomSheet.A01 = A014;
        paymentBottomSheet.A02.A00 = this;
        C28401Vy r11 = r17;
        A014.A0M = new AnonymousClass626(A012, r11, r12, this, A014, paymentBottomSheet);
        A014.A0L = new AnonymousClass623(A013, r11, r4, r12, this, A014);
        this.A0U = A014;
        this.A0O.AL3("confirm_payment", this.A00);
        Afc(paymentBottomSheet);
    }

    public final void A3K(C28401Vy r19, C30671cl r20, AnonymousClass1XP r21, String str, String str2) {
        FingerprintBottomSheet A092 = C110115dX.A09();
        C28401Vy r6 = r19;
        C30671cl r7 = r20;
        String str3 = str2;
        AnonymousClass5wX A3G = A3G(r7, new C35431lv(C35481m0.A04, 1000, (long) r6.A00.scaleByPowerOfTen(3).intValue()), str3, "fingerprint", this.A0d);
        A092.A05 = new C111565ga(this, A092, this.A05, A3G, this.A0Q, new AnonymousClass61I(A092, r6, r7, r21, this, str, str3));
        this.A0O.AL3("enter_fingerprint", this.A00);
        Afc(A092);
    }

    public void A3L(C28401Vy r12, C30671cl r13, AnonymousClass1XP r14, String str, String str2, String str3, int i2) {
        String paymentNote;
        List mentionedJids;
        PaymentView paymentView = this.A0W;
        if (paymentView == null) {
            mentionedJids = AnonymousClass000.A0u();
            paymentNote = "";
        } else {
            paymentNote = paymentView.getPaymentNote();
            mentionedJids = this.A0W.getMentionedJids();
        }
        C30581cc A36 = A36(paymentNote, mentionedJids);
        C111845hV r6 = new C111845hV();
        r6.A02 = str;
        r6.A04 = A36.A11.A01;
        r6.A03 = this.A0Z.A01();
        A3N(r6, i2);
        CheckFirstTransaction checkFirstTransaction = this.A0A;
        C28401Vy r3 = r12;
        C30671cl r4 = r13;
        AnonymousClass1XP r5 = r14;
        String str4 = str2;
        String str5 = str3;
        if (checkFirstTransaction != null) {
            checkFirstTransaction.A00.A00(new AnonymousClass630(r3, r4, r5, r6, this, A36, str4, str5));
            return;
        }
        C28411Vz A012 = this.A05.A01("BRL");
        C13680ns.A1U(new C114555nx(A012, r3, r4, r5, r6, this, A36, str4, str5), this.A05);
    }

    public void A3M(C28401Vy r4, boolean z2) {
        this.A02.A04();
        AnonymousClass1WD A002 = this.A0P.A01().A00();
        this.A02 = A002;
        A002.A01(new C1207762y(r4, this, z2), this.A05.A06);
    }

    public void A3N(C111845hV r2, int i2) {
        if (i2 == 1) {
            A3B(r2);
        }
    }

    public C000900k A9l() {
        return this;
    }

    public String AEa() {
        return null;
    }

    public boolean AJO() {
        return TextUtils.isEmpty(this.A0l);
    }

    public boolean AJf() {
        return false;
    }

    public void AM9() {
    }

    public void AMQ(String str) {
    }

    public void AQb(String str) {
        C112705iw r4 = this.A0O;
        int i2 = this.A00;
        C31081dR A002 = r4.A00(Integer.valueOf(i2), "p2p_flow_tag");
        if (A002 != null) {
            A002.A07.AKp("error_message", str, A002.A06.A05, i2);
        }
        AnonymousClass5xP.A01(AnonymousClass5xP.A00(this.A05, (C28401Vy) null, this.A0U, (String) null, true), this.A0L, 51, "new_payment", this.A0c, 4);
    }

    public void ART(String str, boolean z2) {
        if (!TextUtils.isEmpty(str) && !z2) {
            A3D(this.A0L, this.A0U);
        }
    }

    public void ARu() {
        C53322fW r3 = this.A0U;
        if (r3 != null && r3.A01 != null) {
            C1222969a r2 = this.A0L;
            Bundle A0D2 = C13690nt.A0D();
            PaymentIncentiveViewFragment paymentIncentiveViewFragment = new PaymentIncentiveViewFragment(r2, r3);
            paymentIncentiveViewFragment.A0T(A0D2);
            paymentIncentiveViewFragment.A03 = new C116125qr(paymentIncentiveViewFragment);
            Afc(paymentIncentiveViewFragment);
        }
    }

    public void AUU() {
        C15830rv r0 = this.A0E;
        AnonymousClass00B.A06(r0);
        if (C16030sJ.A0L(r0) && this.A00 == 0) {
            A39(C13690nt.A0E(this));
        }
    }

    public void AUV() {
    }

    public /* synthetic */ void AUa() {
    }

    public void AWE(C28401Vy r7, String str) {
        String A022 = this.A0T.A02(true);
        C42511xv A012 = this.A0P.A01();
        AnonymousClass1WD r3 = new AnonymousClass1WD();
        A012.A03.Acl(new RunnableRunnableShape6S0200000_I0_4(A012, 42, r3));
        r3.A00(new C1207662x(r7, this, A022));
    }

    public void AWz(C28401Vy r5) {
        C16010sH r0;
        String A022 = this.A0T.A02(true);
        if (A022 == null) {
            if (!this.A0O.A04() || (r0 = this.A0A) == null || !r0.A0H()) {
                A3M(r5, false);
                return;
            }
            Afq(R.string.str13db);
            this.A04.A01(new IDxNConsumerShape42S0200000_3_I1(r5, 3, this), this.A05.A06);
        } else if ("brpay_p_account_recovery_eligibility_screen".equals(A022)) {
            AnonymousClass5xF r3 = this.A0X;
            BrazilAccountRecoveryEligibilityBottomSheet A012 = BrazilAccountRecoveryEligibilityBottomSheet.A01("send_flow");
            A012.A04 = new C117125sU(this, r3, "send_flow");
            Afc(A012);
        } else {
            AddPaymentMethodBottomSheet A3I = A3I(A022);
            A3I.A06.A00 = this;
            A3I.A05 = new AnonymousClass66M(r5, A3I, this);
            Afc(A3I);
        }
    }

    public void AX0() {
        C112765jH.A22(this, this.A0L, this.A0U, 47);
    }

    public void AX2() {
    }

    public void AYk(boolean z2) {
        C112765jH.A22(this, this.A0L, this.A0U, z2 ? 49 : 48);
    }

    public /* bridge */ /* synthetic */ Object Aat() {
        C28411Vz A012 = this.A05.A01("BRL");
        C15830rv r17 = this.A0E;
        String str = this.A0h;
        C34151jm r14 = this.A0c;
        Integer num = this.A0e;
        String str2 = this.A0m;
        int i2 = 2;
        if (this.A0r) {
            i2 = 0;
        }
        C116845s2 r2 = new C116845s2(i2, 0);
        C116295r9 r1 = new C116295r9(false);
        C116825s0 r0 = new C116825s0(NumberEntryKeyboard.A00(this.A04), this.A0p);
        String str3 = this.A0l;
        String str4 = this.A0i;
        String str5 = this.A0k;
        C116285r8 r4 = new C116285r8(A012);
        AnonymousClass013 r8 = this.A04;
        C28401Vy ADP = A012.ADP();
        AnonymousClass62Q r25 = new AnonymousClass62Q(this, r8, A012, ADP, A012.ADn(), ADP);
        C117685tO r21 = new C117685tO(new Pair(Integer.valueOf(R.style.style0252), new int[]{0, 0, 0, 0}), new Pair(Integer.valueOf(R.style.style0253), new int[]{0, 0, 0, 0}), r4, r25, str3, str4, str5, R.style.style0251, true, true, true);
        C14710pd r12 = this.A0C;
        C17250um r9 = this.A0B;
        AnonymousClass01V r82 = this.A08;
        AnonymousClass013 r7 = this.A04;
        AnonymousClass1MF r6 = this.A0d;
        AnonymousClass01V r24 = r82;
        AnonymousClass013 r252 = r7;
        C17250um r26 = r9;
        C14710pd r27 = r12;
        C1205762e r22 = new C1205762e(this, r24, r252, r26, r27, new C1205562c(), this.A0a, r6);
        C116835s1 r72 = new C116835s1(this, r12.A0C(811));
        C209712h r92 = this.A0J;
        return new C117715tR(r17, r22, this, this, r21, new C117325so(this.A0C, this.A0I, r92, false), r0, r1, r72, r2, r14, num, str, str2, false);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 1) {
            super.onActivityResult(i2, i3, intent);
            return;
        }
        this.A02.A04();
        AnonymousClass1WD A002 = this.A0P.A01().A00();
        this.A02 = A002;
        if (i3 == -1) {
            A002.A01(new IDxNConsumerShape42S0200000_3_I1(intent, 1, this), this.A05.A06);
        }
    }

    public void onBackPressed() {
        PaymentView paymentView = this.A0W;
        if (paymentView == null || !paymentView.A0G()) {
            C15830rv r0 = this.A0E;
            AnonymousClass00B.A06(r0);
            if (!C16030sJ.A0L(r0) || this.A00 != 0) {
                AnonymousClass5xP.A01(AnonymousClass5xP.A00(this.A05, (C28401Vy) null, this.A0U, (String) null, true), this.A0L, 1, "new_payment", (String) null, 1);
                finish();
                return;
            }
            this.A0G = null;
            A39(C13690nt.A0E(this));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            X.0tz r0 = r5.A07
            android.content.Context r0 = r0.A00
            r5.A01 = r0
            X.0wS r0 = r5.A0P
            X.1xv r0 = r0.A01()
            X.1WD r0 = r0.A00()
            r5.A02 = r0
            X.1GP r1 = r5.A0C
            X.4PY r0 = r5.A0g
            r1.A02(r0)
            com.whatsapp.jid.UserJid r0 = r5.A0G
            if (r0 != 0) goto L_0x0039
            X.0rv r1 = r5.A0E
            X.AnonymousClass00B.A06(r1)
            boolean r0 = X.C16030sJ.A0L(r1)
            if (r0 == 0) goto L_0x0033
            android.os.Bundle r0 = X.C13690nt.A0E(r5)
            r5.A39(r0)
        L_0x0032:
            return
        L_0x0033:
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r1)
            r5.A0G = r0
        L_0x0039:
            r5.A38(r6)
            if (r6 != 0) goto L_0x00b3
            X.5iw r2 = r5.A0O
            r1 = 185470254(0xb0e0d2e, float:2.735812E-32)
            java.lang.String r0 = r5.A0c
            java.lang.Integer r0 = r2.A03(r0, r1)
            if (r0 == 0) goto L_0x0051
            int r0 = r0.intValue()
        L_0x004f:
            r5.A00 = r0
        L_0x0051:
            android.content.Intent r0 = r5.getIntent()
            if (r0 == 0) goto L_0x0070
            android.content.Intent r1 = r5.getIntent()
            java.lang.String r0 = "extra_request_id"
            java.lang.String r0 = r1.getStringExtra(r0)
            r5.A0d = r0
            android.content.Intent r2 = r5.getIntent()
            r1 = 0
            java.lang.String r0 = "extra_should_open_transaction_detail_after_send_override"
            boolean r0 = r2.getBooleanExtra(r0, r1)
            r5.A0t = r0
        L_0x0070:
            X.0pd r1 = r5.A0C
            r0 = 1482(0x5ca, float:2.077E-42)
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x008e
            X.0sq r4 = r5.A05
            X.0wS r3 = r5.A0P
            X.0wT r2 = r5.A0E
            X.175 r0 = r5.A0I
            com.obwhatsapp.payments.CheckFirstTransaction r1 = new com.obwhatsapp.payments.CheckFirstTransaction
            r1.<init>(r0, r2, r3, r4)
            r5.A0A = r1
            X.04p r0 = r5.A06
            r0.A00(r1)
        L_0x008e:
            X.5vg r0 = r5.A0T
            X.5vc r0 = r0.A06
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x0032
            X.0wT r2 = r5.A0E
            android.content.SharedPreferences r1 = r2.A01()
            java.lang.String r0 = "payment_account_recoverable"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00ba
            android.content.SharedPreferences r1 = r2.A01()
            java.lang.String r0 = "payment_account_recoverable_time_ms"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x00ba
            return
        L_0x00b3:
            java.lang.String r0 = "flow_instance_key"
            int r0 = r6.getInt(r0)
            goto L_0x004f
        L_0x00ba:
            X.0pd r1 = r5.A0C
            r0 = 2000(0x7d0, float:2.803E-42)
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x0032
            X.5uO r0 = r5.A0H
            r0.A00(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.BrazilPaymentActivity.onCreate(android.os.Bundle):void");
    }

    public Dialog onCreateDialog(int i2) {
        Dialog A012 = this.A0V.A01((Bundle) null, this, i2);
        return A012 == null ? super.onCreateDialog(i2) : A012;
    }

    public void onDestroy() {
        super.onDestroy();
        if (!this.A0f) {
            this.A0O.A06(this.A00, 4);
            this.A0F.A03(this.A0h);
        }
        this.A0L.reset();
        this.A0C.A03(this.A0g);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        C15830rv r0 = this.A0E;
        AnonymousClass00B.A06(r0);
        if (!C16030sJ.A0L(r0) || this.A00 != 0) {
            finish();
            return true;
        }
        this.A0G = null;
        A39(C13690nt.A0E(this));
        return true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("flow_instance_key", this.A00);
    }
}
