package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.obwhatsapp.R;

/* renamed from: X.0Ca  reason: invalid class name and case insensitive filesystem */
public class C02470Ca extends RatingBar {
    public final C06160Un A00;

    public C02470Ca(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.attr0410);
        AnonymousClass08P.A03(getContext(), this);
        C06160Un r0 = new C06160Un(this);
        this.A00 = r0;
        r0.A01(attributeSet, R.attr.attr0410);
    }

    public synchronized void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        Bitmap bitmap = this.A00.A00;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i2, 0), getMeasuredHeight());
        }
    }
}
