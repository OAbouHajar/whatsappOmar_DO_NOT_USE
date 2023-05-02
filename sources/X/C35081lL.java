package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;
import com.whatsapp.jid.Jid;

/* renamed from: X.1lL  reason: invalid class name and case insensitive filesystem */
public final class C35081lL implements Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(93);
    public final byte A00;
    public final Jid A01;
    public final String A02;
    public final String A03;

    public C35081lL(Parcel parcel) {
        String readString;
        Jid jid;
        this.A02 = parcel.readString();
        byte readByte = parcel.readByte();
        this.A00 = readByte;
        if (readByte == 1) {
            jid = (Jid) parcel.readParcelable(Jid.class.getClassLoader());
            readString = jid.getRawString();
        } else {
            readString = parcel.readString();
            jid = null;
        }
        this.A03 = readString;
        this.A01 = jid;
    }

    public C35081lL(Jid jid, String str) {
        this(jid, str, jid.getRawString(), (byte) 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0012, code lost:
        if (r4.getType() == 8) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35081lL(com.whatsapp.jid.Jid r4, java.lang.String r5, java.lang.String r6, byte r7) {
        /*
            r3 = this;
            r3.<init>()
            if (r4 == 0) goto L_0x002f
            boolean r0 = r4.isProtocolCompliant()
            if (r0 != 0) goto L_0x0014
            int r1 = r4.getType()
            r0 = 8
            r2 = 0
            if (r1 != r0) goto L_0x0015
        L_0x0014:
            r2 = 1
        L_0x0015:
            java.lang.String r0 = "Jid: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = r4.getRawString()
            r1.append(r0)
            java.lang.String r0 = " is not protocol compliant"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            X.AnonymousClass00B.A0C(r0, r2)
        L_0x002f:
            X.AnonymousClass00B.A06(r5)
            r3.A02 = r5
            X.AnonymousClass00B.A06(r6)
            r3.A03 = r6
            r3.A01 = r4
            r3.A00 = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35081lL.<init>(com.whatsapp.jid.Jid, java.lang.String, java.lang.String, byte):void");
    }

    public C35081lL(String str, int i2) {
        this(str, String.valueOf(i2));
    }

    public C35081lL(String str, long j2) {
        this(str, String.valueOf(j2));
    }

    public C35081lL(String str, String str2) {
        this((Jid) null, str, str2, (byte) 0);
    }

    public static C35081lL A00() {
        return new C35081lL((Jid) C34791ks.A00, "to");
    }

    public static void A01(String str, String str2, Object[] objArr) {
        objArr[2] = new C35081lL(str, str2);
    }

    public static void A02(String str, String str2, Object[] objArr, int i2) {
        objArr[i2] = new C35081lL(str, str2);
    }

    public static boolean A03(String str, String str2, Object[] objArr) {
        objArr[0] = new C35081lL(str, str2);
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C35081lL.class != obj.getClass()) {
                return false;
            }
            C35081lL r5 = (C35081lL) obj;
            if (!this.A02.equals(r5.A02) || !this.A03.equals(r5.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((this.A02.hashCode() + 31) * 31) + this.A03.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("KeyValue{key='");
        sb.append(this.A02);
        sb.append('\'');
        sb.append(", value='");
        sb.append(this.A03);
        sb.append('\'');
        sb.append(", type='");
        sb.append(this.A00);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A02);
        byte b2 = this.A00;
        parcel.writeByte(b2);
        if (b2 == 1) {
            parcel.writeParcelable(this.A01, i2);
        } else {
            parcel.writeString(this.A03);
        }
    }
}
