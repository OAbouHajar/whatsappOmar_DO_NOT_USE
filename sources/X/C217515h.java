package X;

import com.facebook.redex.IDxProviderShape64S0200000_2_I0;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.15h  reason: invalid class name and case insensitive filesystem */
public class C217515h {
    public final AnonymousClass19E A00;
    public final AnonymousClass19I A01;
    public final C217615i A02;
    public final C20360zv A03;
    public final AnonymousClass19J A04;
    public final AnonymousClass01D A05;

    public C217515h(AnonymousClass19E r4, AnonymousClass19I r5, C217615i r6, C20360zv r7, AnonymousClass19J r8, AnonymousClass01D r9) {
        this.A00 = r4;
        this.A03 = r7;
        this.A02 = r6;
        this.A04 = r8;
        this.A01 = r5;
        this.A05 = new AnonymousClass01T((Object) null, new IDxProviderShape64S0200000_2_I0(r9, 4, this));
    }

    public final C20380zx A00(AnonymousClass1WJ r3) {
        C20380zx r0;
        String A042 = r3.A04();
        synchronized (this) {
            r0 = (C20380zx) A02(A042);
        }
        return r0;
    }

    public AnonymousClass1WJ A01(C28501Wi r9) {
        C20380zx r0;
        StringBuilder sb;
        String str;
        String str2 = r9.A06[0];
        synchronized (this) {
            r0 = (C20380zx) A02(str2);
        }
        if (r0 != null) {
            try {
                AnonymousClass1WJ A002 = this.A02.A00(r9, (String) null, false);
                if (A002 != null) {
                    A002.A02 = r9.A05;
                    return A002;
                }
            } catch (C36771o5 e2) {
                this.A00.A07(e2.errorCode, (String) null);
            }
            sb = new StringBuilder();
            str = "mutation-handlers/handleMutation the handler couldn't create a valid mutation for ";
        } else {
            sb = new StringBuilder();
            str = "mutation-handlers/handleMutation no mutation handlers found to handle mutation: ";
        }
        sb.append(str);
        sb.append(str2);
        Log.e(sb.toString());
        String str3 = r9.A04;
        Integer valueOf = Integer.valueOf(r9.A00);
        byte[] bArr = r9.A05;
        AnonymousClass00B.A06(bArr);
        throw new C37641pU(r9.A01, r9.A02, r9.A03, valueOf, str3, bArr, 6);
    }

    public Object A02(String str) {
        Object obj;
        if (!this.A02.A02(str)) {
            return null;
        }
        synchronized (this) {
            obj = ((Map) this.A05.get()).get(str);
        }
        return obj;
    }

    public Set A03() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet();
            for (String str : ((Map) this.A05.get()).keySet()) {
                if (this.A02.A02(str)) {
                    hashSet.add(str);
                }
            }
        }
        return hashSet;
    }

    public Set A04(Collection collection) {
        Set A0B;
        synchronized (this) {
            A0B = this.A03.A0B(collection);
        }
        return A0B;
    }

    @Deprecated
    public synchronized void A05(C20380zx r3, String str) {
        AnonymousClass01D r1 = this.A05;
        if (!((Map) r1.get()).containsKey(str)) {
            ((Map) r1.get()).put(str, r3);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("mutation-handlers/add-handler handler exists with key: ");
            sb.append(str);
            Log.w(sb.toString());
        }
    }

    public void A06(AnonymousClass1WJ r4) {
        if (r4.A06() && (r4 instanceof C36821oA)) {
            String A042 = r4.A04();
            if ("clearChat".equals(A042) || "deleteChat".equals(A042) || "deleteMessageForMe".equals(A042)) {
                AnonymousClass19I r2 = this.A01;
                C15830rv AAV = ((C36821oA) r4).AAV();
                synchronized (r2) {
                    Set set = r2.A00;
                    if (set != null) {
                        set.add(AAV);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:24|25|26|27|28) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0064 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0069 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(java.lang.String r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            X.0zv r8 = r9.A03     // Catch:{ all -> 0x0089 }
            java.util.List r1 = java.util.Collections.singletonList(r10)     // Catch:{ all -> 0x0089 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0089 }
            r7.<init>()     // Catch:{ all -> 0x0089 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0089 }
            if (r0 != 0) goto L_0x006d
            java.lang.String[] r0 = X.AnonymousClass01S.A0H     // Catch:{ all -> 0x0089 }
            java.lang.Object[] r1 = r1.toArray(r0)     // Catch:{ all -> 0x0089 }
            X.19K r0 = r8.A01     // Catch:{ all -> 0x0089 }
            X.0tf r6 = r0.get()     // Catch:{ all -> 0x0089 }
            r0 = 975(0x3cf, float:1.366E-42)
            X.1jh r5 = new X.1jh     // Catch:{ all -> 0x0065 }
            r5.<init>(r1, r0)     // Catch:{ all -> 0x0065 }
        L_0x0025:
            boolean r0 = r5.hasNext()     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x006a
            java.lang.Object r4 = r5.next()     // Catch:{ all -> 0x0065 }
            java.lang.String[] r4 = (java.lang.String[]) r4     // Catch:{ all -> 0x0065 }
            X.0tg r3 = r6.A02     // Catch:{ all -> 0x0065 }
            int r2 = r4.length     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE are_dependencies_missing = 1 AND mutation_index IN "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0065 }
            r1.<init>(r0)     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = X.C34111ji.A00(r2)     // Catch:{ all -> 0x0065 }
            r1.append(r0)     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0065 }
            android.database.Cursor r1 = r3.A08(r0, r4)     // Catch:{ all -> 0x0065 }
        L_0x004a:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x005a
            X.1WJ r0 = r8.A04(r1)     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x004a
            r7.add(r0)     // Catch:{ all -> 0x005e }
            goto L_0x004a
        L_0x005a:
            r1.close()     // Catch:{ all -> 0x0065 }
            goto L_0x0025
        L_0x005e:
            r0 = move-exception
            if (r1 == 0) goto L_0x0064
            r1.close()     // Catch:{ all -> 0x0064 }
        L_0x0064:
            throw r0     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0069 }
        L_0x0069:
            throw r0     // Catch:{ all -> 0x0089 }
        L_0x006a:
            r6.close()     // Catch:{ all -> 0x0089 }
        L_0x006d:
            java.util.Iterator r2 = r7.iterator()     // Catch:{ all -> 0x0089 }
        L_0x0071:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x0087
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0089 }
            X.1WJ r1 = (X.AnonymousClass1WJ) r1     // Catch:{ all -> 0x0089 }
            X.0zx r0 = r9.A00(r1)     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x0071
            r0.A03(r1)     // Catch:{ all -> 0x0089 }
            goto L_0x0071
        L_0x0087:
            monitor-exit(r9)     // Catch:{ all -> 0x0089 }
            return
        L_0x0089:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0089 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C217515h.A07(java.lang.String):void");
    }

    public final void A08(String str) {
        synchronized (this) {
            for (AnonymousClass1WJ r1 : this.A03.A07(new C37651pV(str), "SELECT mutation_index, mutation_value, mutation_version, are_dependencies_missing, device_id, epoch, mutation_mac FROM syncd_mutations WHERE are_dependencies_missing = 1 ORDER BY _id ASC", (String[]) null)) {
                C20380zx A002 = A00(r1);
                if (A002 != null) {
                    A002.A03(r1);
                }
            }
        }
    }

    public void A09(Collection collection) {
        synchronized (this) {
            this.A03.A0F(collection);
        }
    }
}
