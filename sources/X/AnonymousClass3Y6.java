package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3Y6  reason: invalid class name */
public class AnonymousClass3Y6 extends C15710ri {
    public static final AnonymousClass3Y6 A08;
    public static final byte[][] A09;
    public static final Parcelable.Creator CREATOR = new C92734i3();
    public final String A00;
    public final byte[] A01;
    public final int[] A02;
    public final byte[][] A03;
    public final byte[][] A04;
    public final byte[][] A05;
    public final byte[][] A06;
    public final byte[][] A07;

    static {
        byte[][] bArr = new byte[0][];
        A09 = bArr;
        A08 = new AnonymousClass3Y6("", (byte[]) null, (int[]) null, bArr, bArr, bArr, bArr, (byte[][]) null);
    }

    public AnonymousClass3Y6(String str, byte[] bArr, int[] iArr, byte[][] bArr2, byte[][] bArr3, byte[][] bArr4, byte[][] bArr5, byte[][] bArr6) {
        this.A00 = str;
        this.A01 = bArr;
        this.A03 = bArr2;
        this.A04 = bArr3;
        this.A05 = bArr4;
        this.A06 = bArr5;
        this.A02 = iArr;
        this.A07 = bArr6;
    }

    public static List A03(byte[][] bArr) {
        if (bArr == null) {
            return Collections.emptyList();
        }
        ArrayList A0i = C13690nt.A0i(r4);
        for (byte[] encodeToString : bArr) {
            A0i.add(Base64.encodeToString(encodeToString, 3));
        }
        Collections.sort(A0i);
        return A0i;
    }

    public static void A04(String str, StringBuilder sb, byte[][] bArr) {
        String str2;
        sb.append(str);
        sb.append("=");
        if (bArr == null) {
            str2 = "null";
        } else {
            sb.append("(");
            int length = bArr.length;
            boolean z2 = true;
            int i2 = 0;
            while (i2 < length) {
                byte[] bArr2 = bArr[i2];
                if (!z2) {
                    sb.append(", ");
                }
                sb.append("'");
                sb.append(Base64.encodeToString(bArr2, 3));
                sb.append("'");
                i2++;
                z2 = false;
            }
            str2 = ")";
        }
        sb.append(str2);
    }

    public static boolean A05(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public boolean equals(Object obj) {
        List list;
        List list2;
        if (obj instanceof AnonymousClass3Y6) {
            AnonymousClass3Y6 r8 = (AnonymousClass3Y6) obj;
            if (A05(this.A00, r8.A00) && Arrays.equals(this.A01, r8.A01) && A05(A03(this.A03), A03(r8.A03)) && A05(A03(this.A04), A03(r8.A04)) && A05(A03(this.A05), A03(r8.A05)) && A05(A03(this.A06), A03(r8.A06))) {
                int[] iArr = this.A02;
                if (iArr == null) {
                    list = Collections.emptyList();
                } else {
                    ArrayList A0i = C13690nt.A0i(r2);
                    for (int A1O : iArr) {
                        C13690nt.A1O(A0i, A1O);
                    }
                    Collections.sort(A0i);
                    list = A0i;
                }
                int[] iArr2 = r8.A02;
                if (iArr2 == null) {
                    list2 = Collections.emptyList();
                } else {
                    ArrayList A0i2 = C13690nt.A0i(r2);
                    for (int A1O2 : iArr2) {
                        C13690nt.A1O(A0i2, A1O2);
                    }
                    Collections.sort(A0i2);
                    list2 = A0i2;
                }
                return A05(list, list2) && A05(A03(this.A07), A03(r8.A07));
            }
        }
    }

    public String toString() {
        String A0h;
        StringBuilder A0r = AnonymousClass000.A0r("ExperimentTokens");
        A0r.append("(");
        String str = this.A00;
        if (str == null) {
            A0h = "null";
        } else {
            StringBuilder A0g = C13690nt.A0g(C13680ns.A06(str) + 2);
            A0g.append("'");
            A0g.append(str);
            A0h = AnonymousClass000.A0h("'", A0g);
        }
        A0r.append(A0h);
        A0r.append(", ");
        byte[] bArr = this.A01;
        A0r.append("direct");
        A0r.append("=");
        if (bArr == null) {
            A0r.append("null");
        } else {
            A0r.append("'");
            A0r.append(Base64.encodeToString(bArr, 3));
            A0r.append("'");
        }
        A0r.append(", ");
        A04("GAIA", A0r, this.A03);
        A0r.append(", ");
        A04("PSEUDO", A0r, this.A04);
        A0r.append(", ");
        A04("ALWAYS", A0r, this.A05);
        A0r.append(", ");
        A04("OTHER", A0r, this.A06);
        A0r.append(", ");
        int[] iArr = this.A02;
        A0r.append("weak");
        A0r.append("=");
        if (iArr == null) {
            A0r.append("null");
        } else {
            A0r.append("(");
            int length = iArr.length;
            boolean z2 = true;
            int i2 = 0;
            while (i2 < length) {
                int i3 = iArr[i2];
                if (!z2) {
                    A0r.append(", ");
                }
                A0r.append(i3);
                i2++;
                z2 = false;
            }
            A0r.append(")");
        }
        A0r.append(", ");
        A04("directs", A0r, this.A07);
        return AnonymousClass000.A0h(")", A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A0D(parcel, this.A01, 3, AnonymousClass3K3.A1R(parcel, this.A00));
        C32251fv.A0F(parcel, this.A03, 4);
        C32251fv.A0F(parcel, this.A04, 5);
        C32251fv.A0F(parcel, this.A05, 6);
        C32251fv.A0F(parcel, this.A06, 7);
        AnonymousClass3K3.A13(parcel, this.A02, 8);
        C32251fv.A0F(parcel, this.A07, 9);
        C32251fv.A05(parcel, A002);
    }
}
