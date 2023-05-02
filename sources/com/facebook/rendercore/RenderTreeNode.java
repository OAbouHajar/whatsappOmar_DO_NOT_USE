package com.facebook.rendercore;

import X.AnonymousClass000;
import X.AnonymousClass3AI;
import X.AnonymousClass3BJ;
import X.C13690nt;
import android.graphics.Rect;
import java.util.List;
import java.util.Locale;

public class RenderTreeNode {
    public List A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final Rect A04;
    public final Rect A05;
    public final RenderTreeNode A06;
    public final AnonymousClass3BJ A07;
    public final Object A08;

    public RenderTreeNode(Rect rect, Rect rect2, RenderTreeNode renderTreeNode, AnonymousClass3BJ r6, Object obj, int i2) {
        this.A06 = renderTreeNode;
        this.A07 = r6;
        this.A08 = obj;
        this.A04 = rect;
        this.A01 = renderTreeNode != null ? renderTreeNode.A01 + rect.left : rect.left;
        this.A02 = renderTreeNode != null ? renderTreeNode.A02 + rect.top : rect.top;
        this.A05 = rect2;
        this.A03 = i2;
    }

    public String A00(AnonymousClass3AI r12) {
        AnonymousClass3BJ r0 = this.A07;
        long A032 = r0.A03();
        String A042 = r0.A04();
        int A0D = r12 != null ? AnonymousClass000.A0D(r12.A02.get(A032, -1)) : -1;
        String shortString = this.A04.toShortString();
        List list = this.A00;
        int size = list != null ? list.size() : 0;
        RenderTreeNode renderTreeNode = this.A06;
        long A033 = renderTreeNode != null ? renderTreeNode.A07.A03() : -1;
        Locale locale = Locale.US;
        Object[] objArr = new Object[9];
        C13690nt.A1L(Long.valueOf(A032), A042, objArr);
        AnonymousClass000.A1M(objArr, A0D, 2);
        AnonymousClass000.A1M(objArr, this.A03, 3);
        objArr[4] = shortString;
        AnonymousClass000.A1M(objArr, this.A01, 5);
        AnonymousClass000.A1M(objArr, this.A02, 6);
        AnonymousClass000.A1M(objArr, size, 7);
        C13690nt.A1Q(objArr, 8, A033);
        return String.format(locale, "Id=%d; renderUnit='%s'; indexInTree=%d; posInParent=%d; bounds=%s; absPosition=[%d, %d]; childCount=%d; parentId=%d;", objArr);
    }
}
