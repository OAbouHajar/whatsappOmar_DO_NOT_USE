package com.obwhatsapp;

import X.AnonymousClass0PG;
import X.AnonymousClass2Sy;
import X.AnonymousClass2T3;
import X.C005302h;
import X.C17250um;
import android.content.DialogInterface;
import android.graphics.Paint;

@Deprecated
public class LegacyMessageDialogFragment extends Hilt_LegacyMessageDialogFragment {
    public DialogInterface.OnClickListener A00;
    public DialogInterface.OnClickListener A01;
    public C17250um A02;

    public static AnonymousClass2T3 A01(Object[] objArr, int i2) {
        AnonymousClass2T3 r0 = new AnonymousClass2T3();
        r0.A01 = i2;
        r0.A0A = objArr;
        return r0;
    }

    public void A1S(C005302h r6) {
        int i2 = A04().getInt("message_view_id");
        if (i2 != 0) {
            AnonymousClass0PG r1 = r6.A01;
            r1.A0C = null;
            r1.A01 = i2;
            return;
        }
        CharSequence charSequence = A04().getCharSequence("message");
        if (charSequence == null) {
            charSequence = A1Q("message_res", "message_params_values", "message_params_types");
        }
        r6.A06(AnonymousClass2Sy.A03(A02(), (Paint) null, this.A02, charSequence));
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
