package com.obwhatsapp.status.audienceselector;

import X.AnonymousClass000;
import X.AnonymousClass01D;
import X.AnonymousClass11G;
import X.AnonymousClass1L1;
import X.C005402i;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C16620tM;
import X.C17270uo;
import X.C19000xb;
import X.C34331k5;
import X.C49132Rg;
import X.C49352Sp;
import X.C807545j;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.RadioButton;
import com.facebook.redex.RunnableRunnableShape20S0100000_I1_3;
import com.obwhatsapp.R;
import java.util.Collection;

public class StatusPrivacyActivity extends C14530pL {
    public RadioButton A00;
    public RadioButton A01;
    public RadioButton A02;
    public C49352Sp A03;
    public C19000xb A04;
    public AnonymousClass11G A05;
    public AnonymousClass1L1 A06;
    public AnonymousClass01D A07;
    public boolean A08;

    public StatusPrivacyActivity() {
        this(0);
    }

    public StatusPrivacyActivity(int i2) {
        this.A08 = false;
        C13680ns.A1G(this, 131);
    }

    public void A1q() {
        if (!this.A08) {
            this.A08 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A05 = (AnonymousClass11G) r1.ANN.get();
            this.A04 = (C19000xb) r1.AQX.get();
            this.A06 = (AnonymousClass1L1) r1.ANR.get();
            this.A03 = (C49352Sp) A1T.A1G.get();
            this.A07 = C17270uo.A00(r1.A5z);
        }
    }

    public final void A35() {
        if (this.A01.isChecked()) {
            Afr(R.string.str130a, R.string.str13db);
            int i2 = -1;
            if (this.A0C.A0E(C16620tM.A01, 2531)) {
                i2 = 1;
            }
            C13700nu.A0W(this.A03.A00(this, (Collection) null, 0, i2, 300, true, true, false, true), this.A05);
            return;
        }
        setResult(-1, C807545j.A00(getIntent()));
        finish();
    }

    public final void A36() {
        RadioButton radioButton;
        int A022 = this.A05.A02();
        if (A022 == 0) {
            radioButton = this.A01;
        } else if (A022 == 1) {
            radioButton = this.A02;
        } else if (A022 == 2) {
            radioButton = this.A00;
        } else {
            throw AnonymousClass000.A0V("unknown status distribution mode");
        }
        radioButton.setChecked(true);
    }

    public void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == 0) {
            A36();
        } else {
            super.onActivityResult(i2, i3, intent);
        }
    }

    public void onBackPressed() {
        A35();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout0578);
        C005402i A0N = C13690nt.A0N(this);
        A0N.A0N(true);
        A0N.A0B(R.string.str1688);
        this.A01 = (RadioButton) findViewById(R.id.my_contacts_button);
        this.A00 = (RadioButton) findViewById(R.id.my_contacts_except_button);
        this.A02 = (RadioButton) findViewById(R.id.only_share_with_button);
        A36();
        this.A01.setText(R.string.str1d88);
        this.A00.setText(R.string.str14d2);
        this.A02.setText(R.string.str14d5);
        C34331k5.A02(this.A01, this, 3);
        C34331k5.A02(this.A00, this, 4);
        C34331k5.A02(this.A02, this, 5);
        if (!this.A05.A0G()) {
            this.A05.Acl(new RunnableRunnableShape20S0100000_I1_3(this, 4));
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        A35();
        return false;
    }
}
