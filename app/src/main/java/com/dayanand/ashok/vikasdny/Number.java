package com.dayanand.ashok.vikasdny;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.github.barteksc.pdfviewer.PDFView;

public class Number extends Activity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abcdo);
       PDFView  pdfView=(PDFView)findViewById(R.id.pdfViewo);
       pdfView.fromAsset("Age.pdf").load();
}
}
