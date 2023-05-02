package X;

import com.obwhatsapp.R;
import com.obwhatsapp.authentication.AppAuthenticationActivity;
import com.whatsapp.util.Log;

/* renamed from: X.3Oq  reason: invalid class name and case insensitive filesystem */
public class C64373Oq extends C05340Qi {
    public final /* synthetic */ AppAuthenticationActivity A00;

    public C64373Oq(AppAuthenticationActivity appAuthenticationActivity) {
        this.A00 = appAuthenticationActivity;
    }

    public void A00() {
        Log.i("AppAuthenticationActivity/failed");
        this.A00.A01 = 3;
    }

    public void A01(int i2, CharSequence charSequence) {
        Log.i("AppAuthenticationActivity/error");
        AppAuthenticationActivity appAuthenticationActivity = this.A00;
        appAuthenticationActivity.A01 = 3;
        appAuthenticationActivity.A06.A02(true);
        if (i2 == 7) {
            Log.i("AppAuthenticationActivity/error-too-many-attempts");
            C14870pt r4 = appAuthenticationActivity.A05;
            Object[] objArr = new Object[1];
            AnonymousClass000.A1M(objArr, 30, 0);
            r4.A0H(appAuthenticationActivity.getString(R.string.str00f3, objArr), 1);
        }
    }

    public void A02(C04730Nr r4) {
        Log.i("AppAuthenticationActivity/success");
        AppAuthenticationActivity appAuthenticationActivity = this.A00;
        appAuthenticationActivity.A01 = 3;
        appAuthenticationActivity.A06.A02(false);
        appAuthenticationActivity.A2m();
        appAuthenticationActivity.finish();
    }
}
