package X;

import java.util.Iterator;

/* renamed from: X.58z  reason: invalid class name and case insensitive filesystem */
public final class C1053058z implements AnonymousClass22G {
    public final int A00;
    public final CharSequence A01;
    public final AnonymousClass1UJ A02;

    public C1053058z(CharSequence charSequence, AnonymousClass1UJ r2, int i2) {
        this.A01 = charSequence;
        this.A00 = i2;
        this.A02 = r2;
    }

    public Iterator iterator() {
        return new AnonymousClass3IV(this);
    }
}
