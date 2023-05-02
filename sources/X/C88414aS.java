package X;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4aS  reason: invalid class name and case insensitive filesystem */
public final class C88414aS {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final List A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    public C88414aS(Parcel parcel) {
        this.A04 = parcel.readLong();
        boolean z2 = false;
        this.A0A = AnonymousClass000.A1R(parcel.readByte(), 1);
        this.A08 = AnonymousClass000.A1R(parcel.readByte(), 1);
        this.A09 = AnonymousClass000.A1R(parcel.readByte(), 1);
        int readInt = parcel.readInt();
        ArrayList A0i = C13690nt.A0i(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            A0i.add(new AnonymousClass4GF(parcel.readInt(), parcel.readLong()));
        }
        this.A06 = Collections.unmodifiableList(A0i);
        this.A05 = parcel.readLong();
        this.A07 = parcel.readByte() == 1 ? true : z2;
        this.A03 = parcel.readLong();
        this.A02 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A01 = parcel.readInt();
    }

    public C88414aS(List list, int i2, int i3, int i4, long j2, long j3, long j4, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A04 = j2;
        this.A0A = z2;
        this.A08 = z3;
        this.A09 = z4;
        this.A06 = Collections.unmodifiableList(list);
        this.A05 = j3;
        this.A07 = z5;
        this.A03 = j4;
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
    }
}
