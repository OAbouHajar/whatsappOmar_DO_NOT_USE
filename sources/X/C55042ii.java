package X;

import android.accounts.Account;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import com.obwhatsapp.R;
import com.obwhatsapp.backup.google.PromptDialogFragment;
import com.obwhatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.2ii  reason: invalid class name and case insensitive filesystem */
public class C55042ii extends C16690tT {
    public final C14870pt A00;
    public final C19670yo A01;
    public final AnonymousClass38P A02;
    public final C16190sc A03;
    public final C16980tz A04;
    public final C15860rz A05;
    public final C16250si A06;
    public final C28921Zf A07 = new C28921Zf("gdrive-activity/one-time-setup");
    public final WeakReference A08;
    public final Set A09;
    public final Timer A0A = new Timer("perform-one-time-setup");
    public final AtomicBoolean A0B;
    public final AtomicBoolean A0C;
    public final Account[] A0D;

    public C55042ii(C14870pt r3, C19670yo r4, RestoreFromBackupActivity restoreFromBackupActivity, AnonymousClass38P r6, C16190sc r7, C16980tz r8, C15860rz r9, C16250si r10, Set set, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2, Account[] accountArr) {
        this.A04 = r8;
        this.A00 = r3;
        this.A03 = r7;
        this.A06 = r10;
        this.A05 = r9;
        this.A02 = r6;
        this.A01 = r4;
        this.A0D = accountArr;
        this.A09 = set;
        this.A0C = atomicBoolean;
        this.A0B = atomicBoolean2;
        this.A08 = new WeakReference(restoreFromBackupActivity);
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
        	at jadx.core.dex.visitors.regions.RegionMaker.processHandlersOutBlocks(RegionMaker.java:1008)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:978)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:52)
        */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x038c A[Catch:{ all -> 0x039c, InterruptedException -> 0x03a1 }, LOOP:2: B:132:0x0388->B:135:0x038c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0392 A[EDGE_INSN: B:136:0x0392->B:137:? ?: BREAK  , SYNTHETIC, Splitter:B:136:0x0392] */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x03a9 A[Catch:{ 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, all -> 0x041a }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0187 A[ExcHandler: 3iO | 3iP | 3iS | 3ia (r2v11 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:40:0x011c] */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r39) {
        /*
            r38 = this;
            r12 = r38
            java.lang.ref.WeakReference r0 = r12.A08
            java.lang.Object r0 = r0.get()
            r11 = 0
            if (r0 == 0) goto L_0x0422
            X.38P r10 = r12.A02
            X.AnonymousClass00B.A00()
            X.0si r9 = r12.A06
            X.0rz r0 = r12.A05
            r37 = r0
            X.0tz r0 = r12.A04
            android.content.Context r0 = r0.A00
            boolean r0 = X.C437421i.A01(r0)
            r20 = 0
            if (r0 != 0) goto L_0x0028
            java.lang.String r0 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup/google-play-services-not-available"
        L_0x0024:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r20
        L_0x0028:
            java.lang.String r7 = r37.A0P()
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x0035
            java.lang.String r0 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup/jid-user is null"
            goto L_0x0024
        L_0x0035:
            X.0yo r2 = r12.A01
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.A0k
            r36 = r0
            r1 = 1
            r0.set(r1)
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            r2.A09(r0)
            r2.A05()
            r2.A07()
            android.accounts.Account[] r6 = r12.A0D     // Catch:{ all -> 0x041a }
            int r5 = r6.length     // Catch:{ all -> 0x041a }
            r4 = 0
            r8 = r11
        L_0x0051:
            if (r4 >= r5) goto L_0x01c7
            r14 = r6[r4]     // Catch:{ all -> 0x041a }
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.A0B     // Catch:{ all -> 0x041a }
            boolean r0 = r0.get()     // Catch:{ all -> 0x041a }
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup/canceled"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x041a }
            goto L_0x0413
        L_0x0064:
            java.util.Set r13 = r12.A09     // Catch:{ all -> 0x041a }
            boolean r0 = r13.contains(r14)     // Catch:{ all -> 0x041a }
            if (r0 == 0) goto L_0x0088
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x041a }
            r1.<init>()     // Catch:{ all -> 0x041a }
            java.lang.String r0 = "one-time-setup/skipping-account-with-no-backup/"
            r1.append(r0)     // Catch:{ all -> 0x041a }
            java.lang.String r0 = r14.name     // Catch:{ all -> 0x041a }
            java.lang.String r0 = X.AnonymousClass2GK.A0B(r0)     // Catch:{ all -> 0x041a }
            r1.append(r0)     // Catch:{ all -> 0x041a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x041a }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x041a }
            goto L_0x01c3
        L_0x0088:
            java.lang.String r0 = r14.name     // Catch:{ all -> 0x041a }
            r34 = r0
            X.AnonymousClass2GK.A0B(r34)     // Catch:{ all -> 0x041a }
            X.0tz r0 = r10.A09     // Catch:{ 3iQ -> 0x0155 }
            android.content.Context r0 = r0.A00     // Catch:{ 3iQ -> 0x0155 }
            r22 = r0
            X.0pd r0 = r10.A0D     // Catch:{ 3iQ -> 0x0155 }
            r30 = r0
            X.0so r0 = r10.A00     // Catch:{ 3iQ -> 0x0155 }
            r23 = r0
            X.0vR r0 = r10.A0F     // Catch:{ 3iQ -> 0x0155 }
            r32 = r0
            X.0ua r0 = r10.A02     // Catch:{ 3iQ -> 0x0155 }
            r19 = r0
            X.0sc r0 = r10.A08     // Catch:{ 3iQ -> 0x0155 }
            r18 = r0
            X.0sd r0 = r10.A04     // Catch:{ 3iQ -> 0x0155 }
            r17 = r0
            X.12T r0 = r10.A05     // Catch:{ 3iQ -> 0x0155 }
            r16 = r0
            X.0sj r15 = r10.A0A     // Catch:{ 3iQ -> 0x0155 }
            X.0tB r3 = r10.A0E     // Catch:{ 3iQ -> 0x0155 }
            X.0wP r2 = r10.A07     // Catch:{ 3iQ -> 0x0155 }
            X.0sq r1 = r10.A0G     // Catch:{ 3iQ -> 0x0155 }
            java.lang.String r35 = "restore"
            X.2GM r0 = new X.2GM     // Catch:{ 3iQ -> 0x0155 }
            r21 = r0
            r24 = r19
            r25 = r17
            r26 = r16
            r27 = r2
            r28 = r18
            r29 = r15
            r31 = r3
            r33 = r1
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)     // Catch:{ 3iQ -> 0x0155 }
            X.2GJ r3 = r10.A06     // Catch:{ all -> 0x0153 }
            r15 = 5
            X.3i7 r2 = new X.3i7     // Catch:{ all -> 0x0153 }
            r2.<init>(r0)     // Catch:{ all -> 0x0153 }
            java.lang.String r1 = "gdrive-backup-util/fetch-token"
            java.lang.Object r1 = X.AnonymousClass2GS.A01(r2, r3, r1, r15)     // Catch:{ all -> 0x0153 }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x0153 }
            if (r1 == 0) goto L_0x014d
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0153 }
            if (r1 == 0) goto L_0x014d
            java.lang.String r2 = "restore>BackupApiBackupSelector/create-internal-data"
            X.3iA r1 = new X.3iA     // Catch:{ 3iM -> 0x016b }
            r1.<init>(r0, r7)     // Catch:{ 3iM -> 0x016b }
            java.lang.Object r2 = X.AnonymousClass2GS.A00(r1, r3, r2)     // Catch:{ 3iM -> 0x016b }
            X.3BK r2 = (X.AnonymousClass3BK) r2     // Catch:{ 3iM -> 0x016b }
            if (r2 == 0) goto L_0x016b
            org.json.JSONObject r15 = r2.A0B     // Catch:{ all -> 0x0153 }
            r0 = -1
            if (r15 == 0) goto L_0x0147
            java.lang.String r3 = "chatdbSize"
            long r17 = r15.optLong(r3, r0)     // Catch:{ all -> 0x0153 }
            r15 = 0
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x0147
            X.1uy r1 = r10.A03     // Catch:{ all -> 0x0153 }
            org.json.JSONObject r0 = r2.A03()     // Catch:{ all -> 0x0153 }
            boolean r0 = r1.A04(r0)     // Catch:{ all -> 0x0153 }
            if (r0 == 0) goto L_0x016b
            X.3i3 r15 = new X.3i3     // Catch:{ all -> 0x0153 }
            r15.<init>(r2, r10)     // Catch:{ all -> 0x0153 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187 }
            r1.<init>()     // Catch:{ 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187 }
            java.lang.String r0 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup "
            r1.append(r0)     // Catch:{ 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187 }
            java.lang.String r0 = X.AnonymousClass2GK.A0B(r34)     // Catch:{ 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187 }
            r1.append(r0)     // Catch:{ 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187 }
            java.lang.String r0 = " has google backup created on "
            r1.append(r0)     // Catch:{ 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187 }
            long r2 = r15.A04     // Catch:{ 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187 }
            r1.append(r2)     // Catch:{ 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187 }
            java.lang.String r0 = r1.toString()     // Catch:{ 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187 }
            if (r8 == 0) goto L_0x01c2
            long r0 = r8.A04     // Catch:{ 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187 }
            int r13 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r13 <= 0) goto L_0x01c3
            goto L_0x01c2
        L_0x0147:
            java.lang.String r0 = "restore>BackupApiBackupSelector/backup is not valid, its chat db size is 0"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x0153 }
            goto L_0x016b
        L_0x014d:
            X.3iO r0 = new X.3iO     // Catch:{ all -> 0x0153 }
            r0.<init>(r11)     // Catch:{ all -> 0x0153 }
            throw r0     // Catch:{ all -> 0x0153 }
        L_0x0153:
            r0 = move-exception
            throw r0     // Catch:{ 3iQ -> 0x0155 }
        L_0x0155:
            r2 = move-exception
            java.lang.String r0 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup/google drive api disabled on google side for "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187 }
            r1.<init>(r0)     // Catch:{ 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187 }
            java.lang.String r0 = X.AnonymousClass2GK.A0B(r34)     // Catch:{ 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187 }
            r1.append(r0)     // Catch:{ 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187 }
            java.lang.String r0 = r1.toString()     // Catch:{ 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187 }
            com.whatsapp.util.Log.i(r0, r2)     // Catch:{ 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187 }
        L_0x016b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187 }
            r1.<init>()     // Catch:{ 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187 }
            java.lang.String r0 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup/account-with-no-backup/"
            r1.append(r0)     // Catch:{ 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187 }
            java.lang.String r0 = X.AnonymousClass2GK.A0B(r34)     // Catch:{ 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187 }
            r1.append(r0)     // Catch:{ 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187 }
            java.lang.String r0 = r1.toString()     // Catch:{ 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187 }
            r13.add(r14)     // Catch:{ 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187, 3iO | 3iP | 3iS | 3ia -> 0x0187 }
            goto L_0x01c3
        L_0x0187:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x041a }
            r1.<init>()     // Catch:{ all -> 0x041a }
            java.lang.String r0 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup failed to access account: "
            r1.append(r0)     // Catch:{ all -> 0x041a }
            java.lang.String r0 = X.AnonymousClass2GK.A0B(r34)     // Catch:{ all -> 0x041a }
            r1.append(r0)     // Catch:{ all -> 0x041a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x041a }
            com.whatsapp.util.Log.i(r0, r2)     // Catch:{ all -> 0x041a }
            boolean r0 = X.AnonymousClass2GK.A0I(r37)     // Catch:{ all -> 0x041a }
            if (r0 == 0) goto L_0x01c3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x041a }
            r1.<init>()     // Catch:{ all -> 0x041a }
            java.lang.String r0 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup/new-user/add-account-to-no-backup-found "
            r1.append(r0)     // Catch:{ all -> 0x041a }
            java.lang.String r0 = X.AnonymousClass2GK.A0B(r34)     // Catch:{ all -> 0x041a }
            r1.append(r0)     // Catch:{ all -> 0x041a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x041a }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x041a }
            r13.add(r14)     // Catch:{ all -> 0x041a }
            goto L_0x01c3
        L_0x01c2:
            r8 = r15
        L_0x01c3:
            int r4 = r4 + 1
            goto L_0x0051
        L_0x01c7:
            if (r8 != 0) goto L_0x01e6
            java.util.concurrent.atomic.AtomicBoolean r3 = r12.A0C     // Catch:{ IOException -> 0x01e0 }
            java.io.File r2 = r9.A0A()     // Catch:{ IOException -> 0x01e0 }
            boolean r1 = r3.get()     // Catch:{ IOException -> 0x01e0 }
            java.lang.String r0 = r37.A0P()     // Catch:{ IOException -> 0x01e0 }
            boolean r0 = X.AnonymousClass2GK.A0J(r9, r2, r0, r1)     // Catch:{ IOException -> 0x01e0 }
            r3.set(r0)     // Catch:{ IOException -> 0x01e0 }
            goto L_0x0413
        L_0x01e0:
            r0 = move-exception
            com.whatsapp.util.Log.w((java.lang.Throwable) r0)     // Catch:{ all -> 0x041a }
            goto L_0x0413
        L_0x01e6:
            X.38P r13 = r8.A02     // Catch:{ all -> 0x041a }
            X.AnonymousClass00B.A00()     // Catch:{ all -> 0x041a }
            java.lang.String r2 = "restore>BackupApiBackupSelector/decide"
            X.1Zf r19 = new X.1Zf     // Catch:{ all -> 0x041a }
            r0 = r19
            r0.<init>((java.lang.String) r2)     // Catch:{ all -> 0x041a }
            X.3BK r12 = r8.A01     // Catch:{ all -> 0x041a }
            org.json.JSONObject r9 = r12.A0B     // Catch:{ all -> 0x041a }
            r1 = 0
            if (r9 != 0) goto L_0x01fd
            r7 = 0
            goto L_0x0203
        L_0x01fd:
            java.lang.String r0 = "encryptedBackupEnabled"
            boolean r7 = r9.optBoolean(r0, r1)     // Catch:{ all -> 0x041a }
        L_0x0203:
            X.2GJ r0 = r13.A06     // Catch:{ 1db -> 0x040c }
            java.util.Map r18 = X.C62173By.A01(r0, r12)     // Catch:{ 1db -> 0x040c }
            r6 = 0
            if (r18 == 0) goto L_0x0413
            X.0si r11 = r13.A0C     // Catch:{ 3iZ -> 0x03f5 }
            java.io.File[] r10 = r11.A0K()     // Catch:{ 3iZ -> 0x03f5 }
            int r5 = r10.length     // Catch:{ 3iZ -> 0x03f5 }
            r4 = 0
        L_0x0214:
            if (r4 >= r5) goto L_0x0245
            r2 = r10[r4]     // Catch:{ 3iZ -> 0x03f5 }
            X.0sc r1 = r13.A08     // Catch:{ 3iZ -> 0x03f5 }
            X.0tz r0 = r13.A09     // Catch:{ 3iZ -> 0x03f5 }
            android.content.Context r0 = r0.A00     // Catch:{ 3iZ -> 0x03f5 }
            java.lang.String r1 = X.AnonymousClass2GK.A08(r0, r1, r2)     // Catch:{ 3iZ -> 0x03f5 }
            if (r1 == 0) goto L_0x0231
            r0 = r18
            java.lang.Object r3 = r0.get(r1)     // Catch:{ 3iZ -> 0x03f5 }
            X.3Ad r3 = (X.C61743Ad) r3     // Catch:{ 3iZ -> 0x03f5 }
            if (r3 != 0) goto L_0x0246
            int r4 = r4 + 1
            goto L_0x0214
        L_0x0231:
            java.lang.String r1 = "restore>BackupApiBackupSelector/decide upload title is null for "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ 3iZ -> 0x03f5 }
            r0.<init>(r1)     // Catch:{ 3iZ -> 0x03f5 }
            r0.append(r2)     // Catch:{ 3iZ -> 0x03f5 }
            java.lang.String r1 = r0.toString()     // Catch:{ 3iZ -> 0x03f5 }
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ 3iZ -> 0x03f5 }
            r0.<init>(r1)     // Catch:{ 3iZ -> 0x03f5 }
            throw r0     // Catch:{ 3iZ -> 0x03f5 }
        L_0x0245:
            r3 = 0
        L_0x0246:
            java.io.File r10 = r11.A0A()     // Catch:{ IOException -> 0x024b }
            goto L_0x0252
        L_0x024b:
            r1 = move-exception
            java.lang.String r0 = "restore>BackupApiBackupSelector/device unable to access local backup"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ 3iZ -> 0x03f5 }
            r10 = 0
        L_0x0252:
            java.util.concurrent.atomic.AtomicBoolean r0 = r13.A0J     // Catch:{ 3iZ -> 0x03f5 }
            boolean r1 = r0.get()     // Catch:{ 3iZ -> 0x03f5 }
            X.0rz r5 = r13.A0B     // Catch:{ 3iZ -> 0x03f5 }
            java.lang.String r0 = r5.A0P()     // Catch:{ 3iZ -> 0x03f5 }
            boolean r0 = X.AnonymousClass2GK.A0J(r11, r10, r0, r1)     // Catch:{ 3iZ -> 0x03f5 }
            r4 = 2
            if (r0 != 0) goto L_0x0270
            r0 = 1
            r5.A1I(r0)     // Catch:{ 3iZ -> 0x03f5 }
            if (r3 != 0) goto L_0x026c
            r4 = 4
        L_0x026c:
            r11.A00 = r4     // Catch:{ 3iZ -> 0x03f5 }
            goto L_0x0302
        L_0x0270:
            if (r3 != 0) goto L_0x027d
            java.lang.String r0 = "restore>BackupApiBackupSelector/decide remote dbFile does not exist"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 3iZ -> 0x03f5 }
            r5.A1I(r6)     // Catch:{ 3iZ -> 0x03f5 }
            r0 = 3
            goto L_0x034c
        L_0x027d:
            X.4WW r0 = r3.A02     // Catch:{ 3iZ -> 0x03f5 }
            if (r0 == 0) goto L_0x029f
            java.lang.String r14 = r0.A03     // Catch:{ 3iZ -> 0x03f5 }
        L_0x0283:
            X.0sc r0 = r13.A08     // Catch:{ 3iZ -> 0x03f5 }
            r2 = r0
            X.0sj r15 = r13.A0A     // Catch:{ 3iZ -> 0x03f5 }
            long r0 = r10.length()     // Catch:{ 3iZ -> 0x03f5 }
            java.lang.String r0 = X.AnonymousClass2GK.A09(r2, r15, r10, r0)     // Catch:{ 3iZ -> 0x03f5 }
            boolean r0 = r14.equals(r0)     // Catch:{ 3iZ -> 0x03f5 }
            if (r0 == 0) goto L_0x02a5
            java.lang.String r0 = "restore>BackupApiBackupSelector/decide Local message backup has same md5 as google drive."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 3iZ -> 0x03f5 }
            r5.A1I(r6)     // Catch:{ 3iZ -> 0x03f5 }
            goto L_0x02a2
        L_0x029f:
            java.lang.String r14 = r3.A03     // Catch:{ 3iZ -> 0x03f5 }
            goto L_0x0283
        L_0x02a2:
            r0 = 5
            goto L_0x034c
        L_0x02a5:
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch:{ 3iZ -> 0x03f5 }
            java.text.DateFormat r14 = java.text.DateFormat.getDateInstance(r4, r0)     // Catch:{ 3iZ -> 0x03f5 }
            long r15 = r10.lastModified()     // Catch:{ 3iZ -> 0x03f5 }
            long r3 = r3.A01     // Catch:{ 3iZ -> 0x03f5 }
            java.lang.String r2 = ", time: "
            int r0 = (r15 > r3 ? 1 : (r15 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0304
            java.lang.String r0 = "restore>BackupApiBackupSelector/decide/choose-remote Google Drive (timestamp "
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ 3iZ -> 0x03f5 }
            r15.<init>(r0)     // Catch:{ 3iZ -> 0x03f5 }
            r15.append(r3)     // Catch:{ 3iZ -> 0x03f5 }
            r15.append(r2)     // Catch:{ 3iZ -> 0x03f5 }
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ 3iZ -> 0x03f5 }
            java.lang.String r0 = r14.format(r0)     // Catch:{ 3iZ -> 0x03f5 }
            r15.append(r0)     // Catch:{ 3iZ -> 0x03f5 }
            java.lang.String r0 = ") is newer than local message backup (timestamp "
            r15.append(r0)     // Catch:{ 3iZ -> 0x03f5 }
            long r0 = r10.lastModified()     // Catch:{ 3iZ -> 0x03f5 }
            r15.append(r0)     // Catch:{ 3iZ -> 0x03f5 }
            r15.append(r2)     // Catch:{ 3iZ -> 0x03f5 }
            long r0 = r10.lastModified()     // Catch:{ 3iZ -> 0x03f5 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ 3iZ -> 0x03f5 }
            java.lang.String r0 = r14.format(r0)     // Catch:{ 3iZ -> 0x03f5 }
            r15.append(r0)     // Catch:{ 3iZ -> 0x03f5 }
            java.lang.String r0 = ")"
            r15.append(r0)     // Catch:{ 3iZ -> 0x03f5 }
            java.lang.String r0 = r15.toString()     // Catch:{ 3iZ -> 0x03f5 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 3iZ -> 0x03f5 }
            r0 = 1
            r5.A1I(r0)     // Catch:{ 3iZ -> 0x03f5 }
            r0 = 6
            r11.A00 = r0     // Catch:{ 3iZ -> 0x03f5 }
        L_0x0302:
            r4 = 1
            goto L_0x0369
        L_0x0304:
            java.lang.String r0 = "restore>BackupApiBackupSelector/decide/choose-local local backup file (timestamp "
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ 3iZ -> 0x03f5 }
            r15.<init>(r0)     // Catch:{ 3iZ -> 0x03f5 }
            long r16 = r10.lastModified()     // Catch:{ 3iZ -> 0x03f5 }
            r0 = r16
            r15.append(r0)     // Catch:{ 3iZ -> 0x03f5 }
            r15.append(r2)     // Catch:{ 3iZ -> 0x03f5 }
            long r0 = r10.lastModified()     // Catch:{ 3iZ -> 0x03f5 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ 3iZ -> 0x03f5 }
            java.lang.String r0 = r14.format(r0)     // Catch:{ 3iZ -> 0x03f5 }
            r15.append(r0)     // Catch:{ 3iZ -> 0x03f5 }
            java.lang.String r0 = ") and is newer than one on Google Drive (timestamp "
            r15.append(r0)     // Catch:{ 3iZ -> 0x03f5 }
            r15.append(r3)     // Catch:{ 3iZ -> 0x03f5 }
            r15.append(r2)     // Catch:{ 3iZ -> 0x03f5 }
            java.lang.Long r0 = java.lang.Long.valueOf(r3)     // Catch:{ 3iZ -> 0x03f5 }
            java.lang.String r0 = r14.format(r0)     // Catch:{ 3iZ -> 0x03f5 }
            r15.append(r0)     // Catch:{ 3iZ -> 0x03f5 }
            java.lang.String r0 = ") and the two files are different as well, therefore, we will use the local"
            r15.append(r0)     // Catch:{ 3iZ -> 0x03f5 }
            java.lang.String r0 = r15.toString()     // Catch:{ 3iZ -> 0x03f5 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 3iZ -> 0x03f5 }
            r5.A1I(r6)     // Catch:{ 3iZ -> 0x03f5 }
            r0 = 7
        L_0x034c:
            r11.A00 = r0     // Catch:{ 3iZ -> 0x03f5 }
            r4 = 0
            java.io.File r0 = r11.A0A()     // Catch:{ IOException -> 0x0363 }
            if (r0 == 0) goto L_0x0369
            java.lang.String r0 = r0.getName()     // Catch:{ IOException -> 0x0363 }
            X.0tx r1 = X.C40721ua.A00(r0)     // Catch:{ IOException -> 0x0363 }
            X.0tx r0 = X.C16960tx.A07     // Catch:{ IOException -> 0x0363 }
            if (r1 != r0) goto L_0x0369
            r7 = 1
            goto L_0x0369
        L_0x0363:
            r1 = move-exception
            java.lang.String r0 = "restore>BackupApiBackupSelector/device unable to access local backup"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x041a }
        L_0x0369:
            r19.A01()     // Catch:{ all -> 0x041a }
            X.2bd r2 = new X.2bd     // Catch:{ all -> 0x041a }
            r2.<init>()     // Catch:{ all -> 0x041a }
            X.0sq r1 = r13.A0G     // Catch:{ all -> 0x041a }
            X.3Hq r0 = new X.3Hq     // Catch:{ all -> 0x041a }
            r14 = r0
            r15 = r13
            r16 = r8
            r17 = r2
            r19 = r4
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x041a }
            r1.Acl(r0)     // Catch:{ all -> 0x041a }
            java.util.concurrent.locks.ReentrantLock r1 = r2.A02     // Catch:{ InterruptedException -> 0x03a1 }
            r1.lockInterruptibly()     // Catch:{ InterruptedException -> 0x03a1 }
        L_0x0388:
            java.lang.Object r0 = r2.A00     // Catch:{ all -> 0x039c }
            if (r0 != 0) goto L_0x0392
            java.util.concurrent.locks.Condition r0 = r2.A01     // Catch:{ all -> 0x039c }
            r0.await()     // Catch:{ all -> 0x039c }
            goto L_0x0388
        L_0x0392:
            r1.unlock()     // Catch:{ InterruptedException -> 0x03a1 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ InterruptedException -> 0x03a1 }
            boolean r6 = r0.booleanValue()     // Catch:{ InterruptedException -> 0x03a1 }
            goto L_0x03a5
        L_0x039c:
            r0 = move-exception
            r1.unlock()     // Catch:{ InterruptedException -> 0x03a1 }
            throw r0     // Catch:{ InterruptedException -> 0x03a1 }
        L_0x03a1:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ all -> 0x041a }
        L_0x03a5:
            long r2 = r12.A04     // Catch:{ all -> 0x041a }
            if (r4 != 0) goto L_0x03bd
            java.io.File r0 = r11.A0B()     // Catch:{ all -> 0x041a }
            long r11 = r0.length()     // Catch:{ all -> 0x041a }
            r0 = -1
            if (r9 == 0) goto L_0x03bb
            java.lang.String r10 = "chatdbSize"
            long r0 = r9.optLong(r10, r0)     // Catch:{ all -> 0x041a }
        L_0x03bb:
            long r11 = r11 - r0
            long r2 = r2 + r11
        L_0x03bd:
            android.content.SharedPreferences$Editor r1 = r5.A0K()     // Catch:{ all -> 0x041a }
            java.lang.String r0 = "gdrive_last_restore_file_is_encrypted"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r7)     // Catch:{ all -> 0x041a }
            r0.apply()     // Catch:{ all -> 0x041a }
            java.lang.String r0 = "restore>BackupApiBackupSelector/overwrite local files: "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x041a }
            r1.<init>(r0)     // Catch:{ all -> 0x041a }
            r1.append(r4)     // Catch:{ all -> 0x041a }
            java.lang.String r0 = ", isEncrypted: "
            r1.append(r0)     // Catch:{ all -> 0x041a }
            r1.append(r7)     // Catch:{ all -> 0x041a }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x041a }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x041a }
            monitor-enter(r8)     // Catch:{ all -> 0x041a }
            r0 = r18
            r8.A00 = r0     // Catch:{ all -> 0x03f2 }
            r8.A00 = r2     // Catch:{ all -> 0x03f2 }
            r8.A03 = r4     // Catch:{ all -> 0x03f2 }
            r8.A01 = r6     // Catch:{ all -> 0x03f2 }
            r8.A02 = r7     // Catch:{ all -> 0x03f2 }
            monitor-exit(r8)     // Catch:{ all -> 0x041a }
            goto L_0x0411
        L_0x03f2:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x041a }
            throw r0     // Catch:{ all -> 0x041a }
        L_0x03f5:
            r1 = move-exception
            java.lang.String r0 = "restore>BackupApiBackupSelector/one-time-setup/read-storage-permission-withdrawn/exiting"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x041a }
            java.lang.ref.WeakReference r0 = r13.A0H     // Catch:{ all -> 0x041a }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x041a }
            com.obwhatsapp.backup.google.RestoreFromBackupActivity r0 = (com.obwhatsapp.backup.google.RestoreFromBackupActivity) r0     // Catch:{ all -> 0x041a }
            if (r0 == 0) goto L_0x0413
            r0.A3F()     // Catch:{ all -> 0x041a }
            r0.finish()     // Catch:{ all -> 0x041a }
            goto L_0x0413
        L_0x040c:
            r0 = move-exception
            com.whatsapp.util.Log.e(r2, r0)     // Catch:{ all -> 0x041a }
            goto L_0x0413
        L_0x0411:
            r20 = r8
        L_0x0413:
            r1 = 0
            r0 = r36
            r0.set(r1)
            return r20
        L_0x041a:
            r2 = move-exception
            r1 = 0
            r0 = r36
            r0.set(r1)
            throw r2
        L_0x0422:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C55042ii.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C55062ik r9 = (C55062ik) obj;
        RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A08.get();
        if (restoreFromBackupActivity != null) {
            AnonymousClass00B.A01();
            AnonymousClass01A A0B2 = restoreFromBackupActivity.AGM().A0B("one-time-setup-taking-too-long");
            if (A0B2 != null) {
                ((DialogFragment) A0B2).A1D();
            }
            if (restoreFromBackupActivity.A3V()) {
                StringBuilder sb = new StringBuilder("restore>RestoreFromBackupActivity/one-time-setup background task finished but parent activity has already exited, therefore, stopping the task. Data: ");
                sb.append(r9);
                Log.i(sb.toString());
            } else {
                restoreFromBackupActivity.A0F = r9;
                if (r9 != null) {
                    restoreFromBackupActivity.A3O((C34121jj) null, 22);
                    restoreFromBackupActivity.A3N(r9);
                } else {
                    StringBuilder sb2 = new StringBuilder("restore>RestoreFromBackupActivity/one-time-setup/num-of-local-backup-files/");
                    sb2.append(restoreFromBackupActivity.A0R.A05());
                    Log.i(sb2.toString());
                    if (restoreFromBackupActivity.A0R.A05() > 0 && restoreFromBackupActivity.A0x.get()) {
                        Log.i("restore>RestoreFromBackupActivity/one-time-setup no google drive backups found but local backup exists.");
                        restoreFromBackupActivity.A0R.A00 = 3;
                        restoreFromBackupActivity.A3O((C34121jj) null, 23);
                        restoreFromBackupActivity.A3E();
                    } else if (AnonymousClass2GK.A0I(restoreFromBackupActivity.A09)) {
                        restoreFromBackupActivity.A3H();
                        restoreFromBackupActivity.setResult(1);
                    } else {
                        Log.i("restore>RestoreFromBackupActivity/one-time-setup user is an existing user but has no google drive backups found and no local backups exist either, warn the user.");
                        restoreFromBackupActivity.A0R.A00 = 4;
                        Bundle bundle = new Bundle();
                        bundle.putInt("dialog_id", 14);
                        bundle.putCharSequence("message", restoreFromBackupActivity.getString(R.string.str09a0));
                        bundle.putBoolean("cancelable", false);
                        bundle.putString("positive_button", restoreFromBackupActivity.getString(R.string.str096a));
                        bundle.putString("negative_button", restoreFromBackupActivity.getString(R.string.str1da7));
                        PromptDialogFragment promptDialogFragment = new PromptDialogFragment();
                        promptDialogFragment.A0T(bundle);
                        if (!restoreFromBackupActivity.A3V()) {
                            AnonymousClass050 r0 = new AnonymousClass050(restoreFromBackupActivity.AGM());
                            r0.A0C(promptDialogFragment, (String) null);
                            r0.A02();
                        }
                    }
                }
            }
        }
        Locale locale = Locale.ENGLISH;
        C28921Zf r4 = this.A07;
        String.format(locale, "Load time: %.2f seconds", new Object[]{Double.valueOf(((double) r4.A00()) / 1000.0d)});
        r4.A01();
        this.A0A.cancel();
    }
}
