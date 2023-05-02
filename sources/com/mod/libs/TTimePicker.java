package com.mod.libs;

import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.TimePicker;

public class TTimePicker extends EditText implements View.OnClickListener, DialogInterface.OnClickListener {
    private TTR TR;
    private Context context;
    private TimePicker timePicker;

    public TTimePicker(Context context2) {
        super(context2);
        InitTimePicker(context2);
    }

    public TTimePicker(Context context2, AttributeSet attributeSet) {
        super(context2, attributeSet);
        InitTimePicker(context2);
    }

    public TTimePicker(Context context2, AttributeSet attributeSet, int i2) {
        super(context2, attributeSet, i2);
        InitTimePicker(context2);
    }

    public void InitTimePicker(Context context2) {
        this.context = context2;
        this.TR = new TTR(this.context);
        setFocusable(false);
        if (this.TR.GetEditText(this).isEmpty()) {
            setText("00:00");
        }
        setOnClickListener(this);
    }

    public void onClick(DialogInterface dialogInterface, int i2) {
        setText(this.TR.GetTimeFromPicker(this.timePicker));
    }

    public void onClick(View view) {
        this.timePicker = this.TR.ShowTimePickerDlg(this, this);
    }
}
