package com.facebook.redex;

import X.AnonymousClass000;
import X.AnonymousClass2OJ;
import X.AnonymousClass49N;
import X.C108445Oa;
import X.C13680ns;
import android.widget.TextView;
import com.obwhatsapp.calling.callrating.CallRatingActivity;
import com.obwhatsapp.calling.callrating.CallRatingFragment;
import com.obwhatsapp.calling.callrating.viewmodel.CallRatingViewModel;

public class IDxCListenerShape422S0100000_2_I1 implements C108445Oa {
    public Object A00;
    public final int A01;

    public IDxCListenerShape422S0100000_2_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void AVe(int i2, boolean z2) {
        TextView textView;
        int i3;
        int i4;
        if (this.A01 != 0) {
            CallRatingFragment callRatingFragment = (CallRatingFragment) this.A00;
            StringBuilder A0r = AnonymousClass000.A0r("CallRatingFragment/setOnRatingBarChangeListener rating: ");
            A0r.append(i2);
            A0r.append(", fromUser: ");
            A0r.append(z2);
            C13680ns.A1V(A0r);
            if (z2) {
                CallRatingViewModel callRatingViewModel = (CallRatingViewModel) callRatingFragment.A01.getValue();
                if (callRatingViewModel.A04 != null) {
                    AnonymousClass2OJ r3 = callRatingViewModel.A0C;
                    if (i2 > 0) {
                        int[] iArr = AnonymousClass49N.A00;
                        if (i2 <= iArr.length) {
                            callRatingViewModel.A0A.A0B(Boolean.TRUE);
                            i4 = iArr[i2 - 1];
                            C13680ns.A1O(r3, i4);
                            return;
                        }
                    }
                    i4 = -1;
                    C13680ns.A1O(r3, i4);
                    return;
                }
                return;
            }
            return;
        }
        CallRatingActivity callRatingActivity = (CallRatingActivity) this.A00;
        StringBuilder A0r2 = AnonymousClass000.A0r("callratingactivity/setOnRatingBarChangeListener rating = ");
        A0r2.append(i2);
        A0r2.append(", fromUser = ");
        A0r2.append(z2);
        C13680ns.A1V(A0r2);
        if (z2) {
            if (i2 > 0) {
                int[] iArr2 = CallRatingActivity.A0K;
                if (i2 <= iArr2.length) {
                    callRatingActivity.A04.setText(iArr2[i2 - 1]);
                    textView = callRatingActivity.A04;
                    i3 = 0;
                    textView.setVisibility(i3);
                    callRatingActivity.A2B();
                }
            }
            textView = callRatingActivity.A04;
            i3 = 4;
            textView.setVisibility(i3);
            callRatingActivity.A2B();
        }
    }
}
