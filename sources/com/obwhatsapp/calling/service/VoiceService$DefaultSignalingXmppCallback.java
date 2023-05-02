package com.obwhatsapp.calling.service;

import X.AnonymousClass00B;
import X.AnonymousClass1CM;
import X.AnonymousClass1SI;
import X.AnonymousClass4KJ;
import X.AnonymousClass565;
import X.C16040sK;
import X.C16440t3;
import X.C16620tM;
import X.C224718b;
import X.C447225g;
import X.C51742cC;
import X.C613638p;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.jid.Jid;
import com.whatsapp.protocol.VoipStanzaChildNode;
import com.whatsapp.voipcalling.SignalingXmppCallback;
import com.whatsapp.voipcalling.Voip;
import java.util.LinkedHashMap;

public class VoiceService$DefaultSignalingXmppCallback implements SignalingXmppCallback {
    public final AnonymousClass1SI callSendMethods;
    public final C16040sK meManager;
    public final C447225g service;
    public final C16440t3 time;

    public VoiceService$DefaultSignalingXmppCallback(C447225g r1, C16440t3 r2, C16040sK r3, AnonymousClass1SI r4) {
        this.service = r1;
        this.time = r2;
        this.meManager = r3;
        this.callSendMethods = r4;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0046, code lost:
        r2 = com.whatsapp.jid.DeviceJid.of(r2.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004c, code lost:
        if (r2 == null) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        r0 = X.C32601gl.A01(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0052, code lost:
        if (r0 != null) goto L_0x005a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0054, code lost:
        r0 = "VoiceService:sendReKeyFanoutStanza:invalid enc node";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        r0 = r0.getDataCopy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (r0 != null) goto L_0x0063;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        r0 = "VoiceService:sendReKeyFanoutStanza:e2e key is empty";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        r10.put(r2, r0);
        r4.A2l.put(r2, (byte) 0);
        r6 = r6 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void lambda$sendCallStanza$0(com.whatsapp.jid.Jid r18, java.lang.String r19, java.lang.String r20, com.whatsapp.protocol.VoipStanzaChildNode r21) {
        /*
            r17 = this;
            r7 = r18
            boolean r1 = r7 instanceof X.C34951l8
            r0 = r17
            X.25g r4 = r0.service
            r3 = r20
            r9 = r21
            r5 = r19
            if (r1 == 0) goto L_0x009c
            X.AnonymousClass00B.A06(r7)
            com.whatsapp.protocol.VoipStanzaChildNode r1 = X.C32601gl.A00(r9)
            if (r1 == 0) goto L_0x0099
            com.whatsapp.protocol.VoipStanzaChildNode[] r0 = r1.getChildrenCopy()
            if (r0 == 0) goto L_0x0099
            java.util.HashMap r10 = X.AnonymousClass000.A0x()
            com.whatsapp.protocol.VoipStanzaChildNode[] r11 = r1.getChildrenCopy()
            int r8 = r11.length
            r16 = 0
            r6 = 0
        L_0x002b:
            if (r6 >= r8) goto L_0x0078
            r15 = r11[r6]
            X.1lL[] r14 = r15.getAttributesCopy()
            X.AnonymousClass00B.A06(r14)
            int r13 = r14.length
            r12 = 0
        L_0x0038:
            if (r12 >= r13) goto L_0x0075
            r2 = r14[r12]
            java.lang.String r1 = r2.A02
            java.lang.String r0 = "jid"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0072
            com.whatsapp.jid.Jid r0 = r2.A01
            com.whatsapp.jid.DeviceJid r2 = com.whatsapp.jid.DeviceJid.of(r0)
            if (r2 == 0) goto L_0x0075
            com.whatsapp.protocol.VoipStanzaChildNode r0 = X.C32601gl.A01(r15)
            if (r0 != 0) goto L_0x005a
            java.lang.String r0 = "VoiceService:sendReKeyFanoutStanza:invalid enc node"
        L_0x0056:
            X.AnonymousClass00B.A08(r0)
        L_0x0059:
            return
        L_0x005a:
            byte[] r0 = r0.getDataCopy()
            if (r0 != 0) goto L_0x0063
            java.lang.String r0 = "VoiceService:sendReKeyFanoutStanza:e2e key is empty"
            goto L_0x0056
        L_0x0063:
            r10.put(r2, r0)
            java.util.Map r1 = r4.A2l
            java.lang.Byte r0 = java.lang.Byte.valueOf(r16)
            r1.put(r2, r0)
            int r6 = r6 + 1
            goto L_0x002b
        L_0x0072:
            int r12 = r12 + 1
            goto L_0x0038
        L_0x0075:
            java.lang.String r0 = "VoiceService:sendReKeyFanoutStanza:no device jid"
            goto L_0x0056
        L_0x0078:
            r0 = 1
            java.util.Map r6 = r4.A0F(r10, r0, r0)
            if (r6 == 0) goto L_0x0059
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0059
            java.util.Iterator r2 = X.C13700nu.A0I(r6)
        L_0x0089:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0132
            java.lang.Object r1 = r2.next()
            java.util.Map r0 = r4.A2l
            r0.remove(r1)
            goto L_0x0089
        L_0x0099:
            java.lang.String r0 = "VoiceService:sendReKeyFanoutStanza:bad message format"
            goto L_0x0056
        L_0x009c:
            com.whatsapp.jid.DeviceJid r2 = com.whatsapp.jid.DeviceJid.of(r7)
            X.AnonymousClass00B.A06(r2)
            com.whatsapp.protocol.VoipStanzaChildNode r0 = X.C32601gl.A01(r9)
            if (r0 != 0) goto L_0x00ac
            java.lang.String r0 = "invalid enc node!"
            goto L_0x0056
        L_0x00ac:
            java.lang.Byte r1 = X.C32601gl.A03(r0)
            if (r1 != 0) goto L_0x00b5
            java.lang.String r0 = "invalid retry count!"
            goto L_0x0056
        L_0x00b5:
            byte[] r0 = r0.getDataCopy()
            if (r0 != 0) goto L_0x00c3
            java.lang.String r0 = "VoiceService:sendReKeyStanza, e2e key is empty"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = "e2e key is empty!"
            goto L_0x0056
        L_0x00c3:
            byte r8 = r1.byteValue()
            java.util.Map r7 = r4.A2l
            r7.put(r2, r1)
            java.util.HashMap r6 = X.AnonymousClass000.A0x()
            r6.put(r2, r0)
            r1 = 1
            r0 = 0
            java.util.Map r0 = r4.A0F(r6, r1, r0)
            if (r0 == 0) goto L_0x0059
            java.lang.Object r1 = r0.get(r2)
            X.1d1 r1 = (X.C30821d1) r1
            if (r1 == 0) goto L_0x0059
            java.lang.String r0 = com.whatsapp.voipcalling.Voip.getCurrentCallId()
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x0108
            java.lang.String r0 = "VoiceService:rekeyEncryptionTask("
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            r1.append(r3)
            java.lang.String r0 = ", "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", the call has ended, do nothing)"
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x0108:
            r7.remove(r2)
            com.whatsapp.protocol.VoipStanzaChildNode r1 = X.C30341cC.A03(r1, r9, r8)
            X.0sK r0 = r4.A1d
            boolean r0 = r0.A0G()
            if (r0 == 0) goto L_0x012a
            boolean r0 = X.C30341cC.A0P(r1)
            if (r0 == 0) goto L_0x012a
            X.11R r0 = r4.A2B
            byte[] r0 = r0.A03()
            X.AnonymousClass00B.A06(r0)
            com.whatsapp.protocol.VoipStanzaChildNode r1 = X.C30341cC.A05(r1, r0)
        L_0x012a:
            X.1SI r4 = r4.A1r
            X.2cC r0 = new X.2cC
            r0.<init>(r2, r5, r3, r1)
            goto L_0x0141
        L_0x0132:
            java.util.Set r0 = r6.keySet()
            com.whatsapp.protocol.VoipStanzaChildNode r1 = X.C30341cC.A04(r9, r6, r0)
            X.1SI r4 = r4.A1r
            X.2cC r0 = new X.2cC
            r0.<init>(r7, r5, r3, r1)
        L_0x0141:
            r4.A00(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.obwhatsapp.calling.service.VoiceService$DefaultSignalingXmppCallback.lambda$sendCallStanza$0(com.whatsapp.jid.Jid, java.lang.String, java.lang.String, com.whatsapp.protocol.VoipStanzaChildNode):void");
    }

    public void sendCallStanza(Jid jid, String str, VoipStanzaChildNode voipStanzaChildNode) {
        String str2;
        String str3;
        VoipStanzaChildNode voipStanzaChildNode2 = voipStanzaChildNode;
        String str4 = voipStanzaChildNode.tag;
        String A00 = C224718b.A00(this.meManager, this.time, false);
        Jid jid2 = jid;
        String str5 = str;
        switch (str4.hashCode()) {
            case -1624583601:
                if (str4.equals("link_join")) {
                    C447225g r3 = this.service;
                    if (r3.A0W == null) {
                        r3.A0W = new AnonymousClass4KJ(A00, SystemClock.elapsedRealtime());
                        break;
                    }
                }
                break;
            case -1423461112:
                if (str4.equals("accept")) {
                    C447225g r32 = this.service;
                    if (r32.A0V == null) {
                        r32.A0V = new AnonymousClass4KJ(A00, SystemClock.elapsedRealtime());
                        break;
                    }
                }
                break;
            case -934710369:
                str3 = "reject";
                break;
            case 103144406:
                if (str4.equals("lobby") && this.service.A0Y == null && str.equals(Voip.getCurrentCallId())) {
                    this.service.A0Y = new AnonymousClass4KJ(A00, SystemClock.elapsedRealtime());
                    break;
                }
            case 105650780:
                if (str4.equals("offer")) {
                    this.service.A0Z(new C613638p(jid, str, voipStanzaChildNode));
                    return;
                }
                break;
            case 112202875:
                str3 = "video";
                break;
            case 1063018407:
                if (str4.equals("enc_rekey")) {
                    this.service.A2c.Acl(new AnonymousClass565(this, jid2, A00, str5, voipStanzaChildNode2));
                    return;
                }
                break;
            case 1184155715:
                if (str4.equals("link_query")) {
                    C447225g r33 = this.service;
                    if (r33.A0X == null) {
                        r33.A0X = new AnonymousClass4KJ(A00, SystemClock.elapsedRealtime());
                        break;
                    }
                }
                break;
            case 1945493729:
                if (str4.equals("link_create")) {
                    C447225g.A2v = A00;
                    break;
                }
                break;
            case 2035990113:
                if (str4.equals("terminate")) {
                    C447225g r34 = this.service;
                    if (r34.A2p != 14) {
                        r34.A0g(jid, str, true);
                        if (r34.A2O.A0E(C16620tM.A02, 986) && (str2 = r34.A10) != null) {
                            AnonymousClass1CM r1 = r34.A1r.A01.A06;
                            AnonymousClass00B.A07(str2, "remove ackable message with null id");
                            LinkedHashMap linkedHashMap = r1.A00;
                            synchronized (linkedHashMap) {
                                linkedHashMap.remove(str2);
                            }
                            r34.A10 = null;
                            break;
                        }
                    } else {
                        return;
                    }
                }
                break;
        }
        if (str4.equals(str3)) {
            this.callSendMethods.A00(new C51742cC(jid, A00, str, voipStanzaChildNode));
            return;
        }
        AnonymousClass1SI r0 = this.callSendMethods;
        C51742cC r4 = new C51742cC(jid, A00, str, voipStanzaChildNode);
        r0.A01.A08(Message.obtain((Handler) null, 0, 206, 0, r4), r4.A03, false);
    }
}
