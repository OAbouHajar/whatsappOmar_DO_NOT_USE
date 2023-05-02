package X;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import com.facebook.redex.IDxCListenerShape128S0100000_2_I1;
import com.facebook.redex.IDxCListenerShape162S0100000_2_I1;
import com.obwhatsapp.R;

/* renamed from: X.45l  reason: invalid class name and case insensitive filesystem */
public class C807745l {
    public static Dialog A00(Context context, C19980zJ r8, AnonymousClass5OZ r9, C17220uj r10, boolean z2) {
        C32241fu A00 = C32241fu.A00(context);
        IDxCListenerShape128S0100000_2_I1 iDxCListenerShape128S0100000_2_I1 = new IDxCListenerShape128S0100000_2_I1(r9, 6);
        C91334fk r4 = new C91334fk(context, r8, r9, r10);
        IDxCListenerShape162S0100000_2_I1 iDxCListenerShape162S0100000_2_I1 = new IDxCListenerShape162S0100000_2_I1(r9, 1);
        Resources resources = context.getResources();
        int i2 = R.string.str1473;
        if (z2) {
            i2 = R.string.str1474;
        }
        A00.A06(resources.getString(i2));
        A00.setPositiveButton(R.string.str0e87, iDxCListenerShape128S0100000_2_I1);
        A00.setNegativeButton(R.string.str1cf6, r4);
        A00.A07(true);
        A00.A03(iDxCListenerShape162S0100000_2_I1);
        return A00.create();
    }
}
