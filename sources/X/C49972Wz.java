package X;

import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.WaTextView;
import com.obwhatsapp.polls.PollResultsViewModel;

/* renamed from: X.2Wz  reason: invalid class name and case insensitive filesystem */
public class C49972Wz extends AnonymousClass01W {
    public final C51032ar A00;
    public final C51042as A01;
    public final C51052at A02;
    public final AnonymousClass2Ao A03;
    public final PollResultsViewModel A04;

    public C49972Wz(AnonymousClass0Q5 r1, C51032ar r2, C51042as r3, C51052at r4, AnonymousClass2Ao r5, PollResultsViewModel pollResultsViewModel) {
        super(r1);
        this.A04 = pollResultsViewModel;
        this.A03 = r5;
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    public void ANf(C005602k r17, int i2) {
        AnonymousClass2Ao r2;
        C16010sH A0A;
        C005602k r3 = r17;
        int i3 = i2;
        if (r3 instanceof AnonymousClass3SQ) {
            AnonymousClass3SQ r32 = (AnonymousClass3SQ) r3;
            String str = ((AnonymousClass515) A0E(i3)).A00;
            if (str != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                C45922Bq.A03(r32.A01, r32.A03, spannableStringBuilder);
                WaTextView waTextView = r32.A00;
                waTextView.setText(AnonymousClass2Sy.A03(waTextView.getContext(), waTextView.getPaint(), r32.A02, spannableStringBuilder));
            }
        } else if ((r3 instanceof C64963Si) && (A0E(i3) instanceof AnonymousClass517)) {
            C64963Si r33 = (C64963Si) r3;
            AnonymousClass517 r11 = (AnonymousClass517) A0E(i3);
            String str2 = r11.A03;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str2);
            C45922Bq.A03(r33.A06, r33.A09, spannableStringBuilder2);
            WaTextView waTextView2 = r33.A05;
            waTextView2.setText(AnonymousClass2Sy.A03(waTextView2.getContext(), waTextView2.getPaint(), r33.A08, spannableStringBuilder2));
            WaTextView waTextView3 = r33.A04;
            AnonymousClass013 r7 = r33.A07;
            int i4 = r11.A00;
            long j2 = (long) i4;
            Integer valueOf = Integer.valueOf(i4);
            waTextView3.setText(r7.A0J(new Object[]{valueOf}, R.plurals.plurals00e3, j2));
            LinearLayout linearLayout = r33.A01;
            Resources resources = linearLayout.getResources();
            boolean z2 = r11.A05;
            int i5 = R.color.color0635;
            if (z2) {
                i5 = R.color.color0660;
            }
            int A002 = AnonymousClass00X.A00((Resources.Theme) null, resources, i5);
            WaImageView waImageView = r33.A03;
            int i6 = 8;
            int i7 = 8;
            if (z2) {
                i7 = 0;
            }
            waImageView.setVisibility(i7);
            Resources resources2 = linearLayout.getResources();
            int i8 = R.drawable.poll_results_option_count_rounded_corner_non_winner;
            if (z2) {
                i8 = R.drawable.poll_results_option_count_rounded_corner_winner;
            }
            linearLayout.setBackground(AnonymousClass00X.A04((Resources.Theme) null, resources2, i8));
            View view = r33.A00;
            if (!r11.A04) {
                i6 = 0;
            }
            view.setVisibility(i6);
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(" ");
            sb.append(r7.A0J(new Object[]{valueOf}, R.plurals.plurals00e3, j2));
            r33.A02.setContentDescription(sb.toString());
        } else if ((r3 instanceof C64973Sj) && (A0E(i3) instanceof C49472Th)) {
            C64973Sj r34 = (C64973Sj) r3;
            C49472Th r8 = (C49472Th) A0E(i3);
            WaTextView waTextView4 = r34.A05;
            String str3 = r8.A01;
            waTextView4.setText(str3);
            WaTextView waTextView5 = r34.A03;
            String str4 = r8.A00;
            waTextView5.setText(str4);
            CharSequence A012 = C28961Zl.A01(r34.A09, r34.A08.A02(r8.A02));
            r34.A04.setText(A012);
            C39181s3 r22 = r8.A03;
            WaImageView waImageView2 = r34.A02;
            waImageView2.setVisibility(0);
            C28381Vw r1 = r22.A11;
            if (r1.A02) {
                C16040sK r12 = r34.A01;
                r12.A0B();
                if (r12.A01 != null) {
                    r2 = r34.A07;
                    r12.A0B();
                    A0A = r12.A01;
                }
                r34.A00.setContentDescription(r34.A0H.getContext().getResources().getString(R.string.str12d7, new Object[]{str3, str4, A012}));
            }
            C15830rv r13 = r1.A00;
            if (C16030sJ.A0L(r13)) {
                r13 = r22.A0B();
            }
            AnonymousClass00B.A06(r13);
            r2 = r34.A07;
            A0A = r34.A06.A0A(r13);
            r2.A06(waImageView2, A0A);
            r34.A00.setContentDescription(r34.A0H.getContext().getResources().getString(R.string.str12d7, new Object[]{str3, str4, A012}));
        } else if ((r3 instanceof AnonymousClass3S9) && (A0E(i3) instanceof AnonymousClass516)) {
            AnonymousClass3S9 r35 = (AnonymousClass3S9) r3;
            AnonymousClass516 r6 = (AnonymousClass516) A0E(i3);
            r35.A00 = r6.A01;
            WaTextView waTextView6 = r35.A01;
            waTextView6.setText(waTextView6.getContext().getString(R.string.str12e3, new Object[]{Integer.valueOf(r6.A00)}));
        }
    }

    public C005602k APF(ViewGroup viewGroup, int i2) {
        if (i2 == 0) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout04a1, viewGroup, false);
            C16150sX r1 = this.A01.A00.A03;
            return new AnonymousClass3SQ(inflate, (AnonymousClass01V) r1.AOi.get(), (C17250um) r1.A7e.get(), (C17020u3) r1.AMG.get());
        } else if (i2 != 1) {
            LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
            if (i2 != 2) {
                return new AnonymousClass3S9(from.inflate(R.layout.layout04a2, viewGroup, false), this.A04);
            }
            View inflate2 = from.inflate(R.layout.layout04a3, viewGroup, false);
            C51052at r0 = this.A02;
            AnonymousClass2Ao r5 = this.A03;
            C16150sX r12 = r0.A00.A03;
            return new C64973Sj(inflate2, (C16040sK) r12.ADr.get(), (C16000sG) r12.A4x.get(), r5, (C16440t3) r12.AP2.get(), (AnonymousClass013) r12.AR8.get());
        } else {
            View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout04a0, viewGroup, false);
            C16150sX r13 = this.A00.A00.A03;
            AnonymousClass013 r4 = (AnonymousClass013) r13.AR8.get();
            return new C64963Si(inflate3, (AnonymousClass01V) r13.AOi.get(), r4, (C17250um) r13.A7e.get(), (C17020u3) r13.AMG.get());
        }
    }

    public int getItemViewType(int i2) {
        return ((C49482Ti) A0E(i2)).AH0();
    }
}
