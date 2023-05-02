package X;

import com.google.android.gms.maps.model.LatLng;
import com.obwhatsapp.location.GroupChatLiveLocationsActivity;
import java.util.List;

/* renamed from: X.3Do  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C62443Do implements C12800kz {
    public final /* synthetic */ GroupChatLiveLocationsActivity A00;

    public /* synthetic */ C62443Do(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        this.A00 = groupChatLiveLocationsActivity;
    }

    public final void ATG(AnonymousClass020 r8) {
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = this.A00;
        AnonymousClass291 r6 = groupChatLiveLocationsActivity.A0M;
        if (r6.A0l != null) {
            r6.A0B();
            return;
        }
        AnonymousClass29W A07 = r6.A07(new LatLng(r8.A00, r8.A01));
        if (A07 != null) {
            List list = A07.A04;
            if (list.size() == 1) {
                groupChatLiveLocationsActivity.A0M.A0R(A07, true);
                ((AnonymousClass0IS) groupChatLiveLocationsActivity.A0S.get(A07.A03)).A0F();
            } else if (groupChatLiveLocationsActivity.A05.A02().A02 >= 16.0f) {
                groupChatLiveLocationsActivity.A0M.A0R(A07, true);
            } else {
                groupChatLiveLocationsActivity.A38(list, true);
                groupChatLiveLocationsActivity.A0M.A0j = new AnonymousClass4I5(list, groupChatLiveLocationsActivity.A05.A02().A02);
            }
        }
    }
}
