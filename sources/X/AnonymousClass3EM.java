package X;

import android.view.View;
import com.obwhatsapp.location.GroupChatLiveLocationsActivity2;
import java.util.List;

/* renamed from: X.3EM  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3EM implements AnonymousClass5OE {
    public final /* synthetic */ GroupChatLiveLocationsActivity2 A00;

    public /* synthetic */ AnonymousClass3EM(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        this.A00 = groupChatLiveLocationsActivity2;
    }

    public final boolean ATM(C32451gN r7) {
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = this.A00;
        AnonymousClass00B.A06(groupChatLiveLocationsActivity2.A06);
        AnonymousClass291 r0 = groupChatLiveLocationsActivity2.A0N;
        r0.A0u = true;
        r0.A0s = false;
        View view = r0.A0U;
        C39721sx r1 = r0.A0m;
        int i2 = 8;
        if (r1 == null) {
            i2 = 0;
        }
        view.setVisibility(i2);
        if (r7.A01() instanceof AnonymousClass29W) {
            AnonymousClass29W r2 = (AnonymousClass29W) r7.A01();
            if (!r7.A0A()) {
                r2 = groupChatLiveLocationsActivity2.A0N.A08((C39721sx) r2.A04.get(0));
                if (r2 != null) {
                    r7 = (C32451gN) groupChatLiveLocationsActivity2.A0T.get(r2.A03);
                }
            }
            if (r2.A00 != 1) {
                List list = r2.A04;
                if (list.size() == 1) {
                    groupChatLiveLocationsActivity2.A0N.A0R(r2, true);
                    r7.A04();
                    return true;
                } else if (groupChatLiveLocationsActivity2.A06.A02().A02 >= 16.0f) {
                    groupChatLiveLocationsActivity2.A0N.A0R(r2, true);
                    return true;
                } else {
                    groupChatLiveLocationsActivity2.A37(list, true);
                    groupChatLiveLocationsActivity2.A0N.A0j = new AnonymousClass4I5(list, groupChatLiveLocationsActivity2.A06.A02().A02);
                    return true;
                }
            }
        }
        groupChatLiveLocationsActivity2.A0N.A0B();
        return true;
    }
}
