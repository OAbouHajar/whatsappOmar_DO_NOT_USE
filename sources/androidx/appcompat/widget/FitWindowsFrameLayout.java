package androidx.appcompat.widget;

import X.AnonymousClass030;
import X.AnonymousClass092;
import X.AnonymousClass095;
import X.AnonymousClass096;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class FitWindowsFrameLayout extends FrameLayout implements AnonymousClass092 {
    public AnonymousClass096 A00;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean fitSystemWindows(Rect rect) {
        AnonymousClass096 r0 = this.A00;
        if (r0 != null) {
            rect.top = ((AnonymousClass095) r0).A00.A0J(rect, (AnonymousClass030) null);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(AnonymousClass096 r1) {
        this.A00 = r1;
    }
}
