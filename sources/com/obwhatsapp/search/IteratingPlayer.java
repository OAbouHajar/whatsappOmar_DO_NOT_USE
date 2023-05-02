package com.obwhatsapp.search;

import X.AnonymousClass05I;
import X.AnonymousClass071;
import X.C003501o;
import X.C011405n;
import X.C14870pt;
import X.C55982kl;
import android.view.View;
import androidx.lifecycle.OnLifecycleEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.redex.IDxSListenerShape34S0100000_2_I0;
import com.facebook.redex.RunnableRunnableShape14S0100000_I0_13;

public class IteratingPlayer implements AnonymousClass05I, C003501o {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public boolean A03;
    public final AnonymousClass071 A04 = new IDxSListenerShape34S0100000_2_I0(this, 14);
    public final RecyclerView A05;
    public final C14870pt A06;
    public final Runnable A07 = new RunnableRunnableShape14S0100000_I0_13((Object) this, 11);

    public IteratingPlayer(RecyclerView recyclerView, C14870pt r4) {
        this.A06 = r4;
        this.A05 = recyclerView;
    }

    public final void A00() {
        if (this.A03) {
            this.A06.A0L(this.A07, 2000);
        }
    }

    public final void A01() {
        this.A03 = false;
        A04(this.A00, false);
        this.A06.A0J(this.A07);
    }

    public final void A02() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) this.A05.getLayoutManager();
        if (linearLayoutManager != null) {
            this.A01 = linearLayoutManager.A18();
            this.A02 = linearLayoutManager.A1A();
        } else if (!this.A03) {
            this.A03 = true;
            A00();
        }
    }

    public final void A03(int i2) {
        if (this.A01 > 0 || this.A02 > 0) {
            A04(this.A00, false);
            int min = Math.min(Math.max(i2, this.A01), this.A02);
            int i3 = min;
            while (!A05(i3)) {
                i3++;
                int i4 = this.A02;
                if (i3 > i4) {
                    i3 = this.A01;
                }
                if (min != i3) {
                    if (i3 <= i4) {
                        if (i3 < this.A01) {
                        }
                    }
                }
            }
            A04(i3, true);
            this.A00 = i3;
            return;
        }
        A01();
    }

    public final void A04(int i2, boolean z2) {
        C55982kl r0 = (C55982kl) this.A05.A0E(i2, false);
        if (r0 != null) {
            r0.A0B(z2);
        }
    }

    public final boolean A05(int i2) {
        C55982kl r0 = (C55982kl) this.A05.A0E(i2, false);
        if (r0 != null) {
            return r0.A0C();
        }
        return false;
    }

    public void AOQ(View view) {
        A02();
        if (!this.A03) {
            this.A03 = true;
            A00();
        }
    }

    public void AOR(View view) {
        A02();
    }

    @OnLifecycleEvent(C011405n.ON_START)
    public void onStart() {
        if (!this.A03) {
            this.A03 = true;
            A00();
        }
    }

    @OnLifecycleEvent(C011405n.ON_STOP)
    public void onStop() {
        A01();
    }
}
