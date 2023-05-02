package com.whatsapp.util;

import X.C34331k5;

public class ViewOnClickCListenerShape1S0100000_I0_1 extends C34331k5 {
    public Object A00;
    public final int A01;

    public ViewOnClickCListenerShape1S0100000_I0_1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:244:0x04f2, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x04f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0080, code lost:
        if (r0 != 4) goto L_0x0082;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x02b2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(android.view.View r22) {
        /*
            r21 = this;
            r6 = r22
            r3 = r21
            int r0 = r3.A01
            switch(r0) {
                case 0: goto L_0x0a1f;
                case 1: goto L_0x0009;
                case 2: goto L_0x0009;
                case 3: goto L_0x0a1f;
                case 4: goto L_0x0009;
                case 5: goto L_0x0a0c;
                case 6: goto L_0x09fa;
                case 7: goto L_0x09e5;
                case 8: goto L_0x09c3;
                case 9: goto L_0x05d8;
                case 10: goto L_0x09bb;
                case 11: goto L_0x098d;
                case 12: goto L_0x0985;
                case 13: goto L_0x0976;
                case 14: goto L_0x05b4;
                case 15: goto L_0x0985;
                case 16: goto L_0x0968;
                case 17: goto L_0x0588;
                case 18: goto L_0x056c;
                case 19: goto L_0x0925;
                case 20: goto L_0x04c5;
                case 21: goto L_0x0911;
                case 22: goto L_0x047a;
                case 23: goto L_0x044a;
                case 24: goto L_0x03b9;
                case 25: goto L_0x0903;
                case 26: goto L_0x08a4;
                case 27: goto L_0x0895;
                case 28: goto L_0x0398;
                case 29: goto L_0x088d;
                case 30: goto L_0x0793;
                case 31: goto L_0x0761;
                case 32: goto L_0x0733;
                case 33: goto L_0x06fe;
                case 34: goto L_0x06cd;
                case 35: goto L_0x0339;
                case 36: goto L_0x06c1;
                case 37: goto L_0x0325;
                case 38: goto L_0x0305;
                case 39: goto L_0x06b5;
                case 40: goto L_0x021b;
                case 41: goto L_0x01ed;
                case 42: goto L_0x06ab;
                case 43: goto L_0x069f;
                case 44: goto L_0x0697;
                case 45: goto L_0x068e;
                case 46: goto L_0x0676;
                case 47: goto L_0x01bd;
                case 48: goto L_0x0187;
                case 49: goto L_0x061b;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r0 = r3.A00
            com.obwhatsapp.community.JoinGroupBottomSheetFragment r0 = (com.obwhatsapp.community.JoinGroupBottomSheetFragment) r0
            X.2Uo r7 = r0.A0T
            X.2OJ r0 = r7.A0V
            java.lang.Object r0 = r0.A01()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r6 = 1
            r0 = 6
            if (r1 != r0) goto L_0x0023
            r7.A0A(r6)
        L_0x0022:
            return
        L_0x0023:
            r5 = 4
            if (r1 != r5) goto L_0x004a
            int r0 = r7.A02
            r3 = 2
            if (r0 != r3) goto L_0x0046
            X.0vf r2 = r7.A0L
            X.0sL r1 = r7.A0U
            if (r1 != 0) goto L_0x0033
            X.0sL r1 = r7.A0K
        L_0x0033:
            java.lang.String r0 = "community_home"
            boolean r0 = r2.A00(r1, r0)
            X.2OJ r1 = r7.A0W
            if (r0 != 0) goto L_0x003e
            r3 = 3
        L_0x003e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.A09(r0)
            return
        L_0x0046:
            X.2OJ r1 = r7.A0W
            r3 = 4
            goto L_0x003e
        L_0x004a:
            r4 = 2
            if (r1 == r4) goto L_0x0050
            r0 = 7
            if (r1 != r0) goto L_0x0022
        L_0x0050:
            int r1 = r7.A01
            r0 = 426(0x1aa, float:5.97E-43)
            if (r1 != r0) goto L_0x005c
            r0 = 8
            r7.A05(r0)
            return
        L_0x005c:
            X.0wP r0 = r7.A07
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x0099
            r0 = 499(0x1f3, float:6.99E-43)
            r7.A01 = r0
            r0 = 7
            r7.A05(r0)
        L_0x006c:
            boolean r0 = r7.A0Y
            if (r0 == 0) goto L_0x0022
            X.3qe r1 = new X.3qe
            r1.<init>()
            int r0 = r7.A02
            if (r0 == 0) goto L_0x008d
            if (r0 == r6) goto L_0x0088
            if (r0 == r4) goto L_0x0092
            r6 = 3
            if (r0 == r6) goto L_0x008d
            if (r0 == r5) goto L_0x0088
        L_0x0082:
            X.0t9 r0 = r7.A0H
            r0.A06(r1)
            return
        L_0x0088:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L_0x0096
        L_0x008d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            goto L_0x0096
        L_0x0092:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
        L_0x0096:
            r1.A00 = r0
            goto L_0x0082
        L_0x0099:
            X.027 r1 = r7.A0R
            r0 = 0
            r1.A09(r0)
            X.027 r1 = r7.A0Q
            r0 = 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A09(r0)
            X.0t3 r0 = r7.A0A
            long r0 = r0.A00()
            r7.A03 = r0
            int r9 = r7.A02
            if (r9 == r5) goto L_0x00eb
            r0 = 3
            if (r9 == r0) goto L_0x00eb
            r0 = 6
            if (r9 != r0) goto L_0x00c7
            X.2OJ r1 = r7.A0W
            r0 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A09(r0)
            goto L_0x006c
        L_0x00c7:
            if (r9 == r4) goto L_0x00d6
            if (r9 == r6) goto L_0x00d6
            if (r9 == 0) goto L_0x00d6
            r0 = 5
            if (r9 == r0) goto L_0x00d6
            java.lang.String r0 = "has to to be one of the use case"
            X.AnonymousClass00B.A08(r0)
            goto L_0x006c
        L_0x00d6:
            java.lang.String r3 = r7.A0X
            X.AnonymousClass00B.A06(r3)
            X.0vd r2 = r7.A0J
            com.facebook.redex.IDxJRunnableShape410S0100000_2_I1 r1 = new com.facebook.redex.IDxJRunnableShape410S0100000_2_I1
            r1.<init>(r7, r6)
            com.facebook.redex.IDxIRunnableShape287S0100000_2_I1 r0 = new com.facebook.redex.IDxIRunnableShape287S0100000_2_I1
            r0.<init>(r7, r6)
            r2.A03(r1, r0, r3)
            goto L_0x006c
        L_0x00eb:
            X.0sL r11 = r7.A0K
            X.AnonymousClass00B.A06(r11)
            X.0sL r13 = r7.A0U
            X.AnonymousClass00B.A06(r13)
            X.1PP r8 = r7.A06
            X.4Ds r3 = new X.4Ds
            r3.<init>(r7)
            X.4Dr r2 = new X.4Dr
            r2.<init>(r7)
            X.0ug r1 = r8.A05
            X.4M5 r0 = new X.4M5
            r0.<init>(r2, r3, r8, r11)
            X.4Zk r10 = new X.4Zk
            r10.<init>(r0, r1)
            r1 = 3
            if (r9 == r1) goto L_0x0111
            r1 = 2
        L_0x0111:
            java.lang.String r0 = "JoinSubgroupProtocolHelper/sendJoinSubgroupRequest"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0ug r14 = r10.A01
            java.lang.String r3 = r14.A02()
            r12 = 3
            if (r1 != r12) goto L_0x0183
            java.lang.String r1 = "default_sub_group"
        L_0x0121:
            X.1lL[] r8 = new X.C35081lL[r4]
            java.lang.String r2 = "type"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r9 = 0
            r8[r9] = r0
            java.lang.String r1 = "jid"
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r11, (java.lang.String) r1)
            r8[r6] = r0
            java.lang.String r0 = "join_linked_group"
            X.1Vv r11 = new X.1Vv
            r11.<init>(r0, r8)
            X.1lL[] r8 = new X.C35081lL[r5]
            java.lang.String r1 = "to"
            X.1lL r0 = new X.1lL
            r0.<init>((com.whatsapp.jid.Jid) r13, (java.lang.String) r1)
            r8[r9] = r0
            java.lang.String r1 = "set"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r8[r6] = r0
            java.lang.String r1 = "id"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r1, (java.lang.String) r3)
            r8[r4] = r0
            java.lang.String r2 = "xmlns"
            java.lang.String r1 = "w:g2"
            X.1lL r0 = new X.1lL
            r0.<init>((java.lang.String) r2, (java.lang.String) r1)
            r8[r12] = r0
            java.lang.String r1 = "iq"
            X.1Vv r0 = new X.1Vv
            r0.<init>((X.C28371Vv) r11, (java.lang.String) r1, (X.C35081lL[]) r8)
            com.facebook.redex.IDxRCallbackShape230S0100000_1_I1 r15 = new com.facebook.redex.IDxRCallbackShape230S0100000_1_I1
            r15.<init>(r10, r9)
            r18 = 310(0x136, float:4.34E-43)
            r19 = 0
            r17 = r3
            r16 = r0
            r14.A0G(r15, r16, r17, r18, r19)
            goto L_0x006c
        L_0x0183:
            java.lang.String r1 = "sub_group"
            goto L_0x0121
        L_0x0187:
            java.lang.Object r2 = r3.A00
            com.obwhatsapp.group.GroupChatInfoActivity r2 = (com.obwhatsapp.group.GroupChatInfoActivity) r2
            X.0ul r0 = r2.A0H
            boolean r0 = r0.A0c()
            if (r0 == 0) goto L_0x0022
            X.0rt r1 = r2.A09
            X.0sL r0 = r2.A3M()
            int r1 = r1.A02(r0)
            r0 = 2
            if (r1 == r0) goto L_0x0a30
            r0 = 2131892368(0x7f121890, float:1.9419482E38)
            r2.Afg(r0)
            r0 = 2131364315(0x7f0a09db, float:1.8348464E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r2, r0)
            r1 = 8
            r0.setVisibility(r1)
            r0 = 2131365724(0x7f0a0f5c, float:1.8351321E38)
            android.view.View r0 = X.AnonymousClass00T.A05(r2, r0)
            r0.setVisibility(r1)
            return
        L_0x01bd:
            java.lang.Object r3 = r3.A00
            com.obwhatsapp.group.GroupChatInfoActivity r3 = (com.obwhatsapp.group.GroupChatInfoActivity) r3
            X.0w8 r1 = r3.A0J
            r0 = 0
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x0022
            X.0wS r0 = r3.A0K
            X.19r r0 = r0.A03()
            java.lang.Class r0 = r0.AEZ()
            if (r0 == 0) goto L_0x0022
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r3, r0)
            X.0sH r0 = r3.A0w
            X.0rv r0 = r0.A0E
            java.lang.String r1 = X.C16030sJ.A03(r0)
            java.lang.String r0 = "extra_jid"
            android.content.Intent r0 = r2.putExtra(r0, r1)
            r3.startActivity(r0)
            return
        L_0x01ed:
            java.lang.Object r2 = r3.A00
            com.obwhatsapp.gifsearch.GifSearchContainer r2 = (com.obwhatsapp.gifsearch.GifSearchContainer) r2
            X.29I r0 = r2.A0A
            if (r0 == 0) goto L_0x01f9
            r0.A02()
            return
        L_0x01f9:
            X.1Ai r1 = r2.A0I
            com.obwhatsapp.WaEditText r0 = r2.A07
            r1.A01(r0)
            r0 = 8
            r2.setVisibility(r0)
            X.1Lk r1 = r2.A0F
            if (r1 == 0) goto L_0x020e
            X.0t9 r0 = r2.A0B
            X.C810446p.A00(r0, r1)
        L_0x020e:
            r0 = 0
            r2.A0F = r0
            X.5Mi r0 = r2.A0E
            if (r0 == 0) goto L_0x0022
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1C()
            return
        L_0x021b:
            java.lang.Object r4 = r3.A00
            X.2Jn r4 = (X.C47572Jn) r4
            int r0 = r4.A00
            if (r0 != 0) goto L_0x022e
            X.5Pa r0 = r4.A0A
            if (r0 == 0) goto L_0x022e
            boolean r0 = r0.AIx()
            if (r0 != 0) goto L_0x022e
            return
        L_0x022e:
            r4.AcT()
            int r0 = r4.A00
            if (r0 != 0) goto L_0x024e
            X.1BQ r1 = r4.A0O
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x024e
            X.38w r0 = r4.A0B
            if (r0 == 0) goto L_0x024e
            r0.A00(r1)
        L_0x0242:
            int r1 = r4.A00
            r0 = 1
            if (r1 == r0) goto L_0x02b2
            r0 = 2
            if (r1 == r0) goto L_0x0282
            r0 = 3
            if (r1 == r0) goto L_0x0282
            return
        L_0x024e:
            X.3H7 r0 = r4.A03
            if (r0 == 0) goto L_0x0242
            X.0pd r2 = r4.A0E
            r1 = 2023(0x7e7, float:2.835E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            if (r0 == 0) goto L_0x0242
            X.33c r0 = r4.A04
            if (r0 == 0) goto L_0x0265
            r0.A05()
        L_0x0265:
            X.3H7 r3 = r4.A03
            int r2 = r4.A00
            X.1yX r1 = r3.A02
            if (r1 == 0) goto L_0x0022
            X.2Jn r0 = r3.A00
            if (r0 == 0) goto L_0x0022
            r0 = 1
            r3.A06 = r0
            com.obwhatsapp.picker.searchexpressions.ExpressionsSearchDialogFragment r0 = new com.obwhatsapp.picker.searchexpressions.ExpressionsSearchDialogFragment
            r0.<init>(r2)
            r1.Afa(r0)
            X.2Jn r0 = r3.A00
            r0.dismiss()
            return
        L_0x0282:
            X.39R r1 = r4.A0D
            if (r1 == 0) goto L_0x0022
            X.1BQ r0 = r4.A0O
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x0022
            X.3H7 r0 = r1.A03
            if (r0 == 0) goto L_0x0022
            X.33c r0 = r1.A05
            if (r0 == 0) goto L_0x0297
            r0.A05()
        L_0x0297:
            X.3H7 r2 = r1.A03
            X.1yX r1 = r2.A02
            if (r1 == 0) goto L_0x0022
            X.2Jn r0 = r2.A00
            if (r0 == 0) goto L_0x0022
            r0 = 1
            r2.A06 = r0
            com.obwhatsapp.picker.search.StickerSearchDialogFragment r0 = new com.obwhatsapp.picker.search.StickerSearchDialogFragment
            r0.<init>()
            r1.Afa(r0)
            X.2Jn r0 = r2.A00
            r0.dismiss()
            return
        L_0x02b2:
            X.3Fe r3 = r4.A0C
            if (r3 == 0) goto L_0x0022
            X.0s5 r1 = r4.A09
            X.0s8 r0 = X.C15910s6.A0P
            boolean r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x02dd
            X.3H7 r2 = r3.A04
            if (r2 == 0) goto L_0x02dd
            X.1yX r1 = r2.A02
            if (r1 == 0) goto L_0x0022
            X.2Jn r0 = r2.A00
            if (r0 == 0) goto L_0x0022
            r0 = 1
            r2.A06 = r0
            com.obwhatsapp.picker.search.GifSearchDialogFragment r0 = new com.obwhatsapp.picker.search.GifSearchDialogFragment
            r0.<init>()
            r1.Afa(r0)
            X.2Jn r0 = r2.A00
            r0.dismiss()
            return
        L_0x02dd:
            X.4Ok r2 = r3.A02
            if (r2 == 0) goto L_0x0022
            X.1Lk r10 = r3.A07
            X.2Jn r1 = r2.A04
            com.obwhatsapp.WaEditText r0 = r1.A0K
            r1.A08(r0)
            com.obwhatsapp.gifsearch.GifSearchContainer r3 = r2.A07
            X.2Jm r8 = r2.A05
            X.1Li r9 = r2.A06
            X.1Ai r13 = r2.A09
            X.0t9 r7 = r2.A03
            X.01V r5 = r2.A01
            X.0rz r6 = r2.A02
            X.0u3 r12 = r2.A08
            android.app.Activity r4 = r2.A00
            X.4ye r11 = new X.4ye
            r11.<init>(r2, r3, r10)
            r3.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        L_0x0305:
            java.lang.Object r2 = r3.A00
            X.2JH r2 = (X.AnonymousClass2JH) r2
            X.5Pa r0 = r2.A0A
            if (r0 == 0) goto L_0x0314
            boolean r0 = r0.AIx()
            if (r0 != 0) goto L_0x0314
            return
        L_0x0314:
            r2.AcT()
            X.1BQ r1 = r2.A0O
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0022
            X.38w r0 = r2.A0B
            if (r0 == 0) goto L_0x0022
            r0.A00(r1)
            return
        L_0x0325:
            java.lang.Object r3 = r3.A00
            X.2Jp r3 = (X.C47592Jp) r3
            X.2Jo r2 = r3.A02
            X.2Jn r2 = (X.C47572Jn) r2
            int r1 = r2.A00
            r0 = 3
            if (r1 == r0) goto L_0x0022
            r2.A0G(r0)
            r3.A00()
            return
        L_0x0339:
            java.lang.Object r5 = r3.A00
            com.obwhatsapp.conversationslist.ConversationsFragment r5 = (com.obwhatsapp.conversationslist.ConversationsFragment) r5
            X.0zJ r4 = r5.A0I
            android.content.Context r3 = r5.A0u()
            android.content.Context r0 = r5.A0u()
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.conversationslist.ArchivedConversationsActivity"
            r2.setClassName(r1, r0)
            r4.A06(r3, r2)
            com.obwhatsapp.conversationslist.ArchiveHeaderViewModel r2 = r5.A13
            if (r2 == 0) goto L_0x0022
            X.0t9 r4 = r5.A1g
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            X.027 r0 = r2.A01
            java.lang.Object r1 = r0.A01()
            if (r1 == 0) goto L_0x038f
            java.lang.String r0 = "@"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0391
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r0 = 0
        L_0x0373:
            X.3rA r2 = new X.3rA
            r2.<init>()
            if (r0 == 0) goto L_0x0385
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A01 = r0
        L_0x0385:
            java.lang.String r0 = "Archive"
            r2.A02 = r0
            r2.A00 = r3
            r4.A06(r2)
            return
        L_0x038f:
            r0 = 0
            goto L_0x0393
        L_0x0391:
            int r0 = r2.A00
        L_0x0393:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0373
        L_0x0398:
            java.lang.Object r1 = r3.A00
            X.2Q7 r1 = (X.AnonymousClass2Q7) r1
            X.0tY r2 = r1.getFMessage()
            boolean r0 = X.C811346z.A00(r2)
            if (r0 == 0) goto L_0x0a34
            X.1Ot r0 = r1.A07
            X.AnonymousClass00B.A06(r0)
            java.util.Map r0 = r0.A07
            java.lang.Object r0 = r0.get(r2)
            X.1cp r0 = (X.C30711cp) r0
            if (r0 == 0) goto L_0x0022
            r0.cancel()
            return
        L_0x03b9:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.Object r5 = r3.A00
            X.2Uj r5 = (X.AnonymousClass2Uj) r5
            java.util.List r0 = r5.A05
            java.util.Iterator r4 = r0.iterator()
        L_0x03c8:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x03fd
            java.lang.Object r3 = r4.next()
            X.0tY r3 = (X.C16730tY) r3
            boolean r0 = X.C811346z.A00(r3)
            if (r0 == 0) goto L_0x03e3
            X.1Ot r0 = r5.A04
            X.AnonymousClass00B.A06(r0)
            r0.A00(r3)
            goto L_0x03c8
        L_0x03e3:
            X.0ta r1 = r3.A02
            X.AnonymousClass00B.A06(r1)
            boolean r0 = r1.A0P
            if (r0 != 0) goto L_0x03c8
            boolean r0 = r1.A0Z
            if (r0 != 0) goto L_0x03c8
            java.lang.String r0 = r3.A08
            if (r0 == 0) goto L_0x03c8
            int r1 = r1.A07
            r0 = 1
            if (r1 == r0) goto L_0x03c8
            r2.add(r3)
            goto L_0x03c8
        L_0x03fd:
            X.0tb r4 = r5.A0R
            android.content.Context r0 = r5.getContext()
            android.app.Activity r6 = X.C19980zJ.A00(r0)
            int r0 = r2.size()
            if (r0 == 0) goto L_0x0022
            X.12W r9 = r4.A0P
            X.0pf r10 = r4.A0U
            X.2Jz r0 = new X.2Jz
            r0.<init>(r6, r10)
            boolean r0 = r9.A04(r0)
            if (r0 == 0) goto L_0x0022
            r3 = 0
            X.0pt r7 = r4.A03
            X.0t9 r12 = r4.A10
            X.0sP r8 = r4.A0M
            X.14t r1 = r4.A0c
            java.lang.Object r0 = r2.get(r3)
            X.0tZ r0 = (X.C16740tZ) r0
            X.0sH r11 = X.C38621r6.A09(r1, r0)
            X.3uc r5 = new X.3uc
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            java.util.Iterator r2 = r2.iterator()
        L_0x0438:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r1 = r2.next()
            X.0tY r1 = (X.C16730tY) r1
            X.12c r0 = r4.A19
            r0.A07(r5, r1, r3)
            goto L_0x0438
        L_0x044a:
            java.lang.Object r4 = r3.A00
            X.2Uj r4 = (X.AnonymousClass2Uj) r4
            java.util.List r0 = r4.A05
            java.util.Iterator r3 = r0.iterator()
        L_0x0454:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r2 = r3.next()
            X.0tY r2 = (X.C16730tY) r2
            X.0ta r1 = r2.A02
            X.AnonymousClass00B.A06(r1)
            boolean r0 = r1.A0P
            if (r0 != 0) goto L_0x0454
            boolean r0 = r1.A0Z
            if (r0 != 0) goto L_0x0454
            boolean r0 = X.C38621r6.A0z(r2)
            if (r0 != 0) goto L_0x0454
            X.10X r1 = r4.A0M
            r0 = 1
            r1.A06(r2, r0, r0)
            goto L_0x0454
        L_0x047a:
            java.lang.Object r4 = r3.A00
            X.2Uj r4 = (X.AnonymousClass2Uj) r4
            java.util.List r0 = r4.A05
            java.util.Iterator r3 = r0.iterator()
        L_0x0484:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r2 = r3.next()
            X.0tY r2 = (X.C16730tY) r2
            boolean r0 = X.C811346z.A00(r2)
            if (r0 == 0) goto L_0x04a9
            X.1Ot r0 = r4.A04
            X.AnonymousClass00B.A06(r0)
            java.util.Map r0 = r0.A07
            java.lang.Object r0 = r0.get(r2)
            X.1cp r0 = (X.C30711cp) r0
            if (r0 == 0) goto L_0x0484
            r0.cancel()
            goto L_0x0484
        L_0x04a9:
            X.0ta r0 = r2.A02
            X.AnonymousClass00B.A06(r0)
            boolean r0 = r0.A0Z
            if (r0 == 0) goto L_0x0484
            X.1Vw r0 = r2.A11
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x04be
            X.1HE r1 = r4.A02
            r0 = 0
            r1.A04(r2, r0)
        L_0x04be:
            X.12c r1 = r4.A03
            r0 = 0
            r1.A0B(r2, r0, r0)
            goto L_0x0484
        L_0x04c5:
            java.lang.Object r9 = r3.A00
            X.1bb r9 = (X.C30011bb) r9
            android.content.Context r1 = r9.getContext()
            java.lang.Class<X.0pN> r0 = X.C14550pN.class
            android.app.Activity r8 = X.AnonymousClass22N.A01(r1, r0)
            X.0pN r8 = (X.C14550pN) r8
            if (r8 == 0) goto L_0x0022
            X.0tZ r1 = r9.getFMessage()
            boolean r0 = X.C38621r6.A0s(r1)
            if (r0 == 0) goto L_0x04f7
            r0 = 4096(0x1000, float:5.74E-42)
            boolean r0 = r1.A10(r0)
            r7 = 0
            if (r0 == 0) goto L_0x051a
            java.lang.String r1 = r9.getMoreInfoString()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x04f7
        L_0x04f4:
            r8.A2i(r7, r1)
        L_0x04f7:
            boolean r0 = r9.A0l()
            if (r0 == 0) goto L_0x0022
            X.0tZ r0 = r9.getFMessage()
            boolean r0 = X.C26701Ou.A00(r0)
            if (r0 == 0) goto L_0x0022
            r5 = 2131889532(0x7f120d7c, float:1.941373E38)
            r4 = 2131889799(0x7f120e87, float:1.9414272E38)
            r2 = 2131889173(0x7f120c15, float:1.9413002E38)
            r1 = 2
            com.facebook.redex.IDxCListenerShape72S0200000_2_I1 r0 = new com.facebook.redex.IDxCListenerShape72S0200000_2_I1
            r0.<init>(r8, r1, r3)
            r8.A2a(r0, r5, r4, r2)
            return
        L_0x051a:
            r0 = 512(0x200, float:7.175E-43)
            boolean r0 = r1.A10(r0)
            if (r0 == 0) goto L_0x04f7
            int r6 = r1.A04
            if (r6 > 0) goto L_0x052e
            r0 = 2131889693(0x7f120e1d, float:1.9414057E38)
            java.lang.String r1 = r8.getString(r0)
            goto L_0x04f4
        L_0x052e:
            r0 = 86400(0x15180, float:1.21072E-40)
            r5 = 0
            r1 = 1
            if (r6 <= r0) goto L_0x054a
            int r6 = r6 / r0
            android.content.res.Resources r4 = r8.getResources()
            r2 = 2131755092(0x7f100054, float:1.9141054E38)
        L_0x053d:
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r1[r5] = r0
            java.lang.String r1 = r4.getQuantityString(r2, r6, r1)
            goto L_0x04f4
        L_0x054a:
            r0 = 3600(0xe10, float:5.045E-42)
            if (r6 < r0) goto L_0x0557
            int r6 = r6 / r0
            android.content.res.Resources r4 = r8.getResources()
            r2 = 2131755093(0x7f100055, float:1.9141056E38)
            goto L_0x053d
        L_0x0557:
            r0 = 60
            if (r6 < r0) goto L_0x0564
            int r6 = r6 / r0
            android.content.res.Resources r4 = r8.getResources()
            r2 = 2131755094(0x7f100056, float:1.9141058E38)
            goto L_0x053d
        L_0x0564:
            android.content.res.Resources r4 = r8.getResources()
            r2 = 2131755095(0x7f100057, float:1.914106E38)
            goto L_0x053d
        L_0x056c:
            java.lang.Object r3 = r3.A00
            X.1bd r3 = (X.C30031bd) r3
            X.1YG r1 = r3.A0b
            if (r1 == 0) goto L_0x0022
            java.lang.Class<X.5PQ> r0 = X.AnonymousClass5PQ.class
            java.lang.Object r2 = r1.AAy(r0)
            X.5PQ r2 = (X.AnonymousClass5PQ) r2
            if (r2 == 0) goto L_0x0022
            X.0tZ r1 = r3.getFMessage()
            X.43C r0 = X.AnonymousClass43C.TRIGGERED
            r2.AVd(r0, r1)
            return
        L_0x0588:
            java.lang.Object r4 = r3.A00
            X.1bb r4 = (X.C30011bb) r4
            java.lang.Runnable r0 = r4.A1f
            if (r0 == 0) goto L_0x0594
            r0.run()
            return
        L_0x0594:
            X.0tZ r3 = r4.getFMessage()
            android.content.Context r0 = r4.getContext()
            android.app.Activity r0 = X.AnonymousClass22N.A00(r0)
            if (r0 == 0) goto L_0x0022
            X.1YG r2 = r4.A0b
            if (r2 == 0) goto L_0x0022
            X.0pd r1 = r4.A0M
            X.0s5 r0 = r4.A0N
            boolean r0 = X.C38621r6.A0W(r0, r1, r3)
            if (r0 == 0) goto L_0x0a4c
            r2.A9J(r3)
            return
        L_0x05b4:
            java.lang.Object r2 = r3.A00
            com.obwhatsapp.contact.picker.SharedTextPreviewDialogFragment r2 = (com.obwhatsapp.contact.picker.SharedTextPreviewDialogFragment) r2
            X.1ZR r0 = r2.A05
            if (r0 == 0) goto L_0x0022
            X.2k5 r1 = r0.A09
            if (r1 == 0) goto L_0x0022
            java.lang.String r0 = r1.A02
            if (r0 == 0) goto L_0x0022
            java.lang.String r1 = r1.A01
            java.lang.String r0 = "video/mp4"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0a56
            java.lang.String r0 = "image/gif"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0a56
            return
        L_0x05d8:
            java.lang.Object r4 = r3.A00
            com.obwhatsapp.contact.picker.ContactPickerFragment r4 = (com.obwhatsapp.contact.picker.ContactPickerFragment) r4
            X.00l r0 = r4.A0C()
            if (r0 == 0) goto L_0x0022
            boolean r1 = r4.A2e
            r0 = 2
            if (r1 == 0) goto L_0x05e8
            r0 = 5
        L_0x05e8:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.1BI r0 = r4.A13
            r0.A00(r2)
            X.0sK r0 = r4.A0Q
            boolean r0 = r0.A0G()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0a7e
            android.content.Context r0 = r4.A02()
            int r3 = r2.intValue()
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            java.lang.String r0 = "invite_source"
            r1.putExtra(r0, r3)
            r4.A0r(r1)
            return
        L_0x061b:
            java.lang.Object r5 = r3.A00
            com.obwhatsapp.group.GroupChatInfoActivity r5 = (com.obwhatsapp.group.GroupChatInfoActivity) r5
            X.3st r1 = r5.A14
            if (r1 == 0) goto L_0x0627
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A00 = r0
        L_0x0627:
            X.0sO r1 = r5.A0C
            X.0sL r0 = r5.A1M
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x0666
            r0 = 2131891163(0x7f1213db, float:1.9417038E38)
            r5.Afq(r0)
            X.0sL r1 = r5.A1M
            X.AnonymousClass00B.A06(r1)
            X.125 r0 = r5.A1U
            r0.A04(r1)
            X.127 r1 = r5.A0U
            X.0sL r0 = r5.A1M
            r1.A04(r0)
            X.0sq r1 = r5.A05
            X.119 r7 = r5.A0v
            X.0uk r6 = r5.A0X
            X.0sL r0 = r5.A1M
            java.util.Set r8 = java.util.Collections.singleton(r0)
            r0 = 1
            com.facebook.redex.IDxFunctionShape207S0100000_2_I1 r4 = new com.facebook.redex.IDxFunctionShape207S0100000_2_I1
            r4.<init>(r3, r0)
            X.2je r3 = new X.2je
            r3.<init>(r4, r5, r6, r7, r8)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1.Ack(r3, r0)
            return
        L_0x0666:
            X.1Kw r0 = r5.A0O
            X.1WD r2 = r0.A07(r5)
            r1 = 4
            com.facebook.redex.IDxNConsumerShape154S0100000_2_I1 r0 = new com.facebook.redex.IDxNConsumerShape154S0100000_2_I1
            r0.<init>(r3, r1)
            r2.A00(r0)
            return
        L_0x0676:
            java.lang.Object r2 = r3.A00
            com.obwhatsapp.group.GroupChatInfoActivity r2 = (com.obwhatsapp.group.GroupChatInfoActivity) r2
            X.3st r1 = r2.A14
            if (r1 == 0) goto L_0x0682
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A09 = r0
        L_0x0682:
            X.0sH r0 = r2.A0w
            X.0rv r0 = r0.A0E
            android.content.Intent r0 = X.C14750ph.A0S(r2, r0)
            r2.startActivity(r0)
            return
        L_0x068e:
            java.lang.Object r1 = r3.A00
            com.obwhatsapp.group.GroupChatInfoActivity r1 = (com.obwhatsapp.group.GroupChatInfoActivity) r1
            r0 = 1
            r1.A3i(r0)
            return
        L_0x0697:
            java.lang.Object r0 = r3.A00
            com.obwhatsapp.group.GroupAdminPickerActivity r0 = (com.obwhatsapp.group.GroupAdminPickerActivity) r0
            r0.A35()
            return
        L_0x069f:
            java.lang.Object r0 = r3.A00
            com.obwhatsapp.gifsearch.GifSearchContainer r0 = (com.obwhatsapp.gifsearch.GifSearchContainer) r0
            com.obwhatsapp.WaEditText r1 = r0.A07
            java.lang.String r0 = ""
            r1.setText(r0)
            return
        L_0x06ab:
            java.lang.Object r1 = r3.A00
            com.obwhatsapp.gifsearch.GifSearchContainer r1 = (com.obwhatsapp.gifsearch.GifSearchContainer) r1
            java.lang.String r0 = r1.A0L
            r1.A01(r0)
            return
        L_0x06b5:
            java.lang.Object r0 = r3.A00
            com.obwhatsapp.emoji.search.EmojiSearchContainer r0 = (com.obwhatsapp.emoji.search.EmojiSearchContainer) r0
            com.obwhatsapp.InterceptingEditText r1 = r0.A04
            java.lang.String r0 = ""
            r1.setText(r0)
            return
        L_0x06c1:
            java.lang.Object r0 = r3.A00
            X.01A r0 = (X.AnonymousClass01A) r0
            X.00l r0 = r0.A0C()
            X.AnonymousClass1yL.A05(r0)
            return
        L_0x06cd:
            java.lang.Object r6 = r3.A00
            com.obwhatsapp.conversationslist.ConversationsFragment r6 = (com.obwhatsapp.conversationslist.ConversationsFragment) r6
            X.0zJ r5 = r6.A0I
            android.content.Context r4 = r6.A0u()
            r3 = 0
            android.content.Context r0 = r6.A0u()
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.conversationslist.ArchivedConversationsActivity"
            r2.setClassName(r1, r0)
            r5.A06(r4, r2)
            X.0t9 r2 = r6.A1g
            X.3rA r1 = new X.3rA
            r1.<init>()
            java.lang.String r0 = "Archive"
            r1.A02 = r0
            r1.A00 = r3
            r2.A06(r1)
            return
        L_0x06fe:
            java.lang.Object r6 = r3.A00
            X.1yj r6 = (X.C42821yj) r6
            X.0sH r1 = r6.A2l
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r5 = r1.A08(r0)
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            X.0ue r1 = r6.A1K
            r0 = 42
            r4 = 0
            r1.A04(r5, r4, r4, r0)
            X.1yV r0 = r6.A22
            X.0pP r0 = (X.C14570pP) r0
            X.0sq r2 = r0.A05
            r1 = 12
            com.facebook.redex.RunnableRunnableShape18S0100000_I1_1 r0 = new com.facebook.redex.RunnableRunnableShape18S0100000_I1_1
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.Acl(r0)
            X.1yV r2 = r6.A22
            r1 = 4
            r0 = 0
            X.C18450wi.A0H(r5, r0)
            com.obwhatsapp.biz.cart.view.fragment.CartFragment r0 = com.obwhatsapp.biz.cart.view.fragment.CartFragment.A01(r5, r4, r1)
            r2.Afc(r0)
            return
        L_0x0733:
            java.lang.Object r3 = r3.A00
            X.1yj r3 = (X.C42821yj) r3
            X.1M4 r1 = r3.A3x
            r0 = 1
            r1.A00(r0)
            X.01Y r1 = r3.A1Q
            X.0rv r0 = r3.A33
            com.whatsapp.jid.UserJid r0 = com.whatsapp.jid.UserJid.of(r0)
            boolean r0 = r1.A0V(r0)
            if (r0 == 0) goto L_0x0755
            X.1yV r1 = r3.A22
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 106(0x6a, float:1.49E-43)
            X.AnonymousClass29T.A01(r1, r0)
            return
        L_0x0755:
            r3.A0L()
            X.2jf r2 = r3.A1i
            android.widget.ImageButton r1 = r3.A0R
            r0 = 3
            r2.A0C(r1, r0)
            return
        L_0x0761:
            java.lang.Object r3 = r3.A00
            X.1yj r3 = (X.C42821yj) r3
            X.1kZ r1 = r3.A2C
            r0 = 0
            r1.A0J(r0)
            android.view.ViewGroup r0 = r3.A0K
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x078f
            int r2 = r3.A01
            if (r2 < 0) goto L_0x078f
            java.lang.String r1 = "conversation/hidelinkpreview/start "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.view.ViewGroup r1 = r3.A0K
            android.view.View r0 = r3.A0B
            r3.A0Z(r0, r1)
        L_0x078f:
            r3.A0B()
            return
        L_0x0793:
            java.lang.Object r5 = r3.A00
            X.2gK r5 = (X.C53802gK) r5
            boolean r0 = r6 instanceof com.obwhatsapp.reactions.ReactionEmojiTextView
            if (r0 != 0) goto L_0x07a0
            java.lang.String r0 = "Given view is not ReactionEmojiTextView."
            X.AnonymousClass00B.A08(r0)
        L_0x07a0:
            com.obwhatsapp.reactions.ReactionEmojiTextView r6 = (com.obwhatsapp.reactions.ReactionEmojiTextView) r6
            android.animation.AnimatorSet r0 = r5.A00
            if (r0 != 0) goto L_0x07ad
            android.animation.AnimatorSet r0 = new android.animation.AnimatorSet
            r0.<init>()
            r5.A00 = r0
        L_0x07ad:
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x07b8
            android.animation.AnimatorSet r0 = r5.A00
            r0.cancel()
        L_0x07b8:
            r4 = 0
        L_0x07b9:
            int r0 = r5.getChildCount()
            if (r4 >= r0) goto L_0x07e1
            android.view.View r2 = r5.getChildAt(r4)
            boolean r0 = r2 instanceof com.obwhatsapp.reactions.ReactionEmojiTextView
            if (r0 == 0) goto L_0x07de
            boolean r0 = r2.isSelected()
            if (r0 == 0) goto L_0x07de
            boolean r0 = r2.equals(r6)
            if (r0 != 0) goto L_0x07de
            android.animation.AnimatorSet r1 = r5.A00
            com.obwhatsapp.reactions.ReactionEmojiTextView r2 = (com.obwhatsapp.reactions.ReactionEmojiTextView) r2
            android.animation.Animator r0 = X.C53802gK.A00(r5, r2)
            r1.play(r0)
        L_0x07de:
            int r4 = r4 + 1
            goto L_0x07b9
        L_0x07e1:
            boolean r0 = r6.isSelected()
            android.animation.AnimatorSet r4 = r5.A00
            if (r0 == 0) goto L_0x0801
            android.animation.Animator r2 = X.C53802gK.A00(r5, r6)
        L_0x07ed:
            r4.play(r2)
            android.animation.AnimatorSet r2 = r5.A00
            r1 = 1
            com.facebook.redex.IDxLAdapterShape1S0200000_2_I1 r0 = new com.facebook.redex.IDxLAdapterShape1S0200000_2_I1
            r0.<init>(r3, r1, r6)
            r2.addListener(r0)
            android.animation.AnimatorSet r0 = r5.A00
            r0.start()
            return
        L_0x0801:
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            r7 = 1065353216(0x3f800000, float:1.0)
            r10 = 1060320051(0x3f333333, float:0.7)
            r0 = 2
            float[] r1 = new float[r0]
            r0 = 0
            r1[r0] = r7
            r0 = 1
            r1[r0] = r10
            java.lang.String r7 = "foregroundScale"
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r6, r7, r1)
            r0 = 80
            android.animation.ObjectAnimator r9 = r8.setDuration(r0)
            android.view.animation.Interpolator r12 = X.C53802gK.A0C
            r9.setInterpolator(r12)
            X.3K9 r0 = new X.3K9
            r0.<init>(r5, r6, r10)
            r9.addListener(r0)
            r8 = 2
            android.animation.Animator[] r11 = new android.animation.Animator[r8]
            r13 = 0
            r11[r13] = r9
            r0 = 1060320051(0x3f333333, float:0.7)
            r10 = 1065353216(0x3f800000, float:1.0)
            float[] r1 = new float[r8]
            r1[r13] = r0
            r0 = 1
            r1[r0] = r10
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r6, r7, r1)
            r0 = 80
            android.animation.ObjectAnimator r1 = r7.setDuration(r0)
            r1.setInterpolator(r12)
            X.3K9 r0 = new X.3K9
            r0.<init>(r5, r6, r10)
            r1.addListener(r0)
            r12 = 1
            r11[r12] = r1
            r2.playSequentially(r11)
            r7 = 0
            r0 = 250(0xfa, double:1.235E-321)
            float[] r11 = new float[r8]
            r11[r13] = r7
            r11[r12] = r10
            java.lang.String r7 = "backgroundScale"
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r6, r7, r11)
            android.animation.ObjectAnimator r1 = r7.setDuration(r0)
            X.3KA r0 = new X.3KA
            r0.<init>(r5, r6, r10)
            r1.addListener(r0)
            android.view.animation.Interpolator r0 = X.C56092kx.A00
            r1.setInterpolator(r0)
            android.animation.Animator[] r0 = new android.animation.Animator[r8]
            r0[r13] = r9
            r0[r12] = r1
            r2.playTogether(r0)
            com.facebook.redex.IDxLAdapterShape1S0200000_2_I1 r0 = new com.facebook.redex.IDxLAdapterShape1S0200000_2_I1
            r0.<init>(r5, r8, r6)
            r2.addListener(r0)
            goto L_0x07ed
        L_0x088d:
            java.lang.Object r0 = r3.A00
            X.1bb r0 = (X.C30011bb) r0
            r0.A0z()
            return
        L_0x0895:
            java.lang.Object r0 = r3.A00
            X.2Q7 r0 = (X.AnonymousClass2Q7) r0
            X.10X r2 = r0.A0M
            X.0tY r1 = r0.getFMessage()
            r0 = 1
            r2.A06(r1, r0, r0)
            return
        L_0x08a4:
            java.lang.Object r1 = r3.A00
            X.2Q7 r1 = (X.AnonymousClass2Q7) r1
            X.0tY r3 = r1.getFMessage()
            boolean r0 = X.C811346z.A00(r3)
            if (r0 == 0) goto L_0x08bb
            X.1Ot r0 = r1.A07
            X.AnonymousClass00B.A06(r0)
            r0.A00(r3)
            return
        L_0x08bb:
            X.0ta r0 = r3.A02
            X.AnonymousClass00B.A06(r0)
            int r0 = r0.A07
            r4 = 1
            if (r0 != r4) goto L_0x08de
            byte r3 = r3.A10
            r0 = 2
            X.0pt r2 = r1.A0J
            if (r3 != r0) goto L_0x08d3
            r1 = 2131888441(0x7f120939, float:1.9411517E38)
        L_0x08cf:
            r2.A07(r1, r4)
            return
        L_0x08d3:
            r0 = 9
            r1 = 2131888442(0x7f12093a, float:1.941152E38)
            if (r3 != r0) goto L_0x08cf
            r1 = 2131892382(0x7f12189e, float:1.941951E38)
            goto L_0x08cf
        L_0x08de:
            java.lang.String r0 = r3.A08
            if (r0 == 0) goto L_0x08f4
            X.0tb r2 = r1.A0R
            android.content.Context r1 = r1.getContext()
            java.lang.Class<X.0pN> r0 = X.C14550pN.class
            android.app.Activity r0 = X.C19980zJ.A01(r1, r0)
            X.0pN r0 = (X.C14550pN) r0
            r2.A05(r0, r3, r4)
            return
        L_0x08f4:
            java.lang.String r0 = "cannot download media message with no media attached"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0pt r2 = r1.A0J
            r1 = 2131889064(0x7f120ba8, float:1.941278E38)
            r0 = 0
            r2.A09(r1, r0)
            return
        L_0x0903:
            java.lang.Object r0 = r3.A00
            X.1bb r0 = (X.C30011bb) r0
            X.0tb r1 = r0.A0R
            X.0tZ r0 = r0.A0O
            X.1d9 r0 = (X.C30901d9) r0
            r1.A0U(r0)
            return
        L_0x0911:
            java.lang.Object r2 = r3.A00
            X.1bb r2 = (X.C30011bb) r2
            X.0tZ r0 = r2.getFMessage()
            X.1Vw r0 = r0.A11
            X.0rv r1 = r0.A00
            X.23T r0 = r2.getMessageReactions()
            r2.A1B(r1, r0)
            return
        L_0x0925:
            java.lang.Object r4 = r3.A00
            X.1bb r4 = (X.C30011bb) r4
            X.1Mm r0 = r4.A1O
            boolean r0 = r0.A01()
            r2 = 7
            if (r0 == 0) goto L_0x093e
            X.13a r0 = r4.A1R
            r0.A01(r2)
            X.1Sp r1 = r4.A1Y
            r0 = 0
            r1.A04(r0)
            return
        L_0x093e:
            android.content.Context r1 = r4.getContext()
            java.lang.Class<X.0pN> r0 = X.C14550pN.class
            android.app.Activity r3 = X.AnonymousClass22N.A01(r1, r0)
            if (r3 == 0) goto L_0x0962
            X.13a r0 = r4.A1R
            r0.A01(r2)
            X.13a r1 = r4.A1R
            r0 = 2
            r1.A02(r0)
            X.1ML r2 = r4.A1Q
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r3)
            java.lang.String r0 = "conversation_quick_action_button"
            X.AnonymousClass1ML.A01(r2, r0, r1)
            return
        L_0x0962:
            java.lang.String r0 = "Unable to find host Activity"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0968:
            java.lang.Object r2 = r3.A00
            com.obwhatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity r2 = (com.obwhatsapp.contact.picker.invite.InviteNonWhatsAppContactPickerActivity) r2
            X.1BJ r1 = r2.A0A
            java.lang.Integer r0 = r2.A37()
            r1.A01(r2, r0)
            return
        L_0x0976:
            java.lang.Object r1 = r3.A00
            com.obwhatsapp.contact.picker.SharedTextPreviewDialogFragment r1 = (com.obwhatsapp.contact.picker.SharedTextPreviewDialogFragment) r1
            java.lang.String r0 = r1.A0L
            r1.A0K = r0
            r0 = 0
            r1.A05 = r0
            r1.A1P()
            return
        L_0x0985:
            java.lang.Object r0 = r3.A00
            android.app.Activity r0 = (android.app.Activity) r0
            X.AnonymousClass1yL.A05(r0)
            return
        L_0x098d:
            java.lang.Object r2 = r3.A00
            X.1V8 r2 = (X.AnonymousClass1V8) r2
            java.util.List r0 = r2.A0g
            int r0 = r0.size()
            int r1 = r2.A3A()
            if (r0 >= r1) goto L_0x09b7
            X.0pt r7 = r2.A05
            X.013 r6 = r2.A0S
            r5 = 2131755225(0x7f1000d9, float:1.9141323E38)
            long r3 = (long) r1
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r1 = 0
            r2[r1] = r0
            java.lang.String r0 = r6.A0J(r2, r5, r3)
            r7.A0H(r0, r1)
            return
        L_0x09b7:
            r2.A3K()
            return
        L_0x09bb:
            java.lang.Object r0 = r3.A00
            com.obwhatsapp.contact.picker.ContactPickerFragment r0 = (com.obwhatsapp.contact.picker.ContactPickerFragment) r0
            r0.A1S()
            return
        L_0x09c3:
            java.lang.Object r3 = r3.A00
            com.obwhatsapp.contact.picker.ContactPickerFragment r3 = (com.obwhatsapp.contact.picker.ContactPickerFragment) r3
            java.lang.String r0 = r3.A2B
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r0 = 14
            if (r1 == 0) goto L_0x09d2
            r0 = 2
        L_0x09d2:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.1BI r0 = r3.A13
            r0.A00(r2)
            X.1BJ r1 = r3.A0V
            android.content.Context r0 = r6.getContext()
            r1.A01(r0, r2)
            return
        L_0x09e5:
            java.lang.Object r0 = r3.A00
            com.obwhatsapp.contact.picker.ContactPickerFragment r0 = (com.obwhatsapp.contact.picker.ContactPickerFragment) r0
            X.0pd r3 = r0.A1d
            X.0pt r2 = r0.A0P
            X.00l r1 = r0.A0D()
            X.1Ks r4 = r0.A1z
            r5 = 3
            r6 = 12
            X.AnonymousClass46S.A00(r1, r2, r3, r4, r5, r6)
            return
        L_0x09fa:
            java.lang.Object r0 = r3.A00
            com.obwhatsapp.community.NewCommunityAdminBottomSheetFragment r0 = (com.obwhatsapp.community.NewCommunityAdminBottomSheetFragment) r0
            X.3Q6 r3 = r0.A01
            X.0uk r2 = r3.A02
            X.0sL r1 = r3.A00
            r0 = 1
            r2.A08(r1, r0)
            r3.A05(r0)
            return
        L_0x0a0c:
            java.lang.Object r0 = r3.A00
            com.obwhatsapp.community.NewCommunityAdminBottomSheetFragment r0 = (com.obwhatsapp.community.NewCommunityAdminBottomSheetFragment) r0
            X.3Q6 r3 = r0.A01
            X.0uk r2 = r3.A02
            X.0sL r1 = r3.A00
            r0 = 1
            r2.A08(r1, r0)
            r0 = 2
            r3.A05(r0)
            return
        L_0x0a1f:
            java.lang.Object r0 = r3.A00
            com.obwhatsapp.community.JoinGroupBottomSheetFragment r0 = (com.obwhatsapp.community.JoinGroupBottomSheetFragment) r0
            X.2Uo r0 = r0.A0T
            X.2OJ r1 = r0.A0W
            r0 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0B(r0)
            return
        L_0x0a30:
            r2.A3N()
            return
        L_0x0a34:
            X.0tY r0 = r1.getFMessage()
            boolean r0 = X.C38621r6.A0z(r0)
            if (r0 != 0) goto L_0x0a45
            X.1HE r1 = r1.A04
            r0 = 1
            r1.A04(r2, r0)
            return
        L_0x0a45:
            X.12c r1 = r1.A06
            r0 = 0
            r1.A0B(r2, r0, r0)
            return
        L_0x0a4c:
            X.0pt r2 = r4.A0J
            r1 = 2131889466(0x7f120d3a, float:1.9413596E38)
            r0 = 1
            r2.A07(r1, r0)
            return
        L_0x0a56:
            com.obwhatsapp.webpagepreview.WebPagePreviewView r1 = r2.A0F
            r0 = 1
            r1.setImageProgressBarVisibility(r0)
            com.obwhatsapp.webpagepreview.WebPagePreviewView r0 = r2.A0F
            r7 = 0
            r0.setImageThumbVisibility(r7)
            X.0sq r6 = r2.A0I
            X.0sb r5 = r2.A07
            X.1ZR r0 = r2.A05
            X.2k5 r0 = r0.A09
            java.lang.String r4 = r0.A02
            java.lang.String r2 = r0.A01
            X.4yc r0 = new X.4yc
            r0.<init>(r3)
            X.2kW r1 = new X.2kW
            r1.<init>(r5, r0, r4, r2)
            java.lang.String[] r0 = new java.lang.String[r7]
            r6.Ack(r1, r0)
            return
        L_0x0a7e:
            X.1BJ r1 = r4.A0V
            android.content.Context r0 = r6.getContext()
            r1.A01(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.util.ViewOnClickCListenerShape1S0100000_I0_1.A06(android.view.View):void");
    }
}
