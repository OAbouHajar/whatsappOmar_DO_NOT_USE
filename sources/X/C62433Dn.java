package X;

import android.graphics.Point;
import android.graphics.Rect;
import com.obwhatsapp.location.GroupChatLiveLocationsActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3Dn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C62433Dn implements C12790ky {
    public final /* synthetic */ GroupChatLiveLocationsActivity A00;

    public /* synthetic */ C62433Dn(GroupChatLiveLocationsActivity groupChatLiveLocationsActivity) {
        this.A00 = groupChatLiveLocationsActivity;
    }

    public final void ASE(AnonymousClass0IS r9) {
        Double d2;
        GroupChatLiveLocationsActivity groupChatLiveLocationsActivity = this.A00;
        AnonymousClass29W r0 = (AnonymousClass29W) r9.A0K;
        if (r0 != null) {
            C16040sK r1 = groupChatLiveLocationsActivity.A01;
            UserJid userJid = r0.A02.A06;
            if (!r1.A0I(userJid)) {
                AnonymousClass020 r12 = r9.A0J;
                AnonymousClass074 r02 = groupChatLiveLocationsActivity.A05;
                AnonymousClass00B.A06(r02);
                Point A04 = r02.A0S.A04(r12);
                Rect A0J = AnonymousClass000.A0J();
                int i2 = A04.x;
                A0J.left = i2;
                int i3 = A04.y;
                A0J.top = i3;
                A0J.right = i2;
                A0J.bottom = i3;
                AnonymousClass291 r5 = groupChatLiveLocationsActivity.A0M;
                C39721sx r2 = r5.A0m;
                Double d3 = null;
                if (r2 != null) {
                    d3 = Double.valueOf(r2.A00);
                    d2 = Double.valueOf(r2.A01);
                } else {
                    d2 = null;
                }
                AnonymousClass3AW r13 = new AnonymousClass3AW(A0J, (C15830rv) userJid, (Integer) 16);
                r13.A01 = r5.A0c;
                r13.A05 = true;
                r13.A02 = d3;
                r13.A03 = d2;
                groupChatLiveLocationsActivity.startActivity(r13.A01(groupChatLiveLocationsActivity));
            }
        }
    }
}
