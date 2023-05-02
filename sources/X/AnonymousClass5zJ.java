package X;

import android.hardware.camera2.CaptureRequest;
import com.facebook.redex.IDxCallableShape150S0100000_3_I1;
import com.facebook.redex.IDxSListenerShape401S0100000_3_I1;
import com.facebook.redex.IDxTListenerShape354S0100000_3_I1;

/* renamed from: X.5zJ  reason: invalid class name */
public class AnonymousClass5zJ implements AnonymousClass69K, C1221668n {
    public static final float[] A0I = new float[4];
    public static final int[] A0J = new int[18];
    public int A00 = 0;
    public C115785qJ A01;
    public AnonymousClass67O A02;
    public C117845te A03;
    public C117855tf A04;
    public C118665v3 A05;
    public AnonymousClass689 A06;
    public AnonymousClass68A A07;
    public AnonymousClass5xD A08;
    public Boolean A09;
    public Integer A0A;
    public boolean A0B;
    public final AnonymousClass68B A0C;
    public final AnonymousClass5vT A0D;
    public volatile int A0E = 0;
    public volatile boolean A0F;
    public volatile boolean A0G;
    public volatile boolean A0H;

    public AnonymousClass5zJ() {
        IDxTListenerShape354S0100000_3_I1 iDxTListenerShape354S0100000_3_I1 = new IDxTListenerShape354S0100000_3_I1(this, 0);
        this.A0C = iDxTListenerShape354S0100000_3_I1;
        this.A0G = true;
        AnonymousClass5vT r0 = new AnonymousClass5vT();
        this.A0D = r0;
        r0.A01 = iDxTListenerShape354S0100000_3_I1;
    }

    public final void A00(AnonymousClass5xD r5) {
        if (this.A0E == 1) {
            this.A0E = 0;
            this.A09 = Boolean.TRUE;
            this.A08 = r5;
            this.A0D.A01();
            AnonymousClass68A r1 = this.A07;
            if (r1 != null) {
                IDxSListenerShape401S0100000_3_I1 iDxSListenerShape401S0100000_3_I1 = (IDxSListenerShape401S0100000_3_I1) r1;
                int i2 = iDxSListenerShape401S0100000_3_I1.A01;
                AnonymousClass5xW r3 = (AnonymousClass5xW) iDxSListenerShape401S0100000_3_I1.A00;
                if (i2 == 0) {
                    AnonymousClass5xH.A00();
                    if (!r3.A0L.A00.isEmpty()) {
                        AnonymousClass5xT.A00(new AnonymousClass63U(r3));
                    }
                }
                r3.A0N.A07("handle_preview_started", new IDxCallableShape150S0100000_3_I1(r3, 16));
                return;
            }
            return;
        }
        throw AnonymousClass000.A0a("Starting preview outside BLOCK_STATE_STARTING_PREVIEW state");
    }

    public final void A01(AnonymousClass5xD r3) {
        if (this.A0E == 7) {
            this.A0E = 0;
            this.A09 = Boolean.TRUE;
            this.A08 = r3;
            this.A0D.A01();
            return;
        }
        throw AnonymousClass000.A0a("Starting recording outside BLOCK_STATE_STARTING_RECORD state");
    }

    public void A5c() {
        this.A0D.A00();
    }

    public /* bridge */ /* synthetic */ Object AFb() {
        Boolean bool = this.A09;
        if (bool == null) {
            throw AnonymousClass000.A0V("Start Preview operation hasn't completed yet.");
        } else if (bool.booleanValue()) {
            return this.A08;
        } else {
            throw this.A02;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:95|96|97|(1:99)|100|101|(1:103)|104|(1:107)) */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0074, code lost:
        if (r0 != 5) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0081, code lost:
        if (r7.intValue() != 4) goto L_0x0083;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:100:0x0151 */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x015b A[Catch:{ IllegalArgumentException -> 0x0165 }] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0169  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AO8(X.AnonymousClass5xD r9, X.C118625uz r10) {
        /*
            r8 = this;
            boolean r0 = r8.A0G
            if (r0 == 0) goto L_0x008e
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r10.A00(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x001f
            int r1 = r0.intValue()
            int r0 = r8.A00
            if (r1 == r0) goto L_0x001f
            r8.A00 = r1
            X.5tf r0 = r8.A04
            if (r0 == 0) goto L_0x001f
            r0.A00(r1)
        L_0x001f:
            boolean r0 = r8.A0H
            if (r0 == 0) goto L_0x0047
            X.5v3 r0 = r8.A05
            if (r0 == 0) goto L_0x0047
            r0.A01(r10)
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.SENSOR_TIMESTAMP
            java.lang.Object r0 = r10.A00(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0047
            X.5v3 r2 = r8.A05
            long r0 = r0.longValue()
            X.5wd r3 = r2.A00(r0)
            if (r3 != 0) goto L_0x013c
            java.lang.String r1 = "CameraOperationsCallback"
            java.lang.String r0 = "Failed to retrieve current frame metadata object, after setting it!"
            X.AnonymousClass5xH.A01(r1, r0)
        L_0x0047:
            boolean r0 = r8.A0F
            if (r0 == 0) goto L_0x0050
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.SENSOR_EXPOSURE_TIME
            r10.A00(r0)
        L_0x0050:
            X.689 r0 = r8.A06
            r3 = 0
            r2 = 1
            r4 = 5
            r5 = 4
            if (r0 == 0) goto L_0x0087
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE
            java.lang.Object r7 = r10.A00(r0)
            java.lang.Number r7 = (java.lang.Number) r7
            if (r7 == 0) goto L_0x0076
            X.689 r6 = r8.A06
            if (r6 == 0) goto L_0x006e
            int r1 = r7.intValue()
            if (r1 != r2) goto L_0x0127
            r8.A0B = r2
        L_0x006e:
            int r0 = r7.intValue()
            if (r0 == r5) goto L_0x0076
            if (r0 != r4) goto L_0x0087
        L_0x0076:
            X.689 r6 = r8.A06
            if (r6 == 0) goto L_0x0087
            if (r7 == 0) goto L_0x0083
            int r1 = r7.intValue()
            r0 = 1
            if (r1 == r5) goto L_0x0084
        L_0x0083:
            r0 = 0
        L_0x0084:
            r6.ARU(r0)
        L_0x0087:
            int r0 = r8.A0E
            if (r0 != r2) goto L_0x008f
            r8.A00(r9)
        L_0x008e:
            return
        L_0x008f:
            int r1 = r8.A0E
            r0 = 7
            if (r1 != r0) goto L_0x0098
            r8.A01(r9)
            return
        L_0x0098:
            int r0 = r8.A0E
            r1 = 2
            if (r0 != r1) goto L_0x00c5
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r10.A00(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r8.A0A = r0
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE
            java.lang.Object r0 = r10.A00(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x00b9
            int r0 = r0.intValue()
            if (r0 == r5) goto L_0x00b9
            if (r0 != r4) goto L_0x008e
        L_0x00b9:
            int r0 = r8.A0E
            if (r0 != r1) goto L_0x008e
        L_0x00bd:
            r8.A0E = r3
            X.5vT r0 = r8.A0D
            r0.A01()
            return
        L_0x00c5:
            int r1 = r8.A0E
            r0 = 3
            if (r1 != r0) goto L_0x00df
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r10.A00(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r8.A0A = r0
            if (r0 == 0) goto L_0x00dc
            int r0 = r0.intValue()
            if (r0 != r4) goto L_0x008e
        L_0x00dc:
            r8.A0E = r5
            return
        L_0x00df:
            int r0 = r8.A0E
            if (r0 != r5) goto L_0x00f6
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r10.A00(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r8.A0A = r0
            if (r0 == 0) goto L_0x00bd
            int r0 = r0.intValue()
            if (r0 == r4) goto L_0x008e
            goto L_0x00bd
        L_0x00f6:
            int r0 = r8.A0E
            r1 = 6
            if (r0 != r4) goto L_0x0110
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r10.A00(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r8.A0A = r0
            if (r0 == 0) goto L_0x010d
            int r0 = r0.intValue()
            if (r0 != r2) goto L_0x008e
        L_0x010d:
            r8.A0E = r1
            return
        L_0x0110:
            int r0 = r8.A0E
            if (r0 != r1) goto L_0x008e
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
            java.lang.Object r0 = r10.A00(r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            r8.A0A = r0
            if (r0 == 0) goto L_0x00bd
            int r0 = r0.intValue()
            if (r0 == r2) goto L_0x008e
            goto L_0x00bd
        L_0x0127:
            boolean r0 = r8.A0B
            if (r0 == 0) goto L_0x006e
            r0 = 2
            if (r1 != r0) goto L_0x0135
            r6.ARU(r2)
        L_0x0131:
            r8.A0B = r3
            goto L_0x006e
        L_0x0135:
            r0 = 6
            if (r1 != r0) goto L_0x006e
            r6.ARU(r3)
            goto L_0x0131
        L_0x013c:
            r2 = 0
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.COLOR_CORRECTION_GAINS     // Catch:{ IllegalArgumentException -> 0x0151 }
            java.lang.Object r0 = r10.A00(r0)     // Catch:{ IllegalArgumentException -> 0x0151 }
            android.hardware.camera2.params.RggbChannelVector r0 = (android.hardware.camera2.params.RggbChannelVector) r0     // Catch:{ IllegalArgumentException -> 0x0151 }
            if (r0 == 0) goto L_0x0151
            float[] r1 = A0I     // Catch:{ IllegalArgumentException -> 0x0151 }
            r0.copyTo(r1, r2)     // Catch:{ IllegalArgumentException -> 0x0151 }
            X.5qQ r0 = X.C119155wd.A0H     // Catch:{ IllegalArgumentException -> 0x0151 }
            r3.A01(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0151 }
        L_0x0151:
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.COLOR_CORRECTION_TRANSFORM     // Catch:{ IllegalArgumentException -> 0x0165 }
            java.lang.Object r0 = r10.A00(r0)     // Catch:{ IllegalArgumentException -> 0x0165 }
            android.hardware.camera2.params.ColorSpaceTransform r0 = (android.hardware.camera2.params.ColorSpaceTransform) r0     // Catch:{ IllegalArgumentException -> 0x0165 }
            if (r0 == 0) goto L_0x0165
            int[] r1 = A0J     // Catch:{ IllegalArgumentException -> 0x0165 }
            r0.copyElements(r1, r2)     // Catch:{ IllegalArgumentException -> 0x0165 }
            X.5qQ r0 = X.C119155wd.A0I     // Catch:{ IllegalArgumentException -> 0x0165 }
            r3.A01(r0, r1)     // Catch:{ IllegalArgumentException -> 0x0165 }
        L_0x0165:
            X.5te r0 = r8.A03
            if (r0 == 0) goto L_0x0047
            r0.A00(r8)
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5zJ.AO8(X.5xD, X.5uz):void");
    }

    public void AO9(C118615uy r3, AnonymousClass5xD r4) {
        if (!this.A0G) {
            return;
        }
        if (this.A0E == 1 || this.A0E == 7) {
            this.A0E = 0;
            this.A09 = Boolean.FALSE;
            this.A02 = new AnonymousClass67O(AnonymousClass000.A0l(AnonymousClass000.A0r("Failed to start operation. Reason: "), r3.A00()));
            if (this.A01 != null) {
                r3.A00();
            }
            this.A0D.A01();
        }
    }

    public void AOA(CaptureRequest captureRequest, AnonymousClass5xD r4, long j2, long j3) {
        if (!this.A0G) {
            return;
        }
        if (this.A0E == 1) {
            A00(r4);
        } else if (this.A0E == 7) {
            A01(r4);
        }
    }
}
