package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.obwhatsapp.mentions.MentionPickerView;

/* renamed from: X.2VY  reason: invalid class name */
public abstract class AnonymousClass2VY extends FrameLayout implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public AnonymousClass2VY(Context context) {
        super(context);
        A00();
    }

    public AnonymousClass2VY(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public AnonymousClass2VY(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
    }

    public AnonymousClass2VY(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        A00();
    }

    public void A00() {
        if (this instanceof MentionPickerView) {
            MentionPickerView mentionPickerView = (MentionPickerView) this;
            if (!mentionPickerView.A0H) {
                mentionPickerView.A0H = true;
                C16150sX r2 = ((C52652eD) ((C52642eC) mentionPickerView.generatedComponent())).A07;
                mentionPickerView.A05 = (C14710pd) r2.A05.get();
                mentionPickerView.A04 = (AnonymousClass01V) r2.AOi.get();
                mentionPickerView.A0C = (C19990zK) r2.AEZ.get();
                mentionPickerView.A01 = (C16040sK) r2.ADr.get();
                mentionPickerView.A0F = (C16320sq) r2.ARB.get();
                mentionPickerView.A05 = (C17200uh) r2.A52.get();
                mentionPickerView.A02 = (C16000sG) r2.A4x.get();
                mentionPickerView.A04 = (C16080sP) r2.AQ9.get();
                mentionPickerView.A06 = (AnonymousClass013) r2.AR8.get();
                mentionPickerView.A07 = (C16460t6) r2.A5k.get();
                mentionPickerView.A0E = new C25781Lc();
                mentionPickerView.A03 = C16150sX.A0O(r2);
                mentionPickerView.A08 = (C16070sO) r2.ABY.get();
            }
        } else if (!this.A01) {
            this.A01 = true;
            generatedComponent();
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
