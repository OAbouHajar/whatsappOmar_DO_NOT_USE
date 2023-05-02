package com.obwhatsapp.contact;

import X.AnonymousClass00B;
import X.AnonymousClass026;
import X.AnonymousClass027;
import X.AnonymousClass26d;
import X.AnonymousClass291;
import X.AnonymousClass2AF;
import X.AnonymousClass2AG;
import X.AnonymousClass2AK;
import X.AnonymousClass2AM;
import X.AnonymousClass2AN;
import X.AnonymousClass2AS;
import X.AnonymousClass2AU;
import X.AnonymousClass2AY;
import X.AnonymousClass2Ac;
import X.AnonymousClass2Ai;
import X.AnonymousClass2Aj;
import X.AnonymousClass3K2;
import X.AnonymousClass3K3;
import X.AnonymousClass3K4;
import X.C13680ns;
import X.C14570pP;
import X.C15830rv;
import X.C16010sH;
import X.C16040sK;
import X.C19430yQ;
import X.C28881Zb;
import X.C30511cT;
import X.C32501gU;
import X.C33481ie;
import X.C34881l1;
import X.C34891l2;
import X.C40991v1;
import X.C45692Af;
import android.widget.BaseAdapter;
import android.widget.ProgressBar;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.IDxFunctionShape205S0100000_1_I0;
import com.facebook.redex.RunnableRunnableShape19S0100000_I1_2;
import com.facebook.redex.RunnableRunnableShape4S0100000_I0_3;
import com.facebook.redex.RunnableRunnableShape5S0100000_I0_4;
import com.facebook.redex.RunnableRunnableShape8S0100000_I0_7;
import com.mod.bomfab.R$styleable;
import com.obwhatsapp.blocklist.BlockList;
import com.obwhatsapp.calling.callhistory.CallLogActivity;
import com.obwhatsapp.calling.callhistory.CallsHistoryFragment;
import com.obwhatsapp.community.CommunityTabViewModel;
import com.obwhatsapp.contact.picker.ContactPickerFragment;
import com.obwhatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity;
import com.obwhatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity;
import com.obwhatsapp.conversationslist.ConversationsFragment;
import com.obwhatsapp.mediaview.MediaViewFragment;
import com.obwhatsapp.notification.PopupNotification;
import com.obwhatsapp.profile.ProfileInfoActivity;
import com.obwhatsapp.profile.ProfilePhotoReminder;
import com.obwhatsapp.qrcode.contactqr.ScannedCodeDialogFragment;
import com.obwhatsapp.quickcontact.QuickContactActivity;
import com.obwhatsapp.registration.RegisterName;
import com.obwhatsapp.search.SearchFragment;
import com.obwhatsapp.status.StatusesFragment;
import com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;

public class IDxCObserverShape68S0100000_2_I0 extends C33481ie {
    public Object A00;
    public final int A01;

    public IDxCObserverShape68S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00(C15830rv r5) {
        DialogFragment dialogFragment;
        switch (this.A01) {
            case 0:
                C32501gU r2 = (C32501gU) this.A00;
                if (C16010sH.A04(new C34891l2(r2.A09.A0A(r5)), r2.A0I)) {
                    r2.A0M.notifyDataSetChanged();
                    return;
                }
                return;
            case 1:
                AnonymousClass3K2.A1G(this.A00, r5);
                return;
            case 2:
                ((BlockList) this.A00).A05.Acl(new RunnableRunnableShape4S0100000_I0_3((BlockList) this.A00, 15));
                return;
            case 3:
                ((AnonymousClass26d) this.A00).A0K(UserJid.of(r5));
                return;
            case 4:
                CallLogActivity callLogActivity = (CallLogActivity) this.A00;
                if (callLogActivity.A0P.equals(r5)) {
                    callLogActivity.A35();
                    return;
                }
                return;
            case 5:
                CallsHistoryFragment.A02((CallsHistoryFragment) this.A00);
                return;
            case 7:
                AnonymousClass3K3.A1H(((AnonymousClass2AF) this.A00).A0K, this, r5, 27);
                return;
            case 8:
                AnonymousClass3K3.A1H(((AnonymousClass2AS) this.A00).A0s, this, r5, 33);
                return;
            case 10:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00;
                if (C16010sH.A04(new C34891l2(contactPickerFragment.A0m.A0A(r5)), contactPickerFragment.A2M)) {
                    ContactPickerFragment.A02(contactPickerFragment);
                    return;
                }
                return;
            case 13:
                C30511cT r22 = (C30511cT) this.A00;
                if (C30511cT.A02(r22, r5)) {
                    ProgressBar progressBar = r22.A07;
                    if (progressBar == null) {
                        progressBar = (ProgressBar) r22.A05.inflate();
                        r22.A07 = progressBar;
                    }
                    progressBar.setVisibility(8);
                    r22.A06.setVisibility(0);
                    r22.A04();
                    return;
                }
                return;
            case 14:
                ((MediaAlbumActivity) this.A00).A08.notifyDataSetChanged();
                return;
            case 15:
                MessageDetailsActivity messageDetailsActivity = (MessageDetailsActivity) this.A00;
                Iterator it = messageDetailsActivity.A0b.iterator();
                while (it.hasNext()) {
                    if (r5.equals(((AnonymousClass2Aj) it.next()).A01)) {
                        messageDetailsActivity.A01.notifyDataSetChanged();
                        return;
                    }
                }
                return;
            case 16:
                ((C45692Af) this.A00).A07.notifyDataSetChanged();
                return;
            case 18:
                ((AnonymousClass2AG) this.A00).A0A.A0H(r5);
                return;
            case 19:
                ConversationsFragment conversationsFragment = (ConversationsFragment) this.A00;
                ConversationsFragment.A05(conversationsFragment, r5);
                conversationsFragment.A1B.A03 = true;
                if (conversationsFragment.A15 != null) {
                    conversationsFragment.A1M();
                    return;
                }
                return;
            case 20:
                ((AnonymousClass291) this.A00).A0h.A01();
                return;
            case R$styleable.FloatingActionMenu_menu_labels_ellipsize /*22*/:
                MediaViewFragment mediaViewFragment = (MediaViewFragment) this.A00;
                GroupJid groupJid = mediaViewFragment.A14;
                if (groupJid == null || !groupJid.equals(r5)) {
                    C16040sK r0 = mediaViewFragment.A0K;
                    r0.A0B();
                    C28881Zb r02 = r0.A01;
                    if (r02 != null && r5.equals(r02.A0E) && (dialogFragment = mediaViewFragment.A0B) != null) {
                        dialogFragment.A1C();
                        mediaViewFragment.A0B = null;
                        return;
                    }
                    return;
                }
                DialogFragment dialogFragment2 = mediaViewFragment.A0A;
                if (dialogFragment2 != null) {
                    dialogFragment2.A1C();
                    mediaViewFragment.A0A = null;
                    return;
                }
                return;
            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                PopupNotification popupNotification = (PopupNotification) this.A00;
                C16010sH r03 = popupNotification.A0q;
                if (r03 != null && r5 != null && r5.equals(r03.A07())) {
                    popupNotification.A2r();
                    return;
                }
                return;
            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                ProfileInfoActivity profileInfoActivity = (ProfileInfoActivity) this.A00;
                if (profileInfoActivity.A08 != null && profileInfoActivity.A01.A0I(r5)) {
                    C16040sK r04 = profileInfoActivity.A01;
                    r04.A0B();
                    profileInfoActivity.A08 = r04.A01;
                    profileInfoActivity.A35();
                    return;
                }
                return;
            case R$styleable.FloatingActionMenu_menu_labels_style /*25*/:
                ProfilePhotoReminder profilePhotoReminder = (ProfilePhotoReminder) this.A00;
                if (profilePhotoReminder.A09 != null && profilePhotoReminder.A01.A0I(r5)) {
                    C16040sK r05 = profilePhotoReminder.A01;
                    r05.A0B();
                    profilePhotoReminder.A09 = r05.A01;
                    profilePhotoReminder.A35();
                    return;
                }
                return;
            case R$styleable.FloatingActionMenu_menu_labels_customFont /*26*/:
                ScannedCodeDialogFragment scannedCodeDialogFragment = (ScannedCodeDialogFragment) this.A00;
                if (r5.equals(scannedCodeDialogFragment.A0L)) {
                    scannedCodeDialogFragment.A0B.A06(scannedCodeDialogFragment.A03, scannedCodeDialogFragment.A0I);
                    return;
                }
                return;
            case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                QuickContactActivity quickContactActivity = (QuickContactActivity) this.A00;
                quickContactActivity.A36();
                quickContactActivity.A0e.A04();
                return;
            case R$styleable.FloatingActionMenu_menu_shadowRadius /*28*/:
                RegisterName registerName = (RegisterName) this.A00;
                if (registerName.A0d != null && registerName.A01.A0I(r5)) {
                    registerName.A3E();
                    return;
                }
                return;
            case R$styleable.FloatingActionMenu_menu_shadowXOffset /*29*/:
                SearchFragment.A02(r5, (SearchFragment) this.A00);
                return;
            case 32:
                ((StatusesFragment) this.A00).A0i.notifyDataSetChanged();
                return;
            case R$styleable.FloatingActionMenu_menu_colorRipple /*33*/:
                if (r5 != null) {
                    StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) this.A00;
                    if (r5.equals(statusPlaybackContactFragment.A0S)) {
                        statusPlaybackContactFragment.A1L();
                        return;
                    }
                    return;
                }
                return;
            case R$styleable.FloatingActionMenu_menu_openDirection /*34*/:
                ((AnonymousClass2Ac) this.A00).A0J.A0E(r5);
                return;
            default:
                super.A00(r5);
                return;
        }
    }

    public void A02(UserJid userJid) {
        switch (this.A01) {
            case 0:
                C32501gU r2 = (C32501gU) this.A00;
                if (C16010sH.A04(new C34881l1(r2.A09.A0A(userJid)), r2.A0I)) {
                    r2.A0M.notifyDataSetChanged();
                    return;
                }
                return;
            case 2:
                ((BlockList) this.A00).A05.Acl(new RunnableRunnableShape4S0100000_I0_3((BlockList) this.A00, 15));
                return;
            case 4:
                CallLogActivity callLogActivity = (CallLogActivity) this.A00;
                if (callLogActivity.A0P.equals(userJid)) {
                    callLogActivity.A35();
                    return;
                }
                return;
            case 7:
                AnonymousClass3K3.A1H(((AnonymousClass2AF) this.A00).A0K, this, userJid, 28);
                return;
            case 10:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00;
                if (C16010sH.A04(new C34881l1(contactPickerFragment.A0m.A0A(userJid)), contactPickerFragment.A2M)) {
                    ContactPickerFragment.A02(contactPickerFragment);
                    return;
                }
                return;
            case 13:
                C30511cT r1 = (C30511cT) this.A00;
                if (C30511cT.A02(r1, userJid)) {
                    r1.A05();
                    return;
                }
                return;
            case 18:
                ((AnonymousClass2AG) this.A00).A0A.A0H(userJid);
                return;
            case 19:
                ConversationsFragment.A05((ConversationsFragment) this.A00, userJid);
                return;
            case R$styleable.FloatingActionMenu_menu_fab_size /*24*/:
                ProfileInfoActivity profileInfoActivity = (ProfileInfoActivity) this.A00;
                if (profileInfoActivity.A01.A0I(userJid)) {
                    profileInfoActivity.A0E.setSubText(profileInfoActivity.A04.A00());
                    return;
                }
                return;
            case R$styleable.FloatingActionMenu_menu_shadowXOffset /*29*/:
                SearchFragment.A02(userJid, (SearchFragment) this.A00);
                return;
            default:
                super.A02(userJid);
                return;
        }
    }

    public void A03(UserJid userJid) {
        switch (this.A01) {
            case 0:
                C32501gU r2 = (C32501gU) this.A00;
                if (C16010sH.A04(new AnonymousClass2Ai(r2.A09.A0A(userJid)), r2.A0I)) {
                    r2.A0M.notifyDataSetChanged();
                    return;
                }
                return;
            case 1:
                AnonymousClass3K2.A1G(this.A00, userJid);
                return;
            case 2:
                ((BlockList) this.A00).A05.Acl(new RunnableRunnableShape4S0100000_I0_3((BlockList) this.A00, 15));
                return;
            case 4:
                CallLogActivity callLogActivity = (CallLogActivity) this.A00;
                if (callLogActivity.A0P.equals(userJid)) {
                    callLogActivity.A35();
                    return;
                }
                return;
            case 5:
                CallsHistoryFragment.A02((CallsHistoryFragment) this.A00);
                return;
            case 6:
                AnonymousClass2AN r1 = (AnonymousClass2AN) this.A00;
                if (userJid.equals(r1.A09)) {
                    r1.A02();
                    return;
                }
                return;
            case 7:
                AnonymousClass3K3.A1H(((AnonymousClass2AF) this.A00).A0K, this, userJid, 29);
                return;
            case 10:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00;
                if (C16010sH.A04(new AnonymousClass2Ai(contactPickerFragment.A0m.A0A(userJid)), contactPickerFragment.A2M)) {
                    ContactPickerFragment.A02(contactPickerFragment);
                    return;
                }
                return;
            case 12:
                if (userJid != null) {
                    AnonymousClass2AK r22 = (AnonymousClass2AK) this.A00;
                    if (userJid.equals(r22.A0Y)) {
                        boolean A0H = r22.A00.A0H();
                        r22.A00 = r22.A0Q.A01(r22.A0Y);
                        if (A0H != r22.A00.A0H()) {
                            r22.A01.invalidateOptionsMenu();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 13:
                C30511cT r12 = (C30511cT) this.A00;
                if (C30511cT.A02(r12, userJid)) {
                    r12.A04();
                    return;
                }
                return;
            case 14:
                ((MediaAlbumActivity) this.A00).A08.notifyDataSetChanged();
                return;
            case 15:
                MessageDetailsActivity messageDetailsActivity = (MessageDetailsActivity) this.A00;
                Iterator it = messageDetailsActivity.A0b.iterator();
                while (it.hasNext()) {
                    if (userJid.equals(((AnonymousClass2Aj) it.next()).A01)) {
                        messageDetailsActivity.A01.notifyDataSetChanged();
                        return;
                    }
                }
                return;
            case 16:
                ((C45692Af) this.A00).A07.notifyDataSetChanged();
                return;
            case 18:
                ((AnonymousClass2AG) this.A00).A0A.A0H(userJid);
                return;
            case 19:
                ConversationsFragment conversationsFragment = (ConversationsFragment) this.A00;
                ConversationsFragment.A05(conversationsFragment, userJid);
                conversationsFragment.A1B.A03 = true;
                if (conversationsFragment.A15 != null) {
                    conversationsFragment.A1M();
                    return;
                }
                return;
            case 20:
                ((AnonymousClass291) this.A00).A0h.A01();
                return;
            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                PopupNotification popupNotification = (PopupNotification) this.A00;
                if (!popupNotification.A1O.isEmpty()) {
                    C15830rv r0 = popupNotification.A18.A11.A00;
                    AnonymousClass00B.A06(r0);
                    if (r0.equals(userJid) || userJid.equals(popupNotification.A18.A0B())) {
                        popupNotification.A2s(popupNotification.A12.getCurrentItem());
                        return;
                    }
                    return;
                }
                return;
            case R$styleable.FloatingActionMenu_menu_shadowXOffset /*29*/:
                SearchFragment.A02(userJid, (SearchFragment) this.A00);
                return;
            case 32:
                ((StatusesFragment) this.A00).A0i.notifyDataSetChanged();
                return;
            case R$styleable.FloatingActionMenu_menu_colorRipple /*33*/:
                if (userJid != null) {
                    StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) this.A00;
                    if (userJid.equals(statusPlaybackContactFragment.A0S)) {
                        statusPlaybackContactFragment.A1L();
                        return;
                    }
                    return;
                }
                return;
            case R$styleable.FloatingActionMenu_menu_openDirection /*34*/:
                ((AnonymousClass2Ac) this.A00).A0J.A0E(userJid);
                return;
            default:
                super.A03(userJid);
                return;
        }
    }

    public void A04(Collection collection) {
        switch (this.A01) {
            case 0:
                ((C32501gU) this.A00).A0M.notifyDataSetChanged();
                return;
            case 2:
                C14570pP r3 = (C14570pP) this.A00;
                r3.A05.Acl(new RunnableRunnableShape4S0100000_I0_3(r3, 16));
                return;
            case 10:
                ContactPickerFragment.A02((ContactPickerFragment) this.A00);
                return;
            case R$styleable.FloatingActionMenu_menu_labels_singleLine /*21*/:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    C15830rv r2 = (C15830rv) it.next();
                    if (r2 == null) {
                        Log.e("LocationSharingManager/ContactObserver/found jid == null");
                    } else {
                        C19430yQ r1 = (C19430yQ) this.A00;
                        r1.A0O(r2);
                        r1.A0P(r2, (UserJid) null);
                    }
                }
                return;
            case 30:
                ((C14570pP) this.A00).A05.Acl(new RunnableRunnableShape19S0100000_I1_2(this, 47));
                return;
            default:
                super.A04(collection);
                return;
        }
    }

    public void A05(Collection collection) {
        switch (this.A01) {
            case 4:
                ((CallLogActivity) this.A00).A35();
                return;
            case 5:
                CallsHistoryFragment.A02((CallsHistoryFragment) this.A00);
                return;
            case 6:
                AnonymousClass2AN.A00((AnonymousClass2AN) this.A00, collection);
                return;
            case 9:
                AnonymousClass3K3.A1H(((CommunityTabViewModel) this.A00).A0K, this, collection, 41);
                return;
            case 12:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    C15830rv A07 = ((C16010sH) it.next()).A07();
                    if (A07 != null) {
                        AnonymousClass2AK r1 = (AnonymousClass2AK) this.A00;
                        if (A07.equals(r1.A0Y)) {
                            r1.A00 = r1.A0Q.A01(r1.A0Y);
                            r1.A01.invalidateOptionsMenu();
                            return;
                        }
                    }
                }
                return;
            case 17:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    C15830rv A072 = ((C16010sH) it2.next()).A07();
                    if (A072 != null) {
                        AnonymousClass2AM r3 = (AnonymousClass2AM) this.A00;
                        if (A072.equals(r3.A00.A07())) {
                            C16010sH A012 = r3.A03.A01(C15830rv.A00(r3.A00.A07()));
                            r3.A00 = A012;
                            r3.A05.A09(Boolean.valueOf(r3.A04.A00(A012)));
                        }
                    }
                }
                return;
            case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                QuickContactActivity quickContactActivity = (QuickContactActivity) this.A00;
                quickContactActivity.A36();
                AnonymousClass3K4.A0t(quickContactActivity);
                return;
            default:
                super.A05(collection);
                return;
        }
    }

    public void A06(Collection collection) {
        BaseAdapter baseAdapter;
        switch (this.A01) {
            case 0:
                ((C32501gU) this.A00).A38();
                return;
            case 2:
                ((BlockList) this.A00).A05.Acl(new RunnableRunnableShape4S0100000_I0_3((BlockList) this.A00, 15));
                return;
            case 4:
                ((CallLogActivity) this.A00).A35();
                return;
            case 5:
                AnonymousClass3K2.A1F(this.A00);
                return;
            case 8:
                if (collection != null) {
                    AnonymousClass2AS r3 = (AnonymousClass2AS) this.A00;
                    if (collection.contains(r3.A0j)) {
                        r3.A0s.execute(new RunnableRunnableShape5S0100000_I0_4((Object) r3, 45));
                        return;
                    }
                    return;
                }
                return;
            case 10:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00;
                if (!ContactPickerFragment.A2z) {
                    contactPickerFragment.A1O();
                    return;
                }
                return;
            case 11:
                AnonymousClass2AY r5 = ((InviteNonWhatsAppContactPickerActivity) this.A00).A0K;
                r5.A0E.clear();
                AnonymousClass026 r4 = r5.A02;
                AnonymousClass027 r32 = r5.A06;
                r4.A0C(r32);
                r5.A0C.A00(new IDxFunctionShape205S0100000_1_I0(r5, 0), r32, r4);
                return;
            case 12:
                ((AnonymousClass2AK) this.A00).A00 = ((AnonymousClass2AK) this.A00).A0Q.A01(((AnonymousClass2AK) this.A00).A0Y);
                return;
            case 13:
                ((C30511cT) this.A00).A04();
                return;
            case 14:
                baseAdapter = ((MediaAlbumActivity) this.A00).A08;
                break;
            case 15:
                baseAdapter = ((MessageDetailsActivity) this.A00).A01;
                break;
            case 16:
                baseAdapter = ((C45692Af) this.A00).A07;
                break;
            case 18:
                AnonymousClass2AG r0 = (AnonymousClass2AG) this.A00;
                if (collection == null) {
                    r0.A0A.A0E();
                    return;
                } else {
                    r0.A0A.A0I(C13680ns.A0n(collection));
                    return;
                }
            case 19:
                if (collection == null || collection.isEmpty()) {
                    ConversationsFragment.A04((ConversationsFragment) this.A00);
                    return;
                }
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    ConversationsFragment.A05((ConversationsFragment) this.A00, (C15830rv) it.next());
                }
                ConversationsFragment conversationsFragment = (ConversationsFragment) this.A00;
                conversationsFragment.A1B.A03 = true;
                if (conversationsFragment.A15 != null) {
                    conversationsFragment.A1M();
                    return;
                }
                return;
            case 20:
                ((AnonymousClass291) this.A00).A0h.A01();
                return;
            case R$styleable.FloatingActionMenu_menu_labels_maxLines /*23*/:
                PopupNotification.A03((PopupNotification) this.A00);
                return;
            case R$styleable.FloatingActionMenu_menu_shadowXOffset /*29*/:
                AnonymousClass2AU r02 = ((SearchFragment) this.A00).A1K;
                if (r02 != null) {
                    r02.A01();
                    return;
                }
                return;
            case R$styleable.FloatingActionMenu_menu_colorNormal /*31*/:
                ((C40991v1) this.A00).A0D();
                return;
            case 32:
                StatusesFragment statusesFragment = (StatusesFragment) this.A00;
                statusesFragment.A0i.getFilter().filter(statusesFragment.A10);
                return;
            case R$styleable.FloatingActionMenu_menu_colorRipple /*33*/:
                ((StatusPlaybackContactFragment) this.A00).A1L();
                return;
            case R$styleable.FloatingActionMenu_menu_openDirection /*34*/:
                ((AnonymousClass2Ac) this.A00).A0J.A01();
                return;
            default:
                super.A06(collection);
                return;
        }
        baseAdapter.notifyDataSetChanged();
    }

    public void A07(Collection collection) {
        switch (this.A01) {
            case 6:
                AnonymousClass2AN.A00((AnonymousClass2AN) this.A00, collection);
                return;
            case R$styleable.FloatingActionMenu_menu_shadowColor /*27*/:
                QuickContactActivity quickContactActivity = (QuickContactActivity) this.A00;
                quickContactActivity.A36();
                AnonymousClass3K4.A0t(quickContactActivity);
                return;
            default:
                super.A07(collection);
                return;
        }
    }

    public void A08(Collection collection) {
        switch (this.A01) {
            case 7:
                AnonymousClass3K3.A1H(((AnonymousClass2AF) this.A00).A0K, this, collection, 30);
                return;
            case 19:
                ConversationsFragment conversationsFragment = (ConversationsFragment) this.A00;
                conversationsFragment.A2M.Acl(new RunnableRunnableShape8S0100000_I0_7(conversationsFragment.A1N, 15));
                return;
            default:
                super.A08(collection);
                return;
        }
    }
}
