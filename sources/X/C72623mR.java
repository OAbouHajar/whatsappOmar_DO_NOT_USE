package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.WaTextView;

/* renamed from: X.3mR  reason: invalid class name and case insensitive filesystem */
public class C72623mR extends C72823ml {
    public final WaTextView A00;
    public final WaTextView A01;
    public final WaTextView A02;
    public final WaTextView A03;
    public final C17180uf A04;

    public C72623mR(View view, C17180uf r3) {
        super(view);
        this.A04 = r3;
        this.A01 = C13680ns.A0S(view, R.id.error_message);
        this.A02 = C13680ns.A0S(view, R.id.retry_button);
        this.A03 = C13680ns.A0S(view, R.id.settings_btn);
        this.A00 = C13680ns.A0S(view, R.id.fallback_action_button);
    }
}
