package X;

import android.content.DialogInterface;
import android.widget.CheckBox;
import com.obwhatsapp.R;
import com.obwhatsapp.conversationslist.LeaveGroupsDialogFragment;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.3C8  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3C8 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ CheckBox A01;
    public final /* synthetic */ LeaveGroupsDialogFragment A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;

    public /* synthetic */ AnonymousClass3C8(CheckBox checkBox, LeaveGroupsDialogFragment leaveGroupsDialogFragment, String str, List list, int i2) {
        this.A02 = leaveGroupsDialogFragment;
        this.A00 = i2;
        this.A04 = list;
        this.A01 = checkBox;
        this.A03 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        LeaveGroupsDialogFragment leaveGroupsDialogFragment = this.A02;
        int i3 = this.A00;
        List<C16050sL> list = this.A04;
        CheckBox checkBox = this.A01;
        String str = this.A03;
        C14550pN r8 = (C14550pN) leaveGroupsDialogFragment.A0C();
        Log.i("LeaveGroupsDialogFragment/user-try-leaveGroup");
        boolean A0A = leaveGroupsDialogFragment.A02.A0A();
        C14870pt r2 = leaveGroupsDialogFragment.A00;
        if (A0A) {
            if (i3 != 1) {
                r2.A08(R.string.str0f22, R.string.str13db);
                if (i3 == 2) {
                    leaveGroupsDialogFragment.A0r(C14750ph.A02(leaveGroupsDialogFragment.A0u()).addFlags(603979776));
                }
            }
            for (C16050sL r10 : list) {
                Log.i(AnonymousClass000.A0g("LeaveGroupsDialogFragment/exit/group:", r10));
                leaveGroupsDialogFragment.A09.A08(r10, true);
                leaveGroupsDialogFragment.A0G.Acl(new AnonymousClass3Hw(checkBox, r8, leaveGroupsDialogFragment, r10, str, i3));
            }
        } else {
            r2.A09(R.string.str08ca, 0);
        }
        C15860rz r1 = leaveGroupsDialogFragment.A06;
        C13680ns.A0w(r1.A0K(), "delete_chat_count", r1.A05() + list.size());
        if (i3 == 1) {
            leaveGroupsDialogFragment.A09.A05(2);
        }
        leaveGroupsDialogFragment.A1C();
    }
}
