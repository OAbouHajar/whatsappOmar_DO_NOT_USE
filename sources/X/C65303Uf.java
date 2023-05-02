package X;

import java.util.List;

/* renamed from: X.3Uf  reason: invalid class name and case insensitive filesystem */
public abstract class C65303Uf extends C65313Ug implements C109535Sn {
    public long A00;
    public C109535Sn A01;

    public List ABD(long j2) {
        return this.A01.ABD(j2 - this.A00);
    }

    public long AC3(int i2) {
        return this.A01.AC3(i2) + this.A00;
    }

    public int AC4() {
        return this.A01.AC4();
    }

    public int ADu(long j2) {
        return this.A01.ADu(j2 - this.A00);
    }

    public void clear() {
        this.flags = 0;
        this.A01 = null;
    }
}
