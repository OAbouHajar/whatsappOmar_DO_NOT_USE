package X;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.commons.io.FilenameUtils;

/* renamed from: X.3IV  reason: invalid class name */
public final class AnonymousClass3IV implements Iterator, C23861Dq {
    public int A00;
    public int A01;
    public int A02;
    public int A03 = -1;
    public C440922s A04;
    public final /* synthetic */ C1053058z A05;

    public AnonymousClass3IV(C1053058z r5) {
        this.A05 = r5;
        int length = r5.A01.length();
        if (0 <= length) {
            this.A01 = 0;
            this.A02 = 0;
            return;
        }
        StringBuilder A0r = AnonymousClass000.A0r("Cannot coerce value to an empty range: maximum ");
        A0r.append(length);
        A0r.append(" is less than minimum ");
        A0r.append(0);
        A0r.append(FilenameUtils.EXTENSION_SEPARATOR);
        throw AnonymousClass000.A0T(A0r.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r0 < r1) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r8 = this;
            int r7 = r8.A02
            r5 = 0
            if (r7 >= 0) goto L_0x000b
            r8.A03 = r5
            r0 = 0
            r8.A04 = r0
            return
        L_0x000b:
            X.58z r6 = r8.A05
            int r1 = r6.A00
            r2 = -1
            r3 = 1
            if (r1 <= 0) goto L_0x001b
            int r0 = r8.A00
            int r0 = r0 + 1
            r8.A00 = r0
            if (r0 >= r1) goto L_0x0053
        L_0x001b:
            java.lang.CharSequence r4 = r6.A01
            int r0 = r4.length()
            if (r7 > r0) goto L_0x0053
            X.1UJ r1 = r6.A02
            int r0 = r8.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r1.AIV(r4, r0)
            X.1Jq r1 = (X.C25401Jq) r1
            if (r1 == 0) goto L_0x0053
            java.lang.Object r0 = r1.first
            int r2 = X.AnonymousClass000.A0D(r0)
            java.lang.Object r0 = r1.second
            int r1 = X.AnonymousClass000.A0D(r0)
            int r0 = r8.A01
            X.22s r0 = X.C008203t.A03(r0, r2)
            r8.A04 = r0
            int r2 = r2 + r1
            r8.A01 = r2
            if (r1 != 0) goto L_0x004d
            r5 = 1
        L_0x004d:
            int r2 = r2 + r5
        L_0x004e:
            r8.A02 = r2
            r8.A03 = r3
            return
        L_0x0053:
            int r4 = r8.A01
            java.lang.CharSequence r0 = r6.A01
            int r0 = r0.length()
            int r1 = r0 + -1
            X.22s r0 = new X.22s
            r0.<init>(r4, r1)
            r8.A04 = r0
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3IV.A00():void");
    }

    public boolean hasNext() {
        if (this.A03 == -1) {
            A00();
        }
        return C13690nt.A1R(this.A03);
    }

    public /* bridge */ /* synthetic */ Object next() {
        if (this.A03 == -1) {
            A00();
        }
        if (this.A03 != 0) {
            C440922s r1 = this.A04;
            if (r1 != null) {
                this.A04 = null;
                this.A03 = -1;
                return r1;
            }
            throw AnonymousClass000.A0W("null cannot be cast to non-null type kotlin.ranges.IntRange");
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
