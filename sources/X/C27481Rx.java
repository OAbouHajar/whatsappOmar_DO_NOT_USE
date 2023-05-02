package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import com.facebook.redex.RunnableRunnableShape0S0300100_I0;
import com.obwhatsapp.location.LocationSharingService;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.1Rx  reason: invalid class name and case insensitive filesystem */
public class C27481Rx implements C19420yP {
    public final C16300so A00;
    public final C208211s A01;
    public final AnonymousClass16P A02;
    public final C19430yQ A03;
    public final C27471Rw A04;

    public C27481Rx(C16300so r1, C208211s r2, AnonymousClass16P r3, C19430yQ r4, C27471Rw r5) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
    }

    public void A00(UserJid userJid, C30821d1 r10, long j2) {
        StringBuilder sb;
        String str;
        StringBuilder sb2 = new StringBuilder("LiveLocationXmppMessageHandler/on-location-update; jid=");
        UserJid userJid2 = userJid;
        sb2.append(userJid);
        sb2.append("; elapsed=");
        long j3 = j2;
        sb2.append(j2);
        Log.i(sb2.toString());
        C30821d1 r4 = r10;
        int i2 = r10.A01;
        if (i2 != 2) {
            sb = new StringBuilder();
            str = "LiveLocationXmppMessageHandler/invalid ciphertext version; ciphertextVersion=";
        } else {
            i2 = r10.A00;
            if (i2 != 3) {
                sb = new StringBuilder();
                str = "LiveLocationXmppMessageHandler/invalid ciphertext type; ciphertextType=";
            } else {
                AnonymousClass16P r0 = this.A02;
                r0.A00.execute(new RunnableRunnableShape0S0300100_I0(this, userJid2, r4, 3, j3));
                return;
            }
        }
        sb.append(str);
        sb.append(i2);
        Log.w(sb.toString());
    }

    public int[] ACW() {
        return new int[]{117, 206};
    }

    public boolean AHS(Message message, int i2) {
        if (i2 == 117) {
            Bundle data = message.getData();
            A00((UserJid) AnonymousClass2RS.A00(data, "jid"), (C30821d1) message.obj, data.getLong("elapsed"));
            return true;
        } else if (i2 != 206) {
            return false;
        } else {
            C28371Vv r7 = (C28371Vv) message.obj;
            String A0N = r7.A0N("id", (String) null);
            int i3 = 0;
            C28371Vv A0I = r7.A0I(0);
            Jid A0F = r7.A0F(this.A00, Jid.class, "from");
            AnonymousClass00B.A06(A0F);
            if (C28371Vv.A07(A0I, "start")) {
                String A0N2 = A0I.A0N("duration", (String) null);
                long j2 = 0;
                if (A0N2 != null) {
                    j2 = Long.parseLong(A0N2);
                }
                C19430yQ r72 = this.A03;
                C15830rv A002 = C15830rv.A00(A0F);
                AnonymousClass00B.A06(A002);
                long j3 = j2 * 1000;
                StringBuilder sb = new StringBuilder("LocationSharingManager/onStartLocationReporting; jid=");
                sb.append(A002);
                sb.append("; duration=");
                sb.append(j3);
                Log.i(sb.toString());
                if (r72.A0c(A002)) {
                    Context context = r72.A0H.A00;
                    LocationSharingService.A00(context, new Intent(context, LocationSharingService.class).setAction("com.obwhatsapp.ShareLocationService.START_LOCATION_REPORTING").putExtra("duration", j3));
                    synchronized (r72.A0Q) {
                        r72.A00 = 2 | r72.A00;
                    }
                    i3 = 0;
                } else {
                    StringBuilder sb2 = new StringBuilder("LocationSharingManager/onStartLocationReporting/sharing not enabled; jid=");
                    sb2.append(A002);
                    Log.w(sb2.toString());
                    i3 = 401;
                }
            } else if (C28371Vv.A07(A0I, "stop")) {
                this.A03.A0F();
            } else if (!C28371Vv.A07(A0I, "enable")) {
                this.A04.A01(A0F, A0N, 501);
                return true;
            }
            this.A04.A01(A0F, A0N, i3);
            return true;
        }
    }
}
