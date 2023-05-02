package X;

import com.whatsapp.jid.UserJid;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.167  reason: invalid class name */
public class AnonymousClass167 {
    public final C17150uc A00;
    public final C219015w A01;
    public final AnonymousClass163 A02;
    public final AnonymousClass166 A03;
    public final AnonymousClass165 A04;
    public final AnonymousClass161 A05;
    public final C219315z A06;
    public final C218915v A07;
    public final AnonymousClass164 A08;
    public final C218815u A09;

    public AnonymousClass167(C17150uc r1, C219015w r2, AnonymousClass163 r3, AnonymousClass166 r4, AnonymousClass165 r5, AnonymousClass161 r6, C219315z r7, C218915v r8, AnonymousClass164 r9, C218815u r10) {
        this.A04 = r5;
        this.A00 = r1;
        this.A08 = r9;
        this.A02 = r3;
        this.A05 = r6;
        this.A06 = r7;
        this.A01 = r2;
        this.A07 = r8;
        this.A09 = r10;
        this.A03 = r4;
    }

    public static void A00(C42481xs r6, C451027b r7, List list, long j2) {
        C451127c r0 = r6.A01;
        C451227d.A00(r0, r7);
        r6.A07.A02(r0.A00, r7, list, r6.A0N, r6.A0O, j2);
    }

    public void A01(C450927a r9, C451327e r10, C16010sH r11, long j2) {
        UserJid userJid = r9.A0C;
        AnonymousClass00B.A06(userJid);
        if (userJid.equals(r11.A0E)) {
            Map singletonMap = Collections.singletonMap(r9.A0C, r9);
            A02(r10, (C451027b) null, Collections.singletonList(new C38531qw(r11).A02()), singletonMap, (Map) null, j2);
            return;
        }
        StringBuilder sb = new StringBuilder("jid doesn't match, jid1=");
        sb.append(r9.A0C);
        sb.append(", jid2=");
        sb.append(r11.A0E);
        throw new IllegalArgumentException(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0074, code lost:
        if (r6.A0i != false) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0635, code lost:
        if (r10.get(r7) == null) goto L_0x0637;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x010b, code lost:
        if (r4.A04 == 2) goto L_0x010d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0151, code lost:
        if (r6.A0i == false) goto L_0x0076;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:132:0x0295 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:80:0x0199 */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x0386  */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x04a3  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C451327e r39, X.C451027b r40, java.util.List r41, java.util.Map r42, java.util.Map r43, long r44) {
        /*
            r38 = this;
            r41.size()
            java.util.HashMap r25 = new java.util.HashMap
            r25.<init>()
            r8 = 0
            r19 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            java.util.Iterator r26 = r41.iterator()
        L_0x0015:
            boolean r0 = r26.hasNext()
            r7 = r38
            r37 = r39
            r9 = r42
            if (r0 == 0) goto L_0x05c6
            java.lang.Object r3 = r26.next()
            X.27f r3 = (X.C451427f) r3
            X.0sH r6 = r3.A05
            X.AnonymousClass00B.A06(r6)
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r5 = r6.A08(r2)
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            if (r5 != 0) goto L_0x0050
            java.lang.String r0 = "syncresultupdater/skip/no-user-jid phoneNumber="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r1 = r3.A09
            r0 = 4
            java.lang.String r0 = X.AnonymousClass1ZW.A03(r0, r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0015
        L_0x0050:
            r0 = r25
            r0.put(r5, r3)
            java.lang.Object r4 = r9.get(r5)
            X.27a r4 = (X.C450927a) r4
            if (r4 == 0) goto L_0x0015
            int r9 = r4.A04
            r0 = 3
            if (r9 == r0) goto L_0x05ac
            r0 = r37
            X.27g r0 = r0.A01
            if (r0 == 0) goto L_0x0076
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0076
            X.15u r10 = r7.A09
            r1 = 1
            if (r9 != r1) goto L_0x014b
            boolean r0 = r6.A0i
            r9 = 1
            if (r0 == 0) goto L_0x0155
        L_0x0076:
            r0 = r37
            X.27g r0 = r0.A04
            if (r0 == 0) goto L_0x0093
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0093
            X.165 r10 = r7.A04
            X.1ZX r9 = r4.A0B
            com.whatsapp.jid.UserJid r1 = r4.A0C
            if (r9 == 0) goto L_0x0093
            boolean r0 = r1 instanceof X.AnonymousClass1ZT
            if (r0 == 0) goto L_0x0093
            X.0vJ r0 = r10.A00
            X.1ZT r1 = (X.AnonymousClass1ZT) r1
            r0.A03(r9, r1)
        L_0x0093:
            r0 = r37
            X.27g r0 = r0.A08
            if (r0 == 0) goto L_0x00d5
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x00d5
            X.164 r11 = r7.A08
            int r13 = r4.A03
            r10 = 2
            r12 = 0
            r9 = 1
            r0 = 0
            if (r10 == r13) goto L_0x010d
            if (r9 != r13) goto L_0x0107
            long r9 = r4.A08
            long r0 = r6.A0B
            int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r12 != 0) goto L_0x00bc
            java.lang.String r1 = r4.A0F
            java.lang.String r0 = r6.A0T
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x00d5
        L_0x00bc:
            java.lang.String r0 = r4.A0F
            r6.A0T = r0
            long r0 = r4.A08
            r6.A0B = r0
            X.0sG r11 = r11.A00
            com.whatsapp.jid.Jid r10 = r6.A08(r2)
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10
            long r0 = r4.A08
            java.lang.String r9 = r4.A0F
            r11.A0T(r10, r9, r0)
        L_0x00d3:
            int r20 = r20 + 1
        L_0x00d5:
            r0 = r37
            X.27g r0 = r0.A07
            if (r0 == 0) goto L_0x01bb
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x01bb
            com.whatsapp.jid.UserJid r0 = r3.A06
            if (r0 == 0) goto L_0x01bb
            X.15v r9 = r7.A07
            boolean r1 = r6.A0h
            boolean r0 = r3.A0K
            if (r1 == r0) goto L_0x01bb
            r6.A0h = r0
            X.0sG r13 = r9.A00
            com.whatsapp.jid.Jid r12 = r6.A08(r2)
            boolean r11 = r6.A0h
            X.18c r3 = r13.A06
            r14 = 1
            android.content.ContentValues r10 = new android.content.ContentValues
            r10.<init>(r14)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r11)
            java.lang.String r0 = "is_sidelist_synced"
            r10.put(r0, r1)
            goto L_0x017b
        L_0x0107:
            if (r13 != 0) goto L_0x0127
            int r9 = r4.A04
            if (r9 != r10) goto L_0x00d5
        L_0x010d:
            long r9 = r6.A0B
            int r13 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r13 > 0) goto L_0x0117
            java.lang.String r9 = r6.A0T
            if (r9 == 0) goto L_0x00d5
        L_0x0117:
            r6.A0T = r12
            r6.A0B = r0
            X.0sG r10 = r11.A00
            com.whatsapp.jid.Jid r9 = r6.A08(r2)
            com.whatsapp.jid.UserJid r9 = (com.whatsapp.jid.UserJid) r9
            r10.A0T(r9, r12, r0)
            goto L_0x00d3
        L_0x0127:
            r9 = 3
            if (r9 != r13) goto L_0x0597
            X.0tz r9 = r11.A01
            android.content.Context r9 = r9.A00
            android.content.res.Resources r10 = r9.getResources()
            r9 = 2131887708(0x7f12065c, float:1.941003E38)
            java.lang.String r9 = r10.getString(r9)
            r6.A0T = r9
            r6.A0B = r0
            X.0sG r11 = r11.A00
            com.whatsapp.jid.Jid r10 = r6.A08(r2)
            com.whatsapp.jid.UserJid r10 = (com.whatsapp.jid.UserJid) r10
            java.lang.String r9 = r6.A0T
            r11.A0T(r10, r9, r0)
            goto L_0x00d5
        L_0x014b:
            r0 = 2
            if (r9 != r0) goto L_0x0076
            boolean r0 = r6.A0i
            r9 = 0
            if (r0 != 0) goto L_0x0155
            goto L_0x0076
        L_0x0155:
            r6.A0i = r9
            X.0xU r0 = r10.A01
            boolean r9 = r0.A0Z(r8)
            if (r9 == 0) goto L_0x0168
            java.util.Set r9 = java.util.Collections.singleton(r6)
            r0.A0T(r9, r1)
            goto L_0x0076
        L_0x0168:
            X.0sK r0 = r10.A00
            boolean r0 = r0.A0G()
            if (r0 != 0) goto L_0x0076
            X.0sG r1 = r10.A02
            java.util.Set r0 = java.util.Collections.singleton(r6)
            r1.A0V(r0)
            goto L_0x0076
        L_0x017b:
            X.11X r0 = r3.A00     // Catch:{ IllegalArgumentException -> 0x019a }
            X.0tf r9 = r0.A02()     // Catch:{ IllegalArgumentException -> 0x019a }
            java.lang.String r3 = "wa_contacts"
            java.lang.String r1 = "jid = ?"
            java.lang.String[] r0 = new java.lang.String[r14]     // Catch:{ all -> 0x0195 }
            java.lang.String r14 = r12.getRawString()     // Catch:{ all -> 0x0195 }
            r0[r8] = r14     // Catch:{ all -> 0x0195 }
            X.AnonymousClass15L.A01(r10, r9, r3, r1, r0)     // Catch:{ all -> 0x0195 }
            r9.close()     // Catch:{ IllegalArgumentException -> 0x019a }
            goto L_0x01b4
        L_0x0195:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0199 }
        L_0x0199:
            throw r0     // Catch:{ IllegalArgumentException -> 0x019a }
        L_0x019a:
            r3 = move-exception
            java.lang.String r0 = "contact-mgr-db/unable to update contact sidelist sync "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r12)
            java.lang.String r0 = ", "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = r1.toString()
            X.AnonymousClass00B.A09(r0, r3)
        L_0x01b4:
            X.1kv r0 = r13.A04
            java.util.Map r0 = r0.A01
            r0.remove(r12)
        L_0x01bb:
            r0 = r37
            X.27g r0 = r0.A06
            if (r0 == 0) goto L_0x0220
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x0220
            X.15z r12 = r7.A06
            int r0 = r4.A04
            r13 = 2
            r11 = 1
            if (r0 == r13) goto L_0x026a
            int r10 = r4.A02
            r0 = -1
            if (r10 == r0) goto L_0x026a
            java.lang.String r9 = r4.A0E
            java.lang.String r0 = "image"
            boolean r14 = r0.equals(r9)
            r0 = r44
            if (r14 == 0) goto L_0x01e2
            int r3 = r6.A04
            if (r3 != r10) goto L_0x01ee
        L_0x01e2:
            java.lang.String r3 = "preview"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L_0x0253
            int r3 = r6.A05
            if (r3 == r10) goto L_0x0253
        L_0x01ee:
            java.lang.String r3 = r4.A0D
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x024a
            com.whatsapp.jid.UserJid r11 = r4.A0C
            r30 = 0
            java.lang.String r10 = r4.A0D
            int r9 = r4.A02
            java.lang.String r13 = r4.A0E
            java.lang.String r3 = "preview"
            boolean r3 = r3.equals(r13)
            r33 = 1
            if (r3 == 0) goto L_0x020c
            r33 = 2
        L_0x020c:
            X.277 r3 = new X.277
            r28 = r11
            r29 = r10
            r31 = r30
            r32 = r9
            r27 = r3
            r27.<init>(r28, r29, r30, r31, r32, r33)
            X.15y r9 = r12.A01
            r9.A01(r3, r0)
        L_0x0220:
            r0 = r37
            X.27g r0 = r0.A00
            if (r0 == 0) goto L_0x02b7
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x02b7
            X.15w r1 = r7.A01
            boolean r0 = r6.A0d
            if (r0 != 0) goto L_0x02b7
            r11 = 1
            r6.A0d = r11
            X.0sG r10 = r1.A04
            com.whatsapp.jid.Jid r12 = r6.A08(r2)
            X.18c r2 = r10.A06
            android.content.ContentValues r9 = new android.content.ContentValues
            r9.<init>(r11)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r11)
            java.lang.String r0 = "is_business_synced"
            r9.put(r0, r1)
            goto L_0x0277
        L_0x024a:
            r12.A00(r4)
            java.lang.String r0 = "ContactSyncPictureUpdater/update photo id doesn't match the existing one in db"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0220
        L_0x0253:
            X.15x r3 = r12.A02
            if (r14 != 0) goto L_0x0258
            r13 = 1
        L_0x0258:
            long r9 = android.os.SystemClock.elapsedRealtime()
            long r9 = r9 - r44
            java.lang.Long r1 = java.lang.Long.valueOf(r9)
            r0 = 0
            r3.A00(r0, r1, r11, r13)
            r12.A00(r4)
            goto L_0x0220
        L_0x026a:
            r12.A00(r4)
            com.whatsapp.jid.UserJid r1 = r4.A0C
            if (r1 == 0) goto L_0x0220
            X.12A r0 = r12.A00
            r0.A03(r1)
            goto L_0x0220
        L_0x0277:
            X.11X r0 = r2.A00     // Catch:{ IllegalArgumentException -> 0x0296 }
            X.0tf r3 = r0.A02()     // Catch:{ IllegalArgumentException -> 0x0296 }
            java.lang.String r2 = "wa_contacts"
            java.lang.String r1 = "jid = ?"
            java.lang.String[] r0 = new java.lang.String[r11]     // Catch:{ all -> 0x0291 }
            java.lang.String r13 = r12.getRawString()     // Catch:{ all -> 0x0291 }
            r0[r8] = r13     // Catch:{ all -> 0x0291 }
            X.AnonymousClass15L.A01(r9, r3, r2, r1, r0)     // Catch:{ all -> 0x0291 }
            r3.close()     // Catch:{ IllegalArgumentException -> 0x0296 }
            goto L_0x02b0
        L_0x0291:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0295 }
        L_0x0295:
            throw r0     // Catch:{ IllegalArgumentException -> 0x0296 }
        L_0x0296:
            r2 = move-exception
            java.lang.String r0 = "contact-mgr-db/unable to update contact business sync "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r12)
            java.lang.String r0 = ", "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = r1.toString()
            X.AnonymousClass00B.A09(r0, r2)
        L_0x02b0:
            X.1kv r0 = r10.A04
            java.util.Map r0 = r0.A01
            r0.remove(r12)
        L_0x02b7:
            r0 = r37
            X.27g r0 = r0.A02
            if (r0 == 0) goto L_0x02f8
            X.163 r11 = r7.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 != r0) goto L_0x02f8
            X.0z2 r9 = r11.A05
            long r2 = r9.A04(r5)
            X.137 r10 = r11.A03
            long r0 = r4.A06
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 <= 0) goto L_0x0361
            java.lang.String r9 = "contactsyncDevicesupdater/update/timestamp is less than existing one, current="
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r9)
            r12.append(r2)
            java.lang.String r9 = "; new time="
            r12.append(r9)
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r10.A09(r5, r2)
            X.162 r9 = r11.A04
            long r0 = r4.A06
            r14 = 0
            r10 = r2
            r12 = r0
            r9.A03(r10, r12, r14)
        L_0x02f8:
            r0 = r37
            X.27g r0 = r0.A05
            if (r0 == 0) goto L_0x053e
            X.161 r1 = r7.A05
            X.0w8 r0 = r1.A01
            boolean r0 = r0.A08()
            if (r0 == 0) goto L_0x053e
            X.27h r0 = r4.A0A
            if (r0 == 0) goto L_0x053e
            X.160 r12 = r1.A00
            boolean r1 = r0.A03
            java.lang.Boolean r29 = java.lang.Boolean.valueOf(r1)
            java.lang.String r11 = r0.A00
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.util.HashMap r0 = r0.A01
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x04df
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r9 = r0.iterator()
        L_0x032b:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x04df
            java.lang.Object r1 = r9.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r1.getKey()
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            java.lang.Object r0 = r1.getValue()
            X.27i r0 = (X.C451727i) r0
            r3 = 3
            r1 = 1
            if (r2 == r1) goto L_0x0350
            r1 = 3
            r3 = 1
            if (r2 == r1) goto L_0x0350
            r3 = 0
        L_0x0350:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r2 = r0.A01
            java.lang.String r1 = r0.A00
            X.01Q r0 = new X.01Q
            r0.<init>(r2, r1)
            r10.put(r3, r0)
            goto L_0x032b
        L_0x0361:
            X.0sK r13 = r11.A00
            r13.A0B()
            X.1ZT r0 = r13.A05
            boolean r0 = r5.equals(r0)
            r1 = 0
            if (r0 == 0) goto L_0x038a
            boolean r0 = r13.A0G()
            if (r0 != 0) goto L_0x038a
            X.0yO r2 = r11.A02
            java.util.Map r0 = r4.A0H
            if (r0 == 0) goto L_0x037f
            X.0vs r1 = X.C17930vs.copyOf((java.util.Map) r0)
        L_0x037f:
            r0 = 1
            boolean r0 = r2.A0D(r1, r0, r8)
        L_0x0384:
            if (r0 == 0) goto L_0x02f8
            int r19 = r19 + 1
            goto L_0x02f8
        L_0x038a:
            byte[] r0 = r4.A0J
            if (r0 != 0) goto L_0x0423
            java.util.Map r0 = r4.A0H
            if (r0 == 0) goto L_0x03b2
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r1 = r0.iterator()
        L_0x039a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03b2
            java.lang.Object r0 = r1.next()
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            byte r0 = r0.device
            if (r0 == 0) goto L_0x039a
            X.162 r1 = r11.A04
            r0 = 6
            r1.A01(r0, r8)
            goto L_0x02f8
        L_0x03b2:
            r13.A0B()
            X.1ZT r0 = r13.A05
            boolean r0 = r5.equals(r0)
            r0 = r0 ^ 1
            X.AnonymousClass00B.A0G(r0)
            long r2 = r4.A06
            long r0 = r4.A05
            r10 = r11
            r11 = r5
            r12 = r2
            r14 = r0
            boolean r14 = r10.A00(r11, r12, r14)
            X.1p6 r2 = r9.A09(r5)
            java.util.Map r0 = r4.A0H
            if (r0 == 0) goto L_0x0414
            X.0vs r13 = X.C17930vs.copyOf((java.util.Map) r0)
        L_0x03d8:
            if (r2 != 0) goto L_0x03e0
            r12 = 0
        L_0x03db:
            boolean r0 = r9.A0I(r13, r12, r5, r14)
            goto L_0x0384
        L_0x03e0:
            int r0 = r2.A00
            r21 = r0
            long r15 = r4.A06
            if (r14 != 0) goto L_0x040d
            long r0 = r2.A01
            int r3 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
            if (r3 >= 0) goto L_0x040d
            X.AnonymousClass00B.A06(r2)
            X.AnonymousClass00B.A06(r2)
            long r10 = r2.A03
            X.AnonymousClass00B.A06(r2)
            long r2 = r2.A02
        L_0x03fb:
            X.1p6 r12 = new X.1p6
            r28 = r21
            r29 = r15
            r31 = r0
            r33 = r10
            r35 = r2
            r27 = r12
            r27.<init>(r28, r29, r31, r33, r35)
            goto L_0x03db
        L_0x040d:
            r0 = 0
            r10 = 0
            r2 = 0
            goto L_0x03fb
        L_0x0414:
            com.whatsapp.jid.DeviceJid r3 = r5.getPrimaryDevice()
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            X.0vs r13 = X.C17930vs.of(r3, r0)
            goto L_0x03d8
        L_0x0423:
            X.27J r12 = r10.A05(r5, r0)
            long r0 = r4.A06
            boolean r0 = r10.A0D(r5, r12, r0)
            if (r0 != 0) goto L_0x0442
            java.lang.String r1 = "contactsyncDevicesupdater/update/validate indexList fail, userJid="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x02f8
        L_0x0442:
            long r2 = r4.A06
            long r0 = r4.A05
            r27 = r11
            r28 = r5
            r29 = r2
            r31 = r0
            boolean r16 = r27.A00(r28, r29, r31)
            r13.A0B()
            X.1ZT r0 = r13.A05
            X.AnonymousClass00B.A06(r0)
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x04d2
            X.0vs r0 = r9.A05()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>(r0)
        L_0x0469:
            X.1p6 r2 = r9.A09(r5)
            int r0 = r12.A02
            r27 = r0
            long r0 = r12.A04
            r23 = r0
            if (r16 != 0) goto L_0x04cb
            if (r2 == 0) goto L_0x04cb
            long r14 = r2.A01
            int r0 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x04cb
            X.AnonymousClass00B.A06(r2)
            X.AnonymousClass00B.A06(r2)
            long r0 = r2.A03
            r21 = r0
            X.AnonymousClass00B.A06(r2)
            long r0 = r2.A02
        L_0x048e:
            X.1p6 r2 = new X.1p6
            r28 = r27
            r29 = r23
            r31 = r14
            r33 = r21
            r35 = r0
            r27 = r2
            r27.<init>(r28, r29, r31, r33, r35)
            java.util.Map r14 = r4.A0H
            if (r14 != 0) goto L_0x04a4
            r14 = r3
        L_0x04a4:
            X.27P r1 = r12.A05
            int r0 = r12.A01
            java.util.Map r0 = r10.A06(r1, r3, r14, r0)
            X.0vs r1 = X.C17930vs.copyOf((java.util.Map) r0)
            boolean r0 = r13.A0G()
            if (r0 == 0) goto L_0x04d7
            r13.A0B()
            X.1ZT r0 = r13.A05
            X.AnonymousClass00B.A06(r0)
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x04d7
            r9.A0F(r2, r5)
            X.0yO r2 = r11.A02
            goto L_0x037f
        L_0x04cb:
            r14 = 0
            r21 = 0
            r0 = 0
            goto L_0x048e
        L_0x04d2:
            java.util.Map r3 = r9.A0A(r5)
            goto L_0x0469
        L_0x04d7:
            r0 = r16
            boolean r0 = r9.A0I(r1, r2, r5, r0)
            goto L_0x0384
        L_0x04df:
            X.27h r0 = r4.A0A
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.HashMap r1 = r0.A02
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x052c
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r13 = r0.iterator()
        L_0x04f6:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x052c
            java.lang.Object r0 = r13.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Number r1 = (java.lang.Number) r1
            int r2 = r1.intValue()
            java.lang.Object r1 = r0.getValue()
            X.27j r1 = (X.C451827j) r1
            r3 = 3
            r0 = 1
            if (r2 == r0) goto L_0x051b
            r0 = 3
            r3 = 1
            if (r2 == r0) goto L_0x051b
            r3 = 0
        L_0x051b:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r2 = r1.A01
            java.lang.String r1 = r1.A00
            X.01Q r0 = new X.01Q
            r0.<init>(r2, r1)
            r9.put(r3, r0)
            goto L_0x04f6
        L_0x052c:
            r28 = r5
            r30 = r11
            r31 = r10
            r32 = r9
            r27 = r12
            boolean r0 = r27.A0J(r28, r29, r30, r31, r32)
            if (r0 == 0) goto L_0x053e
            int r18 = r18 + 1
        L_0x053e:
            r0 = r37
            X.27g r0 = r0.A03
            if (r0 == 0) goto L_0x0562
            X.166 r10 = r7.A03
            com.whatsapp.jid.UserJid r9 = r4.A0C
            if (r9 == 0) goto L_0x0562
            int r0 = r6.A00
            int r7 = r4.A01
            if (r0 == r7) goto L_0x0562
            long r2 = r6.A07
            long r0 = r4.A07
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 >= 0) goto L_0x0562
            r2 = -1
            if (r7 == r2) goto L_0x0562
            X.0sG r2 = r10.A00
            r2.A0S(r9, r7, r0)
            int r17 = r17 + 1
        L_0x0562:
            com.whatsapp.jid.UserJid r3 = r4.A0C
            if (r3 == 0) goto L_0x0015
            X.27k r2 = X.C451927k.A01
            java.util.Set r0 = X.C451927k.A04
            boolean r0 = r0.add(r3)
            if (r0 == 0) goto L_0x0015
            monitor-enter(r2)
            X.0rv r0 = X.C451927k.A00     // Catch:{ all -> 0x0594 }
            boolean r0 = X.C18450wi.A0R(r0, r3)     // Catch:{ all -> 0x0594 }
            if (r0 != 0) goto L_0x0591
            java.util.List r0 = X.C451927k.A02     // Catch:{ all -> 0x0594 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0594 }
        L_0x057f:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0594 }
            if (r0 == 0) goto L_0x058f
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0594 }
            X.22J r0 = (X.AnonymousClass22J) r0     // Catch:{ all -> 0x0594 }
            r0.AIU(r3)     // Catch:{ all -> 0x0594 }
            goto L_0x057f
        L_0x058f:
            X.C451927k.A00 = r3     // Catch:{ all -> 0x0594 }
        L_0x0591:
            monitor-exit(r2)
            goto L_0x0015
        L_0x0594:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0597:
            java.lang.String r1 = "unrecognized status type="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r1 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x05ac:
            java.lang.String r0 = "syncUser with type="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r9)
            java.lang.String r0 = " cannot be updated"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x05c6:
            r0 = r37
            X.27g r0 = r0.A00
            if (r0 == 0) goto L_0x088d
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x088d
            X.0uc r0 = r7.A00
            java.util.Map r0 = r0.A02()
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>(r0)
            X.15w r5 = r7.A01
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            java.util.Set r0 = r25.entrySet()
            java.util.Iterator r15 = r0.iterator()
        L_0x05f9:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x06d6
            java.lang.Object r0 = r15.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r7 = r0.getKey()
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7
            java.lang.Object r11 = r9.get(r7)
            X.27a r11 = (X.C450927a) r11
            r14 = 0
            if (r11 == 0) goto L_0x0686
            X.27l r12 = r11.A09
            if (r12 == 0) goto L_0x0686
            com.whatsapp.jid.UserJid r13 = r12.A01     // Catch:{ 1W9 -> 0x087a }
            if (r13 == 0) goto L_0x062a
            X.1Vv r1 = r12.A02     // Catch:{ 1W9 -> 0x087a }
            if (r1 == 0) goto L_0x062a
            java.lang.String r0 = "profile"
            X.1Vv r0 = r1.A0J(r0)     // Catch:{ 1W9 -> 0x087a }
            X.1mD r14 = X.AnonymousClass27m.A00(r13, r0)     // Catch:{ 1W9 -> 0x087a }
        L_0x062a:
            boolean r0 = r10.containsKey(r7)
            if (r0 == 0) goto L_0x0637
            java.lang.Object r0 = r10.get(r7)
            r1 = 1
            if (r0 != 0) goto L_0x0638
        L_0x0637:
            r1 = 0
        L_0x0638:
            r0 = 0
            if (r14 == 0) goto L_0x063c
            r0 = 1
        L_0x063c:
            if (r1 == 0) goto L_0x0669
            if (r0 == 0) goto L_0x064e
            java.lang.Object r1 = r10.get(r7)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r0 = r14.A0E
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 != 0) goto L_0x0654
        L_0x064e:
            r3.add(r7)
            r2.put(r7, r14)
        L_0x0654:
            X.27n r0 = r12.A00
            if (r0 == 0) goto L_0x066c
            r6.put(r7, r0)
            boolean r0 = r11.A0I
            if (r0 == 0) goto L_0x05f9
            X.0uP r0 = r5.A05
            X.1Vq r0 = r0.A00(r7)
            r4.put(r7, r0)
            goto L_0x05f9
        L_0x0669:
            if (r0 != 0) goto L_0x064e
            goto L_0x0654
        L_0x066c:
            r0 = r43
            if (r43 == 0) goto L_0x0676
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L_0x05f9
        L_0x0676:
            X.0uP r1 = r5.A05
            X.1Vq r0 = r1.A00(r7)
            if (r0 == 0) goto L_0x0681
            r3.add(r7)
        L_0x0681:
            r1.A01(r7)
            goto L_0x05f9
        L_0x0686:
            java.lang.Object r0 = r0.getValue()
            X.27f r0 = (X.C451427f) r0
            r13 = 0
            if (r0 == 0) goto L_0x05f9
            boolean r0 = r0.A0B
            if (r0 == 0) goto L_0x05f9
            X.0uP r1 = r5.A05
            X.1Vq r12 = r1.A00(r7)
            X.0uc r0 = r5.A02
            X.235 r0 = r0.A0A
            X.1mD r11 = r0.A00(r7)
            if (r11 == 0) goto L_0x06a4
            r13 = 1
        L_0x06a4:
            r0.A02(r7)
            r1.A01(r7)
            if (r12 == 0) goto L_0x06d3
            X.0t6 r11 = r5.A06
            X.1Vr r1 = new X.1Vr
            r1.<init>()
            int r0 = r12.A03
            r1.A03 = r0
            java.lang.String r0 = r12.A08
            r1.A07 = r0
            X.1ta r0 = r12.A00()
            r1.A05 = r0
            int r0 = X.C32441gM.A00(r12)
            r1.A02 = r0
            X.1Vs r0 = r1.A01()
            r11.A0R(r7, r0)
        L_0x06ce:
            r3.add(r7)
            goto L_0x05f9
        L_0x06d3:
            if (r13 == 0) goto L_0x05f9
            goto L_0x06ce
        L_0x06d6:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x06e3
            X.0uc r0 = r5.A02
            X.235 r0 = r0.A0A
            r0.A03(r2)
        L_0x06e3:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0825
            X.0uP r12 = r5.A05
            X.AnonymousClass00B.A00()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            java.util.Set r0 = r6.entrySet()
            java.util.Iterator r16 = r0.iterator()
        L_0x070a:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x07dc
            java.lang.Object r14 = r16.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.Object r0 = r14.getKey()
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            com.whatsapp.jid.DeviceJid r11 = com.whatsapp.jid.DeviceJid.of(r0)
            X.AnonymousClass00B.A06(r11)
            X.16P r6 = r12.A08     // Catch:{ InterruptedException | ExecutionException -> 0x0739 }
            X.11s r0 = r12.A07     // Catch:{ InterruptedException | ExecutionException -> 0x0739 }
            X.27o r1 = new X.27o     // Catch:{ InterruptedException | ExecutionException -> 0x0739 }
            r1.<init>(r0, r11)     // Catch:{ InterruptedException | ExecutionException -> 0x0739 }
            java.util.concurrent.ThreadPoolExecutor r0 = r6.A00     // Catch:{ InterruptedException | ExecutionException -> 0x0739 }
            java.util.concurrent.Future r0 = r0.submit(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0739 }
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0739 }
            if (r0 != 0) goto L_0x075b
            goto L_0x0758
        L_0x0739:
            r6 = move-exception
            java.lang.String r0 = "vname: failed to get identity entry for jid = "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.Object r0 = r14.getKey()
            r1.append(r0)
            java.lang.String r0 = " error = "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e(r0, r6)
        L_0x0758:
            r10.add(r11)
        L_0x075b:
            java.lang.Object r0 = r14.getValue()
            if (r0 == 0) goto L_0x07bd
            java.lang.Object r0 = r14.getValue()
            X.27n r0 = (X.C452127n) r0
            byte[] r0 = r0.A02
            if (r0 == 0) goto L_0x07bd
            com.whatsapp.jid.UserJid r15 = r11.getUserJid()
            java.lang.Object r0 = r14.getValue()
            X.27n r0 = (X.C452127n) r0
            byte[] r13 = r0.A02
            java.lang.Object r0 = r14.getValue()
            X.27n r0 = (X.C452127n) r0
            int r6 = r0.A00
            java.lang.Object r0 = r14.getValue()
            X.27n r0 = (X.C452127n) r0
            X.1ta r1 = r0.A01
            X.1ta r0 = new X.1ta
            r0.<init>(r1)
            boolean r0 = r12.A05(r15, r0, r13, r6)
            if (r0 == 0) goto L_0x0799
            com.whatsapp.jid.UserJid r0 = r11.getUserJid()
            r2.add(r0)
        L_0x0799:
            com.whatsapp.jid.UserJid r0 = r11.getUserJid()
            X.1Vq r0 = r12.A00(r0)
            if (r0 == 0) goto L_0x07ad
            int r0 = r0.A02
            if (r0 == 0) goto L_0x07b2
            boolean r0 = r10.contains(r11)
            if (r0 != 0) goto L_0x07b2
        L_0x07ad:
            r10.add(r11)
            goto L_0x070a
        L_0x07b2:
            boolean r0 = r9.contains(r11)
            if (r0 != 0) goto L_0x070a
            r9.add(r11)
            goto L_0x070a
        L_0x07bd:
            com.whatsapp.jid.UserJid r6 = r11.getUserJid()
            java.lang.Object r0 = r14.getValue()
            X.27n r0 = (X.C452127n) r0
            int r1 = r0.A00
            java.lang.Object r0 = r14.getValue()
            X.27n r0 = (X.C452127n) r0
            X.1ta r0 = r0.A01
            boolean r0 = r12.A03(r6, r0, r1, r8)
            if (r0 == 0) goto L_0x070a
            r7.add(r11)
            goto L_0x070a
        L_0x07dc:
            boolean r0 = r10.isEmpty()
            if (r0 != 0) goto L_0x07e7
            X.0vP r0 = r5.A07
            r0.A01(r10)
        L_0x07e7:
            X.AnonymousClass00B.A06(r9)
            int r1 = r9.size()
            X.AnonymousClass00B.A06(r7)
            int r0 = r7.size()
            int r1 = r1 + r0
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r1)
            java.util.Iterator r1 = r7.iterator()
        L_0x07ff:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0813
            java.lang.Object r0 = r1.next()
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            com.whatsapp.jid.UserJid r0 = r0.getUserJid()
            r3.add(r0)
            goto L_0x07ff
        L_0x0813:
            java.util.Iterator r1 = r2.iterator()
        L_0x0817:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0831
            java.lang.Object r0 = r1.next()
            r3.add(r0)
            goto L_0x0817
        L_0x0825:
            java.util.List r9 = java.util.Collections.emptyList()
            java.util.List r6 = java.util.Collections.emptyList()
            java.util.Set r7 = java.util.Collections.emptySet()
        L_0x0831:
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x0856
            X.0pt r2 = r5.A01
            r1 = 3
            com.facebook.redex.RunnableRunnableShape5S0200000_I0_3 r0 = new com.facebook.redex.RunnableRunnableShape5S0200000_I0_3
            r0.<init>(r5, r1, r9)
            r2.A0K(r0)
            java.util.Iterator r1 = r9.iterator()
        L_0x0846:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0856
            java.lang.Object r0 = r1.next()
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            r5.A00(r0, r6, r4)
            goto L_0x0846
        L_0x0856:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0870
            java.util.Iterator r1 = r7.iterator()
        L_0x0860:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0870
            java.lang.Object r0 = r1.next()
            com.whatsapp.jid.DeviceJid r0 = (com.whatsapp.jid.DeviceJid) r0
            r5.A00(r0, r6, r4)
            goto L_0x0860
        L_0x0870:
            X.0sG r0 = r5.A04
            r0.A0J()
            int r8 = r3.size()
            goto L_0x088d
        L_0x087a:
            r0 = move-exception
            X.AnonymousClass00B.A0E(r0)
            X.0so r2 = r5.A00
            java.lang.String r1 = r0.getMessage()
            java.lang.String r0 = "CorruptStreamException"
            r2.AcB(r0, r1, r8)
            int r8 = r3.size()
        L_0x088d:
            r2 = r40
            if (r40 == 0) goto L_0x08bc
            r0 = r20
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0H = r0
            r0 = r19
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A07 = r0
            long r0 = (long) r8
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A05 = r0
            r0 = r18
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0C = r0
            r0 = r17
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A08 = r0
        L_0x08bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass167.A02(X.27e, X.27b, java.util.List, java.util.Map, java.util.Map, long):void");
    }
}
