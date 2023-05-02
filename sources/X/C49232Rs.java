package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.obwhatsapp.home.ui.HomePlaceholderActivity;

/* renamed from: X.2Rs  reason: invalid class name and case insensitive filesystem */
public abstract class C49232Rs extends LinearLayout implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public C49232Rs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A01) {
            this.A01 = true;
            HomePlaceholderActivity.HomePlaceholderView homePlaceholderView = (HomePlaceholderActivity.HomePlaceholderView) this;
            C16150sX r1 = ((C52652eD) ((C52642eC) generatedComponent())).A07;
            homePlaceholderView.A03 = (C19240y6) r1.AMu.get();
            homePlaceholderView.A06 = (C16320sq) r1.ARB.get();
            homePlaceholderView.A05 = (C17110uY) r1.ADT.get();
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
