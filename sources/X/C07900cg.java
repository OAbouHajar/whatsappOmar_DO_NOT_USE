package X;

import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.util.Set;

/* renamed from: X.0cg  reason: invalid class name and case insensitive filesystem */
public final class C07900cg implements AnonymousClass03C {
    public static final AnonymousClass0W1 A02 = new AnonymousClass0W1();
    public final AnonymousClass0XM A00;
    public final ActivityEmbeddingComponent A01;

    public C07900cg() {
        ActivityEmbeddingComponent A022 = A02.A02();
        AnonymousClass0XM r0 = new AnonymousClass0XM();
        this.A01 = A022;
        this.A00 = r0;
    }

    public void Adt(C12010jh r3) {
        this.A01.setSplitInfoCallback(new C10940hw(this.A00, r3));
    }

    public void Aeg(Set set) {
        this.A01.setEmbeddingRules(this.A00.A0B(set));
    }
}
