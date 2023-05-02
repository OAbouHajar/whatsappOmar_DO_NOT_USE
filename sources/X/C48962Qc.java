package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.IDxCListenerShape227S0100000_2_I0;
import com.facebook.redex.IDxConsumerShape29S0300000_2_I0;
import com.facebook.redex.IDxObserverShape115S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape5S0200000_I0_3;
import com.facebook.redex.ViewOnClickCListenerShape2S0300000_I0;
import com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.conversation.viewmodel.ConversationTitleViewModel;
import com.obwhatsapp.yo.yo;

/* renamed from: X.2Qc  reason: invalid class name and case insensitive filesystem */
public class C48962Qc extends C30511cT {
    public int A00;
    public long A01;
    public Activity A02;
    public Handler A03;
    public Handler A04;
    public ConversationTitleViewModel A05;
    public C16010sH A06;
    public C33741j5 A07;
    public Runnable A08;
    public Runnable A09;
    public boolean A0A;
    public final C17230uk A0B;
    public final AnonymousClass1L3 A0C;
    public final C16000sG A0D;
    public final AnonymousClass18Q A0E;
    public final AnonymousClass2Ao A0F;
    public final C51312bQ A0G;
    public final C16440t3 A0H;
    public final C15810rt A0I;
    public final C16070sO A0J;
    public final C17240ul A0K;
    public final AnonymousClass28S A0L = new IDxCListenerShape227S0100000_2_I0(this, 3);
    public final AnonymousClass18O A0M;
    public final C217915l A0N;
    public final C16050sL A0O;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C48962Qc(X.C000900k r32, X.C25731Kx r33, X.C14870pt r34, X.C16040sK r35, X.C54602hp r36, X.AnonymousClass13V r37, X.AnonymousClass127 r38, X.C17230uk r39, X.AnonymousClass1L3 r40, X.C17160ud r41, X.C16000sG r42, X.C17140ub r43, X.AnonymousClass18Q r44, X.C16080sP r45, X.AnonymousClass2Ao r46, X.AnonymousClass152 r47, X.C16440t3 r48, X.AnonymousClass013 r49, X.C15810rt r50, X.C216114t r51, X.C16070sO r52, X.C16010sH r53, X.C17250um r54, X.C14710pd r55, X.C17240ul r56, X.AnonymousClass18O r57, X.AnonymousClass18R r58, X.C217915l r59, X.C16050sL r60, X.C25781Lc r61, X.C16320sq r62) {
        /*
            r31 = this;
            r20 = 0
            r7 = r31
            r3 = r60
            r10 = r34
            r13 = r37
            r14 = r38
            r15 = r41
            r16 = r43
            r11 = r35
            r29 = r61
            r8 = r32
            r12 = r36
            r2 = r62
            r9 = r33
            r6 = r45
            r18 = r47
            r19 = r49
            r5 = r50
            r22 = r51
            r23 = r53
            r24 = r54
            r25 = r55
            r4 = r56
            r27 = r58
            r21 = r5
            r26 = r4
            r28 = r3
            r30 = r2
            r17 = r6
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            r1 = 3
            com.facebook.redex.IDxCListenerShape227S0100000_2_I0 r0 = new com.facebook.redex.IDxCListenerShape227S0100000_2_I0
            r0.<init>(r7, r1)
            r7.A0L = r0
            r0 = r48
            r7.A0H = r0
            r0 = r42
            r7.A0D = r0
            r0 = r40
            r7.A0C = r0
            r0 = r39
            r7.A0B = r0
            r0 = r57
            r7.A0M = r0
            r0 = r52
            r7.A0J = r0
            r0 = r44
            r7.A0E = r0
            r7.A0O = r3
            r7.A0I = r5
            r0 = r59
            r7.A0N = r0
            r7.A0K = r4
            r0 = r46
            r7.A0F = r0
            X.4xE r1 = new X.4xE
            r1.<init>(r7)
            X.2bQ r0 = new X.2bQ
            r0.<init>(r6, r1, r3, r2)
            r7.A0G = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48962Qc.<init>(X.00k, X.1Kx, X.0pt, X.0sK, X.2hp, X.13V, X.127, X.0uk, X.1L3, X.0ud, X.0sG, X.0ub, X.18Q, X.0sP, X.2Ao, X.152, X.0t3, X.013, X.0rt, X.14t, X.0sO, X.0sH, X.0um, X.0pd, X.0ul, X.18O, X.18R, X.15l, X.0sL, X.1Lc, X.0sq):void");
    }

    public ViewGroup A03(Context context) {
        boolean A0E2 = this.A0B.A0E(this.A0O, this.A00);
        this.A0A = A0E2;
        return A0E2 ? (ViewGroup) LayoutInflater.from(context).inflate(yo.cen(R.layout.layout0152), (ViewGroup) null, false) : super.A03(context);
    }

    public void A04() {
        C15810rt r0 = this.A0I;
        C16050sL r2 = this.A0O;
        int A022 = r0.A02(r2);
        this.A00 = A022;
        if (this.A0A != this.A0B.A0E(r2, A022)) {
            A07(this.A02);
        }
        super.A04();
        this.A0G.A00();
        A0A();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        if (r1 == 3) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06() {
        /*
            r5 = this;
            int r1 = r5.A00
            r3 = 0
            r4 = 1
            r0 = 2
            if (r1 == r0) goto L_0x000b
            r0 = 3
            r2 = 0
            if (r1 != r0) goto L_0x000c
        L_0x000b:
            r2 = 1
        L_0x000c:
            X.0sO r1 = r5.A0J
            X.0sL r0 = r5.A0O
            boolean r0 = r1.A09(r0)
            if (r0 == 0) goto L_0x004c
            if (r2 == 0) goto L_0x004c
            X.1j5 r0 = r5.A07
            r0.A03(r3)
            X.1j5 r0 = r5.A07
            android.view.View r3 = r0.A02()
            com.obwhatsapp.community.SubgroupPileView r3 = (com.obwhatsapp.community.SubgroupPileView) r3
            X.0sH r2 = r5.A0G
            int r1 = r5.A00
            X.2Ao r0 = r5.A0F
            r3.setSubgroupProfilePhoto(r2, r1, r4, r0)
            X.1j5 r0 = r5.A07
            android.view.View r0 = r0.A02()
            android.view.ViewParent r2 = r0.getParent()
            android.view.View r2 = (android.view.View) r2
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            r0 = -2
            r1.width = r0
            r2.setLayoutParams(r1)
            android.widget.ImageView r1 = r5.A06
            r0 = 8
            r1.setVisibility(r0)
            return
        L_0x004c:
            super.A06()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48962Qc.A06():void");
    }

    public void A07(Activity activity) {
        int i2;
        View A0E2;
        int i3;
        int i4;
        super.A07(activity);
        this.A07 = new C33741j5(AnonymousClass00T.A05(activity, R.id.subgroup_facepile_toolbar_photo));
        C000900k r3 = this.A0K;
        ConversationTitleViewModel conversationTitleViewModel = (ConversationTitleViewModel) new C006602z(r3).A01(ConversationTitleViewModel.class);
        this.A05 = conversationTitleViewModel;
        conversationTitleViewModel.A01.A0A(r3, new IDxObserverShape115S0100000_2_I0((Object) this, 149));
        this.A05.A01.A0B(new C49702Ve());
        C17230uk r2 = this.A0B;
        if (!r2.A0A() || (i4 = this.A00) != 3) {
            if (r2.A0A() && (i2 = this.A00) == 2 && r2.A0E(this.A0O, i2)) {
                A0E2 = C004601z.A0E(this.A03, R.id.icon_layout_anchor);
                i3 = 2;
            }
            this.A04.setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(this, 24, activity));
            AnonymousClass2JP.A03(this.A04, R.string.str0016);
            A0A();
        }
        if (r2.A0E(this.A0O, i4)) {
            A0E2 = C004601z.A0E(this.A03, R.id.icon_layout_anchor);
            i3 = 1;
        }
        this.A04.setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(this, 24, activity));
        AnonymousClass2JP.A03(this.A04, R.string.str0016);
        A0A();
        A0C(new IDxConsumerShape29S0300000_2_I0(activity, A0E2, this, i3));
        this.A04.setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(this, 24, activity));
        AnonymousClass2JP.A03(this.A04, R.string.str0016);
        A0A();
    }

    public final void A0A() {
        int i2 = 0;
        boolean z2 = false;
        if (this.A0G.A01 > 0) {
            z2 = true;
        }
        WaImageView waImageView = this.A0D;
        if (!z2) {
            i2 = 8;
        }
        waImageView.setVisibility(i2);
        if (z2) {
            this.A0D.setImageResource(R.drawable.ic_ephemeral_v2);
        }
    }

    public final void A0B(View view, C000900k r7, C16010sH r8) {
        if (view != null) {
            view.setContentDescription(r7.getString(R.string.str0040, new Object[]{this.A0W.A08(this.A0G)}));
            AnonymousClass2JP.A03(view, R.string.str0046);
            view.setOnClickListener(new ViewOnClickCListenerShape2S0300000_I0(this, r7, r8, 2));
        }
    }

    public final synchronized void A0C(AnonymousClass04N r4) {
        C16010sH r0 = this.A06;
        if (r0 != null) {
            r4.accept(r0);
        } else {
            this.A0j.Acl(new RunnableRunnableShape5S0200000_I0_3(this, 9, r4));
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.A00 = this.A0I.A02(this.A0O);
        super.onActivityCreated(activity, bundle);
        this.A02 = activity;
        AnonymousClass18O r0 = this.A0M;
        r0.A00.add(this.A0L);
    }

    public void onActivityDestroyed(Activity activity) {
        Runnable runnable;
        Runnable runnable2;
        super.onActivityDestroyed(activity);
        Handler handler = this.A04;
        if (!(handler == null || (runnable2 = this.A09) == null)) {
            handler.removeCallbacks(runnable2);
        }
        Handler handler2 = this.A03;
        if (!(handler2 == null || (runnable = this.A08) == null)) {
            handler2.removeCallbacks(runnable);
        }
        AnonymousClass18O r0 = this.A0M;
        r0.A00.remove(this.A0L);
        C51312bQ r3 = this.A0G;
        C51302bP r2 = r3.A00;
        if (r2 != null) {
            r2.A06(false);
            Handler handler3 = r2.A00;
            if (handler3 != null) {
                handler3.removeCallbacks(r2.A01);
            }
            r2.A00 = null;
            r2.A01 = null;
            r3.A00 = null;
        }
    }
}
