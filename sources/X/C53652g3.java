package X;

import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.2g3  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C53652g3 implements C30881d7 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C15830rv A01;
    public final /* synthetic */ DeviceJid A02;
    public final /* synthetic */ C28001Ty A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ C53652g3(C15830rv r1, DeviceJid deviceJid, C28001Ty r3, String str, long j2) {
        this.A03 = r3;
        this.A02 = deviceJid;
        this.A01 = r1;
        this.A04 = str;
        this.A00 = j2;
    }

    public final void AHO(byte[] bArr) {
        C39721sx r0;
        C28001Ty r7 = this.A03;
        DeviceJid deviceJid = this.A02;
        C15830rv r10 = this.A01;
        String str = this.A04;
        long j2 = this.A00;
        byte[] A022 = C454929a.A02((C30861d5) null, (C30841d3) null, bArr);
        if (A022 != null) {
            try {
                C33211iD A0U = C33211iD.A0U(A022);
                if ((A0U.A00 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
                    C19430yQ r8 = r7.A06;
                    UserJid userJid = deviceJid.getUserJid();
                    StringBuilder sb = new StringBuilder("LocationSharingManager/onReceiveFinalLocation/jid=");
                    sb.append(r10);
                    sb.append("; senderJid=");
                    sb.append(userJid);
                    sb.append("; msgId=");
                    sb.append(str);
                    Log.i(sb.toString());
                    C38841rV A06 = r8.A06(new C28381Vw(r10, str, false));
                    if (A06 == null) {
                        StringBuilder sb2 = new StringBuilder("LocationSharingManager/onReceiveFinalLocation/Live location message not found; jid=");
                        sb2.append(r10);
                        sb2.append("; msgId=");
                        sb2.append(str);
                        Log.i(sb2.toString());
                        return;
                    }
                    C39721sx A002 = C19430yQ.A00(userJid, A0U, A06);
                    if (j2 > 0) {
                        A002.A05 = j2;
                    }
                    synchronized (r8.A0R) {
                        C39721sx r02 = (C39721sx) r8.A0c.get(userJid);
                        if (r02 != null && r02.A05 < A002.A05) {
                            r8.A0e(A002);
                        }
                        Map map = (Map) r8.A09().get(r10);
                        if ((map == null || !map.containsKey(userJid)) && ((r0 = A06.A02) == null || r0.A05 < A002.A05)) {
                            r8.A0V(A002, A06);
                        }
                    }
                    return;
                }
                StringBuilder sb3 = new StringBuilder("LocationNotificationHandler/onFinalLocationNotification/axolotl e2eMessage is missing live location message; senderJid=");
                sb3.append(deviceJid);
                Log.w(sb3.toString());
            } catch (C29791bD e2) {
                StringBuilder sb4 = new StringBuilder("LocationNotificationHandler/onFinalLocationNotification/axolotl derived plaintext does not represent valid protocol buffer; senderJid=");
                sb4.append(deviceJid);
                Log.w(sb4.toString(), e2);
            }
        }
    }
}
