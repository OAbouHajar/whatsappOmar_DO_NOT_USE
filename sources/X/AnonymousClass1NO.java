package X;

import android.os.CancellationSignal;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1NO  reason: invalid class name */
public class AnonymousClass1NO {
    public static final long A0L = 30000;
    public static final String A0M = "GoogleMigrateIntegrationManager/";
    public CancellationSignal A00;
    public CountDownLatch A01;
    public final C19650ym A02;
    public final AnonymousClass1NJ A03;
    public final C16300so A04;
    public final C16180sb A05;
    public final C16440t3 A06;
    public final AnonymousClass131 A07;
    public final AnonymousClass11I A08;
    public final AnonymousClass1NG A09;
    public final AnonymousClass1NL A0A;
    public final AnonymousClass1NK A0B;
    public final AnonymousClass1NI A0C;
    public final AnonymousClass1NH A0D;
    public final AnonymousClass1NN A0E;
    public final AnonymousClass11L A0F;
    public final C19760yx A0G;
    public final AnonymousClass1BN A0H;
    public final AnonymousClass1NM A0I;
    public final AnonymousClass01D A0J;
    public final AtomicBoolean A0K = new AtomicBoolean(false);

    public AnonymousClass1NO(C16440t3 r3, C16300so r4, C16180sb r5, AnonymousClass1BN r6, AnonymousClass1NG r7, AnonymousClass1NH r8, AnonymousClass1NI r9, AnonymousClass11I r10, AnonymousClass01D r11, AnonymousClass1NJ r12, C19760yx r13, AnonymousClass1NK r14, AnonymousClass1NL r15, AnonymousClass11L r16, AnonymousClass131 r17, C19650ym r18, AnonymousClass1NM r19, AnonymousClass1NN r20) {
        this.A06 = r3;
        this.A04 = r4;
        this.A05 = r5;
        this.A0H = r6;
        this.A0J = r11;
        this.A09 = r7;
        this.A0D = r8;
        this.A0C = r9;
        this.A08 = r10;
        this.A03 = r12;
        this.A0G = r13;
        this.A0B = r14;
        this.A0A = r15;
        this.A0F = r16;
        this.A07 = r17;
        this.A02 = r18;
        this.A0I = r19;
        this.A0E = r20;
    }

    private void A00() {
        A0D();
        File file = this.A05.A05().A0A;
        C16180sb.A04(file, false);
        AnonymousClass1XI.A0D(file);
        File file2 = this.A05.A05().A0A;
        C16180sb.A04(file2, false);
        if (file2.exists()) {
            this.A04.AcB(A0M, "cancelImport/could not delete media folder", false);
            Log.e("GoogleMigrateIntegrationManager/cleanUpAfterCancellation()/could not delete media folder");
        }
        A02();
    }

    private void A01() {
        Log.i("GoogleMigrateIntegrationManager/cleanUpAfterImportCompleted()");
        this.A08.A04("cross_migration_data_cleanup_needed", 1);
        AnonymousClass1NK r2 = this.A0B;
        r2.A05.A03(r2.A04);
        r2.A03.A03(r2.A06);
        r2.A08.A03(r2.A07);
        synchronized (this) {
            this.A01 = null;
            this.A00 = null;
        }
    }

    private void A02() {
        A04(this.A02.A00());
    }

    private void A03() {
        if (!this.A0G.A0F()) {
            throw new AnonymousClass40S(301, "GoogleMigrateIntegrationManager/can not find jabber Id");
        }
    }

    private void A04(C34121jj r4) {
        int i2 = r4.A00;
        if (i2 == 2 || i2 == 1) {
            AnonymousClass11L r0 = this.A0F;
            r0.A00();
            r0.A01();
        }
    }

    public int A05() {
        int i2;
        AnonymousClass1NK r1 = this.A0B;
        synchronized (r1) {
            i2 = r1.A00;
        }
        return i2;
    }

    public int A06() {
        int i2;
        AnonymousClass1NK r2 = this.A0B;
        synchronized (r2) {
            StringBuilder sb = new StringBuilder();
            sb.append("GoogleMigrate/getCurrentScreen = ");
            sb.append(r2.A01);
            Log.i(sb.toString());
            i2 = r2.A01;
        }
        return i2;
    }

    public void A07() {
        CountDownLatch countDownLatch;
        Log.i("GoogleMigrateIntegrationManager/cancelImport()");
        boolean z2 = true;
        if (!this.A0K.getAndSet(true)) {
            synchronized (this) {
                if (this.A00 == null || this.A01 == null) {
                    Log.i("GoogleMigrateIntegrationManager/cancellationSignal or importCompleted is null");
                    A00();
                } else {
                    z2 = false;
                }
                countDownLatch = this.A01;
                if (this.A00 != null) {
                    Log.i("GoogleMigrateIntegrationManager/cancelImport()/cancellationSignal.cancel");
                    this.A00.cancel();
                }
            }
            if (z2) {
                this.A0A.A04();
                A01();
                return;
            }
            try {
                for (AnonymousClass5TF AO7 : this.A0A.A01()) {
                    AO7.AO7();
                }
                if (countDownLatch != null) {
                    countDownLatch.await(A0L, TimeUnit.MILLISECONDS);
                }
            } catch (InterruptedException e2) {
                this.A0A.A05(2);
                Log.e("GoogleMigrateIntegrationManager/cancelImportProcess()/InterruptedException", e2);
            } catch (Throwable th) {
                A00();
                this.A0A.A04();
                A01();
                this.A0K.set(false);
                throw th;
            }
            A00();
            this.A0A.A04();
            A01();
            this.A0K.set(false);
            return;
        }
        Log.e("GoogleMigrateIntegrationManager/concurrent cancelImport requested, not supported");
        throw new IllegalStateException("Multiple concurrent operations are not supported.");
    }

    public void A08() {
        if (this.A08.A01("cross_migration_data_cleanup_needed", 0) == 1) {
            this.A09.A09();
            this.A0J.get();
            if (this.A03.A04()) {
                try {
                    this.A03.A03();
                } catch (IOException e2) {
                    C16300so r2 = this.A04;
                    StringBuilder sb = new StringBuilder("failed to delete remote data: ");
                    sb.append(e2.toString());
                    r2.A03("xpm-integration-delete-failed", sb.toString(), e2);
                    Log.e("GoogleMigrateIntegrationManager/deferredCleanup()/could not delete all data from Google Migrate");
                }
            }
            this.A08.A03("cross_migration_data_cleanup_needed");
            return;
        }
        Log.i("GoogleMigrateIntegrationManager/deferredCleanup()/does not need to cleanup");
    }

    public void A09() {
        this.A03.A04();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: int} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0162 A[LOOP:1: B:48:0x015c->B:50:0x0162, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A() {
        /*
            r15 = this;
            monitor-enter(r15)
            android.os.CancellationSignal r0 = r15.A00     // Catch:{ all -> 0x0255 }
            if (r0 != 0) goto L_0x024d
            java.util.concurrent.CountDownLatch r0 = r15.A01     // Catch:{ all -> 0x0255 }
            if (r0 != 0) goto L_0x024d
            android.os.CancellationSignal r0 = new android.os.CancellationSignal     // Catch:{ all -> 0x0255 }
            r0.<init>()     // Catch:{ all -> 0x0255 }
            r15.A00 = r0     // Catch:{ all -> 0x0255 }
            r3 = 1
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x0255 }
            r0.<init>(r3)     // Catch:{ all -> 0x0255 }
            r15.A01 = r0     // Catch:{ all -> 0x0255 }
            monitor-exit(r15)     // Catch:{ all -> 0x0255 }
            X.1NI r1 = r15.A0C
            monitor-enter(r1)
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x024a }
            r0.clear()     // Catch:{ all -> 0x024a }
            monitor-exit(r1)     // Catch:{ all -> 0x024a }
            X.1NL r0 = r15.A0A
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x002c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x003c
            java.lang.Object r0 = r1.next()
            X.5TF r0 = (X.AnonymousClass5TF) r0
            r0.AS9()
            goto L_0x002c
        L_0x003c:
            r2 = 0
            X.1NK r4 = r15.A0B     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            X.1NL r1 = r4.A05     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            X.5TF r0 = r4.A04     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            r1.A02(r0)     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            X.1NR r1 = r4.A03     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            X.4Ec r0 = r4.A06     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            r1.A02(r0)     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            X.1Po r1 = r4.A08     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            X.5Pw r0 = r4.A07     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            r1.A02(r0)     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            X.0ym r0 = r15.A02     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            X.1jj r6 = r0.A00()     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            int r1 = r6.A00     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            r0 = 2
            if (r1 == r0) goto L_0x0086
            if (r1 == r3) goto L_0x0086
            X.0so r5 = r15.A04     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            java.lang.String r4 = "xpm-integration-failed"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            r1.<init>()     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            java.lang.String r0 = "failed to initialize db, result = "
            r1.append(r0)     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            java.lang.String r0 = r6.toString()     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            r1.append(r0)     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            java.lang.String r0 = r1.toString()     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            r5.AcB(r4, r0, r3)     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            X.1NL r1 = r15.A0A     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            r0 = 302(0x12e, float:4.23E-43)
            r1.A05(r0)     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            goto L_0x00b2
        L_0x0086:
            r15.A03()     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            r15.A0E()     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            X.1NG r1 = r15.A09     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            android.os.CancellationSignal r0 = r15.A00     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            r1.A0E(r0)     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            X.1NH r1 = r15.A0D     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            android.os.CancellationSignal r0 = r15.A00     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            r1.A0B(r0)     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            r15.A04(r6)     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            X.11I r1 = r15.A08     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            java.lang.String r0 = "cross_platform_migration_completed"
            r1.A04(r0, r3)     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            X.11I r5 = r15.A08     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            java.lang.String r4 = "cross_platform_migration_completed_timestamp"
            X.0t3 r0 = r15.A06     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            long r0 = r0.A00()     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            r5.A05(r4, r0)     // Catch:{ OperationCanceledException -> 0x0143, Exception -> 0x00c0 }
            goto L_0x00b3
        L_0x00b2:
            r3 = 0
        L_0x00b3:
            java.lang.String r0 = "GoogleMigrateIntegrationManager/importData()/finally"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.concurrent.CountDownLatch r0 = r15.A01
            r0.countDown()
            r2 = r3
            goto L_0x0152
        L_0x00c0:
            r6 = move-exception
            java.lang.String r0 = "GoogleMigrateIntegrationManager/importData()/"
            com.whatsapp.util.Log.e(r0, r6)     // Catch:{ all -> 0x023e }
            boolean r0 = r6 instanceof X.C108875Pv     // Catch:{ all -> 0x023e }
            if (r0 == 0) goto L_0x00d1
            r0 = r6
            X.5Pv r0 = (X.C108875Pv) r0     // Catch:{ all -> 0x023e }
            int r3 = r0.ADj()     // Catch:{ all -> 0x023e }
        L_0x00d1:
            X.1NM r0 = r15.A0I     // Catch:{ all -> 0x023e }
            android.content.SharedPreferences r1 = r0.A00()     // Catch:{ all -> 0x023e }
            java.lang.String r0 = "google_migrate_ios_funnel_id"
            r4 = 0
            java.lang.String r10 = r1.getString(r0, r4)     // Catch:{ all -> 0x023e }
            X.1NM r0 = r15.A0I     // Catch:{ all -> 0x023e }
            android.content.SharedPreferences r1 = r0.A00()     // Catch:{ all -> 0x023e }
            java.lang.String r0 = "google_migrate_ios_export_duration"
            java.lang.String r11 = r1.getString(r0, r4)     // Catch:{ all -> 0x023e }
            X.1BN r7 = r15.A0H     // Catch:{ all -> 0x023e }
            r1 = 1
            r0 = 302(0x12e, float:4.23E-43)
            if (r3 == r0) goto L_0x0102
            r0 = 202(0xca, float:2.83E-43)
            if (r3 == r0) goto L_0x0102
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 == r0) goto L_0x0102
            r0 = 201(0xc9, float:2.82E-43)
            if (r3 == r0) goto L_0x0102
            if (r3 == r1) goto L_0x0102
            java.lang.String r8 = "google_migrate_recoverable_error"
            goto L_0x0104
        L_0x0102:
            java.lang.String r8 = "google_migrate_unrecoverable_error"
        L_0x0104:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x023e }
            r1.<init>()     // Catch:{ all -> 0x023e }
            r1.append(r3)     // Catch:{ all -> 0x023e }
            java.lang.String r0 = ";"
            r1.append(r0)     // Catch:{ all -> 0x023e }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x023e }
            r1.append(r0)     // Catch:{ all -> 0x023e }
            java.lang.String r9 = r1.toString()     // Catch:{ all -> 0x023e }
            r12 = 0
            r7.A05(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x023e }
            X.0so r5 = r15.A04     // Catch:{ all -> 0x023e }
            java.lang.String r4 = "xpm-integration-failed"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x023e }
            r1.<init>()     // Catch:{ all -> 0x023e }
            r1.append(r3)     // Catch:{ all -> 0x023e }
            java.lang.String r0 = "; "
            r1.append(r0)     // Catch:{ all -> 0x023e }
            r1.append(r6)     // Catch:{ all -> 0x023e }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x023e }
            r5.A03(r4, r0, r6)     // Catch:{ all -> 0x023e }
            X.1NL r0 = r15.A0A     // Catch:{ all -> 0x023e }
            r0.A05(r3)     // Catch:{ all -> 0x023e }
            goto L_0x0148
        L_0x0143:
            java.lang.String r0 = "GoogleMigrateIntegrationManager/importData()/canceled"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x023e }
        L_0x0148:
            java.lang.String r0 = "GoogleMigrateIntegrationManager/importData()/finally"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.concurrent.CountDownLatch r0 = r15.A01
            r0.countDown()
        L_0x0152:
            X.1NL r0 = r15.A0A
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x015c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x016c
            java.lang.Object r0 = r1.next()
            X.5TF r0 = (X.AnonymousClass5TF) r0
            r0.AOv(r2)
            goto L_0x015c
        L_0x016c:
            r15.A01()
            java.lang.String r0 = "GoogleMigrateIntegrationManager/importData(); stats=\n"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r0)
            X.1NI r3 = r15.A0C
            java.lang.String r11 = "\n"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "prefetched/file/success"
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A00(r0)
            int r2 = r0.get()
            java.lang.String r0 = "prefetched/file/failed"
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A00(r0)
            int r1 = r0.get()
            int r14 = r2 + r1
            java.lang.String r0 = "import/chat/skipped"
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A00(r0)
            int r13 = r0.get()
            java.lang.String r0 = "import/msg/success"
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A00(r0)
            int r12 = r0.get()
            java.lang.String r0 = "import/msg/failed"
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A00(r0)
            int r8 = r0.get()
            java.lang.String r0 = "import/msg/skipped"
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A00(r0)
            int r7 = r0.get()
            int r6 = r12 + r8
            int r6 = r6 + r7
            java.lang.String r0 = "import/msg/file/success"
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A00(r0)
            int r5 = r0.get()
            java.lang.String r0 = "import/msg/file/failed"
            java.util.concurrent.atomic.AtomicInteger r0 = r3.A00(r0)
            int r4 = r0.get()
            int r3 = r5 + r4
            java.lang.String r0 = "Prefetched files: success="
            r10.append(r0)
            r10.append(r2)
            java.lang.String r2 = ", failed="
            r10.append(r2)
            r10.append(r1)
            java.lang.String r1 = ", total="
            r10.append(r1)
            r10.append(r14)
            r10.append(r11)
            java.lang.String r0 = "Chats: skipped="
            r10.append(r0)
            r10.append(r13)
            r10.append(r11)
            java.lang.String r0 = "Messages: success="
            r10.append(r0)
            r10.append(r12)
            java.lang.String r0 = ", skipped="
            r10.append(r0)
            r10.append(r7)
            r10.append(r2)
            r10.append(r8)
            r10.append(r1)
            r10.append(r6)
            r10.append(r11)
            java.lang.String r0 = "Message files: success="
            r10.append(r0)
            r10.append(r5)
            r10.append(r2)
            r10.append(r4)
            r10.append(r1)
            r10.append(r3)
            java.lang.String r0 = r10.toString()
            r9.append(r0)
            java.lang.String r0 = r9.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x023e:
            r1 = move-exception
            java.lang.String r0 = "GoogleMigrateIntegrationManager/importData()/finally"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.concurrent.CountDownLatch r0 = r15.A01
            r0.countDown()
            throw r1
        L_0x024a:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x024a }
            throw r0
        L_0x024d:
            java.lang.String r1 = "GoogleMigrateIntegrationManager/Import already running, cannot start another import."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0255 }
            r0.<init>(r1)     // Catch:{ all -> 0x0255 }
            throw r0     // Catch:{ all -> 0x0255 }
        L_0x0255:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x0255 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NO.A0A():void");
    }

    public void A0B() {
        this.A02.A00();
    }

    public void A0C() {
        AnonymousClass1NK r1 = this.A0B;
        synchronized (r1) {
            r1.A01 = 0;
        }
    }

    public void A0D() {
        this.A07.A00();
        C16900tq r0 = this.A02.A02;
        r0.A04();
        r0.A05();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x00b5 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00ba */
    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00c1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E() {
        /*
            r7 = this;
            java.lang.String r0 = "GoogleMigrateIntegrationManager/saveLoggingInfoFromiOS()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1NJ r1 = r7.A03     // Catch:{ IOException -> 0x00c2 }
            java.lang.String r0 = "migration/metadata.json"
            android.os.ParcelFileDescriptor r6 = r1.A00(r0)     // Catch:{ IOException -> 0x00c2 }
            java.io.FileDescriptor r0 = r6.getFileDescriptor()     // Catch:{ all -> 0x00bb }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x00bb }
            r2.<init>(r0)     // Catch:{ all -> 0x00bb }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x00b6 }
            r0.<init>(r2)     // Catch:{ all -> 0x00b6 }
            android.util.JsonReader r4 = new android.util.JsonReader     // Catch:{ all -> 0x00b6 }
            r4.<init>(r0)     // Catch:{ all -> 0x00b6 }
            r4.beginObject()     // Catch:{ all -> 0x00b1 }
            r3 = 0
            r5 = r3
        L_0x0025:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x006a
            java.lang.String r1 = r4.nextName()     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = "attemptInfo"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x0066
            r4.beginObject()     // Catch:{ all -> 0x00b1 }
        L_0x003a:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x0062
            java.lang.String r1 = r4.nextName()     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = "attemptCompletionTime"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x0055
            double r0 = r4.nextDouble()     // Catch:{ all -> 0x00b1 }
            java.lang.String r5 = java.lang.Double.toString(r0)     // Catch:{ all -> 0x00b1 }
            goto L_0x003a
        L_0x0055:
            java.lang.String r0 = "attemptID"
            boolean r0 = r0.equals(r1)     // Catch:{ all -> 0x00b1 }
            if (r0 == 0) goto L_0x003a
            java.lang.String r3 = r4.nextString()     // Catch:{ all -> 0x00b1 }
            goto L_0x003a
        L_0x0062:
            r4.endObject()     // Catch:{ all -> 0x00b1 }
            goto L_0x0025
        L_0x0066:
            r4.skipValue()     // Catch:{ all -> 0x00b1 }
            goto L_0x0025
        L_0x006a:
            r4.endObject()     // Catch:{ all -> 0x00b1 }
            if (r3 == 0) goto L_0x00a1
            if (r5 == 0) goto L_0x00a9
            r4.close()     // Catch:{ all -> 0x00b6 }
            X.1NM r0 = r7.A0I     // Catch:{ all -> 0x00b6 }
            android.content.SharedPreferences r0 = r0.A00()     // Catch:{ all -> 0x00b6 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = "google_migrate_ios_export_duration"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r5)     // Catch:{ all -> 0x00b6 }
            r0.apply()     // Catch:{ all -> 0x00b6 }
            X.1NM r0 = r7.A0I     // Catch:{ all -> 0x00b6 }
            android.content.SharedPreferences r0 = r0.A00()     // Catch:{ all -> 0x00b6 }
            android.content.SharedPreferences$Editor r1 = r0.edit()     // Catch:{ all -> 0x00b6 }
            java.lang.String r0 = "google_migrate_ios_funnel_id"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r3)     // Catch:{ all -> 0x00b6 }
            r0.apply()     // Catch:{ all -> 0x00b6 }
            r2.close()     // Catch:{ all -> 0x00bb }
            r6.close()     // Catch:{ IOException -> 0x00c2 }
            return
        L_0x00a1:
            java.lang.String r0 = "Invalid metadata file: iOSFunnelId is missing."
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00b1 }
            r1.<init>(r0)     // Catch:{ all -> 0x00b1 }
            goto L_0x00b0
        L_0x00a9:
            java.lang.String r0 = "Invalid metadata file: iOSExportDuration is missing."
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x00b1 }
            r1.<init>(r0)     // Catch:{ all -> 0x00b1 }
        L_0x00b0:
            throw r1     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x00b5 }
        L_0x00b5:
            throw r0     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x00ba }
        L_0x00ba:
            throw r0     // Catch:{ all -> 0x00bb }
        L_0x00bb:
            r0 = move-exception
            if (r6 == 0) goto L_0x00c1
            r6.close()     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            throw r0     // Catch:{ IOException -> 0x00c2 }
        L_0x00c2:
            r3 = move-exception
            java.lang.String r0 = "GoogleMigrateIntegrationManager/saveLoggingInfoFromiOS()/"
            com.whatsapp.util.Log.e(r0, r3)
            X.0so r2 = r7.A04
            java.lang.String r1 = "xpm-integration-no-funnel-id"
            java.lang.String r0 = "saveLoggingInfoFromiOS;"
            r2.A03(r1, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NO.A0E():void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public void A0F(int r4) {
        /*
            r3 = this;
            X.1NL r0 = r3.A0A     // Catch:{ all -> 0x0038 }
            java.lang.Iterable r0 = r0.A01()     // Catch:{ all -> 0x0038 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0038 }
        L_0x000a:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x0038 }
            X.5TF r0 = (X.AnonymousClass5TF) r0     // Catch:{ all -> 0x0038 }
            r0.AVA()     // Catch:{ all -> 0x0038 }
            goto L_0x000a
        L_0x001a:
            r3.A0D()     // Catch:{ all -> 0x0038 }
            X.1NL r0 = r3.A0A
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0027:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0037
            java.lang.Object r0 = r1.next()
            X.5TF r0 = (X.AnonymousClass5TF) r0
            r0.AV9(r4)
            goto L_0x0027
        L_0x0037:
            return
        L_0x0038:
            r2 = move-exception
            X.1NL r0 = r3.A0A
            java.lang.Iterable r0 = r0.A01()
            java.util.Iterator r1 = r0.iterator()
        L_0x0043:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0053
            java.lang.Object r0 = r1.next()
            X.5TF r0 = (X.AnonymousClass5TF) r0
            r0.AV9(r4)
            goto L_0x0043
        L_0x0053:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NO.A0F(int):void");
    }

    public boolean A0G() {
        try {
            return this.A08.A00("cross_platform_migration_completed", 0) == 1;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0008, code lost:
        if (r2.A01 == null) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A0H() {
        /*
            r2 = this;
            monitor-enter(r2)
            android.os.CancellationSignal r0 = r2.A00     // Catch:{ all -> 0x000d }
            if (r0 == 0) goto L_0x000a
            java.util.concurrent.CountDownLatch r1 = r2.A01     // Catch:{ all -> 0x000d }
            r0 = 1
            if (r1 != 0) goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            monitor-exit(r2)
            return r0
        L_0x000d:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1NO.A0H():boolean");
    }
}
