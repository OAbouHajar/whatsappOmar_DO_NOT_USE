package X;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.2qf  reason: invalid class name and case insensitive filesystem */
public class C57292qf extends C003401n {
    public C16010sH A00;
    public Set A01 = C13680ns.A0o();
    public final C16300so A02;
    public final AnonymousClass12A A03;
    public final C216114t A04;
    public final C17240ul A05;
    public final AnonymousClass121 A06;
    public final AnonymousClass2OJ A07 = new AnonymousClass2OJ(C13680ns.A0o());
    public final AnonymousClass2OJ A08 = new AnonymousClass2OJ(C13680ns.A0o());
    public final AnonymousClass2OJ A09 = new AnonymousClass2OJ(C13680ns.A0o());
    public final C16320sq A0A;
    public final Collection A0B;
    public final Set A0C = C13680ns.A0o();

    public C57292qf(C16300so r3, AnonymousClass12A r4, C216114t r5, C17240ul r6, AnonymousClass121 r7, C16320sq r8, Collection collection) {
        this.A02 = r3;
        this.A0A = r8;
        this.A05 = r6;
        this.A03 = r4;
        this.A06 = r7;
        this.A04 = r5;
        this.A0B = collection;
    }

    public final void A05() {
        HashSet A0o = C13680ns.A0o();
        C16010sH r0 = this.A00;
        if (r0 != null) {
            A0o.add(r0);
        }
        A0o.addAll(this.A01);
        A0o.addAll(this.A0C);
        this.A07.A09(Collections.unmodifiableSet(A0o));
    }
}
