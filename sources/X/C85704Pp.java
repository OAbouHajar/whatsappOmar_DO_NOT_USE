package X;

import android.os.Bundle;

/* renamed from: X.4Pp  reason: invalid class name and case insensitive filesystem */
public final class C85704Pp {
    public final Bundle A00;

    public C85704Pp(Bundle bundle) {
        if (bundle != null) {
            C90514eI.A03("verifier", bundle);
            this.A00 = bundle;
            return;
        }
        throw AnonymousClass000.A0T("Bundle is null");
    }

    public byte[] A00() {
        Bundle bundle = this.A00;
        if (bundle.containsKey("verifier")) {
            return bundle.getByteArray("verifier");
        }
        throw AnonymousClass3K4.A0V();
    }
}
