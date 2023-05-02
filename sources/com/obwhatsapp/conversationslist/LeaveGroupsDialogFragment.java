package com.obwhatsapp.conversationslist;

import X.AnonymousClass11A;
import X.AnonymousClass192;
import X.C14870pt;
import X.C15810rt;
import X.C15860rz;
import X.C15900s5;
import X.C16000sG;
import X.C16030sJ;
import X.C16050sL;
import X.C16070sO;
import X.C16080sP;
import X.C16220sf;
import X.C16320sq;
import X.C17240ul;
import X.C17250um;
import X.C17780vd;
import X.C18260wP;
import X.C18910xS;
import X.C25931Lr;
import android.os.Bundle;
import com.whatsapp.jid.Jid;
import java.util.Set;

public class LeaveGroupsDialogFragment extends Hilt_LeaveGroupsDialogFragment {
    public C14870pt A00;
    public C15900s5 A01;
    public C18260wP A02;
    public C16000sG A03;
    public C16080sP A04;
    public C25931Lr A05;
    public C15860rz A06;
    public C18910xS A07;
    public C15810rt A08;
    public AnonymousClass11A A09;
    public C16070sO A0A;
    public AnonymousClass192 A0B;
    public C17250um A0C;
    public C17240ul A0D;
    public C17780vd A0E;
    public C16220sf A0F;
    public C16320sq A0G;

    public static LeaveGroupsDialogFragment A01(C16050sL r4, String str, Set set, int i2, int i3, boolean z2, boolean z3) {
        LeaveGroupsDialogFragment leaveGroupsDialogFragment = new LeaveGroupsDialogFragment();
        Bundle bundle = new Bundle();
        if (set.size() == 1) {
            bundle.putString("jid", ((Jid) set.toArray()[0]).getRawString());
        } else {
            bundle.putStringArrayList("selection_jids", C16030sJ.A06(set));
        }
        if (r4 != null) {
            bundle.putString("parent_of_last_subgroup_jid", r4.getRawString());
        }
        bundle.putInt("unsent_count", i2);
        bundle.putBoolean("report_upsell", z2);
        bundle.putString("block_spam_flow", str);
        bundle.putInt("leave_group_action", i3);
        bundle.putBoolean("show_neutral_button", z3);
        leaveGroupsDialogFragment.A0T(bundle);
        return leaveGroupsDialogFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0085, code lost:
        if (r2 == null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x008e, code lost:
        if (r0 != false) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0063, code lost:
        if (r2 == null) goto L_0x0065;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x013c  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0214  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Dialog A1B(android.os.Bundle r19) {
        /*
            r18 = this;
            r14 = r18
            android.os.Bundle r1 = r14.A04()
            java.lang.String r0 = "unsent_count"
            r3 = 0
            int r8 = r1.getInt(r0, r3)
            java.lang.String r0 = "jid"
            java.lang.String r2 = r1.getString(r0)
            java.lang.String r0 = "report_upsell"
            boolean r12 = r1.getBoolean(r0, r3)
            java.lang.String r0 = "block_spam_flow"
            java.lang.String r15 = r1.getString(r0)
            java.lang.String r0 = "show_neutral_button"
            r4 = 1
            boolean r11 = r1.getBoolean(r0, r4)
            java.lang.String r0 = "leave_group_action"
            int r17 = r1.getInt(r0, r4)
            java.lang.String r0 = "parent_of_last_subgroup_jid"
            java.lang.String r0 = r1.getString(r0)
            X.0sL r3 = X.C16050sL.A05(r0)
            if (r2 == 0) goto L_0x0187
            java.util.List r1 = java.util.Collections.singletonList(r2)
        L_0x003e:
            java.lang.Class<X.0sL> r0 = X.C16050sL.class
            java.util.List r16 = X.C16030sJ.A08(r0, r1)
            X.0sL r6 = X.C16050sL.A05(r2)
            X.0rv r2 = X.C15830rv.A02(r2)
            int r7 = r16.size()
            boolean r9 = r14.A1O(r2)
            X.192 r0 = r14.A0B
            X.0pd r0 = r0.A02
            r10 = 1597(0x63d, float:2.238E-42)
            X.0tM r1 = X.C16620tM.A02
            boolean r5 = r0.A0E(r1, r10)
            if (r3 == 0) goto L_0x0065
            r0 = 1
            if (r2 != 0) goto L_0x0066
        L_0x0065:
            r0 = 0
        L_0x0066:
            if (r9 != 0) goto L_0x0184
            if (r12 != 0) goto L_0x006e
            if (r5 != 0) goto L_0x006e
            if (r0 == 0) goto L_0x0184
        L_0x006e:
            java.lang.String r7 = r14.A1N(r2, r3, r8, r7)
        L_0x0072:
            int r5 = r16.size()
            boolean r9 = r14.A1O(r2)
            X.192 r0 = r14.A0B
            X.0pd r0 = r0.A02
            boolean r1 = r0.A0E(r1, r10)
            if (r3 == 0) goto L_0x0087
            r0 = 1
            if (r2 != 0) goto L_0x0088
        L_0x0087:
            r0 = 0
        L_0x0088:
            if (r9 != 0) goto L_0x017e
            if (r12 != 0) goto L_0x0163
            if (r1 != 0) goto L_0x0163
            if (r0 == 0) goto L_0x017e
        L_0x0090:
            X.0sG r0 = r14.A03
            X.0sH r1 = r0.A0A(r2)
            X.0sG r0 = r14.A03
            X.0sH r8 = r0.A0A(r3)
            r5 = 2131888269(0x7f12088d, float:1.9411169E38)
            r0 = 2
            java.lang.Object[] r3 = new java.lang.Object[r0]
            X.0sP r0 = r14.A04
            java.lang.String r1 = r0.A08(r1)
            r0 = 0
            r3[r0] = r1
            X.0sP r0 = r14.A04
            java.lang.String r0 = r0.A08(r8)
            r3[r4] = r0
            java.lang.String r5 = r14.A0K(r5, r3)
        L_0x00b7:
            X.00l r0 = r14.A0D()
            X.1fu r3 = new X.1fu
            r3.<init>(r0)
            if (r7 == 0) goto L_0x00cf
            android.content.Context r1 = r14.A02()
            X.0um r0 = r14.A0C
            java.lang.CharSequence r0 = X.AnonymousClass2Sy.A05(r1, r0, r7)
            r3.setTitle(r0)
        L_0x00cf:
            android.content.Context r1 = r14.A02()
            X.0um r0 = r14.A0C
            java.lang.CharSequence r5 = X.AnonymousClass2Sy.A05(r1, r0, r5)
            r13 = 0
            if (r12 == 0) goto L_0x015f
            boolean r0 = r14.A1O(r2)
            if (r0 != 0) goto L_0x015f
            android.content.Context r0 = r14.A0u()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131558960(0x7f0d0230, float:1.874325E38)
            android.view.View r2 = r1.inflate(r0, r13)
            r3.setView(r2)
            r0 = 2131363193(0x7f0a0579, float:1.8346188E38)
            android.view.View r0 = X.C004601z.A0E(r2, r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r0.setText(r5)
            r0 = 2131362735(0x7f0a03af, float:1.8345259E38)
            android.view.View r13 = X.C004601z.A0E(r2, r0)
            android.widget.CheckBox r13 = (android.widget.CheckBox) r13
            r0 = 2131362737(0x7f0a03b1, float:1.8345263E38)
            android.view.View r1 = X.C004601z.A0E(r2, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131891225(0x7f121419, float:1.9417164E38)
            r1.setText(r0)
            r0 = 2131362738(0x7f0a03b2, float:1.8345265E38)
            android.view.View r1 = X.C004601z.A0E(r2, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r0 = 2131891253(0x7f121435, float:1.941722E38)
            r1.setText(r0)
            r0 = 2131362736(0x7f0a03b0, float:1.834526E38)
            android.view.View r2 = X.C004601z.A0E(r2, r0)
            r1 = 0
            com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3 r0 = new com.facebook.redex.ViewOnClickCListenerShape10S0100000_I0_3
            r0.<init>((java.lang.Object) r13, (int) r1)
            r2.setOnClickListener(r0)
        L_0x0137:
            r3.A07(r4)
            if (r11 == 0) goto L_0x01fc
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r16.iterator()
            r2 = 1
        L_0x0146:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0190
            java.lang.Object r1 = r4.next()
            X.0rv r1 = (X.C15830rv) r1
            X.0sf r0 = r14.A0F
            boolean r0 = r0.A0Q(r1)
            r2 = r2 & r0
            if (r0 != 0) goto L_0x0146
            r5.add(r1)
            goto L_0x0146
        L_0x015f:
            r3.A06(r5)
            goto L_0x0137
        L_0x0163:
            if (r0 != 0) goto L_0x0090
            if (r12 == 0) goto L_0x0170
            r0 = 2131888272(0x7f120890, float:1.9411175E38)
            java.lang.String r5 = r14.A0J(r0)
            goto L_0x00b7
        L_0x0170:
            r0 = 2131888274(0x7f120892, float:1.9411179E38)
            if (r5 != r4) goto L_0x0178
            r0 = 2131888273(0x7f120891, float:1.9411177E38)
        L_0x0178:
            java.lang.String r5 = r14.A0J(r0)
            goto L_0x00b7
        L_0x017e:
            java.lang.String r5 = r14.A1N(r2, r3, r8, r5)
            goto L_0x00b7
        L_0x0184:
            r7 = 0
            goto L_0x0072
        L_0x0187:
            java.lang.String r0 = "selection_jids"
            java.util.ArrayList r1 = r1.getStringArrayList(r0)
            goto L_0x003e
        L_0x0190:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            X.1np r1 = new X.1np
            r1.<init>(r0, r5)
            java.lang.Object r0 = r1.A00
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r2 = r0.booleanValue()
            java.lang.Object r4 = r1.A01
            X.0rz r1 = r14.A06
            boolean r0 = r1.A1b()
            if (r0 == 0) goto L_0x022a
            boolean r0 = r1.A1c()
            if (r0 != 0) goto L_0x022a
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r4 = r16.iterator()
            r2 = 1
        L_0x01bb:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01d4
            java.lang.Object r1 = r4.next()
            X.0rv r1 = (X.C15830rv) r1
            X.0rt r0 = r14.A08
            boolean r0 = r0.A0G(r1)
            r2 = r2 & r0
            if (r0 != 0) goto L_0x01bb
            r5.add(r1)
            goto L_0x01bb
        L_0x01d4:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            X.1np r1 = new X.1np
            r1.<init>(r0, r5)
            java.lang.Object r0 = r1.A00
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.Object r5 = r1.A01
            if (r0 != 0) goto L_0x01fc
            boolean r4 = r14.A1O(r6)
            r2 = 2131886333(0x7f1200fd, float:1.9407242E38)
            r0 = 8
            com.facebook.redex.IDxCListenerShape28S0200000_2_I0 r1 = new com.facebook.redex.IDxCListenerShape28S0200000_2_I0
            r1.<init>(r14, r0, r5)
            if (r4 == 0) goto L_0x0235
            r3.setNegativeButton(r2, r1)
        L_0x01fc:
            boolean r0 = r14.A1O(r6)
            r2 = 2131886996(0x7f120394, float:1.9408587E38)
            if (r0 == 0) goto L_0x0214
            r1 = 65
            com.facebook.redex.IDxCListenerShape127S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape127S0100000_2_I0
            r0.<init>(r14, r1)
            r3.setPositiveButton(r2, r0)
        L_0x020f:
            X.02l r0 = r3.create()
            return r0
        L_0x0214:
            r1 = 66
            com.facebook.redex.IDxCListenerShape127S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape127S0100000_2_I0
            r0.<init>(r14, r1)
            r3.setNegativeButton(r2, r0)
            r0 = 2131888257(0x7f120881, float:1.9411144E38)
            X.3C8 r12 = new X.3C8
            r12.<init>(r13, r14, r15, r16, r17)
            r3.setPositiveButton(r0, r12)
            goto L_0x020f
        L_0x022a:
            if (r2 != 0) goto L_0x01fc
            r2 = 2131889570(0x7f120da2, float:1.9413807E38)
            r0 = 7
            com.facebook.redex.IDxCListenerShape28S0200000_2_I0 r1 = new com.facebook.redex.IDxCListenerShape28S0200000_2_I0
            r1.<init>(r14, r0, r4)
        L_0x0235:
            r3.A0B(r1, r2)
            goto L_0x01fc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.conversationslist.LeaveGroupsDialogFragment.A1B(android.os.Bundle):android.app.Dialog");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r8 == null) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A1N(X.C15830rv r8, X.C16050sL r9, int r10, int r11) {
        /*
            r7 = this;
            boolean r0 = r7.A1O(r8)
            if (r0 == 0) goto L_0x001b
            X.0sL r8 = (X.C16050sL) r8
            X.0sO r0 = r7.A0A
            boolean r1 = r0.A0E(r8)
            r0 = 2131887323(0x7f1204db, float:1.940925E38)
            if (r1 == 0) goto L_0x0016
            r0 = 2131887337(0x7f1204e9, float:1.9409278E38)
        L_0x0016:
            java.lang.String r0 = r7.A0J(r0)
        L_0x001a:
            return r0
        L_0x001b:
            if (r9 == 0) goto L_0x0020
            r0 = 1
            if (r8 != 0) goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            r6 = 0
            r5 = 1
            if (r0 == 0) goto L_0x002f
            if (r10 != 0) goto L_0x0088
            r0 = 2131888270(0x7f12088e, float:1.941117E38)
            java.lang.String r0 = r7.A0J(r0)
            return r0
        L_0x002f:
            if (r8 == 0) goto L_0x004b
            X.0sG r0 = r7.A03
            X.0sH r4 = r0.A0A(r8)
            if (r10 != 0) goto L_0x009c
            r2 = 2131888275(0x7f120893, float:1.941118E38)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            X.0sP r0 = r7.A04
            java.lang.String r0 = r0.A08(r4)
            r1[r6] = r0
            java.lang.String r0 = r7.A0K(r2, r1)
            return r0
        L_0x004b:
            android.content.res.Resources r3 = r7.A03()
            r2 = 2131755024(0x7f100010, float:1.9140916E38)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r1[r6] = r0
            java.lang.String r0 = r3.getQuantityString(r2, r11, r1)
            if (r10 <= 0) goto L_0x001a
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = "\n"
            r4.append(r0)
            android.content.res.Resources r3 = r7.A03()
            r2 = 2131755382(0x7f100176, float:1.9141642E38)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r1[r6] = r0
            java.lang.String r0 = r3.getQuantityString(r2, r10, r1)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            return r0
        L_0x0088:
            android.content.res.Resources r3 = r7.A03()
            r2 = 2131755151(0x7f10008f, float:1.9141173E38)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r1[r6] = r0
            java.lang.String r0 = r3.getQuantityString(r2, r10, r1)
            return r0
        L_0x009c:
            android.content.res.Resources r3 = r7.A03()
            r2 = 2131755152(0x7f100090, float:1.9141175E38)
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            X.0sP r0 = r7.A04
            java.lang.String r0 = r0.A08(r4)
            r1[r6] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r10)
            r1[r5] = r0
            java.lang.String r0 = r3.getQuantityString(r2, r10, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.conversationslist.LeaveGroupsDialogFragment.A1N(X.0rv, X.0sL, int, int):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r2 = X.C16050sL.A05(r5.getRawString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A1O(X.C15830rv r5) {
        /*
            r4 = this;
            r3 = 0
            if (r5 == 0) goto L_0x001f
            java.lang.String r0 = r5.getRawString()
            X.0sL r2 = X.C16050sL.A05(r0)
            if (r2 == 0) goto L_0x001f
            X.0rt r0 = r4.A08
            int r1 = r0.A02(r2)
            r0 = 3
            if (r1 != r0) goto L_0x001f
            X.0sO r0 = r4.A0A
            boolean r0 = r0.A0A(r2)
            if (r0 == 0) goto L_0x001f
            r3 = 1
        L_0x001f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.conversationslist.LeaveGroupsDialogFragment.A1O(X.0rv):boolean");
    }
}
