package X;

import android.graphics.Bitmap;
import com.obwhatsapp.avatar.profilephoto.AvatarProfilePhotoActivity;
import com.obwhatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3In  reason: invalid class name */
public final class AnonymousClass3In extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ AvatarProfilePhotoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3In(AvatarProfilePhotoActivity avatarProfilePhotoActivity) {
        super(1);
        this.this$0 = avatarProfilePhotoActivity;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        C70803hl r8;
        List list;
        C807845n r82 = (C807845n) obj;
        C18450wi.A0H(r82, 0);
        if (!(r82 instanceof C70803hl) || (r8 = (C70803hl) r82) == null) {
            throw AnonymousClass000.A0V("Adapter can only handle poses.");
        }
        StringBuilder A0r = AnonymousClass000.A0r("AvatarProfilePhotoViewModel/onPoseSelected(item=");
        A0r.append(r8);
        A0r.append(')');
        C13680ns.A1V(A0r);
        AnonymousClass027 r5 = ((AvatarProfilePhotoViewModel) this.this$0.A0F.getValue()).A00;
        C89304bw r0 = (C89304bw) r5.A01();
        if (r0 == null) {
            list = C440222l.A00;
        } else {
            List list2 = r0.A03;
            ArrayList A0u = AnonymousClass000.A0u();
            for (Object next : list2) {
                if (next instanceof C70803hl) {
                    A0u.add(next);
                }
            }
            ArrayList A0N = AnonymousClass1J9.A0N(A0u);
            Iterator it = A0u.iterator();
            while (it.hasNext()) {
                C70803hl r1 = (C70803hl) it.next();
                Bitmap bitmap = r1.A01;
                A0N.add(new C70803hl(bitmap, r1.A02, r1.A00, C18450wi.A0R(bitmap, r8.A01)));
            }
            list = A0N;
        }
        Object A01 = r5.A01();
        C18450wi.A0F(A01);
        C18450wi.A0B(A01);
        C89304bw r02 = (C89304bw) A01;
        boolean z2 = r02.A06;
        r5.A0B(new C89304bw(r02.A00, r8, list, r02.A02, z2, r02.A05, r02.A04));
        return AnonymousClass22M.A00;
    }
}
