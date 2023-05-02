package X;

import com.facebook.redex.IDxRCallbackShape49S0200000_2_I0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1Ok  reason: invalid class name and case insensitive filesystem */
public class C26601Ok {
    public final C17190ug A00;

    public C26601Ok(C17190ug r1) {
        this.A00 = r1;
    }

    public void A00(AnonymousClass2SC r14, boolean z2) {
        C17190ug r6 = this.A00;
        String A02 = r6.A02();
        String str = z2 ? "true" : "false";
        AnonymousClass4J7 r5 = new AnonymousClass4J7(new C51812cK(A02));
        C32461gQ r4 = new C32461gQ("iq");
        C32461gQ r2 = new C32461gQ("first_party_migration");
        r2.A0A(str, "intent", C818549z.A00);
        r4.A03(r2.A01());
        C28371Vv r1 = r5.A00;
        r4.A05(r1, new ArrayList());
        List list = Collections.EMPTY_LIST;
        r4.A07(r1, list, new ArrayList());
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[0]));
        arrayList.addAll(0, list);
        r5.A01.A00(r4, arrayList);
        r6.A0A(new IDxRCallbackShape49S0200000_2_I0(r14, 5, this), r4.A01(), A02, 357, 32000);
    }
}
