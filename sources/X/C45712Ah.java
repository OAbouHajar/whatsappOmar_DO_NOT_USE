package X;

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.obwhatsapp.R;
import com.whatsapp.jid.UserJid;
import com.whatsapp.stickers.StickerView;
import com.whatsapp.util.ViewOnClickCListenerShape0S0200000_I0;

/* renamed from: X.2Ah  reason: invalid class name and case insensitive filesystem */
public class C45712Ah extends AnonymousClass04B {
    public final Context A00;
    public final C16040sK A01;
    public final C16000sG A02;
    public final AnonymousClass2Ao A03;
    public final C30001ba A04;
    public final AnonymousClass1YG A05;
    public final C16460t6 A06;
    public final ViewOnClickCListenerShape0S0200000_I0 A07;

    public C45712Ah(Context context, C16040sK r2, C16000sG r3, AnonymousClass2Ao r4, C30001ba r5, AnonymousClass1YG r6, C16460t6 r7, ViewOnClickCListenerShape0S0200000_I0 viewOnClickCListenerShape0S0200000_I0) {
        super(context);
        this.A00 = context;
        this.A01 = r2;
        this.A02 = r3;
        this.A06 = r7;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A07 = viewOnClickCListenerShape0S0200000_I0;
    }

    public View A02(Context context, Cursor cursor, ViewGroup viewGroup) {
        throw new AssertionError();
    }

    public void A03(View view, Context context, Cursor cursor) {
        throw new AssertionError();
    }

    /* renamed from: A04 */
    public C16740tZ getItem(int i2) {
        Cursor cursor = this.A02;
        if (cursor == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.A06.A0K.A01(cursor);
    }

    public int getItemViewType(int i2) {
        C30001ba r1 = this.A04;
        C16740tZ A042 = getItem(i2);
        AnonymousClass00B.A06(A042);
        return r1.A00(A042);
    }

    public View getView(int i2, View view, ViewGroup viewGroup) {
        C30011bb r6;
        C16010sH A0A;
        C16740tZ A042 = getItem(i2);
        AnonymousClass00B.A06(A042);
        if (view == null) {
            r6 = this.A04.A02(viewGroup.getContext(), this.A05, A042);
        } else {
            r6 = (C30011bb) view;
            r6.A1G(A042, true);
        }
        ImageView imageView = (ImageView) r6.findViewById(R.id.profile_picture);
        C004601z.A0d(imageView, 2);
        if (A042.A11.A02) {
            C16040sK r0 = this.A01;
            r0.A0B();
            A0A = r0.A01;
            AnonymousClass00B.A06(A0A);
        } else {
            C16000sG r1 = this.A02;
            UserJid A0C = A042.A0C();
            AnonymousClass00B.A06(A0C);
            A0A = r1.A0A(A0C);
        }
        this.A03.A06(imageView, A0A);
        r6.setOnClickListener(this.A07);
        if ((r6 instanceof AnonymousClass31I) && ((C38641rB) r6.getFMessage()).A00) {
            AnonymousClass31I r02 = (AnonymousClass31I) r6;
            r02.A00 = true;
            StickerView stickerView = r02.A04.A0F;
            if (stickerView != null) {
                stickerView.A03 = true;
                stickerView.A04();
            }
        }
        return r6;
    }

    public int getViewTypeCount() {
        return 98;
    }
}
