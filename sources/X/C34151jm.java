package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import java.util.ArrayList;

/* renamed from: X.1jm  reason: invalid class name and case insensitive filesystem */
public class C34151jm implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(102);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AnonymousClass1XO A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;

    public C34151jm() {
    }

    public C34151jm(Parcel parcel) {
        if (parcel != null) {
            this.A0D = parcel.readString();
            this.A08 = parcel.readString();
            this.A0B = parcel.readString();
            this.A0C = parcel.readString();
            this.A02 = parcel.readInt();
            this.A03 = parcel.readInt();
            this.A0F = parcel.readString();
            this.A09 = parcel.readString();
            this.A00 = parcel.readInt();
            this.A0G = parcel.readString();
            this.A06 = parcel.readString();
            this.A07 = parcel.readString();
            boolean z2 = false;
            this.A0I = parcel.readInt() == 1;
            this.A0A = parcel.readString();
            this.A0H = parcel.readInt() == 1 ? true : z2;
            this.A05 = parcel.readString();
        }
    }

    /* renamed from: A00 */
    public C34151jm clone() {
        C34151jm r1 = new C34151jm();
        r1.A0D = this.A0D;
        String str = this.A09;
        if (str != null) {
            int i2 = this.A01;
            r1.A09 = str;
            r1.A01 = i2;
        }
        r1.A0G = this.A0G;
        r1.A08 = this.A08;
        r1.A06 = this.A06;
        r1.A0C = this.A0C;
        r1.A0B = this.A0B;
        r1.A00 = this.A00;
        r1.A03 = this.A03;
        r1.A02 = this.A02;
        r1.A04 = this.A04;
        r1.A07 = this.A07;
        r1.A0I = this.A0I;
        r1.A0A = this.A0A;
        r1.A0H = this.A0H;
        r1.A05 = this.A05;
        return r1;
    }

    public void A01(C37781pj[] r5) {
        ArrayList arrayList = new ArrayList(r3);
        for (C37781pj obj : r5) {
            arrayList.add(obj.toString());
        }
        this.A07 = TextUtils.join(" ", arrayList);
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("Sticker{");
        stringBuffer.append(", mimeType='");
        stringBuffer.append(this.A0C);
        stringBuffer.append('\'');
        stringBuffer.append(", height=");
        stringBuffer.append(this.A02);
        stringBuffer.append(", width=");
        stringBuffer.append(this.A03);
        stringBuffer.append(", metadata=");
        stringBuffer.append(this.A04);
        stringBuffer.append(", saltedFileHash='");
        stringBuffer.append(this.A0E);
        stringBuffer.append('\'');
        stringBuffer.append(", fileSize=");
        stringBuffer.append(this.A00);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A0D);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeString(this.A0A);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeString(this.A05);
    }
}
