package X;

import android.os.Bundle;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;

/* renamed from: X.4mV  reason: invalid class name and case insensitive filesystem */
public final class C95354mV implements AnonymousClass04A {
    public final /* synthetic */ SignInHubActivity A00;

    public /* synthetic */ C95354mV(SignInHubActivity signInHubActivity) {
        this.A00 = signInHubActivity;
    }

    public final AnonymousClass0SB APC(Bundle bundle, int i2) {
        SignInHubActivity signInHubActivity = this.A00;
        Set set = C437121f.A00;
        synchronized (set) {
        }
        return new AnonymousClass3QF(signInHubActivity, set);
    }

    public final /* bridge */ /* synthetic */ void ASs(AnonymousClass0SB r4, Object obj) {
        SignInHubActivity signInHubActivity = this.A00;
        signInHubActivity.setResult(signInHubActivity.A00, signInHubActivity.A01);
        signInHubActivity.finish();
    }

    public final void ASy(AnonymousClass0SB r1) {
    }
}
