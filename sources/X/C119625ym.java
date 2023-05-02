package X;

import android.view.View;
import com.obwhatsapp.payments.ui.PaymentBottomSheet;

/* renamed from: X.5ym  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C119625ym implements View.OnClickListener {
    public final /* synthetic */ C28401Vy A00;
    public final /* synthetic */ C53322fW A01;
    public final /* synthetic */ AnonymousClass622 A02;
    public final /* synthetic */ PaymentBottomSheet A03;

    public /* synthetic */ C119625ym(C28401Vy r1, C53322fW r2, AnonymousClass622 r3, PaymentBottomSheet paymentBottomSheet) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = paymentBottomSheet;
    }

    public final void onClick(View view) {
        AnonymousClass622 r2 = this.A02;
        C28401Vy r1 = this.A00;
        C53322fW r0 = this.A01;
        PaymentBottomSheet paymentBottomSheet = this.A03;
        C112825ja r3 = r2.A03;
        r3.A43(C112825ja.A02(r1, r0, r3), "payment_confirm_prompt", 1);
        paymentBottomSheet.A1N();
    }
}
