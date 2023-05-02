package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.5Gp  reason: invalid class name and case insensitive filesystem */
public abstract class C107155Gp extends C89474cF implements AnonymousClass22J {
    public void A0A(Throwable th) {
        AnonymousClass22J r0;
        if (this instanceof C107005Ga) {
            ((C107005Ga) this).A00.Acd(AnonymousClass22M.A00);
            return;
        }
        if (this instanceof AnonymousClass5GZ) {
            r0 = ((AnonymousClass5GZ) this).A00;
        } else if (this instanceof AnonymousClass5GV) {
            AnonymousClass5GV r3 = (AnonymousClass5GV) this;
            if (AnonymousClass5GV.A01.compareAndSet(r3, 0, 1)) {
                r0 = r3.A00;
            } else {
                return;
            }
        } else {
            if (this instanceof AnonymousClass5GW) {
                AnonymousClass5GW r02 = (AnonymousClass5GW) this;
                C13650mo r1 = r02.A00;
                C11030i5 r03 = r02.A00;
                if (r03 != null) {
                    r1.AaA(r03);
                    return;
                }
            } else {
                AnonymousClass5GU r04 = (AnonymousClass5GU) this;
                AnonymousClass5GN r5 = r04.A00;
                C11030i5 r05 = r04.A00;
                if (r05 != null) {
                    CancellationException AAS = r05.AAS();
                    if (r5.A00 == 2) {
                        AnonymousClass5GM r32 = (AnonymousClass5GM) r5.A01;
                        if (r32._reusableCancellableContinuation != null) {
                            while (true) {
                                Object obj = r32._reusableCancellableContinuation;
                                AnonymousClass4QY r12 = C81984Ao.A00;
                                if (C18450wi.A0R(obj, r12)) {
                                    if (AnonymousClass0LG.A00(r32, r12, AAS, AnonymousClass5GM.A04)) {
                                        return;
                                    }
                                } else if (obj instanceof Throwable) {
                                    return;
                                } else {
                                    if (AnonymousClass0LG.A00(r32, obj, (Object) null, AnonymousClass5GM.A04)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    r5.A0C(AAS);
                    r5.A06();
                    return;
                }
            }
            throw C18450wi.A03("job");
        }
        r0.AIU(th);
    }
}
