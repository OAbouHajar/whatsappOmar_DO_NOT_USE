package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.4pb  reason: invalid class name and case insensitive filesystem */
public final class C97224pb implements C35731mP {
    public static final C32491gT A06;
    public static final C32491gT A07;
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(4);
    public int A00;
    public final long A01;
    public final long A02;
    public final String A03;
    public final String A04;
    public final byte[] A05;

    static {
        C32471gR A0N = AnonymousClass3K4.A0N();
        A0N.A0R = "application/id3";
        A06 = new C32491gT(A0N);
        C32471gR A0N2 = AnonymousClass3K4.A0N();
        A0N2.A0R = "application/x-scte35";
        A07 = new C32491gT(A0N2);
    }

    public C97224pb(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A01 = parcel.readLong();
        this.A02 = parcel.readLong();
        this.A05 = parcel.createByteArray();
    }

    public C97224pb(String str, String str2, byte[] bArr, long j2, long j3) {
        this.A03 = str;
        this.A04 = str2;
        this.A01 = j2;
        this.A02 = j3;
        this.A05 = bArr;
    }

    public byte[] AHA() {
        if (AHB() != null) {
            return this.A05;
        }
        return null;
    }

    public C32491gT AHB() {
        String str;
        String str2 = this.A03;
        switch (str2.hashCode()) {
            case -1468477611:
                if (str2.equals("urn:scte:scte35:2014:bin")) {
                    return A07;
                }
                return null;
            case -795945609:
                str = "https://aomedia.org/emsg/ID3";
                break;
            case 1303648457:
                str = "https://developer.apple.com/streaming/emsg-id3";
                break;
            default:
                return null;
        }
        if (str2.equals(str)) {
            return A06;
        }
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C97224pb.class != obj.getClass()) {
                return false;
            }
            C97224pb r7 = (C97224pb) obj;
            if (this.A01 != r7.A01 || this.A02 != r7.A02 || !AnonymousClass3C1.A0F(this.A03, r7.A03) || !AnonymousClass3C1.A0F(this.A04, r7.A04) || !Arrays.equals(this.A05, r7.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i2 = this.A00;
        if (i2 != 0) {
            return i2;
        }
        int i3 = 0;
        int A0I = (527 + AnonymousClass3K3.A0I(this.A03)) * 31;
        String str = this.A04;
        if (str != null) {
            i3 = str.hashCode();
        }
        int A0B = AnonymousClass3K4.A0B(this.A05, AnonymousClass3K3.A0E(AnonymousClass3K3.A0E((A0I + i3) * 31, this.A01), this.A02));
        this.A00 = A0B;
        return A0B;
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("EMSG: scheme=");
        A0r.append(this.A03);
        A0r.append(", id=");
        A0r.append(this.A02);
        A0r.append(", durationMs=");
        A0r.append(this.A01);
        A0r.append(", value=");
        return AnonymousClass000.A0h(this.A04, A0r);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A02);
        parcel.writeByteArray(this.A05);
    }
}
