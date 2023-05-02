package X;

import com.obwhatsapp.gallery.GalleryFragmentBase;
import java.lang.ref.WeakReference;

/* renamed from: X.372  reason: invalid class name */
public class AnonymousClass372 extends C16690tT {
    public int A00;
    public AnonymousClass024 A01;
    public final AnonymousClass013 A02;
    public final C16460t6 A03;
    public final C42391xi A04;
    public final AnonymousClass0y0 A05;
    public final C56122l0 A06;
    public final C15830rv A07;
    public final WeakReference A08;

    public AnonymousClass372(AnonymousClass013 r3, C16460t6 r4, C42391xi r5, AnonymousClass0y0 r6, GalleryFragmentBase galleryFragmentBase, C15830rv r8) {
        this.A02 = r3;
        this.A03 = r4;
        this.A05 = r6;
        this.A08 = C13690nt.A0h(galleryFragmentBase);
        this.A07 = r8;
        this.A04 = r5;
        this.A06 = new C56122l0(galleryFragmentBase.A02(), r3);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00cd */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:40:0x00ac=Splitter:B:40:0x00ac, B:55:0x00cd=Splitter:B:55:0x00cd} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.ref.WeakReference r1 = r0.A08
            java.lang.Object r9 = r1.get()
            com.obwhatsapp.gallery.GalleryFragmentBase r9 = (com.obwhatsapp.gallery.GalleryFragmentBase) r9
            X.0tU r13 = r0.A02
            boolean r1 = r13.isCancelled()
            r3 = 0
            if (r1 != 0) goto L_0x00e1
            if (r9 == 0) goto L_0x00e1
            X.024 r2 = new X.024
            r2.<init>()
            monitor-enter(r0)
            r0.A01 = r2     // Catch:{ all -> 0x00de }
            monitor-exit(r0)     // Catch:{ all -> 0x00de }
            long r16 = android.os.SystemClock.uptimeMillis()
            java.util.ArrayList r10 = X.AnonymousClass000.A0u()
            r7 = 1
            X.0rv r12 = r0.A07     // Catch:{ SQLiteDiskIOException -> 0x00ce }
            X.1xi r1 = r0.A04     // Catch:{ SQLiteDiskIOException -> 0x00ce }
            android.database.Cursor r8 = r9.A1B(r2, r1, r12)     // Catch:{ SQLiteDiskIOException -> 0x00ce }
            r11 = r3
        L_0x0030:
            r6 = 0
            boolean r1 = r8.moveToNext()     // Catch:{ all -> 0x00c9 }
            if (r1 == 0) goto L_0x0094
            boolean r1 = r13.isCancelled()     // Catch:{ all -> 0x00c9 }
            if (r1 != 0) goto L_0x0094
            boolean r1 = r8 instanceof X.C16930tt     // Catch:{ all -> 0x00c9 }
            if (r1 == 0) goto L_0x0061
            r1 = r8
            X.0tt r1 = (X.C16930tt) r1     // Catch:{ all -> 0x00c9 }
            X.0tY r1 = r1.A00()     // Catch:{ all -> 0x00c9 }
        L_0x0048:
            X.AnonymousClass00B.A06(r1)     // Catch:{ all -> 0x00c9 }
            X.2l0 r4 = r0.A06     // Catch:{ all -> 0x00c9 }
            long r1 = r1.A0I     // Catch:{ all -> 0x00c9 }
            X.2kz r2 = r4.A00(r1)     // Catch:{ all -> 0x00c9 }
            if (r11 == 0) goto L_0x005e
            boolean r1 = r11.equals(r2)     // Catch:{ all -> 0x00c9 }
            if (r1 != 0) goto L_0x0069
            r10.add(r11)     // Catch:{ all -> 0x00c9 }
        L_0x005e:
            r2.count = r6     // Catch:{ all -> 0x00c9 }
            goto L_0x0068
        L_0x0061:
            X.0t6 r1 = r0.A03     // Catch:{ all -> 0x00c9 }
            X.0tZ r1 = r1.A0G(r8, r12)     // Catch:{ all -> 0x00c9 }
            goto L_0x0048
        L_0x0068:
            r11 = r2
        L_0x0069:
            int r1 = r11.count     // Catch:{ all -> 0x00c9 }
            int r1 = r1 + 1
            r11.count = r1     // Catch:{ all -> 0x00c9 }
            boolean r1 = r10.isEmpty()     // Catch:{ all -> 0x00c9 }
            if (r1 != 0) goto L_0x0030
            r14 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 + r16
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00c9 }
            int r1 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x0030
            long r16 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x00c9 }
            java.util.ArrayList r2 = X.C13680ns.A0n(r10)     // Catch:{ all -> 0x00c9 }
            r10.clear()     // Catch:{ all -> 0x00c9 }
            java.util.List[] r1 = new java.util.List[r7]     // Catch:{ all -> 0x00c9 }
            r1[r6] = r2     // Catch:{ all -> 0x00c9 }
            r0.A07(r1)     // Catch:{ all -> 0x00c9 }
            goto L_0x0030
        L_0x0094:
            if (r11 == 0) goto L_0x009f
            boolean r1 = r13.isCancelled()     // Catch:{ all -> 0x00c9 }
            if (r1 != 0) goto L_0x009f
            r10.add(r11)     // Catch:{ all -> 0x00c9 }
        L_0x009f:
            boolean r1 = r10.isEmpty()     // Catch:{ all -> 0x00c9 }
            if (r1 != 0) goto L_0x00ac
            java.util.List[] r1 = new java.util.List[r7]     // Catch:{ all -> 0x00c9 }
            r1[r6] = r10     // Catch:{ all -> 0x00c9 }
            r0.A07(r1)     // Catch:{ all -> 0x00c9 }
        L_0x00ac:
            r8.close()     // Catch:{ SQLiteDiskIOException -> 0x00ce }
            monitor-enter(r0)
            r0.A01 = r3     // Catch:{ all -> 0x00c6 }
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()
            java.lang.String r0 = r9.A0H
            r1.append(r0)
            java.lang.String r0 = "/all buckets assigned"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r3
        L_0x00c6:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00c6 }
            throw r1
        L_0x00c9:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x00cd }
        L_0x00cd:
            throw r1     // Catch:{ SQLiteDiskIOException -> 0x00ce }
        L_0x00ce:
            r2 = move-exception
            X.0y0 r1 = r0.A05     // Catch:{ all -> 0x00d5 }
            r1.A00(r7)     // Catch:{ all -> 0x00d5 }
            throw r2     // Catch:{ all -> 0x00d5 }
        L_0x00d5:
            r1 = move-exception
            monitor-enter(r0)
            r0.A01 = r3     // Catch:{ all -> 0x00db }
        L_0x00d9:
            monitor-exit(r0)     // Catch:{ all -> 0x00db }
            goto L_0x00dd
        L_0x00db:
            r1 = move-exception
            goto L_0x00d9
        L_0x00dd:
            throw r1
        L_0x00de:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00de }
            throw r1
        L_0x00e1:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass372.A08(java.lang.Object[]):java.lang.Object");
    }

    public void A0B() {
        A06(true);
        synchronized (this) {
            AnonymousClass024 r0 = this.A01;
            if (r0 != null) {
                r0.A01();
            }
        }
    }
}
