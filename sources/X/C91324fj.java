package X;

import android.content.DialogInterface;
import com.facebook.redex.RunnableRunnableShape0S0310100_I0;
import com.obwhatsapp.MuteDialogFragment;
import java.util.List;

/* renamed from: X.4fj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C91324fj implements DialogInterface.OnClickListener {
    public final /* synthetic */ MuteDialogFragment A00;
    public final /* synthetic */ C15830rv A01;
    public final /* synthetic */ List A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C91324fj(MuteDialogFragment muteDialogFragment, C15830rv r2, List list, boolean z2) {
        this.A00 = muteDialogFragment;
        this.A03 = z2;
        this.A02 = list;
        this.A01 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        int i3;
        MuteDialogFragment muteDialogFragment = this.A00;
        boolean z2 = this.A03;
        List list = this.A02;
        C15830rv r5 = this.A01;
        int i4 = muteDialogFragment.A00;
        int[] iArr = muteDialogFragment.A02.A05(C15910s6.A0e) ? C47662Jw.A05 : C47662Jw.A04;
        long currentTimeMillis = (i4 >= iArr.length || (i3 = iArr[i4]) == -1) ? -1 : System.currentTimeMillis() + (((long) i3) * 60000);
        C13680ns.A0z(muteDialogFragment.A07.A0K().putInt("last_mute_selection", muteDialogFragment.A00), "last_mute_show_notifications", muteDialogFragment.A0B);
        muteDialogFragment.A0A.Acl(new RunnableRunnableShape0S0310100_I0(muteDialogFragment, r5, list, currentTimeMillis, z2));
    }
}
