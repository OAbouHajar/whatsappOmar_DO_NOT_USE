package com.facebook.redex;

import X.AnonymousClass2NR;
import android.view.View;
import android.widget.ProgressBar;
import com.obwhatsapp.CircularProgressBar;

public class IDxIListenerShape29S0000000_2_I1 implements AnonymousClass2NR {
    public final int A00;

    public IDxIListenerShape29S0000000_2_I1(int i2) {
        this.A00 = i2;
    }

    public final void ASD(View view) {
        CircularProgressBar circularProgressBar;
        switch (this.A00) {
            case 0:
            case 2:
                circularProgressBar = (CircularProgressBar) view;
                circularProgressBar.setMax(100);
                break;
            case 4:
                ProgressBar progressBar = (ProgressBar) view;
                progressBar.setProgress(0);
                progressBar.setIndeterminate(true);
                progressBar.setVisibility(8);
                return;
            default:
                circularProgressBar = (CircularProgressBar) view;
                break;
        }
        circularProgressBar.A0B = 0;
    }
}
