package X;

import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.widget.PaymentView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5o0  reason: invalid class name and case insensitive filesystem */
public class C114585o0 extends C16690tT {
    public final /* synthetic */ C112825ja A00;

    public C114585o0(C112825ja r1) {
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        return C110105dW.A0i(this.A00.A0P);
    }

    public void A09() {
        C112825ja r1 = this.A00;
        r1.A0u.incrementAndGet();
        r1.Afq(R.string.str13db);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        int i2;
        List list = (List) obj;
        C112825ja r3 = this.A00;
        if (!r3.A0G && !r3.A0r && r3.A0u.decrementAndGet() == 0) {
            r3.Ac1();
        }
        if (list == null || list.size() == 0) {
            r3.A0t.A06("PopulateMethodsForSend could not find methods;");
            r3.finish();
            return;
        }
        AnonymousClass1Vo r4 = r3.A0t;
        StringBuilder A0r = AnonymousClass000.A0r("onPostExecute got methods: ");
        A0r.append(list.size());
        C110105dW.A1L(r4, A0r);
        List A03 = C30671cl.A03(r3.A0N.A01(), list);
        r3.A0j = A03;
        r4.A04(AnonymousClass000.A0f(Integer.valueOf(A03.size()), AnonymousClass000.A0r("onPostExecute got paymentMethodList for store: ")));
        List list2 = r3.A0j;
        if (list2 != null && list2.size() > 0) {
            C30671cl r1 = r3.A0B;
            boolean z2 = false;
            List list3 = r3.A0j;
            if (r1 != null) {
                Iterator it = list3.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C30671cl A0F = C110115dX.A0F(it);
                    if (A0F.A0A.equals(r3.A0B.A0A)) {
                        r3.A0j.remove(A0F);
                        break;
                    }
                }
                r3.A0j.add(0, r3.A0B);
            } else {
                r3.A0B = C110115dX.A0G(list3, 0);
            }
            PaymentView paymentView = r3.A0X;
            if (paymentView != null) {
                paymentView.setBankLogo(r3.A0B.A05());
                PaymentView paymentView2 = r3.A0X;
                C18290wS r7 = r3.A0P;
                List list4 = r3.A0j;
                C30671cl r5 = r3.A0B;
                if (r5 != null) {
                    i2 = 0;
                    while (true) {
                        if (i2 < list4.size()) {
                            if (C110115dX.A0G(list4, i2).A0A.equals(r5.A0A)) {
                                break;
                            }
                            i2++;
                        } else {
                            i2 = 0;
                            break;
                        }
                    }
                } else {
                    i2 = C119405xi.A01(list4);
                }
                paymentView2.setPaymentMethodText(C119405xi.A05(r3, C110115dX.A0G(list4, i2), r7, true));
                PaymentView paymentView3 = r3.A0X;
                if (r3.A0B == null) {
                    z2 = true;
                }
                paymentView3.A0F(z2);
                PaymentView paymentView4 = r3.A0X;
                if (paymentView4.A00 != 1) {
                    paymentView4.A07();
                }
            }
        }
        r3.A0V = null;
    }
}
