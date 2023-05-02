package com.obwhatsapp.data;

import X.AnonymousClass000;
import X.AnonymousClass00B;
import X.AnonymousClass00T;
import X.AnonymousClass026;
import X.AnonymousClass1MX;
import X.AnonymousClass1MY;
import X.AnonymousClass1MZ;
import X.AnonymousClass1WU;
import X.AnonymousClass2Aa;
import X.AnonymousClass2Az;
import X.AnonymousClass2B0;
import X.AnonymousClass2B2;
import X.AnonymousClass2B5;
import X.AnonymousClass2B6;
import X.AnonymousClass2B9;
import X.AnonymousClass2BD;
import X.AnonymousClass2BE;
import X.AnonymousClass2BG;
import X.C13680ns;
import X.C14700pc;
import X.C15830rv;
import X.C16030sJ;
import X.C16730tY;
import X.C16740tZ;
import X.C16750ta;
import X.C18020w1;
import X.C18940xV;
import X.C26031Mb;
import X.C28381Vw;
import X.C30011bb;
import X.C30581cc;
import X.C30801cy;
import X.C32291fz;
import X.C34091jg;
import X.C34621kZ;
import X.C34631ka;
import X.C34641kb;
import X.C34651kc;
import X.C34901l3;
import X.C38621r6;
import X.C38681rF;
import X.C38711rI;
import X.C38801rR;
import X.C39131ry;
import X.C39171s2;
import X.C42881yp;
import X.C45722Ar;
import X.C45732As;
import X.C45752Au;
import X.C45772Ax;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.facebook.redex.RunnableRunnableShape1S0201000_I1;
import com.facebook.redex.ViewOnClickCListenerShape2S0300000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.conversation.conversationrow.album.MediaAlbumActivity;
import com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity;
import com.obwhatsapp.gallery.MediaGalleryFragmentBase;
import com.obwhatsapp.status.StatusesFragment;
import com.obwhatsapp.status.playback.MyStatusesActivity;
import com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class IDxMObserverShape73S0100000_1_I0 extends C18940xV {
    public Object A00;
    public final int A01;

    public IDxMObserverShape73S0100000_1_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00(C15830rv r11, Collection collection, boolean z2) {
        C16730tY r0;
        List list;
        switch (this.A01) {
            case 0:
                if (collection != null) {
                    boolean z3 = false;
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        C16740tZ A0V = C13680ns.A0V(it);
                        MediaAlbumActivity mediaAlbumActivity = (MediaAlbumActivity) this.A00;
                        AnonymousClass2Aa r02 = mediaAlbumActivity.A08;
                        C28381Vw r2 = A0V.A11;
                        List list2 = r02.A00;
                        if (list2 != null) {
                            Iterator it2 = list2.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (C13680ns.A0V(it2).A11.equals(r2)) {
                                        mediaAlbumActivity.A0U.add(r2);
                                        z3 = true;
                                    }
                                }
                            }
                        }
                    }
                    if (z3) {
                        ((MediaAlbumActivity) this.A00).A08.notifyDataSetChanged();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                Iterator it3 = collection.iterator();
                while (it3.hasNext()) {
                    A09(C13680ns.A0V(it3));
                }
                return;
            case 2:
                C34621kZ r1 = (C34621kZ) this.A00;
                Collection collection2 = null;
                boolean z4 = false;
                if (collection == null || collection.isEmpty()) {
                    z4 = true;
                } else {
                    collection2 = collection;
                }
                r1.A0n.A0B(new C34631ka((C34641kb) null, (C34651kc) null, (Boolean) null, (Boolean) null, collection2, false, z4));
                r1.A0C();
                return;
            case 5:
                AnonymousClass026 r4 = ((AnonymousClass2B6) this.A00).A06;
                AnonymousClass2B9 r3 = (AnonymousClass2B9) r4.A01();
                if (r3 != null && collection != null) {
                    if (z2) {
                        r3.A04.removeAll(collection);
                        list = r3.A03;
                    } else {
                        r3.A03.removeAll(collection);
                        list = r3.A04;
                    }
                    TreeSet treeSet = new TreeSet(AnonymousClass2BG.A00);
                    treeSet.addAll(list);
                    treeSet.addAll(collection);
                    list.clear();
                    list.addAll(treeSet);
                    r4.A09(r3);
                    return;
                }
                return;
            case 10:
                MediaGalleryFragmentBase mediaGalleryFragmentBase = (MediaGalleryFragmentBase) this.A00;
                AnonymousClass2BD r6 = (AnonymousClass2BD) mediaGalleryFragmentBase.A0H;
                if (r6 != null && collection != null) {
                    int count = r6.getCount();
                    Iterator it4 = collection.iterator();
                    boolean z5 = false;
                    while (it4.hasNext()) {
                        C16740tZ A0V2 = C13680ns.A0V(it4);
                        int i2 = 0;
                        while (true) {
                            if (i2 < count) {
                                AnonymousClass2BE r22 = (AnonymousClass2BE) AnonymousClass000.A0Y(r6.A06, i2);
                                if (r22 == null || (r0 = r22.A03) == null || !r0.A11.equals(A0V2.A11)) {
                                    i2++;
                                } else {
                                    r22.A03.A0x = z2;
                                    z5 = true;
                                }
                            }
                        }
                    }
                    if (z5) {
                        mediaGalleryFragmentBase.A06.A01();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void A01(C16740tZ r5) {
        switch (this.A01) {
            case 1:
                A09(r5);
                return;
            case 7:
                if (r5 != null) {
                    C28381Vw r1 = r5.A11;
                    if (C16030sJ.A0Q(r1.A00) && r1.A02) {
                        MyStatusesActivity.A02(r5, (MyStatusesActivity) this.A00, true);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                if (r5 != null) {
                    C28381Vw r3 = r5.A11;
                    String str = r3.A01;
                    AnonymousClass2B2 r2 = (AnonymousClass2B2) this.A00;
                    C16740tZ r0 = r2.A0B;
                    AnonymousClass00B.A06(r0);
                    if (str.equals(r0.A11.A01) && r3.A02) {
                        C13680ns.A1T(r2.A00);
                        AnonymousClass2B5 r12 = new AnonymousClass2B5(r2);
                        r2.A00 = r12;
                        C13680ns.A1U(r12, r2.A0X);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    public void A02(C16740tZ r4) {
        if (6 - this.A01 == 0 && C16030sJ.A0Q(r4.A11.A00)) {
            StatusesFragment statusesFragment = (StatusesFragment) this.A00;
            statusesFragment.A1I.add(UserJid.of(r4.A0B()));
            statusesFragment.A1D();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005a, code lost:
        r0 = r2.A02;
        r1 = ((X.C16460t6) r5.A0d.get()).A0K;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.C15830rv r7) {
        /*
            r6 = this;
            int r0 = r6.A01
            switch(r0) {
                case 1: goto L_0x0006;
                case 2: goto L_0x0026;
                case 3: goto L_0x0047;
                case 4: goto L_0x0005;
                case 5: goto L_0x00ca;
                case 6: goto L_0x0039;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.lang.Object r2 = r6.A00
            com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity r2 = (com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity) r2
            X.0tZ r0 = r2.A0M
            X.1Vw r0 = r0.A11
            X.0rv r0 = r0.A00
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0005
            X.0t6 r1 = r2.A0H
            X.0tZ r0 = r2.A0M
            X.1Vw r0 = r0.A11
            X.0tZ r0 = X.C16460t6.A00(r1, r0)
            if (r0 != 0) goto L_0x0005
            r2.finish()
            return
        L_0x0026:
            java.lang.Object r1 = r6.A00
            X.1kZ r1 = (X.C34621kZ) r1
            X.0rv r0 = r1.A0h
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0005
            r1.A0F()
            r1.A0C()
            return
        L_0x0039:
            boolean r0 = X.C16030sJ.A0Q(r7)
            if (r0 == 0) goto L_0x0005
            java.lang.Object r0 = r6.A00
            com.obwhatsapp.status.StatusesFragment r0 = (com.obwhatsapp.status.StatusesFragment) r0
            r0.A1D()
            return
        L_0x0047:
            java.lang.Object r5 = r6.A00
            X.0yQ r5 = (X.C19430yQ) r5
            java.lang.Object r3 = r5.A0S
            monitor-enter(r3)
            java.util.Map r0 = r5.A0A()     // Catch:{ all -> 0x00c7 }
            java.lang.Object r2 = r0.get(r7)     // Catch:{ all -> 0x00c7 }
            X.28s r2 = (X.C454628s) r2     // Catch:{ all -> 0x00c7 }
            if (r2 == 0) goto L_0x0075
            X.01D r0 = r5.A0d     // Catch:{ all -> 0x00c7 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x00c7 }
            X.0t6 r1 = (X.C16460t6) r1     // Catch:{ all -> 0x00c7 }
            X.1Vw r0 = r2.A02     // Catch:{ all -> 0x00c7 }
            X.0th r1 = r1.A0K     // Catch:{ all -> 0x00c7 }
            X.0tZ r0 = r1.A03(r0)     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x0072
            boolean r0 = r1.A06(r0)     // Catch:{ all -> 0x00c7 }
            if (r0 == 0) goto L_0x0075
        L_0x0072:
            r5.A0O(r7)     // Catch:{ all -> 0x00c7 }
        L_0x0075:
            monitor-exit(r3)     // Catch:{ all -> 0x00c7 }
            java.lang.Object r4 = r5.A0R
            monitor-enter(r4)
            java.util.Map r1 = r5.A09()     // Catch:{ all -> 0x00c4 }
            boolean r0 = r1.containsKey(r7)     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x00c2
            java.lang.Object r0 = r1.get(r7)     // Catch:{ all -> 0x00c4 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x00c4 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x00c4 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x00c4 }
            java.util.ArrayList r0 = X.C13680ns.A0n(r0)     // Catch:{ all -> 0x00c4 }
            java.util.Iterator r3 = r0.iterator()     // Catch:{ all -> 0x00c4 }
        L_0x0098:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x00c2
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x00c4 }
            X.28x r2 = (X.AnonymousClass28x) r2     // Catch:{ all -> 0x00c4 }
            X.01D r0 = r5.A0d     // Catch:{ all -> 0x00c4 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x00c4 }
            X.0t6 r1 = (X.C16460t6) r1     // Catch:{ all -> 0x00c4 }
            X.1Vw r0 = r2.A02     // Catch:{ all -> 0x00c4 }
            X.0th r1 = r1.A0K     // Catch:{ all -> 0x00c4 }
            X.0tZ r0 = r1.A03(r0)     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x00bc
            boolean r0 = r1.A06(r0)     // Catch:{ all -> 0x00c4 }
            if (r0 == 0) goto L_0x0098
        L_0x00bc:
            com.whatsapp.jid.UserJid r0 = r2.A01     // Catch:{ all -> 0x00c4 }
            r5.A0P(r7, r0)     // Catch:{ all -> 0x00c4 }
            goto L_0x0098
        L_0x00c2:
            monitor-exit(r4)     // Catch:{ all -> 0x00c4 }
            return
        L_0x00c4:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00c4 }
            throw r0
        L_0x00c7:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00c7 }
            throw r0
        L_0x00ca:
            java.lang.Object r1 = r6.A00
            X.2B6 r1 = (X.AnonymousClass2B6) r1
            X.1xi r0 = r1.A0I
            int r0 = r0.A02
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r1.A0A(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.data.IDxMObserverShape73S0100000_1_I0.A04(X.0rv):void");
    }

    public void A05(C16740tZ r45, int i2) {
        C34651kc r2;
        int i3;
        if (2 - this.A01 == 0) {
            C34621kZ r0 = (C34621kZ) this.A00;
            C34641kb r37 = null;
            Boolean bool = null;
            boolean z2 = false;
            boolean z3 = false;
            int i4 = null;
            boolean z4 = false;
            boolean z5 = false;
            C16740tZ r1 = r45;
            C28381Vw r6 = r1.A11;
            C15830rv r22 = r6.A00;
            if (r22 != null) {
                C15830rv r3 = r0.A0h;
                if (r22.equals(r3) && r6.A02 && r1.A10 != 8 && !(r1 instanceof C39131ry)) {
                    C26031Mb r5 = r0.A0U;
                    if (r0.A10 && (r1 instanceof AnonymousClass1WU) && ((i3 = ((AnonymousClass1WU) r1).A00) == 1 || i3 == 27 || i3 == 4 || i3 == 5 || i3 == 7 || C38621r6.A0O(i3) || i3 == 13 || i3 == 14 || i3 == 17 || i3 == 31 || i3 == 32 || i3 == 56)) {
                        z3 = true;
                    }
                    synchronized (r0) {
                        r2 = r0.A0B;
                    }
                    if (r5.A00(r2, r3, r1)) {
                        List list = r0.A0x;
                        list.add(r1);
                        r37 = C34641kb.copyOf((Collection) list);
                    }
                    if (r0.A07 != 0 && C38621r6.A0S(r5.A00, r1)) {
                        r0.A0F();
                        r0.A0D();
                    }
                    C16740tZ r4 = r0.A0D;
                    if (!(r1.A0C == 6 || i2 == 7)) {
                        i4 = 8;
                        z4 = true;
                        if (r4 != null) {
                            z5 = true;
                        }
                        r0.A0J((C16740tZ) null);
                    }
                    z2 = true;
                    bool = Boolean.TRUE;
                    Intent intent = r0.A0L;
                    long uptimeMillis = SystemClock.uptimeMillis();
                    C18020w1 r15 = r5.A01;
                    int i5 = r1.A0A;
                    long j2 = uptimeMillis - r1.A18;
                    long j3 = uptimeMillis - r1.A1G;
                    Boolean bool2 = null;
                    r15.A0J(r1, (Collection) null, 1, 0, 0, 0, 0, 0, 0, i5, j2, j3, j3, false, false, false, false, false);
                    if (!(r1 instanceof AnonymousClass1WU)) {
                        AnonymousClass1MZ r12 = r5.A02;
                        String stringExtra = intent.getStringExtra("extra_deep_link_session_id");
                        int intExtra = intent.getIntExtra("args_conversation_screen_entry_point", 0);
                        if (intExtra != 0) {
                            r12.A01.A03(r6, intExtra);
                        }
                        if (!TextUtils.isEmpty(stringExtra)) {
                            AnonymousClass1MX r62 = r12.A03;
                            C45722Ar r52 = new C45722Ar();
                            r52.A00 = 1;
                            r52.A01 = stringExtra;
                            r62.A00.A06(r52);
                        }
                        if (intExtra == 7) {
                            AnonymousClass1MY r53 = r12.A00;
                            Boolean bool3 = null;
                            if (intent.hasExtra("isPhoneNumberOwner")) {
                                bool2 = Boolean.valueOf(intent.getBooleanExtra("isPhoneNumberOwner", false));
                            }
                            if (intent.hasExtra("isWAAccount")) {
                                bool3 = Boolean.valueOf(intent.getBooleanExtra("isWAAccount", false));
                            }
                            r53.A00(bool2, bool3, 9);
                        }
                    }
                }
            }
            r0.A0m.A0B(new C45732As(i4, z3, z4, z5));
            r0.A0n.A0B(new C34631ka(r37, (C34651kc) null, (Boolean) null, bool, (Collection) null, z2, false));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0202, code lost:
        if (r2.A07 != 0) goto L_0x0204;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x027f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0280, code lost:
        com.whatsapp.util.Log.i("messagesViewModel/addreceived/staledata ", r1);
        r0 = r2.A0x;
        r0.add(r3);
        r25 = X.C34641kb.copyOf((java.util.Collection) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0106, code lost:
        if (r0 == false) goto L_0x0108;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.C16740tZ r33, int r34) {
        /*
            r32 = this;
            r2 = r32
            int r0 = r2.A01
            r3 = r33
            switch(r0) {
                case 2: goto L_0x000a;
                case 3: goto L_0x0009;
                case 4: goto L_0x0009;
                case 5: goto L_0x0009;
                case 6: goto L_0x0039;
                case 7: goto L_0x0089;
                default: goto L_0x0009;
            }
        L_0x0009:
            return
        L_0x000a:
            java.lang.Object r2 = r2.A00
            X.1kZ r2 = (X.C34621kZ) r2
            if (r33 == 0) goto L_0x0009
            X.1Vw r4 = r3.A11
            X.0rv r0 = r4.A00
            X.0rv r7 = r2.A0h
            boolean r0 = X.C34901l3.A00(r0, r7)
            if (r0 == 0) goto L_0x0009
            byte r6 = r3.A10
            r0 = 8
            if (r6 == r0) goto L_0x0009
            boolean r0 = r3 instanceof X.C39131ry
            if (r0 != 0) goto L_0x0009
            r26 = 0
            r25 = r26
            r19 = 0
            r20 = 0
            r21 = 0
            r23 = 0
            r12 = 0
            r11 = 0
            r16 = r26
            X.1Mb r10 = r2.A0U
            goto L_0x00ad
        L_0x0039:
            X.1Vw r4 = r3.A11
            X.0rv r0 = r4.A00
            boolean r0 = X.C16030sJ.A0Q(r0)
            if (r0 == 0) goto L_0x0009
            java.lang.Object r5 = r2.A00
            com.obwhatsapp.status.StatusesFragment r5 = (com.obwhatsapp.status.StatusesFragment) r5
            r5.A1D()
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x029c
            android.view.View r0 = r5.A03
            if (r0 == 0) goto L_0x006c
            android.content.Context r0 = r5.A0u()
            if (r0 == 0) goto L_0x006c
            X.0rz r0 = r5.A0Q
            r2 = 0
            android.content.SharedPreferences$Editor r1 = r0.A0K()
            java.lang.String r0 = "show_statuses_education"
            X.C13680ns.A0z(r1, r0, r2)
            android.view.View r1 = r5.A03
            r0 = 8
            r1.setVisibility(r0)
        L_0x006c:
            X.2Au r1 = r5.A0r
            r5.A02()
            boolean r0 = r3 instanceof X.C30581cc
            if (r0 != 0) goto L_0x0081
            boolean r0 = r3 instanceof X.C38801rR
            if (r0 != 0) goto L_0x0081
            boolean r0 = r3 instanceof X.C38681rF
            if (r0 != 0) goto L_0x0081
            boolean r0 = r3 instanceof X.C38711rI
            if (r0 == 0) goto L_0x0009
        L_0x0081:
            java.util.Map r1 = r1.A03
            java.lang.String r0 = r4.A01
            r1.put(r0, r3)
            return
        L_0x0089:
            X.1Vw r1 = r3.A11
            X.0rv r0 = r1.A00
            boolean r0 = X.C16030sJ.A0Q(r0)
            if (r0 == 0) goto L_0x0009
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0009
            java.lang.Object r2 = r2.A00
            com.obwhatsapp.status.playback.MyStatusesActivity r2 = (com.obwhatsapp.status.playback.MyStatusesActivity) r2
            X.2Aw r0 = r2.A0j
            X.C13680ns.A1T(r0)
            X.2Aw r1 = new X.2Aw
            r1.<init>(r2)
            r2.A0j = r1
            X.0sq r0 = r2.A05
            X.C13680ns.A1U(r1, r0)
            return
        L_0x00ad:
            boolean r0 = X.C38621r6.A0j(r3)     // Catch:{ Exception -> 0x00b4 }
            if (r0 == 0) goto L_0x00bd
            goto L_0x00bb
        L_0x00b4:
            r1 = move-exception
            java.lang.String r0 = "messageObserverHelper/onMessageAddedHandleEphemeralMessageNux/consumed"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x00bd
        L_0x00bb:
            r19 = 1
        L_0x00bd:
            boolean r9 = r4.A02
            if (r9 == 0) goto L_0x01cc
            long r0 = r3.A14
            r13 = -1
            int r4 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r4 < 0) goto L_0x01cc
            boolean r0 = r3 instanceof X.AnonymousClass1WU
            if (r0 == 0) goto L_0x015c
            r0 = r3
            X.1WU r0 = (X.AnonymousClass1WU) r0
            int r1 = r0.A00
            r0 = 28
            if (r1 != r0) goto L_0x015c
            r20 = 1
        L_0x00d8:
            int r0 = r2.A03
            if (r0 != 0) goto L_0x0159
            boolean r0 = X.C38621r6.A0o(r3)
            if (r0 != 0) goto L_0x0159
            long r0 = r3.A14
            r5 = -1
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 < 0) goto L_0x0159
            int r0 = r2.A04
            int r11 = r0 + 1
            r2.A04 = r11
            X.0sK r0 = r2.A0R
            boolean r0 = X.C38621r6.A0Q(r0, r3)
            if (r0 == 0) goto L_0x0100
            java.util.ArrayList r0 = r2.A0w
            r0.add(r3)
            r2.A0E()
        L_0x0100:
            boolean r0 = r2.A0H
            if (r9 != 0) goto L_0x0108
            r22 = 1
            if (r0 != 0) goto L_0x010a
        L_0x0108:
            r22 = 0
        L_0x010a:
            X.0sK r0 = r2.A0R
            boolean r0 = X.C38621r6.A0R(r0, r3)
            if (r0 == 0) goto L_0x0114
            r23 = 1
        L_0x0114:
            boolean r0 = r2.A10
            if (r0 == 0) goto L_0x0132
            X.0w8 r0 = r10.A04
            boolean r0 = r0.A0C(r12)
            if (r0 == 0) goto L_0x0132
            boolean r0 = r3 instanceof X.AnonymousClass1WU
            if (r0 == 0) goto L_0x0132
            r0 = r3
            X.1WU r0 = (X.AnonymousClass1WU) r0
            int r1 = r0.A00
            r0 = 32
            if (r1 == r0) goto L_0x0131
            r0 = 31
            if (r1 != r0) goto L_0x0132
        L_0x0131:
            r12 = 1
        L_0x0132:
            X.1cy r0 = r2.A0p
            r31 = 0
            X.2At r15 = new X.2At
            r24 = r12
            r18 = r11
            r17 = r3
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0.A0B(r15)
            X.1cy r1 = r2.A0n
            r30 = 1
            X.1ka r0 = new X.1ka
            r28 = r26
            r29 = r26
            r24 = r0
            r27 = r26
            r24.<init>(r25, r26, r27, r28, r29, r30, r31)
            r1.A0B(r0)
            return
        L_0x0159:
            r21 = 1
            goto L_0x0100
        L_0x015c:
            int r8 = r2.A05()
            X.0tZ r7 = r2.A09()
            java.util.List r6 = r2.A0x
            java.lang.String r14 = "messagesViewModel/addsent/skipped/"
            if (r8 != 0) goto L_0x0187
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r14)     // Catch:{ StaleDataException -> 0x01c4 }
            java.lang.String r0 = X.C38621r6.A0J(r3)     // Catch:{ StaleDataException -> 0x01c4 }
            r1.append(r0)     // Catch:{ StaleDataException -> 0x01c4 }
            java.lang.String r0 = " adapter-count:0"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ StaleDataException -> 0x01c4 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ StaleDataException -> 0x01c4 }
            r6.add(r3)     // Catch:{ StaleDataException -> 0x01c4 }
            X.1kb r25 = X.C34641kb.copyOf((java.util.Collection) r6)     // Catch:{ StaleDataException -> 0x01c4 }
            goto L_0x00d8
        L_0x0187:
            if (r7 == 0) goto L_0x00d8
            long r4 = r7.A14     // Catch:{ StaleDataException -> 0x01c4 }
            long r0 = r3.A14     // Catch:{ StaleDataException -> 0x01c4 }
            int r13 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r13 >= 0) goto L_0x00d8
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0q(r14)     // Catch:{ StaleDataException -> 0x01c4 }
            java.lang.String r0 = X.C38621r6.A0J(r3)     // Catch:{ StaleDataException -> 0x01c4 }
            r4.append(r0)     // Catch:{ StaleDataException -> 0x01c4 }
            java.lang.String r0 = " adapter-count:"
            r4.append(r0)     // Catch:{ StaleDataException -> 0x01c4 }
            r4.append(r8)     // Catch:{ StaleDataException -> 0x01c4 }
            java.lang.String r0 = " las-row-id:"
            r4.append(r0)     // Catch:{ StaleDataException -> 0x01c4 }
            long r0 = r7.A13     // Catch:{ StaleDataException -> 0x01c4 }
            r4.append(r0)     // Catch:{ StaleDataException -> 0x01c4 }
            java.lang.String r0 = " cur-row-id:"
            r4.append(r0)     // Catch:{ StaleDataException -> 0x01c4 }
            long r0 = r3.A13     // Catch:{ StaleDataException -> 0x01c4 }
            r4.append(r0)     // Catch:{ StaleDataException -> 0x01c4 }
            X.C13680ns.A1V(r4)     // Catch:{ StaleDataException -> 0x01c4 }
            r6.add(r3)     // Catch:{ StaleDataException -> 0x01c4 }
            X.1kb r25 = X.C34641kb.copyOf((java.util.Collection) r6)     // Catch:{ StaleDataException -> 0x01c4 }
            goto L_0x00d8
        L_0x01c4:
            r1 = move-exception
            java.lang.String r0 = "messagesViewModel/addsent/staledata "
            com.whatsapp.util.Log.i(r0, r1)
            goto L_0x00d8
        L_0x01cc:
            long r0 = r3.A13
            r8 = 1
            r14 = -1
            int r4 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            boolean r1 = X.AnonymousClass000.A1O(r4)
            java.lang.String r0 = "row id must be present"
            X.AnonymousClass00B.A0B(r0, r1)
            int r1 = r2.A05()     // Catch:{ StaleDataException -> 0x027f }
            X.0tZ r0 = r2.A09()     // Catch:{ StaleDataException -> 0x027f }
            if (r1 <= 0) goto L_0x01ea
            if (r0 == 0) goto L_0x01ea
            goto L_0x0246
        L_0x01ea:
            monitor-enter(r2)     // Catch:{ StaleDataException -> 0x027f }
            X.1kc r0 = r2.A0B     // Catch:{ all -> 0x027c }
            monitor-exit(r2)     // Catch:{ StaleDataException -> 0x027f }
            boolean r0 = r10.A00(r0, r7, r3)     // Catch:{ StaleDataException -> 0x027f }
            if (r0 == 0) goto L_0x0262
            X.10R r4 = r2.A0X     // Catch:{ StaleDataException -> 0x027f }
            boolean r0 = r4.A04(r3)     // Catch:{ StaleDataException -> 0x027f }
            if (r0 == 0) goto L_0x020b
            java.lang.Integer r0 = r3.A0X     // Catch:{ StaleDataException -> 0x027f }
            if (r0 != 0) goto L_0x020b
            int r0 = r2.A07     // Catch:{ StaleDataException -> 0x027f }
            if (r0 == 0) goto L_0x0239
        L_0x0204:
            int r0 = r2.A07     // Catch:{ StaleDataException -> 0x027f }
            int r0 = r0 + 1
            r2.A07 = r0     // Catch:{ StaleDataException -> 0x027f }
            goto L_0x0227
        L_0x020b:
            monitor-enter(r2)     // Catch:{ StaleDataException -> 0x027f }
            X.0tZ r1 = r2.A0C     // Catch:{ all -> 0x027c }
            monitor-exit(r2)     // Catch:{ StaleDataException -> 0x027f }
            int r0 = r2.A07     // Catch:{ StaleDataException -> 0x027f }
            if (r0 == 0) goto L_0x0204
            if (r1 == 0) goto L_0x0204
            X.0sK r0 = r2.A0R     // Catch:{ StaleDataException -> 0x027f }
            boolean r0 = X.C38621r6.A0S(r0, r1)     // Catch:{ StaleDataException -> 0x027f }
            if (r0 != 0) goto L_0x0223
            boolean r0 = r4.A04(r1)     // Catch:{ StaleDataException -> 0x027f }
            if (r0 == 0) goto L_0x0204
        L_0x0223:
            r2.A0F()     // Catch:{ StaleDataException -> 0x027f }
            goto L_0x0204
        L_0x0227:
            r0 = 10
            if (r6 != r0) goto L_0x022c
            goto L_0x0233
        L_0x022c:
            int r0 = r2.A05     // Catch:{ StaleDataException -> 0x027f }
            int r0 = r0 + 1
            r2.A05 = r0     // Catch:{ StaleDataException -> 0x027f }
            goto L_0x0239
        L_0x0233:
            int r0 = r2.A06     // Catch:{ StaleDataException -> 0x027f }
            int r0 = r0 + 1
            r2.A06 = r0     // Catch:{ StaleDataException -> 0x027f }
        L_0x0239:
            r2.A0D()     // Catch:{ StaleDataException -> 0x027f }
            java.util.List r0 = r2.A0x     // Catch:{ StaleDataException -> 0x027f }
            r0.add(r3)     // Catch:{ StaleDataException -> 0x027f }
            X.1kb r25 = X.C34641kb.copyOf((java.util.Collection) r0)     // Catch:{ StaleDataException -> 0x027f }
            goto L_0x0262
        L_0x0246:
            long r4 = r0.A14     // Catch:{ StaleDataException -> 0x027f }
            long r0 = r3.A14     // Catch:{ StaleDataException -> 0x027f }
            int r13 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r13 < 0) goto L_0x01ea
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ StaleDataException -> 0x027f }
            java.lang.String r0 = "messagesViewModel/addreceived/skip/"
            r1.append(r0)     // Catch:{ StaleDataException -> 0x027f }
            java.lang.String r0 = X.C38621r6.A0J(r3)     // Catch:{ StaleDataException -> 0x027f }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ StaleDataException -> 0x027f }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ StaleDataException -> 0x027f }
        L_0x0262:
            X.0rv r0 = r3.A0B()     // Catch:{ StaleDataException -> 0x027f }
            if (r0 == 0) goto L_0x0270
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r0)     // Catch:{ StaleDataException -> 0x027f }
            if (r0 == 0) goto L_0x0270
            r16 = r0
        L_0x0270:
            long r0 = r3.A14     // Catch:{ StaleDataException -> 0x027f }
            int r4 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r4 >= 0) goto L_0x028e
            r2.A0J = r8     // Catch:{ StaleDataException -> 0x027f }
            r2.A0B()     // Catch:{ StaleDataException -> 0x027f }
            goto L_0x028e
        L_0x027c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ StaleDataException -> 0x027f }
            throw r0     // Catch:{ StaleDataException -> 0x027f }
        L_0x027f:
            r1 = move-exception
            java.lang.String r0 = "messagesViewModel/addreceived/staledata "
            com.whatsapp.util.Log.i(r0, r1)
            java.util.List r0 = r2.A0x
            r0.add(r3)
            X.1kb r25 = X.C34641kb.copyOf((java.util.Collection) r0)
        L_0x028e:
            X.0sq r4 = r2.A0u
            r1 = 30
            com.facebook.redex.RunnableRunnableShape5S0200000_I0_3 r0 = new com.facebook.redex.RunnableRunnableShape5S0200000_I0_3
            r0.<init>(r2, r1, r3)
            r4.Acl(r0)
            goto L_0x00d8
        L_0x029c:
            java.util.Set r1 = r5.A1I
            X.0rv r0 = r3.A0B()
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r0)
            r1.remove(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.data.IDxMObserverShape73S0100000_1_I0.A06(X.0tZ, int):void");
    }

    public void A07(C16740tZ r11, int i2) {
        C16750ta r1;
        switch (this.A01) {
            case 0:
                MediaAlbumActivity mediaAlbumActivity = (MediaAlbumActivity) this.A00;
                AnonymousClass2Aa r0 = mediaAlbumActivity.A08;
                C28381Vw r3 = r11.A11;
                List list = r0.A00;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (C13680ns.A0V(it).A11.equals(r3)) {
                            View findViewWithTag = mediaAlbumActivity.ADA().findViewWithTag(r3);
                            if (findViewWithTag != null) {
                                C30011bb r2 = (C30011bb) findViewWithTag;
                                if (r2.A1L(r3)) {
                                    if (i2 == 8) {
                                        if (r2.getFMessage() == r11) {
                                            r2.A0x();
                                            return;
                                        }
                                    } else if (i2 == 12) {
                                        if (r2.getFMessage() == r11) {
                                            r2.A0u();
                                            return;
                                        }
                                    } else if (i2 == 27) {
                                        r2.A1F(r11, i2);
                                        return;
                                    } else if (i2 == 30) {
                                        r2.A14(r11.A06(), false);
                                        return;
                                    }
                                    r2.A1G(r11, true);
                                    return;
                                }
                                throw new IllegalStateException();
                            }
                            HashSet hashSet = mediaAlbumActivity.A0T;
                            if (!hashSet.contains(r3)) {
                                hashSet.add(r3);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                A09(r11);
                return;
            case 2:
                C34621kZ r22 = (C34621kZ) this.A00;
                C28381Vw r5 = r11.A11;
                if (C34901l3.A00(r5.A00, r22.A0h) && r11.A10 != 8) {
                    C30801cy r4 = r22.A0q;
                    List list2 = (List) (r4.A00.compareAndSet(true, false) ? r4.A01() : null);
                    if (list2 == null) {
                        list2 = AnonymousClass000.A0u();
                    } else {
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            C45772Ax r12 = (C45772Ax) it2.next();
                            if (r12.A01.A11.equals(r5) && r12.A00 == i2) {
                                it2.remove();
                            }
                        }
                    }
                    list2.add(new C45772Ax(r11, i2, AnonymousClass000.A1R(i2, 24)));
                    r4.A0B(list2);
                    return;
                }
                return;
            case 6:
                C28381Vw r42 = r11.A11;
                if (C16030sJ.A0Q(r42.A00) && i2 != 8) {
                    if (r42.A02) {
                        StatusesFragment statusesFragment = (StatusesFragment) this.A00;
                        if (statusesFragment.A0u.A00 != null) {
                            C13680ns.A1T(statusesFragment.A0s);
                            AnonymousClass2Az r13 = new AnonymousClass2Az(statusesFragment.A0W, statusesFragment);
                            statusesFragment.A0s = r13;
                            C13680ns.A1U(r13, statusesFragment.A0v);
                            if (r11.A0H > 0) {
                                if (statusesFragment.A0n.A00() && !C38621r6.A0o(r11) && i2 == 24) {
                                    statusesFragment.A0o.A0D.A02(r11, (Long) null, (String) null, 14);
                                }
                                C45752Au r9 = statusesFragment.A0r;
                                Context A02 = statusesFragment.A02();
                                if ((r11 instanceof C30581cc) || (r11 instanceof C38801rR) || (r11 instanceof C38681rF) || (r11 instanceof C38711rI)) {
                                    String str = r42.A01;
                                    Map map = r9.A03;
                                    if (map.containsKey(str)) {
                                        map.put(str, r11);
                                        Iterator A0q = C13680ns.A0q(map);
                                        while (A0q.hasNext()) {
                                            if (C13680ns.A0V(A0q).A0H <= 0) {
                                                return;
                                            }
                                        }
                                        ViewOnClickCListenerShape2S0300000_I0 viewOnClickCListenerShape2S0300000_I0 = new ViewOnClickCListenerShape2S0300000_I0(r9, new HashSet(map.values()), statusesFragment, 10);
                                        C14700pc AG9 = statusesFragment.AG9(R.string.str168e, 3500, true);
                                        C32291fz r14 = AG9.A03;
                                        r14.A09(r14.A02.getString(R.string.str1886), viewOnClickCListenerShape2S0300000_I0);
                                        C13680ns.A0L(r14.A05, R.id.snackbar_action).setTextColor(AnonymousClass00T.A00(A02, R.color.color0735));
                                        AG9.A01();
                                        map.clear();
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                    }
                    if (i2 == 12) {
                        ((StatusesFragment) this.A00).A1D();
                        return;
                    }
                    return;
                }
                return;
            case 7:
                if (r11 != null) {
                    C28381Vw r15 = r11.A11;
                    if (C16030sJ.A0Q(r15.A00) && r15.A02) {
                        boolean A1Q = AnonymousClass000.A1Q(C42881yp.A00(r11.A0C, 4));
                        MyStatusesActivity myStatusesActivity = (MyStatusesActivity) this.A00;
                        if (A1Q) {
                            MyStatusesActivity.A02(r11, myStatusesActivity, true);
                            return;
                        } else {
                            myStatusesActivity.A0k.notifyDataSetChanged();
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 8:
                StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) this.A00;
                if (statusPlaybackContactFragment.A0k != null && statusPlaybackContactFragment.A0S == C34091jg.A00 && r11 != null) {
                    C28381Vw r52 = r11.A11;
                    if (C16030sJ.A0Q(r52.A00) && r52.A02) {
                        AnonymousClass2B0 r16 = statusPlaybackContactFragment.A03;
                        AnonymousClass00B.A07(r16, "getViewHolder() is accessed before StatusPlaybackBaseFragment#onCreateView()");
                        Set set = r16.A0E.A08;
                        set.clear();
                        int i3 = 0;
                        Iterator it3 = statusPlaybackContactFragment.A0k.iterator();
                        while (it3.hasNext()) {
                            C16740tZ A0V = C13680ns.A0V(it3);
                            if ((A0V instanceof C16730tY) && (r1 = ((C16730tY) A0V).A02) != null && !r1.A0P && !r1.A0Z) {
                                set.add(Integer.valueOf(i3));
                            }
                            if (i3 == statusPlaybackContactFragment.A00 && A0V.A11.equals(r52)) {
                                statusPlaybackContactFragment.A1P(r11);
                            }
                            i3++;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                if (r11 != null) {
                    C28381Vw r23 = r11.A11;
                    AnonymousClass2B2 r17 = (AnonymousClass2B2) this.A00;
                    if (r23.equals(r17.A0B.A11) && r23.A02) {
                        r17.A02.A02.post(new RunnableRunnableShape1S0201000_I1(r11, i2, this, 13));
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:211:0x0393, code lost:
        r1 = X.C13680ns.A0V(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00cd, code lost:
        if (r3.A06 <= 0) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e7, code lost:
        if (r3.A07(r12) > 0) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x014e, code lost:
        if (r1 == null) goto L_0x0150;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(java.util.Collection r12, java.util.Map r13) {
        /*
            r11 = this;
            int r0 = r11.A01
            switch(r0) {
                case 0: goto L_0x02f3;
                case 1: goto L_0x0006;
                case 2: goto L_0x0028;
                case 3: goto L_0x0346;
                case 4: goto L_0x00ea;
                case 5: goto L_0x0154;
                case 6: goto L_0x0181;
                case 7: goto L_0x01c4;
                case 8: goto L_0x01f6;
                case 9: goto L_0x0005;
                case 10: goto L_0x025d;
                default: goto L_0x0005;
            }
        L_0x0005:
            return
        L_0x0006:
            java.util.Iterator r3 = r12.iterator()
        L_0x000a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0005
            X.0tZ r0 = X.C13680ns.A0V(r3)
            X.1Vw r2 = r0.A11
            java.lang.Object r1 = r11.A00
            com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity r1 = (com.obwhatsapp.conversation.conversationrow.message.MessageDetailsActivity) r1
            X.0tZ r0 = r1.A0M
            X.1Vw r0 = r0.A11
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x000a
            r1.finish()
            return
        L_0x0028:
            java.lang.Object r3 = r11.A00
            X.1kZ r3 = (X.C34621kZ) r3
            java.util.Iterator r7 = r12.iterator()
            r6 = 0
            r5 = 0
        L_0x0032:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x007e
            X.0tZ r4 = X.C13680ns.A0V(r7)
            X.1Vw r2 = r4.A11
            X.0rv r1 = r2.A00
            X.0rv r0 = r3.A0h
            boolean r0 = X.C34901l3.A00(r1, r0)
            if (r0 == 0) goto L_0x0032
            X.1ZQ r1 = r3.A0v
            boolean r0 = r1.ACn()
            if (r0 == 0) goto L_0x005b
            X.1Vw r0 = r1.ABL()
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x005b
            r5 = 1
        L_0x005b:
            X.10R r0 = r3.A0X
            boolean r0 = r0.A04(r4)
            if (r0 != 0) goto L_0x007c
            int r0 = r3.A07
            if (r0 <= 0) goto L_0x007c
            int r0 = r0 + -1
            r3.A07 = r0
            byte r1 = r4.A10
            r0 = 10
            if (r1 == r0) goto L_0x0079
            int r0 = r3.A05
            if (r0 <= 0) goto L_0x0079
            int r0 = r0 + -1
            r3.A05 = r0
        L_0x0079:
            r3.A0D()
        L_0x007c:
            r6 = 1
            goto L_0x0032
        L_0x007e:
            java.lang.String r0 = "messagesViewModel/observer/delete/unseen/"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            int r0 = r3.A07
            r2.append(r0)
            java.lang.String r1 = "/"
            r2.append(r1)
            int r0 = r3.A05
            r2.append(r0)
            r2.append(r1)
            int r0 = r3.A06
            r2.append(r0)
            X.C13680ns.A1V(r2)
            if (r6 == 0) goto L_0x0005
            X.0pd r2 = r3.A0g
            r1 = 1335(0x537, float:1.871E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x00e3
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x00d2
            java.util.Iterator r0 = r12.iterator()
            X.0tZ r0 = X.C13680ns.A0V(r0)
            boolean r0 = r0.A1C
            if (r0 != 0) goto L_0x00cf
            int r1 = r3.A07(r12)
            if (r1 <= 0) goto L_0x00d2
            int r0 = r3.A05
            int r0 = r0 - r1
            r3.A05 = r0
            if (r0 > 0) goto L_0x00d2
            int r0 = r3.A06
            if (r0 > 0) goto L_0x00d2
        L_0x00cf:
            r3.A0F()
        L_0x00d2:
            r3.A0C()
            boolean r0 = X.C15450qv.A02()
            if (r0 == 0) goto L_0x0005
            if (r5 == 0) goto L_0x0005
            X.1ZQ r0 = r3.A0v
            r0.A6N()
            return
        L_0x00e3:
            int r0 = r3.A07(r12)
            if (r0 <= 0) goto L_0x00d2
            goto L_0x00cf
        L_0x00ea:
            java.util.Iterator r5 = r12.iterator()
        L_0x00ee:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0005
            X.0tZ r3 = X.C13680ns.A0V(r5)
            X.1Vw r2 = r3.A11
            X.0rv r1 = r2.A00
            if (r1 == 0) goto L_0x00ee
            java.lang.Object r4 = r11.A00
            com.obwhatsapp.mediaview.MediaViewFragment r4 = (com.obwhatsapp.mediaview.MediaViewFragment) r4
            X.0rv r0 = r4.A13
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00ee
            byte r1 = r3.A10
            boolean r0 = X.C38621r6.A0N(r1)
            if (r0 != 0) goto L_0x0118
            boolean r0 = X.C30921dB.A00(r1)
            if (r0 == 0) goto L_0x00ee
        L_0x0118:
            X.2B7 r0 = r4.A1C
            if (r0 == 0) goto L_0x0150
            int r0 = r0.getCount()
            r5 = 1
            if (r0 == r5) goto L_0x0150
            X.2B8 r0 = r4.A1D
            if (r0 == 0) goto L_0x0150
            int r0 = r4.A03
            X.0tY r1 = r4.A1U(r0)
            int r3 = r4.A03
            if (r1 == 0) goto L_0x0005
            X.1Vw r0 = r1.A11
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x03d8
            int r2 = r4.A03
            X.2B7 r0 = r4.A1C
            int r1 = r0.getCount()
            int r1 = r1 - r5
            int r0 = r4.A03
            int r3 = r0 + 1
            if (r2 != r1) goto L_0x014a
            int r3 = r0 + -1
        L_0x014a:
            X.0tY r1 = r4.A1U(r3)
            if (r1 != 0) goto L_0x03d8
        L_0x0150:
            r4.A1F()
            return
        L_0x0154:
            java.lang.Object r3 = r11.A00
            X.2B6 r3 = (X.AnonymousClass2B6) r3
            X.026 r2 = r3.A06
            java.lang.Object r1 = r2.A01()
            X.2B9 r1 = (X.AnonymousClass2B9) r1
            if (r1 == 0) goto L_0x0005
            java.util.List r0 = r1.A04
            r0.removeAll(r12)
            java.util.List r0 = r1.A02
            r0.removeAll(r12)
            java.util.List r0 = r1.A03
            r0.removeAll(r12)
            java.util.List r0 = r1.A01
            r0.removeAll(r12)
            r2.A09(r1)
            X.026 r1 = r3.A08
            X.1xi r0 = r3.A0J
            r1.A09(r0)
            return
        L_0x0181:
            java.util.Iterator r5 = r12.iterator()
            r4 = 0
        L_0x0186:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0005
            X.0tZ r3 = X.C13680ns.A0V(r5)
            X.1Vw r1 = r3.A11
            X.0rv r0 = r1.A00
            boolean r0 = X.C16030sJ.A0Q(r0)
            if (r0 == 0) goto L_0x0186
            if (r4 != 0) goto L_0x01a4
            java.lang.Object r0 = r11.A00
            com.obwhatsapp.status.StatusesFragment r0 = (com.obwhatsapp.status.StatusesFragment) r0
            r0.A1D()
            r4 = 1
        L_0x01a4:
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0186
            java.lang.Object r1 = r11.A00
            com.obwhatsapp.status.StatusesFragment r1 = (com.obwhatsapp.status.StatusesFragment) r1
            X.0vx r0 = r1.A0n
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0186
            boolean r0 = X.C38621r6.A0o(r3)
            if (r0 != 0) goto L_0x0186
            X.1L1 r0 = r1.A0o
            X.1Su r2 = r0.A0D
            r1 = 5
            r0 = 0
            r2.A02(r3, r0, r0, r1)
            goto L_0x0186
        L_0x01c4:
            java.util.Iterator r2 = r12.iterator()
        L_0x01c8:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0005
            X.0tZ r0 = X.C13680ns.A0V(r2)
            X.1Vw r1 = r0.A11
            X.0rv r0 = r1.A00
            boolean r0 = X.C16030sJ.A0Q(r0)
            if (r0 == 0) goto L_0x01c8
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x01c8
            java.lang.Object r2 = r11.A00
            com.obwhatsapp.status.playback.MyStatusesActivity r2 = (com.obwhatsapp.status.playback.MyStatusesActivity) r2
            X.2Aw r0 = r2.A0j
            X.C13680ns.A1T(r0)
            X.2Aw r1 = new X.2Aw
            r1.<init>(r2)
            r2.A0j = r1
            X.0sq r0 = r2.A05
            X.C13680ns.A1U(r1, r0)
            return
        L_0x01f6:
            java.lang.Object r4 = r11.A00
            com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment r4 = (com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment) r4
            java.util.List r0 = r4.A0k
            if (r0 == 0) goto L_0x0005
            int r3 = r4.A00
            r7 = 0
            java.util.Iterator r6 = r12.iterator()
        L_0x0205:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x024c
            X.0tZ r0 = X.C13680ns.A0V(r6)
            X.1Vw r5 = r0.A11
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x0205
            X.0rv r0 = r5.A00
            boolean r0 = X.C16030sJ.A0Q(r0)
            if (r0 == 0) goto L_0x0205
            java.util.List r0 = r4.A0k
            if (r0 == 0) goto L_0x0205
            java.util.Iterator r2 = r0.iterator()
        L_0x0225:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0205
            X.0tZ r1 = X.C13680ns.A0V(r2)
            X.1Vw r0 = r1.A11
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x0225
            r7 = 1
            java.util.List r0 = r4.A0k
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto L_0x0205
            java.util.List r0 = r4.A0k
            r0.remove(r1)
            int r0 = r4.A00
            if (r1 >= r0) goto L_0x0205
            int r3 = r3 + -1
            goto L_0x0205
        L_0x024c:
            if (r7 == 0) goto L_0x0005
            X.0pt r2 = r4.A00
            r0 = 11
            com.facebook.redex.RunnableRunnableShape1S0201000_I1 r1 = new com.facebook.redex.RunnableRunnableShape1S0201000_I1
            r1.<init>(r12, r3, r11, r0)
            android.os.Handler r0 = r2.A02
            r0.post(r1)
            return
        L_0x025d:
            java.util.Iterator r10 = r12.iterator()
            r9 = 0
        L_0x0262:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x02e9
            X.0tZ r8 = X.C13680ns.A0V(r10)
            java.lang.Object r3 = r11.A00
            com.obwhatsapp.storage.StorageUsageMediaGalleryFragment r3 = (com.obwhatsapp.storage.StorageUsageMediaGalleryFragment) r3
            X.0rv r1 = r3.A07
            if (r1 == 0) goto L_0x0280
            X.1Vw r0 = r8.A11
            X.0rv r0 = r0.A00
            if (r0 == 0) goto L_0x0262
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0262
        L_0x0280:
            boolean r0 = r3.A0O
            if (r0 == 0) goto L_0x02e5
            X.2BC r5 = r3.A0H
            X.2BD r5 = (X.AnonymousClass2BD) r5
            if (r5 == 0) goto L_0x0262
            int r6 = r5.getCount()
            monitor-enter(r5)
            r7 = 0
            r4 = 0
        L_0x0291:
            if (r4 >= r6) goto L_0x02d4
            java.util.Map r2 = r5.A06     // Catch:{ all -> 0x0400 }
            java.lang.Object r0 = X.AnonymousClass000.A0Y(r2, r4)     // Catch:{ all -> 0x0400 }
            X.2BE r0 = (X.AnonymousClass2BE) r0     // Catch:{ all -> 0x0400 }
            if (r0 == 0) goto L_0x02d1
            X.0tY r0 = r0.A03     // Catch:{ all -> 0x0400 }
            if (r0 == 0) goto L_0x02d1
            X.1Vw r1 = r0.A11     // Catch:{ all -> 0x0400 }
            X.1Vw r0 = r8.A11     // Catch:{ all -> 0x0400 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x0400 }
            if (r0 == 0) goto L_0x02d1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0400 }
            r2.remove(r0)     // Catch:{ all -> 0x0400 }
            int r0 = r5.A00     // Catch:{ all -> 0x0400 }
            int r0 = r0 + 1
            r5.A00 = r0     // Catch:{ all -> 0x0400 }
            r7 = 1
        L_0x02b9:
            int r0 = r6 + -1
            if (r4 >= r0) goto L_0x02d4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0400 }
            int r4 = r4 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0400 }
            java.lang.Object r0 = r2.remove(r0)     // Catch:{ all -> 0x0400 }
            X.2BE r0 = (X.AnonymousClass2BE) r0     // Catch:{ all -> 0x0400 }
            r2.put(r1, r0)     // Catch:{ all -> 0x0400 }
            goto L_0x02b9
        L_0x02d1:
            int r4 = r4 + 1
            goto L_0x0291
        L_0x02d4:
            monitor-exit(r5)     // Catch:{ all -> 0x0400 }
            if (r7 == 0) goto L_0x0262
            int r0 = r3.A00
            int r0 = r0 + -1
            r3.A00 = r0
            X.01X r0 = r3.A06
            r0.A01()
            r9 = 1
            goto L_0x0262
        L_0x02e5:
            r0 = 0
            r3.A1I(r0)
        L_0x02e9:
            if (r9 == 0) goto L_0x0005
            java.lang.Object r0 = r11.A00
            com.obwhatsapp.gallery.MediaGalleryFragmentBase r0 = (com.obwhatsapp.gallery.MediaGalleryFragmentBase) r0
            r0.A1D()
            return
        L_0x02f3:
            java.lang.Object r7 = r11.A00
            com.obwhatsapp.conversation.conversationrow.album.MediaAlbumActivity r7 = (com.obwhatsapp.conversation.conversationrow.album.MediaAlbumActivity) r7
            X.2Aa r6 = r7.A08
            java.util.List r0 = r6.A00
            if (r0 == 0) goto L_0x0336
            java.util.Iterator r8 = r12.iterator()
            r5 = 0
        L_0x0302:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0331
            X.0tZ r4 = X.C13680ns.A0V(r8)
            java.util.List r0 = r6.A00
            java.util.Iterator r3 = r0.iterator()
            r2 = 0
        L_0x0313:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0302
            X.0tZ r0 = X.C13680ns.A0V(r3)
            X.1Vw r1 = r0.A11
            X.1Vw r0 = r4.A11
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x032e
            java.util.List r0 = r6.A00
            r0.remove(r2)
            r5 = 1
            goto L_0x0302
        L_0x032e:
            int r2 = r2 + 1
            goto L_0x0313
        L_0x0331:
            if (r5 == 0) goto L_0x0336
            r6.notifyDataSetChanged()
        L_0x0336:
            X.2Aa r0 = r7.A08
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0342
            r7.finish()
            return
        L_0x0342:
            r7.A36()
            return
        L_0x0346:
            java.lang.Object r7 = r11.A00
            X.0yQ r7 = (X.C19430yQ) r7
            java.lang.Object r6 = r7.A0S
            monitor-enter(r6)
            java.util.Map r5 = r7.A0A()     // Catch:{ all -> 0x03d5 }
            java.util.Iterator r4 = r12.iterator()     // Catch:{ all -> 0x03d5 }
        L_0x0355:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x03d5 }
            if (r0 == 0) goto L_0x0381
            X.0tZ r3 = X.C13680ns.A0V(r4)     // Catch:{ all -> 0x03d5 }
            X.1Vw r2 = r3.A11     // Catch:{ all -> 0x03d5 }
            X.0rv r1 = r2.A00     // Catch:{ all -> 0x03d5 }
            if (r1 == 0) goto L_0x0355
            boolean r0 = r2.A02     // Catch:{ all -> 0x03d5 }
            if (r0 == 0) goto L_0x0355
            boolean r0 = r3 instanceof X.C38841rV     // Catch:{ all -> 0x03d5 }
            if (r0 == 0) goto L_0x0355
            java.lang.Object r0 = r5.get(r1)     // Catch:{ all -> 0x03d5 }
            X.28s r0 = (X.C454628s) r0     // Catch:{ all -> 0x03d5 }
            if (r0 == 0) goto L_0x0355
            X.1Vw r0 = r0.A02     // Catch:{ all -> 0x03d5 }
            boolean r0 = r0.equals(r2)     // Catch:{ all -> 0x03d5 }
            if (r0 == 0) goto L_0x0355
            r7.A0O(r1)     // Catch:{ all -> 0x03d5 }
            goto L_0x0355
        L_0x0381:
            monitor-exit(r6)     // Catch:{ all -> 0x03d5 }
            java.lang.Object r6 = r7.A0R
            monitor-enter(r6)
            java.util.Map r5 = r7.A09()     // Catch:{ all -> 0x03d2 }
            java.util.Iterator r8 = r12.iterator()     // Catch:{ all -> 0x03d2 }
        L_0x038d:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x03d2 }
            if (r0 == 0) goto L_0x03d0
            X.0tZ r1 = X.C13680ns.A0V(r8)     // Catch:{ all -> 0x03d2 }
            X.1Vw r4 = r1.A11     // Catch:{ all -> 0x03d2 }
            X.0rv r3 = r4.A00     // Catch:{ all -> 0x03d2 }
            if (r3 == 0) goto L_0x03d0
            boolean r0 = r4.A02     // Catch:{ all -> 0x03d2 }
            if (r0 != 0) goto L_0x03d0
            boolean r0 = r1 instanceof X.C38841rV     // Catch:{ all -> 0x03d2 }
            if (r0 == 0) goto L_0x03d0
            java.lang.Object r2 = r5.get(r3)     // Catch:{ all -> 0x03d2 }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ all -> 0x03d2 }
            if (r2 == 0) goto L_0x03d0
            X.0rv r0 = r1.A0B()     // Catch:{ all -> 0x03d2 }
            if (r0 != 0) goto L_0x03cb
            com.whatsapp.jid.UserJid r1 = com.whatsapp.jid.UserJid.of(r3)     // Catch:{ all -> 0x03d2 }
        L_0x03b7:
            java.lang.Object r0 = r2.get(r1)     // Catch:{ all -> 0x03d2 }
            X.28x r0 = (X.AnonymousClass28x) r0     // Catch:{ all -> 0x03d2 }
            if (r0 == 0) goto L_0x038d
            X.1Vw r0 = r0.A02     // Catch:{ all -> 0x03d2 }
            boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x03d2 }
            if (r0 == 0) goto L_0x038d
            r7.A0P(r3, r1)     // Catch:{ all -> 0x03d2 }
            goto L_0x038d
        L_0x03cb:
            com.whatsapp.jid.UserJid r1 = com.whatsapp.jid.UserJid.of(r0)     // Catch:{ all -> 0x03d2 }
            goto L_0x03b7
        L_0x03d0:
            monitor-exit(r6)     // Catch:{ all -> 0x03d2 }
            return
        L_0x03d2:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x03d2 }
            throw r0
        L_0x03d5:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x03d5 }
            throw r0
        L_0x03d8:
            X.2B7 r0 = r4.A1C
            if (r0 == 0) goto L_0x03df
            r0.close()
        L_0x03df:
            X.2B8 r0 = r4.A1D
            X.2B7 r2 = r0.A7V(r4, r1)
            r4.A1C = r2
            r1 = 3
            com.facebook.redex.RunnableRunnableShape19S0100000_I1_2 r0 = new com.facebook.redex.RunnableRunnableShape19S0100000_I1_2
            r0.<init>(r11, r1)
            r2.Adq(r0)
            r2.AhQ(r3)
            boolean r0 = r4.A1o
            if (r0 != 0) goto L_0x03fc
            X.2B7 r0 = r4.A1C
            r0.Ag5()
        L_0x03fc:
            r4.A1G()
            return
        L_0x0400:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0400 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.data.IDxMObserverShape73S0100000_1_I0.A08(java.util.Collection, java.util.Map):void");
    }

    public final void A09(C16740tZ r5) {
        if (r5 != null) {
            C28381Vw r3 = r5.A11;
            String str = r3.A01;
            MessageDetailsActivity messageDetailsActivity = (MessageDetailsActivity) this.A00;
            if (!str.equals(messageDetailsActivity.A0M.A11.A01)) {
                return;
            }
            if (r3.A02 || (r5 instanceof C39171s2)) {
                messageDetailsActivity.A35();
                messageDetailsActivity.A0C.A0t();
            }
        }
    }
}
