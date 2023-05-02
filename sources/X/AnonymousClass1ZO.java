package X;

import java.io.FileInputStream;

/* renamed from: X.1ZO  reason: invalid class name */
public class AnonymousClass1ZO {
    public static byte A00(FileInputStream fileInputStream, long j2, long j3) {
        fileInputStream.skip(j2 - j3);
        int read = fileInputStream.read();
        if (read == -1) {
            return 0;
        }
        byte b2 = (byte) read;
        if (read >= 100) {
            return 99;
        }
        return b2;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0040 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A01(java.io.File r8) {
        /*
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            long r5 = r8.length()
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x004b
            long r6 = r8.length()
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0045 }
            r5.<init>(r8)     // Catch:{ IOException -> 0x0045 }
            r3 = 0
        L_0x0019:
            long r1 = (long) r3     // Catch:{ IOException -> 0x0045 }
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x0041
            int r0 = r5.read()     // Catch:{ all -> 0x003c }
            byte r1 = (byte) r0     // Catch:{ all -> 0x003c }
            r0 = -1
            if (r1 == r0) goto L_0x0041
            r0 = 100
            if (r1 < r0) goto L_0x002e
            r1 = 1065185444(0x3f7d70a4, float:0.99)
            goto L_0x0032
        L_0x002e:
            float r1 = (float) r1     // Catch:{ all -> 0x003c }
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r0
        L_0x0032:
            java.lang.Float r0 = java.lang.Float.valueOf(r1)     // Catch:{ all -> 0x003c }
            r4.add(r0)     // Catch:{ all -> 0x003c }
            int r3 = r3 + 1
            goto L_0x0019
        L_0x003c:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0040 }
        L_0x0040:
            throw r0     // Catch:{ IOException -> 0x0045 }
        L_0x0041:
            r5.close()     // Catch:{ IOException -> 0x0045 }
            return r4
        L_0x0045:
            r1 = move-exception
            java.lang.String r0 = "WaveformUtil/getWaveformFromFile "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x004b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZO.A01(java.io.File):java.util.List");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x007e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List A02(java.io.File r16, int r17) {
        /*
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r5 = r16
            if (r16 == 0) goto L_0x0086
            long r3 = r5.length()
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0086
            long r6 = r5.length()
            float r11 = (float) r6
            r15 = r17
            float r2 = (float) r15
            float r11 = r11 / r2
            java.io.FileInputStream r10 = new java.io.FileInputStream     // Catch:{ IOException -> 0x007f }
            r10.<init>(r5)     // Catch:{ IOException -> 0x007f }
            byte r0 = A00(r10, r0, r0)     // Catch:{ all -> 0x007a }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x007a }
            r12.add(r0)     // Catch:{ all -> 0x007a }
            r16 = 1
            r4 = 1
            r9 = 1
        L_0x0031:
            int r0 = r15 + -1
            if (r9 >= r0) goto L_0x0069
            float r8 = (float) r9     // Catch:{ all -> 0x007a }
            float r8 = r8 * r11
            double r13 = (double) r8     // Catch:{ all -> 0x007a }
            double r0 = java.lang.Math.floor(r13)     // Catch:{ all -> 0x007a }
            long r2 = (long) r0     // Catch:{ all -> 0x007a }
            double r13 = java.lang.Math.ceil(r13)     // Catch:{ all -> 0x007a }
            long r0 = (long) r13     // Catch:{ all -> 0x007a }
            float r13 = (float) r2     // Catch:{ all -> 0x007a }
            float r8 = r8 - r13
            byte r13 = A00(r10, r2, r4)     // Catch:{ all -> 0x007a }
            long r4 = r2 + r16
            int r14 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r14 == 0) goto L_0x0064
            byte r2 = A00(r10, r0, r4)     // Catch:{ all -> 0x007a }
            long r0 = r0 + r16
            r4 = r0
        L_0x0055:
            float r1 = (float) r13     // Catch:{ all -> 0x007a }
            int r2 = r2 - r13
            float r0 = (float) r2     // Catch:{ all -> 0x007a }
            float r0 = r0 * r8
            float r1 = r1 + r0
            int r0 = (int) r1     // Catch:{ all -> 0x007a }
            byte r0 = (byte) r0     // Catch:{ all -> 0x007a }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x007a }
            r12.add(r0)     // Catch:{ all -> 0x007a }
            goto L_0x0066
        L_0x0064:
            r2 = r13
            goto L_0x0055
        L_0x0066:
            int r9 = r9 + 1
            goto L_0x0031
        L_0x0069:
            long r6 = r6 - r16
            byte r0 = A00(r10, r6, r4)     // Catch:{ all -> 0x007a }
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)     // Catch:{ all -> 0x007a }
            r12.add(r0)     // Catch:{ all -> 0x007a }
            r10.close()     // Catch:{ IOException -> 0x007f }
            return r12
        L_0x007a:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x007e }
        L_0x007e:
            throw r0     // Catch:{ IOException -> 0x007f }
        L_0x007f:
            r1 = move-exception
            java.lang.String r0 = "waveformutil/generateDisplayDataPoints/ error reading visualization file data "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0086:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ZO.A02(java.io.File, int):java.util.List");
    }
}
