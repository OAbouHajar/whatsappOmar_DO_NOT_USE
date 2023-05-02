package X;

import org.json.JSONObject;
import org.npci.commonlibrary.GetCredential;

/* renamed from: X.5eK  reason: invalid class name and case insensitive filesystem */
public abstract class C110515eK extends C000900k implements AnonymousClass006 {
    public boolean A00 = false;
    public final Object A01 = C13690nt.A0Y();
    public volatile AnonymousClass2Re A02;

    public C110515eK() {
        C110105dW.A0t(this, 109);
    }

    public static String A02(String str, GetCredential getCredential, int i2) {
        return ((JSONObject) getCredential.A07.get(i2)).optString(str, "");
    }

    public AnonymousClass04o ABj() {
        return AnonymousClass2TA.A00(this, super.ABj());
    }

    public final Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    this.A02 = new AnonymousClass2Re(this);
                }
            }
        }
        return this.A02.generatedComponent();
    }
}
