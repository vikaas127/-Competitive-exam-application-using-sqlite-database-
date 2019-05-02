package com.dayanand.ashok.vikasdny;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.github.barteksc.pdfviewer.PDFView;

public class Pipeand extends Activity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abcdq);
      PDFView  pdfView=(PDFView)findViewById(R.id.pdfViewq);
pdfView.fromAsset("pipe.pdf").load();
}}
