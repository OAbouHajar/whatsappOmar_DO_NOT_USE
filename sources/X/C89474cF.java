package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.4cF  reason: invalid class name and case insensitive filesystem */
public class C89474cF {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A00;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A01;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A02;
    public volatile /* synthetic */ Object _next = this;
    public volatile /* synthetic */ Object _prev = this;
    public volatile /* synthetic */ Object _removedRef = null;

    static {
        Class<Object> cls = Object.class;
        Class<C89474cF> cls2 = C89474cF.class;
        A00 = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_next");
        A01 = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_prev");
        A02 = AtomicReferenceFieldUpdater.newUpdater(cls2, cls, "_removedRef");
    }

    public final int A00(C107125Gm r3, C89474cF r4, C89474cF r5) {
        A01.lazySet(r4, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A00;
        atomicReferenceFieldUpdater.lazySet(r4, r5);
        r3.A00 = r5;
        if (!AnonymousClass0LG.A00(this, r5, r3, atomicReferenceFieldUpdater)) {
            return 0;
        }
        return r3.A00(this) == null ? 1 : 2;
    }

    public final Object A01() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof AnonymousClass4SY)) {
                return obj;
            }
            ((AnonymousClass4SY) obj).A00(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (X.AnonymousClass0LG.A00(r4, r0, ((X.AnonymousClass4QX) r3).A00, A00) == false) goto L_0x0001;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C89474cF A02() {
        /*
            r7 = this;
            r6 = 0
        L_0x0001:
            java.lang.Object r5 = r7._prev
            X.4cF r5 = (X.C89474cF) r5
            r0 = r5
        L_0x0006:
            r4 = r6
        L_0x0007:
            java.lang.Object r3 = r0._next
            if (r3 != r7) goto L_0x0016
            if (r5 == r0) goto L_0x0047
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = A01
            boolean r1 = X.AnonymousClass0LG.A00(r7, r5, r0, r1)
            if (r1 != 0) goto L_0x0047
            goto L_0x0001
        L_0x0016:
            boolean r1 = r7.A08()
            if (r1 == 0) goto L_0x001d
            return r6
        L_0x001d:
            if (r3 == r6) goto L_0x0047
            boolean r1 = r3 instanceof X.AnonymousClass4SY
            if (r1 == 0) goto L_0x0029
            X.4SY r3 = (X.AnonymousClass4SY) r3
            r3.A00(r0)
            goto L_0x0001
        L_0x0029:
            boolean r1 = r3 instanceof X.AnonymousClass4QX
            if (r1 == 0) goto L_0x0042
            if (r4 == 0) goto L_0x003d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = A00
            X.4QX r3 = (X.AnonymousClass4QX) r3
            X.4cF r1 = r3.A00
            boolean r0 = X.AnonymousClass0LG.A00(r4, r0, r1, r2)
            if (r0 == 0) goto L_0x0001
            r0 = r4
            goto L_0x0006
        L_0x003d:
            java.lang.Object r0 = r0._prev
            X.4cF r0 = (X.C89474cF) r0
            goto L_0x0007
        L_0x0042:
            X.4cF r3 = (X.C89474cF) r3
            r4 = r0
            r0 = r3
            goto L_0x0007
        L_0x0047:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89474cF.A02():X.4cF");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r0 = (X.AnonymousClass4QX) r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C89474cF A03() {
        /*
            r2 = this;
            java.lang.Object r1 = r2.A01()
            boolean r0 = r1 instanceof X.AnonymousClass4QX
            if (r0 == 0) goto L_0x0010
            r0 = r1
            X.4QX r0 = (X.AnonymousClass4QX) r0
            if (r0 == 0) goto L_0x0010
            X.4cF r1 = r0.A00
            return r1
        L_0x0010:
            X.4cF r1 = (X.C89474cF) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89474cF.A03():X.4cF");
    }

    public final C89474cF A04() {
        C89474cF A022 = A02();
        if (A022 == null) {
            Object obj = this._prev;
            while (true) {
                A022 = (C89474cF) obj;
                if (!A022.A08()) {
                    break;
                }
                obj = A022._prev;
            }
        }
        return A022;
    }

    public final C89474cF A05() {
        Object A012;
        C89474cF r2;
        Object obj;
        do {
            A012 = A01();
            if (A012 instanceof AnonymousClass4QX) {
                return ((AnonymousClass4QX) A012).A00;
            }
            if (A012 == this) {
                return (C89474cF) A012;
            }
            r2 = (C89474cF) A012;
            obj = r2._removedRef;
            if (obj == null) {
                obj = new AnonymousClass4QX(r2);
                A02.lazySet(r2, obj);
            }
        } while (!AnonymousClass0LG.A00(this, A012, obj, A00));
        r2.A02();
        return null;
    }

    public final void A06(C89474cF r3) {
        A01.lazySet(r3, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = A00;
        atomicReferenceFieldUpdater.lazySet(r3, this);
        while (A01() == this) {
            if (AnonymousClass0LG.A00(this, this, r3, atomicReferenceFieldUpdater)) {
                r3.A07(this);
                return;
            }
        }
    }

    public final void A07(C89474cF r3) {
        Object obj;
        do {
            obj = r3._prev;
            if (A01() != r3) {
                return;
            }
        } while (!AnonymousClass0LG.A00(r3, obj, this, A01));
        if (A08()) {
            r3.A02();
        }
    }

    public boolean A08() {
        if (this instanceof C107145Go) {
            return false;
        }
        return A01() instanceof AnonymousClass4QX;
    }

    public boolean A09() {
        if (!(this instanceof C107145Go)) {
            return AnonymousClass000.A1W(A05());
        }
        throw AnonymousClass000.A0V("head cannot be removed");
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(new AnonymousClass5G0(this));
        A0o.append('@');
        return AnonymousClass000.A0h(Integer.toHexString(System.identityHashCode(this)), A0o);
    }
}
