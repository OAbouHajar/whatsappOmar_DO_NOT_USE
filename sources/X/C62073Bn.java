package X;

import android.graphics.Color;

/* renamed from: X.3Bn  reason: invalid class name and case insensitive filesystem */
public class C62073Bn {
    public static final float[] A07 = {0.25f, 0.25f, 0.25f, 0.25f, 0.75f, 0.75f, 0.75f, 0.75f};
    public static final float[] A08 = {0.25f, 0.3f, 0.75f, 0.8f, 0.25f, 0.3f, 0.75f, 0.8f};
    public static final int[] A09 = {14557250, 14687296, 3292341, 3292341, 1423676, 1423676, 15990016, 15990016};
    public static final int[] A0A = {4408575, 4408575, 10296875, 10296875, 4696576, 4696576, 3014647, 3014647};
    public final C16300so A00;
    public final C15900s5 A01;
    public final AnonymousClass12W A02;
    public final C16980tz A03;
    public final C15860rz A04;
    public final C14710pd A05;
    public final AnonymousClass1QT A06;

    public C62073Bn(C16300so r1, C15900s5 r2, AnonymousClass12W r3, C16980tz r4, C15860rz r5, C14710pd r6, AnonymousClass1QT r7) {
        this.A03 = r4;
        this.A05 = r6;
        this.A00 = r1;
        this.A06 = r7;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
    }

    public static int A00(int i2, int i3) {
        return Math.max(Math.max(AnonymousClass000.A09(Color.red(i2), Color.red(i3)), AnonymousClass000.A09(Color.green(i2), Color.green(i3))), Color.blue(i2) - Color.blue(i3));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Integer A01(java.util.Set r4, int r5) {
        /*
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
        L_0x0004:
            int r3 = r2.intValue()
            r2 = 2
            r1 = 1
            if (r3 == r1) goto L_0x002f
            r0 = 3
            if (r3 == r2) goto L_0x002a
            r2 = 4
            if (r3 == r0) goto L_0x002f
            if (r3 == r2) goto L_0x0025
            r2 = 0
        L_0x0015:
            r1 = 0
            if (r2 == 0) goto L_0x0034
            int r0 = r2.intValue()
            if (r0 == r5) goto L_0x0034
            boolean r0 = r4.contains(r2)
            if (r0 != 0) goto L_0x0004
            return r2
        L_0x0025:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            goto L_0x0015
        L_0x002a:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L_0x0015
        L_0x002f:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0015
        L_0x0034:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62073Bn.A01(java.util.Set, int):java.lang.Integer");
    }

    public static final void A02(int i2) {
        StringBuilder A0o = AnonymousClass000.A0o();
        AnonymousClass000.A1J(A0o, i2);
        A0o.append(" (");
        A0o.append(Color.red(i2));
        A0o.append(",");
        A0o.append(Color.green(i2));
        A0o.append(",");
        A0o.append(Color.blue(i2));
        A0o.append(")");
        A0o.toString();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v97, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v32, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v28, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v139, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v50, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v39, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v140, resolved type: byte} */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02ff, code lost:
        r5 = new X.C88384aP(r39, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03b5, code lost:
        if (r40 == null) goto L_0x03ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x056e, code lost:
        if (r40 == null) goto L_0x0573;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r3v27, types: [int, byte] */
    /* JADX WARNING: Incorrect type for immutable var: ssa=byte, code=int, for r4v31, types: [int, byte] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:138:0x0391 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:146:0x039c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:151:0x03a1 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x03d3 A[Catch:{ UnsupportedEncodingException | JSONException -> 0x0574, all -> 0x0579 }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0442 A[Catch:{ UnsupportedEncodingException | JSONException -> 0x0574, all -> 0x0579 }] */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x04be A[Catch:{ UnsupportedEncodingException | JSONException -> 0x0574, all -> 0x0579 }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x04f2 A[Catch:{ UnsupportedEncodingException | JSONException -> 0x0574, all -> 0x0579 }] */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0504 A[Catch:{ UnsupportedEncodingException | JSONException -> 0x0574, all -> 0x0579 }] */
    /* JADX WARNING: Removed duplicated region for block: B:247:0x0508 A[Catch:{ UnsupportedEncodingException | JSONException -> 0x0574, all -> 0x0579 }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x050d A[Catch:{ UnsupportedEncodingException | JSONException -> 0x0574, all -> 0x0579 }] */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0519 A[Catch:{ UnsupportedEncodingException | JSONException -> 0x0574, all -> 0x0579 }, LOOP:0: B:5:0x0048->B:250:0x0519, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0520  */
    /* JADX WARNING: Removed duplicated region for block: B:281:0x0526 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03() {
        /*
            r46 = this;
            r45 = r46
            r0 = r45
            X.0pd r0 = r0.A05
            r44 = r0
            r2 = 422(0x1a6, float:5.91E-43)
            X.0tM r18 = X.C16620tM.A02
            r1 = r18
            boolean r0 = r0.A0E(r1, r2)
            int r0 = X.C43291zl.A01(r0)
            r11 = 1
            if (r0 != r11) goto L_0x058d
            r0 = r45
            X.0rz r0 = r0.A04
            r43 = r0
            boolean r0 = r43.A1j()
            if (r0 != 0) goto L_0x058d
            r43.A0b()
            java.lang.String r0 = "transcoderCompliance/run test"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r19 = 0
            r3 = -1
            r12 = r19
            X.4aF r0 = new X.4aF
            r2 = r12
            r4 = -1
            r5 = -1
            r6 = -1
            r1 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            java.util.HashSet r22 = X.C13680ns.A0o()
            java.util.HashSet r21 = X.C13680ns.A0o()
            r15 = 0
            r20 = 0
        L_0x0048:
            r3 = 422(0x1a6, float:5.91E-43)
            r2 = r18
            r1 = r44
            boolean r2 = r1.A0E(r2, r3)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            r1 = r45
            X.1QT r3 = r1.A06     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            android.media.MediaCodecInfo r13 = X.AnonymousClass1QT.A02(r2)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            r1 = 0
            if (r13 != 0) goto L_0x006b
            java.lang.String r2 = "transcoderCompliance/no media encoder found"
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            r2 = 3
            X.4aP r3 = new X.4aP     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            r3.<init>(r1, r2)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            goto L_0x0162
        L_0x006b:
            java.lang.String r41 = r13.getName()     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            java.lang.String r6 = "mp4"
            r4 = 2131820563(0x7f110013, float:1.9273844E38)
            r2 = r45
            X.12W r5 = r2.A02     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x03a2, all -> 0x051e }
            X.1XH r2 = r5.A00()     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x03a2, all -> 0x051e }
            java.io.File r40 = r2.A00(r6)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x03a2, all -> 0x051e }
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x03a2, all -> 0x051e }
            r2 = r40
            r7.<init>(r2)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x03a2, all -> 0x051e }
            r2 = r45
            X.0tz r2 = r2.A03     // Catch:{ all -> 0x039d }
            android.content.res.Resources r6 = X.C16980tz.A00(r2)     // Catch:{ all -> 0x039d }
            java.io.InputStream r9 = r6.openRawResource(r4)     // Catch:{ all -> 0x039d }
            r10 = 8192(0x2000, float:1.14794E-41)
            byte[] r8 = new byte[r10]     // Catch:{ all -> 0x0396 }
            r6 = 0
            int r4 = r9.read(r8, r6, r10)     // Catch:{ all -> 0x0396 }
        L_0x009c:
            if (r4 < 0) goto L_0x00a6
            r7.write(r8, r6, r4)     // Catch:{ all -> 0x0396 }
            int r4 = r9.read(r8, r6, r10)     // Catch:{ all -> 0x0396 }
            goto L_0x009c
        L_0x00a6:
            r9.close()     // Catch:{ all -> 0x039d }
            r7.close()     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x03a2, all -> 0x051e }
            boolean r4 = r40.exists()     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0394 }
            if (r4 != 0) goto L_0x00c5
            java.lang.String r2 = "transcoderCompliance/test files not found"
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x00c0, all -> 0x051c }
            r2 = 3
            X.4aP r3 = new X.4aP     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x00c0, all -> 0x051c }
            r3.<init>(r1, r2)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x00c0, all -> 0x051c }
            goto L_0x015f
        L_0x00c0:
            r2 = move-exception
            r39 = r1
            goto L_0x03a7
        L_0x00c5:
            X.1xA r6 = new X.1xA     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0394 }
            r4 = r40
            r6.<init>(r4)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0394 }
            int r7 = r6.A03     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0394 }
            int r6 = r6.A01     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0394 }
            int r25 = X.AnonymousClass1QT.A01(r13)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0394 }
            java.lang.String r24 = r13.getName()     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0394 }
            java.lang.String r8 = r13.getName()     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0394 }
            java.lang.String r4 = "OMX.qcom.video.encoder.avc"
            boolean r4 = r8.equals(r4)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0394 }
            r28 = 16
            if (r4 == 0) goto L_0x00e8
            r28 = 32
        L_0x00e8:
            r29 = 0
            r30 = 0
            r23 = r0
            r26 = r7
            r27 = r6
            X.4aT r38 = X.C43291zl.A03(r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0394 }
            r4 = r38
            int r6 = r4.A00     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0394 }
            r4 = 39
            if (r6 == r4) goto L_0x0113
            r4 = 2130706688(0x7f000100, float:1.7014638E38)
            if (r6 == r4) goto L_0x0110
            switch(r6) {
                case 19: goto L_0x010d;
                case 20: goto L_0x010a;
                case 21: goto L_0x0107;
                default: goto L_0x0106;
            }     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0394 }
        L_0x0106:
            goto L_0x0116
        L_0x0107:
            java.lang.String r9 = "COLOR_FormatYUV420SemiPlanar"
            goto L_0x011c
        L_0x010a:
            java.lang.String r9 = "COLOR_FormatYUV420PackedPlanar"
            goto L_0x011c
        L_0x010d:
            java.lang.String r9 = "COLOR_FormatYUV420Planar"
            goto L_0x011c
        L_0x0110:
            java.lang.String r9 = "COLOR_TI_FormatYUV420PackedSemiPlanar"
            goto L_0x011c
        L_0x0113:
            java.lang.String r9 = "COLOR_FormatYUV420PackedSemiPlanar"
            goto L_0x011c
        L_0x0116:
            java.lang.String r4 = "COLOR_NOT_FOUND_id="
            java.lang.String r9 = X.C13680ns.A0c(r6, r4)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0394 }
        L_0x011c:
            X.1XH r5 = r5.A00()     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0394 }
            java.lang.String r4 = ""
            java.io.File r39 = r5.A00(r4)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0394 }
            r4 = r45
            X.0so r4 = r4.A00     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r32 = 0
            r34 = -1
            r30 = 640(0x280, float:8.97E-43)
            r31 = 5000000(0x4c4b40, float:7.006492E-39)
            X.1zl r37 = new X.1zl     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r23 = r37
            r24 = r4
            r25 = r2
            r26 = r44
            r27 = r3
            r28 = r40
            r29 = r39
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r34)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r2 = r37
            r2.A03 = r0     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r37.A0A()     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            boolean r2 = r39.exists()     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            if (r2 != 0) goto L_0x0165
            java.lang.String r2 = "transcoderCompliance/transcoded h264 missing"
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392, 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392, 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392, 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392, 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392, all -> 0x051c }
            r2 = 3
            X.4aP r3 = new X.4aP     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392, 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392, 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392, 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392, 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392, all -> 0x051c }
            r3.<init>(r1, r2)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392, 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392, 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392, 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392, 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392, all -> 0x051c }
        L_0x015f:
            X.C13690nt.A1K(r40)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
        L_0x0162:
            r12 = r3
            goto L_0x03bb
        L_0x0165:
            X.1wq r2 = new X.1wq     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r2.<init>()     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            java.lang.String r1 = r39.getAbsolutePath()     // Catch:{ all -> 0x038d }
            r2.setDataSource(r1)     // Catch:{ all -> 0x038d }
            android.graphics.Bitmap r36 = r2.getFrameAtTime()     // Catch:{ all -> 0x038d }
            r2.close()     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r36.getHeight()     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r36.getWidth()     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r35 = -1
            r1 = r37
            X.4aT r1 = r1.A05     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r42 = r1
            r34 = 0
            r33 = 0
            r10 = 0
            r32 = 0
            r31 = 0
            r30 = 0
        L_0x0191:
            float[] r1 = A07     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r2 = r1[r10]     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            int r1 = r36.getWidth()     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            float r1 = (float) r1     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            float r2 = r2 * r1
            int r3 = (int) r2     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            float[] r1 = A08     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r2 = r1[r10]     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            int r1 = r36.getHeight()     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            float r1 = (float) r1     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            float r2 = r2 * r1
            int r2 = (int) r2     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r1 = r36
            int r29 = r1.getPixel(r3, r2)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            int[] r28 = A09     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r4 = r28[r10]     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r1 = r29
            int r4 = A00(r4, r1)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r1 = r34
            if (r4 <= r1) goto L_0x01bd
            r34 = r4
        L_0x01bd:
            int[] r27 = A0A     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r4 = r27[r10]     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r1 = r29
            int r4 = A00(r4, r1)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r1 = r33
            if (r4 <= r1) goto L_0x01cd
            r33 = r4
        L_0x01cd:
            r1 = r37
            byte[] r7 = r1.A0A     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            if (r7 == 0) goto L_0x02dc
            r1 = r42
            int r5 = r1.A05     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            int r13 = r1.A08     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            int r4 = r1.A07     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            int r6 = r1.A02     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            int r1 = r1.A04     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            int r8 = r13 * r4
            int r6 = r6 + r3
            r4 = 2
            int r6 = r6 / r4
            int r6 = r6 << 1
            int r1 = r1 + r2
            int r1 = r1 / r4
            int r3 = r1 << 1
            int r14 = r3 * r13
            int r14 = r14 + r6
            r1 = 3
            r25 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            if (r5 == r11) goto L_0x0215
            if (r5 == r4) goto L_0x0215
            r16 = 4
            if (r5 == r1) goto L_0x01fc
            r1 = r16
            if (r5 != r1) goto L_0x02ff
        L_0x01fc:
            double r3 = (double) r3     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            double r3 = r3 * r25
            double r1 = (double) r13     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            double r3 = r3 * r1
            double r1 = (double) r6     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            double r1 = r1 * r25
            int r6 = (int) r1     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            int r1 = r6 << 1
            double r1 = (double) r1     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            double r3 = r3 + r1
            int r6 = (int) r3     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            int r6 = r6 + r8
            int r3 = r6 + 1
            r2 = r3
            r1 = r16
            if (r5 != r1) goto L_0x0235
            r2 = r6
            r6 = r3
            goto L_0x0235
        L_0x0215:
            double r1 = (double) r8     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r23 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r1 = r1 * r23
            int r4 = (int) r1     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            int r16 = r4 + r8
            double r3 = (double) r3     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            double r3 = r3 * r23
            double r1 = (double) r13     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            double r3 = r3 * r1
            double r1 = (double) r6     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            double r1 = r1 * r25
            double r3 = r3 + r1
            r1 = r16
            if (r5 != r11) goto L_0x022b
            r1 = r8
        L_0x022b:
            double r1 = (double) r1     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            double r1 = r1 + r3
            int r6 = (int) r1     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            if (r5 != r11) goto L_0x0232
            r8 = r16
        L_0x0232:
            double r1 = (double) r8     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            double r3 = r3 + r1
            int r2 = (int) r3     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
        L_0x0235:
            int r1 = r7.length     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            if (r14 >= r1) goto L_0x02ff
            if (r6 >= r1) goto L_0x02ff
            if (r2 >= r1) goto L_0x02ff
            byte r1 = r7[r14]     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            byte r4 = r7[r6]     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            byte r3 = r7[r2]     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            if (r1 >= 0) goto L_0x0246
            int r1 = r1 + 256
        L_0x0246:
            if (r4 >= 0) goto L_0x024a
            int r4 = r4 + 256
        L_0x024a:
            if (r3 >= 0) goto L_0x024e
            int r3 = r3 + 256
        L_0x024e:
            double r7 = (double) r1     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r1 = 4609017635648170885(0x3ff6851eb851eb85, double:1.4075)
            int r3 = r3 + -128
            double r5 = (double) r3     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            double r1 = r1 * r5
            double r1 = r1 + r7
            int r13 = (int) r1     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r16 = 4599895594602931945(0x3fd61cac083126e9, double:0.3455)
            int r1 = r4 + -128
            double r3 = (double) r1     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            double r16 = r16 * r3
            double r1 = r7 - r16
            r16 = 4604632480691000233(0x3fe6f0d844d013a9, double:0.7169)
            double r5 = r5 * r16
            double r1 = r1 - r5
            int r5 = (int) r1     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r1 = 4610690722909739024(0x3ffc76c8b4395810, double:1.779)
            double r3 = r3 * r1
            double r7 = r7 + r3
            int r2 = (int) r7     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r1 = 3
            int[] r4 = new int[r1]     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r1 = 0
            r4[r1] = r13     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r4[r11] = r5     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r1 = 2
            r4[r1] = r2     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r5 = r28[r10]     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            int r2 = android.graphics.Color.red(r5)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r1 = 0
            r1 = r4[r1]     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            int r3 = X.AnonymousClass000.A09(r2, r1)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            int r2 = android.graphics.Color.green(r5)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r1 = r4[r11]     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            int r1 = X.AnonymousClass000.A09(r2, r1)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            int r3 = java.lang.Math.max(r3, r1)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            int r2 = android.graphics.Color.blue(r5)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r1 = 2
            r1 = r4[r1]     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            int r2 = r2 - r1
            int r2 = java.lang.Math.max(r3, r2)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r1 = r32
            if (r2 <= r1) goto L_0x02af
            r32 = r2
        L_0x02af:
            r5 = r27[r10]     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            int r2 = android.graphics.Color.red(r5)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r1 = 0
            r1 = r4[r1]     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            int r3 = X.AnonymousClass000.A09(r2, r1)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            int r2 = android.graphics.Color.green(r5)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r1 = r4[r11]     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            int r1 = X.AnonymousClass000.A09(r2, r1)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            int r3 = java.lang.Math.max(r3, r1)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            int r2 = android.graphics.Color.blue(r5)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r1 = 2
            r1 = r4[r1]     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            int r2 = r2 - r1
            int r2 = java.lang.Math.max(r3, r2)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r1 = r32
            if (r2 <= r1) goto L_0x02dc
            r30 = r2
        L_0x02dc:
            int r1 = r10 % 2
            if (r1 != r11) goto L_0x02ee
            r2 = r29
            r1 = r35
            int r2 = A00(r2, r1)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r1 = 24
            if (r2 <= r1) goto L_0x02ee
            r31 = 1
        L_0x02ee:
            r1 = r28[r10]     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            A02(r1)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            A02(r29)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            int r10 = r10 + 1
            r35 = r29
            r1 = 8
            if (r10 < r1) goto L_0x0191
            goto L_0x0309
        L_0x02ff:
            r2 = 0
            X.4aP r5 = new X.4aP     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r1 = r39
            r5.<init>(r1, r2)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            goto L_0x03b7
        L_0x0309:
            java.lang.String r4 = ", color="
            r2 = 46
            r1 = r32
            if (r1 <= r2) goto L_0x034a
            r1 = r30
            if (r1 >= r2) goto L_0x032a
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            java.lang.String r2 = "transcoderCompliance/decoder/invert matches, codec="
            r1 = r41
            X.C13680ns.A1Y(r2, r1, r4, r3)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            java.lang.String r1 = X.AnonymousClass000.A0h(r9, r3)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r4 = 4
            goto L_0x033e
        L_0x032a:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            java.lang.String r2 = "transcoderCompliance/decoder/colors differs too much, codec="
            r1 = r41
            X.C13680ns.A1Y(r2, r1, r4, r3)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            java.lang.String r1 = X.AnonymousClass000.A0h(r9, r3)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r4 = 5
        L_0x033e:
            X.4aP r5 = new X.4aP     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r3 = r38
            r2 = r42
            r1 = r39
            r5.<init>(r3, r2, r1, r4)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            goto L_0x03b7
        L_0x034a:
            r1 = r34
            if (r1 > r2) goto L_0x0352
            if (r31 != 0) goto L_0x0352
            r4 = 0
            goto L_0x0381
        L_0x0352:
            r1 = r33
            if (r1 >= r2) goto L_0x036d
            if (r31 != 0) goto L_0x036d
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            java.lang.String r2 = "transcoderCompliance/colors invert matches, codec="
            r1 = r41
            X.C13680ns.A1Y(r2, r1, r4, r3)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            java.lang.String r1 = X.AnonymousClass000.A0h(r9, r3)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r4 = 1
            goto L_0x0381
        L_0x036d:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            java.lang.String r2 = "transcoderCompliance/colors differ too much, codec="
            r1 = r41
            X.C13680ns.A1Y(r2, r1, r4, r3)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            java.lang.String r1 = X.AnonymousClass000.A0h(r9, r3)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r4 = 2
        L_0x0381:
            X.4aP r5 = new X.4aP     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            r3 = r38
            r2 = r42
            r1 = r39
            r5.<init>(r3, r2, r1, r4)     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
            goto L_0x03b7
        L_0x038d:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0391 }
        L_0x0391:
            throw r1     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x0392 }
        L_0x0392:
            r2 = move-exception
            goto L_0x03a7
        L_0x0394:
            r2 = move-exception
            goto L_0x03a5
        L_0x0396:
            r1 = move-exception
            if (r9 == 0) goto L_0x039c
            r9.close()     // Catch:{ all -> 0x039c }
        L_0x039c:
            throw r1     // Catch:{ all -> 0x039d }
        L_0x039d:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x03a1 }
        L_0x03a1:
            throw r1     // Catch:{ 1xB | 20O | IOException | ArrayIndexOutOfBoundsException | IllegalStateException -> 0x03a2, all -> 0x051e }
        L_0x03a2:
            r2 = move-exception
            r40 = 0
        L_0x03a5:
            r39 = 0
        L_0x03a7:
            java.lang.String r1 = "transcoderCompliance/fail"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x056d }
            r2 = 3
            X.4aP r5 = new X.4aP     // Catch:{ all -> 0x056d }
            r1 = r39
            r5.<init>(r1, r2)     // Catch:{ all -> 0x056d }
            if (r40 == 0) goto L_0x03ba
        L_0x03b7:
            X.C13690nt.A1K(r40)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
        L_0x03ba:
            r12 = r5
        L_0x03bb:
            java.lang.String r6 = r12.A06     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            if (r6 == 0) goto L_0x0520
            int r5 = r12.A00     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            if (r5 <= 0) goto L_0x0520
            int r8 = r12.A02     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            if (r8 <= 0) goto L_0x0520
            java.lang.String r4 = r12.A07     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            if (r4 == 0) goto L_0x0520
            int r3 = r12.A01     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            if (r3 <= 0) goto L_0x0520
            int r7 = r12.A03     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            if (r7 <= 0) goto L_0x0520
            r1 = r22
            X.C13690nt.A1O(r1, r7)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            r1 = r21
            X.C13690nt.A1O(r1, r8)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            int r2 = r12.A04     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            if (r2 == 0) goto L_0x04e6
            if (r2 == r11) goto L_0x049b
            r1 = 2
            if (r2 == r1) goto L_0x046b
            r1 = 3
            if (r2 == r1) goto L_0x04e6
            r1 = 4
            if (r2 == r1) goto L_0x041f
            r1 = r21
            java.lang.Integer r3 = A01(r1, r8)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            if (r3 != 0) goto L_0x03f7
            r20 = 1
            goto L_0x0417
        L_0x03f7:
            r1 = r22
            r1.add(r3)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            int r29 = r3.intValue()     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            java.lang.String r4 = r0.A05     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            int r3 = r0.A01     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            int r1 = r0.A03     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            X.4aF r0 = new X.4aF     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            r23 = r0
            r24 = r4
            r25 = r6
            r26 = r3
            r27 = r5
            r28 = r1
            r23.<init>(r24, r25, r26, r27, r28, r29)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
        L_0x0417:
            java.lang.String r1 = "transcoderCompliance/attempt/change_decoder"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            goto L_0x04e8
        L_0x041f:
            if (r15 == 0) goto L_0x0426
            int r1 = r15.A04     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            if (r2 != r1) goto L_0x0426
            goto L_0x0468
        L_0x0426:
            r3 = 2
            r1 = 1
            if (r8 == r11) goto L_0x0435
            if (r8 == r3) goto L_0x0433
            r3 = 4
            r1 = 3
            if (r8 == r1) goto L_0x0435
            if (r8 == r3) goto L_0x0433
            goto L_0x0436
        L_0x0433:
            r8 = r1
            goto L_0x0436
        L_0x0435:
            r8 = r3
        L_0x0436:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            r1 = r21
            boolean r1 = r1.contains(r3)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            if (r1 != 0) goto L_0x0468
            r1 = r22
            r1.add(r3)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            java.lang.String r4 = r0.A05     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            int r3 = r0.A01     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            int r1 = r0.A03     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            X.4aF r0 = new X.4aF     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            r23 = r0
            r24 = r4
            r25 = r6
            r26 = r3
            r27 = r5
            r28 = r1
            r29 = r8
            r23.<init>(r24, r25, r26, r27, r28, r29)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
        L_0x0460:
            java.lang.String r1 = "transcoderCompliance/attempt/invert_decoder"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            goto L_0x04e8
        L_0x0468:
            r20 = 1
            goto L_0x0460
        L_0x046b:
            r1 = r22
            java.lang.Integer r5 = A01(r1, r7)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            if (r5 != 0) goto L_0x0476
            r20 = 1
            goto L_0x0494
        L_0x0476:
            r1.add(r5)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            int r28 = r5.intValue()     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            java.lang.String r6 = r0.A04     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            int r5 = r0.A00     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            int r1 = r0.A02     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            X.4aF r0 = new X.4aF     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            r23 = r0
            r24 = r4
            r25 = r6
            r26 = r3
            r27 = r5
            r29 = r1
            r23.<init>(r24, r25, r26, r27, r28, r29)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
        L_0x0494:
            java.lang.String r1 = "transcoderCompliance/attempt/change_encoder"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            goto L_0x04e8
        L_0x049b:
            if (r15 == 0) goto L_0x04a2
            int r1 = r15.A04     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            if (r2 != r1) goto L_0x04a2
            goto L_0x04e3
        L_0x04a2:
            r5 = 2
            r1 = 1
            if (r7 == r11) goto L_0x04b1
            if (r7 == r5) goto L_0x04af
            r5 = 4
            r1 = 3
            if (r7 == r1) goto L_0x04b1
            if (r7 == r5) goto L_0x04af
            goto L_0x04b2
        L_0x04af:
            r7 = r1
            goto L_0x04b2
        L_0x04b1:
            r7 = r5
        L_0x04b2:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r7)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            r1 = r22
            boolean r1 = r1.contains(r5)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            if (r1 != 0) goto L_0x04e3
            r1 = r22
            r1.add(r5)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            java.lang.String r6 = r0.A04     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            int r5 = r0.A00     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            int r1 = r0.A02     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            X.4aF r0 = new X.4aF     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            r23 = r0
            r24 = r4
            r25 = r6
            r26 = r3
            r27 = r5
            r28 = r7
            r29 = r1
            r23.<init>(r24, r25, r26, r27, r28, r29)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
        L_0x04dc:
            java.lang.String r1 = "transcoderCompliance/attempt/invert_encoder"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            goto L_0x04e8
        L_0x04e3:
            r20 = 1
            goto L_0x04dc
        L_0x04e6:
            r20 = 1
        L_0x04e8:
            if (r15 == 0) goto L_0x0517
            int r1 = r15.A04     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            if (r2 == r1) goto L_0x0517
            int r2 = r15.A04     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            if (r2 == r11) goto L_0x0504
            r1 = 2
            if (r2 == r1) goto L_0x0501
            r1 = 4
            if (r2 == r1) goto L_0x04fe
            r1 = 5
            if (r2 != r1) goto L_0x0517
            java.lang.String r3 = "change-decoder"
            goto L_0x0506
        L_0x04fe:
            java.lang.String r3 = "invert-decoder"
            goto L_0x0506
        L_0x0501:
            java.lang.String r3 = "change-encoder"
            goto L_0x0506
        L_0x0504:
            java.lang.String r3 = "invert-encoder"
        L_0x0506:
            if (r19 != 0) goto L_0x050d
            java.lang.StringBuilder r19 = X.AnonymousClass000.A0r(r3)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            goto L_0x0517
        L_0x050d:
            java.lang.String r2 = ", "
            r1 = r19
            r1.append(r2)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            r1.append(r3)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
        L_0x0517:
            if (r20 != 0) goto L_0x0526
            r15 = r12
            goto L_0x0048
        L_0x051c:
            r0 = move-exception
            goto L_0x0570
        L_0x051e:
            r0 = move-exception
            goto L_0x0573
        L_0x0520:
            java.lang.String r1 = "transcoderCompliance/no encoder/decoder data, early exit"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
        L_0x0526:
            int r1 = r12.A04     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            if (r1 != 0) goto L_0x0586
            int r4 = r0.A02     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            if (r4 > 0) goto L_0x0532
            int r1 = r0.A03     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            if (r1 <= 0) goto L_0x0586
        L_0x0532:
            org.json.JSONObject r3 = X.C13700nu.A0J()     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            java.lang.String r2 = r0.A05     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            java.lang.String r1 = "media_codec_encoder"
            r3.put(r1, r2)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            java.lang.String r2 = r0.A04     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            java.lang.String r1 = "media_codec_decoder"
            r3.put(r1, r2)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            int r2 = r0.A01     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            java.lang.String r1 = "color_format_encoder"
            r3.put(r1, r2)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            int r2 = r0.A00     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            java.lang.String r1 = "color_format_decoder"
            r3.put(r1, r2)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            int r1 = r0.A03     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            java.lang.String r0 = "forced_frame_conv_id_encoder"
            r3.put(r0, r1)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            java.lang.String r0 = "forced_frame_conv_id_decoder"
            r3.put(r0, r4)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            java.lang.String r2 = r3.toString()     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            android.content.SharedPreferences$Editor r1 = r43.A0K()     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            java.lang.String r0 = "video_transcode_saved_local_config"
            X.C13680ns.A0y(r1, r0, r2)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
            goto L_0x0586
        L_0x056d:
            r0 = move-exception
            if (r40 == 0) goto L_0x0573
        L_0x0570:
            X.C13690nt.A1K(r40)     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
        L_0x0573:
            throw r0     // Catch:{ UnsupportedEncodingException | JSONException -> 0x0574 }
        L_0x0574:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0579 }
            goto L_0x0584
        L_0x0579:
            r1 = move-exception
            if (r12 == 0) goto L_0x0583
            java.io.File r0 = r12.A05
            if (r0 == 0) goto L_0x0583
            X.C13690nt.A1K(r0)
        L_0x0583:
            throw r1
        L_0x0584:
            if (r12 == 0) goto L_0x058d
        L_0x0586:
            java.io.File r0 = r12.A05
            if (r0 == 0) goto L_0x058d
            X.C13690nt.A1K(r0)
        L_0x058d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62073Bn.A03():void");
    }
}
