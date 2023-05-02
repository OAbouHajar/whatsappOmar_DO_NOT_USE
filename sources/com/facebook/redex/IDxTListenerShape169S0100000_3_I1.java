package com.facebook.redex;

import X.C110495eG;
import android.view.MotionEvent;
import android.view.View;
import com.obwhatsapp.R;
import org.npci.commonlibrary.GetCredential;

public class IDxTListenerShape169S0100000_3_I1 implements View.OnTouchListener {
    public Object A00;
    public final int A01;

    public IDxTListenerShape169S0100000_3_I1(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.A01) {
            case 0:
                GetCredential getCredential = (GetCredential) this.A00;
                view.performClick();
                if (motionEvent.getAction() != 1 || getCredential.A02.getVisibility() != 0) {
                    return false;
                }
                getCredential.A1d(false);
                return true;
            case 1:
                GetCredential getCredential2 = (GetCredential) this.A00;
                view.performClick();
                if (view.getId() != R.id.transaction_details_scroller || motionEvent.getAction() != 1 || getCredential2.A02.getVisibility() != 0) {
                    return false;
                }
                getCredential2.A1d(false);
                return true;
            default:
                C110495eG r2 = (C110495eG) this.A00;
                view.performClick();
                if (r2.A0B == null || motionEvent.getAction() != 1) {
                    return false;
                }
                r2.A0B.ARZ(r2.A01);
                return false;
        }
    }
}
