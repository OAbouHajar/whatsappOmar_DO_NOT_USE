package X;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.print.PageRange;
import android.print.PrintAttributes;
import android.print.PrintDocumentAdapter;
import android.print.PrintDocumentInfo;
import android.print.pdf.PrintedPdfDocument;
import android.view.View;
import android.widget.TextView;
import com.obwhatsapp.R;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.3M8  reason: invalid class name */
public class AnonymousClass3M8 extends PrintDocumentAdapter {
    public Context A00;
    public PrintedPdfDocument A01;
    public final AnonymousClass4R5 A02;
    public final C17250um A03;
    public final String A04 = "join_whatsapp_group.pdf";
    public final String A05;

    public AnonymousClass3M8(Context context, AnonymousClass4R5 r3, C17250um r4, String str) {
        this.A00 = context;
        this.A03 = r4;
        this.A05 = str;
        this.A02 = r3;
    }

    public void onLayout(PrintAttributes printAttributes, PrintAttributes printAttributes2, CancellationSignal cancellationSignal, PrintDocumentAdapter.LayoutResultCallback layoutResultCallback, Bundle bundle) {
        this.A01 = new PrintedPdfDocument(this.A00, printAttributes2);
        if (cancellationSignal.isCanceled()) {
            layoutResultCallback.onLayoutCancelled();
        } else {
            layoutResultCallback.onLayoutFinished(new PrintDocumentInfo.Builder(this.A04).setContentType(0).setPageCount(1).build(), true);
        }
    }

    public void onWrite(PageRange[] pageRangeArr, ParcelFileDescriptor parcelFileDescriptor, CancellationSignal cancellationSignal, PrintDocumentAdapter.WriteResultCallback writeResultCallback) {
        PdfDocument.Page startPage = this.A01.startPage(0);
        Canvas canvas = startPage.getCanvas();
        Context context = this.A00;
        TextView textView = new TextView(context);
        textView.setTextSize(0, (float) (canvas.getWidth() / 25));
        textView.setGravity(1);
        textView.setText(AnonymousClass2Sy.A03(context, textView.getPaint(), this.A03, this.A05));
        int width = canvas.getWidth() >> 3;
        textView.measure(View.MeasureSpec.makeMeasureSpec(canvas.getWidth() - (width << 1), 1073741824), View.MeasureSpec.makeMeasureSpec(canvas.getHeight(), Integer.MIN_VALUE));
        textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
        canvas.translate((float) width, (float) (width >> 1));
        textView.draw(canvas);
        int i2 = -width;
        canvas.translate((float) i2, (float) (i2 >> 1));
        AnonymousClass4R5 r6 = this.A02;
        int i3 = r6.A01;
        int i4 = r6.A00;
        int A06 = AnonymousClass3K4.A06(canvas.getHeight(), textView.getMeasuredHeight(), canvas.getWidth());
        int i5 = A06 >> 3;
        int i6 = A06 - (i5 << 1);
        float f2 = (((float) i6) * 1.0f) / ((float) i3);
        canvas.translate((float) i5, (float) (i5 + textView.getMeasuredHeight()));
        Paint paint = new Paint();
        paint.setColor(-16777216);
        int i7 = 0;
        while (true) {
            if (i7 >= i3) {
                int i8 = (i6 << 2) / 15;
                int i9 = (i6 - i8) >> 1;
                int i10 = i8 + i9;
                canvas.drawBitmap(BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_qr_walogo), (Rect) null, new Rect(i9, i9, i10, i10), (Paint) null);
                this.A01.finishPage(startPage);
                PrintDocumentAdapter.WriteResultCallback writeResultCallback2 = writeResultCallback;
                try {
                    this.A01.writeTo(new FileOutputStream(parcelFileDescriptor.getFileDescriptor()));
                    this.A01.close();
                    this.A01 = null;
                    writeResultCallback2.onWriteFinished(new PageRange[]{new PageRange(0, 0)});
                    return;
                } catch (IOException e2) {
                    writeResultCallback2.onWriteFailed(e2.toString());
                    this.A01.close();
                    this.A01 = null;
                    return;
                } catch (Throwable th) {
                    this.A01.close();
                    this.A01 = null;
                    throw th;
                }
            } else {
                for (int i11 = 0; i11 < i4; i11++) {
                    if (r6.A02[i11][i7] == 1) {
                        canvas.drawRect(f2 * ((float) i7), f2 * ((float) i11), f2 * ((float) (i7 + 1)), f2 * ((float) (i11 + 1)), paint);
                    }
                }
                i7++;
            }
        }
    }
}
