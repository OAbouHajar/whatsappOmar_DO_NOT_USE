package X;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.facebook.redex.RunnableRunnableShape1S0100100_I1;
import com.facebook.redex.RunnableRunnableShape7S0200000_I0_5;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Collections;
import java.util.Map;

/* renamed from: X.2Od  reason: invalid class name and case insensitive filesystem */
public class C48602Od implements C48612Oe, C48632Og {
    public long A00;
    public long A01;
    public long A02;
    public RandomAccessFile A03;
    public boolean A04;
    public final Handler A05 = new Handler(Looper.getMainLooper());
    public final C16080sP A06;
    public final C16980tz A07;
    public final C14730pf A08;
    public final C216114t A09;
    public final C38731rK A0A;
    public final C48642Oh A0B;
    public final C48652Oi A0C;

    public C48602Od(C16080sP r3, C16980tz r4, C14730pf r5, C216114t r6, C38731rK r7, C48642Oh r8, C48652Oi r9) {
        this.A07 = r4;
        this.A08 = r5;
        this.A06 = r3;
        this.A09 = r6;
        this.A0A = r7;
        this.A0B = r8;
        this.A0C = r9;
    }

    public void A4k(AnonymousClass5LZ r1) {
    }

    public /* synthetic */ Map AFZ() {
        return Collections.emptyMap();
    }

    public Uri AGo() {
        return Uri.fromFile(this.A0B.A02());
    }

    public void ANs(C48642Oh r1, long j2) {
    }

    public void AQ5(int i2) {
    }

    public void AQ6(C48642Oh r4) {
        this.A05.post(new RunnableRunnableShape7S0200000_I0_5(this, 21, r4));
    }

    public void ARH(C48642Oh r6) {
        RandomAccessFile randomAccessFile;
        File A022 = this.A0B.A02();
        if (this.A04 && (randomAccessFile = this.A03) != null) {
            try {
                long filePointer = randomAccessFile.getFilePointer();
                try {
                    this.A03.close();
                    this.A03 = null;
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(A022, "r");
                    this.A03 = randomAccessFile2;
                    randomAccessFile2.seek(filePointer);
                } catch (IOException e2) {
                    Log.e((Throwable) e2);
                    this.A03 = null;
                } catch (Throwable th) {
                    this.A03 = null;
                    throw th;
                }
            } catch (IOException e3) {
                Log.e((Throwable) e3);
                Log.e("WhatsappChunkAwareDataSource/hotswap failed");
            }
        }
    }

    public void AWF() {
    }

    public long AZr(AnonymousClass3AL r10) {
        this.A00 = 0;
        long j2 = r10.A03;
        this.A02 = j2;
        C48642Oh r8 = this.A0B;
        synchronized (r8) {
            r8.A0F.add(this);
        }
        AnonymousClass4L7 r1 = r8.A0E;
        long j3 = this.A02;
        Handler handler = r1.A02;
        handler.removeCallbacks(r1.A01);
        RunnableRunnableShape1S0100100_I1 runnableRunnableShape1S0100100_I1 = new RunnableRunnableShape1S0100100_I1(r1, j3, 6);
        r1.A01 = runnableRunnableShape1S0100100_I1;
        handler.postDelayed(runnableRunnableShape1S0100100_I1, 200);
        long A012 = r8.A01() - j2;
        this.A01 = A012;
        return A012;
    }

    public void close() {
        RandomAccessFile randomAccessFile = this.A03;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
                this.A03 = null;
                if (this.A04) {
                    this.A04 = false;
                }
            } catch (IOException e2) {
                throw new AnonymousClass40I(e2);
            } catch (Throwable th) {
                this.A03 = null;
                if (this.A04) {
                    this.A04 = false;
                }
                throw th;
            }
        }
        C48642Oh r1 = this.A0B;
        synchronized (r1) {
            r1.A0F.remove(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009d, code lost:
        if (r0 == -1) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a9, code lost:
        if (r0 == 0) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ab, code lost:
        r4 = r11.A03.read(r12, r13, (int) java.lang.Math.min((long) r6, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b7, code lost:
        if (r4 != -1) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00bf, code lost:
        if (r11.A01 == r11.A00) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c6, code lost:
        throw new java.io.EOFException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00c7, code lost:
        r11.A00 += (long) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00cd, code lost:
        return r4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int read(byte[] r12, int r13, int r14) {
        /*
            r11 = this;
            X.2Oh r4 = r11.A0B
            int r0 = r4.A00()
            r10 = 0
            if (r0 == 0) goto L_0x00d8
            int r1 = r4.A00()
            r0 = 2
            if (r1 == r0) goto L_0x00d8
            java.io.File r0 = r4.A02()
            r1 = 0
            if (r0 == 0) goto L_0x0018
            r1 = 1
        L_0x0018:
            java.lang.String r0 = "downloadFile is null"
            X.AnonymousClass00B.A0B(r0, r1)
            boolean r0 = r11.A04
            if (r0 != 0) goto L_0x003e
            java.io.File r1 = r4.A02()     // Catch:{ IOException -> 0x0034 }
            java.lang.String r0 = "r"
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0034 }
            r2.<init>(r1, r0)     // Catch:{ IOException -> 0x0034 }
            r11.A03 = r2     // Catch:{ IOException -> 0x0034 }
            long r0 = r11.A02     // Catch:{ IOException -> 0x0034 }
            r2.seek(r0)     // Catch:{ IOException -> 0x0034 }
            goto L_0x003b
        L_0x0034:
            r0 = move-exception
            X.40I r1 = new X.40I
            r1.<init>(r0)
            throw r1
        L_0x003b:
            r0 = 1
            r11.A04 = r0
        L_0x003e:
            long r5 = (long) r14
            long r2 = r11.A01
            long r0 = r11.A00
            long r2 = r2 - r0
            long r0 = java.lang.Math.min(r5, r2)
            int r6 = (int) r0
            r5 = -1
            if (r6 == 0) goto L_0x00d7
            java.io.RandomAccessFile r0 = r11.A03
            X.AnonymousClass00B.A06(r0)
            long r0 = r0.getFilePointer()
            boolean r0 = r4.A09(r0)
            if (r0 == 0) goto L_0x00d8
            java.io.RandomAccessFile r0 = r11.A03
            long r2 = r0.getFilePointer()
            monitor-enter(r4)
            int r1 = r4.A01     // Catch:{ all -> 0x00d4 }
            r0 = 3
            if (r1 != r0) goto L_0x006a
            long r0 = r4.A04     // Catch:{ all -> 0x00d4 }
            goto L_0x00a3
        L_0x006a:
            boolean r0 = r4.A09(r2)     // Catch:{ all -> 0x00d4 }
            if (r0 != 0) goto L_0x0072
            monitor-exit(r4)
            return r10
        L_0x0072:
            long r7 = r4.A01()     // Catch:{ all -> 0x00d4 }
            int r0 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r0 > 0) goto L_0x00ce
            X.39u r8 = r4.A07     // Catch:{ all -> 0x00d4 }
            long r0 = r8.A01     // Catch:{ all -> 0x00d4 }
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 >= 0) goto L_0x009f
            int r7 = r8.A01(r2)     // Catch:{ all -> 0x00d4 }
        L_0x0086:
            int r1 = r8.A00     // Catch:{ all -> 0x00d4 }
            if (r7 >= r1) goto L_0x0093
            boolean r0 = r8.A08(r7)     // Catch:{ all -> 0x00d4 }
            if (r0 == 0) goto L_0x0093
            int r7 = r7 + 1
            goto L_0x0086
        L_0x0093:
            if (r7 == r1) goto L_0x009f
            long r0 = r8.A03(r7)     // Catch:{ all -> 0x00d4 }
            r8 = -1
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x00a3
        L_0x009f:
            long r0 = r4.A01()     // Catch:{ all -> 0x00d4 }
        L_0x00a3:
            long r0 = r0 - r2
            monitor-exit(r4)
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x00d8
            java.io.RandomAccessFile r4 = r11.A03
            long r2 = (long) r6
            long r1 = java.lang.Math.min(r2, r0)
            int r0 = (int) r1
            int r4 = r4.read(r12, r13, r0)
            if (r4 != r5) goto L_0x00c7
            long r3 = r11.A01
            long r1 = r11.A00
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00d7
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L_0x00c7:
            long r2 = r11.A00
            long r0 = (long) r4
            long r2 = r2 + r0
            r11.A00 = r2
            return r4
        L_0x00ce:
            java.io.EOFException r0 = new java.io.EOFException     // Catch:{ all -> 0x00d4 }
            r0.<init>()     // Catch:{ all -> 0x00d4 }
            throw r0     // Catch:{ all -> 0x00d4 }
        L_0x00d4:
            r1 = move-exception
            monitor-exit(r4)
            throw r1
        L_0x00d7:
            return r5
        L_0x00d8:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C48602Od.read(byte[], int, int):int");
    }
}
