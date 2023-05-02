package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.3YI  reason: invalid class name */
public final class AnonymousClass3YI extends C15710ri implements C107815Ln {
    public static final Parcelable.Creator CREATOR = new C92464hb();
    public final int A00;
    public final SparseArray A01;
    public final HashMap A02;

    public AnonymousClass3YI() {
        this.A00 = 1;
        this.A02 = AnonymousClass000.A0x();
        this.A01 = new SparseArray();
    }

    public AnonymousClass3YI(ArrayList arrayList, int i2) {
        this.A00 = i2;
        this.A02 = AnonymousClass000.A0x();
        this.A01 = new SparseArray();
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            C66083Xs r0 = (C66083Xs) arrayList.get(i3);
            String str = r0.A02;
            int i4 = r0.A01;
            C13680ns.A1X(str, this.A02, i4);
            this.A01.put(i4, str);
        }
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int A002 = C32251fv.A00(parcel);
        C32251fv.A06(parcel, 1, this.A00);
        ArrayList A0u = AnonymousClass000.A0u();
        HashMap hashMap = this.A02;
        Iterator A0e = AnonymousClass3K4.A0e(hashMap);
        while (A0e.hasNext()) {
            String A0m = AnonymousClass000.A0m(A0e);
            A0u.add(new C66083Xs(A0m, AnonymousClass000.A0D(hashMap.get(A0m))));
        }
        C32251fv.A0C(parcel, A0u, 2, false);
        C32251fv.A05(parcel, A002);
    }
}
