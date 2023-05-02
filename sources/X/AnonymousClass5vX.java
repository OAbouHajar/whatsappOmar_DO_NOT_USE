package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.obwhatsapp.payments.IDxRCallbackShape93S0100000_3_I0;
import com.obwhatsapp.payments.ui.widget.PaymentMethodRow;
import com.whatsapp.util.Log;

/* renamed from: X.5vX  reason: invalid class name */
public class AnonymousClass5vX {
    public final C14870pt A00;
    public final C16040sK A01;
    public final C18260wP A02;
    public final C16440t3 A03;
    public final C16980tz A04;
    public final C18340wX A05;
    public final C18310wU A06;
    public final C18290wS A07;
    public final C113015lE A08;

    public AnonymousClass5vX(C14870pt r1, C16040sK r2, C18260wP r3, C16440t3 r4, C16980tz r5, C18340wX r6, C18310wU r7, C18290wS r8, C113015lE r9) {
        this.A04 = r5;
        this.A03 = r4;
        this.A00 = r1;
        this.A01 = r2;
        this.A07 = r8;
        this.A08 = r9;
        this.A06 = r7;
        this.A02 = r3;
        this.A05 = r6;
    }

    public final void A00(Drawable drawable, ImageView imageView, C30671cl r9, boolean z2) {
        C39891tE r1 = (C39891tE) r9.A08;
        ImageView imageView2 = imageView;
        if (r1 == null || TextUtils.isEmpty(r1.A0E)) {
            StringBuilder A0r = AnonymousClass000.A0r("PAY: Failed to display card art, card art url missing, re-fetch: ");
            A0r.append(z2);
            Log.w(A0r.toString());
            if (z2) {
                A01(imageView, r9);
                return;
            }
            return;
        }
        C113015lE r0 = this.A08;
        String str = r1.A0E;
        r0.A04.A00(drawable, drawable, imageView2, new C1205362a(imageView, r9, this, z2), str);
    }

    public final void A01(ImageView imageView, C30671cl r18) {
        C30671cl r3 = r18;
        C111815hS r2 = (C111815hS) r3.A08;
        if (r2 == null || TextUtils.isEmpty(r2.A0C)) {
            Log.w(AnonymousClass000.A0g("PAY: fetchCardArtImageContentDetails card method data invalid: ", r2));
            return;
        }
        C16440t3 r10 = this.A03;
        Context context = this.A04.A00;
        C14870pt r8 = this.A00;
        C16040sK r9 = this.A01;
        C18310wU r12 = this.A06;
        C117625tI r6 = new C117625tI(context, r8, r9, r10, this.A05, r12, new C118265uP(imageView, r3, r2, this), r3.A0A, r2.A0C);
        String str = r6.A07;
        if (!TextUtils.isEmpty(str)) {
            String str2 = r6.A08;
            if (!TextUtils.isEmpty(str2)) {
                String A0g = C110105dW.A0g(r6.A02, r6.A03);
                C18310wU r82 = r6.A05;
                C35081lL[] r22 = new C35081lL[4];
                C35081lL.A02("action", "get-image-content", r22, 0);
                C35081lL.A02("credential-id", str, r22, 1);
                C35081lL.A02("image-content-id", str2, r22, 2);
                C35081lL.A02("nonce", A0g, r22, 3);
                r82.A0H(new IDxRCallbackShape93S0100000_3_I0(r6.A00, r6.A04, r6.A01, r6, 0), new C28371Vv("account", r22), "get", AnonymousClass1NO.A0L);
                return;
            }
        }
        r6.A06.A00(C110115dX.A0N(), str);
    }

    public void A02(C30671cl r4, PaymentMethodRow paymentMethodRow) {
        C119405xi.A08(r4, paymentMethodRow);
        A00(C16980tz.A00(this.A04).getDrawable(C119405xi.A00((C35391lr) r4)), paymentMethodRow.A01, r4, false);
    }
}
