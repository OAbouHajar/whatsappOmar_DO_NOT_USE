package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass00X;
import X.AnonymousClass01V;
import X.AnonymousClass01X;
import X.AnonymousClass173;
import X.AnonymousClass175;
import X.AnonymousClass1HS;
import X.AnonymousClass1TV;
import X.AnonymousClass1Vo;
import X.AnonymousClass2HJ;
import X.AnonymousClass2HK;
import X.AnonymousClass2St;
import X.AnonymousClass3w0;
import X.AnonymousClass4XO;
import X.AnonymousClass5ko;
import X.AnonymousClass5vV;
import X.AnonymousClass60V;
import X.AnonymousClass61W;
import X.AnonymousClass68T;
import X.C005402i;
import X.C110105dW;
import X.C110115dX;
import X.C110815es;
import X.C111345g2;
import X.C111805hR;
import X.C112275iE;
import X.C112715ix;
import X.C113285ln;
import X.C116165qv;
import X.C117485t4;
import X.C117995tt;
import X.C119175wf;
import X.C119265wo;
import X.C119295wr;
import X.C119365wy;
import X.C119405xi;
import X.C1200960h;
import X.C1204661t;
import X.C1222768y;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14710pd;
import X.C14870pt;
import X.C16150sX;
import X.C16320sq;
import X.C16980tz;
import X.C17130ua;
import X.C17190ug;
import X.C18280wR;
import X.C18290wS;
import X.C18310wU;
import X.C18340wX;
import X.C19980zJ;
import X.C32241fu;
import X.C35521m4;
import X.C38411qk;
import X.C38461qp;
import X.C45922Bq;
import X.C49132Rg;
import X.C53842gO;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxECallbackShape391S0100000_3_I1;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class IndiaUpiBankAccountPickerActivity extends AnonymousClass5ko implements AnonymousClass1TV, C1222768y, AnonymousClass68T {
    public int A00;
    public int A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public ImageView A08;
    public TextView A09;
    public TextView A0A;
    public RecyclerView A0B;
    public C17130ua A0C;
    public AnonymousClass173 A0D;
    public C1204661t A0E;
    public C111805hR A0F;
    public AnonymousClass1HS A0G;
    public AnonymousClass4XO A0H;
    public C119175wf A0I;
    public C112275iE A0J;
    public AnonymousClass5vV A0K;
    public C1200960h A0L;
    public C113285ln A0M;
    public C117995tt A0N;
    public C119295wr A0O;
    public C18280wR A0P;
    public C38411qk A0Q;
    public String A0R;
    public ArrayList A0S;
    public List A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public final C53842gO A0X;
    public final AnonymousClass1Vo A0Y;

    public IndiaUpiBankAccountPickerActivity() {
        this(0);
        this.A0Y = C110115dX.A0S("IndiaUpiBankAccountPickerActivity");
        this.A01 = -1;
        this.A0X = new C53842gO();
        this.A0V = false;
    }

    public IndiaUpiBankAccountPickerActivity(int i2) {
        this.A0U = false;
        C110105dW.A0t(this, 39);
    }

    public void A1q() {
        if (!this.A0U) {
            this.A0U = true;
            C49132Rg A0C2 = C110105dW.A0C(this);
            C16150sX r1 = A0C2.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C2, r1, this, C110105dW.A0F(r1));
            C111345g2.A1k(A0C2, r1, this, C111345g2.A1e(r1, this));
            C111345g2.A1q(r1, this);
            this.A0C = (C17130ua) r1.AN9.get();
            this.A0P = C110115dX.A0V(r1);
            this.A0K = (AnonymousClass5vV) r1.AHW.get();
            this.A0L = (C1200960h) r1.ACB.get();
            this.A0D = C110115dX.A0D(r1);
            this.A0E = C110115dX.A0J(r1);
            this.A0G = (AnonymousClass1HS) r1.AHb.get();
            this.A0O = A0C2.A0X();
            this.A0M = (C113285ln) r1.ACF.get();
        }
    }

    public void A3S() {
        ArrayList arrayList = this.A0S;
        if (arrayList == null || arrayList.size() == 0) {
            this.A08.setVisibility(0);
            this.A09.setVisibility(8);
            this.A04.setVisibility(4);
            this.A06.setVisibility(0);
            this.A0B.setVisibility(8);
            this.A02.setVisibility(8);
            this.A03.setVisibility(8);
            this.A07.setVisibility(0);
            this.A05.setVisibility(8);
            this.A08.setImageDrawable(getResources().getDrawable(R.drawable.ic_account_search));
            this.A0A.setText(R.string.str0084);
            this.A0I.A01(this.A0F);
        } else {
            this.A0X.A0H = Long.valueOf((long) arrayList.size());
            this.A0T = AnonymousClass000.A0u();
            this.A01 = -1;
            this.A0W = false;
            int i2 = 0;
            while (true) {
                ArrayList arrayList2 = this.A0S;
                if (i2 >= arrayList2.size()) {
                    break;
                }
                C111805hR r7 = (C111805hR) arrayList2.get(i2);
                this.A0T.add(new C117485t4((String) C110105dW.A0d(r7.A03), C119405xi.A07((String) C110105dW.A0d(r7.A02)), (String) C110105dW.A0d(r7.A01), getString(r7.A0C()), r7.A0H));
                i2++;
            }
            this.A04.setVisibility(0);
            this.A06.setVisibility(8);
            this.A0B.setVisibility(0);
            int i3 = 0;
            while (true) {
                if (i3 >= this.A0T.size()) {
                    break;
                }
                C117485t4 r1 = (C117485t4) this.A0T.get(i3);
                if (this.A01 == -1 && !r1.A05) {
                    this.A01 = i3;
                    r1.A00 = true;
                    break;
                }
                i3++;
            }
            this.A08.setVisibility(0);
            this.A07.setVisibility(0);
            this.A02.setVisibility(0);
            this.A03.setVisibility(0);
            this.A05.setVisibility(0);
            this.A08.setImageDrawable(AnonymousClass00X.A04((Resources.Theme) null, getResources(), R.drawable.ic_account_found));
            int size = this.A0S.size();
            TextView textView = this.A0A;
            if (size == 1) {
                textView.setText(R.string.str0fe8);
                this.A09.setVisibility(8);
            } else {
                textView.setText(R.string.str0fe5);
                this.A09.setText(R.string.str0fe4);
                this.A09.setVisibility(0);
            }
            if (this.A01 == -1) {
                this.A02.setEnabled(false);
                this.A03.setVisibility(4);
            } else {
                this.A03.setVisibility(0);
                this.A02.setEnabled(true);
                C110105dW.A0r(this.A02, this, 33);
            }
            List list = this.A0T;
            if (list != null) {
                this.A0B.setAdapter(new C110815es(new C116165qv(this), this, list));
                this.A0M.A00.A09("bankAccountPickerShown");
            }
        }
        invalidateOptionsMenu();
    }

    public final void A3T() {
        if (this.A01 < 0) {
            Log.e("selected account position is invalid");
            return;
        }
        this.A0M.A00.A09("bankAccountAddClicked");
        this.A02.setVisibility(8);
        this.A0W = true;
        AnonymousClass01X r0 = this.A0B.A0N;
        if (r0 != null) {
            r0.A01();
        }
        boolean z2 = this.A0R;
        this.A0J.A00((C111805hR) this.A0S.get(this.A01), new IDxECallbackShape391S0100000_3_I1(this, 0), z2, z2);
        this.A0E.AgB();
        C53842gO r2 = this.A0X;
        r2.A0G = Long.valueOf((long) this.A01);
        r2.A07 = C13690nt.A0U();
        C111345g2.A1t(r2, this, "nav_select_account");
        C110115dX.A10(r2, 1);
        C111345g2.A1s(r2, this);
    }

    public final void A3U(C35521m4 r4) {
        this.A0Y.A06(AnonymousClass000.A0h(this.A0H.toString(), AnonymousClass000.A0r("showSuccessAndFinish: ")));
        A3I();
        this.A04 = r4;
        StringBuilder A0r = AnonymousClass000.A0r("Is first payment method:");
        A0r.append(this.A0S);
        A0r.append(", entry point:");
        Log.i(AnonymousClass000.A0l(A0r, this.A02));
        A3Q("nav_select_account");
    }

    public final void A3V(C119265wo r5, boolean z2) {
        int i2 = r5.A00;
        this.A0Y.A06(C13680ns.A0c(i2, "showSuccessAndFinish: resId "));
        A3I();
        if (i2 == 0) {
            i2 = R.string.str10f2;
            String str = this.A0H.A04;
            if ("upi-register-vpa".equalsIgnoreCase(str)) {
                i2 = R.string.str102a;
            }
            if ("upi-get-accounts".equalsIgnoreCase(str)) {
                i2 = R.string.str09b1;
            }
        }
        if (this.A0R || z2) {
            A3H();
            Intent A042 = C110105dW.A04(this, IndiaUpiOnboardingErrorEducationActivity.class);
            if (r5.A01 != null) {
                A042.putExtra("error_text", r5.A01(this));
            }
            A042.putExtra("error", i2);
            A042.putExtra("error_type", this.A00);
            int i3 = this.A00;
            if (i3 >= 1 && i3 <= 6) {
                C110115dX.A0o(A042, this.A0F);
            }
            if (!this.A0R) {
                A042.putExtra("try_again", 1);
            }
            if (this.A00 == 1) {
                A042.putExtra("extra_error_screen_name", "bank_account_not_found");
                A042.putExtra("extra_referral_screen", "device_binding");
            }
            A042.addFlags(335544320);
            A3M(A042);
            A042.putExtra("extra_previous_screen", "nav_select_account");
            A2X(A042, true);
        } else {
            Afg(i2);
        }
        C111345g2.A1z(this.A0M, 3);
    }

    public final void A3W(Integer num) {
        C53842gO r1 = this.A0X;
        C111345g2.A1t(r1, this, "nav_select_account");
        r1.A08 = C13680ns.A0Y();
        r1.A07 = num;
        C111345g2.A1s(r1, this);
    }

    public void ANT(AnonymousClass2HJ r9, ArrayList arrayList) {
        long size;
        C119265wo A042;
        int i2;
        AnonymousClass1Vo r4 = this.A0Y;
        StringBuilder A0r = AnonymousClass000.A0r("onBankAccountsList: ");
        A0r.append(arrayList);
        r4.A06(AnonymousClass000.A0e(r9, " error: ", A0r));
        String A082 = !TextUtils.isEmpty(this.A0C.A08()) ? this.A0C.A08() : this.A0B.A06(this.A0F);
        AnonymousClass61W r1 = this.A0E;
        r1.A08(A082);
        C53842gO A022 = r1.A02(r9, 18);
        A022.A0O = this.A0F.A0C;
        if (arrayList == null) {
            A022.A01 = Boolean.FALSE;
            size = 0;
        } else {
            A022.A01 = Boolean.TRUE;
            size = (long) arrayList.size();
        }
        A022.A0H = Long.valueOf(size);
        C111345g2.A1t(A022, this, "nav_select_account");
        C111345g2.A1s(A022, this);
        r4.A04(AnonymousClass000.A0g("logGetAccounts: ", A022));
        if (arrayList == null || arrayList.isEmpty()) {
            if (arrayList != null) {
                this.A00 = 1;
                AnonymousClass2HJ r42 = new AnonymousClass2HJ(11473);
                i2 = R.string.str09b1;
                if (A3R(this.A0F, r42, getString(R.string.str09b1))) {
                    return;
                }
            } else if (r9 != null && !C1200960h.A02(this, "upi-get-accounts", r9.A00, true)) {
                String A002 = this.A0E.A00(r9.A00);
                if (A002 != null) {
                    A3I();
                    if (!A3R(this.A0F, r9, A002)) {
                        A3V(new C119265wo(r9.A00, A002), true);
                        return;
                    }
                    return;
                }
                int i3 = r9.A00;
                if (i3 == 11473) {
                    A3I();
                    i2 = R.string.str0fed;
                } else if (i3 == 11485) {
                    A3I();
                    this.A00 = 5;
                    i2 = R.string.str0fdc;
                } else if (i3 == 11487) {
                    A3I();
                    this.A00 = 6;
                    i2 = R.string.str0fdb;
                } else if (i3 == 11467 || i3 == 11543) {
                    A3I();
                    this.A0C.A7n(this.A0B.A06(this.A0F), true);
                    this.A00 = 3;
                    A3V(new C119265wo(R.string.str0fef), true);
                    this.A0B.A0A();
                    return;
                } else {
                    A042 = this.A0L.A04(this.A0H, i3);
                    StringBuilder A0r2 = AnonymousClass000.A0r("onBankAccountsList failure. showErrorAndFinish: ");
                    A0r2.append(this.A0H.A00("upi-get-accounts"));
                    C110105dW.A1L(r4, A0r2);
                    int i4 = A042.A00;
                    if (i4 == R.string.str0fef || i4 == R.string.str1031 || i4 == R.string.str0df7) {
                        this.A0R = false;
                        A3V(A042, false);
                        return;
                    }
                    this.A00 = 1;
                    A3V(A042, true);
                    return;
                }
            } else {
                return;
            }
            A042 = new C119265wo(i2);
            A3V(A042, true);
            return;
        }
        getIntent().putParcelableArrayListExtra("extra_accounts_list", arrayList);
        this.A0S = arrayList;
        if (arrayList.size() != 1 || ((C111805hR) arrayList.get(0)).A0H) {
            A3S();
            return;
        }
        this.A0V = true;
        boolean z2 = this.A0R;
        this.A0J.A00((C111805hR) arrayList.get(0), new IDxECallbackShape391S0100000_3_I1(this, 1), z2, z2);
    }

    public void APe(AnonymousClass2HJ r1) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007b, code lost:
        if (X.AnonymousClass000.A1X(((X.C111805hR) r0).A05.A00) == false) goto L_0x007d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AVw(X.C35521m4 r12, X.AnonymousClass2HJ r13) {
        /*
            r11 = this;
            X.1Vo r1 = r11.A0Y
            java.lang.String r0 = "onRegisterVpa registered: "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r12)
            r1.A04(r0)
            X.61W r1 = r11.A0E
            r0 = 5
            X.2gO r2 = r1.A02(r13, r0)
            if (r12 == 0) goto L_0x0043
            X.1tF r1 = r12.A08
            boolean r0 = r1 instanceof X.C111805hR
            if (r0 == 0) goto L_0x0043
            X.5hR r1 = (X.C111805hR) r1
            java.lang.String r0 = r1.A0C
        L_0x001e:
            r2.A0O = r0
            java.lang.String r0 = "nav_select_account"
            X.C111345g2.A1t(r2, r11, r0)
            X.C111345g2.A1s(r2, r11)
            X.5ln r1 = r11.A0M
            r0 = 3
            if (r13 != 0) goto L_0x002e
            r0 = 2
        L_0x002e:
            X.C111345g2.A1z(r1, r0)
            boolean r0 = r11.A0V
            r3 = 0
            if (r0 == 0) goto L_0x0046
            if (r12 != 0) goto L_0x0046
            r11.A0V = r3
            r11.A3S()
            java.lang.String r0 = "Auto Add single account failed, falling back to default"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0043:
            java.lang.String r0 = ""
            goto L_0x001e
        L_0x0046:
            X.0wT r0 = r11.A0D
            android.content.SharedPreferences r0 = r0.A01()
            java.lang.String r4 = "payment_usync_triggered"
            boolean r0 = r0.getBoolean(r4, r3)
            if (r0 != 0) goto L_0x006a
            X.0sq r2 = r11.A05
            X.0xz r1 = r11.A06
            X.63v r0 = new X.63v
            r0.<init>(r1)
            r2.Acl(r0)
            X.0wT r0 = r11.A0D
            android.content.SharedPreferences$Editor r1 = X.C110105dW.A06(r0)
            r0 = 1
            X.C13680ns.A0z(r1, r4, r0)
        L_0x006a:
            if (r12 == 0) goto L_0x00e4
            X.1tF r0 = r12.A08
            if (r0 == 0) goto L_0x007d
            X.5hR r0 = (X.C111805hR) r0
            X.1lh r0 = r0.A05
            java.lang.Object r0 = r0.A00
            boolean r0 = X.AnonymousClass000.A1X(r0)
            r10 = 1
            if (r0 != 0) goto L_0x007e
        L_0x007d:
            r10 = 0
        L_0x007e:
            X.1HS r8 = r11.A0G
            com.whatsapp.jid.UserJid r7 = r11.A0F
            r6 = 3
            X.0wT r3 = r8.A03
            android.content.SharedPreferences r2 = r3.A01()
            java.lang.String r1 = "payments_inviter_jids_with_expiry"
            java.lang.String r0 = ""
            java.lang.String r0 = r2.getString(r1, r0)
            java.util.Map r0 = r3.A07(r0)
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r9 = r0.iterator()
        L_0x009d:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00e0
            java.lang.Object r2 = r9.next()
            com.whatsapp.jid.UserJid r2 = (com.whatsapp.jid.UserJid) r2
            boolean r0 = r2.equals(r7)
            r8.A00(r2, r6, r0)
            X.122 r1 = r8.A07
            X.0t3 r0 = r8.A01
            long r3 = r0.A00()
            boolean r5 = r2.equals(r7)
            X.18b r1 = r1.A03
            r0 = 1
            X.1Vw r0 = r1.A02(r2, r0)
            if (r10 == 0) goto L_0x00d6
            X.1tf r2 = new X.1tf
            r2.<init>(r0, r3)
            r2.A00 = r6
            r2.A01 = r5
        L_0x00ce:
            X.0t6 r1 = r8.A02
            r0 = 16
            r1.A0d(r2, r0)
            goto L_0x009d
        L_0x00d6:
            X.1uA r2 = new X.1uA
            r2.<init>(r0, r3)
            r2.A00 = r6
            r2.A01 = r5
            goto L_0x00ce
        L_0x00e0:
            r11.A3U(r12)
            return
        L_0x00e4:
            if (r13 == 0) goto L_0x00f2
            int r1 = r13.A00
            r0 = 11472(0x2cd0, float:1.6076E-41)
            if (r1 != r0) goto L_0x00f2
            X.0wU r0 = r11.A0M
            r0.A08(r11)
            return
        L_0x00f2:
            X.60h r1 = r11.A0L
            X.4XO r0 = r11.A0H
            X.5wo r0 = r1.A04(r0, r3)
            r11.A3V(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.payments.ui.IndiaUpiBankAccountPickerActivity.AVw(X.1m4, X.2HJ):void");
    }

    public void AWC(AnonymousClass2HJ r4) {
        this.A0Y.A06(AnonymousClass000.A0g("getPaymentMethods. paymentNetworkError: ", r4));
        A3V(this.A0L.A04(this.A0H, r4.A00), false);
    }

    public void AWI(AnonymousClass2HJ r4) {
        this.A0Y.A06(AnonymousClass000.A0g("getPaymentMethods. paymentNetworkError: ", r4));
        if (!C1200960h.A02(this, "upi-register-vpa", r4.A00, true)) {
            A3V(this.A0L.A04(this.A0H, r4.A00), false);
        }
    }

    public void AWJ(AnonymousClass2HK r4) {
        AnonymousClass1Vo r2 = this.A0Y;
        StringBuilder A0r = AnonymousClass000.A0r("getPaymentMethods. onResponseSuccess: ");
        A0r.append(r4.A02);
        C110105dW.A1L(r2, A0r);
        List list = ((AnonymousClass3w0) r4).A00;
        if (list == null || list.isEmpty()) {
            A3V(this.A0L.A04(this.A0H, 0), false);
            return;
        }
        this.A0I.A08(this.A0I.A01("add_bank"));
        A3U((C35521m4) null);
    }

    public void onBackPressed() {
        this.A0Y.A06("onBackPressed");
        A3W(C13680ns.A0Y());
        A3J();
    }

    public void onCreate(Bundle bundle) {
        C110105dW.A0l(this);
        super.onCreate(bundle);
        C110105dW.A0m(this);
        this.A0N = new C117995tt(this.A0I);
        AnonymousClass00B.A06(C13690nt.A0E(this));
        this.A0S = C13690nt.A0E(this).getParcelableArrayList("extra_accounts_list");
        this.A0R = C13690nt.A0E(this).getString("extra_selected_account_bank_logo");
        this.A0F = (C111805hR) getIntent().getParcelableExtra("extra_selected_bank");
        AnonymousClass4XO r2 = this.A0B.A04;
        this.A0H = r2;
        r2.A02("upi-bank-account-picker");
        C14710pd r32 = this.A0C;
        C14870pt r15 = this.A05;
        C17190ug r14 = this.A0H;
        C18280wR r13 = this.A0P;
        C18290wS r12 = this.A0P;
        AnonymousClass175 r3 = this.A0I;
        AnonymousClass173 r11 = this.A0D;
        C119365wy r10 = this.A0B;
        C18310wU r22 = this.A0M;
        C18340wX r9 = this.A0K;
        AnonymousClass60V r8 = this.A0C;
        AnonymousClass61W r7 = this.A0E;
        C112715ix r6 = this.A0F;
        this.A0J = new C112275iE(this, r15, r11, r32, r14, r10, r8, r3, r9, r22, r12, this, r7, r6, r13);
        C16980tz r5 = this.A07;
        C16320sq r4 = this.A05;
        C112715ix r27 = r6;
        AnonymousClass61W r26 = r7;
        C18290wS r24 = r12;
        C18340wX r23 = r9;
        AnonymousClass60V r222 = r8;
        C119365wy r21 = r10;
        C111805hR r20 = this.A0F;
        C17190ug r19 = r14;
        C14710pd r18 = r32;
        AnonymousClass173 r17 = r11;
        C16980tz r16 = r5;
        this.A0I = new C119175wf(r15, r16, r17, r18, r19, r20, r21, r222, r23, r24, this, r26, r27, this.A0O, r13, r4);
        File file = new File(getCacheDir(), "BankLogos");
        if (!file.mkdirs() && !file.isDirectory()) {
            this.A0Y.A06("BankAccountPickerUI/create unable to create bank logos cache directory");
        }
        C38461qp r33 = new C38461qp(this.A05, this.A0C, this.A0D, file, "india-upi-bank-account-picker");
        r33.A00 = getResources().getDimensionPixelSize(R.dimen.dimen0452);
        this.A0Q = r33.A00();
        setContentView((int) R.layout.layout030a);
        this.A02 = findViewById(R.id.add_button);
        this.A03 = findViewById(R.id.progress);
        this.A07 = findViewById(R.id.upi_logo);
        this.A06 = findViewById(R.id.shimmer_layout);
        this.A0B = (RecyclerView) findViewById(R.id.recycler_view);
        this.A04 = findViewById(R.id.header_divider);
        this.A0A = C13680ns.A0N(this, R.id.bank_account_picker_title);
        this.A09 = C13680ns.A0N(this, R.id.bank_account_picker_description);
        this.A08 = C110115dX.A04(this, R.id.hero_img);
        this.A05 = findViewById(R.id.note_layout);
        C005402i A0r = C111345g2.A0r(this);
        if (A0r != null) {
            A0r.A0N(true);
            A0r.A0B(R.string.str0fec);
        }
        C14870pt r72 = this.A05;
        C19980zJ r62 = this.A00;
        AnonymousClass01V r52 = this.A08;
        C14870pt r102 = r72;
        C19980zJ r92 = r62;
        C45922Bq.A08(this, Uri.parse("https://faq.whatsapp.com/general/payments/learn-more-about-sharing-the-legal-name-on-your-bank-account"), r92, r102, C13680ns.A0Q(this.A05, R.id.note_name_visible_to_others), r52, C13680ns.A0d(this, "learn-more", new Object[1], 0, R.string.str106d));
        A3S();
        this.A0E.A07((AnonymousClass2St) null, 0, (Integer) null, this.A0L, "nav_select_account", this.A0O);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        A3N(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        this.A0J.A01 = null;
        this.A0P.A07(this);
        this.A0Q.A02.A02(false);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_help && !this.A0W && this.A06.getVisibility() != 0) {
            C32241fu A002 = C32241fu.A00(this);
            A002.A01(R.string.str05ab);
            A3O(A002, "nav_select_account");
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            this.A0Y.A06("action bar home");
            A3W(1);
            A3J();
            return true;
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        if (menu.findItem(R.id.menuitem_help) != null) {
            menu.findItem(R.id.menuitem_help).setVisible(AnonymousClass000.A1O(this.A06.getVisibility()));
        }
        return super.onPrepareOptionsMenu(menu);
    }
}
