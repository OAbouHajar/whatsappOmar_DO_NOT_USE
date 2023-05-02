package X;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.0WS  reason: invalid class name */
public abstract class AnonymousClass0WS {
    public static void A00(View view, Rect rect) {
        if (C004601z.A0t(view)) {
            RectF A0K = AnonymousClass000.A0K();
            A0K.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
            view.getMatrix().mapRect(A0K);
            A0K.offset((float) view.getLeft(), (float) view.getTop());
            ViewParent parent = view.getParent();
            while (parent instanceof View) {
                View view2 = (View) parent;
                A0K.offset((float) (-view2.getScrollX()), (float) (-view2.getScrollY()));
                view2.getMatrix().mapRect(A0K);
                A0K.offset((float) view2.getLeft(), (float) view2.getTop());
                parent = view2.getParent();
            }
            int[] iArr = new int[2];
            view.getRootView().getLocationOnScreen(iArr);
            A0K.offset((float) iArr[0], (float) iArr[1]);
            rect.set(Math.round(A0K.left), Math.round(A0K.top), Math.round(A0K.right), Math.round(A0K.bottom));
        }
    }

    public static void A01(View view, List list) {
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            if (list.get(i2) != view) {
                i2++;
            } else {
                return;
            }
        }
        if (C004601z.A0L(view) != null) {
            list.add(view);
        }
        for (int i3 = size; i3 < list.size(); i3++) {
            View view2 = (View) list.get(i3);
            if (view2 instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view2;
                int childCount = viewGroup.getChildCount();
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = viewGroup.getChildAt(i4);
                    int i5 = 0;
                    while (true) {
                        if (i5 < size) {
                            if (list.get(i5) == childAt) {
                                break;
                            }
                            i5++;
                        } else if (C004601z.A0L(childAt) != null) {
                            list.add(childAt);
                        }
                    }
                }
            }
        }
    }

    public abstract Object A02(Object obj);

    public abstract Object A03(Object obj);

    public abstract Object A04(Object obj, Object obj2, Object obj3);

    public abstract Object A05(Object obj, Object obj2, Object obj3);

    public abstract void A06(Rect rect, Object obj);

    public abstract void A07(View view, Object obj);

    public abstract void A08(View view, Object obj);

    public abstract void A09(View view, Object obj, ArrayList arrayList);

    public abstract void A0A(View view, Object obj, ArrayList arrayList);

    public abstract void A0B(ViewGroup viewGroup, Object obj);

    public abstract void A0C(AnonymousClass024 r1, AnonymousClass01A r2, Object obj, Runnable runnable);

    public abstract void A0D(Object obj, Object obj2, Object obj3, Object obj4, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3);

    public abstract void A0E(Object obj, ArrayList arrayList);

    public abstract void A0F(Object obj, ArrayList arrayList, ArrayList arrayList2);

    public abstract boolean A0G(Object obj);
}
