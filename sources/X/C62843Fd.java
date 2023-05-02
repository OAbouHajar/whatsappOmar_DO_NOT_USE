package X;

import com.mod2.fblibs.FacebookFacade;
import com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity;
import java.util.ArrayList;

/* renamed from: X.3Fd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C62843Fd implements C42751yc {
    public final /* synthetic */ TextStatusComposerActivity A00;

    public /* synthetic */ C62843Fd(TextStatusComposerActivity textStatusComposerActivity) {
        this.A00 = textStatusComposerActivity;
    }

    public final void ARt(C93544jN r15) {
        TextStatusComposerActivity textStatusComposerActivity = this.A00;
        String trim = textStatusComposerActivity.A0a.getText() != null ? C13680ns.A0f(textStatusComposerActivity.A0a).trim() : "";
        ArrayList A0u = AnonymousClass000.A0u();
        A0u.add(C34771kq.A00);
        C93534jM r1 = r15.A01;
        int i2 = r1.A01;
        if (i2 <= 0) {
            i2 = r15.A02.A01;
        }
        int i3 = r1.A00;
        if (i3 <= 0) {
            i3 = r15.A02.A00;
        }
        textStatusComposerActivity.startActivityForResult(C14750ph.A0j(textStatusComposerActivity, r15.A02.A02, r1.A02, r15.A03.A02, A0u, r15.A00, 22, false, true).putExtra("media_width", i2).putExtra("media_height", i3).putExtra(FacebookFacade.RequestParameter.CAPTION, C40651uT.A05(trim)), 1);
    }
}
