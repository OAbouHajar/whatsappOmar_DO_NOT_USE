package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3HA  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3HA implements C54312hC {
    public final /* synthetic */ AnonymousClass2DL A00;
    public final /* synthetic */ C16730tY A01;

    public /* synthetic */ AnonymousClass3HA(AnonymousClass2DL r1, C16730tY r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void AOh(View view, C54302hB r15) {
        AnonymousClass2DL r3 = this.A00;
        C16730tY r7 = this.A01;
        r3.A0M = r7;
        View view2 = view;
        if (r7.A10 == 23) {
            C38891ra r72 = (C38891ra) r7;
            UserJid userJid = r72.A01;
            if (userJid == null) {
                r3.A05.A09(R.string.str03f1, 0);
                return;
            }
            r3.A03.A02(3);
            boolean A0I = r3.A01.A0I(userJid);
            C61843Ap.A01(view.getContext(), view2, r3.A02, r72, r3.A0P, 5, false, A0I, A0I);
        } else if (RequestPermissionActivity.A0R(r3, r3.A07)) {
            r3.viewMedia(view);
        }
    }
}
