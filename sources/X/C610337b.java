package X;

import java.net.ServerSocket;
import java.net.Socket;

/* renamed from: X.37b  reason: invalid class name and case insensitive filesystem */
public class C610337b extends AnonymousClass1ZS {
    public Socket A00;
    public final AnonymousClass3AD A01;
    public final C82794Ee A02;
    public final String A03;
    public final ServerSocket A04;

    public C610337b(AnonymousClass3AD r2, C82794Ee r3, String str, ServerSocket serverSocket) {
        super("ReceiverNetworkingThread");
        this.A03 = str;
        this.A04 = serverSocket;
        this.A01 = r2;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x01a8, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x01b9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:69:0x01be */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r13 = this;
            java.lang.String r12 = "fpm/ReceiverNetworkingThread/Error closing sockets"
            java.lang.String r0 = "fpm/ReceiverNetworkingThread/Waiting for donor to connect"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0247 }
            java.net.ServerSocket r11 = r13.A04     // Catch:{ IOException -> 0x0247 }
            java.net.Socket r0 = r11.accept()     // Catch:{ IOException -> 0x0247 }
            r13.A00 = r0     // Catch:{ IOException -> 0x0247 }
            java.lang.String r0 = "fpm/ReceiverNetworkingThread/Donor connected"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IOException -> 0x0247 }
            X.4Ee r0 = r13.A02     // Catch:{ IOException -> 0x0247 }
            com.obwhatsapp.migration.transfer.service.ReceiverDeviceTransferService r0 = r0.A00     // Catch:{ IOException -> 0x0247 }
            X.3v5 r0 = r0.A04     // Catch:{ IOException -> 0x0247 }
            android.net.wifi.p2p.WifiP2pManager r2 = r0.A01     // Catch:{ IOException -> 0x0247 }
            if (r2 == 0) goto L_0x0024
            android.net.wifi.p2p.WifiP2pManager$Channel r1 = r0.A00     // Catch:{ IOException -> 0x0247 }
            r0 = 0
            r2.clearLocalServices(r1, r0)     // Catch:{ IOException -> 0x0247 }
        L_0x0024:
            java.net.Socket r0 = r13.A00     // Catch:{ IOException -> 0x0247 }
            java.io.InputStream r8 = r0.getInputStream()     // Catch:{ IOException -> 0x0247 }
            java.net.Socket r0 = r13.A00     // Catch:{ IOException -> 0x0247 }
            java.io.OutputStream r9 = r0.getOutputStream()     // Catch:{ IOException -> 0x0247 }
            X.3AD r7 = r13.A01     // Catch:{ IOException -> 0x0247 }
            java.lang.String r10 = r13.A03     // Catch:{ IOException -> 0x0247 }
            X.1Pp r6 = r7.A0A     // Catch:{ IOException -> 0x022b }
            android.content.Context r0 = r6.A00     // Catch:{ IOException -> 0x022b }
            java.io.File r1 = r0.getFilesDir()     // Catch:{ IOException -> 0x022b }
            java.lang.String r0 = "migration/import/sandbox"
            java.io.File r0 = X.C13700nu.A0C(r1, r0)     // Catch:{ IOException -> 0x022b }
            X.AnonymousClass1XI.A0D(r0)     // Catch:{ IOException -> 0x022b }
            X.0sb r0 = r7.A03     // Catch:{ IOException -> 0x022b }
            r0.A0Q()     // Catch:{ IOException -> 0x022b }
            X.0ym r0 = r7.A06     // Catch:{ IOException -> 0x022b }
            X.1jj r0 = r0.A00()     // Catch:{ IOException -> 0x022b }
            int r2 = r0.A00     // Catch:{ IOException -> 0x022b }
            r1 = 1
            r0 = 2
            if (r2 == r0) goto L_0x0062
            if (r2 == r1) goto L_0x0062
            r2 = 302(0x12e, float:4.23E-43)
            java.lang.String r1 = "Failed to initialize message store"
            X.40S r0 = new X.40S     // Catch:{ IOException -> 0x022b }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x022b }
            throw r0     // Catch:{ IOException -> 0x022b }
        L_0x0062:
            X.0yx r0 = r7.A0E     // Catch:{ IOException -> 0x022b }
            boolean r0 = r0.A0F()     // Catch:{ IOException -> 0x022b }
            if (r0 != 0) goto L_0x0074
            r2 = 301(0x12d, float:4.22E-43)
            java.lang.String r1 = "fpm/ReceiverTransferTask/can not find jabber Id"
            X.40S r0 = new X.40S     // Catch:{ IOException -> 0x022b }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x022b }
            throw r0     // Catch:{ IOException -> 0x022b }
        L_0x0074:
            X.4bJ r2 = X.C87654Xz.A00(r8)     // Catch:{ IOException -> 0x022b }
            int r1 = r2.A01     // Catch:{ IOException -> 0x022b }
            r3 = 300(0x12c, float:4.2E-43)
            if (r1 == r3) goto L_0x01e5
            r0 = 400(0x190, float:5.6E-43)
            if (r1 == r0) goto L_0x015f
            switch(r1) {
                case 200: goto L_0x0087;
                case 201: goto L_0x00b1;
                case 202: goto L_0x011b;
                case 203: goto L_0x019f;
                default: goto L_0x0085;
            }     // Catch:{ IOException -> 0x022b }
        L_0x0085:
            goto L_0x01a2
        L_0x0087:
            long r0 = r2.A02     // Catch:{ IOException -> 0x022b }
            int r2 = (int) r0     // Catch:{ IOException -> 0x022b }
            byte[] r2 = new byte[r2]     // Catch:{ IOException -> 0x022b }
            int r1 = r8.read(r2)     // Catch:{ IOException -> 0x022b }
            r0 = -1
            if (r1 == r0) goto L_0x01ad
            X.1NP r1 = r7.A08     // Catch:{ IOException -> 0x022b }
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ IOException -> 0x022b }
            r0.<init>(r2)     // Catch:{ IOException -> 0x022b }
            X.4az r0 = r1.A00(r0)     // Catch:{ IOException -> 0x022b }
            X.4RG r0 = r0.A00     // Catch:{ IOException -> 0x022b }
            X.0xI r4 = r7.A07     // Catch:{ IOException -> 0x022b }
            java.lang.String r3 = r0.A02     // Catch:{ IOException -> 0x022b }
            java.lang.String r2 = r0.A00     // Catch:{ IOException -> 0x022b }
            java.lang.String r1 = r0.A01     // Catch:{ IOException -> 0x022b }
            android.os.CancellationSignal r0 = X.AnonymousClass3AD.A0F     // Catch:{ IOException -> 0x022b }
            r4.A01(r0, r3, r2, r1)     // Catch:{ IOException -> 0x022b }
            r3 = 101(0x65, float:1.42E-43)
            goto L_0x0193
        L_0x00b1:
            long r0 = r2.A02     // Catch:{ IOException -> 0x022b }
            java.lang.String r2 = "manifest.json"
            java.io.File r3 = r6.A00(r2)     // Catch:{ IOException -> 0x022b }
            X.1q7 r2 = new X.1q7     // Catch:{ IOException -> 0x022b }
            r2.<init>(r8, r0)     // Catch:{ IOException -> 0x022b }
            X.AnonymousClass1XI.A0R(r3, r2, r0)     // Catch:{ IOException -> 0x022b }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ IOException -> 0x022b }
            r4.<init>(r3)     // Catch:{ IOException -> 0x022b }
            java.lang.String r1 = X.AnonymousClass01S.A08     // Catch:{ all -> 0x01ba }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x01ba }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x01ba }
            android.util.JsonReader r2 = new android.util.JsonReader     // Catch:{ all -> 0x01ba }
            r2.<init>(r0)     // Catch:{ all -> 0x01ba }
            r2.beginObject()     // Catch:{ all -> 0x01b5 }
        L_0x00d5:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x01b5 }
            if (r0 == 0) goto L_0x00ed
            java.lang.String r1 = r2.nextName()     // Catch:{ all -> 0x01b5 }
            java.lang.String r0 = "totalSize"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x01b5 }
            if (r0 == 0) goto L_0x00d5
            long r0 = r2.nextLong()     // Catch:{ all -> 0x01b5 }
            goto L_0x00f3
        L_0x00ed:
            r2.close()     // Catch:{ all -> 0x01ba }
            r0 = 0
            goto L_0x00f6
        L_0x00f3:
            r2.close()     // Catch:{ all -> 0x01ba }
        L_0x00f6:
            r7.A01 = r0     // Catch:{ all -> 0x01ba }
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x01ba }
            java.lang.String r2 = "fpm/ReceiverTransferTask/Parsed manifest file, totalSizeExpected="
            r3.append(r2)     // Catch:{ all -> 0x01ba }
            r3.append(r0)     // Catch:{ all -> 0x01ba }
            X.C13680ns.A1V(r3)     // Catch:{ all -> 0x01ba }
            r4.close()     // Catch:{ IOException -> 0x022b }
            r3 = 102(0x66, float:1.43E-43)
            r0 = 0
            X.4bJ r2 = new X.4bJ     // Catch:{ IOException -> 0x022b }
            r2.<init>(r3, r0)     // Catch:{ IOException -> 0x022b }
            X.C87654Xz.A01(r2, r9)     // Catch:{ IOException -> 0x022b }
            java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x022b }
            goto L_0x0074
        L_0x011b:
            long r0 = r2.A02     // Catch:{ IOException -> 0x022b }
            int r2 = (int) r0     // Catch:{ IOException -> 0x022b }
            byte[] r2 = new byte[r2]     // Catch:{ IOException -> 0x022b }
            int r1 = r8.read(r2)     // Catch:{ IOException -> 0x022b }
            r0 = -1
            if (r1 == r0) goto L_0x01bf
            java.lang.String r1 = X.AnonymousClass01S.A08     // Catch:{ IOException -> 0x022b }
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x022b }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x022b }
            java.io.File r3 = r6.A00(r0)     // Catch:{ IOException -> 0x022b }
            X.4bJ r0 = X.C87654Xz.A00(r8)     // Catch:{ IOException -> 0x022b }
            long r0 = r0.A02     // Catch:{ IOException -> 0x022b }
            X.1q7 r2 = new X.1q7     // Catch:{ IOException -> 0x022b }
            r2.<init>(r8, r0)     // Catch:{ IOException -> 0x022b }
            X.AnonymousClass1XI.A0R(r3, r2, r0)     // Catch:{ IOException -> 0x022b }
            long r0 = r7.A02     // Catch:{ IOException -> 0x022b }
            long r2 = r3.length()     // Catch:{ IOException -> 0x022b }
            long r0 = r0 + r2
            r7.A02 = r0     // Catch:{ IOException -> 0x022b }
            double r4 = (double) r0     // Catch:{ IOException -> 0x022b }
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r4 = r4 * r0
            long r2 = r7.A01     // Catch:{ IOException -> 0x022b }
            double r0 = (double) r2     // Catch:{ IOException -> 0x022b }
            double r4 = r4 / r0
            int r1 = (int) r4     // Catch:{ IOException -> 0x022b }
            int r0 = r7.A00     // Catch:{ IOException -> 0x022b }
            if (r0 == r1) goto L_0x0074
            r7.A00 = r1     // Catch:{ IOException -> 0x022b }
            X.1Oj r0 = r7.A0B     // Catch:{ IOException -> 0x022b }
            r0.A05(r1)     // Catch:{ IOException -> 0x022b }
            goto L_0x0074
        L_0x015f:
            long r0 = r2.A02     // Catch:{ IOException -> 0x022b }
            int r2 = (int) r0     // Catch:{ IOException -> 0x022b }
            byte[] r2 = new byte[r2]     // Catch:{ IOException -> 0x022b }
            int r1 = r8.read(r2)     // Catch:{ IOException -> 0x022b }
            r0 = -1
            if (r1 == r0) goto L_0x01dd
            java.lang.String r1 = X.AnonymousClass01S.A08     // Catch:{ IOException -> 0x022b }
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x022b }
            r0.<init>(r2, r1)     // Catch:{ IOException -> 0x022b }
            boolean r0 = r10.equals(r0)     // Catch:{ IOException -> 0x022b }
            if (r0 == 0) goto L_0x01c7
            X.1Oj r0 = r7.A0B     // Catch:{ IOException -> 0x022b }
            java.util.Iterator r2 = X.C16590tJ.A00(r0)     // Catch:{ IOException -> 0x022b }
        L_0x017e:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x022b }
            if (r0 == 0) goto L_0x0191
            java.lang.Object r0 = r2.next()     // Catch:{ IOException -> 0x022b }
            X.4zv r0 = (X.C103034zv) r0     // Catch:{ IOException -> 0x022b }
            com.obwhatsapp.migration.transfer.ui.DeviceTransferViewModel r1 = r0.A00     // Catch:{ IOException -> 0x022b }
            r0 = 3
            r1.A08(r0)     // Catch:{ IOException -> 0x022b }
            goto L_0x017e
        L_0x0191:
            r3 = 100
        L_0x0193:
            r0 = 0
            X.4bJ r2 = new X.4bJ     // Catch:{ IOException -> 0x022b }
            r2.<init>(r3, r0)     // Catch:{ IOException -> 0x022b }
            X.C87654Xz.A01(r2, r9)     // Catch:{ IOException -> 0x022b }
            goto L_0x0074
        L_0x019f:
            java.lang.String r0 = "fpm/ReceiverTransferTask/Received file data response message without an associated metadata message"
            goto L_0x01a8
        L_0x01a2:
            java.lang.String r0 = "fpm/ReceiverTransferTask/Received invalid message with type: "
            java.lang.String r0 = X.C13680ns.A0c(r1, r0)     // Catch:{ IOException -> 0x022b }
        L_0x01a8:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ IOException -> 0x022b }
            goto L_0x0241
        L_0x01ad:
            java.lang.String r1 = "No bytes to read"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x022b }
            r0.<init>(r1)     // Catch:{ IOException -> 0x022b }
            throw r0     // Catch:{ IOException -> 0x022b }
        L_0x01b5:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x01b9 }
        L_0x01b9:
            throw r0     // Catch:{ all -> 0x01ba }
        L_0x01ba:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x01be }
        L_0x01be:
            throw r0     // Catch:{ IOException -> 0x022b }
        L_0x01bf:
            java.lang.String r1 = "No bytes to read"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x022b }
            r0.<init>(r1)     // Catch:{ IOException -> 0x022b }
            throw r0     // Catch:{ IOException -> 0x022b }
        L_0x01c7:
            r4 = 107(0x6b, float:1.5E-43)
            r3 = 301(0x12d, float:4.22E-43)
            r0 = 0
            X.4bJ r2 = new X.4bJ     // Catch:{ IOException -> 0x022b }
            r2.<init>(r3, r0, r4)     // Catch:{ IOException -> 0x022b }
            X.C87654Xz.A01(r2, r9)     // Catch:{ IOException -> 0x022b }
            java.lang.String r1 = "auth token not verified"
            X.40S r0 = new X.40S     // Catch:{ IOException -> 0x022b }
            r0.<init>(r4, r1)     // Catch:{ IOException -> 0x022b }
            throw r0     // Catch:{ IOException -> 0x022b }
        L_0x01dd:
            java.lang.String r1 = "No bytes to read"
            java.io.IOException r0 = new java.io.IOException     // Catch:{ IOException -> 0x022b }
            r0.<init>(r1)     // Catch:{ IOException -> 0x022b }
            throw r0     // Catch:{ IOException -> 0x022b }
        L_0x01e5:
            java.lang.System.currentTimeMillis()     // Catch:{ IOException -> 0x022b }
            r0 = 0
            X.4bJ r2 = new X.4bJ     // Catch:{ IOException -> 0x022b }
            r2.<init>(r3, r0)     // Catch:{ IOException -> 0x022b }
            X.C87654Xz.A01(r2, r9)     // Catch:{ IOException -> 0x022b }
            X.1NH r2 = r7.A09     // Catch:{ IOException -> 0x022b }
            X.4zr r1 = new X.4zr     // Catch:{ IOException -> 0x022b }
            r1.<init>(r6)     // Catch:{ IOException -> 0x022b }
            android.os.CancellationSignal r0 = X.AnonymousClass3AD.A0F     // Catch:{ IOException -> 0x022b }
            r2.A0H(r0, r1)     // Catch:{ IOException -> 0x022b }
            X.11L r0 = r7.A0D     // Catch:{ IOException -> 0x022b }
            r0.A00()     // Catch:{ IOException -> 0x022b }
            r0.A01()     // Catch:{ IOException -> 0x022b }
            X.1Ok r2 = r7.A0C     // Catch:{ IOException -> 0x022b }
            r0 = 1
            com.facebook.redex.IDxCallbackShape445S0100000_2_I1 r1 = new com.facebook.redex.IDxCallbackShape445S0100000_2_I1     // Catch:{ IOException -> 0x022b }
            r1.<init>(r7, r0)     // Catch:{ IOException -> 0x022b }
            r0 = 0
            r2.A00(r1, r0)     // Catch:{ IOException -> 0x022b }
            X.1Oj r0 = r7.A0B     // Catch:{ IOException -> 0x022b }
            java.util.Iterator r2 = X.C16590tJ.A00(r0)     // Catch:{ IOException -> 0x022b }
        L_0x0218:
            boolean r0 = r2.hasNext()     // Catch:{ IOException -> 0x022b }
            if (r0 == 0) goto L_0x0241
            java.lang.Object r0 = r2.next()     // Catch:{ IOException -> 0x022b }
            X.4zv r0 = (X.C103034zv) r0     // Catch:{ IOException -> 0x022b }
            com.obwhatsapp.migration.transfer.ui.DeviceTransferViewModel r1 = r0.A00     // Catch:{ IOException -> 0x022b }
            r0 = 4
            r1.A08(r0)     // Catch:{ IOException -> 0x022b }
            goto L_0x0218
        L_0x022b:
            r2 = move-exception
            X.1Oj r1 = r7.A0B     // Catch:{ IOException -> 0x0247 }
            java.lang.String r0 = "fpm/TransferTaskUtils/failure during transfer process: "
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ IOException -> 0x0247 }
            boolean r0 = r2 instanceof X.AnonymousClass40S     // Catch:{ IOException -> 0x0247 }
            if (r0 == 0) goto L_0x023f
            X.40S r2 = (X.AnonymousClass40S) r2     // Catch:{ IOException -> 0x0247 }
            int r0 = r2.errorCode     // Catch:{ IOException -> 0x0247 }
        L_0x023b:
            r1.A04(r0)     // Catch:{ IOException -> 0x0247 }
            goto L_0x0241
        L_0x023f:
            r0 = 1
            goto L_0x023b
        L_0x0241:
            r11.close()     // Catch:{ IOException -> 0x0257 }
            java.net.Socket r0 = r13.A00     // Catch:{ IOException -> 0x0257 }
            goto L_0x0253
        L_0x0247:
            java.lang.String r0 = "fpm/ReceiverNetworkingThread/Error creating server socket"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x025b }
            java.net.ServerSocket r0 = r13.A04     // Catch:{ IOException -> 0x0257 }
            r0.close()     // Catch:{ IOException -> 0x0257 }
            java.net.Socket r0 = r13.A00     // Catch:{ IOException -> 0x0257 }
        L_0x0253:
            X.C30311c8.A07(r0)     // Catch:{ IOException -> 0x0257 }
            return
        L_0x0257:
            com.whatsapp.util.Log.e((java.lang.String) r12)
            return
        L_0x025b:
            r1 = move-exception
            java.net.ServerSocket r0 = r13.A04     // Catch:{ IOException -> 0x0267 }
            r0.close()     // Catch:{ IOException -> 0x0267 }
            java.net.Socket r0 = r13.A00     // Catch:{ IOException -> 0x0267 }
            X.C30311c8.A07(r0)     // Catch:{ IOException -> 0x0267 }
            throw r1
        L_0x0267:
            com.whatsapp.util.Log.e((java.lang.String) r12)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C610337b.run():void");
    }
}
