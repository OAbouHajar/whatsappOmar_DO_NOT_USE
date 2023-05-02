package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1ju  reason: invalid class name and case insensitive filesystem */
public class C34221ju implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(16);
    public final int A00;
    public final int A01;
    public final Integer A02;
    public final Integer A03;

    public C34221ju(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
        if (parcel.readByte() == 0) {
            this.A03 = null;
        } else {
            this.A03 = Integer.valueOf(parcel.readInt());
        }
        if (parcel.readByte() == 0) {
            this.A02 = null;
        } else {
            this.A02 = Integer.valueOf(parcel.readInt());
        }
    }

    public C34221ju(Integer num, Integer num2, int i2, int i3) {
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = num;
        this.A02 = num2;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof X.C34221ju
            r2 = 0
            if (r0 == 0) goto L_0x0024
            X.1ju r4 = (X.C34221ju) r4
            int r1 = r3.A00
            int r0 = r4.A00
            if (r1 != r0) goto L_0x0024
            int r1 = r3.A01
            int r0 = r4.A01
            if (r1 != r0) goto L_0x0024
            java.lang.Integer r1 = r3.A03
            java.lang.Integer r0 = r4.A03
            if (r1 != 0) goto L_0x002c
            if (r0 != 0) goto L_0x0024
        L_0x001b:
            java.lang.Integer r1 = r3.A02
            java.lang.Integer r0 = r4.A02
            if (r1 != 0) goto L_0x0025
            if (r0 != 0) goto L_0x0024
        L_0x0023:
            r2 = 1
        L_0x0024:
            return r2
        L_0x0025:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0024
            goto L_0x0023
        L_0x002c:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0024
            goto L_0x001b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34221ju.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i2 = ((this.A00 * 31) + this.A01) * 31;
        Integer num = this.A03;
        int i3 = 0;
        int hashCode = (i2 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.A02;
        if (num2 != null) {
            i3 = num2.hashCode();
        }
        return hashCode + i3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("dayOfWeek: ");
        sb.append(this.A00);
        sb.append(", mode: ");
        sb.append(this.A01);
        sb.append(", openTime: ");
        sb.append(this.A03);
        sb.append(", closeTime: ");
        sb.append(this.A02);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
        Integer num = this.A03;
        if (num == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.A02;
        if (num2 == null) {
            parcel.writeByte((byte) 0);
            return;
        }
        parcel.writeByte((byte) 1);
        parcel.writeInt(num2.intValue());
    }
}
