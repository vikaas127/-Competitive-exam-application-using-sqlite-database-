package com.dayanand.ashok.vikasdny;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.github.barteksc.pdfviewer.PDFView;

public class Geometry2 extends Activity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abcdi);
      PDFView  pdfView=(PDFView)findViewById(R.id.pdfViewi);
pdfView.fromAsset("geos.pdf").load();
}}
