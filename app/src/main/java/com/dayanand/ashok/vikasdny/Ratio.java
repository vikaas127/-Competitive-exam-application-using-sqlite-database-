package com.dayanand.ashok.vikasdny;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.github.barteksc.pdfviewer.PDFView;

public class Ratio extends Activity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abcdt);
      PDFView  pdfView=(PDFView)findViewById(R.id.pdfViewt);
pdfView.fromAsset("ratio.pdf").load();
}}
