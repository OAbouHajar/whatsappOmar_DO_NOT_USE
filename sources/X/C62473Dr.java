package X;

import android.view.View;
import com.obwhatsapp.location.GroupChatLiveLocationsActivity;
import java.util.List;

/* renamed from: X.3Dr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C62473Dr implements C12820l1 {
    public final /* synthetic */ GroupChatLiveLocationsActivity A00;

    public /* synthetic */ C62473Dr(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        this.A00 = groupChatLiveLocationsActivity;
    }

    public final boolean ATL(AnonymousClass0IS r7) {
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = this.A00;
        AnonymousClass291 r0 = groupChatLiveLocationsActivity.A0M;
        r0.A0u = true;
        r0.A0s = false;
        View view = r0.A0U;
        C39721sx r1 = r0.A0m;
        int i2 = 8;
        if (r1 == null) {
            i2 = 0;
        }
        view.setVisibility(i2);
        Object obj = r7.A0K;
        if (obj instanceof AnonymousClass29W) {
            AnonymousClass29W r2 = (AnonymousClass29W) obj;
            if (!r7.A04) {
                r2 = groupChatLiveLocationsActivity.A0M.A08((C39721sx) r2.A04.get(0));
                if (r2 != null) {
                    r7 = (AnonymousClass0IS) groupChatLiveLocationsActivity.A0S.get(r2.A03);
                }
            }
            if (r2.A00 != 1) {
                List list = r2.A04;
                if (list.size() == 1) {
                    groupChatLiveLocationsActivity.A0M.A0R(r2, true);
                    r7.A0F();
                    return true;
                }
                AnonymousClass074 r02 = groupChatLiveLocationsActivity.A05;
                AnonymousClass00B.A06(r02);
                if (r02.A02().A02 >= 16.0f) {
                    groupChatLiveLocationsActivity.A0M.A0R(r2, true);
                    return true;
                }
                groupChatLiveLocationsActivity.A38(list, true);
                groupChatLiveLocationsActivity.A0M.A0j = new AnonymousClass4I5(list, groupChatLiveLocationsActivity.A05.A02().A02);
                return true;
            }
        }
        groupChatLiveLocationsActivity.A0M.A0B();
        return true;
    }
}
