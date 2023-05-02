package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.AssemMods.fakechat.utils.AppUtils;
import com.facebook.redex.RunnableRunnableShape0S2100000_I0;
import com.facebook.redex.RunnableRunnableShape3S0200000_I0_1;
import com.facebook.redex.RunnableRunnableShape9S0200000_I0_7;
import com.mod2.fblibs.FacebookFacade;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.13A  reason: invalid class name */
public class AnonymousClass13A extends C208111r {
    public final C16300so A00;
    public final C14870pt A01;
    public final C16040sK A02;
    public final C211212w A03;
    public final AnonymousClass138 A04;
    public final AnonymousClass01Y A05;
    public final AnonymousClass139 A06;
    public final AnonymousClass12A A07;
    public final C16440t3 A08;
    public final C15860rz A09;
    public final C19410yO A0A;
    public final AnonymousClass137 A0B;
    public final C18600wx A0C;
    public final C14710pd A0D;
    public final AnonymousClass134 A0E;
    public final AnonymousClass135 A0F;
    public final AnonymousClass133 A0G;

    public AnonymousClass13A(C16300so r9, C14870pt r10, C16040sK r11, C211212w r12, AnonymousClass138 r13, AnonymousClass01Y r14, AnonymousClass139 r15, AnonymousClass12A r16, C16440t3 r17, C15860rz r18, C19410yO r19, AnonymousClass137 r20, C18600wx r21, C14710pd r22, C17190ug r23, C207811o r24, AnonymousClass134 r25, AnonymousClass135 r26, AnonymousClass133 r27, C16320sq r28) {
        super(r9, r23, r24, r28, new int[]{203}, false);
        this.A08 = r17;
        this.A0D = r22;
        this.A01 = r10;
        this.A03 = r12;
        this.A00 = r9;
        this.A02 = r11;
        this.A05 = r14;
        this.A0E = r25;
        this.A07 = r16;
        this.A0F = r26;
        this.A09 = r18;
        this.A0B = r20;
        this.A04 = r13;
        this.A0A = r19;
        this.A06 = r15;
        this.A0C = r21;
        this.A0G = r27;
    }

    public void A01(C28371Vv r12, int i2) {
        AnonymousClass134 r3;
        AnonymousClass29X r0;
        boolean z2;
        C28371Vv A0H = r12.A0H();
        String str = A0H.A00;
        if ("status".equals(str)) {
            if ("modify".equals(A0H.A0N("action", (String) null))) {
                r3 = this.A0E;
                r0 = new AnonymousClass29X();
                z2 = true;
                r0.A05 = true;
            } else {
                this.A01.A0K(new RunnableRunnableShape0S2100000_I0(this, A0H.A0L(), A0H.A0N("dhash", (String) null), 7));
                return;
            }
        } else if (FacebookFacade.RequestParameter.PICTURE.equals(str)) {
            if ("modify".equals(A0H.A0N("action", (String) null))) {
                r3 = this.A0E;
                r0 = new AnonymousClass29X();
                z2 = true;
                r0.A03 = true;
            } else if (A0H.A0J("delete") != null) {
                AnonymousClass12A r1 = this.A07;
                C16040sK r02 = this.A02;
                r02.A0B();
                r1.A03(r02.A05);
                return;
            } else {
                return;
            }
        } else if ("devices".equals(str)) {
            boolean z3 = false;
            if (r12.A0N("offline", (String) null) != null) {
                z3 = true;
            }
            boolean equals = "modify".equals(A0H.A0N("action", (String) null));
            if ("critical_sync_timeout".equals(A0H.A0N("reason", (String) null))) {
                this.A06.A01().edit().putLong("syncd_bootstrap_fail_time", this.A08.A00()).apply();
            }
            if (equals || z3) {
                r3 = this.A0E;
                r0 = new AnonymousClass29X();
                z2 = true;
                r0.A02 = true;
            } else if (!A0H.A0O("device").isEmpty()) {
                C28371Vv A0J = A0H.A0J("key-index-list");
                if (((SharedPreferences) this.A09.A01.get()).getLong("adv_timestamp_sec", -1) <= (A0J == null ? 0 : A0J.A0E(A0J.A0M(AppUtils.HANDLER_TS_KEY), AppUtils.HANDLER_TS_KEY))) {
                    this.A01.A0K(new RunnableRunnableShape9S0200000_I0_7(this, 49, AnonymousClass251.A01(this.A00, A0H)));
                    return;
                }
                return;
            } else {
                return;
            }
        } else if ("privacy".equals(str)) {
            if ("modify".equals(A0H.A0N("action", (String) null))) {
                r3 = this.A0E;
                r0 = new AnonymousClass29X();
                z2 = true;
                r0.A04 = true;
            } else if (!A0H.A0O("category").isEmpty()) {
                HashMap hashMap = new HashMap();
                for (C28371Vv r2 : A0H.A0O("category")) {
                    hashMap.put(r2.A0M(FacebookFacade.RequestParameter.NAME), r2.A0M("value"));
                }
                this.A04.A02(hashMap);
                return;
            } else {
                return;
            }
        } else if ("blocklist".equals(str)) {
            String string = ((SharedPreferences) this.A09.A01.get()).getString("block_list_v2_dhash", (String) null);
            String A0N = A0H.A0N("prev_dhash", (String) null);
            if ("modify".equals(A0H.A0N("action", (String) null)) || !TextUtils.equals(string, A0N)) {
                r3 = this.A0E;
                r0 = new AnonymousClass29X();
                z2 = true;
                r0.A01 = true;
            } else if (!A0H.A0O("item").isEmpty()) {
                C16300so r5 = this.A00;
                HashMap hashMap2 = new HashMap();
                HashMap hashMap3 = new HashMap();
                for (C28371Vv r9 : A0H.A0O("item")) {
                    Jid A0G2 = r9.A0G(r5, UserJid.class, "jid");
                    hashMap2.put(A0G2, Boolean.valueOf("block".equals(r9.A0M("action"))));
                    String A0N2 = r9.A0N("display_name", (String) null);
                    if (!AnonymousClass1ZW.A0E(A0N2) && (A0G2 instanceof AnonymousClass1ZX)) {
                        hashMap3.put(A0G2, A0N2);
                    }
                }
                HashSet<UserJid> hashSet = new HashSet<>();
                HashSet<UserJid> hashSet2 = new HashSet<>();
                for (Map.Entry entry : hashMap2.entrySet()) {
                    boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
                    Object key = entry.getKey();
                    if (booleanValue) {
                        hashSet.add(key);
                    } else {
                        hashSet2.add(key);
                    }
                }
                AnonymousClass01Y r4 = this.A05;
                String A0N3 = A0H.A0N("dhash", (String) null);
                Set set = r4.A0Z;
                hashSet.removeAll(set);
                hashSet2.retainAll(set);
                if (!hashSet.isEmpty() || !hashSet2.isEmpty()) {
                    for (UserJid A0M : hashSet) {
                        r4.A0M(A0M, true);
                    }
                    for (UserJid A0M2 : hashSet2) {
                        r4.A0M(A0M2, false);
                    }
                    synchronized (r4) {
                        set.addAll(hashSet);
                        set.removeAll(hashSet2);
                        r4.A0B.A00(r4.A08());
                        r4.A0J.A0r(A0N3);
                        r4.A0Q.A01(hashMap3);
                        HashSet hashSet3 = new HashSet(hashSet);
                        hashSet3.addAll(hashSet2);
                        r4.A07.A0K(new RunnableRunnableShape3S0200000_I0_1(r4, 23, hashSet3));
                    }
                    return;
                }
                return;
            } else {
                return;
            }
        } else if ("tos".equals(str)) {
            if (this.A0D.A0E(C16620tM.A02, 877)) {
                this.A0F.A02(C53902gU.A00(r12));
                return;
            }
            return;
        } else if ("disappearing_mode".equals(str)) {
            int A0A2 = A0H.A0A("duration", 0);
            long millis = TimeUnit.SECONDS.toMillis(A0H.A0D("t", 0));
            C18600wx r6 = this.A0C;
            if (r6.A05.A00().getLong("disappearing_mode_timestamp", 0) < millis) {
                r6.A05(A0A2, millis);
                return;
            }
            return;
        } else {
            return;
        }
        r3.A00(new AnonymousClass29Y(r0), false, z2, false);
    }
}
