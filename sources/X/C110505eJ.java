package X;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.DatePicker;
import com.obwhatsapp.R;

/* renamed from: X.5eJ  reason: invalid class name and case insensitive filesystem */
public class C110505eJ extends C005702l implements DialogInterface.OnClickListener, DatePicker.OnDateChangedListener {
    public DatePickerDialog.OnDateSetListener A00;
    public final DatePicker A01;

    public C110505eJ(DatePickerDialog.OnDateSetListener onDateSetListener, Context context, int i2, int i3, int i4) {
        super(context, R.style.style0138);
        DatePicker datePicker = new DatePicker(getContext());
        this.A01 = datePicker;
        C06490Wi r1 = this.A00;
        r1.A0D = datePicker;
        r1.A06 = 0;
        A03(-1, context.getString(R.string.str0e87), this);
        A03(-2, context.getString(R.string.str0394), this);
        datePicker.init(i2, i3, i4, this);
        this.A00 = onDateSetListener;
    }

    public DatePicker A04() {
        return this.A01;
    }

    public void onClick(DialogInterface dialogInterface, int i2) {
        DatePickerDialog.OnDateSetListener onDateSetListener;
        if (i2 == -2) {
            cancel();
        } else if (i2 == -1 && (onDateSetListener = this.A00) != null) {
            DatePicker datePicker = this.A01;
            datePicker.clearFocus();
            onDateSetListener.onDateSet(datePicker, datePicker.getYear(), datePicker.getMonth(), datePicker.getDayOfMonth());
        }
    }

    public void onDateChanged(DatePicker datePicker, int i2, int i3, int i4) {
        this.A01.init(i2, i3, i4, this);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        this.A01.init(bundle.getInt("year"), bundle.getInt("month"), bundle.getInt("day"), this);
    }

    public Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        DatePicker datePicker = this.A01;
        onSaveInstanceState.putInt("year", datePicker.getYear());
        onSaveInstanceState.putInt("month", datePicker.getMonth());
        onSaveInstanceState.putInt("day", datePicker.getDayOfMonth());
        return onSaveInstanceState;
    }
}
