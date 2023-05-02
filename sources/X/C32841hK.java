package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.profilo.mmapbuf.core.Buffer;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import java.io.File;

/* renamed from: X.1hK  reason: invalid class name and case insensitive filesystem */
public final class C32841hK implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(1);
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public C32771h9 A07;
    public C32861hN A08;
    public Buffer A09;
    public File A0A;
    public Object A0B;
    public Object A0C;
    public String A0D;
    public String A0E;
    public Buffer[] A0F;
    public volatile C32911hU A0G;

    public C32841hK() {
    }

    public C32841hK(C32771h9 r6, C32861hN r7, Buffer buffer, File file, Object obj, String str, Buffer[] bufferArr, int i2, int i3, long j2, long j3) {
        this.A06 = j2;
        this.A0D = str;
        this.A07 = r6;
        this.A01 = i2;
        this.A0C = obj;
        this.A0B = null;
        this.A05 = j3;
        this.A02 = i3;
        this.A03 = 0;
        this.A00 = 0;
        this.A04 = -1;
        this.A08 = r7;
        this.A09 = buffer;
        this.A0F = bufferArr;
        this.A0A = file;
        this.A0E = "main";
    }

    public C32841hK(C32841hK r19, int i2) {
        C32841hK r1 = r19;
        long j2 = r1.A06;
        String str = r1.A0D;
        C32771h9 r16 = r1.A07;
        int i3 = r1.A01;
        Object obj = r1.A0C;
        Object obj2 = r1.A0B;
        long j3 = r1.A05;
        int i4 = r1.A02;
        int i5 = r1.A03;
        int i6 = r1.A04;
        C32861hN r9 = r1.A08;
        Buffer buffer = r1.A09;
        Buffer[] bufferArr = r1.A0F;
        File file = r1.A0A;
        String str2 = r1.A0E;
        this.A06 = j2;
        this.A0D = str;
        this.A07 = r16;
        this.A01 = i3;
        this.A0C = obj;
        this.A0B = obj2;
        this.A05 = j3;
        this.A02 = i4;
        this.A03 = i5;
        this.A00 = i2;
        this.A04 = i6;
        this.A08 = r9;
        this.A09 = buffer;
        this.A0F = bufferArr;
        this.A0A = file;
        this.A0E = str2;
    }

    public C32841hK(Parcel parcel) {
        this.A06 = parcel.readLong();
        this.A0D = parcel.readString();
        this.A01 = parcel.readInt();
        this.A0C = null;
        this.A0B = null;
        this.A05 = parcel.readLong();
        this.A02 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A04 = parcel.readInt();
        this.A08 = (C32861hN) C32861hN.CREATOR.createFromParcel(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.A06);
        parcel.writeString(this.A0D);
        parcel.writeInt(this.A01);
        parcel.writeLong(this.A05);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A04);
        this.A08.writeToParcel(parcel, i2);
    }
}
