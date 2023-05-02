package com.obwhatsapp.backup.google.workers;

import X.AnonymousClass01F;
import X.AnonymousClass0RE;
import X.AnonymousClass11D;
import X.AnonymousClass12M;
import X.AnonymousClass12N;
import X.AnonymousClass12Q;
import X.AnonymousClass12T;
import X.AnonymousClass12U;
import X.AnonymousClass12W;
import X.AnonymousClass1I1;
import X.AnonymousClass2GK;
import X.AnonymousClass2GM;
import X.AnonymousClass2GS;
import X.AnonymousClass2GT;
import X.C007203h;
import X.C13680ns;
import X.C13700nu;
import X.C14710pd;
import X.C15860rz;
import X.C16040sK;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16200sd;
import X.C16250si;
import X.C16260sj;
import X.C16300so;
import X.C16440t3;
import X.C16490t9;
import X.C16600tK;
import X.C16900tq;
import X.C16980tz;
import X.C17190ug;
import X.C18990xa;
import X.C19080xj;
import X.C19670yo;
import X.C29951bV;
import X.C29981bY;
import X.C71003iK;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;
import org.apache.commons.io.IOUtils;

public class GoogleBackupWorker extends Worker {
    public final int A00;
    public final C16300so A01;
    public final C16180sb A02;
    public final C16040sK A03;
    public final C16200sd A04;
    public final AnonymousClass1I1 A05;
    public final C19670yo A06;
    public final AnonymousClass12U A07;
    public final AnonymousClass12M A08;
    public final AnonymousClass12N A09;
    public final C71003iK A0A;
    public final AnonymousClass12Q A0B;
    public final AnonymousClass12T A0C;
    public final C19080xj A0D;
    public final C16190sc A0E;
    public final AnonymousClass12W A0F;
    public final C16440t3 A0G;
    public final C16980tz A0H;
    public final C16260sj A0I;
    public final C15860rz A0J;
    public final C16250si A0K;
    public final C16900tq A0L;
    public final AnonymousClass11D A0M;
    public final C14710pd A0N;
    public final C16490t9 A0O;
    public final AnonymousClass2GT A0P;
    public final C17190ug A0Q;
    public final C18990xa A0R;

    public GoogleBackupWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass01F A0A2 = C13700nu.A0A(context);
        this.A0G = A0A2.Agj();
        this.A0N = A0A2.A1G();
        this.A01 = A0A2.A6q();
        C16150sX r7 = (C16150sX) A0A2;
        this.A03 = C16150sX.A04(r7);
        this.A0H = C16150sX.A0V(r7);
        this.A02 = (C16180sb) r7.A8b.get();
        this.A0O = A0A2.Ai6();
        this.A0E = (C16190sc) r7.A8R.get();
        this.A0R = (C18990xa) r7.ADh.get();
        C17190ug A0t = C16150sX.A0t(r7);
        this.A0Q = A0t;
        this.A0D = (C19080xj) r7.A1f.get();
        this.A04 = (C16200sd) r7.A7h.get();
        this.A0F = (AnonymousClass12W) r7.AEM.get();
        this.A0M = (AnonymousClass11D) r7.AFm.get();
        this.A0K = (C16250si) r7.AFP.get();
        this.A07 = (AnonymousClass12U) r7.AB5.get();
        this.A0L = (C16900tq) r7.AFT.get();
        this.A0C = (AnonymousClass12T) r7.AL6.get();
        this.A0I = C16150sX.A0X(r7);
        this.A0J = A0A2.Ai3();
        this.A05 = (AnonymousClass1I1) r7.A1Y.get();
        C19670yo r4 = (C19670yo) r7.AB4.get();
        this.A06 = r4;
        this.A08 = (AnonymousClass12M) r7.AB6.get();
        this.A0B = (AnonymousClass12Q) r7.AB8.get();
        this.A09 = (AnonymousClass12N) r7.AB7.get();
        AnonymousClass2GT r6 = new AnonymousClass2GT();
        this.A0P = r6;
        r6.A0E = C13680ns.A0Z();
        C007203h r3 = this.A01.A01;
        r6.A0F = Integer.valueOf(r3.A02("KEY_BACKUP_SCHEDULE", 0));
        r6.A0B = Integer.valueOf(r3.A02("KEY_BACKUP_NETWORK_SETTING", -1));
        this.A0A = new C71003iK((C16600tK) r7.ARd.get(), r4, A0t);
        this.A00 = r3.A02("KEY_MAX_NUMBER_OF_RETRIES", 0);
    }

    public C29981bY A00() {
        C29951bV r4 = new C29951bV();
        r4.A04(new AnonymousClass0RE(5, this.A0B.A00(C16980tz.A00(this.A0H), (String) null), 0));
        return r4;
    }

    public void A03() {
        Log.i("google-backup-worker/onStopped");
        this.A0A.A06();
        this.A06.A0c.getAndSet(false);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:1|2|3|4|5|6|(1:8)(2:12|(1:14)(1:15))|9|(1:11)(4:16|17|(4:19|20|(3:22|(1:24)(1:25)|26)(1:27)|(3:29|(1:31)(1:32)|(3:34|(1:41)(1:40)|(3:43|(1:45)(1:46)|(3:48|(1:50)(1:51)|(3:53|(1:55)(1:56)|(2:(1:59)(1:60)|(8:62|63|64|65|66|211|(2:85|94)(1:(2:87|88)(2:89|(1:93)))|95))))))))|104)|105|106) */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x021f, code lost:
        if (r1 == false) goto L_0x0221;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x002b */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x005f A[Catch:{ all -> 0x024b, all -> 0x025d }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x006b A[Catch:{ all -> 0x024b, all -> 0x025d }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0078 A[Catch:{ all -> 0x024b, all -> 0x025d }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x004f A[Catch:{ all -> 0x024b, all -> 0x025d }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass02Q A04() {
        /*
            r47 = this;
            r11 = r47
            X.12Q r10 = r11.A0B     // Catch:{ all -> 0x025d }
            r10.A04()     // Catch:{ all -> 0x025d }
            r10.A03()     // Catch:{ all -> 0x025d }
            X.0tz r0 = r11.A0H     // Catch:{ InterruptedException | ExecutionException -> 0x002b }
            android.content.res.Resources r1 = X.C16980tz.A00(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x002b }
            r0 = 0
            android.app.Notification r2 = r10.A00(r1, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x002b }
            r1 = 5
            r0 = 0
            X.0RE r3 = new X.0RE     // Catch:{ InterruptedException | ExecutionException -> 0x002b }
            r3.<init>(r1, r2, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x002b }
            androidx.work.WorkerParameters r0 = r11.A01     // Catch:{ InterruptedException | ExecutionException -> 0x002b }
            X.0kc r2 = r0.A02     // Catch:{ InterruptedException | ExecutionException -> 0x002b }
            android.content.Context r1 = r11.A00     // Catch:{ InterruptedException | ExecutionException -> 0x002b }
            java.util.UUID r0 = r0.A08     // Catch:{ InterruptedException | ExecutionException -> 0x002b }
            X.1bY r0 = r2.Ady(r1, r3, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x002b }
            r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x002b }
        L_0x002b:
            androidx.work.WorkerParameters r2 = r11.A01     // Catch:{ all -> 0x025d }
            int r9 = r2.A00     // Catch:{ all -> 0x025d }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x025d }
            java.lang.String r0 = "google-backup-worker/doWork, attempt "
            r1.append(r0)     // Catch:{ all -> 0x025d }
            r1.append(r9)     // Catch:{ all -> 0x025d }
            X.C13680ns.A1V(r1)     // Catch:{ all -> 0x025d }
            X.0rz r8 = r11.A0J     // Catch:{ all -> 0x025d }
            java.lang.String r3 = r8.A0M()     // Catch:{ all -> 0x025d }
            X.0sK r0 = r11.A03     // Catch:{ all -> 0x025d }
            r0.A0B()     // Catch:{ all -> 0x025d }
            com.obwhatsapp.Me r0 = r0.A00     // Catch:{ all -> 0x025d }
            r42 = 0
            if (r0 != 0) goto L_0x006b
            java.lang.String r0 = "google-backup-worker/my-jid/me is null, can't proceed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x025d }
        L_0x0054:
            X.0yo r7 = r11.A06     // Catch:{ all -> 0x025d }
            r0 = 1
            java.util.concurrent.atomic.AtomicBoolean r1 = r7.A0c     // Catch:{ all -> 0x025d }
            boolean r0 = r1.getAndSet(r0)     // Catch:{ all -> 0x025d }
            if (r0 == 0) goto L_0x0078
            java.lang.String r0 = "google-backup-worker/doWork another backup is already running."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x025d }
            X.0Gc r0 = new X.0Gc     // Catch:{ all -> 0x025d }
            r0.<init>()     // Catch:{ all -> 0x025d }
            goto L_0x0259
        L_0x006b:
            java.lang.String r0 = r0.jabber_id     // Catch:{ all -> 0x025d }
            if (r0 != 0) goto L_0x0075
            java.lang.String r0 = "google-backup-worker/my-jid/jidUser is null, fatal error."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x025d }
            goto L_0x0054
        L_0x0075:
            r42 = r0
            goto L_0x0054
        L_0x0078:
            boolean r0 = r7.A0A()     // Catch:{ all -> 0x025d }
            boolean r0 = X.AnonymousClass000.A1P(r0)
            if (r0 != 0) goto L_0x0250
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x025d }
            if (r0 == 0) goto L_0x00b0
            int r0 = r8.A09()     // Catch:{ all -> 0x025d }
            r5 = 0
            if (r0 == 0) goto L_0x00a9
            java.lang.String r0 = "google-backup-worker/doWork accountName is null, cannot proceed further. Change google drive state from "
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x025d }
            int r0 = r8.A09()     // Catch:{ all -> 0x025d }
            r4.append(r0)     // Catch:{ all -> 0x025d }
            java.lang.String r0 = " to clean_state"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r4)     // Catch:{ all -> 0x025d }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x025d }
            r8.A0j(r5)     // Catch:{ all -> 0x025d }
            goto L_0x00ae
        L_0x00a9:
            java.lang.String r0 = "google-backup-worker/doWork grdive account name is empty, google drive backup aborted"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x025d }
        L_0x00ae:
            r0 = 0
            goto L_0x00b1
        L_0x00b0:
            r0 = 1
        L_0x00b1:
            if (r0 == 0) goto L_0x0250
            X.AnonymousClass00B.A06(r3)     // Catch:{ all -> 0x025d }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x025d }
            long r4 = r8.A0H(r3)     // Catch:{ all -> 0x025d }
            long r12 = r12 - r4
            r4 = 3600000(0x36ee80, double:1.7786363E-317)
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c8
            r0 = 1
            goto L_0x00ce
        L_0x00c8:
            java.lang.String r0 = "google-backup-worker/doWork backup called too early, ignoring"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x025d }
            r0 = 0
        L_0x00ce:
            if (r0 == 0) goto L_0x0250
            X.03h r0 = r2.A01     // Catch:{ all -> 0x025d }
            java.lang.String r2 = "only_if_pending"
            java.util.Map r0 = r0.A00     // Catch:{ all -> 0x025d }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x025d }
            boolean r0 = r2 instanceof java.lang.Boolean     // Catch:{ all -> 0x025d }
            if (r0 == 0) goto L_0x00f1
            boolean r0 = X.AnonymousClass000.A1X(r2)     // Catch:{ all -> 0x025d }
            if (r0 == 0) goto L_0x00f1
            boolean r0 = X.AnonymousClass2GK.A0G(r8)     // Catch:{ all -> 0x025d }
            if (r0 != 0) goto L_0x00f1
            java.lang.String r0 = "google-backup-worker/doWork backup called when not pending and required, ignoring"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x025d }
            r0 = 0
            goto L_0x00f2
        L_0x00f1:
            r0 = 1
        L_0x00f2:
            if (r0 == 0) goto L_0x0250
            X.0xa r0 = r11.A0R     // Catch:{ all -> 0x025d }
            boolean r0 = r0.A00     // Catch:{ all -> 0x025d }
            if (r0 == 0) goto L_0x0101
            java.lang.String r0 = "google-backup-worker/doWork WhatsApp Login has failed, google drive backup aborted"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x025d }
            r0 = 1
            goto L_0x0102
        L_0x0101:
            r0 = 0
        L_0x0102:
            if (r0 != 0) goto L_0x0250
            X.0sj r0 = r11.A0I     // Catch:{ all -> 0x025d }
            r34 = r0
            boolean r0 = r34.A0B()     // Catch:{ all -> 0x025d }
            if (r0 != 0) goto L_0x011a
            java.lang.String r0 = "google-backup-worker/doWork read storage permission denied backup aborted"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x025d }
            r0 = 23
            r11.A06(r0)     // Catch:{ all -> 0x025d }
            r0 = 0
            goto L_0x011b
        L_0x011a:
            r0 = 1
        L_0x011b:
            if (r0 == 0) goto L_0x0250
            boolean r0 = X.AnonymousClass2GK.A0H(r8)     // Catch:{ all -> 0x025d }
            if (r0 == 0) goto L_0x012a
            java.lang.String r0 = "google-backup-worker/doWork cannot start backup, media restore is pending"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x025d }
            r0 = 1
            goto L_0x012b
        L_0x012a:
            r0 = 0
        L_0x012b:
            if (r0 != 0) goto L_0x0250
            if (r42 != 0) goto L_0x0136
            java.lang.String r0 = "google-backup-worker/doWork my jid is null."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x025d }
            r0 = 1
            goto L_0x0137
        L_0x0136:
            r0 = 0
        L_0x0137:
            if (r0 != 0) goto L_0x0250
            X.AnonymousClass00B.A06(r42)     // Catch:{ all -> 0x025d }
            X.0xj r2 = r11.A0D     // Catch:{ all -> 0x024b }
            r1 = 6
            r0 = 1
            r2.A00(r1, r0)     // Catch:{ all -> 0x024b }
            r2 = 10
            android.content.SharedPreferences$Editor r1 = r8.A0K()     // Catch:{ all -> 0x024b }
            java.lang.String r0 = "gdrive_error_code"
            X.C13680ns.A0w(r1, r0, r2)     // Catch:{ all -> 0x024b }
            java.lang.String r0 = android.os.Environment.getExternalStorageState()     // Catch:{ all -> 0x024b }
            r7.A09(r0)     // Catch:{ all -> 0x024b }
            r7.A05()     // Catch:{ all -> 0x024b }
            r7.A07()     // Catch:{ all -> 0x024b }
            r7.A00()     // Catch:{ all -> 0x024b }
            X.12U r6 = r11.A07     // Catch:{ all -> 0x024b }
            X.AnonymousClass00B.A06(r3)     // Catch:{ all -> 0x024b }
            java.lang.String r0 = "backup"
            X.2GM r27 = r6.A01(r3, r0)     // Catch:{ all -> 0x024b }
            X.0tz r0 = r11.A0H     // Catch:{ all -> 0x024b }
            r33 = r0
            X.0t3 r0 = r11.A0G     // Catch:{ all -> 0x024b }
            r32 = r0
            X.0pd r5 = r11.A0N     // Catch:{ all -> 0x024b }
            X.0so r0 = r11.A01     // Catch:{ all -> 0x024b }
            r46 = r0
            X.0sb r4 = r11.A02     // Catch:{ all -> 0x024b }
            X.0t9 r0 = r11.A0O     // Catch:{ all -> 0x024b }
            r39 = r0
            X.0sc r0 = r11.A0E     // Catch:{ all -> 0x024b }
            r24 = r0
            X.0ug r0 = r11.A0Q     // Catch:{ all -> 0x024b }
            r23 = r0
            X.0sd r0 = r11.A04     // Catch:{ all -> 0x024b }
            r22 = r0
            X.39E r3 = new X.39E     // Catch:{ all -> 0x024b }
            r3.<init>(r4, r8, r5)     // Catch:{ all -> 0x024b }
            X.12W r0 = r11.A0F     // Catch:{ all -> 0x024b }
            r20 = r0
            X.0si r0 = r11.A0K     // Catch:{ all -> 0x024b }
            r19 = r0
            X.0tq r0 = r11.A0L     // Catch:{ all -> 0x024b }
            r18 = r0
            X.12T r0 = r11.A0C     // Catch:{ all -> 0x024b }
            r25 = r0
            X.1I1 r0 = r11.A05     // Catch:{ all -> 0x024b }
            r21 = r0
            java.util.List r43 = X.AnonymousClass2GK.A0D(r4)     // Catch:{ all -> 0x024b }
            X.12N r1 = r11.A09     // Catch:{ all -> 0x024b }
            java.util.concurrent.atomic.AtomicLong r0 = r1.A07     // Catch:{ all -> 0x024b }
            r17 = r0
            java.util.concurrent.atomic.AtomicLong r15 = r1.A06     // Catch:{ all -> 0x024b }
            X.3iK r14 = r11.A0A     // Catch:{ all -> 0x024b }
            X.12M r13 = r11.A08     // Catch:{ all -> 0x024b }
            X.2GT r2 = r11.A0P     // Catch:{ all -> 0x024b }
            X.11D r12 = r11.A0M     // Catch:{ all -> 0x024b }
            r1 = 2668(0xa6c, float:3.739E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x024b }
            boolean r0 = r5.A0E(r0, r1)     // Catch:{ all -> 0x024b }
            X.1uy r1 = new X.1uy     // Catch:{ all -> 0x024b }
            r1.<init>(r12, r0, r0)     // Catch:{ all -> 0x024b }
            r12 = 1
            com.facebook.redex.IDxECallbackShape414S0100000_2_I1 r0 = new com.facebook.redex.IDxECallbackShape414S0100000_2_I1     // Catch:{ all -> 0x024b }
            r0.<init>(r11, r12)     // Catch:{ all -> 0x024b }
            X.2xS r16 = new X.2xS     // Catch:{ all -> 0x024b }
            r26 = r14
            r28 = r0
            r29 = r11
            r30 = r24
            r31 = r20
            r35 = r8
            r36 = r19
            r37 = r18
            r38 = r5
            r40 = r2
            r41 = r23
            r44 = r17
            r45 = r15
            r17 = r46
            r18 = r4
            r19 = r1
            r20 = r22
            r22 = r7
            r23 = r13
            r24 = r3
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)     // Catch:{ all -> 0x024b }
            java.lang.Long r0 = X.C13690nt.A0W(r9)     // Catch:{ all -> 0x024b }
            r2.A0J = r0     // Catch:{ all -> 0x024b }
            boolean r4 = r16.A03()     // Catch:{ all -> 0x024b }
            r11.A05()     // Catch:{ all -> 0x025d }
            java.lang.String r0 = "google-backup-worker/doWork done with success = "
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x025d }
            r0.append(r4)     // Catch:{ all -> 0x025d }
            X.C13680ns.A1V(r0)     // Catch:{ all -> 0x025d }
            java.lang.Object r3 = r6.A0O     // Catch:{ all -> 0x025d }
            monitor-enter(r3)     // Catch:{ all -> 0x025d }
            X.2GM r2 = r6.A00     // Catch:{ all -> 0x0248 }
            if (r2 == 0) goto L_0x0221
            monitor-enter(r2)     // Catch:{ all -> 0x0248 }
            boolean r1 = r2.A01     // Catch:{ all -> 0x021b }
            monitor-exit(r2)     // Catch:{ all -> 0x0248 }
            goto L_0x021e
        L_0x021b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0248 }
            throw r0     // Catch:{ all -> 0x0248 }
        L_0x021e:
            r0 = 1
            if (r1 != 0) goto L_0x0222
        L_0x0221:
            r0 = 0
        L_0x0222:
            monitor-exit(r3)     // Catch:{ all -> 0x0248 }
            if (r0 == 0) goto L_0x0226
            goto L_0x023d
        L_0x0226:
            if (r4 == 0) goto L_0x022d
            X.02Q r0 = X.AnonymousClass02Q.A00()     // Catch:{ all -> 0x025d }
            goto L_0x0259
        L_0x022d:
            boolean r0 = r14.A04()     // Catch:{ all -> 0x025d }
            if (r0 != 0) goto L_0x0242
            int r0 = r11.A00     // Catch:{ all -> 0x025d }
            if (r9 >= r0) goto L_0x0242
            X.02P r0 = new X.02P     // Catch:{ all -> 0x025d }
            r0.<init>()     // Catch:{ all -> 0x025d }
            goto L_0x0259
        L_0x023d:
            java.lang.String r0 = "google-backup-worker/doWork cancelled by user"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x025d }
        L_0x0242:
            X.0Gc r0 = new X.0Gc     // Catch:{ all -> 0x025d }
            r0.<init>()     // Catch:{ all -> 0x025d }
            goto L_0x0259
        L_0x0248:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0248 }
            goto L_0x024f
        L_0x024b:
            r0 = move-exception
            r11.A05()     // Catch:{ all -> 0x025d }
        L_0x024f:
            throw r0     // Catch:{ all -> 0x025d }
        L_0x0250:
            r0 = 0
            r1.getAndSet(r0)     // Catch:{ all -> 0x025d }
            X.0Gc r0 = new X.0Gc     // Catch:{ all -> 0x025d }
            r0.<init>()     // Catch:{ all -> 0x025d }
        L_0x0259:
            r10.A05()
            return r0
        L_0x025d:
            r1 = move-exception
            X.12Q r0 = r11.A0B
            r0.A05()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.backup.google.workers.GoogleBackupWorker.A04():X.02Q");
    }

    public final void A05() {
        this.A0D.A00(6, false);
        C19670yo r2 = this.A06;
        r2.A06();
        C15860rz r3 = this.A0J;
        if (AnonymousClass2GK.A0G(r3) || r2.A0c.get()) {
            r2.A0c.getAndSet(false);
            AnonymousClass12U r1 = this.A07;
            AnonymousClass2GM A002 = r1.A00();
            C19080xj r12 = r1.A0E;
            if (A002 != null) {
                A002.A09(false);
            }
            r12.A00(2, false);
            AnonymousClass2GS.A02();
            r2.A0G.open();
            r2.A0D.open();
            r2.A0A.open();
            r2.A04 = false;
            r3.A0j(0);
            C13680ns.A0w(r3.A0K(), "gdrive_error_code", 10);
        }
        AnonymousClass12M r13 = this.A08;
        r13.A00 = -1;
        r13.A01 = -1;
        AnonymousClass12N r32 = this.A09;
        r32.A06.set(0);
        r32.A05.set(0);
        r32.A04.set(0);
        r32.A07.set(0);
        r32.A03.set(0);
    }

    public final void A06(int i2) {
        if (this.A0A.A04()) {
            String A042 = AnonymousClass2GK.A04(i2);
            if (i2 != 10) {
                TextUtils.join(IOUtils.LINE_SEPARATOR_UNIX, Thread.currentThread().getStackTrace());
                Log.e(C13680ns.A0h("google-backup-worker/set-error/", A042));
            }
            C13680ns.A0w(this.A0J.A0K(), "gdrive_error_code", i2);
            AnonymousClass2GT.A00(this.A0P, AnonymousClass2GK.A00(i2));
            this.A08.A06(i2, this.A09.A00());
        }
    }
}
