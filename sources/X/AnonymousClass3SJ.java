package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.3SJ  reason: invalid class name */
public class AnonymousClass3SJ extends C005602k {
    public View.OnClickListener A00;
    public final Context A01;
    public final TextView A02;

    public AnonymousClass3SJ(Context context, View.OnClickListener onClickListener, View view) {
        super(view);
        this.A01 = context;
        this.A00 = onClickListener;
        this.A02 = C13680ns.A0L(view, R.id.view_more);
    }
}
