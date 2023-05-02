package X;

import android.content.Context;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.31G  reason: invalid class name */
public class AnonymousClass31G extends C601330f {
    public AnonymousClass175 A00;
    public C18090w8 A01;
    public final TextView A02 = C13680ns.A0M(this, R.id.setup_payment_account_button);

    public AnonymousClass31G(Context context, AnonymousClass1YG r3, AnonymousClass1WU r4) {
        super(context, r3, r4);
        A0f();
    }

    private void A0f() {
        TextView textView;
        int i2;
        boolean z2 = true;
        int i3 = 8;
        if (!this.A01.A09()) {
            Log.i("PAY: Cannot render payment invite system messages because payment is not enabled");
            C13690nt.A13(this, R.id.divider, 8);
            this.A02.setVisibility(8);
            this.A0F.AcB("ConversationRowPaymentInviteSystemMessage/fillView", "Cannot render payment invite message because payment is disabled", true);
            return;
        }
        AnonymousClass1WU r2 = (AnonymousClass1WU) this.A0O;
        int i4 = r2.A00;
        if (i4 != 40) {
            if (i4 != 41) {
                if (i4 == 64) {
                    if (!(r2 instanceof C39381sO) || !((C39381sO) r2).A01) {
                        z2 = false;
                    }
                } else if (i4 == 42 || i4 == 65 || i4 == 66) {
                    C13690nt.A13(this, R.id.divider, 8);
                    this.A02.setVisibility(8);
                    return;
                } else {
                    return;
                }
            }
            findViewById(R.id.divider).setVisibility(C13690nt.A07(z2));
            textView = this.A02;
            if (z2) {
                i3 = 0;
            }
            textView.setVisibility(i3);
            textView.setText(R.string.str10c9);
            i2 = 5;
            if (!this.A00.A0E()) {
                i2 = 3;
            }
        } else if (this.A00.A0E()) {
            this.A02.setVisibility(8);
            C13690nt.A13(this, R.id.divider, 8);
            return;
        } else {
            C13690nt.A13(this, R.id.divider, 0);
            textView = this.A02;
            textView.setVisibility(0);
            textView.setText(R.string.str10ee);
            i2 = 4;
        }
        C13680ns.A1C(textView, this, r2, i2);
    }

    public void A0t() {
        A0f();
        super.A0t();
    }

    public void A1G(C16740tZ r2, boolean z2) {
        boolean A1a = C13680ns.A1a(r2, this.A0O);
        super.A1G(r2, z2);
        if (z2 || A1a) {
            A0f();
        }
    }

    public int getBackgroundResource() {
        return 0;
    }

    public int getCenteredLayoutId() {
        return R.layout.layout016d;
    }

    public int getIncomingLayoutId() {
        return R.layout.layout016d;
    }

    public int getMainChildMaxWidth() {
        return ((int) getResources().getDimension(R.dimen.dimen05d5)) + (((int) getResources().getDimension(R.dimen.dimen05d9)) << 1);
    }

    public int getOutgoingLayoutId() {
        return R.layout.layout016d;
    }
}
