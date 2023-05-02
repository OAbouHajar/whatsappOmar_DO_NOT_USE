package com.obwhatsapp.payments.ui.mapper.register;

import X.AnonymousClass1DU;
import X.AnonymousClass2EA;
import X.AnonymousClass3K3;
import X.AnonymousClass5EX;
import X.AnonymousClass60V;
import X.AnonymousClass61W;
import X.C111465gE;
import X.C115185pJ;
import X.C13680ns;
import X.C13700nu;
import X.C18450wi;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import com.facebook.redex.IDxObserverShape116S0100000_2_I1;
import com.obwhatsapp.R;

public final class IndiaUpiMapperLinkActivity extends C111465gE {
    public TextView A00;
    public AnonymousClass60V A01;
    public AnonymousClass61W A02;
    public IndiaUpiMapperLinkViewModel A03;
    public boolean A04;
    public final AnonymousClass1DU A05 = new AnonymousClass5EX(this);

    public final AnonymousClass61W A35() {
        AnonymousClass61W r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        throw C18450wi.A03("indiaUpiFieldStatsLogger");
    }

    public void onBackPressed() {
        super.onBackPressed();
        AnonymousClass61W A35 = A35();
        Integer A0Y = C13680ns.A0Y();
        A35.AKS(A0Y, A0Y, this.A04 ? "alias_switch_in_progress" : "alias_in_progress", AnonymousClass3K3.A0k(this));
    }

    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(8192);
        }
        setContentView((int) R.layout.layout031e);
        View findViewById = findViewById(R.id.mapper_link_title);
        C18450wi.A0B(findViewById);
        TextView textView = (TextView) findViewById;
        C18450wi.A0H(textView, 0);
        this.A00 = textView;
        IndiaUpiMapperLinkViewModel indiaUpiMapperLinkViewModel = (IndiaUpiMapperLinkViewModel) this.A05.AIT();
        C18450wi.A0H(indiaUpiMapperLinkViewModel, 0);
        this.A03 = indiaUpiMapperLinkViewModel;
        if (bundle == null) {
            this.A04 = false;
            TextView textView2 = this.A00;
            if (textView2 != null) {
                textView2.setText(getResources().getString(R.string.str0cb2));
                IndiaUpiMapperLinkViewModel indiaUpiMapperLinkViewModel2 = this.A03;
                if (indiaUpiMapperLinkViewModel2 != null) {
                    indiaUpiMapperLinkViewModel2.A05(false);
                }
                str = "indiaUpiMapperLinkViewModel";
                throw C18450wi.A03(str);
            }
            str = "titleTextView";
            throw C18450wi.A03(str);
        }
        C115185pJ.A00(this, R.drawable.onboarding_actionbar_home_close);
        IndiaUpiMapperLinkViewModel indiaUpiMapperLinkViewModel3 = this.A03;
        if (indiaUpiMapperLinkViewModel3 != null) {
            indiaUpiMapperLinkViewModel3.A05.A0A(this, new IDxObserverShape116S0100000_2_I1(this, AnonymousClass2EA.A03));
            onConfigurationChanged(C13700nu.A03(this));
            AnonymousClass61W A35 = A35();
            String str2 = this.A04 ? "alias_switch_in_progress" : "alias_in_progress";
            Intent intent = getIntent();
            A35.AKS(0, (Integer) null, str2, intent == null ? null : intent.getStringExtra("extra_referral_screen"));
            return;
        }
        str = "indiaUpiMapperLinkViewModel";
        throw C18450wi.A03(str);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C18450wi.A0H(menuItem, 0);
        if (menuItem.getItemId() == 16908332) {
            A35().AKS(C13680ns.A0Y(), C13680ns.A0a(), this.A04 ? "alias_switch_in_progress" : "alias_in_progress", AnonymousClass3K3.A0k(this));
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
