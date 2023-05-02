package X;

/* renamed from: X.06u  reason: invalid class name and case insensitive filesystem */
public class C014206u implements AnonymousClass04o {
    public static C014206u A00;
    public static final C014406w A01 = new C014506x();

    public C003401n A6s(Class cls) {
        C18450wi.A0H(cls, 0);
        try {
            Object newInstance = cls.newInstance();
            C18450wi.A0B(newInstance);
            return (C003401n) newInstance;
        } catch (InstantiationException e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot create an instance of ");
            sb.append(cls);
            throw new RuntimeException(sb.toString(), e2);
        } catch (IllegalAccessException e3) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cannot create an instance of ");
            sb2.append(cls);
            throw new RuntimeException(sb2.toString(), e3);
        }
    }

    public /* synthetic */ C003401n A73(C013806q r2, Class cls) {
        return C013906r.A00(this, cls);
    }
}
