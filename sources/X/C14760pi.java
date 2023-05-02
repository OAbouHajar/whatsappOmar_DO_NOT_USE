package X;

import android.content.SharedPreferences;
import com.facebook.redex.RunnableRunnableShape0S0110000_I0;
import com.facebook.redex.RunnableRunnableShape5S0100000_I0_4;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.0pi  reason: invalid class name and case insensitive filesystem */
public class C14760pi {
    public List A00;
    public final C14870pt A01;
    public final AnonymousClass18Z A02;
    public final C17650vQ A03;
    public final C16000sG A04;
    public final C16080sP A05;
    public final C17200uh A06;
    public final AnonymousClass01V A07;
    public final C16980tz A08;
    public final C19380yL A09;
    public final C15860rz A0A;
    public final AnonymousClass013 A0B;
    public final AnonymousClass1D0 A0C;
    public final AnonymousClass11A A0D;
    public final C16900tq A0E;
    public final AnonymousClass15N A0F;
    public final C17240ul A0G;
    public final C16220sf A0H;
    public final C216014s A0I;
    public final AnonymousClass15O A0J;
    public final C16320sq A0K;
    public final AnonymousClass15A A0L;

    public C14760pi(C14870pt r2, AnonymousClass18Z r3, C17650vQ r4, C16000sG r5, C16080sP r6, C17200uh r7, AnonymousClass01V r8, C16980tz r9, C19380yL r10, C15860rz r11, AnonymousClass013 r12, AnonymousClass1D0 r13, AnonymousClass11A r14, C16900tq r15, AnonymousClass15N r16, C17240ul r17, C16220sf r18, C216014s r19, AnonymousClass15O r20, C16320sq r21, AnonymousClass15A r22) {
        this.A08 = r9;
        this.A01 = r2;
        this.A0K = r21;
        this.A0I = r19;
        this.A0L = r22;
        this.A06 = r7;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r5;
        this.A07 = r8;
        this.A05 = r6;
        this.A0B = r12;
        this.A0J = r20;
        this.A0G = r17;
        this.A0C = r13;
        this.A0H = r18;
        this.A0F = r16;
        this.A0E = r15;
        this.A0A = r11;
        this.A0D = r14;
        this.A09 = r10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:176:0x04ee, code lost:
        if (X.C41971wz.A0A() == false) goto L_0x0563;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x054e, code lost:
        if (X.C41971wz.A0A() == false) goto L_0x0563;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0563, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0089, code lost:
        if (r3.A0I == false) goto L_0x008b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0092, code lost:
        if (r3.A0I != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009d, code lost:
        if (r3.A0A() == false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0102, code lost:
        if (r14 != false) goto L_0x0104;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00a3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A00(X.C14760pi r27, boolean r28) {
        /*
            r5 = r27
            X.0tq r0 = r5.A0E
            r0.A04()
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x003c
            r5.A03()
            monitor-enter(r5)
            java.util.List r0 = r5.A00     // Catch:{ all -> 0x0018 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0018 }
            r4.<init>(r0)     // Catch:{ all -> 0x0018 }
            monitor-exit(r5)     // Catch:{ all -> 0x0018 }
            goto L_0x001b
        L_0x0018:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0018 }
            throw r4
        L_0x001b:
            X.0tz r0 = r5.A08
            android.content.Context r6 = r0.A00
            boolean r0 = r4.isEmpty()
            r8 = 1
            r7 = r28
            if (r0 == 0) goto L_0x003d
            java.lang.String r1 = "missedcallnotification/update cancel "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5.A02()
        L_0x003c:
            return
        L_0x003d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.util.HashSet r9 = new java.util.HashSet
            r9.<init>()
            java.util.Iterator r15 = r4.iterator()
            r14 = 1
            r13 = 1
            r20 = 1
            r19 = 0
            r16 = 1
        L_0x0053:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x00ca
            java.lang.Object r3 = r15.next()
            X.1po r3 = (X.C37831po) r3
            com.whatsapp.jid.GroupJid r12 = r3.A04
            if (r12 == 0) goto L_0x00c1
            X.0sG r11 = r5.A04
            X.0sP r10 = r5.A05
            X.14s r1 = r5.A0I
            X.0ul r0 = r5.A0G
            java.lang.String r0 = X.C30341cC.A09(r11, r10, r0, r12, r1)
            if (r0 == 0) goto L_0x00c1
            com.whatsapp.jid.GroupJid r0 = r3.A04
            r9.add(r0)
            r1 = 1
        L_0x0077:
            if (r19 != 0) goto L_0x0083
            boolean r0 = r3.A0A()
            if (r0 == 0) goto L_0x0083
            if (r1 != 0) goto L_0x0083
            r19 = 1
        L_0x0083:
            if (r20 == 0) goto L_0x008b
            boolean r0 = r3.A0I
            r20 = 1
            if (r0 != 0) goto L_0x008d
        L_0x008b:
            r20 = 0
        L_0x008d:
            if (r14 == 0) goto L_0x0094
            boolean r0 = r3.A0I
            r14 = 1
            if (r0 == 0) goto L_0x0095
        L_0x0094:
            r14 = 0
        L_0x0095:
            if (r16 == 0) goto L_0x009f
            boolean r0 = r3.A0A()
            r16 = 1
            if (r0 != 0) goto L_0x00a1
        L_0x009f:
            r16 = 0
        L_0x00a1:
            if (r13 == 0) goto L_0x00aa
            boolean r0 = r3.A0A()
            r13 = 1
            if (r0 == 0) goto L_0x00ab
        L_0x00aa:
            r13 = 0
        L_0x00ab:
            X.1lE r1 = r3.A0C
            java.lang.String r0 = r1.A02
            r2.append(r0)
            com.whatsapp.jid.UserJid r0 = r1.A01
            java.lang.String r0 = r0.getRawString()
            r2.append(r0)
            int r0 = r1.A00
            r2.append(r0)
            goto L_0x0053
        L_0x00c1:
            X.1lE r0 = r3.A0C
            com.whatsapp.jid.UserJid r0 = r0.A01
            r9.add(r0)
            r1 = 0
            goto L_0x0077
        L_0x00ca:
            java.lang.String r0 = r2.toString()
            java.lang.String r3 = X.C004101u.A02(r0)
            X.0rz r0 = r5.A0A
            r28 = r0
            X.01D r0 = r0.A01
            java.lang.Object r2 = r0.get()
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r1 = "dismissed_call_notification_hash"
            r0 = 0
            java.lang.String r0 = r2.getString(r1, r0)
            if (r3 == 0) goto L_0x00ff
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x00ff
            java.lang.String r1 = "missedcallnotification/same "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x00ff:
            if (r20 != 0) goto L_0x0104
            r15 = 1
            if (r14 == 0) goto L_0x0105
        L_0x0104:
            r15 = 0
        L_0x0105:
            java.lang.Class<com.obwhatsapp.notification.MissedCallNotificationDismissedReceiver> r0 = com.obwhatsapp.notification.MissedCallNotificationDismissedReceiver.class
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r6, r0)
            r0 = 4
            r13 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r12 = X.C42341xd.A01(r6, r0, r1, r13)
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.obwhatsapp.HomeActivity"
            android.content.Intent r1 = r2.setClassName(r1, r0)
            java.lang.String r0 = "com.obwhatsapp.intent.action.CALLS"
            android.content.Intent r11 = r1.setAction(r0)
            int r0 = r4.size()
            int r0 = r0 - r8
            java.lang.Object r10 = r4.get(r0)
            X.1po r10 = (X.C37831po) r10
            java.lang.String r1 = "attributed_call_jid"
            X.1lE r0 = r10.A0C
            com.whatsapp.jid.UserJid r2 = r0.A01
            java.lang.String r0 = r2.getRawString()
            r11.putExtra(r1, r0)
            r0 = 3
            android.app.PendingIntent r1 = X.C42341xd.A00(r6, r0, r11, r13)
            X.0sf r0 = r5.A0H
            r27 = r0
            java.lang.String r2 = r2.getRawString()
            X.1WS r18 = r0.A07(r2)
            X.03l r2 = X.C218415q.A00(r6)
            java.lang.String r17 = "call"
            r0 = r17
            r2.A0I = r0
            r2.A03 = r8
            android.app.Notification r11 = r2.A07
            r11.deleteIntent = r12
            r2.A09 = r1
            r2.A0D(r8)
            long r0 = r10.A0A
            r2.A05(r0)
            r0 = 2131232236(0x7f0805ec, float:1.8080576E38)
            r11.icon = r0
            X.01V r1 = r5.A07
            android.content.ContentResolver r12 = r1.A0C()
            if (r12 != 0) goto L_0x017d
            java.lang.String r0 = "missedcallnotification/update cr == null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x017d:
            java.util.Iterator r14 = r9.iterator()
        L_0x0181:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x01ae
            java.lang.Object r13 = r14.next()
            X.0rv r13 = (X.C15830rv) r13
            boolean r0 = r13 instanceof com.whatsapp.jid.UserJid
            X.0sG r10 = r5.A04
            if (r0 == 0) goto L_0x01a9
            X.0sH r0 = r10.A0A(r13)
        L_0x0197:
            if (r12 == 0) goto L_0x0181
            if (r0 == 0) goto L_0x0181
            android.net.Uri r0 = r10.A04(r12, r0)
            if (r0 == 0) goto L_0x0181
            java.lang.String r0 = r0.toString()
            r2.A0C(r0)
            goto L_0x0181
        L_0x01a9:
            X.0sH r0 = r10.A09(r13)
            goto L_0x0197
        L_0x01ae:
            r10 = 0
            r13 = 2
            if (r7 != 0) goto L_0x04dc
            X.0vQ r0 = r5.A03
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x04a2
            java.lang.String r11 = r18.A07()
        L_0x01be:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x01db
            android.net.Uri r22 = android.net.Uri.parse(r11)
            if (r22 == 0) goto L_0x01db
            X.15O r11 = r5.A0J
            X.15N r0 = r5.A0F
            r21 = r6
            r23 = r2
            r24 = r1
            r25 = r0
            r26 = r11
            X.C218415q.A09(r21, r22, r23, r24, r25, r26)
        L_0x01db:
            java.lang.String r0 = "missedcallnotification/update count:"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = r4.size()
            r1.append(r0)
            java.lang.String r0 = " contacts:"
            r1.append(r0)
            int r0 = r9.size()
            r1.append(r0)
            java.lang.String r0 = " quiet:"
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            int r0 = r9.size()
            if (r0 != r8) goto L_0x03e3
            if (r19 != 0) goto L_0x03e3
            java.util.Iterator r0 = r9.iterator()
            java.lang.Object r12 = r0.next()
            X.0rv r12 = (X.C15830rv) r12
            boolean r14 = r12 instanceof com.whatsapp.jid.UserJid
            X.0sG r0 = r5.A04
            if (r14 == 0) goto L_0x03dd
            X.0sH r11 = r0.A0A(r12)
        L_0x0220:
            int r1 = r4.size()
            if (r1 != r8) goto L_0x03b5
            if (r16 == 0) goto L_0x03a7
            r9 = 2131889526(0x7f120d76, float:1.9413718E38)
            if (r20 == 0) goto L_0x0230
            r9 = 2131892679(0x7f1219c7, float:1.9420113E38)
        L_0x0230:
            java.lang.Object[] r13 = new java.lang.Object[r8]
            X.0sP r8 = r5.A05
            r1 = 0
            java.lang.Object r15 = r4.get(r1)
            X.1po r15 = (X.C37831po) r15
            X.1lE r15 = r15.A0C
            com.whatsapp.jid.UserJid r15 = r15.A01
            X.0sH r0 = r0.A0A(r15)
            java.lang.String r0 = r8.A08(r0)
            r13[r1] = r0
            java.lang.String r0 = r6.getString(r9, r13)
        L_0x024d:
            r2.A09(r0)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 17104901(0x1050005, float:2.4428256E-38)
            int r8 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r6.getResources()
            r0 = 17104902(0x1050006, float:2.442826E-38)
            int r1 = r1.getDimensionPixelSize(r0)
            if (r11 == 0) goto L_0x0291
            X.0uh r0 = r5.A06
            android.graphics.Bitmap r0 = r0.A02(r6, r11, r8, r1)
            if (r0 == 0) goto L_0x0273
            r2.A06(r0)
        L_0x0273:
            X.0sP r0 = r5.A05
            java.lang.String r9 = r0.A08(r11)
            r8 = 2131889526(0x7f120d76, float:1.9413718E38)
            if (r20 == 0) goto L_0x0281
            r8 = 2131892679(0x7f1219c7, float:1.9420113E38)
        L_0x0281:
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 0
            r1[r0] = r9
            java.lang.String r0 = r6.getString(r8, r1)
            r2.A0B(r0)
            r2.A0A(r9)
        L_0x0291:
            if (r14 == 0) goto L_0x03a2
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r20)
            java.lang.Boolean r24 = java.lang.Boolean.TRUE
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.add(r12)
            r25 = r10
            r21 = r6
            r22 = r10
            r26 = r0
            android.content.Intent r8 = X.C14750ph.A0b(r21, r22, r23, r24, r25, r26)
            java.lang.String r0 = "com.obwhatsapp.intent.action.CALL_BACK"
            r8.setAction(r0)
            java.lang.String r1 = "fromCallNotification"
            r0 = 1
            r8.putExtra(r1, r0)
            r0 = 3
            r12 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r10 = X.C42341xd.A00(r6, r0, r8, r12)
        L_0x02bf:
            X.0ph r0 = new X.0ph
            r0.<init>()
            android.content.Intent r1 = r0.A0v(r6, r11)
            java.lang.String r0 = "MissedCallNotification"
            X.AnonymousClass22U.A01(r1, r0)
            java.lang.String r0 = "fromCallNotification"
            r9 = 1
            android.content.Intent r1 = r1.putExtra(r0, r9)
            java.lang.String r0 = "show_keyboard"
            android.content.Intent r1 = r1.putExtra(r0, r9)
            r0 = 3
            android.app.PendingIntent r9 = X.C42341xd.A00(r6, r0, r1, r12)
            if (r10 == 0) goto L_0x0307
            r1 = 2131231401(0x7f0802a9, float:1.8078882E38)
            if (r20 == 0) goto L_0x02ea
            r1 = 2131231439(0x7f0802cf, float:1.807896E38)
        L_0x02ea:
            r0 = 2131889525(0x7f120d75, float:1.9413716E38)
            java.lang.String r0 = r6.getString(r0)
            r2.A04(r1, r0, r10)
            boolean r0 = com.obwhatsapp.notification.DirectReplyService.A03()
            if (r0 == 0) goto L_0x0393
            java.lang.String r12 = "com.obwhatsapp.intent.action.DIRECT_REPLY_FROM_MISSED_CALL"
            r1 = 0
            r0 = 1
            X.04E r1 = com.obwhatsapp.notification.DirectReplyService.A00(r6, r11, r12, r1, r0)
            java.util.ArrayList r0 = r2.A0N
            r0.add(r1)
        L_0x0307:
            boolean r0 = com.obwhatsapp.notification.AndroidWear.A02()
            if (r0 == 0) goto L_0x0351
            X.0uh r1 = r5.A06
            r0 = 400(0x190, float:5.6E-43)
            android.graphics.Bitmap r12 = r1.A02(r6, r11, r0, r0)
            if (r12 == 0) goto L_0x0351
            X.04F r11 = new X.04F
            r11.<init>()
            r1 = 2
            int r0 = r11.A05
            r1 = r1 | r0
            r11.A05 = r1
            r11.A09 = r12
            if (r8 == 0) goto L_0x034e
            r8 = 2131231659(0x7f0803ab, float:1.8079405E38)
            r0 = 2131889525(0x7f120d75, float:1.9413716E38)
            java.lang.String r0 = r6.getString(r0)
            X.04E r1 = new X.04E
            r1.<init>(r8, r0, r10)
            java.util.ArrayList r0 = r11.A0C
            r0.add(r1)
            r8 = 2131231661(0x7f0803ad, float:1.807941E38)
            r0 = 2131889527(0x7f120d77, float:1.941372E38)
            java.lang.String r0 = r6.getString(r0)
            X.04E r1 = new X.04E
            r1.<init>(r8, r0, r9)
            java.util.ArrayList r0 = r11.A0C
            r0.add(r1)
        L_0x034e:
            r11.A01(r2)
        L_0x0351:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r1 < r0) goto L_0x04f0
            X.03l r8 = X.C218415q.A00(r6)
            r0 = r17
            r8.A0I = r0
            r9 = 1
            r8.A03 = r9
            r0 = 2131893204(0x7f121bd4, float:1.9421178E38)
            java.lang.String r0 = r6.getString(r0)
            r8.A0A(r0)
            X.013 r11 = r5.A0B
            r10 = 2131755219(0x7f1000d3, float:1.9141311E38)
            int r0 = r4.size()
            long r0 = (long) r0
            java.lang.Object[] r9 = new java.lang.Object[r9]
            int r4 = r4.size()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r4 = 0
            r9[r4] = r6
            java.lang.String r0 = r11.A0J(r9, r10, r0)
            r8.A09(r0)
            android.app.Notification r1 = r8.A07
            r0 = 2131232236(0x7f0805ec, float:1.8080576E38)
            r1.icon = r0
            goto L_0x04e2
        L_0x0393:
            r1 = 2131231416(0x7f0802b8, float:1.8078912E38)
            r0 = 2131889527(0x7f120d77, float:1.941372E38)
            java.lang.String r0 = r6.getString(r0)
            r2.A04(r1, r0, r9)
            goto L_0x0307
        L_0x03a2:
            r8 = r10
            r12 = 134217728(0x8000000, float:3.85186E-34)
            goto L_0x02bf
        L_0x03a7:
            r0 = 2131892818(0x7f121a52, float:1.9420395E38)
            if (r20 == 0) goto L_0x03af
            r0 = 2131892677(0x7f1219c5, float:1.942011E38)
        L_0x03af:
            java.lang.String r0 = r6.getString(r0)
            goto L_0x024d
        L_0x03b5:
            if (r15 == 0) goto L_0x03d4
            r13 = 2131755219(0x7f1000d3, float:1.9141311E38)
        L_0x03ba:
            X.013 r9 = r5.A0B
            int r0 = r4.size()
            long r0 = (long) r0
            java.lang.Object[] r15 = new java.lang.Object[r8]
            int r8 = r4.size()
            java.lang.Integer r16 = java.lang.Integer.valueOf(r8)
            r8 = 0
            r15[r8] = r16
            java.lang.String r0 = r9.A0J(r15, r13, r0)
            goto L_0x024d
        L_0x03d4:
            r13 = 2131755220(0x7f1000d4, float:1.9141313E38)
            if (r20 == 0) goto L_0x03ba
            r13 = 2131755392(0x7f100180, float:1.9141662E38)
            goto L_0x03ba
        L_0x03dd:
            X.0sH r11 = r0.A09(r12)
            goto L_0x0220
        L_0x03e3:
            if (r15 == 0) goto L_0x0483
            r13 = 2131755219(0x7f1000d3, float:1.9141311E38)
        L_0x03e8:
            X.013 r9 = r5.A0B
            int r0 = r4.size()
            long r0 = (long) r0
            r12 = 1
            java.lang.Object[] r11 = new java.lang.Object[r8]
            int r8 = r4.size()
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r8 = 0
            r11[r8] = r10
            java.lang.String r0 = r9.A0J(r11, r13, r0)
            r2.A0A(r0)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            int r11 = r4.size()
            int r11 = r11 - r12
        L_0x040e:
            if (r11 < 0) goto L_0x048d
            java.lang.Object r12 = r4.get(r11)
            X.1po r12 = (X.C37831po) r12
            com.whatsapp.jid.GroupJid r14 = r12.A04
            if (r14 == 0) goto L_0x0428
            X.0sG r13 = r5.A04
            X.0sP r8 = r5.A05
            X.14s r1 = r5.A0I
            X.0ul r0 = r5.A0G
            java.lang.String r1 = X.C30341cC.A09(r13, r8, r0, r14, r1)
            if (r1 != 0) goto L_0x0466
        L_0x0428:
            boolean r0 = r12.A0A()
            if (r0 == 0) goto L_0x0472
            java.util.List r0 = r12.A04()
            int r1 = r0.size()
            r0 = 1
            int r1 = r1 - r0
            long r0 = (long) r1
            r8 = 2
            java.lang.Object[] r13 = new java.lang.Object[r8]
            X.0sP r14 = r5.A05
            X.0sG r15 = r5.A04
            X.1lE r8 = r12.A0C
            com.whatsapp.jid.UserJid r8 = r8.A01
            X.0sH r8 = r15.A0A(r8)
            java.lang.String r14 = r14.A08(r8)
            r8 = 0
            r13[r8] = r14
            java.util.List r8 = r12.A04()
            int r8 = r8.size()
            r12 = 1
            int r8 = r8 - r12
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r13[r12] = r8
            r8 = 2131755192(0x7f1000b8, float:1.9141256E38)
            java.lang.String r1 = r9.A0J(r13, r8, r0)
        L_0x0466:
            boolean r0 = r10.contains(r1)
            if (r0 != 0) goto L_0x046f
            r10.add(r1)
        L_0x046f:
            int r11 = r11 + -1
            goto L_0x040e
        L_0x0472:
            X.0sP r8 = r5.A05
            X.0sG r1 = r5.A04
            X.1lE r0 = r12.A0C
            com.whatsapp.jid.UserJid r0 = r0.A01
            X.0sH r0 = r1.A0A(r0)
            java.lang.String r1 = r8.A08(r0)
            goto L_0x0466
        L_0x0483:
            r13 = 2131755220(0x7f1000d4, float:1.9141313E38)
            if (r20 == 0) goto L_0x03e8
            r13 = 2131755392(0x7f100180, float:1.9141662E38)
            goto L_0x03e8
        L_0x048d:
            r0 = 0
            java.lang.String r1 = X.C40631uR.A00(r9, r10, r0)
            r2.A09(r1)
            androidx.core.app.NotificationCompat$BigTextStyle r0 = new androidx.core.app.NotificationCompat$BigTextStyle
            r0.<init>()
            r0.A09(r1)
            r2.A08(r0)
            goto L_0x0351
        L_0x04a2:
            java.lang.String r12 = r18.A04()
            int r0 = r12.hashCode()
            switch(r0) {
                case 49: goto L_0x04b0;
                case 50: goto L_0x04bc;
                case 51: goto L_0x04c4;
                default: goto L_0x04ad;
            }
        L_0x04ad:
            r11 = r10
            goto L_0x01be
        L_0x04b0:
            java.lang.String r0 = "1"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x04ad
            r2.A02(r13)
            goto L_0x04ad
        L_0x04bc:
            java.lang.String r0 = "2"
            boolean r0 = r12.equals(r0)
            r12 = 1
            goto L_0x04cb
        L_0x04c4:
            java.lang.String r0 = "3"
            boolean r0 = r12.equals(r0)
            r12 = 2
        L_0x04cb:
            if (r0 == 0) goto L_0x04ad
            r0 = 5
            long[] r0 = new long[r0]
            if (r12 == r8) goto L_0x04d8
            r0 = {0, 750, 250, 750, 250} // fill-array
        L_0x04d5:
            r11.vibrate = r0
            goto L_0x04ad
        L_0x04d8:
            r0 = {0, 300, 200, 300, 200} // fill-array
            goto L_0x04d5
        L_0x04dc:
            r0 = 4
            r2.A02(r0)
            goto L_0x01db
        L_0x04e2:
            android.app.Notification r0 = r8.A01()     // Catch:{ SecurityException -> 0x04e9 }
            r2.A08 = r0     // Catch:{ SecurityException -> 0x04e9 }
            goto L_0x04f0
        L_0x04e9:
            r4 = move-exception
            boolean r0 = X.C41971wz.A0A()
            if (r0 == 0) goto L_0x0563
        L_0x04f0:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x0504
            r0 = r18
            X.1v2 r0 = (X.C41001v2) r0
            r18 = r0
            if (r7 == 0) goto L_0x0509
            java.lang.String r0 = r18.A0D()
        L_0x0502:
            r2.A0J = r0
        L_0x0504:
            android.app.Notification r2 = r2.A01()
            goto L_0x050e
        L_0x0509:
            java.lang.String r0 = r18.A0C()
            goto L_0x0502
        L_0x050e:
            X.0yL r1 = r5.A09     // Catch:{ SecurityException -> 0x0515 }
            r0 = 4
            r1.A02(r0, r2)     // Catch:{ SecurityException -> 0x0515 }
            goto L_0x0550
        L_0x0515:
            r4 = move-exception
            if (r7 != 0) goto L_0x0540
            boolean r0 = X.C41971wz.A04()
            if (r0 == 0) goto L_0x0540
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L_0x0540
            java.lang.String r0 = r2.getChannelId()
            if (r0 == 0) goto L_0x0540
            android.util.Pair r0 = X.C41031v7.A00(r0)
            if (r0 == 0) goto L_0x0540
            java.lang.Object r1 = r0.first
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x0540
            r0 = r27
            X.1WS r1 = r0.A07(r1)
            r0.A0J(r1)
            return
        L_0x0540:
            java.lang.String r0 = r4.toString()
            boolean r0 = X.C41971wz.A0C(r0)
            if (r0 != 0) goto L_0x0550
            boolean r0 = X.C41971wz.A0A()
            if (r0 == 0) goto L_0x0563
        L_0x0550:
            android.content.SharedPreferences$Editor r1 = r28.A0K()
            java.lang.String r0 = "last_call_notification_hash"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r3)
            r0.apply()
            X.18Z r0 = r5.A02
            r0.A01()
            return
        L_0x0563:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14760pi.A00(X.0pi, boolean):void");
    }

    public void A01() {
        A03();
        if (!this.A00.isEmpty()) {
            StringBuilder sb = new StringBuilder("missedcallnotification/clear ");
            sb.append(this.A00.size());
            Log.i(sb.toString());
            this.A0A.A0K().remove("first_missed_call").apply();
            this.A00.clear();
            A02();
            this.A01.A0K(new RunnableRunnableShape5S0100000_I0_4((Object) this.A0D, 9));
            this.A02.A01();
        }
    }

    public void A02() {
        StringBuilder sb = new StringBuilder("missedcallnotification/clearNotification updateHash=");
        sb.append(true);
        Log.i(sb.toString());
        this.A09.A03(4, (String) null);
        C15860rz r3 = this.A0A;
        r3.A0K().putString("dismissed_call_notification_hash", ((SharedPreferences) r3.A01.get()).getString("last_call_notification_hash", (String) null)).apply();
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008e */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0097 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00b8 */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:40:0x0097=Splitter:B:40:0x0097, B:35:0x008f=Splitter:B:35:0x008f} */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:42:0x0098=Splitter:B:42:0x0098, B:47:0x00b8=Splitter:B:47:0x00b8} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A03() {
        /*
            r18 = this;
            r17 = r18
            monitor-enter(r17)
            r0 = r17
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x0114 }
            if (r0 != 0) goto L_0x0112
            r0 = r17
            X.0rz r0 = r0.A0A     // Catch:{ all -> 0x0114 }
            X.01D r0 = r0.A01     // Catch:{ all -> 0x0114 }
            java.lang.Object r1 = r0.get()     // Catch:{ all -> 0x0114 }
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = "first_missed_call"
            r3 = 0
            long r1 = r1.getLong(r0, r3)     // Catch:{ all -> 0x0114 }
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c2
            r0 = r17
            X.1D0 r3 = r0.A0C     // Catch:{ all -> 0x0114 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0114 }
            r4.<init>()     // Catch:{ all -> 0x0114 }
            java.util.concurrent.locks.ReentrantReadWriteLock r5 = r3.A0M     // Catch:{ all -> 0x0114 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r5.readLock()     // Catch:{ all -> 0x0114 }
            r0.lock()     // Catch:{ all -> 0x0114 }
            X.199 r12 = r3.A07     // Catch:{ all -> 0x00b9 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x00b9 }
            r8.<init>()     // Catch:{ all -> 0x00b9 }
            X.0tq r0 = r12.A03     // Catch:{ all -> 0x00b9 }
            X.0tf r9 = r0.get()     // Catch:{ all -> 0x00b9 }
            X.0tg r11 = r9.A02     // Catch:{ all -> 0x00b4 }
            java.lang.String r6 = "SELECT _id, call_id, jid_row_id, from_me, transaction_id, timestamp, video_call, duration, call_result, is_dnd_mode_on, bytes_transferred, call_log.group_jid_row_id, is_joinable_group_call, call_creator_device_jid_row_id, call_random_id FROM call_log WHERE call_result = 2 AND from_me = 0 AND timestamp >= ? ORDER BY _id DESC LIMIT 100"
            r10 = 1
            java.lang.String[] r3 = new java.lang.String[r10]     // Catch:{ all -> 0x00b4 }
            java.lang.String r0 = java.lang.Long.toString(r1)     // Catch:{ all -> 0x00b4 }
            r16 = 0
            r3[r16] = r0     // Catch:{ all -> 0x00b4 }
            android.database.Cursor r7 = r11.A08(r6, r3)     // Catch:{ all -> 0x00b4 }
            if (r7 == 0) goto L_0x0098
            java.lang.String r0 = "_id"
            int r6 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0093 }
            boolean r0 = r7.moveToLast()     // Catch:{ all -> 0x0093 }
            if (r0 == 0) goto L_0x008f
        L_0x0061:
            long r14 = r7.getLong(r6)     // Catch:{ all -> 0x0093 }
            java.lang.String r13 = "SELECT _id, jid_row_id, call_result FROM call_log_participant_v2 WHERE call_log_row_id = ? ORDER BY _id"
            java.lang.String[] r3 = new java.lang.String[r10]     // Catch:{ all -> 0x0093 }
            java.lang.String r0 = java.lang.Long.toString(r14)     // Catch:{ all -> 0x0093 }
            r3[r16] = r0     // Catch:{ all -> 0x0093 }
            android.database.Cursor r3 = r11.A08(r13, r3)     // Catch:{ all -> 0x0093 }
            X.1po r0 = r12.A01(r7, r3)     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x007c
            r8.add(r0)     // Catch:{ all -> 0x0088 }
        L_0x007c:
            if (r3 == 0) goto L_0x0081
            r3.close()     // Catch:{ all -> 0x0093 }
        L_0x0081:
            boolean r0 = r7.moveToPrevious()     // Catch:{ all -> 0x0093 }
            if (r0 != 0) goto L_0x0061
            goto L_0x008f
        L_0x0088:
            r0 = move-exception
            if (r3 == 0) goto L_0x008e
            r3.close()     // Catch:{ all -> 0x008e }
        L_0x008e:
            throw r0     // Catch:{ all -> 0x0093 }
        L_0x008f:
            r7.close()     // Catch:{ all -> 0x00b4 }
            goto L_0x0098
        L_0x0093:
            r0 = move-exception
            r7.close()     // Catch:{ all -> 0x0097 }
        L_0x0097:
            throw r0     // Catch:{ all -> 0x00b4 }
        L_0x0098:
            r9.close()     // Catch:{ all -> 0x00b9 }
            java.lang.String r0 = "CallLogStore/getMissedCalls/size:"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b9 }
            r3.<init>(r0)     // Catch:{ all -> 0x00b9 }
            int r0 = r8.size()     // Catch:{ all -> 0x00b9 }
            r3.append(r0)     // Catch:{ all -> 0x00b9 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x00b9 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00b9 }
            r4.addAll(r8)     // Catch:{ all -> 0x00b9 }
            goto L_0x00c8
        L_0x00b4:
            r0 = move-exception
            r9.close()     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            throw r0     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            r1 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r5.readLock()     // Catch:{ all -> 0x0114 }
            r0.unlock()     // Catch:{ all -> 0x0114 }
            throw r1     // Catch:{ all -> 0x0114 }
        L_0x00c2:
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x0114 }
            r4.<init>()     // Catch:{ all -> 0x0114 }
            goto L_0x00ee
        L_0x00c8:
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r0 = r5.readLock()     // Catch:{ all -> 0x0114 }
            r0.unlock()     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = "CallsMessageStore/getMissedCalls/size:"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0114 }
            r3.<init>(r0)     // Catch:{ all -> 0x0114 }
            int r0 = r4.size()     // Catch:{ all -> 0x0114 }
            r3.append(r0)     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0114 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0114 }
            r3 = 16
            com.facebook.redex.IDxComparatorShape19S0000000_2_I0 r0 = new com.facebook.redex.IDxComparatorShape19S0000000_2_I0     // Catch:{ all -> 0x0114 }
            r0.<init>(r3)     // Catch:{ all -> 0x0114 }
            java.util.Collections.sort(r4, r0)     // Catch:{ all -> 0x0114 }
        L_0x00ee:
            r0 = r17
            r0.A00 = r4     // Catch:{ all -> 0x0114 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0114 }
            r3.<init>()     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = "missedcallnotification/init count:"
            r3.append(r0)     // Catch:{ all -> 0x0114 }
            int r0 = r4.size()     // Catch:{ all -> 0x0114 }
            r3.append(r0)     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = " timestamp:"
            r3.append(r0)     // Catch:{ all -> 0x0114 }
            r3.append(r1)     // Catch:{ all -> 0x0114 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0114 }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0114 }
        L_0x0112:
            monitor-exit(r17)
            return
        L_0x0114:
            r0 = move-exception
            monitor-exit(r17)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14760pi.A03():void");
    }

    public void A04(boolean z2) {
        this.A0K.Acl(new RunnableRunnableShape0S0110000_I0(this, 21, z2));
    }
}
