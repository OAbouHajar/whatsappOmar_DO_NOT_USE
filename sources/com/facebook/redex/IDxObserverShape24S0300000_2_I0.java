package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass013;
import X.AnonymousClass023;
import X.AnonymousClass028;
import X.AnonymousClass2DL;
import X.AnonymousClass2Wv;
import X.AnonymousClass2X7;
import X.C13680ns;
import X.C13690nt;
import X.C14570pP;
import X.C16690tT;
import X.C17110uY;
import X.C18450wi;
import X.C25401Jq;
import X.C56092kx;
import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.group.GroupMembershipApprovalRequestsFragment;
import com.obwhatsapp.reactions.ReactionsBottomSheetDialogFragment;
import java.util.List;

public class IDxObserverShape24S0300000_2_I0 implements AnonymousClass023 {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxObserverShape24S0300000_2_I0(Object obj, Object obj2, Object obj3, int i2) {
        this.A03 = i2;
        this.A00 = obj2;
        this.A01 = obj3;
        this.A02 = obj;
    }

    public final void AOH(Object obj) {
        AnonymousClass028 r2;
        C25401Jq r1;
        switch (this.A03) {
            case 0:
                AnonymousClass2DL r22 = (AnonymousClass2DL) this.A00;
                View view = (View) this.A01;
                TextView textView = (TextView) this.A02;
                Number number = (Number) obj;
                int intValue = number.intValue();
                if (intValue > 0) {
                    view.setVisibility(0);
                    textView.setText(r22.A08.A0K().format(number));
                    Resources resources = r22.getResources();
                    Object[] A1b = C13680ns.A1b();
                    A1b[0] = number;
                    textView.setContentDescription(resources.getQuantityString(R.plurals.plurals00b7, intValue, A1b));
                    return;
                }
                view.setVisibility(8);
                return;
            case 1:
                TextView textView2 = (TextView) this.A00;
                GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment = (GroupMembershipApprovalRequestsFragment) this.A02;
                Number number2 = (Number) obj;
                textView2.setVisibility(0);
                ((View) this.A01).setVisibility(8);
                C17110uY r3 = groupMembershipApprovalRequestsFragment.A07;
                if (r3 != null) {
                    C18450wi.A0C(number2);
                    textView2.setText(r3.A06(new RunnableRunnableShape9S0100000_I0_8(groupMembershipApprovalRequestsFragment, 29), groupMembershipApprovalRequestsFragment.A0J(number2.intValue()), ""));
                    return;
                }
                throw C18450wi.A03("linkifer");
            case 2:
                GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment2 = (GroupMembershipApprovalRequestsFragment) this.A02;
                List list = (List) obj;
                ((View) this.A00).setVisibility(8);
                ((View) this.A01).setVisibility(0);
                AnonymousClass2X7 A1B = groupMembershipApprovalRequestsFragment2.A1B();
                C18450wi.A0C(list);
                A1B.A01 = list;
                groupMembershipApprovalRequestsFragment2.A1B().A01();
                return;
            case 3:
                ReactionsBottomSheetDialogFragment reactionsBottomSheetDialogFragment = (ReactionsBottomSheetDialogFragment) this.A00;
                AnonymousClass2Wv r12 = (AnonymousClass2Wv) this.A01;
                LayoutInflater layoutInflater = (LayoutInflater) this.A02;
                List list2 = (List) obj;
                if (!list2.isEmpty()) {
                    int i2 = r12.A00;
                    AnonymousClass013 r32 = reactionsBottomSheetDialogFragment.A0D;
                    String str = r12.A03;
                    int size = list2.size();
                    Context context = layoutInflater.getContext();
                    View inflate = layoutInflater.inflate(R.layout.layout04ef, (ViewGroup) null);
                    C13680ns.A0Q(inflate, R.id.reactions_bottom_sheet_tab_emoji_text).A0G(str);
                    C13680ns.A0L(inflate, R.id.reactions_bottom_sheet_tab_counter_text).setText(C56092kx.A02(context, r32, size));
                    String A022 = C56092kx.A02(context, r32, size);
                    Resources resources2 = context.getResources();
                    Object[] A1Z = C13690nt.A1Z();
                    AnonymousClass000.A1E(A022, str, A1Z);
                    inflate.setContentDescription(resources2.getQuantityString(R.plurals.plurals0121, size, A1Z));
                    reactionsBottomSheetDialogFragment.A1N(inflate, i2);
                    return;
                }
                return;
            case 4:
                C14570pP r23 = (C14570pP) this.A00;
                ((AnonymousClass028) this.A01).A04(r23);
                C13680ns.A1U((C16690tT) this.A02, r23.A05);
                return;
            case 5:
                r2 = (AnonymousClass028) this.A02;
                Object A012 = ((AnonymousClass028) this.A00).A01();
                if (A012 != null && obj != null) {
                    r1 = new C25401Jq(A012, obj);
                    break;
                } else {
                    return;
                }
                break;
            default:
                r2 = (AnonymousClass028) this.A02;
                Object A013 = ((AnonymousClass028) this.A00).A01();
                if (obj != null && A013 != null) {
                    r1 = new C25401Jq(obj, A013);
                    break;
                } else {
                    return;
                }
                break;
        }
        r2.A0B(r1);
    }
}
