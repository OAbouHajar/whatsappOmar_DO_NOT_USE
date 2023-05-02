package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.whatsapp.util.Log;

/* renamed from: X.1ss  reason: invalid class name and case insensitive filesystem */
public class C39671ss extends Handler {
    public final /* synthetic */ AnonymousClass126 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39671ss(Looper looper, AnonymousClass126 r2) {
        super(looper);
        this.A00 = r2;
    }

    public void dispatchMessage(Message message) {
        long uptimeMillis = SystemClock.uptimeMillis();
        super.dispatchMessage(message);
        long uptimeMillis2 = SystemClock.uptimeMillis() - uptimeMillis;
        if (uptimeMillis2 > 1000) {
            StringBuilder sb = new StringBuilder("AsyncCommitManager/receipt/dispatching id: ");
            sb.append(message.arg1);
            sb.append(" msg:");
            sb.append(message.getCallback());
            sb.append(" took:");
            sb.append(uptimeMillis2);
            Log.i(sb.toString());
        }
    }
}
