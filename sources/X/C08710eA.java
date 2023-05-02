package X;

/* renamed from: X.0eA  reason: invalid class name and case insensitive filesystem */
public class C08710eA implements C12740kt {
    public int A00;
    public int A01;
    public String A02;
    public boolean A03;
    public boolean A04;

    public C08710eA(boolean z2, boolean z3, int i2, int i3, String str) {
        this.A00 = i2;
        this.A01 = i3;
        this.A03 = z2;
        this.A04 = z3;
        this.A02 = str;
    }

    public boolean ALM(C04000Ks r7, AnonymousClass0IL r8) {
        int i2;
        int i3;
        String A002 = (!this.A04 || this.A02 != null) ? this.A02 : r8.A00();
        C13170la r0 = r8.A00;
        if (r0 != null) {
            i3 = 0;
            i2 = 0;
            for (AnonymousClass0PV r02 : r0.AAc()) {
                if (r02 == r8) {
                    i3 = i2;
                }
                if (A002 == null || r02.A00().equals(A002)) {
                    i2++;
                }
            }
        } else {
            i3 = 0;
            i2 = 1;
        }
        int i4 = i2 - i3;
        if (this.A03) {
            i4 = i3 + 1;
        }
        int i5 = this.A00;
        int i6 = this.A01;
        if (i5 != 0) {
            int i7 = i4 - i6;
            if (i7 % i5 != 0) {
                return false;
            }
            i4 = Integer.signum(i7);
            if (i4 != 0) {
                i6 = Integer.signum(i5);
            }
        }
        return i4 == i6;
    }

    public String toString() {
        Object[] objArr;
        String str;
        String str2 = this.A03 ? "" : "last-";
        if (this.A04) {
            objArr = new Object[4];
            objArr[0] = str2;
            AnonymousClass000.A1M(objArr, this.A00, 1);
            AnonymousClass000.A1M(objArr, this.A01, 2);
            objArr[3] = this.A02;
            str = "nth-%schild(%dn%+d of type <%s>)";
        } else {
            objArr = new Object[3];
            objArr[0] = str2;
            AnonymousClass000.A1M(objArr, this.A00, 1);
            AnonymousClass000.A1M(objArr, this.A01, 2);
            str = "nth-%schild(%dn%+d)";
        }
        return String.format(str, objArr);
    }
}
