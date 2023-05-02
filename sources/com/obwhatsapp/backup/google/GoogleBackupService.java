package com.obwhatsapp.backup.google;

import X.AnonymousClass000;
import X.AnonymousClass022;
import X.AnonymousClass0KV;
import X.AnonymousClass0Rc;
import X.AnonymousClass11D;
import X.AnonymousClass12M;
import X.AnonymousClass12N;
import X.AnonymousClass12P;
import X.AnonymousClass12Q;
import X.AnonymousClass12T;
import X.AnonymousClass12U;
import X.AnonymousClass12W;
import X.AnonymousClass1I1;
import X.AnonymousClass1KN;
import X.AnonymousClass2GS;
import X.C13690nt;
import X.C14710pd;
import X.C14870pt;
import X.C15860rz;
import X.C16040sK;
import X.C16180sb;
import X.C16190sc;
import X.C16200sd;
import X.C16210se;
import X.C16250si;
import X.C16260sj;
import X.C16300so;
import X.C16440t3;
import X.C16480t8;
import X.C16490t9;
import X.C16900tq;
import X.C16980tz;
import X.C17190ug;
import X.C18870xO;
import X.C18990xa;
import X.C19080xj;
import X.C19650ym;
import X.C19670yo;
import X.C27841Ti;
import X.C28261Vb;
import android.app.Notification;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import com.obwhatsapp.Me;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

public final class GoogleBackupService extends C28261Vb {
    public int A00;
    public C16300so A01;
    public C16180sb A02;
    public C14870pt A03;
    public C16040sK A04;
    public C16200sd A05;
    public AnonymousClass1KN A06;
    public AnonymousClass1I1 A07;
    public C19670yo A08;
    public AnonymousClass12U A09;
    public AnonymousClass12M A0A;
    public AnonymousClass12N A0B;
    public AnonymousClass12Q A0C;
    public AnonymousClass12T A0D;
    public C19080xj A0E;
    public C16190sc A0F;
    public AnonymousClass12W A0G;
    public C16440t3 A0H;
    public C16980tz A0I;
    public C16260sj A0J;
    public C15860rz A0K;
    public C16480t8 A0L;
    public C16250si A0M;
    public C19650ym A0N;
    public C16900tq A0O;
    public AnonymousClass11D A0P;
    public C14710pd A0Q;
    public C16490t9 A0R;
    public C18870xO A0S;
    public C17190ug A0T;
    public C18990xa A0U;
    public C27841Ti A0V;
    public C16210se A0W;
    public AnonymousClass12P A0X;
    public Map A0Y;
    public Random A0Z;
    public boolean A0a = false;
    public boolean A0b = false;
    public final Binder A0c = new Binder();
    public final Object A0d = C13690nt.A0Y();
    public final ArrayList A0e = AnonymousClass000.A0u();
    public final AtomicBoolean A0f = new AtomicBoolean(false);

    public GoogleBackupService() {
        super(GoogleBackupService.class.getCanonicalName());
    }

    public final String A01() {
        C16040sK r0 = this.A04;
        r0.A0B();
        Me me = r0.A00;
        if (me == null) {
            Log.i("gdrive-service/my-jid/me is null, can't proceed");
            return null;
        }
        String str = me.jabber_id;
        if (str != null) {
            return str;
        }
        Log.e("gdrive-service/my-jid/jidUser is null, fatal error.");
        return null;
    }

    public IBinder onBind(Intent intent) {
        return this.A0c;
    }

    public void onCreate() {
        A00();
        super.onCreate();
        this.A0C.A04();
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass12M r1 = this.A0A;
        r1.A00 = -1;
        r1.A01 = -1;
        AnonymousClass12N r3 = this.A0B;
        r3.A06.set(0);
        r3.A05.set(0);
        r3.A04.set(0);
        r3.A07.set(0);
        r3.A03.set(0);
        this.A0C.A05();
        try {
            Iterator it = ((List) ((AnonymousClass022) this.A0X.get()).A03().get()).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((AnonymousClass0Rc) it.next()).A03 == AnonymousClass0KV.RUNNING) {
                        break;
                    }
                } else {
                    break;
                }
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        this.A09.A02();
        AnonymousClass2GS.A02();
        this.A08.A06();
        this.A08.A0j.set(false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v167, resolved type: X.3BK} */
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
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:632:0x0f54 A[Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }] */
    /* JADX WARNING: Removed duplicated region for block: B:646:0x0f84 A[Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }] */
    /* JADX WARNING: Removed duplicated region for block: B:647:0x0f86 A[Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }] */
    /* JADX WARNING: Removed duplicated region for block: B:650:0x0f96 A[Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }] */
    /* JADX WARNING: Removed duplicated region for block: B:662:0x0fb9 A[Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }] */
    /* JADX WARNING: Removed duplicated region for block: B:672:0x0fda A[Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }] */
    /* JADX WARNING: Removed duplicated region for block: B:679:0x0ff3 A[Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }] */
    /* JADX WARNING: Removed duplicated region for block: B:686:0x1006 A[SYNTHETIC, Splitter:B:686:0x1006] */
    /* JADX WARNING: Removed duplicated region for block: B:694:0x1018 A[SYNTHETIC, Splitter:B:694:0x1018] */
    /* JADX WARNING: Removed duplicated region for block: B:702:0x103d A[Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }] */
    /* JADX WARNING: Removed duplicated region for block: B:713:0x107b A[Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }] */
    /* JADX WARNING: Removed duplicated region for block: B:734:0x10f5 A[Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }] */
    /* JADX WARNING: Removed duplicated region for block: B:736:0x10fc A[Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }] */
    /* JADX WARNING: Removed duplicated region for block: B:737:0x10fe A[Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0200 A[SYNTHETIC, Splitter:B:84:0x0200] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0214 A[Catch:{ all -> 0x0246 }] */
    /* JADX WARNING: Removed duplicated region for block: B:917:0x15c8 A[Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }] */
    /* JADX WARNING: Removed duplicated region for block: B:922:0x15d9 A[Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }] */
    /* JADX WARNING: Removed duplicated region for block: B:932:0x15f8 A[Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }] */
    /* JADX WARNING: Removed duplicated region for block: B:937:0x160d A[LOOP:27: B:935:0x1607->B:937:0x160d, LOOP_END] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:241:0x04b3=Splitter:B:241:0x04b3, B:237:0x04a6=Splitter:B:237:0x04a6, B:233:0x0499=Splitter:B:233:0x0499, B:229:0x048c=Splitter:B:229:0x048c} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:81:0x01fa=Splitter:B:81:0x01fa, B:94:0x021f=Splitter:B:94:0x021f} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:832:0x1304=Splitter:B:832:0x1304, B:817:0x12bc=Splitter:B:817:0x12bc, B:813:0x12ad=Splitter:B:813:0x12ad, B:809:0x129e=Splitter:B:809:0x129e, B:797:0x126f=Splitter:B:797:0x126f, B:801:0x127f=Splitter:B:801:0x127f, B:805:0x128f=Splitter:B:805:0x128f} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:834:0x1310=Splitter:B:834:0x1310, B:841:0x136c=Splitter:B:841:0x136c} */
    public void onHandleIntent(android.content.Intent r51) {
        /*
            r50 = this;
            r7 = 0
            r9 = r51
            if (r51 == 0) goto L_0x0015
            java.lang.String r5 = r9.getAction()
        L_0x0009:
            java.lang.String r11 = "gdrive-service/handle-intent started without an action."
            r0 = r50
            if (r5 == 0) goto L_0x0404
            X.12U r2 = r0.A09
            java.lang.Object r1 = r2.A0O
            monitor-enter(r1)
            goto L_0x0017
        L_0x0015:
            r5 = r7
            goto L_0x0009
        L_0x0017:
            r2.A03 = r5     // Catch:{ all -> 0x03f1 }
            monitor-exit(r1)     // Catch:{ all -> 0x03f1 }
            X.0yo r1 = r0.A08
            r4 = 1
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.A0j
            r1.set(r4)
            java.lang.String r1 = "action_backup_export"
            boolean r1 = r5.contentEquals(r1)
            if (r1 == 0) goto L_0x0255
            X.0rz r1 = r0.A0K     // Catch:{ all -> 0x0246 }
            boolean r1 = X.AnonymousClass2GK.A0G(r1)     // Catch:{ all -> 0x0246 }
            if (r1 != 0) goto L_0x178c
            X.0yo r1 = r0.A08     // Catch:{ all -> 0x0246 }
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.A0c     // Catch:{ all -> 0x0246 }
            boolean r1 = r1.get()     // Catch:{ all -> 0x0246 }
            if (r1 != 0) goto L_0x178c
            X.0rz r1 = r0.A0K     // Catch:{ all -> 0x0246 }
            boolean r1 = X.AnonymousClass2GK.A0H(r1)     // Catch:{ all -> 0x0246 }
            if (r1 != 0) goto L_0x178c
            X.0yo r2 = r0.A08     // Catch:{ all -> 0x0246 }
            java.lang.String r1 = android.os.Environment.getExternalStorageState()     // Catch:{ all -> 0x0246 }
            r2.A09(r1)     // Catch:{ all -> 0x0246 }
            X.0yo r1 = r0.A08     // Catch:{ all -> 0x0246 }
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.A0a     // Catch:{ all -> 0x0246 }
            r1.set(r4)     // Catch:{ all -> 0x0246 }
            X.0yo r1 = r0.A08     // Catch:{ all -> 0x0246 }
            r2 = 0
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.A0Z     // Catch:{ all -> 0x0246 }
            r1.set(r2)     // Catch:{ all -> 0x0246 }
            java.lang.String r1 = "gdrive-service/handle-intent/backup-export-pending"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0246 }
            java.lang.String r3 = "backup_storage_needed"
            r1 = -1
            long r1 = r9.getLongExtra(r3, r1)     // Catch:{ all -> 0x0246 }
            X.1KN r11 = r0.A06     // Catch:{ all -> 0x0246 }
            X.12O r10 = r11.A02     // Catch:{ all -> 0x0246 }
            X.2GP r3 = r10.A00     // Catch:{ all -> 0x0246 }
            r28 = r3
            java.util.Iterator r5 = X.C16590tJ.A00(r28)     // Catch:{ all -> 0x0246 }
        L_0x0075:
            boolean r3 = r5.hasNext()     // Catch:{ all -> 0x0246 }
            if (r3 == 0) goto L_0x0085
            java.lang.Object r3 = r5.next()     // Catch:{ all -> 0x0246 }
            X.12S r3 = (X.AnonymousClass12S) r3     // Catch:{ all -> 0x0246 }
            r3.ANI(r1)     // Catch:{ all -> 0x0246 }
            goto L_0x0075
        L_0x0085:
            r8 = 0
            r5 = -1
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 == 0) goto L_0x0241
            X.1KM r3 = r11.A03     // Catch:{ all -> 0x0246 }
            java.util.Locale r11 = java.util.Locale.US     // Catch:{ all -> 0x0246 }
            java.lang.String r5 = "yyyy_MM_dd_HH_mm"
            java.text.SimpleDateFormat r6 = new java.text.SimpleDateFormat     // Catch:{ all -> 0x0246 }
            r6.<init>(r5, r11)     // Catch:{ all -> 0x0246 }
            java.util.Date r5 = new java.util.Date     // Catch:{ all -> 0x0246 }
            r5.<init>()     // Catch:{ all -> 0x0246 }
            java.lang.String r11 = r6.format(r5)     // Catch:{ all -> 0x0246 }
            java.lang.String r5 = "OBWhatsApp_"
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0r(r5)     // Catch:{ all -> 0x0246 }
            r6.append(r11)     // Catch:{ all -> 0x0246 }
            java.lang.String r5 = ".crypt14"
            java.lang.String r11 = X.AnonymousClass000.A0h(r5, r6)     // Catch:{ all -> 0x0246 }
            X.0tx r6 = X.C16960tx.A06     // Catch:{ all -> 0x0246 }
            java.lang.String r5 = android.os.Environment.DIRECTORY_DOWNLOADS     // Catch:{ Exception -> 0x023b }
            java.io.File r5 = android.os.Environment.getExternalStoragePublicDirectory(r5)     // Catch:{ Exception -> 0x023b }
            java.io.File r12 = X.C13700nu.A0C(r5, r11)     // Catch:{ Exception -> 0x023b }
            X.12V r5 = r3.A0D     // Catch:{ Exception -> 0x023b }
            r25 = r5
            X.0sK r5 = r3.A01     // Catch:{ Exception -> 0x023b }
            r17 = r5
            X.0xG r5 = r3.A09     // Catch:{ Exception -> 0x023b }
            r22 = r5
            X.0sd r15 = r3.A02     // Catch:{ Exception -> 0x023b }
            X.12W r14 = r3.A06     // Catch:{ Exception -> 0x023b }
            X.0u0 r13 = r3.A0C     // Catch:{ Exception -> 0x023b }
            X.12X r11 = r3.A0B     // Catch:{ Exception -> 0x023b }
            int r5 = r6.version     // Catch:{ Exception -> 0x023b }
            if (r5 != r5) goto L_0x0220
            X.2G1 r6 = new X.2G1     // Catch:{ Exception -> 0x023b }
            r6.<init>(r12)     // Catch:{ Exception -> 0x023b }
            java.lang.Long r27 = java.lang.Long.valueOf(r1)     // Catch:{ Exception -> 0x023b }
            X.2xC r5 = new X.2xC     // Catch:{ Exception -> 0x023b }
            r26 = r7
            r16 = r5
            r18 = r6
            r19 = r7
            r20 = r15
            r21 = r14
            r23 = r11
            r24 = r13
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)     // Catch:{ Exception -> 0x023b }
            X.0tz r6 = r3.A07     // Catch:{ Exception -> 0x023b }
            android.content.Context r6 = r6.A00     // Catch:{ Exception -> 0x023b }
            X.5Uj r20 = r5.A02(r6)     // Catch:{ Exception -> 0x023b }
            if (r20 == 0) goto L_0x0241
            X.0sc r11 = r3.A05     // Catch:{ all -> 0x021b }
            X.01D r5 = r11.A03     // Catch:{ all -> 0x021b }
            java.lang.Object r13 = r5.get()     // Catch:{ all -> 0x021b }
            java.io.File r13 = (java.io.File) r13     // Catch:{ all -> 0x021b }
            X.0yo r7 = r3.A04     // Catch:{ Exception -> 0x01ed }
            if (r7 == 0) goto L_0x0128
            r5 = 5000(0x1388, double:2.4703E-320)
            boolean r5 = r7.A0E(r5)     // Catch:{ Exception -> 0x01ed }
            if (r5 != 0) goto L_0x0128
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()     // Catch:{ Exception -> 0x01ed }
            java.lang.String r1 = "backup-export-storage/backup-files-in-whatsapp-folder/timeout "
            r2.append(r1)     // Catch:{ Exception -> 0x01ed }
            java.lang.String r1 = r13.getAbsolutePath()     // Catch:{ Exception -> 0x01ed }
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r2)     // Catch:{ Exception -> 0x01ed }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ Exception -> 0x01ed }
            goto L_0x01f3
        L_0x0128:
            java.util.LinkedList r5 = new java.util.LinkedList     // Catch:{ Exception -> 0x01ed }
            r5.<init>()     // Catch:{ Exception -> 0x01ed }
            r5.add(r13)     // Catch:{ Exception -> 0x01ed }
            r3.A00 = r8     // Catch:{ Exception -> 0x01ed }
            X.52p r19 = new X.52p     // Catch:{ Exception -> 0x01ed }
            r6 = r19
            r6.<init>(r3, r1)     // Catch:{ Exception -> 0x01ed }
            com.facebook.redex.IDxPredicateShape413S0100000_2_I1 r15 = new com.facebook.redex.IDxPredicateShape413S0100000_2_I1     // Catch:{ Exception -> 0x01ed }
            r15.<init>(r3, r8)     // Catch:{ Exception -> 0x01ed }
            r17 = 0
            r25 = 0
        L_0x0142:
            java.lang.Object r1 = r5.peek()     // Catch:{ Exception -> 0x01ed }
            if (r1 == 0) goto L_0x01eb
            java.lang.Object r2 = r5.poll()     // Catch:{ Exception -> 0x01ed }
            java.io.File r2 = (java.io.File) r2     // Catch:{ Exception -> 0x01ed }
            X.AnonymousClass00B.A06(r2)     // Catch:{ Exception -> 0x01ed }
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.A0Z     // Catch:{ Exception -> 0x01ed }
            r21 = r1
            boolean r1 = r21.get()     // Catch:{ Exception -> 0x01ed }
            if (r1 != 0) goto L_0x01e9
            boolean r1 = r2.exists()     // Catch:{ Exception -> 0x01ed }
            java.lang.String r16 = "backup-export-storage/backup-files-in-whatsapp-folder/does-not-exist "
            if (r1 == 0) goto L_0x01d8
            boolean r1 = r2.isDirectory()     // Catch:{ Exception -> 0x01ed }
            if (r1 == 0) goto L_0x01b5
            java.lang.String r6 = r2.getPath()     // Catch:{ Exception -> 0x01ed }
            java.io.File r1 = r11.A03()     // Catch:{ Exception -> 0x01ed }
            java.lang.String r1 = r1.getPath()     // Catch:{ Exception -> 0x01ed }
            boolean r1 = r6.contentEquals(r1)     // Catch:{ Exception -> 0x01ed }
            if (r1 == 0) goto L_0x0187
            X.0si r1 = r3.A0A     // Catch:{ Exception -> 0x01ed }
            java.io.File r1 = r1.A0B()     // Catch:{ Exception -> 0x01ed }
            if (r1 == 0) goto L_0x0142
            r5.add(r1)     // Catch:{ Exception -> 0x01ed }
            goto L_0x0142
        L_0x0187:
            java.io.File[] r6 = r2.listFiles()     // Catch:{ Exception -> 0x01ed }
            if (r6 == 0) goto L_0x0142
            int r14 = r6.length     // Catch:{ Exception -> 0x01ed }
            r2 = 0
        L_0x018f:
            if (r2 >= r14) goto L_0x0142
            r1 = r6[r2]     // Catch:{ Exception -> 0x01ed }
            boolean r13 = r21.get()     // Catch:{ Exception -> 0x01ed }
            if (r13 != 0) goto L_0x01e9
            boolean r13 = r1.exists()     // Catch:{ Exception -> 0x01ed }
            if (r13 == 0) goto L_0x01a3
            r5.add(r1)     // Catch:{ Exception -> 0x01ed }
            goto L_0x01b2
        L_0x01a3:
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0q(r16)     // Catch:{ Exception -> 0x01ed }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ Exception -> 0x01ed }
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r13)     // Catch:{ Exception -> 0x01ed }
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ Exception -> 0x01ed }
        L_0x01b2:
            int r2 = r2 + 1
            goto L_0x018f
        L_0x01b5:
            long r13 = r2.length()     // Catch:{ Exception -> 0x01ed }
            int r1 = (r13 > r17 ? 1 : (r13 == r17 ? 0 : -1))
            if (r1 <= 0) goto L_0x0142
            boolean r1 = r21.get()     // Catch:{ Exception -> 0x01ed }
            if (r1 != 0) goto L_0x01e9
            java.lang.String r24 = r11.A08(r2)     // Catch:{ Exception -> 0x01ed }
            r21 = r15
            r22 = r19
            r23 = r2
            r20.AiE(r21, r22, r23, r24, r25)     // Catch:{ Exception -> 0x01ed }
            long r1 = r2.length()     // Catch:{ Exception -> 0x01ed }
            long r25 = r25 + r1
            goto L_0x0142
        L_0x01d8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r16)     // Catch:{ Exception -> 0x01ed }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ Exception -> 0x01ed }
            java.lang.String r1 = X.AnonymousClass000.A0h(r2, r1)     // Catch:{ Exception -> 0x01ed }
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ Exception -> 0x01ed }
            goto L_0x0142
        L_0x01e9:
            r2 = 2
            goto L_0x01f4
        L_0x01eb:
            r2 = 0
            goto L_0x01fa
        L_0x01ed:
            r2 = move-exception
            java.lang.String r1 = "backup-export-storage/backup-files-in-whatsapp-folder/failed/"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x021b }
        L_0x01f3:
            r2 = 1
        L_0x01f4:
            r20.close()     // Catch:{ all -> 0x021b }
            X.C13690nt.A1K(r12)     // Catch:{ all -> 0x021b }
        L_0x01fa:
            r20.close()     // Catch:{ Exception -> 0x023b }
            r1 = 2
            if (r2 != r1) goto L_0x0214
            java.util.Iterator r2 = X.C16590tJ.A00(r28)     // Catch:{ all -> 0x0246 }
        L_0x0204:
            boolean r1 = r2.hasNext()     // Catch:{ all -> 0x0246 }
            if (r1 == 0) goto L_0x178c
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x0246 }
            X.12S r1 = (X.AnonymousClass12S) r1     // Catch:{ all -> 0x0246 }
            r1.ANF()     // Catch:{ all -> 0x0246 }
            goto L_0x0204
        L_0x0214:
            if (r2 != 0) goto L_0x0241
            r10.A00(r4)     // Catch:{ all -> 0x0246 }
            goto L_0x178c
        L_0x021b:
            r1 = move-exception
            r20.close()     // Catch:{ all -> 0x021f }
        L_0x021f:
            throw r1     // Catch:{ Exception -> 0x023b }
        L_0x0220:
            java.lang.String r1 = "BackupFile/verify-integrity/only-accept-crypt14-version/current-version/: "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r1)     // Catch:{ Exception -> 0x023b }
            r2.append(r6)     // Catch:{ Exception -> 0x023b }
            java.lang.String r1 = " "
            java.lang.String r2 = X.AnonymousClass000.A0e(r12, r1, r2)     // Catch:{ Exception -> 0x023b }
            r1 = 4
            r13.A00(r2, r1)     // Catch:{ Exception -> 0x023b }
            java.lang.String r2 = "BackupFile/verify-integrity/only-accept-crypt14-version/incorrect-or-unknown-version"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ Exception -> 0x023b }
            r1.<init>(r2)     // Catch:{ Exception -> 0x023b }
            throw r1     // Catch:{ Exception -> 0x023b }
        L_0x023b:
            r2 = move-exception
            java.lang.String r1 = "backup-export-storage/backup/failed/"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x0246 }
        L_0x0241:
            r10.A00(r8)     // Catch:{ all -> 0x0246 }
            goto L_0x178c
        L_0x0246:
            r4 = move-exception
            X.0yo r1 = r0.A08
            r2 = 0
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.A0a
            r1.set(r2)
            X.0rz r0 = r0.A0K
            r0.A0j(r2)
            throw r4
        L_0x0255:
            java.lang.String r1 = "action_backup_import"
            boolean r1 = r5.contentEquals(r1)
            if (r1 == 0) goto L_0x039c
            android.net.Uri r1 = r9.getData()
            if (r1 == 0) goto L_0x179b
            android.net.Uri r8 = r9.getData()
            X.0rz r1 = r0.A0K     // Catch:{ all -> 0x0392 }
            java.lang.String r1 = r1.A0P()     // Catch:{ all -> 0x0392 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0392 }
            if (r1 == 0) goto L_0x0281
            java.lang.String r1 = "google-service/backup-import jid is null"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0392 }
            X.12U r2 = r0.A09     // Catch:{ all -> 0x0392 }
            r1 = 18
            r2.A05(r1)     // Catch:{ all -> 0x0392 }
            goto L_0x0388
        L_0x0281:
            X.0yo r1 = r0.A08     // Catch:{ all -> 0x0392 }
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.A0b     // Catch:{ all -> 0x0392 }
            r1.set(r4)     // Catch:{ all -> 0x0392 }
            X.1KN r5 = r0.A06     // Catch:{ all -> 0x0392 }
            X.1KM r7 = r5.A03     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x037d }
            monitor-enter(r7)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x037d }
            X.0xG r12 = r7.A09     // Catch:{ all -> 0x037a }
            X.0tz r2 = r7.A07     // Catch:{ all -> 0x037a }
            X.1kE r4 = new X.1kE     // Catch:{ all -> 0x037a }
            r4.<init>()     // Catch:{ all -> 0x037a }
            r1 = 4
            com.facebook.redex.RunnableRunnableShape6S0200000_I0_4 r11 = new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4     // Catch:{ IOException -> 0x0301 }
            r11.<init>(r12, r1, r4)     // Catch:{ IOException -> 0x0301 }
            r8.getPath()     // Catch:{ IOException -> 0x0301 }
            android.content.Context r1 = r2.A00     // Catch:{ IOException -> 0x0301 }
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch:{ IOException -> 0x0301 }
            java.io.InputStream r9 = r1.openInputStream(r8)     // Catch:{ IOException -> 0x0301 }
            X.1ub r2 = X.C40691uX.A04(r9)     // Catch:{ all -> 0x02fa }
            if (r2 == 0) goto L_0x02ef
            byte[] r1 = r2.A02     // Catch:{ all -> 0x02fa }
            byte[] r6 = X.C40691uX.A0G(r1)     // Catch:{ all -> 0x02fa }
            java.lang.String r3 = r2.A00     // Catch:{ all -> 0x02fa }
            byte[] r1 = r2.A04     // Catch:{ all -> 0x02fa }
            X.1uc r2 = new X.1uc     // Catch:{ all -> 0x02fa }
            r2.<init>(r3, r1, r6)     // Catch:{ all -> 0x02fa }
            if (r9 == 0) goto L_0x02c3
            r9.close()     // Catch:{ IOException -> 0x0301 }
        L_0x02c3:
            X.0xF r1 = r12.A01     // Catch:{ IOException -> 0x0301 }
            java.util.HashMap r1 = r1.A00     // Catch:{ IOException -> 0x0301 }
            r1.clear()     // Catch:{ IOException -> 0x0301 }
            java.lang.String r1 = "backupencryption/getKeysForCrypt14Backups/v="
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r1)     // Catch:{ IOException -> 0x0301 }
            java.lang.String r10 = r2.A00     // Catch:{ IOException -> 0x0301 }
            java.lang.String r1 = X.AnonymousClass000.A0h(r10, r1)     // Catch:{ IOException -> 0x0301 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ IOException -> 0x0301 }
            byte[] r9 = r2.A02     // Catch:{ IOException -> 0x0301 }
            java.util.Arrays.toString(r9)     // Catch:{ IOException -> 0x0301 }
            byte[] r6 = r2.A01     // Catch:{ IOException -> 0x0301 }
            java.util.Arrays.toString(r6)     // Catch:{ IOException -> 0x0301 }
            X.0xH r3 = r12.A00     // Catch:{ IOException -> 0x0301 }
            r2 = 5
            com.facebook.redex.RunnableRunnableShape6S0200000_I0_4 r1 = new com.facebook.redex.RunnableRunnableShape6S0200000_I0_4     // Catch:{ IOException -> 0x0301 }
            r1.<init>(r12, r2, r11)     // Catch:{ IOException -> 0x0301 }
            r3.A00(r1, r10, r9, r6)     // Catch:{ IOException -> 0x0301 }
            goto L_0x030c
        L_0x02ef:
            java.lang.String r1 = "backupencryption/getKeyGenParamsCrypt14/no-cipher/skip"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x02fa }
            if (r9 == 0) goto L_0x030c
            r9.close()     // Catch:{ IOException -> 0x0301 }
            goto L_0x030c
        L_0x02fa:
            r1 = move-exception
            if (r9 == 0) goto L_0x0300
            r9.close()     // Catch:{ all -> 0x0300 }
        L_0x0300:
            throw r1     // Catch:{ IOException -> 0x0301 }
        L_0x0301:
            r2 = move-exception
            java.lang.String r1 = "getKeyForEncryptedBackupWithFuture/failed"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x037a }
            java.lang.Boolean r1 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x037a }
            r4.A02(r1)     // Catch:{ all -> 0x037a }
        L_0x030c:
            r2 = 32000(0x7d00, double:1.581E-319)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ all -> 0x037a }
            r4.get(r2, r1)     // Catch:{ all -> 0x037a }
            monitor-exit(r7)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x037d }
            X.1KL r1 = r5.A00     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x037d }
            X.3vx r6 = r1.A00     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x037d }
            java.util.Iterator r5 = X.C16590tJ.A00(r6)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x037d }
        L_0x031c:
            boolean r1 = r5.hasNext()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x037d }
            if (r1 == 0) goto L_0x0337
            java.lang.Object r4 = r5.next()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x037d }
            X.2ij r4 = (X.C55052ij) r4     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x037d }
            com.obwhatsapp.backup.google.RestoreFromBackupActivity r1 = r4.A00     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x037d }
            X.0pt r3 = r1.A05     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x037d }
            r2 = 25
            com.facebook.redex.RunnableRunnableShape3S0100000_I0_2 r1 = new com.facebook.redex.RunnableRunnableShape3S0100000_I0_2     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x037d }
            r1.<init>(r4, r2)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x037d }
            r3.A0K(r1)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x037d }
            goto L_0x031c
        L_0x0337:
            boolean r1 = r7.A00(r8)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x037d }
            if (r1 == 0) goto L_0x0361
            java.lang.String r1 = "backup-import/import-end/success/"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x037d }
            java.util.Iterator r5 = X.C16590tJ.A00(r6)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x037d }
        L_0x0346:
            boolean r1 = r5.hasNext()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x037d }
            if (r1 == 0) goto L_0x0383
            java.lang.Object r4 = r5.next()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x037d }
            X.2ij r4 = (X.C55052ij) r4     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x037d }
            com.obwhatsapp.backup.google.RestoreFromBackupActivity r1 = r4.A00     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x037d }
            X.0pt r3 = r1.A05     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x037d }
            r2 = 24
            com.facebook.redex.RunnableRunnableShape3S0100000_I0_2 r1 = new com.facebook.redex.RunnableRunnableShape3S0100000_I0_2     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x037d }
            r1.<init>(r4, r2)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x037d }
            r3.A0K(r1)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x037d }
            goto L_0x0346
        L_0x0361:
            r2 = 26
            java.lang.String r1 = "backup-import/import-end/error/"
            java.lang.String r1 = X.C13680ns.A0c(r2, r1)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x037d }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x037d }
            java.util.Iterator r2 = X.C16590tJ.A00(r6)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x037d }
        L_0x0370:
            boolean r1 = r2.hasNext()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x037d }
            if (r1 == 0) goto L_0x0383
            r2.next()     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x037d }
            goto L_0x0370
        L_0x037a:
            r1 = move-exception
            monitor-exit(r7)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x037d }
            throw r1     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x037d }
        L_0x037d:
            r2 = move-exception
            java.lang.String r1 = "backup-export-manager/backup-import/"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x0392 }
        L_0x0383:
            java.lang.String r1 = "gdrive-service/handle-intent/backup-import-pending"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0392 }
        L_0x0388:
            X.0yo r1 = r0.A08
            r2 = 0
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.A0a
            r1.set(r2)
            goto L_0x179b
        L_0x0392:
            r5 = move-exception
            X.0yo r0 = r0.A08
            r1 = 0
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0a
            r0.set(r1)
            throw r5
        L_0x039c:
            X.0yo r1 = r0.A08
            boolean r1 = r1.A0A()
            r3 = 0
            if (r1 != 0) goto L_0x03ae
            X.0yo r1 = r0.A08
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.A0j
            r1.set(r3)
            goto L_0x1799
        L_0x03ae:
            X.0yo r2 = r0.A08
            java.lang.String r1 = android.os.Environment.getExternalStorageState()
            r2.A09(r1)
            X.0yo r1 = r0.A08
            r1.A05()
            X.0yo r1 = r0.A08
            r1.A07()
            java.lang.String r1 = "backup_mode"
            java.lang.String r2 = r9.getStringExtra(r1)
            java.lang.String r1 = "user_initiated"
            boolean r10 = r1.equals(r2)
            X.0rz r1 = r0.A0K
            if (r10 == 0) goto L_0x03df
            android.content.SharedPreferences$Editor r2 = r1.A0K()
            java.lang.String r1 = "gdrive_user_initiated_backup"
            X.C13680ns.A0z(r2, r1, r4)
        L_0x03db:
            X.12Q r1 = r0.A0C
            monitor-enter(r1)
            goto L_0x03ea
        L_0x03df:
            android.content.SharedPreferences r2 = X.C13680ns.A0B(r1)
            java.lang.String r1 = "gdrive_user_initiated_backup"
            boolean r10 = r2.getBoolean(r1, r3)
            goto L_0x03db
        L_0x03ea:
            r1.A0C = r10     // Catch:{ all -> 0x03ee }
            goto L_0x04c3
        L_0x03ee:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x03f1:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x03f1 }
            throw r0
        L_0x03f4:
            java.lang.String r1 = "gdrive-service/handle-intent action is "
            java.lang.String r1 = X.C13680ns.A0h(r1, r5)
            com.whatsapp.util.Log.i((java.lang.String) r1)
            int r1 = r5.hashCode()
            switch(r1) {
                case -1755890518: goto L_0x0500;
                case -818191995: goto L_0x0518;
                case 1035381739: goto L_0x0538;
                case 1096596436: goto L_0x0419;
                case 1122735421: goto L_0x0577;
                case 1461510777: goto L_0x0590;
                case 1583504647: goto L_0x0409;
                case 1996912751: goto L_0x05a9;
                default: goto L_0x0404;
            }
        L_0x0404:
            com.whatsapp.util.Log.e((java.lang.String) r11)
            goto L_0x1799
        L_0x0409:
            java.lang.String r1 = "action_list"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0404
            X.12U r1 = r0.A09
            X.2GM r5 = r1.A01(r2, r7)
            goto L_0x05c3
        L_0x0419:
            if (r8 == 0) goto L_0x0404
            java.lang.String r8 = "success"
            java.lang.String r11 = "failed"
            java.lang.String r6 = "gdrive-service/handle-intent"
            java.util.concurrent.atomic.AtomicBoolean r5 = r0.A0f
            boolean r1 = r5.getAndSet(r4)
            if (r1 == 0) goto L_0x042e
            java.lang.String r1 = "gdrive-service/handle-intent another deletion is already running."
            goto L_0x1788
        L_0x042e:
            java.lang.String r1 = "jid_user"
            java.lang.String r10 = r9.getStringExtra(r1)     // Catch:{ 3ia -> 0x04b1, 3iO -> 0x04a4, 3iS -> 0x0497, 3iQ -> 0x048a, all -> 0x0654 }
            if (r10 != 0) goto L_0x043d
            java.lang.String r1 = "gdrive-service/handle-intent DELETE called with no number."
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 3ia -> 0x04b1, 3iO -> 0x04a4, 3iS -> 0x0497, 3iQ -> 0x048a, all -> 0x0654 }
            goto L_0x04be
        L_0x043d:
            X.12U r1 = r0.A09     // Catch:{ 3ia -> 0x04b1, 3iO -> 0x04a4, 3iS -> 0x0497, 3iQ -> 0x048a, all -> 0x0654 }
            X.2GM r9 = r1.A01(r2, r7)     // Catch:{ 3ia -> 0x04b1, 3iO -> 0x04a4, 3iS -> 0x0497, 3iQ -> 0x048a, all -> 0x0654 }
            X.0yo r1 = r0.A08     // Catch:{ 3ia -> 0x04b1, 3iO -> 0x04a4, 3iS -> 0x0497, 3iQ -> 0x048a, all -> 0x0654 }
            X.2GJ r1 = r1.A0M     // Catch:{ 3ia -> 0x04b1, 3iO -> 0x04a4, 3iS -> 0x0497, 3iQ -> 0x048a, all -> 0x0654 }
            boolean r1 = X.C62173By.A06(r1, r9)     // Catch:{ 3ia -> 0x04b1, 3iO -> 0x04a4, 3iS -> 0x0497, 3iQ -> 0x048a, all -> 0x0654 }
            r4 = 0
            if (r1 != 0) goto L_0x0454
            java.lang.String r1 = "gdrive-service/delete-backup/failed-to-fetch-auth-token"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 3ia -> 0x04b1, 3iO -> 0x04a4, 3iS -> 0x0497, 3iQ -> 0x048a, all -> 0x0654 }
            goto L_0x046e
        L_0x0454:
            X.0yo r1 = r0.A08     // Catch:{ 3ia -> 0x04b1, 3iO -> 0x04a4, 3iS -> 0x0497, 3iQ -> 0x048a, all -> 0x0654 }
            X.2GJ r7 = r1.A0M     // Catch:{ 3ia -> 0x04b1, 3iO -> 0x04a4, 3iS -> 0x0497, 3iQ -> 0x048a, all -> 0x0654 }
            X.2xL r2 = new X.2xL     // Catch:{ 3ia -> 0x04b1, 3iO -> 0x04a4, 3iS -> 0x0497, 3iQ -> 0x048a, all -> 0x0654 }
            r2.<init>(r0, r9, r10)     // Catch:{ 3ia -> 0x04b1, 3iO -> 0x04a4, 3iS -> 0x0497, 3iQ -> 0x048a, all -> 0x0654 }
            java.lang.String r1 = "gdrive-service/delete-backup"
            java.lang.Object r1 = X.AnonymousClass2GS.A00(r2, r7, r1)     // Catch:{ 3ia -> 0x04b1, 3iO -> 0x04a4, 3iS -> 0x0497, 3iQ -> 0x048a, all -> 0x0654 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ 3ia -> 0x04b1, 3iO -> 0x04a4, 3iS -> 0x0497, 3iQ -> 0x048a, all -> 0x0654 }
            if (r1 == 0) goto L_0x046e
            boolean r1 = r1.booleanValue()     // Catch:{ 3ia -> 0x04b1, 3iO -> 0x04a4, 3iS -> 0x0497, 3iQ -> 0x048a, all -> 0x0654 }
            if (r1 == 0) goto L_0x046e
            r4 = 1
        L_0x046e:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()     // Catch:{ 3ia -> 0x0488, 3iO -> 0x0486, 3iS -> 0x0484, 3iQ -> 0x0482 }
            java.lang.String r1 = "gdrive-service/handle-intent/delete-all-files/"
            r2.append(r1)     // Catch:{ 3ia -> 0x0488, 3iO -> 0x0486, 3iS -> 0x0484, 3iQ -> 0x0482 }
            if (r4 != 0) goto L_0x047a
            r8 = r11
        L_0x047a:
            java.lang.String r1 = X.AnonymousClass000.A0h(r8, r2)     // Catch:{ 3ia -> 0x0488, 3iO -> 0x0486, 3iS -> 0x0484, 3iQ -> 0x0482 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 3ia -> 0x0488, 3iO -> 0x0486, 3iS -> 0x0484, 3iQ -> 0x0482 }
            goto L_0x04bf
        L_0x0482:
            r7 = move-exception
            goto L_0x048c
        L_0x0484:
            r7 = move-exception
            goto L_0x0499
        L_0x0486:
            r7 = move-exception
            goto L_0x04a6
        L_0x0488:
            r7 = move-exception
            goto L_0x04b3
        L_0x048a:
            r7 = move-exception
            r4 = 0
        L_0x048c:
            X.12U r2 = r0.A09     // Catch:{ all -> 0x0652 }
            r1 = 25
            r2.A05(r1)     // Catch:{ all -> 0x0652 }
            com.whatsapp.util.Log.e(r6, r7)     // Catch:{ all -> 0x0652 }
            goto L_0x04bf
        L_0x0497:
            r7 = move-exception
            r4 = 0
        L_0x0499:
            X.12U r2 = r0.A09     // Catch:{ all -> 0x0652 }
            r1 = 19
            r2.A05(r1)     // Catch:{ all -> 0x0652 }
            com.whatsapp.util.Log.e(r6, r7)     // Catch:{ all -> 0x0652 }
            goto L_0x04bf
        L_0x04a4:
            r7 = move-exception
            r4 = 0
        L_0x04a6:
            X.12U r2 = r0.A09     // Catch:{ all -> 0x0652 }
            r1 = 11
            r2.A05(r1)     // Catch:{ all -> 0x0652 }
            com.whatsapp.util.Log.e(r6, r7)     // Catch:{ all -> 0x0652 }
            goto L_0x04bf
        L_0x04b1:
            r7 = move-exception
            r4 = 0
        L_0x04b3:
            X.12U r2 = r0.A09     // Catch:{ all -> 0x0652 }
            r1 = 12
            r2.A05(r1)     // Catch:{ all -> 0x0652 }
            com.whatsapp.util.Log.e(r6, r7)     // Catch:{ all -> 0x0652 }
            goto L_0x04bf
        L_0x04be:
            r4 = 0
        L_0x04bf:
            r5.set(r3)
            goto L_0x04df
        L_0x04c3:
            monitor-exit(r1)
            java.lang.String r1 = "action_delete"
            boolean r8 = r5.equals(r1)
            java.lang.String r6 = "account_name"
            if (r8 == 0) goto L_0x04f9
            java.lang.String r2 = r9.getStringExtra(r6)
        L_0x04d2:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 == 0) goto L_0x03f4
            if (r8 == 0) goto L_0x061e
            java.lang.String r1 = "gdrive-service/handle-intent accountName is null or empty => user has never configured Google Drive backup and is now deleting WhatsApp account, nothing to delete."
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x04df:
            X.12M r1 = r0.A0A
            java.lang.Iterable r1 = r1.A01()
            java.util.Iterator r2 = r1.iterator()
        L_0x04e9:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x179b
            java.lang.Object r1 = r2.next()
            X.12R r1 = (X.AnonymousClass12R) r1
            r1.ALz(r4)
            goto L_0x04e9
        L_0x04f9:
            X.0rz r1 = r0.A0K
            java.lang.String r2 = r1.A0M()
            goto L_0x04d2
        L_0x0500:
            java.lang.String r1 = "action_restore_media"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0404
            X.0rz r1 = r0.A0K
            java.lang.String r35 = r1.A0P()
            boolean r1 = android.text.TextUtils.isEmpty(r35)
            if (r1 == 0) goto L_0x0674
            java.lang.String r1 = "restore>google-service/restore-messages jidUser is null"
            goto L_0x052f
        L_0x0518:
            java.lang.String r1 = "action_restore"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0404
            X.0rz r1 = r0.A0K
            java.lang.String r31 = r1.A0P()
            boolean r1 = android.text.TextUtils.isEmpty(r31)
            if (r1 == 0) goto L_0x0d74
            java.lang.String r1 = "restore>google-service/restore-messages jid is null"
        L_0x052f:
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.12U r2 = r0.A09
            r1 = 18
            goto L_0x13a1
        L_0x0538:
            java.lang.String r1 = "action_backup"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0404
            java.lang.String r1 = "only_if_pending"
            boolean r9 = r9.getBooleanExtra(r1, r3)
            java.lang.String r1 = "gdrive-service/handle-intent/backup"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            long r7 = java.lang.System.currentTimeMillis()
            X.0rz r1 = r0.A0K
            long r5 = r1.A0H(r2)
            long r7 = r7 - r5
            r5 = 3600000(0x36ee80, double:1.7786363E-317)
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            boolean r5 = X.AnonymousClass000.A1Q(r1)
            if (r9 == 0) goto L_0x0569
            X.0rz r1 = r0.A0K
            boolean r1 = X.AnonymousClass2GK.A0G(r1)
            if (r1 == 0) goto L_0x152f
        L_0x0569:
            if (r10 != 0) goto L_0x056d
            if (r5 == 0) goto L_0x152f
        L_0x056d:
            X.0xa r1 = r0.A0U
            boolean r1 = r1.A00
            if (r1 == 0) goto L_0x1390
            java.lang.String r1 = "gdrive-service/handle-intent/backup WhatsApp Login has failed, google drive backup aborted"
            goto L_0x1788
        L_0x0577:
            java.lang.String r1 = "action_fetch_backup_info"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0404
            android.os.Bundle r1 = r9.getExtras()
            X.AnonymousClass00B.A06(r1)
            java.lang.String r4 = r1.getString(r6)
            if (r4 != 0) goto L_0x1533
            java.lang.String r1 = "gdrive-service/handle-intent/ action action_fetch_backup_info called without account_name"
            goto L_0x1788
        L_0x0590:
            java.lang.String r1 = "action_remove_backup_info"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0404
            android.os.Bundle r1 = r9.getExtras()
            X.AnonymousClass00B.A06(r1)
            java.lang.String r3 = r1.getString(r6)
            if (r3 != 0) goto L_0x1645
            java.lang.String r1 = "gdrive-service/handle-intent/ action action_remove_backup_info called without account_name"
            goto L_0x1788
        L_0x05a9:
            java.lang.String r1 = "action_change_number"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x0404
            java.lang.String r1 = "old_phone_number"
            java.lang.String r5 = r9.getStringExtra(r1)
            java.lang.String r1 = "new_phone_number"
            java.lang.String r6 = r9.getStringExtra(r1)
            if (r5 != 0) goto L_0x16af
            java.lang.String r1 = "gdrive-service/handle-intent change number requested but old phone number was not passed in the request."
            goto L_0x1788
        L_0x05c3:
            boolean r1 = r5.A0A()     // Catch:{ 1da | 3iM | 3iO | 3iQ | 3ia -> 0x163d }
            if (r1 != 0) goto L_0x05d0
            java.lang.String r1 = "gdrive-service/v2/list-files failed to make auth"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 1da | 3iM | 3iO | 3iQ | 3ia -> 0x163d }
            goto L_0x179b
        L_0x05d0:
            java.lang.String r3 = r0.A01()     // Catch:{ 1da | 3iM | 3iO | 3iQ | 3ia -> 0x163d }
            if (r3 != 0) goto L_0x05dd
            java.lang.String r1 = "gdrive-service/v2/list-files no jid"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 1da | 3iM | 3iO | 3iQ | 3ia -> 0x163d }
            goto L_0x179b
        L_0x05dd:
            X.3BK r4 = r5.A04(r3)     // Catch:{ 1da | 3iM | 3iO | 3iQ | 3ia -> 0x163d }
            if (r4 != 0) goto L_0x05f5
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()     // Catch:{ 1da | 3iM | 3iO | 3iQ | 3ia -> 0x163d }
            java.lang.String r1 = "gdrive-service/v2/list-files no backup for "
            r2.append(r1)     // Catch:{ 1da | 3iM | 3iO | 3iQ | 3ia -> 0x163d }
            java.lang.String r1 = X.AnonymousClass000.A0h(r3, r2)     // Catch:{ 1da | 3iM | 3iO | 3iQ | 3ia -> 0x163d }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 1da | 3iM | 3iO | 3iQ | 3ia -> 0x163d }
            goto L_0x179b
        L_0x05f5:
            r3 = r7
        L_0x05f6:
            java.lang.String r2 = r4.A0A     // Catch:{ 1da | 3iM | 3iO | 3iQ | 3ia -> 0x163d }
            r1 = 1000(0x3e8, float:1.401E-42)
            android.util.Pair r1 = r5.A03(r2, r3, r7, r1)     // Catch:{ 1da | 3iM | 3iO | 3iQ | 3ia -> 0x163d }
            if (r1 == 0) goto L_0x179b
            java.lang.Object r3 = r1.second     // Catch:{ 1da | 3iM | 3iO | 3iQ | 3ia -> 0x163d }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ 1da | 3iM | 3iO | 3iQ | 3ia -> 0x163d }
            java.lang.Object r1 = r1.first     // Catch:{ 1da | 3iM | 3iO | 3iQ | 3ia -> 0x163d }
            java.util.List r1 = (java.util.List) r1     // Catch:{ 1da | 3iM | 3iO | 3iQ | 3ia -> 0x163d }
            java.util.Iterator r2 = r1.iterator()     // Catch:{ 1da | 3iM | 3iO | 3iQ | 3ia -> 0x163d }
        L_0x060c:
            boolean r1 = r2.hasNext()     // Catch:{ 1da | 3iM | 3iO | 3iQ | 3ia -> 0x163d }
            if (r1 == 0) goto L_0x0616
            r2.next()     // Catch:{ 1da | 3iM | 3iO | 3iQ | 3ia -> 0x163d }
            goto L_0x060c
        L_0x0616:
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch:{ 1da | 3iM | 3iO | 3iQ | 3ia -> 0x163d }
            if (r1 == 0) goto L_0x05f6
            goto L_0x179b
        L_0x061e:
            X.0rz r1 = r0.A0K
            int r4 = r1.A09()
            java.lang.String r1 = "gdrive-service/handle-intent "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0q(r1)
            if (r4 == 0) goto L_0x177f
            r2.append(r9)
            java.lang.String r1 = " accountName is null or empty, cannot proceed further also, change google drive state from "
            r2.append(r1)
            X.0rz r1 = r0.A0K
            int r1 = r1.A09()
            r2.append(r1)
            java.lang.String r1 = " to clean_state"
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r2)
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.0rz r1 = r0.A0K
            r1.A0j(r3)
            X.12Q r1 = r0.A0C
            r1.A03()
            goto L_0x179b
        L_0x0652:
            r2 = move-exception
            goto L_0x0656
        L_0x0654:
            r2 = move-exception
            r4 = 0
        L_0x0656:
            r5.set(r3)
            X.12M r0 = r0.A0A
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0663:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0673
            java.lang.Object r0 = r1.next()
            X.12R r0 = (X.AnonymousClass12R) r0
            r0.ALz(r4)
            goto L_0x0663
        L_0x0673:
            throw r2
        L_0x0674:
            X.0pd r1 = r0.A0Q
            r30 = r1
            X.0so r1 = r0.A01
            r18 = r1
            X.0sb r1 = r0.A02
            r19 = r1
            X.0t9 r1 = r0.A0R
            r31 = r1
            X.0sc r1 = r0.A0F
            r26 = r1
            X.12U r4 = r0.A09
            java.lang.String r1 = "restore"
            X.2GM r25 = r4.A01(r2, r1)
            X.0xO r1 = r0.A0S
            r33 = r1
            X.0sd r15 = r0.A05
            X.0t8 r14 = r0.A0L
            X.1Ti r13 = r0.A0V
            X.12U r12 = r0.A09
            X.0sj r11 = r0.A0J
            X.0rz r10 = r0.A0K
            X.0yo r9 = r0.A08
            X.12M r8 = r0.A0A
            java.lang.Object r1 = r12.A0O
            monitor-enter(r1)
            X.2GU r5 = new X.2GU     // Catch:{ all -> 0x0d71 }
            r5.<init>()     // Catch:{ all -> 0x0d71 }
            r12.A02 = r5     // Catch:{ all -> 0x0d71 }
            monitor-exit(r1)     // Catch:{ all -> 0x0d71 }
            X.12N r1 = r0.A0B
            java.util.concurrent.atomic.AtomicLong r4 = r1.A05
            java.util.concurrent.atomic.AtomicLong r2 = r1.A04
            X.12U r1 = r0.A09
            X.2GJ r1 = r1.A0C
            X.38R r6 = new X.38R
            r16 = r6
            r17 = r0
            r20 = r15
            r21 = r9
            r22 = r12
            r23 = r8
            r24 = r1
            r27 = r11
            r28 = r10
            r29 = r14
            r32 = r5
            r34 = r13
            r36 = r4
            r37 = r2
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            java.util.Map r1 = r0.A0Y
            r29 = r1
            X.0rz r1 = r6.A0B
            r49 = r1
            boolean r1 = X.AnonymousClass2GK.A0H(r49)
            if (r1 != 0) goto L_0x06ec
            java.lang.String r1 = "restore>MediaRestoreAction/restore media called but media restore is not pending, request ignored."
            goto L_0x1771
        L_0x06ec:
            X.0yo r1 = r6.A04
            r48 = r1
            r15 = 1
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.A0e
            r47 = r1
            boolean r1 = r1.getAndSet(r15)
            if (r1 == 0) goto L_0x06ff
            java.lang.String r1 = "restore>MediaRestoreAction/media restore is already running, request ignored."
            goto L_0x1788
        L_0x06ff:
            int r1 = r49.A08()
            r2 = 10
            if (r1 == r2) goto L_0x070c
            X.12U r1 = r6.A05
            r1.A05(r2)
        L_0x070c:
            X.1Ti r1 = r6.A0H
            r1.A02()
            X.12M r1 = r6.A06
            r46 = r1
            r1.A01 = r3
            java.util.Iterator r2 = X.C16590tJ.A00(r46)
        L_0x071b:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x072b
            java.lang.Object r1 = r2.next()
            X.12R r1 = (X.AnonymousClass12R) r1
            r1.ATY()
            goto L_0x071b
        L_0x072b:
            X.2GU r1 = r6.A0F
            r45 = r1
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            r1.A01 = r2
            java.lang.String r27 = "gdrive_restore_start_timestamp"
            r2 = r49
            r1 = r27
            long r8 = r2.A0J(r1)     // Catch:{ all -> 0x0d63 }
            r1 = 0
            int r4 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r4 > 0) goto L_0x074a
            r5 = r49
            r4 = r27
            r5.A0x(r4)     // Catch:{ all -> 0x0d63 }
        L_0x074a:
            X.2GM r5 = r6.A08     // Catch:{ all -> 0x0d63 }
            X.59I r4 = r5.A07     // Catch:{ all -> 0x0d63 }
            r44 = r4
            r4.A00 = r3     // Catch:{ all -> 0x0d63 }
            java.util.concurrent.atomic.AtomicInteger r4 = r5.A0I     // Catch:{ all -> 0x0d63 }
            r43 = r4
            r4.set(r3)     // Catch:{ all -> 0x0d63 }
            r8 = 2
            r4 = r49
            r4.A0j(r8)     // Catch:{ all -> 0x0d63 }
            java.lang.String r4 = "restore>MediaRestoreAction/stage: authenticating with google servers"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            X.2GJ r4 = r6.A07     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r40 = r4
            boolean r4 = X.C62173By.A06(r4, r5)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r4 != 0) goto L_0x0777
            X.12U r2 = r6.A05     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r1 = 11
        L_0x0772:
            r2.A05(r1)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            goto L_0x0d55
        L_0x0777:
            java.lang.String r4 = "restore>MediaRestoreAction/stage: requesting backup"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.String r4 = r6.A0I     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.String r9 = "gdrive/restore-media"
            X.3iA r8 = new X.3iA     // Catch:{ 3iM -> 0x0792 }
            r8.<init>(r5, r4)     // Catch:{ 3iM -> 0x0792 }
            r4 = r40
            java.lang.Object r19 = X.AnonymousClass2GS.A00(r8, r4, r9)     // Catch:{ 3iM -> 0x0792 }
            r4 = r19
            X.3BK r4 = (X.AnonymousClass3BK) r4     // Catch:{ 3iM -> 0x0792 }
            r19 = r4
            goto L_0x0794
        L_0x0792:
            r19 = 0
        L_0x0794:
            r16 = 1
            if (r19 == 0) goto L_0x07ca
            if (r29 == 0) goto L_0x07a0
            boolean r4 = r29.isEmpty()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r4 == 0) goto L_0x07d1
        L_0x07a0:
            r4 = r19
            org.json.JSONObject r5 = r4.A0B     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r5 == 0) goto L_0x07b1
            java.lang.String r4 = "encryptedBackupEnabled"
            boolean r4 = r5.optBoolean(r4, r3)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r4 == 0) goto L_0x07b1
            r4 = 1
            goto L_0x07b3
        L_0x07b1:
            r4 = 0
        L_0x07b3:
            java.lang.Long r5 = java.lang.Long.valueOf(r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r4 = r45
            r4.A0A = r5     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.String r4 = "restore>MediaRestoreAction/stage: loading files from backup"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r4 = r48
            X.2GJ r5 = r4.A0M     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r4 = r19
            java.util.Map r29 = X.C62173By.A01(r5, r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
        L_0x07ca:
            if (r29 != 0) goto L_0x07d1
            X.12U r2 = r6.A05     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r1 = 14
            goto L_0x0772
        L_0x07d1:
            X.0sd r5 = r6.A03     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.util.Collection r4 = r29.values()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            X.C62173By.A04(r5, r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            boolean r39 = r49.A1X()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.util.HashSet r28 = X.C13680ns.A0o()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            X.0sb r4 = r6.A02     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            X.1jH r4 = r4.A05()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.io.File r4 = r4.A0A     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            X.C16180sb.A04(r4, r3)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.String r5 = r4.getName()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r4 = r28
            r4.add(r5)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r4 = r48
            int r5 = r4.A00     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r4 = 2
            if (r5 != r4) goto L_0x0808
            X.AnonymousClass00B.A06(r45)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.Long r5 = java.lang.Long.valueOf(r1)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r4 = r45
            r4.A0B = r5     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
        L_0x0808:
            java.lang.String r26 = ","
            r5 = r26
            r4 = r28
            android.text.TextUtils.join(r5, r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.String r4 = "restore>MediaRestoreAction/stage: collect files to download from the backup"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.util.ArrayList r4 = X.AnonymousClass000.A0u()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.util.List r25 = java.util.Collections.synchronizedList(r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.String r5 = "restore>MediaRestoreAction/get-files-to-be-downloaded"
            X.1Zf r24 = new X.1Zf     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r4 = r24
            r4.<init>((java.lang.String) r5)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            X.0sj r4 = r6.A0A     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            boolean r4 = r4.A0E()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r4 != 0) goto L_0x0cdd
            java.util.concurrent.atomic.AtomicReference r23 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r4 = r23
            r4.<init>(r7)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.util.Set r8 = r29.keySet()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.util.concurrent.atomic.AtomicBoolean r22 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r4 = r22
            r4.<init>(r15)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            int r5 = r8.size()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.util.concurrent.CountDownLatch r21 = new java.util.concurrent.CountDownLatch     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r4 = r21
            r4.<init>(r5)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            int r20 = r8.size()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.util.Iterator r18 = r8.iterator()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r13 = 0
        L_0x0855:
            boolean r4 = r18.hasNext()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r4 == 0) goto L_0x0938
            java.lang.String r12 = X.AnonymousClass000.A0m(r18)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            int r4 = r13 % 100
            if (r4 != 0) goto L_0x0879
            java.lang.String r4 = "restore>MediaRestoreAction/get-files-to-be-downloaded "
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0r(r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r5.append(r13)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.String r4 = "/"
            r5.append(r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r4 = r20
            r5.append(r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            X.C13680ns.A1V(r5)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
        L_0x0879:
            int r13 = r13 + 1
            boolean r4 = r40.A05()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r4 == 0) goto L_0x0b6e
            java.lang.Object r4 = r23.get()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            X.1db r4 = (X.C31151db) r4     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r4 == 0) goto L_0x0893
            boolean r1 = r4 instanceof X.C71153iZ     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r1 != 0) goto L_0x0ce2
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r1.<init>(r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
        L_0x0892:
            throw r1     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
        L_0x0893:
            long r10 = (long) r13     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r4 = r20
            long r8 = (long) r4     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r4 = r46
            int r14 = r4.A01     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            int r4 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x08a4
            r4 = 100
            long r4 = r4 * r10
            long r4 = r4 / r8
            int r14 = (int) r4     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
        L_0x08a4:
            r4 = r46
            int r4 = r4.A01     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r14 == r4) goto L_0x08da
            java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            X.C13690nt.A1Q(r4, r3, r10)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            X.C13690nt.A1Q(r4, r15, r8)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r8 = 2
            X.AnonymousClass000.A1M(r4, r14, r8)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.String r8 = "restore>GoogleBackupRestoreObservable/media-restore-preparation-progress %d/%d (%d%%)"
            X.C13700nu.A0Z(r8, r5, r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r4 = r46
            r4.A01 = r14     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.util.Iterator r8 = X.C16590tJ.A00(r46)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
        L_0x08c6:
            boolean r4 = r8.hasNext()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r4 == 0) goto L_0x08da
            java.lang.Object r5 = r8.next()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            X.12R r5 = (X.AnonymousClass12R) r5     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r4 = r46
            int r4 = r4.A01     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r5.ATX(r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            goto L_0x08c6
        L_0x08da:
            r4 = r29
            java.lang.Object r8 = r4.get(r12)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            X.3Ad r8 = (X.C61743Ad) r8     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            X.0so r9 = r6.A01     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            X.0sc r5 = r6.A09     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            android.content.Context r4 = r6.A00     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.String r4 = X.AnonymousClass2GK.A06(r4, r9, r5, r12)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r4 != 0) goto L_0x08fc
            java.lang.String r4 = "restore>MediaRestoreAction/get-files-to-be-downloaded/skipping-null-download-path relative path: "
            java.lang.String r4 = X.C13680ns.A0h(r4, r12)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            com.whatsapp.util.Log.e((java.lang.String) r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
        L_0x08f7:
            r21.countDown()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            goto L_0x0855
        L_0x08fc:
            java.io.File r33 = X.C13700nu.A0D(r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.util.Iterator r5 = r28.iterator()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
        L_0x0904:
            boolean r4 = r5.hasNext()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r4 == 0) goto L_0x0930
            java.lang.String r4 = X.AnonymousClass000.A0m(r5)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            boolean r4 = r12.startsWith(r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r4 == 0) goto L_0x0904
            X.3IB r4 = new X.3IB     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r30 = r4
            r31 = r6
            r32 = r8
            r34 = r12
            r35 = r25
            r36 = r21
            r37 = r22
            r38 = r23
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.util.concurrent.ThreadPoolExecutor r5 = X.AnonymousClass4Az.A02     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r5.execute(r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            goto L_0x0855
        L_0x0930:
            r5 = r26
            r4 = r28
            android.text.TextUtils.join(r5, r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            goto L_0x08f7
        L_0x0938:
            java.lang.Object r4 = r23.get()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            X.1db r4 = (X.C31151db) r4     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r4 == 0) goto L_0x094b
            boolean r1 = r4 instanceof X.C71153iZ     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r1 != 0) goto L_0x0ce2
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r1.<init>(r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            goto L_0x0892
        L_0x094b:
            java.lang.String r4 = "restore>MediaRestoreAction/get-files-to-be-downloaded waiting for all files to be processed."
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ InterruptedException -> 0x0b6a }
            r21.await()     // Catch:{ InterruptedException -> 0x0b6a }
            boolean r4 = r22.get()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r4 == 0) goto L_0x0b6e
            java.lang.String r4 = "restore>MediaRestoreAction/restore-files/num-files-to-be-downloaded/"
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0r(r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r4 = r25
            X.C13700nu.A0b(r5, r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            X.C13680ns.A1V(r5)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.util.concurrent.atomic.AtomicInteger r5 = r6.A0J     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            int r4 = r25.size()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            int r4 = r4 / 10
            r5.set(r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r24.A01()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            android.content.SharedPreferences r5 = X.C13680ns.A0B(r49)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.String r4 = "gdrive_already_downloaded_bytes"
            long r4 = r5.getLong(r4, r1)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.util.concurrent.atomic.AtomicLong r11 = r6.A0M     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r11.set(r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.util.Iterator r10 = r25.iterator()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
        L_0x0988:
            boolean r8 = r10.hasNext()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r8 == 0) goto L_0x09a2
            java.lang.Object r9 = r10.next()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r8 = r29
            java.lang.Object r8 = r8.get(r9)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            X.3Ad r8 = (X.C61743Ad) r8     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r8 == 0) goto L_0x0988
            long r8 = r8.A00     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r11.addAndGet(r8)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            goto L_0x0988
        L_0x09a2:
            X.57G r9 = new X.57G     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r9.<init>()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r8 = r25
            java.util.Collections.sort(r8, r9)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r8 = r48
            X.0u3 r9 = r8.A0V     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            X.01V r8 = r8.A0Q     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            int r9 = X.C42971z5.A01(r8, r9)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.String r8 = "GoogleBackupConditionsManager/calc-max-concurrent-reads/network_type="
            java.lang.StringBuilder r10 = X.AnonymousClass000.A0r(r8)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r8 = r48
            int r8 = r8.A00     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r10.append(r8)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.String r8 = ", year class = "
            r10.append(r8)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r10.append(r9)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            X.C13680ns.A1V(r10)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r8 = r48
            int r8 = r8.A00     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r10 = 4
            if (r8 != r15) goto L_0x09d9
            r8 = 2011(0x7db, float:2.818E-42)
            if (r9 >= r8) goto L_0x09de
        L_0x09d9:
            r8 = 2
            int r10 = java.lang.Math.min(r10, r8)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
        L_0x09de:
            int r8 = r25.size()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            double r8 = (double) r8     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.Double r9 = java.lang.Double.valueOf(r8)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r8 = r45
            r8.A03 = r9     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.Long r9 = X.C13690nt.A0W(r10)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r8.A0D = r9     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.util.ArrayList r34 = X.AnonymousClass000.A0u()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.util.concurrent.atomic.AtomicInteger r8 = new java.util.concurrent.atomic.AtomicInteger     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r8.<init>(r3)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.util.concurrent.atomic.AtomicLong r9 = r6.A0L     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r20 = r9
            r9.set(r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.util.concurrent.atomic.AtomicLong r14 = r6.A0K     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r14.set(r1)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            int r4 = r25.size()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.util.concurrent.CountDownLatch r5 = new java.util.concurrent.CountDownLatch     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r5.<init>(r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.util.concurrent.atomic.AtomicReference r4 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r4.<init>(r7)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.String r7 = "gdrive-util/max concurrent reads "
            java.lang.String r7 = X.C13680ns.A0c(r10, r7)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            com.whatsapp.util.Log.i((java.lang.String) r7)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.util.concurrent.TimeUnit r40 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.String r7 = "Google Drive Read Worker #"
            X.5Ca r41 = new X.5Ca     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r41.<init>()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            long r12 = (long) r15     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            X.58T r9 = new X.58T     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r9.<init>(r7)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.util.concurrent.ThreadPoolExecutor r7 = new java.util.concurrent.ThreadPoolExecutor     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r36 = 0
            r35 = r7
            r37 = r10
            r38 = r12
            r42 = r9
            r35.<init>(r36, r37, r38, r40, r41, r42)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            X.58M r9 = new X.58M     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r9.<init>()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r7.setRejectedExecutionHandler(r9)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.String r9 = "restore>MediaRestoreAction/stage: start downloading files from google"
            com.whatsapp.util.Log.i((java.lang.String) r9)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.util.Iterator r18 = r25.iterator()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r12 = 0
        L_0x0a4d:
            boolean r9 = r18.hasNext()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.String r10 = "/"
            if (r9 == 0) goto L_0x0aa6
            java.lang.String r13 = X.AnonymousClass000.A0m(r18)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            int r12 = r12 + 1
            int r9 = r12 % 100
            if (r9 != 0) goto L_0x0a7c
            java.lang.String r9 = "restore>MediaRestoreAction/restore-files enqueuing download  "
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0r(r9)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r9.append(r12)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r9.append(r10)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r10 = r25
            X.C13700nu.A0b(r9, r10)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.String r10 = ": "
            r9.append(r10)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.String r9 = X.AnonymousClass000.A0h(r13, r9)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            com.whatsapp.util.Log.i((java.lang.String) r9)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
        L_0x0a7c:
            r9 = r29
            java.lang.Object r10 = r9.get(r13)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            X.3Ad r10 = (X.C61743Ad) r10     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r10 == 0) goto L_0x0a9d
            r37 = 2
            com.facebook.redex.RunnableRunnableShape1S0600000_I1 r9 = new com.facebook.redex.RunnableRunnableShape1S0600000_I1     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r30 = r9
            r31 = r6
            r32 = r10
            r33 = r4
            r35 = r8
            r36 = r5
            r30.<init>(r31, r32, r33, r34, r35, r36, r37)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r7.execute(r9)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            goto L_0x0a4d
        L_0x0a9d:
            java.lang.String r9 = "restore>MediaRestoreAction/restore-files resId cannot be null, skipping."
            com.whatsapp.util.Log.e((java.lang.String) r9)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r5.countDown()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            goto L_0x0a4d
        L_0x0aa6:
            java.lang.String r7 = "restore>MediaRestoreAction/restore-files waiting for all files to be restored."
            com.whatsapp.util.Log.i((java.lang.String) r7)     // Catch:{ InterruptedException -> 0x0b65 }
            r5.await()     // Catch:{ InterruptedException -> 0x0b65 }
            java.lang.Object r4 = r4.get()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            X.1db r4 = (X.C31151db) r4     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r4 == 0) goto L_0x0ace
            boolean r5 = r4 instanceof X.C71043iO     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r5 != 0) goto L_0x0ce2
            boolean r5 = r4 instanceof X.C71163ia     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r5 != 0) goto L_0x0ce2
            boolean r5 = r4 instanceof X.C71103iU     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r5 != 0) goto L_0x0ce2
            boolean r5 = r4 instanceof X.C71083iS     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r5 != 0) goto L_0x0ce2
            boolean r5 = r4 instanceof X.C71063iQ     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r5 != 0) goto L_0x0ce2
            boolean r5 = r4 instanceof X.C71153iZ     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r5 != 0) goto L_0x0ce2
        L_0x0ace:
            int r4 = r34.size()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r4 <= 0) goto L_0x0b03
            java.lang.String r4 = "restore>MediaRestoreAction/restore-files/failed-files/"
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0r(r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            int r4 = r34.size()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r5.append(r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            X.C13680ns.A1V(r5)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            X.0so r7 = r6.A01     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0o()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            int r4 = r34.size()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r5.append(r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.String r4 = " files  out of total "
            r5.append(r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            int r4 = r25.size()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.String r5 = X.AnonymousClass000.A0l(r5, r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.String r4 = "gdrive/restore-media/failed to restore files"
            r7.AcB(r4, r5, r15)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
        L_0x0b03:
            java.lang.String r4 = "restore>MediaRestoreAction/restore-files waiting for restore to finish: "
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0r(r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            long r4 = r20.get()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r7.append(r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r7.append(r10)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            long r4 = r11.get()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r7.append(r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.String r4 = " ("
            r7.append(r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            long r4 = r14.get()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r7.append(r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.String r4 = " failed)"
            java.lang.String r4 = X.AnonymousClass000.A0h(r4, r7)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            long r7 = r20.get()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 > 0) goto L_0x0b3f
            long r7 = r14.get()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0b63
        L_0x0b3f:
            long r7 = r11.get()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            int r4 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r4 <= 0) goto L_0x0b63
            long r7 = r20.get()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            long r4 = r11.get()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.util.Iterator r10 = X.C16590tJ.A00(r46)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
        L_0x0b53:
            boolean r9 = r10.hasNext()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r9 == 0) goto L_0x0b63
            java.lang.Object r9 = r10.next()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            X.12R r9 = (X.AnonymousClass12R) r9     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r9.ATZ(r7, r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            goto L_0x0b53
        L_0x0b63:
            r9 = 1
            goto L_0x0b77
        L_0x0b65:
            r4 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            goto L_0x0b76
        L_0x0b6a:
            r4 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
        L_0x0b6e:
            java.lang.String r4 = "restore>MediaRestoreAction/restore-files failed to get list of files to be restored."
            com.whatsapp.util.Log.e((java.lang.String) r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r24.A01()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
        L_0x0b76:
            r9 = 0
        L_0x0b77:
            r4 = r49
            r4.A0j(r3)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0o()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.String r4 = "restore>MediaRestoreAction/stage: restoring files finished with "
            r5.append(r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r9 == 0) goto L_0x0b88
            goto L_0x0b8b
        L_0x0b88:
            java.lang.String r4 = "failure"
            goto L_0x0b8e
        L_0x0b8b:
            java.lang.String r4 = "success"
        L_0x0b8e:
            java.lang.String r4 = X.AnonymousClass000.A0h(r4, r5)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r9 == 0) goto L_0x0b98
            goto L_0x0ba0
        L_0x0b98:
            X.12U r5 = r6.A05     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r4 = 14
            r5.A05(r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            goto L_0x0ba8
        L_0x0ba0:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r15)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r4 = r45
            r4.A09 = r5     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
        L_0x0ba8:
            r4 = r48
            int r5 = r4.A00     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r5 != r15) goto L_0x0c06
            java.lang.Long r2 = java.lang.Long.valueOf(r16)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r1 = r45
            r1.A0B = r2     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
        L_0x0bb6:
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r2 = r49
            r1 = r27
            long r1 = r2.A0J(r1)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            long r4 = r4 - r1
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r1 = r45
            r1.A0C = r2     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.util.concurrent.atomic.AtomicLong r1 = r6.A0M     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            long r1 = r1.get()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            double r4 = (double) r1     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.Double r2 = java.lang.Double.valueOf(r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r1 = r45
            r1.A08 = r2     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.util.concurrent.atomic.AtomicLong r1 = r6.A0K     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            long r1 = r1.get()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            double r4 = (double) r1     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.Double r2 = java.lang.Double.valueOf(r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r1 = r45
            r1.A07 = r2     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.util.Locale r11 = java.util.Locale.ENGLISH     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.String r8 = "restore>MediaRestoreAction/total wall time for media + message restore: %.1f seconds."
            java.lang.Object[] r7 = new java.lang.Object[r15]     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.Long r1 = r1.A0C     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            long r4 = r1.longValue()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            double r1 = (double) r4     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r4 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r1 = r1 / r4
            java.lang.Double r1 = java.lang.Double.valueOf(r1)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r7[r3] = r1     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.String.format(r11, r8, r7)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            goto L_0x0c12
        L_0x0c06:
            r4 = 2
            if (r5 != r4) goto L_0x0bb6
            java.lang.Long r2 = java.lang.Long.valueOf(r1)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r1 = r45
            r1.A0B = r2     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            goto L_0x0bb6
        L_0x0c12:
            if (r19 == 0) goto L_0x0c91
            r1 = r19
            long r1 = r1.A04     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            double r7 = (double) r1     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.Double r2 = java.lang.Double.valueOf(r7)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r1 = r45
            r1.A06 = r2     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r1 = r19
            org.json.JSONObject r10 = r1.A0B     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r1 = -1
            if (r10 == 0) goto L_0x0c2f
            java.lang.String r4 = "chatdbSize"
            long r1 = r10.optLong(r4, r1)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
        L_0x0c2f:
            double r4 = (double) r1     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.Double r2 = java.lang.Double.valueOf(r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r1 = r45
            r1.A02 = r2     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r4 = -1
            if (r10 == 0) goto L_0x0c42
            java.lang.String r1 = "chatdbSize"
            long r4 = r10.optLong(r1, r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
        L_0x0c42:
            double r1 = (double) r4     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            double r7 = r7 - r1
            java.lang.Double r2 = java.lang.Double.valueOf(r7)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r1 = r45
            r1.A04 = r2     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r1 = r44
            int r4 = r1.A00     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            int r1 = r43.get()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            int r4 = r4 + r1
            double r1 = (double) r4     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.Double r2 = java.lang.Double.valueOf(r1)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r1 = r45
            r1.A05 = r2     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.String r2 = "includeVideosInBackup"
            if (r10 == 0) goto L_0x0c8f
            boolean r1 = r10.has(r2)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r1 == 0) goto L_0x0c84
            boolean r1 = r10.optBoolean(r2, r15)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
        L_0x0c6c:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r1 = r45
            r1.A00 = r2     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.String r1 = "restore>MediaRestoreAction/total-requests-in-restore-session/"
            r2.append(r1)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r2.append(r4)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            X.C13680ns.A1V(r2)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            goto L_0x0c91
        L_0x0c84:
            org.json.JSONObject r1 = r19.A04()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r1 == 0) goto L_0x0c8f
            boolean r1 = r1.optBoolean(r2, r15)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            goto L_0x0c6c
        L_0x0c8f:
            r1 = 1
            goto L_0x0c6c
        L_0x0c91:
            if (r9 == 0) goto L_0x0c96
            r49.A0U()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
        L_0x0c96:
            boolean r1 = r47.get()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r1 == 0) goto L_0x0cd9
            int r2 = r49.A08()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r1 = 10
            if (r2 != r1) goto L_0x0d55
            java.util.concurrent.atomic.AtomicLong r1 = r6.A0L     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            long r1 = r1.get()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.Object[] r5 = X.C13690nt.A1Z()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r9 == 0) goto L_0x0cd6
            java.lang.String r4 = "successful"
        L_0x0cb3:
            r5[r3] = r4     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            X.C13690nt.A1Q(r5, r15, r1)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.lang.String r4 = "restore>GoogleBackupRestoreObservable/notify-media-restore-end result:%s restored:%d"
            java.lang.String.format(r11, r4, r5)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r5 = -1
            r4 = r46
            r4.A01 = r5     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            java.util.Iterator r5 = X.C16590tJ.A00(r46)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
        L_0x0cc6:
            boolean r4 = r5.hasNext()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            if (r4 == 0) goto L_0x0d55
            java.lang.Object r4 = r5.next()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            X.12R r4 = (X.AnonymousClass12R) r4     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r4.ATR(r1, r9)     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            goto L_0x0cc6
        L_0x0cd6:
            java.lang.String r4 = "failed"
            goto L_0x0cb3
        L_0x0cd9:
            r46.A05()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            goto L_0x0d55
        L_0x0cdd:
            X.3iZ r4 = new X.3iZ     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
            r4.<init>()     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
        L_0x0ce2:
            throw r4     // Catch:{ 3ia -> 0x0d48, 3iO -> 0x0d1b, 3iU -> 0x0d0d, 3iS -> 0x0cff, 3iZ -> 0x0cf1, 3iQ -> 0x0ce3 }
        L_0x0ce3:
            r4 = move-exception
            X.12U r2 = r6.A05     // Catch:{ all -> 0x0d63 }
            r1 = 25
            r2.A05(r1)     // Catch:{ all -> 0x0d63 }
            java.lang.String r1 = "restore>MediaRestoreAction/failure: google drive service is disabled"
            com.whatsapp.util.Log.e(r1, r4)     // Catch:{ all -> 0x0d63 }
            goto L_0x0d55
        L_0x0cf1:
            r4 = move-exception
            X.12U r2 = r6.A05     // Catch:{ all -> 0x0d63 }
            r1 = 23
            r2.A05(r1)     // Catch:{ all -> 0x0d63 }
            java.lang.String r1 = "restore>MediaRestoreAction/failure: access denied to external storage"
            com.whatsapp.util.Log.e(r1, r4)     // Catch:{ all -> 0x0d63 }
            goto L_0x0d55
        L_0x0cff:
            r4 = move-exception
            X.12U r2 = r6.A05     // Catch:{ all -> 0x0d63 }
            r1 = 19
            r2.A05(r1)     // Catch:{ all -> 0x0d63 }
            java.lang.String r1 = "restore>MediaRestoreAction/failure: google servers' are not working"
            com.whatsapp.util.Log.e(r1, r4)     // Catch:{ all -> 0x0d63 }
            goto L_0x0d55
        L_0x0d0d:
            r4 = move-exception
            X.12U r2 = r6.A05     // Catch:{ all -> 0x0d63 }
            r1 = 15
            r2.A05(r1)     // Catch:{ all -> 0x0d63 }
            java.lang.String r1 = "restore>MediaRestoreAction/failure: local storage is full"
            com.whatsapp.util.Log.e(r1, r4)     // Catch:{ all -> 0x0d63 }
            goto L_0x0d55
        L_0x0d1b:
            r2 = move-exception
            java.lang.String r1 = "restore>MediaRestoreAction/failure: access permission is mission for the provided google account"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x0d63 }
            java.lang.Throwable r1 = r2.getCause()     // Catch:{ all -> 0x0d63 }
            if (r1 != 0) goto L_0x0d34
            java.lang.String r1 = "restore>MediaRestoreAction/failure: auth-failed/unknown-cause"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x0d63 }
            X.12U r2 = r6.A05     // Catch:{ all -> 0x0d63 }
            r1 = 11
            r2.A05(r1)     // Catch:{ all -> 0x0d63 }
            goto L_0x0d55
        L_0x0d34:
            boolean r1 = r1 instanceof X.AnonymousClass3W3     // Catch:{ all -> 0x0d63 }
            if (r1 == 0) goto L_0x0d40
            X.12U r2 = r6.A05     // Catch:{ all -> 0x0d63 }
            r1 = 21
            r2.A05(r1)     // Catch:{ all -> 0x0d63 }
            goto L_0x0d55
        L_0x0d40:
            X.12U r2 = r6.A05     // Catch:{ all -> 0x0d63 }
            r1 = 11
            r2.A05(r1)     // Catch:{ all -> 0x0d63 }
            goto L_0x0d55
        L_0x0d48:
            r4 = move-exception
            X.12U r2 = r6.A05     // Catch:{ all -> 0x0d63 }
            r1 = 12
            r2.A05(r1)     // Catch:{ all -> 0x0d63 }
            java.lang.String r1 = "restore>MediaRestoreAction/failure: account not present on the device anymore"
            com.whatsapp.util.Log.e(r1, r4)     // Catch:{ all -> 0x0d63 }
        L_0x0d55:
            X.0t9 r2 = r6.A0E
            r1 = r45
            r2.A06(r1)
            r1 = r47
            r1.getAndSet(r3)
            goto L_0x179b
        L_0x0d63:
            r5 = move-exception
            X.0t9 r1 = r6.A0E
            r0 = r45
            r1.A06(r0)
            r0 = r47
            r0.getAndSet(r3)
            throw r5
        L_0x0d71:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0d71 }
            throw r0
        L_0x0d74:
            X.12N r1 = r0.A0B
            java.util.concurrent.atomic.AtomicLong r1 = r1.A04
            X.4v8 r13 = new X.4v8
            r13.<init>(r1)
            X.0so r15 = r0.A01
            X.0sc r14 = r0.A0F
            X.12U r3 = r0.A09
            X.2GJ r12 = r3.A0D
            java.lang.String r1 = "restore"
            X.2GM r24 = r3.A01(r2, r1)
            X.0se r11 = r0.A0W
            X.12U r10 = r0.A09
            X.0si r9 = r0.A0M
            X.0pd r5 = r0.A0Q
            X.11D r2 = r0.A0P
            r3 = 2668(0xa6c, float:3.739E-42)
            X.0tM r1 = X.C16620tM.A02
            boolean r1 = r5.A0E(r1, r3)
            X.1uy r8 = new X.1uy
            r8.<init>(r2, r1, r1)
            X.0sj r6 = r0.A0J
            X.0rz r5 = r0.A0K
            X.0ym r2 = r0.A0N
            X.0yo r1 = r0.A08
            X.38O r3 = new X.38O
            r16 = r3
            r17 = r0
            r18 = r15
            r19 = r8
            r20 = r13
            r21 = r1
            r22 = r10
            r23 = r12
            r25 = r14
            r26 = r6
            r27 = r5
            r28 = r9
            r29 = r2
            r30 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            X.12M r10 = r0.A0A
            java.lang.String r17 = "restore>RestoreAction/total-requests-till-restore-messages/"
            X.0ym r1 = r3.A0D
            X.0tq r1 = r1.A02
            r2 = 0
            boolean r1 = r1.A07(r7, r2)
            r6 = 0
            if (r1 == 0) goto L_0x0de7
            java.lang.String r1 = "restore>RestoreAction/media restore is pending, end message store download"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r10.A09(r4)
        L_0x0de3:
            r0.A0Y = r6
            goto L_0x179b
        L_0x0de7:
            X.0yo r13 = r3.A05
            java.util.concurrent.atomic.AtomicBoolean r1 = r13.A0f
            r25 = r1
            boolean r1 = r1.getAndSet(r4)
            if (r1 == 0) goto L_0x0df9
            java.lang.String r1 = "restore>RestoreAction/restore is already running"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x0de3
        L_0x0df9:
            r18 = 0
            X.0rz r1 = r3.A0B     // Catch:{ all -> 0x1370 }
            r24 = r1
            java.lang.String r20 = "gdrive_restore_start_timestamp"
            r5 = r1
            r1 = r20
            long r11 = r5.A0J(r1)     // Catch:{ all -> 0x1370 }
            r8 = 0
            int r1 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r1 > 0) goto L_0x0e13
            r1 = r20
            r5.A0x(r1)     // Catch:{ all -> 0x1370 }
        L_0x0e13:
            java.util.Iterator r5 = X.C16590tJ.A00(r10)     // Catch:{ all -> 0x1370 }
        L_0x0e17:
            boolean r1 = r5.hasNext()     // Catch:{ all -> 0x1370 }
            if (r1 == 0) goto L_0x0e27
            java.lang.Object r1 = r5.next()     // Catch:{ all -> 0x1370 }
            X.12R r1 = (X.AnonymousClass12R) r1     // Catch:{ all -> 0x1370 }
            r1.ATk()     // Catch:{ all -> 0x1370 }
            goto L_0x0e17
        L_0x0e27:
            r5 = 3
            r1 = r24
            r1.A0j(r5)     // Catch:{ all -> 0x1370 }
            X.2GM r9 = r3.A08     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            X.2GJ r14 = r3.A07     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            boolean r1 = X.C62173By.A06(r14, r9)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r1 != 0) goto L_0x0e52
            X.12U r5 = r3.A06     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r1 = 11
            r5.A05(r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r10.A09(r2)     // Catch:{ all -> 0x1370 }
            r1 = r25
            r1.getAndSet(r2)
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0q(r17)
            X.59I r1 = r9.A07
            int r2 = r1.A00
            java.util.concurrent.atomic.AtomicInteger r1 = r9.A0I
            goto L_0x135b
        L_0x0e52:
            r3.A00 = r7     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r1 = "restore>RestoreAction/restore-messages/stage: get backup from google"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r1 = r3.A0G     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r23 = r1
            java.lang.String r6 = "gdrive-service/fetch-account-data-v2"
            X.3iA r5 = new X.3iA     // Catch:{ 3iM -> 0x0e94 }
            r5.<init>(r9, r1)     // Catch:{ 3iM -> 0x0e94 }
            java.lang.Object r12 = X.AnonymousClass2GS.A00(r5, r14, r6)     // Catch:{ 3iM -> 0x0e94 }
            X.3BK r12 = (X.AnonymousClass3BK) r12     // Catch:{ 3iM -> 0x0e94 }
            if (r12 == 0) goto L_0x0e94
            org.json.JSONObject r11 = r12.A0B     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r11 == 0) goto L_0x0e97
            java.lang.String r1 = "backupVersion"
            int r5 = r11.optInt(r1, r4)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r5 <= r4) goto L_0x0e9c
            java.lang.String r2 = "/restore-messages/backup version is newer than the app can support. Backup version: "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r2)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            int r1 = r11.optInt(r1, r4)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r2.append(r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r1 = ", supported version: "
            java.lang.String r1 = X.C13680ns.A0i(r1, r2, r4)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            X.3iY r1 = new X.3iY     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r1.<init>()     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            throw r1     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
        L_0x0e94:
            java.lang.String r1 = "restore>RestoreAction/restore-messages/backup doesn't exist(null), aborting restore."
            goto L_0x0eb2
        L_0x0e97:
            java.lang.String r1 = "gdrive-api-v2/backup-version metadata is null."
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
        L_0x0e9c:
            X.1uy r5 = r3.A03     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            org.json.JSONObject r1 = r12.A03()     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            boolean r1 = r5.A04(r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r8 = 0
            if (r1 != 0) goto L_0x0eb7
            X.0so r5 = r3.A02     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r1 = "gdrive/restore/message backup is expired"
            r5.AcB(r1, r7, r2)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r1 = "restore>RestoreAction/restore-messages/backup is expired(not supported anymore)."
        L_0x0eb2:
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            goto L_0x1252
        L_0x0eb7:
            java.lang.String r1 = "/restore-messages/version of app at time of backup was: "
            java.lang.StringBuilder r6 = X.AnonymousClass000.A0r(r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r5 = "unknown"
            if (r11 == 0) goto L_0x0ec9
            java.lang.String r1 = "versionOfAppWhenBackup"
            java.lang.String r5 = r11.optString(r1, r5)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
        L_0x0ec9:
            java.lang.String r1 = X.AnonymousClass000.A0h(r5, r6)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            int r1 = r24.A09()     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r1 != r4) goto L_0x0ed9
            java.lang.String r1 = "restore>RestoreAction/restore-messages/cannot start restore, backup in progress."
            goto L_0x0eb2
        L_0x0ed9:
            java.lang.String r1 = "restore>RestoreAction/restore-messages/stage: load files from google"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            X.2GJ r1 = r13.A0M     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.util.Map r1 = X.C62173By.A01(r1, r12)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r3.A00 = r1     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r1 == 0) goto L_0x1252
            boolean r1 = r24.A1X()     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r1 == 0) goto L_0x1114
            X.0si r1 = r3.A0C     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r22 = r1
            java.io.File[] r7 = r22.A0K()     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            int r6 = r7.length     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
        L_0x0ef7:
            if (r2 >= r6) goto L_0x0f18
            r8 = r7[r2]     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            X.0sc r5 = r3.A09     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            android.content.Context r1 = r3.A01     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r5 = X.AnonymousClass2GK.A08(r1, r5, r8)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r5 == 0) goto L_0x1245
            java.util.Map r1 = r3.A00     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.Object r8 = r1.get(r5)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            X.3Ad r8 = (X.C61743Ad) r8     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r8 == 0) goto L_0x0f7e
            java.lang.String r1 = "restore>RestoreAction/restore-messages/found backup file: "
            java.lang.String r1 = X.AnonymousClass000.A0g(r1, r8)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
        L_0x0f18:
            boolean r1 = r14.A05()     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r1 == 0) goto L_0x1252
            java.lang.String r1 = "restore>RestoreAction/restore-messages/stage: restore user settings"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.util.Map r1 = r3.A00     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r21 = r1
            java.lang.String r7 = r3.A0F     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r1 = r24
            r1.A0s(r7)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            long r1 = r12.A05     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r5 = r24
            r5.A11(r7, r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            long r1 = r12.A04     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r5.A12(r7, r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r2 = "mediaSize"
            r5 = -1
            if (r11 == 0) goto L_0x0f7b
            boolean r1 = r11.has(r2)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r1 == 0) goto L_0x0f70
            long r1 = r11.optLong(r2, r5)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
        L_0x0f4a:
            r15 = r24
            r15.A10(r7, r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r2 = "videoSize"
            if (r11 == 0) goto L_0x0f6d
            boolean r1 = r11.has(r2)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r1 == 0) goto L_0x0f62
            long r1 = r11.optLong(r2, r5)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
        L_0x0f5e:
            r15.A13(r7, r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            goto L_0x0f82
        L_0x0f62:
            org.json.JSONObject r1 = r12.A04()     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r1 == 0) goto L_0x0f6d
            long r1 = r1.optLong(r2, r5)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            goto L_0x0f5e
        L_0x0f6d:
            r1 = -1
            goto L_0x0f5e
        L_0x0f70:
            org.json.JSONObject r1 = r12.A04()     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r1 == 0) goto L_0x0f7b
            long r1 = r1.optLong(r2, r5)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            goto L_0x0f4a
        L_0x0f7b:
            r1 = -1
            goto L_0x0f4a
        L_0x0f7e:
            int r2 = r2 + 1
            goto L_0x0ef7
        L_0x0f82:
            if (r11 != 0) goto L_0x0f86
            r2 = 0
            goto L_0x0f8e
        L_0x0f86:
            java.lang.String r2 = "encryptedBackupEnabled"
            r1 = r18
            boolean r2 = r11.optBoolean(r2, r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
        L_0x0f8e:
            r15.A1C(r7, r2)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r2 = "backupFrequency"
            r5 = -1
            if (r11 == 0) goto L_0x0fae
            boolean r1 = r11.has(r2)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r1 == 0) goto L_0x0fa1
            int r2 = r11.optInt(r2, r5)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            goto L_0x0fab
        L_0x0fa1:
            org.json.JSONObject r1 = r12.A04()     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r1 == 0) goto L_0x0fae
            int r2 = r1.optInt(r2, r5)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
        L_0x0fab:
            if (r2 < 0) goto L_0x0fae
            goto L_0x0fb1
        L_0x0fae:
            r19 = 1
            goto L_0x0fb5
        L_0x0fb1:
            boolean r19 = r15.A1l(r2)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
        L_0x0fb5:
            java.lang.String r2 = "backupNetworkSettings"
            if (r11 == 0) goto L_0x0fd6
            boolean r1 = r11.has(r2)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r1 == 0) goto L_0x0fc4
            int r1 = r11.optInt(r2, r5)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            goto L_0x0fce
        L_0x0fc4:
            org.json.JSONObject r1 = r12.A04()     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r1 == 0) goto L_0x0fd6
            int r1 = r1.optInt(r2, r5)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
        L_0x0fce:
            if (r1 < 0) goto L_0x0fd6
            boolean r1 = r13.A0D(r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r19 = r19 & r1
        L_0x0fd6:
            java.lang.String r2 = "includeVideosInBackup"
            if (r11 == 0) goto L_0x0fff
            boolean r1 = r11.has(r2)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r1 == 0) goto L_0x0ff4
            boolean r2 = r11.optBoolean(r2, r4)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
        L_0x0fe4:
            r15.A1J(r2)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r6 = "gdrive-api-v2/backup/get-local-settings/failed to parse"
            java.lang.String r5 = "localSettings"
            if (r11 == 0) goto L_0x1006
            boolean r1 = r11.has(r5)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r1 == 0) goto L_0x1006
            goto L_0x1001
        L_0x0ff4:
            org.json.JSONObject r1 = r12.A04()     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r1 == 0) goto L_0x0fff
            boolean r2 = r1.optBoolean(r2, r4)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            goto L_0x0fe4
        L_0x0fff:
            r2 = 1
            goto L_0x0fe4
        L_0x1001:
            org.json.JSONObject r2 = r11.getJSONObject(r5)     // Catch:{ JSONException -> 0x1022 }
            goto L_0x1016
        L_0x1006:
            org.json.JSONObject r2 = r12.A04()     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r2 == 0) goto L_0x101c
            boolean r1 = r2.has(r5)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r1 == 0) goto L_0x101c
            org.json.JSONObject r2 = r2.getJSONObject(r5)     // Catch:{ JSONException -> 0x1022 }
        L_0x1016:
            if (r2 == 0) goto L_0x1026
            r15.A1D(r2)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            goto L_0x102b
        L_0x101c:
            java.lang.String r1 = "gdrive-api-v2/backup/get-local-settings/localSettings-is-missing"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            goto L_0x1026
        L_0x1022:
            r1 = move-exception
            com.whatsapp.util.Log.e(r6, r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
        L_0x1026:
            java.lang.String r1 = "restore>RestoreAction/restore-user-settings/local settings are empty"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
        L_0x102b:
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            X.0sc r5 = r3.A09     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.io.File r1 = r5.A02()     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            android.content.Context r6 = r3.A01     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r11 = X.AnonymousClass2GK.A08(r6, r5, r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r11 == 0) goto L_0x1069
            java.util.Iterator r13 = X.AnonymousClass000.A0y(r21)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
        L_0x1041:
            boolean r1 = r13.hasNext()     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r1 == 0) goto L_0x1069
            java.util.Map$Entry r12 = X.AnonymousClass000.A0z(r13)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r1 = X.C13690nt.A0f(r12)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            boolean r1 = r1.startsWith(r11)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r1 == 0) goto L_0x1041
            X.0so r2 = r3.A02     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r1 = X.C13690nt.A0f(r12)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r1 = X.AnonymousClass2GK.A06(r6, r2, r5, r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r1 == 0) goto L_0x1041
            java.io.File r1 = X.C13700nu.A0D(r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r7.add(r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            goto L_0x1041
        L_0x1069:
            java.util.Set r1 = X.AnonymousClass2GK.A0E(r6)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r7.addAll(r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.util.Iterator r16 = r7.iterator()     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r15 = 1
        L_0x1075:
            boolean r1 = r16.hasNext()     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r1 == 0) goto L_0x10ed
            java.lang.Object r7 = r16.next()     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.io.File r7 = (java.io.File) r7     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r2 = X.AnonymousClass2GK.A08(r6, r5, r7)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r2 != 0) goto L_0x1090
            java.lang.String r1 = "restore>RestoreAction/restore-backups-dir/skipping/null-title"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r7.getAbsolutePath()     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            goto L_0x1075
        L_0x1090:
            r1 = r21
            java.lang.Object r11 = r1.get(r2)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            X.3Ad r11 = (X.C61743Ad) r11     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r11 != 0) goto L_0x10a0
            java.lang.String r1 = "restore>RestoreAction/restore-backups-dir/skipping/google-drive-file-not-found"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            goto L_0x1075
        L_0x10a0:
            X.4WW r1 = r11.A02     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r1 == 0) goto L_0x10bc
            java.lang.String r13 = r1.A03     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
        L_0x10a6:
            X.0sj r12 = r3.A0A     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            long r1 = r7.length()     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r1 = X.AnonymousClass2GK.A09(r5, r12, r7, r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            boolean r1 = r13.equals(r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r1 == 0) goto L_0x10bf
            java.lang.String r1 = "restore>RestoreAction/restore-backups-dir/skipping/already-downloaded"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            goto L_0x1075
        L_0x10bc:
            java.lang.String r13 = r11.A03     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            goto L_0x10a6
        L_0x10bf:
            X.5Oc r1 = r3.A04     // Catch:{ 3ib -> 0x10e6, 3ia -> 0x1302, 3iO -> 0x12d4, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            boolean r1 = X.C62173By.A05(r1, r14, r9, r11, r7)     // Catch:{ 3ib -> 0x10e6, 3ia -> 0x1302, 3iO -> 0x12d4, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r15 = r15 & r1
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0o()     // Catch:{ 3ib -> 0x10e6, 3ia -> 0x1302, 3iO -> 0x12d4, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r1 = "restore>RestoreAction/restore-backups-dir/success "
            r11.append(r1)     // Catch:{ 3ib -> 0x10e6, 3ia -> 0x1302, 3iO -> 0x12d4, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r1 = r7.getAbsolutePath()     // Catch:{ 3ib -> 0x10e6, 3ia -> 0x1302, 3iO -> 0x12d4, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r11.append(r1)     // Catch:{ 3ib -> 0x10e6, 3ia -> 0x1302, 3iO -> 0x12d4, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r1 = " size: "
            r11.append(r1)     // Catch:{ 3ib -> 0x10e6, 3ia -> 0x1302, 3iO -> 0x12d4, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            long r1 = r7.length()     // Catch:{ 3ib -> 0x10e6, 3ia -> 0x1302, 3iO -> 0x12d4, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r11.append(r1)     // Catch:{ 3ib -> 0x10e6, 3ia -> 0x1302, 3iO -> 0x12d4, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            X.C13680ns.A1V(r11)     // Catch:{ 3ib -> 0x10e6, 3ia -> 0x1302, 3iO -> 0x12d4, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            goto L_0x1075
        L_0x10e6:
            r2 = move-exception
            java.lang.String r1 = "restore>RestoreAction/restore-backups-dir/file-not-found"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            goto L_0x1075
        L_0x10ed:
            X.0se r1 = r3.A0E     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r1.A00 = r4     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r15 = r15 & r19
            if (r15 != 0) goto L_0x10fa
            java.lang.String r1 = "restore>RestoreAction/restore-user-settings/unable to save user settings from google drive to shared prefs"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
        L_0x10fa:
            if (r8 != 0) goto L_0x10fe
            goto L_0x11ae
        L_0x10fe:
            X.0so r1 = r3.A02     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r7 = r8.A06     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r2 = X.AnonymousClass2GK.A06(r6, r1, r5, r7)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r1 == 0) goto L_0x1117
            java.lang.String r1 = "restore>RestoreAction/restore-messages/no local path for message store backup "
            java.lang.String r1 = X.C13680ns.A0h(r1, r7)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            goto L_0x0eb2
        L_0x1114:
            java.lang.String r1 = "restore>RestoreAction/restore-messages/skipping google drive db download, we are using local"
            goto L_0x1150
        L_0x1117:
            java.io.File r6 = X.C13700nu.A0D(r2)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            boolean r1 = r6.exists()     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r1 == 0) goto L_0x1179
            long r15 = r6.length()     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r11 = 0
            int r1 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r1 <= 0) goto L_0x1179
            X.4WW r1 = r8.A02     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r1 == 0) goto L_0x1155
            java.lang.String r9 = r1.A03     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
        L_0x1131:
            X.0sj r7 = r3.A0A     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            long r1 = r6.length()     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r1 = X.AnonymousClass2GK.A09(r5, r7, r6, r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            boolean r1 = r9.equals(r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r1 == 0) goto L_0x1158
            java.lang.String r1 = "restore>RestoreAction/restore-messages/file "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r2.append(r6)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r1 = " is same as remote file, no need to download"
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r2)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
        L_0x1150:
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            goto L_0x124c
        L_0x1155:
            java.lang.String r9 = r8.A03     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            goto L_0x1131
        L_0x1158:
            java.lang.String r1 = "restore>RestoreAction/restore-messages/rotate-current-backup-file-to-preserve-it"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r2 = ""
            boolean r1 = r6.exists()     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r1 == 0) goto L_0x1179
            java.util.Date r1 = new java.util.Date     // Catch:{ SecurityException -> 0x1179 }
            r1.<init>()     // Catch:{ SecurityException -> 0x1179 }
            java.lang.String r2 = X.AnonymousClass02N.A00(r6, r2, r1)     // Catch:{ SecurityException -> 0x1179 }
            java.io.File r1 = r6.getParentFile()     // Catch:{ SecurityException -> 0x1179 }
            java.io.File r1 = X.C13700nu.A0C(r1, r2)     // Catch:{ SecurityException -> 0x1179 }
            r6.renameTo(r1)     // Catch:{ SecurityException -> 0x1179 }
        L_0x1179:
            X.3iD r2 = new X.3iD     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r2.<init>(r10, r8, r3, r6)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r1 = "/restore-messages/download and save message store"
            java.lang.Object r5 = X.AnonymousClass2GS.A00(r2, r14, r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r1 = "restore>RestoreAction/restore-messages/stage: restoring messages finished with "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r5 == 0) goto L_0x119f
            boolean r1 = r5.booleanValue()     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r1 == 0) goto L_0x119f
            java.lang.String r1 = "success"
        L_0x1197:
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r2)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            goto L_0x11a2
        L_0x119f:
            java.lang.String r1 = "failure"
            goto L_0x1197
        L_0x11a2:
            if (r5 == 0) goto L_0x11aa
            boolean r1 = r5.booleanValue()     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r1 != 0) goto L_0x124c
        L_0x11aa:
            java.lang.String r1 = "restore>RestoreAction/restore-messages/failed to restore database."
            goto L_0x0eb2
        L_0x11ae:
            X.0tx r1 = X.C16960tx.A00()     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            int r8 = r1.version     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.util.Map r1 = r3.A00     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            X.AnonymousClass00B.A06(r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.util.Iterator r9 = X.C13700nu.A0I(r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
        L_0x11bd:
            boolean r1 = r9.hasNext()     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r1 == 0) goto L_0x11f1
            java.lang.String r7 = X.AnonymousClass000.A0m(r9)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            X.0so r1 = r3.A02     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r2 = X.AnonymousClass2GK.A06(r6, r1, r5, r7)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r2 == 0) goto L_0x11bd
            java.lang.String r1 = "msgstore.db"
            int r1 = X.C40691uX.A01(r2, r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            if (r1 <= r8) goto L_0x11bd
            java.lang.String r1 = "restore>RestoreAction/contains-newer-backup/true "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r2.append(r7)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r1 = " is newer than "
            r2.append(r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r2.append(r8)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            X.C13680ns.A1V(r2)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            X.3iY r1 = new X.3iY     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r1.<init>()     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            throw r1     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
        L_0x11f1:
            java.lang.String r1 = "restore>RestoreAction/restore-messages/weird situation, no message backup file found for paths ["
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.io.File[] r1 = r22.A0K()     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r5 = ", "
            java.lang.String r1 = android.text.TextUtils.join(r5, r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r2.append(r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r1 = "] in backup for \""
            r2.append(r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r1 = r23
            r2.append(r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r1 = "\" (while looking in gdrive_file_map (size: "
            r2.append(r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.util.Map r1 = r3.A00     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            X.AnonymousClass00B.A06(r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            int r1 = r1.size()     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r2.append(r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r1 = ")"
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r2)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r1 = "no message backup file found for paths ["
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.io.File[] r1 = r22.A0K()     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r1 = android.text.TextUtils.join(r5, r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r2.append(r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            java.lang.String r1 = "]"
            java.lang.String r2 = X.AnonymousClass000.A0h(r1, r2)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            X.3ib r1 = new X.3ib     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            r1.<init>(r2)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            throw r1     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
        L_0x1245:
            java.lang.String r1 = "/restore-messages/upload title for database is null"
            java.lang.IllegalStateException r1 = X.AnonymousClass000.A0V(r1)     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
            throw r1     // Catch:{ 3ia -> 0x1302, 3iO -> 0x12d4, 3ib -> 0x12ba, 3iU -> 0x12ab, 3iS -> 0x129c, 3iZ -> 0x128d, 3iY -> 0x127d, 3iQ -> 0x126d, all -> 0x1368 }
        L_0x124c:
            r6 = 1
            X.12U r2 = r3.A06     // Catch:{ 3ia -> 0x126a, 3iO -> 0x1268, 3ib -> 0x1266, 3iU -> 0x1264, 3iS -> 0x1262, 3iZ -> 0x1260, 3iY -> 0x125e, 3iQ -> 0x125c }
            r1 = 10
            goto L_0x1257
        L_0x1252:
            r6 = 0
            X.12U r2 = r3.A06     // Catch:{ 3ia -> 0x126a, 3iO -> 0x1268, 3ib -> 0x1266, 3iU -> 0x1264, 3iS -> 0x1262, 3iZ -> 0x1260, 3iY -> 0x125e, 3iQ -> 0x125c }
            r1 = 14
        L_0x1257:
            r2.A05(r1)     // Catch:{ 3ia -> 0x126a, 3iO -> 0x1268, 3ib -> 0x1266, 3iU -> 0x1264, 3iS -> 0x1262, 3iZ -> 0x1260, 3iY -> 0x125e, 3iQ -> 0x125c }
            goto L_0x1310
        L_0x125c:
            r5 = move-exception
            goto L_0x126f
        L_0x125e:
            r5 = move-exception
            goto L_0x127f
        L_0x1260:
            r5 = move-exception
            goto L_0x128f
        L_0x1262:
            r5 = move-exception
            goto L_0x129e
        L_0x1264:
            r5 = move-exception
            goto L_0x12ad
        L_0x1266:
            r7 = move-exception
            goto L_0x12bc
        L_0x1268:
            r2 = move-exception
            goto L_0x12d6
        L_0x126a:
            r5 = move-exception
            goto L_0x1304
        L_0x126d:
            r5 = move-exception
            r6 = 0
        L_0x126f:
            X.12U r2 = r3.A06     // Catch:{ all -> 0x136b }
            r1 = 25
            r2.A05(r1)     // Catch:{ all -> 0x136b }
            java.lang.String r1 = "restore>RestoreAction/failure: google drive service is disabled"
            com.whatsapp.util.Log.e(r1, r5)     // Catch:{ all -> 0x136b }
            goto L_0x1310
        L_0x127d:
            r5 = move-exception
            r6 = 0
        L_0x127f:
            X.12U r2 = r3.A06     // Catch:{ all -> 0x136b }
            r1 = 24
            r2.A05(r1)     // Catch:{ all -> 0x136b }
            java.lang.String r1 = "restore>RestoreAction/failure: backup generated by a newer version of the app"
            com.whatsapp.util.Log.e(r1, r5)     // Catch:{ all -> 0x136b }
            goto L_0x1310
        L_0x128d:
            r5 = move-exception
            r6 = 0
        L_0x128f:
            X.12U r2 = r3.A06     // Catch:{ all -> 0x136b }
            r1 = 23
            r2.A05(r1)     // Catch:{ all -> 0x136b }
            java.lang.String r1 = "restore>RestoreAction/failure: access denied to external storage"
            com.whatsapp.util.Log.e(r1, r5)     // Catch:{ all -> 0x136b }
            goto L_0x1310
        L_0x129c:
            r5 = move-exception
            r6 = 0
        L_0x129e:
            X.12U r2 = r3.A06     // Catch:{ all -> 0x136b }
            r1 = 19
            r2.A05(r1)     // Catch:{ all -> 0x136b }
            java.lang.String r1 = "restore>RestoreAction/failure: google servers' are not working"
            com.whatsapp.util.Log.e(r1, r5)     // Catch:{ all -> 0x136b }
            goto L_0x1310
        L_0x12ab:
            r5 = move-exception
            r6 = 0
        L_0x12ad:
            X.12U r2 = r3.A06     // Catch:{ all -> 0x136b }
            r1 = 15
            r2.A05(r1)     // Catch:{ all -> 0x136b }
            java.lang.String r1 = "restore>RestoreAction/failure: local storage is full"
            com.whatsapp.util.Log.e(r1, r5)     // Catch:{ all -> 0x136b }
            goto L_0x1310
        L_0x12ba:
            r7 = move-exception
            r6 = 0
        L_0x12bc:
            X.12U r2 = r3.A06     // Catch:{ all -> 0x136b }
            r1 = 17
            r2.A05(r1)     // Catch:{ all -> 0x136b }
            java.lang.String r1 = "restore>RestoreAction/failure: backup file not found"
            com.whatsapp.util.Log.e(r1, r7)     // Catch:{ all -> 0x136b }
            X.0so r5 = r3.A02     // Catch:{ all -> 0x136b }
            java.lang.String r2 = "/google drive msgstore backup file not found "
            java.lang.String r1 = r7.getMessage()     // Catch:{ all -> 0x136b }
            r5.AcB(r2, r1, r4)     // Catch:{ all -> 0x136b }
            goto L_0x1310
        L_0x12d4:
            r2 = move-exception
            r6 = 0
        L_0x12d6:
            java.lang.String r1 = "restore>RestoreAction/failure: auth failed because accessing google account permission is missing"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ all -> 0x136b }
            java.lang.Throwable r1 = r2.getCause()     // Catch:{ all -> 0x136b }
            if (r1 != 0) goto L_0x12ee
            java.lang.String r1 = "restore>RestoreAction/failure: auth-failed/unknown-cause"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x136b }
            X.12U r2 = r3.A06     // Catch:{ all -> 0x136b }
            r1 = 11
            r2.A05(r1)     // Catch:{ all -> 0x136b }
            goto L_0x1310
        L_0x12ee:
            boolean r1 = r1 instanceof X.AnonymousClass3W3     // Catch:{ all -> 0x136b }
            if (r1 == 0) goto L_0x12fa
            X.12U r2 = r3.A06     // Catch:{ all -> 0x136b }
            r1 = 21
            r2.A05(r1)     // Catch:{ all -> 0x136b }
            goto L_0x1310
        L_0x12fa:
            X.12U r2 = r3.A06     // Catch:{ all -> 0x136b }
            r1 = 11
            r2.A05(r1)     // Catch:{ all -> 0x136b }
            goto L_0x1310
        L_0x1302:
            r5 = move-exception
            r6 = 0
        L_0x1304:
            X.12U r2 = r3.A06     // Catch:{ all -> 0x136b }
            r1 = 12
            r2.A05(r1)     // Catch:{ all -> 0x136b }
            java.lang.String r1 = "restore>RestoreAction/failure: account not present on device anymore"
            com.whatsapp.util.Log.e(r1, r5)     // Catch:{ all -> 0x136b }
        L_0x1310:
            r10.A09(r6)     // Catch:{ all -> 0x1370 }
            java.util.Locale r11 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x1370 }
            java.lang.String r10 = "total wall time for message restore: %.1f seconds."
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ all -> 0x1370 }
            long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x1370 }
            r2 = r24
            r1 = r20
            long r1 = r2.A0J(r1)     // Catch:{ all -> 0x1370 }
            long r4 = r4 - r1
            double r7 = (double) r4     // Catch:{ all -> 0x1370 }
            r1 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r7 = r7 / r1
            java.lang.Double r1 = java.lang.Double.valueOf(r7)     // Catch:{ all -> 0x1370 }
            r9[r18] = r1     // Catch:{ all -> 0x1370 }
            X.C13700nu.A0Z(r10, r11, r9)     // Catch:{ all -> 0x1370 }
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x1370 }
            java.lang.String r1 = "restore>RestoreAction/finished with success status: "
            r2.append(r1)     // Catch:{ all -> 0x1370 }
            r2.append(r6)     // Catch:{ all -> 0x1370 }
            X.C13680ns.A1V(r2)     // Catch:{ all -> 0x1370 }
            java.util.Map r6 = r3.A00     // Catch:{ all -> 0x1370 }
            r2 = r25
            r1 = r18
            r2.getAndSet(r1)
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0q(r17)
            X.2GM r3 = r3.A08
            X.59I r1 = r3.A07
            int r2 = r1.A00
            java.util.concurrent.atomic.AtomicInteger r1 = r3.A0I
        L_0x135b:
            int r1 = r1.get()
            int r2 = r2 + r1
            r4.append(r2)
            X.C13680ns.A1V(r4)
            goto L_0x0de3
        L_0x1368:
            r0 = move-exception
            r6 = 0
            goto L_0x136c
        L_0x136b:
            r0 = move-exception
        L_0x136c:
            r10.A09(r6)     // Catch:{ all -> 0x1370 }
            throw r0     // Catch:{ all -> 0x1370 }
        L_0x1370:
            r5 = move-exception
            r1 = r25
            r0 = r18
            r1.getAndSet(r0)
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0q(r17)
            X.2GM r2 = r3.A08
            X.59I r0 = r2.A07
            int r1 = r0.A00
            java.util.concurrent.atomic.AtomicInteger r0 = r2.A0I
            int r0 = r0.get()
            int r1 = r1 + r0
            r4.append(r1)
            X.C13680ns.A1V(r4)
            throw r5
        L_0x1390:
            X.0sj r1 = r0.A0J
            boolean r1 = r1.A0E()
            if (r1 == 0) goto L_0x13a6
            java.lang.String r1 = "gdrive-service/handle-intent/backup/read-storage-permission-denied/aborting-backup"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            X.12U r2 = r0.A09
            r1 = 23
        L_0x13a1:
            r2.A05(r1)
            goto L_0x179b
        L_0x13a6:
            X.0rz r1 = r0.A0K
            boolean r1 = X.AnonymousClass2GK.A0H(r1)
            if (r1 == 0) goto L_0x13b2
            java.lang.String r1 = "gdrive-service/handle-intent/backup cannot start backup, media restore in pending"
            goto L_0x1788
        L_0x13b2:
            X.0yo r1 = r0.A08
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.A0a
            boolean r1 = r1.get()
            if (r1 == 0) goto L_0x13c0
            java.lang.String r1 = "gdrive-service/handle-intent/backup cannot start backup, backup export in pending"
            goto L_0x1788
        L_0x13c0:
            X.0yo r1 = r0.A08
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.A0c
            boolean r1 = r1.getAndSet(r4)
            if (r1 == 0) goto L_0x13ce
            java.lang.String r1 = "gdrive-service/handle-intent/backup another backup is already running."
            goto L_0x1788
        L_0x13ce:
            X.0rz r1 = r0.A0K
            int r1 = r1.A08()
            r5 = 10
            if (r1 == r5) goto L_0x13dd
            X.12U r1 = r0.A09
            r1.A05(r5)
        L_0x13dd:
            X.0xj r1 = r0.A0E
            r5 = 2
            r1.A00(r5, r4)
            X.0yo r1 = r0.A08     // Catch:{ all -> 0x151d }
            r1.A00()     // Catch:{ all -> 0x151d }
            java.lang.String r38 = r0.A01()     // Catch:{ all -> 0x151d }
            if (r38 != 0) goto L_0x1404
            java.lang.String r1 = "gdrive-service/handle-intent/backup jid is null."
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ all -> 0x151d }
            X.0yo r1 = r0.A08
            r1.A06()
            X.0xj r1 = r0.A0E
            r1.A00(r5, r3)
            X.12U r1 = r0.A09
            r1.A04()
            goto L_0x179b
        L_0x1404:
            boolean r1 = r0.A0b     // Catch:{ all -> 0x151d }
            if (r1 != 0) goto L_0x1415
            java.util.ArrayList r5 = r0.A0e     // Catch:{ all -> 0x151d }
            X.0sb r1 = r0.A02     // Catch:{ all -> 0x151d }
            java.util.List r1 = X.AnonymousClass2GK.A0D(r1)     // Catch:{ all -> 0x151d }
            r5.addAll(r1)     // Catch:{ all -> 0x151d }
            r0.A0b = r4     // Catch:{ all -> 0x151d }
        L_0x1415:
            X.0tz r1 = r0.A0I     // Catch:{ all -> 0x151d }
            r29 = r1
            X.0t3 r1 = r0.A0H     // Catch:{ all -> 0x151d }
            r28 = r1
            X.0pd r12 = r0.A0Q     // Catch:{ all -> 0x151d }
            X.0so r1 = r0.A01     // Catch:{ all -> 0x151d }
            r44 = r1
            X.0sb r11 = r0.A02     // Catch:{ all -> 0x151d }
            X.0t9 r1 = r0.A0R     // Catch:{ all -> 0x151d }
            r35 = r1
            X.0sc r1 = r0.A0F     // Catch:{ all -> 0x151d }
            r26 = r1
            X.0ug r1 = r0.A0T     // Catch:{ all -> 0x151d }
            r37 = r1
            X.0sd r1 = r0.A05     // Catch:{ all -> 0x151d }
            r43 = r1
            X.0rz r1 = r0.A0K     // Catch:{ all -> 0x151d }
            X.39E r9 = new X.39E     // Catch:{ all -> 0x151d }
            r9.<init>(r11, r1, r12)     // Catch:{ all -> 0x151d }
            X.12W r1 = r0.A0G     // Catch:{ all -> 0x151d }
            r27 = r1
            X.0si r1 = r0.A0M     // Catch:{ all -> 0x151d }
            r32 = r1
            X.0tq r1 = r0.A0O     // Catch:{ all -> 0x151d }
            r21 = r1
            X.12T r1 = r0.A0D     // Catch:{ all -> 0x151d }
            r22 = r1
            X.0sj r1 = r0.A0J     // Catch:{ all -> 0x151d }
            r20 = r1
            X.0rz r1 = r0.A0K     // Catch:{ all -> 0x151d }
            r17 = r1
            X.1I1 r1 = r0.A07     // Catch:{ all -> 0x151d }
            r18 = r1
            X.0yo r1 = r0.A08     // Catch:{ all -> 0x151d }
            r19 = r1
            java.util.ArrayList r1 = r0.A0e     // Catch:{ all -> 0x151d }
            r16 = r1
            X.12N r1 = r0.A0B     // Catch:{ all -> 0x151d }
            java.util.concurrent.atomic.AtomicLong r15 = r1.A07     // Catch:{ all -> 0x151d }
            java.util.concurrent.atomic.AtomicLong r14 = r1.A06     // Catch:{ all -> 0x151d }
            X.12U r4 = r0.A09     // Catch:{ all -> 0x151d }
            java.lang.String r1 = "backup"
            X.2GM r24 = r4.A01(r2, r1)     // Catch:{ all -> 0x151d }
            X.12U r6 = r0.A09     // Catch:{ all -> 0x151d }
            X.0yo r4 = r0.A08     // Catch:{ all -> 0x151d }
            X.12N r1 = r0.A0B     // Catch:{ all -> 0x151d }
            X.3iJ r8 = new X.3iJ     // Catch:{ all -> 0x151d }
            r8.<init>(r4, r6, r1)     // Catch:{ all -> 0x151d }
            X.12M r7 = r0.A0A     // Catch:{ all -> 0x151d }
            java.lang.Object r13 = r6.A0O     // Catch:{ all -> 0x151d }
            monitor-enter(r13)     // Catch:{ all -> 0x151d }
            X.2GT r5 = new X.2GT     // Catch:{ all -> 0x151a }
            r5.<init>()     // Catch:{ all -> 0x151a }
            r6.A01 = r5     // Catch:{ all -> 0x151a }
            java.lang.Integer r1 = X.C13680ns.A0Y()     // Catch:{ all -> 0x151a }
            r5.A0E = r1     // Catch:{ all -> 0x151a }
            X.0rz r4 = r6.A0J     // Catch:{ all -> 0x151a }
            int r1 = X.AnonymousClass2GK.A01(r4, r10)     // Catch:{ all -> 0x151a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x151a }
            r5.A0F = r1     // Catch:{ all -> 0x151a }
            X.2GT r1 = r6.A01     // Catch:{ all -> 0x151a }
            int r4 = r4.A07()     // Catch:{ all -> 0x151a }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x151a }
            r1.A0B = r4     // Catch:{ all -> 0x151a }
            X.2GT r6 = r6.A01     // Catch:{ all -> 0x151a }
            monitor-exit(r13)     // Catch:{ all -> 0x151a }
            X.0pd r13 = r0.A0Q     // Catch:{ all -> 0x151d }
            X.11D r5 = r0.A0P     // Catch:{ all -> 0x151d }
            r4 = 2668(0xa6c, float:3.739E-42)
            X.0tM r1 = X.C16620tM.A02     // Catch:{ all -> 0x151d }
            boolean r4 = r13.A0E(r1, r4)     // Catch:{ all -> 0x151d }
            X.1uy r1 = new X.1uy     // Catch:{ all -> 0x151d }
            r1.<init>(r5, r4, r4)     // Catch:{ all -> 0x151d }
            com.facebook.redex.IDxECallbackShape414S0100000_2_I1 r4 = new com.facebook.redex.IDxECallbackShape414S0100000_2_I1     // Catch:{ all -> 0x151d }
            r4.<init>(r0, r3)     // Catch:{ all -> 0x151d }
            X.39o r13 = new X.39o     // Catch:{ all -> 0x151d }
            r23 = r8
            r25 = r4
            r30 = r20
            r31 = r17
            r33 = r21
            r34 = r12
            r36 = r6
            r39 = r16
            r40 = r15
            r41 = r14
            r42 = r10
            r14 = r44
            r15 = r11
            r16 = r1
            r17 = r43
            r20 = r7
            r21 = r9
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42)     // Catch:{ all -> 0x151d }
            boolean r5 = r13.A03()     // Catch:{ all -> 0x151d }
            X.0yo r1 = r0.A08
            r1.A06()
            X.0xj r4 = r0.A0E
            r1 = 2
            r4.A00(r1, r3)
            X.12U r1 = r0.A09
            r1.A04()
            if (r5 == 0) goto L_0x179b
            X.0sd r1 = r0.A05
            X.0rz r1 = r1.A03
            boolean r1 = r1.A1f()
            if (r1 == 0) goto L_0x179b
            X.0rz r1 = r0.A0K
            int r2 = r1.A0F(r2)
            r1 = 1
            if (r2 != r1) goto L_0x179b
            X.12P r5 = r0.A0X
            java.util.Random r4 = r0.A0Z
            X.0rz r3 = r0.A0K
            r2 = r10 ^ 1
            X.03z r1 = X.AnonymousClass03z.KEEP
            com.obwhatsapp.backup.google.workers.GoogleEncryptedReUploadWorker.A01(r1, r3, r5, r4, r2)
            goto L_0x179b
        L_0x151a:
            r1 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x151a }
            throw r1     // Catch:{ all -> 0x151d }
        L_0x151d:
            r4 = move-exception
            r2 = 2
            X.0yo r1 = r0.A08
            r1.A06()
            X.0xj r1 = r0.A0E
            r1.A00(r2, r3)
            X.12U r0 = r0.A09
            r0.A04()
            throw r4
        L_0x152f:
            java.lang.String r1 = "gdrive-service/handle-intent/backup automated backup called too early, ignored"
            goto L_0x1771
        L_0x1533:
            X.AnonymousClass00B.A00()     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            X.0rz r1 = r0.A0K     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            android.content.SharedPreferences r2 = X.C13680ns.A0B(r1)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            java.lang.String r1 = "gdrive_last_successful_backup_timestamp:"
            java.lang.String r1 = X.C13680ns.A0h(r1, r4)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            boolean r1 = r2.contains(r1)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            if (r1 != 0) goto L_0x179b
            X.12U r1 = r0.A09     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            X.2GM r7 = r1.A01(r4, r7)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            X.0yo r1 = r0.A08     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            X.2GJ r1 = r1.A0M     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            boolean r1 = X.C62173By.A06(r1, r7)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            if (r1 != 0) goto L_0x156b
            java.lang.String r1 = "gdrive-service/fetch-account-data-v2/auth-failed/"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r1)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            java.lang.String r1 = X.AnonymousClass2GK.A0B(r4)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r2)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            goto L_0x179b
        L_0x156b:
            java.lang.String r6 = r0.A01()     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            if (r6 == 0) goto L_0x179b
            X.0yo r1 = r0.A08     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            X.2GJ r5 = r1.A0M     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            java.lang.String r2 = "gdrive-service/fetch-account-data-v2"
            X.3iA r1 = new X.3iA     // Catch:{ 3iM -> 0x1617, 3iO | 3iQ | 3iS | 3ia -> 0x1639, 3iO | 3iQ | 3iS | 3ia -> 0x1639, 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            r1.<init>(r7, r6)     // Catch:{ 3iM -> 0x1617, 3iO | 3iQ | 3iS | 3ia -> 0x1639, 3iO | 3iQ | 3iS | 3ia -> 0x1639, 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            java.lang.Object r9 = X.AnonymousClass2GS.A00(r1, r5, r2)     // Catch:{ 3iM -> 0x1617, 3iO | 3iQ | 3iS | 3ia -> 0x1639, 3iO | 3iQ | 3iS | 3ia -> 0x1639, 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            X.3BK r9 = (X.AnonymousClass3BK) r9     // Catch:{ 3iM -> 0x1617, 3iO | 3iQ | 3iS | 3ia -> 0x1639, 3iO | 3iQ | 3iS | 3ia -> 0x1639, 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            if (r9 == 0) goto L_0x1617
            java.lang.String r1 = "gdrive-service/fetch-account-data-v2/setting-backup-data-for "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r1)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            java.lang.String r1 = X.AnonymousClass2GK.A0B(r4)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            r2.append(r1)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            java.lang.String r1 = " data: "
            r2.append(r1)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            r2.append(r9)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            X.C13680ns.A1V(r2)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            X.0rz r5 = r0.A0K     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            long r1 = r9.A05     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            r5.A11(r4, r1)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            X.0rz r5 = r0.A0K     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            long r1 = r9.A04     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            r5.A12(r4, r1)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            X.0rz r8 = r0.A0K     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            java.lang.String r2 = "mediaSize"
            r5 = -1
            org.json.JSONObject r7 = r9.A0B     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            if (r7 == 0) goto L_0x15f3
            boolean r1 = r7.has(r2)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            if (r1 == 0) goto L_0x15e8
            long r1 = r7.optLong(r2, r5)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
        L_0x15be:
            r8.A10(r4, r1)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            X.0rz r8 = r0.A0K     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            java.lang.String r2 = "videoSize"
            if (r7 == 0) goto L_0x15e5
            boolean r1 = r7.has(r2)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            if (r1 == 0) goto L_0x15da
            long r1 = r7.optLong(r2, r5)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
        L_0x15d2:
            r8.A13(r4, r1)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            X.0rz r2 = r0.A0K     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            if (r7 != 0) goto L_0x15f8
            goto L_0x15f6
        L_0x15da:
            org.json.JSONObject r1 = r9.A04()     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            if (r1 == 0) goto L_0x15e5
            long r1 = r1.optLong(r2, r5)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            goto L_0x15d2
        L_0x15e5:
            r1 = -1
            goto L_0x15d2
        L_0x15e8:
            org.json.JSONObject r1 = r9.A04()     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            if (r1 == 0) goto L_0x15f3
            long r1 = r1.optLong(r2, r5)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            goto L_0x15be
        L_0x15f3:
            r1 = -1
            goto L_0x15be
        L_0x15f6:
            r1 = 0
            goto L_0x15fe
        L_0x15f8:
            java.lang.String r1 = "encryptedBackupEnabled"
            boolean r1 = r7.optBoolean(r1, r3)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
        L_0x15fe:
            r2.A1C(r4, r1)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            X.12M r1 = r0.A0A
            java.util.Iterator r2 = X.C16590tJ.A00(r1)
        L_0x1607:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x179b
            java.lang.Object r1 = r2.next()
            X.12R r1 = (X.AnonymousClass12R) r1
            r1.AZP()
            goto L_0x1607
        L_0x1617:
            java.lang.String r1 = "gdrive-service/fetch-account-data-v2/no backup found/"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r1)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            r2.append(r6)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            java.lang.String r1 = "/"
            r2.append(r1)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            java.lang.String r1 = X.AnonymousClass2GK.A0B(r4)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r2)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            X.0rz r3 = r0.A0K     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            r1 = 0
            r3.A11(r4, r1)     // Catch:{ 3iO | 3iQ | 3iS | 3ia -> 0x1639 }
            goto L_0x179b
        L_0x1639:
            r2 = move-exception
            java.lang.String r1 = "gdrive-service/handle-intent/action_fetch_backup_info"
            goto L_0x1640
        L_0x163d:
            r2 = move-exception
            java.lang.String r1 = "gdrive-service/v2/list-files failed"
        L_0x1640:
            com.whatsapp.util.Log.e(r1, r2)
            goto L_0x179b
        L_0x1645:
            X.0rz r1 = r0.A0K
            android.content.SharedPreferences$Editor r2 = r1.A0K()
            java.lang.String r1 = "gdrive_last_successful_backup_timestamp:"
            java.lang.String r1 = X.C13680ns.A0h(r1, r3)
            android.content.SharedPreferences$Editor r2 = r2.remove(r1)
            java.lang.String r1 = "gdrive_last_successful_backup_total_size:"
            java.lang.String r1 = X.C13680ns.A0h(r1, r3)
            android.content.SharedPreferences$Editor r2 = r2.remove(r1)
            java.lang.String r1 = "gdrive_last_successful_backup_media_size:"
            java.lang.String r1 = X.C13680ns.A0h(r1, r3)
            android.content.SharedPreferences$Editor r2 = r2.remove(r1)
            java.lang.String r1 = "gdrive_last_successful_backup_video_size:"
            java.lang.String r1 = X.C13680ns.A0h(r1, r3)
            android.content.SharedPreferences$Editor r2 = r2.remove(r1)
            java.lang.String r1 = "gdrive_last_successful_backup_encrypted:"
            java.lang.String r1 = X.C13680ns.A0h(r1, r3)
            X.C13690nt.A0v(r2, r1)
            X.0rz r1 = r0.A0K
            java.lang.String r1 = r1.A0M()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x1699
            android.os.Bundle r2 = r9.getExtras()
            java.lang.String r1 = "remove_account_name"
            boolean r1 = r2.getBoolean(r1)
            if (r1 == 0) goto L_0x1699
            X.0rz r1 = r0.A0K
            r1.A0s(r7)
        L_0x1699:
            X.12M r1 = r0.A0A
            java.util.Iterator r2 = X.C16590tJ.A00(r1)
        L_0x169f:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x179b
            java.lang.Object r1 = r2.next()
            X.12R r1 = (X.AnonymousClass12R) r1
            r1.AZP()
            goto L_0x169f
        L_0x16af:
            if (r6 != 0) goto L_0x16b5
            java.lang.String r1 = "gdrive-service/handle-intent change number requested but new phone number was not passed in the request."
            goto L_0x1788
        L_0x16b5:
            java.lang.String r1 = "gdrive-service/handle-intent about to change number from "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r1)
            r1.append(r5)
            java.lang.String r4 = " to "
            r1.append(r4)
            java.lang.String r1 = X.AnonymousClass000.A0h(r6, r1)
            com.whatsapp.util.Log.i((java.lang.String) r1)
            java.lang.String r8 = "gdrive-service/change-number-v2"
            r10 = 19
            r9 = 11
            r11 = 0
            X.12U r1 = r0.A09     // Catch:{ 3ia -> 0x1743, 3iO -> 0x173c, 3iN | 3iS -> 0x1735, 3ib -> 0x172c, 3iQ -> 0x174f }
            X.2GM r3 = r1.A01(r2, r7)     // Catch:{ 3ia -> 0x1743, 3iO -> 0x173c, 3iN | 3iS -> 0x1735, 3ib -> 0x172c, 3iQ -> 0x174f }
            X.0yo r1 = r0.A08     // Catch:{ 3ia -> 0x1743, 3iO -> 0x173c, 3iN | 3iS -> 0x1735, 3ib -> 0x172c, 3iQ -> 0x174f }
            X.2GJ r1 = r1.A0M     // Catch:{ 3ia -> 0x1743, 3iO -> 0x173c, 3iN | 3iS -> 0x1735, 3ib -> 0x172c, 3iQ -> 0x174f }
            boolean r1 = X.C62173By.A06(r1, r3)     // Catch:{ 3ia -> 0x1743, 3iO -> 0x173c, 3iN | 3iS -> 0x1735, 3ib -> 0x172c, 3iQ -> 0x174f }
            if (r1 != 0) goto L_0x16ec
            java.lang.String r1 = "gdrive-service/change-number/failed-to-fetch-auth-token"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 3ia -> 0x1743, 3iO -> 0x173c, 3iN | 3iS -> 0x1735, 3ib -> 0x172c, 3iQ -> 0x174f }
            X.12U r1 = r0.A09     // Catch:{ 3ia -> 0x1743, 3iO -> 0x173c, 3iN | 3iS -> 0x1735, 3ib -> 0x172c, 3iQ -> 0x174f }
            r1.A05(r9)     // Catch:{ 3ia -> 0x1743, 3iO -> 0x173c, 3iN | 3iS -> 0x1735, 3ib -> 0x172c, 3iQ -> 0x174f }
            goto L_0x175a
        L_0x16ec:
            X.0yo r1 = r0.A08     // Catch:{ 3ia -> 0x1743, 3iO -> 0x173c, 3iN | 3iS -> 0x1735, 3ib -> 0x172c, 3iQ -> 0x174f }
            X.2GJ r2 = r1.A0M     // Catch:{ 3ia -> 0x1743, 3iO -> 0x173c, 3iN | 3iS -> 0x1735, 3ib -> 0x172c, 3iQ -> 0x174f }
            X.3iA r1 = new X.3iA     // Catch:{ 3iM -> 0x1716, 3iN | 3iS -> 0x1735 }
            r1.<init>(r3, r5)     // Catch:{ 3iM -> 0x1716, 3iN | 3iS -> 0x1735 }
            java.lang.Object r3 = X.AnonymousClass2GS.A00(r1, r2, r8)     // Catch:{ 3iM -> 0x1716, 3iN | 3iS -> 0x1735 }
            X.3BK r3 = (X.AnonymousClass3BK) r3     // Catch:{ 3iM -> 0x1716, 3iN | 3iS -> 0x1735 }
            if (r3 == 0) goto L_0x1716
            X.0yo r1 = r0.A08     // Catch:{ 3ia -> 0x1743, 3iO -> 0x173c, 3iN | 3iS -> 0x1735, 3ib -> 0x172c, 3iQ -> 0x174f }
            X.2GJ r2 = r1.A0M     // Catch:{ 3ia -> 0x1743, 3iO -> 0x173c, 3iN | 3iS -> 0x1735, 3ib -> 0x172c, 3iQ -> 0x174f }
            X.2xQ r1 = new X.2xQ     // Catch:{ 3ia -> 0x1743, 3iO -> 0x173c, 3iN | 3iS -> 0x1735, 3ib -> 0x172c, 3iQ -> 0x174f }
            r1.<init>(r0, r3, r6, r5)     // Catch:{ 3ia -> 0x1743, 3iO -> 0x173c, 3iN | 3iS -> 0x1735, 3ib -> 0x172c, 3iQ -> 0x174f }
            java.lang.Object r1 = X.AnonymousClass2GS.A00(r1, r2, r8)     // Catch:{ 3ia -> 0x1743, 3iO -> 0x173c, 3iN | 3iS -> 0x1735, 3ib -> 0x172c, 3iQ -> 0x174f }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ 3ia -> 0x1743, 3iO -> 0x173c, 3iN | 3iS -> 0x1735, 3ib -> 0x172c, 3iQ -> 0x174f }
            if (r1 == 0) goto L_0x175a
            boolean r1 = r1.booleanValue()     // Catch:{ 3ia -> 0x1743, 3iO -> 0x173c, 3iN | 3iS -> 0x1735, 3ib -> 0x172c, 3iQ -> 0x174f }
            if (r1 == 0) goto L_0x175a
            r11 = 1
            goto L_0x175a
        L_0x1716:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0o()     // Catch:{ 3ia -> 0x1743, 3iO -> 0x173c, 3iN | 3iS -> 0x1735, 3ib -> 0x172c, 3iQ -> 0x174f }
            java.lang.String r1 = "gdrive-service/change-number-v2 fetching backup name "
            r2.append(r1)     // Catch:{ 3ia -> 0x1743, 3iO -> 0x173c, 3iN | 3iS -> 0x1735, 3ib -> 0x172c, 3iQ -> 0x174f }
            r2.append(r5)     // Catch:{ 3ia -> 0x1743, 3iO -> 0x173c, 3iN | 3iS -> 0x1735, 3ib -> 0x172c, 3iQ -> 0x174f }
            java.lang.String r1 = " returned null, unexpected."
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r2)     // Catch:{ 3ia -> 0x1743, 3iO -> 0x173c, 3iN | 3iS -> 0x1735, 3ib -> 0x172c, 3iQ -> 0x174f }
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 3ia -> 0x1743, 3iO -> 0x173c, 3iN | 3iS -> 0x1735, 3ib -> 0x172c, 3iQ -> 0x174f }
            goto L_0x175a
        L_0x172c:
            r3 = move-exception
            X.12U r2 = r0.A09
            r1 = 17
            r2.A05(r1)
            goto L_0x1757
        L_0x1735:
            r3 = move-exception
            X.12U r1 = r0.A09
            r1.A05(r10)
            goto L_0x1757
        L_0x173c:
            r3 = move-exception
            X.12U r1 = r0.A09
            r1.A05(r9)
            goto L_0x1757
        L_0x1743:
            r3 = move-exception
            X.12U r2 = r0.A09
            r1 = 12
            r2.A05(r1)
            com.whatsapp.util.Log.e((java.lang.Throwable) r3)
            goto L_0x175a
        L_0x174f:
            r3 = move-exception
            X.12U r2 = r0.A09
            r1 = 25
            r2.A05(r1)
        L_0x1757:
            com.whatsapp.util.Log.e(r8, r3)
        L_0x175a:
            java.lang.String r1 = "gdrive-service/handle-intent change number (from old number "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0q(r1)
            r2.append(r5)
            r2.append(r4)
            if (r11 == 0) goto L_0x1775
            r2.append(r6)
            java.lang.String r1 = ") succeeded."
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r2)
        L_0x1771:
            com.whatsapp.util.Log.i((java.lang.String) r1)
            goto L_0x179b
        L_0x1775:
            r2.append(r6)
            java.lang.String r1 = ") failed."
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r2)
            goto L_0x1788
        L_0x177f:
            r2.append(r9)
            java.lang.String r1 = " accountName is null or empty, cannot proceed further."
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r2)
        L_0x1788:
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x179b
        L_0x178c:
            X.0yo r1 = r0.A08
            r2 = 0
            java.util.concurrent.atomic.AtomicBoolean r1 = r1.A0a
            r1.set(r2)
            X.0rz r1 = r0.A0K
            r1.A0j(r2)
        L_0x1799:
            if (r51 == 0) goto L_0x17b0
        L_0x179b:
            java.lang.Object r3 = r0.A0d
            monitor-enter(r3)
            int r2 = r0.A00     // Catch:{ all -> 0x17ad }
            if (r2 <= 0) goto L_0x17ab
            r1 = 1
            int r2 = r2 - r1
            r0.A00 = r2     // Catch:{ all -> 0x17ad }
            if (r2 != 0) goto L_0x17ab
            r0.stopForeground(r1)     // Catch:{ all -> 0x17ad }
        L_0x17ab:
            monitor-exit(r3)     // Catch:{ all -> 0x17ad }
            return
        L_0x17ad:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x17ad }
            throw r0
        L_0x17b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.backup.google.GoogleBackupService.onHandleIntent(android.content.Intent):void");
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        Notification notification;
        int onStartCommand = super.onStartCommand(intent, i2, i3);
        if (intent == null) {
            return onStartCommand;
        }
        synchronized (this.A0d) {
            Notification A002 = this.A0C.A00(C16980tz.A00(this.A0I), intent.getAction());
            if (!(this.A00 == 0 || (notification = this.A0C.A0R) == null)) {
                A002 = notification;
            }
            this.A0C.A03();
            try {
                startForeground(5, A002);
                this.A00++;
            } catch (IllegalStateException e2) {
                Log.w("Failed to start foreground service GoogleBackupService", e2);
                stopSelf();
            }
        }
        return onStartCommand;
    }
}
