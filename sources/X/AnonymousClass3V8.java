package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3V8  reason: invalid class name */
public final class AnonymousClass3V8 extends C97154pU {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(18);
    public final String A00;
    public final String A01;

    public AnonymousClass3V8(Parcel parcel) {
        super(parcel.readString());
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public AnonymousClass3V8(String str, String str2, String str3) {
        super(str);
        this.A00 = str2;
        this.A01 = str3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass3V8.class != obj.getClass()) {
                return false;
            }
            AnonymousClass3V8 r5 = (AnonymousClass3V8) obj;
            if (!this.A00.equals(r5.A00) || !AnonymousClass3C1.A0F(this.A00, r5.A00) || !AnonymousClass3C1.A0F(this.A01, r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i2 = 0;
        int A07 = (AnonymousClass3K3.A07(this.A00.hashCode()) + AnonymousClass3K3.A0I(this.A00)) * 31;
        String str = this.A01;
        if (str != null) {
            i2 = str.hashCode();
        }
        return A07 + i2;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this.A00);
        A0o.append(": url=");
        return AnonymousClass000.A0h(this.A01, A0o);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
