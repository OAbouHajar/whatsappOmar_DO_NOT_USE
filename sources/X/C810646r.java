package X;

import android.os.Bundle;
import com.obwhatsapp.group.ui.GroupJoinRequestReasonBottomSheetFragment;
import com.whatsapp.jid.GroupJid;

/* renamed from: X.46r  reason: invalid class name and case insensitive filesystem */
public final class C810646r {
    public static final GroupJoinRequestReasonBottomSheetFragment A00(C15830rv r4, GroupJid groupJid, String str, String str2, String str3) {
        C18450wi.A0H(str, 0);
        C18450wi.A0J(r4, groupJid);
        AnonymousClass3K2.A1I(str2, str3);
        GroupJoinRequestReasonBottomSheetFragment groupJoinRequestReasonBottomSheetFragment = new GroupJoinRequestReasonBottomSheetFragment();
        Bundle A0D = C13690nt.A0D();
        A0D.putString("message", str);
        A0D.putString("admin_jid", r4.getRawString());
        A0D.putString("group_jid", groupJid.getRawString());
        A0D.putString("raw_parent_jid", str3);
        A0D.putString("group_subject", str2);
        groupJoinRequestReasonBottomSheetFragment.A0T(A0D);
        return groupJoinRequestReasonBottomSheetFragment;
    }
}
