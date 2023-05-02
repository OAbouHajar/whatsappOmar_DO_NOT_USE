package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass5wJ;
import X.AnonymousClass5xH;
import X.AnonymousClass5zC;
import X.AnonymousClass5zD;
import X.AnonymousClass67L;
import X.C111095fK;
import X.C111185fT;
import X.C115105p9;
import X.C116955sD;
import X.C116965sE;
import X.C117825tc;
import X.C118595uw;
import X.C118715v8;
import X.C118995vk;
import X.C119245wm;
import X.C119335wv;
import X.C1223469f;
import X.C13680ns;
import android.hardware.Camera;
import java.util.Map;
import java.util.concurrent.Callable;

public class IDxCallableShape0S0302000_3_I1 implements Callable {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public final int A05;

    public IDxCallableShape0S0302000_3_I1(Object obj, Object obj2, Object obj3, int i2, int i3, int i4) {
        this.A05 = i4;
        this.A02 = obj2;
        this.A03 = obj;
        this.A01 = i2;
        this.A04 = obj3;
        this.A00 = i3;
    }

    public static /* bridge */ /* synthetic */ Object A00(IDxCallableShape0S0302000_3_I1 iDxCallableShape0S0302000_3_I1) {
        String str;
        C111185fT r0;
        AnonymousClass5xH.A00();
        AnonymousClass5zD r4 = (AnonymousClass5zD) iDxCallableShape0S0302000_3_I1.A02;
        if (!(r4.A0i == null || r4.A0i == ((C118715v8) iDxCallableShape0S0302000_3_I1.A03).A02)) {
            r4.A0i.A01();
        }
        C118715v8 r1 = (C118715v8) iDxCallableShape0S0302000_3_I1.A03;
        r4.A0i = r1.A02;
        r4.A0A = null;
        r4.A0A = new C115105p9();
        r4.A07 = r1;
        C1223469f r3 = (C1223469f) iDxCallableShape0S0302000_3_I1.A04;
        r4.A0B = r3;
        Map map = (Map) r3.A9Z(C1223469f.A01);
        if (!map.isEmpty()) {
            C118995vk r12 = r4.A0U;
            if (!map.isEmpty()) {
                r12.A00 = map;
                if (r12.A03.A09()) {
                    r12.A08();
                }
            }
        }
        r4.A01 = iDxCallableShape0S0302000_3_I1.A00;
        r4.A0K = AnonymousClass000.A1X(r3.A9Z(C1223469f.A09));
        C118995vk r2 = r4.A0U;
        if (r2.A04 == null) {
            r2.A03.A06("Number of cameras must be loaded on background thread.");
            r2.A07();
        }
        if (r2.A04.length != 0) {
            int i2 = iDxCallableShape0S0302000_3_I1.A01;
            if (r2.A03.A09()) {
                int i3 = 1;
                if (i2 == 1) {
                    i3 = 0;
                }
                if (!r2.A09(Integer.valueOf(i3))) {
                    if (r2.A04 == null) {
                        str = "Logical cameras not initialised!";
                    } else if (r2.A04.length != 0) {
                        if (i2 == 0) {
                            if (r2.A09(C13680ns.A0X())) {
                                AnonymousClass5xH.A02("CameraInventory", "Requested back camera doesn't exist, using front instead");
                                i2 = 1;
                            }
                        } else if (r2.A09(1)) {
                            AnonymousClass5xH.A02("CameraInventory", "Requested front camera doesn't exist, using back instead");
                            i2 = 0;
                        }
                        StringBuilder A0r = AnonymousClass000.A0r("found ");
                        A0r.append(r2.A04.length);
                        str = AnonymousClass000.A0h(" cameras with bad facing constants", A0r);
                    } else {
                        throw new C111095fK();
                    }
                }
                r4.A09 = new C119335wv();
                String A06 = r2.A06(i2);
                try {
                    AnonymousClass5zD.A06(r4, A06);
                    AnonymousClass5zD.A07(r4, A06);
                    AnonymousClass5zD.A05(r4);
                    AnonymousClass5zD.A08(r4, A06);
                    AnonymousClass5xH.A00();
                    int i4 = r4.A00;
                    AnonymousClass5wJ AAT = r4.AAT();
                    if (r4.isConnected() && (r0 = r4.A0C) != null) {
                        return new C116965sE(new C116955sD(AAT, r0, i4));
                    }
                    throw new AnonymousClass67L("Cannot get camera settings");
                } catch (Exception e2) {
                    AnonymousClass5xH.A00();
                    r4.A81((C118595uw) null);
                    throw e2;
                }
            } else {
                str = "Cannot resolve camera facing, not on the Optic thread";
            }
            throw AnonymousClass000.A0a(str);
        }
        throw new C111095fK();
    }

    public /* bridge */ /* synthetic */ Object call() {
        Throwable th;
        if (this.A05 != 0) {
            return A00(this);
        }
        try {
            AnonymousClass5xH.A00();
            AnonymousClass5zC r3 = (AnonymousClass5zC) this.A02;
            if (!(r3.A0Z == null || r3.A0Z == ((C118715v8) this.A03).A02)) {
                r3.A0Z.A01();
                r3.A0Z = null;
            }
            C119245wm r5 = r3.A0J;
            int i2 = C119245wm.A02;
            if (i2 == -1) {
                r5.A01.A06("Number of cameras must be loaded on background thread.");
                i2 = Camera.getNumberOfCameras();
                C119245wm.A02 = i2;
            }
            if (i2 != 0) {
                int i3 = this.A01;
                if (r5.A01.A09()) {
                    if (r5.A02(i3) == -1) {
                        int i4 = C119245wm.A02;
                        if (i4 == -1) {
                            AnonymousClass5xH.A01("CameraInventory", "Camera count was not initialised");
                            i4 = Camera.getNumberOfCameras();
                            C119245wm.A02 = i4;
                        }
                        if (i4 != 0) {
                            if (i3 == 0) {
                                if (r5.A02(1) != -1) {
                                    AnonymousClass5xH.A02("CameraInventory", "Requested back camera doesn't exist, using front instead");
                                    i3 = 1;
                                }
                            } else if (r5.A02(0) != -1) {
                                AnonymousClass5xH.A02("CameraInventory", "Requested front camera doesn't exist, using back instead");
                                i3 = 0;
                            }
                            StringBuilder A0r = AnonymousClass000.A0r("found ");
                            A0r.append(C119245wm.A02);
                            th = AnonymousClass000.A0a(AnonymousClass000.A0h(" cameras with bad facing constants", A0r));
                        } else {
                            th = new C111095fK();
                        }
                    }
                    C1223469f r2 = (C1223469f) this.A04;
                    AnonymousClass5zC.A03(r3, r2, i3);
                    C116965sE A002 = AnonymousClass5zC.A00((C118715v8) this.A03, r3, r2, this.A00);
                    AnonymousClass5xH.A00();
                    return A002;
                }
                th = AnonymousClass000.A0a("Cannot resolve camera facing, not on the Optic thread");
            } else {
                th = new C111095fK();
            }
            throw th;
        } catch (Exception e2) {
            AnonymousClass5xH.A00();
            AnonymousClass5zC r0 = (AnonymousClass5zC) this.A02;
            C117825tc.A00(r0);
            AnonymousClass5zC.A02(r0);
            throw e2;
        }
    }
}
