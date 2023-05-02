package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: X.4jC  reason: invalid class name and case insensitive filesystem */
public final class C93444jC implements Parcelable {
    public static final C93324j0 CREATOR = new C93324j0();
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;

    public C93444jC(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list) {
        this.A00 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A07 = str6;
        this.A06 = str7;
        this.A02 = str8;
        this.A08 = list;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C93444jC) {
                C93444jC r5 = (C93444jC) obj;
                if (!C18450wi.A0R(this.A00, r5.A00) || !C18450wi.A0R(this.A03, r5.A03) || !C18450wi.A0R(this.A01, r5.A01) || !C18450wi.A0R(this.A04, r5.A04) || !C18450wi.A0R(this.A05, r5.A05) || !C18450wi.A0R(this.A07, r5.A07) || !C18450wi.A0R(this.A06, r5.A06) || !C18450wi.A0R(this.A02, r5.A02) || !C18450wi.A0R(this.A08, r5.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass3K2.A06(this.A08, AnonymousClass3K2.A09(this.A02, AnonymousClass3K2.A09(this.A06, AnonymousClass3K2.A09(this.A07, AnonymousClass3K2.A09(this.A05, AnonymousClass3K2.A09(this.A04, AnonymousClass3K2.A09(this.A01, AnonymousClass3K2.A09(this.A03, AnonymousClass3K4.A07(this.A00)))))))));
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("AvatarGetStickersEntity(id=");
        A0r.append(this.A00);
        A0r.append(", stickerPackId=");
        A0r.append(this.A03);
        A0r.append(", stickerPackDescription=");
        A0r.append(this.A01);
        A0r.append(", stickerPackName=");
        A0r.append(this.A04);
        A0r.append(", stickerPackPublisher=");
        A0r.append(this.A05);
        A0r.append(", stickerPackTrayIconTemplateId=");
        A0r.append(this.A07);
        A0r.append(", stickerPackRecentsEmptyIconTemplateId=");
        A0r.append(this.A06);
        A0r.append(", stickerPackFavoritesEmptyIconTemplateId=");
        A0r.append(this.A02);
        A0r.append(", stickers=");
        return AnonymousClass3K2.A0k(this.A08, A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        C18450wi.A0H(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A03);
        parcel.writeString(this.A01);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeString(this.A02);
        parcel.writeTypedList(this.A08);
    }
}
