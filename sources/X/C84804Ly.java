package X;

import android.content.Context;
import android.os.Build;
import com.facebook.redex.IDxObserverShape116S0100000_2_I1;

/* renamed from: X.4Ly  reason: invalid class name and case insensitive filesystem */
public class C84804Ly {
    public AnonymousClass0NN A00;
    public AnonymousClass023 A01;
    public boolean A02;
    public boolean A03;

    public C84804Ly(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            this.A00 = new AnonymousClass0NN(context);
            this.A01 = new IDxObserverShape116S0100000_2_I1(this, 41);
        }
    }
}
