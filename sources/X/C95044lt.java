package X;

import android.view.View;
import com.obwhatsapp.contact.picker.IDxLAdapterShape4S0300000_2_I1;

/* renamed from: X.4lt  reason: invalid class name and case insensitive filesystem */
public abstract class C95044lt implements C13190lc {
    public void AMR(View view) {
        if (this instanceof AnonymousClass3oW) {
            AnonymousClass3oW r2 = (AnonymousClass3oW) this;
            if (r2.A00 != 0) {
                view.setTranslationX(0.0f);
            }
            if (r2.A01 != 0) {
                view.setTranslationY(0.0f);
            }
        } else if ((this instanceof IDxLAdapterShape4S0300000_2_I1) && 1 - ((IDxLAdapterShape4S0300000_2_I1) this).A03 == 0) {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
    }

    public abstract void AMS(View view);

    public abstract void AMT(View view);
}
