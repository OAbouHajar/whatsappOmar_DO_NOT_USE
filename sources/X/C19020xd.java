package X;

import com.facebook.redex.RunnableRunnableShape0S0410000_I0;
import com.obwhatsapp.data.device.DeviceChangeManager;
import com.whatsapp.jid.UserJid;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0xd  reason: invalid class name and case insensitive filesystem */
public class C19020xd {
    public DeviceChangeManager A00;
    public final C16040sK A01;
    public final C16900tq A02;
    public final AnonymousClass19O A03;
    public final AnonymousClass19N A04;
    public final AnonymousClass19P A05;
    public volatile String A06;

    public C19020xd(C16040sK r1, C16900tq r2, AnonymousClass19O r3, AnonymousClass19N r4, AnonymousClass19P r5) {
        this.A01 = r1;
        this.A05 = r5;
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = r4;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:28|29|30|31|32) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00b5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00ba */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C17930vs A00() {
        /*
            r30 = this;
            r0 = r30
            X.19N r1 = r0.A04
            monitor-enter(r1)
            X.0vs r0 = r1.A00     // Catch:{ all -> 0x00c2 }
            if (r0 != 0) goto L_0x00be
            X.1p7 r0 = r1.A02     // Catch:{ all -> 0x00c2 }
            X.0tf r15 = r0.get()     // Catch:{ all -> 0x00c2 }
            X.0tg r0 = r15.A02     // Catch:{ all -> 0x00b6 }
            java.lang.String r3 = "devices"
            java.lang.String[] r4 = X.C37441pA.A00     // Catch:{ all -> 0x00b6 }
            r17 = 0
            r6 = r17
            r7 = r6
            r8 = r6
            r9 = r6
            r2 = r0
            r5 = r6
            android.database.Cursor r3 = r2.A09(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = "device_id"
            int r14 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00af }
            java.lang.String r0 = "platform_type"
            int r13 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00af }
            java.lang.String r0 = "device_os"
            int r12 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00af }
            java.lang.String r0 = "last_active"
            int r11 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00af }
            java.lang.String r0 = "login_time"
            int r10 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00af }
            java.lang.String r0 = "logout_time"
            int r9 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00af }
            java.lang.String r0 = "adv_key_index"
            int r8 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00af }
            java.lang.String r0 = "full_sync_required"
            int r7 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00af }
            java.lang.String r0 = "place_name"
            int r6 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00af }
            X.1C5 r5 = new X.1C5     // Catch:{ all -> 0x00af }
            r5.<init>()     // Catch:{ all -> 0x00af }
        L_0x005d:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x00af }
            if (r0 == 0) goto L_0x00a5
            java.lang.String r0 = r3.getString(r14)     // Catch:{ all -> 0x00af }
            com.whatsapp.jid.DeviceJid r2 = com.whatsapp.jid.DeviceJid.getNullable(r0)     // Catch:{ all -> 0x00af }
            if (r2 == 0) goto L_0x005d
            int r0 = r3.getInt(r13)     // Catch:{ all -> 0x00af }
            X.1p8 r19 = X.C37421p8.A00(r0)     // Catch:{ all -> 0x00af }
            java.lang.String r20 = r3.getString(r12)     // Catch:{ all -> 0x00af }
            long r23 = r3.getLong(r11)     // Catch:{ all -> 0x00af }
            long r25 = r3.getLong(r10)     // Catch:{ all -> 0x00af }
            long r27 = r3.getLong(r9)     // Catch:{ all -> 0x00af }
            int r22 = r3.getInt(r8)     // Catch:{ all -> 0x00af }
            int r4 = r3.getInt(r7)     // Catch:{ all -> 0x00af }
            r0 = 1
            r29 = 0
            if (r0 != r4) goto L_0x0094
            r29 = 1
        L_0x0094:
            java.lang.String r21 = r3.getString(r6)     // Catch:{ all -> 0x00af }
            X.1WN r0 = new X.1WN     // Catch:{ all -> 0x00af }
            r18 = r2
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r25, r27, r29)     // Catch:{ all -> 0x00af }
            r5.put(r2, r0)     // Catch:{ all -> 0x00af }
            goto L_0x005d
        L_0x00a5:
            X.0vs r0 = r5.build()     // Catch:{ all -> 0x00af }
            r1.A00 = r0     // Catch:{ all -> 0x00af }
            r3.close()     // Catch:{ all -> 0x00b6 }
            goto L_0x00bb
        L_0x00af:
            r0 = move-exception
            if (r3 == 0) goto L_0x00b5
            r3.close()     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            throw r0     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r0 = move-exception
            r15.close()     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            throw r0     // Catch:{ all -> 0x00c2 }
        L_0x00bb:
            r15.close()     // Catch:{ all -> 0x00c2 }
        L_0x00be:
            X.0vs r0 = r1.A00     // Catch:{ all -> 0x00c2 }
            monitor-exit(r1)     // Catch:{ all -> 0x00c2 }
            return r0
        L_0x00c2:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00c2 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19020xd.A00():X.0vs");
    }

    public C17930vs A01() {
        C28031Ub it = A00().entrySet().iterator();
        AnonymousClass1C5 r3 = new AnonymousClass1C5();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!((AnonymousClass1WN) entry.getValue()).A01()) {
                r3.put(entry.getKey(), entry.getValue());
            }
        }
        return r3.build();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00ea */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C17930vs A02(com.whatsapp.jid.UserJid r18) {
        /*
            r17 = this;
            r2 = r17
            X.0sK r0 = r2.A01
            r10 = r18
            boolean r0 = r0.A0I(r10)
            r1 = r0 ^ 1
            java.lang.String r0 = "only get user for others"
            X.AnonymousClass00B.A0D(r0, r1)
            X.19P r8 = r2.A05
            X.14v r13 = r8.A00
            boolean r0 = r13.A0C()
            if (r0 != 0) goto L_0x0020
            X.0vs r0 = X.C17930vs.of()
            return r0
        L_0x0020:
            X.1p4 r0 = r8.A02
            java.util.Map r9 = r0.A00
            boolean r0 = r9.containsKey(r10)
            if (r0 == 0) goto L_0x0033
            java.lang.Object r0 = r9.get(r10)
            X.0vs r0 = (X.C17930vs) r0
            if (r0 == 0) goto L_0x0033
            return r0
        L_0x0033:
            long r5 = r13.A01(r10)
            X.0tq r0 = r8.A01
            X.0tf r7 = r0.get()
            monitor-enter(r8)     // Catch:{ all -> 0x00ee }
            X.0tg r4 = r7.A02     // Catch:{ all -> 0x00eb }
            java.lang.String r3 = "SELECT device_jid_row_id, key_index FROM user_device WHERE user_jid_row_id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x00eb }
            r1 = 0
            java.lang.String r0 = java.lang.Long.toString(r5)     // Catch:{ all -> 0x00eb }
            r2[r1] = r0     // Catch:{ all -> 0x00eb }
            android.database.Cursor r6 = r4.A08(r3, r2)     // Catch:{ all -> 0x00eb }
            X.1C5 r5 = new X.1C5     // Catch:{ all -> 0x00e4 }
            r5.<init>()     // Catch:{ all -> 0x00e4 }
            java.lang.String r0 = "device_jid_row_id"
            int r12 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00e4 }
            java.lang.String r0 = "key_index"
            int r11 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00e4 }
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x00e4 }
            r4.<init>()     // Catch:{ all -> 0x00e4 }
        L_0x0066:
            boolean r0 = r6.moveToNext()     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x00c0
            long r2 = r6.getLong(r12)     // Catch:{ all -> 0x00e4 }
            long r0 = r6.getLong(r11)     // Catch:{ all -> 0x00e4 }
            com.whatsapp.jid.Jid r2 = r13.A03(r2)     // Catch:{ all -> 0x00e4 }
            com.whatsapp.jid.DeviceJid r3 = com.whatsapp.jid.DeviceJid.of(r2)     // Catch:{ all -> 0x00e4 }
            X.AnonymousClass00B.A06(r3)     // Catch:{ all -> 0x00e4 }
            byte r2 = r3.device     // Catch:{ all -> 0x00e4 }
            r16 = 0
            if (r2 != 0) goto L_0x0087
            r16 = 1
        L_0x0087:
            r14 = 0
            if (r16 == 0) goto L_0x008f
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 == 0) goto L_0x00b8
        L_0x008f:
            r2 = r16 ^ 1
            if (r2 == 0) goto L_0x0098
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 <= 0) goto L_0x0098
            goto L_0x00b8
        L_0x0098:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e4 }
            r14.<init>()     // Catch:{ all -> 0x00e4 }
            java.lang.String r2 = "DeviceStore/getDevicesForUser/invalid devices jid="
            r14.append(r2)     // Catch:{ all -> 0x00e4 }
            r14.append(r3)     // Catch:{ all -> 0x00e4 }
            java.lang.String r2 = "; keyIndex="
            r14.append(r2)     // Catch:{ all -> 0x00e4 }
            r14.append(r0)     // Catch:{ all -> 0x00e4 }
            java.lang.String r0 = r14.toString()     // Catch:{ all -> 0x00e4 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00e4 }
            r4.add(r3)     // Catch:{ all -> 0x00e4 }
            goto L_0x0066
        L_0x00b8:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00e4 }
            r5.put(r3, r0)     // Catch:{ all -> 0x00e4 }
            goto L_0x0066
        L_0x00c0:
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x00e4 }
            if (r0 != 0) goto L_0x00d2
            X.0sq r2 = r8.A03     // Catch:{ all -> 0x00e4 }
            r1 = 11
            com.facebook.redex.RunnableRunnableShape1S0300000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape1S0300000_I0_1     // Catch:{ all -> 0x00e4 }
            r0.<init>(r8, r10, r4, r1)     // Catch:{ all -> 0x00e4 }
            r2.Acl(r0)     // Catch:{ all -> 0x00e4 }
        L_0x00d2:
            X.0vs r0 = r5.build()     // Catch:{ all -> 0x00e4 }
            r9.put(r10, r0)     // Catch:{ all -> 0x00e4 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x00e4 }
            r6.close()     // Catch:{ all -> 0x00eb }
            monitor-exit(r8)     // Catch:{ all -> 0x00eb }
            r7.close()
            return r0
        L_0x00e4:
            r0 = move-exception
            if (r6 == 0) goto L_0x00ea
            r6.close()     // Catch:{ all -> 0x00ea }
        L_0x00ea:
            throw r0     // Catch:{ all -> 0x00eb }
        L_0x00eb:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x00eb }
            throw r0     // Catch:{ all -> 0x00ee }
        L_0x00ee:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x00f2 }
        L_0x00f2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19020xd.A02(com.whatsapp.jid.UserJid):X.0vs");
    }

    public void A03() {
        String str;
        synchronized (this) {
            C16040sK r2 = this.A01;
            r2.A0B();
            if (r2.A04 == null) {
                str = null;
            } else {
                HashSet hashSet = new HashSet(A00().keySet());
                r2.A0B();
                hashSet.add(r2.A04);
                str = C37431p9.A00(hashSet);
            }
            this.A06 = str;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0020 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(X.C17380uz r4) {
        /*
            r3 = this;
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x002c
            X.0tq r0 = r3.A02
            X.0tf r2 = r0.A02()
            X.1cj r1 = r2.A00()     // Catch:{ all -> 0x0021 }
            X.19N r0 = r3.A04     // Catch:{ all -> 0x001c }
            r0.A00(r4)     // Catch:{ all -> 0x001c }
            r1.A00()     // Catch:{ all -> 0x001c }
            r1.close()     // Catch:{ all -> 0x0021 }
            goto L_0x0026
        L_0x001c:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0020 }
        L_0x0020:
            throw r0     // Catch:{ all -> 0x0021 }
        L_0x0021:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0025 }
        L_0x0025:
            throw r0
        L_0x0026:
            r2.close()
            r3.A03()
        L_0x002c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19020xd.A04(X.0uz):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x0108 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(X.C17380uz r10, X.C17380uz r11, X.C17380uz r12, com.whatsapp.jid.UserJid r13) {
        /*
            r9 = this;
            com.obwhatsapp.data.device.DeviceChangeManager r3 = r9.A00
            if (r3 == 0) goto L_0x0220
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x0018
            X.16P r2 = r3.A06
            r0 = 16
            com.facebook.redex.RunnableRunnableShape7S0200000_I0_5 r1 = new com.facebook.redex.RunnableRunnableShape7S0200000_I0_5
            r1.<init>(r3, r0, r12)
            java.util.concurrent.ThreadPoolExecutor r0 = r2.A00
            r0.execute(r1)
        L_0x0018:
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x010e
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x010e
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r10)
            r1.removeAll(r12)
            r1.addAll(r11)
            X.0sO r0 = r3.A09
            X.0uz r6 = X.C17380uz.copyOf((java.util.Collection) r1)
            X.0us r5 = r0.A07
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0220
            java.lang.String r0 = "participant-user-store/onDevicesRefreshed/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r13)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.Set r7 = r5.A07(r13)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            X.0pd r3 = r5.A0E
            r1 = 1108(0x454, float:1.553E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r4 = r3.A0E(r0, r1)
            java.util.Iterator r8 = r7.iterator()
        L_0x006d:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00c2
            java.lang.Object r0 = r8.next()
            X.0sN r0 = (X.C16060sN) r0
            X.1cE r3 = r5.A04(r0)
            X.1pB r7 = r3.A08(r6, r13, r4)
            boolean r0 = r3.A05
            if (r0 == 0) goto L_0x009d
            boolean r0 = X.C16030sJ.A0M(r13)
            if (r0 == 0) goto L_0x009d
            X.0sK r0 = r5.A01
            boolean r1 = r3.A0N(r0)
            X.1ck r0 = r3.A05(r13)
            if (r0 == 0) goto L_0x009d
            int r0 = r0.A01
            if (r0 != 0) goto L_0x00af
            if (r1 != 0) goto L_0x00af
        L_0x009d:
            boolean r0 = r7.A00
            if (r0 != 0) goto L_0x00a5
            boolean r0 = r7.A01
            if (r0 == 0) goto L_0x006d
        L_0x00a5:
            boolean r0 = r7.A02
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.put(r3, r0)
            goto L_0x006d
        L_0x00af:
            X.0vJ r1 = r5.A0C
            r0 = r13
            X.1ZX r0 = (X.AnonymousClass1ZX) r0
            X.1ZT r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x009d
            X.0uz r0 = X.C17310us.A00(r6, r1)
            r3.A08(r0, r1, r4)
            goto L_0x009d
        L_0x00c2:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0220
            X.0tq r0 = r5.A09
            X.0tf r4 = r0.A02()
            X.1cj r3 = r4.A00()     // Catch:{ all -> 0x0109 }
            java.util.Set r0 = r2.entrySet()     // Catch:{ all -> 0x0104 }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x0104 }
        L_0x00da:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x0104 }
            if (r0 == 0) goto L_0x00fa
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x0104 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0104 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0104 }
            X.1cE r1 = (X.C30361cE) r1     // Catch:{ all -> 0x0104 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0104 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0104 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0104 }
            r5.A0B(r1, r13, r0)     // Catch:{ all -> 0x0104 }
            goto L_0x00da
        L_0x00fa:
            r3.A00()     // Catch:{ all -> 0x0104 }
            r3.close()     // Catch:{ all -> 0x0109 }
            r4.close()
            return
        L_0x0104:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0108 }
        L_0x0108:
            throw r0     // Catch:{ all -> 0x0109 }
        L_0x0109:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x010d }
        L_0x010d:
            throw r0
        L_0x010e:
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x018f
            X.0sO r0 = r3.A09
            X.0us r3 = r0.A07
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x0220
            java.lang.String r0 = "participant-user-store/onDevicesAdded/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r13)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.Set r0 = r3.A07(r13)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Iterator r5 = r0.iterator()
        L_0x0144:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x018a
            java.lang.Object r0 = r5.next()
            X.0sN r0 = (X.C16060sN) r0
            X.1cE r4 = r3.A04(r0)
            r4.A0I(r11, r13)
            boolean r0 = r4.A05
            if (r0 == 0) goto L_0x0173
            boolean r0 = X.C16030sJ.A0M(r13)
            if (r0 == 0) goto L_0x0173
            X.0sK r0 = r3.A01
            boolean r1 = r4.A0N(r0)
            X.1ck r0 = r4.A05(r13)
            if (r0 == 0) goto L_0x0173
            int r0 = r0.A01
            if (r0 != 0) goto L_0x0177
            if (r1 != 0) goto L_0x0177
        L_0x0173:
            r2.add(r4)
            goto L_0x0144
        L_0x0177:
            X.0vJ r1 = r3.A0C
            r0 = r13
            X.1ZX r0 = (X.AnonymousClass1ZX) r0
            X.1ZT r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x0173
            X.0uz r0 = X.C17310us.A00(r11, r1)
            r4.A0I(r0, r1)
            goto L_0x0173
        L_0x018a:
            r0 = 0
            r3.A0E(r13, r2, r0)
            return
        L_0x018f:
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x0220
            X.0sO r0 = r3.A09
            X.0us r6 = r0.A07
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x0220
            java.lang.String r0 = "participant-user-store/onDevicesRemoved/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r13)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0pd r2 = r6.A0E
            r1 = 1108(0x454, float:1.553E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r5 = r2.A0E(r0, r1)
            java.util.Set r0 = r6.A07(r13)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r3 = r5 ^ 1
            java.util.Iterator r8 = r0.iterator()
        L_0x01d1:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x021d
            java.lang.Object r0 = r8.next()
            X.0sN r0 = (X.C16060sN) r0
            X.1cE r2 = r6.A04(r0)
            boolean r7 = r2.A0L(r12, r13, r5)
            boolean r0 = r2.A05
            if (r0 == 0) goto L_0x0201
            boolean r0 = X.C16030sJ.A0M(r13)
            if (r0 == 0) goto L_0x0201
            X.0sK r0 = r6.A01
            boolean r1 = r2.A0N(r0)
            X.1ck r0 = r2.A05(r13)
            if (r0 == 0) goto L_0x0201
            int r0 = r0.A01
            if (r0 != 0) goto L_0x0209
            if (r1 != 0) goto L_0x0209
        L_0x0201:
            r0 = 0
        L_0x0202:
            r0 = r0 | r3
            r3 = r0 | r7
            r4.add(r2)
            goto L_0x01d1
        L_0x0209:
            X.0vJ r1 = r6.A0C
            r0 = r13
            X.1ZX r0 = (X.AnonymousClass1ZX) r0
            X.1ZT r1 = r1.A01(r0)
            if (r1 == 0) goto L_0x0201
            X.0uz r0 = X.C17310us.A00(r12, r1)
            boolean r0 = r2.A0L(r0, r1, r5)
            goto L_0x0202
        L_0x021d:
            r6.A0E(r13, r4, r3)
        L_0x0220:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19020xd.A05(X.0uz, X.0uz, X.0uz, com.whatsapp.jid.UserJid):void");
    }

    public final void A06(C17380uz r13, C17380uz r14, C17380uz r15, UserJid userJid, boolean z2, boolean z3) {
        DeviceChangeManager deviceChangeManager = this.A00;
        if (deviceChangeManager != null) {
            C17380uz r8 = r15;
            UserJid userJid2 = userJid;
            if (!r15.isEmpty()) {
                Set A032 = deviceChangeManager.A0C.A0E(C16620tM.A02, 1108) ? deviceChangeManager.A09.A03(r15) : deviceChangeManager.A01(userJid2);
                deviceChangeManager.A06.A00.execute(new RunnableRunnableShape0S0410000_I0(deviceChangeManager, A032, r8, userJid2, 1, z3));
            }
            C17380uz r2 = r14;
            boolean z4 = z2;
            if (!r14.isEmpty() || !r15.isEmpty() || !z2) {
                deviceChangeManager.A02(r13, r2, r15, userJid2, z4);
            } else if (deviceChangeManager.A0A.A0E.A0E(C16620tM.A02, 903) && deviceChangeManager.A04.A1Y()) {
                if (deviceChangeManager.A02.A0C(userJid2)) {
                    deviceChangeManager.A08.A0u(deviceChangeManager.A0D.A03(userJid2, userJid2, deviceChangeManager.A03.A00()));
                }
                for (C15830rv A033 : deviceChangeManager.A00(userJid2)) {
                    deviceChangeManager.A08.A0u(deviceChangeManager.A0D.A03(A033, userJid2, deviceChangeManager.A03.A00()));
                }
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00a1 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00c6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C17380uz r22, boolean r23) {
        /*
            r21 = this;
            java.lang.String r0 = "DeviceManager/removeMyDevices/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r14 = r21
            X.0sK r2 = r14.A01
            r2.A0B()
            X.1Za r0 = r2.A04
            r4 = r22
            boolean r0 = r4.contains(r0)
            r1 = r0 ^ 1
            java.lang.String r0 = "never remove my primary device."
            X.AnonymousClass00B.A0D(r0, r1)
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x00d9
            r2.A0B()
            X.1ZT r3 = r2.A05
            X.AnonymousClass00B.A06(r3)
            X.0tq r0 = r14.A02
            X.0tf r13 = r0.A02()
            X.1cj r12 = r13.A00()     // Catch:{ all -> 0x00c7 }
            X.0vs r0 = r14.A00()     // Catch:{ all -> 0x00c2 }
            X.0uz r15 = r0.keySet()     // Catch:{ all -> 0x00c2 }
            if (r23 == 0) goto L_0x00a7
            X.19N r6 = r14.A04     // Catch:{ all -> 0x00c2 }
            X.1p7 r0 = r6.A02     // Catch:{ all -> 0x00c2 }
            X.0tf r5 = r0.A02()     // Catch:{ all -> 0x00c2 }
            X.1cj r11 = r5.A00()     // Catch:{ all -> 0x00a2 }
            monitor-enter(r6)     // Catch:{ all -> 0x009d }
            X.0t3 r0 = r6.A01     // Catch:{ all -> 0x009a }
            long r9 = r0.A00()     // Catch:{ all -> 0x009a }
            android.content.ContentValues r8 = new android.content.ContentValues     // Catch:{ all -> 0x009a }
            r8.<init>()     // Catch:{ all -> 0x009a }
            java.lang.String r1 = "logout_time"
            java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x009a }
            r8.put(r1, r0)     // Catch:{ all -> 0x009a }
            java.lang.String[] r7 = X.C16030sJ.A0T(r4)     // Catch:{ all -> 0x009a }
            java.lang.String r2 = ", "
            int r1 = r7.length     // Catch:{ all -> 0x009a }
            java.lang.String r0 = "?"
            java.util.List r0 = java.util.Collections.nCopies(r1, r0)     // Catch:{ all -> 0x009a }
            java.lang.String r2 = android.text.TextUtils.join(r2, r0)     // Catch:{ all -> 0x009a }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x009a }
            r1.<init>()     // Catch:{ all -> 0x009a }
            java.lang.String r0 = "device_id IN ("
            r1.append(r0)     // Catch:{ all -> 0x009a }
            r1.append(r2)     // Catch:{ all -> 0x009a }
            java.lang.String r0 = ")"
            r1.append(r0)     // Catch:{ all -> 0x009a }
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x009a }
            X.0tg r1 = r5.A02     // Catch:{ all -> 0x009a }
            java.lang.String r0 = "devices"
            r1.A00(r0, r8, r2, r7)     // Catch:{ all -> 0x009a }
            r11.A00()     // Catch:{ all -> 0x009a }
            r0 = 0
            r6.A00 = r0     // Catch:{ all -> 0x009a }
            monitor-exit(r6)     // Catch:{ all -> 0x009a }
            r11.close()     // Catch:{ all -> 0x00a2 }
            r5.close()     // Catch:{ all -> 0x00c2 }
            goto L_0x00ac
        L_0x009a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x009a }
            throw r0     // Catch:{ all -> 0x009d }
        L_0x009d:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x00a1 }
        L_0x00a1:
            throw r0     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x00a6 }
        L_0x00a6:
            throw r0     // Catch:{ all -> 0x00c2 }
        L_0x00a7:
            X.19N r0 = r14.A04     // Catch:{ all -> 0x00c2 }
            r0.A00(r4)     // Catch:{ all -> 0x00c2 }
        L_0x00ac:
            X.0uz r16 = X.C17380uz.of()     // Catch:{ all -> 0x00c2 }
            r19 = 0
            r20 = 0
            r18 = r3
            r17 = r4
            r14.A06(r15, r16, r17, r18, r19, r20)     // Catch:{ all -> 0x00c2 }
            r12.A00()     // Catch:{ all -> 0x00c2 }
            r12.close()     // Catch:{ all -> 0x00c7 }
            goto L_0x00cc
        L_0x00c2:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            throw r0     // Catch:{ all -> 0x00c7 }
        L_0x00c7:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x00cb }
        L_0x00cb:
            throw r0
        L_0x00cc:
            r13.close()
            r14.A03()
            X.0uz r0 = X.C17380uz.of()
            r14.A05(r15, r0, r4, r3)
        L_0x00d9:
            java.lang.String r0 = "DeviceManager/removeMyDevices/done"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19020xd.A07(X.0uz, boolean):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x00d7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00dc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00e1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(X.AnonymousClass1WN r18) {
        /*
            r17 = this;
            java.lang.String r0 = "DeviceManager/addMyDevice/start"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2 = r18
            com.whatsapp.jid.DeviceJid r6 = r2.A06
            boolean r1 = X.C16030sJ.A0M(r6)
            r10 = r17
            X.0sK r0 = r10.A01
            if (r1 == 0) goto L_0x0022
            X.1ZX r14 = r0.A04()
        L_0x0017:
            X.0uz r12 = X.C17380uz.of(r6)
            X.0tq r0 = r10.A02
            X.0tf r9 = r0.A02()
            goto L_0x002b
        L_0x0022:
            r0.A0B()
            X.1ZT r14 = r0.A05
            X.AnonymousClass00B.A06(r14)
            goto L_0x0017
        L_0x002b:
            X.1cj r8 = r9.A00()     // Catch:{ all -> 0x00e2 }
            X.0vs r0 = r10.A00()     // Catch:{ all -> 0x00dd }
            X.0uz r11 = r0.keySet()     // Catch:{ all -> 0x00dd }
            X.19N r4 = r10.A04     // Catch:{ all -> 0x00dd }
            X.1p7 r0 = r4.A02     // Catch:{ all -> 0x00dd }
            X.0tf r3 = r0.A02()     // Catch:{ all -> 0x00dd }
            X.1cj r7 = r3.A00()     // Catch:{ all -> 0x00d8 }
            monitor-enter(r4)     // Catch:{ all -> 0x00d3 }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x00d0 }
            r5.<init>()     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = "device_id"
            java.lang.String r0 = r6.getRawString()     // Catch:{ all -> 0x00d0 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = "platform_type"
            X.1p8 r0 = r2.A07     // Catch:{ all -> 0x00d0 }
            int r0 = r0.value     // Catch:{ all -> 0x00d0 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00d0 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = "device_os"
            java.lang.String r0 = r2.A08     // Catch:{ all -> 0x00d0 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r6 = "last_active"
            long r0 = r2.A00     // Catch:{ all -> 0x00d0 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00d0 }
            r5.put(r6, r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r6 = "login_time"
            long r0 = r2.A04     // Catch:{ all -> 0x00d0 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00d0 }
            r5.put(r6, r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r6 = "logout_time"
            long r0 = r2.A01     // Catch:{ all -> 0x00d0 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00d0 }
            r5.put(r6, r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = "adv_key_index"
            int r0 = r2.A03     // Catch:{ all -> 0x00d0 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00d0 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = "place_name"
            java.lang.String r0 = r2.A02     // Catch:{ all -> 0x00d0 }
            r5.put(r1, r0)     // Catch:{ all -> 0x00d0 }
            X.0tg r2 = r3.A02     // Catch:{ all -> 0x00d0 }
            java.lang.String r1 = "devices"
            r0 = 0
            r2.A05(r5, r1)     // Catch:{ all -> 0x00d0 }
            r7.A00()     // Catch:{ all -> 0x00d0 }
            r4.A00 = r0     // Catch:{ all -> 0x00d0 }
            monitor-exit(r4)     // Catch:{ all -> 0x00d0 }
            r7.close()     // Catch:{ all -> 0x00d8 }
            r3.close()     // Catch:{ all -> 0x00dd }
            X.0uz r13 = X.C17380uz.of()     // Catch:{ all -> 0x00dd }
            r15 = 0
            r16 = 0
            r10.A06(r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00dd }
            r8.A00()     // Catch:{ all -> 0x00dd }
            r8.close()     // Catch:{ all -> 0x00e2 }
            r9.close()
            r10.A03()
            X.0uz r0 = X.C17380uz.of()
            r10.A05(r11, r12, r0, r14)
            java.lang.String r0 = "DeviceManager/addMyDevice/done"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x00d0:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00d0 }
            throw r0     // Catch:{ all -> 0x00d3 }
        L_0x00d3:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x00d7 }
        L_0x00d7:
            throw r0     // Catch:{ all -> 0x00d8 }
        L_0x00d8:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x00dc }
        L_0x00dc:
            throw r0     // Catch:{ all -> 0x00dd }
        L_0x00dd:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x00e1 }
        L_0x00e1:
            throw r0     // Catch:{ all -> 0x00e2 }
        L_0x00e2:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x00e6 }
        L_0x00e6:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19020xd.A08(X.1WN):void");
    }
}
