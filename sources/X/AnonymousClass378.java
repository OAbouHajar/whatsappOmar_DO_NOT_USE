package X;

import android.os.SystemClock;
import com.facebook.redex.IDxIResponseShape359S0100000_2_I1;
import com.facebook.redex.IDxRCallbackShape12S0300000_1_I1;
import com.mod2.fblibs.FacebookFacade;
import com.obwhatsapp.R;
import com.obwhatsapp.invites.ViewGroupInviteActivity;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: X.378  reason: invalid class name */
public class AnonymousClass378 extends C16690tT {
    public int A00;
    public C85534Ov A01;
    public final C16040sK A02;
    public final C16000sG A03;
    public final C16080sP A04;
    public final C16440t3 A05;
    public final C15810rt A06;
    public final C16070sO A07;
    public final C17780vd A08;
    public final C17190ug A09;
    public final C84824Ma A0A;
    public final C30071bh A0B;
    public final WeakReference A0C;

    public AnonymousClass378(C16040sK r2, C16000sG r3, C16080sP r4, C16440t3 r5, C15810rt r6, C16070sO r7, C17780vd r8, ViewGroupInviteActivity viewGroupInviteActivity, C17190ug r10, C84824Ma r11, C30071bh r12) {
        this.A05 = r5;
        this.A02 = r2;
        this.A06 = r6;
        this.A09 = r10;
        this.A03 = r3;
        this.A04 = r4;
        this.A08 = r8;
        this.A07 = r7;
        this.A0C = C13690nt.A0h(viewGroupInviteActivity);
        this.A0B = r12;
        this.A0A = r11;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C16010sH A082;
        if (this.A0B.A11.A02) {
            C16050sL A032 = C16050sL.A03(this.A0A.A01);
            AnonymousClass00B.A06(A032);
            C16000sG r0 = this.A03;
            C16010sH A0A2 = r0.A0A(A032);
            UserJid userJid = null;
            if (!(A032 == null || (A082 = r0.A08(A032)) == null)) {
                userJid = A082.A0F;
            }
            C17380uz A042 = C16070sO.A00(this.A07, A032).A04();
            HashSet hashSet = new HashSet(A042.size());
            C28031Ub it = A042.iterator();
            while (it.hasNext()) {
                hashSet.add(((C30661ck) it.next()).A03);
            }
            long A012 = C29501aj.A01(A0A2.A0R, Long.MIN_VALUE);
            HashSet hashSet2 = hashSet;
            A0B(A032, userJid, A0A2.A0H, this.A04.A08(A0A2), (String) null, hashSet2, hashSet.size(), this.A06.A02(A032), 0, A012);
        } else {
            try {
                this.A09.A07(32000);
                long elapsedRealtime = SystemClock.elapsedRealtime();
                C17780vd r8 = this.A08;
                C84824Ma r12 = this.A0A;
                IDxIResponseShape359S0100000_2_I1 iDxIResponseShape359S0100000_2_I1 = new IDxIResponseShape359S0100000_2_I1(this, 1);
                C17190ug r6 = r8.A02;
                String A022 = r6.A02();
                C35081lL[] r10 = new C35081lL[3];
                boolean A033 = C35081lL.A03("code", r12.A03, r10);
                C35081lL.A02("expiration", Long.toString(r12.A00), r10, 1);
                r10[2] = new C35081lL((Jid) r12.A02, "admin");
                C28371Vv r13 = new C28371Vv(new C28371Vv("add_request", r10), "query", (C35081lL[]) null);
                C35081lL[] r102 = new C35081lL[4];
                C35081lL.A02("id", A022, r102, A033 ? 1 : 0);
                C35081lL.A02("xmlns", "w:g2", r102, 1);
                C35081lL.A02("type", "get", r102, 2);
                C28371Vv A034 = C28371Vv.A03(r12.A01, r13, r102, 3);
                C29951bV r4 = new C29951bV();
                r6.A0A(new IDxRCallbackShape12S0300000_1_I1(r4, r8, iDxIResponseShape359S0100000_2_I1, A033), A034, A022, 208, 32000);
                try {
                    r4.get(32000, TimeUnit.MILLISECONDS);
                    long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (elapsedRealtime2 < 500) {
                        SystemClock.sleep(500 - elapsedRealtime2);
                        return null;
                    }
                } catch (Exception e2) {
                    Log.w("ViewGroupInviteActivity/failed/timeout", e2);
                    return null;
                }
            } catch (C34541kR unused) {
            }
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C16010sH A082;
        ViewGroupInviteActivity viewGroupInviteActivity = (ViewGroupInviteActivity) this.A0C.get();
        if (viewGroupInviteActivity != null) {
            C85534Ov r6 = this.A01;
            int i2 = this.A00;
            if (r6 != null) {
                viewGroupInviteActivity.A03.setVisibility(0);
                C48702Op r5 = viewGroupInviteActivity.A0J;
                C84824Ma r0 = viewGroupInviteActivity.A0O;
                AnonymousClass00B.A06(r0);
                r5.A01(r6, r0.A00 * 1000);
                viewGroupInviteActivity.A04.setVisibility(8);
                C84824Ma r3 = viewGroupInviteActivity.A0O;
                if (r3 == null) {
                    return;
                }
                if (!viewGroupInviteActivity.A0R || (A082 = viewGroupInviteActivity.A08.A08(r3.A01)) == null) {
                    C17780vd r62 = viewGroupInviteActivity.A0I;
                    C84824Ma r52 = viewGroupInviteActivity.A0O;
                    C48692Om r4 = new C48692Om(viewGroupInviteActivity);
                    C17190ug r11 = r62.A02;
                    String A022 = r11.A02();
                    C35081lL[] r9 = new C35081lL[3];
                    boolean A032 = C35081lL.A03("code", r52.A03, r9);
                    r9[1] = new C35081lL("expiration", Long.toString(r52.A00));
                    r9[2] = new C35081lL((Jid) r52.A02, "admin");
                    C28371Vv r92 = new C28371Vv(new C28371Vv("add_request", r9), FacebookFacade.RequestParameter.PICTURE, (C35081lL[]) null);
                    C35081lL[] r8 = new C35081lL[4];
                    C35081lL.A02("id", A022, r8, A032 ? 1 : 0);
                    C35081lL.A02("xmlns", "w:profile:picture", r8, 1);
                    r8[2] = new C35081lL((Jid) r52.A01, "to");
                    C35081lL.A02("type", "get", r8, 3);
                    r11.A0A(new IDxRCallbackShape12S0300000_1_I1(r52, r62, r4, 1), C28371Vv.A04(r92, r8), A022, 212, 32000);
                    return;
                }
                viewGroupInviteActivity.A0A.A06(viewGroupInviteActivity.A05, A082);
                return;
            }
            viewGroupInviteActivity.A03.setVisibility(4);
            viewGroupInviteActivity.A04.setVisibility(4);
            int i3 = R.string.str0aa1;
            if (i2 != 403) {
                if (i2 == 404 || i2 == 406) {
                    boolean A0d = viewGroupInviteActivity.A0H.A0d(viewGroupInviteActivity.A00);
                    i3 = R.string.str0aa0;
                    if (A0d) {
                        i3 = R.string.str0aa2;
                    }
                } else {
                    boolean A0d2 = viewGroupInviteActivity.A0H.A0d(viewGroupInviteActivity.A00);
                    i3 = R.string.str0a9f;
                    if (A0d2) {
                        i3 = R.string.str0f0e;
                    }
                }
            }
            viewGroupInviteActivity.A35(i3);
        }
    }

    public final void A0B(C16050sL r13, UserJid userJid, C30371cF r15, String str, String str2, Collection collection, int i2, int i3, int i4, long j2) {
        ArrayList A0i = C13690nt.A0i(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C16010sH A082 = this.A03.A08(C13700nu.A0B(it));
            if (!(A082 == null || A082.A0D == null)) {
                A0i.add(A082);
            }
        }
        Collections.sort(A0i, new C76443tv(this.A02, this.A04, this));
        this.A01 = new C85534Ov(r13, userJid, r15, str, str2, A0i, i2, i3, i4, j2);
    }
}
