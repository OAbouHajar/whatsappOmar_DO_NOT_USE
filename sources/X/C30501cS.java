package X;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.conversation.viewmodel.ConversationTitleViewModel;

/* renamed from: X.1cS  reason: invalid class name and case insensitive filesystem */
public class C30501cS extends C30511cT {
    public long A00;
    public Handler A01;
    public Handler A02;
    public ConversationTitleViewModel A03;
    public Runnable A04;
    public Runnable A05;
    public boolean A06;
    public final C16040sK A07;
    public final C16440t3 A08;
    public final C15810rt A09;
    public final C20260zl A0A;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C30501cS(X.C000900k r26, X.C25731Kx r27, X.C14870pt r28, X.C16040sK r29, X.C54602hp r30, X.AnonymousClass13V r31, X.AnonymousClass127 r32, X.C17160ud r33, X.C17140ub r34, X.C16080sP r35, X.AnonymousClass152 r36, X.C16440t3 r37, X.AnonymousClass013 r38, X.C20070zS r39, X.C15810rt r40, X.C216114t r41, X.C16010sH r42, X.C17250um r43, X.C14710pd r44, X.C20260zl r45, X.C17240ul r46, X.AnonymousClass18R r47, X.C15830rv r48, X.C25781Lc r49, X.C16320sq r50) {
        /*
            r25 = this;
            r12 = r36
            r11 = r35
            r10 = r34
            r9 = r33
            r8 = r32
            r7 = r31
            r6 = r30
            r5 = r29
            r4 = r28
            r3 = r27
            r2 = r26
            r1 = r25
            r24 = r50
            r23 = r49
            r22 = r48
            r21 = r47
            r20 = r46
            r19 = r44
            r18 = r43
            r17 = r42
            r16 = r41
            r15 = r40
            r14 = r39
            r13 = r38
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r0 = r37
            r1.A08 = r0
            r1.A07 = r5
            r1.A09 = r15
            r0 = r45
            r1.A0A = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30501cS.<init>(X.00k, X.1Kx, X.0pt, X.0sK, X.2hp, X.13V, X.127, X.0ud, X.0ub, X.0sP, X.152, X.0t3, X.013, X.0zS, X.0rt, X.14t, X.0sH, X.0um, X.0pd, X.0zl, X.0ul, X.18R, X.0rv, X.1Lc, X.0sq):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0077, code lost:
        if (r9 >= r6) goto L_0x0079;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.util.Pair A0A() {
        /*
            r11 = this;
            long r9 = java.lang.System.currentTimeMillis()
            r0 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r0 = 0
            android.util.Pair r5 = new android.util.Pair
            r5.<init>(r2, r0)
            java.lang.Object r0 = r5.second
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = X.AnonymousClass1ZW.A0E(r0)
            r8 = r0 ^ 1
            r6 = 5000(0x1388, double:2.4703E-320)
            if (r8 == 0) goto L_0x0025
            long r0 = r11.A00
            long r3 = r9 - r0
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x009f
        L_0x0025:
            X.0zl r0 = r11.A0A
            X.0rv r1 = r11.A0h
            boolean r0 = X.C40561uK.A01(r0, r1)
            if (r0 != 0) goto L_0x008c
            X.0pd r0 = r11.A0d
            boolean r0 = X.C40571uL.A00(r0, r1)
            if (r0 != 0) goto L_0x008c
            X.0sH r0 = r11.A0G
            boolean r0 = r0.A0H()
            r1 = 0
            if (r0 == 0) goto L_0x0052
            r0 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.00k r0 = r11.A0K
            android.content.Context r1 = r0.getApplicationContext()
            r0 = 2131887548(0x7f1205bc, float:1.9409706E38)
            java.lang.String r1 = r1.getString(r0)
        L_0x0052:
            android.util.Pair r5 = new android.util.Pair
            r5.<init>(r2, r1)
            java.lang.Object r0 = r5.second
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = X.AnonymousClass1ZW.A0E(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r5.first
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            r0 = 2
            if (r1 == r0) goto L_0x009f
            long r0 = r11.A00
            long r9 = r9 - r0
            if (r8 == 0) goto L_0x0075
            r6 = 10000(0x2710, double:4.9407E-320)
        L_0x0075:
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 < 0) goto L_0x009f
        L_0x0079:
            r0 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.1Kx r1 = r11.A0L
            X.0sH r0 = r11.A0G
            java.lang.String r1 = r1.A00(r0)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r2, r1)
            return r0
        L_0x008c:
            r0 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            X.00k r0 = r11.A0K
            android.content.Context r1 = r0.getApplicationContext()
            r0 = 2131893040(0x7f121b30, float:1.9420845E38)
            java.lang.String r1 = X.C34811ku.A05(r1, r0)
            goto L_0x0052
        L_0x009f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30501cS.A0A():android.util.Pair");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0014, code lost:
        if (r0 <= 0) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B() {
        /*
            r3 = this;
            X.0sH r1 = r3.A0G
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r1.A08(r0)
            X.0rv r1 = (X.C15830rv) r1
            r2 = 0
            if (r1 == 0) goto L_0x0016
            X.0rt r0 = r3.A09
            int r0 = r0.A01(r1)
            r1 = 1
            if (r0 > 0) goto L_0x0017
        L_0x0016:
            r1 = 0
        L_0x0017:
            com.obwhatsapp.WaImageView r0 = r3.A0D
            if (r1 != 0) goto L_0x001d
            r2 = 8
        L_0x001d:
            r0.setVisibility(r2)
            if (r1 == 0) goto L_0x002a
            com.obwhatsapp.WaImageView r1 = r3.A0D
            r0 = 2131231633(0x7f080391, float:1.8079353E38)
            r1.setImageResource(r0)
        L_0x002a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30501cS.A0B():void");
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        super.onActivityCreated(activity, bundle);
        C000900k r3 = this.A0K;
        ConversationTitleViewModel conversationTitleViewModel = (ConversationTitleViewModel) new C006602z(r3).A01(ConversationTitleViewModel.class);
        this.A03 = conversationTitleViewModel;
        conversationTitleViewModel.A01.A0A(r3, new IDxObserverShape115S0100000_2_I0((Object) this, 148));
        this.A03.A01.A0B(new C49702Ve());
        this.A04.setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(this, 22, activity));
        AnonymousClass2JP.A03(this.A04, R.string.str0015);
        A0B();
    }

    public void onActivityDestroyed(Activity activity) {
        Runnable runnable;
        Runnable runnable2;
        Handler handler = this.A01;
        if (!(handler == null || (runnable2 = this.A04) == null)) {
            handler.removeCallbacks(runnable2);
        }
        Handler handler2 = this.A02;
        if (!(handler2 == null || (runnable = this.A05) == null)) {
            handler2.removeCallbacks(runnable);
        }
        super.onActivityDestroyed(activity);
    }
}
