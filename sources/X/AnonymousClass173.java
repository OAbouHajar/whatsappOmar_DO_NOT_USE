package X;

import android.os.Parcel;

/* renamed from: X.173  reason: invalid class name */
public class AnonymousClass173 {
    public static final C28411Vz[] A01 = {C35481m0.A06, C35481m0.A05, C35481m0.A04};
    public final C227118z A00;

    public AnonymousClass173(C227118z r1) {
        this.A00 = r1;
    }

    public static C28411Vz A00(Parcel parcel) {
        int readInt = parcel.readInt();
        return readInt != 0 ? readInt != 1 ? C35481m0.A06 : new C35531m5(parcel) : new C35481m0(parcel);
    }

    public C28411Vz A01(String str) {
        if (str != null) {
            for (C28411Vz r0 : A01) {
                if (str.equals(((C35491m1) r0).A04)) {
                    return r0;
                }
            }
            C227118z r1 = this.A00;
            r1.A00();
            C28411Vz r02 = (C28411Vz) r1.A01.get(str);
            if (r02 != null) {
                return r02;
            }
            r1.A00();
            C28411Vz r03 = (C28411Vz) r1.A00.get(str);
            if (r03 != null) {
                return r03;
            }
        }
        return C35481m0.A06;
    }
}
