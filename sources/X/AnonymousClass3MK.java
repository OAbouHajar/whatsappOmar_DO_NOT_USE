package X;

import android.text.style.ClickableSpan;
import android.view.View;
import com.obwhatsapp.support.faq.SearchFAQ;

/* renamed from: X.3MK  reason: invalid class name */
public class AnonymousClass3MK extends ClickableSpan {
    public final /* synthetic */ SearchFAQ A00;
    public final /* synthetic */ Runnable A01;

    public AnonymousClass3MK(SearchFAQ searchFAQ, Runnable runnable) {
        this.A00 = searchFAQ;
        this.A01 = runnable;
    }

    public void onClick(View view) {
        this.A01.run();
    }
}
