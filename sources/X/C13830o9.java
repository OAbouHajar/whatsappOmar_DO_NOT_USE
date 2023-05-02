package X;

import java.util.Set;

/* renamed from: X.0o9  reason: invalid class name and case insensitive filesystem */
public abstract class C13830o9 {
    public C13840oA A00() {
        if (this instanceof C14020oT) {
            C14020oT r1 = (C14020oT) this;
            Class<AnonymousClass00P> cls = AnonymousClass00P.class;
            if (r1.A05.contains(cls)) {
                return r1.A00.A00();
            }
            throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{cls}));
        }
        C13850oB r0 = (C13850oB) ((C13820o8) this).A03.get(AnonymousClass00P.class);
        return r0 == null ? C13820o8.A04 : r0;
    }

    public C13840oA A01(Class cls) {
        if (this instanceof C14020oT) {
            C14020oT r1 = (C14020oT) this;
            if (r1.A02.contains(cls)) {
                return r1.A00.A01(cls);
            }
            throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{cls}));
        }
        C13710nw.A02(cls, "Null interface requested.");
        return (C13840oA) ((C13820o8) this).A02.get(cls);
    }

    public Object A02(Class cls) {
        if (this instanceof C14020oT) {
            C14020oT r1 = (C14020oT) this;
            if (r1.A01.contains(cls)) {
                Object A02 = r1.A00.A02(cls);
                if (!cls.equals(C13920oI.class)) {
                    return A02;
                }
                return new C14030oU((C13920oI) A02, r1.A03);
            }
            throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
        }
        C13840oA A01 = A01(cls);
        if (A01 == null) {
            return null;
        }
        return A01.get();
    }

    public Set A03() {
        if (!(this instanceof C14020oT)) {
            return (Set) A00().get();
        }
        C14020oT r1 = (C14020oT) this;
        Class<AnonymousClass00P> cls = AnonymousClass00P.class;
        if (r1.A04.contains(cls)) {
            return r1.A00.A03();
        }
        throw new IllegalArgumentException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{cls}));
    }
}
