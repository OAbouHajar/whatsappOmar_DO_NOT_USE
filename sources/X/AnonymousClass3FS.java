package X;

import android.support.v4.view.accessibility.AccessibilityEventCompat;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.3FS  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3FS implements C30881d7 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ UserJid A01;
    public final /* synthetic */ C27481Rx A02;

    public /* synthetic */ AnonymousClass3FS(UserJid userJid, C27481Rx r2, long j2) {
        this.A02 = r2;
        this.A01 = userJid;
        this.A00 = j2;
    }

    public final void AHO(byte[] bArr) {
        String str;
        C27481Rx r5 = this.A02;
        UserJid userJid = this.A01;
        long j2 = this.A00;
        byte[] A022 = C454929a.A02((C30861d5) null, (C30841d3) null, bArr);
        if (A022 != null) {
            try {
                C33211iD A0U = C33211iD.A0U(A022);
                if ((A0U.A00 & AccessibilityEventCompat.TYPE_VIEW_ACCESSIBILITY_FOCUS_CLEARED) == 65536) {
                    C19430yQ r7 = r5.A03;
                    Log.i(AnonymousClass000.A0g("LocationSharingManager/onReceiveLocation; location.jid=", userJid));
                    long A002 = r7.A0G.A00();
                    C39721sx A003 = C19430yQ.A00(userJid, A0U, (C38841rV) null);
                    A003.A05 = A002 - (j2 * 1000);
                    if (r7.A0e(A003)) {
                        for (AnonymousClass290 AVm : r7.A0X) {
                            AVm.AVm(A003);
                        }
                        return;
                    }
                    str = AnonymousClass000.A0f(A003.A06, AnonymousClass000.A0r("LocationSharingManager/onReceiveLocation/sharer not in any group; remote_resource="));
                } else {
                    str = AnonymousClass000.A0g("axolotl e2eMessage is missing live location message; jid=", userJid);
                }
                Log.w(str);
            } catch (C29791bD e2) {
                Log.w(AnonymousClass000.A0g("axolotl derived plaintext does not represent valid protocol buffer; jid=", userJid), e2);
            }
        }
    }
}
