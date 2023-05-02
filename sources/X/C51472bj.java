package X;

import com.mod2.fblibs.FacebookFacade;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2bj  reason: invalid class name and case insensitive filesystem */
public class C51472bj extends C51442bg {
    public final C16440t3 A00;
    public final AnonymousClass2H7 A01;
    public final C207911p A02;
    public final C18310wU A03;
    public final Map A04;

    public C51472bj(C16300so r10, C16440t3 r11, C14710pd r12, C16490t9 r13, AnonymousClass2H7 r14, C207911p r15, C18310wU r16, Map map) {
        super(r10, r12, r13, r14, map);
        this.A00 = r11;
        this.A02 = r15;
        this.A03 = r16;
        this.A01 = r14;
        HashMap hashMap = new HashMap();
        hashMap.put("w:gp2", 209);
        hashMap.put("contacts", 25);
        hashMap.put("business", 202);
        hashMap.put("account_sync", 203);
        hashMap.put("devices", 204);
        hashMap.put("server_sync", 210);
        hashMap.put("encrypted_backup", 228);
        hashMap.put("disappearing_mode", 229);
        hashMap.put("psa", 104);
        hashMap.put("privacy_token", 234);
        hashMap.put("server", 235);
        hashMap.put(FacebookFacade.RequestParameter.PICTURE, 189);
        hashMap.put("status", 236);
        hashMap.put("gdpr", 238);
        hashMap.put("location", 240);
        hashMap.put("encrypt", 241);
        hashMap.put("mediaretry", 97);
        hashMap.put("pay", 247);
        hashMap.put("authkey_rotation", 248);
        hashMap.put("registration", 251);
        hashMap.put("link_code_companion_reg", 252);
        this.A04 = Collections.unmodifiableMap(hashMap);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0339, code lost:
        if (r0 == false) goto L_0x02e6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x033f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C28371Vv r34) {
        /*
            r33 = this;
            long r31 = android.os.SystemClock.uptimeMillis()
            r8 = r34
            X.AnonymousClass00B.A06(r8)
            java.lang.Class<com.whatsapp.jid.Jid> r2 = com.whatsapp.jid.Jid.class
            r7 = r33
            X.0so r1 = r7.A01
            java.lang.String r0 = "from"
            com.whatsapp.jid.Jid r6 = r8.A0F(r1, r2, r0)
            java.lang.String r0 = "id"
            java.lang.String r5 = r8.A0M(r0)
            java.lang.String r0 = "participant"
            com.whatsapp.jid.Jid r4 = r8.A0F(r1, r2, r0)
            java.lang.String r20 = "type"
            r1 = 0
            r0 = r20
            java.lang.String r3 = r8.A0N(r0, r1)
            java.lang.String r0 = "offline"
            java.lang.String r10 = r8.A0N(r0, r1)
            if (r10 == 0) goto L_0x004a
            java.lang.Integer r26 = java.lang.Integer.valueOf(r10)     // Catch:{ NumberFormatException -> 0x0038 }
            goto L_0x004c
        L_0x0038:
            r9 = move-exception
            java.lang.String r2 = "connection/handleNotification: got bad offline="
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r2)
            r0.append(r10)
            java.lang.String r0 = r0.toString()
            com.whatsapp.util.Log.e(r0, r9)
        L_0x004a:
            r26 = 0
        L_0x004c:
            r0 = 4
            java.lang.Integer r11 = java.lang.Integer.valueOf(r0)
            r2 = 0
            java.lang.String r19 = "notification"
            r28 = r3
            r13 = r1
            r16 = r3
            r17 = r1
            r9 = r7
            r10 = r26
            r12 = r1
            r14 = r19
            r15 = r3
            r9.A01(r10, r11, r12, r13, r14, r15, r16, r17)
            X.11p r9 = r7.A02
            if (r3 != 0) goto L_0x006b
            java.lang.String r28 = ""
        L_0x006b:
            java.util.concurrent.atomic.AtomicLong r0 = r9.A04
            long r0 = r0.getAndIncrement()
            X.0t3 r13 = r9.A02
            X.0so r12 = r9.A01
            X.0t9 r11 = r9.A00
            X.11o r10 = r9.A03
            X.2dU r9 = new X.2dU
            r21 = r9
            r22 = r12
            r23 = r13
            r24 = r11
            r25 = r10
            r27 = r5
            r29 = r0
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r31)
            r10.A04(r9, r0)
            long r0 = r9.A03
            X.1kL r10 = new X.1kL
            r10.<init>()
            r10.A01 = r6
            r10.A05 = r14
            r10.A07 = r5
            r10.A08 = r3
            r10.A02 = r4
            r10.A00 = r0
            X.1ci r10 = r10.A00()
            r0 = 2
            r9.A00(r0)
            java.lang.String r18 = "pay"
            r0 = r18
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x00f2
            X.0wU r6 = r7.A03
            X.2H7 r5 = r7.A01
            X.1Vv[] r4 = r8.A03
            r1 = 0
            if (r4 == 0) goto L_0x00f2
            int r0 = r4.length
            r17 = r0
            if (r0 <= 0) goto L_0x00f2
            r15 = 0
        L_0x00c3:
            r11 = r4[r1]
            java.lang.String r12 = ""
            r0 = r20
            java.lang.String r13 = r11.A0N(r0, r12)
            java.lang.String r12 = r11.A00
            java.lang.String r0 = "transaction"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x010b
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L_0x00e6
            java.lang.String r0 = "p2p"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x010b
        L_0x00e6:
            boolean r15 = r6.A0L(r5, r2, r11, r10)
        L_0x00ea:
            int r1 = r1 + 1
            r0 = r17
            if (r1 < r0) goto L_0x00c3
            if (r15 != 0) goto L_0x010a
        L_0x00f2:
            if (r3 == 0) goto L_0x033f
            java.util.Map r0 = r7.A04
            java.lang.Object r0 = r0.get(r3)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x033f
            int r1 = r0.intValue()
            r0 = -1
            if (r1 == r0) goto L_0x033f
            X.2H7 r0 = r7.A01
            r0.A00(r8, r10, r1)
        L_0x010a:
            return
        L_0x010b:
            java.lang.String r0 = "threeDS"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0173
            java.lang.String r0 = "pnd"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0173
            java.lang.String r0 = "balance"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0173
            java.lang.String r0 = "kyc"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0173
            java.lang.String r0 = "account-status"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0173
            java.lang.String r0 = "account-info"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0173
            java.lang.String r0 = "card-update"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0173
            java.lang.String r0 = "merchant-update"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0173
            java.lang.String r0 = "update-method"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0173
            java.lang.String r0 = "remove-method"
            boolean r0 = r12.equals(r0)
            if (r0 != 0) goto L_0x0173
            java.lang.String r0 = "account"
            boolean r14 = r12.equals(r0)
            if (r14 == 0) goto L_0x019b
            java.lang.String r0 = "event"
            java.lang.String r13 = r11.A0N(r0, r2)
            java.lang.String r0 = "DELETION"
            boolean r0 = r13.equals(r0)
            if (r0 == 0) goto L_0x019b
        L_0x0173:
            X.0w8 r12 = r6.A0F
            r0 = 0
            boolean r0 = r12.A0C(r0)
            if (r0 == 0) goto L_0x033c
            java.lang.String r0 = "xmpp/reader/on-recv-payment-method-update"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2H8 r12 = r5.A01
            r13 = 0
            r0 = 190(0xbe, float:2.66E-43)
            android.os.Message r14 = android.os.Message.obtain(r2, r13, r0, r13, r11)
            android.os.Bundle r11 = r14.getData()
            java.lang.String r0 = "stanzaKey"
            r11.putParcelable(r0, r10)
        L_0x0195:
            r12.AZq(r14)
        L_0x0198:
            r15 = 1
            goto L_0x00ea
        L_0x019b:
            java.lang.String r0 = "merchant_status"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x01f7
            java.lang.String r0 = "value"
            java.lang.String r12 = r11.A0N(r0, r2)
            java.lang.String r0 = "true"
            boolean r15 = r0.equals(r12)
            java.lang.String r0 = "dhash"
            java.lang.String r14 = r11.A0N(r0, r2)
            com.whatsapp.jid.Jid r0 = r10.A01
            com.whatsapp.jid.UserJid r11 = com.whatsapp.jid.UserJid.of(r0)
            if (r11 == 0) goto L_0x033c
            X.0w8 r0 = r6.A0F
            boolean r0 = r0.A08()
            if (r0 == 0) goto L_0x033c
            java.lang.String r0 = "xmpp/reader/on-recv-merchant-status-update"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2H8 r0 = r5.A01
            r21 = r0
            r12 = 0
            r0 = 211(0xd3, float:2.96E-43)
            android.os.Message r13 = android.os.Message.obtain(r2, r12, r0, r12)
            android.os.Bundle r12 = r13.getData()
            java.lang.String r0 = "stanzaKey"
            r12.putParcelable(r0, r10)
            java.lang.String r0 = "jid"
            X.AnonymousClass2RS.A01(r12, r11, r0)
            java.lang.String r11 = "isMerchant"
            r12.putBoolean(r11, r15)
            java.lang.String r11 = "dataHash"
            r12.putString(r11, r14)
        L_0x01f1:
            r0 = r21
            r0.AZq(r13)
            goto L_0x0198
        L_0x01f7:
            r0 = r18
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x0251
            java.lang.String r0 = "hash"
            java.lang.String r12 = r11.A0N(r0, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            r11 = 0
            if (r0 != 0) goto L_0x033c
            byte[] r0 = r12.getBytes()
            byte[] r13 = android.util.Base64.decode(r0, r11)
            java.util.Arrays.toString(r13)
            X.27w r14 = X.C453027w.A0H
            java.lang.String r0 = "xmpp/reader/read/sync-notify-add; stanzaKey="
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r0)
            r11.append(r10)
            java.lang.String r0 = "; jidHash="
            r11.append(r0)
            java.lang.String r0 = java.util.Arrays.toString(r13)
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2H8 r12 = r5.A01
            r11 = 0
            r0 = 24
            android.os.Message r14 = android.os.Message.obtain(r2, r11, r0, r11, r14)
            android.os.Bundle r11 = r14.getData()
            java.lang.String r0 = "stanzaKey"
            r11.putParcelable(r0, r10)
            java.lang.String r0 = "jidHash"
            r11.putByteArray(r0, r13)
            goto L_0x0195
        L_0x0251:
            if (r14 == 0) goto L_0x0289
            java.lang.String r0 = "kyc-state"
            java.lang.String r0 = r11.A0N(r0, r2)
            if (r0 == 0) goto L_0x0289
            X.0w8 r0 = r6.A0F
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x033c
            X.1lx r13 = X.C35451lx.A00(r11)
            if (r13 == 0) goto L_0x0198
            java.lang.String r0 = "xmpp/reader/on-recv-payment-kyc-update"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2H8 r12 = r5.A01
            r11 = 0
            r0 = 217(0xd9, float:3.04E-43)
            android.os.Message r14 = android.os.Message.obtain(r2, r11, r0, r11)
            android.os.Bundle r11 = r14.getData()
            java.lang.String r0 = "stanzaKey"
            r11.putParcelable(r0, r10)
            java.lang.String r0 = "paymentKycInfo"
            r11.putParcelable(r0, r13)
            goto L_0x0195
        L_0x0289:
            java.lang.String r0 = "step_up"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x02c0
            X.0w8 r0 = r6.A0F
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x033c
            X.1lf r13 = X.C35281lf.A00(r11)
            if (r13 == 0) goto L_0x0198
            java.lang.String r0 = "xmpp/reader/on-recv-payment-step-up-update"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2H8 r12 = r5.A01
            r11 = 0
            r0 = 219(0xdb, float:3.07E-43)
            android.os.Message r14 = android.os.Message.obtain(r2, r11, r0, r11)
            android.os.Bundle r11 = r14.getData()
            java.lang.String r0 = "stanzaKey"
            r11.putParcelable(r0, r10)
            java.lang.String r0 = "paymentStepUpInfo"
            r11.putParcelable(r0, r13)
            goto L_0x0195
        L_0x02c0:
            java.lang.String r0 = "invite"
            boolean r0 = r12.equals(r0)
            if (r0 == 0) goto L_0x00ea
            X.0w8 r0 = r6.A0F
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x033c
            java.lang.String r14 = "service"
            java.lang.String r12 = r11.A0N(r14, r2)
            if (r12 == 0) goto L_0x02e6
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r12 = r12.toUpperCase(r0)
            int r0 = r12.hashCode()
            switch(r0) {
                case 84238: goto L_0x0332;
                case 2402356: goto L_0x032a;
                case 66691660: goto L_0x0322;
                default: goto L_0x02e6;
            }
        L_0x02e6:
            r12 = 0
        L_0x02e7:
            java.lang.String r0 = "invite-used"
            java.lang.String r11 = r11.A0N(r0, r2)
            java.lang.String r0 = "1"
            boolean r16 = r0.equals(r11)
            com.whatsapp.jid.Jid r0 = r10.A01
            r15 = r0
            java.lang.String r0 = "xmpp/reader/on-recv-payment-setup-notif"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2H8 r0 = r5.A01
            r21 = r0
            r11 = 0
            r0 = 222(0xde, float:3.11E-43)
            android.os.Message r13 = android.os.Message.obtain(r2, r11, r0, r11)
            android.os.Bundle r11 = r13.getData()
            java.lang.String r0 = "stanzaKey"
            r11.putParcelable(r0, r10)
            java.lang.String r0 = "jid"
            X.AnonymousClass2RS.A01(r11, r15, r0)
            r11.putInt(r14, r12)
            java.lang.String r12 = "inviteUsed"
            r0 = r16
            r11.putBoolean(r12, r0)
            goto L_0x01f1
        L_0x0322:
            java.lang.String r0 = "FBPAY"
            boolean r0 = r12.equals(r0)
            r12 = 1
            goto L_0x0339
        L_0x032a:
            java.lang.String r0 = "NOVI"
            boolean r0 = r12.equals(r0)
            r12 = 2
            goto L_0x0339
        L_0x0332:
            java.lang.String r0 = "UPI"
            boolean r0 = r12.equals(r0)
            r12 = 3
        L_0x0339:
            if (r0 != 0) goto L_0x02e7
            goto L_0x02e6
        L_0x033c:
            r15 = 0
            goto L_0x00ea
        L_0x033f:
            r0 = 5
            r9.A00(r0)
            X.2H7 r4 = r7.A01
            X.1kL r2 = r10.A02()
            java.lang.String r1 = "error"
            java.lang.String r0 = "487"
            r2.A01(r1, r0)
            X.1ci r0 = r2.A00()
            r4.A01(r0)
            X.3r4 r1 = new X.3r4
            r1.<init>()
            r0 = r19
            r1.A00 = r0
            r1.A01 = r3
            X.0t9 r0 = r7.A03
            r0.A06(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51472bj.A00(X.1Vv):void");
    }
}
