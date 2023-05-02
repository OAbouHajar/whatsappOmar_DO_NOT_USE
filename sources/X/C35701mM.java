package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/* renamed from: X.1mM  reason: invalid class name and case insensitive filesystem */
public class C35701mM implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(5);
    public int A00;
    public C35681mK A01;
    public C93694jc A02;
    public C39651sq A03;
    public String A04;
    public BigDecimal A05;
    public List A06;
    public boolean A07;
    public final long A08;
    public final C93584jR A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final boolean A0F;

    public C35701mM(C93584jR r6, C35681mK r7, C93694jc r8, C39651sq r9, String str, String str2, String str3, String str4, String str5, String str6, BigDecimal bigDecimal, List list, int i2, long j2, boolean z2, boolean z3) {
        List list2 = list;
        this.A0D = str;
        this.A04 = str2;
        BigDecimal bigDecimal2 = bigDecimal;
        if (bigDecimal == null || r9 == null) {
            this.A05 = null;
            this.A03 = null;
        } else {
            this.A05 = bigDecimal2;
            this.A03 = r9;
        }
        this.A0C = str4;
        this.A0E = str5;
        this.A0A = str3;
        this.A0B = str6;
        this.A06 = A02() ? new ArrayList() : list2;
        this.A01 = r7;
        this.A02 = r8;
        this.A0F = z2;
        this.A07 = z3;
        this.A00 = i2;
        this.A09 = r6;
        long j3 = j2;
        if (j2 < 0) {
            this.A08 = 99;
        } else {
            this.A08 = j3;
        }
    }

    public C35701mM(Parcel parcel) {
        this.A0D = parcel.readString();
        this.A04 = parcel.readString();
        this.A0A = parcel.readString();
        String readString = parcel.readString();
        C39651sq r2 = null;
        this.A05 = TextUtils.isEmpty(readString) ? null : new BigDecimal(readString);
        String readString2 = parcel.readString();
        this.A03 = !TextUtils.isEmpty(readString2) ? new C39651sq(readString2) : r2;
        this.A0C = parcel.readString();
        this.A0E = parcel.readString();
        this.A06 = parcel.createTypedArrayList(C35691mL.CREATOR);
        this.A01 = (C35681mK) parcel.readParcelable(C35681mK.class.getClassLoader());
        this.A02 = (C93694jc) parcel.readParcelable(C93694jc.class.getClassLoader());
        this.A0B = parcel.readString();
        boolean z2 = true;
        this.A0F = parcel.readByte() != 0;
        this.A07 = parcel.readByte() == 0 ? false : z2;
        this.A00 = parcel.readInt();
        this.A09 = (C93584jR) parcel.readParcelable(C93584jR.class.getClassLoader());
        this.A08 = parcel.readLong();
    }

    public void A00(C38891ra r4) {
        r4.A06 = this.A0D;
        r4.A09 = this.A04;
        r4.A04 = this.A0A;
        C39651sq r0 = this.A03;
        if (r0 != null) {
            r4.A03 = r0.A00;
            BigDecimal bigDecimal = this.A05;
            r4.A0A = bigDecimal;
            C93694jc r1 = this.A02;
            if (r1 != null) {
                Date date = new Date();
                if (bigDecimal == null) {
                    bigDecimal = null;
                } else if (r1.A00(date)) {
                    bigDecimal = r1.A01;
                }
                r4.A0B = bigDecimal;
            }
        }
        r4.A08 = this.A0E;
        r4.A07 = this.A0C;
        r4.A00 = this.A06.size();
    }

    public boolean A01() {
        C35681mK r0 = this.A01;
        return (r0 == null || r0.A00 == 0) && !A02() && !this.A07;
    }

    public boolean A02() {
        String str = this.A0B;
        return "FETCH_FAILED".equals(str) || "PARTIAL_FETCH".equals(str);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C35701mM) {
                C35701mM r8 = (C35701mM) obj;
                if (AnonymousClass1ZW.A0F(this.A0D, r8.A0D) && AnonymousClass1ZW.A0F(this.A04, r8.A04) && AnonymousClass1ZW.A0F(this.A0A, r8.A0A) && C34901l3.A00(this.A03, r8.A03) && C34901l3.A00(this.A05, r8.A05) && this.A08 == r8.A08 && AnonymousClass1ZW.A0F(this.A0C, r8.A0C) && AnonymousClass1ZW.A0F(this.A0E, r8.A0E) && C34901l3.A00(this.A01, r8.A01) && C34901l3.A00(this.A02, r8.A02)) {
                    List list = this.A06;
                    int size = list.size();
                    List list2 = r8.A06;
                    if (size == list2.size()) {
                        if (list != list2) {
                            int i2 = 0;
                            while (true) {
                                if (i2 < list.size()) {
                                    if (!list.get(i2).equals(list2.get(i2))) {
                                        break;
                                    }
                                    i2++;
                                } else {
                                    break;
                                }
                            }
                        }
                        if (!(this.A0F == r8.A0F && this.A07 == r8.A07 && this.A00 == r8.A00 && C34901l3.A00(this.A09, r8.A09))) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A0D, this.A04, this.A0A, this.A05, this.A03, this.A0C, this.A0E, this.A06, this.A01, this.A02, Long.valueOf(this.A08), Boolean.valueOf(this.A07), Integer.valueOf(this.A00), this.A09});
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A0D);
        parcel.writeString(this.A04);
        parcel.writeString(this.A0A);
        BigDecimal bigDecimal = this.A05;
        String str = null;
        parcel.writeString(bigDecimal == null ? null : bigDecimal.toString());
        C39651sq r0 = this.A03;
        if (r0 != null) {
            str = r0.A00;
        }
        parcel.writeString(str);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0E);
        parcel.writeTypedList(this.A06);
        parcel.writeParcelable(this.A01, i2);
        parcel.writeParcelable(this.A02, i2);
        parcel.writeString(this.A0B);
        parcel.writeByte(this.A0F ? (byte) 1 : 0);
        parcel.writeByte(this.A07 ? (byte) 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A09, i2);
        parcel.writeLong(this.A08);
    }
}
