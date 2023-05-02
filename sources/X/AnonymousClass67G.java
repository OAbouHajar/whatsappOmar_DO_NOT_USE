package X;

import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import java.util.concurrent.Callable;

/* renamed from: X.67G  reason: invalid class name */
public class AnonymousClass67G implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ CameraManager A03;
    public final /* synthetic */ CaptureRequest.Builder A04;
    public final /* synthetic */ C118645v1 A05;
    public final /* synthetic */ C119305ws A06;
    public final /* synthetic */ AnonymousClass5zJ A07;
    public final /* synthetic */ C115105p9 A08;
    public final /* synthetic */ AnonymousClass5wQ A09;
    public final /* synthetic */ boolean A0A;

    public AnonymousClass67G(CameraManager cameraManager, CaptureRequest.Builder builder, C118645v1 r3, C119305ws r4, AnonymousClass5zJ r5, C115105p9 r6, AnonymousClass5wQ r7, int i2, int i3, int i4, boolean z2) {
        this.A06 = r4;
        this.A09 = r7;
        this.A03 = cameraManager;
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = i4;
        this.A04 = builder;
        this.A08 = r6;
        this.A0A = z2;
        this.A07 = r5;
        this.A05 = r3;
    }

    public /* bridge */ /* synthetic */ Object call() {
        C119305ws r1 = this.A06;
        AnonymousClass5wQ r7 = this.A09;
        CameraManager cameraManager = this.A03;
        int i2 = this.A00;
        int i3 = this.A01;
        int i4 = this.A02;
        CaptureRequest.Builder builder = this.A04;
        C115105p9 r6 = this.A08;
        boolean z2 = this.A0A;
        r1.A02(cameraManager, builder, this.A05, this.A07, r6, r7, i2, i3, i4, z2);
        return null;
    }
}
