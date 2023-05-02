package com.obwhatsapp.chat;

import X.AnonymousClass1V8;
import X.AnonymousClass291;
import X.AnonymousClass2AG;
import X.AnonymousClass2AK;
import X.AnonymousClass2Ac;
import X.AnonymousClass2VT;
import X.AnonymousClass3K2;
import X.AnonymousClass4SI;
import X.C15830rv;
import X.C16010sH;
import X.C16030sJ;
import X.C30511cT;
import X.C32501gU;
import X.C40781ug;
import X.C45692Af;
import android.text.TextUtils;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.facebook.redex.RunnableRunnableShape4S0100000_I0_3;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.blocklist.BlockList;
import com.obwhatsapp.calling.callhistory.CallLogActivity;
import com.obwhatsapp.chatinfo.ContactInfoActivity;
import com.obwhatsapp.chatinfo.ListChatInfoActivity;
import com.obwhatsapp.contact.picker.ContactPickerFragment;
import com.obwhatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity;
import com.obwhatsapp.conversationslist.ConversationsFragment;
import com.obwhatsapp.group.GroupAdminPickerActivity;
import com.obwhatsapp.group.GroupChatInfoActivity;
import com.obwhatsapp.notification.PopupNotification;
import com.obwhatsapp.profile.ViewProfilePhoto;
import com.obwhatsapp.search.SearchFragment;
import com.obwhatsapp.search.SearchViewModel;
import com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.jid.UserJid;

public class IDxSObserverShape63S0100000_2_I0 extends C40781ug {
    public Object A00;
    public final int A01;

    public IDxSObserverShape63S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00(C15830rv r3) {
        if (21 - this.A01 != 0) {
            super.A00(r3);
            return;
        }
        SearchViewModel searchViewModel = ((SearchFragment) this.A00).A1L;
        if (searchViewModel.A0a()) {
            searchViewModel.A0H();
        }
    }

    public void A01(C15830rv r5) {
        AnonymousClass4SI r1;
        switch (this.A01) {
            case 4:
                ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                if (r5.equals(UserJid.getNullable(contactInfoActivity.getIntent().getStringExtra("jid")))) {
                    if (!contactInfoActivity.A3g() && (r1 = contactInfoActivity.A0a) != null) {
                        r1.A00(contactInfoActivity.A0x);
                    }
                    contactInfoActivity.A3V();
                    return;
                }
                return;
            case 9:
                C30511cT r12 = (C30511cT) this.A00;
                if (C30511cT.A02(r12, r5)) {
                    r12.A05();
                    return;
                }
                return;
            case 14:
                ((AnonymousClass2AG) this.A00).A0A.A0H(r5);
                return;
            case 15:
                ConversationsFragment.A05((ConversationsFragment) this.A00, r5);
                return;
            case 19:
                PopupNotification popupNotification = (PopupNotification) this.A00;
                C16010sH r0 = popupNotification.A0q;
                if (r0 != null && r5 != null && r5.equals(r0.A07()) && !C16030sJ.A0L(r5)) {
                    String A002 = popupNotification.A0H.A00(popupNotification.A0q);
                    boolean isEmpty = TextUtils.isEmpty(A002);
                    TextView textView = popupNotification.A0F;
                    if (isEmpty) {
                        textView.setVisibility(8);
                        return;
                    }
                    textView.setVisibility(0);
                    popupNotification.A0F.setText(A002);
                    return;
                }
                return;
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                SearchFragment.A02(r5, (SearchFragment) this.A00);
                return;
            default:
                super.A01(r5);
                return;
        }
    }

    public void A02(C15830rv r3) {
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
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00;
                if (!ContactPickerFragment.A2z) {
                    contactPickerFragment.A1O();
                    return;
                }
                return;
            case 7:
                ((AnonymousClass1V8) this.A00).A3J();
                return;
            case 8:
                ((AnonymousClass2AK) this.A00).A00 = ((AnonymousClass2AK) this.A00).A0Q.A01(((AnonymousClass2AK) this.A00).A0Y);
                return;
            case 9:
                ((C30511cT) this.A00).A04();
                return;
            case 10:
                baseAdapter = ((MediaAlbumActivity) this.A00).A08;
                break;
            case 11:
                baseAdapter = ((MessageDetailsActivity) this.A00).A01;
                break;
            case 12:
                baseAdapter = ((C45692Af) this.A00).A07;
                break;
            case 13:
                AnonymousClass2VT r0 = (AnonymousClass2VT) this.A00;
                r0.A06();
                r0.A0U.A0B(Boolean.TRUE);
                return;
            case 14:
                ((AnonymousClass2AG) this.A00).A0A.A0H(r3);
                return;
            case 15:
                ConversationsFragment.A04((ConversationsFragment) this.A00);
                return;
            case 16:
                GroupAdminPickerActivity groupAdminPickerActivity = (GroupAdminPickerActivity) this.A00;
                groupAdminPickerActivity.A38(groupAdminPickerActivity.A0N);
                return;
            case 17:
                GroupChatInfoActivity.A03((GroupChatInfoActivity) this.A00);
                return;
            case 18:
                ((AnonymousClass291) this.A00).A0h.A01();
                return;
            case 19:
                PopupNotification.A03((PopupNotification) this.A00);
                return;
            case 20:
                ViewProfilePhoto.A02((ViewProfilePhoto) this.A00);
                return;
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                SearchFragment.A02(r3, (SearchFragment) this.A00);
                return;
            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                ((StatusPlaybackContactFragment) this.A00).A1L();
                return;
            default:
                ((AnonymousClass2Ac) this.A00).A0J.A01();
                return;
        }
        baseAdapter.notifyDataSetChanged();
    }
}
