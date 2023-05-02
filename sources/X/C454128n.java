package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.28n  reason: invalid class name and case insensitive filesystem */
public class C454128n {
    public final C14870pt A00;
    public final C218015m A01;
    public final AnonymousClass11H A02;
    public final C16070sO A03;
    public final C217815k A04;
    public final C217415g A05;
    public final C16320sq A06;

    public C454128n(C14870pt r1, C218015m r2, AnonymousClass11H r3, C16070sO r4, C217815k r5, C217415g r6, C16320sq r7) {
        this.A00 = r1;
        this.A06 = r7;
        this.A04 = r5;
        this.A02 = r3;
        this.A01 = r2;
        this.A05 = r6;
        this.A03 = r4;
    }

    public List A00(C16050sL r6) {
        List<C39461sW> A012 = this.A04.A01(r6);
        ArrayList arrayList = new ArrayList();
        for (C39461sW r2 : A012) {
            if (this.A03.A09(r2.A02)) {
                arrayList.add(r2);
            }
        }
        return arrayList;
    }
}
