package com.facebook.redex;

import X.AnonymousClass01A;
import X.C001000l;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import com.obwhatsapp.backup.google.SingleChoiceListDialogFragment;

public class IDxCListenerShape0S0201000_2_I1 implements DialogInterface.OnClickListener {
    public int A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public IDxCListenerShape0S0201000_2_I1(Object obj, int i2, Object obj2, int i3) {
        this.A03 = i3;
        this.A01 = obj2;
        this.A02 = obj;
        this.A00 = i2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        C001000l A0C;
        if (this.A03 != 0) {
            AnonymousClass01A r3 = (AnonymousClass01A) this.A01;
            Intent intent = (Intent) this.A02;
            int i3 = this.A00;
            if (i2 == -1 && (A0C = r3.A0C()) != null && !A0C.isFinishing()) {
                r3.A0C().startActivityForResult(intent, i3);
                return;
            }
            return;
        }
        int i4 = this.A00;
        SingleChoiceListDialogFragment.A01(dialogInterface, (Bundle) this.A02, (SingleChoiceListDialogFragment) this.A01, i4, i2);
    }
}
