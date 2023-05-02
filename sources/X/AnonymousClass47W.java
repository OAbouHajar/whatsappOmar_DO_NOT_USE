package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.res.Resources;
import com.facebook.redex.IDxCListenerShape162S0100000_2_I1;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;
import java.util.Set;

/* renamed from: X.47W  reason: invalid class name */
public class AnonymousClass47W {
    public static Dialog A00(Activity activity, C14870pt r13, C16760tb r14, C17250um r15, AnonymousClass5QN r16, Set set) {
        Set set2 = set;
        if (set == null || set2.isEmpty()) {
            Log.e("dialog/delete no statuses");
            return null;
        }
        Resources resources = activity.getResources();
        int size = set2.size();
        Object[] A1b = C13680ns.A1b();
        AnonymousClass000.A1M(A1b, set2.size(), 0);
        String quantityString = resources.getQuantityString(R.plurals.plurals0034, size, A1b);
        Resources resources2 = activity.getResources();
        C32241fu A00 = C32241fu.A00(activity);
        A00.A07(true);
        A00.A06(AnonymousClass2Sy.A05(activity, r15, quantityString));
        A00.setPositiveButton(R.string.str1c4c, new C91434fu(activity, resources2, r13, r14, r16, set2));
        C13690nt.A1H(A00, activity, 104, R.string.str0394);
        A00.A03(new IDxCListenerShape162S0100000_2_I1(activity, 14));
        return A00.create();
    }
}
