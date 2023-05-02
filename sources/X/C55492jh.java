package X;

import android.content.Context;
import android.util.TypedValue;
import android.widget.LinearLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;

/* renamed from: X.2jh  reason: invalid class name and case insensitive filesystem */
public class C55492jh extends LinearLayout implements AnonymousClass006 {
    public WaImageView A00;
    public WaTextView A01;
    public C52662eE A02;
    public boolean A03;

    public C55492jh(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        LinearLayout.inflate(getContext(), R.layout.layout059a, this);
        setOrientation(0);
        setGravity(16);
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(16843534, typedValue, true);
        setBackgroundResource(typedValue.resourceId);
        this.A01 = (WaTextView) C004601z.A0E(this, R.id.storage_usage_sort_row_text);
        this.A00 = (WaImageView) C004601z.A0E(this, R.id.storage_usage_sort_row_checkmark);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A02;
        if (r0 == null) {
            r0 = new C52662eE(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void setChecked(boolean z2) {
        WaImageView waImageView = this.A00;
        int i2 = 8;
        if (z2) {
            i2 = 0;
        }
        waImageView.setVisibility(i2);
    }

    public void setText(String str) {
        this.A01.setText(str);
    }
}
