package X;

import android.view.View;

/* renamed from: X.4mh  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C95474mh implements C12540kZ {
    public final void Ah2(View view, float f2) {
        if (f2 >= -1.0f && f2 <= 1.0f) {
            view.setPivotX(((float) view.getWidth()) * 0.5f);
            view.setPivotY((float) view.getHeight());
            view.setRotation(f2 * 18.75f);
        }
    }
}
