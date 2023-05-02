package X;

import android.app.Activity;
import com.facebook.redex.RunnableRunnableShape14S0200000_I1_2;
import com.facebook.redex.RunnableRunnableShape1S0700000_I1;
import com.facebook.redex.RunnableRunnableShape3S0300000_I1;
import java.lang.ref.Reference;
import java.util.Set;

/* renamed from: X.4z5  reason: invalid class name and case insensitive filesystem */
public class C102524z5 implements C109425Sb {
    public final /* synthetic */ RunnableRunnableShape1S0700000_I1 A00;

    public C102524z5(RunnableRunnableShape1S0700000_I1 runnableRunnableShape1S0700000_I1) {
        this.A00 = runnableRunnableShape1S0700000_I1;
    }

    public void AQR(int i2) {
        RunnableRunnableShape1S0700000_I1 runnableRunnableShape1S0700000_I1 = this.A00;
        Activity activity = (Activity) ((Reference) runnableRunnableShape1S0700000_I1.A05).get();
        if (activity != null) {
            activity.runOnUiThread(new RunnableRunnableShape14S0200000_I1_2(runnableRunnableShape1S0700000_I1, 25, activity));
        }
    }

    public void AYu() {
        RunnableRunnableShape1S0700000_I1 runnableRunnableShape1S0700000_I1 = this.A00;
        Activity activity = (Activity) ((Reference) runnableRunnableShape1S0700000_I1.A05).get();
        if (activity != null) {
            activity.runOnUiThread(new RunnableRunnableShape14S0200000_I1_2(runnableRunnableShape1S0700000_I1, 25, activity));
        }
    }

    public void AZN(Set set) {
        Activity activity = (Activity) ((Reference) this.A00.A05).get();
        if (activity != null) {
            activity.runOnUiThread(new RunnableRunnableShape3S0300000_I1(this, activity, set, 29));
        }
    }
}
