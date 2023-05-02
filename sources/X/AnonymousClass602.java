package X;

/* renamed from: X.602  reason: invalid class name */
public class AnonymousClass602 implements AnonymousClass5PC {
    public final /* synthetic */ AnonymousClass5wU A00;

    public AnonymousClass602(AnonymousClass5wU r1) {
        this.A00 = r1;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:42:0x0096=Splitter:B:42:0x0096, B:37:0x008d=Splitter:B:37:0x008d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass4KL A9X() {
        /*
            r15 = this;
            X.5wU r4 = r15.A00
            boolean r0 = r4.A08
            r10 = 0
            if (r0 == 0) goto L_0x00a7
            java.lang.Object r3 = r4.A06
            monitor-enter(r3)
            r0 = 1
            r2 = 0
            r4.A07 = r0     // Catch:{ all -> 0x009d }
        L_0x000e:
            boolean r0 = r4.A09     // Catch:{ all -> 0x009d }
            if (r0 != 0) goto L_0x001a
            boolean r0 = r4.A08     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x001a
            r3.wait()     // Catch:{ InterruptedException -> 0x000e }
            goto L_0x000e
        L_0x001a:
            boolean r0 = r4.A08     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x0096
            X.5sc r5 = r4.A02     // Catch:{ all -> 0x009d }
            byte[] r0 = r5.A02     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x0031
            X.4KL r1 = r4.A04     // Catch:{ all -> 0x009d }
            r1.A02 = r0     // Catch:{ all -> 0x009d }
            int r0 = r5.A01     // Catch:{ all -> 0x009d }
            r1.A01 = r0     // Catch:{ all -> 0x009d }
            int r0 = r5.A00     // Catch:{ all -> 0x009d }
            r1.A00 = r0     // Catch:{ all -> 0x009d }
            goto L_0x008d
        L_0x0031:
            X.67p[] r0 = r5.A03     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x008d
            int[] r11 = X.AnonymousClass5wU.A0A     // Catch:{ all -> 0x009d }
            int r9 = r11.length     // Catch:{ all -> 0x009d }
            r8 = 480(0x1e0, float:6.73E-43)
            r7 = 640(0x280, float:8.97E-43)
            r6 = 0
            r12 = 640(0x280, float:8.97E-43)
            r14 = 480(0x1e0, float:6.73E-43)
        L_0x0041:
            if (r6 >= r9) goto L_0x0057
            r1 = r11[r6]     // Catch:{ all -> 0x009d }
            int r0 = r5.A01     // Catch:{ all -> 0x009d }
            int r0 = r0 * r1
            int r12 = r0 / 8
            int r0 = r5.A00     // Catch:{ all -> 0x009d }
            int r1 = r1 * r0
            int r14 = r1 / 8
            if (r12 < r7) goto L_0x0054
            if (r14 < r8) goto L_0x0054
            goto L_0x0057
        L_0x0054:
            int r6 = r6 + 1
            goto L_0x0041
        L_0x0057:
            boolean r0 = r4.A08     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x0096
            int r1 = r12 * r14
            java.nio.ByteBuffer r0 = r4.A00     // Catch:{ all -> 0x009d }
            if (r0 == 0) goto L_0x0067
            int r0 = r0.capacity()     // Catch:{ all -> 0x009d }
            if (r0 == r1) goto L_0x0079
        L_0x0067:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r1)     // Catch:{ all -> 0x009d }
            r4.A00 = r0     // Catch:{ all -> 0x009d }
            X.4KL r1 = r4.A04     // Catch:{ all -> 0x009d }
            byte[] r0 = r0.array()     // Catch:{ all -> 0x009d }
            r1.A02 = r0     // Catch:{ all -> 0x009d }
            r1.A01 = r12     // Catch:{ all -> 0x009d }
            r1.A00 = r14     // Catch:{ all -> 0x009d }
        L_0x0079:
            X.67p[] r0 = r5.A03     // Catch:{ all -> 0x009d }
            r0 = r0[r2]     // Catch:{ all -> 0x009d }
            X.5zB r0 = (X.AnonymousClass5zB) r0     // Catch:{ all -> 0x009d }
            java.nio.ByteBuffer r7 = r0.A01     // Catch:{ all -> 0x009d }
            int r8 = r0.A00     // Catch:{ all -> 0x009d }
            int r9 = r5.A01     // Catch:{ all -> 0x009d }
            int r10 = r5.A00     // Catch:{ all -> 0x009d }
            java.nio.ByteBuffer r11 = r4.A00     // Catch:{ all -> 0x009d }
            r13 = r12
            com.whatsapp.VideoFrameConverter.scalePlane(r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x009d }
        L_0x008d:
            r4.A07 = r2     // Catch:{ all -> 0x00a4 }
            r3.notify()     // Catch:{ all -> 0x00a4 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a4 }
            X.4KL r10 = r4.A04
            return r10
        L_0x0096:
            r4.A07 = r2     // Catch:{ all -> 0x00a4 }
            r3.notify()     // Catch:{ all -> 0x00a4 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a4 }
            return r10
        L_0x009d:
            r0 = move-exception
            r4.A07 = r2     // Catch:{ all -> 0x00a4 }
            r3.notify()     // Catch:{ all -> 0x00a4 }
            throw r0     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00a4 }
            throw r0
        L_0x00a7:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass602.A9X():X.4KL");
    }
}
