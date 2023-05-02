package X;

import android.app.Application;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.facebook.redex.IDxFunctionShape206S0100000_2_I0;
import com.facebook.redex.IDxSListenerShape103S0200000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S1200000_I0;
import com.facebook.redex.RunnableRunnableShape5S0200000_I0_3;
import com.obwhatsapp.R;
import com.obwhatsapp.jobqueue.job.GetVNameCertificateJob;
import com.whatsapp.jid.UserJid;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.1wN  reason: invalid class name and case insensitive filesystem */
public class C41681wN extends AnonymousClass02H {
    public int A00;
    public AnonymousClass1ZR A01;
    public AnonymousClass21F A02;
    public C30771cv A03;
    public Runnable A04 = null;
    public String A05;
    public boolean A06;
    public boolean A07 = false;
    public boolean A08;
    public final Handler A09;
    public final AnonymousClass028 A0A;
    public final AnonymousClass027 A0B;
    public final AnonymousClass027 A0C;
    public final AnonymousClass027 A0D;
    public final C14870pt A0E;
    public final C17130ua A0F;
    public final C19000xb A0G;
    public final C16600tK A0H;
    public final C17150uc A0I;
    public final AnonymousClass1U3 A0J;
    public final C18640x1 A0K;
    public final AnonymousClass1KA A0L;
    public final AnonymousClass1KE A0M;
    public final C17030uP A0N;
    public final AnonymousClass2ZO A0O;
    public final C16440t3 A0P;
    public final AnonymousClass013 A0Q;
    public final C18030w2 A0R;
    public final C17190ug A0S;
    public final AnonymousClass5S7 A0T;
    public final C16320sq A0U;
    public final List A0V;

    public C41681wN(Application application, Handler handler, C14870pt r6, C17130ua r7, C19000xb r8, C16600tK r9, C17150uc r10, AnonymousClass1U3 r11, C18640x1 r12, AnonymousClass1KA r13, AnonymousClass1KE r14, C17030uP r15, AnonymousClass2ZO r16, C16440t3 r17, AnonymousClass013 r18, C18030w2 r19, C17190ug r20, C16320sq r21) {
        super(application);
        AnonymousClass027 r2 = new AnonymousClass027();
        this.A0B = r2;
        this.A0A = C05730St.A00(new IDxFunctionShape206S0100000_2_I0(this, 1), r2);
        this.A0C = new AnonymousClass027();
        this.A0D = new AnonymousClass027();
        this.A0V = new LinkedList();
        this.A0T = new C63283Gv(this);
        this.A0P = r17;
        this.A0E = r6;
        this.A0J = r11;
        this.A0U = r21;
        this.A0F = r7;
        this.A0M = r14;
        this.A0G = r8;
        this.A0S = r20;
        this.A0L = r13;
        this.A0R = r19;
        this.A0Q = r18;
        this.A0H = r9;
        this.A0N = r15;
        this.A0K = r12;
        this.A0I = r10;
        this.A0O = r16;
        this.A09 = handler;
    }

    public void A04() {
        for (Runnable run : this.A0V) {
            run.run();
        }
        Runnable runnable = this.A04;
        if (runnable != null) {
            this.A09.removeCallbacks(runnable);
            this.A04 = null;
        }
    }

    public void A05(Editable editable, C50262Yq r7, boolean z2) {
        this.A08 = z2;
        AnonymousClass1ZR r1 = this.A01;
        if (!(r1 instanceof C70653hS)) {
            String A012 = C30931dC.A01(editable.toString());
            A0A(A012);
            r1 = null;
            if (A012 != null && !A012.equals((Object) null)) {
                A0B((String) null);
                AnonymousClass1ZR r0 = this.A01;
                if (r0 == null || !TextUtils.equals(r0.A0W, A012)) {
                    if (this.A0R.A0D(A012)) {
                        UserJid A002 = C18030w2.A00(Uri.parse(A012));
                        if (A002 != null) {
                            A07(r7, A002, A012);
                        }
                        this.A0B.A09(C87664Ya.A00(A012));
                    } else {
                        AnonymousClass1KE r2 = this.A0M;
                        if (r2.A02() && r2.A07.A01(A012)) {
                            this.A01 = new C70643hR(this.A0F, A012);
                            r2.A01(this.A0T, A012);
                        }
                        this.A0B.A09(C87664Ya.A00(A012));
                    }
                    if (this.A01 == null) {
                        boolean z3 = this.A07;
                        Runnable runnable = this.A04;
                        if (runnable != null) {
                            this.A09.removeCallbacks(runnable);
                            this.A04 = null;
                        }
                        if (z3) {
                            A08(r7, A012);
                            return;
                        }
                        RunnableRunnableShape0S1200000_I0 runnableRunnableShape0S1200000_I0 = new RunnableRunnableShape0S1200000_I0(r7, A012, this, 18);
                        this.A04 = runnableRunnableShape0S1200000_I0;
                        this.A09.postDelayed(runnableRunnableShape0S1200000_I0, (long) 700);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        this.A0B.A0B(r1);
    }

    public void A06(AnonymousClass1ZR r3) {
        String str;
        if (this.A00 == 0 && r3 != null && (str = r3.A0W) != null && str.equals(this.A05)) {
            this.A00 = 1;
            this.A01 = r3;
            this.A03 = null;
        }
    }

    public final void A07(C50262Yq r7, UserJid userJid, String str) {
        this.A01 = new C41691wO(this.A0F, userJid, str);
        int dimensionPixelSize = this.A00.getResources().getDimensionPixelSize(R.dimen.dimen07d9);
        C35691mL A062 = this.A0K.A06(userJid);
        if (A062 != null) {
            r7.A02((ImageView) null, A062, (C108515Oh) null, new IDxSListenerShape103S0200000_2_I0(userJid, 1, this), 2);
            return;
        }
        AnonymousClass1KA r2 = this.A0L;
        if (r2.A09(userJid)) {
            int i2 = 1;
            if (r2.A07.A0I(userJid)) {
                i2 = 4;
            }
            r2.A06(userJid, dimensionPixelSize, i2 * 6, false);
            return;
        }
        this.A0U.Acl(new RunnableRunnableShape5S0200000_I0_3(this, 34, userJid));
    }

    public void A08(C50262Yq r4, String str) {
        if (str != null) {
            if (this.A0R.A0D(str)) {
                UserJid A002 = C18030w2.A00(Uri.parse(str));
                if (A002 != null) {
                    A07(r4, A002, str);
                    return;
                }
            } else {
                AnonymousClass1KE r2 = this.A0M;
                if (r2.A02() && r2.A07.A01(str)) {
                    this.A01 = new C70643hR(this.A0F, str);
                    r2.A01(this.A0T, str);
                    return;
                }
            }
            A0C(str);
        }
    }

    public final void A09(UserJid userJid) {
        if (this.A01 != null) {
            C28331Vq A002 = this.A0N.A00(userJid);
            if (A002 != null) {
                AnonymousClass1ZR r1 = this.A01;
                r1.A0K = A002.A08;
                this.A0B.A09(r1);
                return;
            }
            this.A0G.A00(new GetVNameCertificateJob(userJid));
        }
    }

    public void A0A(String str) {
        if (!C34901l3.A00(str, this.A05)) {
            this.A00 = 0;
            this.A05 = str;
            this.A06 = true;
            this.A01 = null;
            this.A03 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001b, code lost:
        if (android.text.TextUtils.equals(r0.A02, r4) == false) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.String r0 = r3.A05
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 == 0) goto L_0x002d
            r0 = 0
            r3.A06 = r0
            r2 = 0
            r3.A01 = r2
            r3.A03 = r2
            X.21F r0 = r3.A02
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r0.A02
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            r1 = 1
            if (r0 != 0) goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            X.21F r0 = r3.A02
            if (r0 == 0) goto L_0x002b
            if (r1 == 0) goto L_0x002b
            X.027 r1 = r3.A0D
            X.1XQ r0 = r0.A01
            r1.A09(r0)
        L_0x002b:
            r3.A02 = r2
        L_0x002d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41681wN.A0B(java.lang.String):void");
    }

    public final void A0C(String str) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C14870pt r2 = this.A0E;
        C16320sq r6 = this.A0U;
        AnonymousClass013 r4 = this.A0Q;
        C102574zB r5 = new C102574zB(this, elapsedRealtime);
        boolean z2 = this.A08;
        C51292bO.A00(r2, new AnonymousClass1ZR(this.A0F, str), r4, r5, r6, str, z2);
    }
}
