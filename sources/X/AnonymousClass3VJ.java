package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3VJ  reason: invalid class name */
public final class AnonymousClass3VJ extends C97144pT {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(23);
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public AnonymousClass3VJ(Parcel parcel) {
        this.A06 = parcel.readLong();
        boolean z2 = false;
        this.A0B = AnonymousClass000.A1R(parcel.readByte(), 1);
        this.A09 = AnonymousClass000.A1R(parcel.readByte(), 1);
        this.A0A = AnonymousClass000.A1R(parcel.readByte(), 1);
        this.A0C = AnonymousClass000.A1R(parcel.readByte(), 1);
        this.A05 = parcel.readLong();
        this.A04 = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList A0i = C13690nt.A0i(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            A0i.add(new AnonymousClass4JX(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.A07 = Collections.unmodifiableList(A0i);
        this.A08 = parcel.readByte() == 1 ? true : z2;
        this.A03 = parcel.readLong();
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public AnonymousClass3VJ(List list, int i2, int i3, int i4, long j2, long j3, long j4, long j5, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A06 = j2;
        this.A0B = z2;
        this.A09 = z3;
        this.A0A = z4;
        this.A0C = z5;
        this.A05 = j3;
        this.A04 = j4;
        this.A07 = Collections.unmodifiableList(list);
        this.A08 = z6;
        this.A03 = j5;
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.A06);
        parcel.writeByte(this.A0B ? (byte) 1 : 0);
        parcel.writeByte(this.A09 ? (byte) 1 : 0);
        parcel.writeByte(this.A0A ? (byte) 1 : 0);
        parcel.writeByte(this.A0C ? (byte) 1 : 0);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A04);
        List list = this.A07;
        int size = list.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            AnonymousClass4JX r2 = (AnonymousClass4JX) list.get(i3);
            parcel.writeInt(r2.A00);
            parcel.writeLong(r2.A02);
            parcel.writeLong(r2.A01);
        }
        parcel.writeByte(this.A08 ? (byte) 1 : 0);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
