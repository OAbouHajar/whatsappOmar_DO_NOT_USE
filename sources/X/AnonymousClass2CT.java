package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.2CT  reason: invalid class name */
public final class AnonymousClass2CT extends Handler implements C34511kO {
    public final /* synthetic */ C41391vi A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2CT(C41391vi r2) {
        super(r2.getLooper());
        this.A00 = r2;
    }

    public void AdO(UserJid userJid, AnonymousClass28H r6, String str, boolean z2, boolean z3) {
        String obj;
        StringBuilder sb = new StringBuilder("xmpp/connection/send/connect/");
        if (z3) {
            obj = "active";
        } else {
            StringBuilder sb2 = new StringBuilder("passive ");
            sb2.append(this.A00.A0x.A00());
            obj = sb2.toString();
        }
        sb.append(obj);
        Log.i(sb.toString());
        removeMessages(0);
        Message obtainMessage = obtainMessage(0);
        Bundle data = obtainMessage.getData();
        data.putString("jid", userJid == null ? null : userJid.getRawString());
        data.putString("ipaddress", str);
        data.putBoolean("available", z2);
        data.putBoolean("active_connection", z3);
        obtainMessage.obj = r6;
        obtainMessage.sendToTarget();
    }

    public void AdP(boolean z2) {
        int i2 = 1;
        if (z2) {
            i2 = 2;
        }
        hasMessages(0);
        hasMessages(i2);
        removeMessages(i2);
        removeMessages(0);
        Message obtainMessage = obtainMessage(i2);
        obtainMessage.getData().putLong("requestTime", SystemClock.uptimeMillis());
        obtainMessage.sendToTarget();
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockSplitter
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find block by offset: 0x1423 in list []
        	at jadx.core.utils.BlockUtils.getBlockByOffset(BlockUtils.java:44)
        	at jadx.core.dex.instructions.SwitchNode.initBlocks(SwitchNode.java:64)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.lambda$initBlocksInTargetNodes$0(BlockSplitter.java:71)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.initBlocksInTargetNodes(BlockSplitter.java:68)
        	at jadx.core.dex.visitors.blocksmaker.BlockSplitter.visit(BlockSplitter.java:53)
        */
    public void handleMessage(android.os.Message r90) {
        /*
            r89 = this;
            r4 = r90
            int r0 = r4.what
            java.lang.String r2 = "requestTime"
            r1 = r89
            switch(r0) {
                case 0: goto L_0x000c;
                case 1: goto L_0x00d9;
                case 2: goto L_0x00dd;
                case 3: goto L_0x0113;
                case 4: goto L_0x0099;
                case 5: goto L_0x0120;
                case 6: goto L_0x0129;
                case 7: goto L_0x00b9;
                case 8: goto L_0x013e;
                default: goto L_0x000b;
            }
        L_0x000b:
            return
        L_0x000c:
            java.lang.String r0 = "xmpp/connection/recv/connect"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.os.Bundle r2 = r4.getData()
            java.lang.String r0 = "jid"
            java.lang.String r0 = r2.getString(r0)
            com.whatsapp.jid.UserJid r27 = com.whatsapp.jid.UserJid.getNullable(r0)
            X.1vi r0 = r1.A00
            java.lang.String r1 = "ipaddress"
            java.lang.String r46 = r2.getString(r1)
            java.lang.String r1 = "available"
            boolean r87 = r2.getBoolean(r1)
            java.lang.String r1 = "active_connection"
            boolean r25 = r2.getBoolean(r1)
            java.lang.Object r1 = r4.obj
            r44 = r1
            r1 = r44
            X.28H r1 = (X.AnonymousClass28H) r1
            r44 = r1
            java.lang.String r45 = "xmpp/connection/socket/disconnect "
            java.lang.String r48 = "xmpp/connection/socket/closed"
            X.0ys r1 = r0.A0L
            boolean r16 = r1.A02()
            r2 = 0
            r4 = 1
            java.lang.Integer r43 = java.lang.Integer.valueOf(r4)
            if (r27 != 0) goto L_0x0055
            r1 = 0
            if (r16 == 0) goto L_0x0056
        L_0x0055:
            r1 = 1
        L_0x0056:
            X.AnonymousClass00B.A0F(r1)
            X.2CO r1 = r0.A0d
            r88 = r1
            boolean r1 = r1.A00
            if (r1 != 0) goto L_0x000b
            X.0xR r3 = r0.A0F
            boolean r1 = r3.A03()
            if (r1 == 0) goto L_0x0078
            java.lang.String r1 = "xmpp/connection/connect/not-allowed/clock"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            X.2CN r1 = r0.A0b
            android.os.Handler r1 = (android.os.Handler) r1
            r0 = 6
        L_0x0074:
            r1.sendEmptyMessage(r0)
            return
        L_0x0078:
            if (r16 != 0) goto L_0x0087
            X.0xa r1 = r0.A0w
            boolean r1 = r1.A00
            if (r1 == 0) goto L_0x0087
            java.lang.String r0 = "xmpp/connection/connect/not-allowed/login-failed"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0087:
            boolean r1 = r3.A02()
            if (r1 == 0) goto L_0x0145
            java.lang.String r1 = "xmpp/connection/connect/not-allowed/software-expired"
            com.whatsapp.util.Log.w((java.lang.String) r1)
            X.2CN r1 = r0.A0b
            android.os.Handler r1 = (android.os.Handler) r1
            r0 = 7
            goto L_0x0074
        L_0x0099:
            X.1vi r2 = r1.A00
            X.2CU r1 = r2.A04
            android.os.Message r0 = android.os.Message.obtain(r4)
            android.os.Handler r1 = (android.os.Handler) r1
            r3 = 2
            r0.what = r3
            r1.sendMessage(r0)
            int r1 = X.C34501kN.A00(r4)
            r0 = 37
            if (r1 != r0) goto L_0x000b
            X.2bf r2 = r2.A03
            r0 = 32000(0x7d00, double:1.581E-319)
            r2.sendEmptyMessageDelayed(r3, r0)
            return
        L_0x00b9:
            X.1vi r4 = r1.A00
            X.2CU r3 = r4.A04
            r2 = 0
            r1 = 0
            r0 = 24
            android.os.Message r1 = android.os.Message.obtain(r2, r1, r0, r1)
            android.os.Handler r3 = (android.os.Handler) r3
            r0 = 2
            r1.what = r0
            r3.sendMessage(r1)
            X.129 r1 = r4.A0A
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x000b
            r1.A01()
            return
        L_0x00d9:
            X.1vi r7 = r1.A00
            r6 = 0
            goto L_0x00e0
        L_0x00dd:
            X.1vi r7 = r1.A00
            r6 = 1
        L_0x00e0:
            android.os.Bundle r0 = r4.getData()
            long r4 = r0.getLong(r2)
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x010f
            long r2 = r7.A00
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x010f
            java.lang.String r0 = "xmpp/connection/recv/disconnect/skip disconnectRequestTime:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r1.append(r4)
            java.lang.String r0 = " lastConnectedTime:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x010f:
            r7.A06(r6)
            return
        L_0x0113:
            X.1vi r2 = r1.A00
            X.2CO r1 = r2.A0f
            r0 = 1
            r1.A00(r0)
            r0 = 0
            r2.A06(r0)
            return
        L_0x0120:
            X.1vi r0 = r1.A00
            X.2CU r3 = r0.A04
            r2 = 0
            r1 = 0
            r0 = 22
            goto L_0x0131
        L_0x0129:
            X.1vi r0 = r1.A00
            X.2CU r3 = r0.A04
            r2 = 0
            r1 = 0
            r0 = 23
        L_0x0131:
            android.os.Message r1 = android.os.Message.obtain(r2, r1, r0, r1)
            android.os.Handler r3 = (android.os.Handler) r3
            r0 = 2
            r1.what = r0
            r3.sendMessage(r1)
            return
        L_0x013e:
            X.1vi r1 = r1.A00
            r0 = 1
            r1.A06(r0)
            return
        L_0x0145:
            java.lang.String r1 = "xmpp/connection/connect"
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.2CN r1 = r0.A0b
            r49 = r1
            r1 = r49
            X.2CM r1 = (X.AnonymousClass2CM) r1
            r49 = r1
            r1.sendEmptyMessage(r4)
            X.2be r1 = r0.A01
            if (r1 == 0) goto L_0x0167
            java.net.Socket r1 = r1.A00
            boolean r1 = r1.isClosed()
            if (r1 != 0) goto L_0x0167
            r0.A04()
        L_0x0167:
            X.19u r1 = r0.A0c
            r28 = r1
            monitor-enter(r28)
            X.AnonymousClass00B.A00()     // Catch:{ all -> 0x1718 }
            X.0tz r1 = r1.A02     // Catch:{ all -> 0x1718 }
            android.content.Context r8 = r1.A00     // Catch:{ all -> 0x1718 }
            java.io.File r3 = r8.getFilesDir()     // Catch:{ all -> 0x1718 }
            java.lang.String r7 = "fbips"     // Catch:{ all -> 0x1718 }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x1718 }
            r1.<init>(r3, r7)     // Catch:{ all -> 0x1718 }
            boolean r1 = r1.canRead()     // Catch:{ all -> 0x1718 }
            if (r1 == 0) goto L_0x0246     // Catch:{ all -> 0x1718 }
            java.io.File r3 = r8.getFilesDir()     // Catch:{ IOException | JSONException -> 0x0233 }
            java.io.File r1 = new java.io.File     // Catch:{ IOException | JSONException -> 0x0233 }
            r1.<init>(r3, r7)     // Catch:{ IOException | JSONException -> 0x0233 }
            byte[] r1 = X.C29301aP.A00(r1)     // Catch:{ IOException | JSONException -> 0x0233 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ IOException | JSONException -> 0x0233 }
            r3.<init>()     // Catch:{ IOException | JSONException -> 0x0233 }
            java.lang.String r5 = new java.lang.String     // Catch:{ IOException | JSONException -> 0x0233 }
            r5.<init>(r1)     // Catch:{ IOException | JSONException -> 0x0233 }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ IOException | JSONException -> 0x0233 }
            r1.<init>(r5)     // Catch:{ IOException | JSONException -> 0x0233 }
            org.json.JSONArray r6 = r1.getJSONArray(r7)     // Catch:{ IOException | JSONException -> 0x0233 }
            r5 = 0     // Catch:{ IOException | JSONException -> 0x0233 }
        L_0x01a5:
            int r1 = r6.length()     // Catch:{ IOException | JSONException -> 0x0233 }
            if (r5 >= r1) goto L_0x01ed     // Catch:{ IOException | JSONException -> 0x0233 }
            org.json.JSONObject r9 = r6.getJSONObject(r5)     // Catch:{ IOException | JSONException -> 0x0233 }
            java.lang.String r1 = "exp"     // Catch:{ IOException | JSONException -> 0x0233 }
            long r10 = r9.getLong(r1)     // Catch:{ IOException | JSONException -> 0x0233 }
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch:{ IOException | JSONException -> 0x0233 }
            java.lang.String r1 = "ip"     // Catch:{ IOException | JSONException -> 0x0233 }
            java.lang.String r1 = r9.getString(r1)     // Catch:{ IOException | JSONException -> 0x0233 }
            java.net.InetAddress r12 = java.net.InetAddress.getByName(r1)     // Catch:{ IOException | JSONException -> 0x0233 }
            java.lang.String r1 = "port"     // Catch:{ IOException | JSONException -> 0x0233 }
            int r1 = r9.getInt(r1)     // Catch:{ IOException | JSONException -> 0x0233 }
            short r1 = (short) r1     // Catch:{ IOException | JSONException -> 0x0233 }
            java.lang.Short r11 = java.lang.Short.valueOf(r1)     // Catch:{ IOException | JSONException -> 0x0233 }
            java.lang.String r1 = "secure"     // Catch:{ IOException | JSONException -> 0x0233 }
            boolean r14 = r9.getBoolean(r1)     // Catch:{ IOException | JSONException -> 0x0233 }
            java.lang.String r1 = "override"     // Catch:{ IOException | JSONException -> 0x0233 }
            boolean r15 = r9.getBoolean(r1)     // Catch:{ IOException | JSONException -> 0x0233 }
            java.lang.String r1 = "resolver"     // Catch:{ IOException | JSONException -> 0x0233 }
            int r13 = r9.getInt(r1)     // Catch:{ IOException | JSONException -> 0x0233 }
            X.1mS r1 = new X.1mS     // Catch:{ IOException | JSONException -> 0x0233 }
            r9 = r1     // Catch:{ IOException | JSONException -> 0x0233 }
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ IOException | JSONException -> 0x0233 }
            r3.add(r1)     // Catch:{ IOException | JSONException -> 0x0233 }
            int r5 = r5 + 1     // Catch:{ IOException | JSONException -> 0x0233 }
            goto L_0x01a5     // Catch:{ IOException | JSONException -> 0x0233 }
        L_0x01ed:
            java.util.HashSet r9 = new java.util.HashSet     // Catch:{ IOException | JSONException -> 0x0233 }
            r9.<init>()     // Catch:{ IOException | JSONException -> 0x0233 }
            java.util.Iterator r14 = r3.iterator()     // Catch:{ IOException | JSONException -> 0x0233 }
        L_0x01f6:
            boolean r1 = r14.hasNext()     // Catch:{ IOException | JSONException -> 0x0233 }
            if (r1 == 0) goto L_0x021a     // Catch:{ IOException | JSONException -> 0x0233 }
            java.lang.Object r6 = r14.next()     // Catch:{ IOException | JSONException -> 0x0233 }
            X.1mS r6 = (X.C35761mS) r6     // Catch:{ IOException | JSONException -> 0x0233 }
            r1 = r28     // Catch:{ IOException | JSONException -> 0x0233 }
            X.0t3 r5 = r1.A01     // Catch:{ IOException | JSONException -> 0x0233 }
            java.lang.Long r1 = r6.A01     // Catch:{ IOException | JSONException -> 0x0233 }
            if (r1 == 0) goto L_0x01f6     // Catch:{ IOException | JSONException -> 0x0233 }
            long r12 = r5.A00()     // Catch:{ IOException | JSONException -> 0x0233 }
            long r10 = r1.longValue()     // Catch:{ IOException | JSONException -> 0x0233 }
            int r1 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))     // Catch:{ IOException | JSONException -> 0x0233 }
            if (r1 < 0) goto L_0x01f6     // Catch:{ IOException | JSONException -> 0x0233 }
            r9.add(r6)     // Catch:{ IOException | JSONException -> 0x0233 }
            goto L_0x01f6     // Catch:{ IOException | JSONException -> 0x0233 }
        L_0x021a:
            boolean r1 = r9.isEmpty()     // Catch:{ IOException | JSONException -> 0x0233 }
            if (r1 != 0) goto L_0x024b     // Catch:{ IOException | JSONException -> 0x0233 }
            r3.removeAll(r9)     // Catch:{ IOException | JSONException -> 0x0233 }
            boolean r1 = r3.isEmpty()     // Catch:{ IOException | JSONException -> 0x0233 }
            if (r1 == 0) goto L_0x022d     // Catch:{ IOException | JSONException -> 0x0233 }
            r8.deleteFile(r7)     // Catch:{ IOException | JSONException -> 0x0233 }
            goto L_0x024b     // Catch:{ IOException | JSONException -> 0x0233 }
        L_0x022d:
            r1 = r28     // Catch:{ IOException | JSONException -> 0x0233 }
            r1.A00(r3)     // Catch:{ IOException | JSONException -> 0x0233 }
            goto L_0x024b     // Catch:{ IOException | JSONException -> 0x0233 }
            r1 = move-exception
            java.lang.String r3 = "FallbackManager/getFallbackIps"
            com.whatsapp.util.Log.e(r3, r1)     // Catch:{ all -> 0x1718 }
            r3 = r28     // Catch:{ all -> 0x1718 }
            X.0so r5 = r3.A00     // Catch:{ all -> 0x1718 }
            java.lang.String r3 = "fallback-manager/load-error"     // Catch:{ all -> 0x1718 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x1718 }
            r5.AcB(r3, r1, r2)     // Catch:{ all -> 0x1718 }
        L_0x0246:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x1718 }
            r3.<init>()     // Catch:{ all -> 0x1718 }
        L_0x024b:
            monitor-exit(r28)
            X.0t3 r1 = r0.A0M
            r84 = r1
            long r75 = android.os.SystemClock.elapsedRealtime()
            X.0rz r1 = r0.A0P
            r83 = r1
            X.01D r1 = r1.A01
            r82 = r1
            java.lang.Object r1 = r82.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r42 = "connection_sequence_attempts"
            r5 = r42
            int r1 = r1.getInt(r5, r2)
            int r20 = r1 + 1
            java.util.concurrent.atomic.AtomicReference r47 = new java.util.concurrent.atomic.AtomicReference
            r47.<init>()
            r1 = 3
            r78 = 5
            android.net.TrafficStats.setThreadStatsTag(r4)     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            r37 = 0     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            java.util.ArrayList r36 = new java.util.ArrayList     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            r36.<init>()     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            X.1S6 r4 = r0.A0k     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            boolean r5 = r4.A02()     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            if (r5 == 0) goto L_0x028a     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            java.util.List r36 = r4.A00()     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
        L_0x028a:
            X.1Fp r4 = r0.A0T     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            r81 = r4     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            java.util.Random r4 = r0.A11     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            r80 = r4     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            r17 = 0     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            r40 = -1     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            java.util.ArrayList r38 = new java.util.ArrayList     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            r38.<init>()     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            java.util.ArrayList r39 = new java.util.ArrayList     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            r39.<init>()     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            java.util.Iterator r6 = r3.iterator()     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
        L_0x02a4:
            boolean r3 = r6.hasNext()     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            if (r3 == 0) goto L_0x02bc     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            java.lang.Object r5 = r6.next()     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            X.1mS r5 = (X.C35761mS) r5     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            boolean r4 = r5.A04     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            r3 = r39     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            if (r4 == 0) goto L_0x02b8     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            r3 = r38     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
        L_0x02b8:
            r3.add(r5)     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            goto L_0x02a4     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
        L_0x02bc:
            boolean r3 = r80.nextBoolean()     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            r35 = 443(0x1bb, float:6.21E-43)     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            r34 = 5222(0x1466, float:7.318E-42)     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            if (r3 == 0) goto L_0x02ca     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            r34 = 443(0x1bb, float:6.21E-43)     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            r35 = 5222(0x1466, float:7.318E-42)     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
        L_0x02ca:
            java.lang.Object r4 = r82.get()     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            java.lang.String r41 = "connection_sequence_state"     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            r3 = r41     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            int r4 = r4.getInt(r3, r2)     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            r18 = 0     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            r30 = 0     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            r24 = 0     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            r19 = 0     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            r31 = -1     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
        L_0x02e2:
            r21 = 2     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            r2 = 13     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            switch(r4) {
                case 0: goto L_0x0326;
                case 1: goto L_0x1570;
                case 2: goto L_0x0315;
                case 3: goto L_0x0313;
                case 4: goto L_0x033f;
                case 5: goto L_0x0305;
                case 6: goto L_0x0302;
                case 7: goto L_0x02ff;
                case 8: goto L_0x02f4;
                case 9: goto L_0x02ec;
                case 10: goto L_0x02f2;
                case 11: goto L_0x1570;
                case 12: goto L_0x1570;
                default: goto L_0x02e9;
            }     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
        L_0x02e9:
            if (r4 == r2) goto L_0x1570     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            goto L_0x0340     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
        L_0x02ec:
            r4 = 6     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            r3 = 2     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            r2 = r40     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            if (r2 != r3) goto L_0x0340     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
        L_0x02f2:
            r4 = 7     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
            goto L_0x0340     // Catch:{ 2Ce -> 0x15ed, all -> 0x15e1 }
        L_0x02f4:
            int r17 = r17 + 1     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
            int r2 = r39.size()     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
            r3 = r17     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
            if (r3 < r2) goto L_0x0340     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
            goto L_0x0310     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
        L_0x02ff:
            r4 = 11     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
            goto L_0x0340     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
        L_0x0302:
            r4 = 10     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
            goto L_0x0340     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
        L_0x0305:
            boolean r2 = r39.isEmpty()     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
            if (r2 != 0) goto L_0x0310     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
            r4 = 8     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
            r17 = 0     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
            goto L_0x0340     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
        L_0x0310:
            r4 = 9     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
            goto L_0x0340     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
        L_0x0313:
            r4 = 4     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
            goto L_0x0340     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
        L_0x0315:
            int r17 = r17 + 1     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
            int r2 = r38.size()     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
            r3 = r17     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
            if (r3 < r2) goto L_0x0340     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
            boolean r2 = android.text.TextUtils.isEmpty(r46)     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
            if (r2 == 0) goto L_0x033d     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
            goto L_0x033f     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
        L_0x0326:
            int r2 = r36.size()     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
            if (r2 <= 0) goto L_0x032f     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
            r4 = 12     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
            goto L_0x0340     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
        L_0x032f:
            boolean r2 = r38.isEmpty()     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
            if (r2 != 0) goto L_0x0337     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
            r4 = 2     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
            goto L_0x0340     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
        L_0x0337:
            boolean r2 = android.text.TextUtils.isEmpty(r46)     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
            if (r2 != 0) goto L_0x033f     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
        L_0x033d:
            r4 = 3     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
            goto L_0x0340     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
        L_0x033f:
            r4 = 5     // Catch:{ 2Ce -> 0x15da, all -> 0x16ac }
        L_0x0340:
            r2 = r88
            boolean r2 = r2.A00     // Catch:{ 2Ce -> 0x15da }
            if (r2 != 0) goto L_0x1570     // Catch:{ 2Ce -> 0x15da }
            int r18 = r18 + 1     // Catch:{ 2Ce -> 0x15da }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ 2Ce -> 0x15da }
            r3.<init>()     // Catch:{ 2Ce -> 0x15da }
            java.lang.String r2 = "chatd_connection: connecting; attempt="     // Catch:{ 2Ce -> 0x15da }
            r3.append(r2)     // Catch:{ 2Ce -> 0x15da }
            r2 = r18     // Catch:{ 2Ce -> 0x15da }
            r3.append(r2)     // Catch:{ 2Ce -> 0x15da }
            java.lang.String r2 = " state="     // Catch:{ 2Ce -> 0x15da }
            r3.append(r2)     // Catch:{ 2Ce -> 0x15da }
            r3.append(r4)     // Catch:{ 2Ce -> 0x15da }
            java.lang.String r2 = r3.toString()     // Catch:{ 2Ce -> 0x15da }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 2Ce -> 0x15da }
            java.lang.String r8 = "g.whatsapp.net"
            r3 = 80
            r6 = 1
            r5 = 0
            switch(r4) {
                case 0: goto L_0x1423;
                case 1: goto L_0x141b;
                case 2: goto L_0x04ce;
                case 3: goto L_0x04bd;
                case 4: goto L_0x04ac;
                case 5: goto L_0x03bd;
                case 6: goto L_0x03e2;
                case 7: goto L_0x038d;
                case 8: goto L_0x046c;
                case 9: goto L_0x041b;
                case 10: goto L_0x0383;
                case 11: goto L_0x03f6;
                case 12: goto L_0x0440;
                case 13: goto L_0x0438;
                default: goto L_0x036f;
            }     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x036f:
            java.lang.String r3 = "Unrecognized state "     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2.<init>(r3)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2.append(r4)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.String r3 = r2.toString()     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2.<init>(r3)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            throw r2     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x0383:
            r2 = r81     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            X.1fJ r7 = r2.A01(r8, r5)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r7.A00 = r3     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            goto L_0x0434     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x038d:
            r3 = 5222(0x1466, float:7.318E-42)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            boolean r2 = r80.nextBoolean()     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            if (r2 == 0) goto L_0x0397     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r3 = 443(0x1bb, float:6.21E-43)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x0397:
            java.lang.String[] r7 = X.C55342jM.A00     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            int r6 = r7.length     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2 = r80     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            int r2 = r2.nextInt(r6)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r6 = r7[r2]     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2 = r81     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            X.1fJ r7 = r2.A00(r6)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r7.A00 = r3     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.String r3 = "ConnectionSequence/getInetSocketAddress; host="     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2.<init>(r3)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2.append(r6)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.String r2 = r2.toString()     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            goto L_0x04fe     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x03bd:
            r2 = 5222(0x1466, float:7.318E-42)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            boolean r3 = r80.nextBoolean()     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            if (r3 == 0) goto L_0x03c7     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2 = 443(0x1bb, float:6.21E-43)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x03c7:
            r3 = r81     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            X.1fJ r7 = r3.A00(r8)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r7.A00 = r2     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.String r3 = "ConnectionSequence/getInetSocketAddress; host="     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2.<init>(r3)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2.append(r8)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.String r2 = r2.toString()     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            goto L_0x04fe     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x03e2:
            r2 = 5222(0x1466, float:7.318E-42)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            boolean r3 = r80.nextBoolean()     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            if (r3 == 0) goto L_0x03ec     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2 = 443(0x1bb, float:6.21E-43)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x03ec:
            r3 = r81     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            X.1fJ r7 = r3.A01(r8, r5)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r7.A00 = r2     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            goto L_0x04fe     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x03f6:
            java.lang.String[] r8 = X.C55342jM.A00     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            int r7 = r8.length     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2 = r80     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            int r2 = r2.nextInt(r7)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r8 = r8[r2]     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2 = r81     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            X.1fJ r7 = r2.A00(r8)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r7.A00 = r3     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.String r3 = "ConnectionSequence/getInetSocketAddress; host="     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2.<init>(r3)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2.append(r8)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.String r2 = r2.toString()     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            goto L_0x0434     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x041b:
            r2 = r81     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            X.1fJ r7 = r2.A00(r8)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r7.A00 = r3     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.String r3 = "ConnectionSequence/getInetSocketAddress; host="     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2.<init>(r3)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2.append(r8)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.String r2 = r2.toString()     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x0434:
            r7.A01 = r6     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            goto L_0x04fe     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x0438:
            java.lang.String r3 = "Cannot retrieve address past end"     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2.<init>(r3)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            throw r2     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x0440:
            int r2 = r36.size()     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            if (r2 < r6) goto L_0x0464     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2 = r36     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.Object r2 = r2.get(r5)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            X.1mS r2 = (X.C35761mS) r2     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            X.1mT r8 = new X.1mT     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r8.<init>(r1)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.net.InetAddress r6 = r2.A03     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.Short r3 = r2.A02     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            short r3 = r3.shortValue()     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            boolean r2 = r2.A05     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            X.1fJ r7 = new X.1fJ     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r7.<init>(r8, r6, r3, r2)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            goto L_0x04fe     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x0464:
            java.lang.String r3 = "Must provide at least one user proxy in this state."     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2.<init>(r3)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            throw r2     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x046c:
            r2 = r39     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r3 = r17     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            X.1mS r2 = (X.C35761mS) r2     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.net.InetAddress r6 = r2.A03     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            if (r6 == 0) goto L_0x04aa     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.Short r2 = r2.A02     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            if (r2 == 0) goto L_0x04aa     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            short r3 = r2.shortValue()     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.net.InetSocketAddress r2 = new java.net.InetSocketAddress     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2.<init>(r6, r3)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x0487:
            X.AnonymousClass00B.A06(r2)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r3 = 4     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            X.1mT r8 = new X.1mT     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r8.<init>(r3)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.net.InetAddress r6 = r2.getAddress()     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            int r3 = r2.getPort()     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2 = r39     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r7 = r17     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.Object r2 = r2.get(r7)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            X.1mS r2 = (X.C35761mS) r2     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            boolean r2 = r2.A05     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            X.1fJ r7 = new X.1fJ     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r7.<init>(r8, r6, r3, r2)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            goto L_0x04fe     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x04aa:
            r2 = 0     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            goto L_0x0487     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x04ac:
            X.1mT r6 = new X.1mT     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r6.<init>(r1)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.net.InetAddress r3 = java.net.InetAddress.getByName(r46)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            X.1fJ r7 = new X.1fJ     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2 = r35     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r7.<init>(r6, r3, r2, r5)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            goto L_0x04fe     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x04bd:
            X.1mT r6 = new X.1mT     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r6.<init>(r1)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.net.InetAddress r3 = java.net.InetAddress.getByName(r46)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            X.1fJ r7 = new X.1fJ     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2 = r34     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r7.<init>(r6, r3, r2, r5)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            goto L_0x04fe     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x04ce:
            X.1mT r8 = new X.1mT     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r8.<init>(r1)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2 = r38     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r3 = r17     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            X.1mS r2 = (X.C35761mS) r2     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.net.InetAddress r6 = r2.A03     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2 = r38     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.Object r2 = r2.get(r3)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            X.1mS r2 = (X.C35761mS) r2     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.Short r2 = r2.A02     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            short r3 = r2.shortValue()     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2 = r38     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r7 = r17     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.Object r2 = r2.get(r7)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            X.1mS r2 = (X.C35761mS) r2     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            boolean r2 = r2.A05     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            X.1fJ r7 = new X.1fJ     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r7.<init>(r8, r6, r3, r2)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x04fe:
            X.1mT r2 = r7.A02     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            int r2 = r2.A00     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r40 = r2     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            X.11n r11 = r0.A0a     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r10.<init>()     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r9.<init>()     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.net.InetAddress[] r8 = r7.A04     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            int r6 = r8.length     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r3 = 0     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x0514:
            if (r3 >= r6) goto L_0x052a     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2 = r8[r3]     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            byte[] r12 = r2.getAddress()     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            int r13 = r12.length     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r12 = 4     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            if (r13 <= r12) goto L_0x0524     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r9.add(r2)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            goto L_0x0527     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x0524:
            r10.add(r2)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x0527:
            int r3 = r3 + 1     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            goto L_0x0514     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x052a:
            X.0vS r2 = r11.A01     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            monitor-enter(r2)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            X.2gd r3 = r2.A01     // Catch:{ all -> 0x140a }
            if (r3 != 0) goto L_0x053e     // Catch:{ all -> 0x140a }
            X.0tz r3 = r2.A06     // Catch:{ all -> 0x140a }
            android.content.Context r13 = r3.A00     // Catch:{ all -> 0x140a }
            X.16d r12 = r2.A08     // Catch:{ all -> 0x140a }
            X.2gd r3 = new X.2gd     // Catch:{ all -> 0x140a }
            r3.<init>(r13, r12)     // Catch:{ all -> 0x140a }
            r2.A01 = r3     // Catch:{ all -> 0x140a }
        L_0x053e:
            monitor-exit(r2)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            boolean r13 = X.C41971wz.A09()     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r12 = 41     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.String r2 = " (secureSocket? "     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            if (r13 == 0) goto L_0x0593     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            boolean r6 = r10.isEmpty()     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            if (r6 != 0) goto L_0x0618     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.util.Random r8 = r11.A02     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            int r6 = r10.size()     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            int r6 = r8.nextInt(r6)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.Object r8 = r10.get(r6)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.net.InetAddress r8 = (java.net.InetAddress) r8     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            int r6 = r7.A00     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.net.InetSocketAddress r9 = new java.net.InetSocketAddress     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r9.<init>(r8, r6)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r8.<init>()     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.String r6 = "ConnectionSocketFactory/ipV4Only/try_connect/"     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x056d:
            r8.append(r6)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r8.append(r9)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r8.append(r2)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            boolean r2 = r7.A03     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r8.append(r2)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r8.append(r12)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.String r6 = r8.toString()     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            com.whatsapp.util.Log.i((java.lang.String) r6)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r8 = 30000(0x7530, float:4.2039E-41)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            javax.net.SocketFactory r6 = javax.net.SocketFactory.getDefault()     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.net.Socket r6 = r6.createSocket()     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r6.connect(r9, r8)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            goto L_0x05fc     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x0593:
            int r13 = r10.size()     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            if (r13 <= 0) goto L_0x05db     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            int r13 = r9.size()     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            if (r13 <= 0) goto L_0x05db     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.util.Random r3 = r11.A02     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            int r2 = r10.size()     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            int r2 = r3.nextInt(r2)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.Object r6 = r10.get(r2)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.net.InetAddress r6 = (java.net.InetAddress) r6     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            int r2 = r7.A00     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.net.InetSocketAddress r12 = new java.net.InetSocketAddress     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r12.<init>(r6, r2)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            int r2 = r9.size()     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            int r2 = r3.nextInt(r2)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.Object r3 = r9.get(r2)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.net.InetAddress r3 = (java.net.InetAddress) r3     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            int r2 = r7.A00     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.net.InetSocketAddress r9 = new java.net.InetSocketAddress     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r9.<init>(r3, r2)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.String r2 = "ConnectionSocketFactory/try_connect/using-happyEyeball"     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            X.11m r8 = r11.A00     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            boolean r13 = r7.A03     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            X.2bd r6 = new X.2bd     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r6.<init>()     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            monitor-enter(r8)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            goto L_0x0621     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x05db:
            r10.size()     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r9.size()     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            X.AnonymousClass00B.A06(r8)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.util.Random r9 = r11.A02     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            int r6 = r9.nextInt(r6)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r8 = r8[r6]     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            int r6 = r7.A00     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.net.InetSocketAddress r9 = new java.net.InetSocketAddress     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r9.<init>(r8, r6)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r8.<init>()     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.String r6 = "ConnectionSocketFactory/try_connect/"     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            goto L_0x056d     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x05fc:
            if (r2 == 0) goto L_0x0611     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.String r8 = r9.getHostName()     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            int r9 = r9.getPort()     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2 = 1     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.net.Socket r6 = r3.createSocket(r6, r8, r9, r2)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2 = r6     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            javax.net.ssl.SSLSocket r2 = (javax.net.ssl.SSLSocket) r2     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2.startHandshake()     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x0611:
            X.2be r3 = new X.2be     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r3.<init>(r6)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            goto L_0x06d0     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x0618:
            java.lang.String r2 = "Connection sequence can connect to IpV4 only, but no IpV4 available."     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.io.IOException r3 = new java.io.IOException     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r3.<init>(r2)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            goto L_0x141a     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x0621:
            r8.A02 = r5     // Catch:{ all -> 0x1407 }
            javax.net.ssl.SSLSocketFactory r2 = r8.A01     // Catch:{ all -> 0x1407 }
            if (r2 != 0) goto L_0x0642     // Catch:{ all -> 0x1407 }
            X.0vS r11 = r8.A03     // Catch:{ all -> 0x1407 }
            monitor-enter(r11)     // Catch:{ all -> 0x1407 }
            X.2gd r10 = r11.A01     // Catch:{ all -> 0x063c }
            if (r10 != 0) goto L_0x063f     // Catch:{ all -> 0x063c }
            X.0tz r2 = r11.A06     // Catch:{ all -> 0x063c }
            android.content.Context r3 = r2.A00     // Catch:{ all -> 0x063c }
            X.16d r2 = r11.A08     // Catch:{ all -> 0x063c }
            X.2gd r10 = new X.2gd     // Catch:{ all -> 0x063c }
            r10.<init>(r3, r2)     // Catch:{ all -> 0x063c }
            r11.A01 = r10     // Catch:{ all -> 0x063c }
            goto L_0x063f     // Catch:{ all -> 0x063c }
            r2 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x1407 }
            throw r2     // Catch:{ all -> 0x1407 }
        L_0x063f:
            monitor-exit(r11)     // Catch:{ all -> 0x1407 }
            r8.A01 = r10     // Catch:{ all -> 0x1407 }
        L_0x0642:
            monitor-exit(r8)     // Catch:{ all -> 0x1407 }
            java.util.concurrent.ThreadPoolExecutor r3 = r8.A00()     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            com.facebook.redex.RunnableRunnableShape0S0311000_I0 r2 = new com.facebook.redex.RunnableRunnableShape0S0311000_I0     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r54 = 2     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r50 = r2     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r51 = r8     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r52 = r6     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r53 = r9     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r55 = r13     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r50.<init>(r51, r52, r53, r54, r55)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r3.execute(r2)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x0693 }
            r2 = 250(0xfa, double:1.235E-321)     // Catch:{ InterruptedException -> 0x0693 }
            long r2 = r9.toNanos(r2)     // Catch:{ InterruptedException -> 0x0693 }
            java.util.concurrent.locks.ReentrantLock r10 = r6.A02     // Catch:{ InterruptedException -> 0x0693 }
            r10.lockInterruptibly()     // Catch:{ InterruptedException -> 0x0693 }
        L_0x0668:
            r14 = 0     // Catch:{ InterruptedException -> 0x0693 }
            int r9 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))     // Catch:{ InterruptedException -> 0x0693 }
            if (r9 <= 0) goto L_0x0679     // Catch:{ InterruptedException -> 0x0693 }
            java.lang.Object r9 = r6.A00     // Catch:{ all -> 0x068e }
            if (r9 != 0) goto L_0x0679     // Catch:{ all -> 0x068e }
            java.util.concurrent.locks.Condition r9 = r6.A01     // Catch:{ all -> 0x068e }
            long r2 = r9.awaitNanos(r2)     // Catch:{ all -> 0x068e }
            goto L_0x0668     // Catch:{ all -> 0x068e }
        L_0x0679:
            java.lang.Object r2 = r6.A00     // Catch:{ all -> 0x068e }
            r10.unlock()     // Catch:{ InterruptedException -> 0x0693 }
            java.net.Socket r2 = (java.net.Socket) r2     // Catch:{ InterruptedException -> 0x0693 }
            if (r2 == 0) goto L_0x0688     // Catch:{ InterruptedException -> 0x0693 }
            X.2be r3 = new X.2be     // Catch:{ InterruptedException -> 0x0693 }
            r3.<init>(r2)     // Catch:{ InterruptedException -> 0x0693 }
            goto L_0x06d0     // Catch:{ InterruptedException -> 0x0693 }
        L_0x0688:
            java.lang.String r2 = "happyEyeball/couldn't connect to ipv6 in 250 ms"     // Catch:{ InterruptedException -> 0x0693 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ InterruptedException -> 0x0693 }
            goto L_0x0699     // Catch:{ InterruptedException -> 0x0693 }
            r2 = move-exception     // Catch:{ InterruptedException -> 0x0693 }
            r10.unlock()     // Catch:{ InterruptedException -> 0x0693 }
            throw r2     // Catch:{ InterruptedException -> 0x0693 }
            r3 = move-exception
            java.lang.String r2 = "HappyEyeball/try_connect exception short wait for ipv6"
            com.whatsapp.util.Log.e(r2, r3)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x0699:
            java.util.concurrent.ThreadPoolExecutor r3 = r8.A00()     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r54 = 1     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            com.facebook.redex.RunnableRunnableShape0S0311000_I0 r2 = new com.facebook.redex.RunnableRunnableShape0S0311000_I0     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r50 = r2     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r53 = r12     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r50.<init>(r51, r52, r53, r54, r55)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r3.execute(r2)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.util.concurrent.locks.ReentrantLock r3 = r6.A02     // Catch:{ InterruptedException -> 0x140d }
            r3.lockInterruptibly()     // Catch:{ InterruptedException -> 0x140d }
        L_0x06b0:
            java.lang.Object r2 = r6.A00     // Catch:{ all -> 0x1402 }
            if (r2 != 0) goto L_0x06ba     // Catch:{ all -> 0x1402 }
            java.util.concurrent.locks.Condition r2 = r6.A01     // Catch:{ all -> 0x1402 }
            r2.await()     // Catch:{ all -> 0x1402 }
            goto L_0x06b0     // Catch:{ all -> 0x1402 }
        L_0x06ba:
            r3.unlock()     // Catch:{ InterruptedException -> 0x140d }
            java.net.Socket r2 = (java.net.Socket) r2     // Catch:{ InterruptedException -> 0x140d }
            if (r2 == 0) goto L_0x1413     // Catch:{ InterruptedException -> 0x140d }
            boolean r3 = r2.isConnected()     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            if (r3 == 0) goto L_0x1413     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.net.Socket r3 = X.C207611m.A05     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            if (r2 == r3) goto L_0x1413     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            X.2be r3 = new X.2be     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r3.<init>(r2)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x06d0:
            r0.A01 = r3     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2 = 30000(0x7530, float:4.2039E-41)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.net.Socket r3 = r3.A00     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r3.setSoTimeout(r2)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            int r24 = r80.nextInt()     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r3.<init>()     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.String r2 = "chatd_connection: socket connected; sessionId="     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r3.append(r2)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2 = r24     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r3.append(r2)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.String r2 = r3.toString()     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            X.2br r26 = new X.2br     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2 = r26     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2.<init>(r0)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            X.2H7 r33 = new X.2H7     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3 = r33     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r84     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.<init>(r2, r6)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            boolean r23 = r83.A1k()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.17L r14 = r0.A0i     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            boolean r22 = r14.A01()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r16 != 0) goto L_0x0719     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r25 == 0) goto L_0x0719     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r22 != 0) goto L_0x0719     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r23 != 0) goto L_0x0719     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r19 = 0     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x071b     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0719:
            r19 = 1     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x071b:
            X.1SC r9 = r0.A0Z     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r13 = 1     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r15 = 0     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r27 != 0) goto L_0x0722     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r15 = 1     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0722:
            X.2ge r2 = X.C54002ge.A0R     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wr r8 = r2.A0U()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gf r8 = (X.C54012gf) r8     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r15 != 0) goto L_0x0764     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r2 = X.C24561Gk.A03(r27)     // Catch:{ NumberFormatException -> 0x0747 }
            X.AnonymousClass00B.A06(r2)     // Catch:{ NumberFormatException -> 0x0747 }
            long r2 = java.lang.Long.parseLong(r2)     // Catch:{ NumberFormatException -> 0x0747 }
            r8.A03()     // Catch:{ NumberFormatException -> 0x0747 }
            X.1Wm r10 = r8.A00     // Catch:{ NumberFormatException -> 0x0747 }
            X.2ge r10 = (X.C54002ge) r10     // Catch:{ NumberFormatException -> 0x0747 }
            int r6 = r10.A01     // Catch:{ NumberFormatException -> 0x0747 }
            r6 = r6 | 1     // Catch:{ NumberFormatException -> 0x0747 }
            r10.A01 = r6     // Catch:{ NumberFormatException -> 0x0747 }
            r10.A0D = r2     // Catch:{ NumberFormatException -> 0x0747 }
            goto L_0x0764     // Catch:{ NumberFormatException -> 0x0747 }
            r3 = move-exception
            java.lang.String r2 = "jid prefix not numeric; prefix="
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r5.<init>(r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r27     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r2 = r2.user     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r5.append(r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r5 = r5.toString()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.AssertionError r2 = new java.lang.AssertionError     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.<init>(r5)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.initCause(r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x13fb     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0764:
            r8.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r8.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2ge r3 = (X.C54002ge) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A01 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r19     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A0P = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.0sK r10 = r9.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r6 = r10.A07()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r2 != 0) goto L_0x0790     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r8.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r8.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2ge r3 = (X.C54002ge) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 16     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A01 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A0N = r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0790:
            r8.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r8.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2ge r3 = (X.C54002ge) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 32     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A01 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r24     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A0A = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1HL r2 = r9.A09     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            boolean r6 = r2.A00()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r8.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r8.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2ge r3 = (X.C54002ge) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 64     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A01 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A0Q = r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            boolean r2 = r10.A0G()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r2 == 0) goto L_0x07d7     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Bw r2 = r9.A02     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.0sm r2 = r2.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            android.content.SharedPreferences r3 = r2.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r2 = "registration_device_id"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r6 = r3.getInt(r2, r5)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r8.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r8.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2ge r3 = (X.C54002ge) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 4096(0x1000, float:5.74E-42)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A01 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A05 = r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x07d7:
            X.1Wm r2 = r8.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2ge r2 = (X.C54002ge) r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gg r2 = r2.A0L     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r2 != 0) goto L_0x07e1     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gg r2 = X.C54022gg.A0E     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x07e1:
            X.1Wr r11 = r2.A0U()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gh r11 = (X.C54032gh) r11     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gi r6 = X.C54042gi.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r11.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r11.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gg r3 = (X.C54022gg) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 1     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A00 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r6.value     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A01 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int[] r10 = r9.A00()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r2 = r11.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gg r2 = (X.C54022gg) r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2Lt r2 = r2.A03     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r2 != 0) goto L_0x0808     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2Lt r2 = X.C48072Lt.A06     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0808:
            X.1Wr r6 = r2.A0U()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2Lu r6 = (X.C48082Lu) r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r12 = r10[r5]     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r6.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2Lt r3 = (X.C48072Lt) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 1     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A00 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A01 = r12     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r12 = r10[r13]     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r6.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2Lt r3 = (X.C48072Lt) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A00 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A04 = r12     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r12 = r10[r21]     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r6.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2Lt r3 = (X.C48072Lt) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 4     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A00 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A05 = r12     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r3 = r10.length     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = 4     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r3 != r2) goto L_0x0856     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r10 = r10[r1]     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r6.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2Lt r3 = (X.C48072Lt) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 8     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A00 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A02 = r10     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0856:
            r11.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r2 = r11.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gg r2 = (X.C54022gg) r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r6.A02()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2Lt r3 = (X.C48072Lt) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.A03 = r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r3 = r2.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3 = r3 | 2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.A00 = r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.01V r2 = r9.A03     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r52 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            android.telephony.TelephonyManager r2 = r52.A0N()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r2 == 0) goto L_0x089f     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r2 = r2.getNetworkOperator()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2Hf r10 = X.C47032Hf.A00(r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r6 = r10.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r11.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r11.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gg r3 = (X.C54022gg) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 4     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A00 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A09 = r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r6 = r10.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r11.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r11.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gg r3 = (X.C54022gg) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 8     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A00 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A0A = r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x089f:
            X.1SA r10 = r9.A08     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r2 = r10.A04     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r32 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r11.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r11.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gg r3 = (X.C54022gg) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 16     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A00 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r32     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A0C = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r6 = r10.A03     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r11.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r11.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gg r3 = (X.C54022gg) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 32     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A00 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A08 = r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r6 = r10.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r11.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r11.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gg r3 = (X.C54022gg) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 64     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A00 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A05 = r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r6 = r10.A02     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r11.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r11.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gg r3 = (X.C54022gg) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 128(0x80, float:1.794E-43)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A00 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A0B = r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r6 = r10.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r2 != 0) goto L_0x0900     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r11.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r11.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gg r3 = (X.C54022gg) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 4096(0x1000, float:5.74E-42)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A00 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A04 = r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0900:
            X.1SB r2 = r9.A0B     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2Ha r2 = r2.A00()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r6 = r2.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r11.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r11.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gg r3 = (X.C54022gg) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 256(0x100, float:3.59E-43)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A00 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A0D = r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.013 r10 = r9.A06     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r6 = r10.A06()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            boolean r2 = android.text.TextUtils.isEmpty(r6)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r2 != 0) goto L_0x093b     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r2 = "zz"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            boolean r2 = r2.equals(r6)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r2 != 0) goto L_0x093b     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r11.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r11.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gg r3 = (X.C54022gg) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 1024(0x400, float:1.435E-42)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A00 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A07 = r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x093b:
            java.lang.String r6 = r10.A05()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r2 = "ZZ"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            boolean r2 = r2.equals(r6)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r2 != 0) goto L_0x0956     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r11.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r11.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gg r3 = (X.C54022gg) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 2048(0x800, float:2.87E-42)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A00 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A06 = r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0956:
            r8.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r2 = r8.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2ge r2 = (X.C54002ge) r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r11.A02()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gg r3 = (X.C54022gg) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.A0L = r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r3 = r2.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3 = r3 | 4     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.A01 = r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.0wP r2 = r9.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1UW r3 = r2.A06()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r3 == 0) goto L_0x09cc     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            boolean r2 = r3.A06     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r2 == 0) goto L_0x0999     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gj r6 = X.C54052gj.A0F     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0979:
            r8.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r8.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2ge r3 = (X.C54002ge) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 128(0x80, float:1.794E-43)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A01 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r6.value     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A04 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.0tz r2 = r9.A04     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            android.content.Context r2 = r2.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            long r50 = X.AnonymousClass2CE.A00(r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r10 = 1     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = (r50 > r10 ? 1 : (r50 == r10 ? 0 : -1))     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r2 == 0) goto L_0x09d0     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x09cf     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0999:
            boolean r2 = r3.A04     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r2 == 0) goto L_0x09cc     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            switch(r2) {
                case 1: goto L_0x09a5;
                case 2: goto L_0x09a8;
                case 3: goto L_0x09ab;
                case 4: goto L_0x09ae;
                case 5: goto L_0x09b1;
                case 6: goto L_0x09b1;
                case 7: goto L_0x09b4;
                case 8: goto L_0x09b7;
                case 9: goto L_0x09ba;
                case 10: goto L_0x09bd;
                case 11: goto L_0x09c0;
                case 12: goto L_0x09b1;
                case 13: goto L_0x09c3;
                case 14: goto L_0x09c6;
                case 15: goto L_0x09c9;
                default: goto L_0x09a2;
            }     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x09a2:
            X.2gj r6 = X.C54052gj.A0E     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x0979     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x09a5:
            X.2gj r6 = X.C54052gj.A06     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x0979     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x09a8:
            X.2gj r6 = X.C54052gj.A03     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x0979     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x09ab:
            X.2gj r6 = X.C54052gj.A0D     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x0979     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x09ae:
            X.2gj r6 = X.C54052gj.A02     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x0979     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x09b1:
            X.2gj r6 = X.C54052gj.A05     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x0979     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x09b4:
            X.2gj r6 = X.C54052gj.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x0979     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x09b7:
            X.2gj r6 = X.C54052gj.A07     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x0979     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x09ba:
            X.2gj r6 = X.C54052gj.A0A     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x0979     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x09bd:
            X.2gj r6 = X.C54052gj.A08     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x0979     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x09c0:
            X.2gj r6 = X.C54052gj.A0B     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x0979     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x09c3:
            X.2gj r6 = X.C54052gj.A0C     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x0979     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x09c6:
            X.2gj r6 = X.C54052gj.A04     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x0979     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x09c9:
            X.2gj r6 = X.C54052gj.A09     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x0979     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x09cc:
            X.2gj r6 = X.C54052gj.A0E     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x0979     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x09cf:
            r13 = 0     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x09d0:
            r8.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r8.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2ge r3 = (X.C54002ge) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6 = 131072(0x20000, float:1.83671E-40)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A01 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A0O = r13     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.0rz r2 = r9.A05     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.01D r2 = r2.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.Object r3 = r2.get()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r29 = "connection_lc"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r29     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r6 = r3.getInt(r2, r5)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r8.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r2 = r8.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2ge r2 = (X.C54002ge) r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r3 = r2.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r10 = 262144(0x40000, float:3.67342E-40)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3 = r3 | r10     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.A01 = r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.A07 = r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r15 == 0) goto L_0x0b95     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.AnonymousClass00B.A06(r44)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3 = r44     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1dG r10 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            byte[] r6 = r3.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gm r2 = r2.A0K     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r2 != 0) goto L_0x0a13     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gm r2 = X.C54082gm.A09     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0a13:
            X.1Wr r11 = r2.A0U()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gn r11 = (X.C54092gn) r11     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r15 = 1     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            byte[] r2 = new byte[r15]     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2[r5] = r78     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Ww r12 = X.C28631Ww.A01(r2, r5, r15)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r11.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r11.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gm r3 = (X.C54082gm) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A00 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A04 = r12     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r6.length     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Ww r6 = X.C28631Ww.A01(r6, r5, r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r11.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r11.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gm r3 = (X.C54082gm) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 4     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A00 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A03 = r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r44     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            byte[] r3 = r2.A02     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.length     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Ww r6 = X.C28631Ww.A01(r3, r5, r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r11.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r11.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gm r3 = (X.C54082gm) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 1     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A00 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A05 = r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            byte[] r3 = r10.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.length     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Ww r6 = X.C28631Ww.A01(r3, r5, r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r11.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r11.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gm r3 = (X.C54082gm) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 8     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A00 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A06 = r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            byte[] r3 = r10.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.length     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Ww r6 = X.C28631Ww.A01(r3, r5, r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r11.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r11.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gm r3 = (X.C54082gm) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 16     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A00 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A08 = r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            byte[] r3 = r10.A02     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.length     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Ww r6 = X.C28631Ww.A01(r3, r5, r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r11.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r11.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gm r3 = (X.C54082gm) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 32     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A00 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A07 = r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r2 = "2.23.1.76"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r2 = X.C004101u.A02(r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            byte[] r3 = android.util.Base64.decode(r2, r5)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.length     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Ww r6 = X.C28631Ww.A01(r3, r5, r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r11.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r11.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gm r3 = (X.C54082gm) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 64     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A00 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A01 = r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2go r2 = X.C54102go.A06     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wr r10 = r2.A0U()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gp r10 = (X.C54112gp) r10     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int[] r6 = r9.A00()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r2 = r10.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2go r2 = (X.C54102go) r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gq r2 = r2.A02     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r2 != 0) goto L_0x0ad3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gq r2 = X.C54122gq.A06     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0ad3:
            X.1Wr r3 = r2.A0U()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gr r3 = (X.C54132gr) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r13 = r6[r5]     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r2 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gq r2 = (X.C54122gq) r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r12 = r2.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r12 = r12 | 1     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.A00 = r12     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.A01 = r13     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r13 = r6[r15]     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r2 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gq r2 = (X.C54122gq) r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r12 = r2.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r12 = r12 | 2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.A00 = r12     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.A04 = r13     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r13 = r6[r21]     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r2 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gq r2 = (X.C54122gq) r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r12 = r2.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r12 = r12 | 4     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.A00 = r12     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.A05 = r13     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r12 = r6.length     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = 4     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r12 != r2) goto L_0x0b21     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r12 = r6[r1]     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r6 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gq r6 = (X.C54122gq) r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r6.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 8     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6.A00 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6.A02 = r12     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0b21:
            r10.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r2 = r10.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2go r2 = (X.C54102go) r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r3.A02()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gq r3 = (X.C54122gq) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.A02 = r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r3 = r2.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3 = r3 | 2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.A00 = r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r10.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r10.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2go r3 = (X.C54102go) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 1     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A00 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r32     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A04 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1p8 r6 = X.C37421p8.A02     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r10.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r10.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2go r3 = (X.C54102go) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 4     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A00 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r6.value     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A01 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r10.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r10.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2go r3 = (X.C54102go) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 8     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A00 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A05 = r15     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r2 = r10.A02()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Ww r6 = r2.A00()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r11.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r11.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gm r3 = (X.C54082gm) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | 128(0x80, float:1.794E-43)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A00 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A02 = r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r8.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r2 = r8.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2ge r2 = (X.C54002ge) r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r11.A02()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gm r3 = (X.C54082gm) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.A0K = r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r3 = r2.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3 = r3 | 8192(0x2000, float:1.14794E-41)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.A01 = r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0b95:
            X.0pd r6 = r9.A07     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3 = 1722(0x6ba, float:2.413E-42)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.0tM r32 = X.C16620tM.A02     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r32     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r6 = r6.A03(r2, r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = -1     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r6 == r2) goto L_0x0bc1     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            byte[] r3 = new byte[r6]     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.security.SecureRandom r2 = X.C003601p.A00()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.nextBytes(r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Ww r6 = X.C28631Ww.A01(r3, r5, r6)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r8.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r8.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2ge r3 = (X.C54002ge) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r10 = 4194304(0x400000, float:5.877472E-39)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | r10     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A01 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A0H = r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0bc1:
            X.0u3 r3 = r9.A0C     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r52     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r6 = X.C42971z5.A02(r2, r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r8.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r8.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2ge r3 = (X.C54002ge) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r9 = 8388608(0x800000, float:1.17549435E-38)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | r9     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A01 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A0B = r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r6 = X.C29601at.A00(r52)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r8.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r3 = r8.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2ge r3 = (X.C54002ge) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r9 = 16777216(0x1000000, float:2.3509887E-38)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r2 | r9     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A01 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A08 = r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Wm r2 = r8.A02()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2ge r2 = (X.C54002ge) r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2be r6 = r0.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            boolean r3 = r7.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r3 == 0) goto L_0x0c41     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.net.Socket r3 = r6.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.io.InputStream r3 = r3.getInputStream()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gs r10 = new X.2gs     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r10.<init>(r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0c04:
            X.0ua r6 = r0.A0H     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r9 = r43     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1qW r8 = new X.1qW     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r8.<init>(r6, r10, r9, r9)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2be r3 = r0.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            boolean r7 = r7.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r7 == 0) goto L_0x0c3a     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.net.Socket r3 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.io.OutputStream r3 = r3.getOutputStream()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gt r10 = new X.2gt     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r10.<init>(r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0c1e:
            X.1pm r7 = new X.1pm     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r7.<init>(r6, r10, r9, r9)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6.<init>()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r3 = "chatd_connection: created IO streams; sessionId="     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6.append(r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3 = r24     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6.append(r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r3 = r6.toString()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x0c48     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0c3a:
            java.net.Socket r3 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.io.OutputStream r10 = r3.getOutputStream()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x0c1e     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0c41:
            java.net.Socket r3 = r6.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.io.InputStream r10 = r3.getInputStream()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x0c04     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0c48:
            if (r16 == 0) goto L_0x0c4c     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6 = 0     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x0c93     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0c4c:
            X.1CG r11 = r0.A09     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            monitor-enter(r11)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1mf r6 = r11.A02     // Catch:{ all -> 0x13f0 }
            if (r6 != 0) goto L_0x0c92     // Catch:{ all -> 0x13f0 }
            monitor-enter(r11)     // Catch:{ all -> 0x13f0 }
            X.1mf r6 = r11.A02     // Catch:{ all -> 0x0c8e }
            if (r6 != 0) goto L_0x0c8c     // Catch:{ all -> 0x0c8e }
            boolean r3 = r11.A03     // Catch:{ all -> 0x0c8e }
            if (r3 != 0) goto L_0x0c8c     // Catch:{ all -> 0x0c8e }
            X.0u3 r6 = r11.A0D     // Catch:{ all -> 0x0c8e }
            java.lang.String r3 = "keystore"     // Catch:{ all -> 0x0c8e }
            android.content.SharedPreferences r9 = r6.A00(r3)     // Catch:{ all -> 0x0c8e }
            java.lang.String r6 = "server_static_public"     // Catch:{ all -> 0x0c8e }
            java.lang.String r3 = ""     // Catch:{ all -> 0x0c8e }
            java.lang.String r3 = r9.getString(r6, r3)     // Catch:{ all -> 0x0c8e }
            r6 = 0     // Catch:{ all -> 0x0c8e }
            boolean r9 = android.text.TextUtils.isEmpty(r3)     // Catch:{ IllegalArgumentException -> 0x0c81 }
            if (r9 != 0) goto L_0x0c87     // Catch:{ IllegalArgumentException -> 0x0c81 }
            byte[] r9 = android.util.Base64.decode(r3, r1)     // Catch:{ IllegalArgumentException -> 0x0c81 }
            if (r9 == 0) goto L_0x0c87     // Catch:{ IllegalArgumentException -> 0x0c81 }
            X.1mf r3 = new X.1mf     // Catch:{ IllegalArgumentException -> 0x0c81 }
            r3.<init>(r9)     // Catch:{ IllegalArgumentException -> 0x0c81 }
            r6 = r3     // Catch:{ IllegalArgumentException -> 0x0c81 }
            goto L_0x0c87     // Catch:{ IllegalArgumentException -> 0x0c81 }
            r9 = move-exception
            java.lang.String r3 = "failed to deserialize server public key"
            com.whatsapp.util.Log.w(r3, r9)     // Catch:{ all -> 0x0c8e }
        L_0x0c87:
            r11.A02 = r6     // Catch:{ all -> 0x0c8e }
            r3 = 1     // Catch:{ all -> 0x0c8e }
            r11.A03 = r3     // Catch:{ all -> 0x0c8e }
        L_0x0c8c:
            monitor-exit(r11)     // Catch:{ all -> 0x0c8e }
            goto L_0x0c92     // Catch:{ all -> 0x0c8e }
            r3 = move-exception     // Catch:{ all -> 0x0c8e }
            monitor-exit(r11)     // Catch:{ all -> 0x0c8e }
            goto L_0x0d17     // Catch:{ all -> 0x0c8e }
        L_0x0c92:
            monitor-exit(r11)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0c93:
            X.1CG r11 = r0.A09     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            monitor-enter(r11)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1fK r9 = r11.A02()     // Catch:{ all -> 0x13f0 }
            monitor-exit(r11)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r3 = r9.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r31 = r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1fL r3 = r9.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r3 == 0) goto L_0x13e5     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.19x r9 = r0.A0y     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r72 = r9     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gu r10 = new X.2gu     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r50 = r10     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r51 = r84     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r52 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r53 = r9     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r54 = r8     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r55 = r7     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r56 = r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r57 = r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r50.<init>(r51, r52, r53, r54, r55, r56, r57)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r7.<init>()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r3 = "chatd_connection: completed noise handshake; sessionId="     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r7.append(r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3 = r24     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r7.append(r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r3 = r7.toString()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2Gy r9 = r10.A03     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1mf r8 = r9.A02     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r6 == 0) goto L_0x0ce4     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            byte[] r6 = r6.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0cda:
            byte[] r3 = r8.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            boolean r6 = java.util.Arrays.equals(r6, r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r6 != 0) goto L_0x0d19     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            monitor-enter(r11)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x0ce6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0ce4:
            r6 = 0     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x0cda     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0ce6:
            java.lang.String r6 = "saving server static public key"
            com.whatsapp.util.Log.i((java.lang.String) r6)     // Catch:{ all -> 0x13f0 }
            X.0u3 r7 = r11.A0D     // Catch:{ all -> 0x13f0 }
            java.lang.String r6 = "keystore"     // Catch:{ all -> 0x13f0 }
            android.content.SharedPreferences r6 = r7.A00(r6)     // Catch:{ all -> 0x13f0 }
            android.content.SharedPreferences$Editor r7 = r6.edit()     // Catch:{ all -> 0x13f0 }
            java.lang.String r6 = "server_static_public"     // Catch:{ all -> 0x13f0 }
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r1)     // Catch:{ all -> 0x13f0 }
            android.content.SharedPreferences$Editor r3 = r7.putString(r6, r3)     // Catch:{ all -> 0x13f0 }
            boolean r3 = r3.commit()     // Catch:{ all -> 0x13f0 }
            if (r3 == 0) goto L_0x0d0f     // Catch:{ all -> 0x13f0 }
            r11.A02 = r8     // Catch:{ all -> 0x13f0 }
            r3 = 1     // Catch:{ all -> 0x13f0 }
            r11.A03 = r3     // Catch:{ all -> 0x13f0 }
            goto L_0x0d18     // Catch:{ all -> 0x13f0 }
        L_0x0d0f:
            java.lang.String r2 = "unable to write server static keypair"     // Catch:{ all -> 0x13f0 }
            java.lang.AssertionError r3 = new java.lang.AssertionError     // Catch:{ all -> 0x13f0 }
            r3.<init>(r2)     // Catch:{ all -> 0x13f0 }
        L_0x0d17:
            throw r3     // Catch:{ all -> 0x13f0 }
        L_0x0d18:
            monitor-exit(r11)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0d19:
            X.2Gj r3 = new X.2Gj     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.<init>()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.0so r13 = r0.A0B     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2Gx r6 = r10.A04     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2Gk r7 = new X.2Gk     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r7.<init>(r9, r6)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Vu r50 = new X.1Vu     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6 = r50     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6.<init>(r13, r3, r7)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.0pd r15 = r0.A0U     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gv r7 = r10.A05     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2Gm r6 = new X.2Gm     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6.<init>(r7, r9)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2Gl r11 = new X.2Gl     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r11.<init>(r13, r15, r3, r6)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.util.concurrent.ConcurrentHashMap r65 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r65.<init>()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.11l r3 = r0.A0C     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.0un r3 = r3.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.0sX r3 = r3.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.01J r6 = r3.A5p     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.Object r8 = r6.get()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.0so r8 = (X.C16300so) r8     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.01J r6 = r3.ADr     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.Object r7 = r6.get()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.0sK r7 = (X.C16040sK) r7     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.01J r6 = r3.A4Z     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.Object r6 = r6.get()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Bw r6 = (X.C23411Bw) r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.0r5 r57 = r3.A1F()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.01J r3 = r3.A4f     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.Object r3 = r3.get()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.0ys r3 = (X.C19710ys) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gw r54 = new X.2gw     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r55 = r8     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r56 = r7     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r58 = r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r59 = r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r60 = r33     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r54.<init>(r55, r56, r57, r58, r59, r60)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6.<init>()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.0t9 r3 = r0.A0W     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r69 = r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2bl r3 = new X.2bl     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r55 = r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r56 = r13     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r57 = r15     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r58 = r69     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r59 = r33     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r60 = r65     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r55.<init>(r56, r57, r58, r59, r60)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.C41391vi.A03(r3, r6)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gx r3 = new X.2gx     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r55 = r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r55.<init>(r56, r57, r58, r59, r60)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.C41391vi.A03(r3, r6)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2bo r3 = new X.2bo     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r55 = r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r55.<init>(r56, r57, r58, r59, r60)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.C41391vi.A03(r3, r6)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.0sK r8 = r0.A0D     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2bi r3 = new X.2bi     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r55 = r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r57 = r8     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r58 = r15     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r59 = r69     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r60 = r33     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r61 = r65     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r55.<init>(r56, r57, r58, r59, r60, r61)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.C41391vi.A03(r3, r6)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.11o r3 = r0.A0n     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r79 = r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.util.Set r7 = r0.A12     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2bn r3 = new X.2bn     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r52 = r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r53 = r13     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r55 = r15     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r56 = r69     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r57 = r33     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r58 = r79     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r59 = r65     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r60 = r7     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r52.<init>(r53, r54, r55, r56, r57, r58, r59, r60)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.C41391vi.A03(r3, r6)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.11p r3 = r0.A0o     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r77 = r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2bp r3 = new X.2bp     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r55 = r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r56 = r13     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r57 = r84     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r58 = r15     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r59 = r69     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r60 = r33     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r61 = r77     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r62 = r65     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r55.<init>(r56, r57, r58, r59, r60, r61, r62)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.C41391vi.A03(r3, r6)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2bh r3 = new X.2bh     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r57 = r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r58 = r13     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r59 = r8     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r60 = r84     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r61 = r15     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r62 = r69     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r63 = r33     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r64 = r77     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r57.<init>(r58, r59, r60, r61, r62, r63, r64, r65)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.C41391vi.A03(r3, r6)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.util.ArrayList r73 = new java.util.ArrayList     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r73.<init>()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.0wU r12 = r0.A0p     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2bj r3 = new X.2bj     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r57 = r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r59 = r84     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r60 = r15     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r61 = r69     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r62 = r33     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r63 = r77     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r64 = r12     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r57.<init>(r58, r59, r60, r61, r62, r63, r64, r65)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.C41391vi.A03(r3, r6)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2bm r3 = new X.2bm     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r66 = r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r67 = r13     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r68 = r15     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r70 = r33     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r71 = r28     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r74 = r65     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r66.<init>(r67, r68, r69, r70, r71, r72, r73, r74)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.C41391vi.A03(r3, r6)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.17g r10 = r0.A0v     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.0wS r9 = r0.A0q     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1HB r7 = r0.A0s     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2bk r3 = new X.2bk     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r51 = r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r52 = r13     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r53 = r8     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r55 = r84     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r56 = r83     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r57 = r15     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r58 = r69     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r59 = r33     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r60 = r77     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r61 = r12     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r62 = r9     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r63 = r7     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r64 = r10     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r51.<init>(r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.C41391vi.A03(r3, r6)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.0tH r7 = r0.A08     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1vj r3 = new X.1vj     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r51 = r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r52 = r7     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r53 = r13     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r54 = r84     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r55 = r69     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r56 = r33     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r57 = r50     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r58 = r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r59 = r65     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r51.<init>(r52, r53, r54, r55, r56, r57, r58, r59)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r0.A06 = r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.0tz r6 = r0.A0N     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.0s5 r3 = r0.A0G     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r52 = r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2bq r3 = new X.2bq     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r55 = r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r56 = r13     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r57 = r52     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r58 = r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r59 = r83     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r60 = r15     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r61 = r33     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r62 = r14     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r63 = r79     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r64 = r11     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r55.<init>(r56, r57, r58, r59, r60, r61, r62, r63, r64, r65)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r0.A07 = r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.util.concurrent.atomic.AtomicReference r33 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r33.<init>()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r16 != 0) goto L_0x10c6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2bq r11 = r0.A07     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gy r2 = r2.A0M     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r2 != 0) goto L_0x0eb7     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2gy r2 = X.C54202gy.A05     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0eb7:
            int r3 = r2.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = 1     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3 = r3 & 1     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r3 == r2) goto L_0x0ebf     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = 0     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0ebf:
            X.1Vv r9 = r50.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r7 = 0     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0ec4:
            if (r9 == 0) goto L_0x10bd     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r3 = "web"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            boolean r3 = X.C28371Vv.A07(r9, r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6 = 500(0x1f4, float:7.0E-43)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r10 = "code"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r3 == 0) goto L_0x0f04     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r7 != 0) goto L_0x0efb     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r2 == 0) goto L_0x13f3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r3 = "error"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Vv r3 = r9.A0J(r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r3 == 0) goto L_0x0ef5     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r7 = r3.A0A(r10, r6)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r6 = "xmpp/reader/read/on-qr-sync-error "     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.<init>(r6)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.append(r7)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r3 = r3.toString()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            com.whatsapp.util.Log.i((java.lang.String) r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0ef5:
            X.1Vv r9 = r50.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r7 = 1     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x0ec4     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0efb:
            java.lang.String r3 = "multiple web nodes encountered on login"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1W9 r2 = new X.1W9     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.<init>((java.lang.String) r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x13fb     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0f04:
            java.lang.String r3 = "success"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            boolean r3 = X.C28371Vv.A07(r9, r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r50 = 1000(0x3e8, double:4.94E-321)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r12 = "t"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r3 == 0) goto L_0x1005     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r2 == 0) goto L_0x0f20     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r7 != 0) goto L_0x0f20     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r3 = "web was expected but not seen before success"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1W9 r2 = new X.1W9     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.<init>((java.lang.String) r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x13fb     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0f20:
            r2 = r37     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r10 = r9.A0N(r12, r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r10 == 0) goto L_0x0f66     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            long r6 = java.lang.Long.parseLong(r10)     // Catch:{ NumberFormatException -> 0x0f51 }
            r11.A02 = r6     // Catch:{ NumberFormatException -> 0x0f51 }
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ NumberFormatException -> 0x0f51 }
            long r2 = r2 / r50     // Catch:{ NumberFormatException -> 0x0f51 }
            r11.A01 = r2     // Catch:{ NumberFormatException -> 0x0f51 }
            android.content.SharedPreferences$Editor r3 = r83.A0K()     // Catch:{ NumberFormatException -> 0x0f51 }
            java.lang.String r2 = "last_login_time"     // Catch:{ NumberFormatException -> 0x0f51 }
            android.content.SharedPreferences$Editor r2 = r3.putLong(r2, r6)     // Catch:{ NumberFormatException -> 0x0f51 }
            r2.apply()     // Catch:{ NumberFormatException -> 0x0f51 }
            android.content.SharedPreferences$Editor r3 = r83.A0K()     // Catch:{ NumberFormatException -> 0x0f51 }
            java.lang.String r2 = "show_post_reg_logged_out_dialog"     // Catch:{ NumberFormatException -> 0x0f51 }
            r3.remove(r2)     // Catch:{ NumberFormatException -> 0x0f51 }
            r3.apply()     // Catch:{ NumberFormatException -> 0x0f51 }
            goto L_0x0f66     // Catch:{ NumberFormatException -> 0x0f51 }
            java.lang.String r3 = "invalid server time; timeString="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.<init>(r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.append(r10)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r3 = r2.toString()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1W9 r2 = new X.1W9     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.<init>((java.lang.String) r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x13fb     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0f66:
            java.lang.String r2 = "props"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6 = -1     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r9.A0A(r2, r6)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r2 == r6) goto L_0x0f78     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r33     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.set(r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0f78:
            java.lang.String r2 = "abprops"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r9.A0A(r2, r6)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r2 == r6) goto L_0x0f89     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r47     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.set(r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0f89:
            java.lang.Class<com.whatsapp.jid.Jid> r3 = com.whatsapp.jid.Jid.class     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r2 = "lid"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            com.whatsapp.jid.Jid r7 = r9.A0F(r13, r3, r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r7 == 0) goto L_0x0fb6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            monitor-enter(r8)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1ZX r2 = r8.A03()     // Catch:{ all -> 0x0fca }
            boolean r2 = r7.equals(r2)     // Catch:{ all -> 0x0fca }
            if (r2 != 0) goto L_0x0fb5     // Catch:{ all -> 0x0fca }
            boolean r2 = r7 instanceof X.AnonymousClass1ZX     // Catch:{ all -> 0x0fca }
            if (r2 != 0) goto L_0x0fa6     // Catch:{ all -> 0x0fca }
            boolean r2 = r7 instanceof X.AnonymousClass1ZY     // Catch:{ all -> 0x0fca }
            if (r2 == 0) goto L_0x0fb5     // Catch:{ all -> 0x0fca }
        L_0x0fa6:
            X.0rz r6 = r8.A0A     // Catch:{ all -> 0x0fca }
            java.lang.String r3 = "self_lid"     // Catch:{ all -> 0x0fca }
            java.lang.String r2 = r7.getRawString()     // Catch:{ all -> 0x0fca }
            r6.A1A(r3, r2)     // Catch:{ all -> 0x0fca }
            r8.A0E(r7)     // Catch:{ all -> 0x0fca }
        L_0x0fb5:
            monitor-exit(r8)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0fb6:
            java.lang.String r3 = "display_name"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r37     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r6 = r9.A0N(r3, r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r6 == 0) goto L_0x0fcf     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            monitor-enter(r8)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.0rz r3 = r8.A0A     // Catch:{ all -> 0x0fca }
            java.lang.String r2 = "self_display_name"     // Catch:{ all -> 0x0fca }
            r3.A1A(r2, r6)     // Catch:{ all -> 0x0fca }
            goto L_0x0fce     // Catch:{ all -> 0x0fca }
            r2 = move-exception
            monitor-exit(r8)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x13fb     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0fce:
            monitor-exit(r8)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0fcf:
            X.18r r3 = r0.A0V     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r83     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.C41391vi.A02(r2, r3, r9)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1vj r6 = r0.A06     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r6 == 0) goto L_0x0fe0     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            long r2 = r84.A00()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6.A00 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0fe0:
            java.lang.Object r3 = r82.get()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r29     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r3.getInt(r2, r5)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3 = 2147483647(0x7fffffff, float:NaN)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r2 != r3) goto L_0x0ff2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = -1     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x0ff2:
            android.content.SharedPreferences$Editor r6 = r83.A0K()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r3 = r2 + 1     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r29     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            android.content.SharedPreferences$Editor r2 = r6.putInt(r2, r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.apply()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6 = 17     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x10c7     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x1005:
            java.lang.String r2 = "failure"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            boolean r2 = X.C28371Vv.A07(r9, r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r2 == 0) goto L_0x10a5     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r3 = "reason"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r2 = r9.A0M(r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r7 = r9.A0B(r2, r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            boolean r2 = r8.A0G()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r2 == 0) goto L_0x1029     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            boolean r2 = r83.A1k()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r2 == 0) goto L_0x1029     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1CH r8 = r0.A0K     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            long r2 = (long) r7     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r8.A00(r1, r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x1029:
            X.18r r3 = r0.A0V     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r83     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.C41391vi.A02(r2, r3, r9)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r7 < r6) goto L_0x103d     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = 600(0x258, float:8.41E-43)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r7 >= r2) goto L_0x1040     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = 4     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2Ce r6 = new X.2Ce     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6.<init>(r2, r7)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x10a4     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x103d:
            switch(r7) {
                case 402: goto L_0x1046;
                case 403: goto L_0x1078;
                case 404: goto L_0x1040;
                case 405: goto L_0x1088;
                case 406: goto L_0x1098;
                default: goto L_0x1040;
            }     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x1040:
            X.2Ce r6 = new X.2Ce     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6.<init>(r5, r7)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x10a4     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x1046:
            r2 = 2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2Ce r6 = new X.2Ce     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6.<init>(r2, r7)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r3 = "expire"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r2 = r9.A0M(r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r9.A0B(r2, r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6.expire_time_out = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r2 = r9.A0M(r10)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r9.A0B(r2, r10)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6.code = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r3 = "message"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r37     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r2 = r9.A0N(r3, r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6.banMessage = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r3 = "url"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r37     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r2 = r9.A0N(r3, r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6.faqUrl = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x10a4     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x1078:
            r2 = 7     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2Ce r6 = new X.2Ce     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6.<init>(r2, r7)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r2 = "vt"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r9.A0A(r2, r5)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6.violationType = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x10a4     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x1088:
            X.2Ce r6 = new X.2Ce     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6.<init>(r1, r7)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = 0     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            long r2 = r9.A0D(r12, r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            long r2 = r2 * r50     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6.expiration_time = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x10a4     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x1098:
            r2 = 5     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2Ce r6 = new X.2Ce     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6.<init>(r2, r7)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r9.A0A(r10, r5)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6.code = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x10a4:
            throw r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x10a5:
            java.lang.String r3 = "unexpected node received during login sequence; node="     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.<init>(r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r3 = r9.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.append(r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r3 = r2.toString()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1W9 r2 = new X.1W9     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.<init>((java.lang.String) r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x13fb     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x10bd:
            java.lang.String r3 = "node stream ended unexpectedly"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1W9 r2 = new X.1W9     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.<init>((java.lang.String) r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x13fb     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x10c6:
            r6 = 3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x10c7:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.<init>()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r2 = "chatd_connection: switching to "     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.append(r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.append(r6)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r2 = " minute read timeout; sessionId="     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.append(r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r24     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.append(r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r2 = r3.toString()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2be r2 = r0.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r3 = r6 * 60     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r3 = r3 * 1000     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.net.Socket r2 = r2.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.setSoTimeout(r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r0.A00 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3 = 1465(0x5b9, float:2.053E-42)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r32     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            boolean r2 = r15.A0E(r2, r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r2 == 0) goto L_0x116d     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2bq r11 = r0.A07     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.0rz r2 = r11.A07     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.01D r2 = r2.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.Object r6 = r2.get()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            android.content.SharedPreferences r6 = (android.content.SharedPreferences) r6     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r3 = "pref_client_auth_token"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r37     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r2 = r6.getString(r3, r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r3 != 0) goto L_0x115a     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            byte[] r10 = android.util.Base64.decode(r2, r1)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r10 == 0) goto L_0x115a     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r2 = "ib"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1gQ r9 = new X.1gQ     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r9.<init>((java.lang.String) r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r2 = "cat"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1gQ r8 = new X.1gQ     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r8.<init>((java.lang.String) r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6 = 1     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = 1024(0x400, double:5.06E-321)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.C32271fx.A09(r10, r6, r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r8.A01 = r10     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Vv r2 = r8.A01()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r9.A03(r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Vv r2 = r9.A01()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2Gl r3 = r11.A0C     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r7 = 1     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A04(r2, r7)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x1148:
            X.19y r6 = r0.A10     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.util.concurrent.atomic.AtomicReference r3 = r6.A06     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r37     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.Object r2 = r3.getAndSet(r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r2 == 0) goto L_0x115c     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6.A00(r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x115c     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x115a:
            r7 = 0     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x1148     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x115c:
            if (r7 == 0) goto L_0x116d     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3 = 1689(0x699, float:2.367E-42)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r32     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            boolean r2 = r15.A0E(r2, r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r2 == 0) goto L_0x116d     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1CQ r2 = r0.A0I     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.A00()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x116d:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.<init>()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r2 = "chatd_connection: fetching client config; sessionId="     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.append(r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r24     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.append(r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r2 = r3.toString()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            com.whatsapp.util.Log.i((java.lang.String) r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2bq r10 = r0.A07     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r10.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r6 = 1     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r2 + 1     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r10.A00 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r7 = java.lang.Integer.toHexString(r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.util.Map r3 = r10.A03     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2iU r2 = new X.2iU     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.<init>(r10)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.put(r7, r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1lL[] r8 = new X.C35081lL[r6]     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r9 = "version"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r3 = "1"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1lL r2 = new X.1lL     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.<init>((java.lang.String) r9, (java.lang.String) r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r8[r5] = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r2 = "config"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Vv r9 = new X.1Vv     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r9.<init>(r2, r8)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = 4     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1lL[] r8 = new X.C35081lL[r2]     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r3 = "id"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1lL r2 = new X.1lL     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.<init>((java.lang.String) r3, (java.lang.String) r7)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r8[r5] = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r7 = "xmlns"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r3 = "urn:xmpp:whatsapp:push"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1lL r2 = new X.1lL     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.<init>((java.lang.String) r7, (java.lang.String) r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r8[r6] = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r7 = "type"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r3 = "get"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1lL r2 = new X.1lL     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.<init>((java.lang.String) r7, (java.lang.String) r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r8[r21] = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1ks r7 = X.C34791ks.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r3 = "to"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1lL r2 = new X.1lL     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.<init>((com.whatsapp.jid.Jid) r7, (java.lang.String) r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r8[r1] = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r3 = "iq"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1Vv r2 = new X.1Vv     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.<init>((X.C28371Vv) r9, (java.lang.String) r3, (X.C35081lL[]) r8)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2Gl r3 = r10.A0C     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.A04(r2, r6)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r16 != 0) goto L_0x124b     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r52     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            android.content.SharedPreferences r7 = r2.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r2 = "server_props:last_version"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r3 = r7.getInt(r2, r5)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.Object r2 = r33.get()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r2 == 0) goto L_0x120d     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = r2.intValue()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r2 == r3) goto L_0x120d     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2bq r2 = r0.A07     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.A09(r6)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x1244     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x120d:
            X.0sm r2 = r0.A0Q     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            android.content.SharedPreferences r3 = r2.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r2 = "run_on_connect_tasks_for_version_change"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            boolean r2 = r3.getBoolean(r2, r5)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r2 == 0) goto L_0x1220     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2bq r2 = r0.A07     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.A09(r6)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x1244     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x1220:
            long r11 = r84.A00()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r8 = "groups_server_props_last_refresh_time"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = 0     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            long r9 = r7.getLong(r8, r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.lang.String r8 = "server_props:refresh"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = 86400000(0x5265c00, double:4.2687272E-316)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            long r7 = r7.getLong(r8, r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            long r7 = r7 + r9     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r2 < 0) goto L_0x123f     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            int r2 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            if (r2 >= 0) goto L_0x1244     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x123f:
            X.2bq r2 = r0.A07     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.A09(r5)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x1244:
            if (r87 == 0) goto L_0x124b     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2bq r2 = r0.A07     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x124b:
            X.1vj r7 = r0.A06     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2iW r3 = new X.2iW     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r26     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.<init>(r13, r2, r7)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3.start()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = r88     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.A00(r6)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2be r2 = r0.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.net.Socket r2 = r2.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            java.net.InetAddress r2 = r2.getInetAddress()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            boolean r2 = r2 instanceof java.net.Inet6Address     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r30 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r7 = 0     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            android.content.SharedPreferences$Editor r3 = r83.A0K()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r2 = r42     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            android.content.SharedPreferences$Editor r2 = r3.putInt(r2, r5)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r2.apply()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r2 = r26     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r0.A02 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            if (r16 != 0) goto L_0x1389     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            if (r25 == 0) goto L_0x12f9     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            if (r22 == 0) goto L_0x12f9     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            monitor-enter(r14)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            java.util.List r2 = r14.A00     // Catch:{ all -> 0x12f5 }
            r2.size()     // Catch:{ all -> 0x12f5 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x12f5 }
            r10.<init>(r2)     // Catch:{ all -> 0x12f5 }
            monitor-exit(r14)     // Catch:{ all -> 0x12f5 }
            monitor-enter(r14)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            java.util.List r2 = r14.A02     // Catch:{ all -> 0x12f1 }
            r2.size()     // Catch:{ all -> 0x12f1 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ all -> 0x12f1 }
            r9.<init>(r2)     // Catch:{ all -> 0x12f1 }
            monitor-exit(r14)     // Catch:{ all -> 0x12f1 }
            monitor-enter(r14)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            java.util.List r2 = r14.A01     // Catch:{ all -> 0x12ed }
            r2.size()     // Catch:{ all -> 0x12ed }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x12ed }
            r8.<init>(r2)     // Catch:{ all -> 0x12ed }
            monitor-exit(r14)     // Catch:{ all -> 0x12ed }
            int r2 = r10.size()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            if (r2 <= 0) goto L_0x12bc     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            X.2CU r11 = r0.A04     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r3 = 90     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r2 = r37     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            android.os.Message r3 = android.os.Message.obtain(r2, r5, r3, r5, r10)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            X.2CV r11 = (X.AnonymousClass2CV) r11     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r2 = 2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r3.what = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r11.sendMessage(r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
        L_0x12bc:
            int r2 = r9.size()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            if (r2 <= 0) goto L_0x12d4     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            X.2CU r10 = r0.A04     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r3 = 247(0xf7, float:3.46E-43)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r2 = r37     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            android.os.Message r3 = android.os.Message.obtain(r2, r5, r3, r5, r9)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            X.2CV r10 = (X.AnonymousClass2CV) r10     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r2 = 2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r3.what = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r10.sendMessage(r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
        L_0x12d4:
            int r2 = r8.size()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            if (r2 <= 0) goto L_0x12f9     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            X.2CU r9 = r0.A04     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r3 = 276(0x114, float:3.87E-43)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r2 = r37     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            android.os.Message r3 = android.os.Message.obtain(r2, r5, r3, r5, r8)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            X.2CV r9 = (X.AnonymousClass2CV) r9     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r2 = 2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r3.what = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r9.sendMessage(r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            goto L_0x12f9     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r2 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x12ed }
            goto L_0x1385     // Catch:{ all -> 0x12ed }
            r2 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x12f1 }
            goto L_0x1385     // Catch:{ all -> 0x12f1 }
            r2 = move-exception
            monitor-exit(r14)     // Catch:{ all -> 0x12f5 }
            goto L_0x1385     // Catch:{ all -> 0x12f5 }
        L_0x12f9:
            if (r23 == 0) goto L_0x1328     // Catch:{ all -> 0x12f5 }
            X.12z r9 = r0.A0E     // Catch:{ InterruptedException -> 0x1320, ExecutionException -> 0x1318 }
            X.0rz r2 = r9.A0A     // Catch:{ InterruptedException -> 0x1320, ExecutionException -> 0x1318 }
            boolean r2 = r2.A1k()     // Catch:{ InterruptedException -> 0x1320, ExecutionException -> 0x1318 }
            if (r2 == 0) goto L_0x1341     // Catch:{ InterruptedException -> 0x1320, ExecutionException -> 0x1318 }
            X.16P r8 = r9.A0C     // Catch:{ InterruptedException -> 0x1320, ExecutionException -> 0x1318 }
            r3 = 8     // Catch:{ InterruptedException -> 0x1320, ExecutionException -> 0x1318 }
            com.facebook.redex.RunnableRunnableShape2S0100000_I0_1 r2 = new com.facebook.redex.RunnableRunnableShape2S0100000_I0_1     // Catch:{ InterruptedException -> 0x1320, ExecutionException -> 0x1318 }
            r2.<init>(r9, r3)     // Catch:{ InterruptedException -> 0x1320, ExecutionException -> 0x1318 }
            java.util.concurrent.ThreadPoolExecutor r3 = r8.A00     // Catch:{ InterruptedException -> 0x1320, ExecutionException -> 0x1318 }
            java.util.concurrent.Future r2 = r3.submit(r2)     // Catch:{ InterruptedException -> 0x1320, ExecutionException -> 0x1318 }
            r2.get()     // Catch:{ InterruptedException -> 0x1320, ExecutionException -> 0x1318 }
            goto L_0x1341     // Catch:{ InterruptedException -> 0x1320, ExecutionException -> 0x1318 }
            r3 = move-exception
            java.lang.String r2 = "xmpp/connection/signal/execution-exception"
            com.whatsapp.util.Log.w(r2, r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            goto L_0x1341     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r3 = move-exception     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            java.lang.String r2 = "xmpp/connection/signal/interrupted-exception"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            com.whatsapp.util.Log.w(r2, r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            goto L_0x1341     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
        L_0x1328:
            r2 = r83     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            java.lang.Object r8 = r2.A02     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            monitor-enter(r8)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            java.lang.Object r3 = r82.get()     // Catch:{ all -> 0x1383 }
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3     // Catch:{ all -> 0x1383 }
            java.lang.String r2 = "need_to_get_pre_key_digest"     // Catch:{ all -> 0x1383 }
            boolean r2 = r3.getBoolean(r2, r6)     // Catch:{ all -> 0x1383 }
            monitor-exit(r8)     // Catch:{ all -> 0x1383 }
            if (r2 == 0) goto L_0x1341     // Catch:{ all -> 0x1383 }
            X.12z r2 = r0.A0E     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r2.A02()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
        L_0x1341:
            if (r25 == 0) goto L_0x1363     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            if (r19 == 0) goto L_0x1363     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            X.2CU r9 = r0.A04     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r6)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r3 = 37     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r2 = r37     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            android.os.Message r3 = android.os.Message.obtain(r2, r5, r3, r5, r8)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            X.2CV r9 = (X.AnonymousClass2CV) r9     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r2 = 2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r3.what = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r9.sendMessage(r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            X.2bf r8 = r0.A03     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r2 = 32000(0x7d00, double:1.581E-319)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r5 = 2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r8.sendEmptyMessageDelayed(r5, r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
        L_0x1363:
            java.lang.Integer r5 = r83.A0L()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            if (r5 == 0) goto L_0x1378     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            X.0tq r2 = r0.A0S     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            boolean r2 = r2.A00     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            if (r2 == 0) goto L_0x1378     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            X.0ul r3 = r0.A0X     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            int r2 = r5.intValue()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r3.A0E(r2, r6, r6)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
        L_0x1378:
            X.129 r2 = r0.A0A     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            boolean r3 = r2.A03()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            if (r3 == 0) goto L_0x1389     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            if (r87 == 0) goto L_0x1389     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            goto L_0x1386     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r2 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x1383 }
        L_0x1385:
            throw r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
        L_0x1386:
            r2.A01()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
        L_0x1389:
            r3 = 1190(0x4a6, float:1.668E-42)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r2 = r32     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            boolean r2 = r15.A0E(r2, r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            if (r2 == 0) goto L_0x13d4     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            X.2bq r2 = r0.A07     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            long r8 = r2.A02     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            long r5 = r2.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            X.2ia r11 = new X.2ia     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r11.<init>()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            long r2 = r8 - r5     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            long r2 = java.lang.Math.abs(r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            long r21 = r10.toHours(r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            long r14 = r10.toMinutes(r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r2 = 60     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            long r14 = r14 % r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r12 = 30     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            int r2 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            if (r2 < 0) goto L_0x13bb     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r2 = 1     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            long r21 = r21 + r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
        L_0x13bb:
            int r2 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            if (r2 >= 0) goto L_0x13c3     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r2 = -1     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            long r21 = r21 * r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
        L_0x13c3:
            r5 = 0     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            int r2 = (r21 > r5 ? 1 : (r21 == r5 ? 0 : -1))     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            if (r2 == 0) goto L_0x13d4     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            java.lang.Long r2 = java.lang.Long.valueOf(r21)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r11.A00 = r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r2 = r69     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r2.A06(r11)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
        L_0x13d4:
            X.2bq r2 = r0.A07     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            long r5 = r2.A02     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r8 = 1000(0x3e8, double:4.94E-321)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            long r5 = r5 * r8     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            long r2 = r2.A01     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            long r2 = r2 * r8     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r8 = r84     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            r8.A04(r5, r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
            goto L_0x14b4     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc, all -> 0x1543 }
        L_0x13e5:
            java.lang.String r2 = "ConnectionThread/failed to load auth key, postponing login"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.2hh r2 = new X.2hh     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.<init>()     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x13fb     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2 = move-exception     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            monitor-exit(r11)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            goto L_0x13fb     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x13f3:
            java.lang.String r3 = "web node given during login without any web ref provided"     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            X.1W9 r2 = new X.1W9     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r2.<init>((java.lang.String) r3)     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
        L_0x13fb:
            throw r2     // Catch:{ 2jL -> 0x14de, 2hh -> 0x14d8, IOException -> 0x1400, 1W9 -> 0x13fe, 2gz -> 0x13fc }
            r3 = move-exception
            goto L_0x142e
            r5 = move-exception
            goto L_0x1438
            r5 = move-exception
            goto L_0x1468
            r2 = move-exception
            r3.unlock()     // Catch:{ InterruptedException -> 0x140d }
            throw r2     // Catch:{ InterruptedException -> 0x140d }
            r3 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x1407 }
            goto L_0x141a     // Catch:{ all -> 0x1407 }
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            goto L_0x141a     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r3 = move-exception     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.String r2 = "HappyEyeball"     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            com.whatsapp.util.Log.w(r2, r3)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x1413:
            java.lang.String r2 = "HappyEyeball/couldn't connect to neither of ips"     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.io.IOException r3 = new java.io.IOException     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r3.<init>(r2)     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x141a:
            throw r3     // Catch:{ 2jL -> 0x14da, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x141b:
            java.lang.String r3 = "getAddress"
            java.lang.NullPointerException r2 = new java.lang.NullPointerException     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2.<init>(r3)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            throw r2     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
        L_0x1423:
            java.lang.String r3 = "Must call moveToNext first"     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r2.<init>(r3)     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            throw r2     // Catch:{ 2jL -> 0x1519, 2hh -> 0x14ec, IOException -> 0x1465, 1W9 -> 0x1435, 2gz -> 0x142b, all -> 0x1512 }
            r3 = move-exception
            r26 = r37
        L_0x142e:
            java.lang.String r2 = "xmpp/connection/socket/invalid-certificate-exception"
            com.whatsapp.util.Log.w(r2, r3)     // Catch:{ all -> 0x14ea }
            goto L_0x148f     // Catch:{ all -> 0x14ea }
            r5 = move-exception
            r26 = r37
        L_0x1438:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x14ea }
            r3.<init>()     // Catch:{ all -> 0x14ea }
            java.lang.String r2 = "xmpp/connection/socket/next-port/corrupt-stream-exception "     // Catch:{ all -> 0x14ea }
            r3.append(r2)     // Catch:{ all -> 0x14ea }
            r3.append(r5)     // Catch:{ all -> 0x14ea }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x14ea }
            com.whatsapp.util.Log.i(r2, r5)     // Catch:{ all -> 0x14ea }
            r2 = r88
            boolean r2 = r2.A00     // Catch:{ 2Ce -> 0x14e3 }
            if (r2 != 0) goto L_0x02e2     // Catch:{ 2Ce -> 0x14e3 }
            X.2be r2 = r0.A01     // Catch:{ 2Ce -> 0x14e3 }
            if (r2 == 0) goto L_0x1460     // Catch:{ 2Ce -> 0x14e3 }
            java.net.Socket r2 = r2.A00     // Catch:{ 2Ce -> 0x14e3 }
            boolean r2 = r2.isClosed()     // Catch:{ 2Ce -> 0x14e3 }
            if (r2 != 0) goto L_0x1460     // Catch:{ 2Ce -> 0x14e3 }
            goto L_0x14a1     // Catch:{ 2Ce -> 0x14e3 }
        L_0x1460:
            X.2be r2 = r0.A01     // Catch:{ 2Ce -> 0x14e3 }
            if (r2 == 0) goto L_0x14b1     // Catch:{ 2Ce -> 0x14e3 }
            goto L_0x14ae     // Catch:{ 2Ce -> 0x14e3 }
            r5 = move-exception
            r26 = r37
        L_0x1468:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x14ea }
            r3.<init>()     // Catch:{ all -> 0x14ea }
            r2 = r45     // Catch:{ all -> 0x14ea }
            r3.append(r2)     // Catch:{ all -> 0x14ea }
            r3.append(r5)     // Catch:{ all -> 0x14ea }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x14ea }
            com.whatsapp.util.Log.i(r2, r5)     // Catch:{ all -> 0x14ea }
            r2 = r88
            boolean r2 = r2.A00     // Catch:{ 2Ce -> 0x14e3 }
            if (r2 != 0) goto L_0x02e2     // Catch:{ 2Ce -> 0x14e3 }
            X.2be r2 = r0.A01     // Catch:{ 2Ce -> 0x14e3 }
            if (r2 == 0) goto L_0x14a5     // Catch:{ 2Ce -> 0x14e3 }
            java.net.Socket r2 = r2.A00     // Catch:{ 2Ce -> 0x14e3 }
            boolean r2 = r2.isClosed()     // Catch:{ 2Ce -> 0x14e3 }
            if (r2 != 0) goto L_0x14a5     // Catch:{ 2Ce -> 0x14e3 }
            goto L_0x14a1     // Catch:{ 2Ce -> 0x14e3 }
        L_0x148f:
            r2 = r88     // Catch:{ 2Ce -> 0x14e3 }
            boolean r2 = r2.A00     // Catch:{ 2Ce -> 0x14e3 }
            if (r2 != 0) goto L_0x02e2     // Catch:{ 2Ce -> 0x14e3 }
            X.2be r2 = r0.A01     // Catch:{ 2Ce -> 0x14e3 }
            if (r2 == 0) goto L_0x14aa     // Catch:{ 2Ce -> 0x14e3 }
            java.net.Socket r2 = r2.A00     // Catch:{ 2Ce -> 0x14e3 }
            boolean r2 = r2.isClosed()     // Catch:{ 2Ce -> 0x14e3 }
            if (r2 != 0) goto L_0x14aa     // Catch:{ 2Ce -> 0x14e3 }
        L_0x14a1:
            r0.A04()     // Catch:{ 2Ce -> 0x14e3 }
            goto L_0x14b1     // Catch:{ 2Ce -> 0x14e3 }
        L_0x14a5:
            X.2be r2 = r0.A01     // Catch:{ 2Ce -> 0x14e3 }
            if (r2 == 0) goto L_0x14b1     // Catch:{ 2Ce -> 0x14e3 }
            goto L_0x14ae     // Catch:{ 2Ce -> 0x14e3 }
        L_0x14aa:
            X.2be r2 = r0.A01     // Catch:{ 2Ce -> 0x14e3 }
            if (r2 == 0) goto L_0x14b1     // Catch:{ 2Ce -> 0x14e3 }
        L_0x14ae:
            com.whatsapp.util.Log.i((java.lang.String) r48)     // Catch:{ 2Ce -> 0x14e3 }
        L_0x14b1:
            if (r26 == 0) goto L_0x02e2     // Catch:{ 2Ce -> 0x14e3 }
            goto L_0x14c9     // Catch:{ 2Ce -> 0x14e3 }
        L_0x14b4:
            r2 = r88     // Catch:{ 2Ce -> 0x14e3 }
            boolean r2 = r2.A00     // Catch:{ 2Ce -> 0x14e3 }
            if (r2 != 0) goto L_0x02e2     // Catch:{ 2Ce -> 0x14e3 }
            X.2be r2 = r0.A01     // Catch:{ 2Ce -> 0x14e3 }
            if (r2 == 0) goto L_0x14d0     // Catch:{ 2Ce -> 0x14e3 }
            java.net.Socket r2 = r2.A00     // Catch:{ 2Ce -> 0x14e3 }
            boolean r2 = r2.isClosed()     // Catch:{ 2Ce -> 0x14e3 }
            if (r2 != 0) goto L_0x14d0     // Catch:{ 2Ce -> 0x14e3 }
            r0.A04()     // Catch:{ 2Ce -> 0x14e3 }
        L_0x14c9:
            r2 = 1     // Catch:{ 2Ce -> 0x14e3 }
            r3 = r26     // Catch:{ 2Ce -> 0x14e3 }
            r3.A00 = r2     // Catch:{ 2Ce -> 0x14e3 }
            goto L_0x02e2     // Catch:{ 2Ce -> 0x14e3 }
        L_0x14d0:
            X.2be r2 = r0.A01     // Catch:{ 2Ce -> 0x14e3 }
            if (r2 == 0) goto L_0x14c9     // Catch:{ 2Ce -> 0x14e3 }
            com.whatsapp.util.Log.i((java.lang.String) r48)     // Catch:{ 2Ce -> 0x14e3 }
            goto L_0x14c9     // Catch:{ 2Ce -> 0x14e3 }
            r2 = move-exception
            goto L_0x14ef
            r5 = move-exception
            r26 = r37
            goto L_0x14df
            r5 = move-exception
        L_0x14df:
            r6 = 8
            r7 = -1
            goto L_0x151f
            r4 = move-exception
            r7 = 0
            r6 = 8
            r5 = 6
            goto L_0x15df
            r8 = move-exception
            goto L_0x1515
            r2 = move-exception
            r26 = r37
        L_0x14ef:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x150e }
            r3.<init>()     // Catch:{ all -> 0x150e }
            r4 = r45     // Catch:{ all -> 0x150e }
            r3.append(r4)     // Catch:{ all -> 0x150e }
            r3.append(r2)     // Catch:{ all -> 0x150e }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x150e }
            com.whatsapp.util.Log.i(r3, r2)     // Catch:{ all -> 0x150e }
            r6 = 8     // Catch:{ all -> 0x150e }
            r3 = -1     // Catch:{ all -> 0x150e }
            X.2Ce r2 = new X.2Ce     // Catch:{ all -> 0x150c }
            r2.<init>(r6, r3)     // Catch:{ all -> 0x150c }
            throw r2     // Catch:{ all -> 0x150c }
            r8 = move-exception
            goto L_0x1517
            r8 = move-exception
            r6 = 8
            goto L_0x1517
            r8 = move-exception
            r26 = r37
        L_0x1515:
            r6 = 8
        L_0x1517:
            r7 = 0
            goto L_0x1546
            r5 = move-exception
            r6 = 8
            r7 = -1
            r26 = r37
        L_0x151f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x153f }
            r3.<init>()     // Catch:{ all -> 0x153f }
            java.lang.String r2 = "xmpp/connection/socket/goaway"     // Catch:{ all -> 0x153f }
            r3.append(r2)     // Catch:{ all -> 0x153f }
            r3.append(r5)     // Catch:{ all -> 0x153f }
            java.lang.String r2 = r3.toString()     // Catch:{ all -> 0x153f }
            com.whatsapp.util.Log.i(r2, r5)     // Catch:{ all -> 0x153f }
            r5 = 6     // Catch:{ all -> 0x153f }
            X.2Ce r2 = new X.2Ce     // Catch:{ all -> 0x153b }
            r2.<init>(r5, r7)     // Catch:{ all -> 0x153b }
            throw r2     // Catch:{ all -> 0x153b }
            r8 = move-exception
            r7 = r4
            r2 = 1
            goto L_0x1548
            r8 = move-exception
            r5 = 6
            r7 = 0
            goto L_0x1547
            r8 = move-exception
            r6 = 8
        L_0x1546:
            r5 = 6
        L_0x1547:
            r2 = 0
        L_0x1548:
            r3 = r88
            boolean r3 = r3.A00     // Catch:{ 2Ce -> 0x156d }
            if (r3 != 0) goto L_0x156c     // Catch:{ 2Ce -> 0x156d }
            X.2be r3 = r0.A01     // Catch:{ 2Ce -> 0x156d }
            if (r3 == 0) goto L_0x155e     // Catch:{ 2Ce -> 0x156d }
            java.net.Socket r3 = r3.A00     // Catch:{ 2Ce -> 0x156d }
            boolean r3 = r3.isClosed()     // Catch:{ 2Ce -> 0x156d }
            if (r3 != 0) goto L_0x155e     // Catch:{ 2Ce -> 0x156d }
            r0.A04()     // Catch:{ 2Ce -> 0x156d }
            goto L_0x1565     // Catch:{ 2Ce -> 0x156d }
        L_0x155e:
            X.2be r3 = r0.A01     // Catch:{ 2Ce -> 0x156d }
            if (r3 == 0) goto L_0x1565     // Catch:{ 2Ce -> 0x156d }
            com.whatsapp.util.Log.i((java.lang.String) r48)     // Catch:{ 2Ce -> 0x156d }
        L_0x1565:
            if (r26 == 0) goto L_0x156c     // Catch:{ 2Ce -> 0x156d }
            r3 = 1     // Catch:{ 2Ce -> 0x156d }
            r4 = r26     // Catch:{ 2Ce -> 0x156d }
            r4.A00 = r3     // Catch:{ 2Ce -> 0x156d }
        L_0x156c:
            throw r8     // Catch:{ 2Ce -> 0x156d }
            r4 = move-exception
            goto L_0x15fc
        L_0x1570:
            r6 = 8
            r2 = -1
            r5 = 6
            r3 = r88
            boolean r3 = r3.A00     // Catch:{ 2Ce -> 0x15d8, all -> 0x16ac }
            if (r3 != 0) goto L_0x1589     // Catch:{ 2Ce -> 0x15d8, all -> 0x16ac }
            android.content.SharedPreferences$Editor r4 = r83.A0K()     // Catch:{ 2Ce -> 0x15d8 }
            r3 = r42     // Catch:{ 2Ce -> 0x15d8 }
            r7 = r20     // Catch:{ 2Ce -> 0x15d8 }
            android.content.SharedPreferences$Editor r3 = r4.putInt(r3, r7)     // Catch:{ 2Ce -> 0x15d8 }
            r3.apply()     // Catch:{ 2Ce -> 0x15d8 }
        L_0x1589:
            android.content.SharedPreferences$Editor r3 = r83.A0K()
            r4 = r41
            android.content.SharedPreferences$Editor r3 = r3.remove(r4)
            r3.apply()
            r3 = r88
            boolean r3 = r3.A00
            r6 = 5
            if (r3 == 0) goto L_0x159e
            r6 = 1
        L_0x159e:
            r4 = 1
            int r20 = r20 - r4
            int r8 = r18 + -1
            long r2 = (long) r2
            r5 = r0
            r7 = r20
            r9 = r31
            r10 = r75
            r12 = r2
            r14 = r19
            r5.A05(r6, r7, r8, r9, r10, r12, r14)
            r2 = r88
            boolean r2 = r2.A00
            if (r2 == 0) goto L_0x15ce
            java.lang.Object r2 = r47.get()
            java.lang.Integer r2 = (java.lang.Integer) r2
            X.2Cf r3 = new X.2Cf
            r82 = r3
            r83 = r49
            r84 = r2
            r85 = r24
            r86 = r30
            r82.<init>(r83, r84, r85, r86, r87)
            goto L_0x167f
        L_0x15ce:
            r2 = 0
            r1 = 4
            r0 = r49
            android.os.Message r0 = r0.obtainMessage(r1, r4, r2)
            goto L_0x1693
            r4 = move-exception
            goto L_0x15de
            r4 = move-exception
            r6 = 8
            r5 = 6
        L_0x15de:
            r7 = 0
        L_0x15df:
            r2 = 0
            goto L_0x15fc
            r5 = move-exception
            r3 = -1
            r19 = 0
            r31 = -1
            r24 = 0
            r30 = 0
            goto L_0x16b0
            r4 = move-exception
            r7 = 0
            r6 = 8
            r5 = 6
            r31 = -1
            r24 = 0
            r30 = 0
            r19 = 0
            r18 = 0
        L_0x15fc:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x16a7 }
            r8.<init>()     // Catch:{ all -> 0x16a7 }
            java.lang.String r3 = "xmpp/connection/login/failure type:"     // Catch:{ all -> 0x16a7 }
            r8.append(r3)     // Catch:{ all -> 0x16a7 }
            int r3 = r4.type     // Catch:{ all -> 0x16a7 }
            r8.append(r3)     // Catch:{ all -> 0x16a7 }
            java.lang.String r3 = " code:"     // Catch:{ all -> 0x16a7 }
            r8.append(r3)     // Catch:{ all -> 0x16a7 }
            int r3 = r4.code     // Catch:{ all -> 0x16a7 }
            r8.append(r3)     // Catch:{ all -> 0x16a7 }
            java.lang.String r3 = r8.toString()     // Catch:{ all -> 0x16a7 }
            com.whatsapp.util.Log.w(r3, r4)     // Catch:{ all -> 0x16a7 }
            int r3 = r4.type     // Catch:{ all -> 0x16a7 }
            if (r3 != r5) goto L_0x1624     // Catch:{ all -> 0x16a7 }
            r1 = 4     // Catch:{ all -> 0x16a7 }
            r3 = -1     // Catch:{ all -> 0x16a7 }
            goto L_0x162b     // Catch:{ all -> 0x16a7 }
        L_0x1624:
            if (r3 != r6) goto L_0x1629     // Catch:{ all -> 0x16a7 }
            r3 = -1     // Catch:{ all -> 0x16a7 }
            r1 = 6     // Catch:{ all -> 0x16a7 }
            goto L_0x162b     // Catch:{ all -> 0x16a7 }
        L_0x1629:
            int r3 = r4.serverErrorCode     // Catch:{ all -> 0x16a7 }
        L_0x162b:
            r6 = 2
            r5 = r49
            android.os.Message r4 = r5.obtainMessage(r6, r4)     // Catch:{ all -> 0x16a5 }
            r4.sendToTarget()     // Catch:{ all -> 0x16a5 }
            r4 = r88
            boolean r4 = r4.A00
            if (r4 != 0) goto L_0x169a
            if (r2 == 0) goto L_0x169a
            android.content.SharedPreferences$Editor r4 = r83.A0K()
            java.lang.String r2 = "connection_sequence_state"
            android.content.SharedPreferences$Editor r2 = r4.putInt(r2, r7)
        L_0x1647:
            r2.apply()
            r2 = r88
            boolean r2 = r2.A00
            if (r2 == 0) goto L_0x1651
            r1 = 1
        L_0x1651:
            int r72 = r20 + -1
            int r73 = r18 + -1
            long r2 = (long) r3
            r70 = r0
            r71 = r1
            r74 = r31
            r77 = r2
            r79 = r19
            r70.A05(r71, r72, r73, r74, r75, r77, r79)
            r1 = r88
            boolean r1 = r1.A00
            if (r1 == 0) goto L_0x1696
            java.lang.Object r1 = r47.get()
            java.lang.Integer r1 = (java.lang.Integer) r1
            X.2Cf r3 = new X.2Cf
            r82 = r3
            r83 = r5
            r84 = r1
            r85 = r24
            r86 = r30
            r82.<init>(r83, r84, r85, r86, r87)
            r1 = 3
        L_0x167f:
            r2 = r49
            android.os.Message r1 = r2.obtainMessage(r1, r3)
            r1.sendToTarget()
            X.2CU r2 = r0.A04
            X.2bq r1 = r0.A07
            android.os.Handler r2 = (android.os.Handler) r2
            r0 = 0
            android.os.Message r0 = r2.obtainMessage(r0, r1)
        L_0x1693:
            r0.sendToTarget()
        L_0x1696:
            android.net.TrafficStats.clearThreadStatsTag()
            return
        L_0x169a:
            android.content.SharedPreferences$Editor r4 = r83.A0K()
            java.lang.String r2 = "connection_sequence_state"
            android.content.SharedPreferences$Editor r2 = r4.remove(r2)
            goto L_0x1647
            r5 = move-exception
            goto L_0x16ae
            r5 = move-exception
            r2 = r18
            r3 = -1
            goto L_0x16b0
            r5 = move-exception
            r3 = -1
        L_0x16ae:
            r2 = r18
        L_0x16b0:
            android.content.SharedPreferences$Editor r4 = r83.A0K()
            java.lang.String r1 = "connection_sequence_state"
            android.content.SharedPreferences$Editor r1 = r4.remove(r1)
            r1.apply()
            r1 = r88
            boolean r1 = r1.A00
            if (r1 == 0) goto L_0x16c5
            r78 = 1
        L_0x16c5:
            int r79 = r20 + -1
            int r80 = r2 + -1
            long r1 = (long) r3
            r77 = r0
            r81 = r31
            r84 = r1
            r86 = r19
            r82 = r75
            r77.A05(r78, r79, r80, r81, r82, r84, r86)
            r1 = r88
            boolean r1 = r1.A00
            if (r1 != 0) goto L_0x16ed
            r3 = 1
            r2 = 0
            r1 = 4
            r0 = r49
            android.os.Message r0 = r0.obtainMessage(r1, r3, r2)
        L_0x16e6:
            r0.sendToTarget()
            android.net.TrafficStats.clearThreadStatsTag()
            throw r5
        L_0x16ed:
            java.lang.Object r1 = r47.get()
            java.lang.Integer r1 = (java.lang.Integer) r1
            X.2Cf r3 = new X.2Cf
            r82 = r3
            r83 = r49
            r84 = r1
            r85 = r24
            r86 = r30
            r82.<init>(r83, r84, r85, r86, r87)
            r2 = 3
            r1 = r49
            android.os.Message r1 = r1.obtainMessage(r2, r3)
            r1.sendToTarget()
            X.2CU r2 = r0.A04
            X.2bq r1 = r0.A07
            android.os.Handler r2 = (android.os.Handler) r2
            r0 = 0
            android.os.Message r0 = r2.obtainMessage(r0, r1)
            goto L_0x16e6
            r0 = move-exception
            monitor-exit(r28)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2CT.handleMessage(android.os.Message):void");
    }
}
