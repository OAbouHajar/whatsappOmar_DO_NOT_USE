package X;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1m0  reason: invalid class name and case insensitive filesystem */
public class C35481m0 extends C35491m1 {
    public static C28411Vz A04;
    public static C28411Vz A05;
    public static C28411Vz A06;
    public static final BigDecimal A07;
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(34);
    public C28401Vy A00;
    public final C28401Vy A01;
    public final String A02;
    public final String A03;

    static {
        BigDecimal bigDecimal = new BigDecimal(1);
        A07 = bigDecimal;
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        A06 = new C35481m0("XXX", "XXX", "#", "#", bigDecimal2, bigDecimal2, -1, 10, 1, 0);
        A05 = new C35481m0("INR", "₹", "R", "r", BigDecimal.valueOf(5000), bigDecimal, 0, 100, 2, 0);
        A04 = new C35481m0("BRL", "R$", "B", "b", BigDecimal.valueOf(1000), bigDecimal, 0, 100, 2, 0);
    }

    public C35481m0(Parcel parcel) {
        super(0, parcel);
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        Class<C28401Vy> cls = C28401Vy.class;
        this.A00 = (C28401Vy) parcel.readParcelable(cls.getClassLoader());
        this.A01 = (C28401Vy) parcel.readParcelable(cls.getClassLoader());
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35481m0(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.math.BigDecimal r16, java.math.BigDecimal r17, int r18, int r19, int r20, int r21) {
        /*
            r11 = this;
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            r4.<init>(r5, r6, r7, r8, r9, r10)
            double r0 = (double) r8
            double r2 = java.lang.Math.log10(r0)
            int r1 = (int) r2
            X.1Vy r0 = new X.1Vy
            r2 = r16
            r0.<init>(r2, r1)
            r11.A00 = r0
            X.1Vy r0 = new X.1Vy
            r2 = r17
            r0.<init>(r2, r1)
            r11.A01 = r0
            r11.A02 = r14
            r11.A03 = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35481m0.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.math.BigDecimal, java.math.BigDecimal, int, int, int, int):void");
    }

    public C35481m0(JSONObject jSONObject) {
        super(jSONObject);
        this.A02 = jSONObject.optString("currencyIconText");
        this.A03 = jSONObject.optString("requestCurrencyIconText");
        JSONObject optJSONObject = jSONObject.optJSONObject("maxValue");
        int i2 = this.A01;
        this.A00 = C28401Vy.A00(optJSONObject.optString("amount", ""), i2);
        this.A01 = C28401Vy.A00(jSONObject.optJSONObject("minValue").optString("amount", ""), i2);
    }

    public String A9F(AnonymousClass013 r7, C28401Vy r8) {
        String str = this.A04;
        BigDecimal bigDecimal = r8.A00;
        return C39741sz.A00(r7, str, this.A05, bigDecimal, bigDecimal.scale(), false);
    }

    public String A9G(AnonymousClass013 r4, BigDecimal bigDecimal) {
        return C39741sz.A01(r4, this.A04, this.A05, bigDecimal, false);
    }

    public String A9H(AnonymousClass013 r7, C28401Vy r8, int i2) {
        String str = this.A04;
        BigDecimal bigDecimal = r8.A00;
        return C39741sz.A00(r7, str, this.A05, bigDecimal, bigDecimal.scale(), true);
    }

    public String A9I(AnonymousClass013 r4, BigDecimal bigDecimal, int i2) {
        return C39741sz.A01(r4, this.A04, this.A05, bigDecimal, true);
    }

    public BigDecimal A9K(AnonymousClass013 r5, String str) {
        String str2 = this.A04;
        C39651sq r2 = C39651sq.A02;
        if (!TextUtils.isEmpty(str2)) {
            r2 = new C39651sq(str2);
        }
        try {
            C39751t0 A012 = r2.A01(r5, C39651sq.A00(r2.A00), false);
            return new BigDecimal(A012.A07.A00(str.replace(A012.A01, "").replace(A012.A00, "").replace(AnonymousClass01S.A06, "").trim()).toString());
        } catch (Exception e2) {
            Log.w("Currency parse threw: ", e2);
            try {
                return new BigDecimal(str);
            } catch (Exception e3) {
                Log.w("Currency parse fallback threw: ", e3);
                return null;
            }
        }
    }

    public CharSequence ABE(Context context) {
        return ABF(context, 0);
    }

    public CharSequence ABF(Context context, int i2) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(i2 == 1 ? this.A03 : this.A02);
        Typeface A022 = AnonymousClass00X.A02(context);
        if (A022 != null) {
            spannableStringBuilder.setSpan(new C39771t2(A022), 0, this.A02.length(), 0);
        }
        return spannableStringBuilder;
    }

    public C28401Vy ADP() {
        return this.A00;
    }

    public C28401Vy ADn() {
        return this.A01;
    }

    public int AGN(AnonymousClass013 r8) {
        String str = this.A04;
        C39651sq r6 = C39651sq.A02;
        if (!TextUtils.isEmpty(str)) {
            r6 = new C39651sq(str);
        }
        C39751t0 A012 = r6.A01(r8, C39651sq.A00(r6.A00), true);
        String A013 = A012.A07.A01(1.0d);
        if (A012.A02.A02) {
            A013 = A012.A01(A013, false);
        }
        String A022 = r6.A02(r8);
        int length = A013.length();
        int length2 = A022.length();
        return (length < length2 || !A013.substring(0, length2).equals(A022)) ? 2 : 1;
    }

    public JSONObject Ags() {
        JSONObject Ags = super.Ags();
        try {
            Ags.put("currencyIconText", this.A02);
            Ags.put("requestCurrencyIconText", this.A03);
            Ags.put("maxValue", this.A00.A01());
            Ags.put("minValue", this.A01.A01());
            return Ags;
        } catch (JSONException e2) {
            Log.e("PAY: PaymentCurrency toJsonObject threw: ", e2);
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
        if (!(obj instanceof C35481m0)) {
            return false;
        }
        C35481m0 r4 = (C35481m0) obj;
        return super.equals(r4) && this.A02.equals(r4.A02) && this.A03.equals(r4.A03) && this.A01.equals(r4.A01) && this.A00.equals(r4.A00);
    }

    public int hashCode() {
        return super.hashCode() + (this.A02.hashCode() * 31) + (this.A03.hashCode() * 31) + (this.A01.hashCode() * 31) + (this.A00.hashCode() * 31);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i2);
        parcel.writeParcelable(this.A01, i2);
    }
}
