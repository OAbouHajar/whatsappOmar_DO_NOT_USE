package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: X.4as  reason: invalid class name and case insensitive filesystem */
public final class C88654as {
    public static final C88654as A02 = new C88654as();
    public final AnonymousClass5M7 A00 = new C98564sc();
    public final ConcurrentMap A01 = new ConcurrentHashMap();

    public final AnonymousClass5TK A00(Class cls) {
        AnonymousClass5M4 r8;
        C88844bB r5;
        AnonymousClass45M r9;
        AnonymousClass45K r4;
        AnonymousClass5O7 r6;
        AnonymousClass45M r2;
        AnonymousClass45K r1;
        Class cls2;
        if (cls != null) {
            ConcurrentMap concurrentMap = this.A01;
            AnonymousClass5TK r42 = (AnonymousClass5TK) concurrentMap.get(cls);
            if (r42 == null) {
                C98564sc r12 = (C98564sc) this.A00;
                Class<C67293bJ> cls3 = C67293bJ.class;
                if (cls3.isAssignableFrom(cls) || (cls2 = C90944f7.A03) == null || cls2.isAssignableFrom(cls)) {
                    AnonymousClass5M3 Aj5 = r12.A00.Aj5(cls);
                    C98474sT r52 = (C98474sT) Aj5;
                    int i2 = r52.A00;
                    if ((i2 & 2) == 2) {
                        if (cls3.isAssignableFrom(cls)) {
                            r2 = C90944f7.A02;
                            r1 = C81864Aa.A00;
                        } else {
                            r2 = C90944f7.A00;
                            r1 = C81864Aa.A01;
                            if (r1 == null) {
                                throw AnonymousClass000.A0V("Protobuf runtime is not correctly loaded.");
                            }
                        }
                        r42 = new C98544sa(r1, r52.A01, r2);
                    } else {
                        boolean isAssignableFrom = cls3.isAssignableFrom(cls);
                        boolean A1R = AnonymousClass000.A1R(i2 & 1, 1);
                        if (isAssignableFrom) {
                            r8 = C81894Ad.A01;
                            r5 = C88844bB.A01;
                            r9 = C90944f7.A02;
                            if (A1R) {
                                r4 = C81864Aa.A00;
                                r6 = C81884Ac.A01;
                            } else {
                                r4 = null;
                                r6 = C81884Ac.A01;
                            }
                        } else {
                            r8 = C81894Ad.A00;
                            r5 = C88844bB.A00;
                            if (A1R) {
                                r9 = C90944f7.A00;
                                r4 = C81864Aa.A01;
                                if (r4 != null) {
                                    r6 = C81884Ac.A00;
                                } else {
                                    throw AnonymousClass000.A0V("Protobuf runtime is not correctly loaded.");
                                }
                            } else {
                                r9 = C90944f7.A01;
                                r4 = null;
                                r6 = C81884Ac.A00;
                            }
                        }
                        r42 = C98554sb.A0D(r4, r5, r6, Aj5, r8, r9);
                    }
                    AnonymousClass5TK r0 = (AnonymousClass5TK) concurrentMap.putIfAbsent(cls, r42);
                    if (r0 != null) {
                        return r0;
                    }
                } else {
                    throw AnonymousClass000.A0T("Message classes must extend GeneratedMessage or GeneratedMessageLite");
                }
            }
            return r42;
        }
        throw AnonymousClass000.A0W("messageType");
    }
}
