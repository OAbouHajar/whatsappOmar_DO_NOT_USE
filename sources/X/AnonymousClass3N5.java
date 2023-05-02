package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;

/* renamed from: X.3N5  reason: invalid class name */
public class AnonymousClass3N5 extends ViewOutlineProvider {
    public final /* synthetic */ Chip A00;

    public AnonymousClass3N5(Chip chip) {
        this.A00 = chip;
    }

    public void getOutline(View view, Outline outline) {
        C56352nV r0 = this.A00.A04;
        if (r0 != null) {
            r0.getOutline(outline);
        } else {
            outline.setAlpha(0.0f);
        }
    }
}
