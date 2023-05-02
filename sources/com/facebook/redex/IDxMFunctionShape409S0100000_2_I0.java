package com.facebook.redex;

import X.AnonymousClass5OX;
import android.os.ResultReceiver;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.obwhatsapp.WaEditText;

public class IDxMFunctionShape409S0100000_2_I0 implements AnonymousClass5OX {
    public Object A00;
    public final int A01;

    public IDxMFunctionShape409S0100000_2_I0(WaEditText waEditText, int i2) {
        this.A01 = i2;
        this.A00 = waEditText;
    }

    public final boolean A5r(ResultReceiver resultReceiver, InputMethodManager inputMethodManager) {
        return this.A01 != 0 ? inputMethodManager.hideSoftInputFromWindow(((View) this.A00).getWindowToken(), 0, resultReceiver) : inputMethodManager.showSoftInput((View) this.A00, 0, resultReceiver);
    }
}
