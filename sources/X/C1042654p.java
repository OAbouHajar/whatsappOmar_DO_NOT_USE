package X;

import android.text.Spannable;
import com.obwhatsapp.CodeInputField;

/* renamed from: X.54p  reason: invalid class name and case insensitive filesystem */
public class C1042654p implements CharSequence, Spannable {
    public long[] A00;
    public final Spannable A01;
    public final C14890pv A02;

    public C1042654p(C14890pv r2, CharSequence charSequence) {
        this.A02 = r2;
        this.A01 = (Spannable) charSequence;
        A00(charSequence);
    }

    public void A00(CharSequence charSequence) {
        long[] jArr;
        int i2;
        this.A00 = new long[charSequence.length()];
        int i3 = 0;
        int i4 = -1;
        while (true) {
            jArr = this.A00;
            if (i3 >= jArr.length) {
                break;
            }
            char charAt = charSequence.charAt(i3);
            CodeInputField codeInputField = this.A02.A04;
            if (charAt == codeInputField.A01 || charSequence.charAt(i3) == 160) {
                this.A00[i3] = -1;
            } else {
                long[] jArr2 = this.A00;
                jArr2[i3] = System.currentTimeMillis();
                int i5 = i3 + 1;
                if (i5 < jArr2.length) {
                    if (charSequence.charAt(i5) == 160) {
                        i5++;
                    }
                    if (i5 < this.A00.length && charSequence.charAt(i5) == codeInputField.A01) {
                        i4 = i3;
                    }
                }
            }
            i3++;
        }
        if (i4 != -1 && (((i2 = this.A02.A00) != -1 && i2 < i4) || (i4 == 0 && i2 == -1))) {
            jArr[i4] = -1;
        }
        this.A02.A00 = i4;
    }

    public char charAt(int i2) {
        long[] jArr = this.A00;
        if (i2 < jArr.length && jArr[i2] == -1) {
            jArr[i2] = System.currentTimeMillis() + 1500;
        }
        char charAt = this.A01.charAt(i2);
        long[] jArr2 = this.A00;
        if (i2 >= jArr2.length || System.currentTimeMillis() >= jArr2[i2]) {
            CodeInputField codeInputField = this.A02.A04;
            if (!(charAt == codeInputField.A01 || charAt == 160)) {
                return codeInputField.A00;
            }
        }
        return charAt;
    }

    public int getSpanEnd(Object obj) {
        return this.A01.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.A01.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.A01.getSpanStart(obj);
    }

    public Object[] getSpans(int i2, int i3, Class cls) {
        return this.A01.getSpans(i2, i3, cls);
    }

    public int length() {
        return this.A01.length();
    }

    public int nextSpanTransition(int i2, int i3, Class cls) {
        return this.A01.nextSpanTransition(i2, i3, cls);
    }

    public void removeSpan(Object obj) {
        this.A01.removeSpan(obj);
    }

    public void setSpan(Object obj, int i2, int i3, int i4) {
        this.A01.setSpan(obj, i2, i3, i4);
    }

    public CharSequence subSequence(int i2, int i3) {
        return this.A01.subSequence(i2, i3);
    }
}
