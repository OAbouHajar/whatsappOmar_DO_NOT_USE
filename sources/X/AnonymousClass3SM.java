package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.obwhatsapp.R;

/* renamed from: X.3SM  reason: invalid class name */
public class AnonymousClass3SM extends C005602k {
    public final View A00;
    public final View A01;
    public final ImageView A02;

    public AnonymousClass3SM(Context context, ViewGroup viewGroup) {
        super(C13680ns.A0H(LayoutInflater.from(context), viewGroup, R.layout.layout0582));
        View view = this.A0H;
        this.A02 = C13680ns.A0K(view, R.id.icon);
        this.A00 = view.findViewById(R.id.badge);
        this.A01 = view.findViewById(R.id.sel_marker);
    }
}
