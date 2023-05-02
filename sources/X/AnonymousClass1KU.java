package X;

import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.1KU  reason: invalid class name */
public final class AnonymousClass1KU {
    public final C17010u2 A00;
    public final C14710pd A01;
    public final AnonymousClass197 A02 = new AnonymousClass197(5);

    public AnonymousClass1KU(C17010u2 r3, C14710pd r4) {
        C18450wi.A0H(r4, 2);
        this.A00 = r3;
        this.A01 = r4;
    }

    public final AnonymousClass4HT A00(UserJid userJid) {
        AnonymousClass197 r3 = this.A02;
        AnonymousClass4HT r2 = (AnonymousClass4HT) r3.get(userJid);
        if (r2 != null) {
            return r2;
        }
        AnonymousClass4HT r22 = new AnonymousClass4HT(System.currentTimeMillis());
        r22.A01.put("catalog_category_dummy_root_id", new AnonymousClass4N4(new C35691mL("catalog_category_dummy_root_id", (String) null, (String) null, 0, 0), "catalog_category_dummy_root_id", "root", new ArrayList(), false));
        r3.put(userJid, r22);
        return r22;
    }

    public List A01(UserJid userJid, String str) {
        ArrayList arrayList;
        C18450wi.A0H(str, 0);
        C18450wi.A0H(userJid, 1);
        synchronized (this) {
            Map map = A00(userJid).A01;
            AnonymousClass4N4 r1 = (AnonymousClass4N4) map.get(str);
            arrayList = new ArrayList();
            if (r1 != null && !r1.A04) {
                for (String str2 : r1.A03) {
                    AnonymousClass4N4 r0 = (AnonymousClass4N4) map.get(str2);
                    if (r0 != null) {
                        arrayList.add(r0);
                    }
                }
            }
        }
        return arrayList;
    }

    public void A02(AnonymousClass4Q6 r9, UserJid userJid, boolean z2) {
        C18450wi.A0H(userJid, 2);
        synchronized (this) {
            for (Object next : r9.A00) {
                C18450wi.A0B(next);
                C85864Qh r0 = (C85864Qh) next;
                AnonymousClass4N4 r4 = r0.A00;
                List list = r4.A03;
                list.clear();
                for (Object next2 : r0.A01) {
                    C18450wi.A0B(next2);
                    AnonymousClass4N4 r2 = (AnonymousClass4N4) next2;
                    String str = r2.A01;
                    list.add(str);
                    C18450wi.A0A(str);
                    A00(userJid).A01.put(str, r2);
                }
                String str2 = r4.A01;
                C18450wi.A0A(str2);
                AnonymousClass4HT A002 = A00(userJid);
                if (z2) {
                    AnonymousClass4N4 r02 = (AnonymousClass4N4) A00(userJid).A01.get("catalog_category_dummy_root_id");
                    if (r02 != null) {
                        r02.A03.add(str2);
                    } else {
                        continue;
                    }
                }
                A002.A01.put(str2, r4);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0064, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A03(com.whatsapp.jid.UserJid r12, java.lang.String r13) {
        /*
            r11 = this;
            r10 = r11
            r7 = 0
            X.C18450wi.A0H(r13, r7)
            r0 = 1
            X.C18450wi.A0H(r12, r0)
            monitor-enter(r10)
            java.lang.String r0 = "catalog_category_dummy_root_id"
            boolean r0 = r0.equals(r13)     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x0043
            X.0pd r3 = r11.A01     // Catch:{ all -> 0x0067 }
            r0 = 2080(0x820, float:2.915E-42)
            X.0tM r1 = X.C16620tM.A02     // Catch:{ all -> 0x0067 }
            boolean r0 = r3.A0E(r1, r0)     // Catch:{ all -> 0x0067 }
            if (r0 == 0) goto L_0x0043
            X.197 r8 = r11.A02     // Catch:{ all -> 0x0067 }
            java.lang.Object r9 = r8.get(r12)     // Catch:{ all -> 0x0067 }
            X.4HT r9 = (X.AnonymousClass4HT) r9     // Catch:{ all -> 0x0067 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.HOURS     // Catch:{ all -> 0x0067 }
            r0 = 2081(0x821, float:2.916E-42)
            int r0 = r3.A03(r1, r0)     // Catch:{ all -> 0x0067 }
            long r0 = (long) r0     // Catch:{ all -> 0x0067 }
            long r5 = r2.toMillis(r0)     // Catch:{ all -> 0x0067 }
            if (r9 == 0) goto L_0x0043
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0067 }
            long r1 = r9.A00     // Catch:{ all -> 0x0067 }
            long r1 = r1 + r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0043
            r8.remove(r12)     // Catch:{ all -> 0x0067 }
        L_0x0043:
            X.4HT r0 = r11.A00(r12)     // Catch:{ all -> 0x0065 }
            java.util.Map r0 = r0.A01     // Catch:{ all -> 0x0065 }
            java.lang.Object r2 = r0.get(r13)     // Catch:{ all -> 0x0065 }
            X.4N4 r2 = (X.AnonymousClass4N4) r2     // Catch:{ all -> 0x0065 }
            r1 = 0
            if (r2 != 0) goto L_0x0054
            monitor-exit(r10)
            return r7
        L_0x0054:
            boolean r0 = r2.A04     // Catch:{ all -> 0x0067 }
            if (r0 != 0) goto L_0x0063
            java.util.List r0 = r2.A03     // Catch:{ all -> 0x0067 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0067 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0063
            r1 = 1
        L_0x0063:
            monitor-exit(r10)
            return r1
        L_0x0065:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1KU.A03(com.whatsapp.jid.UserJid, java.lang.String):boolean");
    }
}
