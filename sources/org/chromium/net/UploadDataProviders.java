package org.chromium.net;

import X.AnonymousClass000;
import X.C13690nt;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public final class UploadDataProviders {

    public final class ByteBufferUploadProvider extends UploadDataProvider {
        public final ByteBuffer mUploadBuffer;

        public ByteBufferUploadProvider(ByteBuffer byteBuffer) {
            this.mUploadBuffer = byteBuffer;
        }

        public long getLength() {
            return (long) this.mUploadBuffer.limit();
        }

        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            if (byteBuffer.hasRemaining()) {
                int remaining = byteBuffer.remaining();
                int remaining2 = this.mUploadBuffer.remaining();
                ByteBuffer byteBuffer2 = this.mUploadBuffer;
                if (remaining >= remaining2) {
                    byteBuffer.put(byteBuffer2);
                } else {
                    int limit = byteBuffer2.limit();
                    ByteBuffer byteBuffer3 = this.mUploadBuffer;
                    byteBuffer3.limit(byteBuffer3.position() + byteBuffer.remaining());
                    byteBuffer.put(this.mUploadBuffer);
                    this.mUploadBuffer.limit(limit);
                }
                throw AnonymousClass000.A0W("onReadSucceeded");
            }
            throw AnonymousClass000.A0V("Cronet passed a buffer with no bytes remaining");
        }

        public void rewind(UploadDataSink uploadDataSink) {
            this.mUploadBuffer.position(0);
            throw AnonymousClass000.A0W("onRewindSucceeded");
        }
    }

    public interface FileChannelProvider {
        FileChannel getChannel();
    }

    public final class FileUploadProvider extends UploadDataProvider {
        public volatile FileChannel mChannel;
        public final Object mLock;
        public final FileChannelProvider mProvider;

        public FileUploadProvider(FileChannelProvider fileChannelProvider) {
            this.mLock = C13690nt.A0Y();
            this.mProvider = fileChannelProvider;
        }

        public void close() {
            FileChannel fileChannel = this.mChannel;
            if (fileChannel != null) {
                fileChannel.close();
            }
        }

        public final FileChannel getChannel() {
            if (this.mChannel == null) {
                synchronized (this.mLock) {
                    if (this.mChannel == null) {
                        this.mChannel = this.mProvider.getChannel();
                    }
                }
            }
            return this.mChannel;
        }

        public long getLength() {
            return getChannel().size();
        }

        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            int read;
            if (byteBuffer.hasRemaining()) {
                FileChannel channel = getChannel();
                int i2 = 0;
                do {
                    read = channel.read(byteBuffer);
                    if (read == -1 || (i2 = i2 + read) != 0) {
                    }
                    read = channel.read(byteBuffer);
                    break;
                } while ((i2 = i2 + read) != 0);
                throw AnonymousClass000.A0W("onReadSucceeded");
            }
            throw AnonymousClass000.A0V("Cronet passed a buffer with no bytes remaining");
        }

        public void rewind(UploadDataSink uploadDataSink) {
            getChannel().position(0);
            throw AnonymousClass000.A0W("onRewindSucceeded");
        }
    }

    public static UploadDataProvider create(final ParcelFileDescriptor parcelFileDescriptor) {
        return new FileUploadProvider(new FileChannelProvider() {
            public FileChannel getChannel() {
                if (parcelFileDescriptor.getStatSize() != -1) {
                    return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor).getChannel();
                }
                parcelFileDescriptor.close();
                throw AnonymousClass000.A0T(AnonymousClass000.A0f(parcelFileDescriptor, AnonymousClass000.A0r("Not a file: ")));
            }
        });
    }

    public static UploadDataProvider create(final File file) {
        return new FileUploadProvider(new FileChannelProvider() {
            public FileChannel getChannel() {
                return new FileInputStream(file).getChannel();
            }
        });
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new ByteBufferUploadProvider(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }

    public static UploadDataProvider create(byte[] bArr, int i2, int i3) {
        return new ByteBufferUploadProvider(ByteBuffer.wrap(bArr, i2, i3).slice());
    }
}
