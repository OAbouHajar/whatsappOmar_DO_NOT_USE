package X;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import com.obwhatsapp.IDxTSpanShape54S0100000_2_I1;
import com.obwhatsapp.text.ReadMoreTextView;

/* renamed from: X.3Ht  reason: invalid class name and case insensitive filesystem */
public class C63393Ht implements Runnable {
    public int A00 = 0;
    public int A01;
    public int A02 = 0;
    public int A03;
    public final /* synthetic */ ReadMoreTextView A04;

    public C63393Ht(ReadMoreTextView readMoreTextView) {
        this.A04 = readMoreTextView;
    }

    public void run() {
        ReadMoreTextView readMoreTextView = this.A04;
        if (readMoreTextView.A00 != 0 && !readMoreTextView.A0K()) {
            int A042 = C13680ns.A04(readMoreTextView);
            int A032 = C13680ns.A03(readMoreTextView);
            int i2 = readMoreTextView.getResources().getConfiguration().orientation;
            if ((this.A03 != A042 || this.A01 != A032) && readMoreTextView.getLayout() != null) {
                int i3 = this.A00;
                if (i3 == 0 || i2 != this.A02) {
                    this.A00 = A042;
                    i3 = A042;
                }
                this.A03 = A042;
                this.A01 = A032;
                this.A02 = i2;
                CharSequence charSequence = readMoreTextView.A04;
                AnonymousClass5SA r7 = ReadMoreTextView.A0B;
                Layout A7P = r7.A7P(readMoreTextView, AnonymousClass1ZW.A02(charSequence), i3);
                boolean A0g = C13700nu.A0g(A7P.getLineCount(), readMoreTextView.A00);
                readMoreTextView.A05 = A0g;
                if (A0g) {
                    CharSequence charSequence2 = readMoreTextView.A03;
                    if (charSequence2 != null) {
                        SpannableStringBuilder A0F = C13690nt.A0F(charSequence2);
                        A0F.setSpan(new IDxTSpanShape54S0100000_2_I1(readMoreTextView.getContext(), this, readMoreTextView.A01), 0, A0F.length(), 18);
                        if (readMoreTextView.A06) {
                            A0F.setSpan(new StyleSpan(1), 0, A0F.length(), 18);
                        }
                        int lineCount = A7P.getLineCount();
                        SpannableStringBuilder spannableStringBuilder = null;
                        for (int lineEnd = A7P.getLineEnd(readMoreTextView.A00 - 1); lineEnd > 0 && lineCount > readMoreTextView.A00; lineEnd--) {
                            spannableStringBuilder = C13690nt.A0F(readMoreTextView.A04.subSequence(0, lineEnd));
                            spannableStringBuilder.append("... ").append(A0F);
                            lineCount = r7.A7P(readMoreTextView, AnonymousClass1ZW.A02(spannableStringBuilder), this.A00).getLineCount();
                        }
                        if (!TextUtils.equals(readMoreTextView.getText(), spannableStringBuilder)) {
                            readMoreTextView.setVisibleText(spannableStringBuilder);
                            return;
                        }
                        return;
                    }
                    throw AnonymousClass000.A0W("You must specify an rmtvText attribute");
                } else if (!TextUtils.equals(readMoreTextView.getText(), readMoreTextView.A04)) {
                    readMoreTextView.setVisibleText(readMoreTextView.A04);
                }
            }
        }
    }
}
