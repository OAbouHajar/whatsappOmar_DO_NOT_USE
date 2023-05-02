package X;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.obwhatsapp.R;

/* renamed from: X.3N8  reason: invalid class name */
public class AnonymousClass3N8 extends ViewOutlineProvider {
    public final /* synthetic */ C42821yj A00;

    public AnonymousClass3N8(C42821yj r1) {
        this.A00 = r1;
    }

    public void getOutline(View view, Outline outline) {
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.dimen0256);
        outline.setOval(0, 0, dimensionPixelSize, dimensionPixelSize);
    }
}
