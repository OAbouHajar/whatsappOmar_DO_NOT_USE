package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.redex.IDxPDisplayerShape298S0100000_2_I1;
import com.obwhatsapp.R;
import com.obwhatsapp.calling.callhistory.CallsHistoryFragment;
import com.obwhatsapp.ui.voip.MultiContactThumbnail;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.voipcalling.Voip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.2zK  reason: invalid class name and case insensitive filesystem */
public class C59902zK extends AnonymousClass4QA {
    public View A00;
    public ImageView A01;
    public TextView A02;
    public C16040sK A03;
    public C30521cU A04;
    public final ImageView A05;
    public final C15900s5 A06;
    public final CallsHistoryFragment A07;
    public final C204310c A08;
    public final C16000sG A09;
    public final C16080sP A0A;
    public final AnonymousClass2OY A0B = new IDxPDisplayerShape298S0100000_2_I1(this, 1);
    public final AnonymousClass2Ao A0C;
    public final AnonymousClass2Ao A0D;
    public final C17240ul A0E;
    public final C216014s A0F;
    public final MultiContactThumbnail A0G;

    public C59902zK(View view, C16040sK r8, C15900s5 r9, CallsHistoryFragment callsHistoryFragment, C204310c r11, C16000sG r12, C16080sP r13, AnonymousClass2Ao r14, AnonymousClass2Ao r15, AnonymousClass013 r16, C17240ul r17, C25781Lc r18, C216014s r19) {
        this.A06 = r9;
        this.A0F = r19;
        this.A07 = callsHistoryFragment;
        this.A08 = r11;
        this.A09 = r12;
        this.A0A = r13;
        this.A0E = r17;
        this.A00 = C004601z.A0E(view, R.id.joinable_call_log_root_view);
        this.A04 = new C30521cU(view, r13, r16, r18, (int) R.id.participant_names);
        this.A01 = C13680ns.A0J(view, R.id.call_type_icon);
        this.A0G = (MultiContactThumbnail) C004601z.A0E(view, R.id.multi_contact_photo);
        this.A05 = C13680ns.A0J(view, R.id.contact_photo);
        this.A02 = C13680ns.A0L(view, R.id.ongoing_label);
        this.A04.A05();
        this.A0C = r14;
        this.A0D = r15;
        this.A03 = r8;
    }

    public void A00(int i2) {
        String A002;
        int i3;
        C616739v r9 = ((C101064we) this.A00).A00;
        GroupJid groupJid = ((C37831po) Collections.unmodifiableList(r9.A04).get(0)).A04;
        C16000sG r7 = this.A09;
        C16010sH A022 = C30341cC.A02(r7, this.A0E, groupJid, this.A0F);
        boolean A1V = AnonymousClass000.A1V(A022);
        MultiContactThumbnail multiContactThumbnail = this.A0G;
        int i4 = 8;
        int i5 = 0;
        if (A1V) {
            i5 = 8;
        }
        multiContactThumbnail.setVisibility(i5);
        ImageView imageView = this.A05;
        if (A1V) {
            i4 = 0;
        }
        imageView.setVisibility(i4);
        List A0u = AnonymousClass000.A0u();
        if (A1V) {
            this.A0D.A06(imageView, A022);
        } else {
            A0u = CallsHistoryFragment.A01(r7, this.A0A, (C37831po) Collections.unmodifiableList(r9.A04).get(0), this.A07.A0f);
            ArrayList A0u2 = AnonymousClass000.A0u();
            for (int i6 = 0; i6 < A0u.size(); i6++) {
                C16000sG.A01(r7, A0u2, A0u, i6);
            }
            if (A0u2.size() == 0) {
                C16040sK r0 = this.A03;
                r0.A0B();
                AnonymousClass1ZT r02 = r0.A05;
                if (r02 != null) {
                    A0u2.add(r7.A08(r02));
                }
            }
            if (A0u2.size() != 0) {
                multiContactThumbnail.A00(this.A0B, this.A0C, A0u2);
            }
        }
        ArrayList arrayList = r9.A04;
        int size = ((C37831po) Collections.unmodifiableList(arrayList).get(0)).A04().size();
        View view = this.A00;
        if (size == 0) {
            A002 = view.getContext().getString(R.string.str1ae5);
        } else {
            Context context = view.getContext();
            C16080sP r1 = this.A0A;
            if (A022 == null || (A002 = r1.A0C(A022)) == null) {
                AnonymousClass2Wj A023 = C52142dD.A02(r7, r1, A0u, 3, false);
                A002 = A023 == null ? null : A023.A00(context);
            }
        }
        this.A04.A0F(this.A07.A0f, A002);
        ImageView imageView2 = this.A01;
        boolean A082 = r9.A08();
        int i7 = R.drawable.ic_action_call;
        if (A082) {
            i7 = R.drawable.ic_action_videocall;
        }
        imageView2.setImageResource(i7);
        C13680ns.A1B(view, this, r9, 24);
        boolean equals = C30341cC.A0A(((C37831po) Collections.unmodifiableList(arrayList).get(0)).A0C.A02).equals(Voip.getCurrentCallId());
        Context context2 = view.getContext();
        boolean A083 = r9.A08();
        int i8 = R.string.str1ae3;
        if (A083) {
            i8 = R.string.str1ae0;
        }
        String A0d = C13680ns.A0d(context2, A002, new Object[1], 0, i8);
        if (equals) {
            i3 = R.string.str1a9d;
        } else {
            boolean A084 = r9.A08();
            i3 = R.string.str1ae2;
            if (A084) {
                i3 = R.string.str1adf;
            }
        }
        C62043Bk.A04(view, A0d, context2.getString(i3));
        TextView textView = this.A02;
        int i9 = R.string.str1ace;
        if (equals) {
            i9 = R.string.str1acf;
        }
        textView.setText(i9);
    }
}
