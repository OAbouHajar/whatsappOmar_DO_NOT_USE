package com.obwhatsapp.blockbusiness;

import X.AnonymousClass000;
import X.AnonymousClass050;
import X.C005402i;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C18450wi;
import X.C20260zl;
import X.C34811ku;
import X.C40561uK;
import X.C49132Rg;
import android.content.Intent;
import android.os.Bundle;
import com.obwhatsapp.R;
import com.obwhatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment;
import com.whatsapp.jid.UserJid;

public final class BlockBusinessActivity extends C14530pL {
    public C20260zl A00;
    public boolean A01;

    public BlockBusinessActivity() {
        this(0);
    }

    public BlockBusinessActivity(int i2) {
        this.A01 = false;
        C13680ns.A1G(this, 21);
    }

    public void A1q() {
        if (!this.A01) {
            this.A01 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A00 = A1T.A0I();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.layout0097);
        String stringExtra = getIntent().getStringExtra("jid_extra");
        if (stringExtra != null) {
            C20260zl r1 = this.A00;
            if (r1 != null) {
                String A05 = C40561uK.A01(r1, UserJid.get(stringExtra)) ? C34811ku.A05(getApplicationContext(), R.string.str1b2b) : getString(R.string.str0229);
                C005402i x2 = x();
                if (x2 != null) {
                    x2.A0N(true);
                    x2.A0J(A05);
                }
                if (bundle == null) {
                    Intent intent = getIntent();
                    AnonymousClass050 A0O = C13680ns.A0O(this);
                    String stringExtra2 = intent.getStringExtra("entry_point_extra");
                    if (stringExtra2 != null) {
                        boolean booleanExtra = intent.getBooleanExtra("show_success_toast_extra", false);
                        boolean booleanExtra2 = intent.getBooleanExtra("from_spam_panel_extra", false);
                        boolean booleanExtra3 = intent.getBooleanExtra("show_report_upsell", false);
                        Bundle A0D = C13690nt.A0D();
                        A0D.putString("jid", stringExtra);
                        A0D.putString("entry_point", stringExtra2);
                        A0D.putBoolean("show_success_toast", booleanExtra);
                        A0D.putBoolean("from_spam_panel", booleanExtra2);
                        A0D.putBoolean("show_report_upsell", booleanExtra3);
                        BlockReasonListFragment blockReasonListFragment = new BlockReasonListFragment();
                        blockReasonListFragment.A0T(A0D);
                        A0O.A0A(blockReasonListFragment, R.id.container);
                        A0O.A03();
                        return;
                    }
                } else {
                    return;
                }
            } else {
                throw C18450wi.A03("infraABProps");
            }
        }
        throw AnonymousClass000.A0T("Required value was null.");
    }
}
