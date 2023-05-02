package X;

import com.facebook.redex.RunnableRunnableShape0S1100000_I0;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.109  reason: invalid class name */
public class AnonymousClass109 {
    public final C16980tz A00;
    public final C19380yL A01;
    public final AnonymousClass160 A02;
    public final C18080w7 A03;
    public final C18300wT A04;
    public final C18090w8 A05;
    public final C18290wS A06;
    public final C16220sf A07;
    public final C16320sq A08;

    public AnonymousClass109(C16980tz r1, C19380yL r2, AnonymousClass160 r3, C18080w7 r4, C18300wT r5, C18090w8 r6, C18290wS r7, C16220sf r8, C16320sq r9) {
        this.A00 = r1;
        this.A08 = r9;
        this.A03 = r4;
        this.A06 = r7;
        this.A07 = r8;
        this.A04 = r5;
        this.A05 = r6;
        this.A01 = r2;
        this.A02 = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069 A[Catch:{ JSONException -> 0x0076 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006a A[Catch:{ JSONException -> 0x0076 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089 A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00() {
        /*
            r10 = this;
            X.0w8 r1 = r10.A05
            r0 = 0
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x00cb
            X.0wT r6 = r10.A04
            android.content.SharedPreferences r1 = r6.A01()
            java.lang.String r0 = "payment_kyc_info"
            r3 = 0
            java.lang.String r2 = r1.getString(r0, r3)
            if (r2 == 0) goto L_0x007b
            boolean r0 = X.AnonymousClass1ZW.A0E(r2)
            if (r0 != 0) goto L_0x007b
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0076 }
            r1.<init>(r2)     // Catch:{ JSONException -> 0x0076 }
            java.lang.String r0 = "state"
            java.lang.String r7 = r1.getString(r0)     // Catch:{ JSONException -> 0x0076 }
            java.lang.String r0 = "rejection-code"
            r9 = -1
            int r8 = r1.optInt(r0, r9)     // Catch:{ JSONException -> 0x0076 }
            java.lang.String r0 = "actions-requested"
            org.json.JSONObject r1 = r1.optJSONObject(r0)     // Catch:{ JSONException -> 0x0076 }
            if (r1 == 0) goto L_0x0066
            java.lang.String r0 = "obligation"
            java.lang.String r5 = r1.getString(r0)     // Catch:{ JSONException -> 0x0061 }
            java.lang.String r0 = "actions"
            org.json.JSONArray r4 = r1.getJSONArray(r0)     // Catch:{ JSONException -> 0x0061 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0061 }
            r2.<init>()     // Catch:{ JSONException -> 0x0061 }
            r1 = 0
        L_0x004b:
            int r0 = r4.length()     // Catch:{ JSONException -> 0x0061 }
            if (r1 >= r0) goto L_0x005b
            java.lang.String r0 = r4.getString(r1)     // Catch:{ JSONException -> 0x0061 }
            r2.add(r0)     // Catch:{ JSONException -> 0x0061 }
            int r1 = r1 + 1
            goto L_0x004b
        L_0x005b:
            X.1ly r1 = new X.1ly     // Catch:{ JSONException -> 0x0061 }
            r1.<init>(r5, r2)     // Catch:{ JSONException -> 0x0061 }
            goto L_0x0067
        L_0x0061:
            java.lang.String r0 = "PAY: PaymentKycActionsRequested fromJsonString threw exception"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ JSONException -> 0x0076 }
        L_0x0066:
            r1 = 0
        L_0x0067:
            if (r8 == r9) goto L_0x006a
            goto L_0x006c
        L_0x006a:
            r0 = r3
            goto L_0x0070
        L_0x006c:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch:{ JSONException -> 0x0076 }
        L_0x0070:
            X.1lx r4 = new X.1lx     // Catch:{ JSONException -> 0x0076 }
            r4.<init>(r1, r0, r7)     // Catch:{ JSONException -> 0x0076 }
            goto L_0x007c
        L_0x0076:
            java.lang.String r0 = "PAY: PaymentKycInfo fromJsonString threw exception"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x007b:
            r4 = r3
        L_0x007c:
            android.content.SharedPreferences r2 = r6.A01()
            java.lang.String r1 = "payment_kyc_update_ack"
            r0 = 1
            boolean r0 = r2.getBoolean(r1, r0)
            if (r4 == 0) goto L_0x00c4
            if (r0 != 0) goto L_0x00c4
            java.lang.String r1 = r4.A02
            java.lang.String r0 = "PENDING"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ad
            X.0tz r0 = r10.A00
            android.content.Context r1 = r0.A00
            r0 = 2131889735(0x7f120e47, float:1.9414142E38)
            java.lang.String r2 = r1.getString(r0)
            r0 = 2131889734(0x7f120e46, float:1.941414E38)
        L_0x00a3:
            java.lang.String r1 = r1.getString(r0)
            java.lang.String r0 = "KYC"
            r10.A03(r2, r1, r0, r3)
            return
        L_0x00ad:
            java.lang.String r0 = "COMPLETED"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00cb
            X.0tz r0 = r10.A00
            android.content.Context r1 = r0.A00
            r0 = 2131889733(0x7f120e45, float:1.9414138E38)
            java.lang.String r2 = r1.getString(r0)
            r0 = 2131889732(0x7f120e44, float:1.9414136E38)
            goto L_0x00a3
        L_0x00c4:
            X.0yL r1 = r10.A01
            r0 = 26
            r1.A03(r0, r3)
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass109.A00():void");
    }

    public void A01(String str) {
        this.A08.Acl(new RunnableRunnableShape0S1100000_I0(34, str, this));
    }

    public final void A02(String str) {
        if (this.A05.A0C(0)) {
            ArrayList arrayList = new ArrayList();
            C18080w7 r0 = this.A03;
            if (str != null) {
                AnonymousClass2KI A012 = r0.A01(str);
                if (A012 != null) {
                    arrayList.add(A012);
                } else {
                    this.A01.A03(28, str);
                }
            } else {
                arrayList.addAll(r0.A02());
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AnonymousClass2KI r5 = (AnonymousClass2KI) it.next();
                C35281lf r3 = r5.A03;
                boolean z2 = this.A04.A01().getBoolean("payment_step_up_update_ack", true);
                if (r3 == null || z2) {
                    this.A01.A03(28, str);
                    return;
                }
                A03(r5.A08, r5.A05, "STEP_UP", r5.A06);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x008f, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0091, code lost:
        r0 = new android.content.Intent(r4, r1);
        r0.addFlags(335544320);
        r0.putExtra("notification-type", "DOC_VERIF_SUCCESS");
        r0 = X.C42341xd.A00(r4, 0, r0, 134217728);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00a0, code lost:
        r2.A09 = r0;
        r14.A01.A02(37, r2.A01());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00ab, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00ac, code lost:
        r0 = r14.A06.A03().AEt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00b6, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00b8, code lost:
        r1 = new android.content.Intent(r4, r0);
        r1.addFlags(335544320);
        r1.putExtra("notification-type", "STEP_UP");
        r5 = r18;
        r1.putExtra("step-up-id", r5);
        r2.A09 = X.C42341xd.A00(r4, 0, r1, 134217728);
        r14.A01.A04(r2.A01(), r5, 28, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00dd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00de, code lost:
        r0 = r14.A06.A03().AEm();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00e8, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ea, code lost:
        r5 = new android.content.Intent(r4, r0);
        r5.addFlags(335544320);
        r5.putExtra("notification-type", "ALIAS_DEREGISTER");
        r1 = r14.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00fb, code lost:
        if (r1.A06() == null) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0103, code lost:
        if (r1.A06().A08 == null) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0105, code lost:
        r5.putExtra("extra_payment_name", r1.A06().A08.A06());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0114, code lost:
        r2.A09 = X.C42341xd.A00(r4, 0, r5, 134217728);
        r14.A01.A02(47, r2.A01());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0125, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0144, code lost:
        if (r0 == false) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0148, code lost:
        r0 = new android.content.Intent(r4, r14.A06.A03().AEt());
        r0.addFlags(335544320);
        r2.A09 = X.C42341xd.A00(r4, 0, r0, 0);
        r14.A01.A02(26, r2.A01());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0169, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0066, code lost:
        switch(r13) {
            case 0: goto L_0x00de;
            case 1: goto L_0x00ac;
            case 2: goto L_0x0085;
            case 3: goto L_0x006a;
            case 4: goto L_0x0148;
            default: goto L_0x0069;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x006a, code lost:
        r1 = new android.content.Intent("android.intent.action.VIEW");
        r1.addFlags(335544320);
        r1.putExtra("notification-type", "DOC_VERIF_FAILURE");
        r1.setData(android.net.Uri.parse("https://faq.whatsapp.com/general/payments/learn-more-about-identity-documents-br"));
        r0 = X.C42341xd.A00(r4, 0, r1, 134217728);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0085, code lost:
        r1 = r14.A06.A03().AEt();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
        /*
            r14 = this;
            X.0tz r0 = r14.A00
            android.content.Context r4 = r0.A00
            X.03l r2 = X.C218415q.A00(r4)
            java.lang.String r0 = "status"
            r2.A0I = r0
            r13 = 1
            r2.A03 = r13
            r2.A0D(r13)
            r0 = 4
            r2.A02(r0)
            r3 = 0
            r2.A06 = r3
            r1 = 2131232243(0x7f0805f3, float:1.808059E38)
            int r1 = com.obwhatsapp.yo.yo.getNIcon(r1)
            android.app.Notification r0 = r2.A07
            r0.icon = r1
            r2.A0A(r15)
            r1 = r16
            r2.A09(r1)
            androidx.core.app.NotificationCompat$BigTextStyle r0 = new androidx.core.app.NotificationCompat$BigTextStyle
            r0.<init>()
            r0.A09(r1)
            r2.A08(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r7 = 26
            if (r0 < r7) goto L_0x004c
            X.0sf r0 = r14.A07
            X.1WS r0 = r0.A03()
            X.1v2 r0 = (X.C41001v2) r0
            java.lang.String r0 = r0.A0C()
            r2.A0J = r0
        L_0x004c:
            r5 = r17
            int r0 = r5.hashCode()
            java.lang.String r12 = "DOC_VERIF_FAILURE"
            java.lang.String r10 = "DOC_VERIF_SUCCESS"
            java.lang.String r11 = "STEP_UP"
            java.lang.String r1 = "ALIAS_DEREGISTER"
            switch(r0) {
                case -1986195565: goto L_0x013f;
                case -1175556882: goto L_0x013a;
                case -1094966371: goto L_0x0134;
                case -314370780: goto L_0x012e;
                case 74901: goto L_0x0126;
                default: goto L_0x005d;
            }
        L_0x005d:
            r13 = -1
        L_0x005e:
            r5 = 37
            r8 = 134217728(0x8000000, float:3.85186E-34)
            java.lang.String r9 = "notification-type"
            r6 = 335544320(0x14000000, float:6.4623485E-27)
            switch(r13) {
                case 0: goto L_0x00de;
                case 1: goto L_0x00ac;
                case 2: goto L_0x0085;
                case 3: goto L_0x006a;
                case 4: goto L_0x0148;
                default: goto L_0x0069;
            }
        L_0x0069:
            return
        L_0x006a:
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0)
            r1.addFlags(r6)
            r1.putExtra(r9, r12)
            java.lang.String r0 = "https://faq.whatsapp.com/general/payments/learn-more-about-identity-documents-br"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r1.setData(r0)
            android.app.PendingIntent r0 = X.C42341xd.A00(r4, r3, r1, r8)
            goto L_0x00a0
        L_0x0085:
            X.0wS r0 = r14.A06
            X.19r r0 = r0.A03()
            java.lang.Class r1 = r0.AEt()
            if (r1 == 0) goto L_0x0069
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r4, r1)
            r0.addFlags(r6)
            r0.putExtra(r9, r10)
            android.app.PendingIntent r0 = X.C42341xd.A00(r4, r3, r0, r8)
        L_0x00a0:
            r2.A09 = r0
            android.app.Notification r1 = r2.A01()
            X.0yL r0 = r14.A01
            r0.A02(r5, r1)
            return
        L_0x00ac:
            X.0wS r0 = r14.A06
            X.19r r0 = r0.A03()
            java.lang.Class r0 = r0.AEt()
            if (r0 == 0) goto L_0x0069
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r4, r0)
            r1.addFlags(r6)
            r1.putExtra(r9, r11)
            java.lang.String r0 = "step-up-id"
            r5 = r18
            r1.putExtra(r0, r5)
            android.app.PendingIntent r0 = X.C42341xd.A00(r4, r3, r1, r8)
            r2.A09 = r0
            android.app.Notification r3 = r2.A01()
            X.0yL r2 = r14.A01
            r1 = 28
            r0 = 1
            r2.A04(r3, r5, r1, r0)
            return
        L_0x00de:
            X.0wS r0 = r14.A06
            X.19r r0 = r0.A03()
            java.lang.Class r0 = r0.AEm()
            if (r0 == 0) goto L_0x0069
            android.content.Intent r5 = new android.content.Intent
            r5.<init>(r4, r0)
            r5.addFlags(r6)
            r5.putExtra(r9, r1)
            X.160 r1 = r14.A02
            X.1cl r0 = r1.A06()
            if (r0 == 0) goto L_0x0114
            X.1cl r0 = r1.A06()
            X.1tF r0 = r0.A08
            if (r0 == 0) goto L_0x0114
            X.1cl r0 = r1.A06()
            X.1tF r0 = r0.A08
            X.1lh r1 = r0.A06()
            java.lang.String r0 = "extra_payment_name"
            r5.putExtra(r0, r1)
        L_0x0114:
            android.app.PendingIntent r0 = X.C42341xd.A00(r4, r3, r5, r8)
            r2.A09 = r0
            android.app.Notification r2 = r2.A01()
            X.0yL r1 = r14.A01
            r0 = 47
            r1.A02(r0, r2)
            return
        L_0x0126:
            java.lang.String r0 = "KYC"
            boolean r0 = r5.equals(r0)
            r13 = 4
            goto L_0x0144
        L_0x012e:
            boolean r0 = r5.equals(r12)
            r13 = 3
            goto L_0x0144
        L_0x0134:
            boolean r0 = r5.equals(r10)
            r13 = 2
            goto L_0x0144
        L_0x013a:
            boolean r0 = r5.equals(r11)
            goto L_0x0144
        L_0x013f:
            boolean r0 = r5.equals(r1)
            r13 = 0
        L_0x0144:
            if (r0 != 0) goto L_0x005e
            goto L_0x005d
        L_0x0148:
            X.0wS r0 = r14.A06
            X.19r r0 = r0.A03()
            java.lang.Class r1 = r0.AEt()
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r4, r1)
            r0.addFlags(r6)
            android.app.PendingIntent r0 = X.C42341xd.A00(r4, r3, r0, r3)
            r2.A09 = r0
            android.app.Notification r1 = r2.A01()
            X.0yL r0 = r14.A01
            r0.A02(r7, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass109.A03(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
