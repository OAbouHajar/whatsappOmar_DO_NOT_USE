package com.obwhatsapp.data;

import X.AnonymousClass000;
import X.AnonymousClass05J;
import X.AnonymousClass1DI;
import X.AnonymousClass2AG;
import X.AnonymousClass2AH;
import X.AnonymousClass2AS;
import X.AnonymousClass3K3;
import X.AnonymousClass3K4;
import X.C14750ph;
import X.C14870pt;
import X.C15830rv;
import X.C16050sL;
import X.C25981Lw;
import X.C33501ig;
import X.C39461sW;
import X.C40991v1;
import X.C48562Nw;
import X.C49642Uo;
import com.facebook.redex.RunnableRunnableShape13S0200000_I1_1;
import com.facebook.redex.RunnableRunnableShape15S0200000_I1_3;
import com.facebook.redex.RunnableRunnableShape19S0100000_I1_2;
import com.facebook.redex.RunnableRunnableShape1S0210000_I1;
import com.facebook.redex.RunnableRunnableShape5S0100000_I0_4;
import com.obwhatsapp.HomeActivity;
import com.obwhatsapp.R;
import com.obwhatsapp.acceptinvitelink.AcceptInviteLinkActivity;
import com.obwhatsapp.chatinfo.ContactInfoActivity;
import com.obwhatsapp.community.AddGroupsToCommunityActivity;
import com.obwhatsapp.community.CommunityHomeActivity;
import com.obwhatsapp.community.CommunityTabViewModel;
import com.obwhatsapp.conversationslist.ConversationsFragment;
import com.obwhatsapp.group.GroupChatInfoActivity;
import com.obwhatsapp.invites.ViewGroupInviteActivity;
import com.obwhatsapp.search.SearchFragment;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.Iterator;

public class IDxCObserverShape72S0100000_2_I0 extends C33501ig {
    public Object A00;
    public final int A01;

    public IDxCObserverShape72S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00() {
        switch (this.A01) {
            case 0:
                HomeActivity homeActivity = (HomeActivity) this.A00;
                homeActivity.A3C();
                if (homeActivity.A0C.A0C(1266) && homeActivity.A0t.A01() == 0) {
                    C14870pt.A00(homeActivity.A05, homeActivity, 6);
                    return;
                }
                return;
            case 1:
                Log.i("acceptlink/onConversationsListChanged");
                AcceptInviteLinkActivity acceptInviteLinkActivity = (AcceptInviteLinkActivity) this.A00;
                if (acceptInviteLinkActivity.A0I != null) {
                    C14870pt.A00(acceptInviteLinkActivity.A05, this, 7);
                    return;
                }
                return;
            case 3:
                Log.i("AddGroupsToCommunityActivity/onConversationsListChanged/");
                AddGroupsToCommunityActivity addGroupsToCommunityActivity = (AddGroupsToCommunityActivity) this.A00;
                Object obj = addGroupsToCommunityActivity.A0T.get();
                if (obj != null) {
                    addGroupsToCommunityActivity.A05.A0K(new RunnableRunnableShape13S0200000_I1_1(this, 24, obj));
                    return;
                }
                return;
            case 8:
                ((AnonymousClass2AG) this.A00).A0A.A0E();
                return;
            case 9:
                ConversationsFragment conversationsFragment = (ConversationsFragment) this.A00;
                AnonymousClass3K3.A1E(conversationsFragment.A0O, conversationsFragment, 16);
                return;
            case 13:
                Log.i("ViewGroupInviteActivity/onConversationsListChanged");
                ViewGroupInviteActivity viewGroupInviteActivity = (ViewGroupInviteActivity) this.A00;
                if (viewGroupInviteActivity.A0K != null) {
                    AnonymousClass3K3.A1E(viewGroupInviteActivity.A05, this, 44);
                    return;
                }
                return;
            case 15:
                ((SearchFragment) this.A00).A0C.Acq(new RunnableRunnableShape19S0100000_I1_2(this, 41));
                return;
            case 16:
                ((C40991v1) this.A00).A0D();
                return;
            default:
                super.A00();
                return;
        }
    }

    public void A01(int i2) {
        switch (this.A01) {
            case 9:
                ((ConversationsFragment) this.A00).A1Q(i2);
                return;
            case 11:
                AnonymousClass2AH r0 = (AnonymousClass2AH) this.A00;
                r0.A0F();
                AnonymousClass05J r02 = r0.A00;
                if (r02 != null) {
                    r02.A05();
                    return;
                }
                return;
            default:
                super.A01(i2);
                return;
        }
    }

    public void A02(C15830rv r4) {
        switch (this.A01) {
            case 7:
                Log.i(AnonymousClass000.A0g("joinSubgroup/onConversationAdded/", r4));
                if (r4 instanceof C16050sL) {
                    C49642Uo r2 = (C49642Uo) this.A00;
                    int A0D = AnonymousClass000.A0D(r2.A0V.A01());
                    if (A0D == 2 || A0D == 7) {
                        r2.A05(4);
                        return;
                    }
                    return;
                }
                return;
            case 12:
                C48562Nw r1 = (C48562Nw) this.A00;
                if (r4 == r1.A03) {
                    AnonymousClass3K3.A1E(r1.A06, this, 42);
                    return;
                }
                return;
            default:
                super.A02(r4);
                return;
        }
    }

    public void A03(C15830rv r4) {
        switch (this.A01) {
            case 0:
                ((HomeActivity) this.A00).A3C();
                return;
            case 1:
                Log.i(AnonymousClass000.A0g("acceptlink/onConversationChanged/", r4));
                AcceptInviteLinkActivity acceptInviteLinkActivity = (AcceptInviteLinkActivity) this.A00;
                C16050sL r0 = acceptInviteLinkActivity.A0I;
                if (r0 != null && r0.equals(r4)) {
                    C14870pt.A00(acceptInviteLinkActivity.A05, this, 8);
                    return;
                }
                return;
            case 2:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                if (contactInfoActivity.A0x != null && r4 != null && r4.equals(contactInfoActivity.A3N())) {
                    C14870pt.A00(contactInfoActivity.A05, contactInfoActivity, 32);
                    return;
                }
                return;
            case 8:
                ((AnonymousClass2AG) this.A00).A0A.A0H(r4);
                return;
            case 9:
                C14870pt.A03(((ConversationsFragment) this.A00).A0O, this, r4, 10);
                return;
            case 10:
                if (r4 != null) {
                    GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
                    if (r4.equals(groupChatInfoActivity.A1M)) {
                        AnonymousClass3K3.A1E(groupChatInfoActivity.A05, groupChatInfoActivity, 35);
                        return;
                    }
                    return;
                }
                return;
            case 13:
                Log.i(AnonymousClass000.A0g("ViewGroupInviteActivity/onConversationChanged/", r4));
                ViewGroupInviteActivity viewGroupInviteActivity = (ViewGroupInviteActivity) this.A00;
                C16050sL r02 = viewGroupInviteActivity.A0K;
                if (r02 != null && r02.equals(r4)) {
                    AnonymousClass3K3.A1E(viewGroupInviteActivity.A05, this, 45);
                    return;
                }
                return;
            case 14:
                if (r4 instanceof GroupJid) {
                    AnonymousClass1DI r2 = (AnonymousClass1DI) this.A00;
                    AnonymousClass3K4.A0u(r2.A0B, r2, r4, 34);
                    return;
                }
                return;
            case 15:
                ((SearchFragment) this.A00).A0C.Acq(new RunnableRunnableShape15S0200000_I1_3(this, 11, r4));
                return;
            default:
                super.A03(r4);
                return;
        }
    }

    public void A04(C15830rv r2) {
        if (17 - this.A01 != 0) {
            super.A04(r2);
        } else {
            ((C25981Lw) this.A00).A04(r2);
        }
    }

    public void A05(C15830rv r5) {
        switch (this.A01) {
            case 2:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                if (r5.equals(contactInfoActivity.A3N()) && !(!contactInfoActivity.A0E)) {
                    contactInfoActivity.startActivity(C14750ph.A02(contactInfoActivity.getApplicationContext()).addFlags(603979776));
                    return;
                }
                return;
            case 4:
                CommunityHomeActivity communityHomeActivity = (CommunityHomeActivity) this.A00;
                if (r5.equals(communityHomeActivity.A0s)) {
                    communityHomeActivity.A37(communityHomeActivity.getString(R.string.str04fa));
                    return;
                }
                return;
            case 5:
                if (GroupJid.of(r5) != null) {
                    AnonymousClass2AS r3 = (AnonymousClass2AS) this.A00;
                    if (r3.A0i.A00(r3.A05)) {
                        Iterator it = r3.A13.iterator();
                        while (true) {
                            boolean z2 = false;
                            while (true) {
                                if (it.hasNext()) {
                                    C39461sW r0 = (C39461sW) it.next();
                                    if (z2 || r0.A02 == r5) {
                                        z2 = true;
                                    }
                                } else if (z2) {
                                    r3.A0s.execute(new RunnableRunnableShape5S0100000_I0_4((Object) r3, 40));
                                    return;
                                } else {
                                    return;
                                }
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                break;
            case 6:
                CommunityTabViewModel communityTabViewModel = (CommunityTabViewModel) this.A00;
                if (CommunityTabViewModel.A01(communityTabViewModel, r5)) {
                    communityTabViewModel.A07(true);
                    return;
                }
                return;
            case 7:
                if (r5 instanceof C16050sL) {
                    C49642Uo r2 = (C49642Uo) this.A00;
                    if (AnonymousClass000.A0D(r2.A0V.A01()) == 4) {
                        r2.A05(2);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
                if (r5.equals(groupChatInfoActivity.A1M) && !(!groupChatInfoActivity.A0E)) {
                    groupChatInfoActivity.startActivity(C14750ph.A02(groupChatInfoActivity.getApplicationContext()).addFlags(603979776));
                    return;
                }
                return;
            case 15:
                ((SearchFragment) this.A00).A1L.A0H();
                return;
            case 17:
                ((C25981Lw) this.A00).A04(r5);
                return;
            default:
                super.A05(r5);
                return;
        }
    }

    public void A06(C15830rv r4, boolean z2) {
        if (9 - this.A01 != 0) {
            super.A06(r4, z2);
        } else {
            ((ConversationsFragment) this.A00).A0O.A0K(new RunnableRunnableShape1S0210000_I1(this, r4, 2, z2));
        }
    }
}
