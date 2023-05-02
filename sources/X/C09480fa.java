package X;

import androidx.preference.PreferenceGroup;

/* renamed from: X.0fa  reason: invalid class name and case insensitive filesystem */
public class C09480fa implements Runnable {
    public final /* synthetic */ PreferenceGroup A00;

    public C09480fa(PreferenceGroup preferenceGroup) {
        this.A00 = preferenceGroup;
    }

    public void run() {
        synchronized (this) {
            this.A00.A06.clear();
        }
    }
}
