package X;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.0Kg  reason: invalid class name and case insensitive filesystem */
public enum C03890Kg {
    REMOVED,
    VISIBLE,
    GONE,
    INVISIBLE;

    public static C03890Kg A00(int i2) {
        if (i2 == 0) {
            return VISIBLE;
        }
        if (i2 == 4) {
            return INVISIBLE;
        }
        if (i2 == 8) {
            return GONE;
        }
        throw AnonymousClass000.A0U(AnonymousClass000.A0r("Unknown visibility "), i2);
    }

    public static C03890Kg A01(View view) {
        return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : A00(view.getVisibility());
    }

    public void A02(View view) {
        int i2;
        int[] iArr = AnonymousClass0ND.A01;
        int ordinal = ordinal();
        int i3 = iArr[ordinal];
        if (ordinal != 0) {
            if (i3 == 2) {
                if (AnonymousClass02C.A02(2)) {
                    StringBuilder A0q = AnonymousClass000.A0q("SpecialEffectsController: Setting view ");
                    A0q.append(view);
                    Log.v("FragmentManager", AnonymousClass000.A0h(" to VISIBLE", A0q));
                }
                i2 = 0;
            } else if (i3 == 3) {
                if (AnonymousClass02C.A02(2)) {
                    StringBuilder A0q2 = AnonymousClass000.A0q("SpecialEffectsController: Setting view ");
                    A0q2.append(view);
                    Log.v("FragmentManager", AnonymousClass000.A0h(" to GONE", A0q2));
                }
                i2 = 8;
            } else if (i3 == 4) {
                if (AnonymousClass02C.A02(2)) {
                    StringBuilder A0q3 = AnonymousClass000.A0q("SpecialEffectsController: Setting view ");
                    A0q3.append(view);
                    Log.v("FragmentManager", AnonymousClass000.A0h(" to INVISIBLE", A0q3));
                }
                view.setVisibility(4);
                return;
            } else {
                return;
            }
            view.setVisibility(i2);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            if (AnonymousClass02C.A02(2)) {
                StringBuilder A0r = AnonymousClass000.A0r("SpecialEffectsController: Removing view ");
                A0r.append(view);
                Log.v("FragmentManager", AnonymousClass000.A0e(viewGroup, " from container ", A0r));
            }
            viewGroup.removeView(view);
        }
    }
}
