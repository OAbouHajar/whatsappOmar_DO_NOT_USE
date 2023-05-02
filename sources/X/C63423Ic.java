package X;

import android.os.SystemClock;
import com.whatsapp.util.Log;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3Ic  reason: invalid class name and case insensitive filesystem */
public class C63423Ic implements Callable, C109435Sc, AnonymousClass2A2 {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public final C17130ua A04;
    public final C14710pd A05;
    public final C20330zs A06;
    public final C30741cs A07;
    public final AnonymousClass4ID A08;
    public final C38321qb A09;
    public final C19040xf A0A;
    public final CountDownLatch A0B = new CountDownLatch(1);
    public final FutureTask A0C = new FutureTask(this);

    public C63423Ic(C17130ua r3, C14710pd r4, C20330zs r5, C30741cs r6, AnonymousClass4ID r7, C38321qb r8, C19040xf r9) {
        this.A05 = r4;
        this.A04 = r3;
        this.A0A = r9;
        this.A06 = r5;
        this.A08 = r7;
        this.A09 = r8;
        this.A07 = r6;
    }

    public final void A00() {
        if (this.A0C.isCancelled()) {
            throw new CancellationException("plaindownload/cancelled");
        }
    }

    public void A63() {
        try {
            cancel();
            this.A0B.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            Log.e("PlainDownloadTransfer/waitCancelFinish Cannot fully cancel after 3 seconds");
        }
    }

    public AnonymousClass258 A8D() {
        try {
            FutureTask futureTask = this.A0C;
            futureTask.run();
            AnonymousClass258 r1 = (AnonymousClass258) futureTask.get();
            this.A0B.countDown();
            return r1;
        } catch (InterruptedException | CancellationException | ExecutionException e2) {
            Log.e("plaindownload/exception ", e2);
            this.A0B.countDown();
            return new AnonymousClass258(new C31701et(13));
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x014b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:58:0x0150 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:63:0x0155 */
    /* JADX WARNING: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01e0  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:47:0x0140=Splitter:B:47:0x0140, B:63:0x0155=Splitter:B:63:0x0155} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C90774em Acg(X.C29561ap r21) {
        /*
            r20 = this;
            java.lang.String r8 = "plaindownload/download fail: "
            r7 = r20
            java.util.concurrent.FutureTask r0 = r7.A0C
            boolean r0 = r0.isCancelled()
            if (r0 == 0) goto L_0x0017
            r0 = 13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.4em r9 = X.C90774em.A01(r0)
        L_0x0016:
            return r9
        L_0x0017:
            X.4ID r1 = r7.A08     // Catch:{ MalformedURLException -> 0x0218 }
            X.1qF r0 = r1.A01     // Catch:{ MalformedURLException -> 0x0218 }
            r6 = 1
            r14 = r21
            java.lang.String r0 = r0.A9R(r14, r6)     // Catch:{ MalformedURLException -> 0x0218 }
            java.net.URL r15 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0218 }
            r15.<init>(r0)     // Catch:{ MalformedURLException -> 0x0218 }
            X.1cs r4 = r7.A07
            r12 = 0
            if (r4 == 0) goto L_0x0046
            r4.A0U = r15
            int r0 = r14.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A0D = r0
            java.lang.String r0 = r14.A04
            r4.A0Q = r0
            java.lang.Integer r0 = X.C13680ns.A0Z()
            r4.A0C = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            r4.A0A = r0
        L_0x0046:
            r0 = 7
            android.net.TrafficStats.setThreadStatsTag(r0)
            X.5Sd r5 = r1.A00
            r5.AhW()
            long r0 = r5.AE2()
            X.0zs r13 = r7.A06     // Catch:{ 1q9 -> 0x01a7, 1qB | IOException -> 0x018b, 43j -> 0x0168, Exception -> 0x0156 }
            r18 = -1
            r16 = r0
            X.1pl r9 = r13.A00(r14, r15, r16, r18)     // Catch:{ 1q9 -> 0x01a7, 1qB | IOException -> 0x018b, 43j -> 0x0168, Exception -> 0x0156 }
            if (r4 == 0) goto L_0x007d
            r4.A05()     // Catch:{ all -> 0x0151 }
            r2 = r9
            X.1pk r2 = (X.C37791pk) r2     // Catch:{ all -> 0x0151 }
            java.lang.Boolean r2 = r2.A00     // Catch:{ all -> 0x0151 }
            r4.A09 = r2     // Catch:{ all -> 0x0151 }
            int r2 = r9.A6O()     // Catch:{ all -> 0x0151 }
            java.lang.Long r2 = X.C13690nt.A0W(r2)     // Catch:{ all -> 0x0151 }
            r4.A0M = r2     // Catch:{ all -> 0x0151 }
            long r2 = r9.getContentLength()     // Catch:{ all -> 0x0151 }
            java.lang.Long r2 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x0151 }
            r4.A0K = r2     // Catch:{ all -> 0x0151 }
        L_0x007d:
            int r3 = r9.A6O()     // Catch:{ all -> 0x0151 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r3 == r2) goto L_0x00fe
            int r3 = r9.A6O()     // Catch:{ all -> 0x0151 }
            r2 = 206(0xce, float:2.89E-43)
            if (r3 == r2) goto L_0x00fe
            int r3 = r9.A6O()     // Catch:{ all -> 0x0151 }
            r2 = 416(0x1a0, float:5.83E-43)
            if (r3 != r2) goto L_0x00c6
            java.lang.String r2 = "Content-Range"
            java.lang.String r3 = r9.AHk(r2)     // Catch:{ all -> 0x0151 }
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0151 }
            if (r2 != 0) goto L_0x00c6
            java.lang.String r2 = "*/"
            boolean r2 = r3.contains(r2)     // Catch:{ all -> 0x0151 }
            if (r2 == 0) goto L_0x00c6
            r2 = 47
            int r2 = r3.lastIndexOf(r2)     // Catch:{ all -> 0x0151 }
            int r2 = r2 + 1
            java.lang.String r2 = r3.substring(r2)     // Catch:{ all -> 0x0151 }
            long r10 = java.lang.Long.parseLong(r2)     // Catch:{ all -> 0x0151 }
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x00c6
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x0151 }
            X.4em r1 = X.C90774em.A02(r0)     // Catch:{ all -> 0x0151 }
            goto L_0x0140
        L_0x00c6:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0151 }
            java.lang.String r0 = "plaindownload/http connection error/code: "
            r1.append(r0)     // Catch:{ all -> 0x0151 }
            int r0 = r9.A6O()     // Catch:{ all -> 0x0151 }
            java.lang.String r0 = X.AnonymousClass000.A0l(r1, r0)     // Catch:{ all -> 0x0151 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0151 }
            int r1 = r9.A6O()     // Catch:{ all -> 0x0151 }
            r0 = 507(0x1fb, float:7.1E-43)
            if (r1 == r0) goto L_0x00ef
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0151 }
            int r0 = r9.A6O()     // Catch:{ all -> 0x0151 }
            X.4em r1 = X.C90774em.A04(r1, r0, r12)     // Catch:{ all -> 0x0151 }
            goto L_0x0140
        L_0x00ef:
            r0 = 12
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0151 }
            int r0 = r9.A6O()     // Catch:{ all -> 0x0151 }
            X.4em r1 = X.C90774em.A04(r1, r0, r12)     // Catch:{ all -> 0x0151 }
            goto L_0x0140
        L_0x00fe:
            long r2 = r9.getContentLength()     // Catch:{ all -> 0x0151 }
            long r2 = r2 + r0
            r7.A02 = r2     // Catch:{ all -> 0x0151 }
            if (r4 == 0) goto L_0x010c
            r2 = 0
            r4.A0A(r0, r2)     // Catch:{ all -> 0x0151 }
        L_0x010c:
            java.io.OutputStream r3 = r5.Aa6(r9)     // Catch:{ all -> 0x0151 }
            X.0ua r0 = r7.A04     // Catch:{ all -> 0x014c }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x014c }
            java.io.InputStream r5 = r9.A9k(r0, r10, r10)     // Catch:{ all -> 0x014c }
            r0 = 8
            com.facebook.redex.IDxNConsumerShape154S0100000_2_I1 r2 = new com.facebook.redex.IDxNConsumerShape154S0100000_2_I1     // Catch:{ all -> 0x0145 }
            r2.<init>(r7, r0)     // Catch:{ all -> 0x0145 }
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = new byte[r0]     // Catch:{ all -> 0x0145 }
        L_0x0125:
            int r0 = r5.read(r1)     // Catch:{ all -> 0x0145 }
            if (r0 < 0) goto L_0x0136
            r3.write(r1, r12, r0)     // Catch:{ all -> 0x0145 }
            java.lang.Long r0 = X.C13690nt.A0W(r0)     // Catch:{ all -> 0x0145 }
            r2.accept(r0)     // Catch:{ all -> 0x0145 }
            goto L_0x0125
        L_0x0136:
            r5.close()     // Catch:{ all -> 0x014c }
            r3.close()     // Catch:{ all -> 0x0151 }
            X.4em r1 = X.C90774em.A02(r10)     // Catch:{ all -> 0x0151 }
        L_0x0140:
            r9.close()     // Catch:{ 1q9 -> 0x01a7, 1qB | IOException -> 0x018b, 43j -> 0x0168, Exception -> 0x0156 }
            goto L_0x01ef
        L_0x0145:
            r0 = move-exception
            if (r5 == 0) goto L_0x014b
            r5.close()     // Catch:{ all -> 0x014b }
        L_0x014b:
            throw r0     // Catch:{ all -> 0x014c }
        L_0x014c:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x0150 }
        L_0x0150:
            throw r0     // Catch:{ all -> 0x0151 }
        L_0x0151:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x0155 }
        L_0x0155:
            throw r0     // Catch:{ 1q9 -> 0x01a7, 1qB | IOException -> 0x018b, 43j -> 0x0168, Exception -> 0x0156 }
        L_0x0156:
            r0 = move-exception
            if (r4 == 0) goto L_0x015c
            X.C29551ao.A01(r4, r0, r15)     // Catch:{ all -> 0x0203 }
        L_0x015c:
            com.whatsapp.util.Log.e(r8, r0)     // Catch:{ all -> 0x0203 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0203 }
            X.4em r9 = X.C90774em.A01(r0)     // Catch:{ all -> 0x0203 }
            goto L_0x01db
        L_0x0168:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r8)     // Catch:{ all -> 0x0203 }
            r1.append(r2)     // Catch:{ all -> 0x0203 }
            java.lang.String r0 = ", url: "
            java.lang.String r0 = X.AnonymousClass000.A0e(r15, r0, r1)     // Catch:{ all -> 0x0203 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0203 }
            int r0 = r2.downloadStatus     // Catch:{ all -> 0x0203 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0203 }
            boolean r14 = X.C31701et.A01(r0)     // Catch:{ all -> 0x0203 }
            r11 = -1
            r13 = 0
            X.4em r9 = new X.4em     // Catch:{ all -> 0x0203 }
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ all -> 0x0203 }
            goto L_0x01db
        L_0x018b:
            r2 = move-exception
            if (r4 == 0) goto L_0x019e
            X.C29551ao.A01(r4, r2, r15)     // Catch:{ all -> 0x0203 }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0203 }
            java.lang.String r0 = "plaindownload/error downloading from mms, url: "
            java.lang.String r0 = X.AnonymousClass000.A0e(r15, r0, r1)     // Catch:{ all -> 0x0203 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0203 }
        L_0x019e:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x0203 }
            X.4em r9 = X.C90774em.A00(r0)     // Catch:{ all -> 0x0203 }
            goto L_0x01db
        L_0x01a7:
            r2 = move-exception
            if (r4 == 0) goto L_0x01b8
            r4.A05()     // Catch:{ all -> 0x0203 }
            X.C29551ao.A01(r4, r2, r15)     // Catch:{ all -> 0x0203 }
            int r0 = r2.responseCode     // Catch:{ all -> 0x0203 }
            java.lang.Long r0 = X.C13690nt.A0W(r0)     // Catch:{ all -> 0x0203 }
            r4.A0M = r0     // Catch:{ all -> 0x0203 }
        L_0x01b8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0203 }
            java.lang.String r0 = "plaindownload/http error "
            r1.append(r0)     // Catch:{ all -> 0x0203 }
            int r0 = r2.responseCode     // Catch:{ all -> 0x0203 }
            r1.append(r0)     // Catch:{ all -> 0x0203 }
            java.lang.String r0 = " downloading from mms, url: "
            java.lang.String r0 = X.AnonymousClass000.A0e(r15, r0, r1)     // Catch:{ all -> 0x0203 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0203 }
            int r0 = r2.downloadStatus     // Catch:{ all -> 0x0203 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0203 }
            int r0 = r2.responseCode     // Catch:{ all -> 0x0203 }
            X.4em r9 = X.C90774em.A03(r1, r0)     // Catch:{ all -> 0x0203 }
        L_0x01db:
            android.net.TrafficStats.clearThreadStatsTag()
            if (r4 == 0) goto L_0x0016
            java.lang.Long r0 = r4.A0E
            if (r0 != 0) goto L_0x01e7
            r4.A05()
        L_0x01e7:
            java.lang.Long r0 = r4.A0L
            if (r0 != 0) goto L_0x0016
            r4.A09()
            return r9
        L_0x01ef:
            android.net.TrafficStats.clearThreadStatsTag()
            if (r4 == 0) goto L_0x0202
            java.lang.Long r0 = r4.A0E
            if (r0 != 0) goto L_0x01fb
            r4.A05()
        L_0x01fb:
            java.lang.Long r0 = r4.A0L
            if (r0 != 0) goto L_0x0202
            r4.A09()
        L_0x0202:
            return r1
        L_0x0203:
            r1 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            if (r4 == 0) goto L_0x0217
            java.lang.Long r0 = r4.A0E
            if (r0 != 0) goto L_0x0210
            r4.A05()
        L_0x0210:
            java.lang.Long r0 = r4.A0L
            if (r0 != 0) goto L_0x0217
            r4.A09()
        L_0x0217:
            throw r1
        L_0x0218:
            r0 = 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.4em r0 = X.C90774em.A01(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63423Ic.Acg(X.1ap):X.4em");
    }

    public /* bridge */ /* synthetic */ Object call() {
        C30741cs r7 = this.A07;
        if (r7 != null) {
            r7.A0H = Long.valueOf(SystemClock.elapsedRealtime());
            r7.A02 = 0;
            int i2 = 0;
            if (this.A06.A01.A01()) {
                i2 = 4;
            }
            r7.A01 = i2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C19040xf r6 = this.A0A;
        r6.A08();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        AnonymousClass4ID r3 = this.A08;
        long AE2 = r3.A00.AE2();
        this.A01 = AE2;
        this.A03 = AE2;
        if (r7 != null) {
            r7.A0O = Long.valueOf(elapsedRealtime2 - elapsedRealtime);
            r7.A0G = Long.valueOf(AE2);
        }
        A00();
        C38141qJ A042 = r6.A04(r3.A01, 2);
        A00();
        Number number = (Number) A042.A00(this);
        if (r7 != null) {
            r7.A0N = C13690nt.A0W(A042.A01.get());
        }
        A00();
        C31701et r2 = new C31701et(number != null ? number.intValue() : 11);
        A00();
        if (r7 != null) {
            r7.A08 = r2;
            r7.A0F = Long.valueOf(SystemClock.elapsedRealtime());
            r7.A02 = 4;
        }
        AnonymousClass258 r62 = new AnonymousClass258(r2);
        if (r7 != null) {
            C31701et r5 = r62.A00;
            C52612e9 r4 = new C52612e9();
            C31701et r0 = r7.A08;
            int A012 = C42141xI.A01(r0 == null ? -1 : r0.A01);
            r4.A0A = r7.A0D;
            if (!(A012 == 1 || A012 == 15)) {
                r4.A0X = r7.A0R;
                r4.A0Y = r7.A0T;
                r4.A0Z = C13690nt.A0d(r7.A0U);
            }
            r4.A06 = Double.valueOf((double) r7.A03());
            r4.A0I = Long.valueOf(r7.A00());
            r4.A0J = r7.A0M;
            r4.A00 = r7.A09;
            r4.A01 = Boolean.FALSE;
            r4.A0K = Long.valueOf(r7.A01());
            r4.A0C = Integer.valueOf(r7.A01);
            r4.A0V = r7.A0N;
            r4.A0D = r7.A0C;
            Long l2 = r7.A0O;
            if (l2 != null) {
                r4.A0Q = l2;
            }
            r4.A0a = r7.A0Q;
            r4.A0R = r7.A04();
            URL url = r7.A0U;
            r4.A0b = url == null ? null : url.getHost();
            r4.A0G = Integer.valueOf(A012);
            r4.A04 = r7.A0A;
            Long l3 = r7.A0K;
            r4.A09 = Double.valueOf(Long.valueOf(l3 == null ? r7.A03() : l3.longValue()).doubleValue());
            Long l4 = r7.A0H;
            r4.A0U = l4 == null ? null : Long.valueOf(l4.longValue() - r7.A0X);
            r4.A0W = r7.A04();
            Long l5 = r7.A0G;
            r4.A0L = Long.valueOf(l5 != null ? l5.longValue() : 0);
            Long l6 = r7.A0H;
            long j2 = 0;
            if (l6 != null) {
                Long l7 = r7.A0P;
                if (l7 != null) {
                    j2 = l7.longValue();
                } else if (r7.A0F == null) {
                    j2 = SystemClock.elapsedRealtime() - l6.longValue();
                }
            }
            r4.A0M = Long.valueOf(j2);
            Float f2 = r7.A0B;
            if (f2 != null) {
                float floatValue = f2.floatValue();
                if (Math.abs(-1.0f - floatValue) > Float.MIN_VALUE) {
                    r4.A07 = Double.valueOf((double) floatValue);
                }
            }
            r4.A0S = r7.A0J;
            r4.A02 = Boolean.valueOf(r7.A0V);
            r4.A08 = Double.valueOf((double) r7.A05);
            r4.A0N = Long.valueOf(r7.A06);
            r5.A00 = r4;
        }
        return r62;
    }

    public void cancel() {
        this.A0C.cancel(true);
    }
}
