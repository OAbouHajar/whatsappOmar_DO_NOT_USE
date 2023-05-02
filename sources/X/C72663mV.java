package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageButton;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;

/* renamed from: X.3mV  reason: invalid class name and case insensitive filesystem */
public abstract class C72663mV extends C72823ml {
    public WaImageButton A00;
    public WaImageView A01;
    public WaTextView A02;
    public WaTextView A03;

    public C72663mV(View view) {
        super(view);
        this.A01 = C13690nt.A0R(view, R.id.icon);
        this.A03 = C13680ns.A0S(view, R.id.title);
        this.A02 = C13680ns.A0S(view, R.id.subtitle);
        this.A00 = (WaImageButton) C004601z.A0E(view, R.id.action_button);
    }
}
