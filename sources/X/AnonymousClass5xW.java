package X;

import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Range;
import android.view.Surface;
import com.facebook.redex.IDxCallableShape150S0100000_3_I1;
import com.facebook.redex.IDxSListenerShape401S0100000_3_I1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5xW  reason: invalid class name */
public class AnonymousClass5xW {
    public static final Object A0S = C13690nt.A0Y();
    public CameraCharacteristics A00;
    public CameraDevice A01;
    public CaptureRequest.Builder A02;
    public Surface A03;
    public Surface A04;
    public Surface A05;
    public Surface A06;
    public AnonymousClass5xM A07;
    public AnonymousClass5zJ A08;
    public AnonymousClass5xD A09;
    public C115105p9 A0A;
    public C1223469f A0B;
    public C111185fT A0C;
    public C111195fU A0D;
    public AnonymousClass5wJ A0E;
    public MeteringRectangle[] A0F;
    public MeteringRectangle[] A0G;
    public final C118885vP A0H;
    public final AnonymousClass68A A0I = new IDxSListenerShape401S0100000_3_I1(this, 1);
    public final AnonymousClass68A A0J = new IDxSListenerShape401S0100000_3_I1(this, 0);
    public final AnonymousClass5zO A0K = new AnonymousClass5zO(new C115805qL(this));
    public final C118855vM A0L = new C118855vM();
    public final C118855vM A0M = new C118855vM();
    public final C119355wx A0N;
    public final List A0O = AnonymousClass000.A0u();
    public volatile C115075p4 A0P;
    public volatile boolean A0Q;
    public volatile boolean A0R;

    public AnonymousClass5xW(C119355wx r3) {
        this.A0N = r3;
        this.A0H = new C118885vP(r3);
    }

    public static void A01(Rect rect, CaptureRequest.Builder builder, AnonymousClass5wJ r4, MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, float f2) {
        if (Build.VERSION.SDK_INT >= 30 && AnonymousClass5wJ.A02(AnonymousClass5wJ.A0J, r4)) {
            builder.set(CaptureRequest.CONTROL_ZOOM_RATIO, Float.valueOf(f2 / 100.0f));
        } else if (AnonymousClass5wJ.A02(AnonymousClass5wJ.A0W, r4)) {
            builder.set(CaptureRequest.SCALER_CROP_REGION, rect);
        }
        if (AnonymousClass5wJ.A02(AnonymousClass5wJ.A0O, r4)) {
            builder.set(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
        }
        if (AnonymousClass5wJ.A02(AnonymousClass5wJ.A0P, r4)) {
            builder.set(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2);
        }
    }

    public static boolean A02(List list, int[] iArr) {
        if (!(list == null || iArr == null || (iArr[0] == 0 && iArr[1] == 0))) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int[] iArr2 = (int[]) it.next();
                if (iArr2[0] == iArr[0] && iArr2[1] == iArr[1]) {
                    return true;
                }
            }
        }
        return false;
    }

    public CaptureRequest.Builder A03() {
        this.A0H.A00("Cannot get preview request builder.");
        CaptureRequest.Builder builder = this.A02;
        if (builder != null) {
            return builder;
        }
        throw AnonymousClass000.A0V("Trying to get mPreviewRequestBuilder before configuring preview.");
    }

    public AnonymousClass5xD A04(AnonymousClass68A r6, boolean z2, boolean z3) {
        C118885vP r2 = this.A0H;
        r2.A00("Cannot start preview.");
        AnonymousClass5zJ r1 = this.A08;
        r1.A0E = 1;
        r1.A07 = r6;
        r1.A09 = Boolean.TRUE;
        r1.A02 = null;
        r2.A00("Cannot get output surfaces.");
        AnonymousClass5xM r12 = this.A07;
        ArrayList A0u = AnonymousClass000.A0u();
        A0u.add(this.A04);
        if (z2 && r12 != null) {
            A0u.add(r12.A03());
        }
        Surface surface = this.A06;
        if (!(surface == null && (surface = this.A03) == null)) {
            A0u.add(surface);
        }
        AnonymousClass5xD r0 = this.A09;
        if (r0 != null) {
            r0.A03();
        }
        r2.A01("Method createCaptureSession must be called on Optic Thread");
        AnonymousClass5zO r13 = this.A0K;
        r13.A03 = 1;
        r13.A02.A02(0);
        this.A09 = (AnonymousClass5xD) this.A0N.A04("start_preview_on_camera_handler_thread", new AnonymousClass674(this, A0u));
        A0E(z2);
        A0C("Preview session was closed while starting preview", z3);
        this.A0Q = true;
        return this.A09;
    }

    public void A05() {
        this.A0H.A00("Cannot refresh camera preview.");
        try {
            A0C((String) null, false);
        } catch (Exception unused) {
        }
    }

    public void A06() {
        Surface surface;
        C118885vP r1 = this.A0H;
        r1.A01("Can only stop video recording on the Optic thread");
        r1.A01("Can only check if the prepared on the Optic thread");
        if (r1.A00) {
            CaptureRequest.Builder builder = this.A02;
            if (!(builder == null || (surface = this.A05) == null)) {
                builder.removeTarget(surface);
            }
            this.A05 = null;
        }
    }

    public void A07() {
        C117845te r1;
        this.A0H.A00("Cannot update frame metadata collection.");
        C111185fT r12 = this.A0C;
        if (r12 != null && this.A07 != null && this.A08 != null) {
            boolean A1X = AnonymousClass000.A1X(r12.A05(AnonymousClass5wI.A0R));
            AnonymousClass5zJ r2 = this.A08;
            if (A1X) {
                r1 = this.A07.A07;
                if (r2.A05 == null) {
                    r2.A05 = new C118665v3();
                }
            } else {
                r1 = null;
            }
            r2.A0H = A1X;
            r2.A03 = r1;
        }
    }

    public void A08(Rect rect, MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, float f2) {
        CaptureRequest.Builder builder;
        AnonymousClass5wJ r2;
        C118885vP r1 = this.A0H;
        r1.A01("Can only apply zoom on the Optic thread");
        r1.A01("Can only check if the prepared on the Optic thread");
        if (r1.A00 && (builder = this.A02) != null && (r2 = this.A0E) != null) {
            A01(rect, builder, r2, meteringRectangleArr, meteringRectangleArr2, f2);
            if (this.A0Q) {
                A05();
            }
        }
    }

    public void A09(SurfaceTexture surfaceTexture, C115785qJ r9) {
        String str;
        AnonymousClass5wJ r3;
        AnonymousClass5wJ r1;
        Integer valueOf;
        int i2;
        C1223469f r12;
        Surface surface = new Surface(surfaceTexture);
        this.A0H.A00("Cannot configure camera preview.");
        this.A04 = surface;
        CaptureRequest.Builder createCaptureRequest = this.A01.createCaptureRequest(1);
        this.A02 = createCaptureRequest;
        this.A0G = (MeteringRectangle[]) createCaptureRequest.get(CaptureRequest.CONTROL_AF_REGIONS);
        this.A0F = (MeteringRectangle[]) this.A02.get(CaptureRequest.CONTROL_AE_REGIONS);
        this.A02.set(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
        this.A02.set(CaptureRequest.CONTROL_MODE, 1);
        boolean A1X = AnonymousClass000.A1X(this.A0B.A9Z(C1223469f.A03));
        Integer A0X = C13680ns.A0X();
        if (!A1X) {
            this.A02.set(CaptureRequest.CONTROL_SCENE_MODE, A0X);
        }
        CaptureRequest.Builder builder = this.A02;
        CaptureRequest.Key key = CaptureRequest.CONTROL_AE_LOCK;
        Boolean bool = Boolean.FALSE;
        builder.set(key, bool);
        this.A02.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, A0X);
        if (this.A0D != null) {
            int i3 = 4;
            if (!A0H(4)) {
                i3 = 3;
                if (!A0H(3)) {
                    if (A0H(1)) {
                        C111195fU.A00(this.A0D, AnonymousClass5wI.A0C, 1);
                        this.A02.set(CaptureRequest.CONTROL_AF_MODE, 1);
                    }
                }
            }
            C111195fU r13 = this.A0D;
            C115835qO r0 = AnonymousClass5wI.A0C;
            Integer valueOf2 = Integer.valueOf(i3);
            C111195fU.A00(r13, r0, valueOf2);
            this.A02.set(CaptureRequest.CONTROL_AF_MODE, valueOf2);
        }
        if (this.A02 == null || this.A0D == null) {
            str = "Cannot initialize stabilization settings, preview closed.";
        } else {
            AnonymousClass5wJ r14 = this.A0E;
            if (r14 != null && AnonymousClass5wJ.A02(AnonymousClass5wJ.A0L, r14)) {
                this.A02.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, 1);
                C111195fU.A00(this.A0D, AnonymousClass5wI.A0U, Boolean.TRUE);
            }
            AnonymousClass5wJ r15 = this.A0E;
            if (r15 != null && AnonymousClass5wJ.A02(AnonymousClass5wJ.A0T, r15)) {
                this.A02.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, A0X);
                C111195fU.A00(this.A0D, AnonymousClass5wI.A0W, bool);
            }
            AnonymousClass5wJ r16 = this.A0E;
            if (r16 != null && AnonymousClass5wJ.A02(AnonymousClass5wJ.A0M, r16) && (r12 = this.A0B) != null && AnonymousClass000.A1X(r12.A9Z(C1223469f.A06))) {
                this.A02.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
                C111195fU.A00(this.A0D, AnonymousClass5wI.A0V, Boolean.TRUE);
            }
            if (this.A02 == null || (r3 = this.A0E) == null || this.A0D == null) {
                str = "Cannot initialize fps settings, preview closed.";
            } else {
                C117785tY r17 = ((AnonymousClass5zK) this.A0B).A01;
                List A012 = AnonymousClass5wJ.A01(AnonymousClass5wJ.A0p, r3);
                int[] A002 = r17.A00(A012);
                if (A02(A012, A002)) {
                    C111195fU.A00(this.A0D, AnonymousClass5wI.A0j, A002);
                    boolean A022 = AnonymousClass5wJ.A02(AnonymousClass5wJ.A0d, this.A0E);
                    int i4 = A002[0];
                    if (A022) {
                        valueOf = Integer.valueOf(i4 / 1000);
                        i2 = A002[1] / 1000;
                    } else {
                        valueOf = Integer.valueOf(i4);
                        i2 = A002[1];
                    }
                    this.A02.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, Range.create(valueOf, Integer.valueOf(i2)));
                }
                if (this.A02 == null || (r1 = this.A0E) == null || this.A0C == null) {
                    str = "Cannot initialize custom capture settings, preview closed.";
                } else {
                    if (AnonymousClass5wJ.A02(AnonymousClass5wJ.A0B, r1)) {
                        this.A0C.A05(AnonymousClass5wI.A0h);
                    }
                    this.A02.set(CaptureRequest.CONTROL_AF_TRIGGER, A0X);
                    if (AnonymousClass5wJ.A02(AnonymousClass5wJ.A0K, this.A0E) && AnonymousClass000.A1X(this.A0B.A9Z(C1223469f.A04))) {
                        this.A02.set(CaptureRequest.NOISE_REDUCTION_MODE, 2);
                    }
                    if (AnonymousClass5wJ.A02(AnonymousClass5wJ.A0Q, this.A0E) && AnonymousClass000.A1X(this.A0B.A9Z(C1223469f.A05))) {
                        this.A02.set(CaptureRequest.TONEMAP_MODE, 2);
                    }
                    this.A02.addTarget(this.A04);
                    this.A08.A01 = r9;
                    A07();
                    return;
                }
            }
        }
        throw AnonymousClass000.A0V(str);
    }

    public void A0A(CameraCharacteristics cameraCharacteristics, CameraDevice cameraDevice, Surface surface, Surface surface2, AnonymousClass5xM r8, C115105p9 r9, C1223469f r10, C111185fT r11, C111195fU r12, AnonymousClass5wJ r13) {
        C118885vP r2 = this.A0H;
        r2.A01("Can only prepare on the Optic thread");
        this.A01 = cameraDevice;
        this.A0C = r11;
        this.A0D = r12;
        this.A0B = r10;
        this.A0E = r13;
        this.A00 = cameraCharacteristics;
        this.A0A = r9;
        this.A07 = r8;
        this.A03 = surface;
        this.A06 = surface2;
        this.A08 = new AnonymousClass5zJ();
        r2.A02("Failed to prepare PreviewController.", true);
    }

    public void A0B(Surface surface) {
        Surface surface2;
        C118885vP r2 = this.A0H;
        r2.A00("Cannot start video recording.");
        if (this.A02 == null || (surface2 = this.A04) == null) {
            throw AnonymousClass000.A0V("Cannot start video recording, preview closed.");
        }
        this.A05 = surface;
        List asList = Arrays.asList(new Surface[]{surface2, surface});
        AnonymousClass5xD r0 = this.A09;
        if (r0 != null) {
            r0.A03();
        }
        r2.A01("Method createCaptureSession must be called on Optic Thread");
        AnonymousClass5zO r02 = this.A0K;
        r02.A03 = 1;
        r02.A02.A02(0);
        this.A09 = (AnonymousClass5xD) this.A0N.A04("record_video_on_camera_thread", new AnonymousClass674(this, asList));
        this.A02.addTarget(surface);
        AnonymousClass5zJ r1 = this.A08;
        r1.A0E = 7;
        r1.A09 = Boolean.TRUE;
        r1.A02 = null;
        A0E(false);
        A0C("Preview session was closed while starting recording.", true);
    }

    public void A0C(String str, boolean z2) {
        CaptureRequest.Builder builder;
        this.A0H.A01("Method updatePreviewView must be invoked in the Optic background thread");
        synchronized (A0S) {
            AnonymousClass5xD r2 = this.A09;
            if (r2 != null && (builder = this.A02) != null) {
                r2.A05(builder.build(), this.A08);
            } else if (z2) {
                if (str == null) {
                    str = "Trying to update preview view while preview is closed";
                }
                throw new AnonymousClass67O(str);
            }
        }
    }

    public void A0D(boolean z2) {
        C118885vP r2 = this.A0H;
        r2.A02("Failed to release PreviewController.", false);
        this.A0Q = false;
        AnonymousClass5xM r0 = this.A07;
        if (r0 != null) {
            r0.A04();
            this.A07 = null;
        }
        AnonymousClass5zJ r1 = this.A08;
        if (r1 != null) {
            r1.A0G = false;
            this.A08 = null;
        }
        if (z2) {
            try {
                r2.A01("Method closeCameraSession must be called on Optic Thread.");
                AnonymousClass5zO r6 = this.A0K;
                r6.A03 = 3;
                AnonymousClass5vT r5 = r6.A02;
                r5.A02(0);
                C119355wx r4 = this.A0N;
                r4.A04("camera_session_abort_capture_on_camera_handler_thread", new IDxCallableShape150S0100000_3_I1(this, 17));
                r6.A03 = 2;
                r5.A02(0);
                r4.A04("camera_session_close_on_camera_handler_thread", new IDxCallableShape150S0100000_3_I1(this, 18));
            } catch (Exception unused) {
            }
        }
        if (this.A0A != null) {
            this.A0A = null;
        }
        Surface surface = this.A04;
        if (surface != null) {
            surface.release();
            this.A04 = null;
        }
        AnonymousClass5xD r02 = this.A09;
        if (r02 != null) {
            r02.A03();
            this.A09 = null;
        }
        this.A05 = null;
        this.A02 = null;
        this.A0G = null;
        this.A0F = null;
        this.A01 = null;
        this.A0C = null;
        this.A0D = null;
        this.A0B = null;
        this.A0E = null;
        this.A00 = null;
    }

    public void A0E(boolean z2) {
        this.A0H.A00("Cannot update preview builder for CPU frames.");
        AnonymousClass5xM r0 = this.A07;
        CaptureRequest.Builder builder = this.A02;
        if (builder != null && r0 != null) {
            Surface A032 = r0.A03();
            if (z2) {
                builder.addTarget(A032);
                this.A0R = true;
                return;
            }
            builder.removeTarget(A032);
            this.A0R = false;
        }
    }

    public void A0F(boolean z2, boolean z3) {
        C118885vP r1 = this.A0H;
        r1.A01("Method restartPreview() must run on the Optic Background Thread.");
        if (this.A08 != null) {
            r1.A01("Can only check if the prepared on the Optic thread");
            if (r1.A00) {
                AnonymousClass5zJ r2 = this.A08;
                if (!r2.A0G || r2.A0E != 1) {
                    this.A09 = A04(z3 ? this.A0J : this.A0I, z2, false);
                } else {
                    this.A0O.add(new C116555rZ(z2, z3));
                }
            }
        }
    }

    public boolean A0G() {
        return this.A0Q;
    }

    public final boolean A0H(int i2) {
        int[] iArr = (int[]) this.A00.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr != null) {
            for (int i3 : iArr) {
                if (i3 == i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public MeteringRectangle[] A0I() {
        this.A0H.A00("Cannot get default AE regions.");
        return this.A0F;
    }

    public MeteringRectangle[] A0J() {
        this.A0H.A00("Cannot get default AF regions.");
        return this.A0G;
    }
}
