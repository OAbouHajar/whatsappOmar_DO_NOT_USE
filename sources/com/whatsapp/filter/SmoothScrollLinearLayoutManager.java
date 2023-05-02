package com.whatsapp.filter;

import X.AnonymousClass0Ri;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxSScrollerShape29S0100000_2_I0;

public class SmoothScrollLinearLayoutManager extends LinearLayoutManager {
    public SmoothScrollLinearLayoutManager(int i2) {
        super(i2);
    }

    public void A0w(AnonymousClass0Ri r4, RecyclerView recyclerView, int i2) {
        IDxSScrollerShape29S0100000_2_I0 iDxSScrollerShape29S0100000_2_I0 = new IDxSScrollerShape29S0100000_2_I0(recyclerView.getContext(), this, 0);
        iDxSScrollerShape29S0100000_2_I0.A00 = i2;
        A0Q(iDxSScrollerShape29S0100000_2_I0);
    }
}
