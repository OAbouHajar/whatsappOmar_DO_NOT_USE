package X;

import android.content.Context;
import android.net.Uri;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.facebook.redex.RunnableRunnableShape1S1300000_I1;

/* renamed from: X.2uk  reason: invalid class name and case insensitive filesystem */
public class C59142uk extends AnonymousClass3MG {
    public int A00 = 4;
    public int A01 = 0;
    public AnonymousClass5OY A02;
    public Runnable A03;
    public boolean A04;
    public boolean A05;
    public final C17100uX A06;
    public final C14870pt A07;
    public final AnonymousClass01V A08;
    public final String A09;

    public C59142uk(Context context, C17100uX r3, C14870pt r4, AnonymousClass01V r5, String str) {
        super(context);
        this.A07 = r4;
        this.A08 = r5;
        this.A06 = r3;
        this.A09 = str;
    }

    public C59142uk(Context context, C17100uX r3, C14870pt r4, AnonymousClass01V r5, String str, int i2) {
        super(context, 17170444);
        this.A07 = r4;
        this.A08 = r5;
        this.A06 = r3;
        this.A09 = str;
    }

    public void AYv(MotionEvent motionEvent, View view) {
        super.AYv(motionEvent, view);
        if (this.A04) {
            Uri parse = Uri.parse(this.A09);
            String scheme = parse.getScheme();
            if ("http".equals(scheme) || "https".equals(scheme) || "rtsp".equals(scheme) || "ftp".equals(scheme) || "tel".equals(scheme) || "wapay".equals(scheme) || "upi".equals(scheme)) {
                Runnable runnable = this.A03;
                if (runnable == null) {
                    runnable = new RunnableRunnableShape1S1300000_I1(1, scheme, this, parse, view);
                    this.A03 = runnable;
                }
                this.A07.A0L(runnable, (long) ViewConfiguration.getLongPressTimeout());
                return;
            }
            return;
        }
        Runnable runnable2 = this.A03;
        if (runnable2 != null) {
            this.A07.A0J(runnable2);
        }
    }

    public void onClick(View view) {
        int i2 = this.A00;
        if (i2 == 2 || i2 == 3) {
            this.A06.Acv(view.getContext(), Uri.parse(this.A09), this.A01, this.A00);
        } else {
            boolean z2 = this.A04;
            C17100uX r3 = this.A06;
            Context context = view.getContext();
            Uri parse = Uri.parse(this.A09);
            if (z2) {
                r3.Acu(context, parse, this.A01);
            } else {
                r3.Act(context, parse);
            }
        }
        AnonymousClass5OY r0 = this.A02;
        if (r0 != null) {
            r0.A6H();
        }
    }

    public void updateDrawState(TextPaint textPaint) {
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(this.A05);
    }
}
