package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.redex.ViewOnClickCListenerShape13S0100000_I0_6;
import com.obwhatsapp.R;
import com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2kG  reason: invalid class name and case insensitive filesystem */
public class C55742kG extends AnonymousClass01X {
    public final Resources A00;
    public final C55752kH A01;
    public final C16320sq A02;
    public final List A03 = new ArrayList();
    public final Map A04 = new HashMap();

    public C55742kG(Resources resources, C55752kH r3, C16320sq r4) {
        this.A02 = r4;
        this.A00 = resources;
        this.A01 = r3;
    }

    public int A0C() {
        return this.A03.size();
    }

    public void A0E(AnonymousClass01Q r5, List list, int i2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C78323xj((File) it.next()));
        }
        if (i2 != 0) {
            if (i2 == 1) {
                arrayList.add(new C78343xl(Boolean.TRUE));
                arrayList.add(new C78333xk());
            } else {
                arrayList.add(new C78343xl(Boolean.FALSE));
                Object obj = r5.A00;
                AnonymousClass00B.A06(obj);
                for (Integer r1 : (List) obj) {
                    arrayList.add(new C78313xi(r1));
                }
            }
        }
        List list2 = this.A03;
        AnonymousClass07C A002 = AnonymousClass07B.A00(new AnonymousClass3QR(list2, arrayList));
        list2.clear();
        list2.addAll(arrayList);
        A002.A02(this);
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r5, int i2) {
        C64643Rc r52 = (C64643Rc) r5;
        int itemViewType = getItemViewType(i2);
        if (itemViewType == 0) {
            File file = (File) ((C83914In) this.A03.get(i2)).A01;
            C78303xh r53 = (C78303xh) r52;
            AnonymousClass366 r1 = r53.A00;
            if (r1 != null) {
                r1.A06(true);
            }
            AnonymousClass366 r2 = new AnonymousClass366(r53.A0H.getContext(), r53.A01, file);
            r53.A00 = r2;
            r53.A02.Ack(r2, new Void[0]);
            this.A04.put(Integer.valueOf(i2), r53.A00);
        } else if (itemViewType == 1) {
            C78303xh r54 = (C78303xh) r52;
            int intValue = ((Number) ((C83914In) this.A03.get(i2)).A01).intValue();
            Resources resources = this.A00;
            AnonymousClass00B.A06(resources);
            Drawable drawable = resources.getDrawable(intValue);
            AnonymousClass366 r0 = r54.A00;
            if (r0 != null) {
                r0.A06(true);
                r54.A00 = null;
            }
            r54.A01.setImageDrawable(drawable);
        } else if (itemViewType == 2) {
            C78293xg r55 = (C78293xg) r52;
            int i3 = 4;
            if (((Boolean) ((C83914In) this.A03.get(i2)).A01).booleanValue()) {
                i3 = 0;
            }
            r55.A00.setVisibility(i3);
            r55.A01.setVisibility(i3);
        }
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        Context context = viewGroup.getContext();
        if (i2 == 0 || i2 == 1) {
            C16320sq r2 = this.A02;
            AnonymousClass3Ol r1 = new AnonymousClass3Ol(context);
            r1.setScaleType(ImageView.ScaleType.CENTER_CROP);
            C78303xh r3 = new C78303xh(r1, r2);
            r3.A0H.setOnClickListener(new ViewOnClickCListenerShape0S0200000_I0(r3, 27, this));
            return r3;
        }
        LayoutInflater from = LayoutInflater.from(context);
        if (i2 == 3) {
            return new C78283xf(from.inflate(R.layout.layout0242, (ViewGroup) null));
        }
        C78293xg r32 = new C78293xg(from.inflate(R.layout.layout0243, (ViewGroup) null));
        r32.A0H.setOnClickListener(new ViewOnClickCListenerShape13S0100000_I0_6(this, 5));
        return r32;
    }

    public int getItemViewType(int i2) {
        return ((C83914In) this.A03.get(i2)).A00;
    }
}
