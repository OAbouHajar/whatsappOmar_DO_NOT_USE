package X;

import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;

/* renamed from: X.254  reason: invalid class name */
public class AnonymousClass254 implements C19550yc {
    public C17380uz A00;
    public final AnonymousClass253 A01;
    public final C17190ug A02;

    public AnonymousClass254(AnonymousClass253 r1, C17190ug r2) {
        this.A02 = r2;
        this.A01 = r1;
    }

    public void A00(DeviceJid deviceJid, String str) {
        DeviceJid deviceJid2 = deviceJid;
        this.A00 = C17380uz.of(deviceJid2);
        C17190ug r8 = this.A02;
        String A022 = r8.A02();
        AnonymousClass00B.A06(deviceJid2);
        boolean A0G = r8.A0G(this, new C28371Vv(new C28371Vv("remove-companion-device", new C35081lL[]{new C35081lL((Jid) deviceJid2, "jid"), new C35081lL("reason", str)}), "iq", new C35081lL[]{new C35081lL((Jid) C34791ks.A00, "to"), new C35081lL("id", A022), new C35081lL("xmlns", "md"), new C35081lL("type", "set")}), A022, 237, 32000);
        StringBuilder sb = new StringBuilder("app/sendRemoveDeviceRequest success: ");
        sb.append(A0G);
        Log.i(sb.toString());
        if (!A0G) {
            this.A01.AQU(this.A00, -1);
        }
    }

    public void APb(String str) {
        this.A01.AQU(this.A00, -1);
    }

    public void AQe(C28371Vv r4, String str) {
        this.A01.AQU(this.A00, C34451kH.A00(r4));
    }

    public void AYG(C28371Vv r3, String str) {
        this.A01.AY4(this.A00);
    }
}
