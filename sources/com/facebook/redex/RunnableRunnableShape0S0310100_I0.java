package com.facebook.redex;

import X.AnonymousClass1z1;
import X.C15830rv;
import X.C212613k;
import X.C34151jm;
import com.obwhatsapp.MuteDialogFragment;
import java.util.List;

public class RunnableRunnableShape0S0310100_I0 implements Runnable {
    public long A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public final int A05 = 1;

    public RunnableRunnableShape0S0310100_I0(AnonymousClass1z1 r2, C212613k r3, C34151jm r4, long j2) {
        this.A01 = r3;
        this.A02 = r4;
        this.A04 = true;
        this.A00 = j2;
        this.A03 = r2;
    }

    public RunnableRunnableShape0S0310100_I0(MuteDialogFragment muteDialogFragment, C15830rv r3, List list, long j2, boolean z2) {
        this.A01 = muteDialogFragment;
        this.A04 = z2;
        this.A02 = list;
        this.A00 = j2;
        this.A03 = r3;
    }

    public final void run() {
        if (this.A05 != 0) {
            long j2 = this.A00;
            C212613k.A00((AnonymousClass1z1) this.A03, (C212613k) this.A01, (C34151jm) this.A02, j2);
            return;
        }
        MuteDialogFragment muteDialogFragment = (MuteDialogFragment) this.A01;
        boolean z2 = this.A04;
        List<C15830rv> list = (List) this.A02;
        long j3 = this.A00;
        C15830rv r4 = (C15830rv) this.A03;
        if (!z2) {
            muteDialogFragment.A1N(r4, j3);
            muteDialogFragment.A01.A0K(new RunnableRunnableShape2S0200000_I0(r4, 20, muteDialogFragment));
        } else if (list != null) {
            for (C15830rv A1N : list) {
                muteDialogFragment.A1N(A1N, j3);
            }
            muteDialogFragment.A01.A0K(new RunnableRunnableShape2S0100000_I0_1(muteDialogFragment, 4));
        }
    }
}
