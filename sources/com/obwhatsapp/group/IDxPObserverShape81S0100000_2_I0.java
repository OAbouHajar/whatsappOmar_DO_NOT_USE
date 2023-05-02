package com.obwhatsapp.group;

import X.AnonymousClass1V8;
import X.AnonymousClass1VD;
import X.AnonymousClass291;
import X.AnonymousClass2AF;
import X.AnonymousClass2AG;
import X.AnonymousClass2AK;
import X.AnonymousClass2AU;
import X.AnonymousClass2Ac;
import X.AnonymousClass2UX;
import X.AnonymousClass2UZ;
import X.AnonymousClass2VT;
import X.AnonymousClass3K2;
import X.AnonymousClass3K3;
import X.C13680ns;
import X.C16050sL;
import X.C30511cT;
import X.C32501gU;
import X.C40991v1;
import X.C45692Af;
import android.widget.BaseAdapter;
import com.facebook.redex.RunnableRunnableShape4S0100000_I0_3;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.blocklist.BlockList;
import com.obwhatsapp.calling.callhistory.CallLogActivity;
import com.obwhatsapp.chatinfo.ContactInfoActivity;
import com.obwhatsapp.chatinfo.ListChatInfoActivity;
import com.obwhatsapp.community.CommunityTabViewModel;
import com.obwhatsapp.contact.picker.ContactPickerFragment;
import com.obwhatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity;
import com.obwhatsapp.conversationslist.ConversationsFragment;
import com.obwhatsapp.notification.PopupNotification;
import com.obwhatsapp.profile.ViewProfilePhoto;
import com.obwhatsapp.search.SearchFragment;
import com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import java.util.Set;

public class IDxPObserverShape81S0100000_2_I0 extends AnonymousClass1VD {
    public Object A00;
    public final int A01;

    public IDxPObserverShape81S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A02(C16050sL r3) {
        if (7 - this.A01 != 0) {
            super.A02(r3);
        } else {
            AnonymousClass3K3.A1H(((CommunityTabViewModel) this.A00).A0K, this, r3, 39);
        }
    }

    public void A04(C16050sL r3) {
        if (7 - this.A01 != 0) {
            super.A04(r3);
        } else {
            AnonymousClass3K3.A1H(((CommunityTabViewModel) this.A00).A0K, this, r3, 38);
        }
    }

    public void A05(Set set) {
        BaseAdapter baseAdapter;
        switch (this.A01) {
            case 0:
                ((C32501gU) this.A00).A38();
                return;
            case 1:
                ((BlockList) this.A00).A05.Acl(new RunnableRunnableShape4S0100000_I0_3((BlockList) this.A00, 15));
                return;
            case 2:
                ((CallLogActivity) this.A00).A35();
                return;
            case 3:
                AnonymousClass3K2.A1F(this.A00);
                return;
            case 4:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                contactInfoActivity.A3T();
                contactInfoActivity.A0a();
                return;
            case 5:
                ListChatInfoActivity.A02((ListChatInfoActivity) this.A00);
                return;
            case 6:
                AnonymousClass3K3.A1H(((AnonymousClass2AF) this.A00).A0K, this, set, 31);
                return;
            case 8:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00;
                if (!ContactPickerFragment.A2z) {
                    contactPickerFragment.A1O();
                    return;
                }
                return;
            case 9:
                ((AnonymousClass1V8) this.A00).A3J();
                return;
            case 10:
                ((AnonymousClass2AK) this.A00).A00 = ((AnonymousClass2AK) this.A00).A0Q.A01(((AnonymousClass2AK) this.A00).A0Y);
                return;
            case 11:
                ((C30511cT) this.A00).A04();
                return;
            case 12:
                baseAdapter = ((MediaAlbumActivity) this.A00).A08;
                break;
            case 13:
                baseAdapter = ((MessageDetailsActivity) this.A00).A01;
                break;
            case 14:
                baseAdapter = ((C45692Af) this.A00).A07;
                break;
            case 15:
                AnonymousClass2VT r0 = (AnonymousClass2VT) this.A00;
                r0.A06();
                r0.A0U.A0B(Boolean.TRUE);
                return;
            case 16:
                ((AnonymousClass2AG) this.A00).A0A.A0I(C13680ns.A0n(set));
                return;
            case 17:
                ConversationsFragment.A04((ConversationsFragment) this.A00);
                return;
            case 18:
                GroupAdminPickerActivity groupAdminPickerActivity = (GroupAdminPickerActivity) this.A00;
                groupAdminPickerActivity.A38(groupAdminPickerActivity.A0N);
                return;
            case 19:
                GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A00;
                if (set.contains(groupChatInfoActivity.A1M)) {
                    GroupChatInfoActivity.A03(groupChatInfoActivity);
                    return;
                }
                return;
            case 20:
                ((AnonymousClass291) this.A00).A0h.A01();
                return;
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                PopupNotification.A03((PopupNotification) this.A00);
                return;
            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                ViewProfilePhoto.A02((ViewProfilePhoto) this.A00);
                return;
            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                AnonymousClass2AU r3 = ((SearchFragment) this.A00).A1K;
                if (r3 != null) {
                    int i2 = 0;
                    while (true) {
                        AnonymousClass2UX r1 = r3.A0t;
                        if (i2 < r1.size()) {
                            if (set.contains(((AnonymousClass2UZ) r1.get(i2)).A01)) {
                                r3.A02(i2);
                            }
                            i2++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                ((C40991v1) this.A00).A0D();
                return;
            case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                ((StatusPlaybackContactFragment) this.A00).A1L();
                return;
            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                ((AnonymousClass2Ac) this.A00).A0J.A01();
                return;
            default:
                super.A05(set);
                return;
        }
        baseAdapter.notifyDataSetChanged();
    }
}
