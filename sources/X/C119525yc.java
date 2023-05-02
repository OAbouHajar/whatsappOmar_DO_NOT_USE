package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.obwhatsapp.payments.ui.IndiaUpiEditTransactionDescriptionFragment;

/* renamed from: X.5yc  reason: invalid class name and case insensitive filesystem */
public class C119525yc implements TextWatcher {
    public final /* synthetic */ IndiaUpiEditTransactionDescriptionFragment A00;

    public C119525yc(IndiaUpiEditTransactionDescriptionFragment indiaUpiEditTransactionDescriptionFragment) {
        this.A00 = indiaUpiEditTransactionDescriptionFragment;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r1.matches("^[a-zA-Z0-9\\s]*$") == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onTextChanged(java.lang.CharSequence r7, int r8, int r9, int r10) {
        /*
            r6 = this;
            java.lang.String r1 = r7.toString()
            com.obwhatsapp.payments.ui.IndiaUpiEditTransactionDescriptionFragment r5 = r6.A00
            java.lang.String r0 = r5.A0A
            boolean r0 = r0.equals(r1)
            r4 = 1
            r3 = r0 ^ 1
            if (r1 == 0) goto L_0x001a
            java.lang.String r0 = "^[a-zA-Z0-9\\s]*$"
            boolean r0 = r1.matches(r0)
            r2 = 1
            if (r0 != 0) goto L_0x001b
        L_0x001a:
            r2 = 0
        L_0x001b:
            com.obwhatsapp.WaTextView r1 = r5.A02
            r0 = 0
            if (r2 == 0) goto L_0x0021
            r0 = 4
        L_0x0021:
            r1.setVisibility(r0)
            if (r2 != 0) goto L_0x002e
            com.obwhatsapp.WaTextView r1 = r5.A02
            r0 = 2131890005(0x7f120f55, float:1.941469E38)
            r1.setText(r0)
        L_0x002e:
            com.obwhatsapp.components.Button r0 = r5.A03
            if (r3 == 0) goto L_0x0038
            if (r2 == 0) goto L_0x0038
        L_0x0034:
            r0.setEnabled(r4)
            return
        L_0x0038:
            r4 = 0
            goto L_0x0034
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C119525yc.onTextChanged(java.lang.CharSequence, int, int, int):void");
    }
}
