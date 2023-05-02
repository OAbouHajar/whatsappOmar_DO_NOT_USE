package X;

import android.content.Intent;
import android.net.Uri;
import com.obwhatsapp.R;
import com.whatsapp.util.Log;

/* renamed from: X.3DW  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3DW implements AnonymousClass04N {
    public final /* synthetic */ C609336r A00;
    public final /* synthetic */ Integer A01;

    public /* synthetic */ AnonymousClass3DW(C609336r r1, Integer num) {
        this.A00 = r1;
        this.A01 = num;
    }

    public final void accept(Object obj) {
        int i2;
        C609336r r0 = this.A00;
        Integer num = this.A01;
        C14550pN r5 = (C14550pN) obj;
        int intValue = num.intValue();
        if (intValue == 0) {
            Intent A09 = C13680ns.A09();
            A09.setData((Uri) r5.getIntent().getParcelableExtra("emojiEditorImageResult"));
            A09.putExtra("emojiEditorImageResult", r5.getIntent().getParcelableExtra("emojiEditorImageResult"));
            A09.putExtra("skip_cropping", true);
            C13680ns.A0r(r5, A09);
        } else if (!C16690tT.A02(r0)) {
            Log.e(AnonymousClass000.A0g("GroupProfileEmojiEditor/render/error ", num));
            if (intValue == -2) {
                boolean A002 = C14730pf.A00();
                i2 = R.string.str0b9f;
                if (A002) {
                    i2 = R.string.str0b9c;
                }
            } else if (intValue == -3) {
                i2 = R.string.str084c;
            } else {
                r5.A05.A09(R.string.str0848, 1);
                return;
            }
            r5.Afg(i2);
        }
    }
}
