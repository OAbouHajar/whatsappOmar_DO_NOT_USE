package X;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import com.facebook.redex.ViewOnClickCListenerShape2S0101000_I1;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.search.SearchViewModel;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.34K  reason: invalid class name */
public class AnonymousClass34K extends C78223xR {
    public boolean A00;

    public AnonymousClass34K(Context context) {
        super(context);
        A01();
        setLayoutParams(new ViewGroup.MarginLayoutParams(-1, -2));
    }

    private void setBackground(boolean z2) {
        Context context = getContext();
        int i2 = R.color.color065f;
        if (z2) {
            i2 = R.color.color0580;
        }
        C13680ns.A0u(context, this, i2);
    }

    public void A01() {
        if (!this.A00) {
            this.A00 = true;
            this.A00 = C16150sX.A0Z(C52652eD.A00(generatedComponent()));
        }
    }

    public void A02(SparseIntArray sparseIntArray, SearchViewModel searchViewModel) {
        ChipGroup chipGroup = this.A01;
        chipGroup.removeAllViews();
        ArrayList A0u = AnonymousClass000.A0u();
        boolean z2 = false;
        for (int i2 = 0; i2 < sparseIntArray.size(); i2++) {
            if (sparseIntArray.keyAt(i2) != 0) {
                A0u.add(C13680ns.A0F(Integer.valueOf(sparseIntArray.keyAt(i2)), sparseIntArray.valueAt(i2)));
            }
        }
        C13690nt.A1P(A0u, 26);
        Iterator it = A0u.iterator();
        while (it.hasNext()) {
            int A0D = AnonymousClass000.A0D(((Pair) it.next()).first);
            C85264Nt r5 = (C85264Nt) AnonymousClass3A6.A00().get(A0D);
            if (r5 != null) {
                Chip chip = new Chip(getContext(), (AttributeSet) null);
                chip.setText(r5.A05);
                chip.setClickable(true);
                chip.setOnClickListener(new ViewOnClickCListenerShape2S0101000_I1(searchViewModel, A0D, 2));
                AnonymousClass3A6.A01(getContext(), chip, A0D, R.color.color06c2);
                chip.setChipIconTintResource(R.color.color06c1);
                C13680ns.A0v(getContext(), chip, R.color.color06c2);
                chip.setChipBackgroundColorResource(R.color.color06b1);
                chip.setId(r5.A04);
                chipGroup.addView(chip);
            }
        }
        if (sparseIntArray.get(0) == 1) {
            z2 = true;
        }
        setBackground(z2);
    }
}
