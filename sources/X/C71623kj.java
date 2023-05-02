package X;

import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.WaButton;
import com.obwhatsapp.WaTextView;
import com.whatsapp.jid.UserJid;

/* renamed from: X.3kj  reason: invalid class name and case insensitive filesystem */
public class C71623kj extends C65123Sy {
    public final View A00;
    public final C19980zJ A01;
    public final WaButton A02;
    public final WaTextView A03;
    public final WaTextView A04;
    public final C32201fo A05;
    public final C32171fl A06;

    public C71623kj(View view, C19980zJ r4, C32201fo r5, C32171fl r6, UserJid userJid) {
        super(view);
        this.A01 = r4;
        this.A06 = r6;
        this.A05 = r5;
        this.A00 = C004601z.A0E(view, R.id.collection_divider);
        WaButton waButton = (WaButton) C004601z.A0E(view, R.id.button_collection_see_all);
        this.A02 = waButton;
        this.A04 = C13680ns.A0S(view, R.id.textview_collection_title);
        this.A03 = C13680ns.A0S(view, R.id.textview_collection_subtitle);
        C13680ns.A1B(waButton, this, userJid, 11);
    }
}
