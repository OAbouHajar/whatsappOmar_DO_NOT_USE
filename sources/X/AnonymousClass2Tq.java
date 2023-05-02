package X;

/* renamed from: X.2Tq  reason: invalid class name */
public final class AnonymousClass2Tq extends C34641kb<Object> {
    public final transient Object[] alternatingKeysAndValues;
    public final transient int offset;
    public final transient int size;

    public AnonymousClass2Tq(Object[] objArr, int i2, int i3) {
        this.alternatingKeysAndValues = objArr;
        this.offset = i2;
        this.size = i3;
    }

    public Object get(int i2) {
        C29031Zu.A01(i2, this.size);
        return this.alternatingKeysAndValues[(i2 << 1) + this.offset];
    }

    public boolean isPartialView() {
        return true;
    }

    public int size() {
        return this.size;
    }
}
