package X;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.invites.InviteGroupParticipantsActivity;
import java.util.List;

/* renamed from: X.2r4  reason: invalid class name */
public class AnonymousClass2r4 extends AnonymousClass01X {
    public List A00;
    public final /* synthetic */ InviteGroupParticipantsActivity A01;

    public AnonymousClass2r4(InviteGroupParticipantsActivity inviteGroupParticipantsActivity) {
        this.A01 = inviteGroupParticipantsActivity;
    }

    public int A0C() {
        return C13680ns.A07(this.A00);
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r7, int i2) {
        int i3;
        AnonymousClass3S6 r72 = (AnonymousClass3S6) r7;
        C16010sH r4 = (C16010sH) this.A00.get(i2);
        InviteGroupParticipantsActivity inviteGroupParticipantsActivity = this.A01;
        TextView textView = r72.A01;
        if (!TextUtils.isEmpty(r4.A09())) {
            textView.setText(r4.A09());
        } else if (r4.A0K()) {
            textView.setText(inviteGroupParticipantsActivity.A04.A0I(r4, false));
            textView.setSingleLine(false);
        } else {
            String A09 = inviteGroupParticipantsActivity.A09.A09(C16010sH.A02(r4));
            if (!TextUtils.isEmpty(A09)) {
                textView.setSingleLine(false);
            } else if (!TextUtils.isEmpty(r4.A0W)) {
                A09 = inviteGroupParticipantsActivity.A04.A0F(r4);
                textView.setSingleLine(false);
                i3 = R.color.color06c5;
                C13680ns.A0v(inviteGroupParticipantsActivity, textView, i3);
                textView.setText(A09);
                inviteGroupParticipantsActivity.A05.A08(r72.A00, r4, false);
            } else {
                A09 = inviteGroupParticipantsActivity.A08.A0H(C24561Gk.A01(r4));
                textView.setSingleLine(true);
            }
            i3 = R.color.color0660;
            C13680ns.A0v(inviteGroupParticipantsActivity, textView, i3);
            textView.setText(A09);
            inviteGroupParticipantsActivity.A05.A08(r72.A00, r4, false);
        }
        C13680ns.A0v(inviteGroupParticipantsActivity, textView, R.color.color0660);
        inviteGroupParticipantsActivity.A05.A08(r72.A00, r4, false);
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        return new AnonymousClass3S6(C13680ns.A0H(this.A01.A00, viewGroup, R.layout.layout001e));
    }
}
