package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import java.io.File;
import java.util.Arrays;

/* renamed from: X.1lo  reason: invalid class name and case insensitive filesystem */
public class C35361lo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(44);
    public long A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public boolean A07;
    public byte[] A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final long A0E;
    public final String A0F;
    public final String A0G;

    public C35361lo(Parcel parcel) {
        String readString = parcel.readString();
        AnonymousClass00B.A06(readString);
        this.A0F = readString;
        this.A0E = parcel.readLong();
        this.A0D = parcel.readInt();
        this.A09 = parcel.readInt();
        String readString2 = parcel.readString();
        AnonymousClass00B.A06(readString2);
        this.A0G = readString2;
        this.A0A = parcel.readInt();
        this.A0C = parcel.readInt();
        this.A0B = parcel.readInt();
        this.A05 = parcel.readString();
        this.A01 = parcel.readString();
        this.A06 = parcel.readString();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            byte[] bArr = new byte[readInt];
            this.A08 = bArr;
            parcel.readByteArray(bArr);
        }
        this.A00 = parcel.readLong();
        this.A04 = parcel.readString();
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        this.A07 = parcel.readInt() != 1 ? false : true;
    }

    public C35361lo(String str, String str2, String str3, String str4, String str5, int i2, int i3, int i4, int i5, int i6, long j2) {
        this.A0F = str;
        this.A0E = j2;
        this.A0D = i2;
        this.A09 = i3;
        this.A0G = str2;
        this.A0A = i4;
        this.A0C = i5;
        this.A0B = i6;
        this.A05 = str3;
        this.A01 = str4;
        this.A06 = str5;
    }

    public static C35361lo A00(C58932uO r20, boolean z2) {
        C58932uO r5 = r20;
        String str = r5.A09;
        long j2 = r5.A07;
        int i2 = r5.A06;
        int i3 = r5.A01;
        C35361lo r8 = new C35361lo(str, r5.A0A, (String) null, (String) null, (String) null, i2, i3, r5.A02, r5.A04, r5.A03, j2);
        if (z2) {
            C58832uD r7 = r5.A08;
            if (r7 == null) {
                r7 = C58832uD.A06;
            }
            if ((r7.A00 & 1) == 1) {
                byte[] A042 = r7.A04.A04();
                long j3 = r7.A01;
                String encodeToString = Base64.encodeToString(r7.A03.A04(), 2);
                String encodeToString2 = Base64.encodeToString(r7.A02.A04(), 2);
                String str2 = r7.A05;
                r8.A08 = A042;
                r8.A00 = j3;
                r8.A04 = encodeToString;
                r8.A03 = encodeToString2;
                r8.A02 = str2;
                r8.A07 = true;
            }
        }
        return r8;
    }

    public C58932uO A01() {
        C58832uD r4;
        if (!this.A07 || this.A08 == null) {
            r4 = null;
        } else {
            C28581Wr A0U = C58832uD.A06.A0U();
            byte[] bArr = this.A08;
            C28631Ww A012 = C28631Ww.A01(bArr, 0, bArr.length);
            A0U.A03();
            C58832uD r1 = (C58832uD) A0U.A00;
            r1.A00 |= 1;
            r1.A04 = A012;
            long j2 = this.A00;
            A0U.A03();
            C58832uD r12 = (C58832uD) A0U.A00;
            r12.A00 |= 2;
            r12.A01 = j2;
            String str = this.A02;
            A0U.A03();
            C58832uD r13 = (C58832uD) A0U.A00;
            r13.A00 |= 16;
            r13.A05 = str;
            byte[] decode = Base64.decode(this.A04, 2);
            C28631Ww A013 = C28631Ww.A01(decode, 0, decode.length);
            A0U.A03();
            C58832uD r14 = (C58832uD) A0U.A00;
            r14.A00 |= 4;
            r14.A03 = A013;
            byte[] decode2 = Base64.decode(this.A03, 2);
            C28631Ww A014 = C28631Ww.A01(decode2, 0, decode2.length);
            A0U.A03();
            C58832uD r15 = (C58832uD) A0U.A00;
            r15.A00 |= 8;
            r15.A02 = A014;
            r4 = (C58832uD) A0U.A02();
        }
        C28581Wr A0U2 = C58932uO.A0B.A0U();
        String str2 = this.A0F;
        A0U2.A03();
        C58932uO r16 = (C58932uO) A0U2.A00;
        r16.A00 |= 1;
        r16.A09 = str2;
        long j3 = this.A0E;
        A0U2.A03();
        C58932uO r5 = (C58932uO) A0U2.A00;
        r5.A00 |= 2;
        r5.A07 = j3;
        int i2 = this.A0D;
        A0U2.A03();
        C58932uO r17 = (C58932uO) A0U2.A00;
        r17.A00 |= 4;
        r17.A06 = i2;
        int i3 = this.A09;
        A0U2.A03();
        C58932uO r18 = (C58932uO) A0U2.A00;
        r18.A00 |= 8;
        r18.A01 = i3;
        String str3 = this.A0G;
        A0U2.A03();
        C58932uO r19 = (C58932uO) A0U2.A00;
        r19.A00 |= 16;
        r19.A0A = str3;
        int i4 = this.A0A;
        A0U2.A03();
        C58932uO r110 = (C58932uO) A0U2.A00;
        r110.A00 |= 32;
        r110.A02 = i4;
        int i5 = this.A0C;
        A0U2.A03();
        C58932uO r111 = (C58932uO) A0U2.A00;
        r111.A00 |= 64;
        r111.A04 = i5;
        int i6 = this.A0B;
        A0U2.A03();
        C58932uO r112 = (C58932uO) A0U2.A00;
        r112.A00 |= 128;
        r112.A03 = i6;
        if (r4 != null) {
            A0U2.A03();
            C58932uO r113 = (C58932uO) A0U2.A00;
            r113.A08 = r4;
            r113.A00 |= 256;
        }
        return (C58932uO) A0U2.A02();
    }

    public File A02(File file) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A0F);
        sb.append(".webp");
        return new File(file, sb.toString());
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C35361lo r7 = (C35361lo) obj;
            if (!this.A0F.equals(r7.A0F) || this.A0E != r7.A0E || this.A0D != r7.A0D || this.A09 != r7.A09 || !this.A0G.equals(r7.A0G) || this.A0A != r7.A0A || this.A0C != r7.A0C || this.A0B != r7.A0B || !C34901l3.A00(this.A05, r7.A05) || !C34901l3.A00(this.A01, r7.A01) || !C34901l3.A00(this.A06, r7.A06) || !Arrays.equals(this.A08, r7.A08) || this.A00 != r7.A00 || !C34901l3.A00(this.A04, r7.A04) || !C34901l3.A00(this.A03, r7.A03) || !C34901l3.A00(this.A02, r7.A02) || this.A07 != r7.A07) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A0F, Long.valueOf(this.A0E), Integer.valueOf(this.A0D), Integer.valueOf(this.A09), this.A0G, Integer.valueOf(this.A0A), Integer.valueOf(this.A0C), Integer.valueOf(this.A0B), this.A05, this.A01, this.A06, this.A08, Long.valueOf(this.A00), this.A04, this.A03, this.A02});
    }

    public String toString() {
        return "PaymentBackgroundMetadata{}";
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A0F);
        parcel.writeLong(this.A0E);
        parcel.writeInt(this.A0D);
        parcel.writeInt(this.A09);
        parcel.writeString(this.A0G);
        parcel.writeInt(this.A0A);
        parcel.writeInt(this.A0C);
        parcel.writeInt(this.A0B);
        parcel.writeString(this.A05);
        parcel.writeString(this.A01);
        parcel.writeString(this.A06);
        byte[] bArr = this.A08;
        if (bArr != null) {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(this.A08);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeLong(this.A00);
        parcel.writeString(this.A04);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A07 ? 1 : 0);
    }
}
