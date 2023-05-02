package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* renamed from: X.57J  reason: invalid class name */
public final class AnonymousClass57J implements Comparator, Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass3K3.A0W(0);
    public int A00;
    public final String A01;
    public final C93624jV[] A02;

    public AnonymousClass57J(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A02 = (C93624jV[]) parcel.createTypedArray(C93624jV.CREATOR);
    }

    public AnonymousClass57J(String str, C93624jV[] r2, boolean z2) {
        this.A01 = str;
        r2 = z2 ? (C93624jV[]) r2.clone() : r2;
        this.A02 = r2;
        Arrays.sort(r2, this);
    }

    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        UUID uuid = C90604eR.A03;
        UUID uuid2 = ((C93624jV) obj).A03;
        boolean equals = uuid.equals(uuid2);
        UUID uuid3 = ((C93624jV) obj2).A03;
        return equals ? uuid.equals(uuid3) ? 0 : 1 : uuid2.compareTo(uuid3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass57J.class != obj.getClass()) {
                return false;
            }
            AnonymousClass57J r5 = (AnonymousClass57J) obj;
            if (!AnonymousClass3C1.A0F(this.A01, r5.A01) || !Arrays.equals(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i2 = this.A00;
        if (i2 != 0) {
            return i2;
        }
        int A0G = (AnonymousClass000.A0G(this.A01) * 31) + Arrays.hashCode(this.A02);
        this.A00 = A0G;
        return A0G;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A01);
        parcel.writeTypedArray(this.A02, 0);
    }
}
