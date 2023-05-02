package X;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.obwhatsapp.R;
import com.whatsapp.stickers.thirdparty.AddThirdPartyStickerPackActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import org.apache.commons.io.FileUtils;

/* renamed from: X.36y  reason: invalid class name and case insensitive filesystem */
public class C610036y extends C16690tT {
    public AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment A00;
    public final C16490t9 A01;
    public final C50292Yt A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final WeakReference A06;

    public C610036y(C001000l r2, C16490t9 r3, C50292Yt r4, String str, String str2, String str3) {
        this.A01 = r3;
        this.A04 = str;
        this.A03 = str2;
        this.A05 = str3;
        this.A02 = r4;
        this.A06 = C13690nt.A0h(r2);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int i2;
        String str = this.A04;
        if (!TextUtils.isEmpty(str)) {
            String str2 = this.A03;
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(this.A05)) {
                C75153rh r5 = new C75153rh();
                try {
                    C27041Qf r0 = this.A02.A03;
                    C37771pi A002 = r0.A00(str2, str);
                    if (r0.A07.A02(str2, str)) {
                        i2 = 0;
                    } else {
                        r5.A00 = Boolean.valueOf(A002.A0P);
                        r5.A02 = C13690nt.A0W(A002.A04.size());
                        r5.A03 = Long.valueOf((A002.A01 / 10) / FileUtils.ONE_KB);
                        r5.A01 = Boolean.TRUE;
                        C16490t9 r3 = this.A01;
                        r3.A06(r5);
                        C75343s0 r2 = new C75343s0();
                        Boolean bool = Boolean.FALSE;
                        r2.A02 = bool;
                        r2.A03 = C13680ns.A0a();
                        r2.A01 = Boolean.valueOf(A002.A0Q);
                        r2.A00 = bool;
                        r3.A06(r2);
                        i2 = 1;
                    }
                    return new C83984Iu(i2, (String) null);
                } catch (Exception e2) {
                    Log.e("AddThirdPartyStickerPackActivity/fetch sticker pack error:", e2);
                    r5.A01 = Boolean.FALSE;
                    this.A01.A06(r5);
                    return new C83984Iu(2, e2.getMessage());
                }
            }
        }
        StringBuilder A0r = AnonymousClass000.A0r("one of the follow fields are empty. pack id:");
        A0r.append(str);
        A0r.append(",authority:");
        A0r.append(this.A03);
        A0r.append(",sticker pack name:");
        return new C83984Iu(2, AnonymousClass000.A0h(this.A05, A0r));
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        C83984Iu r7 = (C83984Iu) obj;
        AddThirdPartyStickerPackActivity.AddStickerPackDialogFragment addStickerPackDialogFragment = this.A00;
        if (addStickerPackDialogFragment != null && !addStickerPackDialogFragment.A0X) {
            int i2 = r7.A00;
            if (i2 == 0) {
                Object[] A1Z = C13690nt.A1Z();
                A1Z[0] = addStickerPackDialogFragment.A05;
                addStickerPackDialogFragment.A1N(C13690nt.A0c(addStickerPackDialogFragment, addStickerPackDialogFragment.A0J(R.string.str1cf7), A1Z, 1, R.string.str16e7), 8, 0, 8);
                Activity activity = (Activity) this.A06.get();
                if (activity != null) {
                    Intent A09 = C13680ns.A09();
                    A09.putExtra("already_added", true);
                    activity.setResult(-1, A09);
                }
            } else if (i2 == 1) {
                Object[] A1Z2 = C13690nt.A1Z();
                A1Z2[0] = addStickerPackDialogFragment.A05;
                addStickerPackDialogFragment.A1N(C13690nt.A0c(addStickerPackDialogFragment, addStickerPackDialogFragment.A0J(R.string.str1cf7), A1Z2, 1, R.string.str00c5), 8, 8, 0);
            } else {
                addStickerPackDialogFragment.A1N(C13690nt.A0c(addStickerPackDialogFragment, addStickerPackDialogFragment.A0J(R.string.str1cf7), new Object[1], 0, R.string.str16e8), 8, 0, 8);
                Activity activity2 = (Activity) this.A06.get();
                if (activity2 != null) {
                    Intent A092 = C13680ns.A09();
                    A092.putExtra("validation_error", r7.A01);
                    activity2.setResult(0, A092);
                }
            }
        }
    }
}
