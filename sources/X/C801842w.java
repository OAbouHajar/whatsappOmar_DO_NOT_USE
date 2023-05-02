package X;

import android.content.Context;
import com.obwhatsapp.R;

/* renamed from: X.42w  reason: invalid class name and case insensitive filesystem */
public enum C801842w {
    EXTRA_SMALL(R.dimen.dimen089c, R.dimen.dimen08a3, R.dimen.dimen089e),
    SMALL(R.dimen.dimen08a1, R.dimen.dimen08a6, R.dimen.dimen089e),
    MEDIUM(R.dimen.dimen08a0, R.dimen.dimen08a5, R.dimen.dimen089e),
    LARGE(R.dimen.dimen089f, R.dimen.dimen08a4, R.dimen.dimen089d),
    EXTRA_LARGE(R.dimen.dimen089b, R.dimen.dimen08a2, R.dimen.dimen089d);
    
    public final int dimension;
    public final int innerStrokeWidth;
    public final int strokeWidth;

    /* access modifiers changed from: public */
    C801842w(int i2, int i3, int i4) {
        this.dimension = i2;
        this.strokeWidth = i3;
        this.innerStrokeWidth = i4;
    }

    public final AnonymousClass4W8 A00(Context context) {
        float dimension2 = context.getResources().getDimension(this.dimension);
        return new AnonymousClass4W8(new C87184Vt(dimension2, dimension2), context.getResources().getDimension(this.strokeWidth), context.getResources().getDimension(this.innerStrokeWidth));
    }
}
