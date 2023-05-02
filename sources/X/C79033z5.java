package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.3z5  reason: invalid class name and case insensitive filesystem */
public class C79033z5 extends C16690tT {
    public final C85614Pd A00;
    public final AnonymousClass1CX A01;

    public C79033z5(C85614Pd r1, AnonymousClass1CX r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass1CX r6 = this.A01;
        List A08 = r6.A08();
        List A07 = r6.A07();
        C38371qg r3 = new C38371qg();
        ArrayList A0i = C13690nt.A0i(A08.size() + A07.size());
        A0i.addAll(A08);
        A0i.addAll(A07);
        Collections.sort(A0i, r3);
        A07(A0i);
        List A0A = r6.A0A((C38381qh) null);
        ArrayList A0n = C13680ns.A0n(A08);
        A0n.addAll(A0A);
        Collections.sort(A0n, r3);
        return A0n;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        List list = (List) obj;
        AnonymousClass00B.A06(list);
        this.A00.A00(list);
    }
}
