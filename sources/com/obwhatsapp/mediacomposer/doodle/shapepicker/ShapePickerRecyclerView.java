package com.obwhatsapp.mediacomposer.doodle.shapepicker;

import X.AnonymousClass01X;
import X.AnonymousClass2V6;
import X.AnonymousClass2VF;
import X.C05490Rq;
import X.C64463Qc;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import com.facebook.redex.IDxSScrollerShape29S0100000_2_I0;
import com.obwhatsapp.R;

public class ShapePickerRecyclerView extends AnonymousClass2V6 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public GridLayoutManager A04;
    public C05490Rq A05;

    public ShapePickerRecyclerView(Context context) {
        super(context);
        A10(context);
    }

    public ShapePickerRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A10(context);
    }

    public ShapePickerRecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        A10(context);
    }

    public final void A0z() {
        if (this.A01 == -1) {
            int measuredWidth = getMeasuredWidth();
            int i2 = this.A02;
            int i3 = i2 + this.A03;
            int i4 = measuredWidth / i3;
            if ((i3 * i4) + i2 <= getMeasuredWidth()) {
                i4++;
            }
            this.A01 = Math.max(1, i4);
        }
    }

    public final void A10(Context context) {
        this.A02 = context.getResources().getDimensionPixelOffset(R.dimen.dimen0722);
        boolean z2 = false;
        if (getContext().getResources().getConfiguration().orientation == 1) {
            z2 = true;
        }
        Resources resources = getContext().getResources();
        int i2 = R.dimen.dimen072e;
        if (z2) {
            i2 = R.dimen.dimen072f;
        }
        this.A03 = resources.getDimensionPixelSize(i2);
        this.A00 = -1;
        this.A01 = -1;
        this.A0h = true;
        this.A05 = new IDxSScrollerShape29S0100000_2_I0(context, this, 1);
    }

    public final void A11(GridLayoutManager gridLayoutManager, AnonymousClass01X r4) {
        if (r4 instanceof AnonymousClass2VF) {
            AnonymousClass2VF r42 = (AnonymousClass2VF) r4;
            gridLayoutManager.A01 = new C64463Qc(gridLayoutManager, r42, this);
            int i2 = this.A01;
            if (r42.A00 != i2) {
                r42.A00 = i2;
                if (r42.A02 == null) {
                    r42.A0G();
                }
            }
        }
    }

    public void A12(boolean z2, boolean z3) {
        int i2;
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.dimen0723);
        Resources resources = getResources();
        int i3 = R.dimen.dimen0727;
        if (z2) {
            i3 = R.dimen.dimen0725;
        }
        int dimensionPixelSize2 = resources.getDimensionPixelSize(i3);
        if (z3) {
            Resources resources2 = getResources();
            int i4 = R.dimen.dimen0726;
            if (z2) {
                i4 = R.dimen.dimen0724;
            }
            i2 = resources2.getDimensionPixelSize(i4);
        } else {
            i2 = 0;
        }
        setPadding(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize, i2);
    }

    public int getActualShapeSpacing() {
        int i2 = this.A00;
        if (i2 == -1) {
            A0z();
            if (this.A01 > 1) {
                int measuredWidth = getMeasuredWidth();
                int i3 = this.A01;
                i2 = (measuredWidth - (this.A02 * i3)) / (i3 - 1);
            } else {
                i2 = 0;
            }
            this.A00 = i2;
        }
        return i2;
    }

    public int getAdapterItemCount() {
        AnonymousClass01X r0 = this.A0N;
        if (r0 != null) {
            return r0.A0C();
        }
        throw new IllegalStateException("Must set adapter first");
    }

    public int getColumnCount() {
        A0z();
        return this.A01;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        boolean z2 = true;
        if (configuration.orientation != 1) {
            z2 = false;
        }
        Resources resources = getContext().getResources();
        int i2 = R.dimen.dimen072e;
        if (z2) {
            i2 = R.dimen.dimen072f;
        }
        this.A03 = resources.getDimensionPixelSize(i2);
        this.A00 = -1;
        this.A01 = -1;
    }

    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        this.A00 = -1;
        this.A01 = -1;
        A0z();
        GridLayoutManager gridLayoutManager = (GridLayoutManager) getLayoutManager();
        int i4 = this.A01;
        gridLayoutManager.A1g(i4 * i4);
        A11(gridLayoutManager, this.A0N);
        A0N();
    }

    public void setAdapter(AnonymousClass01X r3) {
        super.setAdapter(r3);
        this.A00 = -1;
        this.A01 = -1;
        A0z();
        getContext();
        int i2 = this.A01;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(i2 * i2);
        this.A04 = gridLayoutManager;
        A11(gridLayoutManager, r3);
        setLayoutManager(this.A04);
    }
}
