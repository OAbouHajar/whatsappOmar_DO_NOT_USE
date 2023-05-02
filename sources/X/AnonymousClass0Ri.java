package X;

/* renamed from: X.0Ri  reason: invalid class name */
public class AnonymousClass0Ri {
    public int A00 = 0;
    public int A01;
    public int A02;
    public int A03 = 0;
    public int A04 = 1;
    public int A05 = 0;
    public int A06 = -1;
    public long A07;
    public boolean A08 = false;
    public boolean A09 = false;
    public boolean A0A = false;
    public boolean A0B = false;
    public boolean A0C = false;
    public boolean A0D = false;

    public int A00() {
        return this.A08 ? this.A05 - this.A00 : this.A03;
    }

    public void A01(int i2) {
        int i3 = this.A04;
        if ((i3 & i2) == 0) {
            StringBuilder A0r = AnonymousClass000.A0r("Layout state should be one of ");
            A0r.append(Integer.toBinaryString(i2));
            A0r.append(" but it is ");
            throw AnonymousClass000.A0V(AnonymousClass000.A0h(Integer.toBinaryString(i3), A0r));
        }
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("State{mTargetPosition=");
        A0r.append(this.A06);
        A0r.append(", mData=");
        A0r.append((Object) null);
        A0r.append(", mItemCount=");
        A0r.append(this.A03);
        A0r.append(", mIsMeasuring=");
        A0r.append(this.A09);
        A0r.append(", mPreviousLayoutItemCount=");
        A0r.append(this.A05);
        A0r.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        A0r.append(this.A00);
        A0r.append(", mStructureChanged=");
        A0r.append(this.A0C);
        A0r.append(", mInPreLayout=");
        A0r.append(this.A08);
        A0r.append(", mRunSimpleAnimations=");
        A0r.append(this.A0B);
        A0r.append(", mRunPredictiveAnimations=");
        A0r.append(this.A0A);
        return AnonymousClass000.A0k(A0r);
    }
}
