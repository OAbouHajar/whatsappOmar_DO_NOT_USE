package com.obwhatsapp.backup.google.workers;

import X.AnonymousClass000;
import X.AnonymousClass01F;
import X.AnonymousClass022;
import X.AnonymousClass02P;
import X.AnonymousClass02Q;
import X.AnonymousClass03z;
import X.AnonymousClass040;
import X.AnonymousClass041;
import X.AnonymousClass042;
import X.AnonymousClass043;
import X.AnonymousClass04P;
import X.AnonymousClass12M;
import X.AnonymousClass12P;
import X.AnonymousClass12T;
import X.AnonymousClass12W;
import X.AnonymousClass390;
import X.C006903e;
import X.C02890Gc;
import X.C13680ns;
import X.C13700nu;
import X.C14710pd;
import X.C15860rz;
import X.C16040sK;
import X.C16150sX;
import X.C16180sb;
import X.C16190sc;
import X.C16200sd;
import X.C16260sj;
import X.C16300so;
import X.C16320sq;
import X.C16440t3;
import X.C16490t9;
import X.C16510tB;
import X.C16600tK;
import X.C16980tz;
import X.C17130ua;
import X.C17190ug;
import X.C17660vR;
import X.C18260wP;
import X.C18990xa;
import X.C19080xj;
import X.C19380yL;
import X.C19670yo;
import X.C70873i4;
import X.C71003iK;
import X.C75673sX;
import android.content.Context;
import android.text.TextUtils;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class GoogleEncryptedReUploadWorker extends Worker {
    public AnonymousClass390 A00;
    public boolean A01 = false;
    public final C16300so A02;
    public final C16180sb A03;
    public final C16040sK A04;
    public final C17130ua A05;
    public final C16200sd A06;
    public final C19670yo A07;
    public final AnonymousClass12M A08;
    public final C71003iK A09;
    public final AnonymousClass12T A0A;
    public final C19080xj A0B;
    public final C18260wP A0C;
    public final C16190sc A0D;
    public final AnonymousClass12W A0E;
    public final C16440t3 A0F;
    public final C16980tz A0G;
    public final C19380yL A0H;
    public final C16260sj A0I;
    public final C15860rz A0J;
    public final C14710pd A0K;
    public final C16490t9 A0L;
    public final C75673sX A0M = new C75673sX();
    public final C17190ug A0N;
    public final C18990xa A0O;
    public final C16510tB A0P;
    public final C17660vR A0Q;
    public final C16320sq A0R;
    public final AnonymousClass12P A0S;
    public final ArrayList A0T = AnonymousClass000.A0u();
    public final Random A0U;

    public GoogleEncryptedReUploadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        AnonymousClass01F A0A2 = C13700nu.A0A(context);
        this.A0U = new Random();
        this.A0F = A0A2.Agj();
        this.A0K = A0A2.A1G();
        this.A0R = A0A2.Ai4();
        C16150sX r1 = (C16150sX) A0A2;
        this.A0Q = (C17660vR) r1.APW.get();
        this.A02 = A0A2.A6q();
        this.A04 = C16150sX.A04(r1);
        this.A0G = C16150sX.A0V(r1);
        this.A03 = (C16180sb) r1.A8b.get();
        this.A05 = C16150sX.A05(r1);
        this.A0L = A0A2.Ai6();
        this.A0D = (C16190sc) r1.A8R.get();
        this.A0O = (C18990xa) r1.ADh.get();
        C17190ug A0t = C16150sX.A0t(r1);
        this.A0N = A0t;
        this.A0B = (C19080xj) r1.A1f.get();
        this.A0S = (AnonymousClass12P) r1.ARD.get();
        this.A06 = (C16200sd) r1.A7h.get();
        this.A0E = (AnonymousClass12W) r1.AEM.get();
        this.A0A = (AnonymousClass12T) r1.AL6.get();
        this.A0I = C16150sX.A0X(r1);
        this.A0J = A0A2.Ai3();
        this.A0P = (C16510tB) r1.A8S.get();
        this.A08 = (AnonymousClass12M) r1.AB6.get();
        this.A0C = A0A2.A6a();
        this.A0H = (C19380yL) r1.AQd.get();
        C19670yo r2 = (C19670yo) r1.AB4.get();
        this.A07 = r2;
        this.A09 = new C70873i4((C16600tK) r1.ARd.get(), r2, this, A0t);
    }

    public static AnonymousClass043 A00(C15860rz r4, long j2) {
        AnonymousClass040 r1 = new AnonymousClass040();
        r1.A02 = true;
        r1.A01(r4.A07() == 0 ? AnonymousClass041.UNMETERED : AnonymousClass041.NOT_ROAMING);
        AnonymousClass042 A002 = r1.A00();
        C006903e r42 = new C006903e(GoogleEncryptedReUploadWorker.class);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        r42.A02(j2, timeUnit);
        r42.A00.A0A = A002;
        r42.A03(AnonymousClass04P.LINEAR, timeUnit, 900000);
        return (AnonymousClass043) r42.A00();
    }

    public static void A01(AnonymousClass03z r8, C15860rz r9, AnonymousClass12P r10, Random random, boolean z2) {
        long j2;
        Calendar instance = Calendar.getInstance();
        if (!z2) {
            int A062 = r9.A06();
            long currentTimeMillis = System.currentTimeMillis() - r9.A0H(r9.A0M());
            if (A062 == 1 || (A062 != 2 ? !(A062 != 3 || currentTimeMillis < 2419200000L) : currentTimeMillis >= 432000000)) {
                Log.i("google-encrypted-re-upload-worker/scheduleNextRun doesn't schedule run because google drive backup will run in the next backup slot");
                return;
            }
            long timeInMillis = instance.getTimeInMillis();
            if (instance.get(11) >= 2) {
                instance.add(5, 1);
            }
            instance.set(14, 0);
            instance.set(13, 0);
            instance.set(12, 0);
            instance.set(11, 2);
            instance.add(13, random.nextInt((int) TimeUnit.SECONDS.convert(4, TimeUnit.HOURS)));
            j2 = instance.getTimeInMillis() - timeInMillis;
        } else {
            j2 = 0;
        }
        StringBuilder A0r = AnonymousClass000.A0r("google-encrypted-re-upload-worker/scheduleNextRun at ");
        A0r.append(instance.getTime());
        A0r.append(", immediately = ");
        A0r.append(z2);
        A0r.append(", existingWorkPolicy = ");
        A0r.append(r8);
        C13680ns.A1V(A0r);
        ((AnonymousClass022) r10.get()).A06(r8, A00(r9, j2), "com.obwhatsapp.backup.google.google-encrypted-re-upload-worker");
    }

    public static final void A02(String str, boolean z2) {
        if (z2) {
            StringBuilder A0r = AnonymousClass000.A0r("google-encrypted-re-upload-worker ");
            A0r.append(str);
            Log.w(AnonymousClass000.A0h(", work aborted", A0r));
        }
    }

    public void A03() {
        Log.i("google-encrypted-re-upload-worker/onStopped");
        this.A07.A0d.getAndSet(false);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|(1:4)|5|6|7|8|9|10|(2:12|(5:14|15|16|17|(2:19|(2:21|(5:23|24|25|26|(4:(1:29)|31|32|(2:34|(8:36|37|38|39|(1:41)(5:42|43|44|45|(3:47|(1:49)|50)(2:51|(1:53)(14:54|(1:56)(2:57|(1:59)(1:60))|(1:62)(2:63|(1:65)(10:67|(1:69)|70|(1:72)(11:73|(2:76|74)|271|77|78|79|(7:81|82|83|86|(1:88)(3:89|90|(3:92|(2:94|(1:96)(3:98|(2:99|(3:101|(1:280)(2:103|(2:105|(2:107|(2:109|(2:110|(2:112|(11:114|(1:116)|118|119|120|125|(1:127)|129|(1:131)|(2:133|284)(2:134|283)|135)(1:275))(1:282)))(1:279))(2:278|151))(1:276))|272)(1:273))|149))|191)(1:150))|97|191)(1:192)|197|(1:199)|200|(6:202|(5:206|(1:208)|211|(2:214|212)|292)(2:205|209)|210|211|(1:212)|292)(2:215|(1:217)(2:218|(1:220))))|(2:223|251)(3:224|(2:226|(5:228|(2:230|246)(3:231|(2:233|(1:235))(2:236|(1:238)(2:239|(1:241)))|246)|242|(1:244)|245)(2:247|(1:249)))|250)|252|(1:260)|261|266|267))|66|221|(0)(0)|252|254|256|258|260|261|266|267)))|265|266|267))))))))|262|263|264|265|266|267|(2:(17:175|(4:177|(1:(2:179|(1:181)(1:290))(2:291|182))|(1:184)(2:186|(1:188))|189)(1:185)|190|191|197|(0)|200|(0)(0)|(0)(0)|252|254|256|258|260|261|266|267)|(2:142|(4:274|144|(2:146|167)(0)|152)(2:147|(17:277|149|97|191|197|(0)|200|(0)(0)|(0)(0)|252|254|256|258|260|261|266|267)(2:281|272))))) */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x036a, code lost:
        if (r7.length() <= 0) goto L_0x036c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0373, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        com.whatsapp.util.Log.e(X.AnonymousClass000.A0g("gdrive/backup/failed to get canonical path for ", r7), r1);
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0389, code lost:
        if (r1.startsWith(r0.A04) == false) goto L_0x038b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x03b8, code lost:
        r11.getAbsolutePath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:?, code lost:
        r0.await();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03bf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:?, code lost:
        com.whatsapp.util.Log.e((java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03ea, code lost:
        r0.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03f1, code lost:
        if (r6.A05() == false) goto L_0x04f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03f3, code lost:
        r14 = r34.size();
        com.whatsapp.util.Log.i(X.C13680ns.A0c(r14, "gdrive/encrypted-re-upload/files/files-to-be-uploaded/count/"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0404, code lost:
        if (r6.A05() == false) goto L_0x04f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0406, code lost:
        r30.A0Q.set(0);
        r12 = new java.util.concurrent.atomic.AtomicBoolean(true);
        r7 = new java.util.concurrent.atomic.AtomicReference((java.lang.Object) null);
        r11 = new java.util.concurrent.CountDownLatch(r14);
        r16 = r34.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0426, code lost:
        if (r16.hasNext() == false) goto L_0x047a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0428, code lost:
        r14 = (X.C615839m) r16.next();
        r0 = r14.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0438, code lost:
        if (r0.exists() != false) goto L_0x0450;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x043a, code lost:
        r14 = X.AnonymousClass000.A0r("gdrive/encrypted-re-upload/backup-file file ");
        r14.append("<file>");
        com.whatsapp.util.Log.i(X.AnonymousClass000.A0h(" does not exist", r14));
        r11.countDown();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0454, code lost:
        if (r0.isDirectory() != false) goto L_0x046f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0456, code lost:
        X.AnonymousClass2GK.A00.execute(new com.facebook.redex.RunnableRunnableShape1S0600000_I1(r30, r7, r3, r14, r12, r11, 1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x046f, code lost:
        r0 = X.AnonymousClass000.A0V(X.C13680ns.A0h("gdrive-service/backup-file/expected-file-got-directory-instead/", "<file>"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x047a, code lost:
        com.whatsapp.util.Log.i("gdrive/encrypted-re-upload/files waiting for backup to finish...");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:?, code lost:
        r11 = r11.await(86400000, java.util.concurrent.TimeUnit.MILLISECONDS) & true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x048b, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:?, code lost:
        com.whatsapp.util.Log.e("gdrive/encrypted-re-upload/files upload interrupted", r11);
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x04ff, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:?, code lost:
        com.whatsapp.util.Log.e("gdrive/encrypted-re-upload", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x06e1, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x06e2, code lost:
        r4.A0B.A00(7, false);
        r0 = r4.A07;
        r0.A06();
        r0.A0d.getAndSet(false);
        r4.A0H.A03(5, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x06f9, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0102, code lost:
        if (r6.jabber_id == null) goto L_0x0104;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0077 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00b4 A[Catch:{ InterruptedException -> 0x048b, 1db | 1kR -> 0x04ff, all -> 0x06e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x04ff A[ExcHandler: 1db | 1kR (r1v21 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:78:0x0266] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0517 A[Catch:{ InterruptedException -> 0x048b, 1db | 1kR -> 0x04ff, all -> 0x06e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:202:0x0536 A[Catch:{ InterruptedException -> 0x048b, 1db | 1kR -> 0x04ff, all -> 0x06e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x05c2 A[Catch:{ InterruptedException -> 0x048b, 1db | 1kR -> 0x04ff, all -> 0x06e1 }, LOOP:5: B:212:0x05bc->B:214:0x05c2, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x05cc A[Catch:{ InterruptedException -> 0x048b, 1db | 1kR -> 0x04ff, all -> 0x06e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x05f1 A[Catch:{ InterruptedException -> 0x048b, 1db | 1kR -> 0x04ff, all -> 0x06e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x05f3 A[Catch:{ InterruptedException -> 0x048b, 1db | 1kR -> 0x04ff, all -> 0x06e1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass02Q A04() {
        /*
            r68 = this;
            X.0Gc r0 = new X.0Gc
            r0.<init>()
            r25 = 7
            r5 = 0
            r4 = r68
            X.0tz r0 = r4.A0G     // Catch:{ InterruptedException | ExecutionException -> 0x0077 }
            android.content.Context r6 = r0.A00     // Catch:{ InterruptedException | ExecutionException -> 0x0077 }
            X.03l r3 = X.C218415q.A00(r6)     // Catch:{ InterruptedException | ExecutionException -> 0x0077 }
            java.lang.String r0 = "chat_history_backup@1"
            r3.A0J = r0     // Catch:{ InterruptedException | ExecutionException -> 0x0077 }
            android.content.Intent r2 = X.C13680ns.A09()     // Catch:{ InterruptedException | ExecutionException -> 0x0077 }
            java.lang.String r1 = r6.getPackageName()     // Catch:{ InterruptedException | ExecutionException -> 0x0077 }
            java.lang.String r0 = "com.obwhatsapp.backup.google.SettingsGoogleDrive"
            r2.setClassName(r1, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0077 }
            android.app.PendingIntent r0 = X.C42341xd.A00(r6, r5, r2, r5)     // Catch:{ InterruptedException | ExecutionException -> 0x0077 }
            r3.A09 = r0     // Catch:{ InterruptedException | ExecutionException -> 0x0077 }
            r1 = 2131232243(0x7f0805f3, float:1.808059E38)
            int r1 = com.obwhatsapp.yo.yo.getNIcon(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x0077 }
            android.app.Notification r0 = r3.A07     // Catch:{ InterruptedException | ExecutionException -> 0x0077 }
            r0.icon = r1     // Catch:{ InterruptedException | ExecutionException -> 0x0077 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ InterruptedException | ExecutionException -> 0x0077 }
            r2 = 1
            r0 = 21
            if (r1 < r0) goto L_0x003d
            r3.A06 = r2     // Catch:{ InterruptedException | ExecutionException -> 0x0077 }
        L_0x003d:
            android.content.res.Resources r1 = r6.getResources()     // Catch:{ InterruptedException | ExecutionException -> 0x0077 }
            r0 = 2131893464(0x7f121cd8, float:1.9421705E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0077 }
            r3.A0A(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0077 }
            android.content.res.Resources r1 = r6.getResources()     // Catch:{ InterruptedException | ExecutionException -> 0x0077 }
            r0 = 2131888106(0x7f1207ea, float:1.9410838E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0077 }
            r3.A09(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0077 }
            r0 = 100
            r3.A03(r0, r0, r2)     // Catch:{ InterruptedException | ExecutionException -> 0x0077 }
            android.app.Notification r1 = r3.A01()     // Catch:{ InterruptedException | ExecutionException -> 0x0077 }
            r0 = 5
            X.0RE r3 = new X.0RE     // Catch:{ InterruptedException | ExecutionException -> 0x0077 }
            r3.<init>(r0, r1, r5)     // Catch:{ InterruptedException | ExecutionException -> 0x0077 }
            androidx.work.WorkerParameters r0 = r4.A01     // Catch:{ InterruptedException | ExecutionException -> 0x0077 }
            X.0kc r2 = r0.A02     // Catch:{ InterruptedException | ExecutionException -> 0x0077 }
            android.content.Context r1 = r4.A00     // Catch:{ InterruptedException | ExecutionException -> 0x0077 }
            java.util.UUID r0 = r0.A08     // Catch:{ InterruptedException | ExecutionException -> 0x0077 }
            X.1bY r0 = r2.Ady(r1, r3, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x0077 }
            r0.get()     // Catch:{ InterruptedException | ExecutionException -> 0x0077 }
        L_0x0077:
            X.0xj r0 = r4.A0B     // Catch:{ all -> 0x06e1 }
            r67 = r0
            r1 = 1
            r2 = 7
            r0.A00(r2, r1)     // Catch:{ all -> 0x06e1 }
            androidx.work.WorkerParameters r0 = r4.A01     // Catch:{ all -> 0x06e1 }
            int r13 = r0.A00     // Catch:{ all -> 0x06e1 }
            X.3sX r0 = r4.A0M     // Catch:{ all -> 0x06e1 }
            r46 = r0
            java.lang.Long r2 = X.C13690nt.A0W(r13)     // Catch:{ all -> 0x06e1 }
            r0.A03 = r2     // Catch:{ all -> 0x06e1 }
            X.0rz r0 = r4.A0J     // Catch:{ all -> 0x06e1 }
            r43 = r0
            java.lang.String r19 = r43.A0M()     // Catch:{ all -> 0x06e1 }
            X.0sK r2 = r4.A04     // Catch:{ all -> 0x06e1 }
            r2.A0B()     // Catch:{ all -> 0x06e1 }
            com.obwhatsapp.Me r6 = r2.A00     // Catch:{ all -> 0x06e1 }
            X.0sd r10 = r4.A06     // Catch:{ all -> 0x06e1 }
            X.0rz r0 = r10.A03     // Catch:{ all -> 0x06e1 }
            r66 = r0
            boolean r0 = r66.A1f()     // Catch:{ all -> 0x06e1 }
            boolean r3 = X.AnonymousClass000.A1P(r0)
            java.lang.String r0 = "backup encryption is not enabled"
            A02(r0, r3)     // Catch:{ all -> 0x06e1 }
            r29 = 3
            if (r3 != 0) goto L_0x06c0
            X.0yo r0 = r4.A07     // Catch:{ all -> 0x06e1 }
            r65 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0c     // Catch:{ all -> 0x06e1 }
            boolean r3 = r0.get()     // Catch:{ all -> 0x06e1 }
            java.lang.String r0 = "backup is running"
            A02(r0, r3)     // Catch:{ all -> 0x06e1 }
            if (r3 != 0) goto L_0x06c0
            boolean r0 = r65.A0A()     // Catch:{ all -> 0x06e1 }
            boolean r3 = X.AnonymousClass000.A1P(r0)
            java.lang.String r0 = "Google Drive is not accessible"
            A02(r0, r3)     // Catch:{ all -> 0x06e1 }
            if (r3 != 0) goto L_0x06c0
            boolean r3 = android.text.TextUtils.isEmpty(r19)     // Catch:{ all -> 0x06e1 }
            java.lang.String r0 = "grdive account name is empty"
            A02(r0, r3)     // Catch:{ all -> 0x06e1 }
            if (r3 != 0) goto L_0x06c0
            X.0xa r0 = r4.A0O     // Catch:{ all -> 0x06e1 }
            boolean r3 = r0.A00     // Catch:{ all -> 0x06e1 }
            java.lang.String r0 = "OBWhatsApp login has failed"
            A02(r0, r3)     // Catch:{ all -> 0x06e1 }
            if (r3 != 0) goto L_0x06c0
            X.0sj r0 = r4.A0I     // Catch:{ all -> 0x06e1 }
            r18 = r0
            boolean r0 = r18.A0B()     // Catch:{ all -> 0x06e1 }
            boolean r3 = X.AnonymousClass000.A1P(r0)
            java.lang.String r0 = "read/write storage permission denied"
            A02(r0, r3)     // Catch:{ all -> 0x06e1 }
            if (r3 != 0) goto L_0x06c0
            if (r6 == 0) goto L_0x0104
            java.lang.String r0 = r6.jabber_id     // Catch:{ all -> 0x06e1 }
            r3 = 0
            if (r0 != 0) goto L_0x0105
        L_0x0104:
            r3 = 1
        L_0x0105:
            java.lang.String r0 = "me or jabberId is null"
            A02(r0, r3)     // Catch:{ all -> 0x06e1 }
            if (r3 != 0) goto L_0x06c0
            boolean r3 = X.AnonymousClass2GK.A0H(r43)     // Catch:{ all -> 0x06e1 }
            java.lang.String r0 = "media restore is pending"
            A02(r0, r3)     // Catch:{ all -> 0x06e1 }
            if (r3 != 0) goto L_0x06c0
            java.lang.String r3 = android.os.Environment.getExternalStorageState()     // Catch:{ all -> 0x06e1 }
            r0 = r65
            r0.A09(r3)     // Catch:{ all -> 0x06e1 }
            boolean r0 = r0.A09     // Catch:{ all -> 0x06e1 }
            boolean r3 = X.AnonymousClass000.A1P(r0)
            java.lang.String r0 = "sdcard is not available"
            A02(r0, r3)     // Catch:{ all -> 0x06e1 }
            if (r3 == 0) goto L_0x0136
            r0 = 9
            X.02Q r3 = r4.A05(r13, r0)     // Catch:{ all -> 0x06e1 }
            goto L_0x06c5
        L_0x0136:
            r65.A05()     // Catch:{ all -> 0x06e1 }
            r65.A07()     // Catch:{ all -> 0x06e1 }
            r0 = r65
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0g     // Catch:{ all -> 0x06e1 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x06e1 }
            boolean r3 = X.AnonymousClass000.A1P(r0)
            java.lang.String r0 = "network is not available"
            A02(r0, r3)     // Catch:{ all -> 0x06e1 }
            if (r3 == 0) goto L_0x0161
            r0 = r65
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0h     // Catch:{ all -> 0x06e1 }
            boolean r1 = r0.get()     // Catch:{ all -> 0x06e1 }
            r0 = 5
            if (r1 == 0) goto L_0x015b
            r0 = 4
        L_0x015b:
            X.02Q r3 = r4.A05(r13, r0)     // Catch:{ all -> 0x06e1 }
            goto L_0x06c5
        L_0x0161:
            r0 = r65
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0d     // Catch:{ all -> 0x06e1 }
            r64 = r0
            boolean r1 = r0.getAndSet(r1)     // Catch:{ all -> 0x06e1 }
            java.lang.String r0 = "media re-encryption already running"
            A02(r0, r1)     // Catch:{ all -> 0x06e1 }
            if (r1 == 0) goto L_0x0179
            r0 = 3
            X.02Q r3 = r4.A05(r13, r0)     // Catch:{ all -> 0x06e1 }
            goto L_0x06c5
        L_0x0179:
            r65.A00()     // Catch:{ all -> 0x06e1 }
            r2.A0B()     // Catch:{ all -> 0x06e1 }
            com.obwhatsapp.Me r0 = r2.A00     // Catch:{ all -> 0x06e1 }
            r48 = 0
            if (r0 != 0) goto L_0x018b
            java.lang.String r0 = "google-re-enc-upload-worker/my-jid/me is null, can't proceed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x06e1 }
            goto L_0x0197
        L_0x018b:
            java.lang.String r0 = r0.jabber_id     // Catch:{ all -> 0x06e1 }
            if (r0 != 0) goto L_0x0195
            java.lang.String r0 = "google-re-enc-upload-worker/my-jid/jidUser is null, fatal error."
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x06e1 }
            goto L_0x0197
        L_0x0195:
            r48 = r0
        L_0x0197:
            if (r48 != 0) goto L_0x019c
            java.lang.String r0 = "google-re-enc-upload-worker/handle-intent/backup jid is null."
            goto L_0x01a4
        L_0x019c:
            java.lang.String r62 = r43.A0M()     // Catch:{ all -> 0x06e1 }
            if (r62 != 0) goto L_0x01a9
            java.lang.String r0 = "google-re-enc-upload-worker/handle-intent/gdrive account name is null."
        L_0x01a4:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x06e1 }
            goto L_0x05ed
        L_0x01a9:
            android.content.Context r6 = r4.A00     // Catch:{ all -> 0x06e1 }
            X.0pd r9 = r4.A0K     // Catch:{ all -> 0x06e1 }
            X.0so r3 = r4.A02     // Catch:{ all -> 0x06e1 }
            X.0vR r2 = r4.A0Q     // Catch:{ all -> 0x06e1 }
            X.0ua r1 = r4.A05     // Catch:{ all -> 0x06e1 }
            X.0sc r0 = r4.A0D     // Catch:{ all -> 0x06e1 }
            r17 = r0
            X.12T r0 = r4.A0A     // Catch:{ all -> 0x06e1 }
            r16 = r0
            X.0tB r8 = r4.A0P     // Catch:{ all -> 0x06e1 }
            X.0wP r7 = r4.A0C     // Catch:{ all -> 0x06e1 }
            X.0sq r0 = r4.A0R     // Catch:{ all -> 0x06e1 }
            java.lang.String r63 = "background"
            X.2GM r37 = new X.2GM     // Catch:{ all -> 0x06e1 }
            r49 = r37
            r50 = r6
            r51 = r3
            r52 = r1
            r53 = r10
            r54 = r16
            r55 = r7
            r56 = r17
            r57 = r18
            r58 = r9
            r59 = r8
            r60 = r2
            r61 = r0
            r49.<init>(r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63)     // Catch:{ all -> 0x06e1 }
            boolean r0 = r4.A01     // Catch:{ all -> 0x06e1 }
            if (r0 != 0) goto L_0x01f4
            java.util.ArrayList r1 = r4.A0T     // Catch:{ all -> 0x06e1 }
            X.0sb r0 = r4.A03     // Catch:{ all -> 0x06e1 }
            java.util.List r0 = X.AnonymousClass2GK.A0D(r0)     // Catch:{ all -> 0x06e1 }
            r1.addAll(r0)     // Catch:{ all -> 0x06e1 }
            r0 = 1
            r4.A01 = r0     // Catch:{ all -> 0x06e1 }
        L_0x01f4:
            X.0t3 r15 = r4.A0F     // Catch:{ all -> 0x06e1 }
            X.0tz r14 = r4.A0G     // Catch:{ all -> 0x06e1 }
            java.util.ArrayList r12 = r4.A0T     // Catch:{ all -> 0x06e1 }
            X.0t9 r11 = r4.A0L     // Catch:{ all -> 0x06e1 }
            X.0sb r7 = r4.A03     // Catch:{ all -> 0x06e1 }
            X.0ug r6 = r4.A0N     // Catch:{ all -> 0x06e1 }
            X.3iK r3 = r4.A09     // Catch:{ all -> 0x06e1 }
            X.39E r2 = new X.39E     // Catch:{ all -> 0x06e1 }
            r0 = r43
            r2.<init>(r7, r0, r9)     // Catch:{ all -> 0x06e1 }
            X.12W r1 = r4.A0E     // Catch:{ all -> 0x06e1 }
            X.12M r0 = r4.A08     // Catch:{ all -> 0x06e1 }
            X.390 r8 = new X.390     // Catch:{ all -> 0x06e1 }
            r30 = r8
            r31 = r7
            r32 = r10
            r33 = r0
            r34 = r2
            r35 = r16
            r36 = r3
            r38 = r17
            r39 = r1
            r40 = r15
            r41 = r14
            r42 = r18
            r44 = r9
            r45 = r11
            r47 = r6
            r49 = r12
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)     // Catch:{ all -> 0x06e1 }
            r4.A00 = r8     // Catch:{ all -> 0x06e1 }
            java.lang.String r28 = "gdrive/encrypted-re-upload"
            X.0sd r0 = r8.A01     // Catch:{ all -> 0x06e1 }
            X.0rz r0 = r0.A03     // Catch:{ all -> 0x06e1 }
            boolean r0 = r0.A1f()     // Catch:{ all -> 0x06e1 }
            r27 = 0
            if (r0 != 0) goto L_0x0249
            java.lang.String r0 = "gdrive/encrypted-re-upload/encryption is not enabled so nothing to be done here"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x06e1 }
            goto L_0x05ef
        L_0x0249:
            X.12M r0 = r8.A02     // Catch:{ all -> 0x06e1 }
            r41 = r0
            java.util.Iterator r1 = X.C16590tJ.A00(r41)     // Catch:{ all -> 0x06e1 }
        L_0x0251:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x06e1 }
            if (r0 == 0) goto L_0x025b
            r1.next()     // Catch:{ all -> 0x06e1 }
            goto L_0x0251
        L_0x025b:
            X.2GM r9 = r8.A06     // Catch:{ all -> 0x06e1 }
            X.59I r0 = r9.A07     // Catch:{ all -> 0x06e1 }
            r0.A00 = r5     // Catch:{ all -> 0x06e1 }
            java.util.concurrent.atomic.AtomicInteger r0 = r9.A0I     // Catch:{ all -> 0x06e1 }
            r0.set(r5)     // Catch:{ all -> 0x06e1 }
            X.2GJ r6 = r8.A05     // Catch:{ 1db | 1kR -> 0x04ff }
            boolean r0 = X.C62173By.A06(r6, r9)     // Catch:{ 1db | 1kR -> 0x04ff }
            if (r0 == 0) goto L_0x04f9
            java.lang.String r2 = "gdrive/encrypted-re-upload/files"
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 1db | 1kR -> 0x04ff }
            java.lang.String r1 = r8.A0H     // Catch:{ 1db | 1kR -> 0x04ff }
            X.3iA r0 = new X.3iA     // Catch:{ 3iM -> 0x0281, 1db | 1kR -> 0x04ff }
            r0.<init>(r9, r1)     // Catch:{ 3iM -> 0x0281, 1db | 1kR -> 0x04ff }
            java.lang.Object r3 = X.AnonymousClass2GS.A00(r0, r6, r2)     // Catch:{ 3iM -> 0x0281, 1db | 1kR -> 0x04ff }
            X.3BK r3 = (X.AnonymousClass3BK) r3     // Catch:{ 3iM -> 0x0281, 1db | 1kR -> 0x04ff }
            goto L_0x0282
        L_0x0281:
            r3 = 0
        L_0x0282:
            r2 = 0
            if (r3 != 0) goto L_0x0288
            java.lang.String r0 = "gdrive/encrypted-re-upload/files backup doesn't exist"
            goto L_0x02c3
        L_0x0288:
            X.0t3 r11 = r8.A09     // Catch:{ 1db | 1kR -> 0x04ff }
            X.0pd r7 = r8.A0D     // Catch:{ 1db | 1kR -> 0x04ff }
            long r0 = X.C40691uX.A02(r7, r5)     // Catch:{ 1db | 1kR -> 0x04ff }
            X.2xP r10 = new X.2xP     // Catch:{ 1db | 1kR -> 0x04ff }
            r10.<init>(r3, r11, r0)     // Catch:{ 1db | 1kR -> 0x04ff }
            java.lang.String r26 = "gdrive/backup/files"
            r0 = r26
            java.lang.Object r1 = X.AnonymousClass2GS.A00(r10, r6, r0)     // Catch:{ 1db | 1kR -> 0x04ff }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ 1db | 1kR -> 0x04ff }
            if (r1 != r0) goto L_0x03e0
            java.lang.String r0 = "gdrive/encrypted-re-upload/files loading files"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1db | 1kR -> 0x04ff }
            boolean r0 = r6.A05()     // Catch:{ 1db | 1kR -> 0x04ff }
            if (r0 == 0) goto L_0x04f6
            java.util.ArrayList r0 = X.AnonymousClass000.A0u()     // Catch:{ 1db | 1kR -> 0x04ff }
            java.util.List r24 = java.util.Collections.synchronizedList(r0)     // Catch:{ 1db | 1kR -> 0x04ff }
            java.util.Map r1 = r8.A0J     // Catch:{ 1db | 1kR -> 0x04ff }
            r1.clear()     // Catch:{ 1db | 1kR -> 0x04ff }
            r0 = r24
            java.util.Map r0 = X.C62173By.A02(r6, r3, r0)     // Catch:{ 1db | 1kR -> 0x04ff }
            if (r0 != 0) goto L_0x02c8
            java.lang.String r0 = "gdrive/encrypted-re-upload/failed to load files for encrypted re-upload"
        L_0x02c3:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 1db | 1kR -> 0x04ff }
            goto L_0x04f6
        L_0x02c8:
            r1.putAll(r0)     // Catch:{ 1db | 1kR -> 0x04ff }
            java.util.List r0 = r8.A0I     // Catch:{ 1db | 1kR -> 0x04ff }
            java.util.ArrayList r10 = X.C13680ns.A0n(r0)     // Catch:{ 1db | 1kR -> 0x04ff }
            r0 = 200(0xc8, float:2.8E-43)
            java.util.ArrayList r0 = X.C13690nt.A0i(r0)     // Catch:{ 1db | 1kR -> 0x04ff }
            java.util.List r34 = java.util.Collections.synchronizedList(r0)     // Catch:{ 1db | 1kR -> 0x04ff }
            r0 = 785(0x311, float:1.1E-42)
            X.0tM r1 = X.C16620tM.A02     // Catch:{ 1db | 1kR -> 0x04ff }
            int r38 = r7.A03(r1, r0)     // Catch:{ 1db | 1kR -> 0x04ff }
            r0 = 786(0x312, float:1.101E-42)
            int r0 = r7.A03(r1, r0)     // Catch:{ 1db | 1kR -> 0x04ff }
            long r0 = (long) r0     // Catch:{ 1db | 1kR -> 0x04ff }
            r39 = 1048576(0x100000, double:5.180654E-318)
            long r39 = r39 * r0
            java.lang.String r0 = "gdrive/encrypted-re-upload/files finding filesToBeUploaded"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1db | 1kR -> 0x04ff }
            java.lang.String r1 = "gdrive/encrypted-re-upload/perf/files-to-be-uploaded"
            X.1Zf r23 = new X.1Zf     // Catch:{ 1db | 1kR -> 0x04ff }
            r0 = r23
            r0.<init>((java.lang.String) r1)     // Catch:{ 1db | 1kR -> 0x04ff }
            java.util.Iterator r22 = r10.iterator()     // Catch:{ 1db | 1kR -> 0x04ff }
        L_0x0301:
            boolean r0 = r22.hasNext()     // Catch:{ 1db | 1kR -> 0x04ff }
            if (r0 == 0) goto L_0x03ea
            java.lang.Object r11 = r22.next()     // Catch:{ 1db | 1kR -> 0x04ff }
            java.io.File r11 = (java.io.File) r11     // Catch:{ 1db | 1kR -> 0x04ff }
            if (r11 == 0) goto L_0x0301
            boolean r0 = r6.A05()     // Catch:{ 1db | 1kR -> 0x04ff }
            if (r0 == 0) goto L_0x03dc
            r34.size()     // Catch:{ 1db | 1kR -> 0x04ff }
            r0 = 1000(0x3e8, float:1.401E-42)
            java.util.ArrayList r12 = X.C13690nt.A0i(r0)     // Catch:{ 1db | 1kR -> 0x04ff }
            X.0sj r0 = r8.A0B     // Catch:{ 1db | 1kR -> 0x04ff }
            boolean r0 = r0.A0B()     // Catch:{ 1db | 1kR -> 0x04ff }
            if (r0 == 0) goto L_0x03e4
            r1 = 0
            boolean r0 = X.AnonymousClass2GK.A0F(r1, r11, r12)     // Catch:{ 1db | 1kR -> 0x04ff }
            if (r0 == 0) goto L_0x03dc
            java.util.concurrent.atomic.AtomicReference r21 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ 1db | 1kR -> 0x04ff }
            r0 = r21
            r0.<init>(r1)     // Catch:{ 1db | 1kR -> 0x04ff }
            int r1 = r12.size()     // Catch:{ 1db | 1kR -> 0x04ff }
            java.util.concurrent.CountDownLatch r20 = new java.util.concurrent.CountDownLatch     // Catch:{ 1db | 1kR -> 0x04ff }
            r0 = r20
            r0.<init>(r1)     // Catch:{ 1db | 1kR -> 0x04ff }
            r1 = 1
            java.util.concurrent.atomic.AtomicBoolean r18 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ 1db | 1kR -> 0x04ff }
            r0 = r18
            r0.<init>(r1)     // Catch:{ 1db | 1kR -> 0x04ff }
            r10 = 0
        L_0x0348:
            int r0 = r12.size()     // Catch:{ 1db | 1kR -> 0x04ff }
            if (r10 >= r0) goto L_0x03b8
            boolean r0 = r6.A05()     // Catch:{ 1db | 1kR -> 0x04ff }
            if (r0 == 0) goto L_0x03dc
            java.lang.Object r7 = r12.get(r10)     // Catch:{ 1db | 1kR -> 0x04ff }
            java.io.File r7 = (java.io.File) r7     // Catch:{ 1db | 1kR -> 0x04ff }
            boolean r0 = r7.exists()     // Catch:{ 1db | 1kR -> 0x04ff }
            if (r0 == 0) goto L_0x036c
            long r16 = r7.length()     // Catch:{ 1db | 1kR -> 0x04ff }
            r14 = 0
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            r16 = 1
            if (r0 > 0) goto L_0x036e
        L_0x036c:
            r16 = 0
        L_0x036e:
            java.lang.String r1 = r7.getCanonicalPath()     // Catch:{ IOException -> 0x0373, 1db | 1kR -> 0x04ff }
            goto L_0x037e
        L_0x0373:
            r1 = move-exception
            java.lang.String r0 = "gdrive/backup/failed to get canonical path for "
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r7)     // Catch:{ 1db | 1kR -> 0x04ff }
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ 1db | 1kR -> 0x04ff }
            r1 = 0
        L_0x037e:
            X.39E r0 = r8.A03     // Catch:{ 1db | 1kR -> 0x04ff }
            if (r1 == 0) goto L_0x038b
            java.lang.String r14 = r0.A04     // Catch:{ 1db | 1kR -> 0x04ff }
            boolean r15 = r1.startsWith(r14)     // Catch:{ 1db | 1kR -> 0x04ff }
            r14 = 1
            if (r15 != 0) goto L_0x038c
        L_0x038b:
            r14 = 0
        L_0x038c:
            if (r14 == 0) goto L_0x0394
            boolean r0 = r0.A00(r7, r1)     // Catch:{ 1db | 1kR -> 0x04ff }
            r16 = r16 & r0
        L_0x0394:
            if (r16 == 0) goto L_0x03af
            X.3IA r14 = new X.3IA     // Catch:{ 1db | 1kR -> 0x04ff }
            r30 = r14
            r31 = r8
            r32 = r7
            r33 = r1
            r35 = r24
            r36 = r20
            r37 = r21
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39)     // Catch:{ 1db | 1kR -> 0x04ff }
            java.util.concurrent.ThreadPoolExecutor r0 = X.AnonymousClass4Az.A02     // Catch:{ 1db | 1kR -> 0x04ff }
            r0.execute(r14)     // Catch:{ 1db | 1kR -> 0x04ff }
            goto L_0x03b5
        L_0x03af:
            r7.length()     // Catch:{ 1db | 1kR -> 0x04ff }
            r20.countDown()     // Catch:{ 1db | 1kR -> 0x04ff }
        L_0x03b5:
            int r10 = r10 + 1
            goto L_0x0348
        L_0x03b8:
            r11.getAbsolutePath()     // Catch:{ 1db | 1kR -> 0x04ff }
            r20.await()     // Catch:{ InterruptedException -> 0x03bf, 1db | 1kR -> 0x04ff }
            goto L_0x03c3
        L_0x03bf:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)     // Catch:{ 1db | 1kR -> 0x04ff }
        L_0x03c3:
            java.lang.Object r1 = r21.get()     // Catch:{ 1db | 1kR -> 0x04ff }
            X.1db r1 = (X.C31151db) r1     // Catch:{ 1db | 1kR -> 0x04ff }
            if (r1 == 0) goto L_0x03d6
            boolean r0 = r1 instanceof X.C71153iZ     // Catch:{ 1db | 1kR -> 0x04ff }
            if (r0 != 0) goto L_0x03e9
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ 1db | 1kR -> 0x04ff }
            r0.<init>(r1)     // Catch:{ 1db | 1kR -> 0x04ff }
            goto L_0x0479
        L_0x03d6:
            boolean r0 = r18.get()     // Catch:{ 1db | 1kR -> 0x04ff }
            if (r0 != 0) goto L_0x0301
        L_0x03dc:
            java.lang.String r0 = "gdrive/encrypted-re-upload/files failed to generate list of files to be uploaded."
            goto L_0x02c3
        L_0x03e0:
            java.lang.String r0 = "gdrive/encrypted-re-upload/files unable to start transaction"
            goto L_0x02c3
        L_0x03e4:
            X.3iZ r1 = new X.3iZ     // Catch:{ 1db | 1kR -> 0x04ff }
            r1.<init>()     // Catch:{ 1db | 1kR -> 0x04ff }
        L_0x03e9:
            throw r1     // Catch:{ 1db | 1kR -> 0x04ff }
        L_0x03ea:
            r23.A01()     // Catch:{ 1db | 1kR -> 0x04ff }
            boolean r0 = r6.A05()     // Catch:{ 1db | 1kR -> 0x04ff }
            if (r0 == 0) goto L_0x04f6
            int r14 = r34.size()     // Catch:{ 1db | 1kR -> 0x04ff }
            java.lang.String r0 = "gdrive/encrypted-re-upload/files/files-to-be-uploaded/count/"
            java.lang.String r0 = X.C13680ns.A0c(r14, r0)     // Catch:{ 1db | 1kR -> 0x04ff }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1db | 1kR -> 0x04ff }
            boolean r0 = r6.A05()     // Catch:{ 1db | 1kR -> 0x04ff }
            if (r0 == 0) goto L_0x04f6
            java.util.concurrent.atomic.AtomicLong r7 = r8.A0Q     // Catch:{ 1db | 1kR -> 0x04ff }
            r0 = 0
            r7.set(r0)     // Catch:{ 1db | 1kR -> 0x04ff }
            r0 = 1
            java.util.concurrent.atomic.AtomicBoolean r12 = new java.util.concurrent.atomic.AtomicBoolean     // Catch:{ 1db | 1kR -> 0x04ff }
            r12.<init>(r0)     // Catch:{ 1db | 1kR -> 0x04ff }
            r10 = 0
            java.util.concurrent.atomic.AtomicReference r7 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ 1db | 1kR -> 0x04ff }
            r7.<init>(r10)     // Catch:{ 1db | 1kR -> 0x04ff }
            java.util.concurrent.CountDownLatch r11 = new java.util.concurrent.CountDownLatch     // Catch:{ 1db | 1kR -> 0x04ff }
            r11.<init>(r14)     // Catch:{ 1db | 1kR -> 0x04ff }
            java.util.Iterator r16 = r34.iterator()     // Catch:{ 1db | 1kR -> 0x04ff }
        L_0x0422:
            boolean r0 = r16.hasNext()     // Catch:{ 1db | 1kR -> 0x04ff }
            if (r0 == 0) goto L_0x047a
            java.lang.Object r14 = r16.next()     // Catch:{ 1db | 1kR -> 0x04ff }
            X.39m r14 = (X.C615839m) r14     // Catch:{ 1db | 1kR -> 0x04ff }
            java.lang.String r1 = "<file>"
            java.io.File r0 = r14.A04     // Catch:{ 1db | 1kR -> 0x04ff }
            boolean r15 = r0.exists()     // Catch:{ 1db | 1kR -> 0x04ff }
            r37 = 1
            if (r15 != 0) goto L_0x0450
            java.lang.String r0 = "gdrive/encrypted-re-upload/backup-file file "
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0r(r0)     // Catch:{ 1db | 1kR -> 0x04ff }
            r14.append(r1)     // Catch:{ 1db | 1kR -> 0x04ff }
            java.lang.String r0 = " does not exist"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r14)     // Catch:{ 1db | 1kR -> 0x04ff }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1db | 1kR -> 0x04ff }
            r11.countDown()     // Catch:{ 1db | 1kR -> 0x04ff }
            goto L_0x0422
        L_0x0450:
            boolean r0 = r0.isDirectory()     // Catch:{ 1db | 1kR -> 0x04ff }
            if (r0 != 0) goto L_0x046f
            java.util.concurrent.Executor r1 = X.AnonymousClass2GK.A00     // Catch:{ 1db | 1kR -> 0x04ff }
            com.facebook.redex.RunnableRunnableShape1S0600000_I1 r0 = new com.facebook.redex.RunnableRunnableShape1S0600000_I1     // Catch:{ 1db | 1kR -> 0x04ff }
            r30 = r0
            r31 = r8
            r32 = r7
            r33 = r3
            r34 = r14
            r35 = r12
            r36 = r11
            r30.<init>(r31, r32, r33, r34, r35, r36, r37)     // Catch:{ 1db | 1kR -> 0x04ff }
            r1.execute(r0)     // Catch:{ 1db | 1kR -> 0x04ff }
            goto L_0x0422
        L_0x046f:
            java.lang.String r0 = "gdrive-service/backup-file/expected-file-got-directory-instead/"
            java.lang.String r0 = X.C13680ns.A0h(r0, r1)     // Catch:{ 1db | 1kR -> 0x04ff }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)     // Catch:{ 1db | 1kR -> 0x04ff }
        L_0x0479:
            throw r0     // Catch:{ 1db | 1kR -> 0x04ff }
        L_0x047a:
            java.lang.String r0 = "gdrive/encrypted-re-upload/files waiting for backup to finish..."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1db | 1kR -> 0x04ff }
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x048b, 1db | 1kR -> 0x04ff }
            boolean r7 = r11.await(r0, r7)     // Catch:{ InterruptedException -> 0x048b, 1db | 1kR -> 0x04ff }
            r11 = r7 & 1
            goto L_0x0492
        L_0x048b:
            r11 = move-exception
            java.lang.String r7 = "gdrive/encrypted-re-upload/files upload interrupted"
            com.whatsapp.util.Log.e(r7, r11)     // Catch:{ 1db | 1kR -> 0x04ff }
            r11 = 0
        L_0x0492:
            boolean r7 = r12.get()     // Catch:{ 1db | 1kR -> 0x04ff }
            r11 = r11 & r7
            if (r11 == 0) goto L_0x04c6
            int r12 = r24.size()     // Catch:{ 1db | 1kR -> 0x04ff }
            r15 = 0
        L_0x049e:
            if (r15 >= r12) goto L_0x04bd
            int r11 = r15 + 2500
            int r14 = java.lang.Math.min(r11, r12)     // Catch:{ 1db | 1kR -> 0x04ff }
            r7 = r24
            java.util.List r7 = r7.subList(r15, r14)     // Catch:{ 1db | 1kR -> 0x04ff }
            X.2xM r14 = new X.2xM     // Catch:{ 1db | 1kR -> 0x04ff }
            r14.<init>(r3, r9, r7)     // Catch:{ 1db | 1kR -> 0x04ff }
            r7 = r26
            java.lang.Object r14 = X.AnonymousClass2GS.A00(r14, r6, r7)     // Catch:{ 1db | 1kR -> 0x04ff }
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch:{ 1db | 1kR -> 0x04ff }
            if (r14 != r7) goto L_0x04be
            r15 = r11
            goto L_0x049e
        L_0x04bd:
            r2 = 1
        L_0x04be:
            if (r2 != 0) goto L_0x04c9
            java.lang.String r0 = "gdrive/encrypted-re-upload/files/failed to delete files"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 1db | 1kR -> 0x04ff }
            goto L_0x04e4
        L_0x04c6:
            java.lang.String r0 = "gdrive/encrypted-re-upload/files failed to uploadFiles"
            goto L_0x04f3
        L_0x04c9:
            X.0ug r2 = r8.A0G     // Catch:{ 1db | 1kR -> 0x04ff }
            r2.A07(r0)     // Catch:{ 1db | 1kR -> 0x04ff }
            X.2xO r1 = new X.2xO     // Catch:{ 1db | 1kR -> 0x04ff }
            r1.<init>(r3, r10)     // Catch:{ 1db | 1kR -> 0x04ff }
            r0 = r26
            java.lang.Object r1 = X.AnonymousClass2GS.A00(r1, r6, r0)     // Catch:{ 1db | 1kR -> 0x04ff }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ 1db | 1kR -> 0x04ff }
            r2 = 1
            if (r1 == r0) goto L_0x04e4
            r2 = 0
            java.lang.String r0 = "gdrive/encrypted-re-upload/files failed to commit backup"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1db | 1kR -> 0x04ff }
        L_0x04e4:
            java.lang.String r0 = "gdrive/encrypted-re-upload/files backup finished (success ="
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ 1db | 1kR -> 0x04ff }
            r1.append(r2)     // Catch:{ 1db | 1kR -> 0x04ff }
            java.lang.String r0 = ")"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ 1db | 1kR -> 0x04ff }
        L_0x04f3:
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1db | 1kR -> 0x04ff }
        L_0x04f6:
            r27 = r2
            goto L_0x0505
        L_0x04f9:
            java.lang.String r0 = "gdrive/encrypted-re-upload/fetch-token/network-failure-at-token-fetch-stage"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 1db | 1kR -> 0x04ff }
            goto L_0x0505
        L_0x04ff:
            r1 = move-exception
            r0 = r28
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x06e1 }
        L_0x0505:
            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x06e1 }
            X.0rz r6 = r8.A0C     // Catch:{ all -> 0x06e1 }
            java.lang.String r7 = r6.A0M()     // Catch:{ all -> 0x06e1 }
            boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch:{ all -> 0x06e1 }
            r0 = 0
            if (r2 != 0) goto L_0x0525
            android.content.SharedPreferences r3 = X.C13680ns.A0B(r6)     // Catch:{ all -> 0x06e1 }
            java.lang.String r2 = "gdrive_old_media_encryption_start_time:"
            java.lang.String r2 = X.C13680ns.A0h(r2, r7)     // Catch:{ all -> 0x06e1 }
            long r0 = r3.getLong(r2, r0)     // Catch:{ all -> 0x06e1 }
        L_0x0525:
            long r11 = r11 - r0
            X.3sX r10 = r8.A0F     // Catch:{ all -> 0x06e1 }
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r11 = r11 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x06e1 }
            r10.A08 = r0     // Catch:{ all -> 0x06e1 }
            r10.A05 = r0     // Catch:{ all -> 0x06e1 }
            if (r27 == 0) goto L_0x05cc
            java.lang.String r2 = r6.A0M()     // Catch:{ all -> 0x06e1 }
            java.util.concurrent.atomic.AtomicBoolean r0 = r8.A0K     // Catch:{ all -> 0x06e1 }
            boolean r1 = r0.get()     // Catch:{ all -> 0x06e1 }
            r0 = 2
            if (r1 == 0) goto L_0x0546
            if (r2 == 0) goto L_0x0546
            goto L_0x054f
        L_0x0546:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x06e1 }
            r10.A02 = r0     // Catch:{ all -> 0x06e1 }
            if (r2 == 0) goto L_0x05ae
            goto L_0x0558
        L_0x054f:
            r6.A0z(r2, r0)     // Catch:{ all -> 0x06e1 }
            java.lang.Integer r0 = X.C13680ns.A0Y()     // Catch:{ all -> 0x06e1 }
            r10.A02 = r0     // Catch:{ all -> 0x06e1 }
        L_0x0558:
            java.util.concurrent.atomic.AtomicLong r3 = r8.A0O     // Catch:{ all -> 0x06e1 }
            long r6 = r3.get()     // Catch:{ all -> 0x06e1 }
            java.util.concurrent.atomic.AtomicLong r2 = r8.A0N     // Catch:{ all -> 0x06e1 }
            long r0 = r2.get()     // Catch:{ all -> 0x06e1 }
            long r6 = r6 + r0
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x06e1 }
            r10.A04 = r0     // Catch:{ all -> 0x06e1 }
            long r0 = r3.get()     // Catch:{ all -> 0x06e1 }
            long r2 = r2.get()     // Catch:{ all -> 0x06e1 }
            long r0 = r0 + r2
            double r6 = (double) r0     // Catch:{ all -> 0x06e1 }
            java.util.concurrent.atomic.AtomicLong r0 = r8.A0P     // Catch:{ all -> 0x06e1 }
            long r2 = r0.get()     // Catch:{ all -> 0x06e1 }
            double r0 = (double) r2     // Catch:{ all -> 0x06e1 }
            double r6 = r6 / r0
            java.lang.Double r0 = java.lang.Double.valueOf(r6)     // Catch:{ all -> 0x06e1 }
            r10.A00 = r0     // Catch:{ all -> 0x06e1 }
            r10.A01 = r0     // Catch:{ all -> 0x06e1 }
            java.lang.Long r0 = r10.A04     // Catch:{ all -> 0x06e1 }
            r10.A06 = r0     // Catch:{ all -> 0x06e1 }
            java.util.concurrent.atomic.AtomicLong r0 = r8.A0M     // Catch:{ all -> 0x06e1 }
            long r2 = r0.get()     // Catch:{ all -> 0x06e1 }
            java.util.concurrent.atomic.AtomicLong r0 = r8.A0Q     // Catch:{ all -> 0x06e1 }
            long r0 = r0.get()     // Catch:{ all -> 0x06e1 }
            long r2 = r2 + r0
            r0 = 1048576(0x100000, double:5.180654E-318)
            long r2 = r2 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x06e1 }
            r10.A07 = r0     // Catch:{ all -> 0x06e1 }
            java.lang.String r0 = "gdrive/encrypted-re-upload/"
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r10)     // Catch:{ all -> 0x06e1 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x06e1 }
            X.0t9 r0 = r8.A0E     // Catch:{ all -> 0x06e1 }
            r0.A06(r10)     // Catch:{ all -> 0x06e1 }
        L_0x05ae:
            X.12T r1 = r8.A04     // Catch:{ all -> 0x06e1 }
            java.lang.String r0 = r9.A0F     // Catch:{ all -> 0x06e1 }
            r1.A01(r0)     // Catch:{ all -> 0x06e1 }
            X.AnonymousClass2GS.A02()     // Catch:{ all -> 0x06e1 }
            java.util.Iterator r1 = X.C16590tJ.A00(r41)     // Catch:{ all -> 0x06e1 }
        L_0x05bc:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x06e1 }
            if (r0 == 0) goto L_0x05ef
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x06e1 }
            X.12R r0 = (X.AnonymousClass12R) r0     // Catch:{ all -> 0x06e1 }
            r0.AQL()     // Catch:{ all -> 0x06e1 }
            goto L_0x05bc
        L_0x05cc:
            X.AnonymousClass2GS.A02()     // Catch:{ all -> 0x06e1 }
            X.2GJ r0 = r8.A05     // Catch:{ all -> 0x06e1 }
            boolean r0 = r0.A04()     // Catch:{ all -> 0x06e1 }
            if (r0 != 0) goto L_0x05dd
            java.lang.String r0 = "gdrive/encrypted-re-upload/wasn't successful because the needed resources are not available"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x06e1 }
            goto L_0x05ef
        L_0x05dd:
            boolean r0 = r9.A0B()     // Catch:{ all -> 0x06e1 }
            if (r0 != 0) goto L_0x05ef
            java.lang.Integer r0 = java.lang.Integer.valueOf(r29)     // Catch:{ all -> 0x06e1 }
            r10.A02 = r0     // Catch:{ all -> 0x06e1 }
            r8.A00()     // Catch:{ all -> 0x06e1 }
            goto L_0x05ef
        L_0x05ed:
            r27 = 0
        L_0x05ef:
            if (r27 == 0) goto L_0x05f3
            goto L_0x0685
        L_0x05f3:
            X.3iK r1 = r4.A09     // Catch:{ all -> 0x06e1 }
            boolean r0 = r1.A04()     // Catch:{ all -> 0x06e1 }
            if (r0 != 0) goto L_0x067f
            r2 = 6
            if (r13 >= r2) goto L_0x065e
            boolean r0 = r1.A02()     // Catch:{ all -> 0x06e1 }
            if (r0 != 0) goto L_0x0607
            r2 = 9
            goto L_0x0655
        L_0x0607:
            boolean r0 = r1.A01()     // Catch:{ all -> 0x06e1 }
            if (r0 != 0) goto L_0x061a
            r0 = r65
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0h     // Catch:{ all -> 0x06e1 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x06e1 }
            r2 = 4
            if (r0 != 0) goto L_0x0655
            r2 = 5
            goto L_0x0655
        L_0x061a:
            boolean r0 = r1.A03()     // Catch:{ all -> 0x06e1 }
            if (r0 != 0) goto L_0x0623
            r2 = 8
            goto L_0x0655
        L_0x0623:
            boolean r0 = r1.A00()     // Catch:{ all -> 0x06e1 }
            if (r0 == 0) goto L_0x0655
            X.0so r3 = r4.A02     // Catch:{ all -> 0x06e1 }
            r2 = 0
            r1 = 1
            java.lang.String r0 = "google-encrypted-re-upload-worker/unknown condition was not met"
            r3.AcB(r0, r2, r1)     // Catch:{ all -> 0x06e1 }
        L_0x0632:
            java.lang.String r0 = "google-encrypted-re-upload-worker/doWork conditions were not met(result code = "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x06e1 }
            r0 = r46
            java.lang.Integer r0 = r0.A02     // Catch:{ all -> 0x06e1 }
            r1.append(r0)     // Catch:{ all -> 0x06e1 }
            java.lang.String r0 = "), retrying backup later"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x06e1 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x06e1 }
            X.390 r0 = r4.A00     // Catch:{ all -> 0x06e1 }
            if (r0 == 0) goto L_0x064f
            r0.A00()     // Catch:{ all -> 0x06e1 }
        L_0x064f:
            X.02P r3 = new X.02P     // Catch:{ all -> 0x06e1 }
            r3.<init>()     // Catch:{ all -> 0x06e1 }
            goto L_0x0689
        L_0x0655:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x06e1 }
            r0 = r46
            r0.A02 = r1     // Catch:{ all -> 0x06e1 }
            goto L_0x0632
        L_0x065e:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r25)     // Catch:{ all -> 0x06e1 }
            r0 = r46
            r0.A02 = r1     // Catch:{ all -> 0x06e1 }
            java.lang.String r0 = "google-encrypted-re-upload-worker/doWork worker reached the maximum amount of retries("
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ all -> 0x06e1 }
            r1.append(r2)     // Catch:{ all -> 0x06e1 }
            java.lang.String r0 = "), failing"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x06e1 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x06e1 }
            X.390 r0 = r4.A00     // Catch:{ all -> 0x06e1 }
            if (r0 == 0) goto L_0x067f
            r0.A00()     // Catch:{ all -> 0x06e1 }
        L_0x067f:
            X.0Gc r3 = new X.0Gc     // Catch:{ all -> 0x06e1 }
            r3.<init>()     // Catch:{ all -> 0x06e1 }
            goto L_0x0689
        L_0x0685:
            X.02Q r3 = X.AnonymousClass02Q.A00()     // Catch:{ all -> 0x06e1 }
        L_0x0689:
            X.02P r0 = new X.02P     // Catch:{ all -> 0x06e1 }
            r0.<init>()     // Catch:{ all -> 0x06e1 }
            boolean r0 = r3.equals(r0)     // Catch:{ all -> 0x06e1 }
            if (r0 != 0) goto L_0x06b6
            boolean r0 = r66.A1f()     // Catch:{ all -> 0x06e1 }
            r2 = 1
            if (r0 == 0) goto L_0x06b6
            boolean r0 = android.text.TextUtils.isEmpty(r19)     // Catch:{ all -> 0x06e1 }
            if (r0 != 0) goto L_0x06b6
            r1 = r66
            r0 = r19
            int r0 = r1.A0F(r0)     // Catch:{ all -> 0x06e1 }
            if (r0 != r2) goto L_0x06b6
            X.12P r6 = r4.A0S     // Catch:{ all -> 0x06e1 }
            java.util.Random r2 = r4.A0U     // Catch:{ all -> 0x06e1 }
            X.03z r1 = X.AnonymousClass03z.APPEND_OR_REPLACE     // Catch:{ all -> 0x06e1 }
            r0 = r43
            A01(r1, r0, r6, r2, r5)     // Catch:{ all -> 0x06e1 }
        L_0x06b6:
            r1 = 7
            r0 = r67
            r0.A00(r1, r5)
            r65.A06()
            goto L_0x06d4
        L_0x06c0:
            r0 = 3
            X.02Q r3 = r4.A05(r13, r0)     // Catch:{ all -> 0x06e1 }
        L_0x06c5:
            r1 = 7
            r0 = r67
            r0.A00(r1, r5)
            X.0yo r0 = r4.A07
            r0.A06()
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0d
            r64 = r0
        L_0x06d4:
            r0 = r64
            r0.getAndSet(r5)
            X.0yL r2 = r4.A0H
            r1 = 5
            r0 = 0
            r2.A03(r1, r0)
            return r3
        L_0x06e1:
            r3 = move-exception
            X.0xj r1 = r4.A0B
            r0 = 7
            r1.A00(r0, r5)
            X.0yo r0 = r4.A07
            r0.A06()
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.A0d
            r0.getAndSet(r5)
            X.0yL r2 = r4.A0H
            r1 = 5
            r0 = 0
            r2.A03(r1, r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.backup.google.workers.GoogleEncryptedReUploadWorker.A04():X.02Q");
    }

    public final AnonymousClass02Q A05(int i2, int i3) {
        C15860rz r3 = this.A0J;
        String A0M2 = r3.A0M();
        if (!TextUtils.isEmpty(A0M2)) {
            long currentTimeMillis = System.currentTimeMillis();
            long j2 = TextUtils.isEmpty(A0M2) ? 0 : C13680ns.A0B(r3).getLong(C13680ns.A0h("gdrive_old_media_encryption_start_time:", A0M2), 0);
            C75673sX r2 = this.A0M;
            Long valueOf = Long.valueOf((currentTimeMillis - j2) / 3600000);
            r2.A08 = valueOf;
            r2.A05 = valueOf;
        }
        C75673sX r1 = this.A0M;
        if (i2 < 6) {
            r1.A02 = Integer.valueOf(i3);
            this.A0L.A06(r1);
            return new AnonymousClass02P();
        }
        r1.A02 = 7;
        this.A0L.A06(r1);
        return new C02890Gc();
    }
}
