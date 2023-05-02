package X;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.obwhatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment;

/* renamed from: X.3bg  reason: invalid class name and case insensitive filesystem */
public class C67483bg extends C54882iQ {
    public final /* synthetic */ BottomSheetBehavior A00;
    public final /* synthetic */ UserNoticeBottomSheetDialogFragment A01;

    public C67483bg(BottomSheetBehavior bottomSheetBehavior, UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment) {
        this.A01 = userNoticeBottomSheetDialogFragment;
        this.A00 = bottomSheetBehavior;
    }

    public void A01(View view, float f2) {
    }

    public void A02(View view, int i2) {
        if (i2 != 3) {
            this.A00.A0M(3);
        }
    }
}
