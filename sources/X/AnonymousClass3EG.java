package X;

import com.google.android.gms.maps.model.LatLng;
import com.obwhatsapp.location.GroupChatLiveLocationsActivity2;

/* renamed from: X.3EG  reason: invalid class name */
public class AnonymousClass3EG implements AnonymousClass5RJ {
    public final /* synthetic */ GroupChatLiveLocationsActivity2 A00;

    public AnonymousClass3EG(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        this.A00 = groupChatLiveLocationsActivity2;
    }

    public void AO4() {
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = this.A00;
        groupChatLiveLocationsActivity2.A0X = false;
        AnonymousClass00B.A06(groupChatLiveLocationsActivity2.A06);
    }

    public void ARM() {
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = this.A00;
        groupChatLiveLocationsActivity2.A0X = false;
        AnonymousClass2NT r0 = groupChatLiveLocationsActivity2.A06;
        AnonymousClass00B.A06(r0);
        r0.A04();
        AnonymousClass291 r2 = groupChatLiveLocationsActivity2.A0N;
        if (r2.A0j != null) {
            r2.A0W(Float.valueOf(groupChatLiveLocationsActivity2.A06.A02().A02));
            return;
        }
        AnonymousClass29W r02 = r2.A0l;
        if (r02 != null) {
            LatLng A002 = r02.A00();
            if (!groupChatLiveLocationsActivity2.A06.A00().A02().A04.A00(A002) && !groupChatLiveLocationsActivity2.A0N.A0t) {
                groupChatLiveLocationsActivity2.A0X = true;
                groupChatLiveLocationsActivity2.A06.A0B(AnonymousClass2R8.A02(A002, Math.min(groupChatLiveLocationsActivity2.A00 * 2.0f, 16.0f)), this);
            }
        } else if (!r2.A0u && groupChatLiveLocationsActivity2.A0Y) {
            groupChatLiveLocationsActivity2.A0Y = false;
            groupChatLiveLocationsActivity2.A38(true);
        }
    }
}
