package X;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.RunnableRunnableShape0S0410000_I0;
import com.facebook.redex.RunnableRunnableShape1S0300000_I0_1;
import com.obwhatsapp.R;
import com.whatsapp.util.IDxATaskShape26S0200000_2_I0;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: X.12h  reason: invalid class name and case insensitive filesystem */
public class C209712h {
    public final C16180sb A00;
    public final C14870pt A01;
    public final C15860rz A02;
    public final AnonymousClass013 A03;
    public final C18250wO A04;
    public final C14710pd A05;
    public final C209312d A06;
    public final C209412e A07;
    public final C209512f A08;
    public final C209112b A09;
    public final C209612g A0A;
    public final C209012a A0B;
    public final C18270wQ A0C;
    public final C16320sq A0D;

    public C209712h(C16180sb r1, C14870pt r2, C15860rz r3, AnonymousClass013 r4, C18250wO r5, C14710pd r6, C209312d r7, C209412e r8, C209512f r9, C209112b r10, C209612g r11, C209012a r12, C18270wQ r13, C16320sq r14) {
        this.A05 = r6;
        this.A01 = r2;
        this.A0D = r14;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = r5;
        this.A0A = r11;
        this.A0C = r13;
        this.A08 = r9;
        this.A07 = r8;
        this.A06 = r7;
        this.A09 = r10;
        this.A0B = r12;
    }

    public void A00(ImageView imageView, TextView textView, C35361lo r9) {
        AnonymousClass04h.A09(textView, 4, 20, 2, 2);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        layoutParams.width = textView.getResources().getDimensionPixelSize(R.dimen.dimen066c);
        textView.setLayoutParams(layoutParams);
        C35361lo r2 = r9;
        int i2 = r9.A0C;
        textView.requestLayout();
        ImageView imageView2 = imageView;
        imageView.setBackgroundColor(r9.A0A);
        if (!TextUtils.isEmpty(r9.A01)) {
            imageView.setContentDescription(r9.A01);
        }
        A01(imageView2, r2, imageView.getLayoutParams().width, imageView.getLayoutParams().height, false);
    }

    public void A01(ImageView imageView, C35361lo r11, int i2, int i3, boolean z2) {
        C35361lo r5 = r11;
        ImageView imageView2 = imageView;
        int i4 = i2;
        int i5 = i3;
        if (r11.A02(this.A00.A0A()).exists()) {
            this.A08.A00(imageView, r11, i2, i3);
        } else if (!z2) {
            this.A02.A1R(true);
        } else if (this.A05.A0E(C16620tM.A02, 1084)) {
            this.A0C.A03(r11, this.A0A);
        } else {
            this.A0D.Ack(new IDxATaskShape26S0200000_2_I0(new C47302Ik(imageView2, r5, this, i4, i5), 3, this), new Void[0]);
        }
    }

    public void A02(C35361lo r5) {
        if (r5.A02(this.A00.A0A()).exists()) {
            return;
        }
        if (this.A05.A0E(C16620tM.A02, 1084)) {
            this.A0C.A03(r5, this.A0A);
        } else {
            this.A0D.Ack(new IDxATaskShape26S0200000_2_I0((Object) null, 3, this), new Void[0]);
        }
    }

    public final void A03(C35361lo r28, C47272Ih r29) {
        C31701et r1;
        StringBuilder sb;
        C16180sb r12 = this.A00;
        C35361lo r8 = r28;
        boolean exists = r8.A02(r12.A0A()).exists();
        String str = r8.A0G;
        File file = null;
        if (!"image/webp".equals(str)) {
            sb = new StringBuilder("PAY: PaymentBackgroundRepository/downloadPaymentBackground/unsupported mimetype=");
            sb.append(str);
        } else {
            File A022 = r8.A02(r12.A0A());
            if (!A022.exists()) {
                if (TextUtils.isEmpty(r8.A05)) {
                    sb = new StringBuilder("PAY: PaymentBackgroundRepository/downloadPaymentBackground/missing url for background id=");
                    sb.append(r8.A0F);
                } else {
                    C209312d r0 = this.A06;
                    C14710pd r9 = r0.A04;
                    C14870pt r4 = r0.A00;
                    C17130ua r6 = r0.A02;
                    C47282Ii r3 = new C47282Ii(r4, r0.A01, r6, r0.A03, r8, r9, r0.A05, r0.A06, r0.A07, A022);
                    C209212c r2 = r3.A02;
                    C47292Ij r13 = r3.A01;
                    String str2 = r3.A00.A05;
                    AnonymousClass00B.A06(str2);
                    if (r2.A0C(r13, r3, (C38241qT) null, (C16730tY) null, str2, false)) {
                        try {
                            r1 = (C31701et) r3.A03.get();
                        } catch (InterruptedException | ExecutionException e2) {
                            Log.e("DuplicatePaymentBackgroundDownloadListener/waitForResult ", e2);
                            r1 = new C31701et(1);
                        }
                    } else {
                        r3.A4Z(r3);
                        r1 = r3.A01().A00;
                    }
                    if (r1.A01 != 0) {
                        A022 = null;
                    }
                }
            }
            file = A022;
            this.A01.A0K(new RunnableRunnableShape0S0410000_I0(this, r29, r8, file, 4, exists));
        }
        Log.e(sb.toString());
        this.A01.A0K(new RunnableRunnableShape0S0410000_I0(this, r29, r8, file, 4, exists));
    }

    public final void A04(C47252If r5) {
        C18250wO r1 = this.A04;
        Log.i("PAY: PaymentBackgroundStore/getPaymentBackgroundsForPicker");
        List<C35361lo> A022 = r1.A02("SELECT payment_background.background_id, file_size, width, height, mime_type, placeholder_color, text_color, subtext_color, media_key, media_key_timestamp, file_sha256, file_enc_sha256, direct_path, fullsize_url, description, lg FROM payment_background INNER JOIN payment_background_order ON payment_background_order.background_id=payment_background.background_id ORDER BY payment_background_order.background_order ASC");
        StringBuilder sb = new StringBuilder("PAY: PaymentBackgroundStore/getPaymentBackgroundsForPicker/result size=");
        sb.append(A022.size());
        Log.i(sb.toString());
        this.A01.A0K(new RunnableRunnableShape1S0300000_I0_1(this, A022, r5, 37));
        for (C35361lo A032 : A022) {
            A03(A032, r5);
        }
    }
}
