package X;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;

/* renamed from: X.3S1  reason: invalid class name */
public class AnonymousClass3S1 extends C005602k {
    public final Button A00;
    public final WaTextView A01;

    public AnonymousClass3S1(View view, C19980zJ r13, C14870pt r14, AnonymousClass38Y r15, AnonymousClass01V r16, C17220uj r17) {
        super(view);
        Context context = view.getContext();
        C45922Bq.A08(context, r17.A05("download-and-installation", "about-linked-devices"), r13, r14, C13680ns.A0Q(view, R.id.linked_devices_description_text), r16, C13680ns.A0d(context, "learn-more", C13680ns.A1b(), 0, R.string.str0c4c));
        Button button = (Button) C004601z.A0E(view, R.id.link_device_button);
        this.A00 = button;
        C13680ns.A17(button, r15, 7);
        WaTextView A0S = C13680ns.A0S(view, R.id.link_device_with_phone_number_button);
        this.A01 = A0S;
        C13680ns.A17(A0S, r15, 8);
    }
}
