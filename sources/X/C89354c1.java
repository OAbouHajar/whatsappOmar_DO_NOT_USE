package X;

import java.io.IOException;

/* renamed from: X.4c1  reason: invalid class name and case insensitive filesystem */
public class C89354c1 {
    public static final C89854d2 A02;
    public volatile AnonymousClass556 A00;
    public volatile AnonymousClass5UZ A01;

    static {
        C89854d2 r0;
        Class cls = C815448t.A00;
        if (cls != null) {
            try {
                r0 = (C89854d2) AnonymousClass3K3.A0i(cls, "getEmptyRegistry");
            } catch (Exception unused) {
            }
            A02 = r0;
        }
        r0 = C89854d2.A01;
        A02 = r0;
    }

    public final AnonymousClass556 A00() {
        AnonymousClass556 r0;
        if (this.A00 != null) {
            return this.A00;
        }
        synchronized (this) {
            if (this.A00 != null) {
                AnonymousClass556 r02 = this.A00;
                return r02;
            }
            if (this.A01 == null) {
                r0 = AnonymousClass556.A00;
            } else {
                AnonymousClass5UZ r4 = this.A01;
                try {
                    int Aiz = r4.Aiz();
                    byte[] bArr = new byte[Aiz];
                    AnonymousClass3ZG r2 = new AnonymousClass3ZG(bArr, 0, Aiz);
                    C32591gd A0Y = AnonymousClass3K3.A0Y(r4);
                    C98344rU r03 = r2.A00;
                    if (r03 == null) {
                        r03 = new C98344rU(r2);
                    }
                    A0Y.Aiv(r03, r4);
                    if (r2.A01 - r2.A00 == 0) {
                        r0 = new AnonymousClass3ZC(bArr);
                    } else {
                        throw AnonymousClass000.A0V("Did not write as much data as expected.");
                    }
                } catch (IOException e2) {
                    throw new RuntimeException(AnonymousClass000.A0h(" threw an IOException (should never happen).", AnonymousClass3K2.A0o(r4, "ByteString")), e2);
                }
            }
            this.A00 = r0;
            AnonymousClass556 r04 = this.A00;
            return r04;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0010 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass5UZ A01(X.AnonymousClass5UZ r2) {
        /*
            r1 = this;
            X.5UZ r0 = r1.A01
            if (r0 != 0) goto L_0x001b
            monitor-enter(r1)
            X.5UZ r0 = r1.A01     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x0016
            r1.A01 = r2     // Catch:{ 40G -> 0x0010 }
            X.556 r0 = X.AnonymousClass556.A00     // Catch:{ 40G -> 0x0010 }
            r1.A00 = r0     // Catch:{ 40G -> 0x0010 }
            goto L_0x0016
        L_0x0010:
            r1.A01 = r2     // Catch:{ all -> 0x0018 }
            X.556 r0 = X.AnonymousClass556.A00     // Catch:{ all -> 0x0018 }
            r1.A00 = r0     // Catch:{ all -> 0x0018 }
        L_0x0016:
            monitor-exit(r1)     // Catch:{ all -> 0x0018 }
            goto L_0x001b
        L_0x0018:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0018 }
            throw r0
        L_0x001b:
            X.5UZ r0 = r1.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89354c1.A01(X.5UZ):X.5UZ");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C89354c1)) {
            return false;
        }
        C89354c1 r4 = (C89354c1) obj;
        AnonymousClass5UZ r2 = this.A01;
        AnonymousClass5UZ r1 = r4.A01;
        return r2 == null ? r1 == null ? A00().equals(r4.A00()) : A01(r1.AjA()).equals(r1) : r1 != null ? r2.equals(r1) : r2.equals(r4.A01(r2.AjA()));
    }

    public int hashCode() {
        return 1;
    }
}
