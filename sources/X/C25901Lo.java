package X;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import com.bloks.stdlib.components.bkcomponentsviewtagextension.BKBloksComponentsViewTagExtensionBinderUtil;
import com.facebook.redex.IDxDListenerShape57S0200000_2_I0;
import com.facebook.redex.IDxVPropertyShape2S0000000_I0;
import com.facebook.redex.RunnableRunnableShape1S0500000_I1;
import com.obwhatsapp.R;

/* renamed from: X.1Lo  reason: invalid class name and case insensitive filesystem */
public class C25901Lo {
    public static boolean A00(int i2) {
        switch (i2) {
            case 13313:
            case 13337:
            case 13566:
            case 13656:
            case 13688:
            case 13768:
            case 13774:
            case 13914:
            case 13981:
            case 14001:
            case 15833:
            case 16310:
            case 16515:
            case 16529:
                return true;
            default:
                return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b4, code lost:
        if (r1.endsWith("%") != false) goto L_0x00b6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object A01(X.C14990q7 r7, X.C31201dg r8) {
        /*
            r6 = this;
            int r3 = r8.A01
            boolean r0 = A00(r3)
            if (r0 == 0) goto L_0x0137
            r0 = 13337(0x3419, float:1.8689E-41)
            if (r3 != r0) goto L_0x0019
            r0 = 35
            java.lang.String r1 = r8.A0J(r0)
            r0 = 0
            X.3CU r4 = new X.3CU
            r4.<init>(r0, r1)
        L_0x0018:
            return r4
        L_0x0019:
            r0 = 13313(0x3401, float:1.8655E-41)
            if (r3 != r0) goto L_0x0023
            X.4Gn r4 = new X.4Gn
            r4.<init>()
            return r4
        L_0x0023:
            r0 = 14001(0x36b1, float:1.962E-41)
            if (r3 != r0) goto L_0x002d
            X.4Os r4 = new X.4Os
            r4.<init>()
            return r4
        L_0x002d:
            r0 = 13688(0x3578, float:1.9181E-41)
            if (r3 != r0) goto L_0x00ce
            java.lang.String r5 = "ViewTransformsExtensionBinderUtils"
            X.3EX r4 = new X.3EX
            r4.<init>()
            r0 = 141(0x8d, float:1.98E-43)
            r3 = 1065353216(0x3f800000, float:1.0)
            float r0 = r8.A08(r0, r3)
            r4.A00 = r0
            r0 = 38
            r2 = 0
            java.lang.String r0 = r8.A0J(r0)     // Catch:{ 40K -> 0x0064 }
            if (r0 != 0) goto L_0x004d
            r0 = 0
            goto L_0x0051
        L_0x004d:
            float r0 = X.C62163Bx.A01(r0)     // Catch:{ 40K -> 0x0064 }
        L_0x0051:
            r4.A06 = r0     // Catch:{ 40K -> 0x0064 }
            r0 = 40
            java.lang.String r0 = r8.A0J(r0)     // Catch:{ 40K -> 0x0064 }
            if (r0 != 0) goto L_0x005d
            r0 = 0
            goto L_0x0061
        L_0x005d:
            float r0 = X.C62163Bx.A01(r0)     // Catch:{ 40K -> 0x0064 }
        L_0x0061:
            r4.A07 = r0     // Catch:{ 40K -> 0x0064 }
            goto L_0x006a
        L_0x0064:
            r1 = move-exception
            java.lang.String r0 = "Could not parse translation value."
            X.C29691b2.A01(r5, r0, r1)
        L_0x006a:
            r0 = 35
            float r0 = r8.A08(r0, r3)
            r4.A04 = r0
            r0 = 36
            float r0 = r8.A08(r0, r3)
            r4.A05 = r0
            r0 = 138(0x8a, float:1.93E-43)
            float r0 = r8.A08(r0, r2)
            r4.A03 = r0
            r0 = 41
            java.lang.String r1 = r8.A0J(r0)     // Catch:{ 40K -> 0x00c7 }
            r0 = 42
            java.lang.String r3 = r8.A0J(r0)     // Catch:{ 40K -> 0x00c7 }
            if (r1 != 0) goto L_0x0092
            if (r3 == 0) goto L_0x0018
        L_0x0092:
            r2 = 1
            r4.A09 = r2     // Catch:{ 40K -> 0x00c7 }
            if (r1 != 0) goto L_0x009a
            r0 = 1112014848(0x42480000, float:50.0)
            goto L_0x009e
        L_0x009a:
            float r0 = X.C62163Bx.A01(r1)     // Catch:{ 40K -> 0x00c7 }
        L_0x009e:
            r4.A01 = r0     // Catch:{ 40K -> 0x00c7 }
            if (r3 != 0) goto L_0x00a5
            r0 = 1112014848(0x42480000, float:50.0)
            goto L_0x00a9
        L_0x00a5:
            float r0 = X.C62163Bx.A01(r3)     // Catch:{ 40K -> 0x00c7 }
        L_0x00a9:
            r4.A02 = r0     // Catch:{ 40K -> 0x00c7 }
            if (r1 == 0) goto L_0x00b6
            java.lang.String r0 = "%"
            boolean r1 = r1.endsWith(r0)     // Catch:{ 40K -> 0x00c7 }
            r0 = 0
            if (r1 == 0) goto L_0x00b7
        L_0x00b6:
            r0 = 1
        L_0x00b7:
            r4.A0A = r0     // Catch:{ 40K -> 0x00c7 }
            if (r3 == 0) goto L_0x00c4
            java.lang.String r0 = "%"
            boolean r0 = r3.endsWith(r0)     // Catch:{ 40K -> 0x00c7 }
            if (r0 != 0) goto L_0x00c4
            r2 = 0
        L_0x00c4:
            r4.A0B = r2     // Catch:{ 40K -> 0x00c7 }
            return r4
        L_0x00c7:
            r1 = move-exception
            java.lang.String r0 = "Could not parse pivot value."
            X.C29691b2.A01(r5, r0, r1)
            return r4
        L_0x00ce:
            r0 = 13656(0x3558, float:1.9136E-41)
            if (r3 == r0) goto L_0x0137
            r0 = 16529(0x4091, float:2.3162E-41)
            if (r3 != r0) goto L_0x00dc
            X.4Go r4 = new X.4Go
            r4.<init>()
            return r4
        L_0x00dc:
            r0 = 13566(0x34fe, float:1.901E-41)
            if (r3 == r0) goto L_0x0137
            r0 = 16310(0x3fb6, float:2.2855E-41)
            if (r3 != r0) goto L_0x00ea
            X.0Ps r4 = new X.0Ps
            r4.<init>(r7, r8)
            return r4
        L_0x00ea:
            r0 = 15833(0x3dd9, float:2.2187E-41)
            if (r3 == r0) goto L_0x0137
            r0 = 13774(0x35ce, float:1.9301E-41)
            if (r3 != r0) goto L_0x00f8
            X.0OE r4 = new X.0OE
            r4.<init>()
            return r4
        L_0x00f8:
            r0 = 13914(0x365a, float:1.9498E-41)
            if (r3 != r0) goto L_0x0102
            X.0Nf r4 = new X.0Nf
            r4.<init>()
            return r4
        L_0x0102:
            r0 = 13981(0x369d, float:1.9592E-41)
            if (r3 != r0) goto L_0x010c
            X.0Ng r4 = new X.0Ng
            r4.<init>()
            return r4
        L_0x010c:
            r0 = 13768(0x35c8, float:1.9293E-41)
            if (r3 != r0) goto L_0x0116
            X.0YO r4 = new X.0YO
            r4.<init>()
            return r4
        L_0x0116:
            r0 = 16515(0x4083, float:2.3142E-41)
            if (r3 != r0) goto L_0x0121
            com.bloks.stdlib.components.bkcomponentsviewtagextension.BKBloksComponentsViewTagExtensionBinderUtil r0 = com.bloks.stdlib.components.bkcomponentsviewtagextension.BKBloksComponentsViewTagExtensionBinderUtil.INSTANCE
            java.lang.Object r4 = r0.createController(r7, r8)
            return r4
        L_0x0121:
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r1 = 0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2[r1] = r0
            java.lang.String r0 = "No implementation bound to key: %s"
            java.lang.String r1 = java.lang.String.format(r0, r2)
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0137:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25901Lo.A01(X.0q7, X.1dg):java.lang.Object");
    }

    public void A02(C14990q7 r17, C31201dg r18, C31201dg r19, Object obj) {
        AnonymousClass3CP r0;
        String str;
        String str2;
        boolean z2;
        C31201dg r7 = r18;
        Object obj2 = obj;
        int i2 = r7.A01;
        if (A00(i2)) {
            View view = (View) obj2;
            C14990q7 r8 = r17;
            C31201dg r6 = r19;
            if (i2 == 13337) {
                EditText editText = (EditText) view;
                String A0J = r7.A0J(35);
                if (A0J != null) {
                    AnonymousClass3CU r2 = (AnonymousClass3CU) C62183Bz.A05(r8, r7);
                    r2.A00 = editText;
                    String str3 = r2.A02;
                    if (str3 == null || !str3.equals(A0J)) {
                        r2.A02 = A0J;
                        r2.A00();
                        EditText editText2 = r2.A00;
                        if (!(editText2 == null || editText2.getEditableText() == null)) {
                            r2.afterTextChanged(r2.A00.getEditableText());
                        }
                    }
                    AnonymousClass38S r1 = (AnonymousClass38S) C62183Bz.A05(r8, r6);
                    r1.A0M.A04.remove(r2);
                    r1.A0M.A04.add(r2);
                }
            } else if (i2 == 13313) {
                C83404Gn r12 = (C83404Gn) C62183Bz.A05(r8, r7);
                if (r12 != null) {
                    r12.A00 = Integer.valueOf(view.getImportantForAccessibility());
                    r12.A01 = view.isFocusable();
                    boolean z3 = false;
                    if (!r7.A0P(35, true)) {
                        view.setImportantForAccessibility(2);
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    String A0J2 = r7.A0J(36);
                    String A0J3 = r7.A0J(38);
                    if (!(A0J2 == null && A0J3 == null)) {
                        z3 = true;
                    }
                    if (z2 || z3) {
                        view.setImportantForAccessibility(1);
                        view.setFocusable(true);
                    }
                    C004601z.A0j(view, new AnonymousClass3P3(r7));
                    C89534cO.A02(r8, r6, r7.A0N(45));
                }
            } else if (i2 == 14001) {
                AnonymousClass3B4.A00(view, r8, r7, r6);
            } else {
                if (i2 == 13688) {
                    AnonymousClass3EX r3 = (AnonymousClass3EX) C62183Bz.A05(r8, r7);
                    if (r3 == null) {
                        str = "ViewTransformsExtensionBinderUtils";
                        str2 = "Null controller while binding ViewTransformsExtension";
                    } else {
                        r3.A08 = view;
                        view.setAlpha(r3.A00);
                        view.setRotation(r3.A03);
                        view.setScaleX(r3.A04);
                        view.setScaleY(r3.A05);
                        view.getViewTreeObserver().addOnPreDrawListener(new IDxDListenerShape57S0200000_2_I0(view, 0, r3));
                        return;
                    }
                } else if (i2 == 13656) {
                    C18450wi.A0H(view, 0);
                    C18450wi.A0H(r8, 1);
                    RunnableRunnableShape1S0500000_I1 runnableRunnableShape1S0500000_I1 = new RunnableRunnableShape1S0500000_I1(view, r6, r7, r8, r8.A01.get(R.id.bloks_surface_on_data_rendered_runnable), 0);
                    view.setTag(R.id.render_lifecycle_extension_runnable, runnableRunnableShape1S0500000_I1);
                    view.post(runnableRunnableShape1S0500000_I1);
                    return;
                } else if (i2 == 16529) {
                    C18450wi.A0H(view, 0);
                    C18450wi.A0H(r8, 1);
                    Object obj3 = r8.A01.get(R.id.bloks_surface_on_data_rendered_runnable);
                    Object A05 = C62183Bz.A05(r8, r7);
                    C18450wi.A0B(A05);
                    C83414Go r122 = (C83414Go) A05;
                    RunnableRunnableShape1S0500000_I1 runnableRunnableShape1S0500000_I12 = new RunnableRunnableShape1S0500000_I1(obj3, r6, r122, r8, r7, 1);
                    r122.A00 = runnableRunnableShape1S0500000_I12;
                    view.post(runnableRunnableShape1S0500000_I12);
                    return;
                } else if (i2 == 13566) {
                    view.setTag(R.id.testing_id_view_tag_key, r7.A0J(35));
                    return;
                } else if (i2 == 16310) {
                    C05210Ps r62 = (C05210Ps) C62183Bz.A05(r8, r7);
                    C04550Mz.A00.removeCallbacks(r62.A04);
                    Object obj4 = r7.A02.get(41);
                    boolean A0P = r7.A0P(42, true);
                    if ((r62.A01 || A0P) && !AnonymousClass45W.A00(obj4, r62.A00)) {
                        r62.A00();
                        C14930q1 A0H = r7.A0H(35);
                        if (A0H != null) {
                            C14940q2 r13 = new C14940q2();
                            r13.A02(r8, 0);
                            r13.A02(r62.A00, 1);
                            r13.A02(obj4, 2);
                            C29701b3.A01(r8, r7, new C14950q3(r13.A00), A0H);
                        }
                        r62.A00 = obj4;
                    }
                    r62.A01 = true;
                    return;
                } else if (i2 == 15833) {
                    C05080Pe r11 = new C05080Pe(view);
                    C02340Bf r9 = new C02340Bf(view, r11, r8, r7, r6);
                    Context context = r8.A00;
                    GestureDetector gestureDetector = new GestureDetector(context, r9);
                    ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, r9);
                    int i3 = Build.VERSION.SDK_INT;
                    if (i3 >= 19) {
                        scaleGestureDetector.setQuickScaleEnabled(false);
                        if (i3 >= 23) {
                            scaleGestureDetector.setStylusScaleEnabled(false);
                        }
                    }
                    view.setOnTouchListener(new C06940Yn(gestureDetector, scaleGestureDetector, r11, r9));
                    return;
                } else if (i2 == 13774) {
                    AnonymousClass0OE r32 = (AnonymousClass0OE) C62183Bz.A05(r8, r7);
                    if (r32 != null && r32.A00 == null) {
                        C07000Yt r22 = new C07000Yt(view.getRootView(), r32.A01);
                        r22.A03.add(new AnonymousClass0RG(r8, r7, r6));
                        r32.A00 = r22;
                        return;
                    }
                    return;
                } else if (i2 == 13914) {
                    C04610Nf r14 = (C04610Nf) C62183Bz.A05(r8, r7);
                    if (!r14.A00) {
                        r14.A00 = true;
                        C14930q1 A0H2 = r7.A0H(41);
                        if (A0H2 != null) {
                            C14940q2 r02 = new C14940q2();
                            r02.A03(r6, 0);
                            r02.A03(r8, 1);
                            C29701b3.A01(r8, r7, new C14950q3(r02.A00), A0H2);
                        }
                    }
                    C14930q1 A0H3 = r7.A0H(42);
                    if (A0H3 != null) {
                        C14940q2 r03 = new C14940q2();
                        r03.A03(r6, 0);
                        r03.A03(r8, 1);
                        C29701b3.A01(r8, r7, new C14950q3(r03.A00), A0H3);
                        return;
                    }
                    return;
                } else if (i2 == 13981) {
                    view.setOnTouchListener(new C06950Yo(r8, r7, r6));
                    return;
                } else if (i2 == 13768) {
                    if (view instanceof EditText) {
                        EditText editText3 = (EditText) view;
                        C14930q1 A0H4 = r7.A0H(35);
                        if (r6.A01 == 13336 && A0H4 != null) {
                            C10480hC r92 = new C10480hC(editText3, r8, (AnonymousClass38S) C62183Bz.A05(r8, r6), r6, A0H4);
                            Thread currentThread = Thread.currentThread();
                            Handler handler = AnonymousClass0N0.A00;
                            if (currentThread == handler.getLooper().getThread()) {
                                r92.run();
                            } else {
                                handler.post(r92);
                            }
                        }
                        C14930q1 A0H5 = r7.A0H(36);
                        if (A0H5 != null) {
                            AnonymousClass0YO r23 = (AnonymousClass0YO) C62183Bz.A05(r8, r7);
                            if (r23 == null) {
                                str = "TextInputFormatterExtensionUtils";
                                str2 = "Unexpected null ExpressionMask in TextInputFormatterExtension";
                            } else {
                                r23.A02 = r6;
                                r23.A00 = editText3;
                                r23.A03 = A0H5;
                                r23.A01 = r8;
                                AnonymousClass38S r15 = (AnonymousClass38S) C62183Bz.A05(r8, r6);
                                if (r15 != null && (r0 = r15.A0M) != null) {
                                    r0.A04.remove(r23);
                                    r15.A0M.A04.add(r23);
                                    return;
                                }
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("Text Input Formatter extension attached to non-text-input component with style ID: ");
                        sb.append(r6.A01);
                        throw new IllegalStateException(sb.toString());
                    }
                } else if (i2 == 16515) {
                    BKBloksComponentsViewTagExtensionBinderUtil.INSTANCE.bind(view, r8, r7, r6);
                    return;
                } else {
                    throw new IllegalArgumentException(String.format("No implementation bound to key: %s", new Object[]{Integer.valueOf(i2)}));
                }
                C29691b2.A00(str, str2);
            }
        }
    }

    public void A03(C14990q7 r6, C31201dg r7, C31201dg r8, Object obj) {
        AnonymousClass3CP r0;
        Runnable runnable;
        int i2 = r7.A01;
        if (A00(i2)) {
            View view = (View) obj;
            if (i2 == 13337) {
                if (r7.A0J(35) != null) {
                    AnonymousClass3CU r1 = (AnonymousClass3CU) C62183Bz.A05(r6, r7);
                    r1.A00 = null;
                    ((AnonymousClass38S) C62183Bz.A05(r6, r8)).A0M.A04.remove(r1);
                }
            } else if (i2 == 13313) {
                C83404Gn r12 = (C83404Gn) C62183Bz.A05(r6, r7);
                if (r12 != null) {
                    C004601z.A0j(view, (AnonymousClass05M) null);
                    view.setImportantForAccessibility(r12.A00.intValue());
                    view.setFocusable(r12.A01);
                    C89534cO.A01(r6, r8, r7.A0N(45));
                }
            } else if (i2 == 14001) {
                C85504Os r4 = (C85504Os) C62183Bz.A05(r6, r7);
                if (r4 != null) {
                    C004601z.A0j(view, (AnonymousClass05M) null);
                    view.setContentDescription(r4.A03);
                    view.setImportantForAccessibility(r4.A00.intValue());
                    C004601z.A0c(view, r4.A01.intValue());
                    view.setFocusable(r4.A05);
                    view.setSelected(r4.A08);
                    view.setEnabled(r4.A04);
                    C004601z.A0o(view, r4.A06);
                    new IDxVPropertyShape2S0000000_I0(0).A02(view, Boolean.valueOf(r4.A07));
                    if (r4.A09) {
                        view.setOnClickListener((View.OnClickListener) null);
                    }
                    if (r4.A0A) {
                        view.setOnClickListener((View.OnClickListener) null);
                    }
                    C89534cO.A01(r6, r8, r7.A0N(56));
                    C004601z.A0e(view, -1);
                }
            } else if (i2 == 13688) {
                AnonymousClass3EX r2 = (AnonymousClass3EX) C62183Bz.A05(r6, r7);
                if (r2 == null) {
                    C29691b2.A00("ViewTransformsExtensionBinderUtils", "Null controller while binding ViewTransformsExtension");
                    return;
                }
                r2.A08 = null;
                view.setAlpha(1.0f);
                view.setRotation(0.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                view.setScaleX(1.0f);
                view.setScaleY(1.0f);
                if (!r2.A09) {
                    return;
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    view.resetPivot();
                    return;
                }
                view.setPivotX((((float) view.getWidth()) * 50.0f) / 100.0f);
                view.setPivotY((((float) view.getHeight()) * 50.0f) / 100.0f);
            } else {
                if (i2 == 13656) {
                    C18450wi.A0H(view, 0);
                    runnable = (Runnable) view.getTag(R.id.render_lifecycle_extension_runnable);
                } else if (i2 == 16529) {
                    C18450wi.A0H(view, 0);
                    C18450wi.A0H(r6, 1);
                    Object A05 = C62183Bz.A05(r6, r7);
                    C18450wi.A0B(A05);
                    runnable = ((C83414Go) A05).A00;
                } else if (i2 == 13566) {
                    view.setTag(R.id.testing_id_view_tag_key, (Object) null);
                    return;
                } else if (i2 == 16310) {
                    C04550Mz.A00.post(((C05210Ps) C62183Bz.A05(r6, r7)).A04);
                    return;
                } else {
                    if (i2 != 15833) {
                        if (i2 == 13774) {
                            AnonymousClass0OE r22 = (AnonymousClass0OE) C62183Bz.A05(r6, r7);
                            if (r22 != null) {
                                C07000Yt r13 = r22.A00;
                                if (r13 == null) {
                                    r22.A01 = false;
                                    return;
                                }
                                r22.A01 = r13.A00;
                                r13.A03.clear();
                                ViewTreeObserver viewTreeObserver = r13.A02.getViewTreeObserver();
                                if (viewTreeObserver != null) {
                                    viewTreeObserver.removeOnGlobalLayoutListener(r13);
                                }
                                r22.A00 = null;
                                return;
                            }
                            return;
                        } else if (i2 == 13914) {
                            C14930q1 A0H = r7.A0H(43);
                            if (A0H != null) {
                                C14940q2 r14 = new C14940q2();
                                r14.A03(r8, 0);
                                C29701b3.A01(r6, r7, new C14950q3(r14.A00), A0H);
                                return;
                            }
                            return;
                        } else if (i2 != 13981) {
                            if (i2 == 13768) {
                                AnonymousClass0YO r15 = (AnonymousClass0YO) C62183Bz.A05(r6, r7);
                                if (r15 != null) {
                                    AnonymousClass38S r02 = (AnonymousClass38S) C62183Bz.A05(r6, r8);
                                    if (!(r02 == null || (r0 = r02.A0M) == null)) {
                                        r0.A04.remove(r15);
                                    }
                                    r15.A02 = null;
                                    r15.A00 = null;
                                    r15.A03 = null;
                                    r15.A01 = null;
                                    return;
                                }
                                return;
                            } else if (i2 == 16515) {
                                BKBloksComponentsViewTagExtensionBinderUtil.INSTANCE.unbind(view, r6, r7, r8);
                                return;
                            } else {
                                throw new IllegalArgumentException(String.format("No implementation bound to key: %s", new Object[]{Integer.valueOf(i2)}));
                            }
                        }
                    }
                    view.setOnTouchListener((View.OnTouchListener) null);
                    return;
                }
                if (runnable != null) {
                    view.removeCallbacks(runnable);
                }
            }
        }
    }
}
