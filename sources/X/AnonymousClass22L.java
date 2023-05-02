package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.22L  reason: invalid class name */
public final class AnonymousClass22L implements Iterator, C23861Dq {
    public int A00 = -1;
    public Object A01;
    public final Iterator A02;
    public final /* synthetic */ AnonymousClass22K A03;

    public AnonymousClass22L(AnonymousClass22K r2) {
        this.A03 = r2;
        this.A02 = r2.A01.iterator();
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r4 = this;
        L_0x0000:
            java.util.Iterator r1 = r4.A02
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0024
            java.lang.Object r3 = r1.next()
            X.22K r2 = r4.A03
            X.22J r0 = r2.A00
            java.lang.Object r0 = r0.AIU(r3)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            boolean r0 = r2.A02
            if (r1 != r0) goto L_0x0000
            r4.A01 = r3
            r0 = 1
        L_0x0021:
            r4.A00 = r0
            return
        L_0x0024:
            r0 = 0
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass22L.A00():void");
    }

    public boolean hasNext() {
        if (this.A00 == -1) {
            A00();
        }
        return this.A00 == 1;
    }

    public Object next() {
        if (this.A00 == -1) {
            A00();
        }
        if (this.A00 != 0) {
            Object obj = this.A01;
            this.A01 = null;
            this.A00 = -1;
            return obj;
        }
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
