package X;

import android.util.LongSparseArray;
import android.view.View;
import com.facebook.rendercore.RenderTreeNode;
import java.util.Locale;

/* renamed from: X.3AI  reason: invalid class name */
public class AnonymousClass3AI {
    public final int A00;
    public final int A01;
    public final LongSparseArray A02 = new LongSparseArray();
    public final RenderTreeNode A03;
    public final RenderTreeNode[] A04;

    public AnonymousClass3AI(RenderTreeNode renderTreeNode, RenderTreeNode[] renderTreeNodeArr, int i2, int i3) {
        this.A03 = renderTreeNode;
        this.A04 = renderTreeNodeArr;
        this.A01 = i2;
        this.A00 = i3;
        int i4 = 0;
        while (true) {
            RenderTreeNode[] renderTreeNodeArr2 = this.A04;
            if (i4 < renderTreeNodeArr2.length) {
                RenderTreeNode renderTreeNode2 = renderTreeNodeArr2[i4];
                LongSparseArray longSparseArray = this.A02;
                if (longSparseArray.get(renderTreeNode2.A07.A03()) == null) {
                    this.A02.put(this.A04[i4].A07.A03(), Integer.valueOf(i4));
                    i4++;
                } else {
                    Number number = (Number) longSparseArray.get(renderTreeNode2.A07.A03());
                    RenderTreeNode renderTreeNode3 = renderTreeNodeArr2[number.intValue()];
                    Locale locale = Locale.US;
                    Object[] objArr = new Object[5];
                    AnonymousClass000.A1M(objArr, i4, 0);
                    objArr[1] = renderTreeNode2.A00((AnonymousClass3AI) null);
                    objArr[2] = number;
                    objArr[3] = renderTreeNode3.A00((AnonymousClass3AI) null);
                    StringBuilder A0o = AnonymousClass000.A0o();
                    String A002 = A00(this.A01);
                    String A003 = A00(this.A00);
                    A0o.append("RenderTree details:\n");
                    Object[] A1Z = C13690nt.A1Z();
                    A1Z[0] = A002;
                    A1Z[1] = A003;
                    A0o.append(String.format(locale, "WidthSpec=%s; HeightSpec=%s\n", A1Z));
                    Object[] objArr2 = new Object[1];
                    int length = renderTreeNodeArr2.length;
                    AnonymousClass000.A1M(objArr2, length, 0);
                    A0o.append(String.format(locale, "Full child list (size = %d):\n", objArr2));
                    for (int i5 = 0; i5 < length; i5++) {
                        A0o.append(String.format(locale, "%s\n", new Object[]{renderTreeNodeArr2[i5].A00(this)}));
                    }
                    objArr[4] = A0o.toString();
                    throw AnonymousClass000.A0V(String.format(locale, "RenderTrees must not have RenderUnits with the same ID:\nAttempted to add item with existing ID at index %d: %s\nExisting item at index %d: %s\nFull RenderTree: %s", objArr));
                }
            } else {
                return;
            }
        }
    }

    public static String A00(int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int mode = View.MeasureSpec.getMode(i2);
        String str = mode == Integer.MIN_VALUE ? "AT_MOST" : mode == 1073741824 ? "EXACTLY" : mode == 0 ? "UNSPECIFIED" : "INVALID";
        Locale locale = Locale.US;
        Object[] A1Z = C13690nt.A1Z();
        AnonymousClass000.A1K(A1Z, size);
        A1Z[1] = str;
        return String.format(locale, "[%d, %s]", A1Z);
    }
}
