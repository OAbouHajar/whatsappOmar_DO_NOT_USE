package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Base64;
import com.whatsapp.util.Log;

/* renamed from: X.4jX  reason: invalid class name and case insensitive filesystem */
public class C93644jX implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(66);
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;

    public C93644jX(Parcel parcel) {
        this.A00 = parcel.readString();
        this.A04 = parcel.readString();
        this.A02 = parcel.readString();
        this.A01 = parcel.readString();
        this.A03 = parcel.readString();
    }

    public C93644jX(String str, String str2, String str3, String str4) {
        this.A04 = str;
        this.A02 = str2;
        this.A01 = str3;
        this.A03 = str4;
    }

    public byte[] A00() {
        String str = this.A03;
        if (!TextUtils.isEmpty(str)) {
            try {
                return Base64.decode(str, 0);
            } catch (IllegalArgumentException e2) {
                Log.e((Throwable) e2);
            }
        }
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("ShopEntityMetaData{id='");
        char A002 = AnonymousClass3K3.A00(this.A00, A0r);
        A0r.append(", title='");
        A0r.append(this.A04);
        A0r.append(A002);
        A0r.append(", subTitle='");
        A0r.append(this.A02);
        A0r.append(A002);
        A0r.append(", imageUrl='");
        A0r.append(this.A01);
        A0r.append(A002);
        A0r.append(", thumbBase64Encoded='");
        String str = this.A03;
        A0r.append(str == null ? "null" : Integer.valueOf(str.length()));
        A0r.append(A002);
        return AnonymousClass000.A0k(A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
    }
}
