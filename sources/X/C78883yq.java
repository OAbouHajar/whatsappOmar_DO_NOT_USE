package X;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.obwhatsapp.privacy.usernotice.UserNoticeModalIconView;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.3yq  reason: invalid class name and case insensitive filesystem */
public class C78883yq extends C16690tT {
    public final int A00;
    public final AnonymousClass2Dq A01;
    public final WeakReference A02;

    public C78883yq(AnonymousClass2Dq r2, C77773wZ r3) {
        this.A01 = r2;
        this.A02 = C13690nt.A0h(r3);
        this.A00 = r3.getTargetIconSize();
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        View view;
        File[] fileArr = (File[]) objArr;
        if (fileArr == null || fileArr.length == 0 || (view = (View) this.A02.get()) == null) {
            return null;
        }
        File file = fileArr[0];
        int i2 = this.A00;
        return new BitmapDrawable(view.getResources(), C37741pe.A06(new C446825c(i2, i2), file).A02);
    }

    public /* bridge */ /* synthetic */ void A0A(Object obj) {
        Drawable drawable = (Drawable) obj;
        C77773wZ r1 = (C77773wZ) this.A02.get();
        if (r1 == null) {
            return;
        }
        if (drawable == null) {
            r1.A05(this.A01);
        } else if (r1 instanceof UserNoticeModalIconView) {
            UserNoticeModalIconView userNoticeModalIconView = (UserNoticeModalIconView) r1;
            userNoticeModalIconView.setBackground((Drawable) null);
            userNoticeModalIconView.setImageDrawable(drawable);
            userNoticeModalIconView.A00.setVisibility(8);
        } else {
            r1.clearColorFilter();
            r1.setImageDrawable(drawable);
        }
    }
}
