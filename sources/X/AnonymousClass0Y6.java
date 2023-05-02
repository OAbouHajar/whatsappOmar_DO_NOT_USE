package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0Y6  reason: invalid class name */
public class AnonymousClass0Y6 implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass000.A0S(31);
    public float A00 = 1.0f;
    public float A01 = 1.0f;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public List A0C = Collections.EMPTY_LIST;

    public AnonymousClass0Y6(String str) {
        this.A08 = str;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0Y6)) {
            return false;
        }
        AnonymousClass0Y6 r4 = (AnonymousClass0Y6) obj;
        return AnonymousClass09S.A00(this.A04, r4.A04) && AnonymousClass09S.A00(this.A08, r4.A08) && AnonymousClass09S.A00(this.A0B, r4.A0B) && AnonymousClass09S.A00(this.A02, r4.A02) && AnonymousClass09S.A00(this.A0A, r4.A0A) && AnonymousClass09S.A00(this.A03, r4.A03) && AnonymousClass09S.A00(this.A05, r4.A05) && AnonymousClass09S.A00(this.A06, r4.A06) && AnonymousClass09S.A00(this.A07, r4.A07) && this.A00 == r4.A00 && this.A01 == r4.A01 && this.A0C.equals(r4.A0C) && AnonymousClass09S.A00(this.A09, r4.A09);
    }

    public int hashCode() {
        int i2 = 0;
        int A082 = (AnonymousClass000.A08(AnonymousClass000.A08((((((((((((((((((527 + AnonymousClass000.A0G(this.A04)) * 31) + AnonymousClass000.A0G(this.A08)) * 31) + AnonymousClass000.A0G(this.A0B)) * 31) + AnonymousClass000.A0G(this.A02)) * 31) + AnonymousClass000.A0G(this.A0A)) * 31) + AnonymousClass000.A0G(this.A03)) * 31) + AnonymousClass000.A0G(this.A05)) * 31) + AnonymousClass000.A0G(this.A06)) * 31) + AnonymousClass000.A0G(this.A07)) * 31, this.A00), this.A01) + this.A0C.hashCode()) * 31;
        String str = this.A09;
        if (str != null) {
            i2 = str.hashCode();
        }
        return A082 + i2;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A08);
        parcel.writeString(this.A04);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A02);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A03);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeStringList(this.A0C);
        parcel.writeString(this.A09);
    }
}
