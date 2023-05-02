package X;

import java.io.IOException;

/* renamed from: X.4c2  reason: invalid class name and case insensitive filesystem */
public class C89364c2 {
    public static final C90444e9 A02 = C90444e9.A00();
    public volatile AnonymousClass557 A00;
    public volatile C109905Uc A01;

    public final AnonymousClass557 A00() {
        AnonymousClass557 r0;
        if (this.A00 != null) {
            return this.A00;
        }
        synchronized (this) {
            if (this.A00 != null) {
                AnonymousClass557 r02 = this.A00;
                return r02;
            }
            if (this.A01 == null) {
                r0 = AnonymousClass557.A00;
            } else {
                C109905Uc r4 = this.A01;
                try {
                    C67293bJ r2 = (C67293bJ) r4;
                    int i2 = r2.zzc;
                    if (i2 == -1) {
                        i2 = AnonymousClass3K4.A0Q(r2).Aj1(r2);
                        r2.zzc = i2;
                    }
                    byte[] bArr = new byte[i2];
                    C32531gX r22 = new C32531gX(bArr, i2);
                    AnonymousClass5TK A0Q = AnonymousClass3K4.A0Q(r4);
                    C98574sd r03 = r22.A01;
                    if (r03 == null) {
                        r03 = new C98574sd(r22);
                    }
                    A0Q.Aix(r03, r4);
                    if (r22.A02 - r22.A00 == 0) {
                        r0 = new C66963am(bArr);
                    } else {
                        throw AnonymousClass000.A0V("Did not write as much data as expected.");
                    }
                } catch (IOException e2) {
                    throw new RuntimeException(AnonymousClass000.A0h(" threw an IOException (should never happen).", AnonymousClass3K2.A0o(r4, "ByteString")), e2);
                }
            }
            this.A00 = r0;
            AnonymousClass557 r04 = this.A00;
            return r04;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0010 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C109905Uc A01(X.C109905Uc r2) {
        /*
            r1 = this;
            X.5Uc r0 = r1.A01
            if (r0 != 0) goto L_0x001b
            monitor-enter(r1)
            X.5Uc r0 = r1.A01     // Catch:{ all -> 0x0018 }
            if (r0 != 0) goto L_0x0016
            r1.A01 = r2     // Catch:{ 40H -> 0x0010 }
            X.557 r0 = X.AnonymousClass557.A00     // Catch:{ 40H -> 0x0010 }
            r1.A00 = r0     // Catch:{ 40H -> 0x0010 }
            goto L_0x0016
        L_0x0010:
            r1.A01 = r2     // Catch:{ all -> 0x0018 }
            X.557 r0 = X.AnonymousClass557.A00     // Catch:{ all -> 0x0018 }
            r1.A00 = r0     // Catch:{ all -> 0x0018 }
        L_0x0016:
            monitor-exit(r1)     // Catch:{ all -> 0x0018 }
            goto L_0x001b
        L_0x0018:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0018 }
            throw r0
        L_0x001b:
            X.5Uc r0 = r1.A01
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C89364c2.A01(X.5Uc):X.5Uc");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C89364c2)) {
            return false;
        }
        C89364c2 r4 = (C89364c2) obj;
        C109905Uc r2 = this.A01;
        C109905Uc r1 = r4.A01;
        return r2 == null ? r1 == null ? A00().equals(r4.A00()) : A01(r1.AjR()).equals(r1) : r1 != null ? r2.equals(r1) : r2.equals(r4.A01(r2.AjR()));
    }

    public int hashCode() {
        return 1;
    }
}
