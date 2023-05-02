package X;

import android.content.res.Resources;
import com.obwhatsapp.R;
import com.obwhatsapp.gallery.GalleryRecentsFragment;
import com.obwhatsapp.gallery.GalleryTabHostFragment;
import java.util.Collection;

/* renamed from: X.2hK  reason: invalid class name and case insensitive filesystem */
public final class C54372hK extends AnonymousClass011 implements C50452Zp {
    public final int A00;
    public final Resources A01;
    public final C29251aI A02;
    public final GalleryTabHostFragment A03;
    public final C15220qW A04 = new AnonymousClass1DV(new AnonymousClass5ER(this));
    public final C15220qW A05 = new AnonymousClass1DV(new AnonymousClass5ES(this));

    public C54372hK(Resources resources, AnonymousClass02C r4, C29251aI r5, GalleryTabHostFragment galleryTabHostFragment, int i2) {
        super(r4, 0);
        this.A03 = galleryTabHostFragment;
        this.A01 = resources;
        this.A00 = i2;
        this.A02 = r5;
    }

    public int A01() {
        return 2;
    }

    public CharSequence A04(int i2) {
        Resources resources;
        int i3;
        if (i2 == 0) {
            resources = this.A01;
            i3 = R.string.str0937;
        } else if (i2 == 1) {
            resources = this.A01;
            i3 = R.string.str0936;
        } else {
            throw new IllegalArgumentException(C18450wi.A06("Invalid item position: ", Integer.valueOf(i2)));
        }
        String string = resources.getString(i3);
        C18450wi.A0B(string);
        return string;
    }

    public AnonymousClass01A A0G(int i2) {
        C15220qW r0;
        if (i2 == 0) {
            r0 = this.A05;
        } else if (i2 == 1) {
            r0 = this.A04;
        } else {
            throw new IllegalArgumentException(C18450wi.A06("Invalid item position: ", Integer.valueOf(i2)));
        }
        return (AnonymousClass01A) r0.getValue();
    }

    public void AFr(AnonymousClass29Q r2, Collection collection) {
        ((GalleryRecentsFragment) this.A05.getValue()).AFr(r2, collection);
    }

    public void AbZ() {
        ((GalleryRecentsFragment) this.A05.getValue()).AbZ();
    }

    public void Aeb(AnonymousClass29Q r2, Collection collection, Collection collection2) {
        ((GalleryRecentsFragment) this.A05.getValue()).Aeb(r2, collection, collection2);
    }
}
