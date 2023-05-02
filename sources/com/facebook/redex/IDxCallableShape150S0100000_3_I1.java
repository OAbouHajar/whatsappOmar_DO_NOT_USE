package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass5vQ;
import X.AnonymousClass5vU;
import X.AnonymousClass5vW;
import X.AnonymousClass5wI;
import X.AnonymousClass5wJ;
import X.AnonymousClass5wQ;
import X.AnonymousClass5xD;
import X.AnonymousClass5xH;
import X.AnonymousClass5xM;
import X.AnonymousClass5xT;
import X.AnonymousClass5xW;
import X.AnonymousClass5yJ;
import X.AnonymousClass5zC;
import X.AnonymousClass5zD;
import X.AnonymousClass5zN;
import X.AnonymousClass5zQ;
import X.AnonymousClass67C;
import X.AnonymousClass67L;
import X.AnonymousClass67O;
import X.AnonymousClass67P;
import X.C111125fN;
import X.C111185fT;
import X.C111205fV;
import X.C114875ok;
import X.C115805qL;
import X.C115845qP;
import X.C116555rZ;
import X.C116955sD;
import X.C116965sE;
import X.C117835td;
import X.C118525up;
import X.C118995vk;
import X.C119245wm;
import android.graphics.Point;
import android.hardware.Camera;
import java.util.List;
import java.util.concurrent.Callable;

public class IDxCallableShape150S0100000_3_I1 implements Callable {
    public Object A00;
    public final int A01;

    public IDxCallableShape150S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public static /* bridge */ /* synthetic */ Object A01(IDxCallableShape150S0100000_3_I1 iDxCallableShape150S0100000_3_I1) {
        try {
            AnonymousClass5xH.A00();
            AnonymousClass5zD r1 = (AnonymousClass5zD) iDxCallableShape150S0100000_3_I1.A00;
            r1.A0C();
            if (r1.A0i != null) {
                r1.A0i.A01();
                r1.A0i = null;
                r1.A0A = null;
            }
            r1.A07 = null;
            r1.A0B = null;
            return null;
        } catch (Exception e2) {
            throw e2;
        } finally {
            AnonymousClass5xH.A00();
        }
    }

    public static /* bridge */ /* synthetic */ Object A02(IDxCallableShape150S0100000_3_I1 iDxCallableShape150S0100000_3_I1) {
        C111185fT r1;
        AnonymousClass5zD r4 = (AnonymousClass5zD) iDxCallableShape150S0100000_3_I1.A00;
        AnonymousClass5xH.A00();
        try {
            if (AnonymousClass000.A1V(r4.A0h)) {
                boolean A1P = AnonymousClass000.A1P(r4.A00);
                C118995vk r12 = r4.A0U;
                int i2 = 1;
                if (A1P) {
                    i2 = 0;
                }
                if (!r12.A09(Integer.valueOf(i2))) {
                    StringBuilder A0o = AnonymousClass000.A0o();
                    A0o.append("Cannot switch to ");
                    A0o.append(A1P ? "FRONT" : "BACK");
                    throw new AnonymousClass67P(AnonymousClass000.A0h(", camera is not present", A0o));
                }
                r4.A0p = true;
                String A06 = r12.A06(A1P ? 1 : 0);
                AnonymousClass5zD.A06(r4, A06);
                AnonymousClass5zD.A07(r4, A06);
                AnonymousClass5zD.A05(r4);
                AnonymousClass5zD.A08(r4, A06);
                int i3 = r4.A00;
                AnonymousClass5wJ AAT = r4.AAT();
                if (!r4.isConnected() || (r1 = r4.A0C) == null) {
                    throw new AnonymousClass67L("Cannot get camera settings");
                }
                C116965sE r13 = new C116965sE(new C116955sD(AAT, r1, i3));
                AnonymousClass5xH.A00();
                r4.A0p = false;
                return r13;
            }
            throw new AnonymousClass67O("Cannot switch camera, no cameras open.");
        } catch (Exception e2) {
            AnonymousClass5xH.A00();
            throw e2;
        } catch (Throwable th) {
            r4.A0p = false;
            throw th;
        }
    }

    public static /* bridge */ /* synthetic */ Object A03(IDxCallableShape150S0100000_3_I1 iDxCallableShape150S0100000_3_I1) {
        C111185fT r0;
        AnonymousClass5zD r4 = (AnonymousClass5zD) iDxCallableShape150S0100000_3_I1.A00;
        if (r4.isConnected()) {
            r4.A0D();
            if (r4.A0i != null) {
                AnonymousClass5zQ r3 = r4.A0i;
                int i2 = r4.A01;
                int i3 = 90;
                if (i2 != 1) {
                    i3 = 180;
                    if (i2 != 2) {
                        i3 = 270;
                        if (i2 != 3) {
                            i3 = 0;
                        }
                    }
                }
                r3.A02(i3);
            }
            int i4 = r4.A00;
            AnonymousClass5wJ AAT = r4.AAT();
            if (r4.isConnected() && (r0 = r4.A0C) != null) {
                return new C116965sE(new C116955sD(AAT, r0, i4));
            }
            throw new AnonymousClass67L("Cannot get camera settings");
        }
        throw new AnonymousClass67L("Can not update preview display rotation");
    }

    public static /* bridge */ /* synthetic */ Object A04(IDxCallableShape150S0100000_3_I1 iDxCallableShape150S0100000_3_I1) {
        AnonymousClass5zD r1 = (AnonymousClass5zD) iDxCallableShape150S0100000_3_I1.A00;
        if (r1.A0F()) {
            return null;
        }
        AnonymousClass5xW r3 = r1.A0Y;
        if (!r3.A0Q) {
            return null;
        }
        r3.A0N.A07("restart_preview_on_background_thread", new AnonymousClass67C(r3, false, false));
        return null;
    }

    public static /* bridge */ /* synthetic */ Object A07(IDxCallableShape150S0100000_3_I1 iDxCallableShape150S0100000_3_I1) {
        AnonymousClass5xW r4 = ((C115805qL) iDxCallableShape150S0100000_3_I1.A00).A00;
        r4.A0H.A01("Method onCameraSessionActive must be called on Optic Thread.");
        r4.A0N.A04("camera_session_active_on_camera_handler_thread", new IDxCallableShape47S0200000_3_I1(new AnonymousClass5zN(), 5, r4));
        return null;
    }

    public static /* bridge */ /* synthetic */ Object A08(IDxCallableShape150S0100000_3_I1 iDxCallableShape150S0100000_3_I1) {
        C116555rZ r0;
        AnonymousClass5xW r5 = (AnonymousClass5xW) iDxCallableShape150S0100000_3_I1.A00;
        if (r5.A0Q) {
            List list = r5.A0O;
            if (!list.isEmpty() && (r0 = (C116555rZ) list.remove(0)) != null) {
                r5.A0N.A07("restart_preview_on_background_thread", new AnonymousClass67C(r5, r0.A00, r0.A01));
            }
        }
        return null;
    }

    public static /* bridge */ /* synthetic */ Object A09(IDxCallableShape150S0100000_3_I1 iDxCallableShape150S0100000_3_I1) {
        AnonymousClass5xW r1;
        try {
            r1 = (AnonymousClass5xW) iDxCallableShape150S0100000_3_I1.A00;
            AnonymousClass5xD r0 = r1.A09;
            if (r0 != null) {
                r0.A02();
            } else {
                r1.A0K.A02.A01();
            }
        } catch (Exception unused) {
            r1 = (AnonymousClass5xW) iDxCallableShape150S0100000_3_I1.A00;
            r1.A0K.A02.A01();
        }
        return r1.A0K;
    }

    public static /* bridge */ /* synthetic */ Object A0A(IDxCallableShape150S0100000_3_I1 iDxCallableShape150S0100000_3_I1) {
        AnonymousClass5xW r1;
        try {
            r1 = (AnonymousClass5xW) iDxCallableShape150S0100000_3_I1.A00;
            AnonymousClass5xD r0 = r1.A09;
            if (r0 != null) {
                r0.A03();
                r1.A09 = null;
            } else {
                r1.A0K.A02.A01();
            }
        } catch (Exception unused) {
            r1 = (AnonymousClass5xW) iDxCallableShape150S0100000_3_I1.A00;
            r1.A0K.A02.A01();
        }
        return r1.A0K;
    }

    public /* bridge */ /* synthetic */ Object call() {
        boolean z2;
        switch (this.A01) {
            case 0:
                try {
                    AnonymousClass5xH.A00();
                    AnonymousClass5zC.A02((AnonymousClass5zC) this.A00);
                    AnonymousClass5xH.A00();
                    return null;
                } catch (Exception e2) {
                    AnonymousClass5xH.A00();
                    throw e2;
                }
            case 1:
                AnonymousClass5zC r6 = (AnonymousClass5zC) this.A00;
                if (!r6.isConnected()) {
                    return null;
                }
                AnonymousClass5vW r5 = r6.A0M;
                Camera camera = r6.A0Y;
                AnonymousClass5vU r3 = r6.A0R;
                r5.A02(camera, (AnonymousClass5vQ) r3.A02(r6.A00).A05(AnonymousClass5wI.A0m), AnonymousClass5wI.A02(AnonymousClass5wI.A0i, r3.A02(r6.A00)));
                return null;
            case 2:
                AnonymousClass5zC r2 = (AnonymousClass5zC) this.A00;
                if (!r2.isConnected()) {
                    return null;
                }
                AnonymousClass5vW r1 = r2.A0M;
                synchronized (r1) {
                    z2 = !r1.A05.A00.isEmpty();
                }
                if (z2) {
                    return null;
                }
                r1.A01(r2.A0Y);
                synchronized (r1) {
                    r1.A06.clear();
                }
                return null;
            case 3:
                AnonymousClass5zC r12 = (AnonymousClass5zC) this.A00;
                if (!r12.isConnected() || r12.A0e) {
                    return null;
                }
                C118525up r32 = r12.A0K;
                r32.A06.A06("Focus reset must happen on the Optic thread.");
                if (!r32.A09 || !r32.A04) {
                    return null;
                }
                r32.A07 = false;
                r32.A08 = false;
                r32.A00((Point) null, C114875ok.CANCELLED, r32.A02);
                r32.A01.cancelAutoFocus();
                C111205fV A002 = r32.A05.A00(r32.A00);
                C115845qP.A02(AnonymousClass5wI.A0B, A002, (Object) null);
                C115845qP.A02(AnonymousClass5wI.A0b, A002, (Object) null);
                A002.A03();
                A002.A02();
                return null;
            case 4:
                AnonymousClass5zC r4 = (AnonymousClass5zC) this.A00;
                AnonymousClass5xH.A00();
                try {
                    if (r4.isConnected()) {
                        boolean A1P = AnonymousClass000.A1P(r4.A00);
                        if (r4.A0J.A02(A1P ? 1 : 0) != -1) {
                            AnonymousClass5zC.A03(r4, r4.A06, A1P);
                            C116965sE A003 = AnonymousClass5zC.A00(r4.A04, r4, r4.A06, r4.A01);
                            AnonymousClass5xH.A00();
                            return A003;
                        }
                        StringBuilder A0o = AnonymousClass000.A0o();
                        A0o.append("Cannot switch to ");
                        A0o.append(A1P ? "FRONT" : "BACK");
                        throw new AnonymousClass67P(AnonymousClass000.A0h(", camera is not present", A0o));
                    }
                    throw new AnonymousClass67L("Cannot switch cameras.");
                } catch (Exception e3) {
                    AnonymousClass5xH.A00();
                    throw e3;
                }
            case 5:
                C111125fN r0 = (C111125fN) this.A00;
                AnonymousClass5zC r22 = r0.A01;
                boolean A1X = AnonymousClass000.A1X(r0.A02.A00(AnonymousClass5wQ.A04));
                AnonymousClass5xT.A01("Performing post photo capture on UI thread");
                if (!r22.isConnected()) {
                    return null;
                }
                if (A1X) {
                    r22.A07();
                }
                r22.A0N.A01(0);
                return null;
            case 6:
                C119245wm.A00();
                return null;
            case 7:
                AnonymousClass5yJ r13 = (AnonymousClass5yJ) this.A00;
                r13.A00(r13.A02);
                return null;
            case 8:
                return ((C117835td) this.A00).A00.A0Z.A02();
            case 9:
                return A01(this);
            case 10:
                return A02(this);
            case 11:
                return A03(this);
            case 12:
                return A04(this);
            case 13:
                return ((C118995vk) this.A00).A08();
            case 14:
                return AnonymousClass5xM.A02((AnonymousClass5xM) this.A00);
            case 15:
                return A07(this);
            case 16:
                return A08(this);
            case 17:
                return A09(this);
            default:
                return A0A(this);
        }
    }
}
