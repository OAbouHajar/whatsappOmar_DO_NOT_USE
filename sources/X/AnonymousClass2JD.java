package X;

import android.text.TextUtils;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.obwhatsapp.conversationslist.ConversationsFragment;
import java.util.ArrayList;

/* renamed from: X.2JD  reason: invalid class name */
public class AnonymousClass2JD extends BaseAdapter implements Filterable {
    public AnonymousClass2c9 A00 = new AnonymousClass2c9();
    public String A01;
    public ArrayList A02 = new ArrayList();
    public final Filter A03 = new C56812oY(this);
    public final C16000sG A04;
    public final AnonymousClass5PS A05;
    public final AnonymousClass013 A06;
    public final C16220sf A07;
    public final /* synthetic */ ConversationsFragment A08;

    public AnonymousClass2JD(C16000sG r2, ConversationsFragment conversationsFragment, AnonymousClass5PS r4, AnonymousClass013 r5, C16220sf r6) {
        this.A08 = conversationsFragment;
        this.A04 = r2;
        this.A06 = r5;
        this.A07 = r6;
        this.A05 = r4;
    }

    public int getCount() {
        return this.A08.A2P.size();
    }

    public Filter getFilter() {
        return this.A03;
    }

    public /* bridge */ /* synthetic */ Object getItem(int i2) {
        return this.A08.A2P.get(i2);
    }

    public long getItemId(int i2) {
        return (long) this.A08.A2P.get(i2).hashCode();
    }

    public int getItemViewType(int i2) {
        return this.A08.A2P.get(i2) instanceof C101644xe ? 1 : 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x014e, code lost:
        if (r2.equals(r6.A01) == false) goto L_0x0150;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0177, code lost:
        if (r3.A0E(X.C16620tM.A02, 442) != false) goto L_0x0179;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r61, android.view.View r62, android.view.ViewGroup r63) {
        /*
            r60 = this;
            r11 = r63
            r7 = r62
            if (r63 == 0) goto L_0x01b2
            r6 = r60
            com.obwhatsapp.conversationslist.ConversationsFragment r9 = r6.A08
            java.util.ArrayList r0 = r9.A2P
            r8 = r61
            java.lang.Object r5 = r0.get(r8)
            X.2Wp r5 = (X.C49902Wp) r5
            if (r5 == 0) goto L_0x01ac
            if (r62 == 0) goto L_0x0031
            java.lang.Object r0 = r7.getTag()
            boolean r0 = r0 instanceof com.obwhatsapp.conversationslist.ViewHolder
            if (r0 == 0) goto L_0x0031
            java.lang.Object r1 = r7.getTag()
            com.obwhatsapp.conversationslist.ViewHolder r1 = (com.obwhatsapp.conversationslist.ViewHolder) r1
            X.2Wp r0 = r1.A02
            boolean r0 = X.C34901l3.A00(r0, r5)
            if (r0 != 0) goto L_0x0031
            r1.A0D()
        L_0x0031:
            boolean r0 = r5 instanceof X.C101644xe
            r2 = 0
            if (r0 == 0) goto L_0x0062
            if (r62 != 0) goto L_0x0047
            X.00l r0 = r9.A0D()
            android.view.LayoutInflater r1 = r0.getLayoutInflater()
            r0 = 2131559320(0x7f0d0398, float:1.874398E38)
            android.view.View r7 = r1.inflate(r0, r11, r2)
        L_0x0047:
            r0 = 2131366639(0x7f0a12ef, float:1.8353177E38)
            android.view.View r1 = r7.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            X.AnonymousClass1UP.A06(r1)
            X.4xe r5 = (X.C101644xe) r5
            java.lang.String r0 = r5.A00
            r1.setText(r0)
            X.5PS r0 = r6.A05
            if (r0 == 0) goto L_0x0061
            r0.AWf(r8)
        L_0x0061:
            return r7
        L_0x0062:
            if (r62 != 0) goto L_0x01a5
            boolean r0 = r9.A2W
            r1 = 2131558898(0x7f0d01f2, float:1.8743125E38)
            if (r0 == 0) goto L_0x0072
            r1 = 2131558899(0x7f0d01f3, float:1.8743127E38)
            int r1 = com.obwhatsapp.yo.HomeUI.isSwiRow(r1)
        L_0x0072:
            android.content.Context r0 = r11.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.view.View r7 = r0.inflate(r1, r11, r2)
            android.content.Context r17 = r11.getContext()
            X.0tz r0 = r9.A1H
            r34 = r0
            X.0t3 r0 = r9.A1G
            r33 = r0
            X.0pd r0 = r9.A1e
            r44 = r0
            X.0zK r0 = r9.A1q
            r47 = r0
            X.0sK r0 = r9.A0P
            r59 = r0
            X.0sq r0 = r9.A2M
            r54 = r0
            X.0rt r0 = r9.A1M
            r37 = r0
            X.0s5 r0 = r9.A0Q
            r58 = r0
            X.0zl r0 = r9.A1f
            r45 = r0
            X.15p r0 = r9.A20
            r50 = r0
            X.0ud r0 = r9.A0o
            r57 = r0
            X.0sG r0 = r6.A04
            r56 = r0
            X.1Kx r0 = r9.A0J
            r55 = r0
            X.0wt r0 = r9.A1P
            r38 = r0
            X.0sP r0 = r9.A0r
            r27 = r0
            X.013 r0 = r6.A06
            r26 = r0
            X.0wS r0 = r9.A1y
            r25 = r0
            X.01Y r0 = r9.A0d
            r24 = r0
            X.0ul r0 = r9.A1h
            r23 = r0
            X.0yz r0 = r9.A1V
            r22 = r0
            X.1Lc r0 = r9.A29
            r21 = r0
            X.0sf r0 = r6.A07
            r20 = r0
            X.15G r0 = r9.A1Z
            r19 = r0
            X.15X r0 = r9.A1b
            r18 = r0
            X.0rz r0 = r9.A1J
            r16 = r0
            X.0uk r15 = r9.A0i
            X.195 r14 = r9.A1T
            X.0w8 r13 = r9.A1x
            X.15Z r12 = r9.A0R
            r53 = 0
            X.2Ao r10 = r9.A0t
            X.4Qo r4 = r9.A14
            X.0yf r3 = r9.A1c
            X.0uc r2 = r9.A0Z
            X.1PL r1 = r9.A1A
            com.obwhatsapp.conversationslist.ViewHolder r0 = new com.obwhatsapp.conversationslist.ViewHolder
            r28 = r27
            r29 = r10
            r30 = r4
            r31 = r9
            r32 = r1
            r35 = r16
            r36 = r26
            r39 = r14
            r40 = r22
            r41 = r19
            r42 = r18
            r43 = r3
            r46 = r23
            r48 = r13
            r49 = r25
            r51 = r20
            r52 = r21
            r16 = r0
            r18 = r7
            r19 = r55
            r20 = r59
            r21 = r58
            r22 = r12
            r23 = r2
            r25 = r15
            r26 = r57
            r27 = r56
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
        L_0x0135:
            r7.setTag(r0)
            X.04p r1 = r9.A0K
            r1.A00(r0)
            X.0rv r1 = r5.ACx()
            java.lang.String r2 = X.C16030sJ.A03(r1)
            if (r2 == 0) goto L_0x0150
            java.lang.String r1 = r6.A01
            boolean r1 = r2.equals(r1)
            r3 = 1
            if (r1 != 0) goto L_0x0151
        L_0x0150:
            r3 = 0
        L_0x0151:
            android.view.View r2 = r0.A04
            r1 = 8
            if (r3 == 0) goto L_0x0158
            r1 = 0
        L_0x0158:
            r2.setVisibility(r1)
            com.obwhatsapp.status.viewmodels.StatusesViewModel r2 = r9.A2D
            if (r2 != 0) goto L_0x0198
            r14 = 0
        L_0x0160:
            X.0pd r3 = r9.A1e
            r9.A19()
            android.widget.ListView r1 = r9.A04
            int r1 = r1.getFirstVisiblePosition()
            if (r1 != 0) goto L_0x0179
            r2 = 442(0x1ba, float:6.2E-43)
            X.0tM r1 = X.C16620tM.A02
            boolean r1 = r3.A0E(r1, r2)
            r17 = 1
            if (r1 == 0) goto L_0x017b
        L_0x0179:
            r17 = 0
        L_0x017b:
            android.content.Context r11 = r11.getContext()
            X.00l r10 = r9.A0C()
            boolean r1 = r9 instanceof com.obwhatsapp.conversationslist.ArchivedConversationsFragment
            if (r1 == 0) goto L_0x0196
            r15 = 2
        L_0x0188:
            X.5PS r1 = r6.A05
            r9 = r0
            r12 = r5
            r13 = r1
            r16 = r8
            r9.A0E(r10, r11, r12, r13, r14, r15, r16, r17)
            com.obwhatsapp.conversationslist.ConversationsFragment.A03(r7)
            return r7
        L_0x0196:
            r15 = 1
            goto L_0x0188
        L_0x0198:
            X.0rv r1 = r5.ACx()
            com.whatsapp.jid.UserJid r1 = com.whatsapp.jid.UserJid.of(r1)
            X.2XQ r14 = r2.A05(r1)
            goto L_0x0160
        L_0x01a5:
            java.lang.Object r0 = r7.getTag()
            com.obwhatsapp.conversationslist.ViewHolder r0 = (com.obwhatsapp.conversationslist.ViewHolder) r0
            goto L_0x0135
        L_0x01ac:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x01b2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2JD.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        return 2;
    }

    public boolean hasStableIds() {
        return true;
    }

    public boolean isEmpty() {
        if (super.isEmpty()) {
            return this.A08.A00 == 0 || !TextUtils.isEmpty(this.A00.A01);
        }
        return false;
    }
}
