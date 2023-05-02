package com.obwhatsapp.payments.ui.widget;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass684;
import X.C119745yy;
import X.C13680ns;
import X.C52662eE;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.chip.ChipGroup;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MultiExclusionChipGroup extends ChipGroup implements AnonymousClass006 {
    public AnonymousClass684 A00;
    public C52662eE A01;
    public Map A02;
    public Set A03;
    public boolean A04;

    public MultiExclusionChipGroup(Context context) {
        super(context);
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
        this.A03 = C13680ns.A0o();
        this.A02 = AnonymousClass000.A0x();
    }

    public MultiExclusionChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
        this.A03 = C13680ns.A0o();
        this.A02 = AnonymousClass000.A0x();
    }

    public MultiExclusionChipGroup(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
        this.A03 = C13680ns.A0o();
        this.A02 = AnonymousClass000.A0x();
    }

    public MultiExclusionChipGroup(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet);
        if (!this.A04) {
            this.A04 = true;
            generatedComponent();
        }
    }

    public void A01(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MultiExclusionChip multiExclusionChip = (MultiExclusionChip) it.next();
            this.A02.put(multiExclusionChip, list);
            multiExclusionChip.setCheckable(true);
            multiExclusionChip.setClickable(true);
            super.addView(multiExclusionChip);
            multiExclusionChip.A00 = new C119745yy(multiExclusionChip, this);
        }
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A01;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void setOnSelectionChangedListener(AnonymousClass684 r1) {
        this.A00 = r1;
    }
}
