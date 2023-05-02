package X;

/* renamed from: X.1gH  reason: invalid class name and case insensitive filesystem */
public class C32391gH {
    public static final C32071fb[] A03 = new C32071fb[0];
    public int A00;
    public boolean A01;
    public C32071fb[] A02;

    public C32391gH() {
        this(10);
    }

    public C32391gH(int i2) {
        if (i2 >= 0) {
            this.A02 = i2 == 0 ? A03 : new C32071fb[i2];
            this.A00 = 0;
            this.A01 = false;
            return;
        }
        throw new IllegalArgumentException("'initialCapacity' must not be negative");
    }

    public static C32071fb[] A00(C32071fb[] r2) {
        return r2.length < 1 ? A03 : (C32071fb[]) r2.clone();
    }

    public C32071fb A01(int i2) {
        int i3 = this.A00;
        if (i2 < i3) {
            return this.A02[i2];
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append(" >= ");
        sb.append(i3);
        throw new ArrayIndexOutOfBoundsException(sb.toString());
    }

    public void A02(C32071fb r7) {
        if (r7 != null) {
            C32071fb[] r5 = this.A02;
            int length = r5.length;
            int i2 = this.A00;
            boolean z2 = true;
            int i3 = i2 + 1;
            if (i3 <= length) {
                z2 = false;
            }
            if (this.A01 || z2) {
                C32071fb[] r1 = new C32071fb[Math.max(length, (i3 >> 1) + i3)];
                System.arraycopy(r5, 0, r1, 0, i2);
                this.A02 = r1;
                r5 = r1;
                this.A01 = false;
            }
            r5[this.A00] = r7;
            this.A00 = i3;
            return;
        }
        throw new NullPointerException("'element' cannot be null");
    }

    public C32071fb[] A03() {
        int i2 = this.A00;
        if (i2 == 0) {
            return A03;
        }
        C32071fb[] r2 = this.A02;
        if (r2.length == i2) {
            this.A01 = true;
            return r2;
        }
        C32071fb[] r1 = new C32071fb[i2];
        System.arraycopy(r2, 0, r1, 0, i2);
        return r1;
    }
}
