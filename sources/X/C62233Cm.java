package X;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import com.OM7753.GOLD;
import com.facebook.redex.IDxDListenerShape411S0100000_2_I1;
import com.facebook.redex.IDxLListenerShape145S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.status.playback.fragment.StatusPlaybackBaseFragment;
import com.obwhatsapp.status.playback.fragment.StatusPlaybackContactFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3Cm  reason: invalid class name and case insensitive filesystem */
public class C62233Cm implements View.OnClickListener {
    public ViewTreeObserver A00;
    public final View A01;
    public final ViewTreeObserver.OnGlobalLayoutListener A02 = new IDxLListenerShape145S0100000_2_I1(this, 11);
    public final C05230Pu A03;
    public final StatusPlaybackBaseFragment A04;
    public final int[] A05 = new int[2];
    public final int[] A06 = new int[2];

    public C62233Cm(Context context, View view, AnonymousClass013 r6, StatusPlaybackBaseFragment statusPlaybackBaseFragment) {
        this.A03 = new C05230Pu(context, view, C13680ns.A1Z(r6) ? 5 : 3, R.attr.attr0024);
        this.A01 = view;
        this.A04 = statusPlaybackBaseFragment;
    }

    public void onClick(View view) {
        if (this.A00 == null) {
            ViewTreeObserver viewTreeObserver = this.A01.getViewTreeObserver();
            this.A00 = viewTreeObserver;
            viewTreeObserver.addOnGlobalLayoutListener(this.A02);
        }
        View view2 = this.A01;
        int[] iArr = this.A05;
        view2.getLocationOnScreen(iArr);
        int[] iArr2 = this.A06;
        iArr2[0] = iArr[0];
        iArr2[1] = iArr[1];
        C05230Pu r6 = this.A03;
        C016607w r5 = r6.A04;
        r5.clear();
        StatusPlaybackBaseFragment statusPlaybackBaseFragment = this.A04;
        StatusPlaybackContactFragment statusPlaybackContactFragment = (StatusPlaybackContactFragment) statusPlaybackBaseFragment;
        boolean A0R = statusPlaybackContactFragment.A0V.A0R(statusPlaybackContactFragment.A0S);
        int i2 = R.id.menuitem_conversations_mute;
        int i3 = R.string.str0da3;
        if (A0R) {
            i2 = R.id.menuitem_conversations_unmute;
            i3 = R.string.str1896;
        }
        r5.add(0, i2, 0, i3);
        UserJid userJid = statusPlaybackContactFragment.A0S;
        if (C16030sJ.A0O(userJid) && userJid != C34091jg.A00) {
            r5.add(0, (int) R.id.menuitem_conversations_message_contact, 0, (int) R.string.str0d2e);
            r5.add(0, (int) R.id.menuitem_conversations_voice_call_contact, 0, (int) R.string.str011d);
            r5.add(0, (int) R.id.menuitem_conversations_video_call_contact, 0, (int) R.string.str19b6);
            r5.add(0, (int) R.id.menuitem_conversations_contact_info, 0, (int) R.string.str19d4);
            if (statusPlaybackContactFragment.A0P.A0E(C16620tM.A02, 2728)) {
                r5.add(0, (int) R.id.menuitem_report_status, 0, (int) R.string.str1420);
            }
        }
        GOLD.A0Y(r5, statusPlaybackBaseFragment.A0D(), 0);
        r6.A00 = new IDxDListenerShape411S0100000_2_I1(this, 1);
        r6.A01 = new AnonymousClass3DQ(statusPlaybackBaseFragment);
        r6.A00();
        statusPlaybackBaseFragment.A07 = true;
        statusPlaybackBaseFragment.A1A();
    }
}
