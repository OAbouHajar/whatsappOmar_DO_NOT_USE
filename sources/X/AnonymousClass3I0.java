package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.3I0  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3I0 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C15830rv A02;
    public final /* synthetic */ DeviceJid A03;
    public final /* synthetic */ C28001Ty A04;
    public final /* synthetic */ C30641ci A05;
    public final /* synthetic */ String A06;

    public /* synthetic */ AnonymousClass3I0(C15830rv r1, DeviceJid deviceJid, C28001Ty r3, C30641ci r4, String str, int i2, int i3) {
        this.A04 = r3;
        this.A05 = r4;
        this.A00 = i2;
        this.A01 = i3;
        this.A02 = r1;
        this.A03 = deviceJid;
        this.A06 = str;
    }

    public final void run() {
        C35081lL[] r4;
        String A0i;
        C28001Ty r7 = this.A04;
        C30641ci r6 = this.A05;
        int i2 = this.A00;
        int i3 = this.A01;
        C15830rv r3 = this.A02;
        DeviceJid deviceJid = this.A03;
        String str = this.A06;
        Log.i(AnonymousClass000.A0g("LocationNotificationHandler/onFinalLocationNotification/need to send retry receipt; stanzaKey=", r6));
        if (i2 > 1) {
            r7.A01.A02();
        }
        StringBuilder A0r = AnonymousClass000.A0r("LocationNotificationHandler/onFinalLocationNotification/axolotl sending retry receipt; stanzaKey=");
        A0r.append(r6);
        A0r.append("; localRegistrationId=");
        A0r.append(i3);
        C13680ns.A1V(A0r);
        C19430yQ r62 = r7.A06;
        UserJid userJid = deviceJid.getUserJid();
        byte[] A022 = C28641Wx.A02(i3);
        int i4 = i2 + 1;
        StringBuilder A0r2 = AnonymousClass000.A0r("LocationSharingManager/sendFinalLocationRetryRequest/jid=");
        A0r2.append(r3);
        A0r2.append("; participant=");
        A0r2.append(userJid);
        A0r2.append("; msgId=");
        A0r2.append(str);
        A0r2.append("; retryCount=");
        A0r2.append(i4);
        C13680ns.A1V(A0r2);
        if (i4 > 4) {
            StringBuilder A0r3 = AnonymousClass000.A0r("LocationSharingManager/sendFinalLocationRetryRequest/reached max retry; remote_resource=");
            A0r3.append(userJid);
            A0i = C13680ns.A0i("; retryCount=", A0r3, i4);
        } else if (r62.A06(new C28381Vw(r3, str, false)) == null) {
            StringBuilder A0r4 = AnonymousClass000.A0r("LocationSharingManager/sendFinalLocationRetryRequest/can't find the live location message; jid=");
            A0r4.append(r3);
            A0r4.append("; senderJid=");
            A0r4.append(userJid);
            A0r4.append("; msgId=");
            A0r4.append(str);
            A0i = C13680ns.A0i("; retryCount=", A0r4, i4);
        } else {
            C17190ug r5 = r62.A0O.A01;
            C35081lL[] r63 = new C35081lL[3];
            C35081lL.A02("id", r5.A02(), r63, 0);
            r63[1] = new C35081lL((Jid) userJid, "to");
            r63[2] = new C35081lL("type", "location");
            if (C16030sJ.A0L(r3)) {
                r4 = new C35081lL[2];
                C35081lL.A02("final", str, r4, 0);
                r4[1] = new C35081lL((Jid) r3, "context");
            } else {
                r4 = new C35081lL[1];
                C35081lL.A02("final", str, r4, 0);
            }
            C35081lL[] r2 = new C35081lL[1];
            C35081lL.A02("retry", String.valueOf(i4), r2, 0);
            r5.A0D(new C28371Vv(new C28371Vv("location", r4, new C28371Vv[]{new C28371Vv("request", r2), new C28371Vv("registration", A022, (C35081lL[]) null)}), "notification", r63), 191);
            return;
        }
        Log.w(A0i);
    }
}
