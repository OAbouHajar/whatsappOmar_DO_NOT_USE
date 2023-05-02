package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.obwhatsapp.components.Button;
import com.obwhatsapp.wds.components.button.WDSButton;

/* renamed from: X.2VM  reason: invalid class name */
public abstract class AnonymousClass2VM extends AppCompatButton implements AnonymousClass006 {
    public C52662eE A00;
    public boolean A01;

    public AnonymousClass2VM(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public void A00() {
        C52642eC r1;
        AnonymousClass2VK r0;
        Button button;
        if (this instanceof AnonymousClass2VK) {
            AnonymousClass2VK r02 = (AnonymousClass2VK) this;
            if (r02 instanceof Button) {
                Button button2 = (Button) r02;
                if (!button2.A05) {
                    button2.A05 = true;
                    button = button2;
                } else {
                    return;
                }
            } else if (!r02.A00) {
                r02.A00 = true;
                button = r02;
            } else {
                return;
            }
            r1 = (C52642eC) button.generatedComponent();
            r0 = button;
        } else if (!this.A01) {
            this.A01 = true;
            r1 = (C52642eC) generatedComponent();
            r0 = (WDSButton) this;
        } else {
            return;
        }
        C16150sX r2 = ((C52652eD) r1).A07;
        r0.A03 = (C14710pd) r2.A05.get();
        r0.A02 = (AnonymousClass013) r2.AR8.get();
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
