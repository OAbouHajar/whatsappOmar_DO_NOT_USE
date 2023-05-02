package X;

import com.obwhatsapp.avatar.profilephoto.AvatarProfilePhotoActivity;
import com.obwhatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3Im  reason: invalid class name and case insensitive filesystem */
public final class C63463Im extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ AvatarProfilePhotoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63463Im(AvatarProfilePhotoActivity avatarProfilePhotoActivity) {
        super(1);
        this.this$0 = avatarProfilePhotoActivity;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        C70833ho r8;
        List list;
        Object r4;
        List list2;
        C807845n r82 = (C807845n) obj;
        C18450wi.A0H(r82, 0);
        if (!(r82 instanceof C70833ho) || (r8 = (C70833ho) r82) == null) {
            throw AnonymousClass000.A0V("Adapter can only handle background colors.");
        }
        StringBuilder A0r = AnonymousClass000.A0r("AvatarProfilePhotoViewModel/onBackgroundColorSelected(item=");
        A0r.append(r8);
        A0r.append(')');
        C13680ns.A1V(A0r);
        AnonymousClass027 r5 = ((AvatarProfilePhotoViewModel) this.this$0.A0F.getValue()).A00;
        C89304bw r0 = (C89304bw) r5.A01();
        if (r0 == null) {
            list = C440222l.A00;
        } else {
            List<C70833ho> list3 = r0.A02;
            ArrayList A0i = C13690nt.A0i(AnonymousClass1J9.A0M(list3, 10));
            for (C70833ho r1 : list3) {
                int i2 = r1.A00;
                boolean A1R = AnonymousClass000.A1R(i2, r8.A00);
                A0i.add(new C70833ho(r1.A02, i2, r1.A01, A1R));
            }
            list = A0i;
        }
        C89304bw r02 = (C89304bw) r5.A01();
        if (r02 == null) {
            list2 = C440222l.A00;
        } else {
            List<C70823hn> list4 = r02.A03;
            ArrayList A0i2 = C13690nt.A0i(AnonymousClass1J9.A0M(list4, 10));
            for (C70823hn r42 : list4) {
                if (r42 instanceof C70813hm) {
                    r4 = new C70813hm(Integer.valueOf(r8.A01), ((C70813hm) r42).A01);
                } else if (r42 instanceof C70803hl) {
                    C70803hl r43 = (C70803hl) r42;
                    r4 = new C70803hl(r43.A01, r43.A02, r8.A01, r43.A03);
                } else {
                    throw new AnonymousClass2Xe();
                }
                A0i2.add(r4);
            }
            list2 = A0i2;
        }
        Object A01 = r5.A01();
        C18450wi.A0F(A01);
        C18450wi.A0B(A01);
        C89304bw r03 = (C89304bw) A01;
        r5.A0B(new C89304bw(r8, r03.A01, list2, list, r03.A06, r03.A05, r03.A04));
        return AnonymousClass22M.A00;
    }
}
