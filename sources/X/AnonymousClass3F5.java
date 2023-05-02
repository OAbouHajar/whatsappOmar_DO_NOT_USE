package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragment;

/* renamed from: X.3F5  reason: invalid class name */
public final class AnonymousClass3F5 implements AnonymousClass5RY {
    public final /* synthetic */ CatalogSearchFragment A00;

    public AnonymousClass3F5(CatalogSearchFragment catalogSearchFragment) {
        this.A00 = catalogSearchFragment;
    }

    public void ASd(C35701mM r7, long j2) {
        CatalogSearchFragment catalogSearchFragment = this.A00;
        View A06 = catalogSearchFragment.A06();
        AnonymousClass013 r4 = catalogSearchFragment.A0O;
        if (r4 != null) {
            Object[] A1b = C13680ns.A1b();
            A1b[0] = Long.valueOf(j2);
            C32291fz.A01(A06, r4.A0J(A1b, R.plurals.plurals011c, j2), -1).A03();
            return;
        }
        throw C18450wi.A03("whatsAppLocale");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.2Xy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.2Xy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: X.2Xy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: X.2Xy} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AVY(X.C35701mM r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, int r25, long r26) {
        /*
            r20 = this;
            r0 = r20
            com.obwhatsapp.catalogsearch.view.fragment.CatalogSearchFragment r1 = r0.A00
            X.0qW r0 = r1.A0Y
            java.lang.Object r4 = r0.getValue()
            X.2Xa r4 = (X.C49982Xa) r4
            com.whatsapp.jid.UserJid r8 = r1.A0P
            if (r8 != 0) goto L_0x0017
            java.lang.String r0 = "bizJid"
            java.lang.RuntimeException r0 = X.C18450wi.A03(r0)
            throw r0
        L_0x0017:
            r7 = r21
            java.lang.String r3 = r7.A0D
            X.C18450wi.A0A(r3)
            X.2Xb r6 = r4.A04
            X.027 r0 = r6.A00
            r5 = 0
            r12 = r26
            if (r0 == 0) goto L_0x0072
            java.lang.Object r0 = r0.A01()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            if (r0 == 0) goto L_0x0072
            java.util.Iterator r2 = r0.iterator()
        L_0x0033:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x004b
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.2Xy r0 = (X.C50102Xy) r0
            X.1mM r0 = r0.A01
            java.lang.String r0 = r0.A0D
            boolean r0 = X.C18450wi.A0R(r0, r3)
            if (r0 == 0) goto L_0x0033
            r5 = r1
        L_0x004b:
            X.2Xy r5 = (X.C50102Xy) r5
            if (r5 == 0) goto L_0x0072
            long r1 = r5.A00
            int r0 = (r1 > r26 ? 1 : (r1 == r26 ? 0 : -1))
            if (r0 < 0) goto L_0x0072
            X.1PR r14 = r4.A03
            java.lang.Integer r18 = java.lang.Integer.valueOf(r25)
            r0 = 5
        L_0x005c:
            java.lang.Integer r16 = java.lang.Integer.valueOf(r0)
            r17 = 0
            r15 = r8
            r19 = r3
            r14.A00(r15, r16, r17, r18, r19)
            r9 = r22
            r10 = r23
            r11 = r24
            r6.A01(r7, r8, r9, r10, r11, r12)
            return
        L_0x0072:
            X.1PR r14 = r4.A03
            java.lang.Integer r18 = java.lang.Integer.valueOf(r25)
            r0 = 4
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3F5.AVY(X.1mM, java.lang.String, java.lang.String, java.lang.String, int, long):void");
    }
}
