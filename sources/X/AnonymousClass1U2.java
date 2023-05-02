package X;

import android.text.TextUtils;
import android.util.Base64;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1U2  reason: invalid class name */
public class AnonymousClass1U2 implements AnonymousClass1U3, C19420yP {
    public final C16300so A00;
    public final C14870pt A01;
    public final C16040sK A02;
    public final C15900s5 A03;
    public final C17150uc A04;
    public final AnonymousClass13V A05;
    public final AnonymousClass16O A06;
    public final AnonymousClass13W A07;
    public final C28011Tz A08;
    public final C18640x1 A09;
    public final AnonymousClass11T A0A;
    public final C17030uP A0B;
    public final C19230xz A0C;
    public final C16440t3 A0D;
    public final C16980tz A0E;
    public final C15860rz A0F;
    public final C16460t6 A0G;
    public final C14710pd A0H;
    public final C16490t9 A0I;
    public final AnonymousClass124 A0J;
    public final C207811o A0K;
    public final AnonymousClass13T A0L;
    public final AnonymousClass1U1 A0M;
    public final AnonymousClass1U0 A0N;
    public final AnonymousClass13U A0O;
    public final C226918x A0P;
    public final C16320sq A0Q;
    public final Map A0R = new HashMap();
    public final AnonymousClass01J A0S;
    public final AnonymousClass01J A0T;

    public AnonymousClass1U2(C16300so r2, C14870pt r3, C16040sK r4, C15900s5 r5, C17150uc r6, AnonymousClass13V r7, AnonymousClass16O r8, AnonymousClass13W r9, C28011Tz r10, C18640x1 r11, AnonymousClass11T r12, C17030uP r13, C19230xz r14, C16440t3 r15, C16980tz r16, C15860rz r17, C16460t6 r18, C14710pd r19, C16490t9 r20, AnonymousClass124 r21, C207811o r22, AnonymousClass13T r23, AnonymousClass1U1 r24, AnonymousClass1U0 r25, AnonymousClass13U r26, C226918x r27, C16320sq r28, AnonymousClass01J r29, AnonymousClass01J r30) {
        this.A0D = r15;
        this.A0H = r19;
        this.A01 = r3;
        this.A00 = r2;
        this.A0Q = r28;
        this.A02 = r4;
        this.A0E = r16;
        this.A0I = r20;
        this.A0J = r21;
        this.A03 = r5;
        this.A0G = r18;
        this.A08 = r10;
        this.A0N = r25;
        this.A07 = r9;
        this.A0C = r14;
        this.A09 = r11;
        this.A0K = r22;
        this.A0P = r27;
        this.A0B = r13;
        this.A0F = r17;
        this.A06 = r8;
        this.A04 = r6;
        this.A0A = r12;
        this.A05 = r7;
        this.A0O = r26;
        this.A0M = r24;
        this.A0L = r23;
        this.A0S = r29;
        this.A0T = r30;
    }

    public final void A00(String str) {
        ((C16150sX) ((AnonymousClass01F) C004501y.A00(AnonymousClass01F.class, this.A0E.A00))).A2n.get();
        C16300so r2 = this.A00;
        StringBuilder sb = new StringBuilder("notificationType = ");
        sb.append(str);
        sb.append("; isSMB = ");
        sb.append(false);
        sb.append("; DirectoryEnabled = ");
        sb.append(false);
        r2.AcB("BusinessNotificationHandler/isSmbNotificationAllowed Trying to show a NUX Upsell notification to a not eligible user", sb.toString(), false);
    }

    public final boolean A01(C453027w r5, C30641ci r6, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        byte[] decode = Base64.decode(str.getBytes(), 0);
        Arrays.toString(decode);
        C452927v r0 = new C452927v(C34861kz.A0H);
        r0.A02 = true;
        r0.A00 = r5;
        r0.A02(decode);
        this.A0C.A03(r0.A01(), true);
        this.A0J.A02(r6);
        return true;
    }

    public int[] ACW() {
        return new int[]{202};
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x014a, code lost:
        if ((r0.A0D.A00() - ((java.lang.Number) r2).longValue()) > 1000) goto L_0x014c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0186, code lost:
        if (r2 != false) goto L_0x00e0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x020f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean AHS(android.os.Message r31, int r32) {
        /*
            r30 = this;
            r6 = 0
            r0 = 202(0xca, float:2.83E-43)
            r1 = r32
            if (r1 != r0) goto L_0x04e1
            r0 = r31
            java.lang.Object r12 = r0.obj
            X.1Vv r12 = (X.C28371Vv) r12
            android.os.Bundle r1 = r0.getData()
            java.lang.String r0 = "stanzaKey"
            android.os.Parcelable r1 = r1.getParcelable(r0)
            X.1ci r1 = (X.C30641ci) r1
            r0 = r30
            X.11o r5 = r0.A0K
            long r3 = r1.A00
            r2 = 2
            X.1d2 r3 = r5.A00(r2, r3)
            X.2dU r3 = (X.C52282dU) r3
            if (r3 == 0) goto L_0x0037
            X.1Vv r2 = r12.A0I(r6)
            if (r2 == 0) goto L_0x0033
            java.lang.String r2 = r2.A00
            r3.A00 = r2
        L_0x0033:
            r2 = 3
            r3.A00(r2)
        L_0x0037:
            java.lang.String r2 = "verified_name"
            X.1Vv r13 = r12.A0J(r2)
            java.lang.String r15 = "profile"
            X.1Vv r14 = r12.A0J(r15)
            java.lang.String r2 = "remove"
            X.1Vv r10 = r12.A0J(r2)
            java.lang.String r2 = "product_catalog"
            X.1Vv r5 = r12.A0J(r2)
            java.lang.String r2 = "linked_accounts"
            X.1Vv r17 = r12.A0J(r2)
            java.lang.String r2 = "suggestion"
            X.1Vv r7 = r12.A0J(r2)
            java.lang.String r2 = "directory"
            X.1Vv r6 = r12.A0J(r2)
            java.lang.String r2 = "report"
            X.1Vv r8 = r12.A0J(r2)
            java.lang.String r2 = "ctwa_suggestion"
            r12.A0J(r2)
            java.lang.String r2 = "biz_integrity_warning_notification"
            r12.A0J(r2)
            java.lang.String r2 = "subscriptions"
            r12.A0J(r2)
            X.27w r4 = X.C453027w.A0B
            java.lang.String r9 = "hash"
            java.lang.String r11 = "jid"
            r2 = 0
            r16 = 1
            if (r13 == 0) goto L_0x00e1
            java.lang.Class<com.whatsapp.jid.UserJid> r6 = com.whatsapp.jid.UserJid.class
            X.0so r5 = r0.A00
            com.whatsapp.jid.Jid r5 = r13.A0F(r5, r6, r11)
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            java.lang.String r6 = "verified_level"
            r7 = 0
            java.lang.String r11 = r13.A0N(r6, r7)
            java.lang.String r6 = "serial"
            long r14 = r13.A0D(r6, r2)
            java.lang.String r2 = "v"
            java.lang.String r8 = r13.A0N(r2, r7)
            java.lang.String r2 = "host_storage"
            java.lang.String r10 = r13.A0N(r2, r7)
            java.lang.String r2 = "actual_actors"
            java.lang.String r3 = r13.A0N(r2, r7)
            java.lang.String r2 = "privacy_mode_ts"
            java.lang.String r2 = r13.A0N(r2, r7)
            X.1ta r6 = new X.1ta
            r6.<init>((java.lang.String) r10, (java.lang.String) r3, (java.lang.String) r2)
            if (r5 == 0) goto L_0x017e
            java.lang.String r2 = "1"
            boolean r2 = r2.equals(r8)
            if (r2 == 0) goto L_0x00db
            boolean r2 = android.text.TextUtils.isEmpty(r11)
            if (r2 != 0) goto L_0x00db
            byte[] r3 = r13.A01
            int r13 = X.C53782gH.A00(r11)
            X.13W r2 = r0.A07
            r9 = r2
            r10 = r5
            r11 = r6
            r12 = r3
            r9.A00(r10, r11, r12, r13, r14)
        L_0x00db:
            X.124 r0 = r0.A0J
            r0.A02(r1)
        L_0x00e0:
            return r16
        L_0x00e1:
            if (r14 == 0) goto L_0x018a
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            X.0so r2 = r0.A00
            com.whatsapp.jid.Jid r5 = r14.A0F(r2, r3, r11)
            com.whatsapp.jid.UserJid r5 = (com.whatsapp.jid.UserJid) r5
            r2 = 0
            java.lang.String r3 = r14.A0N(r9, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 == 0) goto L_0x0171
            if (r5 == 0) goto L_0x0171
            java.lang.String r3 = "businessnotificationhandler/get-biz-profile jid="
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.0uc r8 = r0.A04
            X.1Vv r2 = r12.A0J(r15)
            X.1mD r2 = X.AnonymousClass27m.A00(r5, r2)
            r8.A06(r2, r5)
            X.16O r2 = r0.A06
            int r2 = r2.A00()
            r2 = r2 & 4
            if (r2 <= 0) goto L_0x0163
            java.util.Map r9 = r0.A0R
            java.lang.String r2 = r5.getRawString()
            boolean r2 = r9.containsKey(r2)
            if (r2 == 0) goto L_0x014c
            java.lang.String r2 = r5.getRawString()
            java.lang.Object r2 = r9.get(r2)
            X.AnonymousClass00B.A06(r2)
            java.lang.Number r2 = (java.lang.Number) r2
            long r3 = r2.longValue()
            X.0t3 r2 = r0.A0D
            long r6 = r2.A00()
            long r6 = r6 - r3
            r3 = 1000(0x3e8, double:4.94E-321)
            int r2 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0163
        L_0x014c:
            java.lang.String r4 = r5.getRawString()
            X.0t3 r2 = r0.A0D
            long r2 = r2.A00()
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r9.put(r4, r2)
            r2 = 0
            r8.A05(r0, r5, r2)
            goto L_0x00db
        L_0x0163:
            X.0pt r4 = r0.A01
            r3 = 20
            com.facebook.redex.RunnableRunnableShape3S0200000_I0_1 r2 = new com.facebook.redex.RunnableRunnableShape3S0200000_I0_1
            r2.<init>(r0, r3, r5)
            r4.A0K(r2)
            goto L_0x00db
        L_0x0171:
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L_0x00db
            if (r5 != 0) goto L_0x00db
            boolean r2 = r0.A01(r4, r1, r3)
            goto L_0x0186
        L_0x017e:
            java.lang.String r2 = r13.A0N(r9, r7)
            boolean r2 = r0.A01(r4, r1, r2)
        L_0x0186:
            if (r2 != 0) goto L_0x00e0
            goto L_0x00db
        L_0x018a:
            if (r10 == 0) goto L_0x01e3
            java.lang.Class<com.whatsapp.jid.UserJid> r3 = com.whatsapp.jid.UserJid.class
            X.0so r2 = r0.A00
            com.whatsapp.jid.Jid r5 = r10.A0F(r2, r3, r11)
            r2 = 0
            java.lang.String r3 = r10.A0N(r9, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L_0x01c9
            if (r5 != 0) goto L_0x01c9
            byte[] r3 = r3.getBytes()
            r2 = 0
            byte[] r5 = android.util.Base64.decode(r3, r2)
            java.lang.String r2 = "businessnotificationhandler//biz-removed-jidhash"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.1kz r2 = X.C34861kz.A0H
            X.27v r3 = new X.27v
            r3.<init>(r2)
            r2 = 1
            r3.A02 = r2
            r3.A00 = r4
            r3.A02(r5)
            X.27t r4 = r3.A01()
            X.0xz r3 = r0.A0C
            r3.A03(r4, r2)
            goto L_0x00db
        L_0x01c9:
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 == 0) goto L_0x00db
            if (r5 == 0) goto L_0x00db
            java.lang.String r2 = "businessnotificationhandler/biz-removed-jid"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.0sq r4 = r0.A0Q
            r3 = 21
            com.facebook.redex.RunnableRunnableShape0S0300000_I0 r2 = new com.facebook.redex.RunnableRunnableShape0S0300000_I0
            r2.<init>(r0, r5, r1, r3)
            r4.Acl(r2)
            return r16
        L_0x01e3:
            if (r5 == 0) goto L_0x02b6
            java.lang.String r2 = "product"
            X.1Vv r4 = r5.A0J(r2)
            if (r4 == 0) goto L_0x026d
            java.lang.String r2 = "businessnotificationhandler/product-changed"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            java.lang.String r2 = "id"
            X.1Vv r3 = r4.A0J(r2)
            java.lang.String r2 = "status_info"
            X.1Vv r7 = r4.A0J(r2)
            r6 = 0
            if (r7 != 0) goto L_0x0265
            r2 = r6
        L_0x0203:
            if (r3 != 0) goto L_0x0260
            r5 = r6
        L_0x0206:
            if (r2 != 0) goto L_0x025b
            r4 = r6
        L_0x0209:
            if (r7 != 0) goto L_0x0248
            r2 = r6
        L_0x020c:
            r7 = r6
        L_0x020d:
            if (r2 == 0) goto L_0x0213
            java.lang.String r6 = r2.A0L()
        L_0x0213:
            boolean r2 = X.AnonymousClass1ZW.A0E(r5)
            if (r2 != 0) goto L_0x00db
            boolean r2 = X.AnonymousClass1ZW.A0E(r4)
            if (r2 != 0) goto L_0x00db
            X.0x1 r3 = r0.A09
            r2 = 0
            X.1mM r2 = r3.A05(r2, r5)
            if (r2 == 0) goto L_0x00db
            int r4 = X.C35681mK.A00(r4)
            X.1mK r3 = r2.A01
            if (r3 == 0) goto L_0x00db
            int r2 = r3.A00
            if (r2 == r4) goto L_0x00db
            r3.A00 = r4
            r3.A02 = r7
            r3.A01 = r6
            X.0pt r4 = r0.A01
            r3 = 15
            com.facebook.redex.RunnableRunnableShape0S1100000_I0 r2 = new com.facebook.redex.RunnableRunnableShape0S1100000_I0
            r2.<init>(r3, r5, r0)
            r4.A0K(r2)
            goto L_0x00db
        L_0x0248:
            java.lang.String r2 = "reject_reason"
            X.1Vv r3 = r7.A0J(r2)
            java.lang.String r2 = "commerce_url"
            X.1Vv r2 = r7.A0J(r2)
            if (r3 == 0) goto L_0x020c
            java.lang.String r7 = r3.A0L()
            goto L_0x020d
        L_0x025b:
            java.lang.String r4 = r2.A0L()
            goto L_0x0209
        L_0x0260:
            java.lang.String r5 = r3.A0L()
            goto L_0x0206
        L_0x0265:
            java.lang.String r2 = "status"
            X.1Vv r2 = r7.A0J(r2)
            goto L_0x0203
        L_0x026d:
            X.0pd r4 = r0.A0H
            r3 = 451(0x1c3, float:6.32E-43)
            X.0tM r2 = X.C16620tM.A02
            boolean r2 = r4.A0E(r2, r3)
            if (r2 == 0) goto L_0x00db
            java.lang.String r2 = "collection"
            X.1Vv r4 = r5.A0J(r2)
            if (r4 == 0) goto L_0x00db
            java.lang.String r2 = "businessnotificationhandler/collection-changed"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.0sK r2 = r0.A02
            r2.A0B()
            X.1ZT r10 = r2.A05
            if (r10 == 0) goto L_0x00e0
            java.lang.String r3 = "id"
            r2 = 0
            java.lang.String r5 = r4.A0N(r3, r2)
            java.lang.String r2 = "status_info"
            X.1Vv r3 = r4.A0J(r2)
            boolean r2 = X.AnonymousClass1ZW.A0E(r5)
            if (r2 != 0) goto L_0x00db
            if (r3 == 0) goto L_0x00db
            X.2gM r1 = X.C53812gL.A00(r3)
            X.0x1 r4 = r0.A09
            X.2GE r7 = r4.A04(r10, r5)
            if (r7 == 0) goto L_0x04da
            r7.A00 = r1
            monitor-enter(r4)
            goto L_0x0476
        L_0x02b6:
            if (r17 != 0) goto L_0x00db
            java.lang.String r4 = "notif_sub_type"
            r9 = 1000(0x3e8, double:4.94E-321)
            if (r7 == 0) goto L_0x0387
            r11 = 0
            r7.A0N(r4, r11)
            java.lang.String r5 = r7.A0N(r4, r11)
            java.lang.String r4 = "cross_sell_smb_app"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x0387
            java.lang.String r4 = "t"
            java.lang.String r6 = r12.A0N(r4, r11)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 / r9
            long r4 = X.C29501aj.A01(r6, r4)
            java.lang.String r6 = "config"
            X.1Vv r10 = r7.A0K(r6)
            java.lang.String r6 = "revoke"
            java.lang.String r6 = r10.A0N(r6, r11)
            boolean r9 = java.lang.Boolean.parseBoolean(r6)
            X.0t9 r8 = r0.A0I
            X.0rz r7 = r0.A0F
            X.2gN r6 = new X.2gN
            r6.<init>(r7, r8)
            if (r9 == 0) goto L_0x0361
            r7 = 0
            X.0rz r5 = r6.A00
            android.content.SharedPreferences$Editor r8 = r5.A0K()
            java.lang.String r4 = "biz_app_cross_sell_banner_click_count"
            android.content.SharedPreferences$Editor r4 = r8.putInt(r4, r7)
            r4.apply()
            android.content.SharedPreferences$Editor r8 = r5.A0K()
            java.lang.String r4 = "biz_app_cross_sell_banner_dismiss_count"
            android.content.SharedPreferences$Editor r4 = r8.putInt(r4, r7)
            r4.apply()
            r4 = 4
            r6.A00(r4)
            android.content.SharedPreferences$Editor r8 = r5.A0K()
            java.lang.String r4 = "biz_app_cross_sell_banner_expiry_days"
            android.content.SharedPreferences$Editor r4 = r8.putInt(r4, r7)
            r4.apply()
            java.lang.String r4 = "biz_app_cross_sell_banner_notif_time"
            r5.A14(r4, r2)
            android.content.SharedPreferences$Editor r3 = r5.A0K()
            java.lang.String r2 = "biz_app_cross_sell_banner_total_days"
            android.content.SharedPreferences$Editor r2 = r3.putInt(r2, r7)
            r2.apply()
            android.content.SharedPreferences$Editor r3 = r5.A0K()
            java.lang.String r2 = "biz_app_cross_sell_banner_consecutive_days"
            android.content.SharedPreferences$Editor r2 = r3.putInt(r2, r7)
            r2.apply()
            android.content.SharedPreferences$Editor r3 = r5.A0K()
            java.lang.String r2 = "biz_app_cross_sell_banner_cool_off_days"
            android.content.SharedPreferences$Editor r2 = r3.putInt(r2, r7)
            r2.apply()
            r2 = 5
            r6.A00(r2)
            java.lang.String r4 = "biz_app_upsell_banner_timestamp"
            r2 = -1
            r5.A14(r4, r2)
            goto L_0x00db
        L_0x0361:
            java.lang.String r2 = "expires_in"
            java.lang.String r3 = r10.A0N(r2, r11)
            r2 = 30
            int r7 = X.C29501aj.A00(r3, r2)
            r2 = 4
            r6.A00(r2)
            X.0rz r6 = r6.A00
            android.content.SharedPreferences$Editor r3 = r6.A0K()
            java.lang.String r2 = "biz_app_cross_sell_banner_expiry_days"
            android.content.SharedPreferences$Editor r2 = r3.putInt(r2, r7)
            r2.apply()
            java.lang.String r2 = "biz_app_cross_sell_banner_notif_time"
            r6.A14(r2, r4)
            goto L_0x00db
        L_0x0387:
            if (r6 == 0) goto L_0x03da
            java.lang.String r3 = "type"
            r2 = 0
            java.lang.String r5 = r6.A0N(r3, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto L_0x03d7
            java.util.Locale r2 = java.util.Locale.ROOT
            java.lang.String r4 = r5.toUpperCase(r2)
            int r2 = r4.hashCode()
            switch(r2) {
                case -1786066693: goto L_0x03ca;
                case -1344839652: goto L_0x03c7;
                case -257068618: goto L_0x03ba;
                case 1260847406: goto L_0x03b7;
                default: goto L_0x03a4;
            }
        L_0x03a4:
            java.lang.String r3 = "BusinessNotificationHandler/handleDirectoryNotification notification not supported: "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
        L_0x03b2:
            com.whatsapp.util.Log.e((java.lang.String) r2)
            goto L_0x00db
        L_0x03b7:
            java.lang.String r2 = "PREPARE_FOR_CONSUMER_LAUNCH"
            goto L_0x03cc
        L_0x03ba:
            java.lang.String r3 = "STATUS_UPDATE"
            boolean r2 = r4.equals(r3)
            if (r2 == 0) goto L_0x03a4
            r0.A00(r3)
            goto L_0x00db
        L_0x03c7:
            java.lang.String r2 = "CONSUMER_LAUNCH"
            goto L_0x03cc
        L_0x03ca:
            java.lang.String r2 = "NUX_UPSELL"
        L_0x03cc:
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x03a4
            r0.A00(r5)
            goto L_0x00db
        L_0x03d7:
            java.lang.String r2 = "BusinessNotificationHandler/handleDirectoryNotification notification type is null"
            goto L_0x03b2
        L_0x03da:
            if (r8 == 0) goto L_0x00db
            java.lang.String r4 = "creation"
            long r26 = r8.A0D(r4, r2)
            long r26 = r26 * r9
            X.0t3 r4 = r0.A0D
            long r4 = r4.A00()
            r6 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            long r4 = r4 + r6
            long r4 = r4 / r9
            java.lang.String r6 = "expiration"
            long r28 = r8.A0D(r6, r4)
            long r28 = r28 * r9
            java.lang.String r4 = "url"
            X.1Vv r12 = r8.A0J(r4)
            java.lang.String r4 = "direct_path"
            X.1Vv r11 = r8.A0J(r4)
            java.lang.String r4 = "file_name"
            X.1Vv r10 = r8.A0J(r4)
            java.lang.String r4 = "file_length"
            X.1Vv r9 = r8.A0J(r4)
            java.lang.String r4 = "media_key"
            X.1Vv r7 = r8.A0J(r4)
            java.lang.String r4 = "file_sha256"
            X.1Vv r6 = r8.A0J(r4)
            java.lang.String r4 = "file_enc_sha256"
            X.1Vv r5 = r8.A0J(r4)
            if (r12 == 0) goto L_0x04e0
            if (r10 == 0) goto L_0x04e0
            if (r9 == 0) goto L_0x04e0
            if (r6 == 0) goto L_0x04e0
            if (r5 == 0) goto L_0x04e0
            if (r7 == 0) goto L_0x04e0
            if (r11 == 0) goto L_0x04e0
            java.lang.String r4 = r9.A0L()
            long r24 = X.C29501aj.A01(r4, r2)
            java.lang.String r18 = r12.A0L()
            java.lang.String r19 = r11.A0L()
            X.AnonymousClass00B.A06(r19)
            java.lang.String r20 = r10.A0L()
            X.AnonymousClass00B.A06(r20)
            java.lang.String r21 = r7.A0L()
            X.AnonymousClass00B.A06(r21)
            java.lang.String r22 = r6.A0L()
            X.AnonymousClass00B.A06(r22)
            java.lang.String r23 = r5.A0L()
            X.AnonymousClass00B.A06(r23)
            X.1lI r3 = new X.1lI
            r17 = r3
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r26, r28)
            X.0pt r5 = r0.A01
            r4 = 21
            com.facebook.redex.RunnableRunnableShape3S0200000_I0_1 r2 = new com.facebook.redex.RunnableRunnableShape3S0200000_I0_1
            r2.<init>(r0, r4, r3)
            r5.A0K(r2)
            goto L_0x00db
        L_0x0476:
            X.2GD r6 = r4.A01(r10)     // Catch:{ all -> 0x04d7 }
            X.2GD r0 = r4.A01(r10)     // Catch:{ all -> 0x04d5 }
            java.util.Map r0 = r0.A04     // Catch:{ all -> 0x04d5 }
            java.lang.Object r9 = r0.get(r5)     // Catch:{ all -> 0x04d5 }
            X.2GF r9 = (X.AnonymousClass2GF) r9     // Catch:{ all -> 0x04d5 }
            if (r9 == 0) goto L_0x04b8
            r9.A01 = r7     // Catch:{ all -> 0x04d7 }
            java.util.List r0 = r7.A04     // Catch:{ all -> 0x04d7 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x04d7 }
        L_0x0490:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x04d7 }
            if (r0 == 0) goto L_0x04ae
            java.lang.Object r3 = r8.next()     // Catch:{ all -> 0x04d7 }
            X.1mM r3 = (X.C35701mM) r3     // Catch:{ all -> 0x04d7 }
            java.util.Map r2 = r4.A02     // Catch:{ all -> 0x04d7 }
            java.lang.String r1 = r3.A0D     // Catch:{ all -> 0x04d7 }
            X.2GG r0 = new X.2GG     // Catch:{ all -> 0x04d7 }
            r0.<init>(r10, r1)     // Catch:{ all -> 0x04d7 }
            r2.put(r0, r3)     // Catch:{ all -> 0x04d7 }
            java.util.Map r0 = r4.A03     // Catch:{ all -> 0x04d7 }
            r0.put(r1, r10)     // Catch:{ all -> 0x04d7 }
            goto L_0x0490
        L_0x04ae:
            java.util.Map r1 = r6.A04     // Catch:{ all -> 0x04d7 }
            r1.remove(r5)     // Catch:{ all -> 0x04d7 }
            java.lang.String r0 = r7.A03     // Catch:{ all -> 0x04d7 }
            r1.put(r0, r9)     // Catch:{ all -> 0x04d7 }
        L_0x04b8:
            r2 = 0
        L_0x04b9:
            java.util.List r1 = r6.A03     // Catch:{ all -> 0x04d7 }
            int r0 = r1.size()     // Catch:{ all -> 0x04d7 }
            if (r2 >= r0) goto L_0x04d0
            java.lang.Object r0 = r1.get(r2)     // Catch:{ all -> 0x04d7 }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x04d7 }
            if (r0 == 0) goto L_0x04d2
            java.lang.String r0 = r7.A03     // Catch:{ all -> 0x04d7 }
            r1.set(r2, r0)     // Catch:{ all -> 0x04d7 }
        L_0x04d0:
            monitor-exit(r4)     // Catch:{ all -> 0x04d7 }
            goto L_0x04da
        L_0x04d2:
            int r2 = r2 + 1
            goto L_0x04b9
        L_0x04d5:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x04d7 }
        L_0x04d7:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x04d7 }
            throw r0
        L_0x04da:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
        L_0x04e0:
            r6 = 0
        L_0x04e1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1U2.AHS(android.os.Message, int):boolean");
    }

    public void ARp() {
    }

    public void ARq() {
    }
}
