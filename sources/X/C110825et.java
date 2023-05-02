package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.facebook.redex.IDxCListenerShape3S0201000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.whatsapp.util.Log;
import java.io.File;
import java.security.InvalidParameterException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.5et  reason: invalid class name and case insensitive filesystem */
public class C110825et extends AnonymousClass01X {
    public int A00 = -1;
    public final LayoutInflater A01;
    public final AnonymousClass04N A02;
    public final C38411qk A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final JSONArray A0B;
    public final boolean A0C;
    public final boolean A0D;

    public C110825et(LayoutInflater layoutInflater, AnonymousClass04N r3, C38411qk r4, String str, String str2, String str3, String str4, String str5, String str6, String str7, JSONArray jSONArray, int i2, boolean z2, boolean z3) {
        this.A0B = jSONArray;
        this.A08 = str;
        this.A09 = str2;
        this.A07 = str3;
        this.A0A = str4;
        this.A04 = str5;
        this.A05 = str6;
        this.A06 = str7;
        this.A0D = z2;
        this.A0C = z3;
        this.A03 = r4;
        this.A01 = layoutInflater;
        this.A02 = r3;
        this.A00 = i2;
    }

    public int A0C() {
        return this.A0B.length();
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r11, int i2) {
        View view;
        int i3;
        C111015fC r112 = (C111015fC) r11;
        try {
            C110825et r7 = r112.A06;
            JSONObject jSONObject = r7.A0B.getJSONObject(r112.A00());
            TextView textView = r112.A02;
            textView.setSingleLine(false);
            textView.setMaxLines(2);
            textView.setText(jSONObject.getString(r7.A0A));
            boolean optBoolean = jSONObject.optBoolean(r7.A05, false);
            View view2 = r112.A0H;
            float f2 = 1.0f;
            if (optBoolean) {
                f2 = 0.38f;
            }
            view2.setAlpha(f2);
            view2.setFocusable(AnonymousClass000.A1P(optBoolean ? 1 : 0));
            view2.setClickable(AnonymousClass000.A1P(optBoolean));
            String str = r7.A08;
            if (str == null) {
                r112.A05.setVisibility(8);
                r112.A03.setVisibility(8);
            } else if (str.equals("radio")) {
                boolean z2 = true;
                r112.A05.setVisibility(8);
                AppCompatRadioButton appCompatRadioButton = r112.A03;
                appCompatRadioButton.setVisibility(0);
                if (r7.A00 != r112.A00()) {
                    z2 = false;
                }
                appCompatRadioButton.setChecked(z2);
            } else {
                if (str.equals("image")) {
                    String str2 = r7.A06;
                    if (!TextUtils.isEmpty(str2)) {
                        r112.A03.setVisibility(8);
                        String str3 = r7.A07;
                        if (TextUtils.isEmpty(str3) || (str3 != null && str3.equals("url"))) {
                            WaImageView waImageView = r112.A05;
                            waImageView.setVisibility(0);
                            AnonymousClass00B.A06(str2);
                            r7.A03.A01(waImageView, jSONObject.getString(str2));
                        } else if (!TextUtils.isEmpty(str3) && str3 != null && str3.equals("file_path")) {
                            AnonymousClass00B.A06(str2);
                            String string = jSONObject.getString(str2);
                            if (new File(string).exists()) {
                                WaImageView waImageView2 = r112.A05;
                                waImageView2.setVisibility(0);
                                waImageView2.setImageURI(Uri.parse(string));
                            } else {
                                r112.A05.setVisibility(8);
                            }
                        }
                    }
                }
                r112.A05.setVisibility(8);
                r112.A03.setVisibility(8);
            }
            String str4 = r7.A04;
            if (str4 == null || TextUtils.isEmpty(jSONObject.optString(str4))) {
                r112.A01.setVisibility(8);
            } else {
                TextView textView2 = r112.A01;
                textView2.setText(jSONObject.optString(str4));
                textView2.setVisibility(0);
            }
            String str5 = r7.A09;
            if (str5 == null || !str5.equals("radio")) {
                r112.A04.setVisibility(8);
            } else {
                boolean z3 = true;
                AppCompatRadioButton appCompatRadioButton2 = r112.A04;
                appCompatRadioButton2.setVisibility(0);
                if (r7.A00 != r112.A00()) {
                    z3 = false;
                }
                appCompatRadioButton2.setChecked(z3);
            }
            view2.setOnClickListener(new IDxCListenerShape3S0201000_3_I1(r112, i2, this, 0));
            boolean z4 = this.A0C;
            if (z4 || i2 == this.A0B.length() - 1) {
                view = r112.A00;
                i3 = 8;
                if (!z4) {
                    i3 = 4;
                }
            } else {
                view = r112.A00;
                i3 = 0;
            }
            view.setVisibility(i3);
        } catch (JSONException unused) {
            StringBuilder A0r = AnonymousClass000.A0r("WaListViewBinder/ListViewHolder/decorate: property not found at position ");
            A0r.append(r112.A00());
            A0r.append(":");
            Log.e(AnonymousClass000.A0h(r112.A06.A0B.toString(), A0r));
            throw new InvalidParameterException(A0r.toString());
        }
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        View A0H = C13680ns.A0H(this.A01, viewGroup, R.layout.layout060f);
        if (this.A0D) {
            TypedValue typedValue = new TypedValue();
            viewGroup.getContext().getTheme().resolveAttribute(16843534, typedValue, true);
            A0H.setBackgroundResource(typedValue.resourceId);
        }
        return new C111015fC(A0H, this);
    }
}
