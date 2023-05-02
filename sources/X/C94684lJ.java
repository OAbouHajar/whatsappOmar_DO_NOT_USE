package X;

import android.view.View;
import android.widget.AdapterView;
import com.obwhatsapp.location.PlaceInfo;

/* renamed from: X.4lJ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C94684lJ implements AdapterView.OnItemClickListener {
    public final /* synthetic */ C000900k A00;
    public final /* synthetic */ AnonymousClass29S A01;

    public /* synthetic */ C94684lJ(C000900k r1, AnonymousClass29S r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        PlaceInfo placeInfo;
        AnonymousClass29S r2 = this.A01;
        C000900k r1 = this.A00;
        int headerViewsCount = i2 - r2.A0U.getHeaderViewsCount();
        if (!r2.A0o || headerViewsCount != -1) {
            C35311li r12 = r2.A0h;
            if (r12 != null && headerViewsCount < r12.A08.size()) {
                placeInfo = (PlaceInfo) r12.A08.get(headerViewsCount);
            } else {
                return;
            }
        } else if (r2.A0p || !r2.A1N.A05(r1)) {
            placeInfo = r2.A1O;
        } else {
            r2.A08();
            return;
        }
        r2.A0P(placeInfo);
    }
}
