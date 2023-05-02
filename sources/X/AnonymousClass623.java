package X;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import com.obwhatsapp.payments.ui.BrazilOrderDetailsActivity;
import com.obwhatsapp.payments.ui.BrazilPaymentActivity;
import com.obwhatsapp.payments.ui.ConfirmPaymentFragment;
import com.obwhatsapp.payments.ui.widget.PaymentMethodRow;

/* renamed from: X.623  reason: invalid class name */
public class AnonymousClass623 implements C1223169c {
    public final /* synthetic */ C28411Vz A00;
    public final /* synthetic */ C28401Vy A01;
    public final /* synthetic */ C30671cl A02;
    public final /* synthetic */ C53322fW A03;
    public final /* synthetic */ BrazilPaymentActivity A04;
    public final /* synthetic */ ConfirmPaymentFragment A05;

    public AnonymousClass623(C28411Vz r1, C28401Vy r2, C30671cl r3, C53322fW r4, BrazilPaymentActivity brazilPaymentActivity, ConfirmPaymentFragment confirmPaymentFragment) {
        this.A04 = brazilPaymentActivity;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = r3;
        this.A00 = r1;
        this.A05 = confirmPaymentFragment;
    }

    public void A5E(ViewGroup viewGroup) {
        C53302fU r7;
        C53322fW r0 = this.A03;
        if (r0 != null && (r7 = r0.A01) != null) {
            BrazilPaymentActivity brazilPaymentActivity = this.A04;
            int i2 = brazilPaymentActivity.A01;
            C110445e8 r3 = new C110445e8(brazilPaymentActivity, brazilPaymentActivity.A04, this.A01, r7, i2, true);
            int i3 = brazilPaymentActivity.A01;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (!(i3 == 2 || i3 == 3)) {
                        if (i3 != 4) {
                            if (!(i3 == 5 || i3 == 7)) {
                                return;
                            }
                        } else if (r7.A01 == 0) {
                            viewGroup.addView(r3);
                            brazilPaymentActivity.A0T.A06(-1, 1);
                            return;
                        } else {
                            return;
                        }
                    }
                } else if (r7.A00 == 0) {
                    viewGroup.addView(r3);
                    brazilPaymentActivity.A0T.A06(1, -1);
                    return;
                } else {
                    return;
                }
            }
            viewGroup.addView(r3);
        }
    }

    public String AAl(C30671cl r8, int i2) {
        if (BrazilPaymentActivity.A09(r8, i2)) {
            return this.A04.A01.getString(R.string.str0fd0);
        }
        C39901tF r0 = this.A02.A08;
        AnonymousClass00B.A06(r0);
        boolean A09 = r0.A09();
        BrazilPaymentActivity brazilPaymentActivity = this.A04;
        if (!A09) {
            return brazilPaymentActivity.getString(R.string.str0523);
        }
        return C13680ns.A0d(brazilPaymentActivity, this.A00.A9H(brazilPaymentActivity.A04, this.A01, 0), C13680ns.A1b(), 0, R.string.str0521);
    }

    public String ABa(C30671cl r3) {
        return this.A04.getString(R.string.str0f7e);
    }

    public String ABb(C30671cl r2) {
        return null;
    }

    public String ABu(C30671cl r3, int i2) {
        Context context;
        int i3;
        C39891tE r1 = (C39891tE) r3.A08;
        if (r1 == null) {
            return null;
        }
        if (BrazilPaymentActivity.A09(r3, i2)) {
            boolean equals = "ACTIVE".equals(r1.A0I);
            BrazilPaymentActivity brazilPaymentActivity = this.A04;
            if (!equals) {
                context = brazilPaymentActivity.A01;
                i3 = R.string.str03b3;
            } else if (brazilPaymentActivity.A0O.A0A() || brazilPaymentActivity.A0O.A06()) {
                context = brazilPaymentActivity.A01;
                i3 = R.string.str028b;
            } else {
                context = brazilPaymentActivity.A01;
                i3 = R.string.str028c;
            }
        } else if (r1.A0a) {
            return null;
        } else {
            context = this.A04.A01;
            i3 = R.string.str199b;
        }
        return context.getString(i3);
    }

    public String ADg(C30671cl r2) {
        return null;
    }

    public boolean AJN() {
        return this.A04.A0e;
    }

    public void AMf(ViewGroup viewGroup) {
    }

    public void AMg(ViewGroup viewGroup) {
        BrazilPaymentActivity brazilPaymentActivity = this.A04;
        C13680ns.A0M(brazilPaymentActivity.getLayoutInflater().inflate(R.layout.layout011b, viewGroup, true), R.id.text).setText(C13680ns.A0d(brazilPaymentActivity.A01, brazilPaymentActivity.A03.A08(brazilPaymentActivity.A08.A01(brazilPaymentActivity.A0G)), new Object[1], 0, R.string.str052e));
        AnonymousClass5xP.A02(AnonymousClass5xP.A00(brazilPaymentActivity.A05, this.A01, this.A03, (String) null, true), brazilPaymentActivity.A0L, "payment_confirm_prompt", brazilPaymentActivity instanceof BrazilOrderDetailsActivity ? "order_details" : "new_payment");
    }

    public void AMi(ViewGroup viewGroup) {
    }

    public void ARV(ViewGroup viewGroup, C30671cl r16) {
        BrazilPaymentActivity brazilPaymentActivity = this.A04;
        View inflate = brazilPaymentActivity.getLayoutInflater().inflate(R.layout.layout011f, viewGroup, true);
        TextEmojiLabel A0Q = C13680ns.A0Q(inflate, R.id.footer_text);
        boolean equals = "p2m".equals(brazilPaymentActivity.A0n);
        int i2 = R.string.str028d;
        if (equals) {
            i2 = R.string.str08ae;
        }
        Context context = brazilPaymentActivity.A01;
        SpannableString spannableString = new SpannableString(C13680ns.A0d(context, context.getString(i2), new Object[1], 0, R.string.str0529));
        C33741j5 r8 = new C33741j5(C004601z.A0E(inflate, R.id.hidden_additional_tos));
        if ("p2m".equals(brazilPaymentActivity.A0n)) {
            r8.A03(0);
            String[] strArr = {brazilPaymentActivity.A0C.A05(2671), brazilPaymentActivity.A0C.A05(2670), "https://faq.whatsapp.com/632565565059488"};
            Runnable[] runnableArr = {new AnonymousClass63B(), new AnonymousClass63C(), new AnonymousClass63A()};
            SpannableString A052 = brazilPaymentActivity.A0b.A05(brazilPaymentActivity.A01.getString(R.string.str0ff6), runnableArr, new String[]{"meta-terms-privacy", "wa-terms-privacy", "wa-brazil-p2m-learn-more"}, strArr);
            C30531cW.A02((TextEmojiLabel) r8.A02());
            ((TextView) r8.A02()).setText(A052);
        }
        C30531cW.A04(A0Q, brazilPaymentActivity.A08, spannableString);
    }

    public boolean AfC(C30671cl r2, int i2) {
        return BrazilPaymentActivity.A09(r2, i2);
    }

    public boolean AfK(C30671cl r2) {
        return true;
    }

    public boolean AfL() {
        return true;
    }

    public void AfY(C30671cl r2, PaymentMethodRow paymentMethodRow) {
        if (C119405xi.A09(r2) && !this.A05.A0X) {
            this.A04.A0S.A02(r2, paymentMethodRow);
        }
    }

    public boolean Afl() {
        return true;
    }
}
