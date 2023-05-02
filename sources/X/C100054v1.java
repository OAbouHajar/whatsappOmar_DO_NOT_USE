package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.obwhatsapp.R;
import com.obwhatsapp.RequestPermissionActivity;
import com.obwhatsapp.mentions.MentionableEntry;
import java.util.Collections;
import java.util.List;

/* renamed from: X.4v1  reason: invalid class name and case insensitive filesystem */
public class C100054v1 implements AnonymousClass2Su {
    public C75223ro A00;
    public List A01;
    public final Activity A02;
    public final C14870pt A03;
    public final AnonymousClass10X A04;
    public final C16000sG A05;
    public final C16080sP A06;
    public final C16260sj A07;
    public final C17250um A08;
    public final C16490t9 A09;
    public final C15830rv A0A;
    public final C17960vv A0B;
    public final MentionableEntry A0C;

    public C100054v1(Context context, C14870pt r3, AnonymousClass10X r4, C16000sG r5, C16080sP r6, C16260sj r7, C17250um r8, C16490t9 r9, C15830rv r10, C17960vv r11, MentionableEntry mentionableEntry) {
        this.A02 = C19980zJ.A00(context);
        this.A04 = r4;
        this.A03 = r3;
        this.A0C = mentionableEntry;
        this.A0A = r10;
        this.A07 = r7;
        this.A0B = r11;
        this.A05 = r5;
        this.A06 = r6;
        this.A08 = r8;
        this.A09 = r9;
    }

    public final void A00(List list) {
        String str;
        C75223ro r1;
        List list2 = list;
        if (list == null || list.isEmpty()) {
            this.A03.A09(R.string.str15fd, 0);
            str = "drag_drop_uri_null_or_empty";
        } else if (!this.A07.A0B()) {
            Activity activity = this.A02;
            int i2 = Build.VERSION.SDK_INT;
            int i3 = R.string.str1247;
            if (i2 >= 30) {
                i3 = R.string.str124b;
                if (i2 < 33) {
                    i3 = R.string.str124a;
                }
            }
            RequestPermissionActivity.A0L(activity, R.string.str1249, i3, 29);
            this.A01 = list;
            str = "missing_storage_permission";
        } else {
            AnonymousClass10X r12 = this.A04;
            List singletonList = Collections.singletonList(this.A0A);
            Activity activity2 = this.A02;
            r12.A00(activity2, (C14600pS) activity2, new C99944uq(this), (C35541m6) null, "", singletonList, list2, 9, false, false);
            r1 = this.A00;
            r1.A00 = Boolean.TRUE;
            this.A09.A06(r1);
        }
        r1 = this.A00;
        r1.A00 = Boolean.FALSE;
        r1.A02 = str;
        this.A09.A06(r1);
    }

    public boolean AM4(Intent intent, int i2, int i3) {
        if (i2 != 29 || i3 != -1) {
            return false;
        }
        A00(this.A01);
        return true;
    }
}
