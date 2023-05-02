package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4j7  reason: invalid class name and case insensitive filesystem */
public final class C93394j7 implements Parcelable {
    public static final C93314iz CREATOR = new C93314iz();
    public final String A00;
    public final String A01;

    public C93394j7(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C93394j7) {
                C93394j7 r5 = (C93394j7) obj;
                if (!C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K4.A07(this.A01) + AnonymousClass000.A0G(this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("AvatarProfilePhotoPose(url=");
        A0r.append(this.A01);
        A0r.append(", emojis=");
        return AnonymousClass3K2.A0k(this.A00, A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        C18450wi.A0H(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A00);
    }
}
