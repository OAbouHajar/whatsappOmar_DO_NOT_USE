package com.obwhatsapp.payments.ui.mapper.register;

import X.AnonymousClass61W;
import X.C111435gB;
import X.C115185pJ;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C18450wi;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiProfileDetailsActivity;

public final class IndiaUpiMapperPendingActivity extends C111435gB {
    public AnonymousClass61W A00;

    public static /* synthetic */ void A02(IndiaUpiMapperPendingActivity indiaUpiMapperPendingActivity) {
        AnonymousClass61W r5 = indiaUpiMapperPendingActivity.A00;
        if (r5 != null) {
            r5.AKS(1, 129, "pending_alias_setup", C14530pL.A0P(indiaUpiMapperPendingActivity));
            Intent intent = new Intent(indiaUpiMapperPendingActivity, IndiaUpiProfileDetailsActivity.class);
            intent.addFlags(67108864);
            indiaUpiMapperPendingActivity.A2X(intent, true);
            return;
        }
        throw C18450wi.A03("indiaUpiFieldStatsLogger");
    }

    public static /* synthetic */ void A03(IndiaUpiMapperPendingActivity indiaUpiMapperPendingActivity) {
        AnonymousClass61W r4 = indiaUpiMapperPendingActivity.A00;
        if (r4 != null) {
            r4.AKS(C13680ns.A0Y(), 121, "pending_alias_setup", C14530pL.A0P(indiaUpiMapperPendingActivity));
            C13690nt.A0q(indiaUpiMapperPendingActivity);
            return;
        }
        throw C18450wi.A03("indiaUpiFieldStatsLogger");
    }

    public void onBackPressed() {
        super.onBackPressed();
        AnonymousClass61W r3 = this.A00;
        if (r3 != null) {
            Integer A0Y = C13680ns.A0Y();
            r3.AKS(A0Y, A0Y, "pending_alias_setup", C14530pL.A0P(this));
            return;
        }
        throw C18450wi.A03("indiaUpiFieldStatsLogger");
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(8192);
        }
        setContentView((int) R.layout.layout031f);
        C115185pJ.A00(this, R.drawable.onboarding_actionbar_home_close);
        View findViewById = findViewById(R.id.mapper_pending_done_button);
        View findViewById2 = findViewById(R.id.mapper_pending_profile_button);
        C13690nt.A19(findViewById, this, 12);
        C13690nt.A19(findViewById2, this, 11);
        AnonymousClass61W r4 = this.A00;
        if (r4 != null) {
            Integer A0X = C13680ns.A0X();
            Intent intent = getIntent();
            r4.AKS(A0X, (Integer) null, "pending_alias_setup", intent == null ? null : intent.getStringExtra("extra_referral_screen"));
            return;
        }
        throw C18450wi.A03("indiaUpiFieldStatsLogger");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C18450wi.A0H(menuItem, 0);
        if (menuItem.getItemId() == 16908332) {
            AnonymousClass61W r4 = this.A00;
            if (r4 != null) {
                r4.AKS(C13680ns.A0Y(), C13680ns.A0a(), "pending_alias_setup", C14530pL.A0P(this));
            } else {
                throw C18450wi.A03("indiaUpiFieldStatsLogger");
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
