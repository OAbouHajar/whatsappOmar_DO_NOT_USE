package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.obwhatsapp.biz.catalog.view.PostcodeChangeBottomSheet;

/* renamed from: X.4jl  reason: invalid class name and case insensitive filesystem */
public class C93784jl implements TextWatcher {
    public final /* synthetic */ PostcodeChangeBottomSheet A00;

    public C93784jl(PostcodeChangeBottomSheet postcodeChangeBottomSheet) {
        this.A00 = postcodeChangeBottomSheet;
    }

    public void afterTextChanged(Editable editable) {
        int length = editable.toString().length();
        PostcodeChangeBottomSheet postcodeChangeBottomSheet = this.A00;
        if (length == 6) {
            postcodeChangeBottomSheet.A03.setVisibility(0);
            postcodeChangeBottomSheet.A05.setVisibility(8);
            postcodeChangeBottomSheet.A04.getBackground().clearColorFilter();
            return;
        }
        postcodeChangeBottomSheet.A1O();
    }

    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}
