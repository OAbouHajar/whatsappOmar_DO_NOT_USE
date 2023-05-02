package X;

import java.util.List;

/* renamed from: X.0da  reason: invalid class name and case insensitive filesystem */
public class C08400da implements C13230lg {
    public final AnonymousClass0HT A00;
    public final AnonymousClass0HT A01;

    public C08400da(AnonymousClass0HT r1, AnonymousClass0HT r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public AnonymousClass0SI A7E() {
        return new AnonymousClass0HE(AnonymousClass0HC.A00(this.A00), AnonymousClass0HC.A00(this.A01));
    }

    public List AD1() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    public boolean AJi() {
        return this.A00.AJi() && this.A01.AJi();
    }
}
