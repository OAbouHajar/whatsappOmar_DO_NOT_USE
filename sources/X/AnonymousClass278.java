package X;

import android.content.Context;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: X.278  reason: invalid class name */
public class AnonymousClass278 extends C38301qZ implements C38331qc {
    public final long A00;
    public final AnonymousClass12A A01;
    public final C16980tz A02;
    public final AnonymousClass277 A03;
    public final C219115x A04;
    public final AnonymousClass1WE A05;
    public final String A06;
    public volatile File A07;
    public volatile boolean A08;

    public AnonymousClass278(C15900s5 r12, C17130ua r13, AnonymousClass12A r14, C16980tz r15, C14730pf r16, C14710pd r17, C20330zs r18, AnonymousClass277 r19, C219115x r20, C19040xf r21, AnonymousClass1WE r22, String str, long j2) {
        super(r12, r13, r16, r17, r18, r21, (Executor) null);
        AnonymousClass277 r2 = r19;
        AnonymousClass00B.A06(r2);
        this.A00 = j2;
        this.A06 = str;
        this.A05 = r22;
        this.A02 = r15;
        this.A03 = r2;
        this.A04 = r20;
        this.A01 = r14;
        A4Z(this);
    }

    public AnonymousClass258 A01() {
        AnonymousClass258 A012 = super.A01();
        C52612e9 r3 = A012.A00.A00;
        if (r3 != null) {
            r3.A0H = 15;
            r3.A0F = 8;
            int i2 = 5;
            if (this.A03.A02 == 1) {
                i2 = 2;
            }
            r3.A0E = Integer.valueOf(i2);
            this.A04.A00.A06(r3);
            return A012;
        }
        Log.e("ProfilePicturePlainFileDownload/download media_download2 event in DownloadResponse is null");
        return A012;
    }

    public /* synthetic */ void AQ1(long j2) {
    }

    public void AQ3(boolean z2) {
        Context context = this.A02.A00;
        AnonymousClass277 r0 = this.A03;
        File A002 = C219215y.A00(context, r0.A04, r0.A05);
        if (A002.exists()) {
            A002.delete();
        }
        this.A05.accept(this.A06);
        this.A08 = false;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x002c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0031 */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void AQ4(X.C31701et r10, X.C30761cu r11) {
        /*
            r9 = this;
            int r1 = r10.A01
            r0 = 0
            if (r1 != 0) goto L_0x0006
            r0 = 1
        L_0x0006:
            r6 = 0
            if (r0 == 0) goto L_0x0036
            java.io.File r0 = r9.A07
            long r0 = r0.length()
            int r4 = (int) r0
            byte[] r3 = new byte[r4]
            java.io.File r0 = r9.A07     // Catch:{ FileNotFoundException -> 0x0032, IOException -> 0x003f }
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0032, IOException -> 0x003f }
            r2.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0032, IOException -> 0x003f }
            java.io.BufferedInputStream r1 = new java.io.BufferedInputStream     // Catch:{ all -> 0x002d }
            r1.<init>(r2)     // Catch:{ all -> 0x002d }
            r1.read(r3, r6, r4)     // Catch:{ all -> 0x0028 }
            r1.close()     // Catch:{ all -> 0x002d }
            r2.close()     // Catch:{ FileNotFoundException -> 0x0032, IOException -> 0x003f }
            goto L_0x0045
        L_0x0028:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x002c }
        L_0x002c:
            throw r0     // Catch:{ all -> 0x002d }
        L_0x002d:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x0031 }
        L_0x0031:
            throw r0     // Catch:{ FileNotFoundException -> 0x0032, IOException -> 0x003f }
        L_0x0032:
            r1 = move-exception
            java.lang.String r0 = "ProfilePictureDownload: Could not find picture download file"
            goto L_0x0042
        L_0x0036:
            boolean r0 = X.C31701et.A01(r1)
            r8 = 6
            if (r0 == 0) goto L_0x0058
            r8 = 4
            goto L_0x0058
        L_0x003f:
            r1 = move-exception
            java.lang.String r0 = "ProfilePictureDownload: IO Exception while reading the picture download file"
        L_0x0042:
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0045:
            X.277 r4 = r9.A03
            r4.A00 = r3
            X.12A r3 = r9.A01
            X.11y r2 = r3.A00
            r1 = 43
            com.facebook.redex.RunnableRunnableShape4S0200000_I0_2 r0 = new com.facebook.redex.RunnableRunnableShape4S0200000_I0_2
            r0.<init>(r3, r1, r4)
            r2.A01(r0)
            r8 = 1
        L_0x0058:
            X.15x r7 = r9.A04
            X.277 r0 = r9.A03
            int r0 = r0.A02
            r5 = 1
            if (r0 != r5) goto L_0x0062
            r5 = 2
        L_0x0062:
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r0 = r9.A00
            long r2 = r2 - r0
            java.lang.Long r4 = java.lang.Long.valueOf(r2)
            java.io.File r0 = r9.A07
            if (r0 == 0) goto L_0x008e
            java.io.File r0 = r9.A07
            long r2 = r0.length()
            double r0 = (double) r2
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
        L_0x007c:
            r7.A00(r0, r4, r8, r5)
            java.io.File r0 = r9.A07
            r0.delete()
            X.1WE r1 = r9.A05
            java.lang.String r0 = r9.A06
            r1.accept(r0)
            r9.A08 = r6
            return
        L_0x008e:
            r0 = 0
            goto L_0x007c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass278.AQ4(X.1et, X.1cu):void");
    }
}
