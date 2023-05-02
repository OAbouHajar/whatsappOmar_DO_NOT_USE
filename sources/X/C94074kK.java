package X;

import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import com.facebook.redex.IDxCListenerShape61S0200000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.community.CommunityMembersActivity;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.4kK  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C94074kK implements View.OnCreateContextMenuListener {
    public final /* synthetic */ C64983Sk A00;
    public final /* synthetic */ C86954Uu A01;
    public final /* synthetic */ AnonymousClass4SD A02;

    public /* synthetic */ C94074kK(C64983Sk r1, C86954Uu r2, AnonymousClass4SD r3) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public static void A00(MenuItem menuItem, Object obj, Object obj2, int i2) {
        menuItem.setOnMenuItemClickListener(new IDxCListenerShape61S0200000_2_I1(obj, i2, obj2));
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        MenuItem menuItem;
        int i2;
        C64983Sk r0 = this.A00;
        AnonymousClass4SD r4 = this.A02;
        C86954Uu r1 = this.A01;
        r0.A00.getContext();
        UserJid userJid = r1.A03;
        int i3 = r1.A01;
        if (userJid != null) {
            C16040sK r10 = r4.A02;
            if (!r10.A0I(userJid)) {
                C16010sH A0A = r4.A06.A0A(userJid);
                String A0C = r4.A07.A0C(A0A);
                CommunityMembersActivity communityMembersActivity = r4.A04;
                A00(contextMenu.add(communityMembersActivity.getResources().getString(R.string.str0d32, new Object[]{A0C})), r4, A0A, 0);
                if (A0A.A0D != null) {
                    A00(contextMenu.add(communityMembersActivity.getResources().getString(R.string.str19d6, new Object[]{A0C})), r4, A0A, 1);
                } else if (!r10.A0G()) {
                    A00(contextMenu.add(R.string.str00a6), r4, userJid, 5);
                    A00(contextMenu.add(R.string.str00af), r4, userJid, 4);
                }
                A00(contextMenu.add(R.string.str1ddb), r4, userJid, 7);
            }
        }
        if (r4.A00) {
            if (i3 == 0) {
                contextMenu.add(R.string.str131d).setOnMenuItemClickListener(new C93884jv(r4, userJid));
            } else if (i3 == 1) {
                A00(contextMenu.add(R.string.str06bd), r4, userJid, 2);
            } else if (i3 != 2) {
                Log.e(C13680ns.A0c(i3, "admin-context-menu/Unsupported community participant rank: "));
                if (i3 == 2) {
                    return;
                }
            } else if (r4.A02.A0I(userJid)) {
                menuItem = contextMenu.add(R.string.str06bd);
                i2 = 3;
                A00(menuItem, r4, userJid, i2);
            } else {
                return;
            }
            if (!r4.A02.A0I(userJid)) {
                menuItem = contextMenu.add(r4.A04.getResources().getString(R.string.str1401, AnonymousClass000.A1a(r4.A07.A0C(r4.A06.A0A(userJid)))));
                i2 = 6;
                A00(menuItem, r4, userJid, i2);
            }
        }
    }
}
