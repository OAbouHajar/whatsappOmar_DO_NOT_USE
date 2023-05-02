package X;

import android.app.Activity;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.obwhatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.2oQ  reason: invalid class name and case insensitive filesystem */
public class C56732oQ extends BaseAdapter {
    public int A00 = 4;
    public int A01 = 3;
    public List A02;
    public boolean A03;
    public boolean A04;
    public final Activity A05;
    public final LayoutInflater A06;
    public final C54602hp A07;
    public final C16080sP A08;
    public final AnonymousClass2Ao A09;
    public final AnonymousClass013 A0A;
    public final C25781Lc A0B;
    public final C16320sq A0C;

    public C56732oQ(Activity activity, C54602hp r3, C16080sP r4, AnonymousClass2Ao r5, AnonymousClass013 r6, C25781Lc r7, C16320sq r8) {
        this.A05 = activity;
        this.A0C = r8;
        this.A08 = r4;
        this.A0A = r6;
        this.A07 = r3;
        this.A0B = r7;
        this.A09 = r5;
        this.A06 = LayoutInflater.from(activity);
        this.A02 = AnonymousClass000.A0u();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = X.C13680ns.A07(r2.A02);
        r0 = r2.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getCount() {
        /*
            r2 = this;
            boolean r0 = r2.A04
            if (r0 != 0) goto L_0x000f
            java.util.List r0 = r2.A02
            int r1 = X.C13680ns.A07(r0)
            int r0 = r2.A00
            if (r1 <= r0) goto L_0x000f
            return r0
        L_0x000f:
            java.util.List r0 = r2.A02
            int r0 = X.C13680ns.A07(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56732oQ.getCount():int");
    }

    public /* bridge */ /* synthetic */ Object getItem(int i2) {
        List list = this.A02;
        if (list == null) {
            return null;
        }
        return list.get(i2);
    }

    public long getItemId(int i2) {
        return (long) i2;
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        AnonymousClass4M3 r0;
        int i3;
        View view2 = view;
        if (view == null) {
            view2 = this.A06.inflate(R.layout.layout042c, viewGroup, false);
            r0 = new AnonymousClass4M3();
            r0.A03 = new C30521cU(view2, this.A08, this.A0A, this.A0B, (int) R.id.name);
            r0.A02 = C13680ns.A0R(view2, R.id.aboutInfo);
            r0.A01 = C13680ns.A0K(view2, R.id.avatar);
            r0.A00 = view2.findViewById(R.id.divider);
            view2.setTag(r0);
        } else {
            r0 = (AnonymousClass4M3) view2.getTag();
        }
        int count = getCount() - 1;
        View view3 = r0.A00;
        int i4 = i2;
        if (i4 == count) {
            view3.setVisibility(8);
        } else {
            view3.setVisibility(0);
        }
        if (this.A04 || C13680ns.A07(this.A02) <= this.A00 || i4 != (i3 = this.A01)) {
            List list = this.A02;
            C16010sH r1 = list == null ? null : (C16010sH) list.get(i4);
            AnonymousClass00B.A06(r1);
            C30521cU.A00(this.A05, r0.A03, R.color.color0507);
            r0.A03.A0A(r1);
            ImageView imageView = r0.A01;
            StringBuilder A0o = AnonymousClass000.A0o();
            A0o.append(this.A07.A00(R.string.str1dd1));
            C15830rv r2 = r1.A0E;
            AnonymousClass00B.A06(r2);
            C004601z.A0n(imageView, AnonymousClass000.A0h(r2.getRawString(), A0o));
            r0.A02.setVisibility(0);
            r0.A02.setTag(r1.A0E);
            C16080sP r7 = this.A08;
            String str = (String) r7.A0D.get(r1.A08(C16060sN.class));
            TextEmojiLabel textEmojiLabel = r0.A02;
            if (str != null) {
                textEmojiLabel.setText(str);
            } else {
                C13700nu.A0T(textEmojiLabel);
                C13700nu.A0W(new C78813yj(r0.A02, r7, (C16050sL) r1.A08(C16050sL.class)), this.A0C);
            }
            this.A09.A06(r0.A01, r1);
            r0.A01.setClickable(true);
            C34331k5.A05(r0.A01, this, r1, r0, 5);
            return view2;
        }
        C30521cU r9 = r0.A03;
        Activity activity = this.A05;
        Resources resources = activity.getResources();
        int A072 = C13680ns.A07(this.A02) - i3;
        Object[] objArr = new Object[1];
        AnonymousClass000.A1M(objArr, A072, 0);
        r9.A0E(resources.getQuantityString(R.plurals.plurals00dd, A072, objArr));
        C30521cU.A00(activity, r0.A03, R.color.color0505);
        r0.A02.setVisibility(8);
        r0.A01.setImageResource(R.drawable.ic_more_participants);
        r0.A01.setClickable(false);
        return view2;
    }

    public int getViewTypeCount() {
        return 1;
    }
}
