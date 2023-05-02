package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: X.137  reason: invalid class name */
public class AnonymousClass137 {
    public WeakHashMap A00 = new WeakHashMap();
    public final C16040sK A01;
    public final C19250y7 A02;
    public final C19680yp A03;
    public final C15480r5 A04;
    public final AnonymousClass16U A05;
    public final C16440t3 A06;
    public final C208211s A07;
    public final C18920xT A08;
    public final AnonymousClass16V A09;
    public final C19410yO A0A;
    public final AnonymousClass162 A0B;
    public final C17640vP A0C;
    public final C19810z2 A0D;
    public final C14710pd A0E;

    public AnonymousClass137(C16040sK r2, C19250y7 r3, C19680yp r4, C15480r5 r5, AnonymousClass16U r6, C16440t3 r7, C208211s r8, C18920xT r9, AnonymousClass16V r10, C19410yO r11, AnonymousClass162 r12, C17640vP r13, C19810z2 r14, C14710pd r15) {
        this.A06 = r7;
        this.A0E = r15;
        this.A01 = r2;
        this.A08 = r9;
        this.A05 = r6;
        this.A07 = r8;
        this.A0D = r14;
        this.A0C = r13;
        this.A02 = r3;
        this.A0B = r12;
        this.A09 = r10;
        this.A0A = r11;
        this.A04 = r5;
        this.A03 = r4;
    }

    public static C30351cD A00(byte[] bArr, byte b2) {
        try {
            return C28851Ya.A01(C28641Wx.A04(new byte[]{b2}, bArr));
        } catch (C31751ey e2) {
            Log.e("DeviceVerificationUtil/generatePublicIdentityKey invalidKeyException", e2);
            return null;
        }
    }

    public static byte[] A01(MessageDigest messageDigest, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((AnonymousClass1WL) it.next()).A00.A01);
        }
        Collections.sort(arrayList, new AnonymousClass27Q());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            messageDigest.update((byte[]) it2.next());
        }
        return messageDigest.digest();
    }

    public final C28631Ww A02(C17930vs r10, UserJid userJid, Map map, Set set) {
        HashSet hashSet = new HashSet();
        boolean z2 = true;
        if (r10.size() > 1) {
            boolean A0I = this.A01.A0I(userJid);
            ArrayList arrayList = new ArrayList();
            C28031Ub it = r10.entrySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    DeviceJid deviceJid = (DeviceJid) ((Map.Entry) it.next()).getKey();
                    Object obj = map.get(C28851Ya.A02(deviceJid));
                    if (obj == null) {
                        StringBuilder sb = new StringBuilder("DeviceADVInfoManager/getKeyHash cannot find identity key for device=");
                        sb.append(deviceJid);
                        sb.append("; isMe=");
                        sb.append(A0I);
                        Log.w(sb.toString());
                        if (A0I) {
                            break;
                        }
                        hashSet.add(deviceJid);
                    } else {
                        arrayList.add(obj);
                    }
                } else {
                    z2 = false;
                    if (!arrayList.isEmpty()) {
                        if (!hashSet.isEmpty() && !A0I) {
                            C28031Ub it2 = r10.entrySet().iterator();
                            while (it2.hasNext()) {
                                Map.Entry entry = (Map.Entry) it2.next();
                                if (!hashSet.contains(entry.getKey())) {
                                    set.add(Integer.valueOf(((Number) entry.getValue()).intValue()));
                                }
                            }
                        }
                        try {
                            byte[] A012 = A01(MessageDigest.getInstance("SHA-256"), arrayList);
                            int A032 = this.A0E.A03(C16620tM.A02, 310);
                            byte[] bArr = new byte[A032];
                            System.arraycopy(A012, 0, bArr, 0, A032);
                            return C28631Ww.A01(bArr, 0, A032);
                        } catch (NoSuchAlgorithmException e2) {
                            Log.e("DeviceADVInfoManager/getKeyHash no such algorithm exception", e2);
                            this.A0B.A04(false);
                            return null;
                        }
                    }
                }
            }
            this.A0B.A04(z2);
        }
        return null;
    }

    public final C28631Ww A03(UserJid userJid, Set set) {
        Map A0A2;
        Set<DeviceJid> keySet;
        AnonymousClass1WL A0B2;
        C16040sK r4 = this.A01;
        boolean A0I = r4.A0I(userJid);
        if (A0I) {
            A0A2 = new HashMap();
            keySet = this.A0D.A0D(userJid);
        } else {
            A0A2 = this.A0D.A0A(userJid);
            keySet = A0A2.keySet();
        }
        HashSet hashSet = new HashSet();
        if (keySet.size() > 1) {
            ArrayList arrayList = new ArrayList();
            for (DeviceJid deviceJid : keySet) {
                if (r4.A0K(deviceJid)) {
                    A0B2 = this.A07.A00.A04().A01;
                } else {
                    A0B2 = this.A07.A0B(C28851Ya.A02(deviceJid));
                }
                if (A0B2 == null) {
                    StringBuilder sb = new StringBuilder("DeviceADVInfoManager/getKeyHash cannot find identity key for device=");
                    sb.append(deviceJid);
                    sb.append("; isMe=");
                    sb.append(A0I);
                    Log.w(sb.toString());
                    if (A0I) {
                        this.A0B.A04(true);
                    } else {
                        hashSet.add(deviceJid);
                    }
                } else {
                    arrayList.add(A0B2);
                }
            }
            if (arrayList.isEmpty()) {
                this.A0B.A04(false);
                return null;
            }
            if (!hashSet.isEmpty()) {
                for (Map.Entry entry : A0A2.entrySet()) {
                    if (!hashSet.contains(entry.getKey())) {
                        set.add(Integer.valueOf(((Number) entry.getValue()).intValue()));
                    }
                }
            }
            try {
                byte[] A012 = A01(MessageDigest.getInstance("SHA-256"), arrayList);
                int A032 = this.A0E.A03(C16620tM.A02, 310);
                byte[] bArr = new byte[A032];
                System.arraycopy(A012, 0, bArr, 0, A032);
                return C28631Ww.A01(bArr, 0, A032);
            } catch (NoSuchAlgorithmException e2) {
                Log.e("DeviceADVInfoManager/getKeyHash no such algorithm exception", e2);
                this.A0B.A04(false);
                return null;
            }
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005e, code lost:
        if ((r3.A06.A00() - (1000 * r14)) >= 2592000000L) goto L_0x007a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0074  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass27R A04(com.whatsapp.jid.UserJid r17) {
        /*
            r16 = this;
            r3 = r16
            X.0sK r7 = r3.A01
            r7.A0B()
            X.1ZT r1 = r7.A05
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            X.1Ww r9 = r3.A03(r1, r0)
            r7.A0B()
            X.1ZT r0 = r7.A05
            X.0z2 r4 = r3.A0D
            long r12 = r4.A04(r0)
            if (r9 != 0) goto L_0x0034
            X.0t3 r0 = r3.A06
            long r5 = r0.A00()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r12
            long r5 = r5 - r0
            r1 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0034
            r12 = 0
        L_0x0034:
            r1 = r17
            boolean r0 = r7.A0I(r1)
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>()
            r7 = 0
            if (r0 == 0) goto L_0x007d
            r10 = r7
        L_0x0043:
            r5 = 0
            if (r0 != 0) goto L_0x007a
            long r14 = r4.A04(r1)
            if (r10 != 0) goto L_0x0060
            X.0t3 r0 = r3.A06
            long r3 = r0.A00()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r14
            long r3 = r3 - r0
            r1 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x007a
        L_0x0060:
            if (r9 != 0) goto L_0x006c
            int r0 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x006c
            if (r10 != 0) goto L_0x006c
            int r0 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0079
        L_0x006c:
            X.27R r8 = new X.27R
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x0075
            r11 = r7
        L_0x0075:
            r7 = r8
            r8.<init>(r9, r10, r11, r12, r14)
        L_0x0079:
            return r7
        L_0x007a:
            r14 = 0
            goto L_0x0060
        L_0x007d:
            X.1Ww r10 = r3.A03(r1, r11)
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass137.A04(com.whatsapp.jid.UserJid):X.27R");
    }

    public AnonymousClass27J A05(UserJid userJid, byte[] bArr) {
        AnonymousClass162 r1;
        int i2;
        AnonymousClass1WL A0B2 = this.A07.A0B(C28851Ya.A02(userJid.getPrimaryDevice()));
        if (A0B2 == null) {
            StringBuilder sb = new StringBuilder("DeviceADVInfoHandler/checkPrimaryIdentity/no primary identity. userJid=");
            sb.append(userJid);
            Log.w(sb.toString());
            this.A0C.A01(Collections.singletonList(userJid.getPrimaryDevice()));
            AnonymousClass162 r2 = this.A0B;
            AnonymousClass27V r12 = new AnonymousClass27V();
            r12.A00 = 2;
            r2.A00.A06(r12);
            return null;
        }
        try {
            AnonymousClass27K r4 = (AnonymousClass27K) C28541Wm.A0E(AnonymousClass27K.A03, bArr);
            byte[] A042 = r4.A02.A04();
            if (!C28851Ya.A05(A0B2.A00, C28641Wx.A04(AnonymousClass01S.A0D, A042), r4.A01.A04())) {
                Log.w("DeviceADVInfoManager/verifyADVSignedKeyIndexList/fail to verify account signature");
                this.A0C.A01(Collections.singletonList(userJid.getPrimaryDevice()));
                AnonymousClass162 r0 = this.A0B;
                r0.A00.A06(new AnonymousClass27W());
                return null;
            }
            try {
                return (AnonymousClass27J) C28541Wm.A0E(AnonymousClass27J.A06, A042);
            } catch (C29791bD e2) {
                StringBuilder sb2 = new StringBuilder("DeviceADVInfoManager/verifyADVSignedKeyIndexList/ADVKeyIndexList invalidProto:");
                sb2.append(e2.getMessage());
                Log.e(sb2.toString());
                r1 = this.A0B;
                i2 = 4;
                r1.A00(i2);
                return null;
            }
        } catch (C29791bD e3) {
            StringBuilder sb3 = new StringBuilder("DeviceADVInfoManager/verifyADVSignedKeyIndexList/ADVSignedKeyIndexList invalidProto:");
            sb3.append(e3.getMessage());
            Log.e(sb3.toString());
            r1 = this.A0B;
            i2 = 3;
            r1.A00(i2);
            return null;
        }
    }

    public Map A06(List list, Map map, Map map2, int i2) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map2.entrySet()) {
            DeviceJid deviceJid = (DeviceJid) entry.getKey();
            Number number = (Number) entry.getValue();
            if (deviceJid.device == 0 || list.contains(Integer.valueOf(number.intValue()))) {
                hashMap.put(deviceJid, number);
            } else {
                AnonymousClass162 r0 = this.A0B;
                r0.A00.A06(new AnonymousClass27S());
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            Object key = entry2.getKey();
            Number number2 = (Number) entry2.getValue();
            long longValue = number2.longValue();
            if (longValue <= ((long) i2)) {
                if (map2.containsKey(key) && ((Number) map2.get(key)).longValue() < longValue && list.contains(Integer.valueOf(number2.intValue()))) {
                    StringBuilder sb = new StringBuilder("DevicesUtil/filterDeviceWithKeyIndexList/larger index exists in current map, jid=");
                    sb.append(key);
                    sb.append("; index=");
                    sb.append(number2);
                    Log.i(sb.toString());
                }
            }
            hashMap.put(key, number2);
        }
        return hashMap;
    }

    /* JADX WARNING: type inference failed for: r24v0, types: [X.27R] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x018f */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Map A07(java.util.Set r37, boolean r38) {
        /*
            r36 = this;
            java.util.HashMap r23 = new java.util.HashMap
            r23.<init>()
            r35 = r37
            boolean r0 = r35.isEmpty()
            if (r0 != 0) goto L_0x0369
            r7 = r36
            X.0sK r0 = r7.A01
            r34 = r0
            if (r38 == 0) goto L_0x005b
            X.1ZX r22 = r34.A04()
        L_0x0019:
            java.util.HashSet r6 = new java.util.HashSet
            r0 = r35
            r6.<init>(r0)
            r0 = r22
            r6.add(r0)
            X.0z2 r11 = r7.A0D
            int r0 = r6.size()
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>(r0)
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            java.util.Iterator r2 = r6.iterator()
        L_0x0039:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0066
            java.lang.Object r1 = r2.next()
            X.0rv r1 = (X.C15830rv) r1
            X.0sK r0 = r11.A01
            boolean r0 = r0.A0I(r1)
            if (r0 == 0) goto L_0x0055
            X.1p6 r0 = r11.A07()
            r8.put(r1, r0)
            goto L_0x0039
        L_0x0055:
            if (r1 == 0) goto L_0x0039
            r12.add(r1)
            goto L_0x0039
        L_0x005b:
            r34.A0B()
            X.1ZT r0 = r0.A05
            r22 = r0
            X.AnonymousClass00B.A06(r22)
            goto L_0x0019
        L_0x0066:
            X.0xd r10 = r11.A05
            java.util.Iterator r2 = r12.iterator()
        L_0x006c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0086
            java.lang.Object r1 = r2.next()
            X.0rv r1 = (X.C15830rv) r1
            X.0sK r0 = r10.A01
            boolean r0 = r0.A0I(r1)
            r1 = r0 ^ 1
            java.lang.String r0 = "only query info for others"
            X.AnonymousClass00B.A0D(r0, r1)
            goto L_0x006c
        L_0x0086:
            X.19O r5 = r10.A03
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r12)
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.lang.Object r3 = r5.A02
            monitor-enter(r3)
            java.util.Iterator r13 = r12.iterator()     // Catch:{ all -> 0x0366 }
        L_0x0099:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x0366 }
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r9 = r13.next()     // Catch:{ all -> 0x0366 }
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9     // Catch:{ all -> 0x0366 }
            java.util.Map r2 = r5.A03     // Catch:{ all -> 0x0366 }
            boolean r0 = r2.containsKey(r9)     // Catch:{ all -> 0x0366 }
            if (r0 == 0) goto L_0x0099
            java.lang.Object r0 = r2.get(r9)     // Catch:{ all -> 0x0366 }
            X.1p6 r0 = (X.C37401p6) r0     // Catch:{ all -> 0x0366 }
            r4.put(r9, r0)     // Catch:{ all -> 0x0366 }
            r1.remove(r9)     // Catch:{ all -> 0x0366 }
            goto L_0x0099
        L_0x00ba:
            monitor-exit(r3)     // Catch:{ all -> 0x0366 }
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x01a3
            int r0 = r1.size()
            java.lang.String[] r2 = new java.lang.String[r0]
            r15 = 0
            java.util.Iterator r14 = r1.iterator()
        L_0x00d1:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x00ed
            java.lang.Object r1 = r14.next()
            com.whatsapp.jid.Jid r1 = (com.whatsapp.jid.Jid) r1
            int r13 = r15 + 1
            X.14v r0 = r5.A00
            long r0 = r0.A01(r1)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2[r15] = r0
            r15 = r13
            goto L_0x00d1
        L_0x00ed:
            X.0tq r0 = r5.A01
            X.0tf r21 = r0.get()
            r1 = 975(0x3cf, float:1.366E-42)
            X.1jh r20 = new X.1jh     // Catch:{ all -> 0x019e }
            r0 = r20
            r0.<init>(r2, r1)     // Catch:{ all -> 0x019e }
        L_0x00fc:
            boolean r0 = r20.hasNext()     // Catch:{ all -> 0x019e }
            if (r0 == 0) goto L_0x0190
            java.lang.Object r2 = r20.next()     // Catch:{ all -> 0x019e }
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ all -> 0x019e }
            r0 = r21
            X.0tg r13 = r0.A02     // Catch:{ all -> 0x019e }
            int r14 = r2.length     // Catch:{ all -> 0x019e }
            java.lang.String r0 = "SELECT raw_id, timestamp, expected_timestamp, expected_ts_last_device_job_ts, expected_timestamp_update_ts, user_jid_row_id FROM user_device_info WHERE user_jid_row_id IN "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x019e }
            r1.<init>(r0)     // Catch:{ all -> 0x019e }
            java.lang.String r0 = X.C34111ji.A00(r14)     // Catch:{ all -> 0x019e }
            r1.append(r0)     // Catch:{ all -> 0x019e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x019e }
            android.database.Cursor r2 = r13.A08(r0, r2)     // Catch:{ all -> 0x019e }
            java.lang.String r0 = "raw_id"
            int r19 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0189 }
            java.lang.String r0 = "timestamp"
            int r18 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0189 }
            java.lang.String r0 = "expected_timestamp"
            int r17 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0189 }
            java.lang.String r0 = "expected_ts_last_device_job_ts"
            int r16 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0189 }
            java.lang.String r0 = "expected_timestamp_update_ts"
            int r13 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0189 }
        L_0x0142:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0189 }
            if (r0 == 0) goto L_0x0184
            X.14v r15 = r5.A00     // Catch:{ all -> 0x0189 }
            java.lang.Class<com.whatsapp.jid.UserJid> r14 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "user_jid_row_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0189 }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x0189 }
            com.whatsapp.jid.Jid r0 = r15.A07(r14, r0)     // Catch:{ all -> 0x0189 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x0189 }
            r1 = r19
            int r25 = r2.getInt(r1)     // Catch:{ all -> 0x0189 }
            r1 = r18
            long r26 = r2.getLong(r1)     // Catch:{ all -> 0x0189 }
            r1 = r17
            long r28 = r2.getLong(r1)     // Catch:{ all -> 0x0189 }
            r1 = r16
            long r30 = r2.getLong(r1)     // Catch:{ all -> 0x0189 }
            long r32 = r2.getLong(r13)     // Catch:{ all -> 0x0189 }
            X.1p6 r1 = new X.1p6     // Catch:{ all -> 0x0189 }
            r24 = r1
            r24.<init>(r25, r26, r28, r30, r32)     // Catch:{ all -> 0x0189 }
            r9.put(r0, r1)     // Catch:{ all -> 0x0189 }
            goto L_0x0142
        L_0x0184:
            r2.close()     // Catch:{ all -> 0x019e }
            goto L_0x00fc
        L_0x0189:
            r0 = move-exception
            if (r2 == 0) goto L_0x018f
            r2.close()     // Catch:{ all -> 0x018f }
        L_0x018f:
            throw r0     // Catch:{ all -> 0x019e }
        L_0x0190:
            r21.close()
            monitor-enter(r3)
            java.util.Map r0 = r5.A03     // Catch:{ all -> 0x019b }
            r0.putAll(r9)     // Catch:{ all -> 0x019b }
            monitor-exit(r3)     // Catch:{ all -> 0x019b }
            goto L_0x01a3
        L_0x019b:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x019b }
            throw r0
        L_0x019e:
            r0 = move-exception
            r21.close()     // Catch:{ all -> 0x01a2 }
        L_0x01a2:
            throw r0
        L_0x01a3:
            r4.putAll(r9)
            java.util.Iterator r2 = r12.iterator()
        L_0x01aa:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01bf
            java.lang.Object r1 = r2.next()
            boolean r0 = r4.containsKey(r1)
            if (r0 != 0) goto L_0x01aa
            r0 = 0
            r4.put(r1, r0)
            goto L_0x01aa
        L_0x01bf:
            r8.putAll(r4)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            X.0sK r0 = r11.A01
            r0.A0B()
            X.1ZT r3 = r0.A05
            boolean r0 = r6.contains(r3)
            if (r0 == 0) goto L_0x01e4
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r6)
            r1.remove(r3)
            X.0vs r0 = r11.A05()
            r2.put(r3, r0)
            r6 = r1
        L_0x01e4:
            X.19P r0 = r10.A05
            java.util.Map r0 = r0.A00(r6)
            r2.putAll(r0)
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r6 = r0.iterator()
        L_0x01f5:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0234
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r5 = r0.getKey()
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            java.lang.Object r1 = r0.getValue()
            X.0vs r1 = (X.C17930vs) r1
            com.whatsapp.jid.DeviceJid r0 = r5.getPrimaryDevice()
            boolean r0 = r1.containsKey(r0)
            if (r0 != 0) goto L_0x01f5
            X.1C5 r4 = new X.1C5
            r4.<init>()
            r4.putAll((java.util.Map) r1)
            com.whatsapp.jid.DeviceJid r3 = r5.getPrimaryDevice()
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4.put(r3, r0)
            X.0vs r0 = r4.build()
            r2.put(r5, r0)
            goto L_0x01f5
        L_0x0234:
            int r0 = r2.size()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>(r0)
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r9 = r0.iterator()
        L_0x024a:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x029f
            java.lang.Object r1 = r9.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r1.getValue()
            X.0vs r0 = (X.C17930vs) r0
            int r5 = r0.size()
            java.lang.Object r0 = r1.getValue()
            X.0vs r0 = (X.C17930vs) r0
            X.0uz r0 = r0.keySet()
            X.1Ub r6 = r0.iterator()
        L_0x026e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x024a
            java.lang.Object r1 = r6.next()
            com.whatsapp.jid.DeviceJid r1 = (com.whatsapp.jid.DeviceJid) r1
            r0 = r34
            boolean r0 = r0.A0K(r1)
            if (r0 == 0) goto L_0x0294
            X.1Yb r1 = X.C28851Ya.A02(r1)
            X.11s r0 = r7.A07
            X.1mo r0 = r0.A00
            X.1nX r0 = r0.A04()
            X.1WL r0 = r0.A01
            r3.put(r1, r0)
            goto L_0x026e
        L_0x0294:
            r0 = 1
            if (r5 <= r0) goto L_0x026e
            X.1Yb r0 = X.C28851Ya.A02(r1)
            r4.add(r0)
            goto L_0x026e
        L_0x029f:
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x02ae
            X.11s r0 = r7.A07
            java.util.Map r0 = r0.A0M(r4)
            r3.putAll(r0)
        L_0x02ae:
            r0 = r22
            java.lang.Object r4 = r2.get(r0)
            X.AnonymousClass00B.A06(r4)
            X.0vs r4 = (X.C17930vs) r4
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            X.1Ww r25 = r7.A02(r4, r0, r3, r1)
            java.lang.Object r0 = r8.get(r0)
            X.1p6 r0 = (X.C37401p6) r0
            r28 = 0
            if (r0 != 0) goto L_0x0362
            r0 = 0
        L_0x02ce:
            if (r25 != 0) goto L_0x02e3
            X.0t3 r4 = r7.A06
            long r9 = r4.A00()
            r4 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r0
            long r9 = r9 - r4
            r5 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 >= 0) goto L_0x02e5
        L_0x02e3:
            r28 = r0
        L_0x02e5:
            java.util.Iterator r16 = r35.iterator()
        L_0x02e9:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0369
            java.lang.Object r4 = r16.next()
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r0 = r34
            boolean r1 = r0.A0I(r4)
            r5 = 0
            if (r1 == 0) goto L_0x0354
            r26 = r5
        L_0x0305:
            r14 = 0
            if (r1 == 0) goto L_0x032d
            r30 = 0
        L_0x030b:
            if (r25 != 0) goto L_0x0317
            int r0 = (r28 > r14 ? 1 : (r28 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x0317
            if (r26 != 0) goto L_0x0317
            int r0 = (r30 > r14 ? 1 : (r30 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0327
        L_0x0317:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x031e
            r5 = r6
        L_0x031e:
            X.27R r24 = new X.27R
            r27 = r5
            r24.<init>(r25, r26, r27, r28, r30)
            r5 = r24
        L_0x0327:
            r0 = r23
            r0.put(r4, r5)
            goto L_0x02e9
        L_0x032d:
            java.lang.Object r0 = r8.get(r4)
            X.1p6 r0 = (X.C37401p6) r0
            r30 = 0
            if (r0 != 0) goto L_0x0351
            r0 = 0
        L_0x0339:
            if (r26 != 0) goto L_0x034e
            X.0t3 r9 = r7.A06
            long r12 = r9.A00()
            r9 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 * r0
            long r12 = r12 - r9
            r10 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            int r9 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r9 >= 0) goto L_0x030b
        L_0x034e:
            r30 = r0
            goto L_0x030b
        L_0x0351:
            long r0 = r0.A04
            goto L_0x0339
        L_0x0354:
            java.lang.Object r0 = r2.get(r4)
            X.AnonymousClass00B.A06(r0)
            X.0vs r0 = (X.C17930vs) r0
            X.1Ww r26 = r7.A02(r0, r4, r3, r6)
            goto L_0x0305
        L_0x0362:
            long r0 = r0.A04
            goto L_0x02ce
        L_0x0366:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0366 }
            throw r0
        L_0x0369:
            return r23
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass137.A07(java.util.Set, boolean):java.util.Map");
    }

    public void A08(DeviceJid deviceJid, boolean z2) {
        NullPointerException th;
        boolean z3 = false;
        if (deviceJid.device == 0) {
            z3 = true;
        }
        AnonymousClass00B.A0G(!z3);
        Lock A042 = this.A08.A04(deviceJid);
        if (A042 == null) {
            try {
                this.A07.A0H.A00();
            } catch (Throwable th2) {
                th = th2;
                if (A042 != null) {
                    A042.unlock();
                    throw th;
                }
            }
        } else {
            A042.lock();
        }
        if (z2) {
            if (this.A01.A0J(deviceJid)) {
                this.A0A.A0A(deviceJid, "unknown_companion", false, false);
            } else {
                this.A0D.A0E(C17380uz.of(deviceJid), deviceJid.getUserJid(), false, false);
            }
        }
        if (A042 != null) {
            A042.unlock();
        }
        this.A09.A03(Collections.singleton(deviceJid));
        Iterator it = this.A00.keySet().iterator();
        if (it.hasNext()) {
            it.next();
            th = new NullPointerException("onCompanionDeviceVerificationFail");
            throw th;
        }
    }

    public void A09(UserJid userJid, long j2) {
        if (j2 - (this.A06.A00() / 1000) > 5184000) {
            StringBuilder sb = new StringBuilder("DeviceADVInfoHandler/removeDeviceInfoIfTimestampIsInvalid invalid local timestamp ts=");
            sb.append(j2);
            Log.e(sb.toString());
            this.A0D.A0H(userJid, true, false);
        }
    }

    public final void A0A(UserJid userJid, long j2) {
        C19810z2 r1 = this.A0D;
        C37401p6 A092 = r1.A09(userJid);
        if (A092 != null) {
            r1.A0F(r1.A08(A092, j2), userJid);
            return;
        }
        StringBuilder sb = new StringBuilder("DeviceADVInfoManager/updateDeviceInfoWithExpectedTs user has no device info, user=");
        sb.append(userJid);
        Log.w(sb.toString());
    }

    public boolean A0B(DeviceJid deviceJid, C30821d1 r11, byte[] bArr, int i2) {
        byte[] bArr2;
        DeviceJid deviceJid2 = deviceJid;
        if (deviceJid == null || deviceJid.device == 0 || r11 == null || r11.A00 != 1) {
            return true;
        }
        byte[] bArr3 = r11.A02;
        try {
            bArr2 = C28851Ya.A01(C36241nE.A00(((AnonymousClass27Y) C28541Wm.A0A(C28631Ww.A01(bArr3, 1, bArr3.length - 1), AnonymousClass27Y.A07)).A05.A04()).A00()).A01;
        } catch (C29791bD | C31751ey | C36291nJ e2) {
            Log.e("DeviceVerificationUtil/extractIdentityFromCipherText/fail to get key", e2);
            bArr2 = null;
        }
        return A0C(deviceJid2, bArr, bArr2, (byte) 5, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x018d, code lost:
        if (new X.AnonymousClass1WL(r7).equals(r14) == false) goto L_0x018f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x019d, code lost:
        if (r1.A0J(r6) == false) goto L_0x019f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01d5, code lost:
        if (((java.lang.Long) r13.get(r6)).longValue() != ((long) r2.A01)) goto L_0x01d7;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:131:0x037d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:136:0x0382 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:141:0x0387 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:146:0x038c */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0465 A[Catch:{ all -> 0x038c, all -> 0x0533 }] */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x04ad  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:183:0x04b1=Splitter:B:183:0x04b1, B:146:0x038c=Splitter:B:146:0x038c} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0C(com.whatsapp.jid.DeviceJid r32, byte[] r33, byte[] r34, byte r35, int r36) {
        /*
            r31 = this;
            r5 = r31
            X.0xT r0 = r5.A08
            r6 = r32
            java.util.concurrent.locks.Lock r20 = r0.A04(r6)
            if (r20 != 0) goto L_0x0014
            X.11s r0 = r5.A07     // Catch:{ all -> 0x0533 }
            X.16P r0 = r0.A0H     // Catch:{ all -> 0x0533 }
            r0.A00()     // Catch:{ all -> 0x0533 }
            goto L_0x0017
        L_0x0014:
            r20.lock()     // Catch:{ all -> 0x0533 }
        L_0x0017:
            r4 = 1
            byte r0 = r6.device     // Catch:{ all -> 0x0533 }
            if (r0 == 0) goto L_0x052d
            r3 = 0
            r2 = r33
            r8 = r36
            if (r33 != 0) goto L_0x002a
            X.162 r0 = r5.A0B     // Catch:{ all -> 0x0533 }
            r0.A01(r8, r3)     // Catch:{ all -> 0x0533 }
            goto L_0x0527
        L_0x002a:
            r7 = r34
            if (r34 != 0) goto L_0x0035
            X.162 r0 = r5.A0B     // Catch:{ all -> 0x0533 }
            r0.A01(r8, r4)     // Catch:{ all -> 0x0533 }
            goto L_0x0527
        L_0x0035:
            X.0yO r12 = r5.A0A     // Catch:{ all -> 0x0533 }
            boolean r0 = r12.A0E(r6)     // Catch:{ all -> 0x0533 }
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/message from device in progress of login"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0533 }
            goto L_0x0527
        L_0x0044:
            X.0z2 r9 = r5.A0D     // Catch:{ all -> 0x0533 }
            com.whatsapp.jid.UserJid r0 = r6.getUserJid()     // Catch:{ all -> 0x0533 }
            java.util.Set r0 = r9.A0D(r0)     // Catch:{ all -> 0x0533 }
            boolean r0 = r0.contains(r6)     // Catch:{ all -> 0x0533 }
            r15 = r35
            if (r0 == 0) goto L_0x0073
            X.11s r1 = r5.A07     // Catch:{ all -> 0x0533 }
            X.1Yb r0 = X.C28851Ya.A02(r6)     // Catch:{ all -> 0x0533 }
            X.1WL r10 = r1.A0B(r0)     // Catch:{ all -> 0x0533 }
            X.1cD r1 = A00(r7, r15)     // Catch:{ all -> 0x0533 }
            if (r1 == 0) goto L_0x0073
            X.1WL r0 = new X.1WL     // Catch:{ all -> 0x0533 }
            r0.<init>(r1)     // Catch:{ all -> 0x0533 }
            boolean r0 = r0.equals(r10)     // Catch:{ all -> 0x0533 }
            if (r0 == 0) goto L_0x0073
            goto L_0x052d
        L_0x0073:
            X.0sK r1 = r5.A01     // Catch:{ all -> 0x0533 }
            boolean r0 = r1.A0J(r6)     // Catch:{ all -> 0x0533 }
            if (r0 == 0) goto L_0x009d
            boolean r0 = r1.A0G()     // Catch:{ all -> 0x0533 }
            if (r0 != 0) goto L_0x009d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0533 }
            r1.<init>()     // Catch:{ all -> 0x0533 }
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/unexpected self device, jid="
            r1.append(r0)     // Catch:{ all -> 0x0533 }
            r1.append(r6)     // Catch:{ all -> 0x0533 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0533 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0533 }
            java.lang.String r0 = "unknown_companion"
            r12.A0A(r6, r0, r3, r3)     // Catch:{ all -> 0x0533 }
            goto L_0x0527
        L_0x009d:
            X.27T r0 = X.AnonymousClass27T.A05     // Catch:{ 1bD -> 0x0509 }
            X.1Wm r10 = X.C28541Wm.A0E(r0, r2)     // Catch:{ 1bD -> 0x0509 }
            X.27T r10 = (X.AnonymousClass27T) r10     // Catch:{ 1bD -> 0x0509 }
            X.1Ww r2 = r10.A03     // Catch:{ 1bD -> 0x04e9 }
            X.27I r0 = X.AnonymousClass27I.A04     // Catch:{ 1bD -> 0x04e9 }
            X.1Wm r2 = X.C28541Wm.A0A(r2, r0)     // Catch:{ 1bD -> 0x04e9 }
            X.27I r2 = (X.AnonymousClass27I) r2     // Catch:{ 1bD -> 0x04e9 }
            X.1Ww r0 = r10.A01     // Catch:{ all -> 0x0533 }
            byte[] r11 = r0.A04()     // Catch:{ all -> 0x0533 }
            int r0 = r11.length     // Catch:{ all -> 0x0533 }
            if (r0 == 0) goto L_0x00bd
            X.1cD r13 = A00(r11, r15)     // Catch:{ all -> 0x0533 }
            goto L_0x00d3
        L_0x00bd:
            X.11s r11 = r5.A07     // Catch:{ all -> 0x0533 }
            com.whatsapp.jid.UserJid r0 = r6.getUserJid()     // Catch:{ all -> 0x0533 }
            com.whatsapp.jid.DeviceJid r0 = r0.getPrimaryDevice()     // Catch:{ all -> 0x0533 }
            X.1Yb r0 = X.C28851Ya.A02(r0)     // Catch:{ all -> 0x0533 }
            X.1WL r0 = r11.A0B(r0)     // Catch:{ all -> 0x0533 }
            if (r0 == 0) goto L_0x04b1
            X.1cD r13 = r0.A00     // Catch:{ all -> 0x0533 }
        L_0x00d3:
            if (r13 == 0) goto L_0x04b1
            byte[] r19 = r2.A02()     // Catch:{ all -> 0x0533 }
            X.1Ww r0 = r10.A02     // Catch:{ all -> 0x0533 }
            byte[] r18 = r0.A04()     // Catch:{ all -> 0x0533 }
            X.1Ww r0 = r10.A04     // Catch:{ all -> 0x0533 }
            byte[] r11 = r0.A04()     // Catch:{ all -> 0x0533 }
            X.1cD r10 = A00(r7, r15)     // Catch:{ all -> 0x0533 }
            if (r10 != 0) goto L_0x010b
            java.lang.String r0 = "DeviceADVInfoManager/verifySignature/invalid companion public key"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0533 }
            X.162 r0 = r5.A0B     // Catch:{ all -> 0x0533 }
            r0.A01(r8, r4)     // Catch:{ all -> 0x0533 }
        L_0x00f5:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0533 }
            r1.<init>()     // Catch:{ all -> 0x0533 }
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/signature verification fail, deviceJid="
            r1.append(r0)     // Catch:{ all -> 0x0533 }
            r1.append(r6)     // Catch:{ all -> 0x0533 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0533 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0533 }
            goto L_0x0527
        L_0x010b:
            r8 = 3
            byte[][] r0 = new byte[r8][]     // Catch:{ all -> 0x0533 }
            byte[] r14 = X.AnonymousClass01S.A0B     // Catch:{ all -> 0x0533 }
            r0[r3] = r14     // Catch:{ all -> 0x0533 }
            r0[r4] = r19     // Catch:{ all -> 0x0533 }
            r17 = 2
            r0[r17] = r34     // Catch:{ all -> 0x0533 }
            byte[] r14 = X.C28641Wx.A04(r0)     // Catch:{ all -> 0x0533 }
            r0 = 4
            byte[][] r0 = new byte[r0][]     // Catch:{ all -> 0x0533 }
            byte[] r16 = X.AnonymousClass01S.A0C     // Catch:{ all -> 0x0533 }
            r0[r3] = r16     // Catch:{ all -> 0x0533 }
            r0[r4] = r19     // Catch:{ all -> 0x0533 }
            r0[r17] = r34     // Catch:{ all -> 0x0533 }
            byte[] r7 = r13.A01     // Catch:{ all -> 0x0533 }
            r0[r8] = r7     // Catch:{ all -> 0x0533 }
            byte[] r8 = X.C28641Wx.A04(r0)     // Catch:{ all -> 0x0533 }
            r0 = r18
            boolean r0 = X.C28851Ya.A05(r13, r14, r0)     // Catch:{ all -> 0x0533 }
            if (r0 != 0) goto L_0x014f
            java.lang.String r0 = "DeviceADVInfoManager/verifySignature/fail to verify account signature"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0533 }
            X.162 r2 = r5.A0B     // Catch:{ all -> 0x0533 }
            X.27U r1 = new X.27U     // Catch:{ all -> 0x0533 }
            r1.<init>()     // Catch:{ all -> 0x0533 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0533 }
        L_0x0147:
            r1.A00 = r0     // Catch:{ all -> 0x0533 }
            X.0t9 r0 = r2.A00     // Catch:{ all -> 0x0533 }
            r0.A06(r1)     // Catch:{ all -> 0x0533 }
            goto L_0x00f5
        L_0x014f:
            boolean r0 = X.C28851Ya.A05(r10, r8, r11)     // Catch:{ all -> 0x0533 }
            if (r0 != 0) goto L_0x0166
            java.lang.String r0 = "DeviceADVInfoManager/verifySignature/fail to verify device signature"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0533 }
            X.162 r2 = r5.A0B     // Catch:{ all -> 0x0533 }
            X.27U r1 = new X.27U     // Catch:{ all -> 0x0533 }
            r1.<init>()     // Catch:{ all -> 0x0533 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r17)     // Catch:{ all -> 0x0533 }
            goto L_0x0147
        L_0x0166:
            com.whatsapp.jid.UserJid r11 = r6.getUserJid()     // Catch:{ all -> 0x0533 }
            X.1p6 r10 = r9.A09(r11)     // Catch:{ all -> 0x0533 }
            com.whatsapp.jid.DeviceJid r0 = r11.getPrimaryDevice()     // Catch:{ all -> 0x0533 }
            X.11s r8 = r5.A07     // Catch:{ all -> 0x0533 }
            X.1Yb r0 = X.C28851Ya.A02(r0)     // Catch:{ all -> 0x0533 }
            X.1WL r14 = r8.A0B(r0)     // Catch:{ all -> 0x0533 }
            X.1cD r7 = A00(r7, r15)     // Catch:{ all -> 0x0533 }
            if (r7 == 0) goto L_0x018f
            X.1WL r0 = new X.1WL     // Catch:{ all -> 0x0533 }
            r0.<init>(r7)     // Catch:{ all -> 0x0533 }
            boolean r0 = r0.equals(r14)     // Catch:{ all -> 0x0533 }
            r18 = 1
            if (r0 != 0) goto L_0x0191
        L_0x018f:
            r18 = 0
        L_0x0191:
            boolean r0 = r1.A0G()     // Catch:{ all -> 0x0533 }
            if (r0 == 0) goto L_0x019f
            boolean r0 = r1.A0J(r6)     // Catch:{ all -> 0x0533 }
            r17 = 1
            if (r0 != 0) goto L_0x01a1
        L_0x019f:
            r17 = 0
        L_0x01a1:
            java.lang.String r14 = "; keyIndex"
            if (r18 == 0) goto L_0x03aa
            if (r10 == 0) goto L_0x03aa
            int r1 = r10.A00     // Catch:{ all -> 0x0533 }
            int r0 = r2.A02     // Catch:{ all -> 0x0533 }
            if (r1 != r0) goto L_0x03aa
            if (r17 == 0) goto L_0x01b0
            goto L_0x01b5
        L_0x01b0:
            java.util.Map r13 = r9.A0A(r11)     // Catch:{ all -> 0x0533 }
            goto L_0x01be
        L_0x01b5:
            X.0vs r0 = r9.A05()     // Catch:{ all -> 0x0533 }
            java.util.HashMap r13 = new java.util.HashMap     // Catch:{ all -> 0x0533 }
            r13.<init>(r0)     // Catch:{ all -> 0x0533 }
        L_0x01be:
            boolean r0 = r13.containsKey(r6)     // Catch:{ all -> 0x0533 }
            if (r0 == 0) goto L_0x01d7
            java.lang.Object r0 = r13.get(r6)     // Catch:{ all -> 0x0533 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0533 }
            long r15 = r0.longValue()     // Catch:{ all -> 0x0533 }
            int r0 = r2.A01     // Catch:{ all -> 0x0533 }
            long r0 = (long) r0     // Catch:{ all -> 0x0533 }
            int r7 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            r16 = 1
            if (r7 == 0) goto L_0x01d9
        L_0x01d7:
            r16 = 0
        L_0x01d9:
            long r7 = r10.A04     // Catch:{ all -> 0x0533 }
            long r0 = r2.A03     // Catch:{ all -> 0x0533 }
            int r15 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r15 < 0) goto L_0x0210
            if (r16 != 0) goto L_0x0210
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/device has been deleted already, device="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0533 }
            r1.<init>(r0)     // Catch:{ all -> 0x0533 }
            r1.append(r6)     // Catch:{ all -> 0x0533 }
            r1.append(r14)     // Catch:{ all -> 0x0533 }
            int r0 = r2.A01     // Catch:{ all -> 0x0533 }
            r1.append(r0)     // Catch:{ all -> 0x0533 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0533 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0533 }
            com.whatsapp.jid.UserJid r0 = r6.getUserJid()     // Catch:{ all -> 0x0533 }
            r5.A09(r0, r7)     // Catch:{ all -> 0x0533 }
            X.162 r3 = r5.A0B     // Catch:{ all -> 0x0533 }
            long r0 = r2.A03     // Catch:{ all -> 0x0533 }
            r9 = 1
            r4 = r3
            r5 = r7
            r7 = r0
            r4.A02(r5, r7, r9)     // Catch:{ all -> 0x0533 }
            goto L_0x0412
        L_0x0210:
            int r14 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r14 <= 0) goto L_0x0225
            X.1p6 r0 = r9.A08(r10, r0)     // Catch:{ all -> 0x0533 }
            r9.A0F(r0, r11)     // Catch:{ all -> 0x0533 }
            X.16U r5 = r5.A05     // Catch:{ all -> 0x0533 }
            com.whatsapp.jid.UserJid[] r1 = new com.whatsapp.jid.UserJid[r4]     // Catch:{ all -> 0x0533 }
            r1[r3] = r11     // Catch:{ all -> 0x0533 }
            r0 = 3
            r5.A01(r1, r0)     // Catch:{ all -> 0x0533 }
        L_0x0225:
            if (r16 != 0) goto L_0x04aa
            if (r17 == 0) goto L_0x0244
            X.1C5 r4 = new X.1C5     // Catch:{ all -> 0x0533 }
            r4.<init>()     // Catch:{ all -> 0x0533 }
            r4.putAll((java.util.Map) r13)     // Catch:{ all -> 0x0533 }
            int r0 = r2.A01     // Catch:{ all -> 0x0533 }
            long r0 = (long) r0     // Catch:{ all -> 0x0533 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0533 }
            r4.put(r6, r0)     // Catch:{ all -> 0x0533 }
            X.0vs r0 = r4.build()     // Catch:{ all -> 0x0533 }
            r12.A0D(r0, r3, r3)     // Catch:{ all -> 0x0533 }
            goto L_0x04aa
        L_0x0244:
            com.whatsapp.jid.UserJid r3 = r6.getUserJid()     // Catch:{ all -> 0x0533 }
            int r0 = r2.A01     // Catch:{ all -> 0x0533 }
            long r0 = (long) r0     // Catch:{ all -> 0x0533 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0533 }
            X.0vs r0 = X.C17930vs.of(r6, r0)     // Catch:{ all -> 0x0533 }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ all -> 0x0533 }
            r6.<init>(r0)     // Catch:{ all -> 0x0533 }
            X.0xd r7 = r9.A05     // Catch:{ all -> 0x0533 }
            X.0vs r0 = r7.A02(r3)     // Catch:{ all -> 0x0533 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0533 }
            r2.<init>(r0)     // Catch:{ all -> 0x0533 }
            java.util.Set r0 = r2.keySet()     // Catch:{ all -> 0x0533 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0533 }
        L_0x026b:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0533 }
            if (r0 == 0) goto L_0x0279
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0533 }
            r6.remove(r0)     // Catch:{ all -> 0x0533 }
            goto L_0x026b
        L_0x0279:
            r9.A0G(r3, r6)     // Catch:{ all -> 0x0533 }
            com.whatsapp.jid.DeviceJid r0 = r3.getPrimaryDevice()     // Catch:{ all -> 0x0533 }
            boolean r0 = r2.containsKey(r0)     // Catch:{ all -> 0x0533 }
            if (r0 != 0) goto L_0x02a4
            java.lang.String r1 = "UserDeviceManager/addDevicesForUser/no primary device for this user, jid="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0533 }
            r0.<init>(r1)     // Catch:{ all -> 0x0533 }
            r0.append(r3)     // Catch:{ all -> 0x0533 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0533 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0533 }
            com.whatsapp.jid.DeviceJid r2 = r3.getPrimaryDevice()     // Catch:{ all -> 0x0533 }
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0533 }
            r6.put(r2, r0)     // Catch:{ all -> 0x0533 }
        L_0x02a4:
            boolean r0 = r6.isEmpty()     // Catch:{ all -> 0x0533 }
            if (r0 != 0) goto L_0x04aa
            X.0vs r19 = X.C17930vs.copyOf((java.util.Map) r6)     // Catch:{ all -> 0x0533 }
            X.0sK r0 = r7.A01     // Catch:{ all -> 0x0533 }
            boolean r0 = r0.A0I(r3)     // Catch:{ all -> 0x0533 }
            r1 = r0 ^ 1
            java.lang.String r0 = "only add new device for others"
            X.AnonymousClass00B.A0D(r0, r1)     // Catch:{ all -> 0x0533 }
            boolean r0 = r19.isEmpty()     // Catch:{ all -> 0x0533 }
            if (r0 != 0) goto L_0x039b
            X.0tq r0 = r7.A02     // Catch:{ all -> 0x0533 }
            X.0tf r18 = r0.A02()     // Catch:{ all -> 0x0533 }
            X.1cj r17 = r18.A00()     // Catch:{ all -> 0x0388 }
            X.0vs r0 = r7.A02(r3)     // Catch:{ all -> 0x0383 }
            X.0uz r2 = r0.keySet()     // Catch:{ all -> 0x0383 }
            X.19P r11 = r7.A05     // Catch:{ all -> 0x0383 }
            java.lang.String r10 = "; keyIndex="
            X.0tq r0 = r11.A01     // Catch:{ all -> 0x0383 }
            X.0tf r8 = r0.A02()     // Catch:{ all -> 0x0383 }
            X.1cj r16 = r8.A00()     // Catch:{ all -> 0x037e }
            X.0uz r0 = r19.entrySet()     // Catch:{ all -> 0x0379 }
            X.1Ub r15 = r0.iterator()     // Catch:{ all -> 0x0379 }
        L_0x02e9:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0379 }
            if (r0 == 0) goto L_0x0355
            java.lang.Object r0 = r15.next()     // Catch:{ all -> 0x0379 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0379 }
            java.lang.Object r12 = r0.getKey()     // Catch:{ all -> 0x0379 }
            com.whatsapp.jid.DeviceJid r12 = (com.whatsapp.jid.DeviceJid) r12     // Catch:{ all -> 0x0379 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0379 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0379 }
            long r4 = r0.longValue()     // Catch:{ all -> 0x0379 }
            byte r0 = r12.device     // Catch:{ all -> 0x0379 }
            r1 = 0
            if (r0 != 0) goto L_0x030b
            r1 = 1
        L_0x030b:
            r13 = 0
            if (r1 == 0) goto L_0x0313
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 == 0) goto L_0x0351
        L_0x0313:
            r0 = r1 ^ 1
            if (r0 == 0) goto L_0x031c
            int r0 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x031c
            goto L_0x0351
        L_0x031c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0379 }
            r1.<init>()     // Catch:{ all -> 0x0379 }
            java.lang.String r0 = "invalid devices jid="
            r1.append(r0)     // Catch:{ all -> 0x0379 }
            r1.append(r12)     // Catch:{ all -> 0x0379 }
            r1.append(r10)     // Catch:{ all -> 0x0379 }
            r1.append(r4)     // Catch:{ all -> 0x0379 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0379 }
            X.AnonymousClass00B.A08(r0)     // Catch:{ all -> 0x0379 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0379 }
            r1.<init>()     // Catch:{ all -> 0x0379 }
            java.lang.String r0 = "DeviceStore/addDevicesForUser/invalid devices jid="
            r1.append(r0)     // Catch:{ all -> 0x0379 }
            r1.append(r12)     // Catch:{ all -> 0x0379 }
            r1.append(r10)     // Catch:{ all -> 0x0379 }
            r1.append(r4)     // Catch:{ all -> 0x0379 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0379 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0379 }
            goto L_0x02e9
        L_0x0351:
            r11.A03(r12, r3, r4)     // Catch:{ all -> 0x0379 }
            goto L_0x02e9
        L_0x0355:
            r16.A00()     // Catch:{ all -> 0x0379 }
            r11.A02(r8, r3)     // Catch:{ all -> 0x0379 }
            r16.close()     // Catch:{ all -> 0x037e }
            r8.close()     // Catch:{ all -> 0x0383 }
            X.0uz r12 = r19.keySet()     // Catch:{ all -> 0x0383 }
            X.0uz r13 = X.C17380uz.of()     // Catch:{ all -> 0x0383 }
            r15 = 0
            r16 = 0
            r10 = r7
            r11 = r2
            r14 = r3
            r10.A06(r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0383 }
            r17.A00()     // Catch:{ all -> 0x0383 }
            r17.close()     // Catch:{ all -> 0x0388 }
            goto L_0x038d
        L_0x0379:
            r0 = move-exception
            r16.close()     // Catch:{ all -> 0x037d }
        L_0x037d:
            throw r0     // Catch:{ all -> 0x037e }
        L_0x037e:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x0382 }
        L_0x0382:
            throw r0     // Catch:{ all -> 0x0383 }
        L_0x0383:
            r0 = move-exception
            r17.close()     // Catch:{ all -> 0x0387 }
        L_0x0387:
            throw r0     // Catch:{ all -> 0x0388 }
        L_0x0388:
            r0 = move-exception
            r18.close()     // Catch:{ all -> 0x038c }
        L_0x038c:
            throw r0     // Catch:{ all -> 0x0533 }
        L_0x038d:
            r18.close()     // Catch:{ all -> 0x0533 }
            X.0uz r1 = r19.keySet()     // Catch:{ all -> 0x0533 }
            X.0uz r0 = X.C17380uz.of()     // Catch:{ all -> 0x0533 }
            r7.A05(r2, r1, r0, r3)     // Catch:{ all -> 0x0533 }
        L_0x039b:
            X.19B r2 = r9.A04     // Catch:{ all -> 0x0533 }
            java.util.Set r1 = r6.keySet()     // Catch:{ all -> 0x0533 }
            java.util.Set r0 = java.util.Collections.emptySet()     // Catch:{ all -> 0x0533 }
            r2.A04(r3, r1, r0)     // Catch:{ all -> 0x0533 }
            goto L_0x04aa
        L_0x03aa:
            if (r17 == 0) goto L_0x03c5
            java.lang.String r1 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/raw_id or primary public key for own companion device doesn't match in companion mode, device="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0533 }
            r0.<init>(r1)     // Catch:{ all -> 0x0533 }
            r0.append(r6)     // Catch:{ all -> 0x0533 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0533 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0533 }
            X.0r5 r1 = r5.A04     // Catch:{ all -> 0x0533 }
            java.lang.String r0 = "invalid_adv_status"
            r1.A00(r0, r4, r4)     // Catch:{ all -> 0x0533 }
            goto L_0x0412
        L_0x03c5:
            if (r10 == 0) goto L_0x0415
            if (r18 != 0) goto L_0x03df
            com.whatsapp.jid.UserJid r0 = r6.getUserJid()     // Catch:{ all -> 0x0533 }
            com.whatsapp.jid.DeviceJid r0 = r0.getPrimaryDevice()     // Catch:{ all -> 0x0533 }
            X.1Yb r0 = X.C28851Ya.A02(r0)     // Catch:{ all -> 0x0533 }
            X.1WL r0 = r8.A0B(r0)     // Catch:{ all -> 0x0533 }
            if (r0 == 0) goto L_0x0415
            X.1cD r0 = r0.A00     // Catch:{ all -> 0x0533 }
            if (r0 == 0) goto L_0x0415
        L_0x03df:
            r15 = 1
            X.AnonymousClass00B.A06(r10)     // Catch:{ all -> 0x0533 }
            long r11 = r10.A04     // Catch:{ all -> 0x0533 }
            long r0 = r2.A03     // Catch:{ all -> 0x0533 }
            int r7 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x0416
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/advDeviceIdentity has a lower ts, jid="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0533 }
            r1.<init>(r0)     // Catch:{ all -> 0x0533 }
            r1.append(r6)     // Catch:{ all -> 0x0533 }
            r1.append(r14)     // Catch:{ all -> 0x0533 }
            int r0 = r2.A01     // Catch:{ all -> 0x0533 }
            r1.append(r0)     // Catch:{ all -> 0x0533 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0533 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0533 }
            X.162 r3 = r5.A0B     // Catch:{ all -> 0x0533 }
            X.AnonymousClass00B.A06(r10)     // Catch:{ all -> 0x0533 }
            long r0 = r2.A03     // Catch:{ all -> 0x0533 }
            r13 = r3
            r14 = r11
            r16 = r0
            r13.A02(r14, r16, r18)     // Catch:{ all -> 0x0533 }
        L_0x0412:
            r0 = 0
            goto L_0x04ab
        L_0x0415:
            r15 = 0
        L_0x0416:
            com.whatsapp.jid.UserJid r7 = r6.getUserJid()     // Catch:{ all -> 0x0533 }
            com.whatsapp.jid.DeviceJid r0 = r7.getPrimaryDevice()     // Catch:{ all -> 0x0533 }
            X.1Yb r1 = X.C28851Ya.A02(r0)     // Catch:{ all -> 0x0533 }
            X.1WL r0 = new X.1WL     // Catch:{ all -> 0x0533 }
            r0.<init>(r13)     // Catch:{ all -> 0x0533 }
            r8.A0R(r0, r1)     // Catch:{ all -> 0x0533 }
            r25 = 0
            if (r15 == 0) goto L_0x0438
            long r23 = r9.A04(r7)     // Catch:{ all -> 0x0533 }
            int r0 = (r23 > r25 ? 1 : (r23 == r25 ? 0 : -1))
            if (r0 <= 0) goto L_0x0438
            r12 = 0
            goto L_0x045e
        L_0x0438:
            X.0t3 r0 = r5.A06     // Catch:{ all -> 0x0533 }
            long r23 = r0.A00()     // Catch:{ all -> 0x0533 }
            X.0pd r8 = r5.A0E     // Catch:{ all -> 0x0533 }
            r1 = 730(0x2da, float:1.023E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x0533 }
            int r1 = r8.A03(r0, r1)     // Catch:{ all -> 0x0533 }
            if (r1 >= r4) goto L_0x044b
            r1 = 1
        L_0x044b:
            r0 = 35
            int r0 = java.lang.Math.min(r0, r1)     // Catch:{ all -> 0x0533 }
            int r0 = r0 - r4
            long r0 = (long) r0     // Catch:{ all -> 0x0533 }
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            long r0 = r0 * r10
            long r23 = r23 - r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r23 = r23 / r0
            r12 = 1
        L_0x045e:
            long r0 = r2.A03     // Catch:{ all -> 0x0533 }
            int r8 = (r0 > r23 ? 1 : (r0 == r23 ? 0 : -1))
            r11 = 1
            if (r8 > 0) goto L_0x0468
            r11 = 0
            r0 = 0
        L_0x0468:
            int r10 = r2.A02     // Catch:{ all -> 0x0533 }
            X.1p6 r8 = new X.1p6     // Catch:{ all -> 0x0533 }
            r27 = 0
            r29 = 0
            r21 = r8
            r22 = r10
            r21.<init>(r22, r23, r25, r27, r29)     // Catch:{ all -> 0x0533 }
            X.1p6 r8 = r9.A08(r8, r0)     // Catch:{ all -> 0x0533 }
            X.1C5 r10 = new X.1C5     // Catch:{ all -> 0x0533 }
            r10.<init>()     // Catch:{ all -> 0x0533 }
            com.whatsapp.jid.DeviceJid r1 = r7.getPrimaryDevice()     // Catch:{ all -> 0x0533 }
            java.lang.Long r0 = java.lang.Long.valueOf(r25)     // Catch:{ all -> 0x0533 }
            r10.put(r1, r0)     // Catch:{ all -> 0x0533 }
            int r0 = r2.A01     // Catch:{ all -> 0x0533 }
            long r0 = (long) r0     // Catch:{ all -> 0x0533 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0533 }
            r10.put(r6, r0)     // Catch:{ all -> 0x0533 }
            X.0vs r0 = r10.build()     // Catch:{ all -> 0x0533 }
            r9.A0I(r0, r8, r7, r3)     // Catch:{ all -> 0x0533 }
            if (r11 != 0) goto L_0x04a0
            if (r12 == 0) goto L_0x04aa
        L_0x04a0:
            X.16U r2 = r5.A05     // Catch:{ all -> 0x0533 }
            com.whatsapp.jid.UserJid[] r1 = new com.whatsapp.jid.UserJid[r4]     // Catch:{ all -> 0x0533 }
            r1[r3] = r7     // Catch:{ all -> 0x0533 }
            r0 = 3
            r2.A01(r1, r0)     // Catch:{ all -> 0x0533 }
        L_0x04aa:
            r0 = 1
        L_0x04ab:
            if (r20 == 0) goto L_0x04b0
            r20.unlock()
        L_0x04b0:
            return r0
        L_0x04b1:
            X.0vP r1 = r5.A0C     // Catch:{ all -> 0x0533 }
            com.whatsapp.jid.UserJid r0 = r6.getUserJid()     // Catch:{ all -> 0x0533 }
            com.whatsapp.jid.DeviceJid r0 = r0.getPrimaryDevice()     // Catch:{ all -> 0x0533 }
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ all -> 0x0533 }
            r1.A01(r0)     // Catch:{ all -> 0x0533 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0533 }
            r1.<init>()     // Catch:{ all -> 0x0533 }
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/no primary key, jid="
            r1.append(r0)     // Catch:{ all -> 0x0533 }
            r1.append(r6)     // Catch:{ all -> 0x0533 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0533 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0533 }
            X.162 r2 = r5.A0B     // Catch:{ all -> 0x0533 }
            X.27V r1 = new X.27V     // Catch:{ all -> 0x0533 }
            r1.<init>()     // Catch:{ all -> 0x0533 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0533 }
            r1.A00 = r0     // Catch:{ all -> 0x0533 }
            X.0t9 r0 = r2.A00     // Catch:{ all -> 0x0533 }
            r0.A06(r1)     // Catch:{ all -> 0x0533 }
            goto L_0x0527
        L_0x04e9:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0533 }
            r1.<init>()     // Catch:{ all -> 0x0533 }
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/advDeviceIdentity invalidProto:"
            r1.append(r0)     // Catch:{ all -> 0x0533 }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x0533 }
            r1.append(r0)     // Catch:{ all -> 0x0533 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0533 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0533 }
            X.162 r1 = r5.A0B     // Catch:{ all -> 0x0533 }
            r0 = 2
            r1.A00(r0)     // Catch:{ all -> 0x0533 }
            goto L_0x0527
        L_0x0509:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0533 }
            r1.<init>()     // Catch:{ all -> 0x0533 }
            java.lang.String r0 = "DeviceADVInfoManager/handleADVSignedDeviceIdentity/advSignedDeviceIdentity invalidProto:"
            r1.append(r0)     // Catch:{ all -> 0x0533 }
            java.lang.String r0 = r2.getMessage()     // Catch:{ all -> 0x0533 }
            r1.append(r0)     // Catch:{ all -> 0x0533 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0533 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0533 }
            X.162 r0 = r5.A0B     // Catch:{ all -> 0x0533 }
            r0.A00(r4)     // Catch:{ all -> 0x0533 }
        L_0x0527:
            if (r20 == 0) goto L_0x052c
            r20.unlock()
        L_0x052c:
            return r3
        L_0x052d:
            if (r20 == 0) goto L_0x0532
            r20.unlock()
        L_0x0532:
            return r4
        L_0x0533:
            r0 = move-exception
            if (r20 == 0) goto L_0x0539
            r20.unlock()
        L_0x0539:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass137.A0C(com.whatsapp.jid.DeviceJid, byte[], byte[], byte, int):boolean");
    }

    public boolean A0D(UserJid userJid, AnonymousClass27J r14, long j2) {
        long j3 = j2;
        if (r14 == null) {
            StringBuilder sb = new StringBuilder("DeviceADVInfoManager/verifyKeyIndexListData/validate indexList fail, userJid=");
            sb.append(userJid);
            Log.w(sb.toString());
            return false;
        }
        long j4 = r14.A04;
        if (j2 != j4) {
            AnonymousClass162 r7 = this.A0B;
            AnonymousClass27X r6 = new AnonymousClass27X();
            r6.A01 = Long.valueOf(j2 / 3600);
            r6.A00 = Long.valueOf(j4 / 3600);
            r7.A00.A06(r6);
            return false;
        }
        C19810z2 r4 = this.A0D;
        C37401p6 A092 = r4.A09(userJid);
        long A002 = this.A06.A00();
        int A032 = this.A0E.A03(C16620tM.A02, 730);
        if (A032 < 1) {
            A032 = 1;
        }
        if (j2 >= (A002 - (((long) Math.min(35, A032)) * 86400000)) / 1000 || r14.A05.size() <= 1) {
            if (A092 == null || A092.A00 != r14.A02) {
                r4.A0H(userJid, true, false);
            }
            return true;
        }
        this.A0B.A03(A092 != null ? A092.A04 : 0, j3, true);
        return false;
    }
}
