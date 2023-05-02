package com.facebook.optic;

import X.AnonymousClass000;
import X.AnonymousClass5xH;
import X.AnonymousClass5zC;
import X.AnonymousClass5zD;
import X.C110105dW;
import X.C114875ok;
import X.C116005qf;
import X.C116965sE;
import X.C118525up;
import X.C118595uw;
import X.C119575yh;
import X.C1223369e;
import X.C13680ns;
import X.C13690nt;
import android.graphics.Point;

public class IDxSCallbackShape43S0100000_3_I1 extends C118595uw {
    public Object A00;
    public final int A01;

    public IDxSCallbackShape43S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public static void A00() {
        AnonymousClass5xH.A00();
    }

    public static void A01(IDxSCallbackShape43S0100000_3_I1 iDxSCallbackShape43S0100000_3_I1) {
        ((AnonymousClass5zD) iDxSCallbackShape43S0100000_3_I1.A00).A0V.A09(C114875ok.EXCEPTION, (float[]) null);
    }

    public void A02(Exception exc) {
        switch (this.A01) {
            case 0:
                C119575yh r4 = (C119575yh) this.A00;
                synchronized (r4.A0U) {
                    if (r4.A0X) {
                        r4.A0X = false;
                        C116005qf r2 = r4.A0W;
                        r4.A0W = null;
                        if (r2 != null) {
                            Object[] A1Z = C13690nt.A1Z();
                            C13690nt.A1L(r2, exc, A1Z);
                            C119575yh.A00(r4, A1Z, 10);
                        }
                    }
                }
                return;
            case 1:
                ((C119575yh) this.A00).A08 = null;
                return;
            case 2:
                return;
            case 5:
                C118525up r3 = ((AnonymousClass5zC) this.A00).A0K;
                r3.A00((Point) null, C114875ok.EXCEPTION, r3.A02);
                return;
            case 6:
                A00();
                return;
            case 7:
                A01(this);
                return;
            default:
                C119575yh r22 = (C119575yh) this.A00;
                if (!r22.A0E) {
                    Object[] A1Z2 = C13690nt.A1Z();
                    C13690nt.A1L(r22.A0T.A00, exc, A1Z2);
                    C119575yh.A00(r22, A1Z2, 3);
                    return;
                }
                return;
        }
    }

    public /* bridge */ /* synthetic */ void A03(Object obj) {
        C119575yh r2;
        int i2;
        C116005qf r0;
        C1223369e r1;
        switch (this.A01) {
            case 0:
                C119575yh r3 = (C119575yh) this.A00;
                synchronized (r3.A0U) {
                    if (r3.A0X && (r0 = r3.A0W) != null) {
                        Object[] A1a = C110105dW.A1a(r0);
                        A1a[1] = obj;
                        C119575yh.A00(r3, A1a, 8);
                    }
                }
                return;
            case 1:
                ((C119575yh) this.A00).A08 = null;
                return;
            case 2:
                C119575yh r22 = (C119575yh) this.A00;
                C119575yh.A00(r22, new Object[]{r22, r22.A08, Integer.valueOf(r22.A06), Integer.valueOf(r22.A05)}, 15);
                return;
            case 3:
                C116965sE r5 = (C116965sE) obj;
                r2 = (C119575yh) this.A00;
                r2.A08 = r5;
                if (!r2.A0E) {
                    r2.A09(r5);
                    C1223369e r12 = r2.A0N;
                    r12.AeD(r2.A0K);
                    if (r2.A09 != null) {
                        r12.A4d(r2.A0P);
                    }
                    i2 = 1;
                    break;
                } else {
                    return;
                }
            case 4:
                C116965sE r52 = (C116965sE) obj;
                r2 = (C119575yh) this.A00;
                r2.A08 = r52;
                if (!r2.A0E && (r1 = r2.A0N) != null && r1.isConnected()) {
                    int AAP = r1.AAP();
                    int i3 = 0;
                    if (AAP != 0) {
                        i3 = 1;
                        if (1 != AAP) {
                            throw AnonymousClass000.A0a(C13680ns.A0c(AAP, "Could not convert camera facing from optic: "));
                        }
                    }
                    r2.A00 = i3;
                    r2.A09(r52);
                    i2 = 2;
                    break;
                } else {
                    return;
                }
                break;
            default:
                return;
        }
        C119575yh.A00(r2, r2.A0T.A00, i2);
    }
}
