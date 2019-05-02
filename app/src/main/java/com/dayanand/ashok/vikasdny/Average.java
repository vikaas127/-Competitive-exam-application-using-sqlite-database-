package com.dayanand.ashok.vikasdny;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.github.barteksc.pdfviewer.PDFView;

public class Average extends Activity {
    PDFView pdfView;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abcdb);

        PDFView pdfView = (PDFView) findViewById(R.id.pdfViewb);
        pdfView.fromAsset("avrg.pdf").load();
    }
}
