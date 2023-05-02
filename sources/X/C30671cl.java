package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: X.1cl  reason: invalid class name and case insensitive filesystem */
public abstract class C30671cl implements Parcelable {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04;
    public long A05;
    public long A06;
    public C30681cm A07 = C30681cm.A0F;
    public C39901tF A08;
    public C35301lh A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public byte[] A0D;

    public static int A00(String str) {
        boolean z2;
        int i2 = 2;
        if (!TextUtils.isEmpty(str)) {
            switch (str.hashCode()) {
                case -1211756856:
                    z2 = str.equals("VERIFIED");
                    i2 = 3;
                    break;
                case 35394935:
                    z2 = str.equals("PENDING");
                    i2 = 1;
                    break;
                case 2066319421:
                    z2 = str.equals("FAILED");
                    break;
            }
            if (!z2) {
                return 0;
            }
            return i2;
        }
        return 0;
    }

    public static C30671cl A01(C30681cm r10, String str, String str2, String str3, int i2) {
        C30681cm r3 = r10;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = i2;
        if (i2 != 1) {
            if (i2 == 2) {
                C35521m4 r7 = new C35521m4(r3, 0, 0, -1, -1);
                r7.A0A = str5;
                r7.A09(str6);
                r7.A0B = str4;
                return r7;
            } else if (i2 == 3) {
                C35371lp r72 = new C35371lp(r10, str2, str6, BigDecimal.ZERO, r10.A05, 0, 0);
                r72.A08 = null;
                return r72;
            } else if (!(i2 == 4 || i2 == 6 || i2 == 8)) {
                return null;
            }
        }
        return new C35391lr(r3, str5, str4, str6, i3, 0, 0, 0, 0, C35391lr.A05(str));
    }

    public static String A02(int i2) {
        switch (i2) {
            case 1:
                return "Debit";
            case 2:
                return "Bank Account";
            case 3:
                return "PaymentWallet";
            case 4:
                return "Credit";
            case 5:
                return "Business Account";
            case 6:
                return "Combo";
            case 8:
                return "Prepaid";
            default:
                return null;
        }
    }

    public static List A03(C30681cm r5, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C30671cl r2 = (C30671cl) it.next();
            if (C43041zF.A04(r5.A09, r2.A04())) {
                if (r2.A01 == 2) {
                    arrayList.add(0, r2);
                } else {
                    arrayList.add(r2);
                }
            }
        }
        return arrayList;
    }

    public int A04() {
        if (this instanceof C35371lp) {
            return 3;
        }
        if (this instanceof C35441lw) {
            return 5;
        }
        if (this instanceof C35391lr) {
            return ((C35391lr) this).A00;
        }
        return 2;
    }

    public Bitmap A05() {
        byte[] bArr;
        int A042 = A04();
        if ((A042 == 1 || A042 == 2 || A042 == 3 || A042 == 4 || A042 == 6 || A042 == 7) && (bArr = this.A0D) != null) {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        }
        return null;
    }

    public void A06(int i2) {
        int A042;
        if (i2 != 1 || this.A07.A01 == (A042 = A04())) {
            this.A00 = i2;
            return;
        }
        StringBuilder sb = new StringBuilder("PAY: ");
        sb.append(A042);
        sb.append(" in country cannot be legacy primary account type");
        throw new IllegalArgumentException(sb.toString());
    }

    public void A07(int i2) {
        int A042;
        if (i2 != 1 || this.A07.A00 == (A042 = A04())) {
            this.A01 = i2;
            return;
        }
        StringBuilder sb = new StringBuilder("PAY: ");
        sb.append(A042);
        sb.append(" in country cannot be legacy primary account type");
        throw new IllegalArgumentException(sb.toString());
    }

    public void A08(Parcel parcel) {
        this.A0A = parcel.readString();
        this.A07 = C30681cm.A00(parcel.readString().trim().toUpperCase(Locale.US));
        this.A09 = (C35301lh) parcel.readParcelable(C35301lh.class.getClassLoader());
        this.A0B = parcel.readString();
        this.A0C = parcel.readString();
        this.A04 = parcel.readInt();
        this.A05 = parcel.readLong();
        this.A06 = parcel.readLong();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
        int readInt = parcel.readInt();
        this.A0D = null;
        if (readInt != 0) {
            byte[] bArr = new byte[readInt];
            this.A0D = bArr;
            parcel.readByteArray(bArr);
        }
        this.A08 = null;
        if (parcel.readByte() == 1) {
            this.A08 = (C39901tF) parcel.readParcelable(AnonymousClass1W3.class.getClassLoader());
        }
    }

    public void A09(String str) {
        this.A09 = new C35301lh(new C53852gP(), String.class, str, "bankName");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        r1 = ((X.C30671cl) r4).A0A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r2 = 1
            if (r3 == r4) goto L_0x0019
            boolean r1 = r4 instanceof X.C30671cl
            r0 = 0
            if (r1 != 0) goto L_0x0009
            return r0
        L_0x0009:
            X.1cl r4 = (X.C30671cl) r4
            java.lang.String r1 = r4.A0A
            if (r1 == 0) goto L_0x0018
            java.lang.String r0 = r3.A0A
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0018
            return r2
        L_0x0018:
            r2 = 0
        L_0x0019:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30671cl.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        String str = this.A0A;
        return str == null ? super.hashCode() : str.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("credential-id: ");
        sb.append(this.A0A);
        sb.append(" country: ");
        sb.append(this.A07.A03);
        sb.append(" issuerName: ");
        sb.append(this.A0B);
        sb.append(" payment-mode: ");
        sb.append(this.A01);
        sb.append(" payout-mode: ");
        sb.append(this.A00);
        sb.append(" merchant-credential-id: ");
        sb.append(this.A0C);
        sb.append(" payout-verification-status: ");
        sb.append(this.A04);
        sb.append(" countrydata: ");
        sb.append(this.A08);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A0A);
        parcel.writeString(this.A07.A03);
        parcel.writeParcelable(this.A09, i2);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A04);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A06);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        byte[] bArr = this.A0D;
        parcel.writeInt(bArr == null ? 0 : bArr.length);
        byte[] bArr2 = this.A0D;
        if (bArr2 != null) {
            parcel.writeByteArray(bArr2);
        }
        byte b2 = 0;
        if (this.A08 != null) {
            b2 = 1;
        }
        parcel.writeByte(b2);
        C39901tF r0 = this.A08;
        if (r0 != null) {
            parcel.writeParcelable(r0, 0);
        }
    }
}
