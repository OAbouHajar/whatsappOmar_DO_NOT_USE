package X;

import android.os.PowerManager;
import com.facebook.redex.RunnableRunnableShape5S0200000_I0_3;
import com.facebook.redex.RunnableRunnableShape7S0100000_I0_6;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: X.0xz  reason: invalid class name and case insensitive filesystem */
public class C19230xz implements C17810vg {
    public final C16300so A00;
    public final C16040sK A01;
    public final AnonymousClass138 A02;
    public final C19000xb A03;
    public final C18260wP A04;
    public final C16000sG A05;
    public final C19600yh A06;
    public final AnonymousClass12D A07;
    public final AnonymousClass01V A08;
    public final C16440t3 A09;
    public final C18590ww A0A;
    public final AnonymousClass11G A0B;
    public final C220616m A0C;
    public final C14710pd A0D;
    public final C18500wn A0E;
    public final C14850pr A0F;
    public final C19450yS A0G;
    public final C16320sq A0H;

    public C19230xz(C16300so r2, C16040sK r3, AnonymousClass138 r4, C19000xb r5, C18260wP r6, C16000sG r7, C19600yh r8, AnonymousClass12D r9, AnonymousClass01V r10, C16440t3 r11, C18590ww r12, AnonymousClass11G r13, C220616m r14, C14710pd r15, C18500wn r16, C14850pr r17, C19450yS r18, C16320sq r19) {
        this.A09 = r11;
        this.A0D = r15;
        this.A00 = r2;
        this.A01 = r3;
        this.A0H = r19;
        this.A0B = r13;
        this.A03 = r5;
        this.A05 = r7;
        this.A08 = r10;
        this.A0F = r17;
        this.A0E = r16;
        this.A02 = r4;
        this.A0G = r18;
        this.A0C = r14;
        this.A0A = r12;
        this.A04 = r6;
        this.A06 = r8;
        this.A07 = r9;
    }

    public AnonymousClass284 A00(C453027w r6, C34861kz r7, Collection collection) {
        if (!this.A04.A0A()) {
            Log.i("contactsyncmethods/network_unavailable");
            return AnonymousClass284.A04;
        }
        AnonymousClass00B.A0F(r6.A00());
        boolean z2 = false;
        if (r7.scope == AnonymousClass28R.MULTI_PROTOCOLS_QUERY) {
            z2 = true;
        }
        AnonymousClass00B.A0F(z2);
        collection.size();
        C452927v r3 = new C452927v(r7);
        r3.A02 = true;
        r3.A00 = r6;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C15830rv r1 = (C15830rv) it.next();
            this.A05.A0A(r1);
            if (r1 != null) {
                r3.A07.add(r1);
            }
        }
        try {
            return (AnonymousClass284) A03(r3.A01(), false).get();
        } catch (InterruptedException | ExecutionException unused) {
            return AnonymousClass284.A03;
        }
    }

    public AnonymousClass284 A01(C452727t r2) {
        if (!this.A04.A0A()) {
            Log.i("contactsyncmethods/network_unavailable");
            return AnonymousClass284.A04;
        }
        try {
            return (AnonymousClass284) A03(r2, false).get();
        } catch (InterruptedException | ExecutionException unused) {
            return AnonymousClass284.A03;
        }
    }

    public C34421kE A02(C453027w r5, C34861kz r6, Collection collection, boolean z2, boolean z3) {
        AnonymousClass00B.A0F(r5.A00());
        boolean z4 = false;
        if (r6.scope == AnonymousClass28R.MULTI_PROTOCOLS_QUERY) {
            z4 = true;
        }
        AnonymousClass00B.A0F(z4);
        collection.size();
        C452927v r3 = new C452927v(r6);
        r3.A02 = z2;
        r3.A00 = r5;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C15830rv r1 = (C15830rv) it.next();
            this.A05.A0A(r1);
            if (r1 != null) {
                r3.A07.add(r1);
            }
        }
        return A03(r3.A01(), z3);
    }

    public final C34421kE A03(C452727t r6, boolean z2) {
        AnonymousClass28Q r4 = new AnonymousClass28Q(z2);
        r6.A03.add(r4);
        C19600yh r3 = this.A06;
        r3.A0R.execute(new RunnableRunnableShape5S0200000_I0_3(r3, 4, r6));
        return r4;
    }

    public void A04() {
        C16040sK r1 = this.A01;
        r1.A0B();
        if (r1.A00 != null && !r1.A0G()) {
            this.A0H.Acl(new RunnableRunnableShape7S0100000_I0_6(this, 5));
        }
    }

    public void A05() {
        AnonymousClass00B.A0D("ContactSyncMethods/requestBackgroundFullSyncWithRetry/should not be executed by companions", !this.A01.A0G());
        C452927v r2 = new C452927v(C34861kz.A03);
        r2.A00 = C453027w.A09;
        r2.A04 = true;
        A03(r2.A01(), true);
    }

    public void A06() {
        AnonymousClass00B.A0D("ContactSyncMethods/requestOnChangeDeltaSync/companions should not perform delta sync", !this.A01.A0G());
        C452927v r1 = new C452927v(this.A0F.A00 == 3 ? C34861kz.A02 : C34861kz.A09);
        r1.A03 = true;
        r1.A04 = true;
        r1.A00 = C453027w.A09;
        A03(r1.A01(), true);
    }

    public void A07() {
        if (!this.A01.A0G()) {
            C452927v r2 = new C452927v(this.A0F.A00 == 3 ? C34861kz.A02 : C34861kz.A09);
            r2.A03 = true;
            r2.A04 = true;
            r2.A00 = C453027w.A09;
            r2.A02 = true;
            A03(r2.A01(), true);
        }
    }

    public final void A08(C453027w r7, C34861kz r8, Collection collection, boolean z2) {
        PowerManager.WakeLock A002;
        PowerManager A0I = this.A08.A0I();
        if (A0I == null) {
            Log.w("contactsyncmethods/forceFullSync pm=null");
            A002 = null;
        } else {
            A002 = C43421zy.A00(A0I, "fullsync", 1);
        }
        if (A002 != null) {
            try {
                A002.acquire();
                Log.i("contactsyncmethods/forceFullSync/wl/acquire");
            } catch (RuntimeException e2) {
                Log.e("contactsyncmethods/forceFullSync", e2);
                this.A00.AcB("contactsyncmethods/forceFullSync", e2.getMessage(), true);
            } catch (Throwable th) {
                if (A002 != null && A002.isHeld()) {
                    A002.release();
                    Log.i("contactsyncmethods/forceFullSync/wl/release");
                }
                throw th;
            }
        }
        C452927v r1 = new C452927v(r8);
        r1.A02 = true;
        r1.A01 = z2;
        r1.A00 = r7;
        r1.A07.addAll(collection);
        A01(r1.A01());
        if (A002 != null && A002.isHeld()) {
            A002.release();
            Log.i("contactsyncmethods/forceFullSync/wl/release");
        }
    }

    public void A09(C16010sH r11) {
        Class<UserJid> cls = UserJid.class;
        Jid A082 = r11.A08(cls);
        if (A082 != null) {
            C16040sK r1 = this.A01;
            r1.A0B();
            if (!A082.equals(r1.A05) && !C16030sJ.A0P(A082) && r11.A0D == null) {
                if (r1.A0G()) {
                    A02(C453027w.A0A, C34861kz.A0C, Collections.singleton(r11.A08(cls)), false, true);
                } else if (!r11.A0h) {
                    C452927v r12 = new C452927v(C34861kz.A0A);
                    r12.A04 = true;
                    r12.A00 = C453027w.A09;
                    r12.A07.add(A082);
                    A03(r12.A01(), true);
                }
            }
        }
    }

    public void A0A(List list) {
        AnonymousClass00B.A0D("ContactSyncMethods/deltaSyncNewOutContact/out contacts should not be synced in companion mode", !this.A01.A0G());
        list.size();
        if (!list.isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Jid A082 = ((C16010sH) it.next()).A08(UserJid.class);
                if (A082 != null) {
                    hashSet.add(A082);
                }
            }
            A02(C453027w.A09, C34861kz.A08, hashSet, false, true);
        }
    }
}
