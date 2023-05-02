package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/* renamed from: X.3Ol  reason: invalid class name */
public class AnonymousClass3Ol extends C006002o implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public AnonymousClass3Ol(Context context) {
        super(context, (AttributeSet) null);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void onMeasure(int i2, int i3) {
        int defaultSize = ImageView.getDefaultSize(getSuggestedMinimumWidth(), i2);
        setMeasuredDimension(defaultSize, (int) (((double) ((float) defaultSize)) * 1.5d));
    }
}
