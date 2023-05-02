package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.obwhatsapp.group.GroupChatInfoActivity;
import java.lang.ref.WeakReference;

/* renamed from: X.3yn  reason: invalid class name and case insensitive filesystem */
public class C78853yn extends C16690tT {
    public final AnonymousClass152 A00;
    public final C16010sH A01;
    public final WeakReference A02;

    public C78853yn(AnonymousClass152 r2, C16010sH r3, GroupChatInfoActivity groupChatInfoActivity) {
        this.A00 = r2;
        this.A02 = C13690nt.A0h(groupChatInfoActivity);
        this.A01 = r3;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        Context context = (Context) this.A02.get();
        if (context != null) {
            return this.A00.A00(context, this.A01, 0.0f, 640);
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        GroupChatInfoActivity groupChatInfoActivity = (GroupChatInfoActivity) this.A02.get();
        if (groupChatInfoActivity != null) {
            if (bitmap != null) {
                groupChatInfoActivity.A3G(bitmap);
            } else {
                groupChatInfoActivity.A3J(Integer.valueOf(groupChatInfoActivity.A0b.A02(groupChatInfoActivity.A3M())));
            }
            if (AnonymousClass27A.A00(groupChatInfoActivity.A3M())) {
                groupChatInfoActivity.A0A.setVisibility(0);
            }
        }
    }
}
