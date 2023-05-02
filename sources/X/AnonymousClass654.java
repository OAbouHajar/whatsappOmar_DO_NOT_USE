package X;

import android.view.animation.AccelerateDecelerateInterpolator;
import com.facebook.redex.IDxCListenerShape33S0200000_3_I1;
import com.obwhatsapp.R;
import java.util.ArrayList;
import org.npci.commonlibrary.NPCIFragment;

/* renamed from: X.654  reason: invalid class name */
public class AnonymousClass654 implements Runnable {
    public final /* synthetic */ NPCIFragment A00;

    public AnonymousClass654(NPCIFragment nPCIFragment) {
        this.A00 = nPCIFragment;
    }

    public void run() {
        NPCIFragment nPCIFragment = this.A00;
        int i2 = nPCIFragment.A00;
        if (i2 != -1) {
            ArrayList arrayList = nPCIFragment.A0B;
            if (arrayList.get(i2) instanceof C110495eG) {
                C110495eG A0l = C110115dX.A0l(arrayList, i2);
                AnonymousClass0SH A01 = A0l.A01(A0l.A05, false);
                A01.A09(new AccelerateDecelerateInterpolator());
                A01.A02();
                A0l.Agw(AnonymousClass00T.A04(nPCIFragment.A0C(), R.drawable.ic_action_reload), new IDxCListenerShape33S0200000_3_I1(A0l, 32, this), nPCIFragment.A0J(R.string.str1d2b), 0, true, true);
            }
        }
    }
}
