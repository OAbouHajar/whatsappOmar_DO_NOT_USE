package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* renamed from: X.0GE  reason: invalid class name */
public class AnonymousClass0GE extends C015707n {
    public static final String[] A00 = {"android:clipBounds:clip"};

    public static final void A00(C06230Uw r4) {
        View view = r4.A00;
        if (view.getVisibility() != 8) {
            Rect A0B = C004601z.A0B(view);
            Map map = r4.A02;
            map.put("android:clipBounds:clip", A0B);
            if (A0B == null) {
                map.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
            }
        }
    }

    public Animator A0S(ViewGroup viewGroup, C06230Uw r12, C06230Uw r13) {
        ObjectAnimator objectAnimator = null;
        if (!(r12 == null || r13 == null)) {
            Map map = r12.A02;
            if (map.containsKey("android:clipBounds:clip")) {
                Map map2 = r13.A02;
                if (map2.containsKey("android:clipBounds:clip")) {
                    Rect rect = (Rect) map.get("android:clipBounds:clip");
                    Object obj = map2.get("android:clipBounds:clip");
                    boolean A1W = AnonymousClass000.A1W(obj);
                    if (!(rect == null && obj == null)) {
                        if (rect == null) {
                            rect = (Rect) map.get("android:clipBounds:bounds");
                        } else if (obj == null) {
                            obj = map2.get("android:clipBounds:bounds");
                        }
                        if (!rect.equals(obj)) {
                            View view = r13.A00;
                            C004601z.A0i(view, rect);
                            AnonymousClass0XY r2 = new AnonymousClass0XY(AnonymousClass000.A0J());
                            objectAnimator = ObjectAnimator.ofObject(view, C06430Vt.A00, r2, new Rect[]{rect, obj});
                            if (A1W) {
                                objectAnimator.addListener(new C020309l(view, this));
                                return objectAnimator;
                            }
                        }
                    }
                }
            }
        }
        return objectAnimator;
    }

    public String[] A0U() {
        return A00;
    }

    public void A0V(C06230Uw r1) {
        A00(r1);
    }

    public void A0W(C06230Uw r1) {
        A00(r1);
    }
}
