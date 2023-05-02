package X;

/* renamed from: X.3QV  reason: invalid class name */
public class AnonymousClass3QV extends AnonymousClass07A {
    public final /* synthetic */ C34641kb A00;
    public final /* synthetic */ C34641kb A01;
    public final /* synthetic */ AnonymousClass4NF A02;

    public AnonymousClass3QV(C34641kb r1, C34641kb r2, AnonymousClass4NF r3) {
        this.A02 = r3;
        this.A01 = r1;
        this.A00 = r2;
    }

    public int A00() {
        return this.A00.size();
    }

    public int A01() {
        return this.A01.size();
    }

    public Object A02(int i2, int i3) {
        Object obj = this.A01.get(i2);
        Object obj2 = this.A00.get(i3);
        if (obj != null && obj2 != null) {
            return null;
        }
        throw new AssertionError();
    }

    public boolean A03(int i2, int i3) {
        Object obj = this.A01.get(i2);
        Object obj2 = this.A00.get(i3);
        if (obj != null) {
            if (obj2 != null) {
                return this.A02.A02.A00.A00(obj, obj2);
            }
        } else if (obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    public boolean A04(int i2, int i3) {
        Object obj = this.A01.get(i2);
        Object obj2 = this.A00.get(i3);
        if (obj == null) {
            return obj2 == null;
        }
        if (obj2 != null) {
            return this.A02.A02.A00.A01(obj, obj2);
        }
        return false;
    }
}
