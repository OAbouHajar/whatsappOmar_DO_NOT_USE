package X;

import android.content.SharedPreferences;
import com.facebook.redex.RunnableRunnableShape0S0201000_I0;
import com.facebook.redex.RunnableRunnableShape7S0100000_I0_6;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* renamed from: X.16U  reason: invalid class name */
public class AnonymousClass16U implements C18950xW {
    public final C19000xb A00;
    public final C16000sG A01;
    public final C220816o A02;
    public final C15800rs A03;
    public final C16440t3 A04;
    public final C15860rz A05;
    public final C14710pd A06;
    public final C16320sq A07;

    public AnonymousClass16U(C19000xb r1, C16000sG r2, C220816o r3, C15800rs r4, C16440t3 r5, C15860rz r6, C14710pd r7, C16320sq r8) {
        this.A04 = r5;
        this.A06 = r7;
        this.A07 = r8;
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = r6;
        this.A03 = r4;
        this.A02 = r3;
    }

    public final Set A00() {
        HashSet hashSet = new HashSet();
        Set<String> stringSet = ((SharedPreferences) this.A05.A01.get()).getStringSet("pending_users_to_sync_device", new HashSet());
        AnonymousClass00B.A06(stringSet);
        hashSet.addAll(C16030sJ.A09((String[]) stringSet.toArray(new String[0])));
        return hashSet;
    }

    public void A01(UserJid[] userJidArr, int i2) {
        boolean z2;
        String[] A0T = C16030sJ.A0T(Arrays.asList(userJidArr));
        if (A0T == null || A0T.length == 0) {
            throw new IllegalArgumentException("invalid jid list");
        }
        ArrayList arrayList = new ArrayList();
        for (UserJid userJid : userJidArr) {
            C220816o r1 = this.A02;
            Set set = r1.A03;
            synchronized (set) {
                if (!set.contains(userJid)) {
                    r1.A01.put(userJid, Long.valueOf(r1.A00.A00()));
                    set.add(userJid);
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                arrayList.add(userJid);
            }
        }
        if (!arrayList.isEmpty()) {
            new RunnableRunnableShape0S0201000_I0((Object) this, i2, (Object) arrayList, 11).run();
        }
    }

    public /* synthetic */ void ARy() {
    }

    public /* synthetic */ void ARz() {
    }

    public /* synthetic */ void AS0() {
    }

    public void AS1() {
        if (this.A06.A0E(C16620tM.A02, 560)) {
            this.A07.Acl(new RunnableRunnableShape7S0100000_I0_6(this, 10));
        }
    }
}
