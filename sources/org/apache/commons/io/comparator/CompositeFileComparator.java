package org.apache.commons.io.comparator;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompositeFileComparator extends AbstractFileComparator implements Serializable {
    private static final Comparator<?>[] NO_COMPARATORS = new Comparator[0];
    private final Comparator<File>[] delegates;

    public CompositeFileComparator(Iterable<Comparator<File>> iterable) {
        if (iterable == null) {
            this.delegates = (Comparator[]) NO_COMPARATORS;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Comparator<File> add : iterable) {
            arrayList.add(add);
        }
        this.delegates = (Comparator[]) arrayList.toArray(new Comparator[arrayList.size()]);
    }

    public CompositeFileComparator(Comparator<File>... comparatorArr) {
        if (comparatorArr == null) {
            this.delegates = (Comparator[]) NO_COMPARATORS;
            return;
        }
        Comparator<File>[] comparatorArr2 = (Comparator[]) new Comparator[comparatorArr.length];
        this.delegates = comparatorArr2;
        System.arraycopy(comparatorArr, 0, comparatorArr2, 0, comparatorArr.length);
    }

    public int compare(File file, File file2) {
        int i2 = 0;
        for (Comparator<File> compare : this.delegates) {
            i2 = compare.compare(file, file2);
            if (i2 != 0) {
                break;
            }
        }
        return i2;
    }

    public /* bridge */ /* synthetic */ List sort(List list) {
        return super.sort((List<File>) list);
    }

    public /* bridge */ /* synthetic */ File[] sort(File[] fileArr) {
        return super.sort(fileArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append('{');
        for (int i2 = 0; i2 < this.delegates.length; i2++) {
            if (i2 > 0) {
                sb.append(',');
            }
            sb.append(this.delegates[i2]);
        }
        sb.append('}');
        return sb.toString();
    }
}