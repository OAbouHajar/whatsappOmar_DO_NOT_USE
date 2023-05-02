package com.mod.libs;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

public class TDatePicker extends EditText implements View.OnClickListener, DialogInterface.OnClickListener {
    private TTR TR;
    private Context context;
    private DatePicker datePicker;

    public TDatePicker(Context context2) {
        super(context2);
        InitDatePicker(context2);
    }

    public TDatePicker(Context context2, AttributeSet attributeSet) {
        super(context2, attributeSet);
        InitDatePicker(context2);
    }

    public TDatePicker(Context context2, AttributeSet attributeSet, int i2) {
        super(context2, attributeSet, i2);
        InitDatePicker(context2);
    }

    public void InitDatePicker(Context context2) {
        this.context = context2;
        this.TR = new TTR(this.context);
        setFocusable(false);
        setText(TTR.GetDate());
        setOnClickListener(this);
    }

    public void onClick(DialogInterface dialogInterface, int i2) {
        setText(this.TR.GetDateFromPicker(this.datePicker));
    }

    public void onClick(View view) {
        this.datePicker = this.TR.ShowDatePickerDlg(this, this);
    }
}
