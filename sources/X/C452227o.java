package X;

import com.whatsapp.jid.DeviceJid;
import java.util.concurrent.Callable;

/* renamed from: X.27o  reason: invalid class name and case insensitive filesystem */
public class C452227o implements Callable {
    public final C208211s A00;
    public final DeviceJid A01;

    public C452227o(C208211s r1, DeviceJid deviceJid) {
        this.A01 = deviceJid;
        this.A00 = r1;
    }

    public /* bridge */ /* synthetic */ Object call() {
        return this.A00.A0B(C28851Ya.A02(this.A01));
    }
}
