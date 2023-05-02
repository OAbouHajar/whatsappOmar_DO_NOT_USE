package X;

import android.text.TextUtils;
import com.facebook.redex.IDxTObserverShape253S0100000_3_I1;
import java.lang.ref.WeakReference;

/* renamed from: X.60S  reason: invalid class name */
public class AnonymousClass60S implements AnonymousClass1TV, AnonymousClass69B {
    public C41411vk A00;
    public C18290wS A01;
    public C114615o3 A02;
    public final C14530pL A03;
    public final AnonymousClass107 A04;
    public final AnonymousClass175 A05;
    public final AnonymousClass17O A06;
    public final AnonymousClass108 A07;
    public final C18300wT A08;
    public final AnonymousClass17Y A09;
    public final C18310wU A0A;
    public final AnonymousClass1MA A0B;
    public final AnonymousClass1Vo A0C = C110105dW.A0Q("PaymentDataPresenter", "payment");
    public final C39961tL A0D;
    public final AnonymousClass69B A0E;
    public final C1220668d A0F;
    public final AnonymousClass69D A0G;
    public final C16320sq A0H;
    public final String A0I;
    public final boolean A0J;

    public AnonymousClass60S(C14530pL r3, AnonymousClass107 r4, AnonymousClass175 r5, AnonymousClass17O r6, AnonymousClass108 r7, C18300wT r8, AnonymousClass17Y r9, C18310wU r10, C18290wS r11, AnonymousClass1MA r12, C39961tL r13, AnonymousClass69B r14, C1220668d r15, AnonymousClass69D r16, C16320sq r17, String str, boolean z2) {
        this.A03 = r3;
        this.A0H = r17;
        this.A0D = r13;
        this.A01 = r11;
        this.A08 = r8;
        this.A05 = r5;
        this.A0A = r10;
        this.A0B = r12;
        this.A06 = r6;
        this.A0F = r15;
        this.A09 = r9;
        this.A04 = r4;
        this.A07 = r7;
        this.A0E = r14;
        this.A0G = r16;
        this.A0I = str;
        this.A0J = z2;
    }

    public synchronized void A00(boolean z2) {
        synchronized (this) {
            C114615o3 r1 = this.A02;
            if (r1 != null) {
                r1.A06(true);
            }
            C14530pL r4 = this.A03;
            C16320sq r9 = this.A0H;
            C114615o3 r3 = new C114615o3(r4, this.A04, this.A07, this.A01, this.A0D, r9, new WeakReference(this.A0F), new WeakReference(this.A0G), this.A0J, z2);
            this.A02 = r3;
            r9.Acn(r3, new Void[0]);
        }
    }

    public void A01(boolean z2, boolean z3) {
        boolean z4 = this.A0J;
        if (z4) {
            IDxTObserverShape253S0100000_3_I1 iDxTObserverShape253S0100000_3_I1 = new IDxTObserverShape253S0100000_3_I1(this, 4);
            this.A00 = iDxTObserverShape253S0100000_3_I1;
            this.A09.A02(iDxTObserverShape253S0100000_3_I1);
        }
        AnonymousClass175 r4 = this.A05;
        if (r4.A0E() || this.A06.A0E()) {
            C18300wT r3 = this.A08;
            if (!C110115dX.A17(r3.A01(), "has_p2mlite_account") && (z3 || r3.A0Q())) {
                this.A0A.A08(this);
            }
        }
        if (!r4.A0E() && !this.A06.A0E()) {
            C18300wT r1 = this.A08;
            if (!r1.A0P() || !C110115dX.A17(r1.A01(), "payment_account_recoverable")) {
                return;
            }
        }
        if (z4 && z2) {
            this.A0B.A01(this, (Integer) null, (Integer) null, (String) null, this.A0I);
        }
    }

    public void AMA(boolean z2) {
        this.A0E.AMA(z2);
    }

    public void AUY(C30671cl r2) {
        this.A0E.AUY(r2);
    }

    public void AWC(AnonymousClass2HJ r3) {
        this.A0C.A05(AnonymousClass000.A0g("getPaymentMethods/getPaymentTransactions/onRequestError. paymentNetworkError: ", r3));
    }

    public void AWI(AnonymousClass2HJ r3) {
        this.A0C.A05(AnonymousClass000.A0g("getPaymentMethods/getPaymentTransactions/onResponseError. paymentNetworkError: ", r3));
    }

    public void AWJ(AnonymousClass2HK r11) {
        if (r11 instanceof AnonymousClass3w0) {
            this.A0C.A04("init/getMethods/onResponseSuccess");
        } else if (r11 instanceof C77583w1) {
            AnonymousClass1Vo r2 = this.A0C;
            r2.A04("init/getTransactions/onResponseSuccess");
            C77583w1 r112 = (C77583w1) r11;
            C35381lq r1 = r112.A00;
            if (r1 == null) {
                r2.A04("unexpected payment transaction result type.");
            } else if (!r1.A01 && !TextUtils.isEmpty(r1.A00)) {
                this.A0B.A01(this, (Integer) null, (Integer) null, r112.A00.A00, this.A0I);
            }
        } else {
            return;
        }
        A00(false);
    }
}
