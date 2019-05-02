package com.dayanand.ashok.vikasdny;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.github.barteksc.pdfviewer.PDFView;

public class Lcmandhcf extends Activity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.abcdj);
        PDFView pdfView = (PDFView) findViewById(R.id.pdfViewj);
        pdfView.fromAsset("lcm.pdf").load();
    }}

