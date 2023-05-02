package X;

import android.os.Handler;
import android.os.Looper;
import com.obwhatsapp.Statistics$Data;
import java.io.File;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.1Zo  reason: invalid class name and case insensitive filesystem */
public class C28981Zo extends Handler implements C18000vz {
    public Statistics$Data A00;
    public File A01;
    public File A02;
    public final CountDownLatch A03 = new CountDownLatch(1);
    public volatile boolean A04;
    public final /* synthetic */ C17130ua A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28981Zo(Looper looper, C17130ua r4, C18260wP r5) {
        super(looper);
        this.A05 = r4;
        r5.A02(this);
    }

    public void AP4(AnonymousClass1UX r2) {
        this.A04 = r2.A02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x021f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        com.whatsapp.util.Log.e("statistics/save: error saving", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ad, code lost:
        if (r11.A04 == false) goto L_0x00b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00af, code lost:
        r11.A00.A0I += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b6, code lost:
        if (r5 == 0) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b9, code lost:
        if (r5 == 1) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00bc, code lost:
        if (r5 == 2) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00bf, code lost:
        if (r5 == 3) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c2, code lost:
        if (r5 != 4) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00c4, code lost:
        r11.A00.A0J += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00cd, code lost:
        r11.A00.A0D += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d6, code lost:
        r11.A00.A0M += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00df, code lost:
        r11.A00.A0G += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e8, code lost:
        r11.A00.A0E += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ff, code lost:
        if (r11.A04 == false) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0101, code lost:
        r11.A00.A07 += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0108, code lost:
        if (r5 == 0) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x010b, code lost:
        if (r5 == 1) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x010e, code lost:
        if (r5 == 2) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0111, code lost:
        if (r5 == 3) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0114, code lost:
        if (r5 != 4) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0116, code lost:
        r11.A00.A08 += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x011f, code lost:
        r11.A00.A00 += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0128, code lost:
        r11.A00.A0B += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0131, code lost:
        r11.A00.A03 += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013a, code lost:
        r11.A00.A01 += r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01f4, code lost:
        r2 = r11.A01;
        X.AnonymousClass00B.A06(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        r1 = new X.C40791uh(r11.A05.A04.A00, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:?, code lost:
        r1.write(r11.A00.A00().getBytes());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r1.close();
        r11.A02.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x021a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:98:0x021e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void handleMessage(android.os.Message r12) {
        /*
            r11 = this;
            monitor-enter(r11)
            int r0 = r12.what     // Catch:{ all -> 0x0228 }
            r5 = 0
            r3 = 1
            switch(r0) {
                case 0: goto L_0x001f;
                case 1: goto L_0x01f4;
                case 2: goto L_0x0093;
                case 3: goto L_0x0099;
                case 4: goto L_0x009f;
                case 5: goto L_0x00f1;
                case 6: goto L_0x0143;
                case 7: goto L_0x0176;
                case 8: goto L_0x01d6;
                case 9: goto L_0x01ed;
                default: goto L_0x0008;
            }     // Catch:{ all -> 0x0228 }
        L_0x0008:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0228 }
            r1.<init>()     // Catch:{ all -> 0x0228 }
            java.lang.String r0 = "statistics/stats-handler:unknown message:"
            r1.append(r0)     // Catch:{ all -> 0x0228 }
            r1.append(r12)     // Catch:{ all -> 0x0228 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0228 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0228 }
            goto L_0x0226
        L_0x001f:
            X.0ua r0 = r11.A05     // Catch:{ all -> 0x0228 }
            X.0tz r0 = r0.A03     // Catch:{ all -> 0x0228 }
            android.content.Context r4 = r0.A00     // Catch:{ all -> 0x0228 }
            java.io.File r2 = r4.getFilesDir()     // Catch:{ all -> 0x0228 }
            java.lang.String r1 = "statistics"
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0228 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0228 }
            r11.A02 = r0     // Catch:{ all -> 0x0228 }
            java.io.File r2 = r4.getFilesDir()     // Catch:{ all -> 0x0228 }
            java.lang.String r1 = "statistics.json"
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0228 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0228 }
            r11.A01 = r0     // Catch:{ all -> 0x0228 }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x0228 }
            if (r0 == 0) goto L_0x006a
            java.io.File r0 = r11.A01     // Catch:{ Exception -> 0x005d }
            byte[] r1 = X.C29301aP.A00(r0)     // Catch:{ Exception -> 0x005d }
            java.lang.String r0 = new java.lang.String     // Catch:{ Exception -> 0x005d }
            r0.<init>(r1)     // Catch:{ Exception -> 0x005d }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x005d }
            r1.<init>(r0)     // Catch:{ Exception -> 0x005d }
            com.obwhatsapp.Statistics$Data r0 = new com.obwhatsapp.Statistics$Data     // Catch:{ Exception -> 0x005d }
            r0.<init>((org.json.JSONObject) r1)     // Catch:{ Exception -> 0x005d }
            goto L_0x006f
        L_0x005d:
            r1 = move-exception
            java.lang.String r0 = "statistics/load: reset due to the error"
            com.whatsapp.util.Log.w(r0, r1)     // Catch:{ all -> 0x0228 }
            com.obwhatsapp.Statistics$Data r0 = new com.obwhatsapp.Statistics$Data     // Catch:{ all -> 0x0228 }
            r0.<init>((boolean) r3)     // Catch:{ all -> 0x0228 }
            goto L_0x006f
        L_0x006a:
            com.obwhatsapp.Statistics$Data r0 = new com.obwhatsapp.Statistics$Data     // Catch:{ all -> 0x0228 }
            r0.<init>((boolean) r5)     // Catch:{ all -> 0x0228 }
        L_0x006f:
            r11.A00 = r0     // Catch:{ all -> 0x0228 }
            java.util.concurrent.CountDownLatch r0 = r11.A03     // Catch:{ all -> 0x0228 }
            r0.countDown()     // Catch:{ all -> 0x0228 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0228 }
            r1.<init>()     // Catch:{ all -> 0x0228 }
            java.lang.String r0 = "statistics/init: "
            r1.append(r0)     // Catch:{ all -> 0x0228 }
            com.obwhatsapp.Statistics$Data r0 = r11.A00     // Catch:{ all -> 0x0228 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0228 }
            r1.append(r0)     // Catch:{ all -> 0x0228 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x0228 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0228 }
            goto L_0x0226
        L_0x0093:
            int r5 = r12.arg1     // Catch:{ all -> 0x0228 }
            int r0 = r12.arg2     // Catch:{ all -> 0x0228 }
            long r3 = (long) r0     // Catch:{ all -> 0x0228 }
            goto L_0x00ab
        L_0x0099:
            int r5 = r12.arg1     // Catch:{ all -> 0x0228 }
            int r0 = r12.arg2     // Catch:{ all -> 0x0228 }
            long r3 = (long) r0     // Catch:{ all -> 0x0228 }
            goto L_0x00fd
        L_0x009f:
            int r5 = r12.arg1     // Catch:{ all -> 0x0228 }
            android.os.Bundle r1 = r12.getData()     // Catch:{ all -> 0x0228 }
            java.lang.String r0 = "bytes"
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x0228 }
        L_0x00ab:
            boolean r0 = r11.A04     // Catch:{ all -> 0x0228 }
            if (r0 == 0) goto L_0x00b6
            com.obwhatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0228 }
            long r0 = r2.A0I     // Catch:{ all -> 0x0228 }
            long r0 = r0 + r3
            r2.A0I = r0     // Catch:{ all -> 0x0228 }
        L_0x00b6:
            if (r5 == 0) goto L_0x00e8
            r0 = 1
            if (r5 == r0) goto L_0x00df
            r0 = 2
            if (r5 == r0) goto L_0x00d6
            r0 = 3
            if (r5 == r0) goto L_0x00cd
            r0 = 4
            if (r5 != r0) goto L_0x0226
            com.obwhatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0228 }
            long r0 = r2.A0J     // Catch:{ all -> 0x0228 }
            long r0 = r0 + r3
            r2.A0J = r0     // Catch:{ all -> 0x0228 }
            goto L_0x0226
        L_0x00cd:
            com.obwhatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0228 }
            long r0 = r2.A0D     // Catch:{ all -> 0x0228 }
            long r0 = r0 + r3
            r2.A0D = r0     // Catch:{ all -> 0x0228 }
            goto L_0x0226
        L_0x00d6:
            com.obwhatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0228 }
            long r0 = r2.A0M     // Catch:{ all -> 0x0228 }
            long r0 = r0 + r3
            r2.A0M = r0     // Catch:{ all -> 0x0228 }
            goto L_0x0226
        L_0x00df:
            com.obwhatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0228 }
            long r0 = r2.A0G     // Catch:{ all -> 0x0228 }
            long r0 = r0 + r3
            r2.A0G = r0     // Catch:{ all -> 0x0228 }
            goto L_0x0226
        L_0x00e8:
            com.obwhatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0228 }
            long r0 = r2.A0E     // Catch:{ all -> 0x0228 }
            long r0 = r0 + r3
            r2.A0E = r0     // Catch:{ all -> 0x0228 }
            goto L_0x0226
        L_0x00f1:
            int r5 = r12.arg1     // Catch:{ all -> 0x0228 }
            android.os.Bundle r1 = r12.getData()     // Catch:{ all -> 0x0228 }
            java.lang.String r0 = "bytes"
            long r3 = r1.getLong(r0)     // Catch:{ all -> 0x0228 }
        L_0x00fd:
            boolean r0 = r11.A04     // Catch:{ all -> 0x0228 }
            if (r0 == 0) goto L_0x0108
            com.obwhatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0228 }
            long r0 = r2.A07     // Catch:{ all -> 0x0228 }
            long r0 = r0 + r3
            r2.A07 = r0     // Catch:{ all -> 0x0228 }
        L_0x0108:
            if (r5 == 0) goto L_0x013a
            r0 = 1
            if (r5 == r0) goto L_0x0131
            r0 = 2
            if (r5 == r0) goto L_0x0128
            r0 = 3
            if (r5 == r0) goto L_0x011f
            r0 = 4
            if (r5 != r0) goto L_0x0226
            com.obwhatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0228 }
            long r0 = r2.A08     // Catch:{ all -> 0x0228 }
            long r0 = r0 + r3
            r2.A08 = r0     // Catch:{ all -> 0x0228 }
            goto L_0x0226
        L_0x011f:
            com.obwhatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0228 }
            long r0 = r2.A00     // Catch:{ all -> 0x0228 }
            long r0 = r0 + r3
            r2.A00 = r0     // Catch:{ all -> 0x0228 }
            goto L_0x0226
        L_0x0128:
            com.obwhatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0228 }
            long r0 = r2.A0B     // Catch:{ all -> 0x0228 }
            long r0 = r0 + r3
            r2.A0B = r0     // Catch:{ all -> 0x0228 }
            goto L_0x0226
        L_0x0131:
            com.obwhatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0228 }
            long r0 = r2.A03     // Catch:{ all -> 0x0228 }
            long r0 = r0 + r3
            r2.A03 = r0     // Catch:{ all -> 0x0228 }
            goto L_0x0226
        L_0x013a:
            com.obwhatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0228 }
            long r0 = r2.A01     // Catch:{ all -> 0x0228 }
            long r0 = r0 + r3
            r2.A01 = r0     // Catch:{ all -> 0x0228 }
            goto L_0x0226
        L_0x0143:
            int r1 = r12.arg1     // Catch:{ all -> 0x0228 }
            int r0 = r12.arg2     // Catch:{ all -> 0x0228 }
            if (r0 != r3) goto L_0x014a
            r5 = 1
        L_0x014a:
            r6 = 1
            r0 = 3
            if (r1 != r0) goto L_0x0157
            com.obwhatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0228 }
            long r0 = r2.A0K     // Catch:{ all -> 0x0228 }
            long r0 = r0 + r6
            r2.A0K = r0     // Catch:{ all -> 0x0228 }
            goto L_0x016b
        L_0x0157:
            if (r1 != r3) goto L_0x0161
            com.obwhatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0228 }
            long r0 = r2.A0L     // Catch:{ all -> 0x0228 }
            long r0 = r0 + r6
            r2.A0L = r0     // Catch:{ all -> 0x0228 }
            goto L_0x016b
        L_0x0161:
            r0 = 2
            if (r1 != r0) goto L_0x016b
            com.obwhatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0228 }
            long r0 = r2.A0F     // Catch:{ all -> 0x0228 }
            long r0 = r0 + r6
            r2.A0F = r0     // Catch:{ all -> 0x0228 }
        L_0x016b:
            if (r5 == 0) goto L_0x0226
            com.obwhatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0228 }
            long r0 = r2.A0H     // Catch:{ all -> 0x0228 }
            long r0 = r0 + r6
            r2.A0H = r0     // Catch:{ all -> 0x0228 }
            goto L_0x0226
        L_0x0176:
            android.os.Bundle r3 = r12.getData()     // Catch:{ all -> 0x0228 }
            java.lang.String r0 = "messageType"
            int r7 = r3.getInt(r0)     // Catch:{ all -> 0x0228 }
            java.lang.String r0 = "timestamp"
            long r1 = r3.getLong(r0)     // Catch:{ all -> 0x0228 }
            java.lang.String r0 = "isPayment"
            boolean r10 = r3.getBoolean(r0)     // Catch:{ all -> 0x0228 }
            X.0ua r0 = r11.A05     // Catch:{ all -> 0x0228 }
            X.0t3 r0 = r0.A02     // Catch:{ all -> 0x0228 }
            long r8 = r0.A00()     // Catch:{ all -> 0x0228 }
            long r8 = r8 - r1
            r5 = 1
            r1 = 1000(0x3e8, double:4.94E-321)
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ac
            com.obwhatsapp.Statistics$Data r4 = r11.A00     // Catch:{ all -> 0x0228 }
            long r2 = r4.A04     // Catch:{ all -> 0x0228 }
            long r0 = r4.A05     // Catch:{ all -> 0x0228 }
            long r2 = r2 * r0
            long r2 = r2 + r8
            long r0 = r0 + r5
            r4.A05 = r0     // Catch:{ all -> 0x0228 }
            long r2 = r2 / r0
            r4.A04 = r2     // Catch:{ all -> 0x0228 }
        L_0x01ac:
            r0 = 3
            if (r7 != r0) goto L_0x01b7
            com.obwhatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0228 }
            long r0 = r2.A09     // Catch:{ all -> 0x0228 }
            long r0 = r0 + r5
            r2.A09 = r0     // Catch:{ all -> 0x0228 }
            goto L_0x01cc
        L_0x01b7:
            r0 = 1
            if (r7 != r0) goto L_0x01c2
            com.obwhatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0228 }
            long r0 = r2.A0A     // Catch:{ all -> 0x0228 }
            long r0 = r0 + r5
            r2.A0A = r0     // Catch:{ all -> 0x0228 }
            goto L_0x01cc
        L_0x01c2:
            r0 = 2
            if (r7 != r0) goto L_0x01cc
            com.obwhatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0228 }
            long r0 = r2.A02     // Catch:{ all -> 0x0228 }
            long r0 = r0 + r5
            r2.A02 = r0     // Catch:{ all -> 0x0228 }
        L_0x01cc:
            if (r10 == 0) goto L_0x0226
            com.obwhatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0228 }
            long r0 = r2.A06     // Catch:{ all -> 0x0228 }
            long r0 = r0 + r5
            r2.A06 = r0     // Catch:{ all -> 0x0228 }
            goto L_0x0226
        L_0x01d6:
            int r0 = r12.arg1     // Catch:{ all -> 0x0228 }
            if (r0 != r3) goto L_0x01db
            r5 = 1
        L_0x01db:
            r3 = 1
            com.obwhatsapp.Statistics$Data r2 = r11.A00     // Catch:{ all -> 0x0228 }
            if (r5 == 0) goto L_0x01e7
            long r0 = r2.A0N     // Catch:{ all -> 0x0228 }
            long r0 = r0 + r3
            r2.A0N = r0     // Catch:{ all -> 0x0228 }
            goto L_0x0226
        L_0x01e7:
            long r0 = r2.A0C     // Catch:{ all -> 0x0228 }
            long r0 = r0 + r3
            r2.A0C = r0     // Catch:{ all -> 0x0228 }
            goto L_0x0226
        L_0x01ed:
            com.obwhatsapp.Statistics$Data r0 = new com.obwhatsapp.Statistics$Data     // Catch:{ all -> 0x0228 }
            r0.<init>((boolean) r3)     // Catch:{ all -> 0x0228 }
            r11.A00 = r0     // Catch:{ all -> 0x0228 }
        L_0x01f4:
            java.io.File r2 = r11.A01     // Catch:{ all -> 0x0228 }
            X.AnonymousClass00B.A06(r2)     // Catch:{ all -> 0x0228 }
            X.0ua r0 = r11.A05     // Catch:{ Exception -> 0x021f }
            X.12X r0 = r0.A04     // Catch:{ Exception -> 0x021f }
            X.1XH r0 = r0.A00     // Catch:{ Exception -> 0x021f }
            X.1uh r1 = new X.1uh     // Catch:{ Exception -> 0x021f }
            r1.<init>(r0, r2)     // Catch:{ Exception -> 0x021f }
            com.obwhatsapp.Statistics$Data r0 = r11.A00     // Catch:{ all -> 0x021a }
            java.lang.String r0 = r0.A00()     // Catch:{ all -> 0x021a }
            byte[] r0 = r0.getBytes()     // Catch:{ all -> 0x021a }
            r1.write(r0)     // Catch:{ all -> 0x021a }
            r1.close()     // Catch:{ Exception -> 0x021f }
            java.io.File r0 = r11.A02     // Catch:{ Exception -> 0x021f }
            r0.delete()     // Catch:{ Exception -> 0x021f }
            goto L_0x0226
        L_0x021a:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x021e }
        L_0x021e:
            throw r0     // Catch:{ Exception -> 0x021f }
        L_0x021f:
            r1 = move-exception
            java.lang.String r0 = "statistics/save: error saving"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0228 }
        L_0x0226:
            monitor-exit(r11)
            return
        L_0x0228:
            r0 = move-exception
            monitor-exit(r11)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28981Zo.handleMessage(android.os.Message):void");
    }
}
