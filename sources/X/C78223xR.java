package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import com.google.android.material.chip.ChipGroup;
import com.obwhatsapp.R;

/* renamed from: X.3xR  reason: invalid class name and case insensitive filesystem */
public abstract class C78223xR extends AnonymousClass3O8 {
    public AnonymousClass013 A00;
    public final ChipGroup A01;

    public C78223xR(Context context) {
        super(context);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        ChipGroup chipGroup = new ChipGroup(context);
        this.A01 = chipGroup;
        chipGroup.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        addView(chipGroup);
        boolean z2 = this instanceof C78203xP;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen06cf);
        Resources resources = getResources();
        if (z2) {
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.dimen06bd);
            setPadding(dimensionPixelSize2, 0, dimensionPixelSize2, dimensionPixelSize);
        } else {
            int dimensionPixelSize3 = resources.getDimensionPixelSize(R.dimen.dimen06bd);
            setPadding(dimensionPixelSize3, dimensionPixelSize, dimensionPixelSize3, dimensionPixelSize);
        }
        chipGroup.setChipSpacing(getChipSpacingPx());
    }

    private int getChipSpacingPx() {
        return getResources().getDimensionPixelSize(R.dimen.dimen06d0) << 1;
    }
}
