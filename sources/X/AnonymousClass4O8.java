package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.callhistory.CallLogActivity;

/* renamed from: X.4O8  reason: invalid class name */
public class AnonymousClass4O8 {
    public final ImageView A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final /* synthetic */ CallLogActivity A06;

    public AnonymousClass4O8(View view, CallLogActivity callLogActivity) {
        this.A06 = callLogActivity;
        this.A00 = C13680ns.A0K(view, R.id.call_type_icon);
        this.A04 = C13680ns.A0M(view, R.id.call_type);
        this.A02 = C13680ns.A0M(view, R.id.call_date);
        this.A03 = C13680ns.A0M(view, R.id.call_duration);
        this.A01 = C13680ns.A0M(view, R.id.call_data);
        this.A05 = C13680ns.A0L(view, R.id.caller_info);
    }
}
