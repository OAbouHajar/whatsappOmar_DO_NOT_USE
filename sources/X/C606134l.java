package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.View;
import com.obwhatsapp.R;
import com.obwhatsapp.settings.chat.wallpaper.SolidColorWallpaperPreview;
import java.util.Map;

/* renamed from: X.34l  reason: invalid class name and case insensitive filesystem */
public class C606134l extends AnonymousClass3TF {
    public boolean A00 = false;
    public final Map A01 = AnonymousClass000.A0x();
    public final /* synthetic */ SolidColorWallpaperPreview A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C606134l(Context context, SolidColorWallpaperPreview solidColorWallpaperPreview) {
        super(context, (Resources) null);
        this.A02 = solidColorWallpaperPreview;
    }

    public int A01() {
        return this.A02.A0D.length;
    }

    public int A02(Object obj) {
        if (obj instanceof C605834i) {
            Object tag = ((View) obj).getTag();
            if (tag instanceof Integer) {
                Map map = this.A01;
                return (!map.containsKey(tag) || Boolean.valueOf(this.A00).equals(map.get(tag))) ? -1 : -2;
            }
        }
    }

    public boolean A0E(View view, Object obj) {
        return AnonymousClass000.A1Y(view, obj);
    }

    public Pair A0F(int i2) {
        int i3;
        SolidColorWallpaperPreview solidColorWallpaperPreview = this.A02;
        if (i2 == 0) {
            i3 = R.string.str1b57;
        } else {
            int length = solidColorWallpaperPreview.A0D.length - 1;
            i3 = R.string.str1b58;
            if (i2 < length) {
                i3 = R.string.str1b46;
            }
        }
        return Pair.create(solidColorWallpaperPreview.getString(i3), solidColorWallpaperPreview.A36());
    }

    public void A0G(C605834i r4, int i2) {
        r4.setBackgroundColor(this.A02.A0D[i2]);
        if (this.A00) {
            Context context = r4.getContext();
            r4.A05.setImageDrawable(AnonymousClass2SR.A06(C13690nt.A0C(context, R.drawable.whatsapp_doodle), context.getResources().getIntArray(R.array.array0020)[i2]));
        } else {
            r4.A05.setImageDrawable((Drawable) null);
        }
        Map map = this.A01;
        Integer valueOf = Integer.valueOf(i2);
        map.put(valueOf, Boolean.valueOf(this.A00));
        r4.setTag(valueOf);
    }
}
