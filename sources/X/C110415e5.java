package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.5e5  reason: invalid class name and case insensitive filesystem */
public class C110415e5 extends LinearLayout implements AnonymousClass006 {
    public TextView A00;
    public C15900s5 A01;
    public C52662eE A02;
    public boolean A03;

    public C110415e5(Context context) {
        super(context);
        if (!this.A03) {
            this.A03 = true;
            this.A01 = (C15900s5) C52652eD.A00(generatedComponent()).ALm.get();
        }
        this.A00 = C13680ns.A0M(C13680ns.A0G(this).inflate(R.layout.layout0450, this, true), R.id.contact_bank_details);
    }

    public final Object generatedComponent() {
        C52662eE r0 = this.A02;
        if (r0 == null) {
            r0 = C52662eE.A00(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void setContactInformation(String str) {
        String A032 = this.A01.A03(C15910s6.A2C);
        if (TextUtils.isEmpty(A032) || !AnonymousClass1W1.A09(str)) {
            if (!TextUtils.isEmpty(A032)) {
                str = null;
            } else {
                setVisibility(8);
                return;
            }
        }
        setWhatsAppContactDetails(A032, str);
    }

    public final void setWhatsAppContactDetails(String str, String str2) {
        int i2;
        Object[] objArr;
        boolean A09 = AnonymousClass1W1.A09(str2);
        Context context = getContext();
        if (A09) {
            i2 = R.string.str0594;
            objArr = C13690nt.A1Z();
            objArr[0] = str;
            objArr[1] = str2;
        } else {
            i2 = R.string.str0595;
            objArr = new Object[]{str};
        }
        String string = context.getString(i2, objArr);
        SpannableString spannableString = new SpannableString(string);
        C110105dW.A0p(spannableString, AnonymousClass000.A0h(str, AnonymousClass000.A0r("tel:")), string, str);
        TextView textView = this.A00;
        textView.setText(spannableString);
        textView.setVisibility(0);
    }
}
