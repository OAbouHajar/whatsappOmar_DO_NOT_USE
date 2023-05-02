package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.obwhatsapp.registration.RegisterName;

/* renamed from: X.3Ls  reason: invalid class name and case insensitive filesystem */
public class C63843Ls extends Handler {
    public final /* synthetic */ RegisterName A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63843Ls(Looper looper, RegisterName registerName) {
        super(looper);
        this.A00 = registerName;
    }

    public void handleMessage(Message message) {
        this.A00.A3C();
    }
}
