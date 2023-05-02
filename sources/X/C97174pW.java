package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4pW  reason: invalid class name and case insensitive filesystem */
public final class C97174pW implements C35731mP {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(6);
    public final String A00;
    public final String A01;

    public C97174pW(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public C97174pW(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
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

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C97174pW.class != obj.getClass()) {
                return false;
            }
            C97174pW r5 = (C97174pW) obj;
            if (!this.A00.equals(r5.A00) || !this.A01.equals(r5.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K4.A08(this.A01, AnonymousClass3K3.A07(this.A00.hashCode()));
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("VC: ");
        A0r.append(this.A00);
        A0r.append("=");
        return AnonymousClass000.A0h(this.A01, A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
