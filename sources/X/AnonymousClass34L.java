package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.facebook.redex.IDxCListenerShape244S0100000_2_I1;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.search.SearchViewModel;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.34L  reason: invalid class name */
public class AnonymousClass34L extends C78223xR {
    public C16080sP A00;
    public boolean A01;

    public AnonymousClass34L(Context context) {
        super(context);
        A01();
        addOnLayoutChangeListener(new IDxCListenerShape244S0100000_2_I1(this, 1));
        C13680ns.A0u(getContext(), this, R.color.color065f);
    }

    /* access modifiers changed from: private */
    public int getMaxChipWidth() {
        return (C13680ns.A04(this) - this.A01.A01) >> 1;
    }

    public void A01() {
        if (!this.A01) {
            this.A01 = true;
            C16150sX A002 = C52652eD.A00(generatedComponent());
            this.A00 = C16150sX.A0Z(A002);
            this.A00 = C16150sX.A0Q(A002);
        }
    }

    public void A02(SearchViewModel searchViewModel, List list, int i2) {
        ChipGroup chipGroup = this.A01;
        chipGroup.removeAllViews();
        int maxChipWidth = getMaxChipWidth();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C16010sH A0U = C13680ns.A0U(it);
            if (A0U != null) {
                Chip chip = new Chip(getContext(), (AttributeSet) null);
                chip.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                String A08 = this.A00.A08(A0U);
                int i3 = R.string.str14a1;
                if (i2 != 1) {
                    i3 = R.string.str1d7e;
                }
                AnonymousClass02E A03 = this.A00.A03();
                chip.setText(C13700nu.A0F(getResources(), A03.A03(A03.A00, A08), new Object[1], 0, i3));
                chip.setId(R.id.search_contact_token);
                chip.setClickable(true);
                C13680ns.A1C(chip, searchViewModel, A0U, 45);
                C13680ns.A0v(getContext(), chip, R.color.color06c5);
                chip.setChipBackgroundColorResource(R.color.color06b1);
                chip.setEllipsize(TextUtils.TruncateAt.END);
                if (maxChipWidth > 0) {
                    chip.setMaxWidth(maxChipWidth);
                }
                chipGroup.addView(chip);
            }
        }
    }
}
