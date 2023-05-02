package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.5GN  reason: invalid class name */
public class AnonymousClass5GN extends C107205Gv implements AnonymousClass1UG, AnonymousClass1UH {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A03;
    public static final /* synthetic */ AtomicReferenceFieldUpdater A04;
    public C109115Qt A00;
    public final AnonymousClass1UG A01;
    public final AnonymousClass1UM A02;
    public volatile /* synthetic */ int _decision = 0;
    public volatile /* synthetic */ Object _state = AnonymousClass595.A00;

    static {
        Class<AnonymousClass5GN> cls = AnonymousClass5GN.class;
        A03 = AtomicIntegerFieldUpdater.newUpdater(cls, "_decision");
        A04 = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_state");
    }

    public AnonymousClass5GN(AnonymousClass1UG r3, int i2) {
        super(i2);
        this.A01 = r3;
        this.A02 = r3.AAx();
    }

    public static final void A00(Object obj, AnonymousClass22J r3) {
        StringBuilder A0r = AnonymousClass000.A0r("It's prohibited to register multiple handlers, tried to register ");
        A0r.append(r3);
        A0r.append(", already has ");
        throw AnonymousClass000.A0V(AnonymousClass000.A0f(obj, A0r));
    }

    public static final void A01(AnonymousClass1UG r5, C107205Gv r6, boolean z2) {
        Object obj;
        if (r6 instanceof AnonymousClass5GM) {
            AnonymousClass5GM r1 = (AnonymousClass5GM) r6;
            obj = r1.A00;
            r1.A00 = C81984Ao.A01;
        } else {
            obj = ((AnonymousClass5GN) r6)._state;
        }
        Throwable A022 = r6.A02(obj);
        if (A022 != null) {
            obj = new C41211vQ(A022);
        } else if ((r6 instanceof AnonymousClass5GN) && (obj instanceof AnonymousClass4WZ)) {
            obj = ((AnonymousClass4WZ) obj).A01;
        }
        if (z2) {
            AnonymousClass5GM r52 = (AnonymousClass5GM) r5;
            AnonymousClass1UG r3 = r52.A02;
            Object obj2 = r52.A01;
            AnonymousClass1UM AAx = r3.AAx();
            Object A002 = C89804cx.A00(obj2, AAx);
            if (A002 != C89804cx.A03) {
                AnonymousClass483.A00(r3, AAx);
            }
            try {
                r3.Acd(obj);
            } finally {
                C89804cx.A01(A002, AAx);
            }
        } else {
            r5.Acd(obj);
        }
    }

    public Throwable A02(Object obj) {
        Throwable A022 = super.A02(obj);
        if (A022 == null) {
            return null;
        }
        return A022;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (((X.AnonymousClass5GM) r4.A01)._reusableCancellableContinuation == null) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03() {
        /*
            r4 = this;
            int r1 = r4.A00
            r0 = 2
            if (r1 != r0) goto L_0x000e
            X.1UG r0 = r4.A01
            X.5GM r0 = (X.AnonymousClass5GM) r0
            java.lang.Object r0 = r0._reusableCancellableContinuation
            r3 = 1
            if (r0 != 0) goto L_0x000f
        L_0x000e:
            r3 = 0
        L_0x000f:
            int r1 = r4._decision
            r2 = 0
            if (r1 == 0) goto L_0x0027
            r0 = 2
            if (r1 != r0) goto L_0x007f
            if (r3 == 0) goto L_0x001c
            r4.A07()
        L_0x001c:
            java.lang.Object r2 = r4._state
            boolean r0 = r2 instanceof X.C90034dO
            if (r0 == 0) goto L_0x0054
            X.4dO r2 = (X.C90034dO) r2
            java.lang.Throwable r0 = r2.A00
            throw r0
        L_0x0027:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = A03
            r0 = 1
            boolean r0 = r1.compareAndSet(r4, r2, r0)
            if (r0 == 0) goto L_0x000f
            X.5Qt r0 = r4.A00
            if (r0 != 0) goto L_0x004c
            X.1UM r1 = r4.A02
            X.58o r0 = X.C004001t.A00
            X.1UL r2 = r1.get(r0)
            X.01t r2 = (X.C004001t) r2
            if (r2 == 0) goto L_0x004c
            X.5GU r1 = new X.5GU
            r1.<init>(r4)
            r0 = 1
            X.5Qt r0 = r2.AIb(r1, r0, r0)
            r4.A00 = r0
        L_0x004c:
            if (r3 == 0) goto L_0x0051
            r4.A07()
        L_0x0051:
            X.41O r2 = X.AnonymousClass41O.COROUTINE_SUSPENDED
            return r2
        L_0x0054:
            int r1 = r4.A00
            r0 = 1
            if (r1 == r0) goto L_0x005c
            r0 = 2
            if (r1 != r0) goto L_0x0076
        L_0x005c:
            X.1UM r1 = r4.A02
            X.58o r0 = X.C004001t.A00
            X.1UL r1 = r1.get(r0)
            X.01t r1 = (X.C004001t) r1
            if (r1 == 0) goto L_0x0076
            boolean r0 = r1.AIc()
            if (r0 != 0) goto L_0x0076
            java.util.concurrent.CancellationException r0 = r1.AAS()
            r4.A00(r0)
            throw r0
        L_0x0076:
            boolean r0 = r2 instanceof X.AnonymousClass4WZ
            if (r0 == 0) goto L_0x007e
            X.4WZ r2 = (X.AnonymousClass4WZ) r2
            java.lang.Object r2 = r2.A01
        L_0x007e:
            return r2
        L_0x007f:
            java.lang.String r0 = "Already suspended"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5GN.A03():java.lang.Object");
    }

    public void A04() {
        C004001t r2 = (C004001t) this.A02.get(C004001t.A00);
        if (r2 != null) {
            C109115Qt AIb = r2.AIb(new AnonymousClass5GU(this), true, true);
            this.A00 = AIb;
            if (!(this._state instanceof AnonymousClass5NK)) {
                AIb.dispose();
                this.A00 = AnonymousClass591.A00;
            }
        }
    }

    public final void A05() {
        C109115Qt r0 = this.A00;
        if (r0 != null) {
            r0.dispose();
            this.A00 = AnonymousClass591.A00;
        }
    }

    public final void A06() {
        if (this.A00 != 2 || ((AnonymousClass5GM) this.A01)._reusableCancellableContinuation == null) {
            A05();
        }
    }

    public final void A07() {
        AnonymousClass5GM r4;
        AnonymousClass4QY r2;
        AnonymousClass1UG r42 = this.A01;
        if ((r42 instanceof AnonymousClass5GM) && (r4 = (AnonymousClass5GM) r42) != null) {
            do {
                Object obj = r4._reusableCancellableContinuation;
                r2 = C81984Ao.A00;
                if (obj != r2) {
                    if (!(obj instanceof Throwable)) {
                        throw AnonymousClass000.A0V(C18450wi.A06("Inconsistent state ", obj));
                    } else if (AnonymousClass0LG.A00(r4, obj, (Object) null, AnonymousClass5GM.A04)) {
                        Throwable th = (Throwable) obj;
                        if (th != null) {
                            A05();
                            A0C(th);
                            return;
                        }
                        return;
                    } else {
                        throw AnonymousClass000.A0T("Failed requirement.");
                    }
                }
            } while (!AnonymousClass0LG.A00(r4, r2, this, AnonymousClass5GM.A04));
        }
    }

    public final void A08(int i2) {
        do {
            int i3 = this._decision;
            boolean z2 = true;
            if (i3 != 0) {
                if (i3 == 1) {
                    boolean z3 = true;
                    AnonymousClass1UG r6 = this.A01;
                    if (i2 != 4) {
                        z3 = false;
                        if (r6 instanceof AnonymousClass5GM) {
                            boolean z4 = true;
                            if (!(i2 == 1 || i2 == 2)) {
                                z4 = false;
                            }
                            int i4 = this.A00;
                            if (!(i4 == 1 || i4 == 2)) {
                                z2 = false;
                            }
                            if (z4 == z2) {
                                C11340ia r2 = ((AnonymousClass5GM) r6).A03;
                                AnonymousClass1UM AAx = r6.AAx();
                                if (r2.A03(AAx)) {
                                    r2.A05(this, AAx);
                                    return;
                                }
                                AnonymousClass5GR A002 = C89704cl.A00();
                                long j2 = A002.A00;
                                if (j2 >= 4294967296L) {
                                    A002.A09(this);
                                    return;
                                }
                                A002.A00 = j2 + 4294967296L;
                                try {
                                    A01(r6, this, true);
                                    do {
                                    } while (A002.A0B());
                                } catch (Throwable th) {
                                    A002.A07();
                                    throw th;
                                }
                                A002.A07();
                                return;
                            }
                        }
                    }
                    A01(r6, this, z3);
                    return;
                }
                throw AnonymousClass000.A0V("Already resumed");
            }
        } while (!A03.compareAndSet(this, 0, 2));
    }

    public void A09(Object obj) {
        A0A(obj, this.A00);
    }

    public final void A0A(Object obj, int i2) {
        Object obj2;
        Object obj3;
        do {
            obj2 = this._state;
            Object obj4 = obj;
            if (obj2 instanceof AnonymousClass5NK) {
                AnonymousClass5NK r9 = (AnonymousClass5NK) obj2;
                obj3 = obj;
                if (!(obj instanceof C90034dO) && ((i2 == 1 || i2 == 2) && (r9 instanceof AnonymousClass5GF) && !(r9 instanceof AnonymousClass5GB))) {
                    obj3 = new AnonymousClass4WZ(obj4, (Object) null, (Throwable) null, (AnonymousClass22J) null, (AnonymousClass5GF) r9);
                }
            } else if (!(obj2 instanceof AnonymousClass5GG) || !AnonymousClass5GG.A00.compareAndSet(obj2, 0, 1)) {
                throw AnonymousClass000.A0V(C18450wi.A06("Already resumed, but proposed with update ", obj));
            } else {
                return;
            }
        } while (!AnonymousClass0LG.A00(this, obj2, obj3, A04));
        A06();
        A08(i2);
    }

    public void A0B(Object obj, C11340ia r5) {
        AnonymousClass5GM r2;
        AnonymousClass1UG r22 = this.A01;
        C11340ia r0 = null;
        if ((r22 instanceof AnonymousClass5GM) && (r2 = (AnonymousClass5GM) r22) != null) {
            r0 = r2.A03;
        }
        A0A(obj, r0 == r5 ? 4 : this.A00);
    }

    public void A0C(Throwable th) {
        Object obj;
        boolean z2;
        AnonymousClass5GF r3;
        do {
            obj = this._state;
            if (obj instanceof AnonymousClass5NK) {
                z2 = obj instanceof AnonymousClass5GF;
            } else {
                return;
            }
        } while (!AnonymousClass0LG.A00(this, obj, new AnonymousClass5GG(th, z2), A04));
        if (z2 && (r3 = (AnonymousClass5GF) obj) != null) {
            A0E(th, r3);
        }
        A06();
        A08(this.A00);
    }

    public final void A0D(Throwable th, AnonymousClass22J r6) {
        try {
            r6.AIU(th);
        } catch (Throwable th2) {
            AnonymousClass484.A00(this.A02, new C105595Af(C18450wi.A06("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    public final void A0E(Throwable th, AnonymousClass5GF r6) {
        try {
            r6.A00(th);
        } catch (Throwable th2) {
            AnonymousClass484.A00(this.A02, new C105595Af(C18450wi.A06("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    public void A0F(AnonymousClass22J r14) {
        boolean A002;
        AnonymousClass5GF r6 = r14 instanceof AnonymousClass5GF ? (AnonymousClass5GF) r14 : new AnonymousClass5GE(r14);
        do {
            Object obj = this._state;
            if (obj instanceof AnonymousClass595) {
                A002 = AnonymousClass0LG.A00(this, obj, r6, A04);
                continue;
            } else {
                if (!(obj instanceof AnonymousClass5GF)) {
                    if (obj instanceof C90034dO) {
                        C90034dO r1 = (C90034dO) obj;
                        if (r1.A00()) {
                            if (obj instanceof AnonymousClass5GG) {
                                A0D(r1.A00, r14);
                                return;
                            }
                            return;
                        }
                    } else if (obj instanceof AnonymousClass4WZ) {
                        AnonymousClass4WZ r12 = (AnonymousClass4WZ) obj;
                        if (r12.A04 == null) {
                            if (!(r6 instanceof AnonymousClass5GB)) {
                                Throwable th = r12.A02;
                                if (th != null) {
                                    A0D(th, r14);
                                    return;
                                } else {
                                    A002 = AnonymousClass0LG.A00(this, obj, new AnonymousClass4WZ(r12.A01, r12.A00, th, r12.A03, r6), A04);
                                    continue;
                                }
                            } else {
                                return;
                            }
                        }
                    } else if (!(r6 instanceof AnonymousClass5GB)) {
                        A002 = AnonymousClass0LG.A00(this, obj, new AnonymousClass4WZ(obj, (Object) null, (Throwable) null, (AnonymousClass22J) null, r6), A04);
                        continue;
                    } else {
                        return;
                    }
                }
                A00(obj, r14);
                throw AnonymousClass000.A0Z();
            }
        } while (!A002);
    }

    public AnonymousClass1UH AAO() {
        AnonymousClass1UG r1 = this.A01;
        if (r1 instanceof AnonymousClass1UH) {
            return (AnonymousClass1UH) r1;
        }
        return null;
    }

    public AnonymousClass1UM AAx() {
        return this.A02;
    }

    public void Acd(Object obj) {
        Throwable A002 = C41201vP.A00(obj);
        if (A002 != null) {
            obj = new C90034dO(A002, false);
        }
        A0A(obj, this.A00);
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("CancellableContinuation");
        A0r.append('(');
        A0r.append(AnonymousClass486.A00(this.A01));
        A0r.append("){");
        Object obj = this._state;
        A0r.append(obj instanceof AnonymousClass5NK ? "Active" : obj instanceof AnonymousClass5GG ? "Cancelled" : "Completed");
        A0r.append("}@");
        return AnonymousClass000.A0h(Integer.toHexString(System.identityHashCode(this)), A0r);
    }
}
