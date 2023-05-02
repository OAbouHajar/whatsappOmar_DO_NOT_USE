package X;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* renamed from: X.59F  reason: invalid class name */
public final class AnonymousClass59F implements C13670mq {
    public boolean A00;
    public final C11050i7 A01 = new C11050i7();
    public final C109945Uk A02;

    public AnonymousClass59F(C109945Uk r2) {
        this.A02 = r2;
    }

    public static long A00(C11050i7 r3, AnonymousClass59F r4) {
        return r4.A02.AbQ(r3, (long) 8192);
    }

    public C11050i7 A5g() {
        return this.A01;
    }

    public C11050i7 AAD() {
        return this.A01;
    }

    /* JADX WARNING: Removed duplicated region for block: B:81:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x013c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long AHt(X.C09200f6 r19) {
        /*
            r18 = this;
            r2 = 0
            r11 = r18
            boolean r0 = r11.A00
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = "closed"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x0011:
            X.0i7 r10 = r11.A01
            r16 = r2
            r14 = 0
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 < 0) goto L_0x014b
            X.4cA r9 = r10.A01
            if (r9 == 0) goto L_0x0122
            long r0 = r10.A00
            long r7 = r0 - r2
            r6 = 2
            int r5 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            r4 = r19
            if (r5 >= 0) goto L_0x00a2
            r14 = r0
        L_0x002b:
            int r0 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x003b
            X.4cA r9 = r9.A03
            if (r9 == 0) goto L_0x0143
            int r1 = r9.A00
            int r0 = r9.A01
            int r1 = r1 - r0
            long r0 = (long) r1
            long r14 = r14 - r0
            goto L_0x002b
        L_0x003b:
            int r0 = r4.A01()
            if (r0 != r6) goto L_0x0071
            r0 = 0
            byte r5 = r4.A00(r0)
            r0 = 1
            byte r4 = r4.A00(r0)
        L_0x004b:
            long r0 = r10.A00
            int r6 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x0122
            byte[] r7 = r9.A06
            int r6 = r9.A01
            long r0 = (long) r6
            long r0 = r0 + r16
            long r0 = r0 - r14
            int r13 = (int) r0
            int r1 = r9.A00
        L_0x005c:
            if (r13 >= r1) goto L_0x0067
            byte r0 = r7[r13]
            if (r0 == r5) goto L_0x0125
            if (r0 == r4) goto L_0x0125
            int r13 = r13 + 1
            goto L_0x005c
        L_0x0067:
            int r1 = r1 - r6
            long r0 = (long) r1
            long r14 = r14 + r0
            X.4cA r9 = r9.A02
            if (r9 == 0) goto L_0x0143
            r16 = r14
            goto L_0x004b
        L_0x0071:
            byte[] r8 = r4.A06()
        L_0x0075:
            long r0 = r10.A00
            int r4 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x0122
            byte[] r12 = r9.A06
            int r7 = r9.A01
            long r0 = (long) r7
            long r0 = r0 + r16
            long r0 = r0 - r14
            int r13 = (int) r0
            int r6 = r9.A00
        L_0x0086:
            if (r13 >= r6) goto L_0x0098
            byte r5 = r12[r13]
            int r4 = r8.length
            r1 = 0
        L_0x008c:
            if (r1 >= r4) goto L_0x0095
            byte r0 = r8[r1]
            if (r5 == r0) goto L_0x0125
            int r1 = r1 + 1
            goto L_0x008c
        L_0x0095:
            int r13 = r13 + 1
            goto L_0x0086
        L_0x0098:
            int r6 = r6 - r7
            long r0 = (long) r6
            long r14 = r14 + r0
            X.4cA r9 = r9.A02
            if (r9 == 0) goto L_0x0143
            r16 = r14
            goto L_0x0075
        L_0x00a2:
            int r1 = r9.A00
            int r0 = r9.A01
            int r1 = r1 - r0
            long r0 = (long) r1
            long r0 = r0 + r14
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x00e7
            int r0 = r4.A01()
            if (r0 != r6) goto L_0x00ed
            r0 = 0
            byte r5 = r4.A00(r0)
            r0 = 1
            byte r4 = r4.A00(r0)
        L_0x00bd:
            long r0 = r10.A00
            int r6 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r6 >= 0) goto L_0x0122
            byte[] r6 = r9.A06
            int r0 = r9.A01
            long r0 = (long) r0
            long r0 = r0 + r16
            long r0 = r0 - r14
            int r13 = (int) r0
            int r1 = r9.A00
        L_0x00ce:
            if (r13 >= r1) goto L_0x00d9
            byte r0 = r6[r13]
            if (r0 == r5) goto L_0x0125
            if (r0 == r4) goto L_0x0125
            int r13 = r13 + 1
            goto L_0x00ce
        L_0x00d9:
            int r1 = r9.A00
            int r0 = r9.A01
            int r1 = r1 - r0
            long r0 = (long) r1
            long r14 = r14 + r0
            X.4cA r9 = r9.A02
            if (r9 == 0) goto L_0x0143
            r16 = r14
            goto L_0x00bd
        L_0x00e7:
            X.4cA r9 = r9.A02
            if (r9 == 0) goto L_0x0143
            r14 = r0
            goto L_0x00a2
        L_0x00ed:
            byte[] r5 = r4.A06()
        L_0x00f1:
            long r0 = r10.A00
            int r4 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r4 >= 0) goto L_0x0122
            byte[] r8 = r9.A06
            int r0 = r9.A01
            long r0 = (long) r0
            long r0 = r0 + r16
            long r0 = r0 - r14
            int r13 = (int) r0
            int r7 = r9.A00
        L_0x0102:
            if (r13 >= r7) goto L_0x0114
            byte r6 = r8[r13]
            int r4 = r5.length
            r1 = 0
        L_0x0108:
            if (r1 >= r4) goto L_0x0111
            byte r0 = r5[r1]
            if (r6 == r0) goto L_0x0125
            int r1 = r1 + 1
            goto L_0x0108
        L_0x0111:
            int r13 = r13 + 1
            goto L_0x0102
        L_0x0114:
            int r1 = r9.A00
            int r0 = r9.A01
            int r1 = r1 - r0
            long r0 = (long) r1
            long r14 = r14 + r0
            X.4cA r9 = r9.A02
            if (r9 == 0) goto L_0x0143
            r16 = r14
            goto L_0x00f1
        L_0x0122:
            r4 = -1
            goto L_0x012a
        L_0x0125:
            int r0 = r9.A01
            int r13 = r13 - r0
            long r4 = (long) r13
            long r4 = r4 + r14
        L_0x012a:
            r8 = -1
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x013c
            long r4 = r10.A00
            long r6 = A00(r10, r11)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x013d
            r4 = -1
        L_0x013c:
            return r4
        L_0x013d:
            long r2 = java.lang.Math.max(r2, r4)
            goto L_0x0011
        L_0x0143:
            X.C18450wi.A07()
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()
            throw r0
        L_0x014b:
            java.lang.String r0 = "fromIndex < 0: "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.C13680ns.A0j(r0, r2)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0T(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass59F.AHt(X.0f6):long");
    }

    public InputStream AIN() {
        return new AnonymousClass40X(this);
    }

    public C13670mq AaI() {
        return new AnonymousClass59F(new AnonymousClass59G(this));
    }

    public long AbQ(C11050i7 r7, long j2) {
        if (j2 < 0) {
            throw AnonymousClass000.A0T(C13680ns.A0j(AnonymousClass000.A0r("byteCount < 0: "), j2));
        } else if (true ^ this.A00) {
            C11050i7 r5 = this.A01;
            if (r5.A00 == 0 && A00(r5, this) == -1) {
                return -1;
            }
            return r5.AbQ(r7, Math.min(j2, r5.A00));
        } else {
            throw AnonymousClass000.A0V("closed");
        }
    }

    public boolean AcF(long j2) {
        C11050i7 r3;
        if (j2 < 0) {
            throw AnonymousClass000.A0T(C13680ns.A0j(AnonymousClass000.A0r("byteCount < 0: "), j2));
        } else if (!(!this.A00)) {
            throw AnonymousClass000.A0V("closed");
        } else {
            do {
                r3 = this.A01;
                if (r3.A00 >= j2) {
                    return true;
                }
            } while (A00(r3, this) != -1);
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005e, code lost:
        r12.A0G((long) r14.A01[r5].A01());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a9, code lost:
        X.C18450wi.A07();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00b0, code lost:
        throw X.AnonymousClass000.A0Z();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int AdH(X.C105925Bs r18) {
        /*
            r17 = this;
            r13 = r17
            boolean r0 = r13.A00
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "closed"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        L_0x000f:
            X.0i7 r12 = r13.A01
            X.4cA r11 = r12.A01
            r10 = -1
            if (r11 == 0) goto L_0x009e
            byte[] r9 = r11.A06
            int r0 = r11.A01
            int r8 = r11.A00
            r14 = r18
            int[] r7 = r14.A00
            r6 = r11
            r2 = 0
            r5 = -1
        L_0x0023:
            int r1 = r2 + 1
            r15 = r7[r2]
            int r4 = r1 + 1
            r1 = r7[r1]
            if (r1 == r10) goto L_0x002e
            r5 = r1
        L_0x002e:
            if (r6 == 0) goto L_0x009e
            r16 = 0
            if (r15 >= 0) goto L_0x0073
            int r1 = -r15
            int r2 = r4 + r1
        L_0x0037:
            int r3 = r0 + 1
            byte r0 = r9[r0]
            r15 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r4 + 1
            r0 = r7[r4]
            if (r15 != r0) goto L_0x0098
            boolean r0 = X.AnonymousClass000.A1R(r1, r2)
            if (r3 != r8) goto L_0x006e
            X.4cA r6 = r6.A02
            if (r6 == 0) goto L_0x00a9
            int r3 = r6.A01
            byte[] r9 = r6.A06
            int r8 = r6.A00
            if (r6 != r11) goto L_0x006e
            if (r0 == 0) goto L_0x009e
            r6 = r16
        L_0x0059:
            r0 = r7[r1]
        L_0x005b:
            if (r0 < 0) goto L_0x006b
            r5 = r0
        L_0x005e:
            X.0f6[] r0 = r14.A01
            r0 = r0[r5]
            int r0 = r0.A01()
            long r0 = (long) r0
            r12.A0G(r0)
            return r5
        L_0x006b:
            int r2 = -r0
            r0 = r3
            goto L_0x0023
        L_0x006e:
            if (r0 != 0) goto L_0x0059
            r0 = r3
            r4 = r1
            goto L_0x0037
        L_0x0073:
            int r3 = r0 + 1
            byte r0 = r9[r0]
            r2 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r4 + r15
        L_0x007b:
            if (r4 == r1) goto L_0x0098
            r0 = r7[r4]
            if (r2 != r0) goto L_0x0095
            int r4 = r4 + r15
            r0 = r7[r4]
            if (r3 != r8) goto L_0x005b
            X.4cA r6 = r6.A02
            if (r6 == 0) goto L_0x00a9
            int r3 = r6.A01
            byte[] r9 = r6.A06
            int r8 = r6.A00
            if (r6 != r11) goto L_0x005b
            r6 = r16
            goto L_0x005b
        L_0x0095:
            int r4 = r4 + 1
            goto L_0x007b
        L_0x0098:
            r0 = -2
            if (r5 == r0) goto L_0x009e
            if (r5 == r10) goto L_0x00a8
            goto L_0x005e
        L_0x009e:
            long r3 = A00(r12, r13)
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x000f
        L_0x00a8:
            return r10
        L_0x00a9:
            X.C18450wi.A07()
            java.lang.RuntimeException r0 = X.AnonymousClass000.A0Z()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass59F.AdH(X.5Bs):int");
    }

    public void close() {
        if (!this.A00) {
            this.A00 = true;
            this.A02.close();
            this.A01.A0A();
        }
    }

    public boolean isOpen() {
        return !this.A00;
    }

    public int read(ByteBuffer byteBuffer) {
        C18450wi.A0G(byteBuffer, 0);
        C11050i7 r5 = this.A01;
        if (r5.A00 == 0 && A00(r5, this) == -1) {
            return -1;
        }
        return r5.read(byteBuffer);
    }

    public byte readByte() {
        if (AcF(1)) {
            return this.A01.readByte();
        }
        throw new EOFException();
    }

    public String toString() {
        return AnonymousClass3K2.A0k(this.A02, AnonymousClass000.A0r("buffer("));
    }
}
