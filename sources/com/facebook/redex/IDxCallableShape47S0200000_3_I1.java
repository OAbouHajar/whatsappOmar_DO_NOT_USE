package com.facebook.redex;

import X.AnonymousClass5vU;
import X.AnonymousClass5wI;
import X.AnonymousClass5wJ;
import X.AnonymousClass5xT;
import X.AnonymousClass5yG;
import X.AnonymousClass5zC;
import X.AnonymousClass5zN;
import X.AnonymousClass659;
import X.AnonymousClass67L;
import X.C111205fV;
import X.C114875ok;
import X.C115825qN;
import X.C115845qP;
import X.C117775tX;
import X.C117815tb;
import X.C118215uK;
import X.C118525up;
import X.C119385xd;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Callable;

public class IDxCallableShape47S0200000_3_I1 implements Callable {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxCallableShape47S0200000_3_I1(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public static /* bridge */ /* synthetic */ Object A00(IDxCallableShape47S0200000_3_I1 iDxCallableShape47S0200000_3_I1) {
        AnonymousClass5zN r1 = (AnonymousClass5zN) iDxCallableShape47S0200000_3_I1.A01;
        r1.A00.A01();
        return r1;
    }

    public /* bridge */ /* synthetic */ Object call() {
        Point point;
        switch (this.A02) {
            case 0:
                AnonymousClass5zC r5 = (AnonymousClass5zC) this.A00;
                if (r5.isConnected()) {
                    AnonymousClass5vU r4 = r5.A0R;
                    ((C111205fV) r4.A02.get(r4.A03.A02(r5.A00))).A04((C117775tX) this.A01);
                    return r4.A02(r5.A00);
                }
                throw new AnonymousClass67L("Cannot modify settings");
            case 1:
                AnonymousClass5zC r42 = (AnonymousClass5zC) this.A00;
                C118215uK r1 = r42.A0L;
                Camera camera = (Camera) this.A01;
                r1.A00(true, camera);
                try {
                    camera.setPreviewTexture((SurfaceTexture) null);
                } catch (IOException e2) {
                    Log.e("Camera1Device", "Unable to remove the current SurfaceTexture", e2);
                }
                r42.A0M.A01(camera);
                camera.release();
                return null;
            case 2:
                C118215uK r2 = ((AnonymousClass5zC) this.A00).A0L;
                C117815tb r12 = (C117815tb) this.A01;
                if (r2.A00.A00()) {
                    AnonymousClass5xT.A00(new AnonymousClass659(r12, r2));
                }
                r2.A01.A01(r12);
                return null;
            case 3:
                C118215uK r0 = ((AnonymousClass5zC) this.A00).A0L;
                r0.A01.A02(this.A01);
                return null;
            case 4:
                AnonymousClass5zC r13 = (AnonymousClass5zC) this.A00;
                if (!r13.isConnected()) {
                    return null;
                }
                r13.A09();
                C118525up r43 = r13.A0K;
                Rect rect = (Rect) this.A01;
                IDxFListenerShape400S0100000_3_I1 iDxFListenerShape400S0100000_3_I1 = new IDxFListenerShape400S0100000_3_I1(this, 1);
                r43.A06.A06("Focus requests must be on the Optic thread. ");
                if (!r43.A09) {
                    return null;
                }
                AnonymousClass5vU r9 = r43.A05;
                if (AnonymousClass5wJ.A02(AnonymousClass5wJ.A0P, r9.A01(r43.A00))) {
                    C111205fV A002 = r9.A00(r43.A00);
                    A002.A00.A01(AnonymousClass5wI.A0b, C119385xd.A04(rect));
                    A002.A02();
                }
                if (!r43.A09) {
                    return null;
                }
                AnonymousClass5wJ A012 = r9.A01(r43.A00);
                C115825qN r22 = AnonymousClass5wJ.A0O;
                if (!AnonymousClass5wJ.A02(r22, A012) && !AnonymousClass5wJ.A02(AnonymousClass5wJ.A04, A012)) {
                    return null;
                }
                if (r43.A08) {
                    r43.A01.cancelAutoFocus();
                }
                r43.A07 = false;
                r43.A08 = true;
                r43.A0A = false;
                C111205fV A003 = r9.A00(r43.A00);
                if (AnonymousClass5wJ.A02(r22, r9.A01(r43.A00))) {
                    A003.A00.A01(AnonymousClass5wI.A0B, C119385xd.A04(rect));
                    point = new Point(rect.centerX(), rect.centerY());
                } else {
                    point = new Point(0, 0);
                }
                C115845qP.A02(AnonymousClass5wI.A0C, A003, 1);
                A003.A02();
                r43.A00(point, C114875ok.FOCUSING, r43.A02);
                r43.A01.autoFocus(new AnonymousClass5yG(point, iDxFListenerShape400S0100000_3_I1, r43));
                return null;
            default:
                return A00(this);
        }
    }
}
