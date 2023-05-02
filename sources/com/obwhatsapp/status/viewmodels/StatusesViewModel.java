package com.obwhatsapp.status.viewmodels;

import X.AnonymousClass027;
import X.AnonymousClass028;
import X.AnonymousClass11G;
import X.AnonymousClass18W;
import X.AnonymousClass1L1;
import X.AnonymousClass1L2;
import X.AnonymousClass1WA;
import X.AnonymousClass2XQ;
import X.AnonymousClass37I;
import X.AnonymousClass58D;
import X.AnonymousClass5QL;
import X.C003401n;
import X.C003501o;
import X.C011405n;
import X.C05730St;
import X.C101624xc;
import X.C15830rv;
import X.C16320sq;
import X.C16690tT;
import X.C19150xq;
import X.C30991dI;
import X.C34611kY;
import X.C34661kf;
import X.C45782Ay;
import X.C73933pM;
import X.C85934Qo;
import androidx.lifecycle.OnLifecycleEvent;
import com.facebook.redex.IDxFunctionShape206S0100000_2_I0;
import com.facebook.redex.IDxMObserverShape460S0100000_2_I0;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class StatusesViewModel extends C003401n implements C003501o {
    public C34661kf A00;
    public AnonymousClass37I A01;
    public C45782Ay A02 = null;
    public C73933pM A03;
    public Set A04 = new HashSet();
    public final AnonymousClass028 A05;
    public final AnonymousClass027 A06;
    public final C85934Qo A07;
    public final C19150xq A08;
    public final AnonymousClass11G A09;
    public final AnonymousClass5QL A0A = new IDxMObserverShape460S0100000_2_I0(this, 1);
    public final AnonymousClass18W A0B;
    public final AnonymousClass1L1 A0C;
    public final AnonymousClass1L2 A0D;
    public final C34611kY A0E = new C34611kY(this);
    public final C16320sq A0F;
    public final Set A0G;
    public final AtomicBoolean A0H;
    public final boolean A0I;

    public StatusesViewModel(C19150xq r5, AnonymousClass11G r6, AnonymousClass18W r7, AnonymousClass1L1 r8, AnonymousClass1L2 r9, C16320sq r10, boolean z2) {
        AnonymousClass027 r3 = new AnonymousClass027(new HashMap());
        this.A06 = r3;
        this.A05 = C05730St.A00(new IDxFunctionShape206S0100000_2_I0(this, 3), r3);
        this.A0G = new HashSet();
        this.A0H = new AtomicBoolean(false);
        this.A0C = r8;
        this.A0B = r7;
        this.A08 = r5;
        this.A0F = r10;
        this.A0D = r9;
        this.A09 = r6;
        this.A07 = new C85934Qo(new AnonymousClass1WA(r10, true));
        this.A0I = z2;
    }

    public static final void A01(AnonymousClass58D r0) {
        if (r0 != null) {
            r0.A00();
        }
    }

    public static /* synthetic */ void A02(UserJid userJid, StatusesViewModel statusesViewModel) {
        Set set = statusesViewModel.A0G;
        synchronized (set) {
            set.add(userJid);
        }
        statusesViewModel.A07();
    }

    public static final void A03(C16690tT r1) {
        if (r1 != null) {
            r1.A06(true);
        }
    }

    public AnonymousClass2XQ A05(UserJid userJid) {
        Map map = (Map) this.A05.A01();
        if (map != null) {
            return (AnonymousClass2XQ) map.get(userJid);
        }
        return null;
    }

    public final void A06() {
        this.A04 = new HashSet();
        C45782Ay r0 = this.A02;
        if (r0 != null) {
            for (C30991dI A072 : r0.A00()) {
                this.A04.add(A072.A07());
            }
        }
    }

    public final void A07() {
        A03(this.A01);
        C34661kf r1 = this.A00;
        if (r1 != null) {
            AnonymousClass37I A002 = this.A0D.A00(r1);
            this.A01 = A002;
            this.A0F.Ack(A002, new Void[0]);
        }
    }

    public void A08(C15830rv r11, Integer num, Integer num2) {
        UserJid of = UserJid.of(r11);
        if (of != null && this.A02 != null) {
            AnonymousClass1L1 r1 = this.A0C;
            r1.A0A(Boolean.FALSE);
            C45782Ay r0 = this.A02;
            r1.A08(of, num, num2, (String) null, r0.A01(), r0.A02(), r0.A00(), (Map) null);
        }
    }

    public void A09(C45782Ay r5) {
        this.A02 = r5;
        A06();
        A01(this.A03);
        C73933pM r3 = new C73933pM(this);
        this.A03 = r3;
        this.A07.A00(new C101624xc(this.A06), r3);
    }

    @OnLifecycleEvent(C011405n.ON_DESTROY)
    public void onLifecycleDestroy() {
        this.A00 = null;
    }

    @OnLifecycleEvent(C011405n.ON_PAUSE)
    public void onLifecyclePause() {
        A03(this.A01);
        A01(this.A03);
        if (this.A0I) {
            this.A08.A03(this.A0E);
            this.A0B.A03(this.A0A);
        }
    }

    @OnLifecycleEvent(C011405n.ON_RESUME)
    public void onLifecycleResume() {
        if (this.A0I) {
            this.A08.A02(this.A0E);
            this.A0B.A02(this.A0A);
        }
        this.A0H.set(false);
        A07();
    }
}
