package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.obwhatsapp.registration.RegisterName;

/* renamed from: X.3Lr  reason: invalid class name and case insensitive filesystem */
public class C63833Lr extends Handler {
    public final /* synthetic */ RegisterName A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63833Lr(Looper looper, RegisterName registerName) {
        super(looper);
        this.A00 = registerName;
    }

    public void handleMessage(Message message) {
        C51332bS r1 = RegisterName.A1c;
        if (r1 != null && r1.A03) {
            boolean z2 = r1.A04;
            int i2 = 1;
            RegisterName registerName = this.A00;
            if (z2) {
                AnonymousClass2v0 r0 = registerName.A14;
                if (r0 != null) {
                    r0.A00(1);
                    return;
                }
                return;
            }
            AnonymousClass29T.A00(registerName, 0);
            int i3 = RegisterName.A1c.A00;
            if (i3 != 1) {
                if (i3 == 3) {
                    i2 = 109;
                } else {
                    return;
                }
            }
            AnonymousClass29T.A01(registerName, i2);
        }
    }
}
