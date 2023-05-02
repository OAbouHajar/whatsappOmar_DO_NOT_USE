package com.facebook.redex;

import X.C13720nx;
import X.C14130of;
import android.content.Context;
import android.os.PowerManager;
import com.google.firebase.iid.FirebaseInstanceId;

public class RunnableRunnableShape0S0300100_I0 implements Runnable {
    public long A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public RunnableRunnableShape0S0300100_I0(FirebaseInstanceId firebaseInstanceId, C14130of r6, long j2) {
        this.A04 = 0;
        this.A02 = firebaseInstanceId;
        this.A03 = r6;
        this.A00 = j2;
        PowerManager.WakeLock newWakeLock = ((PowerManager) A00().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.A01 = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    public RunnableRunnableShape0S0300100_I0(Object obj, Object obj2, Object obj3, int i2, long j2) {
        this.A04 = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A00 = j2;
    }

    public final Context A00() {
        C13720nx r0 = ((FirebaseInstanceId) this.A02).A01;
        r0.A02();
        return r0.A00;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0248, code lost:
        if (com.google.firebase.iid.FirebaseInstanceId.A03() == false) goto L_0x0250;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x024a, code lost:
        android.util.Log.d("FirebaseInstanceId", "subscribe operation succeeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r7 = (X.C14370p3) r1.A02.remove(java.lang.Integer.valueOf(r1.A00));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        r8 = r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0261, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:?, code lost:
        r12 = r8.A01;
        r13 = r12.getString("topic_operation_queue", "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:?, code lost:
        r15 = java.lang.String.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0277, code lost:
        if (r15.length() == 0) goto L_0x02a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0279, code lost:
        r0 = ",".concat(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0281, code lost:
        if (r13.startsWith(r0) == false) goto L_0x02b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0283, code lost:
        r2 = java.lang.String.valueOf(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x028b, code lost:
        if (r2.length() == 0) goto L_0x029a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x028d, code lost:
        r0 = ",".concat(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x029a, code lost:
        r0 = new java.lang.String(",");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02a0, code lost:
        r0 = new java.lang.String(",");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        r12.edit().putString("topic_operation_queue", r13.substring(r0.length())).apply();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:?, code lost:
        r1.A00++;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02b8, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02b9, code lost:
        if (r7 == null) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:?, code lost:
        r7.A01((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:?, code lost:
        r1 = new java.io.IOException("token not available");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02ca, code lost:
        r1 = new java.io.IOException("token not available");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02d2, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02d3, code lost:
        r2 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02de, code lost:
        if ("SERVICE_NOT_AVAILABLE".equals(r2.getMessage()) != false) goto L_0x02f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x02f0, code lost:
        if (r2.getMessage() == null) goto L_0x02f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x02f2, code lost:
        r0 = "Topic operation failed without exception message. Will retry Topic operation.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x02f6, code lost:
        r2 = r2.getMessage();
        r1 = new java.lang.StringBuilder(java.lang.String.valueOf(r2).length() + 53);
        r1.append("Topic operation failed: ");
        r1.append(r2);
        r1.append(". Will retry Topic operation.");
        r0 = r1.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x032d, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x035a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:?, code lost:
        r2 = r0.getMessage();
        r1 = new java.lang.StringBuilder(java.lang.String.valueOf(r2).length() + 93);
        r1.append("Topic sync or token retrieval failed on hard failure exceptions: ");
        r1.append(r2);
        r1.append(". Won't retry the operation.");
        android.util.Log.e("FirebaseInstanceId", r1.toString());
        ((com.google.firebase.iid.FirebaseInstanceId) r3.A02).A0A(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x06fa, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0707, code lost:
        if (X.C16680tS.A00().A01(A00()) != false) goto L_0x0709;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x0709, code lost:
        ((android.os.PowerManager.WakeLock) r3.A01).release();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0710, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:?, code lost:
        r11 = r2.split("!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01db, code lost:
        if (r11.length != 2) goto L_0x0250;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01dd, code lost:
        r8 = r11[0];
        r11 = r11[1];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        r7 = r8.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e7, code lost:
        if (r7 == 83) goto L_0x021f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01eb, code lost:
        if (r7 != 85) goto L_0x0250;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01f3, code lost:
        if (r8.equals("U") == false) goto L_0x0250;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01f5, code lost:
        r12 = com.google.firebase.iid.FirebaseInstanceId.A00(X.C14090ob.A00(r10), "*");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0201, code lost:
        if (r4.A0B(r12) != false) goto L_0x02c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0203, code lost:
        r4.A04(r4.A06.A06(com.google.firebase.iid.FirebaseInstanceId.A01(), r12.A01, r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0216, code lost:
        if (com.google.firebase.iid.FirebaseInstanceId.A03() == false) goto L_0x0250;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0218, code lost:
        android.util.Log.d("FirebaseInstanceId", "unsubscribe operation succeeded");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0225, code lost:
        if (r8.equals("S") == false) goto L_0x0250;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0227, code lost:
        r7 = com.google.firebase.iid.FirebaseInstanceId.A00(X.C14090ob.A00(r10), "*");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0233, code lost:
        if (r4.A0B(r7) != false) goto L_0x02ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0235, code lost:
        r4.A04(r4.A06.A05(com.google.firebase.iid.FirebaseInstanceId.A01(), r7.A01, r11));
     */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x0399  */
    /* JADX WARNING: Removed duplicated region for block: B:349:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r23 = this;
            r3 = r23
            int r0 = r3.A04
            switch(r0) {
                case 0: goto L_0x0063;
                case 1: goto L_0x03a1;
                case 2: goto L_0x05cc;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r6 = r3.A01
            X.1Rx r6 = (X.C27481Rx) r6
            java.lang.Object r4 = r3.A02
            com.whatsapp.jid.UserJid r4 = (com.whatsapp.jid.UserJid) r4
            java.lang.Object r8 = r3.A03
            X.1d1 r8 = (X.C30821d1) r8
            long r2 = r3.A00
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.of(r4)
            X.1Yb r1 = X.C28851Ya.A02(r0)
            X.1l7 r0 = X.C34941l7.A00
            java.lang.String r0 = r0.getRawString()
            X.1dH r7 = new X.1dH
            r7.<init>(r1, r0)
            X.11s r5 = r6.A01
            byte[] r1 = r8.A02
            X.3FS r0 = new X.3FS
            r0.<init>(r4, r6, r2)
            X.1d8 r0 = r5.A08(r0, r7, r1)
            int r3 = r0.A00
            if (r3 == 0) goto L_0x0062
            java.lang.String r1 = "axolotl error while decrypt-group-using-fast-fatchet; status="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r0 = -1005(0xfffffffffffffc13, float:NaN)
            r2 = 0
            if (r3 == r0) goto L_0x0053
            r0 = -1008(0xfffffffffffffc10, float:NaN)
            if (r3 != r0) goto L_0x0062
        L_0x0053:
            X.0yQ r1 = r6.A03
            X.1d4 r0 = r5.A07
            int r0 = r0.A01()
            byte[] r0 = X.C28641Wx.A02(r0)
            r1.A0S(r4, r0, r2)
        L_0x0062:
            return
        L_0x0063:
            X.0tS r1 = X.C16680tS.A00()
            android.content.Context r0 = r3.A00()
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0078
            java.lang.Object r0 = r3.A01
            android.os.PowerManager$WakeLock r0 = (android.os.PowerManager.WakeLock) r0
            r0.acquire()
        L_0x0078:
            r5 = 0
            java.lang.Object r4 = r3.A02     // Catch:{ IOException -> 0x035a }
            com.google.firebase.iid.FirebaseInstanceId r4 = (com.google.firebase.iid.FirebaseInstanceId) r4     // Catch:{ IOException -> 0x035a }
            r0 = 1
            r4.A0A(r0)     // Catch:{ IOException -> 0x035a }
            X.0ob r0 = r4.A03     // Catch:{ IOException -> 0x035a }
            int r0 = r0.A02()     // Catch:{ IOException -> 0x035a }
            if (r0 == 0) goto L_0x0356
            X.0tS r2 = X.C16680tS.A00()     // Catch:{ IOException -> 0x035a }
            android.content.Context r1 = r3.A00()     // Catch:{ IOException -> 0x035a }
            java.lang.Boolean r0 = r2.A01     // Catch:{ IOException -> 0x035a }
            if (r0 != 0) goto L_0x00a5
            java.lang.String r0 = "android.permission.ACCESS_NETWORK_STATE"
            int r1 = r1.checkCallingOrSelfPermission(r0)     // Catch:{ IOException -> 0x035a }
            r0 = 0
            if (r1 != 0) goto L_0x009f
            r0 = 1
        L_0x009f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IOException -> 0x035a }
            r2.A01 = r0     // Catch:{ IOException -> 0x035a }
        L_0x00a5:
            java.lang.Boolean r0 = r2.A00     // Catch:{ IOException -> 0x035a }
            boolean r0 = r0.booleanValue()     // Catch:{ IOException -> 0x035a }
            if (r0 != 0) goto L_0x00bb
            r0 = 3
            java.lang.String r1 = "FirebaseInstanceId"
            boolean r0 = android.util.Log.isLoggable(r1, r0)     // Catch:{ IOException -> 0x035a }
            if (r0 == 0) goto L_0x00bb
            java.lang.String r0 = "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest"
            android.util.Log.d(r1, r0)     // Catch:{ IOException -> 0x035a }
        L_0x00bb:
            java.lang.Boolean r0 = r2.A01     // Catch:{ IOException -> 0x035a }
            boolean r0 = r0.booleanValue()     // Catch:{ IOException -> 0x035a }
            if (r0 == 0) goto L_0x00dd
            android.content.Context r1 = r3.A00()     // Catch:{ IOException -> 0x035a }
            java.lang.String r0 = "connectivity"
            java.lang.Object r0 = r1.getSystemService(r0)     // Catch:{ IOException -> 0x035a }
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0     // Catch:{ IOException -> 0x035a }
            if (r0 == 0) goto L_0x0333
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()     // Catch:{ IOException -> 0x035a }
            if (r0 == 0) goto L_0x0333
            boolean r0 = r0.isConnected()     // Catch:{ IOException -> 0x035a }
            if (r0 == 0) goto L_0x0333
        L_0x00dd:
            java.lang.String r6 = "FirebaseInstanceId"
            X.0nx r10 = r4.A01     // Catch:{ IOException -> 0x035a }
            java.lang.String r0 = X.C14090ob.A00(r10)     // Catch:{ IOException -> 0x035a }
            java.lang.String r9 = "*"
            X.0oj r1 = com.google.firebase.iid.FirebaseInstanceId.A00(r0, r9)     // Catch:{ IOException -> 0x035a }
            boolean r0 = r4.A0B(r1)     // Catch:{ IOException -> 0x035a }
            if (r0 == 0) goto L_0x01b7
            java.lang.String r0 = X.C14090ob.A00(r10)     // Catch:{ IOException -> 0x016e, SecurityException -> 0x031b }
            java.lang.String r7 = r4.A05(r0, r9)     // Catch:{ IOException -> 0x016e, SecurityException -> 0x031b }
            if (r7 != 0) goto L_0x0102
            java.lang.String r0 = "Token retrieval failed: null"
            android.util.Log.e(r6, r0)     // Catch:{ IOException -> 0x016e, SecurityException -> 0x031b }
            goto L_0x0320
        L_0x0102:
            r2 = 3
            boolean r0 = android.util.Log.isLoggable(r6, r2)     // Catch:{ IOException -> 0x016e, SecurityException -> 0x031b }
            if (r0 == 0) goto L_0x010e
            java.lang.String r0 = "Token successfully retrieved"
            android.util.Log.d(r6, r0)     // Catch:{ IOException -> 0x016e, SecurityException -> 0x031b }
        L_0x010e:
            if (r1 == 0) goto L_0x0118
            java.lang.String r0 = r1.A01     // Catch:{ IOException -> 0x016e, SecurityException -> 0x031b }
            boolean r0 = r7.equals(r0)     // Catch:{ IOException -> 0x016e, SecurityException -> 0x031b }
            if (r0 != 0) goto L_0x01b7
        L_0x0118:
            java.lang.String r0 = "[DEFAULT]"
            r10.A02()     // Catch:{ IOException -> 0x016e, SecurityException -> 0x031b }
            java.lang.String r1 = r10.A04     // Catch:{ IOException -> 0x016e, SecurityException -> 0x031b }
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x016e, SecurityException -> 0x031b }
            if (r0 == 0) goto L_0x01b7
            boolean r0 = android.util.Log.isLoggable(r6, r2)     // Catch:{ IOException -> 0x016e, SecurityException -> 0x031b }
            if (r0 == 0) goto L_0x0141
            java.lang.String r2 = "Invoking onNewToken for app: "
            r10.A02()     // Catch:{ IOException -> 0x016e, SecurityException -> 0x031b }
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ IOException -> 0x016e, SecurityException -> 0x031b }
            int r0 = r1.length()     // Catch:{ IOException -> 0x016e, SecurityException -> 0x031b }
            if (r0 == 0) goto L_0x0168
            java.lang.String r0 = r2.concat(r1)     // Catch:{ IOException -> 0x016e, SecurityException -> 0x031b }
        L_0x013e:
            android.util.Log.d(r6, r0)     // Catch:{ IOException -> 0x016e, SecurityException -> 0x031b }
        L_0x0141:
            java.lang.String r0 = "com.google.firebase.messaging.NEW_TOKEN"
            android.content.Intent r8 = new android.content.Intent     // Catch:{ IOException -> 0x016e, SecurityException -> 0x031b }
            r8.<init>(r0)     // Catch:{ IOException -> 0x016e, SecurityException -> 0x031b }
            java.lang.String r0 = "token"
            r8.putExtra(r0, r7)     // Catch:{ IOException -> 0x016e, SecurityException -> 0x031b }
            android.content.Context r7 = r3.A00()     // Catch:{ IOException -> 0x016e, SecurityException -> 0x031b }
            java.lang.String r2 = "com.google.firebase.MESSAGING_EVENT"
            java.lang.Class<com.google.firebase.iid.FirebaseInstanceIdReceiver> r0 = com.google.firebase.iid.FirebaseInstanceIdReceiver.class
            android.content.Intent r1 = new android.content.Intent     // Catch:{ IOException -> 0x016e, SecurityException -> 0x031b }
            r1.<init>(r7, r0)     // Catch:{ IOException -> 0x016e, SecurityException -> 0x031b }
            r1.setAction(r2)     // Catch:{ IOException -> 0x016e, SecurityException -> 0x031b }
            java.lang.String r0 = "wrapped_intent"
            r1.putExtra(r0, r8)     // Catch:{ IOException -> 0x016e, SecurityException -> 0x031b }
            r7.sendBroadcast(r1)     // Catch:{ IOException -> 0x016e, SecurityException -> 0x031b }
            goto L_0x01b7
        L_0x0168:
            java.lang.String r0 = new java.lang.String     // Catch:{ IOException -> 0x016e, SecurityException -> 0x031b }
            r0.<init>(r2)     // Catch:{ IOException -> 0x016e, SecurityException -> 0x031b }
            goto L_0x013e
        L_0x016e:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()     // Catch:{ IOException -> 0x035a }
            java.lang.String r0 = "SERVICE_NOT_AVAILABLE"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x035a }
            if (r0 != 0) goto L_0x01b3
            java.lang.String r1 = r2.getMessage()     // Catch:{ IOException -> 0x035a }
            java.lang.String r0 = "INTERNAL_SERVER_ERROR"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x035a }
            if (r0 != 0) goto L_0x01b3
            java.lang.String r0 = r2.getMessage()     // Catch:{ IOException -> 0x035a }
            if (r0 != 0) goto L_0x02f5
            java.lang.String r2 = r2.getMessage()     // Catch:{ IOException -> 0x035a }
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x035a }
            int r0 = r0.length()     // Catch:{ IOException -> 0x035a }
            int r0 = r0 + 52
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x035a }
            r1.<init>(r0)     // Catch:{ IOException -> 0x035a }
            java.lang.String r0 = "Token retrieval failed: "
            r1.append(r0)     // Catch:{ IOException -> 0x035a }
            r1.append(r2)     // Catch:{ IOException -> 0x035a }
            java.lang.String r0 = ". Will retry token retrieval"
            r1.append(r0)     // Catch:{ IOException -> 0x035a }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x035a }
            goto L_0x031d
        L_0x01b3:
            java.lang.String r0 = "Token retrieval failed without exception message. Will retry token retrieval"
            goto L_0x031d
        L_0x01b7:
            java.lang.Object r1 = r3.A03     // Catch:{ IOException -> 0x035a }
            X.0of r1 = (X.C14130of) r1     // Catch:{ IOException -> 0x035a }
        L_0x01bb:
            monitor-enter(r1)     // Catch:{ IOException -> 0x035a }
            java.lang.String r2 = r1.A00()     // Catch:{ all -> 0x0330 }
            r12 = 1
            if (r2 != 0) goto L_0x01d2
            boolean r0 = com.google.firebase.iid.FirebaseInstanceId.A03()     // Catch:{ all -> 0x0330 }
            if (r0 == 0) goto L_0x01cf
            java.lang.String r0 = "topic sync succeeded"
            android.util.Log.d(r6, r0)     // Catch:{ all -> 0x0330 }
        L_0x01cf:
            monitor-exit(r1)     // Catch:{ all -> 0x0330 }
            goto L_0x0356
        L_0x01d2:
            monitor-exit(r1)     // Catch:{ all -> 0x0330 }
            java.lang.String r0 = "!"
            java.lang.String[] r11 = r2.split(r0)     // Catch:{ IOException -> 0x035a }
            int r7 = r11.length     // Catch:{ IOException -> 0x035a }
            r0 = 2
            if (r7 != r0) goto L_0x0250
            r8 = r11[r5]     // Catch:{ IOException -> 0x035a }
            r11 = r11[r12]     // Catch:{ IOException -> 0x035a }
            int r7 = r8.hashCode()     // Catch:{ IOException -> 0x02d3 }
            r0 = 83
            if (r7 == r0) goto L_0x021f
            r0 = 85
            if (r7 != r0) goto L_0x0250
            java.lang.String r0 = "U"
            boolean r0 = r8.equals(r0)     // Catch:{ IOException -> 0x02d3 }
            if (r0 == 0) goto L_0x0250
            java.lang.String r0 = X.C14090ob.A00(r10)     // Catch:{ IOException -> 0x02d3 }
            X.0oj r12 = com.google.firebase.iid.FirebaseInstanceId.A00(r0, r9)     // Catch:{ IOException -> 0x02d3 }
            boolean r0 = r4.A0B(r12)     // Catch:{ IOException -> 0x02d3 }
            if (r0 != 0) goto L_0x02c1
            java.lang.String r8 = com.google.firebase.iid.FirebaseInstanceId.A01()     // Catch:{ IOException -> 0x02d3 }
            X.0oe r7 = r4.A06     // Catch:{ IOException -> 0x02d3 }
            java.lang.String r0 = r12.A01     // Catch:{ IOException -> 0x02d3 }
            X.0on r0 = r7.A06(r8, r0, r11)     // Catch:{ IOException -> 0x02d3 }
            r4.A04(r0)     // Catch:{ IOException -> 0x02d3 }
            boolean r0 = com.google.firebase.iid.FirebaseInstanceId.A03()     // Catch:{ IOException -> 0x02d3 }
            if (r0 == 0) goto L_0x0250
            java.lang.String r0 = "unsubscribe operation succeeded"
            android.util.Log.d(r6, r0)     // Catch:{ IOException -> 0x02d3 }
            goto L_0x0250
        L_0x021f:
            java.lang.String r0 = "S"
            boolean r0 = r8.equals(r0)     // Catch:{ IOException -> 0x02d3 }
            if (r0 == 0) goto L_0x0250
            java.lang.String r0 = X.C14090ob.A00(r10)     // Catch:{ IOException -> 0x02d3 }
            X.0oj r7 = com.google.firebase.iid.FirebaseInstanceId.A00(r0, r9)     // Catch:{ IOException -> 0x02d3 }
            boolean r0 = r4.A0B(r7)     // Catch:{ IOException -> 0x02d3 }
            if (r0 != 0) goto L_0x02ca
            java.lang.String r8 = com.google.firebase.iid.FirebaseInstanceId.A01()     // Catch:{ IOException -> 0x02d3 }
            java.lang.String r7 = r7.A01     // Catch:{ IOException -> 0x02d3 }
            X.0oe r0 = r4.A06     // Catch:{ IOException -> 0x02d3 }
            X.0on r0 = r0.A05(r8, r7, r11)     // Catch:{ IOException -> 0x02d3 }
            r4.A04(r0)     // Catch:{ IOException -> 0x02d3 }
            boolean r0 = com.google.firebase.iid.FirebaseInstanceId.A03()     // Catch:{ IOException -> 0x02d3 }
            if (r0 == 0) goto L_0x0250
            java.lang.String r0 = "subscribe operation succeeded"
            android.util.Log.d(r6, r0)     // Catch:{ IOException -> 0x02d3 }
        L_0x0250:
            monitor-enter(r1)     // Catch:{ IOException -> 0x035a }
            java.util.Map r7 = r1.A02     // Catch:{ all -> 0x032d }
            int r0 = r1.A00     // Catch:{ all -> 0x032d }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x032d }
            java.lang.Object r7 = r7.remove(r0)     // Catch:{ all -> 0x032d }
            X.0p3 r7 = (X.C14370p3) r7     // Catch:{ all -> 0x032d }
            X.0od r8 = r1.A01     // Catch:{ all -> 0x032b }
            monitor-enter(r8)     // Catch:{ all -> 0x032b }
            android.content.SharedPreferences r12 = r8.A01     // Catch:{ all -> 0x0326 }
            java.lang.String r11 = "topic_operation_queue"
            java.lang.String r0 = ""
            java.lang.String r13 = r12.getString(r11, r0)     // Catch:{ all -> 0x0326 }
            java.lang.String r14 = ","
            java.lang.String r15 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0328 }
            int r0 = r15.length()     // Catch:{ all -> 0x0328 }
            if (r0 == 0) goto L_0x02a0
            java.lang.String r0 = r14.concat(r15)     // Catch:{ all -> 0x0328 }
        L_0x027d:
            boolean r0 = r13.startsWith(r0)     // Catch:{ all -> 0x0328 }
            if (r0 == 0) goto L_0x02b1
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0328 }
            int r0 = r2.length()     // Catch:{ all -> 0x0328 }
            if (r0 == 0) goto L_0x029a
            java.lang.String r0 = r14.concat(r2)     // Catch:{ all -> 0x0328 }
        L_0x0291:
            int r0 = r0.length()     // Catch:{ all -> 0x0328 }
            java.lang.String r2 = r13.substring(r0)     // Catch:{ all -> 0x0328 }
            goto L_0x02a6
        L_0x029a:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0328 }
            r0.<init>(r14)     // Catch:{ all -> 0x0328 }
            goto L_0x0291
        L_0x02a0:
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x0328 }
            r0.<init>(r14)     // Catch:{ all -> 0x0328 }
            goto L_0x027d
        L_0x02a6:
            android.content.SharedPreferences$Editor r0 = r12.edit()     // Catch:{ all -> 0x0326 }
            android.content.SharedPreferences$Editor r0 = r0.putString(r11, r2)     // Catch:{ all -> 0x0326 }
            r0.apply()     // Catch:{ all -> 0x0326 }
        L_0x02b1:
            monitor-exit(r8)     // Catch:{ all -> 0x0328 }
            int r0 = r1.A00     // Catch:{ all -> 0x032d }
            int r0 = r0 + 1
            r1.A00 = r0     // Catch:{ all -> 0x032d }
            monitor-exit(r1)     // Catch:{ all -> 0x032d }
            if (r7 == 0) goto L_0x01bb
            r0 = 0
            r7.A01(r0)     // Catch:{ IOException -> 0x035a }
            goto L_0x01bb
        L_0x02c1:
            java.lang.String r0 = "token not available"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x02d3 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x02d3 }
            goto L_0x02d2
        L_0x02ca:
            java.lang.String r0 = "token not available"
            java.io.IOException r1 = new java.io.IOException     // Catch:{ IOException -> 0x02d3 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x02d3 }
        L_0x02d2:
            throw r1     // Catch:{ IOException -> 0x02d3 }
        L_0x02d3:
            r2 = move-exception
            java.lang.String r1 = r2.getMessage()     // Catch:{ IOException -> 0x035a }
            java.lang.String r0 = "SERVICE_NOT_AVAILABLE"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x035a }
            if (r0 != 0) goto L_0x02f6
            java.lang.String r1 = r2.getMessage()     // Catch:{ IOException -> 0x035a }
            java.lang.String r0 = "INTERNAL_SERVER_ERROR"
            boolean r0 = r0.equals(r1)     // Catch:{ IOException -> 0x035a }
            if (r0 != 0) goto L_0x02f6
            java.lang.String r0 = r2.getMessage()     // Catch:{ IOException -> 0x035a }
            if (r0 != 0) goto L_0x02f5
            java.lang.String r0 = "Topic operation failed without exception message. Will retry Topic operation."
            goto L_0x031d
        L_0x02f5:
            throw r2     // Catch:{ IOException -> 0x035a }
        L_0x02f6:
            java.lang.String r2 = r2.getMessage()     // Catch:{ IOException -> 0x035a }
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ IOException -> 0x035a }
            int r0 = r0.length()     // Catch:{ IOException -> 0x035a }
            int r0 = r0 + 53
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x035a }
            r1.<init>(r0)     // Catch:{ IOException -> 0x035a }
            java.lang.String r0 = "Topic operation failed: "
            r1.append(r0)     // Catch:{ IOException -> 0x035a }
            r1.append(r2)     // Catch:{ IOException -> 0x035a }
            java.lang.String r0 = ". Will retry Topic operation."
            r1.append(r0)     // Catch:{ IOException -> 0x035a }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x035a }
            goto L_0x031d
        L_0x031b:
            java.lang.String r0 = "Token retrieval failed with SecurityException. Will retry token retrieval"
        L_0x031d:
            android.util.Log.e(r6, r0)     // Catch:{ IOException -> 0x035a }
        L_0x0320:
            long r0 = r3.A00     // Catch:{ IOException -> 0x035a }
            r4.A09(r0)     // Catch:{ IOException -> 0x035a }
            goto L_0x038b
        L_0x0326:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0328 }
        L_0x0328:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0328 }
            throw r0     // Catch:{ all -> 0x032b }
        L_0x032b:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x032d }
        L_0x032d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x032d }
            goto L_0x0332
        L_0x0330:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0330 }
        L_0x0332:
            throw r0     // Catch:{ IOException -> 0x035a }
        L_0x0333:
            X.0tX r2 = new X.0tX     // Catch:{ IOException -> 0x035a }
            r2.<init>(r3)     // Catch:{ IOException -> 0x035a }
            boolean r0 = com.google.firebase.iid.FirebaseInstanceId.A03()     // Catch:{ IOException -> 0x035a }
            if (r0 == 0) goto L_0x0345
            java.lang.String r1 = "FirebaseInstanceId"
            java.lang.String r0 = "Connectivity change received registered"
            android.util.Log.d(r1, r0)     // Catch:{ IOException -> 0x035a }
        L_0x0345:
            java.lang.String r0 = "android.net.conn.CONNECTIVITY_CHANGE"
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch:{ IOException -> 0x035a }
            r1.<init>(r0)     // Catch:{ IOException -> 0x035a }
            com.facebook.redex.RunnableRunnableShape0S0300100_I0 r0 = r2.A00     // Catch:{ IOException -> 0x035a }
            android.content.Context r0 = r0.A00()     // Catch:{ IOException -> 0x035a }
            r0.registerReceiver(r2, r1)     // Catch:{ IOException -> 0x035a }
            goto L_0x038b
        L_0x0356:
            r4.A0A(r5)     // Catch:{ IOException -> 0x035a }
            goto L_0x038b
        L_0x035a:
            r0 = move-exception
            java.lang.String r4 = "FirebaseInstanceId"
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x06fa }
            java.lang.String r0 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x06fa }
            int r0 = r0.length()     // Catch:{ all -> 0x06fa }
            int r0 = r0 + 93
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x06fa }
            r1.<init>(r0)     // Catch:{ all -> 0x06fa }
            java.lang.String r0 = "Topic sync or token retrieval failed on hard failure exceptions: "
            r1.append(r0)     // Catch:{ all -> 0x06fa }
            r1.append(r2)     // Catch:{ all -> 0x06fa }
            java.lang.String r0 = ". Won't retry the operation."
            r1.append(r0)     // Catch:{ all -> 0x06fa }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x06fa }
            android.util.Log.e(r4, r0)     // Catch:{ all -> 0x06fa }
            java.lang.Object r0 = r3.A02     // Catch:{ all -> 0x06fa }
            com.google.firebase.iid.FirebaseInstanceId r0 = (com.google.firebase.iid.FirebaseInstanceId) r0     // Catch:{ all -> 0x06fa }
            r0.A0A(r5)     // Catch:{ all -> 0x06fa }
        L_0x038b:
            X.0tS r1 = X.C16680tS.A00()
            android.content.Context r0 = r3.A00()
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0062
            java.lang.Object r0 = r3.A01
            android.os.PowerManager$WakeLock r0 = (android.os.PowerManager.WakeLock) r0
            r0.release()
            return
        L_0x03a1:
            java.lang.Object r10 = r3.A01
            X.0tD r10 = (X.C16530tD) r10
            java.lang.Object r9 = r3.A02
            byte[] r9 = (byte[]) r9
            java.lang.Object r11 = r3.A03
            byte[] r11 = (byte[]) r11
            X.0tE r8 = r10.A05
            android.content.SharedPreferences r0 = r8.A00()
            java.lang.String r15 = "blinding_factor_string"
            r6 = 0
            java.lang.String r0 = r0.getString(r15, r6)
            r5 = 8
            r12 = 0
            if (r0 == 0) goto L_0x0447
            byte[] r4 = android.util.Base64.decode(r0, r5)
        L_0x03c3:
            r1 = 4
            r7 = 0
            if (r4 != 0) goto L_0x03d3
            java.lang.String r0 = "ACSToken/processSignedBlindedToken blinding factor is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r8.A01(r1)
        L_0x03cf:
            r10.A02(r7)
            return
        L_0x03d3:
            monitor-enter(r10)
            org.whispersystems.curve25519.NativeVOPRFExtension r3 = r10.A01     // Catch:{ all -> 0x05c9 }
            if (r3 != 0) goto L_0x03df
            org.whispersystems.curve25519.NativeVOPRFExtension r3 = new org.whispersystems.curve25519.NativeVOPRFExtension     // Catch:{ all -> 0x05c9 }
            r3.<init>()     // Catch:{ all -> 0x05c9 }
            r10.A01 = r3     // Catch:{ all -> 0x05c9 }
        L_0x03df:
            monitor-exit(r10)     // Catch:{ all -> 0x05c9 }
            int r2 = r9.length
            int r1 = r4.length
            int r0 = r11.length
            r16 = r3
            r17 = r9
            r18 = r2
            r19 = r4
            r20 = r1
            r21 = r11
            r22 = r0
            byte[] r3 = r16.A01(r17, r18, r19, r20, r21, r22)
            if (r3 == 0) goto L_0x043e
            int r2 = r3.length
            r4 = 1
            if (r2 == r4) goto L_0x043e
            boolean r0 = r10.A0G
            android.content.SharedPreferences r1 = r8.A00()
            if (r0 == 0) goto L_0x0412
            java.lang.String r0 = "next_original_token_string"
        L_0x0405:
            java.lang.String r6 = r1.getString(r0, r6)
            if (r6 == 0) goto L_0x0435
            byte[] r5 = android.util.Base64.decode(r6, r5)
            if (r5 == 0) goto L_0x0435
            goto L_0x0415
        L_0x0412:
            java.lang.String r0 = "original_token_string"
            goto L_0x0405
        L_0x0415:
            java.lang.String r0 = "SHA-512"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0429 }
            int r0 = r5.length     // Catch:{ NoSuchAlgorithmException -> 0x0429 }
            r1.update(r5, r7, r0)     // Catch:{ NoSuchAlgorithmException -> 0x0429 }
            r1.update(r3, r7, r2)     // Catch:{ NoSuchAlgorithmException -> 0x0429 }
            byte[] r4 = r1.digest()     // Catch:{ NoSuchAlgorithmException -> 0x0429 }
            if (r4 == 0) goto L_0x042f
            goto L_0x044a
        L_0x0429:
            r1 = move-exception
            java.lang.String r0 = "ACSToken/computeSharedSecret got exception = "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x042f:
            r0 = 14
            r8.A01(r0)
            goto L_0x03cf
        L_0x0435:
            java.lang.String r0 = "ACSToken/processSignedBlindedToken originalToken is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r8.A01(r4)
            goto L_0x03cf
        L_0x043e:
            java.lang.String r0 = "ACSToken/processSignedBlindedToken failed to unblind the token"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r8.A01(r5)
            goto L_0x03cf
        L_0x0447:
            r4 = r6
            goto L_0x03c3
        L_0x044a:
            monitor-enter(r10)
            java.lang.String r3 = "redeem_count"
            r8.A02(r3, r7)     // Catch:{ all -> 0x05c6 }
            r2 = 10
            java.lang.String r1 = android.util.Base64.encodeToString(r4, r2)     // Catch:{ all -> 0x05c6 }
            java.lang.String r0 = "shared_secret_string"
            r8.A04(r0, r1)     // Catch:{ all -> 0x05c6 }
            X.0t3 r0 = r10.A07     // Catch:{ all -> 0x05c6 }
            long r0 = r0.A00()     // Catch:{ all -> 0x05c6 }
            r13 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r13
            java.lang.String r11 = "base_timestamp"
            r8.A03(r11, r0)     // Catch:{ all -> 0x05c6 }
            r8.A04(r15, r12)     // Catch:{ all -> 0x05c6 }
            boolean r0 = r10.A0G     // Catch:{ all -> 0x05c6 }
            if (r0 == 0) goto L_0x047d
            java.lang.String r0 = "original_token_string"
            r8.A04(r0, r6)     // Catch:{ all -> 0x05c6 }
            java.lang.String r0 = "next_original_token_string"
            r8.A04(r0, r12)     // Catch:{ all -> 0x05c6 }
            r10.A0G = r7     // Catch:{ all -> 0x05c6 }
        L_0x047d:
            long r17 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x05c6 }
            X.0tF r11 = r10.A04     // Catch:{ all -> 0x05c6 }
            r0 = 0
            long r15 = r17 - r0
            long r0 = r10.A0D     // Catch:{ all -> 0x05c6 }
            long r17 = r17 - r0
            int r0 = r10.A0B     // Catch:{ all -> 0x05c6 }
            long r0 = (long) r0     // Catch:{ all -> 0x05c6 }
            int r12 = r10.A02     // Catch:{ all -> 0x05c6 }
            r14 = 1
            X.0tG r13 = new X.0tG     // Catch:{ all -> 0x05c6 }
            r13.<init>()     // Catch:{ all -> 0x05c6 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x05c6 }
            r13.A03 = r14     // Catch:{ all -> 0x05c6 }
            java.lang.Long r14 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x05c6 }
            r13.A04 = r14     // Catch:{ all -> 0x05c6 }
            java.lang.Long r14 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x05c6 }
            r13.A06 = r14     // Catch:{ all -> 0x05c6 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x05c6 }
            r13.A05 = r0     // Catch:{ all -> 0x05c6 }
            X.0tH r0 = r11.A00     // Catch:{ all -> 0x05c6 }
            boolean r1 = r0.A00     // Catch:{ all -> 0x05c6 }
            r0 = 2
            if (r1 == 0) goto L_0x04b6
            r0 = 1
        L_0x04b6:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x05c6 }
            r13.A01 = r0     // Catch:{ all -> 0x05c6 }
            X.0tK r0 = r11.A01     // Catch:{ all -> 0x05c6 }
            boolean r0 = r0.A08()     // Catch:{ all -> 0x05c6 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x05c6 }
            r13.A00 = r0     // Catch:{ all -> 0x05c6 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch:{ all -> 0x05c6 }
            r13.A02 = r0     // Catch:{ all -> 0x05c6 }
            X.0t9 r12 = r11.A02     // Catch:{ all -> 0x05c6 }
            r12.A06(r13)     // Catch:{ all -> 0x05c6 }
            r0 = 0
            r10.A0E = r0     // Catch:{ all -> 0x05c6 }
            r10.A0H = r0     // Catch:{ all -> 0x05c6 }
            r10.A0B = r7     // Catch:{ all -> 0x05c6 }
            r10.A0F = r7     // Catch:{ all -> 0x05c6 }
            r0 = 0
            r10.A0D = r0     // Catch:{ all -> 0x05c6 }
            r8.A01(r7)     // Catch:{ all -> 0x05c6 }
            X.0tL r11 = new X.0tL     // Catch:{ all -> 0x05c6 }
            r11.<init>(r5, r4, r7)     // Catch:{ all -> 0x05c6 }
            android.content.SharedPreferences r1 = r8.A00()     // Catch:{ all -> 0x05c6 }
            r0 = -1
            int r7 = r1.getInt(r3, r0)     // Catch:{ all -> 0x05c6 }
            X.0pd r5 = r10.A08     // Catch:{ all -> 0x05c6 }
            r1 = 1143(0x477, float:1.602E-42)
            X.0tM r0 = X.C16620tM.A02     // Catch:{ all -> 0x05c6 }
            boolean r0 = r5.A0E(r0, r1)     // Catch:{ all -> 0x05c6 }
            if (r0 == 0) goto L_0x0525
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05c6 }
            r1.<init>()     // Catch:{ all -> 0x05c6 }
            java.lang.String r0 = android.util.Base64.encodeToString(r9, r2)     // Catch:{ all -> 0x05c6 }
            r1.append(r0)     // Catch:{ all -> 0x05c6 }
            java.lang.String r0 = "+"
            r1.append(r0)     // Catch:{ all -> 0x05c6 }
            java.lang.String r0 = android.util.Base64.encodeToString(r4, r2)     // Catch:{ all -> 0x05c6 }
            r1.append(r0)     // Catch:{ all -> 0x05c6 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x05c6 }
            X.0tN r0 = new X.0tN     // Catch:{ all -> 0x05c6 }
            r0.<init>()     // Catch:{ all -> 0x05c6 }
            r0.A01 = r1     // Catch:{ all -> 0x05c6 }
            r0.A00 = r6     // Catch:{ all -> 0x05c6 }
            r12.A06(r0)     // Catch:{ all -> 0x05c6 }
        L_0x0525:
            java.util.concurrent.CopyOnWriteArrayList r0 = r10.A00     // Catch:{ all -> 0x05c6 }
            java.util.Iterator r13 = r0.iterator()     // Catch:{ all -> 0x05c6 }
        L_0x052b:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x05c6 }
            if (r0 == 0) goto L_0x05c1
            java.lang.Object r9 = r13.next()     // Catch:{ all -> 0x05c6 }
            X.0tO r9 = (X.C16640tO) r9     // Catch:{ all -> 0x05c6 }
            java.lang.String r6 = r10.A0A     // Catch:{ all -> 0x05c6 }
            java.lang.ref.WeakReference r0 = r9.A02     // Catch:{ all -> 0x05c6 }
            java.lang.Object r12 = r0.get()     // Catch:{ all -> 0x05c6 }
            X.0tP r12 = (X.C16650tP) r12     // Catch:{ all -> 0x05c6 }
            if (r12 == 0) goto L_0x05b5
            byte[] r5 = r11.A01     // Catch:{ Exception -> 0x05a0 }
            if (r5 == 0) goto L_0x0584
            byte[] r0 = r11.A02     // Catch:{ Exception -> 0x05a0 }
            if (r0 == 0) goto L_0x0584
            X.0tQ r0 = r9.A03     // Catch:{ Exception -> 0x05a0 }
            java.lang.String r4 = r0.A00(r11)     // Catch:{ Exception -> 0x05a0 }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x05a0 }
            if (r0 == 0) goto L_0x055c
            r0 = 2
            r12.A06(r0)     // Catch:{ Exception -> 0x05a0 }
            goto L_0x05b5
        L_0x055c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x05a0 }
            r1.<init>()     // Catch:{ Exception -> 0x05a0 }
            java.lang.String r0 = android.util.Base64.encodeToString(r5, r2)     // Catch:{ Exception -> 0x05a0 }
            r1.append(r0)     // Catch:{ Exception -> 0x05a0 }
            java.lang.String r0 = "+"
            r1.append(r0)     // Catch:{ Exception -> 0x05a0 }
            r1.append(r4)     // Catch:{ Exception -> 0x05a0 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x05a0 }
            X.0tT r0 = r12.A06     // Catch:{ Exception -> 0x05a0 }
            X.0tU r0 = r0.A02     // Catch:{ Exception -> 0x05a0 }
            boolean r0 = r0.isCancelled()     // Catch:{ Exception -> 0x05a0 }
            if (r0 != 0) goto L_0x05b5
            r12.A01 = r1     // Catch:{ Exception -> 0x05a0 }
            r12.A05()     // Catch:{ Exception -> 0x05a0 }
            goto L_0x05b5
        L_0x0584:
            int r4 = r11.A00     // Catch:{ Exception -> 0x05a0 }
            X.0tT r0 = r12.A06     // Catch:{ Exception -> 0x05a0 }
            X.0tU r0 = r0.A02     // Catch:{ Exception -> 0x05a0 }
            boolean r0 = r0.isCancelled()     // Catch:{ Exception -> 0x05a0 }
            if (r0 != 0) goto L_0x05b5
            X.0tV r0 = r12.A04     // Catch:{ Exception -> 0x05a0 }
            if (r0 == 0) goto L_0x0597
            r12.A05()     // Catch:{ Exception -> 0x05a0 }
        L_0x0597:
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x05a0 }
            r12.A08(r1, r0)     // Catch:{ Exception -> 0x05a0 }
            goto L_0x05b5
        L_0x05a0:
            java.lang.String r0 = "ACSTokenProviderImpl/ACSTokenListener/onNewTokenIssued Error while fetching ACS token"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x05bc }
            X.0tQ r0 = r9.A03     // Catch:{ all -> 0x05bc }
            X.0so r5 = r0.A00     // Catch:{ all -> 0x05bc }
            java.lang.String r4 = "ACSTokenProviderImpl/ACSTokenListener/onNewTokenIssued"
            java.lang.String r1 = "Error while fetching ACS token"
            r0 = 1
            r5.AcB(r4, r1, r0)     // Catch:{ all -> 0x05bc }
            r0 = 5
            r12.A06(r0)     // Catch:{ all -> 0x05bc }
        L_0x05b5:
            r9.A00(r6)     // Catch:{ all -> 0x05c6 }
            int r7 = r7 + 1
            goto L_0x052b
        L_0x05bc:
            r0 = move-exception
            r9.A00(r6)     // Catch:{ all -> 0x05c6 }
            throw r0     // Catch:{ all -> 0x05c6 }
        L_0x05c1:
            r8.A02(r3, r7)     // Catch:{ all -> 0x05c6 }
            monitor-exit(r10)     // Catch:{ all -> 0x05c6 }
            return
        L_0x05c6:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x05c6 }
            throw r0
        L_0x05c9:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x05c9 }
            throw r0
        L_0x05cc:
            java.lang.Object r2 = r3.A01
            X.0t0 r2 = (X.C16420t0) r2
            java.lang.Object r10 = r3.A02
            byte[] r10 = (byte[]) r10
            java.lang.Object r14 = r3.A03
            byte[] r14 = (byte[]) r14
            X.0t1 r1 = r2.A05
            android.content.SharedPreferences r0 = r1.A00()
            java.lang.String r6 = "blinding_factor"
            r12 = 0
            java.lang.String r0 = r0.getString(r6, r12)
            r4 = 8
            r5 = 0
            if (r0 == 0) goto L_0x05ee
            byte[] r12 = android.util.Base64.decode(r0, r4)
        L_0x05ee:
            r3 = 4
            r0 = 0
            if (r12 != 0) goto L_0x05fe
            java.lang.String r4 = "PrivateStatsToken/processSignedBlindedToken blindingFactor is null"
            com.whatsapp.util.Log.e((java.lang.String) r4)
            r1.A03(r3)
        L_0x05fa:
            r2.A06(r0, r3)
            return
        L_0x05fe:
            X.0t3 r8 = r2.A03
            android.os.SystemClock.elapsedRealtime()
            org.whispersystems.curve25519.NativeVOPRFExtension r9 = r2.A00
            if (r9 != 0) goto L_0x060e
            org.whispersystems.curve25519.NativeVOPRFExtension r9 = new org.whispersystems.curve25519.NativeVOPRFExtension
            r9.<init>()
            r2.A00 = r9
        L_0x060e:
            int r11 = r10.length
            int r13 = r12.length
            int r15 = r14.length
            byte[] r12 = r9.A01(r10, r11, r12, r13, r14, r15)
            android.os.SystemClock.elapsedRealtime()
            if (r12 == 0) goto L_0x0662
            int r11 = r12.length
            r14 = 1
            if (r11 == r14) goto L_0x0662
            r7 = 2
            boolean r9 = r2.A0E
            android.content.SharedPreferences r10 = r1.A00()
            if (r9 == 0) goto L_0x0636
            java.lang.String r9 = "next_original_token"
        L_0x0629:
            java.lang.String r9 = r10.getString(r9, r5)
            if (r9 == 0) goto L_0x0659
            byte[] r13 = android.util.Base64.decode(r9, r4)
            if (r13 == 0) goto L_0x0659
            goto L_0x0639
        L_0x0636:
            java.lang.String r9 = "original_token"
            goto L_0x0629
        L_0x0639:
            java.lang.String r4 = "SHA-512"
            java.security.MessageDigest r10 = java.security.MessageDigest.getInstance(r4)     // Catch:{ NoSuchAlgorithmException -> 0x064d }
            int r4 = r13.length     // Catch:{ NoSuchAlgorithmException -> 0x064d }
            r10.update(r13, r0, r4)     // Catch:{ NoSuchAlgorithmException -> 0x064d }
            r10.update(r12, r0, r11)     // Catch:{ NoSuchAlgorithmException -> 0x064d }
            byte[] r4 = r10.digest()     // Catch:{ NoSuchAlgorithmException -> 0x064d }
            if (r4 == 0) goto L_0x0653
            goto L_0x066b
        L_0x064d:
            r5 = move-exception
            java.lang.String r4 = "PrivateStatsToken/computeSharedSecret got exception = "
            com.whatsapp.util.Log.e(r4, r5)
        L_0x0653:
            r4 = 14
            r1.A03(r4)
            goto L_0x05fa
        L_0x0659:
            java.lang.String r4 = "PrivateStatsToken/processSignedBlindedToken originalToken is null"
            com.whatsapp.util.Log.e((java.lang.String) r4)
            r1.A03(r14)
            goto L_0x05fa
        L_0x0662:
            java.lang.String r5 = "PrivateStatsToken/processSignedBlindedToken failed to unblind the token"
            com.whatsapp.util.Log.e((java.lang.String) r5)
            r1.A03(r4)
            goto L_0x05fa
        L_0x066b:
            monitor-enter(r2)
            r1.A02(r0)     // Catch:{ all -> 0x06f7 }
            r3 = 10
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r3)     // Catch:{ all -> 0x06f7 }
            java.lang.String r3 = "shared_secret"
            r1.A05(r3, r4)     // Catch:{ all -> 0x06f7 }
            X.0s5 r4 = r2.A01     // Catch:{ all -> 0x06f7 }
            X.0tC r3 = X.C15910s6.A07     // Catch:{ all -> 0x06f7 }
            int r10 = r4.A02(r3)     // Catch:{ all -> 0x06f7 }
            r4 = 10800(0x2a30, float:1.5134E-41)
            java.util.Random r3 = new java.util.Random     // Catch:{ all -> 0x06f7 }
            r3.<init>()     // Catch:{ all -> 0x06f7 }
            int r3 = r3.nextInt(r4)     // Catch:{ all -> 0x06f7 }
            int r10 = r10 - r3
            long r3 = (long) r10     // Catch:{ all -> 0x06f7 }
            java.lang.String r10 = "time_to_live"
            r1.A04(r10, r3)     // Catch:{ all -> 0x06f7 }
            long r3 = r8.A00()     // Catch:{ all -> 0x06f7 }
            r10 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r10
            java.lang.String r8 = "base_timestamp"
            r1.A04(r8, r3)     // Catch:{ all -> 0x06f7 }
            r1.A05(r6, r5)     // Catch:{ all -> 0x06f7 }
            boolean r3 = r2.A0E     // Catch:{ all -> 0x06f7 }
            if (r3 == 0) goto L_0x06b5
            java.lang.String r3 = "original_token"
            r1.A05(r3, r9)     // Catch:{ all -> 0x06f7 }
            java.lang.String r3 = "next_original_token"
            r1.A05(r3, r5)     // Catch:{ all -> 0x06f7 }
            r2.A0E = r0     // Catch:{ all -> 0x06f7 }
        L_0x06b5:
            long r17 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x06f7 }
            X.0t5 r13 = r2.A04     // Catch:{ all -> 0x06f7 }
            long r3 = r2.A0A     // Catch:{ all -> 0x06f7 }
            long r15 = r17 - r3
            long r3 = r2.A0B     // Catch:{ all -> 0x06f7 }
            long r17 = r17 - r3
            int r3 = r2.A09     // Catch:{ all -> 0x06f7 }
            long r3 = (long) r3     // Catch:{ all -> 0x06f7 }
            r19 = r3
            r13.A01(r14, r15, r17, r19)     // Catch:{ all -> 0x06f7 }
            r2.A0C = r5     // Catch:{ all -> 0x06f7 }
            r2.A0F = r5     // Catch:{ all -> 0x06f7 }
            r2.A09 = r0     // Catch:{ all -> 0x06f7 }
            r2.A0D = r0     // Catch:{ all -> 0x06f7 }
            r3 = 0
            r2.A0A = r3     // Catch:{ all -> 0x06f7 }
            r2.A0B = r3     // Catch:{ all -> 0x06f7 }
            android.content.SharedPreferences r6 = r1.A00()     // Catch:{ all -> 0x06f7 }
            java.lang.String r5 = "first_token_stage"
            int r5 = r6.getInt(r5, r0)     // Catch:{ all -> 0x06f7 }
            if (r5 != r14) goto L_0x06f2
            r1.A01(r7)     // Catch:{ all -> 0x06f7 }
            java.lang.String r5 = "first_token_request_timestamp"
            r1.A04(r5, r3)     // Catch:{ all -> 0x06f7 }
            java.lang.String r5 = "first_token_delay_time"
            r1.A04(r5, r3)     // Catch:{ all -> 0x06f7 }
        L_0x06f2:
            r1.A03(r0)     // Catch:{ all -> 0x06f7 }
            monitor-exit(r2)     // Catch:{ all -> 0x06f7 }
            return
        L_0x06f7:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x06f7 }
            throw r0
        L_0x06fa:
            r2 = move-exception
            X.0tS r1 = X.C16680tS.A00()
            android.content.Context r0 = r3.A00()
            boolean r0 = r1.A01(r0)
            if (r0 == 0) goto L_0x0710
            java.lang.Object r0 = r3.A01
            android.os.PowerManager$WakeLock r0 = (android.os.PowerManager.WakeLock) r0
            r0.release()
        L_0x0710:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.redex.RunnableRunnableShape0S0300100_I0.run():void");
    }
}
