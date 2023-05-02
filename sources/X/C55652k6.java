package X;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.obwhatsapp.R;
import com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2k6  reason: invalid class name and case insensitive filesystem */
public class C55652k6 extends AnonymousClass01X {
    public final ContentResolver A00;
    public final Handler A01;
    public final C23651Cv A02;
    public final C16980tz A03;
    public final C49172Rk A04;
    public final C55662k7 A05;
    public final AnonymousClass4FA A06;
    public final C16320sq A07;
    public final List A08;
    public final Map A09;

    public C55652k6(ContentResolver contentResolver, Handler handler, C23651Cv r5, C16980tz r6, C49172Rk r7, C55662k7 r8, C16320sq r9, List list) {
        HashMap hashMap = new HashMap();
        this.A09 = hashMap;
        this.A06 = new AnonymousClass4FA(hashMap);
        this.A08 = list;
        this.A05 = r8;
        this.A01 = handler;
        this.A00 = contentResolver;
        this.A02 = r5;
        this.A03 = r6;
        this.A07 = r9;
        this.A04 = r7;
    }

    public int A0C() {
        return this.A08.size();
    }

    public /* bridge */ /* synthetic */ void ANf(C005602k r4, int i2) {
        AnonymousClass3T0 r42 = (AnonymousClass3T0) r4;
        r42.A0H.setOnClickListener(new ViewOnClickCListenerShape0S0200000_I0(r42, 26, this));
        r42.A08((Integer) this.A08.get(i2));
        C16690tT A072 = r42.A07();
        if (A072 != null) {
            this.A09.put(Integer.valueOf(i2), A072);
        }
    }

    public /* bridge */ /* synthetic */ C005602k APF(ViewGroup viewGroup, int i2) {
        Context context = viewGroup.getContext();
        if (i2 == 5) {
            return new C78273xe(LayoutInflater.from(context).inflate(R.layout.layout0613, (ViewGroup) null), this.A06);
        } else if (i2 == 4) {
            return new C78263xd(LayoutInflater.from(context).inflate(R.layout.layout0612, (ViewGroup) null), this.A06);
        } else if (i2 != 3) {
            return new C605934j(this.A06, new AnonymousClass3OQ(context));
        } else {
            Handler handler = this.A01;
            ContentResolver contentResolver = this.A00;
            C23651Cv r1 = this.A02;
            C16980tz r5 = this.A03;
            C16320sq r10 = this.A07;
            return new C606034k(r5, this.A04, new AnonymousClass2OM(contentResolver, handler, r1, "wallpaper-category"), this.A06, new AnonymousClass3OQ(context), r10);
        }
    }

    public int getItemViewType(int i2) {
        return ((Number) this.A08.get(i2)).intValue();
    }
}
