package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.obwhatsapp.privacy.usernotice.UserNoticeBottomSheetDialogFragment;
import java.util.Map;

/* renamed from: X.3yF  reason: invalid class name and case insensitive filesystem */
public class C78543yF extends AnonymousClass3MS {
    public final C82914Eq A00;
    public final String A01;
    public final Map A02;

    public C78543yF(Context context, C82914Eq r2, String str, String str2, Map map) {
        super(context, str);
        this.A01 = str2;
        this.A02 = map;
        this.A00 = r2;
    }

    public void onClick(View view) {
        C82914Eq r0 = this.A00;
        String str = this.A01;
        Map map = this.A02;
        UserNoticeBottomSheetDialogFragment userNoticeBottomSheetDialogFragment = r0.A00;
        userNoticeBottomSheetDialogFragment.A0B.A00(userNoticeBottomSheetDialogFragment.A02(), str, map);
        AnonymousClass13G r2 = userNoticeBottomSheetDialogFragment.A0C;
        int i2 = 8;
        if (!TextUtils.isEmpty(userNoticeBottomSheetDialogFragment.A0E.A03)) {
            i2 = 5;
        }
        r2.A01(Integer.valueOf(i2));
    }
}
