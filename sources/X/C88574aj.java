package X;

/* renamed from: X.4aj  reason: invalid class name and case insensitive filesystem */
public class C88574aj {
    public final AnonymousClass5SJ A00;
    public final Object A01;

    public C88574aj(AnonymousClass5SJ r1, Object obj) {
        this.A01 = obj;
        this.A00 = r1;
    }

    public static C88574aj A00(AnonymousClass5SJ r1, Object obj) {
        return new C88574aj(r1, obj);
    }

    public String A01() {
        Class<?> cls = this.A00.getClass();
        String name = cls.getName();
        if (name.length() > 80) {
            return cls.getSimpleName();
        }
        StringBuilder A0r = AnonymousClass000.A0r("<cls>");
        A0r.append(name);
        return AnonymousClass000.A0h("</cls>", A0r);
    }
}
