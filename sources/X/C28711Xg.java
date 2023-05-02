package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.redex.IDxCreatorShape15S0000000_2_I0;

/* renamed from: X.1Xg  reason: invalid class name and case insensitive filesystem */
public class C28711Xg implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new IDxCreatorShape15S0000000_2_I0(27);
    public C28701Xf A00;
    public final String A01;
    public transient C15830rv A02;

    public C28711Xg(C28701Xf r2, C15830rv r3) {
        this.A02 = r3;
        this.A01 = r3.getRawString();
        this.A00 = r2;
    }

    public C28711Xg(Parcel parcel) {
        String readString = parcel.readString();
        AnonymousClass00B.A06(readString);
        this.A01 = readString;
        Parcelable readParcelable = parcel.readParcelable(C28701Xf.class.getClassLoader());
        AnonymousClass00B.A06(readParcelable);
        this.A00 = (C28701Xf) readParcelable;
    }

    /* renamed from: A00 */
    public int compareTo(C28711Xg r7) {
        C28701Xf r5 = r7.A00;
        long j2 = r5.A0G;
        C28701Xf r2 = this.A00;
        int signum = (int) Math.signum((float) (j2 - r2.A0G));
        return signum == 0 ? (int) Math.signum((float) (r5.A06 - r2.A06)) : signum;
    }

    public synchronized C15830rv A01() {
        C15830rv r3;
        r3 = this.A02;
        if (r3 == null) {
            String str = this.A01;
            r3 = C15830rv.A02(str);
            StringBuilder sb = new StringBuilder();
            sb.append("contactRawJid = ");
            sb.append(str);
            AnonymousClass00B.A07(r3, sb.toString());
            this.A02 = r3;
        }
        return r3;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i2);
    }
}
