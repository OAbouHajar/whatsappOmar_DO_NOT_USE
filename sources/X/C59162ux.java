package X;

import android.app.Activity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.widget.TextView;
import com.facebook.redex.IDxCSpanShape14S0100000_2_I1;
import com.facebook.redex.ViewOnClickCListenerShape5S0200000_I1;
import com.obwhatsapp.R;
import java.text.DateFormat;
import java.util.Date;

/* renamed from: X.2ux  reason: invalid class name and case insensitive filesystem */
public class C59162ux extends AnonymousClass2S7 {
    public final /* synthetic */ C19980zJ A00;
    public final /* synthetic */ C18900xR A01;
    public final /* synthetic */ C18890xQ A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59162ux(Activity activity, C19980zJ r8, C18900xR r9, C18890xQ r10, AnonymousClass01V r11, C16440t3 r12, AnonymousClass013 r13) {
        super(activity, r11, r12, r13, R.layout.layout0565);
        this.A01 = r9;
        this.A00 = r8;
        this.A02 = r10;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DateFormat dateInstance = DateFormat.getDateInstance(2, C13690nt.A0m(this.A04));
        Activity activity = this.A01;
        ((TextView) findViewById(R.id.software_too_old)).setText(AnonymousClass1ZW.A00(activity, new Object[]{activity.getString(R.string.str1cf7), dateInstance.format(this.A01.A01())}, R.string.str1661));
        SpannableString valueOf = SpannableString.valueOf(AnonymousClass1ZW.A00(activity, new Object[]{dateInstance.format(new Date()), activity.getString(R.string.str1cf7)}, R.string.str165f));
        URLSpan[] uRLSpanArr = (URLSpan[]) valueOf.getSpans(0, valueOf.length(), URLSpan.class);
        if (uRLSpanArr != null) {
            for (URLSpan uRLSpan : uRLSpanArr) {
                if ("date-settings".equals(uRLSpan.getURL())) {
                    int spanStart = valueOf.getSpanStart(uRLSpan);
                    int spanEnd = valueOf.getSpanEnd(uRLSpan);
                    int spanFlags = valueOf.getSpanFlags(uRLSpan);
                    valueOf.removeSpan(uRLSpan);
                    valueOf.setSpan(new IDxCSpanShape14S0100000_2_I1(this, 0), spanStart, spanEnd, spanFlags);
                }
            }
        }
        TextView textView = (TextView) findViewById(R.id.current_date);
        textView.setText(valueOf);
        textView.setMovementMethod(new LinkMovementMethod());
        ViewOnClickCListenerShape5S0200000_I1 viewOnClickCListenerShape5S0200000_I1 = new ViewOnClickCListenerShape5S0200000_I1((Object) this, 1, (Object) this.A02);
        findViewById(R.id.download).setOnClickListener(viewOnClickCListenerShape5S0200000_I1);
        findViewById(R.id.update_whatsapp).setOnClickListener(viewOnClickCListenerShape5S0200000_I1);
    }
}
