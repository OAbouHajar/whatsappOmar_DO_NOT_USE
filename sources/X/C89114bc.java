package X;

import java.util.WeakHashMap;

/* renamed from: X.4bc  reason: invalid class name and case insensitive filesystem */
public class C89114bc {
    public static C89114bc A01;
    public final WeakHashMap A00 = new WeakHashMap();

    public static synchronized C89114bc A00() {
        C89114bc r0;
        synchronized (C89114bc.class) {
            r0 = A01;
            if (r0 == null) {
                r0 = new C89114bc();
                A01 = r0;
            }
        }
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r1 != 0) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap A01(android.content.ContentResolver r12, android.graphics.BitmapFactory.Options r13, int r14, long r15) {
        /*
            r11 = this;
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            X.4RD r3 = r11.A03(r4)
            r2 = r11
            monitor-enter(r2)
            java.util.WeakHashMap r0 = r11.A00     // Catch:{ all -> 0x004b }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x004b }
            X.4RD r0 = (X.AnonymousClass4RD) r0     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0019
            int r1 = r0.A00     // Catch:{ all -> 0x004b }
            r0 = 0
            if (r1 == 0) goto L_0x001a
        L_0x0019:
            r0 = 1
        L_0x001a:
            monitor-exit(r2)
            if (r0 != 0) goto L_0x001f
            r0 = 0
            return r0
        L_0x001f:
            r1 = 0
            monitor-enter(r3)     // Catch:{ all -> 0x003f }
            r0 = 1
            r3.A02 = r0     // Catch:{ all -> 0x003c }
            monitor-exit(r3)     // Catch:{ all -> 0x003c }
            long r7 = r4.getId()     // Catch:{ all -> 0x003f }
            r4 = r12
            r10 = r13
            r9 = r14
            r5 = r15
            android.graphics.Bitmap r0 = android.provider.MediaStore.Images.Thumbnails.getThumbnail(r4, r5, r7, r9, r10)     // Catch:{ all -> 0x003f }
            monitor-enter(r3)
            r3.A02 = r1     // Catch:{ all -> 0x0039 }
            r3.notifyAll()     // Catch:{ all -> 0x0039 }
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            return r0
        L_0x0039:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            throw r0
        L_0x003c:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x003c }
            throw r0     // Catch:{ all -> 0x003f }
        L_0x003f:
            r0 = move-exception
            monitor-enter(r3)
            r3.A02 = r1     // Catch:{ all -> 0x0048 }
            r3.notifyAll()     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r3)     // Catch:{ all -> 0x0048 }
            goto L_0x004a
        L_0x0048:
            r0 = move-exception
            goto L_0x0046
        L_0x004a:
            throw r0
        L_0x004b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89114bc.A01(android.content.ContentResolver, android.graphics.BitmapFactory$Options, int, long):android.graphics.Bitmap");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0018, code lost:
        if (r1 != 0) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.graphics.Bitmap A02(android.graphics.BitmapFactory.Options r7, java.io.FileDescriptor r8) {
        /*
            r6 = this;
            r5 = r6
            boolean r0 = r7.mCancel
            r4 = 0
            if (r0 != 0) goto L_0x0038
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            monitor-enter(r5)
            java.util.WeakHashMap r2 = r6.A00     // Catch:{ all -> 0x0035 }
            java.lang.Object r0 = r2.get(r3)     // Catch:{ all -> 0x0035 }
            X.4RD r0 = (X.AnonymousClass4RD) r0     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x001a
            int r1 = r0.A00     // Catch:{ all -> 0x0035 }
            r0 = 0
            if (r1 == 0) goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            monitor-exit(r5)
            if (r0 == 0) goto L_0x0038
            monitor-enter(r5)
            X.4RD r0 = r6.A03(r3)     // Catch:{ all -> 0x0035 }
            r0.A01 = r7     // Catch:{ all -> 0x0035 }
            monitor-exit(r5)
            android.graphics.Bitmap r1 = android.graphics.BitmapFactory.decodeFileDescriptor(r8, r4, r7)
            monitor-enter(r5)
            java.lang.Object r0 = r2.get(r3)     // Catch:{ all -> 0x0035 }
            X.4RD r0 = (X.AnonymousClass4RD) r0     // Catch:{ all -> 0x0035 }
            r0.A01 = r4     // Catch:{ all -> 0x0035 }
            monitor-exit(r5)
            return r1
        L_0x0035:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0038:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89114bc.A02(android.graphics.BitmapFactory$Options, java.io.FileDescriptor):android.graphics.Bitmap");
    }

    public final synchronized AnonymousClass4RD A03(Thread thread) {
        AnonymousClass4RD r0;
        WeakHashMap weakHashMap = this.A00;
        r0 = (AnonymousClass4RD) weakHashMap.get(thread);
        if (r0 == null) {
            r0 = new AnonymousClass4RD();
            weakHashMap.put(thread, r0);
        }
        return r0;
    }
}
