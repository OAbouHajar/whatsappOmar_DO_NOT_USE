package X;

import android.content.SharedPreferences;
import android.os.Message;
import android.text.TextUtils;
import com.AssemMods.fakechat.utils.AppUtils;
import com.facebook.redex.RunnableRunnableShape0S0800000_I0;
import com.facebook.redex.RunnableRunnableShape12S0100000_I0_11;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.1RI  reason: invalid class name */
public class AnonymousClass1RI implements C18950xW, C19420yP {
    public final C16300so A00;
    public final C16040sK A01;
    public final C16000sG A02;
    public final AnonymousClass16U A03;
    public final C15860rz A04;
    public final AnonymousClass137 A05;
    public final C19810z2 A06;
    public final AnonymousClass124 A07;
    public final C207811o A08;
    public final AnonymousClass1WA A09;
    public final C16320sq A0A;

    public AnonymousClass1RI(C16300so r3, C16040sK r4, C16000sG r5, AnonymousClass16U r6, C15860rz r7, AnonymousClass137 r8, C19810z2 r9, AnonymousClass124 r10, C207811o r11, C16320sq r12) {
        this.A00 = r3;
        this.A0A = r12;
        this.A01 = r4;
        this.A07 = r10;
        this.A02 = r5;
        this.A03 = r6;
        this.A06 = r9;
        this.A08 = r11;
        this.A04 = r7;
        this.A05 = r8;
        this.A09 = new AnonymousClass1WA(r12, false);
    }

    public final synchronized void A00() {
        C15860rz r3 = this.A04;
        Set<String> stringSet = ((SharedPreferences) r3.A01.get()).getStringSet("pending_side_list_hash", new HashSet());
        AnonymousClass00B.A06(stringSet);
        stringSet.size();
        if (!stringSet.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (String r4 : stringSet) {
                arrayList.add(new C52712eK((C30641ci) null, r4));
            }
            this.A09.execute(new RunnableRunnableShape0S0800000_I0(this.A00, this.A01, this.A07, this.A02, this.A03, this.A06, this.A05, arrayList, 2));
            r3.A0K().remove("pending_side_list_hash").apply();
        }
    }

    public int[] ACW() {
        return new int[]{204};
    }

    public boolean AHS(Message message, int i2) {
        boolean z2;
        long A0E;
        C52712eK r16;
        boolean z3 = false;
        if (i2 != 204) {
            return false;
        }
        Message message2 = message;
        C30641ci r3 = (C30641ci) message2.getData().getParcelable("stanzaKey");
        AnonymousClass00B.A07(r3, "stanzaKey is null");
        C52282dU r1 = (C52282dU) this.A08.A00(2, r3.A00);
        if (r1 != null) {
            r1.A00(3);
        }
        C19810z2 r8 = this.A06;
        C28371Vv r6 = (C28371Vv) message2.obj;
        C28371Vv A0I = r6.A0I(0);
        if (!(r1 == null || A0I == null)) {
            r1.A00 = A0I.A00;
        }
        if (r6.A0J("update") != null) {
            z2 = true;
            r16 = new C52712eK(r3, r6.A0K("update").A0M("hash"));
        } else {
            z2 = false;
            C28371Vv A0J = r6.A0J("add");
            C28371Vv A0J2 = r6.A0J("remove");
            C28371Vv r4 = A0J2;
            if (A0J != null) {
                r4 = A0J;
            }
            C16300so r11 = this.A00;
            Jid A0F = r6.A0F(r11, AnonymousClass1ZX.class, "lid");
            if (r4 != null) {
                String A0M = r4.A0M("device_hash");
                byte[] bArr = null;
                String A0N = r4.A0N("device_lid_hash", (String) null);
                C28371Vv A0J3 = r4.A0J("key-index-list");
                AnonymousClass01Q r42 = (A0F == null || A0N == null) ? null : new AnonymousClass01Q(A0F, A0N);
                UserJid userJid = (UserJid) r6.A0G(r11, UserJid.class, "from");
                AnonymousClass00B.A06(A0M);
                C17930vs A012 = AnonymousClass251.A01(r11, A0J);
                C17930vs A013 = AnonymousClass251.A01(r11, A0J2);
                if (A0J3 == null) {
                    A0E = 0;
                } else {
                    bArr = A0J3.A01;
                    A0E = A0J3.A0E(A0J3.A0M(AppUtils.HANDLER_TS_KEY), AppUtils.HANDLER_TS_KEY);
                }
                r16 = new C52712eK(r42, A012, A013, userJid, r3, A0M, bArr, A0E);
            } else {
                Log.e("DeviceUpdateNotificationHandler/handleXmppMessage/unknown type of device notification.");
                throw new AnonymousClass1W9("unknown device notification not found");
            }
        }
        if (r6.A0N("offline", (String) null) != null) {
            z3 = true;
        }
        if (z2) {
            if (z3) {
                String str = r16.A09;
                synchronized (this) {
                    if (!TextUtils.isEmpty(str)) {
                        C15860rz r43 = this.A04;
                        Set<String> stringSet = ((SharedPreferences) r43.A01.get()).getStringSet("pending_side_list_hash", new HashSet());
                        AnonymousClass00B.A06(stringSet);
                        if (stringSet.add(str)) {
                            r43.A0K().putStringSet("pending_side_list_hash", stringSet).apply();
                        }
                    }
                }
            }
            AnonymousClass1WA r7 = this.A09;
            C16300so r62 = this.A00;
            C16040sK r5 = this.A01;
            AnonymousClass124 r44 = this.A07;
            C16300so r17 = r62;
            C16040sK r18 = r5;
            AnonymousClass124 r19 = r44;
            r7.execute(new RunnableRunnableShape0S0800000_I0(r17, r18, r19, this.A02, this.A03, r8, this.A05, Collections.singletonList(r16), 2));
            return true;
        }
        if (z3) {
            AnonymousClass16U r45 = this.A03;
            if (r45.A06.A0E(C16620tM.A02, 560)) {
                UserJid userJid2 = r16.A06;
                AnonymousClass00B.A06(userJid2);
                Set singleton = Collections.singleton(userJid2);
                synchronized (r45) {
                    Set A002 = r45.A00();
                    if (A002.addAll(singleton)) {
                        r45.A05.A0K().putStringSet("pending_users_to_sync_device", new HashSet(Arrays.asList(C16030sJ.A0T(A002)))).apply();
                    }
                }
            }
        }
        AnonymousClass1WA r72 = this.A09;
        C16300so r622 = this.A00;
        C16040sK r52 = this.A01;
        AnonymousClass124 r442 = this.A07;
        C16300so r172 = r622;
        C16040sK r182 = r52;
        AnonymousClass124 r192 = r442;
        r72.execute(new RunnableRunnableShape0S0800000_I0(r172, r182, r192, this.A02, this.A03, r8, this.A05, Collections.singletonList(r16), 2));
        return true;
        this.A07.A02(r3);
        return true;
    }

    public /* synthetic */ void ARy() {
    }

    public /* synthetic */ void ARz() {
    }

    public /* synthetic */ void AS0() {
    }

    public void AS1() {
        if (this.A03.A06.A0E(C16620tM.A02, 560)) {
            this.A0A.Acl(new RunnableRunnableShape12S0100000_I0_11((Object) this, 35));
        }
    }
}
