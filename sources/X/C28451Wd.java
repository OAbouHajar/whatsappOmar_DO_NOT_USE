package X;

import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;
import com.obwhatsapp.jobqueue.job.SendPeerMessageJob;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: X.1Wd  reason: invalid class name and case insensitive filesystem */
public class C28451Wd {
    public static final C17930vs A0K;
    public static final String[] A0L = new String[0];
    public final C16300so A00;
    public final C16040sK A01;
    public final C23481Cd A02;
    public final C23501Cf A03;
    public final AnonymousClass25D A04;
    public final AnonymousClass19E A05;
    public final AnonymousClass139 A06;
    public final C23451Ca A07;
    public final AnonymousClass19W A08;
    public final C217515h A09;
    public final AnonymousClass11R A0A;
    public final C16440t3 A0B;
    public final C23471Cc A0C;
    public final AnonymousClass19K A0D;
    public final C19410yO A0E;
    public final AnonymousClass11P A0F;
    public final C20360zv A0G;
    public final C14710pd A0H;
    public final C19830z4 A0I;
    public final C40761ue A0J;

    static {
        AnonymousClass1C5 r2 = new AnonymousClass1C5();
        r2.put(400, 64);
        r2.put(404, 65);
        r2.put(405, 66);
        r2.put(406, 67);
        A0K = r2.build();
    }

    public C28451Wd(C16300so r2, C16040sK r3, C23481Cd r4, C23501Cf r5, AnonymousClass25D r6, AnonymousClass19E r7, AnonymousClass139 r8, C23451Ca r9, AnonymousClass19W r10, C217515h r11, AnonymousClass11R r12, C16440t3 r13, C23471Cc r14, AnonymousClass19K r15, C19410yO r16, AnonymousClass11P r17, C20360zv r18, C14710pd r19, C19830z4 r20, C40761ue r21) {
        this.A0B = r13;
        this.A0H = r19;
        this.A00 = r2;
        this.A01 = r3;
        this.A0D = r15;
        this.A08 = r10;
        this.A09 = r11;
        this.A05 = r7;
        this.A0I = r20;
        this.A0G = r18;
        this.A07 = r9;
        this.A0F = r17;
        this.A0E = r16;
        this.A0C = r14;
        this.A06 = r8;
        this.A02 = r4;
        this.A03 = r5;
        this.A0A = r12;
        this.A0J = r21;
        this.A04 = r6;
    }

    public final void A00() {
        this.A0J.A01();
        AnonymousClass25D r1 = this.A04;
        Log.i("sync-manager/onFailed");
        C18930xU r12 = r1.A00;
        C18930xU.A00(r12, false);
        if (r12.A0W()) {
            r12.A0C.A04();
        }
    }

    public final void A01(C37641pU r5, String str) {
        StringBuilder sb = new StringBuilder("SyncResponseHandler/handleMutationException failed with MutationException, reason ");
        sb.append(r5.reason);
        Log.e(sb.toString(), r5);
        int i2 = r5.reason;
        if (i2 == 0) {
            A02(r5, str, 19);
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else if (i2 == 1) {
            A02(r5, str, 21);
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else if (i2 == 2) {
            A02(r5, str, 23);
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else if (i2 == 3) {
            A02(r5, str, 24);
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else if (i2 == 4) {
            A02(r5, str, 22);
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else if (i2 == 6) {
            this.A05.A01.A06("unsupported_action_counter", 1);
        } else if (i2 == 7) {
            A02(r5, str, 25);
            throw new RuntimeException("Redex: Unreachable code after no-return invoke");
        } else {
            StringBuilder sb2 = new StringBuilder("Unhandled MutationException with reason: ");
            sb2.append(i2);
            throw new RuntimeException(sb2.toString());
        }
    }

    public final void A02(C37641pU r5, String str, int i2) {
        this.A00.AcB("malformed_syncd_mutation", r5.getMessage(), false);
        this.A05.A01.A06("invalid_action_counter", 1);
        throw new AnonymousClass1X9(i2, str);
    }

    public void A03(Integer num, String str) {
        String str2;
        StringBuilder sb = new StringBuilder("SyncResponseHandler/fatalFailure reason:");
        Integer num2 = num;
        sb.append(num == null ? null : num2.toString());
        Log.e(sb.toString());
        C16300so r2 = this.A00;
        StringBuilder sb2 = new StringBuilder("errorCode:");
        sb2.append(num2);
        sb2.append("; collectionName:");
        String str3 = str;
        sb2.append(str3);
        r2.AcB("app-sate-sync-handle-fatal-exception", sb2.toString(), false);
        if (num != null) {
            AnonymousClass19E r4 = this.A05;
            int intValue = num2.intValue();
            C74913rJ r1 = new C74913rJ();
            r1.A02 = Integer.valueOf(intValue);
            r1.A01 = AnonymousClass19E.A03(str3);
            r1.A00 = true;
            r4.A06.A06(r1);
        }
        this.A0J.A01();
        this.A06.A01().edit().remove("first_transient_server_failure_timestamp").apply();
        AnonymousClass25D r22 = this.A04;
        StringBuilder sb3 = new StringBuilder("sync-manager/onFatalFailure for collection ");
        sb3.append(str3);
        Log.i(sb3.toString());
        C18930xU r23 = r22.A00;
        r23.A0C.A04();
        C18930xU.A00(r23, false);
        Iterator it = r23.A0Q.A01().iterator();
        while (it.hasNext()) {
            it.next();
        }
        synchronized (r23) {
            r23.A02 = null;
        }
        if (!r23.A07.A0G()) {
            r23.A0P(1);
            return;
        }
        C23491Ce r42 = r23.A0G;
        C16040sK r24 = r42.A00;
        AnonymousClass00B.A0C("method should only be called by a device in companion mode", r24.A0G());
        AnonymousClass11R r6 = r42.A03;
        r6.A00().edit().putBoolean("companion_syncd_dirty", true).apply();
        r24.A0B();
        AnonymousClass1ZT r25 = r24.A05;
        if (r25 == null) {
            str2 = "CompanionSyncdFatalHandler/my user jid is null.";
        } else {
            try {
                DeviceJid fromUserJidAndDeviceId = DeviceJid.getFromUserJidAndDeviceId(r25, 0);
                C222617g r12 = r42.A06;
                C16440t3 r0 = r42.A04;
                C37621pS r10 = new C37621pS(r12.A05.A02(r25, true), Collections.singleton(str3), r0.A00(), r0.A00());
                r10.A00 = fromUserJidAndDeviceId;
                if (r42.A05.A01(r10) < 0) {
                    str2 = "CompanionSyncdFatalHandler/failed to add peer message";
                } else {
                    r42.A01.A00(new SendPeerMessageJob(fromUserJidAndDeviceId, r10, (byte[]) null, 0));
                    SystemClock.sleep(5000);
                    int i2 = r6.A00().getInt("companion_syncd_critical_bootstrap_state", 0);
                    boolean z2 = true;
                    if (!(i2 == 1 || i2 == 2)) {
                        z2 = false;
                    }
                    r42.A02.A00(z2 ? "syncd_error_during_bootstrap" : "syncd_failure", true, true);
                    return;
                }
            } catch (AnonymousClass1W4 unused) {
                Log.e("CompanionSyncdFatalHandler/cannot get primary device jid.");
                return;
            }
        }
        Log.e(str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0069, code lost:
        if (r10 != false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(java.lang.Long r8, boolean r9, boolean r10) {
        /*
            r7 = this;
            if (r9 == 0) goto L_0x0069
            X.139 r6 = r7.A06
            android.content.SharedPreferences r0 = r6.A01()
            java.lang.String r5 = "first_transient_server_failure_timestamp"
            r3 = 0
            long r1 = r0.getLong(r5, r3)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0053
            long r1 = java.lang.System.currentTimeMillis()
            android.content.SharedPreferences r0 = r6.A01()
            android.content.SharedPreferences$Editor r0 = r0.edit()
            android.content.SharedPreferences$Editor r0 = r0.putLong(r5, r1)
            r0.apply()
        L_0x0027:
            if (r8 == 0) goto L_0x0096
            X.25D r2 = r7.A04
            long r3 = r8.longValue()
            java.lang.String r1 = "sync-manager/onRetryNeeded "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0xU r5 = r2.A00
            r0 = 0
            X.C18930xU.A00(r5, r0)
            boolean r0 = r5.A0W()
            if (r0 == 0) goto L_0x006c
            X.11Q r0 = r5.A0C
            r0.A04()
            return
        L_0x0053:
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r1
            r1 = 604800000(0x240c8400, double:2.988109026E-315)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0027
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 0
            r7.A03(r1, r0)
            return
        L_0x0069:
            if (r10 == 0) goto L_0x0096
            goto L_0x0027
        L_0x006c:
            monitor-enter(r5)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0093 }
            r1.<init>()     // Catch:{ all -> 0x0093 }
            java.lang.String r0 = "sync-manager/scheduleSync with delay "
            r1.append(r0)     // Catch:{ all -> 0x0093 }
            r1.append(r3)     // Catch:{ all -> 0x0093 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0093 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0093 }
            X.0sq r2 = r5.A0n     // Catch:{ all -> 0x0093 }
            java.lang.String r1 = "SyncManager/scheduleSync"
            com.whatsapp.util.RunnableTRunnableShape0S0100000_I0 r0 = new com.whatsapp.util.RunnableTRunnableShape0S0100000_I0     // Catch:{ all -> 0x0093 }
            r0.<init>(r5)     // Catch:{ all -> 0x0093 }
            java.lang.Runnable r0 = r2.Ad4(r0, r1, r3)     // Catch:{ all -> 0x0093 }
            r5.A04 = r0     // Catch:{ all -> 0x0093 }
            monitor-exit(r5)     // Catch:{ all -> 0x0093 }
            return
        L_0x0093:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0093 }
            throw r0
        L_0x0096:
            r7.A00()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28451Wd.A04(java.lang.Long, boolean, boolean):void");
    }

    public void A05(Throwable th) {
        boolean z2;
        boolean z3;
        Long A002;
        if (th instanceof AnonymousClass1X9) {
            AnonymousClass1X9 r5 = (AnonymousClass1X9) th;
            A03(Integer.valueOf(r5.errorCode), r5.collectionName);
        } else if (th instanceof AnonymousClass1XT) {
            A00();
        } else {
            if (th instanceof AnonymousClass259) {
                z2 = ((AnonymousClass259) th).isServerTransient;
                z3 = !z2;
                A002 = this.A0J.A00();
            } else {
                boolean z4 = th instanceof SQLiteFullException;
                z2 = false;
                z3 = true;
                A002 = this.A0J.A00();
                if (!z4) {
                    A04(A002, true, false);
                    return;
                }
            }
            A04(A002, z2, z3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007c, code lost:
        if (r10 != 0) goto L_0x007e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(java.util.List r26) {
        /*
            r25 = this;
            java.util.Iterator r16 = r26.iterator()
        L_0x0004:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x02a9
            java.lang.Object r5 = r16.next()
            X.4M7 r5 = (X.AnonymousClass4M7) r5
            java.lang.String r0 = r5.A01
            java.lang.String r1 = "SyncResponseHandler/handleIncomingPatches for collection="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            r2.append(r0)
            java.lang.String r1 = "; size="
            r2.append(r1)
            java.util.List r6 = r5.A02
            int r1 = r6.size()
            r2.append(r1)
            java.lang.String r1 = "; hasMorePatch="
            r2.append(r1)
            boolean r9 = r5.A03
            r2.append(r9)
            java.lang.String r1 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r1)
            r4 = r25
            X.0sK r12 = r4.A01
            boolean r1 = r12.A0G()
            r3 = 0
            if (r1 == 0) goto L_0x0061
            X.11P r1 = r4.A0F
            java.lang.Long r7 = r1.A00(r0)
            X.11R r1 = r4.A0A
            android.content.SharedPreferences r2 = r1.A00()
            java.lang.String r1 = "companion_syncd_critical_bootstrap_state"
            int r2 = r2.getInt(r1, r3)
            r1 = 1
            if (r2 == r1) goto L_0x0242
            r1 = 2
            if (r2 == r1) goto L_0x0242
            if (r7 != 0) goto L_0x0061
        L_0x0060:
            r3 = 1
        L_0x0061:
            X.1XB r5 = r5.A00
            java.lang.String r7 = " with version: "
            if (r5 == 0) goto L_0x016c
            X.11P r1 = r4.A0F
            java.lang.Long r1 = r1.A00(r0)
            r13 = 0
            if (r1 != 0) goto L_0x0161
            r10 = 0
        L_0x0073:
            boolean r1 = r12.A0G()
            if (r1 == 0) goto L_0x007e
            int r1 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            r2 = 1
            if (r1 == 0) goto L_0x007f
        L_0x007e:
            r2 = 0
        L_0x007f:
            java.lang.String r1 = "Only companion devices that are undergoing bootstrap should receive and handle snapshots."
            X.AnonymousClass00B.A0C(r1, r2)
            X.0t3 r1 = r4.A0B
            long r21 = r1.A00()
            X.1Cf r1 = r4.A03     // Catch:{ Exception -> 0x026c }
            X.257 r11 = new X.257     // Catch:{ Exception -> 0x026c }
            r11.<init>(r1, r5, r0)     // Catch:{ Exception -> 0x026c }
            r1 = 1
            X.C23501Cf.A00(r11, r0, r1)     // Catch:{ Exception -> 0x026c }
            java.io.File r10 = r11.A00     // Catch:{ 1bD -> 0x025e, IOException -> 0x0250 }
            byte[] r2 = X.C29301aP.A00(r10)     // Catch:{ 1bD -> 0x025e, IOException -> 0x0250 }
            X.2Mn r1 = X.C48272Mn.A05     // Catch:{ 1bD -> 0x025e, IOException -> 0x0250 }
            X.1Wm r8 = X.C28541Wm.A0E(r1, r2)     // Catch:{ 1bD -> 0x025e, IOException -> 0x0250 }
            X.2Mn r8 = (X.C48272Mn) r8     // Catch:{ 1bD -> 0x025e, IOException -> 0x0250 }
            java.io.File r1 = r11.A01     // Catch:{ 1bD -> 0x025e, IOException -> 0x0250 }
            boolean r1 = r1.delete()     // Catch:{ 1bD -> 0x025e, IOException -> 0x0250 }
            if (r1 == 0) goto L_0x00ae
            r10.delete()     // Catch:{ 1bD -> 0x025e, IOException -> 0x0250 }
        L_0x00ae:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ 1bD -> 0x025e, IOException -> 0x0250 }
            r2.<init>()     // Catch:{ 1bD -> 0x025e, IOException -> 0x0250 }
            java.lang.String r1 = "external-mutations-downloader: downloaded snapshot= "
            r2.append(r1)     // Catch:{ 1bD -> 0x025e, IOException -> 0x0250 }
            r2.append(r8)     // Catch:{ 1bD -> 0x025e, IOException -> 0x0250 }
            java.lang.String r1 = r2.toString()     // Catch:{ 1bD -> 0x025e, IOException -> 0x0250 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ 1bD -> 0x025e, IOException -> 0x0250 }
            if (r3 == 0) goto L_0x00d3
            X.1Cd r1 = r4.A02     // Catch:{ Exception -> 0x026c }
            r23 = 1
            r19 = 0
            r18 = r5
            r20 = r0
            r17 = r1
            r17.A01(r18, r19, r20, r21, r23)     // Catch:{ Exception -> 0x026c }
        L_0x00d3:
            int r1 = r8.A00
            r5 = 1
            r1 = r1 & 1
            if (r1 != r5) goto L_0x0167
            X.1jt r1 = r8.A04
            r2 = r1
            if (r1 != 0) goto L_0x00e1
            X.1jt r1 = X.C34211jt.A02
        L_0x00e1:
            int r1 = r1.A00
            r1 = r1 & 1
            if (r1 != r5) goto L_0x0167
            if (r2 != 0) goto L_0x00eb
            X.1jt r2 = X.C34211jt.A02
        L_0x00eb:
            long r1 = r2.A01
            java.lang.String r10 = "SyncResponseHandler/handleIncomingPatches applying snapshot for collection "
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r10)
            r5.append(r0)
            r5.append(r7)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r5)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            X.1XE r5 = r8.A02
            java.util.Iterator r15 = r5.iterator()
        L_0x010f:
            boolean r5 = r15.hasNext()
            if (r5 == 0) goto L_0x014b
            java.lang.Object r13 = r15.next()
            X.1X2 r13 = (X.AnonymousClass1X2) r13
            X.1X3 r5 = X.AnonymousClass1X3.A03
            X.1Wr r12 = r5.A0U()
            X.1X4 r14 = X.AnonymousClass1X4.A02
            r12.A03()
            X.1Wm r10 = r12.A00
            X.1X3 r10 = (X.AnonymousClass1X3) r10
            int r5 = r10.A00
            r5 = r5 | 1
            r10.A00 = r5
            int r5 = r14.value
            r10.A01 = r5
            r12.A03()
            X.1Wm r10 = r12.A00
            X.1X3 r10 = (X.AnonymousClass1X3) r10
            r10.A02 = r13
            int r5 = r10.A00
            r5 = r5 | 2
            r10.A00 = r5
            X.1Wm r5 = r12.A02()
            r11.add(r5)
            goto L_0x010f
        L_0x014b:
            r18 = 0
            r22 = r1
            r24 = r3
            r20 = r0
            r21 = r11
            r19 = r8
            r17 = r4
            boolean r1 = r17.A07(r18, r19, r20, r21, r22, r24)
            if (r1 != 0) goto L_0x016c
            goto L_0x0004
        L_0x0161:
            long r10 = r1.longValue()
            goto L_0x0073
        L_0x0167:
            java.lang.String r1 = "SyncResponseHandler/handleIncomingPatches snapshot has no version, cannot apply"
            com.whatsapp.util.Log.e((java.lang.String) r1)
        L_0x016c:
            java.util.Iterator r13 = r6.iterator()
        L_0x0170:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x0239
            java.lang.Object r8 = r13.next()
            X.1XC r8 = (X.AnonymousClass1XC) r8
            int r1 = r8.A00
            r5 = 1
            r1 = r1 & 1
            if (r1 != r5) goto L_0x0232
            X.1jt r1 = r8.A08
            r2 = r1
            if (r1 != 0) goto L_0x018a
            X.1jt r1 = X.C34211jt.A02
        L_0x018a:
            int r1 = r1.A00
            r1 = r1 & 1
            if (r1 != r5) goto L_0x0232
            if (r2 != 0) goto L_0x0194
            X.1jt r2 = X.C34211jt.A02
        L_0x0194:
            long r1 = r2.A01
            java.lang.String r6 = "SyncResponseHandler/handleIncomingPatches applying patch for collection "
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r6)
            r5.append(r0)
            r5.append(r7)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            com.whatsapp.util.Log.i((java.lang.String) r5)
            X.0t3 r5 = r4.A0B
            long r21 = r5.A00()
            int r5 = r8.A00     // Catch:{ Exception -> 0x0296 }
            r6 = 2
            r5 = r5 & 2
            if (r5 != r6) goto L_0x01fb
            X.1Cf r6 = r4.A03     // Catch:{ Exception -> 0x0296 }
            X.1XB r5 = r8.A06     // Catch:{ Exception -> 0x0296 }
            if (r5 != 0) goto L_0x01c2
            X.1XB r5 = X.AnonymousClass1XB.A07     // Catch:{ Exception -> 0x0296 }
        L_0x01c2:
            X.257 r12 = new X.257     // Catch:{ Exception -> 0x0296 }
            r12.<init>(r6, r5, r0)     // Catch:{ Exception -> 0x0296 }
            r5 = 0
            X.C23501Cf.A00(r12, r0, r5)     // Catch:{ Exception -> 0x0296 }
            java.io.File r11 = r12.A00     // Catch:{ 1bD -> 0x0288, IOException -> 0x027a }
            byte[] r6 = X.C29301aP.A00(r11)     // Catch:{ 1bD -> 0x0288, IOException -> 0x027a }
            X.1XD r5 = X.AnonymousClass1XD.A01     // Catch:{ 1bD -> 0x0288, IOException -> 0x027a }
            X.1Wm r10 = X.C28541Wm.A0E(r5, r6)     // Catch:{ 1bD -> 0x0288, IOException -> 0x027a }
            X.1XD r10 = (X.AnonymousClass1XD) r10     // Catch:{ 1bD -> 0x0288, IOException -> 0x027a }
            java.io.File r5 = r12.A01     // Catch:{ 1bD -> 0x0288, IOException -> 0x027a }
            boolean r5 = r5.delete()     // Catch:{ 1bD -> 0x0288, IOException -> 0x027a }
            if (r5 == 0) goto L_0x01e4
            r11.delete()     // Catch:{ 1bD -> 0x0288, IOException -> 0x027a }
        L_0x01e4:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ 1bD -> 0x0288, IOException -> 0x027a }
            r6.<init>()     // Catch:{ 1bD -> 0x0288, IOException -> 0x027a }
            java.lang.String r5 = "external-mutations-downloader: downloaded mutations= "
            r6.append(r5)     // Catch:{ 1bD -> 0x0288, IOException -> 0x027a }
            r6.append(r10)     // Catch:{ 1bD -> 0x0288, IOException -> 0x027a }
            java.lang.String r5 = r6.toString()     // Catch:{ 1bD -> 0x0288, IOException -> 0x027a }
            com.whatsapp.util.Log.i((java.lang.String) r5)     // Catch:{ 1bD -> 0x0288, IOException -> 0x027a }
            X.1XE r10 = r10.A00     // Catch:{ Exception -> 0x0296 }
            goto L_0x01fd
        L_0x01fb:
            X.1XE r10 = r8.A04     // Catch:{ Exception -> 0x0296 }
        L_0x01fd:
            if (r3 == 0) goto L_0x020e
            X.1Cd r5 = r4.A02     // Catch:{ Exception -> 0x0296 }
            r23 = 1
            r18 = 0
            r17 = r5
            r19 = r8
            r20 = r0
            r17.A01(r18, r19, r20, r21, r23)     // Catch:{ Exception -> 0x0296 }
        L_0x020e:
            X.19E r11 = r4.A05
            int r5 = r10.size()
            long r5 = (long) r5
            X.139 r12 = r11.A01
            java.lang.String r11 = "mutation_counter"
            r12.A06(r11, r5)
            r19 = 0
            r22 = r1
            r24 = r3
            r20 = r0
            r21 = r10
            r18 = r8
            r17 = r4
            boolean r1 = r17.A07(r18, r19, r20, r21, r22, r24)
            if (r1 != 0) goto L_0x0170
            goto L_0x0004
        L_0x0232:
            java.lang.String r1 = "SyncResponseHandler/handleIncomingPatches incoming patch has no version. Cannot apply."
            com.whatsapp.util.Log.e((java.lang.String) r1)
            goto L_0x0170
        L_0x0239:
            if (r9 != 0) goto L_0x0004
            X.11P r1 = r4.A0F
            r1.A02(r0)
            goto L_0x0004
        L_0x0242:
            if (r7 == 0) goto L_0x0060
            long r10 = r7.longValue()
            r7 = 0
            int r1 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r1 != 0) goto L_0x0061
            goto L_0x0060
        L_0x0250:
            r6 = move-exception
            java.lang.String r1 = "external-mutations-downloader/failed to read snapshot"
            com.whatsapp.util.Log.e(r1, r6)     // Catch:{ Exception -> 0x026c }
            java.lang.String r2 = "Failed to read snapshot from file"
            X.1XT r1 = new X.1XT     // Catch:{ Exception -> 0x026c }
            r1.<init>(r2, r6)     // Catch:{ Exception -> 0x026c }
            throw r1     // Catch:{ Exception -> 0x026c }
        L_0x025e:
            r2 = move-exception
            java.lang.String r1 = "external-mutations-downloader/failed to parse snapshot into ProtoBuf"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ Exception -> 0x026c }
            r2 = 70
            X.1X9 r1 = new X.1X9     // Catch:{ Exception -> 0x026c }
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x026c }
            throw r1     // Catch:{ Exception -> 0x026c }
        L_0x026c:
            r2 = move-exception
            if (r3 == 0) goto L_0x02a8
            X.1Cd r4 = r4.A02
            r10 = 0
            r6 = 0
            r7 = r0
            r8 = r21
            r4.A01(r5, r6, r7, r8, r10)
            throw r2
        L_0x027a:
            r5 = move-exception
            java.lang.String r1 = "external-mutations-downloader/failed to read mutations"
            com.whatsapp.util.Log.e(r1, r5)     // Catch:{ Exception -> 0x0296 }
            java.lang.String r2 = "Failed to read mutations from file"
            X.1XT r1 = new X.1XT     // Catch:{ Exception -> 0x0296 }
            r1.<init>(r2, r5)     // Catch:{ Exception -> 0x0296 }
            throw r1     // Catch:{ Exception -> 0x0296 }
        L_0x0288:
            r2 = move-exception
            java.lang.String r1 = "external-mutations-downloader/failed to parse mutations into ProtoBuf"
            com.whatsapp.util.Log.e(r1, r2)     // Catch:{ Exception -> 0x0296 }
            r2 = 26
            X.1X9 r1 = new X.1X9     // Catch:{ Exception -> 0x0296 }
            r1.<init>(r2, r0)     // Catch:{ Exception -> 0x0296 }
            throw r1     // Catch:{ Exception -> 0x0296 }
        L_0x0296:
            r2 = move-exception
            if (r3 == 0) goto L_0x02a8
            X.1Cd r1 = r4.A02
            r23 = 0
            r18 = 0
            r17 = r1
            r19 = r8
            r20 = r0
            r17.A01(r18, r19, r20, r21, r23)
        L_0x02a8:
            throw r2
        L_0x02a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28451Wd.A06(java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0164, code lost:
        if ((r2.A00 & 16) != 16) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0166, code lost:
        r3 = r2.A07;
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0169, code lost:
        if (r3 != null) goto L_0x016d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x016b, code lost:
        r3 = X.AnonymousClass1X1.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0171, code lost:
        if ((r3.A00 & 1) != 1) goto L_0x0174;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0174, code lost:
        com.whatsapp.util.Log.e("SyncResponseHandler/applyMutations missing patch key");
        r4 = new X.AnonymousClass1X9(56, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0182, code lost:
        if (r47 == null) goto L_0x01a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0189, code lost:
        if ((r6.A00 & 4) != 4) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x018b, code lost:
        r3 = r6.A03;
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x018e, code lost:
        if (r3 != null) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0190, code lost:
        r3 = X.AnonymousClass1X1.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0196, code lost:
        if ((r3.A00 & 1) != 1) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0198, code lost:
        if (r4 != null) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x019b, code lost:
        com.whatsapp.util.Log.e("SyncResponseHandler/applyMutations missing snapshot key");
        r4 = new X.AnonymousClass1X9(59, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01a9, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01ab, code lost:
        r4 = X.AnonymousClass1X1.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01ad, code lost:
        r4 = new X.AnonymousClass1WK(r4.A01.A04());
        r13.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01bb, code lost:
        r34 = r1.A08.A02(r0, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01c7, code lost:
        if (r34.containsValue((java.lang.Object) null) == false) goto L_0x01d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01c9, code lost:
        com.whatsapp.util.Log.i("SyncResponseHandler/applyMutations keyMap contains null value, retry");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01ce, code lost:
        r20.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01d3, code lost:
        r33 = r34.get(r4);
        X.AnonymousClass00B.A06(r33);
        r33 = (X.AnonymousClass1WY) r33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01e2, code lost:
        if (r46 == null) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01e4, code lost:
        r4 = r1.A07;
        r10 = r2.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01ec, code lost:
        if ((r10 & 8) != 8) goto L_0x086c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01f1, code lost:
        if ((r10 & 4) != 4) goto L_0x085e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:?, code lost:
        r10 = r2.A02.A04();
        r26 = r2.A03.A04();
        r11 = new java.util.LinkedList();
        r9 = r35.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x020c, code lost:
        if (r9.hasNext() == false) goto L_0x021a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x020e, code lost:
        r11.add(((X.C28651Wy) r9.next()).A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x021a, code lost:
        r9 = r4.A08;
        r3 = r2.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x021e, code lost:
        if (r3 != null) goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0220, code lost:
        r3 = X.C34211jt.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0238, code lost:
        if (java.util.Arrays.equals(r10, r9.A03(r33, r0, X.C28641Wx.A03(r11), r26, r3.A01)) == false) goto L_0x0842;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x023a, code lost:
        com.whatsapp.util.Log.i("SyncEncryptionHelper/validatePatchMac/patch mac validated");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:?, code lost:
        r28 = new java.util.HashSet();
        r32 = new java.util.HashSet();
        r27 = new java.util.HashSet();
        r31 = new java.util.ArrayList();
        r30 = new java.util.ArrayList();
        r29 = new java.util.ArrayList();
        r25 = new java.util.ArrayList();
        r26 = new java.util.HashMap();
        r24 = r35.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x026f, code lost:
        if (r24.hasNext() == false) goto L_0x047b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0271, code lost:
        r9 = (X.C28651Wy) r24.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:?, code lost:
        r3 = r9.A01;
        r38 = r3;
        r4 = r34.get(r3);
        X.AnonymousClass00B.A06(r4);
        r4 = (X.AnonymousClass1WY) r4;
        r15 = r1.A0C;
        r12 = r9.A02;
        r3 = X.C28641Wx.A06(r12, 16, (r12.length - 32) - 16, 32);
        r14 = r3[0];
        r13 = r3[1];
        r23 = r3[2];
        r22 = r15.A00.A00(r4.A00);
        r10 = X.C28641Wx.A04(r14, r13);
        r3 = r9.A00;
        r37 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        if (r47 == null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02ca, code lost:
        if (java.util.Arrays.equals(r23, r15.A04(r4.A01, r3.A01, r22.A04, r10)) == false) goto L_0x0457;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x02cc, code lost:
        r4 = X.C23471Cc.A01(r14, r13, r22.A03, 2);
        r15 = r9.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:?, code lost:
        r12 = (X.C28571Wq) X.C28541Wm.A0E(X.C28571Wq.A05, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x02df, code lost:
        if (r12 == null) goto L_0x0363;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:?, code lost:
        r3 = r12.A00;
        r13 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x02e8, code lost:
        if ((r3 & 8) != 8) goto L_0x02eb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x02ea, code lost:
        r13 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x02ed, code lost:
        if (r13 == false) goto L_0x02f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x02ef, code lost:
        r40 = java.lang.Integer.valueOf(r12.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x02f6, code lost:
        r40 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02fa, code lost:
        if ((r3 & 1) != 1) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02fd, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0300, code lost:
        r3 = r12.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0302, code lost:
        if (r3 == null) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0304, code lost:
        r14 = X.C28601Wt.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x030a, code lost:
        if (r3.A03() != 0) goto L_0x031b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x030c, code lost:
        r4 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0312, code lost:
        if ((r12.A00 & 2) != 2) goto L_0x032d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0314, code lost:
        r3 = r12.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0316, code lost:
        if (r3 != null) goto L_0x032f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0318, code lost:
        r3 = X.C28531Wl.A0X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x031b, code lost:
        r3 = (X.C28611Wu) r3;
        r4 = new java.lang.String(r3.bytes, r3.A05(), r3.A03(), r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x032d, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x032f, code lost:
        if (r40 == null) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0331, code lost:
        if (r4 == null) goto L_0x0349;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0333, code lost:
        if (r3 != null) goto L_0x0387;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0339, code lost:
        if (r37 == X.C28481Wg.A02) goto L_0x03a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x033b, code lost:
        r36 = new X.C37641pU(r37, r38, (X.C28531Wl) null, r40, r4, r15, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0349, code lost:
        r36 = new X.C37641pU(r37, r38, r3, r40, (java.lang.String) null, r15, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0355, code lost:
        r36 = new X.C37641pU(r37, r38, r3, r40, r4, r15, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0363, code lost:
        r36 = new X.C37641pU(r37, (X.AnonymousClass1WK) null, (X.C28531Wl) null, (java.lang.Integer) null, (java.lang.String) null, r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:?, code lost:
        r36 = new X.C37641pU(r37, (X.AnonymousClass1WK) null, (X.C28531Wl) null, (java.lang.Integer) null, (java.lang.String) null, r15, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x038b, code lost:
        if (r3.A0c() != false) goto L_0x03a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0391, code lost:
        if (r37 == X.C28481Wg.A02) goto L_0x03a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0393, code lost:
        r36 = new X.C37641pU(r37, r38, r3, r40, r4, r15, 7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:?, code lost:
        r36 = new X.C37641pU(r37, r38, r3, r40, r4, r15, 4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x03b4, code lost:
        r36 = new X.C28501Wi(r37, r38, r3, r4, r15, X.C28501Wi.A01(r4), r40.intValue());
        r11 = r36.A04;
        r3 = X.C23471Cc.A00(com.facebook.msys.mci.DefaultCrypto.HMAC_SHA256, r11.getBytes(X.AnonymousClass01S.A0A), r22.A00);
        r4 = r9.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x03dd, code lost:
        if (java.util.Arrays.equals(r4, r3) == false) goto L_0x045f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x03df, code lost:
        r26.put(r11, r4);
        r4 = r36.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x03ea, code lost:
        if (r4 != X.C28481Wg.A03) goto L_0x0407;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x03ec, code lost:
        r31.add(r36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x03f7, code lost:
        if (r32.add(r11) != false) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x03f9, code lost:
        com.whatsapp.util.Log.e("SyncResponseHandler/applyMutations same index for multi set mutations");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x03fe, code lost:
        if (r46 == null) goto L_0x0401;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0401, code lost:
        r3 = new X.AnonymousClass1X9(68, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0409, code lost:
        if (r4 != X.C28481Wg.A02) goto L_0x0441;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x040b, code lost:
        r3 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0417, code lost:
        if (r36.A06[0].equals("contact") == false) goto L_0x041b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0419, code lost:
        r3 = r29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x041b, code lost:
        r3.add(r36);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0424, code lost:
        if (r27.add(r11) != false) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0426, code lost:
        com.whatsapp.util.Log.e("SyncResponseHandler/applyMutations same index for multi remove mutations");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x042b, code lost:
        if (r46 == null) goto L_0x0434;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x042d, code lost:
        r3 = new X.AnonymousClass1X9(6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0434, code lost:
        r3 = new X.AnonymousClass1X9(68, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x043a, code lost:
        r3 = new X.AnonymousClass1X9(6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0440, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0441, code lost:
        r9 = new java.lang.StringBuilder();
        r9.append("SyncResponseHandler/applyMutations: Unknown operation ");
        r9.append(r4);
        com.whatsapp.util.Log.e(r9.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0457, code lost:
        r4 = new X.C73983pW("Data mac corrupt");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x045f, code lost:
        r4 = new X.C73983pW("Index hash corrupt");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0466, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x047b, code lost:
        r4 = r1.A0H;
        r11 = X.C16620tM.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0485, code lost:
        if (r4.A0E(r11, 624) == false) goto L_0x0498;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0487, code lost:
        android.text.TextUtils.join(org.apache.commons.io.IOUtils.LINE_SEPARATOR_UNIX, r30);
        android.text.TextUtils.join(org.apache.commons.io.IOUtils.LINE_SEPARATOR_UNIX, r29);
        android.text.TextUtils.join(org.apache.commons.io.IOUtils.LINE_SEPARATOR_UNIX, r31);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0498, code lost:
        r4 = new java.util.ArrayList();
        r4.addAll(r28);
        r4.addAll(r32);
        r4.addAll(r27);
        r28.size();
        r32.size();
        r27.size();
        r10 = r1.A07;
        r13 = (java.lang.String[]) r4.toArray(A0L);
        r12 = new java.util.ArrayList();
        r9 = new java.util.ArrayList();
        r15 = r35.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x04d1, code lost:
        if (r15.hasNext() == false) goto L_0x04ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x04d3, code lost:
        r4 = (X.C28651Wy) r15.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x04dd, code lost:
        if (r4.A00 != X.C28481Wg.A03) goto L_0x04cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x04df, code lost:
        r12.add(r4.A04);
        r9.add(r4.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x04ea, code lost:
        r27 = r10.A02(r0, r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x04f0, code lost:
        if (r46 == null) goto L_0x0594;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x04f2, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x04f8, code lost:
        if ((r2.A00 & 4) != 4) goto L_0x04fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x04fa, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x04fb, code lost:
        X.AnonymousClass00B.A0G(r9);
        r12 = r2.A03.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:?, code lost:
        r9 = r10.A08;
        r3 = r2.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0508, code lost:
        if (r3 != null) goto L_0x050c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x050a, code lost:
        r3 = X.C34211jt.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0520, code lost:
        if (java.util.Arrays.equals(r12, r9.A02(r33, r0, r27, r3.A01)) != false) goto L_0x058e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0522, code lost:
        r4 = r10.A0B;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x052a, code lost:
        if (r4.A0E(r11, 2007) != false) goto L_0x0533;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x052c, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/validateSnapshotMac/snapshot mac mismatch and throw fatal error");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0533, code lost:
        com.whatsapp.util.Log.w("SyncEncryptionHelper/validateSnapshotMac/snapshot mac mismatch but do not throw fatal");
        r10 = r10.A05;
        r3 = r10.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x054e, code lost:
        if (((1 << X.AnonymousClass1RQ.A00(r0)) & r3.A01().getInt("syncd_has_logged_snapshot_mac_mismatch_in_patch", 0)) != 0) goto L_0x058e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0550, code lost:
        r3.A01().edit().putInt("syncd_has_logged_snapshot_mac_mismatch_in_patch", (1 << X.AnonymousClass1RQ.A00(r0)) | r3.A01().getInt("syncd_has_logged_snapshot_mac_mismatch_in_patch", 0)).apply();
        r9 = r10.A00;
        r4 = new X.C74913rJ();
        r4.A02 = 60;
        r4.A01 = X.AnonymousClass19E.A03(r0);
        r4.A00 = false;
        r9.A06.A06(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x058e, code lost:
        com.whatsapp.util.Log.i("SyncEncryptionHelper/validateSnapshotMac/snapshot mac validated");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x0594, code lost:
        if (r47 == null) goto L_0x05c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:?, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x059c, code lost:
        if ((r6.A00 & 2) != 2) goto L_0x059f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x059e, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x059f, code lost:
        X.AnonymousClass00B.A0G(r9);
        r9 = r6.A01.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:?, code lost:
        r10 = r10.A08;
        r3 = r6.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x05ac, code lost:
        if (r3 != null) goto L_0x05b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x05ae, code lost:
        r3 = X.C34211jt.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x05c0, code lost:
        if (java.util.Arrays.equals(r9, r10.A02(r33, r0, r27, r3.A01)) == false) goto L_0x08ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x05c2, code lost:
        com.whatsapp.util.Log.i("SyncEncryptionHelper/validateSnapshotMac/snapshot mac validated");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x05cb, code lost:
        if (r30.isEmpty() != false) goto L_0x060a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x05cd, code lost:
        r10 = r1.A0G.A01.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:?, code lost:
        r12 = r10.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:?, code lost:
        r9 = r10.A02;
        r4 = new java.util.LinkedHashSet();
        r11 = r30.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x05e8, code lost:
        if (r11.hasNext() == false) goto L_0x05f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x05ea, code lost:
        r4.add(((X.C28501Wi) r11.next()).A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x05f6, code lost:
        X.C20360zv.A02(r9, (java.lang.String[]) r4.toArray(X.AnonymousClass1XA.A00));
        r12.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x060a, code lost:
        r26 = new java.util.ArrayList();
        r10 = r29.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0617, code lost:
        if (r10.hasNext() == false) goto L_0x063d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0619, code lost:
        r9 = (X.C28501Wi) r10.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x0627, code lost:
        if (r32.contains(r9.A04) != false) goto L_0x0613;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0629, code lost:
        r26.add(r7.A01(r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0633, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:?, code lost:
        A01(r4, r0);
        r25.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x063d, code lost:
        r9 = r31.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x0645, code lost:
        if (r9.hasNext() == false) goto L_0x0661;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:?, code lost:
        r26.add(r7.A01((X.C28501Wi) r9.next()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0657, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:?, code lost:
        A01(r4, r0);
        r25.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:?, code lost:
        r30 = r1.A05;
        r12 = new X.C86384Sm();
        r10 = r26.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0672, code lost:
        if (r10.hasNext() == false) goto L_0x0686;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0674, code lost:
        r9 = r10.next();
        r4 = r12.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x067e, code lost:
        if (r4.containsKey(r9) != false) goto L_0x066e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0680, code lost:
        r4.put(r9, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0686, code lost:
        r24 = r26.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x068e, code lost:
        if (r24.hasNext() == false) goto L_0x0725;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0690, code lost:
        r11 = (X.AnonymousClass1WJ) r24.next();
        r10 = (java.util.List) X.C89744cp.A00.get(r11.A04());
        r9 = (java.util.List) X.C89744cp.A01.get(r11.A04());
        r23 = r26.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x06b6, code lost:
        if (r23.hasNext() == false) goto L_0x068a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x06b8, code lost:
        r13 = (X.AnonymousClass1WJ) r23.next();
        r22 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x06c0, code lost:
        if (r10 == null) goto L_0x06f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x06ca, code lost:
        if (r10.contains(r13.A04()) == false) goto L_0x06f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x06cc, code lost:
        r4 = X.C89744cp.A00(r13);
        r29 = r4.first;
        r14 = (X.C28381Vw) r4.second;
        r3 = X.C89744cp.A00(r11);
        r15 = r3.first;
        r4 = r3.second;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x06e2, code lost:
        if (r29 != r15) goto L_0x06f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x06e4, code lost:
        if (r14 == null) goto L_0x06ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x06e6, code lost:
        if (r4 == null) goto L_0x06ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x06ec, code lost:
        if (r14.equals(r4) == false) goto L_0x06f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x06ee, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x06f0, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x06f1, code lost:
        if (r9 == null) goto L_0x06fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x06fb, code lost:
        if (r9.contains(r13.A04()) == false) goto L_0x06fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x06fe, code lost:
        r22 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0700, code lost:
        if (r13 == r11) goto L_0x06b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x0702, code lost:
        if (r4 != false) goto L_0x0706;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0704, code lost:
        if (r22 == false) goto L_0x06b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x070c, code lost:
        if (r13.A04 >= r11.A04) goto L_0x0713;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x070e, code lost:
        r3 = r12.A01(r11, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0713, code lost:
        r3 = r12.A01(r13, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0717, code lost:
        if (r3 == false) goto L_0x06b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0719, code lost:
        r30.A01.A06("cross_index_conflict_counter", 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0725, code lost:
        r13 = new java.util.ArrayList();
        r11 = new java.util.HashSet();
        r10 = r12.A00;
        r9 = r10.size();
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0736, code lost:
        if (r4 >= r9) goto L_0x0744;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0738, code lost:
        r12.A00(r10.A02[r4 << 1], r13, r11);
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0744, code lost:
        r12 = r13.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x074c, code lost:
        if (r12.hasNext() == false) goto L_0x079d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x074e, code lost:
        r4 = (X.AnonymousClass1WJ) r12.next();
        r10 = r7.A00(r4);
        X.AnonymousClass00B.A06(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:?, code lost:
        r10.A09(r4, r7.A03.A05(r4.A03()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:?, code lost:
        r7.A06(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x076e, code lost:
        if ((r4 instanceof X.C37191ol) == false) goto L_0x0780;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0770, code lost:
        r4 = (X.C37191ol) r4;
        r3 = r4.A02;
        r10 = r1.A0I;
        r9 = r4.A01;
        r4 = !r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x077a, code lost:
        r10.A08(r9, (java.lang.String) null, 3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0782, code lost:
        if ((r4 instanceof X.C37121oe) == false) goto L_0x0791;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0784, code lost:
        r4 = (X.C37121oe) r4;
        r3 = r4.A02;
        r10 = r1.A0I;
        r9 = r4.A01;
        r4 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x078d, code lost:
        if (r3 == false) goto L_0x077a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x078f, code lost:
        r4 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0793, code lost:
        if ((r4 instanceof X.C37231op) == false) goto L_0x0748;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0795, code lost:
        r10 = r1.A0I;
        r9 = ((X.C37231op) r4).A01;
        r4 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:375:?, code lost:
        r23 = r25.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:377:0x07a5, code lost:
        if (r23.hasNext() == false) goto L_0x0836;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x07a7, code lost:
        r3 = (X.C37641pU) r23.next();
        r11 = r3.reason;
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:379:0x07b1, code lost:
        if (6 != r11) goto L_0x07b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:380:0x07b3, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:381:0x07b4, code lost:
        r4 = new java.lang.StringBuilder("unexpected reason=");
        r4.append(r11);
        X.AnonymousClass00B.A0D(r4.toString(), r10);
        r11 = r1.A0G;
        r15 = r3.version;
        r14 = r3.operation;
        r10 = r3.index;
        X.AnonymousClass00B.A06(r10);
        r12 = r3.mutationMac;
        r9 = r3.syncdKeyId;
        X.AnonymousClass00B.A06(r9);
        r13 = r3.syncActionValue;
        r4 = r11.A01.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:?, code lost:
        r22 = r4.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:0x07e6, code lost:
        if (r14 != X.C28481Wg.A02) goto L_0x0807;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:387:0x07e8, code lost:
        r11 = r4.A02;
        r9 = new java.lang.StringBuilder("DELETE FROM syncd_mutations WHERE mutation_index IN ");
        r9.append(X.C34111ji.A00(1));
        r11.A0C(r9.toString(), new java.lang.String[]{r10});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:388:0x0803, code lost:
        r22.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:390:0x0809, code lost:
        if (r14 != X.C28481Wg.A03) goto L_0x0803;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:391:0x080b, code lost:
        r3 = r4.A02;
        X.AnonymousClass00B.A06(r13);
        r11.A0C(r3, r9, (X.C15830rv) null, r10, r0, X.C28501Wi.A00(r10), r13.A02(), r12, r15, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:393:?, code lost:
        r22.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:395:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:396:0x0836, code lost:
        if (r27 == null) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:?, code lost:
        r20.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:401:?, code lost:
        r21.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:404:0x0841, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:407:?, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/validatePatchMac/patch mac mismatch");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:408:0x084e, code lost:
        throw new X.AnonymousClass1X9(34, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:409:0x084f, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:412:?, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/validatePatchIntegrity: ", r4);
        r4 = new X.AnonymousClass1X9(10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:413:0x085e, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/validatePatchMac/No snapshot mac");
        r4 = new X.AnonymousClass1X9(47, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:414:0x086c, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/validatePatchMac/No patch mac");
        r4 = new X.AnonymousClass1X9(48, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:415:0x087a, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x087b, code lost:
        com.whatsapp.util.Log.e("SyncResponseHandler/applyMutations", r4);
        r4 = new X.AnonymousClass1X9(7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x088e, code lost:
        if (r4.A0E(r11, 1783) == false) goto L_0x0895;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0890, code lost:
        r10.A01(16, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:423:0x089c, code lost:
        throw new X.AnonymousClass1X9(60, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x089d, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:427:?, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/validateSnapshotMac: ", r4);
        r4 = new X.AnonymousClass1X9(10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:?, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/validateSnapshotMac/snapshot mac mismatch");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:431:0x08b8, code lost:
        throw new X.AnonymousClass1X9(61, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:432:0x08b9, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:435:?, code lost:
        com.whatsapp.util.Log.e("SyncEncryptionHelper/validateSnapshotMac: ", r4);
        r4 = new X.AnonymousClass1X9(10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:436:0x08c8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:438:?, code lost:
        r12.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:440:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:441:0x08cd, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:443:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:447:0x08d4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:?, code lost:
        r22.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:451:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x08d9, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:454:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:456:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:457:0x08de, code lost:
        r44.A05(r0, r27, r18);
        r20.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:458:0x08ea, code lost:
        if (r52 == false) goto L_0x097c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x08ec, code lost:
        r4 = r1.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:460:0x08ee, code lost:
        if (r47 == null) goto L_0x08f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x08f0, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x08f1, code lost:
        r3 = new X.C75703sa();
        r9 = 1;
        r3.A04 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0903, code lost:
        if (X.AnonymousClass1WJ.A09.contains(r0) != false) goto L_0x0906;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x0905, code lost:
        r9 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x0906, code lost:
        r3.A03 = java.lang.Integer.valueOf(r9);
        r3.A08 = r4.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x0916, code lost:
        switch(r0.hashCode()) {
            case -849492943: goto L_0x0921;
            case -564602779: goto L_0x092a;
            case -498584183: goto L_0x0933;
            case 207170541: goto L_0x093c;
            case 1086463900: goto L_0x0945;
            default: goto L_0x0919;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0920, code lost:
        throw new java.lang.IllegalArgumentException("CompanionSyncStatsLogger/convertToWamCollection received undefined collection name");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x0927, code lost:
        if (r0.equals("regular_low") == false) goto L_0x0919;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x0930, code lost:
        if (r0.equals("regular_high") == false) goto L_0x0919;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0939, code lost:
        if (r0.equals("critical_unblock_low") == false) goto L_0x0919;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0942, code lost:
        if (r0.equals("critical_block") == false) goto L_0x0919;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x094b, code lost:
        if (r0.equals("regular") == false) goto L_0x0919;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x094e, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0950, code lost:
        r0 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0952, code lost:
        r0 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0954, code lost:
        r0 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0956, code lost:
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0957, code lost:
        r3.A01 = java.lang.Integer.valueOf(r0);
        r9 = r4.A03.A00();
        r3.A07 = java.lang.Long.valueOf(r9);
        r3.A06 = java.lang.Long.valueOf(r9 - r16);
        r3.A00 = java.lang.Boolean.valueOf(r8);
        r4.A06.A06(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:?, code lost:
        r20.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:?, code lost:
        r21.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0983, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0984, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:?, code lost:
        r3 = new java.lang.StringBuilder("SyncResponseHandler/applyMutations cyclic mutation e=");
        r3.append(r5);
        com.whatsapp.util.Log.e(r3.toString());
        r4 = new X.AnonymousClass1X9(39, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x012e, code lost:
        r4 = new X.AnonymousClass1X9(12, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0137, code lost:
        r4 = new X.AnonymousClass1X9(20, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0140, code lost:
        r4 = new X.AnonymousClass1X9(17, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x015c, code lost:
        if (r46 == null) goto L_0x0182;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:439:0x08cc */
    /* JADX WARNING: Missing exception handler attribute for start block: B:450:0x08d8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:455:0x08dd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:506:0x09cd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:511:0x09d2 */
    /* JADX WARNING: Removed duplicated region for block: B:415:0x087a A[Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467, all -> 0x09c9 }, ExcHandler: 1X5 | 1X7 | ParseException (r4v61 'e' java.lang.Throwable A[CUSTOM_DECLARE, Catch:{ all -> 0x09cd, all -> 0x09ce }]), Splitter:B:148:0x0277] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:490:0x097c=Splitter:B:490:0x097c, B:506:0x09cd=Splitter:B:506:0x09cd} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A07(X.AnonymousClass1XC r46, X.C48272Mn r47, java.lang.String r48, java.util.List r49, long r50, boolean r52) {
        /*
            r45 = this;
            r5 = 1
            r8 = 0
            r1 = 0
            r2 = r46
            if (r46 == 0) goto L_0x0008
            r1 = 1
        L_0x0008:
            r0 = 0
            r6 = r47
            if (r47 == 0) goto L_0x000e
            r0 = 1
        L_0x000e:
            r1 = r1 ^ r0
            java.lang.String r4 = "patch XOR snapshot must be non null"
            X.AnonymousClass00B.A0C(r4, r1)
            r1 = r45
            X.0t3 r0 = r1.A0B
            long r16 = r0.A00()
            X.15h r7 = r1.A09
            monitor-enter(r7)
            X.19K r0 = r1.A0D     // Catch:{ 1X9 -> 0x09d3 }
            X.0tf r21 = r0.A02()     // Catch:{ 1X9 -> 0x09d3 }
            X.1cj r20 = r21.A00()     // Catch:{ all -> 0x09ce }
            if (r46 != 0) goto L_0x002f
            r22 = 1
            if (r47 != 0) goto L_0x0031
        L_0x002f:
            r22 = 0
        L_0x0031:
            X.11P r0 = r1.A0F     // Catch:{ all -> 0x09c9 }
            r44 = r0
            r0 = r48
            r3 = r44
            java.lang.Long r3 = r3.A00(r0)     // Catch:{ all -> 0x09c9 }
            if (r3 != 0) goto L_0x0042
            r9 = 0
            goto L_0x0046
        L_0x0042:
            long r9 = r3.longValue()     // Catch:{ all -> 0x09c9 }
        L_0x0046:
            java.lang.Long r3 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x09c9 }
            long r14 = r3.longValue()     // Catch:{ all -> 0x09c9 }
            r12 = 1
            r18 = r50
            long r10 = r50 - r12
            int r9 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r9 == 0) goto L_0x005c
            if (r22 != 0) goto L_0x005c
            goto L_0x099e
        L_0x005c:
            r3 = 0
            if (r46 == 0) goto L_0x0060
            r3 = 1
        L_0x0060:
            r9 = 0
            if (r47 == 0) goto L_0x0064
            r9 = 1
        L_0x0064:
            r3 = r3 ^ r9
            X.AnonymousClass00B.A0C(r4, r3)     // Catch:{ all -> 0x09c9 }
            java.util.ArrayList r35 = new java.util.ArrayList     // Catch:{ all -> 0x09c9 }
            r35.<init>()     // Catch:{ all -> 0x09c9 }
            java.util.HashSet r13 = new java.util.HashSet     // Catch:{ all -> 0x09c9 }
            r13.<init>()     // Catch:{ all -> 0x09c9 }
            java.util.Iterator r14 = r49.iterator()     // Catch:{ all -> 0x09c9 }
        L_0x0076:
            boolean r3 = r14.hasNext()     // Catch:{ all -> 0x09c9 }
            if (r3 == 0) goto L_0x015b
            java.lang.Object r12 = r14.next()     // Catch:{ all -> 0x09c9 }
            X.1X3 r12 = (X.AnonymousClass1X3) r12     // Catch:{ all -> 0x09c9 }
            int r3 = r12.A00     // Catch:{ all -> 0x09c9 }
            r4 = r3 & 1
            if (r4 != r5) goto L_0x0152
            r4 = 2
            r3 = r3 & 2
            if (r3 != r4) goto L_0x0149
            X.1X2 r11 = r12.A02     // Catch:{ all -> 0x09c9 }
            if (r11 != 0) goto L_0x0093
            X.1X2 r11 = X.AnonymousClass1X2.A04     // Catch:{ all -> 0x09c9 }
        L_0x0093:
            int r10 = r11.A00     // Catch:{ all -> 0x09c9 }
            r4 = 4
            r3 = r10 & 4
            if (r3 != r4) goto L_0x0140
            X.1X1 r9 = r11.A01     // Catch:{ all -> 0x09c9 }
            if (r9 != 0) goto L_0x00a7
            X.1X1 r3 = X.AnonymousClass1X1.A02     // Catch:{ all -> 0x09c9 }
        L_0x00a0:
            int r3 = r3.A00     // Catch:{ all -> 0x09c9 }
            r3 = r3 & 1
            if (r3 != r5) goto L_0x0140
            goto L_0x00a9
        L_0x00a7:
            r3 = r9
            goto L_0x00a0
        L_0x00a9:
            r3 = r10 & 1
            if (r3 != r5) goto L_0x0137
            X.1Wz r3 = r11.A02     // Catch:{ all -> 0x09c9 }
            r4 = r3
            if (r3 != 0) goto L_0x00b4
            X.1Wz r3 = X.C28661Wz.A02     // Catch:{ all -> 0x09c9 }
        L_0x00b4:
            int r3 = r3.A00     // Catch:{ all -> 0x09c9 }
            r3 = r3 & 1
            if (r3 != r5) goto L_0x0137
            if (r4 != 0) goto L_0x00be
            X.1Wz r4 = X.C28661Wz.A02     // Catch:{ all -> 0x09c9 }
        L_0x00be:
            X.1Ww r3 = r4.A01     // Catch:{ all -> 0x09c9 }
            if (r3 == 0) goto L_0x0137
            r3 = 2
            r4 = r10 & 2
            if (r4 != r3) goto L_0x012e
            X.1X0 r3 = r11.A03     // Catch:{ all -> 0x09c9 }
            r4 = r3
            if (r3 != 0) goto L_0x00ce
            X.1X0 r3 = X.AnonymousClass1X0.A02     // Catch:{ all -> 0x09c9 }
        L_0x00ce:
            int r3 = r3.A00     // Catch:{ all -> 0x09c9 }
            r3 = r3 & 1
            if (r3 != r5) goto L_0x012e
            if (r4 != 0) goto L_0x00d8
            X.1X0 r4 = X.AnonymousClass1X0.A02     // Catch:{ all -> 0x09c9 }
        L_0x00d8:
            X.1Ww r3 = r4.A01     // Catch:{ all -> 0x09c9 }
            if (r3 == 0) goto L_0x012e
            if (r9 != 0) goto L_0x00e0
            X.1X1 r9 = X.AnonymousClass1X1.A02     // Catch:{ all -> 0x09c9 }
        L_0x00e0:
            X.1Ww r3 = r9.A01     // Catch:{ all -> 0x09c9 }
            byte[] r3 = r3.A04()     // Catch:{ all -> 0x09c9 }
            X.1WK r9 = new X.1WK     // Catch:{ all -> 0x09c9 }
            r9.<init>(r3)     // Catch:{ all -> 0x09c9 }
            X.1Wz r3 = r11.A02     // Catch:{ all -> 0x09c9 }
            if (r3 != 0) goto L_0x00f1
            X.1Wz r3 = X.C28661Wz.A02     // Catch:{ all -> 0x09c9 }
        L_0x00f1:
            X.1Ww r3 = r3.A01     // Catch:{ all -> 0x09c9 }
            byte[] r4 = r3.A04()     // Catch:{ all -> 0x09c9 }
            int r3 = r12.A01     // Catch:{ all -> 0x09c9 }
            if (r3 == 0) goto L_0x0101
            if (r3 == r5) goto L_0x00fe
            goto L_0x0104
        L_0x00fe:
            X.1X4 r3 = X.AnonymousClass1X4.A01     // Catch:{ all -> 0x09c9 }
            goto L_0x0106
        L_0x0101:
            X.1X4 r3 = X.AnonymousClass1X4.A02     // Catch:{ all -> 0x09c9 }
            goto L_0x0106
        L_0x0104:
            X.1X4 r3 = X.AnonymousClass1X4.A02     // Catch:{ all -> 0x09c9 }
        L_0x0106:
            int r3 = r3.ordinal()     // Catch:{ all -> 0x09c9 }
            if (r3 == 0) goto L_0x012b
            X.1Wg r10 = X.C28481Wg.A02     // Catch:{ all -> 0x09c9 }
        L_0x010e:
            X.1X0 r3 = r11.A03     // Catch:{ all -> 0x09c9 }
            if (r3 != 0) goto L_0x0114
            X.1X0 r3 = X.AnonymousClass1X0.A02     // Catch:{ all -> 0x09c9 }
        L_0x0114:
            X.1Ww r3 = r3.A01     // Catch:{ all -> 0x09c9 }
            byte[] r11 = r3.A04()     // Catch:{ all -> 0x09c9 }
            X.1Wy r3 = new X.1Wy     // Catch:{ all -> 0x09c9 }
            r3.<init>(r10, r9, r4, r11)     // Catch:{ all -> 0x09c9 }
            r4 = r35
            r4.add(r3)     // Catch:{ all -> 0x09c9 }
            X.1WK r3 = r3.A01     // Catch:{ all -> 0x09c9 }
            r13.add(r3)     // Catch:{ all -> 0x09c9 }
            goto L_0x0076
        L_0x012b:
            X.1Wg r10 = X.C28481Wg.A03     // Catch:{ all -> 0x09c9 }
            goto L_0x010e
        L_0x012e:
            r3 = 12
            X.1X9 r4 = new X.1X9     // Catch:{ all -> 0x09c9 }
            r4.<init>(r3, r0)     // Catch:{ all -> 0x09c9 }
            goto L_0x09c8
        L_0x0137:
            r3 = 20
            X.1X9 r4 = new X.1X9     // Catch:{ all -> 0x09c9 }
            r4.<init>(r3, r0)     // Catch:{ all -> 0x09c9 }
            goto L_0x09c8
        L_0x0140:
            r3 = 17
            X.1X9 r4 = new X.1X9     // Catch:{ all -> 0x09c9 }
            r4.<init>(r3, r0)     // Catch:{ all -> 0x09c9 }
            goto L_0x09c8
        L_0x0149:
            r3 = 16
            X.1X9 r4 = new X.1X9     // Catch:{ all -> 0x09c9 }
            r4.<init>(r3, r0)     // Catch:{ all -> 0x09c9 }
            goto L_0x09c8
        L_0x0152:
            r3 = 15
            X.1X9 r4 = new X.1X9     // Catch:{ all -> 0x09c9 }
            r4.<init>(r3, r0)     // Catch:{ all -> 0x09c9 }
            goto L_0x09c8
        L_0x015b:
            r9 = 0
            if (r46 == 0) goto L_0x0182
            int r3 = r2.A00     // Catch:{ all -> 0x09c9 }
            r4 = 16
            r3 = r3 & 16
            if (r3 != r4) goto L_0x0174
            X.1X1 r3 = r2.A07     // Catch:{ all -> 0x09c9 }
            r4 = r3
            if (r3 != 0) goto L_0x016d
            X.1X1 r3 = X.AnonymousClass1X1.A02     // Catch:{ all -> 0x09c9 }
        L_0x016d:
            int r3 = r3.A00     // Catch:{ all -> 0x09c9 }
            r3 = r3 & 1
            if (r3 != r5) goto L_0x0174
            goto L_0x0198
        L_0x0174:
            java.lang.String r3 = "SyncResponseHandler/applyMutations missing patch key"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x09c9 }
            r3 = 56
            X.1X9 r4 = new X.1X9     // Catch:{ all -> 0x09c9 }
            r4.<init>(r3, r0)     // Catch:{ all -> 0x09c9 }
            goto L_0x09c8
        L_0x0182:
            if (r47 == 0) goto L_0x01a9
            int r3 = r6.A00     // Catch:{ all -> 0x09c9 }
            r4 = 4
            r3 = r3 & 4
            if (r3 != r4) goto L_0x019b
            X.1X1 r3 = r6.A03     // Catch:{ all -> 0x09c9 }
            r4 = r3
            if (r3 != 0) goto L_0x0192
            X.1X1 r3 = X.AnonymousClass1X1.A02     // Catch:{ all -> 0x09c9 }
        L_0x0192:
            int r3 = r3.A00     // Catch:{ all -> 0x09c9 }
            r3 = r3 & 1
            if (r3 != r5) goto L_0x019b
        L_0x0198:
            if (r4 != 0) goto L_0x01ad
            goto L_0x01ab
        L_0x019b:
            java.lang.String r3 = "SyncResponseHandler/applyMutations missing snapshot key"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x09c9 }
            r3 = 59
            X.1X9 r4 = new X.1X9     // Catch:{ all -> 0x09c9 }
            r4.<init>(r3, r0)     // Catch:{ all -> 0x09c9 }
            goto L_0x09c8
        L_0x01a9:
            r4 = r9
            goto L_0x01bb
        L_0x01ab:
            X.1X1 r4 = X.AnonymousClass1X1.A02     // Catch:{ all -> 0x09c9 }
        L_0x01ad:
            X.1Ww r3 = r4.A01     // Catch:{ all -> 0x09c9 }
            byte[] r3 = r3.A04()     // Catch:{ all -> 0x09c9 }
            X.1WK r4 = new X.1WK     // Catch:{ all -> 0x09c9 }
            r4.<init>(r3)     // Catch:{ all -> 0x09c9 }
            r13.add(r4)     // Catch:{ all -> 0x09c9 }
        L_0x01bb:
            X.19W r3 = r1.A08     // Catch:{ all -> 0x09c9 }
            java.util.HashMap r34 = r3.A02(r0, r13)     // Catch:{ all -> 0x09c9 }
            r3 = r34
            boolean r3 = r3.containsValue(r9)     // Catch:{ all -> 0x09c9 }
            if (r3 == 0) goto L_0x01d3
            java.lang.String r0 = "SyncResponseHandler/applyMutations keyMap contains null value, retry"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x09c9 }
        L_0x01ce:
            r20.A00()     // Catch:{ all -> 0x09c9 }
            goto L_0x083a
        L_0x01d3:
            r3 = r34
            java.lang.Object r33 = r3.get(r4)     // Catch:{ all -> 0x09c9 }
            X.AnonymousClass00B.A06(r33)     // Catch:{ all -> 0x09c9 }
            r3 = r33
            X.1WY r3 = (X.AnonymousClass1WY) r3     // Catch:{ all -> 0x09c9 }
            r33 = r3
            if (r46 == 0) goto L_0x023f
            X.1Ca r4 = r1.A07     // Catch:{ all -> 0x09c9 }
            int r10 = r2.A00     // Catch:{ all -> 0x09c9 }
            r9 = 8
            r3 = r10 & 8
            if (r3 != r9) goto L_0x086c
            r3 = 4
            r9 = r10 & 4
            if (r9 != r3) goto L_0x085e
            X.1Ww r3 = r2.A02     // Catch:{ 1X5 | 1X7 -> 0x084f }
            byte[] r10 = r3.A04()     // Catch:{ 1X5 | 1X7 -> 0x084f }
            X.1Ww r3 = r2.A03     // Catch:{ 1X5 | 1X7 -> 0x084f }
            byte[] r26 = r3.A04()     // Catch:{ 1X5 | 1X7 -> 0x084f }
            java.util.LinkedList r11 = new java.util.LinkedList     // Catch:{ 1X5 | 1X7 -> 0x084f }
            r11.<init>()     // Catch:{ 1X5 | 1X7 -> 0x084f }
            java.util.Iterator r9 = r35.iterator()     // Catch:{ 1X5 | 1X7 -> 0x084f }
        L_0x0208:
            boolean r3 = r9.hasNext()     // Catch:{ 1X5 | 1X7 -> 0x084f }
            if (r3 == 0) goto L_0x021a
            java.lang.Object r3 = r9.next()     // Catch:{ 1X5 | 1X7 -> 0x084f }
            X.1Wy r3 = (X.C28651Wy) r3     // Catch:{ 1X5 | 1X7 -> 0x084f }
            byte[] r3 = r3.A04     // Catch:{ 1X5 | 1X7 -> 0x084f }
            r11.add(r3)     // Catch:{ 1X5 | 1X7 -> 0x084f }
            goto L_0x0208
        L_0x021a:
            X.1Cc r9 = r4.A08     // Catch:{ 1X5 | 1X7 -> 0x084f }
            X.1jt r3 = r2.A08     // Catch:{ 1X5 | 1X7 -> 0x084f }
            if (r3 != 0) goto L_0x0222
            X.1jt r3 = X.C34211jt.A02     // Catch:{ 1X5 | 1X7 -> 0x084f }
        L_0x0222:
            long r3 = r3.A01     // Catch:{ 1X5 | 1X7 -> 0x084f }
            byte[] r25 = X.C28641Wx.A03(r11)     // Catch:{ 1X5 | 1X7 -> 0x084f }
            r22 = r9
            r23 = r33
            r24 = r0
            r27 = r3
            byte[] r3 = r22.A03(r23, r24, r25, r26, r27)     // Catch:{ 1X5 | 1X7 -> 0x084f }
            boolean r3 = java.util.Arrays.equals(r10, r3)     // Catch:{ 1X5 | 1X7 -> 0x084f }
            if (r3 == 0) goto L_0x0842
            java.lang.String r3 = "SyncEncryptionHelper/validatePatchMac/patch mac validated"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ 1X5 | 1X7 -> 0x084f }
        L_0x023f:
            java.util.HashSet r28 = new java.util.HashSet     // Catch:{ all -> 0x09c9 }
            r28.<init>()     // Catch:{ all -> 0x09c9 }
            java.util.HashSet r32 = new java.util.HashSet     // Catch:{ all -> 0x09c9 }
            r32.<init>()     // Catch:{ all -> 0x09c9 }
            java.util.HashSet r27 = new java.util.HashSet     // Catch:{ all -> 0x09c9 }
            r27.<init>()     // Catch:{ all -> 0x09c9 }
            java.util.ArrayList r31 = new java.util.ArrayList     // Catch:{ all -> 0x09c9 }
            r31.<init>()     // Catch:{ all -> 0x09c9 }
            java.util.ArrayList r30 = new java.util.ArrayList     // Catch:{ all -> 0x09c9 }
            r30.<init>()     // Catch:{ all -> 0x09c9 }
            java.util.ArrayList r29 = new java.util.ArrayList     // Catch:{ all -> 0x09c9 }
            r29.<init>()     // Catch:{ all -> 0x09c9 }
            java.util.ArrayList r25 = new java.util.ArrayList     // Catch:{ all -> 0x09c9 }
            r25.<init>()     // Catch:{ all -> 0x09c9 }
            java.util.HashMap r26 = new java.util.HashMap     // Catch:{ all -> 0x09c9 }
            r26.<init>()     // Catch:{ all -> 0x09c9 }
            java.util.Iterator r24 = r35.iterator()     // Catch:{ all -> 0x09c9 }
        L_0x026b:
            boolean r3 = r24.hasNext()     // Catch:{ all -> 0x09c9 }
            if (r3 == 0) goto L_0x047b
            java.lang.Object r9 = r24.next()     // Catch:{ all -> 0x09c9 }
            X.1Wy r9 = (X.C28651Wy) r9     // Catch:{ all -> 0x09c9 }
            X.1WK r3 = r9.A01     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r38 = r3
            r4 = r34
            java.lang.Object r4 = r4.get(r3)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            X.AnonymousClass00B.A06(r4)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            X.1WY r4 = (X.AnonymousClass1WY) r4     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            X.1Cc r15 = r1.A0C     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            byte[] r12 = r9.A02     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            int r11 = r12.length     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r10 = 32
            int r11 = r11 - r10
            r3 = 16
            int r11 = r11 - r3
            byte[][] r3 = X.C28641Wx.A06(r12, r3, r11, r10)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r14 = r3[r8]     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r13 = r3[r5]     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r11 = 2
            r23 = r3[r11]     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            X.1RR r10 = r15.A00     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            X.1Wj r3 = r4.A00     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            X.1Wk r22 = r10.A00(r3)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            byte[][] r3 = new byte[r11][]     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r3[r8] = r14     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r3[r5] = r13     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            byte[] r10 = X.C28641Wx.A04(r3)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            X.1Wg r3 = r9.A00     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r37 = r3
            byte[] r3 = r3.A01     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r36 = r3
            X.1WK r3 = r4.A01     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r4 = r3
            r3 = r22
            byte[] r3 = r3.A04     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r12 = r10
            r10 = r36
            byte[] r4 = r15.A04(r4, r10, r3, r12)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r3 = r23
            boolean r3 = java.util.Arrays.equals(r3, r4)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            if (r3 == 0) goto L_0x0457
            r3 = r22
            byte[] r3 = r3.A03     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            byte[] r4 = X.C23471Cc.A01(r14, r13, r3, r11)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            byte[] r3 = r9.A04     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r15 = r3
            X.1Wq r3 = X.C28571Wq.A05     // Catch:{ 1bD -> 0x0375, 1X5 | 1X7 | ParseException -> 0x087a, 1X5 | 1X7 | ParseException -> 0x087a }
            X.1Wm r12 = X.C28541Wm.A0E(r3, r4)     // Catch:{ 1bD -> 0x0375, 1X5 | 1X7 | ParseException -> 0x087a, 1X5 | 1X7 | ParseException -> 0x087a }
            X.1Wq r12 = (X.C28571Wq) r12     // Catch:{ 1bD -> 0x0375, 1X5 | 1X7 | ParseException -> 0x087a, 1X5 | 1X7 | ParseException -> 0x087a }
            if (r12 == 0) goto L_0x0363
            int r3 = r12.A00     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r10 = 8
            r4 = r3 & 8
            r13 = 0
            if (r4 != r10) goto L_0x02eb
            r13 = 1
        L_0x02eb:
            r41 = 0
            if (r13 == 0) goto L_0x02f6
            int r4 = r12.A01     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            java.lang.Integer r40 = java.lang.Integer.valueOf(r4)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            goto L_0x02f8
        L_0x02f6:
            r40 = r41
        L_0x02f8:
            r3 = r3 & 1
            if (r3 != r5) goto L_0x02fd
            goto L_0x0300
        L_0x02fd:
            r4 = r41
            goto L_0x030e
        L_0x0300:
            X.1Ww r3 = r12.A02     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            if (r3 == 0) goto L_0x02fd
            java.nio.charset.Charset r14 = X.C28601Wt.A03     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            int r4 = r3.A03()     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            if (r4 != 0) goto L_0x031b
            java.lang.String r4 = ""
        L_0x030e:
            int r3 = r12.A00     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r3 = r3 & 2
            if (r3 != r11) goto L_0x032d
            X.1Wl r3 = r12.A04     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            if (r3 != 0) goto L_0x032f
            X.1Wl r3 = X.C28531Wl.A0X     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            goto L_0x032f
        L_0x031b:
            X.1Wu r3 = (X.C28611Wu) r3     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            byte[] r13 = r3.bytes     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            int r10 = r3.A05()     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            int r3 = r3.A03()     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            java.lang.String r4 = new java.lang.String     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r4.<init>(r13, r10, r3, r14)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            goto L_0x030e
        L_0x032d:
            r3 = r41
        L_0x032f:
            if (r40 == 0) goto L_0x0355
            if (r4 == 0) goto L_0x0349
            if (r3 != 0) goto L_0x0387
            X.1Wg r11 = X.C28481Wg.A02     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r10 = r37
            if (r10 == r11) goto L_0x03a1
            r43 = 2
            X.1pU r36 = new X.1pU     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r39 = r41
            r41 = r4
            r42 = r15
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            goto L_0x03a0
        L_0x0349:
            r43 = 1
            X.1pU r36 = new X.1pU     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r39 = r3
            r42 = r15
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            goto L_0x03a0
        L_0x0355:
            r43 = 3
            X.1pU r36 = new X.1pU     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r39 = r3
            r41 = r4
            r42 = r15
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            goto L_0x03a0
        L_0x0363:
            r38 = 0
            r40 = r38
            r41 = r38
            r43 = 0
            X.1pU r36 = new X.1pU     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r39 = r38
            r42 = r15
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            goto L_0x03a0
        L_0x0375:
            r38 = 0
            r40 = r38
            r41 = r38
            r43 = 0
            X.1pU r36 = new X.1pU     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r39 = r38
            r42 = r15
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            goto L_0x03a0
        L_0x0387:
            boolean r10 = r3.A0c()     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            if (r10 != 0) goto L_0x03a1
            X.1Wg r11 = X.C28481Wg.A02     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r10 = r37
            if (r10 == r11) goto L_0x03a1
            r43 = 7
            X.1pU r36 = new X.1pU     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r39 = r3
            r41 = r4
            r42 = r15
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
        L_0x03a0:
            throw r36     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
        L_0x03a1:
            java.lang.String[] r42 = X.C28501Wi.A01(r4)     // Catch:{ IllegalArgumentException | JSONException -> 0x03a6, 1X5 | 1X7 | ParseException -> 0x087a, 1X5 | 1X7 | ParseException -> 0x087a }
            goto L_0x03b4
        L_0x03a6:
            r43 = 4
            X.1pU r36 = new X.1pU     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r39 = r3
            r41 = r4
            r42 = r15
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            goto L_0x03a0
        L_0x03b4:
            int r43 = r40.intValue()     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            X.1Wi r10 = new X.1Wi     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r36 = r10
            r39 = r3
            r40 = r4
            r41 = r15
            r36.<init>(r37, r38, r39, r40, r41, r42, r43)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            java.lang.String r11 = r10.A04     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            java.nio.charset.Charset r3 = X.AnonymousClass01S.A0A     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            byte[] r4 = r11.getBytes(r3)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r3 = r22
            byte[] r12 = r3.A00     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            java.lang.String r3 = "HmacSHA256"
            byte[] r3 = X.C23471Cc.A00(r3, r4, r12)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            byte[] r4 = r9.A03     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            boolean r3 = java.util.Arrays.equals(r4, r3)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            if (r3 == 0) goto L_0x045f
            r3 = r26
            r3.put(r11, r4)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            X.1Wg r4 = r10.A01     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            X.1Wg r3 = X.C28481Wg.A03     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r9 = 68
            if (r4 != r3) goto L_0x0407
            r3 = r31
            r3.add(r10)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r3 = r32
            boolean r3 = r3.add(r11)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            if (r3 != 0) goto L_0x026b
            java.lang.String r3 = "SyncResponseHandler/applyMutations same index for multi set mutations"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            if (r46 == 0) goto L_0x0401
            goto L_0x043a
        L_0x0401:
            X.1X9 r3 = new X.1X9     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r3.<init>(r9, r0)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            goto L_0x0440
        L_0x0407:
            X.1Wg r3 = X.C28481Wg.A02     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            if (r4 != r3) goto L_0x0441
            java.lang.String[] r3 = r10.A06     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r4 = r3[r8]     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            java.lang.String r3 = "contact"
            boolean r4 = r4.equals(r3)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r3 = r30
            if (r4 == 0) goto L_0x041b
            r3 = r29
        L_0x041b:
            r3.add(r10)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r3 = r27
            boolean r3 = r3.add(r11)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            if (r3 != 0) goto L_0x026b
            java.lang.String r3 = "SyncResponseHandler/applyMutations same index for multi remove mutations"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            if (r46 == 0) goto L_0x0434
            r4 = 6
            X.1X9 r3 = new X.1X9     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r3.<init>(r4, r0)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            goto L_0x0440
        L_0x0434:
            X.1X9 r3 = new X.1X9     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r3.<init>(r9, r0)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            goto L_0x0440
        L_0x043a:
            r4 = 6
            X.1X9 r3 = new X.1X9     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r3.<init>(r4, r0)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
        L_0x0440:
            throw r3     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
        L_0x0441:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r9.<init>()     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            java.lang.String r3 = "SyncResponseHandler/applyMutations: Unknown operation "
            r9.append(r3)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r9.append(r4)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            java.lang.String r3 = r9.toString()     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            goto L_0x026b
        L_0x0457:
            java.lang.String r3 = "Data mac corrupt"
            X.3pW r4 = new X.3pW     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r4.<init>(r3)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            goto L_0x0466
        L_0x045f:
            java.lang.String r3 = "Index hash corrupt"
            X.3pW r4 = new X.3pW     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
            r4.<init>(r3)     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
        L_0x0466:
            throw r4     // Catch:{ 1X5 | 1X7 | ParseException -> 0x087a, 1pU -> 0x0467 }
        L_0x0467:
            r4 = move-exception
            r1.A01(r4, r0)     // Catch:{ all -> 0x09c9 }
            r3 = r25
            r3.add(r4)     // Catch:{ all -> 0x09c9 }
            java.lang.String r4 = r4.index     // Catch:{ all -> 0x09c9 }
            if (r4 == 0) goto L_0x026b
            r3 = r28
            r3.add(r4)     // Catch:{ all -> 0x09c9 }
            goto L_0x026b
        L_0x047b:
            X.0pd r4 = r1.A0H     // Catch:{ all -> 0x09c9 }
            r3 = 624(0x270, float:8.74E-43)
            X.0tM r11 = X.C16620tM.A02     // Catch:{ all -> 0x09c9 }
            boolean r3 = r4.A0E(r11, r3)     // Catch:{ all -> 0x09c9 }
            if (r3 == 0) goto L_0x0498
            java.lang.String r4 = "\n"
            r3 = r30
            android.text.TextUtils.join(r4, r3)     // Catch:{ all -> 0x09c9 }
            r3 = r29
            android.text.TextUtils.join(r4, r3)     // Catch:{ all -> 0x09c9 }
            r3 = r31
            android.text.TextUtils.join(r4, r3)     // Catch:{ all -> 0x09c9 }
        L_0x0498:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x09c9 }
            r4.<init>()     // Catch:{ all -> 0x09c9 }
            r3 = r28
            r4.addAll(r3)     // Catch:{ all -> 0x09c9 }
            r3 = r32
            r4.addAll(r3)     // Catch:{ all -> 0x09c9 }
            r3 = r27
            r4.addAll(r3)     // Catch:{ all -> 0x09c9 }
            r28.size()     // Catch:{ all -> 0x09c9 }
            r32.size()     // Catch:{ all -> 0x09c9 }
            r27.size()     // Catch:{ all -> 0x09c9 }
            X.1Ca r10 = r1.A07     // Catch:{ all -> 0x09c9 }
            java.lang.String[] r3 = A0L     // Catch:{ all -> 0x09c9 }
            java.lang.Object[] r13 = r4.toArray(r3)     // Catch:{ all -> 0x09c9 }
            java.lang.String[] r13 = (java.lang.String[]) r13     // Catch:{ all -> 0x09c9 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x09c9 }
            r12.<init>()     // Catch:{ all -> 0x09c9 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x09c9 }
            r9.<init>()     // Catch:{ all -> 0x09c9 }
            java.util.Iterator r15 = r35.iterator()     // Catch:{ all -> 0x09c9 }
        L_0x04cd:
            boolean r3 = r15.hasNext()     // Catch:{ all -> 0x09c9 }
            if (r3 == 0) goto L_0x04ea
            java.lang.Object r4 = r15.next()     // Catch:{ all -> 0x09c9 }
            X.1Wy r4 = (X.C28651Wy) r4     // Catch:{ all -> 0x09c9 }
            X.1Wg r14 = r4.A00     // Catch:{ all -> 0x09c9 }
            X.1Wg r3 = X.C28481Wg.A03     // Catch:{ all -> 0x09c9 }
            if (r14 != r3) goto L_0x04cd
            byte[] r3 = r4.A04     // Catch:{ all -> 0x09c9 }
            r12.add(r3)     // Catch:{ all -> 0x09c9 }
            byte[] r3 = r4.A03     // Catch:{ all -> 0x09c9 }
            r9.add(r3)     // Catch:{ all -> 0x09c9 }
            goto L_0x04cd
        L_0x04ea:
            r28 = 0
            byte[] r27 = r10.A02(r0, r12, r13)     // Catch:{ all -> 0x09c9 }
            if (r46 == 0) goto L_0x0594
            int r3 = r2.A00     // Catch:{ all -> 0x09c9 }
            r4 = 4
            r3 = r3 & 4
            r9 = 0
            if (r3 != r4) goto L_0x04fb
            r9 = 1
        L_0x04fb:
            X.AnonymousClass00B.A0G(r9)     // Catch:{ all -> 0x09c9 }
            X.1Ww r3 = r2.A03     // Catch:{ all -> 0x09c9 }
            byte[] r12 = r3.A04()     // Catch:{ all -> 0x09c9 }
            X.1Cc r9 = r10.A08     // Catch:{ 1X5 | 1X7 -> 0x089d }
            X.1jt r3 = r2.A08     // Catch:{ 1X5 | 1X7 -> 0x089d }
            if (r3 != 0) goto L_0x050c
            X.1jt r3 = X.C34211jt.A02     // Catch:{ 1X5 | 1X7 -> 0x089d }
        L_0x050c:
            long r3 = r3.A01     // Catch:{ 1X5 | 1X7 -> 0x089d }
            r34 = r9
            r35 = r33
            r36 = r0
            r37 = r27
            r38 = r3
            byte[] r3 = r34.A02(r35, r36, r37, r38)     // Catch:{ 1X5 | 1X7 -> 0x089d }
            boolean r3 = java.util.Arrays.equals(r12, r3)     // Catch:{ 1X5 | 1X7 -> 0x089d }
            if (r3 != 0) goto L_0x058e
            X.0pd r4 = r10.A0B     // Catch:{ 1X5 | 1X7 -> 0x089d }
            r3 = 2007(0x7d7, float:2.812E-42)
            boolean r3 = r4.A0E(r11, r3)     // Catch:{ 1X5 | 1X7 -> 0x089d }
            if (r3 != 0) goto L_0x0533
            java.lang.String r3 = "SyncEncryptionHelper/validateSnapshotMac/snapshot mac mismatch and throw fatal error"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ 1X5 | 1X7 -> 0x089d }
            goto L_0x0888
        L_0x0533:
            java.lang.String r3 = "SyncEncryptionHelper/validateSnapshotMac/snapshot mac mismatch but do not throw fatal"
            com.whatsapp.util.Log.w((java.lang.String) r3)     // Catch:{ 1X5 | 1X7 -> 0x089d }
            X.1RQ r10 = r10.A05     // Catch:{ 1X5 | 1X7 -> 0x089d }
            X.139 r3 = r10.A01     // Catch:{ 1X5 | 1X7 -> 0x089d }
            android.content.SharedPreferences r4 = r3.A01()     // Catch:{ 1X5 | 1X7 -> 0x089d }
            java.lang.String r9 = "syncd_has_logged_snapshot_mac_mismatch_in_patch"
            int r11 = r4.getInt(r9, r8)     // Catch:{ 1X5 | 1X7 -> 0x089d }
            int r4 = X.AnonymousClass1RQ.A00(r0)     // Catch:{ 1X5 | 1X7 -> 0x089d }
            int r4 = r5 << r4
            r4 = r4 & r11
            if (r4 != 0) goto L_0x058e
            android.content.SharedPreferences r4 = r3.A01()     // Catch:{ 1X5 | 1X7 -> 0x089d }
            int r11 = r4.getInt(r9, r8)     // Catch:{ 1X5 | 1X7 -> 0x089d }
            int r4 = X.AnonymousClass1RQ.A00(r0)     // Catch:{ 1X5 | 1X7 -> 0x089d }
            int r4 = r5 << r4
            r4 = r4 | r11
            android.content.SharedPreferences r3 = r3.A01()     // Catch:{ 1X5 | 1X7 -> 0x089d }
            android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch:{ 1X5 | 1X7 -> 0x089d }
            android.content.SharedPreferences$Editor r3 = r3.putInt(r9, r4)     // Catch:{ 1X5 | 1X7 -> 0x089d }
            r3.apply()     // Catch:{ 1X5 | 1X7 -> 0x089d }
            X.19E r9 = r10.A00     // Catch:{ 1X5 | 1X7 -> 0x089d }
            r3 = 60
            X.3rJ r4 = new X.3rJ     // Catch:{ 1X5 | 1X7 -> 0x089d }
            r4.<init>()     // Catch:{ 1X5 | 1X7 -> 0x089d }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ 1X5 | 1X7 -> 0x089d }
            r4.A02 = r3     // Catch:{ 1X5 | 1X7 -> 0x089d }
            java.lang.Integer r3 = X.AnonymousClass19E.A03(r0)     // Catch:{ 1X5 | 1X7 -> 0x089d }
            r4.A01 = r3     // Catch:{ 1X5 | 1X7 -> 0x089d }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)     // Catch:{ 1X5 | 1X7 -> 0x089d }
            r4.A00 = r3     // Catch:{ 1X5 | 1X7 -> 0x089d }
            X.0t9 r3 = r9.A06     // Catch:{ 1X5 | 1X7 -> 0x089d }
            r3.A06(r4)     // Catch:{ 1X5 | 1X7 -> 0x089d }
        L_0x058e:
            java.lang.String r3 = "SyncEncryptionHelper/validateSnapshotMac/snapshot mac validated"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ 1X5 | 1X7 -> 0x089d }
            goto L_0x05c7
        L_0x0594:
            if (r47 == 0) goto L_0x05c7
            int r3 = r6.A00     // Catch:{ all -> 0x09c9 }
            r4 = 2
            r3 = r3 & 2
            r9 = 0
            if (r3 != r4) goto L_0x059f
            r9 = 1
        L_0x059f:
            X.AnonymousClass00B.A0G(r9)     // Catch:{ all -> 0x09c9 }
            X.1Ww r3 = r6.A01     // Catch:{ all -> 0x09c9 }
            byte[] r9 = r3.A04()     // Catch:{ all -> 0x09c9 }
            X.1Cc r10 = r10.A08     // Catch:{ 1X5 | 1X7 -> 0x08b9 }
            X.1jt r3 = r6.A04     // Catch:{ 1X5 | 1X7 -> 0x08b9 }
            if (r3 != 0) goto L_0x05b0
            X.1jt r3 = X.C34211jt.A02     // Catch:{ 1X5 | 1X7 -> 0x08b9 }
        L_0x05b0:
            long r3 = r3.A01     // Catch:{ 1X5 | 1X7 -> 0x08b9 }
            r11 = r33
            r12 = r0
            r13 = r27
            r14 = r3
            byte[] r3 = r10.A02(r11, r12, r13, r14)     // Catch:{ 1X5 | 1X7 -> 0x08b9 }
            boolean r3 = java.util.Arrays.equals(r9, r3)     // Catch:{ 1X5 | 1X7 -> 0x08b9 }
            if (r3 == 0) goto L_0x08ac
            java.lang.String r3 = "SyncEncryptionHelper/validateSnapshotMac/snapshot mac validated"
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ 1X5 | 1X7 -> 0x08b9 }
        L_0x05c7:
            boolean r3 = r30.isEmpty()     // Catch:{ all -> 0x09c9 }
            if (r3 != 0) goto L_0x060a
            X.0zv r3 = r1.A0G     // Catch:{ all -> 0x09c9 }
            X.19K r3 = r3.A01     // Catch:{ all -> 0x09c9 }
            X.0tf r10 = r3.A02()     // Catch:{ all -> 0x09c9 }
            X.1cj r12 = r10.A00()     // Catch:{ all -> 0x08cd }
            X.0tg r9 = r10.A02     // Catch:{ all -> 0x08c8 }
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet     // Catch:{ all -> 0x08c8 }
            r4.<init>()     // Catch:{ all -> 0x08c8 }
            java.util.Iterator r11 = r30.iterator()     // Catch:{ all -> 0x08c8 }
        L_0x05e4:
            boolean r3 = r11.hasNext()     // Catch:{ all -> 0x08c8 }
            if (r3 == 0) goto L_0x05f6
            java.lang.Object r3 = r11.next()     // Catch:{ all -> 0x08c8 }
            X.1Wi r3 = (X.C28501Wi) r3     // Catch:{ all -> 0x08c8 }
            java.lang.String r3 = r3.A04     // Catch:{ all -> 0x08c8 }
            r4.add(r3)     // Catch:{ all -> 0x08c8 }
            goto L_0x05e4
        L_0x05f6:
            java.lang.String[] r3 = X.AnonymousClass1XA.A00     // Catch:{ all -> 0x08c8 }
            java.lang.Object[] r3 = r4.toArray(r3)     // Catch:{ all -> 0x08c8 }
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch:{ all -> 0x08c8 }
            X.C20360zv.A02(r9, r3)     // Catch:{ all -> 0x08c8 }
            r12.A00()     // Catch:{ all -> 0x08c8 }
            r12.close()     // Catch:{ all -> 0x08cd }
            r10.close()     // Catch:{ all -> 0x09c9 }
        L_0x060a:
            java.util.ArrayList r26 = new java.util.ArrayList     // Catch:{ all -> 0x09c9 }
            r26.<init>()     // Catch:{ all -> 0x09c9 }
            java.util.Iterator r10 = r29.iterator()     // Catch:{ all -> 0x09c9 }
        L_0x0613:
            boolean r3 = r10.hasNext()     // Catch:{ all -> 0x09c9 }
            if (r3 == 0) goto L_0x063d
            java.lang.Object r9 = r10.next()     // Catch:{ all -> 0x09c9 }
            X.1Wi r9 = (X.C28501Wi) r9     // Catch:{ all -> 0x09c9 }
            java.lang.String r4 = r9.A04     // Catch:{ 1pU -> 0x0633 }
            r3 = r32
            boolean r3 = r3.contains(r4)     // Catch:{ 1pU -> 0x0633 }
            if (r3 != 0) goto L_0x0613
            X.1WJ r4 = r7.A01(r9)     // Catch:{ 1pU -> 0x0633 }
            r3 = r26
            r3.add(r4)     // Catch:{ 1pU -> 0x0633 }
            goto L_0x0613
        L_0x0633:
            r4 = move-exception
            r1.A01(r4, r0)     // Catch:{ all -> 0x09c9 }
            r3 = r25
            r3.add(r4)     // Catch:{ all -> 0x09c9 }
            goto L_0x0613
        L_0x063d:
            java.util.Iterator r9 = r31.iterator()     // Catch:{ all -> 0x09c9 }
        L_0x0641:
            boolean r3 = r9.hasNext()     // Catch:{ all -> 0x09c9 }
            if (r3 == 0) goto L_0x0661
            java.lang.Object r3 = r9.next()     // Catch:{ all -> 0x09c9 }
            X.1Wi r3 = (X.C28501Wi) r3     // Catch:{ all -> 0x09c9 }
            X.1WJ r4 = r7.A01(r3)     // Catch:{ 1pU -> 0x0657 }
            r3 = r26
            r3.add(r4)     // Catch:{ 1pU -> 0x0657 }
            goto L_0x0641
        L_0x0657:
            r4 = move-exception
            r1.A01(r4, r0)     // Catch:{ all -> 0x09c9 }
            r3 = r25
            r3.add(r4)     // Catch:{ all -> 0x09c9 }
            goto L_0x0641
        L_0x0661:
            X.19E r3 = r1.A05     // Catch:{ 43Q -> 0x0984 }
            r30 = r3
            X.4Sm r12 = new X.4Sm     // Catch:{ 43Q -> 0x0984 }
            r12.<init>()     // Catch:{ 43Q -> 0x0984 }
            java.util.Iterator r10 = r26.iterator()     // Catch:{ 43Q -> 0x0984 }
        L_0x066e:
            boolean r3 = r10.hasNext()     // Catch:{ 43Q -> 0x0984 }
            if (r3 == 0) goto L_0x0686
            java.lang.Object r9 = r10.next()     // Catch:{ 43Q -> 0x0984 }
            X.00O r4 = r12.A00     // Catch:{ 43Q -> 0x0984 }
            boolean r3 = r4.containsKey(r9)     // Catch:{ 43Q -> 0x0984 }
            if (r3 != 0) goto L_0x066e
            r3 = r28
            r4.put(r9, r3)     // Catch:{ 43Q -> 0x0984 }
            goto L_0x066e
        L_0x0686:
            java.util.Iterator r24 = r26.iterator()     // Catch:{ 43Q -> 0x0984 }
        L_0x068a:
            boolean r3 = r24.hasNext()     // Catch:{ 43Q -> 0x0984 }
            if (r3 == 0) goto L_0x0725
            java.lang.Object r11 = r24.next()     // Catch:{ 43Q -> 0x0984 }
            X.1WJ r11 = (X.AnonymousClass1WJ) r11     // Catch:{ 43Q -> 0x0984 }
            X.0vs r4 = X.C89744cp.A00     // Catch:{ 43Q -> 0x0984 }
            java.lang.String r3 = r11.A04()     // Catch:{ 43Q -> 0x0984 }
            java.lang.Object r10 = r4.get(r3)     // Catch:{ 43Q -> 0x0984 }
            java.util.List r10 = (java.util.List) r10     // Catch:{ 43Q -> 0x0984 }
            X.0vs r4 = X.C89744cp.A01     // Catch:{ 43Q -> 0x0984 }
            java.lang.String r3 = r11.A04()     // Catch:{ 43Q -> 0x0984 }
            java.lang.Object r9 = r4.get(r3)     // Catch:{ 43Q -> 0x0984 }
            java.util.List r9 = (java.util.List) r9     // Catch:{ 43Q -> 0x0984 }
            java.util.Iterator r23 = r26.iterator()     // Catch:{ 43Q -> 0x0984 }
        L_0x06b2:
            boolean r3 = r23.hasNext()     // Catch:{ 43Q -> 0x0984 }
            if (r3 == 0) goto L_0x068a
            java.lang.Object r13 = r23.next()     // Catch:{ 43Q -> 0x0984 }
            X.1WJ r13 = (X.AnonymousClass1WJ) r13     // Catch:{ 43Q -> 0x0984 }
            r22 = 1
            if (r10 == 0) goto L_0x06f0
            java.lang.String r3 = r13.A04()     // Catch:{ 43Q -> 0x0984 }
            boolean r3 = r10.contains(r3)     // Catch:{ 43Q -> 0x0984 }
            if (r3 == 0) goto L_0x06f0
            android.util.Pair r4 = X.C89744cp.A00(r13)     // Catch:{ 43Q -> 0x0984 }
            java.lang.Object r3 = r4.first     // Catch:{ 43Q -> 0x0984 }
            r29 = r3
            java.lang.Object r14 = r4.second     // Catch:{ 43Q -> 0x0984 }
            X.1Vw r14 = (X.C28381Vw) r14     // Catch:{ 43Q -> 0x0984 }
            android.util.Pair r3 = X.C89744cp.A00(r11)     // Catch:{ 43Q -> 0x0984 }
            java.lang.Object r15 = r3.first     // Catch:{ 43Q -> 0x0984 }
            java.lang.Object r4 = r3.second     // Catch:{ 43Q -> 0x0984 }
            r3 = r29
            if (r3 != r15) goto L_0x06f0
            if (r14 == 0) goto L_0x06ee
            if (r4 == 0) goto L_0x06ee
            boolean r3 = r14.equals(r4)     // Catch:{ 43Q -> 0x0984 }
            if (r3 == 0) goto L_0x06f0
        L_0x06ee:
            r4 = 1
            goto L_0x06f1
        L_0x06f0:
            r4 = 0
        L_0x06f1:
            if (r9 == 0) goto L_0x06fe
            java.lang.String r3 = r13.A04()     // Catch:{ 43Q -> 0x0984 }
            boolean r3 = r9.contains(r3)     // Catch:{ 43Q -> 0x0984 }
            if (r3 == 0) goto L_0x06fe
            goto L_0x0700
        L_0x06fe:
            r22 = 0
        L_0x0700:
            if (r13 == r11) goto L_0x06b2
            if (r4 != 0) goto L_0x0706
            if (r22 == 0) goto L_0x06b2
        L_0x0706:
            long r14 = r13.A04     // Catch:{ 43Q -> 0x0984 }
            long r3 = r11.A04     // Catch:{ 43Q -> 0x0984 }
            int r22 = (r14 > r3 ? 1 : (r14 == r3 ? 0 : -1))
            if (r22 >= 0) goto L_0x0713
            boolean r3 = r12.A01(r11, r13)     // Catch:{ 43Q -> 0x0984 }
            goto L_0x0717
        L_0x0713:
            boolean r3 = r12.A01(r13, r11)     // Catch:{ 43Q -> 0x0984 }
        L_0x0717:
            if (r3 == 0) goto L_0x06b2
            r3 = r30
            X.139 r14 = r3.A01     // Catch:{ 43Q -> 0x0984 }
            java.lang.String r13 = "cross_index_conflict_counter"
            r3 = 1
            r14.A06(r13, r3)     // Catch:{ 43Q -> 0x0984 }
            goto L_0x06b2
        L_0x0725:
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ 43Q -> 0x0984 }
            r13.<init>()     // Catch:{ 43Q -> 0x0984 }
            java.util.HashSet r11 = new java.util.HashSet     // Catch:{ 43Q -> 0x0984 }
            r11.<init>()     // Catch:{ 43Q -> 0x0984 }
            X.00O r10 = r12.A00     // Catch:{ 43Q -> 0x0984 }
            int r9 = r10.size()     // Catch:{ 43Q -> 0x0984 }
            r4 = 0
        L_0x0736:
            if (r4 >= r9) goto L_0x0744
            java.lang.Object[] r3 = r10.A02     // Catch:{ 43Q -> 0x0984 }
            int r14 = r4 << 1
            r3 = r3[r14]     // Catch:{ 43Q -> 0x0984 }
            r12.A00(r3, r13, r11)     // Catch:{ 43Q -> 0x0984 }
            int r4 = r4 + 1
            goto L_0x0736
        L_0x0744:
            java.util.Iterator r12 = r13.iterator()     // Catch:{ 43Q -> 0x0984 }
        L_0x0748:
            boolean r3 = r12.hasNext()     // Catch:{ 43Q -> 0x0984 }
            if (r3 == 0) goto L_0x079d
            java.lang.Object r4 = r12.next()     // Catch:{ 43Q -> 0x0984 }
            X.1WJ r4 = (X.AnonymousClass1WJ) r4     // Catch:{ 43Q -> 0x0984 }
            X.0zx r10 = r7.A00(r4)     // Catch:{ 43Q -> 0x0984 }
            X.AnonymousClass00B.A06(r10)     // Catch:{ 43Q -> 0x0984 }
            X.0zv r9 = r7.A03     // Catch:{ all -> 0x08d2 }
            java.lang.String r3 = r4.A03()     // Catch:{ all -> 0x08d2 }
            X.1WJ r3 = r9.A05(r3)     // Catch:{ all -> 0x08d2 }
            r10.A09(r4, r3)     // Catch:{ all -> 0x08d2 }
            r7.A06(r4)     // Catch:{ 43Q -> 0x0984 }
            boolean r3 = r4 instanceof X.C37191ol     // Catch:{ 43Q -> 0x0984 }
            r11 = 3
            if (r3 == 0) goto L_0x0780
            X.1ol r4 = (X.C37191ol) r4     // Catch:{ 43Q -> 0x0984 }
            boolean r3 = r4.A02     // Catch:{ 43Q -> 0x0984 }
            X.0z4 r10 = r1.A0I     // Catch:{ 43Q -> 0x0984 }
            X.0rv r9 = r4.A01     // Catch:{ 43Q -> 0x0984 }
            r4 = r3 ^ 1
        L_0x077a:
            r3 = r28
            r10.A08(r9, r3, r11, r4)     // Catch:{ 43Q -> 0x0984 }
            goto L_0x0748
        L_0x0780:
            boolean r3 = r4 instanceof X.C37121oe     // Catch:{ 43Q -> 0x0984 }
            if (r3 == 0) goto L_0x0791
            X.1oe r4 = (X.C37121oe) r4     // Catch:{ 43Q -> 0x0984 }
            boolean r3 = r4.A02     // Catch:{ 43Q -> 0x0984 }
            X.0z4 r10 = r1.A0I     // Catch:{ 43Q -> 0x0984 }
            X.0rv r9 = r4.A01     // Catch:{ 43Q -> 0x0984 }
            r4 = 3
            if (r3 == 0) goto L_0x077a
            r4 = 2
            goto L_0x077a
        L_0x0791:
            boolean r3 = r4 instanceof X.C37231op     // Catch:{ 43Q -> 0x0984 }
            if (r3 == 0) goto L_0x0748
            X.0z4 r10 = r1.A0I     // Catch:{ 43Q -> 0x0984 }
            X.1op r4 = (X.C37231op) r4     // Catch:{ 43Q -> 0x0984 }
            X.0rv r9 = r4.A01     // Catch:{ 43Q -> 0x0984 }
            r4 = 4
            goto L_0x077a
        L_0x079d:
            java.util.Iterator r23 = r25.iterator()     // Catch:{ all -> 0x09c9 }
        L_0x07a1:
            boolean r3 = r23.hasNext()     // Catch:{ all -> 0x09c9 }
            if (r3 == 0) goto L_0x0836
            java.lang.Object r3 = r23.next()     // Catch:{ all -> 0x09c9 }
            X.1pU r3 = (X.C37641pU) r3     // Catch:{ all -> 0x09c9 }
            int r11 = r3.reason     // Catch:{ all -> 0x09c9 }
            r4 = 6
            r10 = 0
            if (r4 != r11) goto L_0x07b4
            r10 = 1
        L_0x07b4:
            java.lang.String r9 = "unexpected reason="
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x09c9 }
            r4.<init>(r9)     // Catch:{ all -> 0x09c9 }
            r4.append(r11)     // Catch:{ all -> 0x09c9 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x09c9 }
            X.AnonymousClass00B.A0D(r4, r10)     // Catch:{ all -> 0x09c9 }
            X.0zv r11 = r1.A0G     // Catch:{ all -> 0x09c9 }
            int r15 = r3.version     // Catch:{ all -> 0x09c9 }
            X.1Wg r14 = r3.operation     // Catch:{ all -> 0x09c9 }
            java.lang.String r10 = r3.index     // Catch:{ all -> 0x09c9 }
            X.AnonymousClass00B.A06(r10)     // Catch:{ all -> 0x09c9 }
            byte[] r12 = r3.mutationMac     // Catch:{ all -> 0x09c9 }
            X.1WK r9 = r3.syncdKeyId     // Catch:{ all -> 0x09c9 }
            X.AnonymousClass00B.A06(r9)     // Catch:{ all -> 0x09c9 }
            X.1Wl r13 = r3.syncActionValue     // Catch:{ all -> 0x09c9 }
            X.19K r3 = r11.A01     // Catch:{ all -> 0x09c9 }
            X.0tf r4 = r3.A02()     // Catch:{ all -> 0x09c9 }
            X.1cj r22 = r4.A00()     // Catch:{ all -> 0x08d9 }
            X.1Wg r3 = X.C28481Wg.A02     // Catch:{ all -> 0x08d4 }
            if (r14 != r3) goto L_0x0807
            X.0tg r11 = r4.A02     // Catch:{ all -> 0x08d4 }
            java.lang.String r3 = "DELETE FROM syncd_mutations WHERE mutation_index IN "
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x08d4 }
            r9.<init>(r3)     // Catch:{ all -> 0x08d4 }
            java.lang.String r3 = X.C34111ji.A00(r5)     // Catch:{ all -> 0x08d4 }
            r9.append(r3)     // Catch:{ all -> 0x08d4 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x08d4 }
            java.lang.String[] r3 = new java.lang.String[r5]     // Catch:{ all -> 0x08d4 }
            r3[r8] = r10     // Catch:{ all -> 0x08d4 }
            r11.A0C(r9, r3)     // Catch:{ all -> 0x08d4 }
        L_0x0803:
            r22.A00()     // Catch:{ all -> 0x08d4 }
            goto L_0x082e
        L_0x0807:
            X.1Wg r3 = X.C28481Wg.A03     // Catch:{ all -> 0x08d4 }
            if (r14 != r3) goto L_0x0803
            X.0tg r3 = r4.A02     // Catch:{ all -> 0x08d4 }
            X.AnonymousClass00B.A06(r13)     // Catch:{ all -> 0x08d4 }
            byte[] r36 = r13.A02()     // Catch:{ all -> 0x08d4 }
            java.lang.String r35 = X.C28501Wi.A00(r10)     // Catch:{ all -> 0x08d4 }
            r39 = 1
            r29 = r11
            r30 = r3
            r31 = r9
            r32 = r28
            r33 = r10
            r34 = r0
            r37 = r12
            r38 = r15
            r29.A0C(r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)     // Catch:{ all -> 0x08d4 }
            goto L_0x0803
        L_0x082e:
            r22.close()     // Catch:{ all -> 0x08d9 }
            r4.close()     // Catch:{ all -> 0x09c9 }
            goto L_0x07a1
        L_0x0836:
            if (r27 == 0) goto L_0x01ce
            goto L_0x08de
        L_0x083a:
            r20.close()     // Catch:{ all -> 0x09ce }
            r21.close()     // Catch:{ 1X9 -> 0x09d3 }
            monitor-exit(r7)     // Catch:{ all -> 0x0a27 }
            return r8
        L_0x0842:
            java.lang.String r3 = "SyncEncryptionHelper/validatePatchMac/patch mac mismatch"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ 1X5 | 1X7 -> 0x084f }
            r4 = 34
            X.1X9 r3 = new X.1X9     // Catch:{ 1X5 | 1X7 -> 0x084f }
            r3.<init>(r4, r0)     // Catch:{ 1X5 | 1X7 -> 0x084f }
            throw r3     // Catch:{ 1X5 | 1X7 -> 0x084f }
        L_0x084f:
            r4 = move-exception
            java.lang.String r3 = "SyncEncryptionHelper/validatePatchIntegrity: "
            com.whatsapp.util.Log.e(r3, r4)     // Catch:{ all -> 0x09c9 }
            r3 = 10
            X.1X9 r4 = new X.1X9     // Catch:{ all -> 0x09c9 }
            r4.<init>(r3, r0)     // Catch:{ all -> 0x09c9 }
            goto L_0x09c8
        L_0x085e:
            java.lang.String r3 = "SyncEncryptionHelper/validatePatchMac/No snapshot mac"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x09c9 }
            r3 = 47
            X.1X9 r4 = new X.1X9     // Catch:{ all -> 0x09c9 }
            r4.<init>(r3, r0)     // Catch:{ all -> 0x09c9 }
            goto L_0x09c8
        L_0x086c:
            java.lang.String r3 = "SyncEncryptionHelper/validatePatchMac/No patch mac"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x09c9 }
            r3 = 48
            X.1X9 r4 = new X.1X9     // Catch:{ all -> 0x09c9 }
            r4.<init>(r3, r0)     // Catch:{ all -> 0x09c9 }
            goto L_0x09c8
        L_0x087a:
            r4 = move-exception
            java.lang.String r3 = "SyncResponseHandler/applyMutations"
            com.whatsapp.util.Log.e(r3, r4)     // Catch:{ all -> 0x09c9 }
            r3 = 7
            X.1X9 r4 = new X.1X9     // Catch:{ all -> 0x09c9 }
            r4.<init>(r3, r0)     // Catch:{ all -> 0x09c9 }
            goto L_0x09c8
        L_0x0888:
            r3 = 1783(0x6f7, float:2.499E-42)
            boolean r3 = r4.A0E(r11, r3)     // Catch:{ 1X5 | 1X7 -> 0x089d }
            if (r3 == 0) goto L_0x0895
            r3 = 16
            r10.A01(r3, r0)     // Catch:{ 1X5 | 1X7 -> 0x089d }
        L_0x0895:
            r4 = 60
            X.1X9 r3 = new X.1X9     // Catch:{ 1X5 | 1X7 -> 0x089d }
            r3.<init>(r4, r0)     // Catch:{ 1X5 | 1X7 -> 0x089d }
            throw r3     // Catch:{ 1X5 | 1X7 -> 0x089d }
        L_0x089d:
            r4 = move-exception
            java.lang.String r3 = "SyncEncryptionHelper/validateSnapshotMac: "
            com.whatsapp.util.Log.e(r3, r4)     // Catch:{ all -> 0x09c9 }
            r3 = 10
            X.1X9 r4 = new X.1X9     // Catch:{ all -> 0x09c9 }
            r4.<init>(r3, r0)     // Catch:{ all -> 0x09c9 }
            goto L_0x09c8
        L_0x08ac:
            java.lang.String r3 = "SyncEncryptionHelper/validateSnapshotMac/snapshot mac mismatch"
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ 1X5 | 1X7 -> 0x08b9 }
            r4 = 61
            X.1X9 r3 = new X.1X9     // Catch:{ 1X5 | 1X7 -> 0x08b9 }
            r3.<init>(r4, r0)     // Catch:{ 1X5 | 1X7 -> 0x08b9 }
            throw r3     // Catch:{ 1X5 | 1X7 -> 0x08b9 }
        L_0x08b9:
            r4 = move-exception
            java.lang.String r3 = "SyncEncryptionHelper/validateSnapshotMac: "
            com.whatsapp.util.Log.e(r3, r4)     // Catch:{ all -> 0x09c9 }
            r3 = 10
            X.1X9 r4 = new X.1X9     // Catch:{ all -> 0x09c9 }
            r4.<init>(r3, r0)     // Catch:{ all -> 0x09c9 }
            goto L_0x09c8
        L_0x08c8:
            r0 = move-exception
            r12.close()     // Catch:{ all -> 0x08cc }
        L_0x08cc:
            throw r0     // Catch:{ all -> 0x08cd }
        L_0x08cd:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x08dd }
            goto L_0x08dd
        L_0x08d2:
            r3 = move-exception
            throw r3     // Catch:{ 43Q -> 0x0984 }
        L_0x08d4:
            r0 = move-exception
            r22.close()     // Catch:{ all -> 0x08d8 }
        L_0x08d8:
            throw r0     // Catch:{ all -> 0x08d9 }
        L_0x08d9:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x08dd }
        L_0x08dd:
            throw r0     // Catch:{ all -> 0x09c9 }
        L_0x08de:
            r10 = r44
            r9 = r27
            r3 = r18
            r10.A05(r0, r9, r3)     // Catch:{ all -> 0x09c9 }
            r20.A00()     // Catch:{ all -> 0x09c9 }
            if (r52 == 0) goto L_0x097c
            X.1Cd r4 = r1.A02     // Catch:{ all -> 0x09c9 }
            if (r47 == 0) goto L_0x08f1
            r8 = 1
        L_0x08f1:
            X.3sa r3 = new X.3sa     // Catch:{ all -> 0x09c9 }
            r3.<init>()     // Catch:{ all -> 0x09c9 }
            r9 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x09c9 }
            r3.A04 = r6     // Catch:{ all -> 0x09c9 }
            java.util.Set r6 = X.AnonymousClass1WJ.A09     // Catch:{ all -> 0x09c9 }
            boolean r6 = r6.contains(r0)     // Catch:{ all -> 0x09c9 }
            if (r6 != 0) goto L_0x0906
            r9 = 2
        L_0x0906:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x09c9 }
            r3.A03 = r6     // Catch:{ all -> 0x09c9 }
            java.lang.String r6 = r4.A00()     // Catch:{ all -> 0x09c9 }
            r3.A08 = r6     // Catch:{ all -> 0x09c9 }
            int r6 = r0.hashCode()     // Catch:{ all -> 0x09c9 }
            switch(r6) {
                case -849492943: goto L_0x0921;
                case -564602779: goto L_0x092a;
                case -498584183: goto L_0x0933;
                case 207170541: goto L_0x093c;
                case 1086463900: goto L_0x0945;
                default: goto L_0x0919;
            }     // Catch:{ all -> 0x09c9 }
        L_0x0919:
            java.lang.String r3 = "CompanionSyncStatsLogger/convertToWamCollection received undefined collection name"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x09c9 }
            r0.<init>(r3)     // Catch:{ all -> 0x09c9 }
            throw r0     // Catch:{ all -> 0x09c9 }
        L_0x0921:
            java.lang.String r6 = "regular_low"
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x09c9 }
            if (r0 == 0) goto L_0x0919
            goto L_0x094e
        L_0x092a:
            java.lang.String r6 = "regular_high"
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x09c9 }
            if (r0 == 0) goto L_0x0919
            goto L_0x0950
        L_0x0933:
            java.lang.String r6 = "critical_unblock_low"
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x09c9 }
            if (r0 == 0) goto L_0x0919
            goto L_0x0952
        L_0x093c:
            java.lang.String r6 = "critical_block"
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x09c9 }
            if (r0 == 0) goto L_0x0919
            goto L_0x0954
        L_0x0945:
            java.lang.String r6 = "regular"
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x09c9 }
            if (r0 == 0) goto L_0x0919
            goto L_0x0956
        L_0x094e:
            r0 = 2
            goto L_0x0957
        L_0x0950:
            r0 = 3
            goto L_0x0957
        L_0x0952:
            r0 = 5
            goto L_0x0957
        L_0x0954:
            r0 = 4
            goto L_0x0957
        L_0x0956:
            r0 = 1
        L_0x0957:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x09c9 }
            r3.A01 = r0     // Catch:{ all -> 0x09c9 }
            X.0t3 r0 = r4.A03     // Catch:{ all -> 0x09c9 }
            long r9 = r0.A00()     // Catch:{ all -> 0x09c9 }
            java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x09c9 }
            r3.A07 = r0     // Catch:{ all -> 0x09c9 }
            long r9 = r9 - r16
            java.lang.Long r0 = java.lang.Long.valueOf(r9)     // Catch:{ all -> 0x09c9 }
            r3.A06 = r0     // Catch:{ all -> 0x09c9 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)     // Catch:{ all -> 0x09c9 }
            r3.A00 = r0     // Catch:{ all -> 0x09c9 }
            X.0t9 r0 = r4.A06     // Catch:{ all -> 0x09c9 }
            r0.A06(r3)     // Catch:{ all -> 0x09c9 }
        L_0x097c:
            r20.close()     // Catch:{ all -> 0x09ce }
            r21.close()     // Catch:{ 1X9 -> 0x09d3 }
            monitor-exit(r7)     // Catch:{ all -> 0x0a27 }
            return r5
        L_0x0984:
            r5 = move-exception
            java.lang.String r4 = "SyncResponseHandler/applyMutations cyclic mutation e="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x09c9 }
            r3.<init>(r4)     // Catch:{ all -> 0x09c9 }
            r3.append(r5)     // Catch:{ all -> 0x09c9 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x09c9 }
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x09c9 }
            r3 = 39
            X.1X9 r4 = new X.1X9     // Catch:{ all -> 0x09c9 }
            r4.<init>(r3, r0)     // Catch:{ all -> 0x09c9 }
            goto L_0x09c8
        L_0x099e:
            java.lang.String r4 = "SyncResponseHandler/verifyCollectionVersion fail for incoming patch, currentVersion="
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x09c9 }
            r5.<init>(r4)     // Catch:{ all -> 0x09c9 }
            r5.append(r3)     // Catch:{ all -> 0x09c9 }
            java.lang.String r3 = "; newVersion="
            r5.append(r3)     // Catch:{ all -> 0x09c9 }
            r3 = r18
            r5.append(r3)     // Catch:{ all -> 0x09c9 }
            java.lang.String r3 = "; collection="
            r5.append(r3)     // Catch:{ all -> 0x09c9 }
            r5.append(r0)     // Catch:{ all -> 0x09c9 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x09c9 }
            com.whatsapp.util.Log.e((java.lang.String) r3)     // Catch:{ all -> 0x09c9 }
            r3 = 73
            X.1X9 r4 = new X.1X9     // Catch:{ all -> 0x09c9 }
            r4.<init>(r3, r0)     // Catch:{ all -> 0x09c9 }
        L_0x09c8:
            throw r4     // Catch:{ all -> 0x09c9 }
        L_0x09c9:
            r0 = move-exception
            r20.close()     // Catch:{ all -> 0x09cd }
        L_0x09cd:
            throw r0     // Catch:{ all -> 0x09ce }
        L_0x09ce:
            r0 = move-exception
            r21.close()     // Catch:{ all -> 0x09d2 }
        L_0x09d2:
            throw r0     // Catch:{ 1X9 -> 0x09d3 }
        L_0x09d3:
            r4 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a27 }
            r3.<init>()     // Catch:{ all -> 0x0a27 }
            java.lang.String r0 = "SyncResponseHandler/handleIncomingPatches applyMutations ex="
            r3.append(r0)     // Catch:{ all -> 0x0a27 }
            r3.append(r4)     // Catch:{ all -> 0x0a27 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0a27 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0a27 }
            if (r46 == 0) goto L_0x0a26
            int r0 = r2.A00     // Catch:{ all -> 0x0a27 }
            r3 = 64
            r0 = r0 & 64
            if (r0 != r3) goto L_0x0a26
            int r3 = r2.A01     // Catch:{ all -> 0x0a27 }
            X.0yO r0 = r1.A0E     // Catch:{ all -> 0x0a27 }
            X.1WN r2 = r0.A05(r3)     // Catch:{ all -> 0x0a27 }
            if (r2 == 0) goto L_0x0a26
            java.lang.String r0 = "SyncResponseHandler/logCompanionInfo companion: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0a27 }
            r1.<init>(r0)     // Catch:{ all -> 0x0a27 }
            r1.append(r3)     // Catch:{ all -> 0x0a27 }
            java.lang.String r0 = "; ["
            r1.append(r0)     // Catch:{ all -> 0x0a27 }
            X.1p8 r0 = r2.A07     // Catch:{ all -> 0x0a27 }
            r1.append(r0)     // Catch:{ all -> 0x0a27 }
            r0 = 40
            r1.append(r0)     // Catch:{ all -> 0x0a27 }
            java.lang.String r0 = r2.A08     // Catch:{ all -> 0x0a27 }
            r1.append(r0)     // Catch:{ all -> 0x0a27 }
            java.lang.String r0 = ")]"
            r1.append(r0)     // Catch:{ all -> 0x0a27 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0a27 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0a27 }
        L_0x0a26:
            throw r4     // Catch:{ all -> 0x0a27 }
        L_0x0a27:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0a27 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28451Wd.A07(X.1XC, X.2Mn, java.lang.String, java.util.List, long, boolean):boolean");
    }
}
