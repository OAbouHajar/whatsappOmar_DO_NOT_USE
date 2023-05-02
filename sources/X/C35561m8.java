package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1m8  reason: invalid class name and case insensitive filesystem */
public class C35561m8 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(22);
    public final C35571m9 A00;
    public final C35571m9 A01;

    public C35561m8(C35571m9 r1, C35571m9 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public C35561m8(Parcel parcel) {
        Class<C35571m9> cls = C35571m9.class;
        this.A00 = (C35571m9) parcel.readParcelable(cls.getClassLoader());
        this.A01 = (C35571m9) parcel.readParcelable(cls.getClassLoader());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C35561m8)) {
            return false;
        }
        C35561m8 r4 = (C35561m8) obj;
        return C34901l3.A00(this.A00, r4.A00) && C34901l3.A00(this.A01, r4.A01);
    }

    public int hashCode() {
        C35571m9 r0 = this.A00;
        int i2 = 0;
        int hashCode = (r0 != null ? r0.hashCode() : 0) * 31;
        C35571m9 r02 = this.A01;
        if (r02 != null) {
            i2 = r02.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LinkedAccounts:{'facebookPage'='");
        C35571m9 r0 = this.A00;
        String str = null;
        sb.append(r0 != null ? r0.toString() : null);
        sb.append("', 'instagramPage'='");
        C35571m9 r02 = this.A01;
        if (r02 != null) {
            str = r02.toString();
        }
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.A00, i2);
        parcel.writeParcelable(this.A01, i2);
    }
}
