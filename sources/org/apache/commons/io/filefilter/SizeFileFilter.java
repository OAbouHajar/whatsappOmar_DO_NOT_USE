package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.Serializable;

public class SizeFileFilter extends AbstractFileFilter implements Serializable {
    private final boolean acceptLarger;
    private final long size;

    public SizeFileFilter(long j2) {
        this(j2, true);
    }

    public SizeFileFilter(long j2, boolean z2) {
        if (j2 >= 0) {
            this.size = j2;
            this.acceptLarger = z2;
            return;
        }
        throw new IllegalArgumentException("The size must be non-negative");
    }

    public boolean accept(File file) {
        boolean z2 = file.length() < this.size;
        return this.acceptLarger ? !z2 : z2;
    }

    public String toString() {
        String str = this.acceptLarger ? ">=" : "<";
        return super.toString() + "(" + str + this.size + ")";
    }
}
