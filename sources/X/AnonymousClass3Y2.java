package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.mod2.fblibs.FacebookFacade;

/* renamed from: X.3Y2  reason: invalid class name */
public class AnonymousClass3Y2 extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92544hj();
    @Deprecated
    public final int A00;
    public final long A01;
    public final String A02;

    public AnonymousClass3Y2(int i2, String str, long j2) {
        this.A02 = str;
        this.A00 = i2;
        this.A01 = j2;
    }

    public AnonymousClass3Y2(String str, long j2) {
        this.A02 = str;
        this.A01 = j2;
        this.A00 = -1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AnonymousClass3Y2) {
            AnonymousClass3Y2 r9 = (AnonymousClass3Y2) obj;
            String str = this.A02;
            String str2 = r9.A02;
            if (str == null ? str2 == null : str.equals(str2)) {
                long j2 = this.A01;
                if (j2 == -1) {
                    j2 = (long) this.A00;
                }
                long j3 = r9.A01;
                if (j3 == -1) {
                    j3 = (long) r9.A00;
                }
                if (j2 == j3) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] A1Z = C13690nt.A1Z();
        A1Z[0] = this.A02;
        long j2 = this.A01;
        if (j2 == -1) {
            j2 = (long) this.A00;
        }
        return AnonymousClass3K2.A08(Long.valueOf(j2), A1Z);
    }

    public final String toString() {
        C13930oJ r5 = new C13930oJ(this);
        r5.A00(this.A02, FacebookFacade.RequestParameter.NAME);
        long j2 = this.A01;
        if (j2 == -1) {
            j2 = (long) this.A00;
        }
        r5.A00(Long.valueOf(j2), "version");
        return r5.toString();
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A0A(parcel, this.A02, 1, false);
        int i3 = this.A00;
        C32251fv.A06(parcel, 2, i3);
        long j2 = this.A01;
        if (j2 == -1) {
            j2 = (long) i3;
        }
        C32251fv.A07(parcel, 3, j2);
        C32251fv.A05(parcel, A002);
    }
}
