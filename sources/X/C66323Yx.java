package X;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.3Yx  reason: invalid class name and case insensitive filesystem */
public class C66323Yx extends AnonymousClass3M2 {
    public C66323Yx() {
        super(Looper.getMainLooper());
    }

    public C66323Yx(Looper looper) {
        super(looper);
    }

    public final void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            try {
                throw AnonymousClass000.A0W("onResult");
            } catch (RuntimeException e2) {
                throw e2;
            }
        } else if (i2 != 2) {
            StringBuilder A0g = C13690nt.A0g(45);
            A0g.append("Don't know how to handle message: ");
            A0g.append(i2);
            Log.wtf("BasePendingResult", A0g.toString(), new Exception());
        } else {
            ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.A0A);
        }
    }
}
