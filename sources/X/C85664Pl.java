package X;

import android.os.Bundle;

/* renamed from: X.4Pl  reason: invalid class name and case insensitive filesystem */
public final class C85664Pl {
    public final Bundle A00;

    public C85664Pl(Bundle bundle) {
        if (bundle != null) {
            C90514eI.A03("response", bundle);
            this.A00 = bundle;
            return;
        }
        throw AnonymousClass000.A0T("Bundle is null");
    }

    public byte[] A00() {
        Bundle bundle = this.A00;
        if (bundle.containsKey("response")) {
            return bundle.getByteArray("response");
        }
        throw AnonymousClass3K4.A0V();
    }
}
