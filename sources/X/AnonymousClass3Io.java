package X;

import com.obwhatsapp.R;
import com.obwhatsapp.avatar.profilephoto.AvatarProfilePhotoViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: X.3Io  reason: invalid class name */
public final class AnonymousClass3Io extends AnonymousClass1DR implements AnonymousClass22J {
    public final /* synthetic */ int $selectedPosePosition;
    public final /* synthetic */ AvatarProfilePhotoViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3Io(AvatarProfilePhotoViewModel avatarProfilePhotoViewModel, int i2) {
        super(1);
        this.this$0 = avatarProfilePhotoViewModel;
        this.$selectedPosePosition = i2;
    }

    public /* bridge */ /* synthetic */ Object AIU(Object obj) {
        Iterable iterable = (Iterable) obj;
        C18450wi.A0H(iterable, 0);
        AvatarProfilePhotoViewModel avatarProfilePhotoViewModel = this.this$0;
        int i2 = this.$selectedPosePosition;
        ArrayList A0N = AnonymousClass1J9.A0N(iterable);
        int i3 = 0;
        for (Object next : iterable) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                AnonymousClass1JA.A0T();
                throw AnonymousClass000.A0Z();
            }
            AnonymousClass4Vq r0 = (AnonymousClass4Vq) next;
            A0N.add(new C70803hl(r0.A00, r0.A01, AnonymousClass00T.A00(avatarProfilePhotoViewModel.A04.A00.A00.getApplicationContext(), R.color.color0493), AnonymousClass000.A1R(i3, i2)));
            i3 = i4;
        }
        Iterator it = A0N.iterator();
        while (it.hasNext()) {
            C70803hl r8 = (C70803hl) it.next();
            if (r8.A03) {
                Object A01 = this.this$0.A00.A01();
                C18450wi.A0F(A01);
                List list = ((C89304bw) A01).A02;
                Object A012 = this.this$0.A00.A01();
                C18450wi.A0F(A012);
                this.this$0.A00.A0B(new C89304bw(((C89304bw) A012).A00, r8, A0N, list, false, false, false));
                return AnonymousClass22M.A00;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
