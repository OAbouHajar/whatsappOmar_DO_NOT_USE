package X;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.17R  reason: invalid class name */
public class AnonymousClass17R {
    public long A00 = -1;
    public final C16440t3 A01;
    public final C19780yz A02;
    public final Map A03 = new HashMap();

    public AnonymousClass17R(C16440t3 r3, C19780yz r4) {
        this.A01 = r3;
        this.A02 = r4;
    }

    public void A00(Bundle bundle) {
        if (bundle != null) {
            this.A00 = bundle.getLong("ephemeral_session_start", -1);
        }
    }

    public void A01(Bundle bundle) {
        bundle.putLong("ephemeral_session_start", this.A00);
    }
}
