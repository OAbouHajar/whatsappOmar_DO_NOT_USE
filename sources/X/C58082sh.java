package X;

import android.app.Dialog;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.obwhatsapp.R;
import com.obwhatsapp.languageselector.LanguageSelectorBottomSheet;

/* renamed from: X.2sh  reason: invalid class name and case insensitive filesystem */
public class C58082sh extends C54882iQ {
    public final /* synthetic */ BottomSheetBehavior A00;
    public final /* synthetic */ LanguageSelectorBottomSheet A01;

    public C58082sh(BottomSheetBehavior bottomSheetBehavior, LanguageSelectorBottomSheet languageSelectorBottomSheet) {
        this.A01 = languageSelectorBottomSheet;
        this.A00 = bottomSheetBehavior;
    }

    public void A01(View view, float f2) {
        View A0E = C004601z.A0E(view, R.id.topHandle);
        if (((double) f2) > 0.7d && f2 < 1.0f) {
            A0E.setAlpha(1.0f - f2);
        } else if (f2 == 1.0f) {
            A0E.setAlpha(0.0f);
            A0E.setVisibility(8);
        }
    }

    public void A02(View view, int i2) {
        LanguageSelectorBottomSheet languageSelectorBottomSheet = this.A01;
        Dialog dialog = languageSelectorBottomSheet.A03;
        View A0E = C004601z.A0E(view, R.id.topHandle);
        if (i2 == 3) {
            this.A00.A0N = true;
            if (dialog != null) {
                C434920f.A02(R.color.color04e7, dialog);
            }
            view.setBackgroundColor(languageSelectorBottomSheet.A03().getColor(R.color.color04e7));
            A0E.setVisibility(8);
            return;
        }
        if (dialog != null) {
            C434920f.A02(R.color.color0792, dialog);
        }
        view.setBackground(C13690nt.A0C(view.getContext(), R.drawable.language_selector_bottomsheet_background));
        if (i2 != 4) {
            A0E.setVisibility(0);
            if (i2 == 5) {
                languageSelectorBottomSheet.A1C();
            }
        }
    }
}
