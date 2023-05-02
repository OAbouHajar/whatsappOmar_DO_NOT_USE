package X;

import android.app.Activity;
import android.content.SharedPreferences;
import com.facebook.redex.RunnableRunnableShape3S0200000_I0_1;
import com.facebook.redex.RunnableRunnableShape4S0100000_I0_3;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.25z  reason: invalid class name and case insensitive filesystem */
public class C448725z {
    public boolean A00;
    public final Activity A01;
    public final C16300so A02;
    public final C14870pt A03;
    public final AnonymousClass1ZI A04;
    public final AnonymousClass01Y A05;
    public final AnonymousClass1ZJ A06;
    public final AnonymousClass26U A07;
    public final C17140ub A08;
    public final C15860rz A09;
    public final C17580vJ A0A;
    public final AnonymousClass15H A0B;
    public final C20260zl A0C;
    public final C17190ug A0D;
    public final Runnable A0E = new RunnableRunnableShape4S0100000_I0_3(this, 21);
    public final Runnable A0F = new RunnableRunnableShape4S0100000_I0_3(this, 22);
    public final boolean A0G;

    public C448725z(Activity activity, C16300so r4, C14870pt r5, AnonymousClass1ZI r6, AnonymousClass01Y r7, AnonymousClass1ZJ r8, AnonymousClass26U r9, C17140ub r10, C15860rz r11, C17580vJ r12, AnonymousClass15H r13, C20260zl r14, C17190ug r15, boolean z2) {
        this.A0B = r13;
        this.A01 = activity;
        this.A03 = r5;
        this.A02 = r4;
        this.A0C = r14;
        this.A0D = r15;
        this.A05 = r7;
        this.A08 = r10;
        this.A0A = r12;
        this.A09 = r11;
        this.A04 = r6;
        this.A0G = z2;
        this.A06 = r8;
        this.A07 = r9;
    }

    public void A00() {
        StringBuilder sb = new StringBuilder("blocklistresponsehandler/general_request_timeout jid=");
        sb.append(this.A06.A04);
        Log.i(sb.toString());
        this.A03.Acq(this.A0E);
    }

    public void A01() {
        C28371Vv r2;
        C17190ug r4 = this.A0D;
        String A022 = r4.A02();
        C20260zl r1 = this.A0C;
        AnonymousClass1ZJ r22 = this.A06;
        if (C40561uK.A00(r22.A03, r1)) {
            AnonymousClass51C r7 = new AnonymousClass51C(new C100694w3(this), r4);
            boolean z2 = r22.A09;
            StringBuilder sb = new StringBuilder("SetChatPsaBlockingStatusHelper/setChatPsaBlockingStatus to ");
            sb.append(z2);
            Log.i(sb.toString());
            C17190ug r6 = r7.A01;
            String A023 = r6.A02();
            C32461gQ r42 = new C32461gQ("iq");
            r42.A02(new C35081lL((Jid) C34791ks.A00, "to"));
            r42.A02(new C35081lL("xmlns", "w:comms:chat"));
            r42.A02(new C35081lL("id", A023));
            r42.A02(new C35081lL("type", "set"));
            C32461gQ r3 = new C32461gQ("blocking");
            r3.A02(new C35081lL("action", z2 ? "block" : "unblock"));
            r42.A03(r3.A01());
            r6.A0A(r7, r42.A01(), A023, 339, 0);
            return;
        }
        UserJid userJid = r22.A04;
        boolean A0M = C16030sJ.A0M(userJid);
        if (A0M) {
            r22.A00 = this.A0A.A01((AnonymousClass1ZX) userJid);
        }
        if (r22.A00 != null && A0M) {
            r22.A02 = Boolean.FALSE.equals(this.A0B.A01((AnonymousClass1ZX) userJid));
        }
        AnonymousClass3GU r10 = new AnonymousClass3GU(this.A02, new AnonymousClass4Q7(this), this.A09, r4);
        AnonymousClass26U r62 = this.A07;
        Log.i("blocklistv2setprotocolhelper/sendSetBlocklistRequest");
        C17190ug r9 = r10.A03;
        String string = ((SharedPreferences) r10.A02.A01.get()).getString("block_list_v2_dhash", (String) null);
        ArrayList arrayList = new ArrayList();
        boolean z3 = r22.A09;
        arrayList.add(new C35081lL("action", z3 ? "block" : "unblock"));
        UserJid userJid2 = r22.A00;
        if (userJid2 == null) {
            userJid2 = userJid;
        }
        arrayList.add(new C35081lL((Jid) userJid2, "jid"));
        if (!AnonymousClass1ZW.A0E(string)) {
            arrayList.add(new C35081lL("dhash", string));
        }
        if (r22.A02) {
            arrayList.add(new C35081lL("lid_notify", "true"));
        }
        C35081lL[] r43 = (C35081lL[]) arrayList.toArray(new C35081lL[0]);
        if (!z3) {
            r2 = null;
        } else {
            Boolean bool = r22.A05;
            String str = bool == null ? "none" : bool.booleanValue() ? "true" : "false";
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new C35081lL("first_message", str));
            String str2 = r22.A07;
            if (str2 != null) {
                arrayList2.add(new C35081lL("reason", str2));
                String str3 = r22.A08;
                if (str3 != null) {
                    arrayList2.add(new C35081lL("reason_description", str3));
                }
            }
            String str4 = r22.A06;
            if (str4 != null) {
                arrayList2.add(new C35081lL("entry_point", str4));
            }
            if (r62 != null) {
                arrayList2.add(new C35081lL("business_discovery_entry_point", r62.A03));
                arrayList2.add(new C35081lL("business_discovery_timestamp", r62.A00));
                String str5 = r62.A02;
                if (str5 != null) {
                    arrayList2.add(new C35081lL("business_discovery_id", str5));
                }
            }
            r2 = new C28371Vv("biz_opt_out", (C35081lL[]) arrayList2.toArray(new C35081lL[0]));
        }
        r9.A0G(r10, new C28371Vv(new C28371Vv(r2, "item", r43), "iq", new C35081lL[]{new C35081lL((Jid) C34791ks.A00, "to"), new C35081lL("id", A022), new C35081lL("type", "set"), new C35081lL("xmlns", "blocklist")}), A022, 2, 20000);
    }

    public void A02(int i2) {
        StringBuilder sb = new StringBuilder("blocklistresponsehandler/general_request_failed ");
        sb.append(i2);
        sb.append(" | ");
        sb.append(this.A06.A04);
        Log.i(sb.toString());
        this.A03.Acq(this.A0F);
    }

    public void A03(String str) {
        AnonymousClass1ZJ r7 = this.A06;
        UserJid userJid = r7.A04;
        boolean z2 = r7.A09;
        if (z2) {
            AnonymousClass01Y r3 = this.A05;
            r3.A0Y.Acl(new RunnableRunnableShape3S0200000_I0_1(r3, 26, r7));
        }
        AnonymousClass01Y r4 = this.A05;
        r4.A0Y.Acl(new RunnableRunnableShape3S0200000_I0_1(r4, 27, r7));
        StringBuilder sb = new StringBuilder("blocklistresponsehandler/general_request_success jid=");
        sb.append(userJid);
        Log.i(sb.toString());
        this.A00 = true;
        UserJid A052 = r4.A05(userJid);
        synchronized (r4) {
            if (z2) {
                Set set = r4.A0Z;
                boolean add = set.add(userJid);
                if (A052 != null) {
                    set.add(A052);
                }
                if (add) {
                    r4.A0L(userJid, str, true);
                    if (A052 != null) {
                        r4.A0L(A052, str, true);
                    }
                }
            } else {
                Set set2 = r4.A0Z;
                boolean remove = set2.remove(userJid);
                if (A052 != null) {
                    set2.remove(A052);
                }
                if (remove) {
                    r4.A0L(userJid, str, false);
                    if (A052 != null) {
                        r4.A0L(A052, str, false);
                    }
                }
            }
        }
        this.A03.Acq(this.A0F);
    }
}
