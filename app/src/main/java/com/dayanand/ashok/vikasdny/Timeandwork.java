package com.dayanand.ashok.vikasdny;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.github.barteksc.pdfviewer.PDFView;

public class Timeandwork extends Activity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abcdx);
      PDFView  pdfView=(PDFView)findViewById(R.id.pdfViewx);
pdfView.fromAsset("twf.pdf").load();
}}
