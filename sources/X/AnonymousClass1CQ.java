package X;

import android.content.SharedPreferences;
import com.whatsapp.jid.Jid;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: X.1CQ  reason: invalid class name */
public class AnonymousClass1CQ {
    public C31981fL A00;
    public final AnonymousClass1CG A01;
    public final C17190ug A02;

    public AnonymousClass1CQ(AnonymousClass1CG r1, C17190ug r2) {
        this.A01 = r1;
        this.A02 = r2;
    }

    public void A00() {
        AnonymousClass1CG r5 = this.A01;
        if (r5.A0B.A0E(C16620tM.A02, 1689)) {
            SharedPreferences A002 = r5.A0D.A00("keystore");
            if (A002.getInt("remaining_auth_key_rotation_attempts", 0) > 0) {
                long j2 = A002.getLong("last_failed_auth_key_rotation_attempt", -1);
                if (j2 == -1 || r5.A06.A00() - j2 > 1800000) {
                    if (this.A00 == null) {
                        this.A00 = C31981fL.A00();
                    }
                    C17190ug r7 = this.A02;
                    String A022 = r7.A02();
                    byte[] bArr = this.A00.A02.A01;
                    C51812cK r4 = new C51812cK(A022);
                    C32461gQ r3 = new C32461gQ("iq");
                    r3.A02(new C35081lL((Jid) C34791ks.A00, "to"));
                    r3.A02(new C35081lL("xmlns", "w:auth:key"));
                    C32461gQ r2 = new C32461gQ("key");
                    C32271fx.A09(bArr, 32, 32);
                    r2.A01 = bArr;
                    r3.A03(r2.A01());
                    r3.A05(r4.A00, new ArrayList());
                    r4.A00(r3, Collections.EMPTY_LIST);
                    r7.A0G(new C63113Ge(r5, this, this.A00), r3.A01(), A022, 331, 32000);
                }
            }
        }
    }
}
