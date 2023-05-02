package X;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.IDxEWrapperShape176S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.wabloks.ui.WaBloksActivity;
import com.whatsapp.util.Log;

/* renamed from: X.5oV  reason: invalid class name and case insensitive filesystem */
public class C114745oV extends C111545gY {
    public C29671b0 A00;
    public String A01;

    public C114745oV(AnonymousClass013 r1, WaBloksActivity waBloksActivity) {
        super(r1, waBloksActivity);
    }

    public void A03(Intent intent, Bundle bundle) {
        if (intent != null) {
            this.A01 = intent.getStringExtra("bk_phoenix_navbar_title");
            this.A01 = intent.getStringExtra("bk_phoenix_navbar_leading_button_icon");
        }
        A06();
    }

    public void A04(C108615Or r4) {
        try {
            this.A01 = r4.A9T().A0J(36);
            AnonymousClass4NW r2 = new AnonymousClass4NW(r4.A9T().A0G(40));
            if (AnonymousClass1ZW.A0E(this.A01)) {
                this.A01 = r2.A04;
            }
            this.A01 = r2.A01;
            if (r2.A00 != null) {
                this.A00 = new IDxEWrapperShape176S0100000_3_I1(r2, 2);
            }
            A06();
        } catch (ClassCastException e2) {
            Log.e(AnonymousClass000.A0g("Bloks: Invalid navigation bar type", e2));
        }
    }

    public final void A06() {
        A01().A0J(this.A01);
        AnonymousClass013 r3 = this.A02;
        WaBloksActivity waBloksActivity = this.A03;
        boolean equals = "close".equals(this.A01);
        int i2 = R.drawable.ic_back;
        if (equals) {
            i2 = R.drawable.ic_close;
        }
        ((Toolbar) AnonymousClass00T.A05(waBloksActivity, R.id.wabloks_screen_toolbar)).setNavigationIcon((Drawable) C110105dW.A0E(waBloksActivity, r3, i2));
    }
}
