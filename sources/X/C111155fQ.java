package X;

import java.util.List;

/* renamed from: X.5fQ  reason: invalid class name and case insensitive filesystem */
public final class C111155fQ extends AnonymousClass5wJ {
    public final C117345sq A00;
    public final AnonymousClass5vQ A01;
    public final Boolean A02;
    public final Boolean A03;
    public final Boolean A04;
    public final Boolean A05;
    public final Boolean A06;
    public final Boolean A07;
    public final Boolean A08;
    public final Boolean A09;
    public final Boolean A0A;
    public final Boolean A0B;
    public final Boolean A0C;
    public final Boolean A0D;
    public final Boolean A0E;
    public final Float A0F;
    public final Float A0G;
    public final Float A0H;
    public final Integer A0I;
    public final Integer A0J;
    public final Integer A0K;
    public final Integer A0L;
    public final Integer A0M;
    public final Integer A0N;
    public final List A0O;
    public final List A0P;
    public final List A0Q;
    public final List A0R;
    public final List A0S;
    public final List A0T;
    public final List A0U;
    public final List A0V;
    public final List A0W;
    public final List A0X;
    public final List A0Y;
    public final List A0Z;
    public final List A0a;
    public final List A0b;
    public final List A0c;
    public final List A0d;

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0376, code lost:
        if (X.C110115dX.A1E(r7, 17) != false) goto L_0x0379;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00bb, code lost:
        if (r1 == 0) goto L_0x00bd;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x029d  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02e4  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x02f9 A[LOOP:8: B:116:0x02f7->B:117:0x02f9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x02fe  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0325  */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0331  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03ee  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x040a  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x045a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0284  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C111155fQ(android.hardware.Camera.Parameters r21) {
        /*
            r20 = this;
            r6 = r20
            r6.<init>()
            r11 = r21
            int r19 = r11.getMaxNumDetectedFaces()
            int r18 = r11.getMaxNumFocusAreas()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            r6.A0J = r0
            int r17 = r11.getMaxNumMeteringAreas()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)
            r6.A0K = r0
            boolean r8 = r11.isZoomSupported()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r6.A0E = r0
            r4 = 0
            if (r8 == 0) goto L_0x0069
            int r0 = r11.getMaxZoom()
        L_0x0030:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r6.A0L = r5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r6.A0N = r0
            boolean r0 = r11.isSmoothZoomSupported()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A0D = r0
            if (r8 == 0) goto L_0x006b
            java.util.List r7 = r11.getZoomRatios()
            int r3 = r7.size()
            java.util.ArrayList r2 = X.C13690nt.A0i(r3)
            r1 = 0
        L_0x0055:
            if (r1 >= r3) goto L_0x006c
            java.lang.Object r0 = r7.get(r1)
            float r0 = X.AnonymousClass000.A04(r0)
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2.add(r0)
            int r1 = r1 + 1
            goto L_0x0055
        L_0x0069:
            r0 = 0
            goto L_0x0030
        L_0x006b:
            r2 = 0
        L_0x006c:
            java.util.List r1 = X.C119115vz.A00(r2)
            r6.A0d = r1
            r3 = 0
            if (r8 == 0) goto L_0x012e
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x012e
            java.lang.Object r0 = r1.get(r4)
            float r0 = X.AnonymousClass000.A04(r0)
        L_0x0083:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r6.A0H = r0
            if (r8 == 0) goto L_0x012b
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x012b
            int r0 = r5.intValue()
            java.lang.Object r0 = r1.get(r0)
            float r0 = X.AnonymousClass000.A04(r0)
        L_0x009d:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r6.A0G = r0
            int r2 = r11.getMinExposureCompensation()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r6.A0M = r0
            int r1 = r11.getMaxExposureCompensation()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r6.A0I = r0
            r5 = 1
            if (r2 == 0) goto L_0x00bd
            r0 = 1
            if (r1 != 0) goto L_0x00be
        L_0x00bd:
            r0 = 0
        L_0x00be:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A05 = r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00ce
            float r3 = r11.getExposureCompensationStep()
        L_0x00ce:
            java.lang.Float r0 = java.lang.Float.valueOf(r3)
            r6.A0F = r0
            boolean r0 = r11.isAutoExposureLockSupported()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A02 = r0
            boolean r0 = r11.isAutoWhiteBalanceLockSupported()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A04 = r0
            boolean r0 = r11.isVideoSnapshotSupported()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A0B = r0
            boolean r0 = r11.isVideoStabilizationSupported()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A0C = r0
            java.util.List r0 = r11.getSupportedPreviewFrameRates()
            java.util.List r0 = X.C119115vz.A00(r0)
            r6.A0Y = r0
            java.util.List r7 = r11.getSupportedFocusModes()
            if (r7 == 0) goto L_0x0131
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0131
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
            int r2 = r7.size()
            r1 = 0
        L_0x011b:
            if (r1 >= r2) goto L_0x0134
            java.lang.String r0 = X.AnonymousClass000.A0n(r7, r1)
            int r0 = X.AnonymousClass5xX.A03(r0)
            X.C110105dW.A1S(r3, r0)
            int r1 = r1 + 1
            goto L_0x011b
        L_0x012b:
            r0 = 0
            goto L_0x009d
        L_0x012e:
            r0 = 0
            goto L_0x0083
        L_0x0131:
            java.util.List r8 = X.C119115vz.A00
            goto L_0x0138
        L_0x0134:
            java.util.List r8 = X.C119115vz.A00(r3)
        L_0x0138:
            r6.A0S = r8
            java.util.List r7 = r11.getSupportedAntibanding()
            if (r7 == 0) goto L_0x015f
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x015f
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
            int r2 = r7.size()
            r1 = 0
        L_0x014f:
            if (r1 >= r2) goto L_0x0162
            java.lang.String r0 = X.AnonymousClass000.A0n(r7, r1)
            int r0 = X.AnonymousClass5xX.A00(r0)
            X.C110105dW.A1S(r3, r0)
            int r1 = r1 + 1
            goto L_0x014f
        L_0x015f:
            java.util.List r0 = X.C119115vz.A00
            goto L_0x0166
        L_0x0162:
            java.util.List r0 = X.C119115vz.A00(r3)
        L_0x0166:
            r6.A0P = r0
            java.util.List r7 = r11.getSupportedColorEffects()
            if (r7 == 0) goto L_0x018d
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x018d
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
            int r2 = r7.size()
            r1 = 0
        L_0x017d:
            if (r1 >= r2) goto L_0x0190
            java.lang.String r0 = X.AnonymousClass000.A0n(r7, r1)
            int r0 = X.AnonymousClass5xX.A01(r0)
            X.C110105dW.A1S(r3, r0)
            int r1 = r1 + 1
            goto L_0x017d
        L_0x018d:
            java.util.List r0 = X.C119115vz.A00
            goto L_0x0194
        L_0x0190:
            java.util.List r0 = X.C119115vz.A00(r3)
        L_0x0194:
            r6.A0Q = r0
            java.util.List r7 = r11.getSupportedFlashModes()
            if (r7 == 0) goto L_0x01bb
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x01bb
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
            int r2 = r7.size()
            r1 = 0
        L_0x01ab:
            if (r1 >= r2) goto L_0x01be
            java.lang.String r0 = X.AnonymousClass000.A0n(r7, r1)
            int r0 = X.AnonymousClass5xX.A02(r0)
            X.C110105dW.A1S(r3, r0)
            int r1 = r1 + 1
            goto L_0x01ab
        L_0x01bb:
            java.util.List r9 = X.C119115vz.A00
            goto L_0x01c2
        L_0x01be:
            java.util.List r9 = X.C119115vz.A00(r3)
        L_0x01c2:
            r6.A0R = r9
            java.util.List r0 = r11.getSupportedPictureFormats()
            java.util.List r0 = X.C119115vz.A00(r0)
            r6.A0U = r0
            java.lang.String r0 = "preview-fps-range-values"
            java.lang.String r12 = r11.get(r0)
            r16 = 0
            if (r12 == 0) goto L_0x0250
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x0250
            r1 = 0
            char r0 = r12.charAt(r4)
            r10 = 40
            if (r0 != r10) goto L_0x0250
            int r0 = r12.length()
            int r0 = r0 + -1
            char r0 = r12.charAt(r0)
            r7 = 41
            if (r0 != r7) goto L_0x0250
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
        L_0x01f9:
            int r2 = r12.indexOf(r7, r1)
            int r0 = r2 + 1
            java.lang.String r13 = r12.substring(r1, r0)
            java.lang.String r15 = "Invalid range list string="
            if (r13 == 0) goto L_0x0242
            char r0 = r13.charAt(r4)
            if (r0 != r10) goto L_0x0242
            int r0 = r13.length()
            int r0 = r0 - r5
            char r0 = r13.charAt(r0)
            if (r0 != r7) goto L_0x0242
            r0 = 2
            int[] r14 = new int[r0]
            r0 = 44
            int r1 = r13.indexOf(r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0234 }
            int r0 = X.C110115dX.A02(r13, r5, r1)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0234 }
            r14[r4] = r0     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0234 }
            int r1 = r1 + 1
            int r0 = r13.indexOf(r7, r1)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0234 }
            int r0 = X.C110115dX.A02(r13, r1, r0)     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0234 }
            r14[r5] = r0     // Catch:{ NumberFormatException | StringIndexOutOfBoundsException -> 0x0234 }
            goto L_0x0260
        L_0x0234:
            java.lang.String r1 = "ParametersHelper"
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r15)
            java.lang.String r0 = X.AnonymousClass000.A0h(r13, r0)
            android.util.Log.e(r1, r0)
            goto L_0x0263
        L_0x0242:
            java.lang.String r1 = "ParametersHelper"
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r15)
            java.lang.String r0 = X.AnonymousClass000.A0h(r13, r0)
            android.util.Log.e(r1, r0)
            goto L_0x0263
        L_0x0250:
            java.lang.String r1 = "ParametersHelper"
            java.lang.String r0 = "Invalid range list string="
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass000.A0h(r12, r0)
            android.util.Log.e(r1, r0)
            goto L_0x0272
        L_0x0260:
            r3.add(r14)
        L_0x0263:
            int r1 = r12.indexOf(r10, r2)
            r0 = -1
            if (r1 != r0) goto L_0x01f9
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0272
            r16 = r3
        L_0x0272:
            java.util.List r0 = X.C119115vz.A00(r16)
            r6.A0X = r0
            java.util.List r7 = r11.getSupportedSceneModes()
            if (r7 == 0) goto L_0x029d
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x029d
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
            int r2 = r7.size()
            r1 = 0
        L_0x028d:
            if (r1 >= r2) goto L_0x02a0
            java.lang.String r0 = X.AnonymousClass000.A0n(r7, r1)
            int r0 = X.AnonymousClass5xX.A04(r0)
            X.C110105dW.A1S(r3, r0)
            int r1 = r1 + 1
            goto L_0x028d
        L_0x029d:
            java.util.List r7 = X.C119115vz.A00
            goto L_0x02a4
        L_0x02a0:
            java.util.List r7 = X.C119115vz.A00(r3)
        L_0x02a4:
            r6.A0a = r7
            java.util.List r0 = r11.getSupportedPreviewFormats()
            java.util.List r0 = X.C119115vz.A00(r0)
            r6.A0W = r0
            java.util.List r10 = r11.getSupportedWhiteBalance()
            if (r10 == 0) goto L_0x02d5
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x02d5
            java.util.ArrayList r3 = X.AnonymousClass000.A0u()
            int r2 = r10.size()
            r1 = 0
        L_0x02c5:
            if (r1 >= r2) goto L_0x02d8
            java.lang.String r0 = X.AnonymousClass000.A0n(r10, r1)
            int r0 = X.AnonymousClass5xX.A05(r0)
            X.C110105dW.A1S(r3, r0)
            int r1 = r1 + 1
            goto L_0x02c5
        L_0x02d5:
            java.util.List r0 = X.C119115vz.A00
            goto L_0x02dc
        L_0x02d8:
            java.util.List r0 = X.C119115vz.A00(r3)
        L_0x02dc:
            r6.A0c = r0
            java.util.List r3 = r11.getSupportedJpegThumbnailSizes()
            if (r3 != 0) goto L_0x02fe
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x02e8:
            r6.A0T = r0
            java.util.List r3 = r11.getSupportedPictureSizes()
            int r2 = r3.size()
            java.util.ArrayList r1 = X.C13690nt.A0i(r2)
            r0 = 0
        L_0x02f7:
            if (r0 >= r2) goto L_0x0313
            int r0 = X.AnonymousClass5vQ.A00(r1, r3, r0)
            goto L_0x02f7
        L_0x02fe:
            int r2 = r3.size()
            java.util.ArrayList r1 = X.C13690nt.A0i(r2)
            r0 = 0
        L_0x0307:
            if (r0 >= r2) goto L_0x030e
            int r0 = X.AnonymousClass5vQ.A00(r1, r3, r0)
            goto L_0x0307
        L_0x030e:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            goto L_0x02e8
        L_0x0313:
            java.util.HashMap r0 = X.AnonymousClass5w4.A00
            java.util.List r0 = X.AnonymousClass5w4.A00(r0, r1)
            java.util.List r3 = java.util.Collections.unmodifiableList(r0)
            r6.A0V = r3
            java.util.List r10 = r11.getSupportedPreviewSizes()
            if (r10 != 0) goto L_0x040a
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x0329:
            r6.A0Z = r0
            java.util.List r10 = r11.getSupportedVideoSizes()
            if (r10 != 0) goto L_0x03ee
            java.util.List r0 = java.util.Collections.emptyList()
        L_0x0335:
            r6.A0b = r0
            java.lang.Integer r0 = X.C13680ns.A0a()
            boolean r0 = r9.contains(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A0A = r0
            boolean r0 = X.C110115dX.A1E(r8, r5)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A03 = r0
            boolean r0 = X.AnonymousClass000.A1Q(r17)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A09 = r0
            boolean r0 = X.AnonymousClass000.A1Q(r18)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A08 = r0
            boolean r0 = X.C119385xd.A01
            if (r0 == 0) goto L_0x0378
            java.util.HashSet r0 = X.AnonymousClass5w4.A04
            boolean r0 = X.AnonymousClass5x0.A02(r0)
            if (r0 != 0) goto L_0x0378
            r0 = 17
            boolean r1 = X.C110115dX.A1E(r7, r0)
            r0 = 1
            if (r1 != 0) goto L_0x0379
        L_0x0378:
            r0 = 0
        L_0x0379:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A07 = r0
            if (r19 <= 0) goto L_0x0382
            r4 = 1
        L_0x0382:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            r6.A06 = r0
            java.lang.String r0 = "preferred-preview-size-for-video"
            java.lang.String r1 = r11.get(r0)
            if (r1 == 0) goto L_0x0420
            java.lang.String r0 = "null"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0420
            java.lang.String r0 = "x"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0420
            java.util.ArrayList r7 = X.C119385xd.A02(r1)
            int r4 = r7.size()
            r2 = 0
        L_0x03a9:
            if (r2 >= r4) goto L_0x0420
            java.lang.Object r8 = r7.get(r2)
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x03eb
            r0 = 120(0x78, float:1.68E-43)
            int r1 = r8.indexOf(r0)
            r0 = -1
            java.lang.String r9 = "Invalid size parameter string="
            if (r1 == r0) goto L_0x03d0
            r0 = 0
            java.lang.String r0 = r8.substring(r0, r1)     // Catch:{ NumberFormatException -> 0x03de }
            java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x03de }
            int r0 = r1 + 1
            java.lang.String r0 = r8.substring(r0)     // Catch:{ NumberFormatException -> 0x03de }
            java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x03de }
            goto L_0x0420
        L_0x03d0:
            java.lang.String r1 = "ParametersHelper"
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r9)
            java.lang.String r0 = X.AnonymousClass000.A0h(r8, r0)
            android.util.Log.e(r1, r0)
            goto L_0x03eb
        L_0x03de:
            java.lang.String r1 = "ParametersHelper"
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r9)
            java.lang.String r0 = X.AnonymousClass000.A0h(r8, r0)
            android.util.Log.e(r1, r0)
        L_0x03eb:
            int r2 = r2 + 1
            goto L_0x03a9
        L_0x03ee:
            int r2 = r10.size()
            java.util.ArrayList r1 = X.C13690nt.A0i(r2)
            r0 = 0
        L_0x03f7:
            if (r0 >= r2) goto L_0x03fe
            int r0 = X.AnonymousClass5vQ.A00(r1, r10, r0)
            goto L_0x03f7
        L_0x03fe:
            java.util.HashMap r0 = X.AnonymousClass5w4.A01
            java.util.List r0 = X.AnonymousClass5w4.A00(r0, r1)
            java.util.List r0 = java.util.Collections.unmodifiableList(r0)
            goto L_0x0335
        L_0x040a:
            int r2 = r10.size()
            java.util.ArrayList r1 = X.C13690nt.A0i(r2)
            r0 = 0
        L_0x0413:
            if (r0 >= r2) goto L_0x041a
            int r0 = X.AnonymousClass5vQ.A00(r1, r10, r0)
            goto L_0x0413
        L_0x041a:
            java.util.List r0 = java.util.Collections.unmodifiableList(r1)
            goto L_0x0329
        L_0x0420:
            java.lang.String r0 = "iso-values"
            java.lang.String r2 = r11.get(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r1 = "iso"
            if (r0 == 0) goto L_0x047b
            java.lang.String r0 = "iso-mode-values"
            java.lang.String r2 = r11.get(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L_0x047b
            java.lang.String r0 = "iso-speed-values"
            java.lang.String r1 = r11.get(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x046a
            java.lang.String r0 = "iso-speed"
        L_0x0448:
            X.5sq r0 = X.C119385xd.A00(r11, r0, r1)
        L_0x044c:
            r6.A00 = r0
            r7 = 0
            X.5vQ r4 = new X.5vQ
            r4.<init>(r7, r7)
        L_0x0454:
            int r0 = r3.size()
            if (r7 >= r0) goto L_0x0480
            java.lang.Object r2 = r3.get(r7)
            X.5vQ r2 = (X.AnonymousClass5vQ) r2
            int r1 = r2.A00
            int r0 = r4.A00
            if (r1 <= r0) goto L_0x0467
            r4 = r2
        L_0x0467:
            int r7 = r7 + 1
            goto L_0x0454
        L_0x046a:
            java.lang.String r0 = "nv-picture-iso-values"
            java.lang.String r1 = r11.get(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0479
            java.lang.String r0 = "nv-picture-iso"
            goto L_0x0448
        L_0x0479:
            r0 = 0
            goto L_0x044c
        L_0x047b:
            X.5sq r0 = X.C119385xd.A00(r11, r1, r2)
            goto L_0x044c
        L_0x0480:
            r6.A01 = r4
            float r4 = r11.getFocalLength()
            float r0 = r11.getHorizontalViewAngle()
            double r7 = (double) r0
            r9 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r7 = r7 * r9
            r2 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r7 = r7 / r2
            float r0 = r11.getVerticalViewAngle()
            double r0 = (double) r0
            double r0 = r0 * r9
            double r0 = r0 / r2
            r2 = 1073741824(0x40000000, float:2.0)
            float r4 = r4 * r2
            double r2 = (double) r4
            r9 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = r0 / r9
            double r0 = java.lang.Math.tan(r0)
            double r0 = r0 * r2
            double r0 = java.lang.Math.abs(r0)
            float r4 = (float) r0
            double r7 = r7 / r9
            double r0 = java.lang.Math.tan(r7)
            double r2 = r2 * r0
            double r0 = java.lang.Math.abs(r2)
            float r3 = (float) r0
            r0 = 2
            java.lang.Float[] r2 = new java.lang.Float[r0]
            java.lang.Float r1 = java.lang.Float.valueOf(r4)
            r0 = 0
            r2[r0] = r1
            java.lang.Float r0 = java.lang.Float.valueOf(r3)
            r2[r5] = r0
            java.util.List r0 = java.util.Arrays.asList(r2)
            r6.A0O = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C111155fQ.<init>(android.hardware.Camera$Parameters):void");
    }
}
