package X;

import android.animation.Animator;
import android.content.Context;
import android.os.Handler;
import android.util.SparseArray;
import android.view.View;
import com.facebook.redex.RunnableRunnableShape1S0100000_I0;
import com.facebook.redex.RunnableRunnableShape2S0200000_I0;
import com.facebook.rendercore.RootHostView;
import com.obwhatsapp.R;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.2We  reason: invalid class name and case insensitive filesystem */
public class C49852We {
    public RootHostView A00;
    public Map A01;
    public final int A02;
    public final C61753Ae A03;
    public final C14990q7 A04;
    public final C83344Gh A05;
    public final C14910pz A06;
    public final List A07;
    public final AtomicBoolean A08 = new AtomicBoolean(false);
    public final AtomicReference A09;

    public C49852We(Context context, SparseArray sparseArray, AnonymousClass2Wa r11, AnonymousClass22A r12, Map map, Map map2, int i2) {
        AtomicReference atomicReference = new AtomicReference();
        this.A09 = atomicReference;
        this.A02 = i2;
        C88184a5 r5 = r11.A00;
        List list = r5.A01;
        this.A07 = list;
        AnonymousClass4BI.A01.incrementAndGet();
        C99324tq r3 = C99324tq.A00;
        C14990q7 A012 = C62183Bz.A01(context, sparseArray, new C14910pz(r5, r11.A01, new AnonymousClass228(), r3), r12, r11.A02);
        this.A04 = A012;
        C14910pz A032 = C62183Bz.A03(A012);
        this.A06 = A032;
        this.A01 = AnonymousClass2Wa.A04(list, map);
        C83344Gh r32 = new C83344Gh(A032);
        this.A05 = r32;
        A012.A01.get(R.id.bk_context_key_rendercore_extensions_creator);
        this.A03 = new C61753Ae(context, r32, A012);
        AnonymousClass4TL A013 = A032.A01(A012, new C99114tV(this), map2);
        atomicReference.compareAndSet((Object) null, A013);
        A06(A013, true);
    }

    public static C49862Wf A00(Context context, AnonymousClass2Wa r2, AnonymousClass22A r3) {
        return new C49862Wf(context, r2, r3);
    }

    public View A01() {
        return this.A00;
    }

    public C14990q7 A02() {
        if (this.A08.get()) {
            C29691b2.A00("BloksHostingComponent", "Trying to access a BloksContext form a destroyed BloksHostingComponent");
        }
        return this.A04;
    }

    public void A03() {
        A04();
        C14990q7 A022 = A02();
        HashMap hashMap = (HashMap) A022.A02(R.id.bk_context_key_animations);
        for (Animator cancel : ((AbstractMap) hashMap.clone()).values()) {
            cancel.cancel();
        }
        if (!hashMap.isEmpty()) {
            C29691b2.A00("BloksAnimation", "Animator map is non-empty after cleanup!");
            hashMap.clear();
        }
        HashMap hashMap2 = (HashMap) A022.A02(R.id.bk_context_key_timers);
        for (C14920q0 A012 : ((AbstractMap) hashMap2.clone()).values()) {
            A012.A01();
        }
        if (!hashMap2.isEmpty()) {
            C29691b2.A00("BloksTimer", "Timer map is non-empty after cleanup!");
            hashMap2.clear();
        }
        C14910pz A032 = C62183Bz.A03(A022);
        A032.A09 = true;
        A032.A01.A00();
        this.A08.set(true);
        AnonymousClass4BI.A02.incrementAndGet();
    }

    public void A04() {
        if (this.A08.get()) {
            C29691b2.A00("BloksHostingComponent", "Trying to detach a view from a destroyed BloksHostingComponent");
            return;
        }
        RootHostView rootHostView = this.A00;
        if (rootHostView != null) {
            rootHostView.setRenderState((C61753Ae) null);
            this.A00 = null;
        }
    }

    public void A05(RootHostView rootHostView) {
        if (this.A08.get()) {
            C29691b2.A00("BloksHostingComponent", "Trying to attach a view to a destroyed BloksHostingComponent");
            return;
        }
        RootHostView rootHostView2 = this.A00;
        if (!(rootHostView2 == null || rootHostView2 == rootHostView)) {
            A04();
        }
        this.A00 = rootHostView;
        rootHostView.setRenderState(this.A03);
        this.A00.requestLayout();
    }

    public final void A06(AnonymousClass4TL r7, boolean z2) {
        if (!this.A08.get()) {
            C95844nN r5 = new C95844nN(this.A04, this.A05.A00, r7, this.A01);
            if (this.A02 == 1) {
                if (z2) {
                    C15790rr.A00().post(new RunnableRunnableShape1S0100000_I0((Object) r5, 2));
                } else {
                    C61753Ae r4 = this.A03;
                    Handler A002 = C15790rr.A00();
                    A002.removeCallbacksAndMessages(r4);
                    A002.postAtTime(new RunnableRunnableShape2S0200000_I0(r4, 0, r5), r4, 0);
                    return;
                }
            }
            this.A03.A02(r5);
        }
    }
}
