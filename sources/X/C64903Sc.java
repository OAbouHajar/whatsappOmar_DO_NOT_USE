package X;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.3Sc  reason: invalid class name and case insensitive filesystem */
public class C64903Sc extends C005602k {
    public final View A00;
    public final View A01;
    public final CheckBox A02;
    public final ImageView A03;
    public final ImageView A04;
    public final ImageView A05;
    public final TextView A06;
    public final TextView A07;

    public C64903Sc(View view) {
        super(view);
        this.A07 = C13680ns.A0M(view, R.id.title_tv);
        this.A06 = C13680ns.A0M(view, R.id.subtitle_tv);
        this.A01 = view.findViewById(R.id.primary_action_btn);
        this.A03 = C13680ns.A0K(view, R.id.primary_action_icon);
        this.A04 = C13680ns.A0K(view, R.id.secondary_action_btn);
        this.A05 = C13680ns.A0K(view, R.id.third_action_btn);
        this.A02 = (CheckBox) view.findViewById(R.id.cbx);
        this.A00 = view;
    }
}
