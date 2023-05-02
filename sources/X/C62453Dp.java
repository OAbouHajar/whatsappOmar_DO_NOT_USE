package X;

import com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity;
import java.util.Map;

/* renamed from: X.3Dp  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C62453Dp implements C12810l0 {
    public final /* synthetic */ AnonymousClass074 A00;
    public final /* synthetic */ BusinessDirectoryMapViewActivity A01;

    public /* synthetic */ C62453Dp(AnonymousClass074 r1, BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity) {
        this.A01 = businessDirectoryMapViewActivity;
        this.A00 = r1;
    }

    public final void ATI() {
        BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity = this.A01;
        AnonymousClass074 r7 = this.A00;
        AnonymousClass269 r6 = businessDirectoryMapViewActivity.A0M;
        if (r6 != null) {
            C17210ui r2 = r6.A0U;
            C29151a7 r1 = new C29151a7();
            r1.A07 = 0;
            r2.A06(r1);
            Map map = r6.A0S.A03;
            AnonymousClass4KG r0 = (AnonymousClass4KG) map.get("saved-state-last-known-location");
            if (r0 != null) {
                r6.A06 = r0;
            }
            Object obj = map.get("saved-state-error-dialog");
            if (obj != null) {
                r6.A0M.A0B(obj);
            }
            Iterable<C93714je> iterable = (Iterable) map.get("saved-state-marker-items");
            if (iterable != null) {
                r6.A0P.A0B(iterable);
                for (C93714je r3 : iterable) {
                    AnonymousClass1US r22 = r3.A03;
                    if (r22 != null) {
                        Map map2 = r6.A0D;
                        String str = r22.A0B;
                        C18450wi.A0A(str);
                        map2.put(str, r3);
                        if (r3.A01) {
                            r6.A0G(r22);
                        }
                    }
                }
            }
            Boolean bool = (Boolean) map.get("saved-state-search-business-chip-visible");
            if (bool != null) {
                r6.A0L = bool.booleanValue();
            }
            C73563oM r02 = (C73563oM) map.get("saved-state-selected-category");
            if (r02 != null) {
                r6.A09 = r02;
                r6.A06();
            }
            Object obj2 = map.get("saved-state-map-view-chip-state");
            if (obj2 != null) {
                r6.A0O.A0B(obj2);
            }
            Number number = (Number) map.get("saved-state-marker_state");
            if (number != null) {
                r6.A00 = number.intValue();
            }
            String A0e = C13690nt.A0e("saved-state-view_state", map);
            if (A0e != null) {
                r6.A0C = A0e;
            }
            AnonymousClass269 r23 = businessDirectoryMapViewActivity.A0M;
            if (r23 != null) {
                AnonymousClass0YG A02 = r7.A02();
                C06540Wn r03 = r7.A0S;
                C18450wi.A0B(r03);
                r23.A0C(r03, A02);
                return;
            }
        }
        throw C18450wi.A03("viewModel");
    }
}
