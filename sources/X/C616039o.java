package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.39o  reason: invalid class name and case insensitive filesystem */
public class C616039o {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public final C16300so A0A;
    public final C16180sb A0B;
    public final C40961uy A0C;
    public final C16200sd A0D;
    public final AnonymousClass1I1 A0E;
    public final C19670yo A0F;
    public final AnonymousClass12M A0G;
    public final AnonymousClass39E A0H;
    public final AnonymousClass12T A0I;
    public final AnonymousClass2GJ A0J;
    public final C82474Cy A0K;
    public final AnonymousClass2GM A0L;
    public final C108485Oe A0M;
    public final C16190sc A0N;
    public final AnonymousClass12W A0O;
    public final C16440t3 A0P;
    public final C16980tz A0Q;
    public final C16260sj A0R;
    public final C15860rz A0S;
    public final C16250si A0T;
    public final C16900tq A0U;
    public final C14710pd A0V;
    public final C16490t9 A0W;
    public final AnonymousClass2GT A0X;
    public final C17190ug A0Y;
    public final String A0Z;
    public final List A0a;
    public final Map A0b = new ConcurrentHashMap();
    public final AtomicInteger A0c = new AtomicInteger(0);
    public final AtomicLong A0d = new AtomicLong(0);
    public final AtomicLong A0e;
    public final AtomicLong A0f = new AtomicLong(0);
    public final AtomicLong A0g;
    public final boolean A0h;

    public C616039o(C16300so r5, C16180sb r6, C40961uy r7, C16200sd r8, AnonymousClass1I1 r9, C19670yo r10, AnonymousClass12M r11, AnonymousClass39E r12, AnonymousClass12T r13, AnonymousClass2GJ r14, AnonymousClass2GM r15, C108485Oe r16, C16190sc r17, AnonymousClass12W r18, C16440t3 r19, C16980tz r20, C16260sj r21, C15860rz r22, C16250si r23, C16900tq r24, C14710pd r25, C16490t9 r26, AnonymousClass2GT r27, C17190ug r28, String str, List list, AtomicLong atomicLong, AtomicLong atomicLong2, boolean z2) {
        this.A0Q = r20;
        this.A0Z = str;
        this.A0P = r19;
        this.A0V = r25;
        this.A0A = r5;
        this.A0a = list;
        this.A0B = r6;
        this.A0G = r11;
        this.A0W = r26;
        this.A0N = r17;
        this.A0g = atomicLong;
        this.A0Y = r28;
        this.A0J = r14;
        this.A0D = r8;
        this.A0H = r12;
        this.A0O = r18;
        this.A0L = r15;
        this.A0h = z2;
        this.A0e = atomicLong2;
        this.A0T = r23;
        this.A0U = r24;
        this.A0I = r13;
        this.A0R = r21;
        this.A0S = r22;
        this.A0E = r9;
        this.A0F = r10;
        this.A0X = r27;
        this.A0C = r7;
        this.A0M = r16;
        this.A0K = new C82474Cy(r12);
    }

    public final void A00() {
        AnonymousClass2GT r3;
        double d2 = 0.0d;
        try {
            File A0A2 = this.A0T.A0A();
            r3 = this.A0X;
            r3.A03 = Double.valueOf(A0A2 != null ? (double) A0A2.length() : 0.0d);
        } catch (IOException e2) {
            Log.e("gdrive/backup", e2);
            r3 = this.A0X;
            r3.A03 = Double.valueOf(0.0d);
        }
        AtomicLong atomicLong = this.A0e;
        if (((double) atomicLong.get()) > r3.A03.doubleValue()) {
            d2 = ((double) atomicLong.get()) - r3.A03.doubleValue();
        }
        r3.A05 = Double.valueOf(d2);
        r3.A07 = Double.valueOf((double) this.A05);
        long j2 = 0;
        for (File file : this.A0a) {
            long j3 = 0;
            if (file.exists()) {
                if (file.isDirectory()) {
                    LinkedList linkedList = new LinkedList();
                    linkedList.add(file);
                    long j4 = 0;
                    while (linkedList.peek() != null) {
                        Object poll = linkedList.poll();
                        AnonymousClass00B.A06(poll);
                        File[] listFiles = ((File) poll).listFiles();
                        if (listFiles != null) {
                            for (File file2 : listFiles) {
                                if (file2.exists()) {
                                    if (file2.isDirectory()) {
                                        linkedList.add(file2);
                                    } else {
                                        j4 += file2.length() > 0 ? 1 : 0;
                                    }
                                }
                            }
                        }
                    }
                    j3 = j4;
                } else if (file.length() > 0) {
                    j3 = 1;
                }
            }
            j2 += j3;
        }
        r3.A04 = Double.valueOf((double) j2);
        C15860rz r1 = this.A0S;
        r3.A0L = C13690nt.A0W(r1.A0D());
        r3.A00 = Boolean.valueOf(r1.A1a());
        r3.A0I = Long.valueOf(this.A0F.A00 == 1 ? 1 : 0);
        if (r3.A0D == null) {
            r3.A0D = 1;
        }
        AnonymousClass2GM r2 = this.A0L;
        r3.A06 = Double.valueOf((double) (r2.A07.A00 + r2.A0I.get()));
        Integer num = r3.A0C;
        if (num == null || num.intValue() == 1) {
            r3.A0C = C13680ns.A0Z();
        }
        this.A0W.A05(r3);
        Log.i(AnonymousClass000.A0h(AnonymousClass2GK.A0A(r3), AnonymousClass000.A0r("gdrive/backup ")));
    }

    public void A01(File file, String str) {
        if (this.A0b.get(AnonymousClass2GK.A08(this.A0Q.A00, this.A0N, file)) == null) {
            StringBuilder A0r = AnonymousClass000.A0r("gdrive/backup/files/");
            A0r.append(str);
            Log.e(AnonymousClass000.A0h("/cancel-backup", A0r));
            StringBuilder A0r2 = AnonymousClass000.A0r("File ");
            A0r2.append(file);
            throw new C71093iT(AnonymousClass000.A0h(" not backed up", A0r2));
        }
    }

    public void A02(boolean z2) {
        this.A0G.A08(false);
        if (z2) {
            C15860rz r4 = this.A0S;
            int i2 = C13680ns.A0B(r4).getInt("gdrive_successive_backup_failed_count", 0) + 1;
            Log.i(C13680ns.A0c(i2, "wa-shared-preferences/increment-backup-failed-count/updated-count/"));
            C13680ns.A1S(r4, "gdrive_successive_backup_failed_count", i2);
            if (r4.A0D() >= 4) {
                StringBuilder A0r = AnonymousClass000.A0r("gdrive/backup ");
                A0r.append(r4.A0D());
                Log.e(AnonymousClass000.A0h(" successive backups have failed, this is probably unusual.", A0r));
            }
        }
        A00();
        this.A05 = 0;
        this.A0S.A0j(0);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Missing exception handler attribute for start block: B:173:0x04b7 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:286:0x07e8 */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x0a0b A[Catch:{ 1db -> 0x0a1b, 1kR -> 0x0ab6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:351:0x0a14 A[ExcHandler: 1kR (e X.1kR), Splitter:B:14:0x00ae] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:140:0x0427=Splitter:B:140:0x0427, B:173:0x04b7=Splitter:B:173:0x04b7} */
    public boolean A03() {
        /*
            r56 = this;
            r9 = r56
            X.12M r0 = r9.A0G
            r55 = r0
            java.util.Iterator r1 = X.C16590tJ.A00(r55)
        L_0x000a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = r1.next()
            X.12R r0 = (X.AnonymousClass12R) r0
            r0.ANS()
            goto L_0x000a
        L_0x001a:
            X.0rz r0 = r9.A0S
            r54 = r0
            r24 = 1
            r1 = 1
            r0.A0j(r1)
            X.0yo r0 = r9.A0F
            r53 = r0
            boolean r1 = r9.A0h
            X.12s r0 = r0.A0O
            X.2Cv r3 = r0.A00
            if (r1 == 0) goto L_0x0037
            boolean r0 = r3.A02()
            r2 = 1
            if (r0 == 0) goto L_0x0038
        L_0x0037:
            r2 = 0
        L_0x0038:
            r0 = r53
            r0.A08 = r2
            r0.A08(r3)
            java.lang.String r0 = "gdrive/backup/force-backup-over-cellular/"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)
            r0 = r53
            boolean r0 = r0.A04
            r2.append(r0)
            X.C13680ns.A1V(r2)
            X.2GT r0 = r9.A0X
            r52 = r0
            X.0sd r0 = r9.A0D
            r51 = r0
            X.0rz r0 = r0.A03
            r50 = r0
            boolean r0 = r50.A1f()
            r4 = 0
            if (r0 == 0) goto L_0x00ab
            r2 = 1
        L_0x0065:
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0 = r52
            r0.A0H = r2
            X.2GM r0 = r9.A0L
            r18 = r0
            X.59I r0 = r0.A07
            r49 = r0
            r6 = 0
            r0.A00 = r6
            r0 = r18
            java.util.concurrent.atomic.AtomicInteger r0 = r0.A0I
            r48 = r0
            r0.set(r6)
            java.util.concurrent.atomic.AtomicLong r0 = r9.A0f
            r47 = r0
            r0.set(r4)
            java.util.concurrent.atomic.AtomicInteger r0 = r9.A0c
            r46 = r0
            r19 = 0
            r0.set(r6)
            java.util.concurrent.atomic.AtomicLong r2 = r9.A0d
            r2.set(r4)
            r9.A05 = r4
            r9.A01 = r6
            r9.A00 = r6
            r9.A07 = r4
            r9.A02 = r4
            r9.A03 = r4
            r9.A08 = r4
            r9.A06 = r4
            r9.A09 = r4
            r9.A04 = r4
            goto L_0x00ae
        L_0x00ab:
            r2 = 0
            goto L_0x0065
        L_0x00ae:
            java.lang.Integer r3 = X.C13680ns.A0Z()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = r52
            r0.A0D = r3     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            X.2GJ r0 = r9.A0J     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r45 = r0
            r3 = r0
            r0 = r18
            boolean r0 = X.C62173By.A06(r3, r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            if (r0 == 0) goto L_0x09f5
            java.lang.String r23 = "gdrive/backup/files"
            com.whatsapp.util.Log.i((java.lang.String) r23)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = r55
            r0.A00 = r6     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.util.Iterator r3 = X.C16590tJ.A00(r55)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
        L_0x00d0:
            boolean r0 = r3.hasNext()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            if (r0 == 0) goto L_0x00e0
            java.lang.Object r0 = r3.next()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            X.12R r0 = (X.AnonymousClass12R) r0     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0.ANQ()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            goto L_0x00d0
        L_0x00e0:
            r0 = 11
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = r52
            r0.A0D = r3     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.util.concurrent.atomic.AtomicReference r3 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r3.<init>()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            X.3i5 r7 = new X.3i5     // Catch:{ 1db -> 0x09ec, 1kR -> 0x0a14 }
            r7.<init>(r9, r3)     // Catch:{ 1db -> 0x09ec, 1kR -> 0x0a14 }
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0o()     // Catch:{ 1db -> 0x09ec, 1kR -> 0x0a14 }
            java.lang.String r0 = "gdrive/backup/get-chatdb-file looking for "
            java.lang.String r6 = X.AnonymousClass000.A0e(r3, r0, r6)     // Catch:{ 1db -> 0x09ec, 1kR -> 0x0a14 }
            r0 = r45
            java.lang.Object r0 = X.AnonymousClass2GS.A00(r7, r0, r6)     // Catch:{ 1db -> 0x09ec, 1kR -> 0x0a14 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ 1db -> 0x09ec, 1kR -> 0x0a14 }
            if (r0 == 0) goto L_0x09c5
            boolean r0 = r0.booleanValue()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            if (r0 == 0) goto L_0x09c5
            java.lang.Object r21 = r3.get()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = r21
            java.io.File r0 = (java.io.File) r0     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r21 = r0
            r0 = 31
            java.lang.Integer r20 = java.lang.Integer.valueOf(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r6 = 0
            if (r21 == 0) goto L_0x0153
            boolean r0 = r21.exists()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            if (r0 == 0) goto L_0x0153
            r0 = r53
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0c     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r44 = r0
            boolean r0 = r44.get()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.lang.String r22 = "gdrive/backup/files/cancelled"
            if (r0 == 0) goto L_0x09c1
            java.lang.Integer r3 = X.C13680ns.A0a()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = r52
            r0.A0D = r3     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.lang.String r0 = r9.A0Z     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            X.3iA r7 = new X.3iA     // Catch:{ 3iM -> 0x01c0 }
            r3 = r18
            r7.<init>(r3, r0)     // Catch:{ 3iM -> 0x01c0 }
            r3 = r45
            r8 = r23
            java.lang.Object r8 = X.AnonymousClass2GS.A00(r7, r3, r8)     // Catch:{ 3iM -> 0x01c0 }
            X.3BK r8 = (X.AnonymousClass3BK) r8     // Catch:{ 3iM -> 0x01c0 }
            if (r8 != 0) goto L_0x0159
            goto L_0x01c0
        L_0x0153:
            java.lang.String r0 = "gdrive/backup/files/chatdb doesn't exist"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            goto L_0x01af
        L_0x0159:
            boolean r0 = r44.get()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            if (r0 == 0) goto L_0x09c1
            java.lang.Integer r3 = X.C13690nt.A0T()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = r52
            r0.A0D = r3     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            X.0t3 r7 = r9.A0P     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            X.0pd r0 = r9.A0V     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            long r0 = X.C40691uX.A02(r0, r1)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            X.2xP r3 = new X.2xP     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r3.<init>(r8, r7, r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r1 = r45
            r0 = r23
            java.lang.Object r1 = X.AnonymousClass2GS.A00(r3, r1, r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            if (r1 != r0) goto L_0x01b7
            java.lang.String r0 = "gdrive/backup/files loading files"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            boolean r0 = r45.A05()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            if (r0 == 0) goto L_0x0a01
            java.lang.Integer r1 = X.C13690nt.A0U()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = r52
            r0.A0D = r1     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.util.ArrayList r0 = X.AnonymousClass000.A0u()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.util.List r11 = java.util.Collections.synchronizedList(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.util.Map r0 = r9.A0b     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r43 = r0
            r43.clear()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = r45
            java.util.Map r1 = X.C62173By.A02(r0, r8, r11)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            if (r1 != 0) goto L_0x01e1
            java.lang.String r0 = "gdrive/backup/failed to load files for backup"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
        L_0x01af:
            r1 = r20
            r0 = r52
            r0.A0C = r1     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            goto L_0x0a01
        L_0x01b7:
            r1 = r20
            r0 = r52
            r0.A0C = r1     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.lang.String r0 = "gdrive/backup/files unable to start transaction"
            goto L_0x01dc
        L_0x01c0:
            X.2xN r7 = new X.2xN     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r3 = r18
            r7.<init>(r3, r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r3 = r45
            r0 = r23
            java.lang.Object r8 = X.AnonymousClass2GS.A00(r7, r3, r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            X.3BK r8 = (X.AnonymousClass3BK) r8     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            if (r8 != 0) goto L_0x0159
            r1 = 30
            r0 = r52
            X.AnonymousClass2GT.A00(r0, r1)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.lang.String r0 = "gdrive/backup/files unable to create backup"
        L_0x01dc:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            goto L_0x0a01
        L_0x01e1:
            r0 = r43
            r0.putAll(r1)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.util.Collection r1 = r1.values()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = r51
            X.C62173By.A04(r0, r1)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            boolean r0 = r44.get()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            if (r0 == 0) goto L_0x09c1
            X.0tq r0 = r9.A0U     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            int r0 = r0.A00()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            long r0 = (long) r0     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r41 = r0
            java.util.concurrent.atomic.AtomicLong r0 = r9.A0e     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r40 = r0
            r0.set(r4)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r2.set(r4)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = 6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = r52
            r0.A0D = r1     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = 1000(0x3e8, float:1.401E-42)
            java.util.ArrayList r0 = X.C13690nt.A0i(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.util.List r26 = java.util.Collections.synchronizedList(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.lang.String r0 = "gdrive/backup/collectFilesToBackupAndRemove/collect media files referenced from messages"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.lang.String r1 = "gdrive/backup/perf/collect-referenced-files-with-constraints"
            X.1Zf r25 = new X.1Zf     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = r25
            r0.<init>((java.lang.String) r1)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = r21
            r7.add(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            X.0sc r0 = r9.A0N     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r39 = r0
            java.io.File r1 = r39.A02()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = r53
            X.AnonymousClass2GK.A0F(r0, r1, r2)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r7.addAll(r2)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.util.Iterator r10 = r7.iterator()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = 0
        L_0x024c:
            boolean r2 = r10.hasNext()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            if (r2 == 0) goto L_0x025e
            java.lang.Object r2 = r10.next()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.io.File r2 = (java.io.File) r2     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            long r2 = r2.length()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            long r0 = r0 + r2
            goto L_0x024c
        L_0x025e:
            java.lang.String r2 = "gdrive/backup/collectReferencedFilesToBackupWithConstraints essential files size "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r2)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r2.append(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            X.C13680ns.A1V(r2)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            X.1I1 r3 = r9.A0E     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.util.Set r2 = r3.A01()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            long r12 = r3.A00(r2)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            long r0 = r0 + r12
            r9.A05 = r0     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = r26
            boolean r0 = r9.A04(r7, r0, r11)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            if (r0 != 0) goto L_0x02ac
            java.lang.String r0 = "gdrive/backup/collectReferencedFilesToBackupWithConstraints processing essential files failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
        L_0x0284:
            r25.A01()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r3 = 0
            r1 = 25
            r0 = r52
            X.AnonymousClass2GT.A00(r0, r1)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.lang.String r0 = "gdrive/backup/collectFilesToBackupAndRemove/files failed to generate list of files to be uploaded."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
        L_0x0294:
            java.lang.String r0 = "gdrive/backup/collectFilesToBackupAndRemove/files/ file to upload: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = r26
            X.C13700nu.A0b(r1, r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.lang.String r0 = " and remove: "
            r1.append(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            X.C13700nu.A0b(r1, r11)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            X.C13680ns.A1V(r1)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            goto L_0x04bf
        L_0x02ac:
            X.39E r0 = r9.A0H     // Catch:{ 3iL -> 0x04b8 }
            r27 = r0
            X.1Zf r10 = new X.1Zf     // Catch:{ 3iL -> 0x04b8 }
            r10.<init>((boolean) r6)     // Catch:{ 3iL -> 0x04b8 }
            java.lang.String r0 = "gdrive/backup/quota/getMostRecentMediaList"
            r10.A04(r0)     // Catch:{ 3iL -> 0x04b8 }
            java.util.Set r0 = r43.keySet()     // Catch:{ 3iL -> 0x04b8 }
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ 3iL -> 0x04b8 }
            r7.<init>(r0)     // Catch:{ 3iL -> 0x04b8 }
            r2 = 0
        L_0x02c4:
            X.0t8 r14 = r3.A04     // Catch:{ 3iL -> 0x04b8 }
            java.util.Set r0 = r3.A01()     // Catch:{ 3iL -> 0x04b8 }
            java.lang.String r1 = "mediamsgstore/getSpecifiedTypesOfMessagesOrderedBySortIDDescCursor for message types "
            java.lang.String r1 = X.AnonymousClass000.A0g(r1, r0)     // Catch:{ 3iL -> 0x04b8 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 3iL -> 0x04b8 }
            X.0tq r1 = r14.A0B     // Catch:{ 3iL -> 0x04b8 }
            X.0tf r13 = r1.get()     // Catch:{ 3iL -> 0x04b8 }
            int r16 = r0.size()     // Catch:{ all -> 0x04b3 }
            boolean r15 = X.AnonymousClass000.A1V(r2)
            java.lang.String r1 = "SELECT "
            java.lang.StringBuilder r12 = X.AnonymousClass000.A0r(r1)     // Catch:{ all -> 0x04b3 }
            java.lang.String r1 = X.C16910tr.A00     // Catch:{ all -> 0x04b3 }
            r12.append(r1)     // Catch:{ all -> 0x04b3 }
            java.lang.String r1 = " FROM "
            r12.append(r1)     // Catch:{ all -> 0x04b3 }
            java.lang.String r1 = "available_message_view"
            r12.append(r1)     // Catch:{ all -> 0x04b3 }
            java.lang.String r1 = " WHERE "
            r12.append(r1)     // Catch:{ all -> 0x04b3 }
            java.lang.String r1 = "message_type IN "
            r12.append(r1)     // Catch:{ all -> 0x04b3 }
            java.lang.String r1 = X.C34111ji.A00(r16)     // Catch:{ all -> 0x04b3 }
            r12.append(r1)     // Catch:{ all -> 0x04b3 }
            if (r15 == 0) goto L_0x030a
            goto L_0x030d
        L_0x030a:
            java.lang.String r1 = ""
            goto L_0x030f
        L_0x030d:
            java.lang.String r1 = " AND sort_id < ? "
        L_0x030f:
            r12.append(r1)     // Catch:{ all -> 0x04b3 }
            java.lang.String r1 = " ORDER BY sort_id DESC LIMIT ?"
            java.lang.String r12 = X.AnonymousClass000.A0h(r1, r12)     // Catch:{ all -> 0x04b3 }
            r1 = 1000(0x3e8, float:1.401E-42)
            long r15 = (long) r1     // Catch:{ all -> 0x04b3 }
            java.util.ArrayList r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x04b3 }
            java.util.Iterator r17 = r0.iterator()     // Catch:{ all -> 0x04b3 }
        L_0x0323:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x04b3 }
            if (r0 == 0) goto L_0x0335
            java.lang.Object r0 = r17.next()     // Catch:{ all -> 0x04b3 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x04b3 }
            r1.add(r0)     // Catch:{ all -> 0x04b3 }
            goto L_0x0323
        L_0x0335:
            if (r2 == 0) goto L_0x033e
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x04b3 }
            r1.add(r0)     // Catch:{ all -> 0x04b3 }
        L_0x033e:
            java.lang.String r0 = java.lang.String.valueOf(r15)     // Catch:{ all -> 0x04b3 }
            r1.add(r0)     // Catch:{ all -> 0x04b3 }
            java.lang.String[] r0 = X.C16480t8.A0E     // Catch:{ all -> 0x04b3 }
            java.lang.Object[] r15 = r1.toArray(r0)     // Catch:{ all -> 0x04b3 }
            java.lang.String[] r15 = (java.lang.String[]) r15     // Catch:{ all -> 0x04b3 }
            X.0t6 r1 = r14.A06     // Catch:{ all -> 0x04b3 }
            r0 = 0
            X.0tg r14 = r13.A02     // Catch:{ all -> 0x04b3 }
            android.database.Cursor r14 = r14.A08(r12, r15)     // Catch:{ all -> 0x04b3 }
            X.0tt r12 = new X.0tt     // Catch:{ all -> 0x04b3 }
            r12.<init>(r14, r1, r0, r0)     // Catch:{ all -> 0x04b3 }
            r13.close()     // Catch:{ 3iL -> 0x04b8 }
            java.util.ArrayList r13 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x04ae }
            boolean r0 = r12.moveToFirst()     // Catch:{ all -> 0x04ae }
            if (r0 != 0) goto L_0x036a
            goto L_0x03ed
        L_0x036a:
            X.0tY r14 = r12.A00()     // Catch:{ all -> 0x04ae }
            if (r14 == 0) goto L_0x04a3
            long r0 = r14.A13     // Catch:{ all -> 0x04ae }
            r16 = -1
            int r15 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r15 == 0) goto L_0x04a3
            X.0ta r0 = r14.A02     // Catch:{ all -> 0x04ae }
            if (r0 == 0) goto L_0x03b7
            java.io.File r15 = r0.A0F     // Catch:{ all -> 0x04ae }
            if (r15 == 0) goto L_0x03b7
            boolean r0 = r15.isDirectory()     // Catch:{ all -> 0x04ae }
            if (r0 != 0) goto L_0x03b7
            X.0sc r1 = r3.A01     // Catch:{ all -> 0x04ae }
            X.0tz r0 = r3.A02     // Catch:{ all -> 0x04ae }
            android.content.Context r0 = r0.A00     // Catch:{ all -> 0x04ae }
            java.lang.String r1 = X.AnonymousClass2GK.A08(r0, r1, r15)     // Catch:{ all -> 0x04ae }
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x04ae }
            if (r0 != 0) goto L_0x03b7
            X.AnonymousClass00B.A06(r1)     // Catch:{ all -> 0x04ae }
            boolean r0 = r13.contains(r15)     // Catch:{ all -> 0x04ae }
            if (r0 != 0) goto L_0x03b7
            java.util.Iterator r16 = r26.iterator()     // Catch:{ all -> 0x04ae }
        L_0x03a3:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x04ae }
            if (r0 == 0) goto L_0x03cc
            java.lang.Object r0 = r16.next()     // Catch:{ all -> 0x04ae }
            X.39m r0 = (X.C615839m) r0     // Catch:{ all -> 0x04ae }
            java.lang.String r0 = r0.A06     // Catch:{ all -> 0x04ae }
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x04ae }
            if (r0 == 0) goto L_0x03a3
        L_0x03b7:
            long r0 = r14.A14     // Catch:{ all -> 0x04ae }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x04ae }
            boolean r0 = r12.moveToNext()     // Catch:{ all -> 0x04ae }
            if (r0 != 0) goto L_0x036a
            r0 = r26
            boolean r0 = r9.A04(r13, r0, r11)     // Catch:{ all -> 0x04ae }
            if (r0 == 0) goto L_0x0495
            goto L_0x03e1
        L_0x03cc:
            boolean r0 = r7.contains(r1)     // Catch:{ all -> 0x04ae }
            if (r0 != 0) goto L_0x03da
            r0 = r43
            boolean r0 = r0.containsKey(r1)     // Catch:{ all -> 0x04ae }
            if (r0 != 0) goto L_0x03b7
        L_0x03da:
            r13.add(r15)     // Catch:{ all -> 0x04ae }
            r7.remove(r1)     // Catch:{ all -> 0x04ae }
            goto L_0x03b7
        L_0x03e1:
            r12.close()     // Catch:{ 3iL -> 0x04b8 }
            boolean r0 = r1.equals(r2)     // Catch:{ 3iL -> 0x04b8 }
            if (r0 != 0) goto L_0x03f0
            r2 = r1
            goto L_0x02c4
        L_0x03ed:
            r12.close()     // Catch:{ 3iL -> 0x04b8 }
        L_0x03f0:
            java.util.Iterator r13 = r7.iterator()     // Catch:{ 3iL -> 0x04b8 }
        L_0x03f4:
            boolean r0 = r13.hasNext()     // Catch:{ 3iL -> 0x04b8 }
            if (r0 == 0) goto L_0x0446
            java.lang.String r12 = X.AnonymousClass000.A0m(r13)     // Catch:{ 3iL -> 0x04b8 }
            r0 = r43
            boolean r0 = r0.containsKey(r12)     // Catch:{ 3iL -> 0x04b8 }
            if (r0 == 0) goto L_0x03f4
            X.0so r7 = r3.A00     // Catch:{ 3iL -> 0x04b8 }
            X.0sc r2 = r3.A01     // Catch:{ 3iL -> 0x04b8 }
            X.0tz r0 = r3.A02     // Catch:{ 3iL -> 0x04b8 }
            android.content.Context r1 = r0.A00     // Catch:{ 3iL -> 0x04b8 }
            java.lang.String r0 = "_INTERNAL_FILES_"
            boolean r0 = r12.startsWith(r0)     // Catch:{ 3iL -> 0x04b8 }
            if (r0 != 0) goto L_0x0427
            java.lang.String r0 = "_INTERNAL_DATABASES_"
            boolean r0 = r12.startsWith(r0)     // Catch:{ 3iL -> 0x04b8 }
            if (r0 != 0) goto L_0x0427
            java.io.File r0 = r2.A07(r12)     // Catch:{ IOException -> 0x03f4 }
            java.lang.String r1 = r0.getCanonicalPath()     // Catch:{ IOException -> 0x03f4 }
            goto L_0x042b
        L_0x0427:
            java.lang.String r1 = X.AnonymousClass2GK.A07(r1, r7, r12)     // Catch:{ 3iL -> 0x04b8 }
        L_0x042b:
            if (r1 == 0) goto L_0x03f4
            r0 = r27
            java.lang.String r0 = r0.A04     // Catch:{ 3iL -> 0x04b8 }
            boolean r0 = r1.startsWith(r0)     // Catch:{ 3iL -> 0x04b8 }
            if (r0 == 0) goto L_0x03f4
            r0 = r43
            java.lang.Object r0 = r0.get(r12)     // Catch:{ 3iL -> 0x04b8 }
            r11.add(r0)     // Catch:{ 3iL -> 0x04b8 }
            r0 = r43
            r0.remove(r12)     // Catch:{ 3iL -> 0x04b8 }
            goto L_0x03f4
        L_0x0446:
            r10.A01()     // Catch:{ 3iL -> 0x04b8 }
            java.util.Iterator r7 = r26.iterator()     // Catch:{ 3iL -> 0x04b8 }
            r2 = 0
        L_0x044f:
            boolean r0 = r7.hasNext()     // Catch:{ 3iL -> 0x04b8 }
            if (r0 == 0) goto L_0x0461
            java.lang.Object r0 = r7.next()     // Catch:{ 3iL -> 0x04b8 }
            X.39m r0 = (X.C615839m) r0     // Catch:{ 3iL -> 0x04b8 }
            long r0 = r0.A00()     // Catch:{ 3iL -> 0x04b8 }
            long r2 = r2 + r0
            goto L_0x044f
        L_0x0461:
            java.util.Iterator r7 = X.C13680ns.A0q(r43)     // Catch:{ 3iL -> 0x04b8 }
            r12 = 0
        L_0x0467:
            boolean r0 = r7.hasNext()     // Catch:{ 3iL -> 0x04b8 }
            if (r0 == 0) goto L_0x047e
            java.lang.Object r1 = r7.next()     // Catch:{ 3iL -> 0x04b8 }
            X.3Ad r1 = (X.C61743Ad) r1     // Catch:{ 3iL -> 0x04b8 }
            X.4WW r0 = r1.A02     // Catch:{ 3iL -> 0x04b8 }
            if (r0 == 0) goto L_0x047a
            long r0 = r0.A00     // Catch:{ 3iL -> 0x04b8 }
            goto L_0x047c
        L_0x047a:
            long r0 = r1.A00     // Catch:{ 3iL -> 0x04b8 }
        L_0x047c:
            long r12 = r12 + r0
            goto L_0x0467
        L_0x047e:
            long r2 = r2 + r12
            r9.A05 = r2     // Catch:{ 3iL -> 0x04b8 }
            r25.A01()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r3 = 1
            java.lang.String r0 = "gdrive/backup/collectFilesToBackupAndRemove/files/estimated total size of backup "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            long r0 = r9.A05     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r2.append(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            X.C13680ns.A1V(r2)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            goto L_0x0294
        L_0x0495:
            java.lang.String r0 = "gdrive/backup/quota/getMostRecentMediaList processing media files failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x04ae }
            r10.A01()     // Catch:{ all -> 0x04ae }
            X.3iL r0 = new X.3iL     // Catch:{ all -> 0x04ae }
            r0.<init>()     // Catch:{ all -> 0x04ae }
            throw r0     // Catch:{ all -> 0x04ae }
        L_0x04a3:
            java.lang.String r0 = "gdrive/backup/quota/getMostRecentMediaList found media without message"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x04ae }
            X.3iV r0 = new X.3iV     // Catch:{ all -> 0x04ae }
            r0.<init>()     // Catch:{ all -> 0x04ae }
            throw r0     // Catch:{ all -> 0x04ae }
        L_0x04ae:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x04b7 }
            goto L_0x04b7
        L_0x04b3:
            r0 = move-exception
            r13.close()     // Catch:{ all -> 0x04b7 }
        L_0x04b7:
            throw r0     // Catch:{ 3iL -> 0x04b8 }
        L_0x04b8:
            java.lang.String r0 = "gdrive/backup/collectReferencedFilesToBackupWithConstraints processing referenced media files failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            goto L_0x0284
        L_0x04bf:
            if (r3 == 0) goto L_0x0a01
            boolean r0 = r45.A05()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            if (r0 == 0) goto L_0x0a01
            r0 = 7
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = r52
            r0.A0D = r1     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            int r10 = r26.size()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.lang.String r0 = "gdrive/backup/files/files-to-be-uploaded/count/"
            java.lang.String r0 = X.C13680ns.A0c(r10, r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.util.Iterator r3 = r26.iterator()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
        L_0x04e1:
            boolean r0 = r3.hasNext()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            if (r0 == 0) goto L_0x04f7
            java.lang.Object r0 = r3.next()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            X.39m r0 = (X.C615839m) r0     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            long r0 = r0.A00()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r2 = r40
            r2.addAndGet(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            goto L_0x04e1
        L_0x04f7:
            boolean r0 = r45.A05()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            if (r0 == 0) goto L_0x0a01
            r0 = r53
            int r1 = r0.A00     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r16 = 1
            r0 = 1
            if (r1 != r0) goto L_0x0613
            java.lang.Long r1 = java.lang.Long.valueOf(r16)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = r52
            r0.A0K = r1     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
        L_0x050e:
            java.lang.String r1 = "gdrive_backup_start_timestamp"
            r0 = r54
            long r2 = r0.A0J(r1)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0523
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = r54
            r0.A14(r1, r2)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
        L_0x0523:
            android.content.SharedPreferences r1 = X.C13680ns.A0B(r54)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.lang.String r0 = "gdrive_already_uploaded_bytes"
            long r0 = r1.getLong(r0, r4)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.util.concurrent.atomic.AtomicLong r6 = r9.A0g     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r38 = r6
            r6.set(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r6 = r40
            r6.addAndGet(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            long r6 = r38.get()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            long r0 = r40.get()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r12 = r55
            r12.A07(r6, r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = 1
            java.util.concurrent.atomic.AtomicBoolean r7 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r7.<init>(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r29 = 0
            java.util.concurrent.atomic.AtomicReference r6 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = r29
            r6.<init>(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.util.concurrent.CountDownLatch r12 = new java.util.concurrent.CountDownLatch     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r12.<init>(r10)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.util.Iterator r28 = r26.iterator()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r27 = 1
        L_0x0560:
            boolean r0 = r28.hasNext()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            if (r0 == 0) goto L_0x0620
            java.lang.Object r13 = r28.next()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            X.39m r13 = (X.C615839m) r13     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            boolean r0 = r9.A05(r6, r10)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            if (r0 != 0) goto L_0x09bf
            java.lang.String r14 = "<file>"
            java.io.File r0 = r13.A04     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            boolean r1 = r0.exists()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            if (r1 != 0) goto L_0x0592
            java.lang.String r0 = "gdrive/backup/backup-file file "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0.append(r14)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.lang.String r1 = " does not exist"
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r12.countDown()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            goto L_0x060c
        L_0x0592:
            boolean r0 = r0.isDirectory()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            if (r0 == 0) goto L_0x05ab
            r1 = r20
            r0 = r52
            r0.A0C = r1     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.lang.String r0 = "gdrive-service/backup-file/expected-file-got-directory-instead/"
            java.lang.String r0 = X.C13680ns.A0h(r0, r14)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
        L_0x05a7:
            r12.countDown()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            goto L_0x060e
        L_0x05ab:
            boolean r0 = r44.get()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            if (r0 != 0) goto L_0x05b7
            java.lang.String r0 = "gdrive/backup/backup-file backup has been cancelled."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            goto L_0x05a7
        L_0x05b7:
            long r14 = r40.get()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            int r0 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x05f2
            r1 = r47
            r0 = r40
            double r25 = X.C13680ns.A00(r1, r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r14 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r25 > r14 ? 1 : (r25 == r14 ? 0 : -1))
            if (r0 <= 0) goto L_0x05f2
            java.lang.String r0 = "gdrive/backup/backup-file/too-many-failures upload-failed:"
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0r(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            long r0 = r47.get()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r13.append(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.lang.String r0 = " upload-total:"
            r13.append(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = r40
            r13.append(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            X.C13680ns.A1V(r13)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r12.countDown()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r1 = 38
            r0 = r52
            X.AnonymousClass2GT.A00(r0, r1)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            goto L_0x060e
        L_0x05f2:
            java.util.concurrent.Executor r1 = X.AnonymousClass2GK.A00     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            com.facebook.redex.RunnableRunnableShape1S0600000_I1 r0 = new com.facebook.redex.RunnableRunnableShape1S0600000_I1     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r37 = 0
            r30 = r0
            r31 = r9
            r32 = r6
            r33 = r8
            r34 = r13
            r35 = r7
            r36 = r12
            r30.<init>(r31, r32, r33, r34, r35, r36, r37)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r1.execute(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
        L_0x060c:
            r0 = 1
            goto L_0x060f
        L_0x060e:
            r0 = 0
        L_0x060f:
            r27 = r27 & r0
            goto L_0x0560
        L_0x0613:
            r0 = 2
            if (r1 != r0) goto L_0x050e
            java.lang.Long r1 = java.lang.Long.valueOf(r4)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = r52
            r0.A0K = r1     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            goto L_0x050e
        L_0x0620:
            java.lang.String r0 = "gdrive/backup/files waiting for backup to finish..."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.util.concurrent.TimeUnit r13 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0631 }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            boolean r0 = r12.await(r0, r13)     // Catch:{ InterruptedException -> 0x0631 }
            r27 = r27 & r0
            goto L_0x063f
        L_0x0631:
            r1 = move-exception
            java.lang.String r0 = "gdrive/backup/files upload interrupted"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r1 = r20
            r0 = r52
            r0.A0C = r1     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r27 = 0
        L_0x063f:
            boolean r0 = r9.A05(r6, r10)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            if (r0 != 0) goto L_0x09bf
            boolean r0 = r7.get()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r27 = r27 & r0
            if (r27 == 0) goto L_0x09ae
            java.lang.String r0 = "chat-database-not-uploaded"
            r1 = r21
            r9.A01(r1, r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = 9
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = r52
            r0.A0D = r1     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.lang.String r1 = "gdrive/backup/perf/build-metadata"
            X.1Zf r28 = new X.1Zf     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = r28
            r0.<init>((java.lang.String) r1)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.lang.String r1 = "gdrive/backup/perf/build-metadata/filter-files-and-build-stats"
            X.1Zf r27 = new X.1Zf     // Catch:{ IOException -> 0x0879 }
            r0 = r27
            r0.<init>((java.lang.String) r1)     // Catch:{ IOException -> 0x0879 }
            X.0si r0 = r9.A0T     // Catch:{ IOException -> 0x0879 }
            java.io.File[] r0 = r0.A0K()     // Catch:{ IOException -> 0x0879 }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ IOException -> 0x0879 }
            java.util.HashSet r15 = new java.util.HashSet     // Catch:{ IOException -> 0x0879 }
            r15.<init>(r0)     // Catch:{ IOException -> 0x0879 }
            java.util.ArrayList r6 = X.AnonymousClass000.A0u()     // Catch:{ IOException -> 0x0879 }
            java.io.File r1 = r39.A02()     // Catch:{ IOException -> 0x0879 }
            r0 = r53
            X.AnonymousClass2GK.A0F(r0, r1, r6)     // Catch:{ IOException -> 0x0879 }
            java.util.HashSet r14 = new java.util.HashSet     // Catch:{ IOException -> 0x0879 }
            r14.<init>(r6)     // Catch:{ IOException -> 0x0879 }
            X.AnonymousClass00B.A06(r43)     // Catch:{ IOException -> 0x0879 }
            java.util.Iterator r26 = X.C13680ns.A0q(r43)     // Catch:{ IOException -> 0x0879 }
        L_0x0698:
            boolean r0 = r26.hasNext()     // Catch:{ IOException -> 0x0879 }
            if (r0 == 0) goto L_0x075c
            java.lang.Object r1 = r26.next()     // Catch:{ IOException -> 0x0879 }
            X.3Ad r1 = (X.C61743Ad) r1     // Catch:{ IOException -> 0x0879 }
            X.0so r12 = r9.A0A     // Catch:{ IOException -> 0x0879 }
            X.4WW r7 = r1.A02     // Catch:{ IOException -> 0x0879 }
            if (r7 == 0) goto L_0x0758
            java.lang.String r6 = r7.A04     // Catch:{ IOException -> 0x0879 }
        L_0x06ac:
            X.0tz r0 = r9.A0Q     // Catch:{ IOException -> 0x0879 }
            android.content.Context r10 = r0.A00     // Catch:{ IOException -> 0x0879 }
            r0 = r39
            java.lang.String r0 = X.AnonymousClass2GK.A06(r10, r12, r0, r6)     // Catch:{ IOException -> 0x0879 }
            if (r0 == 0) goto L_0x0745
            java.io.File r10 = X.C13700nu.A0D(r0)     // Catch:{ IOException -> 0x0879 }
            boolean r10 = r10.exists()     // Catch:{ IOException -> 0x0879 }
            if (r10 == 0) goto L_0x0745
            java.io.File r13 = X.C13700nu.A0D(r0)     // Catch:{ IOException -> 0x0879 }
            java.lang.String r12 = r13.getCanonicalPath()     // Catch:{ IOException -> 0x0879 }
            X.39E r10 = r9.A0H     // Catch:{ IOException -> 0x0879 }
            if (r12 == 0) goto L_0x06ea
            java.lang.String r0 = r10.A04     // Catch:{ IOException -> 0x0879 }
            boolean r0 = r12.startsWith(r0)     // Catch:{ IOException -> 0x0879 }
            r25 = 1
            if (r0 == 0) goto L_0x06ea
            boolean r0 = r10.A00(r13, r12)     // Catch:{ IOException -> 0x0879 }
            if (r0 != 0) goto L_0x06ec
            r13.length()     // Catch:{ IOException -> 0x0879 }
        L_0x06e1:
            r0 = r43
            r0.remove(r6)     // Catch:{ IOException -> 0x0879 }
            r11.add(r1)     // Catch:{ IOException -> 0x0879 }
            goto L_0x0698
        L_0x06ea:
            r25 = 0
        L_0x06ec:
            if (r7 == 0) goto L_0x06f1
            long r6 = r7.A00     // Catch:{ IOException -> 0x0879 }
            goto L_0x06f3
        L_0x06f1:
            long r6 = r1.A00     // Catch:{ IOException -> 0x0879 }
        L_0x06f3:
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0701
            java.lang.String r0 = "gdrive/backup/build-stats/file-size-is-not-positive"
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r1)     // Catch:{ IOException -> 0x0879 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x0879 }
            goto L_0x0698
        L_0x0701:
            boolean r0 = r15.contains(r13)     // Catch:{ IOException -> 0x0879 }
            if (r0 == 0) goto L_0x0709
            r9.A03 = r6     // Catch:{ IOException -> 0x0879 }
        L_0x0709:
            if (r25 == 0) goto L_0x0716
            long r0 = r9.A06     // Catch:{ IOException -> 0x0879 }
            long r0 = r0 + r6
            r9.A06 = r0     // Catch:{ IOException -> 0x0879 }
            int r0 = r9.A00     // Catch:{ IOException -> 0x0879 }
            int r0 = r0 + 1
            r9.A00 = r0     // Catch:{ IOException -> 0x0879 }
        L_0x0716:
            if (r12 == 0) goto L_0x0733
            java.lang.String r0 = r10.A06     // Catch:{ IOException -> 0x0879 }
            boolean r0 = r12.startsWith(r0)     // Catch:{ IOException -> 0x0879 }
            if (r0 == 0) goto L_0x0725
            long r0 = r9.A09     // Catch:{ IOException -> 0x0879 }
            long r0 = r0 + r6
            r9.A09 = r0     // Catch:{ IOException -> 0x0879 }
        L_0x0725:
            java.lang.String r0 = r10.A03     // Catch:{ IOException -> 0x0879 }
            boolean r0 = r12.startsWith(r0)     // Catch:{ IOException -> 0x0879 }
            if (r0 == 0) goto L_0x0733
            int r0 = r9.A01     // Catch:{ IOException -> 0x0879 }
            int r0 = r0 + 1
            r9.A01 = r0     // Catch:{ IOException -> 0x0879 }
        L_0x0733:
            boolean r0 = r14.contains(r13)     // Catch:{ IOException -> 0x0879 }
            if (r0 == 0) goto L_0x073e
            long r0 = r9.A08     // Catch:{ IOException -> 0x0879 }
            long r0 = r0 + r6
            r9.A08 = r0     // Catch:{ IOException -> 0x0879 }
        L_0x073e:
            long r0 = r9.A02     // Catch:{ IOException -> 0x0879 }
            long r0 = r0 + r6
            r9.A02 = r0     // Catch:{ IOException -> 0x0879 }
            goto L_0x0698
        L_0x0745:
            java.lang.String r7 = "gdrive/backup/filter-files removing non-existent "
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0r(r7)     // Catch:{ IOException -> 0x0879 }
            r7.append(r0)     // Catch:{ IOException -> 0x0879 }
            java.lang.String r0 = " from the map."
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r7)     // Catch:{ IOException -> 0x0879 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ IOException -> 0x0879 }
            goto L_0x06e1
        L_0x0758:
            java.lang.String r6 = r1.A06     // Catch:{ IOException -> 0x0879 }
            goto L_0x06ac
        L_0x075c:
            r27.A01()     // Catch:{ IOException -> 0x0879 }
            java.lang.String r0 = "gdrive/backup/perf/build-metadata/metadata"
            X.1Zf r6 = new X.1Zf     // Catch:{ IOException -> 0x0879 }
            r6.<init>((java.lang.String) r0)     // Catch:{ IOException -> 0x0879 }
            java.util.HashMap r10 = X.AnonymousClass000.A0x()     // Catch:{ IOException -> 0x0879 }
            java.lang.Long r1 = java.lang.Long.valueOf(r41)     // Catch:{ IOException -> 0x0879 }
            java.lang.String r0 = "numOfMessages"
            r10.put(r0, r1)     // Catch:{ IOException -> 0x0879 }
            int r0 = r54.A06()     // Catch:{ IOException -> 0x0879 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0879 }
            java.lang.String r0 = "backupFrequency"
            r10.put(r0, r1)     // Catch:{ IOException -> 0x0879 }
            int r0 = r54.A07()     // Catch:{ IOException -> 0x0879 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0879 }
            java.lang.String r0 = "backupNetworkSettings"
            r10.put(r0, r1)     // Catch:{ IOException -> 0x0879 }
            boolean r0 = r54.A1a()     // Catch:{ IOException -> 0x0879 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0879 }
            java.lang.String r0 = "includeVideosInBackup"
            r10.put(r0, r1)     // Catch:{ IOException -> 0x0879 }
            int r0 = r9.A01     // Catch:{ IOException -> 0x0879 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0879 }
            java.lang.String r0 = "numOfPhotos"
            r10.put(r0, r1)     // Catch:{ IOException -> 0x0879 }
            int r0 = r9.A00     // Catch:{ IOException -> 0x0879 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x0879 }
            java.lang.String r0 = "numOfMediaFiles"
            r10.put(r0, r1)     // Catch:{ IOException -> 0x0879 }
            long r0 = r9.A06     // Catch:{ IOException -> 0x0879 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x0879 }
            java.lang.String r0 = "mediaSize"
            r10.put(r0, r1)     // Catch:{ IOException -> 0x0879 }
            long r0 = r9.A09     // Catch:{ IOException -> 0x0879 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x0879 }
            java.lang.String r0 = "videoSize"
            r10.put(r0, r1)     // Catch:{ IOException -> 0x0879 }
            java.util.Map r1 = r54.A0T()     // Catch:{ IOException -> 0x0879 }
            java.lang.String r0 = "localSettings"
            r10.put(r0, r1)     // Catch:{ IOException -> 0x0879 }
            boolean r0 = r50.A1f()     // Catch:{ IOException -> 0x0879 }
            if (r0 == 0) goto L_0x07fe
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch:{ IOException -> 0x0879 }
            r1.<init>()     // Catch:{ IOException -> 0x0879 }
            android.util.JsonWriter r0 = new android.util.JsonWriter     // Catch:{ IOException -> 0x0879 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0879 }
            X.C62173By.A03(r0, r10)     // Catch:{ all -> 0x07e4 }
            goto L_0x07e9
        L_0x07e4:
            r1 = move-exception
            r0.close()     // Catch:{ all -> 0x07e8 }
        L_0x07e8:
            throw r1     // Catch:{ IOException -> 0x0879 }
        L_0x07e9:
            r0.close()     // Catch:{ IOException -> 0x0879 }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x0879 }
            r0 = r51
            java.lang.String r1 = r0.A01(r1)     // Catch:{ IOException -> 0x0879 }
            r10.clear()     // Catch:{ IOException -> 0x0879 }
            java.lang.String r0 = "encryptedData"
            r10.put(r0, r1)     // Catch:{ IOException -> 0x0879 }
        L_0x07fe:
            boolean r0 = r50.A1f()     // Catch:{ IOException -> 0x0879 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x0879 }
            java.lang.String r0 = "encryptedBackupEnabled"
            r10.put(r0, r1)     // Catch:{ IOException -> 0x0879 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r24)     // Catch:{ IOException -> 0x0879 }
            java.lang.String r0 = "backupVersion"
            r10.put(r0, r1)     // Catch:{ IOException -> 0x0879 }
            long r0 = r9.A02     // Catch:{ IOException -> 0x0879 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x0879 }
            java.lang.String r0 = "backupSize"
            r10.put(r0, r1)     // Catch:{ IOException -> 0x0879 }
            long r0 = r9.A03     // Catch:{ IOException -> 0x0879 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ IOException -> 0x0879 }
            java.lang.String r0 = "chatdbSize"
            r10.put(r0, r1)     // Catch:{ IOException -> 0x0879 }
            java.lang.String r1 = X.C003901s.A00()     // Catch:{ IOException -> 0x0879 }
            java.lang.String r0 = "versionOfAppWhenBackup"
            r10.put(r0, r1)     // Catch:{ IOException -> 0x0879 }
            X.1uy r13 = r9.A0C     // Catch:{ IOException -> 0x0879 }
            org.json.JSONObject r7 = X.C13700nu.A0J()     // Catch:{ IOException -> 0x0879 }
            java.util.Map r12 = r13.A02()     // Catch:{ IOException -> 0x0879 }
            java.lang.String r1 = "backup_version"
            int r0 = r13.A01(r12)     // Catch:{ JSONException -> 0x0866 }
            r7.put(r1, r0)     // Catch:{ JSONException -> 0x0866 }
            java.util.List r0 = r13.A03     // Catch:{ JSONException -> 0x0866 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ JSONException -> 0x0866 }
        L_0x084d:
            boolean r0 = r13.hasNext()     // Catch:{ JSONException -> 0x0866 }
            if (r0 == 0) goto L_0x086c
            java.lang.String r1 = X.AnonymousClass000.A0m(r13)     // Catch:{ JSONException -> 0x0866 }
            java.lang.Object r0 = r12.get(r1)     // Catch:{ JSONException -> 0x0866 }
            X.AnonymousClass00B.A06(r0)     // Catch:{ JSONException -> 0x0866 }
            boolean r0 = X.AnonymousClass000.A1X(r0)     // Catch:{ JSONException -> 0x0866 }
            r7.put(r1, r0)     // Catch:{ JSONException -> 0x0866 }
            goto L_0x084d
        L_0x0866:
            r1 = move-exception
            java.lang.String r0 = "BackupExpiryManager/getGoogleBackupJsonMetadata failed to create json"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IOException -> 0x0879 }
        L_0x086c:
            java.lang.String r1 = r7.toString()     // Catch:{ IOException -> 0x0879 }
            java.lang.String r0 = "backupExpiry"
            r10.put(r0, r1)     // Catch:{ IOException -> 0x0879 }
            r6.A01()     // Catch:{ IOException -> 0x0879 }
            goto L_0x0881
        L_0x0879:
            r1 = move-exception
            java.lang.String r0 = "gdrive/backup/build-metadata"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r10 = r29
        L_0x0881:
            r28.A01()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            if (r10 != 0) goto L_0x0894
            java.lang.String r0 = "gdrive/backup/files/failed to build metadata"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r1 = r20
            r0 = r52
            r0.A0C = r1     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r6 = 0
            goto L_0x0932
        L_0x0894:
            boolean r0 = r44.get()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            if (r0 == 0) goto L_0x09aa
            r0 = 8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = r52
            r0.A0D = r1     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            int r12 = r11.size()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r1 = 0
        L_0x08a9:
            if (r1 >= r12) goto L_0x08ca
            int r7 = r1 + 2500
            int r0 = java.lang.Math.min(r7, r12)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.util.List r1 = r11.subList(r1, r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            X.2xM r6 = new X.2xM     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = r18
            r6.<init>(r8, r0, r1)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r1 = r45
            r0 = r23
            java.lang.Object r1 = X.AnonymousClass2GS.A00(r6, r1, r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            if (r1 != r0) goto L_0x0926
            r1 = r7
            goto L_0x08a9
        L_0x08ca:
            boolean r0 = r44.get()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            if (r0 == 0) goto L_0x09aa
            java.util.Iterator r11 = r11.iterator()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
        L_0x08d4:
            boolean r0 = r11.hasNext()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            if (r0 == 0) goto L_0x08ee
            java.lang.Object r0 = r11.next()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            X.3Ad r0 = (X.C61743Ad) r0     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            long r6 = r9.A04     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            long r0 = r0.A00     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            long r6 = r6 + r0
            r9.A04 = r6     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            long r0 = r9.A07     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            long r0 = r0 + r16
            r9.A07 = r0     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            goto L_0x08d4
        L_0x08ee:
            java.lang.String r1 = "chat-database-deleted"
            r0 = r21
            r9.A01(r0, r1)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            X.0ug r6 = r9.A0Y     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            r6.A07(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = 10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = r52
            r0.A0D = r1     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            X.2xO r6 = new X.2xO     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r6.<init>(r8, r10)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r1 = r45
            r0 = r23
            java.lang.Object r1 = X.AnonymousClass2GS.A00(r6, r1, r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r6 = 1
            if (r1 == r0) goto L_0x0932
            r6 = 0
            r1 = r20
            r0 = r52
            r0.A0C = r1     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.lang.String r0 = "gdrive/backup/files failed to commit backup"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            goto L_0x0932
        L_0x0926:
            r6 = 0
            r1 = r20
            r0 = r52
            r0.A0C = r1     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.lang.String r0 = "gdrive/backup/files/failed to delete files"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
        L_0x0932:
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.util.Locale r11 = java.util.Locale.ENGLISH     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = 1
            java.lang.Object[] r10 = new java.lang.Object[r0]     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            long r7 = r7 - r2
            double r0 = (double) r7     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 / r2
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r10[r19] = r0     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.lang.String r0 = "gdrive/backup/files total wall time for backup: %2f seconds."
            java.lang.String.format(r11, r0, r10)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            long r2 = r38.get()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            long r0 = r47.get()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            long r2 = r2 + r0
            double r0 = (double) r2     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = r52
            r0.A09 = r1     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            long r2 = r47.get()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            double r0 = (double) r2     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.lang.Double r1 = java.lang.Double.valueOf(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = r52
            r0.A08 = r1     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            long r10 = r40.get()     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            long r0 = r9.A05     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1P(r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = r52
            r0.A01 = r1     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.lang.Long r1 = java.lang.Long.valueOf(r7)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0.A0M = r1     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.lang.String r0 = "gdrive/backup/files backup finished (success ="
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r1.append(r6)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.lang.String r0 = ")"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            if (r6 == 0) goto L_0x0a01
            r1 = 0
            r0 = r54
            r0.A0j(r1)     // Catch:{ 1db -> 0x0a1b, 1kR -> 0x0ab6 }
            X.5Oe r1 = r9.A0M     // Catch:{ 1db -> 0x0a1b, 1kR -> 0x0ab6 }
            r0 = 10
            r1.AQR(r0)     // Catch:{ 1db -> 0x0a1b, 1kR -> 0x0ab6 }
            goto L_0x0ac5
        L_0x09aa:
            com.whatsapp.util.Log.i((java.lang.String) r22)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            goto L_0x09bf
        L_0x09ae:
            java.lang.String r0 = "gdrive/backup/files failed to uploadFiles"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0 = r52
            java.lang.Integer r0 = r0.A0C     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            if (r0 != 0) goto L_0x09bf
            r1 = r20
            r0 = r52
            r0.A0C = r1     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
        L_0x09bf:
            r6 = 0
            goto L_0x0a01
        L_0x09c1:
            com.whatsapp.util.Log.i((java.lang.String) r22)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            goto L_0x0a01
        L_0x09c5:
            java.lang.String r0 = "gdrive/backup/get-chatdb-file "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r1.append(r3)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.lang.String r0 = " does not exist, may be user deleted it or local backup is running?"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.lang.String r0 = "File "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r1.append(r3)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.lang.String r0 = " does not exist."
            java.lang.String r1 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            X.3iT r0 = new X.3iT     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0.<init>(r1)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            throw r0     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
        L_0x09ec:
            r2 = move-exception
            java.lang.String r1 = "Unexpected failure: "
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            r0.<init>(r1, r2)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            throw r0     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
        L_0x09f5:
            r1 = 31
            r0 = r52
            X.AnonymousClass2GT.A00(r0, r1)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
            java.lang.String r0 = "gdrive/backup/fetch-token/network-failure-at-token-fetch-stage"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1db -> 0x0a18, 1kR -> 0x0a14 }
        L_0x0a01:
            r0 = r53
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0c     // Catch:{ 1db -> 0x0a1b, 1kR -> 0x0ab6 }
            boolean r0 = r0.get()     // Catch:{ 1db -> 0x0a1b, 1kR -> 0x0ab6 }
            if (r0 == 0) goto L_0x0c15
            X.5Oe r1 = r9.A0M     // Catch:{ 1db -> 0x0a1b, 1kR -> 0x0ab6 }
            r0 = 14
            r1.AQR(r0)     // Catch:{ 1db -> 0x0a1b, 1kR -> 0x0ab6 }
            goto L_0x0c15
        L_0x0a14:
            r1 = move-exception
            r6 = 0
            goto L_0x0ab7
        L_0x0a18:
            r1 = move-exception
            r6 = 0
            goto L_0x0a1c
        L_0x0a1b:
            r1 = move-exception
        L_0x0a1c:
            X.5Oe r2 = r9.A0M
            java.lang.String r0 = "gdrive/backup/exception-during-backup"
            com.whatsapp.util.Log.e(r0, r1)
            boolean r0 = r1 instanceof X.C71043iO
            if (r0 == 0) goto L_0x0a67
            java.lang.Throwable r1 = r1.getCause()
            boolean r0 = r1 instanceof X.AnonymousClass3W3
            if (r0 == 0) goto L_0x0a3b
            java.lang.String r0 = "gdrive/backup/exception-during-backup/auth-failed/google-play-services-unavailable"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r3 = 21
        L_0x0a36:
            r2.AQR(r3)
            goto L_0x0ac3
        L_0x0a3b:
            boolean r0 = r1 instanceof X.AnonymousClass2RG
            if (r0 == 0) goto L_0x0a47
            java.lang.String r0 = "gdrive/backup/exception-during-backup/auth-failed/user-recoverable-exception"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r3 = 28
            goto L_0x0a36
        L_0x0a47:
            boolean r0 = r1 instanceof java.lang.SecurityException
            if (r0 == 0) goto L_0x0a53
            java.lang.String r0 = "gdrive/backup/exception-during-backup/auth-failed/security-exception"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r3 = 30
            goto L_0x0a36
        L_0x0a53:
            boolean r0 = r1 instanceof java.lang.NullPointerException
            if (r0 == 0) goto L_0x0a5f
            java.lang.String r0 = "gdrive/backup/exception-during-backup/auth-failed/null-pointer-exception"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r3 = 31
            goto L_0x0a36
        L_0x0a5f:
            java.lang.String r0 = "gdrive/backup/exception-during-backup/auth-failed/unknown-cause"
            com.whatsapp.util.Log.e(r0, r1)
            r3 = 11
            goto L_0x0a36
        L_0x0a67:
            boolean r0 = r1 instanceof X.C71163ia
            if (r0 == 0) goto L_0x0a6e
            r3 = 12
            goto L_0x0a36
        L_0x0a6e:
            boolean r0 = r1 instanceof X.C71053iP
            r3 = 18
            if (r0 != 0) goto L_0x0a36
            boolean r0 = r1 instanceof X.C71023iM
            if (r0 != 0) goto L_0x0a36
            boolean r0 = r1 instanceof X.C71103iU
            if (r0 == 0) goto L_0x0a7f
            r3 = 15
            goto L_0x0a36
        L_0x0a7f:
            boolean r0 = r1 instanceof X.C71083iS
            r3 = 19
            if (r0 != 0) goto L_0x0a36
            boolean r0 = r1 instanceof X.C71033iN
            if (r0 != 0) goto L_0x0a36
            boolean r0 = r1 instanceof X.C71073iR
            if (r0 == 0) goto L_0x0a90
            r3 = 13
            goto L_0x0a36
        L_0x0a90:
            boolean r0 = r1 instanceof X.C71093iT
            if (r0 == 0) goto L_0x0a97
            r3 = 16
            goto L_0x0a36
        L_0x0a97:
            boolean r0 = r1 instanceof X.C71153iZ
            if (r0 == 0) goto L_0x0a9e
            r3 = 23
            goto L_0x0a36
        L_0x0a9e:
            boolean r0 = r1 instanceof X.C71063iQ
            if (r0 == 0) goto L_0x0aa5
            r3 = 25
            goto L_0x0a36
        L_0x0aa5:
            boolean r0 = r1 instanceof X.C71113iV
            r3 = 27
            if (r0 != 0) goto L_0x0a36
            r0 = 26
            r2.AQR(r0)
            java.lang.String r0 = "gdrive/backup/exception-during-backup/unexpected-failure"
            com.whatsapp.util.Log.e(r0, r1)
            goto L_0x0ac3
        L_0x0ab6:
            r1 = move-exception
        L_0x0ab7:
            java.lang.String r0 = "gdrive/backup"
            com.whatsapp.util.Log.e(r0, r1)
            X.5Oe r1 = r9.A0M
            r0 = 20
            r1.AQR(r0)
        L_0x0ac3:
            if (r6 == 0) goto L_0x0c15
        L_0x0ac5:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r24)
            r0 = r52
            r0.A0C = r7
            long r2 = r9.A03
            double r0 = (double) r2
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            r0 = r52
            r0.A03 = r1
            long r2 = r9.A08
            double r0 = (double) r2
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            r0 = r52
            r0.A0A = r1
            long r2 = r9.A06
            double r0 = (double) r2
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            r0 = r52
            r0.A05 = r1
            long r2 = r9.A02
            double r0 = (double) r2
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            r0 = r52
            r0.A07 = r1
            long r2 = r9.A04
            double r0 = (double) r2
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            r0 = r52
            r0.A02 = r1
            int r0 = r9.A00
            double r0 = (double) r0
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            r0 = r52
            r0.A04 = r1
            long r0 = r9.A07
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = r52
            r0.A0G = r1
            int r0 = r54.A0D()
            java.lang.Long r1 = X.C13690nt.A0W(r0)
            r0 = r52
            r0.A0L = r1
            boolean r0 = r54.A1a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r0 = r52
            r0.A00 = r1
            r0 = r53
            int r1 = r0.A00
            r0 = 1
            if (r1 != r0) goto L_0x0c11
            r0 = 1
        L_0x0b3a:
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = r52
            r0.A0I = r1
            java.lang.Integer r0 = r0.A0D
            if (r0 != 0) goto L_0x0b4a
            r0 = r52
            r0.A0D = r7
        L_0x0b4a:
            r0 = r49
            int r1 = r0.A00
            int r0 = r48.get()
            int r1 = r1 + r0
            java.lang.String r0 = "gdrive/backup/total-requests-in-backup-session/"
            java.lang.String r0 = X.C13680ns.A0c(r1, r0)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            double r0 = (double) r1
            java.lang.Double r1 = java.lang.Double.valueOf(r0)
            r0 = r52
            r0.A06 = r1
            java.lang.String r3 = r54.A0M()
            long r0 = java.lang.System.currentTimeMillis()
            r2 = r54
            r2.A11(r3, r0)
            java.lang.String r3 = r54.A0M()
            long r0 = r9.A02
            r2.A12(r3, r0)
            java.lang.String r3 = r54.A0M()
            long r0 = r9.A06
            r2.A10(r3, r0)
            java.lang.String r3 = r54.A0M()
            long r0 = r9.A09
            r2.A13(r3, r0)
            java.lang.String r2 = r54.A0M()
            boolean r1 = r50.A1f()
            r0 = r54
            r0.A1C(r2, r1)
            android.content.SharedPreferences$Editor r2 = r54.A0K()
            java.lang.String r1 = "gdrive_successive_backup_failed_count"
            r0 = 0
            X.C13680ns.A0w(r2, r1, r0)
            android.content.SharedPreferences$Editor r1 = r54.A0K()
            java.lang.String r0 = "gdrive_backup_start_timestamp"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "gdrive_already_uploaded_bytes"
            android.content.SharedPreferences$Editor r1 = r1.remove(r0)
            java.lang.String r0 = "gdrive_user_initiated_backup"
            X.C13690nt.A0v(r1, r0)
            X.12T r1 = r9.A0I
            r0 = r18
            java.lang.String r0 = r0.A0F
            r1.A01(r0)
            java.util.concurrent.atomic.AtomicLong r0 = r9.A0e
            r0.set(r4)
            java.util.concurrent.atomic.AtomicLong r0 = r9.A0g
            r0.set(r4)
            r0 = r47
            r0.set(r4)
            r1 = 0
            r0 = r46
            r0.set(r1)
            r0 = r53
            r0.A04 = r1
            X.AnonymousClass2GS.A02()
            boolean r0 = r18.A0B()
            if (r0 == 0) goto L_0x0bf2
            r55.A04()
        L_0x0be7:
            r9.A05 = r4
        L_0x0be9:
            r0 = r53
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.A0c
            r0 = 0
            r1.getAndSet(r0)
            return r6
        L_0x0bf2:
            r1 = 1
            r0 = r55
            r0.A08(r1)
            java.lang.String r0 = "gdrive/backup "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = X.AnonymousClass2GK.A0A(r52)
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0t9 r1 = r9.A0W
            r0 = r52
            r1.A06(r0)
            goto L_0x0be7
        L_0x0c11:
            r0 = 0
            goto L_0x0b3a
        L_0x0c15:
            X.AnonymousClass2GS.A02()
            r0 = r47
            r0.set(r4)
            r1 = 0
            r0 = r46
            r0.set(r1)
            monitor-enter(r18)
            r0 = r18
            boolean r0 = r0.A01     // Catch:{ all -> 0x0d08 }
            monitor-exit(r18)
            if (r0 == 0) goto L_0x0c46
            java.lang.String r0 = "gdrive/backup was canceled"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r1 = 39
            r0 = r52
            X.AnonymousClass2GT.A00(r0, r1)
            r55.A04()
            r9.A00()
            r9.A05 = r4
            r1 = 0
            r0 = r54
            r0.A0j(r1)
            goto L_0x0be9
        L_0x0c46:
            X.2GJ r1 = r9.A0J
            boolean r0 = r1.A04()
            if (r0 != 0) goto L_0x0cea
            java.lang.String r0 = "gdrive/backup failed on unavailable resource conditions"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            boolean r0 = r9 instanceof X.AnonymousClass2xS
            if (r0 == 0) goto L_0x0cc1
            X.2xS r9 = (X.AnonymousClass2xS) r9
            com.obwhatsapp.backup.google.workers.GoogleBackupWorker r3 = r9.A00
            X.3iK r1 = r3.A0A
            boolean r0 = r1.A04()
            if (r0 != 0) goto L_0x0be9
            androidx.work.WorkerParameters r0 = r3.A01
            int r0 = r0.A00
            int r2 = r3.A00
            if (r0 >= r2) goto L_0x0ced
            boolean r0 = r1.A02()
            if (r0 != 0) goto L_0x0c94
            X.2GT r2 = r3.A0P
            r1 = 22
        L_0x0c75:
            X.AnonymousClass2GT.A00(r2, r1)
        L_0x0c78:
            java.lang.String r0 = "google-backup-worker/doWork conditions were not met(result code = "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            X.2GT r0 = r3.A0P
            java.lang.Integer r0 = r0.A0C
            r1.append(r0)
            java.lang.String r0 = "), retrying backup later"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
        L_0x0c8f:
            r9.A02(r0)
            goto L_0x0be9
        L_0x0c94:
            boolean r0 = r1.A01()
            if (r0 != 0) goto L_0x0cab
            X.0yo r0 = r3.A06
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0h
            boolean r0 = r0.get()
            X.2GT r2 = r3.A0P
            r1 = 19
            if (r0 != 0) goto L_0x0c75
            r1 = 20
            goto L_0x0c75
        L_0x0cab:
            boolean r0 = r1.A03()
            if (r0 != 0) goto L_0x0cb6
            X.2GT r2 = r3.A0P
            r1 = 21
            goto L_0x0c75
        L_0x0cb6:
            boolean r0 = r1.A00()
            if (r0 != 0) goto L_0x0c78
            X.2GT r2 = r3.A0P
            r1 = 23
            goto L_0x0c75
        L_0x0cc1:
            boolean r0 = r1.A02()
            if (r0 != 0) goto L_0x0ccf
            r1 = 34
        L_0x0cc9:
            r0 = r52
            X.AnonymousClass2GT.A00(r0, r1)
            goto L_0x0d06
        L_0x0ccf:
            boolean r0 = r1.A00()
            if (r0 != 0) goto L_0x0cd8
            r1 = 37
            goto L_0x0cc9
        L_0x0cd8:
            boolean r0 = r1.A01()
            if (r0 != 0) goto L_0x0ce1
            r1 = 35
            goto L_0x0cc9
        L_0x0ce1:
            boolean r0 = r1.A03()
            if (r0 != 0) goto L_0x0d06
            r1 = 36
            goto L_0x0cc9
        L_0x0cea:
            java.lang.String r0 = "gdrive/backup failed"
            goto L_0x0d03
        L_0x0ced:
            X.2GT r1 = r3.A0P
            r0 = 24
            X.AnonymousClass2GT.A00(r1, r0)
            java.lang.String r0 = "google-backup-worker/doWork worker reached the maximum amount of retries("
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r2)
            java.lang.String r0 = "), failing"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
        L_0x0d03:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0d06:
            r0 = 1
            goto L_0x0c8f
        L_0x0d08:
            r0 = move-exception
            monitor-exit(r18)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C616039o.A03():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0056, code lost:
        if (r2.length() <= 0) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(java.util.List r26, java.util.List r27, java.util.List r28) {
        /*
            r25 = this;
            r7 = r26
            r7.size()
            r0 = 0
            java.util.concurrent.atomic.AtomicReference r5 = new java.util.concurrent.atomic.AtomicReference
            r5.<init>(r0)
            int r0 = r7.size()
            java.util.concurrent.CountDownLatch r6 = new java.util.concurrent.CountDownLatch
            r6.<init>(r0)
            r0 = 1
            java.util.concurrent.atomic.AtomicBoolean r4 = new java.util.concurrent.atomic.AtomicBoolean
            r4.<init>(r0)
            int r1 = r7.size()
            r0 = 100
            if (r1 <= r0) goto L_0x00a3
            int r15 = r7.size()
            int r15 = r15 / r0
        L_0x0027:
            r14 = 0
            r3 = 0
        L_0x0029:
            int r0 = r7.size()
            if (r3 >= r0) goto L_0x00a5
            r8 = r25
            X.2GJ r0 = r8.A0J
            boolean r0 = r0.A05()
            if (r0 != 0) goto L_0x003a
            return r14
        L_0x003a:
            int r0 = r3 % r15
            boolean r24 = X.AnonymousClass000.A1P(r0)
            java.lang.Object r2 = r7.get(r3)
            java.io.File r2 = (java.io.File) r2
            boolean r0 = r2.exists()
            r13 = 1
            if (r0 == 0) goto L_0x0058
            long r11 = r2.length()
            r9 = 0
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            r10 = 1
            if (r0 > 0) goto L_0x0059
        L_0x0058:
            r10 = 0
        L_0x0059:
            java.lang.String r9 = r2.getCanonicalPath()     // Catch:{ IOException -> 0x005e }
            goto L_0x0069
        L_0x005e:
            r1 = move-exception
            java.lang.String r0 = "gdrive/backup/failed to get canonical path for "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r2)
            com.whatsapp.util.Log.e(r0, r1)
            r9 = 0
        L_0x0069:
            X.39E r1 = r8.A0H
            if (r9 == 0) goto L_0x007c
            java.lang.String r0 = r1.A04
            boolean r0 = r9.startsWith(r0)
            if (r0 == 0) goto L_0x007c
            boolean r0 = r1.A00(r2, r9)
            if (r0 != 0) goto L_0x007c
            r13 = 0
        L_0x007c:
            r10 = r10 & r13
            if (r10 == 0) goto L_0x009c
            X.3I2 r1 = new X.3I2
            r20 = r27
            r21 = r28
            r22 = r6
            r23 = r5
            r18 = r2
            r19 = r9
            r17 = r8
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            java.util.concurrent.ThreadPoolExecutor r0 = X.AnonymousClass4Az.A02
            r0.execute(r1)
        L_0x0099:
            int r3 = r3 + 1
            goto L_0x0029
        L_0x009c:
            r2.length()
            r6.countDown()
            goto L_0x0099
        L_0x00a3:
            r15 = 1
            goto L_0x0027
        L_0x00a5:
            r6.await()     // Catch:{ InterruptedException -> 0x00a9 }
            goto L_0x00af
        L_0x00a9:
            r1 = move-exception
            java.lang.String r0 = "gdrive/backup/collect-files-to-be-uploaded/waiting for files to be processed was interrupted"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00af:
            java.lang.Object r1 = r5.get()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L_0x00c2
            boolean r0 = r1 instanceof X.C71153iZ
            if (r0 == 0) goto L_0x00bc
            throw r1
        L_0x00bc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00c2:
            boolean r0 = r4.get()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C616039o.A04(java.util.List, java.util.List, java.util.List):boolean");
    }

    public final boolean A05(AtomicReference atomicReference, int i2) {
        StringBuilder A0q;
        String str;
        if (!this.A0F.A0c.get()) {
            Log.i("gdrive/backup/cancelled.");
            return true;
        }
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            Log.i("gdrive/backup", th);
            if ((th instanceof C71043iO) || (th instanceof C71163ia) || (th instanceof C71073iR) || (th instanceof C71053iP) || (th instanceof C71083iS) || (th instanceof C71153iZ) || (th instanceof C71063iQ) || (th instanceof C71033iN)) {
                throw th;
            }
        }
        AtomicLong atomicLong = this.A0e;
        if (atomicLong.get() > 0) {
            AtomicLong atomicLong2 = this.A0f;
            if (C13680ns.A00(atomicLong2, atomicLong) > 1.0d) {
                A0q = AnonymousClass000.A0q("gdrive/backup/too-many-failures/");
                A0q.append(C13680ns.A00(atomicLong2, atomicLong));
                str = "% bytes";
                Log.i(AnonymousClass000.A0h(str, A0q));
                AnonymousClass2GT.A00(this.A0X, 38);
                return true;
            }
        }
        int i3 = i2;
        if (i2 <= 0) {
            return false;
        }
        AtomicInteger atomicInteger = this.A0c;
        double d2 = (double) i3;
        if ((((double) atomicInteger.get()) * 100.0d) / d2 <= 1.0d) {
            return false;
        }
        A0q = AnonymousClass000.A0q("gdrive/backup/too-many-failures/");
        A0q.append((((double) atomicInteger.get()) * 100.0d) / d2);
        str = "% files";
        Log.i(AnonymousClass000.A0h(str, A0q));
        AnonymousClass2GT.A00(this.A0X, 38);
        return true;
    }
}
