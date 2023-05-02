package X;

import android.content.Context;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.FrameLayout;
import com.facebook.redex.ViewOnClickCListenerShape3S0200000_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.2ji  reason: invalid class name and case insensitive filesystem */
public class C55502ji extends AnonymousClass01X implements Filterable {
    public int A00;
    public int A01 = -1;
    public int A02;
    public C56792oW A03;
    public AnonymousClass576 A04;
    public String A05 = "";
    public List A06 = new ArrayList();
    public List A07 = new ArrayList();
    public boolean A08;
    public final int A09;
    public final int A0A;
    public final C16040sK A0B;
    public final C18190wI A0C;
    public final C16080sP A0D;
    public final AnonymousClass2Ao A0E;
    public final AnonymousClass013 A0F;
    public final C46182Cu A0G;
    public final C19990zK A0H;
    public final C25781Lc A0I;

    public C55502ji(Context context, C16040sK r4, C18190wI r5, C16080sP r6, C17200uh r7, AnonymousClass013 r8, C46182Cu r9, C19990zK r10, C25781Lc r11, boolean z2, boolean z3) {
        int i2;
        this.A0H = r10;
        this.A0B = r4;
        this.A0D = r6;
        this.A0F = r8;
        this.A0I = r11;
        this.A0C = r5;
        this.A0E = r7.A03(context, "mentions-adapter");
        this.A0G = r9;
        if (z2) {
            this.A00 = AnonymousClass00T.A00(context, R.color.color054e);
            this.A02 = AnonymousClass00T.A00(context, R.color.color054f);
            i2 = R.color.color054b;
        } else {
            this.A00 = AnonymousClass00T.A00(context, R.color.color0507);
            this.A02 = AnonymousClass00T.A00(context, R.color.color0502);
            i2 = R.color.color01db;
        }
        this.A09 = AnonymousClass00T.A00(context, i2);
        this.A0A = (int) context.getResources().getDimension(R.dimen.dimen052a);
        this.A08 = z3;
    }

    public int A0C() {
        return this.A07.size();
    }

    public final CharSequence A0E(String str) {
        String lowerCase = str.toLowerCase();
        String str2 = this.A05;
        int indexOf = lowerCase.indexOf(str2);
        if (str2.length() <= 0 || indexOf < 0) {
            return str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        spannableStringBuilder.setSpan(new StyleSpan(1), indexOf, this.A05.length() + indexOf, 33);
        return spannableStringBuilder;
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r9, int i2) {
        C57672rZ r92 = (C57672rZ) r9;
        C16010sH r6 = (C16010sH) this.A07.get(i2);
        C30521cU r5 = r92.A04;
        C19990zK r7 = this.A0H;
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(C19990zK.A05 ? "⁨" : str);
        sb.append(r6.A0K() ? r7.A03.A0I(r6, false) : r7.A02.A01.A0E(C16620tM.A02, 604) ? r7.A03.A0G(r6, 1, false) : !TextUtils.isEmpty(r6.A09()) ? r6.A09() : C24561Gk.A01(r6));
        if (C19990zK.A06) {
            str = "⁩";
        }
        sb.append(str);
        r5.A0F((List) null, A0E(sb.toString()));
        r5.A07(r6.A0L() ? 1 : 0);
        this.A0E.A06(r92.A05, r6);
        r92.A02.setOnClickListener(new ViewOnClickCListenerShape3S0200000_I0(this, 38, r6));
        View view = r92.A01;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        int i3 = this.A01;
        int i4 = Build.VERSION.SDK_INT;
        if (i2 != i3) {
            int i5 = this.A0A;
            if (i4 >= 17) {
                layoutParams.setMarginStart(i5);
            } else {
                layoutParams.setMargins(i5, 0, 0, 0);
            }
        } else if (i4 >= 17) {
            layoutParams.setMarginStart(0);
        } else {
            layoutParams.setMargins(0, 0, 0, 0);
        }
        view.setBackgroundColor(this.A09);
        view.setLayoutParams(layoutParams);
        if (this.A08) {
            if (i2 == this.A07.size() - 1) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
        }
        if (!r6.A0K()) {
            C16080sP r3 = this.A0D;
            if (C16080sP.A02(r6) && !this.A0C.A01.A0E(C16620tM.A02, 604)) {
                TextEmojiLabel textEmojiLabel = r92.A03;
                textEmojiLabel.setText(A0E(r3.A0F(r6)));
                textEmojiLabel.setVisibility(0);
                return;
            }
        }
        r92.A03.setVisibility(8);
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        return new C57672rZ((FrameLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout03da, viewGroup, false), this);
    }

    public Filter getFilter() {
        C56792oW r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C56792oW r02 = new C56792oW(this);
        this.A03 = r02;
        return r02;
    }
}
