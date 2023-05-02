package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

/* renamed from: X.3Ib  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C63413Ib implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass39S A02;
    public final /* synthetic */ DeviceJid A03;
    public final /* synthetic */ String A04;

    public /* synthetic */ C63413Ib(AnonymousClass39S r1, DeviceJid deviceJid, String str, int i2, int i3) {
        this.A02 = r1;
        this.A03 = deviceJid;
        this.A04 = str;
        this.A00 = i2;
        this.A01 = i3;
    }

    public final Object call() {
        StringBuilder sb;
        AnonymousClass39S r2 = this.A02;
        DeviceJid deviceJid = this.A03;
        String str = this.A04;
        int i2 = this.A00;
        int i3 = this.A01;
        C28381Vw r3 = new C28381Vw(deviceJid.getUserJid(), str, true);
        C28861Yb A022 = C28851Ya.A02(deviceJid);
        Lock A023 = r2.A0A.A02(A022);
        if (A023 != null) {
            try {
                A023.lock();
            } catch (Throwable th) {
                if (A023 != null) {
                    A023.unlock();
                }
                throw th;
            }
        }
        C208211s r8 = r2.A08;
        C31721ev A0D = r8.A0D(A022);
        C36031mt r7 = A0D.A01.A00;
        byte[] A042 = r7.A05.A04();
        if (A0D.A00 || r7.A03 != i2) {
            sb = AnonymousClass000.A0o();
            sb.append("voip/receive_message/onPeerE2EDecryptionFailed registration id is not equal. stored= ");
            sb.append(r7.A03);
            sb.append(", incoming=");
            sb.append(i2);
            sb.append(". Fetching new prekey for: ");
        } else {
            if (i3 > 2) {
                if (r8.A0f(A022, r3)) {
                    sb = AnonymousClass000.A0o();
                    sb.append("voip/receive_message/onPeerE2EDecryptionFailed reg id is equal and has same basekey. Fetching new prekey for: ");
                }
            } else if (i3 == 2) {
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append("voip/receive_message/onPeerE2EDecryptionFailed recording base key. ");
                A0o.append(r3);
                C13680ns.A1V(A0o);
                r8.A0X(A022, r3, A042);
            }
            if (A023 != null) {
                A023.unlock();
            }
            return deviceJid;
        }
        sb.append(r3);
        C13680ns.A1V(sb);
        if (r2.A0K.add(deviceJid)) {
            Log.i(AnonymousClass000.A0g("voip/encryption/startGetPreKeyJob for ", deviceJid));
            r2.A03.A04(new DeviceJid[]{deviceJid}, 7, false);
        } else {
            Log.i(AnonymousClass000.A0g("voip/encryption/startGetPreKeyJob do nothing, PreKey already sent for ", deviceJid));
        }
        if (A023 == null) {
            return null;
        }
        A023.unlock();
        return null;
    }
}
