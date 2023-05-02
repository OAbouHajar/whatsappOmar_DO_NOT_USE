package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.obwhatsapp.settings.SettingsRowIconText;

/* renamed from: X.2UH  reason: invalid class name */
public abstract class AnonymousClass2UH extends LinearLayout implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public AnonymousClass2UH(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public void A00() {
        if (!this.A01) {
            this.A01 = true;
            ((SettingsRowIconText) this).A04 = (AnonymousClass013) ((C52652eD) ((C52642eC) generatedComponent())).A07.AR8.get();
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
