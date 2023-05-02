package X;

import android.os.MessageQueue;
import com.obwhatsapp.AbstractAppShellDelegate;

/* renamed from: X.1U9  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1U9 implements MessageQueue.IdleHandler {
    public final /* synthetic */ AnonymousClass01G A00;
    public final /* synthetic */ AbstractAppShellDelegate A01;

    public /* synthetic */ AnonymousClass1U9(AnonymousClass01G r1, AbstractAppShellDelegate abstractAppShellDelegate) {
        this.A01 = abstractAppShellDelegate;
        this.A00 = r1;
    }

    public final boolean queueIdle() {
        return this.A01.lambda$queueAsyncInit$4(this.A00);
    }
}
