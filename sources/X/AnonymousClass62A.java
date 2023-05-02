package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.redex.IDxDListenerShape160S0100000_3_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.BrazilConfirmReceivePaymentFragment;
import com.obwhatsapp.payments.ui.BrazilPaymentActivity;
import com.obwhatsapp.payments.ui.IDxUExtensionShape96S0100000_3_I1;
import com.obwhatsapp.payments.ui.IndiaUpiCheckBalanceActivity;
import com.obwhatsapp.payments.ui.IndiaUpiPaymentMethodSelectionActivity;
import com.obwhatsapp.payments.ui.widget.PaymentMethodRow;
import java.io.Serializable;
import java.util.List;

/* renamed from: X.62A  reason: invalid class name */
public abstract class AnonymousClass62A implements C1223069b {
    public List A91(List list) {
        if (!(this instanceof IDxUExtensionShape96S0100000_3_I1) || 1 - ((IDxUExtensionShape96S0100000_3_I1) this).A01 != 0) {
            return list;
        }
        return null;
    }

    public View A9o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (!(this instanceof IDxUExtensionShape96S0100000_3_I1)) {
            return null;
        }
        IDxUExtensionShape96S0100000_3_I1 iDxUExtensionShape96S0100000_3_I1 = (IDxUExtensionShape96S0100000_3_I1) this;
        if (1 - iDxUExtensionShape96S0100000_3_I1.A01 != 0) {
            return null;
        }
        AnonymousClass5kl r1 = (AnonymousClass5kl) iDxUExtensionShape96S0100000_3_I1.A00;
        if (r1.A0D.size() == 0) {
            return null;
        }
        View inflate = layoutInflater.inflate(R.layout.layout0331, (ViewGroup) null);
        C110105dW.A0q(inflate, R.id.check_balance_icon, AnonymousClass00T.A00(r1, R.color.color070f));
        return inflate;
    }

    public View ACM(LayoutInflater layoutInflater, FrameLayout frameLayout) {
        if (!(this instanceof IDxUExtensionShape96S0100000_3_I1) || 1 - ((IDxUExtensionShape96S0100000_3_I1) this).A01 != 0) {
            return null;
        }
        return C13680ns.A0H(layoutInflater, frameLayout, R.layout.layout04aa);
    }

    public int ADe(C30671cl r3) {
        if (!(this instanceof IDxUExtensionShape96S0100000_3_I1)) {
            return 0;
        }
        IDxUExtensionShape96S0100000_3_I1 iDxUExtensionShape96S0100000_3_I1 = (IDxUExtensionShape96S0100000_3_I1) this;
        if (1 - iDxUExtensionShape96S0100000_3_I1.A01 != 0 || !r3.equals(((AnonymousClass5kl) iDxUExtensionShape96S0100000_3_I1.A00).A02)) {
            return 0;
        }
        return R.drawable.countrypicker_checkmark;
    }

    public String ADh(C30671cl r3) {
        if ((this instanceof IDxUExtensionShape96S0100000_3_I1) || !(this instanceof C112985l0)) {
            return null;
        }
        BrazilPaymentActivity brazilPaymentActivity = ((C112985l0) this).A01.A03;
        return C119405xi.A04(brazilPaymentActivity.A01, r3, brazilPaymentActivity.A0O);
    }

    public String ADi(C30671cl r4) {
        if (!(this instanceof IDxUExtensionShape96S0100000_3_I1)) {
            return null;
        }
        IDxUExtensionShape96S0100000_3_I1 iDxUExtensionShape96S0100000_3_I1 = (IDxUExtensionShape96S0100000_3_I1) this;
        if (1 - iDxUExtensionShape96S0100000_3_I1.A01 != 0) {
            return null;
        }
        C112765jH r2 = (C112765jH) iDxUExtensionShape96S0100000_3_I1.A00;
        return C119405xi.A05(r2, r4, r2.A0P, false);
    }

    public View AEi(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void AMC() {
        Intent intent;
        if (this instanceof IDxUExtensionShape96S0100000_3_I1) {
            IDxUExtensionShape96S0100000_3_I1 iDxUExtensionShape96S0100000_3_I1 = (IDxUExtensionShape96S0100000_3_I1) this;
            if (1 - iDxUExtensionShape96S0100000_3_I1.A01 == 0) {
                AnonymousClass5kl r3 = (AnonymousClass5kl) iDxUExtensionShape96S0100000_3_I1.A00;
                if (r3.A0D.size() == 1) {
                    C111805hR r0 = (C111805hR) C110115dX.A0G(r3.A0D, 0).A08;
                    if (r0 == null || AnonymousClass000.A1X(r0.A05.A00)) {
                        C30671cl A0G = C110115dX.A0G(r3.A0D, 0);
                        intent = C110105dW.A04(r3, IndiaUpiCheckBalanceActivity.class);
                        C110115dX.A0o(intent, A0G);
                    } else {
                        r3.A3q(r3.A08, "ConfirmPaymentFragment");
                        C32241fu A00 = C32241fu.A00(r3);
                        A00.A02(R.string.str18c1);
                        A00.A01(R.string.str18c0);
                        C110105dW.A0w(A00, r3, 20, R.string.str1cf6);
                        A00.setNegativeButton(R.string.str0e87, (DialogInterface.OnClickListener) null);
                        A00.A0C(new IDxDListenerShape160S0100000_3_I1(r3, 8));
                        C13690nt.A1G(A00);
                        return;
                    }
                } else {
                    List list = r3.A0D;
                    intent = C110105dW.A04(r3, IndiaUpiPaymentMethodSelectionActivity.class);
                    intent.putExtra("bank_accounts", (Serializable) list);
                }
                r3.Ag3(intent, 1015);
            }
        }
    }

    public /* synthetic */ void ANA() {
    }

    public /* synthetic */ boolean AfB(C30671cl r2) {
        return false;
    }

    public boolean AfL() {
        return this instanceof IDxUExtensionShape96S0100000_3_I1 ? ((IDxUExtensionShape96S0100000_3_I1) this).A01 == 0 : this instanceof C112985l0;
    }

    public boolean AfP() {
        return !(this instanceof IDxUExtensionShape96S0100000_3_I1) || 1 - ((IDxUExtensionShape96S0100000_3_I1) this).A01 != 0;
    }

    public void AfY(C30671cl r3, PaymentMethodRow paymentMethodRow) {
        AnonymousClass5vX r0;
        if (this instanceof IDxUExtensionShape96S0100000_3_I1) {
            IDxUExtensionShape96S0100000_3_I1 iDxUExtensionShape96S0100000_3_I1 = (IDxUExtensionShape96S0100000_3_I1) this;
            if (iDxUExtensionShape96S0100000_3_I1.A01 == 0 && C119405xi.A09(r3)) {
                r0 = ((BrazilConfirmReceivePaymentFragment) iDxUExtensionShape96S0100000_3_I1.A00).A0H;
            } else {
                return;
            }
        } else if (this instanceof C112985l0) {
            C112985l0 r1 = (C112985l0) this;
            if (C119405xi.A09(r3)) {
                r0 = r1.A01.A03.A0S;
            } else {
                return;
            }
        } else {
            return;
        }
        r0.A02(r3, paymentMethodRow);
    }
}
