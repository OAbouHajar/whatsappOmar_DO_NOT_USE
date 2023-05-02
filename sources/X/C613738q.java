package X;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.URLSpan;
import android.widget.TextView;
import java.util.Iterator;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: X.38q  reason: invalid class name and case insensitive filesystem */
public class C613738q {
    public AnonymousClass37Z A00;
    public final AnonymousClass03L A01 = new AnonymousClass03L(32);
    public final C14870pt A02;
    public final C82734Dy A03 = new C82734Dy();
    public final C15860rz A04;
    public final C17110uY A05;

    public C613738q(C14870pt r3, C15860rz r4, C17110uY r5) {
        this.A02 = r3;
        this.A05 = r5;
        this.A04 = r4;
    }

    public void A00(TextView textView, AnonymousClass5PH r12, CharSequence charSequence, Object obj) {
        textView.setTag(obj);
        Spannable spannable = (Spannable) this.A01.A02(charSequence.toString());
        if (spannable != null) {
            URLSpan[] uRLSpanArr = (URLSpan[]) spannable.getSpans(0, spannable.length(), URLSpan.class);
            SpannableString valueOf = SpannableString.valueOf(charSequence);
            if (uRLSpanArr != null) {
                for (URLSpan uRLSpan : uRLSpanArr) {
                    valueOf.setSpan(new URLSpan(uRLSpan.getURL()), spannable.getSpanStart(uRLSpan), spannable.getSpanEnd(uRLSpan), spannable.getSpanFlags(uRLSpan));
                }
            }
            r12.Ac7(valueOf);
            return;
        }
        C82734Dy r4 = this.A03;
        LinkedBlockingDeque linkedBlockingDeque = r4.A00;
        Iterator it = linkedBlockingDeque.iterator();
        while (it.hasNext()) {
            AnonymousClass4M8 r1 = (AnonymousClass4M8) it.next();
            if (r1.A00 == textView) {
                linkedBlockingDeque.remove(r1);
            }
        }
        linkedBlockingDeque.add(new AnonymousClass4M8(textView, r12, charSequence, obj));
        if (this.A00 == null) {
            AnonymousClass37Z r0 = new AnonymousClass37Z(r4, this, this.A04.A0O());
            this.A00 = r0;
            r0.start();
        }
    }
}
