package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.callhistory.CallsHistoryFragment;
import com.obwhatsapp.components.SelectionCheckView;
import com.obwhatsapp.ui.voip.MultiContactThumbnail;
import com.obwhatsapp.yo.yo;
import com.obwhatsapp.youbasha.others;

/* renamed from: X.2zJ  reason: invalid class name and case insensitive filesystem */
public class C59892zJ extends AnonymousClass4QA {
    public final View A00;
    public final ImageView A01;
    public final ImageView A02;
    public final ImageView A03;
    public final ImageView A04;
    public final TextView A05;
    public final TextView A06;
    public final C30521cU A07;
    public final CallsHistoryFragment A08;
    public final C204310c A09;
    public final SelectionCheckView A0A;
    public final C16000sG A0B;
    public final AnonymousClass2Ao A0C;
    public final MultiContactThumbnail A0D;

    public C59892zJ(View view, CallsHistoryFragment callsHistoryFragment, C204310c r16, C16000sG r17, C16080sP r18, AnonymousClass2Ao r19, AnonymousClass013 r20, C25781Lc r21) {
        ImageView A0J = C13680ns.A0J(view, R.id.contact_photo);
        this.A02 = A0J;
        C30521cU r7 = new C30521cU(view, r18, r20, r21, (int) R.id.contact_name);
        this.A07 = r7;
        others.hContactName(r7.A02);
        TextView A0L = C13680ns.A0L(view, R.id.date_time);
        this.A06 = A0L;
        yo.ChangeSize(A0L, 2);
        ImageView A0J2 = C13680ns.A0J(view, R.id.call_type_icon);
        this.A01 = A0J2;
        TextView A0L2 = C13680ns.A0L(view, R.id.count);
        this.A05 = A0L2;
        yo.ChangeSize(A0L2, 2);
        this.A04 = C13680ns.A0J(view, R.id.voice_call);
        this.A03 = C13680ns.A0J(view, R.id.video_call);
        SelectionCheckView selectionCheckView = (SelectionCheckView) C004601z.A0E(view, R.id.selection_check);
        this.A0A = selectionCheckView;
        this.A00 = C004601z.A0E(view, R.id.call_row_container);
        MultiContactThumbnail multiContactThumbnail = (MultiContactThumbnail) C004601z.A0E(view, R.id.multi_contact_photo);
        this.A0D = multiContactThumbnail;
        C004601z.A0d(multiContactThumbnail, 2);
        r7.A05();
        this.A09 = r16;
        this.A0B = r17;
        this.A0C = r19;
        this.A08 = callsHistoryFragment;
        A0J.setVisibility(0);
        C13690nt.A14(multiContactThumbnail, A0L, A0L2, 8);
        A0J2.setVisibility(8);
        selectionCheckView.setVisibility(8);
    }

    public void A00(int i2) {
        C16010sH A0A2 = this.A0B.A0A(((C101054wd) this.A00).A00);
        AnonymousClass2Ao r0 = this.A0C;
        ImageView imageView = this.A02;
        r0.A06(imageView, A0A2);
        CallsHistoryFragment callsHistoryFragment = this.A08;
        C34331k5.A05(imageView, callsHistoryFragment, this.A00, this, 4);
        imageView.setOnLongClickListener((View.OnLongClickListener) null);
        C30521cU r2 = this.A07;
        r2.A0D(A0A2, callsHistoryFragment.A0f);
        r2.A02.setSingleLine(true);
        C13680ns.A1B(this.A04, this, A0A2, 23);
        C13680ns.A1B(this.A03, this, A0A2, 22);
    }
}
