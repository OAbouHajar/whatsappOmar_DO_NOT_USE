package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
import com.obwhatsapp.WaEditText;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.3CT  reason: invalid class name */
public final class AnonymousClass3CT implements TextWatcher {
    public int A00 = -1;
    public int A01 = -1;
    public String A02 = "";
    public boolean A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final WaEditText A07;
    public final WaEditText A08;
    public final WaEditText A09;
    public final AnonymousClass5QD A0A;
    public final C615639k A0B;
    public final ArrayList A0C;

    public AnonymousClass3CT(WaEditText waEditText, WaEditText waEditText2, WaEditText waEditText3, AnonymousClass5QD r5, C615639k r6, ArrayList arrayList, int i2, int i3, int i4) {
        this.A0B = r6;
        this.A0A = r5;
        this.A0C = arrayList;
        this.A09 = waEditText;
        this.A07 = waEditText2;
        this.A08 = waEditText3;
        this.A05 = i2;
        this.A06 = i3;
        this.A04 = i4;
    }

    public void afterTextChanged(Editable editable) {
        int i2;
        if (!TextUtils.isEmpty(this.A02)) {
            WaEditText waEditText = this.A07;
            waEditText.removeTextChangedListener(this);
            waEditText.setText("");
            waEditText.addTextChangedListener(this);
        }
        if (!TextUtils.isEmpty(editable) || this.A00 != 0) {
            int i3 = this.A00;
            WaEditText waEditText2 = this.A07;
            if (i3 == 1) {
                waEditText2.removeTextChangedListener(this);
                char charAt = editable.charAt(this.A01);
                if (this.A04 != 1 ? Character.isDigit(charAt) : Character.isLetterOrDigit(charAt)) {
                    int i4 = this.A01;
                    waEditText2.setText(editable.subSequence(i4, i4 + 1));
                    WaEditText waEditText3 = this.A08;
                    if (waEditText3 != null && !TextUtils.isEmpty(waEditText2.getText())) {
                        waEditText3.requestFocus();
                    }
                } else {
                    waEditText2.setText("");
                }
                waEditText2.addTextChangedListener(this);
            } else {
                waEditText2.removeTextChangedListener(this);
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    i2 = this.A06;
                    if (i5 >= i2 || i6 >= editable.length()) {
                        waEditText2.addTextChangedListener(this);
                        int i7 = this.A00;
                    } else {
                        char charAt2 = editable.charAt(i6);
                        if (!(this.A04 != 1 ? Character.isDigit(charAt2) : Character.isLetterOrDigit(charAt2))) {
                            i5--;
                        } else {
                            ((TextView) this.A0C.get(i5)).setText(i6 < this.A00 ? Character.toString(editable.charAt(i6)) : "");
                        }
                        i5++;
                        i6++;
                    }
                }
                waEditText2.addTextChangedListener(this);
                int i72 = this.A00;
                if (i72 < i2) {
                    AnonymousClass000.A0N(this.A0C, i72).requestFocus();
                }
                if (this.A05 != this.A0C.size() - 1) {
                    return;
                }
            }
            String A002 = this.A0B.A00();
            if (A002.length() == this.A0C.size()) {
                AnonymousClass5QD r1 = this.A0A;
                if (r1 == null) {
                    Log.e("CodeInputBoxManager/CodeInputBoxTextWatcher/afterTextChanged/invalid callback");
                    return;
                }
                Log.i("CodeInputBoxManager/CodeInputBoxTextWatcher/afterTextChanged trigger callback");
                r1.AOm(A002);
            }
        } else if (this.A07.hasFocus() && this.A03) {
            WaEditText waEditText4 = this.A09;
            AnonymousClass00B.A04(waEditText4);
            waEditText4.setText("");
            waEditText4.requestFocus();
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        boolean z2 = false;
        if (!TextUtils.isEmpty(this.A07.getText())) {
            this.A02 = charSequence.toString();
        } else if (this.A09 != null) {
            z2 = true;
        }
        this.A03 = z2;
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        this.A00 = i4;
        this.A01 = i2;
    }
}
