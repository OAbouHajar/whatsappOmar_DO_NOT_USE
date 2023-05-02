package X;

/* renamed from: X.4Yj  reason: invalid class name and case insensitive filesystem */
public class C87744Yj {
    public static final AnonymousClass480 A00;

    static {
        AnonymousClass480 r1 = null;
        try {
            r1 = (AnonymousClass480) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (r1 == null) {
            r1 = new AnonymousClass480();
        }
        A00 = r1;
    }

    public static AnonymousClass2BR A00(Class cls) {
        return new AnonymousClass2BO(cls);
    }
}
