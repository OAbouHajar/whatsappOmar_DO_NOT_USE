package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.obwhatsapp.instrumentation.api.InstrumentationService;

/* renamed from: X.2nY  reason: invalid class name and case insensitive filesystem */
public class C56382nY extends Binder implements IInterface {
    public final /* synthetic */ InstrumentationService A00;

    public C56382nY(InstrumentationService instrumentationService) {
        this.A00 = instrumentationService;
        attachInterface(this, "com.obwhatsapp.instrumentation.InstrumentationInterface");
    }

    public IBinder asBinder() {
        return this;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0219, code lost:
        if (r5.equals("send_message") == false) goto L_0x071d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x021b, code lost:
        r1 = r7.A09;
        r7 = r3.getJSONObject("payload");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:?, code lost:
        r5 = r1.A08.A00(r4, r7.getString("contact_id"));
        r2 = X.C16010sH.A01(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x023b, code lost:
        if (r1.A0B.A01(r2) != false) goto L_0x0244;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x023d, code lost:
        r3 = X.AnonymousClass10W.A00(3, "Feature is disabled!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0248, code lost:
        if (r5.A0J() == false) goto L_0x026c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x024a, code lost:
        r4 = r5.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x024e, code lost:
        if ((r4 instanceof X.C16050sL) == false) goto L_0x026c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0250, code lost:
        r4 = (com.whatsapp.jid.GroupJid) r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0258, code lost:
        if (r1.A06.A09(r4) == false) goto L_0x0262;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0260, code lost:
        if (r1.A07.A0g(r5, r4) == false) goto L_0x026c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0262, code lost:
        r3 = X.AnonymousClass10W.A00(16, "You can't send a message to this group");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0278, code lost:
        if (r1.A04.A0V((com.whatsapp.jid.UserJid) X.C16010sH.A03(r5)) == false) goto L_0x0284;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x027a, code lost:
        r3 = X.AnonymousClass10W.A00(11, "The requested contact is blocked.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0284, code lost:
        r5 = r1.A09;
        r4 = r5.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x028c, code lost:
        if (r4.A02(r2) != false) goto L_0x029e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x028e, code lost:
        com.whatsapp.util.Log.i("system-messages-handler/new chat initiated");
        r3 = X.AnonymousClass10W.A00(22, "User tries to start a new thread which would produce a system message");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02a2, code lost:
        if (r4.A02(r2) != false) goto L_0x02b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02a4, code lost:
        com.whatsapp.util.Log.i("system-messages-handler/new chat initiated");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02aa, code lost:
        r3 = X.AnonymousClass10W.A00(20, "There is a critical unread system message in the thread");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02ba, code lost:
        if (r5.A01.A08(r2) == false) goto L_0x033d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02bc, code lost:
        r19 = r5.A03.A04(r2);
        r12 = r5.A04;
        r11 = r12.A0C(r2, 100, r19, -1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:?, code lost:
        r10 = r11.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02d4, code lost:
        if (r10 == null) goto L_0x033d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02da, code lost:
        if (r10.moveToFirst() != false) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02dd, code lost:
        r9 = r12.A0G(r10, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02e1, code lost:
        if (r9 == null) goto L_0x0317;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02e7, code lost:
        if (r9.A13 == r19) goto L_0x0317;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02f8, code lost:
        if (r9.A0I < (r5.A00.A00() - 86400000)) goto L_0x0317;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02fc, code lost:
        if ((r9 instanceof X.C38971ri) != false) goto L_0x032c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0300, code lost:
        if ((r9 instanceof X.AnonymousClass1WU) == false) goto L_0x0317;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0302, code lost:
        r4 = ((X.AnonymousClass1WU) r9).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x030a, code lost:
        if (X.C40171tg.A01(r4) != false) goto L_0x0326;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x030e, code lost:
        if (r4 == 62) goto L_0x0326;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0312, code lost:
        if (r4 == 63) goto L_0x0326;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0314, code lost:
        switch(r4) {
            case 4: goto L_0x031e;
            case 12: goto L_0x031e;
            case 18: goto L_0x031e;
            case 20: goto L_0x031e;
            case com.mod.bomfab.R$styleable.FloatingActionMenu_menu_shadowColor :int: goto L_0x031e;
            case 52: goto L_0x031e;
            case 56: goto L_0x031e;
            case 57: goto L_0x031e;
            case 59: goto L_0x031e;
            case 67: goto L_0x031e;
            case 71: goto L_0x031e;
            case 79: goto L_0x031e;
            case 80: goto L_0x031e;
            case 90: goto L_0x031e;
            case 106: goto L_0x031e;
            default: goto L_0x0317;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x031b, code lost:
        if (r10.moveToNext() != false) goto L_0x02dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x031e, code lost:
        r1 = X.C13680ns.A0c(r4, "system-messages-handler/critical message ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0326, code lost:
        r1 = "system-messages-handler/critical message";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0329, code lost:
        com.whatsapp.util.Log.i(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:?, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0331, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0332, code lost:
        r1 = r11.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0334, code lost:
        if (r1 != null) goto L_0x0336;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0336, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0339, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x033a, code lost:
        r10.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x033d, code lost:
        r5 = r7.optString("media_type", "plain_text");
        r9 = r7.optString("media_uri");
        r20 = r7.optString("message");
        r4 = r5.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0356, code lost:
        if (r4 == 106642994) goto L_0x03a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x035b, code lost:
        if (r4 != 1021751938) goto L_0x0445;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0361, code lost:
        if (r5.equals("plain_text") == false) goto L_0x0445;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0367, code lost:
        if (android.text.TextUtils.isEmpty(r20) == false) goto L_0x0371;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x0369, code lost:
        r3 = X.AnonymousClass10W.A00(1, "Bad request -  message is empty");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0377, code lost:
        if (r1.A03.A08() != false) goto L_0x0385;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x037d, code lost:
        if (r1.A00.A00 != false) goto L_0x0385;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x037f, code lost:
        r1.A0A.A00(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0385, code lost:
        r1.A02.A0A((X.AnonymousClass1ZR) null, (X.C35541m6) null, (X.C16740tZ) null, r20, java.util.Collections.singletonList(r2), (java.util.List) null, false, false);
        r1.A05.A00(r2, 1, true, true);
        r3 = X.AnonymousClass10W.A01((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03ad, code lost:
        if (r5.equals("photo") == false) goto L_0x0445;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03b8, code lost:
        if (android.text.TextUtils.isEmpty(r9) == false) goto L_0x03c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03ba, code lost:
        r3 = X.AnonymousClass10W.A00(1, "Bad request -  photo uri is empty");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03c2, code lost:
        r16 = android.net.Uri.parse(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03cc, code lost:
        if (r1.A03.A08() != false) goto L_0x03da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03d2, code lost:
        if (r1.A00.A00 != false) goto L_0x03da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x03d4, code lost:
        r1.A0A.A00(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x03da, code lost:
        r1.A01.A02(r16, (X.C35541m6) null, (X.AnonymousClass1XQ) null, (X.C16740tZ) null, r20, java.util.Collections.singletonList(r2), (java.util.List) null, (java.util.List) null, 0, 0, false, false, false, false, false);
        r1.A05.A00(r2, 1, true, true);
        r3 = X.AnonymousClass10W.A01((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0406, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:?, code lost:
        com.whatsapp.util.Log.e("sendmedia/sendimages/share-failed/ ", r1);
        r1 = "Bad request -  URI inaccessible";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x040d, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x040e, code lost:
        com.whatsapp.util.Log.e("sendmedia/sendimages/share-failed/ ", r1);
        r3 = X.AnonymousClass10W.A00(5, "Service internal error! ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0418, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0419, code lost:
        com.whatsapp.util.Log.e("sendmedia/sendimages/share-failed/ ", r1);
        r1 = "Bad request -  file not an image";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x041e, code lost:
        r3 = X.AnonymousClass10W.A00(1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0424, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0425, code lost:
        com.whatsapp.util.Log.e("sendmedia/sendimages/share-failed/ ", r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x042d, code lost:
        if (r5.getMessage() == null) goto L_0x043f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0435, code lost:
        r3 = X.AnonymousClass10W.A00(19, "Device doesn't have enough free space");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x043f, code lost:
        r3 = X.AnonymousClass10W.A00(5, "Service internal error! ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0445, code lost:
        r3 = X.AnonymousClass10W.A00(2, "Request is not implemented yet!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:?, code lost:
        com.whatsapp.util.Log.e("requesthandler/send-message invalid contact ID");
        r1 = "Bad request - send_message";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x045c, code lost:
        if (r5.equals("accept_call") == false) goto L_0x071d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x045e, code lost:
        r6 = r7.A03;
        r2 = r3.getJSONObject("payload");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x046e, code lost:
        if (com.whatsapp.voipcalling.Voip.A09(com.whatsapp.voipcalling.Voip.getCurrentCallState()) != false) goto L_0x047a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0470, code lost:
        r2 = 18;
        r1 = "There is no incoming call";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0474, code lost:
        r3 = X.AnonymousClass10W.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x047a, code lost:
        r5 = r6.A03.A02(r4, r2.getString("call_id"));
        r3 = com.whatsapp.voipcalling.Voip.getCallInfo();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x048a, code lost:
        if (r3 == null) goto L_0x04b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x0492, code lost:
        if (r5.equals(r3.callId) == false) goto L_0x04b0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0496, code lost:
        if (r3.isGroupCall != false) goto L_0x04ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x049a, code lost:
        if (r3.isJoinableGroupCall != false) goto L_0x04ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x04a4, code lost:
        if (r6.A02.A0G(r3.videoEnabled) != false) goto L_0x04b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x04a6, code lost:
        r2 = 9;
        r1 = "OBWhatsApp requires voice permissions for this operation.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04ab, code lost:
        r2 = 23;
        r1 = "Group calling is disabled";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x04b0, code lost:
        r2 = 17;
        r1 = "There is no call with that call id";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04b5, code lost:
        r4 = r6.A01.A00;
        r4.startActivity(X.C14750ph.A0q().A11(r4, r5, 3, !r6.A00.A00));
        r3 = X.AnonymousClass10W.A01((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x04d8, code lost:
        if (r5.equals("get_call_state") == false) goto L_0x071d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x04da, code lost:
        r8 = r7.A05;
        r3 = X.AnonymousClass10W.A01(X.C204210b.A03(r8.A00, r8.A01, r8.A02, r8.A03, r8.A04, r4, (com.whatsapp.voipcalling.CallInfo) r8.A05.get(), (com.whatsapp.voipcalling.CallState) r8.A06.get()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0514, code lost:
        if (r5.equals("access_contacts") == false) goto L_0x071d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0516, code lost:
        r3 = r7.A04;
        r2 = X.AnonymousClass000.A0u();
        r2.add(X.C48452Nj.A00);
        r3.A00.A01(r8, r2);
        r3 = X.AnonymousClass10W.A01((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0533, code lost:
        if (r5.equals("reject_call") == false) goto L_0x071d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0535, code lost:
        r3 = r7.A0C.A00(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0543, code lost:
        if (r5.equals("mark_message_read") == false) goto L_0x071d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0545, code lost:
        r5 = r7.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:?, code lost:
        r2 = r3.getJSONObject("payload").getString("message_id");
        r7 = r5.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:?, code lost:
        r2 = new org.json.JSONArray(r7.A01.A02(r4, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0565, code lost:
        if (r2.getInt(0) != 1) goto L_0x05e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:?, code lost:
        r4 = X.C16460t6.A00(r7.A00, new X.C28381Vw(X.C15830rv.A01(r2.getString(3)), r2.getString(1), r2.getBoolean(2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0583, code lost:
        if (r4 == null) goto L_0x05f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0585, code lost:
        r3 = r4.A11.A00;
        X.AnonymousClass00B.A06(r3);
        r15 = r5.A00;
        r7 = r15.A0A.A06(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0596, code lost:
        if (r7 != null) goto L_0x05a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x0598, code lost:
        r1 = X.AnonymousClass000.A0g("msgstore/setChatPartiallySeen/nochat/", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x059e, code lost:
        com.whatsapp.util.Log.i(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x05a1, code lost:
        r3 = X.AnonymousClass10W.A01((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x05ae, code lost:
        if (r7.A0O < r4.A14) goto L_0x05b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x05b0, code lost:
        r1 = "msgstore/setChatPartiallySeen/message already seen";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x05b3, code lost:
        r5 = r15.A0I;
        r18 = r5.A00(r3, r4.A14);
        r2 = X.AnonymousClass000.A0r("msgstore/setChatPartiallySeen/");
        r2.append(r3);
        r2.append("/");
        com.whatsapp.util.Log.i(X.AnonymousClass000.A0h(r7.A07(), r2));
        r19 = r5.A01(r3, r4.A14);
        r15.A03(r3, r4, r18 - r19, r19, 0, true, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x05ef, code lost:
        throw new java.lang.SecurityException("Decryption failed - version mismatch");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x05f0, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:?, code lost:
        r3 = new java.lang.SecurityException("Decryption failed", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x05f9, code lost:
        r3 = new java.lang.SecurityException("Message not found");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0600, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0601, code lost:
        r1 = "Bad request - mark_message_read";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:?, code lost:
        r3 = X.AnonymousClass10W.A00(1, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0610, code lost:
        if (r5.equals("start_voip_call") == false) goto L_0x071d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0612, code lost:
        r5 = r7.A0A;
        r9 = r3.getJSONObject("payload").getJSONArray("contact_ids");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0626, code lost:
        if (r9.length() != 0) goto L_0x0633;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0628, code lost:
        com.whatsapp.util.Log.w("requesthandler/handle-start-voip-call request did not include a contact");
        r3 = X.AnonymousClass10W.A00(1, "Bad request - start_voip_call");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0633, code lost:
        r6 = X.C13680ns.A0o();
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x063d, code lost:
        if (r7 >= r9.length()) goto L_0x0675;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x063f, code lost:
        r2 = r9.getString(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0647, code lost:
        if (android.text.TextUtils.isEmpty(r2) == false) goto L_0x0654;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0649, code lost:
        com.whatsapp.util.Log.w("requesthandler/handle-start-voip-call request included an empty contact");
        r3 = X.AnonymousClass10W.A00(1, "Bad request - start_voip_call");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0654, code lost:
        r2 = r5.A07.A00(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x065e, code lost:
        if (r2.A0J() == false) goto L_0x066f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0660, code lost:
        com.whatsapp.util.Log.w("requesthandler/handle-start-voip-call cannot place group calls yet");
        r3 = X.AnonymousClass10W.A00(23, "Group calling is disabled");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x066f, code lost:
        r6.add(r2);
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x067b, code lost:
        if (r5.A06.A0G(false) != false) goto L_0x068c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x067d, code lost:
        com.whatsapp.util.Log.w("requesthandler/handle-start-voip-call insufficient permissions for call");
        r3 = X.AnonymousClass10W.A00(9, "OBWhatsApp requires voice permissions for this operation.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0690, code lost:
        if (r5.A01.A00 != false) goto L_0x0697;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0692, code lost:
        r5.A09.A00(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x0697, code lost:
        r3 = X.C224718b.A00(r5.A02, r5.A04, true);
        r2 = new java.util.concurrent.FutureTask(new X.AnonymousClass586(r5, r3, r6));
        r5.A00.post(r2);
        r2 = ((java.lang.Integer) r2.get()).intValue();
        r3 = r5.A08.A03(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x06be, code lost:
        if (r2 == 0) goto L_0x06ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x06c0, code lost:
        switch(r2) {
            case 2: goto L_0x06c7;
            case 3: goto L_0x06cc;
            case 4: goto L_0x06d1;
            case 5: goto L_0x06d6;
            case 6: goto L_0x06db;
            case 7: goto L_0x06e0;
            case 8: goto L_0x06e5;
            case 9: goto L_0x06e5;
            default: goto L_0x06c3;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x06c3, code lost:
        r2 = 5;
        r1 = "Service internal error! start_voip_call";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x06c7, code lost:
        r2 = 13;
        r1 = "Can't initiate a call when a pending call exists.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x06cc, code lost:
        r2 = 14;
        r1 = "Unable to perform requested operation as terms of service have not been accepted.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x06d1, code lost:
        r2 = 12;
        r1 = "OBWhatsApp needs an internet connection to perform this operation.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x06d6, code lost:
        r2 = 11;
        r1 = "The requested contact is blocked.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x06db, code lost:
        r2 = 15;
        r1 = "Video calling is disabled.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x06e0, code lost:
        r2 = 9;
        r1 = "OBWhatsApp requires voice permissions for this operation.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x06e5, code lost:
        r2 = 10;
        r1 = "Can't initiate a call when already in a call.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x06e9, code lost:
        r3 = X.AnonymousClass10W.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x06ee, code lost:
        r3 = X.AnonymousClass10W.A01(X.C13700nu.A0J().put("call_id", r3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:?, code lost:
        r3 = X.AnonymousClass10W.A00(5, "Service internal error! start_voip_call");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x070b, code lost:
        r3 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x070c, code lost:
        r5.A09.A01(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0712, code lost:
        com.whatsapp.util.Log.w("requesthandler/handle-start-voip-call request included an invalid contact");
        r3 = X.AnonymousClass10W.A00(1, "Bad request - start_voip_call");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x071d, code lost:
        com.whatsapp.util.Log.w(X.C13680ns.A0h("RequestHandler/handleRequest unhandled action = ", r5));
        r3 = X.AnonymousClass10W.A00(1, X.C13680ns.A0h("Bad request - ", r5));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0815, code lost:
        if (r5 != 1598968902) goto L_0x0817;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0153, code lost:
        if (r5.equals(r10) != false) goto L_0x0156;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0156, code lost:
        switch(r12) {
            case -1472535883: goto L_0x015b;
            case -1368724237: goto L_0x016b;
            case -624136624: goto L_0x0212;
            case 628187957: goto L_0x0456;
            case 711383033: goto L_0x04d2;
            case 771140814: goto L_0x050e;
            case 1331833598: goto L_0x052d;
            case 1912051456: goto L_0x053d;
            case 2060915200: goto L_0x0609;
            default: goto L_0x0159;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0161, code lost:
        if (r5.equals("hang_up_call") == false) goto L_0x071d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0163, code lost:
        r3 = r7.A0B.A00(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0171, code lost:
        if (r5.equals("get_unread_messages") == false) goto L_0x071d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0173, code lost:
        r6 = r7.A06;
        r5 = r3.optJSONObject("payload");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x017b, code lost:
        if (r5 != null) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x017d, code lost:
        r5 = X.C13700nu.A0J();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0181, code lost:
        r2 = r5.optLong("time_limit_ms", 86400000);
        r5 = r5.optString("contact_id");
        r7 = X.AnonymousClass000.A0u();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0199, code lost:
        if (android.text.TextUtils.isEmpty(r5) != false) goto L_0x01b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r6.A00(X.C16010sH.A01(r6.A05.A00(r4, r5)), r7, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        com.whatsapp.util.Log.e("requesthandler/get-unread-messages invalid contact ID");
        r2 = 1;
        r1 = "Bad request - send_message";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01b3, code lost:
        r1 = r6.A00;
        r9 = r6.A07;
        r8 = r1.A09(r9).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01c3, code lost:
        if (r8.hasNext() == false) goto L_0x01e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c5, code lost:
        r5 = X.C13700nu.A0B(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01cf, code lost:
        if (r6.A02.A08(r5) == false) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01d5, code lost:
        if (r9.A0Q(r5) != false) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01dd, code lost:
        if (r6.A03.A0G(r5) != false) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01df, code lost:
        r6.A00(r5, r7, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01e3, code lost:
        X.C13690nt.A1P(r7, 19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:?, code lost:
        r5 = new org.json.JSONArray();
        r3 = r7.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01f5, code lost:
        if (r3.hasNext() == false) goto L_0x0207;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01f7, code lost:
        r1 = r6.A06.A02(X.C13680ns.A0V(r3), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0201, code lost:
        if (r1 == null) goto L_0x01f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0203, code lost:
        r5.put(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0207, code lost:
        r3 = X.AnonymousClass10W.A01(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x020d, code lost:
        r2 = 5;
        r1 = "Service internal error! get_unread_messages";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTransact(int r32, android.os.Parcel r33, android.os.Parcel r34, int r35) {
        /*
            r31 = this;
            r0 = 1
            java.lang.String r3 = "com.obwhatsapp.instrumentation.InstrumentationInterface"
            r2 = r31
            r5 = r32
            r4 = r33
            r14 = r34
            if (r5 < r0) goto L_0x0817
            r1 = 16777215(0xffffff, float:2.3509886E-38)
            if (r5 > r1) goto L_0x0812
            r4.enforceInterface(r3)
            if (r5 == r0) goto L_0x0794
            r6 = 2
            if (r5 != r6) goto L_0x0817
            java.lang.String r8 = r4.readString()
            com.obwhatsapp.instrumentation.api.InstrumentationService r2 = r2.A00
            X.0sA r1 = r2.A02
            X.0s3 r4 = r1.A00()
            r4.A00()
            android.os.Binder.clearCallingIdentity()
            X.10n r7 = r2.A00     // Catch:{ Exception -> 0x0784 }
            X.0sC r1 = r7.A0F     // Catch:{ Exception -> 0x0784 }
            boolean r1 = r1.A01()     // Catch:{ Exception -> 0x0784 }
            if (r1 != 0) goto L_0x0044
            java.lang.String r1 = "RequestHandler/request client is not registered"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ Exception -> 0x0784 }
            java.lang.String r2 = "Client is not registered"
            r1 = 7
            java.lang.String r3 = X.AnonymousClass10W.A00(r1, r2)     // Catch:{ Exception -> 0x0784 }
            goto L_0x081e
        L_0x0044:
            X.0s4 r1 = r7.A02     // Catch:{ Exception -> 0x0784 }
            X.0s5 r2 = r1.A00     // Catch:{ Exception -> 0x0784 }
            X.0s8 r1 = X.C15910s6.A11     // Catch:{ Exception -> 0x0784 }
            boolean r1 = r2.A05(r1)     // Catch:{ Exception -> 0x0784 }
            java.lang.String r9 = "Feature is disabled!"
            if (r1 != 0) goto L_0x005e
            java.lang.String r1 = "RequestHandler/request service not enabled"
        L_0x0054:
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ Exception -> 0x0784 }
            r1 = 3
            java.lang.String r3 = X.AnonymousClass10W.A00(r1, r9)     // Catch:{ Exception -> 0x0784 }
            goto L_0x081e
        L_0x005e:
            X.0sK r1 = r7.A00     // Catch:{ Exception -> 0x0784 }
            r1.A0B()     // Catch:{ Exception -> 0x0784 }
            X.1Zb r5 = r1.A01     // Catch:{ Exception -> 0x0784 }
            if (r5 == 0) goto L_0x007d
            X.0sI r3 = r7.A0D     // Catch:{ Exception -> 0x0784 }
            X.0s4 r1 = r3.A02     // Catch:{ Exception -> 0x0784 }
            X.0s5 r2 = r1.A00     // Catch:{ Exception -> 0x0784 }
            X.0tC r1 = X.C15910s6.A1z     // Catch:{ Exception -> 0x0784 }
            int r2 = r2.A02(r1)     // Catch:{ Exception -> 0x0784 }
            r1 = 20
            if (r2 == r1) goto L_0x0080
            boolean r1 = r3.A00(r5)     // Catch:{ Exception -> 0x0784 }
            if (r1 != 0) goto L_0x0080
        L_0x007d:
            java.lang.String r1 = "RequestHandler/request service not enabled for this number"
            goto L_0x0054
        L_0x0080:
            X.0xR r1 = r7.A01     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            boolean r1 = r1.A02()     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            if (r1 != 0) goto L_0x0751
            org.json.JSONObject r3 = X.C13700nu.A0K(r8)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.lang.String r1 = "action"
            java.lang.String r5 = r3.getString(r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.lang.String r11 = "header"
            org.json.JSONObject r2 = r3.getJSONObject(r11)     // Catch:{ JSONException -> 0x0748 }
            java.lang.String r1 = "protocol_version"
            int r1 = r2.getInt(r1)     // Catch:{ JSONException -> 0x0748 }
            if (r1 < r0) goto L_0x0748
            java.lang.String r10 = "get_request_token"
            boolean r1 = r5.equals(r10)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            if (r1 == 0) goto L_0x0110
            X.10T r5 = r7.A0E     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.lang.String r8 = r4.A01     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            monitor-enter(r5)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            X.0sD r7 = r5.A00     // Catch:{ all -> 0x075b }
            java.lang.String r4 = "request/token"
            java.lang.String r2 = X.C15970sD.A00(r8, r4)     // Catch:{ all -> 0x075b }
            android.content.SharedPreferences r1 = r7.A01()     // Catch:{ all -> 0x075b }
            java.lang.String r6 = X.C13700nu.A0E(r1, r2)     // Catch:{ all -> 0x075b }
            if (r6 != 0) goto L_0x00f0
            java.security.SecureRandom r3 = new java.security.SecureRandom     // Catch:{ all -> 0x075b }
            r3.<init>()     // Catch:{ all -> 0x075b }
            r1 = 16
            byte[] r2 = new byte[r1]     // Catch:{ all -> 0x075b }
            r3.nextBytes(r2)     // Catch:{ all -> 0x075b }
            r1 = 11
            java.lang.String r6 = android.util.Base64.encodeToString(r2, r1)     // Catch:{ all -> 0x075b }
            java.lang.String r2 = X.C15970sD.A00(r8, r4)     // Catch:{ all -> 0x075b }
            java.lang.String r1 = "request/token_ts"
            java.lang.String r4 = X.C15970sD.A00(r8, r1)     // Catch:{ all -> 0x075b }
            android.content.SharedPreferences r1 = r7.A01()     // Catch:{ all -> 0x075b }
            android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch:{ all -> 0x075b }
            android.content.SharedPreferences$Editor r3 = r1.putString(r2, r6)     // Catch:{ all -> 0x075b }
            X.0t3 r1 = r7.A01     // Catch:{ all -> 0x075b }
            long r1 = r1.A00()     // Catch:{ all -> 0x075b }
            X.C13680ns.A0x(r3, r4, r1)     // Catch:{ all -> 0x075b }
        L_0x00f0:
            monitor-exit(r5)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            org.json.JSONObject r3 = X.C13700nu.A0J()     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            org.json.JSONObject r2 = X.C13700nu.A0J()     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.lang.String r1 = "request_token"
            r2.put(r1, r6)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.lang.String r1 = "success"
            r3.put(r1, r0)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.lang.String r1 = "result"
            r3.put(r1, r2)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.lang.String r3 = r3.toString()     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            goto L_0x081e
        L_0x0110:
            r8 = 0
            org.json.JSONObject r2 = r3.getJSONObject(r11)     // Catch:{ JSONException -> 0x0740 }
            java.lang.String r1 = "authorization_token"
            java.lang.String r2 = r2.optString(r1, r8)     // Catch:{ JSONException -> 0x0740 }
            if (r2 == 0) goto L_0x0740
            X.10T r1 = r7.A0E     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.lang.String r8 = r4.A01     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            boolean r1 = r1.A00(r8, r2)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            if (r1 == 0) goto L_0x0732
            X.10Q r2 = r7.A07     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            int r12 = r5.hashCode()     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            switch(r12) {
                case 711383033: goto L_0x014a;
                case 771140814: goto L_0x014d;
                case 1673427744: goto L_0x014f;
                default: goto L_0x0130;
            }     // Catch:{ 43f -> 0x0779, all -> 0x075e }
        L_0x0130:
            X.0sD r2 = r2.A00     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.lang.String r1 = "metadata/last_active_time"
            java.lang.String r11 = X.C15970sD.A00(r8, r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            android.content.SharedPreferences r1 = r2.A01()     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            android.content.SharedPreferences$Editor r10 = r1.edit()     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            X.0t3 r1 = r2.A01     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            long r1 = r1.A00()     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            X.C13680ns.A0x(r10, r11, r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            goto L_0x0156
        L_0x014a:
            java.lang.String r10 = "get_call_state"
            goto L_0x014f
        L_0x014d:
            java.lang.String r10 = "access_contacts"
        L_0x014f:
            boolean r1 = r5.equals(r10)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            if (r1 != 0) goto L_0x0156
            goto L_0x0130
        L_0x0156:
            switch(r12) {
                case -1472535883: goto L_0x015b;
                case -1368724237: goto L_0x016b;
                case -624136624: goto L_0x0212;
                case 628187957: goto L_0x0456;
                case 711383033: goto L_0x04d2;
                case 771140814: goto L_0x050e;
                case 1331833598: goto L_0x052d;
                case 1912051456: goto L_0x053d;
                case 2060915200: goto L_0x0609;
                default: goto L_0x0159;
            }     // Catch:{ 43f -> 0x0779, all -> 0x075e }
        L_0x0159:
            goto L_0x071d
        L_0x015b:
            java.lang.String r1 = "hang_up_call"
            boolean r1 = r5.equals(r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            if (r1 == 0) goto L_0x071d
            X.10h r1 = r7.A0B     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.lang.String r3 = r1.A00(r4, r3)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            goto L_0x081e
        L_0x016b:
            java.lang.String r1 = "get_unread_messages"
            boolean r1 = r5.equals(r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            if (r1 == 0) goto L_0x071d
            X.10m r6 = r7.A06     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.lang.String r1 = "payload"
            org.json.JSONObject r5 = r3.optJSONObject(r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            if (r5 != 0) goto L_0x0181
            org.json.JSONObject r5 = X.C13700nu.A0J()     // Catch:{ 43f -> 0x0779, all -> 0x075e }
        L_0x0181:
            java.lang.String r3 = "time_limit_ms"
            r1 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r5.optLong(r3, r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.lang.String r1 = "contact_id"
            java.lang.String r5 = r5.optString(r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.util.ArrayList r7 = X.AnonymousClass000.A0u()     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            boolean r1 = android.text.TextUtils.isEmpty(r5)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            if (r1 != 0) goto L_0x01b3
            X.0sR r1 = r6.A05     // Catch:{ SecurityException -> 0x01a9 }
            X.0sH r1 = r1.A00(r4, r5)     // Catch:{ SecurityException -> 0x01a9 }
            X.0rv r1 = X.C16010sH.A01(r1)     // Catch:{ SecurityException -> 0x01a9 }
            r6.A00(r1, r7, r2)     // Catch:{ SecurityException -> 0x01a9 }
            goto L_0x01e3
        L_0x01a9:
            java.lang.String r1 = "requesthandler/get-unread-messages invalid contact ID"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            r2 = 1
            java.lang.String r1 = "Bad request - send_message"
            goto L_0x0474
        L_0x01b3:
            X.0rs r1 = r6.A00     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            X.0sf r9 = r6.A07     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.util.List r1 = r1.A09(r9)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.util.Iterator r8 = r1.iterator()     // Catch:{ 43f -> 0x0779, all -> 0x075e }
        L_0x01bf:
            boolean r1 = r8.hasNext()     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            if (r1 == 0) goto L_0x01e3
            X.0rv r5 = X.C13700nu.A0B(r8)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            X.0xS r1 = r6.A02     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            boolean r1 = r1.A08(r5)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            if (r1 == 0) goto L_0x01bf
            boolean r1 = r9.A0Q(r5)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            if (r1 != 0) goto L_0x01bf
            X.0rt r1 = r6.A03     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            boolean r1 = r1.A0G(r5)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            if (r1 != 0) goto L_0x01bf
            r6.A00(r5, r7, r2)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            goto L_0x01bf
        L_0x01e3:
            r1 = 19
            X.C13690nt.A1P(r7, r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            org.json.JSONArray r5 = new org.json.JSONArray     // Catch:{ SecurityException -> 0x020d }
            r5.<init>()     // Catch:{ SecurityException -> 0x020d }
            java.util.Iterator r3 = r7.iterator()     // Catch:{ SecurityException -> 0x020d }
        L_0x01f1:
            boolean r1 = r3.hasNext()     // Catch:{ SecurityException -> 0x020d }
            if (r1 == 0) goto L_0x0207
            X.0tZ r2 = X.C13680ns.A0V(r3)     // Catch:{ SecurityException -> 0x020d }
            X.10k r1 = r6.A06     // Catch:{ SecurityException -> 0x020d }
            org.json.JSONObject r1 = r1.A02(r2, r4)     // Catch:{ SecurityException -> 0x020d }
            if (r1 == 0) goto L_0x01f1
            r5.put(r1)     // Catch:{ SecurityException -> 0x020d }
            goto L_0x01f1
        L_0x0207:
            java.lang.String r3 = X.AnonymousClass10W.A01(r5)     // Catch:{ SecurityException -> 0x020d }
            goto L_0x081e
        L_0x020d:
            r2 = 5
            java.lang.String r1 = "Service internal error! get_unread_messages"
            goto L_0x0474
        L_0x0212:
            java.lang.String r1 = "send_message"
            boolean r1 = r5.equals(r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            if (r1 == 0) goto L_0x071d
            X.10a r1 = r7.A09     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.lang.String r8 = "plain_text"
            java.lang.String r2 = "payload"
            org.json.JSONObject r7 = r3.getJSONObject(r2)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.lang.String r2 = "contact_id"
            java.lang.String r3 = r7.getString(r2)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            X.0sR r2 = r1.A08     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            X.0sH r5 = r2.A00(r4, r3)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            X.0rv r2 = X.C16010sH.A01(r5)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            X.0sI r3 = r1.A0B     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            boolean r3 = r3.A01(r2)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            if (r3 != 0) goto L_0x0244
            r1 = 3
            java.lang.String r3 = X.AnonymousClass10W.A00(r1, r9)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            goto L_0x081e
        L_0x0244:
            boolean r3 = r5.A0J()     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            if (r3 == 0) goto L_0x026c
            X.0rv r4 = r5.A0E     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            boolean r3 = r4 instanceof X.C16050sL     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            if (r3 == 0) goto L_0x026c
            com.whatsapp.jid.GroupJid r4 = (com.whatsapp.jid.GroupJid) r4     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            X.0sO r3 = r1.A06     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            boolean r3 = r3.A09(r4)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            if (r3 == 0) goto L_0x0262
            X.0ul r3 = r1.A07     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            boolean r3 = r3.A0g(r5, r4)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            if (r3 == 0) goto L_0x026c
        L_0x0262:
            r2 = 16
            java.lang.String r1 = "You can't send a message to this group"
            java.lang.String r3 = X.AnonymousClass10W.A00(r2, r1)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            goto L_0x081e
        L_0x026c:
            X.01Y r4 = r1.A04     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            com.whatsapp.jid.Jid r3 = X.C16010sH.A03(r5)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            boolean r3 = r4.A0V(r3)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            if (r3 == 0) goto L_0x0284
            r2 = 11
            java.lang.String r1 = "The requested contact is blocked."
            java.lang.String r3 = X.AnonymousClass10W.A00(r2, r1)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            goto L_0x081e
        L_0x0284:
            X.10S r5 = r1.A09     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            X.10R r4 = r5.A02     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            boolean r3 = r4.A02(r2)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            if (r3 != 0) goto L_0x029e
            java.lang.String r1 = "system-messages-handler/new chat initiated"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            r2 = 22
            java.lang.String r1 = "User tries to start a new thread which would produce a system message"
            java.lang.String r3 = X.AnonymousClass10W.A00(r2, r1)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            goto L_0x081e
        L_0x029e:
            boolean r3 = r4.A02(r2)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            if (r3 != 0) goto L_0x02b4
            java.lang.String r1 = "system-messages-handler/new chat initiated"
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
        L_0x02aa:
            r2 = 20
            java.lang.String r1 = "There is a critical unread system message in the thread"
            java.lang.String r3 = X.AnonymousClass10W.A00(r2, r1)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            goto L_0x081e
        L_0x02b4:
            X.0xS r3 = r5.A01     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            boolean r3 = r3.A08(r2)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            if (r3 == 0) goto L_0x033d
            X.0rt r3 = r5.A03     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            long r19 = r3.A04(r2)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            X.0t6 r12 = r5.A04     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            r18 = 100
            r21 = -1
            r23 = 1
            r16 = r12
            r17 = r2
            X.1kc r11 = r16.A0C(r17, r18, r19, r21, r23)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            android.database.Cursor r10 = r11.A00     // Catch:{ all -> 0x0331 }
            if (r10 == 0) goto L_0x033d
            boolean r3 = r10.moveToFirst()     // Catch:{ all -> 0x0331 }
            if (r3 != 0) goto L_0x02dd
            goto L_0x033a
        L_0x02dd:
            X.0tZ r9 = r12.A0G(r10, r2)     // Catch:{ all -> 0x0331 }
            if (r9 == 0) goto L_0x0317
            long r3 = r9.A13     // Catch:{ all -> 0x0331 }
            int r13 = (r3 > r19 ? 1 : (r3 == r19 ? 0 : -1))
            if (r13 == 0) goto L_0x0317
            long r3 = r9.A0I     // Catch:{ all -> 0x0331 }
            X.0t3 r13 = r5.A00     // Catch:{ all -> 0x0331 }
            long r17 = r13.A00()     // Catch:{ all -> 0x0331 }
            r15 = 86400000(0x5265c00, double:4.2687272E-316)
            long r17 = r17 - r15
            int r13 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r13 < 0) goto L_0x0317
            boolean r3 = r9 instanceof X.C38971ri     // Catch:{ all -> 0x0331 }
            if (r3 != 0) goto L_0x032c
            boolean r3 = r9 instanceof X.AnonymousClass1WU     // Catch:{ all -> 0x0331 }
            if (r3 == 0) goto L_0x0317
            X.1WU r9 = (X.AnonymousClass1WU) r9     // Catch:{ all -> 0x0331 }
            int r4 = r9.A00     // Catch:{ all -> 0x0331 }
            boolean r3 = X.C40171tg.A01(r4)     // Catch:{ all -> 0x0331 }
            if (r3 != 0) goto L_0x0326
            r3 = 62
            if (r4 == r3) goto L_0x0326
            r3 = 63
            if (r4 == r3) goto L_0x0326
            switch(r4) {
                case 4: goto L_0x031e;
                case 12: goto L_0x031e;
                case 18: goto L_0x031e;
                case 20: goto L_0x031e;
                case 27: goto L_0x031e;
                case 52: goto L_0x031e;
                case 56: goto L_0x031e;
                case 57: goto L_0x031e;
                case 59: goto L_0x031e;
                case 67: goto L_0x031e;
                case 71: goto L_0x031e;
                case 79: goto L_0x031e;
                case 80: goto L_0x031e;
                case 90: goto L_0x031e;
                case 106: goto L_0x031e;
                default: goto L_0x0317;
            }     // Catch:{ all -> 0x0331 }
        L_0x0317:
            boolean r3 = r10.moveToNext()     // Catch:{ all -> 0x0331 }
            if (r3 != 0) goto L_0x02dd
            goto L_0x033a
        L_0x031e:
            java.lang.String r1 = "system-messages-handler/critical message "
            java.lang.String r1 = X.C13680ns.A0c(r4, r1)     // Catch:{ all -> 0x0331 }
            goto L_0x0329
        L_0x0326:
            java.lang.String r1 = "system-messages-handler/critical message"
        L_0x0329:
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ all -> 0x0331 }
        L_0x032c:
            r10.close()     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            goto L_0x02aa
        L_0x0331:
            r2 = move-exception
            android.database.Cursor r1 = r11.A00     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            if (r1 == 0) goto L_0x0339
            r1.close()     // Catch:{ NullPointerException | SecurityException -> 0x044d }
        L_0x0339:
            throw r2     // Catch:{ NullPointerException | SecurityException -> 0x044d }
        L_0x033a:
            r10.close()     // Catch:{ NullPointerException | SecurityException -> 0x044d }
        L_0x033d:
            java.lang.String r3 = "media_type"
            java.lang.String r5 = r7.optString(r3, r8)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            java.lang.String r3 = "media_uri"
            java.lang.String r9 = r7.optString(r3)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            java.lang.String r3 = "message"
            java.lang.String r20 = r7.optString(r3)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            int r4 = r5.hashCode()     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            r3 = 106642994(0x65b3e32, float:4.1235016E-35)
            if (r4 == r3) goto L_0x03a7
            r3 = 1021751938(0x3ce6b282, float:0.028161291)
            if (r4 != r3) goto L_0x0445
            boolean r3 = r5.equals(r8)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            if (r3 == 0) goto L_0x0445
            boolean r3 = android.text.TextUtils.isEmpty(r20)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            if (r3 == 0) goto L_0x0371
            java.lang.String r1 = "Bad request -  message is empty"
            java.lang.String r3 = X.AnonymousClass10W.A00(r0, r1)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            goto L_0x081e
        L_0x0371:
            X.0tK r3 = r1.A03     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            boolean r3 = r3.A08()     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            if (r3 != 0) goto L_0x0385
            X.0tH r3 = r1.A00     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            boolean r3 = r3.A00     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            if (r3 != 0) goto L_0x0385
            X.10Z r4 = r1.A0A     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            r3 = 0
            r4.A00(r3)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
        L_0x0385:
            X.0tb r3 = r1.A02     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            java.util.List r21 = java.util.Collections.singletonList(r2)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            r17 = 0
            r23 = 0
            r19 = r17
            r22 = r17
            r24 = 0
            r18 = r17
            r16 = r3
            r16.A0A(r17, r18, r19, r20, r21, r22, r23, r24)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            X.10Y r1 = r1.A05     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            r1.A00(r2, r0, r0, r0)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            java.lang.String r3 = X.AnonymousClass10W.A01(r17)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            goto L_0x081e
        L_0x03a7:
            java.lang.String r3 = "photo"
            boolean r3 = r5.equals(r3)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            if (r3 == 0) goto L_0x0445
            java.lang.String r4 = "Service internal error! "
            java.lang.String r3 = "sendmedia/sendimages/share-failed/ "
            boolean r5 = android.text.TextUtils.isEmpty(r9)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            if (r5 == 0) goto L_0x03c2
            java.lang.String r1 = "Bad request -  photo uri is empty"
            java.lang.String r3 = X.AnonymousClass10W.A00(r0, r1)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            goto L_0x081e
        L_0x03c2:
            android.net.Uri r16 = android.net.Uri.parse(r9)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            X.0tK r5 = r1.A03     // Catch:{ IOException -> 0x0424, 20M -> 0x0418, OutOfMemoryError -> 0x040d, SecurityException -> 0x0406 }
            boolean r5 = r5.A08()     // Catch:{ IOException -> 0x0424, 20M -> 0x0418, OutOfMemoryError -> 0x040d, SecurityException -> 0x0406 }
            if (r5 != 0) goto L_0x03da
            X.0tH r5 = r1.A00     // Catch:{ IOException -> 0x0424, 20M -> 0x0418, OutOfMemoryError -> 0x040d, SecurityException -> 0x0406 }
            boolean r5 = r5.A00     // Catch:{ IOException -> 0x0424, 20M -> 0x0418, OutOfMemoryError -> 0x040d, SecurityException -> 0x0406 }
            if (r5 != 0) goto L_0x03da
            X.10Z r6 = r1.A0A     // Catch:{ IOException -> 0x0424, 20M -> 0x0418, OutOfMemoryError -> 0x040d, SecurityException -> 0x0406 }
            r5 = 0
            r6.A00(r5)     // Catch:{ IOException -> 0x0424, 20M -> 0x0418, OutOfMemoryError -> 0x040d, SecurityException -> 0x0406 }
        L_0x03da:
            X.10X r15 = r1.A01     // Catch:{ IOException -> 0x0424, 20M -> 0x0418, OutOfMemoryError -> 0x040d, SecurityException -> 0x0406 }
            java.util.List r21 = java.util.Collections.singletonList(r2)     // Catch:{ IOException -> 0x0424, 20M -> 0x0418, OutOfMemoryError -> 0x040d, SecurityException -> 0x0406 }
            r17 = 0
            r24 = 0
            r19 = r17
            r22 = r17
            r23 = r17
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r18 = r17
            r15.A02(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ IOException -> 0x0424, 20M -> 0x0418, OutOfMemoryError -> 0x040d, SecurityException -> 0x0406 }
            X.10Y r1 = r1.A05     // Catch:{ IOException -> 0x0424, 20M -> 0x0418, OutOfMemoryError -> 0x040d, SecurityException -> 0x0406 }
            r1.A00(r2, r0, r0, r0)     // Catch:{ IOException -> 0x0424, 20M -> 0x0418, OutOfMemoryError -> 0x040d, SecurityException -> 0x0406 }
            java.lang.String r3 = X.AnonymousClass10W.A01(r17)     // Catch:{ IOException -> 0x0424, 20M -> 0x0418, OutOfMemoryError -> 0x040d, SecurityException -> 0x0406 }
            goto L_0x081e
        L_0x0406:
            r1 = move-exception
            com.whatsapp.util.Log.e(r3, r1)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            java.lang.String r1 = "Bad request -  URI inaccessible"
            goto L_0x041e
        L_0x040d:
            r1 = move-exception
            com.whatsapp.util.Log.e(r3, r1)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            r1 = 5
            java.lang.String r3 = X.AnonymousClass10W.A00(r1, r4)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            goto L_0x081e
        L_0x0418:
            r1 = move-exception
            com.whatsapp.util.Log.e(r3, r1)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            java.lang.String r1 = "Bad request -  file not an image"
        L_0x041e:
            java.lang.String r3 = X.AnonymousClass10W.A00(r0, r1)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            goto L_0x081e
        L_0x0424:
            r5 = move-exception
            r2 = 5
            com.whatsapp.util.Log.e(r3, r5)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            java.lang.String r1 = r5.getMessage()     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            if (r1 == 0) goto L_0x043f
            boolean r1 = X.C13690nt.A1T(r5)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            if (r1 == 0) goto L_0x043f
            r2 = 19
            java.lang.String r1 = "Device doesn't have enough free space"
            java.lang.String r3 = X.AnonymousClass10W.A00(r2, r1)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            goto L_0x081e
        L_0x043f:
            java.lang.String r3 = X.AnonymousClass10W.A00(r2, r4)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            goto L_0x081e
        L_0x0445:
            java.lang.String r1 = "Request is not implemented yet!"
            java.lang.String r3 = X.AnonymousClass10W.A00(r6, r1)     // Catch:{ NullPointerException | SecurityException -> 0x044d }
            goto L_0x081e
        L_0x044d:
            java.lang.String r1 = "requesthandler/send-message invalid contact ID"
            com.whatsapp.util.Log.e((java.lang.String) r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.lang.String r1 = "Bad request - send_message"
            goto L_0x0603
        L_0x0456:
            java.lang.String r1 = "accept_call"
            boolean r1 = r5.equals(r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            if (r1 == 0) goto L_0x071d
            X.10V r6 = r7.A03     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.lang.String r1 = "payload"
            org.json.JSONObject r2 = r3.getJSONObject(r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            com.whatsapp.voipcalling.CallState r1 = com.whatsapp.voipcalling.Voip.getCurrentCallState()     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            boolean r1 = com.whatsapp.voipcalling.Voip.A09(r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            if (r1 != 0) goto L_0x047a
            r2 = 18
            java.lang.String r1 = "There is no incoming call"
        L_0x0474:
            java.lang.String r3 = X.AnonymousClass10W.A00(r2, r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            goto L_0x081e
        L_0x047a:
            java.lang.String r1 = "call_id"
            java.lang.String r2 = r2.getString(r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            X.10U r1 = r6.A03     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.lang.String r5 = r1.A02(r4, r2)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            com.whatsapp.voipcalling.CallInfo r3 = com.whatsapp.voipcalling.Voip.getCallInfo()     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            if (r3 == 0) goto L_0x04b0
            java.lang.String r1 = r3.callId     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            boolean r1 = r5.equals(r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            if (r1 == 0) goto L_0x04b0
            boolean r1 = r3.isGroupCall     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            if (r1 != 0) goto L_0x04ab
            boolean r1 = r3.isJoinableGroupCall     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            if (r1 != 0) goto L_0x04ab
            X.0sj r2 = r6.A02     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            boolean r1 = r3.videoEnabled     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            boolean r1 = r2.A0G(r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            if (r1 != 0) goto L_0x04b5
            r2 = 9
            java.lang.String r1 = "OBWhatsApp requires voice permissions for this operation."
            goto L_0x0474
        L_0x04ab:
            r2 = 23
            java.lang.String r1 = "Group calling is disabled"
            goto L_0x0474
        L_0x04b0:
            r2 = 17
            java.lang.String r1 = "There is no call with that call id"
            goto L_0x0474
        L_0x04b5:
            X.0tz r1 = r6.A01     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            android.content.Context r4 = r1.A00     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            X.0tH r1 = r6.A00     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            boolean r1 = r1.A00     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            r3 = r1 ^ 1
            X.0ph r2 = X.C14750ph.A0q()     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            r1 = 3
            android.content.Intent r1 = r2.A11(r4, r5, r1, r3)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            r4.startActivity(r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            r1 = 0
            java.lang.String r3 = X.AnonymousClass10W.A01(r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            goto L_0x081e
        L_0x04d2:
            java.lang.String r1 = "get_call_state"
            boolean r1 = r5.equals(r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            if (r1 == 0) goto L_0x071d
            X.10b r8 = r7.A05     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            X.01J r1 = r8.A06     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.lang.Object r7 = r1.get()     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            com.whatsapp.voipcalling.CallState r7 = (com.whatsapp.voipcalling.CallState) r7     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            X.01J r1 = r8.A05     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.lang.Object r6 = r1.get()     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            com.whatsapp.voipcalling.CallInfo r6 = (com.whatsapp.voipcalling.CallInfo) r6     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            X.0sK r15 = r8.A00     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            X.0sG r5 = r8.A01     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            X.0sP r3 = r8.A02     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            X.10U r2 = r8.A04     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            X.0sR r1 = r8.A03     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            r16 = r5
            r17 = r3
            r18 = r1
            r19 = r2
            r20 = r4
            r21 = r6
            r22 = r7
            org.json.JSONObject r1 = X.C204210b.A03(r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.lang.String r3 = X.AnonymousClass10W.A01(r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            goto L_0x081e
        L_0x050e:
            java.lang.String r1 = "access_contacts"
            boolean r1 = r5.equals(r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            if (r1 == 0) goto L_0x071d
            X.10f r3 = r7.A04     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.util.ArrayList r2 = X.AnonymousClass000.A0u()     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            android.net.Uri r1 = X.C48452Nj.A00     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            r2.add(r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            X.10e r1 = r3.A00     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            r1.A01(r8, r2)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            r1 = 0
            java.lang.String r3 = X.AnonymousClass10W.A01(r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            goto L_0x081e
        L_0x052d:
            java.lang.String r1 = "reject_call"
            boolean r1 = r5.equals(r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            if (r1 == 0) goto L_0x071d
            X.10h r1 = r7.A0C     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.lang.String r3 = r1.A00(r4, r3)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            goto L_0x081e
        L_0x053d:
            java.lang.String r1 = "mark_message_read"
            boolean r1 = r5.equals(r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            if (r1 == 0) goto L_0x071d
            X.10j r5 = r7.A08     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.lang.String r1 = "payload"
            org.json.JSONObject r2 = r3.getJSONObject(r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.lang.String r1 = "message_id"
            java.lang.String r2 = r2.getString(r1)     // Catch:{ SecurityException -> 0x0601 }
            X.10i r7 = r5.A01     // Catch:{ SecurityException -> 0x0601 }
            X.10U r1 = r7.A01     // Catch:{ SecurityException -> 0x0601 }
            java.lang.String r1 = r1.A02(r4, r2)     // Catch:{ SecurityException -> 0x0601 }
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ 1W4 | JSONException -> 0x05f0 }
            r2.<init>(r1)     // Catch:{ 1W4 | JSONException -> 0x05f0 }
            r1 = 0
            int r1 = r2.getInt(r1)     // Catch:{ 1W4 | JSONException -> 0x05f0 }
            if (r1 != r0) goto L_0x05e8
            java.lang.String r4 = r2.getString(r0)     // Catch:{ 1W4 | JSONException -> 0x05f0 }
            boolean r3 = r2.getBoolean(r6)     // Catch:{ 1W4 | JSONException -> 0x05f0 }
            r1 = 3
            java.lang.String r1 = r2.getString(r1)     // Catch:{ 1W4 | JSONException -> 0x05f0 }
            X.0rv r1 = X.C15830rv.A01(r1)     // Catch:{ 1W4 | JSONException -> 0x05f0 }
            X.1Vw r2 = new X.1Vw     // Catch:{ 1W4 | JSONException -> 0x05f0 }
            r2.<init>(r1, r4, r3)     // Catch:{ 1W4 | JSONException -> 0x05f0 }
            X.0t6 r1 = r7.A00     // Catch:{ SecurityException -> 0x0601 }
            X.0tZ r4 = X.C16460t6.A00(r1, r2)     // Catch:{ SecurityException -> 0x0601 }
            if (r4 == 0) goto L_0x05f9
            X.1Vw r1 = r4.A11     // Catch:{ SecurityException -> 0x0601 }
            X.0rv r3 = r1.A00     // Catch:{ SecurityException -> 0x0601 }
            X.AnonymousClass00B.A06(r3)     // Catch:{ SecurityException -> 0x0601 }
            X.0xS r15 = r5.A00     // Catch:{ SecurityException -> 0x0601 }
            r20 = 0
            X.0rt r1 = r15.A0A     // Catch:{ SecurityException -> 0x0601 }
            X.0rx r7 = r1.A06(r3)     // Catch:{ SecurityException -> 0x0601 }
            if (r7 != 0) goto L_0x05a8
            java.lang.String r1 = "msgstore/setChatPartiallySeen/nochat/"
            java.lang.String r1 = X.AnonymousClass000.A0g(r1, r3)     // Catch:{ SecurityException -> 0x0601 }
        L_0x059e:
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ SecurityException -> 0x0601 }
        L_0x05a1:
            r1 = 0
            java.lang.String r3 = X.AnonymousClass10W.A01(r1)     // Catch:{ SecurityException -> 0x0601 }
            goto L_0x081e
        L_0x05a8:
            long r5 = r7.A0O     // Catch:{ SecurityException -> 0x0601 }
            long r1 = r4.A14     // Catch:{ SecurityException -> 0x0601 }
            int r8 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r8 < 0) goto L_0x05b3
            java.lang.String r1 = "msgstore/setChatPartiallySeen/message already seen"
            goto L_0x059e
        L_0x05b3:
            X.15B r5 = r15.A0I     // Catch:{ SecurityException -> 0x0601 }
            long r1 = r4.A14     // Catch:{ SecurityException -> 0x0601 }
            int r18 = r5.A00(r3, r1)     // Catch:{ SecurityException -> 0x0601 }
            java.lang.String r1 = "msgstore/setChatPartiallySeen/"
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r1)     // Catch:{ SecurityException -> 0x0601 }
            r2.append(r3)     // Catch:{ SecurityException -> 0x0601 }
            java.lang.String r1 = "/"
            r2.append(r1)     // Catch:{ SecurityException -> 0x0601 }
            java.lang.String r1 = r7.A07()     // Catch:{ SecurityException -> 0x0601 }
            java.lang.String r1 = X.AnonymousClass000.A0h(r1, r2)     // Catch:{ SecurityException -> 0x0601 }
            com.whatsapp.util.Log.i((java.lang.String) r1)     // Catch:{ SecurityException -> 0x0601 }
            long r1 = r4.A14     // Catch:{ SecurityException -> 0x0601 }
            int r19 = r5.A01(r3, r1)     // Catch:{ SecurityException -> 0x0601 }
            int r18 = r18 - r19
            r22 = 0
            r21 = 1
            r16 = r3
            r17 = r4
            r15.A03(r16, r17, r18, r19, r20, r21, r22)     // Catch:{ SecurityException -> 0x0601 }
            goto L_0x05a1
        L_0x05e8:
            java.lang.String r2 = "Decryption failed - version mismatch"
            java.lang.SecurityException r1 = new java.lang.SecurityException     // Catch:{ 1W4 | JSONException -> 0x05f0 }
            r1.<init>(r2)     // Catch:{ 1W4 | JSONException -> 0x05f0 }
            throw r1     // Catch:{ 1W4 | JSONException -> 0x05f0 }
        L_0x05f0:
            r2 = move-exception
            java.lang.String r1 = "Decryption failed"
            java.lang.SecurityException r3 = new java.lang.SecurityException     // Catch:{ SecurityException -> 0x0601 }
            r3.<init>(r1, r2)     // Catch:{ SecurityException -> 0x0601 }
            goto L_0x0600
        L_0x05f9:
            java.lang.String r1 = "Message not found"
            java.lang.SecurityException r3 = new java.lang.SecurityException     // Catch:{ SecurityException -> 0x0601 }
            r3.<init>(r1)     // Catch:{ SecurityException -> 0x0601 }
        L_0x0600:
            throw r3     // Catch:{ SecurityException -> 0x0601 }
        L_0x0601:
            java.lang.String r1 = "Bad request - mark_message_read"
        L_0x0603:
            java.lang.String r3 = X.AnonymousClass10W.A00(r0, r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            goto L_0x081e
        L_0x0609:
            java.lang.String r1 = "start_voip_call"
            boolean r1 = r5.equals(r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            if (r1 == 0) goto L_0x071d
            X.10d r5 = r7.A0A     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.lang.String r1 = "payload"
            org.json.JSONObject r2 = r3.getJSONObject(r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.lang.String r1 = "contact_ids"
            org.json.JSONArray r9 = r2.getJSONArray(r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            int r1 = r9.length()     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.lang.String r3 = "Bad request - start_voip_call"
            if (r1 != 0) goto L_0x0633
            java.lang.String r1 = "requesthandler/handle-start-voip-call request did not include a contact"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.lang.String r3 = X.AnonymousClass10W.A00(r0, r3)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            goto L_0x081e
        L_0x0633:
            java.util.HashSet r6 = X.C13680ns.A0o()     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            r8 = 0
            r7 = 0
        L_0x0639:
            int r1 = r9.length()     // Catch:{ SecurityException -> 0x0712 }
            if (r7 >= r1) goto L_0x0675
            java.lang.String r2 = r9.getString(r7)     // Catch:{ SecurityException -> 0x0712 }
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch:{ SecurityException -> 0x0712 }
            if (r1 == 0) goto L_0x0654
            java.lang.String r1 = "requesthandler/handle-start-voip-call request included an empty contact"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ SecurityException -> 0x0712 }
            java.lang.String r3 = X.AnonymousClass10W.A00(r0, r3)     // Catch:{ SecurityException -> 0x0712 }
            goto L_0x081e
        L_0x0654:
            X.0sR r1 = r5.A07     // Catch:{ SecurityException -> 0x0712 }
            X.0sH r2 = r1.A00(r4, r2)     // Catch:{ SecurityException -> 0x0712 }
            boolean r1 = r2.A0J()     // Catch:{ SecurityException -> 0x0712 }
            if (r1 == 0) goto L_0x066f
            java.lang.String r1 = "requesthandler/handle-start-voip-call cannot place group calls yet"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ SecurityException -> 0x0712 }
            r2 = 23
            java.lang.String r1 = "Group calling is disabled"
            java.lang.String r3 = X.AnonymousClass10W.A00(r2, r1)     // Catch:{ SecurityException -> 0x0712 }
            goto L_0x081e
        L_0x066f:
            r6.add(r2)     // Catch:{ SecurityException -> 0x0712 }
            int r7 = r7 + 1
            goto L_0x0639
        L_0x0675:
            X.0sj r1 = r5.A06     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            boolean r1 = r1.A0G(r8)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            if (r1 != 0) goto L_0x068c
            java.lang.String r1 = "requesthandler/handle-start-voip-call insufficient permissions for call"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            r2 = 9
            java.lang.String r1 = "OBWhatsApp requires voice permissions for this operation."
            java.lang.String r3 = X.AnonymousClass10W.A00(r2, r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            goto L_0x081e
        L_0x068c:
            X.0tH r1 = r5.A01     // Catch:{ InterruptedException | ExecutionException -> 0x06fd }
            boolean r1 = r1.A00     // Catch:{ InterruptedException | ExecutionException -> 0x06fd }
            if (r1 != 0) goto L_0x0697
            X.10Z r1 = r5.A09     // Catch:{ InterruptedException | ExecutionException -> 0x06fd }
            r1.A00(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x06fd }
        L_0x0697:
            X.0t3 r2 = r5.A04     // Catch:{ InterruptedException | ExecutionException -> 0x06fd }
            X.0sK r1 = r5.A02     // Catch:{ InterruptedException | ExecutionException -> 0x06fd }
            java.lang.String r3 = X.C224718b.A00(r1, r2, r0)     // Catch:{ InterruptedException | ExecutionException -> 0x06fd }
            X.586 r1 = new X.586     // Catch:{ InterruptedException | ExecutionException -> 0x06fd }
            r1.<init>(r5, r3, r6)     // Catch:{ InterruptedException | ExecutionException -> 0x06fd }
            java.util.concurrent.FutureTask r2 = new java.util.concurrent.FutureTask     // Catch:{ InterruptedException | ExecutionException -> 0x06fd }
            r2.<init>(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x06fd }
            android.os.Handler r1 = r5.A00     // Catch:{ InterruptedException | ExecutionException -> 0x06fd }
            r1.post(r2)     // Catch:{ InterruptedException | ExecutionException -> 0x06fd }
            java.lang.Object r1 = r2.get()     // Catch:{ InterruptedException | ExecutionException -> 0x06fd }
            java.lang.Integer r1 = (java.lang.Integer) r1     // Catch:{ InterruptedException | ExecutionException -> 0x06fd }
            int r2 = r1.intValue()     // Catch:{ InterruptedException | ExecutionException -> 0x06fd }
            X.10U r1 = r5.A08     // Catch:{ InterruptedException | ExecutionException -> 0x06fd }
            java.lang.String r3 = r1.A03(r4, r3)     // Catch:{ InterruptedException | ExecutionException -> 0x06fd }
            if (r2 == 0) goto L_0x06ee
            switch(r2) {
                case 2: goto L_0x06c7;
                case 3: goto L_0x06cc;
                case 4: goto L_0x06d1;
                case 5: goto L_0x06d6;
                case 6: goto L_0x06db;
                case 7: goto L_0x06e0;
                case 8: goto L_0x06e5;
                case 9: goto L_0x06e5;
                default: goto L_0x06c3;
            }     // Catch:{ InterruptedException | ExecutionException -> 0x06fd }
        L_0x06c3:
            r2 = 5
            java.lang.String r1 = "Service internal error! start_voip_call"
            goto L_0x06e9
        L_0x06c7:
            r2 = 13
            java.lang.String r1 = "Can't initiate a call when a pending call exists."
            goto L_0x06e9
        L_0x06cc:
            r2 = 14
            java.lang.String r1 = "Unable to perform requested operation as terms of service have not been accepted."
            goto L_0x06e9
        L_0x06d1:
            r2 = 12
            java.lang.String r1 = "OBWhatsApp needs an internet connection to perform this operation."
            goto L_0x06e9
        L_0x06d6:
            r2 = 11
            java.lang.String r1 = "The requested contact is blocked."
            goto L_0x06e9
        L_0x06db:
            r2 = 15
            java.lang.String r1 = "Video calling is disabled."
            goto L_0x06e9
        L_0x06e0:
            r2 = 9
            java.lang.String r1 = "OBWhatsApp requires voice permissions for this operation."
            goto L_0x06e9
        L_0x06e5:
            r2 = 10
            java.lang.String r1 = "Can't initiate a call when already in a call."
        L_0x06e9:
            java.lang.String r3 = X.AnonymousClass10W.A00(r2, r1)     // Catch:{ InterruptedException | ExecutionException -> 0x06fd }
            goto L_0x0704
        L_0x06ee:
            org.json.JSONObject r2 = X.C13700nu.A0J()     // Catch:{ InterruptedException | ExecutionException -> 0x06fd }
            java.lang.String r1 = "call_id"
            org.json.JSONObject r1 = r2.put(r1, r3)     // Catch:{ InterruptedException | ExecutionException -> 0x06fd }
            java.lang.String r3 = X.AnonymousClass10W.A01(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x06fd }
            goto L_0x0704
        L_0x06fd:
            r2 = 5
            java.lang.String r1 = "Service internal error! start_voip_call"
            java.lang.String r3 = X.AnonymousClass10W.A00(r2, r1)     // Catch:{ all -> 0x070b }
        L_0x0704:
            X.10Z r1 = r5.A09     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            r1.A01(r0)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            goto L_0x081e
        L_0x070b:
            r3 = move-exception
            X.10Z r1 = r5.A09     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            r1.A01(r0)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            goto L_0x075d
        L_0x0712:
            java.lang.String r1 = "requesthandler/handle-start-voip-call request included an invalid contact"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.lang.String r3 = X.AnonymousClass10W.A00(r0, r3)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            goto L_0x081e
        L_0x071d:
            java.lang.String r1 = "RequestHandler/handleRequest unhandled action = "
            java.lang.String r1 = X.C13680ns.A0h(r1, r5)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.lang.String r1 = "Bad request - "
            java.lang.String r1 = X.C13680ns.A0h(r1, r5)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            java.lang.String r3 = X.AnonymousClass10W.A00(r0, r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            goto L_0x081e
        L_0x0732:
            java.lang.String r1 = "RequestHandler/request invalid authorization token"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            r2 = 4
            java.lang.String r1 = "Request is not authorized!"
            X.43f r3 = new X.43f     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            r3.<init>(r2, r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            goto L_0x075d
        L_0x0740:
            java.lang.String r1 = "Authorization token is missing."
            X.43f r3 = new X.43f     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            r3.<init>(r0, r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            goto L_0x075d
        L_0x0748:
            r2 = 6
            java.lang.String r1 = "This protocol version is no longer supported."
            X.43f r3 = new X.43f     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            r3.<init>(r2, r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            goto L_0x075d
        L_0x0751:
            r2 = 21
            java.lang.String r1 = "This version of WhatsApp is no longer supported. Please download the latest version"
            X.43f r3 = new X.43f     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            r3.<init>(r2, r1)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
            goto L_0x075d
        L_0x075b:
            r3 = move-exception
            monitor-exit(r5)     // Catch:{ 43f -> 0x0779, all -> 0x075e }
        L_0x075d:
            throw r3     // Catch:{ 43f -> 0x0779, all -> 0x075e }
        L_0x075e:
            r3 = move-exception
            java.lang.String r1 = "RequestHandler/handleRequest caught exception handling request"
            com.whatsapp.util.Log.w(r1, r3)     // Catch:{ Exception -> 0x0784 }
            java.lang.String r1 = "Service internal error! "
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0r(r1)     // Catch:{ Exception -> 0x0784 }
            java.lang.String r1 = r3.getMessage()     // Catch:{ Exception -> 0x0784 }
            java.lang.String r2 = X.AnonymousClass000.A0h(r1, r2)     // Catch:{ Exception -> 0x0784 }
            r1 = 5
            java.lang.String r3 = X.AnonymousClass10W.A00(r1, r2)     // Catch:{ Exception -> 0x0784 }
            goto L_0x081e
        L_0x0779:
            r1 = move-exception
            int r2 = r1.errorCode     // Catch:{ Exception -> 0x0784 }
            java.lang.String r1 = r1.message     // Catch:{ Exception -> 0x0784 }
            java.lang.String r3 = X.AnonymousClass10W.A00(r2, r1)     // Catch:{ Exception -> 0x0784 }
            goto L_0x081e
        L_0x0784:
            r1 = move-exception
            java.lang.String r0 = "InstrumentationService/request error"
            com.whatsapp.util.Log.w(r0, r1)
            java.lang.String r1 = r1.getMessage()
            android.os.RemoteException r0 = new android.os.RemoteException
            r0.<init>(r1)
            throw r0
        L_0x0794:
            com.obwhatsapp.instrumentation.api.InstrumentationService r2 = r2.A00
            X.0sA r1 = r2.A02
            X.0s3 r1 = r1.A00()
            r1.A00()
            android.os.Binder.clearCallingIdentity()
            X.10o r6 = r2.A01     // Catch:{ Exception -> 0x0802 }
            X.0sK r1 = r6.A00     // Catch:{ JSONException -> 0x07f9 }
            r1.A0B()     // Catch:{ JSONException -> 0x07f9 }
            X.1Zb r4 = r1.A01     // Catch:{ JSONException -> 0x07f9 }
            if (r4 == 0) goto L_0x07c3
            X.0sI r3 = r6.A02     // Catch:{ JSONException -> 0x07f9 }
            X.0s4 r1 = r3.A02     // Catch:{ JSONException -> 0x07f9 }
            X.0s5 r2 = r1.A00     // Catch:{ JSONException -> 0x07f9 }
            X.0tC r1 = X.C15910s6.A1z     // Catch:{ JSONException -> 0x07f9 }
            int r2 = r2.A02(r1)     // Catch:{ JSONException -> 0x07f9 }
            r1 = 20
            if (r2 == r1) goto L_0x07d0
            boolean r1 = r3.A00(r4)     // Catch:{ JSONException -> 0x07f9 }
            if (r1 != 0) goto L_0x07d0
        L_0x07c3:
            java.lang.String r1 = "ServiceState/get-service-state service not enabled for this number"
            com.whatsapp.util.Log.w((java.lang.String) r1)     // Catch:{ JSONException -> 0x07f9 }
            r2 = 3
            java.lang.String r1 = "Feature is disabled!"
            java.lang.String r3 = X.AnonymousClass10W.A00(r2, r1)     // Catch:{ JSONException -> 0x07f9 }
            goto L_0x081e
        L_0x07d0:
            X.0sC r1 = r6.A03     // Catch:{ JSONException -> 0x07f9 }
            boolean r5 = r1.A01()     // Catch:{ JSONException -> 0x07f9 }
            org.json.JSONObject r4 = X.C13700nu.A0J()     // Catch:{ JSONException -> 0x07f9 }
            java.lang.String r1 = "version"
            r4.put(r1, r0)     // Catch:{ JSONException -> 0x07f9 }
            java.lang.String r3 = "enabled"
            X.0s4 r1 = r6.A01     // Catch:{ JSONException -> 0x07f9 }
            X.0s5 r2 = r1.A00     // Catch:{ JSONException -> 0x07f9 }
            X.0s8 r1 = X.C15910s6.A11     // Catch:{ JSONException -> 0x07f9 }
            boolean r1 = r2.A05(r1)     // Catch:{ JSONException -> 0x07f9 }
            r4.put(r3, r1)     // Catch:{ JSONException -> 0x07f9 }
            java.lang.String r1 = "registered"
            r4.put(r1, r5)     // Catch:{ JSONException -> 0x07f9 }
            java.lang.String r3 = r4.toString()     // Catch:{ JSONException -> 0x07f9 }
            goto L_0x081e
        L_0x07f9:
            r2 = move-exception
            java.lang.String r1 = "Service internal error! "
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0802 }
            r0.<init>(r1, r2)     // Catch:{ Exception -> 0x0802 }
            throw r0     // Catch:{ Exception -> 0x0802 }
        L_0x0802:
            r1 = move-exception
            java.lang.String r0 = "InstrumentationService/getState error"
            com.whatsapp.util.Log.w(r0, r1)
            java.lang.String r1 = r1.getMessage()
            android.os.RemoteException r0 = new android.os.RemoteException
            r0.<init>(r1)
            throw r0
        L_0x0812:
            r1 = 1598968902(0x5f4e5446, float:1.4867585E19)
            if (r5 == r1) goto L_0x0821
        L_0x0817:
            r0 = r35
            boolean r0 = super.onTransact(r5, r4, r14, r0)
            return r0
        L_0x081e:
            r14.writeNoException()
        L_0x0821:
            r14.writeString(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56382nY.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
