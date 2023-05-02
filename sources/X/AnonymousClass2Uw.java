package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.obwhatsapp.chatinfo.view.custom.BusinessChatInfoLayout;

/* renamed from: X.2Uw  reason: invalid class name */
public abstract class AnonymousClass2Uw extends ViewGroup implements AnonymousClass006 {
    public C52662eE A00;

    public AnonymousClass2Uw(Context context) {
        super(context);
        A00();
    }

    public AnonymousClass2Uw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public AnonymousClass2Uw(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00();
    }

    public void A00() {
        BusinessChatInfoLayout businessChatInfoLayout;
        C59972zg r1 = (C59972zg) this;
        if (r1 instanceof BusinessChatInfoLayout) {
            BusinessChatInfoLayout businessChatInfoLayout2 = (BusinessChatInfoLayout) r1;
            if (!businessChatInfoLayout2.A00) {
                businessChatInfoLayout2.A00 = true;
                businessChatInfoLayout = businessChatInfoLayout2;
            } else {
                return;
            }
        } else if (!r1.A00) {
            r1.A00 = true;
            businessChatInfoLayout = r1;
        } else {
            return;
        }
        C16150sX r2 = ((C52652eD) ((C52642eC) businessChatInfoLayout.generatedComponent())).A07;
        businessChatInfoLayout.A0S = (C14710pd) r2.A05.get();
        businessChatInfoLayout.A0O = (C17160ud) r2.A4t.get();
        businessChatInfoLayout.A0T = (C17240ul) r2.ABK.get();
        businessChatInfoLayout.A0R = (C17250um) r2.A7e.get();
        businessChatInfoLayout.A0P = (C16080sP) r2.AQ9.get();
        businessChatInfoLayout.A0Q = (AnonymousClass013) r2.AR8.get();
        businessChatInfoLayout.A0U = new C25781Lc();
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
