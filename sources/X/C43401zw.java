package X;

import android.os.PowerManager;
import com.whatsapp.Mp4Ops;

/* renamed from: X.1zw  reason: invalid class name and case insensitive filesystem */
public class C43401zw extends C43411zx {
    public final PowerManager.WakeLock A00;
    public final C16300so A01;
    public final C16180sb A02;
    public final Mp4Ops A03;
    public final C15900s5 A04;
    public final AnonymousClass12W A05;
    public final C16980tz A06;
    public final C15860rz A07;
    public final C20020zN A08;
    public final C14710pd A09;
    public final C43391zv A0A;
    public final AnonymousClass1QT A0B;
    public final AnonymousClass1RY A0C;
    public final AnonymousClass1QS A0D;

    public C43401zw(PowerManager.WakeLock wakeLock, C16300so r2, C16180sb r3, Mp4Ops mp4Ops, C15900s5 r5, AnonymousClass12W r6, C16980tz r7, C15860rz r8, C20020zN r9, C14710pd r10, C43391zv r11, AnonymousClass1QT r12, AnonymousClass1RY r13, AnonymousClass1QS r14) {
        super(r11);
        this.A06 = r7;
        this.A03 = mp4Ops;
        this.A09 = r10;
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = r5;
        this.A0B = r12;
        this.A08 = r9;
        this.A05 = r6;
        this.A0D = r14;
        this.A07 = r8;
        this.A0C = r13;
        this.A0A = r11;
        this.A00 = wakeLock;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0285, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/ioexception", r2);
        r1 = new java.lang.StringBuilder();
        r1.append("IOException: ");
        r1.append(r2.getMessage());
        r6.A0O = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x02a6, code lost:
        if (r2.getMessage() != null) goto L_0x02a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x02a8, code lost:
        r1 = r2.getMessage().contains("No space");
        r0 = com.obwhatsapp.R.string.str0852;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x02b5, code lost:
        if (r1 == false) goto L_0x02b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02b9, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/filenotfound", r2);
        r1 = new java.lang.StringBuilder();
        r1.append("FileNotFoundException: ");
        r1.append(r2.getMessage());
        r6.A0O = r1.toString();
        r0 = com.obwhatsapp.R.string.str0847;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02da, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:?, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/bad video", r1);
        r0 = "BadVideoException";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0306, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0308, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/illegalstate", r2);
        r1 = new java.lang.StringBuilder();
        r1.append("IllegalStateException: ");
        r1.append(r2.getMessage());
        r0 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0324, code lost:
        com.whatsapp.util.Log.e("mediatranscodequeue/illegalargument", r2);
        r1 = new java.lang.StringBuilder();
        r1.append("IllegalArgumentException: ");
        r1.append(r2.getMessage());
        r0 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x033e, code lost:
        r6.A0O = r0;
        r0 = com.obwhatsapp.R.string.str085a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0285 A[ExcHandler: IOException (r2v6 'e' java.io.IOException A[CUSTOM_DECLARE]), Splitter:B:22:0x0116] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02b9 A[ExcHandler: FileNotFoundException (r2v5 'e' java.io.FileNotFoundException A[CUSTOM_DECLARE]), Splitter:B:22:0x0116] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x02da A[ExcHandler: 1xB (r1v10 'e' X.1xB A[CUSTOM_DECLARE]), Splitter:B:22:0x0116] */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0306 A[ExcHandler: IllegalArgumentException (r2v4 'e' java.lang.IllegalArgumentException A[CUSTOM_DECLARE]), Splitter:B:22:0x0116] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0308 A[ExcHandler: IllegalStateException (r2v3 'e' java.lang.IllegalStateException A[CUSTOM_DECLARE]), Splitter:B:22:0x0116] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x01e4 A[Catch:{ 20O -> 0x01f1, IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283, all -> 0x035c }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x020e A[Catch:{ 20O -> 0x01f1, IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283, all -> 0x035c }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x022b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass21C A01() {
        /*
            r43 = this;
            r8 = r43
            X.1zv r7 = r8.A0A
            X.211 r0 = r7.A01
            r42 = r0
            android.os.PowerManager$WakeLock r0 = r8.A00
            r26 = r0
            X.3ue r25 = new X.3ue
            r25.<init>()
            X.0tz r3 = r8.A06
            X.0pd r2 = r8.A09
            X.0so r1 = r8.A01
            X.1QT r0 = r8.A0B
            r41 = r0
            X.0s5 r5 = r8.A04
            X.12W r0 = r8.A05
            r40 = r0
            X.0rz r10 = r8.A07
            X.3Bn r11 = new X.3Bn
            r12 = r1
            r13 = r5
            r14 = r0
            r15 = r3
            r16 = r10
            r17 = r2
            r18 = r41
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r11.A03()
            java.io.File r9 = r7.A06
            r1 = 422(0x1a6, float:5.91E-43)
            X.0tM r0 = X.C16620tM.A02
            boolean r16 = r2.A0E(r0, r1)
            int r0 = X.C43291zl.A01(r16)
            r4 = 1
            r24 = 0
            r1 = 0
            if (r0 != r4) goto L_0x004a
            r1 = 1
        L_0x004a:
            r0 = r42
            X.212 r6 = r0.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            r6.A04 = r0
            r0 = 13
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A0N = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r2 = r42
            r2.A00 = r0
            java.io.File r14 = r7.A03
            if (r14 != 0) goto L_0x0085
            java.lang.String r0 = "mediatranscodequeue/failed to load, check MediaLoadGifJob logs to see details."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = "FailedToLoad"
            r6.A0O = r0
            r0 = 2131888218(0x7f12085a, float:1.9411065E38)
            r7.A00(r0)
        L_0x0078:
            r42.A00()
            r1 = 0
        L_0x007c:
            r0 = r25
            r0.A02 = r1
            X.3ui r0 = r25.A00()
            return r0
        L_0x0085:
            long r2 = r7.A00
            long r0 = r7.A01
            r22 = r0
            X.0tC r15 = X.C15910s6.A1f
            int r11 = r5.A02(r15)
            r5 = 5000000(0x4c4b40, float:7.006492E-39)
            r1 = 640(0x280, float:8.97E-43)
            X.1zk r21 = new X.1zk
            r0 = r21
            r0.<init>(r11, r1, r5)
            X.1RY r0 = r8.A0C
            X.0tz r12 = r0.A01
            X.0pd r5 = r0.A02
            X.0so r1 = r0.A00
            X.1QT r0 = r0.A03
            X.1zl r11 = new X.1zl
            r34 = 640(0x280, float:8.97E-43)
            r35 = 5000000(0x4c4b40, float:7.006492E-39)
            r27 = r11
            r28 = r1
            r29 = r12
            r30 = r5
            r31 = r0
            r32 = r14
            r33 = r9
            r36 = r2
            r38 = r22
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r38)
            r7.A01(r11)
            X.3Bj r0 = r7.A02
            if (r0 == 0) goto L_0x00ce
            r24 = 1
            r11.A06 = r0
        L_0x00ce:
            long r19 = r14.length()
            java.lang.Long r0 = java.lang.Long.valueOf(r19)
            r6.A0J = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r24)
            r6.A00 = r0
            X.01D r0 = r10.A01
            java.lang.Object r5 = r0.get()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            java.lang.String r1 = "video_transcode_saved_local_config"
            r0 = 0
            java.lang.String r0 = r5.getString(r1, r0)
            if (r0 == 0) goto L_0x00fe
            X.4aF r0 = X.C88284aF.A00(r0)
        L_0x00f4:
            r11.A03 = r0
            com.facebook.redex.IDxListenerShape345S0100000_2_I0 r0 = new com.facebook.redex.IDxListenerShape345S0100000_2_I0
            r0.<init>(r7, r4)
            r11.A04 = r0
            goto L_0x0100
        L_0x00fe:
            r0 = 0
            goto L_0x00f4
        L_0x0100:
            X.0zN r0 = r8.A08     // Catch:{ Exception -> 0x010e }
            java.io.File r0 = r0.A00()     // Catch:{ Exception -> 0x010e }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ Exception -> 0x010e }
            com.whatsapp.VideoFrameConverter.setLogFilePath(r0)     // Catch:{ Exception -> 0x010e }
            goto L_0x0114
        L_0x010e:
            r1 = move-exception
            java.lang.String r0 = "mediatranscodequeue/Unable to create crash in video sentinel file"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0114:
            if (r26 == 0) goto L_0x0119
            r26.acquire()     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
        L_0x0119:
            boolean r0 = r14.exists()     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            if (r0 == 0) goto L_0x0275
            X.1xA r13 = new X.1xA     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            r13.<init>(r14)     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            int r0 = X.C43291zl.A01(r16)     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            java.lang.String r18 = "mediatranscodequeue/gif/trim"
            java.lang.String r17 = "mediatranscodequeue/gif/apply-gif-tag-only"
            if (r0 != r4) goto L_0x01ba
            int r1 = r13.A03     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            int r0 = r13.A01     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            if (r1 < r0) goto L_0x0174
            int r12 = r0 * 640
            int r12 = r12 / r1
            r10 = 640(0x280, float:8.97E-43)
        L_0x0139:
            long r4 = X.C17970vw.A04(r14)     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r0
            if (r24 != 0) goto L_0x0190
            r0 = r41
            X.0s5 r1 = r0.A02     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            int r0 = r1.A02(r15)     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            long r0 = (long) r0     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            r15 = 1048576(0x100000, double:5.180654E-318)
            long r0 = r0 * r15
            int r15 = (r19 > r0 ? 1 : (r19 == r0 ? 0 : -1))
            if (r15 > 0) goto L_0x0190
            r0 = r41
            X.1QS r0 = r0.A06     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            boolean r0 = r0.A0E(r14)     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0190
            r15 = r41
            r0 = r19
            boolean r0 = r15.A07(r0, r4)     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            if (r0 != 0) goto L_0x0190
            r1 = 13
            r0 = r21
            boolean r0 = X.AnonymousClass1QT.A05(r0, r13, r1)     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            if (r0 != 0) goto L_0x0190
            goto L_0x017a
        L_0x0174:
            r12 = 640(0x280, float:8.97E-43)
            int r10 = r1 * 640
            int r10 = r10 / r0
            goto L_0x0139
        L_0x017a:
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0185
            int r0 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0185
            goto L_0x01c8
        L_0x0185:
            com.whatsapp.util.Log.i((java.lang.String) r17)     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            X.0sb r0 = r8.A02     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            X.0tB r0 = r0.A04     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            X.AnonymousClass1XI.A0B(r0, r14, r9)     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            goto L_0x01df
        L_0x0190:
            java.lang.String r0 = "mediatranscodequeue/gif/transcode"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            int r0 = r10 * r12
            float r0 = (float) r0     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            r1 = 1209401344(0x48160000, float:153600.0)
            float r1 = r1 / r0
            r0 = 1092616192(0x41200000, float:10.0)
            float r1 = java.lang.Math.min(r0, r1)     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            r0 = 1073741824(0x40000000, float:2.0)
            float r0 = java.lang.Math.max(r0, r1)     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            r11.A00 = r0     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            java.lang.String r0 = "transcode"
            r6.A0P = r0     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            r11.A0A()     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            r0 = r42
            r0.A03(r13)     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            r0.A02(r10, r12)     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            goto L_0x01d3
        L_0x01ba:
            boolean r0 = r13.A08     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            if (r0 != 0) goto L_0x026d
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x01d5
            int r0 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x01d5
        L_0x01c8:
            com.whatsapp.util.Log.i((java.lang.String) r18)     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            java.lang.String r0 = "trim"
            r6.A0P = r0     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            r11.A0B()     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
        L_0x01d3:
            r4 = 0
            goto L_0x01e0
        L_0x01d5:
            com.whatsapp.util.Log.i((java.lang.String) r17)     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            X.0sb r0 = r8.A02     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            X.0tB r0 = r0.A04     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            X.AnonymousClass1XI.A0B(r0, r14, r9)     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
        L_0x01df:
            r4 = 1
        L_0x01e0:
            boolean r0 = r11.A0K     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            if (r0 != 0) goto L_0x020e
            com.whatsapp.Mp4Ops r1 = r8.A03     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            r0 = r40
            com.whatsapp.Mp4Ops.A00(r0, r9)     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            if (r4 == 0) goto L_0x01f7
            r1.A04(r9)     // Catch:{ 20O -> 0x01f1, IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285 }
            goto L_0x01f3
        L_0x01f1:
            r0 = move-exception
            throw r0     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
        L_0x01f3:
            java.lang.String r0 = "checkAndRepair"
            r6.A0P = r0     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
        L_0x01f7:
            r0 = r40
            com.whatsapp.GifHelper.A00(r0, r9)     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            X.1QS r0 = r8.A0D     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            boolean r0 = r0.A0E(r9)     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            if (r0 == 0) goto L_0x0205
            goto L_0x0214
        L_0x0205:
            java.lang.String r1 = "video was not transcoded correctly"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            r0.<init>(r1)     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            throw r0     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
        L_0x020e:
            java.lang.String r0 = "cancel"
            r6.A0O = r0     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            r1 = 0
            goto L_0x0215
        L_0x0214:
            r1 = 1
        L_0x0215:
            r0 = 0
            com.whatsapp.VideoFrameConverter.setLogFilePath(r0)
            if (r26 == 0) goto L_0x0224
            boolean r0 = r26.isHeld()
            if (r0 == 0) goto L_0x0224
            r26.release()
        L_0x0224:
            X.0zN r0 = r8.A08
            r0.A01()
            if (r1 == 0) goto L_0x0078
            r7 = 0
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x0262
            if (r24 != 0) goto L_0x0262
            r4 = 0
        L_0x0234:
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x023f
            if (r4 != 0) goto L_0x023f
            java.lang.String r0 = "mediatranscodequeue/could not get video thumb"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x023f:
            int r2 = X.C17970vw.A03(r9)
            long r0 = (long) r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A05 = r0
            long r0 = r9.length()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A07 = r0
            r42.A01()
            r0 = r25
            r0.A00 = r2
            r0.A00 = r9
            r0.A03 = r4
            r1 = 1
            goto L_0x007c
        L_0x0262:
            android.graphics.Bitmap r1 = X.C18830xK.A01(r9)
            r0 = 100
            byte[] r4 = X.C18830xK.A03(r1, r0)
            goto L_0x0234
        L_0x026d:
            java.lang.String r1 = "cannot transcode gif"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            r0.<init>(r1)     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            throw r0     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
        L_0x0275:
            java.lang.String r0 = "mediatranscodequeue/file not found"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            java.lang.String r1 = "transcode input file does not exist"
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            r0.<init>(r1)     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
            throw r0     // Catch:{ IllegalStateException -> 0x0308, IllegalArgumentException -> 0x0306, 1xB -> 0x02da, FileNotFoundException -> 0x02b9, IOException -> 0x0285, 20O -> 0x0283 }
        L_0x0283:
            r2 = move-exception
            goto L_0x02e3
        L_0x0285:
            r2 = move-exception
            java.lang.String r0 = "mediatranscodequeue/ioexception"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x035c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x035c }
            r1.<init>()     // Catch:{ all -> 0x035c }
            java.lang.String r0 = "IOException: "
            r1.append(r0)     // Catch:{ all -> 0x035c }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x035c }
            r1.append(r0)     // Catch:{ all -> 0x035c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x035c }
            r6.A0O = r0     // Catch:{ all -> 0x035c }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x035c }
            if (r0 == 0) goto L_0x0346
            java.lang.String r1 = r2.getMessage()     // Catch:{ all -> 0x035c }
            java.lang.String r0 = "No space"
            boolean r1 = r1.contains(r0)     // Catch:{ all -> 0x035c }
            r0 = 2131888210(0x7f120852, float:1.9411049E38)
            if (r1 != 0) goto L_0x0343
            goto L_0x0346
        L_0x02b9:
            r2 = move-exception
            java.lang.String r0 = "mediatranscodequeue/filenotfound"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x035c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x035c }
            r1.<init>()     // Catch:{ all -> 0x035c }
            java.lang.String r0 = "FileNotFoundException: "
            r1.append(r0)     // Catch:{ all -> 0x035c }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x035c }
            r1.append(r0)     // Catch:{ all -> 0x035c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x035c }
            r6.A0O = r0     // Catch:{ all -> 0x035c }
            r0 = 2131888199(0x7f120847, float:1.9411027E38)
            goto L_0x0343
        L_0x02da:
            r1 = move-exception
            java.lang.String r0 = "mediatranscodequeue/bad video"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x035c }
            java.lang.String r0 = "BadVideoException"
            goto L_0x0300
        L_0x02e3:
            java.lang.String r0 = "mediatranscodequeue/libmp4muxexception"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x035c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x035c }
            r1.<init>()     // Catch:{ all -> 0x035c }
            java.lang.String r0 = "Mp4OpsFail ("
            r1.append(r0)     // Catch:{ all -> 0x035c }
            int r0 = r2.errorCode     // Catch:{ all -> 0x035c }
            r1.append(r0)     // Catch:{ all -> 0x035c }
            java.lang.String r0 = ")"
            r1.append(r0)     // Catch:{ all -> 0x035c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x035c }
        L_0x0300:
            r6.A0O = r0     // Catch:{ all -> 0x035c }
            r0 = 2131888185(0x7f120839, float:1.9410998E38)
            goto L_0x0343
        L_0x0306:
            r2 = move-exception
            goto L_0x0324
        L_0x0308:
            r2 = move-exception
            java.lang.String r0 = "mediatranscodequeue/illegalstate"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x035c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x035c }
            r1.<init>()     // Catch:{ all -> 0x035c }
            java.lang.String r0 = "IllegalStateException: "
            r1.append(r0)     // Catch:{ all -> 0x035c }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x035c }
            r1.append(r0)     // Catch:{ all -> 0x035c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x035c }
            goto L_0x033e
        L_0x0324:
            java.lang.String r0 = "mediatranscodequeue/illegalargument"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x035c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x035c }
            r1.<init>()     // Catch:{ all -> 0x035c }
            java.lang.String r0 = "IllegalArgumentException: "
            r1.append(r0)     // Catch:{ all -> 0x035c }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x035c }
            r1.append(r0)     // Catch:{ all -> 0x035c }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x035c }
        L_0x033e:
            r6.A0O = r0     // Catch:{ all -> 0x035c }
            r0 = 2131888218(0x7f12085a, float:1.9411065E38)
        L_0x0343:
            r7.A00(r0)     // Catch:{ all -> 0x035c }
        L_0x0346:
            r0 = 0
            com.whatsapp.VideoFrameConverter.setLogFilePath(r0)
            if (r26 == 0) goto L_0x0355
            boolean r0 = r26.isHeld()
            if (r0 == 0) goto L_0x0355
            r26.release()
        L_0x0355:
            X.0zN r0 = r8.A08
            r0.A01()
            goto L_0x0078
        L_0x035c:
            r1 = move-exception
            r0 = 0
            com.whatsapp.VideoFrameConverter.setLogFilePath(r0)
            if (r26 == 0) goto L_0x036c
            boolean r0 = r26.isHeld()
            if (r0 == 0) goto L_0x036c
            r26.release()
        L_0x036c:
            X.0zN r0 = r8.A08
            r0.A01()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C43401zw.A01():X.21C");
    }
}
