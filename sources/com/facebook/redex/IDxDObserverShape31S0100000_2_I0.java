package com.facebook.redex;

import X.AnonymousClass078;
import X.C14550pN;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.StickyHeadersRecyclerView;
import com.obwhatsapp.mentions.MentionPickerView;

public class IDxDObserverShape31S0100000_2_I0 extends AnonymousClass078 {
    public Object A00;
    public final int A01;

    public IDxDObserverShape31S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public void A00() {
        switch (this.A01) {
            case 0:
                StickyHeadersRecyclerView stickyHeadersRecyclerView = (StickyHeadersRecyclerView) this.A00;
                stickyHeadersRecyclerView.A02 = -1;
                stickyHeadersRecyclerView.A00 = -1;
                return;
            case 1:
                C14550pN r3 = (C14550pN) this.A00;
                r3.A05.A0K(new RunnableRunnableShape6S0100000_I0_5(r3, 11));
                return;
            case 2:
                MentionPickerView mentionPickerView = (MentionPickerView) this.A00;
                mentionPickerView.A04(mentionPickerView.A0D.A07.size(), mentionPickerView.getResources().getDimensionPixelSize(R.dimen.dimen052b));
                return;
            default:
                ((View) this.A00).requestLayout();
                return;
        }
    }
}
