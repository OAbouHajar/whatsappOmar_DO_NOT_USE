package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3V9  reason: invalid class name */
public final class AnonymousClass3V9 extends C97154pU {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(12);
    public final String A00;
    public final String A01;
    public final String A02;

    public AnonymousClass3V9(Parcel parcel) {
        super("COMM");
        this.A01 = parcel.readString();
        this.A00 = parcel.readString();
        this.A02 = parcel.readString();
    }

    public AnonymousClass3V9(String str, String str2, String str3) {
        super("COMM");
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass3V9.class != obj.getClass()) {
                return false;
            }
            AnonymousClass3V9 r5 = (AnonymousClass3V9) obj;
            if (!AnonymousClass3C1.A0F(this.A00, r5.A00) || !AnonymousClass3C1.A0F(this.A01, r5.A01) || !AnonymousClass3C1.A0F(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i2 = 0;
        int A07 = (AnonymousClass3K3.A07(AnonymousClass3K3.A0I(this.A01)) + AnonymousClass3K3.A0I(this.A00)) * 31;
        String str = this.A02;
        if (str != null) {
            i2 = str.hashCode();
        }
        return A07 + i2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this.A00);
        A0o.append(": language=");
        A0o.append(this.A01);
        A0o.append(", description=");
        return AnonymousClass000.A0h(this.A00, A0o);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
