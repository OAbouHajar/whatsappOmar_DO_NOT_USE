package X;

import android.graphics.drawable.Drawable;
import android.os.Build;
import com.facebook.redex.IDxCListenerShape53S0200000_2_I1;
import com.obwhatsapp.gallery.MediaGalleryFragmentBase;
import com.whatsapp.util.ViewOnClickCListenerShape1S0300000_I1;

/* renamed from: X.3Rj  reason: invalid class name and case insensitive filesystem */
public class C64713Rj extends C005602k {
    public final C54502hd A00;

    public C64713Rj(MediaGalleryFragmentBase mediaGalleryFragmentBase, C54502hd r4) {
        super(r4);
        this.A00 = r4;
        if (Build.VERSION.SDK_INT >= 21) {
            r4.setSelector((Drawable) null);
        }
        r4.setOnClickListener(new ViewOnClickCListenerShape1S0300000_I1(this, mediaGalleryFragmentBase, r4, 14));
        r4.setOnLongClickListener(new IDxCListenerShape53S0200000_2_I1(r4, 7, mediaGalleryFragmentBase));
    }
}
