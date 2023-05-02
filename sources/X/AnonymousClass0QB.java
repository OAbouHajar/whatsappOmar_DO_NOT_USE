package X;

import android.os.Bundle;

/* renamed from: X.0QB  reason: invalid class name */
public class AnonymousClass0QB {
    public final Bundle A00;

    public AnonymousClass0QB(Bundle bundle) {
        this.A00 = bundle;
    }

    public long A00() {
        return this.A00.getLong("referrer_click_timestamp_seconds");
    }

    public String A01() {
        return this.A00.getString("install_referrer");
    }
}
