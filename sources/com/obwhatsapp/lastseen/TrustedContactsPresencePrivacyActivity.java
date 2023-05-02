package com.obwhatsapp.lastseen;

import X.AnonymousClass000;
import X.AnonymousClass1ZW;
import X.C005402i;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C49132Rg;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.RadioButton;
import com.obwhatsapp.R;

public class TrustedContactsPresencePrivacyActivity extends C14530pL {
    public int A00;
    public int A01;
    public RadioButton A02;
    public RadioButton A03;
    public RadioButton A04;
    public RadioButton A05;
    public RadioButton A06;
    public RadioButton A07;
    public boolean A08;

    public TrustedContactsPresencePrivacyActivity() {
        this(0);
    }

    public TrustedContactsPresencePrivacyActivity(int i2) {
        this.A08 = false;
        C13680ns.A1G(this, 83);
    }

    public void A1q() {
        if (!this.A08) {
            this.A08 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
        }
    }

    public final void A35() {
        Intent A09 = C13680ns.A09();
        A09.putExtra("last_seen", this.A00);
        A09.putExtra("online", this.A01);
        C13680ns.A0r(this, A09);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 1 && i3 == -1) {
            this.A00 = 3;
            A35();
        }
        super.onActivityResult(i2, i3, intent);
    }

    public void onBackPressed() {
        A35();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout04d2);
        C005402i A0N = C13690nt.A0N(this);
        A0N.A0N(true);
        A0N.A0B(R.string.str15d7);
        this.A03 = (RadioButton) findViewById(R.id.my_contacts_button);
        this.A02 = (RadioButton) findViewById(R.id.everyone_btn);
        this.A04 = (RadioButton) findViewById(R.id.my_contacts_except_button);
        this.A05 = (RadioButton) findViewById(R.id.nobody_btn);
        this.A06 = (RadioButton) findViewById(R.id.child_everyone_button);
        this.A07 = (RadioButton) findViewById(R.id.child_match_parent_button);
        C13680ns.A0N(this, R.id.reciprocity_description).setText(AnonymousClass1ZW.A01(getString(R.string.str15d5), new Object[0]));
        this.A03.setText(R.string.str12f7);
        this.A02.setText(R.string.str12f8);
        this.A04.setText(R.string.str0a2b);
        this.A05.setText(R.string.str12ff);
        this.A06.setText(R.string.str12f8);
        this.A07.setText(R.string.str15d6);
        C13680ns.A16(this.A03, this, 36);
        C13680ns.A16(this.A02, this, 34);
        C13680ns.A16(this.A04, this, 35);
        C13680ns.A16(this.A05, this, 37);
        C13680ns.A16(this.A06, this, 33);
        C13680ns.A16(this.A07, this, 38);
        this.A00 = C13680ns.A0B(this.A09).getInt("privacy_last_seen", 0);
        this.A01 = C13680ns.A0B(this.A09).getInt("privacy_online", 0);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        A35();
        return false;
    }

    public void onResume() {
        super.onResume();
        int i2 = this.A00;
        boolean z2 = false;
        this.A03.setChecked(C13690nt.A1R(i2));
        this.A02.setChecked(AnonymousClass000.A1P(i2));
        this.A05.setChecked(AnonymousClass000.A1R(i2, 2));
        this.A04.setChecked(AnonymousClass000.A1R(i2, 3));
        this.A06.setChecked(AnonymousClass000.A1P(this.A01));
        RadioButton radioButton = this.A07;
        if (this.A01 == 4) {
            z2 = true;
        }
        radioButton.setChecked(z2);
    }
}
