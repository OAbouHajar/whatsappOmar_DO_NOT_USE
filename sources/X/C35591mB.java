package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1mB  reason: invalid class name and case insensitive filesystem */
public class C35591mB implements Parcelable {
    public static final C35591mB A04 = new C35591mB((Double) null, (Double) null, (String) null, (String) null);
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(19);
    public final Double A00;
    public final Double A01;
    public final String A02;
    public final String A03;

    public C35591mB(Parcel parcel) {
        String readString = parcel.readString();
        AnonymousClass00B.A06(readString);
        this.A02 = readString;
        String readString2 = parcel.readString();
        AnonymousClass00B.A06(readString2);
        this.A03 = readString2;
        if (parcel.readByte() == 0) {
            this.A00 = null;
        } else {
            this.A00 = Double.valueOf(parcel.readDouble());
        }
        if (parcel.readByte() == 0) {
            this.A01 = null;
        } else {
            this.A01 = Double.valueOf(parcel.readDouble());
        }
    }

    public C35591mB(Double d2, Double d3, String str, String str2) {
        this.A02 = str == null ? "" : str;
        this.A03 = str2 == null ? "" : str2;
        this.A00 = d2;
        this.A01 = d3;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (r1.equals(r0) == false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0044
            r2 = 0
            if (r5 == 0) goto L_0x0032
            java.lang.Class r1 = r4.getClass()
            java.lang.Class r0 = r5.getClass()
            if (r1 != r0) goto L_0x0032
            X.1mB r5 = (X.C35591mB) r5
            java.lang.String r1 = r4.A02
            java.lang.String r0 = r5.A02
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0032
            java.lang.String r1 = r4.A03
            java.lang.String r0 = r5.A03
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0032
            java.lang.Double r1 = r4.A00
            java.lang.Double r0 = r5.A00
            if (r1 == 0) goto L_0x0033
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0036
        L_0x0032:
            return r2
        L_0x0033:
            if (r0 == 0) goto L_0x0036
            return r2
        L_0x0036:
            java.lang.Double r1 = r4.A01
            java.lang.Double r0 = r5.A01
            if (r1 == 0) goto L_0x0041
            boolean r3 = r1.equals(r0)
            return r3
        L_0x0041:
            if (r0 == 0) goto L_0x0044
            r3 = 0
        L_0x0044:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35591mB.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int hashCode = ((this.A02.hashCode() * 31) + this.A03.hashCode()) * 31;
        Double d2 = this.A00;
        int i2 = 0;
        int hashCode2 = (hashCode + (d2 != null ? d2.hashCode() : 0)) * 31;
        Double d3 = this.A01;
        if (d3 != null) {
            i2 = d3.hashCode();
        }
        return hashCode2 + i2;
    }

    public String toString() {
        Object[] objArr = new Object[4];
        objArr[0] = this.A02;
        objArr[1] = this.A03;
        Object obj = this.A00;
        Object obj2 = "";
        if (obj == null) {
            obj = obj2;
        }
        objArr[2] = obj;
        Double d2 = this.A01;
        if (d2 != null) {
            obj2 = d2;
        }
        objArr[3] = obj2;
        return String.format("%s, %s, %s, %s", objArr);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        Double d2 = this.A00;
        if (d2 == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeDouble(d2.doubleValue());
        }
        Double d3 = this.A01;
        if (d3 == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        parcel.writeDouble(d3.doubleValue());
    }
}
