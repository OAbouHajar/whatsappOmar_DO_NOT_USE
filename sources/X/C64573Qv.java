package X;

import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.obwhatsapp.R;
import com.obwhatsapp.businessdirectory.view.custom.FilterBottomSheetDialogFragment;
import java.util.List;

/* renamed from: X.3Qv  reason: invalid class name and case insensitive filesystem */
public class C64573Qv extends AnonymousClass01X {
    public List A00 = AnonymousClass000.A0u();
    public final FilterBottomSheetDialogFragment A01;

    public C64573Qv(FilterBottomSheetDialogFragment filterBottomSheetDialogFragment) {
        this.A01 = filterBottomSheetDialogFragment;
    }

    public int A0C() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r2, int i2) {
        ((C65133Sz) r2).A08(this.A00.get(i2));
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        return new C72533mI((AppCompatCheckBox) C13680ns.A0G(viewGroup).inflate(R.layout.layout0284, (ViewGroup) null), this.A01);
    }
}
