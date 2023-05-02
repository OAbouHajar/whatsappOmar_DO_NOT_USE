package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4jA  reason: invalid class name and case insensitive filesystem */
public final class C93424jA implements Parcelable {
    public static final C93344j2 CREATOR = new C93344j2();
    public final C35301lh A00;
    public final C35301lh A01;
    public final C35301lh A02;

    public C93424jA(Parcel parcel) {
        Class<C35301lh> cls = C35301lh.class;
        Parcelable A0U = AnonymousClass3K3.A0U(parcel, cls);
        if (A0U != null) {
            C35301lh r3 = (C35301lh) A0U;
            Parcelable A0U2 = AnonymousClass3K3.A0U(parcel, cls);
            if (A0U2 != null) {
                C35301lh r2 = (C35301lh) A0U2;
                Parcelable A0U3 = AnonymousClass3K3.A0U(parcel, cls);
                if (A0U3 != null) {
                    C35301lh r1 = (C35301lh) A0U3;
                    C18450wi.A0J(r3, r2);
                    C18450wi.A0H(r1, 3);
                    this.A00 = r3;
                    this.A01 = r2;
                    this.A02 = r1;
                    return;
                }
            }
        }
        throw AnonymousClass000.A0V("Required value was null.");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C93424jA) {
                C93424jA r5 = (C93424jA) obj;
                if (!C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K2.A06(this.A02, AnonymousClass000.A0E(this.A01, AnonymousClass3K3.A0H(this.A00)));
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Fb4aUserEntityForNativeAuth(accessToken=");
        A0r.append(this.A00);
        A0r.append(", fullName=");
        A0r.append(this.A01);
        A0r.append(", profilePictureUrl=");
        return AnonymousClass3K2.A0k(this.A02, A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        C18450wi.A0H(parcel, 0);
        parcel.writeParcelable(this.A00, i2);
        parcel.writeParcelable(this.A01, i2);
        parcel.writeParcelable(this.A02, i2);
    }
}
