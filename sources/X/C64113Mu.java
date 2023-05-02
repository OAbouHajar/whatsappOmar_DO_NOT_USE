package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.View;

/* renamed from: X.3Mu  reason: invalid class name and case insensitive filesystem */
public class C64113Mu extends View {
    public final /* synthetic */ C615539j A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64113Mu(Context context, C615539j r2) {
        super(context);
        this.A00 = r2;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C615539j r0 = this.A00;
        Path A02 = r0.A02();
        if (A02 != null) {
            canvas.drawPath(A02, r0.A02);
        }
    }
}
