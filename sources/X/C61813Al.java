package X;

import android.content.Context;
import android.view.View;
import com.facebook.rendercore.RenderTreeNode;
import java.util.List;

/* renamed from: X.3Al  reason: invalid class name and case insensitive filesystem */
public class C61813Al {
    public AnonymousClass3AI A00;
    public boolean A01;
    public boolean A02;
    public final Context A03;
    public final AnonymousClass03G A04 = new AnonymousClass03G();
    public final C49842Wd A05;
    public final AnonymousClass4VL A06;

    public C61813Al(C49842Wd r3) {
        AnonymousClass4VL r1 = C89644cb.A00;
        this.A03 = r3.getContext();
        this.A05 = r3;
        this.A06 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0045, code lost:
        if (r15 == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        if (r14.getBottom() == r1) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass4VL r12, com.facebook.rendercore.RenderTreeNode r13, java.lang.Object r14, boolean r15) {
        /*
            android.graphics.Rect r0 = r13.A04
            android.graphics.Rect r9 = r13.A05
            int r4 = r0.left
            int r3 = r0.top
            int r2 = r0.right
            int r1 = r0.bottom
            boolean r0 = r12.A02()
            r11 = 0
            if (r0 == 0) goto L_0x0019
            r11 = 1
            java.lang.String r0 = "applyBoundsToMountContent"
            r12.A01(r0)
        L_0x0019:
            boolean r0 = r14 instanceof android.view.View     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x0063
            android.view.View r14 = (android.view.View) r14     // Catch:{ all -> 0x008f }
            int r10 = r2 - r4
            int r8 = r1 - r3
            if (r9 == 0) goto L_0x0034
            boolean r0 = r14 instanceof X.C49842Wd     // Catch:{ all -> 0x008f }
            if (r0 != 0) goto L_0x0034
            int r7 = r9.left     // Catch:{ all -> 0x008f }
            int r6 = r9.top     // Catch:{ all -> 0x008f }
            int r5 = r9.right     // Catch:{ all -> 0x008f }
            int r0 = r9.bottom     // Catch:{ all -> 0x008f }
            r14.setPadding(r7, r6, r5, r0)     // Catch:{ all -> 0x008f }
        L_0x0034:
            if (r15 != 0) goto L_0x0042
            int r0 = r14.getMeasuredHeight()     // Catch:{ all -> 0x008f }
            if (r0 != r8) goto L_0x0042
            int r0 = r14.getMeasuredWidth()     // Catch:{ all -> 0x008f }
            if (r0 == r10) goto L_0x0047
        L_0x0042:
            X.C13690nt.A12(r14, r10, r8)     // Catch:{ all -> 0x008f }
            if (r15 != 0) goto L_0x005f
        L_0x0047:
            int r0 = r14.getLeft()     // Catch:{ all -> 0x008f }
            if (r0 != r4) goto L_0x005f
            int r0 = r14.getTop()     // Catch:{ all -> 0x008f }
            if (r0 != r3) goto L_0x005f
            int r0 = r14.getRight()     // Catch:{ all -> 0x008f }
            if (r0 != r2) goto L_0x005f
            int r0 = r14.getBottom()     // Catch:{ all -> 0x008f }
            if (r0 == r1) goto L_0x007a
        L_0x005f:
            r14.layout(r4, r3, r2, r1)     // Catch:{ all -> 0x008f }
            goto L_0x007a
        L_0x0063:
            boolean r0 = r14 instanceof android.graphics.drawable.Drawable     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x0080
            if (r9 == 0) goto L_0x0075
            int r0 = r9.left     // Catch:{ all -> 0x008f }
            int r4 = r4 + r0
            int r0 = r9.top     // Catch:{ all -> 0x008f }
            int r3 = r3 + r0
            int r0 = r9.right     // Catch:{ all -> 0x008f }
            int r2 = r2 - r0
            int r0 = r9.bottom     // Catch:{ all -> 0x008f }
            int r1 = r1 - r0
        L_0x0075:
            android.graphics.drawable.Drawable r14 = (android.graphics.drawable.Drawable) r14     // Catch:{ all -> 0x008f }
            r14.setBounds(r4, r3, r2, r1)     // Catch:{ all -> 0x008f }
        L_0x007a:
            if (r11 == 0) goto L_0x007f
            r12.A00()
        L_0x007f:
            return
        L_0x0080:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x008f }
            java.lang.String r0 = "Unsupported mounted content "
            java.lang.String r0 = X.AnonymousClass000.A0e(r14, r0, r1)     // Catch:{ all -> 0x008f }
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)     // Catch:{ all -> 0x008f }
            throw r0     // Catch:{ all -> 0x008f }
        L_0x008f:
            r0 = move-exception
            if (r11 == 0) goto L_0x0095
            r12.A00()
        L_0x0095:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61813Al.A00(X.4VL, com.facebook.rendercore.RenderTreeNode, java.lang.Object, boolean):void");
    }

    public void A01() {
        if (this.A00 != null) {
            AnonymousClass4VL r6 = this.A06;
            boolean A022 = r6.A02();
            if (A022) {
                r6.A01("MountState.bind");
            }
            for (RenderTreeNode renderTreeNode : this.A00.A04) {
                AnonymousClass4LN r1 = (AnonymousClass4LN) this.A04.A04(renderTreeNode.A07.A03(), (Object) null);
                if (r1 != null && !r1.A03) {
                    Object obj = r1.A02;
                    A05(r1);
                    if ((obj instanceof View) && !(obj instanceof C49842Wd)) {
                        View view = (View) obj;
                        if (view.isLayoutRequested()) {
                            A00(r6, r1.A01, view, true);
                        }
                    }
                }
            }
            if (A022) {
                r6.A00();
            }
        }
    }

    public void A02() {
        if (this.A00 != null) {
            AnonymousClass4VL r5 = this.A06;
            boolean A022 = r5.A02();
            if (A022) {
                r5.A01("MountState.unbind");
                r5.A01("MountState.unbindAllContent");
            }
            for (RenderTreeNode renderTreeNode : this.A00.A04) {
                AnonymousClass4LN r1 = (AnonymousClass4LN) this.A04.A04(renderTreeNode.A07.A03(), (Object) null);
                if (r1 != null && r1.A03) {
                    A06(r1);
                }
            }
            if (A022) {
                r5.A00();
                r5.A01("MountState.unbindExtensions");
                r5.A00();
                r5.A00();
            }
        }
    }

    public void A03() {
        if (this.A00 != null) {
            AnonymousClass4VL r3 = this.A06;
            boolean A022 = r3.A02();
            if (A022) {
                r3.A01("MountState.unmountAllItems");
            }
            A04(0);
            if (A022) {
                r3.A00();
            }
            this.A02 = true;
        }
    }

    public final void A04(long j2) {
        String obj;
        AnonymousClass03G r10 = this.A04;
        AnonymousClass4LN r7 = (AnonymousClass4LN) r10.A04(j2, (Object) null);
        if (r7 != null) {
            AnonymousClass4VL r5 = this.A06;
            boolean A022 = r5.A02();
            RenderTreeNode renderTreeNode = r7.A01;
            AnonymousClass3BJ r6 = renderTreeNode.A07;
            Object obj2 = r7.A02;
            if (A022) {
                r5.A01(AnonymousClass000.A0h(r6.A04(), AnonymousClass000.A0r("UnmountItem: ")));
            }
            List list = renderTreeNode.A00;
            if (list != null && list.size() > 0) {
                List list2 = renderTreeNode.A00;
                if (list2 != null) {
                    for (int A002 = C13700nu.A00(list2, 1); A002 >= 0; A002--) {
                        A04(((RenderTreeNode) renderTreeNode.A00.get(A002)).A07.A03());
                    }
                }
                if (((C49842Wd) obj2).getMountItemCount() > 0) {
                    throw AnonymousClass000.A0V("Recursively unmounting items from a ComponentHost, left some items behind maybe because not tracked by its MountState");
                }
            }
            long A032 = r6.A03();
            if (A032 == 0) {
                AnonymousClass4LN r3 = (AnonymousClass4LN) r10.A04(0, (Object) null);
                if (r3 != null) {
                    if (r3.A03) {
                        A06(r3);
                    }
                    r10.A07(0);
                    RenderTreeNode renderTreeNode2 = this.A00.A03;
                    A0B(renderTreeNode2, renderTreeNode2.A07, r3.A02);
                }
            } else {
                r10.A07(A032);
                C49842Wd r2 = r7.A00;
                if (A022) {
                    r5.A01(AnonymousClass000.A0h(r6.A04(), AnonymousClass000.A0r("UnmountItem:remove: ")));
                }
                r2.A02(r7);
                if (A022) {
                    r5.A00();
                }
                if (r7.A03) {
                    if (A022) {
                        r5.A01(AnonymousClass000.A0h(r6.A04(), AnonymousClass000.A0r("UnmountItem:unbind: ")));
                    }
                    A06(r7);
                    if (A022) {
                        r5.A00();
                    }
                }
                if (obj2 instanceof View) {
                    ((View) obj2).setPadding(0, 0, 0, 0);
                }
                if (A022) {
                    r5.A01(AnonymousClass000.A0h(r6.A04(), AnonymousClass000.A0r("UnmountItem:unmount: ")));
                }
                A0B(renderTreeNode, r6, obj2);
                if (A022) {
                    r5.A00();
                }
                AnonymousClass4G1 A003 = C89814cy.A00(this.A03, (C108195Na) r7.A01.A07);
                if (A003 != null) {
                    try {
                        A003.A00.Abi(obj2);
                    } catch (IllegalStateException e2) {
                        StringBuilder A0r = AnonymousClass000.A0r("Lifecycle: ");
                        Object obj3 = A003.A01;
                        if (obj3 instanceof Class) {
                            StringBuilder A0r2 = AnonymousClass000.A0r(" <cls>");
                            A0r2.append(((Class) obj3).getName());
                            obj = AnonymousClass000.A0h("</cls>", A0r2);
                        } else {
                            obj = obj3.toString();
                        }
                        throw new IllegalStateException(AnonymousClass000.A0h(obj, A0r), e2);
                    }
                }
            }
            if (A022) {
                r5.A00();
            }
        }
    }

    public final void A05(AnonymousClass4LN r10) {
        RenderTreeNode renderTreeNode = r10.A01;
        AnonymousClass3BJ r1 = renderTreeNode.A07;
        Object obj = r10.A02;
        Object obj2 = renderTreeNode.A08;
        Context context = this.A03;
        AnonymousClass4VL r4 = this.A06;
        if (r1.A00 != null) {
            boolean A022 = r4.A02();
            for (C88574aj r2 : r1.A00) {
                if (A022) {
                    r4.A01(AnonymousClass000.A0h(r2.A01(), AnonymousClass000.A0r("RenderUnit.attachBinder:")));
                }
                r2.A00.A5M(context, obj, r2.A01, obj2);
                if (A022) {
                    r4.A00();
                }
            }
        }
        r10.A03 = true;
    }

    public final void A06(AnonymousClass4LN r11) {
        RenderTreeNode renderTreeNode = r11.A01;
        AnonymousClass3BJ r1 = renderTreeNode.A07;
        Object obj = r11.A02;
        Object obj2 = renderTreeNode.A08;
        Context context = this.A03;
        AnonymousClass4VL r6 = this.A06;
        if (r1.A00 != null) {
            boolean A022 = r6.A02();
            List list = r1.A00;
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C88574aj r2 = (C88574aj) list.get(size);
                if (A022) {
                    r6.A01(AnonymousClass000.A0h(r2.A01(), AnonymousClass000.A0r("RenderUnit.detachBinder:")));
                }
                r2.A00.Ah6(context, obj, r2.A01, obj2);
                if (A022) {
                    r6.A00();
                }
            }
        }
        r11.A03 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x010a, code lost:
        if (((android.view.View) r2).isLayoutRequested() == false) goto L_0x010c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A07(X.AnonymousClass4LN r26, com.facebook.rendercore.RenderTreeNode r27) {
        /*
            r25 = this;
            r7 = r25
            X.4VL r5 = r7.A06
            boolean r12 = r5.A02()
            if (r12 == 0) goto L_0x0010
            java.lang.String r0 = "updateMountItemIfNeeded"
            r5.A01(r0)
        L_0x0010:
            r1 = r27
            X.3BJ r4 = r1.A07
            java.lang.Object r14 = r1.A08
            r6 = r26
            com.facebook.rendercore.RenderTreeNode r0 = r6.A01
            X.3BJ r3 = r0.A07
            java.lang.Object r13 = r0.A08
            java.lang.Object r2 = r6.A02
            r6.A01 = r1
            if (r3 == r4) goto L_0x00f1
            if (r12 == 0) goto L_0x0037
            java.lang.String r0 = "UpdateItem: "
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0r(r0)
            java.lang.String r0 = r4.A04()
            java.lang.String r0 = X.AnonymousClass000.A0h(r0, r1)
            r5.A01(r0)
        L_0x0037:
            android.content.Context r8 = r7.A03
            boolean r10 = r6.A03
            java.util.List r1 = r4.A00
            if (r1 != 0) goto L_0x00a6
            r0 = 0
        L_0x0040:
            java.util.ArrayList r17 = X.C13690nt.A0i(r0)
            java.util.List r15 = r3.A00
            if (r15 != 0) goto L_0x00a1
            r0 = 0
        L_0x0049:
            java.util.ArrayList r7 = X.C13690nt.A0i(r0)
            java.util.List r0 = r4.A01
            if (r0 != 0) goto L_0x009c
            r0 = 0
        L_0x0052:
            java.util.ArrayList r22 = X.C13690nt.A0i(r0)
            java.util.List r0 = r3.A01
            if (r0 != 0) goto L_0x0097
            r0 = 0
        L_0x005b:
            java.util.ArrayList r9 = X.C13690nt.A0i(r0)
            java.util.Map r0 = r3.A02
            r19 = r0
            r18 = r7
            r16 = r1
            X.AnonymousClass3BJ.A02(r13, r14, r15, r16, r17, r18, r19)
            java.util.List r11 = r3.A01
            java.util.List r1 = r4.A01
            java.util.Map r0 = r3.A03
            r18 = r13
            r19 = r14
            r20 = r11
            r21 = r1
            r23 = r9
            r24 = r0
            X.AnonymousClass3BJ.A02(r18, r19, r20, r21, r22, r23, r24)
            if (r10 == 0) goto L_0x00ab
            int r10 = r7.size()
        L_0x0085:
            int r10 = r10 + -1
            if (r10 < 0) goto L_0x00ab
            java.lang.Object r0 = r7.get(r10)
            X.4aj r0 = (X.C88574aj) r0
            X.5SJ r1 = r0.A00
            java.lang.Object r0 = r0.A01
            r1.Ah6(r8, r2, r0, r13)
            goto L_0x0085
        L_0x0097:
            int r0 = r0.size()
            goto L_0x005b
        L_0x009c:
            int r0 = r0.size()
            goto L_0x0052
        L_0x00a1:
            int r0 = r15.size()
            goto L_0x0049
        L_0x00a6:
            int r0 = r1.size()
            goto L_0x0040
        L_0x00ab:
            int r7 = r9.size()
        L_0x00af:
            int r7 = r7 + -1
            if (r7 < 0) goto L_0x00c1
            java.lang.Object r0 = r9.get(r7)
            X.4aj r0 = (X.C88574aj) r0
            X.5SJ r1 = r0.A00
            java.lang.Object r0 = r0.A01
            r1.Ah6(r8, r2, r0, r13)
            goto L_0x00af
        L_0x00c1:
            java.util.Iterator r7 = r22.iterator()
        L_0x00c5:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00d9
            java.lang.Object r0 = r7.next()
            X.4aj r0 = (X.C88574aj) r0
            X.5SJ r1 = r0.A00
            java.lang.Object r0 = r0.A01
            r1.A5M(r8, r2, r0, r14)
            goto L_0x00c5
        L_0x00d9:
            java.util.Iterator r7 = r17.iterator()
        L_0x00dd:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x00f1
            java.lang.Object r0 = r7.next()
            X.4aj r0 = (X.C88574aj) r0
            X.5SJ r1 = r0.A00
            java.lang.Object r0 = r0.A01
            r1.A5M(r8, r2, r0, r14)
            goto L_0x00dd
        L_0x00f1:
            r0 = 1
            r6.A03 = r0
            long r9 = r4.A03()
            r7 = 0
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0112
            boolean r0 = r2 instanceof android.view.View
            if (r0 == 0) goto L_0x010c
            r0 = r2
            android.view.View r0 = (android.view.View) r0
            boolean r0 = r0.isLayoutRequested()
            r1 = 1
            if (r0 != 0) goto L_0x010d
        L_0x010c:
            r1 = 0
        L_0x010d:
            com.facebook.rendercore.RenderTreeNode r0 = r6.A01
            A00(r5, r0, r2, r1)
        L_0x0112:
            if (r12 == 0) goto L_0x011c
            if (r3 == r4) goto L_0x0119
            r5.A00()
        L_0x0119:
            r5.A00()
        L_0x011c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61813Al.A07(X.4LN, com.facebook.rendercore.RenderTreeNode):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0222, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:?, code lost:
        r1 = X.AnonymousClass000.A0o();
        r1.append("Exception while mounting: ");
        r2 = X.AnonymousClass000.A0h(r4.getMessage(), r1);
        X.C89634ca.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x023d, code lost:
        if (X.C814548h.A00 != false) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x023f, code lost:
        android.util.Log.e(X.AnonymousClass000.A0h("MountState:Exception", X.AnonymousClass000.A0q("RenderCore:")), r2, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x024c, code lost:
        if ((r4 instanceof java.lang.RuntimeException) != false) goto L_0x024e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x024e, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0254, code lost:
        throw new java.lang.RuntimeException(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0258, code lost:
        r0 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0222 A[ExcHandler: Exception (r4v0 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:3:0x0007] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(X.AnonymousClass3AI r23) {
        /*
            r22 = this;
            r0 = r23
            if (r23 == 0) goto L_0x025c
            r1 = 0
            r8 = r22
            boolean r2 = r8.A01     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            if (r2 != 0) goto L_0x021b
            r2 = 1
            r8.A01 = r2     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            X.3AI r6 = r8.A00     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            if (r0 != r6) goto L_0x0018
            boolean r2 = r8.A02     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            if (r2 != 0) goto L_0x0018
            goto L_0x0218
        L_0x0018:
            r8.A00 = r0     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            X.4VL r7 = r8.A06     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            boolean r19 = r7.A02()     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            if (r19 == 0) goto L_0x002c
            java.lang.String r2 = "MountState.mount"
            r7.A01(r2)     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            java.lang.String r2 = "RenderCoreExtension.beforeMount"
            r7.A01(r2)     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
        L_0x002c:
            X.2Wd r4 = r8.A05     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            if (r19 == 0) goto L_0x0038
            r7.A00()     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            java.lang.String r2 = "MountState.prepareMount"
            r7.A01(r2)     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
        L_0x0038:
            X.3AI r2 = r8.A00     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            if (r2 == 0) goto L_0x00bc
            if (r6 == 0) goto L_0x00bc
            boolean r15 = r7.A02()     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            if (r15 == 0) goto L_0x004a
            java.lang.String r2 = "unmountOrMoveOldItems"
            r7.A01(r2)     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
        L_0x004a:
            r5 = 1
        L_0x004b:
            com.facebook.rendercore.RenderTreeNode[] r3 = r6.A04     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            int r2 = r3.length     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            if (r5 >= r2) goto L_0x00b7
            r2 = r3[r5]     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            X.3BJ r11 = r2.A07     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            X.3AI r9 = r8.A00     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            long r2 = r11.A03()     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            android.util.LongSparseArray r10 = r9.A02     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            r9 = -1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            java.lang.Object r2 = r10.get(r2, r9)     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            int r14 = r2.intValue()     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            r12 = 0
            r13 = -1
            if (r14 <= r13) goto L_0x00b5
            X.3AI r2 = r8.A00     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            com.facebook.rendercore.RenderTreeNode[] r2 = r2.A04     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            r10 = r2[r14]     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
        L_0x0075:
            X.03G r9 = r8.A04     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            long r2 = r11.A03()     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            java.lang.Object r11 = r9.A04(r2, r12)     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            X.4LN r11 = (X.AnonymousClass4LN) r11     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            if (r11 == 0) goto L_0x00b2
            if (r14 == r13) goto L_0x00a7
            com.facebook.rendercore.RenderTreeNode r2 = r10.A06     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            X.3BJ r2 = r2.A07     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            long r2 = r2.A03()     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            java.lang.Object r2 = r9.A04(r2, r12)     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            X.4LN r2 = (X.AnonymousClass4LN) r2     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            if (r2 == 0) goto L_0x0097
            java.lang.Object r12 = r2.A02     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
        L_0x0097:
            X.2Wd r9 = r11.A00     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            if (r9 != r12) goto L_0x00a7
            com.facebook.rendercore.RenderTreeNode r2 = r11.A01     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            int r3 = r2.A03     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            int r2 = r10.A03     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            if (r3 == r2) goto L_0x00b2
            r9.A04(r11, r3, r2)     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            goto L_0x00b2
        L_0x00a7:
            com.facebook.rendercore.RenderTreeNode r2 = r11.A01     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            X.3BJ r2 = r2.A07     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            long r2 = r2.A03()     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            r8.A04(r2)     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
        L_0x00b2:
            int r5 = r5 + 1
            goto L_0x004b
        L_0x00b5:
            r10 = r12
            goto L_0x0075
        L_0x00b7:
            if (r15 == 0) goto L_0x00bc
            r7.A00()     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
        L_0x00bc:
            X.03G r6 = r8.A04     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            r2 = 0
            r5 = 0
            java.lang.Object r5 = r6.A04(r2, r5)     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            X.4LN r5 = (X.AnonymousClass4LN) r5     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            X.3AI r2 = r8.A00     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            com.facebook.rendercore.RenderTreeNode[] r2 = r2.A04     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            r3 = r2[r1]     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            if (r5 != 0) goto L_0x00e2
            X.3BJ r2 = r3.A07     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            r8.A0A(r3, r2, r4)     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            X.4LN r5 = new X.4LN     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            r5.<init>(r4, r3, r4)     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            r2 = 0
            r6.A09(r2, r5)     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            r8.A05(r5)     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            goto L_0x00e5
        L_0x00e2:
            r8.A07(r5, r3)     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
        L_0x00e5:
            if (r19 == 0) goto L_0x00ea
            r7.A00()     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
        L_0x00ea:
            r5 = 0
            com.facebook.rendercore.RenderTreeNode[] r0 = r0.A04     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            r18 = r0
            int r4 = r0.length     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            r12 = 1
        L_0x00f1:
            if (r12 >= r4) goto L_0x0209
            r11 = r18[r12]     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            X.3BJ r0 = r11.A07     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            r21 = r0
            long r2 = r21.A03()     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            java.lang.Object r13 = r6.A04(r2, r5)     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            X.4LN r13 = (X.AnonymousClass4LN) r13     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            if (r13 == 0) goto L_0x01ff
            com.facebook.rendercore.RenderTreeNode r0 = r13.A01     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            X.3BJ r0 = r0.A07     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            r20 = r0
            long r16 = r20.A03()     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            java.lang.String r10 = " newRenderUnitId: "
            java.lang.String r15 = " currentRenderUnitId: "
            int r0 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0153
            X.C89634ca.A00()     // Catch:{ Exception -> 0x0222 }
            java.lang.String r9 = "MountState"
            java.lang.StringBuilder r14 = X.AnonymousClass000.A0o()     // Catch:{ Exception -> 0x0222 }
            java.lang.String r0 = "The current render unit id does not match the new one.  index: "
            r14.append(r0)     // Catch:{ Exception -> 0x0222 }
            r14.append(r12)     // Catch:{ Exception -> 0x0222 }
            java.lang.String r0 = " mountableOutputCounts: "
            r14.append(r0)     // Catch:{ Exception -> 0x0222 }
            r14.append(r4)     // Catch:{ Exception -> 0x0222 }
            r14.append(r15)     // Catch:{ Exception -> 0x0222 }
            long r0 = r20.A03()     // Catch:{ Exception -> 0x0222 }
            r14.append(r0)     // Catch:{ Exception -> 0x0222 }
            r14.append(r10)     // Catch:{ Exception -> 0x0222 }
            java.lang.String r1 = X.C13680ns.A0j(r14, r2)     // Catch:{ Exception -> 0x0222 }
            java.lang.String r14 = "RenderCore:"
            boolean r0 = X.C814548h.A00     // Catch:{ Exception -> 0x0222 }
            if (r0 == 0) goto L_0x0152
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r14)     // Catch:{ Exception -> 0x0222 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r9, r0)     // Catch:{ Exception -> 0x0222 }
            android.util.Log.e(r0, r1, r5)     // Catch:{ Exception -> 0x0222 }
        L_0x0152:
            r1 = 1
        L_0x0153:
            java.lang.Class r14 = r20.getClass()     // Catch:{ Exception -> 0x0222 }
            java.lang.Class r9 = r21.getClass()     // Catch:{ Exception -> 0x0222 }
            boolean r0 = r14.equals(r9)     // Catch:{ Exception -> 0x0222 }
            if (r0 != 0) goto L_0x01ae
            X.C89634ca.A00()     // Catch:{ Exception -> 0x0222 }
            java.lang.String r11 = "MountState"
            java.lang.StringBuilder r13 = X.AnonymousClass000.A0o()     // Catch:{ Exception -> 0x0222 }
            java.lang.String r0 = "Trying to update a MountItem with different ContentType. index: "
            r13.append(r0)     // Catch:{ Exception -> 0x0222 }
            r13.append(r12)     // Catch:{ Exception -> 0x0222 }
            r13.append(r15)     // Catch:{ Exception -> 0x0222 }
            long r0 = r20.A03()     // Catch:{ Exception -> 0x0222 }
            r13.append(r0)     // Catch:{ Exception -> 0x0222 }
            r13.append(r10)     // Catch:{ Exception -> 0x0222 }
            r13.append(r2)     // Catch:{ Exception -> 0x0222 }
            java.lang.String r0 = " currentRenderUnitContentType: "
            r13.append(r0)     // Catch:{ Exception -> 0x0222 }
            r13.append(r14)     // Catch:{ Exception -> 0x0222 }
            java.lang.String r0 = " newRenderUnitContentType: "
            java.lang.String r2 = X.AnonymousClass000.A0e(r9, r0, r13)     // Catch:{ Exception -> 0x0222 }
            java.lang.String r1 = "RenderCore:"
            boolean r0 = X.C814548h.A00     // Catch:{ Exception -> 0x0222 }
            if (r0 == 0) goto L_0x01a1
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r1)     // Catch:{ Exception -> 0x0222 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r11, r0)     // Catch:{ Exception -> 0x0222 }
            android.util.Log.e(r0, r2, r5)     // Catch:{ Exception -> 0x0222 }
        L_0x01a1:
            int r12 = r6.A00()     // Catch:{ Exception -> 0x0222 }
            long[] r11 = new long[r12]     // Catch:{ Exception -> 0x0222 }
            int r3 = r6.A00()     // Catch:{ Exception -> 0x0222 }
            r10 = 0
            r2 = 0
            goto L_0x01b1
        L_0x01ae:
            if (r1 != 0) goto L_0x01a1
            goto L_0x01fb
        L_0x01b1:
            if (r2 >= r3) goto L_0x01bc
            long r0 = r6.A01(r2)     // Catch:{ Exception -> 0x0222 }
            r11[r2] = r0     // Catch:{ Exception -> 0x0222 }
            int r2 = r2 + 1
            goto L_0x01b1
        L_0x01bc:
            r9 = 0
        L_0x01bd:
            r2 = 0
            if (r10 >= r12) goto L_0x01f7
            r0 = r11[r10]     // Catch:{ Exception -> 0x0222 }
            java.lang.Object r13 = r6.A04(r0, r5)     // Catch:{ Exception -> 0x0222 }
            X.4LN r13 = (X.AnonymousClass4LN) r13     // Catch:{ Exception -> 0x0222 }
            if (r13 == 0) goto L_0x01f4
            com.facebook.rendercore.RenderTreeNode r14 = r13.A01     // Catch:{ Exception -> 0x0222 }
            X.3BJ r14 = r14.A07     // Catch:{ Exception -> 0x0222 }
            long r15 = r14.A03()     // Catch:{ Exception -> 0x0222 }
            int r14 = (r15 > r2 ? 1 : (r15 == r2 ? 0 : -1))
            if (r14 != 0) goto L_0x01db
            r6.A07(r0)     // Catch:{ Exception -> 0x0222 }
            goto L_0x01f3
        L_0x01db:
            com.facebook.rendercore.RenderTreeNode r2 = r13.A01     // Catch:{ Exception -> 0x0222 }
            X.3BJ r2 = r2.A07     // Catch:{ Exception -> 0x0222 }
            long r14 = r2.A03()     // Catch:{ Exception -> 0x0222 }
            int r2 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x01ef
            com.facebook.rendercore.RenderTreeNode r0 = r13.A01     // Catch:{ Exception -> 0x0222 }
            X.3BJ r0 = r0.A07     // Catch:{ Exception -> 0x0222 }
            long r0 = r0.A03()     // Catch:{ Exception -> 0x0222 }
        L_0x01ef:
            r8.A04(r0)     // Catch:{ Exception -> 0x0222 }
            goto L_0x01f4
        L_0x01f3:
            r9 = r13
        L_0x01f4:
            int r10 = r10 + 1
            goto L_0x01bd
        L_0x01f7:
            r6.A09(r2, r9)     // Catch:{ Exception -> 0x0222 }
            goto L_0x0203
        L_0x01fb:
            r8.A07(r13, r11)     // Catch:{ Exception -> 0x0222 }
            goto L_0x0204
        L_0x01ff:
            r8.A09(r11)     // Catch:{ Exception -> 0x0222 }
            goto L_0x0204
        L_0x0203:
            r12 = 1
        L_0x0204:
            int r12 = r12 + 1
            r1 = 0
            goto L_0x00f1
        L_0x0209:
            r8.A02 = r1     // Catch:{ Exception -> 0x0222, all -> 0x0258 }
            if (r19 == 0) goto L_0x0218
            r7.A00()     // Catch:{ Exception -> 0x0222 }
            java.lang.String r0 = "RenderCoreExtension.afterMount"
            r7.A01(r0)     // Catch:{ Exception -> 0x0222 }
            r7.A00()     // Catch:{ Exception -> 0x0222 }
        L_0x0218:
            r8.A01 = r1
            return
        L_0x021b:
            java.lang.String r0 = "Trying to mount while already mounting!"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)     // Catch:{ Exception -> 0x0222 }
            throw r0     // Catch:{ Exception -> 0x0222 }
        L_0x0222:
            r4 = move-exception
            java.lang.String r3 = "MountState:Exception"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0o()     // Catch:{ all -> 0x0255 }
            java.lang.String r0 = "Exception while mounting: "
            r1.append(r0)     // Catch:{ all -> 0x0255 }
            java.lang.String r0 = r4.getMessage()     // Catch:{ all -> 0x0255 }
            java.lang.String r2 = X.AnonymousClass000.A0h(r0, r1)     // Catch:{ all -> 0x0255 }
            X.C89634ca.A00()     // Catch:{ all -> 0x0255 }
            java.lang.String r1 = "RenderCore:"
            boolean r0 = X.C814548h.A00     // Catch:{ all -> 0x0255 }
            if (r0 == 0) goto L_0x024a
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0q(r1)     // Catch:{ all -> 0x0255 }
            java.lang.String r0 = X.AnonymousClass000.A0h(r3, r0)     // Catch:{ all -> 0x0255 }
            android.util.Log.e(r0, r2, r4)     // Catch:{ all -> 0x0255 }
        L_0x024a:
            boolean r0 = r4 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x0255 }
            if (r0 == 0) goto L_0x024f
            throw r4     // Catch:{ all -> 0x0255 }
        L_0x024f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0255 }
            r0.<init>(r4)     // Catch:{ all -> 0x0255 }
            throw r0     // Catch:{ all -> 0x0255 }
        L_0x0255:
            r0 = move-exception
            r1 = 0
            goto L_0x0259
        L_0x0258:
            r0 = move-exception
        L_0x0259:
            r8.A01 = r1
            throw r0
        L_0x025c:
            java.lang.String r0 = "Trying to mount a null RenderTreeNode"
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0V(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61813Al.A08(X.3AI):void");
    }

    public final void A09(RenderTreeNode renderTreeNode) {
        Object A7G;
        AnonymousClass3BJ r6 = renderTreeNode.A07;
        long A032 = r6.A03();
        if (A032 == 0) {
            C49842Wd r0 = this.A05;
            A0A(renderTreeNode, r6, r0);
            AnonymousClass4LN r1 = new AnonymousClass4LN(r0, renderTreeNode, r0);
            this.A04.A09(0, r1);
            A05(r1);
            return;
        }
        AnonymousClass4VL r5 = this.A06;
        boolean A022 = r5.A02();
        if (A022) {
            r5.A01(AnonymousClass000.A0h(r6.A04(), AnonymousClass000.A0r("MountItem: ")));
            r5.A01(AnonymousClass000.A0h(r6.A04(), AnonymousClass000.A0r("MountItem:before ")));
        }
        RenderTreeNode renderTreeNode2 = renderTreeNode.A06;
        AnonymousClass3BJ r7 = renderTreeNode2.A07;
        long A033 = r7.A03();
        AnonymousClass03G r9 = this.A04;
        if (r9.A04(A033, (Object) null) == null) {
            A09(renderTreeNode2);
        }
        long A034 = r7.A03();
        Object obj = ((AnonymousClass4LN) r9.A04(A034, (Object) null)).A02;
        if (obj instanceof C49842Wd) {
            C49842Wd r8 = (C49842Wd) obj;
            Context context = this.A03;
            C108195Na r3 = (C108195Na) r6;
            AnonymousClass4G1 A002 = C89814cy.A00(context, r3);
            if (A002 == null || (A7G = A002.A00.A4T()) == null) {
                A7G = r3.A7G(context);
            }
            if (A022) {
                r5.A00();
                r5.A01(AnonymousClass000.A0h(r6.A04(), AnonymousClass000.A0r("MountItem:mount ")));
            }
            A0A(renderTreeNode, r6, A7G);
            AnonymousClass4LN r32 = new AnonymousClass4LN(r8, renderTreeNode, A7G);
            r9.A09(A032, r32);
            r8.A03(r32, renderTreeNode.A03);
            if (A022) {
                r5.A00();
                r5.A01(AnonymousClass000.A0h(r6.A04(), AnonymousClass000.A0r("MountItem:bind ")));
            }
            A05(r32);
            if (A022) {
                r5.A00();
                r5.A01(AnonymousClass000.A0h(r6.A04(), AnonymousClass000.A0r("MountItem:applyBounds ")));
            }
            A00(r5, renderTreeNode, r32.A02, true);
            if (A022) {
                r5.A00();
                r5.A01(AnonymousClass000.A0h(r6.A04(), AnonymousClass000.A0r("MountItem:after ")));
                r5.A00();
                r5.A00();
                return;
            }
            return;
        }
        StringBuilder A0r = AnonymousClass000.A0r("Trying to mount a RenderTreeNode, its parent should be a Host, but was '");
        A0r.append(AnonymousClass000.A0c(obj));
        A0r.append("'.\nParent RenderUnit: id=");
        A0r.append(A034);
        A0r.append("; contentType='");
        A0r.append(r7.getClass());
        A0r.append("'.\nChild RenderUnit: id=");
        A0r.append(A032);
        A0r.append("; contentType='");
        A0r.append(r6.getClass());
        throw AnonymousClass000.A0a(AnonymousClass000.A0h("'.", A0r));
    }

    public final void A0A(RenderTreeNode renderTreeNode, AnonymousClass3BJ r10, Object obj) {
        Context context = this.A03;
        Object obj2 = renderTreeNode.A08;
        AnonymousClass4VL r4 = this.A06;
        if (r10.A01 != null) {
            boolean A022 = r4.A02();
            for (C88574aj r2 : r10.A01) {
                if (A022) {
                    r4.A01(AnonymousClass000.A0h(r2.A01(), AnonymousClass000.A0r("RenderUnit.mountBinder:")));
                }
                r2.A00.A5M(context, obj, r2.A01, obj2);
                if (A022) {
                    r4.A00();
                }
            }
        }
    }

    public final void A0B(RenderTreeNode renderTreeNode, AnonymousClass3BJ r10, Object obj) {
        Context context = this.A03;
        Object obj2 = renderTreeNode.A08;
        AnonymousClass4VL r4 = this.A06;
        if (r10.A01 != null) {
            boolean A022 = r4.A02();
            int size = r10.A01.size();
            while (true) {
                size--;
                if (size >= 0) {
                    C88574aj r2 = (C88574aj) r10.A01.get(size);
                    if (A022) {
                        r4.A01(AnonymousClass000.A0h(r2.A01(), AnonymousClass000.A0r("RenderUnit.unmountBinder:")));
                    }
                    r2.A00.Ah6(context, obj, r2.A01, obj2);
                    if (A022) {
                        r4.A00();
                    }
                } else {
                    return;
                }
            }
        }
    }
}
