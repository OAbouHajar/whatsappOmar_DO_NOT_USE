package X;

import android.content.Intent;
import android.os.SystemClock;
import com.facebook.redex.IDxIRunnableShape287S0100000_2_I1;
import com.facebook.redex.RunnableRunnableShape10S0100000_I0_9;
import com.obwhatsapp.R;
import com.obwhatsapp.invites.ViewGroupInviteActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

/* renamed from: X.36Q  reason: invalid class name */
public class AnonymousClass36Q extends C16690tT {
    public int A00;
    public C16050sL A01;
    public final C16440t3 A02;
    public final C17780vd A03;
    public final C84824Ma A04;
    public final WeakReference A05;

    public AnonymousClass36Q(C16440t3 r2, C17780vd r3, ViewGroupInviteActivity viewGroupInviteActivity, C84824Ma r5) {
        this.A02 = r2;
        this.A03 = r3;
        this.A05 = C13690nt.A0h(viewGroupInviteActivity);
        this.A04 = r5;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C17780vd r13 = this.A03;
        C84824Ma r1 = this.A04;
        AnonymousClass4EO r12 = new AnonymousClass4EO(this);
        IDxIRunnableShape287S0100000_2_I1 iDxIRunnableShape287S0100000_2_I1 = new IDxIRunnableShape287S0100000_2_I1(this, 2);
        C16050sL r8 = r1.A01;
        C17190ug r24 = r13.A02;
        String A022 = r24.A02();
        C29951bV r14 = new C29951bV();
        C612438d r10 = new C612438d(r8, new C51812cK(A022));
        String str = r1.A03;
        long j2 = r1.A00;
        Long valueOf = Long.valueOf(j2);
        UserJid userJid = r1.A02;
        C32461gQ r6 = new C32461gQ("iq");
        C32461gQ r5 = new C32461gQ("accept");
        if (C32271fx.A0D(str, 16, 16, false)) {
            C32461gQ.A00(r5, "code", str);
        }
        if (C32271fx.A0B(valueOf, 0, false)) {
            r5.A02(new C35081lL("expiration", j2));
        }
        if (C32271fx.A0C(userJid, "accept->admin")) {
            r5.A02(new C35081lL((Jid) userJid, "admin"));
        }
        r6.A03(r5.A01());
        r6.A05(r10.A00, AnonymousClass000.A0u());
        r10.A00(r6, Collections.EMPTY_LIST);
        C28371Vv A012 = r6.A01();
        r24.A0A(new AnonymousClass51J(r14, r13, r12, r8, iDxIRunnableShape287S0100000_2_I1), A012, A022, 209, 32000);
        try {
            r14.get(32000, TimeUnit.MILLISECONDS);
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (elapsedRealtime2 < 500) {
                SystemClock.sleep(500 - elapsedRealtime2);
                return null;
            }
        } catch (Exception e2) {
            Log.w("ViewGroupInviteActivityJoinGroupTask send join timed out", e2);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        int i2;
        ViewGroupInviteActivity viewGroupInviteActivity = (ViewGroupInviteActivity) this.A05.get();
        if (viewGroupInviteActivity != null) {
            C16050sL r1 = this.A01;
            int i3 = this.A00;
            if (r1 == null) {
                if (i3 != 400) {
                    i2 = R.string.str0a76;
                    if (i3 != 404) {
                        i2 = R.string.str0a77;
                        if (i3 != 419) {
                            if (i3 != 500) {
                                i2 = R.string.str0a74;
                                if (i3 != 409) {
                                    i2 = R.string.str0a78;
                                    if (i3 != 410) {
                                        i2 = R.string.str13ad;
                                    }
                                }
                            }
                        }
                    }
                    viewGroupInviteActivity.A35(i2);
                }
                i2 = R.string.str0a75;
                viewGroupInviteActivity.A35(i2);
            } else if (!viewGroupInviteActivity.A0D.A0F(r1) || !viewGroupInviteActivity.A0G.A09(r1)) {
                Runnable runnable = viewGroupInviteActivity.A0Q;
                if (runnable == null) {
                    runnable = new RunnableRunnableShape10S0100000_I0_9((Object) viewGroupInviteActivity, 11);
                    viewGroupInviteActivity.A0Q = runnable;
                }
                viewGroupInviteActivity.A05.A0L(runnable, 32000);
            } else {
                Intent A0x = C14750ph.A0q().A0x(viewGroupInviteActivity, r1);
                AnonymousClass22U.A00(A0x, "ViewGroupInviteActivity:onGroupJoined");
                viewGroupInviteActivity.A2X(A0x, true);
            }
        }
    }
}
