package X;

import android.app.Activity;
import android.os.Build;
import com.obwhatsapp.conversation.conversationrow.nativeflow.commerce.extensions.AndroidOreoOrientationIssueHandler$1;

/* renamed from: X.22Q  reason: invalid class name */
public class AnonymousClass22Q {
    public Integer A00 = null;
    public final C003501o A01 = new AndroidOreoOrientationIssueHandler$1(this);

    public void A02(Activity activity) {
        if (Build.VERSION.SDK_INT == 26 && (activity instanceof C001100m)) {
            ((C001100m) activity).A06.A00(this.A01);
            this.A00 = Integer.valueOf(activity.getRequestedOrientation());
            activity.setRequestedOrientation(1);
        }
    }
}
