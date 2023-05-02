package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.2br  reason: invalid class name and case insensitive filesystem */
public final class C51552br extends Handler implements AnonymousClass2H8, C51562bs {
    public boolean A00;
    public final /* synthetic */ C41391vi A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51552br(C41391vi r2) {
        super(r2.getLooper());
        this.A01 = r2;
    }

    public void ASN(C28371Vv r4, String str) {
        Message obtainMessage = obtainMessage(4, r4);
        obtainMessage.getData().putString("iqId", str);
        obtainMessage.sendToTarget();
    }

    public void AZq(Message message) {
        message.what = 0;
        sendMessage(message);
    }

    public void handleMessage(Message message) {
        boolean z2;
        int i2 = message.what;
        if (i2 == 0) {
            C41391vi.A00(message, this.A01);
        } else if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 4) {
                    C41391vi.A01(message, this.A01);
                } else if (i2 == 5) {
                    AnonymousClass1CP r0 = this.A01.A0l;
                    r0.A09.obtainMessage(6, message.obj).sendToTarget();
                }
            } else if (!this.A00) {
                C41391vi r2 = this.A01;
                if (r2.A03.hasMessages(0)) {
                    r2.A04();
                    z2 = false;
                } else {
                    r2.A04();
                    z2 = true;
                }
                r2.A07(z2);
            }
        } else if (!this.A00) {
            C41391vi r1 = this.A01;
            r1.A04();
            r1.A07(false);
        }
    }
}
