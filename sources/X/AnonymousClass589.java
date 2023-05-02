package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.util.Log;
import java.util.concurrent.Callable;

/* renamed from: X.589  reason: invalid class name */
public final /* synthetic */ class AnonymousClass589 implements Callable {
    public final /* synthetic */ AnonymousClass39S A00;
    public final /* synthetic */ C28861Yb A01;
    public final /* synthetic */ DeviceJid A02;
    public final /* synthetic */ C30821d1 A03;
    public final /* synthetic */ byte[] A04;

    public /* synthetic */ AnonymousClass589(AnonymousClass39S r1, C28861Yb r2, DeviceJid deviceJid, C30821d1 r4, byte[] bArr) {
        this.A00 = r1;
        this.A02 = deviceJid;
        this.A04 = bArr;
        this.A03 = r4;
        this.A01 = r2;
    }

    public final Object call() {
        AnonymousClass39S r6 = this.A00;
        DeviceJid deviceJid = this.A02;
        byte[] bArr = this.A04;
        C30821d1 r4 = this.A03;
        C28861Yb r3 = this.A01;
        if (r6.A0G.A0B(deviceJid, r4, bArr, 2)) {
            int i2 = r4.A00;
            if (i2 == 0) {
                return r6.A08.A05((C30881d7) null, r3, r4.A02);
            }
            if (i2 == 1) {
                return r6.A08.A06((C30881d7) null, r3, r4.A02);
            }
            throw AnonymousClass000.A0T(C13680ns.A0c(i2, "invalid ciphertext type; ciphertextType="));
        }
        Log.e("voip/encryption/decryptCallPayload/invalid device identity");
        return new C30891d8((byte[]) null, -1010);
    }
}
