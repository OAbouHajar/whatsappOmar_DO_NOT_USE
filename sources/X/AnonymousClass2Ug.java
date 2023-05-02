package X;

import com.facebook.redex.RunnableRunnableShape4S0200000_I0_2;
import com.facebook.redex.RunnableRunnableShape6S0100000_I0_5;
import com.whatsapp.util.Log;

/* renamed from: X.2Ug  reason: invalid class name */
public class AnonymousClass2Ug implements C18960xX {
    public final /* synthetic */ long A00;
    public final /* synthetic */ AnonymousClass2Ui A01;
    public final /* synthetic */ AnonymousClass4M6 A02;

    public AnonymousClass2Ug(AnonymousClass2Ui r1, AnonymousClass4M6 r2, long j2) {
        this.A01 = r1;
        this.A00 = j2;
        this.A02 = r2;
    }

    public void AW1() {
        AnonymousClass2Ui r0 = this.A01;
        r0.A03.A0K(new RunnableRunnableShape6S0100000_I0_5(r0.A0G, 8));
    }

    public void AYd() {
        Log.i("CompanionDeviceQrHandler/handleSyncdDirty onSyncdDataDeleted");
        AnonymousClass2Ui r4 = this.A01;
        r4.A09.A08(this.A00, true);
        r4.A07.A03(this);
        r4.A03.A0K(new RunnableRunnableShape4S0200000_I0_2(this, 16, this.A02));
    }

    public void AYe() {
        Log.e("CompanionDeviceQrHandler/handleSyncdDirty onSyncdDataDeletionFailed");
        AnonymousClass2Ui r4 = this.A01;
        r4.A09.A08(this.A00, false);
        r4.A07.A03(this);
        r4.A03.A0K(new RunnableRunnableShape6S0100000_I0_5(this, 7));
    }
}
