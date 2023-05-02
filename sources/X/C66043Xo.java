package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3Xo  reason: invalid class name and case insensitive filesystem */
public final class C66043Xo extends C15710ri {
    public static final Parcelable.Creator CREATOR = new C92324hN();
    public final long A00;
    public final long A01;
    public final boolean A02;

    public C66043Xo(long j2, long j3, boolean z2) {
        this.A02 = z2;
        this.A00 = j2;
        this.A01 = j3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66043Xo) {
                C66043Xo r8 = (C66043Xo) obj;
                if (!(this.A02 == r8.A02 && this.A00 == r8.A00 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[3];
        objArr[0] = Boolean.valueOf(this.A02);
        objArr[1] = Long.valueOf(this.A00);
        return AnonymousClass000.A0F(Long.valueOf(this.A01), objArr, 2);
    }

    public final String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("CollectForDebugParcelable[skipPersistentStorage: ");
        A0r.append(this.A02);
        A0r.append(",collectForDebugStartTimeMillis: ");
        A0r.append(this.A00);
        A0r.append(",collectForDebugExpiryTimeMillis: ");
        A0r.append(this.A01);
        return AnonymousClass000.A0h("]", A0r);
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A08(parcel, 1, this.A02);
        C32251fv.A07(parcel, 2, this.A01);
        C32251fv.A07(parcel, 3, this.A00);
        C32251fv.A05(parcel, A002);
    }
}
