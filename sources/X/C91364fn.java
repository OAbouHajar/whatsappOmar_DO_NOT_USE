package X;

import android.content.DialogInterface;
import com.obwhatsapp.backup.google.SingleChoiceListDialogFragment;

/* renamed from: X.4fn  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91364fn implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SingleChoiceListDialogFragment A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String[] A03;
    public final /* synthetic */ boolean[] A04;

    public /* synthetic */ C91364fn(SingleChoiceListDialogFragment singleChoiceListDialogFragment, String str, String[] strArr, boolean[] zArr, int i2) {
        this.A01 = singleChoiceListDialogFragment;
        this.A04 = zArr;
        this.A00 = i2;
        this.A03 = strArr;
        this.A02 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        SingleChoiceListDialogFragment singleChoiceListDialogFragment = this.A01;
        boolean[] zArr = this.A04;
        int i3 = this.A00;
        String[] strArr = this.A03;
        String str = this.A02;
        if (zArr == null || zArr[i2]) {
            singleChoiceListDialogFragment.A01.AXG(strArr, i3, i2);
            singleChoiceListDialogFragment.A02.set(true);
            dialogInterface.dismiss();
        } else if (str != null) {
            singleChoiceListDialogFragment.A00.A0H(str, 0);
        }
    }
}
