package X;

import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.obwhatsapp.StickyHeadersRecyclerView;
import com.obwhatsapp.gallery.MediaGalleryFragmentBase;
import java.text.Format;
import java.util.Date;

/* renamed from: X.2ht  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C54632ht implements C54642hu {
    public final /* synthetic */ TextView A00;
    public final /* synthetic */ MediaGalleryFragmentBase A01;
    public final /* synthetic */ AnonymousClass01D A02;

    public /* synthetic */ C54632ht(TextView textView, MediaGalleryFragmentBase mediaGalleryFragmentBase, AnonymousClass01D r3) {
        this.A01 = mediaGalleryFragmentBase;
        this.A00 = textView;
        this.A02 = r3;
    }

    public final void AhP() {
        int i2;
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.A01;
        TextView textView = this.A00;
        AnonymousClass01D r2 = this.A02;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) mediaGalleryFragmentBase.A08.getLayoutManager();
        if (linearLayoutManager != null && mediaGalleryFragmentBase.A0H != null) {
            int A19 = linearLayoutManager.A19();
            StickyHeadersRecyclerView stickyHeadersRecyclerView = mediaGalleryFragmentBase.A08;
            while (true) {
                long A0E = ((AnonymousClass3R4) stickyHeadersRecyclerView.A0N).A0E(A19);
                if (StickyHeadersRecyclerView.A09(A0E)) {
                    if (A19 >= stickyHeadersRecyclerView.A0N.A0C() - 1) {
                        i2 = stickyHeadersRecyclerView.A0N.A0C() - ((C54622hr) ((AnonymousClass3R4) stickyHeadersRecyclerView.A0N).A00).ACY();
                        break;
                    }
                    A19++;
                } else {
                    i2 = (int) (A0E & 4294967295L);
                    break;
                }
            }
            AnonymousClass2BF ADR = mediaGalleryFragmentBase.A0H.ADR(i2);
            if (ADR != null) {
                textView.setText(((Format) r2.get()).format(new Date(ADR.ABe())));
            }
        }
    }
}
