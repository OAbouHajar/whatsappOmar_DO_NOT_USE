package X;

import android.text.TextUtils;
import android.view.MenuItem;
import androidx.viewpager.widget.ViewPager;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.gallery.MediaGalleryActivity;

/* renamed from: X.3EU  reason: invalid class name */
public class AnonymousClass3EU implements AnonymousClass2FZ {
    public String A00 = "";
    public boolean A01 = true;
    public final /* synthetic */ ViewPager A02;
    public final /* synthetic */ MediaGalleryActivity A03;

    public AnonymousClass3EU(ViewPager viewPager, MediaGalleryActivity mediaGalleryActivity) {
        this.A03 = mediaGalleryActivity;
        this.A02 = viewPager;
    }

    public void AYi(C47812Kr r1) {
    }

    public void AYj(C47812Kr r7) {
        this.A02.setCurrentItem(r7.A00);
        MediaGalleryActivity mediaGalleryActivity = this.A03;
        int i2 = r7.A00;
        mediaGalleryActivity.A00 = i2;
        if (i2 != mediaGalleryActivity.A02) {
            RequestPermissionActivity.A0X(mediaGalleryActivity, mediaGalleryActivity.A0J);
        }
        int i3 = mediaGalleryActivity.A00;
        int i4 = mediaGalleryActivity.A03;
        MenuItem menuItem = mediaGalleryActivity.A04;
        if (i3 == i4) {
            if (menuItem != null) {
                if (menuItem.isActionViewExpanded()) {
                    this.A00 = mediaGalleryActivity.A0p;
                    mediaGalleryActivity.A04.collapseActionView();
                }
                mediaGalleryActivity.A04.setVisible(false);
            }
            this.A01 = true;
            return;
        }
        if (menuItem != null) {
            menuItem.setVisible(true);
            if (!TextUtils.isEmpty(mediaGalleryActivity.A0p) || TextUtils.isEmpty(this.A00) || !this.A01) {
                AnonymousClass2DW A022 = MediaGalleryActivity.A02(mediaGalleryActivity);
                if (A022 != null) {
                    C42391xi r1 = mediaGalleryActivity.A0M;
                    r1.A04(mediaGalleryActivity.A0p);
                    r1.A05(mediaGalleryActivity.A0q);
                    A022.AWn(r1);
                }
            } else {
                mediaGalleryActivity.A0p = this.A00;
                mediaGalleryActivity.A04.expandActionView();
                C13680ns.A0M(mediaGalleryActivity.A04.getActionView(), R.id.search_src_text).setText(mediaGalleryActivity.A0p);
            }
        }
        this.A01 = false;
    }
}
