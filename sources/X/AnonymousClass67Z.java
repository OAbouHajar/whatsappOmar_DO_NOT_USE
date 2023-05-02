package X;

import java.util.TimerTask;
import org.npci.commonlibrary.NPCIFragment;

/* renamed from: X.67Z  reason: invalid class name */
public class AnonymousClass67Z extends TimerTask {
    public final /* synthetic */ NPCIFragment A00;

    public AnonymousClass67Z(NPCIFragment nPCIFragment) {
        this.A00 = nPCIFragment;
    }

    public void run() {
        NPCIFragment nPCIFragment = this.A00;
        if (!nPCIFragment.A08.optString("resendOTPFeature", "false").equals("false") && !nPCIFragment.A0A) {
            nPCIFragment.A0C().runOnUiThread(new AnonymousClass654(nPCIFragment));
        }
    }
}
