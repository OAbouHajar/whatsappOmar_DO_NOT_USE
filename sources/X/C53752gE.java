package X;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import com.facebook.redex.IDxLListenerShape144S0100000_2_I0;
import com.obwhatsapp.R;

/* renamed from: X.2gE  reason: invalid class name and case insensitive filesystem */
public class C53752gE extends Dialog implements C53762gF {
    public final int A00;
    public final C55602k1 A01;
    public final C102834zb A02;

    public C53752gE(Activity activity, AnonymousClass2Ra r3, C55602k1 r4, AnonymousClass4MW r5, int[] iArr, int i2) {
        super(activity, R.style.style013f);
        this.A01 = r4;
        this.A00 = i2;
        this.A02 = new C102834zb(r3, r4, r5, iArr);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C55602k1 r0 = this.A01;
        setContentView(r0);
        r0.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape144S0100000_2_I0(this, 20));
        C102834zb r4 = this.A02;
        Window window = getWindow();
        r4.A00 = this;
        r4.A03.A02(window, r4, r4.A04, r4.A05);
    }
}
