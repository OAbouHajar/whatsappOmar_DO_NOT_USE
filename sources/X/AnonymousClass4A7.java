package X;

import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/* renamed from: X.4A7  reason: invalid class name */
public final class AnonymousClass4A7 {
    public static final List A00;

    static {
        Class<AnonymousClass5VD> cls = AnonymousClass5VD.class;
        Iterator<S> it = ServiceLoader.load(cls, cls.getClassLoader()).iterator();
        C18450wi.A0H(it, 0);
        A00 = AnonymousClass1JA.A0Q(C11490ir.A02(new AnonymousClass22H(new AnonymousClass22F(it))));
    }
}
