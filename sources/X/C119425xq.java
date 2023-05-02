package X;

import android.animation.Animator;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment;

/* renamed from: X.5xq  reason: invalid class name and case insensitive filesystem */
public class C119425xq implements Animator.AnimatorListener {
    public final /* synthetic */ IndiaUpiPaymentTransactionConfirmationFragment A00;

    public C119425xq(IndiaUpiPaymentTransactionConfirmationFragment indiaUpiPaymentTransactionConfirmationFragment) {
        this.A00 = indiaUpiPaymentTransactionConfirmationFragment;
    }

    public void onAnimationCancel(Animator animator) {
    }

    public void onAnimationEnd(Animator animator) {
        IndiaUpiPaymentTransactionConfirmationFragment indiaUpiPaymentTransactionConfirmationFragment = this.A00;
        C110115dX.A0t(indiaUpiPaymentTransactionConfirmationFragment.A02, indiaUpiPaymentTransactionConfirmationFragment, indiaUpiPaymentTransactionConfirmationFragment.A0B.A00, C13680ns.A1b(), R.string.str1963);
        C13680ns.A1F(indiaUpiPaymentTransactionConfirmationFragment.A03, indiaUpiPaymentTransactionConfirmationFragment, R.string.str1964);
        C13690nt.A0w(indiaUpiPaymentTransactionConfirmationFragment.A03(), indiaUpiPaymentTransactionConfirmationFragment.A03, R.color.normal);
        indiaUpiPaymentTransactionConfirmationFragment.A01.setText(C28891Zc.A03(indiaUpiPaymentTransactionConfirmationFragment.A08, indiaUpiPaymentTransactionConfirmationFragment.A07.A01()));
        indiaUpiPaymentTransactionConfirmationFragment.A01.setVisibility(0);
        indiaUpiPaymentTransactionConfirmationFragment.A06.setVisibility(0);
        indiaUpiPaymentTransactionConfirmationFragment.A05.setVisibility(0);
    }

    public void onAnimationRepeat(Animator animator) {
    }

    public void onAnimationStart(Animator animator) {
    }
}
