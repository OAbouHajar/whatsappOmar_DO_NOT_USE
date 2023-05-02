package X;

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.List;

/* renamed from: X.0gt  reason: invalid class name and case insensitive filesystem */
public class C10290gt implements Runnable {
    public final /* synthetic */ C02620Dh A00;
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A01;
    public final /* synthetic */ List A02;

    public C10290gt(C02620Dh r1, ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl, List list) {
        this.A01 = shortcutInfoCompatSaverImpl;
        this.A02 = list;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if (r1 != 5) goto L_0x0030;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0006 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r8 = this;
            java.util.List r0 = r8.A02
            java.util.Iterator r7 = r0.iterator()
        L_0x0006:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x009b
            java.lang.Object r3 = r7.next()
            X.04S r3 = (X.AnonymousClass04S) r3
            java.util.Set r0 = r3.A0F
            if (r0 == 0) goto L_0x0006
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0006
            androidx.sharetarget.ShortcutInfoCompatSaverImpl r4 = r8.A01
            androidx.core.graphics.drawable.IconCompat r2 = r3.A09
            r5 = 0
            if (r2 == 0) goto L_0x0030
            int r1 = r2.A05()
            r0 = 1
            if (r1 == r0) goto L_0x0086
            r0 = 2
            if (r1 == r0) goto L_0x0076
            r0 = 5
            if (r1 == r0) goto L_0x0086
        L_0x0030:
            r6 = r5
            r2 = r5
        L_0x0032:
            X.04R r1 = new X.04R
            r1.<init>(r3)
            X.04S r0 = r1.A00
            r0.A09 = r5
            X.04S r0 = r1.A00()
            X.0OO r5 = new X.0OO
            r5.<init>(r0, r6, r2)
            androidx.core.graphics.drawable.IconCompat r0 = r3.A09
            java.lang.String r2 = r5.A01
            if (r2 == 0) goto L_0x0074
            android.graphics.Bitmap r1 = r0.A06()
        L_0x004e:
            java.lang.String r3 = r3.A0D
            java.util.Map r0 = r4.A04
            r0.put(r3, r5)
            if (r1 == 0) goto L_0x0006
            X.1bY r2 = r4.A03(r1, r2)
            java.util.Map r0 = r4.A03
            java.lang.Object r1 = r0.put(r3, r2)
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            if (r1 == 0) goto L_0x0069
            r0 = 0
            r1.cancel(r0)
        L_0x0069:
            X.0gs r1 = new X.0gs
            r1.<init>(r8, r2, r3)
            java.util.concurrent.ExecutorService r0 = r4.A05
            r2.A4b(r1, r0)
            goto L_0x0006
        L_0x0074:
            r1 = 0
            goto L_0x004e
        L_0x0076:
            android.content.Context r0 = r4.A00
            android.content.res.Resources r1 = r0.getResources()
            int r0 = r2.A04()
            java.lang.String r6 = r1.getResourceName(r0)
            r2 = r5
            goto L_0x0032
        L_0x0086:
            java.io.File r2 = r4.A01
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r1 = r0.toString()
            java.io.File r0 = new java.io.File
            r0.<init>(r2, r1)
            java.lang.String r2 = r0.getAbsolutePath()
            r6 = r5
            goto L_0x0032
        L_0x009b:
            androidx.sharetarget.ShortcutInfoCompatSaverImpl r1 = r8.A01
            X.0Dh r0 = r8.A00
            r1.A04(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C10290gt.run():void");
    }
}
