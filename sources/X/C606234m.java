package X;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.redex.ViewOnClickCListenerShape2S0201000_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.settings.chat.wallpaper.downloadable.picker.DownloadableWallpaperPreviewActivity;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.34m  reason: invalid class name and case insensitive filesystem */
public class C606234m extends AnonymousClass3TF {
    public final C15830rv A00;
    public final C24461Ga A01;
    public final C83924Io A02;
    public final C16320sq A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final Map A07 = AnonymousClass000.A0x();
    public final boolean A08;

    public C606234m(Context context, Resources resources, C15830rv r4, C24461Ga r5, C83924Io r6, C16320sq r7, List list, List list2, List list3, boolean z2) {
        super(context, resources);
        this.A03 = r7;
        this.A01 = r5;
        this.A02 = r6;
        this.A04 = list;
        this.A06 = list2;
        this.A05 = list3;
        this.A00 = r4;
        this.A08 = z2;
    }

    public int A01() {
        int size = this.A04.size();
        List list = this.A06;
        return list != null ? size + list.size() : size;
    }

    public void A0D(ViewGroup viewGroup, Object obj, int i2) {
        viewGroup.removeView((View) obj);
        C13680ns.A1T((C16690tT) this.A07.remove(Integer.valueOf(i2)));
    }

    public boolean A0E(View view, Object obj) {
        return AnonymousClass000.A1Y(view, obj);
    }

    public Pair A0F(int i2) {
        Context context;
        int i3;
        int i4;
        if (i2 == 0) {
            context = this.A00;
            i3 = R.string.str0c18;
        } else {
            int A012 = A01() - 1;
            context = this.A00;
            i3 = R.string.str0c19;
            if (i2 < A012) {
                i3 = R.string.str1b5d;
            }
        }
        String string = context.getString(i3);
        if (this.A00 == null) {
            boolean A09 = C434920f.A09(context);
            i4 = R.string.str1b66;
            if (A09) {
                i4 = R.string.str1b65;
            }
        } else {
            boolean z2 = this.A08;
            i4 = R.string.str1b69;
            if (z2) {
                i4 = R.string.str1b6a;
            }
        }
        return Pair.create(string, context.getString(i4));
    }

    public void A0G(C605834i r11, int i2) {
        r11.setDownloadClickListener(new ViewOnClickCListenerShape2S0201000_I1(this, i2, r11, 5));
        List list = this.A04;
        if (i2 < list.size()) {
            A0H(r11, i2);
            return;
        }
        int size = i2 - list.size();
        int A0D = AnonymousClass000.A0D(this.A06.get(size));
        int A0D2 = AnonymousClass000.A0D(this.A05.get(size));
        C609836w r3 = new C609836w(r11.getContext(), r11.A00, r11.A06, r11.A04, A0D, A0D2);
        r11.A02.setVisibility(8);
        DownloadableWallpaperPreviewActivity downloadableWallpaperPreviewActivity = this.A02.A01;
        Set set = downloadableWallpaperPreviewActivity.A08;
        Integer valueOf = Integer.valueOf(i2);
        set.add(valueOf);
        if (downloadableWallpaperPreviewActivity.A01.getCurrentItem() == i2) {
            downloadableWallpaperPreviewActivity.A00.setEnabled(true);
        }
        C13680ns.A1T((C16690tT) this.A07.put(valueOf, r3));
        C13680ns.A1U(r3, this.A03);
    }

    public final void A0H(C605834i r6, int i2) {
        r6.A02.setVisibility(0);
        r6.A03.setVisibility(0);
        r6.A01.setVisibility(8);
        C609236q r2 = new C609236q(r6.getContext(), (Uri) this.A04.get(i2), this.A01, new C612738g(r6, this, i2));
        C13680ns.A1T((C16690tT) this.A07.put(Integer.valueOf(i2), r2));
        C13680ns.A1U(r2, this.A03);
    }
}
