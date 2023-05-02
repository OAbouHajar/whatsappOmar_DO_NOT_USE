package X;

import android.hardware.camera2.CaptureRequest;
import android.os.SystemClock;
import com.facebook.redex.IDxTListenerShape354S0100000_3_I1;

/* renamed from: X.5zI  reason: invalid class name */
public class AnonymousClass5zI implements AnonymousClass69K, C1221668n {
    public static final float[] A09 = new float[4];
    public static final int[] A0A = new int[18];
    public Long A00;
    public final C118665v3 A01;
    public final AnonymousClass68B A02;
    public final AnonymousClass5vT A03;
    public final C117865tg A04 = new C117865tg(this);
    public final boolean A05;
    public volatile AnonymousClass67O A06;
    public volatile AnonymousClass5wG A07;
    public volatile Boolean A08;

    public AnonymousClass5zI(boolean z2) {
        IDxTListenerShape354S0100000_3_I1 iDxTListenerShape354S0100000_3_I1 = new IDxTListenerShape354S0100000_3_I1(this, 2);
        this.A02 = iDxTListenerShape354S0100000_3_I1;
        this.A05 = z2;
        AnonymousClass5vT r2 = new AnonymousClass5vT();
        this.A03 = r2;
        r2.A01 = iDxTListenerShape354S0100000_3_I1;
        r2.A02(10000);
        this.A01 = new C118665v3();
    }

    public void A5c() {
        this.A03.A00();
    }

    public /* bridge */ /* synthetic */ Object AFb() {
        String str;
        if (this.A08 == null) {
            str = "Photo capture operation hasn't completed yet.";
        } else if (this.A08.booleanValue()) {
            AnonymousClass5wG r1 = this.A07;
            if (r1 != null && (r1.A04 != null || r1.A01 != null)) {
                return r1;
            }
            str = "Photo capture data is null.";
        } else {
            throw this.A06;
        }
        throw AnonymousClass000.A0V(str);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x005d */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0067 A[Catch:{ IllegalArgumentException -> 0x002a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AO8(X.AnonymousClass5xD r5, X.C118625uz r6) {
        /*
            r4 = this;
            X.5wa r3 = X.C119125wa.A00()
            long r1 = r3.A02
            r0 = 6
            r3.A02(r0, r1)
            X.5v3 r2 = r4.A01
            r2.A01(r6)
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.SENSOR_TIMESTAMP
            java.lang.Object r0 = r6.A00(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x002a
            long r0 = r0.longValue()
            X.5wd r3 = r2.A00(r0)
            if (r3 != 0) goto L_0x0048
            java.lang.String r1 = "StillImageCaptureCallback"
            java.lang.String r0 = "Failed to retrieve current frame metadata object, after setting it!"
            X.AnonymousClass5xH.A01(r1, r0)
        L_0x002a:
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.SENSOR_EXPOSURE_TIME
            java.lang.Object r0 = r6.A00(r0)
            java.lang.Long r0 = (java.lang.Long) r0
            r4.A00 = r0
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x0047
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r4.A08
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0047
            X.5vT r0 = r4.A03
            r0.A01()
        L_0x0047:
            return
        L_0x0048:
            r2 = 0
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.COLOR_CORRECTION_GAINS     // Catch:{ IllegalArgumentException -> 0x005d }
            java.lang.Object r0 = r6.A00(r0)     // Catch:{ IllegalArgumentException -> 0x005d }
            android.hardware.camera2.params.RggbChannelVector r0 = (android.hardware.camera2.params.RggbChannelVector) r0     // Catch:{ IllegalArgumentException -> 0x005d }
            if (r0 == 0) goto L_0x005d
            float[] r1 = A09     // Catch:{ IllegalArgumentException -> 0x005d }
            r0.copyTo(r1, r2)     // Catch:{ IllegalArgumentException -> 0x005d }
            X.5qQ r0 = X.C119155wd.A0H     // Catch:{ IllegalArgumentException -> 0x005d }
            r3.A01(r0, r1)     // Catch:{ IllegalArgumentException -> 0x005d }
        L_0x005d:
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.COLOR_CORRECTION_TRANSFORM     // Catch:{ IllegalArgumentException -> 0x002a }
            java.lang.Object r0 = r6.A00(r0)     // Catch:{ IllegalArgumentException -> 0x002a }
            android.hardware.camera2.params.ColorSpaceTransform r0 = (android.hardware.camera2.params.ColorSpaceTransform) r0     // Catch:{ IllegalArgumentException -> 0x002a }
            if (r0 == 0) goto L_0x002a
            int[] r1 = A0A     // Catch:{ IllegalArgumentException -> 0x002a }
            r0.copyElements(r1, r2)     // Catch:{ IllegalArgumentException -> 0x002a }
            X.5qQ r0 = X.C119155wd.A0I     // Catch:{ IllegalArgumentException -> 0x002a }
            r3.A01(r0, r1)     // Catch:{ IllegalArgumentException -> 0x002a }
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5zI.AO8(X.5xD, X.5uz):void");
    }

    public void AO9(C118615uy r1, AnonymousClass5xD r2) {
    }

    public void AOA(CaptureRequest captureRequest, AnonymousClass5xD r5, long j2, long j3) {
        C119125wa.A00().A02 = SystemClock.elapsedRealtime();
    }
}
