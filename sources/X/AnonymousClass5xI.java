package X;

/* renamed from: X.5xI  reason: invalid class name */
public final class AnonymousClass5xI {
    public final int A00;
    public final Object A01;
    public final Throwable A02;

    public AnonymousClass5xI(Object obj, Throwable th, int i2) {
        this.A00 = i2;
        this.A01 = obj;
        this.A02 = th;
    }

    public static AnonymousClass5xI A00(Object obj) {
        return new AnonymousClass5xI(obj, (Throwable) null, 2);
    }

    public static AnonymousClass5xI A01(Object obj) {
        return new AnonymousClass5xI(obj, (Throwable) null, 0);
    }

    public static AnonymousClass5xI A02(Object obj, Throwable th) {
        return new AnonymousClass5xI(obj, th, 1);
    }
}
