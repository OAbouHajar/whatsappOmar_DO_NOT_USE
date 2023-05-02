package X;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.res.Resources;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.38E  reason: invalid class name */
public class AnonymousClass38E {
    public static C005702l A00(Activity activity, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2, C16080sP r16, C16010sH r17, C17250um r18, ArrayList arrayList, Map map) {
        Resources resources;
        int i2;
        String A0F;
        Resources resources2;
        int i3;
        C16010sH r4 = r17;
        if (map != null && map.size() == 1) {
            r4 = C13680ns.A0U(C13680ns.A0q(map));
            map.clear();
        }
        C16080sP r6 = r16;
        if (map == null || map.isEmpty()) {
            if (r4 == null || !r4.A0J()) {
                if (arrayList == null || arrayList.size() <= 1) {
                    resources = activity.getResources();
                    i2 = R.string.str0534;
                    A0F = C13700nu.A0F(resources, r6.A08(r4), new Object[1], 0, i2);
                } else {
                    resources2 = activity.getResources();
                    i3 = R.plurals.plurals0023;
                }
            } else if (arrayList == null || arrayList.size() <= 1) {
                resources = activity.getResources();
                i2 = R.string.str0a4e;
                A0F = C13700nu.A0F(resources, r6.A08(r4), new Object[1], 0, i2);
            } else {
                resources2 = activity.getResources();
                i3 = R.plurals.plurals00a9;
            }
            int size = arrayList.size();
            Object[] objArr = new Object[2];
            AnonymousClass000.A1M(objArr, arrayList.size(), 0);
            objArr[1] = r6.A08(r4);
            A0F = resources2.getQuantityString(i3, size, objArr);
        } else {
            String A0M = r6.A0M(map.values(), 3, -1, false, true);
            if (arrayList == null || arrayList.size() <= 1) {
                A0F = C13700nu.A0F(activity.getResources(), A0M, new Object[1], 0, R.string.str0534);
            } else {
                Resources resources3 = activity.getResources();
                int size2 = arrayList.size();
                Object[] objArr2 = new Object[2];
                AnonymousClass000.A1M(objArr2, arrayList.size(), 0);
                objArr2[1] = A0M;
                A0F = resources3.getQuantityString(R.plurals.plurals0023, size2, objArr2);
            }
        }
        C32241fu A00 = C32241fu.A00(activity);
        A00.A06(AnonymousClass2Sy.A05(activity, r18, A0F));
        A00.A07(true);
        A00.setNegativeButton(R.string.str0394, onClickListener2);
        A00.setPositiveButton(R.string.str0e87, onClickListener);
        A00.A03(onCancelListener);
        return A00.create();
    }
}
