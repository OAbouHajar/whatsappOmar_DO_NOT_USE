package X;

import android.graphics.PorterDuff;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.phonematching.CountryAndPhoneNumberFragment;

/* renamed from: X.2zo  reason: invalid class name and case insensitive filesystem */
public class C60012zo extends AnonymousClass4SS {
    public final /* synthetic */ CountryAndPhoneNumberFragment A00;

    public C60012zo(CountryAndPhoneNumberFragment countryAndPhoneNumberFragment) {
        this.A00 = countryAndPhoneNumberFragment;
    }

    public void A01(String str, String str2) {
        TextView textView;
        int i2;
        boolean equals = str.equals("");
        CountryAndPhoneNumberFragment countryAndPhoneNumberFragment = this.A00;
        if (equals) {
            countryAndPhoneNumberFragment.A06.setText(R.string.str1374);
        } else if (str2 == null) {
            countryAndPhoneNumberFragment.A06.setText(R.string.str1374);
            C13680ns.A0v(countryAndPhoneNumberFragment.A08, countryAndPhoneNumberFragment.A05, R.color.color0699);
            countryAndPhoneNumberFragment.A06.getBackground().setColorFilter(AnonymousClass00T.A00(countryAndPhoneNumberFragment.A08, R.color.color0699), PorterDuff.Mode.SRC_IN);
            textView = countryAndPhoneNumberFragment.A04;
            i2 = 0;
            textView.setVisibility(i2);
        } else {
            countryAndPhoneNumberFragment.A06.setText(countryAndPhoneNumberFragment.A0D.A02(countryAndPhoneNumberFragment.A0B, str2));
        }
        C13680ns.A0v(countryAndPhoneNumberFragment.A08, countryAndPhoneNumberFragment.A05, R.color.color0710);
        countryAndPhoneNumberFragment.A06.getBackground().setColorFilter(AnonymousClass00T.A00(countryAndPhoneNumberFragment.A08, R.color.color0708), PorterDuff.Mode.SRC_IN);
        textView = countryAndPhoneNumberFragment.A04;
        i2 = 4;
        textView.setVisibility(i2);
    }
}
