package X;

import android.app.KeyguardManager;
import android.content.Intent;

/* renamed from: X.0L9  reason: invalid class name */
public class AnonymousClass0L9 {
    public static Intent A00(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
        return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
    }
}
