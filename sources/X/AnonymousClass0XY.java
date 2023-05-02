package X;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* renamed from: X.0XY  reason: invalid class name */
public class AnonymousClass0XY implements TypeEvaluator {
    public Rect A00;

    public AnonymousClass0XY() {
    }

    public AnonymousClass0XY(Rect rect) {
        this.A00 = rect;
    }

    public /* bridge */ /* synthetic */ Object evaluate(float f2, Object obj, Object obj2) {
        Rect rect = (Rect) obj;
        Rect rect2 = (Rect) obj2;
        int A06 = AnonymousClass000.A06(f2, rect2.left, rect.left);
        int A062 = AnonymousClass000.A06(f2, rect2.top, rect.top);
        int A063 = AnonymousClass000.A06(f2, rect2.right, rect.right);
        int A064 = AnonymousClass000.A06(f2, rect2.bottom, rect.bottom);
        Rect rect3 = this.A00;
        if (rect3 == null) {
            return new Rect(A06, A062, A063, A064);
        }
        rect3.set(A06, A062, A063, A064);
        return rect3;
    }
}
