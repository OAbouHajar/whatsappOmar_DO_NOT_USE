package org.apache.commons.io.filefilter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.IOCase;

public class FileFilterUtils {
    private static final IOFileFilter cvsFilter = notFileFilter(and(directoryFileFilter(), nameFileFilter("CVS")));
    private static final IOFileFilter svnFilter = notFileFilter(and(directoryFileFilter(), nameFileFilter(".svn")));

    public static IOFileFilter ageFileFilter(long j2) {
        return new AgeFileFilter(j2);
    }

    public static IOFileFilter ageFileFilter(long j2, boolean z2) {
        return new AgeFileFilter(j2, z2);
    }

    public static IOFileFilter ageFileFilter(File file) {
        return new AgeFileFilter(file);
    }

    public static IOFileFilter ageFileFilter(File file, boolean z2) {
        return new AgeFileFilter(file, z2);
    }

    public static IOFileFilter ageFileFilter(Date date) {
        return new AgeFileFilter(date);
    }

    public static IOFileFilter ageFileFilter(Date date, boolean z2) {
        return new AgeFileFilter(date, z2);
    }

    public static IOFileFilter and(IOFileFilter... iOFileFilterArr) {
        return new AndFileFilter(toList(iOFileFilterArr));
    }

    @Deprecated
    public static IOFileFilter andFileFilter(IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        return new AndFileFilter(iOFileFilter, iOFileFilter2);
    }

    public static IOFileFilter asFileFilter(FileFilter fileFilter) {
        return new DelegateFileFilter(fileFilter);
    }

    public static IOFileFilter asFileFilter(FilenameFilter filenameFilter) {
        return new DelegateFileFilter(filenameFilter);
    }

    public static IOFileFilter directoryFileFilter() {
        return DirectoryFileFilter.DIRECTORY;
    }

    public static IOFileFilter falseFileFilter() {
        return FalseFileFilter.FALSE;
    }

    public static IOFileFilter fileFileFilter() {
        return FileFileFilter.FILE;
    }

    private static <T extends Collection<File>> T filter(IOFileFilter iOFileFilter, Iterable<File> iterable, T t2) {
        if (iOFileFilter != null) {
            if (iterable != null) {
                for (File next : iterable) {
                    if (next == null) {
                        throw new IllegalArgumentException("file collection contains null");
                    } else if (iOFileFilter.accept(next)) {
                        t2.add(next);
                    }
                }
            }
            return t2;
        }
        throw new IllegalArgumentException("file filter is null");
    }

    public static File[] filter(IOFileFilter iOFileFilter, Iterable<File> iterable) {
        List<File> filterList = filterList(iOFileFilter, iterable);
        return (File[]) filterList.toArray(new File[filterList.size()]);
    }

    public static File[] filter(IOFileFilter iOFileFilter, File... fileArr) {
        if (iOFileFilter == null) {
            throw new IllegalArgumentException("file filter is null");
        } else if (fileArr == null) {
            return new File[0];
        } else {
            ArrayList arrayList = new ArrayList();
            File[] fileArr2 = fileArr;
            int length = fileArr2.length;
            int i2 = 0;
            while (i2 < length) {
                File file = fileArr2[i2];
                if (file != null) {
                    if (iOFileFilter.accept(file)) {
                        arrayList.add(file);
                    }
                    i2++;
                } else {
                    throw new IllegalArgumentException("file array contains null");
                }
            }
            return (File[]) arrayList.toArray(new File[arrayList.size()]);
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Iterable<java.io.File>, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<java.io.File> filterList(org.apache.commons.io.filefilter.IOFileFilter r1, java.lang.Iterable<java.io.File> r2) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Collection r0 = filter(r1, r2, r0)
            java.util.List r0 = (java.util.List) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.filefilter.FileFilterUtils.filterList(org.apache.commons.io.filefilter.IOFileFilter, java.lang.Iterable):java.util.List");
    }

    public static List<File> filterList(IOFileFilter iOFileFilter, File... fileArr) {
        return Arrays.asList(filter(iOFileFilter, fileArr));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Iterable<java.io.File>, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Set<java.io.File> filterSet(org.apache.commons.io.filefilter.IOFileFilter r1, java.lang.Iterable<java.io.File> r2) {
        /*
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.Collection r0 = filter(r1, r2, r0)
            java.util.Set r0 = (java.util.Set) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.io.filefilter.FileFilterUtils.filterSet(org.apache.commons.io.filefilter.IOFileFilter, java.lang.Iterable):java.util.Set");
    }

    public static Set<File> filterSet(IOFileFilter iOFileFilter, File... fileArr) {
        return new HashSet(Arrays.asList(filter(iOFileFilter, fileArr)));
    }

    public static IOFileFilter magicNumberFileFilter(String str) {
        return new MagicNumberFileFilter(str);
    }

    public static IOFileFilter magicNumberFileFilter(String str, long j2) {
        return new MagicNumberFileFilter(str, j2);
    }

    public static IOFileFilter magicNumberFileFilter(byte[] bArr) {
        return new MagicNumberFileFilter(bArr);
    }

    public static IOFileFilter magicNumberFileFilter(byte[] bArr, long j2) {
        return new MagicNumberFileFilter(bArr, j2);
    }

    public static IOFileFilter makeCVSAware(IOFileFilter iOFileFilter) {
        if (iOFileFilter == null) {
            return cvsFilter;
        }
        return and(iOFileFilter, cvsFilter);
    }

    public static IOFileFilter makeDirectoryOnly(IOFileFilter iOFileFilter) {
        return iOFileFilter == null ? DirectoryFileFilter.DIRECTORY : new AndFileFilter(DirectoryFileFilter.DIRECTORY, iOFileFilter);
    }

    public static IOFileFilter makeFileOnly(IOFileFilter iOFileFilter) {
        return iOFileFilter == null ? FileFileFilter.FILE : new AndFileFilter(FileFileFilter.FILE, iOFileFilter);
    }

    public static IOFileFilter makeSVNAware(IOFileFilter iOFileFilter) {
        if (iOFileFilter == null) {
            return svnFilter;
        }
        return and(iOFileFilter, svnFilter);
    }

    public static IOFileFilter nameFileFilter(String str) {
        return new NameFileFilter(str);
    }

    public static IOFileFilter nameFileFilter(String str, IOCase iOCase) {
        return new NameFileFilter(str, iOCase);
    }

    public static IOFileFilter notFileFilter(IOFileFilter iOFileFilter) {
        return new NotFileFilter(iOFileFilter);
    }

    public static IOFileFilter or(IOFileFilter... iOFileFilterArr) {
        return new OrFileFilter(toList(iOFileFilterArr));
    }

    @Deprecated
    public static IOFileFilter orFileFilter(IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2) {
        return new OrFileFilter(iOFileFilter, iOFileFilter2);
    }

    public static IOFileFilter prefixFileFilter(String str) {
        return new PrefixFileFilter(str);
    }

    public static IOFileFilter prefixFileFilter(String str, IOCase iOCase) {
        return new PrefixFileFilter(str, iOCase);
    }

    public static IOFileFilter sizeFileFilter(long j2) {
        return new SizeFileFilter(j2);
    }

    public static IOFileFilter sizeFileFilter(long j2, boolean z2) {
        return new SizeFileFilter(j2, z2);
    }

    public static IOFileFilter sizeRangeFileFilter(long j2, long j3) {
        return new AndFileFilter(new SizeFileFilter(j2, true), new SizeFileFilter(1 + j3, false));
    }

    public static IOFileFilter suffixFileFilter(String str) {
        return new SuffixFileFilter(str);
    }

    public static IOFileFilter suffixFileFilter(String str, IOCase iOCase) {
        return new SuffixFileFilter(str, iOCase);
    }

    public static List<IOFileFilter> toList(IOFileFilter... iOFileFilterArr) {
        if (iOFileFilterArr != null) {
            ArrayList arrayList = new ArrayList(iOFileFilterArr.length);
            int i2 = 0;
            while (i2 < iOFileFilterArr.length) {
                if (iOFileFilterArr[i2] != null) {
                    arrayList.add(iOFileFilterArr[i2]);
                    i2++;
                } else {
                    throw new IllegalArgumentException("The filter[" + i2 + "] is null");
                }
            }
            return arrayList;
        }
        throw new IllegalArgumentException("The filters must not be null");
    }

    public static IOFileFilter trueFileFilter() {
        return TrueFileFilter.TRUE;
    }
}
