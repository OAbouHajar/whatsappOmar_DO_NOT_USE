package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.obwhatsapp.R;
import com.obwhatsapp.yo.yo;
import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.61i  reason: invalid class name and case insensitive filesystem */
public final class C1203561i implements AnonymousClass1IH {
    public final C16080sP A00;
    public final AnonymousClass152 A01;
    public final C16980tz A02;
    public final C18290wS A03;

    public C1203561i(C16080sP r1, AnonymousClass152 r2, C16980tz r3, C18290wS r4) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
    }

    public Class A8z() {
        return C114955os.class;
    }

    public /* bridge */ /* synthetic */ Object AcV(Enum enumR, Object obj, Map map) {
        C16010sH r7 = (C16010sH) obj;
        C114955os r6 = (C114955os) enumR;
        boolean A19 = C110115dX.A19(r7, r6);
        int A012 = C110115dX.A01(r6, C115375pe.A00);
        if (A012 == A19) {
            return this.A00.A08(r7);
        }
        if (A012 == 2) {
            AnonymousClass152 r4 = this.A01;
            Context context = this.A02.A00;
            Bitmap A002 = r4.A00(context, r7, yo.setSQPC(context.getResources().getDimension(R.dimen.dimen0748)), context.getResources().getDimensionPixelSize(R.dimen.dimen074a));
            return A002 != null ? C37741pe.A07(A002) : C37741pe.A07(BitmapFactory.decodeResource(context.getResources(), R.drawable.avatar_contact));
        } else if (A012 == 3) {
            UserJid A0I = C110115dX.A0I(r7);
            if (A0I != null) {
                return C110115dX.A0H(this.A03).A05(A0I);
            }
            return null;
        } else {
            throw new AnonymousClass2Xe();
        }
    }
}
