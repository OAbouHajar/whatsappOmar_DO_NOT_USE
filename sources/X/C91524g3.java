package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.obwhatsapp.R;

/* renamed from: X.4g3  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91524g3 implements DialogInterface.OnShowListener {
    public final void onShow(DialogInterface dialogInterface) {
        View findViewById = ((Dialog) dialogInterface).findViewById(R.id.design_bottom_sheet);
        AnonymousClass00B.A04(findViewById);
        BottomSheetBehavior A00 = BottomSheetBehavior.A00(findViewById);
        A00.A0M(3);
        A00.A0L(findViewById.getHeight());
    }
}
