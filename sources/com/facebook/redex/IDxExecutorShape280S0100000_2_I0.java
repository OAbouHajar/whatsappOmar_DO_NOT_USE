package com.facebook.redex;

import X.C14870pt;
import X.C16320sq;
import android.os.Handler;
import java.util.concurrent.Executor;

public class IDxExecutorShape280S0100000_2_I0 implements Executor {
    public Object A00;
    public final int A01;

    public IDxExecutorShape280S0100000_2_I0(Object obj, int i2) {
        this.A01 = i2;
        this.A00 = obj;
    }

    public final void execute(Runnable runnable) {
        int i2 = this.A01;
        Object obj = this.A00;
        switch (i2) {
            case 0:
                ((Handler) obj).post(runnable);
                return;
            case 1:
                ((C14870pt) obj).A0K(runnable);
                return;
            case 2:
                ((C16320sq) obj).Acl(runnable);
                return;
            default:
                ((C14870pt) obj).Acq(runnable);
                return;
        }
    }
}
