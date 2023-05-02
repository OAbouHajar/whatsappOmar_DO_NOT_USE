package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.components.button.ThumbnailButton;

/* renamed from: X.3OP  reason: invalid class name */
public class AnonymousClass3OP extends LinearLayout implements AnonymousClass006 {
    public int A00;
    public LinearLayout A01;
    public ThumbnailButton A02;
    public C52662eE A03;
    public boolean A04;

    public AnonymousClass3OP(Context context) {
        super(context, (AttributeSet) null, 0);
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
        LinearLayout.inflate(getContext(), R.layout.layout00cc, this);
        setOrientation(1);
        setGravity(1);
        this.A01 = (LinearLayout) findViewById(R.id.contact_photo_layout);
        this.A02 = (ThumbnailButton) findViewById(R.id.contact_photo);
        this.A00 = getResources().getDimensionPixelSize(R.dimen.dimen00ee);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A03;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public ThumbnailButton getContactPhoto() {
        return this.A02;
    }

    public LinearLayout getContactPhotoLayout() {
        return this.A01;
    }
}
