package com.obwhatsapp.status.playback.fragment;

import X.AnonymousClass00B;
import X.AnonymousClass013;
import X.AnonymousClass01D;
import X.AnonymousClass03L;
import X.AnonymousClass10X;
import X.AnonymousClass11G;
import X.AnonymousClass127;
import X.AnonymousClass128;
import X.AnonymousClass15I;
import X.AnonymousClass184;
import X.AnonymousClass18R;
import X.AnonymousClass1AF;
import X.AnonymousClass1AM;
import X.AnonymousClass1BU;
import X.AnonymousClass1L1;
import X.AnonymousClass1PE;
import X.AnonymousClass1RV;
import X.AnonymousClass1VD;
import X.AnonymousClass1yL;
import X.AnonymousClass20C;
import X.AnonymousClass2Ao;
import X.AnonymousClass2B0;
import X.AnonymousClass3B1;
import X.C001000l;
import X.C108175My;
import X.C14530pL;
import X.C14670pZ;
import X.C14700pc;
import X.C14710pd;
import X.C14750ph;
import X.C15830rv;
import X.C15900s5;
import X.C16000sG;
import X.C16010sH;
import X.C16030sJ;
import X.C16040sK;
import X.C16080sP;
import X.C16220sf;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16460t6;
import X.C16490t9;
import X.C16620tM;
import X.C16730tY;
import X.C16740tZ;
import X.C16750ta;
import X.C16760tb;
import X.C16980tz;
import X.C17040uR;
import X.C17090uW;
import X.C17140ub;
import X.C17200uh;
import X.C18940xV;
import X.C19150xq;
import X.C19980zJ;
import X.C204310c;
import X.C23631Ct;
import X.C25781Lc;
import X.C26941Pv;
import X.C28381Vw;
import X.C28961Zl;
import X.C30521cU;
import X.C32291fz;
import X.C33481ie;
import X.C34091jg;
import X.C34601kX;
import X.C34671kg;
import X.C34681kh;
import X.C34691ki;
import X.C35541m6;
import X.C38621r6;
import X.C38711rI;
import X.C38731rK;
import X.C40781ug;
import X.C41811wh;
import X.C41821wi;
import X.C42881yp;
import X.C43211zc;
import X.C455529g;
import X.C54472hZ;
import X.C54602hp;
import X.C606734v;
import X.C608036e;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.facebook.redex.IDxLCacheShape19S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape10S0200000_I0_8;
import com.facebook.redex.RunnableRunnableShape15S0100000_I0_14;
import com.facebook.redex.ViewOnClickCListenerShape1S1200000_I0;
import com.facebook.redex.ViewOnClickCListenerShape2S0300000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.chat.IDxSObserverShape63S0100000_2_I0;
import com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0;
import com.obwhatsapp.data.IDxMObserverShape73S0100000_1_I0;
import com.obwhatsapp.group.IDxPObserverShape81S0100000_2_I0;
import com.obwhatsapp.status.playback.widget.StatusPlaybackProgressView;
import com.obwhatsapp.yo.SS;
import com.whatsapp.Mp4Ops;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class StatusPlaybackContactFragment extends Hilt_StatusPlaybackContactFragment implements C34681kh, C14670pZ, C17040uR, C34671kg, C34691ki {
    public int A00 = 0;
    public int A01;
    public C19980zJ A02;
    public C16300so A03;
    public C17090uW A04;
    public C16040sK A05;
    public Mp4Ops A06;
    public AnonymousClass10X A07;
    public C15900s5 A08;
    public C16760tb A09;
    public C204310c A0A;
    public AnonymousClass127 A0B;
    public C16000sG A0C;
    public C17140ub A0D;
    public C16080sP A0E;
    public AnonymousClass2Ao A0F;
    public C17200uh A0G;
    public AnonymousClass15I A0H;
    public C16440t3 A0I;
    public C16980tz A0J;
    public C16460t6 A0K;
    public C19150xq A0L;
    public AnonymousClass128 A0M;
    public AnonymousClass184 A0N;
    public AnonymousClass11G A0O;
    public C14710pd A0P;
    public C16490t9 A0Q;
    public AnonymousClass18R A0R;
    public UserJid A0S;
    public C16740tZ A0T;
    public AnonymousClass1RV A0U;
    public C16220sf A0V;
    public C25781Lc A0W;
    public C14700pc A0X;
    public AnonymousClass1AM A0Y;
    public AnonymousClass1BU A0Z;
    public C26941Pv A0a;
    public AnonymousClass1L1 A0b;
    public C608036e A0c;
    public AnonymousClass1PE A0d;
    public C16320sq A0e;
    public AnonymousClass1AF A0f;
    public C23631Ct A0g;
    public AnonymousClass01D A0h;
    public AnonymousClass01D A0i;
    public String A0j;
    public List A0k;
    public Map A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public final AnonymousClass03L A0p = new IDxLCacheShape19S0100000_2_I0(this);
    public final C40781ug A0q = new IDxSObserverShape63S0100000_2_I0(this, 22);
    public final C33481ie A0r = new IDxCObserverShape68S0100000_2_I0(this, 33);
    public final C18940xV A0s = new IDxMObserverShape73S0100000_1_I0(this, 8);
    public final AnonymousClass1VD A0t = new IDxPObserverShape81S0100000_2_I0(this, 25);

    public static StatusPlaybackContactFragment A01(UserJid userJid, C28381Vw r5) {
        StatusPlaybackContactFragment statusPlaybackContactFragment = new StatusPlaybackContactFragment();
        Bundle bundle = new Bundle();
        bundle.putString("jid", userJid.getRawString());
        AnonymousClass1yL.A09(bundle, r5, "");
        statusPlaybackContactFragment.A0T(bundle);
        return statusPlaybackContactFragment;
    }

    public static StatusPlaybackContactFragment A02(UserJid userJid, boolean z2) {
        StatusPlaybackContactFragment statusPlaybackContactFragment = new StatusPlaybackContactFragment();
        Bundle bundle = new Bundle();
        bundle.putString("jid", userJid.getRawString());
        bundle.putBoolean("unseen_only", z2);
        statusPlaybackContactFragment.A0T(bundle);
        return statusPlaybackContactFragment;
    }

    public static /* synthetic */ boolean A03(StatusPlaybackContactFragment statusPlaybackContactFragment, int i2, int i3) {
        List list = statusPlaybackContactFragment.A0k;
        if (list == null) {
            return false;
        }
        if (statusPlaybackContactFragment.A00 < list.size() - 1) {
            statusPlaybackContactFragment.A1N(statusPlaybackContactFragment.A00 + 1);
            statusPlaybackContactFragment.A1Q(statusPlaybackContactFragment.A1J(), i2, i3);
            return true;
        }
        C43211zc r1 = (C43211zc) statusPlaybackContactFragment.A0C();
        if (r1 == null) {
            return false;
        }
        UserJid userJid = statusPlaybackContactFragment.A0S;
        AnonymousClass00B.A06(userJid);
        return r1.ASR(userJid.getRawString(), i2, i3, true);
    }

    public void A0n(Bundle bundle) {
        super.A0n(bundle);
        this.A0D.A02(this.A0r);
        this.A0L.A02(this.A0s);
        this.A0B.A02(this.A0q);
        this.A0R.A02(this.A0t);
        this.A0Y.A00(this);
        this.A0e.Ack(this.A0c, new Void[0]);
        UserJid userJid = this.A0S;
        if (userJid != C34091jg.A00) {
            C16010sH A0A2 = this.A0C.A0A(userJid);
            if (A0A2.A0m) {
                A0A2.A0m = false;
                this.A0e.Acl(new RunnableRunnableShape10S0200000_I0_8(this, 35, A0A2));
            }
        }
    }

    public void A0s(Bundle bundle) {
        C16740tZ r0 = this.A0T;
        if (r0 != null) {
            AnonymousClass1yL.A09(bundle, r0.A11, "");
        }
    }

    public void A0w() {
        super.A0w();
        for (C41821wi r1 : this.A0p.A04().values()) {
            if (r1 != null && r1.A03) {
                r1.A02();
            }
        }
    }

    public void A0x(int i2, int i3, Intent intent) {
        if (i2 != 2) {
            super.A0x(i2, i3, intent);
        } else if (i3 == -1 && intent != null) {
            List A082 = C16030sJ.A08(C15830rv.class, intent.getStringArrayListExtra("jids"));
            boolean booleanExtra = intent.getBooleanExtra("include_captions", false);
            C35541m6 r6 = null;
            if (AnonymousClass3B1.A01(this.A0P, A082)) {
                AnonymousClass00B.A06(intent);
                r6 = this.A0Z.A00(intent.getExtras());
            }
            this.A09.A08(this.A07, r6, this.A0T, A082, booleanExtra);
            if (A082.size() != 1 || C16030sJ.A0Q((Jid) A082.get(0))) {
                ((C14530pL) A0C()).Agv(A082);
            } else {
                C54472hZ.A00(new C14750ph().A0x(A0u(), (C15830rv) A082.get(0)), this);
            }
        }
    }

    public void A12() {
        super.A12();
        this.A0D.A03(this.A0r);
        this.A0L.A03(this.A0s);
        this.A0B.A03(this.A0q);
        this.A0R.A03(this.A0t);
        this.A0Y.A00.remove("status_playback_fragment");
        C608036e r1 = this.A0c;
        if (r1 != null) {
            r1.A06(true);
        }
        AnonymousClass2Ao r0 = this.A0F;
        if (r0 != null) {
            r0.A00();
        }
    }

    public void A13() {
        super.A13();
        this.A0p.A05(-1);
    }

    public void A14() {
        super.A14();
        for (C41821wi r1 : this.A0p.A04().values()) {
            if (r1 != null && !r1.A03) {
                r1.A03();
            }
        }
    }

    public void A17(Bundle bundle) {
        C28381Vw A032;
        super.A17(bundle);
        this.A0o = this.A0P.A0E(C16620tM.A01, 1875);
        this.A0S = C16030sJ.A02(A04().getString("jid"));
        this.A0n = this.A05.getBoolean("unseen_only");
        if (bundle != null && (A032 = AnonymousClass1yL.A03(bundle, "")) != null) {
            this.A0T = this.A0K.A0K.A03(A032);
        }
    }

    public void A18(Bundle bundle, View view) {
        super.A18(bundle, view);
        AnonymousClass2B0 r3 = this.A03;
        AnonymousClass00B.A07(r3, "getViewHolder() is accessed before StatusPlaybackBaseFragment#onCreateView()");
        boolean z2 = false;
        if (this.A0S == C34091jg.A00) {
            z2 = true;
        }
        View view2 = r3.A03;
        int i2 = 0;
        if (z2) {
            i2 = 8;
        }
        view2.setVisibility(i2);
        this.A0F = this.A0G.A04(A02(), "status-playback-contact-fragment");
        A1L();
        C28381Vw A032 = AnonymousClass1yL.A03(A04(), "");
        AnonymousClass11G r4 = this.A0O;
        C23631Ct r9 = this.A0g;
        C16460t6 r1 = this.A0K;
        AnonymousClass128 r2 = this.A0M;
        AnonymousClass184 r32 = this.A0N;
        AnonymousClass01D r10 = this.A0h;
        AnonymousClass01D r11 = this.A0i;
        this.A0c = new C608036e(r1, r2, r32, r4, this.A0S, A032, this.A0U, this, r9, r10, r11, this.A0n, this.A0o);
    }

    public void A1B() {
        super.A1B();
        if (this.A0k != null) {
            int i2 = this.A00;
            this.A00 = -1;
            if (i2 == -1) {
                i2 = 0;
            }
            A1N(i2);
        }
    }

    public void A1C() {
        super.A1C();
        C41821wi A1J = A1J();
        if (A1J != null && A1J.A04) {
            A1J.A05();
        }
    }

    public void A1I(boolean z2) {
        super.A1I(z2);
        C41821wi A1J = A1J();
        if (A1J != null) {
            ((C41811wh) A1J).A09().A06(z2);
        }
    }

    public final C41821wi A1J() {
        List list;
        int i2 = this.A00;
        if (i2 < 0 || (list = this.A0k) == null || i2 >= list.size()) {
            return null;
        }
        return (C41821wi) this.A0p.A02(((C16740tZ) this.A0k.get(this.A00)).A11);
    }

    /* JADX WARNING: type inference failed for: r2v5, types: [X.1wi, X.1wh, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v4, types: [X.2kF] */
    /* JADX WARNING: type inference failed for: r7v5, types: [X.2B2] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C41821wi A1K(X.C16740tZ r61) {
        /*
            r60 = this;
            r6 = r60
            X.2B0 r5 = r6.A03
            java.lang.String r0 = "getViewHolder() is accessed before StatusPlaybackBaseFragment#onCreateView()"
            X.AnonymousClass00B.A07(r5, r0)
            X.03L r4 = r6.A0p
            r7 = r61
            X.1Vw r3 = r7.A11
            java.lang.Object r2 = r4.A02(r3)
            X.1wi r2 = (X.C41821wi) r2
            if (r2 != 0) goto L_0x0138
            X.1PE r2 = r6.A0d
            X.4L6 r1 = new X.4L6
            r1.<init>(r7, r6)
            X.2Ao r0 = r6.A0F
            r21 = r0
            boolean r8 = r3.A02
            X.0t3 r0 = r2.A0F
            r36 = r0
            com.whatsapp.Mp4Ops r0 = r2.A05
            if (r8 == 0) goto L_0x0139
            r59 = r0
            X.0pd r0 = r2.A0P
            r34 = r0
            X.1PD r0 = r2.A0Z
            r46 = r0
            X.0pt r0 = r2.A02
            r58 = r0
            X.0sK r0 = r2.A04
            r57 = r0
            X.10X r0 = r2.A06
            r56 = r0
            X.0sq r0 = r2.A0a
            r47 = r0
            X.0tz r0 = r2.A0G
            r25 = r0
            X.0so r0 = r2.A01
            r55 = r0
            X.0t9 r0 = r2.A0Q
            r35 = r0
            X.0ua r0 = r2.A07
            r54 = r0
            X.11G r0 = r2.A0N
            r32 = r0
            X.0tb r0 = r2.A08
            r16 = r0
            X.0zJ r0 = r2.A00
            r53 = r0
            X.0uh r0 = r2.A0D
            r22 = r0
            X.1P7 r0 = r2.A0S
            r37 = r0
            X.1Ct r0 = r2.A0d
            r50 = r0
            X.0w2 r0 = r2.A0O
            r33 = r0
            X.0sG r0 = r2.A0A
            r18 = r0
            X.1HF r0 = r2.A0M
            r31 = r0
            X.0sP r0 = r2.A0C
            r20 = r0
            X.013 r0 = r2.A0I
            r27 = r0
            X.1P8 r0 = r2.A0U
            r39 = r0
            X.1Mg r0 = r2.A0L
            r30 = r0
            X.0uW r0 = r2.A03
            r52 = r0
            X.0ub r0 = r2.A0B
            r19 = r0
            X.0t6 r0 = r2.A0J
            r28 = r0
            X.0xq r0 = r2.A0K
            r29 = r0
            X.0sf r0 = r2.A0V
            r41 = r0
            X.127 r0 = r2.A09
            r17 = r0
            X.0rz r0 = r2.A0H
            r26 = r0
            X.1Lw r14 = r2.A0b
            X.1L1 r13 = r2.A0W
            X.1BM r12 = r2.A0X
            X.1HE r11 = r2.A0T
            X.1AF r10 = r2.A0c
            X.18R r9 = r2.A0R
            X.1PB r8 = r2.A0Y
            X.01D r0 = r2.A0e
            X.01V r15 = r2.A0E
            X.2B2 r2 = new X.2B2
            r23 = r15
            r24 = r36
            r36 = r9
            r38 = r11
            r40 = r7
            r42 = r13
            r43 = r12
            r44 = r8
            r45 = r1
            r48 = r14
            r49 = r10
            r51 = r0
            r7 = r2
            r8 = r52
            r9 = r53
            r10 = r55
            r11 = r58
            r12 = r57
            r13 = r59
            r14 = r56
            r15 = r54
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
        L_0x00e6:
            android.view.ViewGroup r7 = r5.A07
            int r1 = r6.A03
            r0 = 7
            r8 = 0
            if (r1 < r0) goto L_0x00ef
            r8 = 1
        L_0x00ef:
            android.graphics.Rect r5 = r6.A01
            boolean r0 = r2.A01
            if (r0 != 0) goto L_0x0135
            r0 = 1
            r2.A01 = r0
            java.lang.String r0 = "playbackPage/onCreate page="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = "; host="
            r1.append(r0)
            X.4L6 r0 = r2.A0R
            com.obwhatsapp.status.playback.fragment.StatusPlaybackBaseFragment r0 = r0.A01
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Context r0 = r7.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            android.view.View r0 = r2.A08(r0, r7)
            r2.A00 = r0
            r2.A0L(r0)
            r2.A0F()
            r2.A07(r5)
            if (r8 == 0) goto L_0x0135
            boolean r0 = r2.A03
            if (r0 != 0) goto L_0x0135
            r2.A03()
        L_0x0135:
            r4.A06(r3, r2)
        L_0x0138:
            return r2
        L_0x0139:
            r48 = r0
            X.0pd r0 = r2.A0P
            r27 = r0
            X.1PD r0 = r2.A0Z
            r38 = r0
            X.0pt r0 = r2.A02
            r47 = r0
            X.10X r0 = r2.A06
            r46 = r0
            X.0sq r0 = r2.A0a
            r39 = r0
            X.0tz r0 = r2.A0G
            r19 = r0
            X.0so r0 = r2.A01
            r45 = r0
            X.0t9 r0 = r2.A0Q
            r28 = r0
            X.0ua r0 = r2.A07
            r44 = r0
            X.11G r0 = r2.A0N
            r25 = r0
            X.0tb r0 = r2.A08
            r43 = r0
            X.0zJ r0 = r2.A00
            r42 = r0
            X.1P7 r0 = r2.A0S
            r29 = r0
            X.0w2 r0 = r2.A0O
            r26 = r0
            X.1HF r0 = r2.A0M
            r24 = r0
            X.013 r0 = r2.A0I
            r20 = r0
            X.1P8 r0 = r2.A0U
            r31 = r0
            X.1Mg r0 = r2.A0L
            r23 = r0
            X.0uW r0 = r2.A03
            r41 = r0
            X.0t6 r15 = r2.A0J
            X.0xq r14 = r2.A0K
            X.0sf r13 = r2.A0V
            X.1Lw r12 = r2.A0b
            X.1L1 r11 = r2.A0W
            X.1BM r10 = r2.A0X
            X.1HE r9 = r2.A0T
            X.1PB r8 = r2.A0Y
            X.01V r0 = r2.A0E
            X.2kF r2 = new X.2kF
            r16 = r21
            r17 = r0
            r18 = r36
            r21 = r15
            r22 = r14
            r30 = r9
            r32 = r7
            r33 = r13
            r34 = r11
            r35 = r10
            r36 = r8
            r37 = r1
            r40 = r12
            r7 = r2
            r8 = r41
            r9 = r42
            r10 = r45
            r11 = r47
            r12 = r48
            r13 = r46
            r14 = r44
            r15 = r43
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            goto L_0x00e6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment.A1K(X.0tZ):X.1wi");
    }

    public final void A1L() {
        AnonymousClass2B0 r3 = this.A03;
        AnonymousClass00B.A07(r3, "getViewHolder() is accessed before StatusPlaybackBaseFragment#onCreateView()");
        C16000sG r1 = this.A0C;
        C15830rv r0 = this.A0S;
        C34091jg r4 = C34091jg.A00;
        if (r0 == r4) {
            C16040sK r02 = this.A05;
            r02.A0B();
            r0 = r02.A05;
            AnonymousClass00B.A06(r0);
        }
        C16010sH A0A2 = r1.A0A(r0);
        AnonymousClass2Ao r12 = this.A0F;
        if (r12 != null) {
            r12.A06(r3.A0B, A0A2);
        }
        C30521cU r5 = new C30521cU((View) r3.A09, this.A0E, this.A02, this.A0W, (int) R.id.name);
        if (this.A0S == r4) {
            r5.A04();
        } else {
            r5.A0F((List) null, this.A0E.A0D(A0A2));
            r5.A07(C16030sJ.A0P(this.A0S) ? 1 : 0);
        }
        UserJid userJid = this.A0S;
        if (!C16030sJ.A0O(userJid) || userJid == r4) {
            r3.A0B.setClickable(false);
            r3.A04.setClickable(false);
            return;
        }
        r3.A0B.setOnClickListener(new ViewOnClickCListenerShape2S0300000_I0(this, r3, A0A2, 9));
        r3.A04.setOnClickListener(new ViewOnClickCListenerShape2S0300000_I0(this, r3, A0A2, 8));
    }

    public final void A1M() {
        C16750ta r1;
        AnonymousClass2B0 r12 = this.A03;
        AnonymousClass00B.A07(r12, "getViewHolder() is accessed before StatusPlaybackBaseFragment#onCreateView()");
        StatusPlaybackProgressView statusPlaybackProgressView = r12.A0E;
        statusPlaybackProgressView.setCount(this.A0k.size());
        Set set = statusPlaybackProgressView.A08;
        set.clear();
        if (this.A0S == C34091jg.A00) {
            int i2 = 0;
            for (C16740tZ r2 : this.A0k) {
                if ((r2 instanceof C16730tY) && (r1 = ((C16730tY) r2).A02) != null && !r1.A0P && !r1.A0Z && (!(r2 instanceof C38711rI) || !AnonymousClass20C.A03((C38731rK) r2))) {
                    set.add(Integer.valueOf(i2));
                }
                i2++;
            }
        }
    }

    public final void A1N(int i2) {
        List list;
        C34601kX r7;
        if (this.A00 != i2 && (list = this.A0k) != null) {
            if (list.isEmpty()) {
                StringBuilder sb = new StringBuilder("playbackFragment/setPageActive no-messages ");
                sb.append(this);
                Log.w(sb.toString());
                return;
            }
            this.A00 = i2;
            AnonymousClass2B0 r6 = this.A03;
            AnonymousClass00B.A07(r6, "getViewHolder() is accessed before StatusPlaybackBaseFragment#onCreateView()");
            StatusPlaybackProgressView statusPlaybackProgressView = r6.A0E;
            statusPlaybackProgressView.setPosition(i2);
            statusPlaybackProgressView.setProgressProvider((C108175My) null);
            C16740tZ r3 = (C16740tZ) this.A0k.get(i2);
            if (C16030sJ.A0P(r3.A0B()) && (r7 = (C34601kX) this.A0l.get(Long.valueOf(r3.A13))) != null) {
                this.A0b.A0I.put(r3.A11.A01, Boolean.FALSE);
                String str = r7.A03;
                String str2 = r7.A02;
                if (str == null || str2 == null) {
                    r6.A08.setVisibility(8);
                } else {
                    Button button = r6.A00;
                    if (button == null) {
                        button = (Button) r6.A08.inflate();
                        r6.A00 = button;
                    }
                    button.setText(r7.A02);
                    button.setOnClickListener(new ViewOnClickCListenerShape1S1200000_I0(this, str, r3, 2));
                    button.setVisibility(0);
                }
                this.A0j = r7.A04;
            }
            C41821wi A1K = A1K(r3);
            r6.A05.setVisibility(((C41811wh) A1K).A09() instanceof C606734v ? 4 : 0);
            View view = A1K.A00;
            ViewGroup viewGroup = r6.A07;
            if (viewGroup.getChildCount() == 0 || viewGroup.getChildAt(0) != view) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            }
            for (C41821wi r1 : this.A0p.A04().values()) {
                if (!(r1 == A1K || r1 == null || !r1.A04)) {
                    r1.A05();
                }
            }
            A1P(r3);
            if (!A1K.A04) {
                A1K.A04();
            }
            if (i2 < this.A0k.size() - 1) {
                A1K((C16740tZ) this.A0k.get(i2 + 1));
            }
            if (i2 > 0) {
                A1K((C16740tZ) this.A0k.get(i2 - 1));
            }
            this.A0H.A08(this.A0S, 9);
        }
    }

    public final void A1O(C16010sH r5, AnonymousClass2B0 r6) {
        C001000l A0D2 = A0D();
        A0D2.startActivity(new C14750ph().A0w(A0D2, r5, 5), C455529g.A05(A0D2, r6.A0B, new C54602hp(A0D2).A00(R.string.str1dd7)));
    }

    public final void A1P(C16740tZ r7) {
        C16440t3 r4;
        AnonymousClass013 r2;
        long j2;
        int i2;
        C16750ta r1;
        AnonymousClass2B0 r12 = this.A03;
        AnonymousClass00B.A07(r12, "getViewHolder() is accessed before StatusPlaybackBaseFragment#onCreateView()");
        if (!C16030sJ.A0P(this.A0S)) {
            TextView textView = r12.A0C;
            textView.setVisibility(0);
            if (!r7.A11.A02) {
                r4 = this.A0I;
                r2 = this.A02;
                j2 = r7.A0I;
            } else if (C42881yp.A02(r7.A0C, 4)) {
                j2 = r7.A0H;
                if (j2 <= 0) {
                    j2 = r7.A0I;
                }
                r4 = this.A0I;
                r2 = this.A02;
            } else {
                if (!(r7 instanceof C16730tY) || (r1 = ((C16730tY) r7).A02) == null || r1.A0P || r1.A0Z) {
                    boolean A0o2 = C38621r6.A0o(r7);
                    i2 = R.string.str1510;
                    if (A0o2) {
                        i2 = R.string.str06ba;
                    }
                } else {
                    i2 = R.string.str150f;
                }
                textView.setText(i2);
                return;
            }
            textView.setText(C28961Zl.A01(r2, r4.A02(j2)));
            SS.setSSDateTV(textView);
            SS.checkSSDeleted(r7);
            SS.setPlaybackContactFragment(this);
            return;
        }
        r12.A0C.setVisibility(8);
    }

    public final void A1Q(C41821wi r4, int i2, int i3) {
        for (C41821wi r1 : this.A0p.A04().values()) {
            if (!(r1 == r4 || r1 == null || !r1.A05)) {
                r1.A06(i2);
            }
        }
        if (r4 != null && !r4.A05) {
            C41811wh r42 = (C41811wh) r4;
            r42.A05 = true;
            r42.A0K(i3, r42.A06);
        }
    }

    public String ACg() {
        return "status_playback_fragment";
    }

    public C14700pc AG9(int i2, int i3, boolean z2) {
        AnonymousClass2B0 r1 = this.A03;
        AnonymousClass00B.A07(r1, "getViewHolder() is accessed before StatusPlaybackBaseFragment#onCreateView()");
        ViewGroup viewGroup = r1.A07;
        ArrayList arrayList = new ArrayList();
        arrayList.add(A0D().findViewById(R.id.bottom_sheet));
        C14700pc r4 = new C14700pc(this, C32291fz.A00(viewGroup, R.string.str06b9, 2000), this.A01, arrayList, false);
        this.A0X = r4;
        r4.A03(new RunnableRunnableShape15S0100000_I0_14(this, 2));
        return this.A0X;
    }

    public void APj(DialogFragment dialogFragment, boolean z2) {
        this.A0m = z2;
        A1A();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C41821wi A1J = A1J();
        if (A1J != null) {
            A1J.A00();
        }
    }

    public String toString() {
        UserJid userJid = this.A0S;
        if (userJid != null) {
            return userJid.toString();
        }
        String string = A04().getString("jid");
        AnonymousClass00B.A06(string);
        return string;
    }
}
