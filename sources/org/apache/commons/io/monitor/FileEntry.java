package org.apache.commons.io.monitor;

import java.io.File;
import java.io.Serializable;

public class FileEntry implements Serializable {
    static final FileEntry[] EMPTY_ENTRIES = new FileEntry[0];
    private FileEntry[] children;
    private boolean directory;
    private boolean exists;
    private final File file;
    private long lastModified;
    private long length;
    private String name;
    private final FileEntry parent;

    public FileEntry(File file2) {
        this((FileEntry) null, file2);
    }

    public FileEntry(FileEntry fileEntry, File file2) {
        if (file2 != null) {
            this.file = file2;
            this.parent = fileEntry;
            this.name = file2.getName();
            return;
        }
        throw new IllegalArgumentException("File is missing");
    }

    public FileEntry[] getChildren() {
        FileEntry[] fileEntryArr = this.children;
        return fileEntryArr != null ? fileEntryArr : EMPTY_ENTRIES;
    }

    public File getFile() {
        return this.file;
    }

    public long getLastModified() {
        return this.lastModified;
    }

    public long getLength() {
        return this.length;
    }

    public int getLevel() {
        FileEntry fileEntry = this.parent;
        if (fileEntry == null) {
            return 0;
        }
        return fileEntry.getLevel() + 1;
    }

    public String getName() {
        return this.name;
    }

    public FileEntry getParent() {
        return this.parent;
    }

    public boolean isDirectory() {
        return this.directory;
    }

    public boolean isExists() {
        return this.exists;
    }

    public FileEntry newChildInstance(File file2) {
        return new FileEntry(this, file2);
    }

    public boolean refresh(File file2) {
        boolean z2 = this.exists;
        long j2 = this.lastModified;
        boolean z3 = this.directory;
        long j3 = this.length;
        this.name = file2.getName();
        boolean exists2 = file2.exists();
        this.exists = exists2;
        this.directory = exists2 ? file2.isDirectory() : false;
        long j4 = 0;
        this.lastModified = this.exists ? file2.lastModified() : 0;
        if (this.exists && !this.directory) {
            j4 = file2.length();
        }
        this.length = j4;
        return (this.exists == z2 && this.lastModified == j2 && this.directory == z3 && j4 == j3) ? false : true;
    }

    public void setChildren(FileEntry[] fileEntryArr) {
        this.children = fileEntryArr;
    }

    public void setDirectory(boolean z2) {
        this.directory = z2;
    }

    public void setExists(boolean z2) {
        this.exists = z2;
    }

    public void setLastModified(long j2) {
        this.lastModified = j2;
    }

    public void setLength(long j2) {
        this.length = j2;
    }

    public void setName(String str) {
        this.name = str;
    }
}
