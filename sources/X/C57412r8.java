package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.2r8  reason: invalid class name and case insensitive filesystem */
public class C57412r8 extends AnonymousClass01X {
    public List A00;
    public boolean A01 = false;
    public final Context A02;
    public final LayoutInflater A03;
    public final C54602hp A04;
    public final C16080sP A05;
    public final AnonymousClass2Ao A06;
    public final AnonymousClass013 A07;
    public final C25781Lc A08;

    public C57412r8(Context context, C54602hp r3, C16080sP r4, AnonymousClass2Ao r5, AnonymousClass013 r6, C25781Lc r7) {
        this.A02 = context;
        this.A03 = LayoutInflater.from(context);
        this.A05 = r4;
        this.A07 = r6;
        this.A04 = r3;
        this.A08 = r7;
        this.A06 = r5;
    }

    public int A0C() {
        List list = this.A00;
        if (list == null) {
            return 0;
        }
        int size = list.size();
        if (size <= 2 || this.A01) {
            return size;
        }
        return 3;
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r10, int i2) {
        AnonymousClass3SY r102 = (AnonymousClass3SY) r10;
        if (this.A01 || i2 != 2) {
            List list = this.A00;
            if (list != null) {
                AnonymousClass4I2 r6 = (AnonymousClass4I2) list.get(i2);
                C16010sH r5 = r6.A00;
                C30521cU r2 = r102.A05;
                r2.A0A(r5);
                C30521cU.A00(this.A02, r2, R.color.color0507);
                ImageView imageView = r102.A01;
                StringBuilder A0o = AnonymousClass000.A0o();
                A0o.append(this.A04.A00(R.string.str1dd1));
                C004601z.A0n(imageView, AnonymousClass000.A0h(C16030sJ.A03(r5.A0E), A0o));
                AnonymousClass2Ao r3 = this.A06;
                r3.A06(imageView, r5);
                C16080sP r1 = this.A05;
                if (r1.A0S(r5, -1) && r5.A0W != null) {
                    TextEmojiLabel textEmojiLabel = r102.A03;
                    textEmojiLabel.setVisibility(0);
                    textEmojiLabel.A0I((List) null, r1.A0F(r5));
                }
                if (r5.A0T != null) {
                    TextEmojiLabel textEmojiLabel2 = r102.A04;
                    textEmojiLabel2.setVisibility(0);
                    textEmojiLabel2.A0I((List) null, r5.A0T);
                } else {
                    r102.A04.setVisibility(8);
                }
                C13690nt.A1B(r102.A0H, this, r5, r6, 18);
                r3.A06(imageView, r5);
                return;
            }
            return;
        }
        int A072 = C13680ns.A07(this.A00) - 2;
        C30521cU r52 = r102.A05;
        Object[] A1b = C13680ns.A1b();
        AnonymousClass000.A1M(A1b, A072, 0);
        r52.A0E(this.A07.A0J(A1b, R.plurals.plurals00dd, (long) A072));
        C30521cU.A00(this.A02, r52, R.color.color0505);
        r102.A04.setVisibility(8);
        r102.A01.setImageResource(R.drawable.ic_more_participants);
        C13680ns.A16(r102.A0H, this, 31);
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        return new AnonymousClass3SY(C13680ns.A0H(this.A03, viewGroup, R.layout.layout02d7), this.A05, this.A07, this.A08);
    }
}
