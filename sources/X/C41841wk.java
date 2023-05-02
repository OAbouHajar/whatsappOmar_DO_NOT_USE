package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import com.facebook.redex.RunnableRunnableShape20S0100000_I1_3;
import com.obwhatsapp.mediacomposer.doodle.DoodleView;
import com.whatsapp.util.Log;

/* renamed from: X.1wk  reason: invalid class name and case insensitive filesystem */
public abstract class C41841wk {
    public final C17100uX A00;
    public final C14870pt A01;
    public final AnonymousClass01V A02;
    public final AnonymousClass013 A03;
    public final AnonymousClass1P8 A04;
    public final AnonymousClass4Ta A05;

    public C41841wk(C17100uX r1, C14870pt r2, AnonymousClass01V r3, AnonymousClass013 r4, AnonymousClass1P8 r5, AnonymousClass4Ta r6) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = r1;
        this.A05 = r6;
    }

    public static void A00(AnonymousClass4WP r2, C41841wk r3) {
        r2.A01 = 0;
        r2.A02 = SystemClock.elapsedRealtime();
        r2.A01();
        r3.A05.A01();
    }

    public Context A01() {
        View view = this.A05.A00.A00;
        AnonymousClass00B.A04(view);
        return view.getContext();
    }

    public View A02() {
        return this instanceof AnonymousClass34y ? ((AnonymousClass34y) this).A0A : this instanceof C606934x ? ((C606934x) this).A09 : this instanceof C606534t ? ((C606534t) this).A00 : this instanceof C606734v ? ((C606734v) this).A0e : this instanceof C606634u ? ((C606634u) this).A05 : ((C606434s) this).A00;
    }

    public void A03() {
        C613038j r0;
        if (this instanceof C606934x) {
            r0 = ((C606934x) this).A01;
        } else if (this instanceof C606734v) {
            C606734v r3 = (C606734v) this;
            Context context = r3.A0O;
            int i2 = context == null ? 0 : context.getResources().getConfiguration().orientation;
            boolean z2 = false;
            if (!r3.A0K || !r3.A0J) {
                r3.A0M = false;
                r3.A03 = i2;
                r3.A0E();
                return;
            }
            if (r3.A03 != i2) {
                z2 = true;
            }
            r3.A0M = z2;
            return;
        } else if (this instanceof C606634u) {
            r0 = ((C606634u) this).A00;
        } else {
            return;
        }
        if (r0 != null) {
            r0.A02.dismiss();
        }
    }

    public void A04() {
        AnonymousClass4WP r0;
        Handler handler;
        if (this instanceof AnonymousClass34y) {
            AnonymousClass34y r4 = (AnonymousClass34y) this;
            C56482nj r3 = r4.A01;
            if (!(r3 == null || (handler = r3.A02) == null)) {
                handler.post(new RunnableRunnableShape20S0100000_I1_3(r3, 10));
            }
            r4.A0B.A02(r4);
            r4.A02 = false;
        } else if (this instanceof C606934x) {
            C606934x r32 = (C606934x) this;
            r32.A0E();
            if (r32.A02 != null) {
                r32.A0E();
                r32.A02.A07();
            }
            DoodleView doodleView = r32.A0E;
            if (doodleView != null) {
                doodleView.A0G.A0A = false;
                doodleView.invalidate();
            }
            r32.A0I.A02(r32);
            r32.A03 = false;
            C613038j r02 = r32.A01;
            if (r02 != null) {
                r02.A02.dismiss();
            }
        } else {
            if (this instanceof C606534t) {
                r0 = ((C606534t) this).A06;
            } else if (this instanceof C606734v) {
                r0 = ((C606734v) this).A0d;
            } else if (this instanceof C606634u) {
                C606634u r1 = (C606634u) this;
                r1.A07.A02();
                r1.A02 = false;
                return;
            } else {
                r0 = ((C606434s) this).A01;
            }
            r0.A02();
        }
    }

    public void A05() {
        Handler handler;
        if (this instanceof AnonymousClass34y) {
            AnonymousClass34y r4 = (AnonymousClass34y) this;
            C56482nj r3 = r4.A01;
            if (!(r3 == null || (handler = r3.A02) == null)) {
                handler.post(new RunnableRunnableShape20S0100000_I1_3(r3, 8));
            }
            if (!r4.A02 && r4.A05.A00.A05) {
                r4.A02 = true;
                r4.A0B.A03(r4);
            }
        } else if (this instanceof C606934x) {
            C606934x r32 = (C606934x) this;
            r32.A0E();
            if (!r32.A04) {
                r32.A0D();
                if (r32.A02 != null) {
                    r32.A0E();
                    r32.A02.A08();
                } else {
                    StringBuilder sb = new StringBuilder("statusplaybackvideo/no player for ");
                    sb.append(r32.A0G.A11);
                    Log.w(sb.toString());
                }
                DoodleView doodleView = r32.A0E;
                if (doodleView != null) {
                    doodleView.A0G.A0A = true;
                    SystemClock.elapsedRealtime();
                    doodleView.invalidate();
                }
                r32.A0G();
            }
        } else {
            (this instanceof C606534t ? ((C606534t) this).A06 : this instanceof C606734v ? ((C606734v) this).A0d : this instanceof C606634u ? ((C606634u) this).A07 : ((C606434s) this).A01).A01();
        }
    }

    public void A06(boolean z2) {
        if (this instanceof AnonymousClass34y) {
            ((AnonymousClass34y) this).A04 = z2;
        } else if (this instanceof C606934x) {
            C606934x r2 = (C606934x) this;
            r2.A04 = z2;
            C41811wh r1 = r2.A05.A00;
            if (r1.A05) {
                AnonymousClass29D r0 = r2.A02;
                if (z2) {
                    if (r0 != null) {
                        r0.A07();
                        Bitmap A052 = r2.A02.A05();
                        if (A052 != null) {
                            r2.A0F.A06(A052);
                            r2.A06 = true;
                        }
                    }
                    r2.A08.setVisibility(0);
                    r2.A0H();
                } else if (r0 == null) {
                    r2.A0E();
                    r2.A09();
                } else {
                    r2.A0E();
                    r1.A0D();
                }
            }
        }
    }

    public boolean A07() {
        if (this instanceof AnonymousClass34y) {
            AnonymousClass34y r0 = (AnonymousClass34y) this;
            return C31021dL.A02((C14710pd) null, r0.A04, r0.A09);
        } else if (this instanceof C606934x) {
            C606934x r02 = (C606934x) this;
            return C31021dL.A02(r02.A0C, r02.A04, r02.A0G);
        } else if (this instanceof C606534t) {
            C606534t r03 = (C606534t) this;
            return C31021dL.A02(r03.A04, r03.A04, r03.A05);
        } else if (this instanceof C606734v) {
            C606734v r04 = (C606734v) this;
            return C31021dL.A02((C14710pd) null, r04.A04, r04.A0c);
        } else if (!(this instanceof C606634u)) {
            return true;
        } else {
            C606634u r05 = (C606634u) this;
            return C31021dL.A02((C14710pd) null, r05.A04, r05.A06);
        }
    }

    public abstract long A08();

    public abstract void A09();

    public abstract void A0A();
}
