package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.0rt  reason: invalid class name and case insensitive filesystem */
public class C15810rt {
    public boolean A00;
    public final C14710pd A01;
    public final ConcurrentHashMap A02 = new ConcurrentHashMap();
    public volatile C33801jB A03;
    public volatile boolean A04;

    public C15810rt(C14710pd r2) {
        this.A01 = r2;
    }

    public int A00(C15830rv r2) {
        C15840rx r0 = (C15840rx) A0C().get(r2);
        if (r0 == null) {
            return 0;
        }
        return r0.A06;
    }

    public int A01(C15830rv r2) {
        C15840rx r0 = (C15840rx) A0C().get(r2);
        if (r0 == null) {
            return 0;
        }
        return r0.A0X.expiration;
    }

    public int A02(GroupJid groupJid) {
        if (!this.A01.A0E(C16620tM.A02, 982)) {
            return 0;
        }
        return A03(groupJid);
    }

    public int A03(GroupJid groupJid) {
        C15840rx r0;
        if (!C16030sJ.A0L(groupJid) || (r0 = (C15840rx) A0C().get(groupJid)) == null) {
            return 0;
        }
        return r0.A01;
    }

    public long A04(C15830rv r3) {
        C15840rx r0 = (C15840rx) A0C().get(r3);
        if (r0 == null) {
            return 1;
        }
        return r0.A0N;
    }

    public long A05(C15830rv r3) {
        C15840rx r0 = (C15840rx) A0C().get(r3);
        if (r0 == null) {
            return 0;
        }
        return r0.A0V;
    }

    public synchronized C15840rx A06(C15830rv r2) {
        return r2 == null ? null : (C15840rx) A0C().get(r2);
    }

    public C33791jA A07(C15830rv r9) {
        C33791jA r2;
        C15840rx r1 = (C15840rx) A0C().get(r9);
        if (r1 == null) {
            return new C33791jA(0, 0, 0, Long.MIN_VALUE);
        }
        synchronized (r1) {
            r2 = new C33791jA(r1.A06, r1.A07, r1.A08, r1.A0O);
        }
        return r2;
    }

    public AnonymousClass1WV A08(UserJid userJid) {
        C15840rx r0 = (C15840rx) A0C().get(userJid);
        if (r0 == null) {
            return null;
        }
        return r0.A0X;
    }

    public String A09(C15830rv r3) {
        C15840rx r0;
        if (r3 == null || (r0 = (C15840rx) A0C().get(r3)) == null) {
            return null;
        }
        return r0.A0d;
    }

    public synchronized Collection A0A() {
        return A0C().values();
    }

    public synchronized Set A0B() {
        return A0C().keySet();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x003b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00e7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.concurrent.ConcurrentHashMap A0C() {
        /*
            r12 = this;
            X.1jB r0 = r12.A03
            if (r0 != 0) goto L_0x000b
            boolean r0 = r12.A04
            if (r0 != 0) goto L_0x000b
        L_0x0008:
            java.util.concurrent.ConcurrentHashMap r0 = r12.A02
            return r0
        L_0x000b:
            monitor-enter(r12)
            X.1jB r0 = r12.A03     // Catch:{ all -> 0x00f0 }
            if (r0 == 0) goto L_0x00e9
            X.1jB r1 = r12.A03     // Catch:{ all -> 0x00f0 }
            r5 = 1
            r12.A04 = r5     // Catch:{ all -> 0x00f0 }
            r0 = 0
            r12.A03 = r0     // Catch:{ all -> 0x00f0 }
            r4 = 0
            X.0xS r2 = r1.A00     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            X.0tq r6 = r2.A0G     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            r6.A04()     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            boolean r0 = r6.A01     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            if (r0 == 0) goto L_0x00d7
            X.0tf r3 = r6.get()     // Catch:{ IllegalStateException -> 0x003c }
            X.0ts r0 = r2.A09     // Catch:{ all -> 0x0037 }
            java.util.Map r1 = r0.A08()     // Catch:{ all -> 0x0037 }
            X.15m r0 = r2.A0B     // Catch:{ all -> 0x0037 }
            r0.A01(r1)     // Catch:{ all -> 0x0037 }
            r3.close()     // Catch:{ IllegalStateException -> 0x003c }
            goto L_0x005a
        L_0x0037:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x003b }
        L_0x003b:
            throw r0     // Catch:{ IllegalStateException -> 0x003c }
        L_0x003c:
            r1 = move-exception
            java.lang.String r0 = "msgstore-manager/finish"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            r6.A04()     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            X.1jC r0 = r6.A04     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            r0.close()     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            X.17C r0 = r2.A0J     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            r0.A01()     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            X.0ts r0 = r2.A09     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            java.util.Map r1 = r0.A08()     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            X.15m r0 = r2.A0B     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            r0.A01(r1)     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
        L_0x005a:
            java.util.concurrent.ConcurrentHashMap r0 = r12.A02     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            r0.putAll(r1)     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            java.util.Set r0 = r0.keySet()     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            r6.<init>(r0)     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            X.17Z r8 = r2.A03     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            X.0rs r10 = r8.A05     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            X.0rt r9 = r10.A00     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            r9.A0C()     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            java.util.ArrayList r7 = r10.A01     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            monitor-enter(r7)     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            r7.clear()     // Catch:{ all -> 0x00d4 }
            java.util.Iterator r11 = r6.iterator()     // Catch:{ all -> 0x00d4 }
        L_0x007b:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x00d4 }
            if (r0 == 0) goto L_0x00a8
            java.lang.Object r3 = r11.next()     // Catch:{ all -> 0x00d4 }
            X.0rv r3 = (X.C15830rv) r3     // Catch:{ all -> 0x00d4 }
            boolean r0 = r9.A0F(r3)     // Catch:{ all -> 0x00d4 }
            if (r0 == 0) goto L_0x007b
            X.0ru r2 = new X.0ru     // Catch:{ all -> 0x00d4 }
            r2.<init>()     // Catch:{ all -> 0x00d4 }
            r2.A01 = r3     // Catch:{ all -> 0x00d4 }
            long r0 = r9.A05(r3)     // Catch:{ all -> 0x00d4 }
            r2.A00 = r0     // Catch:{ all -> 0x00d4 }
            com.whatsapp.jid.GroupJid r0 = com.whatsapp.jid.GroupJid.of(r3)     // Catch:{ all -> 0x00d4 }
            int r0 = r9.A03(r0)     // Catch:{ all -> 0x00d4 }
            if (r0 == r5) goto L_0x007b
            r7.add(r2)     // Catch:{ all -> 0x00d4 }
            goto L_0x007b
        L_0x00a8:
            java.util.Comparator r0 = r10.A02     // Catch:{ all -> 0x00d4 }
            java.util.Collections.sort(r7, r0)     // Catch:{ all -> 0x00d4 }
            monitor-exit(r7)     // Catch:{ all -> 0x00d4 }
            X.0pt r3 = r8.A00     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            X.11A r2 = r8.A07     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            r1 = 9
            com.facebook.redex.RunnableRunnableShape5S0100000_I0_4 r0 = new com.facebook.redex.RunnableRunnableShape5S0100000_I0_4     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            r0.<init>((java.lang.Object) r2, (int) r1)     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            r3.Acq(r0)     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            java.lang.String r0 = "msgstore-manager/initialize/chats "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            r1.<init>(r0)     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            int r0 = r6.size()     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            r1.append(r0)     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            java.lang.String r0 = r1.toString()     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            r12.A00 = r5     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            goto L_0x00e7
        L_0x00d4:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00d4 }
            goto L_0x00e6
        L_0x00d7:
            java.lang.Throwable r1 = new java.lang.Throwable     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            r1.<init>()     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            java.lang.String r0 = "msgstore-manager/finish/db is not ready yet"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            X.1jD r0 = new X.1jD     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
            r0.<init>()     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
        L_0x00e6:
            throw r0     // Catch:{ 1jD -> 0x00e7, all -> 0x00ec }
        L_0x00e7:
            r12.A04 = r4     // Catch:{ all -> 0x00f0 }
        L_0x00e9:
            monitor-exit(r12)     // Catch:{ all -> 0x00f0 }
            goto L_0x0008
        L_0x00ec:
            r0 = move-exception
            r12.A04 = r4     // Catch:{ all -> 0x00f0 }
            throw r0     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r0 = move-exception
            monitor-exit(r12)     // Catch:{ all -> 0x00f0 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15810rt.A0C():java.util.concurrent.ConcurrentHashMap");
    }

    public synchronized void A0D(C15840rx r2, C15830rv r3) {
        if (r3 != null) {
            A0C().put(r3, r2);
        }
    }

    public synchronized void A0E(C16740tZ r7) {
        C15840rx A06 = A06(r7.A11.A00);
        if (A06 != null) {
            C16740tZ r0 = A06.A0Z;
            if (r0 != null && r0.A13 == r7.A13) {
                A06.A0Z = r7;
            }
            C16740tZ r02 = A06.A0Y;
            if (r02 != null && r02.A13 == r7.A13) {
                A06.A0Y = r7;
            }
        }
    }

    public boolean A0F(C15830rv r3) {
        return A0C().containsKey(r3) && !A0I(r3);
    }

    public boolean A0G(C15830rv r3) {
        C15840rx r0 = (C15840rx) A0C().get(r3);
        return r0 != null && r0.A0e;
    }

    public boolean A0H(C15830rv r4) {
        return (r4 instanceof GroupJid) && A03((GroupJid) r4) == 3;
    }

    public boolean A0I(C15830rv r9) {
        C15840rx r7 = (C15840rx) A0C().get(r9);
        if (r7 == null) {
            return true;
        }
        long j2 = r7.A0M;
        if (j2 == 0 && r7.A0D == Long.MIN_VALUE) {
            return false;
        }
        long j3 = r7.A0D;
        return j3 == r7.A0E && j3 >= j2;
    }
}
