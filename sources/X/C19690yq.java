package X;

import android.app.Activity;
import android.content.Intent;

/* renamed from: X.0yq  reason: invalid class name and case insensitive filesystem */
public class C19690yq extends C19530ya {
    public final C16250si A00;

    public C19690yq(C16250si r1) {
        this.A00 = r1;
    }

    public void onActivityStarted(Activity activity) {
        super.onActivityStarted(activity);
        if (activity instanceof C14530pL) {
            if (Boolean.TRUE.equals(this.A00.A03.A01())) {
                Intent className = new Intent().setClassName(activity.getPackageName(), "com.obwhatsapp.blockinguserinteraction.BlockingUserInteractionActivity");
                className.putExtra("blocking_type", 0);
                activity.startActivity(className);
                activity.finish();
            }
        }
    }
}
