package X;

import android.os.SystemClock;

/* renamed from: X.01T  reason: invalid class name */
public class AnonymousClass01T implements AnonymousClass01J, AnonymousClass01D {
    public long A00 = -1;
    public AnonymousClass01J A01;
    public volatile Object A02;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        if (r3 != null) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass01T(java.lang.Object r3, X.AnonymousClass01J r4) {
        /*
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.A00 = r0
            if (r4 != 0) goto L_0x000c
            r1 = 0
            if (r3 == 0) goto L_0x000d
        L_0x000c:
            r1 = 1
        L_0x000d:
            java.lang.String r0 = "Either a provider or instance must be specified."
            X.AnonymousClass00B.A0C(r0, r1)
            r2.A01 = r4
            r2.A02 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass01T.<init>(java.lang.Object, X.01J):void");
    }

    public boolean A00() {
        boolean z2;
        synchronized (this) {
            z2 = false;
            if (this.A02 != null) {
                z2 = true;
            }
        }
        return z2;
    }

    public Object get() {
        if (this.A02 == null) {
            synchronized (this) {
                if (this.A02 == null) {
                    AnonymousClass01J r1 = this.A01;
                    boolean z2 = false;
                    if (r1 != null) {
                        z2 = true;
                    }
                    AnonymousClass00B.A0G(z2);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    try {
                        Object obj = r1.get();
                        AnonymousClass00B.A06(obj);
                        this.A02 = obj;
                        this.A00 = Math.max(0, SystemClock.uptimeMillis() - uptimeMillis);
                        this.A01 = null;
                    } catch (Throwable th) {
                        this.A00 = Math.max(0, SystemClock.uptimeMillis() - uptimeMillis);
                        throw th;
                    }
                }
            }
        }
        return this.A02;
    }
}
