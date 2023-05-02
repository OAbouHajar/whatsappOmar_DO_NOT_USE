package X;

import com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity;
import java.util.Map;

/* renamed from: X.4le  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C94894le implements AnonymousClass05g {
    public final /* synthetic */ BusinessDirectoryMapViewActivity A00;

    public /* synthetic */ C94894le(BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity) {
        this.A00 = businessDirectoryMapViewActivity;
    }

    public final void AM3(Object obj) {
        BusinessDirectoryMapViewActivity businessDirectoryMapViewActivity = this.A00;
        Map map = (Map) obj;
        C18450wi.A0H(map, 1);
        Boolean bool = (Boolean) map.get("android.permission.ACCESS_FINE_LOCATION");
        if (bool != null && bool.booleanValue()) {
            AnonymousClass269 r2 = businessDirectoryMapViewActivity.A0M;
            if (r2 == null) {
                throw C18450wi.A03("viewModel");
            }
            r2.A0U.A00(5);
            C13680ns.A1O(r2.A0O, 1);
            C13680ns.A1O(r2.A0f, 0);
        }
    }
}
