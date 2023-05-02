package X;

/* renamed from: X.2L3  reason: invalid class name */
public final class AnonymousClass2L3 {
    public static final Class A00;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        A00 = cls;
    }

    public static C47862Ky A00() {
        Class cls = A00;
        if (cls != null) {
            try {
                return (C47862Ky) cls.getMethod("getEmptyRegistry", new Class[0]).invoke((Object) null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return C47862Ky.A01;
    }
}
