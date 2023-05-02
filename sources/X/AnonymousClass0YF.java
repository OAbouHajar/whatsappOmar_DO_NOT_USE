package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0YF  reason: invalid class name */
public final class AnonymousClass0YF implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass000.A0S(18);
    public Bundle A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Bundle A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public AnonymousClass0YF(AnonymousClass01A r2) {
        this.A05 = AnonymousClass000.A0d(r2);
        this.A07 = r2.A0T;
        this.A09 = r2.A0Y;
        this.A02 = r2.A02;
        this.A01 = r2.A01;
        this.A06 = r2.A0R;
        this.A0C = r2.A0i;
        this.A0B = r2.A0g;
        this.A08 = r2.A0X;
        this.A04 = r2.A05;
        this.A0A = r2.A0a;
        this.A03 = r2.A0J.ordinal();
    }

    public AnonymousClass0YF(Parcel parcel) {
        this.A05 = parcel.readString();
        this.A07 = parcel.readString();
        boolean z2 = true;
        this.A09 = AnonymousClass000.A1O(parcel.readInt());
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A06 = parcel.readString();
        this.A0C = AnonymousClass000.A1O(parcel.readInt());
        this.A0B = AnonymousClass000.A1O(parcel.readInt());
        this.A08 = AnonymousClass000.A1O(parcel.readInt());
        this.A04 = parcel.readBundle();
        this.A0A = parcel.readInt() == 0 ? false : z2;
        this.A00 = parcel.readBundle();
        this.A03 = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.A05);
        sb.append(" (");
        sb.append(this.A07);
        sb.append(")}:");
        if (this.A09) {
            sb.append(" fromLayout");
        }
        int i2 = this.A01;
        if (i2 != 0) {
            sb.append(" id=0x");
            AnonymousClass000.A1J(sb, i2);
        }
        String str = this.A06;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.A0C) {
            sb.append(" retainInstance");
        }
        if (this.A0B) {
            sb.append(" removing");
        }
        if (this.A08) {
            sb.append(" detached");
        }
        if (this.A0A) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A08 ? 1 : 0);
        parcel.writeBundle(this.A04);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeBundle(this.A00);
        parcel.writeInt(this.A03);
    }
}
