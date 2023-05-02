package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.payments.ui.widget.PeerPaymentTransactionRow;
import com.obwhatsapp.payments.ui.widget.TransactionsExpandableView;
import java.util.List;

/* renamed from: X.5e3  reason: invalid class name and case insensitive filesystem */
public abstract class C110395e3 extends LinearLayout {
    public int A00 = 2;
    public View.OnClickListener A01;
    public ViewGroup A02;
    public FrameLayout A03;
    public ImageView A04;
    public LinearLayout A05;
    public TextView A06;
    public TextView A07;
    public CharSequence A08;
    public CharSequence A09;
    public final List A0A = AnonymousClass000.A0u();

    public C110395e3(Context context) {
        super(context);
        A00(context, (AttributeSet) null);
    }

    public C110395e3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public C110395e3(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A00(context, attributeSet);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        LayoutInflater.from(context).inflate(R.layout.layout044d, this, true);
        setOrientation(1);
        this.A07 = C13680ns.A0L(this, R.id.header);
        this.A02 = C13700nu.A07(this, R.id.see_more_container);
        this.A04 = C13680ns.A0J(this, R.id.see_more_icon);
        this.A06 = C13680ns.A0L(this, R.id.see_more_text);
        this.A03 = (FrameLayout) C004601z.A0E(this, R.id.custom_empty_view_container);
        this.A05 = C110115dX.A05(this, R.id.list_item_container);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C115725qD.A03);
            try {
                this.A00 = obtainStyledAttributes.getInt(2, 2);
                int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                if (resourceId > 0) {
                    this.A04.setImageDrawable(context.getResources().getDrawable(resourceId));
                }
                int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
                if (resourceId2 > 0) {
                    this.A06.setText(resourceId2);
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void A01(List list) {
        ViewGroup viewGroup;
        View.OnClickListener onClickListener;
        List list2 = this.A0A;
        list2.clear();
        this.A05.removeAllViews();
        boolean isEmpty = list.isEmpty();
        FrameLayout frameLayout = this.A03;
        if (!isEmpty) {
            frameLayout.setVisibility(8);
            int size = list.size();
            int i2 = this.A00;
            ViewGroup viewGroup2 = this.A02;
            if (size > i2) {
                viewGroup2.setVisibility(0);
                this.A06.setText(this.A09);
                viewGroup = this.A02;
                onClickListener = this.A01;
                viewGroup.setOnClickListener(onClickListener);
            } else {
                viewGroup2.setVisibility(8);
            }
        } else if (frameLayout.getChildCount() > 0) {
            this.A03.setVisibility(0);
            this.A02.setVisibility(8);
        } else {
            this.A02.setVisibility(0);
            this.A06.setText(this.A08);
            viewGroup = this.A02;
            onClickListener = null;
            viewGroup.setOnClickListener(onClickListener);
        }
        list2.addAll(list.subList(0, Math.min(list.size(), this.A00)));
        for (int i3 = 0; i3 < list2.size(); i3++) {
            TransactionsExpandableView transactionsExpandableView = (TransactionsExpandableView) this;
            AnonymousClass1Vt r6 = (AnonymousClass1Vt) list.get(i3);
            C117105sS r5 = transactionsExpandableView.A00;
            View peerPaymentTransactionRow = (r6.A03 != 1000 || !r6.A0P) ? new PeerPaymentTransactionRow(r5.A01, r5.A02, r5.A00) : C13680ns.A0H(LayoutInflater.from(r5.A01), transactionsExpandableView, R.layout.layout047d);
            Object obj = list.get(i3);
            int size2 = list2.size();
            ((AnonymousClass69G) peerPaymentTransactionRow).A5U(obj);
            int i4 = size2 - 1;
            View findViewById = peerPaymentTransactionRow.findViewById(R.id.divider);
            int i5 = 8;
            if (i3 < i4) {
                i5 = 0;
            }
            findViewById.setVisibility(i5);
            this.A05.addView(peerPaymentTransactionRow);
        }
    }

    public ImageView getSeeMoreImageView() {
        return this.A04;
    }

    public int getSizeLimit() {
        return this.A00;
    }

    public void setCustomEmptyView(View view) {
        this.A03.addView(view);
    }

    public void setSeeMoreView(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        this.A09 = charSequence;
        this.A08 = charSequence2;
        this.A01 = onClickListener;
    }

    public void setSizeLimit(int i2) {
        this.A00 = i2;
    }

    public void setTitle(CharSequence charSequence) {
        this.A07.setText(charSequence);
        this.A07.setVisibility(0);
    }
}
