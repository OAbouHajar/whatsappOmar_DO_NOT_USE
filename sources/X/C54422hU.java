package X;

import android.view.MenuItem;
import android.view.SubMenu;
import com.obwhatsapp.gallery.GalleryTabHostFragment;

/* renamed from: X.2hU  reason: invalid class name and case insensitive filesystem */
public final class C54422hU extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ SubMenu $overflowSubMenu;
    public final /* synthetic */ GalleryTabHostFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54422hU(SubMenu subMenu, GalleryTabHostFragment galleryTabHostFragment) {
        super(1);
        this.$overflowSubMenu = subMenu;
        this.this$0 = galleryTabHostFragment;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        Iterable<C84364Kg> iterable = (Iterable) obj;
        C18450wi.A0H(iterable, 0);
        SubMenu subMenu = this.$overflowSubMenu;
        GalleryTabHostFragment galleryTabHostFragment = this.this$0;
        for (C84364Kg r2 : iterable) {
            MenuItem add = subMenu.add(r2.A02);
            C18450wi.A0B(add);
            add.setIcon(r2.A01);
            add.setOnMenuItemClickListener(new C93894jw(r2, galleryTabHostFragment));
        }
        return AnonymousClass22M.A00;
    }
}
