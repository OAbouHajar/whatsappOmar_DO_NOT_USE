package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.IndiaUpiMandateHistoryActivity;
import com.obwhatsapp.payments.ui.PaymentTransactionDetailsListActivity;
import com.obwhatsapp.payments.ui.widget.PayToolbar;

/* renamed from: X.5jr  reason: invalid class name and case insensitive filesystem */
public class C112875jr extends C111365g4 {
    public RecyclerView A00;
    public PayToolbar A01;
    public final AnonymousClass1Vo A02 = C110105dW.A0Q("PaymentComponentListActivity", "infra");
    public final C110835eu A03 = new C110835eu(this);

    public C005602k A35(ViewGroup viewGroup, int i2) {
        LayoutInflater layoutInflater;
        int i3;
        this.A02.A04(C13680ns.A0c(i2, "Create view holder for "));
        switch (i2) {
            case 100:
                return new C113365lv(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout0446));
            case 102:
                layoutInflater = C110105dW.A07(viewGroup);
                i3 = R.layout.layout0447;
                break;
            case 103:
                layoutInflater = C110105dW.A07(viewGroup);
                i3 = R.layout.layout0236;
                break;
            case 104:
                return new C113405lz(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout0445));
            default:
                throw AnonymousClass000.A0a(AnonymousClass1Vo.A01("PaymentComponentListActivity", C13680ns.A0c(i2, "no valid mapping for: ")));
        }
        return new C113455m5(C13680ns.A0H(layoutInflater, viewGroup, i3));
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if ((this instanceof PaymentTransactionDetailsListActivity) || (this instanceof IndiaUpiMandateHistoryActivity)) {
            setContentView((int) R.layout.layout0448);
        } else {
            setContentView((int) R.layout.layout0449);
            int A002 = AnonymousClass00T.A00(this, R.color.color0226);
            PayToolbar payToolbar = (PayToolbar) findViewById(R.id.pay_service_toolbar);
            this.A01 = payToolbar;
            Aem(payToolbar);
            C005402i x2 = x();
            if (x2 != null) {
                C110105dW.A0o(this, x2, R.string.str08ae, A002);
            }
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.payment_component_list);
        this.A00 = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager());
        this.A00.setAdapter(this.A03);
    }
}
