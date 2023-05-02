package X;

import com.whatsapp.util.Log;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* renamed from: X.5v6  reason: invalid class name and case insensitive filesystem */
public abstract class C118695v6 {
    public List A00;
    public final JSONArray A01 = new JSONArray();

    public C118695v6 A00(PublicKey... publicKeyArr) {
        ArrayList A0u = AnonymousClass000.A0u();
        try {
            for (PublicKey A012 : publicKeyArr) {
                A0u.add(C119065vr.A01(A012));
            }
            this.A00 = A0u;
            return this;
        } catch (NoSuchAlgorithmException e2) {
            Log.e("PAY: DefaultTrustTokenBuilder/generateKeyFingerprints", e2);
            throw new C115055p2(e2);
        }
    }

    public String A01() {
        if (!(this instanceof C112505ib)) {
            return ((C112515ic) this).A00;
        }
        try {
            return C119065vr.A00(((C112505ib) this).A00.toString());
        } catch (UnsupportedEncodingException e2) {
            throw new C115055p2(e2);
        }
    }
}
