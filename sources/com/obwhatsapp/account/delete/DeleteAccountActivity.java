package com.obwhatsapp.account.delete;

import X.AnonymousClass00B;
import X.AnonymousClass01A;
import X.C005402i;
import X.C108135Mu;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C17110uY;
import X.C18090w8;
import X.C19670yo;
import X.C34331k5;
import X.C434920f;
import X.C447725m;
import X.C49132Rg;
import android.os.Bundle;
import android.widget.ImageView;
import com.obwhatsapp.R;

public class DeleteAccountActivity extends C14530pL implements C108135Mu {
    public C19670yo A00;
    public C18090w8 A01;
    public C17110uY A02;
    public boolean A03;

    public DeleteAccountActivity() {
        this(0);
    }

    public DeleteAccountActivity(int i2) {
        this.A03 = false;
        C13680ns.A1G(this, 5);
    }

    public void A1q() {
        if (!this.A03) {
            this.A03 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A02 = C16150sX.A1A(r1);
            this.A01 = C16150sX.A10(r1);
            this.A00 = (C19670yo) r1.AB4.get();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout0210);
        setTitle(R.string.str153c);
        C005402i x2 = x();
        if (x2 != null) {
            x2.A0N(true);
        }
        ImageView imageView = (ImageView) findViewById(R.id.change_number_icon);
        C447725m.A01(this, imageView, this.A01, R.drawable.ic_settings_change_number);
        C434920f.A07(this, imageView);
        C13680ns.A0N(this, R.id.delete_account_instructions).setText(R.string.str066f);
        C13680ns.A1A(findViewById(R.id.delete_account_change_number_option), this, 10);
        C14530pL.A0V(this, C13680ns.A0N(this, R.id.delete_whatsapp_account_warning_text), getString(R.string.str0673));
        C14530pL.A0V(this, C13680ns.A0N(this, R.id.delete_message_history_warning_text), getString(R.string.str0674));
        C14530pL.A0V(this, C13680ns.A0N(this, R.id.delete_whatsapp_group_warning_text), getString(R.string.str0675));
        C14530pL.A0V(this, C13680ns.A0N(this, R.id.delete_google_drive_warning_text), getString(R.string.str0676));
        C14530pL.A0V(this, C13680ns.A0N(this, R.id.delete_payments_account_warning_text), getString(R.string.str0677));
        if (!this.A00.A0A() || this.A09.A0M() == null) {
            C13680ns.A1I(this, R.id.delete_google_drive_warning_text, 8);
        }
        if (!this.A01.A09() && !this.A01.A07()) {
            C13680ns.A1I(this, R.id.delete_payments_account_warning_text, 8);
        } else if (this.A01.A07()) {
            C14530pL.A0V(this, C13680ns.A0N(this, R.id.delete_payments_account_warning_text), getString(R.string.str0679));
        }
        AnonymousClass01A A08 = AGM().A08(R.id.delete_account_match_phone_number_fragment);
        AnonymousClass00B.A06(A08);
        C34331k5.A04(findViewById(R.id.delete_account_submit), this, A08, 0);
    }
}
