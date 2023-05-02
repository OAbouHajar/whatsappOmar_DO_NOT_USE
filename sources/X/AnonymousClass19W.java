package X;

import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.obwhatsapp.jobqueue.job.SendPeerMessageJob;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.security.SecureRandom;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.19W  reason: invalid class name */
public class AnonymousClass19W {
    public final C16040sK A00;
    public final C15900s5 A01;
    public final C19000xb A02;
    public final AnonymousClass19E A03;
    public final C16440t3 A04;
    public final C15860rz A05;
    public final AnonymousClass19Q A06;
    public final AnonymousClass19M A07;
    public final AnonymousClass19V A08;
    public final AnonymousClass19L A09;
    public final C224718b A0A;

    public AnonymousClass19W(C16040sK r1, C15900s5 r2, C19000xb r3, AnonymousClass19E r4, C16440t3 r5, C15860rz r6, AnonymousClass19Q r7, AnonymousClass19M r8, AnonymousClass19V r9, AnonymousClass19L r10, C224718b r11) {
        this.A04 = r5;
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A08 = r9;
        this.A03 = r4;
        this.A06 = r7;
        this.A07 = r8;
        this.A0A = r11;
        this.A05 = r6;
        this.A09 = r10;
    }

    public AnonymousClass1WY A00() {
        if (!A0A()) {
            int A002 = this.A08.A00();
            if (A002 == 0) {
                A002 = new SecureRandom().nextInt(AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED);
            }
            AnonymousClass1WK r7 = new AnonymousClass1WK(this.A00.A00(), A002 + 1);
            byte[] A0E = C004101u.A0E(32);
            long A003 = this.A04.A00();
            C15860rz r0 = this.A05;
            AnonymousClass1WY r5 = new AnonymousClass1WY(new C28511Wj(new C35751mR(A06(), r0.A02(), r0.A01()), A0E, A003), r7);
            StringBuilder sb = new StringBuilder("SyncdKeyManager/generateAndShareNewKey syncdKey = ");
            sb.append(r5);
            Log.i(sb.toString());
            Collection<AnonymousClass1WN> A004 = this.A06.A00();
            if (A004.isEmpty()) {
                A07();
                A09(Collections.singleton(r5));
                return r5;
            }
            for (AnonymousClass1WN r3 : A004) {
                A08(r3.A06, new HashMap(Collections.singletonMap(r5.A01, r5)), true);
            }
        }
        return null;
    }

    public AnonymousClass1WY A01() {
        AnonymousClass1WY A012 = this.A08.A01();
        if (A012 != null) {
            long millis = TimeUnit.DAYS.toMillis((long) this.A01.A02(C15910s6.A1W));
            long A002 = this.A04.A00();
            C28511Wj r2 = A012.A00;
            if (A002 - r2.A00 > millis || !A0C(r2)) {
                return null;
            }
            return A012;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0164, code lost:
        if (r3.get((java.lang.Object) null) != null) goto L_0x0166;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x0153 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashMap A02(java.lang.String r15, java.util.Collection r16) {
        /*
            r14 = this;
            X.19V r2 = r14.A08
            r0 = 0
            r3 = r16
            r2.A03(r3, r0)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r3)
            java.util.HashMap r3 = r14.A03(r0)
            r4 = 0
            boolean r0 = r3.containsValue(r4)
            if (r0 == 0) goto L_0x0173
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x0026:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0042
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            if (r1 == 0) goto L_0x0026
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto L_0x0026
            r5.add(r1)
            goto L_0x0026
        L_0x0042:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0159
            java.lang.String r1 = "SyncdKeyManager/requestMissingKeys syncdKeyIds="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0sK r0 = r14.A00
            r0.A0B()
            X.1ZT r10 = r0.A05
            if (r10 == 0) goto L_0x00da
            boolean r0 = r5.isEmpty()
            r9 = 1
            if (r0 != 0) goto L_0x00da
            java.util.Set r0 = r14.A05()
            java.util.HashSet r8 = new java.util.HashSet
            r8.<init>(r5)
            r8.removeAll(r0)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x00da
            X.19Q r0 = r14.A06
            java.util.Collection r0 = r0.A00()
            java.util.Iterator r13 = r0.iterator()
        L_0x0085:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00cc
            java.lang.Object r4 = r13.next()
            X.1WN r4 = (X.AnonymousClass1WN) r4
            X.18b r2 = r14.A0A
            X.0t3 r0 = r14.A04
            long r0 = r0.A00()
            com.whatsapp.jid.DeviceJid r7 = r4.A06
            X.1Vw r2 = r2.A02(r10, r9)
            X.1pQ r6 = new X.1pQ
            r6.<init>(r2, r0)
            r6.A00 = r7
            java.util.Set r0 = r6.A00
            r0.clear()
            r0.addAll(r8)
            X.19M r0 = r14.A07
            long r11 = r0.A01(r6)
            r1 = 0
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00bf
            java.lang.String r0 = "SyncdKeyManager/requestMissingKeys to add peer message"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00bf:
            X.0xb r4 = r14.A02
            r2 = 0
            r1 = 0
            com.obwhatsapp.jobqueue.job.SendPeerMessageJob r0 = new com.obwhatsapp.jobqueue.job.SendPeerMessageJob
            r0.<init>(r7, r6, r2, r1)
            r4.A00(r0)
            goto L_0x0085
        L_0x00cc:
            X.19E r1 = r14.A03
            int r0 = r8.size()
            X.139 r4 = r1.A01
            long r1 = (long) r0
            java.lang.String r0 = "missing_key_counter"
            r4.A06(r0, r1)
        L_0x00da:
            X.19L r0 = r14.A09
            X.19K r0 = r0.A00
            X.0tf r4 = r0.A02()
            X.1cj r10 = r4.A00()     // Catch:{ all -> 0x0154 }
            X.0tg r1 = r4.A02     // Catch:{ all -> 0x014f }
            java.lang.String r0 = "INSERT OR REPLACE INTO missing_keys (device_id, epoch, collection_name) VALUES (?, ?, ?)"
            X.1ou r6 = r1.A0A(r0)     // Catch:{ all -> 0x014f }
            java.util.Iterator r9 = r5.iterator()     // Catch:{ all -> 0x014f }
        L_0x00f2:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x014f }
            if (r0 == 0) goto L_0x0138
            java.lang.Object r5 = r9.next()     // Catch:{ all -> 0x014f }
            X.1WK r5 = (X.AnonymousClass1WK) r5     // Catch:{ all -> 0x014f }
            android.database.sqlite.SQLiteStatement r7 = r6.A00     // Catch:{ all -> 0x014f }
            r7.clearBindings()     // Catch:{ all -> 0x014f }
            r2 = 1
            int r0 = r5.A00()     // Catch:{ all -> 0x014f }
            long r0 = (long) r0     // Catch:{ all -> 0x014f }
            r6.A01(r2, r0)     // Catch:{ all -> 0x014f }
            r2 = 2
            int r0 = r5.A01()     // Catch:{ all -> 0x014f }
            long r0 = (long) r0     // Catch:{ all -> 0x014f }
            r6.A01(r2, r0)     // Catch:{ all -> 0x014f }
            r0 = 3
            r6.A02(r0, r15)     // Catch:{ all -> 0x014f }
            long r7 = r7.executeInsert()     // Catch:{ all -> 0x014f }
            r1 = -1
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00f2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x014f }
            r1.<init>()     // Catch:{ all -> 0x014f }
            java.lang.String r0 = "SyncdMissingKeyStore/storeMissingKeys failed to store missing key: "
            r1.append(r0)     // Catch:{ all -> 0x014f }
            r1.append(r5)     // Catch:{ all -> 0x014f }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x014f }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x014f }
            goto L_0x00f2
        L_0x0138:
            r10.A00()     // Catch:{ all -> 0x014f }
            r10.close()     // Catch:{ all -> 0x0154 }
            r4.close()
            boolean r0 = r14.A0B()
            if (r0 == 0) goto L_0x0173
            r1 = 71
            X.1X9 r0 = new X.1X9
            r0.<init>(r1, r15)
            throw r0
        L_0x014f:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x0153 }
        L_0x0153:
            throw r0     // Catch:{ all -> 0x0154 }
        L_0x0154:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0158 }
        L_0x0158:
            throw r0
        L_0x0159:
            boolean r0 = r3.containsKey(r4)
            if (r0 == 0) goto L_0x0166
            java.lang.Object r0 = r3.get(r4)
            r1 = 1
            if (r0 == 0) goto L_0x0167
        L_0x0166:
            r1 = 0
        L_0x0167:
            java.lang.String r0 = "SyncdKeyManager/resolveKeys: either there are missing keys or active key is missing"
            X.AnonymousClass00B.A0D(r0, r1)
            X.1WY r0 = r14.A00()
            r3.put(r4, r0)
        L_0x0173:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass19W.A02(java.lang.String, java.util.Collection):java.util.HashMap");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0068 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.HashMap A03(java.util.Collection r11) {
        /*
            r10 = this;
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.Iterator r9 = r11.iterator()
        L_0x0009:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x006e
            java.lang.Object r5 = r9.next()
            X.1WK r5 = (X.AnonymousClass1WK) r5
            if (r5 == 0) goto L_0x0055
            X.19V r7 = r10.A08
            X.19K r0 = r7.A00
            X.0tf r4 = r0.get()
            X.0tg r8 = r4.A02     // Catch:{ all -> 0x0069 }
            java.lang.String r3 = "SELECT device_id, epoch, key_data, timestamp, fingerprint FROM crypto_info WHERE device_id = ?  AND epoch = ? "
            r0 = 2
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0069 }
            r1 = 0
            int r0 = r5.A00()     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0069 }
            r2[r1] = r0     // Catch:{ all -> 0x0069 }
            r1 = 1
            int r0 = r5.A01()     // Catch:{ all -> 0x0069 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0069 }
            r2[r1] = r0     // Catch:{ all -> 0x0069 }
            android.database.Cursor r1 = r8.A08(r3, r2)     // Catch:{ all -> 0x0069 }
            boolean r0 = r1.moveToFirst()     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x0051
            X.1WY r0 = r7.A02(r1)     // Catch:{ all -> 0x0062 }
            r1.close()     // Catch:{ all -> 0x0069 }
            r4.close()
            goto L_0x005e
        L_0x0051:
            r1.close()     // Catch:{ all -> 0x0069 }
            goto L_0x005a
        L_0x0055:
            X.1WY r0 = r10.A01()
            goto L_0x005e
        L_0x005a:
            r4.close()
            r0 = 0
        L_0x005e:
            r6.put(r5, r0)
            goto L_0x0009
        L_0x0062:
            r0 = move-exception
            if (r1 == 0) goto L_0x0068
            r1.close()     // Catch:{ all -> 0x0068 }
        L_0x0068:
            throw r0     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x006d }
        L_0x006d:
            throw r0
        L_0x006e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass19W.A03(java.util.Collection):java.util.HashMap");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0037 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A04() {
        /*
            r5 = this;
            X.19L r0 = r5.A09
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            X.19K r0 = r0.A00
            X.0tf r3 = r0.get()
            X.0tg r2 = r3.A02     // Catch:{ all -> 0x0038 }
            java.lang.String r1 = "SELECT DISTINCT collection_name FROM missing_keys"
            r0 = 0
            android.database.Cursor r1 = r2.A08(r1, r0)     // Catch:{ all -> 0x0038 }
        L_0x0016:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = "collection_name"
            int r0 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0031 }
            java.lang.String r0 = r1.getString(r0)     // Catch:{ all -> 0x0031 }
            r4.add(r0)     // Catch:{ all -> 0x0031 }
            goto L_0x0016
        L_0x002a:
            r1.close()     // Catch:{ all -> 0x0038 }
            r3.close()
            return r4
        L_0x0031:
            r0 = move-exception
            if (r1 == 0) goto L_0x0037
            r1.close()     // Catch:{ all -> 0x0037 }
        L_0x0037:
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x003c }
        L_0x003c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass19W.A04():java.util.Set");
    }

    public Set A05() {
        List<C37601pQ> A042 = this.A07.A04((byte) 39);
        HashSet hashSet = new HashSet();
        for (C37601pQ r0 : A042) {
            hashSet.addAll(Collections.unmodifiableSet(r0.A00));
        }
        return hashSet;
    }

    public final Set A06() {
        HashSet hashSet = new HashSet();
        for (AnonymousClass1WN r0 : this.A06.A00()) {
            hashSet.add(Integer.valueOf(r0.A03));
        }
        hashSet.add(Integer.valueOf(this.A00.A00()));
        return hashSet;
    }

    public final void A07() {
        int i2;
        AnonymousClass1WY A012 = this.A08.A01();
        if (A012 == null) {
            i2 = 3;
        } else {
            i2 = 1;
            if (!A0C(A012.A00)) {
                i2 = 2;
            }
        }
        AnonymousClass19E r2 = this.A03;
        C37631pT r1 = new C37631pT();
        r1.A00 = Integer.valueOf(i2);
        r2.A06.A06(r1);
    }

    public void A08(DeviceJid deviceJid, HashMap hashMap, boolean z2) {
        C16040sK r0 = this.A00;
        r0.A0B();
        AnonymousClass1ZT r4 = r0.A05;
        if (r4 != null && !hashMap.isEmpty()) {
            C224718b r2 = this.A0A;
            C37571pN r5 = new C37571pN(r2.A02(r4, true), this.A04.A00());
            r5.A00 = deviceJid;
            r5.A13(hashMap);
            r5.A01 = z2;
            if (this.A07.A01(r5) < 0) {
                Log.e("SyncdKeyManager/shareKeys unable to add peer message");
            } else {
                this.A02.A00(new SendPeerMessageJob(deviceJid, r5, (byte[]) null, 0));
            }
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0086 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(java.util.Set r11) {
        /*
            r10 = this;
            X.19V r0 = r10.A08
            X.19K r0 = r0.A00
            X.0tf r5 = r0.A02()
            X.1cj r9 = r5.A00()     // Catch:{ all -> 0x0087 }
            X.0tg r1 = r5.A02     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "INSERT OR IGNORE INTO crypto_info (device_id, epoch, key_data, timestamp, fingerprint) VALUES (?, ?, ?, ?, ?)"
            X.1ou r7 = r1.A0A(r0)     // Catch:{ all -> 0x0082 }
            java.util.Iterator r8 = r11.iterator()     // Catch:{ all -> 0x0082 }
        L_0x0018:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x0078
            java.lang.Object r4 = r8.next()     // Catch:{ all -> 0x0082 }
            X.1WY r4 = (X.AnonymousClass1WY) r4     // Catch:{ all -> 0x0082 }
            android.database.sqlite.SQLiteStatement r3 = r7.A00     // Catch:{ all -> 0x0082 }
            r3.clearBindings()     // Catch:{ all -> 0x0082 }
            r2 = 1
            X.1WK r6 = r4.A01     // Catch:{ all -> 0x0082 }
            int r0 = r6.A00()     // Catch:{ all -> 0x0082 }
            long r0 = (long) r0     // Catch:{ all -> 0x0082 }
            r7.A01(r2, r0)     // Catch:{ all -> 0x0082 }
            r2 = 2
            int r0 = r6.A01()     // Catch:{ all -> 0x0082 }
            long r0 = (long) r0     // Catch:{ all -> 0x0082 }
            r7.A01(r2, r0)     // Catch:{ all -> 0x0082 }
            X.1Wj r4 = r4.A00     // Catch:{ all -> 0x0082 }
            byte[] r1 = r4.A02     // Catch:{ all -> 0x0082 }
            r0 = 3
            r3.bindBlob(r0, r1)     // Catch:{ all -> 0x0082 }
            r2 = 4
            long r0 = r4.A00     // Catch:{ all -> 0x0082 }
            r7.A01(r2, r0)     // Catch:{ all -> 0x0082 }
            X.1mR r0 = r4.A01     // Catch:{ all -> 0x0082 }
            X.1mQ r0 = r0.A01()     // Catch:{ all -> 0x0082 }
            byte[] r1 = r0.A02()     // Catch:{ all -> 0x0082 }
            r0 = 5
            r3.bindBlob(r0, r1)     // Catch:{ all -> 0x0082 }
            long r3 = r3.executeInsert()     // Catch:{ all -> 0x0082 }
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0018
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0082 }
            r1.<init>()     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = "SyncdCryptoStore/saveKey failed to store key: "
            r1.append(r0)     // Catch:{ all -> 0x0082 }
            r1.append(r6)     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0082 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0082 }
            goto L_0x0018
        L_0x0078:
            r9.A00()     // Catch:{ all -> 0x0082 }
            r9.close()     // Catch:{ all -> 0x0087 }
            r5.close()
            return
        L_0x0082:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0086 }
        L_0x0086:
            throw r0     // Catch:{ all -> 0x0087 }
        L_0x0087:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x008b }
        L_0x008b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass19W.A09(java.util.Set):void");
    }

    public boolean A0A() {
        for (C37571pN r1 : this.A07.A04((byte) 38)) {
            if (!r1.A01 && r1.A01) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0B() {
        Set A042 = A04();
        if (!(!A042.isEmpty()) || !A05().isEmpty()) {
            return false;
        }
        StringBuilder sb = new StringBuilder("SyncdKeyManager/isKeyMissingOnAllClients: key(s) missing on all the clients for collection(s): ");
        sb.append(A042);
        Log.e(sb.toString());
        return true;
    }

    public boolean A0C(C28511Wj r8) {
        String str;
        C35751mR r6 = r8.A01;
        int i2 = r6.A01;
        C15860rz r1 = this.A05;
        if (i2 != r1.A02()) {
            str = "SyncdKeyManager/verifyFingerprintOfKey: fingerprint mismatch: rawId did not match";
        } else {
            int A012 = r1.A01();
            HashSet hashSet = new HashSet(r6.A02);
            int i3 = r6.A00;
            while (true) {
                i3++;
                if (i3 > A012) {
                    break;
                }
                hashSet.add(Integer.valueOf(i3));
            }
            if (A06().equals(hashSet)) {
                return true;
            }
            str = "SyncdKeyManager/verifyFingerprintOfKey: fingerprint mismatch: one of a peer device is no longer registered";
        }
        Log.i(str);
        return false;
    }
}
