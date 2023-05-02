package X;

import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import com.obwhatsapp.calling.callhistory.CallsHistoryFragment;

/* renamed from: X.1fq  reason: invalid class name and case insensitive filesystem */
public class C32221fq extends BaseAdapter implements Filterable {
    public Filter A00;
    public final /* synthetic */ CallsHistoryFragment A01;

    public C32221fq(CallsHistoryFragment callsHistoryFragment) {
        this.A01 = callsHistoryFragment;
    }

    public int getCount() {
        return this.A01.A0g.size();
    }

    public Filter getFilter() {
        Filter filter = this.A00;
        if (filter != null) {
            return filter;
        }
        C32231fr r1 = new C32231fr(this.A01);
        this.A00 = r1;
        return r1;
    }

    public /* bridge */ /* synthetic */ Object getItem(int i2) {
        return this.A01.A0g.get(i2);
    }

    public long getItemId(int i2) {
        return (long) this.A01.A0g.get(i2).hashCode();
    }

    public int getItemViewType(int i2) {
        return ((C109275Rk) this.A01.A0g.get(i2)).ACu();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: X.4QA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: X.4QA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: X.2zK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: X.4QA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v13, resolved type: X.4QA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: X.2zK} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v4, resolved type: X.2zK} */
    /* JADX WARNING: type inference failed for: r13v5, types: [X.2zL] */
    /* JADX WARNING: type inference failed for: r12v4, types: [X.2zJ] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r31, android.view.View r32, android.view.ViewGroup r33) {
        /*
            r30 = this;
            r2 = r32
            r11 = r30
            com.obwhatsapp.calling.callhistory.CallsHistoryFragment r9 = r11.A01
            java.util.ArrayList r0 = r9.A0g
            r5 = r31
            java.lang.Object r4 = r0.get(r5)
            X.5Rk r4 = (X.C109275Rk) r4
            int r8 = r4.ACu()
            r3 = 0
            r6 = r33
            if (r8 == 0) goto L_0x0146
            r7 = 1
            if (r8 == r7) goto L_0x00af
            r0 = 2
            if (r8 == r0) goto L_0x00af
            if (r32 != 0) goto L_0x00a8
            android.view.LayoutInflater r1 = r9.A05()
            r0 = 2131559285(0x7f0d0375, float:1.874391E38)
            android.view.View r2 = r1.inflate(r0, r6, r3)
            X.0s5 r0 = r9.A07
            r19 = r0
            X.14s r15 = r9.A0a
            X.10c r14 = r9.A0D
            X.013 r13 = r9.A0S
            X.0sG r12 = r9.A0J
            X.0sP r10 = r9.A0L
            X.0ul r7 = r9.A0X
            X.1Lc r6 = r9.A0Z
            X.2Ao r3 = r9.A0M
            X.2Ao r1 = r9.A0N
            X.0sK r0 = r9.A06
            X.2zK r8 = new X.2zK
            r16 = r8
            r17 = r2
            r18 = r0
            r20 = r9
            r21 = r14
            r22 = r12
            r23 = r10
            r24 = r3
            r25 = r1
            r26 = r13
            r27 = r7
            r28 = r6
            r29 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r2.setTag(r8)
        L_0x0066:
            r8.A00 = r4
            int r1 = r31 + 1
            int r0 = r11.getCount()
            if (r1 >= r0) goto L_0x00a4
            java.util.ArrayList r0 = r9.A0g
            java.lang.Object r0 = r0.get(r1)
            X.5Rk r0 = (X.C109275Rk) r0
            if (r0 == 0) goto L_0x00a4
            int r1 = r0.ACu()
            r0 = 3
            if (r1 != r0) goto L_0x00a4
            android.content.res.Resources r1 = r9.A03()
            r0 = 2131166390(0x7f0704b6, float:1.7947024E38)
            int r15 = r1.getDimensionPixelSize(r0)
            r0 = 2131362527(0x7f0a02df, float:1.8344837E38)
            android.view.View r10 = X.C004601z.A0E(r2, r0)
            android.view.ViewGroup$LayoutParams r0 = r10.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            X.013 r11 = r9.A0S
            int r12 = r0.leftMargin
            int r13 = r0.topMargin
            int r14 = r0.rightMargin
            X.C45902Bo.A09(r10, r11, r12, r13, r14, r15)
        L_0x00a4:
            r8.A00(r5)
            return r2
        L_0x00a8:
            java.lang.Object r8 = r2.getTag()
            X.4QA r8 = (X.AnonymousClass4QA) r8
            goto L_0x0066
        L_0x00af:
            if (r32 != 0) goto L_0x013f
            X.0pd r2 = r9.A0W
            r1 = 367(0x16f, float:5.14E-43)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            r1 = 2131558624(0x7f0d00e0, float:1.874257E38)
            if (r0 == 0) goto L_0x00c3
            r1 = 2131558623(0x7f0d00df, float:1.8742567E38)
        L_0x00c3:
            android.view.LayoutInflater r0 = r9.A05()
            android.view.View r2 = r0.inflate(r1, r6, r3)
            if (r8 != r7) goto L_0x00fb
            X.10c r10 = r9.A0D
            X.0sG r7 = r9.A0J
            X.013 r6 = r9.A0S
            X.0sP r3 = r9.A0L
            X.1Lc r1 = r9.A0Z
            X.2Ao r0 = r9.A0N
            X.2zJ r8 = new X.2zJ
            r12 = r8
            r13 = r2
            r14 = r9
            r15 = r10
            r16 = r7
            r17 = r3
            r18 = r0
            r19 = r6
            r20 = r1
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x00ec:
            r2.setTag(r8)
        L_0x00ef:
            r1 = 0
            com.facebook.redex.IDxDCompatShape3S0200000_2_I0 r0 = new com.facebook.redex.IDxDCompatShape3S0200000_2_I0
            r0.<init>(r4, r1, r11)
            X.C004601z.A0j(r2, r0)
            r8.A00 = r4
            goto L_0x00a4
        L_0x00fb:
            X.0t3 r0 = r9.A0R
            r18 = r0
            X.0pd r0 = r9.A0W
            r17 = r0
            X.0s5 r0 = r9.A07
            r16 = r0
            X.14s r15 = r9.A0a
            X.10c r14 = r9.A0D
            X.0sG r13 = r9.A0J
            X.01V r12 = r9.A0Q
            X.0sP r10 = r9.A0L
            X.013 r7 = r9.A0S
            X.0ul r6 = r9.A0X
            X.1Lc r3 = r9.A0Z
            X.2Ao r1 = r9.A0N
            X.2Ao r0 = r9.A0M
            X.2zL r8 = new X.2zL
            r22 = r12
            r23 = r18
            r24 = r7
            r25 = r17
            r26 = r6
            r27 = r3
            r28 = r15
            r15 = r16
            r16 = r9
            r17 = r14
            r18 = r13
            r19 = r10
            r20 = r1
            r21 = r0
            r13 = r8
            r14 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            goto L_0x00ec
        L_0x013f:
            java.lang.Object r8 = r2.getTag()
            X.4QA r8 = (X.AnonymousClass4QA) r8
            goto L_0x00ef
        L_0x0146:
            if (r32 != 0) goto L_0x0156
            android.view.LayoutInflater r1 = r9.A05()
            r0 = 2131558625(0x7f0d00e1, float:1.8742571E38)
            android.view.View r2 = r1.inflate(r0, r6, r3)
            r2.setEnabled(r3)
        L_0x0156:
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            android.widget.AbsListView$LayoutParams r1 = (android.widget.AbsListView.LayoutParams) r1
            X.4wf r4 = (X.C101074wf) r4
            r0 = -1
            r1.height = r0
            r2.setLayoutParams(r1)
            r0 = 2131366639(0x7f0a12ef, float:1.8353177E38)
            android.view.View r1 = r2.findViewById(r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            X.AnonymousClass1UP.A06(r1)
            com.obwhatsapp.youbasha.others.statusViewSeparator(r2, r1)
            java.lang.String r0 = r4.A00
            r1.setText(r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32221fq.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public int getViewTypeCount() {
        return 4;
    }

    public boolean hasStableIds() {
        return true;
    }

    public boolean isEmpty() {
        return false;
    }
}
