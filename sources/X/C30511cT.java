package X;

import android.animation.LayoutTransition;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.redex.IDxConsumerShape209S0100000_2_I0;
import com.facebook.redex.IDxLListenerShape4S0201000_2_I0;
import com.facebook.redex.RunnableRunnableShape0S0400000_I0;
import com.facebook.redex.RunnableRunnableShape7S0100000_I0_6;
import com.facebook.redex.ViewOnClickCListenerShape9S0100000_I0_2;
import com.obwhatsapp.IDxLAdapterShape51S0100000_2_I0;
import com.obwhatsapp.R;
import com.obwhatsapp.WaImageView;
import com.obwhatsapp.biz.IDxPObserverShape57S0100000_2_I0;
import com.obwhatsapp.chat.IDxSObserverShape63S0100000_2_I0;
import com.obwhatsapp.contact.IDxCObserverShape68S0100000_2_I0;
import com.obwhatsapp.group.IDxPObserverShape81S0100000_2_I0;
import com.obwhatsapp.yo.yo;
import java.util.List;

/* renamed from: X.1cT  reason: invalid class name and case insensitive filesystem */
public abstract class C30511cT extends C19530ya {
    public View A00;
    public View A01;
    public View A02;
    public ViewGroup A03;
    public ViewGroup A04;
    public ViewStub A05;
    public ImageView A06;
    public ProgressBar A07;
    public TextView A08;
    public TextView A09;
    public RunnableRunnableShape0S0400000_I0 A0A;
    public C30521cU A0B;
    public C30521cU A0C;
    public WaImageView A0D;
    public AnonymousClass36T A0E;
    public C49702Ve A0F;
    public C16010sH A0G;
    public boolean A0H;
    public boolean A0I = false;
    public final View.OnClickListener A0J = new ViewOnClickCListenerShape9S0100000_I0_2(this, 29);
    public final C000900k A0K;
    public final C25731Kx A0L;
    public final C14870pt A0M;
    public final C16040sK A0N;
    public final C54602hp A0O;
    public final C439822h A0P = new IDxPObserverShape57S0100000_2_I0(this, 3);
    public final AnonymousClass13V A0Q;
    public final C40781ug A0R = new IDxSObserverShape63S0100000_2_I0(this, 9);
    public final AnonymousClass127 A0S;
    public final C17160ud A0T;
    public final C33481ie A0U = new IDxCObserverShape68S0100000_2_I0(this, 13);
    public final C17140ub A0V;
    public final C16080sP A0W;
    public final AnonymousClass152 A0X;
    public final AnonymousClass013 A0Y;
    public final C20070zS A0Z;
    public final C15810rt A0a;
    public final C216114t A0b;
    public final C17250um A0c;
    public final C14710pd A0d;
    public final C17240ul A0e;
    public final AnonymousClass1VD A0f = new IDxPObserverShape81S0100000_2_I0(this, 11);
    public final AnonymousClass18R A0g;
    public final C15830rv A0h;
    public final C25781Lc A0i;
    public final C16320sq A0j;

    public C30511cT(C000900k r3, C25731Kx r4, C14870pt r5, C16040sK r6, C54602hp r7, AnonymousClass13V r8, AnonymousClass127 r9, C17160ud r10, C17140ub r11, C16080sP r12, AnonymousClass152 r13, AnonymousClass013 r14, C20070zS r15, C15810rt r16, C216114t r17, C16010sH r18, C17250um r19, C14710pd r20, C17240ul r21, AnonymousClass18R r22, C15830rv r23, C25781Lc r24, C16320sq r25) {
        this.A0K = r3;
        this.A0d = r20;
        this.A0M = r5;
        this.A0N = r6;
        this.A0j = r25;
        this.A0a = r16;
        this.A0c = r19;
        this.A0T = r10;
        this.A0L = r4;
        this.A0W = r12;
        this.A0Y = r14;
        this.A0O = r7;
        this.A0V = r11;
        this.A0e = r21;
        this.A0i = r24;
        this.A0S = r9;
        this.A0Q = r8;
        this.A0X = r13;
        this.A0b = r17;
        this.A0g = r22;
        this.A0h = r23;
        this.A0G = r18;
        this.A0Z = r15;
    }

    public static /* synthetic */ boolean A02(C30511cT r0, C15830rv r1) {
        return r1 != null && r1.equals(r0.A0h);
    }

    public ViewGroup A03(Context context) {
        return (ViewGroup) LayoutInflater.from(context).inflate(yo.cen(R.layout.layout014f), (ViewGroup) null, false);
    }

    public void A04() {
        C16010sH A012 = this.A0b.A01(this.A0h);
        this.A0G = A012;
        if (!this.A0N.A0I(A012.A0E) || !this.A0d.A0E(C16620tM.A02, 1967)) {
            this.A0C.A0A(this.A0G);
        } else {
            this.A0C.A0C(this.A0G, (AnonymousClass2TP) null, (List) null, 1.0f);
        }
        TextView textView = (TextView) this.A03.findViewById(R.id.conversation_contact_name);
        WaImageView waImageView = this.A0D;
        if (waImageView != null && waImageView.getVisibility() == 0 && textView != null && !TextUtils.isEmpty(textView.getText())) {
            textView.setContentDescription(textView.getContext().getString(R.string.str1795, new Object[]{textView.getText()}));
        }
        AnonymousClass36T r0 = this.A0E;
        if (r0 != null) {
            r0.A06(true);
        }
        A06();
        A05();
    }

    public void A05() {
        String str;
        int i2;
        TextView textView;
        Context applicationContext;
        int i3;
        TextView textView2;
        int i4;
        if (this instanceof AnonymousClass30C) {
            AnonymousClass30C r2 = (AnonymousClass30C) this;
            String str2 = r2.A00.A01;
            if (str2 != null) {
                r2.A09.setText(str2);
                r2.A09.setEllipsize(TextUtils.TruncateAt.END);
            }
        } else if (this instanceof C48962Qc) {
            C48962Qc r22 = (C48962Qc) this;
            C25731Kx r9 = r22.A0L;
            String A012 = r9.A01(r22.A0G);
            C16010sH r8 = r22.A0G;
            boolean z2 = r8.A0a;
            if (z2 || A012 == null) {
                if (r22.A0F == null) {
                    return;
                }
                if (System.currentTimeMillis() - r22.A01 >= 5000) {
                    A012 = r9.A01(r8);
                    C16010sH r3 = r22.A0G;
                    if (r3.A0a) {
                        textView2 = r22.A09;
                        i4 = R.string.str1b98;
                    } else if (A012 == null) {
                        if (!r3.A0Y || r22.A00 == 3) {
                            C51312bQ r5 = r22.A0G;
                            if (r5.A01 == null) {
                                return;
                            }
                            if (r22.A00 != 3 || r22.A0N.A00(r3) || r22.A0K.A03(r3) == 1) {
                                C17240ul r4 = r22.A0K;
                                if (!r4.A0f(r22.A0G)) {
                                    C16010sH r32 = r22.A0G;
                                    if (!r22.A0N.A00(r32) && r4.A03(r32) != 1) {
                                        r22.A09.setText(r5.A01);
                                        r22.A09.setEllipsize(TextUtils.TruncateAt.END);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            r22.A0j.Acl(new RunnableRunnableShape7S0100000_I0_6(r22, 25));
                            return;
                        }
                        textView2 = r22.A09;
                        i4 = R.string.str0e8f;
                    }
                    textView2.setText(i4);
                    return;
                }
                if (z2) {
                    textView = r22.A09;
                    applicationContext = r22.A0K.getApplicationContext();
                    i3 = R.string.str1b98;
                } else {
                    C17230uk r33 = r22.A0B;
                    if (r33.A0A() && r22.A00 == 3) {
                        textView = r22.A09;
                        applicationContext = r22.A0K.getApplicationContext();
                        i3 = R.string.str04d7;
                    } else if (r33.A0A() && r22.A00 == 2) {
                        r22.A09.setText("");
                        if (r33.A0E(r22.A0O, r22.A00)) {
                            r22.A0C(new IDxConsumerShape209S0100000_2_I0(r22, 4));
                            return;
                        }
                        return;
                    } else if (!r22.A0G.A0Y || !r22.A0J.A0A(r22.A0O)) {
                        textView = r22.A09;
                        applicationContext = r22.A0K.getApplicationContext();
                        i3 = R.string.str1784;
                    } else {
                        textView = r22.A09;
                        applicationContext = r22.A0K.getApplicationContext();
                        i3 = R.string.str0e8f;
                    }
                }
                textView.setText(applicationContext.getString(i3));
                return;
            }
            r22.A09.setText(A012);
        } else {
            C30501cS r23 = (C30501cS) this;
            r23.A0B();
            if (r23.A0F == null) {
                r23.A06 = true;
                return;
            }
            r23.A06 = false;
            C16080sP r6 = r23.A0W;
            if (r6.A0R(r23.A0G) || r23.A0G.A0D == null) {
                r23.A0C.A07(r23.A0G.A0K() ? 1 : 0);
            }
            Pair A0A2 = r23.A0A();
            boolean z3 = true;
            if (((Number) A0A2.first).intValue() == 1) {
                String str3 = (String) A0A2.second;
                r23.A01.setVisibility(8);
                r23.A02.setVisibility(0);
                r23.A09.setVisibility(0);
                int width = r23.A02.getWidth();
                float measureText = r23.A09.getPaint().measureText(str3);
                float f2 = (float) width;
                if (measureText <= f2 || r23.A0H) {
                    r23.A09.setText(str3);
                } else {
                    r23.A0H = true;
                    r23.A09.setText(str3);
                    if (!r23.A0Y.A0T()) {
                        f2 = -measureText;
                    }
                    TranslateAnimation translateAnimation = new TranslateAnimation(0, 0.0f, 0, f2, 0, 0.0f, 0, 0.0f);
                    translateAnimation.setDuration(3000);
                    translateAnimation.setStartOffset(1000);
                    translateAnimation.setAnimationListener(new IDxLAdapterShape51S0100000_2_I0(r23, 9));
                    ViewGroup.LayoutParams layoutParams = r23.A09.getLayoutParams();
                    layoutParams.width = (int) measureText;
                    r23.A09.setLayoutParams(layoutParams);
                    r23.A09.startAnimation(translateAnimation);
                }
                r23.A03.A05(r23.A0G);
                return;
            }
            boolean A092 = r23.A09();
            if (A092) {
                r23.A0B.A0E(AnonymousClass2Sy.A03(r23.A0K.getApplicationContext(), r23.A0B.A02.getPaint(), r23.A0c, r23.A0G.A0B()));
                if (r23.A0G.A0F()) {
                    r23.A0B.A07(1);
                }
            }
            if (!r23.A07.A0I(r23.A0G.A0E) || !r23.A0d.A0E(C16620tM.A02, 1967)) {
                str = (String) A0A2.second;
                if (!AnonymousClass1ZW.A0E(str)) {
                    r23.A02.setVisibility(0);
                    r23.A09.setVisibility(0);
                    TextView textView3 = r23.A08;
                    int i5 = 8;
                    if (A092) {
                        i5 = 0;
                    }
                    textView3.setVisibility(i5);
                    View view = r23.A01;
                    int i6 = 8;
                    if (A092) {
                        i6 = 0;
                    }
                    view.setVisibility(i6);
                    int width2 = r23.A02.getWidth();
                    if (!A092 || width2 == 0) {
                        i2 = width2;
                    } else {
                        int ceil = ((int) Math.ceil((double) r23.A08.getPaint().measureText("•"))) + r23.A08.getPaddingLeft() + r23.A08.getPaddingRight();
                        C000900k r10 = r23.A0K;
                        i2 = width2 - (((((int) Math.ceil((double) r23.A0B.A02.getPaint().measureText(r23.A0G.A0B()))) + r10.getResources().getDrawable(R.drawable.ic_verified).getIntrinsicWidth()) + r10.getResources().getDimensionPixelSize(R.dimen.dimen0807)) + ceil);
                    }
                    float measureText2 = r23.A09.getPaint().measureText(str);
                    if (i2 == 0 || measureText2 <= ((float) i2)) {
                        RunnableRunnableShape0S0400000_I0 runnableRunnableShape0S0400000_I0 = r23.A0A;
                        if (runnableRunnableShape0S0400000_I0 != null) {
                            r23.A0M.A0J(runnableRunnableShape0S0400000_I0);
                        }
                    } else if (r23.A0A == null) {
                        r23.A09.setText(str);
                        RunnableRunnableShape0S0400000_I0 runnableRunnableShape0S0400000_I02 = new RunnableRunnableShape0S0400000_I0(r23.A0L, r23, r23.A0Y, r6, 17);
                        r23.A0A = runnableRunnableShape0S0400000_I02;
                        r23.A0M.A0L(runnableRunnableShape0S0400000_I02, 1500);
                        return;
                    } else if (r23.A0I) {
                        if (measureText2 <= ((float) width2)) {
                            r23.A09.setText(str);
                        } else {
                            String A022 = r23.A0L.A02(r23.A0G);
                            if (A022 != null) {
                                z3 = false;
                            }
                            TextView textView4 = r23.A09;
                            if (z3) {
                                A022 = str;
                            }
                            textView4.setText(A022);
                        }
                        r23.A01.setVisibility(8);
                        return;
                    }
                } else {
                    r23.A09.setVisibility(8);
                    r23.A08.setVisibility(8);
                    View view2 = r23.A02;
                    if (A092) {
                        view2.setVisibility(0);
                        r23.A01.setVisibility(0);
                    } else {
                        view2.setVisibility(8);
                    }
                    RunnableRunnableShape0S0400000_I0 runnableRunnableShape0S0400000_I03 = r23.A0A;
                    if (runnableRunnableShape0S0400000_I03 != null) {
                        r23.A0M.A0J(runnableRunnableShape0S0400000_I03);
                        return;
                    }
                    return;
                }
            } else {
                str = r23.A0K.getApplicationContext().getString(R.string.str0d61);
                r23.A02.setVisibility(0);
                r23.A09.setVisibility(0);
            }
            r23.A09.setText(str);
        }
    }

    public void A06() {
        this.A06.setVisibility(0);
        C17160ud r4 = this.A0T;
        C17240ul r7 = this.A0e;
        AnonymousClass36T r2 = new AnonymousClass36T(this.A06, r4, this.A0X, this.A0G, r7);
        this.A0E = r2;
        this.A0j.Ack(r2, new Void[0]);
    }

    public void A07(Activity activity) {
        C000900k r2 = this.A0K;
        C005402i x2 = r2.x();
        AnonymousClass00B.A06(x2);
        ViewGroup A032 = A03(x2.A02());
        this.A03 = A032;
        View A0E2 = C004601z.A0E(A032, R.id.back);
        this.A00 = A0E2;
        AnonymousClass2JP.A02(A0E2);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 > 21) {
            int paddingLeft = this.A00.getPaddingLeft();
            int paddingRight = this.A00.getPaddingRight();
            View view = this.A00;
            AnonymousClass013 r4 = this.A0Y;
            C005402i x3 = r2.x();
            AnonymousClass00B.A06(x3);
            view.setBackground(new C447725m(AnonymousClass00T.A04(x3.A02(), R.drawable.conversation_navigate_up_background), r4));
            C45902Bo.A08(this.A00, r4, paddingLeft, paddingRight);
        }
        this.A00.setOnClickListener(this.A0J);
        this.A04 = (ViewGroup) this.A03.findViewById(R.id.conversation_contact);
        this.A0D = (WaImageView) C004601z.A0E(this.A03, R.id.ephemeral_status);
        ViewGroup viewGroup = this.A04;
        C16080sP r5 = this.A0W;
        C25781Lc r7 = this.A0i;
        AnonymousClass013 r6 = this.A0Y;
        C30521cU r3 = new C30521cU((View) viewGroup, r5, r6, r7, (int) R.id.conversation_contact_name);
        this.A0C = r3;
        r3.A02.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape4S0201000_2_I0(this, 0));
        View findViewById = this.A04.findViewById(R.id.conversation_contact_status_holder);
        this.A02 = findViewById;
        findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new IDxLListenerShape4S0201000_2_I0(this, 1));
        this.A01 = this.A04.findViewById(R.id.business_holder);
        this.A09 = (TextView) this.A04.findViewById(R.id.conversation_contact_status);
        this.A0B = new C30521cU(this.A02, r5, r6, r7, (int) R.id.business_name);
        this.A08 = (TextView) this.A04.findViewById(R.id.business_separator);
        this.A06 = (ImageView) this.A03.findViewById(R.id.conversation_contact_photo);
        if (r6.A0T() && i2 < 19) {
            this.A04.setLayoutTransition((LayoutTransition) null);
        }
        this.A04.setClickable(true);
        this.A05 = (ViewStub) this.A03.findViewById(R.id.change_photo_progress_stub);
        C005402i x4 = r2.x();
        AnonymousClass00B.A06(x4);
        x4.A0O(true);
        C005402i x5 = r2.x();
        AnonymousClass00B.A06(x5);
        x5.A0G(this.A03);
    }

    public void A08(boolean z2) {
        boolean z3 = this instanceof C48962Qc;
        ViewGroup viewGroup = this.A03;
        if (z3) {
            View A0E2 = C004601z.A0E(viewGroup, R.id.back);
            int i2 = 8;
            if (z2) {
                i2 = 0;
            }
            A0E2.setVisibility(i2);
            return;
        }
        View A0E3 = C004601z.A0E(viewGroup, R.id.whatsapp_toolbar_home);
        int i3 = 8;
        if (z2) {
            i3 = 0;
        }
        A0E3.setVisibility(i3);
        this.A00.setOnClickListener(z2 ? this.A0J : null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0016, code lost:
        r1 = r1.A06;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A09() {
        /*
            r4 = this;
            X.0sP r3 = r4.A0W
            X.0sH r0 = r4.A0G
            boolean r2 = r3.A0Q(r0)
            X.0sH r1 = r4.A0G
            X.1ko r0 = r1.A0D
            if (r0 == 0) goto L_0x0027
            if (r2 == 0) goto L_0x0029
            boolean r0 = r1.A0H()
            if (r0 == 0) goto L_0x0027
            int r1 = r1.A06
            r0 = 2
            if (r1 == r0) goto L_0x001e
            r0 = 3
            if (r1 != r0) goto L_0x0027
        L_0x001e:
            X.0sH r0 = r4.A0G
            boolean r1 = r3.A0R(r0)
            r0 = 1
            if (r1 == 0) goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            return r0
        L_0x0029:
            boolean r0 = r1.A0F()
            if (r0 == 0) goto L_0x0027
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30511cT.A09():boolean");
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.A0G = this.A0b.A01(this.A0h);
        A07(activity);
        this.A0V.A02(this.A0U);
        this.A0S.A02(this.A0R);
        this.A0Q.A02(this.A0P);
        this.A0g.A02(this.A0f);
    }

    public void onActivityDestroyed(Activity activity) {
        AnonymousClass36T r1 = this.A0E;
        if (r1 != null) {
            r1.A06(true);
            this.A0E = null;
        }
        this.A0V.A03(this.A0U);
        this.A0S.A03(this.A0R);
        this.A0Q.A03(this.A0P);
        this.A0g.A03(this.A0f);
    }

    public void onActivityResumed(Activity activity) {
        A04();
        this.A09.setSelected(true);
    }
}
