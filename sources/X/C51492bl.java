package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.2bl  reason: invalid class name and case insensitive filesystem */
public class C51492bl extends C51442bg {
    public C51492bl(C16300so r1, C14710pd r2, C16490t9 r3, AnonymousClass2H7 r4, Map map) {
        super(r1, r2, r3, r4, map);
    }

    public void A00(C28371Vv r8) {
        C28371Vv A0I;
        AnonymousClass2H7 r1;
        int i2;
        String A0N = r8.A0N("type", (String) null);
        String A0N2 = r8.A0N("id", (String) null);
        String A0N3 = r8.A0N("xmlns", (String) null);
        if (A0N != null) {
            if (A0N.equals("result")) {
                AnonymousClass2Qh r0 = (AnonymousClass2Qh) this.A00.remove(A0N2);
                if (r0 != null) {
                    r0.A02(r8);
                }
            } else if (A0N.equals("error")) {
                AnonymousClass2Qh r02 = (AnonymousClass2Qh) this.A00.remove(A0N2);
                if (r02 != null) {
                    r02.A00(r8);
                }
            } else if (A0N.equals("get")) {
                C28371Vv A0I2 = r8.A0I(0);
                if ("urn:xmpp:ping".equals(A0N3)) {
                    long A01 = C29501aj.A01(r8.A0N("t", (String) null), 0);
                    AnonymousClass2H7 r4 = this.A04;
                    Log.i("xmpp/reader/read/ping");
                    AnonymousClass2H8 r6 = r4.A01;
                    Message obtain = Message.obtain((Handler) null, 0, 4, 0);
                    obtain.getData().putLong("timestamp", A01);
                    r6.AZq(obtain);
                } else if (C28371Vv.A07(A0I2, "relay")) {
                    String A0N4 = A0I2.A0N("pin", (String) null);
                    A0I2.A0N("ip", (String) null);
                    A0I2.A0A("timeout", 0);
                    if (A0N4 != null) {
                        Log.e("onRelayRequest");
                    }
                }
            } else if (A0N.equals("set")) {
                if ("location".equals(A0N3)) {
                    r1 = this.A04;
                    i2 = 206;
                } else if ("md".equals(A0N3) && (A0I = r8.A0I(0)) != null) {
                    if (C28371Vv.A07(A0I, "pair-device")) {
                        r1 = this.A04;
                        i2 = 242;
                    } else if (C28371Vv.A07(A0I, "pair-success")) {
                        r1 = this.A04;
                        i2 = 243;
                    } else {
                        StringBuilder sb = new StringBuilder("unknown tag in multidevice IQ: ");
                        sb.append(A0I.A00);
                        throw new AnonymousClass1W9(sb.toString());
                    }
                }
                r1.A00(r8, (C30641ci) null, i2);
            } else {
                StringBuilder sb2 = new StringBuilder("unknown iq type attribute: ");
                sb2.append(A0N);
                throw new AnonymousClass1W9(sb2.toString());
            }
            if (A0N2 != null) {
                AnonymousClass2H7 r2 = this.A04;
                StringBuilder sb3 = new StringBuilder("xmpp/reader/on-iq-response; id=");
                sb3.append(A0N2);
                Log.i(sb3.toString());
                r2.A01.ASN(r8, A0N2);
                return;
            }
            return;
        }
        throw new AnonymousClass1W9("missing 'type' attribute in iq stanza");
    }
}
