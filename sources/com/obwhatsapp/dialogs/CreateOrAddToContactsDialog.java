package com.obwhatsapp.dialogs;

import X.AnonymousClass000;
import X.AnonymousClass01A;
import X.AnonymousClass3K2;
import X.C13690nt;
import X.C16010sH;
import X.C32241fu;
import X.C42741yb;
import X.C85954Qq;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import com.facebook.redex.IDxCListenerShape29S0200000_2_I1;
import com.obwhatsapp.R;
import java.util.ArrayList;

public class CreateOrAddToContactsDialog extends Hilt_CreateOrAddToContactsDialog {
    public long A00;
    public C42741yb A01;
    public boolean A02;

    public static CreateOrAddToContactsDialog A01(C16010sH r5, boolean z2) {
        CreateOrAddToContactsDialog createOrAddToContactsDialog = new CreateOrAddToContactsDialog();
        Bundle A0D = C13690nt.A0D();
        A0D.putLong("CONTACT_ID_KEY", r5.A05());
        A0D.putBoolean("IS_ME_KEY", z2);
        createOrAddToContactsDialog.A0T(A0D);
        return createOrAddToContactsDialog;
    }

    public void A0s(Bundle bundle) {
        super.A0s(bundle);
        bundle.putLong("CONTACT_ID_KEY", this.A00);
        bundle.putBoolean("IS_ME_KEY", this.A02);
    }

    public void A16(Context context) {
        super.A16(context);
        AnonymousClass01A r1 = this.A0D;
        if (r1 instanceof C42741yb) {
            this.A01 = (C42741yb) r1;
        } else if (context instanceof C42741yb) {
            this.A01 = (C42741yb) context;
        } else {
            throw AnonymousClass000.A0V("CreateOrAddToContactsDialog requires a Listener as it's host");
        }
    }

    public void A17(Bundle bundle) {
        super.A17(bundle);
        Bundle A04 = A04();
        this.A00 = A04.getLong("CONTACT_ID_KEY");
        this.A02 = A04.getBoolean("IS_ME_KEY");
        if (bundle != null) {
            this.A00 = bundle.getLong("CONTACT_ID_KEY");
            this.A02 = bundle.getBoolean("IS_ME_KEY");
        }
    }

    public Dialog A1B(Bundle bundle) {
        ArrayList A0u = AnonymousClass000.A0u();
        A0u.add(new C85954Qq(A0J(R.string.str0610), R.id.menuitem_conversations_add_new_contact));
        A0u.add(new C85954Qq(A0J(R.string.str00af), R.id.menuitem_conversations_add_to_existing_contact));
        C32241fu A0R = AnonymousClass3K2.A0R(this);
        A0R.A04(new IDxCListenerShape29S0200000_2_I1(A0u, 15, this), new ArrayAdapter(A0u(), 17367043, A0u));
        return A0R.create();
    }
}
