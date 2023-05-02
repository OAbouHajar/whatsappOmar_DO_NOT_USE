package com.obwhatsapp.payments.ui.mapper.register;

import X.AnonymousClass60V;
import X.AnonymousClass61W;
import X.C111485gJ;
import X.C115185pJ;
import X.C13680ns;
import X.C13690nt;
import X.C13700nu;
import X.C14530pL;
import X.C16040sK;
import X.C17160ud;
import X.C18450wi;
import X.C35301lh;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.Me;
import com.obwhatsapp.R;

public final class IndiaUpiMapperConfirmationActivity extends C111485gJ {
    public ImageView A00;
    public C17160ud A01;
    public AnonymousClass60V A02;
    public AnonymousClass61W A03;

    public static /* synthetic */ void A02(IndiaUpiMapperConfirmationActivity indiaUpiMapperConfirmationActivity) {
        indiaUpiMapperConfirmationActivity.setResult(-1);
        AnonymousClass61W r4 = indiaUpiMapperConfirmationActivity.A03;
        if (r4 != null) {
            r4.AKS(C13680ns.A0Y(), 85, "alias_complete", C14530pL.A0P(indiaUpiMapperConfirmationActivity));
            indiaUpiMapperConfirmationActivity.finish();
            return;
        }
        throw C18450wi.A03("indiaUpiFieldStatsLogger");
    }

    public void onBackPressed() {
        super.onBackPressed();
        AnonymousClass61W r3 = this.A03;
        if (r3 != null) {
            Integer A0Y = C13680ns.A0Y();
            r3.AKS(A0Y, A0Y, "alias_complete", C14530pL.A0P(this));
            return;
        }
        throw C18450wi.A03("indiaUpiFieldStatsLogger");
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(8192);
        }
        setContentView((int) R.layout.layout031d);
        C115185pJ.A00(this, R.drawable.onboarding_actionbar_home_close);
        TextView A0N = C13680ns.A0N(this, R.id.payment_name);
        C35301lh r0 = (C35301lh) getIntent().getParcelableExtra("extra_payment_name");
        if (r0 == null || (str = (String) r0.A00) == null) {
            str = this.A0A.A00.getString("push_name", "");
        }
        A0N.setText(str);
        int i2 = 3;
        if (this.A01.A0T()) {
            i2 = 5;
        }
        A0N.setGravity(i2);
        View findViewById = findViewById(R.id.mapper_confirm_done);
        TextView A0N2 = C13680ns.A0N(this, R.id.vpa_id);
        TextView A0N3 = C13680ns.A0N(this, R.id.vpa_alias);
        ImageView imageView = (ImageView) C18450wi.A01(this, R.id.profile_icon_placeholder);
        C18450wi.A0H(imageView, 0);
        this.A00 = imageView;
        C17160ud r1 = this.A01;
        if (r1 != null) {
            r1.A05(imageView, R.drawable.avatar_contact);
            Resources resources = getResources();
            Object[] objArr = new Object[1];
            AnonymousClass60V r02 = this.A02;
            if (r02 != null) {
                A0N2.setText(C13700nu.A0F(resources, r02.A05().A00, objArr, 0, R.string.str1b1e));
                Resources resources2 = getResources();
                Object[] objArr2 = new Object[1];
                C16040sK r03 = this.A01;
                r03.A0B();
                Me me = r03.A00;
                A0N3.setText(C13700nu.A0F(resources2, me == null ? null : me.number, objArr2, 0, R.string.str1941));
                C13690nt.A19(findViewById, this, 10);
                AnonymousClass61W r3 = this.A03;
                if (r3 != null) {
                    Intent intent = getIntent();
                    r3.AKS(0, (Integer) null, "alias_complete", intent == null ? null : intent.getStringExtra("extra_referral_screen"));
                    return;
                }
                str2 = "indiaUpiFieldStatsLogger";
            } else {
                str2 = "paymentSharedPrefs";
            }
        } else {
            str2 = "contactAvatars";
        }
        throw C18450wi.A03(str2);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C18450wi.A0H(menuItem, 0);
        if (menuItem.getItemId() == 16908332) {
            AnonymousClass61W r4 = this.A03;
            if (r4 != null) {
                r4.AKS(C13680ns.A0Y(), C13680ns.A0a(), "alias_complete", C14530pL.A0P(this));
            } else {
                throw C18450wi.A03("indiaUpiFieldStatsLogger");
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
