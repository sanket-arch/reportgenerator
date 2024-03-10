package com.assesment.reportgenerator.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assesment.reportgenerator.helper.DownloadPdfReport;
import com.assesment.reportgenerator.helper.DownloadXLSReport;

@RestController
public class FileDownlaodController {

    @GetMapping("/download/pdf1")
    public String pdfReport1FileDownload() {

        DownloadPdfReport downloadPdf = new DownloadPdfReport();
        downloadPdf.downloadPdfReport1();

        return "pdf File downloading";
    }

    @GetMapping("/download/pdf2")
    public String pdfReport2FileDownload() {

        DownloadPdfReport downloadPdf = new DownloadPdfReport();
        downloadPdf.downloadPdfReport2();

        return "pdf File downloading";
    }
    
    @GetMapping("/download/xls1")
    public String xlsReport1FileDownload() {

       DownloadXLSReport downloadXLSReport=new DownloadXLSReport();
       downloadXLSReport.downloadXlsReport1();

        return "XLS File downloading";
    }

    @GetMapping("/download/xls2")
    public String xlsReport2FileDownload() {

       DownloadXLSReport downloadXLSReport=new DownloadXLSReport();
       downloadXLSReport.downloadXlsReport1();

        return "XLS File downloading";
    }
}
