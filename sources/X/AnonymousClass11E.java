package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.11E  reason: invalid class name */
public class AnonymousClass11E {
    public final C16300so A00;
    public final C16040sK A01;
    public final C25941Ls A02;
    public final C19080xj A03;
    public final C16440t3 A04;
    public final C15860rz A05;
    public final C14730pf A06;
    public final C216314v A07;
    public final C18590ww A08;
    public final C16900tq A09;
    public final C24811Hj A0A;
    public final AnonymousClass11D A0B;
    public final C14710pd A0C;
    public final C16490t9 A0D;
    public final AtomicBoolean A0E = new AtomicBoolean(false);

    public AnonymousClass11E(C16300so r3, C16040sK r4, C25941Ls r5, C19080xj r6, C16440t3 r7, C15860rz r8, C14730pf r9, C216314v r10, C18590ww r11, C16900tq r12, C24811Hj r13, AnonymousClass11D r14, C14710pd r15, C16490t9 r16) {
        this.A04 = r7;
        this.A0C = r15;
        this.A07 = r10;
        this.A00 = r3;
        this.A01 = r4;
        this.A0D = r16;
        this.A06 = r9;
        this.A03 = r6;
        this.A0B = r14;
        this.A05 = r8;
        this.A09 = r12;
        this.A0A = r13;
        this.A08 = r11;
        this.A02 = r5;
    }

    public int A00(C30111bl r10, AnonymousClass2Fu r11) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            C28031Ub it = this.A0B.A00().values().iterator();
            while (it.hasNext()) {
                C30111bl r2 = (C30111bl) it.next();
                if (r2.A0F().contains(r10.A0C)) {
                    arrayList.add(r2);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C30111bl r4 = (C30111bl) it2.next();
            int A002 = A00(r4, r11);
            if (A002 != 3) {
                StringBuilder sb = new StringBuilder("DatabaseMigrationManager/processMigrations; name=");
                sb.append(r10.A0C);
                sb.append("; cannot rollback, because reverse dependency ");
                sb.append(r4.A0C);
                sb.append(" cannot be rolled (");
                sb.append(A002);
                sb.append(")");
                Log.i(sb.toString());
                r11.A01++;
                return A002;
            }
        }
        if (r10.A0L() || r10.A0K() || r10.A0O()) {
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("DatabaseMigrationManager/processMigrations; name=");
                String str = r10.A0C;
                sb2.append(str);
                sb2.append("; trying to rollback migration.");
                Log.i(sb2.toString());
                r10.A0H();
                StringBuilder sb3 = new StringBuilder();
                sb3.append("DatabaseMigrationManager/processMigrations; name=");
                sb3.append(str);
                sb3.append("; migration was rolled back.");
                Log.i(sb3.toString());
                if (r10.A0L() || r10.A0K()) {
                    this.A00.AcB("db-rollback-had-no-effect", str, false);
                    r11.A01++;
                    return 3;
                }
                r11.A02++;
                return 3;
            } catch (Exception e2) {
                C16300so r42 = this.A00;
                StringBuilder sb4 = new StringBuilder("name=");
                String str2 = r10.A0C;
                sb4.append(str2);
                sb4.append(", ");
                sb4.append(e2);
                r42.AcB("db-rollback-failed", sb4.toString(), false);
                StringBuilder sb5 = new StringBuilder("DatabaseMigrationManager/processMigrations/error; name=");
                sb5.append(str2);
                sb5.append("; failed to rollback migration.");
                Log.e(sb5.toString());
                r11.A00++;
                return 4;
            }
        } else {
            StringBuilder sb6 = new StringBuilder("DatabaseMigrationManager/processMigrations; name=");
            sb6.append(r10.A0C);
            sb6.append("; rollback not needed, already in original state");
            Log.i(sb6.toString());
            return 3;
        }
    }

    public final AnonymousClass2Fu A01(C30101bk r20, List list) {
        List list2;
        boolean z2;
        int i2;
        StringBuilder sb;
        String str;
        Long A002;
        AnonymousClass2Fu r4 = new AnonymousClass2Fu();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        do {
            list2 = list;
            Iterator it = list2.iterator();
            z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C30111bl r8 = (C30111bl) it.next();
                StringBuilder sb2 = new StringBuilder("DatabaseMigrationManager/handleMigrationPhase; name=");
                String str2 = r8.A0C;
                sb2.append(str2);
                sb2.append("; start processing.");
                Log.i(sb2.toString());
                C30101bk r14 = r20;
                if (!r14.A00()) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("DatabaseMigrationManager/handleMigrationPhase; name=");
                    sb3.append(str2);
                    sb3.append("; conditions check requires to stop migration process.");
                    Log.i(sb3.toString());
                    break;
                }
                StringBuilder sb4 = new StringBuilder("DatabaseMigrationManager/processMigrations/");
                sb4.append(str2);
                Log.i(sb4.toString());
                char c2 = 3;
                char c3 = 2;
                if (r8.A03() != 3) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("DatabaseMigrationManager/processMigrations; name=");
                    sb5.append(str2);
                    sb5.append("; migration is disabled, skipping.");
                    Log.i(sb5.toString());
                    A03(r8, 3);
                } else {
                    if (r8.A0O()) {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append("DatabaseMigrationManager/processMigrations; name=");
                        sb6.append(str2);
                        sb6.append("; stale and needs rollback, skipping.");
                        Log.i(sb6.toString());
                        i2 = 10;
                    } else if (r8.A0L()) {
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("DatabaseMigrationManager/processMigrations; name=");
                        sb7.append(str2);
                        sb7.append("; already migrated, skipping.");
                        Log.i(sb7.toString());
                        A03(r8, 4);
                    } else if (r8.A0P() && !r8.A0M() && !r8.A0N()) {
                        StringBuilder sb8 = new StringBuilder();
                        sb8.append("DatabaseMigrationManager/processMigrations; name=");
                        sb8.append(str2);
                        sb8.append("; migration exceeds retry count; mark it as stuck and skip.");
                        Log.i(sb8.toString());
                        i2 = 8;
                    } else if (!r8.A0J()) {
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append("DatabaseMigrationManager/processMigrations; name=");
                        sb9.append(str2);
                        sb9.append("; not enough storage to migrate, skipping.");
                        Log.i(sb9.toString());
                        A03(r8, 2);
                    } else {
                        if (!r8.A0K()) {
                            long A052 = r8.A05();
                            if (A052 > 0 && (A002 = r8.A04.A00()) != null && A002.longValue() > A052) {
                                StringBuilder sb10 = new StringBuilder();
                                sb10.append("DatabaseMigrationManager/processMigrations; name=");
                                sb10.append(str2);
                                sb10.append("; database size is too large, skipping.");
                                Log.w(sb10.toString());
                                i2 = 9;
                            }
                        }
                        c3 = 1;
                        if (!r8.A0R()) {
                            StringBuilder sb11 = new StringBuilder();
                            sb11.append("DatabaseMigrationManager/processMigrations; name=");
                            sb11.append(str2);
                            sb11.append("; pre requisites check failed, not ready.");
                            Log.w(sb11.toString());
                            i2 = 5;
                        } else if (!r8.A0Q()) {
                            for (String str3 : r8.A0F()) {
                                C30111bl r12 = (C30111bl) this.A0B.A00().get(str3);
                                if (r12 == null) {
                                    sb = new StringBuilder();
                                    sb.append("DatabaseMigrationManager/processMigrations; name=");
                                    sb.append(str2);
                                    sb.append(";  has a dependency '");
                                    sb.append(str3);
                                    str = "' - not found, skipping.";
                                } else if (!r12.A0L()) {
                                    sb = new StringBuilder();
                                    sb.append("DatabaseMigrationManager/processMigrations; name=");
                                    sb.append(str2);
                                    sb.append("; has a dependency '");
                                    sb.append(str3);
                                    str = "' - not migrated, not ready.";
                                } else if (r12.A0O()) {
                                    sb = new StringBuilder();
                                    sb.append("DatabaseMigrationManager/processMigrations; name=");
                                    sb.append(str2);
                                    sb.append("; has a dependency '");
                                    sb.append(str3);
                                    str = "' - stale, not ready.";
                                }
                                sb.append(str);
                                Log.w(sb.toString());
                            }
                            i2 = 7;
                        } else {
                            if (!r8.A0T(r14)) {
                                c2 = 4;
                            }
                            c3 = c2;
                        }
                    }
                    A03(r8, i2);
                }
                if (c3 == 2) {
                    arrayList.add(r8);
                    r4.A01++;
                } else if (c3 == 3) {
                    arrayList.add(r8);
                    r4.A02++;
                    z2 = true;
                } else if (c3 == 4) {
                    arrayList.add(r8);
                    r4.A00++;
                    StringBuilder sb12 = new StringBuilder("DatabaseMigrationManager/handleMigrationPhase/migration failed; migration.name=");
                    sb12.append(str2);
                    Log.w(sb12.toString());
                    if (r8.A0P()) {
                        hashSet.add(str2);
                    }
                }
            }
            list2.removeAll(arrayList);
            arrayList.clear();
        } while (z2);
        if (this.A0C.A0E(C16620tM.A02, 2632)) {
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                C16300so r3 = this.A00;
                StringBuilder sb13 = new StringBuilder("db-migration-stuck/");
                sb13.append((String) it2.next());
                r3.AcB(sb13.toString(), (String) null, false);
            }
        }
        r4.A01 += (long) list2.size();
        return r4;
    }

    public void A02(int i2) {
        Log.i("DatabaseMigrationManager/processAllConsistencyChecks");
        A04(new C30101bk(new C30091bj[0]), this.A0B.A00().keySet(), 8, i2);
    }

    public void A03(C30111bl r9, int i2) {
        C16900tq r0 = this.A09;
        r0.A04();
        double length = (double) r0.A06.length();
        AnonymousClass2EF r2 = new AnonymousClass2EF();
        long j2 = (long) length;
        List list = this.A0A.A00;
        r2.A01 = Double.valueOf((double) C24811Hj.A00(list, j2));
        r2.A00 = Double.valueOf((double) C24811Hj.A00(list, j2));
        r2.A09 = r9.A0C;
        r2.A02 = Double.valueOf((double) C24811Hj.A00(list, (long) ((double) this.A06.A02())));
        r2.A05 = 0L;
        r2.A07 = 0L;
        r2.A08 = 0L;
        r2.A06 = Long.valueOf(r9.A07());
        r2.A04 = 1;
        r2.A03 = Integer.valueOf(i2);
        this.A0D.A06(r2);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:30|37|38|39|40) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00f7, code lost:
        if (r7 == null) goto L_0x00fc;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:189:0x0420 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:194:0x0425 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:199:0x042a */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00fc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x0101 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x012f */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x0134 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:56:0x0122=Splitter:B:56:0x0122, B:64:0x012f=Splitter:B:64:0x012f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(X.C30101bk r38, java.util.Set r39, int r40, int r41) {
        /*
            r37 = this;
            r11 = r39
            boolean r0 = r11.isEmpty()
            r23 = 1
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = "DatabaseMigrationManager/processMigrations/no migrations requested, skipping."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r23
        L_0x0010:
            r4 = r37
            java.util.concurrent.atomic.AtomicBoolean r0 = r4.A0E
            r36 = r0
            r1 = 1
            boolean r0 = r0.getAndSet(r1)
            r3 = 0
            if (r0 == 0) goto L_0x0024
            java.lang.String r0 = "DatabaseMigrationManager/processMigrations/migrations already in progress"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return r3
        L_0x0024:
            X.2Fv r2 = new X.2Fv
            r2.<init>()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r41)
            r2.A04 = r0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.A00 = r0
            r16 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            r2.A05 = r0
            X.1Hj r7 = r4.A0A
            X.0pf r0 = r4.A06
            long r0 = r0.A02()
            double r5 = (double) r0
            long r0 = (long) r5
            java.util.List r5 = r7.A00
            r35 = r5
            long r5 = X.C24811Hj.A00(r5, r0)
            double r0 = (double) r5
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.A03 = r0
            X.0ww r0 = r4.A08
            r34 = r0
            java.lang.Long r0 = r34.A00()
            if (r0 == 0) goto L_0x008d
            long r0 = r0.longValue()
            r5 = r35
            long r5 = X.C24811Hj.A00(r5, r0)
            double r0 = (double) r5
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
        L_0x006d:
            r2.A02 = r0
            int r0 = r11.size()
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A06 = r0
            java.lang.String r1 = "DatabaseMigrationManager/processMigrations"
            X.1Zf r24 = new X.1Zf
            r0 = r24
            r0.<init>((java.lang.String) r1)
            X.0xj r0 = r4.A03
            r33 = r0
            r5 = 5
            r1 = 1
            r0.A00(r5, r1)
            goto L_0x008f
        L_0x008d:
            r0 = 0
            goto L_0x006d
        L_0x008f:
            X.14v r8 = r4.A07     // Catch:{ Exception -> 0x0523 }
            X.1Zf r10 = new X.1Zf     // Catch:{ Exception -> 0x0523 }
            r10.<init>((boolean) r3)     // Catch:{ Exception -> 0x0523 }
            r10.A03()     // Catch:{ Exception -> 0x0523 }
            r5 = 0
            X.0tq r0 = r8.A01     // Catch:{ SQLiteBlobTooBigException -> 0x0102 }
            X.0tf r9 = r0.get()     // Catch:{ SQLiteBlobTooBigException -> 0x0102 }
            X.0tg r1 = r9.A02     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = "SELECT _id, user, server, agent, device, type, raw_string FROM jid"
            android.database.Cursor r7 = r1.A08(r0, r5)     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = "_id"
            int r6 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = "user"
            int r27 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = "server"
            int r28 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = "agent"
            int r29 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = "device"
            int r30 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = "type"
            int r31 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = "raw_string"
            int r32 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00f6 }
        L_0x00d5:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x00ef
            long r0 = r7.getLong(r6)     // Catch:{ all -> 0x00f6 }
            r25 = r8
            r26 = r7
            com.whatsapp.jid.Jid r5 = r25.A04(r26, r27, r28, r29, r30, r31, r32)     // Catch:{ all -> 0x00ed }
            if (r5 == 0) goto L_0x00d5
            r8.A0B(r5, r0)     // Catch:{ all -> 0x00ed }
            goto L_0x00d5
        L_0x00ed:
            r0 = move-exception
            goto L_0x00f9
        L_0x00ef:
            r7.close()     // Catch:{ all -> 0x00fd }
            r9.close()     // Catch:{ SQLiteBlobTooBigException -> 0x0102 }
            goto L_0x0161
        L_0x00f6:
            r0 = move-exception
            if (r7 == 0) goto L_0x00fc
        L_0x00f9:
            r7.close()     // Catch:{ all -> 0x00fc }
        L_0x00fc:
            throw r0     // Catch:{ all -> 0x00fd }
        L_0x00fd:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0101 }
        L_0x0101:
            throw r0     // Catch:{ SQLiteBlobTooBigException -> 0x0102 }
        L_0x0102:
            r6 = -1
            X.0tq r0 = r8.A01     // Catch:{ Exception -> 0x0135 }
            X.0tf r1 = r0.get()     // Catch:{ Exception -> 0x0135 }
            X.0tg r7 = r1.A02     // Catch:{ all -> 0x0130 }
            java.lang.String r5 = "SELECT COUNT(*) as count FROM jid"
            r0 = 0
            android.database.Cursor r5 = r7.A08(r5, r0)     // Catch:{ all -> 0x0130 }
            boolean r0 = r5.moveToLast()     // Catch:{ all -> 0x0129 }
            if (r0 == 0) goto L_0x0122
            java.lang.String r0 = "count"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0129 }
            int r6 = r5.getInt(r0)     // Catch:{ all -> 0x0129 }
        L_0x0122:
            r5.close()     // Catch:{ all -> 0x0130 }
            r1.close()     // Catch:{ Exception -> 0x0135 }
            goto L_0x013b
        L_0x0129:
            r0 = move-exception
            if (r5 == 0) goto L_0x012f
            r5.close()     // Catch:{ all -> 0x012f }
        L_0x012f:
            throw r0     // Catch:{ all -> 0x0130 }
        L_0x0130:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0134 }
        L_0x0134:
            throw r0     // Catch:{ Exception -> 0x0135 }
        L_0x0135:
            r1 = move-exception
            java.lang.String r0 = "JidStore/populateJidRowIdCache/failed to get count"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ Exception -> 0x0523 }
        L_0x013b:
            java.lang.String r1 = "JidStore/populateJidRowIdCache(); failing to load the window for "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0523 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0523 }
            r0.append(r6)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0523 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0523 }
            X.0so r5 = r8.A00     // Catch:{ Exception -> 0x0523 }
            java.lang.String r1 = "failing to load the window for "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0523 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0523 }
            r0.append(r6)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x0523 }
            java.lang.String r0 = "JidStore/populateJidRowIdCache/blobTooBig"
            r5.AcB(r0, r1, r3)     // Catch:{ Exception -> 0x0523 }
        L_0x0161:
            java.util.Map r0 = r8.A04     // Catch:{ Exception -> 0x0523 }
            r0.size()     // Catch:{ Exception -> 0x0523 }
            r10.A01()     // Catch:{ Exception -> 0x0523 }
            X.11D r0 = r4.A0B     // Catch:{ Exception -> 0x0523 }
            X.0vs r7 = r0.A00()     // Catch:{ Exception -> 0x0523 }
            java.util.HashSet r5 = new java.util.HashSet     // Catch:{ Exception -> 0x0523 }
            r5.<init>()     // Catch:{ Exception -> 0x0523 }
            java.util.LinkedList r6 = new java.util.LinkedList     // Catch:{ Exception -> 0x0523 }
            r6.<init>(r11)     // Catch:{ Exception -> 0x0523 }
        L_0x0179:
            java.lang.Object r1 = r6.poll()     // Catch:{ Exception -> 0x0523 }
            if (r1 == 0) goto L_0x0198
            boolean r0 = r5.contains(r1)     // Catch:{ Exception -> 0x0523 }
            if (r0 != 0) goto L_0x0179
            r5.add(r1)     // Catch:{ Exception -> 0x0523 }
            java.lang.Object r0 = r7.get(r1)     // Catch:{ Exception -> 0x0523 }
            X.1bl r0 = (X.C30111bl) r0     // Catch:{ Exception -> 0x0523 }
            if (r0 == 0) goto L_0x0179
            java.util.Set r0 = r0.A0F()     // Catch:{ Exception -> 0x0523 }
            r6.addAll(r0)     // Catch:{ Exception -> 0x0523 }
            goto L_0x0179
        L_0x0198:
            java.util.HashSet r6 = new java.util.HashSet     // Catch:{ Exception -> 0x0523 }
            r6.<init>()     // Catch:{ Exception -> 0x0523 }
            java.util.HashMap r10 = new java.util.HashMap     // Catch:{ Exception -> 0x0523 }
            r10.<init>()     // Catch:{ Exception -> 0x0523 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x0523 }
        L_0x01a6:
            boolean r0 = r5.hasNext()     // Catch:{ Exception -> 0x0523 }
            if (r0 == 0) goto L_0x01be
            java.lang.Object r1 = r5.next()     // Catch:{ Exception -> 0x0523 }
            java.lang.Object r0 = r7.get(r1)     // Catch:{ Exception -> 0x0523 }
            if (r0 == 0) goto L_0x01ba
            r10.put(r1, r0)     // Catch:{ Exception -> 0x0523 }
            goto L_0x01a6
        L_0x01ba:
            r6.add(r1)     // Catch:{ Exception -> 0x0523 }
            goto L_0x01a6
        L_0x01be:
            boolean r0 = r6.isEmpty()     // Catch:{ Exception -> 0x0523 }
            if (r0 != 0) goto L_0x01cf
            X.0so r5 = r4.A00     // Catch:{ Exception -> 0x0523 }
            java.lang.String r1 = r6.toString()     // Catch:{ Exception -> 0x0523 }
            java.lang.String r0 = "db-missing-migration-name"
            r5.AcB(r0, r1, r3)     // Catch:{ Exception -> 0x0523 }
        L_0x01cf:
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ Exception -> 0x0523 }
            r8.<init>()     // Catch:{ Exception -> 0x0523 }
            java.util.Set r0 = r10.entrySet()     // Catch:{ Exception -> 0x0523 }
            java.util.Iterator r6 = r0.iterator()     // Catch:{ Exception -> 0x0523 }
        L_0x01dc:
            boolean r0 = r6.hasNext()     // Catch:{ Exception -> 0x0523 }
            if (r0 == 0) goto L_0x01f9
            java.lang.Object r0 = r6.next()     // Catch:{ Exception -> 0x0523 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ Exception -> 0x0523 }
            java.lang.Object r5 = r0.getKey()     // Catch:{ Exception -> 0x0523 }
            r0.getValue()     // Catch:{ Exception -> 0x0523 }
            r0 = 1
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0523 }
            r8.put(r5, r0)     // Catch:{ Exception -> 0x0523 }
            goto L_0x01dc
        L_0x01f9:
            java.util.ArrayDeque r9 = new java.util.ArrayDeque     // Catch:{ Exception -> 0x0523 }
            r9.<init>()     // Catch:{ Exception -> 0x0523 }
            java.util.Set r1 = r8.keySet()     // Catch:{ Exception -> 0x0523 }
            java.util.HashSet r0 = new java.util.HashSet     // Catch:{ Exception -> 0x0523 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0523 }
            java.util.Iterator r18 = r0.iterator()     // Catch:{ Exception -> 0x0523 }
        L_0x020b:
            boolean r0 = r18.hasNext()     // Catch:{ Exception -> 0x0523 }
            if (r0 == 0) goto L_0x02a4
            java.lang.Object r0 = r18.next()     // Catch:{ Exception -> 0x0523 }
            r9.add(r0)     // Catch:{ Exception -> 0x0523 }
        L_0x0218:
            boolean r0 = r9.isEmpty()     // Catch:{ Exception -> 0x0523 }
            if (r0 != 0) goto L_0x020b
            java.lang.Object r7 = r9.poll()     // Catch:{ Exception -> 0x0523 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0523 }
            java.lang.Object r0 = r10.get(r7)     // Catch:{ Exception -> 0x0523 }
            X.1bl r0 = (X.C30111bl) r0     // Catch:{ Exception -> 0x0523 }
            if (r0 != 0) goto L_0x0257
            java.lang.String r0 = "DatabaseMigrationManager/sortedMigrations; can't get migration with name "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0523 }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0523 }
            r1.append(r7)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r0 = "from a map of migrations"
            r1.append(r0)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0523 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0523 }
            X.0so r5 = r4.A00     // Catch:{ Exception -> 0x0523 }
            java.lang.String r1 = "DatabaseMigrationManager/sortedMigrations/missing dependent migration; name="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0523 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0523 }
            r0.append(r7)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r1 = r0.toString()     // Catch:{ Exception -> 0x0523 }
            r0 = 0
            r5.AcB(r1, r0, r3)     // Catch:{ Exception -> 0x0523 }
            goto L_0x0218
        L_0x0257:
            java.util.Set r0 = r0.A0F()     // Catch:{ Exception -> 0x0523 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ Exception -> 0x0523 }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ Exception -> 0x0523 }
        L_0x0262:
            boolean r0 = r15.hasNext()     // Catch:{ Exception -> 0x0523 }
            if (r0 == 0) goto L_0x0218
            java.lang.Object r1 = r15.next()     // Catch:{ Exception -> 0x0523 }
            java.lang.Object r5 = r8.get(r1)     // Catch:{ Exception -> 0x0523 }
            java.lang.Long r5 = (java.lang.Long) r5     // Catch:{ Exception -> 0x0523 }
            r13 = 1
            if (r5 != 0) goto L_0x027d
            java.lang.Long r5 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x0523 }
            r8.put(r1, r5)     // Catch:{ Exception -> 0x0523 }
        L_0x027d:
            java.lang.Object r0 = r8.get(r7)     // Catch:{ Exception -> 0x0523 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ Exception -> 0x0523 }
            if (r0 != 0) goto L_0x028c
            java.lang.Long r0 = java.lang.Long.valueOf(r13)     // Catch:{ Exception -> 0x0523 }
            r8.put(r7, r0)     // Catch:{ Exception -> 0x0523 }
        L_0x028c:
            long r11 = r5.longValue()     // Catch:{ Exception -> 0x0523 }
            long r5 = r0.longValue()     // Catch:{ Exception -> 0x0523 }
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0262
            long r5 = r5 + r13
            java.lang.Long r0 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0523 }
            r8.put(r1, r0)     // Catch:{ Exception -> 0x0523 }
            r9.add(r1)     // Catch:{ Exception -> 0x0523 }
            goto L_0x0262
        L_0x02a4:
            java.util.Collection r0 = r10.values()     // Catch:{ Exception -> 0x0523 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x0523 }
            r5.<init>(r0)     // Catch:{ Exception -> 0x0523 }
            X.2Fw r0 = new X.2Fw     // Catch:{ Exception -> 0x0523 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x0523 }
            java.util.Collections.sort(r5, r0)     // Catch:{ Exception -> 0x0523 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x0523 }
            r6.<init>(r5)     // Catch:{ Exception -> 0x0523 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x0523 }
            r1.<init>(r5)     // Catch:{ Exception -> 0x0523 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ Exception -> 0x0523 }
            r9.<init>()     // Catch:{ Exception -> 0x0523 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ Exception -> 0x0523 }
            r7.<init>()     // Catch:{ Exception -> 0x0523 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x0523 }
        L_0x02cd:
            boolean r0 = r5.hasNext()     // Catch:{ Exception -> 0x0523 }
            if (r0 == 0) goto L_0x02dd
            java.lang.Object r0 = r5.next()     // Catch:{ Exception -> 0x0523 }
            X.1bl r0 = (X.C30111bl) r0     // Catch:{ Exception -> 0x0523 }
            r9.add(r0)     // Catch:{ Exception -> 0x0523 }
            goto L_0x02cd
        L_0x02dd:
            r0 = r40 & 1
            if (r0 == 0) goto L_0x0321
            X.2Fu r8 = new X.2Fu     // Catch:{ Exception -> 0x0523 }
            r8.<init>()     // Catch:{ Exception -> 0x0523 }
            java.util.Iterator r11 = r6.iterator()     // Catch:{ Exception -> 0x0523 }
        L_0x02ea:
            boolean r0 = r11.hasNext()     // Catch:{ Exception -> 0x0523 }
            if (r0 == 0) goto L_0x0326
            java.lang.Object r10 = r11.next()     // Catch:{ Exception -> 0x0523 }
            X.1bl r10 = (X.C30111bl) r10     // Catch:{ Exception -> 0x0523 }
            boolean r0 = r10.A0K()     // Catch:{ Exception -> 0x0523 }
            if (r0 != 0) goto L_0x0302
            boolean r0 = r10.A0L()     // Catch:{ Exception -> 0x0523 }
            if (r0 == 0) goto L_0x031a
        L_0x0302:
            int r5 = r10.A03()     // Catch:{ Exception -> 0x0523 }
            r0 = 1
            if (r5 != r0) goto L_0x031a
        L_0x0309:
            int r5 = r4.A00(r10, r8)     // Catch:{ Exception -> 0x0523 }
            r0 = 3
            if (r5 == r0) goto L_0x02ea
            X.0so r6 = r4.A00     // Catch:{ Exception -> 0x0523 }
            java.lang.String r5 = r10.A0C     // Catch:{ Exception -> 0x0523 }
            java.lang.String r0 = "db-rollback-not-completed"
            r6.AcB(r0, r5, r3)     // Catch:{ Exception -> 0x0523 }
            goto L_0x02ea
        L_0x031a:
            boolean r0 = r10.A0O()     // Catch:{ Exception -> 0x0523 }
            if (r0 == 0) goto L_0x02ea
            goto L_0x0309
        L_0x0321:
            X.2Fu r8 = new X.2Fu     // Catch:{ Exception -> 0x0523 }
            r8.<init>()     // Catch:{ Exception -> 0x0523 }
        L_0x0326:
            r0 = r40 & 2
            r5 = r38
            if (r0 == 0) goto L_0x0331
            X.2Fu r6 = r4.A01(r5, r9)     // Catch:{ Exception -> 0x0523 }
            goto L_0x0336
        L_0x0331:
            X.2Fu r6 = new X.2Fu     // Catch:{ Exception -> 0x0523 }
            r6.<init>()     // Catch:{ Exception -> 0x0523 }
        L_0x0336:
            r0 = r40 & 4
            if (r0 == 0) goto L_0x033f
            X.2Fu r5 = r4.A01(r5, r7)     // Catch:{ Exception -> 0x0523 }
            goto L_0x0344
        L_0x033f:
            X.2Fu r5 = new X.2Fu     // Catch:{ Exception -> 0x0523 }
            r5.<init>()     // Catch:{ Exception -> 0x0523 }
        L_0x0344:
            r0 = r40 & 8
            if (r0 == 0) goto L_0x0467
            java.lang.String r0 = "DatabaseMigrationManager/handleConsistencyPhase"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0523 }
            X.2Fu r7 = new X.2Fu     // Catch:{ Exception -> 0x0523 }
            r7.<init>()     // Catch:{ Exception -> 0x0523 }
            java.util.Iterator r22 = r1.iterator()     // Catch:{ Exception -> 0x0523 }
        L_0x0356:
            boolean r0 = r22.hasNext()     // Catch:{ Exception -> 0x0523 }
            if (r0 == 0) goto L_0x046c
            java.lang.Object r11 = r22.next()     // Catch:{ Exception -> 0x0523 }
            X.1bl r11 = (X.C30111bl) r11     // Catch:{ Exception -> 0x0523 }
            boolean r0 = r11 instanceof X.AnonymousClass2EL     // Catch:{ Exception -> 0x0523 }
            if (r0 == 0) goto L_0x0356
            r20 = 1
            java.lang.String r1 = "DatabaseMigration/checkConsistency; name="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0430 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0430 }
            java.lang.String r13 = r11.A0C     // Catch:{ Exception -> 0x0430 }
            r0.append(r13)     // Catch:{ Exception -> 0x0430 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0430 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0430 }
            X.0tq r1 = r11.A05     // Catch:{ Exception -> 0x0430 }
            r1.A03()     // Catch:{ Exception -> 0x0430 }
            r1.A04()     // Catch:{ Exception -> 0x0430 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r1.A07     // Catch:{ Exception -> 0x0430 }
            r25 = r0
            r25.lock()     // Catch:{ Exception -> 0x0430 }
            r14 = r11
            X.2EL r14 = (X.AnonymousClass2EL) r14     // Catch:{ Exception -> 0x0430 }
            X.0tf r19 = r1.A02()     // Catch:{ all -> 0x042b }
            X.1cj r18 = r19.A00()     // Catch:{ all -> 0x0426 }
            X.17G r0 = r14.A02     // Catch:{ all -> 0x0421 }
            boolean r0 = r0.A09()     // Catch:{ all -> 0x0421 }
            if (r0 == 0) goto L_0x03cc
            r9 = 0
            r1 = 1
            X.2Fx r0 = new X.2Fx     // Catch:{ all -> 0x0421 }
            r0.<init>(r9, r1)     // Catch:{ all -> 0x0421 }
        L_0x03a4:
            boolean r1 = r0.A01     // Catch:{ all -> 0x0421 }
            if (r1 != 0) goto L_0x03c8
            X.0so r9 = r11.A01     // Catch:{ all -> 0x0421 }
            java.lang.String r1 = "db-inconsistent-state"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x0421 }
            r10.<init>()     // Catch:{ all -> 0x0421 }
            r10.append(r13)     // Catch:{ all -> 0x0421 }
            java.lang.String r12 = ": "
            r10.append(r12)     // Catch:{ all -> 0x0421 }
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x0421 }
            r10.append(r0)     // Catch:{ all -> 0x0421 }
            java.lang.String r0 = r10.toString()     // Catch:{ all -> 0x0421 }
            r9.AcB(r1, r0, r3)     // Catch:{ all -> 0x0421 }
            r14.A0H()     // Catch:{ all -> 0x0421 }
        L_0x03c8:
            r18.A00()     // Catch:{ all -> 0x0421 }
            goto L_0x040b
        L_0x03cc:
            r12 = 1
            java.lang.String r10 = ""
            X.0tq r0 = r14.A05     // Catch:{ all -> 0x0421 }
            X.0tf r9 = r0.get()     // Catch:{ all -> 0x0421 }
            r0.A04()     // Catch:{ all -> 0x041c }
            java.lang.String r15 = "message_view"
            X.0tg r1 = r9.A02     // Catch:{ all -> 0x041c }
            X.AnonymousClass00B.A06(r1)     // Catch:{ all -> 0x041c }
            java.lang.String r0 = "view"
            java.lang.String r1 = X.C33961jT.A00(r1, r0, r15)     // Catch:{ all -> 0x041c }
            java.lang.String r0 = " messages "
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x041c }
            r0 = r0 ^ 1
            r9.close()     // Catch:{ all -> 0x0421 }
            if (r0 == 0) goto L_0x0405
            r12 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0421 }
            r1.<init>()     // Catch:{ all -> 0x0421 }
            r1.append(r10)     // Catch:{ all -> 0x0421 }
            java.lang.String r0 = "+inconsistent_views"
            r1.append(r0)     // Catch:{ all -> 0x0421 }
            java.lang.String r10 = r1.toString()     // Catch:{ all -> 0x0421 }
        L_0x0405:
            X.2Fx r0 = new X.2Fx     // Catch:{ all -> 0x0421 }
            r0.<init>(r10, r12)     // Catch:{ all -> 0x0421 }
            goto L_0x03a4
        L_0x040b:
            r18.close()     // Catch:{ all -> 0x0426 }
            r19.close()     // Catch:{ all -> 0x042b }
            r25.unlock()     // Catch:{ Exception -> 0x0430 }
            long r0 = r7.A02     // Catch:{ Exception -> 0x0430 }
            long r0 = r0 + r20
            r7.A02 = r0     // Catch:{ Exception -> 0x0430 }
            goto L_0x0356
        L_0x041c:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0420 }
        L_0x0420:
            throw r0     // Catch:{ all -> 0x0421 }
        L_0x0421:
            r0 = move-exception
            r18.close()     // Catch:{ all -> 0x0425 }
        L_0x0425:
            throw r0     // Catch:{ all -> 0x0426 }
        L_0x0426:
            r0 = move-exception
            r19.close()     // Catch:{ all -> 0x042a }
        L_0x042a:
            throw r0     // Catch:{ all -> 0x042b }
        L_0x042b:
            r0 = move-exception
            r25.unlock()     // Catch:{ Exception -> 0x0430 }
            throw r0     // Catch:{ Exception -> 0x0430 }
        L_0x0430:
            r12 = move-exception
            java.lang.String r1 = "DatabaseMigrationManager/handleConsistencyPhase; checkConsistency failed for "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0523 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r10 = r11.A0C     // Catch:{ Exception -> 0x0523 }
            r0.append(r10)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x0523 }
            com.whatsapp.util.Log.e(r0, r12)     // Catch:{ Exception -> 0x0523 }
            X.0so r9 = r4.A00     // Catch:{ Exception -> 0x0523 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0523 }
            r1.<init>()     // Catch:{ Exception -> 0x0523 }
            r1.append(r10)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r0 = ": "
            r1.append(r0)     // Catch:{ Exception -> 0x0523 }
            r1.append(r12)     // Catch:{ Exception -> 0x0523 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0523 }
            java.lang.String r0 = "db-consistency-check-failure"
            r9.AcB(r0, r1, r3)     // Catch:{ Exception -> 0x0523 }
            long r0 = r7.A00     // Catch:{ Exception -> 0x0523 }
            long r0 = r0 + r20
            r7.A00 = r0     // Catch:{ Exception -> 0x0523 }
            goto L_0x0356
        L_0x0467:
            X.2Fu r7 = new X.2Fu     // Catch:{ Exception -> 0x0523 }
            r7.<init>()     // Catch:{ Exception -> 0x0523 }
        L_0x046c:
            long r0 = r8.A02     // Catch:{ Exception -> 0x0523 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0523 }
            r2.A0G = r0     // Catch:{ Exception -> 0x0523 }
            long r0 = r8.A01     // Catch:{ Exception -> 0x0523 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0523 }
            r2.A0F = r0     // Catch:{ Exception -> 0x0523 }
            long r0 = r8.A00     // Catch:{ Exception -> 0x0523 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0523 }
            r2.A0E = r0     // Catch:{ Exception -> 0x0523 }
            long r0 = r6.A02     // Catch:{ Exception -> 0x0523 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0523 }
            r2.A0D = r0     // Catch:{ Exception -> 0x0523 }
            long r0 = r6.A01     // Catch:{ Exception -> 0x0523 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0523 }
            r2.A0C = r0     // Catch:{ Exception -> 0x0523 }
            long r0 = r6.A00     // Catch:{ Exception -> 0x0523 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0523 }
            r2.A0B = r0     // Catch:{ Exception -> 0x0523 }
            long r0 = r5.A02     // Catch:{ Exception -> 0x0523 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0523 }
            r2.A0J = r0     // Catch:{ Exception -> 0x0523 }
            long r0 = r5.A01     // Catch:{ Exception -> 0x0523 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0523 }
            r2.A0I = r0     // Catch:{ Exception -> 0x0523 }
            long r0 = r5.A00     // Catch:{ Exception -> 0x0523 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0523 }
            r2.A0H = r0     // Catch:{ Exception -> 0x0523 }
            long r0 = r7.A02     // Catch:{ Exception -> 0x0523 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0523 }
            r2.A0A = r0     // Catch:{ Exception -> 0x0523 }
            long r0 = r7.A01     // Catch:{ Exception -> 0x0523 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0523 }
            r2.A09 = r0     // Catch:{ Exception -> 0x0523 }
            long r0 = r7.A00     // Catch:{ Exception -> 0x0523 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0523 }
            r2.A08 = r0     // Catch:{ Exception -> 0x0523 }
            long r0 = r24.A01()     // Catch:{ Exception -> 0x0523 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0523 }
            r2.A07 = r0     // Catch:{ Exception -> 0x0523 }
            java.lang.Long r0 = r34.A00()     // Catch:{ Exception -> 0x0523 }
            if (r0 == 0) goto L_0x04fd
            long r0 = r0.longValue()     // Catch:{ Exception -> 0x0523 }
            r5 = r35
            long r7 = X.C24811Hj.A00(r5, r0)     // Catch:{ Exception -> 0x0523 }
            double r0 = (double) r7     // Catch:{ Exception -> 0x0523 }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ Exception -> 0x0523 }
        L_0x04eb:
            r2.A01 = r0     // Catch:{ Exception -> 0x0523 }
            long r0 = r6.A02     // Catch:{ Exception -> 0x0523 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ Exception -> 0x0523 }
            r2.A05 = r0     // Catch:{ Exception -> 0x0523 }
            long r5 = r6.A00     // Catch:{ Exception -> 0x0523 }
            int r1 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x0500
            goto L_0x04ff
        L_0x04fd:
            r0 = 0
            goto L_0x04eb
        L_0x04ff:
            r0 = 1
        L_0x0500:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0523 }
            r2.A00 = r0     // Catch:{ Exception -> 0x0523 }
            r1 = 5
            r0 = r33
            r0.A00(r1, r3)
            java.lang.Boolean r0 = r2.A00
            boolean r1 = r0.booleanValue()
            X.0t9 r0 = r4.A0D
            if (r1 == 0) goto L_0x051f
            r0.A06(r2)
        L_0x0519:
            r0 = r36
            r0.set(r3)
            return r23
        L_0x051f:
            r0.A05(r2)
            goto L_0x0519
        L_0x0523:
            r6 = move-exception
            java.lang.String r0 = "DatabaseMigrationManager/processMigrations/error while processing scheduled migrations."
            com.whatsapp.util.Log.e(r0, r6)     // Catch:{ all -> 0x0551 }
            X.0so r5 = r4.A00     // Catch:{ all -> 0x0551 }
            java.lang.String r1 = "db-process-migration-failure"
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0551 }
            r5.AcB(r1, r0, r3)     // Catch:{ all -> 0x0551 }
            r1 = 5
            r0 = r33
            r0.A00(r1, r3)
            java.lang.Boolean r0 = r2.A00
            boolean r1 = r0.booleanValue()
            X.0t9 r0 = r4.A0D
            if (r1 == 0) goto L_0x054d
            r0.A06(r2)
        L_0x0547:
            r0 = r36
            r0.set(r3)
            return r3
        L_0x054d:
            r0.A05(r2)
            goto L_0x0547
        L_0x0551:
            r5 = move-exception
            r1 = 5
            r0 = r33
            r0.A00(r1, r3)
            java.lang.Boolean r0 = r2.A00
            boolean r1 = r0.booleanValue()
            X.0t9 r0 = r4.A0D
            if (r1 == 0) goto L_0x056b
            r0.A06(r2)
        L_0x0565:
            r0 = r36
            r0.set(r3)
            throw r5
        L_0x056b:
            r0.A05(r2)
            goto L_0x0565
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass11E.A04(X.1bk, java.util.Set, int, int):boolean");
    }
}
