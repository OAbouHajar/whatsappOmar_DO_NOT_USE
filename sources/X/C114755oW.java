package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.redex.IDxPCallbackShape467S0100000_3_I1;
import com.obwhatsapp.wabloks.ui.WaBloksActivity;

/* renamed from: X.5oW  reason: invalid class name and case insensitive filesystem */
public class C114755oW extends C111545gY {
    public final C118775vE A00;

    public C114755oW(AnonymousClass013 r2, WaBloksActivity waBloksActivity) {
        super(r2, waBloksActivity);
        this.A00 = new C118775vE(waBloksActivity, r2);
    }

    public void A03(Intent intent, Bundle bundle) {
        if (bundle != null) {
            this.A01 = bundle.getString("bk_navigation_bar_title");
        }
        A01().A0J(this.A01);
        if (intent != null) {
            this.A00.A01(this.A00, new IDxPCallbackShape467S0100000_3_I1(this.A03, 1), intent.getStringExtra("fds_on_back"), intent.getStringExtra("fds_on_back_params"), intent.getStringExtra("fds_button_style"));
        }
    }

    public void A04(C108615Or r3) {
        this.A01 = r3.A9T().A0J(36);
        A01().A0J(this.A01);
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        bundle.putString("bk_navigation_bar_title", this.A01);
        super.onActivitySaveInstanceState(activity, bundle);
    }
}
