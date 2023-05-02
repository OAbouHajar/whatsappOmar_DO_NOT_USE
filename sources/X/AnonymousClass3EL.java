package X;

import android.graphics.Point;
import android.graphics.Rect;
import com.google.android.gms.maps.model.LatLng;
import com.obwhatsapp.location.GroupChatLiveLocationsActivity2;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3EL  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3EL implements AnonymousClass5OC {
    public final /* synthetic */ GroupChatLiveLocationsActivity2 A00;

    public /* synthetic */ AnonymousClass3EL(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        this.A00 = groupChatLiveLocationsActivity2;
    }

    public final void ASF(C32451gN r10) {
        Double d2;
        Double d3;
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = this.A00;
        AnonymousClass29W r0 = (AnonymousClass29W) r10.A01();
        if (r0 != null) {
            C16040sK r1 = groupChatLiveLocationsActivity2.A01;
            UserJid userJid = r0.A02.A06;
            if (!r1.A0I(userJid)) {
                groupChatLiveLocationsActivity2.A0M.getLocationOnScreen(new int[2]);
                LatLng A002 = r10.A00();
                AnonymousClass2NT r02 = groupChatLiveLocationsActivity2.A06;
                AnonymousClass00B.A06(r02);
                Point A003 = r02.A00().A00(A002);
                Rect A0J = AnonymousClass000.A0J();
                int i2 = A003.x;
                A0J.left = i2;
                int i3 = A003.y;
                A0J.top = i3;
                A0J.right = i2;
                A0J.bottom = i3;
                AnonymousClass291 r5 = groupChatLiveLocationsActivity2.A0N;
                C39721sx r2 = r5.A0m;
                if (r2 != null) {
                    d2 = Double.valueOf(r2.A00);
                    d3 = Double.valueOf(r2.A01);
                } else {
                    d2 = null;
                    d3 = null;
                }
                AnonymousClass3AW r12 = new AnonymousClass3AW(A0J, (C15830rv) userJid, (Integer) null);
                r12.A01 = r5.A0c;
                r12.A05 = true;
                r12.A02 = d2;
                r12.A03 = d3;
                groupChatLiveLocationsActivity2.startActivity(r12.A01(groupChatLiveLocationsActivity2));
            }
        }
    }
}
