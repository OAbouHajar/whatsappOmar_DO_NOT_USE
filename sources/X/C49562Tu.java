package X;

import com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel;
import com.obwhatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel;

/* renamed from: X.2Tu  reason: invalid class name and case insensitive filesystem */
public class C49562Tu extends C003401n {
    public void A05(int i2) {
        if (this instanceof MenuBottomSheetViewModel) {
            ((MenuBottomSheetViewModel) this).A00 = i2;
        } else if (this instanceof CallGridViewModel) {
            CallGridViewModel callGridViewModel = (CallGridViewModel) this;
            boolean z2 = true;
            if (!(i2 == 1 || i2 == 2)) {
                z2 = false;
            }
            callGridViewModel.A03 = z2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01d6, code lost:
        if (r1 == com.whatsapp.voipcalling.CallState.REJOINING) goto L_0x01d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x024c, code lost:
        if (r3 == 3) goto L_0x024e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bd, code lost:
        if (r9 != false) goto L_0x00bf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x01fb  */
    /* JADX WARNING: Removed duplicated region for block: B:228:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.AnonymousClass3AY r17) {
        /*
            r16 = this;
            r2 = r16
            boolean r0 = r2 instanceof com.obwhatsapp.calling.controls.viewmodel.ParticipantsListViewModel
            r5 = r17
            if (r0 == 0) goto L_0x01c6
            com.obwhatsapp.calling.controls.viewmodel.ParticipantsListViewModel r2 = (com.obwhatsapp.calling.controls.viewmodel.ParticipantsListViewModel) r2
            boolean r9 = r2.A0B
            boolean r12 = X.AnonymousClass46B.A00(r5, r9)
            com.whatsapp.voipcalling.CallState r6 = r5.A06
            boolean r4 = r5.A0A
            boolean r3 = r5.A0C
            if (r3 == 0) goto L_0x0041
            int r1 = r2.A00
            r0 = 5
            if (r1 >= r0) goto L_0x0041
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.CALLING
            r8 = 1
            if (r6 != r0) goto L_0x0075
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x0041
            r2.A02 = r8
            X.1OL r0 = r2.A06
            int r7 = r1 + 1
            r2.A00 = r7
            android.content.SharedPreferences r0 = r0.A01()
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "inline_education"
            android.content.SharedPreferences$Editor r0 = r1.putInt(r0, r7)
            r0.apply()
            r2.A03 = r8
        L_0x0041:
            X.0vs r7 = r5.A01
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Collection r0 = r7.values()
            java.util.Iterator r11 = r0.iterator()
        L_0x0050:
            r10 = 0
        L_0x0051:
            boolean r0 = r11.hasNext()
            r13 = 1
            if (r0 == 0) goto L_0x007e
            java.lang.Object r1 = r11.next()
            X.1fU r1 = (X.C32001fU) r1
            boolean r0 = r1.A0G
            if (r0 != 0) goto L_0x0051
            r8.add(r1)
            if (r10 != 0) goto L_0x0073
            int r1 = r1.A01
            r0 = 3
            if (r1 == r0) goto L_0x0073
            r0 = 2
            if (r1 == r0) goto L_0x0073
            r0 = 11
            if (r1 != r0) goto L_0x0050
        L_0x0073:
            r10 = 1
            goto L_0x0051
        L_0x0075:
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r6 != r0) goto L_0x0041
            r0 = r4 ^ 1
            r2.A02 = r0
            goto L_0x0041
        L_0x007e:
            r1 = 4
            com.facebook.redex.IDxComparatorShape184S0100000_2_I1 r0 = new com.facebook.redex.IDxComparatorShape184S0100000_2_I1
            r0.<init>(r2, r1)
            java.util.Collections.sort(r8, r0)
            X.0sL r0 = r5.A03
            if (r0 != 0) goto L_0x00b4
            if (r12 == 0) goto L_0x0097
            boolean r0 = com.whatsapp.voipcalling.Voip.A09(r6)
            if (r0 != 0) goto L_0x00b4
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACCEPT_SENT
            if (r6 == r0) goto L_0x00b4
        L_0x0097:
            r15 = 1
        L_0x0098:
            X.0v0 r0 = r7.values()
            java.util.Iterator r1 = r0.iterator()
            r14 = 0
        L_0x00a1:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r0 = r1.next()
            X.1fU r0 = (X.C32001fU) r0
            int r0 = r0.A01
            if (r0 != r13) goto L_0x00a1
            int r14 = r14 + 1
            goto L_0x00a1
        L_0x00b4:
            r15 = 0
            goto L_0x0098
        L_0x00b6:
            r0 = 1
            if (r12 != 0) goto L_0x01b1
            if (r14 <= r13) goto L_0x01b1
            if (r3 == 0) goto L_0x01b1
            if (r9 == 0) goto L_0x01b2
        L_0x00bf:
            if (r4 == 0) goto L_0x01ae
            if (r10 == 0) goto L_0x01ae
        L_0x00c3:
            boolean r12 = r2.A02
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r7 = 0
            r3 = 1
            if (r0 == 0) goto L_0x00f0
            r11 = 2131755206(0x7f1000c6, float:1.9141285E38)
            if (r9 == 0) goto L_0x00db
            r11 = 2131755205(0x7f1000c5, float:1.9141283E38)
        L_0x00db:
            java.lang.Object[] r10 = new java.lang.Object[r3]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            r10[r7] = r0
            X.3yA r1 = new X.3yA
            r1.<init>(r10, r11, r14)
            X.3n5 r0 = new X.3n5
            r0.<init>(r1)
            r4.add(r0)
        L_0x00f0:
            if (r13 == 0) goto L_0x00fb
            r1 = 2
            X.26J r0 = new X.26J
            r0.<init>(r1)
            r4.add(r0)
        L_0x00fb:
            if (r12 == 0) goto L_0x0106
            r1 = 3
            X.26J r0 = new X.26J
            r0.<init>(r1)
            r4.add(r0)
        L_0x0106:
            java.lang.String r0 = r5.A08
            if (r0 == 0) goto L_0x0119
            boolean r0 = X.AnonymousClass46B.A00(r5, r9)
            if (r0 != 0) goto L_0x0119
            r1 = 5
            X.26J r0 = new X.26J
            r0.<init>(r1)
            r4.add(r0)
        L_0x0119:
            if (r15 == 0) goto L_0x0123
            X.26J r0 = new X.26J
            r0.<init>(r7)
            r4.add(r0)
        L_0x0123:
            X.1fU r0 = r5.A02
            if (r0 == 0) goto L_0x01ac
            int r1 = r0.A01
            if (r1 == r3) goto L_0x012e
            r0 = 7
            if (r1 != r0) goto L_0x01ac
        L_0x012e:
            r15 = 1
        L_0x012f:
            java.util.Iterator r9 = r8.iterator()
        L_0x0133:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01b8
            java.lang.Object r1 = r9.next()
            X.1fU r1 = (X.C32001fU) r1
            com.whatsapp.jid.UserJid r12 = r1.A07
            X.0sG r0 = r2.A08
            X.0sH r11 = r0.A0A(r12)
            boolean r14 = r1.A0G
            int r13 = r1.A01
            X.26I r10 = new X.26I
            r10.<init>(r11, r12, r13, r14, r15)
            r4.add(r10)
            java.util.Set r5 = r2.A0A
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x01a8
            boolean r0 = r5.contains(r12)
            if (r0 != 0) goto L_0x01a8
            if (r13 == r3) goto L_0x01a8
            X.2PE r0 = r2.A01
            if (r0 == 0) goto L_0x01a8
            com.whatsapp.voipcalling.VoipActivityV2 r8 = r0.A00
            com.whatsapp.voipcalling.VoipCallControlBottomSheetV2 r0 = r8.A1d
            if (r0 == 0) goto L_0x01a8
            boolean r0 = r0.A1S()
            if (r0 != 0) goto L_0x01a8
            com.obwhatsapp.contact.picker.ContactPickerFragment r0 = r8.A1L
            if (r0 != 0) goto L_0x01a8
            boolean r0 = r1.A0B
            if (r0 != 0) goto L_0x01a8
            com.whatsapp.voipcalling.CallInfo r5 = r8.A3B()
            if (r5 == 0) goto L_0x01a8
            com.whatsapp.voipcalling.CallState r1 = r5.callState
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE
            if (r1 != r0) goto L_0x01a8
            boolean r0 = r5.isGroupCall
            if (r0 == 0) goto L_0x01a8
            com.obwhatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r8 = r8.A0u
            if (r8 == 0) goto L_0x01a8
            boolean r5 = r5.videoEnabled
            com.whatsapp.jid.UserJid[] r0 = new com.whatsapp.jid.UserJid[r3]
            r0[r7] = r12
            java.util.List r1 = java.util.Arrays.asList(r0)
            r0 = 2131101698(0x7f060802, float:1.7815813E38)
            if (r5 == 0) goto L_0x01a1
            r0 = 2131101144(0x7f0605d8, float:1.781469E38)
        L_0x01a1:
            X.2Tv r0 = r8.A08(r1, r0)
            r8.A0A(r0)
        L_0x01a8:
            r6.add(r12)
            goto L_0x0133
        L_0x01ac:
            r15 = 0
            goto L_0x012f
        L_0x01ae:
            r13 = 0
            goto L_0x00c3
        L_0x01b1:
            r0 = 0
        L_0x01b2:
            int r14 = r8.size()
            goto L_0x00bf
        L_0x01b8:
            java.util.Set r0 = r2.A0A
            r0.clear()
            r0.addAll(r6)
            X.027 r0 = r2.A04
            r0.A0B(r4)
            return
        L_0x01c6:
            boolean r0 = r2 instanceof com.obwhatsapp.calling.controls.viewmodel.CallControlButtonsViewModel
            if (r0 == 0) goto L_0x0230
            com.obwhatsapp.calling.controls.viewmodel.CallControlButtonsViewModel r2 = (com.obwhatsapp.calling.controls.viewmodel.CallControlButtonsViewModel) r2
            com.whatsapp.voipcalling.CallState r1 = r5.A06
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.RECEIVED_CALL
            r4 = 1
            if (r1 == r0) goto L_0x01d8
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.REJOINING
            r3 = 0
            if (r1 != r0) goto L_0x01d9
        L_0x01d8:
            r3 = 1
        L_0x01d9:
            boolean r0 = r5.A0C
            if (r0 == 0) goto L_0x01ff
            if (r3 == 0) goto L_0x01ff
            int r4 = r2.A00
            boolean r0 = r5.A0A
            X.4Sj r3 = new X.4Sj
            r3.<init>(r0)
            r1 = 1
        L_0x01e9:
            r0 = 0
            X.4Uk r5 = new X.4Uk
            r5.<init>(r0, r3, r1, r4)
        L_0x01ef:
            X.027 r1 = r2.A01
            java.lang.Object r0 = r1.A01()
            boolean r0 = X.C34901l3.A00(r0, r5)
            if (r0 != 0) goto L_0x01fe
            r1.A0B(r5)
        L_0x01fe:
            return
        L_0x01ff:
            int r1 = r5.A00
            if (r1 == r4) goto L_0x0226
            r0 = 2
            if (r1 == r0) goto L_0x0226
            if (r3 == 0) goto L_0x0213
            r0 = 3
            if (r1 == r0) goto L_0x0213
            r1 = 0
            r0 = 0
            X.4Uk r5 = new X.4Uk
            r5.<init>(r0, r0, r1, r1)
            goto L_0x01ef
        L_0x0213:
            int r4 = r2.A00
            boolean r1 = r5.A0F
            com.whatsapp.jid.UserJid r0 = r5.A05
            X.4TR r3 = new X.4TR
            r3.<init>(r0, r1)
            r1 = 2
            r0 = 0
            X.4Uk r5 = new X.4Uk
            r5.<init>(r3, r0, r1, r4)
            goto L_0x01ef
        L_0x0226:
            int r4 = r2.A00
            r0 = 0
            X.4Sj r3 = new X.4Sj
            r3.<init>(r0)
            r1 = 3
            goto L_0x01e9
        L_0x0230:
            boolean r0 = r2 instanceof com.obwhatsapp.calling.controls.viewmodel.BottomSheetViewModel
            if (r0 == 0) goto L_0x02f8
            com.obwhatsapp.calling.controls.viewmodel.BottomSheetViewModel r2 = (com.obwhatsapp.calling.controls.viewmodel.BottomSheetViewModel) r2
            boolean r6 = r2.A07(r5)
            boolean r7 = r5.A0F
            r2.A02 = r7
            int r3 = r5.A00
            r1 = 1
            if (r3 == r1) goto L_0x0247
            r0 = 2
            if (r3 == r0) goto L_0x0247
            r1 = 0
        L_0x0247:
            r4 = 0
            if (r1 != 0) goto L_0x024e
            r0 = 3
            r1 = 0
            if (r3 != r0) goto L_0x024f
        L_0x024e:
            r1 = 1
        L_0x024f:
            r2.A01 = r1
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x0258
            if (r1 != 0) goto L_0x0258
            r4 = 1
        L_0x0258:
            X.027 r3 = r2.A05
            java.lang.Object r0 = r3.A01()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            boolean r0 = X.C34901l3.A00(r0, r1)
            if (r0 != 0) goto L_0x026b
            r3.A0B(r1)
        L_0x026b:
            boolean r1 = X.AnonymousClass46B.A00(r5, r6)
            X.2OJ r3 = r2.A0B
            java.lang.Object r0 = r3.A01()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0282
            r3.A0B(r1)
        L_0x0282:
            X.2OJ r4 = r2.A0C
            java.lang.Object r0 = r4.A01()
            boolean r3 = r5.A0E
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r3)
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0297
            r4.A0B(r1)
        L_0x0297:
            r1 = 1
            boolean r0 = X.AnonymousClass46B.A00(r5, r6)
            if (r0 != 0) goto L_0x02f6
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x02f6
            boolean r0 = r5.A0D
            if (r0 != 0) goto L_0x02f6
            if (r7 == 0) goto L_0x02f6
            if (r3 != 0) goto L_0x02f6
            X.01V r0 = r2.A08
            android.view.accessibility.AccessibilityManager r0 = r0.A0P()
            boolean r0 = X.AnonymousClass2JP.A06(r0)
            if (r0 != 0) goto L_0x02f6
        L_0x02b6:
            X.027 r3 = r2.A06
            java.lang.Object r0 = r3.A01()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r0 = X.C34901l3.A00(r0, r1)
            if (r0 != 0) goto L_0x02c9
            r3.A0B(r1)
        L_0x02c9:
            X.027 r4 = r2.A04
            java.lang.Object r3 = r4.A01()
            boolean r0 = r5.A0C
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C34901l3.A00(r3, r1)
            if (r0 != 0) goto L_0x02de
            r4.A0B(r1)
        L_0x02de:
            boolean r1 = r2.A08(r5, r6)
            X.027 r2 = r2.A03
            java.lang.Object r0 = r2.A01()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r0 = X.C34901l3.A00(r0, r1)
            if (r0 != 0) goto L_0x01fe
            r2.A0B(r1)
            return
        L_0x02f6:
            r1 = 0
            goto L_0x02b6
        L_0x02f8:
            boolean r0 = r2 instanceof com.obwhatsapp.calling.callheader.viewmodel.CallHeaderViewModel
            if (r0 == 0) goto L_0x034e
            com.obwhatsapp.calling.callheader.viewmodel.CallHeaderViewModel r2 = (com.obwhatsapp.calling.callheader.viewmodel.CallHeaderViewModel) r2
            com.whatsapp.voipcalling.CallState r1 = r5.A06
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.LINK
            if (r1 != r0) goto L_0x01fe
            com.whatsapp.jid.UserJid r3 = r5.A04
            if (r3 == 0) goto L_0x034c
            X.0sK r1 = r2.A01
            boolean r0 = r1.A0I(r3)
            if (r0 == 0) goto L_0x033f
            java.lang.String r3 = r1.A07()
        L_0x0314:
            r5 = 0
            if (r3 == 0) goto L_0x0339
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r5] = r3
            r0 = 2131886925(0x7f12034d, float:1.9408443E38)
        L_0x031f:
            X.3y9 r4 = new X.3y9
            r4.<init>(r1, r0)
            X.027 r3 = r2.A00
            java.lang.Object[] r2 = new java.lang.Object[r5]
            r0 = 2131886926(0x7f12034e, float:1.9408445E38)
            X.3y9 r1 = new X.3y9
            r1.<init>(r2, r0)
            X.2Wh r0 = new X.2Wh
            r0.<init>(r1, r4)
            r3.A0B(r0)
            return
        L_0x0339:
            java.lang.Object[] r1 = new java.lang.Object[r5]
            r0 = 2131886924(0x7f12034c, float:1.940844E38)
            goto L_0x031f
        L_0x033f:
            X.0sP r1 = r2.A04
            X.0sG r0 = r2.A03
            X.0sH r0 = r0.A0A(r3)
            java.lang.String r3 = r1.A08(r0)
            goto L_0x0314
        L_0x034c:
            r3 = 0
            goto L_0x0314
        L_0x034e:
            boolean r0 = r2 instanceof com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel
            if (r0 == 0) goto L_0x01fe
            com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel r2 = (com.obwhatsapp.calling.callgrid.viewmodel.CallGridViewModel) r2
            r0 = 0
            r2.A0E(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49562Tu.A06(X.3AY):void");
    }
}
