package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.storage.StorageUsageMediaPreviewOverflowOverlayView;

/* renamed from: X.3OB  reason: invalid class name */
public class AnonymousClass3OB extends FrameLayout implements AnonymousClass006 {
    public C54502hd A00;
    public C52662eE A01;
    public boolean A02;
    public final WaTextView A03;
    public final StorageUsageMediaPreviewOverflowOverlayView A04;

    public AnonymousClass3OB(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        C13680ns.A0G(this).inflate(R.layout.layout059c, this, true);
        this.A04 = (StorageUsageMediaPreviewOverflowOverlayView) C004601z.A0E(this, R.id.overflow_overlay_view);
        this.A03 = C13680ns.A0S(this, R.id.overflow_text_view);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A01;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void setFrameDrawable(Drawable drawable) {
        this.A04.setFrameDrawable(drawable);
        C54502hd r0 = this.A00;
        if (r0 != null) {
            r0.setFrameDrawable(drawable);
        }
    }
}
