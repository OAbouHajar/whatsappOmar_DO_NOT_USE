package X;

import com.facebook.redex.RunnableRunnableShape0S1100000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.blocklist.BlockConfirmationDialogFragment;

/* renamed from: X.4xH  reason: invalid class name and case insensitive filesystem */
public class C101414xH implements AnonymousClass1Y7 {
    public final /* synthetic */ C14550pN A00;
    public final /* synthetic */ BlockConfirmationDialogFragment A01;
    public final /* synthetic */ boolean A02;

    public C101414xH(C14550pN r1, BlockConfirmationDialogFragment blockConfirmationDialogFragment, boolean z2) {
        this.A01 = blockConfirmationDialogFragment;
        this.A00 = r1;
        this.A02 = z2;
    }

    public void ARx(C16010sH r8) {
        BlockConfirmationDialogFragment blockConfirmationDialogFragment = this.A01;
        C14550pN r5 = this.A00;
        String string = r5.getString(R.string.str1409);
        boolean z2 = this.A02;
        blockConfirmationDialogFragment.A00.A0C((C14600pS) null);
        blockConfirmationDialogFragment.A00.A0K(new RunnableRunnableShape0S1100000_I0(16, string, blockConfirmationDialogFragment));
        if (!z2) {
            r5.finish();
        }
    }

    public void AZU(C16010sH r8) {
        BlockConfirmationDialogFragment blockConfirmationDialogFragment = this.A01;
        C14550pN r5 = this.A00;
        String A0d = C13680ns.A0d(r5, blockConfirmationDialogFragment.A06.A08(r8), C13680ns.A1b(), 0, R.string.str1408);
        boolean z2 = this.A02;
        blockConfirmationDialogFragment.A00.A0C((C14600pS) null);
        blockConfirmationDialogFragment.A00.A0K(new RunnableRunnableShape0S1100000_I0(16, A0d, blockConfirmationDialogFragment));
        if (!z2) {
            r5.finish();
        }
    }
}
