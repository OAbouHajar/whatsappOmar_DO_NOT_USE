package X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.obwhatsapp.wabloks.commerce.ui.view.ExtensionsBottomsheetBaseContainer;

/* renamed from: X.3bh  reason: invalid class name and case insensitive filesystem */
public final class C67493bh extends C54882iQ {
    public final /* synthetic */ BottomSheetBehavior A00;
    public final /* synthetic */ ExtensionsBottomsheetBaseContainer A01;
    public final /* synthetic */ C30301c6 A02;
    public final /* synthetic */ C1041354b A03;

    public C67493bh(BottomSheetBehavior bottomSheetBehavior, ExtensionsBottomsheetBaseContainer extensionsBottomsheetBaseContainer, C30301c6 r3, C1041354b r4) {
        this.A03 = r4;
        this.A01 = extensionsBottomsheetBaseContainer;
        this.A02 = r3;
        this.A00 = bottomSheetBehavior;
    }

    public void A01(View view, float f2) {
    }

    public void A02(View view, int i2) {
        C18450wi.A0H(view, 0);
        if (i2 != 1) {
            if (i2 == 2) {
                float top2 = ((float) (view.getTop() - this.A03.element)) / ((float) view.getMeasuredHeight());
                C14710pd r1 = this.A01.A06;
                if (r1 != null) {
                    if (((double) top2) > ((double) ((float) r1.A02(2305))) / 100.0d) {
                        this.A02.element = true;
                        this.A00.A0M(5);
                        return;
                    }
                } else {
                    throw C18450wi.A03("abProps");
                }
            } else if (i2 != 5) {
                return;
            } else {
                if (this.A02.element) {
                    this.A01.A0D().finish();
                    return;
                }
            }
            this.A00.A0M(3);
            return;
        }
        this.A03.element = view.getTop();
    }
}
