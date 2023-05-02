package X;

import android.content.Intent;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: X.3MI  reason: invalid class name */
public class AnonymousClass3MI extends ClickableSpan {
    public final Intent A00;

    public AnonymousClass3MI(Intent intent) {
        this.A00 = intent;
    }

    public void onClick(View view) {
        StringBuilder A0r = AnonymousClass000.A0r("activity-intent-span/go intent=");
        Intent intent = this.A00;
        A0r.append(intent);
        C13680ns.A1V(A0r);
        view.getContext().startActivity(intent);
    }
}
