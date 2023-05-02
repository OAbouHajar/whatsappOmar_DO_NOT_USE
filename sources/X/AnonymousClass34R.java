package X;

import android.content.Context;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.34R  reason: invalid class name */
public class AnonymousClass34R extends AnonymousClass34T {
    public boolean A00;

    public AnonymousClass34R(Context context, C85934Qo r2, C25781Lc r3) {
        super(context, r2, r3);
        A00();
    }

    public /* bridge */ /* synthetic */ void A05(C16740tZ r2, List list) {
        C16730tY r22 = (C16730tY) r2;
        super.A05(r22, list);
        this.A00.setMessage(r22);
    }

    public String getDefaultMessageText() {
        return getContext().getString(R.string.str05e9);
    }

    public int getDrawableRes() {
        return R.drawable.msg_status_video;
    }
}
