package X;

import android.os.Bundle;

/* renamed from: X.4Pr  reason: invalid class name and case insensitive filesystem */
public final class C85724Pr {
    public final Bundle A00;

    public C85724Pr(Bundle bundle) {
        if (bundle != null) {
            C90514eI.A03("startMessage", bundle);
            this.A00 = bundle;
            return;
        }
        throw AnonymousClass000.A0T("Bundle is null");
    }

    public byte[] A00() {
        Bundle bundle = this.A00;
        if (bundle.containsKey("startMessage")) {
            return bundle.getByteArray("startMessage");
        }
        throw AnonymousClass3K4.A0V();
    }
}
