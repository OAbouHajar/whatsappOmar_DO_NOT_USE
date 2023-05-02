package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextSwitcher;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiIncentivesValuePropsActivity;
import com.obwhatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;
import com.obwhatsapp.payments.ui.IndiaUpiPaymentsValuePropsActivity;
import com.obwhatsapp.payments.ui.IndiaUpiPaymentsValuePropsBottomSheetActivity;
import com.whatsapp.util.IDxATaskShape27S0200000_3_I1;
import com.whatsapp.util.Log;

/* renamed from: X.5jR  reason: invalid class name and case insensitive filesystem */
public abstract class C112795jR extends AnonymousClass5k6 {
    public C117075sP A00;
    public C113285ln A01;
    public String A02;

    public String A3S() {
        return this instanceof IndiaUpiPaymentsValuePropsBottomSheetActivity ? "payment_intro_prompt" : this instanceof IndiaUpiPaymentsValuePropsActivity ? "payment_intro_screen" : "incentive_value_prop";
    }

    public void A3T() {
        this.A01.A00.A09("valuePropsContinue");
        A3X(this.A02);
        C112795jR r4 = this.A00.A02;
        Intent A04 = C110105dW.A04(r4, IndiaUpiPaymentsAccountSetupActivity.class);
        r4.A0U = true;
        r4.A3M(A04);
        A04.putExtra("extra_previous_screen", r4.A3S());
        AnonymousClass22U.A00(A04, "valuePropsContinue");
        r4.A2X(A04, true);
    }

    public void A3U() {
        if (this instanceof IndiaUpiIncentivesValuePropsActivity) {
            IndiaUpiIncentivesValuePropsActivity indiaUpiIncentivesValuePropsActivity = (IndiaUpiIncentivesValuePropsActivity) this;
            C111345g2.A1z(indiaUpiIncentivesValuePropsActivity.A01, 4);
            C53842gO A03 = indiaUpiIncentivesValuePropsActivity.A0E.A03(C13680ns.A0Y(), C13680ns.A0a(), "incentive_value_prop", (String) null);
            A03.A01 = Boolean.valueOf(C111345g2.A21(indiaUpiIncentivesValuePropsActivity));
            C111345g2.A1s(A03, indiaUpiIncentivesValuePropsActivity);
            return;
        }
        C111345g2.A1z(this.A01, 4);
        AnonymousClass61W r2 = this.A0E;
        r2.A02.A06(r2.A04(C13680ns.A0Y(), C13680ns.A0a(), A3S(), this.A02, this.A0g, this.A0f, AnonymousClass000.A1R(this.A02, 11)));
    }

    public void A3V(TextSwitcher textSwitcher) {
        int i2 = this.A02;
        int i3 = R.string.str1183;
        if (i2 == 11) {
            i3 = R.string.str1188;
        }
        textSwitcher.setText(Html.fromHtml(getString(i3)));
        Context context = textSwitcher.getContext();
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.anim003d);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.anim0041);
        textSwitcher.setInAnimation(loadAnimation);
        textSwitcher.setOutAnimation(loadAnimation2);
        C13680ns.A1U(new IDxATaskShape27S0200000_3_I1(textSwitcher, 1, this), this.A05);
    }

    public void A3W(Long l2) {
        int i2;
        Uri uri;
        AnonymousClass2St r8 = null;
        if (!(getIntent() == null || (uri = (Uri) getIntent().getParcelableExtra("extra_deep_link_url")) == null)) {
            try {
                String queryParameter = uri.getQueryParameter("campaignID");
                if (!TextUtils.isEmpty(queryParameter)) {
                    AnonymousClass2St A0N = C110105dW.A0N();
                    A0N.A01("campaign_id", queryParameter);
                    r8 = A0N;
                }
            } catch (Exception unused) {
            }
        }
        AnonymousClass61W r9 = this.A0E;
        Integer A0X = C13680ns.A0X();
        String A3S = A3S();
        String str = this.A02;
        boolean A1R = AnonymousClass000.A1R(this.A02, 11);
        String str2 = this.A0g;
        String str3 = this.A0f;
        C53842gO A7M = r9.A7M();
        A7M.A0a = A3S;
        A7M.A06 = Boolean.valueOf(A1R);
        A7M.A08 = A0X;
        if (r9.A00.A0C(1330)) {
            A7M.A0V = str2;
            A7M.A0W = str3;
        }
        if (str != null) {
            A7M.A0Z = str;
        }
        AnonymousClass61W.A00(A7M, r8);
        if (l2 != null) {
            long longValue = l2.longValue();
            if (longValue <= 10) {
                i2 = 1;
            } else if (longValue <= 15) {
                i2 = 2;
            } else {
                i2 = 4;
                if (longValue <= 20) {
                    i2 = 3;
                }
            }
            A7M.A09 = Integer.valueOf(i2);
            Log.i(AnonymousClass000.A0g("PAY: logContactBucketUserActionEvent event:", A7M));
        }
        this.A05.A06(A7M);
    }

    public void A3X(String str) {
        String str2 = str;
        if (this instanceof IndiaUpiIncentivesValuePropsActivity) {
            IndiaUpiIncentivesValuePropsActivity indiaUpiIncentivesValuePropsActivity = (IndiaUpiIncentivesValuePropsActivity) this;
            C53842gO A03 = indiaUpiIncentivesValuePropsActivity.A0E.A03(C13680ns.A0Y(), C13690nt.A0U(), "incentive_value_prop", str);
            A03.A01 = Boolean.valueOf(C111345g2.A21(indiaUpiIncentivesValuePropsActivity));
            C111345g2.A1s(A03, indiaUpiIncentivesValuePropsActivity);
            return;
        }
        AnonymousClass61W r2 = this.A0E;
        r2.A02.A06(r2.A04(C13680ns.A0Y(), 36, A3S(), str2, this.A0g, this.A0f, AnonymousClass000.A1R(this.A02, 11)));
    }

    public void onBackPressed() {
        super.onBackPressed();
        A3U();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.A02 = C110115dX.A0a(this);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            A3U();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onResume() {
        super.onResume();
        this.A01.A00(getIntent());
        this.A01.A00.A09("valuePropsShown");
        C113285ln r4 = this.A01;
        int i2 = this.A03;
        long j2 = (long) this.A02;
        String str = this.A02;
        boolean A21 = C111345g2.A21(this);
        C31081dR r6 = r4.A00;
        r6.A0A("setupMode", i2 == 2 ? "skip2fa" : "with2fa", false);
        r6.A07.AKh(r6.A06.A05, "paymentsEntryPoint", j2);
        if (str != null) {
            r6.A0A("referralScreen", str, false);
        }
        r6.A0B("paymentsAccountExists", A21, false);
    }
}
