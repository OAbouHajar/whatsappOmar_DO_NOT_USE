package X;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.whatsapp.voipcalling.CallState;

/* renamed from: X.1SK  reason: invalid class name */
public class AnonymousClass1SK {
    public final C16570tH A00;
    public final C17160ud A01;
    public final C16000sG A02;
    public final C16080sP A03;
    public final AnonymousClass120 A04;
    public final C17200uh A05;
    public final AnonymousClass152 A06;
    public final AnonymousClass01V A07;
    public final C16980tz A08;
    public final C19380yL A09;
    public final C17240ul A0A;
    public final C16220sf A0B;
    public final C216014s A0C;
    public final C16320sq A0D;

    public AnonymousClass1SK(C16570tH r1, C17160ud r2, C16000sG r3, C16080sP r4, AnonymousClass120 r5, C17200uh r6, AnonymousClass152 r7, AnonymousClass01V r8, C16980tz r9, C19380yL r10, C17240ul r11, C16220sf r12, C216014s r13, C16320sq r14) {
        this.A08 = r9;
        this.A0D = r14;
        this.A0C = r13;
        this.A05 = r6;
        this.A01 = r2;
        this.A02 = r3;
        this.A07 = r8;
        this.A03 = r4;
        this.A0A = r11;
        this.A0B = r12;
        this.A04 = r5;
        this.A09 = r10;
        this.A00 = r1;
        this.A06 = r7;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: android.text.SpannableString} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v8, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: java.lang.String} */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x039e, code lost:
        if (X.C41971wz.A0A() == false) goto L_0x0410;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01b8, code lost:
        if (r8.A00 >= 0) goto L_0x01ba;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Notification A00(android.content.Context r39, X.C52122dA r40, X.C18380wb r41, int r42, boolean r43) {
        /*
            r38 = this;
            java.lang.String r0 = "voip/CallNotificationBuilder type = "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r0 = 1
            r7 = r42
            if (r7 == r0) goto L_0x0165
            r0 = 2
            if (r7 == r0) goto L_0x0161
            java.lang.String r1 = "UNKNOWN notification type "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            X.AnonymousClass00B.A08(r0)
            java.lang.String r0 = "NOTIFICATION_INVALID"
        L_0x0023:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r8 = r40
            long r2 = r8.A01
            boolean r0 = r8.A07
            r28 = r0
            com.whatsapp.jid.GroupJid r14 = r8.A02
            r6 = r38
            X.0sG r13 = r6.A02
            X.0sP r4 = r6.A03
            X.14s r0 = r6.A0C
            r15 = r0
            X.0ul r0 = r6.A0A
            r16 = r0
            java.lang.String r27 = X.C30341cC.A09(r13, r4, r0, r14, r15)
            X.0tz r0 = r6.A08
            android.content.Context r4 = r0.A00
            r1 = 0
            r11 = 1
            r0 = 0
            if (r27 == 0) goto L_0x0052
            r0 = 1
        L_0x0052:
            java.lang.String r26 = r6.A02(r4, r8, r0)
            java.lang.String r25 = r6.A02(r4, r8, r1)
            r4 = 0
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            boolean r0 = r8.A0E
            r24 = r0
            if (r1 <= 0) goto L_0x014b
            r5 = 2131232237(0x7f0805ed, float:1.8080578E38)
            if (r0 == 0) goto L_0x006c
            r5 = 2131232238(0x7f0805ee, float:1.808058E38)
        L_0x006c:
            r9 = r39
            r37 = r43
            r0 = r37
            android.content.Intent r10 = r6.A01(r9, r8, r7, r0)
            java.lang.String r23 = "lobbyEntryPoint"
            r0 = r23
            r10.putExtra(r0, r11)
            r0 = r37
            android.content.Intent r4 = r6.A01(r9, r8, r7, r0)
            r1 = 6
            r0 = r23
            r4.putExtra(r0, r1)
            r0 = r14
            if (r14 != 0) goto L_0x008e
            com.whatsapp.jid.UserJid r0 = r8.A03
        L_0x008e:
            if (r0 == 0) goto L_0x0099
            java.lang.String r1 = r0.getRawString()
            java.lang.String r0 = "attributed_call_jid"
            r10.putExtra(r0, r1)
        L_0x0099:
            r1 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r22 = X.C42341xd.A00(r9, r11, r10, r1)
            r0 = 4
            android.app.PendingIntent r21 = X.C42341xd.A00(r9, r0, r4, r1)
            android.content.res.Resources r12 = r9.getResources()
            r0 = 17104901(0x1050005, float:2.4428256E-38)
            int r1 = r12.getDimensionPixelSize(r0)
            r0 = 17104902(0x1050006, float:2.442826E-38)
            int r0 = r12.getDimensionPixelSize(r0)
            int r4 = java.lang.Math.min(r1, r0)
            r10 = 0
            if (r4 <= 0) goto L_0x0169
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x0148
            boolean r0 = r8.A08
            if (r0 == 0) goto L_0x00c9
            if (r14 == 0) goto L_0x0148
        L_0x00c9:
            r19 = -1
        L_0x00cb:
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            r0 = r16
            X.0sH r14 = X.C30341cC.A02(r13, r0, r14, r15)
            if (r14 == 0) goto L_0x0125
            r0 = r17
            r0.add(r14)
        L_0x00e7:
            java.util.Iterator r17 = r17.iterator()
        L_0x00eb:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0170
            java.lang.Object r14 = r17.next()
            X.0sH r14 = (X.C16010sH) r14
            X.120 r15 = r6.A04
            r0 = r19
            float r0 = (float) r0
            r20 = r0
            java.lang.String r16 = r14.A0C(r0, r4)
            X.1Cv r0 = r15.A02
            X.1kk r0 = r0.A01()
            r15 = r16
            java.lang.Object r15 = r0.A00(r15)
            if (r15 != 0) goto L_0x0121
            X.0ud r15 = r6.A01
            r0 = r20
            android.graphics.Bitmap r15 = r15.A04(r14, r0, r4)
            boolean r0 = r14.A0Z
            if (r0 == 0) goto L_0x0121
            r0 = r18
            r0.add(r14)
        L_0x0121:
            r1.add(r15)
            goto L_0x00eb
        L_0x0125:
            java.util.List r0 = r8.A06
            java.util.Iterator r16 = r0.iterator()
        L_0x012b:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x00e7
            java.lang.Object r15 = r16.next()
            X.0rv r15 = (X.C15830rv) r15
            int r14 = r17.size()
            r0 = 3
            if (r14 >= r0) goto L_0x00e7
            X.0sH r14 = r13.A0A(r15)
            r0 = r17
            r0.add(r14)
            goto L_0x012b
        L_0x0148:
            r19 = 0
            goto L_0x00cb
        L_0x014b:
            if (r28 == 0) goto L_0x0157
            r5 = 2131232239(0x7f0805ef, float:1.8080582E38)
            if (r0 == 0) goto L_0x006c
            r5 = 2131232240(0x7f0805f0, float:1.8080584E38)
            goto L_0x006c
        L_0x0157:
            r5 = 2131232233(0x7f0805e9, float:1.808057E38)
            if (r0 == 0) goto L_0x006c
            r5 = 2131232234(0x7f0805ea, float:1.8080571E38)
            goto L_0x006c
        L_0x0161:
            java.lang.String r0 = "NOTIFICATION_MUTE"
            goto L_0x0023
        L_0x0165:
            java.lang.String r0 = "NOTIFICATION_HEADS_UP"
            goto L_0x0023
        L_0x0169:
            java.lang.String r0 = "voip/CallNotificationBuilder/thumb-size-is-0"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x01a8
        L_0x0170:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0183
            int r0 = r1.size()
            if (r0 != r11) goto L_0x0381
            r0 = 0
            java.lang.Object r10 = r1.get(r0)
            android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
        L_0x0183:
            boolean r0 = r18.isEmpty()
            if (r0 != 0) goto L_0x01a8
            X.0sq r12 = r6.A0D
            X.152 r0 = r6.A06
            X.2dC r1 = new X.2dC
            r31 = r41
            r29 = r1
            r30 = r9
            r32 = r0
            r33 = r18
            r34 = r4
            r35 = r19
            r36 = r7
            r29.<init>(r30, r31, r32, r33, r34, r35, r36)
            r0 = 0
            java.lang.Void[] r0 = new java.lang.Void[r0]
            r12.Ack(r1, r0)
        L_0x01a8:
            com.whatsapp.jid.UserJid r0 = r8.A03
            X.0sH r20 = r13.A0A(r0)
            r12 = 0
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ba
            int r0 = r8.A00
            r19 = 1
            if (r0 < 0) goto L_0x01bc
        L_0x01ba:
            r19 = 0
        L_0x01bc:
            X.03l r4 = X.C218415q.A00(r9)
            java.lang.String r18 = "call"
            r0 = r18
            r4.A0I = r0
            r4.A03 = r11
            if (r19 == 0) goto L_0x01d4
            r4.A0W = r11
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            r4.A05(r0)
        L_0x01d4:
            r0 = r26
            r4.A09(r0)
            androidx.core.app.NotificationCompat$BigTextStyle r1 = new androidx.core.app.NotificationCompat$BigTextStyle
            r1.<init>()
            r1.A09(r0)
            r4.A08(r1)
            r0 = r22
            r4.A09 = r0
            int r1 = r8.A00
            r0 = 0
            if (r1 < 0) goto L_0x01ee
            r0 = 1
        L_0x01ee:
            if (r0 == 0) goto L_0x01f3
            r4.A0D(r11)
        L_0x01f3:
            r4.A06(r10)
            android.app.Notification r10 = r4.A07
            r10.icon = r5
            if (r7 != r11) goto L_0x0209
            if (r0 != 0) goto L_0x0209
            r0 = r21
            r4.A0A = r0
            r1 = 128(0x80, float:1.794E-43)
            int r0 = r10.flags
            r1 = r1 | r0
            r10.flags = r1
        L_0x0209:
            r10 = 0
            r0 = r27
            r6.A03(r9, r4, r8, r0)
            r16 = 0
            if (r28 != 0) goto L_0x0354
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x0354
            boolean r0 = r8.A0A
            if (r0 == 0) goto L_0x0225
            com.whatsapp.voipcalling.CallState r1 = r8.A04
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x02f7
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE_ELSEWHERE
            if (r1 == r0) goto L_0x02f7
        L_0x0225:
            java.lang.String r1 = "reject_call"
            java.lang.Class<com.obwhatsapp.calling.service.VoiceFGService> r0 = com.obwhatsapp.calling.service.VoiceFGService.class
            android.content.Intent r11 = new android.content.Intent
            r11.<init>(r9, r0)
            r11.setAction(r1)
            java.lang.String r0 = r8.A05
            r28 = r0
            java.lang.String r1 = "call_id"
            r11.putExtra(r1, r0)
            boolean r12 = r8.A0D
            r1 = 4
            if (r12 == 0) goto L_0x0241
            r1 = 11
        L_0x0241:
            java.lang.String r0 = "call_ui_action"
            r11.putExtra(r0, r1)
            r1 = 134217728(0x8000000, float:3.85186E-34)
            boolean r0 = X.C42341xd.A00
            if (r0 == 0) goto L_0x024e
            r1 = 201326592(0xc000000, float:9.8607613E-32)
        L_0x024e:
            android.app.PendingIntent r15 = android.app.PendingIntent.getService(r9, r10, r11, r1)
            boolean r11 = r8.A08
            r0 = 2131891170(0x7f1213e2, float:1.9417052E38)
            r13 = 2131099880(0x7f0600e8, float:1.7812126E38)
            if (r11 == 0) goto L_0x0262
            r0 = 2131892926(0x7f121abe, float:1.9420614E38)
            r13 = 2131099881(0x7f0600e9, float:1.7812128E38)
        L_0x0262:
            java.lang.String r1 = r9.getString(r0)
            int r14 = android.os.Build.VERSION.SDK_INT
            r0 = 25
            if (r14 < r0) goto L_0x0351
            r0 = 1
            if (r7 != r0) goto L_0x0351
            android.text.SpannableString r14 = new android.text.SpannableString
            r14.<init>(r1)
            int r0 = r9.getColor(r13)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r0)
            int r0 = r14.length()
            r14.setSpan(r1, r10, r0, r10)
        L_0x0284:
            r13 = 2131231410(0x7f0802b2, float:1.80789E38)
            X.04E r1 = new X.04E
            r1.<init>(r13, r14, r15)
            java.util.ArrayList r0 = r4.A0N
            r21 = r0
            r0.add(r1)
            r13 = 2
            if (r11 != 0) goto L_0x033a
            r15 = 3
            if (r12 == 0) goto L_0x029b
            r15 = 10
        L_0x029b:
            X.0tH r0 = r6.A00
            boolean r0 = r0.A00
            r1 = r0 ^ 1
            X.0ph r0 = new X.0ph
            r0.<init>()
            r14 = r1
            r1 = r0
            r0 = r28
            android.content.Intent r1 = r1.A11(r9, r0, r15, r14)
            java.lang.String r14 = "fgservice_start_failed"
            r0 = r37
            r1.putExtra(r14, r0)
        L_0x02b5:
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r14 = X.C42341xd.A00(r9, r13, r1, r0)
            r13 = 2131231401(0x7f0802a9, float:1.8078882E38)
            if (r24 == 0) goto L_0x02c3
            r13 = 2131231439(0x7f0802cf, float:1.807896E38)
        L_0x02c3:
            if (r11 == 0) goto L_0x0331
            r0 = 2131892944(0x7f121ad0, float:1.942065E38)
        L_0x02c8:
            r12 = 2131099879(0x7f0600e7, float:1.7812124E38)
            java.lang.String r1 = r9.getString(r0)
            int r11 = android.os.Build.VERSION.SDK_INT
            r0 = 25
            if (r11 < r0) goto L_0x032f
            r0 = 1
            if (r7 != r0) goto L_0x032f
            android.text.SpannableString r11 = new android.text.SpannableString
            r11.<init>(r1)
            int r0 = r9.getColor(r12)
            android.text.style.ForegroundColorSpan r1 = new android.text.style.ForegroundColorSpan
            r1.<init>(r0)
            int r0 = r11.length()
            r11.setSpan(r1, r10, r0, r10)
        L_0x02ed:
            X.04E r1 = new X.04E
            r1.<init>(r13, r11, r14)
            r0 = r21
            r0.add(r1)
        L_0x02f7:
            java.lang.String r0 = "call_notification_group"
            r4.A0K = r0
            r0 = 1
            r4.A0S = r0
        L_0x02fe:
            int r0 = android.os.Build.VERSION.SDK_INT
            r10 = 21
            if (r0 < r10) goto L_0x03a5
            X.03l r11 = X.C218415q.A00(r9)
            r0 = r18
            r11.A0I = r0
            r0 = 1
            r11.A03 = r0
            if (r19 == 0) goto L_0x031b
            r11.A0W = r0
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            r11.A05(r0)
        L_0x031b:
            r0 = r25
            r11.A09(r0)
            r0 = 2131893204(0x7f121bd4, float:1.9421178E38)
            java.lang.String r0 = r9.getString(r0)
            r11.A0A(r0)
            android.app.Notification r0 = r11.A07
            r0.icon = r5
            goto L_0x0392
        L_0x032f:
            r11 = r1
            goto L_0x02ed
        L_0x0331:
            r0 = 2131886319(0x7f1200ef, float:1.9407213E38)
            if (r12 == 0) goto L_0x02c8
            r0 = 2131892877(0x7f121a8d, float:1.9420515E38)
            goto L_0x02c8
        L_0x033a:
            r0 = r37
            android.content.Intent r1 = r6.A01(r9, r8, r7, r0)
            r0 = r23
            r1.putExtra(r0, r13)
            if (r12 == 0) goto L_0x034e
            java.lang.String r0 = "com.obwhatsapp.intent.action.SHOW_INCOMING_PENDING_CALL_ON_LOCK_SCREEN"
        L_0x0349:
            r1.setAction(r0)
            goto L_0x02b5
        L_0x034e:
            java.lang.String r0 = "join_call"
            goto L_0x0349
        L_0x0351:
            r14 = r1
            goto L_0x0284
        L_0x0354:
            java.lang.Class<com.obwhatsapp.calling.service.VoiceFGService> r0 = com.obwhatsapp.calling.service.VoiceFGService.class
            android.content.Intent r10 = new android.content.Intent
            r10.<init>(r9, r0)
            java.lang.String r0 = "hangup_call"
            r10.setAction(r0)
            java.lang.String r0 = "end_call_reason"
            r10.putExtra(r0, r11)
            r1 = 134217728(0x8000000, float:3.85186E-34)
            boolean r0 = X.C42341xd.A00
            if (r0 == 0) goto L_0x036d
            r1 = 201326592(0xc000000, float:9.8607613E-32)
        L_0x036d:
            r0 = 0
            android.app.PendingIntent r10 = android.app.PendingIntent.getService(r9, r0, r10, r1)
            r1 = 2131231410(0x7f0802b2, float:1.80789E38)
            r0 = 2131888929(0x7f120b21, float:1.9412507E38)
            java.lang.String r0 = r9.getString(r0)
            r4.A04(r1, r0, r10)
            goto L_0x02fe
        L_0x0381:
            r0 = 2131167048(0x7f070748, float:1.7948359E38)
            float r0 = r12.getDimension(r0)
            float r0 = com.obwhatsapp.yo.yo.setSQPC((float) r0)
            android.graphics.Bitmap r10 = X.C17200uh.A01(r1, r0)
            goto L_0x0183
        L_0x0392:
            android.app.Notification r0 = r11.A01()     // Catch:{ SecurityException -> 0x0399 }
            r4.A08 = r0     // Catch:{ SecurityException -> 0x0399 }
            goto L_0x03a0
        L_0x0399:
            r1 = move-exception
            boolean r0 = X.C41971wz.A0A()
            if (r0 == 0) goto L_0x0410
        L_0x03a0:
            r0 = r20
            r6.A04(r4, r8, r0, r7)
        L_0x03a5:
            android.app.Notification r4 = r4.A01()     // Catch:{ SecurityException -> 0x03e5 }
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x03d2
            android.widget.RemoteViews r0 = r4.bigContentView
            if (r0 == 0) goto L_0x03d2
            java.lang.String r0 = "com.android.internal.R$id"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch:{ Exception -> 0x03cb }
            java.lang.String r0 = "time"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r0)     // Catch:{ Exception -> 0x03cb }
            r0 = 0
            int r2 = r1.getInt(r0)     // Catch:{ Exception -> 0x03cb }
            android.widget.RemoteViews r1 = r4.bigContentView     // Catch:{ Exception -> 0x03cb }
            r0 = 8
            r1.setViewVisibility(r2, r0)     // Catch:{ Exception -> 0x03cb }
            goto L_0x03d2
        L_0x03cb:
            r1 = move-exception
            java.lang.String r0 = "voip/service/notification/time-ui-gone"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x03d2:
            java.lang.String r1 = "voip/CallNotificationBuilder "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r4
        L_0x03e5:
            r1 = move-exception
            boolean r0 = X.C41971wz.A0A()
            if (r0 == 0) goto L_0x0410
            X.03l r1 = X.C218415q.A00(r9)
            r0 = r26
            r1.A09(r0)
            r0 = r22
            r1.A09 = r0
            android.app.Notification r0 = r1.A07
            r0.icon = r5
            r0 = r27
            r6.A03(r9, r1, r8, r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r10) goto L_0x040b
            r0 = r20
            r6.A04(r1, r8, r0, r7)
        L_0x040b:
            android.app.Notification r0 = r1.A01()
            return r0
        L_0x0410:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SK.A00(android.content.Context, X.2dA, X.0wb, int, boolean):android.app.Notification");
    }

    public Intent A01(Context context, C52122dA r6, int i2, boolean z2) {
        Intent A10 = new C14750ph().A10(context, r6.A03, Boolean.valueOf(!this.A00.A00));
        String str = r6.A05;
        A10.setData(Uri.parse(str));
        A10.putExtra("notification_type", i2);
        A10.putExtra("call_id", str);
        if (r6.A0D) {
            A10.setAction("com.obwhatsapp.intent.action.SHOW_INCOMING_PENDING_CALL_ON_LOCK_SCREEN");
        }
        if (r6.A0A && r6.A04 == CallState.NONE) {
            A10.putExtra("joinable", true);
        }
        A10.putExtra("fgservice_start_failed", z2);
        return A10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006b, code lost:
        if (r0 != false) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A02(android.content.Context r10, X.C52122dA r11, boolean r12) {
        /*
            r9 = this;
            long r0 = r11.A01
            boolean r3 = r11.A07
            boolean r2 = r11.A0B
            if (r2 == 0) goto L_0x0010
            r1 = 2131892989(0x7f121afd, float:1.9420742E38)
        L_0x000b:
            java.lang.String r0 = r10.getString(r1)
            return r0
        L_0x0010:
            r7 = 0
            r6 = 0
            r4 = 1
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 <= 0) goto L_0x005e
            boolean r0 = r11.A08
            if (r0 != 0) goto L_0x0027
            boolean r0 = r11.A0E
            r1 = 2131892835(0x7f121a63, float:1.942043E38)
            if (r0 == 0) goto L_0x000b
            r1 = 2131889805(0x7f120e8d, float:1.9414284E38)
            goto L_0x000b
        L_0x0027:
            int r5 = r11.A00
            if (r5 < 0) goto L_0x0046
            android.content.res.Resources r3 = r10.getResources()
            boolean r0 = r11.A0E
            r2 = 2131755397(0x7f100185, float:1.9141672E38)
            if (r0 == 0) goto L_0x0039
            r2 = 2131755391(0x7f10017f, float:1.914166E38)
        L_0x0039:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r1[r6] = r0
            java.lang.String r0 = r3.getQuantityString(r2, r5, r1)
            return r0
        L_0x0046:
            boolean r1 = r11.A09
            boolean r0 = r11.A0E
            if (r1 == 0) goto L_0x0055
            r1 = 2131889770(0x7f120e6a, float:1.9414213E38)
            if (r0 == 0) goto L_0x000b
            r1 = 2131889769(0x7f120e69, float:1.941421E38)
            goto L_0x000b
        L_0x0055:
            r1 = 2131889804(0x7f120e8c, float:1.9414282E38)
            if (r0 == 0) goto L_0x000b
            r1 = 2131889803(0x7f120e8b, float:1.941428E38)
            goto L_0x000b
        L_0x005e:
            if (r3 == 0) goto L_0x0071
            com.whatsapp.voipcalling.CallState r1 = r11.A04
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.PRE_ACCEPT_RECEIVED
            if (r1 != r0) goto L_0x006d
            boolean r0 = r11.A0C
            r1 = 2131891322(0x7f12147a, float:1.941736E38)
            if (r0 == 0) goto L_0x000b
        L_0x006d:
            r1 = 2131886973(0x7f12037d, float:1.940854E38)
            goto L_0x000b
        L_0x0071:
            boolean r0 = r11.A08
            if (r0 == 0) goto L_0x00c6
            java.util.List r0 = r11.A06
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x00c6
            if (r12 == 0) goto L_0x00a0
            X.0sG r1 = r9.A02
            com.whatsapp.jid.UserJid r0 = r11.A03
            X.0sH r3 = r1.A0A(r0)
            boolean r0 = r11.A0E
            r2 = 2131888346(0x7f1208da, float:1.9411325E38)
            if (r0 == 0) goto L_0x0091
            r2 = 2131888344(0x7f1208d8, float:1.941132E38)
        L_0x0091:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            X.0sP r0 = r9.A03
            java.lang.String r0 = r0.A0C(r3)
            r1[r6] = r0
            java.lang.String r0 = r10.getString(r2, r1)
            return r0
        L_0x00a0:
            boolean r0 = r11.A0A
            if (r0 == 0) goto L_0x00ae
            com.whatsapp.voipcalling.CallState r1 = r11.A04
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x00ba
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE_ELSEWHERE
            if (r1 == r0) goto L_0x00ba
        L_0x00ae:
            boolean r0 = r11.A0E
            r1 = 2131888997(0x7f120b65, float:1.9412645E38)
            if (r0 == 0) goto L_0x000b
            r1 = 2131888995(0x7f120b63, float:1.9412641E38)
            goto L_0x000b
        L_0x00ba:
            boolean r0 = r11.A0E
            r1 = 2131892964(0x7f121ae4, float:1.9420691E38)
            if (r0 == 0) goto L_0x000b
            r1 = 2131892961(0x7f121ae1, float:1.9420685E38)
            goto L_0x000b
        L_0x00c6:
            boolean r0 = r11.A0E
            r1 = 2131888999(0x7f120b67, float:1.941265E38)
            if (r0 == 0) goto L_0x000b
            r1 = 2131892674(0x7f1219c2, float:1.9420103E38)
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SK.A02(android.content.Context, X.2dA, boolean):java.lang.String");
    }

    public final void A03(Context context, C007503l r7, C52122dA r8, String str) {
        String A002;
        if (str != null) {
            r7.A0A(str);
            return;
        }
        if (!r8.A08) {
            A002 = C40651uT.A03(this.A03.A08(this.A02.A0A(r8.A03)));
        } else if (r8.A01 <= 0) {
            AnonymousClass2Wj A022 = C52142dD.A02(this.A02, this.A03, r8.A06, 2, false);
            A002 = A022 == null ? null : A022.A00(context);
        } else {
            return;
        }
        r7.A0A(A002);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(X.C007503l r7, X.C52122dA r8, X.C16010sH r9, int r10) {
        /*
            r6 = this;
            int r5 = android.os.Build.VERSION.SDK_INT
            r4 = 26
            if (r5 < r4) goto L_0x006a
            X.0sf r1 = r6.A0B
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r0 = r9.A08(r0)
            X.AnonymousClass00B.A06(r0)
            java.lang.String r0 = r0.getRawString()
            X.1WS r3 = r1.A07(r0)
            X.1v2 r3 = (X.C41001v2) r3
        L_0x001b:
            r2 = 1
            if (r10 == r2) goto L_0x002c
            boolean r0 = r8.A0A
            if (r0 == 0) goto L_0x004e
            com.whatsapp.voipcalling.CallState r1 = r8.A04
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.NONE
            if (r1 == r0) goto L_0x002c
            com.whatsapp.voipcalling.CallState r0 = com.whatsapp.voipcalling.CallState.ACTIVE_ELSEWHERE
            if (r1 != r0) goto L_0x004e
        L_0x002c:
            r7.A03 = r2
            if (r5 < r4) goto L_0x0036
            java.lang.String r0 = r3.A0E()
        L_0x0034:
            r7.A0J = r0
        L_0x0036:
            X.01V r0 = r6.A07
            android.content.ContentResolver r1 = r0.A0C()
            if (r1 == 0) goto L_0x006c
            X.0sG r0 = r6.A02
            android.net.Uri r0 = r0.A04(r1, r9)
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = r0.toString()
            r7.A0C(r0)
        L_0x004d:
            return
        L_0x004e:
            r0 = 2
            if (r10 != r0) goto L_0x0058
            if (r5 < r4) goto L_0x0036
            java.lang.String r0 = r3.A0D()
            goto L_0x0034
        L_0x0058:
            java.lang.String r1 = "UNKNOWN NOTIFICATION TYPE "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            X.AnonymousClass00B.A08(r0)
            goto L_0x0036
        L_0x006a:
            r3 = 0
            goto L_0x001b
        L_0x006c:
            java.lang.String r0 = "voip/CallNotificationBuilder/addContactToNotification cr == null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1SK.A04(X.03l, X.2dA, X.0sH, int):void");
    }
}
