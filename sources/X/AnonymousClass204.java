package X;

import android.os.PowerManager;

/* renamed from: X.204  reason: invalid class name */
public class AnonymousClass204 extends C43411zx {
    public final PowerManager.WakeLock A00;
    public final C16300so A01;
    public final AnonymousClass01V A02;
    public final C14730pf A03;
    public final C16480t8 A04;
    public final C14710pd A05;
    public final AnonymousClass203 A06;
    public final AnonymousClass1QO A07;
    public final AnonymousClass18C A08;
    public final AnonymousClass1A9 A09;

    public AnonymousClass204(PowerManager.WakeLock wakeLock, C16300so r2, AnonymousClass01V r3, C14730pf r4, C16480t8 r5, C14710pd r6, AnonymousClass203 r7, AnonymousClass1QO r8, AnonymousClass18C r9, AnonymousClass1A9 r10) {
        super(r7);
        this.A05 = r6;
        this.A01 = r2;
        this.A03 = r4;
        this.A09 = r10;
        this.A02 = r3;
        this.A08 = r9;
        this.A07 = r8;
        this.A06 = r7;
        this.A00 = wakeLock;
        this.A04 = r5;
    }

    public static boolean A00(int i2) {
        return i2 == 192 || i2 == 193 || i2 == 195 || i2 == 197 || i2 == 199 || i2 == 200 || i2 == 201 || i2 == 203 || i2 == 205 || i2 == 207;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:278|(4:279|280|281|(2:285|(3:287|(3:(4:290|(2:292|(1:(1:295)(2:341|454))(1:(1:(2:298|(3:300|(1:302)|337)(1:(2:307|(2:331|456)(4:315|(3:317|(1:319)|329)(1:(2:321|(2:323|(1:328))))|330|455))(2:453|306))))))(1:(1:457))|333|458)(2:334|(1:336)(0))|338|459)(1:(2:340|460)(0))|342)(0))(0))|343|344|(1:346)(1:347)) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0087, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        com.whatsapp.util.Log.e("ProcessImageTask/errorComputingHash", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x06e5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:?, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0706, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:?, code lost:
        r1 = new java.lang.StringBuilder("imageprocessor/prepareimageforsend/securityexception");
        r1.append(r2.getMessage());
        com.whatsapp.util.Log.e(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x071c, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x071d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:?, code lost:
        r5.A02 = false;
        com.whatsapp.util.Log.e("mediatranscodequeue/image/security ", r1);
        r35.A0O = "permissions-error";
        r1 = com.obwhatsapp.R.string.str0de4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0730, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:?, code lost:
        r5.A02 = false;
        com.whatsapp.util.Log.e("mediatranscodequeue/image/oom/ ", r1);
        r35.A0O = "oom";
        r1 = com.obwhatsapp.R.string.str0855;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0742, code lost:
        r37.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x0748, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:?, code lost:
        r5.A02 = false;
        com.whatsapp.util.Log.e("mediatranscodequeue/image/io/ ", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0755, code lost:
        if (r2.getMessage() != null) goto L_0x0757;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0757, code lost:
        r0 = r2.getMessage().contains("No space");
        r1 = com.obwhatsapp.R.string.str0852;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:385:0x0764, code lost:
        if (r0 == false) goto L_0x0766;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x0766, code lost:
        r1 = com.obwhatsapp.R.string.str0840;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x0769, code lost:
        r37.A00(r1);
        r1 = new java.lang.StringBuilder();
        r1.append("IOError: ");
        r1.append(r2);
        r1 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0780, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:?, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/image/not-a-image/ ", r1);
        r5.A02 = false;
        r1 = "NotAImageException";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x078b, code lost:
        r35.A0O = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:0x078f, code lost:
        r21 = r38.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:0x07ed, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x07ee, code lost:
        r1 = r38.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x07fa, code lost:
        r1.release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x07fd, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0233, code lost:
        if (r16 == false) goto L_0x024b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0235, code lost:
        r13[0] = -1;
        r13[1] = r14[0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0243, code lost:
        if (X.C43041zF.A04(X.AnonymousClass3BZ.A05, r14[0]) == false) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0245, code lost:
        r6.write(r13);
        r11 = r11 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x024b, code lost:
        r6.write(r14);
        r11 = r11 + 1;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:146:0x037c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:151:0x0381 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:173:0x03c9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:197:0x0465 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:343:0x062c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:353:0x06e9 */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x0431 A[Catch:{ all -> 0x06e5, all -> 0x06e9, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }] */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x0499 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:287:0x05a2 A[Catch:{ IOException -> 0x062c }] */
    /* JADX WARNING: Removed duplicated region for block: B:346:0x0632 A[Catch:{ all -> 0x06e5, all -> 0x06e9, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }] */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x06af A[Catch:{ all -> 0x06e5, all -> 0x06e9, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }] */
    /* JADX WARNING: Removed duplicated region for block: B:365:0x0706 A[ExcHandler: SecurityException (r2v3 'e' java.lang.SecurityException A[CUSTOM_DECLARE]), Splitter:B:39:0x0109] */
    /* JADX WARNING: Removed duplicated region for block: B:370:0x071d A[ExcHandler: SecurityException (r1v22 'e' java.lang.SecurityException A[CUSTOM_DECLARE]), Splitter:B:33:0x00d2] */
    /* JADX WARNING: Removed duplicated region for block: B:374:0x0730 A[ExcHandler: OutOfMemoryError (r1v19 'e' java.lang.OutOfMemoryError A[CUSTOM_DECLARE]), Splitter:B:33:0x00d2] */
    /* JADX WARNING: Removed duplicated region for block: B:379:0x0748 A[ExcHandler: IOException (r2v1 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:1:0x0037] */
    /* JADX WARNING: Removed duplicated region for block: B:388:0x0780 A[ExcHandler: 20M (r1v10 'e' X.20M A[CUSTOM_DECLARE]), Splitter:B:1:0x0037] */
    /* JADX WARNING: Removed duplicated region for block: B:401:0x07a8  */
    /* JADX WARNING: Removed duplicated region for block: B:410:0x07e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass21C A01() {
        /*
            r39 = this;
            X.3uf r5 = new X.3uf
            r5.<init>()
            r38 = r39
            r0 = r38
            X.203 r0 = r0.A06
            r37 = r0
            X.211 r0 = r0.A01
            r36 = r0
            r4 = 1
            X.212 r0 = r0.A03
            r35 = r0
            long r0 = (long) r4
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = r35
            r0.A0N = r1
            long r1 = android.os.SystemClock.uptimeMillis()
            r0 = r36
            r0.A00 = r1
            r0 = r37
            boolean r0 = r0.A02
            r27 = r0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r27)
            r0 = r35
            r0.A01 = r1
            r0 = r38
            android.os.PowerManager$WakeLock r0 = r0.A00     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            r21 = r0
            if (r0 == 0) goto L_0x0040
            r21.acquire()     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
        L_0x0040:
            r0 = r37
            java.lang.String r0 = r0.A01     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            android.net.Uri r3 = android.net.Uri.parse(r0)     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            java.lang.String r0 = r3.getPath()     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            java.io.File r7 = new java.io.File     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            r7.<init>(r0)     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            long r11 = r7.length()     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            java.lang.Long r1 = java.lang.Long.valueOf(r11)     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            r0 = r35
            r0.A0J = r1     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            X.0ta r2 = new X.0ta     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            r2.<init>()     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            r0 = r37
            java.io.File r0 = r0.A06     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            r34 = r0
            java.lang.String r0 = "rotation"
            java.lang.String r6 = r3.getQueryParameter(r0)     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            java.lang.String r0 = "flip-v"
            java.lang.String r1 = r3.getQueryParameter(r0)     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            java.lang.String r0 = "flip-h"
            java.lang.String r0 = r3.getQueryParameter(r0)     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            if (r6 != 0) goto L_0x00d4
            if (r1 != 0) goto L_0x00d4
            if (r0 != 0) goto L_0x00d4
            r8 = 0
            java.lang.String r8 = X.C37981q3.A00(r7)     // Catch:{ IOException -> 0x0087, 20M -> 0x0780, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            goto L_0x008d
        L_0x0087:
            r1 = move-exception
            java.lang.String r0 = "ProcessImageTask/errorComputingHash"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
        L_0x008d:
            r0 = r38
            X.0t8 r7 = r0.A04     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            X.0tY r6 = r7.A0A(r8)     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            if (r6 == 0) goto L_0x00a1
            r1 = r0
            r0 = r34
            X.3uk r6 = r1.A02(r5, r6, r0)     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            if (r6 == 0) goto L_0x00a1
            goto L_0x00c5
        L_0x00a1:
            if (r8 == 0) goto L_0x00d2
            java.util.Collection r0 = r7.A0E(r8, r4)     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
        L_0x00ab:
            boolean r0 = r7.hasNext()     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            if (r0 == 0) goto L_0x00d2
            java.lang.Object r6 = r7.next()     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            X.0tY r6 = (X.C16730tY) r6     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            boolean r0 = r6 instanceof X.C38681rF     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            if (r0 == 0) goto L_0x00ab
            r1 = r38
            r0 = r34
            X.3uk r6 = r1.A02(r5, r6, r0)     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            if (r6 == 0) goto L_0x00ab
        L_0x00c5:
            if (r21 == 0) goto L_0x07a4
            boolean r0 = r21.isHeld()
            if (r0 == 0) goto L_0x07a4
            r21.release()
            goto L_0x07a4
        L_0x00d2:
            r5.A01 = r8     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
        L_0x00d4:
            r0 = r37
            X.1XN r0 = r0.A00     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            r33 = r0
            r0 = r38
            X.0pd r10 = r0.A05     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            X.0pf r0 = r0.A03     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            r32 = r0
            r0 = r38
            X.1A9 r0 = r0.A09     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            r31 = r0
            r0 = r38
            X.01V r6 = r0.A02     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            r0 = r37
            boolean r0 = r0.A03     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            r26 = r0
            r7 = 0
            r0 = r33
            int r0 = r0.A00     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            r30 = r0
            long r0 = (long) r0     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            r0 = r35
            r0.A0C = r1     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            if (r27 == 0) goto L_0x0107
            X.4IC r25 = X.AnonymousClass3BZ.A01     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            goto L_0x0109
        L_0x0107:
            X.4IC r25 = X.AnonymousClass3BZ.A00     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
        L_0x0109:
            java.io.File r0 = r34.getParentFile()     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            if (r0 == 0) goto L_0x0112
            r0.mkdirs()     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
        L_0x0112:
            android.content.ContentResolver r0 = r6.A0C()     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            android.graphics.Matrix r24 = X.C17970vw.A09(r0, r3)     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            r1 = r31
            r0 = r30
            android.graphics.BitmapFactory$Options r23 = r1.A0Y(r3, r0, r4, r4)     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            r0 = r23
            int r0 = r0.outWidth     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            r29 = r0
            r0 = r23
            int r0 = r0.outHeight     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            r28 = r0
            r0 = r29
            long r8 = (long) r0     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            r0 = r28
            long r0 = (long) r0     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            r6 = r35
            r6.A0K = r8     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            r6.A0I = r1     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            r22 = 1
            if (r24 != 0) goto L_0x0382
            r0 = r33
            int r1 = r0.A01     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            r0 = r29
            if (r0 > r1) goto L_0x0152
            r0 = r28
            if (r0 <= r1) goto L_0x015f
        L_0x0152:
            r8 = 0
            int r0 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x0382
            r8 = 200000(0x30d40, double:9.8813E-319)
            int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0382
        L_0x015f:
            r0 = r31
            java.io.InputStream r1 = r0.A0b(r3, r4)     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            r0.<init>(r1)     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            java.io.DataInputStream r8 = new java.io.DataInputStream     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            r8.<init>(r0)     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x037d }
            r0 = r34
            r1.<init>(r0)     // Catch:{ all -> 0x037d }
            r0 = 8192(0x2000, float:1.14794E-41)
            java.io.BufferedOutputStream r6 = new java.io.BufferedOutputStream     // Catch:{ all -> 0x037d }
            r6.<init>(r1, r0)     // Catch:{ all -> 0x037d }
            r1 = 1577(0x629, float:2.21E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x0378 }
            int r0 = r10.A03(r0, r1)     // Catch:{ all -> 0x0378 }
            long r0 = (long) r0     // Catch:{ all -> 0x0378 }
            r19 = r0
            r0 = 1024(0x400, double:5.06E-321)
            long r19 = r19 * r0
            r1 = 2
            byte[] r13 = new byte[r1]     // Catch:{ all -> 0x0378 }
            byte[] r12 = new byte[r1]     // Catch:{ all -> 0x0378 }
            r0 = 5
            byte[] r10 = new byte[r0]     // Catch:{ all -> 0x0378 }
            java.lang.String r0 = "imageprocessor/stripmetadata begin stripping metadata"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0378 }
            r9 = -1
            r8.readFully(r13)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            byte[] r1 = new byte[r1]     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            r1[r7] = r9     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            r0 = -40
            r1[r4] = r0     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            boolean r0 = X.AnonymousClass3BZ.A01(r13, r1)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            if (r0 != 0) goto L_0x01b2
            java.lang.String r0 = "imageprocessor/stripmetadata not a jpeg"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            goto L_0x0327
        L_0x01b2:
            r6.write(r13)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            r8.readFully(r13)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            r11 = 4
            r18 = 0
            r17 = 0
        L_0x01bd:
            long r0 = (long) r11     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            int r14 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r14 >= 0) goto L_0x0312
            byte r0 = r13[r7]     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            if (r0 == r9) goto L_0x01e0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            r1.<init>()     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            java.lang.String r0 = "imageprocessor/stripmetadata not a marker"
            r1.append(r0)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            java.lang.String r0 = X.AnonymousClass1ZW.A0D(r13)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            r1.append(r0)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            java.lang.String r0 = r1.toString()     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            goto L_0x0327
        L_0x01e0:
            byte r1 = r13[r4]     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            r0 = -39
            if (r1 != r0) goto L_0x01eb
            r6.write(r13)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            goto L_0x02ff
        L_0x01eb:
            r8.readFully(r12)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            int r11 = r11 + 2
            byte r0 = r12[r7]     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r0 << 8
            byte r0 = r12[r4]     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = r1 | r0
            int r15 = r1 + -2
            if (r15 >= 0) goto L_0x0206
            java.lang.String r0 = "imageprocessor/invalid size bytes on marker"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            goto L_0x0327
        L_0x0206:
            byte r14 = r13[r4]     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            r0 = -38
            if (r14 != r0) goto L_0x0251
            if (r18 != 0) goto L_0x0210
            goto L_0x0306
        L_0x0210:
            r6.write(r13)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            r6.write(r12)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            byte[] r0 = new byte[r15]     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            r8.readFully(r0)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            int r11 = r11 + r15
            r6.write(r0)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            byte[] r14 = new byte[r4]     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
        L_0x0221:
            r16 = 0
        L_0x0223:
            long r0 = (long) r11     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            int r15 = (r0 > r19 ? 1 : (r0 == r19 ? 0 : -1))
            if (r15 >= 0) goto L_0x01bd
            byte r0 = r8.readByte()     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            r14[r7] = r0     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            if (r0 != r9) goto L_0x0233
            r16 = 1
            goto L_0x0223
        L_0x0233:
            if (r16 == 0) goto L_0x024b
            r13[r7] = r9     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            byte r0 = r14[r7]     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            r13[r4] = r0     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            int[] r1 = X.AnonymousClass3BZ.A05     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            byte r0 = r14[r7]     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            boolean r0 = X.C43041zF.A04(r1, r0)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            if (r0 == 0) goto L_0x01bd
            r6.write(r13)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            int r11 = r11 + 2
            goto L_0x0221
        L_0x024b:
            r6.write(r14)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            int r11 = r11 + 1
            goto L_0x0221
        L_0x0251:
            r1 = r14 & -16
            r0 = -32
            if (r1 != r0) goto L_0x02ec
            if (r14 == r0) goto L_0x0291
            r0 = -31
            if (r14 == r0) goto L_0x0263
            r0 = -19
            if (r14 == r0) goto L_0x02e7
            goto L_0x030c
        L_0x0263:
            if (r17 != 0) goto L_0x02e7
            r8.readFully(r10)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            int r11 = r11 + 5
            int r15 = r15 + -5
            byte[] r0 = X.AnonymousClass3BZ.A02     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            boolean r0 = X.AnonymousClass3BZ.A01(r10, r0)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            if (r0 != 0) goto L_0x028e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            r1.<init>()     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            java.lang.String r0 = "imageprocessor/stripmetadata invalid APP1 signature: "
            r1.append(r0)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            java.lang.String r0 = X.AnonymousClass1ZW.A0D(r10)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            r1.append(r0)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            java.lang.String r0 = r1.toString()     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            goto L_0x0327
        L_0x028e:
            r17 = 1
            goto L_0x02e7
        L_0x0291:
            r8.readFully(r10)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            int r11 = r11 + 5
            int r15 = r15 + -5
            byte[] r1 = X.AnonymousClass3BZ.A03     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            boolean r0 = X.AnonymousClass3BZ.A01(r10, r1)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            if (r0 == 0) goto L_0x02c6
            if (r18 != 0) goto L_0x02bb
            r6.write(r9)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            r0 = -32
            r6.write(r0)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            r6.write(r12)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            r6.write(r1)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            byte[] r0 = new byte[r15]     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            r8.readFully(r0)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            r6.write(r0)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            r18 = 1
            goto L_0x02bf
        L_0x02bb:
            X.AnonymousClass3BZ.A00(r8, r15)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            int r11 = r11 + r15
        L_0x02bf:
            r8.readFully(r13)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            int r11 = r11 + 2
            goto L_0x01bd
        L_0x02c6:
            byte[] r0 = X.AnonymousClass3BZ.A04     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            boolean r0 = X.AnonymousClass3BZ.A01(r10, r0)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            if (r0 != 0) goto L_0x02e7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            r1.<init>()     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            java.lang.String r0 = "imageprocessor/stripmetadata invalid APP0 signature: "
            r1.append(r0)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            java.lang.String r0 = X.AnonymousClass1ZW.A0D(r10)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            r1.append(r0)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            java.lang.String r0 = r1.toString()     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            goto L_0x0327
        L_0x02e7:
            X.AnonymousClass3BZ.A00(r8, r15)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            int r11 = r11 + r15
            goto L_0x02fa
        L_0x02ec:
            byte[] r0 = new byte[r15]     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            r8.readFully(r0)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            r6.write(r13)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            r6.write(r12)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            r6.write(r0)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
        L_0x02fa:
            r8.readFully(r13)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            goto L_0x01bd
        L_0x02ff:
            if (r11 == r9) goto L_0x0327
            if (r26 != 0) goto L_0x0362
            if (r11 == 0) goto L_0x0337
            goto L_0x032a
        L_0x0306:
            java.lang.String r0 = "imageprocessor/stripmetadata missing valid application signature before image"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            goto L_0x0327
        L_0x030c:
            java.lang.String r0 = "imageprocessor/stripmetadata invalid APP marker"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            goto L_0x0327
        L_0x0312:
            java.lang.String r0 = "imageprocessor/stripmetadata file too large"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ EOFException -> 0x0321, IOException -> 0x031d, NullPointerException -> 0x0318 }
            goto L_0x0327
        L_0x0318:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x0378 }
            goto L_0x0327
        L_0x031d:
            r1 = move-exception
            java.lang.String r0 = "imageprocessor/stripmetadata IOException"
            goto L_0x0324
        L_0x0321:
            r1 = move-exception
            java.lang.String r0 = "imageprocessor/stripmetadata stream ended unexpectedly"
        L_0x0324:
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0378 }
        L_0x0327:
            java.lang.String r0 = "imageprocessor/prepareimageforsend/stripmetadata unable to strip metadata, file needs reencoding"
            goto L_0x035e
        L_0x032a:
            long r9 = (long) r11     // Catch:{ all -> 0x0378 }
            r0 = r33
            int r0 = r0.A02     // Catch:{ all -> 0x0378 }
            long r0 = (long) r0     // Catch:{ all -> 0x0378 }
            r12 = 1024(0x400, double:5.06E-321)
            long r0 = r0 * r12
            int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r12 <= 0) goto L_0x0362
        L_0x0337:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0378 }
            r1.<init>()     // Catch:{ all -> 0x0378 }
            java.lang.String r0 = "imageprocessor/prepareimageforsend/copy size:"
            r1.append(r0)     // Catch:{ all -> 0x0378 }
            r1.append(r11)     // Catch:{ all -> 0x0378 }
            java.lang.String r0 = " max:"
            r1.append(r0)     // Catch:{ all -> 0x0378 }
            r0 = r33
            int r0 = r0.A02     // Catch:{ all -> 0x0378 }
            r1.append(r0)     // Catch:{ all -> 0x0378 }
            java.lang.String r0 = " recompress:"
            r1.append(r0)     // Catch:{ all -> 0x0378 }
            r0 = r22
            r1.append(r0)     // Catch:{ all -> 0x0378 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0378 }
        L_0x035e:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0378 }
            goto L_0x0365
        L_0x0362:
            r22 = 0
            goto L_0x0337
        L_0x0365:
            r6.close()     // Catch:{ all -> 0x037d }
            r8.close()     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            if (r22 != 0) goto L_0x0382
            r6 = r36
            r1 = r29
            r0 = r28
            r6.A02(r1, r0)     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            goto L_0x0411
        L_0x0378:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x037c }
        L_0x037c:
            throw r0     // Catch:{ all -> 0x037d }
        L_0x037d:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0381 }
        L_0x0381:
            throw r0     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
        L_0x0382:
            r0 = r33
            int r13 = r0.A03     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            long r0 = (long) r13     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            r0 = r35
            r0.A0F = r1     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            r0 = r31
            java.io.InputStream r0 = r0.A0b(r3, r4)     // Catch:{ OutOfMemoryError -> 0x03ca, SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748 }
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch:{ OutOfMemoryError -> 0x03ca, SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748 }
            r8.<init>(r0)     // Catch:{ OutOfMemoryError -> 0x03ca, SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748 }
            byte[] r6 = X.C30311c8.A08(r8)     // Catch:{ all -> 0x03c5 }
            int r1 = r6.length     // Catch:{ all -> 0x03c5 }
            r0 = r23
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeByteArray(r6, r7, r1, r0)     // Catch:{ all -> 0x03c5 }
            if (r7 == 0) goto L_0x03bf
            int r0 = r7.getWidth()     // Catch:{ all -> 0x03c5 }
            if (r0 == 0) goto L_0x03bf
            int r0 = r7.getHeight()     // Catch:{ all -> 0x03c5 }
            if (r0 == 0) goto L_0x03bf
            r6 = r30
            r1 = r24
            android.graphics.Bitmap r11 = X.C17970vw.A07(r7, r1, r6, r6)     // Catch:{ all -> 0x03c5 }
            r8.close()     // Catch:{ OutOfMemoryError -> 0x03ca, SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748 }
            goto L_0x03f5
        L_0x03bf:
            X.20M r0 = new X.20M     // Catch:{ all -> 0x03c5 }
            r0.<init>()     // Catch:{ all -> 0x03c5 }
            throw r0     // Catch:{ all -> 0x03c5 }
        L_0x03c5:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x03c9 }
        L_0x03c9:
            throw r0     // Catch:{ OutOfMemoryError -> 0x03ca, SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748 }
        L_0x03ca:
            r7 = move-exception
            r0 = r23
            int r0 = r0.inSampleSize     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            int r6 = r0 << 1
            r0 = r23
            r0.inSampleSize = r6     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            java.lang.String r1 = "imageprocessor/compressToFile/oom "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            r0.<init>(r1)     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            r0.append(r6)     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            java.lang.String r0 = r0.toString()     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            com.whatsapp.util.Log.i(r0, r7)     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            r11 = r30
            r12 = 1
            r6 = r31
            r7 = r23
            r8 = r24
            r9 = r3
            r10 = r11
            android.graphics.Bitmap r11 = r6.A0V(r7, r8, r9, r10, r11, r12)     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
        L_0x03f5:
            int r6 = r11.getWidth()     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            int r1 = r11.getHeight()     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            r0 = r36
            r0.A02(r6, r1)     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            com.whatsapp.media.transcode.Mozjpeg r10 = X.AnonymousClass20E.A00     // Catch:{ IOException -> 0x06ea }
            java.lang.String r12 = r34.getAbsolutePath()     // Catch:{ IOException -> 0x06ea }
            r14 = 1
            r15 = 0
            r10.A00(r11, r12, r13, r14, r15)     // Catch:{ IOException -> 0x06ea }
            r7 = 1
            r11.recycle()     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
        L_0x0411:
            r0 = r25
            int r1 = r0.A01     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            r0 = r31
            android.graphics.Bitmap r3 = r0.A0W(r3, r1, r1)     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            r0 = r34
            r2.A0F = r0     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            r3.getWidth()     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            r3.getHeight()     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            r0 = r25
            int r8 = r0.A00     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            r0 = r27 ^ 1
            byte[] r6 = X.AnonymousClass20E.A00(r3, r8, r0)     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            if (r6 != 0) goto L_0x043f
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            r1.<init>()     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            r3.compress(r0, r8, r1)     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            byte[] r6 = r1.toByteArray()     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
        L_0x043f:
            int r1 = r3.getHeight()     // Catch:{ Exception | OutOfMemoryError -> 0x0465, 20M -> 0x0780, IOException -> 0x0748, SecurityException -> 0x071d }
            int r0 = r3.getWidth()     // Catch:{ Exception | OutOfMemoryError -> 0x0465, 20M -> 0x0780, IOException -> 0x0748, SecurityException -> 0x071d }
            if (r1 <= r0) goto L_0x0465
            java.io.File r0 = r2.A0F     // Catch:{ Exception | OutOfMemoryError -> 0x0465, 20M -> 0x0780, IOException -> 0x0748, SecurityException -> 0x071d }
            android.util.Pair r1 = X.C42041x8.A00(r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0465, 20M -> 0x0780, IOException -> 0x0748, SecurityException -> 0x071d }
            if (r1 == 0) goto L_0x0465
            java.lang.Object r0 = r1.first     // Catch:{ Exception | OutOfMemoryError -> 0x0465, 20M -> 0x0780, IOException -> 0x0748, SecurityException -> 0x071d }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception | OutOfMemoryError -> 0x0465, 20M -> 0x0780, IOException -> 0x0748, SecurityException -> 0x071d }
            int r0 = r0.intValue()     // Catch:{ Exception | OutOfMemoryError -> 0x0465, 20M -> 0x0780, IOException -> 0x0748, SecurityException -> 0x071d }
            r2.A02 = r0     // Catch:{ Exception | OutOfMemoryError -> 0x0465, 20M -> 0x0780, IOException -> 0x0748, SecurityException -> 0x071d }
            java.lang.Object r0 = r1.second     // Catch:{ Exception | OutOfMemoryError -> 0x0465, 20M -> 0x0780, IOException -> 0x0748, SecurityException -> 0x071d }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception | OutOfMemoryError -> 0x0465, 20M -> 0x0780, IOException -> 0x0748, SecurityException -> 0x071d }
            int r0 = r0.intValue()     // Catch:{ Exception | OutOfMemoryError -> 0x0465, 20M -> 0x0780, IOException -> 0x0748, SecurityException -> 0x071d }
            r2.A03 = r0     // Catch:{ Exception | OutOfMemoryError -> 0x0465, 20M -> 0x0780, IOException -> 0x0748, SecurityException -> 0x071d }
        L_0x0465:
            r3.recycle()     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            r5.A03 = r6     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            java.io.File r0 = r2.A0F     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            X.C17970vw.A0M(r2, r0)     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            int r3 = r2.A08     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            int r1 = r2.A06     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            r0 = r36
            r0.A02(r3, r1)     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            java.io.FileInputStream r0 = X.C17970vw.A0G(r34)     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            r8.<init>(r0)     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            r20 = 0
            r19 = 0
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x06e5 }
            r10.<init>()     // Catch:{ all -> 0x06e5 }
            r18 = 0
            r17 = 0
            r16 = 0
            r13 = 0
            r0 = 0
            r3 = 2
            java.lang.String r12 = "ProcessImageTask/number of scans after compression = "
            r6 = 8
            if (r7 != 0) goto L_0x0591
            if (r26 != 0) goto L_0x0591
            r11 = 10
            r9 = 0
        L_0x049e:
            int r7 = r8.read()     // Catch:{ IOException -> 0x0536 }
            r1 = -1
            if (r7 == r1) goto L_0x0536
            if (r13 >= r11) goto L_0x0536
            int r18 = r18 + 1
            if (r20 != 0) goto L_0x0536
            r15 = 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L_0x052d
            if (r0 == r4) goto L_0x0522
            r14 = 3
            if (r0 == r3) goto L_0x051e
            r1 = 4
            if (r0 == r14) goto L_0x04c4
            if (r0 == r1) goto L_0x0531
            int r14 = r17 << 8
            int r14 = r14 + r7
            int r14 = r14 - r3
            long r0 = (long) r14     // Catch:{ IOException -> 0x0536 }
            X.C30311c8.A06(r8, r0)     // Catch:{ IOException -> 0x0536 }
            int r18 = r18 + r14
            goto L_0x052b
        L_0x04c4:
            if (r7 == r15) goto L_0x0520
            if (r7 == 0) goto L_0x052b
            r1 = 217(0xd9, float:3.04E-43)
            if (r7 != r1) goto L_0x04da
            r20 = 1
            int r0 = r18 + -2
            if (r16 <= 0) goto L_0x0527
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0536 }
            r10.add(r0)     // Catch:{ IOException -> 0x0536 }
            goto L_0x0527
        L_0x04da:
            if (r19 != 0) goto L_0x04e4
            boolean r14 = A00(r7)     // Catch:{ IOException -> 0x0536 }
            if (r14 == 0) goto L_0x04e4
            goto L_0x06ca
        L_0x04e4:
            r14 = 194(0xc2, float:2.72E-43)
            if (r7 == r14) goto L_0x051b
            r14 = 198(0xc6, float:2.77E-43)
            if (r7 == r14) goto L_0x051b
            r14 = 202(0xca, float:2.83E-43)
            if (r7 == r14) goto L_0x051b
            r14 = 206(0xce, float:2.89E-43)
            if (r7 == r14) goto L_0x051b
            r0 = 218(0xda, float:3.05E-43)
            if (r7 != r0) goto L_0x0504
            int r0 = r18 - r3
            if (r16 <= 0) goto L_0x0515
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0536 }
            r10.add(r0)     // Catch:{ IOException -> 0x0536 }
            goto L_0x0515
        L_0x0504:
            if (r7 == r4) goto L_0x052b
            r0 = 208(0xd0, float:2.91E-43)
            if (r7 < r0) goto L_0x0519
            r0 = 215(0xd7, float:3.01E-43)
            if (r7 <= r0) goto L_0x052b
            if (r7 == r1) goto L_0x052b
            r0 = 216(0xd8, float:3.03E-43)
            if (r7 == r0) goto L_0x052b
            goto L_0x0519
        L_0x0515:
            r13 = r16
            int r16 = r16 + 1
        L_0x0519:
            r0 = 4
            goto L_0x0532
        L_0x051b:
            r19 = 1
            goto L_0x0532
        L_0x051e:
            if (r7 != r15) goto L_0x0532
        L_0x0520:
            r0 = 3
            goto L_0x0532
        L_0x0522:
            r0 = 216(0xd8, float:3.03E-43)
            if (r7 != r0) goto L_0x0536
            goto L_0x052b
        L_0x0527:
            r13 = r16
            int r16 = r16 + 1
        L_0x052b:
            r0 = 2
            goto L_0x0532
        L_0x052d:
            if (r7 != r15) goto L_0x0536
            r0 = 1
            goto L_0x0532
        L_0x0531:
            r0 = 5
        L_0x0532:
            r17 = r7
            goto L_0x049e
        L_0x0536:
            if (r19 == 0) goto L_0x06ca
            int r0 = r10.size()     // Catch:{ all -> 0x06e5 }
            if (r0 == r6) goto L_0x0562
            int r1 = r10.size()     // Catch:{ all -> 0x06e5 }
            r0 = 7
            if (r1 == r0) goto L_0x0562
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06e5 }
            r1.<init>()     // Catch:{ all -> 0x06e5 }
            r1.append(r12)     // Catch:{ all -> 0x06e5 }
            int r0 = r10.size()     // Catch:{ all -> 0x06e5 }
            r1.append(r0)     // Catch:{ all -> 0x06e5 }
            java.lang.String r0 = " does not match target=1"
            r1.append(r0)     // Catch:{ all -> 0x06e5 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x06e5 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x06e5 }
            goto L_0x06ca
        L_0x0562:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x06e5 }
            r0 = r35
            r0.A03 = r1     // Catch:{ all -> 0x06e5 }
            r5.A04 = r4     // Catch:{ all -> 0x06e5 }
            java.lang.Object r0 = r10.get(r9)     // Catch:{ all -> 0x06e5 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x06e5 }
            int r11 = r0.intValue()     // Catch:{ all -> 0x06e5 }
            long r6 = r34.length()     // Catch:{ all -> 0x06e5 }
            long r0 = (long) r11     // Catch:{ all -> 0x06e5 }
            long r6 = r6 - r0
            int r10 = (int) r6     // Catch:{ all -> 0x06e5 }
            r6 = 100
            if (r10 <= r6) goto L_0x06ca
            int[] r3 = new int[r3]     // Catch:{ all -> 0x06e5 }
            r3[r9] = r11     // Catch:{ all -> 0x06e5 }
            long r6 = r34.length()     // Catch:{ all -> 0x06e5 }
            long r6 = r6 - r0
            int r0 = (int) r6     // Catch:{ all -> 0x06e5 }
            r3[r4] = r0     // Catch:{ all -> 0x06e5 }
            r5.A05 = r3     // Catch:{ all -> 0x06e5 }
            goto L_0x06ca
        L_0x0591:
            r9 = 0
        L_0x0592:
            r11 = 6
            int r7 = r8.read()     // Catch:{ IOException -> 0x062c }
            r1 = -1
            if (r7 == r1) goto L_0x062c
            r1 = 20
            if (r13 >= r1) goto L_0x062c
            int r18 = r18 + 1
            if (r20 != 0) goto L_0x062c
            r15 = 255(0xff, float:3.57E-43)
            if (r0 == 0) goto L_0x0623
            if (r0 == r4) goto L_0x0618
            r14 = 3
            if (r0 == r3) goto L_0x0614
            r1 = 4
            if (r0 == r14) goto L_0x05bb
            if (r0 == r1) goto L_0x0627
            int r14 = r17 << 8
            int r14 = r14 + r7
            int r14 = r14 - r3
            long r0 = (long) r14     // Catch:{ IOException -> 0x062c }
            X.C30311c8.A06(r8, r0)     // Catch:{ IOException -> 0x062c }
            int r18 = r18 + r14
            goto L_0x0621
        L_0x05bb:
            if (r7 == r15) goto L_0x0616
            if (r7 == 0) goto L_0x0621
            r1 = 217(0xd9, float:3.04E-43)
            if (r7 != r1) goto L_0x05d1
            r20 = 1
            int r0 = r18 + -2
            if (r16 <= 0) goto L_0x061d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x062c }
            r10.add(r0)     // Catch:{ IOException -> 0x062c }
            goto L_0x061d
        L_0x05d1:
            if (r19 != 0) goto L_0x05da
            boolean r14 = A00(r7)     // Catch:{ IOException -> 0x062c }
            if (r14 == 0) goto L_0x05da
            goto L_0x062c
        L_0x05da:
            r14 = 194(0xc2, float:2.72E-43)
            if (r7 == r14) goto L_0x0611
            r14 = 198(0xc6, float:2.77E-43)
            if (r7 == r14) goto L_0x0611
            r14 = 202(0xca, float:2.83E-43)
            if (r7 == r14) goto L_0x0611
            r14 = 206(0xce, float:2.89E-43)
            if (r7 == r14) goto L_0x0611
            r0 = 218(0xda, float:3.05E-43)
            if (r7 != r0) goto L_0x05fa
            int r0 = r18 - r3
            if (r16 <= 0) goto L_0x060b
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x062c }
            r10.add(r0)     // Catch:{ IOException -> 0x062c }
            goto L_0x060b
        L_0x05fa:
            if (r7 == r4) goto L_0x0621
            r0 = 208(0xd0, float:2.91E-43)
            if (r7 < r0) goto L_0x060f
            r0 = 215(0xd7, float:3.01E-43)
            if (r7 <= r0) goto L_0x0621
            if (r7 == r1) goto L_0x0621
            r0 = 216(0xd8, float:3.03E-43)
            if (r7 == r0) goto L_0x0621
            goto L_0x060f
        L_0x060b:
            r13 = r16
            int r16 = r16 + 1
        L_0x060f:
            r0 = 4
            goto L_0x0628
        L_0x0611:
            r19 = 1
            goto L_0x0628
        L_0x0614:
            if (r7 != r15) goto L_0x0628
        L_0x0616:
            r0 = 3
            goto L_0x0628
        L_0x0618:
            r0 = 216(0xd8, float:3.03E-43)
            if (r7 != r0) goto L_0x062c
            goto L_0x0621
        L_0x061d:
            r13 = r16
            int r16 = r16 + 1
        L_0x0621:
            r0 = 2
            goto L_0x0628
        L_0x0623:
            if (r7 != r15) goto L_0x062c
            r0 = 1
            goto L_0x0628
        L_0x0627:
            r0 = 5
        L_0x0628:
            r17 = r7
            goto L_0x0592
        L_0x062c:
            int r0 = r10.size()     // Catch:{ all -> 0x06e5 }
            if (r0 != r6) goto L_0x06af
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x06e5 }
            r0 = r35
            r0.A03 = r1     // Catch:{ all -> 0x06e5 }
            r5.A04 = r4     // Catch:{ all -> 0x06e5 }
            java.lang.Object r0 = r10.get(r9)     // Catch:{ all -> 0x06e5 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x06e5 }
            int r15 = r0.intValue()     // Catch:{ all -> 0x06e5 }
            r0 = 5
            java.lang.Object r0 = r10.get(r0)     // Catch:{ all -> 0x06e5 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x06e5 }
            int r14 = r0.intValue()     // Catch:{ all -> 0x06e5 }
            int r14 = r14 - r15
            java.lang.Object r0 = r10.get(r11)     // Catch:{ all -> 0x06e5 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x06e5 }
            int r13 = r0.intValue()     // Catch:{ all -> 0x06e5 }
            r0 = 5
            java.lang.Object r0 = r10.get(r0)     // Catch:{ all -> 0x06e5 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x06e5 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x06e5 }
            int r13 = r13 - r0
            long r6 = r34.length()     // Catch:{ all -> 0x06e5 }
            java.lang.Object r0 = r10.get(r11)     // Catch:{ all -> 0x06e5 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x06e5 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x06e5 }
            long r0 = (long) r0     // Catch:{ all -> 0x06e5 }
            long r6 = r6 - r0
            int r12 = (int) r6     // Catch:{ all -> 0x06e5 }
            r0 = 5
            java.lang.Object r0 = r10.get(r0)     // Catch:{ all -> 0x06e5 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x06e5 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x06e5 }
            long r0 = (long) r0     // Catch:{ all -> 0x06e5 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x06e5 }
            r0 = r35
            r0.A0B = r1     // Catch:{ all -> 0x06e5 }
            java.lang.Object r0 = r10.get(r11)     // Catch:{ all -> 0x06e5 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ all -> 0x06e5 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x06e5 }
            long r0 = (long) r0     // Catch:{ all -> 0x06e5 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x06e5 }
            r0 = r35
            r0.A0E = r1     // Catch:{ all -> 0x06e5 }
            r0 = 4
            int[] r1 = new int[r0]     // Catch:{ all -> 0x06e5 }
            r1[r9] = r15     // Catch:{ all -> 0x06e5 }
            r1[r4] = r14     // Catch:{ all -> 0x06e5 }
            r1[r3] = r13     // Catch:{ all -> 0x06e5 }
            r0 = 3
            r1[r0] = r12     // Catch:{ all -> 0x06e5 }
            r5.A05 = r1     // Catch:{ all -> 0x06e5 }
            goto L_0x06ca
        L_0x06af:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06e5 }
            r1.<init>()     // Catch:{ all -> 0x06e5 }
            r1.append(r12)     // Catch:{ all -> 0x06e5 }
            int r0 = r10.size()     // Catch:{ all -> 0x06e5 }
            r1.append(r0)     // Catch:{ all -> 0x06e5 }
            java.lang.String r0 = " does not match target=8"
            r1.append(r0)     // Catch:{ all -> 0x06e5 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x06e5 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x06e5 }
        L_0x06ca:
            r8.close()     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            int r0 = r2.A06     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            r5.A02 = r0     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            int r0 = r2.A08     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            r5.A03 = r0     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            int r0 = r2.A02     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            r5.A00 = r0     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            int r0 = r2.A03     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            r5.A01 = r0     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            java.io.File r0 = r2.A0F     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            r5.A00 = r0     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            r5.A02 = r4     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            goto L_0x0795
        L_0x06e5:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x06e9 }
        L_0x06e9:
            throw r0     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
        L_0x06ea:
            r4 = move-exception
            long r6 = r32.A01()     // Catch:{ all -> 0x0701 }
            r0 = r33
            int r0 = r0.A02     // Catch:{ all -> 0x0701 }
            long r2 = (long) r0     // Catch:{ all -> 0x0701 }
            r0 = 1024(0x400, double:5.06E-321)
            long r2 = r2 * r0
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0700
            java.lang.String r0 = "imageprocessor/compressToFile/No space left on device"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0701 }
        L_0x0700:
            throw r4     // Catch:{ all -> 0x0701 }
        L_0x0701:
            r0 = move-exception
            r11.recycle()     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
            throw r0     // Catch:{ SecurityException -> 0x0706, 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730 }
        L_0x0706:
            r2 = move-exception
            java.lang.String r0 = "imageprocessor/prepareimageforsend/securityexception"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            r1.<init>(r0)     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            java.lang.String r0 = r2.getMessage()     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            r1.append(r0)     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            java.lang.String r0 = r1.toString()     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
            throw r2     // Catch:{ 20M -> 0x0780, IOException -> 0x0748, OutOfMemoryError -> 0x0730, SecurityException -> 0x071d }
        L_0x071d:
            r1 = move-exception
            r0 = 0
            r5.A02 = r0     // Catch:{ all -> 0x07ed }
            java.lang.String r0 = "mediatranscodequeue/image/security "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x07ed }
            java.lang.String r1 = "permissions-error"
            r0 = r35
            r0.A0O = r1     // Catch:{ all -> 0x07ed }
            r1 = 2131889636(0x7f120de4, float:1.9413941E38)
            goto L_0x0742
        L_0x0730:
            r1 = move-exception
            r0 = 0
            r5.A02 = r0     // Catch:{ all -> 0x07ed }
            java.lang.String r0 = "mediatranscodequeue/image/oom/ "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x07ed }
            java.lang.String r1 = "oom"
            r0 = r35
            r0.A0O = r1     // Catch:{ all -> 0x07ed }
            r1 = 2131888213(0x7f120855, float:1.9411055E38)
        L_0x0742:
            r0 = r37
            r0.A00(r1)     // Catch:{ all -> 0x07ed }
            goto L_0x078f
        L_0x0748:
            r2 = move-exception
            r0 = 0
            r5.A02 = r0     // Catch:{ all -> 0x07ed }
            java.lang.String r0 = "mediatranscodequeue/image/io/ "
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x07ed }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x07ed }
            if (r0 == 0) goto L_0x0766
            java.lang.String r1 = r2.getMessage()     // Catch:{ all -> 0x07ed }
            java.lang.String r0 = "No space"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x07ed }
            r1 = 2131888210(0x7f120852, float:1.9411049E38)
            if (r0 != 0) goto L_0x0769
        L_0x0766:
            r1 = 2131888192(0x7f120840, float:1.9411012E38)
        L_0x0769:
            r0 = r37
            r0.A00(r1)     // Catch:{ all -> 0x07ed }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x07ed }
            r1.<init>()     // Catch:{ all -> 0x07ed }
            java.lang.String r0 = "IOError: "
            r1.append(r0)     // Catch:{ all -> 0x07ed }
            r1.append(r2)     // Catch:{ all -> 0x07ed }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x07ed }
            goto L_0x078b
        L_0x0780:
            r1 = move-exception
            java.lang.String r0 = "mediatranscodequeue/image/not-a-image/ "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x07ed }
            r0 = 0
            r5.A02 = r0     // Catch:{ all -> 0x07ed }
            java.lang.String r1 = "NotAImageException"
        L_0x078b:
            r0 = r35
            r0.A0O = r1     // Catch:{ all -> 0x07ed }
        L_0x078f:
            r0 = r38
            android.os.PowerManager$WakeLock r0 = r0.A00
            r21 = r0
        L_0x0795:
            if (r21 == 0) goto L_0x07a0
            boolean r0 = r21.isHeld()
            if (r0 == 0) goto L_0x07a0
            r21.release()
        L_0x07a0:
            X.3uk r6 = r5.A00()
        L_0x07a4:
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x07e9
            int[] r1 = r6.A05
            int r0 = r1.length
            if (r0 <= 0) goto L_0x07b9
            r0 = 0
            r0 = r1[r0]
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = r35
            r0.A0A = r1
        L_0x07b9:
            java.io.File r0 = r6.A01
            X.AnonymousClass00B.A06(r0)
            long r0 = r0.length()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = r35
            r0.A07 = r1
            boolean r0 = r6.A04
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = r35
            r0.A03 = r1
            byte[] r0 = r6.A03
            if (r0 == 0) goto L_0x07e6
            int r0 = r0.length
            long r0 = (long) r0
        L_0x07da:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = r35
            r0.A0L = r1
            r36.A01()
            return r6
        L_0x07e6:
            r0 = 0
            goto L_0x07da
        L_0x07e9:
            r36.A00()
            return r6
        L_0x07ed:
            r2 = move-exception
            r0 = r38
            android.os.PowerManager$WakeLock r1 = r0.A00
            if (r1 == 0) goto L_0x07fd
            boolean r0 = r1.isHeld()
            if (r0 == 0) goto L_0x07fd
            r1.release()
        L_0x07fd:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass204.A01():X.21C");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00bb */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C76823uk A02(X.C76773uf r10, X.C16730tY r11, java.io.File r12) {
        /*
            r9 = this;
            r8 = 0
            if (r11 == 0) goto L_0x00d4
            java.lang.String r0 = r11.A05
            if (r0 == 0) goto L_0x00d4
            X.0ta r0 = r11.A02
            if (r0 == 0) goto L_0x00d4
            java.io.File r0 = r0.A0F
            if (r0 == 0) goto L_0x00d4
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x00d4
            X.1A9 r2 = r9.A09     // Catch:{ IOException -> 0x00bc }
            X.0ta r0 = r11.A02     // Catch:{ IOException -> 0x00bc }
            java.io.File r0 = r0.A0F     // Catch:{ IOException -> 0x00bc }
            android.net.Uri r1 = android.net.Uri.fromFile(r0)     // Catch:{ IOException -> 0x00bc }
            r0 = 1
            java.io.InputStream r2 = r2.A0b(r1, r0)     // Catch:{ IOException -> 0x00bc }
            X.AnonymousClass1XI.A0Q(r12, r2)     // Catch:{ all -> 0x00b7 }
            java.lang.String r1 = r11.A05     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = X.C37981q3.A00(r12)     // Catch:{ all -> 0x00b7 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00b7 }
            if (r0 != 0) goto L_0x003a
            X.AnonymousClass1XI.A0N(r12)     // Catch:{ all -> 0x00b7 }
            r2.close()     // Catch:{ IOException -> 0x00bc }
            return r8
        L_0x003a:
            X.18C r1 = r9.A08     // Catch:{ all -> 0x00b7 }
            X.0tm r0 = r11.A0F()     // Catch:{ all -> 0x00b7 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x00b7 }
            r1.A01(r0)     // Catch:{ all -> 0x00b7 }
            X.1QO r1 = r9.A07     // Catch:{ all -> 0x00b7 }
            X.1y4 r0 = r11.A12()     // Catch:{ all -> 0x00b7 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x00b7 }
            r1.A00(r0)     // Catch:{ all -> 0x00b7 }
            X.1y4 r0 = r11.A12()     // Catch:{ all -> 0x00b7 }
            int[] r4 = r0.A06()     // Catch:{ all -> 0x00b7 }
            r3 = 1
            if (r4 == 0) goto L_0x008f
            int r1 = r4.length     // Catch:{ all -> 0x00b7 }
            r0 = 4
            if (r1 != r0) goto L_0x008f
            r7 = 0
            r1 = r4[r7]     // Catch:{ all -> 0x00b7 }
            r0 = r4[r3]     // Catch:{ all -> 0x00b7 }
            int r1 = r1 + r0
            r0 = 2
            r0 = r4[r0]     // Catch:{ all -> 0x00b7 }
            int r1 = r1 + r0
            r0 = 3
            r0 = r4[r0]     // Catch:{ all -> 0x00b7 }
            int r1 = r1 + r0
            long r0 = (long) r1     // Catch:{ all -> 0x00b7 }
            long r5 = r12.length()     // Catch:{ all -> 0x00b7 }
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 != 0) goto L_0x008f
            X.1y4 r0 = r11.A12()     // Catch:{ all -> 0x00b7 }
            int[] r0 = r0.A06()     // Catch:{ all -> 0x00b7 }
            r10.A05 = r0     // Catch:{ all -> 0x00b7 }
            X.1y4 r0 = r11.A12()     // Catch:{ all -> 0x00b7 }
            int[] r0 = r0.A06()     // Catch:{ all -> 0x00b7 }
            if (r0 == 0) goto L_0x008d
            r7 = 1
        L_0x008d:
            r10.A04 = r7     // Catch:{ all -> 0x00b7 }
        L_0x008f:
            X.0ta r1 = r11.A02     // Catch:{ all -> 0x00b7 }
            int r0 = r1.A06     // Catch:{ all -> 0x00b7 }
            r10.A02 = r0     // Catch:{ all -> 0x00b7 }
            int r0 = r1.A08     // Catch:{ all -> 0x00b7 }
            r10.A03 = r0     // Catch:{ all -> 0x00b7 }
            int r0 = r1.A02     // Catch:{ all -> 0x00b7 }
            r10.A00 = r0     // Catch:{ all -> 0x00b7 }
            int r0 = r1.A03     // Catch:{ all -> 0x00b7 }
            r10.A01 = r0     // Catch:{ all -> 0x00b7 }
            X.0tm r0 = r11.A0F()     // Catch:{ all -> 0x00b7 }
            byte[] r0 = r0.A07()     // Catch:{ all -> 0x00b7 }
            r10.A03 = r0     // Catch:{ all -> 0x00b7 }
            r10.A00 = r12     // Catch:{ all -> 0x00b7 }
            r10.A02 = r3     // Catch:{ all -> 0x00b7 }
            X.3uk r0 = r10.A00()     // Catch:{ all -> 0x00b7 }
            r2.close()     // Catch:{ IOException -> 0x00bc }
            return r0
        L_0x00b7:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            throw r0     // Catch:{ IOException -> 0x00bc }
        L_0x00bc:
            java.lang.String r0 = "ProcessImageTask/processImage/failed to get bitmap stream from file "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.0ta r0 = r11.A02
            java.io.File r0 = r0.A0F
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.AnonymousClass1XI.A0N(r12)
        L_0x00d4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass204.A02(X.3uf, X.0tY, java.io.File):X.3uk");
    }
}
