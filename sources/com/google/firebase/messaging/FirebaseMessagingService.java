package com.google.firebase.messaging;

import X.C56212n5;
import java.util.ArrayDeque;
import java.util.Queue;

public class FirebaseMessagingService extends C56212n5 {
    public static final Queue A00 = new ArrayDeque(10);

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x023f A[Catch:{ MalformedURLException -> 0x01af, all -> 0x0321 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01e1 A[SYNTHETIC, Splitter:B:99:0x01e1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(android.content.Intent r22) {
        /*
            r21 = this;
            r5 = r22
            java.lang.String r2 = r5.getAction()
            java.lang.String r0 = "com.google.android.c2dm.intent.RECEIVE"
            boolean r1 = r0.equals(r2)
            java.lang.String r0 = "FirebaseMessaging"
            r4 = r21
            if (r1 != 0) goto L_0x0056
            java.lang.String r1 = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0056
            java.lang.String r1 = "com.google.firebase.messaging.NOTIFICATION_DISMISS"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x002e
            boolean r0 = X.C616939y.A01(r5)
            if (r0 == 0) goto L_0x002d
            java.lang.String r0 = "_nd"
            X.C616939y.A00(r5, r0)
        L_0x002d:
            return
        L_0x002e:
            java.lang.String r1 = "com.google.firebase.messaging.NEW_TOKEN"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0044
            java.lang.String r0 = "token"
            r5.getStringExtra(r0)
            boolean r0 = r4 instanceof com.obwhatsapp.push.GcmListenerService
            if (r0 == 0) goto L_0x002d
            com.obwhatsapp.push.RegistrationIntentService.A02(r4)
            return
        L_0x0044:
            java.lang.String r2 = "Unknown intent action: "
            java.lang.String r1 = r5.getAction()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = X.C13680ns.A0g(r1, r2)
            android.util.Log.d(r0, r1)
            return
        L_0x0056:
            java.lang.String r9 = "google.message_id"
            java.lang.String r7 = r5.getStringExtra(r9)
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 == 0) goto L_0x02de
            r2 = 0
            X.0on r1 = new X.0on
            r1.<init>()
            r1.A08(r2)
        L_0x006b:
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            r8 = 3
            if (r2 != 0) goto L_0x009f
            java.util.Queue r6 = A00
            boolean r2 = r6.contains(r7)
            if (r2 == 0) goto L_0x0091
            boolean r2 = android.util.Log.isLoggable(r0, r8)
            if (r2 == 0) goto L_0x008d
            java.lang.String r3 = "Received duplicate message: "
            java.lang.String r2 = java.lang.String.valueOf(r7)
            java.lang.String r2 = X.C13680ns.A0g(r2, r3)
            android.util.Log.d(r0, r2)
        L_0x008d:
            r3 = 1
            goto L_0x02fc
        L_0x0091:
            int r3 = r6.size()
            r2 = 10
            if (r3 < r2) goto L_0x009c
            r6.remove()
        L_0x009c:
            r6.add(r7)
        L_0x009f:
            java.lang.String r2 = "message_type"
            java.lang.String r3 = r5.getStringExtra(r2)
            java.lang.String r6 = "gcm"
            if (r3 != 0) goto L_0x00aa
            r3 = r6
        L_0x00aa:
            int r2 = r3.hashCode()
            switch(r2) {
                case -2062414158: goto L_0x00bb;
                case 102161: goto L_0x00d5;
                case 814694033: goto L_0x0106;
                case 814800675: goto L_0x0127;
                default: goto L_0x00b1;
            }
        L_0x00b1:
            java.lang.String r2 = "Received message with unknown type: "
            java.lang.String r2 = X.C13680ns.A0g(r3, r2)
            android.util.Log.w(r0, r2)
            goto L_0x008d
        L_0x00bb:
            java.lang.String r2 = "deleted_messages"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x00b1
            boolean r2 = r4 instanceof com.obwhatsapp.push.GcmListenerService
            if (r2 == 0) goto L_0x008d
            com.obwhatsapp.push.GcmListenerService r4 = (com.obwhatsapp.push.GcmListenerService) r4
            X.01T r2 = r4.A00
            java.lang.Object r2 = r2.get()
            X.1A6 r2 = (X.AnonymousClass1A6) r2
            r3 = 0
            r15 = 0
            monitor-enter(r2)
            goto L_0x0135
        L_0x00d5:
            boolean r2 = r3.equals(r6)
            if (r2 == 0) goto L_0x00b1
            boolean r2 = X.C616939y.A01(r5)
            if (r2 == 0) goto L_0x00e6
            java.lang.String r2 = "_nr"
            X.C616939y.A00(r5, r2)
        L_0x00e6:
            android.os.Bundle r9 = r5.getExtras()
            if (r9 != 0) goto L_0x00f0
            android.os.Bundle r9 = X.C13690nt.A0D()
        L_0x00f0:
            java.lang.String r2 = "androidx.contentpager.content.wakelockid"
            r9.remove(r2)
            boolean r2 = X.C61793Ai.A01(r9)
            if (r2 == 0) goto L_0x0268
            X.3Ai r11 = new X.3Ai
            r11.<init>(r9)
            java.util.concurrent.ExecutorService r6 = java.util.concurrent.Executors.newSingleThreadExecutor()
            r13 = 0
            goto L_0x0148
        L_0x0106:
            java.lang.String r2 = "send_error"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x00b1
            java.lang.String r2 = r5.getStringExtra(r9)
            if (r2 != 0) goto L_0x011a
            java.lang.String r2 = "message_id"
            r5.getStringExtra(r2)
        L_0x011a:
            java.lang.String r2 = "error"
            java.lang.String r3 = r5.getStringExtra(r2)
            X.43a r2 = new X.43a
            r2.<init>(r3)
            goto L_0x008d
        L_0x0127:
            java.lang.String r2 = "send_event"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x00b1
            r5.getStringExtra(r9)
            goto L_0x008d
        L_0x0135:
            r5 = r3
            r6 = r3
            r7 = r3
            r8 = r3
            r9 = r3
            r10 = r3
            r11 = r3
            r12 = r3
            r13 = r3
            r14 = r3
            r16 = 0
            r4 = r3
            r2.A00(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x031e }
            monitor-exit(r2)
            goto L_0x008d
        L_0x0148:
            java.lang.String r2 = "gcm.n.noui"
            boolean r2 = r11.A08(r2)     // Catch:{ all -> 0x0321 }
            if (r2 != 0) goto L_0x0255
            java.lang.String r2 = "keyguard"
            java.lang.Object r2 = r4.getSystemService(r2)     // Catch:{ all -> 0x0321 }
            android.app.KeyguardManager r2 = (android.app.KeyguardManager) r2     // Catch:{ all -> 0x0321 }
            boolean r2 = r2.inKeyguardRestrictedInputMode()     // Catch:{ all -> 0x0321 }
            r7 = 0
            if (r2 != 0) goto L_0x0198
            boolean r2 = X.C14320oy.A02()     // Catch:{ all -> 0x0321 }
            if (r2 != 0) goto L_0x016a
            r2 = 10
            android.os.SystemClock.sleep(r2)     // Catch:{ all -> 0x0321 }
        L_0x016a:
            int r12 = android.os.Process.myPid()     // Catch:{ all -> 0x0321 }
            java.lang.String r2 = "activity"
            java.lang.Object r2 = r4.getSystemService(r2)     // Catch:{ all -> 0x0321 }
            android.app.ActivityManager r2 = (android.app.ActivityManager) r2     // Catch:{ all -> 0x0321 }
            java.util.List r2 = r2.getRunningAppProcesses()     // Catch:{ all -> 0x0321 }
            if (r2 == 0) goto L_0x0198
            java.util.Iterator r10 = r2.iterator()     // Catch:{ all -> 0x0321 }
        L_0x0180:
            boolean r2 = r10.hasNext()     // Catch:{ all -> 0x0321 }
            if (r2 == 0) goto L_0x0198
            java.lang.Object r3 = r10.next()     // Catch:{ all -> 0x0321 }
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3     // Catch:{ all -> 0x0321 }
            int r2 = r3.pid     // Catch:{ all -> 0x0321 }
            if (r2 != r12) goto L_0x0180
            int r3 = r3.importance     // Catch:{ all -> 0x0321 }
            r2 = 100
            if (r3 != r2) goto L_0x0198
            goto L_0x025a
        L_0x0198:
            java.lang.String r2 = "gcm.n.image"
            java.lang.String r5 = r11.A06(r2)     // Catch:{ all -> 0x0321 }
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0321 }
            if (r2 != 0) goto L_0x01bc
            java.net.URL r2 = new java.net.URL     // Catch:{ MalformedURLException -> 0x01af }
            r2.<init>(r5)     // Catch:{ MalformedURLException -> 0x01af }
            X.54J r10 = new X.54J     // Catch:{ MalformedURLException -> 0x01af }
            r10.<init>(r2)     // Catch:{ MalformedURLException -> 0x01af }
            goto L_0x01be
        L_0x01af:
            java.lang.String r3 = "Not downloading image, bad URL: "
            java.lang.String r2 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0321 }
            java.lang.String r2 = X.C13680ns.A0g(r2, r3)     // Catch:{ all -> 0x0321 }
            android.util.Log.w(r0, r2)     // Catch:{ all -> 0x0321 }
        L_0x01bc:
            r10 = r13
            goto L_0x01d9
        L_0x01be:
            X.3IW r9 = new X.3IW     // Catch:{ all -> 0x0321 }
            r9.<init>(r10)     // Catch:{ all -> 0x0321 }
            java.lang.String r2 = "Executor must not be null"
            X.C13710nw.A02(r6, r2)     // Catch:{ all -> 0x0321 }
            X.0on r5 = new X.0on     // Catch:{ all -> 0x0321 }
            r5.<init>()     // Catch:{ all -> 0x0321 }
            r3 = 9
            com.facebook.redex.RunnableRunnableShape2S0200000_I0 r2 = new com.facebook.redex.RunnableRunnableShape2S0200000_I0     // Catch:{ all -> 0x0321 }
            r2.<init>(r9, r3, r5)     // Catch:{ all -> 0x0321 }
            r6.execute(r2)     // Catch:{ all -> 0x0321 }
            r10.A00 = r5     // Catch:{ all -> 0x0321 }
        L_0x01d9:
            X.4Ga r9 = X.C61993Bf.A01(r4, r11)     // Catch:{ all -> 0x0321 }
            X.03l r5 = r9.A00     // Catch:{ all -> 0x0321 }
            if (r10 == 0) goto L_0x0239
            X.0on r12 = r10.A00     // Catch:{ ExecutionException -> 0x0211, InterruptedException -> 0x0201, TimeoutException -> 0x0231 }
            X.C13710nw.A01(r12)     // Catch:{ ExecutionException -> 0x0211, InterruptedException -> 0x0201, TimeoutException -> 0x0231 }
            r2 = 5
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ ExecutionException -> 0x0211, InterruptedException -> 0x0201, TimeoutException -> 0x0231 }
            java.lang.Object r2 = X.C14310ox.A00(r12, r11, r2)     // Catch:{ ExecutionException -> 0x0211, InterruptedException -> 0x0201, TimeoutException -> 0x0231 }
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2     // Catch:{ ExecutionException -> 0x0211, InterruptedException -> 0x0201, TimeoutException -> 0x0231 }
            r5.A06(r2)     // Catch:{ ExecutionException -> 0x0211, InterruptedException -> 0x0201, TimeoutException -> 0x0231 }
            androidx.core.app.NotificationCompat$BigPictureStyle r3 = new androidx.core.app.NotificationCompat$BigPictureStyle     // Catch:{ ExecutionException -> 0x0211, InterruptedException -> 0x0201, TimeoutException -> 0x0231 }
            r3.<init>()     // Catch:{ ExecutionException -> 0x0211, InterruptedException -> 0x0201, TimeoutException -> 0x0231 }
            r3.A00 = r2     // Catch:{ ExecutionException -> 0x0211, InterruptedException -> 0x0201, TimeoutException -> 0x0231 }
            r2 = 1
            r3.A01 = r2     // Catch:{ ExecutionException -> 0x0211, InterruptedException -> 0x0201, TimeoutException -> 0x0231 }
            r5.A08(r3)     // Catch:{ ExecutionException -> 0x0211, InterruptedException -> 0x0201, TimeoutException -> 0x0231 }
            goto L_0x0239
        L_0x0201:
            java.lang.String r2 = "Interrupted while downloading image, showing notification without it"
            android.util.Log.w(r0, r2)     // Catch:{ all -> 0x0321 }
            r10.close()     // Catch:{ all -> 0x0321 }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0321 }
            r2.interrupt()     // Catch:{ all -> 0x0321 }
            goto L_0x0239
        L_0x0211:
            r2 = move-exception
            java.lang.Throwable r2 = r2.getCause()     // Catch:{ all -> 0x0321 }
            java.lang.String r10 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0321 }
            int r2 = r10.length()     // Catch:{ all -> 0x0321 }
            int r2 = r2 + 26
            java.lang.StringBuilder r3 = X.C13690nt.A0g(r2)     // Catch:{ all -> 0x0321 }
            java.lang.String r2 = "Failed to download image: "
            r3.append(r2)     // Catch:{ all -> 0x0321 }
            java.lang.String r2 = X.AnonymousClass000.A0h(r10, r3)     // Catch:{ all -> 0x0321 }
            android.util.Log.w(r0, r2)     // Catch:{ all -> 0x0321 }
            goto L_0x0239
        L_0x0231:
            java.lang.String r2 = "Failed to download image in time, showing notification without it"
            android.util.Log.w(r0, r2)     // Catch:{ all -> 0x0321 }
            r10.close()     // Catch:{ all -> 0x0321 }
        L_0x0239:
            boolean r2 = android.util.Log.isLoggable(r0, r8)     // Catch:{ all -> 0x0321 }
            if (r2 == 0) goto L_0x0244
            java.lang.String r2 = "Showing notification"
            android.util.Log.d(r0, r2)     // Catch:{ all -> 0x0321 }
        L_0x0244:
            java.lang.String r2 = "notification"
            java.lang.Object r4 = r4.getSystemService(r2)     // Catch:{ all -> 0x0321 }
            android.app.NotificationManager r4 = (android.app.NotificationManager) r4     // Catch:{ all -> 0x0321 }
            java.lang.String r3 = r9.A01     // Catch:{ all -> 0x0321 }
            android.app.Notification r2 = r5.A01()     // Catch:{ all -> 0x0321 }
            r4.notify(r3, r7, r2)     // Catch:{ all -> 0x0321 }
        L_0x0255:
            r6.shutdown()
            goto L_0x008d
        L_0x025a:
            r6.shutdown()
            boolean r2 = X.C616939y.A01(r5)
            if (r2 == 0) goto L_0x0268
            java.lang.String r2 = "_nf"
            X.C616939y.A00(r5, r2)
        L_0x0268:
            X.2sI r3 = new X.2sI
            r3.<init>(r9)
            boolean r2 = r4 instanceof com.obwhatsapp.push.GcmListenerService
            if (r2 == 0) goto L_0x008d
            com.obwhatsapp.push.GcmListenerService r4 = (com.obwhatsapp.push.GcmListenerService) r4
            java.util.Map r2 = r3.A02()
            X.01T r4 = r4.A00
            java.lang.Object r6 = r4.get()
            X.1A6 r6 = (X.AnonymousClass1A6) r6
            java.lang.String r4 = "id"
            java.lang.String r9 = X.C13690nt.A0e(r4, r2)
            java.lang.String r4 = "ip"
            java.lang.String r10 = X.C13690nt.A0e(r4, r2)
            java.lang.String r4 = "cl_sess"
            java.lang.String r11 = X.C13690nt.A0e(r4, r2)
            java.lang.String r4 = "mmsov"
            java.lang.String r12 = X.C13690nt.A0e(r4, r2)
            java.lang.String r4 = "fbips"
            java.lang.String r13 = X.C13690nt.A0e(r4, r2)
            java.lang.String r4 = "er_ri"
            java.lang.String r14 = X.C13690nt.A0e(r4, r2)
            java.lang.String r4 = "notify"
            java.lang.Object r5 = r2.get(r4)
            java.lang.String r4 = "1"
            boolean r20 = r4.equals(r5)
            java.lang.String r4 = "push_id"
            java.lang.String r15 = X.C13690nt.A0e(r4, r2)
            java.lang.String r4 = "push_event_id"
            java.lang.String r16 = X.C13690nt.A0e(r4, r2)
            java.lang.String r4 = "push_ts"
            java.lang.String r17 = X.C13690nt.A0e(r4, r2)
            int r4 = r3.A00()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            int r3 = r3.A01()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r3)
            java.lang.String r3 = "pn"
            java.lang.String r18 = X.C13690nt.A0e(r3, r2)
            r19 = 0
            r6.A00(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            goto L_0x008d
        L_0x02de:
            android.os.Bundle r6 = X.C13690nt.A0D()
            r6.putString(r9, r7)
            X.0pD r3 = X.C14460pD.A00(r4)
            monitor-enter(r3)
            int r2 = r3.A00     // Catch:{ all -> 0x0326 }
            int r1 = r2 + 1
            r3.A00 = r1     // Catch:{ all -> 0x0326 }
            monitor-exit(r3)
            X.3d5 r1 = new X.3d5
            r1.<init>(r2, r6)
            X.0on r1 = r3.A01(r1)
            goto L_0x006b
        L_0x02fc:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0302 }
            X.C14310ox.A00(r1, r2, r3)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0302 }
            return
        L_0x0302:
            r1 = move-exception
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r1 = r3.length()
            int r1 = r1 + 20
            java.lang.StringBuilder r2 = X.C13690nt.A0g(r1)
            java.lang.String r1 = "Message ack failed: "
            r2.append(r1)
            java.lang.String r1 = X.AnonymousClass000.A0h(r3, r2)
            android.util.Log.w(r0, r1)
            return
        L_0x031e:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0321:
            r0 = move-exception
            r6.shutdown()
            throw r0
        L_0x0326:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.A02(android.content.Intent):void");
    }
}
