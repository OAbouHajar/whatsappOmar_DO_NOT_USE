package com.obwhatsapp.camera.litecamera;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass1DX;
import X.AnonymousClass2Qt;
import X.AnonymousClass2V3;
import X.AnonymousClass2VC;
import X.AnonymousClass4V6;
import X.AnonymousClass5vQ;
import X.AnonymousClass5wJ;
import X.AnonymousClass5wQ;
import X.AnonymousClass5wU;
import X.AnonymousClass5xU;
import X.C114825of;
import X.C115975qc;
import X.C115995qe;
import X.C116005qf;
import X.C116015qg;
import X.C116535rX;
import X.C116575rb;
import X.C117885ti;
import X.C118595uw;
import X.C118645v1;
import X.C118675v4;
import X.C119575yh;
import X.C1223369e;
import X.C13680ns;
import X.C13690nt;
import X.C16320sq;
import X.C52662eE;
import android.content.SharedPreferences;
import android.os.Handler;
import android.widget.FrameLayout;
import com.AssemMods.translator.Language;
import com.facebook.optic.IDxSCallbackShape43S0100000_3_I1;
import com.facebook.optic.IDxSCallbackShape9S0200000_3_I1;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class LiteCameraView extends FrameLayout implements AnonymousClass2Qt, AnonymousClass006 {
    public AnonymousClass2V3 A00;
    public AnonymousClass1DX A01;
    public C16320sq A02;
    public C52662eE A03;
    public String A04;
    public List A05;
    public List A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final SharedPreferences A0B;
    public final AnonymousClass5xU A0C;
    public final C119575yh A0D;
    public final AnonymousClass5wU A0E;
    public final C117885ti A0F;
    public final C115995qe A0G;
    public final C116005qf A0H;
    public final C118675v4 A0I;
    public volatile boolean A0J;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00dd, code lost:
        if (r0 <= 0) goto L_0x00df;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public LiteCameraView(android.content.Context r10, int r11) {
        /*
            r9 = this;
            r9.<init>(r10)
            boolean r0 = r9.A08
            if (r0 != 0) goto L_0x0026
            r0 = 1
            r9.A08 = r0
            java.lang.Object r0 = r9.generatedComponent()
            X.0sX r1 = X.C52652eD.A00(r0)
            X.01J r0 = r1.A3R
            java.lang.Object r0 = r0.get()
            X.1DX r0 = (X.AnonymousClass1DX) r0
            r9.A01 = r0
            X.01J r0 = r1.ARB
            java.lang.Object r0 = r0.get()
            X.0sq r0 = (X.C16320sq) r0
            r9.A02 = r0
        L_0x0026:
            java.lang.String r0 = "off"
            r9.A04 = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r9.A05 = r0
            java.util.List r0 = java.util.Collections.emptyList()
            r9.A06 = r0
            X.5ti r0 = new X.5ti
            r0.<init>(r9)
            r9.A0F = r0
            X.5qe r0 = new X.5qe
            r0.<init>(r9)
            r9.A0G = r0
            X.5qf r0 = new X.5qf
            r0.<init>(r9)
            r9.A0H = r0
            X.0sq r1 = r9.A02
            X.5v4 r0 = new X.5v4
            r0.<init>(r1)
            r9.A0I = r0
            java.lang.String r0 = X.AnonymousClass01S.A07
            r4 = 0
            android.content.SharedPreferences r1 = r10.getSharedPreferences(r0, r4)
            r9.A0B = r1
            java.lang.String r0 = "camera_facing"
            int r3 = r1.getInt(r0, r4)
            android.view.TextureView r2 = new android.view.TextureView
            r2.<init>(r10)
            X.5zQ r1 = new X.5zQ
            r1.<init>()
            boolean r0 = X.C115675q8.A00(r10)
            X.5yh r7 = new X.5yh
            r7.<init>(r10, r2, r1, r0)
            r7.A0C = r4
            r9.A0D = r7
            r7.A08(r3)
            r0 = 2015(0x7df, float:2.824E-42)
            if (r11 < r0) goto L_0x011c
            r6 = 8388608(0x800000, float:1.17549435E-38)
            r5 = 2073600(0x1fa400, float:2.905732E-39)
        L_0x0086:
            java.lang.String r0 = "window"
            java.lang.Object r3 = r10.getSystemService(r0)
            android.view.WindowManager r3 = (android.view.WindowManager) r3
            android.view.Display r2 = r3.getDefaultDisplay()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L_0x0102
            android.view.WindowMetrics r0 = r3.getCurrentWindowMetrics()
            android.graphics.Rect r0 = r0.getBounds()
            int r1 = r0.width()
            int r0 = r0.height()
        L_0x00a8:
            int r1 = r1 * r0
            float r8 = (float) r1
            r0 = 1241325568(0x49fd2000, float:2073600.0)
            float r1 = r8 / r0
            r0 = 1231093760(0x49610000, float:921600.0)
            float r8 = r8 / r0
            double r1 = (double) r1
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x00fe
            double r3 = r3 - r1
            double r3 = java.lang.Math.abs(r3)
            r1 = 4599075939685498880(0x3fd3333340000000, double:0.30000001192092896)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00fe
            double r1 = (double) r8
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x00df
            double r3 = r3 - r1
            double r3 = java.lang.Math.abs(r3)
            r1 = 4599075939685498880(0x3fd3333340000000, double:0.30000001192092896)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r1 = 307200(0x4b000, float:4.30479E-40)
            if (r0 > 0) goto L_0x00e2
        L_0x00df:
            r1 = 921600(0xe1000, float:1.291437E-39)
        L_0x00e2:
            X.5xU r0 = new X.5xU
            r0.<init>(r1, r6, r5)
            r9.A0C = r0
            r7.A07 = r0
            android.view.TextureView r1 = r7.A0J
            r0 = -2
            r9.addView(r1, r0)
            X.5qd r1 = new X.5qd
            r1.<init>(r9)
            X.5wU r0 = new X.5wU
            r0.<init>(r1)
            r9.A0E = r0
            return
        L_0x00fe:
            r1 = 2073600(0x1fa400, float:2.905732E-39)
            goto L_0x00e2
        L_0x0102:
            r0 = 17
            if (r1 < r0) goto L_0x0113
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            r2.getRealMetrics(r0)
            int r1 = r0.widthPixels
            int r0 = r0.heightPixels
            goto L_0x00a8
        L_0x0113:
            int r1 = r2.getWidth()
            int r0 = r2.getHeight()
            goto L_0x00a8
        L_0x011c:
            r0 = 2013(0x7dd, float:2.821E-42)
            r6 = 2097152(0x200000, float:2.938736E-39)
            r5 = 307200(0x4b000, float:4.30479E-40)
            if (r11 < r0) goto L_0x0086
            r6 = 5242880(0x500000, float:7.34684E-39)
            r5 = 921600(0xe1000, float:1.291437E-39)
            goto L_0x0086
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.camera.litecamera.LiteCameraView.<init>(android.content.Context, int):void");
    }

    public static final int A00(String str) {
        switch (str.hashCode()) {
            case 3551:
                if (str.equals("on")) {
                    return 1;
                }
                break;
            case 109935:
                if (str.equals("off")) {
                    return 0;
                }
                break;
            case 3005871:
                if (str.equals(Language.AUTO_DETECT)) {
                    return 2;
                }
                break;
        }
        throw AnonymousClass000.A0T(AnonymousClass000.A0h(str, AnonymousClass000.A0r("Not able to map app flash mode: ")));
    }

    private String getFlashModesCountPrefKey() {
        return AnonymousClass000.A0l(AnonymousClass000.A0r("flash_modes_count"), this.A0D.A00);
    }

    public final void A01() {
        List flashModes = getFlashModes();
        SharedPreferences sharedPreferences = this.A0B;
        if (C13690nt.A01(sharedPreferences, getFlashModesCountPrefKey()) != flashModes.size()) {
            C13680ns.A0w(sharedPreferences.edit(), getFlashModesCountPrefKey(), flashModes.size());
        }
    }

    public void A6D() {
        AnonymousClass4V6 r1 = this.A0E.A03;
        synchronized (r1) {
            r1.A00 = null;
        }
    }

    public void A9A(float f2, float f3) {
        C119575yh r6 = this.A0D;
        r6.A0B = new C116015qg(this);
        int i2 = (int) f2;
        int i3 = (int) f3;
        AnonymousClass5wJ A042 = r6.A04();
        if (A042 != null) {
            float[] fArr = {(float) i2, (float) i3};
            C1223369e r2 = r6.A0N;
            r2.AKb(fArr);
            if (AnonymousClass5wJ.A02(AnonymousClass5wJ.A0O, A042)) {
                r2.A99((int) fArr[0], (int) fArr[1]);
            }
        }
    }

    public boolean AIs() {
        return this.A0D.A00 == 1;
    }

    public boolean AIv() {
        return this.A0J;
    }

    public boolean AJZ() {
        return this.A0D.A0N.AJa();
    }

    public boolean AJl() {
        return "torch".equals(this.A04);
    }

    public boolean ALf() {
        return AIs() && !this.A04.equals("off");
    }

    public void ALm() {
        C119575yh r2 = this.A0D;
        C1223369e r1 = r2.A0N;
        if (r1.AJj()) {
            this.A0E.A00();
            if (!r2.A0E && r1.AJj()) {
                r1.Agb(r2.A0R);
            }
        }
    }

    public String ALn() {
        List flashModes = getFlashModes();
        if (flashModes.isEmpty()) {
            return "off";
        }
        int indexOf = flashModes.indexOf(this.A04);
        if (indexOf < 0) {
            indexOf = flashModes.indexOf("off");
        }
        String A0n = AnonymousClass000.A0n(flashModes, (indexOf + 1) % flashModes.size());
        this.A04 = A0n;
        this.A0D.A07(A00(A0n));
        return this.A04;
    }

    public void AcZ() {
        if (this.A0J) {
            AnonymousClass2V3 r0 = this.A00;
            if (r0 != null) {
                r0.AVG();
                return;
            }
            return;
        }
        Acc();
    }

    public void Acc() {
        C119575yh r2 = this.A0D;
        r2.A0D = this.A09;
        C117885ti r1 = this.A0F;
        if (r1 != null) {
            r2.A0T.A01(r1);
        }
        r2.A0A = this.A0G;
        r2.A06();
        this.A0I.A01(10000);
    }

    public int Af4(int i2) {
        C119575yh r2 = this.A0D;
        AnonymousClass5wJ A042 = r2.A04();
        if (A042 != null && AnonymousClass5wJ.A02(AnonymousClass5wJ.A0W, A042)) {
            r2.A0N.Af5((C118595uw) null, i2);
        }
        return r2.A01();
    }

    public void AgF(File file, int i2) {
        C119575yh r4 = this.A0D;
        C116005qf r6 = this.A0H;
        if (r4.A0E) {
            Handler handler = r4.A0G;
            handler.sendMessage(handler.obtainMessage(10, new Object[]{r6, AnonymousClass000.A0V("Cannot start video recording while camera is paused.")}));
            return;
        }
        synchronized (r4.A0U) {
            if (r4.A0X) {
                Handler handler2 = r4.A0G;
                handler2.sendMessage(handler2.obtainMessage(10, new Object[]{r6, AnonymousClass000.A0V("Cannot start video recording. Another recording already in progress")}));
            } else {
                r4.A0X = true;
                r4.A0W = r6;
                r4.A0N.AgH(new IDxSCallbackShape43S0100000_3_I1(r4, 0), file);
            }
        }
    }

    public void AgO() {
        C119575yh r5 = this.A0D;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        synchronized (r5.A0U) {
            if (r5.A0X) {
                r5.A0N.AgQ(new IDxSCallbackShape9S0200000_3_I1(countDownLatch, 0, r5), false);
                try {
                    countDownLatch.await(5, TimeUnit.SECONDS);
                } catch (InterruptedException unused) {
                    throw AnonymousClass000.A0a("Timeout stopping video recording.");
                }
            }
        }
    }

    public boolean Aga() {
        return this.A0A;
    }

    public void Age(AnonymousClass2VC r5, boolean z2) {
        C116535rX r1 = new C116535rX();
        r1.A01 = false;
        r1.A00 = false;
        r1.A01 = z2;
        r1.A00 = true;
        C119575yh r12 = this.A0D;
        C118645v1 r3 = new C118645v1(r12, new C116575rb(r5, this));
        C1223369e r2 = r12.A0N;
        AnonymousClass5wQ r13 = new AnonymousClass5wQ();
        r13.A00 = z2;
        r2.Agd(r3, r13);
    }

    public void Agz() {
        String str;
        if (this.A0A) {
            boolean AJl = AJl();
            C119575yh r1 = this.A0D;
            if (AJl) {
                r1.A07(0);
                str = "off";
            } else {
                r1.A07(3);
                str = "torch";
            }
            this.A04 = str;
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A03;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public int getCameraApi() {
        return AnonymousClass000.A1Y(this.A0D.A0S, C114825of.A02) ? 1 : 0;
    }

    public int getCameraType() {
        return 1;
    }

    public String getFlashMode() {
        return this.A04;
    }

    public List getFlashModes() {
        return AIs() ? this.A06 : this.A05;
    }

    public int getMaxZoom() {
        AnonymousClass5wJ A042;
        C119575yh r0 = this.A0D;
        AnonymousClass5wJ A043 = r0.A04();
        if (A043 == null || (A042 = r0.A04()) == null || !AnonymousClass5wJ.A02(AnonymousClass5wJ.A0W, A042)) {
            return 0;
        }
        return AnonymousClass000.A0D(A043.A03(AnonymousClass5wJ.A0a));
    }

    public int getNumberOfCameras() {
        return this.A0D.A0N.AJj() ? 2 : 1;
    }

    public long getPictureResolution() {
        AnonymousClass5vQ r0 = this.A0C.A00;
        if (r0 != null) {
            return (long) (r0.A02 * r0.A01);
        }
        return 0;
    }

    public int getStoredFlashModeCount() {
        return C13690nt.A01(this.A0B, getFlashModesCountPrefKey());
    }

    public long getVideoResolution() {
        AnonymousClass5vQ r0 = this.A0C.A02;
        if (r0 != null) {
            return (long) (r0.A02 * r0.A01);
        }
        return 0;
    }

    public int getZoomLevel() {
        return this.A0D.A01();
    }

    public void pause() {
        C119575yh r2 = this.A0D;
        r2.A05();
        C117885ti r1 = this.A0F;
        if (r1 != null) {
            r2.A0T.A02(r1);
        }
        r2.A0A = null;
        r2.A0A((C115975qc) null);
        this.A0E.A00();
        this.A0J = false;
        this.A0I.A00();
    }

    public void setCameraCallback(AnonymousClass2V3 r1) {
        this.A00 = r1;
    }

    public void setQrDecodeHints(Map map) {
        this.A0E.A03.A02 = map;
    }

    public void setQrScanningEnabled(boolean z2) {
        if (z2 != this.A09) {
            this.A09 = z2;
            if (z2) {
                C119575yh r2 = this.A0D;
                AnonymousClass5wU r1 = this.A0E;
                r2.A0A(r1.A01);
                if (!r1.A08) {
                    r1.A03.A01();
                    r1.A08 = true;
                    return;
                }
                return;
            }
            this.A0E.A00();
            this.A0D.A0A((C115975qc) null);
        }
    }
}
