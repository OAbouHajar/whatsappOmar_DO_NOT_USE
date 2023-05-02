package com.obwhatsapp.data;

import X.AnonymousClass15I;
import X.AnonymousClass2BD;
import X.AnonymousClass2DT;
import X.AnonymousClass3K4;
import X.C13680ns;
import X.C15830rv;
import X.C16030sJ;
import X.C16460t6;
import X.C16740tZ;
import X.C18940xV;
import X.C19610yi;
import X.C28381Vw;
import X.C38621r6;
import X.C38701rH;
import X.C39171s2;
import com.facebook.redex.RunnableRunnableShape3S0300000_I1;
import com.obwhatsapp.chatinfo.ContactInfoActivity;
import com.obwhatsapp.chatinfo.ListChatInfoActivity;
import com.obwhatsapp.gallery.GalleryFragmentBase;
import com.obwhatsapp.gallery.MediaGalleryFragment;
import com.obwhatsapp.polls.PollResultsViewModel;
import com.obwhatsapp.search.SearchViewModel;
import com.obwhatsapp.status.playback.StatusReplyActivity;
import com.obwhatsapp.storage.StorageUsageGalleryActivity;
import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

public class IDxMObserverShape74S0100000_2_I0 extends C18940xV {
    public Object A00;
    public final int A01;

    public IDxMObserverShape74S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00(C15830rv r6, Collection collection, boolean z2) {
        switch (this.A01) {
            case 0:
                if (collection != null && !collection.isEmpty()) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        C16740tZ A0V = C13680ns.A0V(it);
                        ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                        if (AnonymousClass3K4.A1A(A0V, contactInfoActivity.A3N())) {
                            contactInfoActivity.A3T();
                            return;
                        }
                    }
                    return;
                } else if (r6 == null || ((ContactInfoActivity) this.A00).A3N().equals(r6)) {
                    ((ContactInfoActivity) this.A00).A3T();
                    return;
                } else {
                    return;
                }
            case 1:
                if (collection != null && !collection.isEmpty()) {
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        C16740tZ A0V2 = C13680ns.A0V(it2);
                        ListChatInfoActivity listChatInfoActivity = (ListChatInfoActivity) this.A00;
                        if (AnonymousClass3K4.A1A(A0V2, listChatInfoActivity.A3M())) {
                            listChatInfoActivity.A3R();
                            return;
                        }
                    }
                    return;
                } else if (r6 == null || r6.equals(((ListChatInfoActivity) this.A00).A3M())) {
                    ((ListChatInfoActivity) this.A00).A3R();
                    return;
                } else {
                    return;
                }
            case 6:
                if (collection != null && !collection.isEmpty()) {
                    Iterator it3 = collection.iterator();
                    while (it3.hasNext()) {
                        C15830rv r2 = C13680ns.A0V(it3).A11.A00;
                        if (r2 != null) {
                            GalleryFragmentBase galleryFragmentBase = (GalleryFragmentBase) this.A00;
                            if (r2.equals(galleryFragmentBase.A0D)) {
                                galleryFragmentBase.A1C();
                                return;
                            }
                        }
                    }
                    return;
                } else if (r6 == null || r6.equals(((GalleryFragmentBase) this.A00).A0D)) {
                    ((GalleryFragmentBase) this.A00).A1C();
                    return;
                } else {
                    return;
                }
            case 7:
                MediaGalleryFragment mediaGalleryFragment = (MediaGalleryFragment) this.A00;
                AnonymousClass2BD r3 = (AnonymousClass2BD) mediaGalleryFragment.A0H;
                if (r3 != null) {
                    if (collection != null && !collection.isEmpty()) {
                        Iterator it4 = collection.iterator();
                        while (it4.hasNext()) {
                            C15830rv r1 = C13680ns.A0V(it4).A11.A00;
                            if (r1 == null || !r1.equals(mediaGalleryFragment.A03)) {
                            }
                        }
                        return;
                    } else if (r6 != null && !r6.equals(mediaGalleryFragment.A03)) {
                        return;
                    }
                    r3.AcE();
                    mediaGalleryFragment.A06.A01();
                    return;
                }
                return;
            case 12:
                ((SearchViewModel) this.A00).A0B.A0B(collection);
                return;
            default:
                super.A00(r6, collection, z2);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r3 = (com.obwhatsapp.polls.PollResultsViewModel) r4.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.C16740tZ r5) {
        /*
            r4 = this;
            int r0 = r4.A01
            int r0 = 10 - r0
            if (r0 == 0) goto L_0x000a
            super.A01(r5)
        L_0x0009:
            return
        L_0x000a:
            if (r5 == 0) goto L_0x0009
            java.lang.Object r3 = r4.A00
            com.obwhatsapp.polls.PollResultsViewModel r3 = (com.obwhatsapp.polls.PollResultsViewModel) r3
            X.1s2 r2 = r3.A02
            if (r2 == 0) goto L_0x0009
            X.1Vw r0 = r5.A11
            java.lang.String r1 = r0.A01
            X.1Vw r0 = r2.A11
            java.lang.String r0 = r0.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0009
            r3.A07(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.data.IDxMObserverShape74S0100000_2_I0.A01(X.0tZ):void");
    }

    public void A02(C16740tZ r2) {
        if (this.A01 != 0) {
            super.A02(r2);
        } else if (C16030sJ.A0Q(r2.A11.A00)) {
            ((ContactInfoActivity) this.A00).A3Q();
        }
    }

    public void A03(Collection collection, int i2) {
        if (12 - this.A01 != 0) {
            super.A03(collection, i2);
            return;
        }
        for (Object next : collection) {
            if (next instanceof C38701rH) {
                ((SearchViewModel) this.A00).A08.A0B(next);
            }
        }
    }

    public void A04(C15830rv r5) {
        C38701rH r0;
        C15830rv r02;
        switch (this.A01) {
            case 4:
                AnonymousClass2DT r2 = ((C19610yi) this.A00).A00;
                if (r2 != null && (r0 = r2.A0O) != null && (r02 = r0.A11.A00) != null && r02.equals(r5)) {
                    r2.A0I(true, true);
                    return;
                }
                return;
            case 10:
                PollResultsViewModel pollResultsViewModel = (PollResultsViewModel) this.A00;
                C39171s2 r03 = pollResultsViewModel.A02;
                if (r03 != null && AnonymousClass3K4.A1A(r03, r5)) {
                    C16460t6 r22 = pollResultsViewModel.A08;
                    if (r22.A0K.A03(pollResultsViewModel.A02.A11) == null) {
                        pollResultsViewModel.A0C.A09(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                return;
            default:
                super.A04(r5);
                return;
        }
    }

    public void A05(C16740tZ r5, int i2) {
        byte b2;
        if (13 - this.A01 != 0) {
            super.A05(r5, i2);
            return;
        }
        C28381Vw r3 = r5.A11;
        C15830rv r1 = r3.A00;
        if (r1 != null) {
            StatusReplyActivity statusReplyActivity = (StatusReplyActivity) this.A00;
            if (r1.equals(statusReplyActivity.A0j) && r3.A02 && (b2 = r5.A10) != 8 && b2 != 7) {
                statusReplyActivity.A00.A03(r3, 4);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0054  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.C16740tZ r5, int r6) {
        /*
            r4 = this;
            int r0 = r4.A01
            switch(r0) {
                case 0: goto L_0x0009;
                case 1: goto L_0x0005;
                case 2: goto L_0x001b;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x0061;
                case 6: goto L_0x0005;
                case 7: goto L_0x0005;
                case 8: goto L_0x0088;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A06(r5, r6)
        L_0x0008:
            return
        L_0x0009:
            X.1Vw r0 = r5.A11
            X.0rv r0 = r0.A00
            boolean r0 = X.C16030sJ.A0Q(r0)
            if (r0 == 0) goto L_0x0008
            java.lang.Object r0 = r4.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r0 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r0
            r0.A3Q()
            return
        L_0x001b:
            boolean r0 = r5 instanceof X.C40421u5
            if (r0 == 0) goto L_0x0035
            r1 = r5
            X.1sX r1 = (X.C39471sX) r1
            r0 = 1
            com.whatsapp.jid.GroupJid r2 = r1.A14(r0)
        L_0x0027:
            if (r2 == 0) goto L_0x003f
            java.lang.Object r0 = r4.A00
            com.obwhatsapp.community.CommunityTabViewModel r0 = (com.obwhatsapp.community.CommunityTabViewModel) r0
            X.1WA r1 = r0.A0K
            r0 = 40
            X.AnonymousClass3K3.A1H(r1, r4, r2, r0)
            return
        L_0x0035:
            boolean r0 = r5 instanceof X.C39431sT
            if (r0 == 0) goto L_0x003f
            r0 = r5
            X.1sT r0 = (X.C39431sT) r0
            com.whatsapp.jid.GroupJid r2 = r0.A01
            goto L_0x0027
        L_0x003f:
            boolean r0 = r5 instanceof X.C39451sV
            if (r0 == 0) goto L_0x0054
            java.lang.Object r0 = r4.A00
            com.obwhatsapp.community.CommunityTabViewModel r0 = (com.obwhatsapp.community.CommunityTabViewModel) r0
            X.1WA r2 = r0.A0K
            r1 = 41
        L_0x004b:
            com.facebook.redex.RunnableRunnableShape17S0100000_I1 r0 = new com.facebook.redex.RunnableRunnableShape17S0100000_I1
            r0.<init>((java.lang.Object) r4, (int) r1)
            r2.execute(r0)
            return
        L_0x0054:
            boolean r0 = r5 instanceof X.C40371u0
            if (r0 == 0) goto L_0x0008
            java.lang.Object r0 = r4.A00
            com.obwhatsapp.community.CommunityTabViewModel r0 = (com.obwhatsapp.community.CommunityTabViewModel) r0
            X.1WA r2 = r0.A0K
            r1 = 40
            goto L_0x004b
        L_0x0061:
            X.1Vw r0 = r5.A11
            X.0rv r3 = r0.A00
            java.lang.Object r2 = r4.A00
            X.11K r2 = (X.AnonymousClass11K) r2
            X.17R r0 = r2.A05
            java.util.Map r1 = r0.A03
            java.lang.Object r0 = r1.get(r3)
            if (r0 != 0) goto L_0x0008
            r0 = 0
            java.lang.Object r0 = r1.get(r0)
            if (r0 != 0) goto L_0x0008
            X.0rt r1 = r2.A04
            X.0sG r0 = r2.A02
            int r0 = X.C40491uD.A00(r0, r1, r3)
            if (r0 <= 0) goto L_0x0008
            r2.A00()
            return
        L_0x0088:
            boolean r0 = r5 instanceof X.AnonymousClass1WU
            if (r0 == 0) goto L_0x0008
            java.lang.Object r2 = r4.A00
            X.291 r2 = (X.AnonymousClass291) r2
            X.0rv r0 = r2.A0c
            boolean r0 = X.AnonymousClass3K4.A1A(r5, r0)
            if (r0 == 0) goto L_0x0008
            r0 = r5
            X.1WU r0 = (X.AnonymousClass1WU) r0
            int r1 = r0.A00
            r0 = 5
            if (r1 == r0) goto L_0x00a3
            r0 = 7
            if (r1 != r0) goto L_0x0008
        L_0x00a3:
            X.0sK r1 = r2.A0z
            X.0rv r0 = r5.A0B()
            boolean r0 = r1.A0I(r0)
            if (r0 == 0) goto L_0x0008
            android.app.Activity r0 = r2.A0E
            r0.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.data.IDxMObserverShape74S0100000_2_I0.A06(X.0tZ, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d1, code lost:
        r3 = (com.obwhatsapp.polls.PollResultsViewModel) r5.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C16740tZ r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.A01
            switch(r0) {
                case 0: goto L_0x0009;
                case 1: goto L_0x0038;
                case 2: goto L_0x0005;
                case 3: goto L_0x0057;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x0005;
                case 7: goto L_0x0005;
                case 8: goto L_0x0005;
                case 9: goto L_0x0079;
                case 10: goto L_0x00cf;
                case 11: goto L_0x00eb;
                case 12: goto L_0x010f;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A07(r6, r7)
        L_0x0008:
            return
        L_0x0009:
            if (r6 == 0) goto L_0x002c
            java.lang.Object r1 = r5.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r1 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r1
            com.whatsapp.jid.UserJid r0 = r1.A3N()
            boolean r0 = X.AnonymousClass3K4.A1A(r6, r0)
            if (r0 == 0) goto L_0x002c
            byte r0 = r6.A10
            boolean r0 = X.C38621r6.A0N(r0)
            if (r0 == 0) goto L_0x002c
            r0 = 3
            if (r7 == r0) goto L_0x0028
            r0 = 9
            if (r7 != r0) goto L_0x002c
        L_0x0028:
            r1.A3T()
            return
        L_0x002c:
            r0 = 30
            if (r7 != r0) goto L_0x0008
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.chatinfo.ContactInfoActivity r0 = (com.obwhatsapp.chatinfo.ContactInfoActivity) r0
            r0.A3T()
            return
        L_0x0038:
            if (r6 == 0) goto L_0x0008
            java.lang.Object r1 = r5.A00
            com.obwhatsapp.chatinfo.ListChatInfoActivity r1 = (com.obwhatsapp.chatinfo.ListChatInfoActivity) r1
            X.1kx r0 = r1.A3M()
            boolean r0 = X.AnonymousClass3K4.A1A(r6, r0)
            if (r0 == 0) goto L_0x0008
            byte r0 = r6.A10
            boolean r0 = X.C38621r6.A0N(r0)
            if (r0 == 0) goto L_0x0008
            r0 = 3
            if (r7 != r0) goto L_0x0008
            r1.A3R()
            return
        L_0x0057:
            r0 = 25
            if (r7 != r0) goto L_0x0008
            X.1Vw r0 = r6.A11
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0008
            byte r0 = r6.A10
            boolean r0 = X.C30921dB.A00(r0)
            if (r0 == 0) goto L_0x0008
            java.lang.Object r0 = r5.A00
            X.15I r0 = (X.AnonymousClass15I) r0
            X.1WA r2 = r0.A0Z
            r1 = 3
            com.facebook.redex.RunnableRunnableShape14S0200000_I1_2 r0 = new com.facebook.redex.RunnableRunnableShape14S0200000_I1_2
            r0.<init>(r5, r1, r6)
            r2.execute(r0)
            return
        L_0x0079:
            java.lang.Object r2 = r5.A00
            com.obwhatsapp.notification.PopupNotification r2 = (com.obwhatsapp.notification.PopupNotification) r2
            com.obwhatsapp.notification.PopupNotificationViewPager r0 = r2.A12
            X.1Vw r4 = r6.A11
            android.view.View r1 = r0.findViewWithTag(r4)
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x00a5
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r3 = 0
            android.view.View r1 = r1.getChildAt(r3)
            boolean r0 = r1 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x00a5
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.View r1 = r1.getChildAt(r3)
            boolean r0 = r1 instanceof X.C30011bb
            if (r0 == 0) goto L_0x00a5
            X.1bb r1 = (X.C30011bb) r1
            if (r1 == 0) goto L_0x00a5
            r1.A0t()
        L_0x00a5:
            byte r1 = r6.A10
            r0 = 20
            if (r1 != r0) goto L_0x0008
            java.util.List r0 = r2.A1O
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x0008
            r0 = 3
            if (r7 != r0) goto L_0x0008
            com.obwhatsapp.notification.PopupNotificationViewPager r0 = r2.A12
            android.view.View r1 = r0.findViewWithTag(r4)
            if (r1 == 0) goto L_0x0008
            r0 = 2131365422(0x7f0a0e2e, float:1.8350709E38)
            android.view.View r0 = r1.findViewById(r0)
            com.whatsapp.stickers.StickerView r0 = (com.whatsapp.stickers.StickerView) r0
            if (r0 == 0) goto L_0x0008
            X.1rB r6 = (X.C38641rB) r6
            r2.A2v(r6, r0)
            return
        L_0x00cf:
            if (r6 == 0) goto L_0x0008
            java.lang.Object r3 = r5.A00
            com.obwhatsapp.polls.PollResultsViewModel r3 = (com.obwhatsapp.polls.PollResultsViewModel) r3
            X.1s2 r2 = r3.A02
            if (r2 == 0) goto L_0x0008
            X.1Vw r0 = r6.A11
            java.lang.String r1 = r0.A01
            X.1Vw r0 = r2.A11
            java.lang.String r0 = r0.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0008
            r3.A07(r2)
            return
        L_0x00eb:
            r0 = 8
            if (r7 == r0) goto L_0x0008
            X.1Vw r0 = r6.A11
            X.0rv r0 = r0.A00
            boolean r0 = X.C16030sJ.A0K(r0)
            if (r0 == 0) goto L_0x0008
            r1 = 3
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.report.ReportActivity r0 = (com.obwhatsapp.report.ReportActivity) r0
            if (r7 != r1) goto L_0x011d
            X.0pt r3 = r0.A05
            r0 = 31
            com.facebook.redex.RunnableRunnableShape19S0100000_I1_2 r2 = new com.facebook.redex.RunnableRunnableShape19S0100000_I1_2
            r2.<init>(r5, r0)
            r0 = 2000(0x7d0, double:9.88E-321)
            r3.A0L(r2, r0)
            return
        L_0x010f:
            boolean r0 = r6 instanceof X.C38701rH
            if (r0 == 0) goto L_0x0008
            java.lang.Object r0 = r5.A00
            com.obwhatsapp.search.SearchViewModel r0 = (com.obwhatsapp.search.SearchViewModel) r0
            X.026 r0 = r0.A08
            r0.A0B(r6)
            return
        L_0x011d:
            r0.Aba()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.data.IDxMObserverShape74S0100000_2_I0.A07(X.0tZ, int):void");
    }

    public void A08(Collection collection, Map map) {
        switch (this.A01) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    C16740tZ A0V = C13680ns.A0V(it);
                    ContactInfoActivity contactInfoActivity = (ContactInfoActivity) this.A00;
                    UserJid A3N = contactInfoActivity.A3N();
                    C15830rv r1 = A0V.A11.A00;
                    if (A3N.equals(r1) && (C38621r6.A0N(A0V.A10) || A0V.A0x)) {
                        contactInfoActivity.A3T();
                        return;
                    } else if (C16030sJ.A0Q(r1)) {
                        contactInfoActivity.A3Q();
                        return;
                    }
                }
                return;
            case 1:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    C16740tZ A0V2 = C13680ns.A0V(it2);
                    ListChatInfoActivity listChatInfoActivity = (ListChatInfoActivity) this.A00;
                    if (AnonymousClass3K4.A1A(A0V2, listChatInfoActivity.A3M()) && (C38621r6.A0N(A0V2.A10) || A0V2.A0x)) {
                        listChatInfoActivity.A3R();
                        return;
                    }
                }
                return;
            case 3:
                if (map != null && !map.isEmpty()) {
                    ((AnonymousClass15I) this.A00).A0Z.execute(new RunnableRunnableShape3S0300000_I1(this, map, collection, 19));
                    return;
                }
                return;
            case 4:
                C19610yi r3 = (C19610yi) this.A00;
                if (r3.A00 != null) {
                    Iterator it3 = collection.iterator();
                    while (it3.hasNext()) {
                        if (r3.A00.A0L(C13680ns.A0V(it3))) {
                            r3.A00.A0I(false, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 6:
                Iterator it4 = collection.iterator();
                while (it4.hasNext()) {
                    C15830rv r2 = C13680ns.A0V(it4).A11.A00;
                    if (r2 != null) {
                        GalleryFragmentBase galleryFragmentBase = (GalleryFragmentBase) this.A00;
                        if (r2.equals(galleryFragmentBase.A0D)) {
                            galleryFragmentBase.A1C();
                            return;
                        }
                    }
                }
                return;
            case 7:
                Iterator it5 = collection.iterator();
                while (it5.hasNext()) {
                    C15830rv r22 = C13680ns.A0V(it5).A11.A00;
                    if (r22 != null) {
                        MediaGalleryFragment mediaGalleryFragment = (MediaGalleryFragment) this.A00;
                        if (r22.equals(mediaGalleryFragment.A03)) {
                            mediaGalleryFragment.A1I(false);
                            return;
                        }
                    }
                }
                return;
            case 10:
                PollResultsViewModel pollResultsViewModel = (PollResultsViewModel) this.A00;
                if (pollResultsViewModel.A02 != null) {
                    Iterator it6 = collection.iterator();
                    while (it6.hasNext()) {
                        if (C13680ns.A0V(it6).A11.equals(pollResultsViewModel.A02.A11)) {
                            pollResultsViewModel.A0C.A09(Boolean.TRUE);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 14:
                StorageUsageGalleryActivity storageUsageGalleryActivity = (StorageUsageGalleryActivity) this.A00;
                storageUsageGalleryActivity.A0k.removeCallbacks(storageUsageGalleryActivity.A0o);
                Runnable runnable = storageUsageGalleryActivity.A0h;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            default:
                super.A08(collection, map);
                return;
        }
    }
}
