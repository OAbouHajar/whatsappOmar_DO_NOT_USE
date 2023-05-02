package X;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.EditText;
import com.obwhatsapp.R;
import com.obwhatsapp.registration.RegisterPhone;
import com.whatsapp.util.Log;

/* renamed from: X.2nm  reason: invalid class name and case insensitive filesystem */
public class C56512nm extends ClickableSpan {
    public final /* synthetic */ C56392nZ A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ String A02;

    public C56512nm(C56392nZ r1, String str, String str2) {
        this.A00 = r1;
        this.A01 = str;
        this.A02 = str2;
    }

    public void onClick(View view) {
        RegisterPhone registerPhone = this.A00.A00;
        AnonymousClass1G1 r1 = registerPhone.A03;
        String str = this.A01;
        String str2 = this.A02;
        registerPhone.A0E.A03.setText(AnonymousClass2JN.A0B(r1, str, str2).substring(str.length() + 2));
        EditText editText = registerPhone.A0E.A03;
        editText.setSelection(editText.getText().length());
        registerPhone.A37();
        registerPhone.A05.A09(R.string.str138a, 1);
        Log.i(C13680ns.A0h("register/phone/suggested/tapped ", str2));
        registerPhone.A0Z = true;
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }
}
