package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.components.SelectionCheckView;
import com.obwhatsapp.status.ContactStatusThumbnail;
import com.obwhatsapp.status.playback.MyStatusesActivity;

/* renamed from: X.4Ox  reason: invalid class name and case insensitive filesystem */
public class C85554Ox {
    public final View A00;
    public final View A01;
    public final View A02;
    public final ImageView A03;
    public final LinearLayout A04;
    public final ProgressBar A05;
    public final TextView A06;
    public final TextView A07;
    public final SelectionCheckView A08;
    public final ContactStatusThumbnail A09;
    public final /* synthetic */ MyStatusesActivity A0A;

    public C85554Ox(View view, MyStatusesActivity myStatusesActivity) {
        this.A0A = myStatusesActivity;
        this.A00 = view;
        ContactStatusThumbnail contactStatusThumbnail = (ContactStatusThumbnail) view.findViewById(R.id.contact_photo);
        this.A09 = contactStatusThumbnail;
        contactStatusThumbnail.setClickable(false);
        View findViewById = view.findViewById(R.id.contact_selector);
        this.A01 = findViewById;
        findViewById.setClickable(false);
        this.A06 = C13680ns.A0M(view, R.id.date_time);
        ImageView A0K = C13680ns.A0K(view, R.id.overflow_icon);
        this.A03 = A0K;
        A0K.setOnClickListener(myStatusesActivity.A0x);
        TextView A0M = C13680ns.A0M(view, R.id.views_count);
        this.A07 = A0M;
        View findViewById2 = view.findViewById(R.id.retry_button);
        this.A02 = findViewById2;
        findViewById2.setOnClickListener(myStatusesActivity.A0y);
        ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.progress);
        this.A05 = progressBar;
        C812447k.A00(progressBar, AnonymousClass00T.A00(view.getContext(), R.color.color0659));
        this.A08 = (SelectionCheckView) view.findViewById(R.id.selection_check);
        this.A04 = (LinearLayout) view.findViewById(R.id.title_container);
        AnonymousClass1UP.A06(A0M);
    }
}
