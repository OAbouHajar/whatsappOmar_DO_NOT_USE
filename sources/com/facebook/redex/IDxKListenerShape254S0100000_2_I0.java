package com.facebook.redex;

import X.AnonymousClass1YG;
import X.AnonymousClass1ZK;
import X.C14550pN;
import X.C30011bb;
import X.C42821yj;
import android.view.KeyEvent;
import android.view.View;
import com.obwhatsapp.search.views.TokenizedSearchInput;

public class IDxKListenerShape254S0100000_2_I0 implements View.OnKeyListener {
    public Object A00;
    public final int A01;

    public IDxKListenerShape254S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final boolean onKey(View view, int i2, KeyEvent keyEvent) {
        switch (this.A01) {
            case 0:
                C30011bb r5 = (C30011bb) this.A00;
                if (i2 == 23) {
                    if (!keyEvent.isLongPress()) {
                        AnonymousClass1YG r0 = r5.A0b;
                        if (r0 != null && r0.AHi() && keyEvent.getAction() == 1 && keyEvent.getEventTime() - keyEvent.getDownTime() <= 500) {
                            r5.A1E(r5.getFMessage());
                            break;
                        } else {
                            return false;
                        }
                    } else {
                        r5.A0s();
                        break;
                    }
                } else {
                    return false;
                }
                break;
            case 1:
                C42821yj r3 = (C42821yj) this.A00;
                if (((C14550pN) r3.A22).A09.A1W() && keyEvent != null && keyEvent.getKeyCode() == 66 && keyEvent.getAction() == 0) {
                    r3.A0m(false);
                    break;
                } else {
                    return false;
                }
                break;
            case 2:
                C42821yj r1 = (C42821yj) this.A00;
                if (i2 != 23 || keyEvent.getAction() != 0 || r1.A0q() || r1.A2w.A01()) {
                    return false;
                }
                r1.A0L();
                r1.A0E();
                AnonymousClass1ZK r12 = r1.A4F;
                if (r12.A0P == null) {
                    r12.A06();
                    break;
                } else {
                    return false;
                }
                break;
            default:
                TokenizedSearchInput tokenizedSearchInput = (TokenizedSearchInput) this.A00;
                if (tokenizedSearchInput.A0C == null || keyEvent == null) {
                    return false;
                }
                if ((keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) && keyEvent.getAction() == 1) {
                    tokenizedSearchInput.A0C.A0Y(false);
                    break;
                } else {
                    return false;
                }
                break;
        }
        return true;
    }
}
