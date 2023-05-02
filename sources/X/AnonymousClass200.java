package X;

import android.os.PowerManager;
import com.whatsapp.Mp4Ops;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.200  reason: invalid class name */
public class AnonymousClass200 extends C43411zx {
    public static final AnonymousClass4IC A0J = new AnonymousClass4IC(30, 72);
    public static final AnonymousClass4IC A0K = new AnonymousClass4IC(48, 96);
    public final PowerManager.WakeLock A00;
    public final C16300so A01;
    public final C16180sb A02;
    public final Mp4Ops A03;
    public final C15900s5 A04;
    public final AnonymousClass12W A05;
    public final C16980tz A06;
    public final C15860rz A07;
    public final C20020zN A08;
    public final C16480t8 A09;
    public final C14710pd A0A;
    public final C16490t9 A0B;
    public final C43431zz A0C;
    public final AnonymousClass1QT A0D;
    public final AnonymousClass1RY A0E;
    public final AnonymousClass18C A0F;
    public final C16510tB A0G;
    public final AnonymousClass1A9 A0H;
    public final AnonymousClass1QS A0I;

    public AnonymousClass200(PowerManager.WakeLock wakeLock, C16300so r3, C16180sb r4, Mp4Ops mp4Ops, C15900s5 r6, AnonymousClass12W r7, C16980tz r8, C15860rz r9, C20020zN r10, C16480t8 r11, C14710pd r12, C16490t9 r13, C43431zz r14, AnonymousClass1QT r15, AnonymousClass1RY r16, AnonymousClass18C r17, C16510tB r18, AnonymousClass1A9 r19, AnonymousClass1QS r20) {
        super(r14);
        this.A06 = r8;
        this.A03 = mp4Ops;
        this.A0A = r12;
        this.A01 = r3;
        this.A02 = r4;
        this.A0B = r13;
        this.A04 = r6;
        this.A0H = r19;
        this.A0D = r15;
        this.A08 = r10;
        this.A09 = r11;
        this.A05 = r7;
        this.A0I = r20;
        this.A07 = r9;
        this.A0G = r18;
        this.A0E = r16;
        this.A0F = r17;
        this.A00 = wakeLock;
        this.A0C = r14;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0350, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0351, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/transcodeVideoWithFallback/exception", r1);
        r2 = A05(r14, r41, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x039e, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03a2, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03a5, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03a8, code lost:
        r2 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03a9, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x03ac, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x03ad, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03af, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03b0, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03e7, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03e8, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:?, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/filenotfound", r2);
        A04(r2);
        r1 = new java.lang.StringBuilder();
        r1.append("FileNotFoundException: ");
        r1.append(r2.getMessage());
        r8.A0O = r1.toString();
        r0 = com.obwhatsapp.R.string.str0849;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x040c, code lost:
        r1 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x040d, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x043f, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0440, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0442, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0443, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:?, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/illegalstate", r2);
        A04(r2);
        r1 = new java.lang.StringBuilder();
        r1.append("IllegalStateException: ");
        r1.append(r2.getMessage());
        r0 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0462, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/illegalargument", r2);
        A04(r2);
        r1 = new java.lang.StringBuilder();
        r1.append("IllegalArgumentException: ");
        r1.append(r2.getMessage());
        r0 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x047f, code lost:
        r8.A0O = r0;
        r0 = com.obwhatsapp.R.string.str085b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0188, code lost:
        r1 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0189 */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0281 A[Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02ce A[Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x0362 A[Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }] */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x037f A[Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }] */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x039e A[ExcHandler: FileNotFoundException (e java.io.FileNotFoundException), PHI: r15 
      PHI: (r15v30 java.lang.String) = (r15v33 java.lang.String), (r15v33 java.lang.String), (r15v33 java.lang.String), (r15v35 java.lang.String), (r15v36 java.lang.String) binds: [B:123:0x0310, B:120:0x02fe, B:121:?, B:72:0x01ef, B:54:0x01bc] A[DONT_GENERATE, DONT_INLINE], Splitter:B:54:0x01bc] */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03a2 A[ExcHandler: IllegalArgumentException (e java.lang.IllegalArgumentException), PHI: r15 
      PHI: (r15v28 java.lang.String) = (r15v33 java.lang.String), (r15v33 java.lang.String), (r15v33 java.lang.String), (r15v35 java.lang.String), (r15v36 java.lang.String) binds: [B:123:0x0310, B:120:0x02fe, B:121:?, B:72:0x01ef, B:54:0x01bc] A[DONT_GENERATE, DONT_INLINE], Splitter:B:54:0x01bc] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x03a5 A[ExcHandler: IllegalStateException (e java.lang.IllegalStateException), PHI: r15 
      PHI: (r15v27 java.lang.String) = (r15v33 java.lang.String), (r15v33 java.lang.String), (r15v33 java.lang.String), (r15v35 java.lang.String), (r15v36 java.lang.String) binds: [B:123:0x0310, B:120:0x02fe, B:121:?, B:72:0x01ef, B:54:0x01bc] A[DONT_GENERATE, DONT_INLINE], Splitter:B:54:0x01bc] */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03a8 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:16:0x00f7] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x03ac A[ExcHandler: 20O (e X.20O), Splitter:B:16:0x00f7] */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03af A[ExcHandler: IOException (e java.io.IOException), Splitter:B:16:0x00f7] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x03e7 A[ExcHandler: FileNotFoundException (e java.io.FileNotFoundException), Splitter:B:16:0x00f7] */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x040c A[ExcHandler: 1xB (e X.1xB), Splitter:B:16:0x00f7] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x043f A[ExcHandler: IllegalArgumentException (e java.lang.IllegalArgumentException), Splitter:B:16:0x00f7] */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0442 A[ExcHandler: IllegalStateException (e java.lang.IllegalStateException), Splitter:B:16:0x00f7] */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04b7  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x019e A[Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01b1  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0205 A[Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass21C A01() {
        /*
            r43 = this;
            r10 = r43
            X.0tz r4 = r10.A06
            X.0pd r0 = r10.A0A
            r34 = r0
            X.0so r3 = r10.A01
            X.1QT r0 = r10.A0D
            r33 = r0
            X.0s5 r1 = r10.A04
            X.12W r0 = r10.A05
            r42 = r0
            X.0rz r2 = r10.A07
            X.3Bn r11 = new X.3Bn
            r12 = r3
            r13 = r1
            r14 = r0
            r15 = r4
            r16 = r2
            r17 = r34
            r18 = r33
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r11.A03()
            X.1zz r9 = r10.A0C
            java.io.File r11 = r9.A06
            java.io.File r0 = r9.A03
            r41 = r0
            long r30 = r41.length()
            long r4 = r9.A00
            long r6 = r9.A01
            boolean r0 = r9.A04
            r32 = r0
            r3 = 0
            r1 = r33
            X.1zk r29 = r1.A06(r0, r3)
            X.1RY r13 = r10.A0E
            r0 = r29
            int r0 = r0.A02
            r20 = r0
            r0 = r29
            int r12 = r0.A01
            X.0tz r8 = r13.A01
            X.0pd r3 = r13.A02
            X.0so r1 = r13.A00
            X.1QT r0 = r13.A03
            X.1zl r28 = new X.1zl
            r13 = r28
            r14 = r1
            r15 = r8
            r16 = r3
            r17 = r0
            r18 = r41
            r19 = r11
            r21 = r12
            r22 = r4
            r24 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r24)
            r9.A01(r13)
            X.01D r0 = r2.A01
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "video_transcode_saved_local_config"
            r0 = 0
            java.lang.String r0 = r2.getString(r1, r0)
            if (r0 == 0) goto L_0x00df
            X.4aF r1 = X.C88284aF.A00(r0)
        L_0x0087:
            r13.A03 = r1
            X.3Bj r1 = r9.A02
            r27 = 0
            if (r1 == 0) goto L_0x0093
            r27 = 1
            r13.A06 = r1
        L_0x0093:
            X.211 r14 = r9.A01
            X.3ue r12 = new X.3ue
            r12.<init>()
            r2 = 422(0x1a6, float:5.91E-43)
            X.0tM r26 = X.C16620tM.A02
            r1 = r34
            r0 = r26
            boolean r2 = r1.A0E(r0, r2)
            int r1 = X.C43291zl.A01(r2)
            r0 = 1
            if (r1 == r0) goto L_0x00ae
            r0 = 0
        L_0x00ae:
            X.212 r8 = r14.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r8.A04 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r30)
            r8.A0J = r0
            r0 = 3
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.A0N = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r32)
            r8.A01 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r27)
            r8.A00 = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r14.A00 = r0
            r0 = 2
            com.facebook.redex.IDxListenerShape345S0100000_2_I0 r1 = new com.facebook.redex.IDxListenerShape345S0100000_2_I0
            r1.<init>(r9, r0)
            r13.A04 = r1
            goto L_0x00e1
        L_0x00df:
            r1 = 0
            goto L_0x0087
        L_0x00e1:
            X.0zN r0 = r10.A08     // Catch:{ Exception -> 0x00ef }
            java.io.File r0 = r0.A00()     // Catch:{ Exception -> 0x00ef }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x00ef }
            com.whatsapp.VideoFrameConverter.setLogFilePath(r0)     // Catch:{ Exception -> 0x00ef }
            goto L_0x00f5
        L_0x00ef:
            r1 = move-exception
            java.lang.String r0 = "mediatranscodequeue/Unable to create crash in video sentinel file"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00f5:
            r16 = 0
            android.os.PowerManager$WakeLock r0 = r10.A00     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            r25 = r0
            if (r0 == 0) goto L_0x0100
            r25.acquire()     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
        L_0x0100:
            boolean r0 = r41.exists()     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            if (r0 == 0) goto L_0x038b
            int r1 = X.C43291zl.A01(r2)     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            r0 = 1
            if (r1 != r0) goto L_0x031b
            X.1xA r13 = new X.1xA     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            r0 = r41
            r13.<init>(r0)     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            int r3 = r13.A03     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            int r2 = r13.A01     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            if (r3 == 0) goto L_0x0314
            if (r2 == 0) goto L_0x0314
            int r0 = java.lang.Math.max(r3, r2)     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            r1 = r20
            int r0 = java.lang.Math.min(r1, r0)     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            android.util.Pair r1 = X.AnonymousClass1QT.A03(r3, r2, r0)     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            java.lang.Object r0 = r1.first     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            int r24 = r0.intValue()     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            java.lang.Object r0 = r1.second     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            int r23 = r0.intValue()     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            boolean r0 = r9.A06     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            r22 = r0
            long r0 = r13.A04     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            r20 = r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r18 = r20 / r0
            r15 = r33
            r2 = r30
            r0 = r18
            boolean r18 = r15.A07(r2, r0)     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            r14.A03(r13)     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            int r0 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x0165
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r0 != 0) goto L_0x0165
            if (r27 != 0) goto L_0x0165
            if (r22 != 0) goto L_0x0168
            if (r18 != 0) goto L_0x0168
            r27 = 0
            r18 = 0
        L_0x0165:
            r15 = 0
            goto L_0x01f1
        L_0x0168:
            java.lang.String r0 = "mediatranscodequeue/attemptToDedupeVideo"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            r27 = 0
            java.lang.String r1 = X.C37981q3.A00(r41)     // Catch:{ IOException -> 0x0188, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, 20O -> 0x03ac, all -> 0x03a8 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0189, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, 20O -> 0x03ac, all -> 0x03a8 }
            r2.<init>()     // Catch:{ IOException -> 0x0189, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, 20O -> 0x03ac, all -> 0x03a8 }
            java.lang.String r0 = "mediatranscodequeue/computedHash="
            r2.append(r0)     // Catch:{ IOException -> 0x0189, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, 20O -> 0x03ac, all -> 0x03a8 }
            r2.append(r1)     // Catch:{ IOException -> 0x0189, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, 20O -> 0x03ac, all -> 0x03a8 }
            java.lang.String r0 = r2.toString()     // Catch:{ IOException -> 0x0189, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, 20O -> 0x03ac, all -> 0x03a8 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0189, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, 20O -> 0x03ac, all -> 0x03a8 }
            goto L_0x0189
        L_0x0188:
            r1 = 0
        L_0x0189:
            X.0t8 r0 = r10.A09     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            r19 = r0
            X.0tY r3 = r0.A0A(r1)     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            r2.<init>()     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            java.lang.String r0 = "mediatranscodequeue/foundExistingMessage="
            r2.append(r0)     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            r0 = 0
            if (r3 == 0) goto L_0x019f
            r0 = 1
        L_0x019f:
            r2.append(r0)     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            java.lang.String r0 = r2.toString()     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            if (r3 == 0) goto L_0x01b6
            X.3ui r2 = r10.A02(r12, r3, r11)     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            if (r2 == 0) goto L_0x01b6
            r0 = 0
            com.whatsapp.VideoFrameConverter.setLogFilePath(r0)
            goto L_0x01dd
        L_0x01b6:
            if (r1 == 0) goto L_0x01ee
            r2 = 3
            r15 = 0
            r0 = r19
            java.util.Collection r0 = r0.A0E(r1, r2)     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
        L_0x01c4:
            boolean r0 = r3.hasNext()     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            if (r0 == 0) goto L_0x01ee
            java.lang.Object r2 = r3.next()     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            X.0tY r2 = (X.C16730tY) r2     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            boolean r0 = r2 instanceof X.C38711rI     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            if (r0 == 0) goto L_0x01c4
            X.3ui r2 = r10.A02(r12, r2, r11)     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            if (r2 == 0) goto L_0x01c4
            com.whatsapp.VideoFrameConverter.setLogFilePath(r15)
        L_0x01dd:
            if (r25 == 0) goto L_0x01e8
            boolean r0 = r25.isHeld()
            if (r0 == 0) goto L_0x01e8
            r25.release()
        L_0x01e8:
            X.0zN r0 = r10.A08
            r0.A01()
            return r2
        L_0x01ee:
            r15 = 0
            r12.A01 = r1     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
        L_0x01f1:
            r1 = r24
            r0 = r23
            r14.A02(r1, r0)     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
            r1 = 0
            r0 = r41
            X.1zC r0 = X.AnonymousClass1QS.A04(r0, r1)     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            int r1 = r0.A00     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            r0 = 8
            if (r1 != r0) goto L_0x0279
            java.lang.String r0 = "mediatranscodequeue/needs dolby EAC3 Audio track removal"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            r1 = r42
            r0 = r41
            java.io.File r2 = r1.A01(r0)     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            java.lang.String r0 = "mp4ops/removeDolbyEAC3Track/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 20O -> 0x0275, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, all -> 0x03a8 }
            java.lang.String r1 = r41.getAbsolutePath()     // Catch:{ Error -> 0x0266 }
            java.lang.String r0 = r2.getAbsolutePath()     // Catch:{ Error -> 0x0266 }
            com.whatsapp.Mp4Ops$LibMp4OperationResult r1 = com.whatsapp.Mp4Ops.mp4removeDolbyEAC3Track(r1, r0)     // Catch:{ Error -> 0x0266 }
            boolean r0 = r1.success     // Catch:{ 20O -> 0x0275, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, all -> 0x03a8 }
            if (r0 != 0) goto L_0x025c
            java.lang.String r0 = "mp4ops/check/error_message/"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ 20O -> 0x0275, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, all -> 0x03a8 }
            r2.<init>(r0)     // Catch:{ 20O -> 0x0275, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, all -> 0x03a8 }
            java.lang.String r0 = r1.errorMessage     // Catch:{ 20O -> 0x0275, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, all -> 0x03a8 }
            r2.append(r0)     // Catch:{ 20O -> 0x0275, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, all -> 0x03a8 }
            java.lang.String r0 = r2.toString()     // Catch:{ 20O -> 0x0275, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, all -> 0x03a8 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 20O -> 0x0275, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, all -> 0x03a8 }
            boolean r0 = r1.ioException     // Catch:{ 20O -> 0x0275, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, all -> 0x03a8 }
            if (r0 == 0) goto L_0x0246
            java.lang.String r1 = "No space"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ 20O -> 0x0275, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, all -> 0x03a8 }
            r0.<init>(r1)     // Catch:{ 20O -> 0x0275, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, all -> 0x03a8 }
            throw r0     // Catch:{ 20O -> 0x0275, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, all -> 0x03a8 }
        L_0x0246:
            int r2 = r1.errorCode     // Catch:{ 20O -> 0x0275, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, all -> 0x03a8 }
            java.lang.String r1 = "removeDolbyEAC3Track failed, error_code: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ 20O -> 0x0275, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, all -> 0x03a8 }
            r0.<init>(r1)     // Catch:{ 20O -> 0x0275, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, all -> 0x03a8 }
            r0.append(r2)     // Catch:{ 20O -> 0x0275, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, all -> 0x03a8 }
            java.lang.String r1 = r0.toString()     // Catch:{ 20O -> 0x0275, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, all -> 0x03a8 }
            X.20O r0 = new X.20O     // Catch:{ 20O -> 0x0275, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, all -> 0x03a8 }
            r0.<init>(r2, r1)     // Catch:{ 20O -> 0x0275, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, all -> 0x03a8 }
            throw r0     // Catch:{ 20O -> 0x0275, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, all -> 0x03a8 }
        L_0x025c:
            java.lang.String r0 = "mp4ops/removeDolbyEAC3Track/finished"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 20O -> 0x0275, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, all -> 0x03a8 }
            r0 = r28
            r0.A08 = r2     // Catch:{ 20O -> 0x0275, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, all -> 0x03a8 }
            goto L_0x0277
        L_0x0266:
            r1 = move-exception
            java.lang.String r0 = "mp4ops/removeDolbyEAC3Track/"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ 20O -> 0x0275, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, all -> 0x03a8 }
            r2 = 0
            java.lang.String r1 = "integrity check error"
            X.20O r0 = new X.20O     // Catch:{ 20O -> 0x0275, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, all -> 0x03a8 }
            r0.<init>(r2, r1)     // Catch:{ 20O -> 0x0275, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, all -> 0x03a8 }
            throw r0     // Catch:{ 20O -> 0x0275, IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, all -> 0x03a8 }
        L_0x0275:
            r0 = move-exception
            throw r0     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
        L_0x0277:
            r41 = r2
        L_0x0279:
            int r0 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x02ce
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x02ce
            if (r22 != 0) goto L_0x02bb
            r1 = 3
            r0 = r29
            boolean r0 = X.AnonymousClass1QT.A05(r0, r13, r1)     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            if (r0 != 0) goto L_0x02bb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            r2.<init>()     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            java.lang.String r0 = "mediatranscodequeue/trim/from="
            r2.append(r0)     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            r2.append(r4)     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            java.lang.String r0 = ", to="
            r2.append(r0)     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            r2.append(r6)     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            java.lang.String r0 = ", duration="
            r2.append(r0)     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            r0 = r20
            r2.append(r0)     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            java.lang.String r0 = r2.toString()     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            java.lang.String r0 = "trim"
            r8.A0P = r0     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            r28.A0B()     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            goto L_0x032c
        L_0x02bb:
            long r6 = r6 - r4
            r33 = r10
            r34 = r14
            r35 = r29
            r36 = r28
            r37 = r24
            r38 = r23
            r39 = r6
            r33.A03(r34, r35, r36, r37, r38, r39)     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            goto L_0x032c
        L_0x02ce:
            if (r18 != 0) goto L_0x02de
            if (r22 != 0) goto L_0x02de
            java.lang.String r0 = "mediatranscodequeue/copy/not-need-transcode"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            r0 = r41
            boolean r2 = r10.A05(r14, r0, r11)     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            goto L_0x035c
        L_0x02de:
            r2 = 228(0xe4, float:3.2E-43)
            r1 = r34
            r0 = r26
            boolean r0 = r1.A0E(r0, r2)     // Catch:{ IllegalStateException -> 0x0442, IllegalArgumentException -> 0x043f, 1xB -> 0x040c, FileNotFoundException -> 0x03e7, IOException -> 0x03af, 20O -> 0x03ac, all -> 0x03a8 }
            if (r0 == 0) goto L_0x0302
            if (r27 != 0) goto L_0x0302
            if (r18 == 0) goto L_0x0302
            if (r22 != 0) goto L_0x0302
            r33 = r10
            r34 = r14
            r35 = r29
            r36 = r28
            r37 = r24
            r38 = r23
            r39 = r20
            r33.A03(r34, r35, r36, r37, r38, r39)     // Catch:{ 1xB | 20O | IOException -> 0x0350, IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, FileNotFoundException -> 0x039e }
            goto L_0x032c
        L_0x0302:
            r33 = r10
            r34 = r14
            r35 = r29
            r36 = r28
            r37 = r24
            r38 = r23
            r39 = r20
            r33.A03(r34, r35, r36, r37, r38, r39)     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
            goto L_0x032c
        L_0x0314:
            r15 = 0
            X.1xB r0 = new X.1xB     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
            r0.<init>()     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
            throw r0     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
        L_0x031b:
            r15 = 0
            int r0 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x032e
            int r0 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x032e
            java.lang.String r0 = "trim"
            r8.A0P = r0     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
            r28.A0B()     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
        L_0x032c:
            r2 = 1
            goto L_0x035c
        L_0x032e:
            long r0 = r41.length()     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
            double r6 = (double) r0     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
            r0 = r29
            int r0 = r0.A00     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
            long r2 = (long) r0     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
            r0 = 1048576(0x100000, double:5.180654E-318)
            long r2 = r2 * r0
            double r0 = (double) r2     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
            r2 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r0 = r0 * r2
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x0385
            java.lang.String r0 = "mediatranscodequeue/copy"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
            r0 = r41
            boolean r2 = r10.A05(r14, r0, r11)     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
            goto L_0x035c
        L_0x0350:
            r1 = move-exception
            java.lang.String r0 = "mediatranscodequeue/transcodeVideoWithFallback/exception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
            r0 = r41
            boolean r2 = r10.A05(r14, r0, r11)     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
        L_0x035c:
            r0 = r28
            boolean r0 = r0.A0K     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
            if (r0 != 0) goto L_0x037f
            boolean r0 = r9.A05     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
            if (r0 == 0) goto L_0x036b
            r0 = r42
            com.whatsapp.Mp4Ops.A00(r0, r11)     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
        L_0x036b:
            X.1QS r0 = r10.A0I     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
            boolean r0 = r0.A0E(r11)     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
            if (r0 == 0) goto L_0x0376
            r1 = 1
            goto L_0x04a2
        L_0x0376:
            java.lang.String r1 = "video was not transcoded correctly"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
            r0.<init>(r1)     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
            throw r0     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
        L_0x037f:
            java.lang.String r0 = "cancel"
            r8.A0O = r0     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
            goto L_0x04a1
        L_0x0385:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
            r0.<init>()     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
            throw r0     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
        L_0x038b:
            r15 = 0
            java.lang.String r0 = "mediatranscodequeue/file not found"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
            java.lang.String r1 = "transcode input file does not exist"
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
            r0.<init>(r1)     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
            throw r0     // Catch:{ IllegalStateException -> 0x03a5, IllegalArgumentException -> 0x03a2, 1xB -> 0x03a0, FileNotFoundException -> 0x039e, IOException -> 0x039c, 20O -> 0x039a }
        L_0x039a:
            r2 = move-exception
            goto L_0x0419
        L_0x039c:
            r2 = move-exception
            goto L_0x03b1
        L_0x039e:
            r2 = move-exception
            goto L_0x03e9
        L_0x03a0:
            r1 = move-exception
            goto L_0x040e
        L_0x03a2:
            r2 = move-exception
            goto L_0x0462
        L_0x03a5:
            r2 = move-exception
            goto L_0x0444
        L_0x03a8:
            r2 = move-exception
            r15 = 0
            goto L_0x04fe
        L_0x03ac:
            r2 = move-exception
            r15 = 0
            goto L_0x0419
        L_0x03af:
            r2 = move-exception
            r15 = 0
        L_0x03b1:
            java.lang.String r0 = "mediatranscodequeue/ioexception"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x04fd }
            r10.A04(r2)     // Catch:{ all -> 0x04fd }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x04fd }
            r1.<init>()     // Catch:{ all -> 0x04fd }
            java.lang.String r0 = "IOException: "
            r1.append(r0)     // Catch:{ all -> 0x04fd }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x04fd }
            r1.append(r0)     // Catch:{ all -> 0x04fd }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x04fd }
            r8.A0O = r0     // Catch:{ all -> 0x04fd }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x04fd }
            if (r0 == 0) goto L_0x0487
            java.lang.String r1 = r2.getMessage()     // Catch:{ all -> 0x04fd }
            java.lang.String r0 = "No space"
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x04fd }
            if (r0 == 0) goto L_0x0487
            r0 = 2131888210(0x7f120852, float:1.9411049E38)
            goto L_0x0484
        L_0x03e7:
            r2 = move-exception
            r15 = 0
        L_0x03e9:
            java.lang.String r0 = "mediatranscodequeue/filenotfound"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x04fd }
            r10.A04(r2)     // Catch:{ all -> 0x04fd }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x04fd }
            r1.<init>()     // Catch:{ all -> 0x04fd }
            java.lang.String r0 = "FileNotFoundException: "
            r1.append(r0)     // Catch:{ all -> 0x04fd }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x04fd }
            r1.append(r0)     // Catch:{ all -> 0x04fd }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x04fd }
            r8.A0O = r0     // Catch:{ all -> 0x04fd }
            r0 = 2131888201(0x7f120849, float:1.941103E38)
            goto L_0x0484
        L_0x040c:
            r1 = move-exception
            r15 = 0
        L_0x040e:
            java.lang.String r0 = "mediatranscodequeue/bad video"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x04fd }
            r10.A04(r1)     // Catch:{ all -> 0x04fd }
            java.lang.String r0 = "BadVideoException"
            goto L_0x0439
        L_0x0419:
            java.lang.String r0 = "mediatranscodequeue/libmp4muxexception"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x04fd }
            r10.A04(r2)     // Catch:{ all -> 0x04fd }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x04fd }
            r1.<init>()     // Catch:{ all -> 0x04fd }
            java.lang.String r0 = "Mp4OpsFail ("
            r1.append(r0)     // Catch:{ all -> 0x04fd }
            int r0 = r2.errorCode     // Catch:{ all -> 0x04fd }
            r1.append(r0)     // Catch:{ all -> 0x04fd }
            java.lang.String r0 = ")"
            r1.append(r0)     // Catch:{ all -> 0x04fd }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x04fd }
        L_0x0439:
            r8.A0O = r0     // Catch:{ all -> 0x04fd }
            r0 = 2131888187(0x7f12083b, float:1.9411002E38)
            goto L_0x0484
        L_0x043f:
            r2 = move-exception
            r15 = 0
            goto L_0x0462
        L_0x0442:
            r2 = move-exception
            r15 = 0
        L_0x0444:
            java.lang.String r0 = "mediatranscodequeue/illegalstate"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x04fd }
            r10.A04(r2)     // Catch:{ all -> 0x04fd }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x04fd }
            r1.<init>()     // Catch:{ all -> 0x04fd }
            java.lang.String r0 = "IllegalStateException: "
            r1.append(r0)     // Catch:{ all -> 0x04fd }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x04fd }
            r1.append(r0)     // Catch:{ all -> 0x04fd }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x04fd }
            goto L_0x047f
        L_0x0462:
            java.lang.String r0 = "mediatranscodequeue/illegalargument"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x04fd }
            r10.A04(r2)     // Catch:{ all -> 0x04fd }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x04fd }
            r1.<init>()     // Catch:{ all -> 0x04fd }
            java.lang.String r0 = "IllegalArgumentException: "
            r1.append(r0)     // Catch:{ all -> 0x04fd }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x04fd }
            r1.append(r0)     // Catch:{ all -> 0x04fd }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x04fd }
        L_0x047f:
            r8.A0O = r0     // Catch:{ all -> 0x04fd }
            r0 = 2131888219(0x7f12085b, float:1.9411067E38)
        L_0x0484:
            r9.A00(r0)     // Catch:{ all -> 0x04fd }
        L_0x0487:
            com.whatsapp.VideoFrameConverter.setLogFilePath(r15)
            android.os.PowerManager$WakeLock r1 = r10.A00
            if (r1 == 0) goto L_0x0497
            boolean r0 = r1.isHeld()
            if (r0 == 0) goto L_0x0497
            r1.release()
        L_0x0497:
            X.0zN r0 = r10.A08
            r0.A01()
        L_0x049c:
            r14.A00()
            r0 = 0
            goto L_0x04f1
        L_0x04a1:
            r1 = 0
        L_0x04a2:
            com.whatsapp.VideoFrameConverter.setLogFilePath(r15)
            if (r25 == 0) goto L_0x04b0
            boolean r0 = r25.isHeld()
            if (r0 == 0) goto L_0x04b0
            r25.release()
        L_0x04b0:
            X.0zN r0 = r10.A08
            r0.A01()
            if (r1 == 0) goto L_0x049c
            if (r32 == 0) goto L_0x04f8
            X.4IC r0 = A0K
            r3 = 48
        L_0x04bd:
            int r1 = r0.A01
            r0 = r32 ^ 1
            byte[] r6 = X.AnonymousClass1A9.A0U(r11, r3, r1, r0)
            int r0 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x04d0
            if (r6 != 0) goto L_0x04d0
            java.lang.String r0 = "mediatranscodequeue/could not get video thumb"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x04d0:
            int r3 = X.C17970vw.A03(r11)
            long r0 = (long) r3
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.A05 = r0
            long r0 = r11.length()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r8.A07 = r0
            r14.A01()
            r12.A00 = r3
            r12.A01 = r2
            r12.A00 = r11
            r12.A03 = r6
            r0 = 1
        L_0x04f1:
            r12.A02 = r0
            X.3ui r2 = r12.A00()
            return r2
        L_0x04f8:
            X.4IC r0 = A0J
            r3 = 30
            goto L_0x04bd
        L_0x04fd:
            r2 = move-exception
        L_0x04fe:
            com.whatsapp.VideoFrameConverter.setLogFilePath(r15)
            android.os.PowerManager$WakeLock r1 = r10.A00
            if (r1 == 0) goto L_0x050e
            boolean r0 = r1.isHeld()
            if (r0 == 0) goto L_0x050e
            r1.release()
        L_0x050e:
            X.0zN r0 = r10.A08
            r0.A01()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass200.A01():X.21C");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        if (r2 == null) goto L_0x0052;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C76803ui A02(X.C76763ue r8, X.C16730tY r9, java.io.File r10) {
        /*
            r7 = this;
            r6 = 0
            if (r9 == 0) goto L_0x00bb
            java.lang.String r0 = r9.A05
            if (r0 == 0) goto L_0x00bb
            X.0ta r0 = r9.A02
            if (r0 == 0) goto L_0x00bb
            java.io.File r0 = r0.A0F
            if (r0 == 0) goto L_0x00bb
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x00bb
            X.0tB r1 = r7.A0G     // Catch:{ IOException -> 0x00b2 }
            X.0ta r0 = r9.A02     // Catch:{ IOException -> 0x00b2 }
            java.io.File r0 = r0.A0F     // Catch:{ IOException -> 0x00b2 }
            X.AnonymousClass1XI.A0B(r1, r0, r10)     // Catch:{ IOException -> 0x00b2 }
            java.lang.String r1 = r9.A05     // Catch:{ IOException -> 0x00b2 }
            java.lang.String r0 = X.C37981q3.A00(r10)     // Catch:{ IOException -> 0x00b2 }
            boolean r0 = r1.equals(r0)     // Catch:{ IOException -> 0x00b2 }
            if (r0 != 0) goto L_0x002e
            X.AnonymousClass1XI.A0N(r10)     // Catch:{ IOException -> 0x00b2 }
            return r6
        L_0x002e:
            X.1zz r3 = r7.A0C     // Catch:{ IOException -> 0x00b2 }
            boolean r5 = r3.A04     // Catch:{ IOException -> 0x00b2 }
            X.1Vw r0 = r9.A11     // Catch:{ IOException -> 0x00b2 }
            X.0rv r0 = r0.A00     // Catch:{ IOException -> 0x00b2 }
            boolean r0 = X.C16030sJ.A0Q(r0)     // Catch:{ IOException -> 0x00b2 }
            if (r5 != r0) goto L_0x0052
            X.18C r1 = r7.A0F     // Catch:{ IOException -> 0x00b2 }
            X.0tm r0 = r9.A0F()     // Catch:{ IOException -> 0x00b2 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ IOException -> 0x00b2 }
            r1.A01(r0)     // Catch:{ IOException -> 0x00b2 }
            X.0tm r0 = r9.A0F()     // Catch:{ IOException -> 0x00b2 }
            byte[] r2 = r0.A07()     // Catch:{ IOException -> 0x00b2 }
            if (r2 != 0) goto L_0x0065
        L_0x0052:
            if (r5 == 0) goto L_0x0059
            X.4IC r0 = A0K     // Catch:{ IOException -> 0x00b2 }
            r2 = 48
            goto L_0x005d
        L_0x0059:
            X.4IC r0 = A0J     // Catch:{ IOException -> 0x00b2 }
            r2 = 30
        L_0x005d:
            int r1 = r0.A01     // Catch:{ IOException -> 0x00b2 }
            r0 = r5 ^ 1
            byte[] r2 = X.AnonymousClass1A9.A0U(r10, r2, r1, r0)     // Catch:{ IOException -> 0x00b2 }
        L_0x0065:
            X.211 r4 = r3.A01     // Catch:{ IOException -> 0x00b2 }
            java.io.File r0 = r3.A03     // Catch:{ IOException -> 0x00b2 }
            long r0 = r0.length()     // Catch:{ IOException -> 0x00b2 }
            X.212 r3 = r4.A03     // Catch:{ IOException -> 0x00b2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x00b2 }
            r3.A0J = r0     // Catch:{ IOException -> 0x00b2 }
            r0 = 3
            long r0 = (long) r0     // Catch:{ IOException -> 0x00b2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x00b2 }
            r3.A0N = r0     // Catch:{ IOException -> 0x00b2 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)     // Catch:{ IOException -> 0x00b2 }
            r3.A01 = r0     // Catch:{ IOException -> 0x00b2 }
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x00b2 }
            r3.A00 = r0     // Catch:{ IOException -> 0x00b2 }
            int r0 = r9.A00     // Catch:{ IOException -> 0x00b2 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x00b2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x00b2 }
            r3.A05 = r0     // Catch:{ IOException -> 0x00b2 }
            long r0 = r10.length()     // Catch:{ IOException -> 0x00b2 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x00b2 }
            r3.A07 = r0     // Catch:{ IOException -> 0x00b2 }
            r4.A01()     // Catch:{ IOException -> 0x00b2 }
            int r0 = r9.A00     // Catch:{ IOException -> 0x00b2 }
            r8.A00 = r0     // Catch:{ IOException -> 0x00b2 }
            r0 = 1
            r8.A01 = r0     // Catch:{ IOException -> 0x00b2 }
            r8.A00 = r10     // Catch:{ IOException -> 0x00b2 }
            r8.A03 = r2     // Catch:{ IOException -> 0x00b2 }
            r8.A02 = r0     // Catch:{ IOException -> 0x00b2 }
            X.3ui r0 = r8.A00()     // Catch:{ IOException -> 0x00b2 }
            return r0
        L_0x00b2:
            r1 = move-exception
            java.lang.String r0 = "mediatranscodequeue/attemptReuseExistingVideo"
            com.whatsapp.util.Log.e(r0, r1)
            X.AnonymousClass1XI.A0N(r10)
        L_0x00bb:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass200.A02(X.3ue, X.0tY, java.io.File):X.3ui");
    }

    public final void A03(AnonymousClass211 r8, C43281zk r9, C43291zl r10, int i2, int i3, long j2) {
        AnonymousClass212 r2 = r8.A03;
        r2.A0P = "transcode";
        r2.A0C = Long.valueOf((long) r9.A02);
        int i4 = r9.A00;
        int i5 = 9;
        if (this.A0C.A04) {
            i5 = 6;
        }
        r10.A00 = AnonymousClass1QT.A00(i4, i2, i3, i5, j2);
        r10.A0A();
    }

    public final void A04(Exception exc) {
        C75373s3 r1 = new C75373s3();
        r1.A00 = 5;
        r1.A05 = exc.toString();
        this.A0B.A05(r1);
    }

    public final boolean A05(AnonymousClass211 r3, File file, File file2) {
        r3.A03.A0P = "checkAndRepair";
        AnonymousClass1XI.A0B(this.A02.A04, file, file2);
        try {
            return this.A03.A04(file2);
        } catch (AnonymousClass20O e2) {
            throw e2;
        } catch (IOException e3) {
            Log.e("mediatranscodequeue/repair/io-exception/", e3);
            throw e3;
        }
    }
}
