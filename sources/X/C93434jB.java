package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4jB  reason: invalid class name and case insensitive filesystem */
public final class C93434jB implements Parcelable {
    public static final C93334j1 CREATOR = new C93334j1();
    public final int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public C93434jB(String str, String str2, String str3, String str4, String str5, int i2, int i3, int i4) {
        this.A07 = str;
        this.A03 = str2;
        this.A00 = i2;
        this.A05 = str3;
        this.A01 = i3;
        this.A02 = i4;
        this.A04 = str4;
        this.A06 = str5;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C93434jB) {
                C93434jB r5 = (C93434jB) obj;
                if (!C18450wi.A0R(this.A07, r5.A07) || !C18450wi.A0R(this.A03, r5.A03) || this.A00 != r5.A00 || !C18450wi.A0R(this.A05, r5.A05) || this.A01 != r5.A01 || this.A02 != r5.A02 || !C18450wi.A0R(this.A04, r5.A04) || !C18450wi.A0R(this.A06, r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A072 = AnonymousClass3K4.A07(this.A07);
        String str = this.A05;
        return AnonymousClass3K4.A08(this.A06, AnonymousClass3K2.A09(this.A04, (((AnonymousClass3K2.A09(str, (AnonymousClass3K2.A09(this.A03, A072) + this.A00) * 31) + this.A01) * 31) + this.A02) * 31));
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("AvatarSticker(url=");
        A0r.append(this.A07);
        A0r.append(", emojis=");
        A0r.append(this.A03);
        A0r.append(", fileSize=");
        A0r.append(this.A00);
        A0r.append(", mimeType=");
        A0r.append(this.A05);
        A0r.append(", height=");
        A0r.append(this.A01);
        A0r.append(", width=");
        A0r.append(this.A02);
        A0r.append(", fileHash=");
        A0r.append(this.A04);
        A0r.append(", templateId=");
        A0r.append(this.A06);
        return AnonymousClass000.A0j(A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        C18450wi.A0H(parcel, 0);
        parcel.writeString(this.A07);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A02);
        parcel.writeString(this.A04);
        parcel.writeString(this.A06);
    }
}
