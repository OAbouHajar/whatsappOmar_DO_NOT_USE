package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxCListenerShape178S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.gallery.DocumentsGalleryFragment;

/* renamed from: X.3Sl  reason: invalid class name and case insensitive filesystem */
public class C64993Sl extends C005602k {
    public C38631rA A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final ImageView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final TextView A09;
    public final TextView A0A;
    public final /* synthetic */ DocumentsGalleryFragment A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64993Sl(View view, DocumentsGalleryFragment documentsGalleryFragment) {
        super(view);
        this.A0B = documentsGalleryFragment;
        this.A05 = C13680ns.A0K(view, R.id.icon);
        this.A09 = C13680ns.A0M(view, R.id.title);
        this.A06 = C13680ns.A0M(view, R.id.date);
        this.A08 = C13680ns.A0M(view, R.id.size);
        this.A03 = view.findViewById(R.id.bullet_size);
        this.A07 = C13680ns.A0M(view, R.id.info);
        this.A01 = view.findViewById(R.id.bullet_info);
        this.A0A = C13680ns.A0M(view, R.id.type);
        this.A04 = view.findViewById(R.id.starred_status);
        this.A02 = view.findViewById(R.id.kept_status);
        C13680ns.A16(view, this, 16);
        view.setOnLongClickListener(new IDxCListenerShape178S0100000_2_I1(this, 7));
    }
}
