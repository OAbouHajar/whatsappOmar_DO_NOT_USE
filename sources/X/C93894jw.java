package X;

import android.view.MenuItem;
import com.obwhatsapp.gallery.GalleryTabHostFragment;

/* renamed from: X.4jw  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C93894jw implements MenuItem.OnMenuItemClickListener {
    public final /* synthetic */ C84364Kg A00;
    public final /* synthetic */ GalleryTabHostFragment A01;

    public /* synthetic */ C93894jw(C84364Kg r1, GalleryTabHostFragment galleryTabHostFragment) {
        this.A01 = galleryTabHostFragment;
        this.A00 = r1;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        GalleryTabHostFragment galleryTabHostFragment = this.A01;
        C84364Kg r0 = this.A00;
        C18450wi.A0H(galleryTabHostFragment, 0);
        galleryTabHostFragment.startActivityForResult(r0.A00, 91);
        return false;
    }
}
