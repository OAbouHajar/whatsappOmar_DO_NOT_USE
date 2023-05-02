package X;

import android.view.View;
import com.obwhatsapp.ephemeral.ChangeEphemeralSettingsDialog;
import com.obwhatsapp.ephemeral.EphemeralDmKicBottomSheetDialog;
import com.obwhatsapp.ephemeral.EphemeralNUXDialog;
import com.obwhatsapp.group.NewGroup;

/* renamed from: X.3yR  reason: invalid class name and case insensitive filesystem */
public class C78653yR extends C34331k5 {
    public final /* synthetic */ NewGroup A00;

    public C78653yR(NewGroup newGroup) {
        this.A00 = newGroup;
    }

    public void A06(View view) {
        NewGroup newGroup = this.A00;
        C14710pd r4 = newGroup.A0C;
        C17800vf r3 = newGroup.A0R;
        C15860rz r2 = newGroup.A09;
        AnonymousClass02C AGM = newGroup.AGM();
        if (r4.A0C(2005) ? EphemeralDmKicBottomSheetDialog.A02(AGM, r2) : EphemeralNUXDialog.A02(AGM, r3)) {
            C40491uD.A06(newGroup.AGM(), newGroup.A09, newGroup.A0C, (C15830rv) newGroup.A0c.get(), newGroup.A0R, 2);
            return;
        }
        ChangeEphemeralSettingsDialog.A01(newGroup.AGM(), newGroup.A00, 1);
    }
}
