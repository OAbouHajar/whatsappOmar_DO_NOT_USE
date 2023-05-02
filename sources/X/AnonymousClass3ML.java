package X;

import android.content.Intent;
import android.net.Uri;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.inappbugreporting.InAppBugReportingActivity;

/* renamed from: X.3ML  reason: invalid class name */
public final class AnonymousClass3ML extends ClickableSpan {
    public final /* synthetic */ InAppBugReportingActivity A00;
    public final /* synthetic */ String A01;

    public AnonymousClass3ML(InAppBugReportingActivity inAppBugReportingActivity, String str) {
        this.A00 = inAppBugReportingActivity;
        this.A01 = str;
    }

    public void onClick(View view) {
        Intent A02 = C13700nu.A02("android.intent.action.VIEW");
        A02.setData(Uri.parse(this.A01));
        this.A00.startActivity(A02);
    }

    public void updateDrawState(TextPaint textPaint) {
        C18450wi.A0H(textPaint, 0);
        super.updateDrawState(textPaint);
        C13690nt.A0r(this.A00, textPaint, R.color.color08e2);
        textPaint.setUnderlineText(false);
    }
}
