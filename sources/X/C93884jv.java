package X;

import android.os.Bundle;
import android.view.MenuItem;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4jv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C93884jv implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ AnonymousClass4SD A00;
    public final /* synthetic */ UserJid A01;

    public /* synthetic */ C93884jv(AnonymousClass4SD r1, UserJid userJid) {
        this.A00 = r1;
        this.A01 = userJid;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        AnonymousClass4SD r0 = this.A00;
        UserJid userJid = this.A01;
        C86224Rt r2 = r0.A03;
        if (r2.A05.A02()) {
            return true;
        }
        Bundle A0D = C13690nt.A0D();
        A0D.putInt("dialog_id", 1);
        C14530pL r3 = r2.A03;
        A0D.putString("title", r3.getString(R.string.str0c9f));
        A0D.putCharSequence("message", r3.getString(R.string.str0c9e));
        A0D.putString("user_jid", userJid.getRawString());
        C82644Dp r22 = r2.A01;
        A0D.putString("positive_button", r3.getString(R.string.str0e87));
        A0D.putString("negative_button", r3.getString(R.string.str0394));
        AnonymousClass3K3.A11(A0D, r3, r22);
        return true;
    }
}
