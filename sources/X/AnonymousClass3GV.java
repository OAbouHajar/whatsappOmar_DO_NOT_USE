package X;

import android.util.Pair;
import com.facebook.redex.IDxComparatorShape20S0000000_2_I1;
import com.facebook.redex.RunnableRunnableShape3S0300000_I1;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3GV  reason: invalid class name */
public class AnonymousClass3GV implements C19550yc {
    public final C16300so A00;
    public final C85924Qn A01;
    public final C17190ug A02;
    public final Map A03;

    public AnonymousClass3GV(C16300so r1, C85924Qn r2, C17190ug r3, Map map) {
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = map;
        this.A01 = r2;
    }

    public void APb(String str) {
        C85924Qn r1 = this.A01;
        Log.w("FetchPrekeyForMissingDeviceManager/requestPrekeyForMissingDevice delivery failure");
        r1.A01.A02(Boolean.FALSE);
    }

    public void AQe(C28371Vv r5, String str) {
        int i2;
        String str2;
        Pair A012 = C34451kH.A01(r5);
        C85924Qn r2 = this.A01;
        if (A012 != null) {
            i2 = AnonymousClass000.A0D(A012.first);
            str2 = (String) A012.second;
        } else {
            i2 = 0;
            str2 = null;
        }
        r2.A00(i2, str2);
    }

    public void AYG(C28371Vv r29, String str) {
        C28371Vv[] r12;
        byte b2;
        C30971dG r0;
        HashMap A0x = AnonymousClass000.A0x();
        ArrayList A0u = AnonymousClass000.A0u();
        C28371Vv A0J = r29.A0J("list");
        if (!(A0J == null || (r12 = A0J.A03) == null)) {
            for (C28371Vv r3 : r12) {
                UserJid userJid = (UserJid) r3.A0F(this.A00, UserJid.class, "jid");
                if (userJid != null) {
                    C28371Vv A0J2 = r3.A0J("error");
                    if (A0J2 != null) {
                        C13680ns.A1X(userJid, A0x, C28371Vv.A00(A0J2, "code"));
                    } else {
                        C28371Vv[] r9 = r3.A03;
                        if (r9 != null) {
                            Arrays.sort(r9, new IDxComparatorShape20S0000000_2_I1(15));
                            for (C28371Vv r7 : r9) {
                                byte[] bArr = null;
                                try {
                                    DeviceJid fromUserJidAndDeviceId = DeviceJid.getFromUserJidAndDeviceId(userJid, C28371Vv.A00(r7, "id"));
                                    C28371Vv A0K = r7.A0K("identity");
                                    C28371Vv A0J3 = r7.A0J("device-identity");
                                    C28371Vv A0K2 = r7.A0K("registration");
                                    C28371Vv A0J4 = r7.A0J("type");
                                    if (A0J4 == null) {
                                        b2 = 5;
                                    } else {
                                        byte[] bArr2 = A0J4.A01;
                                        if (bArr2 == null || bArr2.length != 1) {
                                            throw new AnonymousClass1W9("type node should contain exactly 1 byte");
                                        }
                                        b2 = bArr2[0];
                                    }
                                    C28371Vv A0J5 = r7.A0J("key");
                                    if (A0J5 != null) {
                                        r0 = new C30971dG(A0J5.A0K("id").A01, A0J5.A0K("value").A01, (byte[]) null);
                                    } else {
                                        r0 = null;
                                    }
                                    C28371Vv A0K3 = r7.A0K("skey");
                                    C28371Vv A0K4 = A0K3.A0K("id");
                                    C28371Vv A0K5 = A0K3.A0K("value");
                                    C28371Vv A0K6 = A0K3.A0K("signature");
                                    byte[] bArr3 = A0K.A01;
                                    byte[] bArr4 = A0K2.A01;
                                    if (A0J3 != null) {
                                        bArr = A0J3.A01;
                                    }
                                    A0u.add(new C52312dZ(fromUserJidAndDeviceId, r0, new C30971dG(A0K4.A01, A0K5.A01, A0K6.A01), bArr3, bArr4, bArr, b2));
                                } catch (AnonymousClass1W4 unused) {
                                }
                            }
                            continue;
                        } else {
                            continue;
                        }
                    }
                }
            }
        }
        C85924Qn r4 = this.A01;
        A0u.size();
        if (!A0u.isEmpty()) {
            r4.A00.A02.A00.execute(new RunnableRunnableShape3S0300000_I1(r4, A0u, r4.A01, 18));
        } else {
            r4.A01.A02(Boolean.TRUE);
        }
        Iterator A0j = C13690nt.A0j(A0x);
        while (A0j.hasNext()) {
            Map.Entry A0z = AnonymousClass000.A0z(A0j);
            StringBuilder A0r = AnonymousClass000.A0r("FetchPrekeyForMissingDeviceManager/onSuccess error jid=");
            A0r.append(A0z.getKey());
            A0r.append("; code=");
            Log.e(AnonymousClass000.A0f(A0z.getValue(), A0r));
        }
    }
}
