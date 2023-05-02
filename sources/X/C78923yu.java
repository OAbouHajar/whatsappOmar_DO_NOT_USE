package X;

import com.obwhatsapp.community.CommunityDeleteDialogFragment;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.3yu  reason: invalid class name and case insensitive filesystem */
public class C78923yu extends C16690tT {
    public final /* synthetic */ long A00;
    public final /* synthetic */ CommunityDeleteDialogFragment A01;
    public final /* synthetic */ WeakReference A02;
    public final /* synthetic */ List A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C78923yu(C001300o r2, CommunityDeleteDialogFragment communityDeleteDialogFragment, WeakReference weakReference, List list, long j2) {
        super(r2, true);
        this.A01 = communityDeleteDialogFragment;
        this.A03 = list;
        this.A00 = j2;
        this.A02 = weakReference;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        for (Object next : this.A03) {
            C16760tb r1 = this.A01.A01;
            AnonymousClass00B.A06(next);
            r1.A0I((C15830rv) next, true);
        }
        C14550pN.A0y(this.A00, 300);
        return null;
    }

    public void A0A(Object obj) {
        C14550pN r1 = (C14550pN) this.A02.get();
        if (r1 != null && !r1.isFinishing()) {
            r1.Ac1();
        }
        this.A01.A06.A05(0);
    }
}
