package X;

import android.content.Context;
import android.util.AttributeSet;
import com.obwhatsapp.crop.CropImageView;

/* renamed from: X.2QN  reason: invalid class name */
public abstract class AnonymousClass2QN extends C006002o implements AnonymousClass006 {
    public C52662eE A00;

    public AnonymousClass2QN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        CropImageView cropImageView = (CropImageView) this;
        if (!cropImageView.A04) {
            cropImageView.A04 = true;
            cropImageView.generatedComponent();
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A00;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }
}
