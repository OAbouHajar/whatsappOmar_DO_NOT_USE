package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.3Y3  reason: invalid class name */
public final class AnonymousClass3Y3 extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92334hO();
    public AnonymousClass3Y4 A00;
    public boolean A01;
    public byte[] A02;
    public int[] A03;
    public int[] A04;
    public AnonymousClass3Y6[] A05;
    public String[] A06;
    public byte[][] A07;
    public final C66373Zc A08;

    public AnonymousClass3Y3(AnonymousClass3Y4 r2, byte[] bArr, int[] iArr, int[] iArr2, AnonymousClass3Y6[] r6, String[] strArr, byte[][] bArr2, boolean z2) {
        this.A00 = r2;
        this.A02 = bArr;
        this.A03 = iArr;
        this.A06 = strArr;
        this.A08 = null;
        this.A04 = iArr2;
        this.A07 = bArr2;
        this.A05 = r6;
        this.A01 = z2;
    }

    public AnonymousClass3Y3(C66373Zc r3, AnonymousClass3Y4 r4) {
        this.A00 = r4;
        this.A08 = r3;
        this.A03 = null;
        this.A06 = null;
        this.A04 = null;
        this.A07 = null;
        this.A05 = null;
        this.A01 = true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3Y3) {
                AnonymousClass3Y3 r5 = (AnonymousClass3Y3) obj;
                if (!AnonymousClass45A.A00(this.A00, r5.A00) || !Arrays.equals(this.A02, r5.A02) || !Arrays.equals(this.A03, r5.A03) || !Arrays.equals(this.A06, r5.A06) || !AnonymousClass45A.A00(this.A08, r5.A08) || !Arrays.equals(this.A04, r5.A04) || !Arrays.deepEquals(this.A07, r5.A07) || !Arrays.equals(this.A05, r5.A05) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[11];
        objArr[0] = this.A00;
        objArr[1] = this.A02;
        objArr[2] = this.A03;
        objArr[3] = this.A06;
        objArr[4] = this.A08;
        objArr[5] = null;
        objArr[6] = null;
        objArr[7] = this.A04;
        objArr[8] = this.A07;
        objArr[9] = this.A05;
        return AnonymousClass000.A0F(Boolean.valueOf(this.A01), objArr, 10);
    }

    public final String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("LogEventParcelable[");
        A0r.append(this.A00);
        A0r.append(", LogEventBytes: ");
        byte[] bArr = this.A02;
        A0r.append(bArr == null ? null : new String(bArr));
        A0r.append(", TestCodes: ");
        A0r.append(Arrays.toString(this.A03));
        A0r.append(", MendelPackages: ");
        A0r.append(Arrays.toString(this.A06));
        A0r.append(", LogEvent: ");
        A0r.append(this.A08);
        A0r.append(", ExtensionProducer: ");
        A0r.append((Object) null);
        A0r.append(", VeProducer: ");
        A0r.append((Object) null);
        A0r.append(", ExperimentIDs: ");
        A0r.append(Arrays.toString(this.A04));
        A0r.append(", ExperimentTokens: ");
        A0r.append(Arrays.toString(this.A07));
        A0r.append(", ExperimentTokensParcelables: ");
        A0r.append(Arrays.toString(this.A05));
        A0r.append(", AddPhenotypeExperimentTokens: ");
        A0r.append(this.A01);
        return AnonymousClass000.A0h("]", A0r);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A09(parcel, this.A00, 2, i2, false);
        C32251fv.A0D(parcel, this.A02, 3, false);
        AnonymousClass3K3.A13(parcel, this.A03, 4);
        String[] strArr = this.A06;
        if (strArr != null) {
            int A012 = C32251fv.A01(parcel, 5);
            parcel.writeStringArray(strArr);
            C32251fv.A05(parcel, A012);
        }
        AnonymousClass3K3.A13(parcel, this.A04, 6);
        C32251fv.A0F(parcel, this.A07, 7);
        C32251fv.A08(parcel, 8, this.A01);
        C32251fv.A0E(parcel, this.A05, 9, i2);
        C32251fv.A05(parcel, A002);
    }
}
