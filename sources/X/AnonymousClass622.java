package X;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import com.obwhatsapp.payments.ui.PaymentBottomSheet;
import com.obwhatsapp.payments.ui.widget.PaymentDescriptionRow;
import com.obwhatsapp.payments.ui.widget.PaymentMethodRow;

/* renamed from: X.622  reason: invalid class name */
public class AnonymousClass622 implements C1223169c {
    public final /* synthetic */ C28411Vz A00;
    public final /* synthetic */ C28401Vy A01;
    public final /* synthetic */ C53322fW A02;
    public final /* synthetic */ C112825ja A03;
    public final /* synthetic */ PaymentBottomSheet A04;

    public AnonymousClass622(C28411Vz r1, C28401Vy r2, C53322fW r3, C112825ja r4, PaymentBottomSheet paymentBottomSheet) {
        this.A03 = r4;
        this.A04 = paymentBottomSheet;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void A5E(ViewGroup viewGroup) {
        C53302fU r8;
        C112825ja r5 = this.A03;
        if (!r5.A0Y.A02(r5.A0B, r5.A0n)) {
            TextView A0L = C13680ns.A0L(r5.getLayoutInflater().inflate(R.layout.layout0123, viewGroup, true), R.id.amount);
            C28411Vz r2 = this.A00;
            AnonymousClass013 r0 = r5.A01;
            C28401Vy r7 = this.A01;
            A0L.setText(r2.A9H(r0, r7, 0));
            if (!TextUtils.isEmpty(r5.A0I) && r5.A47()) {
                TextView textView = (TextView) r5.getLayoutInflater().inflate(R.layout.layout011e, viewGroup, false);
                AnonymousClass2SR.A09(textView, r5.getResources().getColor(R.color.color06c5));
                viewGroup.addView(textView);
            }
            C53322fW r02 = this.A02;
            if (r02 != null && (r8 = r02.A01) != null) {
                C110445e8 r4 = new C110445e8(r5, r5.A01, r7, r8, r5.A01, false);
                int i2 = r5.A01;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (!(i2 == 2 || i2 == 3)) {
                            if (i2 != 4) {
                                if (!(i2 == 5 || i2 == 7)) {
                                    return;
                                }
                            } else if (r8.A01 == 0) {
                                viewGroup.addView(r4);
                                r5.A0T.A06(-1, 1);
                                return;
                            } else {
                                return;
                            }
                        }
                    } else if (r8.A00 == 0) {
                        viewGroup.addView(r4);
                        r5.A0T.A06(1, -1);
                        return;
                    } else {
                        return;
                    }
                }
                viewGroup.addView(r4);
            }
        }
    }

    public String AAl(C30671cl r4, int i2) {
        C112825ja r2 = this.A03;
        boolean A20 = C111345g2.A20(r4, r2);
        int i3 = R.string.str10d2;
        if (A20) {
            i3 = R.string.str1180;
        }
        return r2.getString(i3);
    }

    public String ABa(C30671cl r3) {
        return this.A03.getString(R.string.str10d5);
    }

    public String ABb(C30671cl r4) {
        C112825ja r2 = this.A03;
        return C119405xi.A05(r2, r4, r2.A0P, false);
    }

    public String ABu(C30671cl r3, int i2) {
        C112825ja r1 = this.A03;
        if (C111345g2.A20(r3, r1)) {
            return r1.getString(R.string.str0f78);
        }
        return null;
    }

    public String ADg(C30671cl r6) {
        C112825ja r4 = this.A03;
        String A002 = AnonymousClass60V.A00(r4.A0C);
        if (!TextUtils.isEmpty(A002)) {
            return C13680ns.A0d(r4, A002, C13680ns.A1b(), 0, R.string.str0b6f);
        }
        return null;
    }

    public boolean AJN() {
        C35511m3 r0 = this.A03.A0B;
        return r0 != null && r0.A0B();
    }

    public void AMf(ViewGroup viewGroup) {
        C112825ja r4 = this.A03;
        AnonymousClass5vS r2 = r4.A0Y;
        boolean A47 = r4.A47();
        int i2 = 0;
        boolean A1V = AnonymousClass000.A1V(r4.A0I);
        if (!A47 || A1V || !r2.A01.A0C(1718) || r4.A0Y.A02(r4.A0B, r4.A0n)) {
            i2 = 8;
        }
        viewGroup.setVisibility(i2);
        PaymentDescriptionRow paymentDescriptionRow = (PaymentDescriptionRow) viewGroup.findViewById(R.id.payment_description_row);
        r4.A0W = paymentDescriptionRow;
        paymentDescriptionRow.A01(r4.A0c);
    }

    public void AMg(ViewGroup viewGroup) {
        C112825ja r1 = this.A03;
        boolean A022 = r1.A0Y.A02(r1.A0B, r1.A0n);
        Integer A0X = C13680ns.A0X();
        LayoutInflater layoutInflater = r1.getLayoutInflater();
        ViewGroup viewGroup2 = viewGroup;
        if (A022) {
            View inflate = layoutInflater.inflate(R.layout.layout05c1, viewGroup2, true);
            C110105dW.A0s(C110105dW.A08(r1, inflate, C13680ns.A0L(inflate, R.id.text), R.string.str0ee5), this.A04, this, 13);
            r1.A0E.AKV((AnonymousClass2St) null, A0X, (Integer) null, "add_credential_prompt", r1.A0g, r1.A0g, r1.A0f, false, C112765jH.A23(r1));
            return;
        }
        View inflate2 = layoutInflater.inflate(R.layout.layout011b, viewGroup2, true);
        ImageView A08 = C110105dW.A08(r1, inflate2, C13680ns.A0L(inflate2, R.id.text), R.string.str0526);
        C28401Vy r4 = this.A01;
        C53322fW r3 = this.A02;
        A08.setOnClickListener(new C119625ym(r4, r3, this, this.A04));
        AnonymousClass61W r5 = r1.A0E;
        String str = r1.A0g;
        boolean A23 = C112765jH.A23(r1);
        r5.AKV(C112825ja.A02(r4, r3, r1), A0X, (Integer) null, "payment_confirm_prompt", str, r1.A0g, r1.A0f, false, A23);
    }

    public void AMi(ViewGroup viewGroup) {
        C112825ja r4 = this.A03;
        if (!r4.A0Y.A02(r4.A0B, r4.A0n)) {
            View inflate = r4.getLayoutInflater().inflate(R.layout.layout030e, viewGroup, true);
            ImageView A0J = C13680ns.A0J(inflate, R.id.payment_recipient_profile_pic);
            TextView A0L = C13680ns.A0L(inflate, R.id.payment_recipient_name);
            TextView A0L2 = C13680ns.A0L(inflate, R.id.payment_recipient_vpa);
            View A0E = C004601z.A0E(inflate, R.id.expand_receiver_details_button);
            if (r4.A48()) {
                A0E.setVisibility(0);
                int i2 = 51;
                if (r4 instanceof IndiaUpiCheckOrderDetailsActivity ? false : !r4.A47()) {
                    i2 = 52;
                }
                C110105dW.A0r(inflate, this, i2);
            } else {
                A0E.setVisibility(8);
                inflate.setOnClickListener((View.OnClickListener) null);
            }
            C16010sH r1 = r4.A08;
            if (r1 != null) {
                r4.A04.A06(A0J, r1);
                A0L.setText(r4.AFP());
                if (C39841t9.A03(r4.A09)) {
                    A0L2.setVisibility(8);
                    return;
                }
            } else {
                r4.A01.A05(A0J, R.drawable.avatar_contact);
                A0L.setText((CharSequence) C110105dW.A0d(r4.A07));
            }
            Object obj = r4.A09.A00;
            AnonymousClass00B.A06(obj);
            A0L2.setText(C13680ns.A0d(r4, obj, new Object[1], 0, R.string.str0b6f));
        }
    }

    public void ARV(ViewGroup viewGroup, C30671cl r4) {
        C112825ja r1 = this.A03;
        C111345g2.A1g(r1.getLayoutInflater(), viewGroup, r1);
    }

    public boolean AfC(C30671cl r2, int i2) {
        return C111345g2.A20(r2, this.A03);
    }

    public boolean AfK(C30671cl r2) {
        return !C111345g2.A20(r2, this.A03);
    }

    public boolean AfL() {
        return false;
    }

    public void AfY(C30671cl r1, PaymentMethodRow paymentMethodRow) {
    }

    public boolean Afl() {
        return true;
    }
}
