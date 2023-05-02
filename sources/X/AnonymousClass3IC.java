package X;

import android.graphics.Bitmap;
import android.util.Pair;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0;
import java.util.List;

/* renamed from: X.3IC  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3IC implements Runnable {
    public final /* synthetic */ Bitmap A00;
    public final /* synthetic */ Pair A01;
    public final /* synthetic */ C55792kN A02;
    public final /* synthetic */ AnonymousClass3SR A03;
    public final /* synthetic */ C49952Wu A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    public /* synthetic */ AnonymousClass3IC(Bitmap bitmap, Pair pair, C55792kN r3, AnonymousClass3SR r4, C49952Wu r5, String str, String str2, String str3, boolean z2) {
        this.A04 = r5;
        this.A03 = r4;
        this.A05 = str;
        this.A01 = pair;
        this.A00 = bitmap;
        this.A06 = str2;
        this.A08 = z2;
        this.A02 = r3;
        this.A07 = str3;
    }

    public final void run() {
        C49952Wu r6 = this.A04;
        AnonymousClass3SR r7 = this.A03;
        String str = this.A05;
        Pair pair = this.A01;
        Bitmap bitmap = this.A00;
        String str2 = this.A06;
        boolean z2 = this.A08;
        C55792kN r5 = this.A02;
        String str3 = this.A07;
        String str4 = (String) pair.first;
        int A0D = AnonymousClass000.A0D(pair.second);
        C55782kM r8 = r6.A09;
        C62203Ch r3 = (z2 || !r8.A08) ? new C62203Ch(r5, r6, z2) : null;
        r7.A01.setText(str);
        TextView textView = r7.A02;
        textView.setText(str4);
        if (A0D != 0) {
            C13680ns.A0v(textView.getContext(), textView, A0D);
        }
        r7.A03.A0I((List) null, str2);
        int i2 = 8;
        if (str4 != null) {
            i2 = 0;
        }
        textView.setVisibility(i2);
        r7.A00.setImageBitmap(bitmap);
        if (r3 != null) {
            r7.A0H.setOnClickListener(r3);
        }
        TypedValue typedValue = new TypedValue();
        View view = r7.A0H;
        C13700nu.A04(view).resolveAttribute(16843534, typedValue, true);
        view.setBackgroundResource(typedValue.resourceId);
        view.setContentDescription(str3);
        if (r7 instanceof C78123xD) {
            C78123xD r72 = (C78123xD) r7;
            ImageView imageView = r72.A00;
            C16740tZ A002 = r8.A02.A00(r5.A00);
            AnonymousClass027 A0O = C13690nt.A0O();
            r8.A04.A07(imageView, A002, new AnonymousClass52Z(imageView, A0O, r8));
            C13680ns.A1N(r6.A00, A0O, r72, 128);
            imageView.setOnClickListener(new ViewOnClickCListenerShape0S0200000_I0(r5, 22, r6));
        }
    }
}
