package com.obwhatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass1MB;
import X.AnonymousClass1TV;
import X.AnonymousClass22U;
import X.AnonymousClass29T;
import X.AnonymousClass2KI;
import X.AnonymousClass3K3;
import X.AnonymousClass5Q6;
import X.AnonymousClass5vR;
import X.AnonymousClass5xE;
import X.AnonymousClass60G;
import X.AnonymousClass60V;
import X.AnonymousClass61W;
import X.AnonymousClass64J;
import X.AnonymousClass64K;
import X.AnonymousClass650;
import X.AnonymousClass66T;
import X.AnonymousClass69C;
import X.C003101j;
import X.C110105dW;
import X.C110115dX;
import X.C110435e7;
import X.C110475eC;
import X.C110695eg;
import X.C111805hR;
import X.C114105n8;
import X.C115275pU;
import X.C117765tW;
import X.C117995tt;
import X.C118455ui;
import X.C119345ww;
import X.C1211764m;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14600pS;
import X.C14870pt;
import X.C15860rz;
import X.C15910s6;
import X.C16040sK;
import X.C16290sm;
import X.C18310wU;
import X.C19980zJ;
import X.C221116r;
import X.C227819g;
import X.C227919h;
import X.C228919r;
import X.C28881Zb;
import X.C30671cl;
import X.C39901tF;
import X.C45922Bq;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.redex.IDxCListenerShape5S1100000_3_I1;
import com.facebook.redex.IDxCListenerShape9S1100000_3_I1;
import com.facebook.redex.IDxNObserverShape453S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.widget.TransactionsExpandableView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

public class IndiaUpiPaymentSettingsFragment extends Hilt_IndiaUpiPaymentSettingsFragment implements AnonymousClass69C, AnonymousClass5Q6 {
    public View A00 = null;
    public C19980zJ A01;
    public C15860rz A02;
    public C16290sm A03;
    public C221116r A04;
    public AnonymousClass60V A05;
    public C227919h A06;
    public C227819g A07;
    public AnonymousClass5xE A08;
    public AnonymousClass61W A09;
    public AnonymousClass1MB A0A;
    public C114105n8 A0B;
    public C117765tW A0C;

    public static String A01(List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C30671cl A0F = C110115dX.A0F(it);
            if (A0F.A01 == 2) {
                C39901tF r0 = A0F.A08;
                if (r0 != null) {
                    return (String) C110105dW.A0d(r0.A06());
                }
                C110105dW.A1O("PaymentMethodUtils", "getDefaultAccountHolderName/null country data");
            }
        }
        return null;
    }

    public void A0q() {
        super.A0q();
        AnonymousClass1MB r1 = this.A0A;
        r1.A00.clear();
        r1.A02.add(new WeakReference(this));
    }

    public void A0w() {
        super.A0w();
        this.A0c.A0N(false);
        this.A12.Acl(new AnonymousClass64J(this));
    }

    public void A0x(int i2, int i3, Intent intent) {
        super.A0x(i2, i3, intent);
        if (i2 != 1008) {
            if (i2 != 1009) {
                return;
            }
            if (i3 == -1 && intent != null && intent.getIntExtra("extra_remove_payment_account", 0) >= 1) {
                if (intent.getIntExtra("extra_remove_payment_account", 0) == 2) {
                    Intent A042 = C110105dW.A04(A0u(), IndiaUpiPaymentsAccountSetupActivity.class);
                    A042.putExtra("extra_setup_mode", 2);
                    A0r(A042);
                    return;
                }
                C110115dX.A0v(this);
                return;
            }
        }
        this.A0r.A00(false);
    }

    public boolean A10(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_scan_qr) {
            return super.A10(menuItem);
        }
        A0r(C110105dW.A04(A0u(), IndiaUpiQrCodeScanActivity.class));
        return true;
    }

    public void A14() {
        super.A14();
        this.A0c.A0N(false);
        this.A12.Acl(new AnonymousClass64K(this));
        this.A0s.A03();
        C114105n8 r3 = this.A0B;
        if (r3 != null) {
            boolean A0I = r3.A0I();
            r3.A01.A09(Boolean.valueOf(A0I));
            if (A0I) {
                r3.A0C.Acl(new C1211764m(r3));
            }
        }
    }

    public void A15() {
        super.A15();
        this.A0A.A01(this);
    }

    public void A18(Bundle bundle, View view) {
        String str;
        C114105n8 r6;
        super.A18(bundle, view);
        new C117995tt(this.A0V).A00(A0D());
        Bundle bundle2 = this.A05;
        String str2 = null;
        if (bundle2 != null && bundle2.getBoolean("extra_send_to_upi_id", false)) {
            new C118455ui(A0D(), (C14600pS) A0D(), this.A06, this.A07, (String) null).A00((PaymentBottomSheet) null);
        }
        C114105n8 r3 = this.A0B;
        if (!(r3 == null || this.A09 == null)) {
            C110105dW.A0x(this, r3.A01, 30);
            C110105dW.A0x(this, this.A0B.A00, 31);
        }
        if (this.A0I.A05(C15910s6.A0o)) {
            C110105dW.A0q(view, R.id.privacy_banner_avatar, AnonymousClass00T.A00(A02(), R.color.color05ee));
            Context A022 = A02();
            C14870pt r8 = this.A0F;
            C45922Bq.A08(A022, Uri.parse("https://faq.whatsapp.com/general/payments/about-payments-data"), this.A01, r8, C13680ns.A0Q(view, R.id.payment_privacy_banner_text), this.A0O, C13690nt.A0c(this, "learn-more", C13680ns.A1b(), 0, R.string.str194c));
            C13690nt.A13(view, R.id.payment_privacy_banner, 0);
        }
        C119345ww r4 = this.A0s;
        if (bundle2 != null) {
            str = bundle2.getString("notification-type");
            str2 = bundle2.getString("step-up-id");
        } else {
            str = null;
        }
        r4.A07(str, str2);
        this.A0X = new IDxNObserverShape453S0100000_3_I1(this, 1);
        View inflate = A05().inflate(R.layout.layout04aa, this.A0A, false);
        if (this.A0A.getChildCount() > 0) {
            this.A0A.removeAllViews();
        }
        this.A0A.addView(inflate);
        this.A0A.setVisibility(0);
        if (bundle2 != null && bundle2.getBoolean("extra_is_invalid_deep_link_url", false)) {
            AnonymousClass29T.A01(A0D(), 101);
        }
        if (this.A05.A0Q() && this.A0c.A01().getInt("payments_upi_transactions_sync_status", 0) == 0 && (r6 = this.A0B) != null) {
            long j2 = r6.A09.A01().getLong("payments_upi_last_transactions_sync_time", 0);
            if (j2 == 0 || r6.A05.A00() - j2 > C114105n8.A0D) {
                C114105n8 r42 = this.A0B;
                r42.A0C.Acl(new AnonymousClass66T(r42, 1, Integer.valueOf(r42.A04.A02(1782))));
            }
        }
    }

    public final void A1d() {
        Intent A042 = C110105dW.A04(A0D(), IndiaUpiQrTabActivity.class);
        if (this.A0V.A0C()) {
            A042.putExtra("extra_account_holder_name", A01(this.A14));
        }
        A0r(A042);
    }

    public String ADf(C30671cl r2) {
        return null;
    }

    public String ADh(C30671cl r2) {
        C111805hR r0 = (C111805hR) r2.A08;
        return (r0 == null || AnonymousClass000.A1X(r0.A05.A00)) ? super.ADh(r2) : A0J(R.string.str15e8);
    }

    public String ADi(C30671cl r2) {
        return null;
    }

    public void AMA(boolean z2) {
        if (z2 || this.A05.A0R()) {
            Intent A042 = C110105dW.A04(A0u(), IndiaUpiPaymentsAccountSetupActivity.class);
            A042.putExtra("extra_setup_mode", 2);
            A042.putExtra("extra_payments_entry_type", 5);
            A042.putExtra("extra_is_first_payment_method", z2);
            A042.putExtra("extra_skip_value_props_display", false);
            AnonymousClass22U.A00(A042, "settingsAddPayment");
            A0r(A042);
            return;
        }
        Intent A043 = C110105dW.A04(A0u(), IndiaUpiBankPickerActivity.class);
        A043.putExtra("extra_payments_entry_type", 5);
        A043.putExtra("extra_skip_value_props_display", true);
        A043.putExtra("extra_is_first_payment_method", false);
        startActivityForResult(A043, 1008);
    }

    public void APN(String str) {
        TransactionsExpandableView transactionsExpandableView = this.A0z;
        transactionsExpandableView.post(new AnonymousClass650(transactionsExpandableView));
        TransactionsExpandableView transactionsExpandableView2 = this.A0y;
        transactionsExpandableView2.post(new AnonymousClass650(transactionsExpandableView2));
    }

    public void AUY(C30671cl r3) {
        Intent A042 = C110105dW.A04(A0u(), IndiaUpiBankAccountDetailsActivity.class);
        C110115dX.A0o(A042, r3);
        startActivityForResult(A042, 1009);
    }

    public void AZz() {
    }

    public void AdV(boolean z2) {
        C119345ww r0;
        View view = this.A0A;
        if (view != null) {
            ViewGroup A072 = C13700nu.A07(view, R.id.action_required_container);
            int i2 = 0;
            if (this.A00 == null && (r0 = this.A0s) != null) {
                if (r0.A0D.A02() != null) {
                    this.A0S.A04(C115275pU.A00(this.A0Q, this.A0s.A0D.A02()));
                }
                if (!this.A0S.A02().isEmpty()) {
                    A072.removeAllViews();
                    C110475eC r4 = new C110475eC(A02());
                    List A022 = this.A0S.A02();
                    r4.A00(new AnonymousClass5vR(new AnonymousClass60G(this), (AnonymousClass2KI) C003101j.A09(A022).get(0), A022.size()));
                    A072.addView(r4);
                    this.A00 = A072;
                }
            }
            if (!z2) {
                i2 = 8;
            }
            A072.setVisibility(i2);
        }
    }

    public boolean AfI() {
        return true;
    }

    public void AhT(List list) {
        super.AhT(list);
        if (A0c() && A0C() != null) {
            C110435e7 r3 = new C110435e7(A02());
            r3.setBackgroundColor(A03().getColor(R.color.color065f));
            AnonymousClass3K3.A14(r3);
            C110105dW.A0r(r3.A05, this, 57);
            C110105dW.A0r(r3.A04, this, 55);
            this.A0B.removeAllViews();
            if (this.A0V.A0C() || this.A05.A0Q()) {
                List list2 = this.A0q.A02;
                String A012 = (list2 == null || list2.isEmpty()) ? null : A01(list2);
                String A002 = AnonymousClass60V.A00(this.A05);
                if (TextUtils.isEmpty(A012)) {
                    A012 = this.A03.A00.getString("push_name", "");
                    C18310wU r7 = this.A0e;
                    C228919r A042 = this.A0h.A04("UPI");
                    AnonymousClass00B.A06(A042);
                    r7.A09((AnonymousClass1TV) null, A042, 1);
                }
                boolean z2 = false;
                if (this.A04.A0C(1458)) {
                    String A052 = this.A04.A05(1459);
                    String A082 = this.A05.A08();
                    if (!TextUtils.isEmpty(A052) && !TextUtils.isEmpty(A082) && A052.contains(this.A05.A08())) {
                        z2 = true;
                    }
                }
                C16040sK r0 = this.A0G;
                r0.A0B();
                C28881Zb r02 = r0.A01;
                if (z2) {
                    r3.A00(r02, A012, A002);
                    ImageView imageView = r3.A01;
                    imageView.setVisibility(0);
                    imageView.setColorFilter(r3.getResources().getColor(R.color.color05e5));
                    TypedValue typedValue = new TypedValue();
                    r3.getContext().getTheme().resolveAttribute(16843534, typedValue, true);
                    LinearLayout linearLayout = r3.A03;
                    linearLayout.setBackgroundResource(typedValue.resourceId);
                    linearLayout.setOnClickListener(new IDxCListenerShape9S1100000_3_I1(2, A012, this));
                } else {
                    r3.A00(r02, A012, A002);
                    r3.A03.setOnLongClickListener(new IDxCListenerShape5S1100000_3_I1(0, A002, this));
                }
            }
            this.A0B.addView(r3);
            this.A0B.setVisibility(0);
            this.A06.setVisibility(0);
        }
    }

    public void AhZ(List list) {
        this.A0A.A04(list);
        super.AhZ(list);
        C110695eg r0 = this.A0u;
        if (r0 != null) {
            r0.A03 = list;
        }
        A1S();
    }

    public void Ahd(List list) {
        this.A0s.A03();
        this.A0A.A04(list);
        super.Ahd(list);
        C110695eg r0 = this.A0u;
        if (r0 != null) {
            r0.A04 = list;
        }
        A1S();
    }
}
