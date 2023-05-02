package X;

import android.graphics.Point;
import com.obwhatsapp.location.GroupChatLiveLocationsActivity;

/* renamed from: X.3Dl  reason: invalid class name and case insensitive filesystem */
public class C62413Dl implements AnonymousClass077 {
    public final /* synthetic */ GroupChatLiveLocationsActivity A00;

    public C62413Dl(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        this.A00 = groupChatLiveLocationsActivity;
    }

    public void AO4() {
        this.A00.A0W = false;
    }

    public void ARM() {
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = this.A00;
        groupChatLiveLocationsActivity.A0W = false;
        AnonymousClass074 r2 = groupChatLiveLocationsActivity.A05;
        AnonymousClass00B.A06(r2);
        AnonymousClass291 r1 = groupChatLiveLocationsActivity.A0M;
        C39721sx r0 = r1.A0o;
        if (r0 != null) {
            AnonymousClass020 r4 = new AnonymousClass020(r0.A00, r0.A01);
            Point A04 = r2.A0S.A04(r4);
            int i2 = A04.x;
            if (i2 <= 0 || A04.y <= 0 || i2 >= groupChatLiveLocationsActivity.A0L.getWidth() || A04.y >= groupChatLiveLocationsActivity.A0L.getHeight()) {
                groupChatLiveLocationsActivity.A0W = true;
                groupChatLiveLocationsActivity.A05.A0A(AnonymousClass0T2.A01(r4, groupChatLiveLocationsActivity.A00 * 2.0f), this, 1500);
            }
        } else if (!r1.A0u && groupChatLiveLocationsActivity.A0X) {
            groupChatLiveLocationsActivity.A0X = false;
            groupChatLiveLocationsActivity.A39(true);
        }
    }
}
