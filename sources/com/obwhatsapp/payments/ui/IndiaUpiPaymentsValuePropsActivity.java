package com.obwhatsapp.payments.ui;

import X.AnonymousClass06X;
import X.AnonymousClass08E;
import X.C005402i;
import X.C110105dW;
import X.C110115dX;
import X.C111345g2;
import X.C112795jR;
import X.C13680ns;
import X.C14530pL;
import X.C14550pN;
import X.C16150sX;
import X.C19500yX;
import X.C49132Rg;
import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextSwitcher;
import android.widget.TextView;
import com.obwhatsapp.R;

public class IndiaUpiPaymentsValuePropsActivity extends C112795jR {
    public TextSwitcher A00;
    public boolean A01;

    public IndiaUpiPaymentsValuePropsActivity() {
        this(0);
    }

    public IndiaUpiPaymentsValuePropsActivity(int i2) {
        this.A01 = false;
        C110105dW.A0t(this, 66);
    }

    public void A1q() {
        if (!this.A01) {
            this.A01 = true;
            C49132Rg A0C = C110105dW.A0C(this);
            C16150sX r1 = A0C.A1s;
            C14550pN.A15(r1, this);
            C14530pL.A0b(A0C, r1, this, C110105dW.A0F(r1));
            C111345g2.A1k(A0C, r1, this, C111345g2.A1e(r1, this));
            C111345g2.A1q(r1, this);
            C111345g2.A1l(A0C, r1, this);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass06X r2 = (AnonymousClass06X) this.A00.getLayoutParams();
        r2.A0Y = (int) getResources().getDimension(R.dimen.dimen060c);
        this.A00.setLayoutParams(r2);
    }

    public void onCreate(Bundle bundle) {
        String str;
        int i2;
        super.onCreate(bundle);
        setContentView((int) R.layout.layout033d);
        A3L(R.string.str0fdf, R.color.color069a, R.id.payments_value_props_title_and_description_section);
        C005402i x2 = x();
        if (x2 != null) {
            C110105dW.A0u(x2, R.string.str0fdf);
        }
        TextView A0N = C13680ns.A0N(this, R.id.payments_value_props_title);
        ImageView A04 = C110115dX.A04(this, R.id.payments_value_props_image_section);
        this.A04.ALE(185472922);
        boolean A0C = this.A0C.A0C(1929);
        C19500yX r0 = this.A04;
        if (A0C) {
            str = "vectorDrawable";
            r0.AKi(185472922, "imageFormat", str);
            i2 = R.drawable.vec_ic_payments_vector_value_props;
        } else {
            str = "pngDrawable";
            r0.AKi(185472922, "imageFormat", str);
            i2 = R.drawable.ic_payments_value_props;
        }
        A04.setImageDrawable(AnonymousClass08E.A01(this, i2));
        this.A01.A00.A09(str);
        this.A04.AKz(185472922, 5);
        boolean A0C2 = this.A0C.A0C(1568);
        int i3 = R.string.str1189;
        if (A0C2) {
            i3 = R.string.str118a;
        }
        A0N.setText(i3);
        TextSwitcher textSwitcher = (TextSwitcher) findViewById(R.id.payments_value_props_desc);
        this.A00 = textSwitcher;
        A3V(textSwitcher);
        C110105dW.A0r(findViewById(R.id.payments_value_props_continue), this, 67);
        this.A0D.A09();
    }
}
