package X;

import android.content.DialogInterface;
import com.obwhatsapp.calling.calllink.view.CallLinkActivity;
import com.obwhatsapp.calling.calllink.viewmodel.CallLinkViewModel;

/* renamed from: X.3oK  reason: invalid class name and case insensitive filesystem */
public class C73543oK extends C52302dW {
    public final /* synthetic */ CallLinkActivity A00;

    public C73543oK(CallLinkActivity callLinkActivity) {
        this.A00 = callLinkActivity;
    }

    public void A00() {
        CallLinkViewModel callLinkViewModel = this.A00.A06;
        callLinkViewModel.A05(callLinkViewModel.A06());
    }

    public void A01(DialogInterface dialogInterface) {
        this.A00.finish();
    }
}
