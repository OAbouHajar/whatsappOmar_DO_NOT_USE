package com.obwhatsapp.payments.ui;

import X.AnonymousClass173;
import X.AnonymousClass4XO;
import X.AnonymousClass5w2;
import X.AnonymousClass60V;
import X.AnonymousClass61W;
import X.C001000l;
import X.C110105dW;
import X.C110115dX;
import X.C112715ix;
import X.C118455ui;
import X.C118805vH;
import X.C1222668x;
import X.C13680ns;
import X.C14550pN;
import X.C14600pS;
import X.C15910s6;
import X.C18300wT;
import X.C18310wU;
import X.C18340wX;
import X.C227819g;
import android.content.Intent;
import android.view.View;
import android.widget.ListView;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

public class IndiaUpiContactPickerFragment extends Hilt_IndiaUpiContactPickerFragment {
    public AnonymousClass173 A00;
    public AnonymousClass60V A01;
    public C18340wX A02;
    public C18300wT A03;
    public C227819g A04;
    public C18310wU A05;
    public C118805vH A06;
    public AnonymousClass61W A07;
    public C112715ix A08;

    public static /* synthetic */ void A05(IndiaUpiContactPickerFragment indiaUpiContactPickerFragment) {
        new C118455ui(indiaUpiContactPickerFragment.A0D(), (C14600pS) indiaUpiContactPickerFragment.A0D(), indiaUpiContactPickerFragment.A02, indiaUpiContactPickerFragment.A04, "payment_contact_picker").A00((PaymentBottomSheet) null);
        indiaUpiContactPickerFragment.A07.AKS(C13680ns.A0Y(), 132, "payment_contact_picker", indiaUpiContactPickerFragment.A1C().getString("referral_screen"));
    }

    public void A1J() {
        boolean A002 = AnonymousClass5w2.A00(this.A1d, this.A01.A08());
        int i2 = R.string.str14f9;
        if (A002) {
            i2 = R.string.str14fa;
        }
        View A1D = A1D(C110115dX.A06(this, 37), R.drawable.ic_send_to_upi, 0, R.drawable.grey_circle_stroke, i2);
        View A1D2 = A1D(C110115dX.A06(this, 38), R.drawable.ic_scan_qr, 0, R.drawable.green_circle, R.string.str0fa6);
        ListView listView = (ListView) this.A0A.findViewById(16908298);
        this.A0G = listView;
        listView.addHeaderView(A1D, (Object) null, true);
        this.A0G.addHeaderView(A1D2, (Object) null, true);
        super.A1J();
    }

    public boolean A1s() {
        return true;
    }

    public void A1y(UserJid userJid) {
        this.A06.A00(A0u(), userJid, (AnonymousClass4XO) null, (C1222668x) null, this.A03.A03());
        C001000l A0C = A0C();
        if (A0C instanceof C14550pN) {
            Intent A042 = C110105dW.A04(A0C, this.A1p.A05("UPI").AFu());
            A042.putExtra("extra_jid", userJid.getRawString());
            A042.putExtra("extra_is_pay_money_only", !this.A1p.A0E.A00.A05(C15910s6.A0m));
            A042.putExtra("referral_screen", "payment_contact_picker");
            super.A1x(A042, userJid);
            ((C14550pN) A0C).A2X(A042, true);
            return;
        }
        Log.e("India Payments' contact picker activity is null");
    }
}
