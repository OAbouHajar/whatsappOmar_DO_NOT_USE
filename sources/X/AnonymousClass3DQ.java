package X;

import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.view.MenuItem;
import com.obwhatsapp.R;
import com.obwhatsapp.status.StatusConfirmMuteDialogFragment;
import com.obwhatsapp.status.StatusConfirmUnmuteDialogFragment;
import com.obwhatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.obwhatsapp.support.ReportSpamDialogFragment;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.3DQ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3DQ implements C12270k7 {
    public final /* synthetic */ StatusPlaybackBaseFragment A00;

    public /* synthetic */ AnonymousClass3DQ(StatusPlaybackBaseFragment statusPlaybackBaseFragment) {
        this.A00 = statusPlaybackBaseFragment;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) this.A00;
        C001000l A0C = statusPlaybackContactFragment.A0C();
        if (A0C == null) {
            return false;
        }
        int itemId = menuItem.getItemId();
        boolean A10 = ((C16740tZ) statusPlaybackContactFragment.A0k.get(statusPlaybackContactFragment.A00)).A10(AccessibilityEventCompat.TYPE_GESTURE_DETECTION_START);
        if (itemId == R.id.menuitem_conversations_unmute) {
            UserJid userJid = statusPlaybackContactFragment.A0S;
            List list = statusPlaybackContactFragment.A0k;
            C54472hZ.A01(StatusConfirmUnmuteDialogFragment.A01(userJid, C13690nt.A0W(statusPlaybackContactFragment.A00), list != null ? ((C16740tZ) list.get(statusPlaybackContactFragment.A00)).A11.A01 : null, statusPlaybackContactFragment.A0j, (String) null, A10), statusPlaybackContactFragment);
            return true;
        } else if (itemId == R.id.menuitem_conversations_mute) {
            UserJid userJid2 = statusPlaybackContactFragment.A0S;
            List list2 = statusPlaybackContactFragment.A0k;
            C54472hZ.A01(StatusConfirmMuteDialogFragment.A01(userJid2, C13690nt.A0W(statusPlaybackContactFragment.A00), list2 != null ? ((C16740tZ) list2.get(statusPlaybackContactFragment.A00)).A11.A01 : null, statusPlaybackContactFragment.A0j, (String) null, A10), statusPlaybackContactFragment);
            return true;
        } else if (itemId == R.id.menuitem_conversations_voice_call_contact) {
            statusPlaybackContactFragment.A0A.A01(A0C, statusPlaybackContactFragment.A0C.A0A(statusPlaybackContactFragment.A0S), 22, false);
            return true;
        } else if (itemId == R.id.menuitem_conversations_video_call_contact) {
            statusPlaybackContactFragment.A0A.A01(A0C, statusPlaybackContactFragment.A0C.A0A(statusPlaybackContactFragment.A0S), 22, true);
            return true;
        } else if (itemId == R.id.menuitem_conversations_contact_info) {
            AnonymousClass2B0 r3 = statusPlaybackContactFragment.A03;
            AnonymousClass00B.A07(r3, "getViewHolder() is accessed before StatusPlaybackBaseFragment#onCreateView()");
            statusPlaybackContactFragment.A1O(statusPlaybackContactFragment.A0C.A0A(statusPlaybackContactFragment.A0S), r3);
            return true;
        } else if (itemId == R.id.menuitem_conversations_message_contact) {
            C54472hZ.A00(C14750ph.A0q().A0x(statusPlaybackContactFragment.A0u(), statusPlaybackContactFragment.A0S), statusPlaybackContactFragment);
            return true;
        } else if (itemId != R.id.menuitem_report_status) {
            return true;
        } else {
            C74483qc r2 = new C74483qc();
            r2.A00 = 0;
            statusPlaybackContactFragment.A0Q.A06(r2);
            ReportSpamDialogFragment A01 = ReportSpamDialogFragment.A01(C34771kq.A00, statusPlaybackContactFragment.A0S, (C41701wR) null, "status_post_report", 0, false, true, true, true, false, true);
            A01.A0C = (C16740tZ) statusPlaybackContactFragment.A0k.get(statusPlaybackContactFragment.A00);
            C54472hZ.A01(A01, statusPlaybackContactFragment);
            return true;
        }
    }
}
