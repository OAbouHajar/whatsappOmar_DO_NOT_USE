package X;

import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.obwhatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment;

/* renamed from: X.3mI  reason: invalid class name and case insensitive filesystem */
public class C72533mI extends C72823ml {
    public final AppCompatCheckBox A00;
    public final FilterBottomSheetDialogFragment A01;

    public C72533mI(AppCompatCheckBox appCompatCheckBox, FilterBottomSheetDialogFragment filterBottomSheetDialogFragment) {
        super(appCompatCheckBox);
        this.A00 = appCompatCheckBox;
        this.A01 = filterBottomSheetDialogFragment;
        appCompatCheckBox.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
    }
}
