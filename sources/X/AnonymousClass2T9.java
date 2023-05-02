package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.redex.RunnableRunnableShape12S0100000_I0_11;

/* renamed from: X.2T9  reason: invalid class name */
public class AnonymousClass2T9 implements C37861pr {
    public final /* synthetic */ C47712Kc A00;
    public final /* synthetic */ C14810pn A01;

    public AnonymousClass2T9(C47712Kc r1, C14810pn r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public int AFD() {
        return 1;
    }

    public void AMH(long j2) {
        Handler handler = new Handler(Looper.getMainLooper());
        Message obtain = Message.obtain(handler, new RunnableRunnableShape12S0100000_I0_11((Object) this.A01, 13));
        AnonymousClass45i.A00(obtain);
        handler.sendMessageAtFrontOfQueue(obtain);
    }
}
