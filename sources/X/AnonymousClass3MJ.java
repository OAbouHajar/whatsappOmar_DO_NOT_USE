package X;

import android.text.style.ClickableSpan;
import android.view.View;
import com.obwhatsapp.support.faq.FaqItemActivity;

/* renamed from: X.3MJ  reason: invalid class name */
public class AnonymousClass3MJ extends ClickableSpan {
    public final /* synthetic */ FaqItemActivity A00;
    public final /* synthetic */ Runnable A01;

    public AnonymousClass3MJ(FaqItemActivity faqItemActivity, Runnable runnable) {
        this.A00 = faqItemActivity;
        this.A01 = runnable;
    }

    public void onClick(View view) {
        this.A01.run();
    }
}
