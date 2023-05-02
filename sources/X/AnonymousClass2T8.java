package X;

import android.os.SystemClock;
import android.view.View;
import com.facebook.redex.IDxComparatorShape19S0000000_2_I0;
import com.facebook.redex.IDxDListenerShape358S0100000_2_I0;
import com.facebook.redex.IDxDListenerShape57S0200000_2_I0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2T8  reason: invalid class name */
public class AnonymousClass2T8 {
    public long A00 = SystemClock.elapsedRealtime();
    public boolean A01 = false;
    public final C14810pn A02 = new IDxDListenerShape358S0100000_2_I0(this, 2);
    public final List A03 = new ArrayList();

    public AnonymousClass2T8(View view) {
        view.getViewTreeObserver().addOnPreDrawListener(new IDxDListenerShape57S0200000_2_I0(view, 3, this));
    }

    public void A00(C37861pr r4) {
        AnonymousClass00B.A01();
        AnonymousClass00B.A01();
        if (this.A01) {
            r4.AMH(this.A00);
            return;
        }
        List list = this.A03;
        list.add(r4);
        Collections.sort(list, new IDxComparatorShape19S0000000_2_I0(32));
    }
}
