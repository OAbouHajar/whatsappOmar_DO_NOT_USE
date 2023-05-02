package X;

import android.os.SystemClock;
import android.widget.CheckBox;
import com.obwhatsapp.conversationslist.LeaveGroupsDialogFragment;
import java.util.List;

/* renamed from: X.3Hw  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3Hw implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ CheckBox A01;
    public final /* synthetic */ C14550pN A02;
    public final /* synthetic */ LeaveGroupsDialogFragment A03;
    public final /* synthetic */ C16050sL A04;
    public final /* synthetic */ String A05;

    public /* synthetic */ AnonymousClass3Hw(CheckBox checkBox, C14550pN r2, LeaveGroupsDialogFragment leaveGroupsDialogFragment, C16050sL r4, String str, int i2) {
        this.A03 = leaveGroupsDialogFragment;
        this.A00 = i2;
        this.A01 = checkBox;
        this.A04 = r4;
        this.A02 = r2;
        this.A05 = str;
    }

    public final void run() {
        LeaveGroupsDialogFragment leaveGroupsDialogFragment = this.A03;
        int i2 = this.A00;
        CheckBox checkBox = this.A01;
        C16050sL r10 = this.A04;
        C14550pN r3 = this.A02;
        String str = this.A05;
        if (i2 == 1) {
            SystemClock.sleep(300);
        }
        if (checkBox == null || !checkBox.isChecked()) {
            leaveGroupsDialogFragment.A0E.A05(new C76483tz(leaveGroupsDialogFragment, leaveGroupsDialogFragment.A09, leaveGroupsDialogFragment.A0D, r10, i2));
            return;
        }
        C16010sH A0A = leaveGroupsDialogFragment.A03.A0A(r10);
        C25931Lr r2 = leaveGroupsDialogFragment.A05;
        C101404xG r4 = new C101404xG(leaveGroupsDialogFragment.A00, i2);
        r2.A01(A0A, str, (List) null);
        r2.A00(r3, r4, A0A, (String) null, (String) null, str, true);
    }
}
