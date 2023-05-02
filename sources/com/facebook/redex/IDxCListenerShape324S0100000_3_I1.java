package com.facebook.redex;

import X.AnonymousClass000;
import X.C004601z;
import android.widget.RadioGroup;
import com.obwhatsapp.dmsetting.ChangeDMSettingActivity;
import com.obwhatsapp.ephemeral.ChangeEphemeralSettingActivity;

public class IDxCListenerShape324S0100000_3_I1 implements RadioGroup.OnCheckedChangeListener {
    public Object A00;
    public final int A01;

    public IDxCListenerShape324S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i2) {
        int i3 = this.A01;
        Object obj = this.A00;
        if (i3 != 0) {
            ((ChangeEphemeralSettingActivity) obj).A02 = AnonymousClass000.A0D(C004601z.A0E(radioGroup, i2).getTag());
            return;
        }
        ChangeDMSettingActivity changeDMSettingActivity = (ChangeDMSettingActivity) obj;
        int A0D = AnonymousClass000.A0D(C004601z.A0E(radioGroup, i2).getTag());
        changeDMSettingActivity.A03 = A0D;
        changeDMSettingActivity.A36(A0D);
    }
}
