package com.obwhatsapp.spamwarning;

import X.AnonymousClass000;
import X.C100024uy;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C14750ph;
import X.C16150sX;
import X.C16600tK;
import X.C17220uj;
import X.C18950xW;
import X.C19980zJ;
import X.C49132Rg;
import X.C63733Lh;
import android.os.Bundle;
import android.widget.TextView;
import com.facebook.redex.ViewOnClickCListenerShape3S1100000_I1;
import com.obwhatsapp.CircularProgressBar;
import com.obwhatsapp.R;

public class SpamWarningActivity extends C14530pL {
    public int A00;
    public C18950xW A01;
    public C16600tK A02;
    public C17220uj A03;
    public boolean A04;

    public SpamWarningActivity() {
        this(0);
    }

    public SpamWarningActivity(int i2) {
        this.A04 = false;
        C13680ns.A1G(this, 130);
    }

    public void A1q() {
        if (!this.A04) {
            this.A04 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A03 = C16150sX.A18(r1);
            this.A02 = (C16600tK) r1.ARd.get();
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        C19980zJ.A03(this);
    }

    public void onCreate(Bundle bundle) {
        int i2;
        super.onCreate(bundle);
        setContentView((int) R.layout.layout0056);
        setTitle(R.string.str166f);
        int intExtra = getIntent().getIntExtra("spam_warning_reason_key", 100);
        this.A00 = getIntent().getIntExtra("expiry_in_seconds", -1);
        String stringExtra = getIntent().getStringExtra("spam_warning_message_key");
        String stringExtra2 = getIntent().getStringExtra("faq_url_key");
        StringBuilder A0r = AnonymousClass000.A0r("SpamWarningActivity started with code ");
        A0r.append(intExtra);
        A0r.append(" and expiry (in seconds) ");
        A0r.append(this.A00);
        C13680ns.A1V(A0r);
        switch (intExtra) {
            case 101:
                i2 = R.string.str1672;
                break;
            case 102:
                i2 = R.string.str1670;
                break;
            case 103:
                i2 = R.string.str1671;
                break;
            case 104:
                i2 = R.string.str1674;
                break;
            case 106:
                i2 = R.string.str1673;
                break;
            default:
                int i3 = this.A00;
                i2 = R.string.str166c;
                if (i3 == -1) {
                    i2 = R.string.str166e;
                    break;
                }
                break;
        }
        findViewById(R.id.btn_spam_warning_learn_more).setOnClickListener(new ViewOnClickCListenerShape3S1100000_I1(4, stringExtra2, this));
        TextView A0N = C13680ns.A0N(this, R.id.spam_warning_info_textview);
        if (stringExtra == null || stringExtra.isEmpty()) {
            A0N.setText(i2);
        } else {
            A0N.setText(stringExtra);
        }
        if (this.A00 == -1) {
            C13680ns.A1I(this, R.id.progress_bar, 8);
            if (this.A02.A08() || this.A02.A03 == 1) {
                startActivity(C14750ph.A02(this));
                finish();
                return;
            }
            C100024uy r1 = new C100024uy(this);
            this.A01 = r1;
            this.A02.A04(r1);
            return;
        }
        C13680ns.A1I(this, R.id.spam_warning_generic_data_connection_missing_textview, 8);
        CircularProgressBar circularProgressBar = (CircularProgressBar) findViewById(R.id.progress_bar);
        circularProgressBar.setVisibility(0);
        circularProgressBar.A0I = true;
        circularProgressBar.setMax(this.A00 * 1000);
        new C63733Lh(circularProgressBar, this, (long) (this.A00 * 1000)).start();
    }

    public void onDestroy() {
        C18950xW r1 = this.A01;
        if (r1 != null) {
            this.A02.A03(r1);
            this.A01 = null;
        }
        super.onDestroy();
    }
}
