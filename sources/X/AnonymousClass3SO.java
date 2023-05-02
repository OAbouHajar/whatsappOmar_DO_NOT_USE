package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;

/* renamed from: X.3SO  reason: invalid class name */
public class AnonymousClass3SO extends C005602k {
    public final WaImageView A00;
    public final WaTextView A01;
    public final WaTextView A02;
    public final /* synthetic */ AnonymousClass3R0 A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3SO(View view, AnonymousClass3R0 r3) {
        super(view);
        this.A03 = r3;
        this.A02 = C13680ns.A0S(view, R.id.compliance_text_title_info);
        this.A01 = C13680ns.A0S(view, R.id.compliance_text_title);
        this.A00 = C13690nt.A0R(view, R.id.compliance_call_action_btn);
    }
}
