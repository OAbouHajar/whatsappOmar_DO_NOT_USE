package com.obwhatsapp.businessupsell;

import X.AnonymousClass000;
import X.AnonymousClass2ZK;
import X.C13680ns;
import X.C13690nt;
import X.C14530pL;
import X.C14550pN;
import X.C14570pP;
import X.C16150sX;
import X.C16490t9;
import X.C17090uW;
import X.C17220uj;
import X.C30531cW;
import X.C49132Rg;
import X.C59142uk;
import X.C74583qm;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

public class BusinessProfileEducation extends C14530pL {
    public C17090uW A00;
    public C16490t9 A01;
    public C17220uj A02;
    public AnonymousClass2ZK A03;
    public boolean A04;

    public BusinessProfileEducation() {
        this(0);
    }

    public BusinessProfileEducation(int i2) {
        this.A04 = false;
        C13680ns.A1G(this, 26);
    }

    public void A1q() {
        if (!this.A04) {
            this.A04 = true;
            C49132Rg A1T = C14570pP.A1T(this);
            C16150sX r1 = A1T.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A1T, r1, this, C14550pN.A0v(r1));
            this.A01 = C16150sX.A0m(r1);
            this.A00 = C16150sX.A03(r1);
            this.A02 = C16150sX.A18(r1);
            this.A03 = A1T.A0g();
        }
    }

    public final void A35(int i2) {
        C74583qm r1 = new C74583qm();
        r1.A00 = Integer.valueOf(i2);
        r1.A01 = 11;
        this.A01.A06(r1);
    }

    public void onCreate(Bundle bundle) {
        int i2;
        Object[] objArr;
        super.onCreate(bundle);
        setContentView((int) R.layout.layout00c3);
        C13680ns.A18(findViewById(R.id.close), this, 35);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.business_account_info_description);
        C30531cW.A02(textEmojiLabel);
        String stringExtra = getIntent().getStringExtra("key_extra_business_name");
        if (!AnonymousClass000.A1R(getIntent().getIntExtra("key_extra_verified_level", -1), 3) || stringExtra == null) {
            i2 = R.string.str020b;
            objArr = new Object[]{this.A02.A04("26000089").toString()};
        } else {
            i2 = R.string.str020c;
            objArr = C13690nt.A1Z();
            objArr[0] = Html.escapeHtml(stringExtra);
            objArr[1] = this.A02.A04("26000089").toString();
        }
        SpannableStringBuilder A0F = C13690nt.A0F(Html.fromHtml(getString(i2, objArr)));
        URLSpan[] uRLSpanArr = (URLSpan[]) A0F.getSpans(0, A0F.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                A0F.setSpan(new C59142uk(this, this.A00, this.A05, this.A08, uRLSpan.getURL()), A0F.getSpanStart(uRLSpan), A0F.getSpanEnd(uRLSpan), A0F.getSpanFlags(uRLSpan));
            }
        }
        C30531cW.A03(textEmojiLabel, this.A08);
        textEmojiLabel.setText(A0F, TextView.BufferType.SPANNABLE);
        C13680ns.A18(findViewById(R.id.upsell_button), this, 36);
        A35(1);
    }
}
