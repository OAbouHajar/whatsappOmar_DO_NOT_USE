package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3VG  reason: invalid class name */
public final class AnonymousClass3VG extends C97144pT {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(25);
    public final List A00;

    public AnonymousClass3VG(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList A0i = C13690nt.A0i(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            A0i.add(new C88414aS(parcel));
        }
        this.A00 = Collections.unmodifiableList(A0i);
    }

    public AnonymousClass3VG(List list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        List list = this.A00;
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            C88414aS r5 = (C88414aS) list.get(i3);
            parcel.writeLong(r5.A04);
            parcel.writeByte(r5.A0A ? (byte) 1 : 0);
            parcel.writeByte(r5.A08 ? (byte) 1 : 0);
            parcel.writeByte(r5.A09 ? (byte) 1 : 0);
            List list2 = r5.A06;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i4 = 0; i4 < size2; i4++) {
                AnonymousClass4GF r1 = (AnonymousClass4GF) list2.get(i4);
                parcel.writeInt(r1.A00);
                parcel.writeLong(r1.A01);
            }
            parcel.writeLong(r5.A05);
            parcel.writeByte(r5.A07 ? (byte) 1 : 0);
            parcel.writeLong(r5.A03);
            parcel.writeInt(r5.A02);
            parcel.writeInt(r5.A00);
            parcel.writeInt(r5.A01);
        }
    }
}
