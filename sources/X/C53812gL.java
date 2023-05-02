package X;

import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2gL  reason: invalid class name and case insensitive filesystem */
public class C53812gL {
    public final C61713Aa A00;

    public C53812gL(C61713Aa r1) {
        this.A00 = r1;
    }

    public static C53822gM A00(C28371Vv r8) {
        int i2;
        boolean z2 = false;
        if (r8 == null) {
            return new C53822gM((String) null, (String) null, 0, false);
        }
        C28371Vv A0J = r8.A0J("status");
        C28371Vv A0J2 = r8.A0J("can_appeal");
        C28371Vv A0J3 = r8.A0J("reject_reason");
        C28371Vv A0J4 = r8.A0J("commerce_url");
        String str = null;
        String A0L = A0J == null ? null : A0J.A0L();
        if (AnonymousClass1ZW.A0E(A0L) || "approved".equalsIgnoreCase(A0L)) {
            i2 = 0;
        } else {
            i2 = 1;
            if ("rejected".equalsIgnoreCase(A0L)) {
                i2 = 2;
            }
        }
        String A0L2 = A0J3 == null ? null : A0J3.A0L();
        if (A0J4 != null) {
            str = A0J4.A0L();
        }
        if (A0J2 != null && Boolean.parseBoolean(A0J2.A0L())) {
            z2 = true;
        }
        return new C53822gM(A0L2, str, i2, z2);
    }

    public AnonymousClass2GE A01(C28371Vv r8) {
        List<C28371Vv> A0O = r8.A0O("product");
        ArrayList arrayList = new ArrayList();
        for (C28371Vv A02 : A0O) {
            C35701mM A022 = this.A00.A02(A02);
            if (A022 != null) {
                arrayList.add(A022);
            }
        }
        C28371Vv A0J = r8.A0J("id");
        C28371Vv A0J2 = r8.A0J(FacebookFacade.RequestParameter.NAME);
        C28371Vv A0J3 = r8.A0J("status_info");
        String A0L = A0J == null ? null : A0J.A0L();
        String A0L2 = A0J2 == null ? null : A0J2.A0L();
        if (A0L != null && A0L2 != null) {
            return new AnonymousClass2GE(A00(A0J3), (Integer) null, A0L, A0L2, arrayList);
        }
        Log.e("CollectionParser/parseCollectionNode/required fields missing");
        return null;
    }
}
