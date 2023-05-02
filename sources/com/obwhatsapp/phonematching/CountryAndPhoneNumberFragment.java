package com.obwhatsapp.phonematching;

import X.AnonymousClass000;
import X.AnonymousClass00T;
import X.AnonymousClass013;
import X.AnonymousClass01V;
import X.AnonymousClass1G1;
import X.AnonymousClass2JN;
import X.C13680ns;
import X.C14530pL;
import X.C18160wF;
import X.C19980zJ;
import X.C447725m;
import X.C45902Bo;
import X.C60012zo;
import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.components.PhoneNumberEntry;
import com.whatsapp.util.Log;
import java.io.IOException;

public class CountryAndPhoneNumberFragment extends Hilt_CountryAndPhoneNumberFragment {
    public int A00;
    public int A01;
    public EditText A02;
    public EditText A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public AnonymousClass1G1 A07;
    public C14530pL A08;
    public PhoneNumberEntry A09;
    public AnonymousClass01V A0A;
    public AnonymousClass013 A0B;
    public MatchPhoneNumberFragment A0C;
    public C18160wF A0D;
    public String A0E = null;
    public String A0F;

    public void A0w() {
        super.A0w();
        this.A01 = AnonymousClass2JN.A00(this.A03);
        this.A00 = AnonymousClass2JN.A00(this.A02);
    }

    public void A0x(int i2, int i3, Intent intent) {
        super.A0x(i2, i3, intent);
        if (i2 == 0 && i3 == -1 && intent != null) {
            this.A0E = intent.getStringExtra("cc");
            this.A0F = intent.getStringExtra("iso");
            String stringExtra = intent.getStringExtra("country_name");
            this.A02.setText(this.A0E);
            this.A06.setText(stringExtra);
            this.A09.A02(this.A0F);
            if (this.A01 == -1) {
                this.A01 = Integer.MAX_VALUE;
            }
        }
    }

    public View A11(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A0H = C13680ns.A0H(layoutInflater, viewGroup, R.layout.layout01f8);
        this.A09 = (PhoneNumberEntry) A0H.findViewById(R.id.phone_number_entry);
        this.A06 = C13680ns.A0M(A0H, R.id.registration_country);
        this.A04 = C13680ns.A0M(A0H, R.id.registration_country_error_view);
        this.A05 = C13680ns.A0M(A0H, R.id.registration_country_label);
        PhoneNumberEntry phoneNumberEntry = this.A09;
        this.A02 = phoneNumberEntry.A02;
        this.A03 = phoneNumberEntry.A03;
        phoneNumberEntry.A04 = new C60012zo(this);
        TelephonyManager A0N = this.A0A.A0N();
        if (A0N == null) {
            Log.w("CountryAndPhoneNumberFragment tm=null");
        } else {
            String simCountryIso = A0N.getSimCountryIso();
            if (simCountryIso != null) {
                try {
                    this.A0E = this.A07.A04(simCountryIso);
                } catch (IOException e2) {
                    Log.e("CountryAndPhoneNumberFragment/iso/code failed to get code from CountryPhoneInfo", e2);
                }
            }
        }
        Drawable A042 = AnonymousClass00T.A04(this.A08, R.drawable.abc_spinner_textfield_background_material);
        boolean z2 = C45902Bo.A01;
        TextView textView = this.A06;
        if (z2) {
            textView.setBackground(A042);
        } else {
            textView.setBackground(new C447725m(A042, this.A0B));
        }
        C45902Bo.A03(this.A03);
        if (Build.VERSION.SDK_INT < 21) {
            this.A06.getBackground().setColorFilter(AnonymousClass00T.A00(this.A08, R.color.color0708), PorterDuff.Mode.SRC_IN);
        }
        C13680ns.A15(this.A06, this, 1);
        this.A03.requestFocus();
        this.A01 = AnonymousClass2JN.A00(this.A03);
        this.A00 = AnonymousClass2JN.A00(this.A02);
        String str = this.A0E;
        if (str != null) {
            this.A02.setText(str);
        }
        if (!TextUtils.isEmpty(this.A0F)) {
            Log.i(AnonymousClass000.A0h(this.A0F, AnonymousClass000.A0r("CountryAndPhoneNumberFragment/country: ")));
            this.A09.A02(this.A0F);
        }
        return A0H;
    }

    public void A14() {
        super.A14();
        String str = this.A0E;
        if (str != null) {
            this.A02.setText(str);
        }
        String str2 = this.A0F;
        if (str2 != null) {
            this.A06.setText(this.A0D.A02(this.A0B, str2));
        }
        AnonymousClass2JN.A0I(this.A02, this.A00);
        AnonymousClass2JN.A0I(this.A03, this.A01);
        this.A03.clearFocus();
    }

    public void A16(Context context) {
        super.A16(context);
        this.A08 = (C14530pL) C19980zJ.A01(context, C14530pL.class);
    }
}
