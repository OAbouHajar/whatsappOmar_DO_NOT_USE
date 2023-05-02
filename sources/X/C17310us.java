package X;

import android.text.TextUtils;
import com.facebook.redex.IDxPProducerShape435S0100000_2_I0;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.HashSet;

/* renamed from: X.0us  reason: invalid class name and case insensitive filesystem */
public class C17310us {
    public final C16300so A00;
    public final C16040sK A01;
    public final C19250y7 A02;
    public final C16000sG A03;
    public final C16440t3 A04;
    public final C17620vN A05;
    public final C39581si A06 = new IDxPProducerShape435S0100000_2_I0(this, 1);
    public final AnonymousClass11J A07;
    public final C216314v A08;
    public final C16900tq A09;
    public final AnonymousClass193 A0A;
    public final AnonymousClass11I A0B;
    public final C17580vJ A0C;
    public final C19810z2 A0D;
    public final C14710pd A0E;
    public final C16320sq A0F;

    public C17310us(C16300so r3, C16040sK r4, C19250y7 r5, C16000sG r6, C16440t3 r7, C17620vN r8, AnonymousClass11J r9, C216314v r10, C16900tq r11, AnonymousClass193 r12, AnonymousClass11I r13, C17580vJ r14, C19810z2 r15, C14710pd r16, C16320sq r17) {
        this.A04 = r7;
        this.A0E = r16;
        this.A08 = r10;
        this.A00 = r3;
        this.A01 = r4;
        this.A0F = r17;
        this.A03 = r6;
        this.A0C = r14;
        this.A0B = r13;
        this.A0D = r15;
        this.A02 = r5;
        this.A05 = r8;
        this.A09 = r11;
        this.A07 = r9;
        this.A0A = r12;
    }

    public static final C17380uz A00(C17380uz r3, UserJid userJid) {
        HashSet hashSet = new HashSet();
        try {
            C28031Ub it = r3.iterator();
            while (it.hasNext()) {
                hashSet.add(DeviceJid.getFromUserJidAndDeviceId(userJid, ((DeviceJid) it.next()).device));
            }
        } catch (AnonymousClass1W4 e2) {
            Log.e((Throwable) e2);
        }
        return C17380uz.copyOf((Collection) hashSet);
    }

    public static final void A01(C30661ck r2) {
        C28031Ub it = C17380uz.copyOf(r2.A04.values()).iterator();
        while (it.hasNext()) {
            ((C39571sh) it.next()).A01 = false;
        }
    }

    public final long A02(UserJid userJid) {
        AnonymousClass00B.A0C("participant-user-store/invalid-jid", !TextUtils.isEmpty(userJid.getRawString()));
        C16040sK r1 = this.A01;
        r1.A0B();
        AnonymousClass1ZT r0 = r1.A05;
        AnonymousClass00B.A06(r0);
        if (r0.equals(userJid)) {
            userJid = C34091jg.A00;
        } else if (r1.A03() != null && r1.A03().equals(userJid)) {
            userJid = C34981lB.A00;
        }
        return this.A08.A01(userJid);
    }

    public final C30661ck A03(C30661ck r7, UserJid userJid) {
        C17380uz copyOf = C17380uz.copyOf(r7.A04.values());
        HashSet hashSet = new HashSet();
        C28031Ub it = copyOf.iterator();
        while (it.hasNext()) {
            C39571sh r1 = (C39571sh) it.next();
            try {
                hashSet.add(new C39571sh(DeviceJid.getFromUserJidAndDeviceId(userJid, r1.A02.device), r1.A01, r1.A00));
            } catch (AnonymousClass1W4 unused) {
                Log.e("participant-user-store/generateDevicesForJid/invalid device jid");
            }
        }
        return new C30661ck(userJid, hashSet, r7.A01, r7.A02);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:194|195|196|197|198) */
    /* JADX WARNING: Can't wrap try/catch for region: R(5:245|246|247|248|249) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0065, code lost:
        if (r34.A0H(r9) == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x023f, code lost:
        if (r13 != null) goto L_0x0241;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02db, code lost:
        if (r34.A0H(r8) == false) goto L_0x02dd;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:141:0x03db */
    /* JADX WARNING: Missing exception handler attribute for start block: B:197:0x0567 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:243:0x06c2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:248:0x06c7 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:243:0x06c2=Splitter:B:243:0x06c2, B:90:0x02b5=Splitter:B:90:0x02b5} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C30361cE A04(X.C16060sN r37) {
        /*
            r36 = this;
            r0 = r36
            X.11J r5 = r0.A07
            X.1si r4 = r0.A06
            java.util.concurrent.ConcurrentHashMap r0 = r5.A03
            r35 = r0
            r9 = r37
            java.lang.Object r3 = r0.get(r9)
            X.1cE r3 = (X.C30361cE) r3
            if (r3 != 0) goto L_0x06d4
            X.1sg r1 = r5.A00
            int r0 = r9.hashCode()
            int r0 = java.lang.Math.abs(r0)
            int r0 = r0 % 128
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.util.concurrent.ConcurrentHashMap r1 = r1.A00
            boolean r0 = r1.containsKey(r2)
            if (r0 != 0) goto L_0x0034
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.putIfAbsent(r2, r0)
        L_0x0034:
            java.lang.Object r18 = r1.get(r2)
            X.AnonymousClass00B.A06(r18)
            monitor-enter(r18)
            r0 = r35
            java.lang.Object r3 = r0.get(r9)     // Catch:{ all -> 0x06d1 }
            X.1cE r3 = (X.C30361cE) r3     // Catch:{ all -> 0x06d1 }
            if (r3 != 0) goto L_0x06cf
            X.0rt r0 = r5.A01     // Catch:{ all -> 0x06d1 }
            r34 = r0
            X.0vJ r2 = r5.A02     // Catch:{ all -> 0x06d1 }
            com.facebook.redex.IDxPProducerShape435S0100000_2_I0 r4 = (com.facebook.redex.IDxPProducerShape435S0100000_2_I0) r4     // Catch:{ all -> 0x06d1 }
            java.lang.Object r1 = r4.A00     // Catch:{ all -> 0x06d1 }
            X.0us r1 = (X.C17310us) r1     // Catch:{ all -> 0x06d1 }
            X.0sG r0 = r1.A03     // Catch:{ all -> 0x06d1 }
            X.0sH r0 = r0.A09(r9)     // Catch:{ all -> 0x06d1 }
            if (r0 == 0) goto L_0x0067
            boolean r0 = r0.A0b     // Catch:{ all -> 0x06d1 }
            if (r0 == 0) goto L_0x0067
            r0 = r34
            boolean r3 = r0.A0H(r9)     // Catch:{ all -> 0x06d1 }
            r0 = 1
            if (r3 != 0) goto L_0x0068
        L_0x0067:
            r0 = 0
        L_0x0068:
            X.1cE r3 = new X.1cE     // Catch:{ all -> 0x06d1 }
            r3.<init>(r9, r0)     // Catch:{ all -> 0x06d1 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x06c8 }
            r6.<init>()     // Catch:{ all -> 0x06c8 }
            java.lang.String r0 = "participant-user-store/migrated="
            r6.append(r0)     // Catch:{ all -> 0x06c8 }
            X.11I r4 = r1.A0B     // Catch:{ all -> 0x06c8 }
            java.lang.String r0 = "participant_user_ready"
            r5 = 0
            int r4 = r4.A00(r0, r5)     // Catch:{ all -> 0x06c8 }
            r0 = 2
            if (r4 != r0) goto L_0x0084
            r5 = 1
        L_0x0084:
            r6.append(r5)     // Catch:{ all -> 0x06c8 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x06c8 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x06c8 }
            X.0sN r8 = r3.A06     // Catch:{ all -> 0x06c8 }
            long r16 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x06c8 }
            java.lang.String r4 = "participant-user-store/getGroupParticipantsOptimized/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x06c8 }
            r0.<init>(r4)     // Catch:{ all -> 0x06c8 }
            r0.append(r8)     // Catch:{ all -> 0x06c8 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x06c8 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x06c8 }
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x06c8 }
            r0.<init>()     // Catch:{ all -> 0x06c8 }
            X.14v r6 = r1.A08     // Catch:{ all -> 0x06c8 }
            long r4 = r6.A01(r8)     // Catch:{ all -> 0x06c8 }
            java.lang.String r11 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x06c8 }
            X.0tq r4 = r1.A09     // Catch:{ all -> 0x06c8 }
            X.0tf r22 = r4.get()     // Catch:{ all -> 0x06c8 }
            r4 = r22
            X.0tg r10 = r4.A02     // Catch:{ all -> 0x06c3 }
            java.lang.String r7 = "SELECT user_jid_row_id, pending, rank, device_jid_row_id, sent_sender_key, sent_add_on_sender_key FROM group_participant_user JOIN group_participant_device ON group_participant_row_id = group_participant_user._id WHERE group_jid_row_id = ?"
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ all -> 0x06c3 }
            r4 = 0
            r5[r4] = r11     // Catch:{ all -> 0x06c3 }
            android.database.Cursor r4 = r10.A08(r7, r5)     // Catch:{ all -> 0x06c3 }
            java.lang.String r5 = "user_jid_row_id"
            int r21 = r4.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x06bc }
            java.lang.String r5 = "device_jid_row_id"
            int r20 = r4.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x06bc }
            java.lang.String r5 = "rank"
            int r15 = r4.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x06bc }
            java.lang.String r5 = "pending"
            int r14 = r4.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x06bc }
            java.lang.String r5 = "sent_sender_key"
            int r13 = r4.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x06bc }
            java.lang.String r5 = "sent_add_on_sender_key"
            int r11 = r4.getColumnIndexOrThrow(r5)     // Catch:{ all -> 0x06bc }
            java.util.ArrayList r19 = new java.util.ArrayList     // Catch:{ all -> 0x06bc }
            r19.<init>()     // Catch:{ all -> 0x06bc }
            java.util.HashSet r10 = new java.util.HashSet     // Catch:{ all -> 0x06bc }
            r10.<init>()     // Catch:{ all -> 0x06bc }
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ all -> 0x06bc }
            r7.<init>()     // Catch:{ all -> 0x06bc }
        L_0x0100:
            boolean r5 = r4.moveToNext()     // Catch:{ all -> 0x06bc }
            if (r5 == 0) goto L_0x0156
            r5 = r21
            long r25 = r4.getLong(r5)     // Catch:{ all -> 0x06bc }
            r5 = r20
            long r27 = r4.getLong(r5)     // Catch:{ all -> 0x06bc }
            int r24 = r4.getInt(r15)     // Catch:{ all -> 0x06bc }
            int r12 = r4.getInt(r14)     // Catch:{ all -> 0x06bc }
            r5 = 1
            r29 = 0
            if (r12 != r5) goto L_0x0121
            r29 = 1
        L_0x0121:
            int r12 = r4.getInt(r13)     // Catch:{ all -> 0x06bc }
            r30 = 0
            if (r12 != r5) goto L_0x012b
            r30 = 1
        L_0x012b:
            boolean r12 = r4.isNull(r11)     // Catch:{ all -> 0x06bc }
            if (r12 != 0) goto L_0x0139
            int r12 = r4.getInt(r11)     // Catch:{ all -> 0x06bc }
            r31 = 1
            if (r12 == r5) goto L_0x013b
        L_0x0139:
            r31 = 0
        L_0x013b:
            java.lang.Long r5 = java.lang.Long.valueOf(r25)     // Catch:{ all -> 0x06bc }
            r10.add(r5)     // Catch:{ all -> 0x06bc }
            java.lang.Long r5 = java.lang.Long.valueOf(r27)     // Catch:{ all -> 0x06bc }
            r7.add(r5)     // Catch:{ all -> 0x06bc }
            X.1sj r5 = new X.1sj     // Catch:{ all -> 0x06bc }
            r23 = r5
            r23.<init>(r24, r25, r27, r29, r30, r31)     // Catch:{ all -> 0x06bc }
            r12 = r19
            r12.add(r5)     // Catch:{ all -> 0x06bc }
            goto L_0x0100
        L_0x0156:
            java.lang.Class<com.whatsapp.jid.UserJid> r5 = com.whatsapp.jid.UserJid.class
            java.util.Map r21 = r6.A09(r5, r10)     // Catch:{ all -> 0x06bc }
            java.lang.Class<com.whatsapp.jid.DeviceJid> r5 = com.whatsapp.jid.DeviceJid.class
            java.util.Map r20 = r6.A09(r5, r7)     // Catch:{ all -> 0x06bc }
            r7 = 0
            java.util.Iterator r19 = r19.iterator()     // Catch:{ all -> 0x06bc }
        L_0x0167:
            boolean r5 = r19.hasNext()     // Catch:{ all -> 0x06bc }
            if (r5 == 0) goto L_0x0275
            java.lang.Object r10 = r19.next()     // Catch:{ all -> 0x06bc }
            X.1sj r10 = (X.C39591sj) r10     // Catch:{ all -> 0x06bc }
            long r5 = r10.A02     // Catch:{ all -> 0x06bc }
            r32 = r5
            java.lang.Long r6 = java.lang.Long.valueOf(r32)     // Catch:{ all -> 0x06bc }
            r5 = r21
            java.lang.Object r11 = r5.get(r6)     // Catch:{ all -> 0x06bc }
            com.whatsapp.jid.UserJid r11 = (com.whatsapp.jid.UserJid) r11     // Catch:{ all -> 0x06bc }
            long r5 = r10.A01     // Catch:{ all -> 0x06bc }
            java.lang.Long r6 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x06bc }
            r5 = r20
            java.lang.Object r13 = r5.get(r6)     // Catch:{ all -> 0x06bc }
            com.whatsapp.jid.DeviceJid r13 = (com.whatsapp.jid.DeviceJid) r13     // Catch:{ all -> 0x06bc }
            if (r11 != 0) goto L_0x0199
            java.lang.String r5 = "participant-user-store/getGroupParticipants invalid jid from db"
            com.whatsapp.util.Log.e((java.lang.String) r5)     // Catch:{ all -> 0x06bc }
            goto L_0x0167
        L_0x0199:
            com.whatsapp.jid.UserJid r12 = r1.A05(r11)     // Catch:{ all -> 0x06bc }
            X.0sK r5 = r1.A01     // Catch:{ all -> 0x06bc }
            boolean r5 = r5.A0I(r11)     // Catch:{ all -> 0x06bc }
            if (r5 == 0) goto L_0x01cd
            if (r7 != 0) goto L_0x01ca
            java.lang.String r5 = "participant-user-store/getGroupParticipants/found orphaned me participant"
            com.whatsapp.util.Log.e((java.lang.String) r5)     // Catch:{ all -> 0x06bc }
            X.0so r11 = r1.A00     // Catch:{ all -> 0x06bc }
            java.lang.String r7 = "participant-user-orphaned-me"
            java.lang.Class r5 = r8.getClass()     // Catch:{ all -> 0x06bc }
            java.lang.String r6 = r5.toString()     // Catch:{ all -> 0x06bc }
            r5 = 0
            r11.AcB(r7, r6, r5)     // Catch:{ all -> 0x06bc }
            java.util.HashSet r11 = new java.util.HashSet     // Catch:{ all -> 0x06bc }
            r11.<init>()     // Catch:{ all -> 0x06bc }
            int r6 = r10.A00     // Catch:{ all -> 0x06bc }
            boolean r5 = r10.A03     // Catch:{ all -> 0x06bc }
            X.1ck r7 = new X.1ck     // Catch:{ all -> 0x06bc }
            r7.<init>(r12, r11, r6, r5)     // Catch:{ all -> 0x06bc }
        L_0x01ca:
            r31 = r7
            goto L_0x01f4
        L_0x01cd:
            boolean r5 = r0.containsKey(r12)     // Catch:{ all -> 0x06bc }
            if (r5 == 0) goto L_0x01e2
            java.lang.Object r14 = r0.get(r12)     // Catch:{ all -> 0x06bc }
            X.1ck r14 = (X.C30661ck) r14     // Catch:{ all -> 0x06bc }
        L_0x01d9:
            X.AnonymousClass00B.A06(r14)     // Catch:{ all -> 0x06bc }
            com.whatsapp.jid.UserJid r5 = r14.A03     // Catch:{ all -> 0x06bc }
            r0.put(r5, r14)     // Catch:{ all -> 0x06bc }
            goto L_0x01f1
        L_0x01e2:
            java.util.HashSet r11 = new java.util.HashSet     // Catch:{ all -> 0x06bc }
            r11.<init>()     // Catch:{ all -> 0x06bc }
            int r6 = r10.A00     // Catch:{ all -> 0x06bc }
            boolean r5 = r10.A03     // Catch:{ all -> 0x06bc }
            X.1ck r14 = new X.1ck     // Catch:{ all -> 0x06bc }
            r14.<init>(r12, r11, r6, r5)     // Catch:{ all -> 0x06bc }
            goto L_0x01d9
        L_0x01f1:
            r31 = r7
            r7 = r14
        L_0x01f4:
            X.193 r11 = r1.A0A     // Catch:{ all -> 0x06bc }
            boolean r5 = r10.A05     // Catch:{ all -> 0x06bc }
            r24 = r5
            boolean r5 = r10.A04     // Catch:{ all -> 0x06bc }
            r23 = r5
            r14 = 0
            if (r13 == 0) goto L_0x0271
            X.0sK r15 = r11.A01     // Catch:{ all -> 0x06bc }
            boolean r5 = r15.A0I(r12)     // Catch:{ all -> 0x06bc }
            if (r5 == 0) goto L_0x0241
            com.whatsapp.jid.UserJid r5 = r13.getUserJid()     // Catch:{ all -> 0x06bc }
            boolean r5 = r15.A0I(r5)     // Catch:{ all -> 0x06bc }
            if (r5 != 0) goto L_0x0241
            java.lang.String r6 = "participant-device-store/getParticipantDevices/invalid self device: "
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x06bc }
            r5.<init>(r6)     // Catch:{ all -> 0x06bc }
            r5.append(r13)     // Catch:{ all -> 0x06bc }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x06bc }
            com.whatsapp.util.Log.w((java.lang.String) r5)     // Catch:{ all -> 0x06bc }
            X.0so r10 = r11.A00     // Catch:{ all -> 0x06bc }
            byte r5 = r13.device     // Catch:{ all -> 0x06bc }
            r6 = 0
            if (r5 != 0) goto L_0x022c
            r6 = 1
        L_0x022c:
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x06bc }
            java.lang.String r5 = "participant-devices-invalid-self-devices"
            r10.AcB(r5, r6, r14)     // Catch:{ all -> 0x06bc }
            byte r5 = r13.device     // Catch:{ all -> 0x06bc }
            if (r5 != 0) goto L_0x0271
            r15.A0B()     // Catch:{ all -> 0x06bc }
            X.1Za r13 = r15.A04     // Catch:{ all -> 0x06bc }
            r14 = 1
            if (r13 == 0) goto L_0x0271
        L_0x0241:
            X.1sh r10 = new X.1sh     // Catch:{ all -> 0x06bc }
            r6 = r24
            r5 = r23
            r10.<init>(r13, r6, r5)     // Catch:{ all -> 0x06bc }
            if (r14 == 0) goto L_0x0264
            X.0sq r6 = r11.A04     // Catch:{ all -> 0x06bc }
            r28 = 2
            com.facebook.redex.RunnableRunnableShape0S0400100_I0 r5 = new com.facebook.redex.RunnableRunnableShape0S0400100_I0     // Catch:{ all -> 0x06bc }
            r23 = r5
            r24 = r12
            r25 = r11
            r26 = r8
            r27 = r10
            r29 = r32
            r23.<init>(r24, r25, r26, r27, r28, r29)     // Catch:{ all -> 0x06bc }
            r6.Acl(r5)     // Catch:{ all -> 0x06bc }
        L_0x0264:
            java.util.concurrent.ConcurrentHashMap r7 = r7.A04     // Catch:{ all -> 0x06bc }
            com.whatsapp.jid.DeviceJid r6 = r10.A02     // Catch:{ all -> 0x06bc }
            boolean r5 = r7.containsKey(r6)     // Catch:{ all -> 0x06bc }
            if (r5 != 0) goto L_0x0271
            r7.put(r6, r10)     // Catch:{ all -> 0x06bc }
        L_0x0271:
            r7 = r31
            goto L_0x0167
        L_0x0275:
            if (r7 == 0) goto L_0x02b5
            com.whatsapp.jid.UserJid r10 = r7.A03     // Catch:{ all -> 0x06bc }
            X.0sK r6 = r1.A01     // Catch:{ all -> 0x06bc }
            X.1ZX r5 = r6.A03()     // Catch:{ all -> 0x06bc }
            boolean r5 = r10.equals(r5)     // Catch:{ all -> 0x06bc }
            if (r5 == 0) goto L_0x0290
            X.1ZX r5 = r6.A03()     // Catch:{ all -> 0x06bc }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x06bc }
            X.1ck r5 = (X.C30661ck) r5     // Catch:{ all -> 0x06bc }
            goto L_0x029e
        L_0x0290:
            r6.A0B()     // Catch:{ all -> 0x06bc }
            X.1ZT r5 = r6.A05     // Catch:{ all -> 0x06bc }
            X.AnonymousClass00B.A06(r5)     // Catch:{ all -> 0x06bc }
            java.lang.Object r5 = r0.get(r5)     // Catch:{ all -> 0x06bc }
            X.1ck r5 = (X.C30661ck) r5     // Catch:{ all -> 0x06bc }
        L_0x029e:
            if (r5 != 0) goto L_0x02a5
            r0.put(r10, r7)     // Catch:{ all -> 0x06bc }
            r15 = 1
            goto L_0x02a6
        L_0x02a5:
            r15 = 0
        L_0x02a6:
            X.0sq r6 = r1.A0F     // Catch:{ all -> 0x06bc }
            r14 = 4
            com.facebook.redex.RunnableRunnableShape0S0310000_I0 r5 = new com.facebook.redex.RunnableRunnableShape0S0310000_I0     // Catch:{ all -> 0x06bc }
            r10 = r5
            r11 = r1
            r12 = r8
            r13 = r7
            r10.<init>(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x06bc }
            r6.Acl(r5)     // Catch:{ all -> 0x06bc }
        L_0x02b5:
            r4.close()     // Catch:{ all -> 0x06c3 }
            r22.close()     // Catch:{ all -> 0x06c8 }
            X.0vN r7 = r1.A05     // Catch:{ all -> 0x06c8 }
            long r4 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x06c8 }
            long r4 = r4 - r16
            java.lang.String r6 = "ParticipantUserStore/getGroupParticipantsOptimized"
            r7.A00(r6, r4)     // Catch:{ all -> 0x06c8 }
            X.0sG r4 = r1.A03     // Catch:{ all -> 0x06c8 }
            X.0sH r4 = r4.A09(r8)     // Catch:{ all -> 0x06c8 }
            if (r4 == 0) goto L_0x02dd
            boolean r4 = r4.A0b     // Catch:{ all -> 0x06c8 }
            if (r4 == 0) goto L_0x02dd
            r4 = r34
            boolean r5 = r4.A0H(r8)     // Catch:{ all -> 0x06c8 }
            r4 = 1
            if (r5 != 0) goto L_0x02de
        L_0x02dd:
            r4 = 0
        L_0x02de:
            r10 = 0
            if (r4 == 0) goto L_0x056b
            java.util.ArrayList r20 = new java.util.ArrayList     // Catch:{ all -> 0x06c8 }
            r20.<init>()     // Catch:{ all -> 0x06c8 }
            java.util.ArrayList r19 = new java.util.ArrayList     // Catch:{ all -> 0x06c8 }
            r19.<init>()     // Catch:{ all -> 0x06c8 }
            java.util.Set r4 = r0.keySet()     // Catch:{ all -> 0x06c8 }
            java.util.Iterator r6 = r4.iterator()     // Catch:{ all -> 0x06c8 }
        L_0x02f3:
            boolean r4 = r6.hasNext()     // Catch:{ all -> 0x06c8 }
            if (r4 == 0) goto L_0x030b
            java.lang.Object r5 = r6.next()     // Catch:{ all -> 0x06c8 }
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5     // Catch:{ all -> 0x06c8 }
            boolean r4 = X.C16030sJ.A0O(r5)     // Catch:{ all -> 0x06c8 }
            if (r4 == 0) goto L_0x02f3
            r4 = r20
            r4.add(r5)     // Catch:{ all -> 0x06c8 }
            goto L_0x02f3
        L_0x030b:
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x06c8 }
            r13.<init>()     // Catch:{ all -> 0x06c8 }
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap     // Catch:{ all -> 0x06c8 }
            r11.<init>()     // Catch:{ all -> 0x06c8 }
            java.util.Iterator r7 = r20.iterator()     // Catch:{ all -> 0x06c8 }
        L_0x0319:
            boolean r4 = r7.hasNext()     // Catch:{ all -> 0x06c8 }
            if (r4 == 0) goto L_0x033f
            java.lang.Object r5 = r7.next()     // Catch:{ all -> 0x06c8 }
            com.whatsapp.jid.Jid r5 = (com.whatsapp.jid.Jid) r5     // Catch:{ all -> 0x06c8 }
            X.14v r4 = r2.A01     // Catch:{ all -> 0x06c8 }
            long r5 = r4.A01(r5)     // Catch:{ all -> 0x06c8 }
            java.util.Map r4 = r2.A03     // Catch:{ all -> 0x06c8 }
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x06c8 }
            java.lang.Object r4 = r4.get(r5)     // Catch:{ all -> 0x06c8 }
            if (r4 != 0) goto L_0x033b
            r13.add(r5)     // Catch:{ all -> 0x06c8 }
            goto L_0x0319
        L_0x033b:
            r11.put(r5, r4)     // Catch:{ all -> 0x06c8 }
            goto L_0x0319
        L_0x033f:
            monitor-enter(r2)     // Catch:{ all -> 0x06c8 }
            X.1Cu r6 = r2.A00     // Catch:{ all -> 0x0568 }
            java.util.HashMap r12 = new java.util.HashMap     // Catch:{ all -> 0x0568 }
            r12.<init>()     // Catch:{ all -> 0x0568 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0568 }
            r7.<init>()     // Catch:{ all -> 0x0568 }
            java.util.Iterator r13 = r13.iterator()     // Catch:{ all -> 0x0568 }
        L_0x0350:
            boolean r4 = r13.hasNext()     // Catch:{ all -> 0x0568 }
            if (r4 == 0) goto L_0x0368
            java.lang.Object r4 = r13.next()     // Catch:{ all -> 0x0568 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x0568 }
            long r4 = r4.longValue()     // Catch:{ all -> 0x0568 }
            java.lang.String r4 = java.lang.Long.toString(r4)     // Catch:{ all -> 0x0568 }
            r7.add(r4)     // Catch:{ all -> 0x0568 }
            goto L_0x0350
        L_0x0368:
            java.lang.String[] r4 = X.AnonymousClass01S.A0H     // Catch:{ all -> 0x0568 }
            java.lang.Object[] r5 = r7.toArray(r4)     // Catch:{ all -> 0x0568 }
            X.0tq r4 = r6.A00     // Catch:{ all -> 0x0568 }
            X.0tf r13 = r4.get()     // Catch:{ all -> 0x0568 }
            r4 = 975(0x3cf, float:1.366E-42)
            X.1jh r15 = new X.1jh     // Catch:{ all -> 0x0563 }
            r15.<init>(r5, r4)     // Catch:{ all -> 0x0563 }
        L_0x037b:
            boolean r4 = r15.hasNext()     // Catch:{ all -> 0x0563 }
            if (r4 == 0) goto L_0x03dc
            java.lang.Object r6 = r15.next()     // Catch:{ all -> 0x0563 }
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch:{ all -> 0x0563 }
            X.0tg r5 = r13.A02     // Catch:{ all -> 0x0563 }
            int r14 = r6.length     // Catch:{ all -> 0x0563 }
            java.lang.String r4 = "SELECT lid_row_id, jid_row_id FROM jid_map WHERE jid_row_id IN "
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0563 }
            r7.<init>(r4)     // Catch:{ all -> 0x0563 }
            java.lang.String r4 = X.C34111ji.A00(r14)     // Catch:{ all -> 0x0563 }
            r7.append(r4)     // Catch:{ all -> 0x0563 }
            java.lang.String r4 = " ORDER BY lid_row_id DESC"
            r7.append(r4)     // Catch:{ all -> 0x0563 }
            java.lang.String r4 = r7.toString()     // Catch:{ all -> 0x0563 }
            android.database.Cursor r14 = r5.A08(r4, r6)     // Catch:{ all -> 0x0563 }
            java.lang.String r4 = "lid_row_id"
            int r7 = r14.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x03d5 }
            java.lang.String r4 = "jid_row_id"
            int r6 = r14.getColumnIndexOrThrow(r4)     // Catch:{ all -> 0x03d5 }
        L_0x03b1:
            boolean r4 = r14.moveToNext()     // Catch:{ all -> 0x03d5 }
            if (r4 == 0) goto L_0x03d1
            long r16 = r14.getLong(r7)     // Catch:{ all -> 0x03d5 }
            long r4 = r14.getLong(r6)     // Catch:{ all -> 0x03d5 }
            java.lang.Long r5 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x03d5 }
            boolean r4 = r12.containsKey(r5)     // Catch:{ all -> 0x03d5 }
            if (r4 != 0) goto L_0x03b1
            java.lang.Long r4 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x03d5 }
            r12.put(r5, r4)     // Catch:{ all -> 0x03d5 }
            goto L_0x03b1
        L_0x03d1:
            r14.close()     // Catch:{ all -> 0x0563 }
            goto L_0x037b
        L_0x03d5:
            r0 = move-exception
            if (r14 == 0) goto L_0x03db
            r14.close()     // Catch:{ all -> 0x03db }
        L_0x03db:
            throw r0     // Catch:{ all -> 0x0563 }
        L_0x03dc:
            r13.close()     // Catch:{ all -> 0x0568 }
            java.util.Set r4 = r12.entrySet()     // Catch:{ all -> 0x0568 }
            java.util.Iterator r13 = r4.iterator()     // Catch:{ all -> 0x0568 }
        L_0x03e7:
            boolean r4 = r13.hasNext()     // Catch:{ all -> 0x0568 }
            if (r4 == 0) goto L_0x0411
            java.lang.Object r4 = r13.next()     // Catch:{ all -> 0x0568 }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ all -> 0x0568 }
            java.lang.Object r5 = r4.getKey()     // Catch:{ all -> 0x0568 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ all -> 0x0568 }
            java.lang.Object r4 = r4.getValue()     // Catch:{ all -> 0x0568 }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ all -> 0x0568 }
            X.C18450wi.A09(r4)     // Catch:{ all -> 0x0568 }
            long r6 = r4.longValue()     // Catch:{ all -> 0x0568 }
            X.C18450wi.A09(r5)     // Catch:{ all -> 0x0568 }
            long r4 = r5.longValue()     // Catch:{ all -> 0x0568 }
            r2.A02(r6, r4)     // Catch:{ all -> 0x0568 }
            goto L_0x03e7
        L_0x0411:
            monitor-exit(r2)     // Catch:{ all -> 0x06c8 }
            r11.putAll(r12)     // Catch:{ all -> 0x06c8 }
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap     // Catch:{ all -> 0x06c8 }
            r6.<init>()     // Catch:{ all -> 0x06c8 }
            java.util.Set r4 = r11.entrySet()     // Catch:{ all -> 0x06c8 }
            java.util.Iterator r14 = r4.iterator()     // Catch:{ all -> 0x06c8 }
        L_0x0422:
            boolean r4 = r14.hasNext()     // Catch:{ all -> 0x06c8 }
            if (r4 == 0) goto L_0x0458
            java.lang.Object r13 = r14.next()     // Catch:{ all -> 0x06c8 }
            java.util.Map$Entry r13 = (java.util.Map.Entry) r13     // Catch:{ all -> 0x06c8 }
            X.14v r12 = r2.A01     // Catch:{ all -> 0x06c8 }
            java.lang.Class<X.1ZX> r7 = X.AnonymousClass1ZX.class
            java.lang.Object r4 = r13.getValue()     // Catch:{ all -> 0x06c8 }
            java.lang.Number r4 = (java.lang.Number) r4     // Catch:{ all -> 0x06c8 }
            long r4 = r4.longValue()     // Catch:{ all -> 0x06c8 }
            com.whatsapp.jid.Jid r11 = r12.A07(r7, r4)     // Catch:{ all -> 0x06c8 }
            java.lang.Class<X.1ZT> r7 = X.AnonymousClass1ZT.class
            java.lang.Object r4 = r13.getKey()     // Catch:{ all -> 0x06c8 }
            java.lang.Number r4 = (java.lang.Number) r4     // Catch:{ all -> 0x06c8 }
            long r4 = r4.longValue()     // Catch:{ all -> 0x06c8 }
            com.whatsapp.jid.Jid r4 = r12.A07(r7, r4)     // Catch:{ all -> 0x06c8 }
            if (r4 == 0) goto L_0x0422
            if (r11 == 0) goto L_0x0422
            r6.put(r4, r11)     // Catch:{ all -> 0x06c8 }
            goto L_0x0422
        L_0x0458:
            java.util.Iterator r12 = r20.iterator()     // Catch:{ all -> 0x06c8 }
        L_0x045c:
            boolean r4 = r12.hasNext()     // Catch:{ all -> 0x06c8 }
            if (r4 == 0) goto L_0x0495
            java.lang.Object r11 = r12.next()     // Catch:{ all -> 0x06c8 }
            java.lang.Object r7 = r6.get(r11)     // Catch:{ all -> 0x06c8 }
            com.whatsapp.jid.UserJid r7 = (com.whatsapp.jid.UserJid) r7     // Catch:{ all -> 0x06c8 }
            if (r7 != 0) goto L_0x047c
            java.lang.String r4 = "participant-user-store/substitutePhoneJidsWithLids/could not find lid for jid"
            com.whatsapp.util.Log.e((java.lang.String) r4)     // Catch:{ all -> 0x06c8 }
            X.0so r7 = r1.A00     // Catch:{ all -> 0x06c8 }
            r5 = 0
            java.lang.String r4 = "participant-cag-lid-not-found"
            r7.AcB(r4, r5, r10)     // Catch:{ all -> 0x06c8 }
            goto L_0x045c
        L_0x047c:
            java.lang.Object r4 = r0.get(r11)     // Catch:{ all -> 0x06c8 }
            X.AnonymousClass00B.A06(r4)     // Catch:{ all -> 0x06c8 }
            X.1ck r4 = (X.C30661ck) r4     // Catch:{ all -> 0x06c8 }
            X.1ck r5 = r1.A03(r4, r7)     // Catch:{ all -> 0x06c8 }
            r4 = r19
            r4.add(r5)     // Catch:{ all -> 0x06c8 }
            r0.remove(r11)     // Catch:{ all -> 0x06c8 }
            r0.put(r7, r5)     // Catch:{ all -> 0x06c8 }
            goto L_0x045c
        L_0x0495:
            X.0sq r5 = r1.A0F     // Catch:{ all -> 0x06c8 }
            r16 = 22
            com.facebook.redex.RunnableRunnableShape0S0400000_I0 r4 = new com.facebook.redex.RunnableRunnableShape0S0400000_I0     // Catch:{ all -> 0x06c8 }
            r11 = r4
            r12 = r1
            r13 = r8
            r14 = r20
            r15 = r19
            r11.<init>(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x06c8 }
            r5.Acl(r4)     // Catch:{ all -> 0x06c8 }
            java.util.concurrent.ConcurrentHashMap r6 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x06c8 }
            r6.<init>()     // Catch:{ all -> 0x06c8 }
            java.util.concurrent.ConcurrentHashMap r5 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ all -> 0x06c8 }
            r5.<init>()     // Catch:{ all -> 0x06c8 }
            X.0sK r7 = r1.A01     // Catch:{ all -> 0x06c8 }
            r7.A0B()     // Catch:{ all -> 0x06c8 }
            X.1ZT r4 = r7.A05     // Catch:{ all -> 0x06c8 }
            X.AnonymousClass00B.A06(r4)     // Catch:{ all -> 0x06c8 }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x06c8 }
            X.1ck r4 = (X.C30661ck) r4     // Catch:{ all -> 0x06c8 }
            r15 = 1
            if (r4 == 0) goto L_0x0524
            int r4 = r4.A01     // Catch:{ all -> 0x06c8 }
            if (r4 == 0) goto L_0x0524
        L_0x04c9:
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x06c8 }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x06c8 }
        L_0x04d1:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x06c8 }
            if (r0 == 0) goto L_0x053a
            java.lang.Object r0 = r14.next()     // Catch:{ all -> 0x06c8 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x06c8 }
            java.lang.Object r12 = r0.getKey()     // Catch:{ all -> 0x06c8 }
            com.whatsapp.jid.UserJid r12 = (com.whatsapp.jid.UserJid) r12     // Catch:{ all -> 0x06c8 }
            java.lang.Object r11 = r0.getValue()     // Catch:{ all -> 0x06c8 }
            X.1ck r11 = (X.C30661ck) r11     // Catch:{ all -> 0x06c8 }
            boolean r0 = X.C16030sJ.A0O(r12)     // Catch:{ all -> 0x06c8 }
            r13 = 0
            if (r0 == 0) goto L_0x04fd
            java.lang.String r0 = "participant-user-store/initParticipantsFromStorage/unexpectedly found jid in CAG"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x06c8 }
            X.0so r4 = r1.A00     // Catch:{ all -> 0x06c8 }
            java.lang.String r0 = "participant-cag-has-jid"
            r4.AcB(r0, r13, r10)     // Catch:{ all -> 0x06c8 }
            goto L_0x04d1
        L_0x04fd:
            if (r15 != 0) goto L_0x0503
            int r0 = r11.A01     // Catch:{ all -> 0x06c8 }
            if (r0 == 0) goto L_0x0518
        L_0x0503:
            r0 = r12
            X.1ZX r0 = (X.AnonymousClass1ZX) r0     // Catch:{ all -> 0x06c8 }
            X.1ZT r4 = r2.A01(r0)     // Catch:{ all -> 0x06c8 }
            if (r4 != 0) goto L_0x051c
            java.lang.String r0 = "participant-user-store/initParticipantsFromStorage/could not find jid for lid"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x06c8 }
            X.0so r4 = r1.A00     // Catch:{ all -> 0x06c8 }
            java.lang.String r0 = "participant-cag-jid-not-found"
            r4.AcB(r0, r13, r10)     // Catch:{ all -> 0x06c8 }
        L_0x0518:
            r6.put(r12, r11)     // Catch:{ all -> 0x06c8 }
            goto L_0x04d1
        L_0x051c:
            X.1ck r0 = r1.A03(r11, r4)     // Catch:{ all -> 0x06c8 }
            r5.put(r4, r0)     // Catch:{ all -> 0x06c8 }
            goto L_0x0518
        L_0x0524:
            X.1ZX r4 = r7.A03()     // Catch:{ all -> 0x06c8 }
            X.AnonymousClass00B.A06(r4)     // Catch:{ all -> 0x06c8 }
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x06c8 }
            X.1ck r4 = (X.C30661ck) r4     // Catch:{ all -> 0x06c8 }
            if (r4 == 0) goto L_0x0538
            int r4 = r4.A01     // Catch:{ all -> 0x06c8 }
            if (r4 == 0) goto L_0x0538
            goto L_0x04c9
        L_0x0538:
            r15 = 0
            goto L_0x04c9
        L_0x053a:
            X.1ZX r2 = r7.A04()     // Catch:{ all -> 0x06c8 }
            if (r15 != 0) goto L_0x055e
            boolean r0 = r6.containsKey(r2)     // Catch:{ all -> 0x06c8 }
            if (r0 == 0) goto L_0x055e
            java.lang.Object r0 = r6.get(r2)     // Catch:{ all -> 0x06c8 }
            X.1ck r0 = (X.C30661ck) r0     // Catch:{ all -> 0x06c8 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x06c8 }
            r7.A0B()     // Catch:{ all -> 0x06c8 }
            X.1ZT r2 = r7.A05     // Catch:{ all -> 0x06c8 }
            X.AnonymousClass00B.A06(r2)     // Catch:{ all -> 0x06c8 }
            X.1ck r0 = r1.A03(r0, r2)     // Catch:{ all -> 0x06c8 }
            r5.put(r2, r0)     // Catch:{ all -> 0x06c8 }
        L_0x055e:
            r3.A04 = r5     // Catch:{ all -> 0x06c8 }
            r3.A03 = r6     // Catch:{ all -> 0x06c8 }
            goto L_0x056d
        L_0x0563:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x0567 }
        L_0x0567:
            throw r0     // Catch:{ all -> 0x0568 }
        L_0x0568:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x06c8 }
            throw r0     // Catch:{ all -> 0x06c8 }
        L_0x056b:
            r3.A04 = r0     // Catch:{ all -> 0x06c8 }
        L_0x056d:
            r3.A0G()     // Catch:{ all -> 0x06c8 }
            X.0uz r0 = r3.A04()     // Catch:{ all -> 0x06c8 }
            X.1Ub r2 = r0.iterator()     // Catch:{ all -> 0x06c8 }
        L_0x0578:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x06c8 }
            if (r0 == 0) goto L_0x0589
            java.lang.Object r0 = r2.next()     // Catch:{ all -> 0x06c8 }
            X.1ck r0 = (X.C30661ck) r0     // Catch:{ all -> 0x06c8 }
            r0.A00 = r10     // Catch:{ all -> 0x06c8 }
            int r10 = r10 + 1
            goto L_0x0578
        L_0x0589:
            java.lang.String r2 = "participant-user-store/syncParticipantDevicesWithDeviceStore/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x06c8 }
            r0.<init>(r2)     // Catch:{ all -> 0x06c8 }
            r0.append(r8)     // Catch:{ all -> 0x06c8 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x06c8 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x06c8 }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x06c8 }
            r5.<init>()     // Catch:{ all -> 0x06c8 }
            X.0uz r0 = r3.A03()     // Catch:{ all -> 0x06c8 }
            java.util.HashSet r12 = new java.util.HashSet     // Catch:{ all -> 0x06c8 }
            r12.<init>(r0)     // Catch:{ all -> 0x06c8 }
            X.0z2 r11 = r1.A0D     // Catch:{ all -> 0x06c8 }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ all -> 0x06c8 }
            r7.<init>()     // Catch:{ all -> 0x06c8 }
            java.util.HashSet r6 = new java.util.HashSet     // Catch:{ all -> 0x06c8 }
            r6.<init>(r12)     // Catch:{ all -> 0x06c8 }
            X.0sK r10 = r11.A01     // Catch:{ all -> 0x06c8 }
            r10.A0B()     // Catch:{ all -> 0x06c8 }
            X.1ZT r8 = r10.A05     // Catch:{ all -> 0x06c8 }
            X.1ZX r4 = r10.A03()     // Catch:{ all -> 0x06c8 }
            boolean r0 = r12.contains(r8)     // Catch:{ all -> 0x06c8 }
            if (r0 == 0) goto L_0x05da
            java.util.Set r2 = r11.A0C()     // Catch:{ all -> 0x06c8 }
            r10.A0B()     // Catch:{ all -> 0x06c8 }
            X.1Za r0 = r10.A04     // Catch:{ all -> 0x06c8 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x06c8 }
            r2.add(r0)     // Catch:{ all -> 0x06c8 }
            r7.put(r8, r2)     // Catch:{ all -> 0x06c8 }
            r6.remove(r8)     // Catch:{ all -> 0x06c8 }
        L_0x05da:
            boolean r0 = r12.contains(r4)     // Catch:{ all -> 0x06c8 }
            if (r0 == 0) goto L_0x05f4
            java.util.Set r2 = r11.A0B()     // Catch:{ all -> 0x06c8 }
            X.1ZY r0 = r10.A02()     // Catch:{ all -> 0x06c8 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x06c8 }
            r2.add(r0)     // Catch:{ all -> 0x06c8 }
            r7.put(r4, r2)     // Catch:{ all -> 0x06c8 }
            r6.remove(r4)     // Catch:{ all -> 0x06c8 }
        L_0x05f4:
            X.0xd r0 = r11.A05     // Catch:{ all -> 0x06c8 }
            X.19P r0 = r0.A05     // Catch:{ all -> 0x06c8 }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ all -> 0x06c8 }
            r8.<init>()     // Catch:{ all -> 0x06c8 }
            java.util.Map r0 = r0.A00(r6)     // Catch:{ all -> 0x06c8 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x06c8 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x06c8 }
        L_0x0609:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x06c8 }
            if (r0 == 0) goto L_0x0627
            java.lang.Object r0 = r4.next()     // Catch:{ all -> 0x06c8 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x06c8 }
            java.lang.Object r2 = r0.getKey()     // Catch:{ all -> 0x06c8 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x06c8 }
            X.0vs r0 = (X.C17930vs) r0     // Catch:{ all -> 0x06c8 }
            X.0uz r0 = r0.keySet()     // Catch:{ all -> 0x06c8 }
            r8.put(r2, r0)     // Catch:{ all -> 0x06c8 }
            goto L_0x0609
        L_0x0627:
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x06c8 }
        L_0x062b:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x06c8 }
            if (r0 == 0) goto L_0x065f
            java.lang.Object r4 = r6.next()     // Catch:{ all -> 0x06c8 }
            com.whatsapp.jid.Jid r4 = (com.whatsapp.jid.Jid) r4     // Catch:{ all -> 0x06c8 }
            boolean r0 = r8.containsKey(r4)     // Catch:{ all -> 0x06c8 }
            if (r0 == 0) goto L_0x0659
            java.lang.Object r0 = r8.get(r4)     // Catch:{ all -> 0x06c8 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x06c8 }
            java.util.Collection r0 = (java.util.Collection) r0     // Catch:{ all -> 0x06c8 }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x06c8 }
            r2.<init>(r0)     // Catch:{ all -> 0x06c8 }
        L_0x064b:
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.of(r4)     // Catch:{ all -> 0x06c8 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ all -> 0x06c8 }
            r2.add(r0)     // Catch:{ all -> 0x06c8 }
            r7.put(r4, r2)     // Catch:{ all -> 0x06c8 }
            goto L_0x062b
        L_0x0659:
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x06c8 }
            r2.<init>()     // Catch:{ all -> 0x06c8 }
            goto L_0x064b
        L_0x065f:
            X.0pd r4 = r1.A0E     // Catch:{ all -> 0x06c8 }
            r2 = 1108(0x454, float:1.553E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x06c8 }
            boolean r6 = r4.A0E(r0, r2)     // Catch:{ all -> 0x06c8 }
            java.util.Set r0 = r7.entrySet()     // Catch:{ all -> 0x06c8 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ all -> 0x06c8 }
        L_0x0671:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x06c8 }
            if (r0 == 0) goto L_0x06a9
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x06c8 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x06c8 }
            java.lang.Object r4 = r0.getKey()     // Catch:{ all -> 0x06c8 }
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4     // Catch:{ all -> 0x06c8 }
            java.lang.Object r2 = r0.getValue()     // Catch:{ all -> 0x06c8 }
            java.util.Collection r2 = (java.util.Collection) r2     // Catch:{ all -> 0x06c8 }
            boolean r0 = r3.A0O(r4)     // Catch:{ all -> 0x06c8 }
            if (r0 == 0) goto L_0x0671
            X.0uz r0 = X.C17380uz.copyOf((java.util.Collection) r2)     // Catch:{ all -> 0x06c8 }
            X.1pB r2 = r3.A08(r0, r4, r6)     // Catch:{ all -> 0x06c8 }
            boolean r0 = r2.A00     // Catch:{ all -> 0x06c8 }
            if (r0 != 0) goto L_0x069f
            boolean r0 = r2.A01     // Catch:{ all -> 0x06c8 }
            if (r0 == 0) goto L_0x0671
        L_0x069f:
            boolean r0 = r2.A02     // Catch:{ all -> 0x06c8 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x06c8 }
            r5.put(r4, r0)     // Catch:{ all -> 0x06c8 }
            goto L_0x0671
        L_0x06a9:
            boolean r0 = r5.isEmpty()     // Catch:{ all -> 0x06c8 }
            if (r0 != 0) goto L_0x06ca
            X.0sq r4 = r1.A0F     // Catch:{ all -> 0x06c8 }
            r2 = 8
            com.facebook.redex.RunnableRunnableShape1S0300000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape1S0300000_I0_1     // Catch:{ all -> 0x06c8 }
            r0.<init>(r1, r3, r5, r2)     // Catch:{ all -> 0x06c8 }
            r4.Acl(r0)     // Catch:{ all -> 0x06c8 }
            goto L_0x06ca
        L_0x06bc:
            r0 = move-exception
            if (r4 == 0) goto L_0x06c2
            r4.close()     // Catch:{ all -> 0x06c2 }
        L_0x06c2:
            throw r0     // Catch:{ all -> 0x06c3 }
        L_0x06c3:
            r0 = move-exception
            r22.close()     // Catch:{ all -> 0x06c7 }
        L_0x06c7:
            throw r0     // Catch:{ all -> 0x06c8 }
        L_0x06c8:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x06d1 }
        L_0x06ca:
            r0 = r35
            r0.put(r9, r3)     // Catch:{ all -> 0x06d1 }
        L_0x06cf:
            monitor-exit(r18)     // Catch:{ all -> 0x06d1 }
            return r3
        L_0x06d1:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x06d1 }
            throw r0
        L_0x06d4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17310us.A04(X.0sN):X.1cE");
    }

    public final UserJid A05(UserJid userJid) {
        if (userJid.equals(C34091jg.A00)) {
            StringBuilder sb = new StringBuilder("participant-user-store/sanitizeParticipantJid/my jid = ");
            C16040sK r1 = this.A01;
            r1.A0B();
            sb.append(r1.A05);
            Log.i(sb.toString());
            r1.A0B();
            AnonymousClass1ZT r4 = r1.A05;
            AnonymousClass00B.A06(r4);
            return r4;
        } else if (!userJid.equals(C34981lB.A00)) {
            return userJid;
        } else {
            StringBuilder sb2 = new StringBuilder("participant-user-store/sanitizeParticipantJid/my lid jid = ");
            C16040sK r12 = this.A01;
            sb2.append(r12.A03());
            Log.i(sb2.toString());
            return r12.A03();
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0083 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A06(X.C16060sN r20) {
        /*
            r19 = this;
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r2 = r19
            X.14v r7 = r2.A08
            r0 = r20
            long r0 = r7.A01(r0)
            java.lang.String r6 = java.lang.String.valueOf(r0)
            X.0tq r0 = r2.A09
            X.0tf r9 = r0.get()
            X.0tg r5 = r9.A02     // Catch:{ all -> 0x0084 }
            java.lang.String r4 = "SELECT user, server, agent, device, type, raw_string, user_jid_row_id FROM group_participant_user JOIN jid ON user_jid_row_id = jid._id WHERE group_jid_row_id = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0084 }
            r0 = 0
            r1[r0] = r6     // Catch:{ all -> 0x0084 }
            android.database.Cursor r8 = r5.A08(r4, r1)     // Catch:{ all -> 0x0084 }
            java.lang.String r0 = "user"
            int r11 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x007d }
            java.lang.String r0 = "server"
            int r12 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x007d }
            java.lang.String r0 = "agent"
            int r13 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x007d }
            java.lang.String r0 = "device"
            int r14 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x007d }
            java.lang.String r0 = "type"
            int r15 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x007d }
            java.lang.String r0 = "raw_string"
            int r16 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x007d }
            java.lang.String r0 = "user_jid_row_id"
            int r1 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x007d }
        L_0x0055:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x007d }
            if (r0 == 0) goto L_0x0076
            java.lang.Class<com.whatsapp.jid.UserJid> r10 = com.whatsapp.jid.UserJid.class
            long r17 = r8.getLong(r1)     // Catch:{ all -> 0x007d }
            com.whatsapp.jid.Jid r0 = r7.A06(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x007d }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x007d }
            if (r0 != 0) goto L_0x006a
            goto L_0x006f
        L_0x006a:
            com.whatsapp.jid.UserJid r0 = r2.A05(r0)     // Catch:{ all -> 0x007d }
            goto L_0x0070
        L_0x006f:
            r0 = 0
        L_0x0070:
            if (r0 == 0) goto L_0x0055
            r3.add(r0)     // Catch:{ all -> 0x007d }
            goto L_0x0055
        L_0x0076:
            r8.close()     // Catch:{ all -> 0x0084 }
            r9.close()
            return r3
        L_0x007d:
            r0 = move-exception
            if (r8 == 0) goto L_0x0083
            r8.close()     // Catch:{ all -> 0x0083 }
        L_0x0083:
            throw r0     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0088 }
        L_0x0088:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17310us.A06(X.0sN):java.util.Set");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Set A07(com.whatsapp.jid.UserJid r9) {
        /*
            r8 = this;
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            X.0tq r0 = r8.A09
            X.0tf r5 = r0.get()
            X.0tg r7 = r5.A02     // Catch:{ all -> 0x004f }
            java.lang.String r4 = "SELECT group_jid_row_id FROM group_participant_user WHERE user_jid_row_id = ?"
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch:{ all -> 0x004f }
            r2 = 0
            long r0 = r8.A02(r9)     // Catch:{ all -> 0x004f }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x004f }
            r3[r2] = r0     // Catch:{ all -> 0x004f }
            android.database.Cursor r4 = r7.A08(r4, r3)     // Catch:{ all -> 0x004f }
        L_0x0021:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0041
            java.lang.String r0 = "group_jid_row_id"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0048 }
            long r2 = r4.getLong(r0)     // Catch:{ all -> 0x0048 }
            X.14v r1 = r8.A08     // Catch:{ all -> 0x0048 }
            java.lang.Class<X.0sN> r0 = X.C16060sN.class
            com.whatsapp.jid.Jid r0 = r1.A07(r0, r2)     // Catch:{ all -> 0x0048 }
            X.0sN r0 = (X.C16060sN) r0     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0021
            r6.add(r0)     // Catch:{ all -> 0x0048 }
            goto L_0x0021
        L_0x0041:
            r4.close()     // Catch:{ all -> 0x004f }
            r5.close()
            return r6
        L_0x0048:
            r0 = move-exception
            if (r4 == 0) goto L_0x004e
            r4.close()     // Catch:{ all -> 0x004e }
        L_0x004e:
            throw r0     // Catch:{ all -> 0x004f }
        L_0x004f:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0053 }
        L_0x0053:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17310us.A07(com.whatsapp.jid.UserJid):java.util.Set");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x00a5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(X.C30661ck r12, X.C16060sN r13) {
        /*
            r11 = this;
            java.lang.String r0 = "participant-user-store/updateGroupParticipant/"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r7 = r13
            r1.append(r13)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.jid.UserJid r8 = r12.A03
            long r9 = r11.A02(r8)
            X.14v r0 = r11.A08
            long r0 = r0.A01(r13)
            java.lang.String r3 = java.lang.String.valueOf(r0)
            java.lang.String r2 = java.lang.String.valueOf(r9)
            r0 = 4
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>(r0)
            java.lang.String r0 = "group_jid_row_id"
            r5.put(r0, r3)
            java.lang.String r0 = "user_jid_row_id"
            r5.put(r0, r2)
            int r0 = r12.A01
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "rank"
            r5.put(r0, r1)
            boolean r0 = r12.A02
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "pending"
            r5.put(r0, r1)
            r0 = 2
            java.lang.String[] r6 = new java.lang.String[r0]
            r0 = 0
            r6[r0] = r3
            r0 = 1
            r6[r0] = r2
            X.0tq r0 = r11.A09
            X.0tf r1 = r0.A02()
            X.1cj r4 = r1.A00()     // Catch:{ all -> 0x00a6 }
            X.0tg r3 = r1.A02     // Catch:{ all -> 0x00a1 }
            java.lang.String r2 = "group_participant_user"
            java.lang.String r0 = "group_jid_row_id = ? AND user_jid_row_id = ?"
            int r0 = r3.A00(r2, r5, r0, r6)     // Catch:{ all -> 0x00a1 }
            if (r0 == 0) goto L_0x0087
            X.193 r5 = r11.A0A     // Catch:{ all -> 0x00a1 }
            java.util.concurrent.ConcurrentHashMap r0 = r12.A04     // Catch:{ all -> 0x00a1 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x00a1 }
            X.0uz r6 = X.C17380uz.copyOf((java.util.Collection) r0)     // Catch:{ all -> 0x00a1 }
            r5.A01(r6, r7, r8, r9)     // Catch:{ all -> 0x00a1 }
        L_0x0083:
            r4.A00()     // Catch:{ all -> 0x00a1 }
            goto L_0x009a
        L_0x0087:
            r3.A02(r5, r2)     // Catch:{ all -> 0x00a1 }
            X.193 r5 = r11.A0A     // Catch:{ all -> 0x00a1 }
            java.util.concurrent.ConcurrentHashMap r0 = r12.A04     // Catch:{ all -> 0x00a1 }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x00a1 }
            X.0uz r6 = X.C17380uz.copyOf((java.util.Collection) r0)     // Catch:{ all -> 0x00a1 }
            r5.A00(r6, r7, r8, r9)     // Catch:{ all -> 0x00a1 }
            goto L_0x0083
        L_0x009a:
            r4.close()     // Catch:{ all -> 0x00a6 }
            r1.close()
            return
        L_0x00a1:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            throw r0     // Catch:{ all -> 0x00a6 }
        L_0x00a6:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x00aa }
        L_0x00aa:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17310us.A08(X.1ck, X.0sN):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x003f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09(X.C30361cE r5) {
        /*
            r4 = this;
            java.lang.String r1 = "participant-user-store/resetSentSenderKeyForAllParticipants/"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0sN r3 = r5.A06
            X.0tq r0 = r4.A09
            X.0tf r2 = r0.A02()
            X.1cj r1 = r2.A00()     // Catch:{ all -> 0x0040 }
            X.193 r0 = r4.A0A     // Catch:{ all -> 0x003b }
            r0.A02(r3)     // Catch:{ all -> 0x003b }
            r4.A0A(r5)     // Catch:{ all -> 0x003b }
            r1.A00()     // Catch:{ all -> 0x003b }
            r1.close()     // Catch:{ all -> 0x0040 }
            r2.close()
            X.0y7 r0 = r4.A02
            X.1nu r1 = new X.1nu
            r1.<init>(r3)
            X.1mi r0 = r0.A01
            r0.A01(r1)
            return
        L_0x003b:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x003f }
        L_0x003f:
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0044 }
        L_0x0044:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17310us.A09(X.1cE):void");
    }

    public final void A0A(C30361cE r3) {
        C28031Ub it = r3.A04().iterator();
        while (it.hasNext()) {
            A01((C30661ck) it.next());
        }
    }

    public final void A0B(C30361cE r8, UserJid userJid, boolean z2) {
        UserJid userJid2 = userJid;
        C30661ck A052 = r8.A05(userJid);
        C16060sN r3 = r8.A06;
        if (A052 != null) {
            this.A0A.A01(C17380uz.copyOf(A052.A04.values()), r3, userJid2, A02(userJid));
        }
        if (z2) {
            this.A0A.A02(r3);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0047 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(X.C15810rt r6, X.C16060sN r7, java.util.Collection r8) {
        /*
            r5 = this;
            X.1cE r4 = r5.A04(r7)
            X.0sN r1 = r4.A06
            X.0sG r0 = r5.A03
            X.0sH r0 = r0.A09(r1)
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.A0b
            if (r0 == 0) goto L_0x0018
            boolean r0 = r6.A0H(r1)
            if (r0 != 0) goto L_0x0050
        L_0x0018:
            X.0tq r0 = r5.A09
            X.0tf r3 = r0.A02()
            X.1cj r2 = r3.A00()     // Catch:{ all -> 0x0048 }
            java.util.Iterator r1 = r8.iterator()     // Catch:{ all -> 0x0043 }
        L_0x0026:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x003c
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0043 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x0043 }
            X.1ck r0 = r4.A05(r0)     // Catch:{ all -> 0x0043 }
            if (r0 == 0) goto L_0x0026
            r5.A08(r0, r7)     // Catch:{ all -> 0x0043 }
            goto L_0x0026
        L_0x003c:
            r2.A00()     // Catch:{ all -> 0x0043 }
            r2.close()     // Catch:{ all -> 0x0048 }
            goto L_0x004d
        L_0x0043:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0047 }
        L_0x0047:
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x004c }
        L_0x004c:
            throw r0
        L_0x004d:
            r3.close()
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17310us.A0C(X.0rt, X.0sN, java.util.Collection):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0038 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(X.C16060sN r6, java.util.List r7) {
        /*
            r5 = this;
            X.0tq r0 = r5.A09
            X.0tf r4 = r0.A02()
            X.1cj r3 = r4.A00()     // Catch:{ all -> 0x0039 }
            r2 = 0
            java.util.Iterator r1 = r7.iterator()     // Catch:{ all -> 0x0034 }
        L_0x000f:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x0023
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0034 }
            com.whatsapp.jid.UserJid r0 = (com.whatsapp.jid.UserJid) r0     // Catch:{ all -> 0x0034 }
            boolean r0 = r5.A0G(r6, r0)     // Catch:{ all -> 0x0034 }
            if (r0 == 0) goto L_0x000f
            r2 = 1
            goto L_0x000f
        L_0x0023:
            if (r2 == 0) goto L_0x002a
            X.193 r0 = r5.A0A     // Catch:{ all -> 0x0034 }
            r0.A02(r6)     // Catch:{ all -> 0x0034 }
        L_0x002a:
            r3.A00()     // Catch:{ all -> 0x0034 }
            r3.close()     // Catch:{ all -> 0x0039 }
            r4.close()
            return
        L_0x0034:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0038 }
        L_0x0038:
            throw r0     // Catch:{ all -> 0x0039 }
        L_0x0039:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x003d }
        L_0x003d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17310us.A0D(X.0sN, java.util.List):void");
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x002c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(com.whatsapp.jid.UserJid r5, java.util.Set r6, boolean r7) {
        /*
            r4 = this;
            X.0tq r0 = r4.A09
            X.0tf r3 = r0.A02()
            X.1cj r2 = r3.A00()     // Catch:{ all -> 0x002d }
            java.util.Iterator r1 = r6.iterator()     // Catch:{ all -> 0x0028 }
        L_0x000e:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0028 }
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0028 }
            X.1cE r0 = (X.C30361cE) r0     // Catch:{ all -> 0x0028 }
            r4.A0B(r0, r5, r7)     // Catch:{ all -> 0x0028 }
            goto L_0x000e
        L_0x001e:
            r2.A00()     // Catch:{ all -> 0x0028 }
            r2.close()     // Catch:{ all -> 0x002d }
            r3.close()
            return
        L_0x0028:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x002c }
        L_0x002c:
            throw r0     // Catch:{ all -> 0x002d }
        L_0x002d:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0031 }
        L_0x0031:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17310us.A0E(com.whatsapp.jid.UserJid, java.util.Set, boolean):void");
    }

    public final boolean A0F(C16060sN r9, long j2) {
        StringBuilder sb = new StringBuilder("participant-user-store/removeGroupParticipant/");
        sb.append(r9);
        sb.append(" ");
        sb.append(j2);
        Log.i(sb.toString());
        String valueOf = String.valueOf(this.A08.A01(r9));
        C16800tf A022 = this.A09.A02();
        try {
            boolean z2 = false;
            if (A022.A02.A01("group_participant_user", "group_jid_row_id = ? AND user_jid_row_id = ?", new String[]{valueOf, String.valueOf(j2)}) != 0) {
                z2 = true;
            }
            A022.close();
            return z2;
        } catch (Throwable unused) {
        }
        throw th;
    }

    public boolean A0G(C16060sN r3, UserJid userJid) {
        StringBuilder sb = new StringBuilder("participant-user-store/removeGroupParticipant/");
        sb.append(r3);
        sb.append(" ");
        sb.append(userJid);
        Log.i(sb.toString());
        return A0F(r3, A02(userJid));
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0033 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0H(com.whatsapp.jid.UserJid r8, java.lang.String r9) {
        /*
            r7 = this;
            r6 = 0
            if (r8 != 0) goto L_0x0004
            return r6
        L_0x0004:
            long r0 = r7.A02(r8)
            java.lang.String r5 = java.lang.String.valueOf(r0)
            X.0tq r0 = r7.A09
            X.0tf r4 = r0.get()
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = "SELECT _id FROM group_participant_user WHERE group_jid_row_id = ? AND user_jid_row_id = ?"
            r0 = 2
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0034 }
            r1[r6] = r9     // Catch:{ all -> 0x0034 }
            r0 = 1
            r1[r0] = r5     // Catch:{ all -> 0x0034 }
            android.database.Cursor r1 = r3.A08(r2, r1)     // Catch:{ all -> 0x0034 }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x002d }
            r1.close()     // Catch:{ all -> 0x0034 }
            r4.close()
            return r0
        L_0x002d:
            r0 = move-exception
            if (r1 == 0) goto L_0x0033
            r1.close()     // Catch:{ all -> 0x0033 }
        L_0x0033:
            throw r0     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0038 }
        L_0x0038:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17310us.A0H(com.whatsapp.jid.UserJid, java.lang.String):boolean");
    }
}
