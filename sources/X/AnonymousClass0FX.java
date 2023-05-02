package X;

/* renamed from: X.0FX  reason: invalid class name */
public class AnonymousClass0FX extends AnonymousClass07A {
    public final /* synthetic */ C10420h6 A00;

    public AnonymousClass0FX(C10420h6 r1) {
        this.A00 = r1;
    }

    public int A00() {
        return this.A00.A02.size();
    }

    public int A01() {
        return this.A00.A03.size();
    }

    public Object A02(int i2, int i3) {
        C10420h6 r2 = this.A00;
        Object obj = r2.A03.get(i2);
        Object obj2 = r2.A02.get(i3);
        if (obj != null && obj2 != null) {
            return null;
        }
        throw new AssertionError();
    }

    public boolean A03(int i2, int i3) {
        C10420h6 r3 = this.A00;
        Object obj = r3.A03.get(i2);
        Object obj2 = r3.A02.get(i3);
        if (obj != null) {
            if (obj2 != null) {
                return r3.A01.A03.A00.A00(obj, obj2);
            }
        } else if (obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    public boolean A04(int i2, int i3) {
        C10420h6 r3 = this.A00;
        Object obj = r3.A03.get(i2);
        Object obj2 = r3.A02.get(i3);
        if (obj == null) {
            return obj2 == null;
        }
        if (obj2 != null) {
            return r3.A01.A03.A00.A01(obj, obj2);
        }
        return false;
    }
}
