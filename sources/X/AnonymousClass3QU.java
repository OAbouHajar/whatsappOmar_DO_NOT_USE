package X;

import android.util.SparseIntArray;

/* renamed from: X.3QU  reason: invalid class name */
public class AnonymousClass3QU extends AnonymousClass07A {
    public final AnonymousClass2UX A00;
    public final AnonymousClass2UX A01;
    public final String A02;
    public final String A03;

    public AnonymousClass3QU(AnonymousClass2UX r1, AnonymousClass2UX r2, String str, String str2) {
        this.A01 = r1;
        this.A00 = r2;
        this.A03 = str;
        this.A02 = str2;
    }

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public boolean A03(int i2, int i3) {
        AnonymousClass2UZ r4 = (AnonymousClass2UZ) this.A01.get(i2);
        AnonymousClass2UZ r3 = (AnonymousClass2UZ) this.A00.get(i3);
        int i4 = r3.A00;
        if (i4 != 1 && i4 != 12 && i4 != 4 && i4 != 6 && i4 != 3 && i4 != 2 && !AnonymousClass2UZ.A00(i4)) {
            return C34901l3.A00(Integer.valueOf(r4.A00), Integer.valueOf(i4)) && C34901l3.A00(this.A03, this.A02);
        }
        int i5 = r4.A00;
        if (AnonymousClass2UZ.A00(i5) || AnonymousClass2UZ.A00(i4)) {
            return C34901l3.A00(Integer.valueOf(i5), Integer.valueOf(i4));
        }
        Object obj = r4.A01;
        if (i5 != 4) {
            return C34901l3.A00(obj, r3.A01);
        }
        SparseIntArray sparseIntArray = (SparseIntArray) obj;
        SparseIntArray sparseIntArray2 = (SparseIntArray) r3.A01;
        if (sparseIntArray.size() != sparseIntArray2.size()) {
            return false;
        }
        for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
            if (sparseIntArray.keyAt(i6) != sparseIntArray2.keyAt(i6) || sparseIntArray.valueAt(i6) != sparseIntArray2.valueAt(i6)) {
                return false;
            }
        }
        return true;
    }

    public boolean A04(int i2, int i3) {
        AnonymousClass2UZ r5 = (AnonymousClass2UZ) this.A01.get(i2);
        AnonymousClass2UZ r4 = (AnonymousClass2UZ) this.A00.get(i3);
        int i4 = r5.A00;
        if (!AnonymousClass2UZ.A00(i4)) {
            int i5 = r4.A00;
            if (!AnonymousClass2UZ.A00(i5)) {
                if (i4 == 4) {
                    return AnonymousClass000.A1R(i5, 4);
                }
                if (!this.A03.equals(this.A02)) {
                    return C34901l3.A00(Integer.valueOf(i4), Integer.valueOf(i5));
                }
            }
        }
        return C34901l3.A00(r5.A01, r4.A01);
    }
}
