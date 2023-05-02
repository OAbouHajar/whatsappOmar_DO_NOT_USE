package com.mod.bomfab.colorpicker.palette;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import com.mod.bomfab.colorpicker.palette.ColorPickerSwatch;
import com.mod.bomfab.utils.Tools;

public class ColorPickerPalette extends TableLayout {
    private String mDescription;
    private String mDescriptionSelected;
    private int mMarginSize;
    private int mNumColumns;
    public ColorPickerSwatch.OnColorSelectedListener mOnColorSelectedListener;
    private int mSwatchLength;

    public ColorPickerPalette(Context context) {
        super(context);
    }

    public ColorPickerPalette(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void addSwatchToRow(TableRow tableRow, View view, int i2) {
        if (i2 % 2 == 0) {
            tableRow.addView(view);
        } else {
            tableRow.addView(view, 0);
        }
    }

    private ImageView createBlankSpace() {
        ImageView imageView = new ImageView(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(this.mSwatchLength, this.mSwatchLength);
        layoutParams.setMargins(this.mMarginSize, this.mMarginSize, this.mMarginSize, this.mMarginSize);
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }

    private ColorPickerSwatch createColorSwatch(int i2, int i3) {
        ColorPickerSwatch colorPickerSwatch = new ColorPickerSwatch(getContext(), i2, i2 == i3, this.mOnColorSelectedListener);
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(this.mSwatchLength, this.mSwatchLength);
        layoutParams.setMargins(this.mMarginSize, this.mMarginSize, this.mMarginSize, this.mMarginSize);
        colorPickerSwatch.setLayoutParams(layoutParams);
        return colorPickerSwatch;
    }

    private TableRow createTableRow() {
        TableRow tableRow = new TableRow(getContext());
        tableRow.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return tableRow;
    }

    private void setSwatchDescription(int i2, int i3, int i4, boolean z2, View view) {
        String format;
        if (i2 % 2 != 0) {
            i3 = ((i2 + 1) * this.mNumColumns) - i4;
        }
        if (z2) {
            format = String.format(this.mDescriptionSelected, new Object[]{new Integer(i3)});
        } else {
            format = String.format(this.mDescription, new Object[]{new Integer(i3)});
        }
        view.setContentDescription(format);
    }

    public void drawPalette(int[] iArr, int i2) {
        int i3;
        TableRow tableRow;
        if (iArr != null) {
            removeAllViews();
            int i4 = 0;
            TableRow createTableRow = createTableRow();
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (i4 < iArr.length) {
                int i8 = iArr[i4];
                i7++;
                ColorPickerSwatch createColorSwatch = createColorSwatch(i8, i2);
                setSwatchDescription(i5, i7, i6, i8 == i2, createColorSwatch);
                addSwatchToRow(createTableRow, createColorSwatch, i5);
                int i9 = i6 + 1;
                if (i9 == this.mNumColumns) {
                    addView(createTableRow);
                    i3 = i5 + 1;
                    tableRow = createTableRow();
                    i9 = 0;
                } else {
                    i3 = i5;
                    tableRow = createTableRow;
                }
                i4++;
                createTableRow = tableRow;
                i5 = i3;
                i6 = i9;
            }
            if (i6 > 0) {
                while (i6 != this.mNumColumns) {
                    addSwatchToRow(createTableRow, createBlankSpace(), i5);
                    i6++;
                }
                addView(createTableRow);
            }
        }
    }

    public void init(int i2, int i3, ColorPickerSwatch.OnColorSelectedListener onColorSelectedListener) {
        this.mNumColumns = i3;
        Resources resources = getResources();
        if (i2 == 1) {
            this.mSwatchLength = resources.getDimensionPixelSize(Tools.getID("color_swatch_large", "dimen"));
            this.mMarginSize = resources.getDimensionPixelSize(Tools.getID("color_swatch_margins_large", "dimen"));
        } else {
            this.mSwatchLength = resources.getDimensionPixelSize(Tools.getID("color_swatch_small", "dimen"));
            this.mMarginSize = resources.getDimensionPixelSize(Tools.getID("color_swatch_margins_small", "dimen"));
        }
        this.mOnColorSelectedListener = onColorSelectedListener;
        this.mDescription = Tools.getString("color_swatch_description");
        this.mDescriptionSelected = Tools.getString("color_swatch_description_selected");
    }
}
