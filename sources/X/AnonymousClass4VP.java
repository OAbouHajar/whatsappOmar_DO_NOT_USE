package X;

import com.obwhatsapp.conversationslist.ConversationsFragment;
import com.obwhatsapp.home.splitwindow.IDxWObserverShape84S0100000_2_I0;
import com.obwhatsapp.home.ui.HomePlaceholderActivity;

/* renamed from: X.4VP  reason: invalid class name */
public class AnonymousClass4VP {
    public void A00() {
        if (this instanceof IDxWObserverShape84S0100000_2_I0) {
            IDxWObserverShape84S0100000_2_I0 iDxWObserverShape84S0100000_2_I0 = (IDxWObserverShape84S0100000_2_I0) this;
            if (iDxWObserverShape84S0100000_2_I0.A01 == 0) {
                AnonymousClass2JD r1 = ((ConversationsFragment) iDxWObserverShape84S0100000_2_I0.A00).A15;
                r1.A01 = null;
                r1.notifyDataSetChanged();
            }
        }
    }

    public void A01(int i2) {
        if (this instanceof IDxWObserverShape84S0100000_2_I0) {
            IDxWObserverShape84S0100000_2_I0 iDxWObserverShape84S0100000_2_I0 = (IDxWObserverShape84S0100000_2_I0) this;
            if (1 - iDxWObserverShape84S0100000_2_I0.A01 == 0) {
                ((HomePlaceholderActivity.HomePlaceholderView) iDxWObserverShape84S0100000_2_I0.A00).A01(i2);
            }
        }
    }
}
