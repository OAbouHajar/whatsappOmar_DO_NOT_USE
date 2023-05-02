package X;

import android.os.Process;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.facebook.redex.RunnableRunnableShape1S0600000_I1;
import java.util.List;

/* renamed from: X.37Z  reason: invalid class name */
public final class AnonymousClass37Z extends AnonymousClass1ZS {
    public final C82734Dy A00;
    public final String A01;
    public volatile boolean A02;
    public final /* synthetic */ C613738q A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass37Z(C82734Dy r2, C613738q r3, String str) {
        super("LinkifierThread");
        this.A03 = r3;
        this.A00 = r2;
        this.A01 = str;
    }

    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                if (!this.A02) {
                    AnonymousClass4M8 r0 = (AnonymousClass4M8) this.A00.A00.takeLast();
                    if (r0 != null) {
                        CharSequence charSequence = r0.A02;
                        TextView textView = r0.A00;
                        Object obj = r0.A03;
                        AnonymousClass5PH r4 = r0.A01;
                        if (obj.equals(textView.getTag())) {
                            SpannableStringBuilder A0F = C13690nt.A0F(charSequence);
                            C613738q r7 = this.A03;
                            r7.A05.A09(A0F, this.A01);
                            List A05 = C45922Bq.A05(A0F);
                            if (A05 != null && !A05.isEmpty()) {
                                r7.A01.A06(charSequence.toString(), C13690nt.A0F(A0F));
                                if (obj.equals(textView.getTag())) {
                                    r7.A02.A0K(new RunnableRunnableShape1S0600000_I1(r4, obj, A0F, r7, this, textView, 3));
                                }
                            }
                        }
                    }
                } else {
                    return;
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }
}
