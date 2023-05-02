package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1a9  reason: invalid class name and case insensitive filesystem */
public class C29171a9 {
    public AnonymousClass1CK A00;
    public boolean A01;
    public boolean A02 = true;
    public final int A03;
    public final C29181aA A04;
    public final C48732Ou A05;
    public final AnonymousClass2I6 A06;
    public final File A07;
    public final RandomAccessFile A08;
    public final boolean A09;

    /* JADX WARNING: type inference failed for: r0v6, types: [X.1aA] */
    /* JADX WARNING: type inference failed for: r14v7, types: [X.2P1] */
    /* JADX WARNING: type inference failed for: r14v8, types: [X.2Ow] */
    /* JADX WARNING: type inference failed for: r14v9, types: [X.2Ov] */
    /* JADX WARNING: Code restructure failed: missing block: B:101:?, code lost:
        r3 = new java.lang.StringBuilder("wambuffer/header/init: header=");
        r3.append(r8);
        r3.append(" bufferCount=");
        r3.append(r14);
        r3.append(" maxMetadataSize=");
        r3.append(r11);
        r3.append(" maxEventBufferSize=");
        r3.append(r10);
        r3.append(" currentEventBufferIndex=");
        r3.append(r1);
        r3.append(" currentEventBufferIndex=");
        r3.append(r1);
        r3.append(" currentBufferSequenceNumber=");
        r3.append(r7.A00);
        r3.append(" isEventBeaconingEnabled=");
        r3.append(r7.A04);
        r3.append(" dayOfLastBeaconingDecision=");
        r3.append(r7.A03);
        r3.append(" currentEventSequenceNumber=");
        r3.append(r7.A02);
        com.whatsapp.util.Log.i(r3.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0299, code lost:
        if (r2 >= r15) goto L_0x02e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x029b, code lost:
        r7 = r19[r2];
        r3 = new java.lang.StringBuilder("wambuffer/header/init/eventBufferMetadata/");
        r3.append(r2);
        r3.append(": size=");
        r3.append(r7.A01);
        r3.append(" timestamp=");
        r3.append(r7.A04);
        r3.append(" streamId=");
        r3.append(r7.A02);
        r3.append(" bufferSequenceNumber=");
        r3.append(r7.A00);
        r3.append(" checksum=");
        r3.append(r7.A03);
        com.whatsapp.util.Log.i(r3.toString());
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r6.A04.AI9();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02e9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:?, code lost:
        r1 = new X.C48762Ox("Invalid current event buffer");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02f2, code lost:
        r1 = new X.C48762Ox("Invalid max event buffer size");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02fa, code lost:
        r1 = new X.C48762Ox("Invalid max metadata size");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0302, code lost:
        r1 = new X.C48762Ox("Invalid WAM file magic or version");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x030a, code lost:
        r1 = new X.C48762Ox("Invalid event buffer size");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0311, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x031d, code lost:
        r1 = r9.A09;
        r1.A05 = java.lang.Boolean.TRUE;
        r1.A09();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x032d, code lost:
        throw new X.C48762Ox("Invalid checksum");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0335, code lost:
        throw new java.lang.IllegalArgumentException("Given range contains invalid bytes");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0348, code lost:
        throw new X.C48762Ox("Event buffer downgrade not allowed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x037e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:?, code lost:
        r0 = r6.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0381, code lost:
        if (r0 != 0) goto L_0x0383;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0383, code lost:
        if (r0 != 1) goto L_0x0385;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0385, code lost:
        r2 = r6.A00;
        r1 = r2.A0K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0389, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x038a, code lost:
        if (r1 != null) goto L_0x038c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:?, code lost:
        r0 = r2.A0O;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x038e, code lost:
        if (r0 == null) goto L_0x0390;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0390, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0393, code lost:
        r7 = r0.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0397, code lost:
        r2.A0O = java.lang.Long.valueOf(r7 + r1.longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:?, code lost:
        r2 = r6.A00;
        r1 = r2.A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x03a7, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x03a8, code lost:
        if (r1 != null) goto L_0x03aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:?, code lost:
        r0 = r2.A0Q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x03ac, code lost:
        if (r0 == null) goto L_0x03ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x03ae, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03b1, code lost:
        r7 = r0.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x03b5, code lost:
        r2.A0Q = java.lang.Long.valueOf(r7 + r1.longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:?, code lost:
        r2 = r6.A00;
        r1 = r2.A0J;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03c5, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03c6, code lost:
        if (r1 != null) goto L_0x03c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:?, code lost:
        r0 = r2.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03ca, code lost:
        if (r0 == null) goto L_0x03cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03cc, code lost:
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03cf, code lost:
        r7 = r0.longValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03d3, code lost:
        r2.A0M = java.lang.Long.valueOf(r7 + r1.longValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03df, code lost:
        r2.A09();
        r6.A04.AIL();
        r7 = r6.A06;
        r7.A01 = 0;
        r7.A00 = 0;
        r7.A04 = false;
        r7.A03 = 0;
        r7.A02 = 0;
        r6.A04.A6B();
        r2 = r6.A05;
        r2.A03 = X.C48722Ot.A00(r2.A06);
        r2.A01 = android.support.v4.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED;
        r2.A02 = 0;
        r2.A07.A02();
        r0 = r2.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0414, code lost:
        if (r0 != 0) goto L_0x0416;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0416, code lost:
        if (r0 == 1) goto L_0x0418;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0418, code lost:
        r1 = 16384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x041b, code lost:
        r1 = 32768;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0420, code lost:
        if (r2.A0A != false) goto L_0x0422;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0422, code lost:
        r1 = android.support.v4.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0431, code lost:
        r2.A00 = r1;
        r1 = new java.lang.StringBuilder();
        r1.append("wambuffer/wambuffer: error while opening WAM file (");
        r1.append(r3);
        r1.append(")");
        com.whatsapp.util.Log.e(r1.toString());
        r22.A0C = java.lang.Boolean.TRUE;
        r22.A09();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0482, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fd, code lost:
        if (r8 != 0) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ff, code lost:
        r14 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r7.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        r14 = r7.getInt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010a, code lost:
        r7 = r9.A08;
        r0 = r7.A05;
        r19 = r0;
        r15 = r0.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0111, code lost:
        if (r14 > r15) goto L_0x0341;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0113, code lost:
        r9.A01(r8, r14);
        r20 = r1.A05;
        r18 = r20.position();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        r1.A04(r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        r13 = r1.A01();
        r0 = new byte[X.C48722Ot.A00(r8).length];
        r9.A03 = r0;
        r13.get(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0134, code lost:
        if (r8 != 0) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0136, code lost:
        r11 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0138, code lost:
        r13.order(java.nio.ByteOrder.LITTLE_ENDIAN);
        r11 = r13.getInt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0141, code lost:
        r10 = java.nio.ByteOrder.LITTLE_ENDIAN;
        r13.order(r10);
        r9.A01 = r13.getInt();
        r13.order(r10);
        r9.A00 = r13.getInt();
        r13.order(r10);
        r0 = r13.getInt();
        r7.A01 = r0;
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x015f, code lost:
        if (r0 < r11) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0161, code lost:
        r7.A01 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0163, code lost:
        if (r8 < 2) goto L_0x0187;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0165, code lost:
        r13.order(r10);
        r7.A00 = r13.getInt();
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0173, code lost:
        if (r13.get() == 1) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0175, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0176, code lost:
        r7.A04 = r0;
        r7.A03 = X.C48732Ou.A00(r13);
        r13.order(r10);
        r7.A02 = r13.getInt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0187, code lost:
        if (r3 >= r11) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0189, code lost:
        if (r3 >= r15) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x018b, code lost:
        r2 = r19[r3];
        r13.order(r10);
        r2.A01 = r13.getInt();
        r2.A04 = X.C48732Ou.A00(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x019e, code lost:
        if (r8 < 2) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01a0, code lost:
        r13.order(r10);
        r2.A02 = r13.getInt();
        r13.order(r10);
        r2.A00 = r13.getInt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x01b2, code lost:
        r2.A03 = X.C48732Ou.A00(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01bb, code lost:
        r13.order(r10);
        r13.getInt();
        X.C48732Ou.A00(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01c4, code lost:
        if (r8 < 2) goto L_0x01d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01c6, code lost:
        r13.order(r10);
        r13.getInt();
        r13.order(r10);
        r13.getInt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01d2, code lost:
        X.C48732Ou.A00(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01d5, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01d8, code lost:
        r9.A02 = X.C48732Ou.A00(r13);
        r3 = r18 - 4;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01e5, code lost:
        if (r3 > r20.position()) goto L_0x032e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01e7, code lost:
        r1 = new java.util.zip.Adler32();
        r1.update(r20.array(), 0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01fb, code lost:
        if (r9.A02 != r1.getValue()) goto L_0x031d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0207, code lost:
        if (java.util.Arrays.equals(r9.A03, X.C48722Ot.A00(r8)) == false) goto L_0x0302;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0209, code lost:
        r11 = r9.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x020d, code lost:
        if (r11 != 65536) goto L_0x02fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x020f, code lost:
        r10 = r9.A00;
        r0 = r9.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0213, code lost:
        if (r0 == 0) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0215, code lost:
        if (r0 != 1) goto L_0x021a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0217, code lost:
        r1 = 16384;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x021a, code lost:
        r1 = 32768;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x021f, code lost:
        if (r9.A0A == false) goto L_0x0223;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0221, code lost:
        r1 = android.support.v4.view.accessibility.AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0223, code lost:
        if (r10 != r1) goto L_0x02f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0225, code lost:
        r1 = r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0227, code lost:
        if (r1 < 0) goto L_0x02ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x022b, code lost:
        if (r1 >= r9.A05) goto L_0x02ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x022d, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x022e, code lost:
        if (r3 >= r15) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0234, code lost:
        if (r19[r3].A01 > r10) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0236, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C29171a9(X.C15860rz r24, X.AnonymousClass1CI r25, X.AnonymousClass1CK r26, java.io.File r27, int r28, int r29, int r30, boolean r31, boolean r32) {
        /*
            r23 = this;
            r6 = r23
            r6.<init>()
            r5 = 1
            r6.A02 = r5
            r2 = r27
            r2.getAbsolutePath()
            boolean r8 = r2.isFile()
            r1 = r32
            r6.A09 = r1
            r22 = r26
            r0 = r22
            r6.A00 = r0
            java.lang.String r0 = "rwd"
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0026 }
            r4.<init>(r2, r0)     // Catch:{ IOException -> 0x0026 }
            r6.A02 = r5     // Catch:{ IOException -> 0x0026 }
            goto L_0x0044
        L_0x0026:
            r7 = move-exception
            r4 = 0
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0 = r22
            r0.A0A = r3
            if (r8 != 0) goto L_0x0032
            r0.A08 = r3
        L_0x0032:
            r22.A09()
            java.lang.String r0 = "wambuffer/newwamfile: cannot open or create persistent WAM file; running in volatile mode"
            com.whatsapp.util.Log.e(r0, r7)
            java.lang.String r0 = "wambuffer: PERSISTENCE TURNED OFF"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            r6.A02 = r0
        L_0x0044:
            r6.A07 = r2
            r6.A08 = r4
            r7 = r30
            r6.A03 = r7
            X.2I6 r3 = new X.2I6
            r21 = r29
            r0 = r21
            r3.<init>(r0, r7)
            r6.A06 = r3
            X.2Ou r9 = new X.2Ou
            r13 = r28
            r10 = r3
            r11 = r22
            r12 = r4
            r14 = r0
            r15 = r7
            r16 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r6.A05 = r9
            r0 = 2
            if (r7 == r5) goto L_0x006d
            if (r7 != r0) goto L_0x0077
        L_0x006d:
            if (r31 != 0) goto L_0x0077
            java.lang.String r1 = "Only optimal buffer should be used for real time or private stats events"
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r1)
            throw r0
        L_0x0077:
            if (r32 == 0) goto L_0x00a3
            if (r7 != r0) goto L_0x00a3
            java.lang.String r2 = r2.getAbsolutePath()
            char r0 = java.io.File.separatorChar
            int r0 = r2.lastIndexOf(r0)
            r1 = 0
            int r0 = r0 + 1
            java.lang.String r20 = r2.substring(r1, r0)
            X.2Ov r0 = new X.2Ov
            r15 = r24
            r16 = r25
            r14 = r0
            r17 = r3
            r18 = r11
            r19 = r4
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r6.A04 = r0
        L_0x009e:
            if (r8 == 0) goto L_0x0425
            if (r4 == 0) goto L_0x0425
            goto L_0x00c9
        L_0x00a3:
            if (r31 == 0) goto L_0x00b7
            X.2Ow r0 = new X.2Ow
            r14 = r0
            r15 = r3
            r16 = r11
            r17 = r4
            r18 = r21
            r19 = r7
            r14.<init>(r15, r16, r17, r18, r19)
            r6.A04 = r0
            goto L_0x009e
        L_0x00b7:
            X.2P1 r0 = new X.2P1
            r14 = r0
            r15 = r3
            r16 = r11
            r17 = r4
            r18 = r21
            r19 = r7
            r14.<init>(r15, r16, r17, r18, r19)
            r6.A04 = r0
            goto L_0x009e
        L_0x00c9:
            r0 = r21
            r6.A04(r4, r0)     // Catch:{ 2Oy -> 0x0485 }
            X.2Ou r9 = r6.A05     // Catch:{ 2Ox -> 0x0373 }
            byte[] r0 = X.C48722Ot.A00(r13)     // Catch:{ 2Ox -> 0x0373 }
            int r2 = r0.length     // Catch:{ 2Ox -> 0x0373 }
            byte[] r0 = new byte[r2]     // Catch:{ 2Ox -> 0x0373 }
            r9.A03 = r0     // Catch:{ 2Ox -> 0x0373 }
            X.02I r1 = r9.A07     // Catch:{ IOException -> 0x0368 }
            int r0 = r2 + 4
            r1.A04(r0)     // Catch:{ IOException -> 0x0368 }
            java.nio.ByteBuffer r7 = r1.A01()     // Catch:{ 2Ox -> 0x0373 }
            byte[] r0 = r9.A03     // Catch:{ 2Ox -> 0x0373 }
            r7.get(r0)     // Catch:{ 2Ox -> 0x0373 }
            byte[] r3 = r9.A03     // Catch:{ Exception -> 0x035d }
            r8 = 0
        L_0x00ec:
            byte[][] r2 = X.C48722Ot.A00     // Catch:{ Exception -> 0x035d }
            int r0 = r2.length     // Catch:{ Exception -> 0x035d }
            if (r8 >= r0) goto L_0x0349
            r0 = r2[r8]     // Catch:{ Exception -> 0x035d }
            boolean r0 = java.util.Arrays.equals(r3, r0)     // Catch:{ Exception -> 0x035d }
            if (r0 == 0) goto L_0x00fa
            goto L_0x00fd
        L_0x00fa:
            int r8 = r8 + 1
            goto L_0x00ec
        L_0x00fd:
            if (r8 != 0) goto L_0x0101
            r14 = 2
            goto L_0x010a
        L_0x0101:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ 2Ox -> 0x0373 }
            r7.order(r0)     // Catch:{ 2Ox -> 0x0373 }
            int r14 = r7.getInt()     // Catch:{ 2Ox -> 0x0373 }
        L_0x010a:
            X.2I6 r7 = r9.A08     // Catch:{ 2Ox -> 0x0373 }
            X.2I7[] r0 = r7.A05     // Catch:{ 2Ox -> 0x0373 }
            r19 = r0
            int r15 = r0.length     // Catch:{ 2Ox -> 0x0373 }
            if (r14 > r15) goto L_0x0341
            r9.A01(r8, r14)     // Catch:{ 2Ox -> 0x0373 }
            java.nio.ByteBuffer r0 = r1.A05     // Catch:{ 2Ox -> 0x0373 }
            r20 = r0
            int r18 = r20.position()     // Catch:{ 2Ox -> 0x0373 }
            r0 = r18
            r1.A04(r0)     // Catch:{ IOException -> 0x0336 }
            java.nio.ByteBuffer r13 = r1.A01()     // Catch:{ 2Ox -> 0x0373 }
            byte[] r0 = X.C48722Ot.A00(r8)     // Catch:{ 2Ox -> 0x0373 }
            int r0 = r0.length     // Catch:{ 2Ox -> 0x0373 }
            byte[] r0 = new byte[r0]     // Catch:{ 2Ox -> 0x0373 }
            r9.A03 = r0     // Catch:{ 2Ox -> 0x0373 }
            r13.get(r0)     // Catch:{ 2Ox -> 0x0373 }
            r12 = 2
            if (r8 != 0) goto L_0x0138
            r11 = 2
            goto L_0x0141
        L_0x0138:
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ 2Ox -> 0x0373 }
            r13.order(r0)     // Catch:{ 2Ox -> 0x0373 }
            int r11 = r13.getInt()     // Catch:{ 2Ox -> 0x0373 }
        L_0x0141:
            java.nio.ByteOrder r10 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch:{ 2Ox -> 0x0373 }
            r13.order(r10)     // Catch:{ 2Ox -> 0x0373 }
            int r0 = r13.getInt()     // Catch:{ 2Ox -> 0x0373 }
            r9.A01 = r0     // Catch:{ 2Ox -> 0x0373 }
            r13.order(r10)     // Catch:{ 2Ox -> 0x0373 }
            int r0 = r13.getInt()     // Catch:{ 2Ox -> 0x0373 }
            r9.A00 = r0     // Catch:{ 2Ox -> 0x0373 }
            r13.order(r10)     // Catch:{ 2Ox -> 0x0373 }
            int r0 = r13.getInt()     // Catch:{ 2Ox -> 0x0373 }
            r7.A01 = r0     // Catch:{ 2Ox -> 0x0373 }
            r3 = 0
            if (r0 < r11) goto L_0x0163
            r7.A01 = r3     // Catch:{ 2Ox -> 0x0373 }
        L_0x0163:
            if (r8 < r12) goto L_0x0187
            r13.order(r10)     // Catch:{ 2Ox -> 0x0373 }
            int r0 = r13.getInt()     // Catch:{ 2Ox -> 0x0373 }
            r7.A00 = r0     // Catch:{ 2Ox -> 0x0373 }
            byte r1 = r13.get()     // Catch:{ 2Ox -> 0x0373 }
            r0 = 1
            if (r1 == r5) goto L_0x0176
            r0 = 0
        L_0x0176:
            r7.A04 = r0     // Catch:{ 2Ox -> 0x0373 }
            long r0 = X.C48732Ou.A00(r13)     // Catch:{ 2Ox -> 0x0373 }
            r7.A03 = r0     // Catch:{ 2Ox -> 0x0373 }
            r13.order(r10)     // Catch:{ 2Ox -> 0x0373 }
            int r0 = r13.getInt()     // Catch:{ 2Ox -> 0x0373 }
            r7.A02 = r0     // Catch:{ 2Ox -> 0x0373 }
        L_0x0187:
            if (r3 >= r11) goto L_0x01d8
            if (r3 >= r15) goto L_0x01bb
            r2 = r19[r3]     // Catch:{ 2Ox -> 0x0373 }
            r13.order(r10)     // Catch:{ 2Ox -> 0x0373 }
            int r0 = r13.getInt()     // Catch:{ 2Ox -> 0x0373 }
            r2.A01 = r0     // Catch:{ 2Ox -> 0x0373 }
            long r16 = X.C48732Ou.A00(r13)     // Catch:{ 2Ox -> 0x0373 }
            r0 = r16
            r2.A04 = r0     // Catch:{ 2Ox -> 0x0373 }
            if (r8 < r12) goto L_0x01b2
            r13.order(r10)     // Catch:{ 2Ox -> 0x0373 }
            int r0 = r13.getInt()     // Catch:{ 2Ox -> 0x0373 }
            r2.A02 = r0     // Catch:{ 2Ox -> 0x0373 }
            r13.order(r10)     // Catch:{ 2Ox -> 0x0373 }
            int r0 = r13.getInt()     // Catch:{ 2Ox -> 0x0373 }
            r2.A00 = r0     // Catch:{ 2Ox -> 0x0373 }
        L_0x01b2:
            long r16 = X.C48732Ou.A00(r13)     // Catch:{ 2Ox -> 0x0373 }
            r0 = r16
            r2.A03 = r0     // Catch:{ 2Ox -> 0x0373 }
            goto L_0x01d5
        L_0x01bb:
            r13.order(r10)     // Catch:{ 2Ox -> 0x0373 }
            r13.getInt()     // Catch:{ 2Ox -> 0x0373 }
            X.C48732Ou.A00(r13)     // Catch:{ 2Ox -> 0x0373 }
            if (r8 < r12) goto L_0x01d2
            r13.order(r10)     // Catch:{ 2Ox -> 0x0373 }
            r13.getInt()     // Catch:{ 2Ox -> 0x0373 }
            r13.order(r10)     // Catch:{ 2Ox -> 0x0373 }
            r13.getInt()     // Catch:{ 2Ox -> 0x0373 }
        L_0x01d2:
            X.C48732Ou.A00(r13)     // Catch:{ 2Ox -> 0x0373 }
        L_0x01d5:
            int r3 = r3 + 1
            goto L_0x0187
        L_0x01d8:
            long r0 = X.C48732Ou.A00(r13)     // Catch:{ 2Ox -> 0x0373 }
            r9.A02 = r0     // Catch:{ 2Ox -> 0x0373 }
            int r3 = r18 + -4
            r2 = 0
            int r0 = r20.position()     // Catch:{ 2Ox -> 0x0373 }
            if (r3 > r0) goto L_0x032e
            java.util.zip.Adler32 r1 = new java.util.zip.Adler32     // Catch:{ 2Ox -> 0x0373 }
            r1.<init>()     // Catch:{ 2Ox -> 0x0373 }
            byte[] r0 = r20.array()     // Catch:{ 2Ox -> 0x0373 }
            r1.update(r0, r2, r3)     // Catch:{ 2Ox -> 0x0373 }
            long r10 = r1.getValue()     // Catch:{ 2Ox -> 0x0373 }
            long r0 = r9.A02     // Catch:{ 2Ox -> 0x0373 }
            int r3 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r3 != 0) goto L_0x031d
            byte[] r1 = r9.A03     // Catch:{ 2Ox -> 0x0312 }
            byte[] r0 = X.C48722Ot.A00(r8)     // Catch:{ 2Ox -> 0x0312 }
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ 2Ox -> 0x0312 }
            if (r0 == 0) goto L_0x0302
            int r11 = r9.A01     // Catch:{ 2Ox -> 0x0312 }
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r11 != r0) goto L_0x02fa
            int r10 = r9.A00     // Catch:{ 2Ox -> 0x0312 }
            int r0 = r9.A04     // Catch:{ 2Ox -> 0x0312 }
            if (r0 == 0) goto L_0x0221
            if (r0 != r5) goto L_0x021a
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0223
        L_0x021a:
            boolean r0 = r9.A0A     // Catch:{ 2Ox -> 0x0312 }
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r0 == 0) goto L_0x0223
        L_0x0221:
            r1 = 65536(0x10000, float:9.18355E-41)
        L_0x0223:
            if (r10 != r1) goto L_0x02f2
            int r1 = r7.A01     // Catch:{ 2Ox -> 0x0312 }
            if (r1 < 0) goto L_0x02ea
            int r0 = r9.A05     // Catch:{ 2Ox -> 0x0312 }
            if (r1 >= r0) goto L_0x02ea
            r3 = 0
        L_0x022e:
            if (r3 >= r15) goto L_0x0239
            r0 = r19[r3]     // Catch:{ 2Ox -> 0x0312 }
            int r0 = r0.A01     // Catch:{ 2Ox -> 0x0312 }
            if (r0 > r10) goto L_0x030a
            int r3 = r3 + 1
            goto L_0x022e
        L_0x0239:
            java.lang.String r0 = "wambuffer/header/init: header="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ 2Ox -> 0x0373 }
            r3.<init>(r0)     // Catch:{ 2Ox -> 0x0373 }
            r3.append(r8)     // Catch:{ 2Ox -> 0x0373 }
            java.lang.String r0 = " bufferCount="
            r3.append(r0)     // Catch:{ 2Ox -> 0x0373 }
            r3.append(r14)     // Catch:{ 2Ox -> 0x0373 }
            java.lang.String r0 = " maxMetadataSize="
            r3.append(r0)     // Catch:{ 2Ox -> 0x0373 }
            r3.append(r11)     // Catch:{ 2Ox -> 0x0373 }
            java.lang.String r0 = " maxEventBufferSize="
            r3.append(r0)     // Catch:{ 2Ox -> 0x0373 }
            r3.append(r10)     // Catch:{ 2Ox -> 0x0373 }
            java.lang.String r0 = " currentEventBufferIndex="
            r3.append(r0)     // Catch:{ 2Ox -> 0x0373 }
            r3.append(r1)     // Catch:{ 2Ox -> 0x0373 }
            r3.append(r0)     // Catch:{ 2Ox -> 0x0373 }
            r3.append(r1)     // Catch:{ 2Ox -> 0x0373 }
            java.lang.String r0 = " currentBufferSequenceNumber="
            r3.append(r0)     // Catch:{ 2Ox -> 0x0373 }
            int r0 = r7.A00     // Catch:{ 2Ox -> 0x0373 }
            r3.append(r0)     // Catch:{ 2Ox -> 0x0373 }
            java.lang.String r0 = " isEventBeaconingEnabled="
            r3.append(r0)     // Catch:{ 2Ox -> 0x0373 }
            boolean r0 = r7.A04     // Catch:{ 2Ox -> 0x0373 }
            r3.append(r0)     // Catch:{ 2Ox -> 0x0373 }
            java.lang.String r0 = " dayOfLastBeaconingDecision="
            r3.append(r0)     // Catch:{ 2Ox -> 0x0373 }
            long r0 = r7.A03     // Catch:{ 2Ox -> 0x0373 }
            r3.append(r0)     // Catch:{ 2Ox -> 0x0373 }
            java.lang.String r0 = " currentEventSequenceNumber="
            r3.append(r0)     // Catch:{ 2Ox -> 0x0373 }
            int r0 = r7.A02     // Catch:{ 2Ox -> 0x0373 }
            r3.append(r0)     // Catch:{ 2Ox -> 0x0373 }
            java.lang.String r0 = r3.toString()     // Catch:{ 2Ox -> 0x0373 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 2Ox -> 0x0373 }
        L_0x0299:
            if (r2 >= r15) goto L_0x02e4
            r7 = r19[r2]     // Catch:{ 2Ox -> 0x0373 }
            java.lang.String r0 = "wambuffer/header/init/eventBufferMetadata/"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ 2Ox -> 0x0373 }
            r3.<init>(r0)     // Catch:{ 2Ox -> 0x0373 }
            r3.append(r2)     // Catch:{ 2Ox -> 0x0373 }
            java.lang.String r0 = ": size="
            r3.append(r0)     // Catch:{ 2Ox -> 0x0373 }
            int r0 = r7.A01     // Catch:{ 2Ox -> 0x0373 }
            r3.append(r0)     // Catch:{ 2Ox -> 0x0373 }
            java.lang.String r0 = " timestamp="
            r3.append(r0)     // Catch:{ 2Ox -> 0x0373 }
            long r0 = r7.A04     // Catch:{ 2Ox -> 0x0373 }
            r3.append(r0)     // Catch:{ 2Ox -> 0x0373 }
            java.lang.String r0 = " streamId="
            r3.append(r0)     // Catch:{ 2Ox -> 0x0373 }
            int r0 = r7.A02     // Catch:{ 2Ox -> 0x0373 }
            r3.append(r0)     // Catch:{ 2Ox -> 0x0373 }
            java.lang.String r0 = " bufferSequenceNumber="
            r3.append(r0)     // Catch:{ 2Ox -> 0x0373 }
            int r0 = r7.A00     // Catch:{ 2Ox -> 0x0373 }
            r3.append(r0)     // Catch:{ 2Ox -> 0x0373 }
            java.lang.String r0 = " checksum="
            r3.append(r0)     // Catch:{ 2Ox -> 0x0373 }
            long r0 = r7.A03     // Catch:{ 2Ox -> 0x0373 }
            r3.append(r0)     // Catch:{ 2Ox -> 0x0373 }
            java.lang.String r0 = r3.toString()     // Catch:{ 2Ox -> 0x0373 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 2Ox -> 0x0373 }
            int r2 = r2 + 1
            goto L_0x0299
        L_0x02e4:
            X.1aA r0 = r6.A04     // Catch:{ 2Oy -> 0x037e }
            r0.AI9()     // Catch:{ 2Oy -> 0x037e }
            return
        L_0x02ea:
            java.lang.String r0 = "Invalid current event buffer"
            X.2Ox r1 = new X.2Ox     // Catch:{ 2Ox -> 0x0312 }
            r1.<init>(r0)     // Catch:{ 2Ox -> 0x0312 }
            goto L_0x0311
        L_0x02f2:
            java.lang.String r0 = "Invalid max event buffer size"
            X.2Ox r1 = new X.2Ox     // Catch:{ 2Ox -> 0x0312 }
            r1.<init>(r0)     // Catch:{ 2Ox -> 0x0312 }
            goto L_0x0311
        L_0x02fa:
            java.lang.String r0 = "Invalid max metadata size"
            X.2Ox r1 = new X.2Ox     // Catch:{ 2Ox -> 0x0312 }
            r1.<init>(r0)     // Catch:{ 2Ox -> 0x0312 }
            goto L_0x0311
        L_0x0302:
            java.lang.String r0 = "Invalid WAM file magic or version"
            X.2Ox r1 = new X.2Ox     // Catch:{ 2Ox -> 0x0312 }
            r1.<init>(r0)     // Catch:{ 2Ox -> 0x0312 }
            goto L_0x0311
        L_0x030a:
            java.lang.String r0 = "Invalid event buffer size"
            X.2Ox r1 = new X.2Ox     // Catch:{ 2Ox -> 0x0312 }
            r1.<init>(r0)     // Catch:{ 2Ox -> 0x0312 }
        L_0x0311:
            throw r1     // Catch:{ 2Ox -> 0x0312 }
        L_0x0312:
            r2 = move-exception
            X.1CK r1 = r9.A09     // Catch:{ 2Ox -> 0x0373 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ 2Ox -> 0x0373 }
            r1.A03 = r0     // Catch:{ 2Ox -> 0x0373 }
            r1.A09()     // Catch:{ 2Ox -> 0x0373 }
            throw r2     // Catch:{ 2Ox -> 0x0373 }
        L_0x031d:
            X.1CK r1 = r9.A09     // Catch:{ 2Ox -> 0x0373 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ 2Ox -> 0x0373 }
            r1.A05 = r0     // Catch:{ 2Ox -> 0x0373 }
            r1.A09()     // Catch:{ 2Ox -> 0x0373 }
            java.lang.String r1 = "Invalid checksum"
            X.2Ox r0 = new X.2Ox     // Catch:{ 2Ox -> 0x0373 }
            r0.<init>(r1)     // Catch:{ 2Ox -> 0x0373 }
            throw r0     // Catch:{ 2Ox -> 0x0373 }
        L_0x032e:
            java.lang.String r1 = "Given range contains invalid bytes"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ 2Ox -> 0x0373 }
            r0.<init>(r1)     // Catch:{ 2Ox -> 0x0373 }
            throw r0     // Catch:{ 2Ox -> 0x0373 }
        L_0x0336:
            r0 = move-exception
            java.lang.String r1 = r0.toString()     // Catch:{ 2Ox -> 0x0373 }
            X.2Ox r0 = new X.2Ox     // Catch:{ 2Ox -> 0x0373 }
            r0.<init>(r1)     // Catch:{ 2Ox -> 0x0373 }
            throw r0     // Catch:{ 2Ox -> 0x0373 }
        L_0x0341:
            java.lang.String r1 = "Event buffer downgrade not allowed"
            X.2Ox r0 = new X.2Ox     // Catch:{ 2Ox -> 0x0373 }
            r0.<init>(r1)     // Catch:{ 2Ox -> 0x0373 }
            throw r0     // Catch:{ 2Ox -> 0x0373 }
        L_0x0349:
            java.lang.String r1 = "Invalid value: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x035d }
            r0.<init>(r1)     // Catch:{ Exception -> 0x035d }
            r0.append(r3)     // Catch:{ Exception -> 0x035d }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x035d }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x035d }
            r0.<init>(r1)     // Catch:{ Exception -> 0x035d }
            throw r0     // Catch:{ Exception -> 0x035d }
        L_0x035d:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()     // Catch:{ 2Ox -> 0x0373 }
            X.2Ox r0 = new X.2Ox     // Catch:{ 2Ox -> 0x0373 }
            r0.<init>(r1)     // Catch:{ 2Ox -> 0x0373 }
            throw r0     // Catch:{ 2Ox -> 0x0373 }
        L_0x0368:
            r0 = move-exception
            java.lang.String r1 = r0.toString()     // Catch:{ 2Ox -> 0x0373 }
            X.2Ox r0 = new X.2Ox     // Catch:{ 2Ox -> 0x0373 }
            r0.<init>(r1)     // Catch:{ 2Ox -> 0x0373 }
            throw r0     // Catch:{ 2Ox -> 0x0373 }
        L_0x0373:
            r0 = move-exception
            java.lang.String r1 = r0.toString()     // Catch:{ 2Oy -> 0x037e }
            X.2Oy r0 = new X.2Oy     // Catch:{ 2Oy -> 0x037e }
            r0.<init>(r1)     // Catch:{ 2Oy -> 0x037e }
            throw r0     // Catch:{ 2Oy -> 0x037e }
        L_0x037e:
            r3 = move-exception
            int r0 = r6.A03     // Catch:{ 2Oy -> 0x0485 }
            if (r0 == 0) goto L_0x03c1
            if (r0 == r5) goto L_0x03a3
            X.1CK r2 = r6.A00     // Catch:{ 2Oy -> 0x0485 }
            java.lang.Long r1 = r2.A0K     // Catch:{ 2Oy -> 0x0485 }
            monitor-enter(r2)     // Catch:{ 2Oy -> 0x0485 }
            if (r1 == 0) goto L_0x03de
            java.lang.Long r0 = r2.A0O     // Catch:{ all -> 0x0482 }
            if (r0 != 0) goto L_0x0393
            r7 = 0
            goto L_0x0397
        L_0x0393:
            long r7 = r0.longValue()     // Catch:{ all -> 0x0482 }
        L_0x0397:
            long r0 = r1.longValue()     // Catch:{ all -> 0x0482 }
            long r7 = r7 + r0
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0482 }
            r2.A0O = r0     // Catch:{ all -> 0x0482 }
            goto L_0x03de
        L_0x03a3:
            X.1CK r2 = r6.A00     // Catch:{ 2Oy -> 0x0485 }
            java.lang.Long r1 = r2.A0L     // Catch:{ 2Oy -> 0x0485 }
            monitor-enter(r2)     // Catch:{ 2Oy -> 0x0485 }
            if (r1 == 0) goto L_0x03de
            java.lang.Long r0 = r2.A0Q     // Catch:{ all -> 0x0482 }
            if (r0 != 0) goto L_0x03b1
            r7 = 0
            goto L_0x03b5
        L_0x03b1:
            long r7 = r0.longValue()     // Catch:{ all -> 0x0482 }
        L_0x03b5:
            long r0 = r1.longValue()     // Catch:{ all -> 0x0482 }
            long r7 = r7 + r0
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0482 }
            r2.A0Q = r0     // Catch:{ all -> 0x0482 }
            goto L_0x03de
        L_0x03c1:
            X.1CK r2 = r6.A00     // Catch:{ 2Oy -> 0x0485 }
            java.lang.Long r1 = r2.A0J     // Catch:{ 2Oy -> 0x0485 }
            monitor-enter(r2)     // Catch:{ 2Oy -> 0x0485 }
            if (r1 == 0) goto L_0x03de
            java.lang.Long r0 = r2.A0M     // Catch:{ all -> 0x0482 }
            if (r0 != 0) goto L_0x03cf
            r7 = 0
            goto L_0x03d3
        L_0x03cf:
            long r7 = r0.longValue()     // Catch:{ all -> 0x0482 }
        L_0x03d3:
            long r0 = r1.longValue()     // Catch:{ all -> 0x0482 }
            long r7 = r7 + r0
            java.lang.Long r0 = java.lang.Long.valueOf(r7)     // Catch:{ all -> 0x0482 }
            r2.A0M = r0     // Catch:{ all -> 0x0482 }
        L_0x03de:
            monitor-exit(r2)     // Catch:{ 2Oy -> 0x0485 }
            r2.A09()     // Catch:{ 2Oy -> 0x0485 }
            X.1aA r0 = r6.A04     // Catch:{ 2Oy -> 0x0485 }
            r0.AIL()     // Catch:{ 2Oy -> 0x0485 }
            X.2I6 r7 = r6.A06     // Catch:{ 2Oy -> 0x0485 }
            r2 = 0
            r7.A01 = r2     // Catch:{ 2Oy -> 0x0485 }
            r7.A00 = r2     // Catch:{ 2Oy -> 0x0485 }
            r7.A04 = r2     // Catch:{ 2Oy -> 0x0485 }
            r0 = 0
            r7.A03 = r0     // Catch:{ 2Oy -> 0x0485 }
            r7.A02 = r2     // Catch:{ 2Oy -> 0x0485 }
            X.1aA r0 = r6.A04     // Catch:{ 2Oy -> 0x0485 }
            r0.A6B()     // Catch:{ 2Oy -> 0x0485 }
            X.2Ou r2 = r6.A05     // Catch:{ 2Oy -> 0x0485 }
            int r0 = r2.A06     // Catch:{ 2Oy -> 0x0485 }
            byte[] r0 = X.C48722Ot.A00(r0)     // Catch:{ 2Oy -> 0x0485 }
            r2.A03 = r0     // Catch:{ 2Oy -> 0x0485 }
            r0 = 65536(0x10000, float:9.18355E-41)
            r2.A01 = r0     // Catch:{ 2Oy -> 0x0485 }
            r0 = 0
            r2.A02 = r0     // Catch:{ 2Oy -> 0x0485 }
            X.02I r0 = r2.A07     // Catch:{ 2Oy -> 0x0485 }
            r0.A02()     // Catch:{ 2Oy -> 0x0485 }
            int r0 = r2.A04     // Catch:{ 2Oy -> 0x0485 }
            if (r0 == 0) goto L_0x0422
            if (r0 != r5) goto L_0x041b
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0431
        L_0x041b:
            boolean r0 = r2.A0A     // Catch:{ 2Oy -> 0x0485 }
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r0 == 0) goto L_0x0431
        L_0x0422:
            r1 = 65536(0x10000, float:9.18355E-41)
            goto L_0x0431
        L_0x0425:
            r0.AIL()     // Catch:{ 2Oy -> 0x0485 }
            java.lang.String r0 = "wambuffer/wambuffer: no WAM file found; creating a new one"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 2Oy -> 0x0485 }
            if (r4 != 0) goto L_0x0456
            return
        L_0x0431:
            r2.A00 = r1     // Catch:{ 2Oy -> 0x0485 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 2Oy -> 0x0485 }
            r1.<init>()     // Catch:{ 2Oy -> 0x0485 }
            java.lang.String r0 = "wambuffer/wambuffer: error while opening WAM file ("
            r1.append(r0)     // Catch:{ 2Oy -> 0x0485 }
            r1.append(r3)     // Catch:{ 2Oy -> 0x0485 }
            java.lang.String r0 = ")"
            r1.append(r0)     // Catch:{ 2Oy -> 0x0485 }
            java.lang.String r0 = r1.toString()     // Catch:{ 2Oy -> 0x0485 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 2Oy -> 0x0485 }
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ 2Oy -> 0x0485 }
            r0 = r22
            r0.A0C = r1     // Catch:{ 2Oy -> 0x0485 }
            r22.A09()     // Catch:{ 2Oy -> 0x0485 }
        L_0x0456:
            r0 = r21
            r6.A04(r4, r0)     // Catch:{ 2Oy -> 0x0485 }
            X.2Ou r2 = r6.A05     // Catch:{ IOException -> 0x0477 }
            int r1 = r2.A06     // Catch:{ IOException -> 0x0477 }
            if (r1 != 0) goto L_0x0463
            r0 = 2
            goto L_0x0468
        L_0x0463:
            X.2I6 r0 = r2.A08     // Catch:{ IOException -> 0x0477 }
            X.2I7[] r0 = r0.A05     // Catch:{ IOException -> 0x0477 }
            int r0 = r0.length     // Catch:{ IOException -> 0x0477 }
        L_0x0468:
            r2.A01(r1, r0)     // Catch:{ IOException -> 0x0477 }
            X.02I r0 = r2.A07     // Catch:{ IOException -> 0x0477 }
            r0.A03()     // Catch:{ IOException -> 0x0477 }
            java.lang.String r0 = "wambuffer/initnewfile: successfully created new WAM file"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 2Oy -> 0x0485 }
            return
        L_0x0477:
            r0 = move-exception
            java.lang.String r0 = r0.toString()     // Catch:{ 2Oy -> 0x0485 }
            X.2Oy r1 = new X.2Oy     // Catch:{ 2Oy -> 0x0485 }
            r1.<init>(r0)     // Catch:{ 2Oy -> 0x0485 }
            goto L_0x0484
        L_0x0482:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ 2Oy -> 0x0485 }
        L_0x0484:
            throw r1     // Catch:{ 2Oy -> 0x0485 }
        L_0x0485:
            r1 = move-exception
            java.lang.String r0 = "wambuffer/wambuffer: failed to initialize with new file"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.String r0 = "wambuffer: PERSISTENCE TURNED OFF"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            r6.A02 = r0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r0 = r22
            r0.A08 = r1
            r22.A09()
            java.io.RandomAccessFile r0 = r6.A08
            if (r0 == 0) goto L_0x04b6
            r0.close()     // Catch:{ IOException -> 0x04a6 }
            goto L_0x04b6
        L_0x04a6:
            r2 = move-exception
            X.1CK r1 = r6.A00
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A07 = r0
            r1.A09()
            java.lang.String r0 = "wambuffer/closefile: cannot close WAM file"
            com.whatsapp.util.Log.e(r0, r2)
        L_0x04b6:
            java.io.File r0 = r6.A07
            boolean r0 = r0.delete()
            if (r0 == 0) goto L_0x04c5
            java.lang.String r0 = "wambuffer/removefile: successfully removed WAM file"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x04c5:
            X.1CK r1 = r6.A00
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A0F = r0
            r1.A09()
            java.lang.String r0 = "wambuffer/removefile: cannot remove WAM file"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29171a9.<init>(X.0rz, X.1CI, X.1CK, java.io.File, int, int, int, boolean, boolean):void");
    }

    public final int A00() {
        return this.A04.A7h().A04.A05.capacity() - AnonymousClass2P4.A00(AnonymousClass2P4.A00.length - 1).length;
    }

    public final void A01() {
        if (!this.A02) {
            return;
        }
        if (!this.A04.A98()) {
            Log.e("wambuffer: PERSISTENCE TURNED OFF");
            this.A02 = false;
            return;
        }
        try {
            C48732Ou r2 = this.A05;
            int i2 = r2.A06;
            r2.A01(i2, i2 == 0 ? 2 : r2.A08.A05.length);
            r2.A07.A03();
            this.A01 = false;
        } catch (IOException e2) {
            AnonymousClass1CK r1 = this.A00;
            r1.A0I = Boolean.TRUE;
            r1.A09();
            Log.e("wambuffer/flush: cannot write header", e2);
            Log.e("wambuffer: PERSISTENCE TURNED OFF");
            this.A02 = false;
        }
    }

    public final void A02() {
        C29181aA r7 = this.A04;
        if (r7.A7h().A06()) {
            throw new Error("Rotation failed since the current event buffer is empty");
        } else if (r7.A5v()) {
            Locale locale = Locale.US;
            C29191aB A7h = r7.A7h();
            Log.i(String.format(locale, "wambuffer/rotate: rotated event buffer %d: size = %d, event count = %d, timestamp = %d", new Object[]{Integer.valueOf(this.A06.A01), Integer.valueOf(r7.A7h().A04.A05.position()), Integer.valueOf(r7.A7h().A00()), Long.valueOf(A7h.A05.A05[A7h.A02].A04)}));
            r7.Acf();
            if (!this.A09 || this.A03 != 2) {
                this.A01 = true;
            }
        } else {
            throw new Error("Rotation failed since there is no empty buffer");
        }
    }

    public final void A03(AnonymousClass02J r11, AnonymousClass02L r12) {
        C29191aB A7h = this.A04.A7h();
        int length = AnonymousClass2P4.A00.length - 1;
        if (A7h.A06()) {
            AnonymousClass02I r1 = A7h.A04;
            byte[] A002 = AnonymousClass2P4.A00(length);
            ByteBuffer byteBuffer = r1.A05;
            byteBuffer.put(A002);
            AnonymousClass2I6 r7 = A7h.A05;
            AnonymousClass2I7[] r5 = r7.A05;
            int i2 = A7h.A02;
            AnonymousClass2I7 r3 = r5[i2];
            int i3 = r7.A00 + 1;
            r7.A00 = i3;
            if (i3 > 65535) {
                r7.A00 = 1;
                i3 = 1;
            }
            r3.A00 = i3;
            byteBuffer.put(A7h.A07(length));
            r5[i2].A04 = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        }
        AnonymousClass2P6 r4 = r11.A02;
        int size = r4.size();
        AnonymousClass2P6 r2 = r12.A02;
        int size2 = size + r2.size();
        ByteBuffer byteBuffer2 = A7h.A04.A05;
        if (size2 <= byteBuffer2.remaining()) {
            byteBuffer2.put(r4.A00());
            byteBuffer2.put(r2.A00());
            int i4 = A7h.A01 + r11.A01;
            A7h.A01 = i4;
            A7h.A01 = i4 + r12.A01;
            A7h.A00++;
            Map map = r11.A00;
            for (Number number : Collections.unmodifiableCollection(map.keySet())) {
                C28991Zq r22 = A7h.A03;
                int intValue = number.intValue();
                if (map.containsKey(number)) {
                    r22.A00(intValue, ((C29001Zr) map.get(number)).A00);
                } else {
                    throw new Error("The buffer does not contain the given attribute");
                }
            }
            return;
        }
        throw new Error("Not enough space in the buffer");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        if (r3.A09 != false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(java.io.RandomAccessFile r4, int r5) {
        /*
            r3 = this;
            r2 = 65536(0x10000, float:9.18355E-41)
            int r1 = r3.A03     // Catch:{ IOException -> 0x001c }
            if (r1 == 0) goto L_0x0013
            r0 = 1
            if (r1 != r0) goto L_0x000c
            r1 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0015
        L_0x000c:
            boolean r0 = r3.A09     // Catch:{ IOException -> 0x001c }
            r1 = 32768(0x8000, float:4.5918E-41)
            if (r0 == 0) goto L_0x0015
        L_0x0013:
            r1 = 65536(0x10000, float:9.18355E-41)
        L_0x0015:
            int r1 = r1 * r5
            int r1 = r1 + r2
            long r0 = (long) r1     // Catch:{ IOException -> 0x001c }
            r4.setLength(r0)     // Catch:{ IOException -> 0x001c }
            return
        L_0x001c:
            r2 = move-exception
            X.1CK r0 = r3.A00
            r0.A07()
            r0.A09()
            java.lang.String r1 = "Cannot allocate space for new WAM file: "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            X.2Oy r0 = new X.2Oy
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29171a9.A04(java.io.RandomAccessFile, int):void");
    }
}
