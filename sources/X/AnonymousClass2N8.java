package X;

/* renamed from: X.2N8  reason: invalid class name */
public class AnonymousClass2N8 implements AnonymousClass2L6 {
    public int A00 = 0;

    public boolean Ahm(boolean z2, boolean z3, boolean z4, boolean z5) {
        int i2 = this.A00 * 53;
        int i3 = 1237;
        if (z3) {
            i3 = 1231;
        }
        this.A00 = i2 + i3;
        return z3;
    }

    public C28631Ww Ahn(C28631Ww r3, C28631Ww r4, boolean z2, boolean z3) {
        this.A00 = (this.A00 * 53) + r3.hashCode();
        return r3;
    }

    public double Aho(double d2, double d3, boolean z2, boolean z3) {
        long doubleToLongBits = Double.doubleToLongBits(d2);
        this.A00 = (this.A00 * 53) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        return d2;
    }

    public float Ahp(float f2, float f3, boolean z2, boolean z3) {
        this.A00 = (this.A00 * 53) + Float.floatToIntBits(f2);
        return f2;
    }

    public int Ahq(int i2, int i3, boolean z2, boolean z3) {
        this.A00 = (this.A00 * 53) + i2;
        return i2;
    }

    public AnonymousClass27P Ahr(AnonymousClass27P r3, AnonymousClass27P r4) {
        this.A00 = (this.A00 * 53) + r3.hashCode();
        return r3;
    }

    public AnonymousClass1XE Ahs(AnonymousClass1XE r3, AnonymousClass1XE r4) {
        this.A00 = (this.A00 * 53) + r3.hashCode();
        return r3;
    }

    public long Aht(long j2, long j3, boolean z2, boolean z3) {
        this.A00 = (this.A00 * 53) + ((int) (j2 ^ (j2 >>> 32)));
        return j2;
    }

    public AnonymousClass1Wo Ahu(AnonymousClass1Wo r5, AnonymousClass1Wo r6) {
        int i2;
        if (r5 == null) {
            i2 = 37;
        } else if (r5 instanceof C28541Wm) {
            C28541Wm r3 = (C28541Wm) r5;
            i2 = r3.A00;
            if (i2 == 0) {
                int i3 = this.A00;
                this.A00 = 0;
                r3.A0Y(this, r3);
                i2 = this.A00;
                r3.A00 = i2;
                this.A00 = i3;
            }
        } else {
            i2 = r5.hashCode();
        }
        this.A00 = (this.A00 * 53) + i2;
        return r5;
    }

    public Object Ahv(Object obj, Object obj2, boolean z2) {
        this.A00 = (this.A00 * 53) + obj.hashCode();
        return obj;
    }

    public Object Ahw(Object obj, Object obj2, boolean z2) {
        AnonymousClass1Wo r1 = (AnonymousClass1Wo) obj;
        Ahu(r1, (AnonymousClass1Wo) obj2);
        return r1;
    }

    public void Ahx(boolean z2) {
        if (z2) {
            throw new IllegalStateException();
        }
    }

    public Object Ahy(Object obj, Object obj2, boolean z2) {
        this.A00 = (this.A00 * 53) + obj.hashCode();
        return obj;
    }

    public String Ahz(String str, String str2, boolean z2, boolean z3) {
        this.A00 = (this.A00 * 53) + str.hashCode();
        return str;
    }

    public AnonymousClass2L0 Ai0(AnonymousClass2L0 r3, AnonymousClass2L0 r4) {
        this.A00 = (this.A00 * 53) + r3.hashCode();
        return r3;
    }
}
