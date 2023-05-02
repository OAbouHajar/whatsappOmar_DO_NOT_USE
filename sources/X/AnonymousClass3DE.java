package X;

import android.widget.AdapterView;
import com.obwhatsapp.contact.picker.ContactPickerFragment;

/* renamed from: X.3DE  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3DE implements AdapterView.OnItemClickListener {
    public final /* synthetic */ ContactPickerFragment A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ AnonymousClass3DE(ContactPickerFragment contactPickerFragment, boolean z2) {
        this.A00 = contactPickerFragment;
        this.A01 = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        r6 = (X.AnonymousClass2XJ) r2.A02.get(r11);
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onItemClick(android.widget.AdapterView r9, android.view.View r10, int r11, long r12) {
        /*
            r8 = this;
            com.obwhatsapp.contact.picker.ContactPickerFragment r3 = r8.A00
            boolean r5 = r8.A01
            android.widget.ListView r0 = r3.A0G
            android.widget.ListAdapter r2 = r0.getAdapter()
            boolean r0 = r2 instanceof android.widget.HeaderViewListAdapter
            if (r0 == 0) goto L_0x0014
            android.widget.HeaderViewListAdapter r2 = (android.widget.HeaderViewListAdapter) r2
            android.widget.ListAdapter r2 = r2.getWrappedAdapter()
        L_0x0014:
            X.2Rm r2 = (X.C49182Rm) r2
            android.widget.ListView r0 = r3.A0G
            android.widget.ListAdapter r1 = r0.getAdapter()
            boolean r0 = r1 instanceof android.widget.HeaderViewListAdapter
            if (r0 == 0) goto L_0x0027
            android.widget.HeaderViewListAdapter r1 = (android.widget.HeaderViewListAdapter) r1
            int r0 = r1.getHeadersCount()
            int r11 = r11 - r0
        L_0x0027:
            if (r11 < 0) goto L_0x00c3
            int r0 = r2.getCount()
            if (r11 >= r0) goto L_0x00c3
            java.util.List r0 = r2.A02
            java.lang.Object r6 = r0.get(r11)
            X.2XJ r6 = (X.AnonymousClass2XJ) r6
            X.0sH r4 = r6.AAn()
            if (r4 == 0) goto L_0x00c3
            boolean r0 = r6 instanceof X.C101364xC
            if (r0 == 0) goto L_0x0053
            com.whatsapp.jid.Jid r0 = X.C16010sH.A03(r4)
            if (r0 == 0) goto L_0x0053
            X.0sq r2 = r3.A24
            r1 = 46
            com.facebook.redex.RunnableRunnableShape4S0200000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape4S0200000_I0_2
            r0.<init>(r3, r1, r4)
            r2.Acl(r0)
        L_0x0053:
            X.01Y r1 = r3.A0a
            com.whatsapp.jid.Jid r0 = X.C16010sH.A03(r4)
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0
            boolean r0 = r1.A0V(r0)
            r2 = 1
            if (r0 == 0) goto L_0x00c4
            boolean r0 = r3.A2e
            r6 = 2131892343(0x7f121877, float:1.9419432E38)
            if (r0 == 0) goto L_0x006c
            r6 = 2131892342(0x7f121876, float:1.941943E38)
        L_0x006c:
            java.lang.Object[] r1 = new java.lang.Object[r2]
            X.0sP r0 = r3.A0r
            java.lang.String r0 = r0.A08(r4)
            r7 = 0
            java.lang.String r6 = X.C13690nt.A0c(r3, r0, r1, r7, r6)
            r1 = 2131886658(0x7f120242, float:1.9407901E38)
            com.facebook.redex.IDxUnblockerShape77S0200000_2_I1 r0 = new com.facebook.redex.IDxUnblockerShape77S0200000_2_I1
            r0.<init>(r4, r2, r3)
            com.obwhatsapp.blocklist.UnblockDialogFragment r1 = com.obwhatsapp.blocklist.UnblockDialogFragment.A01(r0, r6, r1, r7)
            X.00l r0 = r3.A0C()
            X.C13680ns.A1J(r1, r0)
        L_0x008c:
            if (r5 == 0) goto L_0x00c3
        L_0x008e:
            boolean r0 = r4.A0i
            if (r0 == 0) goto L_0x00c3
            X.3r7 r1 = new X.3r7
            r1.<init>()
            java.util.List r0 = r3.A2Q
            boolean r0 = r0.contains(r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A00 = r0
            java.lang.String r0 = r3.A2B
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A01 = r0
            boolean r0 = r4.A0J()
            if (r0 == 0) goto L_0x00b8
            r2 = 2
        L_0x00b8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.A02 = r0
            X.0t9 r0 = r3.A1f
            r0.A06(r1)
        L_0x00c3:
            return
        L_0x00c4:
            boolean r0 = r4.A0i
            if (r0 == 0) goto L_0x00e5
            boolean r0 = r3.A2q
            if (r0 != 0) goto L_0x00e1
            boolean r0 = r3.A2i
            if (r0 != 0) goto L_0x00e1
            boolean r0 = r3.A2o
            if (r0 != 0) goto L_0x00e1
            java.util.Map r0 = r3.A2w
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00e1
            r0 = 0
            r3.A1u(r0, r4)
            goto L_0x008c
        L_0x00e1:
            r3.A1Z(r10, r4)
            goto L_0x008c
        L_0x00e5:
            if (r5 == 0) goto L_0x00ff
            boolean r0 = r6 instanceof X.AnonymousClass3oS
            if (r0 == 0) goto L_0x00ff
            X.3oS r6 = (X.AnonymousClass3oS) r6
            java.util.List r1 = r6.A00
            int r0 = r1.size()
            if (r0 <= r2) goto L_0x00ff
            X.0sP r0 = r3.A0r
            java.lang.String r0 = r0.A08(r4)
            r3.A1g(r0, r1)
            goto L_0x008e
        L_0x00ff:
            r3.A1d(r4)
            goto L_0x008c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3DE.onItemClick(android.widget.AdapterView, android.view.View, int, long):void");
    }
}
