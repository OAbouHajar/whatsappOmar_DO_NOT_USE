package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.widget.PaymentInteropShimmerRow;
import com.obwhatsapp.payments.ui.widget.PeerPaymentTransactionRow;
import java.util.List;

/* renamed from: X.5m3  reason: invalid class name and case insensitive filesystem */
public abstract class C113435m3 extends C111035fE {
    public View.OnClickListener A00;
    public ViewGroup A01;
    public FrameLayout A02;
    public ImageView A03;
    public LinearLayout A04;
    public TextView A05;
    public TextView A06;
    public CharSequence A07;
    public CharSequence A08;
    public final List A09 = AnonymousClass000.A0u();

    public C113435m3(View view) {
        super(view);
        View view2 = this.A0H;
        this.A06 = C13680ns.A0L(view2, R.id.header);
        this.A01 = C13700nu.A07(view2, R.id.see_more_container);
        this.A03 = C13680ns.A0J(view2, R.id.see_more_icon);
        this.A05 = C13680ns.A0L(view2, R.id.see_more_text);
        this.A02 = (FrameLayout) C004601z.A0E(view2, R.id.custom_empty_view_container);
        this.A04 = C110115dX.A05(view2, R.id.list_item_container);
    }

    public void A07(C116245r4 r14, int i2) {
        if (this instanceof C113325lr) {
            C113945ms r142 = (C113945ms) r14;
            ImageView imageView = this.A03;
            View view = this.A0H;
            AnonymousClass2SR.A07(view.getContext(), imageView, R.color.color0226);
            String str = r142.A02;
            String str2 = r142.A01;
            View.OnClickListener onClickListener = r142.A00;
            this.A08 = str;
            this.A07 = str2;
            this.A00 = onClickListener;
            List list = this.A09;
            list.clear();
            LinearLayout linearLayout = this.A04;
            linearLayout.removeAllViews();
            list.addAll(r142.A03);
            A08();
            for (int i3 = 0; i3 < Math.min(list.size(), 2); i3++) {
                AnonymousClass1Vt r9 = (AnonymousClass1Vt) list.get(i3);
                int size = list.size();
                C110375e0 r3 = new C110375e0(view.getContext());
                AnonymousClass00B.A06(r9);
                long j2 = r9.A05;
                if (j2 > 0) {
                    r3.A01.setText(C28891Zc.A05(r3.A03, r3.A02.A02(j2)));
                }
                r3.A00.setText(r3.A04.A0J(r9));
                int i4 = size - 1;
                View findViewById = r3.findViewById(R.id.divider);
                int i5 = 8;
                if (i3 < i4) {
                    i5 = 0;
                }
                findViewById.setVisibility(i5);
                linearLayout.addView(r3);
            }
            return;
        }
        C113335ls r7 = (C113335ls) this;
        C113725mW r143 = (C113725mW) r14;
        r7.A00 = r143.A01;
        String str3 = r143.A04;
        if (str3 != null) {
            TextView textView = r7.A06;
            textView.setText(str3);
            textView.setVisibility(0);
        }
        ImageView imageView2 = r7.A03;
        View view2 = r7.A0H;
        AnonymousClass2SR.A07(view2.getContext(), imageView2, R.color.color070f);
        String str4 = r143.A03;
        String str5 = r143.A02;
        View.OnClickListener onClickListener2 = r143.A00;
        r7.A08 = str4;
        r7.A07 = str5;
        r7.A00 = onClickListener2;
        List list2 = r7.A09;
        list2.clear();
        LinearLayout linearLayout2 = r7.A04;
        linearLayout2.removeAllViews();
        list2.addAll(r143.A05);
        r7.A08();
        for (int i6 = 0; i6 < Math.min(list2.size(), 2); i6++) {
            AnonymousClass1Vt r2 = (AnonymousClass1Vt) list2.get(i6);
            int size2 = list2.size();
            View peerPaymentTransactionRow = (r2.A03 != 1000 || !r2.A0P) ? new PeerPaymentTransactionRow(view2.getContext()) : C13680ns.A0G(view2).inflate(R.layout.layout047d, linearLayout2, false);
            if (peerPaymentTransactionRow instanceof PeerPaymentTransactionRow) {
                PeerPaymentTransactionRow peerPaymentTransactionRow2 = (PeerPaymentTransactionRow) peerPaymentTransactionRow;
                peerPaymentTransactionRow2.A0Z = "mandate_payment_screen";
                peerPaymentTransactionRow2.A0T = r7.A00;
                AnonymousClass00B.A06(r2);
                peerPaymentTransactionRow2.A5U(r2);
            } else if (peerPaymentTransactionRow instanceof PaymentInteropShimmerRow) {
                AnonymousClass00B.A06(r2);
                ((PaymentInteropShimmerRow) peerPaymentTransactionRow).A5U(r2);
            }
            int i7 = size2 - 1;
            View findViewById2 = peerPaymentTransactionRow.findViewById(R.id.divider);
            if (i6 < i7) {
                findViewById2.setVisibility(0);
            } else {
                findViewById2.setVisibility(8);
            }
            linearLayout2.addView(peerPaymentTransactionRow);
        }
    }

    public void A08() {
        ViewGroup viewGroup;
        View.OnClickListener onClickListener;
        List list = this.A09;
        int i2 = 0;
        if (list.size() > 2) {
            viewGroup = this.A01;
            viewGroup.setVisibility(0);
            this.A05.setText(this.A08);
            onClickListener = this.A00;
        } else {
            if (!list.isEmpty()) {
                i2 = 8;
                this.A01.setVisibility(8);
            } else if (this.A02.getChildCount() <= 0) {
                viewGroup = this.A01;
                viewGroup.setVisibility(0);
                this.A05.setText(this.A07);
                onClickListener = null;
            }
            this.A02.setVisibility(i2);
            return;
        }
        viewGroup.setOnClickListener(onClickListener);
    }
}
