package X;

import android.app.Activity;
import android.os.Build;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.mentions.MentionableEntry;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3H6  reason: invalid class name */
public class AnonymousClass3H6 implements AnonymousClass5QT {
    public final /* synthetic */ C42821yj A00;

    public AnonymousClass3H6(C42821yj r1) {
        this.A00 = r1;
    }

    public void AXt(C34151jm r10, Integer num, int i2) {
        int i3;
        C42821yj r2 = this.A00;
        if (!C14530pL.A0K(r2).A0M.A0B()) {
            Activity activity = (Activity) r2.A22;
            int i4 = Build.VERSION.SDK_INT;
            if (i4 < 30) {
                i3 = R.string.str1247;
            } else {
                i3 = R.string.str124b;
                if (i4 < 33) {
                    i3 = R.string.str124a;
                }
            }
            RequestPermissionActivity.A0L(activity, R.string.str1249, i3, 812);
        } else if (r2.A1Q.A0V((UserJid) C16010sH.A03(r2.A2l))) {
            AnonymousClass29T.A01((Activity) r2.A22, 106);
        } else {
            r2.A3T.A04(false);
            C47572Jn r0 = r2.A2v;
            if (r0 != null && !r0.isShowing()) {
                r2.A37.A04(false);
            }
            C16760tb r3 = C14530pL.A0K(r2).A03;
            C15830rv r4 = r2.A33;
            AnonymousClass00B.A06(r4);
            r3.A0G(r4, r2.A2C.A0D, r10, num, r2.A4Y);
            if (r2.A3k.A00 && num != null && 7 == num.intValue() && 1 == r2.A22.getResources().getConfiguration().orientation) {
                MentionableEntry mentionableEntry = r2.A37;
                if (mentionableEntry != null) {
                    mentionableEntry.selectAll();
                }
                C47572Jn r1 = r2.A2v;
                if (r1 != null) {
                    r1.A08(r1.A0K);
                }
            }
        }
    }
}
