package X;

import android.view.Menu;
import android.view.MenuItem;
import com.obwhatsapp.gallery.MediaGalleryActivity;
import java.util.Map;

/* renamed from: X.31a  reason: invalid class name and case insensitive filesystem */
public class C603431a extends AnonymousClass3DP {
    public final /* synthetic */ MediaGalleryActivity A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C603431a(C14530pL r9, C16000sG r10, C16080sP r11, AnonymousClass5PO r12, C20310zq r13, AnonymousClass013 r14, MediaGalleryActivity mediaGalleryActivity, AnonymousClass47T r16) {
        super(r9, r10, r11, r12, r13, r14, r16);
        this.A00 = mediaGalleryActivity;
    }

    public Map A04() {
        C86144Rj r0 = this.A00.A0F;
        if (r0 != null) {
            return r0.A04;
        }
        return null;
    }

    public void A05() {
        this.A00.A96();
    }

    public void A06(Menu menu) {
        MenuItem menuItem = this.A0H;
        if (menuItem != null) {
            menuItem.setVisible(false);
        }
        MenuItem menuItem2 = this.A02;
        if (menuItem2 != null) {
            menuItem2.setVisible(false);
        }
        MenuItem menuItem3 = this.A06;
        if (menuItem3 != null) {
            menuItem3.setVisible(false);
        }
        MenuItem menuItem4 = this.A01;
        if (menuItem4 != null) {
            menuItem4.setVisible(false);
        }
        MenuItem menuItem5 = this.A0B;
        if (menuItem5 != null) {
            menuItem5.setVisible(false);
        }
        MenuItem menuItem6 = this.A0E;
        if (menuItem6 != null) {
            menuItem6.setVisible(false);
        }
        MenuItem menuItem7 = this.A0C;
        if (menuItem7 != null) {
            menuItem7.setVisible(false);
        }
    }
}
