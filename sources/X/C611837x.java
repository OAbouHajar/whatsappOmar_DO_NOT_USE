package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.37x  reason: invalid class name and case insensitive filesystem */
public class C611837x {
    public static final Object A00(C109615Sw r8) {
        Object A00;
        C31201dg r3;
        String str;
        AnonymousClass424 AaO = r8.AaO();
        AnonymousClass424 r6 = AnonymousClass424.START_OBJECT;
        if (AaO == r6) {
            C69883fl r32 = null;
            while (true) {
                AnonymousClass424 ALo = r8.ALo();
                AnonymousClass424 r5 = AnonymousClass424.END_OBJECT;
                if (ALo != r5) {
                    String AaN = r8.AaN();
                    int A002 = C807145e.A00(AaN);
                    boolean z2 = false;
                    if (A002 >= 32) {
                        z2 = true;
                    }
                    r8.ALo();
                    if (!z2 || 13347 != A002) {
                        C69883fl r33 = new C69883fl((List) null, A002, 10);
                        if (!z2) {
                            C29691b2.A00("BloksModelParser", String.format("Unexpectedly attempting to parse\"\n              + \" an unminified payload: %s", AnonymousClass000.A1a(AaN)));
                            r3 = r33;
                        } else if (r8.AaO() != r6) {
                            r8.Afy();
                            r3 = null;
                        } else {
                            while (r8.ALo() != r5) {
                                int A003 = C807145e.A00(r8.AaN());
                                r8.ALo();
                                switch (r8.AaO().ordinal()) {
                                    case 0:
                                        ArrayList A0u = AnonymousClass000.A0u();
                                        while (r8.ALo() != AnonymousClass424.END_ARRAY) {
                                            if (r8.AaO() == r6) {
                                                A00 = A00(r8);
                                                if (A00 == null) {
                                                }
                                            } else {
                                                A00 = AnonymousClass3A0.A00(r8);
                                            }
                                            A0u.add(A00);
                                        }
                                        r33.A02.put(A003, A0u);
                                        break;
                                    case 2:
                                        r33.A02.put(A003, A00(r8));
                                        break;
                                    case 5:
                                        r33.A02.put(A003, r8.AaP().AgS());
                                        break;
                                    case 6:
                                        r33.A02.put(A003, C87574Xm.A00(r8.AaP()));
                                        break;
                                    case 7:
                                        r33.A02.put(A003, r8.AaP().ALr());
                                        break;
                                    case 8:
                                        r33.A02.put(A003, Boolean.valueOf(r8.AaP().A5e()));
                                        break;
                                }
                                r8.Afy();
                            }
                            r33.A0R();
                            r3 = r33;
                        }
                    } else {
                        C84624Lg r4 = new C84624Lg();
                        if (r8.AaO() != r6) {
                            r8.Afy();
                            r4 = null;
                        } else {
                            while (r8.ALo() != r5) {
                                int A004 = C807145e.A00(r8.AaN());
                                r8.ALo();
                                if (35 == A004) {
                                    r4.A00 = (C31201dg) A00(r8);
                                } else if (33 == A004) {
                                    C109625Sx AaP = r8.AaP();
                                    AnonymousClass424 AaO2 = r8.AaO();
                                    switch (AaO2.ordinal()) {
                                        case 5:
                                            str = AaP.AgS();
                                            break;
                                        case 7:
                                            str = String.valueOf(AaP.AKa());
                                            break;
                                        default:
                                            throw new AnonymousClass40K(AnonymousClass000.A0g("Bloks id only supports long and String types but got: ", AaO2));
                                    }
                                    r4.A03 = str;
                                } else if (38 == A004) {
                                    r4.A02 = C87574Xm.A00(r8.AaP());
                                } else if (43 == A004) {
                                    r4.A01 = C87574Xm.A00(r8.AaP());
                                }
                                r8.Afy();
                            }
                        }
                        C31201dg r0 = r4.A00;
                        if (r0 != null) {
                            C31201dg r34 = new C31201dg(r0, r4);
                            r4.A00 = null;
                            r3 = r34;
                        } else {
                            throw new AnonymousClass40K("Shadow component should never be a leaf node");
                        }
                    }
                    r8.Afy();
                    r32 = r3;
                } else {
                    if (r32 == null) {
                        C29691b2.A02("BloksParser", new IOException("unknown bloks data type"));
                    }
                    return r32;
                }
            }
        } else {
            r8.Afy();
            throw new IOException("Token parsing error.");
        }
    }
}
