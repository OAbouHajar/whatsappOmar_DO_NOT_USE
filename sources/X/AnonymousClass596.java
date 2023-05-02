package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.596  reason: invalid class name */
public abstract class AnonymousClass596 implements C12930lC {
    public static final /* synthetic */ AtomicReferenceFieldUpdater A01 = AtomicReferenceFieldUpdater.newUpdater(AnonymousClass596.class, Object.class, "onCloseHandler");
    public final C107145Go A00 = new C107145Go();
    public volatile /* synthetic */ Object onCloseHandler = null;

    public Object A00(Object obj) {
        C107135Gn A03;
        do {
            A03 = A03();
            if (A03 == null) {
                return AnonymousClass4B9.A01;
            }
        } while (A03.A0A() == null);
        C107075Gh r1 = (C107075Gh) A03;
        r1.A01.A00 = obj;
        AnonymousClass5GN r12 = r1.A00;
        r12.A08(r12.A00);
        return AnonymousClass4B9.A02;
    }

    public String A01() {
        return "";
    }

    public final C107145Go A02() {
        return this.A00;
    }

    public C107135Gn A03() {
        C89474cF r3;
        C107145Go r4 = this.A00;
        while (true) {
            r3 = (C89474cF) r4.A01();
            if (r3 == r4 || !(r3 instanceof C107135Gn)) {
                r3 = null;
            } else {
                C89474cF A05 = r3.A05();
                if (A05 == null) {
                    break;
                }
                while (true) {
                    Object A012 = A05.A01();
                    if (!(A012 instanceof AnonymousClass4QX)) {
                        break;
                    }
                    A05 = ((AnonymousClass4QX) A012).A00;
                }
                A05.A02();
            }
        }
        r3 = null;
        return (C107135Gn) r3;
    }

    public final Object Ah5(Object obj) {
        Object A002 = A00(obj);
        if (A002 == AnonymousClass4B9.A02) {
            return AnonymousClass22M.A00;
        }
        if (A002 == AnonymousClass4B9.A01) {
            this.A00.A04();
            return AnonymousClass4A8.A00;
        }
        throw AnonymousClass000.A0V(C18450wi.A06("trySend returned ", A002));
    }

    public String toString() {
        String A06;
        StringBuilder A0o = AnonymousClass000.A0o();
        A0o.append(AnonymousClass3K2.A0l(this, A0o));
        A0o.append('{');
        C107145Go r4 = this.A00;
        C89474cF A03 = r4.A03();
        if (A03 == r4) {
            A06 = "EmptyQueue";
        } else {
            A06 = A03 instanceof C107135Gn ? "ReceiveQueued" : C18450wi.A06("UNEXPECTED:", A03);
            if (r4.A04() != A03) {
                StringBuilder A0q = AnonymousClass000.A0q(A06);
                A0q.append(",queueSize=");
                int i2 = 0;
                for (C89474cF r2 = (C89474cF) r4.A01(); !C18450wi.A0R(r2, r4); r2 = r2.A03()) {
                    if (r2 != null) {
                        i2++;
                    }
                }
                A06 = AnonymousClass000.A0l(A0q, i2);
            }
        }
        A0o.append(A06);
        A0o.append('}');
        return AnonymousClass000.A0h(A01(), A0o);
    }
}
