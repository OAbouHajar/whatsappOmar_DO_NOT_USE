package X;

import android.content.Context;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;

/* renamed from: X.30M  reason: invalid class name */
public final class AnonymousClass30M extends C30011bb {
    public C18890xQ A00;
    public boolean A01;

    public AnonymousClass30M(Context context, AnonymousClass1YG r7, C16740tZ r8) {
        super(context, r7, r8);
        A0g();
        TextEmojiLabel A0R = C13680ns.A0R(this, R.id.message_text);
        boolean A05 = C30531cW.A05(A0R);
        A0R.setLongClickable(A05);
        boolean A0G = this.A0L.A0G();
        Context context2 = getContext();
        C30011bb.A0W(A0R, this, A0G ? context2.getString(A1M(r8)) : C25951Lt.A00(context2, this.A00.A00(), A1M(r8)), A05 ? 1 : 0);
    }

    public void A0g() {
        if (!this.A01) {
            this.A01 = true;
            C52652eD A07 = C30011bb.A07(this);
            C16150sX A06 = C30011bb.A06(A07, this);
            C49132Rg A05 = C30011bb.A05(A06, A07, this, C30011bb.A0C(A06, this));
            C30011bb.A0S(A06, this, C30011bb.A0B(A05, A06, this));
            C30011bb.A0Q(A06, this);
            C30011bb.A0O(A05, A06, C30011bb.A08(A06, this), this);
            C30011bb.A0M(A05, A06, A07, this, A06.A4p);
            C30011bb.A0R(A06, this);
            this.A00 = C16150sX.A06(A06);
        }
    }

    public final int A1M(C16740tZ r6) {
        int i2;
        boolean A0G = this.A0L.A0G();
        boolean z2 = r6.A11.A02;
        if (A0G) {
            i2 = R.string.str0511;
            if (z2) {
                i2 = R.string.str0512;
            }
        } else {
            i2 = R.string.str0920;
            if (z2) {
                i2 = R.string.str091f;
            }
        }
        if (r6 instanceof C38791rQ) {
            int i3 = ((C38791rQ) r6).A00;
            if (i3 == 68) {
                return R.string.str0bf7;
            }
            if (i3 == 74) {
                return z2 ? R.string.str091b : R.string.str091c;
            }
        }
        return i2;
    }

    public int getBubbleAlpha() {
        return 191;
    }

    public int getCenteredLayoutId() {
        return R.layout.layout01da;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout01da;
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout01db;
    }
}
