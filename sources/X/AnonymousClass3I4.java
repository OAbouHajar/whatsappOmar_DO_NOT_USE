package X;

import android.os.SystemClock;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.protocol.VoipStanzaChildNode;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.Voip;
import java.util.Map;

/* renamed from: X.3I4  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3I4 implements Runnable {
    public final /* synthetic */ C613638p A00;
    public final /* synthetic */ C447225g A01;
    public final /* synthetic */ Jid A02;
    public final /* synthetic */ VoipStanzaChildNode A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ Map A06;
    public final /* synthetic */ boolean A07;

    public /* synthetic */ AnonymousClass3I4(C613638p r1, C447225g r2, Jid jid, VoipStanzaChildNode voipStanzaChildNode, String str, String str2, Map map, boolean z2) {
        this.A01 = r2;
        this.A07 = z2;
        this.A02 = jid;
        this.A04 = str;
        this.A06 = map;
        this.A00 = r1;
        this.A03 = voipStanzaChildNode;
        this.A05 = str2;
    }

    public final void run() {
        C447225g r7 = this.A01;
        boolean z2 = this.A07;
        Jid jid = this.A02;
        String str = this.A04;
        Map map = this.A06;
        C613638p r8 = this.A00;
        VoipStanzaChildNode voipStanzaChildNode = this.A03;
        String str2 = this.A05;
        if (r7.A2p != 14) {
            r7.A2u = false;
            if (z2) {
                UserJid convertToUserJid = Voip.JidHelper.convertToUserJid(jid);
                AnonymousClass00B.A06(convertToUserJid);
                StringBuilder A0r = AnonymousClass000.A0r("VoiceService:sendOfferEcryptionTask, Call ID = ");
                A0r.append(str);
                A0r.append(", peer = ");
                A0r.append(convertToUserJid);
                C13680ns.A1V(A0r);
                Map A0F = r7.A0F(map, 0, false);
                if (A0F != null) {
                    CallInfo callInfo = Voip.getCallInfo();
                    if (callInfo != null && ((callInfo.isCaller || callInfo.callLinkToken != null) && callInfo.callId.equals(str))) {
                        UserJid peerJid = callInfo.getPeerJid();
                        AnonymousClass00B.A06(peerJid);
                        if (peerJid.equals(convertToUserJid)) {
                            if (r8.A02 != null) {
                                voipStanzaChildNode = C30341cC.A04(r8.A03, A0F, r8.A05.keySet());
                            } else {
                                C30821d1 r2 = null;
                                AnonymousClass00B.A0B("cannot have multiple encrypted messages in old format!", AnonymousClass000.A1R(A0F.size(), 1));
                                if (A0F.size() == 1) {
                                    DeviceJid of = DeviceJid.of(r8.A01);
                                    AnonymousClass00B.A06(of);
                                    Object obj = A0F.get(of);
                                    AnonymousClass00B.A06(obj);
                                    r2 = (C30821d1) obj;
                                }
                                voipStanzaChildNode = C30341cC.A03(r2, r8.A03, r8.A00);
                            }
                            if (r7.A1d.A0G() && C30341cC.A0P(voipStanzaChildNode)) {
                                byte[] A032 = r7.A2B.A03();
                                AnonymousClass00B.A06(A032);
                                voipStanzaChildNode = C30341cC.A05(voipStanzaChildNode, A032);
                            }
                        }
                    }
                    StringBuilder A0r2 = AnonymousClass000.A0r("VoiceService:sendOfferEcryptionTask(");
                    A0r2.append(str);
                    A0r2.append(", ");
                    A0r2.append(convertToUserJid);
                    Log.w(AnonymousClass000.A0h(", call state does not match, do nothing)", A0r2));
                }
                Log.i("VoiceService:sendOfferStanza sendOfferEcryptionTask skipped or failed");
                r7.A2q = r8;
            }
            StringBuilder A0r3 = AnonymousClass000.A0r("VoiceService:sendOfferStanza without enc (Call ID = ");
            A0r3.append(str);
            A0r3.append(", peer = ");
            A0r3.append(jid);
            Log.i(AnonymousClass000.A0h(")", A0r3));
            if (voipStanzaChildNode != null) {
                if (r7.A0Z == null) {
                    r7.A0Z = new AnonymousClass4KJ(str2, SystemClock.elapsedRealtime());
                }
                r7.A1r.A00(new C51742cC(jid, str2, str, voipStanzaChildNode));
                return;
            }
            r7.A2q = r8;
        }
    }
}
