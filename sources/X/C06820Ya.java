package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* renamed from: X.0Ya  reason: invalid class name and case insensitive filesystem */
public class C06820Ya implements View.OnApplyWindowInsetsListener {
    public AnonymousClass030 A00 = null;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C016507v A02;

    public C06820Ya(View view, C016507v r3) {
        this.A01 = view;
        this.A02 = r3;
    }

    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        AnonymousClass030 AMY;
        AnonymousClass030 A012 = AnonymousClass030.A01(view, windowInsets);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30) {
            AnonymousClass0XO.A0D(this.A01, windowInsets);
            if (A012.equals(this.A00)) {
                AMY = this.A02.AMY(view, A012);
                return AMY.A07();
            }
        }
        this.A00 = A012;
        AMY = this.A02.AMY(view, A012);
        if (i2 < 30) {
            C004601z.A0T(view);
        }
        return AMY.A07();
    }
}
