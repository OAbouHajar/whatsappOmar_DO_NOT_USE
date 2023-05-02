package X;

/* renamed from: X.0b2  reason: invalid class name */
public class AnonymousClass0b2 implements C13010lK {
    public int A00;
    public final Object[] A01;

    public AnonymousClass0b2(int i2) {
        if (i2 > 0) {
            this.A01 = new Object[i2];
            return;
        }
        throw AnonymousClass000.A0T("The max pool size must be > 0");
    }

    public Object A4T() {
        int i2 = this.A00;
        if (i2 <= 0) {
            return null;
        }
        int i3 = i2 - 1;
        Object[] objArr = this.A01;
        Object obj = objArr[i3];
        objArr[i3] = null;
        this.A00 = i3;
        return obj;
    }

    public boolean Abi(Object obj) {
        int i2 = 0;
        while (true) {
            int i3 = this.A00;
            if (i2 >= i3) {
                Object[] objArr = this.A01;
                if (i3 >= objArr.length) {
                    return false;
                }
                objArr[i3] = obj;
                this.A00 = i3 + 1;
                return true;
            } else if (this.A01[i2] == obj) {
                throw AnonymousClass000.A0V("Already in the pool!");
            } else {
                i2++;
            }
        }
    }
}
