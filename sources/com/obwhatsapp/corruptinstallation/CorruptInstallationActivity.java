package com.obwhatsapp.corruptinstallation;

import X.AnonymousClass1KO;
import X.AnonymousClass1Y3;
import X.AnonymousClass1ZW;
import X.AnonymousClass3MI;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C18890xQ;
import X.C49132Rg;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.ArrayList;

public class CorruptInstallationActivity extends C14530pL {
    public AnonymousClass1KO A00;
    public C18890xQ A01;
    public boolean A02;

    public CorruptInstallationActivity() {
        this(0);
    }

    public CorruptInstallationActivity(int i2) {
        this.A02 = false;
        C13680ns.A1G(this, 60);
    }

    public void A1q() {
        if (!this.A02) {
            this.A02 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A01 = C16150sX.A06(r1);
            this.A00 = (AnonymousClass1KO) r1.ALY.get();
        }
    }

    public void onCreate(Bundle bundle) {
        int i2;
        super.onCreate(bundle);
        setContentView((int) R.layout.layout0043);
        TextView A0N = C13680ns.A0N(this, R.id.corrupt_installation_contact_support_textview);
        Spanned A012 = AnonymousClass1ZW.A01(getString(R.string.str0601), new Object[0]);
        SpannableStringBuilder A0F = C13690nt.A0F(A012);
        URLSpan[] uRLSpanArr = (URLSpan[]) A012.getSpans(0, A012.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                if ("contact-support".equals(uRLSpan.getURL())) {
                    Log.i("contact-support link found");
                    int spanStart = A0F.getSpanStart(uRLSpan);
                    int spanEnd = A0F.getSpanEnd(uRLSpan);
                    int spanFlags = A0F.getSpanFlags(uRLSpan);
                    A0F.removeSpan(uRLSpan);
                    A0F.setSpan(new AnonymousClass3MI(this.A00.A00(this, (Bundle) null, (AnonymousClass1Y3) null, (Integer) null, "corrupt-install", (String) null, (ArrayList) null, (ArrayList) null, false)), spanStart, spanEnd, spanFlags);
                }
            }
        }
        A0N.setText(A0F);
        A0N.setMovementMethod(LinkMovementMethod.getInstance());
        if (!this.A01.A01()) {
            View findViewById = findViewById(R.id.btn_uninstall);
            TextView A0N2 = C13680ns.A0N(this, R.id.corrupt_installation_description_website_distribution_textview);
            A0N2.setMovementMethod(LinkMovementMethod.getInstance());
            A0N2.setText(AnonymousClass1ZW.A01(C13680ns.A0d(this, "https://www.whatsapp.com/android/", C13680ns.A1b(), 0, R.string.str0603), new Object[0]));
            C13680ns.A17(findViewById, this, 35);
            i2 = R.id.play_store_div;
        } else {
            C13680ns.A17(findViewById(R.id.btn_play_store), this, 36);
            i2 = R.id.website_div;
        }
        C13680ns.A1I(this, i2, 8);
    }
}
