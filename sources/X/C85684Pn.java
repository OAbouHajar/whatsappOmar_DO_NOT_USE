package X;

import android.os.Bundle;

/* renamed from: X.4Pn  reason: invalid class name and case insensitive filesystem */
public final class C85684Pn {
    public final Bundle A00;

    public C85684Pn(Bundle bundle) {
        if (bundle != null) {
            C90514eI.A03("capabilities", bundle);
            this.A00 = bundle;
            return;
        }
        throw AnonymousClass000.A0T("Bundle is null");
    }

    public byte[] A00() {
        Bundle bundle = this.A00;
        if (bundle.containsKey("capabilities")) {
            return bundle.getByteArray("capabilities");
        }
        throw AnonymousClass3K4.A0V();
    }
}
