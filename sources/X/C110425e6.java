package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.5e6  reason: invalid class name and case insensitive filesystem */
public class C110425e6 extends LinearLayout implements AnonymousClass006 {
    public ImageView A00;
    public TextView A01;
    public C18300wT A02;
    public C52662eE A03;
    public boolean A04;

    public C110425e6(Context context) {
        super(context);
        if (!this.A04) {
            this.A04 = true;
            this.A02 = C110115dX.A0O(C52652eD.A00(generatedComponent()));
        }
        View inflate = C13680ns.A0G(this).inflate(R.layout.layout0450, this, true);
        this.A00 = C13680ns.A0K(inflate, R.id.bank_logo);
        this.A01 = C13680ns.A0M(inflate, R.id.contact_bank_details);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A03;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A03 = r0;
        }
        return r0.generatedComponent();
    }

    public final void setBankContactDetails(C30671cl r8, String str, String str2) {
        TextView textView;
        boolean isEmpty = TextUtils.isEmpty(str2);
        Context context = getContext();
        if (!isEmpty) {
            Object[] objArr = new Object[3];
            objArr[0] = r8.A0B;
            objArr[1] = str2;
            String A0d = C13680ns.A0d(context, str, objArr, 2, R.string.str18c2);
            SpannableString spannableString = new SpannableString(A0d);
            C110105dW.A0p(spannableString, AnonymousClass000.A0h(str2, AnonymousClass000.A0r("tel:")), A0d, str2);
            textView = this.A01;
            textView.setText(spannableString);
        } else {
            Object[] objArr2 = new Object[2];
            objArr2[0] = r8.A0B;
            String A0d2 = C13680ns.A0d(context, str, objArr2, 1, R.string.str18c3);
            textView = this.A01;
            textView.setText(A0d2);
        }
        Bitmap A05 = r8.A05();
        if (A05 != null) {
            ImageView imageView = this.A00;
            imageView.setImageBitmap(A05);
            imageView.setVisibility(0);
        }
        textView.setVisibility(0);
    }

    public void setContactInformation(C30671cl r4, String str, String str2, String str3) {
        String string = this.A02.A01().getString("payments_support_phone_number", (String) null);
        if (!TextUtils.isEmpty(string) && AnonymousClass1W1.A09(str2)) {
            setWhatsAppContactDetails(string, str2);
        } else if (r4 != null && AnonymousClass1W1.A09(str3)) {
            setBankContactDetails(r4, str3, str);
        } else if (!TextUtils.isEmpty(string)) {
            setWhatsAppContactDetails(string, (String) null);
        } else {
            setVisibility(8);
        }
    }

    public final void setWhatsAppContactDetails(String str, String str2) {
        int i2;
        Object[] objArr;
        boolean A09 = AnonymousClass1W1.A09(str2);
        Context context = getContext();
        if (A09) {
            i2 = R.string.str18c3;
            objArr = C13690nt.A1Z();
            objArr[0] = str;
            objArr[1] = str2;
        } else {
            i2 = R.string.str18c4;
            objArr = new Object[]{str};
        }
        String string = context.getString(i2, objArr);
        SpannableString spannableString = new SpannableString(string);
        C110105dW.A0p(spannableString, AnonymousClass000.A0h(str, AnonymousClass000.A0r("tel:")), string, str);
        TextView textView = this.A01;
        textView.setText(spannableString);
        textView.setVisibility(0);
    }
}
