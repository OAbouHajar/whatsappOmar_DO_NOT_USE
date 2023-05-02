package X;

import android.os.Parcel;
import android.util.SparseIntArray;

/* renamed from: X.0GW  reason: invalid class name */
public class AnonymousClass0GW extends AnonymousClass0SG {
    public int A00;
    public int A01;
    public int A02;
    public final int A03;
    public final int A04;
    public final Parcel A05;
    public final SparseIntArray A06;
    public final String A07;

    public AnonymousClass0GW(Parcel parcel) {
        this(parcel, new AnonymousClass00N(), new AnonymousClass00N(), new AnonymousClass00N(), "", parcel.dataPosition(), parcel.dataSize());
    }

    public AnonymousClass0GW(Parcel parcel, AnonymousClass00N r4, AnonymousClass00N r5, AnonymousClass00N r6, String str, int i2, int i3) {
        super(r4, r5, r6);
        this.A06 = new SparseIntArray();
        this.A00 = -1;
        this.A02 = 0;
        this.A01 = -1;
        this.A05 = parcel;
        this.A04 = i2;
        this.A03 = i3;
        this.A02 = i2;
        this.A07 = str;
    }

    public AnonymousClass0SG A02() {
        Parcel parcel = this.A05;
        int dataPosition = parcel.dataPosition();
        int i2 = this.A02;
        if (i2 == this.A04) {
            i2 = this.A03;
        }
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(this.A07);
        return new AnonymousClass0GW(parcel, this.A01, this.A02, this.A00, AnonymousClass000.A0h("  ", A0o), dataPosition, i2);
    }

    public void A05(int i2) {
        int i3 = this.A00;
        if (i3 >= 0) {
            int i4 = this.A06.get(i3);
            Parcel parcel = this.A05;
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i4);
            parcel.writeInt(dataPosition - i4);
            parcel.setDataPosition(dataPosition);
        }
        this.A00 = i2;
        SparseIntArray sparseIntArray = this.A06;
        Parcel parcel2 = this.A05;
        sparseIntArray.put(i2, parcel2.dataPosition());
        parcel2.writeInt(0);
        parcel2.writeInt(i2);
    }

    public boolean A09(int i2) {
        while (true) {
            int i3 = this.A02;
            int i4 = this.A03;
            int i5 = this.A01;
            if (i3 >= i4) {
                return i5 == i2;
            }
            if (i5 == i2) {
                return true;
            }
            if (String.valueOf(i5).compareTo(String.valueOf(i2)) > 0) {
                return false;
            }
            Parcel parcel = this.A05;
            parcel.setDataPosition(i3);
            int readInt = parcel.readInt();
            this.A01 = parcel.readInt();
            this.A02 += readInt;
        }
    }
}
