package X;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1m5  reason: invalid class name and case insensitive filesystem */
public class C35531m5 extends C35491m1 {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(28);
    public C28401Vy A00;
    public final C28401Vy A01;
    public final String A02;
    public final boolean A03;
    public final String[] A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35531m5(Parcel parcel) {
        super(1, parcel);
        boolean z2 = true;
        this.A03 = parcel.readInt() != 1 ? false : z2;
        this.A02 = parcel.readString();
        String[] strArr = new String[parcel.readInt()];
        parcel.readStringArray(strArr);
        this.A04 = strArr;
        Class<C28401Vy> cls = C28401Vy.class;
        this.A00 = (C28401Vy) parcel.readParcelable(cls.getClassLoader());
        this.A01 = (C28401Vy) parcel.readParcelable(cls.getClassLoader());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35531m5(java.lang.String r9, java.lang.String r10, java.lang.String r11, java.math.BigDecimal r12, java.math.BigDecimal r13, java.lang.String[] r14, int r15, int r16, int r17, boolean r18) {
        /*
            r8 = this;
            r4 = 1
            r1 = r8
            r2 = r9
            r3 = r10
            r5 = r15
            r6 = r16
            r7 = r17
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0 = r18
            r8.A03 = r0
            r8.A02 = r11
            r8.A04 = r14
            X.1Vy r0 = new X.1Vy
            r0.<init>(r12, r6)
            r8.A00 = r0
            X.1Vy r0 = new X.1Vy
            r0.<init>(r13, r6)
            r8.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35531m5.<init>(java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, java.lang.String[], int, int, int, boolean):void");
    }

    public C35531m5(JSONObject jSONObject) {
        super(jSONObject);
        String[] strArr;
        this.A03 = jSONObject.optBoolean("isStable");
        this.A02 = jSONObject.optString("defaultMatchingFiat");
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("matchingFiats");
            strArr = new String[jSONArray.length()];
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                strArr[i2] = jSONArray.getString(i2);
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
            strArr = new String[0];
        }
        this.A04 = strArr;
        JSONObject optJSONObject = jSONObject.optJSONObject("maxValue");
        int i3 = this.A01;
        this.A00 = C28401Vy.A00(optJSONObject.optString("amount", ""), i3);
        this.A01 = C28401Vy.A00(jSONObject.optJSONObject("minValue").optString("amount", ""), i3);
    }

    public String A9F(AnonymousClass013 r4, C28401Vy r5) {
        return C39741sz.A02(r4, this.A05, r5.A00, false);
    }

    public String A9G(AnonymousClass013 r3, BigDecimal bigDecimal) {
        return C39741sz.A02(r3, this.A05, bigDecimal, false);
    }

    public String A9H(AnonymousClass013 r4, C28401Vy r5, int i2) {
        return C39741sz.A02(r4, this.A05, r5.A00, true);
    }

    public String A9I(AnonymousClass013 r3, BigDecimal bigDecimal, int i2) {
        return C39741sz.A02(r3, this.A05, bigDecimal, true);
    }

    public BigDecimal A9K(AnonymousClass013 r4, String str) {
        DecimalFormat decimalFormat = (DecimalFormat) DecimalFormat.getInstance(AnonymousClass013.A00(r4.A00));
        try {
            return new BigDecimal(decimalFormat.parse(str.replace(String.valueOf(decimalFormat.getDecimalFormatSymbols().getGroupingSeparator()), "")).toString());
        } catch (ParseException unused) {
            Log.e("PAY: CryptoCurrency/fromString: Currency parse threw: ");
            try {
                return new BigDecimal(str);
            } catch (NumberFormatException unused2) {
                Log.e("PAY: CryptoCurrency/fromString: Backup currency parse threw: ");
                return null;
            }
        }
    }

    public CharSequence ABE(Context context) {
        return ABF(context, 0);
    }

    public CharSequence ABF(Context context, int i2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@");
        Typeface A022 = AnonymousClass00X.A02(context);
        if (A022 != null) {
            spannableStringBuilder.setSpan(new C39771t2(A022), 0, "@".length(), 0);
        }
        return spannableStringBuilder;
    }

    public C28401Vy ADP() {
        return this.A00;
    }

    public C28401Vy ADn() {
        return this.A01;
    }

    public int AGN(AnonymousClass013 r2) {
        return 2;
    }

    public JSONObject Ags() {
        JSONObject Ags = super.Ags();
        try {
            Ags.put("isStable", this.A03);
            Ags.put("defaultMatchingFiat", this.A02);
            Ags.put("matchingFiatsLength", r3);
            JSONArray jSONArray = new JSONArray();
            for (String put : this.A04) {
                jSONArray.put(put);
            }
            Ags.put("matchingFiats", jSONArray);
            Ags.put("maxValue", this.A00.A01());
            Ags.put("minValue", this.A01.A01());
            return Ags;
        } catch (JSONException e2) {
            Log.e("PAY: CryptoCurrency toJsonObject threw: ", e2);
            return Ags;
        }
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35531m5)) {
            return false;
        }
        C35531m5 r4 = (C35531m5) obj;
        return super.equals(r4) && this.A03 == r4.A03 && this.A01.equals(r4.A01) && this.A00.equals(r4.A00) && this.A02.equals(r4.A02) && Arrays.equals(this.A04, r4.A04);
    }

    public int hashCode() {
        return super.hashCode() + ((this.A03 ^ true ? 1 : 0) * true) + (this.A02.hashCode() * 31) + (Arrays.hashCode(this.A04) * 31) + (this.A01.hashCode() * 31) + (this.A00.hashCode() * 31);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeString(this.A02);
        String[] strArr = this.A04;
        parcel.writeInt(strArr.length);
        parcel.writeStringArray(strArr);
        parcel.writeParcelable(this.A00, i2);
        parcel.writeParcelable(this.A01, i2);
    }
}
