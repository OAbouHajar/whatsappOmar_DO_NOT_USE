package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.location.GroupChatLiveLocationsActivity2;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3EH  reason: invalid class name */
public class AnonymousClass3EH implements AnonymousClass5O9 {
    public final View A00;
    public final /* synthetic */ GroupChatLiveLocationsActivity2 A01;

    public AnonymousClass3EH(GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2) {
        this.A01 = groupChatLiveLocationsActivity2;
        View A0H = C13680ns.A0H(groupChatLiveLocationsActivity2.getLayoutInflater(), (ViewGroup) null, R.layout.layout039f);
        this.A00 = A0H;
        C004601z.A0f(A0H, 3);
    }

    public View ACm(C32451gN r17) {
        int A002;
        C30661ck A05;
        Object A012 = r17.A01();
        AnonymousClass00B.A06(A012);
        C39721sx r5 = ((AnonymousClass29W) A012).A02;
        View view = this.A00;
        GroupChatLiveLocationsActivity2 groupChatLiveLocationsActivity2 = this.A01;
        C30521cU r10 = new C30521cU(view, groupChatLiveLocationsActivity2.A0E, groupChatLiveLocationsActivity2.A01, groupChatLiveLocationsActivity2.A0S, (int) R.id.name_in_group_tv);
        TextView A0M = C13680ns.A0M(view, R.id.participant_info);
        View findViewById = view.findViewById(R.id.info_btn);
        C16040sK r0 = groupChatLiveLocationsActivity2.A01;
        UserJid userJid = r5.A06;
        if (r0.A0I(userJid)) {
            C30521cU.A00(groupChatLiveLocationsActivity2, r10, R.color.color050f);
            r10.A03();
            findViewById.setVisibility(8);
        } else {
            C16050sL A03 = C16050sL.A03(groupChatLiveLocationsActivity2.A0N.A0c);
            if (A03 == null || (A05 = C16070sO.A00(groupChatLiveLocationsActivity2.A0J, A03).A05(userJid)) == null) {
                A002 = AnonymousClass00T.A00(groupChatLiveLocationsActivity2, R.color.color0510);
            } else {
                int[] intArray = groupChatLiveLocationsActivity2.getResources().getIntArray(R.array.array0012);
                A002 = intArray[A05.A00 % intArray.length];
            }
            r10.A06(A002);
            r10.A0A(groupChatLiveLocationsActivity2.A0C.A0A(userJid));
            findViewById.setVisibility(0);
        }
        r10.A05();
        String str = "";
        int i2 = r5.A03;
        if (i2 != -1) {
            StringBuilder A0q = AnonymousClass000.A0q(str);
            Object[] A1b = C13680ns.A1b();
            AnonymousClass000.A1M(A1b, i2, 0);
            str = AnonymousClass000.A0h(groupChatLiveLocationsActivity2.A01.A0J(A1b, R.plurals.plurals00cd, (long) i2), A0q);
        }
        C13690nt.A1D(A0M, str);
        return view;
    }
}
