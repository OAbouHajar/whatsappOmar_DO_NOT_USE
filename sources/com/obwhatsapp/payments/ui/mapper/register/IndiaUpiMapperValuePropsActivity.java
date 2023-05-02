package com.obwhatsapp.payments.ui.mapper.register;

import X.AnonymousClass55N;
import X.AnonymousClass61W;
import X.C111475gF;
import X.C115185pJ;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14530pL;
import X.C16040sK;
import X.C17110uY;
import X.C18450wi;
import X.C30531cW;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import com.facebook.redex.IDxCListenerShape32S0200000_2_I1;
import com.obwhatsapp.Me;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.components.Button;

public final class IndiaUpiMapperValuePropsActivity extends C111475gF {
    public Button A00;
    public AnonymousClass61W A01;
    public C17110uY A02;

    public static /* synthetic */ void A02(Intent intent, IndiaUpiMapperValuePropsActivity indiaUpiMapperValuePropsActivity) {
        AnonymousClass61W r4 = indiaUpiMapperValuePropsActivity.A01;
        if (r4 != null) {
            r4.AKS(1, C13690nt.A0U(), "alias_intro", C14530pL.A0P(indiaUpiMapperValuePropsActivity));
            indiaUpiMapperValuePropsActivity.A2X(intent, true);
            return;
        }
        throw C18450wi.A03("fieldStatsLogger");
    }

    public static /* synthetic */ void A03(IndiaUpiMapperValuePropsActivity indiaUpiMapperValuePropsActivity) {
        AnonymousClass61W r4 = indiaUpiMapperValuePropsActivity.A01;
        if (r4 != null) {
            r4.AKS(C13680ns.A0Y(), 9, "alias_intro", C14530pL.A0P(indiaUpiMapperValuePropsActivity));
            return;
        }
        throw C18450wi.A03("fieldStatsLogger");
    }

    public void onBackPressed() {
        super.onBackPressed();
        AnonymousClass61W r3 = this.A01;
        if (r3 != null) {
            Integer A0Y = C13680ns.A0Y();
            r3.AKS(A0Y, A0Y, "alias_intro", C14530pL.A0P(this));
            return;
        }
        throw C18450wi.A03("fieldStatsLogger");
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(8192);
        }
        setContentView((int) R.layout.layout0321);
        C17110uY r8 = this.A02;
        if (r8 != null) {
            Object[] objArr = new Object[1];
            C16040sK r0 = this.A01;
            r0.A0B();
            Me me = r0.A00;
            if (me == null || (str2 = me.number) == null) {
                str2 = "";
            }
            C30531cW.A04((TextEmojiLabel) findViewById(R.id.mapper_value_props_sub_title), this.A08, r8.A05(C13680ns.A0d(this, str2, objArr, 0, R.string.str0cbd), new Runnable[]{new AnonymousClass55N(this)}, new String[]{"learn-more"}, new String[]{"https://faq.whatsapp.com/general/payments/about-using-your-mobile-number-as-your-UPI-number"}));
            C115185pJ.A00(this, R.drawable.onboarding_actionbar_home_close);
            Button button = (Button) C18450wi.A01(this, R.id.mapper_value_props_continue);
            C18450wi.A0H(button, 0);
            this.A00 = button;
            Intent intent = new Intent(this, IndiaUpiMapperLinkActivity.class);
            intent.putExtra("extra_payment_name", getIntent().getParcelableExtra("extra_payment_name"));
            intent.addFlags(33554432);
            Button button2 = this.A00;
            if (button2 != null) {
                button2.setOnClickListener(new IDxCListenerShape32S0200000_2_I1(intent, 4, this));
                onConfigurationChanged(C13700nu.A03(this));
                AnonymousClass61W r3 = this.A01;
                if (r3 != null) {
                    Intent intent2 = getIntent();
                    r3.AKS(0, (Integer) null, "alias_intro", intent2 == null ? null : intent2.getStringExtra("extra_referral_screen"));
                    return;
                }
                str = "fieldStatsLogger";
            } else {
                str = "continueButton";
            }
        } else {
            str = "linkifier";
        }
        throw C18450wi.A03(str);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C18450wi.A0H(menuItem, 0);
        if (menuItem.getItemId() == 16908332) {
            AnonymousClass61W r4 = this.A01;
            if (r4 != null) {
                r4.AKS(C13680ns.A0Y(), C13680ns.A0a(), "alias_intro", C14530pL.A0P(this));
            } else {
                throw C18450wi.A03("fieldStatsLogger");
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
