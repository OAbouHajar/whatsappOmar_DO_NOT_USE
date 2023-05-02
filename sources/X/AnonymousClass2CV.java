package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.util.Log;
import java.util.LinkedList;

/* renamed from: X.2CV  reason: invalid class name */
public final class AnonymousClass2CV extends Handler implements AnonymousClass2CU {
    public final /* synthetic */ AnonymousClass2CW A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2CV(Looper looper, AnonymousClass2CW r2) {
        super(looper);
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            Log.i("xmpp/writer/recv/connected");
            AnonymousClass2CW r2 = this.A00;
            r2.A00 = (C51542bq) message.obj;
            r2.A01 = false;
            while (!r2.A01) {
                LinkedList linkedList = r2.A06;
                if (!linkedList.isEmpty()) {
                    r2.A00((Message) linkedList.remove());
                } else {
                    return;
                }
            }
        } else if (i2 == 1) {
            this.A00.A01 = true;
        } else if (i2 == 2) {
            this.A00.A00(message);
        }
    }
}
