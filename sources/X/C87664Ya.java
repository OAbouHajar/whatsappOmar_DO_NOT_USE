package X;

/* renamed from: X.4Ya  reason: invalid class name and case insensitive filesystem */
public class C87664Ya {
    public static AnonymousClass197 A00 = new AnonymousClass197(16);

    public static AnonymousClass1ZR A00(String str) {
        AnonymousClass1ZR r0;
        AnonymousClass197 r1 = A00;
        synchronized (r1) {
            r0 = str == null ? null : (AnonymousClass1ZR) r1.get(str);
        }
        return r0;
    }
}
