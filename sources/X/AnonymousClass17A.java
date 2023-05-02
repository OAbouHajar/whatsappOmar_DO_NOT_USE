package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.17A  reason: invalid class name */
public abstract class AnonymousClass17A {
    public static int A06 = 200;
    public final AnonymousClass03L A00 = new AnonymousClass03L(250);
    public final C16300so A01;
    public final C216314v A02;
    public final C19650ym A03;
    public final C16900tq A04;
    public final AnonymousClass178 A05;

    public AnonymousClass17A(C16300so r3, C216314v r4, C19650ym r5, C16900tq r6, AnonymousClass178 r7) {
        this.A02 = r4;
        this.A01 = r3;
        this.A04 = r6;
        this.A05 = r7;
        this.A03 = r5;
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public X.C42641yA A00(X.C16740tZ r8) {
        /*
            r7 = this;
            r6 = r7
            boolean r0 = r7 instanceof X.AnonymousClass17B
            if (r0 == 0) goto L_0x0030
            r5 = r7
            X.17B r5 = (X.AnonymousClass17B) r5
            X.03L r3 = r5.A00
            long r0 = r8.A13
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r4 = r3.A02(r0)
            X.1yA r4 = (X.C42641yA) r4
            if (r4 != 0) goto L_0x0067
            long r1 = r8.A13
            X.1Vw r0 = r8.A11
            X.1yA r4 = r5.A05(r0, r1)
            long r0 = r8.A13
            monitor-enter(r6)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0064 }
            java.lang.Object r0 = r3.A02(r1)     // Catch:{ all -> 0x0064 }
            X.1yA r0 = (X.C42641yA) r0     // Catch:{ all -> 0x0064 }
            if (r0 != 0) goto L_0x0062
            goto L_0x005d
        L_0x0030:
            r2 = r7
            X.179 r2 = (X.AnonymousClass179) r2
            boolean r0 = r8 instanceof X.C38541qx
            X.AnonymousClass00B.A0F(r0)
            X.03L r3 = r2.A00
            long r0 = r8.A13
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r4 = r3.A02(r0)
            X.1yA r4 = (X.C42641yA) r4
            if (r4 != 0) goto L_0x0067
            X.1Vw r0 = r8.A11
            X.1yA r4 = r2.A05(r0)
            long r0 = r8.A13
            monitor-enter(r6)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0064 }
            java.lang.Object r0 = r3.A02(r1)     // Catch:{ all -> 0x0064 }
            X.1yA r0 = (X.C42641yA) r0     // Catch:{ all -> 0x0064 }
            if (r0 != 0) goto L_0x0062
        L_0x005d:
            r3.A06(r1, r4)     // Catch:{ all -> 0x0064 }
            monitor-exit(r6)
            return r4
        L_0x0062:
            monitor-exit(r6)
            return r0
        L_0x0064:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0067:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17A.A00(X.0tZ):X.1yA");
    }

    public String A01(int i2) {
        if (this instanceof AnonymousClass17B) {
            boolean z2 = false;
            if (i2 > 0) {
                z2 = true;
            }
            AnonymousClass00B.A0F(z2);
            StringBuilder sb = new StringBuilder("INSERT INTO receipt_device (message_row_id, receipt_device_jid_row_id, primary_device_version) SELECT ?, ?, ?");
            for (int i3 = 1; i3 < i2; i3++) {
                sb.append(" UNION ALL SELECT ?,?,?");
            }
            return sb.toString();
        }
        boolean z3 = false;
        if (i2 > 0) {
            z3 = true;
        }
        AnonymousClass00B.A0F(z3);
        StringBuilder sb2 = new StringBuilder("INSERT INTO message_add_on_receipt_device (message_add_on_row_id, receipt_device_jid_row_id, primary_device_version) SELECT ?, ?, ?");
        for (int i4 = 1; i4 < i2; i4++) {
            sb2.append(" UNION ALL SELECT ?,?,?");
        }
        return sb2.toString();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:39|40|79) */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        A06 = java.lang.Math.max(10, A06 - 10);
        r4 = r4 / 2;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00d2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x0174 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:72:0x0179 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C16740tZ r20, java.util.Set r21, boolean r22) {
        /*
            r19 = this;
            r3 = r21
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0183
            r10 = r20
            long r4 = r10.A13
            r1 = -1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0183
            r9 = r19
            X.03L r2 = r9.A00
            long r0 = r10.A13
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r2.A02(r0)
            if (r0 != 0) goto L_0x0037
            X.1yA r8 = new X.1yA
            r8.<init>()
        L_0x0027:
            X.AnonymousClass00B.A06(r8)
            X.178 r1 = r9.A05
            X.0so r0 = r9.A01
            java.util.Set r0 = X.C16030sJ.A0A(r0, r3)
            java.util.Map r18 = r1.A01(r0)
            goto L_0x0044
        L_0x0037:
            long r0 = r10.A13
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r8 = r2.A02(r0)
            X.1yA r8 = (X.C42641yA) r8
            goto L_0x0027
        L_0x0044:
            X.0tq r0 = r9.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x017a }
            X.0tf r7 = r0.A02()     // Catch:{ SQLiteDatabaseCorruptException -> 0x017a }
            X.1cj r17 = r7.A00()     // Catch:{ all -> 0x0175 }
            r6 = 0
            r0 = 1
            if (r22 == 0) goto L_0x009c
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x0170 }
            long r0 = r10.A13     // Catch:{ all -> 0x0170 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0170 }
            r4[r6] = r0     // Catch:{ all -> 0x0170 }
            X.0tg r11 = r7.A02     // Catch:{ all -> 0x0170 }
            boolean r12 = r9 instanceof X.AnonymousClass17B     // Catch:{ all -> 0x0170 }
            if (r12 == 0) goto L_0x006a
            java.lang.String r5 = "receipt_device"
        L_0x0064:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            r1.<init>()     // Catch:{ all -> 0x0170 }
            goto L_0x006d
        L_0x006a:
            java.lang.String r5 = "message_add_on_receipt_device"
            goto L_0x0064
        L_0x006d:
            if (r12 == 0) goto L_0x0070
            goto L_0x0073
        L_0x0070:
            java.lang.String r0 = "message_add_on_row_id"
            goto L_0x0075
        L_0x0073:
            java.lang.String r0 = "message_row_id"
        L_0x0075:
            r1.append(r0)     // Catch:{ all -> 0x0170 }
            java.lang.String r0 = " = ?"
            r1.append(r0)     // Catch:{ all -> 0x0170 }
            java.lang.String r2 = r1.toString()     // Catch:{ all -> 0x0170 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            r1.<init>()     // Catch:{ all -> 0x0170 }
            if (r12 == 0) goto L_0x0089
            goto L_0x008c
        L_0x0089:
            java.lang.String r0 = "MessageAddOnReceiptDeviceStore/"
            goto L_0x008e
        L_0x008c:
            java.lang.String r0 = "MessageReceiptDeviceStore/"
        L_0x008e:
            r1.append(r0)     // Catch:{ all -> 0x0170 }
            java.lang.String r0 = "addBlankReceiptsForTargetDevicesImpl/DELETE_RECEIPT_DEVICE"
            r1.append(r0)     // Catch:{ all -> 0x0170 }
            r1.toString()     // Catch:{ all -> 0x0170 }
            r11.A01(r5, r2, r4)     // Catch:{ all -> 0x0170 }
        L_0x009c:
            com.whatsapp.jid.DeviceJid[] r0 = new com.whatsapp.jid.DeviceJid[r6]     // Catch:{ all -> 0x0170 }
            java.lang.Object[] r11 = r3.toArray(r0)     // Catch:{ all -> 0x0170 }
            com.whatsapp.jid.DeviceJid[] r11 = (com.whatsapp.jid.DeviceJid[]) r11     // Catch:{ all -> 0x0170 }
            int r5 = r11.length     // Catch:{ all -> 0x0170 }
            int r0 = A06     // Catch:{ all -> 0x0170 }
            int r4 = java.lang.Math.min(r5, r0)     // Catch:{ all -> 0x0170 }
            r3 = 0
        L_0x00ac:
            java.lang.String r12 = "INSERT_DEVICE_RECEIPT_SQL"
            if (r3 != 0) goto L_0x00e0
            java.lang.String r13 = r9.A01(r4)     // Catch:{ SQLiteException -> 0x00d2 }
            X.0tg r2 = r7.A02     // Catch:{ SQLiteException -> 0x00d2 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ SQLiteException -> 0x00d2 }
            r1.<init>()     // Catch:{ SQLiteException -> 0x00d2 }
            boolean r0 = r9 instanceof X.AnonymousClass17B     // Catch:{ SQLiteException -> 0x00d2 }
            if (r0 == 0) goto L_0x00cf
            java.lang.String r0 = "MessageReceiptDeviceStore/"
        L_0x00c1:
            r1.append(r0)     // Catch:{ SQLiteException -> 0x00d2 }
            r1.append(r12)     // Catch:{ SQLiteException -> 0x00d2 }
            r1.toString()     // Catch:{ SQLiteException -> 0x00d2 }
            X.1ou r3 = r2.A0A(r13)     // Catch:{ SQLiteException -> 0x00d2 }
            goto L_0x00ac
        L_0x00cf:
            java.lang.String r0 = "MessageAddOnReceiptDeviceStore/"
            goto L_0x00c1
        L_0x00d2:
            int r1 = A06     // Catch:{ all -> 0x0170 }
            r0 = 10
            int r1 = r1 - r0
            int r0 = java.lang.Math.max(r0, r1)     // Catch:{ all -> 0x0170 }
            A06 = r0     // Catch:{ all -> 0x0170 }
            int r4 = r4 / 2
            goto L_0x00ac
        L_0x00e0:
            if (r5 <= 0) goto L_0x015d
            if (r4 <= r5) goto L_0x0103
            java.lang.String r3 = r9.A01(r5)     // Catch:{ all -> 0x0170 }
            X.0tg r2 = r7.A02     // Catch:{ all -> 0x0170 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0170 }
            r1.<init>()     // Catch:{ all -> 0x0170 }
            boolean r0 = r9 instanceof X.AnonymousClass17B     // Catch:{ all -> 0x0170 }
            if (r0 == 0) goto L_0x0109
            java.lang.String r0 = "MessageReceiptDeviceStore/"
        L_0x00f5:
            r1.append(r0)     // Catch:{ all -> 0x0170 }
            r1.append(r12)     // Catch:{ all -> 0x0170 }
            r1.toString()     // Catch:{ all -> 0x0170 }
            X.1ou r3 = r2.A0A(r3)     // Catch:{ all -> 0x0170 }
            r4 = r5
        L_0x0103:
            android.database.sqlite.SQLiteStatement r13 = r3.A00     // Catch:{ all -> 0x0170 }
            r13.clearBindings()     // Catch:{ all -> 0x0170 }
            goto L_0x010c
        L_0x0109:
            java.lang.String r0 = "MessageAddOnReceiptDeviceStore/"
            goto L_0x00f5
        L_0x010c:
            r16 = r6
            r2 = 1
        L_0x010f:
            int r0 = r4 * 3
            if (r2 > r0) goto L_0x0157
            r15 = r11[r16]     // Catch:{ all -> 0x0170 }
            r0 = 0
            X.1yB r14 = new X.1yB     // Catch:{ all -> 0x0170 }
            r14.<init>(r0)     // Catch:{ all -> 0x0170 }
            java.util.concurrent.ConcurrentHashMap r0 = r8.A00     // Catch:{ all -> 0x0170 }
            r0.put(r15, r14)     // Catch:{ all -> 0x0170 }
            long r0 = r10.A13     // Catch:{ all -> 0x0170 }
            r3.A01(r2, r0)     // Catch:{ all -> 0x0170 }
            int r14 = r2 + 1
            X.14v r1 = r9.A02     // Catch:{ all -> 0x0170 }
            r0 = r11[r16]     // Catch:{ all -> 0x0170 }
            long r0 = r1.A01(r0)     // Catch:{ all -> 0x0170 }
            r3.A01(r14, r0)     // Catch:{ all -> 0x0170 }
            r0 = r11[r16]     // Catch:{ all -> 0x0170 }
            com.whatsapp.jid.UserJid r1 = r0.getUserJid()     // Catch:{ all -> 0x0170 }
            r0 = r18
            java.lang.Object r0 = r0.get(r1)     // Catch:{ all -> 0x0170 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0170 }
            if (r0 != 0) goto L_0x0149
            int r0 = r2 + 2
            r13.bindNull(r0)     // Catch:{ all -> 0x0170 }
            goto L_0x0152
        L_0x0149:
            int r14 = r2 + 2
            long r0 = r0.longValue()     // Catch:{ all -> 0x0170 }
            r3.A01(r14, r0)     // Catch:{ all -> 0x0170 }
        L_0x0152:
            int r16 = r16 + 1
            int r2 = r2 + 3
            goto L_0x010f
        L_0x0157:
            r13.execute()     // Catch:{ all -> 0x0170 }
            int r6 = r6 + r4
            int r5 = r5 - r4
            goto L_0x00e0
        L_0x015d:
            r17.A00()     // Catch:{ all -> 0x0170 }
            r1 = 0
            com.facebook.redex.RunnableRunnableShape1S0300000_I0_1 r0 = new com.facebook.redex.RunnableRunnableShape1S0300000_I0_1     // Catch:{ all -> 0x0170 }
            r0.<init>(r9, r10, r8, r1)     // Catch:{ all -> 0x0170 }
            r7.A03(r0)     // Catch:{ all -> 0x0170 }
            r17.close()     // Catch:{ all -> 0x0175 }
            r7.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x017a }
            return
        L_0x0170:
            r0 = move-exception
            r17.close()     // Catch:{ all -> 0x0174 }
        L_0x0174:
            throw r0     // Catch:{ all -> 0x0175 }
        L_0x0175:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0179 }
        L_0x0179:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x017a }
        L_0x017a:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r9.A03
            r0.A02()
        L_0x0183:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17A.A02(X.0tZ, java.util.Set, boolean):void");
    }

    public void A03(Set set) {
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            if (deviceJid.device != 0) {
                hashSet.add(Long.toString(this.A02.A01(deviceJid)));
            }
        }
        if (!hashSet.isEmpty()) {
            StringBuilder sb = new StringBuilder("receipt_device_jid_row_id");
            sb.append(" IN ");
            sb.append(C34111ji.A00(hashSet.size()));
            sb.append(" AND ");
            sb.append("receipt_device_timestamp");
            sb.append(" IS NULL");
            String obj = sb.toString();
            C16800tf A022 = this.A04.A02();
            try {
                C16810tg r5 = A022.A02;
                boolean z2 = this instanceof AnonymousClass17B;
                String str = z2 ? "receipt_device" : "message_add_on_receipt_device";
                String[] strArr = (String[]) hashSet.toArray(new String[0]);
                StringBuilder sb2 = new StringBuilder();
                String str2 = z2 ? "MessageReceiptDeviceStore/" : "MessageAddOnReceiptDeviceStore/";
                sb2.append(str2);
                sb2.append("deleteCompanionReceiptsForUndeliveredMessages/DELETE_RECEIPT_DEVICE");
                sb2.toString();
                int A012 = r5.A01(str, obj, strArr);
                A022.close();
                if (A012 > 0) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str2);
                    sb3.append("deleteCompanionReceiptsForUndeliveredMessages/deviceIds = ");
                    sb3.append(set);
                    Log.i(sb3.toString());
                    this.A00.A05(-1);
                    return;
                }
                return;
            } catch (Throwable unused) {
            }
        } else {
            return;
        }
        throw th;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x004c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0051 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00ba */
    /* JADX WARNING: Missing exception handler attribute for start block: B:54:0x00bf */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(com.whatsapp.jid.DeviceJid r9, X.C16740tZ r10) {
        /*
            r8 = this;
            boolean r0 = r8 instanceof X.AnonymousClass17B
            if (r0 == 0) goto L_0x0052
            X.03L r2 = r8.A00
            long r0 = r10.A13
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r2.A02(r0)
            X.1yA r0 = (X.C42641yA) r0
            if (r0 != 0) goto L_0x00d2
            long r0 = r10.A13
            java.lang.String r2 = java.lang.String.valueOf(r0)
            X.14v r0 = r8.A02
            long r0 = r0.A01(r9)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 2
            java.lang.String[] r3 = new java.lang.String[r0]
            r0 = 0
            r3[r0] = r2
            r0 = 1
            r3[r0] = r1
            X.0tq r0 = r8.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c7 }
            X.0tf r2 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c7 }
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x004d }
            java.lang.String r0 = "SELECT receipt_device_jid_row_id FROM receipt_device WHERE message_row_id = ? AND receipt_device_jid_row_id = ?"
            android.database.Cursor r1 = r1.A08(r0, r3)     // Catch:{ all -> 0x004d }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0046 }
            r1.close()     // Catch:{ all -> 0x004d }
            r2.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c7 }
            return r0
        L_0x0046:
            r0 = move-exception
            if (r1 == 0) goto L_0x004c
            r1.close()     // Catch:{ all -> 0x004c }
        L_0x004c:
            throw r0     // Catch:{ all -> 0x004d }
        L_0x004d:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0051 }
        L_0x0051:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c7 }
        L_0x0052:
            r3 = r8
            X.179 r3 = (X.AnonymousClass179) r3
            X.03L r2 = r3.A00
            long r0 = r10.A13
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r2.A02(r0)
            X.1yA r0 = (X.C42641yA) r0
            if (r0 != 0) goto L_0x00d2
            X.1Vw r5 = r10.A11
            X.0rv r1 = r5.A00
            X.AnonymousClass00B.A06(r1)
            X.0ts r0 = r3.A00
            long r6 = r0.A02(r1)
            X.14v r0 = r3.A02
            long r0 = r0.A01(r9)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            r0 = 4
            java.lang.String[] r4 = new java.lang.String[r0]
            java.lang.String r1 = java.lang.String.valueOf(r6)
            r0 = 0
            r4[r0] = r1
            r1 = 1
            boolean r0 = r5.A02
            if (r0 == 0) goto L_0x0098
            java.lang.String r0 = "1"
        L_0x008d:
            r4[r1] = r0
            r1 = 2
            java.lang.String r0 = r5.A01
            r4[r1] = r0
            r0 = 3
            r4[r0] = r2
            goto L_0x009b
        L_0x0098:
            java.lang.String r0 = "0"
            goto L_0x008d
        L_0x009b:
            X.0tq r0 = r3.A04     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c0 }
            X.0tf r2 = r0.get()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c0 }
            X.0tg r1 = r2.A02     // Catch:{ all -> 0x00bb }
            java.lang.String r0 = "SELECT receipt_device_jid_row_id FROM message_add_on JOIN message_add_on_receipt_device ON message_add_on._id = message_add_on_receipt_device.message_add_on_row_id WHERE chat_row_id = ? AND from_me = ? AND key_id = ? AND receipt_device_jid_row_id = ?"
            android.database.Cursor r1 = r1.A08(r0, r4)     // Catch:{ all -> 0x00bb }
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x00b4 }
            r1.close()     // Catch:{ all -> 0x00bb }
            r2.close()     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c0 }
            return r0
        L_0x00b4:
            r0 = move-exception
            if (r1 == 0) goto L_0x00ba
            r1.close()     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            throw r0     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            throw r0     // Catch:{ SQLiteDatabaseCorruptException -> 0x00c0 }
        L_0x00c0:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r3.A03
            goto L_0x00cd
        L_0x00c7:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
            X.0ym r0 = r8.A03
        L_0x00cd:
            r0.A02()
            r0 = 0
            return r0
        L_0x00d2:
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.util.Set r0 = r0.keySet()
            boolean r0 = r0.contains(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass17A.A04(com.whatsapp.jid.DeviceJid, X.0tZ):boolean");
    }
}
