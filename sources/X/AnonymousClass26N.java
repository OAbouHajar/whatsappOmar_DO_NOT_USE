package X;

import com.facebook.redex.RunnableRunnableShape1S0201000_I1;
import com.facebook.redex.RunnableRunnableShape1S1200000_I1;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.List;
import java.util.Map;

/* renamed from: X.26N  reason: invalid class name */
public abstract class AnonymousClass26N implements C448025p {
    public void A5s(AnonymousClass2JT r14) {
        IllegalStateException illegalStateException;
        int i2;
        C16300so r2;
        String str;
        try {
            if (r14.A00 == 0) {
                Object obj = r14.A02.A00;
                if (obj != null) {
                    AnonymousClass26L r3 = (AnonymousClass26L) this;
                    C18690x6 r7 = r3.A04;
                    boolean z2 = r3 instanceof C55242j8;
                    UserJid userJid = z2 ? ((C55242j8) r3).A02.A03 : r3 instanceof AnonymousClass2j5 ? ((AnonymousClass2j5) r3).A04.A00 : r3 instanceof AnonymousClass26R ? ((AnonymousClass26R) r3).A06.A00 : r3 instanceof AnonymousClass26K ? ((AnonymousClass26K) r3).A05.A05 : r3 instanceof C59642yd ? ((C59642yd) r3).A02.A04 : ((C59632yc) r3).A02.A02;
                    int i3 = r3.A00;
                    r7.A03.Acl(new AnonymousClass564(r7, userJid, i3, 1, -1));
                    AnonymousClass4IY r6 = r3.A05;
                    Integer A01 = C18740xB.A01(r3.A01(), i3);
                    if (A01 != null) {
                        AnonymousClass4L0 r72 = new AnonymousClass4L0(userJid, "graphql", false);
                        AnonymousClass4IZ r62 = r6.A01;
                        RunnableRunnableShape1S0201000_I1 runnableRunnableShape1S0201000_I1 = new RunnableRunnableShape1S0201000_I1(r72, A01.intValue(), r62, 9);
                        if (r62.A00 != null) {
                            runnableRunnableShape1S0201000_I1.run();
                        }
                    }
                    if (z2) {
                        C55242j8 r32 = (C55242j8) r3;
                        StringBuilder sb = new StringBuilder("GetSingleCollectionGraphQLService/sendRequest/success jid=");
                        C55252j9 r1 = r32.A02;
                        sb.append(r1.A03);
                        Log.i(sb.toString());
                        r32.A05();
                        r32.A00.A01((C83514Gz) obj, r1);
                        return;
                    }
                    if (r3 instanceof AnonymousClass2j5) {
                        AnonymousClass2j5 r33 = (AnonymousClass2j5) r3;
                        C49822Vz r22 = (C49822Vz) obj;
                        r33.A08.A01("plm_details_view_tag");
                        r33.A01.A08(r33.A04.A00, r22.A02);
                        List list = r22.A01;
                        if (list == null || list.isEmpty()) {
                            r33.A02.A01(new C49822Vz(4));
                            r2 = r33.A00;
                            str = "GetProductListGraphQLService/onSuccessResponse error";
                        } else {
                            r33.A02.A01(r22);
                            return;
                        }
                    } else if (r3 instanceof AnonymousClass26R) {
                        AnonymousClass26R r34 = (AnonymousClass26R) r3;
                        AnonymousClass4H3 r23 = (AnonymousClass4H3) obj;
                        r34.A09.A01("view_product_tag");
                        C17150uc r12 = r34.A00;
                        AnonymousClass26S r5 = r34.A06;
                        UserJid userJid2 = r5.A00;
                        r12.A08(userJid2, r23.A01);
                        C35701mM r13 = r23.A00;
                        if (r13 != null) {
                            r34.A01.A0C(r13, userJid2);
                            AnonymousClass4Q4 r4 = r34.A02;
                            r4.A00.A06.A0K(new RunnableRunnableShape1S1200000_I1(r4, r13.A0D, r5, 4));
                            return;
                        }
                        return;
                    } else if (r3 instanceof AnonymousClass26K) {
                        AnonymousClass26K r35 = (AnonymousClass26K) r3;
                        AnonymousClass4H2 r24 = (AnonymousClass4H2) obj;
                        r35.A05();
                        AnonymousClass26O r63 = r35.A05;
                        UserJid userJid3 = r63.A05;
                        AnonymousClass2GI r42 = r24.A00;
                        r35.A01.A08(userJid3, r24.A01);
                        AnonymousClass5RX r15 = r35.A03;
                        if (r42 != null) {
                            r15.AYH(r42, r63);
                            return;
                        }
                        r15.AQt(r63, 0);
                        r2 = r35.A00;
                        str = "GetProductCatalogGraphQLService/get product catalog error";
                    } else if (r3 instanceof C59642yd) {
                        C59642yd r36 = (C59642yd) r3;
                        r36.A05();
                        r36.A00.A01((AnonymousClass2GC) obj, r36.A02);
                        return;
                    } else {
                        C59632yc r37 = (C59632yc) r3;
                        AnonymousClass4Q6 r25 = (AnonymousClass4Q6) obj;
                        if (r25.A00.isEmpty()) {
                            r37.A01.A00.AR4(r37.A02, 0);
                            return;
                        } else {
                            r37.A01.A00.AR5(r37.A02, r25);
                            return;
                        }
                    }
                    r2.AcB(str, "error_code=0", true);
                    return;
                }
                illegalStateException = new IllegalStateException("No GraphQL Response available");
            } else {
                Map map = r14.A03.A00;
                if (map != null) {
                    AnonymousClass26M r26 = (AnonymousClass26M) this;
                    try {
                        if (!map.isEmpty()) {
                            C32121fg r16 = (C32121fg) map.values().iterator().next();
                            switch (r16.A01) {
                                case 2498048:
                                    i2 = 451;
                                    break;
                                case 2498049:
                                case 2498050:
                                case 2498051:
                                case 2498052:
                                    i2 = 404;
                                    break;
                                case 2498053:
                                    i2 = 406;
                                    break;
                                case 2498054:
                                case 2498056:
                                    i2 = 0;
                                    break;
                                case 2498055:
                                    i2 = 500;
                                    break;
                                default:
                                    i2 = -1;
                                    break;
                            }
                            r26.A00(r16, i2);
                            return;
                        }
                        throw new IllegalArgumentException("GraphQL errors map is empty");
                    } catch (Exception e2) {
                        r26.AQa(e2);
                        return;
                    }
                } else {
                    illegalStateException = new IllegalStateException("Error response received but no errors found");
                }
            }
            throw illegalStateException;
        } catch (Exception e3) {
            AQa(e3);
        }
    }
}
