package X;

import android.widget.AbsListView;

/* renamed from: X.3DD  reason: invalid class name */
public class AnonymousClass3DD implements AbsListView.OnScrollListener {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final /* synthetic */ C42821yj A04;

    public AnonymousClass3DD(C42821yj r1) {
        this.A04 = r1;
    }

    public final void A00(int i2, int i3) {
        C16740tZ A05;
        C42821yj r4 = this.A04;
        C48952Qa conversationCursorAdapter = r4.A1n.getConversationCursorAdapter();
        int count = conversationCursorAdapter.getCount();
        while (i2 <= i3) {
            int headerViewsCount = i2 - r4.A1n.getHeaderViewsCount();
            if (headerViewsCount >= 0 && headerViewsCount <= count - 1 && (A05 = conversationCursorAdapter.getItem(headerViewsCount)) != null && A05.A10 == 13) {
                AnonymousClass1yV r0 = r4.A22;
                ((AnonymousClass1yR) r0).A00.A0y.A01(A05.A11);
            }
            i2++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x017d, code lost:
        if (r12.A14 < r4.A14) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0247, code lost:
        if (r2 <= r6) goto L_0x0217;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0252, code lost:
        if (r31 != 0) goto L_0x01ef;
     */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScroll(android.widget.AbsListView r29, int r30, int r31, int r32) {
        /*
            r28 = this;
            r1 = r28
            X.1yj r0 = r1.A04
            com.obwhatsapp.conversation.ConversationListView r2 = r0.A1n
            X.2Qa r3 = r2.getConversationCursorAdapter()
            boolean r2 = r3.A0F
            if (r2 == 0) goto L_0x025a
            com.obwhatsapp.conversation.ConversationListView r4 = r0.A1n
            r2 = r30
            r8 = r31
            r4.A06(r2, r8)
            int r18 = r3.getCount()
            com.obwhatsapp.conversation.ConversationListView r4 = r0.A1n
            int r14 = r4.getAdjustedVisibleItemCount()
            int r14 = r14 + r31
            int r14 = r14 + r30
            com.obwhatsapp.conversation.ConversationListView r4 = r0.A1n
            int r13 = r4.getHeaderViewsCount()
            int r13 = r13 + r18
            r4 = 100
            r7 = 1065353216(0x3f800000, float:1.0)
            r6 = 0
            r9 = 0
            r10 = 1
            X.1j5 r11 = r0.A47
            int r12 = r11.A01()
            if (r14 < r13) goto L_0x00d1
            if (r12 != 0) goto L_0x007d
            r21 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r11 = new android.view.animation.ScaleAnimation
            r22 = 1065353216(0x3f800000, float:1.0)
            r23 = 1056964608(0x3f000000, float:0.5)
            r24 = 1
            r25 = 1056964608(0x3f000000, float:0.5)
            r26 = 1
            r27 = 1056964608(0x3f000000, float:0.5)
            r20 = 1065353216(0x3f800000, float:1.0)
            r19 = r11
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            android.view.animation.AlphaAnimation r12 = new android.view.animation.AlphaAnimation
            r12.<init>(r7, r6)
            android.view.animation.AnimationSet r6 = new android.view.animation.AnimationSet
            r6.<init>(r10)
            r6.addAnimation(r11)
            r6.addAnimation(r12)
            r6.setDuration(r4)
            X.1j5 r4 = r0.A47
            android.view.View r4 = r4.A02()
            r4.startAnimation(r6)
            com.obwhatsapp.conversation.ConversationListView r6 = r0.A1n
            r5 = 10
            com.facebook.redex.RunnableRunnableShape18S0100000_I1_1 r4 = new com.facebook.redex.RunnableRunnableShape18S0100000_I1_1
            r4.<init>((java.lang.Object) r1, (int) r5)
            r6.post(r4)
        L_0x007d:
            X.1kZ r4 = r0.A2C
            r4.A04 = r9
            android.widget.TextView r5 = r0.A0X
            if (r5 == 0) goto L_0x008a
            r4 = 8
            r5.setVisibility(r4)
        L_0x008a:
            X.1kZ r4 = r0.A2C
            java.util.ArrayList r4 = r4.A0w
            boolean r4 = r4.isEmpty()
            r4 = r4 ^ 1
            if (r4 == 0) goto L_0x0128
            com.obwhatsapp.conversation.ConversationListView r4 = r0.A1n
            int r4 = r4.getHeaderViewsCount()
            int r5 = r30 - r4
            int r5 = r5 + r31
            int r5 = r5 - r10
            int r4 = r1.A02
            if (r4 == r5) goto L_0x0128
            if (r5 < 0) goto L_0x0128
            r1.A02 = r5
            X.1kZ r13 = r0.A2C
            X.0tZ r15 = r3.getItem(r5)
            if (r15 == 0) goto L_0x0116
            java.util.ArrayList r14 = X.AnonymousClass000.A0u()
            java.util.ArrayList r12 = r13.A0w
            java.util.Iterator r17 = r12.iterator()
        L_0x00bb:
            boolean r4 = r17.hasNext()
            if (r4 == 0) goto L_0x011c
            X.0tZ r11 = X.C13680ns.A0V(r17)
            long r6 = r11.A14
            long r4 = r15.A14
            int r16 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r16 > 0) goto L_0x00bb
            r14.add(r11)
            goto L_0x00bb
        L_0x00d1:
            r11 = 8
            if (r12 != r11) goto L_0x008a
            X.1j5 r11 = r0.A47
            r11.A03(r9)
            X.1kZ r11 = r0.A2C
            r11.A03 = r9
            r0.A0o(r9)
            r20 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r11 = new android.view.animation.ScaleAnimation
            r21 = 1065353216(0x3f800000, float:1.0)
            r22 = 1056964608(0x3f000000, float:0.5)
            r23 = 1065353216(0x3f800000, float:1.0)
            r24 = 1
            r25 = 1056964608(0x3f000000, float:0.5)
            r26 = 1
            r27 = 1056964608(0x3f000000, float:0.5)
            r19 = r11
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            android.view.animation.AlphaAnimation r12 = new android.view.animation.AlphaAnimation
            r12.<init>(r6, r7)
            android.view.animation.AnimationSet r6 = new android.view.animation.AnimationSet
            r6.<init>(r10)
            r6.addAnimation(r11)
            r6.addAnimation(r12)
            r6.setDuration(r4)
            X.1j5 r4 = r0.A47
            android.view.View r4 = r4.A02()
            r4.startAnimation(r6)
            goto L_0x008a
        L_0x0116:
            java.util.ArrayList r4 = r13.A0w
            r4.clear()
            goto L_0x0125
        L_0x011c:
            boolean r4 = r14.isEmpty()
            if (r4 != 0) goto L_0x0125
            r12.removeAll(r14)
        L_0x0125:
            r13.A0E()
        L_0x0128:
            int r4 = r0.A00
            if (r4 != 0) goto L_0x017f
            java.util.Stack r11 = r0.A5J
            boolean r4 = r11.isEmpty()
            if (r4 != 0) goto L_0x017f
            java.lang.Object r4 = r11.peek()
            X.4KS r4 = (X.AnonymousClass4KS) r4
            X.0tZ r12 = r4.A01
            com.obwhatsapp.conversation.ConversationListView r4 = r0.A1n
            int r4 = r4.getHeaderViewsCount()
            int r5 = r30 - r4
            int r5 = r5 + r31
            int r5 = r5 - r10
            int r4 = r3.A01()
            if (r5 != r4) goto L_0x014f
            int r5 = r5 + -1
        L_0x014f:
            if (r5 < 0) goto L_0x0255
            X.0tZ r4 = r3.getItem(r5)
            if (r4 == 0) goto L_0x0255
            long r6 = r12.A14
            long r4 = r4.A14
            int r13 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r13 > 0) goto L_0x0255
            com.obwhatsapp.conversation.ConversationListView r4 = r0.A1n
            int r4 = r4.getHeaderViewsCount()
            int r5 = r30 - r4
            int r4 = r3.A01()
            if (r5 != r4) goto L_0x016f
            int r5 = r5 + 1
        L_0x016f:
            if (r5 < 0) goto L_0x017f
            X.0tZ r4 = r3.getItem(r5)
            if (r4 == 0) goto L_0x0255
            long r6 = r12.A14
            long r4 = r4.A14
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 < 0) goto L_0x0255
        L_0x017f:
            int r4 = r0.A00
            if (r4 == 0) goto L_0x0252
            int r4 = r1.A01
            if (r4 == r2) goto L_0x0252
            if (r31 == 0) goto L_0x0217
            com.obwhatsapp.conversation.ConversationListView r4 = r0.A1n
            int r4 = r4.getHeaderViewsCount()
            int r4 = r30 - r4
            if (r4 < 0) goto L_0x024a
            X.0tZ r7 = r3.getItem(r4)
            if (r7 == 0) goto L_0x024a
            long r5 = r7.A0I
            long r3 = java.lang.System.currentTimeMillis()
            boolean r3 = X.C42681yF.A0A(r5, r3)
            if (r3 != 0) goto L_0x024a
            X.1j5 r3 = r0.A44
            android.view.View r5 = r3.A02()
            android.widget.TextView r5 = (android.widget.TextView) r5
            X.013 r6 = r0.A2L
            long r3 = r7.A0I
            java.lang.String r3 = X.C28961Zl.A09(r6, r3)
            r5.setText(r3)
            X.1Lh r4 = r0.A1k
            X.1yV r3 = r0.A22
            android.content.res.Resources r3 = r3.getResources()
            float r3 = r4.A00(r3)
            r5.setTextSize(r3)
            int r3 = r5.getVisibility()
            if (r3 == 0) goto L_0x01ef
            r5.setVisibility(r9)
            r21 = 0
            r25 = -1082130432(0xffffffffbf800000, float:-1.0)
            android.view.animation.TranslateAnimation r6 = new android.view.animation.TranslateAnimation
            r20 = 1
            r22 = 1
            r23 = 0
            r24 = 1
            r26 = 1
            r27 = 0
            r19 = r6
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            r3 = 200(0xc8, double:9.9E-322)
            r6.setDuration(r3)
            r5.startAnimation(r6)
        L_0x01ef:
            int r6 = r1.A03
            if (r6 == 0) goto L_0x0217
            int r5 = r1.A01
            int r4 = r1.A00
            if (r4 != 0) goto L_0x01fe
            r3 = r18
            r1.A00 = r3
            r4 = r3
        L_0x01fe:
            r3 = r18
            if (r4 >= r3) goto L_0x0209
            int r3 = r18 - r4
            int r5 = r5 + r3
            r3 = r18
            r1.A00 = r3
        L_0x0209:
            int r3 = r30 + r31
            int r3 = r3 - r10
            int r6 = r6 + r5
            int r6 = r6 - r10
            if (r5 >= r2) goto L_0x023b
            if (r2 > r6) goto L_0x023b
            int r6 = r30 + -1
        L_0x0214:
            r1.A00(r5, r6)
        L_0x0217:
            int r3 = r1.A01
            if (r3 == r2) goto L_0x0225
            int r3 = r0.A00
            if (r3 == 0) goto L_0x0225
            long r3 = java.lang.System.currentTimeMillis()
            X.AnonymousClass2S0.A00 = r3
        L_0x0225:
            r1.A01 = r2
            r1.A03 = r8
            r3 = 100
            r1 = r18
            int r1 = java.lang.Math.min(r3, r1)
            int r1 = r1 >> 1
            if (r2 >= r1) goto L_0x025a
            X.1kZ r0 = r0.A2C
            r0.A0B()
            return
        L_0x023b:
            if (r3 >= r6) goto L_0x0245
            if (r5 > r3) goto L_0x0245
            int r3 = r3 + 1
            r1.A00(r3, r6)
            goto L_0x0217
        L_0x0245:
            if (r3 < r5) goto L_0x0214
            if (r2 <= r6) goto L_0x0217
            goto L_0x0214
        L_0x024a:
            X.1j5 r4 = r0.A44
            r3 = 8
            r4.A03(r3)
            goto L_0x01ef
        L_0x0252:
            if (r31 == 0) goto L_0x0217
            goto L_0x01ef
        L_0x0255:
            r11.clear()
            goto L_0x017f
        L_0x025a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3DD.onScroll(android.widget.AbsListView, int, int, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007d, code lost:
        if (X.C89674ci.A00 != false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007f, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0084, code lost:
        if (r2 >= r3.getChildCount()) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        r1 = r3.getChildAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008c, code lost:
        if ((r1 instanceof X.AnonymousClass5QU) == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008e, code lost:
        ((X.AnonymousClass5QU) r1).Ag4();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0093, code lost:
        r2 = r2 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScrollStateChanged(android.widget.AbsListView r10, int r11) {
        /*
            r9 = this;
            r1 = 1
            if (r11 == 0) goto L_0x0023
            if (r11 != r1) goto L_0x000c
            X.1yj r0 = r9.A04
            X.1Gv r0 = r0.A3S
            r0.A01(r1)
        L_0x000c:
            X.1yj r4 = r9.A04
            android.os.Handler r1 = r4.A4o
            java.lang.Runnable r0 = r4.A5E
            r1.removeCallbacks(r0)
        L_0x0015:
            r4.A00 = r11
            if (r11 == 0) goto L_0x0020
            long r0 = java.lang.System.currentTimeMillis()
        L_0x001d:
            X.AnonymousClass2S0.A00 = r0
            return
        L_0x0020:
            r0 = 0
            goto L_0x001d
        L_0x0023:
            X.1yj r4 = r9.A04
            X.1Gv r0 = r4.A3S
            r0.A00()
            com.obwhatsapp.conversation.ConversationListView r3 = r4.A1n
            X.2DF r0 = X.C14530pL.A0K(r4)
            java.util.HashSet r8 = r0.A0w
            X.2Qa r0 = r3.getConversationCursorAdapter()
            if (r0 == 0) goto L_0x0099
            X.2Qa r0 = r3.getConversationCursorAdapter()
            android.database.Cursor r0 = r0.getCursor()
            if (r0 == 0) goto L_0x0099
            int r7 = r3.getChildCount()
            r6 = 0
        L_0x0047:
            if (r6 >= r7) goto L_0x007f
            android.view.View r1 = r3.getChildAt(r6)
            boolean r0 = r1 instanceof X.AnonymousClass5QU
            if (r0 == 0) goto L_0x0096
            boolean r0 = r1 instanceof X.C30011bb
            if (r0 == 0) goto L_0x0096
            X.5QU r1 = (X.AnonymousClass5QU) r1
            X.1bd r1 = (X.C30031bd) r1
            X.0tZ r5 = r1.getFMessage()
            X.1Vw r0 = r5.A11
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L_0x0096
            X.2Qa r2 = r3.getConversationCursorAdapter()
            int r1 = r2.A03(r5)
            int r0 = r2.A01()
            if (r1 > r0) goto L_0x007b
            X.1kb r0 = r2.A08
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x0096
        L_0x007b:
            boolean r0 = X.C89674ci.A00
            if (r0 == 0) goto L_0x0099
        L_0x007f:
            r2 = 0
        L_0x0080:
            int r0 = r3.getChildCount()
            if (r2 >= r0) goto L_0x0099
            android.view.View r1 = r3.getChildAt(r2)
            boolean r0 = r1 instanceof X.AnonymousClass5QU
            if (r0 == 0) goto L_0x0093
            X.5QU r1 = (X.AnonymousClass5QU) r1
            r1.Ag4()
        L_0x0093:
            int r2 = r2 + 1
            goto L_0x0080
        L_0x0096:
            int r6 = r6 + 1
            goto L_0x0047
        L_0x0099:
            android.os.Handler r3 = r4.A4o
            java.lang.Runnable r2 = r4.A5E
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r2, r0)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3DD.onScrollStateChanged(android.widget.AbsListView, int):void");
    }
}
