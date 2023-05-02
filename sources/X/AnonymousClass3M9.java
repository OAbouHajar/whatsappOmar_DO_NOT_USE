package X;

import android.telecom.CallAudioState;
import android.telecom.Connection;
import android.telecom.DisconnectCause;
import com.whatsapp.util.Log;
import java.util.Iterator;

/* renamed from: X.3M9  reason: invalid class name */
public class AnonymousClass3M9 extends Connection {
    public C52232dM A00;
    public String A01;

    public AnonymousClass3M9(C52232dM r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public String A00() {
        return this.A01;
    }

    public void A01(int i2) {
        if (this.A00 != null) {
            StringBuilder A0r = AnonymousClass000.A0r("voip/SelfManagedConnection/setDisconnected ");
            A0r.append(this.A01);
            Log.i(C13680ns.A0i(", cause: ", A0r, i2));
            setDisconnected(new DisconnectCause(i2));
            destroy();
            this.A00.A0D(this);
            this.A00 = null;
        }
    }

    public void A02(String str) {
        this.A01 = str;
    }

    public void onAbort() {
        Log.i("voip/SelfManagedConnection/onAbort");
        super.onAbort();
    }

    public void onAnswer() {
        onAnswer(0);
    }

    public void onAnswer(int i2) {
        Log.i("voip/SelfManagedConnection/onAnswer");
        C52232dM r2 = this.A00;
        if (r2 != null) {
            r2.A0F(this.A01, 2);
        }
        setActive();
    }

    public void onCallAudioStateChanged(CallAudioState callAudioState) {
        Log.i(AnonymousClass000.A0g("voip/SelfManagedConnection/onCallAudioStateChanged ", callAudioState));
        super.onCallAudioStateChanged(callAudioState);
        C52232dM r1 = this.A00;
        if (r1 != null) {
            r1.A09(callAudioState, this.A01);
        }
    }

    public void onDisconnect() {
        Log.i("voip/SelfManagedConnection/onDisconnect");
        C52232dM r2 = this.A00;
        if (r2 != null) {
            r2.A0F(this.A01, 4);
        }
        A01(2);
    }

    public void onHold() {
        StringBuilder A0r = AnonymousClass000.A0r("voip/SelfManagedConnection/onHold, AudioModeIsVoip: ");
        A0r.append(getAudioModeIsVoip());
        C13680ns.A1V(A0r);
        C52232dM r2 = this.A00;
        if (r2 != null) {
            r2.A0F(this.A01, 0);
        }
        setOnHold();
    }

    public void onReject() {
        Log.i("voip/SelfManagedConnection/onReject");
        C52232dM r2 = this.A00;
        if (r2 != null) {
            r2.A0F(this.A01, 3);
        }
        A01(6);
    }

    public void onReject(String str) {
        Log.i(AnonymousClass000.A0h(str, AnonymousClass000.A0r("voip/SelfManagedConnection/onReject ")));
        onReject();
    }

    public void onShowIncomingCallUi() {
        Log.i("voip/SelfManagedConnection/onShowIncomingCallUi");
        C52232dM r0 = this.A00;
        if (r0 != null) {
            String str = this.A01;
            AnonymousClass00B.A01();
            Iterator A002 = C16590tJ.A00(r0);
            while (A002.hasNext()) {
                ((C52242dN) A002.next()).A01(str);
            }
        }
    }

    public void onStateChanged(int i2) {
        Log.i(C13680ns.A0c(i2, "voip/SelfManagedConnection/onStateChanged "));
        super.onStateChanged(i2);
    }

    public void onUnhold() {
        StringBuilder A0r = AnonymousClass000.A0r("voip/SelfManagedConnection/onUnhold, AudioModeIsVoip: ");
        A0r.append(getAudioModeIsVoip());
        C13680ns.A1V(A0r);
        C52232dM r2 = this.A00;
        if (r2 != null) {
            r2.A0F(this.A01, 1);
        }
        setAudioModeIsVoip(true);
        setActive();
    }

    public String toString() {
        return AnonymousClass000.A0h(this.A01, AnonymousClass000.A0r("SelfManagedConnection: "));
    }
}
