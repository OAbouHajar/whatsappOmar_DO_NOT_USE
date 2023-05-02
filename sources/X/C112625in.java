package X;

import android.content.Context;
import android.content.Intent;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.5in  reason: invalid class name and case insensitive filesystem */
public final class C112625in extends AnonymousClass1IC implements AnonymousClass68V, AnonymousClass1IG {
    public C16040sK A00;
    public C16440t3 A01;
    public AnonymousClass1IN A02;
    public AnonymousClass5x6 A03;
    public final AnonymousClass1IO A04;
    public final C16980tz A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C112625in(AnonymousClass1IO r2, C16980tz r3, C20210zg r4) {
        super(r4);
        C18450wi.A0J(r3, r2);
        C18450wi.A0H(r4, 3);
        this.A05 = r3;
        this.A04 = r2;
    }

    public String A00() {
        return "br_verify_card_deeplink";
    }

    public void A01() {
        super.A01();
        AnonymousClass5x6 r3 = this.A03;
        if (r3 == null) {
            C18450wi.A0O("activityResultManager");
            throw AnonymousClass000.A0a("Redex: Unreachable code after no-return invoke");
        }
        r3.A01.A02(r3.A02).A00(new C1206062h(r3), C1206962q.class, r3);
    }

    public void A02() {
        AnonymousClass5x6 r2 = this.A03;
        if (r2 == null) {
            C18450wi.A0O("activityResultManager");
            throw AnonymousClass000.A0a("Redex: Unreachable code after no-return invoke");
        } else {
            r2.A01.A02(r2.A02).A03(r2);
        }
    }

    public void A03(AnonymousClass39C r7, AnonymousClass4WX r8, Map map) {
        AnonymousClass01Q A002;
        if ((map.containsKey("app_to_app_partner_app_package") || map.containsKey("app_to_app_partner_intent_action")) && (A002 = C119095vw.A00(C13690nt.A0e("app_to_app_partner_app_package", map), C13690nt.A0e("app_to_app_partner_intent_action", map))) != null) {
            HashMap hashMap = new HashMap(map);
            hashMap.put("app_to_app_partner_app_package", A002.A00);
            hashMap.put("app_to_app_partner_intent_action", A002.A01);
            map = hashMap;
        }
        Intent intent = new Intent("com.obwhatsapp.payments.phoenix.action.launch_activity_for_phoenix_result");
        Context context = this.A05.A00;
        intent.setPackage(context.getPackageName());
        intent.putExtra("app_to_app_partner_app_package", C13690nt.A0e("app_to_app_partner_app_package", map));
        intent.putExtra("app_to_app_partner_intent_action", C13690nt.A0e("app_to_app_partner_intent_action", map));
        intent.putExtra("app_to_app_request_payload", C13690nt.A0e("app_to_app_request_payload", map));
        context.sendBroadcast(intent);
        r7.A01((Map) null);
    }

    public void A59(String str) {
        C18450wi.A0H(str, 0);
        this.A03 = new AnonymousClass5x6(this, C110115dX.A0Y(this.A04.A00.A01), str);
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void AM2(int r10, android.os.Bundle r11) {
        /*
            r9 = this;
            java.util.HashMap r4 = X.AnonymousClass000.A0x()
            java.lang.String r6 = "failure"
            java.lang.String r5 = "PAY: FcsBRActivityResultResource/onDeeplinkActivityResult - response is NULL"
            java.lang.String r3 = "stepupresponse"
            r0 = -1
            if (r10 != r0) goto L_0x007a
            if (r11 == 0) goto L_0x0034
            java.lang.String r1 = "STEP_UP_RESPONSE"
            r2 = 0
            java.lang.String r0 = r11.getString(r1, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0057
            java.lang.String r0 = r11.getString(r1)
            r4.put(r3, r0)
            java.lang.String r1 = "STEP_UP_AUTH_CODE"
            boolean r0 = r11.containsKey(r1)
            if (r0 == 0) goto L_0x0034
            java.lang.String r1 = r11.getString(r1)
            java.lang.String r0 = "stepupauthcode"
            r4.put(r0, r1)
        L_0x0034:
            X.1IN r8 = r9.A02
            java.lang.String r7 = "pay_verify_card"
            java.lang.String r6 = "br_p2p_verify_card"
            java.lang.String r5 = "verify_deeplink"
            java.lang.String r3 = "domain"
            java.lang.String r2 = "config"
            java.lang.String r1 = "action"
            org.json.JSONObject r0 = X.C13700nu.A0J()
            r0.put(r1, r5)
            r0.put(r2, r6)
            java.lang.String r5 = X.C110115dX.A0f(r7, r3, r0)
            X.C18450wi.A0B(r5)
            X.0vk r1 = r8.A02
            monitor-enter(r1)
            goto L_0x0081
        L_0x0057:
            java.lang.String r1 = "issuerMobileAppAuthResponse"
            java.lang.String r0 = r11.getString(r1, r2)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x007a
            java.lang.String r0 = r11.getString(r1, r2)
            r4.put(r1, r0)
            java.lang.String r1 = "TAV"
            boolean r0 = r11.containsKey(r1)
            if (r0 == 0) goto L_0x0034
            java.lang.String r0 = r11.getString(r1)
            r4.put(r1, r0)
            goto L_0x0034
        L_0x007a:
            com.whatsapp.util.Log.e((java.lang.String) r5)
            r4.put(r3, r6)
            goto L_0x0034
        L_0x0081:
            java.util.Map r0 = r1.A00     // Catch:{ all -> 0x00bc }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x00bc }
            monitor-exit(r1)
            java.util.Iterator r3 = r0.iterator()
        L_0x008c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00bb
            java.lang.Object r0 = r3.next()
            X.0vu r0 = (X.C17950vu) r0
            X.1VZ r2 = r0.A00
            if (r2 == 0) goto L_0x008c
            X.4Qy r1 = r2.A03
            boolean r0 = r1 instanceof X.C77633w6
            if (r0 == 0) goto L_0x008c
            X.3w6 r1 = (X.C77633w6) r1
            java.lang.String r0 = r1.A02
            X.1IC r1 = r2.A02(r0)
            if (r1 == 0) goto L_0x008c
            boolean r0 = r1 instanceof X.AnonymousClass1IS
            if (r0 == 0) goto L_0x008c
            X.1IS r1 = (X.AnonymousClass1IS) r1
            boolean r0 = r1.A4S(r5)
            if (r0 == 0) goto L_0x008c
            r1.AHI(r5, r4)
        L_0x00bb:
            return
        L_0x00bc:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C112625in.AM2(int, android.os.Bundle):void");
    }
}
