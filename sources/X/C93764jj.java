package X;

import android.text.InputFilter;
import android.text.Spanned;
import com.obwhatsapp.R;
import com.obwhatsapp.textstatuscomposer.TextStatusComposerActivity;

/* renamed from: X.4jj  reason: invalid class name and case insensitive filesystem */
public class C93764jj implements InputFilter {
    public final /* synthetic */ C41661wL A00;

    public C93764jj(C41661wL r1) {
        this.A00 = r1;
    }

    public CharSequence filter(CharSequence charSequence, int i2, int i3, Spanned spanned, int i4, int i5) {
        Spanned spanned2 = spanned;
        boolean z2 = false;
        int i6 = i4;
        int i7 = i5;
        int A02 = C47622Js.A02(spanned2, 0, spanned2.length()) - C47622Js.A02(spanned2, i6, i7);
        int A022 = C47622Js.A02(charSequence, i2, i3) + A02;
        C41661wL r7 = this.A00;
        int A002 = (C41661wL.A00(spanned2, 0, spanned2.length()) - C41661wL.A00(spanned2, i6, i7)) + 1;
        int A003 = C41661wL.A00(charSequence, i2, i3) + A002;
        StringBuilder A0r = AnonymousClass000.A0r(spanned2.toString());
        A0r.replace(i6, i7, AnonymousClass3K4.A0Y(charSequence, i2, i3));
        String A01 = C30931dC.A01(A0r.toString());
        int A023 = C47622Js.A02(A0r, 0, A0r.length());
        int A004 = C41661wL.A00(A0r.toString(), 0, A0r.length()) + 1;
        int i8 = 5;
        int i9 = 350;
        boolean z3 = (A01 == null || r7.A06.getVisibility() == 0 || (A023 <= 350 && A004 <= 5)) ? false : true;
        r7.A05 = z3;
        if (A01 != null && !A01.equals(r7.A03) && !z3) {
            z2 = true;
        }
        r7.A0J.A01 = z2;
        if (!z2) {
            i9 = 700;
            i8 = 10;
        }
        int i10 = i9 - A02;
        int i11 = i8 - A002;
        if (A022 <= i9 && A003 <= i8) {
            return null;
        }
        if (A02 < i9 && A002 < i8) {
            TextStatusComposerActivity textStatusComposerActivity = r7.A0K.A00;
            Object[] A1Z = C13690nt.A1Z();
            AnonymousClass000.A1K(A1Z, i9);
            AnonymousClass000.A1L(A1Z, i8);
            textStatusComposerActivity.Afh(textStatusComposerActivity.getString(R.string.str1690, A1Z));
            return C47622Js.A04(charSequence, i2, i3, i11, i10);
        } else if (i3 - i2 <= 0) {
            return "";
        } else {
            TextStatusComposerActivity textStatusComposerActivity2 = r7.A0K.A00;
            Object[] A1Z2 = C13690nt.A1Z();
            AnonymousClass000.A1K(A1Z2, i9);
            AnonymousClass000.A1L(A1Z2, i8);
            textStatusComposerActivity2.Afh(textStatusComposerActivity2.getString(R.string.str1690, A1Z2));
            return "";
        }
    }
}
