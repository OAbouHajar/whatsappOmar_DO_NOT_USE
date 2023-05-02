package X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.redex.RunnableRunnableShape1S0300000_I0_1;
import com.obwhatsapp.yo.yo;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.125  reason: invalid class name */
public class AnonymousClass125 {
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final AnonymousClass127 A01;
    public final AnonymousClass12G A02;
    public final AnonymousClass124 A03;
    public final C16320sq A04;
    public final HashMap A05 = new HashMap();
    public final HashMap A06 = new HashMap();
    public final Set A07 = new HashSet();

    public AnonymousClass125(AnonymousClass127 r3, AnonymousClass12G r4, AnonymousClass124 r5, C16320sq r6) {
        this.A04 = r6;
        this.A03 = r5;
        this.A01 = r3;
        this.A02 = r4;
    }

    public static AnonymousClass125 A21() {
        return (AnonymousClass125) yo.mSingletonC.AJ5.get();
    }

    public int A00(C15830rv r8, UserJid userJid) {
        C46122Cm r6;
        AnonymousClass2Cl r62 = (AnonymousClass2Cl) this.A06.get(r8);
        if (r62 == null) {
            return -1;
        }
        if (userJid == null || !C16030sJ.A0L(r8)) {
            long j2 = r62.A02;
            if (j2 == 0 || j2 + 25000 <= SystemClock.elapsedRealtime()) {
                return -1;
            }
            return r62.A00;
        }
        HashMap hashMap = r62.A04;
        if (hashMap == null || (r6 = (C46122Cm) hashMap.get(userJid)) == null) {
            return -1;
        }
        long j3 = r6.A01;
        if (j3 == 0 || j3 + 25000 <= SystemClock.elapsedRealtime()) {
            return -1;
        }
        return r6.A00;
    }

    public long A01(C15830rv r3) {
        AnonymousClass2Cl r0 = (AnonymousClass2Cl) this.A06.get(r3);
        if (r0 == null) {
            return 0;
        }
        return r0.A03;
    }

    public GroupJid A02(C15830rv r7, long j2) {
        HashMap hashMap;
        C46122Cm r0;
        HashMap hashMap2 = this.A06;
        AnonymousClass2Cl r3 = (AnonymousClass2Cl) hashMap2.get(r7);
        if (r3 == null) {
            r3 = new AnonymousClass2Cl();
            hashMap2.put(r7, r3);
        }
        if (j2 == 0) {
            r3.A03 = 0;
        } else {
            r3.A03 = j2;
        }
        r3.A02 = 0;
        for (Map.Entry entry : hashMap2.entrySet()) {
            if (C16030sJ.A0L((Jid) entry.getKey()) && (hashMap = ((AnonymousClass2Cl) entry.getValue()).A04) != null && (r0 = (C46122Cm) hashMap.get(r7)) != null) {
                r0.A01 = 0;
                return GroupJid.of((Jid) entry.getKey());
            }
        }
        return null;
    }

    public void A03() {
        HashMap hashMap = this.A06;
        HashSet hashSet = new HashSet(hashMap.keySet());
        hashMap.clear();
        HashMap hashMap2 = this.A05;
        for (RunnableRunnableShape1S0300000_I0_1 removeCallbacks : hashMap2.values()) {
            this.A00.removeCallbacks(removeCallbacks);
        }
        hashMap2.clear();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            this.A01.A04((C15830rv) it.next());
        }
    }

    public void A04(C15830rv r8) {
        AnonymousClass2Cl r5;
        HashMap hashMap;
        if (C16030sJ.A0L(r8) && (r5 = (AnonymousClass2Cl) this.A06.get(r8)) != null && (hashMap = r5.A04) != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                ((C46122Cm) entry.getValue()).A01 = 0;
                StringBuilder sb = new StringBuilder();
                sb.append(r8.getRawString());
                sb.append(((Jid) entry.getKey()).getRawString());
                RunnableRunnableShape1S0300000_I0_1 runnableRunnableShape1S0300000_I0_1 = (RunnableRunnableShape1S0300000_I0_1) this.A05.get(sb.toString());
                if (runnableRunnableShape1S0300000_I0_1 != null) {
                    this.A00.removeCallbacks(runnableRunnableShape1S0300000_I0_1);
                }
            }
            r5.A02 = 0;
        }
    }

    public void A05(C15830rv r4) {
        int type;
        if (C16030sJ.A0G(r4)) {
            return;
        }
        if ((r4 == null || !((type = r4.getType()) == 8 || type == 7)) && !C16030sJ.A0R(r4)) {
            this.A04.Acn(new AnonymousClass360(r4, this), new Void[0]);
        }
    }

    public void A06(C15830rv r6, UserJid userJid) {
        String obj;
        HashMap hashMap = this.A06;
        AnonymousClass2Cl r4 = (AnonymousClass2Cl) hashMap.get(r6);
        if (r4 == null) {
            r4 = new AnonymousClass2Cl();
            hashMap.put(r6, r4);
        }
        if (userJid != null && C16030sJ.A0L(r6)) {
            HashMap hashMap2 = r4.A04;
            if (hashMap2 == null) {
                hashMap2 = new HashMap();
                r4.A04 = hashMap2;
            }
            C46122Cm r1 = (C46122Cm) hashMap2.get(userJid);
            if (r1 == null) {
                r1 = new C46122Cm();
                r4.A04.put(userJid, r1);
            }
            r1.A01 = 0;
        }
        r4.A02 = 0;
        if (userJid == null) {
            obj = r6.getRawString();
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(r6.getRawString());
            sb.append(userJid.getRawString());
            obj = sb.toString();
        }
        RunnableRunnableShape1S0300000_I0_1 runnableRunnableShape1S0300000_I0_1 = (RunnableRunnableShape1S0300000_I0_1) this.A05.get(obj);
        if (runnableRunnableShape1S0300000_I0_1 != null) {
            this.A00.removeCallbacks(runnableRunnableShape1S0300000_I0_1);
        }
    }

    public void A07(C15830rv r4, boolean z2) {
        HashMap hashMap = this.A06;
        AnonymousClass2Cl r2 = (AnonymousClass2Cl) hashMap.get(r4);
        if (r2 == null) {
            r2 = new AnonymousClass2Cl();
            hashMap.put(r4, r2);
        }
        r2.A01 = z2 ? 1 : 0;
        if (!z2) {
            r2.A03 = 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = (X.AnonymousClass2Cl) r6.A06.get(r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A08(X.C15830rv r7) {
        /*
            r6 = this;
            boolean r0 = X.C16030sJ.A0L(r7)
            r5 = 1
            if (r0 != 0) goto L_0x0019
            java.util.HashMap r0 = r6.A06
            java.lang.Object r0 = r0.get(r7)
            X.2Cl r0 = (X.AnonymousClass2Cl) r0
            if (r0 == 0) goto L_0x001a
            long r3 = r0.A03
            r1 = 1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x001a
        L_0x0019:
            return r5
        L_0x001a:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass125.A08(X.0rv):boolean");
    }
}
