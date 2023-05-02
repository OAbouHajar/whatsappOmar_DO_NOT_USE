package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.17L  reason: invalid class name */
public class AnonymousClass17L {
    public final List A00 = new ArrayList();
    public final List A01 = new ArrayList();
    public final List A02 = new ArrayList();

    public void A00() {
        synchronized (this) {
            List list = this.A00;
            list.size();
            List list2 = this.A02;
            list2.size();
            List list3 = this.A01;
            list3.size();
            list.clear();
            list2.clear();
            list3.clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        if (r2.A01.size() > 0) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.List r0 = r2.A00     // Catch:{ all -> 0x001d }
            int r0 = r0.size()     // Catch:{ all -> 0x001d }
            if (r0 > 0) goto L_0x001a
            java.util.List r0 = r2.A02     // Catch:{ all -> 0x001d }
            int r0 = r0.size()     // Catch:{ all -> 0x001d }
            if (r0 > 0) goto L_0x001a
            java.util.List r0 = r2.A01     // Catch:{ all -> 0x001d }
            int r1 = r0.size()     // Catch:{ all -> 0x001d }
            r0 = 0
            if (r1 <= 0) goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
            return r0
        L_0x001d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x001d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17L.A01():boolean");
    }
}
