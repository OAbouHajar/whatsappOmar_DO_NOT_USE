package X;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.5ev  reason: invalid class name and case insensitive filesystem */
public class C110845ev extends AnonymousClass01X {
    public String A00 = "WhatsappPay";
    public final List A01 = AnonymousClass000.A0u();

    public int A0C() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r9, int i2) {
        String str;
        String str2;
        String A0e;
        String A0e2;
        C111005fB r92 = (C111005fB) r9;
        C117405sw r3 = (C117405sw) this.A01.get(i2);
        r92.A02.setChecked(r3.A00);
        C119505ya r7 = r3.A03;
        if (r7.A09) {
            r92.A01.setVisibility(0);
        }
        Integer num = r7.A00;
        if (num != null) {
            r92.A05.setImageResource(num.intValue());
            r92.A00.setVisibility(0);
        }
        AnonymousClass16G r6 = r3.A02;
        if (r6 != null) {
            String str3 = r7.A06;
            str = r7.A05;
            AnonymousClass234 A002 = r6.A00();
            if (!(A002 == null || (A0e2 = C13690nt.A0e(str3, A002.A02)) == null)) {
                str = A0e2;
            }
            String str4 = r7.A04;
            str2 = r7.A03;
            AnonymousClass234 A003 = r6.A00();
            if (!(A003 == null || (A0e = C13690nt.A0e(str4, A003.A02)) == null)) {
                str2 = A0e;
            }
        } else {
            str = r7.A05;
            str2 = r7.A03;
        }
        if (!TextUtils.isEmpty(str)) {
            r92.A04.setText(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            TextEmojiLabel textEmojiLabel = r92.A03;
            textEmojiLabel.setText(str2);
            textEmojiLabel.setVisibility(0);
        }
        C110105dW.A0s(r92.A0H, r3, r92, 21);
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        if (i2 == 0 || i2 == 1) {
            return new C111005fB(C13680ns.A0H(C110105dW.A07(viewGroup), viewGroup, R.layout.layout043e));
        }
        throw AnonymousClass000.A0V("PaymentOptionsBottomSheetAdapter/onCreateViewHolder/unhandled view type");
    }

    public int getItemViewType(int i2) {
        return ((C117405sw) this.A01.get(i2)).A01;
    }
}
