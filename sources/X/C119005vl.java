package X;

import android.graphics.Rect;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import java.util.concurrent.FutureTask;

/* renamed from: X.5vl  reason: invalid class name and case insensitive filesystem */
public class C119005vl {
    public CameraDevice A00;
    public CameraManager A01;
    public AnonymousClass687 A02;
    public C115765qH A03;
    public AnonymousClass5xW A04;
    public C119335wv A05;
    public C111185fT A06;
    public AnonymousClass5wJ A07;
    public FutureTask A08;
    public boolean A09;
    public final C118885vP A0A;
    public final C119355wx A0B;
    public volatile boolean A0C;
    public volatile boolean A0D;
    public volatile boolean A0E;

    public C119005vl(C119355wx r2) {
        C118885vP r0 = new C118885vP(r2);
        this.A0B = r2;
        this.A0A = r0;
    }

    public Integer A00(CaptureRequest.Builder builder, AnonymousClass5zJ r5, AnonymousClass5xD r6) {
        this.A0A.A01("Method lockFocusForCapture() must run on the Optic Background Thread.");
        if (r5 != null) {
            r5.A0E = 2;
            r5.A0D.A02(300);
            this.A0B.A04("lock_focus_for_capture_on_camera_handler_thread", new AnonymousClass67D(builder, this, r5, r6));
            return r5.A0A;
        }
        throw new AnonymousClass67O("Preview closed while processing capture request.");
    }

    public void A01() {
        this.A0A.A02("Failed to release PreviewController.", false);
        this.A03 = null;
        this.A01 = null;
        this.A00 = null;
        this.A07 = null;
        this.A06 = null;
        this.A05 = null;
        this.A04 = null;
    }

    public synchronized void A02() {
        FutureTask futureTask = this.A08;
        if (futureTask != null) {
            this.A0B.A08(futureTask);
            this.A08 = null;
        }
    }

    public void A03(Rect rect, CaptureRequest.Builder builder, AnonymousClass5zJ r17, C115105p9 r18, float[] fArr, boolean z2) {
        AnonymousClass5xW r0;
        AnonymousClass5xD r4;
        Rect rect2;
        C118885vP r1 = this.A0A;
        r1.A01("Cannot perform focus, not on Optic thread.");
        r1.A01("Can only check if the prepared on the Optic thread");
        if (r1.A00 && this.A03.A00.isConnected() && (r0 = this.A04) != null && r0.A0Q) {
            CaptureRequest.Builder builder2 = builder;
            if (builder != null) {
                AnonymousClass5zJ r11 = r17;
                if (r17 != null) {
                    if (AnonymousClass5wJ.A02(AnonymousClass5wJ.A0O, this.A07) && r18 != null && this.A05 != null && this.A0D && (r4 = this.A04.A09) != null) {
                        A02();
                        float[] fArr2 = fArr;
                        A09(C114875ok.FOCUSING, fArr2);
                        MeteringRectangle[] meteringRectangleArr = new MeteringRectangle[1];
                        C119335wv r5 = this.A05;
                        if (!(r5.A04 == null || (rect2 = r5.A03) == null)) {
                            float width = ((float) rect2.width()) / ((float) r5.A04.width());
                            float height = ((float) r5.A03.height()) / ((float) r5.A04.height());
                            int width2 = (r5.A04.width() - r5.A03.width()) >> 1;
                            int height2 = (r5.A04.height() - r5.A03.height()) >> 1;
                            int centerX = (int) ((((float) rect.centerX()) * width) + ((float) width2));
                            int centerY = (int) ((((float) rect.centerY()) * height) + ((float) height2));
                            Rect rect3 = new Rect(centerX, centerY, centerX, centerY);
                            rect3.inset((-rect.width()) >> 1, (-rect.height()) >> 1);
                            rect = rect3;
                        }
                        meteringRectangleArr[0] = new MeteringRectangle(rect, 1000);
                        r11.A04 = null;
                        r11.A06 = new AnonymousClass5zH(builder2, this, r11, fArr2, z2);
                        builder2.set(CaptureRequest.CONTROL_AF_MODE, 1);
                        builder2.set(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr);
                        this.A0C = true;
                        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
                        builder2.set(key, 2);
                        r4.A04(builder2.build(), r11);
                        builder2.set(key, 0);
                        r4.A05(builder2.build(), r11);
                        builder2.set(key, 1);
                        r4.A04(builder2.build(), r11);
                        A08(builder2, r11, z2 ? 6000 : 4000);
                    }
                }
            }
        }
    }

    public void A04(CameraDevice cameraDevice, CameraManager cameraManager, C115765qH r6, AnonymousClass5xW r7, C119335wv r8, C111185fT r9, AnonymousClass5wJ r10) {
        C118885vP r2 = this.A0A;
        r2.A01("Can only prepare the FocusController on the Optic thread.");
        this.A03 = r6;
        this.A01 = cameraManager;
        this.A00 = cameraDevice;
        this.A07 = r10;
        this.A06 = r9;
        this.A05 = r8;
        this.A04 = r7;
        this.A0E = false;
        this.A0D = true;
        r2.A02("Failed to prepare FocusController.", true);
    }

    public void A05(CaptureRequest.Builder builder, AnonymousClass5zJ r14) {
        AnonymousClass5xD r2;
        this.A0A.A01("Can only reset focus on the Optic thread.");
        if (this.A04 != null && this.A05 != null) {
            CaptureRequest.Builder builder2 = builder;
            if (builder != null && this.A07 != null && this.A0D && (r2 = this.A04.A09) != null) {
                this.A0E = false;
                this.A0C = false;
                float A012 = this.A05.A01();
                C119335wv r0 = this.A05;
                AnonymousClass5xW.A01(r0.A03, builder2, this.A07, r0.A06(), this.A05.A05(), A012);
                builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                r2.A04(builder.build(), r14);
                CaptureRequest.Builder builder3 = builder;
                int A002 = C119375wz.A00(this.A01, builder3, this.A06, this.A07, this.A00.getId(), 0);
                builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                r2.A05(builder.build(), r14);
                if (A002 == 1) {
                    CaptureRequest.Key key = CaptureRequest.CONTROL_AF_TRIGGER;
                    builder.set(key, 1);
                    r2.A04(builder.build(), r14);
                    builder.set(key, 0);
                }
            }
        }
    }

    public void A06(CaptureRequest.Builder builder, AnonymousClass5zJ r6) {
        AnonymousClass5xW r1;
        AnonymousClass5xD r2;
        int i2;
        this.A0B.A06("Method setFocusModeForVideo() must run on the Optic Background Thread.");
        if (this.A01 != null && this.A00 != null && (r1 = this.A04) != null && builder != null && this.A07 != null && (r2 = r1.A09) != null) {
            this.A0E = true;
            if (this.A0C) {
                A02();
                return;
            }
            if (AnonymousClass5wJ.A02(AnonymousClass5wJ.A09, this.A07)) {
                i2 = 3;
            } else {
                if (AnonymousClass5wJ.A02(AnonymousClass5wJ.A08, this.A07)) {
                    i2 = 4;
                } else {
                    return;
                }
            }
            builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            r2.A04(builder.build(), r6);
            builder.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(i2));
            builder.set(CaptureRequest.CONTROL_AF_TRIGGER, C13680ns.A0X());
            r2.A05(builder.build(), r6);
        }
    }

    public synchronized void A07(CaptureRequest.Builder builder, AnonymousClass5zJ r5, long j2) {
        AnonymousClass679 r2 = new AnonymousClass679(builder, this, r5);
        A02();
        this.A08 = this.A0B.A02("monitor_auto_exposure", r2, j2);
    }

    public synchronized void A08(CaptureRequest.Builder builder, AnonymousClass5zJ r5, long j2) {
        AnonymousClass678 r2 = new AnonymousClass678(builder, this, r5);
        A02();
        this.A08 = this.A0B.A02("reset_focus", r2, j2);
    }

    public void A09(C114875ok r2, float[] fArr) {
        if (this.A02 != null) {
            AnonymousClass5xT.A00(new AnonymousClass66E(r2, this, fArr));
        }
    }

    public void A0A(AnonymousClass5zJ r3) {
        C111185fT r1;
        if (AnonymousClass5wJ.A02(AnonymousClass5wJ.A04, this.A07)) {
            if (AnonymousClass5wJ.A02(AnonymousClass5wJ.A03, this.A07) && (r1 = this.A06) != null && AnonymousClass000.A1X(r1.A05(AnonymousClass5wI.A0N))) {
                this.A09 = true;
                r3.A06 = new AnonymousClass5zG(this);
                return;
            }
        }
        r3.A06 = null;
        this.A09 = false;
    }
}
