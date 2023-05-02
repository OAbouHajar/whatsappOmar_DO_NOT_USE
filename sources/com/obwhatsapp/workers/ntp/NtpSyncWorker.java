package com.obwhatsapp.workers.ntp;

import X.AnonymousClass01F;
import X.AnonymousClass02Q;
import X.C13700nu;
import X.C14710pd;
import X.C16150sX;
import X.C16440t3;
import X.C23051Ah;
import X.C24361Fp;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class NtpSyncWorker extends Worker {
    public static volatile long A05;
    public final Context A00;
    public final C16440t3 A01;
    public final C24361Fp A02;
    public final C14710pd A03;
    public final C23051Ah A04;

    public NtpSyncWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.A00 = context;
        AnonymousClass01F A0A = C13700nu.A0A(context.getApplicationContext());
        this.A01 = A0A.Agj();
        this.A03 = A0A.A1G();
        C16150sX r1 = (C16150sX) A0A;
        this.A02 = (C24361Fp) r1.A7G.get();
        this.A04 = (C23051Ah) r1.AGW.get();
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01f3 A[Catch:{ UnknownHostException -> 0x02ac, all -> 0x02e0 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass02Q A00(android.content.Context r22, X.C16440t3 r23, X.C24361Fp r24, X.C14710pd r25, X.C23051Ah r26) {
        /*
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r0 = A05
            long r5 = r5 - r0
            long r3 = A05
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0020
            r1 = 21600000(0x1499700, double:1.0671818E-316)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0020
            java.lang.String r0 = "NtpSyncWorker/executeNtpSync(); another sync happened recently, skipping..."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.02Q r2 = X.AnonymousClass02Q.A00()
            return r2
        L_0x0020:
            java.lang.String r0 = "/ntp/started"
            r5 = r26
            r5.A00(r0)
            java.lang.String r4 = " at resolved address "
            android.content.res.Resources r6 = r22.getResources()
            android.content.res.Resources r2 = android.content.res.Resources.getSystem()
            java.lang.String r1 = "android:string/config_ntpServer"
            r0 = 0
            int r0 = r2.getIdentifier(r1, r0, r0)
            java.lang.String r3 = "2.android.pool.ntp.org"
            if (r0 == 0) goto L_0x0054
            java.lang.String r1 = r6.getString(r0)     // Catch:{ NotFoundException -> 0x004c }
            boolean r0 = r1.isEmpty()     // Catch:{ NotFoundException -> 0x004c }
            if (r0 == 0) goto L_0x0053
            java.lang.String r0 = "NtpSyncWorker/ntp-server; empty ntp server configuration"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ NotFoundException -> 0x004c }
            goto L_0x0054
        L_0x004c:
            r1 = move-exception
            java.lang.String r0 = "NtpSyncWorker/ntp-server; unresolvable ntp server configuration"
            com.whatsapp.util.Log.w(r0, r1)
            goto L_0x0054
        L_0x0053:
            r3 = r1
        L_0x0054:
            r0 = 4
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ all -> 0x02e0 }
            r0 = r24
            X.1fJ r0 = r0.A00(r3)     // Catch:{ UnknownHostException -> 0x02ac }
            java.net.InetAddress[] r0 = r0.A04     // Catch:{ UnknownHostException -> 0x02ac }
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch:{ UnknownHostException -> 0x02ac }
            r22 = 0
            r21 = r22
            r20 = 0
            r6 = 0
            java.util.Iterator r19 = r0.iterator()     // Catch:{ all -> 0x02e0 }
        L_0x006f:
            boolean r0 = r19.hasNext()     // Catch:{ all -> 0x02e0 }
            if (r0 == 0) goto L_0x0155
            java.lang.Object r9 = r19.next()     // Catch:{ all -> 0x02e0 }
            java.net.InetAddress r9 = (java.net.InetAddress) r9     // Catch:{ all -> 0x02e0 }
            java.net.DatagramSocket r11 = new java.net.DatagramSocket     // Catch:{ SocketTimeoutException -> 0x0126, IOException -> 0x0111 }
            r11.<init>()     // Catch:{ SocketTimeoutException -> 0x0126, IOException -> 0x0111 }
            r21 = r11
            r0 = 20000(0x4e20, float:2.8026E-41)
            r11.setSoTimeout(r0)     // Catch:{ SocketTimeoutException -> 0x0126, IOException -> 0x0111 }
            r20 = 1
            r2 = 123(0x7b, float:1.72E-43)
            X.39c r7 = new X.39c     // Catch:{ SocketTimeoutException -> 0x0126, IOException -> 0x0111 }
            r7.<init>()     // Catch:{ SocketTimeoutException -> 0x0126, IOException -> 0x0111 }
            byte[] r13 = r7.A00     // Catch:{ SocketTimeoutException -> 0x0126, IOException -> 0x0111 }
            r8 = 0
            byte r0 = r13[r8]     // Catch:{ SocketTimeoutException -> 0x0126, IOException -> 0x0111 }
            r1 = r0 & 248(0xf8, float:3.48E-43)
            r0 = 3
            r0 = r0 | r1
            byte r0 = (byte) r0     // Catch:{ SocketTimeoutException -> 0x0126, IOException -> 0x0111 }
            r13[r8] = r0     // Catch:{ SocketTimeoutException -> 0x0126, IOException -> 0x0111 }
            r1 = r0 & 199(0xc7, float:2.79E-43)
            r0 = 24
            r0 = r0 | r1
            byte r0 = (byte) r0     // Catch:{ SocketTimeoutException -> 0x0126, IOException -> 0x0111 }
            r13[r8] = r0     // Catch:{ SocketTimeoutException -> 0x0126, IOException -> 0x0111 }
            java.net.DatagramPacket r12 = r7.A01()     // Catch:{ SocketTimeoutException -> 0x0126, IOException -> 0x0111 }
            r12.setAddress(r9)     // Catch:{ SocketTimeoutException -> 0x0126, IOException -> 0x0111 }
            r12.setPort(r2)     // Catch:{ SocketTimeoutException -> 0x0126, IOException -> 0x0111 }
            X.39c r10 = new X.39c     // Catch:{ SocketTimeoutException -> 0x0126, IOException -> 0x0111 }
            r10.<init>()     // Catch:{ SocketTimeoutException -> 0x0126, IOException -> 0x0111 }
            java.net.DatagramPacket r2 = r10.A01()     // Catch:{ SocketTimeoutException -> 0x0126, IOException -> 0x0111 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ SocketTimeoutException -> 0x0126, IOException -> 0x0111 }
            r14 = 2085978496000(0x1e5ae01dc00, double:1.030610312837E-311)
            int r7 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            r18 = 0
            if (r7 >= 0) goto L_0x00cd
            r18 = 1
            r14 = -2208988800000(0xfffffdfdae01dc00, double:NaN)
        L_0x00cd:
            long r0 = r0 - r14
            r16 = 1000(0x3e8, double:4.94E-321)
            long r14 = r0 / r16
            long r0 = r0 % r16
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            long r0 = r0 * r7
            long r0 = r0 / r16
            if (r18 == 0) goto L_0x00e4
            r7 = 2147483648(0x80000000, double:1.0609978955E-314)
            long r14 = r14 | r7
        L_0x00e4:
            r7 = 32
            long r14 = r14 << r7
            long r0 = r0 | r14
            X.553 r7 = new X.553     // Catch:{ SocketTimeoutException -> 0x0126, IOException -> 0x0111 }
            r7.<init>(r0)     // Catch:{ SocketTimeoutException -> 0x0126, IOException -> 0x0111 }
            long r7 = r7.ntpTime     // Catch:{ SocketTimeoutException -> 0x0126, IOException -> 0x0111 }
            r16 = 7
        L_0x00f1:
            int r15 = r16 + 40
            r0 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r7
            int r14 = (int) r0     // Catch:{ SocketTimeoutException -> 0x0126, IOException -> 0x0111 }
            byte r0 = (byte) r14     // Catch:{ SocketTimeoutException -> 0x0126, IOException -> 0x0111 }
            r13[r15] = r0     // Catch:{ SocketTimeoutException -> 0x0126, IOException -> 0x0111 }
            r0 = 8
            long r7 = r7 >>> r0
            int r16 = r16 + -1
            if (r16 >= 0) goto L_0x00f1
            r11.send(r12)     // Catch:{ SocketTimeoutException -> 0x0126, IOException -> 0x0111 }
            r11.receive(r2)     // Catch:{ SocketTimeoutException -> 0x0126, IOException -> 0x0111 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ SocketTimeoutException -> 0x0126, IOException -> 0x0111 }
            X.4NX r2 = new X.4NX     // Catch:{ SocketTimeoutException -> 0x0126, IOException -> 0x0111 }
            r2.<init>(r10, r0)     // Catch:{ SocketTimeoutException -> 0x0126, IOException -> 0x0111 }
            goto L_0x0147
        L_0x0111:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x014c }
            java.lang.String r0 = "NtpSyncWorker/sync; unable to retrieve ntp time from "
            r1.append(r0)     // Catch:{ all -> 0x014c }
            r1.append(r3)     // Catch:{ all -> 0x014c }
            java.lang.String r0 = X.AnonymousClass000.A0e(r9, r4, r1)     // Catch:{ all -> 0x014c }
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x014c }
            goto L_0x013a
        L_0x0126:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x014c }
            java.lang.String r0 = "NtpSyncWorker/sync; socket timeout occurred while retrieving ntp time from "
            r1.append(r0)     // Catch:{ all -> 0x014c }
            r1.append(r3)     // Catch:{ all -> 0x014c }
            java.lang.String r0 = X.AnonymousClass000.A0e(r9, r4, r1)     // Catch:{ all -> 0x014c }
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x014c }
        L_0x013a:
            if (r20 == 0) goto L_0x006f
            if (r21 == 0) goto L_0x0141
            r21.close()     // Catch:{ all -> 0x02e0 }
        L_0x0141:
            r21 = r6
            r20 = 0
            goto L_0x006f
        L_0x0147:
            r6 = r2
            r11.close()     // Catch:{ all -> 0x02e0 }
            goto L_0x0155
        L_0x014c:
            r0 = move-exception
            if (r20 == 0) goto L_0x0154
            if (r21 == 0) goto L_0x0154
            r21.close()     // Catch:{ all -> 0x02e0 }
        L_0x0154:
            throw r0     // Catch:{ all -> 0x02e0 }
        L_0x0155:
            if (r6 != 0) goto L_0x016e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x02e0 }
            java.lang.String r0 = "NtpSyncWorker/sync; unable to retrieve ntp time from any of the resolved addresses for "
            r1.append(r0)     // Catch:{ all -> 0x02e0 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r1)     // Catch:{ all -> 0x02e0 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x02e0 }
            X.02P r2 = new X.02P     // Catch:{ all -> 0x02e0 }
            r2.<init>()     // Catch:{ all -> 0x02e0 }
            goto L_0x02c2
        L_0x016e:
            boolean r0 = r6.A02     // Catch:{ all -> 0x02e0 }
            if (r0 != 0) goto L_0x0235
            r0 = 1
            r6.A02 = r0     // Catch:{ all -> 0x02e0 }
            java.util.List r4 = r6.A01     // Catch:{ all -> 0x02e0 }
            if (r4 != 0) goto L_0x017f
            java.util.ArrayList r4 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x02e0 }
            r6.A01 = r4     // Catch:{ all -> 0x02e0 }
        L_0x017f:
            X.39c r2 = r6.A04     // Catch:{ all -> 0x02e0 }
            r0 = 24
            X.553 r7 = r2.A02(r0)     // Catch:{ all -> 0x02e0 }
            long r0 = r7.ntpTime     // Catch:{ all -> 0x02e0 }
            long r20 = X.AnonymousClass553.A00(r0)     // Catch:{ all -> 0x02e0 }
            r0 = 32
            X.553 r9 = r2.A02(r0)     // Catch:{ all -> 0x02e0 }
            long r0 = r9.ntpTime     // Catch:{ all -> 0x02e0 }
            long r18 = X.AnonymousClass553.A00(r0)     // Catch:{ all -> 0x02e0 }
            r0 = 40
            X.553 r8 = r2.A02(r0)     // Catch:{ all -> 0x02e0 }
            long r2 = r8.ntpTime     // Catch:{ all -> 0x02e0 }
            long r16 = X.AnonymousClass553.A00(r2)     // Catch:{ all -> 0x02e0 }
            long r0 = r7.ntpTime     // Catch:{ all -> 0x02e0 }
            r14 = 0
            int r7 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r7 != 0) goto L_0x01be
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0230
            long r0 = r6.A03     // Catch:{ all -> 0x02e0 }
            long r16 = r16 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x02e0 }
            r6.A00 = r0     // Catch:{ all -> 0x02e0 }
            java.lang.String r0 = "Error: zero orig time -- cannot compute delay"
            goto L_0x0232
        L_0x01be:
            long r0 = r9.ntpTime     // Catch:{ all -> 0x02e0 }
            java.lang.String r7 = "Error: OrigTime > DestRcvTime"
            int r10 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x01f4
            int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x01f4
            long r1 = r6.A03     // Catch:{ all -> 0x02e0 }
            long r12 = r1 - r20
            int r0 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r0 >= 0) goto L_0x01d8
            java.lang.String r0 = "Error: xmitTime < rcvTime"
        L_0x01d4:
            r4.add(r0)     // Catch:{ all -> 0x02e0 }
            goto L_0x01ef
        L_0x01d8:
            long r10 = r16 - r18
            int r0 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ef
            long r10 = r10 - r12
            r8 = 1
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x01ec
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x01ef
            java.lang.String r0 = "Info: processing time > total network time by 1 ms -> assume zero delay"
            goto L_0x01d4
        L_0x01ec:
            java.lang.String r0 = "Warning: processing time > total network time"
            goto L_0x01d4
        L_0x01ef:
            int r0 = (r20 > r1 ? 1 : (r20 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0212
            goto L_0x020d
        L_0x01f4:
            java.lang.String r0 = "Warning: zero rcvNtpTime or xmitNtpTime"
            r4.add(r0)     // Catch:{ all -> 0x02e0 }
            long r3 = r6.A03     // Catch:{ all -> 0x02e0 }
            int r0 = (r20 > r3 ? 1 : (r20 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0204
            java.util.List r0 = r6.A01     // Catch:{ all -> 0x02e0 }
            r0.add(r7)     // Catch:{ all -> 0x02e0 }
        L_0x0204:
            long r1 = r9.ntpTime     // Catch:{ all -> 0x02e0 }
            int r0 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0221
            long r18 = r18 - r20
            goto L_0x021c
        L_0x020d:
            java.util.List r0 = r6.A01     // Catch:{ all -> 0x02e0 }
            r0.add(r7)     // Catch:{ all -> 0x02e0 }
        L_0x0212:
            long r18 = r18 - r20
            long r16 = r16 - r1
            long r18 = r18 + r16
            r0 = 2
            long r18 = r18 / r0
        L_0x021c:
            java.lang.Long r0 = java.lang.Long.valueOf(r18)     // Catch:{ all -> 0x02e0 }
            goto L_0x022d
        L_0x0221:
            long r1 = r8.ntpTime     // Catch:{ all -> 0x02e0 }
            int r0 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r0 == 0) goto L_0x0235
            long r16 = r16 - r3
            java.lang.Long r0 = java.lang.Long.valueOf(r16)     // Catch:{ all -> 0x02e0 }
        L_0x022d:
            r6.A00 = r0     // Catch:{ all -> 0x02e0 }
            goto L_0x0235
        L_0x0230:
            java.lang.String r0 = "Error: zero orig time -- cannot compute delay/offset"
        L_0x0232:
            r4.add(r0)     // Catch:{ all -> 0x02e0 }
        L_0x0235:
            java.lang.Long r0 = r6.A00     // Catch:{ all -> 0x02e0 }
            if (r0 != 0) goto L_0x0244
            java.lang.String r0 = "NtpSyncWorker/sync; NTP offset is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x02e0 }
            X.02P r2 = new X.02P     // Catch:{ all -> 0x02e0 }
            r2.<init>()     // Catch:{ all -> 0x02e0 }
            goto L_0x02c2
        L_0x0244:
            long r6 = r6.A03     // Catch:{ all -> 0x02e0 }
            long r2 = r0.longValue()     // Catch:{ all -> 0x02e0 }
            long r6 = r6 + r2
            r4 = r23
            long r8 = r4.A01()     // Catch:{ all -> 0x02e0 }
            long r12 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02e0 }
            long r0 = r6 - r8
            long r8 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x02e0 }
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x028e
            long r0 = r6 - r12
            long r8 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x02e0 }
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x028e
            r1 = 2225(0x8b1, float:3.118E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x02e0 }
            r8 = r25
            boolean r0 = r8.A0E(r0, r1)     // Catch:{ all -> 0x02e0 }
            if (r0 == 0) goto L_0x028e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x02e0 }
            java.lang.String r0 = "NtpSyncWorker/sync; NTP time too far from server or device time; ntpTimeMs="
            r1.append(r0)     // Catch:{ all -> 0x02e0 }
            java.lang.String r0 = X.C13680ns.A0j(r1, r6)     // Catch:{ all -> 0x02e0 }
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x02e0 }
            X.02P r2 = new X.02P     // Catch:{ all -> 0x02e0 }
            r2.<init>()     // Catch:{ all -> 0x02e0 }
            goto L_0x02c2
        L_0x028e:
            r4.A03(r2)     // Catch:{ all -> 0x02e0 }
            X.0sm r0 = r4.A00     // Catch:{ all -> 0x02e0 }
            android.content.SharedPreferences r4 = r0.A00     // Catch:{ all -> 0x02e0 }
            android.content.SharedPreferences$Editor r1 = r4.edit()     // Catch:{ all -> 0x02e0 }
            java.lang.String r0 = "client_ntp_time_diff"
            X.C13680ns.A0x(r1, r0, r2)     // Catch:{ all -> 0x02e0 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02e0 }
            android.content.SharedPreferences$Editor r1 = r4.edit()     // Catch:{ all -> 0x02e0 }
            java.lang.String r0 = "last_ntp_client_time"
            X.C13680ns.A0x(r1, r0, r2)     // Catch:{ all -> 0x02e0 }
            goto L_0x02c6
        L_0x02ac:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x02e0 }
            java.lang.String r0 = "NtpSyncWorker/sync; unable to resolve ntp server "
            r1.append(r0)     // Catch:{ all -> 0x02e0 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r1)     // Catch:{ all -> 0x02e0 }
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x02e0 }
            X.02P r2 = new X.02P     // Catch:{ all -> 0x02e0 }
            r2.<init>()     // Catch:{ all -> 0x02e0 }
        L_0x02c2:
            android.net.TrafficStats.clearThreadStatsTag()
            goto L_0x02cd
        L_0x02c6:
            android.net.TrafficStats.clearThreadStatsTag()
            X.02Q r2 = X.AnonymousClass02Q.A00()
        L_0x02cd:
            boolean r0 = r2 instanceof X.C02900Gd
            if (r0 == 0) goto L_0x02dd
            long r0 = android.os.SystemClock.elapsedRealtime()
            A05 = r0
            java.lang.String r0 = "/ntp/succeeded"
        L_0x02d9:
            r5.A00(r0)
            return r2
        L_0x02dd:
            java.lang.String r0 = "/ntp/failed"
            goto L_0x02d9
        L_0x02e0:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.workers.ntp.NtpSyncWorker.A00(android.content.Context, X.0t3, X.1Fp, X.0pd, X.1Ah):X.02Q");
    }

    public AnonymousClass02Q A04() {
        return A00(this.A00, this.A01, this.A02, this.A03, this.A04);
    }
}
