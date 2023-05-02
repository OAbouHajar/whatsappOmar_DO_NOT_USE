package X;

import android.text.Editable;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import android.text.style.CharacterStyle;
import android.text.style.RelativeSizeSpan;
import com.obwhatsapp.CodeInputField;
import com.obwhatsapp.R;

/* renamed from: X.3CR  reason: invalid class name */
public final class AnonymousClass3CR implements TextWatcher {
    public String A00 = "";
    public boolean A01;
    public boolean A02;
    public final AnonymousClass5RL A03;
    public final AnonymousClass5OV A04;
    public final CodeInputField A05;

    public AnonymousClass3CR(AnonymousClass5RL r2, AnonymousClass5OV r3, CodeInputField codeInputField) {
        this.A03 = r2;
        this.A05 = codeInputField;
        this.A04 = r3;
    }

    public void afterTextChanged(Editable editable) {
        int length;
        String obj;
        int length2;
        SpannableStringBuilder spannableStringBuilder;
        AnonymousClass3MQ r1;
        int i2;
        CodeInputField codeInputField = this.A05;
        int selectionStart = codeInputField.getSelectionStart();
        Editable editable2 = editable;
        String replace = editable2.toString().replace(Character.toString(codeInputField.A01), "");
        if (!replace.isEmpty() && replace.charAt(0) != 160) {
            codeInputField.A05 = false;
        }
        int i3 = codeInputField.A02 >> 1;
        int length3 = replace.length();
        if (length3 > 0 && this.A00.startsWith(replace.substring(0, 1)) && this.A00.indexOf(160) >= 0 && replace.indexOf(160) < 0 && selectionStart == i3) {
            StringBuilder A0o = AnonymousClass000.A0o();
            A0o.append(replace.substring(0, i3 - 1));
            replace = AnonymousClass000.A0h(replace.substring(i3), A0o);
            selectionStart--;
        } else if (length3 > selectionStart && replace.indexOf(160) == selectionStart && selectionStart == i3 + 1) {
            selectionStart++;
        }
        String replace2 = replace.replace(Character.toString(160), "");
        int length4 = replace2.length();
        if (length4 > i3) {
            length4++;
        }
        while (true) {
            length = replace2.length();
            if (length >= i3) {
                break;
            }
            StringBuilder A0q = AnonymousClass000.A0q(replace2);
            A0q.append(codeInputField.A01);
            replace2 = A0q.toString();
        }
        StringBuilder A0o2 = AnonymousClass000.A0o();
        A0o2.append(replace2.substring(0, i3));
        A0o2.append(160);
        A0o2.append(replace2.substring(i3, Math.min(codeInputField.A02, length)));
        while (true) {
            obj = A0o2.toString();
            length2 = obj.length();
            if (length2 >= codeInputField.A02 + 1) {
                break;
            }
            A0o2 = AnonymousClass000.A0q(obj);
            A0o2.append(codeInputField.A01);
        }
        if (codeInputField.A05) {
            spannableStringBuilder = C13690nt.A0F(obj);
            for (int i4 = 0; i4 < spannableStringBuilder.length(); i4++) {
                if (spannableStringBuilder.charAt(i4) == codeInputField.A01) {
                    i2 = i4 + 1;
                    spannableStringBuilder.setSpan(new RelativeSizeSpan(0.9f), i4, i2, 33);
                    r1 = new AnonymousClass3MQ(codeInputField.getContext(), AnonymousClass00T.A00(codeInputField.getContext(), R.color.color014f));
                } else if (spannableStringBuilder.charAt(i4) != 160) {
                    r1 = new AnonymousClass3MQ(codeInputField.getContext(), AnonymousClass00T.A00(codeInputField.getContext(), R.color.color0151));
                    i2 = i4 + 1;
                }
                spannableStringBuilder.setSpan(r1, i4, i2, 33);
            }
        } else {
            spannableStringBuilder = this.A04.AGB(obj);
        }
        if (spannableStringBuilder.length() > 0) {
            InputFilter[] filters = editable2.getFilters();
            codeInputField.removeTextChangedListener(this);
            editable2.setFilters(new InputFilter[0]);
            Class<CharacterStyle> cls = CharacterStyle.class;
            for (Object removeSpan : editable2.getSpans(0, editable2.length(), cls)) {
                editable2.removeSpan(removeSpan);
            }
            editable2.replace(0, editable2.length(), spannableStringBuilder.toString());
            for (Object obj2 : spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), cls)) {
                editable2.setSpan(obj2, spannableStringBuilder.getSpanStart(obj2), spannableStringBuilder.getSpanEnd(obj2), 18);
            }
            editable2.setFilters(filters);
            codeInputField.addTextChangedListener(this);
        }
        codeInputField.setSelection(Math.min(selectionStart, Math.min(length4, length2)));
        if (!this.A01) {
            AnonymousClass5RL r3 = this.A03;
            String replaceAll = obj.toString().replaceAll("[^0-9]", "");
            if (replaceAll.length() != codeInputField.A02) {
                this.A02 = false;
                r3.AU2(replaceAll);
            } else if (!this.A02) {
                this.A02 = true;
                r3.AOm(replaceAll);
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        if (charSequence != null) {
            this.A00 = charSequence.toString();
        }
    }

    public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
    }
}
