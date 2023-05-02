package X;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import com.obwhatsapp.mediacomposer.doodle.DoodleView;
import java.util.List;

/* renamed from: X.3CC  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3CC implements DialogInterface.OnDismissListener {
    public final /* synthetic */ AnonymousClass2Ra A00;
    public final /* synthetic */ AnonymousClass32z A01;
    public final /* synthetic */ AnonymousClass4MW A02;

    public /* synthetic */ AnonymousClass3CC(AnonymousClass2Ra r1, AnonymousClass32z r2, AnonymousClass4MW r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C455929m r0;
        AnonymousClass2Ra r8 = this.A00;
        AnonymousClass32z r7 = this.A01;
        AnonymousClass4MW r6 = this.A02;
        boolean isEmpty = TextUtils.isEmpty(r6.A03);
        if (r7 != null) {
            if (isEmpty) {
                r0 = r8.A0G;
            } else {
                C455729k r2 = r8.A0O;
                AnonymousClass393 r02 = r2.A03;
                List list = r2.A04;
                r02.A00(list);
                C455829l r03 = r2.A01;
                if (r03 != null && !list.contains(r03)) {
                    r2.A01 = null;
                }
                DoodleView doodleView = r8.A0H;
                String str = r6.A03;
                int i2 = r6.A01;
                int i3 = r6.A02;
                if (!(str.equals(r7.A06) && r7.A01.getColor() == i2 && i3 == r7.A03)) {
                    C455729k r22 = doodleView.A0J;
                    r22.A03.A00.add(new AnonymousClass332(r7.A03(), r7));
                    r7.A0S(i3);
                    r7.A0T(str, i3);
                    r7.A09(i2);
                    doodleView.invalidate();
                    if (r7 != r22.A01) {
                        r0 = doodleView.A0G;
                    }
                }
            }
            r0.A01();
        } else if (!isEmpty) {
            DoodleView doodleView2 = r8.A0H;
            String str2 = r6.A03;
            int i4 = r6.A01;
            int i5 = r6.A02;
            Context context = doodleView2.getContext();
            C17250um r3 = doodleView2.A06;
            AnonymousClass013 r23 = doodleView2.A05;
            C14710pd r1 = doodleView2.A07;
            AnonymousClass32z r04 = new AnonymousClass32z(context, r23, r3);
            r04.A05 = r1;
            r04.A0T(str2, i5);
            r04.A09(i4);
            doodleView2.A03(r04);
        }
        AnonymousClass2Yn r05 = r8.A0F;
        int i6 = r6.A01;
        r05.A00 = i6;
        r8.A0E.setColorAndInvalidate(i6);
        DoodleView doodleView3 = r8.A0H;
        doodleView3.A03 = r6.A01;
        doodleView3.invalidate();
        C49112Rc r12 = r8.A0Q;
        r12.A08(0);
        r12.A01 = r6.A01;
        r8.A03.A04();
        r8.A04();
        r12.A04();
    }
}
