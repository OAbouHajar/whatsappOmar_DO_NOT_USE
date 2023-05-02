package X;

import android.view.View;
import com.obwhatsapp.authentication.AppAuthSettingsActivity;

/* renamed from: X.4k7  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C93984k7 implements View.OnClickListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AppAuthSettingsActivity A01;

    public /* synthetic */ C93984k7(AppAuthSettingsActivity appAuthSettingsActivity, long j2) {
        this.A01 = appAuthSettingsActivity;
        this.A00 = j2;
    }

    public final void onClick(View view) {
        C13680ns.A0x(this.A01.A09.A0K(), "privacy_fingerprint_timeout", this.A00);
    }
}
