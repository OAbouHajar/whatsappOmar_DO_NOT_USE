package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.0YC  reason: invalid class name */
public final class AnonymousClass0YC implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass000.A0S(15);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final CharSequence A04;
    public final CharSequence A05;
    public final String A06;
    public final ArrayList A07;
    public final ArrayList A08;
    public final ArrayList A09;
    public final boolean A0A;
    public final int[] A0B;
    public final int[] A0C;
    public final int[] A0D;

    public AnonymousClass0YC(AnonymousClass050 r13) {
        ArrayList arrayList = r13.A0B;
        int size = arrayList.size();
        int[] iArr = new int[(size * 5)];
        this.A0D = iArr;
        if (r13.A0E) {
            ArrayList arrayList2 = new ArrayList(size);
            this.A07 = arrayList2;
            int[] iArr2 = new int[size];
            this.A0C = iArr2;
            int[] iArr3 = new int[size];
            this.A0B = iArr3;
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                AnonymousClass0W0 r9 = (AnonymousClass0W0) arrayList.get(i3);
                int i4 = i2 + 1;
                iArr[i2] = r9.A00;
                AnonymousClass01A r0 = r9.A05;
                arrayList2.add(r0 != null ? r0.A0T : null);
                int i5 = i4 + 1;
                iArr[i4] = r9.A01;
                int i6 = i5 + 1;
                iArr[i5] = r9.A02;
                int i7 = i6 + 1;
                iArr[i6] = r9.A03;
                i2 = i7 + 1;
                iArr[i7] = r9.A04;
                iArr2[i3] = r9.A07.ordinal();
                iArr3[i3] = r9.A06.ordinal();
            }
            this.A03 = r13.A07;
            this.A06 = r13.A0A;
            this.A02 = r13.A04;
            this.A01 = r13.A01;
            this.A05 = r13.A09;
            this.A00 = r13.A00;
            this.A04 = r13.A08;
            this.A08 = r13.A0C;
            this.A09 = r13.A0D;
            this.A0A = r13.A0H;
            return;
        }
        throw AnonymousClass000.A0V("Not on back stack");
    }

    public AnonymousClass0YC(Parcel parcel) {
        this.A0D = parcel.createIntArray();
        this.A07 = parcel.createStringArrayList();
        this.A0C = parcel.createIntArray();
        this.A0B = parcel.createIntArray();
        this.A03 = parcel.readInt();
        this.A06 = parcel.readString();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A05 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.A00 = parcel.readInt();
        this.A04 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.A08 = parcel.createStringArrayList();
        this.A09 = parcel.createStringArrayList();
        this.A0A = AnonymousClass000.A1O(parcel.readInt());
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.A0D);
        parcel.writeStringList(this.A07);
        parcel.writeIntArray(this.A0C);
        parcel.writeIntArray(this.A0B);
        parcel.writeInt(this.A03);
        parcel.writeString(this.A06);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        TextUtils.writeToParcel(this.A05, parcel, 0);
        parcel.writeInt(this.A00);
        TextUtils.writeToParcel(this.A04, parcel, 0);
        parcel.writeStringList(this.A08);
        parcel.writeStringList(this.A09);
        parcel.writeInt(this.A0A ? 1 : 0);
    }
}
