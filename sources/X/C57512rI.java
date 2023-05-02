package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.callhistory.group.GroupCallLogActivity;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.2rI  reason: invalid class name and case insensitive filesystem */
public class C57512rI extends AnonymousClass01X {
    public List A00;
    public final /* synthetic */ GroupCallLogActivity A01;

    public C57512rI(GroupCallLogActivity groupCallLogActivity) {
        this.A01 = groupCallLogActivity;
    }

    public static /* synthetic */ void A00(C57512rI r3, C15830rv r4) {
        int i2 = 0;
        for (C38581r1 r0 : r3.A00) {
            if (r0.A02.equals(r4)) {
                r3.A01.A01.A02(i2);
                return;
            }
            i2++;
        }
    }

    public int A0C() {
        return this.A00.size();
    }

    public void ANf(C005602k r6, int i2) {
        AnonymousClass3SV r62 = (AnonymousClass3SV) r6;
        UserJid userJid = ((C38581r1) this.A00.get(i2)).A02;
        GroupCallLogActivity groupCallLogActivity = this.A01;
        C16010sH A0A = groupCallLogActivity.A06.A0A(userJid);
        AnonymousClass2Ao r0 = groupCallLogActivity.A0A;
        ImageView imageView = r62.A02;
        r0.A06(imageView, A0A);
        C13690nt.A1B(imageView, this, A0A, r62, 9);
        r62.A04.A0A(A0A);
        C37831po r02 = groupCallLogActivity.A0E;
        if (r02 != null && !r02.A0C.A03 && i2 == 0) {
            TextView textView = r62.A03;
            textView.setVisibility(0);
            C13690nt.A0w(groupCallLogActivity.getResources(), textView, R.color.color0505);
            textView.setText(R.string.str0a42);
        }
        C34331k5.A04(r62.A01, this, A0A, 24);
        C34331k5.A04(r62.A00, this, A0A, 25);
    }

    public C005602k APF(ViewGroup viewGroup, int i2) {
        return new AnonymousClass3SV(C13680ns.A0H(C13680ns.A0G(viewGroup), viewGroup, R.layout.layout02cd), this.A01);
    }
}
