package X;

import com.facebook.redex.RunnableRunnableShape4S0100000_I0_3;
import com.obwhatsapp.businessdirectory.view.activity.BusinessDirectoryActivity;
import java.util.TimerTask;

/* renamed from: X.263  reason: invalid class name */
public class AnonymousClass263 extends TimerTask {
    public final /* synthetic */ BusinessDirectoryActivity A00;

    public AnonymousClass263(BusinessDirectoryActivity businessDirectoryActivity) {
        this.A00 = businessDirectoryActivity;
    }

    public void run() {
        this.A00.runOnUiThread(new RunnableRunnableShape4S0100000_I0_3(this, 28));
    }
}
