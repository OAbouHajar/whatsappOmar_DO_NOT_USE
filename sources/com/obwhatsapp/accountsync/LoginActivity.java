package com.obwhatsapp.accountsync;

import X.AnonymousClass2Rf;
import X.C13680ns;
import X.C14870pt;
import X.C16040sK;
import X.C16150sX;
import X.C49132Rg;
import X.C70663hV;
import X.C78723ya;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.os.Bundle;
import com.obwhatsapp.Main;
import com.obwhatsapp.R;

public class LoginActivity extends C70663hV {
    public C14870pt A00;
    public C16040sK A01;
    public boolean A02;

    public LoginActivity() {
        this(0);
    }

    public LoginActivity(int i2) {
        this.A02 = false;
        C13680ns.A1G(this, 10);
    }

    public void A1q() {
        if (!this.A02) {
            this.A02 = true;
            C16150sX r1 = ((C49132Rg) ((AnonymousClass2Rf) generatedComponent())).A1s;
            this.A05 = C16150sX.A1B(r1);
            this.A00 = C16150sX.A02(r1);
            this.A01 = C16150sX.A04(r1);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.str1bd4);
        setContentView((int) R.layout.layout03bc);
        boolean z2 = false;
        for (Account account : AccountManager.get(this).getAccounts()) {
            if ("com.obwhatsapp".contains(account.type)) {
                z2 = true;
            }
        }
        if (z2) {
            this.A00.A09(R.string.str0087, 1);
        } else {
            C16040sK r0 = this.A01;
            r0.A0B();
            if (r0.A05 == null) {
                Intent intent = new Intent(this, Main.class);
                intent.putExtra("show_registration_first_dlg", true);
                startActivity(intent);
            } else {
                this.A05.Ack(new C78723ya(this, this), new Void[0]);
                return;
            }
        }
        finish();
    }
}
