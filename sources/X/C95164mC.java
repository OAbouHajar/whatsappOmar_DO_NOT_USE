package X;

/* renamed from: X.4mC  reason: invalid class name and case insensitive filesystem */
public class C95164mC implements AnonymousClass04o {
    public C003401n A6s(Class cls) {
        Class<AnonymousClass2X3> cls2 = AnonymousClass2X3.class;
        Class<C57302qs> cls3 = C57302qs.class;
        if (cls.equals(cls3)) {
            return new C57302qs();
        }
        if (cls.equals(cls2)) {
            return new AnonymousClass2X3();
        }
        StringBuilder A0r = AnonymousClass000.A0r("Model class must be one of: [");
        AnonymousClass3K3.A1N(A0r, cls3.getCanonicalName());
        A0r.append(cls2.getCanonicalName());
        throw AnonymousClass000.A0T(AnonymousClass000.A0h("]", A0r));
    }

    public /* synthetic */ C003401n A73(C013806q r2, Class cls) {
        return C013906r.A00(this, cls);
    }
}
