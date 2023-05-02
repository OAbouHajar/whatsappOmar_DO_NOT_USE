package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.4ja  reason: invalid class name and case insensitive filesystem */
public class C93674ja implements Parcelable {
    @Deprecated
    public static final C93674ja A06;
    public static final C93674ja A07;
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(31);
    public final int A00;
    public final int A01;
    public final int A02;
    public final C34641kb A03;
    public final C34641kb A04;
    public final boolean A05;

    static {
        AnonymousClass4UE r3 = new AnonymousClass4UE();
        C93674ja A012 = r3 instanceof C65573Vh ? ((C65573Vh) r3).A01() : new C93674ja(r3.A01, r3.A02, r3.A00);
        A07 = A012;
        A06 = A012;
    }

    public C93674ja(C34641kb r2, C34641kb r3, int i2) {
        this.A03 = r2;
        this.A01 = 0;
        this.A04 = r3;
        this.A02 = i2;
        this.A05 = false;
        this.A00 = 0;
    }

    public C93674ja(Parcel parcel) {
        ArrayList A0u = AnonymousClass000.A0u();
        parcel.readList(A0u, (ClassLoader) null);
        this.A03 = C34641kb.copyOf((Collection) A0u);
        this.A01 = parcel.readInt();
        ArrayList A0u2 = AnonymousClass000.A0u();
        parcel.readList(A0u2, (ClassLoader) null);
        this.A04 = C34641kb.copyOf((Collection) A0u2);
        this.A02 = parcel.readInt();
        this.A05 = AnonymousClass000.A1O(parcel.readInt());
        this.A00 = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C93674ja r5 = (C93674ja) obj;
            if (!(this.A03.equals(r5.A03) && this.A01 == r5.A01 && this.A04.equals(r5.A04) && this.A02 == r5.A02 && this.A05 == r5.A05 && this.A00 == r5.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass000.A0E(this.A04, (((this.A03.hashCode() + 31) * 31) + this.A01) * 31) + this.A02) * 31) + (this.A05 ? 1 : 0)) * 31) + this.A00;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeList(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeList(this.A04);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A00);
    }
}
