package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;

/* renamed from: X.307  reason: invalid class name */
public class AnonymousClass307 extends AnonymousClass308 {
    public ImageView A00;
    public TextView A01;
    public final C14870pt A02;
    public final C17090uW A03;
    public final C18890xQ A04;
    public final AnonymousClass01V A05;
    public final C15860rz A06;
    public final C14710pd A07;
    public final C16490t9 A08;

    public AnonymousClass307(ViewGroup viewGroup, C14870pt r3, C17090uW r4, C18890xQ r5, AnonymousClass1yP r6, AnonymousClass01V r7, C15860rz r8, C14710pd r9, C16490t9 r10) {
        super(viewGroup, r6, 40);
        this.A07 = r9;
        this.A04 = r5;
        this.A02 = r3;
        this.A08 = r10;
        this.A03 = r4;
        this.A05 = r7;
        this.A06 = r8;
    }

    public final void A06() {
        Context context = (Context) this.A01;
        SpannableString valueOf = SpannableString.valueOf(AnonymousClass1ZW.A01(C13680ns.A0d(context, this.A04.A00().toString(), C13680ns.A1b(), 0, R.string.str0332), new Object[0]));
        for (URLSpan uRLSpan : (URLSpan[]) valueOf.getSpans(0, valueOf.length(), URLSpan.class)) {
            int spanStart = valueOf.getSpanStart(uRLSpan);
            int spanEnd = valueOf.getSpanEnd(uRLSpan);
            valueOf.removeSpan(uRLSpan);
            C59142uk r9 = new C59142uk(context, this.A03, this.A02, this.A05, uRLSpan.getURL());
            C34331k5.A04(this.A01, this, r9, 34);
            valueOf.setSpan(r9, spanStart, spanEnd, 0);
        }
        TextView textView = this.A01;
        if (textView != null) {
            textView.setText(valueOf);
        }
    }
}
