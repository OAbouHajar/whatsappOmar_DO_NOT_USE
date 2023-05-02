package X;

import android.graphics.Typeface;
import android.widget.TextView;

/* renamed from: X.08l  reason: invalid class name and case insensitive filesystem */
public class C018008l implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Typeface A01;
    public final /* synthetic */ TextView A02;
    public final /* synthetic */ AnonymousClass08R A03;

    public C018008l(Typeface typeface, TextView textView, AnonymousClass08R r3, int i2) {
        this.A03 = r3;
        this.A02 = textView;
        this.A01 = typeface;
        this.A00 = i2;
    }

    public void run() {
        TextView textView = this.A02;
        Typeface typeface = this.A01;
        int i2 = this.A00;
    }
}
