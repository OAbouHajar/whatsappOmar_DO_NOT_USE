package X;

import android.app.PendingIntent;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.obwhatsapp.R;
import com.obwhatsapp.notification.DirectReplyService;
import com.obwhatsapp.notification.MessageOTPNotificationBroadcastReceiver;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2Bx  reason: invalid class name and case insensitive filesystem */
public class C45992Bx implements Runnable {
    public final int A00;
    public final Context A01;
    public final C16570tH A02;
    public final AnonymousClass12E A03;
    public final C14870pt A04;
    public final C16040sK A05;
    public final C19740yv A06;
    public final AnonymousClass18Z A07;
    public final AnonymousClass01Y A08;
    public final C216514x A09;
    public final C17650vQ A0A;
    public final C17160ud A0B;
    public final C16000sG A0C;
    public final C17030uP A0D;
    public final C16080sP A0E;
    public final C17200uh A0F;
    public final C15800rs A0G;
    public final AnonymousClass15I A0H;
    public final C19610yi A0I;
    public final AnonymousClass17V A0J;
    public final AnonymousClass01V A0K;
    public final C16440t3 A0L;
    public final C19380yL A0M;
    public final C16260sj A0N;
    public final C15860rz A0O;
    public final AnonymousClass013 A0P;
    public final C15810rt A0Q;
    public final C16070sO A0R;
    public final AnonymousClass15N A0S;
    public final C14710pd A0T;
    public final C20260zl A0U;
    public final C221016q A0V;
    public final C18040w3 A0W;
    public final C17240ul A0X;
    public final C15830rv A0Y;
    public final C14770pj A0Z;
    public final C216714z A0a;
    public final C218415q A0b;
    public final AnonymousClass150 A0c;
    public final AnonymousClass18Y A0d;
    public final AnonymousClass17U A0e;
    public final C16740tZ A0f;
    public final C15960sC A0g;
    public final C19490yW A0h;
    public final C16220sf A0i;
    public final C216014s A0j;
    public final AnonymousClass135 A0k;
    public final AnonymousClass15O A0l;
    public final C223017k A0m;
    public final boolean A0n;
    public final boolean A0o;
    public final boolean A0p;
    public final boolean A0q;
    public final boolean A0r;

    public C45992Bx(Context context, C16570tH r3, AnonymousClass12E r4, C14870pt r5, C16040sK r6, C19740yv r7, AnonymousClass18Z r8, AnonymousClass15P r9, AnonymousClass01Y r10, C216514x r11, C17650vQ r12, C17160ud r13, C16000sG r14, C17030uP r15, C16080sP r16, C17200uh r17, C15800rs r18, AnonymousClass15I r19, C19610yi r20, AnonymousClass17V r21, AnonymousClass01V r22, C16440t3 r23, C19380yL r24, C16260sj r25, C15860rz r26, AnonymousClass013 r27, C15810rt r28, C16070sO r29, AnonymousClass15N r30, C14710pd r31, C20260zl r32, C221016q r33, C18040w3 r34, C17240ul r35, C15830rv r36, C14770pj r37, C216714z r38, C218415q r39, AnonymousClass150 r40, AnonymousClass18Y r41, AnonymousClass17U r42, C16740tZ r43, C15960sC r44, C19490yW r45, C16220sf r46, C216014s r47, AnonymousClass135 r48, AnonymousClass15O r49, C223017k r50, int i2, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A01 = context;
        this.A0L = r23;
        this.A0T = r31;
        this.A04 = r5;
        this.A05 = r6;
        this.A0Q = r28;
        this.A0J = r21;
        this.A0j = r47;
        this.A0U = r32;
        this.A0F = r17;
        this.A0A = r12;
        this.A07 = r8;
        this.A0B = r13;
        this.A0C = r14;
        this.A0e = r42;
        this.A0K = r22;
        this.A0E = r16;
        this.A0P = r27;
        this.A0d = r41;
        this.A0l = r49;
        this.A08 = r10;
        this.A0X = r35;
        this.A0H = r19;
        this.A0i = r46;
        this.A0m = r50;
        this.A0b = r39;
        this.A06 = r7;
        this.A0S = r30;
        this.A0W = r34;
        this.A0Z = r37;
        this.A0k = r48;
        this.A0D = r15;
        this.A0N = r25;
        this.A0O = r26;
        this.A0G = r18;
        this.A0M = r24;
        this.A0h = r45;
        this.A0R = r29;
        this.A0c = r40;
        this.A0g = r44;
        this.A02 = r3;
        this.A0I = r20;
        this.A0V = r33;
        this.A09 = r11;
        this.A0a = r38;
        this.A03 = r4;
        this.A0f = r43;
        this.A0q = z2;
        this.A0p = z3;
        this.A0o = z4;
        this.A0Y = r36;
        this.A00 = i2;
        this.A0n = z5;
        this.A0r = r9.A07();
    }

    public static final AnonymousClass01Q A00(Context context, C16010sH r6, boolean z2) {
        Uri withAppendedId = ContentUris.withAppendedId(C45912Bp.A00, r6.A05());
        Intent A082 = C14750ph.A08(context, 2);
        A082.setData(withAppendedId);
        A082.setAction("com.obwhatsapp.intent.action.OPEN");
        A082.addFlags(335544320);
        return new AnonymousClass01Q(2, A082.putExtra("fromNotification", true).putExtra("last_notification_keep_in_chat", z2));
    }

    public final void A01(C007503l r5, C16010sH r6) {
        C14750ph r1 = new C14750ph();
        Context context = this.A01;
        Intent A0w = r1.A0w(context, r6, 21);
        A0w.addFlags(335544320);
        A0w.putExtra("should_show_block_report_dialog", true);
        r5.A04(R.drawable.ic_spam_block, context.getString(R.string.str0e56), C42341xd.A00(context, 0, A0w, 134217728));
    }

    public final void A02(C007503l r7, C16010sH r8, int i2, boolean z2) {
        if (DirectReplyService.A03()) {
            r7.A0N.add(DirectReplyService.A00(this.A01, r8, "com.obwhatsapp.intent.action.DIRECT_REPLY_FROM_MESSAGE", i2, z2));
            return;
        }
        Context context = this.A01;
        C15830rv r5 = r8.A0E;
        Intent intent = new Intent();
        intent.setClassName(context.getPackageName(), "com.obwhatsapp.notification.PopupNotification");
        intent.putExtra("popup_notification_extra_quick_reply_jid", C16030sJ.A03(r5));
        intent.putExtra("popup_notification_extra_dismiss_notification", true);
        r7.A04(R.drawable.ic_action_reply, context.getString(R.string.str0e57), C42341xd.A00(context, 0, intent, 134217728));
    }

    public final void A03(C007503l r11, C16010sH r12, C37871ps r13) {
        PendingIntent A012;
        AnonymousClass17V r8 = this.A0J;
        C39731sy A013 = r8.A01(r13.A00);
        if (r8.A07(A013)) {
            C16740tZ r4 = r13.A00;
            Context context = this.A01;
            Intent intent = new Intent(context, MessageOTPNotificationBroadcastReceiver.class);
            intent.putExtra("extra_remote_jid", C16030sJ.A03(r12.A0E));
            intent.putExtra("extra_message_key_id", r4.A11.A01);
            r11.A04(R.drawable.ic_action_copy, context.getString(R.string.str0e33), C42341xd.A01(context, 36, intent, 134217728));
            if (Build.VERSION.SDK_INT >= 29) {
                r11.A0R = false;
            }
            r8.A05((C30571cb) r4, 2);
            this.A0e.A02(r4, 0, 0, (Integer) null);
        } else if (r8.A08(A013)) {
            C16740tZ r9 = r13.A00;
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 31) {
                Context context2 = this.A01;
                Intent A002 = r8.A00(context2, r9);
                if (A002 != null) {
                    A012 = C42341xd.A00(context2, 45, A002, 134217728);
                } else {
                    return;
                }
            } else {
                Context context3 = this.A01;
                Intent intent2 = new Intent(context3, MessageOTPNotificationBroadcastReceiver.class);
                intent2.putExtra("extra_remote_jid", C16030sJ.A03(r12.A0E));
                intent2.putExtra("extra_message_key_id", r9.A11.A01);
                A012 = C42341xd.A01(context3, 45, intent2, 134217728);
            }
            if (A012 != null) {
                r11.A04(0, Uri.parse(r8.A01(r9).A05).getQueryParameter("cta_display_name"), A012);
                if (i2 >= 29) {
                    r11.A0R = false;
                }
                this.A0e.A02(r9, 0, 1, (Integer) null);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:158:0x04cd, code lost:
        if (r24 == false) goto L_0x0308;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x04ef, code lost:
        if (r7 >= 24) goto L_0x02cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0509, code lost:
        if (r9.A0x() != false) goto L_0x050b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0628, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0194, code lost:
        if (A07((X.C15830rv) r4.A08(X.C15830rv.class), r0, r1.A00.A0G) == false) goto L_0x0196;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x02cd, code lost:
        if (r7 < 28) goto L_0x02cf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0384  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x04c8  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x04cd  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x04d1 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x04f6  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0528  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x059d  */
    /* JADX WARNING: Removed duplicated region for block: B:220:0x0110 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01c4  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01d7  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x024e  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x033e  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x034e  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0360  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(java.lang.StringBuilder r39, java.util.ArrayList r40, int r41, int r42, int r43, boolean r44, boolean r45, boolean r46) {
        /*
            r38 = this;
            r6 = r38
            android.content.Context r0 = r6.A01
            r36 = r0
            android.content.res.Resources r1 = r36.getResources()
            r0 = 17104901(0x1050005, float:2.4428256E-38)
            int r19 = r1.getDimensionPixelSize(r0)
            android.content.res.Resources r1 = r36.getResources()
            r0 = 17104902(0x1050006, float:2.442826E-38)
            int r18 = r1.getDimensionPixelSize(r0)
            r7 = 0
            r5 = 0
        L_0x001e:
            r37 = r40
            int r0 = r37.size()
            int r0 = r0 + -7
            int r0 = java.lang.Math.max(r7, r0)
            if (r5 >= r0) goto L_0x004d
            r0 = r37
            java.lang.Object r0 = r0.get(r5)
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r0.get(r7)
            X.1ps r0 = (X.C37871ps) r0
            X.0tZ r0 = r0.A00
            X.1Vw r0 = r0.A11
            X.0rv r0 = r0.A00
            X.0yL r2 = r6.A0M
            java.lang.String r1 = X.C19380yL.A00(r0)
            r0 = 1
            r2.A03(r0, r1)
            int r5 = r5 + 1
            goto L_0x001e
        L_0x004d:
            java.util.HashMap r21 = new java.util.HashMap
            r21.<init>()
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 < r0) goto L_0x008e
            if (r46 != 0) goto L_0x008e
            X.15q r0 = r6.A0b
            android.service.notification.StatusBarNotification[] r4 = r0.A0M()
            int r3 = r4.length
        L_0x0061:
            if (r7 >= r3) goto L_0x008e
            r2 = r4[r7]
            java.lang.String r0 = r2.getTag()
            if (r0 == 0) goto L_0x008b
            int r1 = r2.getId()
            r0 = 1
            if (r1 != r0) goto L_0x008b
            android.app.Notification r0 = r2.getNotification()
            android.os.Bundle r1 = r0.extras
            java.lang.String r0 = "last_row_id"
            long r0 = r1.getLong(r0)
            java.lang.String r2 = r2.getTag()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = r21
            r0.put(r2, r1)
        L_0x008b:
            int r7 = r7 + 1
            goto L_0x0061
        L_0x008e:
            int r0 = r37.size()
            if (r5 >= r0) goto L_0x0629
            r0 = r37
            java.lang.Object r17 = r0.get(r5)
            r0 = r17
            java.util.List r0 = (java.util.List) r0
            r17 = r0
            int r1 = r17.size()
            r0 = 1
            int r1 = r1 - r0
            r0 = r17
            java.lang.Object r1 = r0.get(r1)
            X.1ps r1 = (X.C37871ps) r1
            X.0tZ r0 = r1.A00
            X.1Vw r0 = r0.A11
            X.0rv r3 = r0.A00
            X.AnonymousClass00B.A06(r3)
            X.0sG r0 = r6.A0C
            X.0sH r4 = r0.A0A(r3)
            X.0rt r2 = r6.A0Q
            int r0 = r2.A00(r3)
            java.util.concurrent.ConcurrentHashMap r2 = r2.A0C()
            java.lang.Object r2 = r2.get(r3)
            X.0rx r2 = (X.C15840rx) r2
            if (r2 != 0) goto L_0x05fc
            r14 = 0
        L_0x00d0:
            int r20 = r0 + r14
            X.0sf r2 = r6.A0i
            r35 = r2
            java.lang.String r3 = r3.getRawString()
            X.1WS r16 = r2.A07(r3)
            java.lang.String r2 = r16.A06()
            int r22 = java.lang.Integer.parseInt(r2)
            int r3 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r3 < r2) goto L_0x0114
            if (r46 != 0) goto L_0x0114
            java.lang.Class<X.0rv> r2 = X.C15830rv.class
            com.whatsapp.jid.Jid r2 = r4.A08(r2)
            X.0rv r2 = (X.C15830rv) r2
            java.lang.String r2 = X.C19380yL.A00(r2)
            r3 = r21
            java.lang.Object r2 = r3.get(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            if (r2 == 0) goto L_0x0114
            long r8 = r2.longValue()
            X.0tZ r2 = r1.A00
            long r2 = r2.A13
            int r7 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r7 != 0) goto L_0x0114
        L_0x0110:
            int r5 = r5 + 1
            goto L_0x008e
        L_0x0114:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            X.03l r2 = X.C218415q.A00(r36)
            java.lang.String r7 = "group_key_messages"
            r2.A0K = r7
            r8 = 8
            android.app.Notification r12 = r2.A07
            int r7 = r12.flags
            r8 = r8 | r7
            r12.flags = r8
            X.14z r7 = r6.A0a
            X.0tZ r11 = r1.A00
            android.content.Context r10 = r7.A00
            java.lang.Class<com.obwhatsapp.notification.MessageNotificationDismissedReceiver> r7 = com.obwhatsapp.notification.MessageNotificationDismissedReceiver.class
            android.content.Intent r9 = new android.content.Intent
            r9.<init>(r10, r7)
            android.net.Uri r13 = X.C45912Bp.A00
            long r7 = r4.A05()
            android.net.Uri r7 = android.content.ContentUris.withAppendedId(r13, r7)
            r9.setData(r7)
            long r7 = r11.A0I
            java.lang.String r13 = "last_message_time"
            r9.putExtra(r13, r7)
            X.1Vw r7 = r11.A11
            X.0rv r7 = r7.A00
            java.lang.String r8 = X.C16030sJ.A03(r7)
            java.lang.String r7 = "chat_jid"
            r9.putExtra(r7, r8)
            r8 = 1
            r7 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r7 = X.C42341xd.A01(r10, r8, r9, r7)
            r12.deleteIntent = r7
            r15 = 2131232243(0x7f0805f3, float:1.808059E38)
            int r15 = com.obwhatsapp.yo.yo.getNIcon(r15)
            r12.icon = r15
            r1.A05(r2)
            boolean r34 = r6.A05(r4)
            X.0tZ r7 = r1.A00
            boolean r7 = r7 instanceof X.C16830ti
            if (r7 == 0) goto L_0x0180
            X.0tZ r7 = r1.A00
            X.0ti r7 = (X.C16830ti) r7
            X.C42091xD.A01(r7)
            r34 = 0
        L_0x0180:
            if (r22 != 0) goto L_0x0196
            java.lang.Class<X.0rv> r7 = X.C15830rv.class
            com.whatsapp.jid.Jid r9 = r4.A08(r7)
            X.0rv r9 = (X.C15830rv) r9
            X.0tZ r7 = r1.A00
            long r7 = r7.A0G
            boolean r7 = r6.A07(r9, r0, r7)
            r26 = 1
            if (r7 != 0) goto L_0x0511
        L_0x0196:
            r26 = 0
            if (r22 == 0) goto L_0x0511
            boolean r7 = r16.A09()
            if (r7 != 0) goto L_0x0511
            if (r45 != 0) goto L_0x01ae
            X.150 r7 = r6.A0c
            X.4Eh r7 = r7.A00
            if (r7 == 0) goto L_0x0511
            com.obwhatsapp.notification.PopupNotification r7 = r7.A00
            boolean r7 = r7.A1Q
            if (r7 == 0) goto L_0x0511
        L_0x01ae:
            r25 = 0
        L_0x01b0:
            X.17V r7 = r6.A0J
            X.0tZ r8 = r1.A00
            X.0pd r7 = r7.A03
            boolean r7 = X.C38621r6.A0Z(r7, r8)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            boolean r24 = r7.booleanValue()
            if (r24 == 0) goto L_0x04f6
            r6.A03(r2, r4, r1)
            r34 = 0
        L_0x01c9:
            X.0uh r10 = r6.A0F
            r9 = r36
            r8 = r19
            r7 = r18
            android.graphics.Bitmap r7 = r10.A02(r9, r4, r8, r7)
            if (r7 != 0) goto L_0x01f6
            X.0ud r10 = r6.A0B
            r7 = r18
            int r9 = java.lang.Math.min(r8, r7)
            X.0tz r7 = r10.A01
            android.content.Context r7 = r7.A00
            android.content.res.Resources r8 = r7.getResources()
            r7 = 2131167048(0x7f070748, float:1.7948359E38)
            float r7 = r8.getDimension(r7)
            float r7 = com.obwhatsapp.yo.yo.setSQPC((float) r7)
            android.graphics.Bitmap r7 = r10.A04(r4, r7, r9)
        L_0x01f6:
            X.1yK r8 = r1.A02(r4)
            r2.A06(r7)
            int r7 = r37.size()
            int r7 = r7 - r5
            java.lang.String r9 = java.lang.String.valueOf(r7)
            java.lang.String r7 = r8.A01
            r2.A0A(r7)
            java.lang.CharSequence r7 = r8.A00
            r2.A09(r7)
            X.0tZ r7 = r1.A00
            long r7 = r7.A0I
            r2.A05(r7)
            r2.A0M = r9
            java.lang.String r7 = "sortKey="
            r3.append(r7)
            r3.append(r9)
            boolean r7 = com.obwhatsapp.notification.AndroidWear.A02()
            r33 = r44
            if (r7 == 0) goto L_0x0248
            X.15q r9 = r6.A0b
            r7 = 1
            r31 = 0
            r8 = r41
            if (r8 != r7) goto L_0x0235
            r31 = 1
        L_0x0235:
            r32 = 0
            r8 = r42
            if (r8 != r7) goto L_0x023d
            r32 = 1
        L_0x023d:
            r27 = r9
            r28 = r2
            r29 = r4
            r30 = r1
            r27.A0K(r28, r29, r30, r31, r32, r33, r34)
        L_0x0248:
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 21
            if (r7 < r8) goto L_0x04f3
            X.0rv r8 = r6.A0Y
            if (r8 != 0) goto L_0x028e
            X.03l r11 = X.C218415q.A00(r36)
            java.lang.String r8 = "msg"
            r11.A0I = r8
            X.15q r8 = r6.A0b
            X.0tz r8 = r8.A09
            android.content.Context r9 = r8.A00
            r8 = 2131893493(0x7f121cf5, float:1.9421764E38)
            java.lang.String r8 = r9.getString(r8)
            r11.A0A(r8)
            X.013 r13 = r6.A0P
            r12 = 2131755243(0x7f1000eb, float:1.914136E38)
            r8 = r20
            long r8 = (long) r8
            r10 = 1
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.Integer r23 = java.lang.Integer.valueOf(r20)
            r22 = 0
            r10[r22] = r23
            java.lang.String r8 = r13.A0J(r10, r12, r8)
            r11.A09(r8)
            android.app.Notification r8 = r11.A07
            r8.icon = r15
            android.app.Notification r8 = r11.A01()
            r2.A08 = r8
        L_0x028e:
            r8 = 26
            if (r7 < r8) goto L_0x04ed
            r9 = r16
            X.1v2 r9 = (X.C41001v2) r9
            java.lang.String r10 = r9.A07()
            java.lang.String r8 = "Silent"
            boolean r10 = r8.equalsIgnoreCase(r10)
            boolean r8 = r6.A0q
            if (r8 != 0) goto L_0x04e7
            if (r10 != 0) goto L_0x04e7
            java.lang.String r9 = r9.A0C()
        L_0x02aa:
            r2.A0J = r9
            r8 = 1
            r2.A01 = r8
            r8 = r20
            r2.A02 = r8
            java.lang.String r8 = " channel="
            r3.append(r8)
            r3.append(r9)
            java.lang.String r8 = " number="
            r3.append(r8)
            r3.append(r0)
            java.lang.String r8 = " numberReactions="
            r3.append(r8)
            r3.append(r14)
            r8 = 28
            if (r7 >= r8) goto L_0x04f3
        L_0x02cf:
            r9 = 1
            r8 = r41
            if (r8 != r9) goto L_0x04f3
            boolean r9 = r6.A0r
            boolean r8 = com.obwhatsapp.notification.AndroidWear.A02()
            if (r8 == 0) goto L_0x02ed
            X.15q r8 = r1.A09
            r31 = 1
            r32 = 1
            r27 = r8
            r28 = r2
            r29 = r4
            r30 = r1
            r27.A0K(r28, r29, r30, r31, r32, r33, r34)
        L_0x02ed:
            r8 = r39
            r1.A06(r2, r4, r8, r9)
            r8 = r36
            boolean r11 = r1.A07(r8, r2, r4)
        L_0x02f8:
            X.0pd r10 = r6.A0T
            r9 = 2991(0xbaf, float:4.191E-42)
            X.0tM r8 = X.C16620tM.A02
            boolean r10 = r10.A0E(r8, r9)
            if (r10 != 0) goto L_0x04c2
            if (r26 == 0) goto L_0x04c2
            if (r11 != 0) goto L_0x04c2
        L_0x0308:
            X.15q r8 = r6.A0b
            r8.A0J(r2, r4)
        L_0x030d:
            X.0rv r8 = r4.A0E
            X.AnonymousClass00B.A06(r8)
            java.lang.String r8 = r8.getRawString()
            r2.A0L = r8
            java.lang.String r8 = r1.A04()
            if (r8 == 0) goto L_0x0321
            r2.A0C(r8)
        L_0x0321:
            r9 = 0
            r8 = r17
            java.lang.Object r9 = r8.get(r9)
            X.1ps r9 = (X.C37871ps) r9
            r8 = 24
            if (r7 < r8) goto L_0x0518
            if (r11 != 0) goto L_0x0518
            X.0tZ r7 = r1.A00
            X.1Vw r7 = r7.A11
            X.0rv r7 = r7.A00
            boolean r7 = X.C16030sJ.A0L(r7)
            r15 = 2
            r8 = 2
            if (r7 == 0) goto L_0x033f
            r8 = 1
        L_0x033f:
            X.15q r7 = r6.A0b
            X.04K r7 = r7.A0D()
            androidx.core.app.NotificationCompat$MessagingStyle r10 = new androidx.core.app.NotificationCompat$MessagingStyle
            r10.<init>(r7)
            r12 = 1
            r7 = 0
            if (r8 != r12) goto L_0x034f
            r7 = 1
        L_0x034f:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r10.A01 = r7
            X.0sP r11 = r6.A0E
            r22 = 0
            r7 = 0
            java.lang.String r11 = r11.A0G(r4, r8, r7)
            if (r8 != r12) goto L_0x037a
            if (r0 <= r12) goto L_0x0378
            X.013 r14 = r6.A0P
            r13 = 2131755047(0x7f100027, float:1.9140962E38)
            r0 = r20
            long r7 = (long) r0
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r22] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r20)
            r0[r12] = r11
            java.lang.String r11 = r14.A0J(r0, r13, r7)
        L_0x0378:
            r10.A02 = r11
        L_0x037a:
            java.util.Iterator r23 = r17.iterator()
        L_0x037e:
            boolean r0 = r23.hasNext()
            if (r0 == 0) goto L_0x0515
            java.lang.Object r12 = r23.next()
            X.1ps r12 = (X.C37871ps) r12
            long r13 = r12.A00()
            long r7 = r9.A00()
            int r0 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r0 >= 0) goto L_0x0397
            r9 = r12
        L_0x0397:
            X.0tZ r7 = r12.A00
            boolean r0 = r7 instanceof X.C16830ti
            if (r0 != 0) goto L_0x04bd
            boolean r0 = r7 instanceof X.C38891ra
            if (r0 != 0) goto L_0x04bd
            boolean r0 = r7.A0x()
            if (r0 != 0) goto L_0x04bd
        L_0x03a7:
            X.1yK r22 = r12.A02(r4)
            X.0sH r11 = r12.A01()
            java.lang.String r15 = r12.A04()
            X.0tZ r7 = r12.A00
            X.1Vw r0 = r7.A11
            X.0rv r0 = r0.A00
            boolean r0 = X.C16030sJ.A0L(r0)
            r8 = 2
            if (r0 == 0) goto L_0x03c1
            r8 = 1
        L_0x03c1:
            X.0s5 r14 = r12.A03
            X.0s8 r0 = X.C15910s6.A0R
            boolean r0 = r14.A05(r0)
            if (r0 == 0) goto L_0x04b7
            boolean r0 = r7 instanceof X.C39291sE
            if (r0 == 0) goto L_0x04b7
            X.0sK r7 = r12.A02
            X.0rv r0 = r11.A0E
            boolean r0 = r7.A0I(r0)
        L_0x03d7:
            if (r0 == 0) goto L_0x0490
            X.15q r0 = r12.A09
            X.04K r11 = r0.A0D()
        L_0x03df:
            r0 = r22
            java.lang.CharSequence r13 = r0.A00
            X.0tZ r0 = r12.A00
            long r7 = r0.A0I
            X.04j r0 = new X.04j
            r0.<init>(r11, r13, r7)
            X.0tZ r8 = r12.A00
            byte r7 = r8.A10
            boolean r7 = X.C30921dB.A00(r7)
            if (r7 != 0) goto L_0x0439
            boolean r7 = r8 instanceof X.C38681rF
            if (r7 != 0) goto L_0x040e
            boolean r7 = r8 instanceof X.C38701rH
            if (r7 == 0) goto L_0x0406
            X.0s8 r7 = X.C15910s6.A0F
            boolean r7 = r14.A05(r7)
            if (r7 != 0) goto L_0x040e
        L_0x0406:
            boolean r7 = r8 instanceof X.C38641rB
            if (r7 == 0) goto L_0x0439
            X.1Vt r7 = r8.A0L
            if (r7 != 0) goto L_0x0439
        L_0x040e:
            X.0tZ r7 = r12.A00
            boolean r8 = r7 instanceof X.C38891ra
            if (r8 != 0) goto L_0x0439
            X.0tY r7 = (X.C16730tY) r7
            X.0ta r11 = r7.A02
            if (r11 == 0) goto L_0x0434
            boolean r8 = r11.A0P
            if (r8 == 0) goto L_0x0434
            java.io.File r8 = r11.A0F
            if (r8 == 0) goto L_0x0434
            boolean r8 = r8.exists()
            if (r8 == 0) goto L_0x0434
            X.0tA r8 = r12.A08
            android.net.Uri r8 = com.obwhatsapp.contentprovider.MediaProvider.A02(r8, r7)
            java.lang.String r7 = r7.A06
            r0.A02 = r7
            r0.A00 = r8
        L_0x0434:
            r10.A0A(r0)
            goto L_0x037e
        L_0x0439:
            X.0tZ r8 = r12.A00
            boolean r7 = r8 instanceof X.C16830ti
            if (r7 == 0) goto L_0x0434
            r7 = r8
            X.0ti r7 = (X.C16830ti) r7
            byte[] r7 = r7.A13()
            if (r7 == 0) goto L_0x0434
            long r14 = r8.A13
            X.0tA r13 = r12.A08
            java.util.UUID r7 = java.util.UUID.randomUUID()
            java.lang.String r8 = r7.toString()
            java.lang.String r7 = java.lang.Long.toString(r14)
            java.lang.String r15 = "image/jpeg"
            java.lang.String r14 = ""
            r13.A01(r8, r7, r15, r14)
            android.net.Uri$Builder r13 = new android.net.Uri$Builder
            r13.<init>()
            java.lang.String r7 = "content"
            android.net.Uri$Builder r13 = r13.scheme(r7)
            java.lang.String r7 = com.obwhatsapp.contentprovider.MediaProvider.A0C
            android.net.Uri$Builder r13 = r13.authority(r7)
            java.lang.String r7 = "thumbnail"
            android.net.Uri$Builder r7 = r13.appendPath(r7)
            android.net.Uri$Builder r7 = r7.appendEncodedPath(r8)
            android.net.Uri r13 = r7.build()
            X.0tZ r7 = r12.A00
            long r7 = r7.A0I
            X.04j r12 = new X.04j
            r12.<init>(r11, r14, r7)
            r12.A02 = r15
            r12.A00 = r13
            r10.A0A(r12)
            goto L_0x0434
        L_0x0490:
            X.04L r7 = new X.04L
            r7.<init>()
            X.0sP r13 = r12.A05
            r0 = 0
            java.lang.String r0 = r13.A0G(r11, r8, r0)
            r7.A01 = r0
            X.15q r0 = r12.A09
            android.graphics.Bitmap r11 = r0.A0C(r11)
            r8 = 1
            androidx.core.graphics.drawable.IconCompat r0 = new androidx.core.graphics.drawable.IconCompat
            r0.<init>(r8)
            r0.A06 = r11
            r7.A00 = r0
            r7.A03 = r15
            X.04K r11 = new X.04K
            r11.<init>(r7)
            goto L_0x03df
        L_0x04b7:
            X.1Vw r0 = r7.A11
            boolean r0 = r0.A02
            goto L_0x03d7
        L_0x04bd:
            r0 = 0
            r2.A0R = r0
            goto L_0x03a7
        L_0x04c2:
            boolean r8 = r6.A06(r4)
            if (r8 == 0) goto L_0x04d1
            r6.A01(r2, r4)
        L_0x04cb:
            if (r10 == 0) goto L_0x030d
            if (r24 != 0) goto L_0x030d
            goto L_0x0308
        L_0x04d1:
            if (r25 == 0) goto L_0x04cb
            if (r11 != 0) goto L_0x04cb
            X.0rv r8 = r6.A0Y
            if (r8 != 0) goto L_0x04cb
            if (r24 != 0) goto L_0x04cb
            r8 = r36
            X.04E r9 = com.obwhatsapp.notification.AndroidWear.A00(r8, r4)
            java.util.ArrayList r8 = r2.A0N
            r8.add(r9)
            goto L_0x04cb
        L_0x04e7:
            java.lang.String r9 = r9.A0D()
            goto L_0x02aa
        L_0x04ed:
            r8 = 24
            if (r7 < r8) goto L_0x04f3
            goto L_0x02cf
        L_0x04f3:
            r11 = 0
            goto L_0x02f8
        L_0x04f6:
            if (r34 == 0) goto L_0x01c9
            int r8 = r0 + r43
            X.0tZ r9 = r1.A00
            boolean r7 = r9 instanceof X.C16830ti
            if (r7 != 0) goto L_0x050b
            boolean r7 = r9 instanceof X.C38891ra
            if (r7 != 0) goto L_0x050b
            boolean r9 = r9.A0x()
            r7 = 1
            if (r9 == 0) goto L_0x050c
        L_0x050b:
            r7 = 0
        L_0x050c:
            r6.A02(r2, r4, r8, r7)
            goto L_0x01c9
        L_0x0511:
            r25 = 1
            goto L_0x01b0
        L_0x0515:
            r2.A08(r10)
        L_0x0518:
            boolean r1 = r1 instanceof X.C45962Bu
            r0 = r36
            X.01Q r10 = A00(r0, r4, r1)
            java.lang.Object r8 = r10.A01
            android.content.Intent r8 = (android.content.Intent) r8
            boolean r0 = r9 instanceof X.C45972Bv
            if (r0 == 0) goto L_0x054e
            r7 = r9
            X.2Bv r7 = (X.C45972Bv) r7
            long r0 = r9.A00()
            java.lang.String r11 = "row_id"
            r8.putExtra(r11, r0)
            boolean r0 = r9 instanceof X.C45982Bw
            if (r0 == 0) goto L_0x05a9
            X.2Bw r9 = (X.C45982Bw) r9
            X.23a r0 = r9.A00
            X.0tZ r0 = r0.A01
        L_0x053f:
            long r0 = r0.A14
            java.lang.String r9 = "sort_id"
            r8.putExtra(r9, r0)
            X.1Vw r0 = r7.AEH()
            X.AnonymousClass1yL.A00(r8, r0)
        L_0x054e:
            java.lang.Object r0 = r10.A00
            X.AnonymousClass00B.A06(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            int r7 = r0.intValue()
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r36
            android.content.Intent r8 = com.obwhatsapp.yo.yo.notifIn(r8)
            android.app.PendingIntent r0 = X.C42341xd.A00(r0, r7, r8, r1)
            r2.A09 = r0
            android.app.Notification r1 = r2.A01()
            X.18Y r2 = r6.A0d
            r0 = r36
            X.1vD r2 = r2.A00(r0)
            r7 = r20
            r2.A01(r1, r0, r7)
            java.lang.String r0 = " jid="
            r3.append(r0)
            X.0rv r0 = r4.A0E
            r3.append(r0)
            java.lang.String r0 = "messagenotification/postChildNotification "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            java.lang.String r0 = r3.toString()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = com.obwhatsapp.yo.yo.HNoNotif(r4)
            if (r0 != 0) goto L_0x0110
            java.lang.Class<X.0rv> r0 = X.C15830rv.class
            com.whatsapp.jid.Jid r3 = r4.A08(r0)
            X.AnonymousClass00B.A06(r3)
            X.0rv r3 = (X.C15830rv) r3
            goto L_0x05b7
        L_0x05a9:
            boolean r0 = r9 instanceof X.C45962Bu
            if (r0 == 0) goto L_0x05b4
            X.2Bu r9 = (X.C45962Bu) r9
            X.23Z r0 = r9.A00
            X.0tZ r0 = r0.A00
            goto L_0x053f
        L_0x05b4:
            X.0tZ r0 = r9.A00
            goto L_0x053f
        L_0x05b7:
            X.0yv r2 = r6.A06     // Catch:{ SecurityException -> 0x05cb, RuntimeException -> 0x0600 }
            r0 = r36
            r2.A03(r0, r4)     // Catch:{ SecurityException -> 0x05cb, RuntimeException -> 0x0600 }
            X.0yL r7 = r6.A0M     // Catch:{ SecurityException -> 0x05cb, RuntimeException -> 0x0600 }
            java.lang.String r3 = X.C19380yL.A00(r3)     // Catch:{ SecurityException -> 0x05cb, RuntimeException -> 0x0600 }
            r2 = 1
            r0 = 0
            r7.A04(r1, r3, r2, r0)     // Catch:{ SecurityException -> 0x05cb, RuntimeException -> 0x0600 }
            goto L_0x0110
        L_0x05cb:
            r1 = move-exception
            java.lang.String r0 = "messagenotification/postChildNotification uid="
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r0)
            int r0 = android.os.Process.myUid()
            r3.append(r0)
            java.lang.String r0 = " quiet="
            r3.append(r0)
            boolean r2 = r6.A0q
            r3.append(r2)
            java.lang.String r0 = r3.toString()
            com.whatsapp.util.Log.i(r0, r1)
            if (r2 != 0) goto L_0x0628
            boolean r0 = X.C41971wz.A04()
            if (r0 == 0) goto L_0x0628
            r1 = r35
            r0 = r16
            r1.A0J(r0)
            goto L_0x0110
        L_0x05fc:
            int r14 = r2.A05
            goto L_0x00d0
        L_0x0600:
            r1 = move-exception
            java.lang.Throwable r0 = r1.getCause()
            boolean r0 = r0 instanceof android.os.TransactionTooLargeException
            if (r0 == 0) goto L_0x0628
            java.lang.String r0 = "Error posting notification"
            com.whatsapp.util.Log.e(r0, r1)
            java.util.Iterator r2 = r17.iterator()
        L_0x0612:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0628
            java.lang.Object r0 = r2.next()
            X.1ps r0 = (X.C37871ps) r0
            X.1yK r0 = r0.A02(r4)
            java.lang.CharSequence r0 = r0.A00
            r0.length()
            goto L_0x0612
        L_0x0628:
            throw r1
        L_0x0629:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45992Bx.A04(java.lang.StringBuilder, java.util.ArrayList, int, int, int, boolean, boolean, boolean):void");
    }

    public boolean A05(C16010sH r6) {
        Jid A082 = r6.A08(C15830rv.class);
        AnonymousClass00B.A06(A082);
        C15830rv r1 = (C15830rv) A082;
        if (!this.A0X.A0g(r6, r1)) {
            C14710pd r4 = this.A0T;
            C20260zl r3 = this.A0U;
            AnonymousClass135 r0 = this.A0k;
            C17030uP r2 = this.A0D;
            UserJid of = UserJid.of(r1);
            return !C41871wn.A00(r2, r4, r3, of, r0) && !C41861wm.A01(r2, r4, r3, of);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = (com.whatsapp.jid.UserJid) r4.A08(com.whatsapp.jid.UserJid.class);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A06(X.C16010sH r4) {
        /*
            r3 = this;
            X.0pd r2 = r3.A0T
            r1 = 2374(0x946, float:3.327E-42)
            X.0tM r0 = X.C16620tM.A02
            boolean r0 = r2.A0E(r0, r1)
            r2 = 0
            if (r0 == 0) goto L_0x0028
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            com.whatsapp.jid.Jid r1 = r4.A08(r0)
            com.whatsapp.jid.UserJid r1 = (com.whatsapp.jid.UserJid) r1
            if (r1 == 0) goto L_0x0028
            X.14s r0 = r3.A0j
            boolean r0 = r0.A07(r1)
            if (r0 != 0) goto L_0x0028
            X.01Y r0 = r3.A08
            boolean r0 = r0.A0V(r1)
            if (r0 != 0) goto L_0x0028
            r2 = 1
        L_0x0028:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45992Bx.A06(X.0sH):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003c, code lost:
        if ((r2 + 86400000) >= r7) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A07(X.C15830rv r11, int r12, long r13) {
        /*
            r10 = this;
            r9 = 0
            r0 = 50
            if (r12 <= r0) goto L_0x0044
            X.0rz r0 = r10.A0O
            X.01D r0 = r0.A01
            java.lang.Object r3 = r0.get()
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            java.lang.String r2 = "last_read_conversation_time"
            r0 = 0
            long r7 = r3.getLong(r2, r0)
            X.0rt r2 = r10.A0Q
            java.util.concurrent.ConcurrentHashMap r2 = r2.A0C()
            java.lang.Object r2 = r2.get(r11)
            X.0rx r2 = (X.C15840rx) r2
            if (r2 != 0) goto L_0x0045
            r2 = 0
        L_0x0027:
            long r13 = r13 - r2
            r5 = 300000(0x493e0, double:1.482197E-318)
            int r4 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            r5 = 0
            if (r4 >= 0) goto L_0x0031
            r5 = 1
        L_0x0031:
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x003e
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 + r0
            int r1 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            r0 = 1
            if (r1 < 0) goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            if (r5 != 0) goto L_0x0043
            if (r0 == 0) goto L_0x0044
        L_0x0043:
            r9 = 1
        L_0x0044:
            return r9
        L_0x0045:
            long r2 = r2.A0W
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45992Bx.A07(X.0rv, int, long):boolean");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C45992Bx r5 = (C45992Bx) obj;
            C16740tZ r2 = this.A0f;
            C16740tZ r0 = r5.A0f;
            return (r2 == r0 || !(r2 == null || r0 == null || !r0.A11.equals(r2.A11))) && this.A0o == r5.A0o && this.A0p == r5.A0p && this.A0q == r5.A0q && C34901l3.A00(this.A0Y, r5.A0Y) && this.A00 == r5.A00 && this.A0n == r5.A0n;
        }
    }

    public int hashCode() {
        C16740tZ r0 = this.A0f;
        int i2 = 0;
        int hashCode = (((((((r0 == null ? 0 : r0.hashCode()) * 31) + (this.A0q ? 1 : 0)) * 31) + (this.A0p ? 1 : 0)) * 31) + (this.A0o ? 1 : 0)) * 31;
        C15830rv r02 = this.A0Y;
        if (r02 != null) {
            i2 = r02.hashCode();
        }
        return ((((hashCode + i2) * 31) + this.A00) * 31) + (this.A0n ? 1 : 0);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x03c2, code lost:
        if (r5 == null) goto L_0x03c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0513, code lost:
        if (r0 == false) goto L_0x0515;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x070c, code lost:
        if (r27 == false) goto L_0x070e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0713, code lost:
        if (r25 == false) goto L_0x0715;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x07b2, code lost:
        if (r27 != false) goto L_0x07b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x07f3, code lost:
        if (r1 == false) goto L_0x07f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0970, code lost:
        if (r7.equals("2") == false) goto L_0x07f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x097d, code lost:
        r1 = new long[]{0, 300, 200, 300, 200};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0982, code lost:
        if ((1 - r10) == 0) goto L_0x098d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:371:0x0984, code lost:
        r1 = {0, 750, 250, 750, 250} // fill-array;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0987, code lost:
        r0.A07.vibrate = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x098d, code lost:
        r1 = {0, 300, 200, 300, 200} // fill-array;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x09a9, code lost:
        if (r10.booleanValue() == false) goto L_0x0774;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:392:0x09ca, code lost:
        if (r19 == 1) goto L_0x0737;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0cbd, code lost:
        if ((r1 instanceof com.whatsapp.jid.UserJid) == false) goto L_0x0cbf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0cd6, code lost:
        if (X.C41971wz.A0C(r7.toString()) != false) goto L_0x0b53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ff, code lost:
        if (r1 == 0) goto L_0x0201;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0043, code lost:
        if (r3.A07(r0.getRawString()).A0J == false) goto L_0x0045;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:543:0x0d4b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:553:0x0d57 */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x04be  */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0507  */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x0539  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x0569  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x05d4 A[Catch:{ SecurityException -> 0x05b0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x05f3 A[Catch:{ Exception -> 0x062e }] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x062d A[Catch:{ Exception -> 0x062e }] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x064c  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0680  */
    /* JADX WARNING: Removed duplicated region for block: B:264:0x070a  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0712  */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x072e  */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x073d  */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x075b  */
    /* JADX WARNING: Removed duplicated region for block: B:292:0x07b1  */
    /* JADX WARNING: Removed duplicated region for block: B:303:0x07ca A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:377:0x0998 A[Catch:{ SecurityException -> 0x07c7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:389:0x09c1  */
    /* JADX WARNING: Removed duplicated region for block: B:394:0x09e3  */
    /* JADX WARNING: Removed duplicated region for block: B:399:0x0a25  */
    /* JADX WARNING: Removed duplicated region for block: B:471:0x0c45  */
    /* JADX WARNING: Removed duplicated region for block: B:477:0x0c5e  */
    /* JADX WARNING: Removed duplicated region for block: B:590:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r66 = this;
            r2 = r66
            X.0tZ r4 = r2.A0f
            java.lang.String r33 = "null"
            if (r4 == 0) goto L_0x000b
            X.C38621r6.A0J(r4)
        L_0x000b:
            java.lang.String r24 = " quiet="
            boolean r0 = r2.A0q
            r20 = r0
            boolean r0 = r2.A0p
            r28 = r0
            boolean r0 = r2.A0o
            r17 = r0
            X.0rv r1 = r2.A0Y
            boolean r0 = r2.A0n
            r65 = r0
            X.0sC r0 = r2.A0g
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x002d
            java.lang.String r0 = "messagenotification/notification suppressed: not in verified registration state"
        L_0x0029:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x002c:
            return
        L_0x002d:
            if (r4 == 0) goto L_0x0045
            X.0sf r3 = r2.A0i
            X.1Vw r0 = r4.A11
            X.0rv r0 = r0.A00
            X.AnonymousClass00B.A06(r0)
            java.lang.String r0 = r0.getRawString()
            X.1WS r0 = r3.A07(r0)
            boolean r0 = r0.A0J
            r12 = 0
            if (r0 != 0) goto L_0x0046
        L_0x0045:
            r12 = 1
        L_0x0046:
            X.0sf r0 = r2.A0i
            r64 = r0
            X.1WS r11 = r64.A03()
            X.1WS r5 = r64.A02()
            java.lang.String r0 = r5.A06()
            int r10 = java.lang.Integer.parseInt(r0)
            java.lang.String r0 = r11.A06()
            int r9 = java.lang.Integer.parseInt(r0)
            java.lang.String r0 = r5.A07()
            java.lang.String r3 = r11.A07()
            java.lang.String r8 = r5.A05()
            java.lang.String r7 = r11.A05()
            java.lang.String r6 = r5.A08()
            java.lang.String r5 = r11.A08()
            if (r10 != 0) goto L_0x00ac
            if (r9 != 0) goto L_0x00ac
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00ac
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L_0x00ac
            java.lang.String r3 = "000000"
            boolean r0 = android.text.TextUtils.equals(r3, r8)
            if (r0 == 0) goto L_0x00ac
            boolean r0 = android.text.TextUtils.equals(r3, r7)
            if (r0 == 0) goto L_0x00ac
            java.lang.String r3 = "0"
            boolean r0 = android.text.TextUtils.equals(r3, r6)
            if (r0 == 0) goto L_0x00ac
            boolean r0 = android.text.TextUtils.equals(r3, r5)
            if (r0 == 0) goto L_0x00ac
            if (r12 == 0) goto L_0x00ac
            java.lang.String r0 = "messagenotification/notifications disabled"
            goto L_0x0029
        L_0x00ac:
            if (r4 != 0) goto L_0x00e1
            X.0rz r0 = r2.A0O
            X.01D r7 = r0.A01
            java.lang.Object r0 = r7.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r3 = "notification_hash"
            r6 = 0
            java.lang.String r0 = r0.getString(r3, r6)
            if (r0 == 0) goto L_0x00e1
            java.lang.Object r0 = r7.get()
            android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
            java.lang.String r5 = r0.getString(r3, r6)
            java.lang.Object r3 = r7.get()
            android.content.SharedPreferences r3 = (android.content.SharedPreferences) r3
            java.lang.String r0 = "last_notification_hash"
            java.lang.String r0 = r3.getString(r0, r6)
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00e1
            java.lang.String r0 = "messagenotification/updateOnly skip"
            goto L_0x0029
        L_0x00e1:
            android.content.Context r8 = r2.A01
            X.03S r0 = new X.03S
            r0.<init>(r8)
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x00fb
            java.lang.String r0 = "messagenotification/notif disabled"
        L_0x00f0:
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x00f3:
            if (r4 == 0) goto L_0x002c
        L_0x00f5:
            X.18Z r0 = r2.A07
            r0.A01()
            return
        L_0x00fb:
            if (r4 == 0) goto L_0x010f
            X.0pj r0 = r2.A0Z
            X.1ps r7 = r0.A02(r4)
            boolean r0 = r0.A0F(r7)
            if (r0 != 0) goto L_0x0110
            java.lang.String r0 = "messagenotification/muted chat"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x00f5
        L_0x010f:
            r7 = 0
        L_0x0110:
            boolean r0 = r4 instanceof X.C39101rv
            r16 = r0
            if (r0 == 0) goto L_0x0130
            X.1Vw r0 = r4.A11
            X.0rv r0 = r0.A00
            java.lang.String r3 = r0.getRawString()
            r0 = r64
            X.1WS r0 = r0.A07(r3)
            X.1WS r0 = r0.A02()
            boolean r0 = r0.A0F
            if (r0 == 0) goto L_0x0130
            java.lang.String r0 = "messagenotification/skip notification for muted reaction"
            goto L_0x0029
        L_0x0130:
            java.util.ArrayList r23 = new java.util.ArrayList
            r23.<init>()
            java.lang.StringBuilder r32 = new java.lang.StringBuilder
            r32.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            if (r1 == 0) goto L_0x017d
            X.0pj r8 = r2.A0Z
            int r0 = r2.A00
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            X.0yz r12 = r8.A0J
            int r4 = r0 + 1
            r0 = 7
            int r0 = java.lang.Math.min(r4, r0)
            long r16 = android.os.SystemClock.uptimeMillis()
            java.lang.String r5 = "last-message-store/getlastmessagesfornotificationafterreply/jid:"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>(r5)
            r6.append(r1)
            java.lang.String r5 = " count:"
            r6.append(r5)
            r6.append(r0)
            java.lang.String r5 = r6.toString()
            com.whatsapp.util.Log.i((java.lang.String) r5)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            X.0tq r5 = r12.A09
            X.0tf r10 = r5.get()
            goto L_0x0cda
        L_0x017d:
            X.0rs r0 = r2.A0G
            java.util.List r0 = r0.A05()
            java.util.Iterator r31 = r0.iterator()
            r5 = 0
            r30 = 0
            r19 = 0
            r18 = 0
            r43 = 0
        L_0x0190:
            boolean r0 = r31.hasNext()
            if (r0 == 0) goto L_0x038e
            java.lang.Object r9 = r31.next()
            X.0rv r9 = (X.C15830rv) r9
            X.0pj r11 = r2.A0Z
            java.util.Map r1 = r11.A0U
            java.lang.Object r0 = r1.get(r9)
            java.util.List r0 = (java.util.List) r0
            if (r0 != 0) goto L_0x01b9
            r0 = 0
            java.util.List r0 = r11.A06(r9, r0)
            r1.put(r9, r0)
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L_0x01b9
            X.C14770pj.A00(r0)
        L_0x01b9:
            java.util.ArrayList r29 = new java.util.ArrayList
            r29.<init>()
            java.util.Iterator r6 = r0.iterator()
        L_0x01c2:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x01da
            java.lang.Object r1 = r6.next()
            X.1ps r1 = (X.C37871ps) r1
            boolean r0 = r11.A0F(r1)
            if (r0 == 0) goto L_0x01c2
            r0 = r29
            r0.add(r1)
            goto L_0x01c2
        L_0x01da:
            X.0rt r1 = r2.A0Q
            int r27 = r1.A00(r9)
            java.util.concurrent.ConcurrentHashMap r0 = r1.A0C()
            java.lang.Object r0 = r0.get(r9)
            X.0rx r0 = (X.C15840rx) r0
            if (r0 != 0) goto L_0x0326
            r21 = 0
        L_0x01ee:
            X.0rx r0 = r1.A06(r9)
            if (r0 == 0) goto L_0x0201
            long r14 = r0.A00()
            long r12 = r0.A01()
            int r1 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            r0 = 1
            if (r1 != 0) goto L_0x0202
        L_0x0201:
            r0 = 0
        L_0x0202:
            if (r27 > 0) goto L_0x020a
            if (r0 != 0) goto L_0x020a
            boolean r0 = r4 instanceof X.C39191s4
            if (r0 == 0) goto L_0x0190
        L_0x020a:
            int r0 = r29.size()
            if (r0 <= 0) goto L_0x0190
            r1 = 0
            r0 = r29
            java.lang.Object r6 = r0.get(r1)
            X.1ps r6 = (X.C37871ps) r6
            if (r6 == 0) goto L_0x0371
            X.0tZ r0 = r6.A00
            long r0 = r0.A0G
            r12 = 0
            int r10 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r10 == 0) goto L_0x0255
            r14 = 604800000(0x240c8400, double:2.988109026E-315)
            long r14 = r14 + r0
            X.0t3 r10 = r11.A0B
            long r12 = r10.A00()
            int r10 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r10 >= 0) goto L_0x0255
            X.0rz r10 = r11.A0E
            X.01D r10 = r10.A01
            java.lang.Object r13 = r10.get()
            android.content.SharedPreferences r13 = (android.content.SharedPreferences) r13
            java.lang.String r12 = "last_read_conversation_time"
            r10 = 0
            long r11 = r13.getLong(r12, r10)
            int r10 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r10 <= 0) goto L_0x0255
        L_0x0249:
            X.0yL r1 = r2.A0M
            java.lang.String r6 = X.C19380yL.A00(r9)
            r0 = 1
            r1.A03(r0, r6)
            goto L_0x0190
        L_0x0255:
            X.14z r14 = r2.A0a
            X.0tZ r0 = r6.A00
            r36 = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = r14.A04
            r13 = 0
            r12 = 1
            boolean r0 = r0.compareAndSet(r13, r12)
            if (r0 == 0) goto L_0x0304
            X.14y r1 = r14.A01
            java.lang.String[] r15 = new java.lang.String[r12]
            X.0t3 r0 = r1.A00
            r35 = r0
            long r25 = r35.A00()
            r10 = 604800000(0x240c8400, double:2.988109026E-315)
            long r25 = r25 - r10
            java.lang.String r0 = java.lang.Long.toString(r25)
            r15[r13] = r0
            X.11X r0 = r1.A01
            r34 = r0
            X.0tf r11 = r34.A02()
            X.0tg r0 = r11.A02     // Catch:{ all -> 0x0d58 }
            r10 = r0
            java.lang.String r1 = "dismissed_chat"
            java.lang.String r0 = "timestamp < ?"
            r10.A01(r1, r0, r15)     // Catch:{ all -> 0x0d58 }
            r11.close()
            java.util.ArrayList r22 = new java.util.ArrayList
            r22.<init>()
            java.lang.String[] r1 = new java.lang.String[r12]
            long r25 = r35.A00()
            r10 = 604800000(0x240c8400, double:2.988109026E-315)
            long r25 = r25 - r10
            java.lang.String r0 = java.lang.Long.toString(r25)
            r1[r13] = r0
            X.0tf r11 = r34.get()
            X.0tg r10 = r11.A02     // Catch:{ all -> 0x0d58 }
            java.lang.String r0 = "SELECT chat_jid, timestamp FROM dismissed_chat WHERE timestamp > ?"
            android.database.Cursor r1 = r10.A08(r0, r1)     // Catch:{ all -> 0x0d58 }
            java.lang.String r0 = "chat_jid"
            int r15 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d51 }
            java.lang.String r0 = "timestamp"
            int r13 = r1.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0d51 }
        L_0x02c1:
            boolean r0 = r1.moveToNext()     // Catch:{ all -> 0x0d51 }
            if (r0 == 0) goto L_0x02e4
            java.lang.String r0 = r1.getString(r15)     // Catch:{ all -> 0x0d51 }
            X.0rv r12 = X.C15830rv.A02(r0)     // Catch:{ all -> 0x0d51 }
            long r25 = r1.getLong(r13)     // Catch:{ all -> 0x0d51 }
            if (r12 == 0) goto L_0x02c1
            java.lang.Long r0 = java.lang.Long.valueOf(r25)     // Catch:{ all -> 0x0d51 }
            X.01Q r10 = new X.01Q     // Catch:{ all -> 0x0d51 }
            r10.<init>(r12, r0)     // Catch:{ all -> 0x0d51 }
            r0 = r22
            r0.add(r10)     // Catch:{ all -> 0x0d51 }
            goto L_0x02c1
        L_0x02e4:
            r1.close()     // Catch:{ all -> 0x0d58 }
            r11.close()
            java.util.Iterator r11 = r22.iterator()
        L_0x02ee:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0304
            java.lang.Object r0 = r11.next()
            X.01Q r0 = (X.AnonymousClass01Q) r0
            java.util.Map r10 = r14.A03
            java.lang.Object r1 = r0.A00
            java.lang.Object r0 = r0.A01
            r10.put(r1, r0)
            goto L_0x02ee
        L_0x0304:
            r0 = r36
            X.1Vw r0 = r0.A11
            X.0rv r0 = r0.A00
            java.util.Map r1 = r14.A03
            boolean r10 = r1.containsKey(r0)
            if (r10 == 0) goto L_0x032c
            java.lang.Object r0 = r1.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r11 = r0.longValue()
            r0 = r36
            long r0 = r0.A0I
            int r10 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r10 < 0) goto L_0x032c
            goto L_0x0249
        L_0x0326:
            int r0 = r0.A05
            r21 = r0
            goto L_0x01ee
        L_0x032c:
            int r19 = r19 + r27
            int r43 = r43 + r21
            int r18 = r18 + 1
            java.util.Collections.reverse(r29)
            r1 = r23
            r0 = r29
            r1.add(r0)
            if (r30 == 0) goto L_0x034c
            r0 = r30
            X.0tZ r0 = r0.A00
            long r10 = r0.A0I
            X.0tZ r0 = r6.A00
            long r0 = r0.A0I
            int r12 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r12 >= 0) goto L_0x0354
        L_0x034c:
            X.0sG r0 = r2.A0C
            X.0sH r5 = r0.A0A(r9)
            r30 = r6
        L_0x0354:
            X.0tZ r0 = r6.A00
            X.1Vw r1 = r0.A11
            java.lang.String r6 = r1.A01
            r0 = r32
            r0.append(r6)
            boolean r6 = r1.A02
            r0.append(r6)
            X.0rv r0 = r1.A00
            java.lang.String r1 = X.C16030sJ.A03(r0)
            r0 = r32
            r0.append(r1)
            goto L_0x0190
        L_0x0371:
            java.lang.String r1 = "messagenotification/curmsg/null "
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r1 = " "
            r0.append(r1)
            r1 = r27
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0190
        L_0x038e:
            if (r4 == 0) goto L_0x03e9
            if (r16 != 0) goto L_0x03e9
            X.0sG r1 = r2.A0C
            X.1Vw r0 = r4.A11
            X.0rv r0 = r0.A00
            X.AnonymousClass00B.A06(r0)
            X.0sH r5 = r1.A0A(r0)
        L_0x039f:
            java.lang.String r0 = r32.toString()
            java.lang.String r22 = X.C004101u.A02(r0)
            X.AnonymousClass00B.A06(r22)
            X.0rz r0 = r2.A0O
            r63 = r0
            X.01D r0 = r0.A01
            r62 = r0
            java.lang.Object r1 = r62.get()
            android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
            java.lang.String r9 = "notification_hash"
            r0 = 0
            java.lang.String r1 = r1.getString(r9, r0)
            if (r18 == 0) goto L_0x03c4
            r10 = 0
            if (r5 != 0) goto L_0x03c5
        L_0x03c4:
            r10 = 1
        L_0x03c5:
            X.0pj r0 = r2.A0Z
            r61 = r0
            boolean r0 = r0.A0F(r7)
            r6 = r0 ^ 1
            r0 = r22
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x03ec
            java.lang.String r0 = "messagenotification/same "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = r22
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x0029
        L_0x03e9:
            r7 = r30
            goto L_0x039f
        L_0x03ec:
            if (r10 == 0) goto L_0x03f7
            X.0yL r3 = r2.A0M
            r1 = 1
            r0 = 0
            r3.A03(r1, r0)
            goto L_0x00f3
        L_0x03f7:
            if (r6 == 0) goto L_0x040b
            java.lang.String r0 = "messagenotification/muted "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            X.0rv r0 = r5.A0E
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto L_0x00f0
        L_0x040b:
            java.lang.String r0 = " hash="
            r3.append(r0)
            r0 = r22
            r3.append(r0)
            java.lang.String r0 = " msg="
            r3.append(r0)
            r0 = r19
            r3.append(r0)
            java.lang.String r0 = " contacts="
            r3.append(r0)
            r0 = r18
            r3.append(r0)
            java.lang.String r0 = " isWearRefresh="
            r3.append(r0)
            r0 = r17
            r3.append(r0)
            r0 = r24
            r3.append(r0)
            r0 = r20
            r3.append(r0)
            java.lang.String r0 = " newMessage="
            r3.append(r0)
            if (r4 == 0) goto L_0x0446
            java.lang.String r33 = "nonNull"
        L_0x0446:
            r0 = r33
            r3.append(r0)
            java.lang.Class<X.0rv> r30 = X.C15830rv.class
            r0 = r30
            com.whatsapp.jid.Jid r6 = r5.A08(r0)
            X.AnonymousClass00B.A06(r6)
            X.0rv r6 = (X.C15830rv) r6
            X.15q r0 = r2.A0b
            r60 = r0
            X.0sf r0 = r0.A0I
            boolean r0 = r0.A0Q(r6)
            if (r0 != 0) goto L_0x04e8
            boolean r0 = r6 instanceof X.C16050sL
            if (r0 == 0) goto L_0x0483
            r0 = r60
            java.util.HashMap r1 = r0.A0K
            java.lang.Object r0 = r1.get(r6)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0483
            long r12 = r0.longValue()
            long r10 = java.lang.System.currentTimeMillis()
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x04e8
            r1.remove(r6)
        L_0x0483:
            r27 = 0
        L_0x0485:
            boolean r26 = X.C16030sJ.A0L(r6)
            X.0tZ r11 = r7.A00
            r25 = 1
            r21 = 0
            if (r27 != 0) goto L_0x0502
            if (r26 == 0) goto L_0x0502
            X.0rt r0 = r2.A0Q
            long r14 = r0.A04(r6)
            r12 = 0
            int r0 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0502
            X.17k r0 = r2.A0m
            boolean r0 = r0.A00(r11)
            if (r0 != 0) goto L_0x0502
            X.0sO r0 = r2.A0R
            r1 = r6
            X.0sN r1 = (X.C16060sN) r1
            X.0us r0 = r0.A07
            X.1cE r0 = r0.A04(r1)
            X.0uz r13 = r0.A04()
            int r1 = r13.size()
            r0 = 10
            if (r1 <= r0) goto L_0x0502
            X.1Ub r12 = r13.iterator()
            r1 = 0
        L_0x04c3:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x04eb
            java.lang.Object r0 = r12.next()
            X.1ck r0 = (X.C30661ck) r0
            X.0sG r10 = r2.A0C
            com.whatsapp.jid.UserJid r0 = r0.A03
            X.0sH r0 = r10.A08(r0)
            if (r0 == 0) goto L_0x04c3
            X.1ko r0 = r0.A0D
            if (r0 == 0) goto L_0x04c3
            java.lang.String r0 = r0.A01
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x04c3
            int r1 = r1 + 1
            goto L_0x04c3
        L_0x04e8:
            r27 = 1
            goto L_0x0485
        L_0x04eb:
            r0 = 1120403456(0x42c80000, float:100.0)
            float r1 = (float) r1
            float r1 = r1 * r0
            int r0 = r13.size()
            float r0 = (float) r0
            float r1 = r1 / r0
            r0 = 1103626240(0x41c80000, float:25.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0502
            java.lang.String r0 = " initial-mute-large-group"
            r3.append(r0)
            r27 = 1
        L_0x0502:
            r10 = 0
            java.util.List r1 = r11.A0q
            if (r1 == 0) goto L_0x0515
            X.0sK r0 = r2.A05
            r0.A0B()
            X.1ZT r0 = r0.A05
            boolean r0 = r1.contains(r0)
            r1 = 1
            if (r0 != 0) goto L_0x0516
        L_0x0515:
            r1 = 0
        L_0x0516:
            X.0tZ r0 = r11.A0D()
            if (r0 == 0) goto L_0x05df
            X.0rv r0 = r0.A0B()
            if (r0 != 0) goto L_0x05df
        L_0x0522:
            if (r27 == 0) goto L_0x05db
            if (r26 == 0) goto L_0x05db
            if (r1 != 0) goto L_0x052a
            if (r25 == 0) goto L_0x05db
        L_0x052a:
            X.0rv r1 = r11.A0B()
            X.AnonymousClass00B.A06(r1)
            r0 = r64
            boolean r0 = r0.A0Q(r1)
            if (r0 != 0) goto L_0x05db
            java.lang.String r1 = r1.getRawString()
            r0 = r64
            X.1WS r10 = r0.A07(r1)
        L_0x0543:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r21)
            X.01Q r0 = new X.01Q
            r0.<init>(r10, r1)
            java.lang.Object r1 = r0.A00
            r27 = r1
            r1 = r27
            X.1WS r1 = (X.AnonymousClass1WS) r1
            r27 = r1
            java.lang.Object r0 = r0.A01
            X.AnonymousClass00B.A06(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r44 = r0.booleanValue()
            X.150 r0 = r2.A0c
            r59 = r0
            X.4Eh r0 = r0.A00
            if (r0 == 0) goto L_0x05d8
            com.obwhatsapp.notification.PopupNotification r1 = r0.A00
            boolean r0 = r1.A1Q
            if (r0 == 0) goto L_0x05d8
            X.0rv r0 = r1.A0x
            r21 = r0
        L_0x0573:
            r0 = r21
            boolean r11 = r6.equals(r0)
            r0 = r30
            com.whatsapp.jid.Jid r0 = r5.A08(r0)
            X.AnonymousClass00B.A06(r0)
            java.lang.String r1 = r0.getRawString()
            r0 = r64
            X.1WS r37 = r0.A07(r1)
            java.lang.String r0 = r37.A06()
            int r57 = java.lang.Integer.parseInt(r0)
            X.01V r0 = r2.A0K
            r58 = r0
            android.telephony.TelephonyManager r10 = r58.A0N()
            if (r4 == 0) goto L_0x05d5
            if (r10 == 0) goto L_0x05d5
            boolean r0 = X.C15450qv.A0A()
            if (r0 == 0) goto L_0x05ce
            X.0sj r1 = r2.A0N
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            int r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x05ce
        L_0x05b0:
            X.0vQ r0 = r2.A0A
            boolean r0 = r0.A00()
            if (r0 != 0) goto L_0x05d5
            if (r28 != 0) goto L_0x05d5
            boolean r0 = r37.A09()
            if (r0 == 0) goto L_0x05c2
            if (r44 != 0) goto L_0x05d5
        L_0x05c2:
            if (r57 != 0) goto L_0x05c6
            if (r11 == 0) goto L_0x05d5
        L_0x05c6:
            r45 = 1
        L_0x05c8:
            X.AnonymousClass00B.A00()
            r29 = 1
            goto L_0x05e3
        L_0x05ce:
            int r0 = r10.getCallState()     // Catch:{ SecurityException -> 0x05b0 }
            if (r0 != 0) goto L_0x05d5
            goto L_0x05b0
        L_0x05d5:
            r45 = 0
            goto L_0x05c8
        L_0x05d8:
            r21 = 0
            goto L_0x0573
        L_0x05db:
            r21 = r27
            goto L_0x0543
        L_0x05df:
            r25 = 0
            goto L_0x0522
        L_0x05e3:
            boolean r0 = com.obwhatsapp.notification.AndroidWear.A02()     // Catch:{ Exception -> 0x062e }
            if (r0 == 0) goto L_0x0635
            boolean r0 = X.C437421i.A01(r8)     // Catch:{ Exception -> 0x062e }
            if (r0 == 0) goto L_0x0635
            X.21f r0 = com.obwhatsapp.notification.AndroidWear.A09     // Catch:{ Exception -> 0x062e }
            if (r0 != 0) goto L_0x0606
            X.21k r1 = new X.21k     // Catch:{ Exception -> 0x062e }
            r1.<init>(r8)     // Catch:{ Exception -> 0x062e }
            X.21l r0 = X.AnonymousClass4B6.A02     // Catch:{ Exception -> 0x062e }
            r1.A01(r0)     // Catch:{ Exception -> 0x062e }
            X.21f r0 = r1.A00()     // Catch:{ Exception -> 0x062e }
            com.obwhatsapp.notification.AndroidWear.A09 = r0     // Catch:{ Exception -> 0x062e }
            r0.A08()     // Catch:{ Exception -> 0x062e }
        L_0x0606:
            X.21f r0 = com.obwhatsapp.notification.AndroidWear.A09     // Catch:{ Exception -> 0x062e }
            if (r0 == 0) goto L_0x0635
            boolean r0 = r0.A06()     // Catch:{ Exception -> 0x062e }
            if (r0 == 0) goto L_0x0635
            X.21f r1 = com.obwhatsapp.notification.AndroidWear.A09     // Catch:{ Exception -> 0x062e }
            X.3WY r0 = new X.3WY     // Catch:{ Exception -> 0x062e }
            r0.<init>(r1)     // Catch:{ Exception -> 0x062e }
            r1.A02(r0)     // Catch:{ Exception -> 0x062e }
            X.5Nu r0 = r0.await()     // Catch:{ Exception -> 0x062e }
            X.5UY r0 = (X.AnonymousClass5UY) r0     // Catch:{ Exception -> 0x062e }
            X.4tA r0 = (X.C98904tA) r0     // Catch:{ Exception -> 0x062e }
            java.util.List r0 = r0.A01     // Catch:{ Exception -> 0x062e }
            r0.size()     // Catch:{ Exception -> 0x062e }
            int r0 = r0.size()     // Catch:{ Exception -> 0x062e }
            if (r0 <= 0) goto L_0x0635
            goto L_0x0637
        L_0x062e:
            r1 = move-exception
            java.lang.String r0 = "androidwear/pairedcheck/failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0d5e }
            goto L_0x0637
        L_0x0635:
            r29 = 0
        L_0x0637:
            java.lang.String r0 = " isAndroidWearPaired="
            r3.append(r0)
            r0 = r29
            r3.append(r0)
            boolean r15 = r2.A0r
            r10 = 134217728(0x8000000, float:3.85186E-34)
            if (r15 == 0) goto L_0x0a25
            r1 = 1
            r0 = r18
            if (r0 != r1) goto L_0x0a25
            r0 = 0
            X.01Q r0 = A00(r8, r5, r0)
            java.lang.Object r1 = r0.A00
            X.AnonymousClass00B.A06(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r0 = r0.A01
            android.content.Intent r0 = (android.content.Intent) r0
        L_0x0660:
            android.content.Intent r0 = com.obwhatsapp.yo.yo.notifIn(r0)
            android.app.PendingIntent r32 = X.C42341xd.A00(r8, r1, r0, r10)
            java.lang.Class<com.obwhatsapp.notification.MessageNotificationDismissedReceiver> r0 = com.obwhatsapp.notification.MessageNotificationDismissedReceiver.class
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r8, r0)
            r0 = r22
            r1.putExtra(r9, r0)
            r9 = 1
            android.app.PendingIntent r33 = X.C42341xd.A01(r8, r9, r1, r10)
            int r26 = r19 + r43
            r10 = 0
            r0 = r18
            if (r0 != r9) goto L_0x09e3
            r0 = r19
            if (r0 == r9) goto L_0x068c
            if (r43 == 0) goto L_0x09ce
            X.0tZ r0 = r7.A00
            boolean r0 = r0 instanceof X.C39101rv
            if (r0 == 0) goto L_0x09ce
        L_0x068c:
            if (r15 == 0) goto L_0x09ce
            java.lang.CharSequence r39 = r7.A03(r5, r10)
        L_0x0692:
            X.0sP r0 = r2.A0E
            java.lang.String r0 = r0.A08(r5)
            java.lang.String r0 = com.obwhatsapp.yo.yo.HNotifTitle(r5, r0)
            java.lang.String r40 = X.C40651uT.A03(r0)
        L_0x06a0:
            X.0vQ r0 = r2.A0A
            r48 = r0
            X.013 r1 = r2.A0P
            X.15N r0 = r2.A0S
            r51 = r0
            X.0yi r13 = r2.A0I
            X.14x r0 = r2.A09
            X.39O r14 = new X.39O
            r46 = r14
            r47 = r0
            r49 = r13
            r50 = r1
            r52 = r60
            r53 = r4
            r54 = r15
            r55 = r17
            r56 = r20
            r46.<init>(r47, r48, r49, r50, r51, r52, r53, r54, r55, r56)
            r31 = r14
            r34 = r8
            r35 = r5
            r36 = r7
            r38 = r27
            r41 = r3
            r42 = r19
            X.03l r0 = r31.A00(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45)
            boolean r27 = r2.A05(r5)
            r1 = r30
            com.whatsapp.jid.Jid r1 = r5.A08(r1)
            X.0rv r1 = (X.C15830rv) r1
            X.0rt r9 = r2.A0Q
            int r11 = r9.A00(r6)
            X.AnonymousClass00B.A06(r7)
            X.0tZ r9 = r7.A00
            long r9 = r9.A0G
            boolean r25 = r2.A07(r1, r11, r9)
            int r9 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r9 >= r1) goto L_0x0779
            if (r17 != 0) goto L_0x0779
            java.lang.String r1 = r37.A06()
            int r10 = java.lang.Integer.parseInt(r1)
            r12 = 0
            r1 = 1
            r9 = r18
            if (r9 != r1) goto L_0x070e
            r38 = 1
            if (r27 != 0) goto L_0x0710
        L_0x070e:
            r38 = 0
        L_0x0710:
            if (r10 != 0) goto L_0x0715
            r11 = 1
            if (r25 != 0) goto L_0x0716
        L_0x0715:
            r11 = 0
        L_0x0716:
            X.17V r9 = r2.A0J
            X.0tZ r10 = r7.A00
            X.0pd r9 = r9.A03
            boolean r9 = X.C38621r6.A0Z(r9, r10)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r9)
            r9 = r19
            if (r9 != r1) goto L_0x09c1
            boolean r9 = r10.booleanValue()
            if (r9 == 0) goto L_0x09c1
            X.0sH r9 = r7.A01()
            r2.A03(r0, r9, r7)
            r38 = 0
        L_0x0737:
            boolean r9 = com.obwhatsapp.notification.AndroidWear.A02()
            if (r9 == 0) goto L_0x0750
            X.15q r9 = r7.A09
            r35 = 1
            r36 = 1
            r31 = r9
            r32 = r0
            r33 = r5
            r34 = r7
            r37 = r29
            r31.A0K(r32, r33, r34, r35, r36, r37, r38)
        L_0x0750:
            r7.A06(r0, r5, r3, r15)
            boolean r12 = r7.A07(r8, r0, r5)
        L_0x0757:
            r7 = r18
            if (r7 != r1) goto L_0x0779
            r1 = r60
            android.graphics.Bitmap r1 = r1.A0C(r5)
            r0.A06(r1)
            X.0pd r9 = r2.A0T
            r7 = 2991(0xbaf, float:4.191E-42)
            X.0tM r1 = X.C16620tM.A02
            boolean r9 = r9.A0E(r1, r7)
            if (r9 != 0) goto L_0x099a
            if (r11 == 0) goto L_0x099a
            if (r12 != 0) goto L_0x099a
        L_0x0774:
            r1 = r60
            r1.A0J(r0, r5)
        L_0x0779:
            long r9 = java.lang.System.currentTimeMillis()
            r1 = r61
            long r11 = r1.A00
            long r27 = r9 - r11
            r1.A00 = r9
            r9 = 200(0xc8, double:9.9E-322)
            int r1 = (r27 > r9 ? 1 : (r27 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x08b2
            if (r20 != 0) goto L_0x08b2
            android.telephony.TelephonyManager r12 = r58.A0N()
            r1 = r30
            com.whatsapp.jid.Jid r1 = r5.A08(r1)
            X.AnonymousClass00B.A06(r1)
            java.lang.String r7 = r1.getRawString()
            r1 = r64
            X.1WS r28 = r1.A07(r7)
            boolean r11 = r48.A00()
            boolean r27 = r48.A02()
            r10 = 1
            r25 = 0
            if (r11 == 0) goto L_0x07b4
            r9 = 1
            if (r27 == 0) goto L_0x07b5
        L_0x07b4:
            r9 = 0
        L_0x07b5:
            if (r12 == 0) goto L_0x07c7
            boolean r1 = X.C15450qv.A0A()
            if (r1 == 0) goto L_0x0991
            X.0sj r7 = r2.A0N
            java.lang.String r1 = "android.permission.READ_PHONE_STATE"
            int r1 = r7.A03(r1)
            if (r1 == 0) goto L_0x0991
        L_0x07c7:
            r1 = 0
        L_0x07c8:
            if (r11 != 0) goto L_0x07d4
            if (r1 != 0) goto L_0x07d4
            X.2DT r7 = r13.A00
            if (r7 == 0) goto L_0x0945
            boolean r7 = r7.A0R
            if (r7 == 0) goto L_0x0945
        L_0x07d4:
            java.lang.String r7 = " vibrate=force off ("
            r3.append(r7)
            r3.append(r9)
            r7 = 32
            r3.append(r7)
            r3.append(r1)
            r7 = 41
            r3.append(r7)
            long[] r10 = new long[r10]
            r11 = 0
            r10[r25] = r11
            android.app.Notification r7 = r0.A07
            r7.vibrate = r10
            if (r1 != 0) goto L_0x087e
        L_0x07f5:
            if (r27 != 0) goto L_0x087e
            r11 = 0
            X.12E r1 = r2.A03
            X.1yO r7 = r1.A00()
            X.0yW r1 = r2.A0h
            boolean r1 = r1.A00
            if (r1 != 0) goto L_0x0932
            X.0tH r1 = r2.A02
            boolean r1 = r1.A00
            if (r1 == 0) goto L_0x0932
            r1 = r30
            com.whatsapp.jid.Jid r1 = r5.A08(r1)
            X.0rv r1 = (X.C15830rv) r1
            boolean r1 = r7.A01(r1)
            if (r1 == 0) goto L_0x0932
            java.lang.Object r10 = r62.get()
            android.content.SharedPreferences r10 = (android.content.SharedPreferences) r10
            java.lang.String r7 = "conversation_sound"
            r1 = 1
            boolean r1 = r10.getBoolean(r7, r1)
            if (r1 == 0) goto L_0x0840
            java.lang.String r1 = " tone=conversation"
            r3.append(r1)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = X.AnonymousClass01S.A04
            r7.append(r1)
            r1 = 2131820550(0x7f110006, float:1.9273818E38)
            r7.append(r1)
            java.lang.String r11 = r7.toString()
        L_0x0840:
            if (r9 == 0) goto L_0x085c
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 != 0) goto L_0x085c
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r1 = X.AnonymousClass01S.A04
            r7.append(r1)
            r1 = 2131820552(0x7f110008, float:1.9273822E38)
            r7.append(r1)
            java.lang.String r11 = r7.toString()
        L_0x085c:
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 != 0) goto L_0x087e
            android.net.Uri r7 = android.net.Uri.parse(r11)
            java.lang.String r1 = " sound="
            r3.append(r1)
            r3.append(r7)
            if (r7 == 0) goto L_0x087e
            if (r44 != 0) goto L_0x087e
            X.15O r1 = r2.A0l
            r9 = r7
            r10 = r0
            r11 = r58
            r12 = r51
            r13 = r1
            X.C218415q.A09(r8, r9, r10, r11, r12, r13)
        L_0x087e:
            X.0yW r7 = r2.A0h
            boolean r1 = r7.A00
            if (r1 == 0) goto L_0x0927
            java.lang.String r1 = r28.A05()
            java.lang.Integer r1 = X.C218415q.A04(r1)
            if (r1 == 0) goto L_0x0924
            int r10 = r1.intValue()
            r7 = 1000(0x3e8, float:1.401E-42)
            r1 = 4000(0xfa0, float:5.605E-42)
            android.app.Notification r9 = r0.A07
            r9.ledARGB = r10
            r9.ledOnMS = r7
            r9.ledOffMS = r1
            r7 = 1
            int r1 = r9.flags
            r1 = r1 & -2
            r7 = r7 | r1
            r9.flags = r7
            java.lang.String r1 = " color="
            r3.append(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r10)
        L_0x08af:
            r3.append(r1)
        L_0x08b2:
            boolean r1 = com.obwhatsapp.notification.AndroidWear.A02()
            if (r1 == 0) goto L_0x08f9
            r1 = 31
            com.facebook.redex.IDxComparatorShape19S0000000_2_I0 r7 = new com.facebook.redex.IDxComparatorShape19S0000000_2_I0
            r7.<init>(r1)
            r1 = r23
            java.util.Collections.sort(r1, r7)
            int r7 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r7 < r1) goto L_0x08dc
            r1 = 27
            if (r7 > r1) goto L_0x08dc
            int r7 = r23.size()
            r1 = 2
            if (r7 != r1) goto L_0x08dc
            X.0yL r9 = r2.A0M
            r7 = 1
            r1 = 0
            r9.A03(r7, r1)
        L_0x08dc:
            if (r15 == 0) goto L_0x08f9
            r35 = 0
            r30 = r2
            r31 = r3
            r32 = r23
            r33 = r19
            r34 = r18
            r36 = r29
            r37 = r45
            r38 = r65
            boolean r12 = com.obwhatsapp.yo.yo.HNoNotif(r5)
            if (r12 != 0) goto L_0x08f9
            r30.A04(r31, r32, r33, r34, r35, r36, r37, r38)
        L_0x08f9:
            androidx.core.app.NotificationCompat$InboxStyle r12 = new androidx.core.app.NotificationCompat$InboxStyle
            r12.<init>()
            java.lang.CharSequence r1 = X.C007503l.A00(r39)
            r12.A01 = r1
            r1 = 1
            r12.A02 = r1
            java.lang.String r1 = r14.A00
            r25 = r1
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r7 = r23.iterator()
        L_0x0914:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0a2c
            java.lang.Object r1 = r7.next()
            java.util.Collection r1 = (java.util.Collection) r1
            r10.addAll(r1)
            goto L_0x0914
        L_0x0924:
            java.lang.String r1 = " color=null"
            goto L_0x08af
        L_0x0927:
            java.lang.String r1 = " screen_lock="
            r3.append(r1)
            boolean r1 = r7.A00
            r3.append(r1)
            goto L_0x08b2
        L_0x0932:
            java.lang.String r1 = " tone=notification"
            r3.append(r1)
            java.lang.String r11 = r28.A07()
            if (r11 != 0) goto L_0x0840
            android.net.Uri r1 = android.provider.Settings.System.DEFAULT_NOTIFICATION_URI
            java.lang.String r11 = r1.toString()
            goto L_0x0840
        L_0x0945:
            if (r44 != 0) goto L_0x07f5
            java.lang.String r7 = r28.A08()
            java.lang.String r1 = " vibrate="
            r3.append(r1)
            r3.append(r7)
            int r11 = r7.hashCode()
            r1 = 2
            switch(r11) {
                case 49: goto L_0x095d;
                case 50: goto L_0x096a;
                case 51: goto L_0x0974;
                default: goto L_0x095b;
            }
        L_0x095b:
            goto L_0x07f5
        L_0x095d:
            java.lang.String r10 = "1"
            boolean r7 = r7.equals(r10)
            if (r7 == 0) goto L_0x07f5
            r0.A02(r1)
            goto L_0x07f5
        L_0x096a:
            java.lang.String r1 = "2"
            boolean r1 = r7.equals(r1)
            if (r1 != 0) goto L_0x097d
            goto L_0x07f5
        L_0x0974:
            java.lang.String r1 = "3"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L_0x07f5
            r10 = 2
        L_0x097d:
            r1 = 5
            long[] r1 = new long[r1]
            int r10 = 1 - r10
            if (r10 == 0) goto L_0x098d
            r1 = {0, 750, 250, 750, 250} // fill-array
        L_0x0987:
            android.app.Notification r7 = r0.A07
            r7.vibrate = r1
            goto L_0x07f5
        L_0x098d:
            r1 = {0, 300, 200, 300, 200} // fill-array
            goto L_0x0987
        L_0x0991:
            int r7 = r12.getCallState()     // Catch:{ SecurityException -> 0x07c7 }
            r1 = 1
            if (r7 != 0) goto L_0x07c8
            goto L_0x07c7
        L_0x099a:
            boolean r1 = r2.A06(r5)
            if (r1 == 0) goto L_0x09ad
            r2.A01(r0, r5)
        L_0x09a3:
            if (r9 == 0) goto L_0x0779
            boolean r1 = r10.booleanValue()
            if (r1 != 0) goto L_0x0779
            goto L_0x0774
        L_0x09ad:
            if (r45 != 0) goto L_0x09a3
            if (r12 != 0) goto L_0x09a3
            boolean r1 = r10.booleanValue()
            if (r1 != 0) goto L_0x09a3
            X.04E r7 = com.obwhatsapp.notification.AndroidWear.A00(r8, r5)
            java.util.ArrayList r1 = r0.A0N
            r1.add(r7)
            goto L_0x09a3
        L_0x09c1:
            if (r38 == 0) goto L_0x09c8
            r9 = r19
            r2.A02(r0, r5, r9, r1)
        L_0x09c8:
            r9 = r19
            if (r9 != r1) goto L_0x0757
            goto L_0x0737
        L_0x09ce:
            X.013 r13 = r7.A07
            r1 = 2131755243(0x7f1000eb, float:1.914136E38)
            r0 = r26
            long r11 = (long) r0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r26)
            r0[r10] = r14
            java.lang.String r39 = r13.A0J(r0, r1, r11)
            goto L_0x0a0e
        L_0x09e3:
            X.013 r12 = r7.A07
            long r0 = (long) r0
            r34 = r0
            r0 = 2
            java.lang.Object[] r11 = new java.lang.Object[r0]
            r1 = 2131755244(0x7f1000ec, float:1.9141362E38)
            r0 = r26
            long r13 = (long) r0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r25 = java.lang.Integer.valueOf(r26)
            r0[r10] = r25
            java.lang.String r0 = r12.A0J(r0, r1, r13)
            r11[r10] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r18)
            r11[r9] = r0
            r10 = 2131755245(0x7f1000ed, float:1.9141364E38)
            r0 = r34
            java.lang.String r39 = r12.A0J(r11, r10, r0)
        L_0x0a0e:
            if (r15 == 0) goto L_0x0a16
            r0 = r18
            if (r0 != r9) goto L_0x0a16
            goto L_0x0692
        L_0x0a16:
            r0 = r60
            X.0tz r0 = r0.A09
            android.content.Context r1 = r0.A00
            r0 = 2131893493(0x7f121cf5, float:1.9421764E38)
            java.lang.String r40 = r1.getString(r0)
            goto L_0x06a0
        L_0x0a25:
            r1 = 2
            android.content.Intent r0 = X.C14750ph.A03(r8)
            goto L_0x0660
        L_0x0a2c:
            r7 = 0
            X.2By r1 = new X.2By
            r1.<init>(r7)
            java.util.Collections.sort(r10, r1)
            int r1 = r10.size()
            int r1 = r1 + -7
            r9 = 0
            int r7 = java.lang.Math.max(r7, r1)
            int r1 = r10.size()
            java.util.List r19 = r10.subList(r7, r1)
            int r1 = r19.size()
            r13 = 1
            if (r1 <= r13) goto L_0x0ad7
            if (r15 == 0) goto L_0x0ad7
            r11 = 0
        L_0x0a52:
            int r1 = r19.size()
            if (r11 >= r1) goto L_0x0ac2
            r1 = r19
            java.lang.Object r10 = r1.get(r11)
            X.1ps r10 = (X.C37871ps) r10
            X.0sG r7 = r10.A04
            X.0tZ r1 = r10.A00
            X.1Vw r1 = r1.A11
            X.0rv r1 = r1.A00
            X.AnonymousClass00B.A06(r1)
            X.0sH r14 = r7.A0A(r1)
            r7 = 1
            r1 = r18
            if (r1 > r13) goto L_0x0a75
            r7 = 0
        L_0x0a75:
            java.lang.CharSequence r1 = r10.A03(r14, r7)
            java.lang.CharSequence r14 = com.obwhatsapp.yo.Conversation.pNotifi((X.C16010sH) r14, (java.lang.CharSequence) r1)
            if (r14 == 0) goto L_0x0a88
            java.util.ArrayList r7 = r12.A00
            java.lang.CharSequence r1 = X.C007503l.A00(r14)
            r7.add(r1)
        L_0x0a88:
            java.lang.String r1 = " line:"
            r3.append(r1)
            java.lang.String r1 = "("
            r3.append(r1)
            int r1 = r14.length()
            r3.append(r1)
            r7 = 47
            r3.append(r7)
            X.0tZ r1 = r10.A00
            X.1Vw r1 = r1.A11
            X.0rv r1 = r1.A00
            X.AnonymousClass00B.A06(r1)
            java.lang.String r1 = r1.toString()
            r3.append(r1)
            r3.append(r7)
            X.0tZ r1 = r10.A00
            X.1Vw r1 = r1.A11
            java.lang.String r1 = r1.A01
            r3.append(r1)
            java.lang.String r1 = ")"
            r3.append(r1)
            int r11 = r11 + 1
            goto L_0x0a52
        L_0x0ac2:
            r0.A08(r12)
            java.lang.String r1 = " inbox:"
            r3.append(r1)
            r7 = 8
            int r1 = r19.size()
            int r1 = java.lang.Math.min(r7, r1)
            r3.append(r1)
        L_0x0ad7:
            int r1 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            if (r1 < r7) goto L_0x0aeb
            X.0rv r7 = r5.A0E
            X.AnonymousClass00B.A06(r7)
            java.lang.String r7 = r7.getRawString()
            if (r7 == 0) goto L_0x0aec
            r0.A0L = r7
            goto L_0x0aec
        L_0x0aeb:
            r7 = 0
        L_0x0aec:
            android.app.Notification r10 = r0.A01()     // Catch:{ SecurityException -> 0x0b1e }
            r0 = 24
            if (r1 < r0) goto L_0x0b00
            if (r15 == 0) goto L_0x0b00
            X.18Y r0 = r2.A0d     // Catch:{ SecurityException -> 0x0b1e }
            X.1vD r0 = r0.A00(r8)     // Catch:{ SecurityException -> 0x0b1e }
            r0.A01(r10, r8, r9)     // Catch:{ SecurityException -> 0x0b1e }
            goto L_0x0b0b
        L_0x0b00:
            X.18Y r0 = r2.A0d     // Catch:{ SecurityException -> 0x0b1e }
            X.1vD r1 = r0.A00(r8)     // Catch:{ SecurityException -> 0x0b1e }
            r0 = r26
            r1.A01(r10, r8, r0)     // Catch:{ SecurityException -> 0x0b1e }
        L_0x0b0b:
            if (r7 == 0) goto L_0x0b12
            X.0yv r0 = r2.A06     // Catch:{ SecurityException -> 0x0b1e }
            r0.A03(r8, r5)     // Catch:{ SecurityException -> 0x0b1e }
        L_0x0b12:
            X.0yL r0 = r2.A0M     // Catch:{ SecurityException -> 0x0b1e }
            boolean r1 = com.obwhatsapp.yo.yo.HNoNotif(r5)     // Catch:{ SecurityException -> 0x0b1e }
            if (r1 != 0) goto L_0x0b53
            r0.A02(r13, r10)     // Catch:{ SecurityException -> 0x0b1e }
            goto L_0x0b53
        L_0x0b1e:
            r7 = move-exception
            java.lang.String r0 = "messagenotification/postSummaryNotification uid="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            int r0 = android.os.Process.myUid()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i(r0, r7)
            boolean r0 = X.C41971wz.A04()
            if (r0 == 0) goto L_0x0cce
            if (r25 == 0) goto L_0x0d5d
            android.util.Pair r0 = X.C41031v7.A00(r25)
            if (r0 == 0) goto L_0x0d5d
            java.lang.Object r0 = r0.first
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0d5d
            r1 = r64
            X.1WS r1 = r1.A07(r0)
            r0 = r64
            r0.A0J(r1)
        L_0x0b53:
            android.content.SharedPreferences$Editor r7 = r63.A0K()
            java.lang.String r1 = "last_notification_hash"
            r0 = r22
            android.content.SharedPreferences$Editor r0 = r7.putString(r1, r0)
            r0.apply()
            java.lang.String r1 = "messagenotification/notify"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r4 == 0) goto L_0x0b94
            if (r20 != 0) goto L_0x0b94
            java.lang.String r0 = "messagenotification/ new="
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            java.lang.String r0 = X.C38621r6.A0J(r4)
            r1.append(r0)
            r0 = r24
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0b94:
            if (r17 != 0) goto L_0x002c
            X.12E r0 = r2.A03
            X.1yO r1 = r0.A00()
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0cca
            X.1yP r0 = r1.A00()
            com.obwhatsapp.Conversation r0 = (com.obwhatsapp.Conversation) r0
            X.1yj r1 = r0.A00
            X.1yV r0 = r1.A22
            X.0pL r0 = (X.C14530pL) r0
            X.0yW r0 = r0.A0A
            boolean r0 = r0.A00
            if (r0 == 0) goto L_0x0bbe
            r1.A4k = r13
            X.0rv r0 = r1.A33
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x0bbe
            r1.A4h = r9
        L_0x0bbe:
            if (r45 == 0) goto L_0x0be2
            X.0pt r7 = r2.A04
            X.0yW r3 = r2.A0h
            X.0tH r1 = r2.A02
            r58 = 4
            com.facebook.redex.RunnableRunnableShape0S0501000_I0 r0 = new com.facebook.redex.RunnableRunnableShape0S0501000_I0
            r51 = r0
            r52 = r8
            r53 = r3
            r54 = r59
            r55 = r1
            r56 = r21
            boolean r3 = com.obwhatsapp.yo.yo.HNoNotif(r5)
            if (r3 != 0) goto L_0x0be2
            r51.<init>(r52, r53, r54, r55, r56, r57, r58)
            r7.A0K(r0)
        L_0x0be2:
            if (r4 == 0) goto L_0x002c
            boolean r0 = r5.A0J()
            if (r0 == 0) goto L_0x0c20
            X.0sN r6 = (X.C16060sN) r6
            r0 = r60
            X.0sO r0 = r0.A0C
            X.0us r0 = r0.A07
            X.1cE r0 = r0.A04(r6)
            java.util.Map r0 = r0.A04
            int r3 = r0.size()
            int r1 = r3 + -1
            r0 = 35
            if (r3 >= r0) goto L_0x0cc5
            r7 = 120000(0x1d4c0, double:5.9288E-319)
        L_0x0c05:
            long r14 = java.lang.System.currentTimeMillis()
            r12 = 30000(0x7530, double:1.4822E-319)
            r10 = 5000(0x1388, double:2.4703E-320)
            long r0 = (long) r1
            long r0 = r0 * r10
            long r0 = r0 + r12
            long r0 = java.lang.Math.min(r0, r7)
            long r14 = r14 + r0
            r0 = r60
            java.util.HashMap r1 = r0.A0K
            java.lang.Long r0 = java.lang.Long.valueOf(r14)
            r1.put(r6, r0)
        L_0x0c20:
            X.18Z r0 = r2.A07
            r0.A01()
            X.1Vw r3 = r4.A11
            X.0rv r1 = r3.A00
            X.15I r0 = r2.A0H
            r0.A09(r1, r9)
            X.16q r5 = r2.A0V
            java.lang.String r7 = r3.toString()
            if (r1 == 0) goto L_0x0cbf
            boolean r0 = X.C16030sJ.A0L(r1)
            if (r0 == 0) goto L_0x0cba
            r9 = 2
        L_0x0c3d:
            java.lang.String r8 = r1.getRawString()
        L_0x0c41:
            boolean r0 = r4 instanceof X.C30581cc
            if (r0 == 0) goto L_0x0c5e
            X.1cc r4 = (X.C30581cc) r4
            java.lang.String r0 = r4.A06
            r1 = 1
            if (r0 == 0) goto L_0x0c4e
            r1 = 18
        L_0x0c4e:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
        L_0x0c52:
            X.1WA r0 = r5.A03
            r10 = 0
            com.facebook.redex.RunnableRunnableShape0S2201000_I0 r4 = new com.facebook.redex.RunnableRunnableShape0S2201000_I0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.execute(r4)
            return
        L_0x0c5e:
            boolean r0 = r4 instanceof X.C38701rH
            if (r0 == 0) goto L_0x0c64
            r1 = 2
            goto L_0x0c4e
        L_0x0c64:
            boolean r0 = r4 instanceof X.C38631rA
            if (r0 == 0) goto L_0x0c6a
            r1 = 3
            goto L_0x0c4e
        L_0x0c6a:
            boolean r0 = r4 instanceof X.C38681rF
            if (r0 == 0) goto L_0x0c70
            r1 = 4
            goto L_0x0c4e
        L_0x0c70:
            boolean r0 = r4 instanceof X.C38711rI
            if (r0 == 0) goto L_0x0c76
            r1 = 5
            goto L_0x0c4e
        L_0x0c76:
            boolean r0 = r4 instanceof X.C38641rB
            if (r0 == 0) goto L_0x0c7d
            r1 = 8
            goto L_0x0c4e
        L_0x0c7d:
            if (r16 == 0) goto L_0x0c82
            r1 = 9
            goto L_0x0c4e
        L_0x0c82:
            boolean r0 = r4 instanceof X.C30071bh
            if (r0 == 0) goto L_0x0c89
            r1 = 10
            goto L_0x0c4e
        L_0x0c89:
            boolean r0 = r4 instanceof X.C39191s4
            if (r0 == 0) goto L_0x0c90
            r1 = 14
            goto L_0x0c4e
        L_0x0c90:
            boolean r0 = r4 instanceof X.C39351sL
            if (r0 != 0) goto L_0x0cb7
            boolean r0 = r4 instanceof X.C39061rr
            if (r0 != 0) goto L_0x0cb7
            boolean r0 = r4 instanceof X.C39171s2
            if (r0 == 0) goto L_0x0c9f
            r1 = 16
            goto L_0x0c4e
        L_0x0c9f:
            boolean r0 = r4 instanceof X.C30901d9
            if (r0 == 0) goto L_0x0ca6
            r1 = 17
            goto L_0x0c4e
        L_0x0ca6:
            boolean r0 = r4 instanceof X.C38771rO
            if (r0 == 0) goto L_0x0cb5
            X.1rO r4 = (X.C38771rO) r4
            boolean r0 = r4.A16()
            r1 = 6
            if (r0 == 0) goto L_0x0c4e
            r1 = 7
            goto L_0x0c4e
        L_0x0cb5:
            r6 = 0
            goto L_0x0c52
        L_0x0cb7:
            r1 = 15
            goto L_0x0c4e
        L_0x0cba:
            boolean r0 = r1 instanceof com.whatsapp.jid.UserJid
            r9 = 1
            if (r0 != 0) goto L_0x0c3d
        L_0x0cbf:
            r9 = 3
            if (r1 != 0) goto L_0x0c3d
            r8 = 0
            goto L_0x0c41
        L_0x0cc5:
            r7 = 300000(0x493e0, double:1.482197E-318)
            goto L_0x0c05
        L_0x0cca:
            X.AnonymousClass4B0.A00 = r13
            goto L_0x0bbe
        L_0x0cce:
            java.lang.String r0 = r7.toString()
            boolean r0 = X.C41971wz.A0C(r0)
            if (r0 == 0) goto L_0x0d5d
            goto L_0x0b53
        L_0x0cda:
            X.0tg r13 = r10.A02     // Catch:{ all -> 0x0d4c }
            java.lang.String r11 = X.AnonymousClass1WW.A0C     // Catch:{ all -> 0x0d4c }
            r5 = 2
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch:{ all -> 0x0d4c }
            r18 = 0
            X.0ts r5 = r12.A03     // Catch:{ all -> 0x0d4c }
            long r14 = r5.A02(r1)     // Catch:{ all -> 0x0d4c }
            java.lang.String r5 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x0d4c }
            r6[r18] = r5     // Catch:{ all -> 0x0d4c }
            r5 = 1
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0d4c }
            r6[r5] = r0     // Catch:{ all -> 0x0d4c }
            android.database.Cursor r5 = r13.A08(r11, r6)     // Catch:{ all -> 0x0d4c }
            r12.A05(r5, r1, r9)     // Catch:{ all -> 0x0d45 }
            if (r5 == 0) goto L_0x0d02
            r5.close()     // Catch:{ all -> 0x0d4c }
        L_0x0d02:
            r10.close()
            X.0vN r6 = r12.A05
            long r0 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r16
            java.lang.String r5 = "LastMessageStore/getLastMessagesForNotificationAfterReply"
            r6.A00(r5, r0)
            java.util.Iterator r1 = r9.iterator()
        L_0x0d16:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0d2a
            java.lang.Object r0 = r1.next()
            X.0tZ r0 = (X.C16740tZ) r0
            X.1ps r0 = r8.A02(r0)
            r7.add(r0)
            goto L_0x0d16
        L_0x0d2a:
            java.util.Collections.reverse(r7)
            r0 = r23
            r0.add(r7)
            r19 = 0
            r21 = 0
            r22 = 0
            r15 = r2
            r16 = r3
            r17 = r0
            r20 = r4
            r23 = r65
            r15.A04(r16, r17, r18, r19, r20, r21, r22, r23)
            return
        L_0x0d45:
            r0 = move-exception
            if (r5 == 0) goto L_0x0d4b
            r5.close()     // Catch:{ all -> 0x0d4b }
        L_0x0d4b:
            throw r0     // Catch:{ all -> 0x0d4c }
        L_0x0d4c:
            r0 = move-exception
            r10.close()     // Catch:{ all -> 0x0d5c }
            throw r0
        L_0x0d51:
            r0 = move-exception
            if (r1 == 0) goto L_0x0d57
            r1.close()     // Catch:{ all -> 0x0d57 }
        L_0x0d57:
            throw r0     // Catch:{ all -> 0x0d58 }
        L_0x0d58:
            r0 = move-exception
            r11.close()     // Catch:{ all -> 0x0d5c }
        L_0x0d5c:
            throw r0
        L_0x0d5d:
            throw r7
        L_0x0d5e:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45992Bx.run():void");
    }
}
