package com.facebook.redex;

import X.AnonymousClass09F;
import X.AnonymousClass0QX;
import X.C07360bC;
import X.C13190lc;
import android.view.View;

public class IDxLAdapterShape0S0111000_I1 extends C07360bC {
    public int A00;
    public Object A01;
    public boolean A02;
    public final int A03 = 1;

    public IDxLAdapterShape0S0111000_I1(AnonymousClass09F r2, int i2) {
        this.A01 = r2;
        this.A00 = i2;
        this.A02 = false;
    }

    public IDxLAdapterShape0S0111000_I1(AnonymousClass0QX r2) {
        this.A01 = r2;
        this.A02 = false;
        this.A00 = 0;
    }

    public void AMR(View view) {
        if (1 - this.A03 == 0) {
            this.A02 = true;
        }
    }

    public void AMS(View view) {
        if (this.A03 == 0) {
            int i2 = this.A00 + 1;
            this.A00 = i2;
            AnonymousClass0QX r2 = (AnonymousClass0QX) this.A01;
            if (i2 == r2.A05.size()) {
                C13190lc r1 = r2.A02;
                if (r1 != null) {
                    r1.AMS((View) null);
                }
                this.A00 = 0;
                this.A02 = false;
                r2.A03 = false;
            }
        } else if (!this.A02) {
            ((AnonymousClass09F) this.A01).A09.setVisibility(this.A00);
        }
    }

    public void AMT(View view) {
        if (this.A03 != 0) {
            ((AnonymousClass09F) this.A01).A09.setVisibility(0);
        } else if (!this.A02) {
            this.A02 = true;
            C13190lc r1 = ((AnonymousClass0QX) this.A01).A02;
            if (r1 != null) {
                r1.AMT((View) null);
            }
        }
    }
}
