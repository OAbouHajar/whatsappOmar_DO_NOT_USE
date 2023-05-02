package X;

import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;

/* renamed from: X.0c8  reason: invalid class name and case insensitive filesystem */
public class C07580c8 implements C13030lM {
    public static final C13030lM A00 = new C07580c8();

    public void A6F(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            Object tag = view.getTag(R.id.item_touch_helper_previous_elevation);
            if (tag != null && (tag instanceof Float)) {
                C004601z.A0X(view, AnonymousClass000.A04(tag));
            }
            view.setTag(R.id.item_touch_helper_previous_elevation, (Object) null);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    public void AQB(Canvas canvas, View view, RecyclerView recyclerView, float f2, float f3, int i2, boolean z2) {
        if (Build.VERSION.SDK_INT >= 21 && z2 && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            Float valueOf = Float.valueOf(C004601z.A00(view));
            int childCount = recyclerView.getChildCount();
            float f4 = 0.0f;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = recyclerView.getChildAt(i3);
                if (childAt != view) {
                    float A002 = C004601z.A00(childAt);
                    if (A002 > f4) {
                        f4 = A002;
                    }
                }
            }
            C004601z.A0X(view, f4 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
        }
        view.setTranslationX(f2);
        view.setTranslationY(f3);
    }
}
