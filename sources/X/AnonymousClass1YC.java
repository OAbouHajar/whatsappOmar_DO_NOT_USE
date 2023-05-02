package X;

import androidx.fragment.app.DialogFragment;
import com.facebook.redex.IDxCListenerShape22S0000000_2_I0;
import com.obwhatsapp.LegacyMessageDialogFragment;
import com.obwhatsapp.R;
import com.obwhatsapp.support.DescribeProblemActivity;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;

/* renamed from: X.1YC  reason: invalid class name */
public class AnonymousClass1YC implements AnonymousClass1YD {
    public final /* synthetic */ C14550pN A00;
    public final /* synthetic */ DescribeProblemActivity A01;

    public AnonymousClass1YC(C14550pN r1, DescribeProblemActivity describeProblemActivity) {
        this.A01 = describeProblemActivity;
        this.A00 = r1;
    }

    public void AOL() {
        Log.e("DescribeProblemActivity/contactSupport/onDeliveryFailure, falling back to email support.");
        this.A00.Ac1();
        this.A01.A37();
    }

    public void AOM(int i2) {
        StringBuilder sb = new StringBuilder("DescribeProblemActivity/contactSupport/onError/errorCode=");
        sb.append(i2);
        sb.append(" falling back to email support.");
        Log.e(sb.toString());
        this.A00.Ac1();
        this.A01.A37();
    }

    public void AON(GroupJid groupJid) {
        AnonymousClass2T3 A012 = LegacyMessageDialogFragment.A01(new Object[0], R.string.str0445);
        A012.A01(new IDxCListenerShape22S0000000_2_I0(8), R.string.str0e87);
        A012.A00 = 1;
        DialogFragment A002 = A012.A00();
        DescribeProblemActivity describeProblemActivity = this.A01;
        A002.A1G(describeProblemActivity.AGM(), (String) null);
        C14550pN r1 = this.A00;
        r1.Ac1();
        describeProblemActivity.A2X(new C14750ph().A0x(r1, groupJid), true);
    }
}
