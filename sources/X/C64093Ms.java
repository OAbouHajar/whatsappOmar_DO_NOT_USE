package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.View;

/* renamed from: X.3Ms  reason: invalid class name and case insensitive filesystem */
public class C64093Ms extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(46);
    public int A00 = -1;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public SparseIntArray A05;

    public C64093Ms(Parcel parcel) {
        super(parcel);
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A04 = parcel.readInt();
        this.A05 = new SparseIntArray();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            int i2 = 0;
            do {
                this.A05.put(parcel.readInt(), parcel.readInt());
                i2++;
            } while (i2 < readInt);
        }
    }

    public C64093Ms(Parcelable parcelable) {
        super(parcelable);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A04);
        SparseIntArray sparseIntArray = this.A05;
        int i3 = 0;
        int size = sparseIntArray == null ? 0 : sparseIntArray.size();
        parcel.writeInt(size);
        if (size > 0) {
            do {
                parcel.writeInt(this.A05.keyAt(i3));
                parcel.writeInt(this.A05.valueAt(i3));
                i3++;
            } while (i3 < size);
        }
    }
}
