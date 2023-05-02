package X;

import com.obwhatsapp.businessapisearch.view.fragment.BusinessApiBrowseFragment;

/* renamed from: X.3v8  reason: invalid class name and case insensitive filesystem */
public final class C77043v8 extends AnonymousClass3RR {
    public void A02() {
        String str;
        C57252qZ r1 = BusinessApiBrowseFragment.A06;
        if (r1 == null) {
            str = "viewModel";
        } else {
            C73553oL r0 = BusinessApiBrowseFragment.A05;
            if (r0 == null) {
                str = "initialCategory";
            } else {
                r1.A06(r0);
                return;
            }
        }
        throw C18450wi.A03(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        r0 = r0.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03() {
        /*
            r2 = this;
            X.2qZ r0 = com.obwhatsapp.businessapisearch.view.fragment.BusinessApiBrowseFragment.A06
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = "viewModel"
            java.lang.RuntimeException r0 = X.C18450wi.A03(r0)
            throw r0
        L_0x000b:
            X.4KD r0 = r0.A06
            X.027 r0 = r0.A00
            java.lang.Object r0 = r0.A01()
            X.4a6 r0 = (X.C88194a6) r0
            if (r0 == 0) goto L_0x0020
            X.4VT r0 = r0.A03
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = r0.A00
            r1 = 0
            if (r0 != 0) goto L_0x0021
        L_0x0020:
            r1 = 1
        L_0x0021:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C77043v8.A03():boolean");
    }
}
