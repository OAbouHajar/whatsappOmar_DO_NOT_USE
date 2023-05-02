package X;

import android.content.Context;
import android.util.SparseArray;
import androidx.fragment.app.DialogFragment;
import com.obwhatsapp.R;

/* renamed from: X.0T0  reason: invalid class name */
public final class AnonymousClass0T0 {
    public static C05070Pd A00(Context context, DialogFragment dialogFragment, C05280Qa r5, AnonymousClass2Wa r6, AnonymousClass4DF r7, String str) {
        Context context2 = context;
        C05070Pd r3 = new C05070Pd(new C57842s0(context), str);
        A01(context2, dialogFragment, r3, r5, r6, r7);
        return r3;
    }

    public static void A01(Context context, DialogFragment dialogFragment, C05070Pd r9, C05280Qa r10, AnonymousClass2Wa r11, AnonymousClass4DF r12) {
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(R.id.cds_bottom_sheet_screen_data, r9);
        Context context2 = context;
        AnonymousClass0X5 A00 = AnonymousClass0X5.A00(context2, sparseArray, r10, r11, ((C13550mZ) dialogFragment).A7F((AnonymousClass22A) null, false), r12);
        A00.A0A(context2, (C12710kq) dialogFragment);
        A00.A01.AKm("cds_bottomsheet", true);
        r9.A00 = A00;
    }
}
