package X;

import com.facebook.redex.RunnableRunnableShape4S0100000_I0_3;
import com.whatsapp.nativelibloader.WhatsAppLibLoader;

/* renamed from: X.1C0  reason: invalid class name */
public class AnonymousClass1C0 implements C18000vz {
    public final C23441Bz A00;
    public final C18260wP A01;
    public final WhatsAppLibLoader A02;
    public final AnonymousClass1WA A03;

    public AnonymousClass1C0(C23441Bz r3, C18260wP r4, WhatsAppLibLoader whatsAppLibLoader, C16320sq r6) {
        this.A03 = new AnonymousClass1WA(r6, false);
        this.A00 = r3;
        this.A02 = whatsAppLibLoader;
        this.A01 = r4;
    }

    public void AP4(AnonymousClass1UX r4) {
        if (this.A02.A03()) {
            this.A03.execute(new RunnableRunnableShape4S0100000_I0_3(this, 39));
        }
    }
}
