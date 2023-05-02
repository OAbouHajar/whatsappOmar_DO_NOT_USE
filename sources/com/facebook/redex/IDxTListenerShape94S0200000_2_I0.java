package com.facebook.redex;

import android.database.sqlite.SQLiteTransactionListener;
import java.util.concurrent.atomic.AtomicBoolean;

public class IDxTListenerShape94S0200000_2_I0 implements SQLiteTransactionListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public IDxTListenerShape94S0200000_2_I0(Object obj, int i2, Object obj2) {
        this.A02 = i2;
        this.A00 = obj;
        this.A01 = obj2;
    }

    public void onBegin() {
        if (1 - this.A02 == 0) {
            ((AtomicBoolean) this.A01).set(false);
        }
    }

    public void onCommit() {
        switch (this.A02) {
            case 0:
                ((Runnable) this.A01).run();
                return;
            case 1:
                ((AtomicBoolean) this.A01).set(true);
                return;
            default:
                return;
        }
    }

    public void onRollback() {
        if (this.A02 != 0) {
            ((AtomicBoolean) this.A01).set(false);
        }
    }
}
