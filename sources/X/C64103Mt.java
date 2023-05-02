package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.3Mt  reason: invalid class name and case insensitive filesystem */
public class C64103Mt extends View {
    public final /* synthetic */ int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64103Mt(Context context, int i2) {
        super(context);
        this.A00 = i2;
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(this.A00, 1073741824));
    }
}
