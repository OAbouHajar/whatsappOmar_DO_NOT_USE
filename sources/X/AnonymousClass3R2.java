package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.facebook.redex.ViewOnClickCListenerShape2S0101000_I1;
import com.obwhatsapp.settings.chat.wallpaper.SolidColorWallpaper;

/* renamed from: X.3R2  reason: invalid class name */
public class AnonymousClass3R2 extends AnonymousClass01X {
    public final Context A00;
    public final int[] A01;
    public final /* synthetic */ SolidColorWallpaper A02;

    public AnonymousClass3R2(Context context, SolidColorWallpaper solidColorWallpaper, int[] iArr) {
        this.A02 = solidColorWallpaper;
        this.A00 = context;
        this.A01 = iArr;
    }

    public int A0C() {
        return this.A01.length;
    }

    public long A0D(int i2) {
        return (long) this.A01[i2];
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r4, int i2) {
        C64793Rr r42 = (C64793Rr) r4;
        AnonymousClass3R2 r1 = r42.A00;
        int i3 = r1.A01[i2];
        View view = r42.A0H;
        view.setBackgroundColor(i3);
        C13680ns.A0t(r1.A02, view, SolidColorWallpaper.A04[i2]);
        view.setOnClickListener(new ViewOnClickCListenerShape2S0101000_I1(r42, i2, 3));
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        AnonymousClass3Ol r2 = new AnonymousClass3Ol(this.A00);
        r2.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
        return new C64793Rr(r2, this);
    }
}
