package X;

import android.app.DatePickerDialog;
import android.widget.DatePicker;
import android.widget.EditText;
import com.obwhatsapp.payments.ui.IndiaUpiPauseMandateActivity;
import java.text.DateFormat;

/* renamed from: X.5xu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C119455xu implements DatePickerDialog.OnDateSetListener {
    public final /* synthetic */ EditText A00;
    public final /* synthetic */ IndiaUpiPauseMandateActivity A01;
    public final /* synthetic */ DateFormat A02;

    public /* synthetic */ C119455xu(EditText editText, IndiaUpiPauseMandateActivity indiaUpiPauseMandateActivity, DateFormat dateFormat) {
        this.A01 = indiaUpiPauseMandateActivity;
        this.A00 = editText;
        this.A02 = dateFormat;
    }

    public final void onDateSet(DatePicker datePicker, int i2, int i3, int i4) {
        IndiaUpiPauseMandateActivity indiaUpiPauseMandateActivity = this.A01;
        this.A00.setText(this.A02.format(Long.valueOf(IndiaUpiPauseMandateActivity.A02(datePicker))));
        indiaUpiPauseMandateActivity.A3s();
    }
}
