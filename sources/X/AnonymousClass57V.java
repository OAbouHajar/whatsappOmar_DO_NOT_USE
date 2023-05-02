package X;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: X.57V  reason: invalid class name */
public final class AnonymousClass57V implements Iterator {
    public int A00 = 0;
    public final int A01;
    public final /* synthetic */ AnonymousClass557 A02;

    public AnonymousClass57V(AnonymousClass557 r2) {
        this.A02 = r2;
        this.A01 = r2.A02();
    }

    public final boolean hasNext() {
        return AnonymousClass3K3.A1Q(this.A00, this.A01);
    }

    public /* synthetic */ Object next() {
        byte b2;
        int i2 = this.A00;
        if (i2 < this.A01) {
            this.A00 = i2 + 1;
            C66963am r2 = (C66963am) this.A02;
            if (r2 instanceof C66953al) {
                C66953al r22 = (C66953al) r2;
                b2 = r22.zzb[r22.zzc + i2];
            } else {
                b2 = r2.zzb[i2];
            }
            return Byte.valueOf(b2);
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw C13680ns.A0m();
    }
}
