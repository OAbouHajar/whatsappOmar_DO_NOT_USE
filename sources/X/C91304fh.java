package X;

import android.content.DialogInterface;
import com.obwhatsapp.textstatuscomposer.DiscardWarningDialogFragment;
import com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity;

/* renamed from: X.4fh  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91304fh implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ DiscardWarningDialogFragment A01;
    public final /* synthetic */ boolean A02;

    public /* synthetic */ C91304fh(DiscardWarningDialogFragment discardWarningDialogFragment, int i2, boolean z2) {
        this.A01 = discardWarningDialogFragment;
        this.A00 = i2;
        this.A02 = z2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        C41521w4 r0;
        DiscardWarningDialogFragment discardWarningDialogFragment = this.A01;
        int i3 = this.A00;
        boolean z2 = this.A02;
        TextStatusComposerActivity textStatusComposerActivity = (TextStatusComposerActivity) discardWarningDialogFragment.A0D();
        discardWarningDialogFragment.A1D();
        if (i3 != 2 || !z2) {
            C41521w4 r2 = textStatusComposerActivity.A0e;
            if (r2 != null) {
                r2.A04(true);
                r2.A03(r2.A09);
                r2.A09 = null;
                r2.A03(r2.A0A);
                r2.A0A = null;
            }
            textStatusComposerActivity.finish();
        } else if (textStatusComposerActivity.A0d != null && (r0 = textStatusComposerActivity.A0e) != null) {
            r0.A00();
        }
    }
}
