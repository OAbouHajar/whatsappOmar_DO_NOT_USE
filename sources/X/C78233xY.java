package X;

import android.os.Bundle;
import android.widget.Button;
import com.facebook.redex.ViewOnClickCListenerShape20S0100000_I1_5;
import com.obwhatsapp.R;

/* renamed from: X.3xY  reason: invalid class name and case insensitive filesystem */
public abstract class C78233xY extends C78243xZ implements C49282Sg {
    public Button A00;
    public C16000sG A01;
    public C16080sP A02;

    public int A35() {
        return R.layout.layout061a;
    }

    public String A36() {
        int i2;
        if (this.A00 == null) {
            boolean A09 = C434920f.A09(this);
            i2 = R.string.str1b66;
            if (A09) {
                i2 = R.string.str1b65;
            }
        } else {
            boolean z2 = this.A01;
            i2 = R.string.str1b69;
            if (z2) {
                i2 = R.string.str1b6a;
            }
        }
        return getString(i2);
    }

    public abstract void A37(C15830rv r1);

    public void AXH(int i2, int i3) {
        if (i2 == 100) {
            A37(i3 == 0 ? this.A00 : null);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.str1b5a);
        Button button = (Button) AnonymousClass00T.A05(this, R.id.set_wallpaper_button);
        this.A00 = button;
        button.setOnClickListener(new ViewOnClickCListenerShape20S0100000_I1_5((Object) this, 23));
    }
}
