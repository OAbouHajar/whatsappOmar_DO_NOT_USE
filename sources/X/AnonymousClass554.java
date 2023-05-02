package X;

import java.util.Iterator;

/* renamed from: X.554  reason: invalid class name */
public final /* synthetic */ class AnonymousClass554 implements Iterable {
    public final /* synthetic */ C801442s A00;
    public final /* synthetic */ C26071Mf A01;
    public final /* synthetic */ CharSequence A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ AnonymousClass554(C801442s r1, C26071Mf r2, CharSequence charSequence, String str) {
        this.A01 = r2;
        this.A02 = charSequence;
        this.A03 = str;
        this.A00 = r1;
    }

    public final Iterator iterator() {
        return new AnonymousClass3IU(this.A00, this.A01, this.A02, this.A03);
    }
}
