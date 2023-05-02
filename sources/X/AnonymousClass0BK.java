package X;

import android.os.Handler;
import android.os.Message;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.PreferenceScreen;

/* renamed from: X.0BK  reason: invalid class name */
public class AnonymousClass0BK extends Handler {
    public final /* synthetic */ PreferenceFragmentCompat A00;

    public AnonymousClass0BK(PreferenceFragmentCompat preferenceFragmentCompat) {
        this.A00 = preferenceFragmentCompat;
    }

    public void handleMessage(Message message) {
        if (message.what == 1) {
            PreferenceFragmentCompat preferenceFragmentCompat = this.A00;
            PreferenceScreen preferenceScreen = preferenceFragmentCompat.A02.A07;
            if (preferenceScreen != null) {
                preferenceFragmentCompat.A03.setAdapter(new AnonymousClass0Fb(preferenceScreen));
                preferenceScreen.A06();
            }
        }
    }
}
