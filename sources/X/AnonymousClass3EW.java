package X;

import com.bloks.components.bkcomponentsslider.BKBloksComponentsSliderBinderUtil;
import com.bloks.stdlib.components.bkcomponentsstdimplprogressbar.BKBloksComponentsStdImplProgressBarBinderUtil;
import com.bloks.stdlib.components.bkcomponentstooltip.BKBloksComponentsTooltipBinderUtil;
import com.bloks.stdlib.components.bkcomponentstooltipcontainer.BKBloksComponentsTooltipContainerBinderUtil;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3EW  reason: invalid class name */
public class AnonymousClass3EW implements AnonymousClass5OK {
    public Object ALl(C14990q7 r5, C31201dg r6) {
        Object A7H;
        float f2;
        AnonymousClass1JY r1 = C90154da.A00().A0B;
        int i2 = r6.A01;
        if (i2 == 13323) {
            return new C808845y();
        }
        if (i2 == 13889) {
            return new AnonymousClass460();
        }
        if (i2 == 13948) {
            return new C808745x();
        }
        if (!(i2 == 14005 || i2 == 14093 || i2 == 15763 || i2 == 15972 || i2 == 15981 || i2 == 16094)) {
            switch (i2) {
                case 13496:
                    A7H = r1.A00.A7H();
                    break;
                case 13497:
                case 13499:
                    break;
                case 13498:
                    return new AnonymousClass4DG();
                default:
                    switch (i2) {
                        case 13501:
                            return new C99134tX(r6.A0K(50, ""));
                        case 13502:
                            return new C808945z();
                        case 13503:
                        case 13504:
                            break;
                        default:
                            if (C806344w.A00(i2)) {
                                if (i2 != 13317) {
                                    if (!(i2 == 13320 || i2 == 13326)) {
                                        if (i2 == 13336) {
                                            String A0J = r6.A0J(53);
                                            if (A0J != null) {
                                                try {
                                                    f2 = C62163Bx.A01(A0J);
                                                } catch (AnonymousClass40K e2) {
                                                    C29691b2.A01("TextInputBinderUtils", "Error parsing text input size", e2);
                                                }
                                                A7H = new AnonymousClass38S(r6.A0K(50, ""), f2);
                                                break;
                                            }
                                            f2 = 0.0f;
                                            A7H = new AnonymousClass38S(r6.A0K(50, ""), f2);
                                        } else if (i2 == 16160) {
                                            A7H = BKBloksComponentsSliderBinderUtil.createController(r5, r6);
                                            break;
                                        } else if (!(i2 == 15778 || i2 == 15728 || i2 == 13334 || i2 == 13666 || i2 == 13329 || i2 == 13335)) {
                                            if (i2 == 13797) {
                                                AtomicInteger atomicInteger = AnonymousClass494.A00;
                                                A7H = C13680ns.A0F(Integer.valueOf(atomicInteger.incrementAndGet()), atomicInteger.incrementAndGet());
                                                break;
                                            } else if (i2 == 16229) {
                                                A7H = BKBloksComponentsStdImplProgressBarBinderUtil.createController(r5, r6);
                                                break;
                                            } else if (i2 == 13708) {
                                                A7H = BKBloksComponentsTooltipBinderUtil.createController(r5, r6);
                                                break;
                                            } else if (i2 == 16444) {
                                                A7H = BKBloksComponentsTooltipContainerBinderUtil.createController(r5, r6);
                                                break;
                                            } else if (i2 == 13327) {
                                                A7H = new C99124tW(r6.A0P(38, false));
                                                break;
                                            } else {
                                                Object[] A1b = C13680ns.A1b();
                                                AnonymousClass000.A1M(A1b, i2, 0);
                                                throw AnonymousClass000.A0T(String.format("No implementation bound to key: %s", A1b));
                                            }
                                        }
                                    }
                                    A7H = null;
                                    break;
                                } else {
                                    A7H = new AnonymousClass39I(new AnonymousClass4Bp(), new C57522rJ(r5, r6, AnonymousClass45Z.A00(r6)), new C85414Oi());
                                    break;
                                }
                            }
                            break;
                    }
            }
            if (A7H != null) {
                return A7H;
            }
        }
        return C90154da.A00().A08.A01(r5, r6);
    }
}
