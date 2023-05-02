package X;

/* renamed from: X.4yD  reason: invalid class name and case insensitive filesystem */
public class C101984yD implements C40061tV {
    public int A00 = 0;
    public int A01 = 0;

    public int AD8() {
        return this.A00;
    }

    public boolean AYa(int i2, boolean z2) {
        if (z2) {
            this.A01++;
        }
        if (this.A01 < 128) {
            return true;
        }
        this.A00 = i2;
        return false;
    }
}
