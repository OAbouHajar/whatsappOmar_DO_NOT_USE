package X;

import android.content.res.Resources;
import com.facebook.redex.IDxRCallbackShape230S0100000_1_I1;
import com.mod2.fblibs.FacebookFacade;
import com.obwhatsapp.R;
import com.obwhatsapp.group.GroupChatInfoActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.3Fo  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C62953Fo implements C108805Pk {
    public final /* synthetic */ AnonymousClass37S A00;

    public /* synthetic */ C62953Fo(AnonymousClass37S r1) {
        this.A00 = r1;
    }

    public final void AQS(int i2, String str) {
        C14870pt r1;
        int i3;
        GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00.A07.get();
        if (groupChatInfoActivity != null) {
            int i4 = i2;
            if (i4 == 403) {
                r1 = groupChatInfoActivity.A05;
                i3 = R.string.str0a8a;
            } else if (i4 == 406) {
                int A02 = groupChatInfoActivity.A06.A02(C15910s6.A1F);
                C14870pt r3 = groupChatInfoActivity.A05;
                Resources resources = groupChatInfoActivity.getResources();
                Object[] A1b = C13680ns.A1b();
                AnonymousClass000.A1M(A1b, A02, 0);
                r3.A0H(resources.getQuantityString(R.plurals.plurals0036, A02, A1b), 0);
                groupChatInfoActivity.A1R.A06(false);
                return;
            } else if (i4 != 409) {
                r1 = groupChatInfoActivity.A05;
                i3 = R.string.str0a88;
            } else {
                C17780vd r32 = groupChatInfoActivity.A1E;
                C16050sL r8 = groupChatInfoActivity.A1M;
                Log.i("GroupXmppMethods/sendGetGroupDescription");
                C17190ug r9 = r32.A02;
                String A022 = r9.A02();
                C35081lL[] r4 = new C35081lL[1];
                C35081lL.A02("request", FacebookFacade.RequestParameter.DESCRIPTION, r4, 0);
                C28371Vv r7 = new C28371Vv("query", r4);
                C35081lL[] r42 = new C35081lL[4];
                C35081lL.A02("id", A022, r42, 0);
                C35081lL.A02("xmlns", "w:g2", r42, 1);
                C35081lL.A01("type", "get", r42);
                r42[3] = new C35081lL((Jid) r8, "to");
                r9.A0G(new IDxRCallbackShape230S0100000_1_I1(r32, 1), C28371Vv.A04(r7, r42), A022, 158, 32000);
                groupChatInfoActivity.Afb(GroupChatInfoActivity.DescriptionConflictDialogFragment.A01(str), (String) null);
                return;
            }
            r1.A09(i3, 0);
        }
    }
}
