package org.apache.commons.io;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Collection;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;

public abstract class DirectoryWalker<T> {
    private final int depthLimit;
    private final FileFilter filter;

    public static class CancelException extends IOException {
        private static final long serialVersionUID = 1347339620135041008L;
        private final int depth;
        private final File file;

        public CancelException(File file2, int i2) {
            this("Operation Cancelled", file2, i2);
        }

        public CancelException(String str, File file2, int i2) {
            super(str);
            this.file = file2;
            this.depth = i2;
        }

        public int getDepth() {
            return this.depth;
        }

        public File getFile() {
            return this.file;
        }
    }

    protected DirectoryWalker() {
        this((FileFilter) null, -1);
    }

    protected DirectoryWalker(FileFilter fileFilter, int i2) {
        this.filter = fileFilter;
        this.depthLimit = i2;
    }

    protected DirectoryWalker(IOFileFilter iOFileFilter, IOFileFilter iOFileFilter2, int i2) {
        if (iOFileFilter == null && iOFileFilter2 == null) {
            this.filter = null;
        } else {
            this.filter = FileFilterUtils.or(FileFilterUtils.makeDirectoryOnly(iOFileFilter != null ? iOFileFilter : TrueFileFilter.TRUE), FileFilterUtils.makeFileOnly(iOFileFilter2 != null ? iOFileFilter2 : TrueFileFilter.TRUE));
        }
        this.depthLimit = i2;
    }

    private void walk(File file, int i2, Collection<T> collection) throws IOException {
        checkIfCancelled(file, i2, collection);
        if (handleDirectory(file, i2, collection)) {
            handleDirectoryStart(file, i2, collection);
            int i3 = i2 + 1;
            int i4 = this.depthLimit;
            if (i4 < 0 || i3 <= i4) {
                checkIfCancelled(file, i2, collection);
                FileFilter fileFilter = this.filter;
                File[] filterDirectoryContents = filterDirectoryContents(file, i2, fileFilter == null ? file.listFiles() : file.listFiles(fileFilter));
                if (filterDirectoryContents == null) {
                    handleRestricted(file, i3, collection);
                } else {
                    for (File file2 : filterDirectoryContents) {
                        if (file2.isDirectory()) {
                            walk(file2, i3, collection);
                        } else {
                            checkIfCancelled(file2, i3, collection);
                            handleFile(file2, i3, collection);
                            checkIfCancelled(file2, i3, collection);
                        }
                    }
                }
            }
            handleDirectoryEnd(file, i2, collection);
        }
        checkIfCancelled(file, i2, collection);
    }

    /* access modifiers changed from: protected */
    public final void checkIfCancelled(File file, int i2, Collection<T> collection) throws IOException {
        if (handleIsCancelled(file, i2, collection)) {
            throw new CancelException(file, i2);
        }
    }

    /* access modifiers changed from: protected */
    public File[] filterDirectoryContents(File file, int i2, File[] fileArr) throws IOException {
        return fileArr;
    }

    /* access modifiers changed from: protected */
    public void handleCancelled(File file, Collection<T> collection, CancelException cancelException) throws IOException {
        throw cancelException;
    }

    /* access modifiers changed from: protected */
    public boolean handleDirectory(File file, int i2, Collection<T> collection) throws IOException {
        return true;
    }

    /* access modifiers changed from: protected */
    public void handleDirectoryEnd(File file, int i2, Collection<T> collection) throws IOException {
    }

    /* access modifiers changed from: protected */
    public void handleDirectoryStart(File file, int i2, Collection<T> collection) throws IOException {
    }

    /* access modifiers changed from: protected */
    public void handleEnd(Collection<T> collection) throws IOException {
    }

    /* access modifiers changed from: protected */
    public void handleFile(File file, int i2, Collection<T> collection) throws IOException {
    }

    /* access modifiers changed from: protected */
    public boolean handleIsCancelled(File file, int i2, Collection<T> collection) throws IOException {
        return false;
    }

    /* access modifiers changed from: protected */
    public void handleRestricted(File file, int i2, Collection<T> collection) throws IOException {
    }

    /* access modifiers changed from: protected */
    public void handleStart(File file, Collection<T> collection) throws IOException {
    }

    /* access modifiers changed from: protected */
    public final void walk(File file, Collection<T> collection) throws IOException {
        if (file != null) {
            try {
                handleStart(file, collection);
                walk(file, 0, collection);
                handleEnd(collection);
            } catch (CancelException e2) {
                handleCancelled(file, collection, e2);
            }
        } else {
            throw new NullPointerException("Start Directory is null");
        }
    }
}
