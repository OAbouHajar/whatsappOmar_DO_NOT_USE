package X;

import android.content.Context;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.30x  reason: invalid class name and case insensitive filesystem */
public class C603130x extends AnonymousClass31H {
    public boolean A00;

    public C603130x(Context context, AnonymousClass1YG r2, C39161s1 r3) {
        super(context, r2, r3);
        A0g();
    }

    public void A0g() {
        if (!this.A00) {
            this.A00 = true;
            C52652eD A07 = C30011bb.A07(this);
            C16150sX A06 = C30011bb.A06(A07, this);
            C49132Rg A05 = C30011bb.A05(A06, A07, this, C30011bb.A0C(A06, this));
            C30011bb.A0S(A06, this, C30011bb.A0B(A05, A06, this));
            C30011bb.A0Q(A06, this);
            C30011bb.A0O(A05, A06, C30011bb.A08(A06, this), this);
            C30011bb.A0M(A05, A06, A07, this, A06.A4p);
            C30011bb.A0R(A06, this);
        }
    }

    public String getMessageString() {
        UserJid userJid = ((C39161s1) getFMessage()).A00;
        AnonymousClass00B.A06(userJid);
        if (this.A0L.A0I(userJid)) {
            return getContext().getString(R.string.str00d1);
        }
        return C13680ns.A0d(getContext(), this.A0d.A0L(AnonymousClass3Bv.newArrayList((Object[]) new UserJid[]{userJid}), -1), new Object[1], 0, R.string.str00d0);
    }
}
