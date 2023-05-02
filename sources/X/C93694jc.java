package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.Date;

/* renamed from: X.4jc  reason: invalid class name and case insensitive filesystem */
public class C93694jc implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(37);
    public final C39651sq A00;
    public final BigDecimal A01;
    public final Date A02;
    public final Date A03;

    public C93694jc(C39651sq r1, BigDecimal bigDecimal, Date date, Date date2) {
        this.A01 = bigDecimal;
        this.A00 = r1;
        this.A03 = date;
        this.A02 = date2;
    }

    public C93694jc(Parcel parcel) {
        this.A01 = (BigDecimal) parcel.readSerializable();
        this.A00 = new C39651sq(parcel.readString());
        this.A03 = (Date) parcel.readSerializable();
        this.A02 = (Date) parcel.readSerializable();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r1 = r3.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A00(java.util.Date r4) {
        /*
            r3 = this;
            java.util.Date r0 = r3.A03
            r2 = 1
            if (r0 == 0) goto L_0x0015
            java.util.Date r1 = r3.A02
            if (r1 == 0) goto L_0x0015
            boolean r0 = r4.after(r0)
            if (r0 == 0) goto L_0x0016
            boolean r0 = r4.before(r1)
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            return r2
        L_0x0016:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93694jc.A00(java.util.Date):boolean");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C93694jc r5 = (C93694jc) obj;
            if (!C34901l3.A00(this.A01, r5.A01) || !C34901l3.A00(this.A00, r5.A00) || !C34901l3.A00(this.A03, r5.A03) || !C34901l3.A00(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A0E = AnonymousClass000.A0E(this.A00, AnonymousClass3K3.A0H(this.A01));
        Date date = this.A03;
        int i2 = 0;
        int hashCode = (A0E + (date != null ? date.hashCode() : 0)) * 31;
        Date date2 = this.A02;
        if (date2 != null) {
            i2 = date2.hashCode();
        }
        return hashCode + i2;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeSerializable(this.A01);
        parcel.writeString(this.A00.A00);
        parcel.writeSerializable(this.A03);
        parcel.writeSerializable(this.A02);
    }
}
