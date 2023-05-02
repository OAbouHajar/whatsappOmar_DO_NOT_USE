package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2yT  reason: invalid class name and case insensitive filesystem */
public final class C59552yT extends C59562yU {
    public final AnonymousClass395 A00;
    public final AnonymousClass4O7 A01;
    public final C53812gL A02;
    public final C18260wP A03;
    public final C18720x9 A04;
    public final C17190ug A05;
    public final C18630x0 A06;
    public final C18750xC A07;

    public C59552yT(C17150uc r2, AnonymousClass395 r3, AnonymousClass4O7 r4, C53812gL r5, C18260wP r6, C18720x9 r7, C17190ug r8, C18630x0 r9, C18750xC r10) {
        super(r2, r4.A04);
        this.A00 = r3;
        this.A01 = r4;
        this.A06 = r9;
        this.A05 = r8;
        this.A02 = r5;
        this.A03 = r6;
        this.A04 = r7;
        this.A07 = r10;
    }

    public void A06() {
        if (!this.A03.A0A()) {
            this.A00.A00(-1);
        } else if (this.A01.A09()) {
            A02();
        } else {
            A03();
        }
    }

    public final void A07() {
        C31081dR r1;
        if (this.A01.A05 == null && (r1 = (C31081dR) this.A06.A02.get("catalog_collections_view_tag")) != null) {
            r1.A07("datasource_collections");
        }
    }

    public void APb(String str) {
        A07();
        this.A07.A01(str);
        Log.e("GetCollectionsProtocol/onDeliveryFailure/delivery-error");
        this.A00.A00(-1);
    }

    public void AYG(C28371Vv r7, String str) {
        A07();
        this.A07.A02(str);
        C53812gL r5 = this.A02;
        C28371Vv A0J = r7.A0J("collections");
        if (A0J != null) {
            List A0O = A0J.A0O("collection");
            ArrayList A0u = AnonymousClass000.A0u();
            Iterator it = A0O.iterator();
            while (it.hasNext()) {
                C28371Vv A0S = C13690nt.A0S(it);
                if (r5.A01(A0S) != null) {
                    A0u.add(r5.A01(A0S));
                }
            }
            this.A00.A01(new AnonymousClass2GC(C61713Aa.A00(A0J.A0J("paging")), A0u), this.A01);
            return;
        }
        this.A00.A00(0);
    }
}
