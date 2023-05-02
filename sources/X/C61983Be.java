package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Be  reason: invalid class name and case insensitive filesystem */
public class C61983Be {
    public static int A00(AnonymousClass220 r2) {
        int i2 = r2.A01;
        if (i2 == 4) {
            return 4;
        }
        if (i2 != 6) {
            return 0;
        }
        if (!A03(r2, "review_and_pay")) {
            return (r2.A01 != 6 || !A03(r2, "mpm")) ? 5 : 6;
        }
        return 3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x016e, code lost:
        if (r1 == null) goto L_0x02af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0174, code lost:
        if (r1.isEmpty() != false) goto L_0x02af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0176, code lost:
        if (r10 == null) goto L_0x0179;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0179, code lost:
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x017c, code lost:
        r11 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x017e, code lost:
        r13 = (X.AnonymousClass222) r1.get(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0185, code lost:
        if (r13 == null) goto L_0x02af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0187, code lost:
        r16 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r2 = X.C13700nu.A0K(r13.A01);
        r4 = r2.optString("thumbnail_product_id");
        r17 = r2.optString("business_owner_jid");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01a2, code lost:
        if (r17.isEmpty() == false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01a4, code lost:
        r7.AcB("JsonPayloadForNativeFlowMPMIsMissingRequiredData", "businessOwnerJID is empty when businessOwnerJID is a required field", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01ac, code lost:
        r12 = new X.C35151lS(r4, r11, false);
        r0 = r12.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01b4, code lost:
        if (r0 == null) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x01b7, code lost:
        if (r0.length != 0) goto L_0x01c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x01b9, code lost:
        r7.AcB("NativeFlowMPMIsMissingThumbnailJpegData", "Error: thumbnail jpeg data is null or an empty byte array, so valid thumbnail jpeg is missing from payload", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01c6, code lost:
        if (r12.A01.isEmpty() == false) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01c8, code lost:
        r7.AcB("NativeFlowMPMIsMissingThumbnailProductId", "Error: thumbnail product id is empty string, so valid thumbnail product id is missing from payload", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x01cf, code lost:
        r11 = r2.optJSONArray("sections");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x01d6, code lost:
        if (r11 != null) goto L_0x0233;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x01d8, code lost:
        r6 = X.AnonymousClass000.A0u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x01e0, code lost:
        if (r6.isEmpty() == false) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x01e2, code lost:
        r7.AcB("JsonPayloadForNativeFlowMPMIsMissingRequiredData", "Error: parsedProductListInfo is an empty list", true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01ea, code lost:
        r0 = new X.C35171lU(com.whatsapp.jid.UserJid.get(r17), r12, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x01f5, code lost:
        r3 = r6.iterator();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01fe, code lost:
        if (r3.hasNext() == false) goto L_0x021e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x020c, code lost:
        if (((X.C35141lR) r3.next()).A01.isEmpty() == false) goto L_0x021b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x020e, code lost:
        r1 = X.AnonymousClass000.A0q(r16);
        r1.append(r2);
        r16 = X.AnonymousClass000.A0h(", ", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x021b, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0222, code lost:
        if (r16.isEmpty() != false) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0224, code lost:
        r7.AcB("JsonPayloadForNativeFlowMPMIsMissingRequiredData", X.C13680ns.A0h("Error: parsedProductListInfo has empty product sections at indices: ", r16), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0233, code lost:
        r6 = X.AnonymousClass000.A0u();
        r4 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x023c, code lost:
        if (r4 >= r11.length()) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x023e, code lost:
        r1 = r11.optJSONObject(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0242, code lost:
        if (r1 == null) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0244, code lost:
        r15 = r1.optString("title");
        r3 = r1.optJSONArray("product_items");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0251, code lost:
        if (r3 == null) goto L_0x0283;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0253, code lost:
        r2 = X.AnonymousClass000.A0u();
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x025c, code lost:
        if (r1 >= r3.length()) goto L_0x027b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x025e, code lost:
        r0 = r3.optJSONObject(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0262, code lost:
        if (r0 == null) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0264, code lost:
        r14 = r0.optString("product_retailer_id");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x026e, code lost:
        if (r14.isEmpty() != false) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0270, code lost:
        r2.add(new X.C35161lT(r14));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0278, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x027b, code lost:
        r6.add(new X.C35141lR(r15, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0283, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0286, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:?, code lost:
        com.whatsapp.util.Log.e(X.C13680ns.A0h("FMessageInteractiveFactory/parseE2EProductListInfo/invalid JID=", ""), r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0293, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0294, code lost:
        r7.AcB("JsonPayloadForNativeFlowMPMIsMalformed", X.AnonymousClass000.A0g("Malformed params_json payload detected. error: ", r3), true);
        com.whatsapp.util.Log.e(X.AnonymousClass000.A0h(r13.A01, X.AnonymousClass000.A0r("FMessageInteractiveFactory/parseE2EProductListInfo/invalid or missing fields in button_params_json=")), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x02af, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x02b1, code lost:
        r18 = new X.C16880tn((X.C35251lc) null, r10, r0, r8, r18, "mpm", r25, 2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02c6, code lost:
        r2 = new X.AnonymousClass23S(26, X.C13680ns.A0c(r1, "unknown type: "));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x02d4, code lost:
        r11 = new X.C16880tn(r10, new X.C35191lW(A02(r9.A0d())), r8, r18, "");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x02f2, code lost:
        if (r9.A01 != 4) goto L_0x02f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x02f4, code lost:
        r3 = (X.C58652tq) r9.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02f9, code lost:
        r3 = X.C58652tq.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x02fb, code lost:
        if (r3 != null) goto L_0x02ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x02fd, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02ff, code lost:
        r2 = r3.A03;
        r1 = r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0303, code lost:
        if (r1 == 0) goto L_0x0313;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0306, code lost:
        if (r1 == 1) goto L_0x0310;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0309, code lost:
        if (r1 == 2) goto L_0x0316;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x030b, code lost:
        if (r1 != 3) goto L_0x0313;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x030d, code lost:
        r0 = X.C799942d.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0310, code lost:
        r0 = X.C799942d.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0313, code lost:
        r0 = X.C799942d.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0316, code lost:
        r0 = X.C799942d.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0318, code lost:
        r0 = X.C817549p.A00[r0.ordinal()];
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x0321, code lost:
        if (r0 == 1) goto L_0x032a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0323, code lost:
        r1 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0324, code lost:
        if (r0 == 2) goto L_0x032a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0326, code lost:
        r1 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0327, code lost:
        if (r0 == 3) goto L_0x032a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x0329, code lost:
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x032a, code lost:
        r3 = new X.C35131lQ(r1, r2, r3.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0331, code lost:
        r2 = new X.C16880tn(r10, r3, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0337, code lost:
        r2 = ((X.AnonymousClass222) r9.A0d().A02.get(0)).A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0346, code lost:
        if (r10 == null) goto L_0x042a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0348, code lost:
        r1 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x034a, code lost:
        r3 = X.C39801t5.A02(r32, r2, r1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0351, code lost:
        if (r3 == null) goto L_0x042d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x035b, code lost:
        if (X.C35251lc.A00(r3.A05.A01) == 0) goto L_0x042d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x035d, code lost:
        r11 = new X.C16880tn(r3, r10, new X.C35191lW(A02(r9.A0d())), r8, r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0379, code lost:
        if (r9.A01 != 6) goto L_0x0394;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0384, code lost:
        r3 = new X.C16830ti(r5, (byte) 54, r27);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x038d, code lost:
        r3.A00 = r2;
        r3.A12();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0394, code lost:
        r8 = r31;
        r6 = r37;
        r15 = r41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x03a1, code lost:
        if (A03(r9, "review_order") != false) goto L_0x03a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x03a3, code lost:
        r3 = new X.C16830ti(r5, (byte) 55, r27);
        r3.A00 = r2;
        r3.A12();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x03b9, code lost:
        if (A03(r9, "payment_method") != false) goto L_0x04a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x03c3, code lost:
        r4 = r9.A00 & 1;
        r14 = r40;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x03ca, code lost:
        if (r4 == 1) goto L_0x03cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x03cc, code lost:
        r0 = r9.A05;
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x03cf, code lost:
        if (r0 == null) goto L_0x03d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x03d1, code lost:
        r0 = X.AnonymousClass22R.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x03d9, code lost:
        if ((r0.A00 & 64) == 64) goto L_0x03db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x03db, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x03dc, code lost:
        if (r3 == null) goto L_0x03de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x03de, code lost:
        r0 = X.AnonymousClass22R.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x03e3, code lost:
        if (r0.A01 == 4) goto L_0x03e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x03e7, code lost:
        if (r4 == 1) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x03e9, code lost:
        r0 = r9.A05;
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x03ec, code lost:
        if (r0 == null) goto L_0x03ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x03ee, code lost:
        r0 = X.AnonymousClass22R.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x03f6, code lost:
        if ((r0.A00 & 64) == 64) goto L_0x03f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x03f8, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x03f9, code lost:
        if (r3 == null) goto L_0x03fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x03fb, code lost:
        r0 = X.AnonymousClass22R.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0400, code lost:
        if (r0.A01 == 7) goto L_0x0402;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0403, code lost:
        if (r4 == 1) goto L_0x0405;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0405, code lost:
        r0 = r9.A05;
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0408, code lost:
        if (r0 == null) goto L_0x040a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x040a, code lost:
        r0 = X.AnonymousClass22R.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0412, code lost:
        if ((r0.A00 & 64) == 64) goto L_0x0414;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0414, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x0415, code lost:
        if (r3 == null) goto L_0x0417;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0417, code lost:
        r0 = X.AnonymousClass22R.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x041c, code lost:
        if (r0.A01 == 3) goto L_0x041e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x041f, code lost:
        r3 = new X.C16830ti(r5, (byte) 55, r27);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x042a, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x042d, code lost:
        r2 = new X.AnonymousClass23S(26, "Order status: unknown status");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x0436, code lost:
        if (r41 == false) goto L_0x0438;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0438, code lost:
        r1 = r5.A00;
        X.AnonymousClass00B.A06(r1);
        r0 = X.C62013Bh.A00(r8, r1, r34, r29, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0445, code lost:
        if (r0 != null) goto L_0x0447;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0447, code lost:
        r6.A05(r3, (X.C16740tZ) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x044e, code lost:
        if (r3 == null) goto L_0x0450;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x0450, code lost:
        r3 = X.AnonymousClass22R.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x0454, code lost:
        if (r3.A01 == 4) goto L_0x0456;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x0456, code lost:
        r0 = (X.C445224k) r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x0467, code lost:
        r0 = X.C445224k.A0R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x046a, code lost:
        if (r3 == null) goto L_0x046c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x046c, code lost:
        r3 = X.AnonymousClass22R.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0470, code lost:
        if (r3.A01 == 7) goto L_0x0472;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0472, code lost:
        r0 = (X.C445524n) r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x0483, code lost:
        r0 = X.C445524n.A0O;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0486, code lost:
        if (r3 == null) goto L_0x0488;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0488, code lost:
        r3 = X.AnonymousClass22R.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x048c, code lost:
        if (r3.A01 == 3) goto L_0x048e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x048e, code lost:
        r0 = (X.C445324l) r3.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x049e, code lost:
        r0 = X.C445324l.A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x04a1, code lost:
        r3 = new X.C16830ti(r5, (byte) 55, r27);
        r3.A00 = r2;
        r3.A12();
        r1 = r5.A00;
        X.AnonymousClass00B.A06(r1);
        r0 = X.C62013Bh.A01(r8, r1, r29);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x04ba, code lost:
        if (r0 != null) goto L_0x04bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x04bc, code lost:
        r6.A05(r3, (X.C16740tZ) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x04c5, code lost:
        r1 = X.AnonymousClass000.A0r("message: ");
        r1.append(r6.name());
        r0 = X.C13680ns.A0i(", version: ", r1, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0072, code lost:
        if (r8 > 1) goto L_0x04c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0510, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0511, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0512, code lost:
        return new X.C39111rw(r0, r5, r2, r27, r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0513, code lost:
        return new X.C39141rz(r0, r5, r2, r27, r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0514, code lost:
        return new X.C39151s0(r0, r5, r2, r27, r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x0515, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0078, code lost:
        if ((r9.A00 & 1) != 1) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:?, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007a, code lost:
        r4 = r9.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007c, code lost:
        if (r4 != null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007e, code lost:
        r4 = X.AnonymousClass22R.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0080, code lost:
        r1 = r4.A0c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0086, code lost:
        if (r4.A05 == false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008a, code lost:
        if (r1 != X.C800342h.A04) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008c, code lost:
        r2 = new X.AnonymousClass23S(26, "media not set");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0099, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009a, code lost:
        r10 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009e, code lost:
        if (r1 != X.C800342h.A03) goto L_0x0109;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a0, code lost:
        r3 = r4.A04;
        r2 = r4.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a7, code lost:
        if (r4.A01 != 6) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a9, code lost:
        r0 = (X.C28631Ww) r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ad, code lost:
        r10 = new X.C35201lX(r3, r2, r0.A04());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00bb, code lost:
        if ((r9.A00 & 2) != 2) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bd, code lost:
        r0 = r9.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bf, code lost:
        if (r0 != null) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c1, code lost:
        r0 = X.C58202t7.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c3, code lost:
        r8 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00cb, code lost:
        if (r8 != null) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00d3, code lost:
        if (r9.A0c() == X.C799842c.A04) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d8, code lost:
        if (r9.A01 != 6) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00e1, code lost:
        if (A03(r9, "review_and_pay") != false) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ea, code lost:
        if (A03(r9, "review_order") != false) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f2, code lost:
        if (A03(r9, "payment_method") != false) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00fa, code lost:
        if (A03(r9, "payment_status") != false) goto L_0x013a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x00fc, code lost:
        r2 = new X.AnonymousClass23S(26, "missing body");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0104, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0106, code lost:
        r0 = X.C28631Ww.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x010b, code lost:
        if (r1 != X.C800342h.A02) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0110, code lost:
        if (r9.A01 != 6) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0119, code lost:
        if (A03(r9, "review_and_pay") == false) goto L_0x012e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x011b, code lost:
        r3 = r4.A04;
        r2 = r4.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0122, code lost:
        if (r4.A01 != 4) goto L_0x012b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0124, code lost:
        r0 = (X.C445224k) r4.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0128, code lost:
        r0 = r0.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x012b, code lost:
        r0 = X.C445224k.A0R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x012e, code lost:
        r10 = new X.C35201lX(r4.A04, r4.A03, (byte[]) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x013f, code lost:
        if ((r9.A00 & 4) != 4) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0141, code lost:
        r0 = r9.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0143, code lost:
        if (r0 != null) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0145, code lost:
        r0 = X.C58212t8.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0147, code lost:
        r18 = r0.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x014b, code lost:
        r1 = A00(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0150, code lost:
        if (r1 == 3) goto L_0x0337;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0153, code lost:
        r18 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0156, code lost:
        if (r1 == 4) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0159, code lost:
        if (r1 == 5) goto L_0x02d4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x015c, code lost:
        if (r1 != 6) goto L_0x02c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x015e, code lost:
        if (r8 != null) goto L_0x0162;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0160, code lost:
        r8 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0162, code lost:
        r25 = X.AnonymousClass000.A0u();
        r1 = r9.A0d().A02;
     */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x0384 A[Catch:{ 23S -> 0x04ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0394 A[Catch:{ 23S -> 0x04ea }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C16740tZ A01(X.C16300so r30, X.C16460t6 r31, X.AnonymousClass173 r32, X.C14710pd r33, X.C222517f r34, X.C33211iD r35, X.C28381Vw r36, X.C222617g r37, long r38, boolean r40, boolean r41) {
        /*
            r29 = r35
            r0 = r29
            X.220 r0 = r0.A0O
            if (r0 != 0) goto L_0x000a
            X.220 r0 = X.AnonymousClass220.A07
        L_0x000a:
            int r2 = A00(r0)
            r1 = 2811(0xafb, float:3.939E-42)
            X.0tM r0 = X.C16620tM.A02
            r3 = r33
            boolean r0 = r3.A0E(r0, r1)
            r5 = r36
            r27 = r38
            if (r0 != 0) goto L_0x002f
            r0 = 6
            if (r2 != r0) goto L_0x002f
        L_0x0021:
            byte[] r6 = r29.A02()
            r7 = 2
            X.1rQ r3 = new X.1rQ
            r4 = r3
            r8 = r27
            r4.<init>(r5, r6, r7, r8)
        L_0x002e:
            return r3
        L_0x002f:
            r7 = r30
            X.220 r9 = X.C439021z.A00(r29)     // Catch:{ 23S -> 0x04ea }
            X.42c r6 = r9.A0c()     // Catch:{ 23S -> 0x04ea }
            java.lang.String r3 = "FMessageInteractiveFactory/isUnknownInteractiveMessage"
            r2 = 0
            r4 = 1
            if (r6 == 0) goto L_0x04c2
            X.42c r0 = X.C799842c.A02     // Catch:{ 23S -> 0x04ea }
            if (r6 == r0) goto L_0x04c2
            int r0 = r6.ordinal()     // Catch:{ 23S -> 0x04ea }
            switch(r0) {
                case 0: goto L_0x0063;
                case 1: goto L_0x0054;
                case 2: goto L_0x004d;
                default: goto L_0x004a;
            }     // Catch:{ 23S -> 0x04ea }
        L_0x004a:
            r8 = -1
            goto L_0x04c5
        L_0x004d:
            X.221 r0 = r9.A0d()     // Catch:{ 23S -> 0x04ea }
            int r8 = r0.A01     // Catch:{ 23S -> 0x04ea }
            goto L_0x0072
        L_0x0054:
            int r1 = r9.A01     // Catch:{ 23S -> 0x04ea }
            r0 = 5
            if (r1 != r0) goto L_0x0060
            java.lang.Object r0 = r9.A06     // Catch:{ 23S -> 0x04ea }
            X.2tp r0 = (X.C58642tp) r0     // Catch:{ 23S -> 0x04ea }
        L_0x005d:
            int r8 = r0.A01     // Catch:{ 23S -> 0x04ea }
            goto L_0x0072
        L_0x0060:
            X.2tp r0 = X.C58642tp.A04     // Catch:{ 23S -> 0x04ea }
            goto L_0x005d
        L_0x0063:
            int r1 = r9.A01     // Catch:{ 23S -> 0x04ea }
            r0 = 4
            if (r1 != r0) goto L_0x006f
            java.lang.Object r0 = r9.A06     // Catch:{ 23S -> 0x04ea }
            X.2tq r0 = (X.C58652tq) r0     // Catch:{ 23S -> 0x04ea }
        L_0x006c:
            int r8 = r0.A01     // Catch:{ 23S -> 0x04ea }
            goto L_0x0072
        L_0x006f:
            X.2tq r0 = X.C58652tq.A04     // Catch:{ 23S -> 0x04ea }
            goto L_0x006c
        L_0x0072:
            if (r8 > r4) goto L_0x04c5
            int r0 = r9.A00     // Catch:{ 23S -> 0x04ea }
            r0 = r0 & 1
            if (r0 != r4) goto L_0x009a
            X.22R r4 = r9.A05     // Catch:{ 23S -> 0x04ea }
            if (r4 != 0) goto L_0x0080
            X.22R r4 = X.AnonymousClass22R.A06     // Catch:{ 23S -> 0x04ea }
        L_0x0080:
            X.42h r1 = r4.A0c()     // Catch:{ 23S -> 0x04ea }
            boolean r0 = r4.A05     // Catch:{ 23S -> 0x04ea }
            if (r0 == 0) goto L_0x009c
            X.42h r0 = X.C800342h.A04     // Catch:{ 23S -> 0x04ea }
            if (r1 != r0) goto L_0x009c
            r0 = 26
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ 23S -> 0x04ea }
            java.lang.String r0 = "media not set"
            X.23S r2 = new X.23S     // Catch:{ 23S -> 0x04ea }
            r2.<init>(r1, r0)     // Catch:{ 23S -> 0x04ea }
        L_0x0099:
            throw r2     // Catch:{ 23S -> 0x04ea }
        L_0x009a:
            r10 = 0
            goto L_0x00b6
        L_0x009c:
            X.42h r0 = X.C800342h.A03     // Catch:{ 23S -> 0x04ea }
            if (r1 != r0) goto L_0x0109
            java.lang.String r3 = r4.A04     // Catch:{ 23S -> 0x04ea }
            java.lang.String r2 = r4.A03     // Catch:{ 23S -> 0x04ea }
            int r1 = r4.A01     // Catch:{ 23S -> 0x04ea }
            r0 = 6
            if (r1 != r0) goto L_0x0106
            java.lang.Object r0 = r4.A02     // Catch:{ 23S -> 0x04ea }
            X.1Ww r0 = (X.C28631Ww) r0     // Catch:{ 23S -> 0x04ea }
        L_0x00ad:
            byte[] r0 = r0.A04()     // Catch:{ 23S -> 0x04ea }
            X.1lX r10 = new X.1lX     // Catch:{ 23S -> 0x04ea }
            r10.<init>(r3, r2, r0)     // Catch:{ 23S -> 0x04ea }
        L_0x00b6:
            int r0 = r9.A00     // Catch:{ 23S -> 0x04ea }
            r1 = 2
            r0 = r0 & 2
            if (r0 != r1) goto L_0x0104
            X.2t7 r0 = r9.A03     // Catch:{ 23S -> 0x04ea }
            if (r0 != 0) goto L_0x00c3
            X.2t7 r0 = X.C58202t7.A02     // Catch:{ 23S -> 0x04ea }
        L_0x00c3:
            java.lang.String r8 = r0.A01     // Catch:{ 23S -> 0x04ea }
        L_0x00c5:
            r0 = 26
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ 23S -> 0x04ea }
            if (r8 != 0) goto L_0x013a
            X.42c r1 = r9.A0c()     // Catch:{ 23S -> 0x04ea }
            X.42c r0 = X.C799842c.A04     // Catch:{ 23S -> 0x04ea }
            if (r1 == r0) goto L_0x013a
            int r1 = r9.A01     // Catch:{ 23S -> 0x04ea }
            r0 = 6
            if (r1 != r0) goto L_0x00e3
            java.lang.String r0 = "review_and_pay"
            boolean r0 = A03(r9, r0)     // Catch:{ 23S -> 0x04ea }
            if (r0 != 0) goto L_0x013a
        L_0x00e3:
            java.lang.String r0 = "review_order"
            boolean r0 = A03(r9, r0)     // Catch:{ 23S -> 0x04ea }
            if (r0 != 0) goto L_0x013a
            java.lang.String r0 = "payment_method"
            boolean r0 = A03(r9, r0)     // Catch:{ 23S -> 0x04ea }
            if (r0 != 0) goto L_0x013a
            java.lang.String r0 = "payment_status"
            boolean r0 = A03(r9, r0)     // Catch:{ 23S -> 0x04ea }
            if (r0 != 0) goto L_0x013a
            java.lang.String r0 = "missing body"
            X.23S r2 = new X.23S     // Catch:{ 23S -> 0x04ea }
            r2.<init>(r6, r0)     // Catch:{ 23S -> 0x04ea }
            goto L_0x0099
        L_0x0104:
            r8 = 0
            goto L_0x00c5
        L_0x0106:
            X.1Ww r0 = X.C28631Ww.A01     // Catch:{ 23S -> 0x04ea }
            goto L_0x00ad
        L_0x0109:
            X.42h r0 = X.C800342h.A02     // Catch:{ 23S -> 0x04ea }
            if (r1 != r0) goto L_0x012e
            int r1 = r9.A01     // Catch:{ 23S -> 0x04ea }
            r0 = 6
            if (r1 != r0) goto L_0x012e
            java.lang.String r0 = "review_and_pay"
            boolean r0 = A03(r9, r0)     // Catch:{ 23S -> 0x04ea }
            if (r0 == 0) goto L_0x012e
            java.lang.String r3 = r4.A04     // Catch:{ 23S -> 0x04ea }
            java.lang.String r2 = r4.A03     // Catch:{ 23S -> 0x04ea }
            int r1 = r4.A01     // Catch:{ 23S -> 0x04ea }
            r0 = 4
            if (r1 != r0) goto L_0x012b
            java.lang.Object r0 = r4.A02     // Catch:{ 23S -> 0x04ea }
            X.24k r0 = (X.C445224k) r0     // Catch:{ 23S -> 0x04ea }
        L_0x0128:
            X.1Ww r0 = r0.A0A     // Catch:{ 23S -> 0x04ea }
            goto L_0x00ad
        L_0x012b:
            X.24k r0 = X.C445224k.A0R     // Catch:{ 23S -> 0x04ea }
            goto L_0x0128
        L_0x012e:
            java.lang.String r2 = r4.A04     // Catch:{ 23S -> 0x04ea }
            java.lang.String r1 = r4.A03     // Catch:{ 23S -> 0x04ea }
            r0 = 0
            X.1lX r10 = new X.1lX     // Catch:{ 23S -> 0x04ea }
            r10.<init>(r2, r1, r0)     // Catch:{ 23S -> 0x04ea }
            goto L_0x00b6
        L_0x013a:
            int r0 = r9.A00     // Catch:{ 23S -> 0x04ea }
            r2 = 4
            r0 = r0 & 4
            if (r0 != r2) goto L_0x0153
            X.2t8 r0 = r9.A04     // Catch:{ 23S -> 0x04ea }
            if (r0 != 0) goto L_0x0147
            X.2t8 r0 = X.C58212t8.A02     // Catch:{ 23S -> 0x04ea }
        L_0x0147:
            java.lang.String r0 = r0.A01     // Catch:{ 23S -> 0x04ea }
            r18 = r0
        L_0x014b:
            int r1 = A00(r9)     // Catch:{ 23S -> 0x04ea }
            r4 = 3
            if (r1 == r4) goto L_0x0337
            goto L_0x0156
        L_0x0153:
            r18 = 0
            goto L_0x014b
        L_0x0156:
            if (r1 == r2) goto L_0x02f0
            r0 = 5
            if (r1 == r0) goto L_0x02d4
            r0 = 6
            if (r1 != r0) goto L_0x02c6
            if (r8 != 0) goto L_0x0162
            java.lang.String r8 = ""
        L_0x0162:
            java.util.ArrayList r25 = X.AnonymousClass000.A0u()     // Catch:{ 23S -> 0x04ea }
            X.221 r0 = r9.A0d()     // Catch:{ 23S -> 0x04ea }
            X.1XE r1 = r0.A02     // Catch:{ 23S -> 0x04ea }
            r19 = 0
            if (r1 == 0) goto L_0x02af
            boolean r0 = r1.isEmpty()     // Catch:{ 23S -> 0x04ea }
            if (r0 != 0) goto L_0x02af
            if (r10 == 0) goto L_0x0179
            goto L_0x017c
        L_0x0179:
            r11 = r19
            goto L_0x017e
        L_0x017c:
            byte[] r11 = r10.A02     // Catch:{ 23S -> 0x04ea }
        L_0x017e:
            r6 = 0
            java.lang.Object r13 = r1.get(r6)     // Catch:{ 23S -> 0x04ea }
            X.222 r13 = (X.AnonymousClass222) r13     // Catch:{ 23S -> 0x04ea }
            if (r13 == 0) goto L_0x02af
            java.lang.String r17 = ""
            r16 = r17
            java.lang.String r0 = r13.A01     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            org.json.JSONObject r2 = X.C13700nu.A0K(r0)     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            java.lang.String r0 = "thumbnail_product_id"
            java.lang.String r4 = r2.optString(r0)     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            java.lang.String r0 = "business_owner_jid"
            java.lang.String r17 = r2.optString(r0)     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            boolean r0 = r17.isEmpty()     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            if (r0 == 0) goto L_0x01ac
            r3 = 1
            java.lang.String r1 = "JsonPayloadForNativeFlowMPMIsMissingRequiredData"
            java.lang.String r0 = "businessOwnerJID is empty when businessOwnerJID is a required field"
            r7.AcB(r1, r0, r3)     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
        L_0x01ac:
            X.1lS r12 = new X.1lS     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            r12.<init>(r4, r11, r6)     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            byte[] r0 = r12.A02     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            r3 = 1
            if (r0 == 0) goto L_0x01b9
            int r0 = r0.length     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            if (r0 != 0) goto L_0x01c0
        L_0x01b9:
            java.lang.String r1 = "NativeFlowMPMIsMissingThumbnailJpegData"
            java.lang.String r0 = "Error: thumbnail jpeg data is null or an empty byte array, so valid thumbnail jpeg is missing from payload"
            r7.AcB(r1, r0, r3)     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
        L_0x01c0:
            java.lang.String r0 = r12.A01     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            boolean r0 = r0.isEmpty()     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            if (r0 == 0) goto L_0x01cf
            java.lang.String r1 = "NativeFlowMPMIsMissingThumbnailProductId"
            java.lang.String r0 = "Error: thumbnail product id is empty string, so valid thumbnail product id is missing from payload"
            r7.AcB(r1, r0, r3)     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
        L_0x01cf:
            java.lang.String r0 = "sections"
            org.json.JSONArray r11 = r2.optJSONArray(r0)     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            if (r11 != 0) goto L_0x0233
            java.util.ArrayList r6 = X.AnonymousClass000.A0u()     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
        L_0x01dc:
            boolean r0 = r6.isEmpty()     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            if (r0 == 0) goto L_0x01f5
            r2 = 1
            java.lang.String r1 = "JsonPayloadForNativeFlowMPMIsMissingRequiredData"
            java.lang.String r0 = "Error: parsedProductListInfo is an empty list"
            r7.AcB(r1, r0, r2)     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
        L_0x01ea:
            com.whatsapp.jid.UserJid r1 = com.whatsapp.jid.UserJid.get(r17)     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            X.1lU r0 = new X.1lU     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            r0.<init>(r1, r12, r6)     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            goto L_0x02b1
        L_0x01f5:
            java.util.Iterator r3 = r6.iterator()     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            r2 = 0
        L_0x01fa:
            boolean r0 = r3.hasNext()     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            if (r0 == 0) goto L_0x021e
            java.lang.Object r0 = r3.next()     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            X.1lR r0 = (X.C35141lR) r0     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            java.util.List r0 = r0.A01     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            boolean r0 = r0.isEmpty()     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            if (r0 == 0) goto L_0x021b
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0q(r16)     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            r1.append(r2)     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            java.lang.String r0 = ", "
            java.lang.String r16 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
        L_0x021b:
            int r2 = r2 + 1
            goto L_0x01fa
        L_0x021e:
            boolean r0 = r16.isEmpty()     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            if (r0 != 0) goto L_0x01ea
            java.lang.String r1 = "Error: parsedProductListInfo has empty product sections at indices: "
            r0 = r16
            java.lang.String r2 = X.C13680ns.A0h(r1, r0)     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            java.lang.String r1 = "JsonPayloadForNativeFlowMPMIsMissingRequiredData"
            r0 = 1
            r7.AcB(r1, r2, r0)     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            goto L_0x01ea
        L_0x0233:
            java.util.ArrayList r6 = X.AnonymousClass000.A0u()     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            r4 = 0
        L_0x0238:
            int r0 = r11.length()     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            if (r4 >= r0) goto L_0x01dc
            org.json.JSONObject r1 = r11.optJSONObject(r4)     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            if (r1 == 0) goto L_0x0283
            java.lang.String r0 = "title"
            java.lang.String r15 = r1.optString(r0)     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            java.lang.String r0 = "product_items"
            org.json.JSONArray r3 = r1.optJSONArray(r0)     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            if (r3 == 0) goto L_0x0283
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            r1 = 0
        L_0x0258:
            int r0 = r3.length()     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            if (r1 >= r0) goto L_0x027b
            org.json.JSONObject r0 = r3.optJSONObject(r1)     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            if (r0 == 0) goto L_0x0278
            java.lang.String r14 = "product_retailer_id"
            java.lang.String r14 = r0.optString(r14)     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            boolean r0 = r14.isEmpty()     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            if (r0 != 0) goto L_0x0278
            X.1lT r0 = new X.1lT     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            r0.<init>((java.lang.String) r14)     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            r2.add(r0)     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
        L_0x0278:
            int r1 = r1 + 1
            goto L_0x0258
        L_0x027b:
            X.1lR r1 = new X.1lR     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            r1.<init>(r15, r2)     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
            r6.add(r1)     // Catch:{ JSONException -> 0x0293, 1W4 -> 0x0286 }
        L_0x0283:
            int r4 = r4 + 1
            goto L_0x0238
        L_0x0286:
            r2 = move-exception
            java.lang.String r1 = "FMessageInteractiveFactory/parseE2EProductListInfo/invalid JID="
            r0 = r17
            java.lang.String r0 = X.C13680ns.A0h(r1, r0)     // Catch:{ 23S -> 0x04ea }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ 23S -> 0x04ea }
            goto L_0x02af
        L_0x0293:
            r3 = move-exception
            java.lang.String r0 = "Malformed params_json payload detected. error: "
            java.lang.String r2 = X.AnonymousClass000.A0g(r0, r3)     // Catch:{ 23S -> 0x04ea }
            r1 = 1
            java.lang.String r0 = "JsonPayloadForNativeFlowMPMIsMalformed"
            r7.AcB(r0, r2, r1)     // Catch:{ 23S -> 0x04ea }
            java.lang.String r0 = "FMessageInteractiveFactory/parseE2EProductListInfo/invalid or missing fields in button_params_json="
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ 23S -> 0x04ea }
            java.lang.String r0 = r13.A01     // Catch:{ 23S -> 0x04ea }
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ 23S -> 0x04ea }
            com.whatsapp.util.Log.e(r0, r3)     // Catch:{ 23S -> 0x04ea }
        L_0x02af:
            r0 = r19
        L_0x02b1:
            r26 = 2
            java.lang.String r24 = "mpm"
            X.0tn r2 = new X.0tn     // Catch:{ 23S -> 0x04ea }
            r21 = r0
            r22 = r8
            r23 = r18
            r18 = r2
            r20 = r10
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)     // Catch:{ 23S -> 0x04ea }
            goto L_0x0376
        L_0x02c6:
            java.lang.String r0 = "unknown type: "
            java.lang.String r0 = X.C13680ns.A0c(r1, r0)     // Catch:{ 23S -> 0x04ea }
            X.23S r2 = new X.23S     // Catch:{ 23S -> 0x04ea }
            r2.<init>(r6, r0)     // Catch:{ 23S -> 0x04ea }
            goto L_0x0099
        L_0x02d4:
            X.221 r0 = r9.A0d()     // Catch:{ 23S -> 0x04ea }
            java.util.List r1 = A02(r0)     // Catch:{ 23S -> 0x04ea }
            X.1lW r0 = new X.1lW     // Catch:{ 23S -> 0x04ea }
            r0.<init>((java.util.List) r1)     // Catch:{ 23S -> 0x04ea }
            java.lang.String r16 = ""
            X.0tn r2 = new X.0tn     // Catch:{ 23S -> 0x04ea }
            r11 = r2
            r12 = r10
            r13 = r0
            r14 = r8
            r15 = r18
            r11.<init>((X.C35201lX) r12, (X.C35191lW) r13, (java.lang.String) r14, (java.lang.String) r15, (java.lang.String) r16)     // Catch:{ 23S -> 0x04ea }
            goto L_0x0376
        L_0x02f0:
            int r0 = r9.A01     // Catch:{ 23S -> 0x04ea }
            if (r0 != r2) goto L_0x02f9
            java.lang.Object r3 = r9.A06     // Catch:{ 23S -> 0x04ea }
            X.2tq r3 = (X.C58652tq) r3     // Catch:{ 23S -> 0x04ea }
            goto L_0x02fb
        L_0x02f9:
            X.2tq r3 = X.C58652tq.A04     // Catch:{ 23S -> 0x04ea }
        L_0x02fb:
            if (r3 != 0) goto L_0x02ff
            r3 = 0
            goto L_0x0331
        L_0x02ff:
            java.lang.String r2 = r3.A03     // Catch:{ 23S -> 0x04ea }
            int r1 = r3.A02     // Catch:{ 23S -> 0x04ea }
            if (r1 == 0) goto L_0x0313
            r0 = 1
            if (r1 == r0) goto L_0x0310
            r0 = 2
            if (r1 == r0) goto L_0x0316
            if (r1 != r4) goto L_0x0313
            X.42d r0 = X.C799942d.A04     // Catch:{ 23S -> 0x04ea }
            goto L_0x0318
        L_0x0310:
            X.42d r0 = X.C799942d.A01     // Catch:{ 23S -> 0x04ea }
            goto L_0x0318
        L_0x0313:
            X.42d r0 = X.C799942d.A03     // Catch:{ 23S -> 0x04ea }
            goto L_0x0318
        L_0x0316:
            X.42d r0 = X.C799942d.A02     // Catch:{ 23S -> 0x04ea }
        L_0x0318:
            int[] r1 = X.C817549p.A00     // Catch:{ 23S -> 0x04ea }
            int r0 = r0.ordinal()     // Catch:{ 23S -> 0x04ea }
            r0 = r1[r0]     // Catch:{ 23S -> 0x04ea }
            r1 = 1
            if (r0 == r1) goto L_0x032a
            r1 = 2
            if (r0 == r1) goto L_0x032a
            r1 = 3
            if (r0 == r4) goto L_0x032a
            r1 = 0
        L_0x032a:
            int r0 = r3.A01     // Catch:{ 23S -> 0x04ea }
            X.1lQ r3 = new X.1lQ     // Catch:{ 23S -> 0x04ea }
            r3.<init>(r1, r2, r0)     // Catch:{ 23S -> 0x04ea }
        L_0x0331:
            X.0tn r2 = new X.0tn     // Catch:{ 23S -> 0x04ea }
            r2.<init>(r10, r3, r8)     // Catch:{ 23S -> 0x04ea }
            goto L_0x0376
        L_0x0337:
            X.221 r0 = r9.A0d()     // Catch:{ 23S -> 0x04ea }
            r1 = 0
            X.1XE r0 = r0.A02     // Catch:{ 23S -> 0x04ea }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ 23S -> 0x04ea }
            X.222 r0 = (X.AnonymousClass222) r0     // Catch:{ 23S -> 0x04ea }
            java.lang.String r2 = r0.A01     // Catch:{ 23S -> 0x04ea }
            if (r10 == 0) goto L_0x042a
            byte[] r1 = r10.A02     // Catch:{ 23S -> 0x04ea }
        L_0x034a:
            r0 = 1
            r3 = r32
            X.1lc r3 = X.C39801t5.A02(r3, r2, r1, r0)     // Catch:{ 23S -> 0x04ea }
            if (r3 == 0) goto L_0x042d
            X.1lZ r0 = r3.A05     // Catch:{ 23S -> 0x04ea }
            java.lang.String r0 = r0.A01     // Catch:{ 23S -> 0x04ea }
            int r0 = X.C35251lc.A00(r0)     // Catch:{ 23S -> 0x04ea }
            if (r0 == 0) goto L_0x042d
            X.221 r0 = r9.A0d()     // Catch:{ 23S -> 0x04ea }
            java.util.List r1 = A02(r0)     // Catch:{ 23S -> 0x04ea }
            X.1lW r0 = new X.1lW     // Catch:{ 23S -> 0x04ea }
            r0.<init>((java.util.List) r1)     // Catch:{ 23S -> 0x04ea }
            X.0tn r2 = new X.0tn     // Catch:{ 23S -> 0x04ea }
            r14 = r0
            r15 = r8
            r16 = r18
            r11 = r2
            r12 = r3
            r13 = r10
            r11.<init>((X.C35251lc) r12, (X.C35201lX) r13, (X.C35191lW) r14, (java.lang.String) r15, (java.lang.String) r16)     // Catch:{ 23S -> 0x04ea }
        L_0x0376:
            int r1 = r9.A01     // Catch:{ 23S -> 0x04ea }
            r0 = 6
            if (r1 != r0) goto L_0x0394
            java.lang.String r0 = "review_and_pay"
            boolean r0 = A03(r9, r0)     // Catch:{ 23S -> 0x04ea }
            if (r0 == 0) goto L_0x0394
            r4 = 54
            X.0ti r3 = new X.0ti     // Catch:{ 23S -> 0x04ea }
            r0 = r27
            r3.<init>(r5, r4, r0)     // Catch:{ 23S -> 0x04ea }
        L_0x038d:
            r3.A00 = r2     // Catch:{ 23S -> 0x04ea }
            r3.A12()     // Catch:{ 23S -> 0x04ea }
            goto L_0x0510
        L_0x0394:
            java.lang.String r0 = "review_order"
            boolean r0 = A03(r9, r0)     // Catch:{ 23S -> 0x04ea }
            r8 = r31
            r6 = r37
            r15 = r41
            if (r0 == 0) goto L_0x03b3
            r4 = 55
            X.0ti r3 = new X.0ti     // Catch:{ 23S -> 0x04ea }
            r0 = r27
            r3.<init>(r5, r4, r0)     // Catch:{ 23S -> 0x04ea }
            r3.A00 = r2     // Catch:{ 23S -> 0x04ea }
            r3.A12()     // Catch:{ 23S -> 0x04ea }
            goto L_0x0436
        L_0x03b3:
            java.lang.String r0 = "payment_method"
            boolean r0 = A03(r9, r0)     // Catch:{ 23S -> 0x04ea }
            if (r0 != 0) goto L_0x04a1
            java.lang.String r0 = "payment_status"
            boolean r0 = A03(r9, r0)     // Catch:{ 23S -> 0x04ea }
            if (r0 != 0) goto L_0x04a1
            int r1 = r9.A00     // Catch:{ 23S -> 0x04ea }
            r0 = 1
            r4 = r1 & 1
            r14 = r40
            if (r4 != r0) goto L_0x03e6
            X.22R r0 = r9.A05     // Catch:{ 23S -> 0x04ea }
            r3 = r0
            if (r0 != 0) goto L_0x03d3
            X.22R r0 = X.AnonymousClass22R.A06     // Catch:{ 23S -> 0x04ea }
        L_0x03d3:
            int r0 = r0.A00     // Catch:{ 23S -> 0x04ea }
            r1 = 64
            r0 = r0 & 64
            if (r0 != r1) goto L_0x03e6
            r0 = r3
            if (r3 != 0) goto L_0x03e0
            X.22R r0 = X.AnonymousClass22R.A06     // Catch:{ 23S -> 0x04ea }
        L_0x03e0:
            int r0 = r0.A01     // Catch:{ 23S -> 0x04ea }
            r1 = 4
            if (r0 != r1) goto L_0x03e6
            goto L_0x044e
        L_0x03e6:
            r0 = 1
            if (r4 != r0) goto L_0x0403
            X.22R r0 = r9.A05     // Catch:{ 23S -> 0x04ea }
            r3 = r0
            if (r0 != 0) goto L_0x03f0
            X.22R r0 = X.AnonymousClass22R.A06     // Catch:{ 23S -> 0x04ea }
        L_0x03f0:
            int r0 = r0.A00     // Catch:{ 23S -> 0x04ea }
            r1 = 64
            r0 = r0 & 64
            if (r0 != r1) goto L_0x0405
            r0 = r3
            if (r3 != 0) goto L_0x03fd
            X.22R r0 = X.AnonymousClass22R.A06     // Catch:{ 23S -> 0x04ea }
        L_0x03fd:
            int r0 = r0.A01     // Catch:{ 23S -> 0x04ea }
            r1 = 7
            if (r0 != r1) goto L_0x0405
            goto L_0x046a
        L_0x0403:
            if (r4 != r0) goto L_0x041f
        L_0x0405:
            X.22R r0 = r9.A05     // Catch:{ 23S -> 0x04ea }
            r3 = r0
            if (r0 != 0) goto L_0x040c
            X.22R r0 = X.AnonymousClass22R.A06     // Catch:{ 23S -> 0x04ea }
        L_0x040c:
            int r0 = r0.A00     // Catch:{ 23S -> 0x04ea }
            r1 = 64
            r0 = r0 & 64
            if (r0 != r1) goto L_0x041f
            r0 = r3
            if (r3 != 0) goto L_0x0419
            X.22R r0 = X.AnonymousClass22R.A06     // Catch:{ 23S -> 0x04ea }
        L_0x0419:
            int r0 = r0.A01     // Catch:{ 23S -> 0x04ea }
            r1 = 3
            if (r0 != r1) goto L_0x041f
            goto L_0x0486
        L_0x041f:
            r4 = 55
            X.0ti r3 = new X.0ti     // Catch:{ 23S -> 0x04ea }
            r0 = r27
            r3.<init>(r5, r4, r0)     // Catch:{ 23S -> 0x04ea }
            goto L_0x038d
        L_0x042a:
            r1 = 0
            goto L_0x034a
        L_0x042d:
            java.lang.String r0 = "Order status: unknown status"
            X.23S r2 = new X.23S     // Catch:{ 23S -> 0x04ea }
            r2.<init>(r6, r0)     // Catch:{ 23S -> 0x04ea }
            goto L_0x0099
        L_0x0436:
            if (r41 != 0) goto L_0x002e
            X.0rv r1 = r5.A00     // Catch:{ 23S -> 0x04ea }
            X.AnonymousClass00B.A06(r1)     // Catch:{ 23S -> 0x04ea }
            r2 = r34
            r0 = r29
            X.0tj r0 = X.C62013Bh.A00(r8, r1, r2, r0, r3)     // Catch:{ 23S -> 0x04ea }
            if (r0 == 0) goto L_0x002e
            X.0tZ r0 = (X.C16740tZ) r0     // Catch:{ 23S -> 0x04ea }
            r6.A05(r3, r0)     // Catch:{ 23S -> 0x04ea }
            goto L_0x0511
        L_0x044e:
            if (r3 != 0) goto L_0x0452
            X.22R r3 = X.AnonymousClass22R.A06     // Catch:{ 23S -> 0x04ea }
        L_0x0452:
            int r0 = r3.A01     // Catch:{ 23S -> 0x04ea }
            if (r0 != r1) goto L_0x0467
            java.lang.Object r0 = r3.A02     // Catch:{ 23S -> 0x04ea }
            X.24k r0 = (X.C445224k) r0     // Catch:{ 23S -> 0x04ea }
        L_0x045a:
            X.1rw r3 = new X.1rw     // Catch:{ 23S -> 0x04ea }
            r8 = r3
            r9 = r0
            r10 = r5
            r11 = r2
            r12 = r27
            r8.<init>(r9, r10, r11, r12, r14, r15)     // Catch:{ 23S -> 0x04ea }
            goto L_0x0512
        L_0x0467:
            X.24k r0 = X.C445224k.A0R     // Catch:{ 23S -> 0x04ea }
            goto L_0x045a
        L_0x046a:
            if (r3 != 0) goto L_0x046e
            X.22R r3 = X.AnonymousClass22R.A06     // Catch:{ 23S -> 0x04ea }
        L_0x046e:
            int r0 = r3.A01     // Catch:{ 23S -> 0x04ea }
            if (r0 != r1) goto L_0x0483
            java.lang.Object r0 = r3.A02     // Catch:{ 23S -> 0x04ea }
            X.24n r0 = (X.C445524n) r0     // Catch:{ 23S -> 0x04ea }
        L_0x0476:
            X.1rz r3 = new X.1rz     // Catch:{ 23S -> 0x04ea }
            r8 = r3
            r9 = r0
            r10 = r5
            r11 = r2
            r12 = r27
            r8.<init>(r9, r10, r11, r12, r14, r15)     // Catch:{ 23S -> 0x04ea }
            goto L_0x0513
        L_0x0483:
            X.24n r0 = X.C445524n.A0O     // Catch:{ 23S -> 0x04ea }
            goto L_0x0476
        L_0x0486:
            if (r3 != 0) goto L_0x048a
            X.22R r3 = X.AnonymousClass22R.A06     // Catch:{ 23S -> 0x04ea }
        L_0x048a:
            int r0 = r3.A01     // Catch:{ 23S -> 0x04ea }
            if (r0 != r1) goto L_0x049e
            java.lang.Object r0 = r3.A02     // Catch:{ 23S -> 0x04ea }
            X.24l r0 = (X.C445324l) r0     // Catch:{ 23S -> 0x04ea }
        L_0x0492:
            X.1s0 r3 = new X.1s0     // Catch:{ 23S -> 0x04ea }
            r8 = r3
            r9 = r0
            r10 = r5
            r11 = r2
            r12 = r27
            r8.<init>(r9, r10, r11, r12, r14, r15)     // Catch:{ 23S -> 0x04ea }
            goto L_0x0514
        L_0x049e:
            X.24l r0 = X.C445324l.A0L     // Catch:{ 23S -> 0x04ea }
            goto L_0x0492
        L_0x04a1:
            r4 = 55
            X.0ti r3 = new X.0ti     // Catch:{ 23S -> 0x04ea }
            r0 = r27
            r3.<init>(r5, r4, r0)     // Catch:{ 23S -> 0x04ea }
            r3.A00 = r2     // Catch:{ 23S -> 0x04ea }
            r3.A12()     // Catch:{ 23S -> 0x04ea }
            X.0rv r1 = r5.A00     // Catch:{ 23S -> 0x04ea }
            X.AnonymousClass00B.A06(r1)     // Catch:{ 23S -> 0x04ea }
            r0 = r29
            X.0tj r0 = X.C62013Bh.A01(r8, r1, r0)     // Catch:{ 23S -> 0x04ea }
            if (r0 == 0) goto L_0x002e
            X.0tZ r0 = (X.C16740tZ) r0     // Catch:{ 23S -> 0x04ea }
            r6.A05(r3, r0)     // Catch:{ 23S -> 0x04ea }
            goto L_0x0515
        L_0x04c2:
            java.lang.String r0 = "messageCase null/not_set"
            goto L_0x04d8
        L_0x04c5:
            java.lang.String r0 = "message: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)     // Catch:{ 23S -> 0x04ea }
            java.lang.String r0 = r6.name()     // Catch:{ 23S -> 0x04ea }
            r1.append(r0)     // Catch:{ 23S -> 0x04ea }
            java.lang.String r0 = ", version: "
            java.lang.String r0 = X.C13680ns.A0i(r0, r1, r8)     // Catch:{ 23S -> 0x04ea }
        L_0x04d8:
            r7.AcB(r3, r0, r2)     // Catch:{ 23S -> 0x04ea }
            byte[] r10 = r29.A02()     // Catch:{ 23S -> 0x04ea }
            r11 = 2
            X.1rQ r3 = new X.1rQ     // Catch:{ 23S -> 0x04ea }
            r8 = r3
            r9 = r5
            r12 = r27
            r8.<init>(r9, r10, r11, r12)     // Catch:{ 23S -> 0x04ea }
            goto L_0x0516
        L_0x04ea:
            r2 = move-exception
            java.lang.Integer r0 = r2.e2eFailureReason
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x0517
            java.lang.String r0 = "FMessageInteractiveFactory/parseInteractiveMessage/invalid message; message.key="
            java.lang.String r0 = X.AnonymousClass000.A0g(r0, r5)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            java.lang.String r0 = "error: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r2.description
            java.lang.String r2 = X.AnonymousClass000.A0h(r0, r1)
            r1 = 1
            java.lang.String r0 = "FMessageInteractiveFactory/parseInteractiveMessage/invalid_message"
            r7.AcB(r0, r2, r1)
            goto L_0x0021
        L_0x0510:
            return r3
        L_0x0511:
            return r3
        L_0x0512:
            return r3
        L_0x0513:
            return r3
        L_0x0514:
            return r3
        L_0x0515:
            return r3
        L_0x0516:
            return r3
        L_0x0517:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61983Be.A01(X.0so, X.0t6, X.173, X.0pd, X.17f, X.1iD, X.1Vw, X.17g, long, boolean, boolean):X.0tZ");
    }

    public static List A02(AnonymousClass221 r6) {
        ArrayList A0u = AnonymousClass000.A0u();
        if (r6 != null) {
            for (AnonymousClass222 r0 : r6.A02) {
                A0u.add(new C35181lV(new C35071lK(r0.A02, r0.A01), false));
            }
        }
        return A0u;
    }

    public static boolean A03(AnonymousClass220 r2, String str) {
        AnonymousClass221 A0d = r2.A0d();
        AnonymousClass222 r22 = (A0d == null || A0d.A02.size() != 1) ? null : (AnonymousClass222) A0d.A02.get(0);
        return r22 != null && str.equals(r22.A02) && !TextUtils.isEmpty(r22.A01);
    }
}
