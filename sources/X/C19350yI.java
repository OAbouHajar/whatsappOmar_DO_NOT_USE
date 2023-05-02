package X;

import com.obwhatsapp.data.device.DeviceChangeManager;

/* renamed from: X.0yI  reason: invalid class name and case insensitive filesystem */
public class C19350yI {
    public final AnonymousClass19T A00;
    public final C16040sK A01;
    public final C18020w1 A02;
    public final C19000xb A03;
    public final C16000sG A04;
    public final C17030uP A05;
    public final C15800rs A06;
    public final C16440t3 A07;
    public final C15860rz A08;
    public final C208211s A09;
    public final C16460t6 A0A;
    public final C16070sO A0B;
    public final AnonymousClass16V A0C;
    public final AnonymousClass1HF A0D;
    public final DeviceChangeManager A0E;
    public final AnonymousClass178 A0F;
    public final C19810z2 A0G;
    public final C14710pd A0H;
    public final C19430yQ A0I;
    public final AnonymousClass1HG A0J;
    public final AnonymousClass122 A0K;

    public C19350yI(AnonymousClass19T r2, C16040sK r3, C18020w1 r4, C19000xb r5, C16000sG r6, C17030uP r7, C15800rs r8, C16440t3 r9, C15860rz r10, C208211s r11, C16460t6 r12, C16070sO r13, AnonymousClass16V r14, AnonymousClass1HF r15, DeviceChangeManager deviceChangeManager, AnonymousClass178 r17, C19810z2 r18, C14710pd r19, C19430yQ r20, AnonymousClass1HG r21, AnonymousClass122 r22) {
        this.A07 = r9;
        this.A0H = r19;
        this.A01 = r3;
        this.A03 = r5;
        this.A02 = r4;
        this.A0D = r15;
        this.A04 = r6;
        this.A0A = r12;
        this.A0G = r18;
        this.A00 = r2;
        this.A09 = r11;
        this.A0E = deviceChangeManager;
        this.A05 = r7;
        this.A08 = r10;
        this.A06 = r8;
        this.A0C = r14;
        this.A0K = r22;
        this.A0I = r20;
        this.A0B = r13;
        this.A0F = r17;
        this.A0J = r21;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Missing exception handler attribute for start block: B:145:0x03a6 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:150:0x03ab */
    /* JADX WARNING: Missing exception handler attribute for start block: B:155:0x03b0 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:160:0x03b5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:191:0x0449 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:239:0x0522 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:244:0x0527 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:249:0x052c */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02bc  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02da  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0539  */
    /* JADX WARNING: Removed duplicated region for block: B:339:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x016c A[Catch:{ all -> 0x0285 }, LOOP:2: B:55:0x0166->B:57:0x016c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01ad A[Catch:{ all -> 0x052d, all -> 0x0531 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0232 A[Catch:{ all -> 0x027f }, LOOP:5: B:82:0x022c->B:84:0x0232, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0292  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A00(X.C19350yI r17, com.whatsapp.jid.DeviceJid r18, boolean r19) {
        /*
            java.lang.String r0 = "IdentityChangeManager/handleIdentityChangeSecurityNotification"
            X.1Zf r3 = new X.1Zf
            r3.<init>((java.lang.String) r0)
            r1 = r18
            byte r0 = r1.device     // Catch:{ all -> 0x0639 }
            r2 = 0
            if (r0 != 0) goto L_0x000f
            r2 = 1
        L_0x000f:
            r0 = r17
            if (r2 != 0) goto L_0x003f
            if (r19 != 0) goto L_0x0115
            X.0sK r4 = r0.A01     // Catch:{ all -> 0x0639 }
            com.whatsapp.jid.UserJid r2 = r1.getUserJid()     // Catch:{ all -> 0x0639 }
            boolean r2 = r4.A0I(r2)     // Catch:{ all -> 0x0639 }
            if (r2 != 0) goto L_0x003f
            com.obwhatsapp.data.device.DeviceChangeManager r4 = r0.A0E     // Catch:{ all -> 0x0639 }
            com.whatsapp.jid.UserJid r8 = r1.getUserJid()     // Catch:{ all -> 0x0639 }
            X.0z2 r2 = r0.A0G     // Catch:{ all -> 0x0639 }
            java.util.Set r2 = r2.A0D(r8)     // Catch:{ all -> 0x0639 }
            X.0uz r5 = X.C17380uz.copyOf((java.util.Collection) r2)     // Catch:{ all -> 0x0639 }
            X.0uz r6 = X.C17380uz.of(r1)     // Catch:{ all -> 0x0639 }
            X.0uz r7 = X.C17380uz.of(r1)     // Catch:{ all -> 0x0639 }
            r9 = 0
            r4.A02(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x0639 }
            goto L_0x0115
        L_0x003f:
            X.0rz r2 = r0.A08     // Catch:{ all -> 0x0639 }
            boolean r12 = r2.A1Y()     // Catch:{ all -> 0x0639 }
            com.whatsapp.jid.UserJid r2 = r1.getUserJid()     // Catch:{ all -> 0x0639 }
            if (r12 == 0) goto L_0x007d
            X.0uP r4 = r0.A05     // Catch:{ all -> 0x0639 }
            X.1Vq r4 = r4.A00(r2)     // Catch:{ all -> 0x0639 }
            r7 = 1
            if (r4 == 0) goto L_0x005e
            int r5 = r4.A01     // Catch:{ all -> 0x0639 }
            int r4 = r4.A00     // Catch:{ all -> 0x0639 }
            int r4 = X.C47402Iv.A00(r5, r4)     // Catch:{ all -> 0x0639 }
            if (r4 != r7) goto L_0x007d
        L_0x005e:
            X.0t6 r6 = r0.A0A     // Catch:{ all -> 0x0639 }
            X.122 r5 = r0.A0K     // Catch:{ all -> 0x0639 }
            X.0t3 r4 = r0.A07     // Catch:{ all -> 0x0639 }
            long r17 = r4.A00()     // Catch:{ all -> 0x0639 }
            r15 = 0
            X.18b r4 = r5.A03     // Catch:{ all -> 0x0639 }
            X.1Vw r14 = r4.A02(r2, r7)     // Catch:{ all -> 0x0639 }
            X.0so r13 = r5.A00     // Catch:{ all -> 0x0639 }
            r16 = 18
            X.1WU r4 = X.AnonymousClass122.A00(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0639 }
            r4.A0b(r15)     // Catch:{ all -> 0x0639 }
            r6.A0W(r4)     // Catch:{ all -> 0x0639 }
        L_0x007d:
            X.0rs r4 = r0.A06     // Catch:{ all -> 0x0639 }
            java.util.List r4 = r4.A07()     // Catch:{ all -> 0x0639 }
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ all -> 0x0639 }
            r7.<init>(r4)     // Catch:{ all -> 0x0639 }
            X.0sO r4 = r0.A0B     // Catch:{ all -> 0x0639 }
            X.0us r6 = r4.A07     // Catch:{ all -> 0x0639 }
            java.util.Set r4 = r6.A07(r2)     // Catch:{ all -> 0x0639 }
            java.util.Iterator r11 = r4.iterator()     // Catch:{ all -> 0x0639 }
        L_0x0094:
            boolean r4 = r11.hasNext()     // Catch:{ all -> 0x0639 }
            if (r4 == 0) goto L_0x0115
            java.lang.Object r10 = r11.next()     // Catch:{ all -> 0x0639 }
            X.0sN r10 = (X.C16060sN) r10     // Catch:{ all -> 0x0639 }
            if (r12 == 0) goto L_0x0094
            X.1cE r5 = r6.A04(r10)     // Catch:{ all -> 0x0639 }
            boolean r4 = r10 instanceof com.whatsapp.jid.GroupJid     // Catch:{ all -> 0x0639 }
            if (r4 != 0) goto L_0x00ae
            boolean r4 = r10 instanceof X.C34841kx     // Catch:{ all -> 0x0639 }
            if (r4 == 0) goto L_0x0094
        L_0x00ae:
            boolean r4 = r7.contains(r10)     // Catch:{ all -> 0x0639 }
            if (r4 == 0) goto L_0x0094
            X.0uz r4 = r5.A02()     // Catch:{ all -> 0x0639 }
            X.0wc r9 = new X.0wc     // Catch:{ all -> 0x0639 }
            r9.<init>()     // Catch:{ all -> 0x0639 }
            X.1Ub r8 = r4.iterator()     // Catch:{ all -> 0x0639 }
        L_0x00c1:
            boolean r4 = r8.hasNext()     // Catch:{ all -> 0x0639 }
            if (r4 == 0) goto L_0x00d7
            java.lang.Object r5 = r8.next()     // Catch:{ all -> 0x0639 }
            com.whatsapp.jid.Jid r5 = (com.whatsapp.jid.Jid) r5     // Catch:{ all -> 0x0639 }
            boolean r4 = X.C16030sJ.A0M(r5)     // Catch:{ all -> 0x0639 }
            if (r4 != 0) goto L_0x00c1
            r9.add((java.lang.Object) r5)     // Catch:{ all -> 0x0639 }
            goto L_0x00c1
        L_0x00d7:
            X.0uz r5 = r9.build()     // Catch:{ all -> 0x0639 }
            boolean r4 = r5.contains(r2)     // Catch:{ all -> 0x0639 }
            if (r4 == 0) goto L_0x0094
            X.0sK r4 = r0.A01     // Catch:{ all -> 0x0639 }
            r4.A0B()     // Catch:{ all -> 0x0639 }
            X.1ZT r4 = r4.A05     // Catch:{ all -> 0x0639 }
            boolean r4 = r5.contains(r4)     // Catch:{ all -> 0x0639 }
            if (r4 != 0) goto L_0x00f4
            boolean r4 = X.C16030sJ.A0G(r10)     // Catch:{ all -> 0x0639 }
            if (r4 == 0) goto L_0x0094
        L_0x00f4:
            X.0t6 r5 = r0.A0A     // Catch:{ all -> 0x0639 }
            X.122 r9 = r0.A0K     // Catch:{ all -> 0x0639 }
            X.0t3 r4 = r0.A07     // Catch:{ all -> 0x0639 }
            long r17 = r4.A00()     // Catch:{ all -> 0x0639 }
            X.18b r8 = r9.A03     // Catch:{ all -> 0x0639 }
            r4 = 1
            X.1Vw r14 = r8.A02(r10, r4)     // Catch:{ all -> 0x0639 }
            X.0so r13 = r9.A00     // Catch:{ all -> 0x0639 }
            r16 = 18
            r15 = 0
            X.1WU r4 = X.AnonymousClass122.A00(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x0639 }
            r4.A0b(r2)     // Catch:{ all -> 0x0639 }
            r5.A0W(r4)     // Catch:{ all -> 0x0639 }
            goto L_0x0094
        L_0x0115:
            r3.A01()
            com.whatsapp.jid.UserJid r14 = r1.getUserJid()
            byte r3 = r1.device
            r2 = 0
            if (r3 != 0) goto L_0x0122
            r2 = 1
        L_0x0122:
            r13 = 1
            if (r2 == 0) goto L_0x02b8
            X.0sK r2 = r0.A01
            boolean r2 = r2.A0I(r14)
            if (r2 != 0) goto L_0x02b8
            X.0z2 r2 = r0.A0G
            r2.A0H(r14, r13, r13)
            X.1HF r9 = r0.A0D
            X.16V r2 = r9.A05
            com.whatsapp.jid.DeviceJid r4 = r14.getPrimaryDevice()
            X.17B r12 = r2.A02
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            X.0tq r2 = r12.A04
            r18 = r2
            X.0tf r11 = r18.get()
            X.0tg r10 = r11.A02     // Catch:{ all -> 0x052d }
            java.lang.String r8 = "SELECT message_row_id FROM receipt_device WHERE receipt_device_jid_row_id = ? AND receipt_device_timestamp is NULL"
            java.lang.String[] r6 = new java.lang.String[r13]     // Catch:{ all -> 0x052d }
            r15 = 0
            X.14v r7 = r12.A02     // Catch:{ all -> 0x052d }
            long r4 = r7.A01(r4)     // Catch:{ all -> 0x052d }
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x052d }
            r6[r15] = r2     // Catch:{ all -> 0x052d }
            android.database.Cursor r6 = r10.A08(r8, r6)     // Catch:{ all -> 0x052d }
            java.lang.String r8 = "message_row_id"
            int r10 = r6.getColumnIndex(r8)     // Catch:{ all -> 0x0285 }
        L_0x0166:
            boolean r2 = r6.moveToNext()     // Catch:{ all -> 0x0285 }
            if (r2 == 0) goto L_0x0178
            long r4 = r6.getLong(r10)     // Catch:{ all -> 0x0285 }
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0285 }
            r3.add(r2)     // Catch:{ all -> 0x0285 }
            goto L_0x0166
        L_0x0178:
            r6.close()     // Catch:{ all -> 0x052d }
            r11.close()
            X.1Pq r2 = r9.A06
            java.util.HashSet r10 = new java.util.HashSet
            r10.<init>()
            X.14v r4 = r2.A01
            long r4 = r4.A01(r14)
            java.lang.String r15 = java.lang.String.valueOf(r4)
            java.lang.String[] r9 = X.AnonymousClass01S.A0H
            java.lang.Object[] r3 = r3.toArray(r9)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            X.0tq r2 = r2.A02
            X.0tf r11 = r2.get()
            r2 = 975(0x3cf, float:1.366E-42)
            X.1jh r5 = new X.1jh     // Catch:{ all -> 0x052d }
            r5.<init>(r3, r2)     // Catch:{ all -> 0x052d }
        L_0x01a7:
            boolean r2 = r5.hasNext()     // Catch:{ all -> 0x052d }
            if (r2 == 0) goto L_0x0203
            java.lang.Object r2 = r5.next()     // Catch:{ all -> 0x052d }
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ all -> 0x052d }
            r6.clear()     // Catch:{ all -> 0x052d }
            r6.add(r15)     // Catch:{ all -> 0x052d }
            java.util.List r3 = java.util.Arrays.asList(r2)     // Catch:{ all -> 0x052d }
            r6.addAll(r3)     // Catch:{ all -> 0x052d }
            X.0tg r4 = r11.A02     // Catch:{ all -> 0x052d }
            int r2 = r2.length     // Catch:{ all -> 0x052d }
            r16 = r2
            java.lang.String r2 = "SELECT message_row_id FROM receipt_user WHERE receipt_user_jid_row_id =? AND message_row_id IN "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x052d }
            r3.<init>(r2)     // Catch:{ all -> 0x052d }
            java.lang.String r2 = X.C34111ji.A00(r16)     // Catch:{ all -> 0x052d }
            r3.append(r2)     // Catch:{ all -> 0x052d }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x052d }
            java.lang.Object[] r2 = r6.toArray(r9)     // Catch:{ all -> 0x052d }
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ all -> 0x052d }
            android.database.Cursor r4 = r4.A08(r3, r2)     // Catch:{ all -> 0x052d }
            int r3 = r4.getColumnIndex(r8)     // Catch:{ all -> 0x01fb }
        L_0x01e5:
            boolean r2 = r4.moveToNext()     // Catch:{ all -> 0x01fb }
            if (r2 == 0) goto L_0x01f7
            long r16 = r4.getLong(r3)     // Catch:{ all -> 0x01fb }
            java.lang.String r2 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x01fb }
            r10.add(r2)     // Catch:{ all -> 0x01fb }
            goto L_0x01e5
        L_0x01f7:
            r4.close()     // Catch:{ all -> 0x052d }
            goto L_0x01a7
        L_0x01fb:
            r0 = move-exception
            if (r4 == 0) goto L_0x052c
            r4.close()     // Catch:{ all -> 0x052c }
            goto L_0x052c
        L_0x0203:
            r11.close()
            com.whatsapp.jid.DeviceJid r2 = r14.getPrimaryDevice()
            X.0tf r11 = r18.A02()
            X.1cj r16 = r11.A00()     // Catch:{ all -> 0x052d }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x027f }
            r8.<init>()     // Catch:{ all -> 0x027f }
            long r2 = r7.A01(r2)     // Catch:{ all -> 0x027f }
            java.lang.String r15 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x027f }
            java.lang.Object[] r3 = r10.toArray(r9)     // Catch:{ all -> 0x027f }
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ all -> 0x027f }
            r2 = 975(0x3cf, float:1.366E-42)
            X.1jh r7 = new X.1jh     // Catch:{ all -> 0x027f }
            r7.<init>(r3, r2)     // Catch:{ all -> 0x027f }
        L_0x022c:
            boolean r2 = r7.hasNext()     // Catch:{ all -> 0x027f }
            if (r2 == 0) goto L_0x026e
            java.lang.Object r6 = r7.next()     // Catch:{ all -> 0x027f }
            java.lang.String[] r6 = (java.lang.String[]) r6     // Catch:{ all -> 0x027f }
            r8.clear()     // Catch:{ all -> 0x027f }
            r8.add(r15)     // Catch:{ all -> 0x027f }
            java.util.List r2 = java.util.Arrays.asList(r6)     // Catch:{ all -> 0x027f }
            r8.addAll(r2)     // Catch:{ all -> 0x027f }
            X.0tg r5 = r11.A02     // Catch:{ all -> 0x027f }
            java.lang.String r4 = "receipt_device"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x027f }
            r3.<init>()     // Catch:{ all -> 0x027f }
            java.lang.String r2 = "receipt_device_jid_row_id = ? AND "
            r3.append(r2)     // Catch:{ all -> 0x027f }
            java.lang.String r2 = "message_row_id IN "
            r3.append(r2)     // Catch:{ all -> 0x027f }
            int r2 = r6.length     // Catch:{ all -> 0x027f }
            java.lang.String r2 = X.C34111ji.A00(r2)     // Catch:{ all -> 0x027f }
            r3.append(r2)     // Catch:{ all -> 0x027f }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x027f }
            java.lang.Object[] r2 = r8.toArray(r9)     // Catch:{ all -> 0x027f }
            java.lang.String[] r2 = (java.lang.String[]) r2     // Catch:{ all -> 0x027f }
            r5.A01(r4, r3, r2)     // Catch:{ all -> 0x027f }
            goto L_0x022c
        L_0x026e:
            r16.A00()     // Catch:{ all -> 0x027f }
            r3 = 38
            com.facebook.redex.RunnableRunnableShape6S0200000_I0_4 r2 = new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4     // Catch:{ all -> 0x027f }
            r2.<init>(r12, r3, r10)     // Catch:{ all -> 0x027f }
            r11.A03(r2)     // Catch:{ all -> 0x027f }
            r16.close()     // Catch:{ all -> 0x052d }
            goto L_0x028d
        L_0x027f:
            r0 = move-exception
            r16.close()     // Catch:{ all -> 0x052c }
            goto L_0x052c
        L_0x0285:
            r0 = move-exception
            if (r6 == 0) goto L_0x052c
            r6.close()     // Catch:{ all -> 0x052c }
            goto L_0x052c
        L_0x028d:
            r11.close()
            if (r19 != 0) goto L_0x02b8
            X.1HG r8 = r0.A0J
            boolean r2 = r8.A02(r14)
            if (r2 == 0) goto L_0x02b8
            X.12G r2 = r8.A02
            java.lang.Long r7 = r2.A03(r14)
            if (r7 == 0) goto L_0x02e3
            long r5 = r7.longValue()
            long r3 = r2.A01()
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x02e3
            X.0xb r3 = r8.A01
            com.obwhatsapp.jobqueue.job.GenerateTcTokenJob r2 = new com.obwhatsapp.jobqueue.job.GenerateTcTokenJob
            r2.<init>(r14, r7)
            r3.A00(r2)
        L_0x02b8:
            byte r2 = r1.device
            if (r2 != 0) goto L_0x02c1
            X.178 r2 = r0.A0F
            r2.A02(r14)
        L_0x02c1:
            X.16V r3 = r0.A0C
            java.util.Set r2 = java.util.Collections.singleton(r1)
            r3.A03(r2)
            byte r2 = r1.device
            if (r2 != 0) goto L_0x03bb
            X.0pd r4 = r0.A0H
            r3 = 1403(0x57b, float:1.966E-42)
            X.0tM r2 = X.C16620tM.A02
            boolean r2 = r4.A0E(r2, r3)
            if (r2 != 0) goto L_0x03bb
            X.0sO r3 = r0.A0B
            X.0tq r2 = r3.A06
            X.0tf r15 = r2.A02()
            goto L_0x02e7
        L_0x02e3:
            r8.A01(r14)
            goto L_0x02b8
        L_0x02e7:
            X.1cj r12 = r15.A00()     // Catch:{ all -> 0x03b6 }
            X.0us r7 = r3.A07     // Catch:{ all -> 0x03b1 }
            java.lang.String r3 = "participant-user-store/resetSentSenderKeyFor/"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x03b1 }
            r2.<init>(r3)     // Catch:{ all -> 0x03b1 }
            r2.append(r14)     // Catch:{ all -> 0x03b1 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x03b1 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x03b1 }
            X.0tq r2 = r7.A09     // Catch:{ all -> 0x03b1 }
            X.0tf r11 = r2.A02()     // Catch:{ all -> 0x03b1 }
            X.1cj r10 = r11.A00()     // Catch:{ all -> 0x03ac }
            X.193 r4 = r7.A0A     // Catch:{ all -> 0x03a7 }
            r5 = r14
            java.lang.String r3 = "participant-device-store/resetSentSenderKey/"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x03a7 }
            r2.<init>(r3)     // Catch:{ all -> 0x03a7 }
            r2.append(r14)     // Catch:{ all -> 0x03a7 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x03a7 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x03a7 }
            java.lang.String r2 = r14.getRawString()     // Catch:{ all -> 0x03a7 }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x03a7 }
            r3 = r2 ^ 1
            java.lang.String r2 = "participant-user-store/invalid-jid"
            X.AnonymousClass00B.A0C(r2, r3)     // Catch:{ all -> 0x03a7 }
            X.14v r3 = r4.A02     // Catch:{ all -> 0x03a7 }
            X.0sK r2 = r4.A01     // Catch:{ all -> 0x03a7 }
            boolean r2 = r2.A0I(r14)     // Catch:{ all -> 0x03a7 }
            if (r2 == 0) goto L_0x0337
            X.1jg r5 = X.C34091jg.A00     // Catch:{ all -> 0x03a7 }
        L_0x0337:
            long r8 = r3.A01(r5)     // Catch:{ all -> 0x03a7 }
            X.0tq r2 = r4.A03     // Catch:{ all -> 0x03a7 }
            X.0tf r6 = r2.A02()     // Catch:{ all -> 0x03a7 }
            X.0tg r3 = r6.A02     // Catch:{ all -> 0x03a2 }
            java.lang.String r2 = "UPDATE group_participant_device SET sent_sender_key = ? WHERE group_participant_row_id IN (SELECT _id FROM group_participant_user WHERE user_jid_row_id = ?)"
            X.1ou r5 = r3.A0A(r2)     // Catch:{ all -> 0x03a2 }
            r2 = 2
            java.lang.String[] r4 = new java.lang.String[r2]     // Catch:{ all -> 0x03a2 }
            r3 = 0
            java.lang.String r2 = "0"
            r4[r3] = r2     // Catch:{ all -> 0x03a2 }
            java.lang.String r2 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x03a2 }
            r4[r13] = r2     // Catch:{ all -> 0x03a2 }
            android.database.sqlite.SQLiteStatement r2 = r5.A00     // Catch:{ all -> 0x03a2 }
            r2.bindAllArgsAsStrings(r4)     // Catch:{ all -> 0x03a2 }
            r5.A00()     // Catch:{ all -> 0x03a2 }
            r6.close()     // Catch:{ all -> 0x03a7 }
            X.11J r2 = r7.A07     // Catch:{ all -> 0x03a7 }
            java.util.concurrent.ConcurrentHashMap r4 = r2.A03     // Catch:{ all -> 0x03a7 }
            java.util.Set r3 = r4.keySet()     // Catch:{ all -> 0x03a7 }
            java.util.HashSet r2 = new java.util.HashSet     // Catch:{ all -> 0x03a7 }
            r2.<init>(r3)     // Catch:{ all -> 0x03a7 }
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x03a7 }
        L_0x0373:
            boolean r2 = r3.hasNext()     // Catch:{ all -> 0x03a7 }
            if (r2 == 0) goto L_0x0391
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x03a7 }
            X.0sN r2 = (X.C16060sN) r2     // Catch:{ all -> 0x03a7 }
            java.lang.Object r2 = r4.get(r2)     // Catch:{ all -> 0x03a7 }
            X.1cE r2 = (X.C30361cE) r2     // Catch:{ all -> 0x03a7 }
            if (r2 == 0) goto L_0x0373
            X.1ck r2 = r2.A05(r14)     // Catch:{ all -> 0x03a7 }
            if (r2 == 0) goto L_0x0373
            X.C17310us.A01(r2)     // Catch:{ all -> 0x03a7 }
            goto L_0x0373
        L_0x0391:
            r10.A00()     // Catch:{ all -> 0x03a7 }
            r10.close()     // Catch:{ all -> 0x03ac }
            r11.close()     // Catch:{ all -> 0x03b1 }
            r12.A00()     // Catch:{ all -> 0x03b1 }
            r12.close()     // Catch:{ all -> 0x03b6 }
            goto L_0x0532
        L_0x03a2:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x03a6 }
        L_0x03a6:
            throw r0     // Catch:{ all -> 0x03a7 }
        L_0x03a7:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x03ab }
        L_0x03ab:
            throw r0     // Catch:{ all -> 0x03ac }
        L_0x03ac:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x03b0 }
        L_0x03b0:
            throw r0     // Catch:{ all -> 0x03b1 }
        L_0x03b1:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x03b5 }
        L_0x03b5:
            throw r0     // Catch:{ all -> 0x03b6 }
        L_0x03b6:
            r0 = move-exception
            r15.close()     // Catch:{ all -> 0x0531 }
            throw r0
        L_0x03bb:
            java.lang.String r3 = "identitychangemanager/onIdentityChangedOrDeleted/rotating sender key deviceJid="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.0pd r4 = r0.A0H
            r3 = 1108(0x454, float:1.553E-42)
            X.0tM r2 = X.C16620tM.A02
            boolean r2 = r4.A0E(r2, r3)
            if (r2 == 0) goto L_0x0458
            byte r2 = r1.device
            X.0sO r5 = r0.A0B
            if (r2 != 0) goto L_0x044f
            X.0us r10 = r5.A07
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            X.0tq r2 = r10.A09
            X.0tf r6 = r2.get()
            X.0tg r11 = r6.A02     // Catch:{ all -> 0x044a }
            java.lang.String r9 = "SELECT DISTINCT(group_jid_row_id) FROM group_participant_user AS user JOIN group_participant_device AS device ON  user._id =  device.group_participant_row_id WHERE user_jid_row_id = ? AND sent_sender_key = 1"
            java.lang.String[] r8 = new java.lang.String[r13]     // Catch:{ all -> 0x044a }
            r7 = 0
            long r2 = r10.A02(r14)     // Catch:{ all -> 0x044a }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x044a }
            r8[r7] = r2     // Catch:{ all -> 0x044a }
            android.database.Cursor r7 = r11.A08(r9, r8)     // Catch:{ all -> 0x044a }
            java.lang.String r2 = "group_jid_row_id"
            int r9 = r7.getColumnIndexOrThrow(r2)     // Catch:{ all -> 0x0443 }
            java.util.HashSet r8 = new java.util.HashSet     // Catch:{ all -> 0x0443 }
            r8.<init>()     // Catch:{ all -> 0x0443 }
        L_0x040b:
            boolean r2 = r7.moveToNext()     // Catch:{ all -> 0x0443 }
            if (r2 == 0) goto L_0x041d
            long r2 = r7.getLong(r9)     // Catch:{ all -> 0x0443 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0443 }
            r8.add(r2)     // Catch:{ all -> 0x0443 }
            goto L_0x040b
        L_0x041d:
            X.14v r3 = r10.A08     // Catch:{ all -> 0x0443 }
            java.lang.Class<X.0sN> r2 = X.C16060sN.class
            java.util.Map r2 = r3.A09(r2, r8)     // Catch:{ all -> 0x0443 }
            java.util.Collection r2 = r2.values()     // Catch:{ all -> 0x0443 }
            java.util.Iterator r3 = r2.iterator()     // Catch:{ all -> 0x0443 }
        L_0x042d:
            boolean r2 = r3.hasNext()     // Catch:{ all -> 0x0443 }
            if (r2 == 0) goto L_0x043f
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x0443 }
            X.0sN r2 = (X.C16060sN) r2     // Catch:{ all -> 0x0443 }
            if (r2 == 0) goto L_0x042d
            r4.add(r2)     // Catch:{ all -> 0x0443 }
            goto L_0x042d
        L_0x043f:
            r7.close()     // Catch:{ all -> 0x044a }
            goto L_0x0461
        L_0x0443:
            r0 = move-exception
            if (r7 == 0) goto L_0x0449
            r7.close()     // Catch:{ all -> 0x0449 }
        L_0x0449:
            throw r0     // Catch:{ all -> 0x044a }
        L_0x044a:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0531 }
            throw r0
        L_0x044f:
            java.util.Set r2 = java.util.Collections.singleton(r1)
            java.util.Set r4 = r5.A03(r2)
            goto L_0x0464
        L_0x0458:
            X.0sO r5 = r0.A0B
            X.0us r2 = r5.A07
            java.util.Set r4 = r2.A07(r14)
            goto L_0x0464
        L_0x0461:
            r6.close()
        L_0x0464:
            byte r2 = r1.device
            if (r2 == 0) goto L_0x04bb
            if (r19 == 0) goto L_0x04bb
        L_0x046a:
            java.util.Iterator r9 = r4.iterator()
            r8 = 0
        L_0x046f:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x04bd
            java.lang.Object r7 = r9.next()
            X.0sN r7 = (X.C16060sN) r7
            java.lang.String r3 = "identitychangemanager/rotateSenderKey/ gid="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            java.lang.String r3 = r7.getRawString()
            X.0sK r2 = r0.A01
            r2.A0B()
            X.1Za r2 = r2.A04
            X.AnonymousClass00B.A06(r2)
            X.1Yb r2 = X.C28851Ya.A02(r2)
            X.1dH r6 = new X.1dH
            r6.<init>(r2, r3)
            X.11s r3 = r0.A09
            r2 = 0
            boolean r2 = r3.A0g(r6, r2)
            if (r2 == 0) goto L_0x046f
            r8 = 1
            X.0w1 r3 = r0.A02
            r2 = 3
            if (r13 == 0) goto L_0x04b3
            r2 = 2
        L_0x04b3:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3.A0H(r7, r2)
            goto L_0x046f
        L_0x04bb:
            r13 = 0
            goto L_0x046a
        L_0x04bd:
            if (r8 == 0) goto L_0x0535
            X.0tq r2 = r5.A06
            X.0tf r11 = r2.A02()
            X.1cj r8 = r11.A00()     // Catch:{ all -> 0x052d }
            X.0us r7 = r5.A07     // Catch:{ all -> 0x0528 }
            java.lang.String r3 = "participant-user-store/resetSentSenderKeyForAllParticipants/"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0528 }
            r2.<init>(r3)     // Catch:{ all -> 0x0528 }
            r2.append(r4)     // Catch:{ all -> 0x0528 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0528 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ all -> 0x0528 }
            X.0tq r2 = r7.A09     // Catch:{ all -> 0x0528 }
            X.0tf r6 = r2.A02()     // Catch:{ all -> 0x0528 }
            X.1cj r5 = r6.A00()     // Catch:{ all -> 0x0523 }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x051e }
        L_0x04ea:
            boolean r2 = r4.hasNext()     // Catch:{ all -> 0x051e }
            if (r2 == 0) goto L_0x050b
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x051e }
            X.0sN r3 = (X.C16060sN) r3     // Catch:{ all -> 0x051e }
            X.193 r2 = r7.A0A     // Catch:{ all -> 0x051e }
            r2.A02(r3)     // Catch:{ all -> 0x051e }
            X.11J r2 = r7.A07     // Catch:{ all -> 0x051e }
            java.util.concurrent.ConcurrentHashMap r2 = r2.A03     // Catch:{ all -> 0x051e }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ all -> 0x051e }
            X.1cE r2 = (X.C30361cE) r2     // Catch:{ all -> 0x051e }
            if (r2 == 0) goto L_0x04ea
            r7.A0A(r2)     // Catch:{ all -> 0x051e }
            goto L_0x04ea
        L_0x050b:
            r5.A00()     // Catch:{ all -> 0x051e }
            r5.close()     // Catch:{ all -> 0x0523 }
            r6.close()     // Catch:{ all -> 0x0528 }
            r8.A00()     // Catch:{ all -> 0x0528 }
            r8.close()     // Catch:{ all -> 0x052d }
            r11.close()
            goto L_0x0535
        L_0x051e:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x0522 }
        L_0x0522:
            throw r0     // Catch:{ all -> 0x0523 }
        L_0x0523:
            r0 = move-exception
            r6.close()     // Catch:{ all -> 0x0527 }
        L_0x0527:
            throw r0     // Catch:{ all -> 0x0528 }
        L_0x0528:
            r0 = move-exception
            r8.close()     // Catch:{ all -> 0x052c }
        L_0x052c:
            throw r0     // Catch:{ all -> 0x052d }
        L_0x052d:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x0531 }
        L_0x0531:
            throw r0
        L_0x0532:
            r15.close()
        L_0x0535:
            byte r1 = r1.device
            if (r1 != 0) goto L_0x0614
            X.0yQ r6 = r0.A0I
            java.lang.String r2 = "LocationSharingManager/onUserIdentityChange; jid="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.lang.Object r7 = r6.A0S
            monitor-enter(r7)
            java.util.Map r9 = r6.A0A()     // Catch:{ all -> 0x05d3 }
            java.util.Set r1 = r9.entrySet()     // Catch:{ all -> 0x05d3 }
            java.util.Iterator r10 = r1.iterator()     // Catch:{ all -> 0x05d3 }
        L_0x0560:
            boolean r1 = r10.hasNext()     // Catch:{ all -> 0x05d3 }
            if (r1 == 0) goto L_0x05ab
            java.lang.Object r1 = r10.next()     // Catch:{ all -> 0x05d3 }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x05d3 }
            java.lang.Object r5 = r1.getKey()     // Catch:{ all -> 0x05d3 }
            X.0rv r5 = (X.C15830rv) r5     // Catch:{ all -> 0x05d3 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x05d3 }
            X.28s r1 = (X.C454628s) r1     // Catch:{ all -> 0x05d3 }
            java.util.List r4 = r1.A03     // Catch:{ all -> 0x05d3 }
            boolean r1 = r4.contains(r14)     // Catch:{ all -> 0x05d3 }
            if (r1 == 0) goto L_0x0560
            r4.remove(r14)     // Catch:{ all -> 0x05d3 }
            X.1Rv r3 = r6.A0N     // Catch:{ all -> 0x05d3 }
            java.util.List r2 = java.util.Collections.singletonList(r14)     // Catch:{ all -> 0x05d3 }
            r1 = 1
            r3.A02(r5, r2, r1)     // Catch:{ all -> 0x05d3 }
            boolean r1 = r4.isEmpty()     // Catch:{ all -> 0x05d3 }
            if (r1 == 0) goto L_0x05a7
            java.lang.Object r1 = r9.remove(r5)     // Catch:{ all -> 0x05d3 }
            X.28s r1 = (X.C454628s) r1     // Catch:{ all -> 0x05d3 }
            X.AnonymousClass00B.A06(r1)     // Catch:{ all -> 0x05d3 }
            X.1Vw r1 = r1.A02     // Catch:{ all -> 0x05d3 }
            X.1rV r1 = r6.A06(r1)     // Catch:{ all -> 0x05d3 }
            if (r1 == 0) goto L_0x05a7
            r6.A0W(r1)     // Catch:{ all -> 0x05d3 }
        L_0x05a7:
            r8.add(r5)     // Catch:{ all -> 0x05d3 }
            goto L_0x0560
        L_0x05ab:
            r6.A0K()     // Catch:{ all -> 0x05d3 }
            monitor-exit(r7)     // Catch:{ all -> 0x05d3 }
            boolean r1 = r8.isEmpty()
            if (r1 != 0) goto L_0x05d6
            r6.A0M()
            java.util.Iterator r5 = r8.iterator()
        L_0x05bc:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x05d6
            java.lang.Object r4 = r5.next()
            android.os.Handler r3 = r6.A08
            r2 = 14
            com.facebook.redex.RunnableRunnableShape8S0200000_I0_6 r1 = new com.facebook.redex.RunnableRunnableShape8S0200000_I0_6
            r1.<init>(r6, r2, r4)
            r3.post(r1)
            goto L_0x05bc
        L_0x05d3:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x05d3 }
            throw r0
        L_0x05d6:
            X.0sG r1 = r0.A04
            X.0sH r1 = r1.A08(r14)
            if (r1 == 0) goto L_0x0614
            X.1Vq r5 = r1.A0C
            if (r5 == 0) goto L_0x0614
            java.lang.String r2 = "identitychangemanager/onIdentityChangedOrDeleted/attempting to confirm vname cert; jid="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.0uP r4 = r0.A05
            byte[] r3 = r4.A06(r14)
            if (r3 == 0) goto L_0x0615
            int r2 = r5.A03
            X.1ta r1 = r5.A00()
            boolean r1 = r4.A04(r14, r1, r3, r2)
            if (r1 == 0) goto L_0x0615
            X.0t6 r1 = r0.A0A
            X.1Vr r0 = X.C28341Vr.A00(r5)
            X.1Vs r0 = r0.A01()
            r1.A0R(r14, r0)
        L_0x0614:
            return
        L_0x0615:
            java.lang.String r2 = "identitychangemanager/onIdentityChangedOrDeleted/refreshing verified name due to identity change; jid="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r14)
            java.lang.String r1 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.util.Map r1 = r4.A0A
            r1.remove(r14)
            r4.A01(r14)
            X.0xb r1 = r0.A03
            com.obwhatsapp.jobqueue.job.GetVNameCertificateJob r0 = new com.obwhatsapp.jobqueue.job.GetVNameCertificateJob
            r0.<init>(r14)
            r1.A00(r0)
            return
        L_0x0639:
            r0 = move-exception
            r3.A01()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19350yI.A00(X.0yI, com.whatsapp.jid.DeviceJid, boolean):void");
    }
}
