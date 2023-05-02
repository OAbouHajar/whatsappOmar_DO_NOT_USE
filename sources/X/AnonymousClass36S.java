package X;

import android.content.Intent;
import android.os.SystemClock;
import com.facebook.redex.IDxIRunnableShape287S0100000_2_I1;
import com.facebook.redex.IDxJRunnableShape410S0100000_2_I1;
import com.facebook.redex.RunnableRunnableShape2S0100000_I0_1;
import com.obwhatsapp.R;
import com.obwhatsapp.acceptinvitelink.AcceptInviteLinkActivity;
import com.whatsapp.util.Log;
import com.whatsapp.util.ViewOnClickCListenerShape0S1100000_I0;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: X.36S  reason: invalid class name */
public class AnonymousClass36S extends C16690tT {
    public int A00;
    public int A01;
    public C16050sL A02;
    public final C16440t3 A03;
    public final C17780vd A04;
    public final String A05;
    public final WeakReference A06;

    public AnonymousClass36S(AcceptInviteLinkActivity acceptInviteLinkActivity, C16440t3 r3, C17780vd r4, String str, int i2) {
        super(acceptInviteLinkActivity, true);
        this.A03 = r3;
        this.A04 = r4;
        this.A06 = C13690nt.A0h(acceptInviteLinkActivity);
        this.A05 = str;
        this.A01 = i2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            this.A04.A03(new IDxJRunnableShape410S0100000_2_I1(this, 0), new IDxIRunnableShape287S0100000_2_I1(this, 0), this.A05).get(32000, TimeUnit.MILLISECONDS);
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (elapsedRealtime2 < 500) {
                SystemClock.sleep(500 - elapsedRealtime2);
                return null;
            }
        } catch (Exception e2) {
            Log.w("acceptlink/sendjoin/failed/timeout", e2);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        int i2;
        AcceptInviteLinkActivity acceptInviteLinkActivity = (AcceptInviteLinkActivity) this.A06.get();
        if (acceptInviteLinkActivity != null) {
            C16050sL r2 = this.A02;
            int i3 = this.A00;
            int i4 = this.A01;
            if (r2 == null) {
                Log.e(C13680ns.A0c(i3, "acceptlink/sendjoin/failed/"));
                boolean A0d = acceptInviteLinkActivity.A0F.A0d(i4);
                if (i3 == 401) {
                    i2 = R.string.str08b8;
                    if (A0d) {
                        i2 = R.string.str08b9;
                    }
                } else if (i3 == 404) {
                    i2 = R.string.str08bc;
                    if (A0d) {
                        i2 = R.string.str08bd;
                    }
                } else if (i3 != 419) {
                    i2 = R.string.str08b7;
                    if (i3 != 429) {
                        if (i3 == 436) {
                            acceptInviteLinkActivity.A36(R.string.str0bbe);
                            acceptInviteLinkActivity.findViewById(R.id.learn_more).setVisibility(0);
                            acceptInviteLinkActivity.findViewById(R.id.learn_more).setOnClickListener(new ViewOnClickCListenerShape0S1100000_I0(acceptInviteLinkActivity));
                            return;
                        } else if (i3 == 409) {
                            Intent A0x = C14750ph.A0q().A0x(acceptInviteLinkActivity, acceptInviteLinkActivity.A0I);
                            AnonymousClass22U.A00(A0x, "AcceptInviteLinkActivity");
                            acceptInviteLinkActivity.A2X(A0x, true);
                            acceptInviteLinkActivity.A0G.A0A(acceptInviteLinkActivity.A0I, (String) null, 0);
                            return;
                        } else if (i3 != 410) {
                            i2 = R.string.str13ad;
                        } else {
                            i2 = R.string.str08be;
                            if (A0d) {
                                i2 = R.string.str08bf;
                            }
                        }
                    }
                } else {
                    i2 = R.string.str08b5;
                    if (A0d) {
                        i2 = R.string.str08c0;
                    }
                }
                acceptInviteLinkActivity.A36(i2);
            } else if (!acceptInviteLinkActivity.A08.A0F(r2) || !acceptInviteLinkActivity.A0A.A09(r2)) {
                Log.i(AnonymousClass000.A0g("acceptlink/sendjoin/willwait/", r2));
                StringBuilder A0r = AnonymousClass000.A0r("acceptlink/wait/");
                A0r.append(acceptInviteLinkActivity.A0I);
                C13680ns.A1V(A0r);
                Runnable runnable = acceptInviteLinkActivity.A0L;
                if (runnable == null) {
                    runnable = new RunnableRunnableShape2S0100000_I0_1(acceptInviteLinkActivity, 26);
                    acceptInviteLinkActivity.A0L = runnable;
                }
                acceptInviteLinkActivity.A05.A0L(runnable, 32000);
            } else {
                Log.i(AnonymousClass000.A0g("acceptlink/processcode/exists/", r2));
                Intent A0x2 = C14750ph.A0q().A0x(acceptInviteLinkActivity, r2);
                AnonymousClass22U.A00(A0x2, "AcceptInviteLinkActivity");
                acceptInviteLinkActivity.A2X(A0x2, true);
            }
        }
    }
}
