package X;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0Ey  reason: invalid class name and case insensitive filesystem */
public class C02790Ey extends AnonymousClass0V5 {
    public C02790Ey(ViewGroup viewGroup) {
        super(viewGroup);
    }

    public static void A00(AnonymousClass00N r1, Collection collection) {
        Iterator it = r1.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(C004601z.A0L((View) AnonymousClass000.A0z(it).getValue()))) {
                it.remove();
            }
        }
    }

    public void A07(View view, ArrayList arrayList) {
        Boolean bool;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (Build.VERSION.SDK_INT < 21 ? ((bool = (Boolean) viewGroup.getTag(R.id.tag_transition_group)) == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C004601z.A0L(viewGroup) == null : !C04180Lm.A00(viewGroup)) {
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt.getVisibility() == 0) {
                        A07(childAt, arrayList);
                    }
                }
            } else if (!arrayList.contains(view)) {
                arrayList.add(viewGroup);
            }
        } else if (!arrayList.contains(view)) {
            arrayList.add(view);
        }
    }

    public void A08(View view, Map map) {
        String A0L = C004601z.A0L(view);
        if (A0L != null) {
            map.put(A0L, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    A08(childAt, map);
                }
            }
        }
    }
}
