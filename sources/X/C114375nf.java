package X;

import com.facebook.redex.IDxComparatorShape185S0100000_3_I1;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5nf  reason: invalid class name and case insensitive filesystem */
public class C114375nf extends C16690tT {
    public final AnonymousClass1Z7 A00;
    public final C18290wS A01;

    public C114375nf(AnonymousClass1Z7 r1, C18290wS r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        List A0i = C110105dW.A0i(this.A01);
        if (A0i.size() <= 0) {
            return null;
        }
        Collections.sort(A0i, new IDxComparatorShape185S0100000_3_I1(this, 1));
        C30671cl r5 = (C30671cl) C13690nt.A0Z(A0i);
        C39901tF r0 = r5.A08;
        if (r0 == null || ((C39891tE) r0).A06 < 0) {
            return null;
        }
        return new AnonymousClass01Q(Integer.valueOf(A0i.size()), r5);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        AnonymousClass01Q r6 = (AnonymousClass01Q) obj;
        if (r6 != null) {
            Object obj2 = r6.A01;
            AnonymousClass00B.A06(obj2);
            C30671cl r4 = (C30671cl) obj2;
            HashMap A0x = AnonymousClass000.A0x();
            A0x.put("credential_id", r4.A0A);
            A0x.put("last4", C110105dW.A0d(r4.A09));
            A0x.put("remaining_cards", AnonymousClass000.A0f(r6.A00, AnonymousClass000.A0r("")));
            C39891tE r0 = (C39891tE) r4.A08;
            A0x.put("remaining_retries", r0 != null ? AnonymousClass000.A0l(AnonymousClass000.A0q(""), r0.A04) : "-1");
            this.A00.A01("on_success", A0x);
            return;
        }
        this.A00.A00("on_failure");
    }
}
