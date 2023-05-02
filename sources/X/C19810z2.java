package X;

import android.content.SharedPreferences;
import android.os.SystemClock;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0z2  reason: invalid class name and case insensitive filesystem */
public class C19810z2 {
    public final C16300so A00;
    public final C16040sK A01;
    public final C16440t3 A02;
    public final C15860rz A03;
    public final AnonymousClass19B A04;
    public final C19020xd A05;

    public C19810z2(C16300so r1, C16040sK r2, C16440t3 r3, C15860rz r4, AnonymousClass19B r5, C19020xd r6) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = r6;
        this.A03 = r4;
        this.A04 = r5;
    }

    public static long A00(C38531qw r3, C19810z2 r4, UserJid userJid) {
        String str = "";
        if (userJid != null) {
            HashSet hashSet = new HashSet(r4.A0D(userJid));
            if (!hashSet.isEmpty()) {
                str = C37431p9.A00(hashSet);
            }
        }
        r3.A06 = str;
        r3.A02 = r4.A04(userJid);
        C37401p6 A09 = r4.A09(userJid);
        if (A09 != null) {
            return A09.A01;
        }
        return 0;
    }

    public static C17380uz A01(C17930vs r5, C17930vs r6) {
        C18390wc r4 = new C18390wc();
        C28031Ub it = r5.keySet().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!r6.containsKey(next) || r6.get(next) != r5.get(next)) {
                r4.add(next);
            }
        }
        return r4.build();
    }

    public static C17380uz A02(C17930vs r5, C17930vs r6) {
        C18390wc r4 = new C18390wc();
        C28031Ub it = r6.keySet().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!r5.containsKey(next) || r5.get(next) != r6.get(next)) {
                r5.get(next);
                r6.get(next);
                r4.add(next);
            }
        }
        return r4.build();
    }

    public long A03() {
        C16440t3 r3 = this.A02;
        if (r3.A01 != 0) {
            long elapsedRealtime = r3.A01 + SystemClock.elapsedRealtime();
            if (elapsedRealtime != 0) {
                return elapsedRealtime;
            }
        }
        return System.currentTimeMillis();
    }

    public long A04(UserJid userJid) {
        C37401p6 A09 = A09(userJid);
        if (A09 == null) {
            return 0;
        }
        return A09.A04;
    }

    public C17930vs A05() {
        C17930vs A002 = this.A05.A00();
        AnonymousClass1C5 r3 = new AnonymousClass1C5();
        C28031Ub it = A002.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            r3.put(entry.getKey(), Long.valueOf((long) ((AnonymousClass1WN) entry.getValue()).A03));
        }
        C16040sK r1 = this.A01;
        boolean A0G = r1.A0G();
        r1.A0B();
        r3.put(r1.A04, Long.valueOf(A0G ? (long) this.A03.A01() : 0));
        return r3.build();
    }

    public C17380uz A06() {
        C16040sK r0 = this.A01;
        r0.A0B();
        return r0.A05 == null ? C17380uz.of() : this.A05.A01().keySet();
    }

    public C37401p6 A07() {
        C15860rz r0 = this.A03;
        int A022 = r0.A02();
        AnonymousClass01D r4 = r0.A01;
        return new C37401p6(A022, ((SharedPreferences) r4.get()).getLong("adv_timestamp_sec", -1), ((SharedPreferences) r4.get()).getLong("adv_expected_timestamp_sec_in_companion_mode", 0), ((SharedPreferences) r4.get()).getLong("adv_expected_ts_last_device_job_ts_in_companion_mode", 0), ((SharedPreferences) r4.get()).getLong("adv_expected_ts_update_ts_in_companion_mode", 0));
    }

    public C37401p6 A08(C37401p6 r15, long j2) {
        long j3 = r15.A04;
        long j4 = j2;
        if (j3 < j2) {
            long j5 = r15.A01;
            if (j5 < j2) {
                long j6 = ((SharedPreferences) this.A03.A01.get()).getLong("adv_last_device_job_ts", 0);
                long j7 = r15.A02;
                if (j3 >= j5) {
                    j7 = A03();
                }
                return new C37401p6(r15.A00, j3, j4, j6, j7);
            }
        }
        return r15;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:37|38|39|40|41) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x007b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0080 */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0067 A[SYNTHETIC, Splitter:B:26:0x0067] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:40:0x0080=Splitter:B:40:0x0080, B:28:0x006a=Splitter:B:28:0x006a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C37401p6 A09(com.whatsapp.jid.UserJid r8) {
        /*
            r7 = this;
            if (r8 != 0) goto L_0x0004
            r0 = 0
            return r0
        L_0x0004:
            X.0sK r0 = r7.A01
            boolean r0 = r0.A0I(r8)
            if (r0 == 0) goto L_0x0011
            X.1p6 r0 = r7.A07()
            return r0
        L_0x0011:
            X.0xd r2 = r7.A05
            X.0sK r0 = r2.A01
            boolean r0 = r0.A0I(r8)
            r1 = r0 ^ 1
            java.lang.String r0 = "only query info for others"
            X.AnonymousClass00B.A0D(r0, r1)
            X.19O r5 = r2.A03
            java.lang.Object r3 = r5.A02
            monitor-enter(r3)
            java.util.Map r4 = r5.A03     // Catch:{ all -> 0x0081 }
            boolean r0 = r4.containsKey(r8)     // Catch:{ all -> 0x0081 }
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = r4.get(r8)     // Catch:{ all -> 0x0081 }
            X.1p6 r0 = (X.C37401p6) r0     // Catch:{ all -> 0x0081 }
        L_0x0033:
            monitor-exit(r3)     // Catch:{ all -> 0x0081 }
            goto L_0x0074
        L_0x0035:
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ all -> 0x0081 }
            X.14v r0 = r5.A00     // Catch:{ all -> 0x0081 }
            long r0 = r0.A01(r8)     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0081 }
            r0 = 0
            r6[r0] = r1     // Catch:{ all -> 0x0081 }
            X.0tq r0 = r5.A01     // Catch:{ all -> 0x0081 }
            X.0tf r2 = r0.get()     // Catch:{ all -> 0x0081 }
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x007c }
            java.lang.String r0 = "SELECT raw_id, timestamp, expected_timestamp, expected_ts_last_device_job_ts, expected_timestamp_update_ts FROM user_device_info WHERE user_jid_row_id = ?"
            android.database.Cursor r1 = r1.A08(r0, r6)     // Catch:{ all -> 0x007c }
            if (r1 == 0) goto L_0x0056
            goto L_0x0058
        L_0x0056:
            r0 = 0
            goto L_0x0062
        L_0x0058:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0075 }
            if (r0 == 0) goto L_0x0056
            X.1p6 r0 = r5.A00(r1)     // Catch:{ all -> 0x0075 }
        L_0x0062:
            r4.put(r8, r0)     // Catch:{ all -> 0x0075 }
            if (r1 == 0) goto L_0x006a
            r1.close()     // Catch:{ all -> 0x007c }
        L_0x006a:
            r2.close()     // Catch:{ all -> 0x0081 }
            java.lang.Object r0 = r4.get(r8)     // Catch:{ all -> 0x0081 }
            X.1p6 r0 = (X.C37401p6) r0     // Catch:{ all -> 0x0081 }
            goto L_0x0033
        L_0x0074:
            return r0
        L_0x0075:
            r0 = move-exception
            if (r1 == 0) goto L_0x007b
            r1.close()     // Catch:{ all -> 0x007b }
        L_0x007b:
            throw r0     // Catch:{ all -> 0x007c }
        L_0x007c:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0080 }
        L_0x0080:
            throw r0     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0081 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19810z2.A09(com.whatsapp.jid.UserJid):X.1p6");
    }

    public Map A0A(UserJid userJid) {
        AnonymousClass00B.A0G(!this.A01.A0I(userJid));
        HashMap hashMap = new HashMap(this.A05.A02(userJid));
        DeviceJid of = DeviceJid.of(userJid);
        AnonymousClass00B.A06(of);
        hashMap.put(of, 0L);
        return hashMap;
    }

    public Set A0B() {
        HashSet hashSet = new HashSet();
        AnonymousClass1ZX A032 = this.A01.A03();
        if (A032 != null) {
            C28031Ub it = A06().iterator();
            while (it.hasNext()) {
                DeviceJid deviceJid = (DeviceJid) it.next();
                if (C16030sJ.A0O(deviceJid.getUserJid())) {
                    try {
                        hashSet.add(new AnonymousClass1ZY(A032, deviceJid.device));
                    } catch (AnonymousClass1W4 e2) {
                        Log.w("Failed to map to LID companion", e2);
                    }
                }
            }
        }
        return hashSet;
    }

    public Set A0C() {
        HashSet hashSet = new HashSet();
        C28031Ub it = A06().iterator();
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            if (C16030sJ.A0O(deviceJid.getUserJid())) {
                hashSet.add(deviceJid);
            }
        }
        return hashSet;
    }

    public Set A0D(UserJid userJid) {
        Set A0B;
        Object A022;
        C16040sK r2 = this.A01;
        r2.A0B();
        if (userJid.equals(r2.A05)) {
            A0B = A0C();
            r2.A0B();
            A022 = r2.A04;
        } else if (userJid.equals(r2.A03())) {
            A0B = A0B();
            A022 = r2.A02();
        } else {
            HashSet hashSet = new HashSet(this.A05.A02(userJid).keySet());
            DeviceJid of = DeviceJid.of(userJid);
            AnonymousClass00B.A06(of);
            hashSet.add(of);
            return hashSet;
        }
        AnonymousClass00B.A06(A022);
        A0B.add(A022);
        return A0B;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0073 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E(X.C17380uz r12, com.whatsapp.jid.UserJid r13, boolean r14, boolean r15) {
        /*
            r11 = this;
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r12)
            X.0xd r4 = r11.A05
            r8 = r13
            X.0vs r0 = r4.A02(r13)
            X.0uz r0 = r0.keySet()
            r2.retainAll(r0)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x001b
            if (r14 == 0) goto L_0x009a
        L_0x001b:
            X.0uz r7 = X.C17380uz.copyOf((java.util.Collection) r2)
            X.0sK r0 = r4.A01
            boolean r0 = r0.A0I(r13)
            r1 = r0 ^ 1
            java.lang.String r0 = "only remove device for others"
            X.AnonymousClass00B.A0D(r0, r1)
            com.whatsapp.jid.DeviceJid r0 = r13.getPrimaryDevice()
            boolean r0 = r7.contains(r0)
            r1 = r0 ^ 1
            java.lang.String r0 = "never remove primary device."
            X.AnonymousClass00B.A0D(r0, r1)
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0079
            X.0tq r0 = r4.A02
            X.0tf r3 = r0.A02()
            X.1cj r1 = r3.A00()     // Catch:{ all -> 0x0074 }
            X.0vs r0 = r4.A02(r13)     // Catch:{ all -> 0x006f }
            X.0uz r5 = r0.keySet()     // Catch:{ all -> 0x006f }
            X.19P r0 = r4.A05     // Catch:{ all -> 0x006f }
            r0.A01(r7, r13)     // Catch:{ all -> 0x006f }
            if (r14 == 0) goto L_0x005f
            X.19O r0 = r4.A03     // Catch:{ all -> 0x006f }
            r0.A02(r13)     // Catch:{ all -> 0x006f }
        L_0x005f:
            X.0uz r6 = X.C17380uz.of()     // Catch:{ all -> 0x006f }
            r9 = 0
            r10 = r15
            r4.A06(r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x006f }
            r1.A00()     // Catch:{ all -> 0x006f }
            r1.close()     // Catch:{ all -> 0x0074 }
            goto L_0x0081
        L_0x006f:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0073 }
        L_0x0073:
            throw r0     // Catch:{ all -> 0x0074 }
        L_0x0074:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0078 }
        L_0x0078:
            throw r0
        L_0x0079:
            if (r14 == 0) goto L_0x008b
            X.19O r0 = r4.A03
            r0.A02(r13)
            goto L_0x008b
        L_0x0081:
            r3.close()
            X.0uz r0 = X.C17380uz.of()
            r4.A05(r5, r0, r7, r13)
        L_0x008b:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x009a
            X.19B r1 = r11.A04
            java.util.Set r0 = java.util.Collections.emptySet()
            r1.A04(r13, r0, r2)
        L_0x009a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19810z2.A0E(X.0uz, com.whatsapp.jid.UserJid, boolean, boolean):void");
    }

    public void A0F(C37401p6 r6, UserJid userJid) {
        C16040sK r1 = this.A01;
        if (r1.A0I(userJid)) {
            AnonymousClass00B.A0F(r1.A0G());
            C15860rz r4 = this.A03;
            r4.A0K().putInt("adv_raw_id", r6.A00).apply();
            r4.A0K().putLong("adv_timestamp_sec", r6.A04).apply();
            r4.A0K().putLong("adv_expected_timestamp_sec_in_companion_mode", r6.A01).apply();
            r4.A0K().putLong("adv_expected_ts_last_device_job_ts_in_companion_mode", r6.A03).apply();
            r4.A0K().putLong("adv_expected_ts_update_ts_in_companion_mode", r6.A02).apply();
            return;
        }
        this.A05.A03.A01(r6, userJid);
    }

    public void A0G(UserJid userJid, HashMap hashMap) {
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry : hashMap.entrySet()) {
            if (!((DeviceJid) entry.getKey()).getUserJid().equals(userJid)) {
                hashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        if (hashMap2.size() > 0) {
            C16300so r3 = this.A00;
            StringBuilder sb = new StringBuilder("userJid=");
            sb.append(userJid);
            sb.append("; deviceJids=");
            StringBuilder sb2 = new StringBuilder();
            for (Map.Entry entry2 : hashMap2.entrySet()) {
                sb2.append(",");
                sb2.append(entry2.getKey());
                sb2.append(":");
                sb2.append(entry2.getValue());
            }
            sb.append(sb2.length() > 0 ? sb2.substring(1) : "no-data-found");
            r3.AcB("userdevicemanager/invalid_devices", sb.toString(), false);
            for (Object remove : hashMap2.keySet()) {
                hashMap.remove(remove);
            }
        }
    }

    public void A0H(UserJid userJid, boolean z2, boolean z3) {
        AnonymousClass00B.A0G(!this.A01.A0I(userJid));
        HashSet hashSet = new HashSet(this.A05.A02(userJid).keySet());
        hashSet.remove(userJid.getPrimaryDevice());
        A0E(C17380uz.copyOf((Collection) hashSet), userJid, z2, z3);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x0139 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x013e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x0143 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0I(X.C17930vs r29, X.C37401p6 r30, com.whatsapp.jid.UserJid r31, boolean r32) {
        /*
            r28 = this;
            r7 = r28
            X.0sK r0 = r7.A01
            r8 = r31
            boolean r0 = r0.A0I(r8)
            r1 = r0 ^ 1
            java.lang.String r0 = "cannot refresh yourself device"
            X.AnonymousClass00B.A0D(r0, r1)
            java.util.HashMap r0 = new java.util.HashMap
            r1 = r29
            r0.<init>(r1)
            r7.A0G(r8, r0)
            X.0vs r6 = X.C17930vs.copyOf((java.util.Map) r0)
            X.0xd r5 = r7.A05
            X.0vs r4 = r5.A02(r8)
            X.0sK r0 = r5.A01
            boolean r0 = r0.A0I(r8)
            r1 = r0 ^ 1
            java.lang.String r0 = "only refresh devices for others"
            X.AnonymousClass00B.A0D(r0, r1)
            X.0uz r1 = r6.keySet()
            com.whatsapp.jid.DeviceJid r0 = r8.getPrimaryDevice()
            boolean r1 = r1.contains(r0)
            java.lang.String r0 = "device list should always include primary."
            X.AnonymousClass00B.A0D(r0, r1)
            X.0vs r3 = r5.A02(r8)
            X.0uz r14 = A01(r6, r3)
            X.0uz r2 = A02(r6, r3)
            boolean r0 = r14.isEmpty()
            r9 = r30
            r26 = r32
            if (r0 == 0) goto L_0x00a6
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x00a6
            if (r32 == 0) goto L_0x0072
            X.0uz r22 = r3.keySet()
            r27 = 0
            r21 = r5
            r23 = r14
            r24 = r2
            r25 = r8
            r21.A06(r22, r23, r24, r25, r26, r27)
        L_0x0072:
            if (r30 == 0) goto L_0x0079
            X.19O r0 = r5.A03
            r0.A01(r9, r8)
        L_0x0079:
            X.0uz r0 = r3.keySet()
            r5.A05(r0, r14, r2, r8)
            X.0uz r0 = A01(r6, r4)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r0)
            X.0uz r0 = A02(r6, r4)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r0)
            X.19B r0 = r7.A04
            r0.A04(r8, r2, r1)
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L_0x00a4
            boolean r1 = r1.isEmpty()
            r0 = 0
            if (r1 != 0) goto L_0x00a5
        L_0x00a4:
            r0 = 1
        L_0x00a5:
            return r0
        L_0x00a6:
            X.0tq r0 = r5.A02
            X.0tf r20 = r0.A02()
            X.1cj r19 = r20.A00()     // Catch:{ all -> 0x0144 }
            X.19P r11 = r5.A05     // Catch:{ all -> 0x013f }
            X.14v r0 = r11.A00     // Catch:{ all -> 0x013f }
            long r17 = r0.A01(r8)     // Catch:{ all -> 0x013f }
            X.0tq r0 = r11.A01     // Catch:{ all -> 0x013f }
            X.0tf r10 = r0.A02()     // Catch:{ all -> 0x013f }
            X.1cj r16 = r10.A00()     // Catch:{ all -> 0x013a }
            X.0tg r13 = r10.A02     // Catch:{ all -> 0x0135 }
            java.lang.String r12 = "user_device"
            java.lang.String r1 = "user_jid_row_id = ?"
            r0 = 1
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ all -> 0x0135 }
            r27 = 0
            java.lang.String r15 = java.lang.String.valueOf(r17)     // Catch:{ all -> 0x0135 }
            r0[r27] = r15     // Catch:{ all -> 0x0135 }
            r13.A01(r12, r1, r0)     // Catch:{ all -> 0x0135 }
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x0135 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0108
            X.0uz r0 = r6.entrySet()     // Catch:{ all -> 0x0135 }
            X.1Ub r13 = r0.iterator()     // Catch:{ all -> 0x0135 }
        L_0x00e8:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0135 }
            if (r0 == 0) goto L_0x0108
            java.lang.Object r0 = r13.next()     // Catch:{ all -> 0x0135 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0135 }
            java.lang.Object r12 = r0.getKey()     // Catch:{ all -> 0x0135 }
            com.whatsapp.jid.DeviceJid r12 = (com.whatsapp.jid.DeviceJid) r12     // Catch:{ all -> 0x0135 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0135 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0135 }
            long r0 = r0.longValue()     // Catch:{ all -> 0x0135 }
            r11.A03(r12, r8, r0)     // Catch:{ all -> 0x0135 }
            goto L_0x00e8
        L_0x0108:
            r16.A00()     // Catch:{ all -> 0x0135 }
            r11.A02(r10, r8)     // Catch:{ all -> 0x0135 }
            r16.close()     // Catch:{ all -> 0x013a }
            r10.close()     // Catch:{ all -> 0x013f }
            if (r30 == 0) goto L_0x011b
            X.19O r0 = r5.A03     // Catch:{ all -> 0x013f }
            r0.A01(r9, r8)     // Catch:{ all -> 0x013f }
        L_0x011b:
            X.0uz r22 = r3.keySet()     // Catch:{ all -> 0x013f }
            r21 = r5
            r23 = r14
            r24 = r2
            r25 = r8
            r21.A06(r22, r23, r24, r25, r26, r27)     // Catch:{ all -> 0x013f }
            r19.A00()     // Catch:{ all -> 0x013f }
            r19.close()     // Catch:{ all -> 0x0144 }
            r20.close()
            goto L_0x0079
        L_0x0135:
            r0 = move-exception
            r16.close()     // Catch:{ all -> 0x0139 }
        L_0x0139:
            throw r0     // Catch:{ all -> 0x013a }
        L_0x013a:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x013e }
        L_0x013e:
            throw r0     // Catch:{ all -> 0x013f }
        L_0x013f:
            r0 = move-exception
            r19.close()     // Catch:{ all -> 0x0143 }
        L_0x0143:
            throw r0     // Catch:{ all -> 0x0144 }
        L_0x0144:
            r0 = move-exception
            r20.close()     // Catch:{ all -> 0x0148 }
        L_0x0148:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19810z2.A0I(X.0vs, X.1p6, com.whatsapp.jid.UserJid, boolean):boolean");
    }

    public boolean A0J(UserJid userJid, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        HashSet hashSet = new HashSet();
        hashSet.addAll(A0D(userJid));
        return C37431p9.A00(hashSet).equals(str);
    }
}
