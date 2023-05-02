package X;

import android.content.Context;
import com.obwhatsapp.R;
import java.util.List;

/* renamed from: X.34S  reason: invalid class name */
public class AnonymousClass34S extends AnonymousClass34T {
    public boolean A00;

    public AnonymousClass34S(Context context, C85934Qo r3, C25781Lc r4) {
        super(context, r3, r4);
        A00();
        setId(R.id.gif_row);
    }

    public /* bridge */ /* synthetic */ void A05(C16740tZ r2, List list) {
        C16730tY r22 = (C16730tY) r2;
        super.A05(r22, list);
        this.A00.setMessage(r22);
    }

    public String getDefaultMessageText() {
        return getContext().getString(R.string.str05dc);
    }

    public int getDrawableRes() {
        return R.drawable.msg_status_gif;
    }

    public int getIconSizeIncrease() {
        return C13680ns.A0D(this).getDimensionPixelSize(R.dimen.dimen06ad);
    }
}
