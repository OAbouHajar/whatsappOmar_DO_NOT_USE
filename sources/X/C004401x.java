package X;

/* renamed from: X.01x  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C004401x implements AnonymousClass01J {
    public final Object get() {
        try {
            Class.forName("androidx.test.espresso.Espresso");
            return Boolean.TRUE;
        } catch (ClassNotFoundException unused) {
            return Boolean.FALSE;
        }
    }
}
