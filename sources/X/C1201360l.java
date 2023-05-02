package X;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import androidx.fragment.app.DialogFragment;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;
import com.obwhatsapp.payments.ui.PaymentBottomSheet;
import com.obwhatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment;
import com.obwhatsapp.payments.ui.invites.PaymentInviteFragment;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

/* renamed from: X.60l  reason: invalid class name and case insensitive filesystem */
public class C1201360l implements C47372Ir {
    public final C16440t3 A00;
    public final C16980tz A01;
    public final C14710pd A02;
    public final AnonymousClass175 A03;
    public final C218315p A04;

    public C1201360l(C16440t3 r1, C16980tz r2, C14710pd r3, AnonymousClass175 r4, C218315p r5) {
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = r5;
        this.A03 = r4;
    }

    public boolean A5w() {
        return this.A03.A0C();
    }

    public boolean A5x(UserJid userJid) {
        if (!this.A02.A0C(733)) {
            return false;
        }
        return this.A03.A0C();
    }

    public Intent A9i(C16740tZ r4) {
        if (this.A03.A0E()) {
            return null;
        }
        Intent A042 = C110105dW.A04(this.A01.A00, IndiaUpiPaymentsAccountSetupActivity.class);
        A042.putExtra("extra_setup_mode", 2);
        A042.putExtra("extra_payments_entry_type", 2);
        A042.putExtra("extra_is_first_payment_method", true);
        A042.putExtra("extra_skip_value_props_display", false);
        C15830rv r1 = r4.A11.A00;
        if (r1 instanceof GroupJid) {
            r1 = r4.A0B();
        }
        String A032 = C16030sJ.A03(r1);
        A042.putExtra("extra_jid", A032);
        A042.putExtra("extra_inviter_jid", A032);
        AnonymousClass22U.A00(A042, "acceptInvite");
        return A042;
    }

    public Drawable ABp() {
        return C218315p.A02(this.A01.A00, C35481m0.A05, R.color.color0476, R.dimen.dimen05f5);
    }

    public DialogFragment AEe(String str, ArrayList arrayList, boolean z2, boolean z3) {
        PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
        IndiaUpiPaymentInviteFragment indiaUpiPaymentInviteFragment = new IndiaUpiPaymentInviteFragment();
        indiaUpiPaymentInviteFragment.A0T(PaymentInviteFragment.A02(str, arrayList, z2, z3));
        paymentBottomSheet.A01 = indiaUpiPaymentInviteFragment;
        return paymentBottomSheet;
    }

    public boolean AHb() {
        return this.A03.A0C();
    }
}
