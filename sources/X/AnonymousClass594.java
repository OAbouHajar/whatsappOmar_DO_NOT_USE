package X;

import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.594  reason: invalid class name */
public final class AnonymousClass594 implements AnonymousClass5SE {
    public final C107095Gj A00;
    public volatile /* synthetic */ Object _exceptionsHolder;
    public volatile /* synthetic */ int _isCompleting = 0;
    public volatile /* synthetic */ Object _rootCause;

    public AnonymousClass594(Throwable th, C107095Gj r3) {
        this.A00 = r3;
        this._rootCause = th;
        this._exceptionsHolder = null;
    }

    public static final ArrayList A00() {
        return C13690nt.A0i(4);
    }

    public final Object A01() {
        return this._exceptionsHolder;
    }

    public final Throwable A02() {
        return (Throwable) this._rootCause;
    }

    public final List A03(Throwable th) {
        AbstractList abstractList;
        Object A01 = A01();
        if (A01 == null) {
            abstractList = A00();
        } else if (A01 instanceof Throwable) {
            abstractList = A00();
            abstractList.add(A01);
        } else if (A01 instanceof ArrayList) {
            abstractList = (AbstractList) A01;
        } else {
            throw AnonymousClass000.A0V(C18450wi.A06("State is ", A01));
        }
        Throwable A02 = A02();
        if (A02 != null) {
            abstractList.add(0, A02);
        }
        if (th != null && !th.equals(A02)) {
            abstractList.add(th);
        }
        A05(C90764el.A04);
        return abstractList;
    }

    public final void A04() {
        this._isCompleting = 1;
    }

    public final void A05(Object obj) {
        this._exceptionsHolder = obj;
    }

    public final void A06(Throwable th) {
        Throwable A02 = A02();
        if (A02 == null) {
            A07(th);
        } else if (th != A02) {
            Object A01 = A01();
            if (A01 == null) {
                A05(th);
            } else if (A01 instanceof Throwable) {
                if (th != A01) {
                    ArrayList A002 = A00();
                    A002.add(A01);
                    A002.add(th);
                    A05(A002);
                }
            } else if (A01 instanceof ArrayList) {
                ((AbstractCollection) A01).add(th);
            } else {
                throw AnonymousClass000.A0V(C18450wi.A06("State is ", A01));
            }
        }
    }

    public final void A07(Throwable th) {
        this._rootCause = th;
    }

    public final boolean A08() {
        return AnonymousClass000.A1V(A02());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
    public final boolean A09() {
        return this._isCompleting;
    }

    public final boolean A0A() {
        return AnonymousClass000.A1Y(A01(), C90764el.A04);
    }

    public C107095Gj AD9() {
        return this.A00;
    }

    public boolean AIc() {
        return AnonymousClass000.A1W(A02());
    }

    public String toString() {
        StringBuilder A0r = AnonymousClass000.A0r("Finishing[cancelling=");
        A0r.append(A08());
        A0r.append(", completing=");
        A0r.append(A09());
        A0r.append(", rootCause=");
        A0r.append(A02());
        A0r.append(", exceptions=");
        A0r.append(A01());
        A0r.append(", list=");
        A0r.append(AD9());
        return AnonymousClass3K2.A0m(A0r);
    }
}
