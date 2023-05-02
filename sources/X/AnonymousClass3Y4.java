package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Y4  reason: invalid class name */
public final class AnonymousClass3Y4 extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92584hn();
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    public AnonymousClass3Y4(AnonymousClass43D r5, String str, int i2) {
        C13710nw.A01(str);
        this.A03 = str;
        this.A01 = i2;
        this.A02 = -1;
        this.A04 = "VISION";
        this.A05 = null;
        this.A06 = null;
        this.A07 = true;
        this.A08 = false;
        this.A00 = r5.value;
    }

    public AnonymousClass3Y4(String str, String str2, String str3, String str4, int i2, int i3, int i4, boolean z2, boolean z3) {
        this.A03 = str;
        this.A01 = i2;
        this.A02 = i3;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = z2;
        this.A04 = str4;
        this.A08 = z3;
        this.A00 = i4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3Y4) {
                AnonymousClass3Y4 r5 = (AnonymousClass3Y4) obj;
                if (!(AnonymousClass45A.A00(this.A03, r5.A03) && this.A01 == r5.A01 && this.A02 == r5.A02 && AnonymousClass45A.A00(this.A04, r5.A04) && AnonymousClass45A.A00(this.A05, r5.A05) && AnonymousClass45A.A00(this.A06, r5.A06) && this.A07 == r5.A07 && this.A08 == r5.A08 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[9];
        objArr[0] = this.A03;
        AnonymousClass000.A1L(objArr, this.A01);
        AnonymousClass3K2.A1W(objArr, this.A02);
        objArr[3] = this.A04;
        objArr[4] = this.A05;
        objArr[5] = this.A06;
        objArr[6] = Boolean.valueOf(this.A07);
        objArr[7] = Boolean.valueOf(this.A08);
        return AnonymousClass000.A0F(Integer.valueOf(this.A00), objArr, 8);
    }

    public final String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("PlayLoggerContext[");
        A0r.append("package=");
        A0r.append(this.A03);
        A0r.append(',');
        A0r.append("packageVersionCode=");
        A0r.append(this.A01);
        A0r.append(',');
        A0r.append("logSource=");
        A0r.append(this.A02);
        A0r.append(',');
        A0r.append("logSourceName=");
        A0r.append(this.A04);
        A0r.append(',');
        A0r.append("uploadAccount=");
        A0r.append(this.A05);
        A0r.append(',');
        A0r.append("loggingId=");
        A0r.append(this.A06);
        A0r.append(',');
        A0r.append("logAndroidId=");
        A0r.append(this.A07);
        A0r.append(',');
        A0r.append("isAnonymous=");
        A0r.append(this.A08);
        A0r.append(',');
        A0r.append("qosTier=");
        A0r.append(this.A00);
        return AnonymousClass000.A0h("]", A0r);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        boolean A1R = AnonymousClass3K3.A1R(parcel, this.A03);
        C32251fv.A06(parcel, 3, this.A01);
        C32251fv.A06(parcel, 4, this.A02);
        C32251fv.A0A(parcel, this.A05, 5, A1R);
        C32251fv.A0A(parcel, this.A06, 6, A1R);
        C32251fv.A08(parcel, 7, this.A07);
        C32251fv.A0A(parcel, this.A04, 8, A1R);
        C32251fv.A08(parcel, 9, this.A08);
        C32251fv.A06(parcel, 10, this.A00);
        C32251fv.A05(parcel, A002);
    }
}
