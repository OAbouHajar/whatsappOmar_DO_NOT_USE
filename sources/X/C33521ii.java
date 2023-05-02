package X;

import android.content.Context;

/* renamed from: X.1ii  reason: invalid class name and case insensitive filesystem */
public class C33521ii extends C18940xV {
    public boolean A00 = false;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C16570tH A02;

    public C33521ii(Context context, C16570tH r3) {
        this.A01 = context;
        this.A02 = r3;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r7.A00 = true;
        X.C446524y.A00(r5, r2);
        r1 = new java.lang.StringBuilder();
        r1.append("MediaTranscodeService/start-service-foreground for message:");
        r1.append(r4);
        com.whatsapp.util.Log.i(r1.toString());
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0073 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C16740tZ r8, int r9) {
        /*
            r7 = this;
            java.util.HashMap r3 = com.whatsapp.media.transcode.MediaTranscodeService.A0B
            monitor-enter(r3)
            byte r1 = r8.A10     // Catch:{ all -> 0x00e0 }
            r0 = 3
            r6 = 1
            if (r1 == r0) goto L_0x0018
            r0 = 13
            if (r1 == r0) goto L_0x0018
            r0 = 9
            if (r1 == r0) goto L_0x0018
            r0 = 2
            if (r1 != r0) goto L_0x0058
            int r0 = r8.A08     // Catch:{ all -> 0x00e0 }
            if (r0 == r6) goto L_0x0058
        L_0x0018:
            int r0 = r8.A0C     // Catch:{ all -> 0x00e0 }
            r4 = 0
            if (r0 != r6) goto L_0x008d
            X.1Vw r4 = r8.A11     // Catch:{ all -> 0x00e0 }
            boolean r0 = r3.containsKey(r4)     // Catch:{ all -> 0x00e0 }
            if (r0 != 0) goto L_0x0058
            X.0tY r8 = (X.C16730tY) r8     // Catch:{ all -> 0x00e0 }
            r3.put(r4, r8)     // Catch:{ all -> 0x00e0 }
            android.content.Context r5 = r7.A01     // Catch:{ all -> 0x00e0 }
            java.lang.Class<com.whatsapp.media.transcode.MediaTranscodeService> r0 = com.whatsapp.media.transcode.MediaTranscodeService.class
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x00e0 }
            r1.<init>(r5, r0)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = "com.obwhatsapp.media.transcode.MediaTranscodeService.START"
            android.content.Intent r2 = r1.setAction(r0)     // Catch:{ all -> 0x00e0 }
            X.0tH r0 = r7.A02     // Catch:{ all -> 0x00e0 }
            boolean r0 = r0.A00     // Catch:{ all -> 0x00e0 }
            if (r0 != 0) goto L_0x005b
            r7.A00 = r6     // Catch:{ all -> 0x00e0 }
            X.C446524y.A00(r5, r2)     // Catch:{ all -> 0x00e0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e0 }
            r1.<init>()     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = "MediaTranscodeService/start-service-foreground for message:"
            r1.append(r0)     // Catch:{ all -> 0x00e0 }
            r1.append(r4)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00e0 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00e0 }
        L_0x0058:
            monitor-exit(r3)     // Catch:{ all -> 0x00e0 }
            goto L_0x00df
        L_0x005b:
            r5.startService(r2)     // Catch:{ IllegalStateException -> 0x0073 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x0073 }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x0073 }
            java.lang.String r0 = "MediaTranscodeService/start-service for message:"
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x0073 }
            r1.append(r4)     // Catch:{ IllegalStateException -> 0x0073 }
            java.lang.String r0 = r1.toString()     // Catch:{ IllegalStateException -> 0x0073 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x0073 }
            goto L_0x0058
        L_0x0073:
            r7.A00 = r6     // Catch:{ all -> 0x00e0 }
            X.C446524y.A00(r5, r2)     // Catch:{ all -> 0x00e0 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e0 }
            r1.<init>()     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = "MediaTranscodeService/start-service-foreground for message:"
            r1.append(r0)     // Catch:{ all -> 0x00e0 }
            r1.append(r4)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00e0 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00e0 }
            goto L_0x0058
        L_0x008d:
            X.1Vw r0 = r8.A11     // Catch:{ all -> 0x00e0 }
            java.lang.Object r2 = r3.remove(r0)     // Catch:{ all -> 0x00e0 }
            X.0tY r2 = (X.C16730tY) r2     // Catch:{ all -> 0x00e0 }
            if (r2 == 0) goto L_0x0058
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x00e0 }
            if (r0 == 0) goto L_0x0058
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e0 }
            r1.<init>()     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = "MediaTranscodeService/stop-service for message:"
            r1.append(r0)     // Catch:{ all -> 0x00e0 }
            X.1Vw r0 = r2.A11     // Catch:{ all -> 0x00e0 }
            r1.append(r0)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x00e0 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00e0 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00e0 }
            r0 = 26
            if (r1 < r0) goto L_0x00d2
            boolean r0 = r7.A00     // Catch:{ all -> 0x00e0 }
            if (r0 == 0) goto L_0x00d2
            android.content.Context r2 = r7.A01     // Catch:{ all -> 0x00e0 }
            java.lang.Class<com.whatsapp.media.transcode.MediaTranscodeService> r0 = com.whatsapp.media.transcode.MediaTranscodeService.class
            android.content.Intent r1 = new android.content.Intent     // Catch:{ all -> 0x00e0 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x00e0 }
            java.lang.String r0 = "com.obwhatsapp.media.transcode.MediaTranscodeService.STOP"
            android.content.Intent r0 = r1.setAction(r0)     // Catch:{ all -> 0x00e0 }
            X.C446524y.A00(r2, r0)     // Catch:{ all -> 0x00e0 }
        L_0x00cf:
            r7.A00 = r4     // Catch:{ all -> 0x00e0 }
            goto L_0x0058
        L_0x00d2:
            android.content.Context r2 = r7.A01     // Catch:{ all -> 0x00e0 }
            java.lang.Class<com.whatsapp.media.transcode.MediaTranscodeService> r1 = com.whatsapp.media.transcode.MediaTranscodeService.class
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x00e0 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x00e0 }
            r2.stopService(r0)     // Catch:{ all -> 0x00e0 }
            goto L_0x00cf
        L_0x00df:
            return
        L_0x00e0:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00e0 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33521ii.A07(X.0tZ, int):void");
    }
}
