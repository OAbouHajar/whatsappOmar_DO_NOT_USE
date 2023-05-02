package X;

import android.os.Handler;
import com.facebook.redex.RunnableRunnableShape14S0100000_I0_13;
import com.obwhatsapp.service.UnsentMessagesNetworkAvailableJob;

/* renamed from: X.2SS  reason: invalid class name */
public class AnonymousClass2SS extends C18940xV {
    public final /* synthetic */ UnsentMessagesNetworkAvailableJob A00;

    public AnonymousClass2SS(UnsentMessagesNetworkAvailableJob unsentMessagesNetworkAvailableJob) {
        this.A00 = unsentMessagesNetworkAvailableJob;
    }

    public static /* synthetic */ void A00(AnonymousClass2SS r1) {
        UnsentMessagesNetworkAvailableJob unsentMessagesNetworkAvailableJob = r1.A00;
        unsentMessagesNetworkAvailableJob.A01.A03(unsentMessagesNetworkAvailableJob.A08);
    }

    public void A07(C16740tZ r4, int i2) {
        UnsentMessagesNetworkAvailableJob unsentMessagesNetworkAvailableJob = this.A00;
        if (!unsentMessagesNetworkAvailableJob.A03.A03()) {
            Handler A002 = unsentMessagesNetworkAvailableJob.A07;
            A002.removeCallbacks(unsentMessagesNetworkAvailableJob.A0A);
            UnsentMessagesNetworkAvailableJob.A06(unsentMessagesNetworkAvailableJob);
            A002.post(new RunnableRunnableShape14S0100000_I0_13((Object) this, 24));
        }
    }
}
