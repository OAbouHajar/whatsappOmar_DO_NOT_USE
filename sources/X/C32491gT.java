package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1gT  reason: invalid class name and case insensitive filesystem */
public final class C32491gT implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(2);
    public int A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final int A0H;
    public final int A0I;
    public final long A0J;
    public final AnonymousClass57J A0K;
    public final C93724jf A0L;
    public final C93704jd A0M;
    public final Class A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final List A0U;
    public final byte[] A0V;

    public C32491gT(C32471gR r6) {
        this.A0Q = r6.A0O;
        this.A0R = r6.A0P;
        this.A0S = AnonymousClass3C1.A08(r6.A0Q);
        this.A0G = r6.A0E;
        this.A0D = r6.A0B;
        int i2 = r6.A03;
        this.A04 = i2;
        int i3 = r6.A0A;
        this.A0C = i3;
        this.A05 = i3 != -1 ? i3 : i2;
        this.A0O = r6.A0M;
        this.A0L = r6.A0J;
        this.A0P = r6.A0N;
        this.A0T = r6.A0R;
        this.A0A = r6.A08;
        List list = r6.A0S;
        this.A0U = list == null ? Collections.emptyList() : list;
        AnonymousClass57J r2 = r6.A0I;
        this.A0K = r2;
        this.A0J = r6.A0H;
        this.A0I = r6.A0G;
        this.A09 = r6.A07;
        this.A01 = r6.A00;
        int i4 = r6.A0C;
        int i5 = 0;
        this.A0E = i4 == -1 ? 0 : i4;
        float f2 = r6.A01;
        this.A02 = f2 == -1.0f ? 1.0f : f2;
        this.A0V = r6.A0T;
        this.A0H = r6.A0F;
        this.A0M = r6.A0K;
        this.A06 = r6.A04;
        this.A0F = r6.A0D;
        this.A0B = r6.A09;
        int i6 = r6.A05;
        this.A07 = i6 == -1 ? 0 : i6;
        int i7 = r6.A06;
        this.A08 = i7 != -1 ? i7 : i5;
        this.A03 = r6.A02;
        Class<C96404oH> cls = r6.A0L;
        if (cls == null && r2 != null) {
            cls = C96404oH.class;
        }
        this.A0N = cls;
    }

    public C32491gT(Parcel parcel) {
        this.A0Q = parcel.readString();
        this.A0R = parcel.readString();
        this.A0S = parcel.readString();
        this.A0G = parcel.readInt();
        this.A0D = parcel.readInt();
        int readInt = parcel.readInt();
        this.A04 = readInt;
        int readInt2 = parcel.readInt();
        this.A0C = readInt2;
        this.A05 = readInt2 != -1 ? readInt2 : readInt;
        this.A0O = parcel.readString();
        this.A0L = (C93724jf) parcel.readParcelable(C93724jf.class.getClassLoader());
        this.A0P = parcel.readString();
        this.A0T = parcel.readString();
        this.A0A = parcel.readInt();
        int readInt3 = parcel.readInt();
        this.A0U = new ArrayList(readInt3);
        for (int i2 = 0; i2 < readInt3; i2++) {
            this.A0U.add(parcel.createByteArray());
        }
        AnonymousClass57J r2 = (AnonymousClass57J) parcel.readParcelable(AnonymousClass57J.class.getClassLoader());
        this.A0K = r2;
        this.A0J = parcel.readLong();
        this.A0I = parcel.readInt();
        this.A09 = parcel.readInt();
        this.A01 = parcel.readFloat();
        this.A0E = parcel.readInt();
        this.A02 = parcel.readFloat();
        Class cls = null;
        this.A0V = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.A0H = parcel.readInt();
        this.A0M = (C93704jd) parcel.readParcelable(C93704jd.class.getClassLoader());
        this.A06 = parcel.readInt();
        this.A0F = parcel.readInt();
        this.A0B = parcel.readInt();
        this.A07 = parcel.readInt();
        this.A08 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A0N = r2 != null ? C96404oH.class : cls;
    }

    public boolean A00(C32491gT r7) {
        List list = this.A0U;
        int size = list.size();
        List list2 = r7.A0U;
        if (size == list2.size()) {
            int i2 = 0;
            while (i2 < list.size()) {
                if (Arrays.equals((byte[]) list.get(i2), (byte[]) list2.get(i2))) {
                    i2++;
                }
            }
            return true;
        }
        return false;
    }

    public int describeContents() {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0014, code lost:
        r0 = r7.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r5 = 1
            if (r6 == r7) goto L_0x0107
            r2 = 0
            if (r7 == 0) goto L_0x001a
            java.lang.Class<X.1gT> r1 = X.C32491gT.class
            java.lang.Class r0 = r7.getClass()
            if (r1 != r0) goto L_0x001a
            X.1gT r7 = (X.C32491gT) r7
            int r1 = r6.A00
            if (r1 == 0) goto L_0x001b
            int r0 = r7.A00
            if (r0 == 0) goto L_0x001b
            if (r1 == r0) goto L_0x001b
        L_0x001a:
            return r2
        L_0x001b:
            int r1 = r6.A0G
            int r0 = r7.A0G
            if (r1 != r0) goto L_0x0106
            int r1 = r6.A0D
            int r0 = r7.A0D
            if (r1 != r0) goto L_0x0106
            int r1 = r6.A04
            int r0 = r7.A04
            if (r1 != r0) goto L_0x0106
            int r1 = r6.A0C
            int r0 = r7.A0C
            if (r1 != r0) goto L_0x0106
            int r1 = r6.A0A
            int r0 = r7.A0A
            if (r1 != r0) goto L_0x0106
            long r3 = r6.A0J
            long r1 = r7.A0J
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0106
            int r1 = r6.A0I
            int r0 = r7.A0I
            if (r1 != r0) goto L_0x0106
            int r1 = r6.A09
            int r0 = r7.A09
            if (r1 != r0) goto L_0x0106
            int r1 = r6.A0E
            int r0 = r7.A0E
            if (r1 != r0) goto L_0x0106
            int r1 = r6.A0H
            int r0 = r7.A0H
            if (r1 != r0) goto L_0x0106
            int r1 = r6.A06
            int r0 = r7.A06
            if (r1 != r0) goto L_0x0106
            int r1 = r6.A0F
            int r0 = r7.A0F
            if (r1 != r0) goto L_0x0106
            int r1 = r6.A0B
            int r0 = r7.A0B
            if (r1 != r0) goto L_0x0106
            int r1 = r6.A07
            int r0 = r7.A07
            if (r1 != r0) goto L_0x0106
            int r1 = r6.A08
            int r0 = r7.A08
            if (r1 != r0) goto L_0x0106
            int r1 = r6.A03
            int r0 = r7.A03
            if (r1 != r0) goto L_0x0106
            float r1 = r6.A01
            float r0 = r7.A01
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 != 0) goto L_0x0106
            float r1 = r6.A02
            float r0 = r7.A02
            int r0 = java.lang.Float.compare(r1, r0)
            if (r0 != 0) goto L_0x0106
            java.lang.Class r1 = r6.A0N
            java.lang.Class r0 = r7.A0N
            boolean r0 = X.AnonymousClass3C1.A0F(r1, r0)
            if (r0 == 0) goto L_0x0106
            java.lang.String r1 = r6.A0Q
            java.lang.String r0 = r7.A0Q
            boolean r0 = X.AnonymousClass3C1.A0F(r1, r0)
            if (r0 == 0) goto L_0x0106
            java.lang.String r1 = r6.A0R
            java.lang.String r0 = r7.A0R
            boolean r0 = X.AnonymousClass3C1.A0F(r1, r0)
            if (r0 == 0) goto L_0x0106
            java.lang.String r1 = r6.A0O
            java.lang.String r0 = r7.A0O
            boolean r0 = X.AnonymousClass3C1.A0F(r1, r0)
            if (r0 == 0) goto L_0x0106
            java.lang.String r1 = r6.A0P
            java.lang.String r0 = r7.A0P
            boolean r0 = X.AnonymousClass3C1.A0F(r1, r0)
            if (r0 == 0) goto L_0x0106
            java.lang.String r1 = r6.A0T
            java.lang.String r0 = r7.A0T
            boolean r0 = X.AnonymousClass3C1.A0F(r1, r0)
            if (r0 == 0) goto L_0x0106
            java.lang.String r1 = r6.A0S
            java.lang.String r0 = r7.A0S
            boolean r0 = X.AnonymousClass3C1.A0F(r1, r0)
            if (r0 == 0) goto L_0x0106
            byte[] r1 = r6.A0V
            byte[] r0 = r7.A0V
            boolean r0 = java.util.Arrays.equals(r1, r0)
            if (r0 == 0) goto L_0x0106
            X.4jf r1 = r6.A0L
            X.4jf r0 = r7.A0L
            boolean r0 = X.AnonymousClass3C1.A0F(r1, r0)
            if (r0 == 0) goto L_0x0106
            X.4jd r1 = r6.A0M
            X.4jd r0 = r7.A0M
            boolean r0 = X.AnonymousClass3C1.A0F(r1, r0)
            if (r0 == 0) goto L_0x0106
            X.57J r1 = r6.A0K
            X.57J r0 = r7.A0K
            boolean r0 = X.AnonymousClass3C1.A0F(r1, r0)
            if (r0 == 0) goto L_0x0106
            boolean r0 = r6.A00(r7)
            if (r0 == 0) goto L_0x0106
            return r5
        L_0x0106:
            r5 = 0
        L_0x0107:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32491gT.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        int i2 = this.A00;
        if (i2 != 0) {
            return i2;
        }
        String str = this.A0Q;
        int i3 = 0;
        int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A0R;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.A0S;
        int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.A0G) * 31) + this.A0D) * 31) + this.A04) * 31) + this.A0C) * 31;
        String str4 = this.A0O;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C93724jf r0 = this.A0L;
        int hashCode5 = (hashCode4 + (r0 == null ? 0 : r0.hashCode())) * 31;
        String str5 = this.A0P;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A0T;
        int hashCode7 = (((((((((((((((((((((((((((((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.A0A) * 31) + ((int) this.A0J)) * 31) + this.A0I) * 31) + this.A09) * 31) + Float.floatToIntBits(this.A01)) * 31) + this.A0E) * 31) + Float.floatToIntBits(this.A02)) * 31) + this.A0H) * 31) + this.A06) * 31) + this.A0F) * 31) + this.A0B) * 31) + this.A07) * 31) + this.A08) * 31) + this.A03) * 31;
        Class cls = this.A0N;
        if (cls != null) {
            i3 = cls.hashCode();
        }
        int i4 = hashCode7 + i3;
        this.A00 = i4;
        return i4;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Format(");
        sb.append(this.A0Q);
        sb.append(", ");
        sb.append(this.A0R);
        sb.append(", ");
        sb.append(this.A0P);
        sb.append(", ");
        sb.append(this.A0T);
        sb.append(", ");
        sb.append(this.A0O);
        sb.append(", ");
        sb.append(this.A05);
        sb.append(", ");
        sb.append(this.A0S);
        sb.append(", [");
        sb.append(this.A0I);
        sb.append(", ");
        sb.append(this.A09);
        sb.append(", ");
        sb.append(this.A01);
        sb.append("], [");
        sb.append(this.A06);
        sb.append(", ");
        sb.append(this.A0F);
        sb.append("])");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A0Q);
        parcel.writeString(this.A0R);
        parcel.writeString(this.A0S);
        parcel.writeInt(this.A0G);
        parcel.writeInt(this.A0D);
        parcel.writeInt(this.A04);
        parcel.writeInt(this.A0C);
        parcel.writeString(this.A0O);
        int i3 = 0;
        parcel.writeParcelable(this.A0L, 0);
        parcel.writeString(this.A0P);
        parcel.writeString(this.A0T);
        parcel.writeInt(this.A0A);
        List list = this.A0U;
        int size = list.size();
        parcel.writeInt(size);
        for (int i4 = 0; i4 < size; i4++) {
            parcel.writeByteArray((byte[]) list.get(i4));
        }
        parcel.writeParcelable(this.A0K, 0);
        parcel.writeLong(this.A0J);
        parcel.writeInt(this.A0I);
        parcel.writeInt(this.A09);
        parcel.writeFloat(this.A01);
        parcel.writeInt(this.A0E);
        parcel.writeFloat(this.A02);
        byte[] bArr = this.A0V;
        if (bArr != null) {
            i3 = 1;
        }
        parcel.writeInt(i3);
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.A0H);
        parcel.writeParcelable(this.A0M, i2);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A0F);
        parcel.writeInt(this.A0B);
        parcel.writeInt(this.A07);
        parcel.writeInt(this.A08);
        parcel.writeInt(this.A03);
    }
}
