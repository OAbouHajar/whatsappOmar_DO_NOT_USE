package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1mO  reason: invalid class name and case insensitive filesystem */
public final class C35721mO implements C35731mP {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(3);
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public C35721mO(Parcel parcel) {
        this.A00 = parcel.readInt();
        this.A02 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = parcel.readInt() != 0;
        this.A01 = parcel.readInt();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r6 > 0) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35721mO(java.lang.String r2, java.lang.String r3, java.lang.String r4, int r5, int r6, boolean r7) {
        /*
            r1 = this;
            r1.<init>()
            r0 = -1
            if (r6 == r0) goto L_0x0009
            r0 = 0
            if (r6 <= 0) goto L_0x000a
        L_0x0009:
            r0 = 1
        L_0x000a:
            X.C90524eJ.A03(r0)
            r1.A00 = r5
            r1.A02 = r2
            r1.A03 = r3
            r1.A04 = r4
            r1.A05 = r7
            r1.A01 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35721mO.<init>(java.lang.String, java.lang.String, java.lang.String, int, int, boolean):void");
    }

    public /* synthetic */ byte[] AHA() {
        return null;
    }

    public /* synthetic */ C32491gT AHB() {
        return null;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C35721mO.class != obj.getClass()) {
                return false;
            }
            C35721mO r5 = (C35721mO) obj;
            if (this.A00 != r5.A00 || !AnonymousClass3C1.A0F(this.A02, r5.A02) || !AnonymousClass3C1.A0F(this.A03, r5.A03) || !AnonymousClass3C1.A0F(this.A04, r5.A04) || this.A05 != r5.A05 || this.A01 != r5.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i2 = (527 + this.A00) * 31;
        String str = this.A02;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.A03;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.A04;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return ((((hashCode2 + i3) * 31) + (this.A05 ? 1 : 0)) * 31) + this.A01;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IcyHeaders: name=\"");
        sb.append(this.A03);
        sb.append("\", genre=\"");
        sb.append(this.A02);
        sb.append("\", bitrate=");
        sb.append(this.A00);
        sb.append(", metadataInterval=");
        sb.append(this.A01);
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.A00);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A01);
    }
}
