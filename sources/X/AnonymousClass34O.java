package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.obwhatsapp.R;

/* renamed from: X.34O  reason: invalid class name */
public abstract class AnonymousClass34O extends C55672k9 {
    public AnonymousClass34O(Context context, C85934Qo r2, C25781Lc r3) {
        super(context, r2, r3);
    }

    public CharSequence A02(C16010sH r6, C16740tZ r7) {
        Drawable A00;
        String A04;
        C15830rv r1;
        if ((r6 == null || (r1 = r6.A0E) == null || this.A04.A0I(r1)) && !r7.A11.A02) {
            return "";
        }
        CharSequence A002 = C55672k9.A00(r6, r7, this);
        boolean z2 = this instanceof AnonymousClass34F;
        if (z2) {
            A00 = AnonymousClass3Ar.A00(getContext(), (C38701rH) r7);
        } else if (this instanceof AnonymousClass34G) {
            int i2 = R.drawable.ic_inline_live_location;
            if (r7 instanceof C38751rM) {
                i2 = R.drawable.msg_status_location;
            }
            A00 = AnonymousClass2SR.A00(getContext(), i2);
        } else {
            boolean z3 = this instanceof AnonymousClass34E;
            Context context = getContext();
            A00 = z3 ? AnonymousClass2SR.A00(context, R.drawable.msg_status_contact) : AnonymousClass2SR.A00(context, R.drawable.msg_status_audio);
        }
        if (!z2) {
            if (this instanceof AnonymousClass34G) {
                A04 = getContext().getString(R.string.str05e1);
                if (r7 instanceof C38751rM) {
                    A04 = getContext().getString(R.string.str05e2);
                }
            } else if (this instanceof AnonymousClass34E) {
                A04 = getContext().getString(R.string.str05d9);
            }
            return C61963Bc.A02(A002, C56522nn.A00(this.A01.getPaint(), A00, A04));
        }
        C38701rH r72 = (C38701rH) r7;
        AnonymousClass013 r4 = this.A09;
        A04 = (C38621r6.A10(r72) || C38621r6.A11(r72)) ? C28961Zl.A04(r4, (long) r72.A00) : C62053Bl.A00(r4, r72);
        return C61963Bc.A02(A002, C56522nn.A00(this.A01.getPaint(), A00, A04));
    }
}
