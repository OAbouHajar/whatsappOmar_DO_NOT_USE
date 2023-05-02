package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.obwhatsapp.components.RoundCornerProgressBar;
import com.obwhatsapp.components.RoundCornerProgressBarV2;

/* renamed from: X.2TS  reason: invalid class name */
public abstract class AnonymousClass2TS extends View implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public AnonymousClass2TS(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
    }

    public void A00() {
        C52642eC r1;
        RoundCornerProgressBarV2 roundCornerProgressBarV2;
        if (this instanceof RoundCornerProgressBarV2) {
            RoundCornerProgressBarV2 roundCornerProgressBarV22 = (RoundCornerProgressBarV2) this;
            if (!roundCornerProgressBarV22.A01) {
                roundCornerProgressBarV22.A01 = true;
                r1 = (C52642eC) roundCornerProgressBarV22.generatedComponent();
                roundCornerProgressBarV2 = roundCornerProgressBarV22;
            } else {
                return;
            }
        } else if (!this.A01) {
            this.A01 = true;
            r1 = (C52642eC) generatedComponent();
            roundCornerProgressBarV2 = (RoundCornerProgressBar) this;
        } else {
            return;
        }
        roundCornerProgressBarV2.A05 = (AnonymousClass013) ((C52652eD) r1).A07.AR8.get();
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
