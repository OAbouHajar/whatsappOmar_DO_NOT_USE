package X;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import com.obwhatsapp.payments.ui.ConfirmDateOfBirthBottomSheetFragment;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/* renamed from: X.4fW  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91194fW implements DatePickerDialog.OnDateSetListener {
    public final /* synthetic */ ConfirmDateOfBirthBottomSheetFragment A00;

    public /* synthetic */ C91194fW(ConfirmDateOfBirthBottomSheetFragment confirmDateOfBirthBottomSheetFragment) {
        this.A00 = confirmDateOfBirthBottomSheetFragment;
    }

    public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
        ConfirmDateOfBirthBottomSheetFragment confirmDateOfBirthBottomSheetFragment = this.A00;
        Calendar calendar = confirmDateOfBirthBottomSheetFragment.A0B;
        calendar.set(1, i2);
        calendar.set(2, i3);
        calendar.set(5, i4);
        AnonymousClass013 r0 = confirmDateOfBirthBottomSheetFragment.A06;
        if (r0 != null) {
            confirmDateOfBirthBottomSheetFragment.A1A().setText(new SimpleDateFormat("dd/MM/yyyy", C13690nt.A0m(r0)).format(calendar.getTime()));
            return;
        }
        throw C18450wi.A03("whatsAppLocale");
    }
}
