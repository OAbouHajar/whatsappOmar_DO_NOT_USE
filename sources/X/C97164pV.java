package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4pV  reason: invalid class name and case insensitive filesystem */
public final class C97164pV implements C35731mP {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(3);
    public final int A00;
    public final String A01;

    public C97164pV(int i2, String str) {
        this.A00 = i2;
        this.A01 = str;
    }

    public /* synthetic */ byte[] AHA() {
        return null;
    }

    public /* synthetic */ C32491gT AHB() {
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Ait(controlCode=");
        A0r.append(this.A00);
        A0r.append(",url=");
        A0r.append(this.A01);
        return AnonymousClass000.A0h(")", A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
    }
}
