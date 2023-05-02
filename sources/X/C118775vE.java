package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.Toolbar;
import com.facebook.redex.ViewOnClickCListenerShape20S0100000_I1_5;
import com.obwhatsapp.R;

/* renamed from: X.5vE  reason: invalid class name and case insensitive filesystem */
public final class C118775vE {
    public String A00;
    public String A01;
    public String A02 = "BACK";
    public final C14550pN A03;
    public final AnonymousClass013 A04;

    public C118775vE(C14550pN r2, AnonymousClass013 r3) {
        C18450wi.A0J(r3, r2);
        this.A04 = r3;
        this.A03 = r2;
    }

    public final Drawable A00() {
        if (C18450wi.A0R(this.A02, "NONE")) {
            return null;
        }
        AnonymousClass013 r3 = this.A04;
        C14550pN r2 = this.A03;
        boolean A0R = C18450wi.A0R(this.A02, "CLOSE");
        int i2 = R.drawable.ic_back;
        if (A0R) {
            i2 = R.drawable.ic_close;
        }
        return C110105dW.A0E(r2, r3, i2);
    }

    public final void A01(Toolbar toolbar, C109035Ql r4, String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        if (str3 == null) {
            this.A02 = "BACK";
        } else {
            this.A02 = str3;
        }
        Drawable A002 = A00();
        if (toolbar != null) {
            toolbar.setNavigationIcon(A002);
        }
        Resources resources = this.A03.getResources();
        if (resources == null) {
            if (toolbar == null) {
                return;
            }
        } else if (toolbar != null) {
            toolbar.setBackgroundColor(resources.getColor(R.color.color0807));
        } else {
            return;
        }
        toolbar.setNavigationOnClickListener(new ViewOnClickCListenerShape20S0100000_I1_5((Object) r4, 49));
    }
}
