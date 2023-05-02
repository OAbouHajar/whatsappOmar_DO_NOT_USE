package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass27H;
import X.AnonymousClass2P8;
import X.AnonymousClass2Qx;
import X.AnonymousClass3Ak;
import X.AnonymousClass4V1;
import X.C13680ns;
import X.C16040sK;
import X.C16900tq;
import X.C208211s;
import X.C30711cp;
import X.C30971dG;
import X.C42001x2;
import X.C90194dg;
import android.util.Pair;
import com.obwhatsapp.jobqueue.job.RotateSignedPreKeyJob;
import com.obwhatsapp.jobqueue.job.SendRetryReceiptJob;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.camera.VoipPhysicalCamera;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import org.pjsip.PjCamera;

public class IDxCallableShape148S0100000_2_I0 implements Callable {
    public Object A00;
    public final int A01;

    public IDxCallableShape148S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final Object call() {
        int i2;
        switch (this.A01) {
            case 0:
                return ((C30711cp) this.A00).A05();
            case 1:
                C42001x2 r1 = (C42001x2) this.A00;
                synchronized (r1) {
                    if (r1.A03 != null) {
                        r1.A0A();
                        if (r1.A0C()) {
                            r1.A0B();
                            r1.A00 = 0;
                        }
                    }
                }
                return null;
            case 2:
                AnonymousClass2Qx r2 = (AnonymousClass2Qx) this.A00;
                if (r2.A01 != null) {
                    StringBuilder A0r = AnonymousClass000.A0r("voip/CoreVideoPort/ releasing surface texture holder for ");
                    A0r.append(r2.A0B);
                    C13680ns.A1V(A0r);
                    r2.A01.A00();
                    AnonymousClass00B.A03(r2.A07);
                    r2.A01 = null;
                }
                r2.A04();
                return C13680ns.A0X();
            case 3:
                return Boolean.valueOf(((AnonymousClass2Qx) this.A00).A09());
            case 4:
                AnonymousClass2Qx r12 = (AnonymousClass2Qx) this.A00;
                try {
                    AnonymousClass4V1 r5 = r12.A01;
                    if (r5 != null) {
                        return r5;
                    }
                    AnonymousClass4V1 r52 = new AnonymousClass4V1();
                    if (r52.A00 == 0) {
                        Log.e("voip/video/SurfaceTextureHolder/createSurfaceTexture, failed to generate gl texture");
                        r52.A00();
                        r52 = null;
                    }
                    r12.A01 = r52;
                    return r52;
                } catch (RuntimeException e2) {
                    Log.e((Throwable) e2);
                    return null;
                }
            case 5:
                AnonymousClass2Qx r13 = (AnonymousClass2Qx) this.A00;
                AnonymousClass00B.A03(r13.A07);
                try {
                    r13.A03 = C90194dg.A00(C90194dg.A00);
                    i2 = 0;
                    break;
                } catch (Exception e3) {
                    Log.e((Throwable) e3);
                    r13.A04();
                    i2 = -5;
                    break;
                }
            case 6:
                AnonymousClass2Qx r14 = (AnonymousClass2Qx) this.A00;
                if (r14.A09()) {
                    i2 = r14.A02(AnonymousClass2Qx.A0I);
                    break;
                } else {
                    i2 = -6;
                    break;
                }
            case 7:
                ((AnonymousClass2Qx) this.A00).A05();
                return C13680ns.A0X();
            case 8:
                return ((AnonymousClass27H) this.A00).A02.A00.A04();
            case 9:
                return ((C208211s) this.A00).A0h();
            case 10:
                return ((C208211s) this.A00).A00.A04();
            case 11:
                return ((C208211s) this.A00).A0H();
            case 12:
                C16900tq r15 = (C16900tq) this.A00;
                C16040sK r0 = r15.A02;
                r0.A0B();
                if (r0.A00 != null) {
                    return null;
                }
                r15.A03.A01();
                return null;
            case 13:
                return ((AnonymousClass3Ak) this.A00).A04();
            case 14:
                return ((AnonymousClass3Ak) this.A00).A01();
            case 15:
                return ((RotateSignedPreKeyJob) this.A00).A01.A0I();
            case 16:
                SendRetryReceiptJob sendRetryReceiptJob = (SendRetryReceiptJob) this.A00;
                Lock A012 = sendRetryReceiptJob.A04.A01();
                if (A012 != null) {
                    try {
                        A012.lock();
                    } catch (Throwable th) {
                        if (A012 != null) {
                            A012.unlock();
                        }
                        throw th;
                    }
                }
                Pair pair = new Pair(sendRetryReceiptJob.A02.A0h(), new C30971dG[]{sendRetryReceiptJob.A02.A0I(), sendRetryReceiptJob.A02.A0J()});
                if (A012 == null) {
                    return pair;
                }
                A012.unlock();
                return pair;
            case 17:
                return ((AnonymousClass2P8) this.A00).A0A();
            case 18:
                return Integer.valueOf(((VoipPhysicalCamera) this.A00).startOnCameraThread());
            case 19:
                return ((VoipPhysicalCamera) this.A00).lambda$stop$4();
            default:
                return Integer.valueOf(((PjCamera) this.A00).updatePreviewOrientationOnCameraThread());
        }
        return Integer.valueOf(i2);
    }
}
