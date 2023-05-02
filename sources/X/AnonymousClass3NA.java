package X;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: X.3NA  reason: invalid class name */
public class AnonymousClass3NA extends ViewOutlineProvider {
    public final /* synthetic */ AnonymousClass2P3 A00;

    public /* synthetic */ AnonymousClass3NA(AnonymousClass2P3 r1) {
        this.A00 = r1;
    }

    public void getOutline(View view, Outline outline) {
        AnonymousClass2P3 r2 = this.A00;
        outline.setAlpha(((float) r2.A0K) / 255.0f);
        Rect rect = new Rect();
        r2.A0Y.roundOut(rect);
        outline.setRoundRect(rect, (float) r2.A0J);
    }
}
